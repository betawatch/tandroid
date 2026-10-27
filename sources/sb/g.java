package sb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g {
    public static final Object b = new Object();
    public static g c;
    public s9.h a;

    public static g c() {
        g gVar;
        synchronized (b) {
            o6.l.j("MlKitContext has not been initialized", c != null);
            gVar = c;
            o6.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        g gVar;
        synchronized (b) {
            o6.l.j("MlKitContext is already initialized", c == null);
            g gVar2 = new g();
            c = gVar2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList k10 = new m4.c(19, context, new hb.e(MlKitComponentDiscoveryService.class)).k();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            s0.b bVar = s9.e.A;
            arrayList.addAll(k10);
            arrayList2.add(s9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(s9.a.c(gVar2, g.class, new Class[0]));
            s9.h hVar = new s9.h(executor, arrayList, arrayList2, bVar);
            gVar2.a = hVar;
            hVar.e(true);
            gVar = c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        o6.l.j("MlKitContext has been deleted", c == this);
        o6.l.h(this.a);
        return this.a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
