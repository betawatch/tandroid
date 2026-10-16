package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class xo0 extends ClickableSpan {
    public final /* synthetic */ ap0 a;

    public xo0(ap0 ap0Var) {
        this.a = ap0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ap0 ap0Var = this.a;
        ap0Var.presentFragment(new oh1(6, ap0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
