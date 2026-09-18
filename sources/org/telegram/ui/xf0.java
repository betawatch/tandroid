package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg0 b;

    public /* synthetic */ xf0(bg0 bg0Var, int i10) {
        this.a = i10;
        this.b = bg0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.s0.finishFragment();
                break;
            default:
                this.b.s0.finishFragment();
                break;
        }
    }
}
