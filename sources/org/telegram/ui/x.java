package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m4 b;

    public /* synthetic */ x(m4 m4Var, int i10) {
        this.a = i10;
        this.b = m4Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.c.d(true);
                break;
            default:
                this.b.g0 = null;
                break;
        }
    }
}
