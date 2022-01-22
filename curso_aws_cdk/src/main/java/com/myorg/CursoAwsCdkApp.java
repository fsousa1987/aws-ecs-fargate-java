package com.myorg;

import software.amazon.awscdk.App;

public class CursoAwsCdkApp {
    public static void main(final String[] args) {
        App app = new App();

        VpcStack vpcStack = new VpcStack(app, "Vpc-github");

        ClusterStack clusterStack = new ClusterStack(app, "Cluster-github", vpcStack.getVpc());
        clusterStack.addDependency(vpcStack);

        app.synth();
    }
}

