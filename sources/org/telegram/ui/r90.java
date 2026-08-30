package org.telegram.ui;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r90 implements Runnable {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ TLRPC.TL_messages_botApp e;
    public final /* synthetic */ AtomicBoolean f;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean v;

    public /* synthetic */ r90(LaunchActivity launchActivity, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z4, boolean z10, boolean z11, boolean z12) {
        this.a = launchActivity;
        this.b = p2Var;
        this.c = i10;
        this.d = user;
        this.e = tL_messages_botApp;
        this.f = atomicBoolean;
        this.h = str;
        this.n = z4;
        this.r = z10;
        this.s = z11;
        this.v = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        Pattern pattern = LaunchActivity.y1;
        org.telegram.ui.ActionBar.p2 p2Var = this.b;
        if (p2Var == null || !LaunchActivity.z1) {
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
        boolean z4 = this.f.get();
        int i10 = this.c;
        String str = this.h;
        boolean z10 = this.n;
        boolean z11 = this.r;
        rh.z3 b10 = rh.z3.b(i10, j10, j10, null, null, 3, 0, 0L, botApp, z4, str, user, 0, z10, z11);
        if (launchActivity.P() == null || launchActivity.P().m(b10) == null) {
            SharedPrefsHelper.setWebViewConfirmShown(launchActivity.L, user.id, true);
            rh.q2 q2Var = new rh.q2(launchActivity, p2Var.getResourceProvider());
            rh.i2 i2Var = q2Var.x;
            if (i2Var != null) {
                i2Var.setWasOpenedByLinkIntent(this.s);
            }
            q2Var.w(!z10);
            if (z11) {
                q2Var.x(true, false, q2Var.b0);
            }
            q2Var.x0 = false;
            q2Var.h0 = launchActivity;
            q2Var.s(p2Var, b10);
            q2Var.show();
            if (tL_messages_botApp.inactive || this.v) {
                TLRPC.User user2 = MessagesController.getInstance(q2Var.D).getUser(Long.valueOf(q2Var.E));
                ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(q2Var.D).getAttachMenuBots().bots;
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
                    if (tL_attachMenuBot.bot_id == q2Var.E) {
                        break;
                    }
                }
                if (tL_attachMenuBot == null) {
                    return;
                }
                boolean z12 = tL_attachMenuBot.show_in_side_menu;
                AndroidUtilities.runOnUIThread(new ph.f6(13, q2Var, (z12 && tL_attachMenuBot.show_in_attach_menu) ? LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttachAndSide, user2.first_name) : z12 ? LocaleController.formatString(R.string.BotAttachMenuShortcatAddedSide, user2.first_name) : LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttach, user2.first_name)), 200L);
            }
        }
    }
}
