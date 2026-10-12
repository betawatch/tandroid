package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ym extends org.telegram.ui.Cells.p9 {
    public fo w0;

    @Override // org.telegram.ui.Cells.ba
    public final void I(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages D8;
        fo foVar = this.w0;
        if (foVar != null) {
            int min = Math.min(i11, foVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (D8 = this.w0.D8(messageObject.getGroupId())) != null && !D8.isDocuments) {
                messageObject = D8.captionMessage;
            }
            if (messageObject == null) {
                return;
            }
            un b10 = un.b(i10, min, messageObject);
            if (b10.i == null) {
                return;
            }
            sk skVar = this.w0.Y;
            if (skVar != null && skVar.getVisibility() == 0) {
                kVar = ((org.telegram.ui.ActionBar.m2) this.w0).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) this.w0).actionBar;
                    if (kVar2.t()) {
                        this.w0.C7(false);
                    }
                }
                this.w0.Gb(messageObject, b10);
                sk skVar2 = this.w0.Y;
                if (skVar2 != null) {
                    skVar2.F0();
                    return;
                }
                return;
            }
            fo foVar2 = this.w0;
            foVar2.l5 = b10;
            foVar2.n5 = messageObject;
            foVar2.f5 = new MessagePreviewParams(foVar2.h != null, foVar2.D9(), ChatObject.isMonoForum(this.w0.e));
            fo foVar3 = this.w0;
            foVar3.f5.updateReply(foVar3.n5, foVar3.D8(messageObject.getGroupId()), this.w0.a(), this.w0.l5);
            Bundle d = org.telegram.messenger.yh.d(3, "onlySelect", "dialogsType", true);
            d.putBoolean("quote", true);
            d.putInt("messagesCount", 1);
            d.putBoolean("canSelectTopics", true);
            yy yyVar = new yy(d);
            fo foVar4 = this.w0;
            yyVar.C2 = foVar4;
            foVar4.presentFragment(yyVar);
        }
    }

    @Override // org.telegram.ui.Cells.ba
    public final boolean b() {
        fo foVar;
        fo foVar2 = this.w0;
        if ((foVar2 != null && foVar2.a() == UserObject.VERIFY) || (foVar = this.w0) == null) {
            return true;
        }
        if (foVar.a() < 0 && this.w0.getMessagesController().isPeerNoForwards(this.w0.a())) {
            return false;
        }
        org.telegram.ui.Cells.w9 w9Var = this.W;
        return w9Var == null || ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() == null || ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards;
    }

    public final void c0(fo foVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.p0;
            if (i10 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.w0 = foVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            i10++;
        }
    }

    @Override // org.telegram.ui.Cells.ba
    public final boolean e() {
        org.telegram.ui.Cells.w9 w9Var;
        fo foVar;
        org.telegram.ui.Cells.w9 w9Var2;
        TLRPC.Chat chat;
        fo foVar2 = this.w0;
        if (foVar2 == null || foVar2.a() != UserObject.VERIFY) {
            fo foVar3 = this.w0;
            boolean z10 = (foVar3 != null && foVar3.D9()) || !((w9Var = this.W) == null || ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() == null || ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards);
            if (!this.s0 && (foVar = this.w0) != null && foVar.h == null && (((w9Var2 = this.W) == null || (((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().richLayout == null && !this.w0.c9.q0)) && !this.w0.getMessagesController().getTranslateController().isTranslatingDialog(this.w0.T5) && !UserObject.isService(this.w0.T5) && (!z10 || (chat = this.w0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int o() {
        fo foVar = this.w0;
        if (foVar == null) {
            return 0;
        }
        return foVar.Ba;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int p() {
        fo foVar = this.w0;
        if (foVar == null) {
            return 0;
        }
        return (int) foVar.s9;
    }

    @Override // org.telegram.ui.Cells.ba
    public final org.telegram.ui.ActionBar.c6 q() {
        fo foVar = this.w0;
        if (foVar != null) {
            return foVar.ea;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int t(int i10) {
        return org.telegram.ui.ActionBar.g6.w0(i10, this.w0.ea);
    }
}
