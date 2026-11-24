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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class xib extends FrameLayout implements vlb {
    public static final /* synthetic */ int W = 0;
    public boolean E;
    public final ylb F;
    public boolean G;
    public byte H;
    public boolean I;
    public float J;
    public float K;
    public tm L;
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
    public final lka a;
    public final lka b;
    public final io c;
    public final lka d;
    public final s09 e;
    public Switch f;
    public final ImageView h;
    public byte n;
    public boolean r;
    public int s;
    public byte w;
    public int x;
    public boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    public xib(int i, ylb ylbVar, Context context, boolean z, boolean z2) {
        super(context);
        this.s = 71;
        this.w = (byte) 50;
        this.x = 21;
        this.F = ylbVar;
        this.n = i;
        lka lkaVar = new lka(context);
        this.a = lkaVar;
        anb.W(lkaVar, z ? cmb.i5 : cmb.F6, ylbVar);
        lkaVar.setTextSize(16);
        lkaVar.setGravity(jb6.a0 ? 5 : 3);
        lkaVar.setImportantForAccessibility(2);
        addView(lkaVar, qoe.c(-1.0f, -2));
        lka lkaVar2 = new lka(context);
        this.b = lkaVar2;
        anb.W(lkaVar2, z ? cmb.o5 : cmb.x6, ylbVar);
        lkaVar2.setTextSize(13);
        lkaVar2.setGravity(jb6.a0 ? 5 : 3);
        lkaVar2.setImportantForAccessibility(2);
        addView(lkaVar2, qoe.c(-1.0f, -2));
        io ioVar = new io(context, false, true, true);
        this.c = ioVar;
        anb.U(ioVar, z ? cmb.m5 : cmb.H6, ylbVar);
        ioVar.setPadding(0, gm.L(18.0f), 0, gm.L(18.0f));
        ioVar.setTextSize(gm.L(16.0f));
        ioVar.setGravity(jb6.a0 ? 3 : 5);
        ioVar.setImportantForAccessibility(2);
        ioVar.setTranslationY(gm.L(-2.0f));
        addView(ioVar);
        lka lkaVar3 = new lka(context);
        this.d = lkaVar3;
        Boolean bool = Boolean.FALSE;
        if (!lkaVar3.Q) {
            lkaVar3.o0 = true;
            lkaVar3.q0 = bool;
            lkaVar3.m();
            lkaVar3.b();
        }
        lkaVar3.r0 = 18;
        lkaVar3.m();
        anb.W(lkaVar3, z ? cmb.m5 : cmb.H6, ylbVar);
        lkaVar3.setGravity(jb6.a0 ? 3 : 5);
        lkaVar3.setTextSize(16);
        lkaVar3.setImportantForAccessibility(2);
        lkaVar3.setVisibility(8);
        addView(lkaVar3);
        s09 s09Var = new s09(context);
        this.e = s09Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        s09Var.setScaleType(scaleType);
        anb.s(s09Var, z ? cmb.I5 : cmb.l6, ylbVar, PorterDuff.Mode.SRC_IN);
        addView(s09Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(scaleType);
        addView(imageView);
        if (z2) {
            Switch r3 = new Switch(context, ylbVar);
            this.f = r3;
            int i2 = cmb.L6;
            int i3 = cmb.M6;
            int i4 = cmb.c6;
            r3.d(i2, i3, i4, i4);
            addView(this.f, qoe.d(37, 20.0f, (jb6.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public static SpannableStringBuilder b(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        of4 of4Var = new of4();
        of4Var.f = cmb.w0(null, cmb.Bk, false);
        of4Var.n = false;
        spannableStringBuilder.setSpan(of4Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final void a() {
        lka lkaVar = this.a;
        int intValue = lkaVar.getTag() instanceof Integer ? ((Integer) lkaVar.getTag()).intValue() : cmb.F6;
        ylb ylbVar = this.F;
        int v0 = cmb.v0(intValue, ylbVar);
        if (intValue != cmb.i5 && intValue != cmb.F6) {
            v0 = e(v0);
        }
        if (this.N) {
            lkaVar.setTextColor(v0);
        }
        if (this.O) {
            s09 s09Var = this.e;
            if (s09Var.getTag() instanceof Integer) {
                int intValue2 = ((Integer) s09Var.getTag()).intValue();
                int v02 = cmb.v0(intValue2, ylbVar);
                if (intValue2 != cmb.I5 && intValue2 != cmb.l6) {
                    v02 = e(v02);
                }
                if (v02 != this.P || s09Var.getColorFilter() != this.Q) {
                    this.P = v02;
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN);
                    this.Q = porterDuffColorFilter;
                    s09Var.setColorFilter(porterDuffColorFilter);
                }
            }
        }
        this.b.setTextColor(e(cmb.v0(cmb.x6, ylbVar)));
        int i = cmb.H6;
        this.c.setTextColor(e(cmb.v0(i, ylbVar)));
        this.d.setTextColor(e(cmb.v0(i, ylbVar)));
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
                paint.setColor(cmb.v0(cmb.N5, this.F));
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
            RectF rectF = gm.P;
            rectF.set((getMeasuredWidth() - gm.L(21.0f)) - gm.L(this.H), measuredHeight - gm.L(3.0f), getMeasuredWidth() - gm.L(21.0f), gm.L(3.0f) + measuredHeight);
            if (jb6.a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, gm.L(3.0f), gm.L(3.0f), this.T);
            invalidate();
        }
        float f6 = 1.0f - this.K;
        tm tmVar = this.L;
        this.c.setAlpha(f6 * (tmVar == null ? 1.0f : 1.0f - tmVar.e()) * (isEnabled() ? 1.0f : 0.5f));
        float f7 = 1.0f - this.K;
        tm tmVar2 = this.L;
        this.d.setAlpha(f7 * (tmVar2 == null ? 1.0f : 1.0f - tmVar2.e()) * (isEnabled() ? 1.0f : 0.5f));
        super.dispatchDraw(canvas);
        tm tmVar3 = this.L;
        if (tmVar3 != null) {
            tmVar3.setBounds((getWidth() - this.L.s) - gm.L(18.0f), (getHeight() - this.L.s) / 2, getWidth() - gm.L(18.0f), (getHeight() + this.L.s) / 2);
            this.L.draw(canvas);
        }
    }

    public final void f(int i, int i2, int i3) {
        this.s = c(true);
        s09 s09Var = this.e;
        s09Var.setVisibility(0);
        s09Var.setPadding(gm.L(2.0f), gm.L(2.0f), gm.L(2.0f), gm.L(2.0f));
        s09Var.setTranslationX(gm.L(jb6.a0 ? 0.0f : -3.0f));
        s09Var.setImageResource(i3);
        this.O = false;
        s09Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ylb ylbVar = this.F;
        boolean a = ylbVar != null ? ylbVar.a() : cmb.I.o();
        g57 g57Var = new g57((byte) 1);
        g57Var.b(i, i2);
        g57Var.b = a;
        s09Var.setBackground(g57Var);
    }

    public final void g(int i, int i2) {
        ylb ylbVar = this.F;
        int v0 = cmb.v0(i2, ylbVar);
        lka lkaVar = this.a;
        lkaVar.setTextColor(v0);
        lkaVar.setTag(Integer.valueOf(i2));
        this.N = true;
        if (i >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(cmb.v0(i, ylbVar), PorterDuff.Mode.SRC_IN);
            s09 s09Var = this.e;
            s09Var.setColorFilter(porterDuffColorFilter);
            s09Var.setTag(Integer.valueOf(i));
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

    public s09 getImageView() {
        return this.e;
    }

    public lka getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public io getValueTextView() {
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
        lka lkaVar = this.a;
        if (i <= 0) {
            lkaVar.i(null);
            return;
        }
        lkaVar.i(new hd(i, this.F, getContext(), false));
        lkaVar.setDrawablePadding(gm.L(6.0f));
    }

    public final void k(CharSequence charSequence, boolean z) {
        this.x = getDefaultImageLeft();
        lka lkaVar = this.a;
        lkaVar.l(charSequence, false);
        lkaVar.i(null);
        this.R = null;
        io ioVar = this.c;
        ioVar.c(null, false, true);
        this.e.setVisibility(8);
        ioVar.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z;
        setWillNotDraw(!z);
        tm tmVar = this.L;
        if (tmVar != null) {
            tmVar.g(null, false);
        }
    }

    public final void l(CharSequence charSequence, boolean z, boolean z2) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        lka lkaVar = this.a;
        lkaVar.l(charSequence, false);
        lkaVar.i(null);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z2;
        Switch r6 = this.f;
        if (r6 != null) {
            r6.setVisibility(0);
            this.f.c(z, false);
        }
        setWillNotDraw(!this.r);
        tm tmVar = this.L;
        if (tmVar != null) {
            tmVar.g(null, false);
        }
    }

    public final void m(String str, boolean z, int i, int i2, boolean z2) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        lka lkaVar = this.a;
        lkaVar.l(str, false);
        lkaVar.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        f(i2, i2, i);
        if (this.f == null) {
            Switch r11 = new Switch(getContext(), this.F);
            this.f = r11;
            int i3 = cmb.L6;
            int i4 = cmb.M6;
            int i5 = cmb.c6;
            r11.d(i3, i4, i5, i5);
            addView(this.f, qoe.d(37, 20.0f, (jb6.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r112 = this.f;
        if (r112 != null) {
            r112.setVisibility(0);
            this.f.c(z, false);
        }
        this.r = z2;
        setWillNotDraw(!z2);
        tm tmVar = this.L;
        if (tmVar != null) {
            tmVar.g(null, false);
        }
    }

    public final void n(int i, String str, boolean z) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        lka lkaVar = this.a;
        lkaVar.l(str, false);
        lkaVar.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r1 = this.f;
        if (r1 != null) {
            r1.setVisibility(0);
            this.f.c(z, false);
        }
        s09 s09Var = this.e;
        s09Var.setVisibility(0);
        s09Var.setPadding(0, gm.L(7.0f), 0, 0);
        s09Var.setImageResource(i);
        this.r = false;
        setWillNotDraw(true);
        tm tmVar = this.L;
        if (tmVar != null) {
            tmVar.g(null, false);
        }
    }

    public final void o(int i, CharSequence charSequence, boolean z) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        lka lkaVar = this.a;
        lkaVar.l(charSequence, false);
        lkaVar.i(null);
        this.R = null;
        io ioVar = this.c;
        ioVar.c(null, false, true);
        s09 s09Var = this.e;
        s09Var.setImageResource(i);
        s09Var.setVisibility(0);
        ioVar.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        s09Var.setPadding(0, gm.L(7.0f), 0, 0);
        this.r = z;
        setWillNotDraw(!z);
        tm tmVar = this.L;
        if (tmVar != null) {
            tmVar.g(null, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        tm tmVar = this.L;
        if (tmVar != null) {
            tmVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        tm tmVar = this.L;
        if (tmVar != null) {
            tmVar.b();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.r) {
            ylb ylbVar = this.F;
            Paint d = ylbVar != null ? ylbVar.d("paintDivider") : null;
            if (d == null) {
                d = cmb.j0;
            }
            Paint paint = d;
            int L = gm.L(this.e.getVisibility() == 0 ? this.y ? 72 : this.s : this.n);
            float f = jb6.a0 ? 0.0f : L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!jb6.a0) {
                L = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        lka lkaVar = this.a;
        CharSequence text = lkaVar.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        io ioVar = this.c;
        if (!isEmpty) {
            CharSequence text2 = ioVar.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f.h);
            StringBuilder sb = new StringBuilder();
            sb.append(lkaVar.getText());
            if (!TextUtils.isEmpty(ioVar.getText())) {
                sb.append('\n');
                sb.append(ioVar.getText());
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
        lka lkaVar = this.d;
        int textHeight = lkaVar.getTextHeight();
        io ioVar = this.c;
        int max = ((i5 - Math.max(textHeight, ioVar.getTextHeight())) / 2) + 1;
        int L2 = jb6.a0 ? gm.L(this.n - 6) : (i6 - ioVar.getMeasuredWidth()) - gm.L(this.n - 6);
        if (this.E && !jb6.a0) {
            L2 = (i6 - ioVar.getMeasuredWidth()) - gm.L(this.n);
        }
        ioVar.layout(L2, max, ioVar.getMeasuredWidth() + L2, ioVar.getMeasuredHeight() + max);
        int L3 = jb6.a0 ? gm.L(this.n - 6) : (i6 - lkaVar.getMeasuredWidth()) - gm.L(this.n - 6);
        lkaVar.layout(L3, max, lkaVar.getMeasuredWidth() + L3, lkaVar.getMeasuredHeight() + max);
        boolean z2 = jb6.a0;
        s09 s09Var = this.e;
        lka lkaVar2 = this.a;
        if (z2) {
            L = (getMeasuredWidth() - lkaVar2.getMeasuredWidth()) - gm.L(s09Var.getVisibility() == 0 ? this.s : this.n);
        } else {
            L = gm.L(s09Var.getVisibility() == 0 ? this.s : this.n);
        }
        lka lkaVar3 = this.b;
        if (lkaVar3.getVisibility() == 0) {
            float f = this.w > 50 ? 4 : 2;
            int L4 = gm.L(1.0f) + wi8.D(f, (i5 - lkaVar2.getTextHeight()) - lkaVar3.getTextHeight(), 2);
            lkaVar2.layout(L, L4, lkaVar2.getMeasuredWidth() + L, lkaVar2.getMeasuredHeight() + L4);
            int L5 = gm.L(f) + lkaVar2.getTextHeight() + L4;
            lkaVar3.layout(L, L5, lkaVar3.getMeasuredWidth() + L, lkaVar3.getMeasuredHeight() + L5);
        } else {
            int L6 = gm.L(1.0f) + ((i5 - lkaVar2.getTextHeight()) / 2);
            lkaVar2.layout(L, L6, lkaVar2.getMeasuredWidth() + L, lkaVar2.getMeasuredHeight() + L6);
        }
        if (s09Var.getVisibility() == 0) {
            int L7 = gm.L(1.0f) + ((((i5 - s09Var.getMeasuredHeight()) / 2) + gm.L(this.w > 50 ? 0.0f : 2.0f)) - s09Var.getPaddingTop());
            int L8 = !jb6.a0 ? gm.L(this.x) : (i6 - s09Var.getMeasuredWidth()) - gm.L(this.x);
            s09Var.layout(L8, L7, s09Var.getMeasuredWidth() + L8, s09Var.getMeasuredHeight() + L7);
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            int L9 = gm.L(1.0f) + ((i5 - imageView.getMeasuredHeight()) / 2);
            int L10 = jb6.a0 ? gm.L(23.0f) : (i6 - imageView.getMeasuredWidth()) - gm.L(23.0f);
            imageView.layout(L10, L9, imageView.getMeasuredWidth() + L10, imageView.getMeasuredHeight() + L9);
        }
        Switch r9 = this.f;
        if (r9 == null || r9.getVisibility() != 0) {
            return;
        }
        int measuredHeight = (i5 - this.f.getMeasuredHeight()) / 2;
        int L11 = jb6.a0 ? gm.L(22.0f) : (i6 - this.f.getMeasuredWidth()) - gm.L(22.0f);
        Switch r10 = this.f;
        r10.layout(L11, measuredHeight, r10.getMeasuredWidth() + L11, this.f.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        CharSequence charSequence;
        int size = View.MeasureSpec.getSize(i);
        int L = gm.L(this.w);
        int i3 = this.M;
        io ioVar = this.c;
        if (i3 != 0 && i3 != size && (charSequence = this.R) != null) {
            ioVar.c(TextUtils.ellipsize(charSequence, ioVar.getPaint(), gm.q.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.M = size;
        boolean z = this.E;
        byte b = this.n;
        lka lkaVar = this.b;
        lka lkaVar2 = this.d;
        lka lkaVar3 = this.a;
        if (z) {
            lkaVar3.measure(wi8.f(b + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30));
            lkaVar.measure(wi8.f(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30));
            ioVar.measure(View.MeasureSpec.makeMeasureSpec((size - gm.L(this.n + 103)) - lkaVar3.getTextWidth(), jb6.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30));
            lkaVar2.measure(View.MeasureSpec.makeMeasureSpec((size - gm.L(this.n + 103)) - lkaVar3.getTextWidth(), jb6.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30));
        } else {
            ioVar.measure(View.MeasureSpec.makeMeasureSpec(size - gm.L(b), jb6.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30));
            lkaVar2.measure(View.MeasureSpec.makeMeasureSpec(size - gm.L(this.n), jb6.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30));
            int max = Math.max(ioVar.d(), lkaVar2.getTextWidth());
            lkaVar3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - gm.L(this.n + 71)) - max), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30));
            lkaVar.measure(View.MeasureSpec.makeMeasureSpec((size - gm.L(this.n + 71)) - max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30));
        }
        s09 s09Var = this.e;
        if (s09Var.getVisibility() == 0) {
            s09Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        Switch r0 = this.f;
        if (r0 != null) {
            r0.measure(View.MeasureSpec.makeMeasureSpec(gm.L(37.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(size, L + (this.r ? 1 : 0));
    }

    public final void p(CharSequence charSequence, Drawable drawable, boolean z) {
        this.s = c(false);
        this.x = 18;
        lka lkaVar = this.a;
        lkaVar.l(charSequence, false);
        lkaVar.i(null);
        this.R = null;
        io ioVar = this.c;
        ioVar.c(null, false, true);
        s09 s09Var = this.e;
        s09Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof p09) {
            s09Var.setAnimation((p09) drawable);
        } else {
            s09Var.setImageDrawable(drawable);
        }
        s09Var.setVisibility(0);
        ioVar.setVisibility(8);
        this.h.setVisibility(8);
        s09Var.setPadding(0, gm.L(6.0f), 0, 0);
        this.r = z;
        setWillNotDraw(!z);
        tm tmVar = this.L;
        if (tmVar != null) {
            tmVar.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        lka lkaVar = this.a;
        lkaVar.l(charSequence, false);
        lkaVar.i(null);
        this.R = charSequence2;
        io ioVar = this.c;
        ioVar.c(charSequence2 == null ? null : TextUtils.ellipsize(charSequence2, ioVar.getPaint(), gm.q.x / 2.5f, TextUtils.TruncateAt.END), z, true);
        ioVar.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z2;
        setWillNotDraw(!z2);
        Switch r7 = this.f;
        if (r7 != null) {
            r7.setVisibility(8);
        }
        tm tmVar = this.L;
        if (tmVar != null) {
            tmVar.g(null, false);
        }
    }

    public final void r(String str, String str2, boolean z, int i, int i2, int i3, boolean z2) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        lka lkaVar = this.a;
        lkaVar.l(str, false);
        lkaVar.i(null);
        this.R = str2;
        io ioVar = this.c;
        ioVar.c(TextUtils.ellipsize(str2, ioVar.getPaint(), gm.q.x / 2.5f, TextUtils.TruncateAt.END), z, true);
        ioVar.setVisibility(0);
        this.d.setVisibility(8);
        f(i2, i3, i);
        this.h.setVisibility(8);
        this.r = z2;
        setWillNotDraw(!z2);
        Switch r7 = this.f;
        if (r7 != null) {
            r7.setVisibility(8);
        }
        tm tmVar = this.L;
        if (tmVar != null) {
            tmVar.g(null, false);
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
        lka lkaVar = this.b;
        if (isEmpty) {
            lkaVar.setVisibility(8);
        } else {
            lkaVar.setVisibility(0);
            lkaVar.l(charSequence, false);
        }
    }

    public void setTextColor(int i) {
        this.N = false;
        this.a.setTextColor(i);
    }

    public void setValueSticker(String str) {
        if (this.L == null) {
            tm tmVar = new tm(gm.L(30.0f), this);
            this.L = tmVar;
            if (this.G) {
                tmVar.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.I();
        }
        addOnAttachStateChangeListener(new tf8(imageReceiver, (byte) 1));
        imageReceiver.e0(str, "30_30", null, null, 0L);
        this.L.g(new f6(imageReceiver, (byte) 7), true);
        invalidate();
    }

    public final void t(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z) {
        this.s = c(false);
        this.x = 18;
        lka lkaVar = this.a;
        lkaVar.l(charSequence, false);
        lkaVar.i(null);
        this.R = charSequence2;
        io ioVar = this.c;
        ioVar.c(charSequence2, false, true);
        s09 s09Var = this.e;
        s09Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof p09) {
            s09Var.setAnimation((p09) drawable);
        } else {
            s09Var.setImageDrawable(drawable);
        }
        s09Var.setVisibility(0);
        ioVar.setVisibility(0);
        this.h.setVisibility(8);
        s09Var.setPadding(0, gm.L(6.0f), 0, 0);
        this.r = z;
        setWillNotDraw(!z);
        tm tmVar = this.L;
        if (tmVar != null) {
            tmVar.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, boolean z2) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        lka lkaVar = this.a;
        lkaVar.l(charSequence, false);
        lkaVar.i(null);
        s09 s09Var = this.e;
        s09Var.setVisibility(0);
        io ioVar = this.c;
        if (charSequence2 != null) {
            int max = (int) Math.max(1.0f, gm.q.x - ((hg5.h(charSequence, lkaVar.getTextPaint()) + gm.L(this.s)) + gm.L(16.0f)));
            this.R = charSequence2;
            ioVar.c(TextUtils.ellipsize(charSequence2, ioVar.getPaint(), max, TextUtils.TruncateAt.END), z, true);
        } else {
            ioVar.c("", z, true);
        }
        ioVar.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        s09Var.setTranslationX(0.0f);
        s09Var.setTranslationY(0.0f);
        s09Var.setPadding(0, gm.L(7.0f), 0, 0);
        s09Var.setImageResource(i);
        this.r = z2;
        setWillNotDraw(!z2);
        Switch r9 = this.f;
        if (r9 != null) {
            r9.setVisibility(8);
        }
        tm tmVar = this.L;
        if (tmVar != null) {
            tmVar.g(null, false);
        }
    }

    @Override // vlb
    public final void updateColors() {
        ylb ylbVar = this.F;
        if (this.N || this.O) {
            try {
                a();
                return;
            } catch (Exception e) {
                fc4.g(e, true);
                return;
            }
        }
        try {
            int v0 = cmb.v0(cmb.x6, ylbVar);
            int v02 = cmb.v0(cmb.H6, ylbVar);
            int e2 = e(v0);
            int e3 = e(v02);
            if (e2 == v0 && e3 == v02) {
                return;
            }
            this.b.setTextColor(e2);
            this.c.setTextColor(e3);
            this.d.setTextColor(e3);
        } catch (Exception e4) {
            fc4.g(e4, true);
        }
    }

    public final void v(CharSequence charSequence, Drawable drawable, boolean z) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        lka lkaVar = this.a;
        lkaVar.l(charSequence, false);
        lkaVar.i(null);
        this.R = null;
        io ioVar = this.c;
        ioVar.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        ioVar.setVisibility(8);
        this.d.setVisibility(8);
        s09 s09Var = this.e;
        s09Var.setVisibility(8);
        s09Var.setPadding(0, gm.L(7.0f), 0, 0);
        this.r = z;
        setWillNotDraw(!z);
        Switch r7 = this.f;
        if (r7 != null) {
            r7.setVisibility(8);
        }
        tm tmVar = this.L;
        if (tmVar != null) {
            tmVar.g(null, false);
        }
    }

    public final void w(CharSequence charSequence, boolean z) {
        CharSequence ellipsize;
        io ioVar = this.c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.R = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, ioVar.getPaint(), gm.q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        ioVar.c(ellipsize, z, true);
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    public int e(int i) {
        return i;
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.L == null) {
            tm tmVar = new tm(gm.L(30.0f), this);
            this.L = tmVar;
            if (this.G) {
                tmVar.a();
            }
        }
        this.L.h(document, 1, true);
        invalidate();
    }

    public xib(Context context, ylb ylbVar) {
        this(20, ylbVar, context, false, false);
    }

    public xib(int i, Context context, boolean z) {
        this(i, null, context, z, false);
    }

    public xib(Context context) {
        this(20, null, context, false, false);
    }
}
