package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hh1 b;

    public /* synthetic */ zg1(hh1 hh1Var, int i10) {
        this.a = i10;
        this.b = hh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hh1 hh1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = hh1Var.n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    hh1Var.n.requestFocus();
                    AndroidUtilities.showKeyboard(hh1Var.n);
                    break;
                }
                break;
            case 1:
                hh1 hh1Var2 = this.b;
                de0 de0Var = hh1Var2.w;
                if (de0Var != null && de0Var.getVisibility() == 0) {
                    hh1Var2.w.f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i10 = 0;
                while (true) {
                    gs[] gsVarArr = this.b.w.f;
                    if (i10 >= gsVarArr.length) {
                        break;
                    } else {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                hh1 hh1Var3 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = hh1Var3.n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        hh1Var3.f0[2].N(49);
                        hh1Var3.f0[2].Q(0.0f, false);
                        hh1Var3.a.d();
                        break;
                    } else {
                        hh1Var3.F0(true);
                        break;
                    }
                }
                break;
            case 4:
                hh1 hh1Var4 = this.b;
                if (hh1Var4.g0 != null) {
                    hh1Var4.F0(false);
                    break;
                }
                break;
            case 5:
                hh1.f0(this.b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new zg1(this.b, 7), 150L);
                break;
            default:
                for (gs gsVar : this.b.w.f) {
                    gsVar.i(0.0f);
                }
                break;
        }
    }
}
