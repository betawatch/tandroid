package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z20 extends View {
    public z20(LaunchActivity launchActivity) {
        super(launchActivity);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
    }
}
