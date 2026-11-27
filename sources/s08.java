// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
