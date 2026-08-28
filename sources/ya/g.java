package ya;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g {
    public static final Object b = new Object();
    public static g c;
    public y8.g a;

    public static g c() {
        g gVar;
        synchronized (b) {
            x5.l.j("MlKitContext has not been initialized", c != null);
            gVar = c;
            x5.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        g gVar;
        synchronized (b) {
            x5.l.j("MlKitContext is already initialized", c == null);
            g gVar2 = new g();
            c = gVar2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList e10 = new w4.e(12, context, new na.e(MlKitComponentDiscoveryService.class)).e();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            v0.l lVar = y8.e.z;
            arrayList.addAll(e10);
            arrayList2.add(y8.a.c(context, Context.class, new Class[0]));
            arrayList2.add(y8.a.c(gVar2, g.class, new Class[0]));
            y8.g gVar3 = new y8.g(executor, arrayList, arrayList2, lVar);
            gVar2.a = gVar3;
            gVar3.d(true);
            gVar = c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        x5.l.j("MlKitContext has been deleted", c == this);
        x5.l.h(this.a);
        return this.a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
