package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ tg(int i7, View view) {
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
                Drawable[] drawableArr = PhotoViewer.Y8;
                org.telegram.messenger.g0.E2(view);
                break;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                view.setVisibility(8);
                break;
            case 4:
                org.telegram.messenger.iz.I(0);
                ((org.telegram.ui.Cells.w9) view).c.c(org.telegram.messenger.hd.M0(2131744402, null), true, true);
                break;
            case 5:
                org.telegram.messenger.iz.I(1);
                ((org.telegram.ui.Cells.w9) view).c.c(org.telegram.messenger.hd.M0(2131744401, null), true, true);
                break;
            default:
                org.telegram.messenger.iz.I(2);
                ((org.telegram.ui.Cells.w9) view).c.c(org.telegram.messenger.hd.M0(2131744400, null), true, true);
                break;
        }
    }
}
