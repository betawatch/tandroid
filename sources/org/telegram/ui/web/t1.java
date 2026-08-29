package org.telegram.ui.web;

import java.io.File;
import lh.e6;
import m.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ho;
import ph.m3;
import ph.o2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w1 w1Var = (w1) this.b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += w1.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += w1.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                AndroidUtilities.runOnUIThread(new ho(w1Var, length, file3.exists() ? w1.Z(file3, Boolean.TRUE) : 0L, 1));
                break;
            case 1:
                ((boolean[]) this.b)[0] = true;
                break;
            case 2:
                ((ph.d0) this.b).invalidateSelf();
                break;
            case 3:
                ((ph.e0) this.b).invalidateSelf();
                break;
            case 4:
                ((ph.g0) this.b).d();
                break;
            case 5:
                ((ph.r0) this.b).c();
                break;
            case 6:
                ((ph.r0) this.b).c();
                break;
            case 7:
                ((ph.s0) this.b).a();
                break;
            case 8:
                ((ph.t0) this.b).a();
                break;
            case 9:
                ((o2) this.b).invalidate();
                break;
            case 10:
                ((AnimationNotificationsLocker) this.b).unlock();
                break;
            case 11:
                m3 m3Var = (m3) this.b;
                m3Var.M = m3Var.r;
                break;
            case 12:
                ((org.telegram.ui.Components.n) this.b).k();
                break;
            case 13:
                e6 e6Var = ((rf.z0) this.b).y;
                if (e6Var != null) {
                    e6Var.p(3, true);
                    break;
                }
                break;
            case 14:
                sf.d dVar = (sf.d) this.b;
                dVar.c.U2.N(true);
                dVar.V(true);
                break;
            case 15:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.b).link);
                tc.a0(LaunchActivity.R()).k(false).j();
                break;
            case 16:
                sf.f0 f0Var = (sf.f0) this.b;
                k51 k51Var = f0Var.Z;
                if (k51Var != null) {
                    k51Var.N(true);
                }
                f0Var.T(true);
                break;
            case 17:
                sf.l0 l0Var = (sf.l0) ((o1.a) this.b).b;
                l0Var.c.U2.N(true);
                l0Var.b0();
                break;
            case 18:
                sf.n0 n0Var = (sf.n0) this.b;
                n0Var.c.U2.N(true);
                n0Var.V(true);
                break;
            case 19:
                sf.x0 x0Var = (sf.x0) this.b;
                x0Var.a.U2.N(true);
                x0Var.Y(true);
                break;
            case 20:
                ((eg.d1) this.b).run(Boolean.FALSE);
                break;
            case 21:
                NotificationCenter.getInstance(((sf.s1) this.b).a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            case 22:
                e3 e3Var = ((g3) this.b).b;
                e3Var.requestFocus();
                AndroidUtilities.showKeyboard(e3Var);
                break;
            case 23:
                AndroidUtilities.showKeyboard(((th.v) this.b).a0.b);
                break;
            case 24:
                ((th.b0) this.b).invalidate();
                break;
            case 25:
                s3 s3Var = (s3) this.b;
                s3Var.c = null;
                s3Var.d = null;
                s3Var.e = null;
                s3Var.f = null;
                s3Var.e(null);
                break;
            case 26:
                ((th.u1) this.b).invalidateSelf();
                break;
            case 27:
                ((th.b2) this.b).c();
                break;
            case 28:
                ((vg.b) this.b).invalidate();
                break;
            default:
                wg.c cVar = (wg.c) this.b;
                GroupCallMessage groupCallMessage = cVar.D;
                if (groupCallMessage != null) {
                    cVar.a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.b.a(cVar.D.isSendError(), true);
                    break;
                }
                break;
        }
    }
}
