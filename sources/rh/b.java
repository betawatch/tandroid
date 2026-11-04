package rh;

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
import b8.be;
import b8.mf;
import ha.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.li;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.fe0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout implements fe0, qe.b, z5 {
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
    public u8 V;
    public final TextView a;
    public final fh0 b;
    public k9 c;
    public e6 d;
    public final Paint e;
    public final g6 f;
    public final qe.a h;
    public final qe.a n;
    public final qe.a r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public b(Context context) {
        super(context);
        this.e = new Paint(1);
        this.h = new qe.a(0, this, pe.a.a, 320L, false);
        xq xqVar = xq.h;
        this.n = new qe.a(1, this, xqVar, 380L, false);
        this.r = new qe.a(2, this, xqVar, 380L, false);
        this.T = 1.0f;
        fh0 fh0Var = new fh0(context);
        this.b = fh0Var;
        addView(fh0Var, mf.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        fh0Var.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(g0.o());
        textView.setGravity(17);
        this.G = new TextPaint(textView.getPaint());
        addView(textView, mf.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        g6 g6Var = new g6(false, false, false);
        this.f = g6Var;
        g6Var.x(g0.o());
        g6Var.setCallback(this);
        g6Var.b = 17;
        g6Var.u(-1);
        g6Var.w(g0.L(10.0f));
    }

    public static b c(Context context, e6 e6Var, a aVar, int i3) {
        b bVar = new b(context);
        bVar.d = e6Var;
        bVar.E = aVar;
        bVar.a.setText(bd.M0(i3, null));
        bVar.b(false);
        bVar.b.setLayoutParams(mf.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.x = k6.w0(k6.Ql, e6Var);
        bVar.s = k6.w0(k6.Ol, e6Var);
        bVar.w = k6.w0(k6.Pl, e6Var);
        bVar.a();
        return bVar;
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            a();
        }
        invalidate();
    }

    public final void a() {
        int i3 = this.x;
        int i10 = this.s;
        qe.a aVar = this.h;
        int f10 = i0.a.f(aVar.e, i3, i10);
        int f11 = i0.a.f(aVar.e, this.x, this.w);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN);
        k9 k9Var = this.c;
        if (k9Var != null && this.N) {
            k9Var.setColorFilter(porterDuffColorFilter);
            this.c.invalidate();
        }
        this.b.setColorFilter(porterDuffColorFilter);
        this.a.setTextColor(f11);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Ql));
        hashSet.add(Integer.valueOf(k6.Ol));
        hashSet.add(Integer.valueOf(k6.Pl));
    }

    public final void b(boolean z10) {
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.Document document;
        boolean z11 = this.h.f;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.F;
        boolean z12 = true;
        if (tL_attachMenuBot != null) {
            Pattern pattern = li.S1;
            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    tL_attachMenuBotIcon = null;
                    break;
                }
                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList.get(i3);
                i3++;
                tL_attachMenuBotIcon = tL_attachMenuBotIcon2;
                if (tL_attachMenuBotIcon.name.equals(z11 ? "android_active_animated" : "android_animated")) {
                    break;
                }
            }
            if (tL_attachMenuBotIcon == null) {
                tL_attachMenuBotIcon = li.k0(this.F);
                z12 = false;
            }
            if (tL_attachMenuBotIcon == null || (document = tL_attachMenuBotIcon.icon) == null) {
                this.c.b();
            } else if (this.Q != document.id) {
                this.c.m(ac.b(document), "24_24_lastframe", ac.b(document), "24_24_lastframe", z12 ? null : t5.f(document, k6.a7, 1.0f, null), this.F);
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
        fh0 fh0Var = this.b;
        if (i12 != -1) {
            fh0Var.setImageResource(i12);
            a();
            return;
        }
        int i13 = z11 ? i11 : i10;
        if (aVar.d != -1) {
            boolean z13 = this.O != z11;
            if (this.P != i13) {
                this.P = i13;
                fh0Var.f(i13, 24, 24, null);
                z13 = true;
            }
            if (z13) {
                ch0 animatedDrawable = fh0Var.getAnimatedDrawable();
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
                fh0Var.f(i13, 24, 24, null);
                fh0Var.getAnimatedDrawable().h = false;
                if (!z10) {
                    fh0Var.getAnimatedDrawable().T(true, 0.99f);
                    return;
                } else {
                    fh0Var.getAnimatedDrawable().M(0);
                    fh0Var.d();
                    return;
                }
            }
            return;
        }
        if (fh0Var.getAnimatedDrawable() == null) {
            fh0Var.f(this.E.a, 24, 24, null);
        }
        ch0 animatedDrawable2 = fh0Var.getAnimatedDrawable();
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
            fh0Var.d();
        }
    }

    public final float d() {
        float measureText = this.G.measureText(this.a.getText().toString());
        return Math.min(g0.L(84.0f), (int) ((g0.T1(g0.N(16.0f), g0.L(8.0f), be.a((measureText - g0.L(40.0f)) / g0.L(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = this.H ? this.I : getWidth();
        float f10 = this.J ? this.K : this.h.e;
        RectF rectF = W;
        Paint paint = this.e;
        if (f10 > 0.0f && !this.L) {
            paint.setColor(k6.r1(pe.a.a.getInterpolation(f10) * 0.09f, this.s));
            rectF.set(0.0f, 0.0f, width, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a10 = be.a(this.T, 0.0f, 1.0f) * g0.T1(0.6f, 1.0f, f10);
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
            g6 g6Var = this.f;
            float max = Math.max(N4, g6Var.c() + g0.L(8.0f));
            float N5 = g0.N(9.333f);
            float N6 = g0.N(8.0f);
            float f12 = max / 2.0f;
            float f13 = N4 / 2.0f;
            rectF.set((N2 - f12) - N, (N3 - f13) - N, f12 + N2 + N, f13 + N3 + N);
            canvas.scale(f11, f11, N2, N3);
            canvas.drawRoundRect(rectF, N5, N5, k6.Cm);
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
                paint.setColor(i0.a.f(this.r.e, k6.x0(null, k6.Vl, false), k6.x0(null, k6.r7, false)));
                canvas.drawRoundRect(rectF, N6, N6, paint);
                g6Var.p(rectF);
                g6Var.draw(canvas);
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
        this.x = k6.w0(k6.Ql, this.d);
        this.s = k6.w0(k6.Ol, this.d);
        this.w = k6.w0(k6.Pl, this.d);
        a();
        invalidate();
    }

    public k9 getBackupImageView() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        if (this.R) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) d()) + this.S, TLObject.FLAG_30), i10);
        } else {
            super.onMeasure(i3, i10);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        if (this.H) {
            float measuredWidth = (this.I - getMeasuredWidth()) / 2.0f;
            this.b.setTranslationX(measuredWidth);
            this.a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i3) {
        this.S = i3;
        this.R = true;
    }

    public void setAttachScale(float f10) {
        TextView textView = this.a;
        textView.setScaleX(f10);
        textView.setScaleY(f10);
        fh0 fh0Var = this.b;
        fh0Var.setScaleX(f10);
        fh0Var.setScaleY(f10);
        k9 k9Var = this.c;
        if (k9Var != null) {
            k9Var.setScaleX(f10);
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        if (this.x == k6.w0(k6.Ql, this.d) && this.s == k6.w0(k6.Ol, this.d) && this.w == k6.w0(k6.Pl, this.d)) {
            return;
        }
        g();
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}
