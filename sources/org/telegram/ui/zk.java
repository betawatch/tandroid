package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class zk implements LayoutTransition.TransitionListener {
    public yk a;
    public int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.z c;
    public final /* synthetic */ yn d;

    public zk(yn ynVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = ynVar;
        this.c = zVar;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.b - 1;
        this.b = i11;
        if (i11 != 0 || this.a == null) {
            return;
        }
        this.c.getViewTreeObserver().removeOnPreDrawListener(this.a);
        this.a = null;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.b == 0 && this.a == null) {
            this.a = new yk(this, 0);
            this.c.getViewTreeObserver().addOnPreDrawListener(this.a);
        }
        this.b++;
    }
}
