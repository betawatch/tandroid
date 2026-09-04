package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class w60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f70 b;

    public /* synthetic */ w60(f70 f70Var, int i10) {
        this.a = i10;
        this.b = f70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                f70 f70Var = this.b;
                f70Var.f.r.clearFocus();
                f70Var.f.r.requestFocus();
                AndroidUtilities.showKeyboard(f70Var.f.r);
                break;
            case 1:
                this.b.o0();
                break;
            case 2:
                f70 f70Var2 = this.b;
                f70Var2.n0(f70Var2.l0());
                break;
            case 3:
                f70 f70Var3 = this.b;
                f70Var3.n0(f70Var3.l0());
                break;
            default:
                f70 f70Var4 = this.b;
                f70Var4.X = null;
                f70Var4.Z.b();
                f70Var4.h.b();
                f70Var4.k0();
                f70Var4.r0();
                f70Var4.s0();
                break;
        }
    }
}
