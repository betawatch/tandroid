// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class sq5 implements r36 {
    public final /* synthetic */ tq5 a;

    public sq5(tq5 tq5Var) {
        this.a = tq5Var;
    }

    @Override // r36
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i;
        cf1 cf1Var = this.a.a.c.d2;
        if (cf1Var != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            nf1 nf1Var = cf1Var.a;
            tL_channelAdminLogEvent.user_id = y6c.h(nf1Var.getAccountInstance().a).n;
            i = ((d) nf1Var).currentAccount;
            if (new k27(i, tL_channelAdminLogEvent, nf1Var.o0, nf1Var.n0, nf1Var.f, nf1Var.U, true).U >= 0) {
                nf1Var.N0();
                nf1Var.F.f();
                nf1Var.X0();
            }
        }
    }

    @Override // r36
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // r36
    public final void c(TLObject tLObject) {
    }
}
