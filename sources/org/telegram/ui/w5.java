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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                w9 w9Var = (w9) this.b;
                CameraView cameraView = w9Var.c;
                if (cameraView != null && !w9Var.M && cameraView.getCameraSession() != null) {
                    w9Var.e.post(new ou0(this, 17));
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
                z10 z10Var = (z10) this.b;
                if (z10Var.M) {
                    z10Var.f.clear();
                    z10Var.n.clear();
                    z10Var.r.clear();
                    org.telegram.ui.Components.ll0 ll0Var = z10Var.d;
                    if (ll0Var != null) {
                        ll0Var.l();
                        break;
                    }
                }
                break;
            case 5:
                k60 k60Var = ((s30) this.b).b;
                k60Var.x.setAnimation(k60Var.J0);
                k60Var.L0 = false;
                break;
            case 6:
                try {
                    k60 k60Var2 = (k60) this.b;
                    c40 c40Var = k60Var2.a2;
                    if (c40Var != null && !c40Var.b && (I0 = k60.I0(k60Var2)) != null && I0.isAttachedToWindow() && (renderer = I0.getRenderer()) != null && (pVar = renderer.a) != null) {
                        k60.H3.postRunnable(new mw(17, this, pVar));
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 7:
                if (((d80) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    d80 d80Var = (d80) this.b;
                    if (d80Var.e.equals(d80Var.b.eglGetCurrentContext())) {
                        d80 d80Var2 = (d80) this.b;
                        break;
                    }
                    d80 d80Var3 = (d80) this.b;
                    EGL10 egl10 = d80Var3.b;
                    EGLDisplay eGLDisplay = d80Var3.c;
                    EGLSurface eGLSurface = d80Var3.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, d80Var3.e)) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.wl.s(((d80) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((d80) this.b).s, 16L);
                    Intro.setPage(((d80) this.b).x.H);
                    Intro.setDate((currentTimeMillis - r2.J) / 1000.0f);
                    Intro.onDrawFrame(min);
                    d80 d80Var4 = (d80) this.b;
                    d80Var4.b.eglSwapBuffers(d80Var4.c, d80Var4.f);
                    d80 d80Var5 = (d80) this.b;
                    d80Var5.s = currentTimeMillis;
                    float f7 = 0.0f;
                    if (d80Var5.r == 0.0f) {
                        for (float f10 : ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f10 > f7) {
                                f7 = f10;
                            }
                        }
                        ((d80) this.b).r = f7;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    d80 d80Var6 = (d80) this.b;
                    d80Var6.postRunnable(d80Var6.w, Math.max(((long) (1000.0f / d80Var6.r)) - currentTimeMillis2, 0L));
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
                kf0 kf0Var = (kf0) this.b;
                if (kf0Var.h == this) {
                    kf0Var.o();
                    AndroidUtilities.runOnUIThread(kf0Var.h, 1000L);
                    break;
                }
                break;
            case 10:
                ((lj0) this.b).T.animate().alpha(1.0f).setDuration(230L);
                break;
            case 11:
                tj0 tj0Var = (tj0) this.b;
                String str = tj0Var.j0;
                if (str != null) {
                    tj0.Q(tj0Var, str);
                    break;
                }
                break;
            case 12:
                cw0 cw0Var = (cw0) this.b;
                w5 w5Var = cw0Var.y0;
                org.telegram.ui.Cells.c6 c6Var = cw0Var.b0;
                if (c6Var != null) {
                    EditTextBoldCursor editField = c6Var.getEditField();
                    if (!cw0Var.U && editField != null && cw0Var.T && !cw0Var.Y && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(w5Var);
                        AndroidUtilities.runOnUIThread(w5Var, 100L);
                        break;
                    }
                }
                break;
            case 13:
                ((ab1) this.b).b0.animate().alpha(1.0f).setDuration(230L);
                break;
            case 14:
                ue1 ue1Var = (ue1) this.b;
                ue1Var.F.setVisibility(0);
                ue1Var.F.setAlpha(0.0f);
                ue1Var.F.animate().alpha(1.0f).start();
                break;
            default:
                oj1 oj1Var = (oj1) this.b;
                MessageObject messageObject = oj1Var.n;
                if (messageObject != null && oj1Var.getParentActivity() != null && oj1Var.s != null) {
                    i10 = ((org.telegram.ui.ActionBar.o2) oj1Var).currentAccount;
                    MessagesController.getInstance(i10).sendTyping(messageObject.getDialogId(), 0L, 6, 0);
                    AndroidUtilities.runOnUIThread(oj1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
