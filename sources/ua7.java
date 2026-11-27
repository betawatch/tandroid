// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua7 implements icc {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ fn7 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ua7(uc7 uc7Var, long j, e eVar, TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights, boolean z) {
        this.d = uc7Var;
        this.c = j;
        this.e = eVar;
        this.f = tL_messages_editChatDefaultBannedRights;
        this.b = z;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.f;
        boolean z = this.b;
        Object obj4 = this.e;
        fn7 fn7Var = this.d;
        switch (b) {
            case 0:
                uc7 uc7Var = (uc7) fn7Var;
                e eVar = (e) obj4;
                TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = (TLRPC.TL_messages_editChatDefaultBannedRights) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    jj.c0(uc7Var.currentAccount, tL_error, eVar, tL_messages_editChatDefaultBannedRights, Boolean.valueOf(z));
                    break;
                } else {
                    uc7Var.getClass();
                    hl.d3(new t77(uc7Var, this.c, (byte) 18), 1000L);
                    break;
                }
            default:
                euc eucVar = (euc) fn7Var;
                String str = (String) obj4;
                c cVar = (c) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (str2 == null) {
                    wallettransaction.peer = c.h(eucVar.f, eucVar.h, eucVar.n);
                    wallettransaction.comment = str;
                    wallettransaction.comment_encrypted = z;
                    wallettransaction.date = eucVar.getConnectionsManager().getCurrentTime();
                    hl.t1(eucVar.I);
                    uqc.I0(eucVar.getParentActivity(), eucVar.getCurrentAccount(), wallettransaction, new ttc(eucVar, cVar, this.c, (byte) 1), new rtc(eucVar, (byte) 4), eucVar.m0(), null, eucVar.getResourceProvider());
                    hl.d3(new ptc(eucVar, (byte) 3), 1000L);
                    break;
                } else {
                    eucVar.e0.setLoading(false);
                    d31.b0(eucVar).f0(str2, false);
                    break;
                }
        }
    }

    public /* synthetic */ ua7(euc eucVar, String str, boolean z, c cVar, long j) {
        this.d = eucVar;
        this.e = str;
        this.b = z;
        this.f = cVar;
        this.c = j;
    }
}
