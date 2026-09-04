package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class r20 extends org.telegram.ui.ActionBar.n2 {
    public int E;
    public s4.c0 F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final Paint K;
    public int L;
    public boolean M;
    public int N;
    public int O;
    public final n20 a;
    public final n20 b;
    public org.telegram.ui.Components.ll0 c;
    public Drawable d;
    public sg.z1 e;
    public boolean f;
    public boolean h;
    public float n;
    public int r;
    public q20 s;
    public float v;
    public final Canvas w;
    public float x;
    public o20 y;

    public r20() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.j6.Pj;
        int i11 = org.telegram.ui.ActionBar.j6.Qj;
        int i12 = org.telegram.ui.ActionBar.j6.Rj;
        int i13 = org.telegram.ui.ActionBar.j6.Sj;
        this.a = new n20(i10, i11, i12, i13, null, 0);
        n20 n20Var = new n20(i10, i11, i12, i13, null, 1);
        this.b = n20Var;
        this.w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.E = -1;
        this.G = true;
        this.K = new Paint();
        n20Var.n = true;
        this.N = -1;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public View createView(Context context) {
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.h5), PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        this.I = (d5Var == null || !((ActionBarLayout) d5Var).M0) ? AndroidUtilities.statusBarHeight : 0;
        this.s = o0();
        org.telegram.ui.ActionBar.d5 d5Var2 = this.parentLayout;
        if (d5Var2 != null && ((ActionBarLayout) d5Var2).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.c = new org.telegram.ui.Components.ll0(context, null);
        if (this.G) {
            this.F = new org.telegram.ui.Components.pz(this.c, (AndroidUtilities.dp(68.0f) + this.I) - AndroidUtilities.dp(16.0f));
        } else {
            this.F = new s4.c0();
        }
        this.c.setLayoutManager(this.F);
        s4.c0 c0Var = this.F;
        if (c0Var instanceof org.telegram.ui.Components.pz) {
            ((org.telegram.ui.Components.pz) c0Var).R = true;
        }
        s4.h0 n02 = n0();
        this.c.setAdapter(n02);
        if (n02 instanceof org.telegram.ui.Components.v51) {
            org.telegram.ui.Components.ll0 ll0Var = this.c;
            m20 m20Var = new m20(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            org.telegram.ui.Components.ll0 ll0Var2 = this.c;
            Objects.requireNonNull(ll0Var2);
            ll0Var.q1(m20Var, dp, dp2, new iu(ll0Var2, 10), true);
        } else {
            this.c.setSections(true);
        }
        this.c.setClipToPadding(false);
        this.c.j(new i3(this, 11));
        this.y = new o20(context);
        q20 q20Var = this.s;
        sg.z1 p02 = p0();
        this.e = p02;
        q20Var.addView(p02, w7.x5.c(-2.0f, -1));
        this.s.addView(this.y, w7.x5.c(-2.0f, -1));
        this.s.addView(this.c, w7.x5.c(-1.0f, -1));
        this.s.addView(this.actionBar);
        this.fragmentView = this.s;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new ic(this, 26));
        this.actionBar.setForceSkipTouches(true);
        v0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        return w7.a6.a(new e(this, 15), org.telegram.ui.ActionBar.j6.Lj, org.telegram.ui.ActionBar.j6.Mj, org.telegram.ui.ActionBar.j6.Nj, org.telegram.ui.ActionBar.j6.Oj, org.telegram.ui.ActionBar.j6.Pj, org.telegram.ui.ActionBar.j6.Qj, org.telegram.ui.ActionBar.j6.Rj, org.telegram.ui.ActionBar.j6.Sj, org.telegram.ui.ActionBar.j6.Tj, org.telegram.ui.ActionBar.j6.Vj, org.telegram.ui.ActionBar.j6.Wj, org.telegram.ui.ActionBar.j6.Uj, org.telegram.ui.ActionBar.j6.Zj);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return this.M && !org.telegram.ui.ActionBar.j6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void l0() {
        org.telegram.ui.Components.ll0 ll0Var = this.c;
        if (ll0Var == null || this.F == null || this.N < 0) {
            return;
        }
        int i10 = this.O;
        ll0Var.K(0);
        this.F.h1(this.N, i10);
        this.N = -1;
    }

    public final void m0(String str, CharSequence charSequence, FrameLayout frameLayout, s5 s5Var) {
        o20 o20Var = this.y;
        FrameLayout frameLayout2 = (FrameLayout) o20Var.e;
        FrameLayout frameLayout3 = (FrameLayout) o20Var.d;
        ((TextView) o20Var.b).setText(str);
        org.telegram.ui.Components.d90 d90Var = (org.telegram.ui.Components.d90) o20Var.c;
        d90Var.setText(charSequence);
        d90Var.setMaxWidth(di.f4.a(d90Var.getText(), d90Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, w7.x5.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (s5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(s5Var, w7.x5.e(-1, -2, 1));
            frameLayout2.setClickable(s5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        o20Var.requestLayout();
    }

    public abstract s4.h0 n0();

    public q20 o0() {
        return new q20(this, getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        w0(false);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.c.setPadding(0, 0, 0, i13);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void onPause() {
        super.onPause();
        sg.z1 z1Var = this.e;
        if (z1Var != null) {
            z1Var.setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void onResume() {
        super.onResume();
        this.e.setPaused(false);
    }

    public sg.z1 p0() {
        return new fi.g(getParentActivity(), 2);
    }

    public boolean q0() {
        return true;
    }

    public View r0(Context context) {
        di.eb ebVar = new di.eb(this, context, 29);
        ebVar.setTag(-33024);
        return ebVar;
    }

    public final void s0() {
        View view;
        int i10;
        org.telegram.ui.Components.ll0 ll0Var = this.c;
        if (ll0Var == null || ll0Var.getChildCount() <= 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.c.getChildCount()) {
                view = null;
                i10 = -1;
                break;
            }
            view = this.c.getChildAt(i11);
            this.c.getClass();
            i10 = RecyclerView.R(view);
            if (i10 >= 0 && view.getTop() < Integer.MAX_VALUE) {
                view.getTop();
                break;
            }
            i11++;
        }
        if (view != null) {
            this.N = i10;
            this.O = view.getTop();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final Dialog showDialog(Dialog dialog) {
        Dialog showDialog = super.showDialog(dialog);
        w0(showDialog != null);
        return showDialog;
    }

    public final Paint t0(float f7, float f10) {
        int measuredWidth = this.s.getMeasuredWidth();
        int measuredHeight = this.s.getMeasuredHeight();
        n20 n20Var = this.b;
        n20Var.d(0, (-f7) - ((this.s.getMeasuredWidth() * 0.1f) * this.n), 0, measuredWidth, -f10, measuredHeight);
        return n20Var.f;
    }

    public final void u0() {
        if (this.s.getMeasuredWidth() == 0 || this.s.getMeasuredHeight() == 0 || this.y == null) {
            return;
        }
        int measuredWidth = this.s.getMeasuredWidth();
        int measuredHeight = this.s.getMeasuredHeight();
        n20 n20Var = this.a;
        n20Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
        Canvas canvas = this.w;
        canvas.save();
        canvas.scale(100.0f / this.s.getMeasuredWidth(), 100.0f / this.s.getMeasuredHeight());
        canvas.drawRect(0.0f, 0.0f, this.s.getMeasuredWidth(), this.s.getMeasuredHeight(), n20Var.f);
        canvas.restore();
    }

    public final void v0() {
        if (this.y == null || this.actionBar == null) {
            return;
        }
        this.K.setColor(getThemedColor(org.telegram.ui.ActionBar.j6.h5));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.Tj;
        kVar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.B(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 60), false);
        this.e.a.g();
        o20 o20Var = this.y;
        if (o20Var != null) {
            TextView textView = (TextView) o20Var.b;
            if (this.M) {
                int i11 = org.telegram.ui.ActionBar.j6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                ((org.telegram.ui.Components.d90) this.y.c).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                ((org.telegram.ui.Components.d90) this.y.c).setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
            } else {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                ((org.telegram.ui.Components.d90) this.y.c).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                ((org.telegram.ui.Components.d90) this.y.c).setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
            }
        }
        u0();
    }

    public final void w0(boolean z10) {
        if (z10 != this.f) {
            this.f = z10;
            this.e.setPaused(z10);
            this.s.invalidate();
        }
    }
}
