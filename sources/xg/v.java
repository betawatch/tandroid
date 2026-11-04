package xg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ v(a0 a0Var, int i3) {
        this.a = i3;
        this.b = a0Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                a0 a0Var = this.b;
                a0Var.dismiss();
                org.telegram.messenger.g0.i3(new t(a0Var, 2), 220L);
                break;
            case 1:
                a0 a0Var2 = this.b;
                a0Var2.j2.b(false);
                j.j(a0Var2.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                a0 a0Var3 = this.b;
                a0Var3.g2 = a0Var3.R1.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
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
                a0Var5.j2.b(false);
                j.j(a0Var5.getContext(), (TLRPC.TL_error) obj);
                break;
            case 5:
                a0 a0Var6 = this.b;
                ArrayList arrayList = a0Var6.Y1;
                arrayList.clear();
                arrayList.addAll((List) obj);
                a0Var6.k1(true, true);
                break;
            default:
                a0 a0Var7 = this.b;
                a0Var7.j2.b(false);
                j.j(a0Var7.getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
