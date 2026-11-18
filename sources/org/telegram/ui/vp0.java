package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class vp0 extends tg.g0 {
    public final /* synthetic */ PhotoViewer Y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp0(PhotoViewer photoViewer, Context context, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, org.telegram.messenger.we weVar, hn0 hn0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, activity, i7, bitmap, bitmap2, i10, arrayList, weVar, hn0Var, i6Var);
        this.Y1 = photoViewer;
    }

    @Override // tg.g0
    public final int getPKeyboardHeight() {
        hi.p3 p3Var = this.Y1.L1;
        if (p3Var != null) {
            return p3Var.l;
        }
        return 0;
    }

    @Override // tg.g0
    public final void o0(boolean z10) {
        PhotoViewer photoViewer = this.Y1;
        if (photoViewer.G2 == null) {
            return;
        }
        photoViewer.H2 = false;
        photoViewer.n0();
        if (z10) {
            photoViewer.G2.g0();
        } else {
            if (photoViewer.J4 && photoViewer.O1() && photoViewer.d2 != 1) {
                return;
            }
            photoViewer.G2.h0();
        }
    }
}
