// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class sk extends CharacterStyle {
    public final /* synthetic */ byte a;
    public int b;

    public sk() {
        this.a = (byte) 2;
        this.b = 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setTypeface(hl.o());
                textPaint.setColor(this.b);
                break;
            case 1:
                textPaint.setUnderlineText(false);
                textPaint.setColor(this.b);
                break;
            case 2:
                textPaint.setAlpha((int) ((this.b / 255.0f) * textPaint.getAlpha()));
                break;
            default:
                textPaint.setColor(aob.p1(textPaint.getAlpha() / 255.0f, this.b));
                break;
        }
    }

    public /* synthetic */ sk(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    public /* synthetic */ sk(byte b, int i, boolean z) {
        this.a = b;
        this.b = i;
    }
}
