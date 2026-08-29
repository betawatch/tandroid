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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                if (bubbleActivity.U == this) {
                    if (AndroidUtilities.needShowPasscode(true)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("lock app");
                        }
                        bubbleActivity.z();
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    bubbleActivity.U = null;
                    break;
                }
                break;
            case 1:
                r9 r9Var = (r9) this.b;
                CameraView cameraView = r9Var.c;
                if (cameraView != null && !r9Var.I && cameraView.getCameraSession() != null) {
                    r9Var.e.post(new it0(this, 17));
                    break;
                }
                break;
            case 2:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.d.Z();
                contactsActivity.h0 = false;
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
                h10 h10Var = (h10) this.b;
                if (h10Var.I) {
                    h10Var.f.clear();
                    h10Var.n.clear();
                    h10Var.r.clear();
                    org.telegram.ui.Components.il0 il0Var = h10Var.d;
                    if (il0Var != null) {
                        il0Var.l();
                        break;
                    }
                }
                break;
            case 5:
                r50 r50Var = ((z20) this.b).b;
                r50Var.x.setAnimation(r50Var.F0);
                r50Var.H0 = false;
                break;
            case 6:
                try {
                    r50 r50Var2 = (r50) this.b;
                    j30 j30Var = r50Var2.W1;
                    if (j30Var != null && !j30Var.b && (I0 = r50.I0(r50Var2)) != null && I0.isAttachedToWindow() && (renderer = I0.getRenderer()) != null && (pVar = renderer.a) != null) {
                        r50.D3.postRunnable(new org.telegram.ui.Components.voip.o(26, this, pVar));
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 7:
                if (((j70) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    j70 j70Var = (j70) this.b;
                    if (j70Var.e.equals(j70Var.b.eglGetCurrentContext())) {
                        j70 j70Var2 = (j70) this.b;
                        break;
                    }
                    j70 j70Var3 = (j70) this.b;
                    EGL10 egl10 = j70Var3.b;
                    EGLDisplay eGLDisplay = j70Var3.c;
                    EGLSurface eGLSurface = j70Var3.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, j70Var3.e)) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.x3.u(((j70) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((j70) this.b).s, 16L);
                    Intro.setPage(((j70) this.b).x.D);
                    Intro.setDate((currentTimeMillis - r2.F) / 1000.0f);
                    Intro.onDrawFrame(min);
                    j70 j70Var4 = (j70) this.b;
                    j70Var4.b.eglSwapBuffers(j70Var4.c, j70Var4.f);
                    j70 j70Var5 = (j70) this.b;
                    j70Var5.s = currentTimeMillis;
                    float f9 = 0.0f;
                    if (j70Var5.r == 0.0f) {
                        for (float f10 : ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f10 > f9) {
                                f9 = f10;
                            }
                        }
                        ((j70) this.b).r = f9;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    j70 j70Var6 = (j70) this.b;
                    j70Var6.postRunnable(j70Var6.w, Math.max(((long) (1000.0f / j70Var6.r)) - currentTimeMillis2, 0L));
                    break;
                }
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                if (launchActivity.V0 == this) {
                    if (AndroidUtilities.needShowPasscode(true)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("lock app");
                        }
                        launchActivity.G0(true, false, -1, -1, null);
                        try {
                            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    launchActivity.V0 = null;
                    break;
                }
                break;
            case 9:
                qe0 qe0Var = (qe0) this.b;
                if (qe0Var.h == this) {
                    qe0Var.o();
                    AndroidUtilities.runOnUIThread(qe0Var.h, 1000L);
                    break;
                }
                break;
            case 10:
                ((si0) this.b).P.animate().alpha(1.0f).setDuration(230L);
                break;
            case 11:
                zi0 zi0Var = (zi0) this.b;
                String str = zi0Var.f0;
                if (str != null) {
                    zi0.Q(zi0Var, str);
                    break;
                }
                break;
            case 12:
                vu0 vu0Var = (vu0) this.b;
                w5 w5Var = vu0Var.u0;
                org.telegram.ui.Cells.a6 a6Var = vu0Var.X;
                if (a6Var != null) {
                    EditTextBoldCursor editField = a6Var.getEditField();
                    if (!vu0Var.Q && editField != null && vu0Var.P && !vu0Var.U && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(w5Var);
                        AndroidUtilities.runOnUIThread(w5Var, 100L);
                        break;
                    }
                }
                break;
            case 13:
                ((t91) this.b).X.animate().alpha(1.0f).setDuration(230L);
                break;
            case 14:
                md1 md1Var = (md1) this.b;
                md1Var.B.setVisibility(0);
                md1Var.B.setAlpha(0.0f);
                md1Var.B.animate().alpha(1.0f).start();
                break;
            default:
                ji1 ji1Var = (ji1) this.b;
                MessageObject messageObject = ji1Var.n;
                if (messageObject != null && ji1Var.getParentActivity() != null && ji1Var.s != null) {
                    i10 = ((org.telegram.ui.ActionBar.o2) ji1Var).currentAccount;
                    MessagesController.getInstance(i10).sendTyping(messageObject.getDialogId(), 0L, 6, 0);
                    AndroidUtilities.runOnUIThread(ji1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
