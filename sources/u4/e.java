package u4;

import android.view.Choreographer;
import bg.y;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class e {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new y(runnable, 1));
    }
}
