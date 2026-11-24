// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rk extends CharacterStyle {
    public final /* synthetic */ byte a;
    public int b;

    public rk() {
        this.a = (byte) 2;
        this.b = 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setTypeface(gl.o());
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
                textPaint.setColor(bkb.p1(textPaint.getAlpha() / 255.0f, this.b));
                break;
        }
    }

    public /* synthetic */ rk(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    public /* synthetic */ rk(byte b, int i, boolean z) {
        this.a = b;
        this.b = i;
    }
}
