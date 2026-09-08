package za;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class y implements s {
    public static final u e = new u();
    public static final m1.c f = w7.q.a(r.a);
    public final Context a;
    public final id.h b;
    public final AtomicReference c;
    public final o0.a d;

    public y(Context context, id.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.a = context;
        this.b = hVar;
        this.c = new AtomicReference();
        e.getClass();
        int i10 = 9;
        this.d = new o0.a(29, new n4.y(i10, ((k1.a0) f.a(context, u.a[0]).b).c, new w(3, null)), this);
        zd.e0.q(zd.e0.b(hVar), new t(this, null, 0));
    }
}
