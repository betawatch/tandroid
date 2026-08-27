package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf1 b;

    public /* synthetic */ rf1(zf1 zf1Var, int i10) {
        this.a = i10;
        this.b = zf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zf1 zf1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = zf1Var.n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    zf1Var.n.requestFocus();
                    AndroidUtilities.showKeyboard(zf1Var.n);
                    break;
                }
                break;
            case 1:
                zf1 zf1Var2 = this.b;
                od0 od0Var = zf1Var2.w;
                if (od0Var != null && od0Var.getVisibility() == 0) {
                    zf1Var2.w.f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i10 = 0;
                while (true) {
                    wr[] wrVarArr = this.b.w.f;
                    if (i10 >= wrVarArr.length) {
                        break;
                    } else {
                        wrVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                zf1 zf1Var3 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = zf1Var3.n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        zf1Var3.b0[2].N(49);
                        zf1Var3.b0[2].Q(0.0f, false);
                        zf1Var3.a.d();
                        break;
                    } else {
                        zf1Var3.F0(true);
                        break;
                    }
                }
                break;
            case 4:
                zf1 zf1Var4 = this.b;
                if (zf1Var4.c0 != null) {
                    zf1Var4.F0(false);
                    break;
                }
                break;
            case 5:
                zf1.f0(this.b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new rf1(this.b, 7), 150L);
                break;
            default:
                for (wr wrVar : this.b.w.f) {
                    wrVar.i(0.0f);
                }
                break;
        }
    }
}
