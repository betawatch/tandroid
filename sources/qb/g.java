package qb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import k2.u;
import org.telegram.ui.js0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class g {
    public static final Object b = new Object();
    public static g c;
    public q9.g a;

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
            ArrayList g10 = new o0.a(12, context, new u(MlKitComponentDiscoveryService.class, 19)).g();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            js0 js0Var = q9.e.A;
            arrayList.addAll(g10);
            arrayList2.add(q9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(q9.a.c(gVar2, g.class, new Class[0]));
            q9.g gVar3 = new q9.g(executor, arrayList, arrayList2, js0Var);
            gVar2.a = gVar3;
            gVar3.g(true);
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
