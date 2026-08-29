package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ul extends pt0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ vl c;

    public ul(vl vlVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = vlVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.c.a.M.Ba.E(this.a, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        em emVar = this.c.a;
        MessageObject messageObject = this.a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.imagePath != null || photoEntry.isVideo) {
            tn tnVar = emVar.M;
            ui uiVar = new ui(messageObject, 4);
            org.telegram.ui.ActionBar.b5 parentLayout = tnVar.getParentLayout();
            int currentAccount = tnVar.getCurrentAccount();
            org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(0, true, true);
            s40Var.a = tnVar;
            s40Var.t(photoEntry);
            s40Var.b = new eg.b0(currentAccount, uiVar, parentLayout, s40Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = messageObject.messageOwner.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        emVar.M.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new zg(2, this, messageObject));
    }
}
