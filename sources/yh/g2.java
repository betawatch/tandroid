package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class g2 extends ClickableSpan {
    public final /* synthetic */ long a;
    public final /* synthetic */ z3 b;

    public g2(z3 z3Var, long j3) {
        this.b = z3Var;
        this.a = j3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.X1(this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
