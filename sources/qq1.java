// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qq1 extends f82 {
    public final /* synthetic */ zu1 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq1(zu1 zu1Var, Context context, zu1 zu1Var2, boolean z, vnb vnbVar) {
        super(context, zu1Var2, z, vnbVar);
        this.B0 = zu1Var;
    }

    @Override // f82
    public final boolean a() {
        boolean z;
        zu1 zu1Var = this.B0;
        if (zu1Var.mb || zu1Var.isInPreviewMode()) {
            return false;
        }
        z = ((e) zu1Var).inBubbleMode;
        if (z || zu1Var.k0 == null || zu1Var.H3) {
            return false;
        }
        return !zu1Var.k8() || zu1Var.x4;
    }

    @Override // f82
    public final boolean d() {
        zu1 zu1Var = this.B0;
        TLRPC.User user = zu1Var.f;
        if (user != null && user.linked_community_id != 0) {
            zu1Var.showDialog(new xo2(zu1Var, zu1Var.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = zu1Var.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        zu1Var.showDialog(new xo2(zu1Var, zu1Var.e.linked_community_id, null, null));
        return true;
    }

    @Override // f82
    public final void f() {
        zu1 zu1Var = this.B0;
        zu1Var.Ca(zu1Var.j8() ? "" : null);
    }

    @Override // f82
    public final boolean o() {
        return this.B0.g4 == 3;
    }
}
