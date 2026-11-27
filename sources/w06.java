// default package

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w06 implements Runnable {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ e b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ TLRPC.TL_messages_botApp e;
    public final /* synthetic */ AtomicBoolean f;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean w;

    public /* synthetic */ w06(LaunchActivity launchActivity, e eVar, int i, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = launchActivity;
        this.b = eVar;
        this.c = i;
        this.d = user;
        this.e = tL_messages_botApp;
        this.f = atomicBoolean;
        this.h = str;
        this.n = z;
        this.r = z2;
        this.s = z3;
        this.w = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String str = LaunchActivity.C1;
        e eVar = this.b;
        if (eVar == null || !LaunchActivity.E1) {
            return;
        }
        LaunchActivity launchActivity = this.a;
        if (launchActivity.isFinishing() || launchActivity.isDestroyed()) {
            return;
        }
        TLRPC.User user = this.d;
        long j = user.id;
        TLRPC.TL_messages_botApp tL_messages_botApp = this.e;
        TLRPC.BotApp botApp = tL_messages_botApp.app;
        boolean z = this.f.get();
        int i = this.c;
        String str2 = this.h;
        boolean z2 = this.n;
        boolean z3 = this.r;
        gzc b = gzc.b(i, j, j, null, null, 3, 0, 0L, botApp, z, str2, user, 0, z2, z3);
        if (launchActivity.O() == null || launchActivity.O().l(b) == null) {
            vye.c(launchActivity.P, user.id);
            xw0 xw0Var = new xw0(launchActivity, eVar.getResourceProvider());
            pw0 pw0Var = xw0Var.E;
            if (pw0Var != null) {
                pw0Var.setWasOpenedByLinkIntent(this.s);
            }
            xw0Var.B(!z2);
            if (z3) {
                xw0Var.C(true, false, xw0Var.g0);
            }
            xw0Var.C0 = false;
            xw0Var.m0 = launchActivity;
            xw0Var.x(eVar, b);
            xw0Var.show();
            if (tL_messages_botApp.inactive || this.w) {
                TLRPC.User X1 = uc7.s1(xw0Var.I).X1(Long.valueOf(xw0Var.J));
                ArrayList<TLRPC.TL_attachMenuBot> arrayList = ls6.d0(xw0Var.I).b.bots;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        tL_attachMenuBot = null;
                        break;
                    }
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i2);
                    i2++;
                    tL_attachMenuBot = tL_attachMenuBot2;
                    if (tL_attachMenuBot.bot_id == xw0Var.J) {
                        break;
                    }
                }
                if (tL_attachMenuBot != null) {
                    hl.d3(new a30(xw0Var, tL_attachMenuBot.show_in_side_menu ? tL_attachMenuBot.show_in_attach_menu ? ob6.a0(null, null, 2131753131, X1.first_name) : ob6.a0(null, null, 2131753130, X1.first_name) : ob6.a0(null, null, 2131753132, X1.first_name), (byte) 22), 200L);
                }
            }
        }
    }
}
