package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xa(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        du0 du0Var;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((xb) obj).U0(true);
                break;
            case 1:
                sn snVar = ((en) obj).a;
                if (i10 > 0 && snVar.getParentActivity() != null && snVar.fragmentView != null) {
                    org.telegram.ui.Components.xc.a0(snVar).m(org.telegram.ui.Components.wc.I, i10, 0, 0, snVar.ea).j();
                    break;
                }
                break;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.y != null && (du0Var = photoViewer.e0) != null && i10 > 0) {
                    org.telegram.ui.Components.xc.F(du0Var, true).j();
                    break;
                }
                break;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i10 != 1) {
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.f1));
                    break;
                } else {
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.K1 = 0;
                    profileActivity.finishFragment();
                    break;
                }
            default:
                te1 te1Var = ((yd1) obj).a;
                if (i10 != 0) {
                    te1Var.finishFragment();
                    break;
                } else {
                    te1Var.O0(false);
                    break;
                }
        }
    }
}
