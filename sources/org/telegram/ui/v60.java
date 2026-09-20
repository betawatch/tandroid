package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class v60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e70 b;

    public /* synthetic */ v60(e70 e70Var, int i10) {
        this.a = i10;
        this.b = e70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                e70 e70Var = this.b;
                e70Var.f.r.clearFocus();
                e70Var.f.r.requestFocus();
                AndroidUtilities.showKeyboard(e70Var.f.r);
                break;
            case 1:
                this.b.o0();
                break;
            case 2:
                e70 e70Var2 = this.b;
                e70Var2.n0(e70Var2.l0());
                break;
            case 3:
                e70 e70Var3 = this.b;
                e70Var3.n0(e70Var3.l0());
                break;
            default:
                e70 e70Var4 = this.b;
                e70Var4.X = null;
                e70Var4.Z.b();
                e70Var4.h.b();
                e70Var4.k0();
                e70Var4.r0();
                e70Var4.s0();
                break;
        }
    }
}
