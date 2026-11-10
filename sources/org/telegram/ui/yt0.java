package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ yt0(ProfileActivity profileActivity, TLRPC.User user, int i7) {
        this.a = i7;
        this.b = profileActivity;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                TLRPC.User user = this.c;
                RectF rectF = ProfileActivity.V6;
                profileActivity.getClass();
                profileActivity.presentFragment(cn.ta(user.id));
                break;
            case 1:
                ProfileActivity profileActivity2 = this.b;
                TLRPC.User user2 = this.c;
                RectF rectF2 = ProfileActivity.V6;
                if (profileActivity2.getParentActivity() != null) {
                    TLRPC.UserFull userFull = profileActivity2.u2;
                    org.telegram.ui.Components.voip.y1.m(user2, false, userFull != null && userFull.video_calls_available, profileActivity2.getParentActivity(), profileActivity2.u2, profileActivity2.getAccountInstance());
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity3 = this.b;
                TLRPC.User user3 = this.c;
                RectF rectF3 = ProfileActivity.V6;
                if (profileActivity3.getParentActivity() != null) {
                    TLRPC.UserFull userFull2 = profileActivity3.u2;
                    org.telegram.ui.Components.voip.y1.m(user3, true, userFull2 != null && userFull2.video_calls_available, profileActivity3.getParentActivity(), profileActivity3.u2, profileActivity3.getAccountInstance());
                    break;
                }
                break;
            case 3:
                ProfileActivity profileActivity4 = this.b;
                TLRPC.User user4 = this.c;
                RectF rectF4 = ProfileActivity.V6;
                try {
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + user4.phone));
                    intent.addFlags(TLObject.FLAG_28);
                    profileActivity4.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                ProfileActivity profileActivity5 = this.b;
                TLRPC.User user5 = this.c;
                RectF rectF5 = ProfileActivity.V6;
                try {
                    ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "+" + user5.phone));
                    if (org.telegram.messenger.g0.I3()) {
                        org.telegram.ui.Components.gc.a0(profileActivity5).i(org.telegram.messenger.id.M0(2131747295, null)).j();
                        break;
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                break;
        }
    }
}
