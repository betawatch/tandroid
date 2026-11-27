// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class v87 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;

    public /* synthetic */ v87(uc7 uc7Var, long j, TLObject tLObject) {
        this.b = uc7Var;
        this.d = j;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        TLObject tLObject = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                uc7Var.k0.l(j);
                if (tLObject != null) {
                    TLRPC.TL_messages_peerSettings tL_messages_peerSettings = (TLRPC.TL_messages_peerSettings) tLObject;
                    TLRPC.PeerSettings peerSettings = tL_messages_peerSettings.settings;
                    uc7Var.j4(tL_messages_peerSettings.users, false);
                    uc7Var.c4(tL_messages_peerSettings.chats, false);
                    uc7Var.F4(j, peerSettings);
                    break;
                }
                break;
            default:
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                TLRPC.User X1 = uc7Var.X1(Long.valueOf(uc7Var.getUserConfig().e()));
                if (X1 == null) {
                    X1 = uc7Var.getUserConfig().f();
                    uc7Var.i4(X1, false, false);
                } else {
                    uc7Var.getUserConfig().v(X1);
                }
                if (X1 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(X1);
                    uc7Var.getMessagesStorage().n1(arrayList, null, false, true);
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        X1.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.has_video = !tL_photos_photo.photo.video_sizes.isEmpty();
                        TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                        TLRPC.Photo photo = tL_photos_photo.photo;
                        userProfilePhoto.photo_id = photo.id;
                        userProfilePhoto.photo_small = xb4.w(photo.sizes, jn7.f2, false, null, false).location;
                        X1.photo.photo_big = xb4.w(tL_photos_photo.photo.sizes, 800, false, null, false).location;
                        X1.photo.dc_id = tL_photos_photo.photo.dc_id;
                    } else {
                        X1.photo = new TLRPC.TL_userProfilePhotoEmpty();
                    }
                    TLRPC.UserFull Y1 = uc7Var.Y1(j);
                    if (Y1 != null) {
                        Y1.profile_photo = tL_photos_photo.photo;
                        uc7Var.getMessagesStorage().l2(Y1, false);
                    }
                    uc7Var.getUserConfig().f().photo = X1.photo;
                    uc7Var.i4(X1, false, false);
                    uc7Var.getNotificationCenter().k(47, new Object[0]);
                    jn7 notificationCenter = uc7Var.getNotificationCenter();
                    int i = uc7.s5;
                    notificationCenter.k(2, Integer.valueOf(uc7.s5));
                    uc7Var.getNotificationCenter().k(2, 2);
                    uc7Var.getUserConfig().u(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v87(uc7 uc7Var, TLObject tLObject, long j) {
        this.b = uc7Var;
        this.c = tLObject;
        this.d = j;
    }
}
