package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wl extends uu0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ zn c;

    public wl(zn znVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = znVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return zn.E1(this.c, this.a, null, i10, z10, true);
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean O() {
        zn znVar = this.c;
        if (znVar.Y == null || !znVar.C9()) {
            return false;
        }
        znVar.Y.N();
        return true;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final MessageObject U() {
        MessageObject messageObject = this.c.p5;
        MessageObject messageObject2 = this.a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void e(CharSequence charSequence) {
        this.c.Y.d1(charSequence, false);
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        zn znVar = this.c;
        if (znVar.p5 != this.a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null) {
            znVar.r(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        } else {
            znVar.Y.b0();
        }
    }
}
