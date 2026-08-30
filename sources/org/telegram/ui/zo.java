package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class zo extends org.telegram.ui.Components.m80 {
    public final /* synthetic */ Context w;
    public final /* synthetic */ dp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo(dp dpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.x = dpVar;
        this.w = context2;
    }

    @Override // org.telegram.ui.Components.m80
    public final boolean a(final boolean z4, org.telegram.ui.Components.k80 k80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        dp dpVar = this.x;
        if (!dpVar.S || (chatFull = dpVar.V) == null || (i10 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = dpVar.X ? z4 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z4 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.w;
        f6Var = ((org.telegram.ui.ActionBar.p2) dpVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
        alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
        final int i11 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.yo
            public final /* synthetic */ zo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
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
            public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i122) {
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
        dpVar.showDialog(alertDialog$Builder.a);
        return false;
    }
}
