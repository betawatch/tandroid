package zf;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c7;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f5;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.i5;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.r5;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.wd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Cells.ja;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.ay;
import org.telegram.ui.iv;
import org.telegram.ui.kp;
import org.telegram.ui.kx;
import org.telegram.ui.mx;
import org.telegram.ui.q00;
import org.telegram.ui.u71;
import org.telegram.ui.w71;
import vh.m6;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class z extends sk0 {
    public q00 A0;
    public int B0;
    public int C0;
    public String D;
    public int D0;
    public u71 E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public String M;
    public boolean N;
    public int P;
    public String R;
    public int S;
    public int T;
    public mx U;
    public final int V;
    public boolean W;
    public boolean X;
    public String Z;
    public int a0;
    public String b0;
    public int c0;
    public boolean d;
    public int d0;
    public final Context e;
    public int e0;
    public n f;
    public int f0;
    public int g0;
    public n h;
    public final int h0;
    public final s4.j i0;
    public final t j0;
    public w71 k0;
    public final long l0;
    public long n0;
    public View o0;
    public yh.o p0;
    public ArrayList q0;
    public org.telegram.ui.Wallet.x0 r;
    public final ay r0;
    public final int s0;
    public ArrayList t0;
    public final ArrayList u0;
    public final ArrayList v0;
    public int w;
    public String w0;
    public int x;
    public a0.h x0;
    public final ArrayList y0;
    public boolean z0;
    public w c = w.d;
    public int n = -1;
    public ArrayList s = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final ArrayList F = new ArrayList();
    public ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final ArrayList K = new ArrayList();
    public final HashSet L = new HashSet();
    public int O = 0;
    public int Q = 0;
    public int Y = -1;
    public boolean m0 = false;

    public z(Context context, ay ayVar, int i10, int i11, s4.j jVar, boolean z10) {
        int i12 = d20.s0;
        this.s0 = i12;
        this.t0 = new ArrayList();
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.w0 = null;
        this.x0 = new a0.h();
        this.y0 = new ArrayList();
        this.F0 = -1;
        this.G0 = true;
        this.H0 = true;
        this.i0 = jVar;
        this.r0 = ayVar;
        zm0 zm0Var = (zm0) this;
        t tVar = new t(zm0Var);
        this.j0 = tVar;
        tVar.a = new s9.g(zm0Var);
        tVar.p = z10;
        this.e = context;
        this.V = i10;
        this.h0 = i11;
        this.l0 = d20.i(i12).e();
        if (i11 != 15) {
            hs.a0(i12).a.c(new i2.u(i12, i11, new q(this), 17));
        }
        ui.b0(i12).M0(true);
    }

    public static boolean X(String str, String str2) {
        if (str2 != null && str != null) {
            String[] split = str.toLowerCase().split(" ");
            for (int i10 = 0; i10 < split.length; i10++) {
                String str3 = split[i10];
                if (str3 != null && (str3.startsWith(str2) || str2.startsWith(split[i10]))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return (i10 == 1 || i10 == 4 || i10 == 10) ? false : true;
    }

    public final void E() {
        StringBuilder sb2;
        boolean z10 = this.N;
        ArrayList arrayList = this.u0;
        ArrayList arrayList2 = this.v0;
        if (z10) {
            sb2 = null;
            while (arrayList2.size() > 0) {
                y yVar = (y) arrayList2.remove(0);
                this.t0.remove(yVar);
                arrayList.remove(yVar);
                this.x0.l(yVar.c);
                if (sb2 == null) {
                    sb2 = new StringBuilder("did IN (");
                    sb2.append(yVar.c);
                } else {
                    sb2.append(", ");
                    sb2.append(yVar.c);
                }
            }
            if (sb2 == null) {
                sb2 = new StringBuilder("1");
            } else {
                sb2.append(")");
            }
        } else {
            arrayList2.clear();
            arrayList.clear();
            this.t0.clear();
            this.x0.b();
            sb2 = new StringBuilder("1");
        }
        String str = this.M;
        G(str != null ? str.trim() : null);
        f();
        boolean z11 = this.N;
        int i10 = this.s0;
        if (z11) {
            hs.a0(i10).a.c(new yh.o(5, (zm0) this, sb2));
        } else {
            hs.a0(i10).a.c(new wd(i10, 14));
        }
    }

    public final boolean F(Object obj) {
        if (this.h0 != 14) {
            return true;
        }
        boolean z10 = obj instanceof TLRPC.User;
        ay ayVar = this.r0;
        if (z10) {
            return ((TLRPC.User) obj).bot ? ayVar.A2 : ayVar.z2;
        }
        if (!(obj instanceof TLRPC.Chat)) {
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        return w3.T(chat) ? ayVar.y2 : w3.n0(chat) ? ayVar.v2 || ayVar.w2 : ayVar.v2 || ayVar.x2;
    }

    public final void G(String str) {
        mx mxVar;
        String str2;
        String str3;
        this.w0 = str;
        ArrayList arrayList = this.v0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.u0;
            arrayList2.clear();
            int size = this.t0.size();
            for (int i10 = 0; i10 < size; i10++) {
                mx mxVar2 = this.U;
                if ((mxVar2 == null || mxVar2.a() != ((y) this.t0.get(i10)).c) && F(((y) this.t0.get(i10)).a)) {
                    arrayList2.add((y) this.t0.get(i10));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.t0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            y yVar = (y) this.t0.get(i11);
            if (yVar != null && yVar.a != null && (((mxVar = this.U) == null || mxVar.a() != yVar.c) && F(((y) this.t0.get(i11)).a))) {
                TLObject tLObject = yVar.a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    str2 = chat.monoforum ? gg.e.i(this.s0, chat, false) : chat.title;
                    str3 = ((TLRPC.Chat) yVar.a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = h20.p((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) yVar.a).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    str2 = ((TLRPC.ChatInvite) tLObject).title;
                    str3 = null;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if ((str2 != null && X(str2.toLowerCase(), lowerCase)) || (str3 != null && X(str3.toLowerCase(), lowerCase))) {
                    arrayList.add(yVar);
                }
                if (arrayList.size() >= 5) {
                    return;
                }
            }
        }
    }

    public final SpannableStringBuilder H(w wVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cd.L0(wVar.c, null));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new dq(R.drawable.arrows_select, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    public final Object I(int i10) {
        int i11;
        int i12;
        TLRPC.Chat L0;
        int i13;
        ArrayList arrayList = this.y;
        if (!arrayList.isEmpty()) {
            if (i10 > 0 && i10 - 1 < arrayList.size()) {
                return arrayList.get(i13);
            }
            i10 = sc.e.e(1, i10, arrayList);
        }
        ArrayList arrayList2 = this.J;
        if (!arrayList2.isEmpty()) {
            if (i10 > 0) {
                return arrayList2.get(i10 - 1);
            }
            return null;
        }
        if (O()) {
            ?? L = L();
            ArrayList arrayList3 = this.N ? this.v0 : this.u0;
            if (i10 > L && (i12 = (i10 - 1) - (L == true ? 1 : 0)) < arrayList3.size()) {
                TLObject tLObject = ((y) arrayList3.get(i12)).a;
                boolean z10 = tLObject instanceof TLRPC.User;
                int i14 = this.s0;
                if (!z10) {
                    return (!(tLObject instanceof TLRPC.Chat) || (L0 = vp.r1(i14).L0(Long.valueOf(((TLRPC.Chat) tLObject).id))) == null) ? tLObject : L0;
                }
                TLRPC.User Z1 = vp.r1(i14).Z1(Long.valueOf(((TLRPC.User) tLObject).id));
                return Z1 != null ? Z1 : tLObject;
            }
            i10 -= J();
        }
        ArrayList arrayList4 = this.F;
        if (!arrayList4.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList4.size()) {
                return arrayList4.get(i10 - 1);
            }
            i10 = sc.e.e(1, i10, arrayList4);
        }
        ArrayList arrayList5 = this.E;
        if (!arrayList5.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList5.size()) {
                return arrayList5.get(i10 - 1);
            }
            i10 = sc.e.e(1, i10, arrayList5);
        }
        t tVar = this.j0;
        ArrayList arrayList6 = tVar.e;
        ArrayList arrayList7 = tVar.d;
        ArrayList arrayList8 = tVar.j;
        int size = this.s.size();
        int size2 = arrayList7.size();
        if (size + size2 > 0 && (J() > 0 || !arrayList4.isEmpty() || !arrayList.isEmpty())) {
            if (i10 == 0) {
                return null;
            }
            i10--;
        }
        int size3 = arrayList8.size();
        if (size3 > 3 && this.H0) {
            size3 = 3;
        }
        int size4 = arrayList6.size();
        int i15 = (size4 <= 3 || !this.G0) ? size4 : 3;
        boolean isEmpty = arrayList6.isEmpty();
        int i16 = 0;
        ArrayList arrayList9 = this.K;
        int size5 = (isEmpty && arrayList9.isEmpty()) ? 0 : arrayList9.size() + i15 + 1;
        if (i10 >= 0 && i10 < size) {
            return this.s.get(i10);
        }
        int i17 = i10 - size;
        if (i17 >= 0 && i17 < size2) {
            return arrayList7.get(i17);
        }
        int i18 = i17 - size2;
        if (i18 >= 0 && i18 < size3) {
            return arrayList8.get(i18);
        }
        int i19 = i18 - size3;
        if (i19 <= 0 || i19 >= size5) {
            i11 = i19 - size5;
        } else {
            int i20 = i19 - 1;
            if (i20 >= 0 && i20 < arrayList9.size()) {
                return arrayList9.get(i20);
            }
            i11 = i20 - arrayList9.size();
            if (i11 >= 0 && i11 < arrayList6.size()) {
                return arrayList6.get(i11);
            }
        }
        ArrayList arrayList10 = this.H;
        int size6 = arrayList10.isEmpty() ? 0 : arrayList10.size() + 1;
        if (i11 > 0 && i11 <= arrayList10.size()) {
            return arrayList10.get(i11 - 1);
        }
        if (!this.X && !arrayList10.isEmpty()) {
            i16 = 1;
        }
        int i21 = i11 - (size6 + i16);
        ArrayList arrayList11 = this.I;
        if (!arrayList11.isEmpty()) {
            arrayList11.size();
        }
        if (i21 <= 0 || i21 > arrayList11.size()) {
            return null;
        }
        return arrayList11.get(i21 - 1);
    }

    public final int J() {
        ArrayList arrayList = this.N ? this.v0 : this.u0;
        return (L() ? 1 : 0) + (!arrayList.isEmpty() ? arrayList.size() + 1 : 0);
    }

    public final int K() {
        if (this.D0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.y;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.J;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + size;
        }
        if (O()) {
            size += J();
            if (!this.N) {
                return size;
            }
        }
        ArrayList arrayList3 = this.F;
        if (!arrayList3.isEmpty()) {
            size = size + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.E;
        if (!arrayList4.isEmpty()) {
            size += arrayList4.size() + 1;
        }
        int size2 = this.s.size();
        int size3 = this.j0.d.size();
        int i10 = size + size2 + size3;
        return size2 + size3 > 0 ? (J() <= 0 && arrayList3.isEmpty() && arrayList.isEmpty()) ? i10 : i10 + 1 : i10;
    }

    public final boolean L() {
        if (this.N || ui.b0(this.s0).i1.isEmpty()) {
            return false;
        }
        return this.h0 != 14 || this.r0.z2;
    }

    public final boolean M() {
        return R() && J() > 0;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    public final boolean N(int i10) {
        int i11;
        int i12;
        if (this.N && this.J.isEmpty()) {
            ArrayList arrayList = this.y;
            if (!arrayList.isEmpty()) {
                i10 = sc.e.e(1, i10, arrayList);
            }
            if (O()) {
                ?? L = L();
                ArrayList arrayList2 = this.N ? this.v0 : this.u0;
                if (i10 <= L || (i10 - 1) - (L == true ? 1 : 0) >= arrayList2.size()) {
                    i10 -= J();
                }
            }
            t tVar = this.j0;
            ArrayList arrayList3 = tVar.e;
            ArrayList arrayList4 = tVar.d;
            int size = this.s.size();
            int size2 = arrayList4.size();
            int size3 = tVar.j.size();
            if (size3 > 3 && this.H0) {
                size3 = 3;
            }
            int size4 = arrayList3.size();
            int i13 = (size4 <= 3 || !this.G0) ? size4 : 3;
            boolean isEmpty = arrayList3.isEmpty();
            ArrayList arrayList5 = this.K;
            int size5 = (isEmpty && arrayList5.isEmpty()) ? 0 : arrayList5.size() + i13 + 1;
            int size6 = this.E.size();
            if (size6 > 0) {
                if (i10 < 0 || i10 >= size6) {
                    i10 -= size6 + 1;
                }
            }
            if (size + size2 > 0 && (J() > 0 || !this.F.isEmpty() || !arrayList.isEmpty())) {
                if (i10 != 0) {
                    i10--;
                }
            }
            if ((i10 < 0 || i10 >= size) && (((i11 = i10 - size) < 0 || i11 >= size2) && ((i12 = i11 - size2) <= 0 || i12 >= size3))) {
                int i14 = i12 - size3;
                if (i14 > 0 && i14 < size5) {
                    return true;
                }
                int i15 = i14 - size5;
                ArrayList arrayList6 = this.H;
                int size7 = arrayList6.isEmpty() ? 0 : arrayList6.size() + 1;
                if (i15 <= 0 || i15 >= size7) {
                    ArrayList arrayList7 = this.I;
                    if (!arrayList7.isEmpty()) {
                        arrayList7.size();
                    }
                    if (this.c != w.d || this.d) {
                        arrayList7.isEmpty();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final boolean O() {
        return this.V != 2 && M();
    }

    public final void P() {
        if ((this.Q == 0 || this.O == 0) && this.g0 == this.d0) {
            mx mxVar = this.U;
            if (mxVar == null || mxVar.a() == 0 || this.X) {
                V(this.g0, this.Z);
            } else {
                U(this.g0, this.Z);
            }
        }
    }

    public final void Q(long j10, TLObject tLObject) {
        y yVar = (y) this.x0.f(j10);
        if (yVar == null) {
            yVar = new y();
            this.x0.k(yVar, j10);
        } else {
            this.t0.remove(yVar);
        }
        this.t0.add(0, yVar);
        yVar.c = j10;
        yVar.a = tLObject;
        yVar.b = (int) (System.currentTimeMillis() / 1000);
        String str = this.M;
        G(str != null ? str.trim() : null);
        f();
        int i10 = this.s0;
        hs.a0(i10).a.c(new org.telegram.ui.web.l(i10, j10, 3));
    }

    public final boolean R() {
        int i10 = this.h0;
        return (i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 1 || i10 == 11 || i10 == 15) ? false : true;
    }

    public final void S() {
        int K;
        ArrayList arrayList = this.K;
        if (!arrayList.isEmpty() && (K = K()) < b()) {
            int size = arrayList.size();
            arrayList.clear();
            p(K + 1, size);
            int size2 = this.j0.e.size();
            if (this.G0) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                s(K);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(int i10, String str) {
        String str2;
        if (str != null && str.equals(this.M) && (i10 == this.C0 || TextUtils.isEmpty(str))) {
            return;
        }
        this.M = str;
        this.C0 = i10;
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        n nVar = this.h;
        if (nVar != null) {
            org.telegram.messenger.i0.r(nVar);
            this.h = null;
        }
        org.telegram.ui.Wallet.x0 x0Var = this.r;
        if (x0Var != null) {
            org.telegram.messenger.i0.r(x0Var);
            this.r = null;
        }
        if (this.n >= 0) {
            ConnectionsManager.getInstance(this.s0).cancelRequest(this.n, true);
            this.n = -1;
        }
        String trim = str != null ? str.trim() : null;
        G(trim);
        if (!TextUtils.equals(this.R, trim)) {
            this.R = trim;
            this.K.clear();
            if (this.S != 0) {
                ConnectionsManager.getInstance(this.s0).cancelRequest(this.S, true);
                this.S = 0;
            }
            if (trim == null || trim.length() < 4 || (d20.i(this.s0).q() && vp.r1(this.s0).D2())) {
                this.R = null;
            } else {
                TLRPC.TL_contacts_getSponsoredPeers tL_contacts_getSponsoredPeers = new TLRPC.TL_contacts_getSponsoredPeers();
                this.R = trim;
                tL_contacts_getSponsoredPeers.q = trim;
                this.S = ConnectionsManager.getInstance(this.s0).sendRequest(tL_contacts_getSponsoredPeers, new ag.c((zm0) this, 28));
            }
        }
        if (TextUtils.isEmpty(trim)) {
            this.w0 = null;
            this.j0.s = false;
            this.s.clear();
            this.G.clear();
            this.J.clear();
            this.w = 0;
            this.x = 0;
            this.D = null;
            this.y.clear();
            this.j0.f(null, null);
            int i11 = this.h0;
            if (i11 != 15) {
                t tVar = this.j0;
                boolean z10 = i11 != 11;
                boolean z11 = i11 != 11;
                boolean z12 = i11 == 2 || i11 == 11;
                boolean z13 = i11 == 0;
                mx mxVar = this.U;
                tVar.h(null, true, true, z10, z11, z12, 0L, z13, 0, 0, mxVar != null ? mxVar.a() : 0L, null);
            }
            this.N = false;
            this.d0 = 0;
            this.D0 = 0;
            this.G0 = true;
            this.H0 = true;
            mx mxVar2 = this.U;
            if (mxVar2 != null) {
                mxVar2.d(false, true);
            }
            if (this.h0 != 15) {
                W(null);
                V(0, null);
                U(0, null);
            }
            f();
            this.y0.clear();
            this.z0 = false;
            q00 q00Var = this.A0;
            if (q00Var != null) {
                ((iv) q00Var).k(false, null, this.y0, false);
                return;
            }
            return;
        }
        this.j0.f(this.s, this.v0);
        this.w = 0;
        this.x = 0;
        this.D = null;
        this.y.clear();
        if (this.V != 2 && trim.startsWith("#") && trim.length() == 1) {
            this.W = true;
            t tVar2 = this.j0;
            if (tVar2.s) {
                this.I.clear();
                this.J.clear();
                ArrayList arrayList = this.j0.q;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    this.J.add(((k1) arrayList.get(i12)).a);
                }
                this.G0 = true;
                this.H0 = true;
                this.D0 = 0;
                f();
                mx mxVar3 = this.U;
                if (mxVar3 != null) {
                    mxVar3.d(false, false);
                }
            } else {
                hs.a0(tVar2.m).a.c(new j1(tVar2, 1));
            }
        } else {
            this.J.clear();
        }
        int i13 = this.d0 + 1;
        this.d0 = i13;
        this.D0 = 3;
        this.G0 = true;
        this.H0 = true;
        f();
        mx mxVar4 = this.U;
        if (mxVar4 != null) {
            mxVar4.d(true, false);
        }
        if (trim != null) {
            String trim2 = trim.trim();
            if (trim2.length() > 1 && (trim2.charAt(0) == '#' || trim2.charAt(0) == '$')) {
                int indexOf = trim2.indexOf(64);
                String substring = trim2.substring(1);
                if (indexOf >= 0) {
                    trim2.substring(indexOf + 1);
                }
                str2 = substring;
                r5 r5Var = Utilities.g;
                zm0 zm0Var = (zm0) this;
                n nVar2 = new n(zm0Var, trim, i13, str, 0);
                this.f = nVar2;
                r5Var.d(nVar2, 300L);
                if (str2 == null) {
                    this.D0++;
                    org.telegram.ui.Wallet.x0 x0Var2 = new org.telegram.ui.Wallet.x0(zm0Var, i13, str2, 26);
                    this.r = x0Var2;
                    org.telegram.messenger.i0.h3(x0Var2, 300L);
                    return;
                }
                return;
            }
        }
        str2 = null;
        r5 r5Var2 = Utilities.g;
        zm0 zm0Var2 = (zm0) this;
        n nVar22 = new n(zm0Var2, trim, i13, str, 0);
        this.f = nVar22;
        r5Var2.d(nVar22, 300L);
        if (str2 == null) {
        }
    }

    public final void U(int i10, String str) {
        mx mxVar = this.U;
        if (mxVar == null || mxVar.a() == 0 || this.V == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.Z) && TextUtils.isEmpty(str)) {
            return;
        }
        int i11 = this.Q;
        int i12 = this.s0;
        if (i11 != 0) {
            ConnectionsManager.getInstance(i12).cancelRequest(this.Q, true);
            this.Q = 0;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.H;
        if (isEmpty) {
            this.w0 = null;
            this.I.clear();
            arrayList.clear();
            this.T = 0;
            this.Z = null;
            this.N = false;
            f();
            return;
        }
        if (this.h0 == 15) {
            return;
        }
        long a2 = this.U.a();
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.peer = vp.r1(i12).i1(a2);
        if (str.equals(this.Z) && !arrayList.isEmpty()) {
            tL_messages_search.add_offset = arrayList.size();
        }
        this.Z = str;
        int i13 = 1 + this.T;
        this.T = i13;
        this.Q = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_search, new c7(i13, i10, 1, this, str, tL_messages_search), 2);
    }

    public final void V(int i10, String str) {
        if (this.V != 0 && (!TextUtils.isEmpty(this.Z) || !TextUtils.isEmpty(str))) {
            int i11 = this.O;
            int i12 = this.s0;
            if (i11 != 0) {
                ConnectionsManager.getInstance(i12).cancelRequest(this.O, true);
                this.O = 0;
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = this.I;
            if (isEmpty || this.U.a() != 0) {
                this.w0 = null;
                arrayList.clear();
                this.H.clear();
                this.P = 0;
                this.Z = null;
                this.a0 = 0;
                this.N = false;
                f();
                return;
            }
            G(str);
            this.j0.f(this.s, this.v0);
            if (this.h0 != 15) {
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                int i13 = this.c.a;
                tL_messages_searchGlobal.broadcasts_only = (i13 & 2) != 0;
                tL_messages_searchGlobal.groups_only = (i13 & 4) != 0;
                tL_messages_searchGlobal.users_only = (i13 & 8) != 0;
                tL_messages_searchGlobal.limit = 20;
                tL_messages_searchGlobal.q = str;
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_searchGlobal.flags |= 1;
                tL_messages_searchGlobal.folder_id = this.C0;
                if (!str.equals(this.Z)) {
                    this.d = false;
                }
                if (str.equals(this.Z) && this.a0 == this.c.a && !arrayList.isEmpty() && this.g0 == this.d0) {
                    jj jjVar = (jj) i0.a.g(1, arrayList);
                    tL_messages_searchGlobal.offset_id = jjVar.f1();
                    tL_messages_searchGlobal.offset_rate = this.c0;
                    tL_messages_searchGlobal.offset_peer = vp.r1(i12).i1(jj.C1(jjVar.k.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.Z = str;
                this.a0 = this.c.a;
                int i14 = this.P + 1;
                this.P = i14;
                this.O = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_searchGlobal, new c7(i14, i10, 2, this, str, tL_messages_searchGlobal), 2);
                return;
            }
            int i15 = this.D0 - 1;
            this.D0 = i15;
            mx mxVar = this.U;
            if (mxVar != null) {
                mxVar.d(i15 > 0, true);
                this.U.c();
            }
        }
    }

    public final void W(String str) {
        ArrayList arrayList = this.F;
        arrayList.clear();
        mx mxVar = this.U;
        if (mxVar == null || mxVar.a() == 0) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            ArrayList l4 = vp.r1(this.s0).r7.l(-this.U.a());
            String trim = str.trim();
            for (int i10 = 0; i10 < l4.size(); i10++) {
                if (l4.get(i10) != null && ((TLRPC.TL_forumTopic) l4.get(i10)).title.toLowerCase().contains(trim)) {
                    arrayList.add((TLRPC.TL_forumTopic) l4.get(i10));
                    ((TLRPC.TL_forumTopic) l4.get(i10)).searchQuery = trim;
                }
            }
        }
        f();
    }

    @Override // s4.g0
    public final int b() {
        if (this.D0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.y;
        int size = !arrayList.isEmpty() ? arrayList.size() + 1 : 0;
        ArrayList arrayList2 = this.J;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + size;
        }
        if (O()) {
            size += J();
            if (!this.N) {
                return size;
            }
        }
        ArrayList arrayList3 = this.F;
        if (!arrayList3.isEmpty()) {
            size = size + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.E;
        if (!arrayList4.isEmpty()) {
            size += arrayList4.size() + 1;
        }
        int size2 = this.s.size();
        t tVar = this.j0;
        int size3 = tVar.d.size();
        int i10 = size + size2 + size3;
        int size4 = tVar.e.size();
        if (size4 > 3 && this.G0) {
            size4 = 3;
        }
        int size5 = this.K.size() + size4;
        int size6 = tVar.j.size();
        if (size6 > 3 && this.H0) {
            size6 = 3;
        }
        if (size2 + size3 > 0 && (J() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty())) {
            i10++;
        }
        if (size5 != 0) {
            i10 += size5 + 1;
        }
        if (size6 != 0) {
            i10 += size6;
        }
        ArrayList arrayList5 = this.H;
        int size7 = arrayList5.size();
        if (size7 != 0) {
            i10 += size7 + 1 + (!this.X ? 1 : 0);
        }
        if (!this.X) {
            this.Y = i10;
        }
        ArrayList arrayList6 = this.I;
        int size8 = arrayList6.size();
        if ((this.c != w.d || this.d) && arrayList6.isEmpty()) {
            size8 = this.d ? 3 : 1;
        }
        int i11 = (arrayList5.isEmpty() || this.X) ? size8 : 0;
        if (i11 != 0) {
            i10 += i11 + 1 + (!this.W ? 1 : 0);
        }
        if (this.X) {
            this.Y = i10;
        }
        this.B0 = i10;
        return i10;
    }

    @Override // s4.g0
    public final long c(int i10) {
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0155, code lost:
    
        if (r14 != 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0158, code lost:
    
        if (r14 != r6) goto L148;
     */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i10) {
        int i11;
        if (this.J.isEmpty()) {
            ArrayList arrayList = this.y;
            if (!arrayList.isEmpty()) {
                if (i10 != 0) {
                    int i12 = i10 - 1;
                    if (i12 < arrayList.size()) {
                        return 9;
                    }
                    i10 = i12 - arrayList.size();
                }
            }
            if (O()) {
                ?? L = L();
                if (i10 < L) {
                    return 6;
                }
                if (i10 != L) {
                    if (i10 >= J()) {
                        i10 -= J();
                    }
                    return 0;
                }
            }
            ArrayList arrayList2 = this.F;
            if (!arrayList2.isEmpty()) {
                if (i10 != 0) {
                    if (i10 <= arrayList2.size()) {
                        return 3;
                    }
                    i10 = sc.e.e(1, i10, arrayList2);
                }
            }
            ArrayList arrayList3 = this.E;
            if (!arrayList3.isEmpty()) {
                if (i10 != 0) {
                    if (i10 <= arrayList3.size()) {
                        return 8;
                    }
                    i10 = sc.e.e(1, i10, arrayList3);
                }
            }
            t tVar = this.j0;
            ArrayList arrayList4 = tVar.e;
            int size = this.s.size();
            int size2 = tVar.d.size();
            if (size + size2 > 0 && (J() > 0 || !arrayList2.isEmpty() || !arrayList.isEmpty())) {
                if (i10 != 0) {
                    i10--;
                }
            }
            int size3 = tVar.j.size();
            if (size3 > 3 && this.H0) {
                size3 = 3;
            }
            int size4 = arrayList4.size();
            int i13 = (size4 <= 3 || !this.G0) ? size4 : 3;
            ArrayList arrayList5 = this.K;
            int size5 = (arrayList5.isEmpty() && arrayList4.isEmpty()) ? 0 : arrayList5.size() + i13 + 1;
            ArrayList arrayList6 = this.I;
            int size6 = arrayList6.isEmpty() ? 0 : arrayList6.size() + 1;
            w wVar = this.c;
            w wVar2 = w.d;
            if ((wVar != wVar2 || this.d) && arrayList6.isEmpty()) {
                size6 = this.d ? 4 : 2;
            }
            ArrayList arrayList7 = this.H;
            if (!arrayList7.isEmpty() && !this.X) {
                size6 = 0;
            }
            int size7 = arrayList7.isEmpty() ? 0 : arrayList7.size() + 1;
            if ((i10 < 0 || i10 >= size) && ((i11 = i10 - size) < 0 || i11 >= size2)) {
                int i14 = i11 - size2;
                if (i14 < 0 || i14 >= size3) {
                    int i15 = i14 - size3;
                    if (i15 < 0 || i15 >= size5) {
                        int i16 = i15 - size5;
                        if (size7 > 0) {
                            if (i16 >= 0) {
                                if (this.X) {
                                }
                            }
                            i16 -= size7 + (!this.X ? 1 : 0);
                        }
                        if (i16 >= 0 && i16 < size6) {
                            if (i16 != 0) {
                                if (!this.d || !arrayList6.isEmpty()) {
                                    return (this.c == wVar2 || !arrayList6.isEmpty()) ? 2 : 10;
                                }
                            }
                        }
                        return 4;
                    }
                    if (i15 == 0) {
                    }
                } else {
                    Object I = I(i14);
                    if (I instanceof String) {
                        if (!"section".equals((String) I)) {
                            return 7;
                        }
                    }
                }
            }
            return 0;
        }
        if (i10 != 0) {
            return 5;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x067e A[Catch: Exception -> 0x0698, TryCatch #0 {Exception -> 0x0698, blocks: (B:289:0x066c, B:291:0x067e, B:293:0x0684, B:294:0x0689, B:296:0x0687), top: B:288:0x066c }] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x033f  */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r12v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v10, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        long j10;
        boolean z10;
        ArrayList<TLRPC.TL_username> arrayList;
        TLRPC.User user;
        String str;
        TLRPC.Chat chat;
        ?? r82;
        TLRPC.EncryptedChat encryptedChat;
        boolean z11;
        boolean z12;
        String str2;
        int i11;
        int size;
        int size2;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Object obj;
        TLRPC.TL_sponsoredPeer tL_sponsoredPeer;
        CharSequence charSequence4;
        boolean z13;
        CharSequence charSequence5;
        boolean z14;
        boolean z15;
        CharSequence charSequence6;
        int i12;
        String str3;
        int A1;
        String str4;
        int A12;
        boolean z16;
        TLRPC.Chat chat2;
        TLRPC.User user2;
        String q6;
        ArrayList<TLRPC.TL_username> arrayList2;
        TLRPC.Chat chat3;
        int i13;
        int i14;
        String str5;
        String str6;
        final z3 z3Var;
        ?? r83;
        SpannableStringBuilder spannableStringBuilder;
        Object obj2;
        boolean z17;
        ?? r02;
        char c10;
        String str7;
        Runnable runnable;
        String str8;
        int i15 = i10;
        int i16 = c1Var.f;
        View view = c1Var.a;
        ArrayList arrayList3 = this.H;
        ArrayList arrayList4 = this.J;
        ArrayList arrayList5 = this.K;
        ArrayList arrayList6 = this.y;
        ArrayList arrayList7 = this.F;
        t tVar = this.j0;
        int i17 = this.s0;
        final int i18 = 1;
        switch (i16) {
            case 0:
                k6 k6Var = (k6) view;
                a7.i(t6.d6, k6Var, null);
                long dialogId = k6Var.getDialogId();
                boolean N = N(i15);
                Object I = I(i15);
                boolean z18 = I instanceof TLRPC.TL_sponsoredPeer;
                if (z18) {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer2 = (TLRPC.TL_sponsoredPeer) I;
                    HashSet hashSet = this.L;
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z16 = N;
                            if (!Arrays.equals((byte[]) it.next(), tL_sponsoredPeer2.random_id)) {
                                N = z16;
                            }
                        } else {
                            z16 = N;
                            hashSet.add(tL_sponsoredPeer2.random_id);
                            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
                            tL_messages_viewSponsoredMessage.random_id = tL_sponsoredPeer2.random_id;
                            ConnectionsManager.getInstance(i17).sendRequest(tL_messages_viewSponsoredMessage, null);
                        }
                    }
                    long o10 = o5.o(tL_sponsoredPeer2.peer);
                    if (o10 >= 0) {
                        user2 = vp.r1(i17).Z1(Long.valueOf(o10));
                        if (user2 != null) {
                            ArrayList<TLRPC.TL_username> arrayList8 = user2.usernames;
                            q6 = o5.q(this.b0, user2);
                            arrayList2 = arrayList8;
                            chat3 = null;
                            j10 = dialogId;
                            str = q6;
                            user = user2;
                            arrayList = arrayList2;
                            z10 = z16;
                            chat = chat3;
                        } else {
                            chat2 = null;
                            arrayList2 = null;
                            q6 = null;
                            chat3 = chat2;
                            j10 = dialogId;
                            str = q6;
                            user = user2;
                            arrayList = arrayList2;
                            z10 = z16;
                            chat = chat3;
                        }
                    } else {
                        TLRPC.Chat L0 = vp.r1(i17).L0(Long.valueOf(-o10));
                        if (L0 != null) {
                            ArrayList<TLRPC.TL_username> arrayList9 = L0.usernames;
                            q6 = o5.q(this.b0, L0);
                            arrayList2 = arrayList9;
                            chat3 = L0;
                            user2 = null;
                            j10 = dialogId;
                            str = q6;
                            user = user2;
                            arrayList = arrayList2;
                            z10 = z16;
                            chat = chat3;
                        } else {
                            chat2 = L0;
                            user2 = null;
                            arrayList2 = null;
                            q6 = null;
                            chat3 = chat2;
                            j10 = dialogId;
                            str = q6;
                            user = user2;
                            arrayList = arrayList2;
                            z10 = z16;
                            chat = chat3;
                        }
                    }
                    if (arrayList6.isEmpty()) {
                        z11 = true;
                    } else {
                        z11 = true;
                        i15 = sc.e.e(1, i15, arrayList6);
                    }
                    if (O()) {
                        if (i15 < J()) {
                            k6Var.M = i15 != J() + (-1);
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        i15 -= J();
                    } else {
                        z12 = false;
                    }
                    if (arrayList7.isEmpty()) {
                        str2 = str;
                    } else {
                        str2 = str;
                        i15 = sc.e.e(1, i15, arrayList7);
                    }
                    ArrayList arrayList10 = tVar.e;
                    int i19 = i15;
                    ArrayList arrayList11 = tVar.j;
                    int size3 = this.s.size();
                    int size4 = tVar.d.size();
                    i11 = (size3 + size4 > 0 || (J() <= 0 && arrayList7.isEmpty() && arrayList6.isEmpty())) ? i19 : i19 - 1;
                    size = arrayList11.size();
                    if (size > 3 && this.H0) {
                        size = 3;
                    }
                    int i20 = (size > 0 || !(arrayList11.get(size + (-1)) instanceof String)) ? size : size - 2;
                    size2 = arrayList10.size();
                    int i21 = i20;
                    if (size2 > 3 && this.G0) {
                        size2 = 3;
                    }
                    int size5 = (arrayList10.isEmpty() || !arrayList5.isEmpty()) ? arrayList5.size() + size2 + 1 : 0;
                    if (!z12) {
                        k6Var.M = (i11 == (b() - J()) + (-1) || i11 == ((size3 + i21) + size4) + (-1) || i11 == (((size3 + size5) + size) + size4) + (-1)) ? false : true;
                    }
                    if (i11 >= 0 || i11 >= this.s.size() || user != null) {
                        charSequence = null;
                    } else {
                        charSequence = (CharSequence) this.G.get(i11);
                        String n10 = h20.n(user);
                        if (charSequence == null || user == null || n10 == null || !charSequence.toString().startsWith("@".concat(n10))) {
                            charSequence2 = charSequence;
                            charSequence = null;
                            if (charSequence == null) {
                                String str9 = z12 ? this.w0 : tVar.c;
                                if (!TextUtils.isEmpty(str9)) {
                                    String m10 = user != null ? i5.m(0, user.first_name, user.last_name) : r82 != 0 ? r82.monoforum ? gg.e.i(i17, r82, false) : r82.title : null;
                                    if (m10 == null || (A12 = org.telegram.messenger.i0.A1(m10, str9)) == -1) {
                                        charSequence3 = charSequence;
                                        charSequence2 = charSequence2;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10);
                                        charSequence3 = charSequence;
                                        spannableStringBuilder2.setSpan(new l00(t6.q6, null), A12, str9.length() + A12, 33);
                                        charSequence2 = spannableStringBuilder2;
                                    }
                                    if (arrayList != null && arrayList.size() > 1) {
                                        String substring = str9.startsWith("@") ? str9.substring(1) : str9;
                                        int size6 = arrayList.size();
                                        int i22 = 0;
                                        while (true) {
                                            if (i22 < size6) {
                                                TLRPC.TL_username tL_username = arrayList.get(i22);
                                                i22++;
                                                TLRPC.TL_username tL_username2 = tL_username;
                                                obj = I;
                                                if (tL_username2.active && tL_username2.username.startsWith(substring)) {
                                                    str4 = tL_username2.username;
                                                } else {
                                                    I = obj;
                                                }
                                            } else {
                                                obj = I;
                                                str4 = null;
                                            }
                                        }
                                        if (str4 == null) {
                                            int size7 = arrayList.size();
                                            int i23 = 0;
                                            while (true) {
                                                if (i23 < size7) {
                                                    TLRPC.TL_username tL_username3 = arrayList.get(i23);
                                                    i23++;
                                                    TLRPC.TL_username tL_username4 = tL_username3;
                                                    ArrayList<TLRPC.TL_username> arrayList12 = arrayList;
                                                    if (tL_username4.active && tL_username4.username.contains(substring)) {
                                                        str4 = tL_username4.username;
                                                    } else {
                                                        arrayList = arrayList12;
                                                    }
                                                }
                                            }
                                        }
                                        if (str4 != null) {
                                            str3 = str4;
                                            if (str3 != null && (user == null || z10)) {
                                                if (str9.startsWith("@")) {
                                                    str9 = str9.substring(1);
                                                }
                                                try {
                                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                    spannableStringBuilder3.append((CharSequence) "@");
                                                    spannableStringBuilder3.append((CharSequence) str3);
                                                    A1 = org.telegram.messenger.i0.A1(str3, str9);
                                                    if (A1 != -1) {
                                                        int length = str9.length();
                                                        if (A1 == 0) {
                                                            length++;
                                                        } else {
                                                            A1++;
                                                        }
                                                        spannableStringBuilder3.setSpan(new l00(t6.q6, null), A1, length + A1, 33);
                                                    }
                                                    charSequence3 = spannableStringBuilder3;
                                                } catch (Exception e) {
                                                    f8.g(e, true);
                                                    charSequence3 = str3;
                                                }
                                            }
                                            k6Var.y(false, false);
                                            if (user == null && user.id == this.l0 && this.h0 != 16) {
                                                tL_sponsoredPeer = null;
                                                charSequence4 = null;
                                                z13 = true;
                                                charSequence5 = cd.L0(2131745918, null);
                                            } else {
                                                tL_sponsoredPeer = null;
                                                charSequence4 = charSequence3;
                                                z13 = false;
                                                charSequence5 = charSequence2;
                                            }
                                            CharSequence charSequence7 = charSequence5;
                                            if (r82 != 0 || r82.participants_count == 0) {
                                                if (user != null && user.bot && (i12 = user.bot_active_users) != 0) {
                                                    String H = cd.H(' ', "BotUsersShort", i12);
                                                    if (!(charSequence4 instanceof SpannableStringBuilder)) {
                                                        ((SpannableStringBuilder) charSequence4).append((CharSequence) ", ").append((CharSequence) H);
                                                    } else if (TextUtils.isEmpty(charSequence4)) {
                                                        z14 = true;
                                                        z15 = false;
                                                        charSequence6 = H;
                                                    } else {
                                                        z15 = false;
                                                        z14 = true;
                                                        charSequence4 = TextUtils.concat(charSequence4, ", ", H);
                                                        charSequence6 = charSequence4;
                                                    }
                                                }
                                                z14 = true;
                                                z15 = false;
                                                charSequence6 = charSequence4;
                                            } else {
                                                String H2 = (!w3.T(r82) || r82.megagroup) ? cd.H(' ', "Members", r82.participants_count) : cd.H(' ', "Subscribers", r82.participants_count);
                                                if (charSequence4 instanceof SpannableStringBuilder) {
                                                    ((SpannableStringBuilder) charSequence4).append((CharSequence) ", ").append((CharSequence) H2);
                                                } else {
                                                    charSequence4 = !TextUtils.isEmpty(charSequence4) ? TextUtils.concat(charSequence4, ", ", H2) : H2;
                                                }
                                                charSequence6 = charSequence4;
                                                z14 = true;
                                                z15 = false;
                                            }
                                            m6 m6Var = new m6(this, 5);
                                            k6Var.B0 = z12;
                                            k6Var.C0 = m6Var;
                                            k6Var.setOnSponsoredOptionsClick(new xh.n1(this, 4));
                                            if (z18) {
                                                tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                                            }
                                            k6Var.setAd(tL_sponsoredPeer);
                                            k6Var.z(user == null ? user : r82, encryptedChat, charSequence7, charSequence6, true, z13);
                                            k6Var.y(this.U.a.I2.contains(Long.valueOf(k6Var.getDialogId())), j10 != k6Var.getDialogId() ? z14 : z15);
                                            break;
                                        }
                                    } else {
                                        obj = I;
                                    }
                                    str3 = str2;
                                    if (str3 != null) {
                                        if (str9.startsWith("@")) {
                                        }
                                        SpannableStringBuilder spannableStringBuilder32 = new SpannableStringBuilder();
                                        spannableStringBuilder32.append((CharSequence) "@");
                                        spannableStringBuilder32.append((CharSequence) str3);
                                        A1 = org.telegram.messenger.i0.A1(str3, str9);
                                        if (A1 != -1) {
                                        }
                                        charSequence3 = spannableStringBuilder32;
                                    }
                                    k6Var.y(false, false);
                                    if (user == null) {
                                    }
                                    tL_sponsoredPeer = null;
                                    charSequence4 = charSequence3;
                                    z13 = false;
                                    charSequence5 = charSequence2;
                                    CharSequence charSequence72 = charSequence5;
                                    if (r82 != 0) {
                                    }
                                    if (user != null) {
                                        String H3 = cd.H(' ', "BotUsersShort", i12);
                                        if (!(charSequence4 instanceof SpannableStringBuilder)) {
                                        }
                                    }
                                    z14 = true;
                                    z15 = false;
                                    charSequence6 = charSequence4;
                                    m6 m6Var2 = new m6(this, 5);
                                    k6Var.B0 = z12;
                                    k6Var.C0 = m6Var2;
                                    k6Var.setOnSponsoredOptionsClick(new xh.n1(this, 4));
                                    if (z18) {
                                    }
                                    k6Var.setAd(tL_sponsoredPeer);
                                    k6Var.z(user == null ? user : r82, encryptedChat, charSequence72, charSequence6, true, z13);
                                    k6Var.y(this.U.a.I2.contains(Long.valueOf(k6Var.getDialogId())), j10 != k6Var.getDialogId() ? z14 : z15);
                                }
                            }
                            charSequence3 = charSequence;
                            obj = I;
                            k6Var.y(false, false);
                            if (user == null) {
                            }
                            tL_sponsoredPeer = null;
                            charSequence4 = charSequence3;
                            z13 = false;
                            charSequence5 = charSequence2;
                            CharSequence charSequence722 = charSequence5;
                            if (r82 != 0) {
                            }
                            if (user != null) {
                            }
                            z14 = true;
                            z15 = false;
                            charSequence6 = charSequence4;
                            m6 m6Var22 = new m6(this, 5);
                            k6Var.B0 = z12;
                            k6Var.C0 = m6Var22;
                            k6Var.setOnSponsoredOptionsClick(new xh.n1(this, 4));
                            if (z18) {
                            }
                            k6Var.setAd(tL_sponsoredPeer);
                            k6Var.z(user == null ? user : r82, encryptedChat, charSequence722, charSequence6, true, z13);
                            k6Var.y(this.U.a.I2.contains(Long.valueOf(k6Var.getDialogId())), j10 != k6Var.getDialogId() ? z14 : z15);
                        }
                    }
                    charSequence2 = null;
                    if (charSequence == null) {
                    }
                    charSequence3 = charSequence;
                    obj = I;
                    k6Var.y(false, false);
                    if (user == null) {
                    }
                    tL_sponsoredPeer = null;
                    charSequence4 = charSequence3;
                    z13 = false;
                    charSequence5 = charSequence2;
                    CharSequence charSequence7222 = charSequence5;
                    if (r82 != 0) {
                    }
                    if (user != null) {
                    }
                    z14 = true;
                    z15 = false;
                    charSequence6 = charSequence4;
                    m6 m6Var222 = new m6(this, 5);
                    k6Var.B0 = z12;
                    k6Var.C0 = m6Var222;
                    k6Var.setOnSponsoredOptionsClick(new xh.n1(this, 4));
                    if (z18) {
                    }
                    k6Var.setAd(tL_sponsoredPeer);
                    k6Var.z(user == null ? user : r82, encryptedChat, charSequence7222, charSequence6, true, z13);
                    k6Var.y(this.U.a.I2.contains(Long.valueOf(k6Var.getDialogId())), j10 != k6Var.getDialogId() ? z14 : z15);
                } else {
                    if (I instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) I;
                        ArrayList<TLRPC.TL_username> arrayList13 = user3.usernames;
                        j10 = dialogId;
                        str = o5.q(this.b0, user3);
                        z10 = N;
                        encryptedChat = null;
                        user = user3;
                        arrayList = arrayList13;
                        r82 = 0;
                    } else if (I instanceof TLRPC.Chat) {
                        TLRPC.Chat chat4 = (TLRPC.Chat) I;
                        j10 = dialogId;
                        TLRPC.Chat L02 = vp.r1(i17).L0(Long.valueOf(chat4.id));
                        TLRPC.Chat chat5 = L02 == null ? chat4 : L02;
                        arrayList = chat5.usernames;
                        str = o5.q(this.b0, chat5);
                        chat = chat5;
                        z10 = N;
                        user = null;
                    } else {
                        j10 = dialogId;
                        if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.EncryptedChat Z0 = vp.r1(i17).Z0(Integer.valueOf(((TLRPC.EncryptedChat) I).id));
                            z10 = N;
                            str = null;
                            r82 = 0;
                            encryptedChat = Z0;
                            user = vp.r1(i17).Z1(Long.valueOf(Z0.user_id));
                            arrayList = null;
                        } else {
                            z10 = N;
                            arrayList = null;
                            user = null;
                            str = null;
                            chat = null;
                        }
                    }
                    if (arrayList6.isEmpty()) {
                    }
                    if (O()) {
                    }
                    if (arrayList7.isEmpty()) {
                    }
                    ArrayList arrayList102 = tVar.e;
                    int i192 = i15;
                    ArrayList arrayList112 = tVar.j;
                    int size32 = this.s.size();
                    int size42 = tVar.d.size();
                    if (size32 + size42 > 0) {
                    }
                    size = arrayList112.size();
                    if (size > 3) {
                        size = 3;
                    }
                    if (size > 0) {
                    }
                    size2 = arrayList102.size();
                    int i212 = i20;
                    if (size2 > 3) {
                        size2 = 3;
                    }
                    if (arrayList102.isEmpty()) {
                    }
                    if (!z12) {
                    }
                    if (i11 >= 0) {
                    }
                    charSequence = null;
                    charSequence2 = null;
                    if (charSequence == null) {
                    }
                    charSequence3 = charSequence;
                    obj = I;
                    k6Var.y(false, false);
                    if (user == null) {
                    }
                    tL_sponsoredPeer = null;
                    charSequence4 = charSequence3;
                    z13 = false;
                    charSequence5 = charSequence2;
                    CharSequence charSequence72222 = charSequence5;
                    if (r82 != 0) {
                    }
                    if (user != null) {
                    }
                    z14 = true;
                    z15 = false;
                    charSequence6 = charSequence4;
                    m6 m6Var2222 = new m6(this, 5);
                    k6Var.B0 = z12;
                    k6Var.C0 = m6Var2222;
                    k6Var.setOnSponsoredOptionsClick(new xh.n1(this, 4));
                    if (z18) {
                    }
                    k6Var.setAd(tL_sponsoredPeer);
                    k6Var.z(user == null ? user : r82, encryptedChat, charSequence72222, charSequence6, true, z13);
                    k6Var.y(this.U.a.I2.contains(Long.valueOf(k6Var.getDialogId())), j10 != k6Var.getDialogId() ? z14 : z15);
                }
                encryptedChat = null;
                r82 = chat;
                if (arrayList6.isEmpty()) {
                }
                if (O()) {
                }
                if (arrayList7.isEmpty()) {
                }
                ArrayList arrayList1022 = tVar.e;
                int i1922 = i15;
                ArrayList arrayList1122 = tVar.j;
                int size322 = this.s.size();
                int size422 = tVar.d.size();
                if (size322 + size422 > 0) {
                }
                size = arrayList1122.size();
                if (size > 3) {
                }
                if (size > 0) {
                }
                size2 = arrayList1022.size();
                int i2122 = i20;
                if (size2 > 3) {
                }
                if (arrayList1022.isEmpty()) {
                }
                if (!z12) {
                }
                if (i11 >= 0) {
                }
                charSequence = null;
                charSequence2 = null;
                if (charSequence == null) {
                }
                charSequence3 = charSequence;
                obj = I;
                k6Var.y(false, false);
                if (user == null) {
                }
                tL_sponsoredPeer = null;
                charSequence4 = charSequence3;
                z13 = false;
                charSequence5 = charSequence2;
                CharSequence charSequence722222 = charSequence5;
                if (r82 != 0) {
                }
                if (user != null) {
                }
                z14 = true;
                z15 = false;
                charSequence6 = charSequence4;
                m6 m6Var22222 = new m6(this, 5);
                k6Var.B0 = z12;
                k6Var.C0 = m6Var22222;
                k6Var.setOnSponsoredOptionsClick(new xh.n1(this, 4));
                if (z18) {
                }
                k6Var.setAd(tL_sponsoredPeer);
                k6Var.z(user == null ? user : r82, encryptedChat, charSequence722222, charSequence6, true, z13);
                k6Var.y(this.U.a.I2.contains(Long.valueOf(k6Var.getDialogId())), j10 != k6Var.getDialogId() ? z14 : z15);
                break;
            case 1:
                final z3 z3Var2 = (z3) view;
                if (!arrayList4.isEmpty()) {
                    String L03 = cd.L0(2131749350, null);
                    String L04 = cd.L0(2131752099, null);
                    final int i24 = r6 ? 1 : 0;
                    z3Var2.b(L03, L04, new View.OnClickListener(this) { // from class: zf.o
                        public final /* synthetic */ z b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i24) {
                                case 0:
                                    mx mxVar = this.b.U;
                                    if (mxVar != null) {
                                        mxVar.b();
                                        break;
                                    }
                                    break;
                                case 1:
                                    kx kxVar = ((zm0) this.b).K0;
                                    xm0 xm0Var = kxVar.x0;
                                    zm0 zm0Var = kxVar.d0;
                                    String str10 = zm0Var.D;
                                    ArrayList arrayList14 = zm0Var.y;
                                    int i25 = zm0Var.x;
                                    int i26 = zm0Var.w;
                                    ArrayList arrayList15 = xm0Var.Q;
                                    if (!TextUtils.equals(str10, xm0Var.a0)) {
                                        xm0Var.W();
                                        arrayList15.clear();
                                        arrayList15.addAll(arrayList14);
                                        xm0Var.Y = i26;
                                        xm0Var.X = i26 > arrayList14.size();
                                        xm0Var.b0 = i25;
                                        xm0Var.a0 = str10;
                                        xm0Var.O(true);
                                    }
                                    kxVar.s0 = true;
                                    kxVar.v0.h1(0, 0);
                                    kxVar.S();
                                    m71 m71Var = kxVar.M;
                                    if (m71Var != null && m71Var.getCurrentTabId() != 1) {
                                        kxVar.M.d(1, 1);
                                    }
                                    xm0Var.Z(kxVar.M0);
                                    break;
                                case 2:
                                    mx mxVar2 = this.b.U;
                                    if (mxVar2 != null) {
                                        mxVar2.b();
                                        break;
                                    }
                                    break;
                                default:
                                    mx mxVar3 = this.b.U;
                                    if (mxVar3 != null) {
                                        mxVar3.b();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    if (arrayList6.isEmpty()) {
                        i13 = i15;
                    } else if (i15 == 0) {
                        z3Var2.b(cd.L0(2131746599, null), org.telegram.messenger.i0.H2(cd.L0(2131746601, null), false, org.telegram.messenger.i0.L(-2.0f), org.telegram.messenger.i0.L(1.0f)), new View.OnClickListener(this) { // from class: zf.o
                            public final /* synthetic */ z b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i18) {
                                    case 0:
                                        mx mxVar = this.b.U;
                                        if (mxVar != null) {
                                            mxVar.b();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        kx kxVar = ((zm0) this.b).K0;
                                        xm0 xm0Var = kxVar.x0;
                                        zm0 zm0Var = kxVar.d0;
                                        String str10 = zm0Var.D;
                                        ArrayList arrayList14 = zm0Var.y;
                                        int i25 = zm0Var.x;
                                        int i26 = zm0Var.w;
                                        ArrayList arrayList15 = xm0Var.Q;
                                        if (!TextUtils.equals(str10, xm0Var.a0)) {
                                            xm0Var.W();
                                            arrayList15.clear();
                                            arrayList15.addAll(arrayList14);
                                            xm0Var.Y = i26;
                                            xm0Var.X = i26 > arrayList14.size();
                                            xm0Var.b0 = i25;
                                            xm0Var.a0 = str10;
                                            xm0Var.O(true);
                                        }
                                        kxVar.s0 = true;
                                        kxVar.v0.h1(0, 0);
                                        kxVar.S();
                                        m71 m71Var = kxVar.M;
                                        if (m71Var != null && m71Var.getCurrentTabId() != 1) {
                                            kxVar.M.d(1, 1);
                                        }
                                        xm0Var.Z(kxVar.M0);
                                        break;
                                    case 2:
                                        mx mxVar2 = this.b.U;
                                        if (mxVar2 != null) {
                                            mxVar2.b();
                                            break;
                                        }
                                        break;
                                    default:
                                        mx mxVar3 = this.b.U;
                                        if (mxVar3 != null) {
                                            mxVar3.b();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        i13 = sc.e.e(1, i15, arrayList6);
                    }
                    ArrayList arrayList14 = tVar.e;
                    ArrayList arrayList15 = tVar.j;
                    boolean O = O();
                    ArrayList arrayList16 = this.E;
                    if (O || !arrayList7.isEmpty() || !arrayList16.isEmpty() || !arrayList6.isEmpty()) {
                        ?? L = L();
                        if (i13 >= L) {
                            if (i13 != L || !O()) {
                                if (i13 == J() + (arrayList7.isEmpty() ? 0 : arrayList7.size() + 1) + (arrayList16.isEmpty() ? 0 : arrayList16.size() + 1) && !this.s.isEmpty()) {
                                    z3Var2.setText(cd.L0(2131745840, null));
                                    break;
                                } else {
                                    i13 -= J();
                                }
                            } else if (!this.N) {
                                final int i25 = 2;
                                z3Var2.b(cd.L0(2131746385, null), cd.L0(2131752099, null), new View.OnClickListener(this) { // from class: zf.o
                                    public final /* synthetic */ z b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i25) {
                                            case 0:
                                                mx mxVar = this.b.U;
                                                if (mxVar != null) {
                                                    mxVar.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                kx kxVar = ((zm0) this.b).K0;
                                                xm0 xm0Var = kxVar.x0;
                                                zm0 zm0Var = kxVar.d0;
                                                String str10 = zm0Var.D;
                                                ArrayList arrayList142 = zm0Var.y;
                                                int i252 = zm0Var.x;
                                                int i26 = zm0Var.w;
                                                ArrayList arrayList152 = xm0Var.Q;
                                                if (!TextUtils.equals(str10, xm0Var.a0)) {
                                                    xm0Var.W();
                                                    arrayList152.clear();
                                                    arrayList152.addAll(arrayList142);
                                                    xm0Var.Y = i26;
                                                    xm0Var.X = i26 > arrayList142.size();
                                                    xm0Var.b0 = i252;
                                                    xm0Var.a0 = str10;
                                                    xm0Var.O(true);
                                                }
                                                kxVar.s0 = true;
                                                kxVar.v0.h1(0, 0);
                                                kxVar.S();
                                                m71 m71Var = kxVar.M;
                                                if (m71Var != null && m71Var.getCurrentTabId() != 1) {
                                                    kxVar.M.d(1, 1);
                                                }
                                                xm0Var.Z(kxVar.M0);
                                                break;
                                            case 2:
                                                mx mxVar2 = this.b.U;
                                                if (mxVar2 != null) {
                                                    mxVar2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                mx mxVar3 = this.b.U;
                                                if (mxVar3 != null) {
                                                    mxVar3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            } else {
                                final int i26 = 3;
                                z3Var2.b(cd.L0(2131746385, null), cd.L0(2131752101, null), new View.OnClickListener(this) { // from class: zf.o
                                    public final /* synthetic */ z b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i26) {
                                            case 0:
                                                mx mxVar = this.b.U;
                                                if (mxVar != null) {
                                                    mxVar.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                kx kxVar = ((zm0) this.b).K0;
                                                xm0 xm0Var = kxVar.x0;
                                                zm0 zm0Var = kxVar.d0;
                                                String str10 = zm0Var.D;
                                                ArrayList arrayList142 = zm0Var.y;
                                                int i252 = zm0Var.x;
                                                int i262 = zm0Var.w;
                                                ArrayList arrayList152 = xm0Var.Q;
                                                if (!TextUtils.equals(str10, xm0Var.a0)) {
                                                    xm0Var.W();
                                                    arrayList152.clear();
                                                    arrayList152.addAll(arrayList142);
                                                    xm0Var.Y = i262;
                                                    xm0Var.X = i262 > arrayList142.size();
                                                    xm0Var.b0 = i252;
                                                    xm0Var.a0 = str10;
                                                    xm0Var.O(true);
                                                }
                                                kxVar.s0 = true;
                                                kxVar.v0.h1(0, 0);
                                                kxVar.S();
                                                m71 m71Var = kxVar.M;
                                                if (m71Var != null && m71Var.getCurrentTabId() != 1) {
                                                    kxVar.M.d(1, 1);
                                                }
                                                xm0Var.Z(kxVar.M0);
                                                break;
                                            case 2:
                                                mx mxVar2 = this.b.U;
                                                if (mxVar2 != null) {
                                                    mxVar2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                mx mxVar3 = this.b.U;
                                                if (mxVar3 != null) {
                                                    mxVar3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        } else {
                            z3Var2.setText(cd.L0(2131752237, null));
                            break;
                        }
                    }
                    int size8 = this.s.size();
                    int size9 = tVar.d.size();
                    int size10 = arrayList15.size();
                    if (size10 > 3 && this.H0) {
                        size10 = 3;
                    }
                    int size11 = arrayList14.size();
                    if (size11 > 3 && this.G0) {
                        size11 = 3;
                    }
                    int size12 = (arrayList14.isEmpty() && arrayList5.isEmpty()) ? 0 : arrayList5.size() + size11 + 1;
                    int size13 = arrayList3.isEmpty() ? 0 : arrayList3.size() + 1;
                    ArrayList arrayList17 = this.I;
                    if (!arrayList17.isEmpty()) {
                        arrayList17.size();
                    }
                    int i27 = size13;
                    if (this.c != w.d || this.d) {
                        arrayList17.isEmpty();
                    }
                    if (arrayList7.isEmpty()) {
                        i14 = 1;
                        str5 = null;
                        str6 = null;
                    } else {
                        if (i13 == 0) {
                            str5 = null;
                            str8 = cd.L0(2131744019, null);
                        } else {
                            str5 = null;
                            str8 = null;
                        }
                        i14 = 1;
                        i13 = sc.e.e(1, i13, arrayList7);
                        str6 = str8;
                    }
                    if (!arrayList16.isEmpty()) {
                        if (i13 == 0) {
                            str6 = cd.L0(2131749117, str5);
                        }
                        i13 = sc.e.e(i14, i13, arrayList16);
                    }
                    if (str6 == null) {
                        int i28 = i13 - (size8 + size9);
                        if (i28 < 0 || i28 >= size10) {
                            int i29 = i28 - size10;
                            if (i29 < 0 || i29 >= size12) {
                                z3Var = z3Var2;
                                r83 = null;
                                if (this.U == null || i27 <= 0 || i29 - size12 > 1) {
                                    this.F0 = i29;
                                    SpannableStringBuilder H4 = H(this.c);
                                    final int i30 = 1;
                                    Object obj3 = new Runnable(this) { // from class: zf.p
                                        public final /* synthetic */ z b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i31 = i30;
                                            z3 z3Var3 = z3Var;
                                            z zVar = this.b;
                                            switch (i31) {
                                                case 0:
                                                    boolean z19 = zVar.H0;
                                                    zVar.H0 = !z19;
                                                    z3Var3.setRightText(cd.L0(!z19 ? 2131745357 : 2131745358, null));
                                                    zVar.f();
                                                    break;
                                                default:
                                                    z60 H5 = z60.H(zVar.r0, z3Var3);
                                                    w[] values = w.values();
                                                    int length2 = values.length;
                                                    int i32 = 0;
                                                    while (true) {
                                                        boolean z20 = true;
                                                        if (i32 >= length2) {
                                                            H5.V(5);
                                                            H5.Y = true;
                                                            H5.t = false;
                                                            H5.s = 0;
                                                            H5.Z();
                                                            break;
                                                        } else {
                                                            w wVar = values[i32];
                                                            if (wVar.a != zVar.c.a) {
                                                                z20 = false;
                                                            }
                                                            H5.i(new kp(zVar, z20, z3Var3, wVar), cd.L0(wVar.b, null), z20);
                                                            i32++;
                                                        }
                                                    }
                                            }
                                        }
                                    };
                                    str6 = cd.L0(2131745773, null);
                                    spannableStringBuilder = H4;
                                    obj2 = obj3;
                                    z17 = false;
                                    r02 = obj2;
                                } else {
                                    TLRPC.Chat L05 = vp.r1(i17).L0(Long.valueOf(-this.U.a()));
                                    if (L05 == null) {
                                        str7 = "null";
                                        c10 = 0;
                                    } else if (L05.monoforum) {
                                        c10 = 0;
                                        str7 = gg.e.i(i17, L05, false);
                                    } else {
                                        c10 = 0;
                                        str7 = L05.title;
                                    }
                                    Object[] objArr = new Object[1];
                                    objArr[c10] = str7;
                                    str6 = cd.a0(null, null, 2131745761, objArr);
                                }
                            } else {
                                r83 = null;
                                str6 = cd.L0(2131749544, null);
                                if (tVar.e.size() > 3) {
                                    z17 = this.G0;
                                    z3Var = z3Var2;
                                    spannableStringBuilder = null;
                                    r02 = new c11(this, arrayList14, i10, z3Var, 23);
                                } else {
                                    z3Var = z3Var2;
                                }
                            }
                        } else {
                            str6 = cd.L0(2131747299, null);
                            if (arrayList15.size() > 3) {
                                boolean z19 = this.H0;
                                final int i31 = 0;
                                Runnable runnable2 = new Runnable(this) { // from class: zf.p
                                    public final /* synthetic */ z b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i312 = i31;
                                        z3 z3Var3 = z3Var2;
                                        z zVar = this.b;
                                        switch (i312) {
                                            case 0:
                                                boolean z192 = zVar.H0;
                                                zVar.H0 = !z192;
                                                z3Var3.setRightText(cd.L0(!z192 ? 2131745357 : 2131745358, null));
                                                zVar.f();
                                                break;
                                            default:
                                                z60 H5 = z60.H(zVar.r0, z3Var3);
                                                w[] values = w.values();
                                                int length2 = values.length;
                                                int i32 = 0;
                                                while (true) {
                                                    boolean z20 = true;
                                                    if (i32 >= length2) {
                                                        H5.V(5);
                                                        H5.Y = true;
                                                        H5.t = false;
                                                        H5.s = 0;
                                                        H5.Z();
                                                        break;
                                                    } else {
                                                        w wVar = values[i32];
                                                        if (wVar.a != zVar.c.a) {
                                                            z20 = false;
                                                        }
                                                        H5.i(new kp(zVar, z20, z3Var3, wVar), cd.L0(wVar.b, null), z20);
                                                        i32++;
                                                    }
                                                }
                                        }
                                    }
                                };
                                z3Var = z3Var2;
                                z17 = z19;
                                runnable = runnable2;
                                spannableStringBuilder = null;
                            } else {
                                z3Var = z3Var2;
                                runnable = null;
                                spannableStringBuilder = null;
                                z17 = false;
                            }
                            r83 = null;
                            r02 = runnable;
                        }
                        if (r02 == 0) {
                            if (spannableStringBuilder == null) {
                                z3Var.b(str6, cd.L0(z17 ? 2131745357 : 2131745358, r83), new og.u(5, r02));
                                z3Var.setRightTextMargin(16);
                                break;
                            } else {
                                z3Var.b(str6, spannableStringBuilder, new og.u(6, r02));
                                z3Var.setRightTextMargin(6);
                                break;
                            }
                        } else {
                            z3Var.setText(str6);
                            break;
                        }
                    } else {
                        z3Var = z3Var2;
                        r83 = null;
                    }
                    SpannableStringBuilder spannableStringBuilder4 = r83;
                    spannableStringBuilder = spannableStringBuilder4;
                    obj2 = spannableStringBuilder4;
                    z17 = false;
                    r02 = obj2;
                    if (r02 == 0) {
                    }
                }
                break;
            case 2:
            case 9:
                v2 v2Var = (v2) view;
                a7.i(t6.d6, v2Var, null);
                v2Var.s2 = i15 != b() - 1;
                jj jjVar = (jj) I(i15);
                v2Var.O = arrayList3.contains(jjVar);
                if (jjVar != null) {
                    v2Var.d0(jj.B0(jjVar.k), jjVar, jjVar.k.date, false, false);
                    break;
                } else {
                    v2Var.d0(0L, null, 0, false, false);
                    break;
                }
            case 3:
                ((ja) view).setTopic((TLRPC.TL_forumTopic) I(i15));
                break;
            case 5:
                o4 o4Var = (o4) view;
                a7.i(t6.d6, o4Var, null);
                o4Var.setText((CharSequence) arrayList4.get(i15 - 1));
                o4Var.setNeedDivider(i15 != arrayList4.size());
                break;
            case 6:
                ((u) ((tk0) view).getAdapter()).f();
                break;
            case 7:
                String str10 = (String) I(i15);
                p8 p8Var = (p8) view;
                p8Var.g(-1, t6.o6);
                p8Var.k(cd.a0("AddContactByPhone", null, 2131754452, af.b.c().b("+" + str10)), false);
                break;
            case 8:
                k6 k6Var2 = (k6) view;
                f5 f5Var = (f5) I(i15);
                k6Var2.z(f5Var, null, i5.m(0, f5Var.i, f5Var.j), m5.h(new StringBuilder("+"), (String) f5Var.g.get(0), af.b.c()), false, false);
                break;
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        int i11 = 25;
        int i12 = this.h0;
        int i13 = 1;
        p6 p6Var = null;
        Context context = this.e;
        switch (i10) {
            case 0:
                k6 k6Var = new k6(context, null);
                k6Var.l0 = i12 == 3;
                view = k6Var;
                break;
            case 1:
                view = new z3(context, null);
                break;
            case 2:
            case 9:
                view = new kt0(2, context, true ? 1 : 0);
                break;
            case 3:
                view = new ja(context);
                break;
            case 4:
                zz zzVar = new zz(context, null);
                zzVar.setViewType(1);
                zzVar.setIsSingleCell(true);
                view = zzVar;
                break;
            case 5:
                o4 o4Var = new o4(context);
                o4Var.setGravity(16);
                o4Var.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
                o4Var.setTextSize(1, 17.0f);
                a7.V(o4Var, t6.G6, null);
                view = o4Var;
                break;
            case 6:
                w71 w71Var = new w71(13, context, p6Var);
                a7.m(w71Var, 20, t6.i6, null);
                w71Var.setTag(9);
                w71Var.setItemAnimator(null);
                w71Var.setLayoutAnimation(null);
                dh.f fVar = new dh.f(20);
                fVar.j1(0);
                w71Var.setLayoutManager(fVar);
                w71Var.setAdapter(new u(this.s0, this.e, null, false, i12 == 3));
                w71Var.setOnItemClickListener(new ag.y0(this, i11));
                w71Var.setOnItemLongClickListener(new q(this));
                this.k0 = w71Var;
                view = w71Var;
                break;
            case 7:
            default:
                view = new p8(16, context, false);
                break;
            case 8:
                view = new k6(context, null);
                break;
            case 10:
                r rVar = new r(this, i13);
                u71 u71Var = new u71(context, 25);
                u71Var.setOrientation(1);
                g9 g9Var = new g9(context);
                g9Var.setImageDrawable(new bi0(R.raw.utyan_empty, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f)));
                u71Var.addView(g9Var, b6.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 17.0f);
                int i14 = t6.G6;
                a7.V(textView, i14, null);
                textView.setTypeface(org.telegram.messenger.i0.o());
                textView.setText(cd.L0(2131745766, null));
                textView.setGravity(17);
                u71Var.addView(textView, b6.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView2 = new TextView(context);
                u71Var.b = textView2;
                textView2.setTextSize(1, 14.0f);
                a7.V(textView2, i14, null);
                textView2.setText(cd.a0(null, null, 2131745767, ""));
                textView2.setGravity(17);
                u71Var.addView(textView2, b6.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView3 = new TextView(context);
                textView3.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f));
                sc.e.u(textView3, 1, 14.0f, null, 2131745768);
                int i15 = t6.Ci;
                a7.V(textView3, i15, null);
                int r12 = t6.r1(0.15f, t6.v0(i15));
                org.telegram.ui.Cells.y k02 = t6.k0(6, 6, 6, 6, 0, r12, r12);
                w6 L = a7.L(0.15f, i15);
                textView3.setBackground(k02);
                a7.k(textView3, k02, null, L, null);
                textView3.setOnClickListener(new f(rVar, true ? 1 : 0));
                u71Var.addView(textView3, b6.t(-2, -2, 1, 0, 0, 0, 38));
                this.E0 = u71Var;
                textView2.setText(cd.a0(null, null, 2131745767, this.Z));
                view = u71Var;
                break;
        }
        if (i10 == 5) {
            view.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(86.0f)));
        } else {
            view.setLayoutParams(new s4.o0(-1, -2));
        }
        return new ck0(view);
    }
}
