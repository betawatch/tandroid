package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class uo extends tu0 {
    public final /* synthetic */ yo a;

    public uo(yo yoVar) {
        this.a = yoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        yo yoVar = this.a;
        long j3 = yoVar.C0;
        ev0 ev0Var = null;
        if (fileLocation != null) {
            if (yoVar.D0 != null) {
                TLRPC.User user = j3 == 0 ? null : yoVar.getMessagesController().getUser(Long.valueOf(j3));
                if (user != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    yoVar.e.getLocationInWindow(iArr);
                    ev0Var = new ev0();
                    ev0Var.b = iArr[0];
                    ev0Var.c = iArr[1];
                    gg.i1 i1Var = yoVar.e;
                    ev0Var.d = i1Var;
                    ImageReceiver imageReceiver = i1Var.getImageReceiver();
                    ev0Var.a = imageReceiver;
                    if (j3 == 0) {
                        j3 = -yoVar.w0;
                    }
                    ev0Var.f = j3;
                    ev0Var.e = imageReceiver.getBitmapSafe();
                    ev0Var.g = -1L;
                    ev0Var.h = yoVar.e.getImageReceiver().getRoundRadius(true);
                    ev0Var.k = yoVar.d.getScaleX();
                    ev0Var.p = true;
                }
            } else {
                TLRPC.Chat chat = yoVar.getMessagesController().getChat(Long.valueOf(yoVar.w0));
                if (chat != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    yoVar.e.getLocationInWindow(iArr2);
                    ev0Var = new ev0();
                    ev0Var.b = iArr2[0];
                    ev0Var.c = iArr2[1];
                    gg.i1 i1Var2 = yoVar.e;
                    ev0Var.d = i1Var2;
                    ImageReceiver imageReceiver2 = i1Var2.getImageReceiver();
                    ev0Var.a = imageReceiver2;
                    if (j3 == 0) {
                    }
                    ev0Var.f = j3;
                    ev0Var.e = imageReceiver2.getBitmapSafe();
                    ev0Var.g = -1L;
                    ev0Var.h = yoVar.e.getImageReceiver().getRoundRadius(true);
                    ev0Var.k = yoVar.d.getScaleX();
                    ev0Var.p = true;
                }
            }
        }
        return ev0Var;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void G() {
        this.a.e.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean M() {
        yo yoVar = this.a;
        long j3 = yoVar.C0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = yoVar.getMessagesController().getInputUser(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        yoVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final void f(String str, String str2, boolean z10) {
        this.a.s.q(str, str2, z10);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final int y() {
        return 1;
    }
}
