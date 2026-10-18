package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class th0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oi0 b;

    public /* synthetic */ th0(oi0 oi0Var, int i10) {
        this.a = i10;
        this.b = oi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                oi0 oi0Var = this.b;
                oi0Var.getClass();
                wh.f.f(false);
                wh.f fVar = oi0Var.i0;
                if (fVar != null) {
                    fVar.b(oi0Var.F);
                }
                AndroidUtilities.runOnUIThread(new th0(oi0Var, 0));
                break;
            case 2:
                wh.f.f(false);
                oi0 oi0Var2 = this.b;
                wh.f fVar2 = oi0Var2.i0;
                if (fVar2 != null) {
                    fVar2.b(oi0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new th0(oi0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
