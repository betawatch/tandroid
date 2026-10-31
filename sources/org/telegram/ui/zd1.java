package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zd1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ be1 a;

    public zd1(be1 be1Var) {
        this.a = be1Var;
    }

    public final void a() {
        be1 be1Var = this.a;
        if (be1Var.p0 != 17) {
            if (be1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                be1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    be1Var.o(new wv0(this, 29));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(be1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", be1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", be1Var.U0);
        intent.putExtra("can_video_call", be1Var.U0);
        intent.putExtra("account", be1Var.a);
        try {
            be1Var.b.startService(intent);
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
    }

    public final void b() {
        be1 be1Var = this.a;
        if (be1Var.p0 == 17) {
            be1Var.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            be1Var.u0.b();
        }
    }
}
