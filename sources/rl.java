// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rl extends CharacterStyle {
    public final /* synthetic */ byte a;
    public int b;

    public rl() {
        this.a = (byte) 2;
        this.b = 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setTypeface(gm.o());
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
                textPaint.setColor(cmb.p1(textPaint.getAlpha() / 255.0f, this.b));
                break;
        }
    }

    public /* synthetic */ rl(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    public /* synthetic */ rl(byte b, int i, boolean z) {
        this.a = b;
        this.b = i;
    }
}
