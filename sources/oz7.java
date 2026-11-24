// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oz7 extends ClickableSpan {
    public final /* synthetic */ xz7 a;

    public oz7(xz7 xz7Var) {
        this.a = xz7Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        xz7 xz7Var = this.a;
        l11.u(xz7Var.getParentActivity(), xz7Var.E.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(gm.o());
    }
}
