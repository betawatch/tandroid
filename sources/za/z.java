package za;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class z implements s {
    public static final u e = new u();
    public static final m1.c f = w7.r.a(r.a);
    public final Context a;
    public final id.h b;
    public final AtomicReference c;
    public final y d;

    public z(Context context, id.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.a = context;
        this.b = hVar;
        this.c = new AtomicReference();
        e.getClass();
        boolean z10 = false;
        this.d = new y(new of.b(((k1.a0) f.a(context, u.a[0]).b).c, new w(3, null), z10, 8), this);
        zd.e0.q(zd.e0.b(hVar), new t(this, null, 0));
    }
}
