package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class si1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ ui1 a;

    public si1(ui1 ui1Var) {
        this.a = ui1Var;
    }

    public final void a() {
        ui1 ui1Var = this.a;
        if (ui1Var.p0 != 17) {
            if (Build.VERSION.SDK_INT >= 23 && ui1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                ui1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    ui1Var.r(new f01(this, 24));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(ui1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", ui1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", ui1Var.U0);
        intent.putExtra("can_video_call", ui1Var.U0);
        intent.putExtra("account", ui1Var.a);
        try {
            ui1Var.b.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void b() {
        ui1 ui1Var = this.a;
        if (ui1Var.p0 == 17) {
            ui1Var.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            ui1Var.u0.b();
        }
    }
}
