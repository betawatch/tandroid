package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ z(l4 l4Var, String str, int i10) {
        this.a = i10;
        this.b = l4Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l4 l4Var = this.b;
                lh.n nVar = l4Var.e0.V;
                String str = this.c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                nVar.setText(str);
                lh.n nVar2 = l4Var.e0.V;
                nVar2.setSelection(nVar2.getText().length());
                AndroidUtilities.showKeyboard(l4Var.e0.V);
                break;
            default:
                af.g.m(this.b.I, this.c, false, null);
                break;
        }
    }
}
