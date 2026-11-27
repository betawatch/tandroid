// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class uz4 extends FrameLayout implements gj6, s84, snb {
    public static final RectF W = new RectF();
    public tz4 E;
    public TLRPC.TL_attachMenuBot F;
    public final TextPaint G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public boolean L;
    public Drawable M;
    public boolean N;
    public boolean O;
    public int P;
    public long Q;
    public boolean R;
    public int S;
    public float T;
    public TextPaint U;
    public rb0 V;
    public final TextView a;
    public final e29 b;
    public de0 c;
    public vnb d;
    public final Paint e;
    public final hn f;
    public final fm0 h;
    public final fm0 n;
    public final fm0 r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public uz4(Context context) {
        super(context);
        this.e = new Paint(1);
        this.h = new fm0(0, this, un.a, 320L, false);
        k43 k43Var = k43.h;
        this.n = new fm0(1, this, k43Var, 380L, false);
        this.r = new fm0(2, this, k43Var, 380L, false);
        this.T = 1.0f;
        e29 e29Var = new e29(context);
        this.b = e29Var;
        addView(e29Var, tre.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        e29Var.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        this.G = new TextPaint(textView.getPaint());
        addView(textView, tre.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        hn hnVar = new hn(false, false, false);
        this.f = hnVar;
        hnVar.x(hl.o());
        hnVar.setCallback(this);
        hnVar.b = 17;
        hnVar.u(-1);
        hnVar.w(hl.L(10.0f));
    }

    public static uz4 c(Context context, vnb vnbVar, tz4 tz4Var, int i) {
        uz4 uz4Var = new uz4(context);
        uz4Var.d = vnbVar;
        uz4Var.E = tz4Var;
        uz4Var.a.setText(ob6.M0(i, null));
        uz4Var.b(false);
        uz4Var.b.setLayoutParams(tre.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        uz4Var.x = aob.v0(aob.Tl, vnbVar);
        uz4Var.s = aob.v0(aob.Rl, vnbVar);
        uz4Var.w = aob.v0(aob.Sl, vnbVar);
        uz4Var.a();
        return uz4Var;
    }

    public final void a() {
        int i = this.x;
        int i2 = this.s;
        fm0 fm0Var = this.h;
        int f = vm2.f(fm0Var.e, i, i2);
        int f2 = vm2.f(fm0Var.e, this.x, this.w);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN);
        de0 de0Var = this.c;
        if (de0Var != null && this.N) {
            de0Var.setColorFilter(porterDuffColorFilter);
            this.c.invalidate();
        }
        this.b.setColorFilter(porterDuffColorFilter);
        this.a.setTextColor(f2);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Tl));
        hashSet.add(Integer.valueOf(aob.Rl));
        hashSet.add(Integer.valueOf(aob.Sl));
    }

    public final void b(boolean z) {
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.Document document;
        boolean z2 = this.h.f;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.F;
        boolean z3 = true;
        if (tL_attachMenuBot != null) {
            Pattern pattern = ls6.U1;
            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    tL_attachMenuBotIcon = null;
                    break;
                }
                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList.get(i);
                i++;
                tL_attachMenuBotIcon = tL_attachMenuBotIcon2;
                if (tL_attachMenuBotIcon.name.equals(z2 ? "android_active_animated" : "android_animated")) {
                    break;
                }
            }
            if (tL_attachMenuBotIcon == null) {
                tL_attachMenuBotIcon = ls6.l0(this.F);
                z3 = false;
            }
            if (tL_attachMenuBotIcon == null || (document = tL_attachMenuBotIcon.icon) == null) {
                this.c.b();
            } else if (this.Q != document.id) {
                this.c.j(jn5.b(document), "24_24_lastframe", jn5.b(document), "24_24_lastframe", z3 ? null : lp3.f(document, aob.a7, 1.0f, null), this.F);
                this.Q = document.id;
            }
            a();
            return;
        }
        tz4 tz4Var = this.E;
        if (tz4Var != null) {
            int i2 = tz4Var.b;
            int i3 = tz4Var.a;
            int i4 = tz4Var.c;
            e29 e29Var = this.b;
            if (i4 != -1) {
                e29Var.setImageResource(i4);
                a();
                return;
            }
            int i5 = z2 ? i3 : i2;
            if (tz4Var.d != -1) {
                boolean z4 = this.O != z2;
                if (this.P != i5) {
                    this.P = i5;
                    e29Var.f(i5, 24, 24, null);
                    z4 = true;
                }
                if (z4) {
                    b29 animatedDrawable = e29Var.getAnimatedDrawable();
                    if (animatedDrawable == null) {
                        return;
                    }
                    if (z2) {
                        animatedDrawable.K(this.E.d);
                        if (animatedDrawable.b0 >= this.E.e - 2) {
                            animatedDrawable.I(0, false, false);
                        }
                        int i6 = animatedDrawable.b0;
                        int i7 = this.E.d;
                        if (i6 <= i7) {
                            animatedDrawable.start();
                        } else {
                            animatedDrawable.H(i7);
                        }
                    } else {
                        int i8 = animatedDrawable.b0;
                        tz4 tz4Var2 = this.E;
                        if (i8 >= tz4Var2.d - 1) {
                            animatedDrawable.K(tz4Var2.e - 1);
                            animatedDrawable.start();
                        } else {
                            animatedDrawable.K(0);
                            animatedDrawable.H(0);
                        }
                    }
                }
                this.O = z2;
                return;
            }
            if (i3 != i2) {
                if (this.P != i5) {
                    this.P = i5;
                    e29Var.f(i5, 24, 24, null);
                    e29Var.getAnimatedDrawable().h = false;
                    if (!z) {
                        e29Var.getAnimatedDrawable().O(true, 0.99f);
                        return;
                    } else {
                        e29Var.getAnimatedDrawable().H(0);
                        e29Var.d();
                        return;
                    }
                }
                return;
            }
            if (e29Var.getAnimatedDrawable() == null) {
                e29Var.f(this.E.a, 24, 24, null);
            }
            b29 animatedDrawable2 = e29Var.getAnimatedDrawable();
            if (animatedDrawable2 != null) {
                int[] iArr = animatedDrawable2.e;
                if (this.O != z2) {
                    this.O = z2;
                    if (z2) {
                        animatedDrawable2.h = false;
                        animatedDrawable2.H(0);
                        animatedDrawable2.K(iArr[0]);
                    } else {
                        animatedDrawable2.h = true;
                        animatedDrawable2.H(iArr[0]);
                        animatedDrawable2.K(0);
                    }
                    e29Var.d();
                }
            }
        }
    }

    public final float d() {
        float measureText = this.G.measureText(this.a.getText().toString());
        return Math.min(hl.L(84.0f), (int) ((hl.R1(hl.N(16.0f), hl.L(8.0f), ete.a((measureText - hl.L(40.0f)) / hl.L(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = this.H ? this.I : getWidth();
        float f = this.J ? this.K : this.h.e;
        RectF rectF = W;
        Paint paint = this.e;
        if (f > 0.0f && !this.L) {
            paint.setColor(aob.p1(un.a.getInterpolation(f) * 0.09f, this.s));
            rectF.set(0.0f, 0.0f, width, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a = ete.a(this.T, 0.0f, 1.0f) * hl.R1(0.6f, 1.0f, f);
            canvas.save();
            canvas.scale(a, a, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        float f2 = (this.y ? 1.0f : this.n.e) * this.T;
        boolean z = f2 > 0.0f;
        if (z) {
            canvas.saveLayer(0.0f, 0.0f, width, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (f2 > 0.0f) {
            canvas.save();
            float N = hl.N(1.33f);
            float N2 = hl.N(11.0f) + (width / 2.0f);
            float N3 = hl.N(10.0f);
            float N4 = hl.N(16.0f);
            hn hnVar = this.f;
            float max = Math.max(N4, hnVar.c() + hl.L(8.0f));
            float N5 = hl.N(9.333f);
            float N6 = hl.N(8.0f);
            float f3 = max / 2.0f;
            float f4 = N4 / 2.0f;
            rectF.set((N2 - f3) - N, (N3 - f4) - N, f3 + N2 + N, f4 + N3 + N);
            canvas.scale(f2, f2, N2, N3);
            canvas.drawRoundRect(rectF, N5, N5, aob.Gm);
            rectF.inset(N, N);
            if (this.y) {
                if (this.M == null) {
                    this.M = getContext().getResources().getDrawable(R.drawable.star).mutate();
                }
                bl8.d().f(0.0f, 0.0f, hl.L(96.0f), hl.L(16.0f));
                canvas.drawRoundRect(rectF, N6, N6, bl8.d().e());
                int N7 = (int) (N2 - hl.N(7.0f));
                int N8 = (int) (N3 - hl.N(7.0f));
                this.M.setBounds(N7, N8, hl.L(14.0f) + N7, hl.L(14.0f) + N8);
                this.M.draw(canvas);
            } else {
                paint.setColor(vm2.f(this.r.e, aob.w0(null, aob.Yl, false), aob.w0(null, aob.r7, false)));
                canvas.drawRoundRect(rectF, N6, N6, paint);
                hnVar.p(rectF);
                hnVar.draw(canvas);
            }
            canvas.restore();
        }
        if (z) {
            canvas.restore();
        }
    }

    public final void e(String str, boolean z, boolean z2) {
        this.f.t(str, z2, true);
        this.n.a(!TextUtils.isEmpty(str), z2);
        this.r.a(z, z2);
    }

    public final void f(boolean z, boolean z2) {
        this.h.a(z, z2);
        b(z2);
        this.a.setTypeface(z ? hl.n1("fonts/rextrabold.ttf") : hl.o());
    }

    public final void g() {
        this.x = aob.v0(aob.Tl, this.d);
        this.s = aob.v0(aob.Rl, this.d);
        this.w = aob.v0(aob.Sl, this.d);
        a();
        invalidate();
    }

    public de0 getBackupImageView() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.R) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) d()) + this.S, TLObject.FLAG_30), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.H) {
            float measuredWidth = (this.I - getMeasuredWidth()) / 2.0f;
            this.b.setTranslationX(measuredWidth);
            this.a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i) {
        this.S = i;
        this.R = true;
    }

    public void setAttachScale(float f) {
        TextView textView = this.a;
        textView.setScaleX(f);
        textView.setScaleY(f);
        e29 e29Var = this.b;
        e29Var.setScaleX(f);
        e29Var.setScaleY(f);
        de0 de0Var = this.c;
        if (de0Var != null) {
            de0Var.setScaleX(f);
            this.c.setScaleY(f);
        }
        this.T = f;
        invalidate();
    }

    public void setPremiumBadge(boolean z) {
        this.y = z;
    }

    public void setSkipDrawSelector(boolean z) {
        if (this.L != z) {
            this.L = z;
            invalidate();
        }
    }

    public void setTabAnimation(tz4 tz4Var) {
        this.E = tz4Var;
        this.F = null;
        this.P = 0;
        this.Q = 0L;
        this.b.a();
        b(false);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setTextSizeDp(float f) {
        float L = hl.L(f);
        TextView textView = this.a;
        if (textView.getTextSize() != L) {
            textView.setTextSize(1, f);
            this.G.setTextSize(L);
        }
    }

    public void setVisualWidth(float f) {
        this.H = true;
        if (this.I != f) {
            this.I = f;
            float measuredWidth = (f - getMeasuredWidth()) / 2.0f;
            this.b.setTranslationX(measuredWidth);
            this.a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 0) {
            a();
        }
        invalidate();
    }

    @Override // snb
    public final void updateColors() {
        if (this.x == aob.v0(aob.Tl, this.d) && this.s == aob.v0(aob.Rl, this.d) && this.w == aob.v0(aob.Sl, this.d)) {
            return;
        }
        g();
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
