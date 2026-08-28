package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sl extends rt0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ tl c;

    public sl(tl tlVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = tlVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        return this.c.a.M.Ba.E(this.a, fileLocation, i9, z10, false);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        bm bmVar = this.c.a;
        MessageObject messageObject = this.a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.imagePath != null || photoEntry.isVideo) {
            qn qnVar = bmVar.M;
            ri riVar = new ri(messageObject, 4);
            org.telegram.ui.ActionBar.b5 parentLayout = qnVar.getParentLayout();
            int currentAccount = qnVar.getCurrentAccount();
            org.telegram.ui.Components.e40 e40Var = new org.telegram.ui.Components.e40(0, true, true);
            e40Var.a = qnVar;
            e40Var.t(photoEntry);
            e40Var.b = new bg.d0(currentAccount, riVar, parentLayout, e40Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = messageObject.messageOwner.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        bmVar.M.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new rc(6, this, messageObject));
    }
}
