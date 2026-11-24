// default package

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public abstract class zo0 extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final lm c;
    public final kl d;
    public kp e;
    public final xo0[] f;
    public xo0 h;
    public p8c n;
    public Runnable r;

    public zo0(Context context, wjb wjbVar) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        s33 s33Var = s33.h;
        this.c = new lm(this, 0L, 320L, s33Var);
        this.d = new kl(this, 320L, s33Var, 0);
        kp kpVar = new kp((byte) 2, false);
        kpVar.c = new yo0();
        kpVar.d = new yo0();
        this.e = kpVar;
        this.f = new xo0[]{new xo0(this), new xo0(this)};
        setWillNotDraw(false);
        paint2.setColor(bkb.p1(0.1f, -16777216));
        kp kpVar2 = this.e;
        int v0 = bkb.v0(bkb.c6, wjbVar);
        kpVar2.b = v0;
        paint.setColor(v0);
    }

    public static void b(gn gnVar, yo0 yo0Var, boolean z) {
        gnVar.a();
        if (yo0Var.f == 0) {
            gnVar.t(yo0Var.e, z, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) yo0Var.e);
        spannableStringBuilder.setSpan(new gm(yo0Var.f, 1.4f, gnVar.a.getFontMetricsInt()), 0, 1, 33);
        gnVar.t(spannableStringBuilder, z, true);
    }

    public final xo0 a(float f, float f2) {
        int i = 0;
        while (true) {
            xo0[] xo0VarArr = this.f;
            if (i >= xo0VarArr.length) {
                return null;
            }
            kp kpVar = this.e;
            yo0 yo0Var = (yo0) (i == 0 ? kpVar.c : kpVar.d);
            if (xo0VarArr[i].a.contains(f, f2) && yo0Var.a && yo0Var.b) {
                return xo0VarArr[i];
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        wd1 wd1Var;
        float f;
        float e;
        ih2 ih2Var;
        float f2;
        float e2;
        float e3;
        float f3;
        zo0 zo0Var;
        ff0 ff0Var;
        int i;
        zo0 zo0Var2 = this;
        float height = zo0Var2.getHeight() - zo0Var2.c.e(false, zo0Var2.getTotalHeight());
        canvas.drawRect(0.0f, height - 1.0f, zo0Var2.getWidth(), height, zo0Var2.b);
        int a = zo0Var2.d.a(zo0Var2.e.b, false);
        Paint paint = zo0Var2.a;
        paint.setColor(a);
        canvas.drawRect(0.0f, height, zo0Var2.getWidth(), zo0Var2.getHeight(), paint);
        float f4 = height;
        String str = ((yo0) zo0Var2.e.d).i;
        xo0[] xo0VarArr = zo0Var2.f;
        int i2 = 1;
        int i3 = xo0VarArr[1].b.c < xo0VarArr[0].b.c ? 1 : 0;
        int i4 = i3;
        while (true) {
            if (i3 != 0) {
                if (i4 < 0) {
                    return;
                }
            } else if (i4 > i2) {
                return;
            }
            xo0 xo0Var = xo0VarArr[i4];
            kp kpVar = zo0Var2.e;
            yo0 yo0Var = (yo0) (i4 == 0 ? kpVar.c : kpVar.d);
            lm lmVar = xo0Var.b;
            wd1 wd1Var2 = xo0Var.p;
            Paint paint2 = xo0Var.k;
            ff0 ff0Var2 = xo0Var.n;
            ih2 ih2Var2 = xo0Var.o;
            kl klVar = xo0Var.g;
            gn gnVar = xo0Var.l;
            xo0[] xo0VarArr2 = xo0VarArr;
            RectF rectF = xo0Var.a;
            float f5 = f4;
            float d = lmVar.d(yo0Var.a);
            boolean z = yo0Var.a;
            int i5 = i3;
            lm lmVar2 = xo0Var.c;
            int i6 = i4;
            if (z) {
                kp kpVar2 = zo0Var2.e;
                wd1Var = wd1Var2;
                if (((yo0) kpVar2.d).a && ((yo0) kpVar2.c).a) {
                    f = (!"left".equalsIgnoreCase(str) ? !(!"right".equalsIgnoreCase(str) || i6 == 0) : i6 == 0) ? 0 : 1;
                } else {
                    f = 0.0f;
                }
                e = lmVar2.e(false, f);
            } else {
                e = lmVar2.c;
                wd1Var = wd1Var2;
            }
            boolean z2 = yo0Var.a;
            lm lmVar3 = xo0Var.d;
            if (z2) {
                kp kpVar3 = zo0Var2.e;
                ih2Var = ih2Var2;
                if (((yo0) kpVar3.d).a && ((yo0) kpVar3.c).a) {
                    f2 = (!"top".equalsIgnoreCase(str) ? !(!"bottom".equalsIgnoreCase(str) || i6 == 0) : i6 == 0) ? 0 : 1;
                } else {
                    f2 = 0.0f;
                }
                e2 = lmVar3.e(false, f2);
            } else {
                e2 = lmVar3.c;
                ih2Var = ih2Var2;
            }
            boolean z3 = yo0Var.a;
            lm lmVar4 = xo0Var.e;
            if (z3) {
                kp kpVar4 = zo0Var2.e;
                e3 = lmVar4.e(false, (((yo0) kpVar4.d).a && ((yo0) kpVar4.c).a && ("left".equalsIgnoreCase(str) || "right".equalsIgnoreCase(str))) ? 0.0f : 1.0f);
            } else {
                e3 = lmVar4.c;
            }
            float R1 = gl.R1((getWidth() - gl.L(26.0f)) / 2.0f, getWidth() - gl.L(16.0f), e3);
            float L = gl.L(44.0f);
            float f6 = R1 / 2.0f;
            float R12 = gl.R1(gl.L(8.0f), ((getWidth() - gl.L(26.0f)) / 2.0f) + gl.L(18.0f), e) + f6;
            float f7 = L / 2.0f;
            float U1 = f5 + gl.U1(e2, gl.L(7.0f), gl.L(58.0f)) + f7;
            rectF.set(R12 - f6, U1 - f7, f6 + R12, f7 + U1);
            float d2 = xo0Var.h.d(yo0Var.c);
            float d3 = xo0Var.i.d(yo0Var.d);
            canvas.save();
            float R13 = gl.R1(0.7f, 1.0f, d) * xo0Var.j.a(0.02f);
            canvas.scale(R13, R13, R12, U1);
            paint2.setColor(bkb.p1(d, xo0Var.f.a(yo0Var.g, false)));
            canvas.drawRoundRect(rectF, gl.L(9.0f), gl.L(9.0f), paint2);
            if (d2 < 1.0f) {
                canvas.save();
                float f8 = 1.0f - d2;
                float R14 = gl.R1(0.75f, 1.0f, f8);
                canvas.scale(R14, R14, R12, U1);
                canvas.translate(0.0f, gl.L(-10.0f) * d2);
                float f9 = f8 * d;
                int p1 = bkb.p1(f9, klVar.a(yo0Var.h, false));
                if (gnVar.a0 != p1) {
                    gnVar.a0 = p1;
                    gnVar.b0 = new PorterDuffColorFilter(p1, PorterDuff.Mode.SRC_IN);
                }
                gnVar.u(bkb.p1(f9, klVar.a(yo0Var.h, false)));
                gnVar.p(rectF);
                gnVar.draw(canvas);
                canvas.restore();
            }
            if (d2 > 0.0f) {
                canvas.save();
                float R15 = gl.R1(0.75f, 1.0f, d2);
                canvas.scale(R15, R15, R12, U1);
                canvas.translate(0.0f, (1.0f - d2) * gl.L(10.0f));
                ih2 ih2Var3 = ih2Var;
                ih2Var3.b(bkb.p1(d2 * d, klVar.a(yo0Var.h, false)));
                ih2Var3.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                ih2Var3.draw(canvas);
                canvas.restore();
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
            }
            if (d3 > f3) {
                int p12 = bkb.p1(d * d3, klVar.a(yo0Var.h, false));
                wd1 wd1Var3 = wd1Var;
                wd1Var3.b(p12, 64);
                zo0Var = this;
                wd1Var3.a(gl.L(8.0f), canvas, rectF, zo0Var);
            } else {
                zo0Var = this;
            }
            if (xo0Var.m != bkb.p1(0.15f, yo0Var.h)) {
                int p13 = bkb.p1(0.15f, yo0Var.h);
                xo0Var.m = p13;
                ff0Var = ff0Var2;
                i = 1;
                bkb.F1(ff0Var, p13, true);
            } else {
                ff0Var = ff0Var2;
                i = 1;
            }
            ff0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            ff0Var.draw(canvas);
            canvas.restore();
            i4 = i6 + (i5 != 0 ? -1 : i);
            zo0Var2 = zo0Var;
            i2 = i;
            xo0VarArr = xo0VarArr2;
            f4 = f5;
            i3 = i5;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.c.c;
    }

    public int getTotalHeight() {
        kp kpVar = this.e;
        boolean z = ((yo0) kpVar.c).a;
        int i = (z || ((yo0) kpVar.d).a) ? 1 : 0;
        if (z) {
            yo0 yo0Var = (yo0) kpVar.d;
            if (yo0Var.a && ("top".equalsIgnoreCase(yo0Var.i) || "bottom".equalsIgnoreCase(((yo0) this.e.d).i))) {
                i++;
            }
        }
        if (i == 0) {
            return 0;
        }
        return i == 1 ? gl.L(58.0f) : gl.L(109.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), ug8.E(109.0f, 1, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p8c p8cVar;
        if (motionEvent.getAction() == 0) {
            xo0 a = a(motionEvent.getX(), motionEvent.getY());
            this.h = a;
            if (a != null) {
                a.j.c(true);
                this.h.n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.n.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                xo0 a2 = a(motionEvent.getX(), motionEvent.getY());
                xo0 xo0Var = this.h;
                if (a2 == xo0Var && (p8cVar = this.n) != null) {
                    p8cVar.a(Boolean.valueOf(xo0Var == this.f[0]));
                }
            }
            this.h.j.c(false);
            this.h.n.setState(new int[0]);
            this.h = null;
        }
        return this.h != null;
    }

    public void setOnButtonClickListener(p8c p8cVar) {
        this.n = p8cVar;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.r = runnable;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        xo0[] xo0VarArr = this.f;
        xo0 xo0Var = xo0VarArr[0];
        if (xo0Var.n != drawable && xo0Var.o != drawable) {
            xo0 xo0Var2 = xo0VarArr[1];
            if (xo0Var2.n != drawable && xo0Var2.o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
