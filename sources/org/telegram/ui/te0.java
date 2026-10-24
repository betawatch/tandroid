package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class te0 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final /* synthetic */ ue0 d;
    public long a = System.currentTimeMillis();
    public final se0 c = new se0(this, 0);

    public te0(ue0 ue0Var) {
        this.d = ue0Var;
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
