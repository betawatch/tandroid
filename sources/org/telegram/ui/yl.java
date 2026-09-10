package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yl extends tu0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ eo c;

    public yl(eo eoVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = eoVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return eo.A1(this.c, this.a, null, i10, z10, true);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean O() {
        eo eoVar = this.c;
        if (eoVar.Y == null || !eoVar.x9()) {
            return false;
        }
        eoVar.Y.P();
        return true;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final MessageObject U() {
        MessageObject messageObject = this.c.p5;
        MessageObject messageObject2 = this.a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void e(CharSequence charSequence) {
        this.c.Y.f1(charSequence, false);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        eo eoVar = this.c;
        if (eoVar.p5 != this.a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null) {
            eoVar.q(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        } else {
            eoVar.Y.d0();
        }
    }
}
