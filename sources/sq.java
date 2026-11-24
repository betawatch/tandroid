// default package

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sq extends hi2 {
    public boolean E;
    public final rq r;
    public Drawable s;
    public ColorStateList w;
    public PorterDuff.Mode x;
    public boolean y;

    public sq(rq rqVar) {
        super(rqVar);
        this.w = null;
        this.x = null;
        this.y = false;
        this.E = false;
        this.r = rqVar;
    }

    @Override // hi2
    public final void E(AttributeSet attributeSet, int i) {
        super.E(attributeSet, R.attr.seekBarStyle);
        rq rqVar = this.r;
        Context context = rqVar.getContext();
        int[] iArr = k09.g;
        wm9 v = wm9.v(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) v.c;
        kfc.j(rqVar, rqVar.getContext(), iArr, attributeSet, (TypedArray) v.c, R.attr.seekBarStyle);
        Drawable m = v.m(0);
        if (m != null) {
            rqVar.setThumb(m);
        }
        Drawable j = v.j(1);
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.s = j;
        if (j != null) {
            j.setCallback(rqVar);
            j.setLayoutDirection(rqVar.getLayoutDirection());
            if (j.isStateful()) {
                j.setState(rqVar.getDrawableState());
            }
            Z();
        }
        rqVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.x = vr3.b(typedArray.getInt(3, -1), this.x);
            this.E = true;
        }
        if (typedArray.hasValue(2)) {
            this.w = v.i(2);
            this.y = true;
        }
        v.y();
        Z();
    }

    public final void Z() {
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

    public final void a0(Canvas canvas) {
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
