package zh;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.ua0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class w1 implements ua0 {
    public final /* synthetic */ a3 a;

    public w1(a3 a3Var) {
        this.a = a3Var;
    }

    @Override // org.telegram.ui.Components.ua0
    public final void K(String str) {
        t1 t1Var = this.a.b2;
        t1Var.U();
        t1Var.U0.h(str);
    }

    @Override // org.telegram.ui.Components.ua0
    public final void d(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        a3 a3Var = this.a;
        org.telegram.ui.Components.d5.a0(a3Var.C2, 1, a3Var.B1, new gk(i10, 1, this, botInlineResult, z10));
    }

    @Override // org.telegram.ui.Components.ua0
    public final Paint.FontMetricsInt o() {
        return this.a.b2.getEditField().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.ua0
    public final void v(TLRPC.TL_document tL_document, String str, Object obj) {
        a3 a3Var = this.a;
        org.telegram.ui.Components.d5.a0(a3Var.C2, 1, a3Var.B1, new gg.u1(this, tL_document, str, obj, 16));
    }

    @Override // org.telegram.ui.Components.ua0
    public final void z(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.a.b2.O0(i10, i11, charSequence, z10);
    }
}
