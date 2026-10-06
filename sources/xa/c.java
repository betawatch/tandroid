package xa;

import ai.e6;
import ai.q4;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.util.Log;
import android.view.Window;
import android.widget.TextView;
import androidx.biometric.c0;
import androidx.biometric.e0;
import androidx.fragment.app.u;
import androidx.lifecycle.a0;
import b2.q0;
import c5.b0;
import ci.mb;
import ci.qc;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e2.d;
import e2.d0;
import e2.v;
import e6.g;
import e6.h;
import e6.o;
import ei.y4;
import g6.i;
import g6.n;
import g6.q;
import g6.r;
import gg.a2;
import gg.b2;
import hc.e;
import hc.f;
import ii.d3;
import ii.h1;
import ii.i1;
import ii.i2;
import ii.q5;
import ii.x3;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.regex.Pattern;
import l.k;
import l.w;
import m1.j;
import n6.l;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.qq0;
import org.telegram.ui.fy;
import org.telegram.ui.zi0;
import pg.t1;
import pg.u0;
import qg.v1;
import v7.i5;
import v7.t7;
import z3.m;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class c implements s, qq0, a0, androidx.activity.result.b, ce.b, v1, v0, OnSuccessListener, SuccessContinuation, n, f6.a, fb.n, w, b2, m, d5, h1 {
    public static volatile c c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(r rVar, String[] strArr) {
        this.a = 22;
        this.b = strArr;
    }

    public static p D(Looper looper, Object obj, String str) {
        l.i(obj, "Listener must not be null");
        l.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[LOOP:0: B:16:0x0047->B:18:0x004d, LOOP_END] */
    @Override // g6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A(String str, long j3, int i10, Object obj, long j10, long j11) {
        int i11;
        Iterator it;
        e6.p pVar = (e6.p) this.b;
        try {
            i11 = i10;
            try {
                Status status = new Status(i11, null, null, null);
                Object obj2 = true == (obj instanceof g6.l) ? obj : null;
                if (obj2 != null) {
                }
                if (obj2 != null) {
                }
                pVar.a(new o(status, 2));
            } catch (IllegalStateException e7) {
                e = e7;
                g6.b bVar = h.k;
                Log.e(bVar.a, bVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = pVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e10) {
            e = e10;
            i11 = i10;
        }
        it = pVar.q.i.iterator();
        while (it.hasNext()) {
            ((g) it.next()).h(str, j3, i11, j10, j11);
            i11 = i10;
        }
    }

    @Override // ii.h1
    public void B(Editable editable) {
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

    @Override // ii.h1
    public /* synthetic */ boolean C(boolean z10) {
        return false;
    }

    @Override // z3.m
    public void E(byte[] bArr, int i10, int i11, z3.l lVar, e2.h hVar) {
        d2.b a2;
        v vVar = (v) this.b;
        vVar.H(i10 + i11, bArr);
        vVar.J(i10);
        ArrayList arrayList = new ArrayList();
        while (vVar.a() > 0) {
            d.a("Incomplete Mp4Webvtt Top Level box header found.", vVar.a() >= 8);
            int j3 = vVar.j();
            if (vVar.j() == 1987343459) {
                int i12 = j3 - 8;
                CharSequence charSequence = null;
                d2.a aVar = null;
                while (i12 > 0) {
                    d.a("Incomplete vtt cue box header found.", i12 >= 8);
                    int j10 = vVar.j();
                    int j11 = vVar.j();
                    int i13 = j10 - 8;
                    byte[] bArr2 = vVar.a;
                    int i14 = vVar.b;
                    String str = d0.a;
                    String str2 = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    vVar.K(i13);
                    i12 = (i12 - 8) - i13;
                    if (j11 == 1937011815) {
                        i4.g gVar = new i4.g();
                        i4.h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (j11 == 1885436268) {
                        charSequence = i4.h.f(null, str2.trim(), Collections.EMPTY_LIST);
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
                    Pattern pattern = i4.h.a;
                    i4.g gVar2 = new i4.g();
                    gVar2.c = charSequence;
                    a2 = gVar2.a().a();
                }
                arrayList.add(a2);
            } else {
                vVar.K(j3 - 8);
            }
        }
        hVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // gg.b2
    public void F(ArrayList arrayList) {
        switch (this.a) {
            case 23:
                jo0 jo0Var = (jo0) this.b;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    jo0Var.J.add(((a2) arrayList.get(i10)).a);
                }
                fy fyVar = jo0Var.U;
                if (fyVar != null) {
                    fyVar.d(jo0Var.D0 > 0, false);
                }
                jo0Var.l();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x0346, code lost:
    
        throw cc.c.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a2 A[LOOP:21: B:147:0x0224->B:177:0x03a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0371 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dc.d G(com.google.firebase.messaging.m mVar) {
        int e7;
        e eVar;
        hc.c cVar;
        int i10;
        int i11;
        dc.c cVar2;
        int e10;
        f q6 = mVar.q();
        hc.c cVar3 = mVar.p().a;
        hc.d p5 = mVar.p();
        f q10 = mVar.q();
        int i12 = j.d(8)[p5.b];
        dc.b bVar = (dc.b) mVar.b;
        int i13 = bVar.b;
        for (int i14 = 0; i14 < i13; i14++) {
            for (int i15 = 0; i15 < i13; i15++) {
                if (e2.a(i12, i14, i15)) {
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
        b0 b0Var = q6.c[cVar3.ordinal()];
        q0[] q0VarArr = (q0[]) b0Var.c;
        int i34 = b0Var.b;
        int i35 = 0;
        for (q0 q0Var : q0VarArr) {
            i35 += q0Var.a;
        }
        hc.a[] aVarArr = new hc.a[i35];
        int i36 = 0;
        for (q0 q0Var2 : q0VarArr) {
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
                int H = ((c) this.b).H(bArr3.length - i54, iArr2);
                for (int i56 = 0; i56 < i54; i56++) {
                    bArr3[i56] = (byte) iArr2[i56];
                }
                i51 += H;
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
        char[] cArr = hc.b.a;
        b4.d dVar = new b4.d(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int i59 = -1;
        int i60 = -1;
        boolean z12 = false;
        boolean z13 = false;
        dc.c cVar4 = null;
        while (true) {
            try {
                int d = dVar.d();
                e eVar2 = e.c;
                if (d < 4 || (e7 = dVar.e(4)) == 0) {
                    eVar = eVar2;
                } else if (e7 == 1) {
                    eVar = e.d;
                } else if (e7 == 2) {
                    eVar = e.e;
                } else if (e7 == 3) {
                    eVar = e.f;
                } else if (e7 == 4) {
                    eVar = e.h;
                } else if (e7 == 5) {
                    eVar = e.s;
                } else if (e7 == 7) {
                    eVar = e.n;
                } else if (e7 == 8) {
                    eVar = e.r;
                } else if (e7 == 9) {
                    eVar = e.v;
                } else {
                    if (e7 != 13) {
                        throw new IllegalArgumentException();
                    }
                    eVar = e.w;
                }
                int ordinal = eVar.ordinal();
                if (ordinal != 0) {
                    cVar = cVar3;
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            i10 = i51;
                            i11 = 1;
                            int e11 = dVar.e(8);
                            if ((e11 & 128) == 0) {
                                e10 = e11 & 127;
                            } else if ((e11 & 192) == 128) {
                                e10 = ((e11 & 63) << 8) | dVar.e(8);
                            } else {
                                if ((e11 & 224) != 192) {
                                    throw cc.c.a();
                                }
                                e10 = ((e11 & 31) << 16) | dVar.e(16);
                            }
                            HashMap hashMap = dc.c.c;
                            if (e10 < 0 || e10 >= 900) {
                                break;
                            }
                            dc.c cVar5 = (dc.c) dc.c.c.get(Integer.valueOf(e10));
                            if (cVar5 == null) {
                                throw cc.c.a();
                            }
                            cVar2 = cVar5;
                        } else if (ordinal == 7) {
                            i10 = i51;
                            i11 = 1;
                            cVar2 = cVar4;
                            z12 = true;
                            z11 = true;
                        } else if (ordinal == 8) {
                            i10 = i51;
                            i11 = 1;
                            cVar2 = cVar4;
                            z12 = true;
                            z13 = true;
                        } else if (ordinal != 9) {
                            int e12 = dVar.e(eVar.a(q6));
                            int ordinal2 = eVar.ordinal();
                            i10 = i51;
                            if (ordinal2 == 1) {
                                hc.b.e(dVar, sb2, e12);
                            } else if (ordinal2 == 2) {
                                hc.b.a(dVar, sb2, e12, z12);
                            } else if (ordinal2 == 4) {
                                hc.b.b(dVar, sb2, e12, cVar4, arrayList);
                            } else {
                                if (ordinal2 != 6) {
                                    throw cc.c.a();
                                }
                                hc.b.d(dVar, sb2, e12);
                            }
                        } else {
                            i10 = i51;
                            int e13 = dVar.e(4);
                            int e14 = dVar.e(eVar.a(q6));
                            i11 = 1;
                            if (e13 == 1) {
                                hc.b.c(dVar, sb2, e14);
                            }
                        }
                        int i61 = i59;
                        if (eVar == eVar2) {
                            if (cVar2 != null) {
                                i11 = z11 ? 4 : z13 ? 6 : 2;
                            } else if (z11) {
                                i11 = 3;
                            } else if (z13) {
                                i11 = 5;
                            }
                            dc.d dVar2 = new dc.d(bArr2, sb2.toString(), arrayList.isEmpty() ? null : arrayList, cVar.toString(), i61, i60, i11);
                            dVar2.d = Integer.valueOf(i10);
                            return dVar2;
                        }
                        i59 = i61;
                        cVar3 = cVar;
                        cVar4 = cVar2;
                        i51 = i10;
                    } else {
                        i10 = i51;
                        i11 = 1;
                        if (dVar.d() < 16) {
                            throw cc.c.a();
                        }
                        i59 = dVar.e(8);
                        i60 = dVar.e(8);
                    }
                    cVar2 = cVar4;
                    int i612 = i59;
                    if (eVar == eVar2) {
                    }
                } else {
                    cVar = cVar3;
                    i10 = i51;
                }
                i11 = 1;
                cVar2 = cVar4;
                int i6122 = i59;
                if (eVar == eVar2) {
                }
            } catch (IllegalArgumentException unused2) {
                throw cc.c.a();
            }
        }
    }

    public int H(int i10, int[] iArr) {
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

    public Set I() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.b);
        }
        return unmodifiableSet;
    }

    public void J() {
        ((u) this.b).d.R();
    }

    @Override // org.telegram.ui.Components.d5
    public void K(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 27:
                ((ii.r) this.b).G(i10, z10, i11, false, 0L);
                ii.r rVar = (ii.r) this.b;
                zi0 zi0Var = rVar.O;
                if (zi0Var != null) {
                    zi0Var.i();
                    rVar.O = null;
                    break;
                }
                break;
            default:
                ((ii.e2) this.b).s0(i10, i11, z10);
                break;
        }
    }

    @Override // qg.v1
    public void X(float f7) {
        mb mbVar = (mb) this.b;
        u0.e(mbVar.F1).k(String.valueOf(pg.m.a.indexOf(mbVar.O0.getCurrentBrush())), f7);
        t1 t1Var = mbVar.A1;
        t1Var.c = f7;
        mbVar.E0(t1Var, null, false);
    }

    @Override // gg.b2
    public void a(int i10) {
        switch (this.a) {
            case 23:
                jo0 jo0Var = (jo0) this.b;
                jo0Var.D0--;
                jo0Var.e0 = i10;
                if (jo0Var.f0 != i10) {
                    jo0Var.s.clear();
                }
                if (jo0Var.g0 != i10) {
                    jo0Var.I.clear();
                }
                jo0Var.N = true;
                fy fyVar = jo0Var.U;
                if (fyVar != null) {
                    fyVar.d(jo0Var.D0 > 0, true);
                }
                jo0Var.l();
                fy fyVar2 = jo0Var.U;
                if (fyVar2 != null) {
                    fyVar2.c();
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new qc(this, 21));
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                l8.a aVar = (l8.a) this.b;
                a8.e eVar = new a8.e(0, (TaskCompletionSource) obj2);
                a8.c cVar = (a8.c) ((a8.g) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                aVar.writeToParcel(obtain, 0);
                cVar.G0(obtain, 2);
                break;
            default:
                q qVar = new q(0, (TaskCompletionSource) obj2);
                i iVar = (i) ((g6.s) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel O0 = iVar.O0();
                com.google.android.gms.internal.cast.v.d(O0, qVar);
                O0.writeStringArray(strArr);
                iVar.T0(O0, 5);
                break;
        }
    }

    @Override // ii.h1
    public void b(i1 i1Var) {
        d3 d3Var = ((q5) this.b).E;
        if (d3Var != null) {
            x3 x3Var = d3Var.a;
            x3.N1(x3Var, i1Var);
            x3Var.o3.P(i1Var, true);
        }
    }

    @Override // l.w
    public void c(k kVar, boolean z10) {
        ((g.s) this.b).g(kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ce.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(ce.c cVar, kd.c cVar2) {
        ce.a aVar;
        int i10;
        Throwable th2;
        de.g gVar;
        if (cVar2 instanceof ce.a) {
            aVar = (ce.a) cVar2;
            int i11 = aVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                aVar.d = i11 - TLObject.FLAG_31;
                Object obj = aVar.b;
                jd.a aVar2 = jd.a.a;
                i10 = aVar.d;
                gd.i iVar = gd.i.a;
                if (i10 != 0) {
                    t7.b(obj);
                    de.g gVar2 = new de.g(cVar, aVar.getContext());
                    try {
                        aVar.a = gVar2;
                        aVar.d = 1;
                        Object invoke = ((k1.m) this.b).invoke(gVar2, aVar);
                        if (invoke != aVar2) {
                            invoke = iVar;
                        }
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                        gVar = gVar2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        gVar = gVar2;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = aVar.a;
                    try {
                        t7.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                }
                gVar.releaseIntercepted();
                return iVar;
            }
        }
        aVar = new ce.a(this, cVar2);
        Object obj2 = aVar.b;
        jd.a aVar22 = jd.a.a;
        i10 = aVar.d;
        gd.i iVar2 = gd.i.a;
        if (i10 != 0) {
        }
        gVar.releaseIntercepted();
        return iVar2;
    }

    @Override // ii.h1
    public boolean e() {
        q5 q5Var = (q5) this.b;
        d3 d3Var = q5Var.E;
        if (d3Var == null || q5Var.a == null) {
            return false;
        }
        return d3Var.a.T4();
    }

    @Override // ii.h1
    public void f(int i10, int i11) {
        i2 i2Var;
        q5 q5Var = (q5) this.b;
        d3 d3Var = q5Var.E;
        if (d3Var == null || q5Var.a == null || (i2Var = d3Var.a.Q3) == null) {
            return;
        }
        i2Var.f(i10, i11);
    }

    public void g(c3.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        long[] jArr = jVar.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
    }

    @Override // qg.v1
    public float get() {
        mb mbVar = (mb) this.b;
        int i10 = mbVar.F1;
        pg.m currentBrush = mbVar.O0.getCurrentBrush();
        return currentBrush == null ? u0.e(i10).i : u0.e(i10).f(String.valueOf(pg.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // z3.m
    public /* synthetic */ z3.d h(int i10, int i11, byte[] bArr) {
        return sa.e.a(this, bArr, i11);
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void i(k6.a aVar) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.l = aVar;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // androidx.activity.result.b
    public void j(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        int i11 = aVar.a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    public void k(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // f6.a
    public void m(Bitmap bitmap) {
        g6.b bVar = f6.i.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f7 = width;
            int height = bitmap.getHeight();
            int B = (int) a4.a.B(f7, 9.0f, 16.0f, 0.5f);
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

    @Override // ii.h1
    public /* synthetic */ boolean n(i1 i1Var) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void o(int i10) {
        k6.a aVar;
        x xVar = (x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (!xVar.n && (aVar = xVar.m) != null && aVar.c()) {
                xVar.n = true;
                xVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.n = false;
            x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((d6.a) this.b).getClass();
        i5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override // ii.h1
    public /* synthetic */ boolean p(i1 i1Var) {
        return false;
    }

    @Override // fb.n
    public Object p2() {
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

    @Override // g6.n
    public void q(String str, long j3, long j10, long j11) {
        e6.p pVar = (e6.p) this.b;
        try {
            pVar.a(new o(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e7) {
            g6.b bVar = h.k;
            Log.e(bVar.a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e7);
        }
        Iterator it = pVar.q.i.iterator();
        while (it.hasNext()) {
            ((g) it.next()).h(str, j3, 2103, j10, j11);
        }
    }

    @Override // gg.b2
    public /* synthetic */ a0.i s() {
        switch (this.a) {
        }
        return null;
    }

    @Override // ii.h1
    public void t(i1 i1Var, int i10, int i11) {
        d3 d3Var;
        q9 textSelectionHelper;
        q5 q5Var = (q5) this.b;
        if (q5Var.G || i10 == i11 || (d3Var = q5Var.E) == null || (textSelectionHelper = d3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.y() && textSelectionHelper.W == q5Var) {
            return;
        }
        q5Var.post(new y4(this, i1Var, i11, textSelectionHelper, i10, 4));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        da.b bVar = (da.b) this.b;
        c5.i iVar = (c5.i) bVar.f;
        da.d dVar = (da.d) bVar.b;
        String str = iVar.a;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = c5.i.b(dVar);
            aa.a aVar = new aa.a(str, b10);
            aVar.q("User-Agent", "Crashlytics Android SDK/18.6.0");
            aVar.q("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            c5.i.a(aVar, dVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = iVar.c(aVar.i());
        } catch (IOException e7) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e7);
            jSONObject = null;
        }
        if (jSONObject != null) {
            da.a P = ((a6.i) bVar.c).P(jSONObject);
            a4.m mVar = (a4.m) bVar.e;
            long j3 = P.c;
            mVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j3);
                fileWriter = new FileWriter((File) mVar.b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        w9.h.c(fileWriter, "Failed to close settings writer.");
                        da.b.f("Loaded settings: ", jSONObject);
                        String str4 = dVar.f;
                        SharedPreferences.Editor edit = ((Context) bVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) bVar.h).set(P);
                        ((TaskCompletionSource) ((AtomicReference) bVar.i).get()).trySetResult(P);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    w9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                w9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            w9.h.c(fileWriter, "Failed to close settings writer.");
            da.b.f("Loaded settings: ", jSONObject);
            String str42 = dVar.f;
            SharedPreferences.Editor edit2 = ((Context) bVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) bVar.h).set(P);
            ((TaskCompletionSource) ((AtomicReference) bVar.i).get()).trySetResult(P);
        }
        return Tasks.forResult(null);
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void u(Bundle bundle) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            Bundle bundle2 = xVar.k;
            if (bundle2 == null) {
                xVar.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.l = k6.a.e;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // l.w
    public boolean v(k kVar) {
        Window.Callback callback = ((g.s) this.b).f.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    @Override // ii.h1
    public void w(CharSequence charSequence) {
        d3 d3Var = ((q5) this.b).E;
        if (d3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        d3Var.a.u4(charSequence.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r3 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r3 == 3) goto L23;
     */
    @Override // androidx.lifecycle.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void w0(Object obj) {
        Integer num = (Integer) obj;
        e0 e0Var = (e0) this.b;
        Handler handler = e0Var.A0;
        q4 q4Var = e0Var.B0;
        handler.removeCallbacks(q4Var);
        int intValue = num.intValue();
        if (e0Var.F0 != null && Build.VERSION.SDK_INT >= 23) {
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
        handler.postDelayed(q4Var, 2000L);
    }

    @Override // gg.b2
    public /* synthetic */ a0.i x() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.qq0
    public void x0() {
        e6.j0((e6) this.b);
    }

    @Override // z3.m
    public int y() {
        return 2;
    }

    @Override // gg.b2
    public boolean z(int i10) {
        switch (this.a) {
            case 23:
                return i10 == ((jo0) this.b).d0;
            default:
                return true;
        }
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 6:
                break;
            case 7:
                this.b = new LinkedHashMap();
                break;
            case 11:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                break;
            case 24:
                this.b = new c(fc.a.h, 20);
                break;
            case 26:
                this.b = new v();
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public c(String str) {
        this.a = 15;
        str.getClass();
        this.b = str;
    }

    @Override // org.telegram.ui.Components.qq0
    public /* synthetic */ void V() {
    }

    @Override // ii.h1
    public /* synthetic */ void r() {
    }

    @Override // z3.m
    public /* synthetic */ void reset() {
    }

    private final /* synthetic */ void L(ArrayList arrayList) {
    }

    @Override // ii.h1
    public /* synthetic */ void l(i1 i1Var) {
    }
}
