package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ wx0(ProfileActivity profileActivity, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = profileActivity;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                TLRPC.User user = this.c;
                int i10 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(wn.ea(user.id));
                break;
            case 1:
                ProfileActivity profileActivity2 = this.b;
                TLRPC.User user2 = this.c;
                int i11 = ProfileActivity.R6;
                if (profileActivity2.getParentActivity() != null) {
                    TLRPC.UserFull userFull = profileActivity2.v2;
                    org.telegram.ui.Components.voip.g2.m(user2, false, userFull != null && userFull.video_calls_available, profileActivity2.getParentActivity(), profileActivity2.v2, profileActivity2.getAccountInstance());
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity3 = this.b;
                TLRPC.User user3 = this.c;
                int i12 = ProfileActivity.R6;
                if (profileActivity3.getParentActivity() != null) {
                    TLRPC.UserFull userFull2 = profileActivity3.v2;
                    org.telegram.ui.Components.voip.g2.m(user3, true, userFull2 != null && userFull2.video_calls_available, profileActivity3.getParentActivity(), profileActivity3.v2, profileActivity3.getAccountInstance());
                    break;
                }
                break;
            case 3:
                ProfileActivity profileActivity4 = this.b;
                TLRPC.User user4 = this.c;
                int i13 = ProfileActivity.R6;
                profileActivity4.getClass();
                try {
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + user4.phone));
                    intent.addFlags(TLObject.FLAG_28);
                    profileActivity4.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                ProfileActivity profileActivity5 = this.b;
                TLRPC.User user5 = this.c;
                int i14 = ProfileActivity.R6;
                try {
                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "+" + user5.phone));
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        org.telegram.ui.Components.wc.b0(profileActivity5).i(LocaleController.getString(R.string.PhoneCopied)).j();
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                break;
        }
    }
}
