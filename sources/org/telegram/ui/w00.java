package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w00 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c40 b;

    public /* synthetic */ w00(c40 c40Var, int i7) {
        this.a = i7;
        this.b = c40Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (this.b.o2 && (T instanceof an)) {
                    ((an) T).ta(true, true);
                    break;
                }
                break;
            case 1:
                this.b.dismiss();
                break;
            case 2:
                this.b.v3 = null;
                break;
            default:
                this.b.i2 = null;
                break;
        }
    }
}
