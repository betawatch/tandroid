// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class p37 extends CharacterStyle {
    public final /* synthetic */ byte a;

    public p37(q37 q37Var) {
        this.a = (byte) 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setTypeface(hl.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(aob.w0(null, aob.n6, false));
                textPaint.setAlpha(alpha);
                break;
            case 1:
                textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                textPaint.setColor(aob.T2.getColor());
                break;
            case 2:
                textPaint.setColor(aob.o2.linkColor);
                break;
            case 3:
                break;
            default:
                textPaint.setAlpha(128);
                break;
        }
    }

    public /* synthetic */ p37(byte b) {
        this.a = b;
    }

    private final void a(TextPaint textPaint) {
    }
}
