package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vw0 extends yr0 {
    public final /* synthetic */ ProfileActivity a;

    public vw0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.ui.Components.g9] */
    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.Chat L0;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation2;
        gs0 gs0Var;
        int i11;
        boolean z12;
        long j10;
        kw0 kw0Var;
        kw0 kw0Var2;
        org.telegram.ui.Components.tg0 tg0Var;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        TLRPC.User Z1;
        TLRPC.UserProfilePhoto userProfilePhoto;
        if (fileLocation != null) {
            ProfileActivity profileActivity = this.a;
            if (profileActivity.X.getScaleX() <= 0.96f || !z11) {
                if (profileActivity.d1 == 0 ? profileActivity.e1 == 0 || (L0 = profileActivity.getMessagesController().L0(Long.valueOf(profileActivity.e1))) == null || (chatPhoto = L0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null : (Z1 = profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.d1))) == null || (userProfilePhoto = Z1.photo) == null || (fileLocation2 = userProfilePhoto.photo_big) == null) {
                    fileLocation2 = null;
                }
                boolean z13 = false;
                boolean z14 = fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id;
                kw0 kw0Var3 = profileActivity.n0;
                if (kw0Var3 != null) {
                    int realCount = kw0Var3.getRealCount();
                    i11 = 0;
                    while (i11 < realCount) {
                        org.telegram.messenger.ic G = profileActivity.n0.G(i11);
                        if (G != null && (tL_fileLocationToBeDeprecated = G.f) != null && tL_fileLocationToBeDeprecated.local_id == fileLocation.local_id) {
                            gs0Var = null;
                            if (tL_fileLocationToBeDeprecated.volume_id == fileLocation.volume_id && G.a == fileLocation.dc_id) {
                                z14 = true;
                                break;
                            }
                        }
                        i11++;
                    }
                }
                gs0Var = null;
                i11 = -1;
                if (!z14) {
                    return gs0Var;
                }
                jw0 jw0Var = profileActivity.e0;
                if (i11 >= 0 && (kw0Var = profileActivity.n0) != null && kw0Var.getVisibility() == 0) {
                    if (i11 != profileActivity.n0.getRealPosition() && (tg0Var = (kw0Var2 = profileActivity.n0).D0) != null) {
                        kw0Var2.x(tg0Var.j() + i11, false);
                    }
                    ?? currentItemView = profileActivity.n0.getCurrentItemView();
                    if (currentItemView != 0) {
                        jw0Var = currentItemView;
                        z12 = true;
                        int[] iArr = new int[2];
                        jw0Var.getLocationInWindow(iArr);
                        gs0 gs0Var2 = new gs0();
                        gs0Var2.b = iArr[0];
                        gs0Var2.c = iArr[1];
                        gs0Var2.d = jw0Var;
                        ImageReceiver imageReceiver = jw0Var.getImageReceiver();
                        gs0Var2.a = imageReceiver;
                        j10 = profileActivity.d1;
                        if (j10 == 0) {
                            gs0Var2.f = j10;
                        } else {
                            long j11 = profileActivity.e1;
                            if (j11 != 0) {
                                gs0Var2.f = -j11;
                            }
                        }
                        gs0Var2.e = imageReceiver.p();
                        gs0Var2.g = -1L;
                        gs0Var2.h = jw0Var.getImageReceiver().E();
                        gs0Var2.k = !z12 ? 1.0f : profileActivity.X.getScaleX();
                        gs0Var2.p = profileActivity.d1 != profileActivity.getUserConfig().n;
                        if (!z12 && profileActivity.X.getScaleX() > 0.96f) {
                            z13 = true;
                        }
                        gs0Var2.r = z13;
                        gs0Var2.s = z12;
                        return gs0Var2;
                    }
                }
                z12 = false;
                int[] iArr2 = new int[2];
                jw0Var.getLocationInWindow(iArr2);
                gs0 gs0Var22 = new gs0();
                gs0Var22.b = iArr2[0];
                gs0Var22.c = iArr2[1];
                gs0Var22.d = jw0Var;
                ImageReceiver imageReceiver2 = jw0Var.getImageReceiver();
                gs0Var22.a = imageReceiver2;
                j10 = profileActivity.d1;
                if (j10 == 0) {
                }
                gs0Var22.e = imageReceiver2.p();
                gs0Var22.g = -1L;
                gs0Var22.h = jw0Var.getImageReceiver().E();
                gs0Var22.k = !z12 ? 1.0f : profileActivity.X.getScaleX();
                gs0Var22.p = profileActivity.d1 != profileActivity.getUserConfig().n;
                if (!z12) {
                    z13 = true;
                }
                gs0Var22.r = z13;
                gs0Var22.s = z12;
                return gs0Var22;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void G() {
        this.a.e0.getImageReceiver().O0(true, true);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void f(String str, String str2, boolean z10) {
        this.a.q0.p(str, str2, z10);
    }
}
