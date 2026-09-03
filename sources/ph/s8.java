package ph;

import android.content.Context;
import android.view.View;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s8(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                da daVar = (da) this.c;
                new l7((Context) this.b, daVar.c, true, daVar.u0, new h8(daVar, 20), daVar.a).show();
                break;
            case 1:
                rh.j.x0((rh.j) this.c, (Context) this.b);
                break;
            case 2:
                rh.p2 p2Var = (rh.p2) this.c;
                rh.g0 g0Var = (rh.g0) this.b;
                if (g0Var.c()) {
                    g0Var.a();
                } else {
                    File file = g0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = g0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.D1, null, true);
                    }
                }
                p70 p70Var = p2Var.H0;
                if (p70Var != null) {
                    p70Var.u();
                    p2Var.H0 = null;
                    break;
                }
                break;
            case 3:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.b;
                g3Var.dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    break;
                }
                break;
            case 4:
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.c;
                zn znVar = (zn) this.b;
                AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                qc.a0(znVar).k(false).j();
                break;
            case 5:
                uf.f0.Q((uf.f0) this.c, (TL_account.TL_connectedBot) this.b);
                break;
            case 6:
                uh.b bVar = (uh.b) this.c;
                Runnable runnable = (Runnable) this.b;
                bVar.getClass();
                runnable.run();
                bVar.dismiss();
                break;
            default:
                vh.y1.Y((vh.y1) this.c, (Context) this.b, view);
                break;
        }
    }
}
