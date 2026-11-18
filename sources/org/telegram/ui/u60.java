package org.telegram.ui;

import android.widget.ImageView;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u60 implements org.telegram.messenger.x10 {
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

    @Override // org.telegram.messenger.x10
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
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q instanceof me0) {
                    Q = ((me0) Q).c0();
                }
                org.telegram.ui.ActionBar.h2 h2Var = Q;
                if (h2Var != null) {
                    org.telegram.ui.ActionBar.i6 resourceProvider = h2Var.getResourceProvider();
                    if (h2Var.getLastStoryViewer() != null && h2Var.getLastStoryViewer().K0) {
                        resourceProvider = h2Var.getLastStoryViewer().E;
                    }
                    ug.l0 l0Var = new ug.l0(19, launchActivity.P, launchActivity, h2Var, resourceProvider);
                    l0Var.B1(g3Var);
                    if (!(h2Var instanceof bn) ? !(!(h2Var instanceof cx) || (xvVar = ((cx) h2Var).H3) == null || xvVar.getCurrentFragmetDialogId() != l10.longValue()) : ((bn) h2Var).a() == l10.longValue()) {
                        z10 = true;
                    }
                    l0Var.A1(tL_premium_boostsStatus, z10);
                    l0Var.C1(l10.longValue());
                    l0Var.c2 = r1Var;
                    h2Var.showDialog(l0Var);
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
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj3;
                bg.m0 m0Var = (bg.m0) obj2;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                ((org.telegram.ui.ActionBar.x2[]) obj7)[0] = null;
                gi0.a = null;
                if (!((boolean[]) obj6)[0]) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                    if (!tL_urlAuthResultRequest.request_write_access && !tL_urlAuthResultRequest.request_phone_number) {
                        m0Var.run();
                        break;
                    } else {
                        gi0.a = x2Var;
                        x2Var.show();
                        break;
                    }
                } else {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    break;
                }
                break;
            case 3:
                hi.d dVar = (hi.d) obj6;
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                org.telegram.ui.Wallet.p pVar = (org.telegram.ui.Wallet.p) obj3;
                org.telegram.ui.Wallet.h2 h2Var2 = (org.telegram.ui.Wallet.h2) obj2;
                String str3 = (String) obj;
                ((hi.d) obj7).setLoading(false);
                dVar.setLoading(false);
                if (str3 != null) {
                    org.telegram.ui.Components.lc.d0(str3, d3Var.F, i6Var);
                    pVar.run();
                    dVar.setEnabled((h2Var2.n || h2Var2.o) ? false : true);
                    break;
                } else {
                    d3Var.dismiss();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) obj4;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj3;
                jg.w0 w0Var = (jg.w0) obj2;
                String str4 = (String) obj;
                ((hi.d) obj7).setLoading(false);
                ((hi.d) obj6).setEnabled(true);
                ((ImageView) obj5).setEnabled(true);
                if (str4 != null) {
                    org.telegram.ui.Components.lc.d0(str4, e3Var.F, i6Var2);
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
