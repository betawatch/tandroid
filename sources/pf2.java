// default package

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class pf2 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pf2(uf2 uf2Var, int[] iArr, ArrayList arrayList, boolean z, TLRPC.User user) {
        this.a = (byte) 0;
        this.d = uf2Var;
        this.e = iArr;
        this.b = arrayList;
        this.c = z;
        this.f = user;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        TL_iv.TL_inputRichMessage tL_inputRichMessage;
        byte b = 23;
        byte b2 = 2;
        switch (this.a) {
            case 0:
                uf2 uf2Var = (uf2) this.d;
                int[] iArr = (int[]) this.e;
                ArrayList arrayList = (ArrayList) this.b;
                boolean z = this.c;
                TLRPC.User user = (TLRPC.User) this.f;
                uf2Var.getClass();
                gl.c3(new o2a(uf2Var, tL_error, tLObject, iArr, arrayList, z, user));
                break;
            case 1:
                qu2 qu2Var = (qu2) this.d;
                ArrayList arrayList2 = (ArrayList) this.b;
                ArrayList arrayList3 = (ArrayList) this.e;
                boolean z2 = this.c;
                String str = (String) this.f;
                if (tL_error == null) {
                    qu2Var.getMessagesController().R3((TLRPC.Updates) tLObject, false);
                    ad7 messagesStorage = qu2Var.getMessagesStorage();
                    messagesStorage.getClass();
                    if (!arrayList2.isEmpty()) {
                        messagesStorage.a.c(new i41(messagesStorage, arrayList2, b));
                    }
                    Utilities.h.c(new fu2(qu2Var, arrayList3, b2));
                    for (int i = 0; i < arrayList3.size(); i++) {
                        TLRPC.User user2 = (TLRPC.User) arrayList3.get(i);
                        if (!TextUtils.isEmpty(user2.phone)) {
                            qu2Var.getMessagesStorage().e(user2.phone, "");
                            nu2 nu2Var = (nu2) qu2Var.a0.get(user2.phone);
                            if (nu2Var != null && (indexOf = nu2Var.g.indexOf(user2.phone)) != -1) {
                                nu2Var.h.set(indexOf, 1);
                            }
                        }
                    }
                    gl.c3(new rg((Object) qu2Var, (Object) arrayList3, z2, (Object) str, (byte) 14));
                    break;
                }
                break;
            case 2:
                xy6 xy6Var = (xy6) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                boolean z3 = this.c;
                TLRPC.User user3 = (TLRPC.User) this.f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.b;
                if (tL_error == null) {
                    na7.q1(xy6Var.k).R3((TLRPC.TL_updates) tLObject, false);
                }
                gl.c3(new o2a(xy6Var, tL_error, tLObject, tL_chatInviteImporter, z3, user3, tL_messages_hideChatJoinRequest));
                break;
            case 3:
                gl.c3(new z2a(this.d, (Object) tLObject, this.e, this.b, (Serializable) this.f, this.c, (byte) 0));
                break;
            case 4:
                z3a z3aVar = (z3a) this.d;
                boolean z4 = this.c;
                k27 k27Var = (k27) this.e;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.b;
                d dVar = (d) this.f;
                if (tL_error == null) {
                    if (z4 && k27Var != null) {
                        k27Var.A2 = true;
                    }
                    z3aVar.getMessagesController().R3((TLRPC.Updates) tLObject, false);
                    gl.c3(new os1(z3aVar, k27Var));
                    break;
                } else {
                    if (ab4.r(tL_error.text)) {
                        String str2 = tL_error.text;
                        z77 z77Var = new z77(z3aVar, tL_messages_editMessage, k27Var, dVar, z4);
                        if (k27Var != null && (tL_inputRichMessage = tL_messages_editMessage.rich_message) != null) {
                            ArrayList arrayList4 = new ArrayList(tL_inputRichMessage.documents.size() + tL_inputRichMessage.photos.size());
                            arrayList4.addAll(tL_inputRichMessage.photos);
                            arrayList4.addAll(tL_inputRichMessage.documents);
                            if (!arrayList4.isEmpty()) {
                                int c = ab4.c(str2);
                                if (c < 0 || c >= arrayList4.size()) {
                                    c = 0;
                                }
                                z3aVar.getFileRefController().u(new Object[]{arrayList4.get(c), z77Var}, k27Var);
                                break;
                            }
                        }
                    }
                    gl.c3(new tj9(z3aVar, k27Var, b));
                    if (dVar != null) {
                        gl.c3(new t1a(z3aVar, tL_error, dVar, tL_messages_editMessage, (byte) 1));
                        break;
                    }
                }
                break;
            default:
                gl.c3(new o2a((p3c) this.d, tL_error, this.c, tLObject, (byte[]) this.e, (String) this.b, (TL_account.passwordInputSettings) this.f));
                break;
        }
    }

    public /* synthetic */ pf2(qu2 qu2Var, ArrayList arrayList, ArrayList arrayList2, boolean z, String str) {
        this.a = (byte) 1;
        this.d = qu2Var;
        this.b = arrayList;
        this.e = arrayList2;
        this.c = z;
        this.f = str;
    }

    public /* synthetic */ pf2(xy6 xy6Var, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.a = (byte) 2;
        this.d = xy6Var;
        this.e = tL_chatInviteImporter;
        this.c = z;
        this.f = user;
        this.b = tL_messages_hideChatJoinRequest;
    }

    public /* synthetic */ pf2(z3a z3aVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, mu1 mu1Var, String str, boolean z) {
        this.a = (byte) 3;
        this.d = z3aVar;
        this.e = tL_messages_requestUrlAuth;
        this.b = mu1Var;
        this.f = str;
        this.c = z;
    }

    public /* synthetic */ pf2(Object obj, boolean z, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.c = z;
        this.e = obj2;
        this.b = obj3;
        this.f = obj4;
    }
}
