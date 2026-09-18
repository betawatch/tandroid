package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class uo0 extends ClickableSpan {
    public final /* synthetic */ xo0 a;

    public uo0(xo0 xo0Var) {
        this.a = xo0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        xo0 xo0Var = this.a;
        xo0Var.presentFragment(new gh1(6, xo0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
