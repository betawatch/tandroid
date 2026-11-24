// default package

import android.content.Context;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zx1 extends p1c {
    public final /* synthetic */ ay1 p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx1(ay1 ay1Var, Context context, d dVar, d2c d2cVar, wjb wjbVar) {
        super(context, dVar, d2cVar, wjbVar);
        this.p1 = ay1Var;
    }

    @Override // p1c, fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.p1.a;
        if (chatActivityEnterView.Q3 == this) {
            chatActivityEnterView.Q3 = null;
        }
        hy1 hy1Var = chatActivityEnterView.P3;
        if (hy1Var != null) {
            hy1Var.m(false);
        }
    }
}
