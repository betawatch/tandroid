package z6;

import android.content.Context;
import androidx.biometric.t;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class b {
    public static final b b;
    public t a;

    static {
        b bVar = new b();
        bVar.a = null;
        b = bVar;
    }

    public static t a(Context context) {
        t tVar;
        b bVar = b;
        synchronized (bVar) {
            try {
                if (bVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.a = new t(context, (byte) 0);
                }
                tVar = bVar.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
