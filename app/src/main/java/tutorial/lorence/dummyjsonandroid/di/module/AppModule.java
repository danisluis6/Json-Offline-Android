package tutorial.lorence.dummyjsonandroid.di.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import tutorial.lorence.dummyjsonandroid.app.Application;

/**
 * Created by vuongluis on 4/14/2018.
 *
 * @author vuongluis
 * @version 0.0.1
 */

@Module
public class AppModule {

    private Application mApplication;
    private Context mContext;

    public AppModule(Application application, Context context) {
        this.mApplication = application;
        this.mContext = context;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return mContext;
    }
}
