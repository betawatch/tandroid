package th;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ b(g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        String string;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                g gVar = this.b;
                f fVar = gVar.f;
                h51 h51Var = new h51(-4);
                h51Var.d = 0;
                h51Var.c = fVar;
                h51Var.z = -1;
                arrayList.add(h51Var);
                h51 c3 = h51.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                c3.q = true;
                arrayList.add(c3);
                arrayList.add(h51.D(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = gVar.h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(h51.s(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = gVar.h;
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj3 = arrayList3.get(i10);
                        i10++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = gVar.getMessagesController().getChatFull(chat.id);
                        h51 v = h51.v(chat);
                        long j10 = chat.id;
                        v.d = (int) (j10 ^ (j10 >>> 32));
                        if (chatFull != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = chatFull.linked_peers;
                            string = LocaleController.formatPluralString("Chats", arrayList4 != null ? arrayList4.size() : 0, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.Loading);
                        }
                        v.m = string;
                        arrayList.add(v);
                    }
                    break;
                }
                break;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                g gVar2 = this.b;
                if (tL_error == null) {
                    o0.d(gVar2, gVar2.a, 0);
                    break;
                } else {
                    gVar2.getClass();
                    qc.a0(gVar2).d0(tL_error, false);
                    break;
                }
        }
    }
}
