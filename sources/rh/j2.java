package rh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j2 extends ClickableSpan {
    public final /* synthetic */ long a;
    public final /* synthetic */ e4 b;

    public j2(e4 e4Var, long j10) {
        this.b = e4Var;
        this.a = j10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.U1(this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
