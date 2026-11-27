// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class s08 extends ClickableSpan {
    public final /* synthetic */ b18 a;

    public s08(b18 b18Var) {
        this.a = b18Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        b18 b18Var = this.a;
        m01.u(b18Var.getParentActivity(), b18Var.E.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(hl.o());
    }
}
