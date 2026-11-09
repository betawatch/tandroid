package wg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ u(z zVar, int i7) {
        this.a = i7;
        this.b = zVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                z zVar = this.b;
                zVar.dismiss();
                org.telegram.messenger.g0.i3(new s(zVar, 2), 220L);
                break;
            case 1:
                z zVar2 = this.b;
                zVar2.i2.b(false);
                h.j(zVar2.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                z zVar3 = this.b;
                zVar3.f2 = zVar3.Q1.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                zVar3.k1(true, true);
                zVar3.j1(true);
                break;
            case 3:
                z zVar4 = this.b;
                zVar4.dismiss();
                org.telegram.messenger.g0.i3(new s(zVar4, 1), 220L);
                break;
            case 4:
                z zVar5 = this.b;
                zVar5.i2.b(false);
                h.j(zVar5.getContext(), (TLRPC.TL_error) obj);
                break;
            case 5:
                z zVar6 = this.b;
                ArrayList arrayList = zVar6.X1;
                arrayList.clear();
                arrayList.addAll((List) obj);
                zVar6.k1(true, true);
                break;
            default:
                z zVar7 = this.b;
                zVar7.i2.b(false);
                h.j(zVar7.getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
