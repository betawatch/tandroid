package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xb1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ zb1 a;

    public xb1(zb1 zb1Var) {
        this.a = zb1Var;
    }

    public final void a() {
        zb1 zb1Var = this.a;
        if (zb1Var.q0 != 17) {
            if (zb1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                zb1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    zb1Var.n(new pu0(this, 26));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(zb1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", zb1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", zb1Var.V0);
        intent.putExtra("can_video_call", zb1Var.V0);
        intent.putExtra("account", zb1Var.a);
        try {
            zb1Var.b.startService(intent);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    public final void b() {
        zb1 zb1Var = this.a;
        if (zb1Var.q0 == 17) {
            zb1Var.v0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            zb1Var.v0.b();
        }
    }
}
