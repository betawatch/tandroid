package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class sl extends lu0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ wn c;

    public sl(wn wnVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = wnVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return wn.A1(this.c, this.a, null, i10, z10, true);
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final boolean O() {
        wn wnVar = this.c;
        if (wnVar.Y == null || !wnVar.x9()) {
            return false;
        }
        wnVar.Y.P();
        return true;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final MessageObject U() {
        MessageObject messageObject = this.c.p5;
        MessageObject messageObject2 = this.a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final void e(CharSequence charSequence) {
        this.c.Y.f1(charSequence, false);
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        wn wnVar = this.c;
        if (wnVar.p5 != this.a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null) {
            wnVar.q(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        } else {
            wnVar.Y.d0();
        }
    }
}
