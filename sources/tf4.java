// default package

import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tf4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tf4(Object obj, boolean z, boolean z2, boolean z3, byte b) {
        this.a = b;
        this.e = obj;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cyc cycVar;
        hyc hycVar;
        switch (this.a) {
            case 0:
                uf4 uf4Var = (uf4) this.e;
                boolean z = this.b;
                boolean z2 = this.c;
                boolean z3 = this.d;
                if (z) {
                    xf4 xf4Var = uf4Var.K;
                    xf4Var.a = true;
                    xf4Var.b = true;
                }
                if (z2) {
                    uf4Var.y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z3 || Math.abs(uf4Var.b0 - currentTimeMillis) > 30) {
                    uf4Var.b0 = currentTimeMillis;
                    uf4Var.e0.run();
                    break;
                }
                break;
            default:
                z zVar = (z) this.e;
                boolean z4 = this.b;
                boolean z5 = this.c;
                boolean z6 = this.d;
                if (!zVar.A && (cycVar = zVar.R) != null && (hycVar = cycVar.g) != null && hycVar.w && !hycVar.x) {
                    hycVar.l(z4, z5, z6);
                    break;
                }
                break;
        }
    }
}
