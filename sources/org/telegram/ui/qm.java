package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class qm extends org.telegram.ui.Cells.r9 {
    public wn B0;

    @Override // org.telegram.ui.Cells.da
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages y82;
        wn wnVar = this.B0;
        if (wnVar != null) {
            int min = Math.min(i11, wnVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (y82 = this.B0.y8(messageObject.getGroupId())) != null && !y82.isDocuments) {
                messageObject = y82.captionMessage;
            }
            if (messageObject == null) {
                return;
            }
            mn b10 = mn.b(i10, min, messageObject);
            if (b10.i == null) {
                return;
            }
            jk jkVar = this.B0.Y;
            if (jkVar != null && jkVar.getVisibility() == 0) {
                kVar = ((org.telegram.ui.ActionBar.m2) this.B0).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) this.B0).actionBar;
                    if (kVar2.s()) {
                        this.B0.z7(false);
                    }
                }
                this.B0.Cb(messageObject, b10);
                jk jkVar2 = this.B0.Y;
                if (jkVar2 != null) {
                    jkVar2.H0();
                    return;
                }
                return;
            }
            wn wnVar2 = this.B0;
            wnVar2.l5 = b10;
            wnVar2.n5 = messageObject;
            wnVar2.f5 = new MessagePreviewParams(wnVar2.h != null, wnVar2.y9(), ChatObject.isMonoForum(this.B0.e));
            wn wnVar3 = this.B0;
            wnVar3.f5.updateReply(wnVar3.n5, wnVar3.y8(messageObject.getGroupId()), this.B0.a(), this.B0.l5);
            Bundle e = org.telegram.messenger.ok.e(3, "onlySelect", "dialogsType", true);
            e.putBoolean("quote", true);
            e.putInt("messagesCount", 1);
            e.putBoolean("canSelectTopics", true);
            qy qyVar = new qy(e);
            wn wnVar4 = this.B0;
            qyVar.C2 = wnVar4;
            wnVar4.presentFragment(qyVar);
        }
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean b() {
        wn wnVar;
        wn wnVar2 = this.B0;
        if ((wnVar2 != null && wnVar2.a() == UserObject.VERIFY) || (wnVar = this.B0) == null) {
            return true;
        }
        if (wnVar.a() < 0 && this.B0.getMessagesController().isPeerNoForwards(this.B0.a())) {
            return false;
        }
        org.telegram.ui.Cells.y9 y9Var = this.W;
        return y9Var == null || ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() == null || ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards;
    }

    public final void d0(wn wnVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.u0;
            if (i10 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.B0 = wnVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            i10++;
        }
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean e() {
        org.telegram.ui.Cells.y9 y9Var;
        wn wnVar;
        org.telegram.ui.Cells.y9 y9Var2;
        TLRPC.Chat chat;
        wn wnVar2 = this.B0;
        if (wnVar2 == null || wnVar2.a() != UserObject.VERIFY) {
            wn wnVar3 = this.B0;
            boolean z10 = (wnVar3 != null && wnVar3.y9()) || !((y9Var = this.W) == null || ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() == null || ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards);
            if (!this.x0 && (wnVar = this.B0) != null && wnVar.h == null && (((y9Var2 = this.W) == null || (((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().richLayout == null && !this.B0.c9.v0)) && !this.B0.getMessagesController().getTranslateController().isTranslatingDialog(this.B0.T5) && !UserObject.isService(this.B0.T5) && (!z10 || (chat = this.B0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.da
    public final int p() {
        wn wnVar = this.B0;
        if (wnVar == null) {
            return 0;
        }
        return wnVar.Aa;
    }

    @Override // org.telegram.ui.Cells.da
    public final int q() {
        wn wnVar = this.B0;
        if (wnVar == null) {
            return 0;
        }
        return (int) wnVar.s9;
    }

    @Override // org.telegram.ui.Cells.da
    public final org.telegram.ui.ActionBar.d6 r() {
        wn wnVar = this.B0;
        if (wnVar != null) {
            return wnVar.ea;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.da
    public final int u(int i10) {
        return org.telegram.ui.ActionBar.h6.v0(i10, this.B0.ea);
    }
}
