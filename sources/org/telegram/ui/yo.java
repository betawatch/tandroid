package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yo extends org.telegram.ui.Components.y70 {
    public final /* synthetic */ Context x;
    public final /* synthetic */ cp y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo(cp cpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.y = cpVar;
        this.x = context2;
    }

    @Override // org.telegram.ui.Components.y70
    public final boolean a(final boolean z10, org.telegram.ui.Components.w70 w70Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        org.telegram.ui.ActionBar.p6 p6Var;
        cp cpVar = this.y;
        final int i11 = 1;
        if (!cpVar.V || (chatFull = cpVar.Y) == null || (i10 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = cpVar.a0 ? z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.x;
        p6Var = ((org.telegram.ui.ActionBar.k2) cpVar).resourceProvider;
        final int i12 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        String L0 = org.telegram.messenger.cd.L0(2131754204, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(i10, str, new Object[0]));
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754206, null), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.xo
            public final /* synthetic */ yo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.u1
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i13) {
                switch (i12) {
                    case 0:
                        boolean z11 = z10;
                        yo yoVar = this.b;
                        yoVar.setJoinRequest(z11);
                        yoVar.y.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        yo yoVar2 = this.b;
                        yoVar2.setJoinRequest(z12);
                        yoVar2.y.W = false;
                        break;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131754205, null), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.xo
            public final /* synthetic */ yo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.u1
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i13) {
                switch (i11) {
                    case 0:
                        boolean z11 = z10;
                        yo yoVar = this.b;
                        yoVar.setJoinRequest(z11);
                        yoVar.y.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        yo yoVar2 = this.b;
                        yoVar2.setJoinRequest(z12);
                        yoVar2.y.W = false;
                        break;
                }
            }
        });
        cpVar.showDialog(x1Var);
        return false;
    }
}
