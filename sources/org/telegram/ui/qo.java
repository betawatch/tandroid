package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class qo extends tu0 {
    public final /* synthetic */ uo a;

    public qo(uo uoVar) {
        this.a = uoVar;
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
        uo uoVar = this.a;
        long j3 = uoVar.C0;
        dv0 dv0Var = null;
        if (fileLocation != null) {
            if (uoVar.D0 != null) {
                TLRPC.User user = j3 == 0 ? null : uoVar.getMessagesController().getUser(Long.valueOf(j3));
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    uoVar.e.getLocationInWindow(iArr);
                    dv0Var = new dv0();
                    dv0Var.b = iArr[0];
                    dv0Var.c = iArr[1];
                    ai.z5 z5Var = uoVar.e;
                    dv0Var.d = z5Var;
                    ImageReceiver imageReceiver = z5Var.getImageReceiver();
                    dv0Var.a = imageReceiver;
                    if (j3 == 0) {
                        j3 = -uoVar.w0;
                    }
                    dv0Var.f = j3;
                    dv0Var.e = imageReceiver.getBitmapSafe();
                    dv0Var.g = -1L;
                    dv0Var.h = uoVar.e.getImageReceiver().getRoundRadius(true);
                    dv0Var.k = uoVar.d.getScaleX();
                    dv0Var.p = true;
                }
            } else {
                TLRPC.Chat chat = uoVar.getMessagesController().getChat(Long.valueOf(uoVar.w0));
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    uoVar.e.getLocationInWindow(iArr2);
                    dv0Var = new dv0();
                    dv0Var.b = iArr2[0];
                    dv0Var.c = iArr2[1];
                    ai.z5 z5Var2 = uoVar.e;
                    dv0Var.d = z5Var2;
                    ImageReceiver imageReceiver2 = z5Var2.getImageReceiver();
                    dv0Var.a = imageReceiver2;
                    if (j3 == 0) {
                    }
                    dv0Var.f = j3;
                    dv0Var.e = imageReceiver2.getBitmapSafe();
                    dv0Var.g = -1L;
                    dv0Var.h = uoVar.e.getImageReceiver().getRoundRadius(true);
                    dv0Var.k = uoVar.d.getScaleX();
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
        uo uoVar = this.a;
        long j3 = uoVar.C0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = uoVar.getMessagesController().getInputUser(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        uoVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
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
