package vh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.ul;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r6 extends FrameLayout implements View.OnClickListener, us {
    public final org.telegram.ui.Cells.z3 D;
    public final uc0 E;
    public boolean F;
    public org.telegram.ui.ActionBar.x1 G;
    public long H;
    public String I;
    public final ArrayList J;
    public final ArrayList K;
    public final ArrayList L;
    public boolean M;
    public boolean N;
    public float O;
    public ValueAnimator P;
    public boolean Q;
    public int R;
    public boolean S;
    public int T;
    public boolean U;
    public boolean V;
    public final /* synthetic */ w6 W;
    public int a;
    public final a0.h b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final tk0 f;
    public final s4.a0 h;
    public final n6 n;
    public final p6 r;
    public final View s;
    public final d w;
    public final d x;
    public final k6 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(w6 w6Var, Context context) {
        super(context);
        this.W = w6Var;
        this.b = new a0.h();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.R = -1;
        int i10 = w6.U1;
        org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(context, w6Var.I0);
        this.D = z3Var;
        k6 k6Var = new k6(this, context, w6Var.I0, new i6(this, 4));
        this.y = k6Var;
        int i11 = org.telegram.ui.ActionBar.t6.h5;
        org.telegram.ui.ActionBar.a7.i(i11, k6Var, w6Var.I0);
        k6Var.setOnSearchTextChange(new j6(this, 3));
        uc0 uc0Var = new uc0(context, w6Var.I0);
        this.E = uc0Var;
        uc0Var.h = new i6(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.i0.L(56.0f) + org.telegram.messenger.i0.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.b6.e(-1, -1, zs.E1));
        tk0 tk0Var = new tk0(context, w6Var.I0);
        this.f = tk0Var;
        tk0Var.setClipToPadding(false);
        tk0Var.setTranslateSelector(true);
        int i12 = 2;
        n6 n6Var = new n6(this, context, w6Var.I0, k6Var, new th.r2(w6Var, i12));
        this.n = n6Var;
        tk0Var.setAdapter(n6Var);
        n6Var.h = tk0Var;
        s4.a0 a0Var = new s4.a0();
        this.h = a0Var;
        tk0Var.setLayoutManager(a0Var);
        tk0Var.setOnScrollListener(new ul(i12, this));
        tk0Var.setOnItemClickListener(new org.telegram.ui.web.k0(24, this, context));
        frameLayout.addView(tk0Var, w7.b6.c(-1.0f, -1));
        l6 l6Var = new l6(this);
        l6Var.n(350L);
        l6Var.o(gr.h);
        l6Var.C = false;
        l6Var.m = false;
        tk0Var.setItemAnimator(l6Var);
        frameLayout.addView(k6Var, w7.b6.e(-1, -2, 55));
        frameLayout.addView(z3Var, w7.b6.e(-1, 32, 55));
        addView(uc0Var, w7.b6.e(-1, -2, 55));
        p6 p6Var = new p6(this, context);
        this.r = p6Var;
        p6Var.setClickable(true);
        p6Var.setOrientation(1);
        p6Var.setPadding(org.telegram.messenger.i0.L(10.0f) + w6Var.t0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f) + w6Var.t0, org.telegram.messenger.i0.L(10.0f));
        org.telegram.ui.ActionBar.a7.i(i11, p6Var, w6Var.I0);
        d dVar = new d(context, w6Var.I0, true);
        this.w = dVar;
        dVar.setOnClickListener(new h6(this, 0));
        dVar.f();
        p6Var.addView(dVar, w7.b6.r(-1, 48, 87));
        d dVar2 = new d(context, w6Var.I0, false);
        this.x = dVar2;
        dVar2.setOnClickListener(new h6(this, 1));
        dVar2.f();
        p6Var.addView(dVar2, w7.b6.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        org.telegram.ui.ActionBar.a7.i(i11, view, w6Var.I0);
        addView(view, w7.b6.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(p6Var, w7.b6.e(-1, -2, 87));
    }

    public static boolean d(String str, TLObject tLObject) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            String lowerCase = org.telegram.messenger.i0.N3(h20.p(user)).toLowerCase();
            if (lowerCase.startsWith(str) || sc.e.y(" ", str, lowerCase)) {
                return true;
            }
            String lowerCase2 = org.telegram.messenger.i0.N3(h20.n(user)).toLowerCase();
            if (lowerCase2.startsWith(str) || sc.e.y(" ", str, lowerCase2)) {
                return true;
            }
            ArrayList<TLRPC.TL_username> arrayList = user.usernames;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = arrayList.get(i10);
                    if (tL_username.active && org.telegram.messenger.i0.N3(tL_username.username).toLowerCase().startsWith(str)) {
                        return true;
                    }
                }
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String lowerCase3 = org.telegram.messenger.i0.N3(chat.title).toLowerCase();
            if (lowerCase3.startsWith(str) || sc.e.y(" ", str, lowerCase3)) {
                return true;
            }
            String lowerCase4 = org.telegram.messenger.i0.N3(org.telegram.messenger.w3.K(chat, false)).toLowerCase();
            if (lowerCase4.startsWith(str) || sc.e.y(" ", str, lowerCase4)) {
                return true;
            }
            ArrayList<TLRPC.TL_username> arrayList2 = chat.usernames;
            if (arrayList2 != null) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    TLRPC.TL_username tL_username2 = arrayList2.get(i11);
                    if (tL_username2.active && org.telegram.messenger.i0.N3(tL_username2.username).toLowerCase().startsWith(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void a(boolean z10) {
        if (this.a != 6) {
            return;
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        int i10 = w6.U1;
        arrayList.addAll(vp.r1(this.W.a).O1().L);
        int i11 = 0;
        while (true) {
            a0.h hVar = this.b;
            if (i11 >= hVar.m()) {
                break;
            }
            long j10 = hVar.j(i11);
            if (!((Boolean) hVar.n(i11)).booleanValue()) {
                arrayList.remove(Long.valueOf(j10));
            } else if (!arrayList.contains(Long.valueOf(j10))) {
                arrayList.add(Long.valueOf(j10));
            }
            i11++;
        }
        if (z10) {
            h(true);
            f(true);
            g(true);
        }
    }

    public final void b(int i10) {
        this.a = i10;
        this.b.b();
        ArrayList arrayList = this.c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        w6 w6Var = this.W;
        if (i10 == 4) {
            arrayList.addAll(w6Var.k1);
            hashMap.putAll(w6Var.l1);
        } else if (i10 == 5) {
            arrayList.addAll(w6Var.A1);
        } else if (i10 == 1) {
            ArrayList J0 = w6.J0(w6Var);
            for (int i11 = 0; i11 < J0.size(); i11 = c3.i0.k(i11, 1, ((TLRPC.User) J0.get(i11)).id, arrayList)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(w6Var.n1);
        } else if (i10 == 3) {
            arrayList.addAll(w6Var.o1);
            hashMap.putAll(w6Var.p1);
        } else if (i10 == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.k1(false);
        j(false);
        k6 k6Var = this.y;
        k6Var.setText("");
        k6Var.setVisibility(i10 == 0 ? 8 : 0);
        k6Var.L = true;
        this.I = null;
        h(false);
        f(false);
        g(false);
        int i12 = this.a;
        tk0 tk0Var = this.f;
        if (i12 != 0) {
            tk0Var.v0(0);
        }
        tk0Var.requestLayout();
        this.R = -1;
    }

    public final float c() {
        int i10 = 0;
        float f7 = -i0.a.d(150.0f, Math.min(org.telegram.messenger.i0.L(150.0f), this.y.K), 0);
        while (true) {
            tk0 tk0Var = this.f;
            if (i10 >= tk0Var.getChildCount()) {
                return f7;
            }
            View childAt = tk0Var.getChildAt(i10);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                return Math.max(f7, childAt.getY());
            }
            i10++;
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.x1 x1Var;
        if (i10 != zs.T || (chatFull = (TLRPC.ChatFull) objArr[0]) == null || (x1Var = this.G) == null || this.H != chatFull.id) {
            return;
        }
        x1Var.c(350L);
        this.G = null;
        this.H = -1L;
        e(chatFull.id, chatFull.participants);
    }

    public final void e(long j10, TLRPC.ChatParticipants chatParticipants) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = this.a;
        int i11 = 0;
        boolean z10 = i10 == 1 || i10 == 2;
        w6 w6Var = this.W;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i12 = 0; i12 < chatParticipants.participants.size(); i12++) {
                long j11 = chatParticipants.participants.get(i12).user_id;
                int i13 = w6.U1;
                TLRPC.User Z1 = vp.r1(w6Var.a).Z1(Long.valueOf(j11));
                if (Z1 != null && !h20.B(Z1) && !Z1.bot && Z1.id != 777000 && j11 != 0) {
                    if (!z10 || Z1.contact) {
                        arrayList.add(Long.valueOf(j11));
                    } else {
                        arrayList2.add(Long.valueOf(j11));
                    }
                    this.c.remove(Long.valueOf(j11));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            this.d.put(Long.valueOf(j10), arrayList);
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                this.b.k(Boolean.TRUE, ((Long) obj).longValue());
            }
            j(true);
            f(true);
            g(true);
            this.y.L = true;
            return;
        }
        if (arrayList.isEmpty()) {
            Context context = getContext();
            int i14 = w6.U1;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, w6Var.I0);
            alertDialog$Builder.a.T = "All group members are not in your contact list.";
            alertDialog$Builder.h("Cancel", null);
            alertDialog$Builder.p();
            return;
        }
        Context context2 = getContext();
        int i15 = w6.U1;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, context2, w6Var.I0);
        alertDialog$Builder2.a.T = arrayList2.size() + " members are not in your contact list";
        alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new org.telegram.messenger.voip.d0(this, j10, arrayList, 11));
        alertDialog$Builder2.h("Cancel", null);
        alertDialog$Builder2.p();
    }

    public final void f(boolean z10) {
        int i10 = this.a;
        w6 w6Var = this.W;
        d dVar = this.x;
        int i11 = 0;
        d dVar2 = this.w;
        if (i10 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.c(0, z10);
            if (w6Var.C1) {
                dVar2.i(cd.L0(2131744573, null), z10, true);
            } else if (w6Var.Q1) {
                dVar2.i(cd.L0(2131744573, null), z10, true);
            } else {
                int i12 = w6Var.z1;
                if (i12 == 1) {
                    dVar2.i(cd.L0(w6Var.B1 ? 2131744638 : 2131744577, null), z10, true);
                } else {
                    dVar2.i(cd.H(',', "StoryPrivacyButtonPostMultiple", i12), z10, true);
                }
            }
            dVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.c;
        if (i10 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.i(cd.L0(2131744572, null), z10, true);
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        p6 p6Var = this.r;
        if (i10 == 3) {
            int size = w6.R0(arrayList, this.d).size();
            w6Var.q1 = size;
            dVar2.i(cd.L0(2131744573, null), z10, true);
            dVar2.setShowZero(false);
            p6Var.b(size <= 0, z10);
            dVar2.c(size, z10);
            dVar2.setEnabled(size > 0);
            dVar.setVisibility(8);
            return;
        }
        if (i10 == 2) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            if (arrayList.isEmpty()) {
                dVar2.i(cd.L0(2131744573, null), z10, true);
                dVar2.c(0, z10);
            } else {
                dVar2.i(cd.L0(2131744578, null), z10, true);
                dVar2.c(arrayList.size(), z10);
            }
            dVar.setVisibility(8);
            return;
        }
        if (i10 == 5) {
            dVar2.setShowZero(true);
            dVar2.setEnabled(!arrayList.isEmpty());
            dVar2.c(arrayList.size(), z10);
            dVar.setVisibility(8);
            return;
        }
        if (i10 != 6) {
            if (i10 == 4) {
                int size2 = w6.R0(w6Var.k1, w6Var.l1).size();
                w6Var.m1 = size2;
                dVar2.i(cd.L0(2131744573, null), z10, true);
                dVar2.setShowZero(false);
                p6Var.b(false, z10);
                dVar2.c(size2, z10);
                dVar2.setEnabled(true);
                dVar.setVisibility(8);
                return;
            }
            return;
        }
        dVar2.setShowZero(false);
        dVar2.setEnabled(true);
        dVar2.i(cd.L0(2131744572, null), z10, true);
        int i13 = w6.U1;
        th.e5 O1 = vp.r1(w6Var.a).O1();
        if (!O1.O) {
            while (true) {
                a0.h hVar = this.b;
                if (i11 >= hVar.m()) {
                    break;
                }
                long j10 = hVar.j(i11);
                ((Boolean) hVar.n(i11)).getClass();
                O1.L.contains(Long.valueOf(j10));
                i11++;
            }
        } else {
            dVar2.c(arrayList.size(), z10);
        }
        dVar.setVisibility(8);
    }

    public final void g(boolean z10) {
        ArrayList arrayList;
        int R;
        w6 w6Var = this.W;
        ArrayList arrayList2 = w6Var.A1;
        HashMap hashMap = w6Var.p1;
        ArrayList arrayList3 = w6Var.o1;
        ArrayList arrayList4 = w6Var.n1;
        HashMap hashMap2 = w6Var.l1;
        ArrayList arrayList5 = w6Var.k1;
        int i10 = this.a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.c;
        if (i10 == 4) {
            arrayList5.clear();
            hashMap2.clear();
            arrayList5.addAll(arrayList6);
            hashMap2.putAll(hashMap3);
        } else if (i10 == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList6);
        } else if (i10 == 3) {
            arrayList3.clear();
            hashMap.clear();
            arrayList3.addAll(arrayList6);
            hashMap.putAll(hashMap3);
        } else if (i10 == 0) {
            arrayList2.clear();
            arrayList2.addAll(arrayList6);
        }
        if (this.a == 3 && (w6Var.E1 != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i11 = this.R;
                if (i11 != -1) {
                    w6Var.E1 = i11;
                }
            } else {
                this.R = w6Var.E1;
                w6Var.E1 = 3;
            }
        }
        HashSet R0 = w6.R0(arrayList6, hashMap3);
        int i12 = 0;
        while (true) {
            arrayList = this.L;
            if (i12 >= arrayList.size()) {
                break;
            }
            g6 g6Var = (g6) arrayList.get(i12);
            if (g6Var != null) {
                int i13 = g6Var.i;
                if (i13 > 0) {
                    g6Var.k = w6Var.E1 == i13;
                    g6Var.l = false;
                } else {
                    TLRPC.User user = g6Var.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        g6Var.k = contains;
                        g6Var.l = !contains && R0.contains(Long.valueOf(g6Var.g.id));
                    } else {
                        TLRPC.Chat chat = g6Var.h;
                        if (chat != null) {
                            g6Var.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            g6Var.l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            tk0 tk0Var = this.f;
            if (i14 >= tk0Var.getChildCount()) {
                i(z10);
                return;
            }
            View childAt = tk0Var.getChildAt(i14);
            if ((childAt instanceof v6) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                g6 g6Var2 = (g6) arrayList.get(R);
                v6 v6Var = (v6) childAt;
                v6Var.c(g6Var2.k || g6Var2.l, z10);
                TLRPC.Chat chat2 = g6Var2.h;
                if (chat2 != null) {
                    v6Var.b(z10, w6.K0(w6Var, chat2) > 200 ? 0.3f : 1.0f);
                } else {
                    if (g6Var2.l && !g6Var2.k) {
                        r8 = 0.5f;
                    }
                    v6Var.b(z10, r8);
                }
            }
            i14++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0cbe  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0cc5  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(boolean z10) {
        float L;
        float L2;
        n6 n6Var;
        ArrayList arrayList;
        long j10;
        boolean z11;
        float f7;
        boolean z12;
        float f10;
        TLRPC.User Z1;
        TLRPC.Chat L0;
        int i10;
        ArrayList arrayList2;
        int i11;
        int i12;
        TLRPC.Chat L02;
        boolean z13;
        boolean z14;
        String G;
        float f11;
        boolean z15;
        boolean z16;
        boolean z17;
        String G2;
        String G3;
        w6 w6Var = this.W;
        ArrayList arrayList3 = w6Var.o1;
        ArrayList arrayList4 = w6Var.k1;
        ArrayList arrayList5 = w6Var.n1;
        HashSet hashSet = w6Var.r1;
        ArrayList arrayList6 = this.K;
        arrayList6.clear();
        ArrayList arrayList7 = this.L;
        arrayList6.addAll(arrayList7);
        arrayList7.clear();
        int i13 = this.a;
        org.telegram.ui.Cells.z3 z3Var = this.D;
        if (i13 != 0) {
            uc0 uc0Var = this.E;
            if (i13 == 1) {
                uc0Var.e(cd.L0(2131744592, null));
                uc0Var.d(true);
                ((org.telegram.ui.ActionBar.c2) uc0Var.e).c(false, 0.0f);
                arrayList7.add(g6.d());
                arrayList7.add(g6.c());
                arrayList7.size();
                arrayList7.add(g6.e());
                arrayList7.add(g6.f());
                L2 = org.telegram.messenger.i0.L(32.0f) + org.telegram.messenger.i0.L(56.0f) + 0.0f + org.telegram.messenger.i0.L(150.0f);
                z3Var.setText(cd.L0(2131744593, null));
                i(z10);
                this.F = true;
            } else if (i13 == 2) {
                uc0Var.e(cd.L0(2131744587, null));
                uc0Var.d(true);
                ((org.telegram.ui.ActionBar.c2) uc0Var.e).c(false, 0.0f);
                arrayList7.add(g6.d());
                arrayList7.add(g6.c());
                arrayList7.size();
                arrayList7.add(g6.e());
                arrayList7.add(g6.f());
                L2 = org.telegram.messenger.i0.L(32.0f) + org.telegram.messenger.i0.L(56.0f) + 0.0f + org.telegram.messenger.i0.L(150.0f);
                z3Var.setText(cd.L0(2131744588, null));
                i(z10);
                this.F = true;
            } else if (i13 == 3) {
                uc0Var.e(cd.L0(2131744585, null));
                uc0Var.d(true);
                ((org.telegram.ui.ActionBar.c2) uc0Var.e).c(false, 0.0f);
                arrayList7.add(g6.d());
                arrayList7.add(g6.c());
                arrayList7.size();
                arrayList7.add(g6.e());
                arrayList7.add(g6.f());
                L2 = org.telegram.messenger.i0.L(32.0f) + org.telegram.messenger.i0.L(56.0f) + 0.0f + org.telegram.messenger.i0.L(150.0f);
                z3Var.setText(cd.L0(2131744586, null));
                i(z10);
                this.F = true;
            } else if (i13 == 5) {
                uc0Var.e(cd.L0(2131744596, null));
                uc0Var.d(w6Var.F1);
                ((org.telegram.ui.ActionBar.c2) uc0Var.e).c(false, 0.0f);
                arrayList7.add(g6.d());
                arrayList7.add(g6.c());
                arrayList7.size();
                arrayList7.add(g6.e());
                arrayList7.add(g6.f());
                L2 = org.telegram.messenger.i0.L(32.0f) + org.telegram.messenger.i0.L(56.0f) + 0.0f + org.telegram.messenger.i0.L(150.0f);
                z3Var.setText(cd.L0(2131744597, null));
                i(z10);
                this.F = true;
            } else if (i13 == 6) {
                uc0Var.e(cd.L0(2131744594, null));
                uc0Var.d(true);
                ((org.telegram.ui.ActionBar.c2) uc0Var.e).c(false, 0.0f);
                arrayList7.add(g6.d());
                arrayList7.add(g6.c());
                arrayList7.size();
                arrayList7.add(g6.e());
                arrayList7.add(g6.f());
                L2 = org.telegram.messenger.i0.L(32.0f) + org.telegram.messenger.i0.L(56.0f) + 0.0f + org.telegram.messenger.i0.L(150.0f);
                z3Var.setText(cd.L0(2131744595, null));
                i(z10);
                this.F = true;
            } else if (i13 == 4) {
                uc0Var.e(cd.L0(2131744589, null));
                uc0Var.d(true);
                ((org.telegram.ui.ActionBar.c2) uc0Var.e).c(false, 0.0f);
                arrayList7.add(g6.d());
                arrayList7.add(g6.c());
                arrayList7.size();
                arrayList7.add(g6.e());
                arrayList7.add(g6.f());
                L = org.telegram.messenger.i0.L(56.0f) + 0.0f + org.telegram.messenger.i0.L(150.0f) + org.telegram.messenger.i0.L(32.0f);
                z3Var.setText(cd.L0(2131744590, null));
                i(z10);
                this.F = true;
                boolean isEmpty = TextUtils.isEmpty(this.I);
                if (this.a != 0) {
                    String lowerCase = org.telegram.messenger.i0.N3(this.I).toLowerCase();
                    int i14 = this.a;
                    if (i14 == 5) {
                        ArrayList arrayList8 = new ArrayList();
                        vp r12 = vp.r1(w6Var.a);
                        ArrayList arrayList9 = r12.y;
                        for (int i15 = 0; i15 < arrayList9.size(); i15++) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList9.get(i15);
                            if (r12.y(dialog)) {
                                if (org.telegram.messenger.o5.E(dialog.id)) {
                                    TLRPC.User Z12 = r12.Z1(Long.valueOf(dialog.id));
                                    if (Z12 != null && !Z12.bot && Z12.id != 777000 && !h20.B(Z12)) {
                                        arrayList8.add(Z12);
                                    }
                                } else if (org.telegram.messenger.o5.z(dialog.id) && (L02 = r12.L0(Long.valueOf(-dialog.id))) != null && !org.telegram.messenger.w3.c0(L02)) {
                                    arrayList8.add(L02);
                                }
                            }
                        }
                        z11 = isEmpty;
                        arrayList = arrayList8;
                        f10 = L;
                    } else {
                        boolean z18 = i14 == 1 || i14 == 2;
                        boolean z19 = w6Var.P1 && (i14 == 3 || i14 == 6);
                        vp r13 = vp.r1(w6Var.a);
                        HashMap hashMap = new HashMap();
                        arrayList = new ArrayList();
                        ArrayList arrayList10 = r13.y;
                        ConcurrentHashMap concurrentHashMap = org.telegram.messenger.i5.r(w6Var.a).f0;
                        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                            j10 = 777000;
                            if (w6Var.R1) {
                                z11 = isEmpty;
                                f7 = L;
                                z12 = z19;
                            } else {
                                f7 = L;
                                z12 = z19;
                                z11 = isEmpty;
                                org.telegram.messenger.i5.r(w6Var.a).A(0L, false);
                            }
                            w6Var.R1 = true;
                        } else {
                            z11 = isEmpty;
                            z12 = z19;
                            j10 = 777000;
                            f7 = L;
                        }
                        int i16 = 0;
                        while (i16 < arrayList10.size()) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList10.get(i16);
                            float f12 = f7;
                            if (org.telegram.messenger.o5.E(dialog2.id)) {
                                TLRPC.User Z13 = r13.Z1(Long.valueOf(dialog2.id));
                                if (Z13 != null && !Z13.bot && Z13.id != j10 && !h20.B(Z13) && !Z13.deleted && (!z18 || (concurrentHashMap != null && concurrentHashMap.get(Long.valueOf(Z13.id)) != null))) {
                                    hashMap.put(Long.valueOf(Z13.id), Boolean.TRUE);
                                    arrayList.add(Z13);
                                }
                            } else if (z12 && org.telegram.messenger.o5.z(dialog2.id) && (L0 = r13.L0(Long.valueOf(-dialog2.id))) != null && !org.telegram.messenger.w3.V(L0)) {
                                hashMap.put(Long.valueOf(-L0.id), Boolean.TRUE);
                                arrayList.add(L0);
                            }
                            i16++;
                            f7 = f12;
                        }
                        f10 = f7;
                        if (concurrentHashMap != null) {
                            Iterator it = concurrentHashMap.entrySet().iterator();
                            while (it.hasNext()) {
                                Long l4 = (Long) ((Map.Entry) it.next()).getKey();
                                l4.getClass();
                                if (!hashMap.containsKey(l4) && (Z1 = r13.Z1(l4)) != null && !Z1.bot && Z1.id != j10 && !h20.B(Z1)) {
                                    arrayList.add(Z1);
                                    hashMap.put(Long.valueOf(Z1.id), Boolean.TRUE);
                                }
                            }
                        }
                    }
                    ArrayList arrayList11 = this.c;
                    HashMap hashMap2 = this.d;
                    HashSet R0 = w6.R0(arrayList11, hashMap2);
                    ArrayList arrayList12 = this.J;
                    if (z11) {
                        if (!z10) {
                            arrayList12.clear();
                            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                TLObject tLObject = (TLObject) arrayList.get(i17);
                                if (tLObject instanceof TLRPC.User ? arrayList11.contains(Long.valueOf(((TLRPC.User) tLObject).id)) : tLObject instanceof TLRPC.Chat ? hashMap2.containsKey(Long.valueOf(((TLRPC.Chat) tLObject).id)) : false) {
                                    arrayList12.add(tLObject);
                                }
                            }
                        }
                        int i18 = 0;
                        int i19 = 0;
                        while (i18 < arrayList12.size()) {
                            TLObject tLObject2 = (TLObject) arrayList12.get(i18);
                            if (tLObject2 instanceof TLRPC.User) {
                                TLRPC.User user = (TLRPC.User) tLObject2;
                                boolean contains = arrayList11.contains(Long.valueOf(user.id));
                                i11 = i18;
                                i12 = i19;
                                g6 i20 = g6.i(user, contains, !contains && R0.contains(Long.valueOf(user.id)));
                                int i21 = this.a;
                                i20.m = i21 == 2 || i21 == 4;
                                arrayList7.add(i20);
                                f10 += org.telegram.messenger.i0.L(56.0f);
                            } else {
                                i11 = i18;
                                i12 = i19;
                                if (tLObject2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                                    boolean containsKey = hashMap2.containsKey(Long.valueOf(chat.id));
                                    float f13 = f10;
                                    g6 g6Var = new g6(3, true);
                                    g6Var.h = chat;
                                    g6Var.k = containsKey;
                                    int i22 = this.a;
                                    g6Var.m = i22 == 2 || i22 == 4;
                                    arrayList7.add(g6Var);
                                    f10 = f13 + org.telegram.messenger.i0.L(56.0f);
                                } else {
                                    i19 = i12;
                                    i18 = i11 + 1;
                                }
                            }
                            i19 = i12 + 1;
                            i18 = i11 + 1;
                        }
                        i10 = i19;
                    } else {
                        i10 = 0;
                    }
                    int i23 = 0;
                    while (i23 < arrayList.size()) {
                        TLObject tLObject3 = (TLObject) arrayList.get(i23);
                        if ((!z11 || !arrayList12.contains(tLObject3)) && d(lowerCase, tLObject3)) {
                            if (tLObject3 instanceof TLRPC.User) {
                                TLRPC.User user2 = (TLRPC.User) tLObject3;
                                boolean contains2 = arrayList11.contains(Long.valueOf(user2.id));
                                g6 i24 = g6.i(user2, contains2, !contains2 && R0.contains(Long.valueOf(user2.id)));
                                int i25 = this.a;
                                i24.m = i25 == 2 || i25 == 4;
                                arrayList7.add(i24);
                                f10 += org.telegram.messenger.i0.L(56.0f);
                                i10++;
                            } else if (tLObject3 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject3;
                                boolean containsKey2 = hashMap2.containsKey(Long.valueOf(chat2.id));
                                arrayList2 = arrayList11;
                                g6 g6Var2 = new g6(3, true);
                                g6Var2.h = chat2;
                                g6Var2.k = containsKey2;
                                int i26 = this.a;
                                g6Var2.m = i26 == 2 || i26 == 4;
                                arrayList7.add(g6Var2);
                                f10 += org.telegram.messenger.i0.L(56.0f);
                                i10++;
                                i23++;
                                arrayList11 = arrayList2;
                            }
                        }
                        arrayList2 = arrayList11;
                        i23++;
                        arrayList11 = arrayList2;
                    }
                    if (!z11) {
                        if (i10 == 0) {
                            arrayList7.add(new g6(5, false));
                            f10 += org.telegram.messenger.i0.L(150.0f);
                        }
                        tk0 tk0Var = this.f;
                        float measuredHeight = (tk0Var != null ? ((tk0Var.getMeasuredHeight() - tk0Var.getPaddingTop()) - tk0Var.getPaddingBottom()) + (w6Var.d ? this.T : 0) : ((org.telegram.messenger.i0.q.y - org.telegram.messenger.i0.L(56.0f)) - org.telegram.messenger.i0.n) - org.telegram.messenger.i0.L(42.0f)) - f10;
                        if (measuredHeight > 0.0f) {
                            g6 g6Var3 = new g6(-1, false);
                            g6Var3.p = (int) measuredHeight;
                            arrayList7.add(g6Var3);
                        }
                    }
                }
                if (this.h.t) {
                    Collections.reverse(arrayList7);
                }
                n6Var = this.n;
                if (n6Var != null) {
                    if (!z10 || w6Var.E1 == 0) {
                        n6Var.f();
                    } else {
                        n6Var.E(arrayList6, arrayList7);
                    }
                }
                this.e.invalidate();
            }
            L = L2;
            boolean isEmpty2 = TextUtils.isEmpty(this.I);
            if (this.a != 0) {
            }
            if (this.h.t) {
            }
            n6Var = this.n;
            if (n6Var != null) {
            }
            this.e.invalidate();
        }
        this.F = false;
        z3Var.setVisibility(8);
        int i27 = w6.U1;
        ArrayList arrayList13 = vp.r1(w6Var.a).O1().T;
        g6 g6Var4 = new g6(-1, false);
        g6Var4.o = 24;
        arrayList7.add(g6Var4);
        if (w6Var.C1) {
            String L03 = cd.L0(2131748799, null);
            g6 g6Var5 = new g6(11, false);
            g6Var5.e = L03;
            arrayList7.add(g6Var5);
            g6Var4.o = org.telegram.messenger.i0.L(72.0f) + g6Var4.o;
        } else if (w6Var.w1 && (w6Var.Q1 || arrayList13 == null || arrayList13.size() <= 1)) {
            String L04 = w6Var.Q1 ? cd.L0(2131744591, null) : cd.L0(w6Var.B1 ? 2131744639 : 2131744580, null);
            if (w6Var.B1) {
                G = cd.L0(2131744640, null);
            } else {
                int i28 = w6Var.H1;
                G = i28 != Integer.MAX_VALUE ? cd.G(i28 / 3600, "StoryPrivacyAlertSubtitle", new Object[0]) : cd.L0(2131744583, null);
            }
            g6 g6Var6 = new g6(4, false);
            g6Var6.e = L04;
            g6Var6.f = G;
            arrayList7.add(g6Var6);
            g6Var4.o = org.telegram.messenger.i0.L(72.0f) + g6Var4.o;
        } else {
            String L05 = cd.L0(w6Var.B1 ? 2131744637 : 2131744544, null);
            g6 g6Var7 = new g6(8, false);
            g6Var7.e = L05;
            arrayList7.add(g6Var7);
            g6Var4.o = org.telegram.messenger.i0.L(50.0f) + g6Var4.o;
            TLRPC.InputPeer inputPeer = w6Var.j1;
            if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                g6 i29 = g6.i(d20.i(w6Var.a).f(), false, false);
                i29.n = true;
                arrayList7.add(i29);
                g6Var4.o = org.telegram.messenger.i0.L(62.0f) + g6Var4.o;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                g6 i30 = g6.i(vp.r1(w6Var.a).Z1(Long.valueOf(w6Var.j1.user_id)), false, false);
                i30.n = true;
                arrayList7.add(i30);
                g6Var4.o = org.telegram.messenger.i0.L(62.0f) + g6Var4.o;
            } else {
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.Chat L06 = vp.r1(w6Var.a).L0(Long.valueOf(w6Var.j1.channel_id));
                    g6 g6Var8 = new g6(3, true);
                    g6Var8.h = L06;
                    g6Var8.k = false;
                    g6Var8.n = true;
                    arrayList7.add(g6Var8);
                    z14 = org.telegram.messenger.w3.V(L06);
                    g6Var4.o = org.telegram.messenger.i0.L(104.0f) + g6Var4.o;
                    z13 = false;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.Chat L07 = vp.r1(w6Var.a).L0(Long.valueOf(w6Var.j1.chat_id));
                    g6 g6Var9 = new g6(3, true);
                    g6Var9.h = L07;
                    g6Var9.k = false;
                    g6Var9.n = true;
                    arrayList7.add(g6Var9);
                    g6Var4.o = org.telegram.messenger.i0.L(104.0f) + g6Var4.o;
                    z14 = false;
                    z13 = false;
                }
                g6 g10 = g6.g(null);
                g10.c = !z13 ? 1 : 2;
                arrayList7.add(g10);
                g6Var4.o = org.telegram.messenger.i0.L(12.0f) + g6Var4.o;
                if (z13) {
                    String L08 = cd.L0(w6Var.B1 ? 2131744636 : 2131744539, null);
                    g6 g6Var10 = new g6(8, false);
                    g6Var10.e = L08;
                    arrayList7.add(g6Var10);
                    g6Var4.o = org.telegram.messenger.i0.L(40.0f) + g6Var4.o;
                }
                if (z13 || w6Var.C1) {
                    f11 = 80.0f;
                } else {
                    f11 = 80.0f;
                    g6 h = g6.h(4, w6Var.m1, w6Var.E1 == 4);
                    arrayList7.add(h);
                    g6Var4.o = org.telegram.messenger.i0.L(56.0f) + g6Var4.o;
                    if (w6Var.m1 == 1) {
                        if (arrayList4.size() != 1) {
                            Iterator it2 = w6Var.l1.values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList14 = (ArrayList) it2.next();
                                if (arrayList14.size() >= 1) {
                                    h.g = vp.r1(w6Var.a).Z1((Long) arrayList14.get(0));
                                    break;
                                }
                            }
                        } else {
                            h.g = vp.r1(w6Var.a).Z1((Long) arrayList4.get(0));
                        }
                    }
                    g6 h10 = g6.h(2, arrayList5.size(), w6Var.E1 == 2);
                    arrayList7.add(h10);
                    g6Var4.o = org.telegram.messenger.i0.L(56.0f) + g6Var4.o;
                    if (arrayList5.size() == 1) {
                        h10.g = vp.r1(w6Var.a).Z1((Long) arrayList5.get(0));
                    }
                    ArrayList J0 = w6.J0(w6Var);
                    g6 h11 = g6.h(1, J0.size(), w6Var.E1 == 1);
                    arrayList7.add(h11);
                    g6Var4.o = org.telegram.messenger.i0.L(56.0f) + g6Var4.o;
                    if (J0.size() == 1 && (J0.get(0) instanceof TLRPC.User)) {
                        h11.g = (TLRPC.User) J0.get(0);
                    }
                    g6 h12 = g6.h(3, w6Var.q1, w6Var.E1 == 3);
                    arrayList7.add(h12);
                    g6Var4.o = org.telegram.messenger.i0.L(56.0f) + g6Var4.o;
                    if (w6Var.q1 == 1) {
                        if (arrayList3.size() != 1) {
                            Iterator it3 = w6Var.p1.values().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList15 = (ArrayList) it3.next();
                                if (arrayList15.size() >= 1) {
                                    h12.g = vp.r1(w6Var.a).Z1((Long) arrayList15.get(0));
                                    break;
                                }
                            }
                        } else {
                            h12.g = vp.r1(w6Var.a).Z1((Long) arrayList3.get(0));
                        }
                    }
                    int i31 = vp.r1(w6Var.a).O1().N;
                    arrayList7.add(g6.g(org.telegram.messenger.i0.R2(i31 <= 0 ? cd.L0(w6Var.B1 ? 2131744647 : 2131744734, null) : cd.G(i31, w6Var.B1 ? "StoryLiveBlockList" : "StoryBlockList", new Object[0]), org.telegram.ui.ActionBar.t6.Uc, 0, new i6(this, 3), w6Var.I0)));
                    g6Var4.o = org.telegram.messenger.i0.L(80.0f) + g6Var4.o;
                }
                if (!w6Var.Q1) {
                    if (w6Var.B1 && !w6Var.C1) {
                        if (w6Var.x1) {
                            arrayList7.add(g6.b(cd.L0(2131748807, null), "", 5));
                            g6Var4.o = org.telegram.messenger.i0.L(50.0f) + g6Var4.o;
                            arrayList7.add(g6.b(cd.L0(2131748813, null), "", 6));
                            g6Var4.o = org.telegram.messenger.i0.L(50.0f) + g6Var4.o;
                            arrayList7.add(g6.g(null));
                            g6Var4.o = org.telegram.messenger.i0.L(12.0f) + g6Var4.o;
                        } else {
                            arrayList7.add(g6.b(cd.L0(2131748812, null), "", 5));
                            g6Var4.o = org.telegram.messenger.i0.L(50.0f) + g6Var4.o;
                            arrayList7.add(g6.g(cd.L0(2131748811, null)));
                            g6Var4.o = org.telegram.messenger.i0.L(30.0f) + g6Var4.o;
                        }
                    }
                    if (w6Var.B1) {
                        String L09 = cd.L0(2131744649, null);
                        boolean z20 = w6Var.s1;
                        g6 g6Var11 = new g6(7, false);
                        g6Var11.c = 2;
                        g6Var11.e = L09;
                        g6Var11.k = z20;
                        arrayList7.add(g6Var11);
                        g6Var4.o = org.telegram.messenger.i0.L(50.0f) + g6Var4.o;
                    }
                    if (!w6Var.C1) {
                        String L010 = cd.L0(2131744747, null);
                        boolean z21 = w6Var.t1;
                        g6 g6Var12 = new g6(7, false);
                        g6Var12.c = 0;
                        g6Var12.e = L010;
                        g6Var12.k = z21;
                        arrayList7.add(g6Var12);
                        g6Var4.o = org.telegram.messenger.i0.L(50.0f) + g6Var4.o;
                    }
                    if (!w6Var.B1 && !w6Var.C1) {
                        String L011 = cd.L0(z13 ? 2131744677 : z14 ? 2131744676 : 2131744671, null);
                        boolean z22 = w6Var.u1;
                        g6 g6Var13 = new g6(7, false);
                        g6Var13.c = 1;
                        g6Var13.e = L011;
                        g6Var13.k = z22;
                        arrayList7.add(g6Var13);
                        g6Var4.o = org.telegram.messenger.i0.L(50.0f) + g6Var4.o;
                    }
                }
                z15 = w6Var.B1;
                String str = "StoryKeepGroupInfo";
                if (!z15 || w6Var.C1) {
                    arrayList7.add(g6.g(null));
                    g6Var4.o = org.telegram.messenger.i0.L(12.0f) + g6Var4.o;
                } else if (!w6Var.Q1 && w6Var.v1 && w6Var.T1 != null) {
                    if (z15) {
                        G3 = cd.L0(z13 ? 2131744642 : z14 ? 2131744644 : 2131744643, null);
                    } else {
                        String str2 = z13 ? "StoryKeepInfo" : z14 ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                        int i32 = w6Var.H1;
                        if (i32 == Integer.MAX_VALUE) {
                            i32 = 86400;
                        }
                        G3 = cd.G(i32 / 3600, str2, new Object[0]);
                    }
                    arrayList7.add(g6.g(G3));
                    g6Var4.o = org.telegram.messenger.i0.L(f11) + g6Var4.o;
                }
                if (w6Var.u1 || w6Var.B1 || w6Var.C1) {
                    z16 = z14;
                } else {
                    TLRPC.InputPeer inputPeer2 = w6Var.j1;
                    long n10 = inputPeer2 != null ? org.telegram.messenger.o5.n(inputPeer2) : d20.i(w6Var.a).e();
                    vp.r1(w6Var.a).O1().B(n10, true);
                    StringBuilder sb2 = new StringBuilder();
                    if (hashSet.isEmpty()) {
                        sb2.append(cd.L0(2131744804, null));
                    } else if (hashSet.size() < 3) {
                        Iterator it4 = hashSet.iterator();
                        while (it4.hasNext()) {
                            Iterator it5 = it4;
                            boolean z23 = z14;
                            th.y4 b10 = vp.r1(w6Var.a).O1().B(n10, true).b(((Integer) it4.next()).intValue());
                            if (b10 != null) {
                                if (sb2.length() != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(b10.b);
                            }
                            it4 = it5;
                            z14 = z23;
                        }
                    } else {
                        z16 = z14;
                        sb2.append(cd.G(hashSet.size(), "StoriesAlbumCount", new Object[0]));
                        arrayList7.add(g6.b(cd.L0(2131744826, null), sb2, 1));
                        g6Var4.o = org.telegram.messenger.i0.L(50.0f) + g6Var4.o;
                    }
                    z16 = z14;
                    arrayList7.add(g6.b(cd.L0(2131744826, null), sb2, 1));
                    g6Var4.o = org.telegram.messenger.i0.L(50.0f) + g6Var4.o;
                }
                if (!w6Var.Q1 && ((!w6Var.v1 || w6Var.T1 == null) && !(z17 = w6Var.B1) && !w6Var.C1)) {
                    if (z17) {
                        if (z13) {
                            str = "StoryKeepInfo";
                        } else if (z16) {
                            str = "StoryKeepChannelInfo";
                        }
                        int i33 = w6Var.H1;
                        G2 = cd.G((i33 == Integer.MAX_VALUE ? 86400 : i33) / 3600, str, new Object[0]);
                    } else {
                        G2 = cd.L0(z13 ? 2131744642 : z16 ? 2131744644 : 2131744643, null);
                    }
                    arrayList7.add(g6.g(G2));
                    g6Var4.o = org.telegram.messenger.i0.L(f11) + g6Var4.o;
                }
                if (w6Var.u1 && w6Var.v1 && w6Var.T1 != null) {
                    String L012 = cd.L0(2131744694, null);
                    BitmapDrawable bitmapDrawable = w6Var.S1;
                    g6 g6Var14 = new g6(9, false);
                    g6Var14.e = L012;
                    g6Var14.d = bitmapDrawable;
                    g6Var14.q = 0;
                    arrayList7.add(g6Var14);
                    g6Var4.o = org.telegram.messenger.i0.L(50.0f) + g6Var4.o;
                    arrayList7.add(g6.g(cd.L0(2131744693, null)));
                    g6Var4.o = org.telegram.messenger.i0.L(72.0f) + g6Var4.o;
                }
                if (w6Var.C1) {
                    arrayList7.add(g6.b(cd.L0(2131748807, null), "", 5));
                    g6Var4.o = org.telegram.messenger.i0.L(50.0f) + g6Var4.o;
                    arrayList7.add(g6.g(null));
                    g6Var4.o = org.telegram.messenger.i0.L(52.0f) + g6Var4.o;
                }
                if (w6Var.B1 && w6Var.s1) {
                    String L013 = cd.L0(2131748816, null);
                    g6 g6Var15 = new g6(8, false);
                    g6Var15.e = L013;
                    arrayList7.add(g6Var15);
                    g6Var4.o = org.telegram.messenger.i0.L(40.0f) + g6Var4.o;
                    g6 g6Var16 = new g6(10, false);
                    g6Var16.q = 8;
                    arrayList7.add(g6Var16);
                    g6Var4.o = org.telegram.messenger.i0.L(75.0f) + g6Var4.o;
                    arrayList7.add(g6.g(cd.L0(2131748814, null)));
                    g6Var4.o = org.telegram.messenger.i0.L(50.0f) + g6Var4.o;
                }
            }
            z14 = false;
            z13 = true;
            g6 g102 = g6.g(null);
            g102.c = !z13 ? 1 : 2;
            arrayList7.add(g102);
            g6Var4.o = org.telegram.messenger.i0.L(12.0f) + g6Var4.o;
            if (z13) {
            }
            if (z13) {
            }
            f11 = 80.0f;
            if (!w6Var.Q1) {
            }
            z15 = w6Var.B1;
            String str3 = "StoryKeepGroupInfo";
            if (z15) {
            }
            arrayList7.add(g6.g(null));
            g6Var4.o = org.telegram.messenger.i0.L(12.0f) + g6Var4.o;
            if (w6Var.u1) {
            }
            z16 = z14;
            if (!w6Var.Q1) {
                if (z17) {
                }
                arrayList7.add(g6.g(G2));
                g6Var4.o = org.telegram.messenger.i0.L(f11) + g6Var4.o;
            }
            if (w6Var.u1) {
                String L0122 = cd.L0(2131744694, null);
                BitmapDrawable bitmapDrawable2 = w6Var.S1;
                g6 g6Var142 = new g6(9, false);
                g6Var142.e = L0122;
                g6Var142.d = bitmapDrawable2;
                g6Var142.q = 0;
                arrayList7.add(g6Var142);
                g6Var4.o = org.telegram.messenger.i0.L(50.0f) + g6Var4.o;
                arrayList7.add(g6.g(cd.L0(2131744693, null)));
                g6Var4.o = org.telegram.messenger.i0.L(72.0f) + g6Var4.o;
            }
            if (w6Var.C1) {
            }
            if (w6Var.B1) {
                String L0132 = cd.L0(2131748816, null);
                g6 g6Var152 = new g6(8, false);
                g6Var152.e = L0132;
                arrayList7.add(g6Var152);
                g6Var4.o = org.telegram.messenger.i0.L(40.0f) + g6Var4.o;
                g6 g6Var162 = new g6(10, false);
                g6Var162.q = 8;
                arrayList7.add(g6Var162);
                g6Var4.o = org.telegram.messenger.i0.L(75.0f) + g6Var4.o;
                arrayList7.add(g6.g(cd.L0(2131748814, null)));
                g6Var4.o = org.telegram.messenger.i0.L(50.0f) + g6Var4.o;
            }
        }
        z14 = false;
        z13 = true;
        if (z13) {
        }
        f11 = 80.0f;
        if (!w6Var.Q1) {
        }
        z15 = w6Var.B1;
        String str32 = "StoryKeepGroupInfo";
        if (z15) {
        }
        arrayList7.add(g6.g(null));
        g6Var4.o = org.telegram.messenger.i0.L(12.0f) + g6Var4.o;
        if (w6Var.u1) {
        }
        z16 = z14;
        if (!w6Var.Q1) {
        }
        if (w6Var.u1) {
        }
        if (w6Var.C1) {
        }
        if (w6Var.B1) {
        }
        L = 0.0f;
        boolean isEmpty22 = TextUtils.isEmpty(this.I);
        if (this.a != 0) {
        }
        if (this.h.t) {
        }
        n6Var = this.n;
        if (n6Var != null) {
        }
        this.e.invalidate();
    }

    public final void i(boolean z10) {
        org.telegram.ui.Cells.z3 z3Var = this.D;
        if (z3Var == null) {
            return;
        }
        if (w6.R0(this.c, this.d).size() > 0) {
            z3Var.a(cd.L0(2131743656, null), new h6(this, 2));
            return;
        }
        if (z10) {
            z3Var.setRightText(null);
            return;
        }
        org.telegram.ui.Cells.y3 y3Var = z3Var.b;
        y3Var.c(null, false, true);
        y3Var.setOnClickListener(null);
        y3Var.setVisibility(0);
    }

    public final void j(boolean z10) {
        k6 k6Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        HashSet R0 = w6.R0(this.c, this.d);
        int i10 = this.a;
        w6 w6Var = this.W;
        if (i10 == 3) {
            w6Var.q1 = R0.size();
        } else if (i10 == 4) {
            w6Var.m1 = R0.size();
        }
        vp r12 = vp.r1(w6Var.a);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            k6Var = this.y;
            ArrayList arrayList4 = k6Var.e;
            arrayList = k6Var.e;
            if (i12 >= arrayList4.size()) {
                break;
            }
            s20 s20Var = (s20) arrayList.get(i12);
            if (!R0.contains(Long.valueOf(s20Var.getUid()))) {
                arrayList2.add(s20Var);
            }
            i12++;
        }
        Iterator it = R0.iterator();
        while (it.hasNext()) {
            Long l4 = (Long) it.next();
            long longValue = l4.longValue();
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    Object Z1 = longValue >= 0 ? r12.Z1(l4) : r12.L0(l4);
                    if (Z1 != null) {
                        s20 s20Var2 = new s20(getContext(), Z1, null, true, w6Var.I0);
                        s20Var2.setOnClickListener(this);
                        arrayList3.add(s20Var2);
                    }
                } else if (((s20) arrayList.get(i13)).getUid() == longValue) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        qg.g gVar = k6Var.d;
        ArrayList arrayList5 = gVar.e;
        ArrayList arrayList6 = gVar.d;
        ArrayList arrayList7 = gVar.f;
        t6 t6Var = (t6) gVar.n;
        t6Var.H = true;
        ArrayList arrayList8 = t6Var.e;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = gVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((s20) arrayList2.get(i14)).setOnClickListener(null);
        }
        gVar.c();
        if (z10) {
            gVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            gVar.b = animatorSet;
            animatorSet.addListener(new s6(gVar, arrayList2, i11));
            arrayList7.clear();
            arrayList6.clear();
            arrayList5.clear();
            int i15 = 0;
            while (true) {
                int size = arrayList2.size();
                property = View.ALPHA;
                property2 = View.SCALE_Y;
                property3 = View.SCALE_X;
                if (i15 >= size) {
                    break;
                }
                s20 s20Var3 = (s20) arrayList2.get(i15);
                arrayList5.add(s20Var3);
                arrayList7.add(ObjectAnimator.ofFloat(s20Var3, (Property<s20, Float>) property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(s20Var3, (Property<s20, Float>) property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(s20Var3, (Property<s20, Float>) property, 1.0f, 0.0f));
                i15++;
            }
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                s20 s20Var4 = (s20) arrayList3.get(i16);
                arrayList6.add(s20Var4);
                arrayList7.add(ObjectAnimator.ofFloat(s20Var4, (Property<s20, Float>) property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(s20Var4, (Property<s20, Float>) property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(s20Var4, (Property<s20, Float>) property, 0.0f, 1.0f));
            }
        } else {
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                gVar.removeView((View) arrayList2.get(i17));
            }
            arrayList9.clear();
            gVar.b = null;
            gVar.c = false;
            t6Var.b.setAllowDrawCursor(true);
        }
        while (i11 < arrayList3.size()) {
            gVar.addView((View) arrayList3.get(i11));
            i11++;
        }
        gVar.requestLayout();
    }

    public final void k() {
        float c10 = c();
        boolean z10 = this.M;
        boolean z11 = false;
        k6 k6Var = this.y;
        if (z10 || this.U || getTranslationX() != 0.0f) {
            this.N = false;
            ValueAnimator valueAnimator = this.P;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.P = null;
            }
            k6Var.setTranslationY(c10);
        } else if (!this.N || Math.abs(this.O - c10) > 1.0f) {
            this.N = true;
            ValueAnimator valueAnimator2 = this.P;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.P = null;
            }
            float translationY = k6Var.getTranslationY();
            this.O = c10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c10);
            this.P = ofFloat;
            ofFloat.addUpdateListener(new c4(4, this));
            this.P.addListener(new sg.r(this, 21));
            this.P.setInterpolator(new LinearInterpolator());
            this.P.setDuration(180L);
            this.P.start();
        }
        boolean z12 = this.F;
        uc0 uc0Var = this.E;
        if (!z12) {
            uc0Var.setVisibility(8);
            return;
        }
        uc0Var.setVisibility(0);
        float f7 = -uc0Var.getHeight();
        int i10 = 0;
        while (true) {
            tk0 tk0Var = this.f;
            if (i10 >= tk0Var.getChildCount()) {
                z11 = true;
                break;
            }
            View childAt = tk0Var.getChildAt(i10);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                f7 = this.e.getPaddingTop() + childAt.getY();
                break;
            }
            i10++;
        }
        if (this.Q != z11) {
            this.Q = z11;
            ((org.telegram.ui.ActionBar.c2) uc0Var.e).c(true, (z11 || this.a != 0) ? 0.0f : 1.0f);
        }
        uc0Var.setTranslationY(Math.max(org.telegram.messenger.i0.m, f7));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = w6.U1;
        zs.f(this.W.a).c(this, zs.T);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k6 k6Var = this.y;
        if (!k6Var.e.contains(view)) {
            return;
        }
        s20 s20Var = (s20) view;
        if (!s20Var.D) {
            s20 s20Var2 = k6Var.f;
            if (s20Var2 != null) {
                s20Var2.a();
                k6Var.f = null;
            }
            k6Var.f = s20Var;
            s20Var.b();
            return;
        }
        k6Var.f = null;
        qg.g gVar = k6Var.d;
        t6 t6Var = (t6) gVar.n;
        t6Var.H = true;
        t6Var.e.remove(s20Var);
        s20Var.setOnClickListener(null);
        gVar.c();
        gVar.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        gVar.b = animatorSet;
        animatorSet.addListener(new iw0(22, (Object) gVar, (Object) s20Var));
        ArrayList arrayList = gVar.h;
        arrayList.clear();
        arrayList.add(s20Var);
        ArrayList arrayList2 = gVar.d;
        arrayList2.clear();
        gVar.e.clear();
        arrayList2.add(s20Var);
        ArrayList arrayList3 = gVar.f;
        arrayList3.clear();
        arrayList3.add(ObjectAnimator.ofFloat(s20Var, (Property<s20, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(s20Var, (Property<s20, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(s20Var, (Property<s20, Float>) View.ALPHA, 1.0f, 0.0f));
        gVar.requestLayout();
        long uid = s20Var.getUid();
        Iterator it = this.d.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList4 = this.c;
            if (!hasNext) {
                arrayList4.remove(Long.valueOf(uid));
                g(true);
                f(true);
                return;
            } else {
                Map.Entry entry = (Map.Entry) it.next();
                if (((ArrayList) entry.getValue()).contains(Long.valueOf(uid))) {
                    it.remove();
                    arrayList4.addAll((Collection) entry.getValue());
                    arrayList4.remove(Long.valueOf(uid));
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = w6.U1;
        zs.f(this.W.a).n(this, zs.T);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = w6.U1;
        w6 w6Var = this.W;
        int i13 = w6Var.f;
        if (i13 > 0) {
            this.T = i13;
        }
        super.onMeasure(i10, i11);
        this.e.setPadding(0, org.telegram.messenger.i0.m + (this.a == 0 ? 0 : org.telegram.messenger.i0.L(56.0f)), 0, 0);
        boolean z10 = this.V;
        boolean z11 = w6Var.d;
        tk0 tk0Var = this.f;
        p6 p6Var = this.r;
        if (z10 != z11) {
            float c10 = c();
            int i14 = 2;
            if (w6Var.d && c10 + Math.min(org.telegram.messenger.i0.L(150.0f), this.y.K) > tk0Var.getPaddingTop()) {
                ci.p pVar = new ci.p(getContext(), 2, 0.7f);
                pVar.a = 1;
                pVar.p = -org.telegram.messenger.i0.L(56.0f);
                this.h.w0(pVar);
            }
            int i15 = this.a;
            View view = this.s;
            if (i15 == 0) {
                p6Var.setTranslationY(w6Var.d ? this.T : 0.0f);
                view.setTranslationY(w6Var.d ? this.T : 0.0f);
            } else {
                float f7 = w6Var.d ? this.T : -this.T;
                ValueAnimator valueAnimator = p6Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    p6Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                p6Var.d = ofFloat;
                ofFloat.addUpdateListener(new o6(p6Var, 1));
                p6Var.d.addListener(new sg.r(p6Var, 22));
                p6Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = p6Var.d;
                gr grVar = org.telegram.ui.ActionBar.m1.w;
                valueAnimator2.setInterpolator(grVar);
                p6Var.d.start();
                view.setTranslationY(w6Var.d ? this.T : -this.T);
                this.U = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(grVar).withEndAction(new i6(this, i14)).start();
            }
            this.V = w6Var.d;
        }
        tk0Var.setPadding(0, 0, 0, p6Var.getMeasuredHeight());
    }
}
