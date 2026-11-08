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
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.messenger.k9;
import org.telegram.messenger.r2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xo;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class k1 extends ViewGroup {
    public final Paint D;
    public k1 E;
    public int F;
    public int G;
    public final Matrix H;
    public long I;
    public int J;
    public float K;
    public boolean L;
    public boolean M;
    public final wo a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final int f;
    public final int h;
    public ws0 n;
    public final TextView r;
    public final int s;
    public final int w;
    public int x;
    public LinearGradient y;

    public k1(Context context) {
        super(context);
        this.f = 12;
        this.h = 8;
        this.s = k6.d6;
        this.w = k6.a7;
        this.D = new Paint();
        this.H = new Matrix();
        wo woVar = new wo(24, context, null);
        this.a = woVar;
        woVar.setDrawBackgroundAsArc(10);
        int i7 = k6.g7;
        woVar.b(i7, i7, k6.k7);
        addView(woVar);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        r6.V(textView, k6.G6, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        addView(textView, ha.d(-2, -2.0f, (id.a0 ? 5 : 3) | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        addView(textView2, ha.d(-2, -2.0f, (id.a0 ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 14.0f);
        int i10 = k6.y6;
        r6.V(textView3, i10, null);
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        addView(textView3, ha.d(-2, -2.0f, (id.a0 ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setTextSize(1, 14.0f);
        r6.V(textView4, i10, null);
        textView4.setSingleLine();
        addView(textView4, ha.d(-2, -2.0f, (id.a0 ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.c = textView5;
        textView5.setTextSize(1, 15.0f);
        r6.V(textView5, i10, null);
        textView5.setSingleLine();
        addView(textView5, ha.e(-2, -2, 8388613));
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
    public final void a(ws0 ws0Var, boolean z9) {
        boolean z10;
        String f10;
        this.n = ws0Var;
        this.M = z9;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = ws0Var.a;
        int i7 = tL_premiumSubscriptionOption.months;
        TextView textView = this.b;
        if (i7 == 1) {
            textView.setText(id.M0(2131746925, null));
        } else if (i7 == 6) {
            textView.setText(id.M0(2131746924, null));
        } else if (i7 != 12) {
            textView.setText((i7 <= 12 || i7 % 12 != 0) ? id.G(i7, "Months", new Object[0]) : id.G(i7 / 12, "PremiumTierAnnualYears", new Object[0]));
        } else {
            textView.setText(id.M0(2131746929, null));
        }
        if (!r2.b()) {
            if (org.telegram.messenger.r1.i().k()) {
                ws0Var.a();
            }
            z10 = true;
            this.L = z10;
            TextView textView2 = this.c;
            TextView textView3 = this.d;
            TextView textView4 = this.r;
            TextView textView5 = this.e;
            if (z10) {
                if (ws0Var.c() <= 0) {
                    textView4.setVisibility(8);
                    textView3.setVisibility(8);
                    textView5.setVisibility(8);
                } else {
                    textView4.setText(id.a0(null, null, 2131749665, Integer.valueOf(ws0Var.c())));
                    textView4.setVisibility(0);
                    textView3.setVisibility(0);
                    textView5.setVisibility(0);
                }
                if (r2.b() || tL_premiumSubscriptionOption.store_product == null) {
                    f10 = org.telegram.messenger.r1.i().f(ws0Var.e, ws0Var.b());
                } else if (ws0Var.f == null) {
                    f10 = "";
                } else {
                    org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                    long j3 = ws0Var.e;
                    String b10 = ws0Var.b();
                    i10.getClass();
                    f10 = org.telegram.messenger.r1.g(b10, 6, j3, false);
                }
                textView3.setText(f10);
                textView5.setText(id.a0(null, null, 2131746873, ws0Var.f()));
                textView2.setText(id.a0(null, null, 2131746874, ws0Var.e()));
                if (tL_premiumSubscriptionOption.current) {
                    textView5.setVisibility(0);
                    textView5.setText(id.M0(2131742827, null));
                }
            } else {
                textView4.setText(id.a0(null, null, 2131749665, 10));
                textView4.setVisibility(0);
                textView3.setVisibility(0);
                textView5.setVisibility(0);
                textView3.setText("USD00.00");
                textView5.setText(id.a0(null, null, 2131746873, 1000));
                textView2.setText(id.a0(null, null, 2131746874, 100));
            }
            requestLayout();
        }
        z10 = false;
        this.L = z10;
        TextView textView22 = this.c;
        TextView textView32 = this.d;
        TextView textView42 = this.r;
        TextView textView52 = this.e;
        if (z10) {
        }
        requestLayout();
    }

    public final void b(View view) {
        Rect rect = org.telegram.messenger.g0.Q;
        rect.right = view.getMeasuredWidth() + rect.left;
        rect.bottom = view.getMeasuredHeight() + rect.top;
        if (id.a0) {
            int i7 = rect.right;
            rect.right = getWidth() - rect.left;
            rect.left = getWidth() - i7;
        }
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void c(boolean z9, boolean z10) {
        this.a.a(z9, z10);
    }

    public final void d() {
        k1 k1Var = this.E;
        if (k1Var != null) {
            k1Var.d();
            return;
        }
        int x02 = k6.x0(null, this.s, false);
        int x03 = k6.x0(null, this.w, false);
        if (this.G == x03 && this.F == x02) {
            return;
        }
        this.F = x02;
        this.G = x03;
        int L = org.telegram.messenger.g0.L(200.0f);
        this.x = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, x02, x02, x03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.y = linearGradient;
        this.D.setShader(linearGradient);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!this.L) {
            super.dispatchDraw(canvas);
            return;
        }
        k1 k1Var = this.E;
        Paint paint = k1Var != null ? k1Var.D : this.D;
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
        k1 k1Var = this.E;
        if (k1Var != null) {
            k1Var.e();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.I - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int measuredWidth = getMeasuredWidth();
        this.I = elapsedRealtime;
        int i7 = (int) (((abs * measuredWidth) / 400.0f) + this.J);
        this.J = i7;
        if (i7 >= measuredWidth * 4) {
            this.J = (-this.x) * 2;
        }
        float f10 = this.J + this.K;
        Matrix matrix = this.H;
        matrix.setTranslate(f10, 0.0f);
        LinearGradient linearGradient = this.y;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public ws0 getTier() {
        return this.n;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.M) {
            boolean z9 = id.a0;
            TextView textView = this.b;
            if (z9) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, k6.k0);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, k6.k0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        Rect rect = org.telegram.messenger.g0.Q;
        int i13 = this.h;
        int paddingLeft = getPaddingLeft() + org.telegram.messenger.g0.L(i13);
        int measuredHeight = getMeasuredHeight();
        wo woVar = this.a;
        rect.set(paddingLeft, (int) ((measuredHeight - woVar.getMeasuredHeight()) / 2.0f), 0, 0);
        b(woVar);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.c;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i14 = i13 + this.f;
        int measuredWidth = woVar.getMeasuredWidth() + org.telegram.messenger.g0.L(i14 + 24);
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
        int paddingLeft3 = getPaddingLeft() + woVar.getMeasuredWidth() + org.telegram.messenger.g0.L(f10);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.b;
        rect.set(paddingLeft3, visibility == 8 ? (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f) : getPaddingTop(), 0, 0);
        b(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + woVar.getMeasuredWidth() + org.telegram.messenger.g0.L(i14 + 6), org.telegram.messenger.g0.L(2.0f) + getPaddingTop(), 0, 0);
            b(textView4);
        }
        rect.set(getPaddingLeft() + woVar.getMeasuredWidth() + org.telegram.messenger.g0.L(f10), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView2);
        rect.set(getPaddingLeft() + woVar.getMeasuredWidth() + org.telegram.messenger.g0.L(f10) + (textView2.getVisibility() == 0 ? org.telegram.messenger.g0.L(6.0f) + textView2.getMeasuredWidth() : 0), (getMeasuredHeight() - textView3.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView3);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(58.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), TLObject.FLAG_30);
        wo woVar = this.a;
        woVar.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - woVar.getMeasuredWidth(), TLObject.FLAG_31);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        TextView textView = this.c;
        textView.measure(makeMeasureSpec2, makeMeasureSpec3);
        this.b.measure(View.MeasureSpec.makeMeasureSpec((size - woVar.getMeasuredWidth()) - textView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        TextView textView2 = this.r;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - woVar.getMeasuredWidth()) - textView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        } else {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, TLObject.FLAG_30));
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - woVar.getMeasuredWidth(), TLObject.FLAG_31);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        TextView textView3 = this.d;
        textView3.measure(makeMeasureSpec4, makeMeasureSpec5);
        int c10 = org.telegram.messenger.camera.q.c(6.0f, (size - woVar.getMeasuredWidth()) - (textView3.getVisibility() == 0 ? textView3.getMeasuredWidth() : 0), TLObject.FLAG_31);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        TextView textView4 = this.e;
        textView4.measure(c10, makeMeasureSpec6);
        if (textView4.getVisibility() != 0) {
            L -= org.telegram.messenger.g0.L(8.0f);
        }
        setMeasuredDimension(size, L);
    }

    public void setCirclePaintProvider(k9 k9Var) {
        this.a.setCirclePaintProvider(k9Var);
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        this.b.setAlpha(z9 ? 1.0f : 0.6f);
        this.c.setAlpha(z9 ? 1.0f : 0.6f);
        this.a.setAlpha(z9 ? 1.0f : 0.6f);
    }

    public void setGlobalGradientView(k1 k1Var) {
        this.E = k1Var;
    }

    public void setParentXOffset(float f10) {
        this.K = f10;
    }

    public void setProgressDelegate(xo xoVar) {
        this.a.setProgressDelegate(xoVar);
    }
}
