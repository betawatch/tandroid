package za;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class a0 implements u {
    public static final w e = new w();
    public static final m1.c f = w7.q.a(t.a);
    public final Context a;
    public final id.h b;
    public final AtomicReference c;
    public final o0.a d;

    public a0(Context context, id.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.a = context;
        this.b = hVar;
        this.c = new AtomicReference();
        e.getClass();
        int i10 = 9;
        this.d = new o0.a(29, new n4.y(i10, ((k1.a0) f.a(context, w.a[0]).b).c, new y(3, null)), this);
        zd.e0.q(zd.e0.b(hVar), new v(this, null, 0));
    }
}
