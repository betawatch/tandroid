package org.telegram.ui;

import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wy0 extends pt0 {
    public final /* synthetic */ ProfileActivity a;

    public wy0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.ui.Components.t9] */
    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation2;
        zt0 zt0Var;
        int i11;
        boolean z12;
        long j10;
        my0 my0Var;
        my0 my0Var2;
        org.telegram.ui.Components.jh0 jh0Var;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        TLRPC.User user;
        TLRPC.UserProfilePhoto userProfilePhoto;
        if (fileLocation != null) {
            ProfileActivity profileActivity = this.a;
            if (profileActivity.U.getScaleX() <= 0.96f || !z11) {
                if (profileActivity.a1 == 0 ? profileActivity.b1 == 0 || (chat = profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.b1))) == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null : (user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.a1))) == null || (userProfilePhoto = user.photo) == null || (fileLocation2 = userProfilePhoto.photo_big) == null) {
                    fileLocation2 = null;
                }
                boolean z13 = false;
                boolean z14 = fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id;
                my0 my0Var3 = profileActivity.j0;
                if (my0Var3 != null) {
                    int realCount = my0Var3.getRealCount();
                    i11 = 0;
                    while (i11 < realCount) {
                        ImageLocation G = profileActivity.j0.G(i11);
                        if (G != null && (tL_fileLocationToBeDeprecated = G.location) != null && tL_fileLocationToBeDeprecated.local_id == fileLocation.local_id) {
                            zt0Var = null;
                            if (tL_fileLocationToBeDeprecated.volume_id == fileLocation.volume_id && G.dc_id == fileLocation.dc_id) {
                                z14 = true;
                                break;
                            }
                        }
                        i11++;
                    }
                }
                zt0Var = null;
                i11 = -1;
                if (!z14) {
                    return zt0Var;
                }
                ly0 ly0Var = profileActivity.a0;
                if (i11 >= 0 && (my0Var = profileActivity.j0) != null && my0Var.getVisibility() == 0) {
                    if (i11 != profileActivity.j0.getRealPosition() && (jh0Var = (my0Var2 = profileActivity.j0).z0) != null) {
                        my0Var2.x(jh0Var.j() + i11, false);
                    }
                    ?? currentItemView = profileActivity.j0.getCurrentItemView();
                    if (currentItemView != 0) {
                        ly0Var = currentItemView;
                        z12 = true;
                        int[] iArr = new int[2];
                        ly0Var.getLocationInWindow(iArr);
                        zt0 zt0Var2 = new zt0();
                        zt0Var2.b = iArr[0];
                        zt0Var2.c = iArr[1];
                        zt0Var2.d = ly0Var;
                        ImageReceiver imageReceiver = ly0Var.getImageReceiver();
                        zt0Var2.a = imageReceiver;
                        j10 = profileActivity.a1;
                        if (j10 == 0) {
                            zt0Var2.f = j10;
                        } else {
                            long j11 = profileActivity.b1;
                            if (j11 != 0) {
                                zt0Var2.f = -j11;
                            }
                        }
                        zt0Var2.e = imageReceiver.getBitmapSafe();
                        zt0Var2.g = -1L;
                        zt0Var2.h = ly0Var.getImageReceiver().getRoundRadius(true);
                        zt0Var2.k = !z12 ? 1.0f : profileActivity.U.getScaleX();
                        zt0Var2.p = profileActivity.a1 != profileActivity.getUserConfig().clientUserId;
                        if (!z12 && profileActivity.U.getScaleX() > 0.96f) {
                            z13 = true;
                        }
                        zt0Var2.r = z13;
                        zt0Var2.s = z12;
                        return zt0Var2;
                    }
                }
                z12 = false;
                int[] iArr2 = new int[2];
                ly0Var.getLocationInWindow(iArr2);
                zt0 zt0Var22 = new zt0();
                zt0Var22.b = iArr2[0];
                zt0Var22.c = iArr2[1];
                zt0Var22.d = ly0Var;
                ImageReceiver imageReceiver2 = ly0Var.getImageReceiver();
                zt0Var22.a = imageReceiver2;
                j10 = profileActivity.a1;
                if (j10 == 0) {
                }
                zt0Var22.e = imageReceiver2.getBitmapSafe();
                zt0Var22.g = -1L;
                zt0Var22.h = ly0Var.getImageReceiver().getRoundRadius(true);
                zt0Var22.k = !z12 ? 1.0f : profileActivity.U.getScaleX();
                zt0Var22.p = profileActivity.a1 != profileActivity.getUserConfig().clientUserId;
                if (!z12) {
                    z13 = true;
                }
                zt0Var22.r = z13;
                zt0Var22.s = z12;
                return zt0Var22;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void G() {
        this.a.a0.getImageReceiver().setVisible(true, true);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void f(String str, String str2, boolean z10) {
        this.a.m0.q(str, str2, z10);
    }
}
