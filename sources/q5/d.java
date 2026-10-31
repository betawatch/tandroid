package q5;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.PersistableBundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import c3.g0;
import c3.l;
import c3.o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.clearcut.e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import e0.r;
import e9.k0;
import e9.l0;
import e9.n0;
import e9.s;
import java.io.EOFException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.Adler32;
import m2.t;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ef;
import org.telegram.messenger.i0;
import org.telegram.messenger.pz;
import org.telegram.messenger.q20;
import org.telegram.messenger.r20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.px0;
import org.telegram.ui.xn0;
import r0.h0;
import r2.y;
import s4.c1;
import s4.p0;
import sg.v;
import t0.h;
import t7.u;
import th.m1;
import u2.s1;
import u2.w0;
import uh.m;
import v7.t6;
import vb.i;
import vh.b8;
import vh.d1;
import vh.i4;
import vh.j4;
import vh.k4;
import vh.m5;
import vh.n5;
import vh.n8;
import vh.o8;
import vh.y6;
import w7.n6;
import x7.d0;
import xa.g;
import xa.j;
import z7.x;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class d implements n5.b, xn0, h, ai, ka.a, s61 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ d(int i10, boolean z10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.ai
    public void C(mg mgVar) {
        mgVar.run();
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        n8 n8Var;
        String str = (String) this.c;
        m mVar = (m) this.d;
        long j12 = mVar.d;
        bi biVar = (bi) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.a2;
        if (chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            return;
        }
        HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
        chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
        if (selectedPhotos.size() != 1) {
            return;
        }
        Object next = selectedPhotos.values().iterator().next();
        if (next instanceof ef) {
            n5 l4 = n5.l((ef) next);
            l4.J0 = j12;
            l4.K0 = str;
            l4.A();
            o8 D = o8.D(mVar.a.getParentActivity(), mVar.b);
            RectF rectF = D.H;
            WindowManager.LayoutParams layoutParams = D.h;
            int i13 = D.c;
            WindowManager windowManager = D.f;
            if (!D.d) {
                if (vp.r1(i13).u2()) {
                    org.telegram.ui.b.b(i13);
                } else {
                    D.v0 = j12;
                    D.w0 = str;
                    D.u0 = false;
                    D.e = false;
                    D.B2 = false;
                    if (windowManager != null && (n8Var = D.n) != null && n8Var.getParent() == null) {
                        i0.x3(windowManager, D.n, layoutParams);
                        windowManager.addView(D.n, layoutParams);
                        D.f0();
                    }
                    D.K1 = l4;
                    l4.J0 = j12;
                    l4.K0 = str;
                    D.O1 = l4.K ? 1 : 0;
                    D.s0.g = false;
                    D.J = 0;
                    float L = i0.L(100.0f);
                    Point point = i0.q;
                    rectF.set(0.0f, L, point.x, i0.L(100.0f) + point.y);
                    D.G = i0.L(8.0f);
                    D.r.c();
                    b8 b8Var = D.h0;
                    int i14 = D.J;
                    b8Var.setBackgroundColor((i14 == 1 || i14 == 0) ? 0 : -14737633);
                    D.r.setTranslationX(0.0f);
                    D.r.setTranslationY(0.0f);
                    D.r.b(0.0f);
                    D.r.setScaleX(1.0f);
                    D.r.setScaleY(1.0f);
                    D.K = 0.0f;
                    i0.g2(D.b);
                    n5 n5Var = D.K1;
                    if (n5Var != null) {
                        D.c1.setText(n5Var.C0);
                    }
                    D.J(1, false);
                    D.k0(-1, false, false);
                    D.b1.b(false, false);
                    D.b1.b(true, true);
                    D.f(1.0f, true, new y6(D, 6));
                    D.d();
                }
            }
            i0.h3(new v(biVar, 25), 400L);
        }
    }

    @Override // t0.h
    public Uri a() {
        return (Uri) this.b;
    }

    @Override // org.telegram.ui.Components.ai
    public boolean a1() {
        return true;
    }

    @Override // org.telegram.ui.xn0
    public void b(ArrayList arrayList) {
        String str = !arrayList.isEmpty() ? ((pz) arrayList.get(0)).c : null;
        if (str == null) {
            return;
        }
        Utilities.e.c(new px0(str, (r20) this.b, (k2) this.c, (q20) this.d, 14));
    }

    @Override // t0.h
    public Uri d() {
        return (Uri) this.d;
    }

    @Override // ka.a
    public /* bridge */ /* synthetic */ ka.a e(Class cls, ja.d dVar) {
        switch (this.a) {
            case 9:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
            case 16:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
            case 18:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
            default:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
        }
        return this;
    }

    @Override // t0.h
    public Object f() {
        return null;
    }

    @Override // zc.a
    public Object get() {
        return new d((Context) ((zc.a) this.b).get(), (s5.d) ((zc.a) this.c).get(), (r5.b) ((u) this.d).get(), 4);
    }

    @Override // t0.h
    public ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    public void h(int i10, View view, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((t) this.b).b;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : p(i10);
        ((g0) this.c).G(childCount, z10);
        if (z10) {
            t(view);
        }
        recyclerView.addView(view, childCount);
        c1 U = RecyclerView.U(view);
        recyclerView.g0(view);
        s4.g0 g0Var = recyclerView.x;
        if (g0Var != null && U != null) {
            g0Var.y(U);
        }
        ArrayList arrayList = recyclerView.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((p0) recyclerView.P.get(size)).b();
            }
        }
    }

    public void i(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((t) this.b).b;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : p(i10);
        ((g0) this.c).G(childCount, z10);
        if (z10) {
            t(view);
        }
        c1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.l &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void j(int i10) {
        c1 U;
        int p5 = p(i10);
        ((g0) this.c).H(p5);
        RecyclerView recyclerView = (RecyclerView) ((t) this.b).b;
        View childAt = recyclerView.getChildAt(p5);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(p5);
    }

    public Object k(Bitmap bitmap) {
        yg.a aVar = (yg.a) this.b;
        if (aVar.a(bitmap)) {
            this.d = ((yg.b) this.c).a(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    public View l(int i10) {
        return ((RecyclerView) ((t) this.b).b).getChildAt(p(i10));
    }

    public int m() {
        return ((RecyclerView) ((t) this.b).b).getChildCount() - ((ArrayList) this.d).size();
    }

    public long n() {
        l lVar = (l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    public ByteBuffer o() {
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap == null) {
            return (ByteBuffer) this.c;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = ((Bitmap) this.d).getHeight();
        int i10 = width * height;
        ((Bitmap) this.d).getPixels(new int[i10], 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((Color.blue(r2[i11]) * 0.114f) + (Color.green(r2[i11]) * 0.587f) + (Color.red(r2[i11]) * 0.299f));
        }
        return ByteBuffer.wrap(bArr);
    }

    @Override // org.telegram.ui.Components.s61
    public void onError(u61 u61Var, Exception exc) {
        y6 y6Var = ((k4) this.d).N;
        if (y6Var != null) {
            y6Var.run();
        }
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public void onStateChanged(boolean z10, int i10) {
        k4 k4Var = (k4) this.d;
        i4 i4Var = k4Var.K;
        u61 u61Var = k4Var.e;
        if (u61Var == null) {
            return;
        }
        if (u61Var.d0()) {
            i0.g3(i4Var);
        } else {
            i0.r(i4Var);
        }
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.s61
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((k4) this.d).i();
    }

    @Override // org.telegram.ui.Components.s61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        k4 k4Var = (k4) this.d;
        n5 n5Var = (n5) this.b;
        if (n5Var != null) {
            m5 V = k4Var.e.V(n5Var.d1);
            n5Var.d1 = V;
            k61 k61Var = k4Var.n;
            if (k61Var != null) {
                k61Var.setHDRInfo(V);
            }
        }
        int i13 = (int) (i10 * f7);
        k4Var.f = i13;
        int i14 = (int) (i11 * f7);
        k4Var.h = i14;
        if (n5Var != null && (n5Var.k0 != i13 || n5Var.l0 != i14)) {
            n5Var.k0 = i13;
            n5Var.l0 = i14;
            n5Var.A();
        }
        k4Var.b();
        k61 k61Var2 = k4Var.n;
        if (k61Var2 != null) {
            int i15 = k4Var.f;
            int i16 = k4Var.h;
            k61Var2.d = i15;
            k61Var2.e = i16;
            gz gzVar = k61Var2.b;
            if (gzVar == null) {
                return;
            }
            gzVar.postRunnable(new cz(gzVar, i15, i16, 0));
        }
    }

    public int p(int i10) {
        g0 g0Var = (g0) this.c;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((t) this.b).b).getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int B = i10 - (i11 - g0Var.B(i11));
            if (B == 0) {
                while (g0Var.F(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += B;
        }
        return -1;
    }

    public View q(int i10) {
        return ((RecyclerView) ((t) this.b).b).getChildAt(i10);
    }

    public int r() {
        return ((RecyclerView) ((t) this.b).b).getChildCount();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean s() {
        j jVar;
        if (((y) this.d).R("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.c;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String X = ((y) this.d).X("gcm.n.image");
        if (!TextUtils.isEmpty(X)) {
            try {
                jVar = new j(new URL(X));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + X);
            }
            if (jVar != null) {
                ExecutorService executorService = (ExecutorService) this.b;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                jVar.b = executorService.submit(new d1(21, jVar, taskCompletionSource));
                jVar.c = taskCompletionSource.getTask();
            }
            g a2 = xa.d.a((FirebaseMessagingService) this.c, (y) this.d);
            r rVar = (r) a2.a;
            if (jVar != null) {
                try {
                    Task task = jVar.c;
                    n6.l.g(task);
                    Bitmap bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                    rVar.j(bitmap);
                    e0.l lVar = new e0.l();
                    lVar.e = bitmap == null ? null : IconCompat.c(bitmap);
                    lVar.f = null;
                    lVar.g = true;
                    rVar.n(lVar);
                } catch (InterruptedException unused2) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    jVar.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
                } catch (TimeoutException unused3) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    jVar.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a2.b, 0, ((r) a2.a).b());
            return true;
        }
        jVar = null;
        if (jVar != null) {
        }
        g a22 = xa.d.a((FirebaseMessagingService) this.c, (y) this.d);
        r rVar2 = (r) a22.a;
        if (jVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a22.b, 0, ((r) a22.a).b());
        return true;
    }

    public void t(View view) {
        ((ArrayList) this.d).add(view);
        t tVar = (t) this.b;
        c1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.a;
            RecyclerView recyclerView = (RecyclerView) tVar.b;
            int i10 = U.s;
            if (i10 != -1) {
                U.r = i10;
            } else {
                WeakHashMap weakHashMap = h0.a;
                U.r = view2.getImportantForAccessibility();
            }
            if (recyclerView.c0()) {
                U.s = 4;
                recyclerView.K0.add(U);
            } else {
                WeakHashMap weakHashMap2 = h0.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public String toString() {
        String str = "";
        switch (this.a) {
            case 5:
                return ((g0) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            case 11:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                d dVar = (d) ((d) this.c).d;
                while (dVar != null) {
                    Object obj = dVar.c;
                    sb2.append(str);
                    String str2 = (String) dVar.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r5.length() - 1);
                    }
                    dVar = (d) dVar.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 14:
                return (String) this.b;
            case 24:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                d dVar2 = (d) ((d) this.c).d;
                while (dVar2 != null) {
                    Object obj2 = dVar2.c;
                    sb3.append(str);
                    String str3 = (String) dVar2.b;
                    if (str3 != null) {
                        sb3.append(str3);
                        sb3.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r5.length() - 1);
                    }
                    dVar2 = (d) dVar2.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r1.d != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        if (r1.d != r11) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u(g2.h hVar, Uri uri, Map map, long j10, long j11, w0 w0Var) {
        l lVar = new l(hVar, j10, j11);
        this.d = lVar;
        if (((o) this.c) != null) {
            return;
        }
        o[] e = ((c3.r) this.b).e(uri, map);
        int length = e.length;
        l0 l0Var = n0.b;
        s.f(length, "expectedSize");
        k0 k0Var = new k0(length);
        boolean z10 = true;
        z10 = true;
        if (e.length == 1) {
            this.c = e[0];
        } else {
            int length2 = e.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                o oVar = e[i10];
                try {
                } catch (EOFException unused) {
                    if (((o) this.c) == null) {
                    }
                } catch (Throwable th2) {
                    if (((o) this.c) == null && lVar.d != j10) {
                        z10 = false;
                    }
                    t6.p(z10);
                    lVar.f = 0;
                    throw th2;
                }
                if (oVar.a(lVar)) {
                    this.c = oVar;
                    lVar.f = 0;
                    break;
                }
                k0Var.d(oVar.e());
                if (((o) this.c) == null) {
                }
                boolean z11 = true;
                t6.p(z11);
                lVar.f = 0;
                i10++;
            }
            if (((o) this.c) == null) {
                String str = "None of the available extractors (" + new e(", ", 1).b(s.x(n0.v(e), new m1(z10 ? 1 : 0))) + ") could read the stream.";
                uri.getClass();
                throw new s1(str, k0Var.f());
            }
        }
        ((o) this.c).c(w0Var);
    }

    public void v(i iVar, Object obj) {
        if (((EnumMap) this.d) == null) {
            this.d = new EnumMap(i.class);
        }
        ((EnumMap) this.d).put((EnumMap) iVar, (i) obj);
    }

    public void w() {
        int i10;
        RecyclerView recyclerView = (RecyclerView) ((t) this.b).b;
        ((g0) this.c).I();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            c1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i11 = U.r;
                if (recyclerView.c0()) {
                    U.s = i11;
                    recyclerView.K0.add(U);
                } else {
                    View view = U.a;
                    WeakHashMap weakHashMap = h0.a;
                    view.setImportantForAccessibility(i11);
                }
                U.r = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
    }

    public void x(l5.i iVar, int i10, boolean z10) {
        char c10;
        r5.b bVar = (r5.b) this.d;
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.a;
        String str2 = iVar.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        i5.d dVar = iVar.c;
        adler32.update(allocate.putInt(v5.a.a(dVar)).array());
        byte[] bArr = iVar.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        n6.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((s5.g) ((s5.d) this.c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(v5.a.a(dVar))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(bVar.a(dVar, longValue, i10));
            Set set = ((r5.c) bVar.b.get(dVar)).c;
            if (set.contains(r5.d.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(r5.d.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(r5.d.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", v5.a.a(dVar));
            if (bArr != null) {
                c10 = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c10 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf2 = Integer.valueOf(value);
            Long valueOf3 = Long.valueOf(bVar.a(dVar, longValue, i10));
            Integer valueOf4 = Integer.valueOf(i10);
            Object[] objArr = new Object[5];
            objArr[c10] = iVar;
            objArr[1] = valueOf2;
            objArr[2] = valueOf3;
            objArr[3] = valueOf;
            objArr[4] = valueOf4;
            String c11 = n6.c("JobInfoScheduler");
            if (Log.isLoggable(c11, 3)) {
                Log.d(c11, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void y(View view) {
        if (((ArrayList) this.d).remove(view)) {
            t tVar = (t) this.b;
            c1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) tVar.b;
                int i10 = U.r;
                if (recyclerView.c0()) {
                    U.s = i10;
                    recyclerView.K0.add(U);
                } else {
                    View view2 = U.a;
                    WeakHashMap weakHashMap = h0.a;
                    view2.setImportantForAccessibility(i10);
                }
                U.r = 0;
            }
        }
    }

    public /* synthetic */ d(FrameLayout frameLayout, Object obj, Serializable serializable, int i10) {
        this.a = i10;
        this.d = frameLayout;
        this.b = obj;
        this.c = serializable;
    }

    @Override // org.telegram.ui.Components.s61
    public void onRenderedFirstFrame() {
        n5 n5Var = (n5) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        k4 k4Var = (k4) this.d;
        j4 j4Var = k4Var.H;
        if (j4Var != null && j4Var.g) {
            int i10 = k4Var.f;
            int i11 = k4Var.h;
            j4Var.d = true;
            j4Var.e = i10;
            j4Var.f = i11;
            ag.a aVar = j4Var.c;
            if (aVar != null) {
                aVar.a(Integer.valueOf(i10), Integer.valueOf(j4Var.f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable == null) {
            k61 k61Var = k4Var.n;
            if (k61Var != null) {
                if (j4Var == null || !j4Var.g) {
                    k61Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new d1(6, this, n5Var)).start();
                    return;
                }
                return;
            }
            return;
        }
        k4Var.post(runnable);
        runnableArr[0] = null;
        Bitmap bitmap = k4Var.a;
        if (bitmap != null) {
            bitmap.recycle();
            if (n5Var.M0 == k4Var.a) {
                n5Var.M0 = null;
            }
            k4Var.a = null;
            k4Var.invalidate();
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ d(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 24:
                d dVar = new d(23, false);
                this.c = dVar;
                this.d = dVar;
                this.b = str;
                break;
            default:
                d dVar2 = new d(10, false);
                this.c = dVar2;
                this.d = dVar2;
                this.b = str;
                break;
        }
    }

    public d(yg.b bVar) {
        this.a = 25;
        this.b = new yg.a();
        this.c = bVar;
    }

    public d(int i10) {
        this.a = i10;
        switch (i10) {
            case 9:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = v7.i.c;
                break;
            case 16:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = w7.e.c;
                break;
            case 18:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = d0.c;
                break;
            case 26:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = x.c;
                break;
            default:
                this.b = new a3.l();
                this.c = null;
                this.d = null;
                break;
        }
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.xn0
    public void V() {
    }

    @Override // t0.h
    public void c() {
    }

    @Override // t0.h
    public void g() {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void j0() {
    }

    public d(String str, vb.j[] jVarArr) {
        this.a = 14;
        System.currentTimeMillis();
        this.b = str;
        this.c = jVarArr;
        this.d = null;
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void n0(Object obj) {
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void v0(TLRPC.User user) {
    }

    public d(t tVar) {
        this.a = 5;
        this.b = tVar;
        this.c = new g0(7);
        this.d = new ArrayList();
    }

    public d(FirebaseMessagingService firebaseMessagingService, y yVar, ExecutorService executorService) {
        this.a = 22;
        this.b = executorService;
        this.c = firebaseMessagingService;
        this.d = yVar;
    }

    public d(c3.r rVar) {
        this.a = 7;
        this.b = rVar;
    }

    public d(Runnable runnable) {
        this.a = 3;
        this.c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.b = runnable;
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
