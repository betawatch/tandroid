package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class vl extends bu0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ wl c;

    public vl(wl wlVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = wlVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.c.a.Q.Ga.E(this.a, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        fm fmVar = this.c.a;
        MessageObject messageObject = this.a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.imagePath != null || photoEntry.isVideo) {
            sn snVar = fmVar.Q;
            vi viVar = new vi(messageObject, 5);
            org.telegram.ui.ActionBar.d5 parentLayout = snVar.getParentLayout();
            int currentAccount = snVar.getCurrentAccount();
            org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, true, true);
            e50Var.a = snVar;
            e50Var.s(photoEntry);
            e50Var.b = new ha(currentAccount, viVar, parentLayout, e50Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = messageObject.messageOwner.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        fmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new xc(6, this, messageObject));
    }
}
