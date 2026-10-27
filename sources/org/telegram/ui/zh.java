package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zh implements ViewTreeObserver.OnPreDrawListener {
    public boolean a;
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ wn c;

    public zh(wn wnVar, ViewTreeObserver viewTreeObserver) {
        this.c = wnVar;
        this.b = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.b;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        wn wnVar = this.c;
        lj ljVar = wnVar.m1;
        if (ljVar != null) {
            ljVar.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        if (this.a) {
            return true;
        }
        this.a = true;
        return wnVar.D8();
    }
}
