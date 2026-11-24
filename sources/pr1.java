// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pr1 extends z82 {
    public final /* synthetic */ yv1 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr1(yv1 yv1Var, Context context, yv1 yv1Var2, boolean z, ylb ylbVar) {
        super(context, yv1Var2, z, ylbVar);
        this.B0 = yv1Var;
    }

    @Override // z82
    public final boolean a() {
        boolean z;
        yv1 yv1Var = this.B0;
        if (yv1Var.mb || yv1Var.isInPreviewMode()) {
            return false;
        }
        z = ((d) yv1Var).inBubbleMode;
        if (z || yv1Var.k0 == null || yv1Var.H3) {
            return false;
        }
        return !yv1Var.j8() || yv1Var.x4;
    }

    @Override // z82
    public final boolean d() {
        yv1 yv1Var = this.B0;
        TLRPC.User user = yv1Var.f;
        if (user != null && user.linked_community_id != 0) {
            yv1Var.showDialog(new pp2(yv1Var, yv1Var.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = yv1Var.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        yv1Var.showDialog(new pp2(yv1Var, yv1Var.e.linked_community_id, null, null));
        return true;
    }

    @Override // z82
    public final void f() {
        yv1 yv1Var = this.B0;
        yv1Var.Ba(yv1Var.i8() ? "" : null);
    }

    @Override // z82
    public final boolean o() {
        return this.B0.g4 == 3;
    }
}
