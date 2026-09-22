package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tt implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ tt(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) this.b;
                if (i10 == NotificationCenter.emojiLoaded) {
                    eaVar.getTextView().invalidate();
                    break;
                }
                break;
            default:
                ((zj0) this.b).invalidate();
                break;
        }
    }
}
