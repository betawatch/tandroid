package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ xg(int i9, View view) {
        this.a = i9;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        View view = this.b;
        switch (i9) {
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
                Drawable[] drawableArr = PhotoViewer.P8;
                AndroidUtilities.removeFromParent(view);
                break;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.P8;
                view.setVisibility(8);
                break;
            case 4:
                SharedConfig.setSuggestStickers(0);
                ((org.telegram.ui.Cells.ba) view).c.c(LocaleController.getString(R.string.SuggestStickersAll), true, true);
                break;
            case 5:
                SharedConfig.setSuggestStickers(1);
                ((org.telegram.ui.Cells.ba) view).c.c(LocaleController.getString(R.string.SuggestStickersInstalled), true, true);
                break;
            default:
                SharedConfig.setSuggestStickers(2);
                ((org.telegram.ui.Cells.ba) view).c.c(LocaleController.getString(R.string.SuggestStickersNone), true, true);
                break;
        }
    }
}
