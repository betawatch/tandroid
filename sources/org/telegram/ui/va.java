package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        iu0 iu0Var;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((ub) obj).V0(true);
                break;
            case 1:
                zn znVar = ((ln) obj).a;
                if (i10 > 0 && znVar.getParentActivity() != null && znVar.fragmentView != null) {
                    org.telegram.ui.Components.qc.a0(znVar).m(org.telegram.ui.Components.pc.F, i10, 0, 0, znVar.ba).j();
                    break;
                }
                break;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).l0(true);
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.y != null && (iu0Var = photoViewer.b0) != null && i10 > 0) {
                    org.telegram.ui.Components.qc.F(iu0Var, true).j();
                    break;
                }
                break;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i10 != 1) {
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(profileActivity.b1));
                    break;
                } else {
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.G1 = 0;
                    profileActivity.finishFragment();
                    break;
                }
            default:
                sf1 sf1Var = ((we1) obj).a;
                if (i10 != 0) {
                    sf1Var.finishFragment();
                    break;
                } else {
                    sf1Var.O0(false);
                    break;
                }
        }
    }
}
