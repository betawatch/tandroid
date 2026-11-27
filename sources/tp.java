// default package

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class tp extends lh2 {
    public boolean E;
    public final sp r;
    public Drawable s;
    public ColorStateList w;
    public PorterDuff.Mode x;
    public boolean y;

    public tp(sp spVar) {
        super((Object) spVar, (byte) 1);
        this.w = null;
        this.x = null;
        this.y = false;
        this.E = false;
        this.r = spVar;
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

    @Override // lh2
    public final void z(AttributeSet attributeSet, int i) {
        super.z(attributeSet, R.attr.seekBarStyle);
        sp spVar = this.r;
        Context context = spVar.getContext();
        int[] iArr = w19.g;
        ko9 v = ko9.v(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) v.c;
        ihc.k(spVar, spVar.getContext(), iArr, attributeSet, (TypedArray) v.c, R.attr.seekBarStyle);
        Drawable p = v.p(0);
        if (p != null) {
            spVar.setThumb(p);
        }
        Drawable n = v.n(1);
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.s = n;
        if (n != null) {
            n.setCallback(spVar);
            n.setLayoutDirection(spVar.getLayoutDirection());
            if (n.isStateful()) {
                n.setState(spVar.getDrawableState());
            }
            Z();
        }
        spVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.x = cr3.b(typedArray.getInt(3, -1), this.x);
            this.E = true;
        }
        if (typedArray.hasValue(2)) {
            this.w = v.m(2);
            this.y = true;
        }
        v.y();
        Z();
    }
}
