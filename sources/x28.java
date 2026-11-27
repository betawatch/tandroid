// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.p;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
