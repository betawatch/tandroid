package zh;

import org.telegram.messenger.c20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.o61;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ k1(f2 f2Var, int i7) {
        this.a = i7;
        this.b = f2Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                f2 f2Var = this.b;
                f2Var.f(true);
                o61 o61Var = f2Var.n;
                int i7 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                o61Var.d(i7, f2Var.e.f(i7) + 1);
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var.a;
                if (f2Var2 instanceof ProfileActivity) {
                    ((ProfileActivity) f2Var2).U4(true);
                }
                f2Var.o();
                break;
            default:
                f2 f2Var3 = this.b;
                f2Var3.e.b((String) obj, new k1(f2Var3, 0));
                break;
        }
    }
}
