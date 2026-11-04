package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vo0 extends org.telegram.ui.Components.oo0 {
    public final /* synthetic */ FrameLayout S2;
    public final /* synthetic */ boolean T2;
    public final /* synthetic */ PhotoViewer U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo0(PhotoViewer photoViewer, Context context, wm wmVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, wmVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.U2 = photoViewer;
        this.S2 = frameLayout;
        this.T2 = z10;
    }

    @Override // org.telegram.ui.Components.oo0, org.telegram.ui.ActionBar.t2
    public final void K() {
        super.K();
        if (this.T2) {
            org.telegram.messenger.g0.i3(new sg0(this, 19), 50L);
        }
        PhotoViewer photoViewer = this.U2;
        photoViewer.e0.softInputMode = org.telegram.messenger.hs.v4;
        try {
            ((WindowManager) photoViewer.E.getSystemService("window")).updateViewLayout(photoViewer.h0, photoViewer.e0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.oo0
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            org.telegram.messenger.g0.i3(new org.telegram.ui.Components.zo0(this, this.S2, hVar, i3, 15), 250L);
        }
    }
}
