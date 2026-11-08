package u4;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class f {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
