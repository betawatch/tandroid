package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class qz0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uz0 b;

    public /* synthetic */ qz0(uz0 uz0Var, int i7) {
        this.a = i7;
        this.b = uz0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                uz0 uz0Var = this.b;
                if (uz0Var.Z == null) {
                    uz0Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
