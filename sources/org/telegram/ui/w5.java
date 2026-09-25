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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                    u9Var.e.post(new eu0(this, 17));
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
                t10 t10Var = (t10) this.b;
                if (t10Var.M) {
                    t10Var.f.clear();
                    t10Var.n.clear();
                    t10Var.r.clear();
                    org.telegram.ui.Components.vl0 vl0Var = t10Var.d;
                    if (vl0Var != null) {
                        vl0Var.l();
                        break;
                    }
                }
                break;
            case 5:
                d60 d60Var = ((l30) this.b).b;
                d60Var.x.setAnimation(d60Var.J0);
                d60Var.L0 = false;
                break;
            case 6:
                try {
                    d60 d60Var2 = (d60) this.b;
                    v30 v30Var = d60Var2.a2;
                    if (v30Var != null && !v30Var.b && (I0 = d60.I0(d60Var2)) != null && I0.isAttachedToWindow() && (renderer = I0.getRenderer()) != null && (pVar = renderer.a) != null) {
                        d60.H3.postRunnable(new tt(22, this, pVar));
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 7:
                if (((w70) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    w70 w70Var = (w70) this.b;
                    if (w70Var.e.equals(w70Var.b.eglGetCurrentContext())) {
                        w70 w70Var2 = (w70) this.b;
                        break;
                    }
                    w70 w70Var3 = (w70) this.b;
                    EGL10 egl10 = w70Var3.b;
                    EGLDisplay eGLDisplay = w70Var3.c;
                    EGLSurface eGLSurface = w70Var3.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, w70Var3.e)) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.ok.u(((w70) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((w70) this.b).s, 16L);
                    Intro.setPage(((w70) this.b).x.H);
                    Intro.setDate((currentTimeMillis - r2.J) / 1000.0f);
                    Intro.onDrawFrame(min);
                    w70 w70Var4 = (w70) this.b;
                    w70Var4.b.eglSwapBuffers(w70Var4.c, w70Var4.f);
                    w70 w70Var5 = (w70) this.b;
                    w70Var5.s = currentTimeMillis;
                    float f7 = 0.0f;
                    if (w70Var5.r == 0.0f) {
                        for (float f10 : ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f10 > f7) {
                                f7 = f10;
                            }
                        }
                        ((w70) this.b).r = f7;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    w70 w70Var6 = (w70) this.b;
                    w70Var6.postRunnable(w70Var6.w, Math.max(((long) (1000.0f / w70Var6.r)) - currentTimeMillis2, 0L));
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
                cf0 cf0Var = (cf0) this.b;
                if (cf0Var.h == this) {
                    cf0Var.o();
                    AndroidUtilities.runOnUIThread(cf0Var.h, 1000L);
                    break;
                }
                break;
            case 10:
                ((dj0) this.b).T.animate().alpha(1.0f).setDuration(230L);
                break;
            case 11:
                kj0 kj0Var = (kj0) this.b;
                String str = kj0Var.j0;
                if (str != null) {
                    kj0.Q(kj0Var, str);
                    break;
                }
                break;
            case 12:
                rv0 rv0Var = (rv0) this.b;
                w5 w5Var = rv0Var.y0;
                org.telegram.ui.Cells.d6 d6Var = rv0Var.b0;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!rv0Var.U && editField != null && rv0Var.T && !rv0Var.Y && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(w5Var);
                        AndroidUtilities.runOnUIThread(w5Var, 100L);
                        break;
                    }
                }
                break;
            case 13:
                ((sa1) this.b).b0.animate().alpha(1.0f).setDuration(230L);
                break;
            case 14:
                le1 le1Var = (le1) this.b;
                le1Var.F.setVisibility(0);
                le1Var.F.setAlpha(0.0f);
                le1Var.F.animate().alpha(1.0f).start();
                break;
            default:
                hj1 hj1Var = (hj1) this.b;
                MessageObject messageObject = hj1Var.n;
                if (messageObject != null && hj1Var.getParentActivity() != null && hj1Var.s != null) {
                    i10 = ((org.telegram.ui.ActionBar.m2) hj1Var).currentAccount;
                    MessagesController.getInstance(i10).sendTyping(messageObject.getDialogId(), 0L, 6, 0);
                    AndroidUtilities.runOnUIThread(hj1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
