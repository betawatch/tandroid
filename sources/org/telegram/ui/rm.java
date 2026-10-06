package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class rm extends org.telegram.ui.Cells.r9 {
    public yn B0;

    @Override // org.telegram.ui.Cells.da
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages z82;
        yn ynVar = this.B0;
        if (ynVar != null) {
            int min = Math.min(i11, ynVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (z82 = this.B0.z8(messageObject.getGroupId())) != null && !z82.isDocuments) {
                messageObject = z82.captionMessage;
            }
            if (messageObject == null) {
                return;
            }
            on b10 = on.b(i10, min, messageObject);
            if (b10.i == null) {
                return;
            }
            jk jkVar = this.B0.W;
            if (jkVar != null && jkVar.getVisibility() == 0) {
                kVar = ((org.telegram.ui.ActionBar.n2) this.B0).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) this.B0).actionBar;
                    if (kVar2.s()) {
                        this.B0.z7(false);
                    }
                }
                this.B0.Bb(messageObject, b10);
                jk jkVar2 = this.B0.W;
                if (jkVar2 != null) {
                    jkVar2.H0();
                    return;
                }
                return;
            }
            yn ynVar2 = this.B0;
            ynVar2.j5 = b10;
            ynVar2.l5 = messageObject;
            ynVar2.d5 = new MessagePreviewParams(ynVar2.h != null, ynVar2.x9(), ChatObject.isMonoForum(this.B0.e));
            yn ynVar3 = this.B0;
            ynVar3.d5.updateReply(ynVar3.l5, ynVar3.z8(messageObject.getGroupId()), this.B0.a(), this.B0.j5);
            Bundle d = org.telegram.messenger.bi.d(3, "onlySelect", "dialogsType", true);
            d.putBoolean("quote", true);
            d.putInt("messagesCount", 1);
            d.putBoolean("canSelectTopics", true);
            uy uyVar = new uy(d);
            yn ynVar4 = this.B0;
            uyVar.C2 = ynVar4;
            ynVar4.presentFragment(uyVar);
        }
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean b() {
        yn ynVar;
        yn ynVar2 = this.B0;
        if ((ynVar2 != null && ynVar2.a() == UserObject.VERIFY) || (ynVar = this.B0) == null) {
            return true;
        }
        if (ynVar.a() < 0 && this.B0.getMessagesController().isPeerNoForwards(this.B0.a())) {
            return false;
        }
        org.telegram.ui.Cells.y9 y9Var = this.W;
        return y9Var == null || ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() == null || ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards;
    }

    public final void d0(yn ynVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.u0;
            if (i10 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.B0 = ynVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            i10++;
        }
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean e() {
        org.telegram.ui.Cells.y9 y9Var;
        yn ynVar;
        org.telegram.ui.Cells.y9 y9Var2;
        TLRPC.Chat chat;
        yn ynVar2 = this.B0;
        if (ynVar2 == null || ynVar2.a() != UserObject.VERIFY) {
            yn ynVar3 = this.B0;
            boolean z10 = (ynVar3 != null && ynVar3.x9()) || !((y9Var = this.W) == null || ((org.telegram.ui.Cells.u1) y9Var).getMessageObject() == null || ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards);
            if (!this.x0 && (ynVar = this.B0) != null && ynVar.h == null && (((y9Var2 = this.W) == null || (((org.telegram.ui.Cells.u1) y9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().richLayout == null && !this.B0.a9.v0)) && !this.B0.getMessagesController().getTranslateController().isTranslatingDialog(this.B0.R5) && !UserObject.isService(this.B0.R5) && (!z10 || (chat = this.B0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.da
    public final int p() {
        yn ynVar = this.B0;
        if (ynVar == null) {
            return 0;
        }
        return ynVar.ya;
    }

    @Override // org.telegram.ui.Cells.da
    public final int q() {
        yn ynVar = this.B0;
        if (ynVar == null) {
            return 0;
        }
        return (int) ynVar.q9;
    }

    @Override // org.telegram.ui.Cells.da
    public final org.telegram.ui.ActionBar.d6 r() {
        yn ynVar = this.B0;
        if (ynVar != null) {
            return ynVar.ca;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.da
    public final int u(int i10) {
        return org.telegram.ui.ActionBar.i6.v0(i10, this.B0.ca);
    }
}
