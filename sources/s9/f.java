package s9;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements ra.b {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i10) {
        this.a = i10;
    }

    @Override // ra.b
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                return ExecutorsRegistrar.a();
            case 3:
                o oVar = ExecutorsRegistrar.a;
                return new t9.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new t9.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                o oVar2 = ExecutorsRegistrar.a;
                return new t9.f(Executors.newCachedThreadPool(new t9.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            default:
                o oVar3 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new t9.a("Firebase Scheduler", 0, null));
        }
    }
}
