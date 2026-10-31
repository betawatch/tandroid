package xh;

import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ a(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new vh.d1(22, this.b, (TLRPC.UserFull) obj));
                break;
            case 1:
                i iVar = this.b;
                iVar.a0.commission_permille = ((Integer) obj).intValue();
                iVar.K0();
                break;
            default:
                i iVar2 = this.b;
                iVar2.a0.duration_months = ((Integer) iVar2.c0.get(((Integer) obj).intValue())).intValue();
                iVar2.K0();
                break;
        }
    }
}
