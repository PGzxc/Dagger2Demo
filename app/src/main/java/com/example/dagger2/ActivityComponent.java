package com.example.dagger2;

import dagger.Component;

/**
 *  子的Component
 */
@PerActivity  // ActivityMoudule 中使用了该标记
@Component(dependencies = AppComponent.class,modules = ActivityMoudule.class)
public interface ActivityComponent {
    // 注入
    void inject(MainActivity activity);
}
