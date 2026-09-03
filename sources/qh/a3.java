package qh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c3 b;

    public /* synthetic */ a3(c3 c3Var, int i10) {
        this.a = i10;
        this.b = c3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                super/*org.telegram.ui.ActionBar.h3*/.dismiss();
                break;
        }
    }
}
