package zf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.i5;
import org.telegram.messenger.o5;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.v2;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.xo;
import org.telegram.messenger.z20;
import org.telegram.messenger.zo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.a3;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.d3;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Cells.g7;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.s6;
import org.telegram.ui.Cells.w2;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.l6;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.zz;
import org.telegram.ui.ay;
import org.telegram.ui.dg0;
import org.telegram.ui.gw;
import org.telegram.ui.vx;
import org.telegram.ui.wx;
import org.telegram.ui.zx;
import th.e5;
import th.n5;
import vh.m6;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class m extends sk0 implements r2 {
    public boolean D;
    public boolean E;
    public final int F;
    public boolean G;
    public boolean H;
    public long I;
    public boolean J;
    public tk0 K;
    public mh0 L;
    public Drawable O;
    public final j P;
    public boolean Q;
    public final ay R;
    public boolean S;
    public final TLRPC.RequestPeerType T;
    public boolean U;
    public final long V;
    public boolean Z;
    public final Context c;
    public ArrayList d;
    public boolean e;
    public int f;
    public int h;
    public boolean n;
    public final int r;
    public long s;
    public int w;
    public final boolean x;
    public final ArrayList y;
    public ArrayList M = new ArrayList();
    public ArrayList N = new ArrayList();
    public int W = 10;
    public final LongSparseIntArray X = new LongSparseIntArray();
    public final HashMap Y = new HashMap();
    public int a0 = -1;

    static {
        boolean z10 = v2.a;
    }

    public m(ay ayVar, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType) {
        this.c = context;
        this.R = ayVar;
        this.h = i10;
        this.r = i11;
        this.x = z10;
        this.D = i11 == 0 && i10 == 0 && !z10;
        this.y = arrayList;
        this.F = i12;
        this.V = ayVar.Y2;
        if (i11 == 0) {
            j jVar = new j();
            jVar.a = new HashSet();
            jVar.b = new HashSet();
            jVar.c = new HashSet();
            jVar.d = new ArrayList();
            jVar.e = new r5.a(jVar, 18);
            this.P = jVar;
        }
        this.T = requestPeerType;
    }

    public static void E(View view, Drawable drawable) {
        if (drawable != null) {
            try {
                a7.y(view, drawable, t6.b7, null, PorterDuff.Mode.MULTIPLY);
            } catch (Exception e) {
                f8.g(e, true);
                return;
            }
        }
        int i10 = t6.a7;
        xg.a aVar = new xg.a(29);
        g gVar = new g(0);
        int Q = a7.Q(i10, -1, 0, 0.0f, null);
        gVar.d(Q, view);
        u6 x10 = a7.x(101, view);
        x10.c(i10, -1, 0, 0.0f, null);
        x10.n = aVar;
        x10.o = gVar;
        x10.m = false;
        x10.g = Q;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return (i10 == 1 || i10 == 5 || i10 == 3 || i10 == 8 || i10 == 7 || i10 == 10 || i10 == 11 || i10 == 13 || i10 == 15 || i10 == 16 || i10 == 18 || i10 == 19 || i10 == 20) ? false : true;
    }

    public final int F() {
        int i10 = this.h;
        int i11 = this.r;
        if (i10 == 7 || i10 == 8) {
            return vp.r1(this.F).b2.get(i11) ? 2 : 3;
        }
        if (i11 == 1) {
            return 2;
        }
        return this.d != null ? 1 : 0;
    }

    public final int G(long j10) {
        for (int i10 = 0; i10 < this.M.size(); i10++) {
            if (((k) this.M.get(i10)).c != null && ((k) this.M.get(i10)).c.id == j10) {
                return i10;
            }
        }
        return -1;
    }

    public final int H(int i10) {
        if (this.E) {
            i10--;
        }
        if (this.D) {
            i10 = sc.e.e(2, i10, vp.r1(this.F).s);
        }
        if (this.n && this.h == 3) {
            i10--;
        }
        int i11 = this.h;
        return (i11 == 11 || i11 == 13) ? i10 - 2 : i11 == 12 ? i10 - 1 : i10;
    }

    public final ap I() {
        int i10 = this.h;
        if (i10 == 7 || i10 == 8) {
            return vp.r1(this.F).M[this.h - 7];
        }
        return null;
    }

    public final Object J(int i10) {
        if (i10 >= 0 && i10 < this.M.size()) {
            k kVar = (k) this.M.get(i10);
            String str = kVar.l;
            TLRPC.TL_contact tL_contact = kVar.e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = kVar.m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = kVar.n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = kVar.c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return vp.r1(this.F).Z1(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = kVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void N(boolean z10) {
        this.n = z10;
    }

    public final void O(mh0 mh0Var) {
        this.L = mh0Var;
    }

    public final void P(tk0 tk0Var, boolean z10) {
        this.J = z10;
        for (int i10 = 0; i10 < tk0Var.getChildCount(); i10++) {
            if (tk0Var.getChildAt(i10) instanceof org.telegram.ui.Cells.v2) {
                ((org.telegram.ui.Cells.v2) tk0Var.getChildAt(i10)).f = z10;
            }
        }
        for (int i11 = 0; i11 < tk0Var.getCachedChildCount(); i11++) {
            if (tk0Var.P(i11) instanceof org.telegram.ui.Cells.v2) {
                ((org.telegram.ui.Cells.v2) tk0Var.P(i11)).f = z10;
            }
        }
        for (int i12 = 0; i12 < tk0Var.getHiddenChildCount(); i12++) {
            if (tk0Var.V(i12) instanceof org.telegram.ui.Cells.v2) {
                ((org.telegram.ui.Cells.v2) tk0Var.V(i12)).f = z10;
            }
        }
        for (int i13 = 0; i13 < tk0Var.getAttachedScrapChildCount(); i13++) {
            if (tk0Var.O(i13) instanceof org.telegram.ui.Cells.v2) {
                ((org.telegram.ui.Cells.v2) tk0Var.O(i13)).f = z10;
            }
        }
    }

    public final void Q(boolean z10) {
        this.Q = z10;
    }

    public final void R(long j10) {
        this.s = j10;
    }

    public final void S(wx wxVar) {
        this.K = wxVar;
    }

    public boolean T() {
        return false;
    }

    public final void U(boolean z10) {
        int i10 = this.F;
        if (this.d != null) {
            if (!z10 || SystemClock.elapsedRealtime() - this.I >= 2000) {
                this.I = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                    Collections.sort(this.d, new u20(vp.r1(i10), currentTime, 2));
                    if (z10) {
                        f();
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
        }
    }

    public final void V() {
        this.D = this.r == 0 && this.h == 0 && !this.x && !vp.r1(this.F).s.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04bb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        ArrayList c42;
        long j10;
        boolean z10;
        int i10;
        TLRPC.Dialog dialog;
        boolean z11;
        int i11;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        TLRPC.RequestPeerType requestPeerType;
        int i12;
        int i13;
        boolean z12;
        TLRPC.Dialog dialog2;
        int i14;
        TLRPC.Dialog dialog3;
        String L0;
        ArrayList arrayList;
        long j11 = this.V;
        int i15 = this.F;
        boolean z13 = true;
        if (j11 != 0) {
            this.M.clear();
            V();
            ji.f x10 = vp.r1(i15).x(j11);
            ArrayList arrayList2 = (ArrayList) x10.b;
            int size = arrayList2.size();
            ArrayList arrayList3 = (ArrayList) x10.c;
            int size2 = arrayList3.size() + size;
            ArrayList arrayList4 = (ArrayList) x10.d;
            int size3 = arrayList4.size() + size2;
            ArrayList arrayList5 = (ArrayList) x10.e;
            this.f = arrayList5.size() + size3;
            this.U = false;
            int i16 = this.h == 3 ? 2 : 4;
            for (int i17 = 0; i17 < i16; i17++) {
                if (i17 == 0) {
                    L0 = cd.L0(2131751878, null);
                    arrayList = arrayList2;
                } else if (i17 == 1) {
                    L0 = cd.L0(2131751875, null);
                    arrayList = arrayList3;
                } else if (i17 == 2) {
                    L0 = cd.L0(2131751876, null);
                    arrayList = arrayList4;
                } else {
                    L0 = cd.L0(2131751873, null);
                    arrayList = arrayList5;
                }
                if (!arrayList.isEmpty()) {
                    this.M.add(new k(this, L0));
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        zo zoVar = (zo) arrayList.get(i18);
                        TLRPC.Dialog dialog4 = zoVar.d;
                        if (dialog4 != null) {
                            this.M.add(new k(this, 0, dialog4));
                        } else {
                            TLRPC.Chat chat = zoVar.b;
                            if (chat != null) {
                                this.M.add(new k(this, chat));
                            } else {
                                TLRPC.User user = zoVar.c;
                                if (user != null) {
                                    this.M.add(new k(this, user));
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        this.M.clear();
        V();
        vp r12 = vp.r1(i15);
        int i19 = this.r;
        ay ayVar = this.R;
        if (j11 != 0) {
            c42 = (ArrayList) r12.x.f(j11);
            if (c42 == null) {
                c42 = new ArrayList();
            }
        } else {
            c42 = ayVar.c4(i15, this.h, i19, this.G);
            if (c42 == null) {
                c42 = new ArrayList();
            }
        }
        int size4 = c42.size();
        this.f = size4;
        this.U = false;
        if (size4 == 0 && ayVar.p4()) {
            sc.e.w(this, 19, this.M);
            return;
        }
        if (this.D || this.h != 0 || i19 != 0 || !r12.b2.get(i19) || this.e) {
            j10 = 0;
            z10 = true;
        } else if (r12.D0() > 10 || !i5.r(i15).n || i5.r(i15).e0.isEmpty()) {
            j10 = 0;
            z10 = true;
            this.d = null;
        } else {
            j10 = 0;
            this.d = new ArrayList(i5.r(i15).e0);
            long j12 = d20.i(i15).n;
            int size5 = this.d.size();
            int i20 = 0;
            while (i20 < size5) {
                boolean z14 = z13;
                long j13 = ((TLRPC.TL_contact) this.d.get(i20)).user_id;
                if (j13 == j12 || r12.Q.f(j13) != null) {
                    this.d.remove(i20);
                    i20--;
                    size5--;
                }
                i20++;
                z13 = z14;
            }
            z10 = z13;
            if (this.d.isEmpty()) {
                this.d = null;
            } else {
                U(false);
            }
        }
        ap I = I();
        if ((I == null || I.e()) && ayVar != null && ayVar.N0 && ayVar.P0 != j10) {
            sc.e.w(this, 20, this.M);
            int i21 = 0;
            while (true) {
                if (i21 >= c42.size()) {
                    i10 = i15;
                    dialog = null;
                    break;
                }
                i10 = i15;
                if (((TLRPC.Dialog) c42.get(i21)).id == ayVar.P0) {
                    dialog = (TLRPC.Dialog) c42.get(i21);
                    break;
                } else {
                    i21++;
                    i15 = i10;
                }
            }
            if (dialog == null) {
                dialog = new TLRPC.TL_dialog();
                dialog.id = ayVar.P0;
            }
            this.M.add(new k(this, 0, dialog));
            sc.e.w(this, 20, this.M);
        } else {
            i10 = i15;
            if ((I == null || I.e()) && ayVar != null && this.h == 3 && ayVar.Q0 != j10) {
                sc.e.w(this, 20, this.M);
                int i22 = 0;
                while (true) {
                    if (i22 >= c42.size()) {
                        dialog3 = null;
                        break;
                    } else {
                        if (((TLRPC.Dialog) c42.get(i22)).id == ayVar.Q0) {
                            dialog3 = (TLRPC.Dialog) c42.get(i22);
                            break;
                        }
                        i22++;
                    }
                }
                if (dialog3 == null) {
                    dialog3 = new TLRPC.TL_dialog();
                    dialog3.id = ayVar.Q0;
                }
                z11 = false;
                this.M.add(new k(this, 0, dialog3));
                sc.e.w(this, 20, this.M);
                this.E = z11;
                i11 = this.h;
                if ((i11 != 7 || i11 == 8) && I != null && I.d()) {
                    r12.H(I.a, false);
                    xo xoVar = (xo) r12.c0.get(I.a);
                    tL_chatlists_chatlistUpdates = xoVar != null ? null : xoVar.c;
                    if (tL_chatlists_chatlistUpdates != null && tL_chatlists_chatlistUpdates.missing_peers.size() > 0) {
                        this.E = z10;
                        this.M.add(new k(this, tL_chatlists_chatlistUpdates));
                    }
                }
                requestPeerType = this.T;
                if (requestPeerType != null) {
                    sc.e.w(this, 15, this.M);
                }
                if (!this.J || this.S) {
                    for (i12 = 0; i12 < c42.size(); i12++) {
                        if (this.h == 2 && (c42.get(i12) instanceof vx)) {
                            this.M.add(new k(this, 14, (TLRPC.Dialog) c42.get(i12)));
                        } else {
                            this.M.add(new k(this, 0, (TLRPC.Dialog) c42.get(i12)));
                        }
                    }
                    sc.e.w(this, 10, this.M);
                }
                if (this.f == 0 && this.e) {
                    this.U = true;
                    if (requestPeerType != null) {
                        sc.e.w(this, 16, this.M);
                    } else {
                        this.M.add(new k(this, F(), 0));
                    }
                    sc.e.w(this, 8, this.M);
                    sc.e.w(this, 7, this.M);
                    sc.e.w(this, 13, this.M);
                } else {
                    ArrayList arrayList6 = this.d;
                    if (arrayList6 != null && !arrayList6.isEmpty() && (i13 = this.h) != 7 && i13 != 8) {
                        if (this.f == 0) {
                            this.U = true;
                            if (requestPeerType != null) {
                                sc.e.w(this, 16, this.M);
                            } else {
                                this.M.add(new k(this, F(), 0));
                            }
                            sc.e.w(this, 8, this.M);
                            sc.e.w(this, 7, this.M);
                        } else {
                            for (int i23 = 0; i23 < c42.size(); i23++) {
                                this.M.add(new k(this, 0, (TLRPC.Dialog) c42.get(i23)));
                            }
                            sc.e.w(this, 8, this.M);
                            sc.e.w(this, 7, this.M);
                        }
                        for (int i24 = 0; i24 < this.d.size(); i24++) {
                            this.M.add(new k(this, (TLRPC.TL_contact) this.d.get(i24)));
                        }
                        sc.e.w(this, 10, this.M);
                        z12 = true;
                        if ((!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) && this.f > 0) {
                            sc.e.w(this, 12, this.M);
                        }
                        if (this.n && this.h == 3) {
                            sc.e.w(this, 21, this.M);
                        }
                        if (!z12) {
                            for (int i25 = 0; i25 < c42.size(); i25++) {
                                if (this.h == 2 && (c42.get(i25) instanceof vx)) {
                                    this.M.add(new k(this, 14, (TLRPC.Dialog) c42.get(i25)));
                                } else {
                                    this.M.add(new k(this, 0, (TLRPC.Dialog) c42.get(i25)));
                                }
                            }
                            if (j11 != 0 || this.Q || (i14 = this.h) == 7 || i14 == 8 || vp.r1(i10).b2.get(i19)) {
                                int i26 = this.f;
                                if (i26 == 0) {
                                    this.U = true;
                                    if (requestPeerType != null) {
                                        sc.e.w(this, 16, this.M);
                                    } else {
                                        this.M.add(new k(this, F(), 0));
                                    }
                                } else {
                                    if (i19 == 0 && i26 > 10 && this.h == 0) {
                                        sc.e.w(this, 11, this.M);
                                    }
                                    sc.e.w(this, 10, this.M);
                                }
                            } else {
                                if (this.f != 0) {
                                    sc.e.w(this, 1, this.M);
                                }
                                sc.e.w(this, 10, this.M);
                            }
                        }
                        if (r12.R0.isEmpty()) {
                            int i27 = 0;
                            while (i27 < this.M.size()) {
                                k kVar = (k) this.M.get(i27);
                                if (kVar.a == 0 && (dialog2 = kVar.c) != null && r12.v2(dialog2.id)) {
                                    this.M.remove(i27);
                                    i27--;
                                }
                                i27++;
                            }
                            return;
                        }
                        return;
                    }
                    if (this.D) {
                        int size6 = vp.r1(i10).s.size();
                        sc.e.w(this, 2, this.M);
                        for (int i28 = 0; i28 < size6; i28++) {
                            this.M.add(new k(this, (TLRPC.RecentMeUrl) vp.r1(i10).s.get(i28)));
                        }
                        sc.e.w(this, 3, this.M);
                    } else {
                        int i29 = this.h;
                        if (i29 == 11 || i29 == 13) {
                            sc.e.w(this, 7, this.M);
                            sc.e.w(this, 12, this.M);
                        } else if (i29 == 12) {
                            sc.e.w(this, 7, this.M);
                        }
                    }
                }
                z12 = false;
                if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
                }
                sc.e.w(this, 12, this.M);
                if (this.n) {
                    sc.e.w(this, 21, this.M);
                }
                if (!z12) {
                }
                if (r12.R0.isEmpty()) {
                }
            }
        }
        z11 = false;
        this.E = z11;
        i11 = this.h;
        if (i11 != 7) {
        }
        r12.H(I.a, false);
        xo xoVar2 = (xo) r12.c0.get(I.a);
        if (xoVar2 != null) {
        }
        if (tL_chatlists_chatlistUpdates != null) {
            this.E = z10;
            this.M.add(new k(this, tL_chatlists_chatlistUpdates));
        }
        requestPeerType = this.T;
        if (requestPeerType != null) {
        }
        if (this.J) {
        }
        while (i12 < c42.size()) {
        }
        sc.e.w(this, 10, this.M);
    }

    public final void X(gw gwVar) {
        if (this.Z) {
            return;
        }
        this.Z = true;
        ArrayList arrayList = new ArrayList();
        this.N = arrayList;
        arrayList.addAll(this.M);
        W();
        ArrayList arrayList2 = new ArrayList(this.M);
        ArrayList arrayList3 = this.N;
        this.M = arrayList3;
        hg.a aVar = new hg.a(this, arrayList2, 5);
        arrayList3.size();
        m4.d c10 = s4.n.c(aVar, true);
        this.Z = false;
        if (gwVar != null) {
            gwVar.run();
        }
        this.M = arrayList2;
        c10.c(this);
    }

    @Override // s4.g0
    public final int b() {
        int size = this.M.size();
        this.w = size;
        return size;
    }

    @Override // s4.g0
    public final long c(int i10) {
        return ((k) this.M.get(i10)).k;
    }

    @Override // s4.g0
    public final int d(int i10) {
        return ((k) this.M.get(i10)).a;
    }

    @Override // s4.g0
    public void f() {
        if (this.Z) {
            this.M = new ArrayList();
        }
        this.Z = false;
        W();
        super.f();
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean m() {
        return this.y.isEmpty();
    }

    @Override // org.telegram.ui.Cells.r2
    public final void q() {
        e5 O1 = vp.r1(this.F).O1();
        ArrayList arrayList = O1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z10 = O1.E(0, o5.o(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long o10 = o5.o(((TL_stories.PeerStories) arrayList.get(i10)).peer);
            if (!z10 || O1.E(0, o10) != 0) {
                arrayList2.add(Long.valueOf(o10));
            }
        }
        this.R.getOrCreateStoryViewer().T(this.c, null, arrayList2, 0, null, null, new n5(this.K, true), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.Chat chat;
        String str;
        TLRPC.Chat chat2;
        String str2;
        String H;
        TLRPC.Chat L0;
        String L02;
        int i11;
        int i12 = c1Var.f;
        View view = c1Var.a;
        int i13 = this.F;
        ay ayVar = this.R;
        Object[] objArr = 0;
        if (i12 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) J(i10);
            Object J = J(i10 + 1);
            TLRPC.Dialog dialog2 = J instanceof TLRPC.Dialog ? (TLRPC.Dialog) J : null;
            int i14 = this.h;
            ArrayList arrayList = this.y;
            if (i14 == 2 || i14 == 15) {
                k6 k6Var = (k6) view;
                long dialogId = k6Var.getDialogId();
                if (dialog.id != 0) {
                    chat = vp.r1(i13).L0(Long.valueOf(-dialog.id));
                    if (chat != null && chat.migrated_to != null && (L0 = vp.r1(i13).L0(Long.valueOf(chat.migrated_to.channel_id))) != null) {
                        chat = L0;
                    }
                } else {
                    chat = null;
                }
                if (chat != null) {
                    String str3 = chat.title;
                    if (!w3.T(chat) || chat.megagroup) {
                        int i15 = chat.participants_count;
                        H = i15 != 0 ? cd.H(',', "Members", i15) : chat.has_geo ? cd.L0(2131748657, null) : !w3.t0(chat) ? cd.L0(2131748656, null).toLowerCase() : cd.L0(2131748653, null).toLowerCase();
                    } else {
                        int i16 = chat.participants_count;
                        H = i16 != 0 ? cd.H(',', "Subscribers", i16) : !w3.t0(chat) ? cd.L0(2131752329, null).toLowerCase() : cd.L0(2131752318, null).toLowerCase();
                    }
                    str2 = str3;
                    str = H;
                    chat2 = chat;
                } else {
                    TLRPC.User Z1 = vp.r1(i13).Z1(Long.valueOf(dialog.id));
                    if (Z1 != 0) {
                        String p5 = h20.p(Z1);
                        chat2 = Z1;
                        str = h20.z(Z1) ? "" : Z1.bot ? cd.L0(2131753156, null) : cd.d0(i13, Z1, null, null);
                        str2 = p5;
                    } else {
                        str = "";
                        chat2 = null;
                        str2 = null;
                    }
                }
                k6Var.M = dialog2 != null;
                k6Var.z(chat2, null, str2, str, false, false);
                k6Var.y(arrayList.contains(Long.valueOf(k6Var.getDialogId())), dialogId == k6Var.getDialogId());
                if (i10 < this.f + 1) {
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
            v2Var.Q0 = this.V != 0 && w3.d0(i13, dialog.id);
            v2Var.s2 = false;
            v2Var.t2 = false;
            if (this.h == 0 && org.telegram.messenger.i0.Q1()) {
                v2Var.setDialogSelected(dialog.id == this.s);
            }
            v2Var.c0(arrayList.contains(Long.valueOf(dialog.id)), false);
            if (i10 == 1 && ayVar != null && ayVar.N0 && ayVar.P0 != 0 && dialog.top_message == 0) {
                ap I = I();
                if (I == null || I.e()) {
                    v2Var.setCustomMessage(o5.w(ayVar.P0));
                } else {
                    v2Var.setCustomMessage(null);
                }
            } else if (i10 == 1 && ayVar != null && this.h == 3 && ayVar.Q0 != 0 && dialog.top_message == 0) {
                ap I2 = I();
                if (I2 == null || I2.e()) {
                    v2Var.setCustomMessage(o5.w(ayVar.Q0));
                } else {
                    v2Var.setCustomMessage(null);
                }
            } else {
                v2Var.setCustomMessage(null);
            }
            v2Var.e0(dialog, this.h, this.r);
            if (v2Var.getMeasuredHeight() > 0 && v2Var.getMeasuredHeight() != v2Var.G()) {
                v2Var.requestLayout();
            }
            boolean z10 = v2Var.f;
            boolean z11 = this.J;
            if (z10 != z11) {
                v2Var.f = z11;
                v2Var.requestLayout();
            }
            j jVar = this.P;
            if (jVar != null && i10 < 10) {
                long j10 = dialog.id;
                ArrayList arrayList2 = jVar.d;
                if (!jVar.a.contains(Long.valueOf(j10)) && !jVar.b.contains(Long.valueOf(j10)) && !jVar.c.contains(Long.valueOf(j10)) && !arrayList2.contains(Long.valueOf(j10))) {
                    arrayList2.add(Long.valueOf(j10));
                }
            }
        } else if (i12 == 4) {
            ((w2) view).setRecentMeUrl((TLRPC.RecentMeUrl) J(i10));
        } else if (i12 == 5) {
            b3 b3Var = (b3) view;
            int i17 = this.a0;
            int F = F();
            this.a0 = F;
            a01 a01Var = b3Var.n;
            TextView textView = b3Var.h;
            ei0 ei0Var = b3Var.f;
            if (b3Var.r != F) {
                b3Var.r = F;
                if (F == 0 || F == 1) {
                    L02 = cd.L0(2131748245, null);
                    textView.setText(cd.L0(2131748247, null));
                    i11 = R.raw.utyan_newborn;
                } else if (F != 2) {
                    ei0Var.setAutoRepeat(true);
                    L02 = cd.L0(2131750809, null);
                    textView.setText(cd.L0(2131750810, null));
                    i11 = R.raw.filter_new;
                } else {
                    ei0Var.setAutoRepeat(false);
                    boolean z12 = this.x;
                    i11 = R.raw.filter_no_chats;
                    if (z12) {
                        textView.setText(cd.L0(2131750724, null));
                        L02 = cd.L0(2131750723, null);
                    } else {
                        textView.setText(cd.L0(2131750726, null));
                        L02 = cd.L0(2131750725, null);
                    }
                }
                ei0Var.setVisibility(0);
                if (b3Var.r == 1) {
                    if (b3Var.d) {
                        b3Var.a = 1.0f;
                        String L03 = cd.L0(2131748246, null);
                        if (org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.P1()) {
                            L03 = L03.replace('\n', ' ');
                        }
                        a01Var.a(L03, true, false);
                        b3Var.requestLayout();
                    } else {
                        b3Var.a(true);
                    }
                }
                if (b3Var.s != i11) {
                    ei0Var.f(i11, 100, 100, null);
                    ei0Var.d();
                    b3Var.s = i11;
                }
                if (org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.P1()) {
                    L02 = L02.replace('\n', ' ');
                }
                a01Var.a(L02, false, false);
            }
            int i18 = this.h;
            if (i18 != 7 && i18 != 8) {
                b3Var.setOnUtyanAnimationEndListener(new e(this, objArr == true ? 1 : 0));
                b3Var.setOnUtyanAnimationUpdateListener(new ig.i(this, 6));
                if (!b3Var.d && this.f == 0) {
                    ayVar.K4(0.0f);
                    for (zx zxVar : ayVar.e0) {
                        ((s4.a0) zxVar.a.getLayoutManager()).u = true;
                    }
                }
                if (this.d == null || i17 != 0) {
                    if (this.e) {
                        if (this.f == 0) {
                            b3Var.a(false);
                        }
                    } else if (b3Var.d && this.a0 == 0) {
                        ValueAnimator valueAnimator = b3Var.e;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        b3Var.d = false;
                        ValueAnimator duration = ValueAnimator.ofFloat(b3Var.a, 0.0f).setDuration(250L);
                        b3Var.e = duration;
                        duration.setInterpolator(vs.d);
                        b3Var.e.addUpdateListener(new z2(b3Var, 1));
                        b3Var.e.addListener(new a3(b3Var, 0));
                        b3Var.e.start();
                    }
                } else if (!b3Var.d) {
                    b3Var.a(true);
                }
            }
        } else if (i12 == 6) {
            ((pa) view).d((TLRPC.User) J(i10), null, null, false);
        } else if (i12 == 7) {
            p4 p4Var = (p4) view;
            int i19 = this.h;
            if (i19 != 11 && i19 != 12 && i19 != 13) {
                p4Var.setText(cd.L0((this.f == 0 && this.e) ? 2131751804 : 2131742851, null));
            } else if (i10 == 0) {
                p4Var.setText(cd.L0(2131749258, null));
            } else {
                p4Var.setText(cd.L0(2131749257, null));
            }
        } else if (i12 != 11) {
            TLRPC.RequestPeerType requestPeerType = this.T;
            if (i12 != 12) {
                switch (i12) {
                    case 14:
                        p4 p4Var2 = (p4) view;
                        p4Var2.setTextSize(14.0f);
                        if (p4Var2.getTextView() != null) {
                            a7.V(p4Var2.getTextView(), t6.y6, null);
                        } else {
                            p4Var2.setTextColor(t6.x0(null, t6.y6, false));
                        }
                        a7.i(t6.e7, p4Var2, null);
                        int i20 = ((vx) J(i10)).a;
                        if (i20 != 0) {
                            if (i20 != 1) {
                                if (i20 == 2) {
                                    p4Var2.setText(cd.L0(2131750775, null));
                                    break;
                                }
                            } else {
                                p4Var2.setText(cd.L0(2131748319, null));
                                break;
                            }
                        } else {
                            p4Var2.setText(cd.L0(2131748320, null));
                            break;
                        }
                        break;
                    case 15:
                        ((s6) view).set(requestPeerType);
                        break;
                    case 16:
                        ((f3) view).set(requestPeerType);
                        break;
                    case 17:
                        d3 d3Var = (d3) view;
                        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = ((k) this.M.get(i10)).i;
                        if (tL_chatlists_chatlistUpdates != null) {
                            int size = tL_chatlists_chatlistUpdates.missing_peers.size();
                            d3Var.b(org.telegram.messenger.i0.R2(cd.G(size, "FolderUpdatesTitle", new Object[0]), t6.I6, 0, null, null), cd.G(size, "FolderUpdatesSubtitle", new Object[0]));
                            break;
                        }
                        break;
                    default:
                        switch (i12) {
                            case 20:
                                z3 z3Var = (z3) view;
                                if (ayVar == null || !ayVar.N0) {
                                    if (this.h == 3) {
                                        if (i10 == 0) {
                                            z3Var.setText(cd.L0(2131750587, null));
                                            break;
                                        } else {
                                            z3Var.setText(cd.L0(2131746276, null));
                                            break;
                                        }
                                    }
                                } else if (i10 == 0) {
                                    z3Var.setText(cd.L0(2131746277, null));
                                    break;
                                } else {
                                    z3Var.setText(cd.L0(2131746276, null));
                                    break;
                                }
                                break;
                            case 21:
                                org.telegram.ui.Cells.v2 v2Var2 = (org.telegram.ui.Cells.v2) view;
                                q2 q2Var = new q2();
                                q2Var.a = cd.L0(2131744789, null);
                                q2Var.b = cd.L0(2131744790, null);
                                v2Var2.s2 = false;
                                v2Var2.t2 = false;
                                v2Var2.setDialog(q2Var);
                                if (v2Var2.getMeasuredHeight() > 0 && v2Var2.getMeasuredHeight() != v2Var2.G()) {
                                    v2Var2.requestLayout();
                                    break;
                                }
                                break;
                            case 22:
                                ((p4) view).setText((String) J(i10));
                                break;
                            case 23:
                                Object J2 = J(i10);
                                org.telegram.ui.Cells.v2 v2Var3 = (org.telegram.ui.Cells.v2) view;
                                if (J2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat3 = (TLRPC.Chat) J2;
                                    v2Var3.Q0 = w3.e0(i13, chat3);
                                    v2Var3.setCustomMessageWithoutRebuild(cd.G(chat3.participants_count, "Members", new Object[0]));
                                    v2Var3.d0(-chat3.id, null, 0, false, false);
                                    break;
                                } else {
                                    TLRPC.User user = (TLRPC.User) J2;
                                    v2Var3.Q0 = w3.f0(i13, user);
                                    v2Var3.setCustomMessageWithoutRebuild(cd.L0(2131753156, null));
                                    v2Var3.d0(user.id, null, 0, false, false);
                                    break;
                                }
                        }
                }
            } else {
                if (!(view instanceof p8)) {
                    return;
                }
                p8 p8Var = (p8) view;
                int i21 = t6.q6;
                p8Var.g(i21, i21);
                if (requestPeerType == null) {
                    p8Var.o(R.drawable.msg_groups_create, cd.L0(2131751747, null), this.f != 0);
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    p8Var.o(R.drawable.msg_channel_create, cd.L0(2131751752, null), true);
                } else {
                    p8Var.o(R.drawable.msg_groups_create, cd.L0(2131751746, null), true);
                }
                p8Var.y = true;
                p8Var.setOffsetFromImage(75);
            }
        } else {
            b9 b9Var = (b9) view;
            b9Var.setText(cd.L0(2131744293, null));
            if (this.O == null) {
                Drawable drawable = this.c.getResources().getDrawable(R.drawable.arrow_newchat);
                this.O = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(t6.x0(null, t6.B6, false), PorterDuff.Mode.MULTIPLY));
            }
            p80 textView2 = b9Var.getTextView();
            if (textView2 != null) {
                a7.y(textView2, this.O, t6.B6, null, PorterDuff.Mode.MULTIPLY);
            }
            textView2.setCompoundDrawablePadding(org.telegram.messenger.i0.L(4.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (ayVar == null || !ayVar.N3) ? this.O : null, (Drawable) null);
            textView2.getLayoutParams().width = -2;
        }
        if (i10 < this.f + 1) {
        }
    }

    @Override // org.telegram.ui.Cells.r2
    public final void u(org.telegram.ui.Cells.v2 v2Var) {
        int i10 = this.F;
        vp.r1(i10);
        if (vp.r1(i10).O1().K(v2Var.getDialogId())) {
            ay ayVar = this.R;
            ayVar.getOrCreateStoryViewer().getClass();
            ayVar.getOrCreateStoryViewer().R(ayVar.getParentActivity(), v2Var.getDialogId(), n5.a((tk0) v2Var.getParent()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [org.telegram.ui.Cells.v2] */
    /* JADX WARN: Type inference failed for: r2v10, types: [org.telegram.ui.Cells.pa] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.view.View, org.telegram.ui.Cells.p4] */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.view.View, org.telegram.ui.Cells.c7] */
    /* JADX WARN: Type inference failed for: r2v13, types: [zf.l] */
    /* JADX WARN: Type inference failed for: r2v14, types: [android.view.View, zf.i] */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.view.View, android.widget.LinearLayout, org.telegram.ui.Cells.s6] */
    /* JADX WARN: Type inference failed for: r2v17, types: [zf.h] */
    /* JADX WARN: Type inference failed for: r2v18, types: [org.telegram.ui.Cells.d3] */
    /* JADX WARN: Type inference failed for: r2v19, types: [org.telegram.ui.Components.bn] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v20, types: [android.view.ViewGroup, zf.l] */
    /* JADX WARN: Type inference failed for: r2v21, types: [org.telegram.ui.Cells.z3] */
    /* JADX WARN: Type inference failed for: r2v22, types: [org.telegram.ui.Cells.p4] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v26, types: [android.view.View, org.telegram.ui.Cells.p8] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [org.telegram.ui.Components.zz] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.ViewGroup, org.telegram.ui.Cells.p4] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View, android.view.ViewGroup, org.telegram.ui.dg0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.View, org.telegram.ui.Cells.w2, org.telegram.ui.Cells.z] */
    /* JADX WARN: Type inference failed for: r2v9, types: [org.telegram.ui.Cells.b3] */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        ?? r22;
        p4 p4Var;
        long j10 = this.V;
        int i11 = 0;
        int i12 = 1;
        Context context = this.c;
        switch (i10) {
            case 0:
            case 21:
                int i13 = this.h;
                if (i13 == 2 || i13 == 15) {
                    r22 = new k6(context, null);
                } else {
                    org.telegram.ui.Cells.v2 v2Var = new org.telegram.ui.Cells.v2(this.R, this.c, false, this.F, null);
                    if (T()) {
                        m6 m6Var = new m6(this, 4);
                        v2Var.J1 = true;
                        v2Var.K1 = m6Var;
                    }
                    v2Var.setArchivedPullAnimation(this.L);
                    v2Var.setPreloader(this.P);
                    v2Var.setDialogCellDelegate(this);
                    v2Var.setIsTransitionSupport(this.S);
                    if (i10 == 21) {
                        g7 g7Var = new g7(v2Var.getContext(), v2Var, false, R.drawable.forward_to_stories, v2Var.J4);
                        v2Var = v2Var;
                        v2Var.G = g7Var;
                        v2Var.F = true;
                    }
                    if (j10 != 0) {
                        v2Var.O0 = true;
                    }
                    r22 = v2Var;
                }
                if (this.h == 15) {
                    a7.i(t6.d6, r22, null);
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new zz(context, null);
                r22.setIsSingleCell(true);
                int i14 = i10 == 13 ? 18 : 7;
                r22.setViewType(i14);
                if (i14 == 18) {
                    r22.setIgnoreHeightCheck(true);
                }
                if (i10 == 13) {
                    r22.setItemsCount((int) ((org.telegram.messenger.i0.q.y * 0.5f) / org.telegram.messenger.i0.L(64.0f)));
                    break;
                }
                break;
            case 2:
                r22 = new p4(context);
                r22.setText(cd.L0(2131746375, null));
                TextView textView = new TextView(context);
                sc.e.t(textView, 1, 15.0f);
                z20.p(textView, t6.L6, null, null, 2131746374);
                textView.setGravity((cd.X ? 3 : 5) | 16);
                r22.addView(textView, b6.d(-1, -1.0f, (cd.X ? 3 : 5) | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new f(this, i11));
                break;
            case 3:
                r22 = new dg0(context, 22);
                a7.i(t6.a7, r22, null);
                View view = new View(context);
                a7.a0(view, context, R.drawable.greydivider, t6.b7);
                r22.addView(view, b6.c(-1.0f, -1));
                break;
            case 4:
                r22 = new w2(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.n = new r8((p6) null);
                r22.x = org.telegram.messenger.i0.L(40.0f);
                r22.F = org.telegram.messenger.i0.L(10.0f);
                r22.H = d20.s0;
                t6.T(context);
                imageReceiver.J0(org.telegram.messenger.i0.L(26.0f));
                break;
            case 5:
                r22 = new b3(context);
                break;
            case 6:
                r22 = new pa(context, 8, 0, false);
                break;
            case 7:
                r22 = new p4(context);
                ay ayVar = this.R;
                if (ayVar == null || !ayVar.N0) {
                    r22.setPadding(0, 0, 0, org.telegram.messenger.i0.L(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new c7(context, (org.telegram.ui.Cells.f1) null);
                Drawable Y0 = t6.Y0(context, R.drawable.greydivider, t6.b7);
                eq eqVar = new eq(new ColorDrawable(t6.x0(null, t6.a7, false)), Y0);
                eqVar.x = true;
                r22.setBackgroundDrawable(eqVar);
                E(r22, Y0);
                break;
            case 9:
            case 12:
            default:
                r22 = new p8(context);
                if (this.h == 15) {
                    a7.i(t6.d6, r22, null);
                    break;
                }
                break;
            case 10:
                r22 = new l(this, context);
                break;
            case 11:
                r22 = new i(this, context);
                Drawable Y02 = t6.Y0(context, R.drawable.greydivider, t6.b7);
                eq eqVar2 = new eq(new ColorDrawable(t6.x0(null, t6.a7, false)), Y02);
                eqVar2.x = true;
                r22.setBackgroundDrawable(eqVar2);
                E(r22, Y02);
                break;
            case 14:
                p4 p4Var2 = new p4(this.c, t6.f7, 16, 0, false, null);
                p4Var2.setHeight(32);
                p4Var2.setClickable(false);
                p4Var = p4Var2;
                r22 = p4Var;
                break;
            case 15:
                r22 = new s6(context);
                r22.b = new ArrayList();
                r22.setOrientation(1);
                a7.i(t6.a7, r22, null);
                break;
            case 16:
                r22 = new h(this, context);
                break;
            case 17:
                r22 = new d3(context);
                break;
            case 18:
                r22 = new bn(context, 29);
                break;
            case 19:
                r22 = new l(this, context);
                r22.addView(new l6(this.c, this.F, null, new e(this, i12), null), b6.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new z3(context, null);
                break;
            case 22:
                r22 = new p4(context);
                break;
            case 23:
                ?? v2Var2 = new org.telegram.ui.Cells.v2(this.R, this.c, false, this.F, null);
                p4Var = v2Var2;
                if (j10 != 0) {
                    v2Var2.O0 = true;
                    v2Var2.P0 = true;
                    p4Var = v2Var2;
                }
                r22 = p4Var;
                break;
        }
        r22.setLayoutParams(new s4.o0(-1, (i10 == 5 || i10 == 19) ? -1 : -2));
        return new ck0(r22);
    }

    @Override // org.telegram.ui.Cells.r2
    public final void x(org.telegram.ui.Cells.v2 v2Var) {
        this.R.S4(v2Var);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.v2) {
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
            v2Var.a0(this.H, false);
            v2Var.c0(this.y.contains(Long.valueOf(v2Var.getDialogId())), false);
        }
    }

    public void M(TLRPC.User user) {
    }

    public void l(org.telegram.ui.Cells.v2 v2Var) {
    }

    public void r(org.telegram.ui.Cells.v2 v2Var) {
    }

    public void K() {
    }

    public void L() {
    }
}
