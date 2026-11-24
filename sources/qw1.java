// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class qw1 implements lac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qw1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // lac
    public final void a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj7;
                boolean[] zArr = (boolean[]) obj6;
                blc blcVar = (blc) obj5;
                String str = (String) obj4;
                Boolean bool = (Boolean) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                int i = ChatActivityEnterView.z7;
                mw1 mw1Var = chatActivityEnterView.e6;
                if (!zArr[0]) {
                    zArr[0] = true;
                    chatActivityEnterView.N0 = System.currentTimeMillis();
                    blcVar.run();
                    long E2 = chatActivityEnterView.E2(str, new xo1(chatActivityEnterView, bool, num, num2, (byte) 3));
                    chatActivityEnterView.d6 = num.intValue() == 0;
                    gm.r(mw1Var);
                    gm.d3(mw1Var, E2 + 500);
                    break;
                }
                break;
            case 1:
                c cVar = (c) obj7;
                qac qacVar = (qac) obj6;
                byte[] bArr = (byte[]) obj5;
                y25 y25Var = (y25) obj4;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i2 = cVar.a;
                if (tL_error == null) {
                    cVar.w0(walletState);
                    new g35(i2, c.B(), cVar.x()).q(z8c.h(i2).e(), bArr, y25Var, qacVar);
                    cVar.Y();
                    break;
                } else if (!"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    String str2 = tL_error.text;
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    qacVar.a(str2);
                    break;
                }
                break;
            default:
                asc ascVar = (asc) obj7;
                c cVar2 = (c) obj6;
                TLRPC.User user = (TLRPC.User) obj5;
                String str3 = (String) obj4;
                String str4 = (String) obj;
                qac qacVar2 = (qac) obj3;
                if (!c.b(ascVar.f, cVar2.x())) {
                    qacVar2.a("WALLET_CHANGED");
                    break;
                } else {
                    cVar2.l0(user, str3, 0L, str4, null, ascVar.e, null, new ts9(ascVar, qacVar2, (byte) 24), null);
                    break;
                }
        }
    }
}
