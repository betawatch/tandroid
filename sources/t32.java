// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class t32 extends y69 {
    public ph4 E;
    public long F;
    public long G;
    public int H;
    public String J;
    public String K;
    public String L;
    public boolean T;
    public int U;
    public boolean W;
    public final /* synthetic */ u32 Y;
    public final Context r;
    public o32 w;
    public dy1 x;
    public long y;
    public ArrayList s = new ArrayList();
    public final qg4 I = new qg4(0, 0);
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final ArrayList O = new ArrayList();
    public final SparseArray P = new SparseArray();
    public final ArrayList Q = new ArrayList();
    public final HashMap R = new HashMap();
    public final ArrayList S = new ArrayList();
    public final pn V = new pn(null);
    public final p1 X = new p1(this, 15);

    public t32(u32 u32Var, Context context) {
        this.Y = u32Var;
        this.r = context;
    }

    @Override // l69
    public final String F(int i) {
        return null;
    }

    @Override // l69
    public final void G(d79 d79Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // y69
    public final int M(int i) {
        if (i == 0) {
            return this.s.size();
        }
        int i2 = i - 1;
        ArrayList arrayList = this.Q;
        int i3 = 1;
        if (i2 >= arrayList.size()) {
            return 1;
        }
        ArrayList arrayList2 = (ArrayList) this.R.get(arrayList.get(i2));
        if (arrayList2 == null) {
            return 0;
        }
        int size = arrayList2.size();
        if (i2 == 0 && this.s.isEmpty()) {
            i3 = 0;
        }
        return size + i3;
    }

    @Override // y69
    public final Object O(int i, int i2) {
        ArrayList arrayList;
        if (i == 0) {
            if (i2 < this.s.size()) {
                return this.s.get(i2);
            }
            return null;
        }
        int i3 = i - 1;
        ArrayList arrayList2 = this.Q;
        if (i3 >= arrayList2.size() || (arrayList = (ArrayList) this.R.get(arrayList2.get(i3))) == null) {
            return null;
        }
        int i4 = i2 - ((i3 == 0 && this.s.isEmpty()) ? 0 : 1);
        if (i4 < 0 || i4 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i4);
    }

    @Override // y69
    public final int P(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        if (i == R() - 1) {
            return 3;
        }
        int i3 = i - 1;
        if (i3 < this.Q.size()) {
            return (!(i3 == 0 && this.s.isEmpty()) && i2 == 0) ? 0 : 4;
        }
        return 2;
    }

    @Override // y69
    public final int R() {
        ArrayList arrayList = this.Q;
        if (arrayList.isEmpty()) {
            return 2;
        }
        return arrayList.size() + (!this.W ? 1 : 0) + 2;
    }

    @Override // y69
    public final View T(int i, View view) {
        vnb vnbVar = this.Y.a;
        p55 p55Var = (p55) view;
        if (p55Var == null) {
            p55Var = new p55(this.r, vnbVar);
            p55Var.setBackgroundColor(aob.v0(aob.e7, vnbVar) & (-218103809));
        }
        if (i == 0 || (i == 1 && this.s.isEmpty())) {
            p55Var.setAlpha(0.0f);
            return p55Var;
        }
        int i2 = i - 1;
        ArrayList arrayList = this.Q;
        if (i2 < arrayList.size()) {
            p55Var.setAlpha(1.0f);
            if (((ArrayList) this.R.get((String) arrayList.get(i2))) != null) {
                p55Var.setText((i2 != 0 || this.s.isEmpty()) ? ob6.e0(((r47) r0.get(0)).k.date, false) : ob6.M0(2131749306, null));
            }
        }
        return view;
    }

    @Override // y69
    public final void W(int i, int i2, f89 f89Var) {
        int i3 = i2;
        int i4 = f89Var.f;
        View view = f89Var.a;
        if (i4 == 2 || i4 == 3) {
            return;
        }
        HashMap hashMap = this.R;
        ArrayList arrayList = this.Q;
        boolean z = false;
        if (i4 == 0) {
            int i5 = i - 1;
            if (((ArrayList) hashMap.get((String) arrayList.get(i5))) != null) {
                ((p55) view).setText((i5 != 0 || this.s.isEmpty()) ? ob6.e0(((r47) r3.get(0)).k.date, false) : ob6.M0(2131749306, null));
                return;
            }
            return;
        }
        if (i4 == 1 || i4 == 4) {
            zea zeaVar = (zea) view;
            if (i == 0) {
                n32 n32Var = (n32) O(S(i3), Q(i3));
                int i6 = n32Var.a;
                if (i6 != 0) {
                    zeaVar.d(n32Var.b, n32Var.c, null, null, i6, false);
                } else {
                    zeaVar.d(n32Var.b, n32Var.c, n32Var.d.toUpperCase().substring(0, Math.min(n32Var.d.length(), 4)), n32Var.e, 0, false);
                }
                File file = n32Var.f;
                u32 u32Var = this.Y;
                if (file != null) {
                    zeaVar.b(u32Var.S.containsKey(file.toString()), !u32Var.V);
                    return;
                } else {
                    zeaVar.b(false, !u32Var.V);
                    return;
                }
            }
            int i7 = i - 1;
            if (i7 != 0 || !this.s.isEmpty()) {
                i3--;
            }
            ArrayList arrayList2 = (ArrayList) hashMap.get((String) arrayList.get(i7));
            if (arrayList2 != null) {
                r47 r47Var = (r47) arrayList2.get(i3);
                boolean z2 = zeaVar.getMessage() != null && zeaVar.getMessage().e1() == r47Var.e1();
                if (i3 != arrayList2.size() - 1 || (i7 == arrayList.size() - 1 && this.T)) {
                    z = true;
                }
                zeaVar.c(r47Var, z);
                zeaVar.getViewTreeObserver().addOnPreDrawListener(new s32(this, zeaVar, r47Var, z2, (byte) 0));
            }
        }
    }

    public final void Y(String str, boolean z) {
        long j;
        u32 u32Var = this.Y;
        m32 m32Var = u32Var.w;
        i32 i32Var = u32Var.r;
        dy1 dy1Var = this.x;
        if (dy1Var != null) {
            hl.r(dy1Var);
            this.x = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!this.s.isEmpty()) {
                this.s.clear();
            }
            if (i32Var.getAdapter() != m32Var) {
                i32Var.setAdapter(m32Var);
            }
            f();
        } else {
            dy1 dy1Var2 = new dy1(this, str, (byte) 14);
            this.x = dy1Var2;
            hl.d3(dy1Var2, 300L);
        }
        if (u32Var.a0 || !m32Var.f.isEmpty()) {
            return;
        }
        int i = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        while (true) {
            ArrayList arrayList = this.S;
            if (i >= arrayList.size()) {
                Z(j2, j3, j4, rh4.k3[2], str, z);
                return;
            }
            ph4 ph4Var = (ph4) arrayList.get(i);
            byte b = ph4Var.d;
            if (b == 4) {
                TLObject tLObject = ph4Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j = ((TLRPC.User) tLObject).id;
                } else if (tLObject instanceof TLRPC.Chat) {
                    j = -((TLRPC.Chat) tLObject).id;
                }
                j2 = j;
            } else if (b == 6) {
                nh4 nh4Var = ph4Var.g;
                j3 = nh4Var.b;
                j4 = nh4Var.c;
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Runnable, o32] */
    public final void Z(final long j, final long j2, final long j3, ph4 ph4Var, final String str, boolean z) {
        u32 u32Var = this.Y;
        i32 i32Var = u32Var.r;
        h32 h32Var = u32Var.M;
        Locale locale = Locale.ENGLISH;
        final String str2 = j + j2 + j3 + ((int) ph4Var.d) + str;
        String str3 = this.J;
        final boolean z2 = str3 != null && str3.equals(str2);
        boolean z3 = !z2 && z;
        this.E = ph4Var;
        this.y = j;
        this.F = j2;
        this.G = j3;
        o32 o32Var = this.w;
        if (o32Var != null) {
            hl.r(o32Var);
        }
        p1 p1Var = this.X;
        hl.r(p1Var);
        if (z2 && z) {
            return;
        }
        ArrayList arrayList = this.N;
        ArrayList arrayList2 = this.M;
        ArrayList arrayList3 = this.O;
        if (z3) {
            arrayList3.clear();
            this.Q.clear();
            this.R.clear();
            this.T = true;
            h32Var.setVisibility(0);
            f();
            this.U++;
            if (i32Var.getPinnedHeader() != null) {
                i32Var.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
        }
        this.T = true;
        f();
        if (!z2) {
            p1Var.run();
            h32Var.e(true, !z);
        }
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            arrayList2.clear();
            a0(null, null, false);
            return;
        }
        final int i = 1 + this.U;
        this.U = i;
        final k5 a = k5.a(yac.t0);
        ?? r0 = new Runnable() { // from class: o32
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                k5 k5Var;
                int i2;
                long j4;
                final ArrayList arrayList4;
                long j5;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                k5 k5Var2 = a;
                int i3 = k5Var2.a;
                final t32 t32Var = t32.this;
                ArrayList arrayList5 = t32Var.O;
                final long j6 = j;
                final String str4 = str;
                final long j7 = j2;
                long j8 = j3;
                final boolean z4 = z2;
                if (j6 != 0) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str4;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = t32Var.E.e;
                    tL_messages_search.peer = uc7.s1(i3).j1(j6);
                    if (j7 > 0) {
                        tL_messages_search.min_date = (int) (j7 / 1000);
                    }
                    if (j8 > 0) {
                        tL_messages_search.max_date = (int) (j8 / 1000);
                    }
                    if (z4 && str4.equals(t32Var.K) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((r47) c00.g(1, arrayList5)).e1();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    k5Var = k5Var2;
                    arrayList4 = null;
                    tL_messages_searchGlobal = tL_messages_search;
                } else {
                    if (TextUtils.isEmpty(str4)) {
                        k5Var = k5Var2;
                        i2 = 20;
                        j4 = j8;
                        arrayList4 = null;
                    } else {
                        ArrayList arrayList6 = new ArrayList();
                        j4 = j8;
                        k5Var = k5Var2;
                        i2 = 20;
                        kf7.a0(i3).M0(0, str4, arrayList6, new ArrayList(), new ArrayList(), null, -1);
                        arrayList4 = arrayList6;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i2;
                    tL_messages_searchGlobal2.q = str4;
                    tL_messages_searchGlobal2.filter = t32Var.E.e;
                    if (j7 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j7 / 1000);
                    }
                    if (j4 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j4 / 1000);
                    }
                    if (z4 && str4.equals(t32Var.K) && !arrayList5.isEmpty()) {
                        r47 r47Var = (r47) c00.g(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = r47Var.e1();
                        tL_messages_searchGlobal2.offset_rate = t32Var.H;
                        TLRPC.Peer peer = r47Var.k.peer_id;
                        long j9 = peer.channel_id;
                        if (j9 == 0) {
                            j9 = peer.chat_id;
                            if (j9 == 0) {
                                j5 = peer.user_id;
                                tL_messages_searchGlobal2.offset_peer = uc7.s1(i3).j1(j5);
                                tL_messages_searchGlobal = tL_messages_searchGlobal2;
                            }
                        }
                        j5 = -j9;
                        tL_messages_searchGlobal2.offset_peer = uc7.s1(i3).j1(j5);
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                }
                t32Var.K = str4;
                t32Var.J = str2;
                final ArrayList arrayList7 = new ArrayList();
                rh4.C1(t32Var.K, arrayList7);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
                final int i4 = i;
                final k5 k5Var3 = k5Var;
                connectionsManager.sendRequest(tL_messages_searchGlobal, new RequestDelegate() { // from class: p32
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArrayList arrayList8 = new ArrayList();
                        k5 k5Var4 = k5Var3;
                        String str5 = str4;
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            int size = messages_messages.messages.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                r47 r47Var2 = new r47(k5Var4.a, messages_messages.messages.get(i5), false, true);
                                r47Var2.J5(str5, true);
                                arrayList8.add(r47Var2);
                            }
                        }
                        hl.c3(new eg1(t32.this, i4, tL_error, tLObject, k5Var4, z4, str5, arrayList8, j6, j7, arrayList4, arrayList7));
                    }
                });
            }
        };
        this.w = r0;
        hl.d3(r0, (!z2 || arrayList3.isEmpty()) ? 350L : 0L);
        u32Var.K.setViewType(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        boolean z2;
        AnimatorSet animatorSet;
        u32 u32Var = this.Y;
        rh4 rh4Var = u32Var.I;
        int i = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            ArrayList arrayList3 = this.S;
            if (i >= arrayList3.size()) {
                break;
            }
            if (((ph4) arrayList3.get(i)).a()) {
                z3 = true;
            } else if (((ph4) arrayList3.get(i)).d == 4) {
                z4 = true;
            } else if (((ph4) arrayList3.get(i)).d == 6) {
                z5 = true;
            }
            i++;
        }
        boolean z6 = ((arrayList == null || arrayList.isEmpty()) && (arrayList2 == null || arrayList2.isEmpty())) ? false : true;
        if ((z3 || z6 || !z) && z6) {
            if (arrayList == null || arrayList.isEmpty() || z4) {
                arrayList = null;
            }
            if (arrayList2 == null || arrayList2.isEmpty() || z5) {
                arrayList2 = null;
            }
            if (arrayList != null || arrayList2 != null) {
                rh4Var.E1(arrayList, arrayList2, false);
                z2 = true;
                if (!z2) {
                    rh4Var.E1(null, null, false);
                }
                rh4Var.setEnabled(z2);
                Object tag = rh4Var.getTag();
                if (z2) {
                    if (tag == null) {
                        return;
                    }
                } else if (tag != null) {
                    return;
                }
                rh4Var.setTag(z2 ? 1 : null);
                animatorSet = u32Var.J;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (z2) {
                    rh4Var.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                u32Var.J = animatorSet2;
                i32 i32Var = u32Var.r;
                Property property = View.TRANSLATION_Y;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(i32Var, (Property<i32, Float>) property, !z2 ? hl.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(rh4Var, (Property<rh4, Float>) property, !z2 ? 0.0f : -hl.L(44.0f)), ObjectAnimator.ofFloat(u32Var.K, (Property<tk4, Float>) property, !z2 ? hl.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(u32Var.M, (Property<h32, Float>) property, z2 ? hl.L(44.0f) : 0.0f));
                u32Var.J.addListener(new jb1((Object) this, (byte) 16));
                u32Var.J.setInterpolator(k43.g);
                u32Var.J.setDuration(180L);
                u32Var.J.start();
            }
        }
        z2 = false;
        if (!z2) {
        }
        rh4Var.setEnabled(z2);
        Object tag2 = rh4Var.getTag();
        if (z2) {
        }
        rh4Var.setTag(z2 ? 1 : null);
        animatorSet = u32Var.J;
        if (animatorSet != null) {
        }
        if (z2) {
        }
        AnimatorSet animatorSet22 = new AnimatorSet();
        u32Var.J = animatorSet22;
        i32 i32Var2 = u32Var.r;
        Property property2 = View.TRANSLATION_Y;
        animatorSet22.playTogether(ObjectAnimator.ofFloat(i32Var2, (Property<i32, Float>) property2, !z2 ? hl.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(rh4Var, (Property<rh4, Float>) property2, !z2 ? 0.0f : -hl.L(44.0f)), ObjectAnimator.ofFloat(u32Var.K, (Property<tk4, Float>) property2, !z2 ? hl.L(44.0f) : 0.0f), ObjectAnimator.ofFloat(u32Var.M, (Property<h32, Float>) property2, z2 ? hl.L(44.0f) : 0.0f));
        u32Var.J.addListener(new jb1((Object) this, (byte) 16));
        u32Var.J.setInterpolator(k43.g);
        u32Var.J.setDuration(180L);
        u32Var.J.start();
    }

    @Override // y69, j79
    public final void f() {
        X(false);
        this.Y.X();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        p55 p55Var;
        View view;
        vnb vnbVar = this.Y.a;
        Context context = this.r;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    tk4 tk4Var = new tk4(context, vnbVar);
                    tk4Var.setViewType(3);
                    tk4Var.setIsSingleCell(true);
                    p55Var = tk4Var;
                } else if (i != 4) {
                    view = new View(context);
                    view.setTag(-33024);
                    return qu6.h(view, view, -1, -2);
                }
            }
            zea zeaVar = new zea(i == 1 ? 1 : 2, vnbVar, context);
            zeaVar.setDrawDownloadIcon(false);
            view = zeaVar;
            return qu6.h(view, view, -1, -2);
        }
        p55Var = new p55(context, vnbVar);
        view = p55Var;
        return qu6.h(view, view, -1, -2);
    }
}
