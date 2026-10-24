package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qx0 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.gx0, MessagesStorage.BooleanCallback, r0.n, org.telegram.ui.Components.bi0, org.telegram.ui.Components.cm0, FlagSecureReason.FlagSecureCondition, ne.d, k60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ qx0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = k1Var.a.f(519).d;
        ProfileActivity profileActivity = this.b;
        profileActivity.r6 = i10;
        FrameLayout frameLayout = profileActivity.u5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.r6 + profileActivity.q6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.u5.setLayoutParams(marginLayoutParams);
            }
        }
        rz0 rz0Var = profileActivity.O;
        if (rz0Var != null) {
            rz0Var.setPagesPaddingBottom(profileActivity.r6 + profileActivity.p6);
            org.telegram.ui.Components.ns0 ns0Var = profileActivity.O.V;
            if (ns0Var != null) {
                ns0Var.setButtonOffset(profileActivity.r6 + profileActivity.q6);
            }
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        ProfileActivity profileActivity = this.b;
        q01 q01Var = profileActivity.e;
        if (q01Var.w || q01Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.A0);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new qx0(profileActivity, 9));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        profileActivity.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView == null) {
            return true;
        }
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                profileActivity.getMessagesController().blockPeer(profileActivity.f1);
                if (org.telegram.ui.Components.xc.a(profileActivity)) {
                    org.telegram.ui.Components.xc.d(profileActivity, true).j();
                    break;
                }
                break;
            case 6:
                ProfileActivity profileActivity2 = this.b;
                profileActivity2.getClass();
                SharedConfig.pushAuthKey = null;
                SharedConfig.pushAuthKeyId = null;
                SharedConfig.saveConfig();
                profileActivity2.getConnectionsManager().switchBackend(true);
                break;
            default:
                q01 q01Var = this.b.e;
                q01Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                q01Var.l();
                break;
        }
    }

    @Override // org.telegram.ui.k60
    public void i(int i10, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.b;
        TLRPC.ChatFull chatFull = profileActivity.v2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.v2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.v2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.F2, profileActivity, arrayList, i10, new i3(arrayList2, 5), new i3(profileActivity, 6), new re0(profileActivity, arrayList2, hashSet, 25));
    }

    @Override // ne.d
    public void o(int i10, float f7, float f10, ne.e eVar) {
        this.b.Y4();
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        ProfileActivity profileActivity = this.b;
        return profileActivity.E2 != null || profileActivity.i4();
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.b;
        profileActivity.K1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.F2.id), null, profileActivity.F2, Boolean.valueOf(z10));
    }

    @Override // org.telegram.ui.k60
    public /* synthetic */ void h(TLRPC.User user) {
    }

    @Override // ne.d
    public /* synthetic */ void H(float f7, int i10) {
    }
}
