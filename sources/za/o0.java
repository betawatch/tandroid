package za;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class o0 implements Application.ActivityLifecycleCallbacks {
    public static final o0 a = new o0();
    public static boolean b;
    public static ni.f c;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        ni.f fVar = c;
        if (fVar != null) {
            fVar.N(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        gd.i iVar;
        kotlin.jvm.internal.i.e(activity, "activity");
        ni.f fVar = c;
        if (fVar != null) {
            fVar.N(1);
            iVar = gd.i.a;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.i.e(activity, "activity");
        kotlin.jvm.internal.i.e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }
}
