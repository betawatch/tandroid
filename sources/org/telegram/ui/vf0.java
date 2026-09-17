package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf0 b;

    public /* synthetic */ vf0(zf0 zf0Var, int i10) {
        this.a = i10;
        this.b = zf0Var;
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
