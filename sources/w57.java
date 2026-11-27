// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class w57 {
    public SpannableStringBuilder a;
    public int b;
    public Drawable c;
    public float d;
    public final int e;
    public final int f;
    public int g = -1;
    public int h = -1;
    public float i = 4.66f;

    public w57(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    public final CharSequence a(Context context, vnb vnbVar) {
        SpannableStringBuilder spannableStringBuilder = this.a;
        int i = this.f;
        if (spannableStringBuilder != null && this.c != null && hl.p == this.d) {
            if (this.b != aob.v0(i, vnbVar)) {
                Drawable drawable = this.c;
                int v0 = aob.v0(i, vnbVar);
                this.b = v0;
                drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
            return this.a;
        }
        if (context == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
        this.d = hl.p;
        Drawable mutate = context.getResources().getDrawable(this.e).mutate();
        this.c = mutate;
        int v02 = aob.v0(i, vnbVar);
        this.b = v02;
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        int i2 = this.g;
        int intrinsicWidth = i2 <= 0 ? this.c.getIntrinsicWidth() : hl.L(i2);
        int i3 = this.h;
        int intrinsicHeight = i3 <= 0 ? this.c.getIntrinsicHeight() : hl.L(i3);
        int L = hl.L(this.i);
        this.c.setBounds(0, L, intrinsicWidth, intrinsicHeight + L);
        spannableStringBuilder2.setSpan(new ImageSpan(this.c, 2), 0, 1, 33);
        spannableStringBuilder2.setSpan(new mf3(hl.L(2.0f)), 1, 2, 33);
        this.a = spannableStringBuilder2;
        return spannableStringBuilder2;
    }
}
