package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti0 b;

    public /* synthetic */ yh0(ti0 ti0Var, int i10) {
        this.a = i10;
        this.b = ti0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                ti0 ti0Var = this.b;
                ti0Var.getClass();
                jh.j.f(false);
                jh.j jVar = ti0Var.f0;
                if (jVar != null) {
                    jVar.b(ti0Var.C);
                }
                AndroidUtilities.runOnUIThread(new yh0(ti0Var, 0));
                break;
            case 2:
                jh.j.f(false);
                ti0 ti0Var2 = this.b;
                jh.j jVar2 = ti0Var2.f0;
                if (jVar2 != null) {
                    jVar2.b(ti0Var2.C);
                }
                AndroidUtilities.runOnUIThread(new yh0(ti0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
