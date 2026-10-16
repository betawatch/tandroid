package wa;

import be.z0;
import com.google.android.gms.internal.cast.z5;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import n9.b;
import n9.c;
import r9.d;
import r9.r;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
    public final Object n2(z5 z5Var) {
        switch (this.a) {
            case 0:
                Object d10 = z5Var.d(new r(n9.a.class, Executor.class));
                i.d(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) d10);
            case 1:
                Object d11 = z5Var.d(new r(c.class, Executor.class));
                i.d(d11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) d11);
            case 2:
                Object d12 = z5Var.d(new r(b.class, Executor.class));
                i.d(d12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) d12);
            default:
                Object d13 = z5Var.d(new r(n9.d.class, Executor.class));
                i.d(d13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) d13);
        }
    }
}
