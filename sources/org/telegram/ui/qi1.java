package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class qi1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ si1 a;

    public qi1(si1 si1Var) {
        this.a = si1Var;
    }

    public final void a() {
        si1 si1Var = this.a;
        if (si1Var.p0 != 17) {
            if (Build.VERSION.SDK_INT >= 23 && si1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                si1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    si1Var.r(new e01(this, 24));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(si1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", si1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", si1Var.U0);
        intent.putExtra("can_video_call", si1Var.U0);
        intent.putExtra("account", si1Var.a);
        try {
            si1Var.b.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void b() {
        si1 si1Var = this.a;
        if (si1Var.p0 == 17) {
            si1Var.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            si1Var.u0.b();
        }
    }
}
