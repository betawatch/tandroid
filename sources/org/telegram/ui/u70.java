package org.telegram.ui;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u70 implements Runnable {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ TLRPC.TL_messages_botApp e;
    public final /* synthetic */ AtomicBoolean f;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean w;

    public /* synthetic */ u70(LaunchActivity launchActivity, org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.a = launchActivity;
        this.b = f2Var;
        this.c = i7;
        this.d = user;
        this.e = tL_messages_botApp;
        this.f = atomicBoolean;
        this.h = str;
        this.n = z9;
        this.r = z10;
        this.s = z11;
        this.w = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String str = LaunchActivity.B1;
        org.telegram.ui.ActionBar.f2 f2Var = this.b;
        if (f2Var == null || !LaunchActivity.D1) {
            return;
        }
        LaunchActivity launchActivity = this.a;
        if (launchActivity.isFinishing() || launchActivity.isDestroyed()) {
            return;
        }
        TLRPC.User user = this.d;
        long j3 = user.id;
        TLRPC.TL_messages_botApp tL_messages_botApp = this.e;
        TLRPC.BotApp botApp = tL_messages_botApp.app;
        boolean z9 = this.f.get();
        int i7 = this.c;
        String str2 = this.h;
        boolean z10 = this.n;
        boolean z11 = this.r;
        hi.q4 b10 = hi.q4.b(i7, j3, j3, null, null, 3, 0, 0L, botApp, z9, str2, user, 0, z10, z11);
        if (launchActivity.O() == null || launchActivity.O().k(b10) == null) {
            org.telegram.messenger.b6.n(launchActivity.O, user.id);
            hi.a3 a3Var = new hi.a3(launchActivity, f2Var.getResourceProvider());
            hi.s2 s2Var = a3Var.D;
            if (s2Var != null) {
                s2Var.setWasOpenedByLinkIntent(this.s);
            }
            a3Var.B(!z10);
            if (z11) {
                a3Var.C(true, false, a3Var.f0);
            }
            a3Var.B0 = false;
            a3Var.l0 = launchActivity;
            a3Var.x(f2Var, b10);
            a3Var.show();
            if (tL_messages_botApp.inactive || this.w) {
                TLRPC.User a22 = org.telegram.messenger.qp.s1(a3Var.H).a2(Long.valueOf(a3Var.I));
                ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.ui.b0(a3Var.H).b.bots;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        tL_attachMenuBot = null;
                        break;
                    }
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                    i10++;
                    tL_attachMenuBot = tL_attachMenuBot2;
                    if (tL_attachMenuBot.bot_id == a3Var.I) {
                        break;
                    }
                }
                if (tL_attachMenuBot == null) {
                    return;
                }
                boolean z12 = tL_attachMenuBot.show_in_side_menu;
                org.telegram.messenger.g0.i3(new ha.b(4, a3Var, (z12 && tL_attachMenuBot.show_in_attach_menu) ? org.telegram.messenger.hd.a0(null, null, 2131753138, a22.first_name) : z12 ? org.telegram.messenger.hd.a0(null, null, 2131753137, a22.first_name) : org.telegram.messenger.hd.a0(null, null, 2131753139, a22.first_name)), 200L);
            }
        }
    }
}
