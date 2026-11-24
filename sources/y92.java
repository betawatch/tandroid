// default package

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y92 extends jb8 {
    public final /* synthetic */ ba2 a;

    public y92(ba2 ba2Var) {
        this.a = ba2Var;
    }

    @Override // jb8, pb8
    public final void G() {
        this.a.e.getImageReceiver().v0(true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (r11 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0040, code lost:
    
        if (r11 != null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    @Override // jb8, pb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        TLRPC.FileLocation fileLocation2;
        ba2 ba2Var = this.a;
        long j = ba2Var.C0;
        if (fileLocation != null) {
            if (ba2Var.D0 != null) {
                TLRPC.User W1 = j == 0 ? null : ba2Var.getMessagesController().W1(Long.valueOf(j));
                if (W1 != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    ba2Var.e.getLocationInWindow(iArr);
                    qb8 qb8Var = new qb8();
                    qb8Var.b = iArr[0];
                    qb8Var.c = iArr[1];
                    kc0 kc0Var = ba2Var.e;
                    qb8Var.d = kc0Var;
                    ImageReceiver imageReceiver = kc0Var.getImageReceiver();
                    qb8Var.a = imageReceiver;
                    if (j == 0) {
                        j = -ba2Var.w0;
                    }
                    qb8Var.f = j;
                    qb8Var.e = imageReceiver.p();
                    qb8Var.g = -1L;
                    qb8Var.h = ba2Var.e.getImageReceiver().z();
                    qb8Var.k = ba2Var.d.getScaleX();
                    qb8Var.p = true;
                    return qb8Var;
                }
            } else {
                TLRPC.Chat L0 = ba2Var.getMessagesController().L0(Long.valueOf(ba2Var.w0));
                if (L0 != null) {
                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    ba2Var.e.getLocationInWindow(iArr2);
                    qb8 qb8Var2 = new qb8();
                    qb8Var2.b = iArr2[0];
                    qb8Var2.c = iArr2[1];
                    kc0 kc0Var2 = ba2Var.e;
                    qb8Var2.d = kc0Var2;
                    ImageReceiver imageReceiver2 = kc0Var2.getImageReceiver();
                    qb8Var2.a = imageReceiver2;
                    if (j == 0) {
                    }
                    qb8Var2.f = j;
                    qb8Var2.e = imageReceiver2.p();
                    qb8Var2.g = -1L;
                    qb8Var2.h = ba2Var.e.getImageReceiver().z();
                    qb8Var2.k = ba2Var.d.getScaleX();
                    qb8Var2.p = true;
                    return qb8Var2;
                }
            }
        }
        return null;
    }

    @Override // jb8, pb8
    public final boolean O() {
        ba2 ba2Var = this.a;
        long j = ba2Var.C0;
        if (j == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = ba2Var.getMessagesController().n1(j);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        ba2Var.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new tg(this, (byte) 12));
        return false;
    }

    @Override // jb8, pb8
    public final void g(String str, String str2, boolean z) {
        this.a.s.p(str, str2, z);
    }

    @Override // jb8, pb8
    public final int x() {
        return 1;
    }
}
