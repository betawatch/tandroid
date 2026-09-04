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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        org.telegram.ui.Components.voip.t renderer;
        org.telegram.ui.Components.voip.o oVar;
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
                    u9Var.e.post(new lu0(this, 17));
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
                j60 j60Var = ((q30) this.b).b;
                j60Var.x.setAnimation(j60Var.J0);
                j60Var.L0 = false;
                break;
            case 6:
                try {
                    j60 j60Var2 = (j60) this.b;
                    a40 a40Var = j60Var2.a2;
                    if (a40Var != null && !a40Var.b && (I0 = j60.I0(j60Var2)) != null && I0.isAttachedToWindow() && (renderer = I0.getRenderer()) != null && (oVar = renderer.a) != null) {
                        j60.H3.postRunnable(new yt(23, this, oVar));
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
                            org.telegram.messenger.wl.s(((b80) this.b).b, new StringBuilder("eglMakeCurrent failed "));
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
                if0 if0Var = (if0) this.b;
                if (if0Var.h == this) {
                    if0Var.o();
                    AndroidUtilities.runOnUIThread(if0Var.h, 1000L);
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
                zv0 zv0Var = (zv0) this.b;
                w5 w5Var = zv0Var.y0;
                org.telegram.ui.Cells.c6 c6Var = zv0Var.b0;
                if (c6Var != null) {
                    EditTextBoldCursor editField = c6Var.getEditField();
                    if (!zv0Var.U && editField != null && zv0Var.T && !zv0Var.Y && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
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
                te1 te1Var = (te1) this.b;
                te1Var.F.setVisibility(0);
                te1Var.F.setAlpha(0.0f);
                te1Var.F.animate().alpha(1.0f).start();
                break;
            default:
                qj1 qj1Var = (qj1) this.b;
                MessageObject messageObject = qj1Var.n;
                if (messageObject != null && qj1Var.getParentActivity() != null && qj1Var.s != null) {
                    i10 = ((org.telegram.ui.ActionBar.n2) qj1Var).currentAccount;
                    MessagesController.getInstance(i10).sendTyping(messageObject.getDialogId(), 0L, 6, 0);
                    AndroidUtilities.runOnUIThread(qj1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
