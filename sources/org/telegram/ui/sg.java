package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ sg(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        View view = this.b;
        switch (i7) {
            case 0:
                try {
                    view.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                view.setBackgroundDrawable(null);
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.Z8;
                org.telegram.messenger.g0.E2(view);
                break;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                view.setVisibility(8);
                break;
            case 4:
                org.telegram.messenger.bz.I(0);
                ((org.telegram.ui.Cells.w9) view).c.c(org.telegram.messenger.gd.M0(2131744166, null), true, true);
                break;
            case 5:
                org.telegram.messenger.bz.I(1);
                ((org.telegram.ui.Cells.w9) view).c.c(org.telegram.messenger.gd.M0(2131744165, null), true, true);
                break;
            default:
                org.telegram.messenger.bz.I(2);
                ((org.telegram.ui.Cells.w9) view).c.c(org.telegram.messenger.gd.M0(2131744164, null), true, true);
                break;
        }
    }
}
