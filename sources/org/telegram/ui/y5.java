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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class y5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y5(Object obj, int i10) {
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
                y9 y9Var = (y9) this.b;
                CameraView cameraView = y9Var.d;
                if (cameraView != null && !y9Var.N && cameraView.getCameraSession() != null) {
                    y9Var.f.post(new bu0(this, 17));
                    break;
                }
                break;
            case 2:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.b.Z();
                contactsActivity.f0 = false;
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
                j10 j10Var = (j10) this.b;
                if (j10Var.M) {
                    j10Var.f.clear();
                    j10Var.n.clear();
                    j10Var.r.clear();
                    org.telegram.ui.Components.mm0 mm0Var = j10Var.d;
                    if (mm0Var != null) {
                        mm0Var.l();
                        break;
                    }
                }
                break;
            case 5:
                x50 x50Var = ((e30) this.b).b;
                x50Var.x.setAnimation(x50Var.J0);
                x50Var.L0 = false;
                break;
            case 6:
                try {
                    x50 x50Var2 = (x50) this.b;
                    o30 o30Var = x50Var2.a2;
                    if (o30Var != null && !o30Var.b && (I0 = x50.I0(x50Var2)) != null && I0.isAttachedToWindow() && (renderer = I0.getRenderer()) != null && (oVar = renderer.a) != null) {
                        x50.H3.postRunnable(new kz(10, this, oVar));
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 7:
                r70 r70Var = (r70) this.b;
                try {
                    int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false);
                    p70 p70Var = r70Var.I;
                    if (p70Var != null && r70Var.fragmentView != null && r70Var.O != x02) {
                        r70Var.O = x02;
                        p70Var.postRunnable(new org.telegram.ui.Components.h2(p70Var, x02, 18));
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 8:
                if (((p70) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    p70 p70Var2 = (p70) this.b;
                    if (p70Var2.e.equals(p70Var2.b.eglGetCurrentContext())) {
                        p70 p70Var3 = (p70) this.b;
                        break;
                    }
                    p70 p70Var4 = (p70) this.b;
                    EGL10 egl10 = p70Var4.b;
                    EGLDisplay eGLDisplay = p70Var4.c;
                    EGLSurface eGLSurface = p70Var4.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, p70Var4.e)) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.wh.t(((p70) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((p70) this.b).s, 16L);
                    Intro.setPage(((p70) this.b).x.H);
                    Intro.setDate((currentTimeMillis - r3.J) / 1000.0f);
                    Intro.onDrawFrame(min);
                    p70 p70Var5 = (p70) this.b;
                    p70Var5.b.eglSwapBuffers(p70Var5.c, p70Var5.f);
                    p70 p70Var6 = (p70) this.b;
                    p70Var6.s = currentTimeMillis;
                    float f7 = 0.0f;
                    if (p70Var6.r == 0.0f) {
                        for (float f10 : ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f10 > f7) {
                                f7 = f10;
                            }
                        }
                        ((p70) this.b).r = f7;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    p70 p70Var7 = (p70) this.b;
                    p70Var7.postRunnable(p70Var7.w, Math.max(((long) (1000.0f / p70Var7.r)) - currentTimeMillis2, 0L));
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
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    launchActivity.a1 = null;
                    break;
                }
                break;
            case 10:
                ue0 ue0Var = (ue0) this.b;
                if (ue0Var.h == this) {
                    ue0Var.n();
                    AndroidUtilities.runOnUIThread(ue0Var.h, 1000L);
                    break;
                }
                break;
            case 11:
                ((xi0) this.b).T.animate().alpha(1.0f).setDuration(230L);
                break;
            case 12:
                ej0 ej0Var = (ej0) this.b;
                String str = ej0Var.j0;
                if (str != null) {
                    ej0.Q(ej0Var, str);
                    break;
                }
                break;
            case 13:
                ov0 ov0Var = (ov0) this.b;
                y5 y5Var = ov0Var.y0;
                org.telegram.ui.Cells.h6 h6Var = ov0Var.b0;
                if (h6Var != null) {
                    EditTextBoldCursor editField = h6Var.getEditField();
                    if (!ov0Var.U && editField != null && ov0Var.T && !ov0Var.Y && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(y5Var);
                        AndroidUtilities.runOnUIThread(y5Var, 100L);
                        break;
                    }
                }
                break;
            case 14:
                ((y91) this.b).a0.animate().alpha(1.0f).setDuration(230L);
                break;
            case 15:
                rd1 rd1Var = (rd1) this.b;
                rd1Var.F.setVisibility(0);
                rd1Var.F.setAlpha(0.0f);
                rd1Var.F.animate().alpha(1.0f).start();
                break;
            default:
                pi1 pi1Var = (pi1) this.b;
                MessageObject messageObject = pi1Var.n;
                if (messageObject != null && pi1Var.getParentActivity() != null && pi1Var.s != null) {
                    i10 = ((org.telegram.ui.ActionBar.r2) pi1Var).currentAccount;
                    MessagesController.getInstance(i10).sendTyping(messageObject.getDialogId(), 0L, 6, 0);
                    AndroidUtilities.runOnUIThread(pi1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
