package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class uo extends org.telegram.ui.Components.e90 {
    public final /* synthetic */ Context w;
    public final /* synthetic */ yo x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo(yo yoVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.x = yoVar;
        this.w = context2;
    }

    @Override // org.telegram.ui.Components.e90
    public final boolean a(final boolean z10, org.telegram.ui.Components.c90 c90Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        yo yoVar = this.x;
        if (!yoVar.V || (chatFull = yoVar.Y) == null || (i10 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = yoVar.a0 ? z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.w;
        d6Var = ((org.telegram.ui.ActionBar.n2) yoVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
        final int i11 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.to
            public final /* synthetic */ uo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                switch (i11) {
                    case 0:
                        boolean z11 = z10;
                        uo uoVar = this.b;
                        uoVar.setJoinRequest(z11);
                        uoVar.x.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        uo uoVar2 = this.b;
                        uoVar2.setJoinRequest(z12);
                        uoVar2.x.W = false;
                        break;
                }
            }
        });
        final int i12 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.to
            public final /* synthetic */ uo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i122) {
                switch (i12) {
                    case 0:
                        boolean z11 = z10;
                        uo uoVar = this.b;
                        uoVar.setJoinRequest(z11);
                        uoVar.x.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        uo uoVar2 = this.b;
                        uoVar2.setJoinRequest(z12);
                        uoVar2.x.W = false;
                        break;
                }
            }
        });
        yoVar.showDialog(alertDialog$Builder.a);
        return false;
    }
}
