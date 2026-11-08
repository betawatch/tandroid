package org.telegram.ui;

import android.widget.ImageView;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t60 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ t60(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.g = obj4;
        this.f = obj5;
        this.d = obj6;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        sv svVar;
        int i7 = this.a;
        boolean z9 = false;
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
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj3;
                Runnable runnable = (Runnable) obj2;
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) obj;
                String str = LaunchActivity.B1;
                if (bVar != null) {
                    bVar.b();
                }
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q instanceof je0) {
                    Q = ((je0) Q).c0();
                }
                org.telegram.ui.ActionBar.f2 f2Var = Q;
                if (f2Var != null) {
                    org.telegram.ui.ActionBar.f6 resourceProvider = f2Var.getResourceProvider();
                    if (f2Var.getLastStoryViewer() != null && f2Var.getLastStoryViewer().J0) {
                        resourceProvider = f2Var.getLastStoryViewer().D;
                    }
                    ug.i0 i0Var = new ug.i0(19, launchActivity.O, launchActivity, f2Var, resourceProvider);
                    i0Var.A1(e3Var);
                    if (!(f2Var instanceof an) ? !(!(f2Var instanceof ww) || (svVar = ((ww) f2Var).F3) == null || svVar.getCurrentFragmetDialogId() != l10.longValue()) : ((an) f2Var).a() == l10.longValue()) {
                        z9 = true;
                    }
                    i0Var.z1(tL_premium_boostsStatus, z9);
                    i0Var.B1(l10.longValue());
                    i0Var.Y1 = q1Var;
                    f2Var.showDialog(i0Var);
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
                org.telegram.messenger.f3 f3Var = (org.telegram.messenger.f3) obj4;
                Long l11 = (Long) obj5;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                String str2 = LaunchActivity.B1;
                if (tL_premium_boostsStatus2 != null) {
                    f3Var.b(l11.longValue(), tL_premium_boostsStatus2, new t60(launchActivity2, bVar2, l11, tL_premium_boostsStatus2, q1Var2, runnable2, 0));
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
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj3;
                bg.l0 l0Var = (bg.l0) obj2;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                ((org.telegram.ui.ActionBar.v2[]) obj7)[0] = null;
                bi0.a = null;
                if (!((boolean[]) obj6)[0]) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                    if (!tL_urlAuthResultRequest.request_write_access && !tL_urlAuthResultRequest.request_phone_number) {
                        l0Var.run();
                        break;
                    } else {
                        bi0.a = v2Var;
                        v2Var.show();
                        break;
                    }
                } else {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    break;
                }
                break;
            case 3:
                fi.d dVar = (fi.d) obj6;
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj5;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                org.telegram.ui.Wallet.g gVar = (org.telegram.ui.Wallet.g) obj3;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj2;
                String str3 = (String) obj;
                ((fi.d) obj7).setLoading(false);
                dVar.setLoading(false);
                if (str3 != null) {
                    org.telegram.ui.Components.hc.c0(str3, y2Var.E, f6Var);
                    gVar.run();
                    dVar.setEnabled((a2Var.n || a2Var.o) ? false : true);
                    break;
                } else {
                    y2Var.dismiss();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.z2 z2Var = (org.telegram.ui.Wallet.z2) obj4;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj3;
                jg.w0 w0Var = (jg.w0) obj2;
                String str4 = (String) obj;
                ((fi.d) obj7).setLoading(false);
                ((fi.d) obj6).setEnabled(true);
                ((ImageView) obj5).setEnabled(true);
                if (str4 != null) {
                    org.telegram.ui.Components.hc.c0(str4, z2Var.E, f6Var2);
                    w0Var.run();
                    break;
                } else {
                    z2Var.dismiss();
                    break;
                }
        }
    }

    public /* synthetic */ t60(LaunchActivity launchActivity, vf.b bVar, Runnable runnable, org.telegram.messenger.f3 f3Var, Long l10, org.telegram.ui.Cells.q1 q1Var) {
        this.a = 1;
        this.b = launchActivity;
        this.c = bVar;
        this.d = runnable;
        this.g = f3Var;
        this.e = l10;
        this.f = q1Var;
    }
}
