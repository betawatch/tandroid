// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vy implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fz b;

    public /* synthetic */ vy(fz fzVar, byte b) {
        this.a = b;
        this.b = fzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fz fzVar = this.b;
        switch (b) {
            case 0:
                fzVar.onBackPressed();
                break;
            default:
                fzVar.b1();
                break;
        }
    }
}
