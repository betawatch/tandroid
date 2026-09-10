package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xe0 b;

    public /* synthetic */ ue0(xe0 xe0Var, int i10) {
        this.a = i10;
        this.b = xe0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xe0 xe0Var = this.b;
                bi.t2 t2Var = xe0Var.c;
                t2Var.requestFocus();
                String str = xe0Var.K;
                if (str != null) {
                    if (str.length() > 1) {
                        String obj = t2Var.getText().toString();
                        int length = obj.length();
                        int i10 = 0;
                        while (i10 < length && obj.charAt(i10) <= ' ') {
                            i10++;
                        }
                        int length2 = xe0Var.K.length() + i10;
                        t2Var.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 1), obj.length(), 0), t2Var.getText().length());
                        break;
                    }
                }
                t2Var.setSelection(0, t2Var.getText().length());
                break;
            case 1:
                this.b.q(true);
                break;
            case 2:
                this.b.o(false);
                break;
            default:
                bi.t2 t2Var2 = this.b.c;
                if (t2Var2 != null) {
                    t2Var2.requestFocus();
                    t2Var2.setSelection(t2Var2.length());
                    AndroidUtilities.showKeyboard(t2Var2);
                    break;
                }
                break;
        }
    }
}
