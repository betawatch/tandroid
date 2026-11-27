// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class s3b extends CharacterStyle implements UpdateAppearance {
    public final int a;
    public final vnb b;

    public s3b(int i, vnb vnbVar) {
        this.a = i;
        this.b = vnbVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(aob.v0(this.a, this.b));
        textPaint.setUnderlineText(true);
    }
}
