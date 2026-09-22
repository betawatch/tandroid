package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class to0 extends ClickableSpan {
    public final /* synthetic */ wo0 a;

    public to0(wo0 wo0Var) {
        this.a = wo0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        wo0 wo0Var = this.a;
        wo0Var.presentFragment(new hh1(6, wo0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
