package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yh implements m2.e {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ int c;
    public final /* synthetic */ HorizontalScrollView d;
    public final /* synthetic */ SparseIntArray e;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final /* synthetic */ int[] g;

    public yh(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i10, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.a = atomicBoolean;
        this.b = linearLayout;
        this.c = i10;
        this.d = horizontalScrollView;
        this.e = sparseIntArray;
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.g = iArr;
    }

    @Override // m2.e
    public final void b(int i10) {
        this.f.getSwipeBack().f(this.g[0], this.e.get(i10), true);
    }

    @Override // m2.e
    public final void c(float f10, int i10, int i11) {
        HorizontalScrollView horizontalScrollView;
        if (this.a.get()) {
            return;
        }
        int i12 = 0;
        float f11 = -1.0f;
        float f12 = -1.0f;
        while (true) {
            LinearLayout linearLayout = this.b;
            int childCount = linearLayout.getChildCount();
            horizontalScrollView = this.d;
            if (i12 >= childCount) {
                break;
            }
            org.telegram.ui.Components.hj0 hj0Var = (org.telegram.ui.Components.hj0) linearLayout.getChildAt(i12);
            hj0Var.setOutlineProgress(i12 == i10 ? 1.0f - f10 : i12 == (i10 + 1) % this.c ? f10 : 0.0f);
            if (i12 == i10) {
                f11 = hj0Var.getX() - ((horizontalScrollView.getWidth() - hj0Var.getWidth()) / 2.0f);
            }
            if (i12 == i10 + 1) {
                f12 = hj0Var.getX() - ((horizontalScrollView.getWidth() - hj0Var.getWidth()) / 2.0f);
            }
            i12++;
        }
        if (f11 != -1.0f && f12 != -1.0f) {
            horizontalScrollView.setScrollX((int) com.google.android.recaptcha.internal.a.z(f12, f11, f10, f11));
        }
        SparseIntArray sparseIntArray = this.e;
        this.f.getSwipeBack().f(this.g[0], (int) ((sparseIntArray.get(i10 + 1, 0) * f10) + ((1.0f - f10) * sparseIntArray.get(i10, 0))), false);
    }

    @Override // m2.e
    public final void d(int i10) {
        if (i10 == 0) {
            this.a.set(false);
        }
    }
}
