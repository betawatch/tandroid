// default package

import android.app.Activity;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.Executor;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ql implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ql(String str, ArrayList arrayList) {
        this.a = (byte) 4;
        this.c = arrayList;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        byte b = 11;
        byte b2 = 7;
        byte b3 = 22;
        byte b4 = 29;
        byte b5 = 19;
        switch (this.a) {
            case 0:
                sl slVar = (sl) this.b;
                jn7.f(slVar.e).d(new rl(slVar, (ArrayList) this.c, tLObject, null == true ? 1 : 0));
                break;
            case 1:
                hl.c3(new es6(this.b, this.c, (Object) tLObject, (byte) 10));
                break;
            case 2:
                hl.c3(new es6(tLObject, (uc7) this.b, (r2a) this.c));
                break;
            case 3:
                uc7 uc7Var = (uc7) this.b;
                v35 v35Var = (v35) this.c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    uc7Var.j4(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < tL_contacts_found.users.size(); i++) {
                        TLRPC.User user = tL_contacts_found.users.get(i);
                        if (!user.self && !lbc.z(user) && !lbc.C(user.id)) {
                            arrayList.add(user);
                        }
                    }
                    hl.c3(new a30(v35Var, arrayList, b));
                    break;
                }
                break;
            case 4:
                hl.c3(new o97(tLObject, (ArrayList) this.c, (String) this.b, tL_error, (byte) 12));
                break;
            case 5:
                hl.c3(new es6(this.b, tLObject, this.c, (byte) 26));
                break;
            case 6:
                hl.c3(new o97((zs0) this.b, tLObject, (String) this.c, tL_error, (byte) 13));
                break;
            case 7:
                hl.c3(new es6(this.b, tLObject, this.c, (byte) 27));
                break;
            case 8:
                hl.c3(new tu0((r41) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, b2));
                break;
            case 9:
                hl.c3(new o97((j81) this.b, tL_error, tLObject, (Calendar) this.c, (byte) 19));
                break;
            case 10:
                ng1 ng1Var = (ng1) this.b;
                id idVar = (id) this.c;
                ng1Var.getClass();
                hl.c3(new tu0(ng1Var, tLObject, idVar, (byte) 18));
                break;
            case 11:
                hl.c3(new tu0((uh1) this.b, tLObject, (znb) this.c, b5));
                break;
            case 12:
                hl.c3(new tu0((ij1) this.b, tLObject, (Activity) this.c, b3));
                break;
            case 13:
                zu1 zu1Var = (zu1) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                zu1Var.getClass();
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    hl.c3(new ul1(zu1Var, !messages_messages.messages.isEmpty() ? ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset : ((TLRPC.messages_Messages) tLObject2).offset_id_offset, (byte) 4));
                    break;
                }
                break;
            case 14:
                hl.c3(new on1((zu1) this.b, tLObject, (TLRPC.User) this.c, null == true ? 1 : 0));
                break;
            case 15:
                hl.c3(new ao1((zu1) this.b, tLObject, tL_error, (kf7) this.c, (byte) 0));
                break;
            case 16:
                zu1 zu1Var2 = (zu1) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                zu1Var2.getClass();
                if (tL_error == null) {
                    zu1Var2.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(new jj1(zu1Var2, tL_messages_sendScheduledMessages, b));
                    break;
                } else if (tL_error.text != null) {
                    hl.c3(new jj1(zu1Var2, tL_error, (byte) 12));
                    break;
                }
                break;
            case 17:
                hl.c3(new on1((ct1) this.b, tLObject, (r47) this.c, (byte) 5));
                break;
            case 18:
                hl.c3(new dy1((n12) this.b, (g12) this.c, b2));
                break;
            case 19:
                hl.c3(new dy1((n12) this.b, (TLRPC.TL_attachMenuBot) this.c, (byte) 8));
                break;
            case 20:
                g92 g92Var = (g92) this.b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.c;
                TLRPC.UserFull userFull = g92Var.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    g92Var.getMessagesStorage().l2(g92Var.E0, false);
                }
                hl.c3(new b92(g92Var, (byte) 2));
                break;
            case 21:
                hl.c3(new dy1((na2) this.b, (id[]) this.c, b4));
                break;
            case 22:
                pd2 pd2Var = (pd2) this.b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.c;
                pd2Var.getClass();
                hl.c3(new ao1(pd2Var, tL_error, tLObject, twoStepVerificationActivity, false, (byte) 9));
                break;
            case 23:
                hl.c3(new on1((me2) this.b, tLObject, (znb) this.c, b3));
                break;
            case 24:
                hl.c3(new ea2((dg2) this.b, (oe7) this.c, (byte) 17));
                break;
            case 25:
                ConnectionsManager.lambda$sendRequestTyped$3((Executor) this.b, (icc) this.c, tLObject, tL_error);
                break;
            case 26:
                lv2 lv2Var = (lv2) this.b;
                on8 on8Var = (on8) this.c;
                if (tL_error == null) {
                    lv2Var.a0.clear();
                    lv2Var.Z.clear();
                    lv2Var.n0 = 0;
                    lv2Var.s = false;
                    lv2Var.e = false;
                    lv2Var.h = false;
                    lv2Var.b = false;
                    lv2Var.r = false;
                    lv2Var.w = "";
                    hl.c3(new ea2(lv2Var, on8Var, b4));
                    break;
                } else {
                    hl.c3(on8Var);
                    break;
                }
            case 27:
                lv2 lv2Var2 = (lv2) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                    if (userProfilePhoto != null && userProfilePhoto.personal) {
                        for (int i2 = 0; i2 < updates.users.size(); i2++) {
                            if (updates.users.get(i2).id == user2.id) {
                                updates.users.get(i2).photo = user2.photo;
                            }
                        }
                    }
                    lv2Var2.getMessagesController().Y3(updates, false);
                    for (int i3 = 0; i3 < updates.users.size(); i3++) {
                        TLRPC.User user3 = updates.users.get(i3);
                        if (user3.id == user2.id) {
                            Utilities.h.c(new bv2((Object) lv2Var2, (Object) user3, (byte) (null == true ? 1 : 0)));
                            TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                            tL_contact.user_id = user3.id;
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(tL_contact);
                            lv2Var2.getMessagesStorage().d1(arrayList2, false);
                            if (!TextUtils.isEmpty(user3.phone)) {
                                lv2.m(0, user3.first_name, user3.last_name);
                                lv2Var2.getMessagesStorage().e(user3.phone, "");
                                iv2 iv2Var = (iv2) lv2Var2.a0.get(user3.phone);
                                if (iv2Var != null && (indexOf = iv2Var.g.indexOf(user3.phone)) != -1) {
                                    iv2Var.h.set(indexOf, 0);
                                }
                            }
                        }
                    }
                    hl.c3(new cv2(lv2Var2, updates, user2, null == true ? 1 : 0));
                    break;
                }
                break;
            case 28:
                lv2 lv2Var3 = (lv2) this.b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.c;
                if (tLObject instanceof Vector) {
                    hl.c3(new cv2(lv2Var3, editor, (Vector) tLObject, (byte) 1));
                    break;
                }
                break;
            default:
                hl.c3(new cv2((tv3) this.b, tLObject, (r47) this.c, b5));
                break;
        }
    }

    public /* synthetic */ ql(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
