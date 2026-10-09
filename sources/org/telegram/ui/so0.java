package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class so0 extends ClickableSpan {
    public final /* synthetic */ vo0 a;

    public so0(vo0 vo0Var) {
        this.a = vo0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        vo0 vo0Var = this.a;
        vo0Var.presentFragment(new ih1(6, vo0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
