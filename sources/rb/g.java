package rb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import k2.w0;
import qg.f0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class g {
    public static final Object b = new Object();
    public static g c;
    public r9.g a;

    public static g c() {
        g gVar;
        synchronized (b) {
            n6.l.j("MlKitContext has not been initialized", c != null);
            gVar = c;
            n6.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        g gVar;
        synchronized (b) {
            n6.l.j("MlKitContext is already initialized", c == null);
            g gVar2 = new g();
            c = gVar2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList S = new mi.q(19, context, new w0(MlKitComponentDiscoveryService.class, 19)).S();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            f0 f0Var = r9.e.A;
            arrayList.addAll(S);
            arrayList2.add(r9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(r9.a.c(gVar2, g.class, new Class[0]));
            r9.g gVar3 = new r9.g(executor, arrayList, arrayList2, f0Var);
            gVar2.a = gVar3;
            gVar3.h(true);
            gVar = c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        n6.l.j("MlKitContext has been deleted", c == this);
        n6.l.h(this.a);
        return this.a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
