package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class tl extends mu0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ xn c;

    public tl(xn xnVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = xnVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return xn.A1(this.c, this.a, null, i10, z10, true);
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final boolean O() {
        xn xnVar = this.c;
        if (xnVar.Y == null || !xnVar.x9()) {
            return false;
        }
        xnVar.Y.Q();
        return true;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final MessageObject U() {
        MessageObject messageObject = this.c.p5;
        MessageObject messageObject2 = this.a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final void e(CharSequence charSequence) {
        this.c.Y.g1(charSequence, false);
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        xn xnVar = this.c;
        if (xnVar.p5 != this.a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null) {
            xnVar.q(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        } else {
            xnVar.Y.e0();
        }
    }
}
