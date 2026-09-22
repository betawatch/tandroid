package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ x(h4 h4Var, String str, int i10) {
        this.a = i10;
        this.b = h4Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h4 h4Var = this.b;
                fi.o oVar = h4Var.h0.b0;
                String str = this.c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = h4Var.h0.b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(h4Var.h0.b0);
                break;
            default:
                nf.f.m(this.b.L, this.c, false, null);
                break;
        }
    }
}
