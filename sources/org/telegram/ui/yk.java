package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
