// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class zg1 implements kcc {
    public final /* synthetic */ wh1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ zg1(wh1 wh1Var, int i, View view) {
        this.a = wh1Var;
        this.b = i;
        this.c = view;
    }

    @Override // kcc
    public final void a(Object obj, Object obj2, Object obj3) {
        Long l = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        wh1 wh1Var = this.a;
        int i = wh1Var.V;
        int i2 = this.b;
        if (i2 == i) {
            wh1Var.n = l.longValue();
            wh1Var.h1(true);
        } else if (i2 == wh1Var.d0) {
            wh1Var.x = l.longValue();
            wh1Var.i1();
        } else if (i2 == wh1Var.g0) {
            if (l.longValue() == 0) {
                wh1Var.E = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible p0 = uc7.p0(tL_starGiftUnique);
                if (num != null) {
                    p0.flags |= 1;
                    p0.until = num.intValue();
                }
                wh1Var.E = p0;
                wh1Var.s = -1;
                wh1Var.x = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                wh1Var.E = tL_emojiStatus;
            }
            wh1Var.i1();
        }
        wh1Var.e1(true);
        ((kh1) this.c).c(l.longValue(), tL_starGiftUnique != null, true);
        wh1Var.g1(true);
    }
}
