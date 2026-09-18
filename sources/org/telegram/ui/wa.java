package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        xu0 xu0Var;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((wb) obj).U0(true);
                break;
            case 1:
                bo boVar = ((nn) obj).a;
                if (i10 > 0 && boVar.getParentActivity() != null && boVar.fragmentView != null) {
                    org.telegram.ui.Components.vc.a0(boVar).m(org.telegram.ui.Components.uc.I, i10, 0, 0, boVar.ea).j();
                    break;
                }
                break;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.y != null && (xu0Var = photoViewer.e0) != null && i10 > 0) {
                    org.telegram.ui.Components.vc.F(xu0Var, true).j();
                    break;
                }
                break;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i10 != 1) {
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.e1));
                    break;
                } else {
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.J1 = 0;
                    profileActivity.finishFragment();
                    break;
                }
            default:
                fg1 fg1Var = ((kf1) obj).a;
                if (i10 != 0) {
                    fg1Var.finishFragment();
                    break;
                } else {
                    fg1Var.O0(false);
                    break;
                }
        }
    }
}
