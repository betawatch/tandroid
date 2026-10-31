package org.telegram.ui;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u80 implements Runnable {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ TLRPC.TL_messages_botApp e;
    public final /* synthetic */ AtomicBoolean f;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean w;

    public /* synthetic */ u80(LaunchActivity launchActivity, org.telegram.ui.ActionBar.k2 k2Var, int i10, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.a = launchActivity;
        this.b = k2Var;
        this.c = i10;
        this.d = user;
        this.e = tL_messages_botApp;
        this.f = atomicBoolean;
        this.h = str;
        this.n = z10;
        this.r = z11;
        this.s = z12;
        this.w = z13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        Pattern pattern = LaunchActivity.D1;
        org.telegram.ui.ActionBar.k2 k2Var = this.b;
        if (k2Var == null || !LaunchActivity.E1) {
            return;
        }
        LaunchActivity launchActivity = this.a;
        if (launchActivity.isFinishing() || launchActivity.isDestroyed()) {
            return;
        }
        TLRPC.User user = this.d;
        long j10 = user.id;
        TLRPC.TL_messages_botApp tL_messages_botApp = this.e;
        TLRPC.BotApp botApp = tL_messages_botApp.app;
        boolean z10 = this.f.get();
        int i10 = this.c;
        String str = this.h;
        boolean z11 = this.n;
        boolean z12 = this.r;
        xh.s3 b10 = xh.s3.b(i10, j10, j10, null, null, 3, 0, 0L, botApp, z10, str, user, 0, z11, z12);
        if (launchActivity.O() == null || launchActivity.O().m(b10) == null) {
            org.telegram.messenger.js.o(launchActivity.O, user.id);
            xh.m2 m2Var = new xh.m2(launchActivity, k2Var.getResourceProvider());
            xh.e2 e2Var = m2Var.D;
            if (e2Var != null) {
                e2Var.setWasOpenedByLinkIntent(this.s);
            }
            m2Var.B(!z11);
            if (z12) {
                m2Var.C(true, false, m2Var.f0);
            }
            m2Var.B0 = false;
            m2Var.l0 = launchActivity;
            m2Var.x(k2Var, b10);
            m2Var.show();
            if (tL_messages_botApp.inactive || this.w) {
                TLRPC.User Z1 = org.telegram.messenger.vp.r1(m2Var.H).Z1(Long.valueOf(m2Var.I));
                ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.ui.b0(m2Var.H).b.bots;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        tL_attachMenuBot = null;
                        break;
                    }
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                    i11++;
                    tL_attachMenuBot = tL_attachMenuBot2;
                    if (tL_attachMenuBot.bot_id == m2Var.I) {
                        break;
                    }
                }
                if (tL_attachMenuBot == null) {
                    return;
                }
                boolean z13 = tL_attachMenuBot.show_in_side_menu;
                org.telegram.messenger.i0.h3(new vh.d1(25, m2Var, (z13 && tL_attachMenuBot.show_in_attach_menu) ? org.telegram.messenger.cd.a0(null, null, 2131753138, Z1.first_name) : z13 ? org.telegram.messenger.cd.a0(null, null, 2131753137, Z1.first_name) : org.telegram.messenger.cd.a0(null, null, 2131753139, Z1.first_name)), 200L);
            }
        }
    }
}
