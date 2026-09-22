package r4;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class f {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
