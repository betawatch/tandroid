// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class qg1 implements k8c {
    public final /* synthetic */ nh1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ qg1(nh1 nh1Var, int i, View view) {
        this.a = nh1Var;
        this.b = i;
        this.c = view;
    }

    @Override // k8c
    public final void a(Object obj, Object obj2, Object obj3) {
        Long l = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        nh1 nh1Var = this.a;
        int i = nh1Var.V;
        int i2 = this.b;
        if (i2 == i) {
            nh1Var.n = l.longValue();
            nh1Var.g1(true);
        } else if (i2 == nh1Var.d0) {
            nh1Var.x = l.longValue();
            nh1Var.h1();
        } else if (i2 == nh1Var.g0) {
            if (l.longValue() == 0) {
                nh1Var.E = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible n0 = na7.n0(tL_starGiftUnique);
                if (num != null) {
                    n0.flags |= 1;
                    n0.until = num.intValue();
                }
                nh1Var.E = n0;
                nh1Var.s = -1;
                nh1Var.x = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                nh1Var.E = tL_emojiStatus;
            }
            nh1Var.h1();
        }
        nh1Var.d1(true);
        ((bh1) this.c).c(l.longValue(), tL_starGiftUnique != null, true);
        nh1Var.f1(true);
    }
}
