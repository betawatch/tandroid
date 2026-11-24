// default package

import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class re4 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qf4 b;

    public /* synthetic */ re4(qf4 qf4Var, byte b) {
        this.a = b;
        this.b = qf4Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        qf4 qf4Var = this.b;
        switch (b) {
            case 0:
                qf4Var.finishFragment();
                break;
            case 1:
            case 3:
                qf4Var.s0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
            case 2:
            default:
                qf4Var.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
        }
    }
}
