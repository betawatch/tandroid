package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class yb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ yb0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a11 a11Var;
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                m01 m01Var = profileActivity.O;
                if (m01Var != null) {
                    m01Var.Y0(14);
                    profileActivity.G4(false);
                    break;
                }
                break;
            case 1:
                ProfileActivity profileActivity2 = this.b;
                m01 m01Var2 = profileActivity2.O;
                if (m01Var2 != null) {
                    m01Var2.Y0(14);
                    profileActivity2.G4(false);
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new yb0(this.b, 0), 200L);
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new yb0(this.b, 1), 200L);
                break;
            case 4:
                ProfileActivity profileActivity3 = this.b;
                profileActivity3.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", profileActivity3.e1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 5:
                this.b.z4(false);
                break;
            case 6:
                ProfileActivity profileActivity4 = this.b;
                profileActivity4.getClass();
                profileActivity4.presentFragment(new UserInfoActivity());
                break;
            case 7:
                this.b.z4(true);
                break;
            case 8:
                ProfileActivity profileActivity5 = this.b;
                profileActivity5.getClass();
                profileActivity5.presentFragment(new ig.g1());
                break;
            case 9:
                ProfileActivity profileActivity6 = this.b;
                profileActivity6.getClass();
                profileActivity6.presentFragment(new ig.e1());
                break;
            case 10:
                ProfileActivity profileActivity7 = this.b;
                profileActivity7.getClass();
                profileActivity7.presentFragment(new qa(null));
                break;
            case 11:
                ProfileActivity profileActivity8 = this.b;
                profileActivity8.getClass();
                profileActivity8.presentFragment(new UserInfoActivity());
                break;
            case 12:
                ProfileActivity profileActivity9 = this.b;
                profileActivity9.getClass();
                profileActivity9.presentFragment(new h(3));
                break;
            case 13:
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                this.b.showAsSheet(new PrivacyControlActivity(11, false), l2Var);
                break;
            case 14:
                ProfileActivity profileActivity10 = this.b;
                profileActivity10.k4(true);
                if (profileActivity10.j2.isRunning()) {
                    profileActivity10.j2.cancel();
                }
                profileActivity10.J4(1.0f);
                break;
            case 15:
                this.b.e5(false, false);
                break;
            case 16:
                this.b.F3();
                break;
            case 17:
                ProfileActivity profileActivity11 = this.b;
                m01 m01Var3 = profileActivity11.O;
                if (m01Var3 != null) {
                    m01Var3.v1(true);
                    profileActivity11.O.n1();
                    break;
                }
                break;
            case 18:
                ProfileActivity profileActivity12 = this.b;
                profileActivity12.getMessagesController().reloadUser(profileActivity12.a());
                break;
            case 19:
                ProfileActivity profileActivity13 = this.b;
                if (!profileActivity13.a.b0() && (a11Var = profileActivity13.d) != null) {
                    a11Var.l();
                    break;
                }
                break;
            case 20:
                this.b.e5(false, false);
                break;
            case 21:
                this.b.y5.setVisibility(8);
                break;
            case 22:
                ProfileActivity profileActivity14 = this.b;
                profileActivity14.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity14.f1);
                bundle.putLong("user_id", profileActivity14.e1);
                profileActivity14.presentFragment(new g31(bundle));
                break;
            case 23:
                ProfileActivity profileActivity15 = this.b;
                profileActivity15.getClass();
                profileActivity15.presentFragment(new qa(null));
                break;
            case 24:
                ProfileActivity.W(this.b);
                break;
            case 25:
                ProfileActivity profileActivity16 = this.b;
                TLRPC.UserFull userFull = profileActivity16.v2;
                if (userFull != null) {
                    AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(userFull.note, false));
                    org.telegram.messenger.wl.o(R.string.TextCopied, org.telegram.ui.Components.yc.a0(profileActivity16));
                    break;
                }
                break;
            case 26:
                ProfileActivity profileActivity17 = this.b;
                profileActivity17.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", profileActivity17.e1);
                bundle2.putBoolean("focus_notes", true);
                profileActivity17.presentFragment(new ss(bundle2, profileActivity17.z0));
                break;
            default:
                this.b.G4(true);
                break;
        }
    }
}
