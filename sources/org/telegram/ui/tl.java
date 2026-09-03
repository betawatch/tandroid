package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class tl extends fu0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ xn c;

    public tl(xn xnVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = xnVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return xn.A1(this.c, this.a, null, i10, z4, true);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean O() {
        xn xnVar = this.c;
        if (xnVar.V == null || !xnVar.x9()) {
            return false;
        }
        xnVar.V.P();
        return true;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final MessageObject U() {
        MessageObject messageObject = this.c.m5;
        MessageObject messageObject2 = this.a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void e(CharSequence charSequence) {
        this.c.V.f1(charSequence, false);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        xn xnVar = this.c;
        if (xnVar.m5 != this.a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null) {
            xnVar.r(photoEntry, videoEditedInfo, z4, i11, 0, z10, 0L);
        } else {
            xnVar.V.d0();
        }
    }
}
