package u4;

import android.view.Choreographer;
import bg.y;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class e {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new y(runnable, 1));
    }
}
