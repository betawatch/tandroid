// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class qi9 implements mi7 {
    public boolean E;
    public int F;
    public int G;
    public TLObject H;
    public boolean J;
    public u51 K;
    public oi7 L;
    public wi9 M;
    public float N;
    public int O;
    public float P;
    public int Q;
    public int T;
    public int U;
    public int V;
    public View W;
    public final uj9 a;
    public final Rect b;
    public final int c;
    public StaticLayout d;
    public float e;
    public int f;
    public int h;
    public int n;
    public CheckBoxBase r;
    public float s;
    public int w;
    public boolean x;
    public boolean y;
    public final RectF I = new RectF();
    public boolean R = true;
    public boolean S = true;

    public qi9(uj9 uj9Var, Rect rect, int i) {
        this.a = uj9Var;
        this.b = new Rect(rect);
        this.c = (i - rect.left) - rect.right;
    }

    public static CharSequence g0(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        lkb[] lkbVarArr = (lkb[]) spanned.getSpans(0, spanned.length(), lkb.class);
        if (lkbVarArr == null || lkbVarArr.length == 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        Arrays.sort(lkbVarArr, new yb2(spanned, (byte) 1));
        for (lkb lkbVar : lkbVarArr) {
            int spanStart = spanned.getSpanStart(lkbVar);
            int spanEnd = spanned.getSpanEnd(lkbVar);
            if (spanStart >= 0 && spanEnd >= 0 && spanStart <= spanEnd && spanEnd <= spannableStringBuilder.length()) {
                String str = lkbVar.a;
                if (str == null) {
                    str = "";
                }
                spannableStringBuilder.replace(spanStart, spanEnd, (CharSequence) str);
            }
        }
        return spannableStringBuilder;
    }

    public static void k(SpannableStringBuilder spannableStringBuilder, tj9 tj9Var, tj9[] tj9VarArr) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (tj9Var != null && (staticLayout2 = tj9Var.b) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            spannableStringBuilder.append(g0(staticLayout2.getText()));
            return;
        }
        if (tj9VarArr != null) {
            for (tj9 tj9Var2 : tj9VarArr) {
                if (tj9Var2 != null && (staticLayout = tj9Var2.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append(g0(staticLayout.getText()));
                }
            }
        }
    }

    public int B() {
        return 0;
    }

    public CharSequence C() {
        return null;
    }

    public CharSequence D(int i) {
        return null;
    }

    public final RectF E() {
        uj9 uj9Var = this.a;
        float textY = uj9Var.E.getTextY() + this.N;
        Rect rect = this.b;
        float f = textY + rect.top;
        return new RectF(gm.L(4.0f) + (uj9Var.E.getTextX() - uj9Var.S), f, ((uj9Var.E.getTextX() + uj9Var.C) + uj9Var.T) - gm.L(4.0f), ((H() + f) - rect.top) - rect.bottom);
    }

    public final boolean F() {
        TLObject tLObject = this.H;
        if (tLObject instanceof TL_iv.PageListItem) {
            return ((TL_iv.PageListItem) tLObject).checked;
        }
        if (tLObject instanceof TL_iv.PageListOrderedItem) {
            return ((TL_iv.PageListOrderedItem) tLObject).checked;
        }
        CheckBoxBase checkBoxBase = this.r;
        return checkBoxBase != null && checkBoxBase.q;
    }

    public int G() {
        return 0;
    }

    public int H() {
        Rect rect = this.b;
        return gm.L(62.0f) + rect.top + rect.bottom;
    }

    public int I() {
        return J();
    }

    public int J() {
        Rect rect = this.b;
        return rect.left + this.c + rect.right;
    }

    public qkb[] K() {
        return null;
    }

    public final boolean L(int i) {
        return this.r != null && i == 0 && F();
    }

    public final boolean M(int i) {
        return this.r == null || i != 0 || n();
    }

    public final boolean O(int i) {
        return (this.r == null || i != 0) && (this instanceof wi9);
    }

    public boolean P() {
        return false;
    }

    public final boolean Q() {
        int indexOf;
        uj9 uj9Var = this.a;
        if (uj9Var.h.isEmpty() || (indexOf = uj9Var.g.indexOf(this)) < 0) {
            return false;
        }
        for (int i = 0; i < uj9Var.h.size(); i++) {
            ni9 ni9Var = (ni9) uj9Var.h.get(i);
            if (indexOf >= ni9Var.a && indexOf <= ni9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean R() {
        wi9 wi9Var = this.M;
        if (wi9Var == null) {
            return true;
        }
        if (wi9Var.X.open) {
            return wi9Var.R();
        }
        return false;
    }

    public boolean T(int i, View view) {
        return false;
    }

    public void W(Canvas canvas, int i, float f) {
        V(canvas);
    }

    public boolean X(MotionEvent motionEvent) {
        return false;
    }

    public void Y(int i, int i2, int i3) {
        this.T = i;
        this.U = i2;
        this.V = i3;
        qkb[] K = K();
        if (K != null) {
            for (qkb qkbVar : K) {
                if (qkbVar instanceof tj9) {
                    tj9 tj9Var = (tj9) qkbVar;
                    tj9Var.c = i - tj9Var.f;
                    tj9Var.d = i2;
                    tj9Var.e = i3;
                }
            }
        }
    }

    public final void Z(boolean z) {
        View view = this.W;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                parent.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    @Override // mi7
    public Layout a() {
        return null;
    }

    public final void a0(TLObject tLObject, boolean z) {
        this.H = tLObject;
        if (this.r == null) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(20, this.a.D, null);
            this.r = checkBoxBase;
            checkBoxBase.h(cmb.Xl, cmb.y5, cmb.j7);
            this.r.d(10);
            this.r.k(true);
            this.r.i(gm.L(5.0f));
        }
        this.r.f(-1, z, false);
        f0();
    }

    public final void b(boolean z) {
        Z(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b0(String str) {
        String str2;
        uj9 uj9Var = this.a;
        uj9Var.x.setTextSize(gm.L(gda.S0));
        Layout a = a();
        CharSequence text = a == null ? null : a.getText();
        if (!TextUtils.isEmpty(str) && (text instanceof Spanned) && text.length() > 0) {
            for (rj9 rj9Var : (rj9[]) ((Spanned) text).getSpans(0, 1, rj9.class)) {
                if (TLObject.hasFlag(rj9Var.b, 16)) {
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                    str2 = spannableString;
                    break;
                }
            }
        }
        str2 = str;
        int i = this.n;
        if (i <= 0) {
            boolean H = uj9Var.H();
            Rect rect = this.b;
            i = Math.max(H ? rect.right : rect.left, gm.L(uj9Var.M + 4));
        }
        this.d = new StaticLayout(str2, uj9Var.x, i, uj9Var.H() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false);
        this.f = gm.L(uj9Var.M + 4);
        this.h = 0;
        for (int i2 = 0; i2 < this.d.getLineCount(); i2++) {
            this.f = Math.min(this.f, (int) this.d.getLineLeft(i2));
            this.h = Math.max(this.h, (int) this.d.getLineRight(i2));
        }
        f0();
    }

    public void c0() {
        this.P = this.N;
        this.Q = this.O;
        this.S = this.R;
    }

    public final void d0() {
        if (n()) {
            uj9 uj9Var = this.a;
            if (!oc7.r1(uj9Var.a).x4()) {
                new kj8(43, uj9Var.D, uj9Var.E.getContext()).show();
                return;
            }
            boolean z = !F();
            TLObject tLObject = this.H;
            if (tLObject instanceof TL_iv.PageListItem) {
                ((TL_iv.PageListItem) tLObject).checked = z;
            } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                ((TL_iv.PageListOrderedItem) tLObject).checked = z;
            }
            View view = uj9Var.Q;
            if (view != null) {
                this.r.a = view;
            }
            this.r.f(-1, z, true);
            View view2 = uj9Var.Q;
            if (view2 != null) {
                view2.invalidate();
            }
            View view3 = uj9Var.Q;
            if (view3 != null) {
                view3.performHapticFeedback(3, 2);
            }
            uj9Var.F.P1(uj9Var.E, new n28((byte) 5, (Object) this, z));
        }
    }

    @Override // mi7
    public final View e() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0073 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:3:0x000d, B:5:0x0011, B:9:0x002a, B:11:0x0030, B:13:0x0036, B:15:0x003a, B:17:0x0043, B:18:0x0046, B:20:0x004a, B:24:0x004e, B:29:0x0058, B:31:0x005e, B:37:0x006d, B:39:0x0073, B:41:0x0078, B:42:0x007b, B:44:0x007f, B:47:0x008c), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:3:0x000d, B:5:0x0011, B:9:0x002a, B:11:0x0030, B:13:0x0036, B:15:0x003a, B:17:0x0043, B:18:0x0046, B:20:0x004a, B:24:0x004e, B:29:0x0058, B:31:0x005e, B:37:0x006d, B:39:0x0073, B:41:0x0078, B:42:0x007b, B:44:0x007f, B:47:0x008c), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #0 {all -> 0x009a, blocks: (B:3:0x000d, B:5:0x0011, B:9:0x002a, B:11:0x0030, B:13:0x0036, B:15:0x003a, B:17:0x0043, B:18:0x0046, B:20:0x004a, B:24:0x004e, B:29:0x0058, B:31:0x005e, B:37:0x006d, B:39:0x0073, B:41:0x0078, B:42:0x007b, B:44:0x007f, B:47:0x008c), top: B:2:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e0(MotionEvent motionEvent) {
        boolean z;
        u51 u51Var;
        View view;
        View view2;
        Rect rect = this.b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (this.r != null) {
                int actionMasked = motionEvent.getActionMasked();
                boolean contains = this.I.contains(motionEvent.getX(), motionEvent.getY());
                uj9 uj9Var = this.a;
                if (actionMasked == 0) {
                    if (contains && n()) {
                        this.J = true;
                        u51 u51Var2 = this.K;
                        if (u51Var2 == null && (view2 = uj9Var.Q) != null) {
                            u51Var2 = new u51(view2);
                            this.K = u51Var2;
                        }
                        if (u51Var2 != null) {
                            u51Var2.c(true);
                        }
                        View view3 = uj9Var.Q;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                        return true;
                    }
                } else if (this.J) {
                    if (actionMasked != 2) {
                        if (actionMasked != 1) {
                            if (actionMasked == 3) {
                            }
                        } else if (contains) {
                            z = true;
                            this.J = false;
                            u51Var = this.K;
                            if (u51Var != null) {
                                u51Var.c(false);
                            }
                            if (z) {
                                d0();
                            }
                            view = uj9Var.Q;
                            if (view != null) {
                                view.invalidate();
                            }
                        }
                        z = false;
                        this.J = false;
                        u51Var = this.K;
                        if (u51Var != null) {
                        }
                        if (z) {
                        }
                        view = uj9Var.Q;
                        if (view != null) {
                        }
                    } else if (!contains) {
                        this.J = false;
                        u51 u51Var3 = this.K;
                        if (u51Var3 != null) {
                            u51Var3.c(false);
                        }
                    }
                    return true;
                }
            }
            return X(motionEvent);
        } finally {
            motionEvent.offsetLocation(rect.left, rect.top);
        }
    }

    public final void f0() {
        StaticLayout staticLayout = this.d;
        Rect rect = this.b;
        uj9 uj9Var = this.a;
        if (staticLayout != null) {
            if (a() == null || a().getLineCount() <= 0 || this.d.getLineCount() <= 0) {
                this.e = (Math.min(gm.L(uj9Var.M + 14), (H() - rect.top) - rect.bottom) - this.d.getHeight()) / 2.0f;
            } else {
                this.e = (a().getLineBaseline(0) + G()) - this.d.getLineBaseline(0);
            }
        }
        if (this.r != null) {
            if (a() == null || a().getLineCount() <= 0) {
                this.s = (Math.min(gm.L(uj9Var.M + 14), (H() - rect.top) - rect.bottom) - gm.L(20.0f)) / 2.0f;
            } else {
                this.s = (a().getLineBaseline(0) + G()) - (gm.L(20.0f) * 0.7f);
            }
        }
    }

    public final void m(View view) {
        View view2 = this.W;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            U();
            CheckBoxBase checkBoxBase = this.r;
            if (checkBoxBase != null) {
                checkBoxBase.l = false;
            }
            this.W = null;
        }
        this.W = view;
        CheckBoxBase checkBoxBase2 = this.r;
        if (checkBoxBase2 != null) {
            checkBoxBase2.a = view;
            checkBoxBase2.l = true;
        }
        S();
    }

    public final boolean n() {
        uj9 uj9Var;
        rc2 rc2Var;
        mc2 mc2Var;
        return (this.r == null || this.H == null || (rc2Var = (uj9Var = this.a).E) == null || (mc2Var = uj9Var.F) == null || !mc2Var.x0(rc2Var)) ? false : true;
    }

    public void o(ArrayList arrayList) {
        arrayList.add(this);
    }

    public void p(Canvas canvas) {
        q(canvas, TLObject.FLAG_31, 0.0f);
    }

    public final void q(Canvas canvas, int i, float f) {
        float N;
        float f2;
        canvas.save();
        Rect rect = this.b;
        canvas.translate(rect.left, rect.top);
        uj9 uj9Var = this.a;
        boolean H = uj9Var.H();
        TextPaint textPaint = uj9Var.x;
        float L = (((uj9Var.C + uj9Var.T) - gm.L(14.0f)) - rect.right) - rect.left;
        if (this.d != null) {
            textPaint.setTextSize(gm.L(gda.S0));
            textPaint.setColor(cmb.v0(uj9Var.D() ? cmb.Vc : cmb.Uc, uj9Var.D));
            canvas.save();
            if (!this.x && !this.y) {
                float N2 = gm.N(5.0f);
                if (H) {
                    N = (this.n + L) - gm.N(0.5f);
                    f2 = N2 / 2.0f;
                } else {
                    N = (N2 / 2.0f) + gm.N(0.5f);
                    f2 = this.n;
                }
                canvas.drawCircle(N - f2, (this.e + this.d.getLineBaseline(0)) - (gm.L(gda.S0) * 0.35f), N2 / 2.0f, textPaint);
            } else if (H) {
                canvas.translate(((gm.L(0.0f) + L) - this.f) + (this.r != null ? gm.L(26.0f) : 0), this.e);
                this.d.draw(canvas);
            } else {
                canvas.translate((gm.L(0.0f) - this.n) - this.f, this.e);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
        if (this.r != null) {
            int L2 = H ? (int) (L + gm.L(6.0f)) : -gm.L(26.0f);
            this.I.set(L2 - gm.L(6.0f), this.s - gm.L(6.0f), gm.L(6.0f) + gm.L(20.0f) + L2, this.s + gm.L(20.0f) + gm.L(6.0f));
            View view = uj9Var.Q;
            if (view != null) {
                CheckBoxBase checkBoxBase = this.r;
                if (checkBoxBase.a == null) {
                    checkBoxBase.a = view;
                }
            }
            u51 u51Var = this.K;
            float a = u51Var != null ? u51Var.a(0.1f) : 1.0f;
            canvas.save();
            canvas.scale(a, a, gm.L(10.0f) + L2, this.s + gm.L(10.0f));
            this.r.e(L2, (int) this.s, gm.L(20.0f), gm.L(20.0f));
            this.r.a(canvas);
            canvas.restore();
        }
        if (i == Integer.MIN_VALUE) {
            V(canvas);
        } else {
            W(canvas, i, f);
        }
        canvas.restore();
    }

    public boolean r(Canvas canvas, ColorFilter colorFilter) {
        tj9 tj9Var;
        cn cnVar;
        qkb[] K = K();
        if (K == null) {
            return false;
        }
        boolean z = false;
        for (qkb qkbVar : K) {
            if ((qkbVar instanceof tj9) && (cnVar = (tj9Var = (tj9) qkbVar).F) != null && !cnVar.a.isEmpty()) {
                canvas.save();
                canvas.translate(tj9Var.c, tj9Var.d - this.N);
                gn.drawAnimatedEmojis(canvas, tj9Var.b, tj9Var.F, 0.0f, tj9Var.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z = true;
            }
        }
        return z;
    }

    public void s(Canvas canvas) {
        oi7 oi7Var = this.L;
        if (oi7Var != null && oi7Var.h && oi7Var.d(this) >= 0) {
            if (!oi7Var.i(this)) {
                return;
            }
            if (oi7Var.g(this)) {
                q(canvas, oi7Var.g(this) ? oi7Var.e : -1, oi7Var.g(this) ? oi7Var.f : 0.0f);
                return;
            }
            float c = oi7Var.c(this);
            if (c <= 0.0f) {
                return;
            }
            if (c < 1.0f) {
                Rect rect = this.b;
                int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, rect.left + this.c + rect.right, H(), (int) (c * 255.0f));
                p(canvas);
                canvas.restoreToCount(saveLayerAlpha);
                return;
            }
        }
        p(canvas);
    }

    public boolean t(CharacterStyle characterStyle, int i, ii9 ii9Var) {
        qkb[] K = K();
        if (K != null) {
            for (qkb qkbVar : K) {
                if (qkbVar instanceof tj9) {
                    if (((tj9) qkbVar).o(characterStyle, ii9Var)) {
                        Rect rect = this.b;
                        ii9Var.e = rect.left - r4.f;
                        ii9Var.f = i + rect.top;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean u() {
        return I() >= J();
    }

    public final void v(int i, Rect rect) {
        CheckBoxBase checkBoxBase = this.r;
        if (checkBoxBase == null || i != 0) {
            z(i - (checkBoxBase == null ? 0 : 1), rect);
        } else {
            int i2 = this.b.left;
            float f = this.N;
            rect.set(i2, (int) f, this.c + i2, (int) (f + H()));
        }
        uj9 uj9Var = this.a;
        int i3 = -uj9Var.S;
        int i4 = uj9Var.C + uj9Var.T;
        int min = Math.min(i4, Math.max(rect.left, i3));
        rect.left = min;
        rect.right = Math.max(min, Math.min(rect.right, i4));
    }

    public final CharSequence w(int i) {
        StaticLayout staticLayout;
        CheckBoxBase checkBoxBase = this.r;
        if (checkBoxBase == null || i != 0) {
            return D(i - (checkBoxBase == null ? 0 : 1));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence text = (!this.x || (staticLayout = this.d) == null) ? null : staticLayout.getText();
        CharSequence x = x();
        if (!TextUtils.isEmpty(text)) {
            spannableStringBuilder.append(text).append(' ');
        }
        if (!TextUtils.isEmpty(x)) {
            spannableStringBuilder.append(x).append(", ");
        }
        j(spannableStringBuilder);
        return spannableStringBuilder.length() > 0 ? spannableStringBuilder : jb6.M0(2131754903, null);
    }

    public CharSequence x() {
        int i = this.F;
        String M0 = i == 0 ? null : jb6.M0(i, null);
        int i2 = this.G;
        String M02 = i2 != 0 ? jb6.M0(i2, null) : null;
        return TextUtils.isEmpty(M0) ? M02 : TextUtils.isEmpty(M02) ? M0 : TextUtils.concat(M0, ", ", M02);
    }

    public float y() {
        return 1.0f;
    }

    public void z(int i, Rect rect) {
        int i2 = this.b.left;
        float f = this.N;
        rect.set(i2, (int) f, this.c + i2, (int) (f + H()));
    }

    public void S() {
    }

    public void U() {
    }

    public void V(Canvas canvas) {
    }

    public void j(SpannableStringBuilder spannableStringBuilder) {
    }
}
