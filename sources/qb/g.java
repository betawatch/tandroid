package qb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import k2.g0;
import n7.z0;
import org.telegram.ui.sw0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
            ArrayList u10 = new z0(11, context, new g0(MlKitComponentDiscoveryService.class, 16)).u();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            sw0 sw0Var = q9.e.A;
            arrayList.addAll(u10);
            arrayList2.add(q9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(q9.a.c(gVar2, g.class, new Class[0]));
            q9.g gVar3 = new q9.g(executor, arrayList, arrayList2, sw0Var);
            gVar2.a = gVar3;
            gVar3.e(true);
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
