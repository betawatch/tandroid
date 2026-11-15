package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class tp0 extends tg.g0 {
    public final /* synthetic */ PhotoViewer Y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp0(PhotoViewer photoViewer, Context context, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, org.telegram.messenger.xe xeVar, dn0 dn0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, activity, i7, bitmap, bitmap2, i10, arrayList, xeVar, dn0Var, e6Var);
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
