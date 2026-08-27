package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jv0 b;

    public /* synthetic */ zu0(jv0 jv0Var, int i10) {
        this.a = i10;
        this.b = jv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jv0 jv0Var = this.b;
                AndroidUtilities.runOnUIThread(new zu0(jv0Var, 3));
                org.telegram.ui.Cells.s1 s1Var = jv0Var.H;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                    org.telegram.ui.Cells.s1 s1Var2 = jv0Var.H;
                    s1Var2.H7 = null;
                    s1Var2.invalidate();
                }
                om omVar = jv0Var.a0;
                if (omVar != null) {
                    AndroidUtilities.runOnUIThread(omVar);
                    jv0Var.a0 = null;
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

    public /* synthetic */ zu0(jv0 jv0Var, boolean z10) {
        this.a = 0;
        this.b = jv0Var;
    }
}
