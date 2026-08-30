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
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.z5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public abstract class v extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final z5 c;
    public final c5 d;
    public b4.e0 e;
    public final t[] f;
    public t h;
    public Utilities.Callback n;
    public Runnable r;

    public v(Context context, f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        nr nrVar = nr.h;
        this.c = new z5(this, 0L, 320L, nrVar);
        this.d = new c5(this, 320L, nrVar, 0);
        b4.e0 e0Var = new b4.e0((char) 0, 21);
        e0Var.c = new u();
        e0Var.d = new u();
        this.e = e0Var;
        this.f = new t[]{new t(this), new t(this)};
        setWillNotDraw(false);
        paint2.setColor(j6.l1(0.1f, -16777216));
        b4.e0 e0Var2 = this.e;
        int v02 = j6.v0(j6.d6, f6Var);
        e0Var2.b = v02;
        paint.setColor(v02);
    }

    public static void b(org.telegram.ui.Components.j6 j6Var, u uVar, boolean z4) {
        j6Var.b();
        if (uVar.f == 0) {
            j6Var.q(uVar.e, z4, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) uVar.e);
        spannableStringBuilder.setSpan(new u5(uVar.f, 1.4f, j6Var.a.getFontMetricsInt()), 0, 1, 33);
        j6Var.q(spannableStringBuilder, z4, true);
    }

    public final t a(float f10, float f11) {
        int i10 = 0;
        while (true) {
            t[] tVarArr = this.f;
            if (i10 >= tVarArr.length) {
                return null;
            }
            b4.e0 e0Var = this.e;
            u uVar = (u) (i10 == 0 ? e0Var.c : e0Var.d);
            if (tVarArr[i10].a.contains(f10, f11) && uVar.a && uVar.b) {
                return tVarArr[i10];
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
        String str2 = ((u) this.e.d).i;
        t[] tVarArr = this.f;
        int i10 = 1;
        int i11 = tVarArr[1].b.c < tVarArr[0].b.c ? 1 : 0;
        int i12 = i11;
        while (true) {
            if (i11 != 0) {
                if (i12 < 0) {
                    return;
                }
            } else if (i12 > i10) {
                return;
            }
            t tVar = tVarArr[i12];
            b4.e0 e0Var = this.e;
            u uVar = (u) (i12 == 0 ? e0Var.c : e0Var.d);
            z5 z5Var = tVar.b;
            org.telegram.ui.Components.voip.h hVar = tVar.p;
            Paint paint2 = tVar.k;
            z5 z5Var2 = tVar.e;
            z5 z5Var3 = tVar.d;
            z5 z5Var4 = tVar.c;
            org.telegram.ui.Cells.z zVar2 = tVar.n;
            t[] tVarArr2 = tVarArr;
            rp rpVar = tVar.o;
            float f13 = f12;
            c5 c5Var = tVar.g;
            int i13 = i11;
            org.telegram.ui.Components.j6 j6Var2 = tVar.l;
            int i14 = i12;
            RectF rectF = tVar.a;
            float e = z5Var.e(uVar.a);
            if (uVar.a) {
                b4.e0 e0Var2 = this.e;
                j6Var = j6Var2;
                if (((u) e0Var2.d).a && ((u) e0Var2.c).a) {
                    f10 = (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f10 = 0.0f;
                }
                d = z5Var4.d(f10, false);
            } else {
                d = z5Var4.c;
                j6Var = j6Var2;
            }
            if (uVar.a) {
                b4.e0 e0Var3 = this.e;
                if (((u) e0Var3.d).a && ((u) e0Var3.c).a) {
                    f11 = (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f11 = 0.0f;
                }
                d10 = z5Var3.d(f11, false);
            } else {
                d10 = z5Var3.c;
            }
            if (uVar.a) {
                b4.e0 e0Var4 = this.e;
                d11 = z5Var2.d((((u) e0Var4.d).a && ((u) e0Var4.c).a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) ? 0.0f : 1.0f, false);
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
            float e6 = tVar.h.e(uVar.c);
            float e10 = tVar.i.e(uVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e) * tVar.j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(j6.l1(e, tVar.f.a(uVar.g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e6 < 1.0f) {
                canvas.save();
                float f16 = 1.0f - e6;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f16);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e6);
                float f17 = f16 * e;
                int l1 = j6.l1(f17, c5Var.a(uVar.h, false));
                org.telegram.ui.Components.j6 j6Var3 = j6Var;
                if (j6Var3.T != l1) {
                    j6Var3.T = l1;
                    str = str2;
                    j6Var3.U = new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                j6Var3.r(j6.l1(f17, c5Var.a(uVar.h, false)));
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
                rpVar.b(j6.l1(e6 * e, c5Var.a(uVar.h, false)));
                rpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                rpVar.draw(canvas);
                canvas.restore();
            }
            if (e10 > 0.0f) {
                hVar.b(j6.l1(e * e10, c5Var.a(uVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            }
            if (tVar.m != j6.l1(0.15f, uVar.h)) {
                int l12 = j6.l1(0.15f, uVar.h);
                tVar.m = l12;
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
            tVarArr = tVarArr2;
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
        boolean z4 = ((u) e0Var.c).a;
        int i10 = (z4 || ((u) e0Var.d).a) ? 1 : 0;
        if (z4) {
            u uVar = (u) e0Var.d;
            if (uVar.a && ("top".equalsIgnoreCase(uVar.i) || "bottom".equalsIgnoreCase(((u) this.e.d).i))) {
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
            t a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.j.c(true);
                this.h.n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.n.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                t a10 = a(motionEvent.getX(), motionEvent.getY());
                t tVar = this.h;
                if (a10 == tVar && (callback = this.n) != null) {
                    callback.run(Boolean.valueOf(tVar == this.f[0]));
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
        t[] tVarArr = this.f;
        t tVar = tVarArr[0];
        if (tVar.n != drawable && tVar.o != drawable) {
            t tVar2 = tVarArr[1];
            if (tVar2.n != drawable && tVar2.o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
