package pb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.qt;
import sg.i0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class g {
    public static final Object b = new Object();
    public static g c;
    public u9.g a;

    public static g c() {
        g gVar;
        synchronized (b) {
            q6.m.i("MlKitContext has not been initialized", c != null);
            gVar = c;
            q6.m.g(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        g gVar;
        synchronized (b) {
            q6.m.i("MlKitContext is already initialized", c == null);
            g gVar2 = new g();
            c = gVar2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList b10 = new i0(4, context, new qt(MlKitComponentDiscoveryService.class, 20)).b();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            s0.b bVar = u9.e.B;
            arrayList.addAll(b10);
            arrayList2.add(u9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(u9.a.c(gVar2, g.class, new Class[0]));
            u9.g gVar3 = new u9.g(executor, arrayList, arrayList2, bVar);
            gVar2.a = gVar3;
            gVar3.h(true);
            gVar = c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        q6.m.i("MlKitContext has been deleted", c == this);
        q6.m.g(this.a);
        return this.a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
