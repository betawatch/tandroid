package va;

import bi.u6;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import m9.b;
import m9.c;
import q9.d;
import q9.r;
import zd.y0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a implements d {
    public static final a b = new a(0);
    public static final a c = new a(1);
    public static final a d = new a(2);
    public static final a e = new a(3);
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // q9.d
    public final Object P1(u6 u6Var) {
        switch (this.a) {
            case 0:
                Object h = u6Var.h(new r(m9.a.class, Executor.class));
                i.d(h, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h);
            case 1:
                Object h10 = u6Var.h(new r(c.class, Executor.class));
                i.d(h10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h10);
            case 2:
                Object h11 = u6Var.h(new r(b.class, Executor.class));
                i.d(h11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h11);
            default:
                Object h12 = u6Var.h(new r(m9.d.class, Executor.class));
                i.d(h12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h12);
        }
    }
}
