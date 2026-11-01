package vh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.k20;
import org.telegram.messenger.kj;
import org.telegram.messenger.qp;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.q51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b5 implements k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f5 b;

    public /* synthetic */ b5(f5 f5Var, int i10) {
        this.a = i10;
        this.b = f5Var;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        boolean z10 = false;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                q51 q51Var = (q51) obj2;
                f5 f5Var = this.b;
                qp qpVar = f5Var.W1;
                q51Var.F = 1;
                int L = org.telegram.messenger.i0.L(64.0f);
                arrayList.add(b51.D(org.telegram.messenger.i0.L(64.0f)));
                if (f5Var.R1 || f5Var.Z1) {
                    L += f5Var.d1(true, arrayList, dd.L0(2131753905, null), f5Var.T1, false, false, -1);
                }
                if (!f5Var.R1) {
                    if (TextUtils.isEmpty(f5Var.j2) && !f5Var.Z1) {
                        q51Var.V();
                        b51 c10 = b51.c(1, R.drawable.msg2_folder, dd.L0(2131744628, null));
                        c10.q = true;
                        arrayList.add(c10);
                        q51Var.U();
                        L += org.telegram.messenger.i0.L(50.0f);
                    }
                    if (!f5Var.Z1 && qpVar != null) {
                        L += f5Var.d1(true, arrayList, dd.L0(2131753904, null), qpVar.c, qpVar.f, !qpVar.e, 2);
                    }
                    L = L + f5Var.d1(false, arrayList, dd.L0(2131753907, null), f5Var.U1, f5Var.n2 || f5Var.m2, f5Var.l2, 3) + f5Var.d1(false, arrayList, dd.L0(2131753906, null), f5Var.V1, f5Var.u2 || f5Var.t2, f5Var.s2, 4);
                }
                if (arrayList.size() <= ((f5Var.R1 || !TextUtils.isEmpty(f5Var.j2) || f5Var.Z1) ? 1 : 2)) {
                    if (TextUtils.isEmpty(f5Var.j2)) {
                        String L0 = dd.L0(2131748260, null);
                        String L02 = dd.L0(2131748261, null);
                        int i10 = ki.b;
                        b51 K = b51.K(ki.class);
                        K.l = L0;
                        K.m = L02;
                        arrayList.add(K);
                    } else {
                        String L03 = dd.L0(2131748260, null);
                        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(dd.a0(null, null, f5Var.j2.length() >= 3 ? 2131748258 : 2131748259, f5Var.j2));
                        int i11 = ki.b;
                        b51 K2 = b51.K(ki.class);
                        K2.l = L03;
                        K2.m = W2;
                        arrayList.add(K2);
                    }
                }
                arrayList.add(b51.C(null));
                arrayList.add(b51.D(Math.max(0, org.telegram.messenger.i0.L(24.0f) + (((org.telegram.messenger.i0.q.y - (org.telegram.messenger.i0.L(12.0f) + L)) - org.telegram.messenger.i0.m) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()))));
                break;
            default:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                f5 f5Var2 = this.b;
                ArrayList arrayList2 = f5Var2.V1;
                f5Var2.t2 = false;
                f5Var2.u2 = false;
                if (messages_botresults == null) {
                    f5Var2.h2.O(true);
                    break;
                } else {
                    wp.r1(f5Var2.a).V3(messages_botresults.users, false);
                    ArrayList<TLRPC.BotInlineResult> arrayList3 = messages_botresults.results;
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TLRPC.BotInlineResult botInlineResult = arrayList3.get(i12);
                        i12++;
                        TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                        if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                            TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                            if (tL_botInlineMediaResult.document != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                int i13 = f5Var2.A2;
                                f5Var2.A2 = i13 - 1;
                                tL_message.id = i13;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = e20.i(f5Var2.a).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                arrayList2.add(new kj(f5Var2.a, tL_message, false, true));
                            }
                        }
                    }
                    f5Var2.r2 = messages_botresults.next_offset;
                    if (!arrayList2.isEmpty() && !TextUtils.isEmpty(f5Var2.r2)) {
                        z10 = true;
                    }
                    f5Var2.s2 = z10;
                    f5Var2.h2.O(true);
                    break;
                }
                break;
        }
    }
}
