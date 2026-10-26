package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u21 b;

    public /* synthetic */ r21(u21 u21Var, int i10) {
        this.a = i10;
        this.b = u21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u21 u21Var = this.b;
                v21 v21Var = u21Var.v;
                if (u21Var.a != 0) {
                    v21Var.onBackPressed();
                    break;
                } else {
                    v21Var.dismiss();
                    break;
                }
            default:
                AndroidUtilities.showKeyboard(this.b.n.d);
                break;
        }
    }
}
