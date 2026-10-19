package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class tl extends zt0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ ul c;

    public tl(ul ulVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = ulVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.c.a.Q.Ga.E(this.a, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        dm dmVar = this.c.a;
        MessageObject messageObject = this.a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.imagePath != null || photoEntry.isVideo) {
            qn qnVar = dmVar.Q;
            ti tiVar = new ti(messageObject, 5);
            org.telegram.ui.ActionBar.d5 parentLayout = qnVar.getParentLayout();
            int currentAccount = qnVar.getCurrentAccount();
            org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, true, true);
            e50Var.a = qnVar;
            e50Var.s(photoEntry);
            e50Var.b = new fa(currentAccount, tiVar, parentLayout, e50Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = messageObject.messageOwner.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        dmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new vc(6, this, messageObject));
    }
}
