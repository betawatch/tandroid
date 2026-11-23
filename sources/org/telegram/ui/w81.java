package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w91 b;

    public /* synthetic */ w81(w91 w91Var, int i7) {
        this.a = i7;
        this.b = w91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w91 w91Var = this.b;
                w91Var.B0();
                w91Var.F0();
                break;
            case 1:
                this.b.B0();
                break;
            case 2:
                this.b.S0(true);
                break;
            case 3:
                this.b.finishPreviewFragment();
                break;
            case 4:
                w91 w91Var2 = this.b;
                w91Var2.B0 = null;
                w91Var2.Z0(true, false);
                break;
            default:
                w91 w91Var3 = this.b;
                w91Var3.O.postOnAnimation(new w81(w91Var3, 1));
                break;
        }
    }
}
