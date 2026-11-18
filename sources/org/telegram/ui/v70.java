package org.telegram.ui;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v70 implements Runnable {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ TLRPC.TL_messages_botApp e;
    public final /* synthetic */ AtomicBoolean f;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean w;

    public /* synthetic */ v70(LaunchActivity launchActivity, org.telegram.ui.ActionBar.h2 h2Var, int i7, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.a = launchActivity;
        this.b = h2Var;
        this.c = i7;
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
        String str = LaunchActivity.C1;
        org.telegram.ui.ActionBar.h2 h2Var = this.b;
        if (h2Var == null || !LaunchActivity.E1) {
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
        boolean z10 = this.f.get();
        int i7 = this.c;
        String str2 = this.h;
        boolean z11 = this.n;
        boolean z12 = this.r;
        ki.f4 b10 = ki.f4.b(i7, j3, j3, null, null, 3, 0, 0L, botApp, z10, str2, user, 0, z11, z12);
        if (launchActivity.N() == null || launchActivity.N().k(b10) == null) {
            org.telegram.messenger.c6.p(launchActivity.P, user.id);
            ki.t2 t2Var = new ki.t2(launchActivity, h2Var.getResourceProvider());
            ki.l2 l2Var = t2Var.E;
            if (l2Var != null) {
                l2Var.setWasOpenedByLinkIntent(this.s);
            }
            t2Var.B(!z11);
            if (z12) {
                t2Var.C(true, false, t2Var.g0);
            }
            t2Var.C0 = false;
            t2Var.m0 = launchActivity;
            t2Var.x(h2Var, b10);
            t2Var.show();
            if (tL_messages_botApp.inactive || this.w) {
                TLRPC.User c22 = org.telegram.messenger.mp.u1(t2Var.I).c2(Long.valueOf(t2Var.J));
                ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.ri.d0(t2Var.I).b.bots;
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
                    if (tL_attachMenuBot.bot_id == t2Var.J) {
                        break;
                    }
                }
                if (tL_attachMenuBot == null) {
                    return;
                }
                boolean z13 = tL_attachMenuBot.show_in_side_menu;
                org.telegram.messenger.g0.h3(new kg.h0(9, t2Var, (z13 && tL_attachMenuBot.show_in_attach_menu) ? org.telegram.messenger.gd.a0(null, null, 2131753136, c22.first_name) : z13 ? org.telegram.messenger.gd.a0(null, null, 2131753135, c22.first_name) : org.telegram.messenger.gd.a0(null, null, 2131753137, c22.first_name)), 200L);
            }
        }
    }
}
