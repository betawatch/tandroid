package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class s6 extends ClickableSpan {
    public final /* synthetic */ x5 a;

    public s6(x5 x5Var) {
        this.a = x5Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.run();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
