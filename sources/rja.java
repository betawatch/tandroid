// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class rja extends FrameLayout implements g94, jm7, vlb, h27, zt5 {
    public CharSequence E;
    public CharSequence F;
    public boolean G;
    public boolean H;
    public im0 I;
    public im0 J;
    public im0 K;
    public float L;
    public km0 M;
    public nm0 N;
    public am0 O;
    public km0 P;
    public iac Q;
    public bka R;
    public r7 S;
    public final fn0 T;
    public final fn0 U;
    public final fn0 V;
    public c6 W;
    public final ylb a;
    public boolean a0;
    public final pja b;
    public int b0;
    public final c88 c;
    public boolean c0;
    public yja d;
    public boolean d0;
    public yja e;
    public int e0;
    public io f;
    public int f0;
    public int g0;
    public io h;
    public int h0;
    public int i0;
    public int j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public uja n;
    public boolean n0;
    public boolean o0;
    public km0 p0;
    public lz4 q0;
    public FrameLayout r;
    public final RectF r0;
    public l7 s;
    public final Path s0;
    public final RectF t0;
    public int u0;
    public boolean v0;
    public ImageView w;
    public float w0;
    public TextView x;
    public zja y;

    public rja(Context context, ylb ylbVar) {
        super(context);
        this.L = -1.0f;
        d53 d53Var = d53.h;
        this.T = new fn0(0, this, d53Var, 380L, false);
        this.U = new fn0(1, this, d53Var, 380L, false);
        this.V = new fn0(2, this, d53Var, 250L, false);
        this.a0 = true;
        this.o0 = true;
        this.r0 = new RectF();
        this.s0 = new Path();
        this.t0 = new RectF();
        this.w0 = 1.0f;
        this.a = ylbVar;
        setClipChildren(false);
        setWillNotDraw(false);
        E();
        c88 c88Var = new c88(this, context);
        this.c = c88Var;
        addView(c88Var, qoe.e(-1, -2, 51));
        pja pjaVar = new pja(this, context);
        this.b = pjaVar;
        pjaVar.setVisibility(8);
        pjaVar.setContentDescription(jb6.M0(2131754878, null));
        pjaVar.setOnClickListener(new oja(this, (byte) 0));
        addView(pjaVar, qoe.e(46, 46, 51));
    }

    public static void G(View view, float f) {
        view.setAlpha(f);
        view.setVisibility(f > 0.0f ? 0 : 4);
    }

    public static void H(View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.rightMargin = i3;
    }

    private int getRowTop() {
        if (this.a0) {
            return gm.m;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n7 getSearchListener() {
        zja zjaVar = this.y;
        if (zjaVar != null) {
            return zjaVar.getSearchListener();
        }
        return null;
    }

    private float getSearchPillLeft() {
        return gm.L(((Drawable) this.b.b) != null ? 58.0f : 6.0f);
    }

    public final /* synthetic */ void A(int i, KeyEvent keyEvent) {
        if (i != 3) {
            if (keyEvent == null) {
                return;
            }
            if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                return;
            }
        }
        gm.t1(this.s);
        n7 searchListener = getSearchListener();
        if (searchListener != null) {
            searchListener.k(this.s);
        }
    }

    public final boolean B() {
        bka bkaVar = this.R;
        if (bkaVar != null) {
            bkaVar.a(true);
            return true;
        }
        if (this.H || !this.G) {
            return false;
        }
        o(true);
        return true;
    }

    public final boolean C(boolean z, boolean z2) {
        n7 searchListener;
        boolean z3 = false;
        if (this.y == null || this.G || this.H || !((searchListener = getSearchListener()) == null || searchListener.c())) {
            return false;
        }
        u();
        this.G = true;
        yja yjaVar = this.d;
        if (yjaVar != null) {
            yjaVar.f();
        }
        l7 l7Var = this.s;
        CharSequence charSequence = this.F;
        if (charSequence == null) {
            charSequence = "";
        }
        l7Var.setText(charSequence);
        this.F = null;
        this.s.requestFocus();
        if (z) {
            gm.E3(this.s);
        }
        if (z2 && y()) {
            z3 = true;
        }
        this.T.a(true, z3);
        l();
        if (searchListener != null) {
            searchListener.i();
        }
        return true;
    }

    public void D(int i, float f, float f2, h94 h94Var) {
        if (i != 2) {
            l();
            return;
        }
        ImageView imageView = this.w;
        if (imageView != null) {
            imageView.setAlpha(f);
            float f3 = (f * 0.5f) + 0.5f;
            this.w.setScaleX(f3);
            this.w.setScaleY(f3);
            this.w.setVisibility(f > 0.0f ? 0 : 4);
        }
    }

    public final void E() {
        boolean z = this.k0;
        ylb ylbVar = this.a;
        if (!z) {
            this.e0 = cmb.v0(cmb.F6, ylbVar);
        }
        if (!this.l0) {
            this.f0 = cmb.v0(cmb.x6, ylbVar);
        }
        if (!this.m0) {
            this.g0 = cmb.v0(cmb.F6, ylbVar);
        }
        this.h0 = cmb.v0(cmb.F6, ylbVar);
        if (!this.n0) {
            this.i0 = cmb.v0(cmb.h6, ylbVar);
        }
        this.j0 = cmb.v0(cmb.h6, ylbVar);
    }

    public final void F(int i, boolean z) {
        String E = jb6.E(i, ' ');
        q();
        this.f.c(E, z && y() && this.H, true);
    }

    public final void I(CharSequence charSequence, boolean z, long j, d53 d53Var) {
        if (!y()) {
            setTitle(charSequence);
            return;
        }
        c88 c88Var = this.c;
        c88Var.b(0);
        c88Var.b(1);
        lka[] lkaVarArr = (lka[]) c88Var.c;
        lka lkaVar = lkaVarArr[0];
        lka lkaVar2 = lkaVarArr[1];
        lkaVarArr[0] = lkaVar2;
        lkaVarArr[1] = lkaVar;
        lkaVar2.animate().cancel();
        lkaVar2.k(charSequence);
        lkaVar2.setVisibility(0);
        lkaVar2.setAlpha(0.0f);
        int L = gm.L(16.0f);
        if (!z) {
            L = -L;
        }
        lkaVar2.setTranslationY(L);
        lkaVar2.animate().alpha(1.0f).translationY(0.0f).setDuration(j).setInterpolator(d53Var).start();
        lkaVar.animate().cancel();
        lkaVar.animate().alpha(0.0f).translationY(z ? -gm.L(16.0f) : gm.L(16.0f)).setDuration(j).setInterpolator(d53Var).withEndAction(new qja(lkaVar, (byte) 1)).start();
        c88Var.requestLayout();
    }

    public final void J() {
        if (this.e == null || this.H) {
            return;
        }
        this.H = true;
        yja yjaVar = this.d;
        if (yjaVar != null) {
            yjaVar.f();
        }
        l7 l7Var = this.s;
        if (l7Var != null && this.G) {
            gm.t1(l7Var);
        }
        this.U.a(true, y());
        l();
        this.b.b(true, y());
        nm7.e().k(nm7.v4, new Object[0]);
    }

    public final void K() {
        l7 l7Var = this.s;
        int i = cmb.F6;
        ylb ylbVar = this.a;
        l7Var.setTextColor(cmb.v0(i, ylbVar));
        this.x.setTextColor(cmb.v0(i, ylbVar));
        this.s.setHintTextColor(cmb.v0(cmb.G6, ylbVar));
        this.s.setCursorColor(cmb.v0(i, ylbVar));
        this.s.setHighlightColor(cmb.v0(cmb.kg, ylbVar));
        this.s.setHandlesColor(cmb.v0(cmb.lg, ylbVar));
        this.w.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.l6, ylbVar), PorterDuff.Mode.SRC_IN));
        this.w.setBackground(cmb.f0(this.i0, 1, -1));
    }

    @Override // h27
    public final boolean a() {
        return false;
    }

    @Override // h27
    public final void b(bka bkaVar, r7 r7Var) {
        this.R = bkaVar;
        this.S = r7Var;
        invalidate();
    }

    @Override // h27
    public final boolean c(r7 r7Var, RectF rectF) {
        if (r7Var.getParent() == this.d && getSearchFactor() == 0.0f && getActionModeFactor() == 0.0f) {
            p(rectF);
            return true;
        }
        float L = gm.L(23.0f);
        View view = (View) r7Var.getParent();
        float width = (r7Var.getWidth() / 2.0f) + r7Var.getX() + (view != null ? view.getX() : 0.0f);
        float currentActionBarHeight = (a.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        rectF.set(width - L, currentActionBarHeight - L, width + L, currentActionBarHeight + L);
        return false;
    }

    @Override // h27
    public final boolean d() {
        return false;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.r4) {
            updateColors();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        uja ujaVar;
        this.c0 = this.d0;
        int L = gm.L(6.0f);
        if (this.I != null) {
            pja pjaVar = this.b;
            if (pjaVar.getVisibility() == 0 && pjaVar.getAlpha() > 0.0f) {
                float width = (pjaVar.getWidth() / 2.0f) + pjaVar.getX();
                float height = (pjaVar.getHeight() / 2.0f) + pjaVar.getY();
                float scaleX = pjaVar.getScaleX() * (pjaVar.getWidth() / 2.0f);
                float scaleY = pjaVar.getScaleY() * (pjaVar.getHeight() / 2.0f);
                this.I.setBounds(((int) (width - scaleX)) - L, ((int) (height - scaleY)) - L, ((int) (width + scaleX)) + L, ((int) (height + scaleY)) + L);
                this.I.setAlpha((int) (pjaVar.getAlpha() * 255.0f));
                this.I.draw(canvas);
            }
        }
        if (this.K != null && (ujaVar = this.n) != null && ujaVar.c == tja.a && ujaVar.getVisibility() == 0 && this.n.getAlpha() > 0.0f) {
            float width2 = (this.n.getWidth() / 2.0f) + this.n.getX();
            float height2 = (this.n.getHeight() / 2.0f) + this.n.getY();
            float scaleX2 = this.n.getScaleX() * (this.n.getWidth() / 2.0f);
            float scaleY2 = this.n.getScaleY() * (this.n.getHeight() / 2.0f);
            this.K.setBounds(((int) (width2 - scaleX2)) - L, ((int) (height2 - scaleY2)) - L, ((int) (width2 + scaleX2)) + L, ((int) (height2 + scaleY2)) + L);
            this.K.setAlpha((int) (this.n.getAlpha() * 255.0f));
            this.K.draw(canvas);
        }
        if (this.J != null) {
            RectF rectF = this.r0;
            float p = p(rectF);
            r7 r7Var = this.S;
            boolean z = r7Var != null && r7Var.getParent() == this.d;
            if (p > 0.0f && rectF.width() > 0.0f && !z) {
                float height3 = rectF.height() / 2.0f;
                if (Math.abs(height3 - this.L) > 0.5f) {
                    this.L = height3;
                    this.J.r(height3);
                }
                this.J.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                this.J.setAlpha((int) (p * 255.0f));
                this.J.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        r7 r7Var;
        if (view == this.d && (r7Var = this.S) != null && r7Var.getParent() == this.d) {
            return false;
        }
        if (view != this.r || getSearchFactor() >= 1.0f) {
            return super.drawChild(canvas, view, j);
        }
        RectF rectF = this.r0;
        p(rectF);
        canvas.save();
        canvas.clipRect(rectF);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // zt5
    public final void e(xt5 xt5Var) {
        uja ujaVar;
        if (this.I != null) {
            pja pjaVar = this.b;
            if (pjaVar.getVisibility() == 0 && pjaVar.getAlpha() > 0.0f) {
                k(pjaVar, xt5Var);
            }
        }
        if (this.K != null && (ujaVar = this.n) != null && ujaVar.c == tja.a && ujaVar.getVisibility() == 0 && this.n.getAlpha() > 0.0f) {
            k(this.n, xt5Var);
        }
        im0 im0Var = this.J;
        Path path = this.s0;
        if (im0Var != null) {
            RectF rectF = this.t0;
            if (p(rectF) > 0.0f && rectF.width() > 0.0f) {
                path.rewind();
                path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
                xt5Var.a(path);
            }
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!z(childAt) && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && (childAt.getBackground() instanceof im0)) {
                path.rewind();
                path.addPath(((im0) childAt.getBackground()).S.k, childAt.getX(), childAt.getY());
                xt5Var.a(path);
            }
        }
    }

    @Override // h27
    public final boolean f() {
        return true;
    }

    @Override // h27
    public final boolean g() {
        return this.o0;
    }

    public c6 getActionBarMenuOnItemClick() {
        return this.W;
    }

    public yja getActionMode() {
        return this.e;
    }

    public float getActionModeFactor() {
        return this.U.e;
    }

    public io getActionModeTitle() {
        q();
        return this.f;
    }

    public View getBackButton() {
        return this.b;
    }

    public Drawable getBackButtonDrawable() {
        return (Drawable) this.b.b;
    }

    @Override // h27
    public int getButtonsGlassBackgroundColor() {
        am0 am0Var = this.O;
        if (am0Var == null) {
            am0Var = this.N;
        }
        if (am0Var != null) {
            return am0Var.K1();
        }
        return 0;
    }

    @Override // h27
    public am0 getButtonsGlassColorProvider() {
        am0 am0Var = this.O;
        return am0Var != null ? am0Var : this.N;
    }

    public uja getDoneButton() {
        return this.n;
    }

    public int getExtraHeight() {
        return this.b0;
    }

    public yja getMenu() {
        return this.d;
    }

    @Override // h27
    public int getMenuAnchorTint() {
        return 0;
    }

    @Override // h27
    public int getMenuDimAlpha() {
        return -1;
    }

    @Override // h27
    public int getMenuExtraBelow() {
        return 0;
    }

    @Override // h27
    public am0 getMenuGlassColorProvider() {
        return this.N;
    }

    @Override // h27
    public int getMenuMaxHeight() {
        return 0;
    }

    public bka getMenuOverlay() {
        iac iacVar = this.Q;
        if (iacVar != null) {
            return (bka) iacVar.run();
        }
        return null;
    }

    public float getMenuPillLeft() {
        RectF rectF = this.r0;
        p(rectF);
        return rectF.left;
    }

    @Override // h27
    public ylb getMenuResourcesProvider() {
        return this.a;
    }

    @Override // h27
    public int getMenuRise() {
        return 0;
    }

    @Override // h27
    public View getMenuView() {
        return this.d;
    }

    public boolean getOccupyStatusBar() {
        return this.a0;
    }

    @Override // h27
    public bka getOpenMenuOverlay() {
        return this.R;
    }

    public float getSearchFactor() {
        return this.T.e;
    }

    public EditTextBoldCursor getSearchField() {
        u();
        return this.s;
    }

    public String getSubtitle() {
        CharSequence charSequence = (CharSequence) this.c.f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public lka getSubtitleTextView() {
        return (lka) this.c.d;
    }

    public String getTitle() {
        lka lkaVar = ((lka[]) this.c.c)[0];
        CharSequence text = lkaVar != null ? lkaVar.getText() : null;
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        c88 c88Var = this.c;
        c88Var.b(0);
        return ((lka[]) c88Var.c)[0].getTextPaint().getFontMetricsInt();
    }

    public lka getTitleTextView() {
        return ((lka[]) this.c.c)[0];
    }

    public lka getTitleTextView2() {
        return ((lka[]) this.c.c)[1];
    }

    public float getTitlesAlpha() {
        return this.w0;
    }

    @Override // h27
    public final boolean h() {
        return false;
    }

    @Override // h27
    public final im0 i(bka bkaVar) {
        km0 km0Var = this.p0;
        if (km0Var == null) {
            km0Var = this.M;
        }
        if (km0Var == null) {
            return null;
        }
        im0 c = km0Var.c(bkaVar, null, false);
        c.p(this.N);
        wi8.r(c, gm.L(23.0f), 6.0f);
        return c;
    }

    public final void k(View view, xt5 xt5Var) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        float height = (view.getHeight() / 2.0f) + view.getY();
        float scaleX = view.getScaleX() * (view.getWidth() / 2.0f);
        float scaleY = view.getScaleY() * (view.getHeight() / 2.0f);
        RectF rectF = this.t0;
        rectF.set(width - scaleX, height - scaleY, width + scaleX, height + scaleY);
        Path path = this.s0;
        path.rewind();
        path.addRoundRect(rectF, scaleY, scaleY, Path.Direction.CW);
        xt5Var.a(path);
    }

    public final void l() {
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        float f = 1.0f - actionModeFactor;
        float f2 = searchFactor * f;
        float f3 = (1.0f - searchFactor) * f;
        float f4 = this.w0 * f3;
        float R1 = gm.R1(1.0f, 0.94f, Math.max(searchFactor, actionModeFactor));
        c88 c88Var = this.c;
        G(c88Var, f4);
        c88Var.setScaleX(R1);
        c88Var.setScaleY(R1);
        uja ujaVar = this.n;
        if (ujaVar != null) {
            float visibleFactor = ujaVar.getVisibleFactor() * f3;
            G(this.n, visibleFactor);
            float R12 = this.n.c == tja.a ? gm.R1(0.6f, 1.0f, visibleFactor) : gm.R1(0.8f, 1.0f, f3);
            this.n.setScaleX(R12);
            this.n.setScaleY(R12);
        }
        yja yjaVar = this.d;
        if (yjaVar != null) {
            yjaVar.setTranslationX(-v(false));
            G(this.d, f3);
            float R13 = gm.R1(0.7f, 1.0f, f3);
            this.d.setPivotX(r11.getWidth() - gm.L(19.0f));
            this.d.setPivotY(r11.getHeight() / 2.0f);
            this.d.setScaleX(R13);
            this.d.setScaleY(R13);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!z(childAt) && childAt.getVisibility() != 8) {
                G(childAt, f3);
            }
        }
        yja yjaVar2 = this.e;
        if (yjaVar2 != null) {
            G(yjaVar2, actionModeFactor);
            float R14 = gm.R1(0.7f, 1.0f, actionModeFactor);
            this.e.setPivotX(r5.getWidth() - gm.L(19.0f));
            this.e.setPivotY(r5.getHeight() / 2.0f);
            this.e.setScaleX(R14);
            this.e.setScaleY(R14);
        }
        io ioVar = this.f;
        if (ioVar != null) {
            G(ioVar, actionModeFactor);
            this.f.setTranslationX((-gm.L(16.0f)) * f);
        }
        io ioVar2 = this.h;
        if (ioVar2 != null) {
            G(ioVar2, actionModeFactor);
            this.h.setTranslationX((-gm.L(16.0f)) * f);
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            G(frameLayout, f2);
            RectF rectF = this.r0;
            p(rectF);
            this.r.setTranslationX(Math.max(0.0f, rectF.left - getSearchPillLeft()));
        }
        pja pjaVar = this.b;
        if (((Drawable) pjaVar.b) != null) {
            pjaVar.setVisibility(0);
            pjaVar.setAlpha(1.0f);
            pjaVar.setScaleX(1.0f);
            pjaVar.setScaleY(1.0f);
        } else {
            pjaVar.setVisibility(actionModeFactor <= 0.0f ? 8 : 0);
            pjaVar.setAlpha(actionModeFactor);
            pjaVar.setScaleX(gm.R1(0.6f, 1.0f, actionModeFactor));
            pjaVar.setScaleY(gm.R1(0.6f, 1.0f, actionModeFactor));
        }
        pjaVar.invalidate();
        invalidate();
    }

    public final void m() {
        TextView textView;
        if (this.s == null) {
            return;
        }
        n7 searchListener = getSearchListener();
        boolean z = this.s.length() > 0 || ((textView = this.x) != null && textView.getVisibility() == 0 && (searchListener == null || searchListener.m())) || (searchListener != null && searchListener.d());
        this.V.a(z, y() && this.G);
        this.w.setEnabled(z);
    }

    public final void n() {
        n7 searchListener = getSearchListener();
        if (searchListener == null || searchListener.a()) {
            this.x.setVisibility(8);
            m();
            if (searchListener != null) {
                searchListener.f();
            }
        }
    }

    public final void o(boolean z) {
        if (this.G) {
            n7 searchListener = getSearchListener();
            if (searchListener == null || searchListener.b()) {
                this.G = false;
                this.s.clearFocus();
                if (z) {
                    gm.t1(this.s);
                }
                this.T.a(false, y());
                l();
                if (searchListener != null) {
                    searchListener.h();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d0 = true;
        nm7.e().b(this, nm7.r4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d0 = false;
        this.c0 = false;
        nm7.e().n(this, nm7.r4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int g;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        int rowTop = getRowTop();
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        int i7 = i3 - i;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (!z(childAt) && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.gravity, getLayoutDirection()) & 7;
                if (absoluteGravity == 5) {
                    g = i7 - measuredWidth;
                    i6 = layoutParams.rightMargin;
                } else {
                    int i9 = layoutParams.leftMargin;
                    if (absoluteGravity == 1) {
                        g = wi8.g(i7, measuredWidth, 2, i9);
                        i6 = layoutParams.rightMargin;
                    } else {
                        i5 = i9;
                        int g2 = (wi8.g(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                        childAt.layout(i5, g2, measuredWidth + i5, measuredHeight + g2);
                    }
                }
                i5 = g - i6;
                int g22 = (wi8.g(currentActionBarHeight, measuredHeight, 2, rowTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                childAt.layout(i5, g22, measuredWidth + i5, measuredHeight + g22);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int rowTop = getRowTop();
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        int i3 = rowTop + currentActionBarHeight + this.b0;
        pja pjaVar = this.b;
        boolean z = ((Drawable) pjaVar.b) != null;
        int L = ((currentActionBarHeight - gm.L(46.0f)) / 2) + rowTop;
        H(pjaVar, gm.L(6.0f), L, 0);
        yja yjaVar = this.d;
        float targetPillWidth = (yjaVar == null || yjaVar.getVisibility() == 8) ? 0.0f : this.d.getTargetPillWidth();
        float v = v(true);
        int max = Math.max(Math.max(z ? gm.L(64.0f) : gm.L(18.0f), (targetPillWidth > 0.0f || v > 0.0f) ? gm.L(18.0f) + ((int) (targetPillWidth + v)) : 0), this.u0);
        c88 c88Var = this.c;
        if (c88Var.b != max) {
            c88Var.b = max;
            c88Var.requestLayout();
        }
        H(c88Var, 0, rowTop, 0);
        c88Var.getLayoutParams().height = currentActionBarHeight;
        yja yjaVar2 = this.d;
        if (yjaVar2 != null) {
            H(yjaVar2, 0, rowTop, gm.L(10.0f));
            this.d.getLayoutParams().height = currentActionBarHeight;
        }
        yja yjaVar3 = this.e;
        if (yjaVar3 != null) {
            H(yjaVar3, 0, rowTop, gm.L(10.0f));
            this.e.getLayoutParams().height = currentActionBarHeight;
        }
        if (this.f != null) {
            yja yjaVar4 = this.e;
            int L2 = gm.L(18.0f) + ((int) (yjaVar4 != null ? yjaVar4.getTargetPillWidth() : 0.0f));
            io ioVar = this.h;
            boolean z2 = (ioVar == null || ioVar.getTag() == null) ? false : true;
            io ioVar2 = this.f;
            if (z2) {
                int i4 = (currentActionBarHeight / 2) + rowTop;
                H(ioVar2, gm.L(66.0f), i4 - gm.L(22.0f), L2);
                this.f.getLayoutParams().height = gm.L(22.0f);
                H(this.h, gm.L(66.0f), gm.L(1.0f) + i4, L2);
                this.h.getLayoutParams().height = gm.L(18.0f);
            } else {
                H(ioVar2, gm.L(66.0f), rowTop, L2);
                this.f.getLayoutParams().height = currentActionBarHeight;
            }
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            H(frameLayout, (int) getSearchPillLeft(), L, gm.L(6.0f));
        }
        uja ujaVar = this.n;
        if (ujaVar != null) {
            H(ujaVar, 0, L, gm.L(6.0f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return !this.v0;
    }

    public final float p(RectF rectF) {
        float f;
        float f2;
        float f3;
        int L = gm.L(6.0f);
        float L2 = gm.L(23.0f);
        float currentActionBarHeight = (a.getCurrentActionBarHeight() / 2.0f) + getRowTop();
        float searchFactor = getSearchFactor();
        float actionModeFactor = getActionModeFactor();
        yja yjaVar = this.d;
        float pillWidth = (yjaVar == null || yjaVar.getVisibility() == 8) ? 0.0f : this.d.getPillWidth();
        yja yjaVar2 = this.e;
        float pillWidth2 = yjaVar2 != null ? yjaVar2.getPillWidth() : 0.0f;
        if (pillWidth <= 0.0f) {
            f = actionModeFactor;
            pillWidth = pillWidth2;
        } else if (pillWidth2 <= 0.0f) {
            f = 1.0f - actionModeFactor;
        } else {
            pillWidth = gm.R1(pillWidth, pillWidth2, actionModeFactor);
            f = 1.0f;
        }
        float f4 = (1.0f - actionModeFactor) * searchFactor;
        float f5 = L2 * 2.0f;
        float f6 = pillWidth / f5;
        float R1 = gm.R1(0.8f, 1.0f, f) * Math.min(1.0f, f6);
        float width = (getWidth() - L) - v(false);
        float max = width - Math.max(pillWidth, f5);
        float f7 = currentActionBarHeight - L2;
        float f8 = currentActionBarHeight + L2;
        if (R1 < 1.0f) {
            float f9 = (max + width) / 2.0f;
            float B = kt6.B(1.0f, R1, L2, (width - max) / 2.0f);
            float f10 = f9 - B;
            width = f9 + B;
            float f11 = L2 * R1;
            float f12 = currentActionBarHeight - f11;
            f3 = currentActionBarHeight + f11;
            f2 = f12;
            max = f10;
        } else {
            f2 = f7;
            f3 = f8;
        }
        rectF.set(gm.R1(max, getSearchPillLeft(), f4), gm.R1(f2, f7, f4), gm.R1(width, getWidth() - L, f4), gm.R1(f3, f8, f4));
        return gm.R1(Math.min(1.0f, f6) * f, 1.0f, f4);
    }

    public final yja q() {
        if (this.e == null) {
            yja yjaVar = new yja(getContext(), this, true);
            this.e = yjaVar;
            View view = this.b;
            addView(yjaVar, indexOfChild(view), qoe.e(-2, -2, 53));
            io ioVar = new io(getContext(), true, true, true);
            this.f = ioVar;
            ioVar.setTextSize(gm.L(18.0f));
            this.f.setTypeface(gm.o());
            this.f.setTextColor(this.h0);
            this.f.setGravity(19);
            this.f.setEllipsizeByGradient(true);
            this.f.b(0.6f, 320L, d53.h);
            addView(this.f, indexOfChild(view), qoe.e(-1, -2, 51));
            l();
        }
        return this.e;
    }

    public final void r() {
        km0 km0Var = this.P;
        if (km0Var == null) {
            km0Var = this.M;
        }
        if (km0Var == null) {
            return;
        }
        am0 am0Var = this.O;
        if (am0Var == null) {
            am0Var = this.N;
        }
        im0 c = km0Var.c(this, null, false);
        c.p(am0Var);
        wi8.r(c, gm.L(23.0f), 6.0f);
        this.I = c;
        im0 c2 = km0Var.c(this, null, false);
        c2.p(am0Var);
        wi8.r(c2, gm.L(23.0f), 6.0f);
        this.J = c2;
        im0 c3 = km0Var.c(this, null, false);
        c3.p(am0Var);
        wi8.r(c3, gm.L(23.0f), 6.0f);
        this.K = c3;
        this.L = gm.L(23.0f);
        invalidate();
    }

    public final uja s(String str) {
        if (this.n == null) {
            uja ujaVar = new uja(getContext(), this, str);
            this.n = ujaVar;
            addView(ujaVar, indexOfChild(this.b), qoe.e(-2, 46, 53));
            l();
        }
        return this.n;
    }

    public void setActionBarMenuOnItemClick(c6 c6Var) {
        this.W = c6Var;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        this.b.setContentDescription(charSequence);
    }

    public void setBackButtonDrawable(Drawable drawable) {
        this.b.c(drawable);
        l();
        requestLayout();
    }

    public void setBackButtonImage(int i) {
        setBackButtonDrawable(i != 0 ? getContext().getDrawable(i).mutate() : null);
    }

    public void setBackButtonImageAnimated(int i) {
        Drawable mutate = getContext().getDrawable(i).mutate();
        pja pjaVar = this.b;
        Drawable drawable = (Drawable) pjaVar.b;
        boolean z = drawable != null;
        h94 h94Var = (h94) pjaVar.f;
        if (drawable == null || !((rja) pjaVar.h).y()) {
            pjaVar.c(mutate);
        } else {
            Drawable drawable2 = (Drawable) pjaVar.b;
            pjaVar.c(mutate);
            pjaVar.c = drawable2;
            h94Var.c(0.0f);
            h94Var.a(1.0f);
        }
        if (z) {
            return;
        }
        l();
        requestLayout();
    }

    public void setButtonsGlass(km0 km0Var) {
        this.P = km0Var;
        if (this.M != null) {
            r();
        }
    }

    public void setButtonsGlassColorProvider(am0 am0Var) {
        this.O = am0Var;
        if (am0Var == null) {
            am0Var = this.N;
        }
        im0 im0Var = this.I;
        if (im0Var != null) {
            im0Var.p(am0Var);
            this.J.p(am0Var);
            this.K.p(am0Var);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setEnabled(z);
        yja yjaVar = this.d;
        if (yjaVar != null) {
            yjaVar.setEnabled(z);
        }
        uja ujaVar = this.n;
        if (ujaVar != null) {
            ujaVar.setEnabled(z);
        }
    }

    public void setExtraHeight(int i) {
        if (this.b0 != i) {
            this.b0 = i;
            requestLayout();
        }
    }

    public void setForceSkipTouches(boolean z) {
        this.v0 = z;
    }

    @Override // h27
    public void setMenuGlassFrostedProgress(float f) {
        lz4 lz4Var = this.q0;
        if (lz4Var != null) {
            lz4Var.k(f);
        }
    }

    public void setMenuGlassStroke(boolean z) {
        this.o0 = z;
    }

    public void setMenuOverlayProvider(iac iacVar) {
        this.Q = iacVar;
    }

    public void setOccupyStatusBar(boolean z) {
        if (this.a0 != z) {
            this.a0 = z;
            requestLayout();
        }
    }

    public void setSearchFieldCaption(CharSequence charSequence) {
        u();
        this.x.setText(charSequence);
        this.x.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        m();
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.E = charSequence;
        l7 l7Var = this.s;
        if (l7Var != null) {
            l7Var.setHint(charSequence);
        }
    }

    public void setSearchFieldText(CharSequence charSequence) {
        l7 l7Var = this.s;
        if (l7Var == null) {
            this.F = charSequence;
            return;
        }
        l7Var.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.s.setSelection(charSequence.length());
    }

    public void setSearchItem(zja zjaVar) {
        if (zjaVar == null && this.y != null && this.G) {
            o(true);
        }
        this.y = zjaVar;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.c.c(charSequence);
    }

    public void setSubtitleAnimated(CharSequence charSequence) {
        if (!y()) {
            setSubtitle(charSequence);
            return;
        }
        c88 c88Var = this.c;
        lka lkaVar = (lka) c88Var.d;
        if (lkaVar == null || lkaVar.getVisibility() == 8 || TextUtils.isEmpty(charSequence) || TextUtils.equals((CharSequence) c88Var.f, charSequence)) {
            if (TextUtils.equals((CharSequence) c88Var.f, charSequence)) {
                return;
            }
            c88Var.c(charSequence);
            return;
        }
        c88Var.f = charSequence;
        lka lkaVar2 = (lka) c88Var.e;
        if (lkaVar2 == null) {
            lkaVar2 = c88Var.a();
            c88Var.e = lkaVar2;
        }
        lka lkaVar3 = (lka) c88Var.d;
        c88Var.d = lkaVar2;
        c88Var.e = lkaVar3;
        lkaVar2.animate().cancel();
        ((lka) c88Var.d).l(charSequence, false);
        ((lka) c88Var.d).setVisibility(0);
        ((lka) c88Var.d).setAlpha(0.0f);
        ((lka) c88Var.d).setTranslationY(gm.L(6.0f));
        ViewPropertyAnimator duration = ((lka) c88Var.d).animate().alpha(1.0f).translationY(0.0f).setDuration(380L);
        d53 d53Var = d53.h;
        duration.setInterpolator(d53Var).start();
        lkaVar3.animate().cancel();
        lkaVar3.animate().alpha(0.0f).translationY(-gm.L(6.0f)).setDuration(380L).setInterpolator(d53Var).withEndAction(new qja(lkaVar3, (byte) 0)).start();
        c88Var.requestLayout();
    }

    public void setSubtitleColor(int i) {
        this.l0 = true;
        this.f0 = i;
        this.c.d();
    }

    public void setTitle(CharSequence charSequence) {
        c88 c88Var = this.c;
        c88Var.b(0);
        lka[] lkaVarArr = (lka[]) c88Var.c;
        lka lkaVar = lkaVarArr[1];
        if (lkaVar != null) {
            lkaVar.animate().cancel();
            lkaVarArr[1].setVisibility(8);
        }
        lkaVarArr[0].animate().cancel();
        lkaVarArr[0].setAlpha(1.0f);
        lkaVarArr[0].setTranslationY(0.0f);
        lkaVarArr[0].k(charSequence);
        lkaVarArr[0].setVisibility(TextUtils.isEmpty(charSequence) ? 4 : 0);
    }

    public void setTitleColor(int i) {
        this.k0 = true;
        this.e0 = i;
        this.c.d();
    }

    public void setTitleMinSideInset(int i) {
        if (this.u0 != i) {
            this.u0 = i;
            requestLayout();
        }
    }

    public void setTitlesAlpha(float f) {
        if (this.w0 != f) {
            this.w0 = f;
            l();
        }
    }

    public final yja t() {
        if (this.d == null) {
            yja yjaVar = new yja(getContext(), this, false);
            this.d = yjaVar;
            addView(yjaVar, indexOfChild(this.b), qoe.e(-2, -2, 53));
            l();
        }
        return this.d;
    }

    public final void u() {
        if (this.r != null) {
            return;
        }
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(4);
        addView(this.r, indexOfChild(this.b), qoe.e(-1, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        this.r.addView(linearLayout, qoe.d(-1, -1.0f, 51, 18.0f, 0.0f, 42.0f, 0.0f));
        TextView textView = new TextView(context);
        this.x = textView;
        byte b = 1;
        textView.setTextSize(1, 17.0f);
        this.x.setSingleLine(true);
        this.x.setEllipsize(TextUtils.TruncateAt.END);
        this.x.setGravity(19);
        this.x.setPadding(0, 0, gm.L(4.0f), 0);
        this.x.setVisibility(8);
        linearLayout.addView(this.x, qoe.o(-2, -1));
        l7 l7Var = new l7((byte) 7, context, this);
        this.s = l7Var;
        l7Var.setTextSize(1, 17.0f);
        this.s.setSingleLine(true);
        this.s.setBackground(null);
        this.s.setPadding(0, 0, 0, 0);
        this.s.setGravity(19);
        l7 l7Var2 = this.s;
        l7Var2.setInputType(l7Var2.getInputType() | TLObject.FLAG_19);
        this.s.setImeOptions(33554435);
        this.s.setTextIsSelectable(false);
        this.s.setCursorSize(gm.L(20.0f));
        this.s.setCursorWidth(1.5f);
        CharSequence charSequence = this.E;
        if (charSequence != null) {
            this.s.setHint(charSequence);
        }
        this.s.setOnEditorActionListener(new j(this, (byte) 26));
        this.s.addTextChangedListener(new og6(this, (byte) 14));
        linearLayout.addView(this.s, qoe.l(1.0f, 0, -1));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.w.setImageResource(R.drawable.ic_close_white);
        this.w.setContentDescription(jb6.M0(2131752036, null));
        this.w.setOnClickListener(new oja(this, b));
        this.r.addView(this.w, qoe.d(42, 42.0f, 21, 0.0f, 0.0f, 2.0f, 0.0f));
        K();
        m();
        D(2, this.V.e, 0.0f, null);
    }

    @Override // vlb
    public final void updateColors() {
        E();
        this.c.d();
        this.b.d();
        yja yjaVar = this.d;
        if (yjaVar != null) {
            yjaVar.h();
        }
        yja yjaVar2 = this.e;
        if (yjaVar2 != null) {
            yjaVar2.h();
        }
        io ioVar = this.f;
        if (ioVar != null) {
            ioVar.setTextColor(this.h0);
        }
        uja ujaVar = this.n;
        if (ujaVar != null) {
            ujaVar.c();
        }
        io ioVar2 = this.h;
        if (ioVar2 != null) {
            ioVar2.setTextColor(this.f0);
        }
        if (this.s != null) {
            K();
        }
        im0 im0Var = this.I;
        if (im0Var != null) {
            im0Var.updateColors();
        }
        im0 im0Var2 = this.J;
        if (im0Var2 != null) {
            im0Var2.updateColors();
        }
        invalidate();
    }

    public final float v(boolean z) {
        float actionModeFactor;
        uja ujaVar = this.n;
        if (ujaVar == null) {
            return 0.0f;
        }
        if (ujaVar.getVisibility() == 8 && z) {
            return 0.0f;
        }
        uja ujaVar2 = this.n;
        if (z) {
            actionModeFactor = ujaVar2.getTargetVisibleFactor();
        } else {
            actionModeFactor = (1.0f - getActionModeFactor()) * (1.0f - getSearchFactor()) * ujaVar2.getVisibleFactor();
        }
        return (gm.L(12.0f) + this.n.getButtonWidth()) * actionModeFactor;
    }

    public final void w() {
        yja yjaVar = this.e;
        if (yjaVar == null || !this.H) {
            return;
        }
        this.H = false;
        yjaVar.f();
        this.U.a(false, y());
        l();
        this.b.b(false, y());
        nm7.e().k(nm7.v4, new Object[0]);
    }

    public final boolean x() {
        return this.e != null && this.H;
    }

    public final boolean y() {
        return this.c0 && this.d0;
    }

    public final boolean z(View view) {
        return view == this.b || view == this.c || view == this.d || view == this.e || view == this.f || view == this.h || view == this.r || view == this.n;
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // h27
    public View getMenuHostView() {
        return this;
    }

    @Override // g94
    public final void V(float f, int i) {
    }
}
