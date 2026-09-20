package za;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import x7.d7;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class y implements s {
    public static final u e = new u();
    public static final m1.c f = w7.r.a(r.a);
    public final Context a;
    public final id.h b;
    public final AtomicReference c;
    public final d7 d;

    public y(Context context, id.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.a = context;
        this.b = hVar;
        this.c = new AtomicReference();
        e.getClass();
        n4.y yVar = new n4.y(((k1.a0) f.a(context, u.a[0]).b).c, new w(3, null));
        d7 d7Var = new d7();
        d7Var.a = yVar;
        d7Var.b = this;
        this.d = d7Var;
        zd.e0.q(zd.e0.b(hVar), new t(this, null, 0));
    }
}
