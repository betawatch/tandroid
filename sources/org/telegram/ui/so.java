package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class so extends tu0 {
    public final /* synthetic */ wo a;

    public so(wo woVar) {
        this.a = woVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        wo woVar = this.a;
        long j3 = woVar.C0;
        dv0 dv0Var = null;
        if (fileLocation != null) {
            if (woVar.D0 != null) {
                TLRPC.User user = j3 == 0 ? null : woVar.getMessagesController().getUser(Long.valueOf(j3));
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    woVar.e.getLocationInWindow(iArr);
                    dv0Var = new dv0();
                    dv0Var.b = iArr[0];
                    dv0Var.c = iArr[1];
                    ai.z5 z5Var = woVar.e;
                    dv0Var.d = z5Var;
                    ImageReceiver imageReceiver = z5Var.getImageReceiver();
                    dv0Var.a = imageReceiver;
                    if (j3 == 0) {
                        j3 = -woVar.w0;
                    }
                    dv0Var.f = j3;
                    dv0Var.e = imageReceiver.getBitmapSafe();
                    dv0Var.g = -1L;
                    dv0Var.h = woVar.e.getImageReceiver().getRoundRadius(true);
                    dv0Var.k = woVar.d.getScaleX();
                    dv0Var.p = true;
                }
            } else {
                TLRPC.Chat chat = woVar.getMessagesController().getChat(Long.valueOf(woVar.w0));
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    woVar.e.getLocationInWindow(iArr2);
                    dv0Var = new dv0();
                    dv0Var.b = iArr2[0];
                    dv0Var.c = iArr2[1];
                    ai.z5 z5Var2 = woVar.e;
                    dv0Var.d = z5Var2;
                    ImageReceiver imageReceiver2 = z5Var2.getImageReceiver();
                    dv0Var.a = imageReceiver2;
                    if (j3 == 0) {
                    }
                    dv0Var.f = j3;
                    dv0Var.e = imageReceiver2.getBitmapSafe();
                    dv0Var.g = -1L;
                    dv0Var.h = woVar.e.getImageReceiver().getRoundRadius(true);
                    dv0Var.k = woVar.d.getScaleX();
                    dv0Var.p = true;
                }
            }
        }
        return dv0Var;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final void G() {
        this.a.e.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final boolean M() {
        wo woVar = this.a;
        long j3 = woVar.C0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = woVar.getMessagesController().getInputUser(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        woVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final void f(String str, String str2, boolean z10) {
        this.a.s.q(str, str2, z10);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final int y() {
        return 1;
    }
}
