package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ y(j4 j4Var, String str, int i10) {
        this.a = i10;
        this.b = j4Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j4 j4Var = this.b;
                ei.o oVar = j4Var.h0.b0;
                String str = this.c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                ei.o oVar2 = j4Var.h0.b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(j4Var.h0.b0);
                break;
            default:
                nf.f.m(this.b.L, this.c, false, null);
                break;
        }
    }
}
