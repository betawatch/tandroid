package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qk implements LayoutTransition.TransitionListener {
    public pk a;
    public int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.z c;
    public final /* synthetic */ qn d;

    public qk(qn qnVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = qnVar;
        this.c = zVar;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i9) {
        int i10 = this.b - 1;
        this.b = i10;
        if (i10 != 0 || this.a == null) {
            return;
        }
        this.c.getViewTreeObserver().removeOnPreDrawListener(this.a);
        this.a = null;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [org.telegram.ui.pk] */
    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i9) {
        if (this.b == 0 && this.a == null) {
            this.a = new ViewTreeObserver.OnPreDrawListener() { // from class: org.telegram.ui.pk
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.o2) qk.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.c.getViewTreeObserver().addOnPreDrawListener(this.a);
        }
        this.b++;
    }
}
