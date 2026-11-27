// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
