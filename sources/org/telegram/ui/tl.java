package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tl extends st0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ ul c;

    public tl(ul ulVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = ulVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.c.a.M.Ba.E(this.a, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        dm dmVar = this.c.a;
        MessageObject messageObject = this.a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.imagePath != null || photoEntry.isVideo) {
            rn rnVar = dmVar.M;
            ti tiVar = new ti(messageObject, 4);
            org.telegram.ui.ActionBar.b5 parentLayout = rnVar.getParentLayout();
            int currentAccount = rnVar.getCurrentAccount();
            org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(0, true, true);
            j40Var.a = rnVar;
            j40Var.t(photoEntry);
            j40Var.b = new cg.a0(currentAccount, tiVar, parentLayout, j40Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = messageObject.messageOwner.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        dmVar.M.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new gg(3, this, messageObject));
    }
}
