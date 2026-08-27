package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class sg1 extends org.telegram.ui.ActionBar.n2 {
    public final SparseArray a;
    public n0 b;
    public rg1 c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public sg1() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void U() {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            qg1 qg1Var = (qg1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (qg1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = qg1Var.a;
                if (n2Var.fragmentView != null) {
                    float r10 = this.c.r(keyAt);
                    boolean z10 = this.f;
                    float f10 = z10 ? this.e : 0.0f;
                    boolean z11 = this.h;
                    float f11 = qg1Var.f;
                    float f12 = f10 * r10;
                    qg1Var.f = f12;
                    boolean z12 = f12 > f11;
                    if (!qg1Var.d && r10 > 0.0f && z10 && n2Var.fragmentView != null) {
                        n2Var.onResume();
                        qg1Var.d = true;
                    }
                    if (!qg1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        n2Var.onTransitionAnimationStart(z12, false);
                        qg1Var.e = true;
                    }
                    if (qg1Var.e && f11 != f12) {
                        n2Var.onTransitionAnimationProgress(z12, z12 ? f12 : 1.0f - f12);
                    }
                    if (qg1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        n2Var.onTransitionAnimationEnd(z12, false);
                        qg1Var.e = false;
                    }
                    if (!qg1Var.c && f12 >= 1.0f) {
                        n2Var.onBecomeFullyVisible();
                        qg1Var.c = true;
                    }
                    if (qg1Var.c && ((f12 == 0.0f && !z11) || r10 == 0.0f)) {
                        n2Var.onBecomeFullyHidden();
                        qg1Var.c = false;
                    }
                    if (qg1Var.d && ((f12 == 0.0f && !z10) || r10 == 0.0f)) {
                        n2Var.onPause();
                        qg1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.n2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.a;
        qg1 qg1Var = (qg1) sparseArray.get(i10);
        if (qg1Var != null) {
            org.telegram.ui.ActionBar.n2 n2Var = qg1Var.a;
            if (qg1Var.c) {
                n2Var.onBecomeFullyHidden();
            }
            if (qg1Var.d) {
                n2Var.onPause();
            }
            n2Var.onFragmentDestroy();
            n2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.n2 X() {
        rg1 rg1Var = this.c;
        if (rg1Var == null) {
            return null;
        }
        qg1 qg1Var = (qg1) this.a.get(rg1Var.getCurrentPosition());
        if (qg1Var != null) {
            return qg1Var.a;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void clearViews() {
        rg1 rg1Var = this.c;
        if (rg1Var != null) {
            this.d = rg1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            qg1 qg1Var = (qg1) sparseArray.valueAt(i10);
            if (qg1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = qg1Var.a;
                if (qg1Var.d) {
                    n2Var.onPause();
                    qg1Var.d = false;
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
        this.b = new n0((qg0) this, context, 13);
        rg1 rg1Var = new rg1(this, context);
        this.c = rg1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        rg1Var.setPosition(this.d);
        this.c.setAdapter(new cg.u(this, context, 5));
        this.b.addView(this.c, h7.z5.c(-1.0f, -1));
        n0 n0Var = this.b;
        this.fragmentView = n0Var;
        dl0 dl0Var = new dl0(this, 26);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(n0Var, dl0Var);
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
            qg1 qg1Var = (qg1) sparseArray.valueAt(i10);
            if (qg1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = qg1Var.a;
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
            qg1 qg1Var = (qg1) sparseArray.valueAt(i10);
            boolean z10 = qg1Var.b;
            org.telegram.ui.ActionBar.n2 n2Var = qg1Var.a;
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
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        if (!z10) {
            f10 = 1.0f - f10;
        }
        this.e = f10;
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
            qg1 qg1Var = (qg1) sparseArray.valueAt(i11);
            if (qg1Var != null) {
                qg1Var.a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
