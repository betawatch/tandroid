package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class uo extends su0 {
    public final /* synthetic */ xo a;

    public uo(xo xoVar) {
        this.a = xoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        xo xoVar = this.a;
        long j3 = xoVar.C0;
        cv0 cv0Var = null;
        if (fileLocation != null) {
            if (xoVar.D0 != null) {
                TLRPC.User user = j3 == 0 ? null : xoVar.getMessagesController().getUser(Long.valueOf(j3));
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    xoVar.e.getLocationInWindow(iArr);
                    cv0Var = new cv0();
                    cv0Var.b = iArr[0];
                    cv0Var.c = iArr[1];
                    bi.i5 i5Var = xoVar.e;
                    cv0Var.d = i5Var;
                    ImageReceiver imageReceiver = i5Var.getImageReceiver();
                    cv0Var.a = imageReceiver;
                    if (j3 == 0) {
                        j3 = -xoVar.w0;
                    }
                    cv0Var.f = j3;
                    cv0Var.e = imageReceiver.getBitmapSafe();
                    cv0Var.g = -1L;
                    cv0Var.h = xoVar.e.getImageReceiver().getRoundRadius(true);
                    cv0Var.k = xoVar.d.getScaleX();
                    cv0Var.p = true;
                }
            } else {
                TLRPC.Chat chat = xoVar.getMessagesController().getChat(Long.valueOf(xoVar.w0));
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    xoVar.e.getLocationInWindow(iArr2);
                    cv0Var = new cv0();
                    cv0Var.b = iArr2[0];
                    cv0Var.c = iArr2[1];
                    bi.i5 i5Var2 = xoVar.e;
                    cv0Var.d = i5Var2;
                    ImageReceiver imageReceiver2 = i5Var2.getImageReceiver();
                    cv0Var.a = imageReceiver2;
                    if (j3 == 0) {
                    }
                    cv0Var.f = j3;
                    cv0Var.e = imageReceiver2.getBitmapSafe();
                    cv0Var.g = -1L;
                    cv0Var.h = xoVar.e.getImageReceiver().getRoundRadius(true);
                    cv0Var.k = xoVar.d.getScaleX();
                    cv0Var.p = true;
                }
            }
        }
        return cv0Var;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void G() {
        this.a.e.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean M() {
        xo xoVar = this.a;
        long j3 = xoVar.C0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = xoVar.getMessagesController().getInputUser(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        xoVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void f(String str, String str2, boolean z10) {
        this.a.s.q(str, str2, z10);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final int y() {
        return 1;
    }
}
