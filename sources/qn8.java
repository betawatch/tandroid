// default package

import android.graphics.RectF;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class qn8 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qn8(Object obj, Object obj2, id idVar, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = idVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = 26;
        r47 r47Var = null;
        r2 = null;
        r2 = null;
        ok1 ok1Var = null;
        r47Var = null;
        char c = 1;
        switch (this.a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                id idVar = (id) this.c;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.d;
                privacySettingsActivity.getClass();
                hl.c3(new oy6(privacySettingsActivity, idVar, tLObject, setaccountttl, (byte) 26));
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                uq8 uq8Var = (uq8) this.d;
                RectF rectF = ProfileActivity.Z6;
                hl.c3(new cp7((Object) profileActivity, (Object) tLObject, (Object) tL_username, (Object) uq8Var, (Object) tL_error, (byte) 11));
                break;
            case 2:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                String str = (String) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF2 = ProfileActivity.Z6;
                hl.c3(new cp7((Object) profileActivity2, (Object) tLObject, (Object) str, (Object) user, (Object) tL_error, (byte) 12));
                break;
            case 3:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF3 = ProfileActivity.Z6;
                hl.c3(new cp7((Object) profileActivity3, (Object) tLObject, (Object) userFull, (Object) tL_birthday, (Object) tL_error, (byte) 13));
                break;
            case 4:
                hl.c3(new vp8(this.b, (Object) tLObject, this.c, this.d, (byte) 2));
                break;
            case 5:
                hl.c3(new cp7(this.b, (Object) tLObject, (ArrayList) this.c, this.d, (Object) tL_error, (byte) 16));
                break;
            case 6:
                hl.c3(new cp7(this.b, (Object) tL_error, (Object) tLObject, this.c, this.d, (byte) 19));
                break;
            case 7:
                hl.c3(new cp7(this.b, (Object) tLObject, this.c, (Object) tL_error, this.d, (byte) 21));
                break;
            case 8:
                hl.c3(new vp8(this.b, (Object) tLObject, this.c, this.d, (byte) 16));
                break;
            case 9:
                r7a r7aVar = (r7a) this.b;
                e eVar = (e) this.c;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.d;
                if (tL_error != null) {
                    hl.c3(new z6a(r7aVar, tL_error, eVar, tL_messages_editMessage, (byte) 1));
                    break;
                } else {
                    r7aVar.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 10:
                hl.c3(new x5a((r7a) this.b, (String) this.c, (List) this.d, c == true ? 1 : 0));
                break;
            case 11:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                id idVar2 = (id) this.c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                sessionsActivity.getClass();
                hl.c3(new vp8(sessionsActivity, idVar2, tL_error, (TLObject) tL_authorization, (byte) 20));
                break;
            case 12:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.b;
                id idVar3 = (id) this.c;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.d;
                sessionsActivity2.getClass();
                hl.c3(new vp8(sessionsActivity2, idVar3, tL_error, (TLObject) tL_webAuthorization, (byte) 19));
                break;
            case 13:
                hl.c3(new vp8((Object) tLObject, this.b, this.c, this.d, (byte) 23));
                break;
            case 14:
                wua wuaVar = (wua) this.b;
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) this.d;
                id idVar4 = (id) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    uc7.s1(wuaVar.a).j4(messages_messages.users, false);
                    uc7.s1(wuaVar.a).c4(messages_messages.chats, false);
                    int i = 0;
                    while (true) {
                        if (i < messages_messages.messages.size()) {
                            TLRPC.Message message = messages_messages.messages.get(i);
                            if (message == null || (message instanceof TLRPC.TL_messageEmpty) || message.id != tL_messageActionStarGift.upgrade_msg_id) {
                                i++;
                            } else {
                                r47Var = new r47(wuaVar.a, message, false, false);
                                r47Var.K5();
                            }
                        }
                    }
                }
                if (r47Var == null) {
                    hl.c3(new uc(idVar4, (byte) 6));
                    break;
                } else {
                    hl.c3(new jr9(wuaVar, idVar4, r47Var, b));
                    break;
                }
                break;
            case 15:
                wua wuaVar2 = (wua) this.b;
                l01 l01Var = (l01) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        if (!tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                            hl.c3(new jr9((Object) wuaVar2, (Object) l01Var, (Object) tL_error, (byte) 23));
                            break;
                        } else {
                            hl.c3(new cq6((Object) wuaVar2, (Object) l01Var, Long.parseLong(tL_error.text.substring(26)), (byte) 26));
                            break;
                        }
                    }
                } else {
                    uc7.s1(wuaVar2.a).Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(new jr9((Object) wuaVar2, (Object) l01Var, (Object) tL_starGiftUnique, (byte) 22));
                    break;
                }
                break;
            case 16:
                hl.c3(new vp8(this.b, (Object) tLObject, this.c, this.d, (byte) 26));
                break;
            case 17:
                hl.c3(new cp7(this.b, (Object) tL_error, this.c, (Object) tLObject, this.d, (byte) 29));
                break;
            case 18:
                hl.c3(new cp7(this.b, (Object) tL_error, this.c, (Object) tLObject, this.d, (byte) 26));
                break;
            case 19:
                hl.c3(new cp7(this.b, (Object) tL_error, this.c, (Object) tLObject, this.d, (byte) 25));
                break;
            case 20:
                h1b h1bVar = (h1b) this.b;
                String str2 = (String) this.c;
                v1b v1bVar = (v1b) this.d;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        i1b i1bVar = h1bVar.r;
                        ok1Var = w1b.e0(jSONObject, i1bVar.i, i1bVar == h1bVar.x.x);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(h1bVar.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                hl.c3(new kta((Object) h1bVar, (Object) ok1Var, (Object) str2, (Object) v1bVar, (byte) 1));
                break;
            case 21:
                hl.c3(new uwa((s4b) this.b, (String) this.c, tL_error, tLObject, (TextView) this.d, (byte) 2));
                break;
            case 22:
                hl.c3(new uwa((r9b) this.b, (id) this.c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error, (byte) 4));
                break;
            case 23:
                hl.c3(new uwa((ueb) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, (byte) 5));
                break;
            case 24:
                hl.c3(new kta((Object) tLObject, this.b, this.c, this.d, (byte) 11));
                break;
            case 25:
                hl.c3(new kta(this.b, (Object) tLObject, this.d, this.c, (byte) 13));
                break;
            case 26:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    hl.c3(new bcb((Object) twoStepVerificationActivity, (Object) tL_error, (byte) 25));
                    break;
                } else {
                    Utilities.e.c(new kta((Object) twoStepVerificationActivity, (Object) bArr, (Object) tLObject, (Object) bArr2, (byte) 18));
                    break;
                }
            case 27:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$48((TL_phone.PhoneCall) this.c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                break;
            case 28:
                VoIPService.lambda$startConferenceGroupCall$52((ArrayList) this.b, (ArrayList) this.c, (plc) this.d, tLObject, tL_error);
                break;
            default:
                VoIPService.lambda$startConferenceGroupCall$44((ArrayList) this.b, (ArrayList) this.c, (plc) this.d, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ qn8(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
