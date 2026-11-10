package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class rh implements c5.g {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ int c;
    public final /* synthetic */ HorizontalScrollView d;
    public final /* synthetic */ SparseIntArray e;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final /* synthetic */ int[] g;

    public rh(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i7, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.a = atomicBoolean;
        this.b = linearLayout;
        this.c = i7;
        this.d = horizontalScrollView;
        this.e = sparseIntArray;
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.g = iArr;
    }

    @Override // c5.g
    public final void a(int i7) {
        this.f.getSwipeBack().f(this.g[0], this.e.get(i7), true);
    }

    @Override // c5.g
    public final void b(float f10, int i7, int i10) {
        HorizontalScrollView horizontalScrollView;
        if (this.a.get()) {
            return;
        }
        float f11 = -1.0f;
        float f12 = -1.0f;
        int i11 = 0;
        while (true) {
            LinearLayout linearLayout = this.b;
            int childCount = linearLayout.getChildCount();
            horizontalScrollView = this.d;
            if (i11 >= childCount) {
                break;
            }
            org.telegram.ui.Components.sh0 sh0Var = (org.telegram.ui.Components.sh0) linearLayout.getChildAt(i11);
            sh0Var.setOutlineProgress(i11 == i7 ? 1.0f - f10 : i11 == (i7 + 1) % this.c ? f10 : 0.0f);
            if (i11 == i7) {
                f11 = sh0Var.getX() - ((horizontalScrollView.getWidth() - sh0Var.getWidth()) / 2.0f);
            }
            if (i11 == i7 + 1) {
                f12 = sh0Var.getX() - ((horizontalScrollView.getWidth() - sh0Var.getWidth()) / 2.0f);
            }
            i11++;
        }
        if (f11 != -1.0f && f12 != -1.0f) {
            horizontalScrollView.setScrollX((int) com.google.android.recaptcha.internal.a.z(f12, f11, f10, f11));
        }
        SparseIntArray sparseIntArray = this.e;
        this.f.getSwipeBack().f(this.g[0], (int) ((sparseIntArray.get(i7 + 1, 0) * f10) + ((1.0f - f10) * sparseIntArray.get(i7, 0))), false);
    }

    @Override // c5.g
    public final void c(int i7) {
        if (i7 == 0) {
            this.a.set(false);
        }
    }
}
