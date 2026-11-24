// default package

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class sp extends tg2 {
    public boolean E;
    public final rp r;
    public Drawable s;
    public ColorStateList w;
    public PorterDuff.Mode x;
    public boolean y;

    public sp(rp rpVar) {
        super((Object) rpVar, (byte) 1);
        this.w = null;
        this.x = null;
        this.y = false;
        this.E = false;
        this.r = rpVar;
    }

    @Override // tg2
    public final void M(AttributeSet attributeSet, int i) {
        super.M(attributeSet, R.attr.seekBarStyle);
        rp rpVar = this.r;
        Context context = rpVar.getContext();
        int[] iArr = jy8.g;
        vk9 v = vk9.v(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) v.c;
        jdc.j(rpVar, rpVar.getContext(), iArr, attributeSet, (TypedArray) v.c, R.attr.seekBarStyle);
        Drawable p = v.p(0);
        if (p != null) {
            rpVar.setThumb(p);
        }
        Drawable n = v.n(1);
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.s = n;
        if (n != null) {
            n.setCallback(rpVar);
            n.setLayoutDirection(rpVar.getLayoutDirection());
            if (n.isStateful()) {
                n.setState(rpVar.getDrawableState());
            }
            e0();
        }
        rpVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.x = lq3.b(typedArray.getInt(3, -1), this.x);
            this.E = true;
        }
        if (typedArray.hasValue(2)) {
            this.w = v.m(2);
            this.y = true;
        }
        v.y();
        e0();
    }

    public final void e0() {
        Drawable drawable = this.s;
        if (drawable != null) {
            if (this.y || this.E) {
                Drawable mutate = drawable.mutate();
                this.s = mutate;
                if (this.y) {
                    mutate.setTintList(this.w);
                }
                if (this.E) {
                    this.s.setTintMode(this.x);
                }
                if (this.s.isStateful()) {
                    this.s.setState(this.r.getDrawableState());
                }
            }
        }
    }

    public final void f0(Canvas canvas) {
        if (this.s != null) {
            int max = this.r.getMax();
            if (max > 1) {
                int intrinsicWidth = this.s.getIntrinsicWidth();
                int intrinsicHeight = this.s.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.s.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.s.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
