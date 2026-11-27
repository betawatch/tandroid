// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Log;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.WeakHashMap;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class zz3 implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ zz3() {
        this.a = (byte) 25;
    }

    private final void a() {
        File file;
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        long j;
        MediaController z = MediaController.z();
        so6 so6Var = (so6) this.b;
        r47 r47Var = so6Var.a;
        oec oecVar = so6Var.b;
        if (r47Var == null || oecVar == null) {
            return;
        }
        String str2 = oecVar.o;
        long j2 = oecVar.p;
        long j3 = oecVar.a;
        long j4 = oecVar.c;
        long j5 = oecVar.b;
        int i5 = oecVar.k;
        int i6 = oecVar.l;
        int i7 = oecVar.g;
        int i8 = oecVar.h;
        int i9 = oecVar.i;
        int i10 = oecVar.n;
        int i11 = oecVar.m;
        int i12 = oecVar.j;
        boolean z2 = wf3.B(r47.B0(r47Var.k)) || oecVar.U;
        File file2 = new File(r47Var.k.attachPath);
        if (file2.exists()) {
            file2.delete();
        }
        if (f11.a) {
            file = file2;
            StringBuilder sb = new StringBuilder("begin convert ");
            sb.append(str2);
            sb.append(" startTime = ");
            sb.append(j3);
            sb.append(" avatarStartTime = ");
            sb.append(j4);
            sb.append(" endTime ");
            sb.append(j5);
            sb.append(" rWidth = ");
            sb.append(i5);
            sb.append(" rHeight = ");
            sb.append(i6);
            sb.append(" rotation = ");
            sb.append(i7);
            sb.append(" oWidth = ");
            sb.append(i8);
            sb.append(" oHeight = ");
            sb.append(i9);
            sb.append(" framerate = ");
            sb.append(i10);
            sb.append(" bitrate = ");
            i = i11;
            sb.append(i);
            str = str2;
            sb.append(" originalBitrate = ");
            i2 = i12;
            sb.append(i2);
            cc4.b(sb.toString());
        } else {
            file = file2;
            i = i11;
            str = str2;
            i2 = i12;
        }
        String str3 = str == null ? "" : str;
        if (j3 <= 0 || j5 <= 0) {
            i3 = i2;
            if (j5 > 0) {
                i4 = i;
                j = j5;
            } else {
                i4 = i;
                long j6 = oecVar.v;
                if (j3 > 0) {
                    j6 -= j3;
                }
                j = j6;
            }
        } else {
            j = j5 - j3;
            i3 = i2;
            i4 = i;
        }
        if (i10 == 0) {
            i10 = 25;
        } else if (i10 > 59) {
            i10 = 59;
        }
        if (i7 == 90 || i7 == 270) {
            i6 = i5;
            i5 = i6;
        }
        if (!oecVar.Y && i10 > 40 && Math.min(i6, i5) <= 480) {
            i10 = 30;
        }
        boolean z3 = (j4 == -1 && oecVar.H == null && oecVar.G == null && oecVar.B == null && oecVar.A == null && i5 == i8 && i6 == i9 && i7 == 0 && !oecVar.s && j3 == -1 && oecVar.a0.isEmpty()) ? false : true;
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("videoconvert", 0);
        long currentTimeMillis = System.currentTimeMillis();
        File file3 = file;
        guc gucVar = new guc(z, oecVar, file3, so6Var);
        oecVar.W = true;
        MediaCodecVideoConvertor mediaCodecVideoConvertor = new MediaCodecVideoConvertor();
        MediaCodecVideoConvertor.ConvertVideoParams of = MediaCodecVideoConvertor.ConvertVideoParams.of(str3, file3, j2, i7, z2, i8, i9, i5, i6, i10, i4, i3, j3, j5, j4, z3, j, gucVar, oecVar);
        of.soundInfos.addAll(oecVar.a0);
        boolean convertVideo = mediaCodecVideoConvertor.convertVideo(of);
        boolean z4 = oecVar.V;
        if (!z4) {
            synchronized (z.b) {
                z4 = oecVar.V;
            }
        }
        if (f11.a) {
            cc4.b("time=" + (System.currentTimeMillis() - currentTimeMillis) + " canceled=" + z4);
        }
        sharedPreferences.edit().putBoolean("isPreviousOk", true).apply();
        long lastFrameTimestamp = mediaCodecVideoConvertor.getLastFrameTimestamp();
        boolean z5 = z4;
        long length = file3.length();
        boolean z6 = convertVideo || z5;
        oec oecVar2 = so6Var.b;
        boolean z7 = oecVar2.W;
        if (z7) {
            oecVar2.W = false;
        }
        hl.c3(new nn6(z, z6, true, so6Var, file3, 1.0f, lastFrameTimestamp, z7, length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x02ea, code lost:
    
        if (r7 > 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02a4, code lost:
    
        if (r9 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0397, code lost:
    
        if (r0.f.equals(r0.b.eglGetCurrentSurface(12377)) == false) goto L175;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0315 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        f89 f89Var;
        LaunchActivity launchActivity;
        Object obj;
        ByteBuffer allocateDirect;
        double d;
        boolean z;
        byte b = 4;
        float f = 0.0f;
        switch (this.a) {
            case 0:
                o24 o24Var = (o24) this.b;
                if (o24Var.C0.s == null) {
                    o24Var.Y1 = false;
                    o24Var.Y();
                    return;
                }
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                if (externalActionActivity.x == this) {
                    if (hl.n2(true)) {
                        if (f11.a) {
                            cc4.b("lock app");
                        }
                        externalActionActivity.i();
                    } else if (f11.a) {
                        cc4.b("didn't pass lock check");
                    }
                    externalActionActivity.x = null;
                    return;
                }
                return;
            case 2:
                fg4 fg4Var = (fg4) this.b;
                if (fg4Var.Q) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f2 = (elapsedRealtime / 320.0f) + fg4Var.r0;
                    fg4Var.r0 = f2;
                    fg4Var.setAnimationIdicatorProgress(fg4Var.k0.getInterpolation(f2));
                    float f3 = fg4Var.r0;
                    if (f3 > 1.0f) {
                        fg4Var.r0 = 1.0f;
                        f3 = 1.0f;
                    }
                    if (f3 < 1.0f) {
                        hl.c3(fg4Var.x0);
                        return;
                    }
                    fg4Var.Q = false;
                    fg4Var.setEnabled(true);
                    ag4 ag4Var = fg4Var.K;
                    if (ag4Var != null) {
                        ag4Var.a(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                yg4 yg4Var = (yg4) this.b;
                if (yg4Var.N) {
                    yg4Var.f.clear();
                    yg4Var.n.clear();
                    yg4Var.r.clear();
                    c79 c79Var = yg4Var.d;
                    if (c79Var != null) {
                        c79Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ai4 ai4Var = (ai4) this.b;
                Context n = ai4Var.n();
                if (n == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                }
                ai4Var.D0.d(1);
                mj0 mj0Var = ai4Var.D0;
                String string = n.getString(R.string.fingerprint_dialog_touch_sensor);
                qj7 qj7Var = mj0Var.y;
                if (qj7Var == null) {
                    qj7Var = new qj7();
                    mj0Var.y = qj7Var;
                }
                mj0.f(qj7Var, string);
                return;
            case 5:
                jm4 jm4Var = (jm4) this.b;
                jm4Var.k();
                jm4Var.j();
                jm4Var.f.setAlpha(1.0f);
                return;
            case 6:
                gp4 gp4Var = (gp4) this.b;
                if (gp4Var.Z != null) {
                    gp4Var.j();
                    return;
                }
                return;
            case 7:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.f();
                hl.d3(fragmentContextView.t0, 1000L);
                return;
            case 8:
                ((kq4) this.b).A(true);
                return;
            case 9:
                mr4 mr4Var = (mr4) this.b;
                if (mr4Var.G.get()) {
                    mr4Var.invalidate();
                    mr4Var.I.postDelayed(this, 300L);
                    return;
                }
                return;
            case 10:
                t35 t35Var = (t35) this.b;
                if (t35Var.d && t35Var.e && t35Var.k != null) {
                    if (SystemClock.elapsedRealtime() - t35Var.l >= 30000) {
                        t35Var.f("heartbeat timed out");
                        return;
                    }
                    t35Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - t35Var.l) + " ms ago");
                    t35Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    hl.d3(this, 15000L);
                    return;
                }
                return;
            case 11:
                j95 j95Var = ((w65) this.b).b;
                j95Var.w1.setAnimation(j95Var.D2);
                j95Var.F2 = false;
                return;
            case 12:
                za5 za5Var = (za5) this.b;
                if (za5Var.w) {
                    za5Var.i(false);
                    hl.d3(this, 250L);
                    return;
                }
                return;
            case 13:
                g75 g75Var = (g75) this.b;
                if (!g75Var.b || g75Var.R0.t2 != null) {
                    hl.d3(g75Var.i0, 3000L);
                    return;
                } else {
                    g75Var.h0 = false;
                    g75Var.setUiVisible(false);
                    return;
                }
            case 14:
                yr5 yr5Var = (yr5) this.b;
                try {
                    int w0 = aob.w0(null, aob.d6, false);
                    xr5 xr5Var = yr5Var.J;
                    if (xr5Var == null || yr5Var.fragmentView == null || yr5Var.P == w0) {
                        return;
                    }
                    yr5Var.P = w0;
                    xr5Var.postRunnable(new hl3((Object) xr5Var, w0, (byte) 16));
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 15:
                if (((xr5) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    xr5 xr5Var2 = (xr5) this.b;
                    if (xr5Var2.e.equals(xr5Var2.b.eglGetCurrentContext())) {
                        xr5 xr5Var3 = (xr5) this.b;
                        break;
                    }
                    xr5 xr5Var4 = (xr5) this.b;
                    EGL10 egl10 = xr5Var4.b;
                    EGLDisplay eGLDisplay = xr5Var4.c;
                    EGLSurface eGLSurface = xr5Var4.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, xr5Var4.e)) {
                        if (f11.a) {
                            c00.w(((xr5) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            return;
                        }
                        return;
                    }
                    int min = (int) Math.min(currentTimeMillis - ((xr5) this.b).s, 16L);
                    Intro.setPage(((xr5) this.b).y.I);
                    Intro.setDate((currentTimeMillis - r6.K) / 1000.0f);
                    Intro.onDrawFrame(min);
                    xr5 xr5Var5 = (xr5) this.b;
                    xr5Var5.b.eglSwapBuffers(xr5Var5.c, xr5Var5.f);
                    xr5 xr5Var6 = (xr5) this.b;
                    xr5Var6.s = currentTimeMillis;
                    if (xr5Var6.r == 0.0f) {
                        for (float f4 : ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f4 > f) {
                                f = f4;
                            }
                        }
                        ((xr5) this.b).r = f;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    xr5 xr5Var7 = (xr5) this.b;
                    xr5Var7.postRunnable(xr5Var7.x, Math.max(((long) (1000.0f / xr5Var7.r)) - currentTimeMillis2, 0L));
                    return;
                }
                return;
            case 16:
                at5 at5Var = (at5) this.b;
                bt5 bt5Var = at5Var.E;
                os5 os5Var = bt5Var.P1;
                if (os5Var != null && os5Var.getAdapter() != null) {
                    bt5Var.P1.getClass();
                    int S = RecyclerView.S(at5Var);
                    if (S >= 0) {
                        bt5Var.N1.t(bt5Var.P1.U(at5Var), S);
                    }
                }
                hl.c3(this);
                return;
            case 17:
                lu5 lu5Var = (lu5) this.b;
                iu5 iu5Var = lu5Var.y;
                if (lu5Var.c != null) {
                    long currentTimeMillis3 = System.currentTimeMillis();
                    long j = lu5Var.S;
                    long j2 = j != Long.MIN_VALUE ? currentTimeMillis3 - j : 0L;
                    q79 layoutManager = lu5Var.I.getLayoutManager();
                    Rect rect = lu5Var.R;
                    if (rect == null) {
                        rect = new Rect();
                        lu5Var.R = rect;
                    }
                    layoutManager.c(lu5Var.c.a, rect);
                    if (layoutManager.d()) {
                        int i3 = (int) (lu5Var.s + lu5Var.n);
                        int paddingLeft = (i3 - lu5Var.R.left) - lu5Var.I.getPaddingLeft();
                        float f5 = lu5Var.n;
                        if (f5 >= 0.0f || paddingLeft >= 0) {
                            if (f5 > 0.0f) {
                                i = ((lu5Var.c.a.getWidth() + i3) + lu5Var.R.right) - (lu5Var.I.getWidth() - lu5Var.I.getPaddingRight());
                                break;
                            }
                        } else {
                            i = paddingLeft;
                        }
                        if (layoutManager.e()) {
                            int i4 = (int) (lu5Var.w + lu5Var.r);
                            int paddingTop = (i4 - lu5Var.R.top) - lu5Var.I.getPaddingTop();
                            float f6 = lu5Var.r;
                            if (f6 >= 0.0f || paddingTop >= 0) {
                                if (f6 > 0.0f) {
                                    i2 = ((lu5Var.c.a.getHeight() + i4) + lu5Var.R.bottom) - (lu5Var.I.getHeight() - lu5Var.I.getPaddingBottom());
                                    break;
                                }
                            } else {
                                i2 = paddingTop;
                            }
                            if (i != 0) {
                                int width = lu5Var.c.a.getWidth();
                                lu5Var.I.getWidth();
                                i = iu5Var.j(width, i, j2);
                            }
                            if (i2 != 0) {
                                int height = lu5Var.c.a.getHeight();
                                lu5Var.I.getHeight();
                                i2 = iu5Var.j(height, i2, j2);
                            }
                            if (i != 0 && i2 == 0) {
                                lu5Var.S = Long.MIN_VALUE;
                                return;
                            }
                            if (lu5Var.S == Long.MIN_VALUE) {
                                lu5Var.S = currentTimeMillis3;
                            }
                            lu5Var.I.scrollBy(i, i2);
                            f89Var = lu5Var.c;
                            if (f89Var != null) {
                                lu5Var.p(f89Var);
                            }
                            lu5Var.I.removeCallbacks(lu5Var.J);
                            RecyclerView recyclerView = lu5Var.I;
                            WeakHashMap weakHashMap = ihc.a;
                            recyclerView.postOnAnimation(this);
                            return;
                        }
                        i2 = 0;
                        if (i != 0) {
                        }
                        if (i2 != 0) {
                        }
                        if (i != 0) {
                        }
                        if (lu5Var.S == Long.MIN_VALUE) {
                        }
                        lu5Var.I.scrollBy(i, i2);
                        f89Var = lu5Var.c;
                        if (f89Var != null) {
                        }
                        lu5Var.I.removeCallbacks(lu5Var.J);
                        RecyclerView recyclerView2 = lu5Var.I;
                        WeakHashMap weakHashMap2 = ihc.a;
                        recyclerView2.postOnAnimation(this);
                        return;
                    }
                    i = 0;
                    if (layoutManager.e()) {
                    }
                    i2 = 0;
                    if (i != 0) {
                    }
                    if (i2 != 0) {
                    }
                    if (i != 0) {
                    }
                    if (lu5Var.S == Long.MIN_VALUE) {
                    }
                    lu5Var.I.scrollBy(i, i2);
                    f89Var = lu5Var.c;
                    if (f89Var != null) {
                    }
                    lu5Var.I.removeCallbacks(lu5Var.J);
                    RecyclerView recyclerView22 = lu5Var.I;
                    WeakHashMap weakHashMap22 = ihc.a;
                    recyclerView22.postOnAnimation(this);
                    return;
                }
                return;
            case 18:
                h44 h44Var = ((hc8) this.b).C0;
                if (h44Var instanceof rlb) {
                    ((rlb) h44Var).getEditText();
                    return;
                }
                return;
            case 19:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                if (launchActivity2.Z0 == this) {
                    if (hl.n2(true)) {
                        if (f11.a) {
                            cc4.b("lock app");
                        }
                        launchActivity = launchActivity2;
                        launchActivity.K0(true, false, -1, -1, null);
                        try {
                            ip7.n(yac.t0).Y();
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                        }
                    } else {
                        launchActivity = launchActivity2;
                        if (f11.a) {
                            cc4.b("didn't pass lock check");
                        }
                    }
                    launchActivity.Z0 = null;
                    return;
                }
                return;
            case 20:
                q26 q26Var = (q26) this.b;
                q26Var.f.animate().setDuration(120L).alpha(0.0f);
                RadialProgressView radialProgressView = q26Var.h;
                radialProgressView.animate().setListener(null).start();
                if (radialProgressView.getVisibility() != 0) {
                    radialProgressView.setVisibility(0);
                    radialProgressView.setAlpha(0.0f);
                }
                radialProgressView.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 21:
                synchronized (((qj7) this.b).a) {
                    obj = ((qj7) this.b).f;
                    ((qj7) this.b).f = qj7.k;
                }
                ((qj7) this.b).i(obj);
                return;
            case 22:
                ((pa6) this.b).b();
                return;
            case 23:
                dg6 dg6Var = (dg6) this.b;
                if (dg6Var.h == this) {
                    dg6Var.n();
                    hl.d3(dg6Var.h, 1000L);
                    return;
                }
                return;
            case 24:
                MediaController mediaController = (MediaController) this.b;
                if (mediaController.f1 != null) {
                    if (mediaController.y1.isEmpty()) {
                        allocateDirect = ByteBuffer.allocateDirect(mediaController.A1);
                        allocateDirect.order(ByteOrder.nativeOrder());
                    } else {
                        allocateDirect = (ByteBuffer) mediaController.y1.get(0);
                        mediaController.y1.remove(0);
                    }
                    ByteBuffer byteBuffer = allocateDirect;
                    byteBuffer.rewind();
                    int read = mediaController.f1.read(byteBuffer, byteBuffer.capacity());
                    if (read <= 0) {
                        mediaController.y1.add(byteBuffer);
                        MediaController mediaController2 = (MediaController) this.b;
                        byte b2 = mediaController2.C1;
                        if (b2 == 3 || b2 == 4) {
                            return;
                        }
                        mediaController2.G0(b2, mediaController2.E1, mediaController2.D1, mediaController2.F1);
                        return;
                    }
                    byteBuffer.limit(read);
                    char c = mediaController.B1;
                    snc sncVar = r2f.a;
                    if (sncVar != null && read > 0) {
                        try {
                            sncVar.o(byteBuffer, read, c, 1);
                        } catch (Throwable th) {
                            cc4.g(th, true);
                        }
                    }
                    try {
                        long j3 = mediaController.w1;
                        long j4 = (read / 2) + j3;
                        int length = (int) ((j3 / j4) * r0.length);
                        int length2 = mediaController.v1.length - length;
                        if (length != 0) {
                            try {
                                float length3 = r0.length / length;
                                float f7 = 0.0f;
                                for (int i5 = 0; i5 < length; i5++) {
                                    short[] sArr = mediaController.v1;
                                    sArr[i5] = sArr[(int) f7];
                                    f7 += length3;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                z = true;
                                d = 0.0d;
                                cc4.g(e, z);
                                byteBuffer.position(0);
                                final double sqrt = Math.sqrt((d / read) / 2.0d);
                                mediaController.O1.c(new yn6((Object) this, (Object) byteBuffer, read != byteBuffer.capacity(), (byte) 0));
                                mediaController.N1.c(mediaController.P1);
                                hl.c3(new Runnable() { // from class: zn6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        MediaController mediaController3 = (MediaController) zz3.this.b;
                                        jn7.f(mediaController3.i1).k(jn7.k2, Integer.valueOf(mediaController3.h1), Double.valueOf(sqrt));
                                    }
                                });
                                return;
                            }
                        }
                        float f8 = (read / 2.0f) / length2;
                        d = 0.0d;
                        for (int i6 = 0; i6 < read / 2; i6++) {
                            try {
                                short s = byteBuffer.getShort();
                                d += s * s;
                                if (i6 == ((int) f)) {
                                    short[] sArr2 = mediaController.v1;
                                    if (length < sArr2.length) {
                                        sArr2[length] = s;
                                        f += f8;
                                        length++;
                                    }
                                }
                            } catch (Exception e4) {
                                e = e4;
                                z = true;
                                cc4.g(e, z);
                                byteBuffer.position(0);
                                final double sqrt2 = Math.sqrt((d / read) / 2.0d);
                                mediaController.O1.c(new yn6((Object) this, (Object) byteBuffer, read != byteBuffer.capacity(), (byte) 0));
                                mediaController.N1.c(mediaController.P1);
                                hl.c3(new Runnable() { // from class: zn6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        MediaController mediaController3 = (MediaController) zz3.this.b;
                                        jn7.f(mediaController3.i1).k(jn7.k2, Integer.valueOf(mediaController3.h1), Double.valueOf(sqrt2));
                                    }
                                });
                                return;
                            }
                        }
                        mediaController.w1 = j4;
                    } catch (Exception e5) {
                        e = e5;
                        d = 0.0d;
                    }
                    byteBuffer.position(0);
                    final double sqrt22 = Math.sqrt((d / read) / 2.0d);
                    mediaController.O1.c(new yn6((Object) this, (Object) byteBuffer, read != byteBuffer.capacity(), (byte) 0));
                    mediaController.N1.c(mediaController.P1);
                    hl.c3(new Runnable() { // from class: zn6
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaController mediaController3 = (MediaController) zz3.this.b;
                            jn7.f(mediaController3.i1).k(jn7.k2, Integer.valueOf(mediaController3.h1), Double.valueOf(sqrt22));
                        }
                    });
                    return;
                }
                return;
            case 25:
                a();
                return;
            case 26:
                bv6 bv6Var = (bv6) this.b;
                bv6Var.i(true);
                bv6Var.V.requestLayout();
                bv6Var.V.getViewTreeObserver().addOnGlobalLayoutListener(new vp(bv6Var, b));
                return;
            case 27:
                bv6 bv6Var2 = ((zu6) this.b).b;
                if (bv6Var2.d0 != null) {
                    bv6Var2.d0 = null;
                    if (bv6Var2.t0) {
                        bv6Var2.q(bv6Var2.u0);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                s57 s57Var = (s57) this.b;
                ValueAnimator valueAnimator = s57Var.h;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                s57Var.h.start();
                return;
            default:
                ((z67) this.b).U.animate().alpha(1.0f).setDuration(230L);
                return;
        }
    }

    public /* synthetic */ zz3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
