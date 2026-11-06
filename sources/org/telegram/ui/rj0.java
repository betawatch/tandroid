package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
