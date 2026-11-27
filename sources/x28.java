// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.p;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class x28 extends ClickableSpan {
    public final /* synthetic */ p a;

    public x28(p pVar) {
        this.a = pVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        p pVar = this.a;
        pVar.presentFragment(new o7c(6, pVar.b0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
