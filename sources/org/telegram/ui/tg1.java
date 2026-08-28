package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class tg1 extends org.telegram.ui.ActionBar.o2 {
    public final SparseArray a;
    public m0 b;
    public sg1 c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public tg1() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void T() {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i9 = 0; i9 < size; i9++) {
            rg1 rg1Var = (rg1) sparseArray.valueAt(i9);
            int keyAt = sparseArray.keyAt(i9);
            if (rg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = rg1Var.a;
                if (o2Var.fragmentView != null) {
                    float r10 = this.c.r(keyAt);
                    boolean z10 = this.f;
                    float f10 = z10 ? this.e : 0.0f;
                    boolean z11 = this.h;
                    float f11 = rg1Var.f;
                    float f12 = f10 * r10;
                    rg1Var.f = f12;
                    boolean z12 = f12 > f11;
                    if (!rg1Var.d && r10 > 0.0f && z10 && o2Var.fragmentView != null) {
                        o2Var.onResume();
                        rg1Var.d = true;
                    }
                    if (!rg1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        o2Var.onTransitionAnimationStart(z12, false);
                        rg1Var.e = true;
                    }
                    if (rg1Var.e && f11 != f12) {
                        o2Var.onTransitionAnimationProgress(z12, z12 ? f12 : 1.0f - f12);
                    }
                    if (rg1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        o2Var.onTransitionAnimationEnd(z12, false);
                        rg1Var.e = false;
                    }
                    if (!rg1Var.c && f12 >= 1.0f) {
                        o2Var.onBecomeFullyVisible();
                        rg1Var.c = true;
                    }
                    if (rg1Var.c && ((f12 == 0.0f && !z11) || r10 == 0.0f)) {
                        o2Var.onBecomeFullyHidden();
                        rg1Var.c = false;
                    }
                    if (rg1Var.d && ((f12 == 0.0f && !z10) || r10 == 0.0f)) {
                        o2Var.onPause();
                        rg1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.o2 U(int i9);

    public final void V(int i9) {
        SparseArray sparseArray = this.a;
        rg1 rg1Var = (rg1) sparseArray.get(i9);
        if (rg1Var != null) {
            org.telegram.ui.ActionBar.o2 o2Var = rg1Var.a;
            if (rg1Var.c) {
                o2Var.onBecomeFullyHidden();
            }
            if (rg1Var.d) {
                o2Var.onPause();
            }
            o2Var.onFragmentDestroy();
            o2Var.setParentLayout(null);
        }
        sparseArray.remove(i9);
    }

    public final org.telegram.ui.ActionBar.o2 W() {
        sg1 sg1Var = this.c;
        if (sg1Var == null) {
            return null;
        }
        rg1 rg1Var = (rg1) this.a.get(sg1Var.getCurrentPosition());
        if (rg1Var != null) {
            return rg1Var.a;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void clearViews() {
        sg1 sg1Var = this.c;
        if (sg1Var != null) {
            this.d = sg1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i9 = 0; i9 < size; i9++) {
            rg1 rg1Var = (rg1) sparseArray.valueAt(i9);
            if (rg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = rg1Var.a;
                if (rg1Var.d) {
                    o2Var.onPause();
                    rg1Var.d = false;
                }
                o2Var.clearViews();
            }
        }
        super.clearViews();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.b = new m0((ng0) this, context, 13);
        sg1 sg1Var = new sg1(this, context);
        this.c = sg1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        sg1Var.setPosition(this.d);
        this.c.setAdapter(new bg.x(this, context, 5));
        this.b.addView(this.c, g7.e6.c(-1.0f, -1));
        m0 m0Var = this.b;
        this.fragmentView = m0Var;
        dl0 dl0Var = new dl0(this, 26);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(m0Var, dl0Var);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i9 = 0; i9 < size; i9++) {
            rg1 rg1Var = (rg1) sparseArray.valueAt(i9);
            if (rg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = rg1Var.a;
                if (o2Var.fragmentView != null) {
                    arrayList.addAll(o2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.o2 W = W();
        return (W == null || W.fragmentView == null) ? super.isLightStatusBar() : W.isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
            }
            return false;
        }
        org.telegram.ui.ActionBar.o2 W = W();
        if (W == null || W.onBackPressed(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        T();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        T();
        checkSystemBarColors();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i9 = 0; i9 < size; i9++) {
            rg1 rg1Var = (rg1) sparseArray.valueAt(i9);
            boolean z10 = rg1Var.b;
            org.telegram.ui.ActionBar.o2 o2Var = rg1Var.a;
            if (z10) {
                o2Var.onFragmentDestroy();
                o2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public void onPause() {
        super.onPause();
        this.f = false;
        T();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.o2 W = W();
        if (W != null) {
            W.onRequestPermissionsResultFragment(i9, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public void onResume() {
        super.onResume();
        this.f = true;
        checkSystemBarColors();
        T();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        if (!z10) {
            f10 = 1.0f - f10;
        }
        this.e = f10;
        T();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void setTitleOverlayText(String str, int i9, Runnable runnable) {
        super.setTitleOverlayText(str, i9, runnable);
        this.n = str;
        this.r = i9;
        this.s = runnable;
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            rg1 rg1Var = (rg1) sparseArray.valueAt(i10);
            if (rg1Var != null) {
                rg1Var.a.setTitleOverlayText(str, i9, runnable);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i9, Runnable runnable) {
        setTitleOverlayText(str, i9, runnable);
    }
}
