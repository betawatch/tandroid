package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class vp0 extends tg.l0 {
    public boolean c2;
    public final /* synthetic */ PhotoViewer d2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp0(PhotoViewer photoViewer, Context context, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, org.telegram.messenger.we weVar, kn0 kn0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, activity, i7, bitmap, bitmap2, i10, arrayList, weVar, kn0Var, i6Var);
        this.d2 = photoViewer;
    }

    @Override // tg.l0
    public final FrameLayout getCaptionsBulletinContainer() {
        return this.d2.f0;
    }

    @Override // tg.l0
    public final long getCaptionsTrimEnd() {
        wo0 wo0Var = this.d2.Y7;
        if (wo0Var == null) {
            return 0L;
        }
        return (long) (wo0Var.getRightProgress() * r0.x1());
    }

    @Override // tg.l0
    public final long getCaptionsTrimStart() {
        wo0 wo0Var = this.d2.Y7;
        if (wo0Var == null) {
            return 0L;
        }
        return (long) (wo0Var.getLeftProgress() * r0.x1());
    }

    @Override // tg.l0
    public final File getCaptionsVideoFile() {
        int i7;
        PhotoViewer photoViewer = this.d2;
        if (!photoViewer.s1 || photoViewer.e5 == null || (i7 = photoViewer.d2) == 1 || i7 == 11) {
            return null;
        }
        return new File(photoViewer.e5);
    }

    @Override // tg.l0
    public final long getCaptionsVideoPosition() {
        org.telegram.ui.Components.h61 h61Var = this.d2.G2;
        if (h61Var != null) {
            return h61Var.S();
        }
        return 0L;
    }

    @Override // tg.l0
    public final int getPKeyboardHeight() {
        hi.x3 x3Var = this.d2.L1;
        if (x3Var != null) {
            return x3Var.l;
        }
        return 0;
    }

    @Override // tg.l0
    public final void r0(boolean z10) {
        PhotoViewer photoViewer = this.d2;
        if (photoViewer.G2 == null) {
            return;
        }
        photoViewer.H2 = false;
        photoViewer.n0();
        if (z10) {
            photoViewer.G2.g0();
        } else {
            if (photoViewer.O1()) {
                return;
            }
            photoViewer.G2.h0();
        }
    }
}
