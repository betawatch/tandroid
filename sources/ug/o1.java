package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.messenger.i9;
import org.telegram.messenger.n10;
import org.telegram.messenger.s2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.np;
import org.telegram.ui.xs0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class o1 extends ViewGroup {
    public final Paint E;
    public o1 F;
    public int G;
    public int H;
    public final Matrix I;
    public long J;
    public int K;
    public float L;
    public boolean M;
    public boolean N;
    public final mp a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final int f;
    public final int h;
    public xs0 n;
    public final TextView r;
    public final int s;
    public final int w;
    public int x;
    public LinearGradient y;

    public o1(Context context) {
        super(context);
        this.f = 12;
        this.h = 8;
        this.s = n6.d6;
        this.w = n6.a7;
        this.E = new Paint();
        this.I = new Matrix();
        mp mpVar = new mp(24, context, null);
        this.a = mpVar;
        mpVar.setDrawBackgroundAsArc(10);
        int i7 = n6.g7;
        mpVar.b(i7, i7, n6.k7);
        addView(mpVar);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        u6.U(textView, n6.G6, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        addView(textView, ma.d(-2, -2.0f, (gd.a0 ? 5 : 3) | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        addView(textView2, ma.d(-2, -2.0f, (gd.a0 ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 14.0f);
        int i10 = n6.y6;
        u6.U(textView3, i10, null);
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        addView(textView3, ma.d(-2, -2.0f, (gd.a0 ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setTextSize(1, 14.0f);
        u6.U(textView4, i10, null);
        textView4.setSingleLine();
        addView(textView4, ma.d(-2, -2.0f, (gd.a0 ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.c = textView5;
        textView5.setTextSize(1, 15.0f);
        u6.U(textView5, i10, null);
        textView5.setSingleLine();
        addView(textView5, ma.e(-2, -2, 8388613));
        setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r17.g == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xs0 xs0Var, boolean z10) {
        boolean z11;
        String f10;
        this.n = xs0Var;
        this.N = z10;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = xs0Var.a;
        int i7 = tL_premiumSubscriptionOption.months;
        TextView textView = this.b;
        if (i7 == 1) {
            textView.setText(gd.M0(2131746731, null));
        } else if (i7 == 6) {
            textView.setText(gd.M0(2131746730, null));
        } else if (i7 != 12) {
            textView.setText((i7 <= 12 || i7 % 12 != 0) ? gd.G(i7, "Months", new Object[0]) : gd.G(i7 / 12, "PremiumTierAnnualYears", new Object[0]));
        } else {
            textView.setText(gd.M0(2131746735, null));
        }
        if (!s2.b()) {
            if (org.telegram.messenger.r1.i().k()) {
                xs0Var.a();
            }
            z11 = true;
            this.M = z11;
            TextView textView2 = this.c;
            TextView textView3 = this.d;
            TextView textView4 = this.r;
            TextView textView5 = this.e;
            if (z11) {
                if (xs0Var.c() <= 0) {
                    textView4.setVisibility(8);
                    textView3.setVisibility(8);
                    textView5.setVisibility(8);
                } else {
                    textView4.setText(gd.a0(null, null, 2131749492, Integer.valueOf(xs0Var.c())));
                    textView4.setVisibility(0);
                    textView3.setVisibility(0);
                    textView5.setVisibility(0);
                }
                if (s2.b() || tL_premiumSubscriptionOption.store_product == null) {
                    f10 = org.telegram.messenger.r1.i().f(xs0Var.e, xs0Var.b());
                } else if (xs0Var.f == null) {
                    f10 = "";
                } else {
                    org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                    long j3 = xs0Var.e;
                    String b10 = xs0Var.b();
                    i10.getClass();
                    f10 = org.telegram.messenger.r1.g(b10, 6, j3, false);
                }
                textView3.setText(f10);
                textView5.setText(gd.a0(null, null, 2131746679, xs0Var.f()));
                textView2.setText(gd.a0(null, null, 2131746680, xs0Var.e()));
                if (tL_premiumSubscriptionOption.current) {
                    textView5.setVisibility(0);
                    textView5.setText(gd.M0(2131742566, null));
                }
            } else {
                textView4.setText(gd.a0(null, null, 2131749492, 10));
                textView4.setVisibility(0);
                textView3.setVisibility(0);
                textView5.setVisibility(0);
                textView3.setText("USD00.00");
                textView5.setText(gd.a0(null, null, 2131746679, 1000));
                textView2.setText(gd.a0(null, null, 2131746680, 100));
            }
            requestLayout();
        }
        z11 = false;
        this.M = z11;
        TextView textView22 = this.c;
        TextView textView32 = this.d;
        TextView textView42 = this.r;
        TextView textView52 = this.e;
        if (z11) {
        }
        requestLayout();
    }

    public final void b(View view) {
        Rect rect = org.telegram.messenger.g0.Q;
        rect.right = view.getMeasuredWidth() + rect.left;
        rect.bottom = view.getMeasuredHeight() + rect.top;
        if (gd.a0) {
            int i7 = rect.right;
            rect.right = getWidth() - rect.left;
            rect.left = getWidth() - i7;
        }
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void c(boolean z10, boolean z11) {
        this.a.a(z10, z11);
    }

    public final void d() {
        o1 o1Var = this.F;
        if (o1Var != null) {
            o1Var.d();
            return;
        }
        int x02 = n6.x0(null, this.s, false);
        int x03 = n6.x0(null, this.w, false);
        if (this.H == x03 && this.G == x02) {
            return;
        }
        this.G = x02;
        this.H = x03;
        int L = org.telegram.messenger.g0.L(200.0f);
        this.x = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, x02, x02, x03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.y = linearGradient;
        this.E.setShader(linearGradient);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!this.M) {
            super.dispatchDraw(canvas);
            return;
        }
        o1 o1Var = this.F;
        Paint paint = o1Var != null ? o1Var.E : this.E;
        drawChild(canvas, this.a, getDrawingTime());
        d();
        e();
        RectF rectF = org.telegram.messenger.g0.P;
        TextView textView = this.c;
        rectF.set(textView.getLeft(), org.telegram.messenger.g0.L(4.0f) + textView.getTop(), textView.getRight(), textView.getBottom() - org.telegram.messenger.g0.L(4.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        TextView textView2 = this.d;
        rectF.set(textView2.getLeft(), org.telegram.messenger.g0.L(3.0f) + textView2.getTop(), textView2.getRight(), textView2.getBottom() - org.telegram.messenger.g0.L(3.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        TextView textView3 = this.b;
        rectF.set(textView3.getLeft(), org.telegram.messenger.g0.L(4.0f) + textView3.getTop(), textView3.getRight(), textView3.getBottom() - org.telegram.messenger.g0.L(4.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        invalidate();
    }

    public final void e() {
        o1 o1Var = this.F;
        if (o1Var != null) {
            o1Var.e();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.J - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int measuredWidth = getMeasuredWidth();
        this.J = elapsedRealtime;
        int i7 = (int) (((abs * measuredWidth) / 400.0f) + this.K);
        this.K = i7;
        if (i7 >= measuredWidth * 4) {
            this.K = (-this.x) * 2;
        }
        float f10 = this.K + this.L;
        Matrix matrix = this.I;
        matrix.setTranslate(f10, 0.0f);
        LinearGradient linearGradient = this.y;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public xs0 getTier() {
        return this.n;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.N) {
            boolean z10 = gd.a0;
            TextView textView = this.b;
            if (z10) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, n6.k0);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, n6.k0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        Rect rect = org.telegram.messenger.g0.Q;
        int i13 = this.h;
        int paddingLeft = getPaddingLeft() + org.telegram.messenger.g0.L(i13);
        int measuredHeight = getMeasuredHeight();
        mp mpVar = this.a;
        rect.set(paddingLeft, (int) ((measuredHeight - mpVar.getMeasuredHeight()) / 2.0f), 0, 0);
        b(mpVar);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.c;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i14 = i13 + this.f;
        int measuredWidth = mpVar.getMeasuredWidth() + org.telegram.messenger.g0.L(i14 + 24);
        TextView textView2 = this.d;
        int measuredWidth2 = measuredWidth + (textView2.getVisibility() == 0 ? textView2.getMeasuredWidth() : 0);
        TextView textView3 = this.e;
        int paddingLeft2 = getPaddingLeft() + textView3.getMeasuredWidth() + measuredWidth2;
        int measuredWidth3 = getMeasuredWidth() - textView.getMeasuredWidth();
        TextView textView4 = this.r;
        if (paddingLeft2 > measuredWidth3 && textView4.getVisibility() == 0) {
            measuredHeight3 = getPaddingTop() + org.telegram.messenger.g0.L(2.0f);
        }
        rect.set(((getMeasuredWidth() - textView.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) - getPaddingRight(), measuredHeight3, 0, 0);
        b(textView);
        float f10 = i14;
        int paddingLeft3 = getPaddingLeft() + mpVar.getMeasuredWidth() + org.telegram.messenger.g0.L(f10);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.b;
        rect.set(paddingLeft3, visibility == 8 ? (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f) : getPaddingTop(), 0, 0);
        b(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + mpVar.getMeasuredWidth() + org.telegram.messenger.g0.L(i14 + 6), org.telegram.messenger.g0.L(2.0f) + getPaddingTop(), 0, 0);
            b(textView4);
        }
        rect.set(getPaddingLeft() + mpVar.getMeasuredWidth() + org.telegram.messenger.g0.L(f10), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView2);
        rect.set(getPaddingLeft() + mpVar.getMeasuredWidth() + org.telegram.messenger.g0.L(f10) + (textView2.getVisibility() == 0 ? org.telegram.messenger.g0.L(6.0f) + textView2.getMeasuredWidth() : 0), (getMeasuredHeight() - textView3.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView3);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(58.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), TLObject.FLAG_30);
        mp mpVar = this.a;
        mpVar.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - mpVar.getMeasuredWidth(), TLObject.FLAG_31);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        TextView textView = this.c;
        textView.measure(makeMeasureSpec2, makeMeasureSpec3);
        this.b.measure(View.MeasureSpec.makeMeasureSpec((size - mpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        TextView textView2 = this.r;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - mpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        } else {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, TLObject.FLAG_30));
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - mpVar.getMeasuredWidth(), TLObject.FLAG_31);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        TextView textView3 = this.d;
        textView3.measure(makeMeasureSpec4, makeMeasureSpec5);
        int c10 = n10.c(6.0f, (size - mpVar.getMeasuredWidth()) - (textView3.getVisibility() == 0 ? textView3.getMeasuredWidth() : 0), TLObject.FLAG_31);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        TextView textView4 = this.e;
        textView4.measure(c10, makeMeasureSpec6);
        if (textView4.getVisibility() != 0) {
            L -= org.telegram.messenger.g0.L(8.0f);
        }
        setMeasuredDimension(size, L);
    }

    public void setCirclePaintProvider(i9 i9Var) {
        this.a.setCirclePaintProvider(i9Var);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.b.setAlpha(z10 ? 1.0f : 0.6f);
        this.c.setAlpha(z10 ? 1.0f : 0.6f);
        this.a.setAlpha(z10 ? 1.0f : 0.6f);
    }

    public void setGlobalGradientView(o1 o1Var) {
        this.F = o1Var;
    }

    public void setParentXOffset(float f10) {
        this.L = f10;
    }

    public void setProgressDelegate(np npVar) {
        this.a.setProgressDelegate(npVar);
    }
}
