// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class zf2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ag2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ zf2(ag2 ag2Var, String str, byte b) {
        this.a = b;
        this.b = ag2Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ao1 ao1Var;
        byte b = 1;
        switch (this.a) {
            case 0:
                ag2 ag2Var = this.b;
                ag2Var.getClass();
                hl.c3(new zf2(ag2Var, this.c, b));
                break;
            default:
                ag2 ag2Var2 = this.b;
                ag2Var2.n = null;
                bg2 bg2Var = ag2Var2.E;
                TLRPC.Chat chat = bg2Var.n;
                int i = bg2Var.e1;
                ArrayList arrayList = (xc2.T(chat) || bg2Var.r == null) ? null : new ArrayList(bg2Var.r.participants.participants);
                ArrayList arrayList2 = i == 1 ? new ArrayList(bg2Var.getContactsController().f0) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    ag2Var2.s = false;
                    ao1Var = null;
                } else {
                    ao1Var = new ao1(ag2Var2, str, arrayList, arrayList2, (byte) 11);
                }
                ag2Var2.h.h(str, i != 0, false, true, false, false, xc2.T(bg2Var.n) ? bg2Var.N : 0L, false, bg2Var.O, 1, 0L, ao1Var);
                break;
        }
    }
}
