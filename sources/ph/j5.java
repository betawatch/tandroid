package ph;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.Editable;
import android.util.SparseArray;
import android.view.View;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class j5 implements ia, g5.h0, OnSuccessListener, ra.m, r4.h, o4.m0, tf.j1, com.google.android.gms.common.api.internal.s, androidx.lifecycle.s0, vh.g0, vh.c1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ j5(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // g5.h0
    public void A(g5.j0 j0Var, long j10, long j11) {
        g5.p0 p0Var = (g5.p0) j0Var;
        r4.g gVar = (r4.g) this.b;
        long j12 = p0Var.a;
        Uri uri = p0Var.d.c;
        o4.j jVar = new o4.j();
        gVar.n.getClass();
        gVar.r.n(jVar, p0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        s4.c cVar = (s4.c) p0Var.f;
        s4.c cVar2 = gVar.I;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j13 = cVar.b(0).b;
        int i10 = 0;
        while (i10 < size && gVar.I.b(i10).b < j13) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.m.size()) {
                h5.a.K("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = gVar.O;
                if (j14 == -9223372036854775807L || cVar.h * 1000 > j14) {
                    gVar.N = 0;
                } else {
                    h5.a.K("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + gVar.O);
                }
            }
            int i11 = gVar.N;
            gVar.N = i11 + 1;
            if (i11 < gVar.n.n3(p0Var.c)) {
                gVar.E.postDelayed(gVar.w, Math.min((gVar.N - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000));
                return;
            } else {
                gVar.D = new b7.y0();
                return;
            }
        }
        gVar.I = cVar;
        gVar.J = cVar.d & gVar.J;
        gVar.K = j10 - j11;
        gVar.L = j10;
        synchronized (gVar.u) {
            try {
                if (p0Var.b.a == gVar.G) {
                    Uri uri2 = gVar.I.k;
                    if (uri2 == null) {
                        uri2 = p0Var.d.c;
                    }
                    gVar.G = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (size != 0) {
            gVar.P += i10;
            gVar.u(true);
            return;
        }
        s4.c cVar3 = gVar.I;
        if (!cVar3.d) {
            gVar.u(true);
            return;
        }
        b6.h hVar = cVar3.i;
        if (hVar == null) {
            gVar.t();
            return;
        }
        String str = hVar.b;
        if (h5.d0.a(str, "urn:mpeg:dash:utc:direct:2014") || h5.d0.a(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                gVar.M = h5.d0.J(hVar.c) - gVar.L;
                gVar.u(true);
                return;
            } catch (j3.r1 e) {
                h5.a.p("DashMediaSource", "Failed to resolve time offset.", e);
                gVar.u(true);
                return;
            }
        }
        if (h5.d0.a(str, "urn:mpeg:dash:utc:http-iso:2014") || h5.d0.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            g5.p0 p0Var2 = new g5.p0(gVar.A, Uri.parse(hVar.c), 5, new r4.f());
            gVar.B.f(p0Var2, new r4.d(gVar), 1);
            gVar.r.t(new o4.j(p0Var2.b), p0Var2.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (h5.d0.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || h5.d0.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            g5.p0 p0Var3 = new g5.p0(gVar.A, Uri.parse(hVar.c), 5, new z9.d(21));
            gVar.B.f(p0Var3, new r4.d(gVar), 1);
            gVar.r.t(new o4.j(p0Var3.b), p0Var3.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (h5.d0.a(str, "urn:mpeg:dash:utc:ntp:2014") || h5.d0.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
            gVar.t();
        } else {
            h5.a.p("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
            gVar.u(true);
        }
    }

    @Override // ph.ia
    public void B(float f10) {
        l5 l5Var = (l5) this.b;
        u6 u6Var = l5Var.d;
        if (u6Var == null) {
            return;
        }
        u6Var.G = f10;
        u6Var.j = true;
        l5Var.c();
    }

    @Override // ph.ia
    public void C(long j10, boolean z4) {
        l5 l5Var = (l5) this.b;
        if (!z4) {
            l5Var.m(j10);
            return;
        }
        i71 i71Var = l5Var.e;
        if (i71Var != null) {
            i71Var.L(j10, true);
            return;
        }
        if (l5Var.j()) {
            l5Var.B.m(j10, true);
            return;
        }
        i71 i71Var2 = l5Var.y;
        if (i71Var2 != null) {
            i71Var2.L(j10, false);
        }
    }

    @Override // ph.ia
    public void D0(float f10) {
        l5 l5Var = (l5) this.b;
        u6 u6Var = l5Var.d;
        if (u6Var == null) {
            return;
        }
        u6Var.t0 = f10;
        u6Var.j = true;
        l5Var.y(true);
    }

    @Override // vh.g0
    public vh.a E() {
        return ((vh.w0) this.b).a;
    }

    @Override // vh.c1
    public /* synthetic */ boolean F(vh.d1 d1Var) {
        return false;
    }

    @Override // vh.c1
    public void G(vh.d1 d1Var) {
        vh.a aVar;
        vh.a5 a5Var = (vh.a5) this.b;
        vh.y4 y4Var = a5Var.s;
        if (y4Var == null || (aVar = a5Var.a) == null) {
            return;
        }
        vh.r3 r3Var = ((vh.x2) y4Var).a;
        ArrayList arrayList = r3Var.i3;
        long j10 = aVar.t;
        if (j10 == 0) {
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((vh.a) arrayList.get(i11)).k.contains(Long.valueOf(j10))) {
                i10 = i11;
            }
        }
        if (i10 < 0) {
            return;
        }
        vh.c2 c2Var = r3Var.G3;
        if (c2Var != null) {
            c2Var.d();
        }
        vh.a aVar2 = new vh.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            android.support.v4.media.a.u(1, arrayList3);
        }
        arrayList.add(i10 + 1, aVar2);
        r3Var.s4();
        r3Var.V2.N(false);
        vh.c2 c2Var2 = r3Var.G3;
        if (c2Var2 != null) {
            c2Var2.h();
        }
        r3Var.post(new vh.j2(r3Var, aVar2, 26));
    }

    @Override // ph.ia
    public void G0(int i10, long j10) {
        ArrayList arrayList;
        l5 l5Var = (l5) this.b;
        u6 u6Var = l5Var.d;
        if (u6Var == null || (arrayList = u6Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((u6) l5Var.d.T.get(i10)).X = j10;
    }

    @Override // ph.ia
    public void H() {
        l5 l5Var = (l5) this.b;
        l5Var.s(null, null, true);
        da daVar = ((s9) l5Var).z0;
        s9 s9Var = daVar.U0;
        if (s9Var != null) {
            s9Var.s(null, null, true);
        }
        h9 h9Var = daVar.s1;
        if (h9Var != null) {
            h9Var.q0();
        }
        t9 t9Var = daVar.Z0;
        if (t9Var != null) {
            t9Var.setHasRoundVideo(false);
        }
        u6 u6Var = daVar.H1;
        if (u6Var != null) {
            File file = u6Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                daVar.H1.o0 = null;
            }
            if (daVar.H1.p0 != null) {
                try {
                    new File(daVar.H1.p0).delete();
                } catch (Exception unused2) {
                }
                daVar.H1.p0 = null;
            }
        }
    }

    @Override // tf.j1
    public /* synthetic */ a0.h I() {
        return null;
    }

    @Override // ph.ia
    public void I0(long j10) {
        l5 l5Var = (l5) this.b;
        u6 u6Var = l5Var.d;
        if (u6Var == null) {
            return;
        }
        u6Var.D = j10;
        u6Var.j = true;
        l5Var.w(true);
    }

    @Override // ph.ia
    public void J(float f10) {
        l5 l5Var = (l5) this.b;
        u6 u6Var = l5Var.d;
        if (u6Var == null) {
            return;
        }
        u6Var.s0 = f10;
        u6Var.j = true;
        l5Var.y(true);
    }

    @Override // ph.ia
    public void K(boolean z4) {
        l5 l5Var = (l5) this.b;
        if (l5Var.j()) {
            l5Var.B.getClass();
        }
        l5Var.x(-4, z4);
    }

    @Override // vh.g0
    public boolean L() {
        vh.w0 w0Var = (vh.w0) this.b;
        vh.m3 m3Var = w0Var.P;
        if (m3Var == null) {
            return false;
        }
        vh.a aVar = w0Var.a;
        return m3Var.a.S4();
    }

    @Override // vh.g0
    public void M(int i10, int i11) {
        vh.w0 w0Var = (vh.w0) this.b;
        vh.m3 m3Var = w0Var.P;
        if (m3Var != null) {
            vh.a aVar = w0Var.a;
            vh.c2 c2Var = m3Var.a.G3;
            if (c2Var != null) {
                c2Var.f(i10, i11);
            }
        }
    }

    @Override // vh.c1
    public void N(Editable editable) {
        ((vh.a5) this.b).h();
    }

    @Override // vh.c1
    public void O(vh.d1 d1Var, int i10, int i11) {
        vh.y4 y4Var;
        org.telegram.ui.Cells.m9 textSelectionHelper;
        vh.a5 a5Var = (vh.a5) this.b;
        if (a5Var.w || i10 == i11 || (y4Var = a5Var.s) == null || (textSelectionHelper = ((vh.x2) y4Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        d1Var.post(new org.telegram.messenger.p6(this, d1Var, i11, textSelectionHelper, i10, 5));
    }

    @Override // vh.g0
    public void P() {
        vh.w0 w0Var = (vh.w0) this.b;
        vh.m3 m3Var = w0Var.P;
        if (m3Var != null) {
            vh.a aVar = w0Var.a;
            vh.r3 r3Var = m3Var.a;
            vh.c2 c2Var = r3Var.G3;
            if (c2Var != null) {
                c2Var.g();
            }
            r3Var.e3.onContentChanged();
        }
    }

    @Override // tf.j1
    public /* synthetic */ boolean Q(int i10) {
        return true;
    }

    @Override // vh.c1
    public /* synthetic */ boolean R(boolean z4) {
        return false;
    }

    @Override // r4.h
    public long S() {
        return 0L;
    }

    @Override // tf.j1
    public void T(ArrayList arrayList) {
        tf.u0 u0Var = (tf.u0) this.b;
        String str = u0Var.W;
        if (str != null) {
            u0Var.U(str, u0Var.Z, u0Var.a0, u0Var.Y, u0Var.X);
        }
    }

    @Override // r4.h
    public long U(long j10) {
        return 1L;
    }

    @Override // ph.ia
    public void V(float f10, int i10) {
        ArrayList arrayList;
        l5 l5Var = (l5) this.b;
        u6 u6Var = l5Var.d;
        if (u6Var == null || (arrayList = u6Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((u6) l5Var.d.T.get(i10)).P = f10;
    }

    @Override // r4.h
    public long W(long j10, long j11) {
        return 1L;
    }

    public q5.o X() {
        q5.o oVar = (q5.o) this.b;
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

    @Override // ph.ia
    public void Y(float f10) {
        l5 l5Var = (l5) this.b;
        u6 u6Var = l5Var.d;
        if (u6Var == null) {
            return;
        }
        u6Var.P = f10;
        l5Var.c();
    }

    @Override // o4.m0
    public void Z(o4.n0 n0Var) {
        t4.l lVar = (t4.l) this.b;
        lVar.D.Z(lVar);
    }

    @Override // r4.h
    public long a(long j10) {
        return 0L;
    }

    @Override // vh.g0
    public void a0() {
        vh.w0 w0Var = (vh.w0) this.b;
        vh.m3 m3Var = w0Var.P;
        if (m3Var != null) {
            vh.a aVar = w0Var.a;
            vh.r3.O1(m3Var.a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 11:
                u5.r rVar = new u5.r(2, (TaskCompletionSource) obj2);
                u5.i iVar = (u5.i) ((u5.t) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel M0 = iVar.M0();
                com.google.android.gms.internal.cast.t.d(M0, rVar);
                M0.writeStringArray(strArr);
                iVar.R0(M0, 7);
                break;
            default:
                o5.l lVar = new o5.l((TaskCompletionSource) obj2);
                w6.i iVar2 = (w6.i) ((w6.c) obj).u();
                l5.e eVar = (l5.e) this.b;
                Parcel I0 = iVar2.I0();
                int i10 = w6.f.a;
                I0.writeStrongBinder(lVar);
                w6.f.c(I0, eVar);
                iVar2.J0(I0, 1);
                break;
        }
    }

    @Override // ph.ia
    public void b(int i10) {
        y yVar = ((l5) this.b).B;
        if (yVar != null) {
            ArrayList arrayList = yVar.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                x xVar = (x) obj;
                if (xVar.a == i10) {
                    xVar.b.d(1.0f, true);
                    yVar.invalidate();
                    return;
                }
            }
        }
    }

    @Override // ph.ia
    public void b0(float f10, boolean z4) {
        l5 l5Var = (l5) this.b;
        u6 u6Var = l5Var.d;
        if (u6Var == null) {
            return;
        }
        u6Var.Z = f10;
        u6Var.j = true;
        i71 i71Var = l5Var.e;
        if (i71Var == null || i71Var.p() == -9223372036854775807L) {
            return;
        }
        l5Var.m((long) (f10 * l5Var.e.p()));
    }

    @Override // vh.g0
    public void c(vh.d1 d1Var) {
        switch (this.a) {
            case 14:
                vh.m3 m3Var = ((vh.w0) this.b).P;
                if (m3Var != null) {
                    vh.r3 r3Var = m3Var.a;
                    vh.r3.M1(r3Var, d1Var);
                    r3Var.e3.e(d1Var, true);
                    break;
                }
                break;
            default:
                vh.y4 y4Var = ((vh.a5) this.b).s;
                if (y4Var != null) {
                    vh.r3 r3Var2 = ((vh.x2) y4Var).a;
                    vh.r3.M1(r3Var2, d1Var);
                    r3Var2.e3.e(d1Var, true);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05e3 A[Catch: a | c -> 0x0676, TryCatch #4 {a | c -> 0x0676, blocks: (B:292:0x05c9, B:293:0x05df, B:295:0x05e3, B:296:0x05e6, B:298:0x05ea, B:300:0x05f4, B:302:0x05fa, B:307:0x05ff), top: B:291:0x05c9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l7.w0 c0(n7.qa qaVar) {
        ArrayList arrayList;
        ub.c cVar;
        ub.c cVar2;
        ub.c cVar3;
        float f10;
        float f11;
        ub.a aVar;
        float f12;
        float f13;
        float f14;
        int i10;
        int i11;
        ob.j[] jVarArr;
        ob.a aVar2;
        pb.b bVar;
        int i12;
        pb.d dVar;
        int i13;
        l7.w0 w0Var;
        List list;
        String str;
        int i14;
        boolean z4;
        double d;
        double abs;
        int i15;
        char c3;
        int i16;
        j5 j5Var = (j5) this.b;
        pb.b V0 = qaVar.V0();
        o2.o oVar = new o2.o(V0, 26);
        ub.e eVar = new ub.e(V0);
        int i17 = V0.b;
        int i18 = V0.a;
        int i19 = (i17 * 3) / 388;
        if (i19 < 3) {
            i19 = 3;
        }
        int[] iArr = new int[5];
        int i20 = i19 - 1;
        int i21 = 0;
        boolean z10 = false;
        while (true) {
            int i22 = 1;
            arrayList = eVar.b;
            if (i20 >= i17 || z10) {
                break;
            }
            Arrays.fill(iArr, i21);
            int i23 = 0;
            while (i23 < i18) {
                if (V0.b(i23, i20)) {
                    if ((i21 & 1) == i22) {
                        i21++;
                    }
                    iArr[i21] = iArr[i21] + i22;
                    i15 = i17;
                } else {
                    if ((i21 & 1) != 0) {
                        i15 = i17;
                        iArr[i21] = iArr[i21] + 1;
                    } else if (i21 == 4) {
                        if (!ub.e.b(iArr)) {
                            i15 = i17;
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                        } else if (eVar.c(i20, i23, iArr)) {
                            if (eVar.c) {
                                z10 = eVar.d();
                                i15 = i17;
                            } else {
                                if (arrayList.size() > i22) {
                                    int size = arrayList.size();
                                    int i24 = 0;
                                    ub.c cVar4 = null;
                                    while (true) {
                                        if (i24 >= size) {
                                            i15 = i17;
                                            c3 = 2;
                                            i16 = 0;
                                            break;
                                        }
                                        Object obj = arrayList.get(i24);
                                        i24++;
                                        ub.c cVar5 = (ub.c) obj;
                                        i15 = i17;
                                        if (cVar5.d >= 2) {
                                            if (cVar4 != null) {
                                                eVar.c = true;
                                                c3 = 2;
                                                i16 = ((int) (Math.abs(cVar4.a - cVar5.a) - Math.abs(cVar4.b - cVar5.b))) / 2;
                                                break;
                                            }
                                            cVar4 = cVar5;
                                        }
                                        i17 = i15;
                                    }
                                } else {
                                    i15 = i17;
                                    i16 = 0;
                                    c3 = 2;
                                }
                                if (i16 > iArr[c3]) {
                                    i20 += (i16 - r5) - 2;
                                    i23 = i18 - 1;
                                }
                            }
                            Arrays.fill(iArr, 0);
                            i19 = 2;
                            i21 = 0;
                        } else {
                            i15 = i17;
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                        }
                        i21 = 3;
                    } else {
                        i15 = i17;
                        int i25 = i21 + 1;
                        iArr[i25] = iArr[i25] + 1;
                        i21 = i25;
                    }
                    i23++;
                    i17 = i15;
                    i22 = 1;
                }
                i23++;
                i17 = i15;
                i22 = 1;
            }
            int i26 = i17;
            if (ub.e.b(iArr) && eVar.c(i20, i18, iArr)) {
                int i27 = iArr[0];
                if (eVar.c) {
                    i19 = i27;
                    z10 = eVar.d();
                } else {
                    i19 = i27;
                }
            }
            i20 += i19;
            i17 = i26;
            i21 = 0;
        }
        if (arrayList.size() < 3) {
            throw ob.e.a();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((ub.c) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList, ub.e.e);
        ub.c[] cVarArr = new ub.c[3];
        int i28 = 0;
        double d10 = Double.MAX_VALUE;
        for (int i29 = 2; i28 < arrayList.size() - i29; i29 = 2) {
            ub.c cVar6 = (ub.c) arrayList.get(i28);
            float f15 = cVar6.c;
            i28++;
            int i30 = i28;
            while (i30 < arrayList.size() - 1) {
                ub.c cVar7 = (ub.c) arrayList.get(i30);
                double e = ub.e.e(cVar6, cVar7);
                i30++;
                for (int i31 = i30; i31 < arrayList.size(); i31++) {
                    ub.c cVar8 = (ub.c) arrayList.get(i31);
                    if (cVar8.c <= 1.4f * f15) {
                        double e6 = ub.e.e(cVar7, cVar8);
                        double e10 = ub.e.e(cVar6, cVar8);
                        if (e < e6) {
                            if (e6 <= e10) {
                                e10 = e6;
                                e6 = e10;
                            } else if (e >= e10) {
                                d = e10;
                                e10 = e;
                                abs = Math.abs(e6 - (d * 2.0d)) + Math.abs(e6 - (e10 * 2.0d));
                                if (abs >= d10) {
                                    cVarArr[0] = cVar6;
                                    cVarArr[1] = cVar7;
                                    cVarArr[2] = cVar8;
                                    d10 = abs;
                                }
                            }
                            d = e;
                            abs = Math.abs(e6 - (d * 2.0d)) + Math.abs(e6 - (e10 * 2.0d));
                            if (abs >= d10) {
                            }
                        } else {
                            if (e6 >= e10) {
                                d = e10;
                                e10 = e6;
                            } else if (e < e10) {
                                d = e6;
                                e6 = e10;
                                e10 = e;
                                abs = Math.abs(e6 - (d * 2.0d)) + Math.abs(e6 - (e10 * 2.0d));
                                if (abs >= d10) {
                                }
                            } else {
                                d = e6;
                            }
                            e6 = e;
                            abs = Math.abs(e6 - (d * 2.0d)) + Math.abs(e6 - (e10 * 2.0d));
                            if (abs >= d10) {
                            }
                        }
                    }
                }
            }
        }
        if (d10 == Double.MAX_VALUE) {
            throw ob.e.a();
        }
        float a2 = ob.j.a(cVarArr[0], cVarArr[1]);
        float a10 = ob.j.a(cVarArr[1], cVarArr[2]);
        float a11 = ob.j.a(cVarArr[0], cVarArr[2]);
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
        float f16 = cVar.a;
        float f17 = cVar.b;
        if (yh.c(cVar2.a, f16, cVar3.b - f17, (cVar2.b - f17) * (cVar3.a - f16)) < 0.0f) {
            ub.c cVar9 = cVar3;
            cVar3 = cVar2;
            cVar2 = cVar9;
        }
        cVarArr[0] = cVar2;
        cVarArr[1] = cVar;
        cVarArr[2] = cVar3;
        float i32 = oVar.i(cVar, cVar3);
        float f18 = cVar.a;
        float f19 = cVar3.b;
        float f20 = cVar3.a;
        float i33 = oVar.i(cVar, cVar2);
        float f21 = cVar2.b;
        float f22 = cVar2.a;
        float f23 = (i33 + i32) / 2.0f;
        if (f23 < 1.0f) {
            throw ob.e.a();
        }
        float a12 = ob.j.a(cVar, cVar3) / f23;
        int i34 = (int) (a12 + (a12 < 0.0f ? -0.5f : 0.5f));
        float a13 = ob.j.a(cVar, cVar2) / f23;
        int i35 = (((int) (a13 + (a13 >= 0.0f ? 0.5f : -0.5f))) + i34) / 2;
        int i36 = i35 + 7;
        int i37 = i36 & 3;
        if (i37 == 0) {
            i36 = i35 + 8;
        } else if (i37 == 2) {
            i36 = i35 + 6;
        } else if (i37 == 3) {
            i36 = i35 + 5;
        }
        int i38 = i36;
        int[] iArr2 = tb.e.e;
        if (i38 % 4 != 1) {
            throw ob.c.a();
        }
        try {
            tb.e c10 = tb.e.c((i38 - 17) / 4);
            int i39 = (c10.a * 4) + 10;
            if (c10.b.length > 0) {
                float f24 = (f20 - f18) + f22;
                f11 = f20;
                float f25 = (f19 - f17) + f21;
                float f26 = 1.0f - (3.0f / i39);
                int w10 = (int) e2.c.w(f24, f18, f26, f18);
                int w11 = (int) e2.c.w(f25, f17, f26, f17);
                f10 = f18;
                for (int i40 = 4; i40 <= 16; i40 <<= 1) {
                    try {
                        aVar = oVar.o(f23, i40, w10, w11);
                        break;
                    } catch (ob.e unused) {
                    }
                }
            } else {
                f10 = f18;
                f11 = f20;
            }
            aVar = null;
            float f27 = i38 - 3.5f;
            if (aVar != null) {
                f12 = aVar.a;
                f13 = aVar.b;
                f14 = f27 - 3.0f;
            } else {
                f12 = (f11 - f10) + f22;
                f13 = (f19 - f17) + f21;
                f14 = f27;
            }
            float f28 = f13;
            float f29 = cVar.a;
            float f30 = cVar.b;
            float f31 = cVar3.a;
            float f32 = cVar3.b;
            float f33 = cVar2.a;
            float f34 = cVar2.b;
            pb.g a14 = pb.g.a(3.5f, 3.5f, f27, 3.5f, f14, f14, 3.5f, f27);
            ub.a aVar3 = aVar;
            float f35 = a14.e;
            float f36 = a14.i;
            float f37 = f35 * f36;
            float f38 = a14.f;
            float f39 = a14.h;
            float f40 = f37 - (f38 * f39);
            float f41 = a14.g;
            float f42 = f38 * f41;
            float f43 = a14.d;
            float f44 = f42 - (f43 * f36);
            float f45 = (f43 * f39) - (f35 * f41);
            float f46 = a14.c;
            float f47 = f46 * f39;
            float f48 = a14.b;
            float f49 = f47 - (f48 * f36);
            float f50 = a14.a;
            float f51 = (f36 * f50) - (f46 * f41);
            float f52 = (f41 * f48) - (f39 * f50);
            float f53 = (f48 * f38) - (f46 * f35);
            float f54 = (f46 * f43) - (f38 * f50);
            float f55 = (f50 * f35) - (f48 * f43);
            pb.g a15 = pb.g.a(f29, f30, f31, f32, f12, f28, f33, f34);
            float f56 = a15.a;
            float f57 = a15.d;
            float f58 = a15.g;
            float f59 = (f58 * f53) + (f57 * f49) + (f56 * f40);
            float f60 = (f58 * f54) + (f57 * f51) + (f56 * f44);
            float f61 = (f58 * f55) + (f57 * f52) + (f56 * f45);
            float f62 = a15.b;
            float f63 = a15.e;
            float f64 = a15.h;
            float f65 = (f64 * f53) + (f63 * f49) + (f62 * f40);
            float f66 = (f64 * f54) + (f63 * f51) + (f62 * f44);
            float f67 = (f64 * f55) + (f63 * f52) + (f62 * f45);
            float f68 = a15.c;
            float f69 = a15.f;
            float f70 = a15.i;
            float f71 = (f53 * f70) + (f49 * f69) + (f40 * f68);
            float f72 = (f54 * f70) + (f51 * f69) + (f44 * f68);
            float f73 = (f70 * f55) + (f69 * f52) + (f68 * f45);
            if (i38 <= 0 || i38 <= 0) {
                throw ob.e.a();
            }
            pb.b bVar2 = new pb.b(i38, i38);
            int i41 = i38 * 2;
            ub.c cVar10 = cVar;
            float[] fArr = new float[i41];
            int i42 = 0;
            while (i42 < i38) {
                int i43 = i38;
                float f74 = i42 + 0.5f;
                int i44 = 0;
                while (i44 < i41) {
                    int i45 = i44;
                    fArr[i45] = (i45 / 2) + 0.5f;
                    fArr[i45 + 1] = f74;
                    i44 = i45 + 2;
                }
                int i46 = i41 - 1;
                int i47 = i42;
                int i48 = 0;
                while (i48 < i46) {
                    float f75 = fArr[i48];
                    int i49 = i48 + 1;
                    int i50 = i48;
                    float f76 = fArr[i49];
                    ub.c cVar11 = cVar2;
                    float A = e2.c.A(f72, f76, f71 * f75, f73);
                    fArr[i50] = (((f60 * f76) + (f59 * f75)) + f61) / A;
                    fArr[i49] = (((f76 * f66) + (f75 * f65)) + f67) / A;
                    i48 = i50 + 2;
                    cVar2 = cVar11;
                }
                ub.c cVar12 = cVar2;
                int i51 = V0.b;
                float f77 = f72;
                int i52 = 0;
                boolean z11 = true;
                while (i52 < i46 && z11) {
                    int i53 = (int) fArr[i52];
                    int i54 = i52 + 1;
                    int i55 = i46;
                    int i56 = (int) fArr[i54];
                    int i57 = i52;
                    if (i53 < -1 || i53 > i18 || i56 < -1 || i56 > i51) {
                        throw ob.e.a();
                    }
                    if (i53 == -1) {
                        fArr[i57] = 0.0f;
                    } else if (i53 == i18) {
                        fArr[i57] = i18 - 1;
                    } else {
                        z4 = false;
                        if (i56 != -1) {
                            fArr[i54] = 0.0f;
                        } else if (i56 == i51) {
                            fArr[i54] = i51 - 1;
                        } else {
                            z11 = z4;
                            i52 = i57 + 2;
                            i46 = i55;
                        }
                        z11 = true;
                        i52 = i57 + 2;
                        i46 = i55;
                    }
                    z4 = true;
                    if (i56 != -1) {
                    }
                    z11 = true;
                    i52 = i57 + 2;
                    i46 = i55;
                }
                int i58 = i41 - 2;
                boolean z12 = true;
                while (i58 >= 0 && z12) {
                    int i59 = (int) fArr[i58];
                    int i60 = i58 + 1;
                    int i61 = i58;
                    int i62 = (int) fArr[i60];
                    if (i59 < -1 || i59 > i18 || i62 < -1 || i62 > i51) {
                        throw ob.e.a();
                    }
                    if (i59 == -1) {
                        fArr[i61] = 0.0f;
                    } else if (i59 == i18) {
                        fArr[i61] = i18 - 1;
                    } else {
                        z12 = false;
                        if (i62 != -1) {
                            fArr[i60] = 0.0f;
                        } else if (i62 == i51) {
                            fArr[i60] = i51 - 1;
                        } else {
                            i58 = i61 - 2;
                        }
                        z12 = true;
                        i58 = i61 - 2;
                    }
                    z12 = true;
                    if (i62 != -1) {
                    }
                    z12 = true;
                    i58 = i61 - 2;
                }
                for (int i63 = 0; i63 < i41; i63 += 2) {
                    try {
                        if (V0.b((int) fArr[i63], (int) fArr[i63 + 1])) {
                            int i64 = i63 / 2;
                            int i65 = (i64 / 32) + (bVar2.c * i47);
                            int[] iArr3 = bVar2.d;
                            iArr3[i65] = iArr3[i65] | (1 << (i64 & 31));
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw ob.e.a();
                    }
                }
                i42 = i47 + 1;
                i38 = i43;
                f72 = f77;
                cVar2 = cVar12;
            }
            ub.c cVar13 = cVar2;
            if (aVar3 == null) {
                i11 = 3;
                i10 = 1;
                jVarArr = new ob.j[]{cVar13, cVar10, cVar3};
            } else {
                i10 = 1;
                i11 = 3;
                jVarArr = new ob.j[]{cVar13, cVar10, cVar3, aVar3};
            }
            ob.j[] jVarArr2 = jVarArr;
            j5Var.getClass();
            cb.m mVar = new cb.m();
            int i66 = bVar2.b;
            if (i66 < 21 || (i66 & i11) != i10) {
                throw ob.c.a();
            }
            mVar.b = bVar2;
            try {
                dVar = j5Var.d0(mVar);
            } catch (ob.a e11) {
                aVar2 = e11;
                e = null;
                try {
                    mVar.s();
                    mVar.c = null;
                    mVar.d = null;
                    mVar.a = true;
                    mVar.r();
                    mVar.q();
                    bVar = (pb.b) mVar.b;
                    i12 = 0;
                    while (i12 < bVar.a) {
                        int i67 = i12 + 1;
                        for (int i68 = i67; i68 < bVar.b; i68++) {
                            if (bVar.b(i12, i68) != bVar.b(i68, i12)) {
                                bVar.a(i68, i12);
                                bVar.a(i12, i68);
                            }
                        }
                        i12 = i67;
                    }
                    pb.d d02 = j5Var.d0(mVar);
                    d02.e = new z9.d(23);
                    dVar = d02;
                    i13 = dVar.f;
                    if (e2.c.s(dVar.e)) {
                        ob.j jVar = jVarArr2[0];
                        jVarArr2[0] = jVarArr2[2];
                        jVarArr2[2] = jVar;
                    }
                    w0Var = new l7.w0(dVar.a, jVarArr2);
                    list = dVar.b;
                    if (list != null) {
                    }
                    str = dVar.c;
                    if (str != null) {
                    }
                    if (i13 >= 0) {
                        w0Var.z(ob.i.d, Integer.valueOf(i14));
                        w0Var.z(ob.i.e, Integer.valueOf(i13));
                    }
                    w0Var.z(ob.i.c, dVar.d);
                    w0Var.z(ob.i.f, "]Q" + dVar.h);
                    return w0Var;
                } catch (ob.a | ob.c unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw aVar2;
                }
            } catch (ob.c e12) {
                e = e12;
                aVar2 = null;
                mVar.s();
                mVar.c = null;
                mVar.d = null;
                mVar.a = true;
                mVar.r();
                mVar.q();
                bVar = (pb.b) mVar.b;
                i12 = 0;
                while (i12 < bVar.a) {
                }
                pb.d d022 = j5Var.d0(mVar);
                d022.e = new z9.d(23);
                dVar = d022;
                i13 = dVar.f;
                if (e2.c.s(dVar.e)) {
                }
                w0Var = new l7.w0(dVar.a, jVarArr2);
                list = dVar.b;
                if (list != null) {
                }
                str = dVar.c;
                if (str != null) {
                }
                if (i13 >= 0) {
                }
                w0Var.z(ob.i.c, dVar.d);
                w0Var.z(ob.i.f, "]Q" + dVar.h);
                return w0Var;
            }
            i13 = dVar.f;
            if (e2.c.s(dVar.e) && jVarArr2.length >= 3) {
                ob.j jVar2 = jVarArr2[0];
                jVarArr2[0] = jVarArr2[2];
                jVarArr2[2] = jVar2;
            }
            w0Var = new l7.w0(dVar.a, jVarArr2);
            list = dVar.b;
            if (list != null) {
                w0Var.z(ob.i.a, list);
            }
            str = dVar.c;
            if (str != null) {
                w0Var.z(ob.i.b, str);
            }
            if (i13 >= 0 && (i14 = dVar.g) >= 0) {
                w0Var.z(ob.i.d, Integer.valueOf(i14));
                w0Var.z(ob.i.e, Integer.valueOf(i13));
            }
            w0Var.z(ob.i.c, dVar.d);
            w0Var.z(ob.i.f, "]Q" + dVar.h);
            return w0Var;
        } catch (IllegalArgumentException unused4) {
            throw ob.c.a();
        }
    }

    @Override // vh.c1
    public /* synthetic */ boolean d() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x0348, code lost:
    
        throw ob.c.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a4 A[LOOP:21: B:147:0x0226->B:177:0x03a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0373 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pb.d d0(cb.m mVar) {
        int f10;
        tb.d dVar;
        tb.b bVar;
        int i10;
        int i11;
        pb.c cVar;
        int f11;
        tb.e r10 = mVar.r();
        tb.b bVar2 = mVar.q().a;
        tb.c q10 = mVar.q();
        tb.e r11 = mVar.r();
        int i12 = m1.j.c(8)[q10.b];
        pb.b bVar3 = (pb.b) mVar.b;
        int i13 = bVar3.b;
        for (int i14 = 0; i14 < i13; i14++) {
            for (int i15 = 0; i15 < i13; i15++) {
                if (yh.b(i12, i14, i15)) {
                    bVar3.a(i15, i14);
                }
            }
        }
        int i16 = r11.a * 4;
        int i17 = i16 + 17;
        int i18 = r11.d;
        pb.b bVar4 = new pb.b(i17, i17);
        bVar4.c(0, 0, 9, 9);
        int i19 = i16 + 9;
        bVar4.c(i19, 0, 8, 9);
        bVar4.c(0, i19, 9, 8);
        int[] iArr = r11.b;
        int length = iArr.length;
        for (int i20 = 0; i20 < length; i20++) {
            int i21 = iArr[i20] - 2;
            for (int i22 = 0; i22 < length; i22++) {
                if ((i20 != 0 || (i22 != 0 && i22 != length - 1)) && (i20 != length - 1 || i22 != 0)) {
                    bVar4.c(iArr[i22] - 2, i21, 5, 5);
                }
            }
        }
        int i23 = 6;
        bVar4.c(6, 9, 1, i16);
        bVar4.c(9, 6, i16, 1);
        if (r11.a > 6) {
            int i24 = i16 + 6;
            bVar4.c(i24, 0, 3, 6);
            bVar4.c(0, i24, 6, 3);
        }
        byte[] bArr = new byte[i18];
        int i25 = i13 - 1;
        int i26 = i25;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        boolean z4 = true;
        while (i26 > 0) {
            if (i26 == i23) {
                i26--;
            }
            for (int i30 = 0; i30 < i13; i30++) {
                int i31 = z4 ? i25 - i30 : i30;
                for (int i32 = 0; i32 < 2; i32++) {
                    int i33 = i26 - i32;
                    if (!bVar4.b(i33, i31)) {
                        i28++;
                        i29 <<= 1;
                        if (bVar3.b(i33, i31)) {
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
            z4 = !z4;
            i26 -= 2;
            i23 = 6;
        }
        if (i27 != i18) {
            throw ob.c.a();
        }
        if (i18 != r10.d) {
            throw new IllegalArgumentException();
        }
        p2.w wVar = r10.c[bVar2.ordinal()];
        c5.e[] eVarArr = (c5.e[]) wVar.c;
        int i34 = wVar.b;
        int i35 = 0;
        for (c5.e eVar : eVarArr) {
            i35 += eVar.a;
        }
        j9.l[] lVarArr = new j9.l[i35];
        int i36 = 0;
        for (c5.e eVar2 : eVarArr) {
            int i37 = 0;
            while (i37 < eVar2.a) {
                int i38 = eVar2.b;
                lVarArr[i36] = new j9.l(i38, new byte[i34 + i38]);
                i37++;
                i36++;
            }
        }
        int length2 = lVarArr[0].b.length;
        int i39 = i35 - 1;
        while (i39 >= 0 && lVarArr[i39].b.length != length2) {
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
                lVarArr[i45].b[i42] = bArr[i44];
                i45++;
                i44++;
            }
            i42++;
            i43 = i44;
        }
        int i46 = i40;
        while (i46 < i36) {
            lVarArr[i46].b[i41] = bArr[i43];
            i46++;
            i43++;
        }
        boolean z10 = false;
        int length3 = lVarArr[0].b.length;
        while (i41 < length3) {
            int i47 = i43;
            int i48 = 0;
            while (i48 < i36) {
                lVarArr[i48].b[i48 < i40 ? i41 : i41 + 1] = bArr[i47];
                i48++;
                i47++;
            }
            i41++;
            i43 = i47;
        }
        int i49 = 0;
        for (int i50 = 0; i50 < i35; i50++) {
            i49 += lVarArr[i50].a;
        }
        byte[] bArr2 = new byte[i49];
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        while (i52 < i35) {
            j9.l lVar = lVarArr[i52];
            byte[] bArr3 = lVar.b;
            int i54 = lVar.a;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i55 = 0; i55 < length4; i55++) {
                iArr2[i55] = bArr3[i55] & 255;
            }
            try {
                int n10 = ((o2.o) this.b).n(bArr3.length - i54, iArr2);
                for (int i56 = 0; i56 < i54; i56++) {
                    bArr3[i56] = (byte) iArr2[i56];
                }
                i51 += n10;
                int i57 = i53;
                int i58 = 0;
                while (i58 < i54) {
                    bArr2[i57] = bArr3[i58];
                    i58++;
                    i57++;
                }
                i52++;
                i53 = i57;
            } catch (rb.c unused) {
                ob.a aVar = ob.a.c;
                if (ob.h.a) {
                    throw new ob.a();
                }
                throw ob.a.c;
            }
        }
        char[] cArr = tb.a.a;
        p2.g gVar = new p2.g();
        gVar.c = bArr2;
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int i59 = -1;
        int i60 = -1;
        boolean z11 = false;
        boolean z12 = false;
        pb.c cVar2 = null;
        while (true) {
            try {
                int d = gVar.d();
                tb.d dVar2 = tb.d.c;
                if (d < 4 || (f10 = gVar.f(4)) == 0) {
                    dVar = dVar2;
                } else if (f10 == 1) {
                    dVar = tb.d.d;
                } else if (f10 == 2) {
                    dVar = tb.d.e;
                } else if (f10 == 3) {
                    dVar = tb.d.f;
                } else if (f10 == 4) {
                    dVar = tb.d.h;
                } else if (f10 == 5) {
                    dVar = tb.d.s;
                } else if (f10 == 7) {
                    dVar = tb.d.n;
                } else if (f10 == 8) {
                    dVar = tb.d.r;
                } else if (f10 == 9) {
                    dVar = tb.d.v;
                } else {
                    if (f10 != 13) {
                        throw new IllegalArgumentException();
                    }
                    dVar = tb.d.w;
                }
                int ordinal = dVar.ordinal();
                if (ordinal != 0) {
                    bVar = bVar2;
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            i10 = i51;
                            i11 = 1;
                            int f12 = gVar.f(8);
                            if ((f12 & 128) == 0) {
                                f11 = f12 & 127;
                            } else if ((f12 & 192) == 128) {
                                f11 = ((f12 & 63) << 8) | gVar.f(8);
                            } else {
                                if ((f12 & 224) != 192) {
                                    throw ob.c.a();
                                }
                                f11 = ((f12 & 31) << 16) | gVar.f(16);
                            }
                            HashMap hashMap = pb.c.c;
                            if (f11 < 0 || f11 >= 900) {
                                break;
                            }
                            pb.c cVar3 = (pb.c) pb.c.c.get(Integer.valueOf(f11));
                            if (cVar3 == null) {
                                throw ob.c.a();
                            }
                            cVar = cVar3;
                        } else if (ordinal == 7) {
                            i10 = i51;
                            i11 = 1;
                            cVar = cVar2;
                            z11 = true;
                            z10 = true;
                        } else if (ordinal == 8) {
                            i10 = i51;
                            i11 = 1;
                            cVar = cVar2;
                            z11 = true;
                            z12 = true;
                        } else if (ordinal != 9) {
                            int f13 = gVar.f(dVar.a(r10));
                            int ordinal2 = dVar.ordinal();
                            i10 = i51;
                            if (ordinal2 == 1) {
                                tb.a.e(gVar, sb, f13);
                            } else if (ordinal2 == 2) {
                                tb.a.a(gVar, sb, f13, z11);
                            } else if (ordinal2 == 4) {
                                tb.a.b(gVar, sb, f13, cVar2, arrayList);
                            } else {
                                if (ordinal2 != 6) {
                                    throw ob.c.a();
                                }
                                tb.a.d(gVar, sb, f13);
                            }
                        } else {
                            i10 = i51;
                            int f14 = gVar.f(4);
                            int f15 = gVar.f(dVar.a(r10));
                            i11 = 1;
                            if (f14 == 1) {
                                tb.a.c(gVar, sb, f15);
                            }
                        }
                        int i61 = i59;
                        if (dVar == dVar2) {
                            if (cVar != null) {
                                i11 = z10 ? 4 : z12 ? 6 : 2;
                            } else if (z10) {
                                i11 = 3;
                            } else if (z12) {
                                i11 = 5;
                            }
                            pb.d dVar3 = new pb.d(bArr2, sb.toString(), arrayList.isEmpty() ? null : arrayList, bVar.toString(), i61, i60, i11);
                            dVar3.d = Integer.valueOf(i10);
                            return dVar3;
                        }
                        i59 = i61;
                        bVar2 = bVar;
                        cVar2 = cVar;
                        i51 = i10;
                    } else {
                        i10 = i51;
                        i11 = 1;
                        if (gVar.d() < 16) {
                            throw ob.c.a();
                        }
                        i59 = gVar.f(8);
                        i60 = gVar.f(8);
                    }
                    cVar = cVar2;
                    int i612 = i59;
                    if (dVar == dVar2) {
                    }
                } else {
                    bVar = bVar2;
                    i10 = i51;
                }
                i11 = 1;
                cVar = cVar2;
                int i6122 = i59;
                if (dVar == dVar2) {
                }
            } catch (IllegalArgumentException unused2) {
                throw ob.c.a();
            }
        }
    }

    @Override // ph.ia
    public void e0(long j10) {
        l5 l5Var = (l5) this.b;
        u6 u6Var = l5Var.d;
        if (u6Var == null) {
            return;
        }
        u6Var.r0 = j10;
        u6Var.j = true;
        l5Var.y(true);
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 f(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // ph.ia
    public void f0(boolean z4) {
        dg.b3 b3Var;
        da daVar = ((s9) ((l5) this.b)).z0;
        h9 h9Var = daVar.s1;
        if (h9Var == null) {
            return;
        }
        dg.b3 b3Var2 = null;
        if (!z4 && (h9Var.getSelectedEntity() instanceof dg.b3)) {
            daVar.s1.D0(null, true);
            return;
        }
        if (!z4 || (daVar.s1.getSelectedEntity() instanceof dg.b3)) {
            return;
        }
        w4 w4Var = daVar.s1.O0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= w4Var.getChildCount()) {
                b3Var = null;
                break;
            }
            View childAt = w4Var.getChildAt(i11);
            if (childAt instanceof dg.b3) {
                b3Var = (dg.b3) childAt;
                break;
            }
            i11++;
        }
        if (b3Var != null) {
            h9 h9Var2 = daVar.s1;
            w4 w4Var2 = h9Var2.O0;
            while (true) {
                if (i10 >= w4Var2.getChildCount()) {
                    break;
                }
                View childAt2 = w4Var2.getChildAt(i10);
                if (childAt2 instanceof dg.b3) {
                    b3Var2 = (dg.b3) childAt2;
                    break;
                }
                i10++;
            }
            h9Var2.D0(b3Var2, true);
        }
    }

    @Override // tf.j1
    public void g(int i10) {
        ((tf.u0) this.b).l();
    }

    public void g0() {
        t4.l lVar = (t4.l) this.b;
        int i10 = lVar.E - 1;
        lVar.E = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (t4.r rVar : lVar.G) {
            rVar.d();
            i11 += rVar.V.a;
        }
        o4.s0[] s0VarArr = new o4.s0[i11];
        int i12 = 0;
        for (t4.r rVar2 : lVar.G) {
            rVar2.d();
            int i13 = rVar2.V.a;
            int i14 = 0;
            while (i14 < i13) {
                rVar2.d();
                s0VarArr[i12] = rVar2.V.a(i14);
                i14++;
                i12++;
            }
        }
        lVar.F = new o4.t0(s0VarArr);
        lVar.D.n(lVar);
    }

    @Override // vh.g0
    public void h() {
        vh.w0 w0Var = (vh.w0) this.b;
        vh.m3 m3Var = w0Var.P;
        if (m3Var != null) {
            vh.r3.P1(m3Var.a, w0Var.a);
        }
    }

    public byte h0() {
        int read = ((com.google.firebase.messaging.d) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public int i0() {
        return ((h0() & 255) << 24) | ((h0() & 255) << 16) | ((h0() & 255) << 8) | (h0() & 255);
    }

    @Override // r4.h
    public long j(long j10, long j11) {
        return 0L;
    }

    public int j0() {
        return ((h0() & Byte.MAX_VALUE) << 21) | ((h0() & Byte.MAX_VALUE) << 14) | ((h0() & Byte.MAX_VALUE) << 7) | (h0() & Byte.MAX_VALUE);
    }

    @Override // r4.h
    public long k(long j10, long j11) {
        return -9223372036854775807L;
    }

    public void k0(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((com.google.firebase.messaging.d) this.b).skip(j10 - j11);
            if (skip <= 0) {
                throw new EOFException();
            }
            j11 += skip;
        }
    }

    @Override // r4.h
    public s4.j l(long j10) {
        return (s4.j) this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    @Override // g5.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c4.e m(g5.j0 j0Var, IOException iOException, int i10) {
        long j10;
        g5.p0 p0Var = (g5.p0) j0Var;
        r4.g gVar = (r4.g) this.b;
        long j11 = p0Var.a;
        Uri uri = p0Var.d.c;
        o4.j jVar = new o4.j();
        int i11 = p0Var.c;
        gVar.n.getClass();
        if (!(iOException instanceof j3.r1) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof g5.b0) && !(iOException instanceof g5.l0)) {
            int i12 = g5.n.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof g5.n) || ((g5.n) th2).a != 2008) {
                }
            }
            j10 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            c4.e eVar = j10 != -9223372036854775807L ? g5.m0.f : new c4.e(0, j10, false);
            gVar.r.r(jVar, i11, iOException, !eVar.a());
            return eVar;
        }
        j10 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
        }
        gVar.r.r(jVar, i11, iOException, !eVar.a());
        return eVar;
    }

    @Override // vh.c1
    public /* synthetic */ boolean o(vh.d1 d1Var) {
        return false;
    }

    @Override // ph.ia
    public void o0(float f10, int i10) {
        ArrayList arrayList;
        l5 l5Var = (l5) this.b;
        u6 u6Var = l5Var.d;
        if (u6Var == null || (arrayList = u6Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((u6) l5Var.d.T.get(i10)).V = f10;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        com.google.android.gms.internal.cast.d2 d2Var;
        com.google.android.gms.internal.cast.d1 b10;
        r5.a aVar = (r5.a) this.b;
        Bundle bundle = (Bundle) obj;
        if (com.google.android.gms.internal.cast.o0.j) {
            Context context = aVar.a;
            u5.s sVar = aVar.f;
            com.google.android.gms.internal.cast.o0 o0Var = new com.google.android.gms.internal.cast.o0(context, sVar, aVar.c, aVar.j, aVar.g);
            int i10 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
            boolean z4 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i10 == 0) {
                if (!z4) {
                    return;
                }
                i10 = 0;
                z4 = true;
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String k10 = vh.v2.k(packageName, ".client_cast_analytics_data");
            o0Var.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            y2.q.b(context);
            o0Var.g = y2.q.a().c(w2.a.e).a("CAST_SENDER_SDK", new v2.c("proto"), com.google.android.gms.internal.cast.z.a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                o0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(k10, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                e.c = new qk0(sVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, 14);
                e.d = new y5.c[]{q5.y.c};
                e.b = false;
                e.a = 8426;
                Task e6 = sVar.e(0, e.e());
                h5.u uVar = new h5.u();
                uVar.b = o0Var;
                uVar.c = packageName;
                uVar.a = i10;
                uVar.d = sharedPreferences;
                e6.addOnSuccessListener(uVar);
            }
            if (z4) {
                b6.m.h(sharedPreferences);
                u5.b bVar = com.google.android.gms.internal.cast.d2.i;
                synchronized (com.google.android.gms.internal.cast.d2.class) {
                    try {
                        if (com.google.android.gms.internal.cast.d2.k == null) {
                            com.google.android.gms.internal.cast.d2.k = new com.google.android.gms.internal.cast.d2(sharedPreferences, o0Var, packageName);
                        }
                        d2Var = com.google.android.gms.internal.cast.d2.k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = d2Var.c;
                SharedPreferences sharedPreferences2 = d2Var.b;
                HashSet hashSet = d2Var.f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = d2Var.g;
                hashSet2.clear();
                d2Var.h = 0L;
                String str2 = com.google.android.gms.internal.cast.d2.j;
                if (str2.equals(string) && str.equals(string2)) {
                    d2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j10 = sharedPreferences2.getLong(str3, 0L);
                            if (j10 != 0 && currentTimeMillis - j10 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                com.google.android.gms.internal.cast.d1 b11 = com.google.android.gms.internal.cast.d2.b(str3.substring(41));
                                if (b11 != null) {
                                    hashSet2.add(b11);
                                    hashSet.add(b11);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = com.google.android.gms.internal.cast.d2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    d2Var.c(hashSet3);
                    b6.m.h(d2Var.e);
                    b6.m.h(d2Var.d);
                    d2Var.e.post(d2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    d2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                com.google.android.gms.internal.cast.d2.a(com.google.android.gms.internal.cast.d1.h);
            }
        }
    }

    public void p(HashMap hashMap) {
        if (((SparseArray) this.b) == null) {
            this.b = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((SparseArray) this.b).put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }

    @Override // r4.h
    public long q(long j10, long j11) {
        return 0L;
    }

    @Override // ph.ia
    public void r0(float f10) {
        l5 l5Var = (l5) this.b;
        u6 u6Var = l5Var.d;
        if (u6Var == null) {
            return;
        }
        u6Var.F = f10;
        u6Var.j = true;
        l5Var.w(true);
    }

    @Override // g5.h0
    public void s(g5.j0 j0Var, long j10, long j11, boolean z4) {
        g5.p0 p0Var = (g5.p0) j0Var;
        r4.g gVar = (r4.g) this.b;
        long j12 = p0Var.a;
        Uri uri = p0Var.d.c;
        o4.j jVar = new o4.j();
        gVar.n.getClass();
        gVar.r.l(jVar, p0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // ra.m
    public Object s2() {
        Constructor constructor = (Constructor) this.b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            k7.a8 a8Var = ua.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e6) {
            throw new RuntimeException("Failed to invoke constructor '" + ua.c.b(constructor) + "' with no args", e6);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ua.c.b(constructor) + "' with no args", e10.getCause());
        }
    }

    @Override // tf.j1
    public /* synthetic */ a0.h t() {
        return null;
    }

    @Override // ph.ia
    public void t0(float f10) {
        l5 l5Var = (l5) this.b;
        u6 u6Var = l5Var.d;
        if (u6Var == null) {
            return;
        }
        u6Var.E = f10;
        u6Var.j = true;
        l5Var.w(true);
    }

    @Override // vh.g0
    public org.telegram.ui.Cells.m9 u() {
        vh.m3 m3Var = ((vh.w0) this.b).P;
        if (m3Var == null) {
            return null;
        }
        return m3Var.a.getTextSelectionHelper();
    }

    @Override // ph.ia
    public void u0(float f10, int i10) {
        ArrayList arrayList;
        l5 l5Var = (l5) this.b;
        u6 u6Var = l5Var.d;
        if (u6Var == null || (arrayList = u6Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((u6) l5Var.d.T.get(i10)).W = f10;
    }

    @Override // ph.ia
    public void v(float f10) {
        l5 l5Var = (l5) this.b;
        u6 u6Var = l5Var.d;
        if (u6Var == null) {
            return;
        }
        u6Var.u0 = f10;
        u6Var.j = true;
        l5Var.c();
    }

    @Override // ph.ia
    public void v0(float f10) {
        u6 u6Var = ((l5) this.b).d;
        if (u6Var == null) {
            return;
        }
        u6Var.a0 = f10;
        u6Var.j = true;
    }

    @Override // r4.h
    public boolean w() {
        return true;
    }

    @Override // ph.ia
    public void w0() {
        ((l5) this.b).p(null);
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 x(Class cls, v1.b bVar) {
        androidx.lifecycle.m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.b) {
            if (cVar.a.equals(cls)) {
                m0Var = new androidx.lifecycle.m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // vh.g0
    public void y(CharSequence charSequence) {
        vh.m3 m3Var = ((vh.w0) this.b).P;
        if (m3Var != null) {
            m3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            m3Var.a.t4(charSequence.toString());
        }
    }

    @Override // vh.g0
    public org.telegram.ui.Cells.l9 z() {
        return (vh.w0) this.b;
    }

    public /* synthetic */ j5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public j5(MediaInfo mediaInfo) {
        this.a = 1;
        q5.o oVar = new q5.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public j5(l6.a aVar) {
        this.a = 18;
        b6.m.h(aVar);
        this.b = aVar;
    }

    public j5(JSONObject jSONObject) {
        this.a = 1;
        this.b = new q5.o(jSONObject);
    }

    public j5(int i10) {
        this.a = i10;
        switch (i10) {
            case 7:
                this.b = new j5(9);
                break;
            case 9:
                this.b = new o2.o(rb.a.h, 20);
                break;
            case 13:
                break;
            default:
                this.b = new h5.w(10);
                break;
        }
    }

    public j5(v1.c[] initializers) {
        this.a = 12;
        kotlin.jvm.internal.j.e(initializers, "initializers");
        this.b = initializers;
    }

    @Override // vh.c1
    public /* synthetic */ void r() {
    }

    @Override // vh.c1
    public /* synthetic */ void D(CharSequence charSequence) {
    }

    @Override // r4.h
    public long e(long j10, long j11) {
        return j11;
    }

    @Override // vh.c1
    public /* synthetic */ void i(int i10, int i11) {
    }
}
