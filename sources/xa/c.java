package xa;

import a0.i;
import a8.e;
import a8.g;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.biometric.u;
import androidx.biometric.y;
import androidx.fragment.app.f0;
import androidx.fragment.app.k0;
import androidx.fragment.app.v;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import b5.m;
import bi.ad;
import bi.ce;
import bi.e8;
import bi.ge;
import bi.i0;
import bi.j0;
import bi.j7;
import bi.nd;
import bi.q0;
import bi.qd;
import bi.r9;
import bi.va;
import bi.wc;
import c5.b0;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import dc.d;
import ei.s0;
import ei.t0;
import fb.n;
import fg.c2;
import fg.l1;
import g.r;
import hi.g2;
import hi.g6;
import hi.k1;
import hi.k2;
import hi.l0;
import hi.m3;
import hi.m4;
import hi.s3;
import hi.t3;
import hi.w3;
import hi.x3;
import hi.x4;
import hi.y1;
import hi.y3;
import hi.z3;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import k2.f;
import k2.h0;
import k2.k;
import kg.o;
import l.l;
import l.x;
import m.r3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.yi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import pg.b2;
import r2.j;
import v7.a7;
import w9.h;
import x2.p;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c implements s, a0, androidx.activity.result.b, WebMessageListenerBoundaryInterface, o, ge, OnCompleteListener, s0, n, c2, x, l0, x3, k2.n {
    public static volatile c c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // kg.o
    public void A() {
        ((q0) this.b).e.invalidate();
    }

    @Override // bi.ge
    public void B(float f7, int i10) {
        ArrayList arrayList;
        e8 e8Var = (e8) this.b;
        r9 r9Var = e8Var.d;
        if (r9Var == null || (arrayList = r9Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((r9) e8Var.d.T.get(i10)).P = f7;
    }

    public JSONObject B0() {
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
                        jSONObject = new JSONObject(h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public float C0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 1;
        boolean z10 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i19 = (-abs) / 2;
        int i20 = i14 < i16 ? 1 : -1;
        int i21 = i15 < i17 ? 1 : -1;
        int i22 = i16 + i20;
        int i23 = i14;
        int i24 = i15;
        int i25 = 0;
        while (i23 != i22) {
            boolean z11 = z10;
            int i26 = abs;
            if ((i25 == i18) == ((dc.b) this.b).b(z10 ? i24 : i23, z10 ? i23 : i24)) {
                if (i25 == 2) {
                    return a7.b(i23, i24, i14, i15);
                }
                i25++;
            }
            i19 += abs2;
            if (i19 > 0) {
                if (i24 == i17) {
                    break;
                }
                i24 += i21;
                i19 -= i26;
            }
            i23 += i20;
            abs = i26;
            z10 = z11;
            i18 = 1;
        }
        if (i25 == 2) {
            return a7.b(i22, i17, i14, i15);
        }
        return Float.NaN;
    }

    @Override // fg.c2
    public /* synthetic */ i D() {
        switch (this.a) {
        }
        return null;
    }

    public float D0(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        dc.b bVar = (dc.b) this.b;
        float C0 = C0(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f7 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.a;
            if (i14 >= i16) {
                float f11 = ((i16 - 1) - i10) / (i14 - i10);
                int i17 = i16 - 1;
                f7 = f11;
                i14 = i17;
            } else {
                f7 = 1.0f;
            }
        }
        float f12 = i11;
        int i18 = (int) (f12 - ((i13 - i11) * f7));
        if (i18 < 0) {
            f10 = f12 / (i11 - i18);
        } else {
            int i19 = bVar.b;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (C0(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + C0) - 1.0f;
    }

    @Override // hi.l0
    public s9 E() {
        switch (this.a) {
            case 23:
                t3 t3Var = ((hi.a0) this.b).O;
                if (t3Var != null) {
                    return t3Var.a.getTextSelectionHelper();
                }
                return null;
            default:
                s3 s3Var = ((x4) this.b).N;
                if (s3Var != null) {
                    return s3Var.a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override // ei.s0
    public void F() {
        ei.s sVar = (ei.s) this.b;
        le.b bVar = sVar.a;
        t0 t0Var = sVar.v;
        bVar.a(t0Var.n && t0Var.l == 0, true);
        sVar.d.Y2.N(true);
    }

    @Override // bi.ge
    public void H(float f7) {
        e8 e8Var = (e8) this.b;
        r9 r9Var = e8Var.d;
        if (r9Var == null) {
            return;
        }
        r9Var.P = f7;
        e8Var.c();
    }

    @Override // bi.ge
    public void I(float f7, boolean z10) {
        e8 e8Var = (e8) this.b;
        r9 r9Var = e8Var.d;
        if (r9Var == null) {
            return;
        }
        r9Var.Z = f7;
        r9Var.j = true;
        t71 t71Var = e8Var.e;
        if (t71Var == null || t71Var.p() == -9223372036854775807L) {
            return;
        }
        e8Var.m((long) (f7 * e8Var.e.p()));
    }

    @Override // hi.l0
    public void J(CharSequence charSequence) {
        switch (this.a) {
            case 23:
                t3 t3Var = ((hi.a0) this.b).O;
                if (t3Var != null) {
                    t3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        t3Var.a.s4(charSequence.toString());
                        break;
                    }
                }
                break;
            default:
                s3 s3Var = ((x4) this.b).N;
                if (s3Var != null) {
                    s3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        s3Var.a.s4(charSequence.toString());
                        break;
                    }
                }
                break;
        }
    }

    @Override // k2.n
    public void L() {
        p pVar;
        h0 h0Var = (h0) this.b;
        synchronized (h0Var.a) {
            pVar = h0Var.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override // hi.l0
    public org.telegram.ui.Cells.r9 M() {
        switch (this.a) {
            case 23:
                return (hi.a0) this.b;
            default:
                return (x4) this.b;
        }
    }

    @Override // hi.l0
    public hi.a O() {
        switch (this.a) {
            case 23:
                return ((hi.a0) this.b).a;
            default:
                return ((x4) this.b).a;
        }
    }

    @Override // fg.c2
    public /* synthetic */ i P() {
        switch (this.a) {
        }
        return null;
    }

    @Override // bi.ge
    public void Q(long j3) {
        e8 e8Var = (e8) this.b;
        r9 r9Var = e8Var.d;
        if (r9Var == null) {
            return;
        }
        r9Var.r0 = j3;
        r9Var.j = true;
        e8Var.y(true);
    }

    @Override // hi.l0
    public boolean R() {
        switch (this.a) {
            case 23:
                hi.a0 a0Var = (hi.a0) this.b;
                t3 t3Var = a0Var.O;
                if (t3Var != null) {
                    hi.a aVar = a0Var.a;
                    if (t3Var.a.R4()) {
                    }
                }
                break;
            default:
                x4 x4Var = (x4) this.b;
                s3 s3Var = x4Var.N;
                if (s3Var != null) {
                    hi.a aVar2 = x4Var.a;
                    if (s3Var.a.R4()) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // bi.ge
    public void S(boolean z10) {
        b2 b2Var;
        ce ceVar = ((nd) ((e8) this.b)).C0;
        ad adVar = ceVar.v1;
        if (adVar == null) {
            return;
        }
        b2 b2Var2 = null;
        if (!z10 && (adVar.getSelectedEntity() instanceof b2)) {
            ceVar.v1.D0(null, true);
            return;
        }
        if (!z10 || (ceVar.v1.getSelectedEntity() instanceof b2)) {
            return;
        }
        j7 j7Var = ceVar.v1.R0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= j7Var.getChildCount()) {
                b2Var = null;
                break;
            }
            View childAt = j7Var.getChildAt(i11);
            if (childAt instanceof b2) {
                b2Var = (b2) childAt;
                break;
            }
            i11++;
        }
        if (b2Var != null) {
            ad adVar2 = ceVar.v1;
            j7 j7Var2 = adVar2.R0;
            while (true) {
                if (i10 >= j7Var2.getChildCount()) {
                    break;
                }
                View childAt2 = j7Var2.getChildAt(i10);
                if (childAt2 instanceof b2) {
                    b2Var2 = (b2) childAt2;
                    break;
                }
                i10++;
            }
            adVar2.D0(b2Var2, true);
        }
    }

    @Override // k2.n
    public void T(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        of.b bVar = ((h0) this.b).Y0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new f(bVar, exc, 1));
        }
    }

    @Override // hi.l0
    public void U(int i10, int i11) {
        switch (this.a) {
            case 23:
                hi.a0 a0Var = (hi.a0) this.b;
                t3 t3Var = a0Var.O;
                if (t3Var != null) {
                    hi.a aVar = a0Var.a;
                    k2 k2Var = t3Var.a.J3;
                    if (k2Var != null) {
                        k2Var.f(i10, i11);
                        break;
                    }
                }
                break;
            default:
                x4 x4Var = (x4) this.b;
                s3 s3Var = x4Var.N;
                if (s3Var != null) {
                    hi.a aVar2 = x4Var.a;
                    k2 k2Var2 = s3Var.a.J3;
                    if (k2Var2 != null) {
                        k2Var2.f(i10, i11);
                        break;
                    }
                }
                break;
        }
    }

    @Override // bi.ge
    public void V(float f7, int i10) {
        ArrayList arrayList;
        e8 e8Var = (e8) this.b;
        r9 r9Var = e8Var.d;
        if (r9Var == null || (arrayList = r9Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((r9) e8Var.d.T.get(i10)).V = f7;
    }

    @Override // k2.n
    public void W() {
        ((h0) this.b).h1 = true;
    }

    @Override // bi.ge
    public void X(float f7) {
        e8 e8Var = (e8) this.b;
        r9 r9Var = e8Var.d;
        if (r9Var == null) {
            return;
        }
        r9Var.F = f7;
        r9Var.j = true;
        e8Var.w(true);
    }

    @Override // hi.x3
    public void Y() {
        g2 g2Var = (g2) this.b;
        g2.Z(g2Var, false, true);
        int i10 = g2Var.I0;
        g2Var.x0(i10 != 2 ? i10 : 0, true);
    }

    @Override // k2.n
    public void Z(k kVar) {
        of.b bVar = ((h0) this.b).Y0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new k2.h(bVar, kVar, 0));
        }
    }

    @Override // fg.c2
    public void a(int i10) {
        switch (this.a) {
            case 19:
                ((l1) this.b).l();
                break;
            default:
                AndroidUtilities.runOnUIThread(new wc(this, 27));
                break;
        }
    }

    @Override // hi.x3
    public w70 a0(View view) {
        return w70.H((g2) this.b, view);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        l8.a aVar = (l8.a) this.b;
        e eVar = new e(0, (TaskCompletionSource) obj2);
        a8.c cVar = (a8.c) ((g) obj).u();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        int i10 = a8.a.a;
        obtain.writeStrongBinder(eVar);
        obtain.writeInt(1);
        aVar.writeToParcel(obtain, 0);
        cVar.G0(obtain, 2);
    }

    @Override // hi.l0, hi.j1
    public void b(k1 k1Var) {
        switch (this.a) {
            case 23:
                t3 t3Var = ((hi.a0) this.b).O;
                if (t3Var != null) {
                    z3 z3Var = t3Var.a;
                    z3.L1(z3Var, k1Var);
                    z3Var.h3.C(k1Var, true);
                    break;
                }
                break;
            default:
                s3 s3Var = ((x4) this.b).N;
                if (s3Var != null) {
                    z3 z3Var2 = s3Var.a;
                    z3.L1(z3Var2, k1Var);
                    z3Var2.h3.C(k1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // hi.l0
    public void b0() {
        switch (this.a) {
            case 23:
                hi.a0 a0Var = (hi.a0) this.b;
                t3 t3Var = a0Var.O;
                if (t3Var != null) {
                    hi.a aVar = a0Var.a;
                    z3 z3Var = t3Var.a;
                    k2 k2Var = z3Var.J3;
                    if (k2Var != null) {
                        k2Var.g();
                    }
                    z3Var.h3.onContentChanged();
                    break;
                }
                break;
            default:
                x4 x4Var = (x4) this.b;
                s3 s3Var = x4Var.N;
                if (s3Var != null) {
                    hi.a aVar2 = x4Var.a;
                    z3 z3Var2 = s3Var.a;
                    k2 k2Var2 = z3Var2.J3;
                    if (k2Var2 != null) {
                        k2Var2.g();
                    }
                    z3Var2.h3.onContentChanged();
                    break;
                }
                break;
        }
    }

    @Override // l.x
    public void c(l lVar, boolean z10) {
        r rVar;
        g.s sVar = (g.s) this.b;
        l k10 = lVar.k();
        int i10 = 0;
        boolean z11 = k10 != lVar;
        if (z11) {
            lVar = k10;
        }
        r[] rVarArr = sVar.U;
        int length = rVarArr != null ? rVarArr.length : 0;
        while (true) {
            if (i10 < length) {
                rVar = rVarArr[i10];
                if (rVar != null && rVar.h == lVar) {
                    break;
                } else {
                    i10++;
                }
            } else {
                rVar = null;
                break;
            }
        }
        if (rVar != null) {
            if (!z11) {
                sVar.h(rVar, z10);
            } else {
                sVar.f(rVar.a, rVar, k10);
                sVar.h(rVar, true);
            }
        }
    }

    @Override // fg.c2
    public /* synthetic */ boolean c0(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // ei.s0
    public void close() {
        ((ei.s) this.b).finishFragment();
    }

    @Override // bi.ge
    public void d(int i10) {
        j0 j0Var = ((e8) this.b).E;
        if (j0Var != null) {
            ArrayList arrayList = j0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                i0 i0Var = (i0) obj;
                if (i0Var.a == i10) {
                    i0Var.b.d(1.0f, true);
                    j0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override // bi.ge
    public void d0(float f7) {
        e8 e8Var = (e8) this.b;
        r9 r9Var = e8Var.d;
        if (r9Var == null) {
            return;
        }
        r9Var.E = f7;
        r9Var.j = true;
        e8Var.w(true);
    }

    @Override // k2.n
    public void e(long j3) {
        of.b bVar = ((h0) this.b).Y0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new va(bVar, j3, 7));
        }
    }

    @Override // hi.x3
    public void e0() {
        g2 g2Var = (g2) this.b;
        g2Var.z0();
        g2Var.C0();
    }

    @Override // hi.x3
    public boolean f(float f7) {
        boolean z10;
        g2 g2Var = (g2) this.b;
        FrameLayout frameLayout = g2Var.v0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f7 >= r3[1]) {
                z10 = true;
                g2.Z(g2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        g2.Z(g2Var, z10, true);
        return z10;
    }

    @Override // bi.ge
    public void f0(float f7, int i10) {
        ArrayList arrayList;
        e8 e8Var = (e8) this.b;
        r9 r9Var = e8Var.d;
        if (r9Var == null || (arrayList = r9Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((r9) e8Var.d.T.get(i10)).W = f7;
    }

    @Override // hi.l0
    public void g() {
        switch (this.a) {
            case 23:
                hi.a0 a0Var = (hi.a0) this.b;
                t3 t3Var = a0Var.O;
                if (t3Var != null) {
                    z3.O1(t3Var.a, a0Var.a);
                    break;
                }
                break;
            default:
                x4 x4Var = (x4) this.b;
                s3 s3Var = x4Var.N;
                if (s3Var != null) {
                    z3.O1(s3Var.a, x4Var.a);
                    break;
                }
                break;
        }
    }

    @Override // bi.ge
    public void g0(float f7) {
        r9 r9Var = ((e8) this.b).d;
        if (r9Var == null) {
            return;
        }
        r9Var.a0 = f7;
        r9Var.j = true;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // hi.x3
    public void h(g6 g6Var, String str) {
        g2 g2Var = (g2) this.b;
        if (g2Var.z0 == null) {
            g2Var.z0 = new r3(new y1(this, 0), g2Var.getResourceProvider());
        }
        g2Var.z0.d(g6Var, str);
    }

    @Override // bi.ge
    public void h0() {
        ((e8) this.b).q(null);
    }

    @Override // bi.ge
    public void i(float f7) {
        e8 e8Var = (e8) this.b;
        r9 r9Var = e8Var.d;
        if (r9Var == null) {
            return;
        }
        r9Var.u0 = f7;
        r9Var.j = true;
        e8Var.c();
    }

    @Override // androidx.activity.result.b
    public void j(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.b;
        f0 f0Var = (f0) j0Var.F.pollFirst();
        if (f0Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = f0Var.a;
        int i10 = f0Var.b;
        androidx.fragment.app.s l4 = j0Var.c.l(str);
        if (l4 != null) {
            l4.x(i10, aVar.a, aVar.b);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override // k2.n
    public void j0() {
        i2.h0 h0Var = ((h0) this.b).W;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override // hi.x3
    public void k(hi.a aVar) {
        g2 g2Var = (g2) this.b;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(g2Var)) {
            yi yiVar = new yi(g2Var.getParentActivity(), g2Var, false, false, false, g2Var.getResourceProvider());
            yiVar.Z1 = new qb.b(10);
            yiVar.P = true;
            yiVar.x1.setVisibility(8);
            yiVar.t2 = new androidx.car.app.utils.a(g2Var, aVar, yiVar, 9);
            yiVar.r1();
            yiVar.show();
        }
    }

    @Override // fg.c2
    public void k0(ArrayList arrayList) {
        switch (this.a) {
            case 19:
                l1 l1Var = (l1) this.b;
                String str = l1Var.Z;
                if (str != null) {
                    l1Var.U(str, l1Var.c0, l1Var.d0, l1Var.b0, l1Var.a0);
                    break;
                }
                break;
        }
    }

    @Override // k2.n
    public void l() {
        ((h0) this.b).j1 = true;
    }

    @Override // bi.ge
    public void l0(float f7) {
        e8 e8Var = (e8) this.b;
        r9 r9Var = e8Var.d;
        if (r9Var == null) {
            return;
        }
        r9Var.t0 = f7;
        r9Var.j = true;
        e8Var.y(true);
    }

    @Override // bi.ge
    public void m(float f7) {
        e8 e8Var = (e8) this.b;
        r9 r9Var = e8Var.d;
        if (r9Var == null) {
            return;
        }
        r9Var.G = f7;
        r9Var.j = true;
        e8Var.c();
    }

    @Override // bi.ge
    public void n(long j3, boolean z10) {
        e8 e8Var = (e8) this.b;
        if (!z10) {
            e8Var.m(j3);
            return;
        }
        t71 t71Var = e8Var.e;
        if (t71Var != null) {
            t71Var.L(j3, true);
            return;
        }
        if (e8Var.j()) {
            e8Var.E.m(j3, true);
            return;
        }
        t71 t71Var2 = e8Var.y;
        if (t71Var2 != null) {
            t71Var2.L(j3, false);
        }
    }

    @Override // bi.ge
    public void n0(int i10, long j3) {
        ArrayList arrayList;
        e8 e8Var = (e8) this.b;
        r9 r9Var = e8Var.d;
        if (r9Var == null || (arrayList = r9Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((r9) e8Var.d.T.get(i10)).X = j3;
    }

    @Override // fb.n
    public Object n2() {
        Class cls = (Class) this.b;
        try {
            return fb.s.a.a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    @Override // hi.x3
    public void o(y3 y3Var, View view) {
        g2 g2Var = (g2) this.b;
        w70 H = w70.H(g2Var, view);
        H.Q = true;
        g2Var.getParentActivity();
        g2Var.getResourceProvider();
        g2Var.x0 = m4.b(H, g2Var, y3Var, false);
    }

    @Override // k2.n
    public void o0(k kVar) {
        of.b bVar = ((h0) this.b).Y0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new k2.h(bVar, kVar, 1));
        }
    }

    @Override // k2.n
    public void onAudioSessionIdChanged(int i10) {
        j jVar;
        h0 h0Var = (h0) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = h0Var.a1) != null) {
            jVar.d(i10);
        }
        of.b bVar = h0Var.Y0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new bi.s(bVar, i10, 10));
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.b).c, "joinApplication", task);
    }

    @Override // hi.x3
    public void onContentChanged() {
        g2 g2Var = (g2) this.b;
        if (g2Var.y0 != null) {
            boolean l32 = g2Var.P.l3();
            g2Var.L0 = l32;
            g2Var.y0.h(l32);
            g2Var.y0.invalidate();
        }
        g2Var.C0();
        Runnable runnable = g2Var.M0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        a5.a aVar;
        a5.a aVar2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) se.b.a(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        a6.i[] iVarArr = new a6.i[ports.length];
        for (int i10 = 0; i10 < ports.length; i10++) {
            InvocationHandler invocationHandler3 = ports[i10];
            a6.i iVar = new a6.i(6);
            iVar.b = (WebMessagePortBoundaryInterface) se.b.a(WebMessagePortBoundaryInterface.class, invocationHandler3);
            iVarArr[i10] = iVar;
        }
        if (m.a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) se.b.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                aVar = new a5.a(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    aVar2 = null;
                    if (aVar2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) se.b.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        ((a5.b) this.b).b(webView, aVar2, uri, z10, (b5.h) jsReplyProxyBoundaryInterface.getOrCreatePeer(new b5.g(jsReplyProxyBoundaryInterface, 0)));
                        return;
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
        of.b bVar = ((h0) this.b).Y0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new ai.j(7, bVar, z10));
        }
    }

    @Override // k2.n
    public void p() {
        i2.h0 h0Var = ((h0) this.b).W;
        if (h0Var != null) {
            h0Var.a.g0 = true;
        }
    }

    @Override // hi.l0
    public void p0() {
        switch (this.a) {
            case 23:
                hi.a0 a0Var = (hi.a0) this.b;
                t3 t3Var = a0Var.O;
                if (t3Var != null) {
                    hi.a aVar = a0Var.a;
                    z3.N1(t3Var.a);
                    break;
                }
                break;
            default:
                x4 x4Var = (x4) this.b;
                s3 s3Var = x4Var.N;
                if (s3Var != null) {
                    hi.a aVar2 = x4Var.a;
                    z3.N1(s3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // hi.x3
    public void q(int i10) {
        ((g2) this.b).o0(74, i10);
    }

    @Override // bi.ge
    public void q0(long j3) {
        e8 e8Var = (e8) this.b;
        r9 r9Var = e8Var.d;
        if (r9Var == null) {
            return;
        }
        r9Var.D = j3;
        r9Var.j = true;
        e8Var.w(true);
    }

    @Override // bi.ge
    public void r() {
        e8 e8Var = (e8) this.b;
        e8Var.s(null, null, true);
        ce ceVar = ((nd) e8Var).C0;
        nd ndVar = ceVar.X0;
        if (ndVar != null) {
            ndVar.s(null, null, true);
        }
        ad adVar = ceVar.v1;
        if (adVar != null) {
            adVar.q0();
        }
        qd qdVar = ceVar.c1;
        if (qdVar != null) {
            qdVar.setHasRoundVideo(false);
        }
        r9 r9Var = ceVar.K1;
        if (r9Var != null) {
            File file = r9Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                ceVar.K1.o0 = null;
            }
            if (ceVar.K1.p0 != null) {
                try {
                    new File(ceVar.K1.p0).delete();
                } catch (Exception unused2) {
                }
                ceVar.K1.p0 = null;
            }
        }
    }

    @Override // androidx.lifecycle.a0
    public void r0(Object obj) {
        switch (this.a) {
            case 3:
                androidx.biometric.p pVar = (androidx.biometric.p) this.b;
                if (((Boolean) obj).booleanValue()) {
                    if (pVar.R()) {
                        pVar.W(pVar.q(R.string.fingerprint_not_recognized));
                    }
                    y yVar = pVar.l0;
                    if (yVar.n) {
                        Executor executor = yVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.n(1);
                        }
                        executor.execute(new androidx.biometric.g(pVar, 0));
                    } else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    y yVar2 = pVar.l0;
                    if (yVar2.u == null) {
                        yVar2.u = new z();
                    }
                    y.h(yVar2.u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                t tVar = (t) obj;
                androidx.fragment.app.p pVar2 = (androidx.fragment.app.p) this.b;
                if (tVar == null || !pVar2.r0) {
                    return;
                }
                pVar2.getClass();
                throw new IllegalStateException("Fragment " + pVar2 + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    @Override // hi.x3
    public void s() {
        g2 g2Var = (g2) this.b;
        m3 m3Var = g2Var.P.n3;
        g2Var.x0((m3Var != null && m3Var.y() && g2Var.P.B4()) ? 1 : 0, true);
        g2Var.y0();
        g2Var.w0();
    }

    public void s0(j6.l lVar, u uVar) {
        k0 k0Var = (k0) this.b;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        k0 k0Var2 = (k0) this.b;
        androidx.biometric.p pVar = (androidx.biometric.p) k0Var2.D("androidx.biometric.BiometricFragment");
        if (pVar == null) {
            pVar = new androidx.biometric.p();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var2);
            aVar.f(0, pVar, "androidx.biometric.BiometricFragment");
            aVar.e(true, true);
            k0Var2.A(true);
            k0Var2.E();
        }
        v k10 = pVar.k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        y yVar = pVar.l0;
        yVar.f = lVar;
        int i10 = lVar.a;
        if (i10 == 0) {
            i10 = uVar != null ? 15 : 255;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23 || i11 >= 30 || i10 != 15 || uVar != null) {
            yVar.g = uVar;
        } else {
            yVar.g = v7.o.a();
        }
        if (pVar.Q()) {
            pVar.l0.k = pVar.q(R.string.confirm_device_credential_password);
        } else {
            pVar.l0.k = null;
        }
        if (pVar.Q() && new aa.a(new androidx.biometric.s(k10, 0)).f(255) != 0) {
            pVar.l0.n = true;
            pVar.S();
        } else if (pVar.l0.p) {
            pVar.k0.postDelayed(new androidx.biometric.o(pVar), 600L);
        } else {
            pVar.X();
        }
    }

    @Override // hi.x3
    public void t(w3 w3Var, View view) {
        g2 g2Var = (g2) this.b;
        w70 H = w70.H(g2Var, view);
        H.Q = true;
        g2Var.x0 = m4.c(H, g2Var, g2Var.getParentActivity(), g2Var.getResourceProvider(), w3Var, false);
    }

    public c6.o t0() {
        c6.o oVar = (c6.o) this.b;
        if (oVar.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(oVar.e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(oVar.f) || oVar.f < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
        return oVar;
    }

    @Override // l.x
    public boolean u(l lVar) {
        Window.Callback callback;
        g.s sVar = (g.s) this.b;
        if (lVar != lVar.k() || !sVar.O || (callback = sVar.f.getCallback()) == null || sVar.Z) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    public float u0(ic.c cVar, ic.c cVar2) {
        int i10 = (int) cVar.a;
        int i11 = (int) cVar.b;
        int i12 = (int) cVar2.a;
        int i13 = (int) cVar2.b;
        float D0 = D0(i10, i11, i12, i13);
        float D02 = D0((int) cVar2.a, i13, (int) cVar.a, i11);
        return Float.isNaN(D0) ? D02 / 7.0f : Float.isNaN(D02) ? D0 / 7.0f : (D0 + D02) / 14.0f;
    }

    @Override // ei.s0
    public void v(long j3) {
        ((ei.s) this.b).presentFragment(eo.R9(j3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x0346, code lost:
    
        throw cc.c.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a2 A[LOOP:21: B:147:0x0224->B:177:0x03a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0371 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d v0(com.google.firebase.messaging.m mVar) {
        int e;
        hc.f fVar;
        hc.d dVar;
        int i10;
        int i11;
        dc.c cVar;
        int e7;
        hc.g q6 = mVar.q();
        hc.d dVar2 = mVar.p().a;
        hc.e p5 = mVar.p();
        hc.g q10 = mVar.q();
        int i12 = m1.j.d(8)[p5.b];
        dc.b bVar = (dc.b) mVar.b;
        int i13 = bVar.b;
        for (int i14 = 0; i14 < i13; i14++) {
            for (int i15 = 0; i15 < i13; i15++) {
                if (hc.b.a(i12, i14, i15)) {
                    bVar.a(i15, i14);
                }
            }
        }
        int i16 = q10.a * 4;
        int i17 = i16 + 17;
        int i18 = q10.d;
        dc.b bVar2 = new dc.b(i17, i17);
        bVar2.c(0, 0, 9, 9);
        int i19 = i16 + 9;
        bVar2.c(i19, 0, 8, 9);
        bVar2.c(0, i19, 9, 8);
        int[] iArr = q10.b;
        int length = iArr.length;
        for (int i20 = 0; i20 < length; i20++) {
            int i21 = iArr[i20] - 2;
            for (int i22 = 0; i22 < length; i22++) {
                if ((i20 != 0 || (i22 != 0 && i22 != length - 1)) && (i20 != length - 1 || i22 != 0)) {
                    bVar2.c(iArr[i22] - 2, i21, 5, 5);
                }
            }
        }
        int i23 = 6;
        bVar2.c(6, 9, 1, i16);
        bVar2.c(9, 6, i16, 1);
        if (q10.a > 6) {
            int i24 = i16 + 6;
            bVar2.c(i24, 0, 3, 6);
            bVar2.c(0, i24, 6, 3);
        }
        byte[] bArr = new byte[i18];
        int i25 = i13 - 1;
        int i26 = i25;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        boolean z10 = true;
        while (i26 > 0) {
            if (i26 == i23) {
                i26--;
            }
            for (int i30 = 0; i30 < i13; i30++) {
                int i31 = z10 ? i25 - i30 : i30;
                for (int i32 = 0; i32 < 2; i32++) {
                    int i33 = i26 - i32;
                    if (!bVar2.b(i33, i31)) {
                        i28++;
                        i29 <<= 1;
                        if (bVar.b(i33, i31)) {
                            i29 |= 1;
                        }
                        if (i28 == 8) {
                            bArr[i27] = (byte) i29;
                            i27++;
                            i28 = 0;
                            i29 = 0;
                        }
                    }
                }
            }
            z10 = !z10;
            i26 -= 2;
            i23 = 6;
        }
        if (i27 != i18) {
            throw cc.c.a();
        }
        if (i18 != q6.d) {
            throw new IllegalArgumentException();
        }
        b0 b0Var = q6.c[dVar2.ordinal()];
        b2.q0[] q0VarArr = (b2.q0[]) b0Var.c;
        int i34 = b0Var.b;
        int i35 = 0;
        for (b2.q0 q0Var : q0VarArr) {
            i35 += q0Var.a;
        }
        hc.a[] aVarArr = new hc.a[i35];
        int i36 = 0;
        for (b2.q0 q0Var2 : q0VarArr) {
            int i37 = 0;
            while (i37 < q0Var2.a) {
                int i38 = q0Var2.b;
                aVarArr[i36] = new hc.a(i38, new byte[i34 + i38]);
                i37++;
                i36++;
            }
        }
        int length2 = aVarArr[0].a.length;
        int i39 = i35 - 1;
        while (i39 >= 0 && aVarArr[i39].a.length != length2) {
            i39--;
        }
        int i40 = i39 + 1;
        int i41 = length2 - i34;
        int i42 = 0;
        int i43 = 0;
        while (i42 < i41) {
            int i44 = i43;
            int i45 = 0;
            while (i45 < i36) {
                aVarArr[i45].a[i42] = bArr[i44];
                i45++;
                i44++;
            }
            i42++;
            i43 = i44;
        }
        int i46 = i40;
        while (i46 < i36) {
            aVarArr[i46].a[i41] = bArr[i43];
            i46++;
            i43++;
        }
        boolean z11 = false;
        int length3 = aVarArr[0].a.length;
        while (i41 < length3) {
            int i47 = i43;
            int i48 = 0;
            while (i48 < i36) {
                aVarArr[i48].a[i48 < i40 ? i41 : i41 + 1] = bArr[i47];
                i48++;
                i47++;
            }
            i41++;
            i43 = i47;
        }
        int i49 = 0;
        for (int i50 = 0; i50 < i35; i50++) {
            i49 += aVarArr[i50].b;
        }
        byte[] bArr2 = new byte[i49];
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        while (i52 < i35) {
            hc.a aVar = aVarArr[i52];
            byte[] bArr3 = aVar.a;
            int i54 = aVar.b;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i55 = 0; i55 < length4; i55++) {
                iArr2[i55] = bArr3[i55] & 255;
            }
            try {
                int S = ((a4.m) this.b).S(bArr3.length - i54, iArr2);
                for (int i56 = 0; i56 < i54; i56++) {
                    bArr3[i56] = (byte) iArr2[i56];
                }
                i51 += S;
                int i57 = i53;
                int i58 = 0;
                while (i58 < i54) {
                    bArr2[i57] = bArr3[i58];
                    i58++;
                    i57++;
                }
                i52++;
                i53 = i57;
            } catch (fc.c unused) {
                cc.a aVar2 = cc.a.c;
                if (cc.h.a) {
                    throw new cc.a();
                }
                throw cc.a.c;
            }
        }
        char[] cArr = hc.c.a;
        b4.d dVar3 = new b4.d(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int i59 = -1;
        int i60 = -1;
        boolean z12 = false;
        boolean z13 = false;
        dc.c cVar2 = null;
        while (true) {
            try {
                int d = dVar3.d();
                hc.f fVar2 = hc.f.c;
                if (d < 4 || (e = dVar3.e(4)) == 0) {
                    fVar = fVar2;
                } else if (e == 1) {
                    fVar = hc.f.d;
                } else if (e == 2) {
                    fVar = hc.f.e;
                } else if (e == 3) {
                    fVar = hc.f.f;
                } else if (e == 4) {
                    fVar = hc.f.h;
                } else if (e == 5) {
                    fVar = hc.f.s;
                } else if (e == 7) {
                    fVar = hc.f.n;
                } else if (e == 8) {
                    fVar = hc.f.r;
                } else if (e == 9) {
                    fVar = hc.f.v;
                } else {
                    if (e != 13) {
                        throw new IllegalArgumentException();
                    }
                    fVar = hc.f.w;
                }
                int ordinal = fVar.ordinal();
                if (ordinal != 0) {
                    dVar = dVar2;
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            i10 = i51;
                            i11 = 1;
                            int e10 = dVar3.e(8);
                            if ((e10 & 128) == 0) {
                                e7 = e10 & 127;
                            } else if ((e10 & 192) == 128) {
                                e7 = ((e10 & 63) << 8) | dVar3.e(8);
                            } else {
                                if ((e10 & 224) != 192) {
                                    throw cc.c.a();
                                }
                                e7 = ((e10 & 31) << 16) | dVar3.e(16);
                            }
                            HashMap hashMap = dc.c.c;
                            if (e7 < 0 || e7 >= 900) {
                                break;
                            }
                            dc.c cVar3 = (dc.c) dc.c.c.get(Integer.valueOf(e7));
                            if (cVar3 == null) {
                                throw cc.c.a();
                            }
                            cVar = cVar3;
                        } else if (ordinal == 7) {
                            i10 = i51;
                            i11 = 1;
                            cVar = cVar2;
                            z12 = true;
                            z11 = true;
                        } else if (ordinal == 8) {
                            i10 = i51;
                            i11 = 1;
                            cVar = cVar2;
                            z12 = true;
                            z13 = true;
                        } else if (ordinal != 9) {
                            int e11 = dVar3.e(fVar.a(q6));
                            int ordinal2 = fVar.ordinal();
                            i10 = i51;
                            if (ordinal2 == 1) {
                                hc.c.e(dVar3, sb2, e11);
                            } else if (ordinal2 == 2) {
                                hc.c.a(dVar3, sb2, e11, z12);
                            } else if (ordinal2 == 4) {
                                hc.c.b(dVar3, sb2, e11, cVar2, arrayList);
                            } else {
                                if (ordinal2 != 6) {
                                    throw cc.c.a();
                                }
                                hc.c.d(dVar3, sb2, e11);
                            }
                        } else {
                            i10 = i51;
                            int e12 = dVar3.e(4);
                            int e13 = dVar3.e(fVar.a(q6));
                            i11 = 1;
                            if (e12 == 1) {
                                hc.c.c(dVar3, sb2, e13);
                            }
                        }
                        int i61 = i59;
                        if (fVar == fVar2) {
                            if (cVar != null) {
                                i11 = z11 ? 4 : z13 ? 6 : 2;
                            } else if (z11) {
                                i11 = 3;
                            } else if (z13) {
                                i11 = 5;
                            }
                            d dVar4 = new d(bArr2, sb2.toString(), arrayList.isEmpty() ? null : arrayList, dVar.toString(), i61, i60, i11);
                            dVar4.d = Integer.valueOf(i10);
                            return dVar4;
                        }
                        i59 = i61;
                        dVar2 = dVar;
                        cVar2 = cVar;
                        i51 = i10;
                    } else {
                        i10 = i51;
                        i11 = 1;
                        if (dVar3.d() < 16) {
                            throw cc.c.a();
                        }
                        i59 = dVar3.e(8);
                        i60 = dVar3.e(8);
                    }
                    cVar = cVar2;
                    int i612 = i59;
                    if (fVar == fVar2) {
                    }
                } else {
                    dVar = dVar2;
                    i10 = i51;
                }
                i11 = 1;
                cVar = cVar2;
                int i6122 = i59;
                if (fVar == fVar2) {
                }
            } catch (IllegalArgumentException unused2) {
                throw cc.c.a();
            }
        }
    }

    @Override // hi.x3
    public void w() {
        g2 g2Var = (g2) this.b;
        g2Var.I0 = g2Var.K0;
        g2.Z(g2Var, false, false);
        g2Var.x0(2, true);
    }

    public ic.a w0(float f7, float f10, int i10, int i11) {
        ic.a b10;
        ic.a b11;
        int i12 = (int) (f10 * f7);
        int max = Math.max(0, i10 - i12);
        dc.b bVar = (dc.b) this.b;
        int min = Math.min(bVar.a - 1, i10 + i12) - max;
        float f11 = 3.0f * f7;
        if (min < f11) {
            throw cc.e.a();
        }
        int max2 = Math.max(0, i11 - i12);
        int min2 = Math.min(bVar.b - 1, i11 + i12) - max2;
        if (min2 < f11) {
            throw cc.e.a();
        }
        dc.b bVar2 = (dc.b) this.b;
        ic.b bVar3 = new ic.b(bVar2, max, max2, min, min2, f7);
        int i13 = bVar3.e;
        int i14 = bVar3.c;
        int i15 = i13 + i14;
        int i16 = bVar3.f;
        int i17 = (i16 / 2) + bVar3.d;
        int[] iArr = new int[3];
        for (int i18 = 0; i18 < i16; i18++) {
            int i19 = ((i18 & 1) == 0 ? (i18 + 1) / 2 : -((i18 + 1) / 2)) + i17;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i20 = i14;
            while (i20 < i15 && !bVar2.b(i20, i19)) {
                i20++;
            }
            int i21 = 0;
            while (i20 < i15) {
                if (!bVar2.b(i20, i19)) {
                    if (i21 == 1) {
                        i21++;
                    }
                    iArr[i21] = iArr[i21] + 1;
                } else if (i21 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i21 != 2) {
                    i21++;
                    iArr[i21] = iArr[i21] + 1;
                } else {
                    if (bVar3.a(iArr) && (b11 = bVar3.b(i19, i20, iArr)) != null) {
                        return b11;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i21 = 1;
                }
                i20++;
            }
            if (bVar3.a(iArr) && (b10 = bVar3.b(i19, i15, iArr)) != null) {
                return b10;
            }
        }
        ArrayList arrayList = bVar3.b;
        if (arrayList.isEmpty()) {
            throw cc.e.a();
        }
        return (ic.a) arrayList.get(0);
    }

    @Override // bi.ge
    public void x(float f7) {
        e8 e8Var = (e8) this.b;
        r9 r9Var = e8Var.d;
        if (r9Var == null) {
            return;
        }
        r9Var.s0 = f7;
        r9Var.j = true;
        e8Var.y(true);
    }

    public Set x0() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.b);
        }
        return unmodifiableSet;
    }

    @Override // k2.n
    public void y(int i10, long j3, long j10) {
        of.b bVar = ((h0) this.b).Y0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new k2.i(bVar, i10, j3, j10, 0));
        }
    }

    public Boolean y0() {
        Bundle bundle = (Bundle) this.b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // bi.ge
    public void z(boolean z10) {
        e8 e8Var = (e8) this.b;
        if (e8Var.j()) {
            e8Var.E.getClass();
        }
        e8Var.x(-4, z10);
    }

    public boolean z0() {
        x0 x0Var = ((com.google.android.gms.common.api.internal.j0) this.b).d;
        return x0Var != null && x0Var.b();
    }

    public /* synthetic */ c(pb.c cVar) {
        this.a = 11;
        this.b = (com.google.android.gms.internal.play_billing.r) cVar.b;
    }

    public c(MediaInfo mediaInfo) {
        this.a = 12;
        c6.o oVar = new c6.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public c(JSONObject jSONObject) {
        this.a = 12;
        this.b = new c6.o(jSONObject);
    }

    public c(Context context) {
        this.a = 8;
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 22:
                this.b = new a4.m(fc.a.h, 16);
                break;
            case 26:
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public c(ba.c cVar) {
        this.a = 15;
        this.b = new File(cVar.b, "com.crashlytics.settings.json");
    }

    public c(LaunchActivity launchActivity, Executor executor, v7.n nVar) {
        this.a = 4;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s10 = launchActivity.s();
            y yVar = (y) new aa.a(launchActivity).m(y.class);
            this.b = s10;
            yVar.d = executor;
            yVar.e = nVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override // hi.x3
    public void G() {
    }

    @Override // kg.o
    public void m0() {
    }

    private final /* synthetic */ void A0(ArrayList arrayList) {
    }

    @Override // hi.x3
    public void K(int i10) {
    }

    @Override // kg.o
    public void N(boolean z10) {
    }

    @Override // kg.o
    public void i0(boolean z10) {
    }

    @Override // hi.x3
    public void C(k1 k1Var, boolean z10) {
    }
}
