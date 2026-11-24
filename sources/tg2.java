// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tg2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vg2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ tg2(vg2 vg2Var, String str, byte b) {
        this.a = b;
        this.b = vg2Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xo1 xo1Var;
        byte b = 1;
        switch (this.a) {
            case 0:
                vg2 vg2Var = this.b;
                vg2Var.getClass();
                gm.c3(new tg2(vg2Var, this.c, b));
                break;
            default:
                vg2 vg2Var2 = this.b;
                vg2Var2.n = null;
                wg2 wg2Var = vg2Var2.E;
                TLRPC.Chat chat = wg2Var.n;
                int i = wg2Var.e1;
                ArrayList arrayList = (sd2.T(chat) || wg2Var.r == null) ? null : new ArrayList(wg2Var.r.participants.participants);
                ArrayList arrayList2 = i == 1 ? new ArrayList(wg2Var.getContactsController().f0) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    vg2Var2.s = false;
                    xo1Var = null;
                } else {
                    xo1Var = new xo1(vg2Var2, str, arrayList, arrayList2, (byte) 11);
                }
                vg2Var2.h.h(str, i != 0, false, true, false, false, sd2.T(wg2Var.n) ? wg2Var.N : 0L, false, wg2Var.O, 1, 0L, xo1Var);
                break;
        }
    }
}
