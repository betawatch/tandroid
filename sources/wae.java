// default package

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class wae {
    public static final he6 i = new he6("ClientCastAnalytics", null);
    public static final boolean j = true;
    public final baa a;
    public final pid b;
    public final ibd c;
    public Long e;
    public g5c g;
    public byte h = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public wae(Context context, qa4 qa4Var, baa baaVar, pid pidVar, ibd ibdVar) {
        this.a = baaVar;
        this.b = pidVar;
        this.c = ibdVar;
    }

    public final void a(final p8f p8fVar, final int i2) {
        this.f.execute(new Runnable() { // from class: n3e
            /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                p90 p90Var;
                g5c g5cVar;
                n8f n = p8f.n(p8fVar);
                wae waeVar = wae.this;
                String str = waeVar.d;
                n.c();
                p8f.v((p8f) n.b, str);
                n.c();
                p8f.w((p8f) n.b, str);
                Long l = waeVar.e;
                if (l != null) {
                    int longValue = (int) l.longValue();
                    n.c();
                    p8f.x((p8f) n.b, longValue);
                }
                p8f p8fVar2 = (p8f) n.a();
                byte b = waeVar.h;
                int i3 = b - 1;
                p90 p90Var2 = null;
                if (b == 0) {
                    throw null;
                }
                short s = i2;
                if (i3 != 0) {
                    if (i3 == 1) {
                        p90Var = new p90(Integer.valueOf(s - 1), p8fVar2, pm8.a, null);
                    }
                    wae.i.b("analytics event: %s", p90Var2);
                    xve.h(p90Var2);
                    g5cVar = waeVar.g;
                    if (g5cVar == null) {
                        g5cVar.a(p90Var2, new grb((byte) 10));
                        return;
                    }
                    return;
                }
                p90Var = new p90(Integer.valueOf(s - 1), p8fVar2, pm8.b, null);
                p90Var2 = p90Var;
                wae.i.b("analytics event: %s", p90Var2);
                xve.h(p90Var2);
                g5cVar = waeVar.g;
                if (g5cVar == null) {
                }
            }
        });
    }
}
