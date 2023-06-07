package io.fair_acc.sample;

import fxsampler.FXSamplerProject;

import java.util.ServiceLoader;

/**
 * @author Jiawei Mao
 * @version 0.0.1
 * @since 07 Jun 2023, 08:20
 */
public class TestLoader {

    public static void main(String[] args) {

        ServiceLoader<FXSamplerProject> loader = ServiceLoader.load(fxsampler.FXSamplerProject.class);
        for (FXSamplerProject project : loader) {
            System.out.println(project.getProjectName());
            System.out.println(project.getSampleBasePackage());
        }
    }
}
