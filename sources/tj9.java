// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tj9 implements qkb, wgb {
    public static Paint U;
    public final AtomicReference E;
    public cn F;
    public final b66 G;
    public b66 H;
    public qa6 I;
    public i66 J;
    public kf9 K;
    public boolean L;
    public rna M;
    public CharacterStyle N;
    public int O;
    public int P;
    public gn Q;
    public ti9 R;
    public final RectF S;
    public View T;
    public final uj9 a;
    public final StaticLayout b;
    public int c;
    public int d;
    public int e;
    public final int f;
    public final int h;
    public final int n;
    public boolean r;
    public final int s;
    public boolean w;
    public final ArrayList x;
    public final Stack y;

    public tj9(uj9 uj9Var, CharSequence charSequence, int i, Layout.Alignment alignment, float f) {
        Paint.FontMetricsInt fontMetricsInt;
        boolean z;
        int i2;
        TextPaint textPaint;
        int i3;
        this.x = new ArrayList();
        this.y = new Stack();
        this.E = new AtomicReference();
        this.S = new RectF();
        this.a = uj9Var;
        TextPaint textPaint2 = uj9Var.w;
        Paint.FontMetricsInt fontMetricsInt2 = textPaint2.getFontMetricsInt();
        boolean z2 = true;
        boolean z3 = false;
        if (wi8.A(charSequence)) {
            for (rj9 rj9Var : (rj9[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), rj9.class)) {
                int i4 = rj9Var.b & 15;
                if (i4 >= 1 && i4 <= 6) {
                    TextPaint textPaint3 = new TextPaint(textPaint2);
                    rj9Var.a(textPaint3);
                    fontMetricsInt = textPaint3.getFontMetricsInt();
                    z = true;
                    break;
                }
            }
        }
        fontMetricsInt = fontMetricsInt2;
        z = false;
        CharSequence n = gw3.n(charSequence, fontMetricsInt, false, null, 0, z ? 0.85f : 1.0f, 0);
        if (n instanceof Spanned) {
            Spanned spanned = (Spanned) n;
            if (((gn[]) spanned.getSpans(0, spanned.length(), gn.class)).length != 0 || ((dw3[]) spanned.getSpans(0, spanned.length(), dw3.class)).length != 0 || ((ti9[]) spanned.getSpans(0, spanned.length(), ti9.class)).length != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(n);
                for (gn gnVar : (gn[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gn.class)) {
                    gnVar.setPreserveFontMetrics(true);
                }
                for (dw3 dw3Var : (dw3[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), dw3.class)) {
                    dw3Var.e = true;
                }
                for (ti9 ti9Var : (ti9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ti9.class)) {
                    if (ti9Var.a.a.s > 0) {
                        ti9Var.e = true;
                    }
                }
                int i5 = 0;
                while (i5 < spannableStringBuilder.length()) {
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '\n', i5);
                    boolean z4 = indexOf >= 0 ? z2 : z3;
                    indexOf = z4 ? indexOf : spannableStringBuilder.length();
                    pd0 s = s(spannableStringBuilder, i5, indexOf, textPaint2);
                    int i6 = s.b;
                    if (i6 <= 0 || s.a * 100 < i6 * 70 || (i3 = s.c) <= 0) {
                        textPaint = textPaint2;
                    } else {
                        gn[] gnVarArr = (gn[]) spannableStringBuilder.getSpans(i5, indexOf, gn.class);
                        int length = gnVarArr.length;
                        int i7 = 0;
                        while (i7 < length) {
                            gn gnVar2 = gnVarArr[i7];
                            TextPaint textPaint4 = textPaint2;
                            int spanStart = spannableStringBuilder.getSpanStart(gnVar2);
                            if (spanStart >= i5 && spanStart < indexOf) {
                                gnVar2.setMinimumLineHeight(i3);
                            }
                            i7++;
                            textPaint2 = textPaint4;
                        }
                        textPaint = textPaint2;
                        for (dw3 dw3Var2 : (dw3[]) spannableStringBuilder.getSpans(i5, indexOf, dw3.class)) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(dw3Var2);
                            if (spanStart2 >= i5 && spanStart2 < indexOf) {
                                dw3Var2.f = i3;
                            }
                        }
                        ti9[] ti9VarArr = (ti9[]) spannableStringBuilder.getSpans(i5, indexOf, ti9.class);
                        int length2 = ti9VarArr.length;
                        int i8 = 0;
                        while (i8 < length2) {
                            ti9 ti9Var2 = ti9VarArr[i8];
                            int spanStart3 = spannableStringBuilder.getSpanStart(ti9Var2);
                            ti9[] ti9VarArr2 = ti9VarArr;
                            if (ti9Var2.a.a.s > 0 && spanStart3 >= i5 && spanStart3 < indexOf) {
                                ti9Var2.f = i3;
                            }
                            i8++;
                            ti9VarArr = ti9VarArr2;
                        }
                    }
                    if (!z4) {
                        break;
                    }
                    i5 = indexOf + 1;
                    textPaint2 = textPaint;
                    z2 = true;
                    z3 = false;
                }
                n = spannableStringBuilder;
            }
        }
        int d = zk9.d(n);
        this.s = d;
        if (d == 0 && (n instanceof Spanned)) {
            Spanned spanned2 = (Spanned) n;
            ti9[] ti9VarArr3 = (ti9[]) spanned2.getSpans(0, n.length(), ti9.class);
            if (ti9VarArr3.length > 0) {
                Arrays.sort(ti9VarArr3, new yb2(spanned2, (byte) 2));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n);
                int length3 = ti9VarArr3.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length3) {
                        this.s = zk9.d(spannableStringBuilder2);
                        break;
                    }
                    ti9 ti9Var3 = ti9VarArr3[i9];
                    int spanStart4 = spanned2.getSpanStart(ti9Var3);
                    int spanEnd = spanned2.getSpanEnd(ti9Var3);
                    if (spanStart4 < 0 || spanEnd <= spanStart4) {
                        break;
                    }
                    tj9 tj9Var = ti9Var3.a.a;
                    if (tj9Var.s == 0) {
                        break;
                    }
                    spannableStringBuilder2.replace(spanStart4, spanEnd, tj9Var.b.getText());
                    i9++;
                }
            }
        }
        if (this.s > 0 && (n instanceof Spanned)) {
            for (rj9 rj9Var2 : (rj9[]) ((Spanned) n).getSpans(0, n.length(), rj9.class)) {
                if ((rj9Var2.b & 15) == 14) {
                    rj9Var2.d = true;
                }
            }
        }
        if (n instanceof Spanned) {
            rj9[] rj9VarArr = (rj9[]) ((Spanned) n).getSpans(0, n.length(), rj9.class);
            int length4 = rj9VarArr.length;
            for (int i10 = 0; i10 < length4 && (rj9VarArr[i10].b & 15) == 0; i10++) {
            }
        }
        this.b = k47.f5(f, 0.0f, i, alignment, uj9Var.w, n, false);
        this.f = i;
        this.h = 0;
        for (int i11 = 0; i11 < this.b.getLineCount(); i11++) {
            this.f = Math.min(this.f, (int) Math.floor(this.b.getLineLeft(i11)));
            this.h = Math.max(this.h, (int) Math.ceil(this.b.getLineRight(i11)));
        }
        this.n = 0;
        if (this.b.getLineCount() > 0) {
            StaticLayout staticLayout = this.b;
            this.n = (int) Math.ceil(staticLayout.getLineRight(staticLayout.getLineCount() - 1));
        }
        b66 b66Var = null;
        rna.c(null, this.b, this.y, this.x);
        if (this.b.getText() instanceof Spanned) {
            Spanned spanned3 = (Spanned) this.b.getText();
            for (rj9 rj9Var3 : (rj9[]) spanned3.getSpans(0, spanned3.length(), rj9.class)) {
                int i12 = rj9Var3.b;
                if (TLObject.hasFlag(i12, TLObject.FLAG_13)) {
                    int spanStart5 = spanned3.getSpanStart(rj9Var3);
                    int spanEnd2 = spanned3.getSpanEnd(rj9Var3);
                    if (spanStart5 >= 0 && spanEnd2 > spanStart5) {
                        if (b66Var == null) {
                            i2 = 0;
                            b66Var = new b66(0);
                            b66Var.n = false;
                        } else {
                            i2 = 0;
                        }
                        b66Var.d(this.b, spanStart5, 0.0f);
                        int L = TLObject.hasFlag(i12, TLObject.FLAG_12) ? -gm.L(6.0f) : TLObject.hasFlag(i12, 2048) ? gm.L(2.0f) : i2;
                        b66Var.o = L != 0 ? L + gm.L(L > 0 ? 5.0f : -2.0f) : i2;
                        this.b.getSelectionPath(spanStart5, spanEnd2, b66Var);
                    }
                }
            }
            if (b66Var != null) {
                b66Var.n = true;
                this.G = b66Var;
            }
        }
    }

    public static pd0 s(Spanned spanned, int i, int i2, TextPaint textPaint) {
        ti9[] ti9VarArr;
        int i3;
        pd0 pd0Var = new pd0();
        int i4 = i2 - i;
        if (i4 > 0) {
            gn[] gnVarArr = (gn[]) spanned.getSpans(i, i2, gn.class);
            dw3[] dw3VarArr = (dw3[]) spanned.getSpans(i, i2, dw3.class);
            int[] iArr = (gnVarArr.length == 0 && dw3VarArr.length == 0) ? null : new int[i4];
            int length = gnVarArr.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = i5;
                gn gnVar = gnVarArr[i6];
                int spanStart = spanned.getSpanStart(gnVar);
                int min = Math.min(i2, spanned.getSpanEnd(gnVar));
                if (spanStart < i || spanStart >= i2 || min <= spanStart) {
                    i3 = i6;
                } else {
                    int i7 = spanStart - i;
                    iArr[i7] = Math.max(iArr[i7], min);
                    i3 = i6;
                    pd0Var.c = Math.max(pd0Var.c, gnVar.getSize(textPaint, spanned, spanStart, min, null) + 1);
                }
                i5 = i3 + 1;
            }
            for (dw3 dw3Var : dw3VarArr) {
                int spanStart2 = spanned.getSpanStart(dw3Var);
                int min2 = Math.min(i2, spanned.getSpanEnd(dw3Var));
                if (spanStart2 >= i && spanStart2 < i2 && min2 > spanStart2) {
                    int i8 = spanStart2 - i;
                    iArr[i8] = Math.max(iArr[i8], min2);
                    pd0Var.c = Math.max(pd0Var.c, dw3Var.getSize(textPaint, spanned, spanStart2, min2, null));
                }
            }
            ti9[] ti9VarArr2 = (ti9[]) spanned.getSpans(i, i2, ti9.class);
            if (ti9VarArr2.length > 0) {
                ti9VarArr = null;
                for (ti9 ti9Var : ti9VarArr2) {
                    int spanStart3 = spanned.getSpanStart(ti9Var);
                    if (ti9Var.a.a.s > 0 && spanStart3 >= i && spanStart3 < i2) {
                        if (ti9VarArr == null) {
                            ti9VarArr = new ti9[i4];
                        }
                        ti9VarArr[spanStart3 - i] = ti9Var;
                    }
                }
            } else {
                ti9VarArr = null;
            }
            if (iArr != null || ti9VarArr != null) {
                int i9 = i;
                while (i9 < i2) {
                    int i10 = i9 - i;
                    ti9 ti9Var2 = ti9VarArr == null ? null : ti9VarArr[i10];
                    if (ti9Var2 != null) {
                        ri9 ri9Var = ti9Var2.a;
                        tj9 tj9Var = ri9Var.a;
                        tj9 tj9Var2 = ri9Var.a;
                        if (tj9Var.b.getText() instanceof Spanned) {
                            Spanned spanned2 = (Spanned) tj9Var2.b.getText();
                            pd0 s = s(spanned2, 0, spanned2.length(), tj9Var2.b.getPaint());
                            pd0Var.a += s.a;
                            pd0Var.b += Math.max(1, s.b);
                            pd0Var.c = Math.max(pd0Var.c, s.c);
                            i9 = Math.min(i2, spanned.getSpanEnd(ti9Var2));
                        }
                    }
                    int i11 = iArr == null ? 0 : iArr[i10];
                    if (i11 > i9) {
                        pd0Var.a++;
                        pd0Var.b++;
                        i9 = i11;
                    } else {
                        int codePointAt = Character.codePointAt(spanned, i9);
                        if (!Character.isWhitespace(codePointAt)) {
                            pd0Var.b++;
                        }
                        i9 += Character.charCount(codePointAt);
                    }
                }
            }
        }
        return pd0Var;
    }

    @Override // qkb, mi7
    public final Layout a() {
        return this.b;
    }

    @Override // wgb
    public final int b() {
        return this.s;
    }

    @Override // qkb
    public final Rect c() {
        return null;
    }

    @Override // wgb
    public final void d(Canvas canvas, View view) {
        canvas.save();
        canvas.translate(-n(), 0.0f);
        uj9 uj9Var = this.a;
        boolean D = uj9Var.D();
        TextPaint textPaint = uj9Var.w;
        int v0 = cmb.v0(D ? cmb.Vc : cmb.Uc, uj9Var.D);
        textPaint.setColor(v0);
        textPaint.linkColor = cmb.v0(uj9Var.D() ? cmb.Xc : cmb.Wc, uj9Var.D);
        b66 b66Var = this.G;
        if (b66Var != null) {
            if (U == null) {
                Paint paint = new Paint(1);
                U = paint;
                paint.setPathEffect(b66.c());
            }
            U.setColor((uj9Var.y.h() & 16777215) | 855638016);
            canvas.drawPath(b66Var, U);
        }
        View view2 = view != null ? view : this.T;
        i66 i66Var = this.J;
        if (i66Var != null && i66Var.g(canvas) && view2 != null) {
            view2.invalidate();
        }
        StaticLayout staticLayout = this.b;
        AtomicReference atomicReference = this.E;
        ArrayList arrayList = this.x;
        rna.g(view2, false, v0, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        StaticLayout staticLayout2 = this.b;
        boa.a(canvas, staticLayout2);
        if (!uj9Var.E()) {
            gn.drawAnimatedEmojis(canvas, this.b, this.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
        }
        float f = uj9Var.V;
        if (f > 0.0f) {
            k47 k47Var = uj9Var.b;
            boolean z = uj9Var.O || (k47Var != null && oc7.r1(uj9Var.a).i4.z(k47Var));
            if (this.I == null) {
                qa6 qa6Var = new qa6();
                this.I = qa6Var;
                qa6Var.D = true;
                b66 b66Var2 = new b66(0);
                this.H = b66Var2;
                b66Var2.c = true;
                qa6 qa6Var2 = this.I;
                qa6Var2.y = b66Var2;
                qa6Var2.j(5.0f);
                this.I.b = -1L;
                this.H.reset();
                this.H.d(staticLayout2, 0, 0.0f);
                this.H.n = false;
                staticLayout2.getSelectionPath(0, staticLayout2.getText().length(), this.H);
                b66 b66Var3 = this.H;
                b66Var3.n = true;
                b66Var3.a();
                this.I.k();
            }
            qa6 qa6Var3 = this.I;
            if (z) {
                if (qa6Var3.d() || this.I.c()) {
                    qa6 qa6Var4 = this.I;
                    qa6Var4.b = -1L;
                    qa6Var4.c = -1L;
                }
            } else if (!qa6Var3.d() && !this.I.c()) {
                this.I.a();
            }
            int v02 = cmb.v0(uj9Var.D() ? cmb.Xc : cmb.Wc, uj9Var.D);
            this.I.g(cmb.p1(0.05f, v02), cmb.p1(0.15f, v02), cmb.p1(0.1f, v02), cmb.p1(0.3f, v02));
            this.I.setAlpha((int) (f * 255.0f));
            this.I.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean e(ti9 ti9Var, float f, float f2) {
        float L = gm.L(8.0f);
        RectF rectF = ti9Var.c;
        if (f < rectF.left - L || f >= rectF.right + L || f2 < rectF.top - L || f2 >= rectF.bottom + L) {
            StaticLayout staticLayout = this.b;
            ti9 ti9Var2 = null;
            if (staticLayout.getText() instanceof Spanned) {
                Spanned spanned = (Spanned) staticLayout.getText();
                ti9[] ti9VarArr = (ti9[]) spanned.getSpans(0, spanned.length(), ti9.class);
                if (ti9VarArr.length == 1) {
                    int spanStart = spanned.getSpanStart(ti9VarArr[0]);
                    int spanEnd = spanned.getSpanEnd(ti9VarArr[0]);
                    int i = 0;
                    while (true) {
                        if (i >= spanned.length()) {
                            ti9Var2 = ti9VarArr[0];
                            break;
                        }
                        if ((i < spanStart || i >= spanEnd) && !Character.isWhitespace(spanned.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                }
            }
            if (ti9Var != ti9Var2 || !this.S.contains(f, f2)) {
                return false;
            }
        }
        return true;
    }

    @Override // wgb
    public final void f(View view) {
        View view2 = this.T;
        if (view2 != view || view2 == null) {
            return;
        }
        this.T = null;
        gn.release((View) null, this.F);
        this.F = null;
        i66 i66Var = this.J;
        if (i66Var != null) {
            i66Var.c = null;
        }
        ti9[] p = p();
        if (p != null) {
            for (ti9 ti9Var : p) {
                View view3 = this.T;
                ti9Var.h = null;
                ti9Var.a.a.f(view3);
            }
        }
    }

    @Override // wgb
    public final void g(int i) {
        this.e = i;
    }

    @Override // qkb
    public final CharSequence getPrefix() {
        return null;
    }

    @Override // qkb
    public final int getRow() {
        return this.e;
    }

    @Override // qkb
    public final CharSequence getText() {
        if (a() == null) {
            return null;
        }
        return a().getText();
    }

    @Override // qkb
    public final int getX() {
        return this.c;
    }

    @Override // qkb
    public final int getY() {
        return this.d;
    }

    @Override // wgb
    public final void h(int i) {
        this.d = i;
    }

    @Override // wgb
    public final void i(View view) {
        View view2 = this.T;
        if (view != view2) {
            if (view2 != null) {
                f(view2);
            }
            this.T = view;
            this.F = gn.update(0, view, this.a.v && !this.w, this.F, this.b);
            i66 i66Var = this.J;
            if (i66Var != null) {
                i66Var.c = this.T;
            }
            ti9[] p = p();
            if (p != null) {
                for (ti9 ti9Var : p) {
                    View view3 = this.T;
                    ti9Var.h = view3;
                    ti9Var.a.a(view3);
                }
            }
        }
    }

    @Override // wgb
    public final void j(int i) {
        this.c = i;
    }

    public final void k() {
        kf9 kf9Var = this.K;
        if (kf9Var != null) {
            gm.r(kf9Var);
            this.K = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        r2 = ((android.text.style.URLSpan) r13).getURL();
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(CharacterStyle characterStyle, boolean z) {
        View view;
        String url;
        String substring;
        RecyclerView recyclerView;
        View view2;
        Context context;
        TL_iv.RichText richText;
        if (characterStyle != null) {
            uj9 uj9Var = this.a;
            if (!z && (characterStyle instanceof URLSpan) && !(characterStyle instanceof g6c) && url != null && url.startsWith("#")) {
                uj9Var.getClass();
                if (url.startsWith("#")) {
                    try {
                        substring = URLDecoder.decode(url.substring(1), "UTF-8");
                    } catch (Exception unused) {
                        substring = url.substring(1);
                    }
                    if (!TextUtils.isEmpty(substring)) {
                        String lowerCase = substring.toLowerCase();
                        TL_iv.textAnchor textanchor = (TL_iv.textAnchor) uj9Var.k.get(lowerCase);
                        if (textanchor != null) {
                            View view3 = uj9Var.Q;
                            if (view3 != null && (context = view3.getContext()) != null && (richText = textanchor.text) != null && !(richText instanceof TL_iv.textEmpty)) {
                                String str = textanchor.name;
                                SpannableStringBuilder l = uj9Var.l(dvc.d(textanchor.text, "", str == null ? "" : str.toLowerCase()), 0);
                                my0 h = hg9.h(1, uj9Var.D, context, true);
                                h.v0 = false;
                                h.w0 = false;
                                LinearLayout i = hg9.i(context, 1);
                                TextView textView = new TextView(context);
                                textView.setTextSize(1, 16.0f);
                                textView.setTypeface(gm.o());
                                textView.setText(jb6.M0(2131748949, null));
                                textView.setGravity((jb6.a0 ? 5 : 3) | 16);
                                int i2 = cmb.i5;
                                anb.X(textView, i2, uj9Var.D);
                                textView.setPadding(gm.L(22.0f), 0, gm.L(22.0f), 0);
                                i.addView(textView, new LinearLayout.LayoutParams(-1, gm.L(48.0f)));
                                l66 l66Var = new l66(context, uj9Var.D);
                                l66Var.setTextSize(1, gda.S0);
                                anb.X(l66Var, i2, uj9Var.D);
                                anb.G(l66Var, cmb.j5, uj9Var.D);
                                l66Var.setMovementMethod(LinkMovementMethod.getInstance());
                                l66Var.setPadding(gm.L(22.0f), 0, gm.L(22.0f), gm.L(16.0f));
                                l66Var.setText(l);
                                i.addView(l66Var, new LinearLayout.LayoutParams(-1, -2));
                                FrameLayout frameLayout = new FrameLayout(context);
                                frameLayout.addView(i, qoe.c(-2.0f, -1));
                                h.O = frameLayout;
                                h.show();
                                view2 = this.T;
                                if (view2 == null) {
                                    view2.playSoundEffect(0);
                                    return;
                                }
                                return;
                            }
                        } else {
                            Integer num = (Integer) uj9Var.j.get(lowerCase);
                            if (num != null) {
                                int intValue = num.intValue();
                                if (uj9Var.E != null && intValue >= 0 && intValue < uj9Var.g.size()) {
                                    ViewParent parent = uj9Var.E.getParent();
                                    while (true) {
                                        if (parent == null) {
                                            recyclerView = null;
                                            break;
                                        } else {
                                            if (parent instanceof RecyclerView) {
                                                recyclerView = (RecyclerView) parent;
                                                break;
                                            }
                                            parent = parent.getParent();
                                        }
                                    }
                                    if (recyclerView != null) {
                                        recyclerView.x0(0, (((uj9Var.E.getTop() + uj9Var.E.u0) + uj9Var.r(intValue, null)) - recyclerView.getPaddingTop()) - gm.L(8.0f), null);
                                    }
                                }
                            }
                            view2 = this.T;
                            if (view2 == null) {
                            }
                        }
                    }
                }
            }
            CharacterStyle f6cVar = ((characterStyle instanceof rj9) && TLObject.hasFlag(((rj9) characterStyle).b, 256)) ? new f6c(this.b.getText(), this.O, this.P, uj9Var.D() ? (byte) 1 : (byte) 0, null) : characterStyle;
            mc2 mc2Var = uj9Var.F;
            rc2 rc2Var = uj9Var.E;
            if (mc2Var != null && rc2Var != null) {
                View view4 = this.T;
                if (view4 != null && !z) {
                    view4.playSoundEffect(0);
                }
                mc2Var.M(rc2Var, f6cVar, z);
                return;
            }
            if (z || (view = this.T) == null || !(characterStyle instanceof ClickableSpan)) {
                return;
            }
            view.playSoundEffect(0);
            ((ClickableSpan) characterStyle).onClick(this.T);
        }
    }

    public final void m(Canvas canvas, int i, float f) {
        canvas.save();
        canvas.translate(-n(), 0.0f);
        uj9 uj9Var = this.a;
        boolean D = uj9Var.D();
        TextPaint textPaint = uj9Var.w;
        int v0 = cmb.v0(D ? cmb.Vc : cmb.Uc, uj9Var.D);
        textPaint.setColor(v0);
        textPaint.linkColor = cmb.v0(uj9Var.D() ? cmb.Xc : cmb.Wc, uj9Var.D);
        oi7.b(canvas, this.b, i, f, new yg((Object) this, (Object) this.T, v0, (byte) 13));
        canvas.restore();
    }

    public final int n() {
        if (this.r) {
            return 0;
        }
        return this.f;
    }

    public final boolean o(CharacterStyle characterStyle, ii9 ii9Var) {
        StaticLayout staticLayout = this.b;
        if (!(staticLayout.getText() instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) staticLayout.getText();
        int spanStart = spanned.getSpanStart(characterStyle);
        int spanEnd = spanned.getSpanEnd(characterStyle);
        if (spanStart < 0 || spanEnd <= spanStart) {
            return false;
        }
        ii9Var.a = staticLayout;
        ii9Var.b = spanStart;
        ii9Var.c = spanEnd;
        ii9Var.d = staticLayout.getWidth();
        return true;
    }

    public final ti9[] p() {
        StaticLayout staticLayout = this.b;
        if (!(staticLayout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) staticLayout.getText();
        return (ti9[]) spanned.getSpans(0, spanned.length(), ti9.class);
    }

    public final int q() {
        return Math.max(0, this.n - this.f);
    }

    public final int r() {
        return Math.max(0, this.h - this.f);
    }

    public final boolean t(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        rj9 rj9Var;
        rj9 rj9Var2;
        int spanEnd;
        rj9 rj9Var3;
        int spanStart;
        int actionMasked = motionEvent.getActionMasked();
        int n = n() + ((int) motionEvent.getX());
        int y = (int) motionEvent.getY();
        ArrayList arrayList = this.x;
        uj9 uj9Var = this.a;
        StaticLayout staticLayout = this.b;
        boolean z3 = true;
        int i = 0;
        if (actionMasked == 0) {
            this.M = null;
            this.N = null;
            this.Q = null;
            this.R = null;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                rna rnaVar = (rna) obj;
                if (rnaVar.getBounds().contains(n, y)) {
                    this.M = rnaVar;
                    return true;
                }
            }
            ti9[] p = p();
            if (p != null) {
                for (ti9 ti9Var : p) {
                    if (e(ti9Var, n, y)) {
                        ri9 ri9Var = ti9Var.a;
                        if (ri9Var.b) {
                            return true;
                        }
                        this.R = ti9Var;
                        this.L = false;
                        ri9Var.n(true);
                        View view = this.T;
                        if (view != null) {
                            view.invalidate();
                        }
                        u();
                        return true;
                    }
                }
            }
            if ((staticLayout.getText() instanceof Spannable) && y >= 0 && y < staticLayout.getHeight()) {
                int lineForVertical = staticLayout.getLineForVertical(y);
                float lineLeft = staticLayout.getLineLeft(lineForVertical);
                float lineWidth = staticLayout.getLineWidth(lineForVertical) + lineLeft;
                float f = n;
                if (f >= lineLeft && f <= lineWidth) {
                    int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f);
                    Spannable spannable = (Spannable) staticLayout.getText();
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                        ClickableSpan clickableSpan = clickableSpanArr[0];
                        this.N = clickableSpan;
                        this.O = spannable.getSpanStart(clickableSpan);
                        this.P = spannable.getSpanEnd(this.N);
                        this.L = false;
                        m66 m66Var = new m66(this.N, uj9Var.D, f, y, 0);
                        b66 b = m66Var.b();
                        b.d(staticLayout, this.O, 0.0f);
                        staticLayout.getSelectionPath(this.O, this.P, b);
                        i66 i66Var = this.J;
                        if (i66Var == null) {
                            i66Var = new i66(this.T);
                            this.J = i66Var;
                        }
                        i66Var.a(m66Var, null);
                        View view2 = this.T;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                        u();
                        return true;
                    }
                    rj9[] rj9VarArr = (rj9[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, rj9.class);
                    if (rj9VarArr != null) {
                        int length = rj9VarArr.length;
                        int i3 = 0;
                        while (i3 < length) {
                            z2 = z3;
                            rj9Var = rj9VarArr[i3];
                            if (TLObject.hasFlag(rj9Var.b, 256)) {
                                break;
                            }
                            i3++;
                            z3 = z2;
                        }
                    }
                    z2 = z3;
                    rj9Var = null;
                    if (rj9Var != null) {
                        int spanStart2 = spannable.getSpanStart(rj9Var);
                        int spanEnd2 = spannable.getSpanEnd(rj9Var);
                        while (spanStart2 > 0) {
                            int i4 = spanStart2 - 1;
                            rj9[] rj9VarArr2 = (rj9[]) spannable.getSpans(i4, i4, rj9.class);
                            int length2 = rj9VarArr2.length;
                            int i5 = i;
                            while (true) {
                                if (i5 >= length2) {
                                    rj9Var3 = null;
                                    break;
                                }
                                rj9Var3 = rj9VarArr2[i5];
                                if (TLObject.hasFlag(rj9Var3.b, 256)) {
                                    break;
                                }
                                i5++;
                            }
                            if (rj9Var3 == null || (spanStart = spannable.getSpanStart(rj9Var3)) >= spanStart2) {
                                break;
                            }
                            spanStart2 = spanStart;
                            i = 0;
                        }
                        while (spanEnd2 < spannable.length()) {
                            rj9[] rj9VarArr3 = (rj9[]) spannable.getSpans(spanEnd2, spanEnd2, rj9.class);
                            int length3 = rj9VarArr3.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= length3) {
                                    rj9Var2 = null;
                                    break;
                                }
                                rj9Var2 = rj9VarArr3[i6];
                                if (TLObject.hasFlag(rj9Var2.b, 256)) {
                                    break;
                                }
                                i6++;
                            }
                            if (rj9Var2 == null || (spanEnd = spannable.getSpanEnd(rj9Var2)) <= spanEnd2) {
                                break;
                            }
                            spanEnd2 = spanEnd;
                        }
                        this.N = rj9Var;
                        this.O = spanStart2;
                        this.P = spanEnd2;
                        this.L = false;
                        m66 m66Var2 = new m66(rj9Var, uj9Var.D, f, y, 0);
                        b66 b2 = m66Var2.b();
                        b2.d(staticLayout, spanStart2, 0.0f);
                        staticLayout.getSelectionPath(spanStart2, spanEnd2, b2);
                        i66 i66Var2 = this.J;
                        if (i66Var2 == null) {
                            i66Var2 = new i66(this.T);
                            this.J = i66Var2;
                        }
                        i66Var2.a(m66Var2, null);
                        View view3 = this.T;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                        u();
                        return z2;
                    }
                    gn[] gnVarArr = (gn[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, gn.class);
                    if (gnVarArr != null && gnVarArr.length > 0) {
                        this.Q = gnVarArr[0];
                        return z2;
                    }
                }
            }
            return false;
        }
        if (actionMasked == 2) {
            ti9 ti9Var2 = this.R;
            if (ti9Var2 != null) {
                if (e(ti9Var2, n, y)) {
                    return true;
                }
                k();
                this.R.a.n(false);
                this.R = null;
                this.L = false;
                return true;
            }
        } else {
            if (actionMasked == 1) {
                if (this.R != null) {
                    k();
                    ti9 ti9Var3 = this.R;
                    this.R = null;
                    ti9Var3.a.n(false);
                    if (this.L) {
                        z = false;
                    } else {
                        View view4 = this.T;
                        if (view4 != null) {
                            view4.playSoundEffect(0);
                        }
                        rc2 rc2Var = uj9Var.E;
                        mc2 mc2Var = uj9Var.F;
                        if (rc2Var != null && mc2Var != null) {
                            mc2Var.L0(rc2Var, ti9Var3.b);
                        }
                        z = false;
                    }
                    this.L = z;
                    return true;
                }
                if (this.M != null) {
                    float width = staticLayout.getWidth();
                    float height = staticLayout.getHeight();
                    float sqrt = (float) Math.sqrt((height * height) + (width * width));
                    View view5 = this.T;
                    this.M.q = new sj9(this, view5, uj9Var);
                    int size2 = arrayList.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        Object obj2 = arrayList.get(i7);
                        i7++;
                        ((rna) obj2).j(n, y, sqrt, false);
                    }
                    if (view5 != null) {
                        view5.playSoundEffect(0);
                    }
                    this.M = null;
                    return true;
                }
                if (this.N != null) {
                    k();
                    if (!this.L) {
                        l(this.N, false);
                    }
                    i66 i66Var3 = this.J;
                    if (i66Var3 != null) {
                        i66Var3.e(true);
                    }
                    this.N = null;
                    this.L = false;
                    return true;
                }
                gn gnVar = this.Q;
                if (gnVar == null) {
                    return false;
                }
                this.Q = null;
                rc2 rc2Var2 = uj9Var.E;
                mc2 mc2Var2 = uj9Var.F;
                if (rc2Var2 == null || mc2Var2 == null) {
                    return true;
                }
                View view6 = this.T;
                if (view6 != null) {
                    view6.playSoundEffect(0);
                }
                mc2Var2.D1(gnVar);
                return true;
            }
            if (actionMasked == 3) {
                this.M = null;
                this.Q = null;
                if (this.R != null) {
                    k();
                    this.R.a.n(false);
                    this.R = null;
                    this.L = false;
                }
                if (this.N != null) {
                    k();
                    i66 i66Var4 = this.J;
                    if (i66Var4 != null) {
                        i66Var4.e(true);
                    }
                    this.N = null;
                    this.L = false;
                    return false;
                }
            }
        }
        return false;
    }

    public final void u() {
        k();
        kf9 kf9Var = new kf9(this, (byte) 5);
        this.K = kf9Var;
        gm.d3(kf9Var, ViewConfiguration.getLongPressTimeout());
    }

    public tj9(uj9 uj9Var, SpannableStringBuilder spannableStringBuilder, int i, Layout.Alignment alignment) {
        this(uj9Var, spannableStringBuilder, i, alignment, 1.0f);
    }

    public tj9(uj9 uj9Var, SpannableStringBuilder spannableStringBuilder, int i) {
        this(uj9Var, spannableStringBuilder, i, Layout.Alignment.ALIGN_NORMAL);
    }
}
