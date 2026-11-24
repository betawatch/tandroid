// default package

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xea implements tc5 {
    public final /* synthetic */ nha a;

    public xea(nha nhaVar) {
        this.a = nhaVar;
    }

    @Override // tc5
    public final void a(uc5 uc5Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j);
        bundle.putBoolean("just_created_chat", true);
        uc5Var.presentFragment(new yv1(bundle), true);
        bga bgaVar = this.a.S;
        d dVar = bgaVar.r.y1;
        if (bgaVar.n != 0) {
            dVar.getConnectionsManager().cancelRequest(bgaVar.n, true);
            bgaVar.n = 0;
        }
        bgaVar.d.clear();
        bgaVar.e = false;
        bgaVar.h = false;
        bgaVar.E(0L);
        TLRPC.User W1 = dVar.getMessagesController().W1(Long.valueOf(bgaVar.F()));
        if (W1 != null) {
            dVar.getMessagesController().b3(W1, dVar.getClassGuid(), true, null);
        }
    }
}
