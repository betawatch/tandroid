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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class yw extends gg.m {
    public final /* synthetic */ qy d0;
    public final /* synthetic */ ry e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(ry ryVar, ry ryVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, qy qyVar) {
        super(ryVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.e0 = ryVar;
        this.d0 = qyVar;
    }

    @Override // gg.m
    public final void J() {
        this.e0.presentFragment(new l());
    }

    @Override // gg.m
    public final void K() {
        ry ryVar = this.e0;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ryVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = ryVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle e = org.telegram.ui.Cells.q3.e(0, "step");
            Boolean bool = ryVar.G.has_username;
            if (bool != null) {
                e.putBoolean("forcePublic", bool.booleanValue());
            }
            ld ldVar = new ld(e);
            ldVar.t0 = new m6(ryVar, ldVar, b2Var, 2);
            ryVar.presentFragment(ldVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = ryVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{ryVar.getUserConfig().getClientUserId()} : new long[]{ryVar.getUserConfig().getClientUserId(), ryVar.H});
            Boolean bool3 = ryVar.G.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            i70 i70Var = new i70(bundle);
            i70Var.Y = new qx(ryVar, b2Var);
            ryVar.presentFragment(i70Var);
        }
    }

    @Override // gg.m
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.n2) this.e0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override // gg.m
    public final boolean S() {
        return this.e0.R0 == 0;
    }

    @Override // gg.m, org.telegram.ui.Cells.n2
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
        qy qyVar = this.d0;
        qyVar.a.getClass();
        this.e0.o4(r2Var, RecyclerView.R(r2Var), 0.0f, qyVar.d);
    }

    @Override // gg.m, org.telegram.ui.Cells.n2
    public final void d(org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        if (r2Var.getMessage() != null) {
            ry ryVar = this.e0;
            TopicsController topicsController = ryVar.getMessagesController().getTopicsController();
            long j3 = -r2Var.getDialogId();
            i10 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, MessageObject.getTopicId(i10, r2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (ryVar.l2) {
                    ryVar.O3(r2Var.getDialogId(), findTopic.id, false, null);
                } else {
                    ng.d.m(ryVar, -r2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override // gg.m, s4.h0
    public final void l() {
        h();
        int i10 = qy.L;
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
        ry ryVar = this.e0;
        if (ryVar.R0 == 15) {
            ryVar.j0.setVisibility(this.U ? 8 : 0);
        }
    }
}
