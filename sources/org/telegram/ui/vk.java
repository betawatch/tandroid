package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vk implements org.telegram.ui.Components.ek0 {
    public final /* synthetic */ tn a;

    public vk(tn tnVar) {
        this.a = tnVar;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean O() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r5 == null) goto L26;
     */
    @Override // org.telegram.ui.Components.ek0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(View view, kg.q0 q0Var, boolean z10, boolean z11) {
        TLRPC.Document f9;
        boolean z12;
        HashSet hashSet;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.Message message;
        tn tnVar = this.a;
        SparseArray[] sparseArrayArr = tnVar.S5;
        if (tnVar.Xa == null) {
            return;
        }
        if (tnVar.a() == tnVar.getUserConfig().getClientUserId() && !tnVar.getUserConfig().isPremium()) {
            new cg.p1((org.telegram.ui.ActionBar.o2) tnVar, 24, true).show();
            tnVar.z7(false);
            return;
        }
        boolean contains = tnVar.Xa.getSelectedReactions().contains(q0Var);
        HashSet hashSet2 = new HashSet();
        int i12 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i13 = 0;
        while (i12 < sparseArrayArr.length) {
            boolean z15 = z13;
            boolean z16 = z14;
            int i14 = i13;
            int i15 = 0;
            while (i15 < sparseArrayArr[i12].size()) {
                MessageObject messageObject2 = (MessageObject) sparseArrayArr[i12].valueAt(i15);
                if (messageObject2.hasValidGroupId()) {
                    MessageObject.GroupedMessages X8 = tnVar.X8(messageObject2);
                    if (X8 != null && !hashSet2.contains(Long.valueOf(X8.groupId))) {
                        hashSet2.add(Long.valueOf(X8.groupId));
                        messageObject2 = X8.findPrimaryMessageObject();
                    }
                    z12 = contains;
                    hashSet = hashSet2;
                    i10 = i12;
                    i11 = i15;
                    i15 = i11 + 1;
                    hashSet2 = hashSet;
                    contains = z12;
                    i12 = i10;
                }
                if (messageObject2.hasReaction(q0Var) == contains) {
                    hashSet = hashSet2;
                    messageObject = messageObject2;
                    z12 = contains;
                    i10 = i12;
                    i11 = i15;
                    tnVar.ab(tnVar.q8(messageObject2.getId(), false), messageObject, null, null, 0.0f, 0.0f, q0Var, false, false, false, true);
                    if (!z12) {
                        i14++;
                    }
                } else {
                    z12 = contains;
                    hashSet = hashSet2;
                    i10 = i12;
                    i11 = i15;
                    messageObject = messageObject2;
                }
                if (messageObject.messageOwner != null) {
                    boolean z17 = tnVar.w0.J;
                    if (z17) {
                        MessageObject messageObject3 = (MessageObject) tnVar.k6[0].get(messageObject.getId());
                        if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                            message.reactions = messageObject.messageOwner.reactions;
                        }
                    } else if (!z17 && tnVar.m3 != null) {
                        z15 = true;
                    }
                }
                if (tnVar.w0.J && !messageObject.hasReaction(tnVar.m3)) {
                    MessageObject.GroupedMessages X82 = tnVar.X8(messageObject);
                    if (X82 != null) {
                        for (int i16 = 0; i16 < X82.messages.size(); i16++) {
                            tnVar.getMediaDataController().removeMessageFromResults(X82.messages.get(i16).getId());
                        }
                    } else {
                        tnVar.getMediaDataController().removeMessageFromResults(messageObject.getId());
                    }
                    rf.z0 z0Var = tnVar.I3;
                    if (z0Var != null) {
                        z0Var.l();
                    }
                    z15 = true;
                    z16 = true;
                }
                i15 = i11 + 1;
                hashSet2 = hashSet;
                contains = z12;
                i12 = i10;
            }
            i12++;
            z13 = z15;
            z14 = z16;
            i13 = i14;
        }
        if (z13) {
            tnVar.kc(z14);
        }
        tnVar.z7(true);
        if (i13 > 0) {
            long j10 = q0Var.g;
            if (j10 == 0) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f);
                if (tL_availableReaction == null) {
                    return;
                } else {
                    f9 = tL_availableReaction.activate_animation;
                }
            } else {
                f9 = org.telegram.ui.Components.p5.f(UserConfig.selectedAccount, j10);
            }
            if (f9 == null) {
                return;
            }
            org.telegram.ui.Components.tc.a0(tnVar).y(i13, f9, null).k(true);
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.ek0
    public final /* synthetic */ void G(Canvas canvas, RectF rectF, float f9, float f10, float f11, int i10, boolean z10) {
    }
}
