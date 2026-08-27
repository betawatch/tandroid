package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class se0 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final /* synthetic */ te0 d;
    public long a = System.currentTimeMillis();
    public final re0 c = new re0(this, 0);

    public se0(te0 te0Var) {
        this.d = te0Var;
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
