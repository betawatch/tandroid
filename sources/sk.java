// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
