package com.sagnak;

import android.app.Application;
import com.sagnak.service.WelcomeModule;
import dagger.ObjectGraph;

public class App extends Application {

    private ObjectGraph objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();

        initObjectGraph();
    }

    private void initObjectGraph() {
        objectGraph = ObjectGraph.create(new WelcomeModule());
    }

    public ObjectGraph getObjectGraph() {
        return this.objectGraph;
    }

}
