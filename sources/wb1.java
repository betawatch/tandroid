// default package

import android.text.TextPaint;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
