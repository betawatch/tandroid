package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xl extends iu0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ yl c;

    public xl(yl ylVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = ylVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.c.a.Q.Wa.E(this.a, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        hm hmVar = this.c.a;
        MessageObject messageObject = this.a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.imagePath != null || photoEntry.isVideo) {
            wn wnVar = hmVar.Q;
            xi xiVar = new xi(messageObject, 5);
            org.telegram.ui.ActionBar.j5 parentLayout = wnVar.getParentLayout();
            int currentAccount = wnVar.getCurrentAccount();
            org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(0, true, true);
            g50Var.a = wnVar;
            g50Var.s(photoEntry);
            g50Var.b = new ag.k0(currentAccount, xiVar, parentLayout, g50Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = messageObject.messageOwner.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        hmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new z7(7, this, messageObject));
    }
}
