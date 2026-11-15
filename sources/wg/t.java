package wg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;

    public /* synthetic */ t(y yVar, int i7) {
        this.a = i7;
        this.b = yVar;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                y yVar = this.b;
                yVar.dismiss();
                org.telegram.messenger.g0.i3(new r(yVar, 2), 220L);
                break;
            case 1:
                y yVar2 = this.b;
                yVar2.m2.b(false);
                h.j(yVar2.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                y yVar3 = this.b;
                yVar3.j2 = yVar3.U1.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                yVar3.k1(true, true);
                yVar3.j1(true);
                break;
            case 3:
                y yVar4 = this.b;
                yVar4.dismiss();
                org.telegram.messenger.g0.i3(new r(yVar4, 1), 220L);
                break;
            case 4:
                y yVar5 = this.b;
                yVar5.m2.b(false);
                h.j(yVar5.getContext(), (TLRPC.TL_error) obj);
                break;
            case 5:
                y yVar6 = this.b;
                ArrayList arrayList = yVar6.b2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                yVar6.k1(true, true);
                break;
            default:
                y yVar7 = this.b;
                yVar7.m2.b(false);
                h.j(yVar7.getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
