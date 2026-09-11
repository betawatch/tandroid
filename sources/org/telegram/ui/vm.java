package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class vm extends org.telegram.ui.Cells.r9 {
    public co B0;

    @Override // org.telegram.ui.Cells.da
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages y82;
        co coVar = this.B0;
        if (coVar != null) {
            int min = Math.min(i11, coVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (y82 = this.B0.y8(messageObject.getGroupId())) != null && !y82.isDocuments) {
                messageObject = y82.captionMessage;
            }
            if (messageObject == null) {
                return;
            }
            sn b10 = sn.b(i10, min, messageObject);
            if (b10.i == null) {
                return;
            }
            mk mkVar = this.B0.Y;
            if (mkVar != null && mkVar.getVisibility() == 0) {
                kVar = ((org.telegram.ui.ActionBar.n2) this.B0).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) this.B0).actionBar;
                    if (kVar2.s()) {
                        this.B0.z7(false);
                    }
                }
                this.B0.Cb(messageObject, b10);
                mk mkVar2 = this.B0.Y;
                if (mkVar2 != null) {
                    mkVar2.H0();
                    return;
                }
                return;
            }
            co coVar2 = this.B0;
            coVar2.l5 = b10;
            coVar2.n5 = messageObject;
            coVar2.f5 = new MessagePreviewParams(coVar2.h != null, coVar2.y9(), ChatObject.isMonoForum(this.B0.e));
            co coVar3 = this.B0;
            coVar3.f5.updateReply(coVar3.n5, coVar3.y8(messageObject.getGroupId()), this.B0.a(), this.B0.l5);
            Bundle e7 = org.telegram.messenger.w1.e(3, "onlySelect", "dialogsType", true);
            e7.putBoolean("quote", true);
            e7.putInt("messagesCount", 1);
            e7.putBoolean("canSelectTopics", true);
            uy uyVar = new uy(e7);
            co coVar4 = this.B0;
            uyVar.C2 = coVar4;
            coVar4.presentFragment(uyVar);
        }
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean b() {
        co coVar;
        co coVar2 = this.B0;
        if ((coVar2 != null && coVar2.a() == UserObject.VERIFY) || (coVar = this.B0) == null) {
            return true;
        }
        if (coVar.a() < 0 && this.B0.getMessagesController().isPeerNoForwards(this.B0.a())) {
            return false;
        }
        org.telegram.ui.Cells.y9 y9Var = this.W;
        return y9Var == null || ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() == null || ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards;
    }

    public final void d0(co coVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.u0;
            if (i10 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.B0 = coVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            i10++;
        }
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean e() {
        org.telegram.ui.Cells.y9 y9Var;
        co coVar;
        org.telegram.ui.Cells.y9 y9Var2;
        TLRPC.Chat chat;
        co coVar2 = this.B0;
        if (coVar2 == null || coVar2.a() != UserObject.VERIFY) {
            co coVar3 = this.B0;
            boolean z10 = (coVar3 != null && coVar3.y9()) || !((y9Var = this.W) == null || ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() == null || ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards);
            if (!this.x0 && (coVar = this.B0) != null && coVar.h == null && (((y9Var2 = this.W) == null || (((org.telegram.ui.Cells.t1) y9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().richLayout == null && !this.B0.c9.v0)) && !this.B0.getMessagesController().getTranslateController().isTranslatingDialog(this.B0.T5) && !UserObject.isService(this.B0.T5) && (!z10 || (chat = this.B0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.da
    public final int p() {
        co coVar = this.B0;
        if (coVar == null) {
            return 0;
        }
        return coVar.Aa;
    }

    @Override // org.telegram.ui.Cells.da
    public final int q() {
        co coVar = this.B0;
        if (coVar == null) {
            return 0;
        }
        return (int) coVar.s9;
    }

    @Override // org.telegram.ui.Cells.da
    public final org.telegram.ui.ActionBar.f6 r() {
        co coVar = this.B0;
        if (coVar != null) {
            return coVar.ea;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.da
    public final int u(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.B0.ea);
    }
}
