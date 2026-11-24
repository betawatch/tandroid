// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class yh1 implements lac {
    public final /* synthetic */ vi1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ yh1(vi1 vi1Var, int i, View view) {
        this.a = vi1Var;
        this.b = i;
        this.c = view;
    }

    @Override // lac
    public final void a(Object obj, Object obj2, Object obj3) {
        Long l = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        vi1 vi1Var = this.a;
        int i = vi1Var.V;
        int i2 = this.b;
        if (i2 == i) {
            vi1Var.n = l.longValue();
            vi1Var.h1(true);
        } else if (i2 == vi1Var.d0) {
            vi1Var.x = l.longValue();
            vi1Var.i1();
        } else if (i2 == vi1Var.g0) {
            if (l.longValue() == 0) {
                vi1Var.E = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible n0 = oc7.n0(tL_starGiftUnique);
                if (num != null) {
                    n0.flags |= 1;
                    n0.until = num.intValue();
                }
                vi1Var.E = n0;
                vi1Var.s = -1;
                vi1Var.x = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                vi1Var.E = tL_emojiStatus;
            }
            vi1Var.i1();
        }
        vi1Var.e1(true);
        ((ji1) this.c).c(l.longValue(), tL_starGiftUnique != null, true);
        vi1Var.g1(true);
    }
}
