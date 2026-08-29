package org.telegram.ui.web;

import android.content.Context;
import android.view.View;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tn;
import ph.p2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                org.telegram.ui.a0 a0Var = (org.telegram.ui.a0) this.c;
                lVar.b = true;
                a0Var.run();
                lVar.w.U2.N(true);
                break;
            case 1:
                ph.j.x0((ph.j) this.b, (Context) this.c);
                break;
            case 2:
                p2 p2Var = (p2) this.b;
                ph.g0 g0Var = (ph.g0) this.c;
                if (g0Var.c()) {
                    g0Var.a();
                } else {
                    File file = g0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = g0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.C1, null, true);
                    }
                }
                j70 j70Var = p2Var.G0;
                if (j70Var != null) {
                    j70Var.u();
                    p2Var.G0 = null;
                    break;
                }
                break;
            case 3:
                f3 f3Var = (f3) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                f3Var.dismiss();
                o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    break;
                }
                break;
            case 4:
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.b;
                tn tnVar = (tn) this.c;
                AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                tc.a0(tnVar).k(false).j();
                break;
            case 5:
                sf.f0.Q((sf.f0) this.b, (TL_account.TL_connectedBot) this.c);
                break;
            case 6:
                sh.b bVar = (sh.b) this.b;
                Runnable runnable = (Runnable) this.c;
                bVar.getClass();
                runnable.run();
                bVar.dismiss();
                break;
            default:
                th.x1.Y((th.x1) this.b, (Context) this.c, view);
                break;
        }
    }
}
