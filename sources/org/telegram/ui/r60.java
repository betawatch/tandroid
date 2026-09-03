package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a70 b;

    public /* synthetic */ r60(a70 a70Var, int i10) {
        this.a = i10;
        this.b = a70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                a70 a70Var = this.b;
                a70Var.f.r.clearFocus();
                a70Var.f.r.requestFocus();
                AndroidUtilities.showKeyboard(a70Var.f.r);
                break;
            case 1:
                this.b.o0();
                break;
            case 2:
                a70 a70Var2 = this.b;
                a70Var2.n0(a70Var2.l0());
                break;
            case 3:
                a70 a70Var3 = this.b;
                a70Var3.n0(a70Var3.l0());
                break;
            default:
                a70 a70Var4 = this.b;
                a70Var4.U = null;
                a70Var4.W.b();
                a70Var4.h.b();
                a70Var4.k0();
                a70Var4.r0();
                a70Var4.s0();
                break;
        }
    }
}
