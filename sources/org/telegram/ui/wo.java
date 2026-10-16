package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class wo extends zu0 {
    public final /* synthetic */ zo a;

    public wo(zo zoVar) {
        this.a = zoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        zo zoVar = this.a;
        long j10 = zoVar.C0;
        jv0 jv0Var = null;
        if (fileLocation != null) {
            if (zoVar.D0 != null) {
                TLRPC.User user = j10 == 0 ? null : zoVar.getMessagesController().getUser(Long.valueOf(j10));
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    zoVar.e.getLocationInWindow(iArr);
                    jv0Var = new jv0();
                    jv0Var.b = iArr[0];
                    jv0Var.c = iArr[1];
                    bi.k5 k5Var = zoVar.e;
                    jv0Var.d = k5Var;
                    ImageReceiver imageReceiver = k5Var.getImageReceiver();
                    jv0Var.a = imageReceiver;
                    if (j10 == 0) {
                        j10 = -zoVar.w0;
                    }
                    jv0Var.f = j10;
                    jv0Var.e = imageReceiver.getBitmapSafe();
                    jv0Var.g = -1L;
                    jv0Var.h = zoVar.e.getImageReceiver().getRoundRadius(true);
                    jv0Var.k = zoVar.d.getScaleX();
                    jv0Var.p = true;
                }
            } else {
                TLRPC.Chat chat = zoVar.getMessagesController().getChat(Long.valueOf(zoVar.w0));
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    zoVar.e.getLocationInWindow(iArr2);
                    jv0Var = new jv0();
                    jv0Var.b = iArr2[0];
                    jv0Var.c = iArr2[1];
                    bi.k5 k5Var2 = zoVar.e;
                    jv0Var.d = k5Var2;
                    ImageReceiver imageReceiver2 = k5Var2.getImageReceiver();
                    jv0Var.a = imageReceiver2;
                    if (j10 == 0) {
                    }
                    jv0Var.f = j10;
                    jv0Var.e = imageReceiver2.getBitmapSafe();
                    jv0Var.g = -1L;
                    jv0Var.h = zoVar.e.getImageReceiver().getRoundRadius(true);
                    jv0Var.k = zoVar.d.getScaleX();
                    jv0Var.p = true;
                }
            }
        }
        return jv0Var;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void G() {
        this.a.e.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean N() {
        zo zoVar = this.a;
        long j10 = zoVar.C0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = zoVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        zoVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void f(String str, String str2, boolean z10) {
        this.a.s.p(str, str2, z10);
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final int y() {
        return 1;
    }
}
