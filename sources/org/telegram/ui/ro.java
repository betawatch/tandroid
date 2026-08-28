package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ro extends org.telegram.ui.Components.t70 {
    public final /* synthetic */ Context w;
    public final /* synthetic */ vo x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro(vo voVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.x = voVar;
        this.w = context2;
    }

    @Override // org.telegram.ui.Components.t70
    public final boolean a(final boolean z10, org.telegram.ui.Components.r70 r70Var) {
        TLRPC.ChatFull chatFull;
        int i9;
        org.telegram.ui.ActionBar.b6 b6Var;
        vo voVar = this.x;
        if (!voVar.R || (chatFull = voVar.U) == null || (i9 = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = voVar.W ? z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.w;
        b6Var = ((org.telegram.ui.ActionBar.o2) voVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
        alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i9, new Object[0]));
        final int i10 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.qo
            public final /* synthetic */ ro b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                switch (i10) {
                    case 0:
                        boolean z11 = z10;
                        ro roVar = this.b;
                        roVar.setJoinRequest(z11);
                        roVar.x.S = true;
                        break;
                    default:
                        boolean z12 = z10;
                        ro roVar2 = this.b;
                        roVar2.setJoinRequest(z12);
                        roVar2.x.S = false;
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.qo
            public final /* synthetic */ ro b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i112) {
                switch (i11) {
                    case 0:
                        boolean z11 = z10;
                        ro roVar = this.b;
                        roVar.setJoinRequest(z11);
                        roVar.x.S = true;
                        break;
                    default:
                        boolean z12 = z10;
                        ro roVar2 = this.b;
                        roVar2.setJoinRequest(z12);
                        roVar2.x.S = false;
                        break;
                }
            }
        });
        voVar.showDialog(alertDialog$Builder.a);
        return false;
    }
}
