package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y60 implements ww {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ TLRPC.User c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ y60(LaunchActivity launchActivity, String str, int i7, TLRPC.User user) {
        this.b = launchActivity;
        this.d = str;
        this.e = i7;
        this.c = user;
    }

    @Override // org.telegram.ui.ww
    public final /* synthetic */ boolean G() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ww
    public final /* synthetic */ boolean P(cx cxVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ww
    public final boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        int i11 = this.a;
        int i12 = this.e;
        String str = this.d;
        TLRPC.User user = this.c;
        LaunchActivity launchActivity = this.b;
        switch (i11) {
            case 0:
                String str2 = LaunchActivity.C1;
                long j3 = ((org.telegram.messenger.tr) arrayList.get(0)).a;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = org.telegram.messenger.np.u1(i12).s1(user);
                org.telegram.messenger.az.C(i12).p0(org.telegram.messenger.np.u1(i12).l1(j3), tL_inputMediaGame, 0L, 0L);
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                if (org.telegram.messenger.n5.C(j3)) {
                    k10.putInt("enc_id", (int) (j3 & 4294967295L));
                } else if (org.telegram.messenger.n5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (org.telegram.messenger.np.u1(i12).E(k10, cxVar, null, null)) {
                    org.telegram.messenger.ls.f(i12).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).V(new bn(k10), true, false);
                    break;
                }
                break;
            default:
                String str3 = LaunchActivity.C1;
                long j10 = ((org.telegram.messenger.tr) arrayList.get(0)).a;
                Bundle k11 = a8.p0.k("scrollToTopOnResume", true);
                if (org.telegram.messenger.n5.C(j10)) {
                    k11.putInt("enc_id", (int) (j10 & 4294967295L));
                } else if (org.telegram.messenger.n5.E(j10)) {
                    k11.putLong("user_id", j10);
                } else {
                    k11.putLong("chat_id", -j10);
                }
                k11.putString("attach_bot", org.telegram.messenger.p10.o(user));
                if (str != null) {
                    k11.putString("attach_bot_start_command", str);
                }
                if (org.telegram.messenger.np.u1(i12).E(k11, cxVar, null, null)) {
                    org.telegram.messenger.ls.f(i12).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).V(new bn(k11), true, false);
                    break;
                }
                break;
        }
        return true;
    }

    public /* synthetic */ y60(LaunchActivity launchActivity, TLRPC.User user, String str, int i7) {
        this.b = launchActivity;
        this.c = user;
        this.d = str;
        this.e = i7;
    }
}
