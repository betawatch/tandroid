package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class u60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d70 b;

    public /* synthetic */ u60(d70 d70Var, int i10) {
        this.a = i10;
        this.b = d70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                d70 d70Var = this.b;
                d70Var.f.r.clearFocus();
                d70Var.f.r.requestFocus();
                AndroidUtilities.showKeyboard(d70Var.f.r);
                break;
            case 1:
                this.b.o0();
                break;
            case 2:
                d70 d70Var2 = this.b;
                d70Var2.n0(d70Var2.l0());
                break;
            case 3:
                d70 d70Var3 = this.b;
                d70Var3.n0(d70Var3.l0());
                break;
            default:
                d70 d70Var4 = this.b;
                d70Var4.X = null;
                d70Var4.Z.b();
                d70Var4.h.b();
                d70Var4.k0();
                d70Var4.r0();
                d70Var4.s0();
                break;
        }
    }
}
