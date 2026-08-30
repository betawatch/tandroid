package ph;

import android.content.Context;
import android.view.View;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t8(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                da daVar = (da) this.c;
                new m7((Context) this.b, daVar.c, true, daVar.u0, new i8(daVar, 20), daVar.a).show();
                break;
            case 1:
                rh.k.x0((rh.k) this.c, (Context) this.b);
                break;
            case 2:
                rh.q2 q2Var = (rh.q2) this.c;
                rh.h0 h0Var = (rh.h0) this.b;
                if (h0Var.c()) {
                    h0Var.a();
                } else {
                    File file = h0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = h0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.D1, null, true);
                    }
                }
                o70 o70Var = q2Var.H0;
                if (o70Var != null) {
                    o70Var.u();
                    q2Var.H0 = null;
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
                xn xnVar = (xn) this.b;
                AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                qc.a0(xnVar).k(false).j();
                break;
            case 5:
                uf.e0.Q((uf.e0) this.c, (TL_account.TL_connectedBot) this.b);
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
