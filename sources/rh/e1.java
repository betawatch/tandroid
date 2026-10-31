package rh;

import org.telegram.messenger.q20;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q20 b;

    public /* synthetic */ e1(q20 q20Var, int i10) {
        this.a = i10;
        this.b = q20Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.a((TL_stars.StarGift) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                q20 q20Var = this.b;
                if (q20Var != null) {
                    q20Var.a(bool);
                    break;
                }
                break;
        }
    }
}
