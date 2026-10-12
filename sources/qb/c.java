package qb;

import a0.h;
import ab.e0;
import ah.f0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.activity.i;
import androidx.lifecycle.a0;
import bi.q5;
import c5.c0;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.a7;
import di.i0;
import di.y6;
import g6.l;
import g6.n;
import gb.o;
import hg.y1;
import hg.z1;
import i2.l0;
import ic.d;
import ic.f;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import ji.d2;
import ji.h1;
import ji.h2;
import ji.j0;
import ji.p4;
import ji.r;
import ji.r4;
import ji.t3;
import ji.x3;
import k2.t;
import k2.t0;
import k2.x;
import k2.y0;
import l5.q;
import m.i1;
import m1.j;
import mg.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.yq0;
import org.telegram.ui.hj0;
import org.telegram.ui.ky;
import v7.r8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class c implements fl0, a0, yq0, k0, v0, OnCompleteListener, e, e81, n, i1, o, s, z1, f5, j0, x {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(int i10) {
        this.a = i10;
    }

    public static boolean X(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String e0(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // k2.x
    public void A() {
        ((k2.v0) this.b).j1 = true;
    }

    @Override // k2.x
    public void B(t0 t0Var) {
        qf.b bVar = ((k2.v0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new t(bVar, t0Var, 1));
        }
    }

    @Override // ji.j0
    public o9 C() {
        p4 p4Var = ((r4) this.b).G;
        if (p4Var != null) {
            return ((t3) p4Var).a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // k2.x
    public void E(t0 t0Var) {
        qf.b bVar = ((k2.v0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new t(bVar, t0Var, 0));
        }
    }

    @Override // ji.j0
    public void F(CharSequence charSequence) {
        p4 p4Var = ((r4) this.b).G;
        if (p4Var != null) {
            t3 t3Var = (t3) p4Var;
            t3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            t3Var.a.u4(charSequence.toString());
        }
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public com.google.android.gms.common.api.internal.e G(com.google.android.gms.common.api.internal.e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // mg.e
    public void H() {
        ((i0) this.b).f.o();
    }

    @Override // k2.x
    public void I() {
        l0 l0Var = ((k2.v0) this.b).Y;
        if (l0Var != null) {
            l0Var.a();
        }
    }

    @Override // hg.z1
    public void I0(ArrayList arrayList) {
        so0 so0Var = (so0) this.b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            so0Var.J.add(((y1) arrayList.get(i10)).a);
        }
        ky kyVar = so0Var.U;
        if (kyVar != null) {
            kyVar.d(so0Var.D0 > 0, false);
        }
        so0Var.l();
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 26:
                ((r) this.b).K(i10, z10, i11, false, 0L);
                r rVar = (r) this.b;
                hj0 hj0Var = rVar.O;
                if (hj0Var != null) {
                    hj0Var.i();
                    rVar.O = null;
                    break;
                }
                break;
            default:
                d2 d2Var = (d2) this.b;
                d2Var.s0(i10, i11, z10);
                hj0 hj0Var2 = d2Var.O0;
                if (hj0Var2 != null) {
                    hj0Var2.i();
                    d2Var.O0 = null;
                    break;
                }
                break;
        }
    }

    @Override // hg.z1
    public /* synthetic */ h K() {
        return null;
    }

    @Override // ji.j0
    public n9 L() {
        return (r4) this.b;
    }

    public c6.o M() {
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

    /* JADX WARN: Code restructure failed: missing block: B:222:0x034c, code lost:
    
        throw dc.c.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03a7 A[LOOP:21: B:146:0x022c->B:176:0x03a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0376 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c2.r N(c2.b bVar) {
        int e;
        ic.e eVar;
        ic.c cVar;
        int i10;
        int i11;
        ec.c cVar2;
        int e7;
        f t10 = bVar.t();
        ic.c cVar3 = bVar.s().a;
        d s10 = bVar.s();
        f t11 = bVar.t();
        int i12 = j.d(8)[s10.b];
        ec.b bVar2 = (ec.b) bVar.b;
        int i13 = bVar2.b;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            for (int i16 = 0; i16 < i13; i16++) {
                if (i2.d.a(i12, i15, i16)) {
                    bVar2.a(i16, i15);
                }
            }
        }
        int i17 = t11.a * 4;
        int i18 = i17 + 17;
        int i19 = t11.d;
        ec.b bVar3 = new ec.b(i18, i18);
        bVar3.c(0, 0, 9, 9);
        int i20 = i17 + 9;
        bVar3.c(i20, 0, 8, 9);
        bVar3.c(0, i20, 9, 8);
        int[] iArr = t11.b;
        int length = iArr.length;
        int i21 = 0;
        while (i21 < length) {
            int i22 = iArr[i21] - 2;
            for (int i23 = i14; i23 < length; i23++) {
                if ((i21 != 0 || (i23 != 0 && i23 != length - 1)) && (i21 != length - 1 || i23 != 0)) {
                    bVar3.c(iArr[i23] - 2, i22, 5, 5);
                }
            }
            i21++;
            i14 = 0;
        }
        int i24 = 2;
        int i25 = 6;
        int i26 = 1;
        bVar3.c(6, 9, 1, i17);
        bVar3.c(9, 6, i17, 1);
        if (t11.a > 6) {
            int i27 = i17 + 6;
            bVar3.c(i27, 0, 3, 6);
            bVar3.c(0, i27, 6, 3);
        }
        byte[] bArr = new byte[i19];
        int i28 = i13 - 1;
        int i29 = i28;
        boolean z10 = true;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        while (i29 > 0) {
            if (i29 == i25) {
                i29--;
            }
            int i33 = 0;
            while (i33 < i13) {
                int i34 = z10 ? i28 - i33 : i33;
                int i35 = i26;
                int i36 = 0;
                for (int i37 = i24; i36 < i37; i37 = 2) {
                    int i38 = i29 - i36;
                    if (!bVar3.b(i38, i34)) {
                        i31++;
                        i32 <<= 1;
                        if (bVar2.b(i38, i34)) {
                            i32 |= 1;
                        }
                        if (i31 == 8) {
                            bArr[i30] = (byte) i32;
                            i30++;
                            i31 = 0;
                            i32 = 0;
                        }
                    }
                    i36++;
                }
                i33++;
                i26 = i35;
                i24 = 2;
            }
            z10 = !z10;
            i29 -= 2;
            i25 = 6;
            i24 = 2;
        }
        int i39 = i26;
        if (i30 != i19) {
            throw dc.c.a();
        }
        if (i19 != t10.d) {
            throw new IllegalArgumentException();
        }
        c0 c0Var = t10.c[cVar3.ordinal()];
        b2.v0[] v0VarArr = (b2.v0[]) c0Var.c;
        int i40 = c0Var.b;
        int i41 = 0;
        for (b2.v0 v0Var : v0VarArr) {
            i41 += v0Var.a;
        }
        ic.a[] aVarArr = new ic.a[i41];
        int i42 = 0;
        for (b2.v0 v0Var2 : v0VarArr) {
            int i43 = 0;
            while (i43 < v0Var2.a) {
                int i44 = v0Var2.b;
                aVarArr[i42] = new ic.a(i44, new byte[i40 + i44]);
                i43++;
                i42++;
            }
        }
        int length2 = aVarArr[0].a.length;
        int i45 = i41 - 1;
        while (i45 >= 0 && aVarArr[i45].a.length != length2) {
            i45--;
        }
        int i46 = i45 + 1;
        int i47 = length2 - i40;
        int i48 = 0;
        int i49 = 0;
        while (i48 < i47) {
            int i50 = i49;
            int i51 = 0;
            while (i51 < i42) {
                aVarArr[i51].a[i48] = bArr[i50];
                i51++;
                i50++;
            }
            i48++;
            i49 = i50;
        }
        int i52 = i46;
        while (i52 < i42) {
            aVarArr[i52].a[i47] = bArr[i49];
            i52++;
            i49++;
        }
        boolean z11 = false;
        int length3 = aVarArr[0].a.length;
        while (i47 < length3) {
            int i53 = i49;
            int i54 = 0;
            while (i54 < i42) {
                aVarArr[i54].a[i54 < i46 ? i47 : i47 + 1] = bArr[i53];
                i54++;
                i53++;
            }
            i47++;
            i49 = i53;
        }
        int i55 = 0;
        for (int i56 = 0; i56 < i41; i56++) {
            i55 += aVarArr[i56].b;
        }
        byte[] bArr2 = new byte[i55];
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        while (i58 < i41) {
            ic.a aVar = aVarArr[i58];
            byte[] bArr3 = aVar.a;
            int i60 = aVar.b;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i61 = 0; i61 < length4; i61++) {
                iArr2[i61] = bArr3[i61] & 255;
            }
            try {
                int x02 = ((ya.c) this.b).x0(bArr3.length - i60, iArr2);
                for (int i62 = 0; i62 < i60; i62++) {
                    bArr3[i62] = (byte) iArr2[i62];
                }
                i57 += x02;
                int i63 = i59;
                int i64 = 0;
                while (i64 < i60) {
                    bArr2[i63] = bArr3[i64];
                    i64++;
                    i63++;
                }
                i58++;
                i59 = i63;
            } catch (gc.c unused) {
                dc.a aVar2 = dc.a.c;
                if (dc.h.a) {
                    throw new dc.a();
                }
                throw dc.a.c;
            }
        }
        char[] cArr = ic.b.a;
        b4.d dVar = new b4.d(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(i39);
        int i65 = -1;
        int i66 = -1;
        boolean z12 = false;
        boolean z13 = false;
        ec.c cVar4 = null;
        while (true) {
            try {
                int d = dVar.d();
                ic.e eVar2 = ic.e.c;
                if (d < 4 || (e = dVar.e(4)) == 0) {
                    eVar = eVar2;
                } else if (e == 1) {
                    eVar = ic.e.d;
                } else if (e == 2) {
                    eVar = ic.e.e;
                } else if (e == 3) {
                    eVar = ic.e.f;
                } else if (e == 4) {
                    eVar = ic.e.h;
                } else if (e == 5) {
                    eVar = ic.e.s;
                } else if (e == 7) {
                    eVar = ic.e.n;
                } else if (e == 8) {
                    eVar = ic.e.r;
                } else if (e == 9) {
                    eVar = ic.e.v;
                } else {
                    if (e != 13) {
                        throw new IllegalArgumentException();
                    }
                    eVar = ic.e.w;
                }
                int ordinal = eVar.ordinal();
                if (ordinal != 0) {
                    cVar = cVar3;
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            i10 = i57;
                            i11 = 1;
                            int e10 = dVar.e(8);
                            if ((e10 & 128) == 0) {
                                e7 = e10 & 127;
                            } else if ((e10 & 192) == 128) {
                                e7 = ((e10 & 63) << 8) | dVar.e(8);
                            } else {
                                if ((e10 & 224) != 192) {
                                    throw dc.c.a();
                                }
                                e7 = ((e10 & 31) << 16) | dVar.e(16);
                            }
                            HashMap hashMap = ec.c.c;
                            if (e7 < 0 || e7 >= 900) {
                                break;
                            }
                            ec.c cVar5 = (ec.c) ec.c.c.get(Integer.valueOf(e7));
                            if (cVar5 == null) {
                                throw dc.c.a();
                            }
                            cVar2 = cVar5;
                        } else if (ordinal == 7) {
                            i10 = i57;
                            i11 = 1;
                            cVar2 = cVar4;
                            z12 = true;
                            z11 = true;
                        } else if (ordinal == 8) {
                            i10 = i57;
                            i11 = 1;
                            cVar2 = cVar4;
                            z12 = true;
                            z13 = true;
                            int i67 = i65;
                            if (eVar != eVar2) {
                                if (cVar2 != null) {
                                    i11 = z11 ? 4 : z13 ? 6 : 2;
                                } else if (z11) {
                                    i11 = 3;
                                } else if (z13) {
                                    i11 = 5;
                                }
                                c2.r rVar = new c2.r(bArr2, sb2.toString(), arrayList.isEmpty() ? null : arrayList, cVar.toString(), i67, i66, i11);
                                rVar.g = Integer.valueOf(i10);
                                return rVar;
                            }
                            i65 = i67;
                            cVar3 = cVar;
                            cVar4 = cVar2;
                            i57 = i10;
                        } else if (ordinal != 9) {
                            int e11 = dVar.e(eVar.a(t10));
                            int ordinal2 = eVar.ordinal();
                            i10 = i57;
                            if (ordinal2 == 1) {
                                ic.b.e(dVar, sb2, e11);
                            } else if (ordinal2 == 2) {
                                ic.b.a(dVar, sb2, e11, z12);
                            } else if (ordinal2 == 4) {
                                ic.b.b(dVar, sb2, e11, cVar4, arrayList);
                            } else {
                                if (ordinal2 != 6) {
                                    throw dc.c.a();
                                }
                                ic.b.d(dVar, sb2, e11);
                            }
                        } else {
                            i10 = i57;
                            int e12 = dVar.e(4);
                            int e13 = dVar.e(eVar.a(t10));
                            i11 = 1;
                            if (e12 == 1) {
                                ic.b.c(dVar, sb2, e13);
                            }
                        }
                        int i672 = i65;
                        if (eVar != eVar2) {
                        }
                    } else {
                        i10 = i57;
                        i11 = 1;
                        if (dVar.d() < 16) {
                            throw dc.c.a();
                        }
                        i65 = dVar.e(8);
                        i66 = dVar.e(8);
                    }
                    cVar2 = cVar4;
                    int i6722 = i65;
                    if (eVar != eVar2) {
                    }
                } else {
                    cVar = cVar3;
                    i10 = i57;
                }
                i11 = 1;
                cVar2 = cVar4;
                int i67222 = i65;
                if (eVar != eVar2) {
                }
            } catch (IllegalArgumentException unused2) {
                throw dc.c.a();
            }
        }
    }

    @Override // mg.e
    public void N0() {
        ((i0) this.b).f.k();
    }

    @Override // ji.j0
    public ji.a O() {
        return ((r4) this.b).a;
    }

    public boolean P(String str) {
        String W = W(str);
        return "1".equals(W) || Boolean.parseBoolean(W);
    }

    @Override // mg.e
    public void P0(float f7) {
        ((i0) this.b).f.setRotation(f7);
    }

    @Override // ji.j0
    public boolean Q() {
        r4 r4Var = (r4) this.b;
        p4 p4Var = r4Var.G;
        if (p4Var == null) {
            return false;
        }
        ji.a aVar = r4Var.a;
        return ((t3) p4Var).a.T4();
    }

    public Integer R(String str) {
        String W = W(str);
        if (TextUtils.isEmpty(W)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(W));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + e0(str) + "(" + W + ") into an int");
            return null;
        }
    }

    @Override // ji.j0
    public void S(int i10, int i11) {
        r4 r4Var = (r4) this.b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            ji.a aVar = r4Var.a;
            h2 h2Var = ((t3) p4Var).a.H3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    public JSONArray T(String str) {
        String W = W(str);
        if (TextUtils.isEmpty(W)) {
            return null;
        }
        try {
            return new JSONArray(W);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + e0(str) + ": " + W + ", falling back to default");
            return null;
        }
    }

    public String V(Resources resources, String str, String str2) {
        String[] strArr;
        String W = W(str2);
        if (!TextUtils.isEmpty(W)) {
            return W;
        }
        String W2 = W(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(W2)) {
            return null;
        }
        int identifier = resources.getIdentifier(W2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", e0(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray T = T(str2.concat("_loc_args"));
        if (T == null) {
            strArr = null;
        } else {
            int length = T.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = T.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + e0(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    public String W(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public void Y(e0 e0Var) {
        ((q) ((i5.f) ((qa.b) this.b).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new a1.c(this, 2)).a(new i5.a(null, e0Var, i5.d.a, null), new y0(2));
    }

    @Override // ji.j0
    public void Z() {
        r4 r4Var = (r4) this.b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            ji.a aVar = r4Var.a;
            x3 x3Var = ((t3) p4Var).a;
            h2 h2Var = x3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            x3Var.f3.onContentChanged();
        }
    }

    @Override // ji.j0
    public void a(h1 h1Var) {
        p4 p4Var = ((r4) this.b).G;
        if (p4Var != null) {
            x3 x3Var = ((t3) p4Var).a;
            x3.N1(x3Var, h1Var);
            x3Var.f3.c0(h1Var, true);
        }
    }

    @Override // mg.e
    public void a0() {
        ((i0) this.b).f.a.g(1, true);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        g7.f fVar = (g7.f) this.b;
        h7.f fVar2 = new h7.f(0, (TaskCompletionSource) obj2);
        h7.d dVar = (h7.d) ((h7.e) obj).u();
        g gVar = new g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i10 = q7.a.a;
        obtain.writeStrongBinder(fVar2);
        q7.a.b(obtain, fVar);
        q7.a.b(obtain, gVar);
        ((h7.b) dVar).F0(obtain, 6);
    }

    @Override // k2.x
    public void b(long j10) {
        k2.v0 v0Var = (k2.v0) this.b;
        v0Var.m1 = true;
        qf.b bVar = v0Var.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new bi.g(bVar, j10, 13));
        }
    }

    public void b0() {
        ((androidx.fragment.app.t) this.b).d.R();
    }

    public Bundle c0() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // k2.x
    public void d() {
        ((k2.v0) this.b).l1 = true;
    }

    public JSONObject d0() {
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
                        jSONObject = new JSONObject(x9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        x9.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    x9.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            x9.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            x9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // k2.x
    public void e() {
        l0 l0Var = ((k2.v0) this.b).Y;
        if (l0Var != null) {
            l0Var.a.i0 = true;
        }
    }

    @Override // ji.j0
    public void f() {
        r4 r4Var = (r4) this.b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            x3.Q1(((t3) p4Var).a, r4Var.a);
        }
    }

    @Override // gb.o
    public Object f2() {
        Constructor constructor = (Constructor) this.b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            r8 r8Var = jb.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Failed to invoke constructor '" + jb.c.b(constructor) + "' with no args", e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + jb.c.b(constructor) + "' with no args", e10.getCause());
        }
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void g() {
        m0 m0Var = (m0) this.b;
        m0Var.a.lock();
        try {
            m0Var.m = new g0(m0Var, m0Var.j, m0Var.k, m0Var.d, m0Var.l, m0Var.a, m0Var.c);
            m0Var.m.u();
            m0Var.b.signalAll();
        } finally {
            m0Var.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void h(k6.a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            xVar.m = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ boolean i() {
        return true;
    }

    @Override // g6.n
    public void j(String str, long j10, long j11, long j12) {
        e6.o oVar = (e6.o) this.b;
        try {
            oVar.a(new e6.n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e) {
            g6.b bVar = e6.h.k;
            Log.e(bVar.a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = oVar.q.i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override // hg.z1
    public /* synthetic */ h j0() {
        return null;
    }

    @Override // hg.z1
    public void k(int i10) {
        so0 so0Var = (so0) this.b;
        so0Var.D0--;
        so0Var.e0 = i10;
        if (so0Var.f0 != i10) {
            so0Var.s.clear();
        }
        if (so0Var.g0 != i10) {
            so0Var.I.clear();
        }
        so0Var.N = true;
        ky kyVar = so0Var.U;
        if (kyVar != null) {
            kyVar.d(so0Var.D0 > 0, true);
        }
        so0Var.l();
        ky kyVar2 = so0Var.U;
        if (kyVar2 != null) {
            kyVar2.c();
        }
    }

    @Override // mg.e
    public boolean k0() {
        i0 i0Var = (i0) this.b;
        di.g0 g0Var = i0Var.f;
        boolean m10 = g0Var.m(-90.0f);
        g0Var.i();
        i0Var.d.invalidate();
        return m10;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void l(int i10) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (xVar.n) {
                xVar.n = false;
                com.google.android.gms.common.api.internal.x.k(xVar, i10);
            } else {
                xVar.n = true;
                xVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // k2.x
    public void m(int i10, long j10, long j11) {
        qf.b bVar = ((k2.v0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new k2.s(bVar, i10, j10, j11, 0));
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ boolean n() {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void o(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            xVar.m = k6.a.e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // ji.j0
    public void o0() {
        r4 r4Var = (r4) this.b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            ji.a aVar = r4Var.a;
            x3.P1(((t3) p4Var).a);
        }
    }

    @Override // k2.x
    public void onAudioSessionIdChanged(int i10) {
        r2.j jVar;
        k2.v0 v0Var = (k2.v0) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = v0Var.c1) != null) {
            jVar.d(i10);
        }
        qf.b bVar = v0Var.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new ah.g(bVar, i10, 13));
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.b).c, "launchApplication", task);
    }

    @Override // org.telegram.ui.Components.e81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // k2.x
    public void onSkipSilenceEnabledChanged(boolean z10) {
        qf.b bVar = ((k2.v0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new ah.t(9, bVar, z10));
        }
    }

    @Override // org.telegram.ui.Components.e81
    public void onStateChanged(boolean z10, int i10) {
        a7 a7Var = (a7) this.b;
        y6 y6Var = a7Var.L;
        AndroidUtilities.cancelRunOnUIThread(y6Var);
        h81 h81Var = a7Var.y;
        if (h81Var == null || !h81Var.y()) {
            return;
        }
        AndroidUtilities.runOnUIThread(y6Var);
    }

    @Override // org.telegram.ui.Components.e81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.e81
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((a7) this.b).i();
    }

    @Override // k2.x
    public void q() {
        x2.n nVar;
        k2.v0 v0Var = (k2.v0) this.b;
        synchronized (v0Var.a) {
            nVar = v0Var.H;
        }
        if (nVar != null) {
            nVar.m();
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public void r(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        f0 f0Var = (f0) this.b;
        f0Var.a.eb(null, f0Var.e, f0Var.b, view, 0.0f, 0.0f, i1Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new a3.d(this, 3));
    }

    @Override // org.telegram.ui.Components.yq0
    public void s0() {
        q5.j0((q5) this.b);
    }

    @Override // k2.x
    public void t(Exception exc) {
        e2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        qf.b bVar = ((k2.v0) this.b).a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new k2.q(bVar, exc, 1));
        }
    }

    @Override // hg.z1
    public boolean t0(int i10) {
        return i10 == ((so0) this.b).d0;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void u() {
        m0 m0Var = (m0) this.b;
        Iterator it = m0Var.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).disconnect();
        }
        m0Var.o.F = Collections.EMPTY_SET;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[LOOP:0: B:16:0x0047->B:18:0x004d, LOOP_END] */
    @Override // g6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        Iterator it;
        e6.o oVar = (e6.o) this.b;
        try {
            i11 = i10;
            try {
                Status status = new Status(i11, null, null, null);
                Object obj2 = true == (obj instanceof l) ? obj : null;
                if (obj2 != null) {
                }
                if (obj2 != null) {
                }
                oVar.a(new e6.n(status, 2));
            } catch (IllegalStateException e) {
                e = e;
                g6.b bVar = e6.h.k;
                Log.e(bVar.a, bVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = oVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e7) {
            e = e7;
            i11 = i10;
        }
        it = oVar.q.i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j10, i11, j11, j12);
            i11 = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        if (r3 == 1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r3 == 3) goto L21;
     */
    @Override // androidx.lifecycle.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v0(Object obj) {
        Integer num = (Integer) obj;
        androidx.biometric.g0 g0Var = (androidx.biometric.g0) this.b;
        Handler handler = g0Var.A0;
        i iVar = g0Var.B0;
        handler.removeCallbacks(iVar);
        int intValue = num.intValue();
        if (g0Var.F0 != null) {
            int i10 = g0Var.C0.y;
            Context n10 = g0Var.n();
            Drawable drawable = null;
            if (n10 == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                int i11 = R.drawable.fingerprint_dialog_fp_icon;
                if (i10 != 0 || intValue != 1) {
                    if (i10 == 1 && intValue == 2) {
                        i11 = R.drawable.fingerprint_dialog_error;
                    } else {
                        if (i10 == 2) {
                        }
                        if (i10 == 1) {
                        }
                    }
                }
                drawable = n10.getDrawable(i11);
            }
            if (drawable != null) {
                g0Var.F0.setImageDrawable(drawable);
                if ((i10 != 0 || intValue != 1) && ((i10 == 1 && intValue == 2) || (i10 == 2 && intValue == 1))) {
                    androidx.biometric.e0.a(drawable);
                }
                g0Var.C0.y = intValue;
            }
        }
        int intValue2 = num.intValue();
        TextView textView = g0Var.G0;
        if (textView != null) {
            textView.setTextColor(intValue2 == 2 ? g0Var.D0 : g0Var.E0);
        }
        handler.postDelayed(iVar, 2000L);
    }

    @Override // mg.e
    public boolean x() {
        i0 i0Var = (i0) this.b;
        i0Var.d.invalidate();
        return i0Var.f.j();
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public boolean z() {
        return true;
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.e81
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ c(k6.h hVar) {
        this.a = 9;
        this.b = (com.google.android.gms.internal.play_billing.r) hVar.b;
    }

    public c(MediaInfo mediaInfo) {
        this.a = 10;
        c6.o oVar = new c6.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
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

    public c(x6.a aVar) {
        this.a = 25;
        n6.l.h(aVar);
        this.b = aVar;
    }

    public c(JSONObject jSONObject) {
        this.a = 10;
        this.b = new c6.o(jSONObject);
    }

    public c(ca.c cVar) {
        this.a = 18;
        this.b = new File(cVar.b, "com.crashlytics.settings.json");
    }

    public c() {
        this.a = 24;
        this.b = new ya.c(gc.a.h, 22);
    }

    public c(Bundle bundle) {
        this.a = 13;
        this.b = new Bundle(bundle);
    }

    @Override // org.telegram.ui.Components.yq0
    public /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ void y() {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void c(Bundle bundle) {
    }

    @Override // org.telegram.ui.Components.e81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.e81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void s(int i10) {
    }

    @Override // org.telegram.ui.Components.e81
    public void onError(h81 h81Var, Exception exc) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void p(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override // org.telegram.ui.Components.e81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ void w(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
