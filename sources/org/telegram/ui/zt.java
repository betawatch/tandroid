package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zt(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.c;
                Long l4 = (Long) obj;
                org.telegram.messenger.i0.r((yt) this.d);
                dataSettingsActivity.V = dataSettingsActivity.V || System.currentTimeMillis() - this.b > 120;
                dataSettingsActivity.X = l4.longValue();
                dataSettingsActivity.W = false;
                if (dataSettingsActivity.a != null && (i10 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.s0(i10);
                    break;
                }
                break;
            case 1:
                bx bxVar = (bx) this.c;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.x1) this.d).r(150L);
                zx zxVar = bxVar.b;
                Boolean bool = zxVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    zxVar.getMessagesController().m(this.b, zxVar.getMessagesController().Z1(Long.valueOf(zxVar.H)), 0, null, zxVar, false, runnable, new hf(6, runnable), null);
                    break;
                } else {
                    runnable.run();
                    break;
                }
            case 2:
                ProfileActivity.i0((ProfileActivity) this.c, (Context) this.d, this.b, (TL_payments.connectedBotStarRef) obj);
                break;
            default:
                rh.e4 e4Var = (rh.e4) this.c;
                org.telegram.messenger.wp wpVar = (org.telegram.messenger.wp) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < wpVar.t5) {
                    org.telegram.messenger.i3 G0 = wpVar.G0();
                    long j10 = this.b;
                    G0.b(j10, tL_premium_boostsStatus, new ko(e4Var, tL_premium_boostsStatus, j10, wpVar));
                    break;
                } else {
                    e4Var.c2.setLoading(false);
                    e4Var.t2(true);
                    break;
                }
                break;
        }
    }
}
