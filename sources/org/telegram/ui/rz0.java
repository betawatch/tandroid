package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rz0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vz0 b;

    public /* synthetic */ rz0(vz0 vz0Var, int i7) {
        this.a = i7;
        this.b = vz0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                vz0 vz0Var = this.b;
                if (vz0Var.Y == null) {
                    vz0Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
