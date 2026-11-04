package y6;

import android.content.Context;
import androidx.emoji2.text.n;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b {
    public static final b b;
    public n a;

    static {
        b bVar = new b();
        bVar.a = null;
        b = bVar;
    }

    public static n a(Context context) {
        n nVar;
        b bVar = b;
        synchronized (bVar) {
            try {
                if (bVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.a = new n(context, (char) 0);
                }
                nVar = bVar.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }
}
