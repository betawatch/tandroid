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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sk implements org.telegram.ui.Components.tj0 {
    public final /* synthetic */ qn a;

    public sk(qn qnVar) {
        this.a = qnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r5 == null) goto L26;
     */
    @Override // org.telegram.ui.Components.tj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(View view, hg.r0 r0Var, boolean z10, boolean z11) {
        TLRPC.Document f10;
        boolean z12;
        HashSet hashSet;
        int i9;
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        qn qnVar = this.a;
        SparseArray[] sparseArrayArr = qnVar.S5;
        if (qnVar.Xa == null) {
            return;
        }
        if (qnVar.a() == qnVar.getUserConfig().getClientUserId() && !qnVar.getUserConfig().isPremium()) {
            new zf.x0((org.telegram.ui.ActionBar.o2) qnVar, 24, true).show();
            qnVar.z7(false);
            return;
        }
        boolean contains = qnVar.Xa.getSelectedReactions().contains(r0Var);
        HashSet hashSet2 = new HashSet();
        int i11 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i12 = 0;
        while (i11 < sparseArrayArr.length) {
            boolean z15 = z13;
            boolean z16 = z14;
            int i13 = i12;
            int i14 = 0;
            while (i14 < sparseArrayArr[i11].size()) {
                MessageObject messageObject2 = (MessageObject) sparseArrayArr[i11].valueAt(i14);
                if (messageObject2.hasValidGroupId()) {
                    MessageObject.GroupedMessages X8 = qnVar.X8(messageObject2);
                    if (X8 != null && !hashSet2.contains(Long.valueOf(X8.groupId))) {
                        hashSet2.add(Long.valueOf(X8.groupId));
                        messageObject2 = X8.findPrimaryMessageObject();
                    }
                    z12 = contains;
                    hashSet = hashSet2;
                    i9 = i11;
                    i10 = i14;
                    i14 = i10 + 1;
                    hashSet2 = hashSet;
                    contains = z12;
                    i11 = i9;
                }
                if (messageObject2.hasReaction(r0Var) == contains) {
                    hashSet = hashSet2;
                    messageObject = messageObject2;
                    z12 = contains;
                    i9 = i11;
                    i10 = i14;
                    qnVar.ab(qnVar.q8(messageObject2.getId(), false), messageObject, null, null, 0.0f, 0.0f, r0Var, false, false, false, true);
                    if (!z12) {
                        i13++;
                    }
                } else {
                    z12 = contains;
                    hashSet = hashSet2;
                    i9 = i11;
                    i10 = i14;
                    messageObject = messageObject2;
                }
                if (messageObject.messageOwner != null) {
                    boolean z17 = qnVar.w0.J;
                    if (z17) {
                        MessageObject messageObject3 = (MessageObject) qnVar.k6[0].get(messageObject.getId());
                        if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                            message.reactions = messageObject.messageOwner.reactions;
                        }
                    } else if (!z17 && qnVar.m3 != null) {
                        z15 = true;
                    }
                }
                if (qnVar.w0.J && !messageObject.hasReaction(qnVar.m3)) {
                    MessageObject.GroupedMessages X82 = qnVar.X8(messageObject);
                    if (X82 != null) {
                        for (int i15 = 0; i15 < X82.messages.size(); i15++) {
                            qnVar.getMediaDataController().removeMessageFromResults(X82.messages.get(i15).getId());
                        }
                    } else {
                        qnVar.getMediaDataController().removeMessageFromResults(messageObject.getId());
                    }
                    of.j1 j1Var = qnVar.I3;
                    if (j1Var != null) {
                        j1Var.l();
                    }
                    z15 = true;
                    z16 = true;
                }
                i14 = i10 + 1;
                hashSet2 = hashSet;
                contains = z12;
                i11 = i9;
            }
            i11++;
            z13 = z15;
            z14 = z16;
            i12 = i13;
        }
        if (z13) {
            qnVar.kc(z14);
        }
        qnVar.z7(true);
        if (i12 > 0) {
            long j10 = r0Var.g;
            if (j10 == 0) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(r0Var.f);
                if (tL_availableReaction == null) {
                    return;
                } else {
                    f10 = tL_availableReaction.activate_animation;
                }
            } else {
                f10 = org.telegram.ui.Components.k5.f(UserConfig.selectedAccount, j10);
            }
            if (f10 == null) {
                return;
            }
            org.telegram.ui.Components.oc.a0(qnVar).y(i12, f10, null).k(true);
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ boolean n() {
        return true;
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
    }
}
