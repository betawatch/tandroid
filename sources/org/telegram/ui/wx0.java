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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wx0 implements org.telegram.ui.ActionBar.c2, MessagesStorage.BooleanCallback, r0.o, org.telegram.ui.Components.kh0, org.telegram.ui.Components.kl0, FlagSecureReason.FlagSecureCondition, xd.b, u60, org.telegram.ui.Components.iw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ wx0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // xd.b
    public void L(int i10, float f10, float f11, xd.c cVar) {
        this.b.U4();
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        int i10 = m1Var.a.f(519).d;
        ProfileActivity profileActivity = this.b;
        profileActivity.i6 = i10;
        FrameLayout frameLayout = profileActivity.p5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.i6 + profileActivity.h6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.p5.setLayoutParams(marginLayoutParams);
            }
        }
        zz0 zz0Var = profileActivity.L;
        if (zz0Var != null) {
            zz0Var.setPagesPaddingBottom(profileActivity.i6 + profileActivity.g6);
            org.telegram.ui.Components.or0 or0Var = profileActivity.L.S;
            if (or0Var != null) {
                or0Var.setButtonOffset(profileActivity.i6 + profileActivity.h6);
            }
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        ProfileActivity profileActivity = this.b;
        x01 x01Var = profileActivity.e;
        if (x01Var.w || x01Var.v.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.w0);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.ClearSearchAlertTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.ClearSearchAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new wx0(profileActivity, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        profileActivity.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView == null) {
            return true;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
        return true;
    }

    @Override // org.telegram.ui.u60
    public void i(int i10, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.b;
        TLRPC.ChatFull chatFull = profileActivity.r2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.r2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.r2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().addUsersToChat(profileActivity.B2, profileActivity, arrayList, i10, new j3(arrayList2, 5), new j3(profileActivity, 6), new if0(profileActivity, arrayList2, hashSet, 23));
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                profileActivity.getMessagesController().blockPeer(profileActivity.b1);
                if (org.telegram.ui.Components.qc.a(profileActivity)) {
                    org.telegram.ui.Components.qc.d(profileActivity, true).j();
                    break;
                }
                break;
            case 5:
                x01 x01Var = this.b.e;
                x01Var.v.clear();
                MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
                x01Var.l();
                break;
            default:
                ProfileActivity profileActivity2 = this.b;
                profileActivity2.getClass();
                SharedConfig.pushAuthKey = null;
                SharedConfig.pushAuthKeyId = null;
                SharedConfig.saveConfig();
                profileActivity2.getConnectionsManager().switchBackend(true);
                break;
        }
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        ProfileActivity profileActivity = this.b;
        return profileActivity.A2 != null || profileActivity.g4();
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z4) {
        ProfileActivity profileActivity = this.b;
        profileActivity.G1 = 0;
        NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-profileActivity.B2.id), null, profileActivity.B2, Boolean.valueOf(z4));
    }

    @Override // org.telegram.ui.u60
    public /* synthetic */ void h(TLRPC.User user) {
    }

    @Override // xd.b
    public /* synthetic */ void z(float f10, int i10) {
    }
}
