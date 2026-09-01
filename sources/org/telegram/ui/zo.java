package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class zo extends org.telegram.ui.Components.n80 {
    public final /* synthetic */ Context w;
    public final /* synthetic */ ep x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo(ep epVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.x = epVar;
        this.w = context2;
    }

    @Override // org.telegram.ui.Components.n80
    public final boolean a(final boolean z4, org.telegram.ui.Components.l80 l80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        ep epVar = this.x;
        if (!epVar.S || (chatFull = epVar.V) == null || (i10 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = epVar.X ? z4 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z4 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.w;
        g6Var = ((org.telegram.ui.ActionBar.p2) epVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
        alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
        final int i11 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.yo
            public final /* synthetic */ zo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
                switch (i11) {
                    case 0:
                        boolean z10 = z4;
                        zo zoVar = this.b;
                        zoVar.setJoinRequest(z10);
                        zoVar.x.T = true;
                        break;
                    default:
                        boolean z11 = z4;
                        zo zoVar2 = this.b;
                        zoVar2.setJoinRequest(z11);
                        zoVar2.x.T = false;
                        break;
                }
            }
        });
        final int i12 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.yo
            public final /* synthetic */ zo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i122) {
                switch (i12) {
                    case 0:
                        boolean z10 = z4;
                        zo zoVar = this.b;
                        zoVar.setJoinRequest(z10);
                        zoVar.x.T = true;
                        break;
                    default:
                        boolean z11 = z4;
                        zo zoVar2 = this.b;
                        zoVar2.setJoinRequest(z11);
                        zoVar2.x.T = false;
                        break;
                }
            }
        });
        epVar.showDialog(alertDialog$Builder.a);
        return false;
    }
}
