package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ri1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ ti1 a;

    public ri1(ti1 ti1Var) {
        this.a = ti1Var;
    }

    public final void a() {
        ti1 ti1Var = this.a;
        if (ti1Var.p0 != 17) {
            if (Build.VERSION.SDK_INT >= 23 && ti1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                ti1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    ti1Var.r(new e01(this, 24));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(ti1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", ti1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", ti1Var.U0);
        intent.putExtra("can_video_call", ti1Var.U0);
        intent.putExtra("account", ti1Var.a);
        try {
            ti1Var.b.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void b() {
        ti1 ti1Var = this.a;
        if (ti1Var.p0 == 17) {
            ti1Var.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            ti1Var.u0.b();
        }
    }
}
