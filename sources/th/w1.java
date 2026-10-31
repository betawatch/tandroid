package th;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.v90;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w1 implements v90 {
    public final /* synthetic */ z2 a;

    public w1(z2 z2Var) {
        this.a = z2Var;
    }

    @Override // org.telegram.ui.Components.v90
    public final void L(TLRPC.TL_document tL_document, String str, Object obj) {
        z2 z2Var = this.a;
        org.telegram.ui.Components.s4.Z(z2Var.l2, 1, z2Var.k1, new ag.m2(this, tL_document, str, obj, 17));
    }

    @Override // org.telegram.ui.Components.v90
    public final void N(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.a.K1.M0(i10, i11, charSequence, z10);
    }

    @Override // org.telegram.ui.Components.v90
    public final void X(String str) {
        t1 t1Var = this.a.K1;
        t1Var.Q();
        t1Var.U0.h(str);
    }

    @Override // org.telegram.ui.Components.v90
    public final void m(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        z2 z2Var = this.a;
        org.telegram.ui.Components.s4.Z(z2Var.l2, 1, z2Var.k1, new jj(i10, 1, this, botInlineResult, z10));
    }

    @Override // org.telegram.ui.Components.v90
    public final Paint.FontMetricsInt w() {
        return this.a.K1.getEditField().getPaint().getFontMetricsInt();
    }
}
