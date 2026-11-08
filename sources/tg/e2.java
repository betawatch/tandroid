package tg;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;

    public /* synthetic */ e2(i2 i2Var, int i7) {
        this.a = i7;
        this.b = i2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                org.telegram.messenger.g0.h3(new e2(this.b, 0));
                break;
            case 2:
                this.b.dismiss();
                break;
            default:
                i2 i2Var = this.b;
                ai.i iVar = i2Var.H;
                if (iVar != null) {
                    iVar.a(null);
                    i2Var.H = null;
                }
                i2Var.dismiss();
                break;
        }
    }
}
