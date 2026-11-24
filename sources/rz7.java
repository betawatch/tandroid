// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.p;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class rz7 extends ClickableSpan {
    public final /* synthetic */ p a;

    public rz7(p pVar) {
        this.a = pVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        p pVar = this.a;
        pVar.presentFragment(new p3c(6, pVar.b0));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
