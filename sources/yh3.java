// default package

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class yh3 extends gk3 {
    public final /* synthetic */ tj3 c0;
    public final /* synthetic */ uj3 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh3(uj3 uj3Var, uj3 uj3Var2, Context context, int i, int i2, boolean z, ArrayList arrayList, int i3, TLRPC.RequestPeerType requestPeerType, tj3 tj3Var) {
        super(uj3Var2, context, i, i2, z, arrayList, i3, requestPeerType);
        this.d0 = uj3Var;
        this.c0 = tj3Var;
    }

    @Override // gk3
    public final void K() {
        this.d0.presentFragment(new ds());
    }

    @Override // gk3
    public final void L() {
        uj3 uj3Var = this.d0;
        id idVar = new id(3, null, uj3Var.getParentActivity());
        TLRPC.RequestPeerType requestPeerType = uj3Var.H;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle j = qu6.j(0, "step");
            Boolean bool = uj3Var.H.has_username;
            if (bool != null) {
                j.putBoolean("forcePublic", bool.booleanValue());
            }
            gi1 gi1Var = new gi1(j);
            gi1Var.v0 = new p((Object) uj3Var, (Object) gi1Var, (Object) idVar, (byte) 8);
            uj3Var.presentFragment(gi1Var);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = uj3Var.H.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{uj3Var.getUserConfig().e()} : new long[]{uj3Var.getUserConfig().e(), uj3Var.I});
            Boolean bool3 = uj3Var.H.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            xc5 xc5Var = new xc5(bundle);
            xc5Var.Z = new qi3(uj3Var, idVar);
            uj3Var.presentFragment(xc5Var);
        }
    }

    @Override // gk3
    public final void M(TLRPC.User user) {
        int i;
        i = ((e) this.d0).currentAccount;
        uc7.s1(i).G3(null, user, null, 0, null, false, false);
    }

    @Override // gk3
    public final boolean O() {
        return this.d0.T0 == 0;
    }

    @Override // gk3, j79
    public final void f() {
        b();
        int i = tj3.M;
        try {
            super.f();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        uj3 uj3Var = this.d0;
        if (uj3Var.T0 == 15) {
            uj3Var.k0.setVisibility(this.V ? 8 : 0);
        }
    }

    @Override // gk3, kf3
    public final void o(of3 of3Var) {
        int i;
        if (of3Var.getMessage() != null) {
            uj3 uj3Var = this.d0;
            qyb qybVar = uj3Var.getMessagesController().g4;
            long j = -of3Var.getDialogId();
            i = ((e) uj3Var).currentAccount;
            TLRPC.TL_forumTopic f = qybVar.f(j, r47.b2(i, of3Var.getMessage().k, true, false));
            if (f != null) {
                if (uj3Var.n2) {
                    uj3Var.k3(of3Var.getDialogId(), f.id, false, null);
                } else {
                    ro4.n(uj3Var, -of3Var.getDialogId(), f, 0);
                }
            }
        }
    }

    @Override // gk3, kf3
    public final void w(of3 of3Var) {
        tj3 tj3Var = this.c0;
        tj3Var.a.getClass();
        this.d0.D4(of3Var, RecyclerView.S(of3Var), 0.0f, tj3Var.d);
    }
}
