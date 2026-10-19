package r4;

import android.view.Choreographer;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public abstract class g {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new f(runnable, 0));
    }
}
