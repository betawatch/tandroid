// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class t3b extends CharacterStyle implements UpdateAppearance {
    public final int a;
    public final vnb b;

    public t3b(int i, vnb vnbVar) {
        this.a = i;
        this.b = vnbVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(aob.v0(this.a, this.b));
        textPaint.setUnderlineText(true);
    }
}
