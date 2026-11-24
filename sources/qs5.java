// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qs5 implements r56 {
    public final /* synthetic */ rs5 a;

    public qs5(rs5 rs5Var) {
        this.a = rs5Var;
    }

    @Override // r56
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i;
        kg1 kg1Var = this.a.a.c.d2;
        if (kg1Var != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            vg1 vg1Var = kg1Var.a;
            tL_channelAdminLogEvent.user_id = z8c.h(vg1Var.getAccountInstance().a).n;
            i = ((d) vg1Var).currentAccount;
            if (new k47(i, tL_channelAdminLogEvent, vg1Var.o0, vg1Var.n0, vg1Var.f, vg1Var.U, true).U >= 0) {
                vg1Var.O0();
                vg1Var.F.f();
                vg1Var.Y0();
            }
        }
    }

    @Override // r56
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // r56
    public final void c(TLObject tLObject) {
    }
}
