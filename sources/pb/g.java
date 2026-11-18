package pb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.ui.Cells.b5;
import r0.f1;
import sg.h0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class g {
    public static final Object b = new Object();
    public static g c;
    public u9.f a;

    public static g c() {
        g gVar;
        synchronized (b) {
            q6.m.j("MlKitContext has not been initialized", c != null);
            gVar = c;
            q6.m.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        g gVar;
        synchronized (b) {
            q6.m.j("MlKitContext is already initialized", c == null);
            g gVar2 = new g();
            c = gVar2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList b10 = new h0(4, context, new b5(MlKitComponentDiscoveryService.class)).b();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            f1 f1Var = u9.e.B;
            arrayList.addAll(b10);
            arrayList2.add(u9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(u9.a.c(gVar2, g.class, new Class[0]));
            u9.f fVar = new u9.f(executor, arrayList, arrayList2, f1Var);
            gVar2.a = fVar;
            fVar.g(true);
            gVar = c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        q6.m.j("MlKitContext has been deleted", c == this);
        q6.m.h(this.a);
        return this.a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
