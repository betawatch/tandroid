package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class wo extends av0 {
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
    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        zo zoVar = this.a;
        long j10 = zoVar.C0;
        kv0 kv0Var = null;
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
                    kv0Var = new kv0();
                    kv0Var.b = iArr[0];
                    kv0Var.c = iArr[1];
                    bi.k5 k5Var = zoVar.e;
                    kv0Var.d = k5Var;
                    ImageReceiver imageReceiver = k5Var.getImageReceiver();
                    kv0Var.a = imageReceiver;
                    if (j10 == 0) {
                        j10 = -zoVar.w0;
                    }
                    kv0Var.f = j10;
                    kv0Var.e = imageReceiver.getBitmapSafe();
                    kv0Var.g = -1L;
                    kv0Var.h = zoVar.e.getImageReceiver().getRoundRadius(true);
                    kv0Var.k = zoVar.d.getScaleX();
                    kv0Var.p = true;
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
                    kv0Var = new kv0();
                    kv0Var.b = iArr2[0];
                    kv0Var.c = iArr2[1];
                    bi.k5 k5Var2 = zoVar.e;
                    kv0Var.d = k5Var2;
                    ImageReceiver imageReceiver2 = k5Var2.getImageReceiver();
                    kv0Var.a = imageReceiver2;
                    if (j10 == 0) {
                    }
                    kv0Var.f = j10;
                    kv0Var.e = imageReceiver2.getBitmapSafe();
                    kv0Var.g = -1L;
                    kv0Var.h = zoVar.e.getImageReceiver().getRoundRadius(true);
                    kv0Var.k = zoVar.d.getScaleX();
                    kv0Var.p = true;
                }
            }
        }
        return kv0Var;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final void G() {
        this.a.e.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final boolean M() {
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

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final void f(String str, String str2, boolean z10) {
        this.a.s.p(str, str2, z10);
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final boolean t() {
        return false;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final int y() {
        return 1;
    }
}
