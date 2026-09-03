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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class yw extends tf.k {
    public final /* synthetic */ py a0;
    public final /* synthetic */ qy b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(qy qyVar, qy qyVar2, Context context, int i10, int i11, boolean z4, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, py pyVar) {
        super(qyVar2, context, i10, i11, z4, arrayList, i12, requestPeerType);
        this.b0 = qyVar;
        this.a0 = pyVar;
    }

    @Override // tf.k
    public final void J() {
        this.b0.presentFragment(new n());
    }

    @Override // tf.k
    public final void K() {
        qy qyVar = this.b0;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(qyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = qyVar.D;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle h = android.support.v4.media.a.h(0, "step");
            Boolean bool = qyVar.D.has_username;
            if (bool != null) {
                h.putBoolean("forcePublic", bool.booleanValue());
            }
            pd pdVar = new pd(h);
            pdVar.q0 = new r6(qyVar, pdVar, d2Var, 2);
            qyVar.presentFragment(pdVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = qyVar.D.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{qyVar.getUserConfig().getClientUserId()} : new long[]{qyVar.getUserConfig().getClientUserId(), qyVar.E});
            Boolean bool3 = qyVar.D.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            g70 g70Var = new g70(bundle);
            g70Var.V = new qx(qyVar, d2Var);
            qyVar.presentFragment(g70Var);
        }
    }

    @Override // tf.k
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.p2) this.b0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override // tf.k
    public final boolean S() {
        return this.b0.O0 == 0;
    }

    @Override // tf.k, org.telegram.ui.Cells.m2
    public final void a(org.telegram.ui.Cells.q2 q2Var) {
        py pyVar = this.a0;
        pyVar.a.getClass();
        this.b0.o4(q2Var, RecyclerView.R(q2Var), 0.0f, pyVar.d);
    }

    @Override // tf.k, org.telegram.ui.Cells.m2
    public final void d(org.telegram.ui.Cells.q2 q2Var) {
        int i10;
        if (q2Var.getMessage() != null) {
            qy qyVar = this.b0;
            TopicsController topicsController = qyVar.getMessagesController().getTopicsController();
            long j10 = -q2Var.getDialogId();
            i10 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, MessageObject.getTopicId(i10, q2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (qyVar.i2) {
                    qyVar.O3(q2Var.getDialogId(), findTopic.id, false, null);
                } else {
                    ag.f.m(qyVar, -q2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override // tf.k, f2.o0
    public final void l() {
        h();
        int i10 = py.I;
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
        qy qyVar = this.b0;
        if (qyVar.O0 == 15) {
            qyVar.g0.setVisibility(this.R ? 8 : 0);
        }
    }
}
