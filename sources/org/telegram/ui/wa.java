package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wa(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        ku0 ku0Var;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((wb) obj).V0(true);
                break;
            case 1:
                wn wnVar = ((hn) obj).a;
                if (i10 > 0 && wnVar.getParentActivity() != null && wnVar.fragmentView != null) {
                    org.telegram.ui.Components.wc.b0(wnVar).m(org.telegram.ui.Components.vc.I, i10, 0, 0, wnVar.ua).j();
                    break;
                }
                break;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).m0(true);
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.y != null && (ku0Var = photoViewer.e0) != null && i10 > 0) {
                    org.telegram.ui.Components.wc.F(ku0Var, true).j();
                    break;
                }
                break;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                int i12 = ProfileActivity.R6;
                if (i10 != 1) {
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.e1));
                    break;
                } else {
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i13 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i13);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i13, new Object[0]);
                    profileActivity.J1 = 0;
                    profileActivity.finishFragment();
                    break;
                }
            default:
                cf1 cf1Var = ((he1) obj).a;
                if (i10 != 0) {
                    cf1Var.finishFragment();
                    break;
                } else {
                    cf1Var.O0(false);
                    break;
                }
        }
    }
}
