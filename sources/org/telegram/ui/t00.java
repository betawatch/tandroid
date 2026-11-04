package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t00 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x30 b;

    public /* synthetic */ t00(x30 x30Var, int i3) {
        this.a = i3;
        this.b = x30Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (this.b.p2 && (T instanceof wm)) {
                    ((wm) T).ta(true, true);
                    break;
                }
                break;
            case 1:
                this.b.dismiss();
                break;
            case 2:
                this.b.w3 = null;
                break;
            default:
                this.b.j2 = null;
                break;
        }
    }
}
