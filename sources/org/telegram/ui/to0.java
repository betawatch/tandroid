package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class to0 extends ClickableSpan {
    public final /* synthetic */ wo0 a;

    public to0(wo0 wo0Var) {
        this.a = wo0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        wo0 wo0Var = this.a;
        wo0Var.presentFragment(new mh1(6, wo0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
