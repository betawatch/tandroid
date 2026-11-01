package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v70 implements tx {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ TLRPC.User c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ v70(LaunchActivity launchActivity, String str, int i10, TLRPC.User user) {
        this.b = launchActivity;
        this.d = str;
        this.e = i10;
        this.c = user;
    }

    @Override // org.telegram.ui.tx
    public final /* synthetic */ boolean H() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.tx
    public final /* synthetic */ boolean O(zx zxVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.tx
    public final boolean z(zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        int i12 = this.a;
        int i13 = this.e;
        String str = this.d;
        TLRPC.User user = this.c;
        LaunchActivity launchActivity = this.b;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                long j10 = ((org.telegram.messenger.hs) arrayList.get(0)).a;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = org.telegram.messenger.wp.r1(i13).p1(user);
                org.telegram.messenger.rz.C(i13).p0(org.telegram.messenger.wp.r1(i13).i1(j10), tL_inputMediaGame, 0L, 0L);
                Bundle g10 = a1.g.g("scrollToTopOnResume", true);
                if (org.telegram.messenger.o5.C(j10)) {
                    g10.putInt("enc_id", (int) (j10 & 4294967295L));
                } else if (org.telegram.messenger.o5.E(j10)) {
                    g10.putLong("user_id", j10);
                } else {
                    g10.putLong("chat_id", -j10);
                }
                if (org.telegram.messenger.wp.r1(i13).E(g10, zxVar, null, null)) {
                    org.telegram.messenger.at.f(i13).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).U(new un(g10), true, false);
                    break;
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                long j11 = ((org.telegram.messenger.hs) arrayList.get(0)).a;
                Bundle g11 = a1.g.g("scrollToTopOnResume", true);
                if (org.telegram.messenger.o5.C(j11)) {
                    g11.putInt("enc_id", (int) (j11 & 4294967295L));
                } else if (org.telegram.messenger.o5.E(j11)) {
                    g11.putLong("user_id", j11);
                } else {
                    g11.putLong("chat_id", -j11);
                }
                g11.putString("attach_bot", org.telegram.messenger.i20.n(user));
                if (str != null) {
                    g11.putString("attach_bot_start_command", str);
                }
                if (org.telegram.messenger.wp.r1(i13).E(g11, zxVar, null, null)) {
                    org.telegram.messenger.at.f(i13).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).U(new un(g11), true, false);
                    break;
                }
                break;
        }
        return true;
    }

    public /* synthetic */ v70(LaunchActivity launchActivity, TLRPC.User user, String str, int i10) {
        this.b = launchActivity;
        this.c = user;
        this.d = str;
        this.e = i10;
    }
}
