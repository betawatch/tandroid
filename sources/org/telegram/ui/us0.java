package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class us0 extends OrientationEventListener {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.a = photoViewer;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        zs0 zs0Var;
        Activity activity;
        int i11;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.T3 == null || (zs0Var = photoViewer.v2) == null || zs0Var.getVisibility() != 0 || (activity = photoViewer.y) == null || (i11 = photoViewer.V3) == 0) {
            return;
        }
        if (i11 != 1) {
            if (i10 > 0 && (i10 >= 330 || i10 <= 30)) {
                photoViewer.W3 = true;
                return;
            }
            if (!photoViewer.W3 || i10 < 240 || i10 > 300) {
                return;
            }
            activity.setRequestedOrientation(photoViewer.U3);
            photoViewer.V3 = 0;
            photoViewer.W3 = false;
            return;
        }
        if (i10 >= 240 && i10 <= 300) {
            photoViewer.W3 = true;
            return;
        }
        if (!photoViewer.W3 || i10 <= 0) {
            return;
        }
        if (i10 >= 330 || i10 <= 30) {
            activity.setRequestedOrientation(photoViewer.U3);
            photoViewer.V3 = 0;
            photoViewer.W3 = false;
        }
    }
}
