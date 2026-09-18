package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class um extends org.telegram.ui.Cells.r9 {
    public bo B0;

    @Override // org.telegram.ui.Cells.da
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages y82;
        bo boVar = this.B0;
        if (boVar != null) {
            int min = Math.min(i11, boVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (y82 = this.B0.y8(messageObject.getGroupId())) != null && !y82.isDocuments) {
                messageObject = y82.captionMessage;
            }
            if (messageObject == null) {
                return;
            }
            rn b10 = rn.b(i10, min, messageObject);
            if (b10.i == null) {
                return;
            }
            nk nkVar = this.B0.Y;
            if (nkVar != null && nkVar.getVisibility() == 0) {
                kVar = ((org.telegram.ui.ActionBar.o2) this.B0).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) this.B0).actionBar;
                    if (kVar2.s()) {
                        this.B0.z7(false);
                    }
                }
                this.B0.Cb(messageObject, b10);
                nk nkVar2 = this.B0.Y;
                if (nkVar2 != null) {
                    nkVar2.I0();
                    return;
                }
                return;
            }
            bo boVar2 = this.B0;
            boVar2.l5 = b10;
            boVar2.n5 = messageObject;
            boVar2.f5 = new MessagePreviewParams(boVar2.h != null, boVar2.y9(), ChatObject.isMonoForum(this.B0.e));
            bo boVar3 = this.B0;
            boVar3.f5.updateReply(boVar3.n5, boVar3.y8(messageObject.getGroupId()), this.B0.a(), this.B0.l5);
            Bundle e = org.telegram.messenger.w1.e(3, "onlySelect", "dialogsType", true);
            e.putBoolean("quote", true);
            e.putInt("messagesCount", 1);
            e.putBoolean("canSelectTopics", true);
            wy wyVar = new wy(e);
            bo boVar4 = this.B0;
            wyVar.C2 = boVar4;
            boVar4.presentFragment(wyVar);
        }
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean b() {
        bo boVar;
        bo boVar2 = this.B0;
        if ((boVar2 != null && boVar2.a() == UserObject.VERIFY) || (boVar = this.B0) == null) {
            return true;
        }
        if (boVar.a() < 0 && this.B0.getMessagesController().isPeerNoForwards(this.B0.a())) {
            return false;
        }
        org.telegram.ui.Cells.y9 y9Var = this.W;
        return y9Var == null || ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() == null || ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards;
    }

    public final void d0(bo boVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.u0;
            if (i10 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.B0 = boVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            i10++;
        }
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean e() {
        org.telegram.ui.Cells.y9 y9Var;
        bo boVar;
        org.telegram.ui.Cells.y9 y9Var2;
        TLRPC.Chat chat;
        bo boVar2 = this.B0;
        if (boVar2 == null || boVar2.a() != UserObject.VERIFY) {
            bo boVar3 = this.B0;
            boolean z10 = (boVar3 != null && boVar3.y9()) || !((y9Var = this.W) == null || ((org.telegram.ui.Cells.t1) y9Var).getMessageObject() == null || ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards);
            if (!this.x0 && (boVar = this.B0) != null && boVar.h == null && (((y9Var2 = this.W) == null || (((org.telegram.ui.Cells.t1) y9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().richLayout == null && !this.B0.c9.v0)) && !this.B0.getMessagesController().getTranslateController().isTranslatingDialog(this.B0.T5) && !UserObject.isService(this.B0.T5) && (!z10 || (chat = this.B0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.da
    public final int p() {
        bo boVar = this.B0;
        if (boVar == null) {
            return 0;
        }
        return boVar.Aa;
    }

    @Override // org.telegram.ui.Cells.da
    public final int q() {
        bo boVar = this.B0;
        if (boVar == null) {
            return 0;
        }
        return (int) boVar.s9;
    }

    @Override // org.telegram.ui.Cells.da
    public final org.telegram.ui.ActionBar.f6 r() {
        bo boVar = this.B0;
        if (boVar != null) {
            return boVar.ea;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.da
    public final int u(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.B0.ea);
    }
}
