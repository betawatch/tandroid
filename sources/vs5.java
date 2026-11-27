// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vs5 implements h56 {
    public final /* synthetic */ ws5 a;

    public vs5(ws5 ws5Var) {
        this.a = ws5Var;
    }

    @Override // h56
    public final void b() {
        bt5 bt5Var = this.a.c;
        e eVar = bt5Var.O1;
        if (eVar instanceof ck6) {
            ck6 ck6Var = (ck6) eVar;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = bt5Var.l1;
            v56 v56Var = new v56(1, ck6Var.n);
            v56Var.T = ck6Var.t0;
            v56Var.c0(tL_chatInviteExported);
            ck6Var.presentFragment(v56Var);
        } else {
            v56 v56Var2 = new v56(1, bt5Var.a2);
            v56Var2.c0(bt5Var.l1);
            v56Var2.T = new us5(this);
            bt5Var.O1.presentFragment(v56Var2);
        }
        bt5Var.dismiss();
    }

    @Override // h56
    public final void d() {
        bt5 bt5Var = this.a.c;
        e eVar = bt5Var.O1;
        if (eVar instanceof ck6) {
            ((ck6) eVar).i0(bt5Var.l1);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = bt5Var.l1.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = uc7.s1(bt5Var.a).j1(-bt5Var.a2);
            ConnectionsManager.getInstance(bt5Var.a).sendRequest(tL_messages_editExportedChatInvite, new ts5(this, (byte) 0));
        }
        bt5Var.dismiss();
    }

    @Override // h56
    public final void h() {
        bt5 bt5Var = this.a.c;
        e eVar = bt5Var.O1;
        if (eVar instanceof ck6) {
            ((ck6) eVar).d0(bt5Var.l1);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = bt5Var.l1.link;
            tL_messages_deleteExportedChatInvite.peer = uc7.s1(bt5Var.a).j1(-bt5Var.a2);
            ConnectionsManager.getInstance(bt5Var.a).sendRequest(tL_messages_deleteExportedChatInvite, new ts5(this, (byte) 1));
        }
        bt5Var.dismiss();
    }

    @Override // h56
    public final void f() {
    }
}
