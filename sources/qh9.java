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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qh9 implements pib, web {
    public static Paint U;
    public final AtomicReference E;
    public cm F;
    public final b46 G;
    public b46 H;
    public r86 I;
    public i46 J;
    public sr8 K;
    public boolean L;
    public qla M;
    public CharacterStyle N;
    public int O;
    public int P;
    public gm Q;
    public qg9 R;
    public final RectF S;
    public View T;
    public final rh9 a;
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

    public qh9(rh9 rh9Var, CharSequence charSequence, int i, Layout.Alignment alignment, float f) {
        Paint.FontMetricsInt fontMetricsInt;
        boolean z;
        int i2;
        TextPaint textPaint;
        int i3;
        this.x = new ArrayList();
        this.y = new Stack();
        this.E = new AtomicReference();
        this.S = new RectF();
        this.a = rh9Var;
        TextPaint textPaint2 = rh9Var.w;
        Paint.FontMetricsInt fontMetricsInt2 = textPaint2.getFontMetricsInt();
        boolean z2 = true;
        boolean z3 = false;
        if (ug8.A(charSequence)) {
            for (oh9 oh9Var : (oh9[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), oh9.class)) {
                int i4 = oh9Var.b & 15;
                if (i4 >= 1 && i4 <= 6) {
                    TextPaint textPaint3 = new TextPaint(textPaint2);
                    oh9Var.a(textPaint3);
                    fontMetricsInt = textPaint3.getFontMetricsInt();
                    z = true;
                    break;
                }
            }
        }
        fontMetricsInt = fontMetricsInt2;
        z = false;
        CharSequence n = vu3.n(charSequence, fontMetricsInt, false, null, 0, z ? 0.85f : 1.0f, 0);
        if (n instanceof Spanned) {
            Spanned spanned = (Spanned) n;
            if (((gm[]) spanned.getSpans(0, spanned.length(), gm.class)).length != 0 || ((su3[]) spanned.getSpans(0, spanned.length(), su3.class)).length != 0 || ((qg9[]) spanned.getSpans(0, spanned.length(), qg9.class)).length != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(n);
                for (gm gmVar : (gm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gm.class)) {
                    gmVar.setPreserveFontMetrics(true);
                }
                for (su3 su3Var : (su3[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), su3.class)) {
                    su3Var.e = true;
                }
                for (qg9 qg9Var : (qg9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), qg9.class)) {
                    if (qg9Var.a.a.s > 0) {
                        qg9Var.e = true;
                    }
                }
                int i5 = 0;
                while (i5 < spannableStringBuilder.length()) {
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '\n', i5);
                    boolean z4 = indexOf >= 0 ? z2 : z3;
                    indexOf = z4 ? indexOf : spannableStringBuilder.length();
                    pc0 s = s(spannableStringBuilder, i5, indexOf, textPaint2);
                    int i6 = s.b;
                    if (i6 <= 0 || s.a * 100 < i6 * 70 || (i3 = s.c) <= 0) {
                        textPaint = textPaint2;
                    } else {
                        gm[] gmVarArr = (gm[]) spannableStringBuilder.getSpans(i5, indexOf, gm.class);
                        int length = gmVarArr.length;
                        int i7 = 0;
                        while (i7 < length) {
                            gm gmVar2 = gmVarArr[i7];
                            TextPaint textPaint4 = textPaint2;
                            int spanStart = spannableStringBuilder.getSpanStart(gmVar2);
                            if (spanStart >= i5 && spanStart < indexOf) {
                                gmVar2.setMinimumLineHeight(i3);
                            }
                            i7++;
                            textPaint2 = textPaint4;
                        }
                        textPaint = textPaint2;
                        for (su3 su3Var2 : (su3[]) spannableStringBuilder.getSpans(i5, indexOf, su3.class)) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(su3Var2);
                            if (spanStart2 >= i5 && spanStart2 < indexOf) {
                                su3Var2.f = i3;
                            }
                        }
                        qg9[] qg9VarArr = (qg9[]) spannableStringBuilder.getSpans(i5, indexOf, qg9.class);
                        int length2 = qg9VarArr.length;
                        int i8 = 0;
                        while (i8 < length2) {
                            qg9 qg9Var2 = qg9VarArr[i8];
                            int spanStart3 = spannableStringBuilder.getSpanStart(qg9Var2);
                            qg9[] qg9VarArr2 = qg9VarArr;
                            if (qg9Var2.a.a.s > 0 && spanStart3 >= i5 && spanStart3 < indexOf) {
                                qg9Var2.f = i3;
                            }
                            i8++;
                            qg9VarArr = qg9VarArr2;
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
        int d = yi9.d(n);
        this.s = d;
        if (d == 0 && (n instanceof Spanned)) {
            Spanned spanned2 = (Spanned) n;
            qg9[] qg9VarArr3 = (qg9[]) spanned2.getSpans(0, n.length(), qg9.class);
            if (qg9VarArr3.length > 0) {
                Arrays.sort(qg9VarArr3, new na2(spanned2, (byte) 2));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n);
                int length3 = qg9VarArr3.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length3) {
                        this.s = yi9.d(spannableStringBuilder2);
                        break;
                    }
                    qg9 qg9Var3 = qg9VarArr3[i9];
                    int spanStart4 = spanned2.getSpanStart(qg9Var3);
                    int spanEnd = spanned2.getSpanEnd(qg9Var3);
                    if (spanStart4 < 0 || spanEnd <= spanStart4) {
                        break;
                    }
                    qh9 qh9Var = qg9Var3.a.a;
                    if (qh9Var.s == 0) {
                        break;
                    }
                    spannableStringBuilder2.replace(spanStart4, spanEnd, qh9Var.b.getText());
                    i9++;
                }
            }
        }
        if (this.s > 0 && (n instanceof Spanned)) {
            for (oh9 oh9Var2 : (oh9[]) ((Spanned) n).getSpans(0, n.length(), oh9.class)) {
                if ((oh9Var2.b & 15) == 14) {
                    oh9Var2.d = true;
                }
            }
        }
        if (n instanceof Spanned) {
            oh9[] oh9VarArr = (oh9[]) ((Spanned) n).getSpans(0, n.length(), oh9.class);
            int length4 = oh9VarArr.length;
            for (int i10 = 0; i10 < length4 && (oh9VarArr[i10].b & 15) == 0; i10++) {
            }
        }
        this.b = k27.f5(f, 0.0f, i, alignment, rh9Var.w, n, false);
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
        b46 b46Var = null;
        qla.c(null, this.b, this.y, this.x);
        if (this.b.getText() instanceof Spanned) {
            Spanned spanned3 = (Spanned) this.b.getText();
            for (oh9 oh9Var3 : (oh9[]) spanned3.getSpans(0, spanned3.length(), oh9.class)) {
                int i12 = oh9Var3.b;
                if (TLObject.hasFlag(i12, TLObject.FLAG_13)) {
                    int spanStart5 = spanned3.getSpanStart(oh9Var3);
                    int spanEnd2 = spanned3.getSpanEnd(oh9Var3);
                    if (spanStart5 >= 0 && spanEnd2 > spanStart5) {
                        if (b46Var == null) {
                            i2 = 0;
                            b46Var = new b46(0);
                            b46Var.n = false;
                        } else {
                            i2 = 0;
                        }
                        b46Var.d(this.b, spanStart5, 0.0f);
                        int L = TLObject.hasFlag(i12, TLObject.FLAG_12) ? -gl.L(6.0f) : TLObject.hasFlag(i12, 2048) ? gl.L(2.0f) : i2;
                        b46Var.o = L != 0 ? L + gl.L(L > 0 ? 5.0f : -2.0f) : i2;
                        this.b.getSelectionPath(spanStart5, spanEnd2, b46Var);
                    }
                }
            }
            if (b46Var != null) {
                b46Var.n = true;
                this.G = b46Var;
            }
        }
    }

    public static pc0 s(Spanned spanned, int i, int i2, TextPaint textPaint) {
        qg9[] qg9VarArr;
        int i3;
        pc0 pc0Var = new pc0();
        int i4 = i2 - i;
        if (i4 > 0) {
            gm[] gmVarArr = (gm[]) spanned.getSpans(i, i2, gm.class);
            su3[] su3VarArr = (su3[]) spanned.getSpans(i, i2, su3.class);
            int[] iArr = (gmVarArr.length == 0 && su3VarArr.length == 0) ? null : new int[i4];
            int length = gmVarArr.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = i5;
                gm gmVar = gmVarArr[i6];
                int spanStart = spanned.getSpanStart(gmVar);
                int min = Math.min(i2, spanned.getSpanEnd(gmVar));
                if (spanStart < i || spanStart >= i2 || min <= spanStart) {
                    i3 = i6;
                } else {
                    int i7 = spanStart - i;
                    iArr[i7] = Math.max(iArr[i7], min);
                    i3 = i6;
                    pc0Var.c = Math.max(pc0Var.c, gmVar.getSize(textPaint, spanned, spanStart, min, null) + 1);
                }
                i5 = i3 + 1;
            }
            for (su3 su3Var : su3VarArr) {
                int spanStart2 = spanned.getSpanStart(su3Var);
                int min2 = Math.min(i2, spanned.getSpanEnd(su3Var));
                if (spanStart2 >= i && spanStart2 < i2 && min2 > spanStart2) {
                    int i8 = spanStart2 - i;
                    iArr[i8] = Math.max(iArr[i8], min2);
                    pc0Var.c = Math.max(pc0Var.c, su3Var.getSize(textPaint, spanned, spanStart2, min2, null));
                }
            }
            qg9[] qg9VarArr2 = (qg9[]) spanned.getSpans(i, i2, qg9.class);
            if (qg9VarArr2.length > 0) {
                qg9VarArr = null;
                for (qg9 qg9Var : qg9VarArr2) {
                    int spanStart3 = spanned.getSpanStart(qg9Var);
                    if (qg9Var.a.a.s > 0 && spanStart3 >= i && spanStart3 < i2) {
                        if (qg9VarArr == null) {
                            qg9VarArr = new qg9[i4];
                        }
                        qg9VarArr[spanStart3 - i] = qg9Var;
                    }
                }
            } else {
                qg9VarArr = null;
            }
            if (iArr != null || qg9VarArr != null) {
                int i9 = i;
                while (i9 < i2) {
                    int i10 = i9 - i;
                    qg9 qg9Var2 = qg9VarArr == null ? null : qg9VarArr[i10];
                    if (qg9Var2 != null) {
                        og9 og9Var = qg9Var2.a;
                        qh9 qh9Var = og9Var.a;
                        qh9 qh9Var2 = og9Var.a;
                        if (qh9Var.b.getText() instanceof Spanned) {
                            Spanned spanned2 = (Spanned) qh9Var2.b.getText();
                            pc0 s = s(spanned2, 0, spanned2.length(), qh9Var2.b.getPaint());
                            pc0Var.a += s.a;
                            pc0Var.b += Math.max(1, s.b);
                            pc0Var.c = Math.max(pc0Var.c, s.c);
                            i9 = Math.min(i2, spanned.getSpanEnd(qg9Var2));
                        }
                    }
                    int i11 = iArr == null ? 0 : iArr[i10];
                    if (i11 > i9) {
                        pc0Var.a++;
                        pc0Var.b++;
                        i9 = i11;
                    } else {
                        int codePointAt = Character.codePointAt(spanned, i9);
                        if (!Character.isWhitespace(codePointAt)) {
                            pc0Var.b++;
                        }
                        i9 += Character.charCount(codePointAt);
                    }
                }
            }
        }
        return pc0Var;
    }

    @Override // pib, jg7
    public final Layout a() {
        return this.b;
    }

    @Override // web
    public final int b() {
        return this.s;
    }

    @Override // pib
    public final Rect c() {
        return null;
    }

    @Override // web
    public final void d(Canvas canvas, View view) {
        canvas.save();
        canvas.translate(-n(), 0.0f);
        rh9 rh9Var = this.a;
        boolean D = rh9Var.D();
        TextPaint textPaint = rh9Var.w;
        int v0 = bkb.v0(D ? bkb.Vc : bkb.Uc, rh9Var.D);
        textPaint.setColor(v0);
        textPaint.linkColor = bkb.v0(rh9Var.D() ? bkb.Xc : bkb.Wc, rh9Var.D);
        b46 b46Var = this.G;
        if (b46Var != null) {
            if (U == null) {
                Paint paint = new Paint(1);
                U = paint;
                paint.setPathEffect(b46.c());
            }
            U.setColor((rh9Var.y.h() & 16777215) | 855638016);
            canvas.drawPath(b46Var, U);
        }
        View view2 = view != null ? view : this.T;
        i46 i46Var = this.J;
        if (i46Var != null && i46Var.g(canvas) && view2 != null) {
            view2.invalidate();
        }
        StaticLayout staticLayout = this.b;
        AtomicReference atomicReference = this.E;
        ArrayList arrayList = this.x;
        qla.g(view2, false, v0, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        StaticLayout staticLayout2 = this.b;
        ama.a(canvas, staticLayout2);
        if (!rh9Var.E()) {
            gm.drawAnimatedEmojis(canvas, this.b, this.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
        }
        float f = rh9Var.V;
        if (f > 0.0f) {
            k27 k27Var = rh9Var.b;
            boolean z = rh9Var.O || (k27Var != null && na7.q1(rh9Var.a).i4.z(k27Var));
            if (this.I == null) {
                r86 r86Var = new r86();
                this.I = r86Var;
                r86Var.D = true;
                b46 b46Var2 = new b46(0);
                this.H = b46Var2;
                b46Var2.c = true;
                r86 r86Var2 = this.I;
                r86Var2.y = b46Var2;
                r86Var2.j(5.0f);
                this.I.b = -1L;
                this.H.reset();
                this.H.d(staticLayout2, 0, 0.0f);
                this.H.n = false;
                staticLayout2.getSelectionPath(0, staticLayout2.getText().length(), this.H);
                b46 b46Var3 = this.H;
                b46Var3.n = true;
                b46Var3.a();
                this.I.k();
            }
            r86 r86Var3 = this.I;
            if (z) {
                if (r86Var3.d() || this.I.c()) {
                    r86 r86Var4 = this.I;
                    r86Var4.b = -1L;
                    r86Var4.c = -1L;
                }
            } else if (!r86Var3.d() && !this.I.c()) {
                this.I.a();
            }
            int v02 = bkb.v0(rh9Var.D() ? bkb.Xc : bkb.Wc, rh9Var.D);
            this.I.g(bkb.p1(0.05f, v02), bkb.p1(0.15f, v02), bkb.p1(0.1f, v02), bkb.p1(0.3f, v02));
            this.I.setAlpha((int) (f * 255.0f));
            this.I.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean e(qg9 qg9Var, float f, float f2) {
        float L = gl.L(8.0f);
        RectF rectF = qg9Var.c;
        if (f < rectF.left - L || f >= rectF.right + L || f2 < rectF.top - L || f2 >= rectF.bottom + L) {
            StaticLayout staticLayout = this.b;
            qg9 qg9Var2 = null;
            if (staticLayout.getText() instanceof Spanned) {
                Spanned spanned = (Spanned) staticLayout.getText();
                qg9[] qg9VarArr = (qg9[]) spanned.getSpans(0, spanned.length(), qg9.class);
                if (qg9VarArr.length == 1) {
                    int spanStart = spanned.getSpanStart(qg9VarArr[0]);
                    int spanEnd = spanned.getSpanEnd(qg9VarArr[0]);
                    int i = 0;
                    while (true) {
                        if (i >= spanned.length()) {
                            qg9Var2 = qg9VarArr[0];
                            break;
                        }
                        if ((i < spanStart || i >= spanEnd) && !Character.isWhitespace(spanned.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                }
            }
            if (qg9Var != qg9Var2 || !this.S.contains(f, f2)) {
                return false;
            }
        }
        return true;
    }

    @Override // web
    public final void f(View view) {
        View view2 = this.T;
        if (view2 != view || view2 == null) {
            return;
        }
        this.T = null;
        gm.release((View) null, this.F);
        this.F = null;
        i46 i46Var = this.J;
        if (i46Var != null) {
            i46Var.c = null;
        }
        qg9[] p = p();
        if (p != null) {
            for (qg9 qg9Var : p) {
                View view3 = this.T;
                qg9Var.h = null;
                qg9Var.a.a.f(view3);
            }
        }
    }

    @Override // web
    public final void g(int i) {
        this.e = i;
    }

    @Override // pib
    public final CharSequence getPrefix() {
        return null;
    }

    @Override // pib
    public final int getRow() {
        return this.e;
    }

    @Override // pib
    public final CharSequence getText() {
        if (a() == null) {
            return null;
        }
        return a().getText();
    }

    @Override // pib
    public final int getX() {
        return this.c;
    }

    @Override // pib
    public final int getY() {
        return this.d;
    }

    @Override // web
    public final void h(int i) {
        this.d = i;
    }

    @Override // web
    public final void i(View view) {
        View view2 = this.T;
        if (view != view2) {
            if (view2 != null) {
                f(view2);
            }
            this.T = view;
            this.F = gm.update(0, view, this.a.v && !this.w, this.F, this.b);
            i46 i46Var = this.J;
            if (i46Var != null) {
                i46Var.c = this.T;
            }
            qg9[] p = p();
            if (p != null) {
                for (qg9 qg9Var : p) {
                    qg9Var.a(this.T);
                }
            }
        }
    }

    @Override // web
    public final void j(int i) {
        this.c = i;
    }

    public final void k() {
        sr8 sr8Var = this.K;
        if (sr8Var != null) {
            gl.r(sr8Var);
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
            rh9 rh9Var = this.a;
            if (!z && (characterStyle instanceof URLSpan) && !(characterStyle instanceof g4c) && url != null && url.startsWith("#")) {
                rh9Var.getClass();
                if (url.startsWith("#")) {
                    try {
                        substring = URLDecoder.decode(url.substring(1), "UTF-8");
                    } catch (Exception unused) {
                        substring = url.substring(1);
                    }
                    if (!TextUtils.isEmpty(substring)) {
                        String lowerCase = substring.toLowerCase();
                        TL_iv.textAnchor textanchor = (TL_iv.textAnchor) rh9Var.k.get(lowerCase);
                        if (textanchor != null) {
                            View view3 = rh9Var.Q;
                            if (view3 != null && (context = view3.getContext()) != null && (richText = textanchor.text) != null && !(richText instanceof TL_iv.textEmpty)) {
                                String str = textanchor.name;
                                SpannableStringBuilder l = rh9Var.l(ctc.d(textanchor.text, "", str == null ? "" : str.toLowerCase()), 0);
                                fx0 h = de9.h(1, rh9Var.D, context, true);
                                h.v0 = false;
                                h.w0 = false;
                                LinearLayout j = de9.j(context, 1);
                                TextView textView = new TextView(context);
                                textView.setTextSize(1, 16.0f);
                                textView.setTypeface(gl.o());
                                textView.setText(k96.M0(2131749000, null));
                                textView.setGravity((k96.a0 ? 5 : 3) | 16);
                                int i = bkb.i5;
                                zkb.X(textView, i, rh9Var.D);
                                textView.setPadding(gl.L(22.0f), 0, gl.L(22.0f), 0);
                                j.addView(textView, new LinearLayout.LayoutParams(-1, gl.L(48.0f)));
                                l46 l46Var = new l46(context, rh9Var.D);
                                l46Var.setTextSize(1, gba.S0);
                                zkb.X(l46Var, i, rh9Var.D);
                                zkb.G(l46Var, bkb.j5, rh9Var.D);
                                l46Var.setMovementMethod(LinkMovementMethod.getInstance());
                                l46Var.setPadding(gl.L(22.0f), 0, gl.L(22.0f), gl.L(16.0f));
                                l46Var.setText(l);
                                j.addView(l46Var, new LinearLayout.LayoutParams(-1, -2));
                                FrameLayout frameLayout = new FrameLayout(context);
                                frameLayout.addView(j, nme.c(-2.0f, -1));
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
                            Integer num = (Integer) rh9Var.j.get(lowerCase);
                            if (num != null) {
                                int intValue = num.intValue();
                                if (rh9Var.E != null && intValue >= 0 && intValue < rh9Var.g.size()) {
                                    ViewParent parent = rh9Var.E.getParent();
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
                                        recyclerView.x0(0, (((rh9Var.E.getTop() + rh9Var.E.u0) + rh9Var.r(intValue, null)) - recyclerView.getPaddingTop()) - gl.L(8.0f), null);
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
            CharacterStyle f4cVar = ((characterStyle instanceof oh9) && TLObject.hasFlag(((oh9) characterStyle).b, 256)) ? new f4c(this.b.getText(), this.O, this.P, rh9Var.D() ? (byte) 1 : (byte) 0, null) : characterStyle;
            bb2 bb2Var = rh9Var.F;
            gb2 gb2Var = rh9Var.E;
            if (bb2Var != null && gb2Var != null) {
                View view4 = this.T;
                if (view4 != null && !z) {
                    view4.playSoundEffect(0);
                }
                bb2Var.P(gb2Var, f4cVar, z);
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
        rh9 rh9Var = this.a;
        boolean D = rh9Var.D();
        TextPaint textPaint = rh9Var.w;
        int v0 = bkb.v0(D ? bkb.Vc : bkb.Uc, rh9Var.D);
        textPaint.setColor(v0);
        textPaint.linkColor = bkb.v0(rh9Var.D() ? bkb.Xc : bkb.Wc, rh9Var.D);
        lg7.b(canvas, this.b, i, f, new yf((Object) this, (Object) this.T, v0, (byte) 12));
        canvas.restore();
    }

    public final int n() {
        if (this.r) {
            return 0;
        }
        return this.f;
    }

    public final boolean o(CharacterStyle characterStyle, eg9 eg9Var) {
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
        eg9Var.a = staticLayout;
        eg9Var.b = spanStart;
        eg9Var.c = spanEnd;
        eg9Var.d = staticLayout.getWidth();
        return true;
    }

    public final qg9[] p() {
        StaticLayout staticLayout = this.b;
        if (!(staticLayout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) staticLayout.getText();
        return (qg9[]) spanned.getSpans(0, spanned.length(), qg9.class);
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
        oh9 oh9Var;
        oh9 oh9Var2;
        int spanEnd;
        oh9 oh9Var3;
        int spanStart;
        int actionMasked = motionEvent.getActionMasked();
        int n = n() + ((int) motionEvent.getX());
        int y = (int) motionEvent.getY();
        ArrayList arrayList = this.x;
        rh9 rh9Var = this.a;
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
                qla qlaVar = (qla) obj;
                if (qlaVar.getBounds().contains(n, y)) {
                    this.M = qlaVar;
                    return true;
                }
            }
            qg9[] p = p();
            if (p != null) {
                for (qg9 qg9Var : p) {
                    if (e(qg9Var, n, y)) {
                        og9 og9Var = qg9Var.a;
                        if (og9Var.b) {
                            return true;
                        }
                        this.R = qg9Var;
                        this.L = false;
                        og9Var.m(true);
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
                        m46 m46Var = new m46(this.N, rh9Var.D, f, y, 0);
                        b46 b = m46Var.b();
                        b.d(staticLayout, this.O, 0.0f);
                        staticLayout.getSelectionPath(this.O, this.P, b);
                        i46 i46Var = this.J;
                        if (i46Var == null) {
                            i46Var = new i46(this.T);
                            this.J = i46Var;
                        }
                        i46Var.a(m46Var, null);
                        View view2 = this.T;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                        u();
                        return true;
                    }
                    oh9[] oh9VarArr = (oh9[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, oh9.class);
                    if (oh9VarArr != null) {
                        int length = oh9VarArr.length;
                        int i3 = 0;
                        while (i3 < length) {
                            z2 = z3;
                            oh9Var = oh9VarArr[i3];
                            if (TLObject.hasFlag(oh9Var.b, 256)) {
                                break;
                            }
                            i3++;
                            z3 = z2;
                        }
                    }
                    z2 = z3;
                    oh9Var = null;
                    if (oh9Var != null) {
                        int spanStart2 = spannable.getSpanStart(oh9Var);
                        int spanEnd2 = spannable.getSpanEnd(oh9Var);
                        while (spanStart2 > 0) {
                            int i4 = spanStart2 - 1;
                            oh9[] oh9VarArr2 = (oh9[]) spannable.getSpans(i4, i4, oh9.class);
                            int length2 = oh9VarArr2.length;
                            int i5 = i;
                            while (true) {
                                if (i5 >= length2) {
                                    oh9Var3 = null;
                                    break;
                                }
                                oh9Var3 = oh9VarArr2[i5];
                                if (TLObject.hasFlag(oh9Var3.b, 256)) {
                                    break;
                                }
                                i5++;
                            }
                            if (oh9Var3 == null || (spanStart = spannable.getSpanStart(oh9Var3)) >= spanStart2) {
                                break;
                            }
                            spanStart2 = spanStart;
                            i = 0;
                        }
                        while (spanEnd2 < spannable.length()) {
                            oh9[] oh9VarArr3 = (oh9[]) spannable.getSpans(spanEnd2, spanEnd2, oh9.class);
                            int length3 = oh9VarArr3.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= length3) {
                                    oh9Var2 = null;
                                    break;
                                }
                                oh9Var2 = oh9VarArr3[i6];
                                if (TLObject.hasFlag(oh9Var2.b, 256)) {
                                    break;
                                }
                                i6++;
                            }
                            if (oh9Var2 == null || (spanEnd = spannable.getSpanEnd(oh9Var2)) <= spanEnd2) {
                                break;
                            }
                            spanEnd2 = spanEnd;
                        }
                        this.N = oh9Var;
                        this.O = spanStart2;
                        this.P = spanEnd2;
                        this.L = false;
                        m46 m46Var2 = new m46(oh9Var, rh9Var.D, f, y, 0);
                        b46 b2 = m46Var2.b();
                        b2.d(staticLayout, spanStart2, 0.0f);
                        staticLayout.getSelectionPath(spanStart2, spanEnd2, b2);
                        i46 i46Var2 = this.J;
                        if (i46Var2 == null) {
                            i46Var2 = new i46(this.T);
                            this.J = i46Var2;
                        }
                        i46Var2.a(m46Var2, null);
                        View view3 = this.T;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                        u();
                        return z2;
                    }
                    gm[] gmVarArr = (gm[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, gm.class);
                    if (gmVarArr != null && gmVarArr.length > 0) {
                        this.Q = gmVarArr[0];
                        return z2;
                    }
                }
            }
            return false;
        }
        if (actionMasked == 2) {
            qg9 qg9Var2 = this.R;
            if (qg9Var2 != null) {
                if (e(qg9Var2, n, y)) {
                    return true;
                }
                k();
                this.R.a.m(false);
                this.R = null;
                this.L = false;
                return true;
            }
        } else {
            if (actionMasked == 1) {
                if (this.R != null) {
                    k();
                    qg9 qg9Var3 = this.R;
                    this.R = null;
                    qg9Var3.a.m(false);
                    if (this.L) {
                        z = false;
                    } else {
                        View view4 = this.T;
                        if (view4 != null) {
                            view4.playSoundEffect(0);
                        }
                        gb2 gb2Var = rh9Var.E;
                        bb2 bb2Var = rh9Var.F;
                        if (gb2Var != null && bb2Var != null) {
                            bb2Var.V0(gb2Var, qg9Var3.b);
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
                    this.M.q = new ph9(this, view5, rh9Var);
                    int size2 = arrayList.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        Object obj2 = arrayList.get(i7);
                        i7++;
                        ((qla) obj2).j(n, y, sqrt, false);
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
                    i46 i46Var3 = this.J;
                    if (i46Var3 != null) {
                        i46Var3.e(true);
                    }
                    this.N = null;
                    this.L = false;
                    return true;
                }
                gm gmVar = this.Q;
                if (gmVar == null) {
                    return false;
                }
                this.Q = null;
                gb2 gb2Var2 = rh9Var.E;
                bb2 bb2Var2 = rh9Var.F;
                if (gb2Var2 == null || bb2Var2 == null) {
                    return true;
                }
                View view6 = this.T;
                if (view6 != null) {
                    view6.playSoundEffect(0);
                }
                bb2Var2.T1(gmVar);
                return true;
            }
            if (actionMasked == 3) {
                this.M = null;
                this.Q = null;
                if (this.R != null) {
                    k();
                    this.R.a.m(false);
                    this.R = null;
                    this.L = false;
                }
                if (this.N != null) {
                    k();
                    i46 i46Var4 = this.J;
                    if (i46Var4 != null) {
                        i46Var4.e(true);
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
        sr8 sr8Var = new sr8(this, (byte) 27);
        this.K = sr8Var;
        gl.d3(sr8Var, ViewConfiguration.getLongPressTimeout());
    }

    public qh9(rh9 rh9Var, SpannableStringBuilder spannableStringBuilder, int i, Layout.Alignment alignment) {
        this(rh9Var, spannableStringBuilder, i, alignment, 1.0f);
    }

    public qh9(rh9 rh9Var, SpannableStringBuilder spannableStringBuilder, int i) {
        this(rh9Var, spannableStringBuilder, i, Layout.Alignment.ALIGN_NORMAL);
    }
}
