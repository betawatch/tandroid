package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ag1 b;

    public /* synthetic */ sf1(ag1 ag1Var, int i9) {
        this.a = i9;
        this.b = ag1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ag1 ag1Var = this.b;
                EditTextBoldCursor editTextBoldCursor = ag1Var.n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    ag1Var.n.requestFocus();
                    AndroidUtilities.showKeyboard(ag1Var.n);
                    break;
                }
                break;
            case 1:
                ag1 ag1Var2 = this.b;
                ld0 ld0Var = ag1Var2.w;
                if (ld0Var != null && ld0Var.getVisibility() == 0) {
                    ag1Var2.w.f[0].requestFocus();
                    break;
                }
                break;
            case 2:
                int i9 = 0;
                while (true) {
                    vr[] vrVarArr = this.b.w.f;
                    if (i9 >= vrVarArr.length) {
                        break;
                    } else {
                        vrVarArr[i9].i(0.0f);
                        i9++;
                    }
                }
            case 3:
                ag1 ag1Var3 = this.b;
                EditTextBoldCursor editTextBoldCursor2 = ag1Var3.n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        ag1Var3.b0[2].N(49);
                        ag1Var3.b0[2].Q(0.0f, false);
                        ag1Var3.a.d();
                        break;
                    } else {
                        ag1Var3.E0(true);
                        break;
                    }
                }
                break;
            case 4:
                ag1 ag1Var4 = this.b;
                if (ag1Var4.c0 != null) {
                    ag1Var4.E0(false);
                    break;
                }
                break;
            case 5:
                ag1.e0(this.b);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new sf1(this.b, 7), 150L);
                break;
            default:
                for (vr vrVar : this.b.w.f) {
                    vrVar.i(0.0f);
                }
                break;
        }
    }
}
