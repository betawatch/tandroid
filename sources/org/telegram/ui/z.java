package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                mh.m mVar = l4Var.e0.V;
                String str = this.c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                mVar.setText(str);
                mh.m mVar2 = l4Var.e0.V;
                mVar2.setSelection(mVar2.getText().length());
                AndroidUtilities.showKeyboard(l4Var.e0.V);
                break;
            default:
                af.g.m(this.b.I, this.c, false, null);
                break;
        }
    }
}
