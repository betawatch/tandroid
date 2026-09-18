package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class wl extends vu0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ bo c;

    public wl(bo boVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = boVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return bo.A1(this.c, this.a, null, i10, z10, true);
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final boolean O() {
        bo boVar = this.c;
        if (boVar.Y == null || !boVar.x9()) {
            return false;
        }
        boVar.Y.Q();
        return true;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final MessageObject U() {
        MessageObject messageObject = this.c.p5;
        MessageObject messageObject2 = this.a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final void e(CharSequence charSequence) {
        this.c.Y.f1(charSequence, false);
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        bo boVar = this.c;
        if (boVar.p5 != this.a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null) {
            boVar.q(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        } else {
            boVar.Y.e0();
        }
    }
}
