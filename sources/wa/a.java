package wa;

import be.z0;
import com.google.android.gms.internal.cast.z5;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import n9.b;
import n9.c;
import r9.d;
import r9.r;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                Object e7 = z5Var.e(new r(n9.a.class, Executor.class));
                i.d(e7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) e7);
            case 1:
                Object e10 = z5Var.e(new r(c.class, Executor.class));
                i.d(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) e10);
            case 2:
                Object e11 = z5Var.e(new r(b.class, Executor.class));
                i.d(e11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) e11);
            default:
                Object e12 = z5Var.e(new r(n9.d.class, Executor.class));
                i.d(e12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) e12);
        }
    }
}
