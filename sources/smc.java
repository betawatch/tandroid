// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public class smc extends FrameLayout implements gk7 {
    public static Typeface k0;
    public static Typeface l0;
    public final mmc E;
    public final FrameLayout F;
    public View.OnClickListener G;
    public final xw0 H;
    public final si9 I;
    public final Paint J;
    public float K;
    public final lm L;
    public final View M;
    public final LinearLayout N;
    public final pmc O;
    public final pmc P;
    public final FrameLayout.LayoutParams Q;
    public String R;
    public int S;
    public final byte T;
    public float U;
    public float V;
    public int W;
    public boolean a;
    public c a0;
    public float b;
    public float[] b0;
    public final Matrix c;
    public int c0;
    public final Matrix d;
    public int d0;
    public final Matrix e;
    public float e0;
    public final RectF f;
    public float f0;
    public final lm g0;
    public float h;
    public final lm h0;
    public bnc i0;
    public boolean j0;
    public boolean n;
    public float r;
    public float s;
    public final Matrix w;
    public final Matrix x;
    public final Matrix y;

    /* JADX WARN: Multi-variable type inference failed */
    public smc(Context context, int i, int i2) {
        super(context);
        this.b = 1.0f;
        this.c = new Matrix();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f = new RectF();
        this.s = 1.0f;
        this.w = new Matrix();
        this.x = new Matrix();
        this.y = new Matrix();
        this.J = new Paint(kk7.W2);
        final byte b = 0;
        Runnable runnable = new Runnable(this) { // from class: nmc
            public final /* synthetic */ smc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                smc smcVar = this.b;
                switch (b2) {
                    case 0:
                        smcVar.I.invalidate();
                        break;
                    case 1:
                        smcVar.O.invalidate();
                        smcVar.P.invalidate();
                        break;
                    default:
                        smcVar.H.invalidate();
                        break;
                }
            }
        };
        s33 s33Var = s33.h;
        this.L = new lm(runnable, 240L, s33Var, 0);
        this.W = y6c.t0;
        final byte b2 = 1;
        this.g0 = new lm(new Runnable(this) { // from class: nmc
            public final /* synthetic */ smc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                smc smcVar = this.b;
                switch (b22) {
                    case 0:
                        smcVar.I.invalidate();
                        break;
                    case 1:
                        smcVar.O.invalidate();
                        smcVar.P.invalidate();
                        break;
                    default:
                        smcVar.H.invalidate();
                        break;
                }
            }
        }, 240L, s33Var, 0);
        final byte b3 = 2;
        this.h0 = new lm(new Runnable(this) { // from class: nmc
            public final /* synthetic */ smc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b3;
                smc smcVar = this.b;
                switch (b22) {
                    case 0:
                        smcVar.I.invalidate();
                        break;
                    case 1:
                        smcVar.O.invalidate();
                        smcVar.P.invalidate();
                        break;
                    default:
                        smcVar.H.invalidate();
                        break;
                }
            }
        }, 240L, s33Var, 0);
        this.S = i;
        this.T = i2;
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(gl.L(12.0f), gl.L(12.0f), gl.L(12.0f), gl.L(12.0f));
        mmc mmcVar = new mmc(getContext(), this.S, i2);
        this.E = mmcVar;
        this.F = mmcVar.getFrontFace();
        float[] fArr = this.b0;
        if (fArr != null) {
            setStickerStyle(fArr);
        }
        setAdditionalTilt(this.r);
        setUseGyroscope(this.s);
        this.E.setOnClickListener(this.G);
        addView(this.E, 0, nme.c(-2.0f, -1));
        xw0 xw0Var = new xw0((byte) 9, context, this);
        this.H = xw0Var;
        Typeface typeface = l0;
        if (typeface == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                fk.e();
                typeface = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
                l0 = typeface;
            } else {
                typeface = gl.n1("fonts/rmono.ttf");
                l0 = typeface;
            }
        }
        xw0Var.setTypeface(typeface);
        xw0Var.setTextColor(-1);
        xw0Var.setTextSize(1, 13.0f);
        xw0Var.setEllipsize(TextUtils.TruncateAt.END);
        xw0Var.setMaxLines(1);
        xw0Var.setSingleLine();
        this.F.addView(xw0Var, nme.d(-1, -2.0f, 83, 24.0f, 0.0f, 64.0f, 17.2f));
        si9 si9Var = new si9((byte) 15, context, this);
        this.I = si9Var;
        this.F.addView(si9Var, nme.c(-1.0f, -1));
        View view = new View(context);
        this.M = view;
        this.F.addView(view, nme.d(1, 1.0f, 19, 24.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.N = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout.LayoutParams d = nme.d(-1, -2.0f, 51, 24.0f, 71.0f, 24.0f, 0.0f);
        this.Q = d;
        this.F.addView(linearLayout, d);
        pmc pmcVar = new pmc(this, context, b);
        this.O = pmcVar;
        pmcVar.getDrawable().N = gl.L(4096.0f);
        pmcVar.c.m(0.35f, 320L, 3.5f, s33Var);
        pmcVar.setScaleProperty(0.6f);
        pmcVar.setTypeface(gl.n1("fonts/gram.ttf"));
        pmcVar.setTextSize(gl.L(23.0f));
        pmcVar.setTextColor(-1);
        pmcVar.setIgnoreRTL(true);
        linearLayout.addView(pmcVar, nme.o(-1, 28));
        pmc pmcVar2 = new pmc(this, context, b2);
        this.P = pmcVar2;
        pmcVar2.c.m(0.35f, 320L, 3.5f, s33Var);
        pmcVar2.setScaleProperty(0.6f);
        pmcVar2.setTypeface(gl.n1("fonts/gram.ttf"));
        pmcVar2.setTextSize(gl.L(14.0f));
        pmcVar2.setTextColor(-7868417);
        pmcVar2.setLayoutDirection(0);
        pmcVar2.setTextDirection(3);
        pmcVar2.setGravity(19);
        pmcVar2.setIgnoreRTL(true);
        linearLayout.addView(pmcVar2, nme.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16));
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder((str.length() / 4) + str.length());
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && i % 4 == 0) {
                sb.append(' ');
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static SpannableStringBuilder e(long j) {
        return c.u(new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US)).format(new BigDecimal(c.t(j, false))), 0.8f);
    }

    public static String f(String str) {
        String[] split = str.split(" ");
        if (split.length < 2) {
            return str;
        }
        int length = split.length / 2;
        StringBuilder sb = new StringBuilder(str.length() + 1);
        int i = 0;
        while (i < split.length) {
            if (i > 0) {
                sb.append(i == length ? '\n' : ' ');
            }
            sb.append(split[i]);
            i++;
        }
        return sb.toString();
    }

    public static void k(View view, Matrix matrix) {
        if (!(view.getParent() instanceof View)) {
            matrix.reset();
            return;
        }
        k((View) view.getParent(), matrix);
        matrix.preTranslate(view.getLeft() - r0.getScrollX(), view.getTop() - r0.getScrollY());
        matrix.preConcat(view.getMatrix());
    }

    public final float a() {
        float c = this.O.getDrawable().c();
        float max = Math.max(0.0f, (((((336.0f - this.T) - 48.0f) * this.F.getWidth()) / 336.0f) - this.Q.leftMargin) - gl.L(8.0f));
        if (c > 0.0f) {
            return Math.min(1.0f, max / c);
        }
        return 1.0f;
    }

    public final void b(final Canvas canvas, float f) {
        float width = getFrontFace().getWidth();
        float height = getFrontFace().getHeight();
        float f2 = width / 1640.0f;
        Context context = getContext();
        Typeface typeface = k0;
        if (typeface == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                fk.e();
                typeface = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 400").setWeight(400).build();
                k0 = typeface;
            } else {
                typeface = gl.n1("fonts/rmono.ttf");
                k0 = typeface;
            }
        }
        Paint paint = this.J;
        paint.setTypeface(typeface);
        paint.setTextSize(47.345238f * f2);
        paint.setTextAlign(Paint.Align.CENTER);
        float[] fArr = this.b0;
        byte b = 1;
        paint.setColor(bm2.f((fArr == null || fArr.length < 18) ? 0.0f : fArr[8], znc.b(0, fArr), znc.b(1, fArr)));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        final float f3 = (-(fontMetrics.ascent + fontMetrics.descent)) * 0.5f;
        final float f4 = f2 * 27.333332f;
        final String[] split = f(this.R).split("\\n");
        canvas.save();
        canvas.translate(f2 * 1527.738f, 0.5002976f * height);
        canvas.rotate(90.0f);
        c(f, new dkc(this, b), new Runnable() { // from class: omc
            @Override // java.lang.Runnable
            public final void run() {
                smc smcVar = smc.this;
                smcVar.getClass();
                String[] strArr = split;
                String str = strArr[0];
                float f5 = f4;
                float f6 = f3;
                Paint paint2 = smcVar.J;
                Canvas canvas2 = canvas;
                canvas2.drawText(str, 0.0f, (-f5) + f6, paint2);
                if (strArr.length > 1) {
                    canvas2.drawText(strArr[1], 0.0f, f5 + f6, paint2);
                }
            }
        });
        canvas.restore();
    }

    public final void c(float f, rmc rmcVar, Runnable runnable) {
        rmcVar.a(f > 0.0f ? gl.L(5.0f) : 0.0f, gl.L(1.0f), Color.argb((int) (89.0f * f), 0, 0, 0));
        runnable.run();
        if (f <= 0.0f) {
            return;
        }
        rmcVar.a(gl.N(1.5f), 0.0f, Color.argb((int) (f * 140.0f), 0, 0, 0));
        this.j0 = true;
        runnable.run();
        this.j0 = false;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.c4) {
            Object obj = objArr[0];
            c cVar = this.a0;
            if (obj == cVar) {
                l(cVar);
            }
        }
    }

    public final boolean g(View view, Matrix matrix) {
        if (!isAttachedToWindow() || !view.isAttachedToWindow() || getRootView() != view.getRootView()) {
            return false;
        }
        FrameLayout frameLayout = this.F;
        View view2 = (View) ((View) frameLayout.getParent()).getParent();
        mmc mmcVar = this.E;
        Matrix matrix2 = (Matrix) mmcVar.e.d;
        Matrix matrix3 = this.w;
        matrix3.set(matrix2);
        zab zabVar = mmcVar.f;
        matrix3.preTranslate(zabVar.getLeft(), zabVar.getTop());
        k(view2, matrix);
        matrix.preConcat(matrix3);
        matrix.preTranslate(frameLayout.getLeft() - r1.getScrollX(), frameLayout.getTop() - r1.getScrollY());
        matrix.preConcat(frameLayout.getMatrix());
        Matrix matrix4 = this.x;
        k(view, matrix4);
        Matrix matrix5 = this.y;
        if (!matrix4.invert(matrix5)) {
            return false;
        }
        matrix.postConcat(matrix5);
        return true;
    }

    public View getBalanceAnchor() {
        return this.M;
    }

    public LinearLayout getBalanceLayout() {
        return this.N;
    }

    public hn getBalanceView() {
        return this.O;
    }

    public TextView getCardHolderView() {
        return this.H;
    }

    public float getCardRotationX() {
        return this.E.getCardRotationX();
    }

    public float getCardRotationY() {
        return this.E.getCardRotationY();
    }

    public FrameLayout getFrontFace() {
        return this.F;
    }

    public int getStickerLayerIndex() {
        int indexOfChild = this.F.indexOfChild(this.H);
        int indexOfChild2 = this.F.indexOfChild(this.N);
        return indexOfChild < 0 ? indexOfChild2 < 0 ? this.F.getChildCount() : indexOfChild2 : indexOfChild2 < 0 ? indexOfChild : Math.min(indexOfChild, indexOfChild2);
    }

    public ArrayList<RectF> getStickerObstacles() {
        ArrayList<RectF> arrayList = new ArrayList<>();
        FrameLayout frameLayout = this.F;
        float width = frameLayout.getWidth() / 336.0f;
        float a = a();
        float c = this.O.getDrawable().c() * a;
        float c2 = this.P.getDrawable().c();
        FrameLayout.LayoutParams layoutParams = this.Q;
        float f = layoutParams.leftMargin;
        float f2 = layoutParams.topMargin;
        float bottom = ((r4.getBottom() + r4.getTop()) / 2.0f) + f2;
        float height = (r4.getHeight() * a) / 2.0f;
        arrayList.add(new RectF(f, bottom - height, c + f, bottom + height));
        xw0 xw0Var = this.H;
        arrayList.add(new RectF(xw0Var.getLeft(), xw0Var.getTop(), xw0Var.getLeft() + Math.min(xw0Var.getWidth(), xw0Var.getPaint().measureText(xw0Var.getText().toString())), xw0Var.getBottom()));
        arrayList.add(new RectF(frameLayout.getWidth() - (34.0f * width), 18.0f * width, frameLayout.getWidth() - (12.0f * width), width * 187.0f));
        Path path = new Path();
        h(path, frameLayout.getWidth(), frameLayout.getHeight());
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        arrayList.add(rectF);
        arrayList.add(new RectF(f, r6.getTop() + f2, c2 + f, f2 + r6.getBottom()));
        arrayList.add(this.a ? new RectF(this.f) : new RectF());
        return arrayList;
    }

    public float[] getStickerStyle() {
        return this.b0;
    }

    public hn getUsdBalanceView() {
        return this.P;
    }

    public final void h(Path path, float f, float f2) {
        path.rewind();
        float f3 = 336 - this.T;
        path.addRoundRect(((f3 - 48.0f) * f) / 336.0f, 0.36097562f * f2, (f3 * f) / 336.0f, 0.5365854f * f2, (f * 8.0f) / 336.0f, 0.03902439f * f2, Path.Direction.CW);
    }

    public final void i(float f, float f2) {
        if (this.U == f && this.V == f2) {
            return;
        }
        this.U = f;
        if (f == 0.0f) {
            this.n = false;
        }
        this.V = f2;
        this.O.invalidate();
        this.P.invalidate();
    }

    public final void j(int i, long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        spannableString.setSpan(new qmc(this), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) e(j));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) k96.M0(2131749341, null));
        spannableStringBuilder.setSpan(new yk(this, (byte) 4), length, spannableStringBuilder.length(), 33);
        this.O.setText(spannableStringBuilder);
        long round = Math.round((j / 1.0E9d) * na7.q1(i).k4.k.i * 100.0d);
        pmc pmcVar = this.P;
        ci0.h();
        pmcVar.setText(ci0.f("USD", 2, round, round % 100 == 0));
    }

    public final void l(c cVar) {
        if (cVar != null) {
            int i = cVar.a;
            setCardHolder(l7c.r(y6c.h(i).f()).toUpperCase());
            if (cVar.x() != null) {
                setCardNumber(d(cVar.x().toUpperCase()));
            }
            if (cVar.M()) {
                j(i, cVar.z());
            }
        }
    }

    public final void m() {
        int i;
        float f;
        if (this.i0 != null) {
            float[] fArr = this.b0;
            char c = '\t';
            int i2 = 2;
            boolean z = true;
            float f2 = 0.0f;
            if (fArr == null) {
                fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f, 1.0f};
            }
            float[] fArr2 = znc.c;
            float[] fArr3 = new float[42];
            int i3 = 0;
            while (true) {
                char c2 = c;
                if (i3 >= i2) {
                    break;
                }
                int i4 = i3 << 2;
                int i5 = i4 + 10;
                boolean z2 = z;
                if (fArr.length < 18 || fArr[i5] < f2) {
                    f = f2;
                    System.arraycopy(znc.b, 0, fArr3, i3 * 12, 12);
                    fArr3[i3 + 28] = 1.0f;
                    System.arraycopy(fArr2, 0, fArr3, (i3 * 3) + 30, 3);
                } else {
                    fArr3[i3 + 28] = 0.6f;
                    int i6 = (int) fArr[i5];
                    int i7 = i3 * 3;
                    int i8 = i7 + 30;
                    float f3 = ((i6 >> 16) & kk7.d4) / 255.0f;
                    f = f2;
                    float f4 = ((i6 >> 8) & kk7.d4) / 255.0f;
                    float f5 = (i6 & kk7.d4) / 255.0f;
                    float min = Math.min(f3, Math.min(f4, f5));
                    float max = Math.max(f3, Math.max(f4, f5)) - min;
                    float f6 = (fArr2[i2] * 0.0722f) + (fArr2[z2 ? 1 : 0] * 0.7152f) + (fArr2[0] * 0.2126f);
                    float min2 = Math.min(1.0f, max / 0.15f);
                    fArr3[i8] = tb4.A(max > f ? (f3 - min) / max : f, f6, min2, f6);
                    fArr3[i7 + 31] = tb4.A(max > f ? (f4 - min) / max : f, f6, min2, f6);
                    fArr3[i7 + 32] = tb4.A(max > f ? (f5 - min) / max : f, f6, min2, f6);
                    int i9 = (int) fArr[i5];
                    int i10 = (int) fArr[i4 + 11];
                    int n = znc.n(-16216082, i9, i10);
                    int n2 = znc.n(-15291399, i9, i10);
                    for (int i11 = 0; i11 < 3; i11++) {
                        int i12 = 16 - (i11 << 3);
                        float h = znc.h(n, i12) * 0.73f;
                        float h2 = znc.h(n2, i12) * 0.73f;
                        int i13 = i3 * 12;
                        fArr3[i13 + i11] = (h + h2) / 2.0f;
                        fArr3[i13 + 3 + i11] = h;
                        fArr3[i13 + 6 + i11] = h2;
                        fArr3[i13 + 9 + i11] = h;
                    }
                }
                i3++;
                c = c2;
                z = z2 ? 1 : 0;
                f2 = f;
                i2 = 2;
            }
            boolean z3 = z;
            float f7 = f2;
            int i14 = 0;
            for (int i15 = i2; i14 < i15; i15 = 2) {
                int i16 = i14 << 2;
                int f8 = (fArr.length < 18 || fArr[i16 + 10] < f7) ? bm2.f(0.2f, -16611884, -16748084) : bm2.f(0.2f, ((int) fArr[i16 + 12]) | (-16777216), ((int) fArr[i16 + 11]) | (-16777216));
                int i17 = i14 * 3;
                fArr3[i17 + 36] = ((f8 >> 16) & kk7.d4) / 255.0f;
                fArr3[i17 + 37] = ((f8 >> 8) & kk7.d4) / 255.0f;
                fArr3[i17 + 38] = (f8 & kk7.d4) / 255.0f;
                i14++;
            }
            System.arraycopy(fArr, 6, fArr3, 24, 4);
            float[] fArr4 = this.b0;
            float max2 = (fArr4 == null || fArr4.length <= 8) ? 1.0f : Math.max(f7, Math.min(1.0f, fArr4[8]));
            bnc bncVar = this.i0;
            float R1 = gl.R1(fArr3[30], fArr3[33], max2);
            float R12 = gl.R1(fArr3[31], fArr3[34], max2);
            float R13 = gl.R1(fArr3[32], fArr3[35], max2);
            float[] fArr5 = bnc.j;
            float[] a = bnc.a(R1, R12, R13);
            float f9 = a[0];
            float f10 = a[z3 ? 1 : 0];
            float f11 = a[2];
            if (f9 == bncVar.e && f10 == bncVar.f && f11 == bncVar.g) {
                return;
            }
            bncVar.e = f9;
            bncVar.f = f10;
            bncVar.g = f11;
            float[] fArr6 = bnc.k;
            if (fArr6 == null) {
                fArr6 = bnc.a(0.0f, 0.47809f, 1.0f);
                bnc.k = fArr6;
            }
            float f12 = fArr6[0];
            float f13 = fArr6[z3 ? 1 : 0];
            double d = (f12 - f13) / 1.4142135623730951d;
            double d2 = ((f12 + f13) - (fArr6[2] * 2.0f)) / 2.449489742783178d;
            double d3 = (f9 - f10) / 1.4142135623730951d;
            double d4 = ((f9 + f10) - (f11 * 2.0f)) / 2.449489742783178d;
            int i18 = 0;
            double IEEEremainder = Math.IEEEremainder(Math.atan2(d4, d3) - Math.atan2(d2, d), 6.283185307179586d);
            double min3 = ((Math.min(1.0d, Math.abs(IEEEremainder) / 1.0471975511965976d) * (-0.30000001192092896d)) + 1.0d) * (Math.hypot(d3, d4) / Math.hypot(d, d2));
            double cos = Math.cos(IEEEremainder);
            double sin = Math.sin(IEEEremainder) / 1.7320508075688772d;
            double d5 = ((cos - (cos * 0.3333333333333333d)) * min3) + 0.3333333333333333d;
            double d6 = 0.3333333333333333d - ((cos * min3) * 0.3333333333333333d);
            float[] fArr7 = new float[20];
            int i19 = 0;
            while (true) {
                i = 3;
                if (i19 >= 3) {
                    break;
                }
                int i20 = i18;
                while (i20 < i) {
                    double d7 = i19 == i20 ? d5 : d6;
                    if (i20 == (i19 + 1) % 3) {
                        d7 -= min3 * sin;
                    } else if (i20 == (i19 + 2) % 3) {
                        d7 = (min3 * sin) + d7;
                    }
                    int i21 = i18;
                    double d8 = sin;
                    fArr7[(i19 * 5) + i20] = (float) d7;
                    i20++;
                    i18 = i21;
                    sin = d8;
                    i = 3;
                }
                i19++;
            }
            int i22 = i18;
            int i23 = i22;
            while (i23 < i) {
                float f14 = (fArr5[2] * fArr7[i23 + 10]) + (fArr5[z3 ? 1 : 0] * fArr7[i23 + 5]) + (fArr5[i22] * fArr7[i23]);
                for (int i24 = i22; i24 < 3; i24++) {
                    int i25 = (i24 * 5) + i23;
                    fArr7[i25] = (fArr5[i23] - f14) + fArr7[i25];
                }
                i23++;
                i = 3;
            }
            fArr7[18] = 1.0f;
            bncVar.d.setColorFilter(new ColorMatrixColorFilter(fArr7));
            bncVar.invalidateSelf();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = getParent() instanceof View ? (View) getParent() : null;
        if (view != null) {
            view.setTranslationZ(gl.L(16.0f));
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
        }
        if (this.a0 != null) {
            kk7.f(this.W).b(this, kk7.c4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = getParent() instanceof View ? (View) getParent() : null;
        if (view != null) {
            view.setTranslationZ(0.0f);
        }
        super.onDetachedFromWindow();
        if (this.a0 != null) {
            kk7.f(this.W).n(this, kk7.c4);
        }
    }

    public void setAdditionalTilt(float f) {
        this.r = f;
        this.E.setAdditionalTilt(f);
    }

    public void setCardHolder(CharSequence charSequence) {
        this.H.setText(charSequence);
    }

    public void setCardIcon(int i) {
        this.S = i;
        this.E.setCardIcon(i);
    }

    public void setCardNumber(String str) {
        if (str == null || str.equals(this.R)) {
            return;
        }
        this.R = str;
        this.E.setHasCardNumber(true);
        this.I.invalidate();
    }

    public void setCardOnClickListener(View.OnClickListener onClickListener) {
        this.G = onClickListener;
        this.E.setOnClickListener(onClickListener);
    }

    public void setDiamondOnCard(boolean z) {
        this.a = z;
        this.O.invalidate();
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setStickerImpact(float f) {
        this.E.setScaleX(f);
        this.E.setScaleY(f);
    }

    public void setStickerStyle(float[] fArr) {
        this.b0 = fArr;
        m();
        this.O.invalidate();
        this.I.invalidate();
        this.E.setStickerStyle(fArr);
        this.P.setTextColor(bm2.f(fArr[8], znc.p(-7868417, 0, fArr), znc.p(-7868417, 3, fArr)));
        this.H.invalidate();
    }

    public void setUseGyroscope(float f) {
        this.s = f;
        this.E.setUseGyroscope(f);
    }

    public smc(Context context) {
        this(context, R.drawable.wallet_card_qr, 46);
    }
}
