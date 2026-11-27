// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class us5 implements u56 {
    public final /* synthetic */ vs5 a;

    public us5(vs5 vs5Var) {
        this.a = vs5Var;
    }

    @Override // u56
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i;
        lf1 lf1Var = this.a.a.c.d2;
        if (lf1Var != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            wf1 wf1Var = lf1Var.a;
            tL_channelAdminLogEvent.user_id = yac.h(wf1Var.getAccountInstance().a).n;
            i = ((e) wf1Var).currentAccount;
            if (new r47(i, tL_channelAdminLogEvent, wf1Var.o0, wf1Var.n0, wf1Var.f, wf1Var.U, true).U >= 0) {
                wf1Var.O0();
                wf1Var.F.f();
                wf1Var.Y0();
            }
        }
    }

    @Override // u56
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override // u56
    public final void c(TLObject tLObject) {
    }
}
