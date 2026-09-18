package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class r50 implements org.telegram.ui.Components.t40 {
    public float a;
    public TLRPC.FileLocation b;
    public TLRPC.FileLocation c;
    public ImageLocation d;
    public final long e;
    public final /* synthetic */ k60 f;

    public r50(k60 k60Var, long j3) {
        this.f = k60Var;
        this.e = j3;
    }

    @Override // org.telegram.ui.Components.t40
    public final void B(float f7) {
        this.f.b.O(this.d, f7);
        a(f7);
    }

    @Override // org.telegram.ui.Components.t40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new fi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f7) {
        this.a = f7;
        q50 q50Var = this.f.Q;
        if (q50Var == null) {
            return;
        }
        for (int i10 = 0; i10 < q50Var.getChildCount(); i10++) {
            View childAt = q50Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.d4) {
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                if (d4Var.c()) {
                    org.telegram.ui.Cells.y3 y3Var = d4Var.x;
                    y3Var.setProgress(f7);
                    if (f7 < 1.0f) {
                        AndroidUtilities.updateViewVisibilityAnimated(y3Var, true, 1.0f, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(y3Var, false, 1.0f, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ fv0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.t40
    public final void L(boolean z10, boolean z11) {
    }
}
