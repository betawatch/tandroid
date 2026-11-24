// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v1b extends CharacterStyle implements UpdateAppearance {
    public final int a;
    public final ylb b;

    public v1b(int i, ylb ylbVar) {
        this.a = i;
        this.b = ylbVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(cmb.v0(this.a, this.b));
        textPaint.setUnderlineText(true);
    }
}
