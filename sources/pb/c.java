package pb;

import ai.bc;
import ai.ea;
import ai.f6;
import ai.j;
import ai.p8;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.g;
import androidx.biometric.p;
import androidx.fragment.app.c0;
import androidx.fragment.app.k0;
import androidx.fragment.app.l0;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import c6.d0;
import c6.e0;
import ci.b7;
import ci.j6;
import ci.l8;
import ci.lc;
import ci.nb;
import ci.pc;
import ci.zb;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.w4;
import fb.n;
import g6.f;
import g6.q;
import g6.r;
import g6.w;
import h7.d;
import h7.e;
import ii.d3;
import ii.e2;
import ii.h1;
import ii.i2;
import ii.q5;
import ii.x3;
import j$.util.Objects;
import j6.l;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import k2.g0;
import ki.i0;
import l.i;
import l.k;
import lg.o;
import m.f3;
import m.i1;
import n4.x;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.k81;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mv0;
import org.telegram.ui.web.b1;
import org.telegram.ui.web.y0;
import qg.c2;
import v7.a8;
import v7.m;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class c implements mv0, a0, androidx.activity.result.b, WebMessageListenerBoundaryInterface, s, o, pc, OnCompleteListener, f6.a, n, i1, f5, h1, k2.n, i {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ c(r rVar, String[] strArr) {
        this.a = 21;
        this.b = strArr;
    }

    @Override // l.i
    public boolean A(k kVar, MenuItem menuItem) {
        m.k kVar2 = ((ActionMenuView) this.b).P;
        if (kVar2 == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((g0) kVar2).b).W.d).iterator();
        while (it.hasNext()) {
            if (((c0) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // ci.pc
    public void B(float f7, boolean z10) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.Z = f7;
        l8Var.j = true;
        k81 k81Var = b7Var.e;
        if (k81Var == null || k81Var.p() == -9223372036854775807L) {
            return;
        }
        b7Var.m((long) (f7 * b7Var.e.p()));
    }

    @Override // ci.pc
    public void C(long j3) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.r0 = j3;
        l8Var.j = true;
        b7Var.y(true);
    }

    @Override // ii.h1
    public void E(CharSequence charSequence) {
        d3 d3Var = ((q5) this.b).E;
        if (d3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        d3Var.a.u4(charSequence.toString());
    }

    public int F(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        fc.a aVar = (fc.a) this.b;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i13 = 1;
            while (i13 < length && iArr[i13] == 0) {
                i13++;
            }
            if (i13 == length) {
                iArr2 = new int[]{0};
            } else {
                int i14 = length - i13;
                int[] iArr4 = new int[i14];
                System.arraycopy(iArr, i13, iArr4, 0, i14);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i10];
        boolean z10 = true;
        for (int i15 = 0; i15 < i10; i15++) {
            int i16 = aVar.a[aVar.g + i15];
            if (i16 == 0) {
                i12 = iArr2[iArr2.length - 1];
            } else {
                if (i16 == 1) {
                    i11 = 0;
                    for (int i17 : iArr2) {
                        fc.a aVar2 = fc.a.h;
                        i11 ^= i17;
                    }
                } else {
                    i11 = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i18 = 1; i18 < length2; i18++) {
                        i11 = aVar.c(i16, i11) ^ iArr2[i18];
                    }
                }
                i12 = i11;
            }
            iArr5[(i10 - 1) - i15] = i12;
            if (i12 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            return 0;
        }
        fc.b bVar = new fc.b(aVar, iArr5);
        fc.b a2 = aVar.a(i10, 1);
        fc.b bVar2 = aVar.c;
        if (a2.d() >= bVar.d()) {
            a2 = bVar;
            bVar = a2;
        }
        fc.b bVar3 = aVar.d;
        fc.b bVar4 = a2;
        fc.b bVar5 = bVar;
        fc.b bVar6 = bVar4;
        fc.b bVar7 = bVar2;
        while (bVar6.d() * 2 >= i10) {
            if (bVar6.e()) {
                throw new fc.c("r_{i-1} was zero");
            }
            int b10 = aVar.b(bVar6.c(bVar6.d()));
            fc.b bVar8 = bVar2;
            while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                int d = bVar5.d() - bVar6.d();
                int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                bVar8 = bVar8.a(aVar.a(d, c10));
                bVar5 = bVar5.a(bVar6.h(d, c10));
            }
            fc.b a10 = bVar8.g(bVar3).a(bVar7);
            if (bVar5.d() >= bVar6.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
            }
            fc.b bVar9 = bVar5;
            bVar5 = bVar6;
            bVar6 = bVar9;
            bVar7 = bVar3;
            bVar3 = a10;
        }
        int c11 = bVar3.c(0);
        if (c11 == 0) {
            throw new fc.c("sigmaTilde(0) was zero");
        }
        int b11 = aVar.b(c11);
        fc.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
        fc.b bVar10 = bVarArr[0];
        fc.b bVar11 = bVarArr[1];
        int d10 = bVar10.d();
        if (d10 == 1) {
            iArr3 = new int[]{bVar10.c(1)};
        } else {
            int[] iArr6 = new int[d10];
            int i19 = 0;
            for (int i20 = 1; i20 < aVar.e && i19 < d10; i20++) {
                if (bVar10.b(i20) == 0) {
                    iArr6[i19] = aVar.b(i20);
                    i19++;
                }
            }
            if (i19 != d10) {
                throw new fc.c("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i21 = 0; i21 < length3; i21++) {
            int b12 = aVar.b(iArr3[i21]);
            int i22 = 1;
            for (int i23 = 0; i23 < length3; i23++) {
                if (i21 != i23) {
                    int c12 = aVar.c(iArr3[i23], b12);
                    i22 = aVar.c(i22, (c12 & 1) == 0 ? c12 | 1 : c12 & (-2));
                }
            }
            int c13 = aVar.c(bVar11.b(b12), aVar.b(i22));
            iArr7[i21] = c13;
            if (aVar.g != 0) {
                iArr7[i21] = aVar.c(c13, b12);
            }
        }
        for (int i24 = 0; i24 < iArr3.length; i24++) {
            int length4 = iArr.length - 1;
            int i25 = iArr3[i24];
            if (i25 == 0) {
                throw new IllegalArgumentException();
            }
            int i26 = length4 - aVar.b[i25];
            if (i26 < 0) {
                throw new fc.c("Bad error location");
            }
            iArr[i26] = iArr[i26] ^ iArr7[i24];
        }
        return iArr3.length;
    }

    @Override // ci.pc
    public void G(boolean z10) {
        c2 c2Var;
        lc lcVar = ((zb) ((b7) this.b)).C0;
        nb nbVar = lcVar.v1;
        if (nbVar == null) {
            return;
        }
        c2 c2Var2 = null;
        if (!z10 && (nbVar.getSelectedEntity() instanceof c2)) {
            lcVar.v1.C0(null, true);
            return;
        }
        if (!z10 || (lcVar.v1.getSelectedEntity() instanceof c2)) {
            return;
        }
        j6 j6Var = lcVar.v1.R0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= j6Var.getChildCount()) {
                c2Var = null;
                break;
            }
            View childAt = j6Var.getChildAt(i11);
            if (childAt instanceof c2) {
                c2Var = (c2) childAt;
                break;
            }
            i11++;
        }
        if (c2Var != null) {
            nb nbVar2 = lcVar.v1;
            j6 j6Var2 = nbVar2.R0;
            while (true) {
                if (i10 >= j6Var2.getChildCount()) {
                    break;
                }
                View childAt2 = j6Var2.getChildAt(i10);
                if (childAt2 instanceof c2) {
                    c2Var2 = (c2) childAt2;
                    break;
                }
                i10++;
            }
            nbVar2.C0(c2Var2, true);
        }
    }

    @Override // org.telegram.ui.mv0
    public void H(MessageObject messageObject) {
        ((bc) ((f6) this.b).Q1).f(false);
    }

    @Override // ci.pc
    public void I(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null || (arrayList = l8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((l8) b7Var.d.T.get(i10)).V = f7;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        ((e2) this.b).s0(i10, i11, z10);
    }

    @Override // ci.pc
    public void K(float f7) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.F = f7;
        l8Var.j = true;
        b7Var.w(true);
    }

    @Override // ii.h1
    public void L(Editable editable) {
        q5 q5Var = (q5) this.b;
        ii.a aVar = q5Var.a;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = q5Var.r.E;
        }
        q5Var.u();
        d3 d3Var = q5Var.E;
        if (d3Var == null || q5Var.a == null) {
            return;
        }
        d3Var.a();
    }

    @Override // ci.pc
    public void M(float f7) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.E = f7;
        l8Var.j = true;
        b7Var.w(true);
    }

    @Override // ii.h1
    public /* synthetic */ boolean N(boolean z10) {
        return false;
    }

    @Override // ci.pc
    public void O(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null || (arrayList = l8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((l8) b7Var.d.T.get(i10)).W = f7;
    }

    @Override // k2.n
    public void P(int i10, long j3, long j10) {
        x xVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) xVar.b;
        if (handler != null) {
            handler.post(new k2.i(xVar, i10, j3, j10, 0));
        }
    }

    @Override // ci.pc
    public void Q(float f7) {
        l8 l8Var = ((b7) this.b).d;
        if (l8Var == null) {
            return;
        }
        l8Var.a0 = f7;
        l8Var.j = true;
    }

    @Override // ci.pc
    public void R() {
        ((b7) this.b).q(null);
    }

    @Override // ci.pc
    public void T(float f7) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.t0 = f7;
        l8Var.j = true;
        b7Var.y(true);
    }

    @Override // ci.pc
    public void U(int i10, long j3) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null || (arrayList = l8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((l8) b7Var.d.T.get(i10)).X = j3;
    }

    @Override // ci.pc
    public void V(long j3) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.D = j3;
        l8Var.j = true;
        b7Var.w(true);
    }

    @Override // androidx.lifecycle.a0
    public void X(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 4:
                p pVar = (p) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (pVar.R()) {
                        pVar.W(pVar.q(R.string.fingerprint_not_recognized));
                    }
                    androidx.biometric.x xVar = pVar.l0;
                    if (xVar.n) {
                        Executor executor = xVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.n(1);
                        }
                        executor.execute(new g(pVar, 0));
                    } else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    androidx.biometric.x xVar2 = pVar.l0;
                    if (xVar2.u == null) {
                        xVar2.u = new z();
                    }
                    androidx.biometric.x.h(xVar2.u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                androidx.fragment.app.p pVar2 = (androidx.fragment.app.p) obj2;
                if (((t) obj) == null || !pVar2.r0) {
                    return;
                }
                pVar2.getClass();
                throw new IllegalStateException("Fragment " + pVar2 + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    public Boolean Y() {
        Bundle bundle = (Bundle) this.b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // k2.n
    public void Z() {
        x2.p pVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        synchronized (ffmpegAudioRenderer.a) {
            pVar = ffmpegAudioRenderer.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override // k2.n
    public void a(long j3) {
        x xVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) xVar.b;
        if (handler != null) {
            handler.post(new j(xVar, j3, 13));
        }
    }

    public boolean a0() {
        x0 x0Var = ((j0) this.b).d;
        return x0Var != null && x0Var.b();
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        int i10 = this.a;
        Object obj3 = this.b;
        switch (i10) {
            case 11:
                w wVar = (w) obj;
                f fVar = (f) wVar.u();
                d0 d0Var = ((e0) obj3).k;
                Parcel N0 = fVar.N0();
                v.d(N0, d0Var);
                fVar.S0(N0, 18);
                f fVar2 = (f) wVar.u();
                fVar2.S0(fVar2.N0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                break;
            case 21:
                q qVar = new q(1, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                Parcel N02 = iVar.N0();
                v.d(N02, qVar);
                N02.writeStringArray((String[]) obj3);
                iVar.S0(N02, 6);
                break;
            case 23:
                h7.f fVar3 = new h7.f(1, (TaskCompletionSource) obj2);
                d dVar = (d) ((e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = q7.a.a;
                obtain.writeStrongBinder(fVar3);
                q7.a.b(obtain, (GetCredentialRequest) obj3);
                q7.a.b(obtain, gVar);
                ((h7.b) dVar).F0(obtain, 1);
                break;
            default:
                i7.a aVar = new i7.a((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).u();
                String str = ((i7.b) obj3).k;
                Parcel J0 = iVar2.J0();
                int i12 = i7.f.a;
                J0.writeStrongBinder(aVar);
                J0.writeString(str);
                iVar2.K0(J0, 2);
                break;
        }
    }

    @Override // ci.pc
    public void b(int i10) {
        ci.e0 e0Var = ((b7) this.b).E;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ci.d0 d0Var = (ci.d0) obj;
                if (d0Var.a == i10) {
                    d0Var.b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    public JSONObject b0() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(w9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e7) {
                        e = e7;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        w9.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    w9.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            w9.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            w9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // ii.h1
    public void c(ii.i1 i1Var) {
        d3 d3Var = ((q5) this.b).E;
        if (d3Var != null) {
            x3 x3Var = d3Var.a;
            x3.N1(x3Var, i1Var);
            x3Var.f3.r(i1Var, true);
        }
    }

    @Override // k2.n
    public void d() {
        ((FfmpegAudioRenderer) this.b).f0 = true;
    }

    @Override // org.telegram.ui.mv0
    public /* synthetic */ TextureView d0() {
        return null;
    }

    @Override // ci.pc
    public void e(float f7) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.u0 = f7;
        l8Var.j = true;
        b7Var.c();
    }

    @Override // ii.h1
    public boolean f() {
        q5 q5Var = (q5) this.b;
        d3 d3Var = q5Var.E;
        if (d3Var == null || q5Var.a == null) {
            return false;
        }
        return d3Var.a.T4();
    }

    @Override // k2.n
    public void f0(Exception exc) {
        e2.a.f("DecoderAudioRenderer", "Audio sink error", exc);
        x xVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) xVar.b;
        if (handler != null) {
            handler.post(new k2.f(xVar, exc, 1));
        }
    }

    @Override // ci.pc
    public void g(float f7) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.G = f7;
        l8Var.j = true;
        b7Var.c();
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // ci.pc
    public void h(long j3, boolean z10) {
        b7 b7Var = (b7) this.b;
        if (!z10) {
            b7Var.m(j3);
            return;
        }
        k81 k81Var = b7Var.e;
        if (k81Var != null) {
            k81Var.L(j3, true);
            return;
        }
        if (b7Var.j()) {
            b7Var.E.m(j3, true);
            return;
        }
        k81 k81Var2 = b7Var.y;
        if (k81Var2 != null) {
            k81Var2.L(j3, false);
        }
    }

    @Override // ii.h1
    public void i(int i10, int i11) {
        i2 i2Var;
        q5 q5Var = (q5) this.b;
        d3 d3Var = q5Var.E;
        if (d3Var == null || q5Var.a == null || (i2Var = d3Var.a.H3) == null) {
            return;
        }
        i2Var.f(i10, i11);
    }

    @Override // androidx.activity.result.b
    public void j(Object obj) {
        switch (this.a) {
            case 7:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                k0 k0Var = (k0) this.b;
                androidx.fragment.app.g0 g0Var = (androidx.fragment.app.g0) k0Var.F.pollFirst();
                if (g0Var != null) {
                    String str = g0Var.a;
                    int i10 = g0Var.b;
                    androidx.fragment.app.s l4 = k0Var.c.l(str);
                    if (l4 != null) {
                        l4.x(i10, aVar.a, aVar.b);
                        break;
                    } else {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                        break;
                    }
                } else {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                }
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.b;
                int i11 = u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.M;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, intent == null ? null : intent.getExtras());
                }
                int i12 = aVar2.a;
                if (i12 != -1 || i11 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // k2.n
    public void k0() {
        ((FfmpegAudioRenderer) this.b).Z = true;
    }

    public void l(l lVar, androidx.biometric.t tVar) {
        Object obj = this.b;
        l0 l0Var = (l0) obj;
        if (l0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (l0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        l0 l0Var2 = (l0) obj;
        p pVar = (p) l0Var2.D("androidx.biometric.BiometricFragment");
        if (pVar == null) {
            pVar = new p();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(l0Var2);
            aVar.f(0, pVar, "androidx.biometric.BiometricFragment");
            aVar.e(true, true);
            l0Var2.A(true);
            l0Var2.E();
        }
        androidx.fragment.app.v k10 = pVar.k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        androidx.biometric.x xVar = pVar.l0;
        xVar.f = lVar;
        int i10 = lVar.a;
        if (i10 == 0) {
            i10 = tVar != null ? 15 : 255;
        }
        if (Build.VERSION.SDK_INT < 30 && i10 == 15 && tVar == null) {
            xVar.g = m.a();
        } else {
            xVar.g = tVar;
        }
        if (pVar.Q()) {
            pVar.l0.k = pVar.q(R.string.confirm_device_credential_password);
        } else {
            pVar.l0.k = null;
        }
        if (pVar.Q() && new aa.a(new k6.h(k10, 1)).f(255) != 0) {
            pVar.l0.n = true;
            pVar.S();
        } else if (pVar.l0.p) {
            pVar.k0.postDelayed(new androidx.biometric.o(pVar), 600L);
        } else {
            pVar.X();
        }
    }

    @Override // ii.h1
    public /* synthetic */ boolean m(ii.i1 i1Var) {
        return false;
    }

    @Override // l.i
    public void n(k kVar) {
        f3 f3Var = ((ActionMenuView) this.b).K;
        if (f3Var != null) {
            f3Var.n(kVar);
        }
    }

    @Override // ci.pc
    public void o() {
        b7 b7Var = (b7) this.b;
        b7Var.s(null, null, true);
        lc lcVar = ((zb) b7Var).C0;
        zb zbVar = lcVar.X0;
        if (zbVar != null) {
            zbVar.s(null, null, true);
        }
        nb nbVar = lcVar.v1;
        if (nbVar != null) {
            nbVar.p0();
        }
        ci.bc bcVar = lcVar.c1;
        if (bcVar != null) {
            bcVar.setHasRoundVideo(false);
        }
        l8 l8Var = lcVar.K1;
        if (l8Var != null) {
            File file = l8Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                lcVar.K1.o0 = null;
            }
            if (lcVar.K1.p0 != null) {
                try {
                    new File(lcVar.K1.p0).delete();
                } catch (Exception unused2) {
                }
                lcVar.K1.p0 = null;
            }
        }
    }

    @Override // k2.n
    public void o0(k2.k kVar) {
        x xVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) xVar.b;
        if (handler != null) {
            handler.post(new k2.h(xVar, kVar, 0));
        }
    }

    @Override // k2.n
    public void onAudioSessionIdChanged(int i10) {
        x xVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) xVar.b;
        if (handler != null) {
            handler.post(new p8(xVar, i10, 11));
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 15:
                d6.c.h((d6.c) ((d6.j) this.b).c, "joinApplication", task);
                break;
            default:
                ae.m mVar = (ae.m) this.b;
                Exception exception = task.getException();
                if (exception != null) {
                    mVar.resumeWith(a8.a(exception));
                    break;
                } else if (!task.isCanceled()) {
                    mVar.resumeWith(task.getResult());
                    break;
                } else {
                    mVar.n(null);
                    break;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        a5.a aVar;
        a5.a aVar2;
        b5.h hVar;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) te.b.a(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        xa.d[] dVarArr = new xa.d[ports.length];
        for (int i10 = 0; i10 < ports.length; i10++) {
            InvocationHandler invocationHandler3 = ports[i10];
            xa.d dVar = new xa.d(6, false);
            dVar.b = (WebMessagePortBoundaryInterface) te.b.a(WebMessagePortBoundaryInterface.class, invocationHandler3);
            dVarArr[i10] = dVar;
        }
        if (b5.m.a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) te.b.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                aVar = new a5.a(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    aVar2 = null;
                    if (aVar2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) te.b.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        b5.h hVar2 = (b5.h) jsReplyProxyBoundaryInterface.getOrCreatePeer(new b5.g(jsReplyProxyBoundaryInterface, 0));
                        m4.w wVar = (m4.w) this.b;
                        switch (wVar.a) {
                            case 8:
                                oi.k kVar = (oi.k) wVar.b;
                                if (webView == kVar.o && z10 && uri != null && kVar.f.equals(uri.toString()) && kVar.h(webView)) {
                                    int i11 = aVar2.b;
                                    if (i11 != 0) {
                                        if (i11 == 1) {
                                            synchronized (kVar.a) {
                                                if (!kVar.u && (hVar = kVar.p) != null && hVar == hVar2) {
                                                    aVar2.g(1);
                                                    byte[] bArr = (byte[]) aVar2.d;
                                                    Objects.requireNonNull(bArr);
                                                    kVar.k.execute(new i0(13, kVar, bArr));
                                                }
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    aVar2.g(0);
                                    String str = (String) aVar2.c;
                                    if (kVar.q || str == null || !str.startsWith("tproxy-base64:")) {
                                        kVar.g(str, hVar2);
                                        return;
                                    }
                                    synchronized (kVar.a) {
                                        if (!kVar.u && kVar.r && kVar.p == hVar2) {
                                            if (str.length() - 14 > 1398112) {
                                                kVar.f();
                                            } else {
                                                kVar.k.execute(new i0(12, kVar, str));
                                            }
                                        }
                                    }
                                    return;
                                }
                                return;
                            default:
                                y0 y0Var = (y0) wVar.b;
                                b1 b1Var = y0Var.Q;
                                if (webView != y0Var || b1Var == null) {
                                    return;
                                }
                                if (webView != b1Var.a || aVar2.b != 0) {
                                    b1Var.g("onBotWebMessage ignored: invalid source or payload");
                                    return;
                                }
                                String k10 = b1.k(uri == null ? null : uri.toString());
                                if (b1Var.t0 && (TextUtils.isEmpty(b1Var.F0) || !TextUtils.equals(b1Var.F0, k10) || !TextUtils.equals(b1Var.F0, b1Var.getOriginHost()))) {
                                    b1Var.g("onBotWebMessage ignored: untrusted origin");
                                    return;
                                }
                                ea f7 = b1Var.f();
                                try {
                                    aVar2.g(0);
                                    String str2 = (String) aVar2.c;
                                    if (str2 != null && str2.length() <= 1048576) {
                                        JSONObject jSONObject = new JSONObject(str2);
                                        String string = jSONObject.getString("eventType");
                                        if (!string.isEmpty() && string.length() <= 128) {
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0(b1Var, webView, f7, string, jSONObject.optString("eventData", null), 2));
                                            return;
                                        }
                                        b1Var.g("onBotWebMessage ignored: invalid event type");
                                        return;
                                    }
                                    b1Var.g("onBotWebMessage ignored: invalid payload length");
                                    return;
                                } catch (JSONException e7) {
                                    FileLog.e(e7);
                                    return;
                                }
                        }
                    }
                    return;
                }
                aVar = new a5.a(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
            }
        } else {
            aVar = new a5.a(webMessageBoundaryInterface.getData());
        }
        aVar2 = aVar;
        if (aVar2 == null) {
        }
    }

    @Override // k2.n
    public void onSkipSilenceEnabledChanged(boolean z10) {
        x xVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) xVar.b;
        if (handler != null) {
            handler.post(new bi.f(8, xVar, z10));
        }
    }

    @Override // ci.pc
    public void p(float f7) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.s0 = f7;
        l8Var.j = true;
        b7Var.y(true);
    }

    @Override // ci.pc
    public void q(boolean z10) {
        b7 b7Var = (b7) this.b;
        if (b7Var.j()) {
            b7Var.E.getClass();
        }
        b7Var.x(-4, z10);
    }

    @Override // ii.h1
    public /* synthetic */ boolean r(ii.i1 i1Var) {
        return false;
    }

    @Override // f6.a
    public void s(Bitmap bitmap) {
        g6.b bVar = f6.i.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f7 = width;
            int height = bitmap.getHeight();
            int B = (int) a1.g.B(f7, 9.0f, 16.0f, 0.5f);
            float f10 = (B - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f7, height + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, B, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((f6.i) this.b).e(bitmap2, 0);
    }

    @Override // ci.pc
    public void u(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null || (arrayList = l8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((l8) b7Var.d.T.get(i10)).P = f7;
    }

    @Override // fb.n
    public Object v2() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new db.j("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new db.j("Invalid EnumSet type: " + type.toString());
    }

    @Override // lg.o
    public void w() {
        ((ci.l0) this.b).e.invalidate();
    }

    @Override // org.telegram.ui.mv0
    public void w0(MessageObject messageObject) {
        ((bc) ((f6) this.b).Q1).f(true);
    }

    @Override // ii.h1
    public void x(ii.i1 i1Var, int i10, int i11) {
        d3 d3Var;
        o9 textSelectionHelper;
        q5 q5Var = (q5) this.b;
        if (q5Var.G || i10 == i11 || (d3Var = q5Var.E) == null || (textSelectionHelper = d3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == q5Var) {
            return;
        }
        q5Var.post(new w4(this, i1Var, i11, textSelectionHelper, i10, 4));
    }

    @Override // ci.pc
    public void y(float f7) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.P = f7;
        b7Var.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05eb A[Catch: a | c -> 0x067e, TryCatch #1 {a | c -> 0x067e, blocks: (B:294:0x05d1, B:295:0x05e7, B:297:0x05eb, B:298:0x05ee, B:300:0x05f2, B:302:0x05fc, B:304:0x0602, B:309:0x0607), top: B:293:0x05d1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public aa.a z(pf.b bVar) {
        int i10;
        ArrayList arrayList;
        ic.c cVar;
        ic.c cVar2;
        ic.c cVar3;
        float f7;
        float f10;
        ic.a aVar;
        float f11;
        float f12;
        float f13;
        int i11;
        int i12;
        cc.j[] jVarArr;
        cc.a aVar2;
        dc.b bVar2;
        int i13;
        dc.d dVar;
        int i14;
        aa.a aVar3;
        List list;
        String str;
        int i15;
        boolean z10;
        double d;
        double abs;
        int i16;
        int i17;
        int i18;
        xa.d dVar2 = (xa.d) this.b;
        dc.b G = bVar.G();
        a6.i iVar = new a6.i(G, 26);
        ic.e eVar = new ic.e(G);
        int i19 = G.b;
        int i20 = G.a;
        int i21 = (i19 * 3) / 388;
        int i22 = 3;
        if (i21 < 3) {
            i21 = 3;
        }
        char c10 = 5;
        int[] iArr = new int[5];
        int i23 = i21 - 1;
        int i24 = 0;
        boolean z11 = false;
        while (true) {
            char c11 = c10;
            int i25 = 1;
            i10 = i22;
            arrayList = eVar.b;
            if (i23 >= i19 || z11) {
                break;
            }
            Arrays.fill(iArr, i24);
            int i26 = i24;
            while (i26 < i20) {
                if (G.b(i26, i23)) {
                    if ((i24 & 1) == i25) {
                        i24++;
                    }
                    iArr[i24] = iArr[i24] + i25;
                    i16 = i19;
                } else if ((i24 & 1) != 0) {
                    i16 = i19;
                    iArr[i24] = iArr[i24] + 1;
                } else if (i24 == 4) {
                    if (!ic.e.b(iArr)) {
                        i16 = i19;
                        int i27 = i25;
                        iArr[0] = iArr[2];
                        iArr[i27] = iArr[i10];
                        iArr[2] = iArr[4];
                        iArr[i10] = i27;
                        iArr[4] = 0;
                    } else if (eVar.c(i23, i26, iArr)) {
                        if (eVar.c) {
                            z11 = eVar.d();
                            i16 = i19;
                            i17 = 2;
                        } else {
                            if (arrayList.size() > i25) {
                                int size = arrayList.size();
                                int i28 = 0;
                                ic.c cVar4 = null;
                                while (true) {
                                    if (i28 >= size) {
                                        i16 = i19;
                                        i17 = 2;
                                        i18 = 0;
                                        break;
                                    }
                                    Object obj = arrayList.get(i28);
                                    i28++;
                                    ic.c cVar5 = (ic.c) obj;
                                    i16 = i19;
                                    if (cVar5.d >= 2) {
                                        if (cVar4 != null) {
                                            eVar.c = true;
                                            i17 = 2;
                                            i18 = ((int) (Math.abs(cVar4.a - cVar5.a) - Math.abs(cVar4.b - cVar5.b))) / 2;
                                            break;
                                        }
                                        cVar4 = cVar5;
                                    }
                                    i19 = i16;
                                }
                            } else {
                                i16 = i19;
                                i18 = 0;
                                i17 = 2;
                            }
                            if (i18 > iArr[i17]) {
                                i23 += (i18 - r5) - 2;
                                i26 = i20 - 1;
                            }
                        }
                        Arrays.fill(iArr, 0);
                        i24 = 0;
                        i21 = i17;
                    } else {
                        i16 = i19;
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[i10];
                        iArr[2] = iArr[4];
                        iArr[i10] = 1;
                        iArr[4] = 0;
                    }
                    i24 = i10;
                } else {
                    i16 = i19;
                    int i29 = i24 + 1;
                    iArr[i29] = iArr[i29] + 1;
                    i24 = i29;
                }
                i26++;
                i19 = i16;
                i25 = 1;
            }
            int i30 = i19;
            if (ic.e.b(iArr) && eVar.c(i23, i20, iArr)) {
                int i31 = iArr[0];
                if (eVar.c) {
                    i21 = i31;
                    z11 = eVar.d();
                } else {
                    i21 = i31;
                }
            }
            i23 += i21;
            c10 = c11;
            i22 = i10;
            i19 = i30;
            i24 = 0;
        }
        if (arrayList.size() < i10) {
            throw cc.e.a();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((ic.c) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList, ic.e.e);
        ic.c[] cVarArr = new ic.c[3];
        int i32 = 0;
        double d10 = Double.MAX_VALUE;
        for (int i33 = 2; i32 < arrayList.size() - i33; i33 = 2) {
            ic.c cVar6 = (ic.c) arrayList.get(i32);
            float f14 = cVar6.c;
            i32++;
            int i34 = i32;
            while (i34 < arrayList.size() - 1) {
                ic.c cVar7 = (ic.c) arrayList.get(i34);
                double e7 = ic.e.e(cVar6, cVar7);
                i34++;
                for (int i35 = i34; i35 < arrayList.size(); i35++) {
                    ic.c cVar8 = (ic.c) arrayList.get(i35);
                    if (cVar8.c <= 1.4f * f14) {
                        double e10 = ic.e.e(cVar7, cVar8);
                        double e11 = ic.e.e(cVar6, cVar8);
                        if (e7 < e10) {
                            if (e10 <= e11) {
                                e11 = e10;
                                e10 = e11;
                            } else if (e7 >= e11) {
                                d = e11;
                                e11 = e7;
                                abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                                if (abs >= d10) {
                                    cVarArr[0] = cVar6;
                                    cVarArr[1] = cVar7;
                                    cVarArr[2] = cVar8;
                                    d10 = abs;
                                }
                            }
                            d = e7;
                            abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                            if (abs >= d10) {
                            }
                        } else {
                            if (e10 >= e11) {
                                d = e11;
                                e11 = e10;
                            } else if (e7 < e11) {
                                d = e10;
                                e10 = e11;
                                e11 = e7;
                                abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                                if (abs >= d10) {
                                }
                            } else {
                                d = e10;
                            }
                            e10 = e7;
                            abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                            if (abs >= d10) {
                            }
                        }
                    }
                }
            }
        }
        if (d10 == Double.MAX_VALUE) {
            throw cc.e.a();
        }
        float a2 = cc.j.a(cVarArr[0], cVarArr[1]);
        float a10 = cc.j.a(cVarArr[1], cVarArr[2]);
        float a11 = cc.j.a(cVarArr[0], cVarArr[2]);
        if (a10 >= a2 && a10 >= a11) {
            cVar = cVarArr[0];
            cVar2 = cVarArr[1];
            cVar3 = cVarArr[2];
        } else if (a11 < a10 || a11 < a2) {
            cVar = cVarArr[2];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[1];
        } else {
            cVar = cVarArr[1];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[2];
        }
        float f15 = cVar.a;
        float f16 = cVar.b;
        if (com.google.android.gms.internal.vision.e2.b(cVar2.a, f15, cVar3.b - f16, (cVar2.b - f16) * (cVar3.a - f15)) < 0.0f) {
            ic.c cVar9 = cVar3;
            cVar3 = cVar2;
            cVar2 = cVar9;
        }
        cVarArr[0] = cVar2;
        cVarArr[1] = cVar;
        cVarArr[2] = cVar3;
        float L = iVar.L(cVar, cVar3);
        float f17 = cVar.a;
        float f18 = cVar3.b;
        float f19 = cVar3.a;
        float L2 = iVar.L(cVar, cVar2);
        float f20 = cVar2.b;
        float f21 = cVar2.a;
        float f22 = (L2 + L) / 2.0f;
        if (f22 < 1.0f) {
            throw cc.e.a();
        }
        float a12 = cc.j.a(cVar, cVar3) / f22;
        int i36 = (int) (a12 + (a12 < 0.0f ? -0.5f : 0.5f));
        float a13 = cc.j.a(cVar, cVar2) / f22;
        int i37 = (((int) (a13 + (a13 >= 0.0f ? 0.5f : -0.5f))) + i36) / 2;
        int i38 = i37 + 7;
        int i39 = i38 & 3;
        if (i39 == 0) {
            i38 = i37 + 8;
        } else if (i39 == 2) {
            i38 = i37 + 6;
        } else if (i39 == 3) {
            i38 = i37 + 5;
        }
        int i40 = i38;
        int[] iArr2 = hc.f.e;
        if (i40 % 4 != 1) {
            throw cc.c.a();
        }
        try {
            hc.f c12 = hc.f.c((i40 - 17) / 4);
            int i41 = 10;
            int i42 = (c12.a * 4) + 10;
            if (c12.b.length > 0) {
                float f23 = (f19 - f17) + f21;
                f10 = f19;
                float f24 = (f18 - f16) + f20;
                float f25 = 1.0f - (3.0f / i42);
                int y3 = (int) com.google.android.gms.internal.vision.e2.y(f23, f17, f25, f17);
                int y10 = (int) com.google.android.gms.internal.vision.e2.y(f24, f16, f25, f16);
                f7 = f17;
                for (int i43 = 4; i43 <= 16; i43 <<= 1) {
                    try {
                        aVar = iVar.O(f22, i43, y3, y10);
                        break;
                    } catch (cc.e unused) {
                    }
                }
            } else {
                f7 = f17;
                f10 = f19;
            }
            aVar = null;
            float f26 = i40 - 3.5f;
            if (aVar != null) {
                f11 = aVar.a;
                f12 = aVar.b;
                f13 = f26 - 3.0f;
            } else {
                f11 = (f10 - f7) + f21;
                f12 = (f18 - f16) + f20;
                f13 = f26;
            }
            float f27 = f12;
            float f28 = cVar.a;
            float f29 = cVar.b;
            float f30 = cVar3.a;
            float f31 = cVar3.b;
            float f32 = cVar2.a;
            float f33 = cVar2.b;
            dc.g a14 = dc.g.a(3.5f, 3.5f, f26, 3.5f, f13, f13, 3.5f, f26);
            ic.a aVar4 = aVar;
            float f34 = a14.e;
            float f35 = a14.i;
            float f36 = f34 * f35;
            float f37 = a14.f;
            float f38 = a14.h;
            float f39 = f36 - (f37 * f38);
            float f40 = a14.g;
            float f41 = f37 * f40;
            float f42 = a14.d;
            float f43 = f41 - (f42 * f35);
            float f44 = (f42 * f38) - (f34 * f40);
            float f45 = a14.c;
            float f46 = f45 * f38;
            float f47 = a14.b;
            float f48 = f46 - (f47 * f35);
            float f49 = a14.a;
            float f50 = (f35 * f49) - (f45 * f40);
            float f51 = (f40 * f47) - (f38 * f49);
            float f52 = (f47 * f37) - (f45 * f34);
            float f53 = (f45 * f42) - (f37 * f49);
            float f54 = (f49 * f34) - (f47 * f42);
            dc.g a15 = dc.g.a(f28, f29, f30, f31, f11, f27, f32, f33);
            float f55 = a15.a;
            float f56 = a15.d;
            float f57 = a15.g;
            float f58 = (f57 * f52) + (f56 * f48) + (f55 * f39);
            float f59 = (f57 * f53) + (f56 * f50) + (f55 * f43);
            float f60 = (f57 * f54) + (f56 * f51) + (f55 * f44);
            float f61 = a15.b;
            float f62 = a15.e;
            float f63 = a15.h;
            float f64 = (f63 * f52) + (f62 * f48) + (f61 * f39);
            float f65 = (f63 * f53) + (f62 * f50) + (f61 * f43);
            float f66 = (f63 * f54) + (f62 * f51) + (f61 * f44);
            float f67 = a15.c;
            float f68 = a15.f;
            float f69 = a15.i;
            float f70 = (f52 * f69) + (f48 * f68) + (f39 * f67);
            float f71 = (f53 * f69) + (f50 * f68) + (f43 * f67);
            float f72 = (f69 * f54) + (f68 * f51) + (f67 * f44);
            if (i40 <= 0 || i40 <= 0) {
                throw cc.e.a();
            }
            dc.b bVar3 = new dc.b(i40, i40);
            int i44 = i40 * 2;
            ic.c cVar10 = cVar;
            float[] fArr = new float[i44];
            int i45 = 0;
            while (i45 < i40) {
                int i46 = i40;
                float f73 = i45 + 0.5f;
                int i47 = 0;
                while (i47 < i44) {
                    int i48 = i47;
                    fArr[i48] = (i48 / 2) + 0.5f;
                    fArr[i48 + 1] = f73;
                    i47 = i48 + 2;
                }
                int i49 = i44 - 1;
                int i50 = i45;
                int i51 = 0;
                while (i51 < i49) {
                    float f74 = fArr[i51];
                    int i52 = i51 + 1;
                    int i53 = i51;
                    float f75 = fArr[i52];
                    ic.c cVar11 = cVar2;
                    float d11 = sc.v.d(f71, f75, f70 * f74, f72);
                    fArr[i53] = (((f59 * f75) + (f58 * f74)) + f60) / d11;
                    fArr[i52] = (((f75 * f65) + (f74 * f64)) + f66) / d11;
                    i51 = i53 + 2;
                    cVar2 = cVar11;
                }
                ic.c cVar12 = cVar2;
                int i54 = G.b;
                float f76 = f71;
                int i55 = 0;
                boolean z12 = true;
                while (i55 < i49 && z12) {
                    int i56 = (int) fArr[i55];
                    int i57 = i55 + 1;
                    int i58 = i49;
                    int i59 = (int) fArr[i57];
                    int i60 = i55;
                    if (i56 < -1 || i56 > i20 || i59 < -1 || i59 > i54) {
                        throw cc.e.a();
                    }
                    if (i56 == -1) {
                        fArr[i60] = 0.0f;
                    } else if (i56 == i20) {
                        fArr[i60] = i20 - 1;
                    } else {
                        z10 = false;
                        if (i59 != -1) {
                            fArr[i57] = 0.0f;
                        } else if (i59 == i54) {
                            fArr[i57] = i54 - 1;
                        } else {
                            z12 = z10;
                            i55 = i60 + 2;
                            i49 = i58;
                        }
                        z12 = true;
                        i55 = i60 + 2;
                        i49 = i58;
                    }
                    z10 = true;
                    if (i59 != -1) {
                    }
                    z12 = true;
                    i55 = i60 + 2;
                    i49 = i58;
                }
                int i61 = i44 - 2;
                boolean z13 = true;
                while (i61 >= 0 && z13) {
                    int i62 = (int) fArr[i61];
                    int i63 = i61 + 1;
                    int i64 = i61;
                    int i65 = (int) fArr[i63];
                    if (i62 < -1 || i62 > i20 || i65 < -1 || i65 > i54) {
                        throw cc.e.a();
                    }
                    if (i62 == -1) {
                        fArr[i64] = 0.0f;
                    } else if (i62 == i20) {
                        fArr[i64] = i20 - 1;
                    } else {
                        z13 = false;
                        if (i65 != -1) {
                            fArr[i63] = 0.0f;
                        } else if (i65 == i54) {
                            fArr[i63] = i54 - 1;
                        } else {
                            i61 = i64 - 2;
                        }
                        z13 = true;
                        i61 = i64 - 2;
                    }
                    z13 = true;
                    if (i65 != -1) {
                    }
                    z13 = true;
                    i61 = i64 - 2;
                }
                for (int i66 = 0; i66 < i44; i66 += 2) {
                    try {
                        if (G.b((int) fArr[i66], (int) fArr[i66 + 1])) {
                            int i67 = i66 / 2;
                            int i68 = (i67 / 32) + (bVar3.c * i50);
                            int[] iArr3 = bVar3.d;
                            iArr3[i68] = iArr3[i68] | (1 << (i67 & 31));
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw cc.e.a();
                    }
                }
                i45 = i50 + 1;
                i40 = i46;
                f71 = f76;
                cVar2 = cVar12;
            }
            ic.c cVar13 = cVar2;
            if (aVar4 == null) {
                i12 = 3;
                i11 = 1;
                jVarArr = new cc.j[]{cVar13, cVar10, cVar3};
            } else {
                i11 = 1;
                i12 = 3;
                jVarArr = new cc.j[]{cVar13, cVar10, cVar3, aVar4};
            }
            cc.j[] jVarArr2 = jVarArr;
            dVar2.getClass();
            com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
            int i69 = bVar3.b;
            if (i69 < 21 || (i69 & i12) != i11) {
                throw cc.c.a();
            }
            mVar.b = bVar3;
            try {
                dVar = dVar2.b(mVar);
            } catch (cc.a e12) {
                aVar2 = e12;
                e = null;
                try {
                    mVar.u();
                    mVar.c = null;
                    mVar.d = null;
                    mVar.a = true;
                    mVar.t();
                    mVar.s();
                    bVar2 = (dc.b) mVar.b;
                    i13 = 0;
                    while (i13 < bVar2.a) {
                        int i70 = i13 + 1;
                        for (int i71 = i70; i71 < bVar2.b; i71++) {
                            if (bVar2.b(i13, i71) != bVar2.b(i71, i13)) {
                                bVar2.a(i71, i13);
                                bVar2.a(i13, i71);
                            }
                        }
                        i13 = i70;
                    }
                    dc.d b10 = dVar2.b(mVar);
                    b10.e = new na.d(i41);
                    dVar = b10;
                    i14 = dVar.f;
                    if (com.google.android.gms.internal.vision.e2.t(dVar.e)) {
                        cc.j jVar = jVarArr2[0];
                        jVarArr2[0] = jVarArr2[2];
                        jVarArr2[2] = jVar;
                    }
                    aVar3 = new aa.a(dVar.a, jVarArr2);
                    list = dVar.b;
                    if (list != null) {
                    }
                    str = dVar.c;
                    if (str != null) {
                    }
                    if (i14 >= 0) {
                        aVar3.s(cc.i.d, Integer.valueOf(i15));
                        aVar3.s(cc.i.e, Integer.valueOf(i14));
                    }
                    aVar3.s(cc.i.c, dVar.d);
                    aVar3.s(cc.i.f, "]Q" + dVar.h);
                    return aVar3;
                } catch (cc.a | cc.c unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw aVar2;
                }
            } catch (cc.c e13) {
                e = e13;
                aVar2 = null;
                mVar.u();
                mVar.c = null;
                mVar.d = null;
                mVar.a = true;
                mVar.t();
                mVar.s();
                bVar2 = (dc.b) mVar.b;
                i13 = 0;
                while (i13 < bVar2.a) {
                }
                dc.d b102 = dVar2.b(mVar);
                b102.e = new na.d(i41);
                dVar = b102;
                i14 = dVar.f;
                if (com.google.android.gms.internal.vision.e2.t(dVar.e)) {
                }
                aVar3 = new aa.a(dVar.a, jVarArr2);
                list = dVar.b;
                if (list != null) {
                }
                str = dVar.c;
                if (str != null) {
                }
                if (i14 >= 0) {
                }
                aVar3.s(cc.i.c, dVar.d);
                aVar3.s(cc.i.f, "]Q" + dVar.h);
                return aVar3;
            }
            i14 = dVar.f;
            if (com.google.android.gms.internal.vision.e2.t(dVar.e) && jVarArr2.length >= 3) {
                cc.j jVar2 = jVarArr2[0];
                jVarArr2[0] = jVarArr2[2];
                jVarArr2[2] = jVar2;
            }
            aVar3 = new aa.a(dVar.a, jVarArr2);
            list = dVar.b;
            if (list != null) {
                aVar3.s(cc.i.a, list);
            }
            str = dVar.c;
            if (str != null) {
                aVar3.s(cc.i.b, str);
            }
            if (i14 >= 0 && (i15 = dVar.g) >= 0) {
                aVar3.s(cc.i.d, Integer.valueOf(i15));
                aVar3.s(cc.i.e, Integer.valueOf(i14));
            }
            aVar3.s(cc.i.c, dVar.d);
            aVar3.s(cc.i.f, "]Q" + dVar.h);
            return aVar3;
        } catch (IllegalArgumentException unused4) {
            throw cc.c.a();
        }
    }

    @Override // k2.n
    public void z0(k2.k kVar) {
        x xVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) xVar.b;
        if (handler != null) {
            handler.post(new k2.h(xVar, kVar, 1));
        }
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public c(Set set) {
        this.a = 0;
        this.b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            HashMap hashMap = (HashMap) this.b;
            bVar.getClass();
            hashMap.put(a.class, bVar.a);
        }
    }

    public c(Context context) {
        this.a = 9;
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public c(ba.c cVar) {
        this.a = 16;
        this.b = new File(cVar.b, "com.crashlytics.settings.json");
    }

    public c() {
        this.a = 22;
        this.b = new xa.d(21);
    }

    public c(LaunchActivity launchActivity, Executor executor, v7.l lVar) {
        this.a = 5;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            l0 s10 = launchActivity.s();
            androidx.biometric.x xVar = (androidx.biometric.x) new aa.a(launchActivity).j(androidx.biometric.x.class);
            this.b = s10;
            xVar.d = executor;
            xVar.e = lVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override // lg.o
    public void W() {
    }

    @Override // ii.h1
    public /* synthetic */ void t() {
    }

    @Override // k2.n
    public /* synthetic */ void v() {
    }

    @Override // k2.n
    public /* synthetic */ void y0() {
    }

    @Override // lg.o
    public void D(boolean z10) {
    }

    @Override // lg.o
    public void S(boolean z10) {
    }

    @Override // ii.h1
    public /* synthetic */ void k(ii.i1 i1Var) {
    }
}
