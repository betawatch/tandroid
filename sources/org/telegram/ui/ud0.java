package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ud0 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final /* synthetic */ vd0 d;
    public long a = System.currentTimeMillis();
    public final td0 c = new td0(this, 0);

    public ud0(vd0 vd0Var) {
        this.d = vd0Var;
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
