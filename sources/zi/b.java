package zi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.qf;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                    qf qfVar = u0Var.d;
                    Objects.requireNonNull(qfVar);
                    handler.post(new v4.p(qfVar, 16));
                    break;
                }
                break;
        }
    }
}
