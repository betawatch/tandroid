package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xn extends org.telegram.ui.Components.b70 {
    public final /* synthetic */ Context x;
    public final /* synthetic */ bo y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn(bo boVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.y = boVar;
        this.x = context2;
    }

    @Override // org.telegram.ui.Components.b70
    public final boolean a(final boolean z10, org.telegram.ui.Components.z60 z60Var) {
        TLRPC.ChatFull chatFull;
        int i3;
        org.telegram.ui.ActionBar.e6 e6Var;
        bo boVar = this.y;
        final int i10 = 1;
        if (!boVar.W || (chatFull = boVar.Z) == null || (i3 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = boVar.b0 ? z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.x;
        e6Var = ((org.telegram.ui.ActionBar.d2) boVar).resourceProvider;
        final int i11 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = org.telegram.messenger.bd.M0(2131754204, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(i3, str, new Object[0]));
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754206, null), new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.wn
            public final /* synthetic */ xn b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.p1
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i12) {
                switch (i11) {
                    case 0:
                        boolean z11 = z10;
                        xn xnVar = this.b;
                        xnVar.setJoinRequest(z11);
                        xnVar.y.X = true;
                        break;
                    default:
                        boolean z12 = z10;
                        xn xnVar2 = this.b;
                        xnVar2.setJoinRequest(z12);
                        xnVar2.y.X = false;
                        break;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131754205, null), new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.wn
            public final /* synthetic */ xn b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.p1
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i12) {
                switch (i10) {
                    case 0:
                        boolean z11 = z10;
                        xn xnVar = this.b;
                        xnVar.setJoinRequest(z11);
                        xnVar.y.X = true;
                        break;
                    default:
                        boolean z12 = z10;
                        xn xnVar2 = this.b;
                        xnVar2.setJoinRequest(z12);
                        xnVar2.y.X = false;
                        break;
                }
            }
        });
        boVar.showDialog(s1Var);
        return false;
    }
}
