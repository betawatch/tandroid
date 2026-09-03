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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xw extends uf.k {
    public final /* synthetic */ oy a0;
    public final /* synthetic */ py b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(py pyVar, py pyVar2, Context context, int i10, int i11, boolean z4, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, oy oyVar) {
        super(pyVar2, context, i10, i11, z4, arrayList, i12, requestPeerType);
        this.b0 = pyVar;
        this.a0 = oyVar;
    }

    @Override // uf.k
    public final void J() {
        this.b0.presentFragment(new n());
    }

    @Override // uf.k
    public final void K() {
        py pyVar = this.b0;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(pyVar.getParentActivity(), 3, null);
        TLRPC.RequestPeerType requestPeerType = pyVar.D;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle h = android.support.v4.media.a.h(0, "step");
            Boolean bool = pyVar.D.has_username;
            if (bool != null) {
                h.putBoolean("forcePublic", bool.booleanValue());
            }
            nd ndVar = new nd(h);
            ndVar.q0 = new p6(pyVar, ndVar, d2Var, 2);
            pyVar.presentFragment(ndVar);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = pyVar.D.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{pyVar.getUserConfig().getClientUserId()} : new long[]{pyVar.getUserConfig().getClientUserId(), pyVar.E});
            Boolean bool3 = pyVar.D.forum;
            bundle.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle.putBoolean("canToggleTopics", false);
            f70 f70Var = new f70(bundle);
            f70Var.V = new px(pyVar, d2Var);
            pyVar.presentFragment(f70Var);
        }
    }

    @Override // uf.k
    public final void L(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.p2) this.b0).currentAccount;
        MessagesController.getInstance(i10).openApp(user, 0);
    }

    @Override // uf.k
    public final boolean S() {
        return this.b0.O0 == 0;
    }

    @Override // uf.k, org.telegram.ui.Cells.n2
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
        oy oyVar = this.a0;
        oyVar.a.getClass();
        this.b0.o4(r2Var, RecyclerView.R(r2Var), 0.0f, oyVar.d);
    }

    @Override // uf.k, org.telegram.ui.Cells.n2
    public final void d(org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        if (r2Var.getMessage() != null) {
            py pyVar = this.b0;
            TopicsController topicsController = pyVar.getMessagesController().getTopicsController();
            long j10 = -r2Var.getDialogId();
            i10 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, MessageObject.getTopicId(i10, r2Var.getMessage().messageOwner, true));
            if (findTopic != null) {
                if (pyVar.i2) {
                    pyVar.O3(r2Var.getDialogId(), findTopic.id, false, null);
                } else {
                    bg.e.m(pyVar, -r2Var.getDialogId(), findTopic, 0);
                }
            }
        }
    }

    @Override // uf.k, f2.p0
    public final void l() {
        h();
        int i10 = oy.I;
        try {
            super.l();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        py pyVar = this.b0;
        if (pyVar.O0 == 15) {
            pyVar.g0.setVisibility(this.R ? 8 : 0);
        }
    }
}
