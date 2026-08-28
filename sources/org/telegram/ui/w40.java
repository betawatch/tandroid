package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w40 implements org.telegram.ui.Components.d40 {
    public float a;
    public TLRPC.FileLocation b;
    public TLRPC.FileLocation c;
    public ImageLocation d;
    public final long e;
    public final /* synthetic */ o50 f;

    public w40(o50 o50Var, long j10) {
        this.f = o50Var;
        this.e = j10;
    }

    @Override // org.telegram.ui.Components.d40
    public final void D(float f10) {
        this.f.b.O(this.d, f10);
        a(f10);
    }

    @Override // org.telegram.ui.Components.d40
    public final void P(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new nh.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
    }

    public final void a(float f10) {
        this.a = f10;
        u40 u40Var = this.f.M;
        if (u40Var == null) {
            return;
        }
        for (int i9 = 0; i9 < u40Var.getChildCount(); i9++) {
            View childAt = u40Var.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.e4) {
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) childAt;
                if (e4Var.c()) {
                    org.telegram.ui.Cells.z3 z3Var = e4Var.x;
                    z3Var.setProgress(f10);
                    if (f10 < 1.0f) {
                        AndroidUtilities.updateViewVisibilityAnimated(z3Var, true, 1.0f, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(z3Var, false, 1.0f, true);
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ bu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.d40
    public final void J(boolean z10, boolean z11) {
    }
}
