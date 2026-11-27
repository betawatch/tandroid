// default package

import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ttc implements kcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ euc b;
    public final /* synthetic */ c c;
    public final /* synthetic */ long d;

    public /* synthetic */ ttc(euc eucVar, c cVar, long j, byte b) {
        this.a = b;
        this.b = eucVar;
        this.c = cVar;
        this.d = j;
    }

    @Override // kcc
    public final void a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        final euc eucVar = this.b;
        switch (b) {
            case 0:
                final pcc pccVar = (pcc) obj3;
                final byte b2 = 0;
                this.c.n0(eucVar.f, eucVar.h, this.d, (String) obj, ((Boolean) obj2).booleanValue() ? eucVar.m0() : null, null, eucVar.n, new pcc() { // from class: vtc
                    @Override // pcc
                    public final void a(Object obj4) {
                        byte b3 = b2;
                        byte b4 = 4;
                        pcc pccVar2 = pccVar;
                        euc eucVar2 = eucVar;
                        String str = (String) obj4;
                        eucVar2.getClass();
                        switch (b3) {
                            case 0:
                                pccVar2.a(str);
                                if (!c.K(str) && str == null) {
                                    eucVar2.fragmentView.postDelayed(new ptc(eucVar2, b4), 220L);
                                    break;
                                }
                                break;
                            default:
                                pccVar2.a(str);
                                if (!c.K(str) && str == null) {
                                    eucVar2.fragmentView.postDelayed(new ptc(eucVar2, b4), 220L);
                                    break;
                                }
                                break;
                        }
                    }
                }, new stc(eucVar, (byte) 2));
                break;
            default:
                String str = (String) obj;
                final pcc pccVar2 = (pcc) obj3;
                final byte b3 = 1;
                this.c.n0(eucVar.f, eucVar.h, this.d, str, ((Boolean) obj2).booleanValue() ? eucVar.m0() : null, null, eucVar.n, new pcc() { // from class: vtc
                    @Override // pcc
                    public final void a(Object obj4) {
                        byte b32 = b3;
                        byte b4 = 4;
                        pcc pccVar22 = pccVar2;
                        euc eucVar2 = eucVar;
                        String str2 = (String) obj4;
                        eucVar2.getClass();
                        switch (b32) {
                            case 0:
                                pccVar22.a(str2);
                                if (!c.K(str2) && str2 == null) {
                                    eucVar2.fragmentView.postDelayed(new ptc(eucVar2, b4), 220L);
                                    break;
                                }
                                break;
                            default:
                                pccVar22.a(str2);
                                if (!c.K(str2) && str2 == null) {
                                    eucVar2.fragmentView.postDelayed(new ptc(eucVar2, b4), 220L);
                                    break;
                                }
                                break;
                        }
                    }
                }, new stc(eucVar, (byte) 3));
                break;
        }
    }
}
