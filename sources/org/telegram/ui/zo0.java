package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class zo0 extends ClickableSpan {
    public final /* synthetic */ cp0 a;

    public zo0(cp0 cp0Var) {
        this.a = cp0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        cp0 cp0Var = this.a;
        cp0Var.presentFragment(new oh1(6, cp0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
