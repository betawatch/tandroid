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
import c8.ha;
import c8.j9;
import ia.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.t5;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.me0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b extends FrameLayout implements me0, te.b, b6 {
    public static final RectF V = new RectF();
    public a D;
    public TLRPC.TL_attachMenuBot E;
    public final TextPaint F;
    public boolean G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public Drawable L;
    public boolean M;
    public boolean N;
    public int O;
    public long P;
    public boolean Q;
    public int R;
    public float S;
    public TextPaint T;
    public w8 U;
    public final TextView a;
    public final dh0 b;
    public l9 c;
    public g6 d;
    public final Paint e;
    public final i6 f;
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
        xq xqVar = xq.h;
        this.n = new te.a(1, this, xqVar, 380L, false);
        this.r = new te.a(2, this, xqVar, 380L, false);
        this.S = 1.0f;
        dh0 dh0Var = new dh0(context);
        this.b = dh0Var;
        addView(dh0Var, ha.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        dh0Var.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(g0.o());
        textView.setGravity(17);
        this.F = new TextPaint(textView.getPaint());
        addView(textView, ha.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        i6 i6Var = new i6(false, false, false);
        this.f = i6Var;
        i6Var.x(g0.o());
        i6Var.setCallback(this);
        i6Var.b = 17;
        i6Var.u(-1);
        i6Var.w(g0.L(10.0f));
    }

    public static b c(Context context, g6 g6Var, a aVar, int i7) {
        b bVar = new b(context);
        bVar.d = g6Var;
        bVar.D = aVar;
        bVar.a.setText(id.M0(i7, null));
        bVar.b(false);
        bVar.b.setLayoutParams(ha.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.x = l6.w0(l6.Ql, g6Var);
        bVar.s = l6.w0(l6.Ol, g6Var);
        bVar.w = l6.w0(l6.Pl, g6Var);
        bVar.a();
        return bVar;
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
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
        l9 l9Var = this.c;
        if (l9Var != null && this.M) {
            l9Var.setColorFilter(porterDuffColorFilter);
            this.c.invalidate();
        }
        this.b.setColorFilter(porterDuffColorFilter);
        this.a.setTextColor(f11);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6.Ql));
        hashSet.add(Integer.valueOf(l6.Ol));
        hashSet.add(Integer.valueOf(l6.Pl));
    }

    public final void b(boolean z9) {
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.Document document;
        boolean z10 = this.h.f;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.E;
        boolean z11 = true;
        if (tL_attachMenuBot != null) {
            Pattern pattern = ui.R1;
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
                if (tL_attachMenuBotIcon.name.equals(z10 ? "android_active_animated" : "android_animated")) {
                    break;
                }
            }
            if (tL_attachMenuBotIcon == null) {
                tL_attachMenuBotIcon = ui.k0(this.E);
                z11 = false;
            }
            if (tL_attachMenuBotIcon == null || (document = tL_attachMenuBotIcon.icon) == null) {
                this.c.b();
            } else if (this.P != document.id) {
                this.c.m(hc.b(document), "24_24_lastframe", hc.b(document), "24_24_lastframe", z11 ? null : t5.f(document, l6.a7, 1.0f, null), this.E);
                this.P = document.id;
            }
            a();
            return;
        }
        a aVar = this.D;
        if (aVar == null) {
            return;
        }
        int i10 = aVar.b;
        int i11 = aVar.a;
        int i12 = aVar.c;
        dh0 dh0Var = this.b;
        if (i12 != -1) {
            dh0Var.setImageResource(i12);
            a();
            return;
        }
        int i13 = z10 ? i11 : i10;
        if (aVar.d != -1) {
            boolean z12 = this.N != z10;
            if (this.O != i13) {
                this.O = i13;
                dh0Var.f(i13, 24, 24, null);
                z12 = true;
            }
            if (z12) {
                ah0 animatedDrawable = dh0Var.getAnimatedDrawable();
                if (animatedDrawable == null) {
                    return;
                }
                if (z10) {
                    animatedDrawable.P(this.D.d);
                    if (animatedDrawable.a0 >= this.D.e - 2) {
                        animatedDrawable.N(0, false, false);
                    }
                    int i14 = animatedDrawable.a0;
                    int i15 = this.D.d;
                    if (i14 <= i15) {
                        animatedDrawable.start();
                    } else {
                        animatedDrawable.M(i15);
                    }
                } else {
                    int i16 = animatedDrawable.a0;
                    a aVar2 = this.D;
                    if (i16 >= aVar2.d - 1) {
                        animatedDrawable.P(aVar2.e - 1);
                        animatedDrawable.start();
                    } else {
                        animatedDrawable.P(0);
                        animatedDrawable.M(0);
                    }
                }
            }
            this.N = z10;
            return;
        }
        if (i11 != i10) {
            if (this.O != i13) {
                this.O = i13;
                dh0Var.f(i13, 24, 24, null);
                dh0Var.getAnimatedDrawable().h = false;
                if (!z9) {
                    dh0Var.getAnimatedDrawable().T(true, 0.99f);
                    return;
                } else {
                    dh0Var.getAnimatedDrawable().M(0);
                    dh0Var.d();
                    return;
                }
            }
            return;
        }
        if (dh0Var.getAnimatedDrawable() == null) {
            dh0Var.f(this.D.a, 24, 24, null);
        }
        ah0 animatedDrawable2 = dh0Var.getAnimatedDrawable();
        if (animatedDrawable2 == null) {
            return;
        }
        int[] iArr = animatedDrawable2.e;
        if (this.N != z10) {
            this.N = z10;
            if (z10) {
                animatedDrawable2.h = false;
                animatedDrawable2.M(0);
                animatedDrawable2.P(iArr[0]);
            } else {
                animatedDrawable2.h = true;
                animatedDrawable2.M(iArr[0]);
                animatedDrawable2.P(0);
            }
            dh0Var.d();
        }
    }

    public final float d() {
        float measureText = this.F.measureText(this.a.getText().toString());
        return Math.min(g0.L(84.0f), (int) ((g0.T1(g0.N(16.0f), g0.L(8.0f), j9.a((measureText - g0.L(40.0f)) / g0.L(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = this.G ? this.H : getWidth();
        float f10 = this.I ? this.J : this.h.e;
        RectF rectF = V;
        Paint paint = this.e;
        if (f10 > 0.0f && !this.K) {
            paint.setColor(l6.r1(se.a.a.getInterpolation(f10) * 0.09f, this.s));
            rectF.set(0.0f, 0.0f, width, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a10 = j9.a(this.S, 0.0f, 1.0f) * g0.T1(0.6f, 1.0f, f10);
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        float f11 = (this.y ? 1.0f : this.n.e) * this.S;
        boolean z9 = f11 > 0.0f;
        if (z9) {
            canvas.saveLayer(0.0f, 0.0f, width, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (f11 > 0.0f) {
            canvas.save();
            float N = g0.N(1.33f);
            float N2 = g0.N(11.0f) + (width / 2.0f);
            float N3 = g0.N(10.0f);
            float N4 = g0.N(16.0f);
            i6 i6Var = this.f;
            float max = Math.max(N4, i6Var.c() + g0.L(8.0f));
            float N5 = g0.N(9.333f);
            float N6 = g0.N(8.0f);
            float f12 = max / 2.0f;
            float f13 = N4 / 2.0f;
            rectF.set((N2 - f12) - N, (N3 - f13) - N, f12 + N2 + N, f13 + N3 + N);
            canvas.scale(f11, f11, N2, N3);
            canvas.drawRoundRect(rectF, N5, N5, l6.Cm);
            rectF.inset(N, N);
            if (this.y) {
                if (this.L == null) {
                    this.L = getContext().getResources().getDrawable(R.drawable.star).mutate();
                }
                e.d().f(0.0f, 0.0f, g0.L(96.0f), g0.L(16.0f));
                canvas.drawRoundRect(rectF, N6, N6, e.d().e());
                int N7 = (int) (N2 - g0.N(7.0f));
                int N8 = (int) (N3 - g0.N(7.0f));
                this.L.setBounds(N7, N8, g0.L(14.0f) + N7, g0.L(14.0f) + N8);
                this.L.draw(canvas);
            } else {
                paint.setColor(i0.a.f(this.r.e, l6.x0(null, l6.Vl, false), l6.x0(null, l6.r7, false)));
                canvas.drawRoundRect(rectF, N6, N6, paint);
                i6Var.p(rectF);
                i6Var.draw(canvas);
            }
            canvas.restore();
        }
        if (z9) {
            canvas.restore();
        }
    }

    public final void e(String str, boolean z9, boolean z10) {
        this.f.t(str, z10, true);
        this.n.a(!TextUtils.isEmpty(str), z10);
        this.r.a(z9, z10);
    }

    public final void f(boolean z9, boolean z10) {
        this.h.a(z9, z10);
        b(z10);
        this.a.setTypeface(z9 ? g0.o1("fonts/rextrabold.ttf") : g0.o());
    }

    public final void g() {
        this.x = l6.w0(l6.Ql, this.d);
        this.s = l6.w0(l6.Ol, this.d);
        this.w = l6.w0(l6.Pl, this.d);
        a();
        invalidate();
    }

    public l9 getBackupImageView() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.Q) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) d()) + this.R, TLObject.FLAG_30), i10);
        } else {
            super.onMeasure(i7, i10);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (this.G) {
            float measuredWidth = (this.H - getMeasuredWidth()) / 2.0f;
            this.b.setTranslationX(measuredWidth);
            this.a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i7) {
        this.R = i7;
        this.Q = true;
    }

    public void setAttachScale(float f10) {
        TextView textView = this.a;
        textView.setScaleX(f10);
        textView.setScaleY(f10);
        dh0 dh0Var = this.b;
        dh0Var.setScaleX(f10);
        dh0Var.setScaleY(f10);
        l9 l9Var = this.c;
        if (l9Var != null) {
            l9Var.setScaleX(f10);
            this.c.setScaleY(f10);
        }
        this.S = f10;
        invalidate();
    }

    public void setPremiumBadge(boolean z9) {
        this.y = z9;
    }

    public void setSkipDrawSelector(boolean z9) {
        if (this.K != z9) {
            this.K = z9;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.D = aVar;
        this.E = null;
        this.O = 0;
        this.P = 0L;
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
            this.F.setTextSize(L);
        }
    }

    public void setVisualWidth(float f10) {
        this.G = true;
        if (this.H != f10) {
            this.H = f10;
            float measuredWidth = (f10 - getMeasuredWidth()) / 2.0f;
            this.b.setTranslationX(measuredWidth);
            this.a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        if (this.x == l6.w0(l6.Ql, this.d) && this.s == l6.w0(l6.Ol, this.d) && this.w == l6.w0(l6.Pl, this.d)) {
            return;
        }
        g();
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
