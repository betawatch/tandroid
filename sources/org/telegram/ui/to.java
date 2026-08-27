package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class to extends org.telegram.ui.Components.x70 {
    public final /* synthetic */ Context w;
    public final /* synthetic */ xo x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to(xo xoVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.x = xoVar;
        this.w = context2;
    }

    @Override // org.telegram.ui.Components.x70
    public final boolean a(final boolean z10, org.telegram.ui.Components.v70 v70Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        xo xoVar = this.x;
        if (!xoVar.R || (chatFull = xoVar.U) == null || (i10 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = xoVar.W ? z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.w;
        c6Var = ((org.telegram.ui.ActionBar.n2) xoVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
        alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
        final int i11 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.so
            public final /* synthetic */ to b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                switch (i11) {
                    case 0:
                        boolean z11 = z10;
                        to toVar = this.b;
                        toVar.setJoinRequest(z11);
                        toVar.x.S = true;
                        break;
                    default:
                        boolean z12 = z10;
                        to toVar2 = this.b;
                        toVar2.setJoinRequest(z12);
                        toVar2.x.S = false;
                        break;
                }
            }
        });
        final int i12 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.so
            public final /* synthetic */ to b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i122) {
                switch (i12) {
                    case 0:
                        boolean z11 = z10;
                        to toVar = this.b;
                        toVar.setJoinRequest(z11);
                        toVar.x.S = true;
                        break;
                    default:
                        boolean z12 = z10;
                        to toVar2 = this.b;
                        toVar2.setJoinRequest(z12);
                        toVar2.x.S = false;
                        break;
                }
            }
        });
        xoVar.showDialog(alertDialog$Builder.a);
        return false;
    }
}
