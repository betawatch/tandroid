package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class tj0 extends ClickableSpan {
    public final /* synthetic */ dk0 a;

    public tj0(dk0 dk0Var) {
        this.a = dk0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        dk0 dk0Var = this.a;
        vf.c.t(dk0Var.getParentActivity(), dk0Var.D.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
    }
}
