package za;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import w3.b0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g {
    public static final Object b = new Object();
    public static g c;
    public z8.f a;

    public static g c() {
        g gVar;
        synchronized (b) {
            y5.l.j("MlKitContext has not been initialized", c != null);
            gVar = c;
            y5.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        g gVar;
        synchronized (b) {
            y5.l.j("MlKitContext is already initialized", c == null);
            g gVar2 = new g();
            c = gVar2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList i10 = new b0(13, context, new m5.o(MlKitComponentDiscoveryService.class, 27)).i();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            u3.k kVar = z8.e.z;
            arrayList.addAll(i10);
            arrayList2.add(z8.a.c(context, Context.class, new Class[0]));
            arrayList2.add(z8.a.c(gVar2, g.class, new Class[0]));
            z8.f fVar = new z8.f(executor, arrayList, arrayList2, kVar);
            gVar2.a = fVar;
            fVar.f(true);
            gVar = c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        y5.l.j("MlKitContext has been deleted", c == this);
        y5.l.h(this.a);
        return this.a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
