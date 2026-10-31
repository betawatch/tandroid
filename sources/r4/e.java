package r4;

import android.view.Choreographer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class e {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new jf.b(runnable, 2));
    }
}
