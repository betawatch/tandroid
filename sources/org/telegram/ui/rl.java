package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class rl extends iu0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ wn c;

    public rl(wn wnVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = wnVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return wn.H1(this.c, this.a, null, i10, z10, true);
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean P() {
        wn wnVar = this.c;
        if (wnVar.Y == null || !wnVar.I9()) {
            return false;
        }
        wnVar.Y.L();
        return true;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final MessageObject V() {
        MessageObject messageObject = this.c.F5;
        MessageObject messageObject2 = this.a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void e(CharSequence charSequence) {
        this.c.Y.b1(charSequence, false);
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        wn wnVar = this.c;
        if (wnVar.F5 != this.a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null) {
            wnVar.r(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        } else {
            wnVar.Y.Z();
        }
    }
}
