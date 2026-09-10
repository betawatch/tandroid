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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                    u9Var.e.post(new mu0(this, 17));
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
                    org.telegram.ui.Components.ul0 ul0Var = z10Var.d;
                    if (ul0Var != null) {
                        ul0Var.l();
                        break;
                    }
                }
                break;
            case 5:
                j60 j60Var = ((r30) this.b).b;
                j60Var.x.setAnimation(j60Var.J0);
                j60Var.L0 = false;
                break;
            case 6:
                try {
                    j60 j60Var2 = (j60) this.b;
                    b40 b40Var = j60Var2.a2;
                    if (b40Var != null && !b40Var.b && (I0 = j60.I0(j60Var2)) != null && I0.isAttachedToWindow() && (renderer = I0.getRenderer()) != null && (oVar = renderer.a) != null) {
                        j60.H3.postRunnable(new uv(20, this, oVar));
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
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
                            org.telegram.messenger.em.s(((a80) this.b).b, new StringBuilder("eglMakeCurrent failed "));
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
                if0 if0Var = (if0) this.b;
                if (if0Var.h == this) {
                    if0Var.o();
                    AndroidUtilities.runOnUIThread(if0Var.h, 1000L);
                    break;
                }
                break;
            case 10:
                ((kj0) this.b).T.animate().alpha(1.0f).setDuration(230L);
                break;
            case 11:
                sj0 sj0Var = (sj0) this.b;
                String str = sj0Var.j0;
                if (str != null) {
                    sj0.Q(sj0Var, str);
                    break;
                }
                break;
            case 12:
                bw0 bw0Var = (bw0) this.b;
                x5 x5Var = bw0Var.y0;
                org.telegram.ui.Cells.e6 e6Var = bw0Var.b0;
                if (e6Var != null) {
                    EditTextBoldCursor editField = e6Var.getEditField();
                    if (!bw0Var.U && editField != null && bw0Var.T && !bw0Var.Y && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(x5Var);
                        AndroidUtilities.runOnUIThread(x5Var, 100L);
                        break;
                    }
                }
                break;
            case 13:
                ((fb1) this.b).b0.animate().alpha(1.0f).setDuration(230L);
                break;
            case 14:
                xe1 xe1Var = (xe1) this.b;
                xe1Var.F.setVisibility(0);
                xe1Var.F.setAlpha(0.0f);
                xe1Var.F.animate().alpha(1.0f).start();
                break;
            default:
                tj1 tj1Var = (tj1) this.b;
                MessageObject messageObject = tj1Var.n;
                if (messageObject != null && tj1Var.getParentActivity() != null && tj1Var.s != null) {
                    i10 = ((org.telegram.ui.ActionBar.p2) tj1Var).currentAccount;
                    MessagesController.getInstance(i10).sendTyping(messageObject.getDialogId(), 0L, 6, 0);
                    AndroidUtilities.runOnUIThread(tj1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
