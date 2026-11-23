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
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class r00 extends org.telegram.ui.ActionBar.g2 {
    public ah.a E;
    public int F;
    public v4.c0 G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public final Paint L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public final o00 a;
    public final o00 b;
    public org.telegram.ui.Components.ek0 c;
    public Drawable d;
    public ug.t1 e;
    public boolean f;
    public boolean h;
    public float n;
    public int r;
    public q00 s;
    public float w;
    public final Canvas x;
    public float y;

    public r00() {
        super(null);
        int i7 = org.telegram.ui.ActionBar.n6.Gk;
        int i10 = org.telegram.ui.ActionBar.n6.Hk;
        int i11 = org.telegram.ui.ActionBar.n6.Ik;
        int i12 = org.telegram.ui.ActionBar.n6.Jk;
        this.a = new o00(i7, i10, i11, i12, null, 0);
        o00 o00Var = new o00(i7, i10, i11, i12, null, 1);
        this.b = o00Var;
        this.x = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.F = -1;
        this.H = true;
        this.L = new Paint();
        o00Var.n = true;
        this.Q = -1;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public View createView(Context context) {
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.h5);
        this.P = themedColor;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        int i7 = 0;
        this.J = (r4Var == null || !((ActionBarLayout) r4Var).T0) ? org.telegram.messenger.g0.m : 0;
        this.s = new q00(this, getParentActivity());
        if (this.simpleActionBar == null) {
            org.telegram.ui.ActionBar.r4 r4Var2 = this.parentLayout;
            if (r4Var2 != null && ((ActionBarLayout) r4Var2).T0) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.actionBar.setAddToContainer(false);
        }
        this.c = new org.telegram.ui.Components.ek0(context, null);
        v4.c0 l02 = l0(context);
        this.G = l02;
        this.c.setLayoutManager(l02);
        v4.c0 c0Var = this.G;
        if (c0Var instanceof org.telegram.ui.Components.vy) {
            ((org.telegram.ui.Components.vy) c0Var).R = true;
        }
        v4.i0 k02 = k0();
        this.c.setAdapter(k02);
        if (k02 instanceof org.telegram.ui.Components.b51) {
            org.telegram.ui.Components.ek0 ek0Var = this.c;
            n00 n00Var = new n00(this, i7);
            int L = org.telegram.messenger.g0.L(12.0f);
            float L2 = org.telegram.messenger.g0.L(16.0f);
            ek0Var.getClass();
            SparseIntArray sparseIntArray = new SparseIntArray();
            Pair pair = new Pair(new hi.b5(ek0Var, n00Var, sparseIntArray, 3), new org.telegram.ui.Components.vi(sparseIntArray, 2));
            ek0Var.t1((org.telegram.messenger.x10) pair.first, (org.telegram.messenger.x10) pair.second, L, L2, true);
        } else {
            this.c.setSections(true);
        }
        this.c.setClipToPadding(false);
        this.c.j(new g3(this, 12));
        this.E = new ah.a(context);
        q00 q00Var = this.s;
        ug.t1 m0 = m0();
        this.e = m0;
        q00Var.addView(m0, c8.na.c(-2.0f, -1));
        this.s.addView(this.E, c8.na.c(-2.0f, -1));
        i0();
        this.s.addView(p0());
        this.fragmentView = this.s;
        cv cvVar = new cv(this, 6);
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.setBackground(null);
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setActionBarMenuOnItemClick(cvVar);
            this.simpleActionBar.setForceSkipTouches(true);
        } else {
            this.actionBar.setBackground(null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setActionBarMenuOnItemClick(cvVar);
            this.actionBar.setForceSkipTouches(true);
        }
        x0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        return c8.ta.a(new g6(9, this), org.telegram.ui.ActionBar.n6.Ck, org.telegram.ui.ActionBar.n6.Dk, org.telegram.ui.ActionBar.n6.Ek, org.telegram.ui.ActionBar.n6.Fk, org.telegram.ui.ActionBar.n6.Gk, org.telegram.ui.ActionBar.n6.Hk, org.telegram.ui.ActionBar.n6.Ik, org.telegram.ui.ActionBar.n6.Jk, org.telegram.ui.ActionBar.n6.Kk, org.telegram.ui.ActionBar.n6.Mk, org.telegram.ui.ActionBar.n6.Nk, org.telegram.ui.ActionBar.n6.Lk, org.telegram.ui.ActionBar.n6.Qk);
    }

    public void h0() {
        org.telegram.ui.Components.ek0 ek0Var = this.c;
        if (ek0Var == null || this.G == null || this.Q < 0) {
            return;
        }
        int i7 = this.R;
        ek0Var.K(0);
        this.G.h1(this.Q, i7);
        this.Q = -1;
    }

    public void i0() {
        this.s.addView(this.c, c8.na.c(-1.0f, -1));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isLightStatusBar() {
        return this.N && !org.telegram.ui.ActionBar.n6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void j0(String str, CharSequence charSequence, FrameLayout frameLayout, r5 r5Var) {
        ah.a aVar = this.E;
        FrameLayout frameLayout2 = (FrameLayout) aVar.e;
        FrameLayout frameLayout3 = (FrameLayout) aVar.d;
        ((TextView) aVar.b).setText(str);
        org.telegram.ui.Components.j80 j80Var = (org.telegram.ui.Components.j80) aVar.c;
        j80Var.setText(charSequence);
        j80Var.setMaxWidth(hi.u3.a(j80Var.getText(), j80Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, c8.na.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (r5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(r5Var, c8.na.e(-1, -2, 1));
            frameLayout2.setClickable(r5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        aVar.requestLayout();
    }

    public abstract v4.i0 k0();

    public v4.c0 l0(Context context) {
        return this.H ? new org.telegram.ui.Components.vy((org.telegram.messenger.g0.L(68.0f) + this.J) - org.telegram.messenger.g0.L(16.0f), this.c) : new v4.c0();
    }

    public ug.t1 m0() {
        return new ki.e(getParentActivity(), 2);
    }

    public boolean n0() {
        return !(this instanceof di.pb);
    }

    public View o0(Context context) {
        tv tvVar = new tv(1, context, this);
        tvVar.setTag(-33024);
        return tvVar;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        y0(false);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public void onInsets(int i7, int i10, int i11, int i12) {
        this.c.setPadding(0, 0, 0, i12);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public void onPause() {
        super.onPause();
        ug.t1 t1Var = this.e;
        if (t1Var != null) {
            t1Var.setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public void onResume() {
        super.onResume();
        this.e.setPaused(false);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.h5);
            Drawable drawable = this.d;
            if (drawable != null && themedColor != this.P) {
                this.P = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            ug.t1 t1Var = this.e;
            if (t1Var == null || t1Var.a == null || this.s == null) {
                return;
            }
            x0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final FrameLayout p0() {
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        return z4Var != null ? z4Var : this.actionBar;
    }

    public float q0() {
        return 0.0f;
    }

    public View r0() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final Dialog showDialog(Dialog dialog) {
        Dialog showDialog = super.showDialog(dialog);
        y0(showDialog != null);
        return showDialog;
    }

    public void u0() {
        View view;
        int i7;
        org.telegram.ui.Components.ek0 ek0Var = this.c;
        if (ek0Var == null || ek0Var.getChildCount() <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.c.getChildCount()) {
                view = null;
                i7 = -1;
                break;
            }
            view = this.c.getChildAt(i10);
            this.c.getClass();
            i7 = RecyclerView.R(view);
            if (i7 >= 0 && view.getTop() < Integer.MAX_VALUE) {
                view.getTop();
                break;
            }
            i10++;
        }
        if (view != null) {
            this.Q = i7;
            this.R = view.getTop();
        }
    }

    public final Paint v0(float f10, float f11) {
        int measuredWidth = this.s.getMeasuredWidth();
        int measuredHeight = this.s.getMeasuredHeight();
        o00 o00Var = this.b;
        o00Var.d(0, (-f10) - ((this.s.getMeasuredWidth() * 0.1f) * this.n), 0, measuredWidth, -f11, measuredHeight);
        return o00Var.f;
    }

    public final void w0() {
        if (this.s.getMeasuredWidth() == 0 || this.s.getMeasuredHeight() == 0 || this.E == null) {
            return;
        }
        this.a.d(0, 0.0f, 0, this.s.getMeasuredWidth(), 0.0f, this.s.getMeasuredHeight());
        Canvas canvas = this.x;
        canvas.save();
        canvas.scale(100.0f / this.s.getMeasuredWidth(), 100.0f / this.s.getMeasuredHeight());
        canvas.drawRect(0.0f, 0.0f, this.s.getMeasuredWidth(), this.s.getMeasuredHeight(), this.a.f);
        canvas.restore();
    }

    public final void x0() {
        if (this.E != null) {
            if (this.actionBar == null && this.simpleActionBar == null) {
                return;
            }
            this.L.setColor(getThemedColor(org.telegram.ui.ActionBar.n6.h5));
            if (this.actionBar != null) {
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Kk, false);
                if (x02 != this.O) {
                    this.O = x02;
                    this.actionBar.F(x02, false);
                }
                int o4 = i0.a.o(x02, 60);
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar.q0 != o4) {
                    kVar.E(o4, false);
                }
            }
            this.e.a.g();
            ah.a aVar = this.E;
            if (aVar != null) {
                TextView textView = (TextView) aVar.b;
                if (this.N) {
                    int i7 = org.telegram.ui.ActionBar.n6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
                    ((org.telegram.ui.Components.j80) this.E.c).setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
                    ((org.telegram.ui.Components.j80) this.E.c).setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xc, false));
                } else {
                    int i10 = org.telegram.ui.ActionBar.n6.Kk;
                    textView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
                    ((org.telegram.ui.Components.j80) this.E.c).setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
                    ((org.telegram.ui.Components.j80) this.E.c).setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xc, false));
                }
            }
            w0();
        }
    }

    public final void y0(boolean z10) {
        if (z10 != this.f) {
            this.f = z10;
            this.e.setPaused(z10);
            this.s.invalidate();
        }
    }

    public boolean z0() {
        return this instanceof di.pb;
    }

    public void s0(boolean z10) {
    }

    public void t0(float f10) {
    }
}
