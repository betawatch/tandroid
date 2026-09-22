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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        org.telegram.ui.Components.voip.l I0;
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
                u9 u9Var = (u9) this.b;
                CameraView cameraView = u9Var.c;
                if (cameraView != null && !u9Var.M && cameraView.getCameraSession() != null) {
                    u9Var.e.post(new mu0(this, 17));
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
                x10 x10Var = (x10) this.b;
                if (x10Var.M) {
                    x10Var.f.clear();
                    x10Var.n.clear();
                    x10Var.r.clear();
                    org.telegram.ui.Components.kl0 kl0Var = x10Var.d;
                    if (kl0Var != null) {
                        kl0Var.l();
                        break;
                    }
                }
                break;
            case 5:
                i60 i60Var = ((q30) this.b).b;
                i60Var.x.setAnimation(i60Var.J0);
                i60Var.L0 = false;
                break;
            case 6:
                try {
                    i60 i60Var2 = (i60) this.b;
                    a40 a40Var = i60Var2.a2;
                    if (a40Var != null && !a40Var.b && (I0 = i60.I0(i60Var2)) != null && I0.isAttachedToWindow() && (renderer = I0.getRenderer()) != null && (pVar = renderer.a) != null) {
                        i60.H3.postRunnable(new kw(17, this, pVar));
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
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
                            org.telegram.messenger.vl.t(((b80) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((b80) this.b).s, 16L);
                    Intro.setPage(((b80) this.b).x.H);
                    Intro.setDate((currentTimeMillis - r2.J) / 1000.0f);
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
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    launchActivity.Z0 = null;
                    break;
                }
                break;
            case 9:
                if0 if0Var = (if0) this.b;
                if (if0Var.h == this) {
                    if0Var.o();
                    AndroidUtilities.runOnUIThread(if0Var.h, 1000L);
                    break;
                }
                break;
            case 10:
                ((jj0) this.b).T.animate().alpha(1.0f).setDuration(230L);
                break;
            case 11:
                rj0 rj0Var = (rj0) this.b;
                String str = rj0Var.j0;
                if (str != null) {
                    rj0.Q(rj0Var, str);
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
                ((za1) this.b).b0.animate().alpha(1.0f).setDuration(230L);
                break;
            case 14:
                te1 te1Var = (te1) this.b;
                te1Var.F.setVisibility(0);
                te1Var.F.setAlpha(0.0f);
                te1Var.F.animate().alpha(1.0f).start();
                break;
            default:
                pj1 pj1Var = (pj1) this.b;
                MessageObject messageObject = pj1Var.n;
                if (messageObject != null && pj1Var.getParentActivity() != null && pj1Var.s != null) {
                    i10 = ((org.telegram.ui.ActionBar.n2) pj1Var).currentAccount;
                    MessagesController.getInstance(i10).sendTyping(messageObject.getDialogId(), 0L, 6, 0);
                    AndroidUtilities.runOnUIThread(pj1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
