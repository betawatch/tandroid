package qh;

import android.content.Context;
import android.view.View;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q8(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ba baVar = (ba) this.c;
                new j7((Context) this.b, baVar.c, true, baVar.u0, new g8(baVar, 20), baVar.a).show();
                break;
            case 1:
                sh.j.x0((sh.j) this.c, (Context) this.b);
                break;
            case 2:
                sh.p2 p2Var = (sh.p2) this.c;
                sh.g0 g0Var = (sh.g0) this.b;
                if (g0Var.c()) {
                    g0Var.a();
                } else {
                    File file = g0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = g0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.D1, null, true);
                    }
                }
                q70 q70Var = p2Var.H0;
                if (q70Var != null) {
                    q70Var.u();
                    p2Var.H0 = null;
                    break;
                }
                break;
            case 3:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.b;
                h3Var.dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    break;
                }
                break;
            case 4:
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.c;
                xn xnVar = (xn) this.b;
                AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                qc.a0(xnVar).k(false).j();
                break;
            case 5:
                vf.e0.Q((vf.e0) this.c, (TL_account.TL_connectedBot) this.b);
                break;
            case 6:
                vh.b bVar = (vh.b) this.c;
                Runnable runnable = (Runnable) this.b;
                bVar.getClass();
                runnable.run();
                bVar.dismiss();
                break;
            default:
                wh.z1.Y((wh.z1) this.c, (Context) this.b, view);
                break;
        }
    }
}
