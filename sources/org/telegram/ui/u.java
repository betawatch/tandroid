package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ u(g4 g4Var, int i7) {
        this.a = i7;
        this.b = g4Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.c.f(true);
                break;
            default:
                this.b.k0 = null;
                break;
        }
    }
}
