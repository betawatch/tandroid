package org.telegram.ui;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class ys0 extends org.telegram.ui.Components.uq0 {
    public final /* synthetic */ FrameLayout b1;
    public final /* synthetic */ boolean c1;
    public final /* synthetic */ PhotoViewer d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys0(PhotoViewer photoViewer, Context context, wn wnVar, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z10) {
        super(context, wnVar, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.d1 = photoViewer;
        this.b1 = frameLayout;
        this.c1 = z10;
    }

    @Override // org.telegram.ui.Components.uq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.f21(this, this.b1, iVar, i10, 9), 250L);
        }
    }

    @Override // org.telegram.ui.Components.uq0, org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.c1) {
            AndroidUtilities.runOnUIThread(new il0(this, 16), 50L);
        }
        PhotoViewer photoViewer = this.d1;
        photoViewer.d0.softInputMode = 272;
        try {
            ((WindowManager) photoViewer.y.getSystemService("window")).updateViewLayout(photoViewer.g0, photoViewer.d0);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
