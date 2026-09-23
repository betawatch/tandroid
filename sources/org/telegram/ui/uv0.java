package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fw0 b;

    public /* synthetic */ uv0(fw0 fw0Var, int i10) {
        this.a = i10;
        this.b = fw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fw0 fw0Var = this.b;
                AndroidUtilities.runOnUIThread(new uv0(fw0Var, 3));
                org.telegram.ui.Cells.t1 t1Var = fw0Var.L;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    org.telegram.ui.Cells.t1 t1Var2 = fw0Var.L;
                    t1Var2.L7 = null;
                    t1Var2.invalidate();
                }
                um umVar = fw0Var.e0;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    fw0Var.e0 = null;
                    break;
                }
                break;
            case 1:
                this.b.c(false);
                break;
            case 2:
                this.b.c(false);
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }

    public /* synthetic */ uv0(fw0 fw0Var, boolean z10) {
        this.a = 0;
        this.b = fw0Var;
    }
}
