package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class tm extends org.telegram.ui.Cells.p9 {
    public zn w0;

    @Override // org.telegram.ui.Cells.ba
    public final void I(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages D8;
        zn znVar = this.w0;
        if (znVar != null) {
            int min = Math.min(i11, znVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (D8 = this.w0.D8(messageObject.getGroupId())) != null && !D8.isDocuments) {
                messageObject = D8.captionMessage;
            }
            if (messageObject == null) {
                return;
            }
            pn b10 = pn.b(i10, min, messageObject);
            if (b10.i == null) {
                return;
            }
            ok okVar = this.w0.Y;
            if (okVar != null && okVar.getVisibility() == 0) {
                kVar = ((org.telegram.ui.ActionBar.n2) this.w0).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) this.w0).actionBar;
                    if (kVar2.t()) {
                        this.w0.C7(false);
                    }
                }
                this.w0.Gb(messageObject, b10);
                ok okVar2 = this.w0.Y;
                if (okVar2 != null) {
                    okVar2.F0();
                    return;
                }
                return;
            }
            zn znVar2 = this.w0;
            znVar2.l5 = b10;
            znVar2.n5 = messageObject;
            znVar2.f5 = new MessagePreviewParams(znVar2.h != null, znVar2.D9(), ChatObject.isMonoForum(this.w0.e));
            zn znVar3 = this.w0;
            znVar3.f5.updateReply(znVar3.n5, znVar3.D8(messageObject.getGroupId()), this.w0.a(), this.w0.l5);
            Bundle d = org.telegram.messenger.bi.d(3, "onlySelect", "dialogsType", true);
            d.putBoolean("quote", true);
            d.putInt("messagesCount", 1);
            d.putBoolean("canSelectTopics", true);
            ty tyVar = new ty(d);
            zn znVar4 = this.w0;
            tyVar.C2 = znVar4;
            znVar4.presentFragment(tyVar);
        }
    }

    @Override // org.telegram.ui.Cells.ba
    public final boolean b() {
        zn znVar;
        zn znVar2 = this.w0;
        if ((znVar2 != null && znVar2.a() == UserObject.VERIFY) || (znVar = this.w0) == null) {
            return true;
        }
        if (znVar.a() < 0 && this.w0.getMessagesController().isPeerNoForwards(this.w0.a())) {
            return false;
        }
        org.telegram.ui.Cells.w9 w9Var = this.W;
        return w9Var == null || ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() == null || ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards;
    }

    public final void c0(zn znVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.p0;
            if (i10 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.w0 = znVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            i10++;
        }
    }

    @Override // org.telegram.ui.Cells.ba
    public final boolean e() {
        org.telegram.ui.Cells.w9 w9Var;
        zn znVar;
        org.telegram.ui.Cells.w9 w9Var2;
        TLRPC.Chat chat;
        zn znVar2 = this.w0;
        if (znVar2 == null || znVar2.a() != UserObject.VERIFY) {
            zn znVar3 = this.w0;
            boolean z10 = (znVar3 != null && znVar3.D9()) || !((w9Var = this.W) == null || ((org.telegram.ui.Cells.u1) w9Var).getMessageObject() == null || ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards);
            if (!this.s0 && (znVar = this.w0) != null && znVar.h == null && (((w9Var2 = this.W) == null || (((org.telegram.ui.Cells.u1) w9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().richLayout == null && !this.w0.c9.q0)) && !this.w0.getMessagesController().getTranslateController().isTranslatingDialog(this.w0.T5) && !UserObject.isService(this.w0.T5) && (!z10 || (chat = this.w0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int o() {
        zn znVar = this.w0;
        if (znVar == null) {
            return 0;
        }
        return znVar.Ba;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int p() {
        zn znVar = this.w0;
        if (znVar == null) {
            return 0;
        }
        return (int) znVar.s9;
    }

    @Override // org.telegram.ui.Cells.ba
    public final org.telegram.ui.ActionBar.e6 q() {
        zn znVar = this.w0;
        if (znVar != null) {
            return znVar.ea;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int t(int i10) {
        return org.telegram.ui.ActionBar.i6.w0(i10, this.w0.ea);
    }
}
