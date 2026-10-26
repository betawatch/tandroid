package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ws extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ bt o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws(bt btVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = btVar;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ft ftVar = this.o.a;
        ftVar.k = null;
        ftVar.K = false;
        if (ftVar.R) {
            ftVar.l();
        }
    }
}
