package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class uj0 extends ClickableSpan {
    public final /* synthetic */ ek0 a;

    public uj0(ek0 ek0Var) {
        this.a = ek0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ek0 ek0Var = this.a;
        vf.c.t(ek0Var.getParentActivity(), ek0Var.E.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
    }
}
