package io.github.weijunfu;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 *
 * @title  : 
 * @author : ijunfu <ijunfu@163.com>
 * @date   : 2024/7/12 15:02
 * @version: 1.0
 * @motto  : 简洁的代码是智慧的结晶 卓越的编码是对复杂性的优雅征服
 *
 */
@Mojo(name="fuTimeMavenPlugin", defaultPhase = LifecyclePhase.PROCESS_RESOURCES)
public class FuTimeMavenPlugin extends AbstractMojo {

    @Parameter(defaultValue = "yyyyMMddHHmm")
    private String pattern;

    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    private MavenProject mavenProject;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        String dateStr = LocalDateTime.now(ZoneId.systemDefault())
                .format(DateTimeFormatter.ofPattern(pattern));

        mavenProject.getProperties().setProperty("fu.time", dateStr);

        getLog().info("FuTime is: " + dateStr);
    }
}
