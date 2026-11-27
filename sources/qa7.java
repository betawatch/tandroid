// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qa7 implements RequestDelegate {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ fn7 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qa7(uc7 uc7Var, int i, TLRPC.Chat chat, TLRPC.User user, boolean z) {
        this.d = uc7Var;
        this.b = i;
        this.e = chat;
        this.f = user;
        this.c = z;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        fn7 fn7Var = this.d;
        switch (b) {
            case 0:
                uc7 uc7Var = (uc7) fn7Var;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                uc7Var.getClass();
                if (tL_error == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.b));
                    uc7Var.getMessagesStorage().Z1(chat != null ? -chat.id : user.id, arrayList, !this.c, -1, 0, false, null);
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 1:
                hl.c3(new q25((e) fn7Var, obj2, this.b, obj, this.c, tLObject, (byte) 1));
                break;
            default:
                hl.c3(new q25((e) fn7Var, obj2, this.b, (Object) tLObject, this.c, (TLObject) obj, (byte) 2));
                break;
        }
    }

    public /* synthetic */ qa7(lm7 lm7Var, jm7 jm7Var, int i, String str, boolean z) {
        this.d = lm7Var;
        this.e = jm7Var;
        this.b = i;
        this.f = str;
        this.c = z;
    }

    public /* synthetic */ qa7(l98 l98Var, String str, int i, boolean z, TLRPC.User user) {
        this.d = l98Var;
        this.e = str;
        this.b = i;
        this.c = z;
        this.f = user;
    }
}
