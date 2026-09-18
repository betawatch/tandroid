package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class vo0 extends ClickableSpan {
    public final /* synthetic */ yo0 a;

    public vo0(yo0 yo0Var) {
        this.a = yo0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        yo0 yo0Var = this.a;
        yo0Var.presentFragment(new ih1(6, yo0Var.a0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
