package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class s60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b70 b;

    public /* synthetic */ s60(b70 b70Var, int i10) {
        this.a = i10;
        this.b = b70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                b70 b70Var = this.b;
                b70Var.f.r.clearFocus();
                b70Var.f.r.requestFocus();
                AndroidUtilities.showKeyboard(b70Var.f.r);
                break;
            case 1:
                this.b.o0();
                break;
            case 2:
                b70 b70Var2 = this.b;
                b70Var2.n0(b70Var2.l0());
                break;
            case 3:
                b70 b70Var3 = this.b;
                b70Var3.n0(b70Var3.l0());
                break;
            default:
                b70 b70Var4 = this.b;
                b70Var4.X = null;
                b70Var4.Z.b();
                b70Var4.h.b();
                b70Var4.k0();
                b70Var4.r0();
                b70Var4.s0();
                break;
        }
    }
}
