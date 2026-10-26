package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                xh.f.f(false);
                xh.f fVar = ni0Var.h0;
                if (fVar != null) {
                    fVar.b(ni0Var.E);
                }
                AndroidUtilities.runOnUIThread(new sh0(ni0Var, 0));
                break;
            case 2:
                xh.f.f(false);
                ni0 ni0Var2 = this.b;
                xh.f fVar2 = ni0Var2.h0;
                if (fVar2 != null) {
                    fVar2.b(ni0Var2.E);
                }
                AndroidUtilities.runOnUIThread(new sh0(ni0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
