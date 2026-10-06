package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public abstract class rh1 extends org.telegram.ui.ActionBar.n2 {
    public final SparseArray a;
    public k0 b;
    public qh1 c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public rh1() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void S() {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ph1 ph1Var = (ph1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (ph1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = ph1Var.a;
                if (n2Var.fragmentView != null) {
                    float r10 = this.c.r(keyAt);
                    boolean z10 = this.f;
                    float f7 = z10 ? this.e : 0.0f;
                    boolean z11 = this.h;
                    float f10 = ph1Var.f;
                    float f11 = f7 * r10;
                    ph1Var.f = f11;
                    boolean z12 = f11 > f10;
                    if (!ph1Var.d && r10 > 0.0f && z10 && n2Var.fragmentView != null) {
                        n2Var.onResume();
                        ph1Var.d = true;
                    }
                    if (!ph1Var.e && ((f10 == 0.0f || f10 == 1.0f) && f10 != f11 && Math.abs(f10 - f11) != 1.0f)) {
                        n2Var.onTransitionAnimationStart(z12, false);
                        ph1Var.e = true;
                    }
                    if (ph1Var.e && f10 != f11) {
                        n2Var.onTransitionAnimationProgress(z12, z12 ? f11 : 1.0f - f11);
                    }
                    if (ph1Var.e && (f11 == 0.0f || f11 == 1.0f)) {
                        n2Var.onTransitionAnimationEnd(z12, false);
                        ph1Var.e = false;
                    }
                    if (!ph1Var.c && f11 >= 1.0f) {
                        n2Var.onBecomeFullyVisible();
                        ph1Var.c = true;
                    }
                    if (ph1Var.c && ((f11 == 0.0f && !z11) || r10 == 0.0f)) {
                        n2Var.onBecomeFullyHidden();
                        ph1Var.c = false;
                    }
                    if (ph1Var.d && ((f11 == 0.0f && !z10) || r10 == 0.0f)) {
                        n2Var.onPause();
                        ph1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.n2 T(int i10);

    public final void U(int i10) {
        SparseArray sparseArray = this.a;
        ph1 ph1Var = (ph1) sparseArray.get(i10);
        if (ph1Var != null) {
            org.telegram.ui.ActionBar.n2 n2Var = ph1Var.a;
            if (ph1Var.c) {
                n2Var.onBecomeFullyHidden();
            }
            if (ph1Var.d) {
                n2Var.onPause();
            }
            n2Var.onFragmentDestroy();
            n2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.n2 W() {
        qh1 qh1Var = this.c;
        if (qh1Var == null) {
            return null;
        }
        ph1 ph1Var = (ph1) this.a.get(qh1Var.getCurrentPosition());
        if (ph1Var != null) {
            return ph1Var.a;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void clearViews() {
        qh1 qh1Var = this.c;
        if (qh1Var != null) {
            this.d = qh1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ph1 ph1Var = (ph1) sparseArray.valueAt(i10);
            if (ph1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = ph1Var.a;
                if (ph1Var.d) {
                    n2Var.onPause();
                    ph1Var.d = false;
                }
                n2Var.clearViews();
            }
        }
        super.clearViews();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.b = new k0((ch0) this, context, 13);
        qh1 qh1Var = new qh1(this, context);
        this.c = qh1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        qh1Var.setPosition(this.d);
        this.c.setAdapter(new cw0(this, context, 3));
        this.b.addView(this.c, w7.z5.c(-1.0f, -1));
        k0 k0Var = this.b;
        this.fragmentView = k0Var;
        jl0 jl0Var = new jl0(this, 26);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(k0Var, jl0Var);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ph1 ph1Var = (ph1) sparseArray.valueAt(i10);
            if (ph1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = ph1Var.a;
                if (n2Var.fragmentView != null) {
                    arrayList.addAll(n2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.n2 W = W();
        return (W == null || W.fragmentView == null) ? super.isLightStatusBar() : W.isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
            }
            return false;
        }
        org.telegram.ui.ActionBar.n2 W = W();
        if (W == null || W.onBackPressed(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        S();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        S();
        checkSystemBarColors();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ph1 ph1Var = (ph1) sparseArray.valueAt(i10);
            boolean z10 = ph1Var.b;
            org.telegram.ui.ActionBar.n2 n2Var = ph1Var.a;
            if (z10) {
                n2Var.onFragmentDestroy();
                n2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void onPause() {
        super.onPause();
        this.f = false;
        S();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.n2 W = W();
        if (W != null) {
            W.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void onResume() {
        super.onResume();
        this.f = true;
        checkSystemBarColors();
        S();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        if (!z10) {
            f7 = 1.0f - f7;
        }
        this.e = f7;
        S();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.n = str;
        this.r = i10;
        this.s = runnable;
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            ph1 ph1Var = (ph1) sparseArray.valueAt(i11);
            if (ph1Var != null) {
                ph1Var.a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
