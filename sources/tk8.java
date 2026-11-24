// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class tk8 extends ViewGroup {
    public final Paint E;
    public tk8 F;
    public int G;
    public int H;
    public final Matrix I;
    public long J;
    public int K;
    public float L;
    public boolean M;
    public boolean N;
    public final jh2 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final byte f;
    public final byte h;
    public ik8 n;
    public final TextView r;
    public final int s;
    public final int w;
    public int x;
    public LinearGradient y;

    public tk8(Context context) {
        super(context);
        this.f = (byte) 12;
        this.h = (byte) 8;
        this.s = cmb.c6;
        this.w = cmb.Z6;
        this.E = new Paint();
        this.I = new Matrix();
        jh2 jh2Var = new jh2(24, null, context);
        this.a = jh2Var;
        jh2Var.setDrawBackgroundAsArc(10);
        int i = cmb.f7;
        jh2Var.b(i, i, cmb.j7);
        addView(jh2Var);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        anb.X(textView, cmb.F6, null);
        textView.setTypeface(gm.o());
        textView.setSingleLine();
        addView(textView, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(gm.L(3.0f), 0, gm.L(3.0f), 0);
        textView2.setTypeface(gm.o());
        addView(textView2, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 14.0f);
        int i2 = cmb.x6;
        anb.X(textView3, i2, null);
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        addView(textView3, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setTextSize(1, 14.0f);
        anb.X(textView4, i2, null);
        textView4.setSingleLine();
        addView(textView4, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.c = textView5;
        textView5.setTextSize(1, 15.0f);
        anb.X(textView5, i2, null);
        textView5.setSingleLine();
        addView(textView5, qoe.e(-2, -2, 8388613));
        setPadding(gm.L(4.0f), gm.L(8.0f), gm.L(4.0f), gm.L(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (r14.g == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ik8 ik8Var, boolean z) {
        boolean z2;
        String e;
        this.n = ik8Var;
        this.N = z;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = ik8Var.a;
        int i = tL_premiumSubscriptionOption.months;
        TextView textView = this.b;
        if (i == 1) {
            textView.setText(jb6.M0(2131746659, null));
        } else if (i == 6) {
            textView.setText(jb6.M0(2131746658, null));
        } else if (i != 12) {
            textView.setText((i <= 12 || i % 12 != 0) ? jb6.G(i, "Months", new Object[0]) : jb6.G(i / 12, "PremiumTierAnnualYears", new Object[0]));
        } else {
            textView.setText(jb6.M0(2131746663, null));
        }
        if (!e21.b()) {
            if (cj0.h().j()) {
                ik8Var.a();
            }
            z2 = true;
            this.M = z2;
            TextView textView2 = this.c;
            TextView textView3 = this.r;
            TextView textView4 = this.d;
            TextView textView5 = this.e;
            if (z2) {
                if (ik8Var.c() <= 0) {
                    textView3.setVisibility(8);
                    textView4.setVisibility(8);
                    textView5.setVisibility(8);
                } else {
                    textView3.setText(jb6.a0(null, null, 2131749441, Integer.valueOf(ik8Var.c())));
                    textView3.setVisibility(0);
                    textView4.setVisibility(0);
                    textView5.setVisibility(0);
                }
                if (e21.b() || tL_premiumSubscriptionOption.store_product == null) {
                    e = cj0.h().e(ik8Var.e, ik8Var.b());
                } else if (ik8Var.f == null) {
                    e = "";
                } else {
                    cj0.h();
                    e = cj0.f(ik8Var.b(), 6, ik8Var.e, false);
                }
                textView4.setText(e);
                textView5.setText(jb6.a0(null, null, 2131746607, ik8Var.f()));
                textView2.setText(jb6.a0(null, null, 2131746608, ik8Var.e()));
                if (tL_premiumSubscriptionOption.current) {
                    textView5.setVisibility(0);
                    textView5.setText(jb6.M0(2131742487, null));
                }
            } else {
                textView3.setText(jb6.a0(null, null, 2131749441, 10));
                textView3.setVisibility(0);
                textView4.setVisibility(0);
                textView5.setVisibility(0);
                textView4.setText("USD00.00");
                textView5.setText(jb6.a0(null, null, 2131746607, 1000));
                textView2.setText(jb6.a0(null, null, 2131746608, 100));
            }
            requestLayout();
        }
        z2 = false;
        this.M = z2;
        TextView textView22 = this.c;
        TextView textView32 = this.r;
        TextView textView42 = this.d;
        TextView textView52 = this.e;
        if (z2) {
        }
        requestLayout();
    }

    public final void b(View view) {
        Rect rect = gm.Q;
        rect.right = view.getMeasuredWidth() + rect.left;
        rect.bottom = view.getMeasuredHeight() + rect.top;
        if (jb6.a0) {
            int i = rect.right;
            rect.right = getWidth() - rect.left;
            rect.left = getWidth() - i;
        }
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void c(boolean z, boolean z2) {
        this.a.a(z, z2);
    }

    public final void d() {
        tk8 tk8Var = this.F;
        if (tk8Var != null) {
            tk8Var.d();
            return;
        }
        int w0 = cmb.w0(null, this.s, false);
        int w02 = cmb.w0(null, this.w, false);
        if (this.H == w02 && this.G == w0) {
            return;
        }
        this.G = w0;
        this.H = w02;
        int L = gm.L(200.0f);
        this.x = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{w02, w0, w0, w02}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.y = linearGradient;
        this.E.setShader(linearGradient);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!this.M) {
            super.dispatchDraw(canvas);
            return;
        }
        tk8 tk8Var = this.F;
        Paint paint = tk8Var != null ? tk8Var.E : this.E;
        drawChild(canvas, this.a, getDrawingTime());
        d();
        e();
        RectF rectF = gm.P;
        TextView textView = this.c;
        rectF.set(textView.getLeft(), gm.L(4.0f) + textView.getTop(), textView.getRight(), textView.getBottom() - gm.L(4.0f));
        canvas.drawRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), paint);
        TextView textView2 = this.d;
        rectF.set(textView2.getLeft(), gm.L(3.0f) + textView2.getTop(), textView2.getRight(), textView2.getBottom() - gm.L(3.0f));
        canvas.drawRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), paint);
        TextView textView3 = this.b;
        rectF.set(textView3.getLeft(), gm.L(4.0f) + textView3.getTop(), textView3.getRight(), textView3.getBottom() - gm.L(4.0f));
        canvas.drawRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), paint);
        invalidate();
    }

    public final void e() {
        tk8 tk8Var = this.F;
        if (tk8Var != null) {
            tk8Var.e();
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
        int i = (int) (((abs * measuredWidth) / 400.0f) + this.K);
        this.K = i;
        if (i >= (measuredWidth << 2)) {
            i = (-this.x) << 1;
            this.K = i;
        }
        float f = i + this.L;
        Matrix matrix = this.I;
        matrix.setTranslate(f, 0.0f);
        LinearGradient linearGradient = this.y;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public ik8 getTier() {
        return this.n;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.N) {
            boolean z = jb6.a0;
            TextView textView = this.b;
            if (z) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, cmb.j0);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, cmb.j0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect = gm.Q;
        byte b = this.h;
        int paddingLeft = getPaddingLeft() + gm.L(b);
        int measuredHeight = getMeasuredHeight();
        jh2 jh2Var = this.a;
        rect.set(paddingLeft, (int) ((measuredHeight - jh2Var.getMeasuredHeight()) / 2.0f), 0, 0);
        b(jh2Var);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.c;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i5 = b + this.f;
        int measuredWidth = jh2Var.getMeasuredWidth() + gm.L(i5 + 24);
        TextView textView2 = this.d;
        int measuredWidth2 = measuredWidth + (textView2.getVisibility() == 0 ? textView2.getMeasuredWidth() : 0);
        TextView textView3 = this.e;
        int paddingLeft2 = getPaddingLeft() + textView3.getMeasuredWidth() + measuredWidth2;
        int measuredWidth3 = getMeasuredWidth() - textView.getMeasuredWidth();
        TextView textView4 = this.r;
        if (paddingLeft2 > measuredWidth3 && textView4.getVisibility() == 0) {
            measuredHeight3 = getPaddingTop() + gm.L(2.0f);
        }
        rect.set(((getMeasuredWidth() - textView.getMeasuredWidth()) - gm.L(16.0f)) - getPaddingRight(), measuredHeight3, 0, 0);
        b(textView);
        float f = i5;
        int paddingLeft3 = getPaddingLeft() + jh2Var.getMeasuredWidth() + gm.L(f);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.b;
        rect.set(paddingLeft3, visibility == 8 ? (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f) : getPaddingTop(), 0, 0);
        b(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + jh2Var.getMeasuredWidth() + gm.L(i5 + 6), gm.L(2.0f) + getPaddingTop(), 0, 0);
            b(textView4);
        }
        rect.set(getPaddingLeft() + jh2Var.getMeasuredWidth() + gm.L(f), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView2);
        rect.set(getPaddingLeft() + jh2Var.getMeasuredWidth() + gm.L(f) + (textView2.getVisibility() == 0 ? gm.L(6.0f) + textView2.getMeasuredWidth() : 0), (getMeasuredHeight() - textView3.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView3);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = gm.L(58.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gm.L(28.0f), TLObject.FLAG_30);
        jh2 jh2Var = this.a;
        jh2Var.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - jh2Var.getMeasuredWidth(), TLObject.FLAG_31);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        TextView textView = this.c;
        textView.measure(makeMeasureSpec2, makeMeasureSpec3);
        this.b.measure(View.MeasureSpec.makeMeasureSpec((size - jh2Var.getMeasuredWidth()) - textView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        TextView textView2 = this.r;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - jh2Var.getMeasuredWidth()) - textView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        } else {
            textView2.measure(TLObject.FLAG_30, TLObject.FLAG_30);
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - jh2Var.getMeasuredWidth(), TLObject.FLAG_31);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        TextView textView3 = this.d;
        textView3.measure(makeMeasureSpec4, makeMeasureSpec5);
        int f = wi8.f(6.0f, (size - jh2Var.getMeasuredWidth()) - (textView3.getVisibility() == 0 ? textView3.getMeasuredWidth() : 0), TLObject.FLAG_31);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        TextView textView4 = this.e;
        textView4.measure(f, makeMeasureSpec6);
        if (textView4.getVisibility() != 0) {
            L -= gm.L(8.0f);
        }
        setMeasuredDimension(size, L);
    }

    public void setCirclePaintProvider(ku4 ku4Var) {
        this.a.setCirclePaintProvider(ku4Var);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setAlpha(z ? 1.0f : 0.6f);
        this.c.setAlpha(z ? 1.0f : 0.6f);
        this.a.setAlpha(z ? 1.0f : 0.6f);
    }

    public void setGlobalGradientView(tk8 tk8Var) {
        this.F = tk8Var;
    }

    public void setParentXOffset(float f) {
        this.L = f;
    }

    public void setProgressDelegate(lh2 lh2Var) {
        this.a.setProgressDelegate(lh2Var);
    }
}
