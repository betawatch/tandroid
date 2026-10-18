package r4;

import android.view.Choreographer;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class g {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new f(runnable, 0));
    }
}
