package zi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.of;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ n0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ b(k kVar, n0 n0Var, long j3, int i7) {
        this.a = i7;
        this.b = kVar;
        this.c = n0Var;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                kVar.c.post(new b(kVar, this.c, this.d, 1));
                break;
            default:
                k kVar2 = this.b;
                n0 n0Var = this.c;
                long j3 = this.d;
                if (kVar2.U && kVar2.F == n0Var) {
                    kVar2.j.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.z(j3));
                    u0 u0Var = (u0) kVar2.k.a;
                    Handler handler = u0Var.i;
                    of ofVar = u0Var.d;
                    Objects.requireNonNull(ofVar);
                    handler.post(new v4.p(ofVar, 16));
                    break;
                }
                break;
        }
    }
}
