package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class vk implements LayoutTransition.TransitionListener {
    public uk a;
    public int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.y c;
    public final /* synthetic */ sn d;

    public vk(sn snVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = snVar;
        this.c = yVar;
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

    /* JADX WARN: Type inference failed for: r1v5, types: [org.telegram.ui.uk] */
    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.b == 0 && this.a == null) {
            this.a = new ViewTreeObserver.OnPreDrawListener() { // from class: org.telegram.ui.uk
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.o2) vk.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.c.getViewTreeObserver().addOnPreDrawListener(this.a);
        }
        this.b++;
    }
}
