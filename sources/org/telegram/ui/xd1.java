package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class xd1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ zd1 a;

    public xd1(zd1 zd1Var) {
        this.a = zd1Var;
    }

    public final void a() {
        zd1 zd1Var = this.a;
        if (zd1Var.p0 != 17) {
            if (zd1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                zd1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    zd1Var.n(new vv0(this, 29));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(zd1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", zd1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", zd1Var.U0);
        intent.putExtra("can_video_call", zd1Var.U0);
        intent.putExtra("account", zd1Var.a);
        try {
            zd1Var.b.startService(intent);
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
    }

    public final void b() {
        zd1 zd1Var = this.a;
        if (zd1Var.p0 == 17) {
            zd1Var.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            zd1Var.u0.b();
        }
    }
}
