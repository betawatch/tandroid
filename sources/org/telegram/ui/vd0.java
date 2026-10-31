package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vd0 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final /* synthetic */ wd0 d;
    public long a = System.currentTimeMillis();
    public final ud0 c = new ud0(this, 0);

    public vd0(wd0 wd0Var) {
        this.d = wd0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b = true;
        view.post(this.c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b = false;
        view.removeCallbacks(this.c);
    }
}
