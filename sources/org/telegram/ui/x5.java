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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                w9 w9Var = (w9) this.b;
                CameraView cameraView = w9Var.c;
                if (cameraView != null && !w9Var.M && cameraView.getCameraSession() != null) {
                    w9Var.e.post(new hu0(this, 17));
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
                    org.telegram.ui.Components.yl0 yl0Var = x10Var.d;
                    if (yl0Var != null) {
                        yl0Var.l();
                        break;
                    }
                }
                break;
            case 5:
                h60 h60Var = ((q30) this.b).b;
                h60Var.x.setAnimation(h60Var.J0);
                h60Var.L0 = false;
                break;
            case 6:
                try {
                    h60 h60Var2 = (h60) this.b;
                    a40 a40Var = h60Var2.a2;
                    if (a40Var != null && !a40Var.b && (I0 = h60.I0(h60Var2)) != null && I0.isAttachedToWindow() && (renderer = I0.getRenderer()) != null && (pVar = renderer.a) != null) {
                        h60.H3.postRunnable(new cu(20, this, pVar));
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
                break;
            case 7:
                if (((a80) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    a80 a80Var = (a80) this.b;
                    if (a80Var.e.equals(a80Var.b.eglGetCurrentContext())) {
                        a80 a80Var2 = (a80) this.b;
                        break;
                    }
                    a80 a80Var3 = (a80) this.b;
                    EGL10 egl10 = a80Var3.b;
                    EGLDisplay eGLDisplay = a80Var3.c;
                    EGLSurface eGLSurface = a80Var3.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, a80Var3.e)) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.ok.u(((a80) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((a80) this.b).s, 16L);
                    Intro.setPage(((a80) this.b).x.H);
                    Intro.setDate((currentTimeMillis - r2.J) / 1000.0f);
                    Intro.onDrawFrame(min);
                    a80 a80Var4 = (a80) this.b;
                    a80Var4.b.eglSwapBuffers(a80Var4.c, a80Var4.f);
                    a80 a80Var5 = (a80) this.b;
                    a80Var5.s = currentTimeMillis;
                    float f7 = 0.0f;
                    if (a80Var5.r == 0.0f) {
                        for (float f10 : ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f10 > f7) {
                                f7 = f10;
                            }
                        }
                        ((a80) this.b).r = f7;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    a80 a80Var6 = (a80) this.b;
                    a80Var6.postRunnable(a80Var6.w, Math.max(((long) (1000.0f / a80Var6.r)) - currentTimeMillis2, 0L));
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
                gf0 gf0Var = (gf0) this.b;
                if (gf0Var.h == this) {
                    gf0Var.o();
                    AndroidUtilities.runOnUIThread(gf0Var.h, 1000L);
                    break;
                }
                break;
            case 10:
                ((hj0) this.b).T.animate().alpha(1.0f).setDuration(230L);
                break;
            case 11:
                oj0 oj0Var = (oj0) this.b;
                String str = oj0Var.j0;
                if (str != null) {
                    oj0.O(oj0Var, str);
                    break;
                }
                break;
            case 12:
                uv0 uv0Var = (uv0) this.b;
                x5 x5Var = uv0Var.y0;
                org.telegram.ui.Cells.d6 d6Var = uv0Var.b0;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!uv0Var.U && editField != null && uv0Var.T && !uv0Var.Y && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(x5Var);
                        AndroidUtilities.runOnUIThread(x5Var, 100L);
                        break;
                    }
                }
                break;
            case 13:
                ((va1) this.b).a0.animate().alpha(1.0f).setDuration(230L);
                break;
            case 14:
                ne1 ne1Var = (ne1) this.b;
                ne1Var.F.setVisibility(0);
                ne1Var.F.setAlpha(0.0f);
                ne1Var.F.animate().alpha(1.0f).start();
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
