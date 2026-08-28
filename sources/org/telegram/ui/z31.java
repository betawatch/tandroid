package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d41 b;

    public /* synthetic */ z31(d41 d41Var, int i9) {
        this.a = i9;
        this.b = d41Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                d41 d41Var = this.b;
                if (d41Var.U == null) {
                    d41Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
