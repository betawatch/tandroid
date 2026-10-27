package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ x(j4 j4Var, String str, int i10) {
        this.a = i10;
        this.b = j4Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j4 j4Var = this.b;
                bi.t tVar = j4Var.h0.b0;
                String str = this.c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                tVar.setText(str);
                bi.t tVar2 = j4Var.h0.b0;
                tVar2.setSelection(tVar2.getText().length());
                AndroidUtilities.showKeyboard(j4Var.h0.b0);
                break;
            default:
                qf.d.l(this.b.L, this.c, false, null);
                break;
        }
    }
}
