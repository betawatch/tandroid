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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class wgb extends FrameLayout implements tjb {
    public static final /* synthetic */ int W = 0;
    public boolean E;
    public final wjb F;
    public boolean G;
    public byte H;
    public boolean I;
    public float J;
    public float K;
    public tl L;
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
    public final jia a;
    public final jia b;
    public final hn c;
    public final jia d;
    public final ry8 e;
    public Switch f;
    public final ImageView h;
    public byte n;
    public boolean r;
    public int s;
    public byte w;
    public int x;
    public boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    public wgb(int i, wjb wjbVar, Context context, boolean z, boolean z2) {
        super(context);
        this.s = 71;
        this.w = (byte) 50;
        this.x = 21;
        this.F = wjbVar;
        this.n = i;
        jia jiaVar = new jia(context);
        this.a = jiaVar;
        zkb.W(jiaVar, z ? bkb.i5 : bkb.F6, wjbVar);
        jiaVar.setTextSize(16);
        jiaVar.setGravity(k96.a0 ? 5 : 3);
        jiaVar.setImportantForAccessibility(2);
        addView(jiaVar, nme.c(-1.0f, -2));
        jia jiaVar2 = new jia(context);
        this.b = jiaVar2;
        zkb.W(jiaVar2, z ? bkb.o5 : bkb.x6, wjbVar);
        jiaVar2.setTextSize(13);
        jiaVar2.setGravity(k96.a0 ? 5 : 3);
        jiaVar2.setImportantForAccessibility(2);
        addView(jiaVar2, nme.c(-1.0f, -2));
        hn hnVar = new hn(context, false, true, true);
        this.c = hnVar;
        zkb.U(hnVar, z ? bkb.m5 : bkb.H6, wjbVar);
        hnVar.setPadding(0, gl.L(18.0f), 0, gl.L(18.0f));
        hnVar.setTextSize(gl.L(16.0f));
        hnVar.setGravity(k96.a0 ? 3 : 5);
        hnVar.setImportantForAccessibility(2);
        hnVar.setTranslationY(gl.L(-2.0f));
        addView(hnVar);
        jia jiaVar3 = new jia(context);
        this.d = jiaVar3;
        Boolean bool = Boolean.FALSE;
        if (!jiaVar3.Q) {
            jiaVar3.o0 = true;
            jiaVar3.q0 = bool;
            jiaVar3.m();
            jiaVar3.b();
        }
        jiaVar3.r0 = 18;
        jiaVar3.m();
        zkb.W(jiaVar3, z ? bkb.m5 : bkb.H6, wjbVar);
        jiaVar3.setGravity(k96.a0 ? 3 : 5);
        jiaVar3.setTextSize(16);
        jiaVar3.setImportantForAccessibility(2);
        jiaVar3.setVisibility(8);
        addView(jiaVar3);
        ry8 ry8Var = new ry8(context);
        this.e = ry8Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ry8Var.setScaleType(scaleType);
        zkb.s(ry8Var, z ? bkb.I5 : bkb.l6, wjbVar, PorterDuff.Mode.SRC_IN);
        addView(ry8Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(scaleType);
        addView(imageView);
        if (z2) {
            Switch r3 = new Switch(context, wjbVar);
            this.f = r3;
            int i2 = bkb.L6;
            int i3 = bkb.M6;
            int i4 = bkb.c6;
            r3.d(i2, i3, i4, i4);
            addView(this.f, nme.d(37, 20.0f, (k96.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public static SpannableStringBuilder b(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        nd4 nd4Var = new nd4();
        nd4Var.f = bkb.w0(null, bkb.Bk, false);
        nd4Var.n = false;
        spannableStringBuilder.setSpan(nd4Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final void a() {
        jia jiaVar = this.a;
        int intValue = jiaVar.getTag() instanceof Integer ? ((Integer) jiaVar.getTag()).intValue() : bkb.F6;
        wjb wjbVar = this.F;
        int v0 = bkb.v0(intValue, wjbVar);
        if (intValue != bkb.i5 && intValue != bkb.F6) {
            v0 = e(v0);
        }
        if (this.N) {
            jiaVar.setTextColor(v0);
        }
        if (this.O) {
            ry8 ry8Var = this.e;
            if (ry8Var.getTag() instanceof Integer) {
                int intValue2 = ((Integer) ry8Var.getTag()).intValue();
                int v02 = bkb.v0(intValue2, wjbVar);
                if (intValue2 != bkb.I5 && intValue2 != bkb.l6) {
                    v02 = e(v02);
                }
                if (v02 != this.P || ry8Var.getColorFilter() != this.Q) {
                    this.P = v02;
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN);
                    this.Q = porterDuffColorFilter;
                    ry8Var.setColorFilter(porterDuffColorFilter);
                }
            }
        }
        this.b.setTextColor(e(bkb.v0(bkb.x6, wjbVar)));
        int i = bkb.H6;
        this.c.setTextColor(e(bkb.v0(i, wjbVar)));
        this.d.setTextColor(e(bkb.v0(i, wjbVar)));
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
                paint.setColor(bkb.v0(bkb.N5, this.F));
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
            RectF rectF = gl.P;
            rectF.set((getMeasuredWidth() - gl.L(21.0f)) - gl.L(this.H), measuredHeight - gl.L(3.0f), getMeasuredWidth() - gl.L(21.0f), gl.L(3.0f) + measuredHeight);
            if (k96.a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, gl.L(3.0f), gl.L(3.0f), this.T);
            invalidate();
        }
        float f6 = 1.0f - this.K;
        tl tlVar = this.L;
        this.c.setAlpha(f6 * (tlVar == null ? 1.0f : 1.0f - tlVar.e()) * (isEnabled() ? 1.0f : 0.5f));
        float f7 = 1.0f - this.K;
        tl tlVar2 = this.L;
        this.d.setAlpha(f7 * (tlVar2 == null ? 1.0f : 1.0f - tlVar2.e()) * (isEnabled() ? 1.0f : 0.5f));
        super.dispatchDraw(canvas);
        tl tlVar3 = this.L;
        if (tlVar3 != null) {
            tlVar3.setBounds((getWidth() - this.L.s) - gl.L(18.0f), (getHeight() - this.L.s) / 2, getWidth() - gl.L(18.0f), (getHeight() + this.L.s) / 2);
            this.L.draw(canvas);
        }
    }

    public final void f(int i, int i2, int i3) {
        this.s = c(true);
        ry8 ry8Var = this.e;
        ry8Var.setVisibility(0);
        ry8Var.setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(2.0f));
        ry8Var.setTranslationX(gl.L(k96.a0 ? 0.0f : -3.0f));
        ry8Var.setImageResource(i3);
        this.O = false;
        ry8Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        wjb wjbVar = this.F;
        boolean a = wjbVar != null ? wjbVar.a() : bkb.I.o();
        g37 g37Var = new g37((byte) 1);
        g37Var.b(i, i2);
        g37Var.b = a;
        ry8Var.setBackground(g37Var);
    }

    public final void g(int i, int i2) {
        wjb wjbVar = this.F;
        int v0 = bkb.v0(i2, wjbVar);
        jia jiaVar = this.a;
        jiaVar.setTextColor(v0);
        jiaVar.setTag(Integer.valueOf(i2));
        this.N = true;
        if (i >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(bkb.v0(i, wjbVar), PorterDuff.Mode.SRC_IN);
            ry8 ry8Var = this.e;
            ry8Var.setColorFilter(porterDuffColorFilter);
            ry8Var.setTag(Integer.valueOf(i));
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

    public ry8 getImageView() {
        return this.e;
    }

    public jia getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public hn getValueTextView() {
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
        jia jiaVar = this.a;
        if (i <= 0) {
            jiaVar.i(null);
            return;
        }
        jiaVar.i(new gc(i, this.F, getContext(), false));
        jiaVar.setDrawablePadding(gl.L(6.0f));
    }

    public final void k(CharSequence charSequence, boolean z) {
        this.x = getDefaultImageLeft();
        jia jiaVar = this.a;
        jiaVar.l(charSequence, false);
        jiaVar.i(null);
        this.R = null;
        hn hnVar = this.c;
        hnVar.c(null, false, true);
        this.e.setVisibility(8);
        hnVar.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z;
        setWillNotDraw(!z);
        tl tlVar = this.L;
        if (tlVar != null) {
            tlVar.g(null, false);
        }
    }

    public final void l(CharSequence charSequence, boolean z, boolean z2) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        jia jiaVar = this.a;
        jiaVar.l(charSequence, false);
        jiaVar.i(null);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z2;
        Switch r6 = this.f;
        if (r6 != null) {
            r6.setVisibility(0);
            this.f.c(z, false);
        }
        setWillNotDraw(!this.r);
        tl tlVar = this.L;
        if (tlVar != null) {
            tlVar.g(null, false);
        }
    }

    public final void m(String str, boolean z, int i, int i2, boolean z2) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        jia jiaVar = this.a;
        jiaVar.l(str, false);
        jiaVar.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        f(i2, i2, i);
        if (this.f == null) {
            Switch r11 = new Switch(getContext(), this.F);
            this.f = r11;
            int i3 = bkb.L6;
            int i4 = bkb.M6;
            int i5 = bkb.c6;
            r11.d(i3, i4, i5, i5);
            addView(this.f, nme.d(37, 20.0f, (k96.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r112 = this.f;
        if (r112 != null) {
            r112.setVisibility(0);
            this.f.c(z, false);
        }
        this.r = z2;
        setWillNotDraw(!z2);
        tl tlVar = this.L;
        if (tlVar != null) {
            tlVar.g(null, false);
        }
    }

    public final void n(int i, String str, boolean z) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        jia jiaVar = this.a;
        jiaVar.l(str, false);
        jiaVar.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r1 = this.f;
        if (r1 != null) {
            r1.setVisibility(0);
            this.f.c(z, false);
        }
        ry8 ry8Var = this.e;
        ry8Var.setVisibility(0);
        ry8Var.setPadding(0, gl.L(7.0f), 0, 0);
        ry8Var.setImageResource(i);
        this.r = false;
        setWillNotDraw(true);
        tl tlVar = this.L;
        if (tlVar != null) {
            tlVar.g(null, false);
        }
    }

    public final void o(int i, CharSequence charSequence, boolean z) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        jia jiaVar = this.a;
        jiaVar.l(charSequence, false);
        jiaVar.i(null);
        this.R = null;
        hn hnVar = this.c;
        hnVar.c(null, false, true);
        ry8 ry8Var = this.e;
        ry8Var.setImageResource(i);
        ry8Var.setVisibility(0);
        hnVar.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        ry8Var.setPadding(0, gl.L(7.0f), 0, 0);
        this.r = z;
        setWillNotDraw(!z);
        tl tlVar = this.L;
        if (tlVar != null) {
            tlVar.g(null, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        tl tlVar = this.L;
        if (tlVar != null) {
            tlVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        tl tlVar = this.L;
        if (tlVar != null) {
            tlVar.b();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.r) {
            wjb wjbVar = this.F;
            Paint d = wjbVar != null ? wjbVar.d("paintDivider") : null;
            if (d == null) {
                d = bkb.j0;
            }
            Paint paint = d;
            int L = gl.L(this.e.getVisibility() == 0 ? this.y ? 72 : this.s : this.n);
            float f = k96.a0 ? 0.0f : L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!k96.a0) {
                L = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        jia jiaVar = this.a;
        CharSequence text = jiaVar.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        hn hnVar = this.c;
        if (!isEmpty) {
            CharSequence text2 = hnVar.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f.h);
            StringBuilder sb = new StringBuilder();
            sb.append(jiaVar.getText());
            if (!TextUtils.isEmpty(hnVar.getText())) {
                sb.append('\n');
                sb.append(hnVar.getText());
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
        jia jiaVar = this.d;
        int textHeight = jiaVar.getTextHeight();
        hn hnVar = this.c;
        int max = ((i5 - Math.max(textHeight, hnVar.getTextHeight())) / 2) + 1;
        int L2 = k96.a0 ? gl.L(this.n - 6) : (i6 - hnVar.getMeasuredWidth()) - gl.L(this.n - 6);
        if (this.E && !k96.a0) {
            L2 = (i6 - hnVar.getMeasuredWidth()) - gl.L(this.n);
        }
        hnVar.layout(L2, max, hnVar.getMeasuredWidth() + L2, hnVar.getMeasuredHeight() + max);
        int L3 = k96.a0 ? gl.L(this.n - 6) : (i6 - jiaVar.getMeasuredWidth()) - gl.L(this.n - 6);
        jiaVar.layout(L3, max, jiaVar.getMeasuredWidth() + L3, jiaVar.getMeasuredHeight() + max);
        boolean z2 = k96.a0;
        ry8 ry8Var = this.e;
        jia jiaVar2 = this.a;
        if (z2) {
            L = (getMeasuredWidth() - jiaVar2.getMeasuredWidth()) - gl.L(ry8Var.getVisibility() == 0 ? this.s : this.n);
        } else {
            L = gl.L(ry8Var.getVisibility() == 0 ? this.s : this.n);
        }
        jia jiaVar3 = this.b;
        if (jiaVar3.getVisibility() == 0) {
            float f = this.w > 50 ? 4 : 2;
            int L4 = gl.L(1.0f) + ug8.D(f, (i5 - jiaVar2.getTextHeight()) - jiaVar3.getTextHeight(), 2);
            jiaVar2.layout(L, L4, jiaVar2.getMeasuredWidth() + L, jiaVar2.getMeasuredHeight() + L4);
            int L5 = gl.L(f) + jiaVar2.getTextHeight() + L4;
            jiaVar3.layout(L, L5, jiaVar3.getMeasuredWidth() + L, jiaVar3.getMeasuredHeight() + L5);
        } else {
            int L6 = gl.L(1.0f) + ((i5 - jiaVar2.getTextHeight()) / 2);
            jiaVar2.layout(L, L6, jiaVar2.getMeasuredWidth() + L, jiaVar2.getMeasuredHeight() + L6);
        }
        if (ry8Var.getVisibility() == 0) {
            int L7 = gl.L(1.0f) + ((((i5 - ry8Var.getMeasuredHeight()) / 2) + gl.L(this.w > 50 ? 0.0f : 2.0f)) - ry8Var.getPaddingTop());
            int L8 = !k96.a0 ? gl.L(this.x) : (i6 - ry8Var.getMeasuredWidth()) - gl.L(this.x);
            ry8Var.layout(L8, L7, ry8Var.getMeasuredWidth() + L8, ry8Var.getMeasuredHeight() + L7);
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            int L9 = gl.L(1.0f) + ((i5 - imageView.getMeasuredHeight()) / 2);
            int L10 = k96.a0 ? gl.L(23.0f) : (i6 - imageView.getMeasuredWidth()) - gl.L(23.0f);
            imageView.layout(L10, L9, imageView.getMeasuredWidth() + L10, imageView.getMeasuredHeight() + L9);
        }
        Switch r9 = this.f;
        if (r9 == null || r9.getVisibility() != 0) {
            return;
        }
        int measuredHeight = (i5 - this.f.getMeasuredHeight()) / 2;
        int L11 = k96.a0 ? gl.L(22.0f) : (i6 - this.f.getMeasuredWidth()) - gl.L(22.0f);
        Switch r10 = this.f;
        r10.layout(L11, measuredHeight, r10.getMeasuredWidth() + L11, this.f.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        CharSequence charSequence;
        int size = View.MeasureSpec.getSize(i);
        int L = gl.L(this.w);
        int i3 = this.M;
        hn hnVar = this.c;
        if (i3 != 0 && i3 != size && (charSequence = this.R) != null) {
            hnVar.c(TextUtils.ellipsize(charSequence, hnVar.getPaint(), gl.q.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.M = size;
        boolean z = this.E;
        byte b = this.n;
        jia jiaVar = this.b;
        jia jiaVar2 = this.d;
        jia jiaVar3 = this.a;
        if (z) {
            jiaVar3.measure(ug8.f(b + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_30));
            jiaVar.measure(ug8.f(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_30));
            hnVar.measure(View.MeasureSpec.makeMeasureSpec((size - gl.L(this.n + 103)) - jiaVar3.getTextWidth(), k96.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_30));
            jiaVar2.measure(View.MeasureSpec.makeMeasureSpec((size - gl.L(this.n + 103)) - jiaVar3.getTextWidth(), k96.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_30));
        } else {
            hnVar.measure(View.MeasureSpec.makeMeasureSpec(size - gl.L(b), k96.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_30));
            jiaVar2.measure(View.MeasureSpec.makeMeasureSpec(size - gl.L(this.n), k96.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_30));
            int max = Math.max(hnVar.d(), jiaVar2.getTextWidth());
            jiaVar3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - gl.L(this.n + 71)) - max), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_30));
            jiaVar.measure(View.MeasureSpec.makeMeasureSpec((size - gl.L(this.n + 71)) - max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_30));
        }
        ry8 ry8Var = this.e;
        if (ry8Var.getVisibility() == 0) {
            ry8Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        Switch r0 = this.f;
        if (r0 != null) {
            r0.measure(View.MeasureSpec.makeMeasureSpec(gl.L(37.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(size, L + (this.r ? 1 : 0));
    }

    public final void p(CharSequence charSequence, Drawable drawable, boolean z) {
        this.s = c(false);
        this.x = 18;
        jia jiaVar = this.a;
        jiaVar.l(charSequence, false);
        jiaVar.i(null);
        this.R = null;
        hn hnVar = this.c;
        hnVar.c(null, false, true);
        ry8 ry8Var = this.e;
        ry8Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof oy8) {
            ry8Var.setAnimation((oy8) drawable);
        } else {
            ry8Var.setImageDrawable(drawable);
        }
        ry8Var.setVisibility(0);
        hnVar.setVisibility(8);
        this.h.setVisibility(8);
        ry8Var.setPadding(0, gl.L(6.0f), 0, 0);
        this.r = z;
        setWillNotDraw(!z);
        tl tlVar = this.L;
        if (tlVar != null) {
            tlVar.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        jia jiaVar = this.a;
        jiaVar.l(charSequence, false);
        jiaVar.i(null);
        this.R = charSequence2;
        hn hnVar = this.c;
        hnVar.c(charSequence2 == null ? null : TextUtils.ellipsize(charSequence2, hnVar.getPaint(), gl.q.x / 2.5f, TextUtils.TruncateAt.END), z, true);
        hnVar.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z2;
        setWillNotDraw(!z2);
        Switch r7 = this.f;
        if (r7 != null) {
            r7.setVisibility(8);
        }
        tl tlVar = this.L;
        if (tlVar != null) {
            tlVar.g(null, false);
        }
    }

    public final void r(String str, String str2, boolean z, int i, int i2, int i3, boolean z2) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        jia jiaVar = this.a;
        jiaVar.l(str, false);
        jiaVar.i(null);
        this.R = str2;
        hn hnVar = this.c;
        hnVar.c(TextUtils.ellipsize(str2, hnVar.getPaint(), gl.q.x / 2.5f, TextUtils.TruncateAt.END), z, true);
        hnVar.setVisibility(0);
        this.d.setVisibility(8);
        f(i2, i3, i);
        this.h.setVisibility(8);
        this.r = z2;
        setWillNotDraw(!z2);
        Switch r7 = this.f;
        if (r7 != null) {
            r7.setVisibility(8);
        }
        tl tlVar = this.L;
        if (tlVar != null) {
            tlVar.g(null, false);
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
        jia jiaVar = this.b;
        if (isEmpty) {
            jiaVar.setVisibility(8);
        } else {
            jiaVar.setVisibility(0);
            jiaVar.l(charSequence, false);
        }
    }

    public void setTextColor(int i) {
        this.N = false;
        this.a.setTextColor(i);
    }

    public void setValueSticker(String str) {
        if (this.L == null) {
            tl tlVar = new tl(gl.L(30.0f), this);
            this.L = tlVar;
            if (this.G) {
                tlVar.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.I();
        }
        addOnAttachStateChangeListener(new rd8(imageReceiver, (byte) 1));
        imageReceiver.e0(str, "30_30", null, null, 0L);
        this.L.g(new f6(imageReceiver, (byte) 7), true);
        invalidate();
    }

    public final void t(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z) {
        this.s = c(false);
        this.x = 18;
        jia jiaVar = this.a;
        jiaVar.l(charSequence, false);
        jiaVar.i(null);
        this.R = charSequence2;
        hn hnVar = this.c;
        hnVar.c(charSequence2, false, true);
        ry8 ry8Var = this.e;
        ry8Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof oy8) {
            ry8Var.setAnimation((oy8) drawable);
        } else {
            ry8Var.setImageDrawable(drawable);
        }
        ry8Var.setVisibility(0);
        hnVar.setVisibility(0);
        this.h.setVisibility(8);
        ry8Var.setPadding(0, gl.L(6.0f), 0, 0);
        this.r = z;
        setWillNotDraw(!z);
        tl tlVar = this.L;
        if (tlVar != null) {
            tlVar.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, boolean z2) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        jia jiaVar = this.a;
        jiaVar.l(charSequence, false);
        jiaVar.i(null);
        ry8 ry8Var = this.e;
        ry8Var.setVisibility(0);
        hn hnVar = this.c;
        if (charSequence2 != null) {
            int max = (int) Math.max(1.0f, gl.q.x - ((je5.h(charSequence, jiaVar.getTextPaint()) + gl.L(this.s)) + gl.L(16.0f)));
            this.R = charSequence2;
            hnVar.c(TextUtils.ellipsize(charSequence2, hnVar.getPaint(), max, TextUtils.TruncateAt.END), z, true);
        } else {
            hnVar.c("", z, true);
        }
        hnVar.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        ry8Var.setTranslationX(0.0f);
        ry8Var.setTranslationY(0.0f);
        ry8Var.setPadding(0, gl.L(7.0f), 0, 0);
        ry8Var.setImageResource(i);
        this.r = z2;
        setWillNotDraw(!z2);
        Switch r9 = this.f;
        if (r9 != null) {
            r9.setVisibility(8);
        }
        tl tlVar = this.L;
        if (tlVar != null) {
            tlVar.g(null, false);
        }
    }

    @Override // tjb
    public final void updateColors() {
        wjb wjbVar = this.F;
        if (this.N || this.O) {
            try {
                a();
                return;
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        try {
            int v0 = bkb.v0(bkb.x6, wjbVar);
            int v02 = bkb.v0(bkb.H6, wjbVar);
            int e2 = e(v0);
            int e3 = e(v02);
            if (e2 == v0 && e3 == v02) {
                return;
            }
            this.b.setTextColor(e2);
            this.c.setTextColor(e3);
            this.d.setTextColor(e3);
        } catch (Exception e4) {
            fa4.g(e4, true);
        }
    }

    public final void v(CharSequence charSequence, Drawable drawable, boolean z) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        jia jiaVar = this.a;
        jiaVar.l(charSequence, false);
        jiaVar.i(null);
        this.R = null;
        hn hnVar = this.c;
        hnVar.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        hnVar.setVisibility(8);
        this.d.setVisibility(8);
        ry8 ry8Var = this.e;
        ry8Var.setVisibility(8);
        ry8Var.setPadding(0, gl.L(7.0f), 0, 0);
        this.r = z;
        setWillNotDraw(!z);
        Switch r7 = this.f;
        if (r7 != null) {
            r7.setVisibility(8);
        }
        tl tlVar = this.L;
        if (tlVar != null) {
            tlVar.g(null, false);
        }
    }

    public final void w(CharSequence charSequence, boolean z) {
        CharSequence ellipsize;
        hn hnVar = this.c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.R = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, hnVar.getPaint(), gl.q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        hnVar.c(ellipsize, z, true);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    public int e(int i) {
        return i;
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.L == null) {
            tl tlVar = new tl(gl.L(30.0f), this);
            this.L = tlVar;
            if (this.G) {
                tlVar.a();
            }
        }
        this.L.h(document, 1, true);
        invalidate();
    }

    public wgb(Context context, wjb wjbVar) {
        this(20, wjbVar, context, false, false);
    }

    public wgb(int i, Context context, boolean z) {
        this(i, null, context, z, false);
    }

    public wgb(Context context) {
        this(20, null, context, false, false);
    }
}
