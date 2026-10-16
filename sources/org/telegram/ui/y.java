package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ y(k4 k4Var, String str, int i10) {
        this.a = i10;
        this.b = k4Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k4 k4Var = this.b;
                gi.o oVar = k4Var.h0.b0;
                String str = this.c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                gi.o oVar2 = k4Var.h0.b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(k4Var.h0.b0);
                break;
            default:
                pf.d.l(this.b.L, this.c, false, null);
                break;
        }
    }
}
