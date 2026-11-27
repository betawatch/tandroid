// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class qd7 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ qd7(jf7 jf7Var, long j, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        this.e = jf7Var;
        this.b = j;
        this.d = z;
        this.f = inputPeer;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        byte b = this.a;
        TLObject tLObject = this.f;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((jf7) obj).getMessagesController().K3(this.b, this.d, (TLRPC.InputPeer) tLObject, this.c);
                break;
            default:
                jxa jxaVar = (jxa) obj;
                int i = jxaVar.a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j = this.b;
                    long j2 = this.c;
                    if (j == 0) {
                        TLRPC.UserFull Y1 = uc7.s1(i).Y1(j2);
                        if (Y1 != null && (peerSettings = Y1.settings) != null) {
                            peerSettings.flags &= -16385;
                            peerSettings.charge_paid_message_stars = 0L;
                        }
                        uc7.s1(i).W3.edit().putLong(qu6.n(j2, "dialog_bar_paying_"), 0L).apply();
                        uc7.s1(i).i3(uc7.s1(i).X1(Long.valueOf(j2)), uc7.s1(i).M0(Long.valueOf(-j2)), true);
                        lv2.r(i).D(true);
                        jn7.f(i).k(jn7.Q3, Long.valueOf(j2));
                        break;
                    } else {
                        jxaVar.a0(-j, j2, this.d);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ qd7(jxa jxaVar, TLObject tLObject, long j, long j2, boolean z) {
        this.e = jxaVar;
        this.f = tLObject;
        this.b = j;
        this.c = j2;
        this.d = z;
    }
}
