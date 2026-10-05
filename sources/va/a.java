package va;

import cf.c;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import m9.b;
import q9.d;
import q9.r;
import zd.y0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
    public final Object E(c cVar) {
        switch (this.a) {
            case 0:
                Object g10 = cVar.g(new r(m9.a.class, Executor.class));
                i.d(g10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) g10);
            case 1:
                Object g11 = cVar.g(new r(m9.c.class, Executor.class));
                i.d(g11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) g11);
            case 2:
                Object g12 = cVar.g(new r(b.class, Executor.class));
                i.d(g12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) g12);
            default:
                Object g13 = cVar.g(new r(m9.d.class, Executor.class));
                i.d(g13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) g13);
        }
    }
}
