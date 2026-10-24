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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                CameraView cameraView = w9Var.d;
                if (cameraView != null && !w9Var.N && cameraView.getCameraSession() != null) {
                    w9Var.f.post(new vt0(this, 17));
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
                i10 i10Var = (i10) this.b;
                if (i10Var.M) {
                    i10Var.f.clear();
                    i10Var.n.clear();
                    i10Var.r.clear();
                    org.telegram.ui.Components.lm0 lm0Var = i10Var.d;
                    if (lm0Var != null) {
                        lm0Var.l();
                        break;
                    }
                }
                break;
            case 5:
                u50 u50Var = ((a30) this.b).b;
                u50Var.x.setAnimation(u50Var.J0);
                u50Var.L0 = false;
                break;
            case 6:
                try {
                    u50 u50Var2 = (u50) this.b;
                    k30 k30Var = u50Var2.a2;
                    if (k30Var != null && !k30Var.b && (I0 = u50.I0(u50Var2)) != null && I0.isAttachedToWindow() && (renderer = I0.getRenderer()) != null && (oVar = renderer.a) != null) {
                        u50.H3.postRunnable(new ot(22, this, oVar));
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 7:
                n70 n70Var = (n70) this.b;
                try {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
                    l70 l70Var = n70Var.I;
                    if (l70Var != null && n70Var.fragmentView != null && n70Var.O != x02) {
                        n70Var.O = x02;
                        l70Var.postRunnable(new org.telegram.ui.Components.d2(l70Var, x02, 19));
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
                break;
            case 8:
                if (((l70) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    l70 l70Var2 = (l70) this.b;
                    if (l70Var2.e.equals(l70Var2.b.eglGetCurrentContext())) {
                        l70 l70Var3 = (l70) this.b;
                        break;
                    }
                    l70 l70Var4 = (l70) this.b;
                    EGL10 egl10 = l70Var4.b;
                    EGLDisplay eGLDisplay = l70Var4.c;
                    EGLSurface eGLSurface = l70Var4.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, l70Var4.e)) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.sl.v(((l70) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((l70) this.b).s, 16L);
                    Intro.setPage(((l70) this.b).x.H);
                    Intro.setDate((currentTimeMillis - r3.J) / 1000.0f);
                    Intro.onDrawFrame(min);
                    l70 l70Var5 = (l70) this.b;
                    l70Var5.b.eglSwapBuffers(l70Var5.c, l70Var5.f);
                    l70 l70Var6 = (l70) this.b;
                    l70Var6.s = currentTimeMillis;
                    float f7 = 0.0f;
                    if (l70Var6.r == 0.0f) {
                        for (float f10 : ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f10 > f7) {
                                f7 = f10;
                            }
                        }
                        ((l70) this.b).r = f7;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    l70 l70Var7 = (l70) this.b;
                    l70Var7.postRunnable(l70Var7.w, Math.max(((long) (1000.0f / l70Var7.r)) - currentTimeMillis2, 0L));
                    break;
                }
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                if (launchActivity.a1 == this) {
                    if (AndroidUtilities.needShowPasscode(true)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("lock app");
                        }
                        launchActivity.L0(true, false, -1, -1, null);
                        try {
                            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    launchActivity.a1 = null;
                    break;
                }
                break;
            case 10:
                ve0 ve0Var = (ve0) this.b;
                if (ve0Var.h == this) {
                    ve0Var.n();
                    AndroidUtilities.runOnUIThread(ve0Var.h, 1000L);
                    break;
                }
                break;
            case 11:
                ((yi0) this.b).T.animate().alpha(1.0f).setDuration(230L);
                break;
            case 12:
                fj0 fj0Var = (fj0) this.b;
                String str = fj0Var.j0;
                if (str != null) {
                    fj0.Q(fj0Var, str);
                    break;
                }
                break;
            case 13:
                iv0 iv0Var = (iv0) this.b;
                z5 z5Var = iv0Var.y0;
                org.telegram.ui.Cells.d6 d6Var = iv0Var.b0;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!iv0Var.U && editField != null && iv0Var.T && !iv0Var.Y && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(z5Var);
                        AndroidUtilities.runOnUIThread(z5Var, 100L);
                        break;
                    }
                }
                break;
            case 14:
                ((u91) this.b).b0.animate().alpha(1.0f).setDuration(230L);
                break;
            case 15:
                md1 md1Var = (md1) this.b;
                md1Var.F.setVisibility(0);
                md1Var.F.setAlpha(0.0f);
                md1Var.F.animate().alpha(1.0f).start();
                break;
            default:
                ki1 ki1Var = (ki1) this.b;
                MessageObject messageObject = ki1Var.n;
                if (messageObject != null && ki1Var.getParentActivity() != null && ki1Var.s != null) {
                    i10 = ((org.telegram.ui.ActionBar.o2) ki1Var).currentAccount;
                    MessagesController.getInstance(i10).sendTyping(messageObject.getDialogId(), 0L, 6, 0);
                    AndroidUtilities.runOnUIThread(ki1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
