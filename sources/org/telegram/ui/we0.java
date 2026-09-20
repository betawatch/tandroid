package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class we0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ze0 b;

    public /* synthetic */ we0(ze0 ze0Var, int i10) {
        this.a = i10;
        this.b = ze0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ze0 ze0Var = this.b;
                ci.h2 h2Var = ze0Var.c;
                h2Var.requestFocus();
                String str = ze0Var.K;
                if (str != null) {
                    if (str.length() > 1) {
                        String obj = h2Var.getText().toString();
                        int length = obj.length();
                        int i10 = 0;
                        while (i10 < length && obj.charAt(i10) <= ' ') {
                            i10++;
                        }
                        int length2 = ze0Var.K.length() + i10;
                        h2Var.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 1), obj.length(), 0), h2Var.getText().length());
                        break;
                    }
                }
                h2Var.setSelection(0, h2Var.getText().length());
                break;
            case 1:
                this.b.q(true);
                break;
            case 2:
                this.b.o(false);
                break;
            default:
                ci.h2 h2Var2 = this.b.c;
                if (h2Var2 != null) {
                    h2Var2.requestFocus();
                    h2Var2.setSelection(h2Var2.length());
                    AndroidUtilities.showKeyboard(h2Var2);
                    break;
                }
                break;
        }
    }
}
