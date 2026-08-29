package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ wg(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        View view = this.b;
        switch (i10) {
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
                ((org.telegram.ui.Cells.y9) view).c.c(LocaleController.getString(R.string.SuggestStickersAll), true, true);
                break;
            case 5:
                SharedConfig.setSuggestStickers(1);
                ((org.telegram.ui.Cells.y9) view).c.c(LocaleController.getString(R.string.SuggestStickersInstalled), true, true);
                break;
            default:
                SharedConfig.setSuggestStickers(2);
                ((org.telegram.ui.Cells.y9) view).c.c(LocaleController.getString(R.string.SuggestStickersNone), true, true);
                break;
        }
    }
}
