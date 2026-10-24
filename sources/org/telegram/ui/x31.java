package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b41 b;

    public /* synthetic */ x31(b41 b41Var, int i10) {
        this.a = i10;
        this.b = b41Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                b41 b41Var = this.b;
                if (b41Var.Y == null) {
                    b41Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
