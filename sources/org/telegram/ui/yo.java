package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yo extends org.telegram.ui.Components.h90 {
    public final /* synthetic */ Context w;
    public final /* synthetic */ cp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo(cp cpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.x = cpVar;
        this.w = context2;
    }

    @Override // org.telegram.ui.Components.h90
    public final boolean a(final boolean z10, org.telegram.ui.Components.f90 f90Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var;
        cp cpVar = this.x;
        if (!cpVar.V || (chatFull = cpVar.Y) == null || (i10 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = cpVar.a0 ? z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.w;
        u6Var = ((org.telegram.ui.ActionBar.r2) cpVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
        final int i11 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.xo
            public final /* synthetic */ yo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i12) {
                switch (i11) {
                    case 0:
                        boolean z11 = z10;
                        yo yoVar = this.b;
                        yoVar.setJoinRequest(z11);
                        yoVar.x.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        yo yoVar2 = this.b;
                        yoVar2.setJoinRequest(z12);
                        yoVar2.x.W = false;
                        break;
                }
            }
        });
        final int i12 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.xo
            public final /* synthetic */ yo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i122) {
                switch (i12) {
                    case 0:
                        boolean z11 = z10;
                        yo yoVar = this.b;
                        yoVar.setJoinRequest(z11);
                        yoVar.x.W = true;
                        break;
                    default:
                        boolean z12 = z10;
                        yo yoVar2 = this.b;
                        yoVar2.setJoinRequest(z12);
                        yoVar2.x.W = false;
                        break;
                }
            }
        });
        cpVar.showDialog(alertDialog$Builder.a);
        return false;
    }
}
