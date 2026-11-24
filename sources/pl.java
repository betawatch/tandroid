// default package

import android.content.Context;
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
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pl implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pl(String str, ArrayList arrayList) {
        this.a = (byte) 4;
        this.c = arrayList;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        byte b = 10;
        byte b2 = 25;
        byte b3 = 15;
        byte b4 = 18;
        byte b5 = 1;
        switch (this.a) {
            case 0:
                rl rlVar = (rl) this.b;
                kk7.f(rlVar.e).d(new ql(rlVar, (ArrayList) this.c, tLObject, null == true ? 1 : 0));
                break;
            case 1:
                gl.d3(new nn6((i20) this.b, (hd) this.c, tLObject, b));
                break;
            case 2:
                gl.d3(new nn6(tLObject, (na7) this.b, (xy9) this.c));
                break;
            case 3:
                na7 na7Var = (na7) this.b;
                x15 x15Var = (x15) this.c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    na7Var.a4(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < tL_contacts_found.users.size(); i++) {
                        TLRPC.User user = tL_contacts_found.users.get(i);
                        if (!user.self && !l7c.y(user) && !l7c.B(user.id)) {
                            arrayList.add(user);
                        }
                    }
                    gl.d3(new z20(x15Var, arrayList, b));
                    break;
                }
                break;
            case 4:
                gl.d3(new s67(tLObject, (ArrayList) this.c, (String) this.b, tL_error, (byte) 12));
                break;
            case 5:
                gl.d3(new nn6(b2, (ss0) this.b, (Context) this.c, tLObject));
                break;
            case 6:
                gl.d3(new s67((rs0) this.b, tLObject, (String) this.c, tL_error, (byte) 13));
                break;
            case 7:
                gl.d3(new nn6((byte) 26, this.b, this.c, tLObject));
                break;
            case 8:
                gl.d3(new fv0(this.b, (Object) tLObject, this.c, (byte) 6));
                break;
            case 9:
                gl.d3(new s67((b81) this.b, tL_error, tLObject, (Calendar) this.c, (byte) 19));
                break;
            case 10:
                eg1 eg1Var = (eg1) this.b;
                hd hdVar = (hd) this.c;
                eg1Var.getClass();
                gl.d3(new fv0((Object) eg1Var, (Object) tLObject, (Object) hdVar, (byte) 17));
                break;
            case 11:
                gl.d3(new fv0((lh1) this.b, tLObject, (akb) this.c, b4));
                break;
            case 12:
                gl.d3(new fv0(this.b, (Object) tLObject, this.c, (byte) 21));
                break;
            case 13:
                mu1 mu1Var = (mu1) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                mu1Var.getClass();
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    gl.d3(new ml1(mu1Var, !messages_messages.messages.isEmpty() ? ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset : ((TLRPC.messages_Messages) tLObject2).offset_id_offset, (byte) 5));
                    break;
                }
                break;
            case 14:
                gl.d3(new jn1((mu1) this.b, tLObject, (TLRPC.User) this.c, b5));
                break;
            case 15:
                gl.d3(new hn1((mu1) this.b, tLObject, tL_error, (ad7) this.c, (byte) 1));
                break;
            case 16:
                mu1 mu1Var2 = (mu1) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                mu1Var2.getClass();
                if (tL_error == null) {
                    mu1Var2.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                    gl.d3(new aj1(mu1Var2, tL_messages_sendScheduledMessages, (byte) 14));
                    break;
                } else if (tL_error.text != null) {
                    gl.d3(new aj1(mu1Var2, tL_error, b3));
                    break;
                }
                break;
            case 17:
                gl.d3(new jn1((ps1) this.b, tLObject, (k27) this.c, (byte) 3));
                break;
            case 18:
                gl.d3(new kx1((x02) this.b, (TLRPC.TL_attachMenuBot) this.c, (byte) 8));
                break;
            case 19:
                gl.d3(new kx1((x02) this.b, (q02) this.c, (byte) 7));
                break;
            case 20:
                p82 p82Var = (p82) this.b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.c;
                TLRPC.UserFull userFull = p82Var.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    p82Var.getMessagesStorage().g2(p82Var.E0, false);
                }
                gl.d3(new k82(p82Var, (byte) 2));
                break;
            case 21:
                gl.d3(new n92((x92) this.b, (hd[]) this.c, null == true ? 1 : 0));
                break;
            case 22:
                zc2 zc2Var = (zc2) this.b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.c;
                zc2Var.getClass();
                gl.d3(new hn1(zc2Var, tL_error, tLObject, twoStepVerificationActivity, (byte) 9));
                break;
            case 23:
                gl.d3(new jn1((vd2) this.b, tLObject, (akb) this.c, b4));
                break;
            case 24:
                gl.d3(new n92((mf2) this.b, (on7) this.c, b4));
                break;
            case 25:
                ConnectionsManager.lambda$sendRequestTyped$3((Executor) this.b, (i8c) this.c, tLObject, tL_error);
                break;
            case 26:
                qu2 qu2Var = (qu2) this.b;
                ak8 ak8Var = (ak8) this.c;
                if (tL_error == null) {
                    qu2Var.a0.clear();
                    qu2Var.Z.clear();
                    qu2Var.n0 = 0;
                    qu2Var.s = false;
                    qu2Var.e = false;
                    qu2Var.h = false;
                    qu2Var.b = false;
                    qu2Var.r = false;
                    qu2Var.w = "";
                    gl.d3(new gu2((Object) qu2Var, (Object) ak8Var, (byte) (null == true ? 1 : 0)));
                    break;
                } else {
                    gl.d3(ak8Var);
                    break;
                }
            case 27:
                qu2 qu2Var2 = (qu2) this.b;
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
                    qu2Var2.getMessagesController().Q3(updates, false);
                    for (int i3 = 0; i3 < updates.users.size(); i3++) {
                        TLRPC.User user3 = updates.users.get(i3);
                        if (user3.id == user2.id) {
                            Utilities.h.c(new gu2(qu2Var2, user3, b5));
                            TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                            tL_contact.user_id = user3.id;
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(tL_contact);
                            qu2Var2.getMessagesStorage().Z0(arrayList2, false);
                            if (!TextUtils.isEmpty(user3.phone)) {
                                qu2.m(0, user3.first_name, user3.last_name);
                                qu2Var2.getMessagesStorage().e(user3.phone, "");
                                nu2 nu2Var = (nu2) qu2Var2.a0.get(user3.phone);
                                if (nu2Var != null && (indexOf = nu2Var.g.indexOf(user3.phone)) != -1) {
                                    nu2Var.h.set(indexOf, 0);
                                }
                            }
                        }
                    }
                    gl.d3(new jn1(qu2Var2, updates, user2, (byte) 27));
                    break;
                }
                break;
            case 28:
                qu2 qu2Var3 = (qu2) this.b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) this.c;
                if (tLObject instanceof Vector) {
                    gl.d3(new jn1(qu2Var3, editor, (Vector) tLObject, b2));
                    break;
                }
                break;
            default:
                gl.d3(new mg3((zu3) this.b, tLObject, (k27) this.c, b3));
                break;
        }
    }

    public /* synthetic */ pl(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
