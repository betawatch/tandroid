package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t20 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d60 b;

    public /* synthetic */ t20(d60 d60Var, int i10) {
        this.a = i10;
        this.b = d60Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (this.b.u0 && (U instanceof xn)) {
                    ((xn) U).T9(true, true);
                    break;
                }
                break;
            case 1:
                this.b.dismiss();
                break;
            case 2:
                this.b.B1 = null;
                break;
            default:
                this.b.o0 = null;
                break;
        }
    }
}
