package wa;

import be.z0;
import com.google.android.gms.internal.cast.z5;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import n9.b;
import n9.c;
import r9.d;
import r9.r;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
    public final Object j2(z5 z5Var) {
        switch (this.a) {
            case 0:
                Object c10 = z5Var.c(new r(n9.a.class, Executor.class));
                i.d(c10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c10);
            case 1:
                Object c11 = z5Var.c(new r(c.class, Executor.class));
                i.d(c11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c11);
            case 2:
                Object c12 = z5Var.c(new r(b.class, Executor.class));
                i.d(c12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c12);
            default:
                Object c13 = z5Var.c(new r(n9.d.class, Executor.class));
                i.d(c13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c13);
        }
    }
}
