package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public abstract class qg1 extends org.telegram.ui.ActionBar.n2 {
    public final SparseArray a;
    public m0 b;
    public pg1 c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public qg1() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void U() {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            og1 og1Var = (og1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (og1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = og1Var.a;
                if (n2Var.fragmentView != null) {
                    float r10 = this.c.r(keyAt);
                    boolean z10 = this.f;
                    float f7 = z10 ? this.e : 0.0f;
                    boolean z11 = this.h;
                    float f10 = og1Var.f;
                    float f11 = f7 * r10;
                    og1Var.f = f11;
                    boolean z12 = f11 > f10;
                    if (!og1Var.d && r10 > 0.0f && z10 && n2Var.fragmentView != null) {
                        n2Var.onResume();
                        og1Var.d = true;
                    }
                    if (!og1Var.e && ((f10 == 0.0f || f10 == 1.0f) && f10 != f11 && Math.abs(f10 - f11) != 1.0f)) {
                        n2Var.onTransitionAnimationStart(z12, false);
                        og1Var.e = true;
                    }
                    if (og1Var.e && f10 != f11) {
                        n2Var.onTransitionAnimationProgress(z12, z12 ? f11 : 1.0f - f11);
                    }
                    if (og1Var.e && (f11 == 0.0f || f11 == 1.0f)) {
                        n2Var.onTransitionAnimationEnd(z12, false);
                        og1Var.e = false;
                    }
                    if (!og1Var.c && f11 >= 1.0f) {
                        n2Var.onBecomeFullyVisible();
                        og1Var.c = true;
                    }
                    if (og1Var.c && ((f11 == 0.0f && !z11) || r10 == 0.0f)) {
                        n2Var.onBecomeFullyHidden();
                        og1Var.c = false;
                    }
                    if (og1Var.d && ((f11 == 0.0f && !z10) || r10 == 0.0f)) {
                        n2Var.onPause();
                        og1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.n2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.a;
        og1 og1Var = (og1) sparseArray.get(i10);
        if (og1Var != null) {
            org.telegram.ui.ActionBar.n2 n2Var = og1Var.a;
            if (og1Var.c) {
                n2Var.onBecomeFullyHidden();
            }
            if (og1Var.d) {
                n2Var.onPause();
            }
            n2Var.onFragmentDestroy();
            n2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.n2 X() {
        pg1 pg1Var = this.c;
        if (pg1Var == null) {
            return null;
        }
        og1 og1Var = (og1) this.a.get(pg1Var.getCurrentPosition());
        if (og1Var != null) {
            return og1Var.a;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void clearViews() {
        pg1 pg1Var = this.c;
        if (pg1Var != null) {
            this.d = pg1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            og1 og1Var = (og1) sparseArray.valueAt(i10);
            if (og1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = og1Var.a;
                if (og1Var.d) {
                    n2Var.onPause();
                    og1Var.d = false;
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
        this.b = new m0((pg0) this, context, 13);
        pg1 pg1Var = new pg1(this, context);
        this.c = pg1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        pg1Var.setPosition(this.d);
        this.c.setAdapter(new ai.i5(this, context, 4));
        this.b.addView(this.c, w7.z5.d(-1.0f, -1));
        m0 m0Var = this.b;
        this.fragmentView = m0Var;
        rp0 rp0Var = new rp0(this, 25);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(m0Var, rp0Var);
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
            og1 og1Var = (og1) sparseArray.valueAt(i10);
            if (og1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = og1Var.a;
                if (n2Var.fragmentView != null) {
                    arrayList.addAll(n2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.n2 X = X();
        return (X == null || X.fragmentView == null) ? super.isLightStatusBar() : X.isLightStatusBar();
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
        org.telegram.ui.ActionBar.n2 X = X();
        if (X == null || X.onBackPressed(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        U();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        U();
        checkSystemBarColors();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            og1 og1Var = (og1) sparseArray.valueAt(i10);
            boolean z10 = og1Var.b;
            org.telegram.ui.ActionBar.n2 n2Var = og1Var.a;
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
        U();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null) {
            X.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void onResume() {
        super.onResume();
        this.f = true;
        checkSystemBarColors();
        U();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        if (!z10) {
            f7 = 1.0f - f7;
        }
        this.e = f7;
        U();
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
            og1 og1Var = (og1) sparseArray.valueAt(i11);
            if (og1Var != null) {
                og1Var.a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
