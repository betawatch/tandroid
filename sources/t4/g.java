package t4;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class g {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
