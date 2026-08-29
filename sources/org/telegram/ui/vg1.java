package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class vg1 extends org.telegram.ui.ActionBar.o2 {
    public final SparseArray a;
    public n0 b;
    public ug1 c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public vg1() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void U() {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            tg1 tg1Var = (tg1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (tg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = tg1Var.a;
                if (o2Var.fragmentView != null) {
                    float r6 = this.c.r(keyAt);
                    boolean z10 = this.f;
                    float f9 = z10 ? this.e : 0.0f;
                    boolean z11 = this.h;
                    float f10 = tg1Var.f;
                    float f11 = f9 * r6;
                    tg1Var.f = f11;
                    boolean z12 = f11 > f10;
                    if (!tg1Var.d && r6 > 0.0f && z10 && o2Var.fragmentView != null) {
                        o2Var.onResume();
                        tg1Var.d = true;
                    }
                    if (!tg1Var.e && ((f10 == 0.0f || f10 == 1.0f) && f10 != f11 && Math.abs(f10 - f11) != 1.0f)) {
                        o2Var.onTransitionAnimationStart(z12, false);
                        tg1Var.e = true;
                    }
                    if (tg1Var.e && f10 != f11) {
                        o2Var.onTransitionAnimationProgress(z12, z12 ? f11 : 1.0f - f11);
                    }
                    if (tg1Var.e && (f11 == 0.0f || f11 == 1.0f)) {
                        o2Var.onTransitionAnimationEnd(z12, false);
                        tg1Var.e = false;
                    }
                    if (!tg1Var.c && f11 >= 1.0f) {
                        o2Var.onBecomeFullyVisible();
                        tg1Var.c = true;
                    }
                    if (tg1Var.c && ((f11 == 0.0f && !z11) || r6 == 0.0f)) {
                        o2Var.onBecomeFullyHidden();
                        tg1Var.c = false;
                    }
                    if (tg1Var.d && ((f11 == 0.0f && !z10) || r6 == 0.0f)) {
                        o2Var.onPause();
                        tg1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.o2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.a;
        tg1 tg1Var = (tg1) sparseArray.get(i10);
        if (tg1Var != null) {
            org.telegram.ui.ActionBar.o2 o2Var = tg1Var.a;
            if (tg1Var.c) {
                o2Var.onBecomeFullyHidden();
            }
            if (tg1Var.d) {
                o2Var.onPause();
            }
            o2Var.onFragmentDestroy();
            o2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.o2 X() {
        ug1 ug1Var = this.c;
        if (ug1Var == null) {
            return null;
        }
        tg1 tg1Var = (tg1) this.a.get(ug1Var.getCurrentPosition());
        if (tg1Var != null) {
            return tg1Var.a;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void clearViews() {
        ug1 ug1Var = this.c;
        if (ug1Var != null) {
            this.d = ug1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            tg1 tg1Var = (tg1) sparseArray.valueAt(i10);
            if (tg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = tg1Var.a;
                if (tg1Var.d) {
                    o2Var.onPause();
                    tg1Var.d = false;
                }
                o2Var.clearViews();
            }
        }
        super.clearViews();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.b = new n0((ng0) this, context, 13);
        ug1 ug1Var = new ug1(this, context);
        this.c = ug1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        ug1Var.setPosition(this.d);
        this.c.setAdapter(new eg.v(this, context, 5));
        this.b.addView(this.c, i7.f6.c(-1.0f, -1));
        n0 n0Var = this.b;
        this.fragmentView = n0Var;
        zk0 zk0Var = new zk0(this, 26);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(n0Var, zk0Var);
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
        for (int i10 = 0; i10 < size; i10++) {
            tg1 tg1Var = (tg1) sparseArray.valueAt(i10);
            if (tg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = tg1Var.a;
                if (o2Var.fragmentView != null) {
                    arrayList.addAll(o2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.o2 X = X();
        return (X == null || X.fragmentView == null) ? super.isLightStatusBar() : X.isLightStatusBar();
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
        org.telegram.ui.ActionBar.o2 X = X();
        if (X == null || X.onBackPressed(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        U();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        U();
        checkSystemBarColors();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            tg1 tg1Var = (tg1) sparseArray.valueAt(i10);
            boolean z10 = tg1Var.b;
            org.telegram.ui.ActionBar.o2 o2Var = tg1Var.a;
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
        U();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.o2 X = X();
        if (X != null) {
            X.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public void onResume() {
        super.onResume();
        this.f = true;
        checkSystemBarColors();
        U();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationProgress(boolean z10, float f9) {
        super.onTransitionAnimationProgress(z10, f9);
        if (!z10) {
            f9 = 1.0f - f9;
        }
        this.e = f9;
        U();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.n = str;
        this.r = i10;
        this.s = runnable;
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            tg1 tg1Var = (tg1) sparseArray.valueAt(i11);
            if (tg1Var != null) {
                tg1Var.a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
