package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
