package rh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.z5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public abstract class u extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final z5 c;
    public final c5 d;
    public b4.e0 e;
    public final s[] f;
    public s h;
    public Utilities.Callback n;
    public Runnable r;

    public u(Context context, f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        mr mrVar = mr.h;
        this.c = new z5(this, 0L, 320L, mrVar);
        this.d = new c5(this, 320L, mrVar, 0);
        b4.e0 e0Var = new b4.e0((char) 0, 22);
        e0Var.c = new t();
        e0Var.d = new t();
        this.e = e0Var;
        this.f = new s[]{new s(this), new s(this)};
        setWillNotDraw(false);
        paint2.setColor(j6.l1(0.1f, -16777216));
        b4.e0 e0Var2 = this.e;
        int v02 = j6.v0(j6.d6, f6Var);
        e0Var2.b = v02;
        paint.setColor(v02);
    }

    public static void b(org.telegram.ui.Components.j6 j6Var, t tVar, boolean z4) {
        j6Var.b();
        if (tVar.f == 0) {
            j6Var.q(tVar.e, z4, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) tVar.e);
        spannableStringBuilder.setSpan(new u5(tVar.f, 1.4f, j6Var.a.getFontMetricsInt()), 0, 1, 33);
        j6Var.q(spannableStringBuilder, z4, true);
    }

    public final s a(float f10, float f11) {
        int i10 = 0;
        while (true) {
            s[] sVarArr = this.f;
            if (i10 >= sVarArr.length) {
                return null;
            }
            b4.e0 e0Var = this.e;
            t tVar = (t) (i10 == 0 ? e0Var.c : e0Var.d);
            if (sVarArr[i10].a.contains(f10, f11) && tVar.a && tVar.b) {
                return sVarArr[i10];
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.j6 j6Var;
        float f10;
        float d;
        float f11;
        float d10;
        float d11;
        String str;
        org.telegram.ui.Cells.z zVar;
        float height = getHeight() - this.c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.b);
        int a2 = this.d.a(this.e.b, false);
        Paint paint = this.a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f12 = height;
        String str2 = ((t) this.e.d).i;
        s[] sVarArr = this.f;
        int i10 = 1;
        int i11 = sVarArr[1].b.c < sVarArr[0].b.c ? 1 : 0;
        int i12 = i11;
        while (true) {
            if (i11 != 0) {
                if (i12 < 0) {
                    return;
                }
            } else if (i12 > i10) {
                return;
            }
            s sVar = sVarArr[i12];
            b4.e0 e0Var = this.e;
            t tVar = (t) (i12 == 0 ? e0Var.c : e0Var.d);
            z5 z5Var = sVar.b;
            org.telegram.ui.Components.voip.h hVar = sVar.p;
            Paint paint2 = sVar.k;
            z5 z5Var2 = sVar.e;
            z5 z5Var3 = sVar.d;
            z5 z5Var4 = sVar.c;
            org.telegram.ui.Cells.z zVar2 = sVar.n;
            s[] sVarArr2 = sVarArr;
            qp qpVar = sVar.o;
            float f13 = f12;
            c5 c5Var = sVar.g;
            int i13 = i11;
            org.telegram.ui.Components.j6 j6Var2 = sVar.l;
            int i14 = i12;
            RectF rectF = sVar.a;
            float e = z5Var.e(tVar.a);
            if (tVar.a) {
                b4.e0 e0Var2 = this.e;
                j6Var = j6Var2;
                if (((t) e0Var2.d).a && ((t) e0Var2.c).a) {
                    f10 = (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f10 = 0.0f;
                }
                d = z5Var4.d(f10, false);
            } else {
                d = z5Var4.c;
                j6Var = j6Var2;
            }
            if (tVar.a) {
                b4.e0 e0Var3 = this.e;
                if (((t) e0Var3.d).a && ((t) e0Var3.c).a) {
                    f11 = (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f11 = 0.0f;
                }
                d10 = z5Var3.d(f11, false);
            } else {
                d10 = z5Var3.c;
            }
            if (tVar.a) {
                b4.e0 e0Var4 = this.e;
                d11 = z5Var2.d((((t) e0Var4.d).a && ((t) e0Var4.c).a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) ? 0.0f : 1.0f, false);
            } else {
                d11 = z5Var2.c;
            }
            float lerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), d11);
            float dp = AndroidUtilities.dp(44.0f);
            float f14 = lerp / 2.0f;
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), d) + f14;
            float f15 = dp / 2.0f;
            float lerp3 = f13 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), d10) + f15;
            rectF.set(lerp2 - f14, lerp3 - f15, f14 + lerp2, f15 + lerp3);
            float e6 = sVar.h.e(tVar.c);
            float e10 = sVar.i.e(tVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e) * sVar.j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(j6.l1(e, sVar.f.a(tVar.g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e6 < 1.0f) {
                canvas.save();
                float f16 = 1.0f - e6;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f16);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e6);
                float f17 = f16 * e;
                int l1 = j6.l1(f17, c5Var.a(tVar.h, false));
                org.telegram.ui.Components.j6 j6Var3 = j6Var;
                if (j6Var3.T != l1) {
                    j6Var3.T = l1;
                    str = str2;
                    j6Var3.U = new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                j6Var3.r(j6.l1(f17, c5Var.a(tVar.h, false)));
                j6Var3.m(rectF);
                j6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (e6 > 0.0f) {
                canvas.save();
                float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, e6);
                canvas.scale(lerp6, lerp6, lerp2, lerp3);
                canvas.translate(0.0f, (1.0f - e6) * AndroidUtilities.dp(10.0f));
                qpVar.b(j6.l1(e6 * e, c5Var.a(tVar.h, false)));
                qpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                qpVar.draw(canvas);
                canvas.restore();
            }
            if (e10 > 0.0f) {
                hVar.b(j6.l1(e * e10, c5Var.a(tVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            }
            if (sVar.m != j6.l1(0.15f, tVar.h)) {
                int l12 = j6.l1(0.15f, tVar.h);
                sVar.m = l12;
                zVar = zVar2;
                i10 = 1;
                j6.B1(zVar, l12, true);
            } else {
                zVar = zVar2;
                i10 = 1;
            }
            zVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            zVar.draw(canvas);
            canvas.restore();
            i12 = i14 + (i13 != 0 ? -1 : 1);
            sVarArr = sVarArr2;
            f12 = f13;
            i11 = i13;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.c.c;
    }

    public int getTotalHeight() {
        b4.e0 e0Var = this.e;
        boolean z4 = ((t) e0Var.c).a;
        int i10 = (z4 || ((t) e0Var.d).a) ? 1 : 0;
        if (z4) {
            t tVar = (t) e0Var.d;
            if (tVar.a && ("top".equalsIgnoreCase(tVar.i) || "bottom".equalsIgnoreCase(((t) this.e.d).i))) {
                i10++;
            }
        }
        if (i10 == 0) {
            return 0;
        }
        return i10 == 1 ? AndroidUtilities.dp(58.0f) : AndroidUtilities.dp(109.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), org.telegram.ui.b.B(109.0f, 1, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            s a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.j.c(true);
                this.h.n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.n.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                s a10 = a(motionEvent.getX(), motionEvent.getY());
                s sVar = this.h;
                if (a10 == sVar && (callback = this.n) != null) {
                    callback.run(Boolean.valueOf(sVar == this.f[0]));
                }
            }
            this.h.j.c(false);
            this.h.n.setState(new int[0]);
            this.h = null;
        }
        return this.h != null;
    }

    public void setOnButtonClickListener(Utilities.Callback<Boolean> callback) {
        this.n = callback;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.r = runnable;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        s[] sVarArr = this.f;
        s sVar = sVarArr[0];
        if (sVar.n != drawable && sVar.o != drawable) {
            s sVar2 = sVarArr[1];
            if (sVar2.n != drawable && sVar2.o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
