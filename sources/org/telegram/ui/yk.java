package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yk(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) ((zk) this.b).d).actionBar;
                kVar.invalidate();
                break;
            default:
                ((ta1) this.b).n0();
                break;
        }
        return true;
    }
}
