package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yn0 extends ClickableSpan {
    public final /* synthetic */ bo0 a;

    public yn0(bo0 bo0Var) {
        this.a = bo0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        bo0 bo0Var = this.a;
        bo0Var.presentFragment(new cg1(6, bo0Var.W));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
