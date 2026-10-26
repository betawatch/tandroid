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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                    y9Var.f.post(new zt0(this, 17));
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
                h10 h10Var = (h10) this.b;
                if (h10Var.M) {
                    h10Var.f.clear();
                    h10Var.n.clear();
                    h10Var.r.clear();
                    org.telegram.ui.Components.lm0 lm0Var = h10Var.d;
                    if (lm0Var != null) {
                        lm0Var.l();
                        break;
                    }
                }
                break;
            case 5:
                v50 v50Var = ((c30) this.b).b;
                v50Var.x.setAnimation(v50Var.J0);
                v50Var.L0 = false;
                break;
            case 6:
                try {
                    v50 v50Var2 = (v50) this.b;
                    m30 m30Var = v50Var2.a2;
                    if (m30Var != null && !m30Var.b && (I0 = v50.I0(v50Var2)) != null && I0.isAttachedToWindow() && (renderer = I0.getRenderer()) != null && (oVar = renderer.a) != null) {
                        v50.H3.postRunnable(new sz(9, this, oVar));
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 7:
                p70 p70Var = (p70) this.b;
                try {
                    int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false);
                    n70 n70Var = p70Var.I;
                    if (n70Var != null && p70Var.fragmentView != null && p70Var.O != x02) {
                        p70Var.O = x02;
                        n70Var.postRunnable(new org.telegram.ui.Components.h2(n70Var, x02, 18));
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 8:
                if (((n70) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n70 n70Var2 = (n70) this.b;
                    if (n70Var2.e.equals(n70Var2.b.eglGetCurrentContext())) {
                        n70 n70Var3 = (n70) this.b;
                        break;
                    }
                    n70 n70Var4 = (n70) this.b;
                    EGL10 egl10 = n70Var4.b;
                    EGLDisplay eGLDisplay = n70Var4.c;
                    EGLSurface eGLSurface = n70Var4.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, n70Var4.e)) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.vh.t(((n70) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((n70) this.b).s, 16L);
                    Intro.setPage(((n70) this.b).x.H);
                    Intro.setDate((currentTimeMillis - r3.J) / 1000.0f);
                    Intro.onDrawFrame(min);
                    n70 n70Var5 = (n70) this.b;
                    n70Var5.b.eglSwapBuffers(n70Var5.c, n70Var5.f);
                    n70 n70Var6 = (n70) this.b;
                    n70Var6.s = currentTimeMillis;
                    float f7 = 0.0f;
                    if (n70Var6.r == 0.0f) {
                        for (float f10 : ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f10 > f7) {
                                f7 = f10;
                            }
                        }
                        ((n70) this.b).r = f7;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    n70 n70Var7 = (n70) this.b;
                    n70Var7.postRunnable(n70Var7.w, Math.max(((long) (1000.0f / n70Var7.r)) - currentTimeMillis2, 0L));
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
                se0 se0Var = (se0) this.b;
                if (se0Var.h == this) {
                    se0Var.n();
                    AndroidUtilities.runOnUIThread(se0Var.h, 1000L);
                    break;
                }
                break;
            case 11:
                ((vi0) this.b).T.animate().alpha(1.0f).setDuration(230L);
                break;
            case 12:
                cj0 cj0Var = (cj0) this.b;
                String str = cj0Var.j0;
                if (str != null) {
                    cj0.Q(cj0Var, str);
                    break;
                }
                break;
            case 13:
                mv0 mv0Var = (mv0) this.b;
                y5 y5Var = mv0Var.y0;
                org.telegram.ui.Cells.h6 h6Var = mv0Var.b0;
                if (h6Var != null) {
                    EditTextBoldCursor editField = h6Var.getEditField();
                    if (!mv0Var.U && editField != null && mv0Var.T && !mv0Var.Y && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(y5Var);
                        AndroidUtilities.runOnUIThread(y5Var, 100L);
                        break;
                    }
                }
                break;
            case 14:
                ((w91) this.b).a0.animate().alpha(1.0f).setDuration(230L);
                break;
            case 15:
                pd1 pd1Var = (pd1) this.b;
                pd1Var.F.setVisibility(0);
                pd1Var.F.setAlpha(0.0f);
                pd1Var.F.animate().alpha(1.0f).start();
                break;
            default:
                ni1 ni1Var = (ni1) this.b;
                MessageObject messageObject = ni1Var.n;
                if (messageObject != null && ni1Var.getParentActivity() != null && ni1Var.s != null) {
                    i10 = ((org.telegram.ui.ActionBar.r2) ni1Var).currentAccount;
                    MessagesController.getInstance(i10).sendTyping(messageObject.getDialogId(), 0L, 6, 0);
                    AndroidUtilities.runOnUIThread(ni1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
