package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ni0 b;

    public /* synthetic */ sh0(ni0 ni0Var, int i10) {
        this.a = i10;
        this.b = ni0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                ni0 ni0Var = this.b;
                ni0Var.getClass();
                wh.f.f(false);
                wh.f fVar = ni0Var.i0;
                if (fVar != null) {
                    fVar.b(ni0Var.F);
                }
                AndroidUtilities.runOnUIThread(new sh0(ni0Var, 0));
                break;
            case 2:
                wh.f.f(false);
                ni0 ni0Var2 = this.b;
                wh.f fVar2 = ni0Var2.i0;
                if (fVar2 != null) {
                    fVar2.b(ni0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new sh0(ni0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
