package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vk(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.r2) ((wk) this.b).d).actionBar;
                kVar.invalidate();
                break;
            default:
                ((w91) this.b).p0();
                break;
        }
        return true;
    }
}
