package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zm0 implements org.telegram.ui.Components.a51 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.ze b;

    public /* synthetic */ zm0(org.telegram.messenger.ze zeVar, int i3) {
        this.a = i3;
        this.b = zeVar;
    }

    @Override // org.telegram.ui.Components.a51
    public final void a(org.telegram.ui.Components.py pyVar) {
        int i3 = this.a;
        org.telegram.messenger.ze zeVar = this.b;
        switch (i3) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.V8;
                pyVar.e(new org.telegram.ui.Components.nh(zeVar, 1));
                break;
            default:
                Drawable[] drawableArr2 = PhotoViewer.V8;
                pyVar.e(new org.telegram.ui.Components.nh(zeVar, 1));
                break;
        }
    }
}
