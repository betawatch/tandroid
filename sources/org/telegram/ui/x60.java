package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g70 b;

    public /* synthetic */ x60(g70 g70Var, int i10) {
        this.a = i10;
        this.b = g70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                g70 g70Var = this.b;
                g70Var.f.r.clearFocus();
                g70Var.f.r.requestFocus();
                AndroidUtilities.showKeyboard(g70Var.f.r);
                break;
            case 1:
                this.b.o0();
                break;
            case 2:
                g70 g70Var2 = this.b;
                g70Var2.n0(g70Var2.l0());
                break;
            case 3:
                g70 g70Var3 = this.b;
                g70Var3.n0(g70Var3.l0());
                break;
            default:
                g70 g70Var4 = this.b;
                g70Var4.X = null;
                g70Var4.Z.b();
                g70Var4.h.b();
                g70Var4.k0();
                g70Var4.r0();
                g70Var4.s0();
                break;
        }
    }
}
