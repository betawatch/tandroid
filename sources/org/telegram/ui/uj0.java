package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class uj0 extends ClickableSpan {
    public final /* synthetic */ ek0 a;

    public uj0(ek0 ek0Var) {
        this.a = ek0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ek0 ek0Var = this.a;
        vf.c.t(ek0Var.getParentActivity(), ek0Var.D.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
    }
}
