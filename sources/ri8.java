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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class ri8 extends ViewGroup {
    public final Paint E;
    public ri8 F;
    public int G;
    public int H;
    public final Matrix I;
    public long J;
    public int K;
    public float L;
    public boolean M;
    public boolean N;
    public final wf2 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final byte f;
    public final byte h;
    public gi8 n;
    public final TextView r;
    public final int s;
    public final int w;
    public int x;
    public LinearGradient y;

    public ri8(Context context) {
        super(context);
        this.f = (byte) 12;
        this.h = (byte) 8;
        this.s = bkb.c6;
        this.w = bkb.Z6;
        this.E = new Paint();
        this.I = new Matrix();
        wf2 wf2Var = new wf2(24, null, context);
        this.a = wf2Var;
        wf2Var.setDrawBackgroundAsArc(10);
        int i = bkb.f7;
        wf2Var.b(i, i, bkb.j7);
        addView(wf2Var);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        zkb.X(textView, bkb.F6, null);
        textView.setTypeface(gl.o());
        textView.setSingleLine();
        addView(textView, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(gl.L(3.0f), 0, gl.L(3.0f), 0);
        textView2.setTypeface(gl.o());
        addView(textView2, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 14.0f);
        int i2 = bkb.x6;
        zkb.X(textView3, i2, null);
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        addView(textView3, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setTextSize(1, 14.0f);
        zkb.X(textView4, i2, null);
        textView4.setSingleLine();
        addView(textView4, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.c = textView5;
        textView5.setTextSize(1, 15.0f);
        zkb.X(textView5, i2, null);
        textView5.setSingleLine();
        addView(textView5, nme.e(-2, -2, 8388613));
        setPadding(gl.L(4.0f), gl.L(8.0f), gl.L(4.0f), gl.L(8.0f));
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
    public final void a(gi8 gi8Var, boolean z) {
        boolean z2;
        String e;
        this.n = gi8Var;
        this.N = z;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = gi8Var.a;
        int i = tL_premiumSubscriptionOption.months;
        TextView textView = this.b;
        if (i == 1) {
            textView.setText(k96.M0(2131746733, null));
        } else if (i == 6) {
            textView.setText(k96.M0(2131746732, null));
        } else if (i != 12) {
            textView.setText((i <= 12 || i % 12 != 0) ? k96.G(i, "Months", new Object[0]) : k96.G(i / 12, "PremiumTierAnnualYears", new Object[0]));
        } else {
            textView.setText(k96.M0(2131746737, null));
        }
        if (!w01.b()) {
            if (ci0.h().j()) {
                gi8Var.a();
            }
            z2 = true;
            this.M = z2;
            TextView textView2 = this.c;
            TextView textView3 = this.r;
            TextView textView4 = this.d;
            TextView textView5 = this.e;
            if (z2) {
                if (gi8Var.c() <= 0) {
                    textView3.setVisibility(8);
                    textView4.setVisibility(8);
                    textView5.setVisibility(8);
                } else {
                    textView3.setText(k96.a0(null, null, 2131749492, Integer.valueOf(gi8Var.c())));
                    textView3.setVisibility(0);
                    textView4.setVisibility(0);
                    textView5.setVisibility(0);
                }
                if (w01.b() || tL_premiumSubscriptionOption.store_product == null) {
                    e = ci0.h().e(gi8Var.e, gi8Var.b());
                } else if (gi8Var.f == null) {
                    e = "";
                } else {
                    ci0.h();
                    e = ci0.f(gi8Var.b(), 6, gi8Var.e, false);
                }
                textView4.setText(e);
                textView5.setText(k96.a0(null, null, 2131746681, gi8Var.f()));
                textView2.setText(k96.a0(null, null, 2131746682, gi8Var.e()));
                if (tL_premiumSubscriptionOption.current) {
                    textView5.setVisibility(0);
                    textView5.setText(k96.M0(2131742561, null));
                }
            } else {
                textView3.setText(k96.a0(null, null, 2131749492, 10));
                textView3.setVisibility(0);
                textView4.setVisibility(0);
                textView5.setVisibility(0);
                textView4.setText("USD00.00");
                textView5.setText(k96.a0(null, null, 2131746681, 1000));
                textView2.setText(k96.a0(null, null, 2131746682, 100));
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
        Rect rect = gl.Q;
        rect.right = view.getMeasuredWidth() + rect.left;
        rect.bottom = view.getMeasuredHeight() + rect.top;
        if (k96.a0) {
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
        ri8 ri8Var = this.F;
        if (ri8Var != null) {
            ri8Var.d();
            return;
        }
        int w0 = bkb.w0(null, this.s, false);
        int w02 = bkb.w0(null, this.w, false);
        if (this.H == w02 && this.G == w0) {
            return;
        }
        this.G = w0;
        this.H = w02;
        int L = gl.L(200.0f);
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
        ri8 ri8Var = this.F;
        Paint paint = ri8Var != null ? ri8Var.E : this.E;
        drawChild(canvas, this.a, getDrawingTime());
        d();
        e();
        RectF rectF = gl.P;
        TextView textView = this.c;
        rectF.set(textView.getLeft(), gl.L(4.0f) + textView.getTop(), textView.getRight(), textView.getBottom() - gl.L(4.0f));
        canvas.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), paint);
        TextView textView2 = this.d;
        rectF.set(textView2.getLeft(), gl.L(3.0f) + textView2.getTop(), textView2.getRight(), textView2.getBottom() - gl.L(3.0f));
        canvas.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), paint);
        TextView textView3 = this.b;
        rectF.set(textView3.getLeft(), gl.L(4.0f) + textView3.getTop(), textView3.getRight(), textView3.getBottom() - gl.L(4.0f));
        canvas.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), paint);
        invalidate();
    }

    public final void e() {
        ri8 ri8Var = this.F;
        if (ri8Var != null) {
            ri8Var.e();
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

    public gi8 getTier() {
        return this.n;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.N) {
            boolean z = k96.a0;
            TextView textView = this.b;
            if (z) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, bkb.j0);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, bkb.j0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect = gl.Q;
        byte b = this.h;
        int paddingLeft = getPaddingLeft() + gl.L(b);
        int measuredHeight = getMeasuredHeight();
        wf2 wf2Var = this.a;
        rect.set(paddingLeft, (int) ((measuredHeight - wf2Var.getMeasuredHeight()) / 2.0f), 0, 0);
        b(wf2Var);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.c;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i5 = b + this.f;
        int measuredWidth = wf2Var.getMeasuredWidth() + gl.L(i5 + 24);
        TextView textView2 = this.d;
        int measuredWidth2 = measuredWidth + (textView2.getVisibility() == 0 ? textView2.getMeasuredWidth() : 0);
        TextView textView3 = this.e;
        int paddingLeft2 = getPaddingLeft() + textView3.getMeasuredWidth() + measuredWidth2;
        int measuredWidth3 = getMeasuredWidth() - textView.getMeasuredWidth();
        TextView textView4 = this.r;
        if (paddingLeft2 > measuredWidth3 && textView4.getVisibility() == 0) {
            measuredHeight3 = getPaddingTop() + gl.L(2.0f);
        }
        rect.set(((getMeasuredWidth() - textView.getMeasuredWidth()) - gl.L(16.0f)) - getPaddingRight(), measuredHeight3, 0, 0);
        b(textView);
        float f = i5;
        int paddingLeft3 = getPaddingLeft() + wf2Var.getMeasuredWidth() + gl.L(f);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.b;
        rect.set(paddingLeft3, visibility == 8 ? (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f) : getPaddingTop(), 0, 0);
        b(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + wf2Var.getMeasuredWidth() + gl.L(i5 + 6), gl.L(2.0f) + getPaddingTop(), 0, 0);
            b(textView4);
        }
        rect.set(getPaddingLeft() + wf2Var.getMeasuredWidth() + gl.L(f), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView2);
        rect.set(getPaddingLeft() + wf2Var.getMeasuredWidth() + gl.L(f) + (textView2.getVisibility() == 0 ? gl.L(6.0f) + textView2.getMeasuredWidth() : 0), (getMeasuredHeight() - textView3.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView3);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = gl.L(58.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gl.L(28.0f), TLObject.FLAG_30);
        wf2 wf2Var = this.a;
        wf2Var.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - wf2Var.getMeasuredWidth(), TLObject.FLAG_31);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        TextView textView = this.c;
        textView.measure(makeMeasureSpec2, makeMeasureSpec3);
        this.b.measure(View.MeasureSpec.makeMeasureSpec((size - wf2Var.getMeasuredWidth()) - textView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        TextView textView2 = this.r;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - wf2Var.getMeasuredWidth()) - textView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        } else {
            textView2.measure(TLObject.FLAG_30, TLObject.FLAG_30);
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - wf2Var.getMeasuredWidth(), TLObject.FLAG_31);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        TextView textView3 = this.d;
        textView3.measure(makeMeasureSpec4, makeMeasureSpec5);
        int f = ug8.f(6.0f, (size - wf2Var.getMeasuredWidth()) - (textView3.getVisibility() == 0 ? textView3.getMeasuredWidth() : 0), TLObject.FLAG_31);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31);
        TextView textView4 = this.e;
        textView4.measure(f, makeMeasureSpec6);
        if (textView4.getVisibility() != 0) {
            L -= gl.L(8.0f);
        }
        setMeasuredDimension(size, L);
    }

    public void setCirclePaintProvider(js4 js4Var) {
        this.a.setCirclePaintProvider(js4Var);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setAlpha(z ? 1.0f : 0.6f);
        this.c.setAlpha(z ? 1.0f : 0.6f);
        this.a.setAlpha(z ? 1.0f : 0.6f);
    }

    public void setGlobalGradientView(ri8 ri8Var) {
        this.F = ri8Var;
    }

    public void setParentXOffset(float f) {
        this.L = f;
    }

    public void setProgressDelegate(xf2 xf2Var) {
        this.a.setProgressDelegate(xf2Var);
    }
}
