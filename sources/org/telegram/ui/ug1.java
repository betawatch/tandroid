package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class ug1 extends org.telegram.ui.ActionBar.r2 {
    public final SparseArray a;
    public k0 b;
    public tg1 c;
    public int d;
    public float e;
    public boolean f;
    public boolean h;
    public String n;
    public int r;
    public Runnable s;

    public ug1() {
        super(null);
        this.a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V() {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (sg1Var != null) {
                org.telegram.ui.ActionBar.r2 r2Var = sg1Var.a;
                if (r2Var.fragmentView != null) {
                    float r6 = this.c.r(keyAt);
                    boolean z10 = this.f;
                    float f7 = z10 ? this.e : 0.0f;
                    boolean z11 = this.h;
                    if (sg1Var.g <= 0.0f && r6 > 0.0f && z10 && (r2Var instanceof og0)) {
                        ((og0) r2Var).D();
                    }
                    sg1Var.g = r6;
                    float f10 = sg1Var.f;
                    float f11 = f7 * r6;
                    sg1Var.f = f11;
                    boolean z12 = f11 > f10;
                    if (!sg1Var.d && r6 > 0.0f && z10 && r2Var.fragmentView != null) {
                        r2Var.onResume();
                        sg1Var.d = true;
                    }
                    if (!sg1Var.e && ((f10 == 0.0f || f10 == 1.0f) && f10 != f11 && Math.abs(f10 - f11) != 1.0f)) {
                        r2Var.onTransitionAnimationStart(z12, false);
                        sg1Var.e = true;
                    }
                    if (sg1Var.e && f10 != f11) {
                        r2Var.onTransitionAnimationProgress(z12, z12 ? f11 : 1.0f - f11);
                    }
                    if (sg1Var.e && (f11 == 0.0f || f11 == 1.0f)) {
                        r2Var.onTransitionAnimationEnd(z12, false);
                        sg1Var.e = false;
                    }
                    if (!sg1Var.c && f11 >= 1.0f) {
                        r2Var.onBecomeFullyVisible();
                        sg1Var.c = true;
                    }
                    if (sg1Var.c && ((f11 == 0.0f && !z11) || r6 == 0.0f)) {
                        r2Var.onBecomeFullyHidden();
                        sg1Var.c = false;
                    }
                    if (sg1Var.d && ((f11 == 0.0f && !z10) || r6 == 0.0f)) {
                        r2Var.onPause();
                        sg1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.r2 W(int i10);

    public final org.telegram.ui.ActionBar.r2 X() {
        tg1 tg1Var = this.c;
        if (tg1Var == null) {
            return null;
        }
        sg1 sg1Var = (sg1) this.a.get(tg1Var.getCurrentPosition());
        if (sg1Var != null) {
            return sg1Var.a;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i10);
            if (sg1Var != null) {
                org.telegram.ui.ActionBar.r2 r2Var = sg1Var.a;
                if (r2Var.fragmentView != null) {
                    r2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void clearViews() {
        tg1 tg1Var = this.c;
        if (tg1Var != null) {
            this.d = tg1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i10);
            if (sg1Var != null) {
                org.telegram.ui.ActionBar.r2 r2Var = sg1Var.a;
                if (sg1Var.d) {
                    r2Var.onPause();
                    sg1Var.d = false;
                }
                r2Var.clearViews();
            }
        }
        super.clearViews();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.b = new k0((pg0) this, context, 13);
        tg1 tg1Var = new tg1(this, context);
        this.c = tg1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        tg1Var.setPosition(this.d);
        this.c.setAdapter(new bi.e5(this, context, 5));
        this.b.addView(this.c, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        k0 k0Var = this.b;
        this.fragmentView = k0Var;
        hl0 hl0Var = new hl0(this, 26);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(k0Var, hl0Var);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i10);
            if (sg1Var != null) {
                org.telegram.ui.ActionBar.r2 r2Var = sg1Var.a;
                if (r2Var.fragmentView != null) {
                    arrayList.addAll(r2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.r2 X = X();
        return (X == null || X.fragmentView == null) ? super.isLightStatusBar() : X.isLightStatusBar();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.z5 z5Var;
        if (!hasShownSheet()) {
            org.telegram.ui.ActionBar.r2 X = X();
            org.telegram.ui.ActionBar.r5 simpleActionBar = X != null ? X.getSimpleActionBar() : null;
            if (simpleActionBar == null || ((z5Var = simpleActionBar.O) == null && (simpleActionBar.G || !simpleActionBar.F))) {
                if (X == null || X.onBackPressed(z10)) {
                    return super.onBackPressed(z10);
                }
            } else if (z10) {
                if (z5Var != null) {
                    z5Var.a(true);
                    return false;
                }
                if (!simpleActionBar.G && simpleActionBar.F) {
                    simpleActionBar.f(true);
                }
                return false;
            }
        } else if (z10) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        V();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        V();
        checkSystemBarColors();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i10);
            boolean z10 = sg1Var.b;
            org.telegram.ui.ActionBar.r2 r2Var = sg1Var.a;
            if (z10) {
                r2Var.onFragmentDestroy();
                r2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public void onPause() {
        super.onPause();
        this.f = false;
        V();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.r2 X = X();
        if (X != null) {
            X.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public void onResume() {
        super.onResume();
        this.f = true;
        checkSystemBarColors();
        V();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i10);
            if (sg1Var != null) {
                org.telegram.ui.ActionBar.r2 r2Var = sg1Var.a;
                if (r2Var.fragmentView != null) {
                    try {
                        r2Var.onThemeColorsChanged();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        if (!z10) {
            f7 = 1.0f - f7;
        }
        this.e = f7;
        V();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.n = str;
        this.r = i10;
        this.s = runnable;
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i11);
            if (sg1Var != null) {
                sg1Var.a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
