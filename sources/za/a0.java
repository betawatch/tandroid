package za;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class a0 implements t {
    public static final v e = new v();
    public static final m1.c f = w7.p.a(s.a);
    public final Context a;
    public final jd.h b;
    public final AtomicReference c;
    public final z d;

    public a0(Context context, jd.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.a = context;
        this.b = hVar;
        this.c = new AtomicReference();
        e.getClass();
        boolean z10 = false;
        this.d = new z(new pf.b(((k1.a0) f.a(context, v.a[0]).b).c, new x(3, null), z10, 13), this);
        ae.g0.q(ae.g0.b(hVar), new u(this, null, 0));
    }
}
