package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wo extends org.telegram.ui.Components.g90 {
    public final /* synthetic */ Context w;
    public final /* synthetic */ ap x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo(ap apVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.x = apVar;
        this.w = context2;
    }

    @Override // org.telegram.ui.Components.g90
    public final boolean a(final boolean z10, org.telegram.ui.Components.e90 e90Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var;
        ap apVar = this.x;
        if (!apVar.V || (chatFull = apVar.Y) == null || (i10 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = apVar.a0 ? z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.w;
        u6Var = ((org.telegram.ui.ActionBar.r2) apVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
        final int i11 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.vo
            public final /* synthetic */ wo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i12) {
                switch (i11) {
                    case 0:
                        boolean z11 = z10;
                        wo woVar = this.b;
                        woVar.setJoinRequest(z11);
                        woVar.x.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        wo woVar2 = this.b;
                        woVar2.setJoinRequest(z12);
                        woVar2.x.W = false;
                        break;
                }
            }
        });
        final int i12 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.vo
            public final /* synthetic */ wo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i122) {
                switch (i12) {
                    case 0:
                        boolean z11 = z10;
                        wo woVar = this.b;
                        woVar.setJoinRequest(z11);
                        woVar.x.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        wo woVar2 = this.b;
                        woVar2.setJoinRequest(z12);
                        woVar2.x.W = false;
                        break;
                }
            }
        });
        apVar.showDialog(alertDialog$Builder.a);
        return false;
    }
}
