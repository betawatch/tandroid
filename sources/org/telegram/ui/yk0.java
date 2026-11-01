package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class yk0 extends ClickableSpan {
    public final /* synthetic */ jl0 a;

    public yk0(jl0 jl0Var) {
        this.a = jl0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        jl0 jl0Var = this.a;
        gf.f.r(jl0Var.getParentActivity(), jl0Var.D.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
    }
}
