package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class vs0 extends OrientationEventListener {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.a = photoViewer;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        at0 at0Var;
        Activity activity;
        int i11;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.W3 == null || (at0Var = photoViewer.y2) == null || at0Var.getVisibility() != 0 || (activity = photoViewer.y) == null || (i11 = photoViewer.Y3) == 0) {
            return;
        }
        if (i11 != 1) {
            if (i10 > 0 && (i10 >= 330 || i10 <= 30)) {
                photoViewer.Z3 = true;
                return;
            }
            if (!photoViewer.Z3 || i10 < 240 || i10 > 300) {
                return;
            }
            activity.setRequestedOrientation(photoViewer.X3);
            photoViewer.Y3 = 0;
            photoViewer.Z3 = false;
            return;
        }
        if (i10 >= 240 && i10 <= 300) {
            photoViewer.Z3 = true;
            return;
        }
        if (!photoViewer.Z3 || i10 <= 0) {
            return;
        }
        if (i10 >= 330 || i10 <= 30) {
            activity.setRequestedOrientation(photoViewer.X3);
            photoViewer.Y3 = 0;
            photoViewer.Z3 = false;
        }
    }
}
