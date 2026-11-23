package org.telegram.ui;

import android.widget.ImageView;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u60 implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ u60(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.g = obj4;
        this.f = obj5;
        this.d = obj6;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        xv xvVar;
        int i7 = this.a;
        boolean z10 = false;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.g;
        Object obj5 = this.e;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i7) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                vf.b bVar = (vf.b) obj6;
                Long l10 = (Long) obj5;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj4;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) obj3;
                Runnable runnable = (Runnable) obj2;
                org.telegram.messenger.g3 g3Var = (org.telegram.messenger.g3) obj;
                String str = LaunchActivity.C1;
                if (bVar != null) {
                    bVar.b();
                }
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q instanceof me0) {
                    Q = ((me0) Q).c0();
                }
                org.telegram.ui.ActionBar.g2 g2Var = Q;
                if (g2Var != null) {
                    org.telegram.ui.ActionBar.h6 resourceProvider = g2Var.getResourceProvider();
                    if (g2Var.getLastStoryViewer() != null && g2Var.getLastStoryViewer().K0) {
                        resourceProvider = g2Var.getLastStoryViewer().E;
                    }
                    ug.k0 k0Var = new ug.k0(19, launchActivity.P, launchActivity, g2Var, resourceProvider);
                    k0Var.B1(g3Var);
                    if (!(g2Var instanceof bn) ? !(!(g2Var instanceof cx) || (xvVar = ((cx) g2Var).H3) == null || xvVar.getCurrentFragmetDialogId() != l10.longValue()) : ((bn) g2Var).a() == l10.longValue()) {
                        z10 = true;
                    }
                    k0Var.A1(tL_premium_boostsStatus, z10);
                    k0Var.C1(l10.longValue());
                    k0Var.c2 = r1Var;
                    g2Var.showDialog(k0Var);
                    if (runnable != null) {
                        try {
                            runnable.run();
                            break;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                }
                break;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) obj7;
                vf.b bVar2 = (vf.b) obj6;
                Runnable runnable2 = (Runnable) obj2;
                org.telegram.messenger.h3 h3Var = (org.telegram.messenger.h3) obj4;
                Long l11 = (Long) obj5;
                org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                String str2 = LaunchActivity.C1;
                if (tL_premium_boostsStatus2 != null) {
                    h3Var.b(l11.longValue(), tL_premium_boostsStatus2, new u60(launchActivity2, bVar2, l11, tL_premium_boostsStatus2, r1Var2, runnable2, 0));
                    break;
                } else {
                    if (bVar2 != null) {
                        bVar2.b();
                    }
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj5;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj4;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj3;
                bg.m0 m0Var = (bg.m0) obj2;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                ((org.telegram.ui.ActionBar.w2[]) obj7)[0] = null;
                gi0.a = null;
                if (!((boolean[]) obj6)[0]) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                    if (!tL_urlAuthResultRequest.request_write_access && !tL_urlAuthResultRequest.request_phone_number) {
                        m0Var.run();
                        break;
                    } else {
                        gi0.a = w2Var;
                        w2Var.show();
                        break;
                    }
                } else {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    break;
                }
                break;
            case 3:
                hi.e eVar = (hi.e) obj6;
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) obj5;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj4;
                org.telegram.ui.Wallet.p pVar = (org.telegram.ui.Wallet.p) obj3;
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) obj2;
                String str3 = (String) obj;
                ((hi.e) obj7).setLoading(false);
                eVar.setLoading(false);
                if (str3 != null) {
                    org.telegram.ui.Components.lc.d0(str3, d3Var.F, h6Var);
                    pVar.run();
                    eVar.setEnabled((h2Var.n || h2Var.o) ? false : true);
                    break;
                } else {
                    d3Var.dismiss();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) obj4;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj3;
                jg.w0 w0Var = (jg.w0) obj2;
                String str4 = (String) obj;
                ((hi.e) obj7).setLoading(false);
                ((hi.e) obj6).setEnabled(true);
                ((ImageView) obj5).setEnabled(true);
                if (str4 != null) {
                    org.telegram.ui.Components.lc.d0(str4, e3Var.F, h6Var2);
                    w0Var.run();
                    break;
                } else {
                    e3Var.dismiss();
                    break;
                }
        }
    }

    public /* synthetic */ u60(LaunchActivity launchActivity, vf.b bVar, Runnable runnable, org.telegram.messenger.h3 h3Var, Long l10, org.telegram.ui.Cells.r1 r1Var) {
        this.a = 1;
        this.b = launchActivity;
        this.c = bVar;
        this.d = runnable;
        this.g = h3Var;
        this.e = l10;
        this.f = r1Var;
    }
}
