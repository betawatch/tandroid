// default package

import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rc4 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pd4 b;

    public /* synthetic */ rc4(pd4 pd4Var, byte b) {
        this.a = b;
        this.b = pd4Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        pd4 pd4Var = this.b;
        switch (b) {
            case 0:
                pd4Var.finishFragment();
                break;
            case 1:
            case 3:
                pd4Var.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
            case 2:
            default:
                pd4Var.q0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
        }
    }
}
