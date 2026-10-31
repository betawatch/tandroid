package xh;

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
import org.telegram.messenger.q20;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.w4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class r extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final t5 c;
    public final w4 d;
    public a5.a e;
    public final p[] f;
    public p h;
    public q20 n;
    public Runnable r;

    public r(Context context, p6 p6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        gr grVar = gr.h;
        this.c = new t5(this, 0L, 320L, grVar);
        this.d = new w4(this, 320L, grVar, 0);
        a5.a aVar = new a5.a((char) 0, 26);
        aVar.c = new q();
        aVar.d = new q();
        this.e = aVar;
        this.f = new p[]{new p(this), new p(this)};
        setWillNotDraw(false);
        paint2.setColor(t6.r1(0.1f, -16777216));
        a5.a aVar2 = this.e;
        int w02 = t6.w0(t6.d6, p6Var);
        aVar2.b = w02;
        paint.setColor(w02);
    }

    public static void b(e6 e6Var, q qVar, boolean z10) {
        e6Var.a();
        if (qVar.f == 0) {
            e6Var.t(qVar.e, z10, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) qVar.e);
        spannableStringBuilder.setSpan(new o5(qVar.f, 1.4f, e6Var.a.getFontMetricsInt()), 0, 1, 33);
        e6Var.t(spannableStringBuilder, z10, true);
    }

    public final p a(float f7, float f10) {
        int i10 = 0;
        while (true) {
            p[] pVarArr = this.f;
            if (i10 >= pVarArr.length) {
                return null;
            }
            a5.a aVar = this.e;
            q qVar = (q) (i10 == 0 ? aVar.c : aVar.d);
            if (pVarArr[i10].a.contains(f7, f10) && qVar.a && qVar.b) {
                return pVarArr[i10];
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e6 e6Var;
        float f7;
        float e;
        float f10;
        float e7;
        float e10;
        String str;
        char c10;
        float f11;
        boolean z10;
        org.telegram.ui.Cells.y yVar;
        float height = getHeight() - this.c.e(false, getTotalHeight());
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.b);
        int a2 = this.d.a(this.e.b, false);
        Paint paint = this.a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f12 = height;
        String str2 = ((q) this.e.d).i;
        p[] pVarArr = this.f;
        int i10 = 1;
        int i11 = pVarArr[1].b.c < pVarArr[0].b.c ? 1 : 0;
        int i12 = i11;
        while (true) {
            if (i11 != 0) {
                if (i12 < 0) {
                    return;
                }
            } else if (i12 > i10) {
                return;
            }
            p pVar = pVarArr[i12];
            a5.a aVar = this.e;
            q qVar = (q) (i12 == 0 ? aVar.c : aVar.d);
            t5 t5Var = pVar.b;
            org.telegram.ui.Components.voip.g gVar = pVar.p;
            Paint paint2 = pVar.k;
            t5 t5Var2 = pVar.e;
            t5 t5Var3 = pVar.d;
            t5 t5Var4 = pVar.c;
            org.telegram.ui.Cells.y yVar2 = pVar.n;
            p[] pVarArr2 = pVarArr;
            kp kpVar = pVar.o;
            float f13 = f12;
            w4 w4Var = pVar.g;
            int i13 = i11;
            e6 e6Var2 = pVar.l;
            int i14 = i12;
            RectF rectF = pVar.a;
            float d = t5Var.d(qVar.a);
            if (qVar.a) {
                a5.a aVar2 = this.e;
                e6Var = e6Var2;
                if (((q) aVar2.d).a && ((q) aVar2.c).a) {
                    f7 = (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f7 = 0.0f;
                }
                e = t5Var4.e(false, f7);
            } else {
                e = t5Var4.c;
                e6Var = e6Var2;
            }
            if (qVar.a) {
                a5.a aVar3 = this.e;
                if (((q) aVar3.d).a && ((q) aVar3.c).a) {
                    f10 = (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f10 = 0.0f;
                }
                e7 = t5Var3.e(false, f10);
            } else {
                e7 = t5Var3.c;
            }
            if (qVar.a) {
                a5.a aVar4 = this.e;
                e10 = t5Var2.e(false, (((q) aVar4.d).a && ((q) aVar4.c).a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) ? 0.0f : 1.0f);
            } else {
                e10 = t5Var2.c;
            }
            float T1 = org.telegram.messenger.i0.T1((getWidth() - org.telegram.messenger.i0.L(26.0f)) / 2.0f, getWidth() - org.telegram.messenger.i0.L(16.0f), e10);
            float L = org.telegram.messenger.i0.L(44.0f);
            float f14 = T1 / 2.0f;
            float T12 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(8.0f), ((getWidth() - org.telegram.messenger.i0.L(26.0f)) / 2.0f) + org.telegram.messenger.i0.L(18.0f), e) + f14;
            float f15 = L / 2.0f;
            float W1 = f13 + org.telegram.messenger.i0.W1(e7, org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(58.0f)) + f15;
            rectF.set(T12 - f14, W1 - f15, f14 + T12, f15 + W1);
            float d10 = pVar.h.d(qVar.c);
            float d11 = pVar.i.d(qVar.d);
            canvas.save();
            float T13 = org.telegram.messenger.i0.T1(0.7f, 1.0f, d) * pVar.j.a(0.02f);
            canvas.scale(T13, T13, T12, W1);
            paint2.setColor(t6.r1(d, pVar.f.a(qVar.g, false)));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), paint2);
            if (d10 < 1.0f) {
                canvas.save();
                float f16 = 1.0f - d10;
                float T14 = org.telegram.messenger.i0.T1(0.75f, 1.0f, f16);
                canvas.scale(T14, T14, T12, W1);
                canvas.translate(0.0f, org.telegram.messenger.i0.L(-10.0f) * d10);
                float f17 = f16 * d;
                int r12 = t6.r1(f17, w4Var.a(qVar.h, false));
                e6 e6Var3 = e6Var;
                if (e6Var3.Z != r12) {
                    e6Var3.Z = r12;
                    str = str2;
                    e6Var3.a0 = new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                e6Var3.u(t6.r1(f17, w4Var.a(qVar.h, false)));
                e6Var3.p(rectF);
                e6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (d10 > 0.0f) {
                canvas.save();
                c10 = 0;
                float T15 = org.telegram.messenger.i0.T1(0.75f, 1.0f, d10);
                canvas.scale(T15, T15, T12, W1);
                canvas.translate(0.0f, (1.0f - d10) * org.telegram.messenger.i0.L(10.0f));
                kpVar.b(t6.r1(d10 * d, w4Var.a(qVar.h, false)));
                kpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                kpVar.draw(canvas);
                canvas.restore();
                f11 = 0.0f;
            } else {
                c10 = 0;
                f11 = 0.0f;
            }
            if (d11 > f11) {
                z10 = false;
                gVar.b(t6.r1(d * d11, w4Var.a(qVar.h, false)), 64);
                gVar.a(org.telegram.messenger.i0.L(8.0f), canvas, rectF, this);
            } else {
                z10 = false;
            }
            if (pVar.m != t6.r1(0.15f, qVar.h)) {
                int r13 = t6.r1(0.15f, qVar.h);
                pVar.m = r13;
                yVar = yVar2;
                i10 = 1;
                t6.H1(yVar, r13, true);
            } else {
                yVar = yVar2;
                i10 = 1;
            }
            yVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            yVar.draw(canvas);
            canvas.restore();
            i12 = i14 + (i13 != 0 ? -1 : i10);
            pVarArr = pVarArr2;
            f12 = f13;
            i11 = i13;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.c.c;
    }

    public int getTotalHeight() {
        a5.a aVar = this.e;
        boolean z10 = ((q) aVar.c).a;
        int i10 = (z10 || ((q) aVar.d).a) ? 1 : 0;
        if (z10) {
            q qVar = (q) aVar.d;
            if (qVar.a && ("top".equalsIgnoreCase(qVar.i) || "bottom".equalsIgnoreCase(((q) this.e.d).i))) {
                i10++;
            }
        }
        if (i10 == 0) {
            return 0;
        }
        return i10 == 1 ? org.telegram.messenger.i0.L(58.0f) : org.telegram.messenger.i0.L(109.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), z20.B(109.0f, 1, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        q20 q20Var;
        if (motionEvent.getAction() == 0) {
            p a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.j.c(true);
                this.h.n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.n.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                p a10 = a(motionEvent.getX(), motionEvent.getY());
                p pVar = this.h;
                if (a10 == pVar && (q20Var = this.n) != null) {
                    q20Var.a(Boolean.valueOf(pVar == this.f[0]));
                }
            }
            this.h.j.c(false);
            this.h.n.setState(new int[0]);
            this.h = null;
        }
        return this.h != null;
    }

    public void setOnButtonClickListener(q20 q20Var) {
        this.n = q20Var;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.r = runnable;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        p[] pVarArr = this.f;
        p pVar = pVarArr[0];
        if (pVar.n != drawable && pVar.o != drawable) {
            p pVar2 = pVarArr[1];
            if (pVar2.n != drawable && pVar2.o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
