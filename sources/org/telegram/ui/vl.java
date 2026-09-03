package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vl extends fu0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ zn c;

    public vl(zn znVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = znVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return zn.A1(this.c, this.a, null, i10, z4, true);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean O() {
        zn znVar = this.c;
        if (znVar.V == null || !znVar.x9()) {
            return false;
        }
        znVar.V.P();
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
        zn znVar = this.c;
        if (znVar.m5 != this.a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null) {
            znVar.r(photoEntry, videoEditedInfo, z4, i11, 0, z10, 0L);
        } else {
            znVar.V.d0();
        }
    }
}
