package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ x(k4 k4Var, String str, int i10) {
        this.a = i10;
        this.b = k4Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k4 k4Var = this.b;
                ai.t tVar = k4Var.h0.b0;
                String str = this.c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                tVar.setText(str);
                ai.t tVar2 = k4Var.h0.b0;
                tVar2.setSelection(tVar2.getText().length());
                AndroidUtilities.showKeyboard(k4Var.h0.b0);
                break;
            default:
                pf.d.l(this.b.L, this.c, false, null);
                break;
        }
    }
}
