package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pi0 b;

    public /* synthetic */ uh0(pi0 pi0Var, int i10) {
        this.a = i10;
        this.b = pi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                pi0 pi0Var = this.b;
                pi0Var.getClass();
                xh.f.f(false);
                xh.f fVar = pi0Var.h0;
                if (fVar != null) {
                    fVar.b(pi0Var.E);
                }
                AndroidUtilities.runOnUIThread(new uh0(pi0Var, 0));
                break;
            case 2:
                xh.f.f(false);
                pi0 pi0Var2 = this.b;
                xh.f fVar2 = pi0Var2.h0;
                if (fVar2 != null) {
                    fVar2.b(pi0Var2.E);
                }
                AndroidUtilities.runOnUIThread(new uh0(pi0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
