package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public abstract class yh1 extends org.telegram.ui.ActionBar.n2 {
    public final SparseArray a;
    public j0 b;
    public xh1 c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public yh1() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void U() {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            wh1 wh1Var = (wh1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (wh1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = wh1Var.a;
                if (n2Var.fragmentView != null) {
                    float r10 = this.c.r(keyAt);
                    boolean z10 = this.f;
                    float f7 = z10 ? this.e : 0.0f;
                    boolean z11 = this.h;
                    float f10 = wh1Var.f;
                    float f11 = f7 * r10;
                    wh1Var.f = f11;
                    boolean z12 = f11 > f10;
                    if (!wh1Var.d && r10 > 0.0f && z10 && n2Var.fragmentView != null) {
                        n2Var.onResume();
                        wh1Var.d = true;
                    }
                    if (!wh1Var.e && ((f10 == 0.0f || f10 == 1.0f) && f10 != f11 && Math.abs(f10 - f11) != 1.0f)) {
                        n2Var.onTransitionAnimationStart(z12, false);
                        wh1Var.e = true;
                    }
                    if (wh1Var.e && f10 != f11) {
                        n2Var.onTransitionAnimationProgress(z12, z12 ? f11 : 1.0f - f11);
                    }
                    if (wh1Var.e && (f11 == 0.0f || f11 == 1.0f)) {
                        n2Var.onTransitionAnimationEnd(z12, false);
                        wh1Var.e = false;
                    }
                    if (!wh1Var.c && f11 >= 1.0f) {
                        n2Var.onBecomeFullyVisible();
                        wh1Var.c = true;
                    }
                    if (wh1Var.c && ((f11 == 0.0f && !z11) || r10 == 0.0f)) {
                        n2Var.onBecomeFullyHidden();
                        wh1Var.c = false;
                    }
                    if (wh1Var.d && ((f11 == 0.0f && !z10) || r10 == 0.0f)) {
                        n2Var.onPause();
                        wh1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.n2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.a;
        wh1 wh1Var = (wh1) sparseArray.get(i10);
        if (wh1Var != null) {
            org.telegram.ui.ActionBar.n2 n2Var = wh1Var.a;
            if (wh1Var.c) {
                n2Var.onBecomeFullyHidden();
            }
            if (wh1Var.d) {
                n2Var.onPause();
            }
            n2Var.onFragmentDestroy();
            n2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.n2 X() {
        xh1 xh1Var = this.c;
        if (xh1Var == null) {
            return null;
        }
        wh1 wh1Var = (wh1) this.a.get(xh1Var.getCurrentPosition());
        if (wh1Var != null) {
            return wh1Var.a;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void clearViews() {
        xh1 xh1Var = this.c;
        if (xh1Var != null) {
            this.d = xh1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            wh1 wh1Var = (wh1) sparseArray.valueAt(i10);
            if (wh1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = wh1Var.a;
                if (wh1Var.d) {
                    n2Var.onPause();
                    wh1Var.d = false;
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
        this.b = new j0((fh0) this, context, 12);
        xh1 xh1Var = new xh1(this, context);
        this.c = xh1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        xh1Var.setPosition(this.d);
        this.c.setAdapter(new iw0(this, context, 3));
        this.b.addView(this.c, w7.y5.c(-1.0f, -1));
        j0 j0Var = this.b;
        this.fragmentView = j0Var;
        ol0 ol0Var = new ol0(this, 27);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(j0Var, ol0Var);
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
            wh1 wh1Var = (wh1) sparseArray.valueAt(i10);
            if (wh1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = wh1Var.a;
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
            wh1 wh1Var = (wh1) sparseArray.valueAt(i10);
            boolean z10 = wh1Var.b;
            org.telegram.ui.ActionBar.n2 n2Var = wh1Var.a;
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
            wh1 wh1Var = (wh1) sparseArray.valueAt(i11);
            if (wh1Var != null) {
                wh1Var.a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
