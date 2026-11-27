// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class yu2 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yu2(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                lv2 lv2Var = (lv2) obj;
                ArrayList arrayList = lv2Var.x;
                if (tL_error == null) {
                    TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
                    int i = 0;
                    if (j != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                        lv2Var.h = true;
                        if (!arrayList.isEmpty() && lv2Var.r) {
                            lv2Var.c(arrayList, null, null, null);
                            arrayList.clear();
                        }
                        lv2Var.getUserConfig().r = (int) (System.currentTimeMillis() / 1000);
                        lv2Var.getUserConfig().u(false);
                        hl.c3(new pu2(lv2Var, (byte) 7));
                        if (f11.a) {
                            cc4.b("load contacts don't change");
                            break;
                        }
                    } else {
                        lv2Var.getUserConfig().h = contacts_contacts.saved_count;
                        lv2Var.getUserConfig().u(false);
                        hl.c3(new av2(lv2Var, contacts_contacts.users, i, contacts_contacts.contacts, (byte) 0));
                        break;
                    }
                }
                break;
            case 1:
                uc6 uc6Var = (uc6) obj;
                if (tLObject != null) {
                    hl.c3(new ue2(uc6Var, tLObject, this.b, (byte) 28));
                    break;
                }
                break;
            case 2:
                id6 id6Var = (id6) obj;
                if (tL_error == null) {
                    hl.c3(new ue2(id6Var, this.b, tLObject, (byte) 1));
                    break;
                }
                break;
            case 3:
                hl.c3(new cq6(obj, (Object) tLObject, this.b, (byte) 23));
                break;
            case 4:
                wx9 wx9Var = (wx9) obj;
                if (j != 0) {
                    wx9Var.getMessagesStorage().n1(j);
                    break;
                }
                break;
            case 5:
                r7a r7aVar = (r7a) obj;
                if (tL_error == null) {
                    r7aVar.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                }
                if (j != 0) {
                    r7aVar.getMessagesStorage().n1(j);
                    break;
                }
                break;
            case 6:
                hl.c3(new cq6(obj, this.b, (Object) tLObject, (byte) 29));
                break;
            default:
                qyb qybVar = (qyb) obj;
                qybVar.getClass();
                hl.c3(new z5b(qybVar, this.b, tLObject, (byte) 6));
                break;
        }
    }
}
