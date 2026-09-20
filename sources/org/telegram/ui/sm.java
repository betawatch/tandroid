package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class sm extends org.telegram.ui.Cells.s9 {
    public zn B0;

    @Override // org.telegram.ui.Cells.ea
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        MessageObject.GroupedMessages y82;
        zn znVar = this.B0;
        if (znVar != null) {
            int min = Math.min(i11, znVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (y82 = this.B0.y8(messageObject.getGroupId())) != null && !y82.isDocuments) {
                messageObject = y82.captionMessage;
            }
            if (messageObject == null) {
                return;
            }
            pn b10 = pn.b(i10, min, messageObject);
            if (b10.i == null) {
                return;
            }
            lk lkVar = this.B0.Y;
            if (lkVar != null && lkVar.getVisibility() == 0) {
                kVar = ((org.telegram.ui.ActionBar.n2) this.B0).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) this.B0).actionBar;
                    if (kVar2.s()) {
                        this.B0.z7(false);
                    }
                }
                this.B0.Cb(messageObject, b10);
                lk lkVar2 = this.B0.Y;
                if (lkVar2 != null) {
                    lkVar2.H0();
                    return;
                }
                return;
            }
            zn znVar2 = this.B0;
            znVar2.l5 = b10;
            znVar2.n5 = messageObject;
            znVar2.f5 = new MessagePreviewParams(znVar2.h != null, znVar2.y9(), ChatObject.isMonoForum(this.B0.e));
            zn znVar3 = this.B0;
            znVar3.f5.updateReply(znVar3.n5, znVar3.y8(messageObject.getGroupId()), this.B0.a(), this.B0.l5);
            Bundle e = org.telegram.messenger.rk.e(3, "onlySelect", "dialogsType", true);
            e.putBoolean("quote", true);
            e.putInt("messagesCount", 1);
            e.putBoolean("canSelectTopics", true);
            uy uyVar = new uy(e);
            zn znVar4 = this.B0;
            uyVar.C2 = znVar4;
            znVar4.presentFragment(uyVar);
        }
    }

    @Override // org.telegram.ui.Cells.ea
    public final boolean b() {
        zn znVar;
        zn znVar2 = this.B0;
        if ((znVar2 != null && znVar2.a() == UserObject.VERIFY) || (znVar = this.B0) == null) {
            return true;
        }
        if (znVar.a() < 0 && this.B0.getMessagesController().isPeerNoForwards(this.B0.a())) {
            return false;
        }
        org.telegram.ui.Cells.z9 z9Var = this.W;
        return z9Var == null || ((org.telegram.ui.Cells.u1) z9Var).getMessageObject() == null || ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards;
    }

    public final void d0(zn znVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.u0;
            if (i10 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.B0 = znVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            i10++;
        }
    }

    @Override // org.telegram.ui.Cells.ea
    public final boolean e() {
        org.telegram.ui.Cells.z9 z9Var;
        zn znVar;
        org.telegram.ui.Cells.z9 z9Var2;
        TLRPC.Chat chat;
        zn znVar2 = this.B0;
        if (znVar2 == null || znVar2.a() != UserObject.VERIFY) {
            zn znVar3 = this.B0;
            boolean z10 = (znVar3 != null && znVar3.y9()) || !((z9Var = this.W) == null || ((org.telegram.ui.Cells.u1) z9Var).getMessageObject() == null || ((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.u1) this.W).getMessageObject().messageOwner.noforwards);
            if (!this.x0 && (znVar = this.B0) != null && znVar.h == null && (((z9Var2 = this.W) == null || (((org.telegram.ui.Cells.u1) z9Var2).getMessageObject() != null && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.u1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.u1) this.W).getMessageObject().richLayout == null && !this.B0.c9.v0)) && !this.B0.getMessagesController().getTranslateController().isTranslatingDialog(this.B0.T5) && !UserObject.isService(this.B0.T5) && (!z10 || (chat = this.B0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.ea
    public final int p() {
        zn znVar = this.B0;
        if (znVar == null) {
            return 0;
        }
        return znVar.Aa;
    }

    @Override // org.telegram.ui.Cells.ea
    public final int q() {
        zn znVar = this.B0;
        if (znVar == null) {
            return 0;
        }
        return (int) znVar.s9;
    }

    @Override // org.telegram.ui.Cells.ea
    public final org.telegram.ui.ActionBar.f6 r() {
        zn znVar = this.B0;
        if (znVar != null) {
            return znVar.ea;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.ea
    public final int u(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.B0.ea);
    }
}
