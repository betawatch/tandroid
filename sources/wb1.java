// default package

import android.text.TextPaint;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wb1 implements rmc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TextPaint b;

    public /* synthetic */ wb1(TextPaint textPaint, byte b) {
        this.a = b;
        this.b = textPaint;
    }

    @Override // rmc
    public final void a(float f, float f2, int i) {
        this.b.setShadowLayer(f, 0.0f, f2, i);
    }

    public final float b(CharSequence charSequence) {
        byte b = this.a;
        TextPaint textPaint = this.b;
        switch (b) {
        }
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }
}
