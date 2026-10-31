package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w70 implements ux {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ TLRPC.User c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ w70(LaunchActivity launchActivity, String str, int i10, TLRPC.User user) {
        this.b = launchActivity;
        this.d = str;
        this.e = i10;
        this.c = user;
    }

    @Override // org.telegram.ui.ux
    public final /* synthetic */ boolean G() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ux
    public final /* synthetic */ boolean N(ay ayVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ux
    public final boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        int i12 = this.a;
        int i13 = this.e;
        String str = this.d;
        TLRPC.User user = this.c;
        LaunchActivity launchActivity = this.b;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                long j10 = ((org.telegram.messenger.gs) arrayList.get(0)).a;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = org.telegram.messenger.vp.r1(i13).p1(user);
                org.telegram.messenger.qz.C(i13).p0(org.telegram.messenger.vp.r1(i13).i1(j10), tL_inputMediaGame, 0L, 0L);
                Bundle g10 = a1.g.g("scrollToTopOnResume", true);
                if (org.telegram.messenger.o5.C(j10)) {
                    g10.putInt("enc_id", (int) (j10 & 4294967295L));
                } else if (org.telegram.messenger.o5.E(j10)) {
                    g10.putLong("user_id", j10);
                } else {
                    g10.putLong("chat_id", -j10);
                }
                if (org.telegram.messenger.vp.r1(i13).E(g10, ayVar, null, null)) {
                    org.telegram.messenger.zs.f(i13).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).U(new un(g10), true, false);
                    break;
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                long j11 = ((org.telegram.messenger.gs) arrayList.get(0)).a;
                Bundle g11 = a1.g.g("scrollToTopOnResume", true);
                if (org.telegram.messenger.o5.C(j11)) {
                    g11.putInt("enc_id", (int) (j11 & 4294967295L));
                } else if (org.telegram.messenger.o5.E(j11)) {
                    g11.putLong("user_id", j11);
                } else {
                    g11.putLong("chat_id", -j11);
                }
                g11.putString("attach_bot", org.telegram.messenger.h20.n(user));
                if (str != null) {
                    g11.putString("attach_bot_start_command", str);
                }
                if (org.telegram.messenger.vp.r1(i13).E(g11, ayVar, null, null)) {
                    org.telegram.messenger.zs.f(i13).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).U(new un(g11), true, false);
                    break;
                }
                break;
        }
        return true;
    }

    public /* synthetic */ w70(LaunchActivity launchActivity, TLRPC.User user, String str, int i10) {
        this.b = launchActivity;
        this.c = user;
        this.d = str;
        this.e = i10;
    }
}
