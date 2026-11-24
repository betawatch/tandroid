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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class zp0 extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final ln c;
    public final km d;
    public kq e;
    public final xp0[] f;
    public xp0 h;
    public qac n;
    public Runnable r;

    public zp0(Context context, ylb ylbVar) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        d53 d53Var = d53.h;
        this.c = new ln(this, 0L, 320L, d53Var);
        this.d = new km(this, 320L, d53Var, 0);
        kq kqVar = new kq((byte) 2, false);
        kqVar.c = new yp0();
        kqVar.d = new yp0();
        this.e = kqVar;
        this.f = new xp0[]{new xp0(this), new xp0(this)};
        setWillNotDraw(false);
        paint2.setColor(cmb.p1(0.1f, -16777216));
        kq kqVar2 = this.e;
        int v0 = cmb.v0(cmb.c6, ylbVar);
        kqVar2.b = v0;
        paint.setColor(v0);
    }

    public static void b(ho hoVar, yp0 yp0Var, boolean z) {
        hoVar.a();
        if (yp0Var.f == 0) {
            hoVar.t(yp0Var.e, z, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) yp0Var.e);
        spannableStringBuilder.setSpan(new gn(yp0Var.f, 1.4f, hoVar.a.getFontMetricsInt()), 0, 1, 33);
        hoVar.t(spannableStringBuilder, z, true);
    }

    public final xp0 a(float f, float f2) {
        int i = 0;
        while (true) {
            xp0[] xp0VarArr = this.f;
            if (i >= xp0VarArr.length) {
                return null;
            }
            kq kqVar = this.e;
            yp0 yp0Var = (yp0) (i == 0 ? kqVar.c : kqVar.d);
            if (xp0VarArr[i].a.contains(f, f2) && yp0Var.a && yp0Var.b) {
                return xp0VarArr[i];
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ef1 ef1Var;
        float f;
        float e;
        wi2 wi2Var;
        float f2;
        float e2;
        float e3;
        float f3;
        zp0 zp0Var;
        fg0 fg0Var;
        int i;
        zp0 zp0Var2 = this;
        float height = zp0Var2.getHeight() - zp0Var2.c.e(false, zp0Var2.getTotalHeight());
        canvas.drawRect(0.0f, height - 1.0f, zp0Var2.getWidth(), height, zp0Var2.b);
        int a = zp0Var2.d.a(zp0Var2.e.b, false);
        Paint paint = zp0Var2.a;
        paint.setColor(a);
        canvas.drawRect(0.0f, height, zp0Var2.getWidth(), zp0Var2.getHeight(), paint);
        float f4 = height;
        String str = ((yp0) zp0Var2.e.d).i;
        xp0[] xp0VarArr = zp0Var2.f;
        int i2 = 1;
        int i3 = xp0VarArr[1].b.c < xp0VarArr[0].b.c ? 1 : 0;
        int i4 = i3;
        while (true) {
            if (i3 != 0) {
                if (i4 < 0) {
                    return;
                }
            } else if (i4 > i2) {
                return;
            }
            xp0 xp0Var = xp0VarArr[i4];
            kq kqVar = zp0Var2.e;
            yp0 yp0Var = (yp0) (i4 == 0 ? kqVar.c : kqVar.d);
            ln lnVar = xp0Var.b;
            ef1 ef1Var2 = xp0Var.p;
            Paint paint2 = xp0Var.k;
            fg0 fg0Var2 = xp0Var.n;
            wi2 wi2Var2 = xp0Var.o;
            km kmVar = xp0Var.g;
            ho hoVar = xp0Var.l;
            xp0[] xp0VarArr2 = xp0VarArr;
            RectF rectF = xp0Var.a;
            float f5 = f4;
            float d = lnVar.d(yp0Var.a);
            boolean z = yp0Var.a;
            int i5 = i3;
            ln lnVar2 = xp0Var.c;
            int i6 = i4;
            if (z) {
                kq kqVar2 = zp0Var2.e;
                ef1Var = ef1Var2;
                if (((yp0) kqVar2.d).a && ((yp0) kqVar2.c).a) {
                    f = (!"left".equalsIgnoreCase(str) ? !(!"right".equalsIgnoreCase(str) || i6 == 0) : i6 == 0) ? 0 : 1;
                } else {
                    f = 0.0f;
                }
                e = lnVar2.e(false, f);
            } else {
                e = lnVar2.c;
                ef1Var = ef1Var2;
            }
            boolean z2 = yp0Var.a;
            ln lnVar3 = xp0Var.d;
            if (z2) {
                kq kqVar3 = zp0Var2.e;
                wi2Var = wi2Var2;
                if (((yp0) kqVar3.d).a && ((yp0) kqVar3.c).a) {
                    f2 = (!"top".equalsIgnoreCase(str) ? !(!"bottom".equalsIgnoreCase(str) || i6 == 0) : i6 == 0) ? 0 : 1;
                } else {
                    f2 = 0.0f;
                }
                e2 = lnVar3.e(false, f2);
            } else {
                e2 = lnVar3.c;
                wi2Var = wi2Var2;
            }
            boolean z3 = yp0Var.a;
            ln lnVar4 = xp0Var.e;
            if (z3) {
                kq kqVar4 = zp0Var2.e;
                e3 = lnVar4.e(false, (((yp0) kqVar4.d).a && ((yp0) kqVar4.c).a && ("left".equalsIgnoreCase(str) || "right".equalsIgnoreCase(str))) ? 0.0f : 1.0f);
            } else {
                e3 = lnVar4.c;
            }
            float R1 = gm.R1((getWidth() - gm.L(26.0f)) / 2.0f, getWidth() - gm.L(16.0f), e3);
            float L = gm.L(44.0f);
            float f6 = R1 / 2.0f;
            float R12 = gm.R1(gm.L(8.0f), ((getWidth() - gm.L(26.0f)) / 2.0f) + gm.L(18.0f), e) + f6;
            float f7 = L / 2.0f;
            float U1 = f5 + gm.U1(e2, gm.L(7.0f), gm.L(58.0f)) + f7;
            rectF.set(R12 - f6, U1 - f7, f6 + R12, f7 + U1);
            float d2 = xp0Var.h.d(yp0Var.c);
            float d3 = xp0Var.i.d(yp0Var.d);
            canvas.save();
            float R13 = gm.R1(0.7f, 1.0f, d) * xp0Var.j.a(0.02f);
            canvas.scale(R13, R13, R12, U1);
            paint2.setColor(cmb.p1(d, xp0Var.f.a(yp0Var.g, false)));
            canvas.drawRoundRect(rectF, gm.L(9.0f), gm.L(9.0f), paint2);
            if (d2 < 1.0f) {
                canvas.save();
                float f8 = 1.0f - d2;
                float R14 = gm.R1(0.75f, 1.0f, f8);
                canvas.scale(R14, R14, R12, U1);
                canvas.translate(0.0f, gm.L(-10.0f) * d2);
                float f9 = f8 * d;
                int p1 = cmb.p1(f9, kmVar.a(yp0Var.h, false));
                if (hoVar.a0 != p1) {
                    hoVar.a0 = p1;
                    hoVar.b0 = new PorterDuffColorFilter(p1, PorterDuff.Mode.SRC_IN);
                }
                hoVar.u(cmb.p1(f9, kmVar.a(yp0Var.h, false)));
                hoVar.p(rectF);
                hoVar.draw(canvas);
                canvas.restore();
            }
            if (d2 > 0.0f) {
                canvas.save();
                float R15 = gm.R1(0.75f, 1.0f, d2);
                canvas.scale(R15, R15, R12, U1);
                canvas.translate(0.0f, (1.0f - d2) * gm.L(10.0f));
                wi2 wi2Var3 = wi2Var;
                wi2Var3.b(cmb.p1(d2 * d, kmVar.a(yp0Var.h, false)));
                wi2Var3.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                wi2Var3.draw(canvas);
                canvas.restore();
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
            }
            if (d3 > f3) {
                int p12 = cmb.p1(d * d3, kmVar.a(yp0Var.h, false));
                ef1 ef1Var3 = ef1Var;
                ef1Var3.b(p12, 64);
                zp0Var = this;
                ef1Var3.a(gm.L(8.0f), canvas, rectF, zp0Var);
            } else {
                zp0Var = this;
            }
            if (xp0Var.m != cmb.p1(0.15f, yp0Var.h)) {
                int p13 = cmb.p1(0.15f, yp0Var.h);
                xp0Var.m = p13;
                fg0Var = fg0Var2;
                i = 1;
                cmb.F1(fg0Var, p13, true);
            } else {
                fg0Var = fg0Var2;
                i = 1;
            }
            fg0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            fg0Var.draw(canvas);
            canvas.restore();
            i4 = i6 + (i5 != 0 ? -1 : i);
            zp0Var2 = zp0Var;
            i2 = i;
            xp0VarArr = xp0VarArr2;
            f4 = f5;
            i3 = i5;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.c.c;
    }

    public int getTotalHeight() {
        kq kqVar = this.e;
        boolean z = ((yp0) kqVar.c).a;
        int i = (z || ((yp0) kqVar.d).a) ? 1 : 0;
        if (z) {
            yp0 yp0Var = (yp0) kqVar.d;
            if (yp0Var.a && ("top".equalsIgnoreCase(yp0Var.i) || "bottom".equalsIgnoreCase(((yp0) this.e.d).i))) {
                i++;
            }
        }
        if (i == 0) {
            return 0;
        }
        return i == 1 ? gm.L(58.0f) : gm.L(109.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), wi8.E(109.0f, 1, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qac qacVar;
        if (motionEvent.getAction() == 0) {
            xp0 a = a(motionEvent.getX(), motionEvent.getY());
            this.h = a;
            if (a != null) {
                a.j.c(true);
                this.h.n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.n.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                xp0 a2 = a(motionEvent.getX(), motionEvent.getY());
                xp0 xp0Var = this.h;
                if (a2 == xp0Var && (qacVar = this.n) != null) {
                    qacVar.a(Boolean.valueOf(xp0Var == this.f[0]));
                }
            }
            this.h.j.c(false);
            this.h.n.setState(new int[0]);
            this.h = null;
        }
        return this.h != null;
    }

    public void setOnButtonClickListener(qac qacVar) {
        this.n = qacVar;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.r = runnable;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        xp0[] xp0VarArr = this.f;
        xp0 xp0Var = xp0VarArr[0];
        if (xp0Var.n != drawable && xp0Var.o != drawable) {
            xp0 xp0Var2 = xp0VarArr[1];
            if (xp0Var2.n != drawable && xp0Var2.o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
