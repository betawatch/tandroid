package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cj0 b;

    public /* synthetic */ wi0(cj0 cj0Var, int i10) {
        this.a = i10;
        this.b = cj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                this.b.U(true, false);
                break;
            default:
                this.b.U(true, false);
                break;
        }
    }
}
