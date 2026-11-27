// default package

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class xbd {
    public final Context a;
    public final String b;
    public final kad c;
    public final ld1 d;
    public final hhd e;

    public xbd(Context context, ld1 ld1Var, hhd hhdVar) {
        String u;
        boolean isEmpty = DesugarCollections.unmodifiableList(ld1Var.b).isEmpty();
        String str = ld1Var.a;
        if (isEmpty) {
            u = bvd.a(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(ld1Var.b);
            if (str == null) {
                lq5.j("applicationId cannot be null");
                throw null;
            }
            if (unmodifiableList == null) {
                lq5.j("namespaces cannot be null");
                throw null;
            }
            u = k7b.u(new k7b(str, unmodifiableList));
        }
        this.c = new kad(this);
        this.a = context.getApplicationContext();
        xve.f(u);
        this.b = u;
        this.d = ld1Var;
        this.e = hhdVar;
    }
}
