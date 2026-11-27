// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class r92 extends nw5 {
    public final /* synthetic */ Context x;
    public final /* synthetic */ v92 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r92(v92 v92Var, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.y = v92Var;
        this.x = context2;
    }

    @Override // nw5
    public final boolean a(final boolean z, lw5 lw5Var) {
        TLRPC.ChatFull chatFull;
        int i;
        vnb vnbVar;
        v92 v92Var = this.y;
        final byte b = 1;
        if (!v92Var.W || (chatFull = v92Var.Z) == null || (i = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = v92Var.b0 ? z ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.x;
        vnbVar = ((e) v92Var).resourceProvider;
        final byte b2 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        String M0 = ob6.M0(2131754197, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = hl.S2(ob6.G(i, str, new Object[0]));
        alertDialog$Builder.j(ob6.M0(2131754199, null), new fd(this) { // from class: q92
            public final /* synthetic */ r92 b;

            {
                this.b = this;
            }

            @Override // fd
            public final void w(id idVar2, int i2) {
                byte b3 = b2;
                boolean z2 = z;
                r92 r92Var = this.b;
                switch (b3) {
                    case 0:
                        r92Var.setJoinRequest(z2);
                        r92Var.y.X = true;
                        break;
                    default:
                        r92Var.setJoinRequest(z2);
                        r92Var.y.X = false;
                        break;
                }
            }
        });
        alertDialog$Builder.g(ob6.M0(2131754198, null), new fd(this) { // from class: q92
            public final /* synthetic */ r92 b;

            {
                this.b = this;
            }

            @Override // fd
            public final void w(id idVar2, int i2) {
                byte b3 = b;
                boolean z2 = z;
                r92 r92Var = this.b;
                switch (b3) {
                    case 0:
                        r92Var.setJoinRequest(z2);
                        r92Var.y.X = true;
                        break;
                    default:
                        r92Var.setJoinRequest(z2);
                        r92Var.y.X = false;
                        break;
                }
            }
        });
        v92Var.showDialog(idVar);
        return false;
    }
}
