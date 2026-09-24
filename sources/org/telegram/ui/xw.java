package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class xw extends gg.m {
    public final /* synthetic */ py d0;
    public final /* synthetic */ qy e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(qy qyVar, qy qyVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, py pyVar) {
        super(qyVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.e0 = qyVar;
        this.d0 = pyVar;
    }

    @Override // gg.m
    public final void J() {
        this.e0.presentFragment(new l());
    }

    @Override // gg.m
    public final void K() {
        qy qyVar = this.e0;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(qyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = qyVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle g10 = org.telegram.ui.Cells.c1.g(0, "step");
            Boolean bool = qyVar.G.has_username;
            if (bool != null) {
                g10.putBoolean("forcePublic", bool.booleanValue());
            }
            ld ldVar = new ld(g10);
            ldVar.t0 = new l6(qyVar, ldVar, a2Var, 2);
            qyVar.presentFragment(ldVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = qyVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{qyVar.getUserConfig().getClientUserId()} : new long[]{qyVar.getUserConfig().getClientUserId(), qyVar.H});
            Boolean bool3 = qyVar.G.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            g70 g70Var = new g70(bundle);
            g70Var.Y = new px(qyVar, a2Var);
            qyVar.presentFragment(g70Var);
        }
    }

    @Override // gg.m
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.m2) this.e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override // gg.m
    public final boolean S() {
        return this.e0.R0 == 0;
    }

    @Override // gg.m, org.telegram.ui.Cells.o2
    public final void a(org.telegram.ui.Cells.s2 s2Var) {
        py pyVar = this.d0;
        pyVar.a.getClass();
        this.e0.o4(s2Var, RecyclerView.R(s2Var), 0.0f, pyVar.d);
    }

    @Override // gg.m, org.telegram.ui.Cells.o2
    public final void d(org.telegram.ui.Cells.s2 s2Var) {
        int i10;
        if (s2Var.getMessage() != null) {
            qy qyVar = this.e0;
            TopicsController topicsController = qyVar.getMessagesController().getTopicsController();
            long j3 = -s2Var.getDialogId();
            i10 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, MessageObject.getTopicId(i10, s2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (qyVar.l2) {
                    qyVar.O3(s2Var.getDialogId(), findTopic.id, false, null);
                } else {
                    ng.d.m(qyVar, -s2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override // gg.m, s4.h0
    public final void l() {
        h();
        int i10 = py.L;
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
        qy qyVar = this.e0;
        if (qyVar.R0 == 15) {
            qyVar.j0.setVisibility(this.U ? 8 : 0);
        }
    }
}
