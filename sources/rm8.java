// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rm8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wm8 b;

    public /* synthetic */ rm8(wm8 wm8Var, byte b) {
        this.a = b;
        this.b = wm8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wm8 wm8Var = this.b;
        switch (b) {
            case 0:
                dk2 dk2Var = wm8Var.h;
                if (dk2Var != null) {
                    dk2Var.close();
                    break;
                }
                break;
            default:
                wm8Var.a();
                break;
        }
    }
}
