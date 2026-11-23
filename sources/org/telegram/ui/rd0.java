package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce0 b;

    public /* synthetic */ rd0(ce0 ce0Var, int i7) {
        this.a = i7;
        this.b = ce0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ce0 ce0Var = this.b;
                ae0 ae0Var = ce0Var.a;
                de0 de0Var = ce0Var.h0;
                ae0 ae0Var2 = ce0Var.b;
                if (ae0Var2 != null) {
                    if (de0Var.d0) {
                        ae0Var.clearFocus();
                        ae0Var2.clearFocus();
                    } else if (ae0Var.length() != 0) {
                        ae0Var2.requestFocus();
                        if (!ce0Var.U) {
                            ae0Var2.setSelection(ae0Var2.length());
                        }
                        de0.b1(de0Var, ae0Var2);
                    } else {
                        ae0Var.requestFocus();
                        de0.b1(de0Var, ae0Var);
                    }
                }
                if (de0Var.G == 0) {
                    ce0Var.s();
                    break;
                }
                break;
            case 1:
                ce0 ce0Var2 = this.b;
                ce0Var2.postDelayed(new rd0(ce0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.t(true);
                break;
            default:
                ce0 ce0Var3 = this.b;
                de0.b1(ce0Var3.h0, ce0Var3.b);
                break;
        }
    }
}
