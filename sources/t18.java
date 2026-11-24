// default package

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class t18 implements rz6 {
    public final /* synthetic */ y28 a;

    public t18(y28 y28Var) {
        this.a = y28Var;
    }

    @Override // rz6
    public final void c(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
        y28 y28Var = this.a;
        ij.X(y28Var.s2, y28Var.r1, 1, new p22(this, i, botInlineResult, z, (byte) 1));
    }

    @Override // rz6
    public final Paint.FontMetricsInt d() {
        return this.a.R1.getEditField().getPaint().getFontMetricsInt();
    }

    @Override // rz6
    public final void h(TLRPC.TL_document tL_document, String str, Object obj) {
        y28 y28Var = this.a;
        ij.X(y28Var.s2, y28Var.r1, 1, new au0(this, tL_document, str, obj, (byte) 13));
    }

    @Override // rz6
    public final void k(int i, int i2, CharSequence charSequence, boolean z) {
        this.a.R1.o1(i, i2, charSequence, z);
    }

    @Override // rz6
    public final void m(String str) {
        q18 q18Var = this.a.R1;
        q18Var.X();
        q18Var.V0.d(str);
    }
}
