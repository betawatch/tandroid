package org.telegram.ui;

import android.view.WindowManager;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Intro;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class w5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0147, code lost:
    
        if (r2.f.equals(r2.b.eglGetCurrentSurface(12377)) == false) goto L69;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.Components.voip.l J0;
        org.telegram.ui.Components.voip.u renderer;
        org.telegram.ui.Components.voip.p pVar;
        int i10;
        switch (this.a) {
            case 0:
                BubbleActivity bubbleActivity = (BubbleActivity) this.b;
                if (bubbleActivity.Y == this) {
                    if (AndroidUtilities.needShowPasscode(true)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("lock app");
                        }
                        bubbleActivity.z();
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    bubbleActivity.Y = null;
                    break;
                }
                break;
            case 1:
                v9 v9Var = (v9) this.b;
                CameraView cameraView = v9Var.c;
                if (cameraView != null && !v9Var.N && cameraView.getCameraSession() != null) {
                    v9Var.e.post(new nu0(this, 17));
                    break;
                }
                break;
            case 2:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.d.Z();
                contactsActivity.l0 = false;
                break;
            case 3:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                if (externalActionActivity.w == this) {
                    if (AndroidUtilities.needShowPasscode(true)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("lock app");
                        }
                        externalActionActivity.i();
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    externalActionActivity.w = null;
                    break;
                }
                break;
            case 4:
                w10 w10Var = (w10) this.b;
                if (w10Var.M) {
                    w10Var.f.clear();
                    w10Var.n.clear();
                    w10Var.r.clear();
                    org.telegram.ui.Components.pm0 pm0Var = w10Var.d;
                    if (pm0Var != null) {
                        pm0Var.l();
                        break;
                    }
                }
                break;
            case 5:
                g60 g60Var = ((o30) this.b).b;
                g60Var.x.setAnimation(g60Var.J0);
                g60Var.L0 = false;
                break;
            case 6:
                try {
                    g60 g60Var2 = (g60) this.b;
                    y30 y30Var = g60Var2.a2;
                    if (y30Var != null && !y30Var.b && (J0 = g60.J0(g60Var2)) != null && J0.isAttachedToWindow() && (renderer = J0.getRenderer()) != null && (pVar = renderer.a) != null) {
                        g60.H3.postRunnable(new org.telegram.ui.Components.ea1(28, this, pVar));
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
                break;
            case 7:
                if (((b80) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    b80 b80Var = (b80) this.b;
                    if (b80Var.e.equals(b80Var.b.eglGetCurrentContext())) {
                        b80 b80Var2 = (b80) this.b;
                        break;
                    }
                    b80 b80Var3 = (b80) this.b;
                    EGL10 egl10 = b80Var3.b;
                    EGLDisplay eGLDisplay = b80Var3.c;
                    EGLSurface eGLSurface = b80Var3.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, b80Var3.e)) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.bi.v(((b80) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((b80) this.b).s, 16L);
                    Intro.setPage(((b80) this.b).x.H);
                    Intro.setDate((currentTimeMillis - r3.J) / 1000.0f);
                    Intro.onDrawFrame(min);
                    b80 b80Var4 = (b80) this.b;
                    b80Var4.b.eglSwapBuffers(b80Var4.c, b80Var4.f);
                    b80 b80Var5 = (b80) this.b;
                    b80Var5.s = currentTimeMillis;
                    float f7 = 0.0f;
                    if (b80Var5.r == 0.0f) {
                        for (float f10 : ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f10 > f7) {
                                f7 = f10;
                            }
                        }
                        ((b80) this.b).r = f7;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    b80 b80Var6 = (b80) this.b;
                    b80Var6.postRunnable(b80Var6.w, Math.max(((long) (1000.0f / b80Var6.r)) - currentTimeMillis2, 0L));
                    break;
                }
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                if (launchActivity.Z0 == this) {
                    if (AndroidUtilities.needShowPasscode(true)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("lock app");
                        }
                        launchActivity.G0(true, false, -1, -1, null);
                        try {
                            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    launchActivity.Z0 = null;
                    break;
                }
                break;
            case 9:
                hf0 hf0Var = (hf0) this.b;
                if (hf0Var.h == this) {
                    hf0Var.o();
                    AndroidUtilities.runOnUIThread(hf0Var.h, 1000L);
                    break;
                }
                break;
            case 10:
                ((lj0) this.b).T.animate().alpha(1.0f).setDuration(230L);
                break;
            case 11:
                sj0 sj0Var = (sj0) this.b;
                String str = sj0Var.j0;
                if (str != null) {
                    sj0.R(sj0Var, str);
                    break;
                }
                break;
            case 12:
                aw0 aw0Var = (aw0) this.b;
                w5 w5Var = aw0Var.y0;
                org.telegram.ui.Cells.d6 d6Var = aw0Var.b0;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!aw0Var.U && editField != null && aw0Var.T && !aw0Var.Y && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(w5Var);
                        AndroidUtilities.runOnUIThread(w5Var, 100L);
                        break;
                    }
                }
                break;
            case 13:
                ((bb1) this.b).b0.animate().alpha(1.0f).setDuration(230L);
                break;
            case 14:
                ue1 ue1Var = (ue1) this.b;
                ue1Var.F.setVisibility(0);
                ue1Var.F.setAlpha(0.0f);
                ue1Var.F.animate().alpha(1.0f).start();
                break;
            default:
                rj1 rj1Var = (rj1) this.b;
                MessageObject messageObject = rj1Var.n;
                if (messageObject != null && rj1Var.getParentActivity() != null && rj1Var.s != null) {
                    i10 = ((org.telegram.ui.ActionBar.n2) rj1Var).currentAccount;
                    MessagesController.getInstance(i10).sendTyping(messageObject.getDialogId(), 0L, 6, 0);
                    AndroidUtilities.runOnUIThread(rj1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
