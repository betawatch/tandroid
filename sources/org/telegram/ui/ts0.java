package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ts0 extends org.telegram.ui.Components.mr0 {
    public final /* synthetic */ FrameLayout a1;
    public final /* synthetic */ boolean b1;
    public final /* synthetic */ PhotoViewer c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts0(PhotoViewer photoViewer, Context context, un unVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, unVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.c1 = photoViewer;
        this.a1 = frameLayout;
        this.b1 = z10;
    }

    @Override // org.telegram.ui.Components.mr0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.zr0(this, this.a1, hVar, i10, 14), 250L);
        }
    }

    @Override // org.telegram.ui.Components.mr0, org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.b1) {
            AndroidUtilities.runOnUIThread(new lj0(this, 19), 50L);
        }
        PhotoViewer photoViewer = this.c1;
        photoViewer.d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.y.getSystemService("window")).updateViewLayout(photoViewer.g0, photoViewer.d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
