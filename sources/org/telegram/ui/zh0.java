package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui0 b;

    public /* synthetic */ zh0(ui0 ui0Var, int i10) {
        this.a = i10;
        this.b = ui0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                ui0 ui0Var = this.b;
                ui0Var.getClass();
                ih.j.f(false);
                ih.j jVar = ui0Var.f0;
                if (jVar != null) {
                    jVar.b(ui0Var.C);
                }
                AndroidUtilities.runOnUIThread(new zh0(ui0Var, 0));
                break;
            case 2:
                ih.j.f(false);
                ui0 ui0Var2 = this.b;
                ih.j jVar2 = ui0Var2.f0;
                if (jVar2 != null) {
                    jVar2.b(ui0Var2.C);
                }
                AndroidUtilities.runOnUIThread(new zh0(ui0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
