package rf;

import a8.h0;
import a8.jd;
import a8.rd;
import a8.wb;
import a8.yb;
import ai.f0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import b2.x0;
import bb.a0;
import bb.c0;
import bb.y;
import c3.i;
import c3.p;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d5.d0;
import d5.o;
import d6.e0;
import di.h4;
import di.q4;
import di.x9;
import di.y9;
import e2.j;
import e2.k0;
import e2.n0;
import e2.x;
import e6.h;
import h6.w;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.s;
import k2.v;
import li.a4;
import li.d6;
import li.g1;
import li.j3;
import li.j4;
import li.q;
import li.s3;
import li.t3;
import li.u3;
import m.r3;
import m5.t;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wc;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.li1;
import r0.i0;
import r0.k1;
import r0.n;
import w7.n5;
import z3.l;
import z3.m;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class b implements h, n, fe.b, d0, r, g2.g, g6.a, ga.a, h6.n, m, i, Continuation, t3 {
    public static volatile b d;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public static void D(b bVar, i2.d dVar) {
        bVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) bVar.b).entrySet()) {
            if (entry.getKey() != null) {
                throw new ClassCastException();
            }
            List list = (List) entry.getValue();
            if (!I(dVar, list).equals(I((i2.d) bVar.c, list))) {
                throw null;
            }
        }
        bVar.c = dVar;
    }

    public static String F(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static i2.d I(i2.d dVar, List list) {
        dVar.getClass();
        Map map = dVar.a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new i2.d(hashMap);
    }

    public static b L() {
        b bVar;
        b bVar2 = d;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (b.class) {
            try {
                bVar = d;
                if (bVar == null) {
                    bVar = new b(0);
                    d = bVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // li.t3
    public void A(int i10) {
        q qVar = (q) this.c;
        qVar.b.f2(qVar, i10);
        qVar.d0();
        q.N(qVar);
    }

    @Override // li.t3
    public void B(s3 s3Var, View view) {
        q qVar = (q) this.c;
        l80 l80Var = new l80(qVar, (u6) this.b, view, false, false, true);
        l80Var.Q = true;
        qVar.H = j4.c(l80Var, qVar.b.f0, qVar.getContext(), (u6) this.b, s3Var, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    @Override // fe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object C(fe.c cVar, nd.c cVar2) {
        fe.d dVar;
        int i10;
        b bVar;
        Throwable th2;
        switch (this.a) {
            case 8:
                Object C = ((b) this.b).C(new a0(cVar, (c0) this.c), cVar2);
                return C == md.a.a ? C : jd.i.a;
            default:
                if (cVar2 instanceof fe.d) {
                    dVar = (fe.d) cVar2;
                    int i11 = dVar.b;
                    if ((i11 & TLObject.FLAG_31) != 0) {
                        dVar.b = i11 - TLObject.FLAG_31;
                        Object obj = dVar.a;
                        Object obj2 = md.a.a;
                        i10 = dVar.b;
                        if (i10 != 0) {
                            jd.b(obj);
                            fe.b bVar2 = (fe.b) this.b;
                            dVar.d = this;
                            dVar.e = cVar;
                            dVar.b = 1;
                            obj = fe.n.a(bVar2, cVar, dVar);
                            if (obj == obj2) {
                                return obj2;
                            }
                            bVar = this;
                        } else {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                jd.b(obj);
                                return jd.i.a;
                            }
                            cVar = dVar.e;
                            bVar = dVar.d;
                            jd.b(obj);
                        }
                        th2 = (Throwable) obj;
                        if (th2 != null) {
                            y yVar = (y) bVar.c;
                            dVar.d = null;
                            dVar.e = null;
                            dVar.b = 2;
                            if (yVar.a(cVar, th2, dVar) == obj2) {
                                return obj2;
                            }
                        }
                        return jd.i.a;
                    }
                }
                dVar = new fe.d(this, cVar2);
                Object obj3 = dVar.a;
                Object obj22 = md.a.a;
                i10 = dVar.b;
                if (i10 != 0) {
                }
                th2 = (Throwable) obj3;
                if (th2 != null) {
                }
                return jd.i.a;
        }
    }

    public d5.e E() {
        if (((o) this.b) != null) {
            return new d5.e(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x03ae, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0117, code lost:
    
        if (")".equals(i4.a.b(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // z3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void G(byte[] bArr, int i10, int i11, l lVar, j jVar) {
        i4.c cVar;
        String str;
        ?? r12;
        String sb2;
        int i12;
        char c10;
        b bVar = this;
        x xVar = (x) bVar.b;
        xVar.L(i10 + i11, bArr);
        xVar.N(i10);
        ArrayList arrayList = new ArrayList();
        try {
            i4.i.d(xVar);
            while (!TextUtils.isEmpty(xVar.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z10 = false;
                int i13 = -1;
                int i14 = 0;
                char c11 = 65535;
                while (true) {
                    ?? r92 = 1;
                    if (c11 == 65535) {
                        i14 = xVar.b;
                        String n10 = xVar.n(StandardCharsets.UTF_8);
                        c11 = n10 == null ? (char) 0 : "STYLE".equals(n10) ? (char) 2 : n10.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        xVar.N(i14);
                        if (c11 == 0) {
                            n5.b(new h0(arrayList2), lVar, jVar);
                            return;
                        }
                        if (c11 == 1) {
                            while (!TextUtils.isEmpty(xVar.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str2 = null;
                            if (c11 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new IllegalArgumentException("A style block was found after the first cue.");
                                }
                                xVar.n(StandardCharsets.UTF_8);
                                i4.a aVar = (i4.a) bVar.c;
                                x xVar2 = aVar.a;
                                StringBuilder sb3 = aVar.b;
                                sb3.setLength(0);
                                int i15 = xVar.b;
                                while (!TextUtils.isEmpty(xVar.n(StandardCharsets.UTF_8))) {
                                }
                                xVar2.L(xVar.b, xVar.a);
                                xVar2.N(i15);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    i4.a.c(xVar2);
                                    if (xVar2.a() >= 5 && "::cue".equals(xVar2.y(5, StandardCharsets.UTF_8))) {
                                        int i16 = xVar2.b;
                                        String b10 = i4.a.b(xVar2, sb3);
                                        if (b10 != null) {
                                            if ("{".equals(b10)) {
                                                xVar2.N(i16);
                                                str = "";
                                            } else if ("(".equals(b10)) {
                                                int i17 = xVar2.b;
                                                int i18 = xVar2.c;
                                                boolean z11 = z10 ? 1 : 0;
                                                while (i17 < i18 && z11 == 0) {
                                                    int i19 = i17 + 1;
                                                    z11 = ((char) xVar2.a[i17]) == ')' ? r92 : z10 ? 1 : 0;
                                                    i17 = i19;
                                                }
                                                str = xVar2.y((i17 - 1) - xVar2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                str = str2;
                                            }
                                            if (str == null && "{".equals(i4.a.b(xVar2, sb3))) {
                                                i4.b bVar2 = new i4.b();
                                                bVar2.a = "";
                                                bVar2.b = "";
                                                bVar2.c = Collections.EMPTY_SET;
                                                bVar2.d = "";
                                                bVar2.e = str2;
                                                bVar2.g = z10;
                                                bVar2.i = z10;
                                                bVar2.j = i13;
                                                bVar2.k = i13;
                                                bVar2.l = i13;
                                                bVar2.m = i13;
                                                bVar2.n = i13;
                                                bVar2.p = i13;
                                                bVar2.q = z10;
                                                if (!str.isEmpty()) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i13) {
                                                        ?? matcher = i4.a.c.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(r92);
                                                            group.getClass();
                                                            bVar2.d = group;
                                                        }
                                                        str = str.substring(z10 ? 1 : 0, indexOf);
                                                    }
                                                    String str3 = n0.a;
                                                    String[] split = str.split("\\.", i13);
                                                    String str4 = split[z10 ? 1 : 0];
                                                    int indexOf2 = str4.indexOf(35);
                                                    if (indexOf2 != i13) {
                                                        bVar2.b = str4.substring(z10 ? 1 : 0, indexOf2);
                                                        bVar2.a = str4.substring(indexOf2 + 1);
                                                    } else {
                                                        bVar2.b = str4;
                                                    }
                                                    if (split.length > r92) {
                                                        int length = split.length;
                                                        yb.g(length <= split.length ? r92 : z10 ? 1 : 0);
                                                        bVar2.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, (int) r92, length)));
                                                    }
                                                }
                                                boolean z12 = z10 ? 1 : 0;
                                                String str5 = str2;
                                                boolean z13 = r92;
                                                while (z12 == 0) {
                                                    int i20 = xVar2.b;
                                                    str5 = i4.a.b(xVar2, sb3);
                                                    boolean z14 = (str5 == null || "}".equals(str5)) ? z13 : z10;
                                                    if (z14 == 0) {
                                                        xVar2.N(i20);
                                                        i4.a.c(xVar2);
                                                        String a2 = i4.a.a(xVar2, sb3);
                                                        if (!a2.isEmpty() && ":".equals(i4.a.b(xVar2, sb3))) {
                                                            i4.a.c(xVar2);
                                                            StringBuilder sb4 = new StringBuilder();
                                                            boolean z15 = false;
                                                            while (true) {
                                                                if (z15) {
                                                                    sb2 = sb4.toString();
                                                                } else {
                                                                    int i21 = xVar2.b;
                                                                    String b11 = i4.a.b(xVar2, sb3);
                                                                    if (b11 == null) {
                                                                        sb2 = null;
                                                                    } else if ("}".equals(b11) || ";".equals(b11)) {
                                                                        xVar2.N(i21);
                                                                        z15 = true;
                                                                    } else {
                                                                        sb4.append(b11);
                                                                    }
                                                                }
                                                            }
                                                            if (sb2 != null && !sb2.isEmpty()) {
                                                                int i22 = xVar2.b;
                                                                String b12 = i4.a.b(xVar2, sb3);
                                                                if (!";".equals(b12)) {
                                                                    if ("}".equals(b12)) {
                                                                        xVar2.N(i22);
                                                                    }
                                                                }
                                                                if ("color".equals(a2)) {
                                                                    i12 = 1;
                                                                    bVar2.f = e2.h.a(sb2, true);
                                                                    bVar2.g = true;
                                                                } else {
                                                                    i12 = 1;
                                                                    if ("background-color".equals(a2)) {
                                                                        bVar2.h = e2.h.a(sb2, true);
                                                                        bVar2.i = true;
                                                                    } else {
                                                                        if ("ruby-position".equals(a2)) {
                                                                            if ("over".equals(sb2)) {
                                                                                bVar2.p = 1;
                                                                            } else if ("under".equals(sb2)) {
                                                                                bVar2.p = 2;
                                                                                r12 = 1;
                                                                                z13 = r12;
                                                                                z12 = z14;
                                                                                z10 = false;
                                                                            }
                                                                        } else if ("text-combine-upright".equals(a2)) {
                                                                            bVar2.q = "all".equals(sb2) || sb2.startsWith("digits");
                                                                        } else if ("text-decoration".equals(a2)) {
                                                                            if ("underline".equals(sb2)) {
                                                                                i12 = 1;
                                                                                bVar2.k = 1;
                                                                            }
                                                                        } else if ("font-family".equals(a2)) {
                                                                            bVar2.e = wb.c(sb2);
                                                                        } else if (!"font-weight".equals(a2)) {
                                                                            i12 = 1;
                                                                            if ("font-style".equals(a2)) {
                                                                                if ("italic".equals(sb2)) {
                                                                                    bVar2.m = 1;
                                                                                }
                                                                            } else if ("font-size".equals(a2)) {
                                                                                ?? matcher2 = i4.a.d.matcher(wb.c(sb2));
                                                                                if (matcher2.matches()) {
                                                                                    String group2 = matcher2.group(2);
                                                                                    group2.getClass();
                                                                                    switch (group2.hashCode()) {
                                                                                        case 37:
                                                                                            if (group2.equals("%")) {
                                                                                                c10 = 0;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3240:
                                                                                            if (group2.equals("em")) {
                                                                                                c10 = 1;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3592:
                                                                                            if (group2.equals("px")) {
                                                                                                c10 = 2;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    c10 = 65535;
                                                                                    switch (c10) {
                                                                                        case 0:
                                                                                            r12 = 1;
                                                                                            bVar2.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            r12 = 1;
                                                                                            bVar2.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            r12 = 1;
                                                                                            bVar2.n = 1;
                                                                                            break;
                                                                                        default:
                                                                                            throw new IllegalStateException();
                                                                                    }
                                                                                    String group3 = matcher2.group(r12);
                                                                                    group3.getClass();
                                                                                    bVar2.o = Float.parseFloat(group3);
                                                                                    z13 = r12;
                                                                                    z12 = z14;
                                                                                    z10 = false;
                                                                                } else {
                                                                                    e2.a.l("WebvttCssParser", "Invalid font-size: '" + sb2 + "'.");
                                                                                }
                                                                            }
                                                                        } else if ("bold".equals(sb2)) {
                                                                            i12 = 1;
                                                                            bVar2.l = 1;
                                                                        }
                                                                        z13 = r12;
                                                                        z12 = z14;
                                                                        z10 = false;
                                                                    }
                                                                }
                                                                r12 = i12;
                                                                z13 = r12;
                                                                z12 = z14;
                                                                z10 = false;
                                                            }
                                                            r12 = 1;
                                                            z13 = r12;
                                                            z12 = z14;
                                                            z10 = false;
                                                        }
                                                    }
                                                    r12 = z13;
                                                    z13 = r12;
                                                    z12 = z14;
                                                    z10 = false;
                                                }
                                                boolean z16 = z13;
                                                if ("}".equals(str5)) {
                                                    arrayList3.add(bVar2);
                                                }
                                                r92 = z16;
                                                z10 = false;
                                                i13 = -1;
                                                str2 = null;
                                            }
                                        }
                                    }
                                    str = str2;
                                    if (str == null) {
                                    }
                                }
                            } else if (c11 == 3) {
                                Pattern pattern = i4.h.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String n11 = xVar.n(charset);
                                if (n11 == null) {
                                    cVar = null;
                                } else {
                                    Pattern pattern2 = i4.h.a;
                                    Matcher matcher3 = pattern2.matcher(n11);
                                    if (matcher3.matches()) {
                                        cVar = i4.h.d(null, matcher3, xVar, arrayList);
                                    } else {
                                        cVar = null;
                                        String n12 = xVar.n(charset);
                                        if (n12 != null) {
                                            Matcher matcher4 = pattern2.matcher(n12);
                                            if (matcher4.matches()) {
                                                cVar = i4.h.d(n11.trim(), matcher4, xVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (cVar != null) {
                                    arrayList2.add(cVar);
                                }
                            }
                            bVar = this;
                        }
                    }
                }
            }
        } catch (x0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // li.t3
    public void H() {
        a4 a4Var = ((q) this.c).s;
        if (a4Var != null) {
            a4Var.e(false, true);
            int i10 = a4Var.b0;
            a4Var.g(i10 != 2 ? i10 : 0, true);
        }
    }

    public void J(i2.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new s(this, eVar, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hb.n K(mb.a aVar) {
        String str;
        hb.n aVar2;
        Type type = aVar.b;
        Class cls = aVar.a;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.get(type) != null) {
            throw new ClassCastException();
        }
        if (hashMap.get(cls) != null) {
            throw new ClassCastException();
        }
        hb.n nVar = null;
        hb.n cVar = EnumSet.class.isAssignableFrom(cls) ? new rb.c(type, 25) : cls == EnumMap.class ? new za.c(type, 26) : null;
        if (cVar != null) {
            return cVar;
        }
        hb.d.f((ArrayList) this.c);
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                rd rdVar = kb.c.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + kb.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + kb.c.e(e);
                }
                aVar2 = str != null ? new f2.a(str) : new a4.l(declaredConstructor, 22);
            } catch (NoSuchMethodException unused) {
            }
            if (aVar2 == null) {
                return aVar2;
            }
            if (Collection.class.isAssignableFrom(cls)) {
                int i10 = 9;
                nVar = SortedSet.class.isAssignableFrom(cls) ? new qb.a(i10) : Set.class.isAssignableFrom(cls) ? new sb.b(i10) : Queue.class.isAssignableFrom(cls) ? new tb.a(i10) : new u7.s(i10);
            } else if (Map.class.isAssignableFrom(cls)) {
                if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                    nVar = new pa.d();
                } else {
                    int i11 = 10;
                    nVar = ConcurrentMap.class.isAssignableFrom(cls) ? new qb.a(i11) : SortedMap.class.isAssignableFrom(cls) ? new sb.b(i11) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new mb.a(((ParameterizedType) type).getActualTypeArguments()[0]).a)) ? new u7.s(i11) : new tb.a(i11);
                }
            }
            if (nVar != null) {
                return nVar;
            }
            String F = F(cls);
            return F != null ? new com.google.android.gms.internal.clearcut.e(F) : new hb.e(cls);
        }
        aVar2 = null;
        if (aVar2 == null) {
        }
    }

    public boolean M() {
        return ((a) ((k6.c) this.b).d) != null;
    }

    public void N(boolean z10, boolean z11, float f7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
        h4 h4Var = (h4) this.c;
        y9 y9Var = h4Var.e;
        y9.B1 = f7;
        x9 x9Var = y9Var.z0;
        if (x9Var != null) {
            x9Var.setSpeed(f7);
        }
        q4.Y(h4Var.l, z10);
        if (!z11 || actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
    }

    public void O(g gVar) {
        d dVar;
        g gVar2;
        int i10;
        Log.d("CAST_CONTROLLER", "set current media");
        k6.c cVar = (k6.c) this.b;
        g gVar3 = (g) cVar.c;
        if (c5.d.u()) {
            if (gVar3 == null && gVar == null) {
                return;
            }
            if (gVar3 != null) {
                ArrayList arrayList = gVar3.a;
                if (gVar != null && arrayList.size() == gVar.a.size()) {
                    for (0; i10 < arrayList.size(); i10 + 1) {
                        f a2 = gVar3.a(i10);
                        f a10 = gVar.a(i10);
                        i10 = ((a2 == null && a10 == null) || (a2 != null && a10 != null && Objects.equals(a2.a, a10.a) && Objects.equals(a2.b, a10.b) && Objects.equals(a2.c, a10.c) && Objects.equals(a2.d, a10.d) && a2.e == a10.e && a2.f == a10.f)) ? i10 + 1 : 0;
                    }
                    return;
                }
            }
        }
        if (((a) cVar.d) != null && gVar != null) {
            cVar.g(gVar);
        }
        if (((a) cVar.d) != null && (gVar2 = (g) cVar.c) != null) {
            cVar.F(gVar2);
        }
        if (gVar != null && gVar.a.size() > 0 && !gVar.a(0).a.startsWith("audio/") && (dVar = (d) cVar.b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) cVar.d;
        if (aVar != null && gVar != null) {
            aVar.d = gVar;
            aVar.g = 0;
            aVar.h = 0;
            aVar.p();
        }
        cVar.c = gVar;
    }

    @Override // li.t3
    public l80 P(View view) {
        q qVar = (q) this.c;
        l80 l80Var = new l80(qVar, (u6) this.b, view, false, false, true);
        qVar.H = l80Var;
        return l80Var;
    }

    @Override // r0.n
    public k1 P0(View view, k1 k1Var) {
        a5.m mVar = (a5.m) this.c;
        k1 h = i0.h(view, k1Var);
        if (h.a.n()) {
            return h;
        }
        Rect rect = (Rect) this.b;
        rect.left = h.b();
        rect.top = h.d();
        rect.right = h.c();
        rect.bottom = h.a();
        int childCount = mVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            k1 b10 = i0.b(mVar.getChildAt(i10), h);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return h.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // li.t3
    public void Q() {
        q qVar = (q) this.c;
        qVar.a0();
        qVar.b0();
    }

    public void R(o oVar) {
        this.b = oVar;
        if (oVar.a() != null) {
            oVar.a().getClass();
            String str = oVar.a().d;
            if (str != null) {
                this.c = str;
            }
        }
    }

    public void S(e6.c cVar) {
        k6.c cVar2 = (k6.c) this.b;
        if (cVar == null) {
            return;
        }
        o6.l.e("Must be called from the main thread.");
        f6.h hVar = cVar.j;
        String a2 = cVar.a();
        if (TextUtils.isEmpty(a2) || hVar == null) {
            return;
        }
        a aVar = (a) cVar2.d;
        if (aVar == null || !TextUtils.equals(aVar.c.a(), a2)) {
            cVar2.I(new a(cVar, (e6.g) this.c, hVar));
            o6.l.e("Must be called from the main thread.");
            CastDevice castDevice = cVar.k;
            String str = castDevice != null ? castDevice.d : null;
            PhotoViewer v12 = PhotoViewer.v1();
            d.i();
            if (v12.E == null || v12.e0 == null || !v12.U1()) {
                return;
            }
            new wc(v12.e0, new di.b()).R(R.raw.forward, 36, !TextUtils.isEmpty(str) ? LocaleController.formatString(R.string.ChromecastStartedTo, str) : LocaleController.getString(R.string.ChromecastStarted)).j();
        }
    }

    public void T(g3 g3Var) {
        try {
            a0(g3Var, (p3) this.b);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void U(g3 g3Var, int i10, long j10) {
        try {
            o3 o3Var = (o3) ((p3) this.b).g();
            o3Var.c();
            p3.p((p3) o3Var.b, i10);
            p3 p3Var = (p3) o3Var.a();
            this.b = p3Var;
            if (j10 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.b, j10);
                p3Var = (p3) o3Var2.a();
            }
            a0(g3Var, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void V(g3 g3Var, long j10, boolean z10) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            com.google.android.gms.internal.play_billing.t3 t3Var = (com.google.android.gms.internal.play_billing.t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.b, z10);
            f3Var.c();
            g3.r((g3) f3Var.b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.b;
            } else {
                o3 o3Var = (o3) ((p3) this.b).g();
                o3Var.c();
                p3.r((p3) o3Var.b, j10);
                p3Var = (p3) o3Var.a();
            }
            a0(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void W(g3 g3Var, int i10, long j10, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.b).g();
            o3Var.c();
            p3.p((p3) o3Var.b, i10);
            this.b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            com.google.android.gms.internal.play_billing.t3 t3Var = (com.google.android.gms.internal.play_billing.t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.b, z10);
            f3Var.c();
            g3.r((g3) f3Var.b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.b, j10);
                p3Var = (p3) o3Var2.a();
            }
            a0(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void X(l3 l3Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.b);
            t10.c();
            x3.p((x3) t10.b, l3Var);
            ((b2.u) this.c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Y(com.google.android.gms.internal.play_billing.a4 a4Var) {
        try {
            b2.u uVar = (b2.u) this.c;
            w3 t10 = x3.t();
            t10.d((p3) this.b);
            t10.c();
            x3.r((x3) t10.b, a4Var);
            uVar.i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Z(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.b);
            t10.c();
            x3.s((x3) t10.b, b4Var);
            ((b2.u) this.c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // e6.h
    public void a(e6.f fVar, String str) {
        e6.c cVar = (e6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        S(cVar);
    }

    public void a0(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.n((x3) t10.b, g3Var);
            ((b2.u) this.c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        e0 e0Var = (e0) this.b;
        String str = (String) this.c;
        w wVar = (w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        o6.l.j("Not connected to device", e0Var.F == 2);
        h6.f fVar = (h6.f) wVar.u();
        Parcel N0 = fVar.N0();
        N0.writeString(str);
        fVar.S0(N0, 5);
        synchronized (e0Var.s) {
            try {
                if (e0Var.p != null) {
                    taskCompletionSource.setException(o6.l.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // e6.h
    public void b(e6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((e6.c) fVar).a() + " " + i10);
    }

    public void b0(i3 i3Var, p3 p3Var) {
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.o((x3) t10.b, i3Var);
            ((b2.u) this.c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // li.t3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(float f7) {
        boolean z10;
        a4 a4Var = ((q) this.c).s;
        if (a4Var != null) {
            FrameLayout frameLayout = a4Var.H;
            if (frameLayout != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                if (f7 >= r4[1]) {
                    z10 = true;
                    a4Var.e(z10, true);
                    if (!z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            a4Var.e(z10, true);
            if (!z10) {
            }
        }
        return false;
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new g2.n((Context) this.b, ((g2.o) this.c).createDataSource());
    }

    @Override // e6.h
    public void d(e6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((e6.c) fVar).a() + " " + i10);
    }

    @Override // e6.h
    public void e(e6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((e6.c) fVar).a() + " " + i10);
    }

    @Override // c3.i
    public c3.h f(p pVar, long j10) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        x xVar = (x) this.c;
        xVar.K(min);
        pVar.b(0, min, xVar.a);
        int i10 = -1;
        int i11 = -1;
        long j11 = -9223372036854775807L;
        while (xVar.a() >= 4) {
            if (h3.a.a(xVar.b, xVar.a) != 442) {
                xVar.O(1);
            } else {
                xVar.O(4);
                long c10 = j4.x.c(xVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((k0) this.b).b(c10);
                    if (b10 > j10) {
                        return j11 == -9223372036854775807L ? new c3.h(-1, b10, position) : new c3.h(0, -9223372036854775807L, position + i11);
                    }
                    if (b10 + 100000 > j10) {
                        return new c3.h(0, -9223372036854775807L, position + xVar.b);
                    }
                    j11 = b10;
                    i11 = xVar.b;
                }
                int i12 = xVar.c;
                if (xVar.a() >= 10) {
                    xVar.O(9);
                    int A = xVar.A() & 7;
                    if (xVar.a() >= A) {
                        xVar.O(A);
                        if (xVar.a() >= 4) {
                            if (h3.a.a(xVar.b, xVar.a) == 443) {
                                xVar.O(4);
                                int H = xVar.H();
                                if (xVar.a() < H) {
                                    xVar.N(i12);
                                } else {
                                    xVar.O(H);
                                }
                            }
                            while (true) {
                                if (xVar.a() < 4) {
                                    break;
                                }
                                int a2 = h3.a.a(xVar.b, xVar.a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                xVar.O(4);
                                if (xVar.a() < 2) {
                                    xVar.N(i12);
                                    break;
                                }
                                xVar.N(Math.min(xVar.c, xVar.b + xVar.H()));
                            }
                        } else {
                            xVar.N(i12);
                        }
                    } else {
                        xVar.N(i12);
                    }
                } else {
                    xVar.N(i12);
                }
                i10 = xVar.b;
            }
        }
        return j11 != -9223372036854775807L ? new c3.h(-2, j11, position + i10) : c3.h.d;
    }

    @Override // e6.h
    public void g(e6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((e6.c) fVar).a() + " " + str);
    }

    @Override // h6.n
    public void h(String str, long j10, long j11, long j12) {
        h6.n nVar = (h6.n) this.b;
        if (nVar != null) {
            nVar.h(str, j10, j11, j12);
        }
    }

    @Override // li.t3
    public void i(u3 u3Var, View view) {
        q qVar = (q) this.c;
        l80 l80Var = new l80(qVar, (u6) this.b, view, false, false, true);
        l80Var.Q = true;
        r2 r2Var = qVar.b.f0;
        qVar.getContext();
        qVar.H = j4.b(l80Var, r2Var, u3Var, true);
    }

    @Override // z3.m
    public /* synthetic */ z3.d j(int i10, int i11, byte[] bArr) {
        return b10.a(this, bArr, i11);
    }

    @Override // g6.a
    public void k(Bitmap bitmap) {
        n4.s sVar = (n4.s) this.b;
        sVar.c = bitmap;
        g6.f fVar = (g6.f) this.c;
        fVar.l = sVar;
        fVar.b();
    }

    @Override // e6.h
    public void l(e6.f fVar) {
        e6.c cVar = (e6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        S(cVar);
    }

    @Override // li.t3
    public void m(int i10) {
        q.R((q) this.c, 74, i10);
    }

    @Override // li.t3
    public void n() {
        q qVar = (q) this.c;
        li.v3 v3Var = qVar.r;
        a4 a4Var = qVar.s;
        if (a4Var != null) {
            j3 j3Var = v3Var.v3;
            int i10 = (j3Var != null && j3Var.x() && v3Var.I4()) ? 1 : 0;
            if (a4Var.a0 == 2) {
                a4Var.b0 = i10;
            } else {
                a4Var.g(i10, true);
            }
            if (i10 != 0) {
                qVar.Z();
            }
        }
        qVar.c0();
    }

    @Override // li.t3
    public void o(li.a aVar) {
        q qVar = (q) this.c;
        ti tiVar = qVar.b;
        r2 r2Var = tiVar.f0;
        if (r2Var != null && aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(r2Var)) {
            ti tiVar2 = new ti(qVar.getContext(), tiVar.f0, false, false, false, null);
            tiVar2.c2 = new sb.b(12);
            tiVar2.P = true;
            tiVar2.A1.setVisibility(8);
            tiVar2.z2 = new androidx.car.app.utils.a(qVar, aVar, tiVar2, 11);
            tiVar2.w1();
            tiVar2.show();
        }
    }

    @Override // li.t3
    public void onContentChanged() {
        q qVar = (q) this.c;
        a4 a4Var = qVar.s;
        if (a4Var != null) {
            a4Var.setSendLoading(qVar.r.s3());
        }
        qVar.Y(true);
        qVar.b0();
        li.d dVar = qVar.P;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override // li.t3
    public void p(d6 d6Var, String str) {
        q qVar = (q) this.c;
        if (qVar.v == null) {
            u6 u6Var = (u6) this.b;
            qVar.v = new r3(new f0(24, this, u6Var), u6Var);
        }
        qVar.v.f(d6Var, str);
    }

    @Override // li.t3
    public void q() {
        a4 a4Var = ((q) this.c).s;
        if (a4Var != null) {
            int i10 = a4Var.a0;
            if (i10 == 2) {
                i10 = 0;
            }
            a4Var.b0 = i10;
            a4Var.e(false, false);
            a4Var.g(2, true);
        }
    }

    @Override // e6.h
    public void r(e6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((e6.c) fVar).a());
    }

    @Override // li.t3
    public void s(g1 g1Var, boolean z10) {
        ((q) this.c).b.z1(g1Var, z10);
    }

    @Override // h6.n
    public void t(String str, long j10, int i10, Object obj, long j11, long j12) {
        ((h6.m) this.c).g = null;
        h6.n nVar = (h6.n) this.b;
        if (nVar != null) {
            nVar.t(str, j10, i10, obj, j11, j12);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        k6.a aVar = (k6.a) this.b;
        Bundle bundle = (Bundle) this.c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : aVar.a(bundle).onSuccessTask(k6.n.a, k6.b.b);
    }

    public String toString() {
        switch (this.a) {
            case 23:
                return ((HashMap) this.b).toString();
            default:
                return super.toString();
        }
    }

    @Override // li.t3
    public void u() {
        q qVar = (q) this.c;
        if (qVar.getCurrentItemTop() != qVar.I) {
            qVar.b.f2(qVar, 0);
        }
        qVar.d0();
        q.N(qVar);
    }

    @Override // e6.h
    public void v(e6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((e6.c) fVar).a() + " " + z10);
    }

    @Override // ga.a
    public StackTraceElement[] w(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ga.a[] aVarArr = (ga.a[]) this.b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            ga.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.w(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((u7.s) this.c).w(stackTraceElementArr2) : stackTraceElementArr2;
    }

    @Override // e6.h
    public void x(e6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((e6.c) fVar).a() + " " + i10);
        ((k6.c) this.b).I(null);
    }

    @Override // z3.m
    public int y() {
        return 1;
    }

    @Override // c3.i
    public void z() {
        x xVar = (x) this.c;
        byte[] bArr = n0.b;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
    }

    public /* synthetic */ b(int i10, boolean z10) {
        this.a = i10;
    }

    public b(Context context, int i10) {
        this.a = i10;
        switch (i10) {
            case 19:
                g2.o oVar = new g2.o();
                this.b = context.getApplicationContext();
                this.c = oVar;
                break;
            default:
                this.b = context;
                break;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public b(Context context, p3 p3Var) {
        this.a = 14;
        b2.u uVar = new b2.u(1);
        try {
            t.b(context);
            uVar.c = t.a().c(k5.a.e).a("PLAY_BILLING_LIBRARY", new j5.c("proto"), new u7.s(4));
        } catch (Throwable unused) {
            uVar.b = true;
        }
        this.c = uVar;
        this.b = p3Var;
    }

    public b(ga.a[] aVarArr) {
        this.a = 21;
        this.b = aVarArr;
        this.c = new u7.s(8);
    }

    public b(int i10) {
        this.a = i10;
        switch (i10) {
            case 12:
                this.b = new ConcurrentHashMap(16, 0.75f, 10);
                this.c = new ReferenceQueue();
                break;
            case 24:
                this.b = new HashMap();
                this.c = i2.d.b;
                break;
            case 25:
                this.b = new x();
                this.c = new i4.a();
                break;
            default:
                e6.a c10 = e6.a.c(ApplicationLoader.applicationContext);
                li1 li1Var = new li1(12);
                c10.getClass();
                o6.l.e("Must be called from the main thread.");
                e6.g gVar = c10.c;
                gVar.getClass();
                boolean z10 = false;
                try {
                    e6.y yVar = gVar.a;
                    e6.j jVar = new e6.j(li1Var);
                    Parcel N0 = yVar.N0();
                    com.google.android.gms.internal.cast.t.d(N0, jVar);
                    yVar.R0(N0, 4);
                } catch (RemoteException e) {
                    e6.g.c.a(e, "Unable to call %s on %s.", "addCastStateListener", e6.y.class.getSimpleName());
                }
                this.b = new k6.c(29, z10);
                e6.g b10 = c10.b();
                this.c = b10;
                b10.a(this);
                S(b10.c());
                break;
        }
    }

    @Override // z3.m
    public /* synthetic */ void reset() {
    }

    public b(k0 k0Var) {
        this.a = 26;
        this.b = k0Var;
        this.c = new x();
    }

    public b(Animation animation) {
        this.a = 6;
        this.b = animation;
        this.c = null;
    }

    public b(Handler handler, v vVar) {
        this.a = 27;
        if (vVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = vVar;
    }

    public b(Animator animator) {
        this.a = 6;
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(animator);
    }

    public b(a3.f fVar) {
        this.a = 1;
        this.c = fVar;
    }

    public b(a5.m mVar) {
        this.a = 2;
        this.c = mVar;
        this.b = new Rect();
    }
}
