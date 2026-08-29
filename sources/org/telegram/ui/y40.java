package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y40 implements org.telegram.ui.Components.r40 {
    public float a;
    public TLRPC.FileLocation b;
    public TLRPC.FileLocation c;
    public ImageLocation d;
    public final long e;
    public final /* synthetic */ r50 f;

    public y40(r50 r50Var, long j10) {
        this.f = r50Var;
        this.e = j10;
    }

    @Override // org.telegram.ui.Components.r40
    public final void D(float f9) {
        this.f.b.O(this.d, f9);
        a(f9);
    }

    @Override // org.telegram.ui.Components.r40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new wc(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 2));
    }

    public final void a(float f9) {
        this.a = f9;
        x40 x40Var = this.f.M;
        if (x40Var == null) {
            return;
        }
        for (int i10 = 0; i10 < x40Var.getChildCount(); i10++) {
            View childAt = x40Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.c4) {
                org.telegram.ui.Cells.c4 c4Var = (org.telegram.ui.Cells.c4) childAt;
                if (c4Var.c()) {
                    org.telegram.ui.Cells.w3 w3Var = c4Var.x;
                    w3Var.setProgress(f9);
                    if (f9 < 1.0f) {
                        AndroidUtilities.updateViewVisibilityAnimated(w3Var, true, 1.0f, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(w3Var, false, 1.0f, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ zt0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.r40
    public final void K(boolean z10, boolean z11) {
    }
}
