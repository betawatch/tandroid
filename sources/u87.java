// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class u87 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;

    public /* synthetic */ u87(oc7 oc7Var, long j, TLObject tLObject) {
        this.b = oc7Var;
        this.d = j;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        TLObject tLObject = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                oc7Var.k0.l(j);
                if (tLObject != null) {
                    TLRPC.TL_messages_peerSettings tL_messages_peerSettings = (TLRPC.TL_messages_peerSettings) tLObject;
                    TLRPC.PeerSettings peerSettings = tL_messages_peerSettings.settings;
                    oc7Var.d4(tL_messages_peerSettings.users, false);
                    oc7Var.X3(tL_messages_peerSettings.chats, false);
                    oc7Var.z4(j, peerSettings);
                    break;
                }
                break;
            default:
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                TLRPC.User W1 = oc7Var.W1(Long.valueOf(oc7Var.getUserConfig().e()));
                if (W1 == null) {
                    W1 = oc7Var.getUserConfig().f();
                    oc7Var.c4(W1, false, false);
                } else {
                    oc7Var.getUserConfig().v(W1);
                }
                if (W1 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(W1);
                    oc7Var.getMessagesStorage().j1(arrayList, null, false, true);
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        W1.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.has_video = !tL_photos_photo.photo.video_sizes.isEmpty();
                        TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                        TLRPC.Photo photo = tL_photos_photo.photo;
                        userProfilePhoto.photo_id = photo.id;
                        userProfilePhoto.photo_small = bc4.w(photo.sizes, nm7.f2, false, null, false).location;
                        W1.photo.photo_big = bc4.w(tL_photos_photo.photo.sizes, 800, false, null, false).location;
                        W1.photo.dc_id = tL_photos_photo.photo.dc_id;
                    } else {
                        W1.photo = new TLRPC.TL_userProfilePhotoEmpty();
                    }
                    TLRPC.UserFull X1 = oc7Var.X1(j);
                    if (X1 != null) {
                        X1.profile_photo = tL_photos_photo.photo;
                        oc7Var.getMessagesStorage().g2(X1, false);
                    }
                    oc7Var.getUserConfig().f().photo = W1.photo;
                    oc7Var.c4(W1, false, false);
                    oc7Var.getNotificationCenter().k(47, new Object[0]);
                    nm7 notificationCenter = oc7Var.getNotificationCenter();
                    int i = oc7.s5;
                    notificationCenter.k(2, Integer.valueOf(oc7.s5));
                    oc7Var.getNotificationCenter().k(2, 2);
                    oc7Var.getUserConfig().u(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u87(oc7 oc7Var, TLObject tLObject, long j) {
        this.b = oc7Var;
        this.c = tLObject;
        this.d = j;
    }
}
