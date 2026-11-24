// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class uza extends CharacterStyle implements UpdateAppearance {
    public final int a;
    public final wjb b;

    public uza(int i, wjb wjbVar) {
        this.a = i;
        this.b = wjbVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(bkb.v0(this.a, this.b));
        textPaint.setUnderlineText(true);
    }
}
