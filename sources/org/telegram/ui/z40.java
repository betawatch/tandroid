package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z40 implements org.telegram.ui.Components.i40 {
    public float a;
    public TLRPC.FileLocation b;
    public TLRPC.FileLocation c;
    public ImageLocation d;
    public final long e;
    public final /* synthetic */ s50 f;

    public z40(s50 s50Var, long j10) {
        this.f = s50Var;
        this.e = j10;
    }

    @Override // org.telegram.ui.Components.i40
    public final void E(float f10) {
        this.f.b.O(this.d, f10);
        a(f10);
    }

    @Override // org.telegram.ui.Components.i40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new oh.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f10) {
        this.a = f10;
        y40 y40Var = this.f.M;
        if (y40Var == null) {
            return;
        }
        for (int i10 = 0; i10 < y40Var.getChildCount(); i10++) {
            View childAt = y40Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.b4) {
                org.telegram.ui.Cells.b4 b4Var = (org.telegram.ui.Cells.b4) childAt;
                if (b4Var.c()) {
                    org.telegram.ui.Cells.w3 w3Var = b4Var.x;
                    w3Var.setProgress(f10);
                    if (f10 < 1.0f) {
                        AndroidUtilities.updateViewVisibilityAnimated(w3Var, true, 1.0f, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(w3Var, false, 1.0f, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.i40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.i40
    public final /* synthetic */ cu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.i40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.i40
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.i40
    public final /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.i40
    public final void J(boolean z10, boolean z11) {
    }
}
