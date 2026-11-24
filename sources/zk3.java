// default package

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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class zk3 extends q59 implements dg3 {
    public boolean E;
    public boolean F;
    public final int G;
    public boolean H;
    public boolean I;
    public long J;
    public boolean K;
    public jk3 L;
    public pi3 M;
    public Drawable P;
    public final wk3 Q;
    public boolean R;
    public final nk3 S;
    public boolean T;
    public final TLRPC.RequestPeerType U;
    public boolean V;
    public final long W;
    public boolean a0;
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
    public ArrayList N = new ArrayList();
    public ArrayList O = new ArrayList();
    public int X = 10;
    public final LongSparseIntArray Y = new LongSparseIntArray();
    public final HashMap Z = new HashMap();
    public int b0 = -1;

    static {
        boolean z = e21.a;
    }

    public zk3(nk3 nk3Var, Context context, int i, int i2, boolean z, ArrayList arrayList, int i3, TLRPC.RequestPeerType requestPeerType) {
        this.c = context;
        this.S = nk3Var;
        this.h = i;
        this.r = i2;
        this.x = z;
        this.E = i2 == 0 && i == 0 && !z;
        this.y = arrayList;
        this.G = i3;
        this.W = nk3Var.a3;
        if (i2 == 0) {
            wk3 wk3Var = new wk3();
            wk3Var.a = new HashSet();
            wk3Var.b = new HashSet();
            wk3Var.c = new HashSet();
            wk3Var.d = new ArrayList();
            wk3Var.e = new jd(wk3Var, (byte) 29);
            this.Q = wk3Var;
        }
        this.U = requestPeerType;
    }

    public static void E(View view, Drawable drawable) {
        if (drawable != null) {
            try {
                anb.x(view, drawable, cmb.a7, null, PorterDuff.Mode.MULTIPLY);
            } catch (Exception e) {
                fc4.g(e, true);
                return;
            }
        }
        int i = cmb.Z6;
        wa3 wa3Var = new wa3((byte) 12);
        wa3 wa3Var2 = new wa3((byte) 13);
        int P = anb.P(i, -1, 0, 0.0f, null);
        wa3Var2.e(P, view);
        umb w = anb.w(101, view);
        w.c(i, -1, 0, 0.0f, null);
        w.n = wa3Var;
        w.o = wa3Var2;
        w.m = false;
        w.g = P;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return (i == 1 || i == 5 || i == 3 || i == 8 || i == 7 || i == 10 || i == 11 || i == 13 || i == 15 || i == 16 || i == 18 || i == 19 || i == 20) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F() {
        boolean z;
        if (this.W == 0) {
            if (this.S.I3(this.h)) {
                z = true;
                int i = this.h;
                int i2 = this.G;
                int i3 = this.r;
                if (!z) {
                    return (i == 0 || oc7.r1(i2).U1.get(i3)) ? 4 : 3;
                }
                if (i == 7 || i == 8) {
                    return oc7.r1(i2).U1.get(i3) ? 2 : 3;
                }
                if (i3 != 1) {
                    return this.d != null ? 1 : 0;
                }
                return 2;
            }
        }
        z = false;
        int i4 = this.h;
        int i22 = this.G;
        int i32 = this.r;
        if (!z) {
        }
    }

    public final int G(long j) {
        for (int i = 0; i < this.N.size(); i++) {
            if (((xk3) this.N.get(i)).c != null && ((xk3) this.N.get(i)).c.id == j) {
                return i;
            }
        }
        return -1;
    }

    public final int H(int i) {
        if (this.F) {
            i--;
        }
        if (this.E) {
            i = ts2.k(2, i, oc7.r1(this.G).s);
        }
        if (this.n && this.h == 3) {
            i--;
        }
        int i2 = this.h;
        return (i2 == 11 || i2 == 13) ? i - 2 : i2 == 12 ? i - 1 : i;
    }

    public final ub7 I() {
        int i = this.h;
        if (i == 7 || i == 8) {
            return oc7.r1(this.G).N[this.h - 7];
        }
        return null;
    }

    public final Object J(int i) {
        if (i < 0 || i >= this.N.size()) {
            return null;
        }
        xk3 xk3Var = (xk3) this.N.get(i);
        String str = xk3Var.l;
        TLRPC.TL_contact tL_contact = xk3Var.e;
        if (str != null) {
            return str;
        }
        TLRPC.Chat chat = xk3Var.m;
        if (chat != null) {
            return chat;
        }
        TLRPC.User user = xk3Var.n;
        if (user != null) {
            return user;
        }
        TLRPC.Dialog dialog = xk3Var.c;
        if (dialog != null) {
            return dialog;
        }
        if (tL_contact != null) {
            return oc7.r1(this.G).W1(Long.valueOf(tL_contact.user_id));
        }
        TLRPC.RecentMeUrl recentMeUrl = xk3Var.d;
        if (recentMeUrl != null) {
            return recentMeUrl;
        }
        return null;
    }

    public final void N(r59 r59Var, boolean z) {
        this.K = z;
        for (int i = 0; i < r59Var.getChildCount(); i++) {
            if (r59Var.getChildAt(i) instanceof hg3) {
                ((hg3) r59Var.getChildAt(i)).f = z;
            }
        }
        for (int i2 = 0; i2 < r59Var.getCachedChildCount(); i2++) {
            if (r59Var.P(i2) instanceof hg3) {
                ((hg3) r59Var.P(i2)).f = z;
            }
        }
        for (int i3 = 0; i3 < r59Var.getHiddenChildCount(); i3++) {
            if (r59Var.W(i3) instanceof hg3) {
                ((hg3) r59Var.W(i3)).f = z;
            }
        }
        for (int i4 = 0; i4 < r59Var.getAttachedScrapChildCount(); i4++) {
            if (r59Var.O(i4) instanceof hg3) {
                ((hg3) r59Var.O(i4)).f = z;
            }
        }
    }

    public boolean O() {
        return false;
    }

    public final void P(boolean z) {
        int i = this.G;
        if (this.d != null) {
            if (!z || SystemClock.elapsedRealtime() - this.J >= 2000) {
                this.J = SystemClock.elapsedRealtime();
                byte b = 1;
                try {
                    int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
                    Collections.sort(this.d, new dv2(oc7.r1(i), currentTime, b));
                    if (z) {
                        f();
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
    }

    public final void Q() {
        this.E = this.r == 0 && this.h == 0 && !this.x && !oc7.r1(this.G).s.isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:298:0x01c5, code lost:
    
        if (r11 != r16) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04e2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0269 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R() {
        long j;
        ArrayList o3;
        int i;
        boolean z;
        int i2;
        int i3;
        TLRPC.Dialog dialog;
        boolean z2;
        int i4;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        TLRPC.RequestPeerType requestPeerType;
        int i5;
        ArrayList arrayList;
        int i6;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z3;
        TLRPC.Dialog dialog2;
        int i7;
        boolean z4;
        int i8;
        TLRPC.Dialog dialog3;
        ArrayList arrayList4;
        String M0;
        ArrayList arrayList5;
        long j2 = this.W;
        int i9 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        ArrayList arrayList6 = this.N;
        int i10 = this.G;
        if (i9 != 0) {
            arrayList6.clear();
            Q();
            xvc u = oc7.r1(i10).u(j2);
            ArrayList arrayList7 = (ArrayList) u.b;
            int size = arrayList7.size();
            ArrayList arrayList8 = (ArrayList) u.c;
            int size2 = arrayList8.size() + size;
            ArrayList arrayList9 = (ArrayList) u.d;
            int size3 = arrayList9.size() + size2;
            ArrayList arrayList10 = (ArrayList) u.e;
            this.f = arrayList10.size() + size3;
            this.V = false;
            int i11 = this.h == 3 ? 2 : 4;
            for (int i12 = 0; i12 < i11; i12++) {
                if (i12 == 0) {
                    M0 = jb6.M0(2131751815, null);
                    arrayList5 = arrayList7;
                } else if (i12 == 1) {
                    M0 = jb6.M0(2131751812, null);
                    arrayList5 = arrayList8;
                } else if (i12 == 2) {
                    M0 = jb6.M0(2131751813, null);
                    arrayList5 = arrayList9;
                } else {
                    M0 = jb6.M0(2131751810, null);
                    arrayList5 = arrayList10;
                }
                if (!arrayList5.isEmpty()) {
                    this.N.add(new xk3(this, M0));
                    for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                        tb7 tb7Var = (tb7) arrayList5.get(i13);
                        TLRPC.Dialog dialog4 = tb7Var.d;
                        if (dialog4 != null) {
                            this.N.add(new xk3(this, 0, dialog4));
                        } else {
                            TLRPC.Chat chat = tb7Var.b;
                            if (chat != null) {
                                this.N.add(new xk3(this, chat));
                            } else {
                                TLRPC.User user = tb7Var.c;
                                if (user != null) {
                                    this.N.add(new xk3(this, user));
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        arrayList6.clear();
        Q();
        oc7 r1 = oc7.r1(i10);
        int i14 = this.r;
        nk3 nk3Var = this.S;
        if (i9 != 0) {
            o3 = (ArrayList) r1.x.f(j2);
            if (o3 == null) {
                o3 = new ArrayList();
            }
            j = 0;
        } else {
            j = 0;
            o3 = nk3Var.o3(i10, this.h, i14, this.H);
            if (o3 == null) {
                o3 = new ArrayList();
            }
        }
        int size4 = o3.size();
        this.f = size4;
        this.V = false;
        if (size4 == 0 && nk3Var.F3()) {
            ts2.r(this, 19, this.N);
            return;
        }
        if (this.E || this.h != 0 || i14 != 0 || !r1.U1.get(i14) || this.e) {
            i = i9;
            z = true;
            i2 = i14;
        } else if (r1.C0() > 10 || !bw2.r(i10).n || bw2.r(i10).f0.isEmpty()) {
            i = i9;
            z = true;
            i2 = i14;
            this.d = null;
        } else {
            this.d = new ArrayList(bw2.r(i10).f0);
            i = i9;
            long j3 = z8c.h(i10).n;
            int size5 = this.d.size();
            z = true;
            int i15 = 0;
            while (true) {
                arrayList4 = this.d;
                if (i15 >= size5) {
                    break;
                }
                int i16 = i14;
                long j4 = ((TLRPC.TL_contact) arrayList4.get(i15)).user_id;
                if (j4 == j3 || r1.R.f(j4) != null) {
                    this.d.remove(i15);
                    i15--;
                    size5--;
                }
                i15++;
                i14 = i16;
            }
            i2 = i14;
            if (arrayList4.isEmpty()) {
                this.d = null;
            } else {
                P(false);
            }
        }
        ub7 I = I();
        if ((I == null || I.d()) && nk3Var.O0) {
            long j5 = nk3Var.R0;
            if (j5 == j) {
                j5 = nk3Var.Q0;
            }
            ts2.r(this, 20, this.N);
            int i17 = 0;
            while (true) {
                if (i17 >= o3.size()) {
                    i3 = i10;
                    dialog = null;
                    break;
                }
                i3 = i10;
                if (((TLRPC.Dialog) o3.get(i17)).id == j5) {
                    dialog = (TLRPC.Dialog) o3.get(i17);
                    break;
                } else {
                    i17++;
                    i10 = i3;
                }
            }
            if (dialog == null) {
                dialog = new TLRPC.TL_dialog();
                dialog.id = j5;
            }
            this.N.add(new xk3(this, 0, dialog));
            ts2.r(this, 20, this.N);
            z2 = false;
            this.F = z2;
            i4 = this.h;
            if ((i4 != 7 || i4 == 8) && I != null && I.c()) {
                r1.D(I.a, false);
                rb7 rb7Var = (rb7) r1.d0.get(I.a);
                tL_chatlists_chatlistUpdates = rb7Var == null ? null : rb7Var.c;
                if (tL_chatlists_chatlistUpdates != null && tL_chatlists_chatlistUpdates.missing_peers.size() > 0) {
                    this.F = z;
                    this.N.add(new xk3(this, tL_chatlists_chatlistUpdates));
                }
            }
            requestPeerType = this.U;
            if (requestPeerType != null) {
                ts2.r(this, 15, this.N);
            }
            if (!this.K || this.T) {
                for (i5 = 0; i5 < o3.size(); i5++) {
                    if (this.h == 2 && (o3.get(i5) instanceof ik3)) {
                        this.N.add(new xk3(this, 14, (TLRPC.Dialog) o3.get(i5)));
                    } else {
                        this.N.add(new xk3(this, 0, (TLRPC.Dialog) o3.get(i5)));
                    }
                }
                ts2.r(this, 10, this.N);
            }
            boolean z5 = j2 == j && nk3Var.I3(this.h);
            boolean z6 = z5 && this.f > 0;
            if (z6) {
                int i18 = 0;
                while (true) {
                    if (i18 >= o3.size()) {
                        break;
                    }
                    if (!(o3.get(i18) instanceof TLRPC.TL_dialogFolder)) {
                        z6 = false;
                        break;
                    }
                    i18++;
                }
            }
            if (this.f == 0 && this.e && !z5) {
                this.V = true;
                ArrayList arrayList11 = this.N;
                if (requestPeerType != null) {
                    ts2.r(this, 16, arrayList11);
                } else {
                    arrayList11.add(new xk3(this, F(), 0));
                }
                ts2.r(this, 8, this.N);
                ts2.r(this, 7, this.N);
                ts2.r(this, 13, this.N);
            } else {
                ArrayList arrayList12 = this.d;
                if (arrayList12 != null && !arrayList12.isEmpty() && (i6 = this.h) != 7 && i6 != 8 && !z5) {
                    if (this.f == 0) {
                        this.V = true;
                        ArrayList arrayList13 = this.N;
                        if (requestPeerType != null) {
                            ts2.r(this, 16, arrayList13);
                        } else {
                            arrayList13.add(new xk3(this, F(), 0));
                        }
                        ts2.r(this, 8, this.N);
                        ts2.r(this, 7, this.N);
                    } else {
                        int i19 = 0;
                        while (true) {
                            int size6 = o3.size();
                            arrayList2 = this.N;
                            if (i19 >= size6) {
                                break;
                            }
                            arrayList2.add(new xk3(this, 0, (TLRPC.Dialog) o3.get(i19)));
                            i19++;
                        }
                        ts2.r(this, 8, arrayList2);
                        ts2.r(this, 7, this.N);
                    }
                    int i20 = 0;
                    while (true) {
                        int size7 = this.d.size();
                        arrayList3 = this.N;
                        if (i20 >= size7) {
                            break;
                        }
                        arrayList3.add(new xk3(this, (TLRPC.TL_contact) this.d.get(i20)));
                        i20++;
                    }
                    ts2.r(this, 10, arrayList3);
                    z3 = true;
                    if ((!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) && this.f > 0) {
                        ts2.r(this, 12, this.N);
                    }
                    if (this.n && this.h == 3) {
                        ts2.r(this, 21, this.N);
                    }
                    if (!z3) {
                        for (int i21 = 0; i21 < o3.size(); i21++) {
                            if (this.h == 2 && (o3.get(i21) instanceof ik3)) {
                                this.N.add(new xk3(this, 14, (TLRPC.Dialog) o3.get(i21)));
                            } else {
                                this.N.add(new xk3(this, 0, (TLRPC.Dialog) o3.get(i21)));
                            }
                        }
                        if (i != 0 || this.R || (i8 = this.h) == 7 || i8 == 8) {
                            i7 = i2;
                        } else {
                            i7 = i2;
                            if (!oc7.r1(i3).U1.get(i7)) {
                                if (this.f != 0) {
                                    ts2.r(this, 1, this.N);
                                }
                                ts2.r(this, 10, this.N);
                            }
                        }
                        int i22 = this.f;
                        if (i22 == 0) {
                            z4 = true;
                        } else if (z6) {
                            z4 = false;
                        } else {
                            if (i7 == 0 && i22 > 10 && this.h == 0) {
                                ts2.r(this, 11, this.N);
                            }
                            ts2.r(this, 10, this.N);
                        }
                        this.V = z4;
                        ArrayList arrayList14 = this.N;
                        if (requestPeerType != null) {
                            ts2.r(this, 16, arrayList14);
                        } else {
                            arrayList14.add(new xk3(this, F(), 0));
                        }
                    }
                    if (r1.I0.isEmpty()) {
                        int i23 = 0;
                        while (i23 < this.N.size()) {
                            xk3 xk3Var = (xk3) this.N.get(i23);
                            if (xk3Var.a == 0 && (dialog2 = xk3Var.c) != null && r1.v2(dialog2.id)) {
                                this.N.remove(i23);
                                i23--;
                            }
                            i23++;
                        }
                        return;
                    }
                    return;
                }
                if (this.E) {
                    int size8 = oc7.r1(i3).s.size();
                    ts2.r(this, 2, this.N);
                    int i24 = 0;
                    while (true) {
                        arrayList = this.N;
                        if (i24 >= size8) {
                            break;
                        }
                        arrayList.add(new xk3(this, (TLRPC.RecentMeUrl) oc7.r1(i3).s.get(i24)));
                        i24++;
                    }
                    ts2.r(this, 3, arrayList);
                } else {
                    int i25 = this.h;
                    if (i25 == 11 || i25 == 13) {
                        ts2.r(this, 7, this.N);
                        ts2.r(this, 12, this.N);
                    } else if (i25 == 12) {
                        ts2.r(this, 7, this.N);
                    }
                }
            }
            z3 = false;
            if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
            }
            ts2.r(this, 12, this.N);
            if (this.n) {
                ts2.r(this, 21, this.N);
            }
            if (!z3) {
            }
            if (r1.I0.isEmpty()) {
            }
        }
        i3 = i10;
        if ((I == null || I.d()) && this.h == 3 && nk3Var.S0 != j) {
            ts2.r(this, 20, this.N);
            int i26 = 0;
            while (true) {
                if (i26 >= o3.size()) {
                    dialog3 = null;
                    break;
                } else {
                    if (((TLRPC.Dialog) o3.get(i26)).id == nk3Var.S0) {
                        dialog3 = (TLRPC.Dialog) o3.get(i26);
                        break;
                    }
                    i26++;
                }
            }
            if (dialog3 == null) {
                dialog3 = new TLRPC.TL_dialog();
                dialog3.id = nk3Var.S0;
            }
            z2 = false;
            this.N.add(new xk3(this, 0, dialog3));
            ts2.r(this, 20, this.N);
            this.F = z2;
            i4 = this.h;
            if (i4 != 7) {
            }
            r1.D(I.a, false);
            rb7 rb7Var2 = (rb7) r1.d0.get(I.a);
            if (rb7Var2 == null) {
            }
            if (tL_chatlists_chatlistUpdates != null) {
                this.F = z;
                this.N.add(new xk3(this, tL_chatlists_chatlistUpdates));
            }
            requestPeerType = this.U;
            if (requestPeerType != null) {
            }
            if (this.K) {
            }
            while (i5 < o3.size()) {
            }
            ts2.r(this, 10, this.N);
        }
        z2 = false;
        this.F = z2;
        i4 = this.h;
        if (i4 != 7) {
        }
        r1.D(I.a, false);
        rb7 rb7Var22 = (rb7) r1.d0.get(I.a);
        if (rb7Var22 == null) {
        }
        if (tL_chatlists_chatlistUpdates != null) {
        }
        requestPeerType = this.U;
        if (requestPeerType != null) {
        }
        if (this.K) {
        }
        while (i5 < o3.size()) {
        }
        ts2.r(this, 10, this.N);
    }

    public final void S(li3 li3Var) {
        if (this.a0) {
            return;
        }
        this.a0 = true;
        ArrayList arrayList = new ArrayList();
        this.O = arrayList;
        arrayList.addAll(this.N);
        R();
        ArrayList arrayList2 = new ArrayList(this.N);
        ArrayList arrayList3 = this.O;
        this.N = arrayList3;
        tk3 tk3Var = new tk3(this, arrayList2, (byte) 0);
        arrayList3.size();
        tn2 a = ww7.a(tk3Var, true);
        this.a0 = false;
        if (li3Var != null) {
            li3Var.run();
        }
        this.N = arrayList2;
        a.c(this);
    }

    @Override // y59
    public final int b() {
        int size = this.N.size();
        this.w = size;
        return size;
    }

    @Override // y59
    public final long c(int i) {
        return ((xk3) this.N.get(i)).k;
    }

    @Override // y59
    public final int d(int i) {
        return ((xk3) this.N.get(i)).a;
    }

    @Override // y59
    public void f() {
        if (this.a0) {
            this.N = new ArrayList();
        }
        this.a0 = false;
        R();
        super.f();
    }

    @Override // dg3
    public final void k(hg3 hg3Var) {
        int i = this.G;
        oc7.r1(i);
        if (oc7.r1(i).N1().J(hg3Var.getDialogId())) {
            nk3 nk3Var = this.S;
            nk3Var.getOrCreateStoryViewer().getClass();
            nk3Var.getOrCreateStoryViewer().H(nk3Var.getParentActivity(), hg3Var.getDialogId(), q4b.a((r59) hg3Var.getParent()));
        }
    }

    @Override // dg3
    public final boolean m() {
        return this.y.isEmpty();
    }

    @Override // dg3
    public final void r() {
        h4b N1 = oc7.r1(this.G).N1();
        ArrayList arrayList = N1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z = N1.D(0, pg3.n(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            long n = pg3.n(((TL_stories.PeerStories) arrayList.get(i)).peer);
            if (!z || N1.D(0, n) != 0) {
                arrayList2.add(Long.valueOf(n));
            }
        }
        this.S.getOrCreateStoryViewer().K(this.c, null, arrayList2, 0, null, null, new q4b(this.L, true), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        TLRPC.Chat chat;
        String str;
        TLRPC.Chat chat2;
        String str2;
        String H;
        TLRPC.Chat L0;
        String M0;
        int i2;
        String str3;
        int i3;
        int i4 = u69Var.f;
        View view = u69Var.a;
        int i5 = this.G;
        nk3 nk3Var = this.S;
        Object[] objArr = 0;
        if (i4 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) J(i);
            Object J = J(i + 1);
            TLRPC.Dialog dialog2 = J instanceof TLRPC.Dialog ? (TLRPC.Dialog) J : null;
            int i6 = this.h;
            ArrayList arrayList = this.y;
            if (i6 == 2 || i6 == 15) {
                ut8 ut8Var = (ut8) view;
                long dialogId = ut8Var.getDialogId();
                if (dialog.id != 0) {
                    chat = oc7.r1(i5).L0(Long.valueOf(-dialog.id));
                    if (chat != null && chat.migrated_to != null && (L0 = oc7.r1(i5).L0(Long.valueOf(chat.migrated_to.channel_id))) != null) {
                        chat = L0;
                    }
                } else {
                    chat = null;
                }
                if (chat != null) {
                    String str4 = chat.title;
                    if (!sd2.T(chat) || chat.megagroup) {
                        int i7 = chat.participants_count;
                        H = i7 != 0 ? jb6.H(',', "Members", i7) : chat.has_geo ? jb6.M0(2131748399, null) : !sd2.t0(chat) ? jb6.M0(2131748398, null).toLowerCase() : jb6.M0(2131748395, null).toLowerCase();
                    } else {
                        int i8 = chat.participants_count;
                        H = i8 != 0 ? jb6.H(',', "Subscribers", i8) : !sd2.t0(chat) ? jb6.M0(2131752271, null).toLowerCase() : jb6.M0(2131752260, null).toLowerCase();
                    }
                    str2 = str4;
                    str = H;
                    chat2 = chat;
                } else {
                    TLRPC.User W1 = oc7.r1(i5).W1(Long.valueOf(dialog.id));
                    if (W1 != 0) {
                        String r = m9c.r(W1);
                        if (m9c.B(W1)) {
                            chat2 = W1;
                            str = "";
                        } else {
                            chat2 = W1;
                            str = W1.bot ? jb6.M0(2131753121, null) : jb6.d0(i5, W1, null, null);
                        }
                        str2 = r;
                    } else {
                        str = "";
                        chat2 = null;
                        str2 = null;
                    }
                }
                ut8Var.N = dialog2 != null;
                ut8Var.x(chat2, null, str2, str, false, false);
                ut8Var.w(arrayList.contains(Long.valueOf(ut8Var.getDialogId())), dialogId == ut8Var.getDialogId());
                if (i < this.f + 1) {
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            }
            hg3 hg3Var = (hg3) view;
            hg3Var.R0 = this.W != 0 && sd2.d0(i5, dialog.id);
            hg3Var.t2 = false;
            hg3Var.u2 = false;
            if (this.h == 0 && gm.O1()) {
                hg3Var.setDialogSelected(dialog.id == this.s);
            }
            hg3Var.d0(arrayList.contains(Long.valueOf(dialog.id)), false);
            if (i == 1 && nk3Var.O0 && nk3Var.R0 != 0 && dialog.top_message == 0) {
                ub7 I = I();
                hg3Var.setCustomMessage((I == null || I.d()) ? jb6.M0(2131745994, null) : null);
            } else if (i == 1 && nk3Var.O0 && nk3Var.Q0 != 0 && dialog.top_message == 0) {
                ub7 I2 = I();
                if (I2 == null || I2.d()) {
                    hg3Var.setCustomMessage(pg3.v(nk3Var.Q0));
                } else {
                    hg3Var.setCustomMessage(null);
                }
            } else if (i == 1 && this.h == 3 && nk3Var.S0 != 0 && dialog.top_message == 0) {
                ub7 I3 = I();
                if (I3 == null || I3.d()) {
                    hg3Var.setCustomMessage(pg3.v(nk3Var.S0));
                } else {
                    hg3Var.setCustomMessage(null);
                }
            } else {
                hg3Var.setCustomMessage(null);
            }
            hg3Var.f0(dialog, this.h, this.r);
            if (hg3Var.getMeasuredHeight() > 0 && hg3Var.getMeasuredHeight() != hg3Var.E()) {
                hg3Var.requestLayout();
            }
            boolean z = hg3Var.f;
            boolean z2 = this.K;
            if (z != z2) {
                hg3Var.f = z2;
                hg3Var.requestLayout();
            }
            wk3 wk3Var = this.Q;
            if (wk3Var != null && i < 10) {
                long j = dialog.id;
                ArrayList arrayList2 = wk3Var.d;
                if (!wk3Var.a.contains(Long.valueOf(j)) && !wk3Var.b.contains(Long.valueOf(j)) && !wk3Var.c.contains(Long.valueOf(j)) && !arrayList2.contains(Long.valueOf(j))) {
                    arrayList2.add(Long.valueOf(j));
                }
            }
        } else if (i4 == 4) {
            ((ng3) view).setRecentMeUrl((TLRPC.RecentMeUrl) J(i));
        } else if (i4 == 5) {
            ml3 ml3Var = (ml3) view;
            int i9 = this.b0;
            int F = F();
            this.b0 = F;
            blb blbVar = ml3Var.n;
            TextView textView = ml3Var.h;
            s09 s09Var = ml3Var.f;
            if (ml3Var.r != F) {
                ml3Var.r = F;
                if (F == 0 || F == 1) {
                    M0 = jb6.M0(2131747962, null);
                    textView.setText(jb6.M0(2131747964, null));
                    i2 = R.raw.utyan_newborn;
                } else {
                    i3 = R.raw.filter_no_chats;
                    if (F == 2) {
                        s09Var.setAutoRepeat(false);
                        if (this.x) {
                            textView.setText(jb6.M0(2131750660, null));
                            str3 = jb6.M0(2131750659, null);
                        } else {
                            textView.setText(jb6.M0(2131750662, null));
                            str3 = jb6.M0(2131750661, null);
                        }
                    } else if (F != 4) {
                        s09Var.setAutoRepeat(true);
                        M0 = jb6.M0(2131750745, null);
                        textView.setText(jb6.M0(2131750746, null));
                        i2 = R.raw.filter_new;
                    } else {
                        s09Var.setAutoRepeat(false);
                        textView.setText(jb6.M0(2131750658, null));
                        str3 = jb6.M0(2131750657, null);
                    }
                    s09Var.setVisibility(0);
                    if (ml3Var.r == 1) {
                        if (ml3Var.d) {
                            ml3Var.a = 1.0f;
                            String M02 = jb6.M0(2131747963, null);
                            if (gm.O1() && !gm.N1()) {
                                M02 = M02.replace('\n', ' ');
                            }
                            blbVar.a(M02, true, false);
                            ml3Var.requestLayout();
                        } else {
                            ml3Var.a(true);
                        }
                    }
                    if (ml3Var.s != i3) {
                        s09Var.f(i3, 100, 100, null);
                        s09Var.d();
                        ml3Var.s = i3;
                    }
                    if (gm.O1() && !gm.N1()) {
                        str3 = str3.replace('\n', ' ');
                    }
                    blbVar.a(str3, false, false);
                }
                int i10 = i2;
                str3 = M0;
                i3 = i10;
                s09Var.setVisibility(0);
                if (ml3Var.r == 1) {
                }
                if (ml3Var.s != i3) {
                }
                if (gm.O1()) {
                    str3 = str3.replace('\n', ' ');
                }
                blbVar.a(str3, false, false);
            }
            int i11 = this.h;
            if (i11 != 7) {
                byte b = 8;
                if (i11 != 8 && this.b0 != 4) {
                    ml3Var.setOnUtyanAnimationEndListener(new rk3(this, objArr == true ? 1 : 0));
                    ml3Var.setOnUtyanAnimationUpdateListener(new gx(this, b));
                    if (!ml3Var.d && this.f == 0) {
                        nk3Var.T4(0.0f);
                        for (mk3 mk3Var : nk3Var.f0) {
                            ((u46) mk3Var.a.getLayoutManager()).u = true;
                        }
                    }
                    if (this.d == null || i9 != 0) {
                        if (this.e) {
                            if (this.f == 0) {
                                ml3Var.a(false);
                            }
                        } else if (ml3Var.d && this.b0 == 0) {
                            ValueAnimator valueAnimator = ml3Var.e;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ml3Var.d = false;
                            ValueAnimator duration = ValueAnimator.ofFloat(ml3Var.a, 0.0f).setDuration(250L);
                            ml3Var.e = duration;
                            duration.setInterpolator(vt3.d);
                            ml3Var.e.addUpdateListener(new kl3(ml3Var, (byte) 1));
                            ml3Var.e.addListener(new ll3(ml3Var, (byte) 0));
                            ml3Var.e.start();
                        }
                    } else if (!ml3Var.d) {
                        ml3Var.a(true);
                    }
                }
            }
        } else if (i4 == 6) {
            ((w8c) view).d((TLRPC.User) J(i), null, null, false);
        } else if (i4 == 7) {
            jf5 jf5Var = (jf5) view;
            int i12 = this.h;
            if (i12 != 11 && i12 != 12 && i12 != 13) {
                jf5Var.setText(jb6.M0((this.f == 0 && this.e) ? 2131751741 : 2131742489, null));
            } else if (i == 0) {
                jf5Var.setText(jb6.M0(2131749006, null));
            } else {
                jf5Var.setText(jb6.M0(2131749005, null));
            }
        } else if (i4 != 11) {
            TLRPC.RequestPeerType requestPeerType = this.U;
            if (i4 != 12) {
                switch (i4) {
                    case 14:
                        jf5 jf5Var2 = (jf5) view;
                        jf5Var2.setTextSize(14.0f);
                        if (jf5Var2.getTextView() != null) {
                            anb.X(jf5Var2.getTextView(), cmb.x6, null);
                        } else {
                            jf5Var2.setTextColor(cmb.w0(null, cmb.x6, false));
                        }
                        anb.h(cmb.d7, null, jf5Var2);
                        byte b2 = ((ik3) J(i)).a;
                        if (b2 != 0) {
                            if (b2 != 1) {
                                if (b2 == 2) {
                                    jf5Var2.setText(jb6.M0(2131750711, null));
                                    break;
                                }
                            } else {
                                jf5Var2.setText(jb6.M0(2131748061, null));
                                break;
                            }
                        } else {
                            jf5Var2.setText(jb6.M0(2131748062, null));
                            break;
                        }
                        break;
                    case 15:
                        ((na9) view).set(requestPeerType);
                        break;
                    case 16:
                        ((vl3) view).set(requestPeerType);
                        break;
                    case 17:
                        nl3 nl3Var = (nl3) view;
                        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = ((xk3) this.N.get(i)).i;
                        if (tL_chatlists_chatlistUpdates != null) {
                            int size = tL_chatlists_chatlistUpdates.missing_peers.size();
                            nl3Var.b(gm.N2(jb6.G(size, "FolderUpdatesTitle", new Object[0]), cmb.H6, 0, null, null), jb6.G(size, "FolderUpdatesSubtitle", new Object[0]));
                            break;
                        }
                        break;
                    default:
                        switch (i4) {
                            case 20:
                                l55 l55Var = (l55) view;
                                if (nk3Var.O0) {
                                    if (i == 0) {
                                        l55Var.setText(jb6.M0(nk3Var.R0 != 0 ? 2131745995 : 2131745993, null));
                                        break;
                                    } else {
                                        l55Var.setText(jb6.M0(2131745992, null));
                                        break;
                                    }
                                } else if (this.h == 3) {
                                    if (i == 0) {
                                        l55Var.setText(jb6.M0(2131750518, null));
                                        break;
                                    } else {
                                        l55Var.setText(jb6.M0(2131745992, null));
                                        break;
                                    }
                                }
                                break;
                            case 21:
                                hg3 hg3Var2 = (hg3) view;
                                cg3 cg3Var = new cg3();
                                cg3Var.a = jb6.M0(2131744460, null);
                                cg3Var.b = jb6.M0(2131744461, null);
                                hg3Var2.t2 = false;
                                hg3Var2.u2 = false;
                                hg3Var2.setDialog(cg3Var);
                                if (hg3Var2.getMeasuredHeight() > 0 && hg3Var2.getMeasuredHeight() != hg3Var2.E()) {
                                    hg3Var2.requestLayout();
                                    break;
                                }
                                break;
                            case 22:
                                ((jf5) view).setText((String) J(i));
                                break;
                            case 23:
                                Object J2 = J(i);
                                hg3 hg3Var3 = (hg3) view;
                                if (J2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat3 = (TLRPC.Chat) J2;
                                    hg3Var3.R0 = sd2.e0(i5, chat3);
                                    hg3Var3.setCustomMessageWithoutRebuild(jb6.G(chat3.participants_count, "Members", new Object[0]));
                                    hg3Var3.e0(-chat3.id, null, 0, false, false);
                                    break;
                                } else {
                                    TLRPC.User user = (TLRPC.User) J2;
                                    hg3Var3.R0 = sd2.f0(i5, user);
                                    hg3Var3.setCustomMessageWithoutRebuild(jb6.M0(2131753121, null));
                                    hg3Var3.e0(user.id, null, 0, false, false);
                                    break;
                                }
                        }
                }
            } else {
                if (!(view instanceof xib)) {
                    return;
                }
                xib xibVar = (xib) view;
                int i13 = cmb.p6;
                xibVar.g(i13, i13);
                if (requestPeerType == null) {
                    xibVar.o(R.drawable.msg_groups_create, jb6.M0(2131751684, null), this.f != 0);
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    xibVar.o(R.drawable.msg_channel_create, jb6.M0(2131751689, null), true);
                } else {
                    xibVar.o(R.drawable.msg_groups_create, jb6.M0(2131751683, null), true);
                }
                xibVar.y = true;
                xibVar.setOffsetFromImage(75);
            }
        } else {
            njb njbVar = (njb) view;
            njbVar.setText(jb6.M0(2131743952, null));
            if (this.P == null) {
                Drawable drawable = this.c.getResources().getDrawable(R.drawable.arrow_newchat);
                this.P = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(cmb.w0(null, cmb.A6, false), PorterDuff.Mode.MULTIPLY));
            }
            l66 textView2 = njbVar.getTextView();
            if (textView2 != null) {
                anb.x(textView2, this.P, cmb.A6, null, PorterDuff.Mode.MULTIPLY);
            }
            textView2.setCompoundDrawablePadding(gm.L(4.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, nk3Var.R3 ? null : this.P, (Drawable) null);
            textView2.getLayoutParams().width = -2;
        }
        if (i < this.f + 1) {
        }
    }

    @Override // dg3
    public final void u(hg3 hg3Var) {
        this.S.c5(hg3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13, types: [tk4] */
    /* JADX WARN: Type inference failed for: r2v14, types: [a6, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.view.View, hg0, ng3] */
    /* JADX WARN: Type inference failed for: r2v16, types: [ml3] */
    /* JADX WARN: Type inference failed for: r2v17, types: [w8c] */
    /* JADX WARN: Type inference failed for: r2v18, types: [android.view.View, jf5] */
    /* JADX WARN: Type inference failed for: r2v19, types: [android.view.View, bba] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v20, types: [yk3] */
    /* JADX WARN: Type inference failed for: r2v21, types: [android.view.View, vk3] */
    /* JADX WARN: Type inference failed for: r2v22, types: [android.view.View, jf5] */
    /* JADX WARN: Type inference failed for: r2v23, types: [android.view.View, android.widget.LinearLayout, na9] */
    /* JADX WARN: Type inference failed for: r2v24, types: [uk3] */
    /* JADX WARN: Type inference failed for: r2v25, types: [nl3] */
    /* JADX WARN: Type inference failed for: r2v26, types: [o72] */
    /* JADX WARN: Type inference failed for: r2v27, types: [android.view.ViewGroup, yk3] */
    /* JADX WARN: Type inference failed for: r2v28, types: [l55] */
    /* JADX WARN: Type inference failed for: r2v29, types: [jf5] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v32, types: [android.view.View, xib] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.ViewGroup, jf5] */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        int i2;
        ylb ylbVar;
        ?? r2;
        hg3 hg3Var;
        byte b = 2;
        nk3 nk3Var = this.S;
        long j = this.W;
        byte b2 = 0;
        Context context = this.c;
        switch (i) {
            case 0:
            case 21:
                int i3 = this.h;
                if (i3 == 2 || i3 == 15) {
                    i2 = 15;
                    ylbVar = null;
                    r2 = new ut8(context, null);
                } else {
                    i2 = 15;
                    ylbVar = null;
                    hg3 hg3Var2 = new hg3(nk3Var, this.c, false, this.G, null);
                    if (O()) {
                        sk3 sk3Var = new sk3(this, b2);
                        hg3Var2.K1 = true;
                        hg3Var2.L1 = sk3Var;
                    }
                    hg3Var2.setArchivedPullAnimation(this.M);
                    hg3Var2.setPreloader(this.Q);
                    hg3Var2.setDialogCellDelegate(this);
                    hg3Var2.setIsTransitionSupport(this.T);
                    if (i == 21) {
                        hg3Var2.H = new vca(hg3Var2.getContext(), hg3Var2, false, R.drawable.forward_to_stories, hg3Var2.K4);
                        hg3Var2.G = true;
                    }
                    if (j != 0) {
                        hg3Var2.P0 = true;
                    }
                    r2 = hg3Var2;
                }
                if (this.h == i2) {
                    anb.h(cmb.c6, ylbVar, r2);
                    break;
                }
                break;
            case 1:
            case 13:
                r2 = new tk4(context, null);
                r2.setIsSingleCell(true);
                r3 = i == 13 ? (byte) 18 : (byte) 7;
                r2.setViewType(r3);
                if (r3 == 18) {
                    r2.setIgnoreHeightCheck(true);
                }
                if (i == 13) {
                    r2.setItemsCount((int) ((gm.q.y * 0.5f) / gm.L(64.0f)));
                    break;
                }
                break;
            case 2:
                ?? jf5Var = new jf5(context);
                jf5Var.setText(jb6.M0(2131746093, null));
                TextView textView = new TextView(context);
                ts2.s(textView, 1, 15.0f);
                wi8.x(textView, cmb.K6, null, null, 2131746092);
                textView.setGravity((jb6.a0 ? 3 : 5) | 16);
                jf5Var.addView(textView, qoe.d(-1, -1.0f, (jb6.a0 ? 3 : 5) | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new sf3(this, b));
                hg3Var = jf5Var;
                r2 = hg3Var;
                break;
            case 3:
                r2 = new a6(context, (byte) 11);
                anb.h(cmb.Z6, null, r2);
                View view = new View(context);
                anb.Z(view, context, R.drawable.greydivider, cmb.a7);
                r2.addView(view, qoe.c(-1.0f, -1));
                break;
            case 4:
                r2 = new ng3(context);
                ImageReceiver imageReceiver = new ImageReceiver(r2);
                r2.h = imageReceiver;
                r2.n = new pc0((ylb) null);
                r2.x = gm.L(40.0f);
                r2.G = gm.L(10.0f);
                r2.I = z8c.t0;
                cmb.S(context);
                imageReceiver.q0(gm.L(26.0f));
                break;
            case 5:
                r2 = new ml3(context);
                break;
            case 6:
                r2 = new w8c(context, 8, 0, false);
                break;
            case 7:
                r2 = new jf5(context);
                if (!nk3Var.O0) {
                    r2.setPadding(0, 0, 0, gm.L(12.0f));
                    break;
                }
                break;
            case 8:
                r2 = new bba(context, (hg9) null);
                Drawable W0 = cmb.W0(context, R.drawable.greydivider, cmb.a7);
                sn2 sn2Var = new sn2(new ColorDrawable(cmb.w0(null, cmb.Z6, false)), W0);
                sn2Var.x = true;
                r2.setBackgroundDrawable(sn2Var);
                E(r2, W0);
                break;
            case 9:
            case 12:
            default:
                r2 = new xib(context);
                if (this.h == 15) {
                    anb.h(cmb.c6, null, r2);
                    break;
                }
                break;
            case 10:
                r2 = new yk3(this, context);
                break;
            case 11:
                r2 = new vk3(this, context);
                Drawable W02 = cmb.W0(context, R.drawable.greydivider, cmb.a7);
                sn2 sn2Var2 = new sn2(new ColorDrawable(cmb.w0(null, cmb.Z6, false)), W02);
                sn2Var2.x = true;
                r2.setBackgroundDrawable(sn2Var2);
                E(r2, W02);
                break;
            case 14:
                r2 = new jf5(this.c, cmb.e7, 16, 0, false, null);
                r2.setHeight(32);
                r2.setClickable(false);
                break;
            case 15:
                r2 = new na9(context);
                r2.b = new ArrayList();
                r2.setOrientation(1);
                anb.h(cmb.Z6, null, r2);
                break;
            case 16:
                r2 = new uk3(this, context);
                break;
            case 17:
                r2 = new nl3(context);
                break;
            case 18:
                r2 = new o72(context, r3);
                break;
            case 19:
                r2 = new yk3(this, context);
                r2.addView(new ys(this.c, this.G, null, new rk3(this, (byte) 1), null), qoe.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r2 = new l55(context, null);
                break;
            case 22:
                r2 = new jf5(context);
                break;
            case 23:
                hg3 hg3Var3 = new hg3(nk3Var, this.c, false, this.G, null);
                hg3Var = hg3Var3;
                if (j != 0) {
                    hg3Var3.P0 = true;
                    hg3Var3.Q0 = true;
                    hg3Var = hg3Var3;
                }
                r2 = hg3Var;
                break;
        }
        r2.setLayoutParams(new g69(-1, (i == 5 || i == 19) ? -1 : -2));
        return new b59(r2);
    }

    @Override // y59
    public final void y(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof hg3) {
            hg3 hg3Var = (hg3) view;
            hg3Var.a0(this.I, false);
            hg3Var.d0(this.y.contains(Long.valueOf(hg3Var.getDialogId())), false);
        }
    }

    public void K() {
    }

    public void L() {
    }

    public void M(TLRPC.User user) {
    }

    public void o(hg3 hg3Var) {
    }

    public void v(hg3 hg3Var) {
    }
}
