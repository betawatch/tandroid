package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yh1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ ai1 a;

    public yh1(ai1 ai1Var) {
        this.a = ai1Var;
    }

    public final void a() {
        ai1 ai1Var = this.a;
        if (ai1Var.m0 != 17) {
            if (Build.VERSION.SDK_INT >= 23 && ai1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                ai1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    ai1Var.r(new vy0(this, 26));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(ai1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", ai1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", ai1Var.R0);
        intent.putExtra("can_video_call", ai1Var.R0);
        intent.putExtra("account", ai1Var.a);
        try {
            ai1Var.b.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void b() {
        ai1 ai1Var = this.a;
        if (ai1Var.m0 == 17) {
            ai1Var.r0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            ai1Var.r0.b();
        }
    }
}
