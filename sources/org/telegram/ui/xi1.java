package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class xi1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ zi1 a;

    public xi1(zi1 zi1Var) {
        this.a = zi1Var;
    }

    public final void a() {
        zi1 zi1Var = this.a;
        if (zi1Var.p0 != 17) {
            if (Build.VERSION.SDK_INT >= 23 && zi1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                zi1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    zi1Var.r(new k01(this, 24));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(zi1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", zi1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", zi1Var.U0);
        intent.putExtra("can_video_call", zi1Var.U0);
        intent.putExtra("account", zi1Var.a);
        try {
            zi1Var.b.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void b() {
        zi1 zi1Var = this.a;
        if (zi1Var.p0 == 17) {
            zi1Var.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            zi1Var.u0.b();
        }
    }
}
