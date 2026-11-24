// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p57 {
    public SpannableStringBuilder a;
    public int b;
    public Drawable c;
    public float d;
    public final int e;
    public final int f;
    public int g = -1;
    public int h = -1;
    public float i = 4.66f;

    public p57(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    public final CharSequence a(Context context, ylb ylbVar) {
        SpannableStringBuilder spannableStringBuilder = this.a;
        int i = this.f;
        if (spannableStringBuilder != null && this.c != null && gm.p == this.d) {
            if (this.b != cmb.v0(i, ylbVar)) {
                Drawable drawable = this.c;
                int v0 = cmb.v0(i, ylbVar);
                this.b = v0;
                drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
            return this.a;
        }
        if (context == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
        this.d = gm.p;
        Drawable mutate = context.getResources().getDrawable(this.e).mutate();
        this.c = mutate;
        int v02 = cmb.v0(i, ylbVar);
        this.b = v02;
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        int i2 = this.g;
        int intrinsicWidth = i2 <= 0 ? this.c.getIntrinsicWidth() : gm.L(i2);
        int i3 = this.h;
        int intrinsicHeight = i3 <= 0 ? this.c.getIntrinsicHeight() : gm.L(i3);
        int L = gm.L(this.i);
        this.c.setBounds(0, L, intrinsicWidth, intrinsicHeight + L);
        spannableStringBuilder2.setSpan(new ImageSpan(this.c, 2), 0, 1, 33);
        spannableStringBuilder2.setSpan(new fg3(gm.L(2.0f)), 1, 2, 33);
        this.a = spannableStringBuilder2;
        return spannableStringBuilder2;
    }
}
