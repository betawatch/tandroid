package za;

import a5.d;
import a8.fd;
import a8.h0;
import a8.ng;
import a8.yb;
import ai.n0;
import ai.o0;
import ai.t1;
import ai.z0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.biometric.c0;
import androidx.biometric.e0;
import androidx.fragment.app.t;
import androidx.lifecycle.a0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import di.x7;
import e2.j;
import e2.x;
import e9.k;
import ec.i;
import f9.e1;
import f9.g1;
import fc.e;
import fi.d0;
import fi.gb;
import fi.ib;
import fi.j0;
import fi.o6;
import fi.sb;
import fi.ta;
import fi.w7;
import fi.wb;
import fi.y5;
import h6.q;
import hb.n;
import i4.g;
import i4.h;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.regex.Pattern;
import jc.f;
import jg.s0;
import l.w;
import n4.s;
import ng.o;
import o6.l;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.voip.j1;
import org.telegram.ui.d61;
import org.telegram.ui.web.a1;
import org.telegram.ui.web.b0;
import org.telegram.ui.web.x0;
import sg.c2;
import z3.m;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c implements n0, a0, r, d61, WebMessageListenerBoundaryInterface, u0, androidx.activity.result.b, OnCompleteListener, k, SuccessContinuation, o, wb, w, g6.a, n, m {
    public static volatile c c;
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ c(h6.r rVar, String[] strArr) {
        this.a = 25;
        this.b = strArr;
    }

    public static p l(Looper looper, Object obj, String str) {
        l.i(obj, "Listener must not be null");
        l.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    @Override // fi.wb
    public void A(boolean z10) {
        c2 c2Var;
        sb sbVar = ((gb) ((o6) this.b)).C0;
        ta taVar = sbVar.v1;
        if (taVar == null) {
            return;
        }
        c2 c2Var2 = null;
        if (!z10 && (taVar.getSelectedEntity() instanceof c2)) {
            sbVar.v1.A0(null, true);
            return;
        }
        if (!z10 || (sbVar.v1.getSelectedEntity() instanceof c2)) {
            return;
        }
        y5 y5Var = sbVar.v1.G0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= y5Var.getChildCount()) {
                c2Var = null;
                break;
            }
            View childAt = y5Var.getChildAt(i11);
            if (childAt instanceof c2) {
                c2Var = (c2) childAt;
                break;
            }
            i11++;
        }
        if (c2Var != null) {
            ta taVar2 = sbVar.v1;
            y5 y5Var2 = taVar2.G0;
            while (true) {
                if (i10 >= y5Var2.getChildCount()) {
                    break;
                }
                View childAt2 = y5Var2.getChildAt(i10);
                if (childAt2 instanceof c2) {
                    c2Var2 = (c2) childAt2;
                    break;
                }
                i10++;
            }
            taVar2.A0(c2Var2, true);
        }
    }

    @Override // fi.wb
    public void B(float f7, int i10) {
        ArrayList arrayList;
        o6 o6Var = (o6) this.b;
        w7 w7Var = o6Var.d;
        if (w7Var == null || (arrayList = w7Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((w7) o6Var.d.T.get(i10)).V = f7;
    }

    @Override // fi.wb
    public void C(float f7) {
        o6 o6Var = (o6) this.b;
        w7 w7Var = o6Var.d;
        if (w7Var == null) {
            return;
        }
        w7Var.F = f7;
        w7Var.j = true;
        o6Var.w(true);
    }

    @Override // fi.wb
    public void D(float f7) {
        o6 o6Var = (o6) this.b;
        w7 w7Var = o6Var.d;
        if (w7Var == null) {
            return;
        }
        w7Var.E = f7;
        w7Var.j = true;
        o6Var.w(true);
    }

    @Override // fi.wb
    public void E(float f7, int i10) {
        ArrayList arrayList;
        o6 o6Var = (o6) this.b;
        w7 w7Var = o6Var.d;
        if (w7Var == null || (arrayList = w7Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((w7) o6Var.d.T.get(i10)).W = f7;
    }

    @Override // fi.wb
    public void F(float f7) {
        w7 w7Var = ((o6) this.b).d;
        if (w7Var == null) {
            return;
        }
        w7Var.a0 = f7;
        w7Var.j = true;
    }

    @Override // z3.m
    public void G(byte[] bArr, int i10, int i11, z3.l lVar, j jVar) {
        d2.b a2;
        x xVar = (x) this.b;
        xVar.L(i10 + i11, bArr);
        xVar.N(i10);
        ArrayList arrayList = new ArrayList();
        while (xVar.a() > 0) {
            yb.f("Incomplete Mp4Webvtt Top Level box header found.", xVar.a() >= 8);
            int m10 = xVar.m();
            if (xVar.m() == 1987343459) {
                int i12 = m10 - 8;
                CharSequence charSequence = null;
                d2.a aVar = null;
                while (i12 > 0) {
                    yb.f("Incomplete vtt cue box header found.", i12 >= 8);
                    int m11 = xVar.m();
                    int m12 = xVar.m();
                    int i13 = m11 - 8;
                    byte[] bArr2 = xVar.a;
                    int i14 = xVar.b;
                    String str = e2.n0.a;
                    String str2 = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    xVar.O(i13);
                    i12 = (i12 - 8) - i13;
                    if (m12 == 1937011815) {
                        g gVar = new g();
                        h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (m12 == 1885436268) {
                        charSequence = h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.a = charSequence;
                    aVar.b = null;
                    a2 = aVar.a();
                } else {
                    Pattern pattern = h.a;
                    g gVar2 = new g();
                    gVar2.c = charSequence;
                    a2 = gVar2.a().a();
                }
                arrayList.add(a2);
            } else {
                xVar.O(m10 - 8);
            }
        }
        jVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // fi.wb
    public void I() {
        ((o6) this.b).q(null);
    }

    @Override // fi.wb
    public void J(float f7) {
        o6 o6Var = (o6) this.b;
        w7 w7Var = o6Var.d;
        if (w7Var == null) {
            return;
        }
        w7Var.t0 = f7;
        w7Var.j = true;
        o6Var.y(true);
    }

    @Override // fi.wb
    public void K(int i10, long j10) {
        ArrayList arrayList;
        o6 o6Var = (o6) this.b;
        w7 w7Var = o6Var.d;
        if (w7Var == null || (arrayList = w7Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((w7) o6Var.d.T.get(i10)).X = j10;
    }

    @Override // fi.wb
    public void L(long j10) {
        o6 o6Var = (o6) this.b;
        w7 w7Var = o6Var.d;
        if (w7Var == null) {
            return;
        }
        w7Var.D = j10;
        w7Var.j = true;
        o6Var.w(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05e5 A[Catch: a | c -> 0x0682, TryCatch #0 {a | c -> 0x0682, blocks: (B:298:0x05cb, B:299:0x05e1, B:301:0x05e5, B:302:0x05e8, B:304:0x05ec, B:306:0x05f6, B:308:0x05fc, B:313:0x0601), top: B:297:0x05cb }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h0 M(s sVar) {
        int i10;
        ArrayList arrayList;
        kc.c cVar;
        kc.c cVar2;
        kc.c cVar3;
        float f7;
        float f10;
        kc.a aVar;
        float f11;
        float f12;
        float f13;
        int i11;
        int i12;
        ec.j[] jVarArr;
        ec.a aVar2;
        fc.b bVar;
        int i13;
        c2.s sVar2;
        int i14;
        h0 h0Var;
        List list;
        String str;
        int i15;
        boolean z10;
        double d;
        double abs;
        int i16;
        int i17;
        int i18;
        int i19;
        a4.l lVar = (a4.l) this.b;
        if (((fc.b) sVar.c) == null) {
            sVar.c = ((e) sVar.b).a();
        }
        fc.b bVar2 = (fc.b) sVar.c;
        s0 s0Var = new s0(bVar2, 2);
        kc.e eVar = new kc.e(bVar2);
        int i20 = bVar2.b;
        int i21 = bVar2.a;
        int i22 = (i20 * 3) / 388;
        int i23 = 3;
        if (i22 < 3) {
            i22 = 3;
        }
        char c10 = 5;
        int[] iArr = new int[5];
        int i24 = i22 - 1;
        int i25 = 0;
        boolean z11 = false;
        while (true) {
            char c11 = c10;
            int i26 = 1;
            i10 = i23;
            arrayList = eVar.b;
            if (i24 >= i20 || z11) {
                break;
            }
            Arrays.fill(iArr, i25);
            int i27 = i25;
            while (i27 < i21) {
                if (bVar2.b(i27, i24)) {
                    if ((i25 & 1) == i26) {
                        i25++;
                    }
                    iArr[i25] = iArr[i25] + i26;
                } else if ((i25 & 1) == 0) {
                    if (i25 == 4) {
                        if (!kc.e.b(iArr)) {
                            i16 = i27;
                            int i28 = i26;
                            iArr[0] = iArr[2];
                            iArr[i28] = iArr[i10];
                            iArr[2] = iArr[4];
                            iArr[i10] = i28;
                            iArr[4] = 0;
                        } else if (eVar.c(i24, i27, iArr)) {
                            if (eVar.c) {
                                z11 = eVar.d();
                                i18 = 2;
                            } else {
                                if (arrayList.size() > i26) {
                                    int size = arrayList.size();
                                    int i29 = 0;
                                    kc.c cVar4 = null;
                                    while (true) {
                                        if (i29 >= size) {
                                            i17 = i27;
                                            i18 = 2;
                                            i19 = 0;
                                            break;
                                        }
                                        Object obj = arrayList.get(i29);
                                        i29++;
                                        kc.c cVar5 = (kc.c) obj;
                                        i17 = i27;
                                        if (cVar5.d >= 2) {
                                            if (cVar4 != null) {
                                                eVar.c = true;
                                                i18 = 2;
                                                i19 = ((int) (Math.abs(cVar4.a - cVar5.a) - Math.abs(cVar4.b - cVar5.b))) / 2;
                                                break;
                                            }
                                            cVar4 = cVar5;
                                        }
                                        i27 = i17;
                                    }
                                } else {
                                    i17 = i27;
                                    i19 = 0;
                                    i18 = 2;
                                }
                                if (i19 > iArr[i18]) {
                                    i24 += (i19 - r4) - 2;
                                    i27 = i21 - 1;
                                } else {
                                    i27 = i17;
                                }
                            }
                            Arrays.fill(iArr, 0);
                            i25 = 0;
                            i22 = i18;
                        } else {
                            i16 = i27;
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[i10];
                            iArr[2] = iArr[4];
                            iArr[i10] = 1;
                            iArr[4] = 0;
                        }
                        i25 = i10;
                    } else {
                        i16 = i27;
                        int i30 = i25 + 1;
                        iArr[i30] = iArr[i30] + 1;
                        i25 = i30;
                    }
                    i27 = i16;
                } else {
                    iArr[i25] = iArr[i25] + 1;
                }
                i27++;
                i26 = 1;
            }
            if (kc.e.b(iArr) && eVar.c(i24, i21, iArr)) {
                int i31 = iArr[0];
                if (eVar.c) {
                    i22 = i31;
                    z11 = eVar.d();
                } else {
                    i22 = i31;
                }
            }
            i24 += i22;
            c10 = c11;
            i23 = i10;
            i25 = 0;
        }
        if (arrayList.size() < i10) {
            throw ec.e.a();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((kc.c) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList, kc.e.e);
        kc.c[] cVarArr = new kc.c[3];
        int i32 = 0;
        double d10 = Double.MAX_VALUE;
        for (int i33 = 2; i32 < arrayList.size() - i33; i33 = 2) {
            kc.c cVar6 = (kc.c) arrayList.get(i32);
            float f14 = cVar6.c;
            i32++;
            int i34 = i32;
            while (i34 < arrayList.size() - 1) {
                kc.c cVar7 = (kc.c) arrayList.get(i34);
                double e = kc.e.e(cVar6, cVar7);
                i34++;
                for (int i35 = i34; i35 < arrayList.size(); i35++) {
                    kc.c cVar8 = (kc.c) arrayList.get(i35);
                    if (cVar8.c <= 1.4f * f14) {
                        double e10 = kc.e.e(cVar7, cVar8);
                        double e11 = kc.e.e(cVar6, cVar8);
                        if (e < e10) {
                            if (e10 <= e11) {
                                e11 = e10;
                                e10 = e11;
                            } else if (e >= e11) {
                                d = e11;
                                e11 = e;
                                abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                                if (abs >= d10) {
                                    cVarArr[0] = cVar6;
                                    cVarArr[1] = cVar7;
                                    cVarArr[2] = cVar8;
                                    d10 = abs;
                                }
                            }
                            d = e;
                            abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                            if (abs >= d10) {
                            }
                        } else {
                            if (e10 >= e11) {
                                d = e11;
                                e11 = e10;
                            } else if (e < e11) {
                                d = e10;
                                e10 = e11;
                                e11 = e;
                                abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                                if (abs >= d10) {
                                }
                            } else {
                                d = e10;
                            }
                            e10 = e;
                            abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                            if (abs >= d10) {
                            }
                        }
                    }
                }
            }
        }
        if (d10 == Double.MAX_VALUE) {
            throw ec.e.a();
        }
        float a2 = ec.j.a(cVarArr[0], cVarArr[1]);
        float a10 = ec.j.a(cVarArr[1], cVarArr[2]);
        float a11 = ec.j.a(cVarArr[0], cVarArr[2]);
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
        if (ic.a.d(cVar2.a, f15, cVar3.b - f16, (cVar2.b - f16) * (cVar3.a - f15)) < 0.0f) {
            kc.c cVar9 = cVar3;
            cVar3 = cVar2;
            cVar2 = cVar9;
        }
        cVarArr[0] = cVar2;
        cVarArr[1] = cVar;
        cVarArr[2] = cVar3;
        float c02 = s0Var.c0(cVar, cVar3);
        float f17 = cVar.a;
        float f18 = cVar3.b;
        float f19 = cVar3.a;
        float c03 = s0Var.c0(cVar, cVar2);
        float f20 = cVar2.b;
        float f21 = cVar2.a;
        float f22 = (c03 + c02) / 2.0f;
        if (f22 < 1.0f) {
            throw ec.e.a();
        }
        float a12 = ec.j.a(cVar, cVar3) / f22;
        int i36 = (int) (a12 + (a12 < 0.0f ? -0.5f : 0.5f));
        float a13 = ec.j.a(cVar, cVar2) / f22;
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
        int[] iArr2 = f.e;
        if (i40 % 4 != 1) {
            throw ec.c.a();
        }
        try {
            f c12 = f.c((i40 - 17) / 4);
            int i41 = (c12.a * 4) + 10;
            if (c12.b.length > 0) {
                float f23 = (f19 - f17) + f21;
                f10 = f19;
                float f24 = (f18 - f16) + f20;
                float f25 = 1.0f - (3.0f / i41);
                int z12 = (int) c3.h0.z(f23, f17, f25, f17);
                int z13 = (int) c3.h0.z(f24, f16, f25, f16);
                f7 = f17;
                for (int i42 = 4; i42 <= 16; i42 <<= 1) {
                    try {
                        aVar = s0Var.d0(f22, i42, z12, z13);
                        break;
                    } catch (ec.e unused) {
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
            fc.g a14 = fc.g.a(3.5f, 3.5f, f26, 3.5f, f13, f13, 3.5f, f26);
            kc.a aVar3 = aVar;
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
            fc.g a15 = fc.g.a(f28, f29, f30, f31, f11, f27, f32, f33);
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
                throw ec.e.a();
            }
            fc.b bVar3 = new fc.b(i40, i40);
            int i43 = i40 * 2;
            kc.c cVar10 = cVar;
            float[] fArr = new float[i43];
            int i44 = 0;
            while (i44 < i40) {
                int i45 = i40;
                float f73 = i44 + 0.5f;
                int i46 = 0;
                while (i46 < i43) {
                    int i47 = i46;
                    fArr[i47] = (i47 / 2) + 0.5f;
                    fArr[i47 + 1] = f73;
                    i46 = i47 + 2;
                }
                int i48 = i43 - 1;
                kc.c cVar11 = cVar2;
                int i49 = 0;
                while (i49 < i48) {
                    float f74 = fArr[i49];
                    int i50 = i49 + 1;
                    int i51 = i49;
                    float f75 = fArr[i50];
                    kc.c cVar12 = cVar3;
                    float e12 = b10.e(f71, f75, f70 * f74, f72);
                    fArr[i51] = (((f59 * f75) + (f58 * f74)) + f60) / e12;
                    fArr[i50] = (((f75 * f65) + (f74 * f64)) + f66) / e12;
                    i49 = i51 + 2;
                    cVar3 = cVar12;
                }
                kc.c cVar13 = cVar3;
                int i52 = bVar2.b;
                float f76 = f71;
                int i53 = 0;
                boolean z14 = true;
                while (i53 < i48 && z14) {
                    int i54 = (int) fArr[i53];
                    int i55 = i53 + 1;
                    int i56 = i48;
                    int i57 = (int) fArr[i55];
                    int i58 = i53;
                    if (i54 < -1 || i54 > i21 || i57 < -1 || i57 > i52) {
                        throw ec.e.a();
                    }
                    if (i54 == -1) {
                        fArr[i58] = 0.0f;
                    } else if (i54 == i21) {
                        fArr[i58] = i21 - 1;
                    } else {
                        z10 = false;
                        if (i57 != -1) {
                            fArr[i55] = 0.0f;
                        } else if (i57 == i52) {
                            fArr[i55] = i52 - 1;
                        } else {
                            z14 = z10;
                            i53 = i58 + 2;
                            i48 = i56;
                        }
                        z14 = true;
                        i53 = i58 + 2;
                        i48 = i56;
                    }
                    z10 = true;
                    if (i57 != -1) {
                    }
                    z14 = true;
                    i53 = i58 + 2;
                    i48 = i56;
                }
                int i59 = i43 - 2;
                boolean z15 = true;
                while (i59 >= 0 && z15) {
                    int i60 = (int) fArr[i59];
                    int i61 = i59 + 1;
                    int i62 = i59;
                    int i63 = (int) fArr[i61];
                    if (i60 < -1 || i60 > i21 || i63 < -1 || i63 > i52) {
                        throw ec.e.a();
                    }
                    if (i60 == -1) {
                        fArr[i62] = 0.0f;
                    } else if (i60 == i21) {
                        fArr[i62] = i21 - 1;
                    } else {
                        z15 = false;
                        if (i63 != -1) {
                            fArr[i61] = 0.0f;
                        } else if (i63 == i52) {
                            fArr[i61] = i52 - 1;
                        } else {
                            i59 = i62 - 2;
                        }
                        z15 = true;
                        i59 = i62 - 2;
                    }
                    z15 = true;
                    if (i63 != -1) {
                    }
                    z15 = true;
                    i59 = i62 - 2;
                }
                for (int i64 = 0; i64 < i43; i64 += 2) {
                    try {
                        if (bVar2.b((int) fArr[i64], (int) fArr[i64 + 1])) {
                            bVar3.c(i64 / 2, i44);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw ec.e.a();
                    }
                }
                i44++;
                i40 = i45;
                cVar2 = cVar11;
                f71 = f76;
                cVar3 = cVar13;
            }
            kc.c cVar14 = cVar2;
            kc.c cVar15 = cVar3;
            if (aVar3 == null) {
                i12 = 3;
                i11 = 1;
                jVarArr = new ec.j[]{cVar14, cVar10, cVar15};
            } else {
                i11 = 1;
                i12 = 3;
                jVarArr = new ec.j[]{cVar14, cVar10, cVar15, aVar3};
            }
            ec.j[] jVarArr2 = jVarArr;
            lVar.getClass();
            c2.b bVar4 = new c2.b();
            int i65 = bVar3.b;
            if (i65 < 21 || (i65 & i12) != i11) {
                throw ec.c.a();
            }
            bVar4.b = bVar3;
            try {
                sVar2 = lVar.p(bVar4);
            } catch (ec.a e13) {
                aVar2 = e13;
                e = null;
                try {
                    bVar4.u();
                    bVar4.c = null;
                    bVar4.d = null;
                    bVar4.a = true;
                    bVar4.t();
                    bVar4.s();
                    bVar = (fc.b) bVar4.b;
                    i13 = 0;
                    while (i13 < bVar.a) {
                        int i66 = i13 + 1;
                        for (int i67 = i66; i67 < bVar.b; i67++) {
                            if (bVar.b(i13, i67) != bVar.b(i67, i13)) {
                                bVar.a(i67, i13);
                                bVar.a(i13, i67);
                            }
                        }
                        i13 = i66;
                    }
                    c2.s p10 = lVar.p(bVar4);
                    p10.h = new tb.a(11);
                    sVar2 = p10;
                    i14 = sVar2.a;
                    if (c3.h0.t((tb.a) sVar2.h)) {
                        ec.j jVar = jVarArr2[0];
                        jVarArr2[0] = jVarArr2[2];
                        jVarArr2[2] = jVar;
                    }
                    h0Var = new h0((String) sVar2.d, jVarArr2);
                    list = (List) sVar2.e;
                    if (list != null) {
                    }
                    str = (String) sVar2.f;
                    if (str != null) {
                    }
                    if (i14 >= 0) {
                        h0Var.s(i.d, Integer.valueOf(i15));
                        h0Var.s(i.e, Integer.valueOf(i14));
                    }
                    h0Var.s(i.c, (Integer) sVar2.g);
                    h0Var.s(i.f, "]Q" + sVar2.c);
                    return h0Var;
                } catch (ec.a | ec.c unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw aVar2;
                }
            } catch (ec.c e14) {
                e = e14;
                aVar2 = null;
                bVar4.u();
                bVar4.c = null;
                bVar4.d = null;
                bVar4.a = true;
                bVar4.t();
                bVar4.s();
                bVar = (fc.b) bVar4.b;
                i13 = 0;
                while (i13 < bVar.a) {
                }
                c2.s p102 = lVar.p(bVar4);
                p102.h = new tb.a(11);
                sVar2 = p102;
                i14 = sVar2.a;
                if (c3.h0.t((tb.a) sVar2.h)) {
                }
                h0Var = new h0((String) sVar2.d, jVarArr2);
                list = (List) sVar2.e;
                if (list != null) {
                }
                str = (String) sVar2.f;
                if (str != null) {
                }
                if (i14 >= 0) {
                }
                h0Var.s(i.c, (Integer) sVar2.g);
                h0Var.s(i.f, "]Q" + sVar2.c);
                return h0Var;
            }
            i14 = sVar2.a;
            if (c3.h0.t((tb.a) sVar2.h) && jVarArr2.length >= 3) {
                ec.j jVar2 = jVarArr2[0];
                jVarArr2[0] = jVarArr2[2];
                jVarArr2[2] = jVar2;
            }
            h0Var = new h0((String) sVar2.d, jVarArr2);
            list = (List) sVar2.e;
            if (list != null) {
                h0Var.s(i.a, list);
            }
            str = (String) sVar2.f;
            if (str != null) {
                h0Var.s(i.b, str);
            }
            if (i14 >= 0 && (i15 = sVar2.b) >= 0) {
                h0Var.s(i.d, Integer.valueOf(i15));
                h0Var.s(i.e, Integer.valueOf(i14));
            }
            h0Var.s(i.c, (Integer) sVar2.g);
            h0Var.s(i.f, "]Q" + sVar2.c);
            return h0Var;
        } catch (IllegalArgumentException unused4) {
            throw ec.c.a();
        }
    }

    public StringBuilder N() {
        gf.a aVar = (gf.a) this.b;
        if (!(aVar instanceof bf.p)) {
            return null;
        }
        StringBuilder sb2 = ((bf.p) aVar).b.b;
        if (sb2.length() == 0) {
            return null;
        }
        return sb2;
    }

    public Set O() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.b);
        }
        return unmodifiableSet;
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
    public void Q(Object obj) {
        Integer num = (Integer) obj;
        e0 e0Var = (e0) this.b;
        Handler handler = e0Var.A0;
        d dVar = e0Var.B0;
        handler.removeCallbacks(dVar);
        int intValue = num.intValue();
        if (e0Var.F0 != null) {
            int i10 = e0Var.C0.y;
            Context n10 = e0Var.n();
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
                e0Var.F0.setImageDrawable(drawable);
                if ((i10 != 0 || intValue != 1) && ((i10 == 1 && intValue == 2) || (i10 == 2 && intValue == 1))) {
                    c0.a(drawable);
                }
                e0Var.C0.y = intValue;
            }
        }
        int intValue2 = num.intValue();
        TextView textView = e0Var.G0;
        if (textView != null) {
            textView.setTextColor(intValue2 == 2 ? e0Var.D0 : e0Var.E0);
        }
        handler.postDelayed(dVar, 2000L);
    }

    public Boolean R() {
        Bundle bundle = (Bundle) this.b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public c3.j S() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (c3.j jVar : ((LinkedHashMap) this.b).values()) {
            arrayList.add(jVar.b);
            arrayList2.add(jVar.c);
            arrayList3.add(jVar.d);
            arrayList4.add(jVar.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j10 = 0;
        for (int[] iArr2 : iArr) {
            j10 += iArr2.length;
        }
        int i10 = (int) j10;
        yb.c(j10, "the total number of elements (%s) in the arrays must fit in an int", j10 == ((long) i10));
        int[] iArr3 = new int[i10];
        int i11 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i11, iArr4.length);
            i11 += iArr4.length;
        }
        return new c3.j(iArr3, fd.a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), fd.a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), fd.a((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public void T() {
        ((t) this.b).d.R();
    }

    @Override // hb.n
    public Object U1() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new fb.j("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new fb.j("Invalid EnumMap type: " + type.toString());
    }

    @Override // ai.n0
    public void a(o0 o0Var) {
        z0 z0Var = (z0) this.b;
        FrameLayout frameLayout = z0Var.f;
        if (frameLayout != null) {
            frameLayout.removeView(o0Var);
        }
        if (z0Var.F == o0Var) {
            z0Var.F = null;
        }
        t1 t1Var = z0Var.d;
        if (t1Var != null) {
            t1Var.setScanHidden(false);
        }
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        int i10 = this.a;
        Object obj3 = this.b;
        switch (i10) {
            case 5:
                b8.e eVar = new b8.e(1, (TaskCompletionSource) obj2);
                b8.c cVar = (b8.c) ((b8.g) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i11 = b8.a.a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((m8.c) obj3).writeToParcel(obtain, 0);
                cVar.F0(obtain, 1);
                break;
            case 25:
                q qVar = new q(2, (TaskCompletionSource) obj2);
                h6.i iVar = (h6.i) ((h6.s) obj).u();
                Parcel N0 = iVar.N0();
                com.google.android.gms.internal.cast.t.d(N0, qVar);
                N0.writeStringArray((String[]) obj3);
                iVar.S0(N0, 7);
                break;
            default:
                j7.a aVar = new j7.a((TaskCompletionSource) obj2);
                j7.i iVar2 = (j7.i) ((j7.c) obj).u();
                String str = ((j7.b) obj3).k;
                Parcel J0 = iVar2.J0();
                int i12 = j7.f.a;
                J0.writeStrongBinder(aVar);
                J0.writeString(str);
                iVar2.K0(J0, 2);
                break;
        }
    }

    @Override // e9.k
    public Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        g1 g1Var = (g1) this.b;
        g1Var.getClass();
        entry.getClass();
        return new e1(entry, g1Var);
    }

    @Override // fi.wb
    public void b(int i10) {
        fi.e0 e0Var = ((o6) this.b).E;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                d0 d0Var = (d0) obj;
                if (d0Var.a == i10) {
                    d0Var.b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override // fi.wb
    public void c(float f7) {
        o6 o6Var = (o6) this.b;
        w7 w7Var = o6Var.d;
        if (w7Var == null) {
            return;
        }
        w7Var.u0 = f7;
        w7Var.j = true;
        o6Var.c();
    }

    @Override // androidx.activity.result.b
    public void d(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.b;
        int i10 = u.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        int i11 = aVar.a;
        if (i11 != -1 || i10 != 0) {
            u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // fi.wb
    public void e(float f7) {
        o6 o6Var = (o6) this.b;
        w7 w7Var = o6Var.d;
        if (w7Var == null) {
            return;
        }
        w7Var.G = f7;
        w7Var.j = true;
        o6Var.c();
    }

    @Override // ai.n0
    public void f(String str) {
        z0 z0Var = (z0) this.b;
        if (z0Var.getParentActivity() != null) {
            qf.d.r(z0Var.getParentActivity(), str);
        }
    }

    @Override // l.w
    public void g(l.k kVar, boolean z10) {
        ((g.r) this.b).g(kVar);
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // fi.wb
    public void h(long j10, boolean z10) {
        o6 o6Var = (o6) this.b;
        if (!z10) {
            o6Var.m(j10);
            return;
        }
        t81 t81Var = o6Var.e;
        if (t81Var != null) {
            t81Var.L(j10, true);
            return;
        }
        if (o6Var.j()) {
            o6Var.E.m(j10, true);
            return;
        }
        t81 t81Var2 = o6Var.y;
        if (t81Var2 != null) {
            t81Var2.L(j10, false);
        }
    }

    public void i(c3.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        long[] jArr = jVar.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
    }

    @Override // z3.m
    public /* synthetic */ z3.d j(int i10, int i11, byte[] bArr) {
        return b10.a(this, bArr, i11);
    }

    @Override // g6.a
    public void k(Bitmap bitmap) {
        ((g6.h) this.b).e(bitmap, 3);
    }

    @Override // fi.wb
    public void m() {
        o6 o6Var = (o6) this.b;
        o6Var.s(null, null, true);
        sb sbVar = ((gb) o6Var).C0;
        gb gbVar = sbVar.X0;
        if (gbVar != null) {
            gbVar.s(null, null, true);
        }
        ta taVar = sbVar.v1;
        if (taVar != null) {
            taVar.n0();
        }
        ib ibVar = sbVar.c1;
        if (ibVar != null) {
            ibVar.setHasRoundVideo(false);
        }
        w7 w7Var = sbVar.K1;
        if (w7Var != null) {
            File file = w7Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                sbVar.K1.o0 = null;
            }
            if (sbVar.K1.p0 != null) {
                try {
                    new File(sbVar.K1.p0).delete();
                } catch (Exception unused2) {
                }
                sbVar.K1.p0 = null;
            }
        }
    }

    @Override // fi.wb
    public void n(float f7) {
        o6 o6Var = (o6) this.b;
        w7 w7Var = o6Var.d;
        if (w7Var == null) {
            return;
        }
        w7Var.s0 = f7;
        w7Var.j = true;
        o6Var.y(true);
    }

    @Override // fi.wb
    public void o(boolean z10) {
        o6 o6Var = (o6) this.b;
        if (o6Var.j()) {
            o6Var.E.getClass();
        }
        o6Var.x(-4, z10);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        e6.c.h((e6.c) ((e6.j) this.b).c, "joinApplication", task);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        ng ngVar;
        ng ngVar2;
        c5.h hVar;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) ve.b.a(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        b6.i[] iVarArr = new b6.i[ports.length];
        for (int i10 = 0; i10 < ports.length; i10++) {
            InvocationHandler invocationHandler3 = ports[i10];
            b6.i iVar = new b6.i(9, false);
            iVar.b = (WebMessagePortBoundaryInterface) ve.b.a(WebMessagePortBoundaryInterface.class, invocationHandler3);
            iVarArr[i10] = iVar;
        }
        if (c5.m.a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) ve.b.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                ngVar = new ng(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    ngVar2 = null;
                    if (ngVar2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) ve.b.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        c5.h hVar2 = (c5.h) jsReplyProxyBoundaryInterface.getOrCreatePeer(new c5.g(jsReplyProxyBoundaryInterface, 0));
                        j1 j1Var = (j1) this.b;
                        switch (j1Var.a) {
                            case 1:
                                x0 x0Var = (x0) j1Var.b;
                                a1 a1Var = x0Var.Q;
                                if (webView != x0Var || a1Var == null) {
                                    return;
                                }
                                if (webView != a1Var.a || ngVar2.b != 0) {
                                    a1Var.g("onBotWebMessage ignored: invalid source or payload");
                                    return;
                                }
                                String k10 = a1.k(uri == null ? null : uri.toString());
                                if (a1Var.t0 && (TextUtils.isEmpty(a1Var.G0) || !TextUtils.equals(a1Var.G0, k10) || !TextUtils.equals(a1Var.G0, a1Var.getOriginHost()))) {
                                    a1Var.g("onBotWebMessage ignored: untrusted origin");
                                    return;
                                }
                                x7 f7 = a1Var.f();
                                try {
                                    ngVar2.g(0);
                                    String str = (String) ngVar2.c;
                                    if (str != null && str.length() <= 1048576) {
                                        JSONObject jSONObject = new JSONObject(str);
                                        String string = jSONObject.getString("eventType");
                                        if (!string.isEmpty() && string.length() <= 128) {
                                            AndroidUtilities.runOnUIThread(new b0(a1Var, webView, f7, string, jSONObject.optString("eventData", null), 2));
                                            return;
                                        }
                                        a1Var.g("onBotWebMessage ignored: invalid event type");
                                        return;
                                    }
                                    a1Var.g("onBotWebMessage ignored: invalid payload length");
                                    return;
                                } catch (JSONException e) {
                                    FileLog.e(e);
                                    return;
                                }
                            default:
                                ti.j jVar = (ti.j) j1Var.b;
                                if (webView == jVar.o && z10 && uri != null && jVar.f.equals(uri.toString()) && jVar.h(webView)) {
                                    int i11 = ngVar2.b;
                                    if (i11 != 0) {
                                        if (i11 == 1) {
                                            synchronized (jVar.a) {
                                                if (!jVar.u && (hVar = jVar.p) != null && hVar == hVar2) {
                                                    ngVar2.g(1);
                                                    byte[] bArr = (byte[]) ngVar2.d;
                                                    Objects.requireNonNull(bArr);
                                                    jVar.k.execute(new s9.g(12, jVar, bArr));
                                                }
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    ngVar2.g(0);
                                    String str2 = (String) ngVar2.c;
                                    if (jVar.q || str2 == null || !str2.startsWith("tproxy-base64:")) {
                                        jVar.g(str2, hVar2);
                                        return;
                                    }
                                    synchronized (jVar.a) {
                                        if (!jVar.u && jVar.r && jVar.p == hVar2) {
                                            if (str2.length() - 14 > 1398112) {
                                                jVar.f();
                                            } else {
                                                jVar.k.execute(new s9.g(11, jVar, str2));
                                            }
                                        }
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                    return;
                }
                ngVar = new ng(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
            }
        } else {
            ngVar = new ng(webMessageBoundaryInterface.getData());
        }
        ngVar2 = ngVar;
        if (ngVar2 == null) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public void p(int i10) {
        l6.a aVar;
        com.google.android.gms.common.api.internal.w wVar = (com.google.android.gms.common.api.internal.w) this.b;
        Lock lock = wVar.o;
        lock.lock();
        try {
            if (!wVar.n && (aVar = wVar.m) != null && aVar.c()) {
                wVar.n = true;
                wVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            wVar.n = false;
            com.google.android.gms.common.api.internal.w.k(wVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // ng.o
    public void q() {
        ((j0) this.b).d.invalidate();
    }

    @Override // fi.wb
    public void r(float f7, int i10) {
        ArrayList arrayList;
        o6 o6Var = (o6) this.b;
        w7 w7Var = o6Var.d;
        if (w7Var == null || (arrayList = w7Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((w7) o6Var.d.T.get(i10)).P = f7;
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public void s(Bundle bundle) {
        com.google.android.gms.common.api.internal.w wVar = (com.google.android.gms.common.api.internal.w) this.b;
        wVar.o.lock();
        try {
            Bundle bundle2 = wVar.k;
            if (bundle2 == null) {
                wVar.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            wVar.l = l6.a.e;
            com.google.android.gms.common.api.internal.w.l(wVar);
        } finally {
            wVar.o.unlock();
        }
    }

    @Override // l.w
    public boolean t(l.k kVar) {
        Window.Callback callback = ((g.r) this.b).f.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        aa.b0 b0Var = (aa.b0) this.b;
        d5.j jVar = (d5.j) b0Var.d;
        fa.c cVar = (fa.c) b0Var.c;
        String str = jVar.a;
        FileWriter fileWriter2 = null;
        try {
            HashMap c10 = d5.j.c(cVar);
            h0 h0Var = new h0(str, c10);
            h0Var.r("User-Agent", "Crashlytics Android SDK/18.6.0");
            h0Var.r("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            d5.j.b(h0Var, cVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + c10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = jVar.d(h0Var.l());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            fa.a b02 = ((b6.i) b0Var.f).b0(jSONObject);
            a4.l lVar = (a4.l) b0Var.g;
            long j10 = b02.c;
            lVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) lVar.b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        y9.h.c(fileWriter, "Failed to close settings writer.");
                        aa.b0.f("Loaded settings: ", jSONObject);
                        String str4 = cVar.f;
                        SharedPreferences.Editor edit = ((Context) b0Var.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) b0Var.h).set(b02);
                        ((TaskCompletionSource) ((AtomicReference) b0Var.i).get()).trySetResult(b02);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    y9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                y9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            y9.h.c(fileWriter, "Failed to close settings writer.");
            aa.b0.f("Loaded settings: ", jSONObject);
            String str42 = cVar.f;
            SharedPreferences.Editor edit2 = ((Context) b0Var.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) b0Var.h).set(b02);
            ((TaskCompletionSource) ((AtomicReference) b0Var.i).get()).trySetResult(b02);
        }
        return Tasks.forResult(null);
    }

    @Override // fi.wb
    public void u(float f7) {
        o6 o6Var = (o6) this.b;
        w7 w7Var = o6Var.d;
        if (w7Var == null) {
            return;
        }
        w7Var.P = f7;
        o6Var.c();
    }

    @Override // fi.wb
    public void v(float f7, boolean z10) {
        o6 o6Var = (o6) this.b;
        w7 w7Var = o6Var.d;
        if (w7Var == null) {
            return;
        }
        w7Var.Z = f7;
        w7Var.j = true;
        t81 t81Var = o6Var.e;
        if (t81Var == null || t81Var.p() == -9223372036854775807L) {
            return;
        }
        o6Var.m((long) (f7 * o6Var.e.p()));
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public void w(l6.a aVar) {
        com.google.android.gms.common.api.internal.w wVar = (com.google.android.gms.common.api.internal.w) this.b;
        wVar.o.lock();
        try {
            wVar.l = aVar;
            com.google.android.gms.common.api.internal.w.l(wVar);
        } finally {
            wVar.o.unlock();
        }
    }

    @Override // z3.m
    public int y() {
        return 2;
    }

    @Override // fi.wb
    public void z(long j10) {
        o6 o6Var = (o6) this.b;
        w7 w7Var = o6Var.d;
        if (w7Var == null) {
            return;
        }
        w7Var.r0 = j10;
        w7Var.j = true;
        o6Var.y(true);
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public c(JSONArray jSONArray) {
        this.a = 13;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new d5.m(optJSONObject));
                }
            }
        }
        this.b = arrayList;
    }

    public c(Context context) {
        this.a = 15;
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 8:
                this.b = new LinkedHashMap();
                break;
            case 10:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                break;
            case 27:
                this.b = new x();
                break;
            case 28:
                this.b = new a4.l(25);
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    @Override // ng.o
    public void P() {
    }

    @Override // z3.m
    public /* synthetic */ void reset() {
    }

    @Override // ng.o
    public void H(boolean z10) {
    }

    @Override // ng.o
    public void x(boolean z10) {
    }
}
