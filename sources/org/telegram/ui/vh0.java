package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qi0 b;

    public /* synthetic */ vh0(qi0 qi0Var, int i10) {
        this.a = i10;
        this.b = qi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                qi0 qi0Var = this.b;
                qi0Var.getClass();
                wh.f.f(false);
                wh.f fVar = qi0Var.h0;
                if (fVar != null) {
                    fVar.b(qi0Var.E);
                }
                AndroidUtilities.runOnUIThread(new vh0(qi0Var, 0));
                break;
            case 2:
                wh.f.f(false);
                qi0 qi0Var2 = this.b;
                wh.f fVar2 = qi0Var2.h0;
                if (fVar2 != null) {
                    fVar2.b(qi0Var2.E);
                }
                AndroidUtilities.runOnUIThread(new vh0(qi0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
