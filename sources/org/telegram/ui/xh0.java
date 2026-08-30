package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ si0 b;

    public /* synthetic */ xh0(si0 si0Var, int i10) {
        this.a = i10;
        this.b = si0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                si0 si0Var = this.b;
                si0Var.getClass();
                ih.j.f(false);
                ih.j jVar = si0Var.f0;
                if (jVar != null) {
                    jVar.b(si0Var.C);
                }
                AndroidUtilities.runOnUIThread(new xh0(si0Var, 0));
                break;
            case 2:
                ih.j.f(false);
                si0 si0Var2 = this.b;
                ih.j jVar2 = si0Var2.f0;
                if (jVar2 != null) {
                    jVar2.b(si0Var2.C);
                }
                AndroidUtilities.runOnUIThread(new xh0(si0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
