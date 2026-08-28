package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;

    public /* synthetic */ w(l4 l4Var, int i9) {
        this.a = i9;
        this.b = l4Var;
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
