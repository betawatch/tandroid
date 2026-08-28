package zf;

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
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.ep;
import org.telegram.ui.hw0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class p1 extends ViewGroup {
    public p1 A;
    public int B;
    public int C;
    public final Matrix D;
    public long E;
    public int F;
    public float G;
    public boolean H;
    public boolean I;
    public final dp a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final int f;
    public final int h;
    public hw0 n;
    public final TextView r;
    public final int s;
    public final int v;
    public int w;
    public LinearGradient x;
    public final Paint y;

    public p1(Context context) {
        super(context);
        this.f = 12;
        this.h = 8;
        this.s = f6.d6;
        this.v = f6.a7;
        this.y = new Paint();
        this.D = new Matrix();
        dp dpVar = new dp(context, 24, null);
        this.a = dpVar;
        dpVar.setDrawBackgroundAsArc(10);
        int i9 = f6.g7;
        dpVar.b(i9, i9, f6.k7);
        addView(dpVar);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(f6.w0(null, f6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        addView(textView, e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        textView2.setTypeface(AndroidUtilities.bold());
        addView(textView2, e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 14.0f);
        int i10 = f6.y6;
        textView3.setTextColor(f6.w0(null, i10, false));
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        addView(textView3, e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setTextSize(1, 14.0f);
        textView4.setTextColor(f6.w0(null, i10, false));
        textView4.setSingleLine();
        addView(textView4, e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.c = textView5;
        textView5.setTextSize(1, 15.0f);
        textView5.setTextColor(f6.w0(null, i10, false));
        textView5.setSingleLine();
        addView(textView5, e6.e(-2, -2, 8388613));
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (r11.g == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(hw0 hw0Var, boolean z10) {
        boolean z11;
        this.n = hw0Var;
        this.I = z10;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = hw0Var.a;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = hw0Var.a;
        int i9 = tL_premiumSubscriptionOption.months;
        TextView textView = this.b;
        if (i9 == 1) {
            textView.setText(LocaleController.getString(R.string.PremiumTierMonthly));
        } else if (i9 == 6) {
            textView.setText(LocaleController.getString(R.string.PremiumTierSemiannual));
        } else if (i9 != 12) {
            textView.setText((i9 <= 12 || i9 % 12 != 0) ? LocaleController.formatPluralString("Months", i9, new Object[0]) : LocaleController.formatPluralString("PremiumTierAnnualYears", i9 / 12, new Object[0]));
        } else {
            textView.setText(LocaleController.getString(R.string.PremiumTierAnnual));
        }
        if (!BuildVars.useInvoiceBilling()) {
            if (BillingController.getInstance().isReady()) {
                hw0Var.a();
            }
            z11 = true;
            this.H = z11;
            TextView textView2 = this.c;
            TextView textView3 = this.d;
            TextView textView4 = this.r;
            TextView textView5 = this.e;
            if (z11) {
                if (hw0Var.c() <= 0) {
                    textView4.setVisibility(8);
                    textView3.setVisibility(8);
                    textView5.setVisibility(8);
                } else {
                    textView4.setText(LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(hw0Var.c())));
                    textView4.setVisibility(0);
                    textView3.setVisibility(0);
                    textView5.setVisibility(0);
                }
                textView3.setText((BuildVars.useInvoiceBilling() || tL_premiumSubscriptionOption2.store_product == null) ? BillingController.getInstance().formatCurrency(hw0Var.e, hw0Var.b()) : hw0Var.f == null ? "" : BillingController.getInstance().formatCurrency(hw0Var.e, hw0Var.b(), 6));
                textView5.setText(LocaleController.formatString(R.string.PricePerYear, hw0Var.f()));
                textView2.setText(LocaleController.formatString(R.string.PricePerMonthMe, hw0Var.e()));
                if (tL_premiumSubscriptionOption2.current) {
                    textView5.setVisibility(0);
                    textView5.setText(LocaleController.getString(R.string.YourCurrentPlan));
                }
            } else {
                textView4.setText(LocaleController.formatString(R.string.GiftPremiumOptionDiscount, 10));
                textView4.setVisibility(0);
                textView3.setVisibility(0);
                textView5.setVisibility(0);
                textView3.setText("USD00.00");
                textView5.setText(LocaleController.formatString(R.string.PricePerYear, Integer.valueOf(MediaDataController.MAX_STYLE_RUNS_COUNT)));
                textView2.setText(LocaleController.formatString(R.string.PricePerMonthMe, 100));
            }
            requestLayout();
        }
        z11 = false;
        this.H = z11;
        TextView textView22 = this.c;
        TextView textView32 = this.d;
        TextView textView42 = this.r;
        TextView textView52 = this.e;
        if (z11) {
        }
        requestLayout();
    }

    public final void b(View view) {
        Rect rect = AndroidUtilities.rectTmp2;
        rect.right = view.getMeasuredWidth() + rect.left;
        rect.bottom = view.getMeasuredHeight() + rect.top;
        if (LocaleController.isRTL) {
            int i9 = rect.right;
            rect.right = getWidth() - rect.left;
            rect.left = getWidth() - i9;
        }
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void c(boolean z10, boolean z11) {
        this.a.a(z10, z11);
    }

    public final void d() {
        p1 p1Var = this.A;
        if (p1Var != null) {
            p1Var.d();
            return;
        }
        int w02 = f6.w0(null, this.s, false);
        int w03 = f6.w0(null, this.v, false);
        if (this.C == w03 && this.B == w02) {
            return;
        }
        this.B = w02;
        this.C = w03;
        int dp = AndroidUtilities.dp(200.0f);
        this.w = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, w02, w02, w03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.x = linearGradient;
        this.y.setShader(linearGradient);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!this.H) {
            super.dispatchDraw(canvas);
            return;
        }
        p1 p1Var = this.A;
        Paint paint = p1Var != null ? p1Var.y : this.y;
        drawChild(canvas, this.a, getDrawingTime());
        d();
        e();
        RectF rectF = AndroidUtilities.rectTmp;
        TextView textView = this.c;
        rectF.set(textView.getLeft(), AndroidUtilities.dp(4.0f) + textView.getTop(), textView.getRight(), textView.getBottom() - AndroidUtilities.dp(4.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        TextView textView2 = this.d;
        rectF.set(textView2.getLeft(), AndroidUtilities.dp(3.0f) + textView2.getTop(), textView2.getRight(), textView2.getBottom() - AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        TextView textView3 = this.b;
        rectF.set(textView3.getLeft(), AndroidUtilities.dp(4.0f) + textView3.getTop(), textView3.getRight(), textView3.getBottom() - AndroidUtilities.dp(4.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        invalidate();
    }

    public final void e() {
        p1 p1Var = this.A;
        if (p1Var != null) {
            p1Var.e();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.E - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int measuredWidth = getMeasuredWidth();
        this.E = elapsedRealtime;
        int i9 = (int) (((abs * measuredWidth) / 400.0f) + this.F);
        this.F = i9;
        if (i9 >= measuredWidth * 4) {
            this.F = (-this.w) * 2;
        }
        float f10 = this.F + this.G;
        Matrix matrix = this.D;
        matrix.setTranslate(f10, 0.0f);
        LinearGradient linearGradient = this.x;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public hw0 getTier() {
        return this.n;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.I) {
            boolean z10 = LocaleController.isRTL;
            TextView textView = this.b;
            if (z10) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, f6.k0);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, f6.k0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        Rect rect = AndroidUtilities.rectTmp2;
        int i13 = this.h;
        int paddingLeft = getPaddingLeft() + AndroidUtilities.dp(i13);
        int measuredHeight = getMeasuredHeight();
        dp dpVar = this.a;
        rect.set(paddingLeft, (int) ((measuredHeight - dpVar.getMeasuredHeight()) / 2.0f), 0, 0);
        b(dpVar);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.c;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i14 = i13 + this.f;
        int measuredWidth = dpVar.getMeasuredWidth() + AndroidUtilities.dp(i14 + 24);
        TextView textView2 = this.d;
        int measuredWidth2 = measuredWidth + (textView2.getVisibility() == 0 ? textView2.getMeasuredWidth() : 0);
        TextView textView3 = this.e;
        int paddingLeft2 = getPaddingLeft() + textView3.getMeasuredWidth() + measuredWidth2;
        int measuredWidth3 = getMeasuredWidth() - textView.getMeasuredWidth();
        TextView textView4 = this.r;
        if (paddingLeft2 > measuredWidth3 && textView4.getVisibility() == 0) {
            measuredHeight3 = getPaddingTop() + AndroidUtilities.dp(2.0f);
        }
        rect.set(((getMeasuredWidth() - textView.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) - getPaddingRight(), measuredHeight3, 0, 0);
        b(textView);
        float f10 = i14;
        int paddingLeft3 = getPaddingLeft() + dpVar.getMeasuredWidth() + AndroidUtilities.dp(f10);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.b;
        rect.set(paddingLeft3, visibility == 8 ? (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f) : getPaddingTop(), 0, 0);
        b(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + dpVar.getMeasuredWidth() + AndroidUtilities.dp(i14 + 6), AndroidUtilities.dp(2.0f) + getPaddingTop(), 0, 0);
            b(textView4);
        }
        rect.set(getPaddingLeft() + dpVar.getMeasuredWidth() + AndroidUtilities.dp(f10), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView2);
        rect.set(getPaddingLeft() + dpVar.getMeasuredWidth() + AndroidUtilities.dp(f10) + (textView2.getVisibility() == 0 ? AndroidUtilities.dp(6.0f) + textView2.getMeasuredWidth() : 0), (getMeasuredHeight() - textView3.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView3);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int dp = AndroidUtilities.dp(58.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30);
        dp dpVar = this.a;
        dpVar.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - dpVar.getMeasuredWidth(), TLObject.FLAG_31);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31);
        TextView textView = this.c;
        textView.measure(makeMeasureSpec2, makeMeasureSpec3);
        this.b.measure(View.MeasureSpec.makeMeasureSpec((size - dpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
        TextView textView2 = this.r;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - dpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
        } else {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, TLObject.FLAG_30));
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - dpVar.getMeasuredWidth(), TLObject.FLAG_31);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31);
        TextView textView3 = this.d;
        textView3.measure(makeMeasureSpec4, makeMeasureSpec5);
        int d = ll.d(6.0f, (size - dpVar.getMeasuredWidth()) - (textView3.getVisibility() == 0 ? textView3.getMeasuredWidth() : 0), TLObject.FLAG_31);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31);
        TextView textView4 = this.e;
        textView4.measure(d, makeMeasureSpec6);
        if (textView4.getVisibility() != 0) {
            dp -= AndroidUtilities.dp(8.0f);
        }
        setMeasuredDimension(size, dp);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        this.a.setCirclePaintProvider(genericProvider);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.b.setAlpha(z10 ? 1.0f : 0.6f);
        this.c.setAlpha(z10 ? 1.0f : 0.6f);
        this.a.setAlpha(z10 ? 1.0f : 0.6f);
    }

    public void setGlobalGradientView(p1 p1Var) {
        this.A = p1Var;
    }

    public void setParentXOffset(float f10) {
        this.G = f10;
    }

    public void setProgressDelegate(ep epVar) {
        this.a.setProgressDelegate(epVar);
    }
}
