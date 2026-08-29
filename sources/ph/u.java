package ph;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class u extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final d6 c;
    public final f5 d;
    public ag.j2 e;
    public final s[] f;
    public s h;
    public Utilities.Callback n;
    public Runnable r;

    public u(Context context, c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        jr jrVar = jr.h;
        this.c = new d6(this, 0L, 320L, jrVar);
        this.d = new f5(this, 320L, jrVar, 0);
        ag.j2 j2Var = new ag.j2((char) 0, 20);
        j2Var.c = new t();
        j2Var.d = new t();
        this.e = j2Var;
        this.f = new s[]{new s(this), new s(this)};
        setWillNotDraw(false);
        paint2.setColor(g6.l1(0.1f, -16777216));
        ag.j2 j2Var2 = this.e;
        int v02 = g6.v0(g6.d6, c6Var);
        j2Var2.b = v02;
        paint.setColor(v02);
    }

    public static void b(n6 n6Var, t tVar, boolean z10) {
        n6Var.b();
        if (tVar.f == 0) {
            n6Var.q(tVar.e, z10, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) tVar.e);
        spannableStringBuilder.setSpan(new y5(tVar.f, 1.4f, n6Var.a.getFontMetricsInt()), 0, 1, 33);
        n6Var.q(spannableStringBuilder, z10, true);
    }

    public final s a(float f9, float f10) {
        int i10 = 0;
        while (true) {
            s[] sVarArr = this.f;
            if (i10 >= sVarArr.length) {
                return null;
            }
            ag.j2 j2Var = this.e;
            t tVar = (t) (i10 == 0 ? j2Var.c : j2Var.d);
            if (sVarArr[i10].a.contains(f9, f10) && tVar.a && tVar.b) {
                return sVarArr[i10];
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n6 n6Var;
        float f9;
        float d;
        float f10;
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
        float f11 = height;
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
            ag.j2 j2Var = this.e;
            t tVar = (t) (i12 == 0 ? j2Var.c : j2Var.d);
            d6 d6Var = sVar.b;
            org.telegram.ui.Components.voip.h hVar = sVar.p;
            Paint paint2 = sVar.k;
            d6 d6Var2 = sVar.e;
            d6 d6Var3 = sVar.d;
            d6 d6Var4 = sVar.c;
            org.telegram.ui.Cells.z zVar2 = sVar.n;
            s[] sVarArr2 = sVarArr;
            np npVar = sVar.o;
            float f12 = f11;
            f5 f5Var = sVar.g;
            int i13 = i11;
            n6 n6Var2 = sVar.l;
            int i14 = i12;
            RectF rectF = sVar.a;
            float e10 = d6Var.e(tVar.a);
            if (tVar.a) {
                ag.j2 j2Var2 = this.e;
                n6Var = n6Var2;
                if (((t) j2Var2.d).a && ((t) j2Var2.c).a) {
                    f9 = (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f9 = 0.0f;
                }
                d = d6Var4.d(f9, false);
            } else {
                d = d6Var4.c;
                n6Var = n6Var2;
            }
            if (tVar.a) {
                ag.j2 j2Var3 = this.e;
                if (((t) j2Var3.d).a && ((t) j2Var3.c).a) {
                    f10 = (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f10 = 0.0f;
                }
                d10 = d6Var3.d(f10, false);
            } else {
                d10 = d6Var3.c;
            }
            if (tVar.a) {
                ag.j2 j2Var4 = this.e;
                d11 = d6Var2.d((((t) j2Var4.d).a && ((t) j2Var4.c).a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) ? 0.0f : 1.0f, false);
            } else {
                d11 = d6Var2.c;
            }
            float lerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), d11);
            float dp = AndroidUtilities.dp(44.0f);
            float f13 = lerp / 2.0f;
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), d) + f13;
            float f14 = dp / 2.0f;
            float lerp3 = f12 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), d10) + f14;
            rectF.set(lerp2 - f13, lerp3 - f14, f13 + lerp2, f14 + lerp3);
            float e11 = sVar.h.e(tVar.c);
            float e12 = sVar.i.e(tVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e10) * sVar.j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(g6.l1(e10, sVar.f.a(tVar.g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e11 < 1.0f) {
                canvas.save();
                float f15 = 1.0f - e11;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f15);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e11);
                float f16 = f15 * e10;
                int l1 = g6.l1(f16, f5Var.a(tVar.h, false));
                n6 n6Var3 = n6Var;
                if (n6Var3.T != l1) {
                    n6Var3.T = l1;
                    str = str2;
                    n6Var3.U = new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                n6Var3.r(g6.l1(f16, f5Var.a(tVar.h, false)));
                n6Var3.m(rectF);
                n6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (e11 > 0.0f) {
                canvas.save();
                float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, e11);
                canvas.scale(lerp6, lerp6, lerp2, lerp3);
                canvas.translate(0.0f, (1.0f - e11) * AndroidUtilities.dp(10.0f));
                npVar.b(g6.l1(e11 * e10, f5Var.a(tVar.h, false)));
                npVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                npVar.draw(canvas);
                canvas.restore();
            }
            if (e12 > 0.0f) {
                hVar.b(g6.l1(e10 * e12, f5Var.a(tVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            }
            if (sVar.m != g6.l1(0.15f, tVar.h)) {
                int l12 = g6.l1(0.15f, tVar.h);
                sVar.m = l12;
                zVar = zVar2;
                i10 = 1;
                g6.B1(zVar, l12, true);
            } else {
                zVar = zVar2;
                i10 = 1;
            }
            zVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            zVar.draw(canvas);
            canvas.restore();
            i12 = i14 + (i13 != 0 ? -1 : 1);
            sVarArr = sVarArr2;
            f11 = f12;
            i11 = i13;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.c.c;
    }

    public int getTotalHeight() {
        ag.j2 j2Var = this.e;
        boolean z10 = ((t) j2Var.c).a;
        int i10 = (z10 || ((t) j2Var.d).a) ? 1 : 0;
        if (z10) {
            t tVar = (t) j2Var.d;
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
