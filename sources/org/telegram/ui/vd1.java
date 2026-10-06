package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ee1 b;

    public /* synthetic */ vd1(ee1 ee1Var, int i10) {
        this.a = i10;
        this.b = ee1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c(false);
                break;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                break;
            default:
                this.b.c(false);
                break;
        }
    }
}
