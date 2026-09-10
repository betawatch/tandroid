package org.telegram.ui;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wm extends org.telegram.ui.Cells.t9 {
    public eo B0;

    @Override // org.telegram.ui.Cells.fa
    public final void J(int i10, int i11, MessageObject messageObject) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        MessageObject.GroupedMessages y82;
        eo eoVar = this.B0;
        if (eoVar != null) {
            int min = Math.min(i11, eoVar.getMessagesController().quoteLengthMax + i10);
            if (messageObject.getGroupId() != 0 && (y82 = this.B0.y8(messageObject.getGroupId())) != null && !y82.isDocuments) {
                messageObject = y82.captionMessage;
            }
            if (messageObject == null) {
                return;
            }
            tn b10 = tn.b(i10, min, messageObject);
            if (b10.i == null) {
                return;
            }
            ok okVar = this.B0.Y;
            if (okVar != null && okVar.getVisibility() == 0) {
                lVar = ((org.telegram.ui.ActionBar.p2) this.B0).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.p2) this.B0).actionBar;
                    if (lVar2.s()) {
                        this.B0.z7(false);
                    }
                }
                this.B0.Cb(messageObject, b10);
                ok okVar2 = this.B0.Y;
                if (okVar2 != null) {
                    okVar2.H0();
                    return;
                }
                return;
            }
            eo eoVar2 = this.B0;
            eoVar2.l5 = b10;
            eoVar2.n5 = messageObject;
            eoVar2.f5 = new MessagePreviewParams(eoVar2.h != null, eoVar2.y9(), ChatObject.isMonoForum(this.B0.e));
            eo eoVar3 = this.B0;
            eoVar3.f5.updateReply(eoVar3.n5, eoVar3.y8(messageObject.getGroupId()), this.B0.a(), this.B0.l5);
            Bundle e = org.telegram.messenger.a2.e(3, "onlySelect", "dialogsType", true);
            e.putBoolean("quote", true);
            e.putInt("messagesCount", 1);
            e.putBoolean("canSelectTopics", true);
            wy wyVar = new wy(e);
            eo eoVar4 = this.B0;
            wyVar.C2 = eoVar4;
            eoVar4.presentFragment(wyVar);
        }
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean b() {
        eo eoVar;
        eo eoVar2 = this.B0;
        if ((eoVar2 != null && eoVar2.a() == UserObject.VERIFY) || (eoVar = this.B0) == null) {
            return true;
        }
        if (eoVar.a() < 0 && this.B0.getMessagesController().isPeerNoForwards(this.B0.a())) {
            return false;
        }
        org.telegram.ui.Cells.aa aaVar = this.W;
        return aaVar == null || ((org.telegram.ui.Cells.t1) aaVar).getMessageObject() == null || ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards;
    }

    public final void d0(eo eoVar) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.u0;
            if (i10 >= sparseArray.size()) {
                sparseArray.clear();
                f(false);
                this.C = null;
                this.B0 = eoVar;
                return;
            }
            ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            i10++;
        }
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean e() {
        org.telegram.ui.Cells.aa aaVar;
        eo eoVar;
        org.telegram.ui.Cells.aa aaVar2;
        TLRPC.Chat chat;
        eo eoVar2 = this.B0;
        if (eoVar2 == null || eoVar2.a() != UserObject.VERIFY) {
            eo eoVar3 = this.B0;
            boolean z10 = (eoVar3 != null && eoVar3.y9()) || !((aaVar = this.W) == null || ((org.telegram.ui.Cells.t1) aaVar).getMessageObject() == null || ((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner == null || !((org.telegram.ui.Cells.t1) this.W).getMessageObject().messageOwner.noforwards);
            if (!this.x0 && (eoVar = this.B0) != null && eoVar.h == null && (((aaVar2 = this.W) == null || (((org.telegram.ui.Cells.t1) aaVar2).getMessageObject() != null && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().type != 23 && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isVoiceTranscriptionOpen() && !((org.telegram.ui.Cells.t1) this.W).getMessageObject().isInvoice() && ((org.telegram.ui.Cells.t1) this.W).getMessageObject().richLayout == null && !this.B0.c9.v0)) && !this.B0.getMessagesController().getTranslateController().isTranslatingDialog(this.B0.T5) && !UserObject.isService(this.B0.T5) && (!z10 || (chat = this.B0.e) == null || ChatObject.canWriteToChat(chat)))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.fa
    public final int p() {
        eo eoVar = this.B0;
        if (eoVar == null) {
            return 0;
        }
        return eoVar.Aa;
    }

    @Override // org.telegram.ui.Cells.fa
    public final int q() {
        eo eoVar = this.B0;
        if (eoVar == null) {
            return 0;
        }
        return (int) eoVar.s9;
    }

    @Override // org.telegram.ui.Cells.fa
    public final org.telegram.ui.ActionBar.f6 r() {
        eo eoVar = this.B0;
        if (eoVar != null) {
            return eoVar.ea;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.fa
    public final int u(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.B0.ea);
    }
}
