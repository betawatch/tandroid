package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class va implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ va(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        uu0 uu0Var;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((ub) obj).V0(true);
                break;
            case 1:
                co coVar = ((on) obj).a;
                if (i10 > 0 && coVar.getParentActivity() != null && coVar.fragmentView != null) {
                    org.telegram.ui.Components.yc.a0(coVar).m(org.telegram.ui.Components.xc.I, i10, 0, 0, coVar.ea).j();
                    break;
                }
                break;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.y != null && (uu0Var = photoViewer.e0) != null && i10 > 0) {
                    org.telegram.ui.Components.yc.F(uu0Var, true).j();
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
                eg1 eg1Var = ((jf1) obj).a;
                if (i10 != 0) {
                    eg1Var.finishFragment();
                    break;
                } else {
                    eg1Var.O0(false);
                    break;
                }
        }
    }
}
