package s8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import com.google.firebase.messaging.s;
import hd.z0;
import java.util.concurrent.Executor;
import y8.r;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i implements y8.d, t {
    public static final i b = new i(0);
    public static final i c = new i(1);
    public static final i d = new i(2);
    public static final i e = new i(3);
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i9) {
        this.a = i9;
    }

    @Override // y8.d
    public Object H1(b3.b bVar) {
        switch (this.a) {
            case 0:
                Object c10 = bVar.c(new r(u8.a.class, Executor.class));
                kotlin.jvm.internal.i.d(c10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c10);
            case 1:
                Object c11 = bVar.c(new r(u8.c.class, Executor.class));
                kotlin.jvm.internal.i.d(c11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c11);
            case 2:
                Object c12 = bVar.c(new r(u8.b.class, Executor.class));
                kotlin.jvm.internal.i.d(c12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c12);
            default:
                Object c13 = bVar.c(new r(u8.d.class, Executor.class));
                kotlin.jvm.internal.i.d(c13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c13);
        }
    }

    @Override // com.google.android.gms.common.api.internal.t
    public Exception a(Status status) {
        int i9 = status.a;
        int i10 = status.a;
        String str = status.b;
        if (i9 == 8) {
            if (str == null) {
                str = h8.j.a(i10);
            }
            return new s(str);
        }
        if (str == null) {
            str = h8.j.a(i10);
        }
        return new c(str);
    }
}
