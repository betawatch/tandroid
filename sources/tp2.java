// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tp2 extends b6c {
    static {
        b6c.h(new tp2());
    }

    public static c6c i(tb7 tb7Var, dg3 dg3Var) {
        TLRPC.User user = tb7Var.c;
        if (user != null) {
            c6c K = c6c.K(tp2.class);
            long j = user.id;
            K.C = j;
            K.d = (int) (j ^ (j >>> 32));
            K.H = user;
            K.I = dg3Var;
            return K;
        }
        TLRPC.Chat chat = tb7Var.b;
        c6c K2 = c6c.K(tp2.class);
        long j2 = chat != null ? -chat.id : 0L;
        K2.C = j2;
        K2.d = (int) (j2 ^ (j2 >>> 32));
        K2.H = chat;
        K2.I = dg3Var;
        return K2;
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        hg3 hg3Var = (hg3) view;
        hg3Var.setDialogCellDelegate((dg3) c6cVar.I);
        Object obj = c6cVar.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            hg3Var.R0 = sd2.e0(z8c.t0, chat);
            TLRPC.Dialog R0 = oc7.r1(z8c.t0).R0(-chat.id);
            hg3Var.Q0 = R0 == null;
            if (R0 != null) {
                hg3Var.setCustomMessageWithoutRebuild(null);
                hg3Var.f0(R0, 0, 0);
                return;
            } else {
                hg3Var.setCustomMessageWithoutRebuild(jb6.G(chat.participants_count, "Members", new Object[0]));
                hg3Var.e0(-chat.id, null, 0, false, false);
                return;
            }
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            hg3Var.R0 = sd2.f0(z8c.t0, user);
            TLRPC.Dialog R02 = oc7.r1(z8c.t0).R0(user.id);
            hg3Var.Q0 = R02 == null;
            if (R02 != null) {
                hg3Var.setCustomMessageWithoutRebuild(null);
                hg3Var.f0(R02, 0, 0);
            } else {
                hg3Var.setCustomMessageWithoutRebuild(jb6.M0(2131753121, null));
                hg3Var.e0(user.id, null, 0, false, false);
            }
        }
    }

    @Override // b6c
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.d == c6cVar2.d;
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        hg3 hg3Var = new hg3(null, context, false, i, ylbVar);
        hg3Var.P0 = true;
        return hg3Var;
    }

    @Override // b6c
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.d == c6cVar2.d;
    }
}
