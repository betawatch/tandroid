// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class t92 extends ju5 {
    public final /* synthetic */ TLRPC.Chat x;
    public final /* synthetic */ u92 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t92(u92 u92Var, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.y = u92Var;
        this.x = chat2;
    }

    @Override // ju5
    public final boolean a(boolean z, hu5 hu5Var) {
        x92 x92Var = this.y.d;
        if (x92Var.Q) {
            return false;
        }
        x92Var.Q = true;
        e(new n92(this, hu5Var, (byte) 4), new rg(this, this.x, z, (Runnable) hu5Var, (byte) 11));
        return true;
    }

    @Override // ju5
    public final boolean b(boolean z, iu5 iu5Var) {
        x92 x92Var = this.y.d;
        if (x92Var.P) {
            return false;
        }
        x92Var.P = true;
        e(new n92(this, iu5Var, (byte) 4), new rg(this, this.x, z, (Runnable) iu5Var, (byte) 10));
        return true;
    }

    public final void e(n92 n92Var, Runnable runnable) {
        x92 x92Var = this.y.d;
        if (hc2.T(x92Var.f)) {
            runnable.run();
        } else {
            x92Var.getMessagesController().P(x92Var.getParentActivity(), this.x.id, x92Var, new v82((Object) this, (Object) runnable, (byte) 2), n92Var);
        }
    }
}
