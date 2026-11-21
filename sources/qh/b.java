package qh;

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
import c8.l9;
import c8.ma;
import ia.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fc;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ri;
import org.telegram.messenger.u5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.ne0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout implements ne0, te.b, b6 {
    public static final RectF W = new RectF();
    public a E;
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
    public b9 V;
    public final TextView a;
    public final rh0 b;
    public q9 c;
    public h6 d;
    public final Paint e;
    public final n6 f;
    public final te.a h;
    public final te.a n;
    public final te.a r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public b(Context context) {
        super(context);
        this.e = new Paint(1);
        this.h = new te.a(0, this, se.a.a, 320L, false);
        nr nrVar = nr.h;
        this.n = new te.a(1, this, nrVar, 380L, false);
        this.r = new te.a(2, this, nrVar, 380L, false);
        this.T = 1.0f;
        rh0 rh0Var = new rh0(context);
        this.b = rh0Var;
        addView(rh0Var, ma.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        rh0Var.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(g0.o());
        textView.setGravity(17);
        this.G = new TextPaint(textView.getPaint());
        addView(textView, ma.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        n6 n6Var = new n6(false, false, false);
        this.f = n6Var;
        n6Var.x(g0.o());
        n6Var.setCallback(this);
        n6Var.b = 17;
        n6Var.u(-1);
        n6Var.w(g0.L(10.0f));
    }

    public static b c(Context context, h6 h6Var, a aVar, int i7) {
        b bVar = new b(context);
        bVar.d = h6Var;
        bVar.E = aVar;
        bVar.a.setText(gd.N0(i7, null));
        bVar.b(false);
        bVar.b.setLayoutParams(ma.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.x = m6.w0(m6.Tl, h6Var);
        bVar.s = m6.w0(m6.Rl, h6Var);
        bVar.w = m6.w0(m6.Sl, h6Var);
        bVar.a();
        return bVar;
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            a();
        }
        invalidate();
    }

    public final void a() {
        int i7 = this.x;
        int i10 = this.s;
        te.a aVar = this.h;
        int f10 = i0.a.f(aVar.e, i7, i10);
        int f11 = i0.a.f(aVar.e, this.x, this.w);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN);
        q9 q9Var = this.c;
        if (q9Var != null && this.N) {
            q9Var.setColorFilter(porterDuffColorFilter);
            this.c.invalidate();
        }
        this.b.setColorFilter(porterDuffColorFilter);
        this.a.setTextColor(f11);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.Tl));
        hashSet.add(Integer.valueOf(m6.Rl));
        hashSet.add(Integer.valueOf(m6.Sl));
    }

    public final void b(boolean z10) {
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.Document document;
        boolean z11 = this.h.f;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.F;
        boolean z12 = true;
        if (tL_attachMenuBot != null) {
            Pattern pattern = ri.U1;
            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    tL_attachMenuBotIcon = null;
                    break;
                }
                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList.get(i7);
                i7++;
                tL_attachMenuBotIcon = tL_attachMenuBotIcon2;
                if (tL_attachMenuBotIcon.name.equals(z11 ? "android_active_animated" : "android_animated")) {
                    break;
                }
            }
            if (tL_attachMenuBotIcon == null) {
                tL_attachMenuBotIcon = ri.m0(this.F);
                z12 = false;
            }
            if (tL_attachMenuBotIcon == null || (document = tL_attachMenuBotIcon.icon) == null) {
                this.c.b();
            } else if (this.Q != document.id) {
                this.c.m(fc.b(document), "24_24_lastframe", fc.b(document), "24_24_lastframe", z12 ? null : u5.f(document, m6.a7, 1.0f, null), this.F);
                this.Q = document.id;
            }
            a();
            return;
        }
        a aVar = this.E;
        if (aVar == null) {
            return;
        }
        int i10 = aVar.b;
        int i11 = aVar.a;
        int i12 = aVar.c;
        rh0 rh0Var = this.b;
        if (i12 != -1) {
            rh0Var.setImageResource(i12);
            a();
            return;
        }
        int i13 = z11 ? i11 : i10;
        if (aVar.d != -1) {
            boolean z13 = this.O != z11;
            if (this.P != i13) {
                this.P = i13;
                rh0Var.f(i13, 24, 24, null);
                z13 = true;
            }
            if (z13) {
                oh0 animatedDrawable = rh0Var.getAnimatedDrawable();
                if (animatedDrawable == null) {
                    return;
                }
                if (z11) {
                    animatedDrawable.P(this.E.d);
                    if (animatedDrawable.b0 >= this.E.e - 2) {
                        animatedDrawable.N(0, false, false);
                    }
                    int i14 = animatedDrawable.b0;
                    int i15 = this.E.d;
                    if (i14 <= i15) {
                        animatedDrawable.start();
                    } else {
                        animatedDrawable.M(i15);
                    }
                } else {
                    int i16 = animatedDrawable.b0;
                    a aVar2 = this.E;
                    if (i16 >= aVar2.d - 1) {
                        animatedDrawable.P(aVar2.e - 1);
                        animatedDrawable.start();
                    } else {
                        animatedDrawable.P(0);
                        animatedDrawable.M(0);
                    }
                }
            }
            this.O = z11;
            return;
        }
        if (i11 != i10) {
            if (this.P != i13) {
                this.P = i13;
                rh0Var.f(i13, 24, 24, null);
                rh0Var.getAnimatedDrawable().h = false;
                if (!z10) {
                    rh0Var.getAnimatedDrawable().T(true, 0.99f);
                    return;
                } else {
                    rh0Var.getAnimatedDrawable().M(0);
                    rh0Var.d();
                    return;
                }
            }
            return;
        }
        if (rh0Var.getAnimatedDrawable() == null) {
            rh0Var.f(this.E.a, 24, 24, null);
        }
        oh0 animatedDrawable2 = rh0Var.getAnimatedDrawable();
        if (animatedDrawable2 == null) {
            return;
        }
        int[] iArr = animatedDrawable2.e;
        if (this.O != z11) {
            this.O = z11;
            if (z11) {
                animatedDrawable2.h = false;
                animatedDrawable2.M(0);
                animatedDrawable2.P(iArr[0]);
            } else {
                animatedDrawable2.h = true;
                animatedDrawable2.M(iArr[0]);
                animatedDrawable2.P(0);
            }
            rh0Var.d();
        }
    }

    public final float d() {
        float measureText = this.G.measureText(this.a.getText().toString());
        return Math.min(g0.L(84.0f), (int) ((g0.T1(g0.N(16.0f), g0.L(8.0f), l9.a((measureText - g0.L(40.0f)) / g0.L(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = this.H ? this.I : getWidth();
        float f10 = this.J ? this.K : this.h.e;
        RectF rectF = W;
        Paint paint = this.e;
        if (f10 > 0.0f && !this.L) {
            paint.setColor(m6.r1(se.a.a.getInterpolation(f10) * 0.09f, this.s));
            rectF.set(0.0f, 0.0f, width, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a10 = l9.a(this.T, 0.0f, 1.0f) * g0.T1(0.6f, 1.0f, f10);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        float f11 = (this.y ? 1.0f : this.n.e) * this.T;
        boolean z10 = f11 > 0.0f;
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, width, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (f11 > 0.0f) {
            canvas.save();
            float N = g0.N(1.33f);
            float N2 = g0.N(11.0f) + (width / 2.0f);
            float N3 = g0.N(10.0f);
            float N4 = g0.N(16.0f);
            n6 n6Var = this.f;
            float max = Math.max(N4, n6Var.c() + g0.L(8.0f));
            float N5 = g0.N(9.333f);
            float N6 = g0.N(8.0f);
            float f12 = max / 2.0f;
            float f13 = N4 / 2.0f;
            rectF.set((N2 - f12) - N, (N3 - f13) - N, f12 + N2 + N, f13 + N3 + N);
            canvas.scale(f11, f11, N2, N3);
            canvas.drawRoundRect(rectF, N5, N5, m6.Fm);
            rectF.inset(N, N);
            if (this.y) {
                if (this.M == null) {
                    this.M = getContext().getResources().getDrawable(R.drawable.star).mutate();
                }
                e.d().f(0.0f, 0.0f, g0.L(96.0f), g0.L(16.0f));
                canvas.drawRoundRect(rectF, N6, N6, e.d().e());
                int N7 = (int) (N2 - g0.N(7.0f));
                int N8 = (int) (N3 - g0.N(7.0f));
                this.M.setBounds(N7, N8, g0.L(14.0f) + N7, g0.L(14.0f) + N8);
                this.M.draw(canvas);
            } else {
                paint.setColor(i0.a.f(this.r.e, m6.x0(null, m6.Yl, false), m6.x0(null, m6.r7, false)));
                canvas.drawRoundRect(rectF, N6, N6, paint);
                n6Var.p(rectF);
                n6Var.draw(canvas);
            }
            canvas.restore();
        }
        if (z10) {
            canvas.restore();
        }
    }

    public final void e(String str, boolean z10, boolean z11) {
        this.f.t(str, z11, true);
        this.n.a(!TextUtils.isEmpty(str), z11);
        this.r.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.h.a(z10, z11);
        b(z11);
        this.a.setTypeface(z10 ? g0.o1("fonts/rextrabold.ttf") : g0.o());
    }

    public final void g() {
        this.x = m6.w0(m6.Tl, this.d);
        this.s = m6.w0(m6.Rl, this.d);
        this.w = m6.w0(m6.Sl, this.d);
        a();
        invalidate();
    }

    public q9 getBackupImageView() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.R) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) d()) + this.S, TLObject.FLAG_30), i10);
        } else {
            super.onMeasure(i7, i10);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (this.H) {
            float measuredWidth = (this.I - getMeasuredWidth()) / 2.0f;
            this.b.setTranslationX(measuredWidth);
            this.a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i7) {
        this.S = i7;
        this.R = true;
    }

    public void setAttachScale(float f10) {
        TextView textView = this.a;
        textView.setScaleX(f10);
        textView.setScaleY(f10);
        rh0 rh0Var = this.b;
        rh0Var.setScaleX(f10);
        rh0Var.setScaleY(f10);
        q9 q9Var = this.c;
        if (q9Var != null) {
            q9Var.setScaleX(f10);
            this.c.setScaleY(f10);
        }
        this.T = f10;
        invalidate();
    }

    public void setPremiumBadge(boolean z10) {
        this.y = z10;
    }

    public void setSkipDrawSelector(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.E = aVar;
        this.F = null;
        this.P = 0;
        this.Q = 0L;
        this.b.a();
        b(false);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setTextSizeDp(float f10) {
        float L = g0.L(f10);
        TextView textView = this.a;
        if (textView.getTextSize() != L) {
            textView.setTextSize(1, f10);
            this.G.setTextSize(L);
        }
    }

    public void setVisualWidth(float f10) {
        this.H = true;
        if (this.I != f10) {
            this.I = f10;
            float measuredWidth = (f10 - getMeasuredWidth()) / 2.0f;
            this.b.setTranslationX(measuredWidth);
            this.a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        if (this.x == m6.w0(m6.Tl, this.d) && this.s == m6.w0(m6.Rl, this.d) && this.w == m6.w0(m6.Sl, this.d)) {
            return;
        }
        g();
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
