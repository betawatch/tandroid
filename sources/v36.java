// default package

import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class v36 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ v36(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ko8 ko8Var;
        byte b = this.a;
        byte b2 = 0;
        byte b3 = 1;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                vn8 vn8Var = profileActivity.O;
                if (vn8Var != null) {
                    vn8Var.f1(14);
                    profileActivity.j3(false);
                    break;
                }
                break;
            case 1:
                vn8 vn8Var2 = profileActivity.O;
                if (vn8Var2 != null) {
                    vn8Var2.f1(14);
                    profileActivity.j3(false);
                    break;
                }
                break;
            case 2:
                gl.d3(new v36(profileActivity, b2), 200L);
                break;
            case 3:
                gl.d3(new v36(profileActivity, b3), 200L);
                break;
            case 4:
                RectF rectF = ProfileActivity.Z6;
                TLRPC.UserFull userFull = profileActivity.w2;
                if (userFull != null) {
                    gl.g(k27.h0(userFull.note, false));
                    u21.b0(profileActivity).i(k96.M0(2131743953, null)).j();
                    break;
                }
                break;
            case 5:
                RectF rectF2 = ProfileActivity.Z6;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", profileActivity.e1);
                bundle.putBoolean("focus_notes", true);
                profileActivity.presentFragment(new it2(bundle, profileActivity.A0));
                break;
            case 6:
                RectF rectF3 = ProfileActivity.Z6;
                profileActivity.getSendMessagesHelper().q0(x3a.b("/start", profileActivity.e1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 7:
                RectF rectF4 = ProfileActivity.Z6;
                profileActivity.c3(false);
                break;
            case 8:
                RectF rectF5 = ProfileActivity.Z6;
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 9:
                RectF rectF6 = ProfileActivity.Z6;
                profileActivity.c3(true);
                break;
            case 10:
                RectF rectF7 = ProfileActivity.Z6;
                profileActivity.presentFragment(new qq7());
                break;
            case 11:
                RectF rectF8 = ProfileActivity.Z6;
                profileActivity.presentFragment(new pa6());
                break;
            case 12:
                RectF rectF9 = ProfileActivity.Z6;
                profileActivity.presentFragment(new me1(null));
                break;
            case 13:
                RectF rectF10 = ProfileActivity.Z6;
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 14:
                RectF rectF11 = ProfileActivity.Z6;
                profileActivity.presentFragment(new u8(3));
                break;
            case 15:
                RectF rectF12 = ProfileActivity.Z6;
                ag0 ag0Var = new ag0();
                ag0Var.a = true;
                profileActivity.showAsSheet(new PrivacyControlActivity(11, false), ag0Var);
                break;
            case 16:
                RectF rectF13 = ProfileActivity.Z6;
                profileActivity.N2(true);
                if (profileActivity.k2.isRunning()) {
                    profileActivity.k2.cancel();
                }
                profileActivity.n3(1.0f);
                break;
            case 17:
                RectF rectF14 = ProfileActivity.Z6;
                profileActivity.Y3(false, false);
                break;
            case 18:
                RectF rectF15 = ProfileActivity.Z6;
                profileActivity.M1();
                break;
            case 19:
                RectF rectF16 = ProfileActivity.Z6;
                vn8 vn8Var3 = profileActivity.O;
                if (vn8Var3 != null) {
                    vn8Var3.N1(true);
                    profileActivity.O.C1();
                    break;
                }
                break;
            case 20:
                RectF rectF17 = ProfileActivity.Z6;
                if (!profileActivity.a.d0() && (ko8Var = profileActivity.d) != null) {
                    ko8Var.f();
                    break;
                }
                break;
            case 21:
                RectF rectF18 = ProfileActivity.Z6;
                profileActivity.y1();
                break;
            case 22:
                RectF rectF19 = ProfileActivity.Z6;
                profileActivity.Y3(false, false);
                break;
            case 23:
                RectF rectF20 = ProfileActivity.Z6;
                na7 messagesController = profileActivity.getMessagesController();
                long a = profileActivity.a();
                messagesController.getClass();
                TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                tL_users_getUsers.id.add(messagesController.m1(a));
                ConnectionsManager.getInstance(messagesController.currentAccount).sendRequest(tL_users_getUsers, new y47(messagesController, (byte) 7));
                break;
            case 24:
                RectF rectF21 = ProfileActivity.Z6;
                profileActivity.E5.setVisibility(8);
                break;
            case 25:
                RectF rectF22 = ProfileActivity.Z6;
                profileActivity.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f1);
                bundle2.putLong("user_id", profileActivity.e1);
                profileActivity.presentFragment(new gw8(bundle2));
                break;
            case 26:
                RectF rectF23 = ProfileActivity.Z6;
                profileActivity.getClass();
                profileActivity.presentFragment(new me1(null));
                break;
            case 27:
                RectF rectF24 = ProfileActivity.Z6;
                profileActivity.F2();
                break;
            case 28:
                profileActivity.j3(true);
                break;
            default:
                profileActivity.j3(true);
                break;
        }
    }
}
