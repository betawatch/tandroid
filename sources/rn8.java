// default package

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rn8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ProfileActivity b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ rn8(ProfileActivity profileActivity, TLRPC.User user, byte b) {
        this.a = b;
        this.b = profileActivity;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                TLRPC.User user = this.c;
                RectF rectF = ProfileActivity.e7;
                try {
                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "+" + user.phone));
                    if (gm.C3()) {
                        c41.b0(profileActivity).i(jb6.M0(2131747028, null)).j();
                        break;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
                break;
            case 1:
                ProfileActivity profileActivity2 = this.b;
                TLRPC.User user2 = this.c;
                RectF rectF2 = ProfileActivity.e7;
                profileActivity2.presentFragment(yv1.ga(user2.id));
                break;
            case 2:
                ProfileActivity profileActivity3 = this.b;
                TLRPC.User user3 = this.c;
                RectF rectF3 = ProfileActivity.e7;
                if (profileActivity3.getParentActivity() != null) {
                    TLRPC.UserFull userFull = profileActivity3.w2;
                    sic.m(user3, false, userFull != null && userFull.video_calls_available, profileActivity3.getParentActivity(), profileActivity3.w2, profileActivity3.getAccountInstance());
                    break;
                }
                break;
            case 3:
                ProfileActivity profileActivity4 = this.b;
                TLRPC.User user4 = this.c;
                RectF rectF4 = ProfileActivity.e7;
                if (profileActivity4.getParentActivity() != null) {
                    TLRPC.UserFull userFull2 = profileActivity4.w2;
                    sic.m(user4, true, userFull2 != null && userFull2.video_calls_available, profileActivity4.getParentActivity(), profileActivity4.w2, profileActivity4.getAccountInstance());
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity5 = this.b;
                TLRPC.User user5 = this.c;
                RectF rectF5 = ProfileActivity.e7;
                try {
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + user5.phone));
                    intent.addFlags(TLObject.FLAG_28);
                    profileActivity5.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
        }
    }
}
