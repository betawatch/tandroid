package u8;

import a5.j;
import a9.v;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import com.google.firebase.messaging.r;
import java.util.concurrent.Executor;
import jd.y0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h implements a9.e, t {
    public static final h b = new h(0);
    public static final h c = new h(1);
    public static final h d = new h(2);
    public static final h e = new h(3);
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i10) {
        this.a = i10;
    }

    @Override // a9.e
    public Object I0(j jVar) {
        switch (this.a) {
            case 0:
                Object d10 = jVar.d(new v(w8.a.class, Executor.class));
                kotlin.jvm.internal.j.d(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d10);
            case 1:
                Object d11 = jVar.d(new v(w8.c.class, Executor.class));
                kotlin.jvm.internal.j.d(d11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d11);
            case 2:
                Object d12 = jVar.d(new v(w8.b.class, Executor.class));
                kotlin.jvm.internal.j.d(d12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d12);
            default:
                Object d13 = jVar.d(new v(w8.d.class, Executor.class));
                kotlin.jvm.internal.j.d(d13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d13);
        }
    }

    @Override // com.google.android.gms.common.api.internal.t
    public Exception a(Status status) {
        int i10 = status.a;
        int i11 = status.a;
        String str = status.b;
        if (i10 == 8) {
            if (str == null) {
                str = j8.j.a(i11);
            }
            return new r(str);
        }
        if (str == null) {
            str = j8.j.a(i11);
        }
        return new c(str);
    }
}
