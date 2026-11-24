// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
