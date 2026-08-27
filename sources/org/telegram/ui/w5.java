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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                t9 t9Var = (t9) this.b;
                CameraView cameraView = t9Var.c;
                if (cameraView != null && !t9Var.I && cameraView.getCameraSession() != null) {
                    t9Var.e.post(new lt0(this, 17));
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
                i10 i10Var = (i10) this.b;
                if (i10Var.I) {
                    i10Var.f.clear();
                    i10Var.n.clear();
                    i10Var.r.clear();
                    org.telegram.ui.Components.yk0 yk0Var = i10Var.d;
                    if (yk0Var != null) {
                        yk0Var.l();
                        break;
                    }
                }
                break;
            case 5:
                s50 s50Var = ((y20) this.b).b;
                s50Var.x.setAnimation(s50Var.F0);
                s50Var.H0 = false;
                break;
            case 6:
                try {
                    s50 s50Var2 = (s50) this.b;
                    j30 j30Var = s50Var2.W1;
                    if (j30Var != null && !j30Var.b && (I0 = s50.I0(s50Var2)) != null && I0.isAttachedToWindow() && (renderer = I0.getRenderer()) != null && (oVar = renderer.a) != null) {
                        s50.D3.postRunnable(new org.telegram.ui.Components.r61(29, this, oVar));
                        break;
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 7:
                if (((k70) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    k70 k70Var = (k70) this.b;
                    if (k70Var.e.equals(k70Var.b.eglGetCurrentContext())) {
                        k70 k70Var2 = (k70) this.b;
                        break;
                    }
                    k70 k70Var3 = (k70) this.b;
                    EGL10 egl10 = k70Var3.b;
                    EGLDisplay eGLDisplay = k70Var3.c;
                    EGLSurface eGLSurface = k70Var3.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, k70Var3.e)) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.rl.r(((k70) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((k70) this.b).s, 16L);
                    Intro.setPage(((k70) this.b).x.D);
                    Intro.setDate((currentTimeMillis - r2.F) / 1000.0f);
                    Intro.onDrawFrame(min);
                    k70 k70Var4 = (k70) this.b;
                    k70Var4.b.eglSwapBuffers(k70Var4.c, k70Var4.f);
                    k70 k70Var5 = (k70) this.b;
                    k70Var5.s = currentTimeMillis;
                    float f10 = 0.0f;
                    if (k70Var5.r == 0.0f) {
                        for (float f11 : ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f11 > f10) {
                                f10 = f11;
                            }
                        }
                        ((k70) this.b).r = f10;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    k70 k70Var6 = (k70) this.b;
                    k70Var6.postRunnable(k70Var6.w, Math.max(((long) (1000.0f / k70Var6.r)) - currentTimeMillis2, 0L));
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
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    launchActivity.V0 = null;
                    break;
                }
                break;
            case 9:
                ue0 ue0Var = (ue0) this.b;
                if (ue0Var.h == this) {
                    ue0Var.o();
                    AndroidUtilities.runOnUIThread(ue0Var.h, 1000L);
                    break;
                }
                break;
            case 10:
                ((vi0) this.b).P.animate().alpha(1.0f).setDuration(230L);
                break;
            case 11:
                dj0 dj0Var = (dj0) this.b;
                String str = dj0Var.f0;
                if (str != null) {
                    dj0.Q(dj0Var, str);
                    break;
                }
                break;
            case 12:
                yu0 yu0Var = (yu0) this.b;
                w5 w5Var = yu0Var.u0;
                org.telegram.ui.Cells.z5 z5Var = yu0Var.X;
                if (z5Var != null) {
                    EditTextBoldCursor editField = z5Var.getEditField();
                    if (!yu0Var.Q && editField != null && yu0Var.P && !yu0Var.U && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(w5Var);
                        AndroidUtilities.runOnUIThread(w5Var, 100L);
                        break;
                    }
                }
                break;
            case 13:
                ((q91) this.b).X.animate().alpha(1.0f).setDuration(230L);
                break;
            case 14:
                ld1 ld1Var = (ld1) this.b;
                ld1Var.B.setVisibility(0);
                ld1Var.B.setAlpha(0.0f);
                ld1Var.B.animate().alpha(1.0f).start();
                break;
            default:
                hi1 hi1Var = (hi1) this.b;
                MessageObject messageObject = hi1Var.n;
                if (messageObject != null && hi1Var.getParentActivity() != null && hi1Var.s != null) {
                    i10 = ((org.telegram.ui.ActionBar.n2) hi1Var).currentAccount;
                    MessagesController.getInstance(i10).sendTyping(messageObject.getDialogId(), 0L, 6, 0);
                    AndroidUtilities.runOnUIThread(hi1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
