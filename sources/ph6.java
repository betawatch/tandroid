// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ph6 implements r36 {
    public final /* synthetic */ yh6 a;

    public ph6(yh6 yh6Var) {
        this.a = yh6Var;
    }

    @Override // r36
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.i0(tL_chatInviteExported);
    }

    @Override // r36
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        yh6 yh6Var = this.a;
        ArrayList arrayList = yh6Var.j0;
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            yh6Var.e0(tL_chatInviteExported2);
            for (int i = 0; i < arrayList.size(); i++) {
                if (((TLRPC.TL_chatInviteExported) arrayList.get(i)).link.equals(tL_chatInviteExported.link)) {
                    if (!tL_chatInviteExported2.revoked) {
                        arrayList.set(i, tL_chatInviteExported2);
                        yh6Var.n0(true);
                        return;
                    } else {
                        qh6 k0 = yh6Var.k0();
                        arrayList.remove(i);
                        yh6Var.k0.add(0, tL_chatInviteExported2);
                        yh6Var.m0(k0);
                        return;
                    }
                }
            }
        }
    }

    @Override // r36
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            gl.d3(new oh6((Object) this, (Object) tLObject, (byte) 0), 200L);
        }
    }
}
