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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class x10 extends org.telegram.ui.ActionBar.o2 {
    public int A;
    public f2.m0 B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public final Paint G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public final u10 a;
    public final u10 b;
    public org.telegram.ui.Components.wk0 c;
    public Drawable d;
    public zf.w1 e;
    public boolean f;
    public boolean h;
    public float n;
    public int r;
    public w10 s;
    public float v;
    public final Canvas w;
    public float x;
    public fg.a y;

    public x10() {
        super(null);
        int i9 = org.telegram.ui.ActionBar.f6.Pj;
        int i10 = org.telegram.ui.ActionBar.f6.Qj;
        int i11 = org.telegram.ui.ActionBar.f6.Rj;
        int i12 = org.telegram.ui.ActionBar.f6.Sj;
        this.a = new u10(i9, i10, i11, i12, null, 0);
        u10 u10Var = new u10(i9, i10, i11, i12, null, 1);
        this.b = u10Var;
        this.w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.A = -1;
        this.C = true;
        this.G = new Paint();
        u10Var.n = true;
        this.J = -1;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public View createView(Context context) {
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.h5), PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        this.E = (b5Var == null || !((ActionBarLayout) b5Var).I0) ? AndroidUtilities.statusBarHeight : 0;
        this.s = n0();
        org.telegram.ui.ActionBar.b5 b5Var2 = this.parentLayout;
        if (b5Var2 != null && ((ActionBarLayout) b5Var2).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.c = new org.telegram.ui.Components.wk0(context, null);
        if (this.C) {
            this.B = new org.telegram.ui.Components.bz(this.c, (AndroidUtilities.dp(68.0f) + this.E) - AndroidUtilities.dp(16.0f));
        } else {
            this.B = new f2.m0();
        }
        this.c.setLayoutManager(this.B);
        f2.m0 m0Var = this.B;
        if (m0Var instanceof org.telegram.ui.Components.bz) {
            ((org.telegram.ui.Components.bz) m0Var).R = true;
        }
        f2.r0 m0 = m0();
        this.c.setAdapter(m0);
        if (m0 instanceof org.telegram.ui.Components.z41) {
            org.telegram.ui.Components.wk0 wk0Var = this.c;
            t10 t10Var = new t10(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            org.telegram.ui.Components.wk0 wk0Var2 = this.c;
            Objects.requireNonNull(wk0Var2);
            wk0Var.r1(t10Var, dp, dp2, new wt(wk0Var2, 10), true);
        } else {
            this.c.setSections(true);
        }
        this.c.setClipToPadding(false);
        this.c.j(new l3(this, 11));
        this.y = new fg.a(context);
        w10 w10Var = this.s;
        zf.w1 o02 = o0();
        this.e = o02;
        w10Var.addView(o02, g7.e6.c(-2.0f, -1));
        this.s.addView(this.y, g7.e6.c(-2.0f, -1));
        this.s.addView(this.c, g7.e6.c(-1.0f, -1));
        this.s.addView(this.actionBar);
        this.fragmentView = this.s;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 20));
        this.actionBar.setForceSkipTouches(true);
        u0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        return g7.h6.a(new e(this, 15), org.telegram.ui.ActionBar.f6.Lj, org.telegram.ui.ActionBar.f6.Mj, org.telegram.ui.ActionBar.f6.Nj, org.telegram.ui.ActionBar.f6.Oj, org.telegram.ui.ActionBar.f6.Pj, org.telegram.ui.ActionBar.f6.Qj, org.telegram.ui.ActionBar.f6.Rj, org.telegram.ui.ActionBar.f6.Sj, org.telegram.ui.ActionBar.f6.Tj, org.telegram.ui.ActionBar.f6.Vj, org.telegram.ui.ActionBar.f6.Wj, org.telegram.ui.ActionBar.f6.Uj, org.telegram.ui.ActionBar.f6.Zj);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return this.I && !org.telegram.ui.ActionBar.f6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void k0() {
        org.telegram.ui.Components.wk0 wk0Var = this.c;
        if (wk0Var == null || this.B == null || this.J < 0) {
            return;
        }
        int i9 = this.K;
        wk0Var.K(0);
        this.B.h1(this.J, i9);
        this.J = -1;
    }

    public final void l0(String str, CharSequence charSequence, FrameLayout frameLayout, s5 s5Var) {
        fg.a aVar = this.y;
        FrameLayout frameLayout2 = (FrameLayout) aVar.e;
        FrameLayout frameLayout3 = (FrameLayout) aVar.d;
        ((TextView) aVar.b).setText(str);
        org.telegram.ui.Components.l80 l80Var = (org.telegram.ui.Components.l80) aVar.c;
        l80Var.setText(charSequence);
        l80Var.setMaxWidth(kh.x3.a(l80Var.getText(), l80Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, g7.e6.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (s5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(s5Var, g7.e6.e(-1, -2, 1));
            frameLayout2.setClickable(s5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        aVar.requestLayout();
    }

    public abstract f2.r0 m0();

    public w10 n0() {
        return new w10(this, getParentActivity());
    }

    public zf.w1 o0() {
        return new mh.f(getParentActivity(), 2);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        v0(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public void onInsets(int i9, int i10, int i11, int i12) {
        this.c.setPadding(0, 0, 0, i12);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public void onPause() {
        super.onPause();
        zf.w1 w1Var = this.e;
        if (w1Var != null) {
            w1Var.setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public void onResume() {
        super.onResume();
        this.e.setPaused(false);
    }

    public boolean p0() {
        return true;
    }

    public View q0(Context context) {
        fh.l2 l2Var = new fh.l2(this, context, 28);
        l2Var.setTag(-33024);
        return l2Var;
    }

    public final void r0() {
        View view;
        int i9;
        org.telegram.ui.Components.wk0 wk0Var = this.c;
        if (wk0Var == null || wk0Var.getChildCount() <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.c.getChildCount()) {
                view = null;
                i9 = -1;
                break;
            }
            view = this.c.getChildAt(i10);
            this.c.getClass();
            i9 = RecyclerView.R(view);
            if (i9 >= 0 && view.getTop() < Integer.MAX_VALUE) {
                view.getTop();
                break;
            }
            i10++;
        }
        if (view != null) {
            this.J = i9;
            this.K = view.getTop();
        }
    }

    public final Paint s0(float f10, float f11) {
        int measuredWidth = this.s.getMeasuredWidth();
        int measuredHeight = this.s.getMeasuredHeight();
        u10 u10Var = this.b;
        u10Var.d(0, (-f10) - ((this.s.getMeasuredWidth() * 0.1f) * this.n), 0, measuredWidth, -f11, measuredHeight);
        return u10Var.f;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final Dialog showDialog(Dialog dialog) {
        Dialog showDialog = super.showDialog(dialog);
        v0(showDialog != null);
        return showDialog;
    }

    public final void t0() {
        if (this.s.getMeasuredWidth() == 0 || this.s.getMeasuredHeight() == 0 || this.y == null) {
            return;
        }
        int measuredWidth = this.s.getMeasuredWidth();
        int measuredHeight = this.s.getMeasuredHeight();
        u10 u10Var = this.a;
        u10Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
        Canvas canvas = this.w;
        canvas.save();
        canvas.scale(100.0f / this.s.getMeasuredWidth(), 100.0f / this.s.getMeasuredHeight());
        canvas.drawRect(0.0f, 0.0f, this.s.getMeasuredWidth(), this.s.getMeasuredHeight(), u10Var.f);
        canvas.restore();
    }

    public final void u0() {
        if (this.y == null || this.actionBar == null) {
            return;
        }
        this.G.setColor(getThemedColor(org.telegram.ui.ActionBar.f6.h5));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.Tj;
        kVar.C(org.telegram.ui.ActionBar.f6.w0(null, i9, false), false);
        this.actionBar.A(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i9, false), 60), false);
        this.e.a.g();
        fg.a aVar = this.y;
        if (aVar != null) {
            TextView textView = (TextView) aVar.b;
            if (this.I) {
                int i10 = org.telegram.ui.ActionBar.f6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
                ((org.telegram.ui.Components.l80) this.y.c).setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
                ((org.telegram.ui.Components.l80) this.y.c).setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.gc, false));
            } else {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
                ((org.telegram.ui.Components.l80) this.y.c).setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
                ((org.telegram.ui.Components.l80) this.y.c).setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.gc, false));
            }
        }
        t0();
    }

    public final void v0(boolean z10) {
        if (z10 != this.f) {
            this.f = z10;
            this.e.setPaused(z10);
            this.s.invalidate();
        }
    }
}
