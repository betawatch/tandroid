package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class zl extends lu0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ am c;

    public zl(am amVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = amVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.c.a.Q.Fa.E(this.a, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        jm jmVar = this.c.a;
        MessageObject messageObject = this.a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.imagePath != null || photoEntry.isVideo) {
            wn wnVar = jmVar.Q;
            aj ajVar = new aj(messageObject, 4);
            org.telegram.ui.ActionBar.b5 parentLayout = wnVar.getParentLayout();
            int currentAccount = wnVar.getCurrentAccount();
            org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(0, true, true);
            v40Var.a = wnVar;
            v40Var.t(photoEntry);
            v40Var.b = new da(currentAccount, ajVar, parentLayout, v40Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = messageObject.messageOwner.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        jmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ai.v1(29, this, messageObject));
    }
}
