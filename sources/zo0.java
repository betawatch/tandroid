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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public abstract class zo0 extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final mm c;
    public final ll d;
    public lp e;
    public final xo0[] f;
    public xo0 h;
    public pcc n;
    public Runnable r;

    public zo0(Context context, vnb vnbVar) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        k43 k43Var = k43.h;
        this.c = new mm(this, 0L, 320L, k43Var);
        this.d = new ll(this, 320L, k43Var, 0);
        lp lpVar = new lp((byte) 2, false);
        lpVar.c = new yo0();
        lpVar.d = new yo0();
        this.e = lpVar;
        this.f = new xo0[]{new xo0(this), new xo0(this)};
        setWillNotDraw(false);
        paint2.setColor(aob.p1(0.1f, -16777216));
        lp lpVar2 = this.e;
        int v0 = aob.v0(aob.d6, vnbVar);
        lpVar2.b = v0;
        paint.setColor(v0);
    }

    public static void b(hn hnVar, yo0 yo0Var, boolean z) {
        hnVar.a();
        if (yo0Var.f == 0) {
            hnVar.t(yo0Var.e, z, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) yo0Var.e);
        spannableStringBuilder.setSpan(new hm(yo0Var.f, 1.4f, hnVar.a.getFontMetricsInt()), 0, 1, 33);
        hnVar.t(spannableStringBuilder, z, true);
    }

    public final xo0 a(float f, float f2) {
        int i = 0;
        while (true) {
            xo0[] xo0VarArr = this.f;
            if (i >= xo0VarArr.length) {
                return null;
            }
            lp lpVar = this.e;
            yo0 yo0Var = (yo0) (i == 0 ? lpVar.c : lpVar.d);
            if (xo0VarArr[i].a.contains(f, f2) && yo0Var.a && yo0Var.b) {
                return xo0VarArr[i];
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        fe1 fe1Var;
        float f;
        float e;
        di2 di2Var;
        float f2;
        float e2;
        float e3;
        float f3;
        zo0 zo0Var;
        hf0 hf0Var;
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
            lp lpVar = zo0Var2.e;
            yo0 yo0Var = (yo0) (i4 == 0 ? lpVar.c : lpVar.d);
            mm mmVar = xo0Var.b;
            fe1 fe1Var2 = xo0Var.p;
            Paint paint2 = xo0Var.k;
            hf0 hf0Var2 = xo0Var.n;
            di2 di2Var2 = xo0Var.o;
            ll llVar = xo0Var.g;
            hn hnVar = xo0Var.l;
            xo0[] xo0VarArr2 = xo0VarArr;
            RectF rectF = xo0Var.a;
            float f5 = f4;
            float d = mmVar.d(yo0Var.a);
            boolean z = yo0Var.a;
            int i5 = i3;
            mm mmVar2 = xo0Var.c;
            int i6 = i4;
            if (z) {
                lp lpVar2 = zo0Var2.e;
                fe1Var = fe1Var2;
                if (((yo0) lpVar2.d).a && ((yo0) lpVar2.c).a) {
                    f = (!"left".equalsIgnoreCase(str) ? !(!"right".equalsIgnoreCase(str) || i6 == 0) : i6 == 0) ? 0 : 1;
                } else {
                    f = 0.0f;
                }
                e = mmVar2.e(false, f);
            } else {
                e = mmVar2.c;
                fe1Var = fe1Var2;
            }
            boolean z2 = yo0Var.a;
            mm mmVar3 = xo0Var.d;
            if (z2) {
                lp lpVar3 = zo0Var2.e;
                di2Var = di2Var2;
                if (((yo0) lpVar3.d).a && ((yo0) lpVar3.c).a) {
                    f2 = (!"top".equalsIgnoreCase(str) ? !(!"bottom".equalsIgnoreCase(str) || i6 == 0) : i6 == 0) ? 0 : 1;
                } else {
                    f2 = 0.0f;
                }
                e2 = mmVar3.e(false, f2);
            } else {
                e2 = mmVar3.c;
                di2Var = di2Var2;
            }
            boolean z3 = yo0Var.a;
            mm mmVar4 = xo0Var.e;
            if (z3) {
                lp lpVar4 = zo0Var2.e;
                e3 = mmVar4.e(false, (((yo0) lpVar4.d).a && ((yo0) lpVar4.c).a && ("left".equalsIgnoreCase(str) || "right".equalsIgnoreCase(str))) ? 0.0f : 1.0f);
            } else {
                e3 = mmVar4.c;
            }
            float R1 = hl.R1((getWidth() - hl.L(26.0f)) / 2.0f, getWidth() - hl.L(16.0f), e3);
            float L = hl.L(44.0f);
            float f6 = R1 / 2.0f;
            float R12 = hl.R1(hl.L(8.0f), ((getWidth() - hl.L(26.0f)) / 2.0f) + hl.L(18.0f), e) + f6;
            float f7 = L / 2.0f;
            float U1 = f5 + hl.U1(e2, hl.L(7.0f), hl.L(58.0f)) + f7;
            rectF.set(R12 - f6, U1 - f7, f6 + R12, f7 + U1);
            float d2 = xo0Var.h.d(yo0Var.c);
            float d3 = xo0Var.i.d(yo0Var.d);
            canvas.save();
            float R13 = hl.R1(0.7f, 1.0f, d) * xo0Var.j.a(0.02f);
            canvas.scale(R13, R13, R12, U1);
            paint2.setColor(aob.p1(d, xo0Var.f.a(yo0Var.g, false)));
            canvas.drawRoundRect(rectF, hl.L(9.0f), hl.L(9.0f), paint2);
            if (d2 < 1.0f) {
                canvas.save();
                float f8 = 1.0f - d2;
                float R14 = hl.R1(0.75f, 1.0f, f8);
                canvas.scale(R14, R14, R12, U1);
                canvas.translate(0.0f, hl.L(-10.0f) * d2);
                float f9 = f8 * d;
                int p1 = aob.p1(f9, llVar.a(yo0Var.h, false));
                if (hnVar.a0 != p1) {
                    hnVar.a0 = p1;
                    hnVar.b0 = new PorterDuffColorFilter(p1, PorterDuff.Mode.SRC_IN);
                }
                hnVar.u(aob.p1(f9, llVar.a(yo0Var.h, false)));
                hnVar.p(rectF);
                hnVar.draw(canvas);
                canvas.restore();
            }
            if (d2 > 0.0f) {
                canvas.save();
                float R15 = hl.R1(0.75f, 1.0f, d2);
                canvas.scale(R15, R15, R12, U1);
                canvas.translate(0.0f, (1.0f - d2) * hl.L(10.0f));
                di2 di2Var3 = di2Var;
                di2Var3.b(aob.p1(d2 * d, llVar.a(yo0Var.h, false)));
                di2Var3.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                di2Var3.draw(canvas);
                canvas.restore();
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
            }
            if (d3 > f3) {
                int p12 = aob.p1(d * d3, llVar.a(yo0Var.h, false));
                fe1 fe1Var3 = fe1Var;
                fe1Var3.b(p12, 64);
                zo0Var = this;
                fe1Var3.a(hl.L(8.0f), canvas, rectF, zo0Var);
            } else {
                zo0Var = this;
            }
            if (xo0Var.m != aob.p1(0.15f, yo0Var.h)) {
                int p13 = aob.p1(0.15f, yo0Var.h);
                xo0Var.m = p13;
                hf0Var = hf0Var2;
                i = 1;
                aob.F1(hf0Var, p13, true);
            } else {
                hf0Var = hf0Var2;
                i = 1;
            }
            hf0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            hf0Var.draw(canvas);
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
        lp lpVar = this.e;
        boolean z = ((yo0) lpVar.c).a;
        int i = (z || ((yo0) lpVar.d).a) ? 1 : 0;
        if (z) {
            yo0 yo0Var = (yo0) lpVar.d;
            if (yo0Var.a && ("top".equalsIgnoreCase(yo0Var.i) || "bottom".equalsIgnoreCase(((yo0) this.e.d).i))) {
                i++;
            }
        }
        if (i == 0) {
            return 0;
        }
        return i == 1 ? hl.L(58.0f) : hl.L(109.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), ik8.E(109.0f, 1, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pcc pccVar;
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
                if (a2 == xo0Var && (pccVar = this.n) != null) {
                    pccVar.a(Boolean.valueOf(xo0Var == this.f[0]));
                }
            }
            this.h.j.c(false);
            this.h.n.setState(new int[0]);
            this.h = null;
        }
        return this.h != null;
    }

    public void setOnButtonClickListener(pcc pccVar) {
        this.n = pccVar;
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
