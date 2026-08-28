package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wh implements m2.e {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ int c;
    public final /* synthetic */ HorizontalScrollView d;
    public final /* synthetic */ SparseIntArray e;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final /* synthetic */ int[] g;

    public wh(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i9, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.a = atomicBoolean;
        this.b = linearLayout;
        this.c = i9;
        this.d = horizontalScrollView;
        this.e = sparseIntArray;
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.g = iArr;
    }

    @Override // m2.e
    public final void b(int i9) {
        this.f.getSwipeBack().f(this.g[0], this.e.get(i9), true);
    }

    @Override // m2.e
    public final void c(float f10, int i9, int i10) {
        HorizontalScrollView horizontalScrollView;
        if (this.a.get()) {
            return;
        }
        int i11 = 0;
        float f11 = -1.0f;
        float f12 = -1.0f;
        while (true) {
            LinearLayout linearLayout = this.b;
            int childCount = linearLayout.getChildCount();
            horizontalScrollView = this.d;
            if (i11 >= childCount) {
                break;
            }
            org.telegram.ui.Components.fj0 fj0Var = (org.telegram.ui.Components.fj0) linearLayout.getChildAt(i11);
            fj0Var.setOutlineProgress(i11 == i9 ? 1.0f - f10 : i11 == (i9 + 1) % this.c ? f10 : 0.0f);
            if (i11 == i9) {
                f11 = fj0Var.getX() - ((horizontalScrollView.getWidth() - fj0Var.getWidth()) / 2.0f);
            }
            if (i11 == i9 + 1) {
                f12 = fj0Var.getX() - ((horizontalScrollView.getWidth() - fj0Var.getWidth()) / 2.0f);
            }
            i11++;
        }
        if (f11 != -1.0f && f12 != -1.0f) {
            horizontalScrollView.setScrollX((int) e2.c.z(f12, f11, f10, f11));
        }
        SparseIntArray sparseIntArray = this.e;
        this.f.getSwipeBack().f(this.g[0], (int) ((sparseIntArray.get(i9 + 1, 0) * f10) + ((1.0f - f10) * sparseIntArray.get(i9, 0))), false);
    }

    @Override // m2.e
    public final void d(int i9) {
        if (i9 == 0) {
            this.a.set(false);
        }
    }
}
