// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
