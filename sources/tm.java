// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class tm extends Drawable implements dn {
    public boolean E;
    public yxa F;
    public Integer G;
    public int H;
    public PorterDuffColorFilter I;
    public int J;
    public int K;
    public final Rect L;
    public final b1 M;
    public boolean a;
    public final byte b;
    public final OvershootInterpolator c;
    public final ln d;
    public final ln e;
    public final Drawable[] f;
    public View h;
    public vz9 n;
    public final boolean r;
    public final int s;
    public int w;
    public boolean x;
    public Integer y;

    /* JADX WARN: Multi-variable type inference failed */
    public tm(int i, int i2, View view, boolean z) {
        this.a = false;
        this.c = new OvershootInterpolator(2.0f);
        d53 d53Var = d53.g;
        ln lnVar = new ln(300L, (View) null, d53Var);
        this.d = lnVar;
        ln lnVar2 = new ln(300L, (View) null, d53Var);
        this.e = lnVar2;
        this.f = new Drawable[2];
        this.w = nm7.d4;
        this.L = new Rect();
        this.M = new b1(this, (byte) 17);
        lnVar.a = view;
        this.h = view;
        lnVar2.a = view;
        this.s = i;
        this.b = i2;
        this.r = z;
    }

    public final void a() {
        if (this.x) {
            return;
        }
        this.x = true;
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if (drawable instanceof vm) {
            ((vm) drawable).a(this);
        }
        Drawable drawable2 = drawableArr[1];
        if (drawable2 instanceof vm) {
            ((vm) drawable2).a(this);
        }
    }

    public final void b() {
        if (this.x) {
            this.x = false;
            Drawable[] drawableArr = this.f;
            Drawable drawable = drawableArr[0];
            if (drawable instanceof vm) {
                ((vm) drawable).n(this);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof vm) {
                ((vm) drawable2).n(this);
            }
        }
    }

    public final Drawable c() {
        return this.f[0];
    }

    public final boolean d() {
        return this.f[0] == null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float e = this.d.e(false, 1.0f);
        Rect bounds = getBounds();
        Rect rect = this.L;
        rect.set(bounds);
        rect.offset(this.J, this.K);
        float d = this.e.d(this.E);
        b1 b1Var = this.M;
        if (d > 0.0f) {
            yxa yxaVar = this.F;
            yxaVar.c.set(rect);
            yxaVar.e();
            this.F.d();
            yxa yxaVar2 = this.F;
            Integer num = this.G;
            yxaVar2.a(canvas, cmb.p1(d, num == null ? -1 : num.intValue()));
            fi2.d().a(15, b1Var);
        } else {
            fi2.d().g(b1Var);
        }
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[1];
        int i = this.s;
        if (drawable != null && e < 1.0f) {
            drawable.setAlpha((int) ((1.0f - e) * this.w));
            int intrinsicWidth = drawableArr[1].getIntrinsicWidth() < 0 ? i : drawableArr[1].getIntrinsicWidth();
            int intrinsicHeight = drawableArr[1].getIntrinsicHeight() < 0 ? i : drawableArr[1].getIntrinsicHeight();
            Drawable drawable2 = drawableArr[1];
            if (drawable2 instanceof vm) {
                drawable2.setBounds(rect);
            } else if (this.a) {
                int i2 = intrinsicWidth / 2;
                int i3 = intrinsicHeight / 2;
                drawable2.setBounds(rect.centerX() - i2, rect.centerY() - i3, rect.centerX() + i2, rect.centerY() + i3);
            } else {
                int i4 = intrinsicHeight / 2;
                drawable2.setBounds(rect.left, rect.centerY() - i4, rect.left + intrinsicWidth, rect.centerY() + i4);
            }
            drawableArr[1].setColorFilter(this.I);
            drawableArr[1].draw(canvas);
            drawableArr[1].setColorFilter(null);
        }
        if (drawableArr[0] != null) {
            canvas.save();
            int intrinsicWidth2 = drawableArr[0].getIntrinsicWidth() < 0 ? i : drawableArr[0].getIntrinsicWidth();
            if (drawableArr[0].getIntrinsicHeight() >= 0) {
                i = drawableArr[0].getIntrinsicHeight();
            }
            Drawable drawable3 = drawableArr[0];
            boolean z = drawable3 instanceof vm;
            OvershootInterpolator overshootInterpolator = this.c;
            if (z) {
                mm mmVar = ((vm) drawable3).k;
                if (mmVar != null) {
                    mmVar.q0(gm.L(4.0f));
                }
                if (e < 1.0f) {
                    float interpolation = overshootInterpolator.getInterpolation(e);
                    canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                }
                drawableArr[0].setBounds(rect);
            } else if (this.a) {
                if (e < 1.0f) {
                    float interpolation2 = overshootInterpolator.getInterpolation(e);
                    canvas.scale(interpolation2, interpolation2, rect.centerX(), rect.centerY());
                }
                int i5 = intrinsicWidth2 / 2;
                int i6 = i / 2;
                drawableArr[0].setBounds(rect.centerX() - i5, rect.centerY() - i6, rect.centerX() + i5, rect.centerY() + i6);
            } else {
                if (e < 1.0f) {
                    float interpolation3 = overshootInterpolator.getInterpolation(e);
                    canvas.scale(interpolation3, interpolation3, (intrinsicWidth2 / 2.0f) + rect.left, rect.centerY());
                }
                int i7 = i / 2;
                drawableArr[0].setBounds(rect.left, rect.centerY() - i7, rect.left + intrinsicWidth2, rect.centerY() + i7);
            }
            drawableArr[0].setAlpha(this.w);
            drawableArr[0].setColorFilter(this.I);
            drawableArr[0].draw(canvas);
            drawableArr[0].setColorFilter(null);
            canvas.restore();
        }
    }

    public final float e() {
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[1];
        ln lnVar = this.d;
        return (drawable != null ? 1.0f - lnVar.c : 0.0f) + (drawableArr[0] != null ? lnVar.c : 0.0f);
    }

    public final void f() {
        vm vmVar;
        mm mmVar;
        Drawable drawable = this.f[0];
        if (!(drawable instanceof vm) || (mmVar = (vmVar = (vm) drawable).k) == null) {
            return;
        }
        vmVar.v(mmVar);
        mmVar.w0(false);
    }

    public final void g(Drawable drawable, boolean z) {
        Drawable[] drawableArr = this.f;
        if (drawableArr[0] == drawable) {
            return;
        }
        ln lnVar = this.d;
        if (z) {
            lnVar.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.x && (drawable2 instanceof vm)) {
                    ((vm) drawable2).n(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            drawableArr[0] = drawable;
        } else {
            lnVar.e(true, 1.0f);
            boolean z2 = this.x;
            if (z2) {
                b();
            }
            drawableArr[0] = drawable;
            if (z2) {
                a();
            }
        }
        this.G = null;
        this.I = null;
        this.H = 0;
        f();
        invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h(TLRPC.Document document, int i, boolean z) {
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof vm) && document != null && ((vm) drawable).h() == document.id) {
            return;
        }
        ln lnVar = this.d;
        if (z) {
            lnVar.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (drawable2 instanceof vm) {
                    ((vm) drawable2).n(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            if (document != null) {
                Integer num = this.y;
                vm l = vm.l(num != null ? num.intValue() : z8c.t0, i, document);
                drawableArr[0] = l;
                if (this.x) {
                    l.a(this);
                }
            } else {
                drawableArr[0] = null;
            }
        } else {
            lnVar.e(true, 1.0f);
            boolean z2 = this.x;
            if (z2) {
                b();
            }
            if (document != null) {
                Integer num2 = this.y;
                drawableArr[0] = vm.l(num2 != null ? num2.intValue() : z8c.t0, i, document);
            } else {
                drawableArr[0] = null;
            }
            if (z2) {
                a();
            }
        }
        this.G = null;
        this.I = null;
        this.H = 0;
        f();
        invalidate();
    }

    public final void i(TLRPC.Document document, boolean z) {
        h(document, this.b, z);
    }

    public void invalidate() {
        View view = this.h;
        if (view != null) {
            if (this.r && (view.getParent() instanceof View)) {
                ((View) this.h.getParent()).invalidate();
            } else {
                this.h.invalidate();
            }
        }
        vz9 vz9Var = this.n;
        if (vz9Var != null) {
            vz9Var.invalidate();
        }
        invalidateSelf();
    }

    public final boolean j(long j, boolean z) {
        Drawable[] drawableArr = this.f;
        Drawable drawable = drawableArr[0];
        if ((drawable instanceof vm) && ((vm) drawable).h() == j) {
            return false;
        }
        byte b = this.b;
        ln lnVar = this.d;
        if (z) {
            lnVar.e(true, 0.0f);
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                if (this.x && (drawable2 instanceof vm)) {
                    ((vm) drawable2).n(this);
                }
                drawableArr[1] = null;
            }
            drawableArr[1] = drawableArr[0];
            Integer num = this.y;
            vm m = vm.m(num != null ? num.intValue() : z8c.t0, j, null, b);
            drawableArr[0] = m;
            if (this.x) {
                m.a(this);
            }
        } else {
            lnVar.e(true, 1.0f);
            boolean z2 = this.x;
            if (z2) {
                b();
            }
            Integer num2 = this.y;
            drawableArr[0] = vm.m(num2 != null ? num2.intValue() : z8c.t0, j, null, b);
            if (z2) {
                a();
            }
        }
        this.G = null;
        this.I = null;
        this.H = 0;
        f();
        invalidate();
        return true;
    }

    public final void k(Integer num) {
        PorterDuffColorFilter porterDuffColorFilter;
        Integer num2 = this.G;
        if (num2 == null) {
            if (num == null) {
                return;
            }
        } else if (num2.equals(num)) {
            return;
        }
        this.G = num;
        if (num == null) {
            porterDuffColorFilter = null;
        } else {
            if (this.H == num.intValue()) {
                return;
            }
            int intValue = num.intValue();
            this.H = intValue;
            porterDuffColorFilter = new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
        }
        this.I = porterDuffColorFilter;
    }

    public final void l(View view) {
        this.d.a = view;
        this.e.a = view;
        this.h = view;
    }

    public final void m(boolean z, boolean z2) {
        if (this.E == z) {
            return;
        }
        if (z2) {
            if (this.F == null) {
                this.F = new yxa(1, 8);
            }
            this.E = z;
            invalidate();
            return;
        }
        this.E = z;
        yxa yxaVar = this.F;
        if (z) {
            if (yxaVar == null) {
                this.F = new yxa(1, 8);
            }
        } else if (yxaVar != null) {
            this.F = null;
        }
        this.e.f(z, true);
        invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.w = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public tm(int i, View view, boolean z) {
        this(i, 7, view, z);
    }

    public tm(int i, View view) {
        this(i, 7, view, false);
    }
}
