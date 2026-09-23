package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class rm extends org.telegram.ui.Cells.s9 {
    public xn B0;

    @Override // org.telegram.ui.Cells.ea
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages y82;
        xn xnVar = this.B0;
        if (xnVar != null) {
            int min = Math.min(i11, xnVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (y82 = this.B0.y8(messageObject.getGroupId())) != null && !y82.isDocuments) {
                messageObject = y82.captionMessage;
            }
            if (messageObject == null) {
                return;
            }
            nn b10 = nn.b(i10, min, messageObject);
            if (b10.i == null) {
                return;
            }
            jk jkVar = this.B0.Y;
            if (jkVar != null && jkVar.getVisibility() == 0) {
                kVar = ((org.telegram.ui.ActionBar.n2) this.B0).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) this.B0).actionBar;
                    if (kVar2.s()) {
                        this.B0.z7(false);
                    }
                }
                this.B0.Cb(messageObject, b10);
                jk jkVar2 = this.B0.Y;
                if (jkVar2 != null) {
                    jkVar2.I0();
                    return;
                }
                return;
            }
            xn xnVar2 = this.B0;
            xnVar2.l5 = b10;
            xnVar2.n5 = messageObject;
            xnVar2.f5 = new MessagePreviewParams(xnVar2.h != null, xnVar2.y9(), ChatObject.isMonoForum(this.B0.e));
            xn xnVar3 = this.B0;
            xnVar3.f5.updateReply(xnVar3.n5, xnVar3.y8(messageObject.getGroupId()), this.B0.a(), this.B0.l5);
            Bundle e = org.telegram.messenger.z0.e(3, "onlySelect", "dialogsType", true);
            e.putBoolean("quote", true);
            e.putInt("messagesCount", 1);
            e.putBoolean("canSelectTopics", true);
            ry ryVar = new ry(e);
            xn xnVar4 = this.B0;
            ryVar.C2 = xnVar4;
            xnVar4.presentFragment(ryVar);
        }
    }

    @Override // org.telegram.ui.Cells.ea
    public final boolean b() {
        xn xnVar;
        xn xnVar2 = this.B0;
        if ((xnVar2 != null && xnVar2.a() == UserObject.VERIFY) || (xnVar = this.B0) == null) {
            return true;
        }
        if (xnVar.a() < 0 && this.B0.getMessagesController().isPeerNoForwards(this.B0.a())) {
            return false;
        }
        org.telegram.ui.Cells.z9 z9Var = this.W;
        return z9Var == null || ((org.telegram.ui.Cells.t1) z9Var).getMessageObject() == null || ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards;
    }

    public final void d0(xn xnVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.u0;
            if (i10 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.B0 = xnVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            i10++;
        }
    }

    @Override // org.telegram.ui.Cells.ea
    public final boolean e() {
        org.telegram.ui.Cells.z9 z9Var;
        xn xnVar;
        org.telegram.ui.Cells.z9 z9Var2;
        TLRPC.Chat chat;
        xn xnVar2 = this.B0;
        if (xnVar2 == null || xnVar2.a() != UserObject.VERIFY) {
            xn xnVar3 = this.B0;
            boolean z10 = (xnVar3 != null && xnVar3.y9()) || !((z9Var = this.W) == null || ((org.telegram.ui.Cells.t1) z9Var).getMessageObject() == null || ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards);
            if (!this.x0 && (xnVar = this.B0) != null && xnVar.h == null && (((z9Var2 = this.W) == null || (((org.telegram.ui.Cells.t1) z9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().richLayout == null && !this.B0.c9.v0)) && !this.B0.getMessagesController().getTranslateController().isTranslatingDialog(this.B0.T5) && !UserObject.isService(this.B0.T5) && (!z10 || (chat = this.B0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.ea
    public final int p() {
        xn xnVar = this.B0;
        if (xnVar == null) {
            return 0;
        }
        return xnVar.Aa;
    }

    @Override // org.telegram.ui.Cells.ea
    public final int q() {
        xn xnVar = this.B0;
        if (xnVar == null) {
            return 0;
        }
        return (int) xnVar.s9;
    }

    @Override // org.telegram.ui.Cells.ea
    public final org.telegram.ui.ActionBar.d6 r() {
        xn xnVar = this.B0;
        if (xnVar != null) {
            return xnVar.ea;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.ea
    public final int u(int i10) {
        return org.telegram.ui.ActionBar.h6.v0(i10, this.B0.ea);
    }
}
