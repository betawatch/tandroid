package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        iu0 iu0Var;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((wb) obj).V0(true);
                break;
            case 1:
                un unVar = ((fn) obj).a;
                if (i10 > 0 && unVar.getParentActivity() != null && unVar.fragmentView != null) {
                    org.telegram.ui.Components.wc.b0(unVar).m(org.telegram.ui.Components.vc.I, i10, 0, 0, unVar.qa).j();
                    break;
                }
                break;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).m0(true);
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.y != null && (iu0Var = photoViewer.e0) != null && i10 > 0) {
                    org.telegram.ui.Components.wc.F(iu0Var, true).j();
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
                af1 af1Var = ((fe1) obj).a;
                if (i10 != 0) {
                    af1Var.finishFragment();
                    break;
                } else {
                    af1Var.O0(false);
                    break;
                }
        }
    }
}
