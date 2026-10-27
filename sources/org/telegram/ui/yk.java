package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yk implements LayoutTransition.TransitionListener {
    public xk a;
    public int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.z c;
    public final /* synthetic */ wn d;

    public yk(wn wnVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = wnVar;
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
            this.a = new xk(this, 0);
            this.c.getViewTreeObserver().addOnPreDrawListener(this.a);
        }
        this.b++;
    }
}
