// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class u18 extends ClickableSpan {
    public final /* synthetic */ p a;

    public u18(p pVar) {
        this.a = pVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        p pVar = this.a;
        pVar.presentFragment(new p5c(6, pVar.b0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
