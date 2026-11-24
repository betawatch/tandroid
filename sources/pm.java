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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pm implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pm(String str, ArrayList arrayList) {
        this.a = (byte) 4;
        this.c = arrayList;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        byte b = 5;
        byte b2 = 19;
        byte b3 = 2;
        byte b4 = 27;
        byte b5 = 1;
        switch (this.a) {
            case 0:
                rm rmVar = (rm) this.b;
                nm7.f(rmVar.e).d(new qm(rmVar, (ArrayList) this.c, tLObject, null == true ? 1 : 0));
                break;
            case 1:
                gm.c3(new op6(this.b, this.c, (Object) tLObject, (byte) 10));
                break;
            case 2:
                gm.c3(new op6(tLObject, (oc7) this.b, (z0a) this.c));
                break;
            case 3:
                oc7 oc7Var = (oc7) this.b;
                u35 u35Var = (u35) this.c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    oc7Var.d4(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < tL_contacts_found.users.size(); i++) {
                        TLRPC.User user = tL_contacts_found.users.get(i);
                        if (!user.self && !m9c.z(user) && !m9c.C(user.id)) {
                            arrayList.add(user);
                        }
                    }
                    gm.c3(new x30(u35Var, arrayList, (byte) 11));
                    break;
                }
                break;
            case 4:
                gm.c3(new l97(tLObject, (ArrayList) this.c, (String) this.b, tL_error, (byte) 12));
                break;
            case 5:
                gm.c3(new op6(this.b, tLObject, this.c, (byte) 26));
                break;
            case 6:
                gm.c3(new l97((zt0) this.b, tLObject, (String) this.c, tL_error, (byte) 13));
                break;
            case 7:
                gm.c3(new op6(this.b, tLObject, this.c, b4));
                break;
            case 8:
                gm.c3(new tv0((q51) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, (byte) 7));
                break;
            case 9:
                gm.c3(new l97((k91) this.b, tL_error, tLObject, (Calendar) this.c, (byte) 19));
                break;
            case 10:
                mh1 mh1Var = (mh1) this.b;
                he heVar = (he) this.c;
                mh1Var.getClass();
                gm.c3(new tv0(mh1Var, tLObject, heVar, (byte) 18));
                break;
            case 11:
                gm.c3(new tv0((ti1) this.b, tLObject, (bmb) this.c, b2));
                break;
            case 12:
                gm.c3(new tv0((ik1) this.b, tLObject, (Activity) this.c, (byte) 22));
                break;
            case 13:
                yv1 yv1Var = (yv1) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                yv1Var.getClass();
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    gm.c3(new vm1(yv1Var, !messages_messages.messages.isEmpty() ? ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset : ((TLRPC.messages_Messages) tLObject2).offset_id_offset, b));
                    break;
                }
                break;
            case 14:
                gm.c3(new co1(this.b, (Object) tLObject, this.c, (byte) 3));
                break;
            case 15:
                yv1 yv1Var2 = (yv1) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                yv1Var2.getClass();
                if (tL_error == null) {
                    yv1Var2.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    gm.c3(new uj1(yv1Var2, tL_messages_sendScheduledMessages, (byte) 15));
                    break;
                } else if (tL_error.text != null) {
                    gm.c3(new uj1(yv1Var2, tL_error, (byte) 16));
                    break;
                }
                break;
            case 16:
                gm.c3(new xo1((yv1) this.b, tLObject, tL_error, (cf7) this.c, (byte) 1));
                break;
            case 17:
                gm.c3(new co1((bu1) this.b, tLObject, (k47) this.c, b));
                break;
            case 18:
                gm.c3(new lx1((i22) this.b, (TLRPC.TL_attachMenuBot) this.c, (byte) 9));
                break;
            case 19:
                gm.c3(new lx1((i22) this.b, (b22) this.c, (byte) 8));
                break;
            case 20:
                ba2 ba2Var = (ba2) this.b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.c;
                TLRPC.UserFull userFull = ba2Var.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    ba2Var.getMessagesStorage().g2(ba2Var.E0, false);
                }
                gm.c3(new v92(ba2Var, b3));
                break;
            case 21:
                gm.c3(new ra2((ib2) this.b, (he[]) this.c, b5));
                break;
            case 22:
                ke2 ke2Var = (ke2) this.b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.c;
                ke2Var.getClass();
                gm.c3(new xo1(ke2Var, tL_error, tLObject, twoStepVerificationActivity, (byte) 9));
                break;
            case 23:
                gm.c3(new co1(this.b, (Object) tLObject, this.c, (byte) 20));
                break;
            case 24:
                gm.c3(new ra2((yg2) this.b, (ge7) this.c, b2));
                break;
            case 25:
                ConnectionsManager.lambda$sendRequestTyped$3((Executor) this.b, (jac) this.c, tLObject, tL_error);
                break;
            case 26:
                bw2 bw2Var = (bw2) this.b;
                dm8 dm8Var = (dm8) this.c;
                if (tL_error == null) {
                    bw2Var.a0.clear();
                    bw2Var.Z.clear();
                    bw2Var.n0 = 0;
                    bw2Var.s = false;
                    bw2Var.e = false;
                    bw2Var.h = false;
                    bw2Var.b = false;
                    bw2Var.r = false;
                    bw2Var.w = "";
                    gm.c3(new mv2(bw2Var, dm8Var, b5));
                    break;
                } else {
                    gm.c3(dm8Var);
                    break;
                }
            case 27:
                bw2 bw2Var2 = (bw2) this.b;
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
                    bw2Var2.getMessagesController().T3(updates, false);
                    for (int i3 = 0; i3 < updates.users.size(); i3++) {
                        TLRPC.User user3 = updates.users.get(i3);
                        if (user3.id == user2.id) {
                            Utilities.h.c(new mv2(bw2Var2, user3, b3));
                            TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                            tL_contact.user_id = user3.id;
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(tL_contact);
                            bw2Var2.getMessagesStorage().Z0(arrayList2, false);
                            if (!TextUtils.isEmpty(user3.phone)) {
                                bw2.m(0, user3.first_name, user3.last_name);
                                bw2Var2.getMessagesStorage().e(user3.phone, "");
                                yv2 yv2Var = (yv2) bw2Var2.a0.get(user3.phone);
                                if (yv2Var != null && (indexOf = yv2Var.g.indexOf(user3.phone)) != -1) {
                                    yv2Var.h.set(indexOf, 0);
                                }
                            }
                        }
                    }
                    gm.c3(new co1((Object) bw2Var2, (Object) updates, (Object) user2, (byte) 29));
                    break;
                }
                break;
            case 28:
                bw2 bw2Var3 = (bw2) this.b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.c;
                if (tLObject instanceof Vector) {
                    gm.c3(new co1(bw2Var3, editor, (Vector) tLObject, b4));
                    break;
                }
                break;
            default:
                gm.c3(new pz2((kw3) this.b, tLObject, (k47) this.c, (byte) 17));
                break;
        }
    }

    public /* synthetic */ pm(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
