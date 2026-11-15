package qi;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.g0;
import org.telegram.messenger.gz;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class g extends CharacterStyle {
    public final String a;
    public final float b;
    public final boolean c;

    public g(String str, String str2, boolean z10) {
        this.c = z10;
        this.a = str;
        int length = str2 == null ? 0 : str2.length();
        p pVar = j.a;
        this.b = length > 120 ? 5 : length > 50 ? 3 : 2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.c) {
            textPaint.setTextSize(g0.L(gz.W0 - this.b));
        }
        textPaint.setColor(j6.x0(null, j6.Vc, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
