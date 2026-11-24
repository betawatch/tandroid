// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Editable;
import android.text.InputFilter;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class rt3 extends FrameLayout implements gk7, bja {
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public final boolean J;
    public boolean K;
    public gb L;
    public final int M;
    public final wjb N;
    public boolean O;
    public boolean P;
    public final o1 Q;
    public boolean R;
    public float S;
    public boolean T;
    public boolean U;
    public int V;
    public final mt3 a;
    public final v31 b;
    public final l79 c;
    public nt3 d;
    public boolean e;
    public cja f;
    public final d h;
    public boolean n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public boolean y;

    public rt3(Context context, cja cjaVar, d dVar, int i, boolean z, wjb wjbVar) {
        super(context);
        this.F = true;
        this.Q = new o1(this, (byte) 28);
        this.V = 2;
        this.J = z;
        this.N = wjbVar;
        this.M = i;
        this.h = dVar;
        this.f = cjaVar;
        cjaVar.r.add(this);
        mt3 mt3Var = new mt3(this, context, wjbVar, i);
        this.a = mt3Var;
        mt3Var.setImeOptions(TLObject.FLAG_28);
        mt3Var.setInputType(mt3Var.getInputType() | TLObject.FLAG_14);
        mt3Var.setFocusable(mt3Var.isEnabled());
        mt3Var.setCursorSize(gl.L(20.0f));
        mt3Var.setCursorWidth(1.5f);
        int i2 = bkb.F6;
        zkb.l(mt3Var, 30, i2, wjbVar);
        if (i == 0) {
            mt3Var.setTextSize(1, 18.0f);
            mt3Var.setMaxLines(4);
            mt3Var.setGravity((k96.a0 ? 5 : 3) | 16);
            mt3Var.setBackground(null);
            zkb.F(mt3Var, bkb.j6, bkb.k6, bkb.o7, wjbVar);
            zkb.D(mt3Var, bkb.G6, wjbVar);
            zkb.X(mt3Var, i2, wjbVar);
            zkb.l(mt3Var, 36, bkb.lg, wjbVar);
            mt3Var.setPadding(k96.a0 ? gl.L(40.0f) : 0, 0, k96.a0 ? 0 : gl.L(40.0f), gl.L(11.0f));
            boolean z2 = k96.a0;
            addView(mt3Var, nme.d(-1, -2.0f, 19, z2 ? 11.0f : 0.0f, 1.0f, z2 ? 0.0f : 11.0f, 0.0f));
        } else if (i == 2 || i == 3) {
            mt3Var.setTextSize(1, 16.0f);
            mt3Var.setMaxLines(8);
            mt3Var.setGravity(19);
            mt3Var.setAllowTextEntitiesIntersection(true);
            mt3Var.setHintTextColor(-1929379841);
            mt3Var.setTextColor(-1);
            mt3Var.setCursorColor(-1);
            mt3Var.setBackground(null);
            mt3Var.setClipToPadding(false);
            mt3Var.setPadding(0, gl.L(9.0f), 0, gl.L(9.0f));
            mt3Var.setHandlesColor(-1);
            mt3Var.setHighlightColor(822083583);
            mt3Var.setLinkTextColor(-12147733);
            mt3Var.E = -1;
            mt3Var.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(mt3Var, nme.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i == 4) {
            mt3Var.setTextSize(1, 18.0f);
            mt3Var.setMaxLines(4);
            mt3Var.setGravity(19);
            zkb.D(mt3Var, bkb.s5, wjbVar);
            zkb.X(mt3Var, bkb.i5, wjbVar);
            mt3Var.setBackground(null);
            mt3Var.setPadding(0, gl.L(11.0f), 0, gl.L(12.0f));
            addView(mt3Var, nme.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            mt3Var.setTextSize(1, 18.0f);
            mt3Var.setMaxLines(4);
            mt3Var.setGravity(19);
            zkb.D(mt3Var, bkb.s5, wjbVar);
            zkb.X(mt3Var, bkb.i5, wjbVar);
            mt3Var.setBackground(null);
            mt3Var.setPadding(0, gl.L(11.0f), 0, gl.L(12.0f));
            addView(mt3Var, nme.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        v31 v31Var = new v31(this, context);
        this.b = v31Var;
        v31Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        l79 l79Var = new l79(context);
        this.c = l79Var;
        v31Var.setImageDrawable(l79Var);
        if (i == 0) {
            zkb.x(this, l79Var, bkb.Ne, wjbVar, PorterDuff.Mode.MULTIPLY);
            l79Var.a(R.drawable.smiles_tab_smiles, false);
            addView(v31Var, nme.d(48, 48.0f, (k96.a0 ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i == 2 || i == 3) {
            l79Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            l79Var.a(R.drawable.input_smile, false);
            addView(v31Var, nme.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i == 4) {
            zkb.x(this, l79Var, bkb.Ne, wjbVar, PorterDuff.Mode.MULTIPLY);
            l79Var.a(R.drawable.input_smile, false);
            addView(v31Var, nme.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i == 5) {
            zkb.x(this, l79Var, bkb.e7, wjbVar, PorterDuff.Mode.MULTIPLY);
            l79Var.a(R.drawable.input_smile, false);
            addView(v31Var, nme.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            zkb.x(this, l79Var, bkb.Ne, wjbVar, PorterDuff.Mode.MULTIPLY);
            l79Var.a(R.drawable.input_smile, false);
            addView(v31Var, nme.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i3 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i3, wjbVar), 1, -1);
        vkb M = zkb.M(i3);
        v31Var.setBackground(f0);
        zkb.j(v31Var, f0, null, M, wjbVar);
        v31Var.setOnClickListener(new b0(this, cjaVar, wjbVar, (byte) 28));
        v31Var.setContentDescription(k96.M0(2131751184, null));
    }

    @Override // bja
    public final void L(int i, boolean z) {
        boolean z2;
        int i2;
        if (i > gl.L(50.0f) && ((this.w || (i2 = this.M) == 2 || i2 == 3) && !gl.E && !gl.O1())) {
            if (z) {
                this.s = i;
                na7.b1().edit().putInt("kbd_height_land3", this.s).commit();
            } else {
                this.r = i;
                na7.b1().edit().putInt("kbd_height", this.r).commit();
            }
        }
        boolean z3 = false;
        if (this.e) {
            int i3 = (z ? this.s : this.r) + (this.K ? gl.n : 0);
            if (this.y) {
                i3 = Math.min(gl.L(200.0f) + i3, gl.q.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = gl.q.x;
            if (i4 != i5 || layoutParams.height != i3) {
                layoutParams.width = i5;
                layoutParams.height = i3;
                this.d.setLayoutParams(layoutParams);
                cja cjaVar = this.f;
                if (cjaVar != null) {
                    this.x = layoutParams.height;
                    cjaVar.requestLayout();
                    this.f.getHeight();
                    if (this.U != this.y) {
                        p();
                    }
                }
            }
        }
        this.U = this.y;
        int i6 = this.H;
        mt3 mt3Var = this.a;
        if (i6 == i && this.I == z) {
            if (b()) {
                if (mt3Var.isFocused() && i > 0) {
                    z3 = true;
                }
                this.w = z3;
            }
            this.f.getHeight();
            return;
        }
        this.H = i;
        this.I = z;
        boolean z4 = this.w;
        boolean z5 = mt3Var.isFocused() && i > 0;
        this.w = z5;
        if (z5 && this.e) {
            x(0);
        }
        if (this.x != 0 && !(z2 = this.w) && z2 != z4 && !this.e) {
            this.x = 0;
            this.f.requestLayout();
        }
        if (this.w && this.O) {
            this.O = false;
            gl.r(this.Q);
        }
        this.f.getHeight();
    }

    public boolean a() {
        int i = this.M;
        return i == 2 || i == 3 || i == 5;
    }

    public boolean b() {
        return this instanceof o55;
    }

    public final void d() {
        gl.t1(this.a);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k4) {
            nt3 nt3Var = this.d;
            if (nt3Var != null) {
                nt3Var.Q.h1();
            }
            mt3 mt3Var = this.a;
            if (mt3Var != null) {
                int currentTextColor = mt3Var.getCurrentTextColor();
                mt3Var.setTextColor(-1);
                mt3Var.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        nt3 nt3Var = this.d;
        if (nt3Var != null && nt3Var.d1 != y6c.t0) {
            this.f.removeView(nt3Var);
            nt3Var = null;
            this.d = null;
        }
        if (nt3Var != null) {
            return;
        }
        Context context = getContext();
        boolean b = b();
        int i = this.M;
        nt3 nt3Var2 = new nt3(this, this.h, this.J, context, b, (i == 2 || i == 3 || i == 5) ? false : true, this.N, this.T);
        this.d = nt3Var2;
        nt3Var2.c = this.V;
        nt3Var2.V0 = this.R;
        nt3Var2.setVisibility(8);
        this.S = 0.0f;
        if (gl.O1()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new pt3(this));
        this.f.addView(this.d);
    }

    public gt3 getEditText() {
        return this.a;
    }

    public View getEmojiButton() {
        return this.b;
    }

    public int getEmojiPadding() {
        return this.x;
    }

    public float getEmojiPaddingShown() {
        return this.S;
    }

    public t14 getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        Point point = gl.q;
        int i = (point.x > point.y ? this.s : this.r) + (this.K ? gl.n : 0);
        return this.y ? Math.min(gl.L(200.0f) + i, point.y) : i;
    }

    public Editable getText() {
        return this.a.getText();
    }

    public int h() {
        return vl.f();
    }

    public final void j() {
        nt3 nt3Var;
        if (!this.e && (nt3Var = this.d) != null && nt3Var.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.S = 0.0f;
        }
        this.x = 0;
        boolean z = this.y;
        this.y = false;
        if (z) {
            nt3 nt3Var2 = this.d;
            if (nt3Var2 != null) {
                nt3Var2.s(false);
            }
            y();
        }
    }

    public final void k(boolean z) {
        if (this.e) {
            x(0);
        }
        if (z) {
            nt3 nt3Var = this.d;
            if (nt3Var == null || nt3Var.getVisibility() != 0 || this.O) {
                j();
            } else {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.S = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new tw0(this, measuredHeight, (byte) 1));
                this.P = true;
                ofFloat.addListener(new im2(this, (byte) 14));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(gb.w);
                ofFloat.start();
            }
        }
        boolean z2 = this.y;
        this.y = false;
        if (z2) {
            nt3 nt3Var2 = this.d;
            if (nt3Var2 != null) {
                nt3Var2.s(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        return view == this.d;
    }

    public final boolean m() {
        nt3 nt3Var = this.d;
        return nt3Var != null && nt3Var.getVisibility() == 0;
    }

    public final int n() {
        return this.a.length();
    }

    public final void o() {
        this.E = true;
        nt3 nt3Var = this.d;
        if (nt3Var != null) {
            nt3Var.A();
        }
        cja cjaVar = this.f;
        if (cjaVar != null) {
            cjaVar.r.remove(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.e().b(this, kk7.k4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.k4);
    }

    public final void r() {
        this.F = true;
        d();
    }

    public final void s() {
        this.F = false;
        if (this.G) {
            this.G = false;
            mt3 mt3Var = this.a;
            mt3Var.requestFocus();
            gl.E3(mt3Var);
            if (gl.D || this.w || gl.E || gl.O1()) {
                return;
            }
            this.O = true;
            u();
            o1 o1Var = this.Q;
            gl.r(o1Var);
            gl.d3(o1Var, 100L);
        }
    }

    public void setAdjustPanLayoutHelper(gb gbVar) {
        this.L = gbVar;
    }

    public void setEmojiViewCacheType(int i) {
        this.V = i;
        nt3 nt3Var = this.d;
        if (nt3Var != null) {
            nt3Var.c = i;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        mt3 mt3Var = this.a;
        mt3Var.setEnabled(z);
        this.b.setVisibility(z ? 0 : 8);
        int L = gl.L(this.M == 0 ? 11.0f : 8.0f);
        if (z) {
            mt3Var.setPadding(k96.a0 ? gl.L(40.0f) : 0, 0, k96.a0 ? 0 : gl.L(40.0f), L);
        } else {
            mt3Var.setPadding(0, 0, 0, L);
        }
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.a.setFilters(inputFilterArr);
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        this.a.setFocusable(z);
    }

    public void setHint(CharSequence charSequence) {
        this.a.setHint(charSequence);
    }

    public void setMaxLines(int i) {
        this.a.setMaxLines(i);
    }

    public void setSelection(int i) {
        this.a.setSelection(i);
    }

    public void setSizeNotifierLayout(cja cjaVar) {
        cja cjaVar2 = this.f;
        if (cjaVar2 != null) {
            cjaVar2.r.remove(this);
        }
        this.f = cjaVar;
        cjaVar.r.add(this);
    }

    public void setSuggestionsEnabled(boolean z) {
        mt3 mt3Var = this.a;
        int inputType = mt3Var.getInputType();
        int i = !z ? inputType | TLObject.FLAG_19 : inputType & (-524289);
        if (mt3Var.getInputType() != i) {
            mt3Var.setInputType(i);
        }
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public boolean t(int i) {
        return true;
    }

    public final void v() {
        u();
        x((gl.D || this.F) ? 0 : 2);
        mt3 mt3Var = this.a;
        mt3Var.requestFocus();
        gl.E3(mt3Var);
        if (this.F) {
            this.G = true;
            return;
        }
        if (gl.D || this.w || gl.E || gl.O1()) {
            return;
        }
        this.O = true;
        o1 o1Var = this.Q;
        gl.r(o1Var);
        gl.d3(o1Var, 100L);
    }

    public final void w(int i, int i2) {
        this.a.setSelection(i, i2);
    }

    public final void x(int i) {
        l79 l79Var = this.c;
        if (i != 1) {
            if (this.b != null) {
                if (this.M == 0) {
                    l79Var.a(R.drawable.smiles_tab_smiles, true);
                } else {
                    l79Var.a(R.drawable.input_smile, true);
                }
            }
            if (this.d != null) {
                this.e = false;
                p();
                if (gl.D || gl.E) {
                    this.d.setVisibility(8);
                    this.S = 0.0f;
                }
            }
            cja cjaVar = this.f;
            if (cjaVar != null) {
                if (i == 0) {
                    this.x = 0;
                    this.S = 0.0f;
                }
                cjaVar.requestLayout();
                this.f.getHeight();
                return;
            }
            return;
        }
        nt3 nt3Var = this.d;
        if (nt3Var != null) {
            nt3Var.getVisibility();
        }
        f();
        this.d.setVisibility(0);
        this.e = true;
        this.S = 1.0f;
        nt3 nt3Var2 = this.d;
        if (this.r <= 0) {
            if (gl.O1()) {
                this.r = gl.L(150.0f);
            } else {
                this.r = na7.b1().getInt("kbd_height", gl.L(200.0f));
            }
        }
        int i2 = this.s;
        if (i2 <= 0) {
            if (gl.O1()) {
                i2 = gl.L(150.0f);
                this.s = i2;
            } else {
                i2 = na7.b1().getInt("kbd_height_land3", gl.L(200.0f));
                this.s = i2;
            }
        }
        Point point = gl.q;
        if (point.x <= point.y) {
            i2 = this.r;
        }
        int i3 = i2 + (this.K ? gl.n : 0);
        if (this.y) {
            i3 = Math.min(gl.L(200.0f) + i3, point.y);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) nt3Var2.getLayoutParams();
        layoutParams.height = i3;
        nt3Var2.setLayoutParams(layoutParams);
        if (!gl.E && !gl.O1()) {
            gl.t1(this.a);
        }
        cja cjaVar2 = this.f;
        if (cjaVar2 != null) {
            this.x = i3;
            cjaVar2.requestLayout();
            l79Var.a(R.drawable.input_keyboard, true);
            this.f.getHeight();
        }
        p();
        this.d.setAlpha(1.0f);
        this.S = 1.0f;
        c(0.0f);
    }

    public void e() {
    }

    public void p() {
    }

    public void u() {
    }

    public void y() {
    }

    public void c(float f) {
    }

    public void setDelegate(qt3 qt3Var) {
    }

    public void g(Canvas canvas, nt3 nt3Var) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i, int i2) {
    }

    public rt3(Context context, ay0 ay0Var, p82 p82Var) {
        this(context, ay0Var, p82Var, 0, false, null);
    }
}
