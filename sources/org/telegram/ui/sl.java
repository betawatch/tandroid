package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class sl extends ou0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ yn c;

    public sl(yn ynVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = ynVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return yn.A1(this.c, this.a, null, i10, z10, true);
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean O() {
        yn ynVar = this.c;
        if (ynVar.W == null || !ynVar.w9()) {
            return false;
        }
        ynVar.W.N();
        return true;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final MessageObject U() {
        MessageObject messageObject = this.c.n5;
        MessageObject messageObject2 = this.a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void e(CharSequence charSequence) {
        this.c.W.e1(charSequence, false);
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        yn ynVar = this.c;
        if (ynVar.n5 != this.a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null) {
            ynVar.q(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        } else {
            ynVar.W.d0();
        }
    }
}
