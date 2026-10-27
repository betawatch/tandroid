package xa;

import a8.me;
import ce.z0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import o9.b;
import o9.c;
import s9.d;
import s9.s;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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

    @Override // s9.d
    public final Object d1(me meVar) {
        switch (this.a) {
            case 0:
                Object n10 = meVar.n(new s(o9.a.class, Executor.class));
                i.d(n10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) n10);
            case 1:
                Object n11 = meVar.n(new s(c.class, Executor.class));
                i.d(n11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) n11);
            case 2:
                Object n12 = meVar.n(new s(b.class, Executor.class));
                i.d(n12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) n12);
            default:
                Object n13 = meVar.n(new s(o9.d.class, Executor.class));
                i.d(n13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) n13);
        }
    }
}
