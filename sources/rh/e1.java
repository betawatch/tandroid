package rh;

import org.telegram.messenger.r20;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r20 b;

    public /* synthetic */ e1(r20 r20Var, int i10) {
        this.a = i10;
        this.b = r20Var;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.a((TL_stars.StarGift) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                r20 r20Var = this.b;
                if (r20Var != null) {
                    r20Var.a(bool);
                    break;
                }
                break;
        }
    }
}
