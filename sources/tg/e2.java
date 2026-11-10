package tg;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
