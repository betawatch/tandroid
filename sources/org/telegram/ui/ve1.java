package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ af1 b;

    public /* synthetic */ ve1(af1 af1Var, int i10) {
        this.a = i10;
        this.b = af1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                af1 af1Var = this.b;
                af1Var.getClass();
                new sg.a1((org.telegram.ui.ActionBar.n2) af1Var, 11, false).show();
                break;
            default:
                af1 af1Var2 = this.b;
                af1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(af1Var2.e);
                break;
        }
    }
}
