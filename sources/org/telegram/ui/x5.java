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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class x5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x5(Object obj, int i10) {
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
                    u9Var.e.post(new fu0(this, 17));
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
                u10 u10Var = (u10) this.b;
                if (u10Var.M) {
                    u10Var.f.clear();
                    u10Var.n.clear();
                    u10Var.r.clear();
                    org.telegram.ui.Components.ll0 ll0Var = u10Var.d;
                    if (ll0Var != null) {
                        ll0Var.l();
                        break;
                    }
                }
                break;
            case 5:
                f60 f60Var = ((n30) this.b).b;
                f60Var.x.setAnimation(f60Var.J0);
                f60Var.L0 = false;
                break;
            case 6:
                try {
                    f60 f60Var2 = (f60) this.b;
                    x30 x30Var = f60Var2.a2;
                    if (x30Var != null && !x30Var.b && (I0 = f60.I0(f60Var2)) != null && I0.isAttachedToWindow() && (renderer = I0.getRenderer()) != null && (pVar = renderer.a) != null) {
                        f60.H3.postRunnable(new hw(17, this, pVar));
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 7:
                if (((y70) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    y70 y70Var = (y70) this.b;
                    if (y70Var.e.equals(y70Var.b.eglGetCurrentContext())) {
                        y70 y70Var2 = (y70) this.b;
                        break;
                    }
                    y70 y70Var3 = (y70) this.b;
                    EGL10 egl10 = y70Var3.b;
                    EGLDisplay eGLDisplay = y70Var3.c;
                    EGLSurface eGLSurface = y70Var3.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, y70Var3.e)) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.ul.t(((y70) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((y70) this.b).s, 16L);
                    Intro.setPage(((y70) this.b).x.H);
                    Intro.setDate((currentTimeMillis - r2.J) / 1000.0f);
                    Intro.onDrawFrame(min);
                    y70 y70Var4 = (y70) this.b;
                    y70Var4.b.eglSwapBuffers(y70Var4.c, y70Var4.f);
                    y70 y70Var5 = (y70) this.b;
                    y70Var5.s = currentTimeMillis;
                    float f7 = 0.0f;
                    if (y70Var5.r == 0.0f) {
                        for (float f10 : ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f10 > f7) {
                                f7 = f10;
                            }
                        }
                        ((y70) this.b).r = f7;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    y70 y70Var6 = (y70) this.b;
                    y70Var6.postRunnable(y70Var6.w, Math.max(((long) (1000.0f / y70Var6.r)) - currentTimeMillis2, 0L));
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
                df0 df0Var = (df0) this.b;
                if (df0Var.h == this) {
                    df0Var.o();
                    AndroidUtilities.runOnUIThread(df0Var.h, 1000L);
                    break;
                }
                break;
            case 10:
                ((ej0) this.b).T.animate().alpha(1.0f).setDuration(230L);
                break;
            case 11:
                lj0 lj0Var = (lj0) this.b;
                String str = lj0Var.j0;
                if (str != null) {
                    lj0.Q(lj0Var, str);
                    break;
                }
                break;
            case 12:
                tv0 tv0Var = (tv0) this.b;
                x5 x5Var = tv0Var.y0;
                org.telegram.ui.Cells.d6 d6Var = tv0Var.b0;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!tv0Var.U && editField != null && tv0Var.T && !tv0Var.Y && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(x5Var);
                        AndroidUtilities.runOnUIThread(x5Var, 100L);
                        break;
                    }
                }
                break;
            case 13:
                ((ra1) this.b).b0.animate().alpha(1.0f).setDuration(230L);
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
                    i10 = ((org.telegram.ui.ActionBar.n2) hj1Var).currentAccount;
                    MessagesController.getInstance(i10).sendTyping(messageObject.getDialogId(), 0L, 6, 0);
                    AndroidUtilities.runOnUIThread(hj1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
