package y8;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements x9.b {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i9) {
        this.a = i9;
    }

    @Override // x9.b
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                return ExecutorsRegistrar.a();
            case 3:
                n nVar = ExecutorsRegistrar.a;
                return new z8.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new z8.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                n nVar2 = ExecutorsRegistrar.a;
                return new z8.f(Executors.newCachedThreadPool(new z8.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            default:
                n nVar3 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new z8.a("Firebase Scheduler", 0, null));
        }
    }
}
