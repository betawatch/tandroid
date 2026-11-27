// default package

import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qf4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qf4(Object obj, boolean z, boolean z2, boolean z3, byte b) {
        this.a = b;
        this.e = obj;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q0d q0dVar;
        v0d v0dVar;
        switch (this.a) {
            case 0:
                rf4 rf4Var = (rf4) this.e;
                boolean z = this.b;
                boolean z2 = this.c;
                boolean z3 = this.d;
                if (z) {
                    uf4 uf4Var = rf4Var.K;
                    uf4Var.a = true;
                    uf4Var.b = true;
                }
                if (z2) {
                    rf4Var.y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z3 || Math.abs(rf4Var.b0 - currentTimeMillis) > 30) {
                    rf4Var.b0 = currentTimeMillis;
                    rf4Var.e0.run();
                    break;
                }
                break;
            default:
                z zVar = (z) this.e;
                boolean z4 = this.b;
                boolean z5 = this.c;
                boolean z6 = this.d;
                if (!zVar.A && (q0dVar = zVar.R) != null && (v0dVar = q0dVar.g) != null && v0dVar.w && !v0dVar.x) {
                    v0dVar.l(z4, z5, z6);
                    break;
                }
                break;
        }
    }
}
