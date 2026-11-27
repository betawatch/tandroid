// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class skb extends FrameLayout implements snb {
    public static final /* synthetic */ int W = 0;
    public boolean E;
    public final vnb F;
    public boolean G;
    public byte H;
    public boolean I;
    public float J;
    public float K;
    public ul L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public PorterDuffColorFilter Q;
    public CharSequence R;
    public boolean S;
    public Paint T;
    public boolean U;
    public int V;
    public final ema a;
    public final ema b;
    public final in c;
    public final ema d;
    public final e29 e;
    public Switch f;
    public final ImageView h;
    public byte n;
    public boolean r;
    public int s;
    public byte w;
    public int x;
    public boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    public skb(int i, vnb vnbVar, Context context, boolean z, boolean z2) {
        super(context);
        this.s = 71;
        this.w = (byte) 50;
        this.x = 21;
        this.F = vnbVar;
        this.n = i;
        ema emaVar = new ema(context);
        this.a = emaVar;
        yob.W(emaVar, z ? aob.j5 : aob.G6, vnbVar);
        emaVar.setTextSize(16);
        emaVar.setGravity(ob6.a0 ? 5 : 3);
        emaVar.setImportantForAccessibility(2);
        addView(emaVar, tre.c(-1.0f, -2));
        ema emaVar2 = new ema(context);
        this.b = emaVar2;
        yob.W(emaVar2, z ? aob.p5 : aob.y6, vnbVar);
        emaVar2.setTextSize(13);
        emaVar2.setGravity(ob6.a0 ? 5 : 3);
        emaVar2.setImportantForAccessibility(2);
        addView(emaVar2, tre.c(-1.0f, -2));
        in inVar = new in(context, false, true, true);
        this.c = inVar;
        yob.U(inVar, z ? aob.n5 : aob.I6, vnbVar);
        inVar.setPadding(0, hl.L(18.0f), 0, hl.L(18.0f));
        inVar.setTextSize(hl.L(16.0f));
        inVar.setGravity(ob6.a0 ? 3 : 5);
        inVar.setImportantForAccessibility(2);
        inVar.setTranslationY(hl.L(-2.0f));
        addView(inVar);
        ema emaVar3 = new ema(context);
        this.d = emaVar3;
        Boolean bool = Boolean.FALSE;
        if (!emaVar3.Q) {
            emaVar3.o0 = true;
            emaVar3.q0 = bool;
            emaVar3.m();
            emaVar3.b();
        }
        emaVar3.r0 = 18;
        emaVar3.m();
        yob.W(emaVar3, z ? aob.n5 : aob.I6, vnbVar);
        emaVar3.setGravity(ob6.a0 ? 3 : 5);
        emaVar3.setTextSize(16);
        emaVar3.setImportantForAccessibility(2);
        emaVar3.setVisibility(8);
        addView(emaVar3);
        e29 e29Var = new e29(context);
        this.e = e29Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        e29Var.setScaleType(scaleType);
        yob.s(e29Var, z ? aob.J5 : aob.m6, vnbVar, PorterDuff.Mode.SRC_IN);
        addView(e29Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(scaleType);
        addView(imageView);
        if (z2) {
            Switch r3 = new Switch(context, vnbVar);
            this.f = r3;
            int i2 = aob.M6;
            int i3 = aob.N6;
            int i4 = aob.d6;
            r3.d(i2, i3, i4, i4);
            addView(this.f, tre.d(37, 20.0f, (ob6.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public static SpannableStringBuilder b(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        lf4 lf4Var = new lf4();
        lf4Var.f = aob.w0(null, aob.Ck, false);
        lf4Var.n = false;
        spannableStringBuilder.setSpan(lf4Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final void a() {
        ema emaVar = this.a;
        int intValue = emaVar.getTag() instanceof Integer ? ((Integer) emaVar.getTag()).intValue() : aob.G6;
        vnb vnbVar = this.F;
        int v0 = aob.v0(intValue, vnbVar);
        if (intValue != aob.j5 && intValue != aob.G6) {
            v0 = e(v0);
        }
        if (this.N) {
            emaVar.setTextColor(v0);
        }
        if (this.O) {
            e29 e29Var = this.e;
            if (e29Var.getTag() instanceof Integer) {
                int intValue2 = ((Integer) e29Var.getTag()).intValue();
                int v02 = aob.v0(intValue2, vnbVar);
                if (intValue2 != aob.J5 && intValue2 != aob.m6) {
                    v02 = e(v02);
                }
                if (v02 != this.P || e29Var.getColorFilter() != this.Q) {
                    this.P = v02;
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN);
                    this.Q = porterDuffColorFilter;
                    e29Var.setColorFilter(porterDuffColorFilter);
                }
            }
        }
        this.b.setTextColor(e(aob.v0(aob.y6, vnbVar)));
        int i = aob.I6;
        this.c.setTextColor(e(aob.v0(i, vnbVar)));
        this.d.setTextColor(e(aob.v0(i, vnbVar)));
    }

    public final int c(boolean z) {
        return this.S ? z ? 52 : 58 : z ? 65 : 71;
    }

    public final boolean d() {
        Switch r0 = this.f;
        return r0 != null && r0.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float f;
        if (this.I || this.K != 0.0f) {
            if (this.T == null) {
                Paint paint = new Paint(1);
                this.T = paint;
                paint.setColor(aob.v0(aob.O5, this.F));
            }
            boolean z = this.U;
            float f2 = this.J;
            if (z) {
                f = f2 + 0.016f;
                this.J = f;
                if (f > 1.0f) {
                    this.J = 1.0f;
                    this.U = false;
                    f = 1.0f;
                }
            } else {
                f = f2 - 0.016f;
                this.J = f;
                if (f < 0.0f) {
                    this.J = 0.0f;
                    this.U = true;
                    f = 0.0f;
                }
            }
            int i = this.V;
            if (i > 0) {
                this.V = i - 15;
            } else {
                boolean z2 = this.I;
                float f3 = this.K;
                if (z2) {
                    if (f3 != 1.0f) {
                        float f4 = f3 + 0.10666667f;
                        this.K = f4;
                        if (f4 > 1.0f) {
                            this.K = 1.0f;
                        }
                    }
                } else if (f3 != 0.0f) {
                    float f5 = f3 - 0.10666667f;
                    this.K = f5;
                    if (f5 < 0.0f) {
                        this.K = 0.0f;
                    }
                }
            }
            this.T.setAlpha((int) (((f * 0.4f) + 0.6f) * this.K * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = hl.P;
            rectF.set((getMeasuredWidth() - hl.L(21.0f)) - hl.L(this.H), measuredHeight - hl.L(3.0f), getMeasuredWidth() - hl.L(21.0f), hl.L(3.0f) + measuredHeight);
            if (ob6.a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, hl.L(3.0f), hl.L(3.0f), this.T);
            invalidate();
        }
        float f6 = 1.0f - this.K;
        ul ulVar = this.L;
        this.c.setAlpha(f6 * (ulVar == null ? 1.0f : 1.0f - ulVar.e()) * (isEnabled() ? 1.0f : 0.5f));
        float f7 = 1.0f - this.K;
        ul ulVar2 = this.L;
        this.d.setAlpha(f7 * (ulVar2 == null ? 1.0f : 1.0f - ulVar2.e()) * (isEnabled() ? 1.0f : 0.5f));
        super.dispatchDraw(canvas);
        ul ulVar3 = this.L;
        if (ulVar3 != null) {
            ulVar3.setBounds((getWidth() - this.L.s) - hl.L(18.0f), (getHeight() - this.L.s) / 2, getWidth() - hl.L(18.0f), (getHeight() + this.L.s) / 2);
            this.L.draw(canvas);
        }
    }

    public final void f(int i, int i2, int i3) {
        this.s = c(true);
        e29 e29Var = this.e;
        e29Var.setVisibility(0);
        e29Var.setPadding(hl.L(2.0f), hl.L(2.0f), hl.L(2.0f), hl.L(2.0f));
        e29Var.setTranslationX(hl.L(ob6.a0 ? 0.0f : -3.0f));
        e29Var.setImageResource(i3);
        this.O = false;
        e29Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        vnb vnbVar = this.F;
        boolean a = vnbVar != null ? vnbVar.a() : aob.I.o();
        n57 n57Var = new n57((byte) 1);
        n57Var.b(i, i2);
        n57Var.b = a;
        e29Var.setBackground(n57Var);
    }

    public final void g(int i, int i2) {
        vnb vnbVar = this.F;
        int v0 = aob.v0(i2, vnbVar);
        ema emaVar = this.a;
        emaVar.setTextColor(v0);
        emaVar.setTag(Integer.valueOf(i2));
        this.N = true;
        if (i >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(aob.v0(i, vnbVar), PorterDuff.Mode.SRC_IN);
            e29 e29Var = this.e;
            e29Var.setColorFilter(porterDuffColorFilter);
            e29Var.setTag(Integer.valueOf(i));
            this.O = true;
        }
        a();
    }

    public Switch getCheckBox() {
        return this.f;
    }

    public int getDefaultImageLeft() {
        return this.S ? 16 : 21;
    }

    public e29 getImageView() {
        return this.e;
    }

    public ema getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public in getValueTextView() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(int i, boolean z, boolean z2) {
        this.I = z;
        this.H = i;
        if (!z2) {
            this.K = z ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void i(boolean z, boolean z2) {
        super.setEnabled(z);
        Switch r5 = this.f;
        if (r5 != null) {
            r5.setEnabled(z);
        }
        this.a.animate().alpha(z ? 1.0f : 0.5f).start();
        this.b.animate().alpha(z ? 1.0f : 0.5f).start();
        this.c.animate().alpha(z ? 1.0f : 0.5f).start();
        this.d.animate().alpha(z ? 1.0f : 0.5f).start();
    }

    public final void j(int i) {
        ema emaVar = this.a;
        if (i <= 0) {
            emaVar.i(null);
            return;
        }
        emaVar.i(new hc(i, this.F, getContext(), false));
        emaVar.setDrawablePadding(hl.L(6.0f));
    }

    public final void k(CharSequence charSequence, boolean z) {
        this.x = getDefaultImageLeft();
        ema emaVar = this.a;
        emaVar.l(charSequence, false);
        emaVar.i(null);
        this.R = null;
        in inVar = this.c;
        inVar.c(null, false, true);
        this.e.setVisibility(8);
        inVar.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z;
        setWillNotDraw(!z);
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    public final void l(CharSequence charSequence, boolean z, boolean z2) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        ema emaVar = this.a;
        emaVar.l(charSequence, false);
        emaVar.i(null);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z2;
        Switch r6 = this.f;
        if (r6 != null) {
            r6.setVisibility(0);
            this.f.c(z, false);
        }
        setWillNotDraw(!this.r);
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    public final void m(String str, boolean z, int i, int i2, boolean z2) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        ema emaVar = this.a;
        emaVar.l(str, false);
        emaVar.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        f(i2, i2, i);
        if (this.f == null) {
            Switch r11 = new Switch(getContext(), this.F);
            this.f = r11;
            int i3 = aob.M6;
            int i4 = aob.N6;
            int i5 = aob.d6;
            r11.d(i3, i4, i5, i5);
            addView(this.f, tre.d(37, 20.0f, (ob6.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r112 = this.f;
        if (r112 != null) {
            r112.setVisibility(0);
            this.f.c(z, false);
        }
        this.r = z2;
        setWillNotDraw(!z2);
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    public final void n(int i, String str, boolean z) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        ema emaVar = this.a;
        emaVar.l(str, false);
        emaVar.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r1 = this.f;
        if (r1 != null) {
            r1.setVisibility(0);
            this.f.c(z, false);
        }
        e29 e29Var = this.e;
        e29Var.setVisibility(0);
        e29Var.setPadding(0, hl.L(7.0f), 0, 0);
        e29Var.setImageResource(i);
        this.r = false;
        setWillNotDraw(true);
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    public final void o(int i, CharSequence charSequence, boolean z) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        ema emaVar = this.a;
        emaVar.l(charSequence, false);
        emaVar.i(null);
        this.R = null;
        in inVar = this.c;
        inVar.c(null, false, true);
        e29 e29Var = this.e;
        e29Var.setImageResource(i);
        e29Var.setVisibility(0);
        inVar.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        e29Var.setPadding(0, hl.L(7.0f), 0, 0);
        this.r = z;
        setWillNotDraw(!z);
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.b();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.r) {
            vnb vnbVar = this.F;
            Paint d = vnbVar != null ? vnbVar.d("paintDivider") : null;
            if (d == null) {
                d = aob.j0;
            }
            Paint paint = d;
            int L = hl.L(this.e.getVisibility() == 0 ? this.y ? 72 : this.s : this.n);
            float f = ob6.a0 ? 0.0f : L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!ob6.a0) {
                L = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ema emaVar = this.a;
        CharSequence text = emaVar.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        in inVar = this.c;
        if (!isEmpty) {
            CharSequence text2 = inVar.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f.h);
            StringBuilder sb = new StringBuilder();
            sb.append(emaVar.getText());
            if (!TextUtils.isEmpty(inVar.getText())) {
                sb.append('\n');
                sb.append(inVar.getText());
            }
            accessibilityNodeInfo.setContentDescription(sb);
        } else if (!TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(text);
        }
        accessibilityNodeInfo.addAction(16);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        int i5 = i4 - i2;
        int i6 = i3 - i;
        ema emaVar = this.d;
        int textHeight = emaVar.getTextHeight();
        in inVar = this.c;
        int max = ((i5 - Math.max(textHeight, inVar.getTextHeight())) / 2) + 1;
        int L2 = ob6.a0 ? hl.L(this.n - 6) : (i6 - inVar.getMeasuredWidth()) - hl.L(this.n - 6);
        if (this.E && !ob6.a0) {
            L2 = (i6 - inVar.getMeasuredWidth()) - hl.L(this.n);
        }
        inVar.layout(L2, max, inVar.getMeasuredWidth() + L2, inVar.getMeasuredHeight() + max);
        int L3 = ob6.a0 ? hl.L(this.n - 6) : (i6 - emaVar.getMeasuredWidth()) - hl.L(this.n - 6);
        emaVar.layout(L3, max, emaVar.getMeasuredWidth() + L3, emaVar.getMeasuredHeight() + max);
        boolean z2 = ob6.a0;
        e29 e29Var = this.e;
        ema emaVar2 = this.a;
        if (z2) {
            L = (getMeasuredWidth() - emaVar2.getMeasuredWidth()) - hl.L(e29Var.getVisibility() == 0 ? this.s : this.n);
        } else {
            L = hl.L(e29Var.getVisibility() == 0 ? this.s : this.n);
        }
        ema emaVar3 = this.b;
        if (emaVar3.getVisibility() == 0) {
            float f = this.w > 50 ? 4 : 2;
            int L4 = hl.L(1.0f) + ik8.D(f, (i5 - emaVar2.getTextHeight()) - emaVar3.getTextHeight(), 2);
            emaVar2.layout(L, L4, emaVar2.getMeasuredWidth() + L, emaVar2.getMeasuredHeight() + L4);
            int L5 = hl.L(f) + emaVar2.getTextHeight() + L4;
            emaVar3.layout(L, L5, emaVar3.getMeasuredWidth() + L, emaVar3.getMeasuredHeight() + L5);
        } else {
            int L6 = hl.L(1.0f) + ((i5 - emaVar2.getTextHeight()) / 2);
            emaVar2.layout(L, L6, emaVar2.getMeasuredWidth() + L, emaVar2.getMeasuredHeight() + L6);
        }
        if (e29Var.getVisibility() == 0) {
            int L7 = hl.L(1.0f) + ((((i5 - e29Var.getMeasuredHeight()) / 2) + hl.L(this.w > 50 ? 0.0f : 2.0f)) - e29Var.getPaddingTop());
            int L8 = !ob6.a0 ? hl.L(this.x) : (i6 - e29Var.getMeasuredWidth()) - hl.L(this.x);
            e29Var.layout(L8, L7, e29Var.getMeasuredWidth() + L8, e29Var.getMeasuredHeight() + L7);
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            int L9 = hl.L(1.0f) + ((i5 - imageView.getMeasuredHeight()) / 2);
            int L10 = ob6.a0 ? hl.L(23.0f) : (i6 - imageView.getMeasuredWidth()) - hl.L(23.0f);
            imageView.layout(L10, L9, imageView.getMeasuredWidth() + L10, imageView.getMeasuredHeight() + L9);
        }
        Switch r9 = this.f;
        if (r9 == null || r9.getVisibility() != 0) {
            return;
        }
        int measuredHeight = (i5 - this.f.getMeasuredHeight()) / 2;
        int L11 = ob6.a0 ? hl.L(22.0f) : (i6 - this.f.getMeasuredWidth()) - hl.L(22.0f);
        Switch r10 = this.f;
        r10.layout(L11, measuredHeight, r10.getMeasuredWidth() + L11, this.f.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        CharSequence charSequence;
        int size = View.MeasureSpec.getSize(i);
        int L = hl.L(this.w);
        int i3 = this.M;
        in inVar = this.c;
        if (i3 != 0 && i3 != size && (charSequence = this.R) != null) {
            inVar.c(TextUtils.ellipsize(charSequence, inVar.getPaint(), hl.q.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.M = size;
        boolean z = this.E;
        byte b = this.n;
        ema emaVar = this.b;
        ema emaVar2 = this.d;
        ema emaVar3 = this.a;
        if (z) {
            emaVar3.measure(ik8.f(b + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
            emaVar.measure(ik8.f(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
            inVar.measure(View.MeasureSpec.makeMeasureSpec((size - hl.L(this.n + 103)) - emaVar3.getTextWidth(), ob6.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
            emaVar2.measure(View.MeasureSpec.makeMeasureSpec((size - hl.L(this.n + 103)) - emaVar3.getTextWidth(), ob6.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
        } else {
            inVar.measure(View.MeasureSpec.makeMeasureSpec(size - hl.L(b), ob6.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
            emaVar2.measure(View.MeasureSpec.makeMeasureSpec(size - hl.L(this.n), ob6.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
            int max = Math.max(inVar.d(), emaVar2.getTextWidth());
            emaVar3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - hl.L(this.n + 71)) - max), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
            emaVar.measure(View.MeasureSpec.makeMeasureSpec((size - hl.L(this.n + 71)) - max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
        }
        e29 e29Var = this.e;
        if (e29Var.getVisibility() == 0) {
            e29Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        Switch r0 = this.f;
        if (r0 != null) {
            r0.measure(View.MeasureSpec.makeMeasureSpec(hl.L(37.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(size, L + (this.r ? 1 : 0));
    }

    public final void p(CharSequence charSequence, Drawable drawable, boolean z) {
        this.s = c(false);
        this.x = 18;
        ema emaVar = this.a;
        emaVar.l(charSequence, false);
        emaVar.i(null);
        this.R = null;
        in inVar = this.c;
        inVar.c(null, false, true);
        e29 e29Var = this.e;
        e29Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof b29) {
            e29Var.setAnimation((b29) drawable);
        } else {
            e29Var.setImageDrawable(drawable);
        }
        e29Var.setVisibility(0);
        inVar.setVisibility(8);
        this.h.setVisibility(8);
        e29Var.setPadding(0, hl.L(6.0f), 0, 0);
        this.r = z;
        setWillNotDraw(!z);
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        ema emaVar = this.a;
        emaVar.l(charSequence, false);
        emaVar.i(null);
        this.R = charSequence2;
        in inVar = this.c;
        inVar.c(charSequence2 == null ? null : TextUtils.ellipsize(charSequence2, inVar.getPaint(), hl.q.x / 2.5f, TextUtils.TruncateAt.END), z, true);
        inVar.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z2;
        setWillNotDraw(!z2);
        Switch r7 = this.f;
        if (r7 != null) {
            r7.setVisibility(8);
        }
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    public final void r(String str, String str2, boolean z, int i, int i2, int i3, boolean z2) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        ema emaVar = this.a;
        emaVar.l(str, false);
        emaVar.i(null);
        this.R = str2;
        in inVar = this.c;
        inVar.c(TextUtils.ellipsize(str2, inVar.getPaint(), hl.q.x / 2.5f, TextUtils.TruncateAt.END), z, true);
        inVar.setVisibility(0);
        this.d.setVisibility(8);
        f(i2, i3, i);
        this.h.setVisibility(8);
        this.r = z2;
        setWillNotDraw(!z2);
        Switch r7 = this.f;
        if (r7 != null) {
            r7.setVisibility(8);
        }
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, int i, boolean z) {
        u(charSequence, charSequence2, false, i, z);
    }

    public void setChecked(boolean z) {
        this.f.c(z, true);
    }

    public void setCompactLayout(boolean z) {
        this.S = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        i(z, true);
    }

    public void setImageLeft(int i) {
        this.x = i;
    }

    public void setNeedDivider(boolean z) {
        if (this.r != z) {
            this.r = z;
            setWillNotDraw(!z);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i) {
        this.s = i;
    }

    public void setPrioritizeTitleOverValue(boolean z) {
        if (this.E != z) {
            this.E = z;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        ema emaVar = this.b;
        if (isEmpty) {
            emaVar.setVisibility(8);
        } else {
            emaVar.setVisibility(0);
            emaVar.l(charSequence, false);
        }
    }

    public void setTextColor(int i) {
        this.N = false;
        this.a.setTextColor(i);
    }

    public void setValueSticker(String str) {
        if (this.L == null) {
            ul ulVar = new ul(hl.L(30.0f), this);
            this.L = ulVar;
            if (this.G) {
                ulVar.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.I();
        }
        addOnAttachStateChangeListener(new fh8(imageReceiver, (byte) 1));
        imageReceiver.e0(str, "30_30", null, null, 0L);
        this.L.g(new g6(imageReceiver, (byte) 7), true);
        invalidate();
    }

    public final void t(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z) {
        this.s = c(false);
        this.x = 18;
        ema emaVar = this.a;
        emaVar.l(charSequence, false);
        emaVar.i(null);
        this.R = charSequence2;
        in inVar = this.c;
        inVar.c(charSequence2, false, true);
        e29 e29Var = this.e;
        e29Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof b29) {
            e29Var.setAnimation((b29) drawable);
        } else {
            e29Var.setImageDrawable(drawable);
        }
        e29Var.setVisibility(0);
        inVar.setVisibility(0);
        this.h.setVisibility(8);
        e29Var.setPadding(0, hl.L(6.0f), 0, 0);
        this.r = z;
        setWillNotDraw(!z);
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, boolean z2) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        ema emaVar = this.a;
        emaVar.l(charSequence, false);
        emaVar.i(null);
        e29 e29Var = this.e;
        e29Var.setVisibility(0);
        in inVar = this.c;
        if (charSequence2 != null) {
            int max = (int) Math.max(1.0f, hl.q.x - ((kg5.h(charSequence, emaVar.getTextPaint()) + hl.L(this.s)) + hl.L(16.0f)));
            this.R = charSequence2;
            inVar.c(TextUtils.ellipsize(charSequence2, inVar.getPaint(), max, TextUtils.TruncateAt.END), z, true);
        } else {
            inVar.c("", z, true);
        }
        inVar.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        e29Var.setTranslationX(0.0f);
        e29Var.setTranslationY(0.0f);
        e29Var.setPadding(0, hl.L(7.0f), 0, 0);
        e29Var.setImageResource(i);
        this.r = z2;
        setWillNotDraw(!z2);
        Switch r9 = this.f;
        if (r9 != null) {
            r9.setVisibility(8);
        }
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    @Override // snb
    public final void updateColors() {
        vnb vnbVar = this.F;
        if (this.N || this.O) {
            try {
                a();
                return;
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        try {
            int v0 = aob.v0(aob.y6, vnbVar);
            int v02 = aob.v0(aob.I6, vnbVar);
            int e2 = e(v0);
            int e3 = e(v02);
            if (e2 == v0 && e3 == v02) {
                return;
            }
            this.b.setTextColor(e2);
            this.c.setTextColor(e3);
            this.d.setTextColor(e3);
        } catch (Exception e4) {
            cc4.g(e4, true);
        }
    }

    public final void v(CharSequence charSequence, Drawable drawable, boolean z) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        ema emaVar = this.a;
        emaVar.l(charSequence, false);
        emaVar.i(null);
        this.R = null;
        in inVar = this.c;
        inVar.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        inVar.setVisibility(8);
        this.d.setVisibility(8);
        e29 e29Var = this.e;
        e29Var.setVisibility(8);
        e29Var.setPadding(0, hl.L(7.0f), 0, 0);
        this.r = z;
        setWillNotDraw(!z);
        Switch r7 = this.f;
        if (r7 != null) {
            r7.setVisibility(8);
        }
        ul ulVar = this.L;
        if (ulVar != null) {
            ulVar.g(null, false);
        }
    }

    public final void w(CharSequence charSequence, boolean z) {
        CharSequence ellipsize;
        in inVar = this.c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.R = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, inVar.getPaint(), hl.q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        inVar.c(ellipsize, z, true);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    public int e(int i) {
        return i;
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.L == null) {
            ul ulVar = new ul(hl.L(30.0f), this);
            this.L = ulVar;
            if (this.G) {
                ulVar.a();
            }
        }
        this.L.h(document, 1, true);
        invalidate();
    }

    public skb(Context context, vnb vnbVar) {
        this(20, vnbVar, context, false, false);
    }

    public skb(int i, Context context, boolean z) {
        this(i, null, context, z, false);
    }

    public skb(Context context) {
        this(20, null, context, false, false);
    }
}
