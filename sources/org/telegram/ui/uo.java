package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class uo extends org.telegram.ui.Components.g80 {
    public final /* synthetic */ Context w;
    public final /* synthetic */ yo x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo(yo yoVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.x = yoVar;
        this.w = context2;
    }

    @Override // org.telegram.ui.Components.g80
    public final boolean a(final boolean z10, org.telegram.ui.Components.e80 e80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        yo yoVar = this.x;
        if (!yoVar.R || (chatFull = yoVar.U) == null || (i10 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = yoVar.W ? z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.w;
        c6Var = ((org.telegram.ui.ActionBar.o2) yoVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
        alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
        final int i11 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.to
            public final /* synthetic */ uo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i12) {
                switch (i11) {
                    case 0:
                        boolean z11 = z10;
                        uo uoVar = this.b;
                        uoVar.setJoinRequest(z11);
                        uoVar.x.S = true;
                        break;
                    default:
                        boolean z12 = z10;
                        uo uoVar2 = this.b;
                        uoVar2.setJoinRequest(z12);
                        uoVar2.x.S = false;
                        break;
                }
            }
        });
        final int i12 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.to
            public final /* synthetic */ uo b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i122) {
                switch (i12) {
                    case 0:
                        boolean z11 = z10;
                        uo uoVar = this.b;
                        uoVar.setJoinRequest(z11);
                        uoVar.x.S = true;
                        break;
                    default:
                        boolean z12 = z10;
                        uo uoVar2 = this.b;
                        uoVar2.setJoinRequest(z12);
                        uoVar2.x.S = false;
                        break;
                }
            }
        });
        yoVar.showDialog(alertDialog$Builder.a);
        return false;
    }
}
