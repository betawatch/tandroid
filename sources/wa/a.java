package wa;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import n9.b;
import n9.c;
import r9.d;
import r9.r;
import td.y0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    @Override // r9.d
    public final Object K(bh.d dVar) {
        switch (this.a) {
            case 0:
                Object d10 = dVar.d(new r(n9.a.class, Executor.class));
                i.d(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d10);
            case 1:
                Object d11 = dVar.d(new r(c.class, Executor.class));
                i.d(d11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d11);
            case 2:
                Object d12 = dVar.d(new r(b.class, Executor.class));
                i.d(d12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d12);
            default:
                Object d13 = dVar.d(new r(n9.d.class, Executor.class));
                i.d(d13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d13);
        }
    }
}
