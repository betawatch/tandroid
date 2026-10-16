package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bf0 b;

    public /* synthetic */ ye0(bf0 bf0Var, int i10) {
        this.a = i10;
        this.b = bf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bf0 bf0Var = this.b;
                di.g2 g2Var = bf0Var.c;
                g2Var.requestFocus();
                String str = bf0Var.K;
                if (str != null) {
                    if (str.length() > 1) {
                        String obj = g2Var.getText().toString();
                        int length = obj.length();
                        int i10 = 0;
                        while (i10 < length && obj.charAt(i10) <= ' ') {
                            i10++;
                        }
                        int length2 = bf0Var.K.length() + i10;
                        g2Var.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 1), obj.length(), 0), g2Var.getText().length());
                        break;
                    }
                }
                g2Var.setSelection(0, g2Var.getText().length());
                break;
            case 1:
                this.b.q(true);
                break;
            case 2:
                this.b.o(false);
                break;
            default:
                di.g2 g2Var2 = this.b.c;
                if (g2Var2 != null) {
                    g2Var2.requestFocus();
                    g2Var2.setSelection(g2Var2.length());
                    AndroidUtilities.showKeyboard(g2Var2);
                    break;
                }
                break;
        }
    }
}
