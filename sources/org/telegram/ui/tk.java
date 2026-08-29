package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class tk implements LayoutTransition.TransitionListener {
    public sk a;
    public int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.a0 c;
    public final /* synthetic */ tn d;

    public tk(tn tnVar, org.telegram.ui.ActionBar.a0 a0Var) {
        this.d = tnVar;
        this.c = a0Var;
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

    /* JADX WARN: Type inference failed for: r1v5, types: [org.telegram.ui.sk] */
    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.b == 0 && this.a == null) {
            this.a = new ViewTreeObserver.OnPreDrawListener() { // from class: org.telegram.ui.sk
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.l lVar;
                    lVar = ((org.telegram.ui.ActionBar.o2) tk.this.d).actionBar;
                    lVar.invalidate();
                    return true;
                }
            };
            this.c.getViewTreeObserver().addOnPreDrawListener(this.a);
        }
        this.b++;
    }
}
