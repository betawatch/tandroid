package org.telegram.ui;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class s70 implements Runnable {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ TLRPC.TL_messages_botApp e;
    public final /* synthetic */ AtomicBoolean f;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean w;

    public /* synthetic */ s70(LaunchActivity launchActivity, org.telegram.ui.ActionBar.e2 e2Var, int i7, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.a = launchActivity;
        this.b = e2Var;
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
        org.telegram.ui.ActionBar.e2 e2Var = this.b;
        if (e2Var == null || !LaunchActivity.E1) {
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
        ki.k4 b10 = ki.k4.b(i7, j3, j3, null, null, 3, 0, 0L, botApp, z10, str2, user, 0, z11, z12);
        if (launchActivity.N() == null || launchActivity.N().k(b10) == null) {
            org.telegram.messenger.b6.p(launchActivity.P, user.id);
            ki.x2 x2Var = new ki.x2(launchActivity, e2Var.getResourceProvider());
            ki.p2 p2Var = x2Var.E;
            if (p2Var != null) {
                p2Var.setWasOpenedByLinkIntent(this.s);
            }
            x2Var.B(!z11);
            if (z12) {
                x2Var.C(true, false, x2Var.g0);
            }
            x2Var.C0 = false;
            x2Var.m0 = launchActivity;
            x2Var.x(e2Var, b10);
            x2Var.show();
            if (tL_messages_botApp.inactive || this.w) {
                TLRPC.User a22 = org.telegram.messenger.np.s1(x2Var.I).a2(Long.valueOf(x2Var.J));
                ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.si.b0(x2Var.I).b.bots;
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
                    if (tL_attachMenuBot.bot_id == x2Var.J) {
                        break;
                    }
                }
                if (tL_attachMenuBot == null) {
                    return;
                }
                boolean z13 = tL_attachMenuBot.show_in_side_menu;
                org.telegram.messenger.g0.i3(new kg.t1(6, x2Var, (z13 && tL_attachMenuBot.show_in_attach_menu) ? org.telegram.messenger.hd.a0(null, null, 2131753138, a22.first_name) : z13 ? org.telegram.messenger.hd.a0(null, null, 2131753137, a22.first_name) : org.telegram.messenger.hd.a0(null, null, 2131753139, a22.first_name)), 200L);
            }
        }
    }
}
