package t8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import com.google.firebase.messaging.s;
import id.z0;
import java.util.concurrent.Executor;
import z8.q;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i implements z8.d, t {
    public static final i b = new i(0);
    public static final i c = new i(1);
    public static final i d = new i(2);
    public static final i e = new i(3);
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i10) {
        this.a = i10;
    }

    @Override // com.google.android.gms.common.api.internal.t
    public Exception a(Status status) {
        int i10 = status.a;
        int i11 = status.a;
        String str = status.b;
        if (i10 == 8) {
            if (str == null) {
                str = i8.j.a(i11);
            }
            return new s(str);
        }
        if (str == null) {
            str = i8.j.a(i11);
        }
        return new c(str);
    }

    @Override // z8.d
    public Object u0(af.h hVar) {
        switch (this.a) {
            case 0:
                Object b10 = hVar.b(new q(v8.a.class, Executor.class));
                kotlin.jvm.internal.j.d(b10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) b10);
            case 1:
                Object b11 = hVar.b(new q(v8.c.class, Executor.class));
                kotlin.jvm.internal.j.d(b11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) b11);
            case 2:
                Object b12 = hVar.b(new q(v8.b.class, Executor.class));
                kotlin.jvm.internal.j.d(b12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) b12);
            default:
                Object b13 = hVar.b(new q(v8.d.class, Executor.class));
                kotlin.jvm.internal.j.d(b13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) b13);
        }
    }
}
