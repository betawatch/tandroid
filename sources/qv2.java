// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class qv2 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qv2(Object obj, long j, byte b) {
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
                bw2 bw2Var = (bw2) obj;
                ArrayList arrayList = bw2Var.x;
                if (tL_error == null) {
                    TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
                    int i = 0;
                    if (j != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                        bw2Var.h = true;
                        if (!arrayList.isEmpty() && bw2Var.r) {
                            bw2Var.c(arrayList, null, null, null);
                            arrayList.clear();
                        }
                        bw2Var.getUserConfig().r = (int) (System.currentTimeMillis() / 1000);
                        bw2Var.getUserConfig().u(false);
                        gm.c3(new hv2(bw2Var, (byte) 6));
                        if (e21.a) {
                            fc4.b("load contacts don't change");
                            break;
                        }
                    } else {
                        bw2Var.getUserConfig().h = contacts_contacts.saved_count;
                        bw2Var.getUserConfig().u(false);
                        gm.c3(new sv2(bw2Var, contacts_contacts.users, i, contacts_contacts.contacts, (byte) 0));
                        break;
                    }
                }
                break;
            case 1:
                pc6 pc6Var = (pc6) obj;
                if (tLObject != null) {
                    gm.c3(new of2(pc6Var, tLObject, this.b, (byte) 28));
                    break;
                }
                break;
            case 2:
                dd6 dd6Var = (dd6) obj;
                if (tL_error == null) {
                    gm.c3(new of2(dd6Var, this.b, tLObject, (byte) 1));
                    break;
                }
                break;
            case 3:
                gm.c3(new hq6(obj, (Object) tLObject, this.b, (byte) 23));
                break;
            case 4:
                dw9 dw9Var = (dw9) obj;
                if (j != 0) {
                    dw9Var.getMessagesStorage().n1(j);
                    break;
                }
                break;
            case 5:
                a6a a6aVar = (a6a) obj;
                if (tL_error == null) {
                    a6aVar.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                }
                if (j != 0) {
                    a6aVar.getMessagesStorage().n1(j);
                    break;
                }
                break;
            case 6:
                gm.c3(new hq6(obj, this.b, (Object) tLObject, (byte) 29));
                break;
            default:
                qwb qwbVar = (qwb) obj;
                qwbVar.getClass();
                gm.c3(new e4b(qwbVar, this.b, tLObject, (byte) 6));
                break;
        }
    }
}
