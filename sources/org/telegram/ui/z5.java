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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class z5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z5(Object obj, int i10) {
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
                if (bubbleActivity.V == this) {
                    if (AndroidUtilities.needShowPasscode(true)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("lock app");
                        }
                        bubbleActivity.z();
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    bubbleActivity.V = null;
                    break;
                }
                break;
            case 1:
                v9 v9Var = (v9) this.b;
                CameraView cameraView = v9Var.c;
                if (cameraView != null && !v9Var.J && cameraView.getCameraSession() != null) {
                    v9Var.e.post(new rt0(this, 17));
                    break;
                }
                break;
            case 2:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.d.Z();
                contactsActivity.i0 = false;
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
                if (t10Var.J) {
                    t10Var.f.clear();
                    t10Var.n.clear();
                    t10Var.r.clear();
                    org.telegram.ui.Components.rl0 rl0Var = t10Var.d;
                    if (rl0Var != null) {
                        rl0Var.l();
                        break;
                    }
                }
                break;
            case 5:
                c60 c60Var = ((l30) this.b).b;
                c60Var.x.setAnimation(c60Var.G0);
                c60Var.I0 = false;
                break;
            case 6:
                try {
                    c60 c60Var2 = (c60) this.b;
                    v30 v30Var = c60Var2.X1;
                    if (v30Var != null && !v30Var.b && (I0 = c60.I0(c60Var2)) != null && I0.isAttachedToWindow() && (renderer = I0.getRenderer()) != null && (oVar = renderer.a) != null) {
                        c60.E3.postRunnable(new g00(5, this, oVar));
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 7:
                if (((t70) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    t70 t70Var = (t70) this.b;
                    if (t70Var.e.equals(t70Var.b.eglGetCurrentContext())) {
                        t70 t70Var2 = (t70) this.b;
                        break;
                    }
                    t70 t70Var3 = (t70) this.b;
                    EGL10 egl10 = t70Var3.b;
                    EGLDisplay eGLDisplay = t70Var3.c;
                    EGLSurface eGLSurface = t70Var3.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, t70Var3.e)) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.y3.u(((t70) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((t70) this.b).s, 16L);
                    Intro.setPage(((t70) this.b).x.E);
                    Intro.setDate((currentTimeMillis - r2.G) / 1000.0f);
                    Intro.onDrawFrame(min);
                    t70 t70Var4 = (t70) this.b;
                    t70Var4.b.eglSwapBuffers(t70Var4.c, t70Var4.f);
                    t70 t70Var5 = (t70) this.b;
                    t70Var5.s = currentTimeMillis;
                    float f10 = 0.0f;
                    if (t70Var5.r == 0.0f) {
                        for (float f11 : ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f11 > f10) {
                                f10 = f11;
                            }
                        }
                        ((t70) this.b).r = f10;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    t70 t70Var6 = (t70) this.b;
                    t70Var6.postRunnable(t70Var6.w, Math.max(((long) (1000.0f / t70Var6.r)) - currentTimeMillis2, 0L));
                    break;
                }
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                if (launchActivity.W0 == this) {
                    if (AndroidUtilities.needShowPasscode(true)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("lock app");
                        }
                        launchActivity.G0(true, false, -1, -1, null);
                        try {
                            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    launchActivity.W0 = null;
                    break;
                }
                break;
            case 9:
                af0 af0Var = (af0) this.b;
                if (af0Var.h == this) {
                    af0Var.o();
                    AndroidUtilities.runOnUIThread(af0Var.h, 1000L);
                    break;
                }
                break;
            case 10:
                ((aj0) this.b).Q.animate().alpha(1.0f).setDuration(230L);
                break;
            case 11:
                hj0 hj0Var = (hj0) this.b;
                String str = hj0Var.g0;
                if (str != null) {
                    hj0.Q(hj0Var, str);
                    break;
                }
                break;
            case 12:
                fv0 fv0Var = (fv0) this.b;
                z5 z5Var = fv0Var.v0;
                org.telegram.ui.Cells.c6 c6Var = fv0Var.Y;
                if (c6Var != null) {
                    EditTextBoldCursor editField = c6Var.getEditField();
                    if (!fv0Var.R && editField != null && fv0Var.Q && !fv0Var.V && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(z5Var);
                        AndroidUtilities.runOnUIThread(z5Var, 100L);
                        break;
                    }
                }
                break;
            case 13:
                ((ga1) this.b).Y.animate().alpha(1.0f).setDuration(230L);
                break;
            case 14:
                yd1 yd1Var = (yd1) this.b;
                yd1Var.C.setVisibility(0);
                yd1Var.C.setAlpha(0.0f);
                yd1Var.C.animate().alpha(1.0f).start();
                break;
            default:
                vi1 vi1Var = (vi1) this.b;
                MessageObject messageObject = vi1Var.n;
                if (messageObject != null && vi1Var.getParentActivity() != null && vi1Var.s != null) {
                    i10 = ((org.telegram.ui.ActionBar.p2) vi1Var).currentAccount;
                    MessagesController.getInstance(i10).sendTyping(messageObject.getDialogId(), 0L, 6, 0);
                    AndroidUtilities.runOnUIThread(vi1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
