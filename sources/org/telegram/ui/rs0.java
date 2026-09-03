package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class rs0 extends org.telegram.ui.Components.lq0 {
    public final /* synthetic */ FrameLayout Y0;
    public final /* synthetic */ boolean Z0;
    public final /* synthetic */ PhotoViewer a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs0(PhotoViewer photoViewer, Context context, xn xnVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z4) {
        super(context, xnVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.a1 = photoViewer;
        this.Y0 = frameLayout;
        this.Z0 = z4;
    }

    @Override // org.telegram.ui.Components.lq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (z4) {
            AndroidUtilities.runOnUIThread(new dt(this, this.Y0, hVar, i10, 8), 250L);
        }
    }

    @Override // org.telegram.ui.Components.lq0, org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.Z0) {
            AndroidUtilities.runOnUIThread(new gl0(this, 16), 50L);
        }
        PhotoViewer photoViewer = this.a1;
        photoViewer.a0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.y.getSystemService("window")).updateViewLayout(photoViewer.d0, photoViewer.a0);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
