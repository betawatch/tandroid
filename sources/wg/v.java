package wg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ v(a0 a0Var, int i7) {
        this.a = i7;
        this.b = a0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                a0 a0Var = this.b;
                a0Var.dismiss();
                org.telegram.messenger.g0.i3(new t(a0Var, 2), 220L);
                break;
            case 1:
                a0 a0Var2 = this.b;
                a0Var2.i2.b(false);
                h.j(a0Var2.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                a0 a0Var3 = this.b;
                a0Var3.f2 = a0Var3.Q1.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                a0Var3.k1(true, true);
                a0Var3.j1(true);
                break;
            case 3:
                a0 a0Var4 = this.b;
                a0Var4.dismiss();
                org.telegram.messenger.g0.i3(new t(a0Var4, 1), 220L);
                break;
            case 4:
                a0 a0Var5 = this.b;
                a0Var5.i2.b(false);
                h.j(a0Var5.getContext(), (TLRPC.TL_error) obj);
                break;
            case 5:
                a0 a0Var6 = this.b;
                ArrayList arrayList = a0Var6.X1;
                arrayList.clear();
                arrayList.addAll((List) obj);
                a0Var6.k1(true, true);
                break;
            default:
                a0 a0Var7 = this.b;
                a0Var7.i2.b(false);
                h.j(a0Var7.getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
