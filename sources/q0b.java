// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q0b extends s09 implements vlb {
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public final /* synthetic */ u0b I;
    public int r;
    public float s;
    public ValueAnimator w;
    public boolean x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0b(u0b u0bVar, Context context) {
        super(context);
        ylb ylbVar = u0bVar.o2;
        this.I = u0bVar;
        this.x = false;
        this.E = 1.0f;
        k(u0bVar.E3 ? on2.p(cmb.v0(cmb.Ml, ylbVar), nm7.m1) : cmb.v0(cmb.Df, ylbVar));
        setScaleType(ImageView.ScaleType.CENTER);
        setLayerNum(null);
    }

    @Override // s09
    public final void c() {
        this.x = true;
        if (this.E < 1.0f) {
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.H = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, 1.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new n0b(this, (byte) 2));
            this.H.addListener(new p0b(this, (byte) 0));
            this.H.setDuration(320L);
            this.H.setInterpolator(d53.h);
            this.H.start();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isPressed()) {
            float f = this.F;
            if (f != 1.0f) {
                this.F = Utilities.i(((1000.0f / gm.r) / 100.0f) + f, 1.0f, 0.0f);
                invalidate();
                this.I.invalidate();
            }
        }
        float A = td4.A(1.0f, this.F, 0.15f, 0.85f) * this.E;
        if (A != 1.0f) {
            canvas.save();
            canvas.scale(A, A, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.draw(canvas);
        if (A != 1.0f) {
            canvas.restore();
        }
    }

    public final void j() {
        if (System.currentTimeMillis() - this.y > 250) {
            this.y = System.currentTimeMillis();
            p09 animatedDrawable = getAnimatedDrawable();
            if (animatedDrawable == null && getImageReceiver() != null) {
                animatedDrawable = getImageReceiver().y();
            }
            if (animatedDrawable != null) {
                animatedDrawable.stop();
                animatedDrawable.H(0);
                animatedDrawable.C(true);
            } else if (animatedDrawable == null) {
                setProgress(0.0f);
                d();
            }
        }
    }

    public final void k(int i) {
        if (this.r != i) {
            this.r = i;
            setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void l(boolean z, boolean z2) {
        if (Math.abs(this.s - (z ? 1.0f : 0.0f)) > 0.01f) {
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.w = null;
            }
            if (!z2) {
                m(z ? 1.0f : 0.0f);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, z ? 1.0f : 0.0f);
            this.w = ofFloat;
            ofFloat.addUpdateListener(new n0b(this, (byte) 1));
            this.w.addListener(new p0b(this, (byte) 1));
            this.w.setDuration(350L);
            this.w.setInterpolator(d53.h);
            this.w.start();
        }
    }

    public final void m(float f) {
        this.s = f;
        u0b u0bVar = this.I;
        ylb ylbVar = u0bVar.o2;
        if (u0bVar.E3) {
            k(on2.p(cmb.v0(cmb.Ml, ylbVar), (int) (gm.R1(0.4f, 0.8f, f) * 255.0f)));
        } else {
            k(on2.f(this.s, cmb.v0(cmb.Df, ylbVar), cmb.v0(cmb.Ff, ylbVar)));
        }
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        super.onMeasure(wi8.f(4.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        ValueAnimator valueAnimator;
        if (isPressed() != z) {
            super.setPressed(z);
            invalidate();
            this.I.invalidate();
            if (z && (valueAnimator = this.G) != null) {
                valueAnimator.removeAllListeners();
                this.G.cancel();
            }
            if (z) {
                return;
            }
            float f = this.F;
            if (f != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                this.G = ofFloat;
                ofFloat.addUpdateListener(new n0b(this, (byte) 0));
                this.G.addListener(new p0b(this, (byte) 2));
                b10.n(3.0f, this.G);
                this.G.setDuration(350L);
                this.G.start();
            }
        }
    }

    @Override // vlb
    public final void updateColors() {
        try {
            if (this.w == null) {
                m(this.s);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
