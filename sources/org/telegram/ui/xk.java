package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xk(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.r2) ((yk) this.b).d).actionBar;
                kVar.invalidate();
                break;
            default:
                ((y91) this.b).p0();
                break;
        }
        return true;
    }
}
