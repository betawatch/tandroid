// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sm2 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xm2 b;

    public /* synthetic */ sm2(xm2 xm2Var, byte b) {
        this.a = b;
        this.b = xm2Var;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        String M0;
        byte b = this.a;
        xm2 xm2Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.add(c4c.l(0, xm2Var.h));
                c4c c = c4c.c(1, R.drawable.msg_groups_create, k96.M0(2131751927, null));
                c.r = true;
                arrayList.add(c);
                arrayList.add(c4c.E(2, gl.L(14.0f)));
                ArrayList arrayList2 = xm2Var.n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(c4c.t(3, k96.M0(2131751957, null)));
                    ArrayList arrayList3 = xm2Var.n;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        Object obj3 = arrayList3.get(i);
                        i++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull L0 = xm2Var.getMessagesController().L0(chat.id);
                        c4c w = c4c.w(chat);
                        long j = chat.id;
                        w.d = (int) (j ^ (j >>> 32));
                        if (L0 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = L0.linked_peers;
                            M0 = k96.G(arrayList4 != null ? arrayList4.size() : 0, "Chats", new Object[0]);
                        } else {
                            M0 = k96.M0(2131748587, null);
                        }
                        w.n = M0;
                        arrayList.add(w);
                    }
                    break;
                }
                break;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    no2.d(0, xm2Var.b, xm2Var);
                    break;
                } else {
                    u21.b0(xm2Var).g0(tL_error, false);
                    break;
                }
        }
    }
}
