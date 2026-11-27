// default package

import android.content.Context;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class py1 extends o5c {
    public final /* synthetic */ qy1 p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py1(qy1 qy1Var, Context context, e eVar, d6c d6cVar, vnb vnbVar) {
        super(context, eVar, d6cVar, vnbVar);
        this.p1 = qy1Var;
    }

    @Override // o5c, nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.p1.a;
        if (chatActivityEnterView.P3 == this) {
            chatActivityEnterView.P3 = null;
        }
        xy1 xy1Var = chatActivityEnterView.O3;
        if (xy1Var != null) {
            xy1Var.p(false);
        }
    }
}
