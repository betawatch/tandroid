package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bh1 b;

    public /* synthetic */ tg1(bh1 bh1Var, int i10) {
        this.a = i10;
        this.b = bh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bh1 bh1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = bh1Var.n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    bh1Var.n.requestFocus();
                    AndroidUtilities.showKeyboard(bh1Var.n);
                    break;
                }
                break;
            case 1:
                bh1 bh1Var2 = this.b;
                be0 be0Var = bh1Var2.w;
                if (be0Var != null && be0Var.getVisibility() == 0) {
                    bh1Var2.w.f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i10 = 0;
                while (true) {
                    es[] esVarArr = this.b.w.f;
                    if (i10 >= esVarArr.length) {
                        break;
                    } else {
                        esVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                bh1 bh1Var3 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = bh1Var3.n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        bh1Var3.f0[2].P(49);
                        bh1Var3.f0[2].T(0.0f, false);
                        bh1Var3.a.d();
                        break;
                    } else {
                        bh1Var3.F0(true);
                        break;
                    }
                }
                break;
            case 4:
                bh1 bh1Var4 = this.b;
                if (bh1Var4.g0 != null) {
                    bh1Var4.F0(false);
                    break;
                }
                break;
            case 5:
                bh1.f0(this.b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new tg1(this.b, 7), 150L);
                break;
            default:
                for (es esVar : this.b.w.f) {
                    esVar.i(0.0f);
                }
                break;
        }
    }
}
