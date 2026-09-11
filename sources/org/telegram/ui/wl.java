package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class wl extends su0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ co c;

    public wl(co coVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = coVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return co.A1(this.c, this.a, null, i10, z10, true);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean O() {
        co coVar = this.c;
        if (coVar.Y == null || !coVar.x9()) {
            return false;
        }
        coVar.Y.P();
        return true;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final MessageObject U() {
        MessageObject messageObject = this.c.p5;
        MessageObject messageObject2 = this.a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void e(CharSequence charSequence) {
        this.c.Y.f1(charSequence, false);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        co coVar = this.c;
        if (coVar.p5 != this.a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null) {
            coVar.q(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        } else {
            coVar.Y.d0();
        }
    }
}
