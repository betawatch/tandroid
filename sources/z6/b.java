package z6;

import android.content.Context;
import androidx.biometric.t;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                    bVar.a = new t(context, 4);
                }
                tVar = bVar.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
