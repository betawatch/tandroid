package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zh implements m2.e {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ int c;
    public final /* synthetic */ HorizontalScrollView d;
    public final /* synthetic */ SparseIntArray e;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final /* synthetic */ int[] g;

    public zh(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i10, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.a = atomicBoolean;
        this.b = linearLayout;
        this.c = i10;
        this.d = horizontalScrollView;
        this.e = sparseIntArray;
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.g = iArr;
    }

    @Override // m2.e
    public final void a(int i10) {
        this.f.getSwipeBack().f(this.g[0], this.e.get(i10), true);
    }

    @Override // m2.e
    public final void b(float f9, int i10, int i11) {
        HorizontalScrollView horizontalScrollView;
        if (this.a.get()) {
            return;
        }
        int i12 = 0;
        float f10 = -1.0f;
        float f11 = -1.0f;
        while (true) {
            LinearLayout linearLayout = this.b;
            int childCount = linearLayout.getChildCount();
            horizontalScrollView = this.d;
            if (i12 >= childCount) {
                break;
            }
            org.telegram.ui.Components.qj0 qj0Var = (org.telegram.ui.Components.qj0) linearLayout.getChildAt(i12);
            qj0Var.setOutlineProgress(i12 == i10 ? 1.0f - f9 : i12 == (i10 + 1) % this.c ? f9 : 0.0f);
            if (i12 == i10) {
                f10 = qj0Var.getX() - ((horizontalScrollView.getWidth() - qj0Var.getWidth()) / 2.0f);
            }
            if (i12 == i10 + 1) {
                f11 = qj0Var.getX() - ((horizontalScrollView.getWidth() - qj0Var.getWidth()) / 2.0f);
            }
            i12++;
        }
        if (f10 != -1.0f && f11 != -1.0f) {
            horizontalScrollView.setScrollX((int) com.google.android.recaptcha.internal.a.z(f11, f10, f9, f10));
        }
        SparseIntArray sparseIntArray = this.e;
        this.f.getSwipeBack().f(this.g[0], (int) ((sparseIntArray.get(i10 + 1, 0) * f9) + ((1.0f - f9) * sparseIntArray.get(i10, 0))), false);
    }

    @Override // m2.e
    public final void c(int i10) {
        if (i10 == 0) {
            this.a.set(false);
        }
    }
}
