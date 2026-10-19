package w6;

import android.content.Context;
import l5.j;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class b {
    public static final b b;
    public j a;

    static {
        b bVar = new b();
        bVar.a = null;
        b = bVar;
    }

    public static j a(Context context) {
        j jVar;
        b bVar = b;
        synchronized (bVar) {
            try {
                if (bVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.a = new j(context, 3);
                }
                jVar = bVar.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }
}
