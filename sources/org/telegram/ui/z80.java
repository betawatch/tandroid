package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z80 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ ma0 h;

    public /* synthetic */ z80(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, ma0 ma0Var) {
        this.b = launchActivity;
        this.d = tLObject;
        this.e = i10;
        this.f = str;
        this.c = tL_error;
        this.h = ma0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.vc a02;
        int i10;
        int i11;
        int i12 = this.a;
        ma0 ma0Var = this.h;
        String str = this.f;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity = this.b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.e).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    launchActivity.p0(new bo(bundle));
                } else {
                    StringBuilder w10 = a4.a.w("cant import contact token. token=", str, " err=");
                    w10.append(tL_error == null ? null : tL_error.text);
                    FileLog.e(w10.toString());
                    org.telegram.messenger.y0.p(R.string.NoUsernameFound, org.telegram.ui.Components.vc.a0((org.telegram.ui.ActionBar.n2) hg.c.h(1, launchActivity.d0)), null);
                }
                try {
                    ma0Var.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                Pattern pattern2 = LaunchActivity.B1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            a02 = org.telegram.ui.Components.vc.a0(U);
                            i10 = R.raw.fire_on;
                            i11 = R.string.UniqueGiftNotFoundBurned;
                        } else {
                            a02 = org.telegram.ui.Components.vc.a0(U);
                            i10 = R.raw.error;
                            i11 = R.string.UniqueGiftNotFound;
                        }
                        org.telegram.messenger.y0.o(i11, a02, i10, 36);
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity2 = this.b;
                    MessagesController.getInstance(launchActivity2.O).putUsers(tL_payments_uniqueStarGift.users, false);
                    MessagesController.getInstance(launchActivity2.O).putChats(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        yh.z3 z3Var = new yh.z3(launchActivity2, this.e, 0L, null, null);
                        z3Var.h2(str, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (U2 == null) {
                            z3Var.show();
                        } else if (U2.getLastStoryViewer() == null || !U2.getLastStoryViewer().K0) {
                            U2.showDialog(z3Var);
                        } else {
                            U2.getLastStoryViewer().showDialog(z3Var);
                        }
                    }
                }
                try {
                    ma0Var.run();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
        }
    }

    public /* synthetic */ z80(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, ma0 ma0Var) {
        this.b = launchActivity;
        this.c = tL_error;
        this.d = tLObject;
        this.e = i10;
        this.f = str;
        this.h = ma0Var;
    }
}
