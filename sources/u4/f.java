package u4;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class f {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
