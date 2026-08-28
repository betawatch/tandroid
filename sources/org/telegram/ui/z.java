package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ z(l4 l4Var, String str, int i9) {
        this.a = i9;
        this.b = l4Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l4 l4Var = this.b;
                gh.o oVar = l4Var.d0.U;
                String str = this.c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                gh.o oVar2 = l4Var.d0.U;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(l4Var.d0.U);
                break;
            default:
                ve.e.m(this.b.H, this.c, false, null);
                break;
        }
    }
}
