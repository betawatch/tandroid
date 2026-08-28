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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v5(Object obj, int i9) {
        this.a = i9;
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
        org.telegram.ui.Components.voip.l H0;
        org.telegram.ui.Components.voip.t renderer;
        org.telegram.ui.Components.voip.o oVar;
        int i9;
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
                s9 s9Var = (s9) this.b;
                CameraView cameraView = s9Var.c;
                if (cameraView != null && !s9Var.I && cameraView.getCameraSession() != null) {
                    s9Var.e.post(new kt0(this, 17));
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
                f10 f10Var = (f10) this.b;
                if (f10Var.I) {
                    f10Var.f.clear();
                    f10Var.n.clear();
                    f10Var.r.clear();
                    org.telegram.ui.Components.vk0 vk0Var = f10Var.d;
                    if (vk0Var != null) {
                        vk0Var.l();
                        break;
                    }
                }
                break;
            case 5:
                o50 o50Var = ((v20) this.b).b;
                o50Var.x.setAnimation(o50Var.F0);
                o50Var.H0 = false;
                break;
            case 6:
                try {
                    o50 o50Var2 = (o50) this.b;
                    g30 g30Var = o50Var2.W1;
                    if (g30Var != null && !g30Var.b && (H0 = o50.H0(o50Var2)) != null && H0.isAttachedToWindow() && (renderer = H0.getRenderer()) != null && (oVar = renderer.a) != null) {
                        o50.D3.postRunnable(new org.telegram.ui.Components.p61(29, this, oVar));
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 7:
                if (((g70) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    g70 g70Var = (g70) this.b;
                    if (g70Var.e.equals(g70Var.b.eglGetCurrentContext())) {
                        g70 g70Var2 = (g70) this.b;
                        break;
                    }
                    g70 g70Var3 = (g70) this.b;
                    EGL10 egl10 = g70Var3.b;
                    EGLDisplay eGLDisplay = g70Var3.c;
                    EGLSurface eGLSurface = g70Var3.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, g70Var3.e)) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.ll.t(((g70) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((g70) this.b).s, 16L);
                    Intro.setPage(((g70) this.b).x.D);
                    Intro.setDate((currentTimeMillis - r2.F) / 1000.0f);
                    Intro.onDrawFrame(min);
                    g70 g70Var4 = (g70) this.b;
                    g70Var4.b.eglSwapBuffers(g70Var4.c, g70Var4.f);
                    g70 g70Var5 = (g70) this.b;
                    g70Var5.s = currentTimeMillis;
                    float f10 = 0.0f;
                    if (g70Var5.r == 0.0f) {
                        for (float f11 : ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f11 > f10) {
                                f10 = f11;
                            }
                        }
                        ((g70) this.b).r = f10;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    g70 g70Var6 = (g70) this.b;
                    g70Var6.postRunnable(g70Var6.w, Math.max(((long) (1000.0f / g70Var6.r)) - currentTimeMillis2, 0L));
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
                re0 re0Var = (re0) this.b;
                if (re0Var.h == this) {
                    re0Var.o();
                    AndroidUtilities.runOnUIThread(re0Var.h, 1000L);
                    break;
                }
                break;
            case 10:
                ((ti0) this.b).P.animate().alpha(1.0f).setDuration(230L);
                break;
            case 11:
                bj0 bj0Var = (bj0) this.b;
                String str = bj0Var.f0;
                if (str != null) {
                    bj0.P(bj0Var, str);
                    break;
                }
                break;
            case 12:
                xu0 xu0Var = (xu0) this.b;
                v5 v5Var = xu0Var.u0;
                org.telegram.ui.Cells.c6 c6Var = xu0Var.X;
                if (c6Var != null) {
                    EditTextBoldCursor editField = c6Var.getEditField();
                    if (!xu0Var.Q && editField != null && xu0Var.P && !xu0Var.U && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(v5Var);
                        AndroidUtilities.runOnUIThread(v5Var, 100L);
                        break;
                    }
                }
                break;
            case 13:
                ((s91) this.b).X.animate().alpha(1.0f).setDuration(230L);
                break;
            case 14:
                kd1 kd1Var = (kd1) this.b;
                kd1Var.B.setVisibility(0);
                kd1Var.B.setAlpha(0.0f);
                kd1Var.B.animate().alpha(1.0f).start();
                break;
            default:
                ii1 ii1Var = (ii1) this.b;
                MessageObject messageObject = ii1Var.n;
                if (messageObject != null && ii1Var.getParentActivity() != null && ii1Var.s != null) {
                    i9 = ((org.telegram.ui.ActionBar.o2) ii1Var).currentAccount;
                    MessagesController.getInstance(i9).sendTyping(messageObject.getDialogId(), 0L, 6, 0);
                    AndroidUtilities.runOnUIThread(ii1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
