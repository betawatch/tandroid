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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ww extends tf.k {
    public final /* synthetic */ ny a0;
    public final /* synthetic */ oy b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(oy oyVar, oy oyVar2, Context context, int i10, int i11, boolean z4, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, ny nyVar) {
        super(oyVar2, context, i10, i11, z4, arrayList, i12, requestPeerType);
        this.b0 = oyVar;
        this.a0 = nyVar;
    }

    @Override // tf.k
    public final void J() {
        this.b0.presentFragment(new n());
    }

    @Override // tf.k
    public final void K() {
        oy oyVar = this.b0;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(oyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = oyVar.D;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle h = android.support.v4.media.a.h(0, "step");
            Boolean bool = oyVar.D.has_username;
            if (bool != null) {
                h.putBoolean("forcePublic", bool.booleanValue());
            }
            nd ndVar = new nd(h);
            ndVar.q0 = new p6(oyVar, ndVar, d2Var, 2);
            oyVar.presentFragment(ndVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = oyVar.D.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{oyVar.getUserConfig().getClientUserId()} : new long[]{oyVar.getUserConfig().getClientUserId(), oyVar.E});
            Boolean bool3 = oyVar.D.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            e70 e70Var = new e70(bundle);
            e70Var.V = new ox(oyVar, d2Var);
            oyVar.presentFragment(e70Var);
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

    @Override // tf.k, org.telegram.ui.Cells.n2
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
        ny nyVar = this.a0;
        nyVar.a.getClass();
        this.b0.o4(r2Var, RecyclerView.R(r2Var), 0.0f, nyVar.d);
    }

    @Override // tf.k, org.telegram.ui.Cells.n2
    public final void d(org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        if (r2Var.getMessage() != null) {
            oy oyVar = this.b0;
            TopicsController topicsController = oyVar.getMessagesController().getTopicsController();
            long j10 = -r2Var.getDialogId();
            i10 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, MessageObject.getTopicId(i10, r2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (oyVar.i2) {
                    oyVar.O3(r2Var.getDialogId(), findTopic.id, false, null);
                } else {
                    ag.f.m(oyVar, -r2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override // tf.k, f2.o0
    public final void l() {
        h();
        int i10 = ny.I;
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
        oy oyVar = this.b0;
        if (oyVar.O0 == 15) {
            oyVar.g0.setVisibility(this.R ? 8 : 0);
        }
    }
}
