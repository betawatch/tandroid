package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ y(i4 i4Var, String str, int i10) {
        this.a = i10;
        this.b = i4Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i4 i4Var = this.b;
                fi.o oVar = i4Var.h0.b0;
                String str = this.c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = i4Var.h0.b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.h0.b0);
                break;
            default:
                nf.f.m(this.b.L, this.c, false, null);
                break;
        }
    }
}
