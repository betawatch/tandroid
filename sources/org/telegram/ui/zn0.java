package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zn0 extends ClickableSpan {
    public final /* synthetic */ co0 a;

    public zn0(co0 co0Var) {
        this.a = co0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        co0 co0Var = this.a;
        co0Var.presentFragment(new ag1(6, co0Var.W));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
