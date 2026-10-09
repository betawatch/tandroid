package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c70 b;

    public /* synthetic */ t60(c70 c70Var, int i10) {
        this.a = i10;
        this.b = c70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                c70 c70Var = this.b;
                c70Var.f.r.clearFocus();
                c70Var.f.r.requestFocus();
                AndroidUtilities.showKeyboard(c70Var.f.r);
                break;
            case 1:
                this.b.o0();
                break;
            case 2:
                c70 c70Var2 = this.b;
                c70Var2.n0(c70Var2.l0());
                break;
            case 3:
                c70 c70Var3 = this.b;
                c70Var3.n0(c70Var3.l0());
                break;
            default:
                c70 c70Var4 = this.b;
                c70Var4.X = null;
                c70Var4.Z.b();
                c70Var4.h.b();
                c70Var4.k0();
                c70Var4.r0();
                c70Var4.s0();
                break;
        }
    }
}
