package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ y(l4 l4Var, String str, int i10) {
        this.a = i10;
        this.b = l4Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l4 l4Var = this.b;
                ai.t tVar = l4Var.h0.b0;
                String str = this.c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                tVar.setText(str);
                ai.t tVar2 = l4Var.h0.b0;
                tVar2.setSelection(tVar2.getText().length());
                AndroidUtilities.showKeyboard(l4Var.h0.b0);
                break;
            default:
                pf.d.l(this.b.L, this.c, false, null);
                break;
        }
    }
}
