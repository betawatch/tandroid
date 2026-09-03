package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rt implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ rt(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) this.b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    aaVar.getTextView().invalidate();
                    break;
                }
                break;
            default:
                ((qj0) this.b).invalidate();
                break;
        }
    }
}
