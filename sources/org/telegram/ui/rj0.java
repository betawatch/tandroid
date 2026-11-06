package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class rj0 extends ClickableSpan {
    public final /* synthetic */ bk0 a;

    public rj0(bk0 bk0Var) {
        this.a = bk0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        bk0 bk0Var = this.a;
        vf.c.t(bk0Var.getParentActivity(), bk0Var.D.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
    }
}
