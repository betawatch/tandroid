// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class t5b extends FrameLayout implements View.OnClickListener, gk7 {
    public final l35 E;
    public final tv7 F;
    public boolean G;
    public hd H;
    public long I;
    public String J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public boolean N;
    public boolean O;
    public float P;
    public ValueAnimator Q;
    public boolean R;
    public int S;
    public boolean T;
    public int U;
    public boolean V;
    public boolean W;
    public int a;
    public final /* synthetic */ y5b a0;
    public final vf6 b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final o39 f;
    public final t26 h;
    public final p5b n;
    public final r5b r;
    public final View s;
    public final u41 w;
    public final u41 x;
    public final n5b y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5b(y5b y5bVar, Context context) {
        super(context);
        this.a0 = y5bVar;
        this.b = new vf6();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.S = -1;
        int i = y5b.X1;
        l35 l35Var = new l35(context, y5bVar.J0);
        this.E = l35Var;
        n5b n5bVar = new n5b(this, context, y5bVar.J0, new l5b(this, (byte) 4));
        this.y = n5bVar;
        int i2 = bkb.g5;
        zkb.h(i2, y5bVar.J0, n5bVar);
        n5bVar.setOnSearchTextChange(new m5b(this, (byte) 3));
        tv7 tv7Var = new tv7(context, y5bVar.J0);
        this.F = tv7Var;
        tv7Var.h = new l5b(this, (byte) 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, gl.L(56.0f) + gl.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, nme.e(-1, -1, kk7.D1));
        o39 o39Var = new o39(context, y5bVar.J0);
        this.f = o39Var;
        o39Var.setClipToPadding(false);
        o39Var.setTranslateSelector(true);
        byte b = 2;
        p5b p5bVar = new p5b(this, context, y5bVar.J0, n5bVar, new p28(y5bVar, b));
        this.n = p5bVar;
        o39Var.setAdapter(p5bVar);
        p5bVar.h = o39Var;
        t26 t26Var = new t26();
        this.h = t26Var;
        o39Var.setLayoutManager(t26Var);
        o39Var.setOnScrollListener(new x42(this, b));
        o39Var.setOnItemClickListener(new kq8(this, context, (byte) 21));
        frameLayout.addView(o39Var, nme.c(-1.0f, -1));
        o5b o5bVar = new o5b(this);
        o5bVar.n(350L);
        o5bVar.o(s33.h);
        o5bVar.C = false;
        o5bVar.m = false;
        o39Var.setItemAnimator(o5bVar);
        frameLayout.addView(n5bVar, nme.e(-1, -2, 55));
        frameLayout.addView(l35Var, nme.e(-1, 32, 55));
        addView(tv7Var, nme.e(-1, -2, 55));
        r5b r5bVar = new r5b(this, context);
        this.r = r5bVar;
        r5bVar.setClickable(true);
        r5bVar.setOrientation(1);
        r5bVar.setPadding(gl.L(10.0f) + y5bVar.u0, gl.L(10.0f), gl.L(10.0f) + y5bVar.u0, gl.L(10.0f));
        zkb.h(i2, y5bVar.J0, r5bVar);
        u41 u41Var = new u41(y5bVar.J0, context, true);
        this.w = u41Var;
        u41Var.setOnClickListener(new k5b(this, (byte) 0));
        u41Var.f();
        r5bVar.addView(u41Var, nme.r(-1, 48, 87));
        u41 u41Var2 = new u41(y5bVar.J0, context, false);
        this.x = u41Var2;
        u41Var2.setOnClickListener(new k5b(this, (byte) 1));
        u41Var2.f();
        r5bVar.addView(u41Var2, nme.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        zkb.h(i2, y5bVar.J0, view);
        addView(view, nme.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(r5bVar, nme.e(-1, -2, 87));
    }

    public static boolean d(String str, TLObject tLObject) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            String lowerCase = gl.J3(l7c.q(user)).toLowerCase();
            if (lowerCase.startsWith(str) || de9.t(" ", str, lowerCase)) {
                return true;
            }
            String lowerCase2 = gl.J3(l7c.o(user)).toLowerCase();
            if (lowerCase2.startsWith(str) || de9.t(" ", str, lowerCase2)) {
                return true;
            }
            ArrayList<TLRPC.TL_username> arrayList = user.usernames;
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC.TL_username tL_username = arrayList.get(i);
                    if (tL_username.active && gl.J3(tL_username.username).toLowerCase().startsWith(str)) {
                        return true;
                    }
                }
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String lowerCase3 = gl.J3(chat.title).toLowerCase();
            if (lowerCase3.startsWith(str) || de9.t(" ", str, lowerCase3)) {
                return true;
            }
            String lowerCase4 = gl.J3(hc2.K(chat, false)).toLowerCase();
            if (lowerCase4.startsWith(str) || de9.t(" ", str, lowerCase4)) {
                return true;
            }
            ArrayList<TLRPC.TL_username> arrayList2 = chat.usernames;
            if (arrayList2 != null) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    TLRPC.TL_username tL_username2 = arrayList2.get(i2);
                    if (tL_username2.active && gl.J3(tL_username2.username).toLowerCase().startsWith(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void a(boolean z) {
        if (this.a == 6) {
            ArrayList arrayList = this.c;
            arrayList.clear();
            int i = y5b.X1;
            arrayList.addAll(na7.q1(this.a0.a).M1().L);
            int i2 = 0;
            while (true) {
                vf6 vf6Var = this.b;
                if (i2 >= vf6Var.m()) {
                    break;
                }
                long j = vf6Var.j(i2);
                if (!((Boolean) vf6Var.n(i2)).booleanValue()) {
                    arrayList.remove(Long.valueOf(j));
                } else if (!arrayList.contains(Long.valueOf(j))) {
                    arrayList.add(Long.valueOf(j));
                }
                i2++;
            }
            if (z) {
                h(true);
                f(true);
                g(true);
            }
        }
    }

    public final void b(int i) {
        this.a = i;
        this.b.b();
        ArrayList arrayList = this.c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        y5b y5bVar = this.a0;
        if (i == 4) {
            arrayList.addAll(y5bVar.n1);
            hashMap.putAll(y5bVar.o1);
        } else if (i == 5) {
            arrayList.addAll(y5bVar.D1);
        } else if (i == 1) {
            int i2 = y5b.X1;
            ArrayList H0 = y5bVar.H0();
            for (int i3 = 0; i3 < H0.size(); i3 = mue.c(i3, 1, ((TLRPC.User) H0.get(i3)).id, arrayList)) {
            }
        } else if (i == 2) {
            arrayList.addAll(y5bVar.q1);
        } else if (i == 3) {
            arrayList.addAll(y5bVar.r1);
            hashMap.putAll(y5bVar.s1);
        } else if (i == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.j1(false);
        j(false);
        n5b n5bVar = this.y;
        n5bVar.setText("");
        n5bVar.setVisibility(i == 0 ? 8 : 0);
        n5bVar.M = true;
        this.J = null;
        h(false);
        f(false);
        g(false);
        int i4 = this.a;
        o39 o39Var = this.f;
        if (i4 != 0) {
            o39Var.w0(0);
        }
        o39Var.requestLayout();
        this.S = -1;
    }

    public final float c() {
        int i = 0;
        float f = -b00.c(150.0f, Math.min(gl.L(150.0f), this.y.L), 0);
        while (true) {
            o39 o39Var = this.f;
            if (i >= o39Var.getChildCount()) {
                return f;
            }
            View childAt = o39Var.getChildAt(i);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                return Math.max(f, childAt.getY());
            }
            i++;
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatFull chatFull;
        hd hdVar;
        if (i != kk7.S || (chatFull = (TLRPC.ChatFull) objArr[0]) == null || (hdVar = this.H) == null || this.I != chatFull.id) {
            return;
        }
        hdVar.b(350L);
        this.H = null;
        this.I = -1L;
        e(chatFull.id, chatFull.participants);
    }

    public final void e(long j, TLRPC.ChatParticipants chatParticipants) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = this.a;
        int i2 = 0;
        boolean z = i == 1 || i == 2;
        y5b y5bVar = this.a0;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i3 = 0; i3 < chatParticipants.participants.size(); i3++) {
                long j2 = chatParticipants.participants.get(i3).user_id;
                int i4 = y5b.X1;
                TLRPC.User V1 = na7.q1(y5bVar.a).V1(Long.valueOf(j2));
                if (V1 != null && !l7c.C(V1) && !V1.bot && V1.id != 777000 && j2 != 0) {
                    if (!z || V1.contact) {
                        arrayList.add(Long.valueOf(j2));
                    } else {
                        arrayList2.add(Long.valueOf(j2));
                    }
                    this.c.remove(Long.valueOf(j2));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            this.d.put(Long.valueOf(j), arrayList);
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                this.b.k(Boolean.TRUE, ((Long) obj).longValue());
            }
            j(true);
            f(true);
            g(true);
            this.y.M = true;
            return;
        }
        if (arrayList.isEmpty()) {
            Context context = getContext();
            int i5 = y5b.X1;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, y5bVar.J0, context);
            alertDialog$Builder.a.U = k96.M0(2131744298, null);
            ug8.y(null, 2131752577, alertDialog$Builder, null);
            return;
        }
        Context context2 = getContext();
        int i6 = y5b.X1;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, y5bVar.J0, context2);
        alertDialog$Builder2.a.U = k96.G(arrayList2.size(), "StoryPrivacyGroupNonContacts", new Object[0]);
        alertDialog$Builder2.j(k96.G(arrayList.size(), "StoryPrivacyGroupAddContacts", new Object[0]), new hs0((Object) this, j, (Object) arrayList, (byte) 9));
        ug8.y(null, 2131752577, alertDialog$Builder2, null);
    }

    public final void f(boolean z) {
        int i = this.a;
        y5b y5bVar = this.a0;
        u41 u41Var = this.x;
        int i2 = 0;
        u41 u41Var2 = this.w;
        if (i == 0) {
            u41Var2.setShowZero(false);
            u41Var2.setEnabled(true);
            u41Var2.c(0, z);
            if (y5bVar.F1) {
                u41Var2.i(k96.M0(2131744314, null), z, true);
            } else if (y5bVar.T1) {
                u41Var2.i(k96.M0(2131744314, null), z, true);
            } else {
                int i3 = y5bVar.C1;
                if (i3 == 1) {
                    u41Var2.i(k96.M0(y5bVar.E1 ? 2131744379 : 2131744318, null), z, true);
                } else {
                    u41Var2.i(k96.H(',', "StoryPrivacyButtonPostMultiple", i3), z, true);
                }
            }
            u41Var.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.c;
        if (i == 1) {
            u41Var2.setShowZero(false);
            u41Var2.setEnabled(true);
            u41Var2.i(k96.M0(2131744313, null), z, true);
            u41Var2.c(arrayList.size(), z);
            u41Var.setVisibility(8);
            return;
        }
        r5b r5bVar = this.r;
        if (i == 3) {
            int size = y5b.M0(arrayList, this.d).size();
            y5bVar.t1 = size;
            u41Var2.i(k96.M0(2131744314, null), z, true);
            u41Var2.setShowZero(false);
            r5bVar.a(size <= 0, z);
            u41Var2.c(size, z);
            u41Var2.setEnabled(size > 0);
            u41Var.setVisibility(8);
            return;
        }
        if (i == 2) {
            u41Var2.setShowZero(false);
            u41Var2.setEnabled(true);
            if (arrayList.isEmpty()) {
                u41Var2.i(k96.M0(2131744314, null), z, true);
                u41Var2.c(0, z);
            } else {
                u41Var2.i(k96.M0(2131744319, null), z, true);
                u41Var2.c(arrayList.size(), z);
            }
            u41Var.setVisibility(8);
            return;
        }
        if (i == 5) {
            u41Var2.setShowZero(true);
            u41Var2.setEnabled(!arrayList.isEmpty());
            u41Var2.c(arrayList.size(), z);
            u41Var.setVisibility(8);
            return;
        }
        if (i != 6) {
            if (i == 4) {
                int size2 = y5b.M0(y5bVar.n1, y5bVar.o1).size();
                y5bVar.p1 = size2;
                u41Var2.i(k96.M0(2131744314, null), z, true);
                u41Var2.setShowZero(false);
                r5bVar.a(false, z);
                u41Var2.c(size2, z);
                u41Var2.setEnabled(true);
                u41Var.setVisibility(8);
                return;
            }
            return;
        }
        u41Var2.setShowZero(false);
        u41Var2.setEnabled(true);
        u41Var2.i(k96.M0(2131744313, null), z, true);
        int i4 = y5b.X1;
        g2b M1 = na7.q1(y5bVar.a).M1();
        if (!M1.O) {
            while (true) {
                vf6 vf6Var = this.b;
                if (i2 >= vf6Var.m()) {
                    break;
                }
                long j = vf6Var.j(i2);
                ((Boolean) vf6Var.n(i2)).getClass();
                M1.L.contains(Long.valueOf(j));
                i2++;
            }
        } else {
            u41Var2.c(arrayList.size(), z);
        }
        u41Var.setVisibility(8);
    }

    public final void g(boolean z) {
        ArrayList arrayList;
        int R;
        y5b y5bVar = this.a0;
        ArrayList arrayList2 = y5bVar.D1;
        HashMap hashMap = y5bVar.s1;
        ArrayList arrayList3 = y5bVar.r1;
        ArrayList arrayList4 = y5bVar.q1;
        HashMap hashMap2 = y5bVar.o1;
        ArrayList arrayList5 = y5bVar.n1;
        int i = this.a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.c;
        if (i == 4) {
            arrayList5.clear();
            hashMap2.clear();
            arrayList5.addAll(arrayList6);
            hashMap2.putAll(hashMap3);
        } else if (i == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList6);
        } else if (i == 3) {
            arrayList3.clear();
            hashMap.clear();
            arrayList3.addAll(arrayList6);
            hashMap.putAll(hashMap3);
        } else if (i == 0) {
            arrayList2.clear();
            arrayList2.addAll(arrayList6);
        }
        if (this.a == 3 && (y5bVar.H1 != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i2 = this.S;
                if (i2 != -1) {
                    y5bVar.H1 = i2;
                }
            } else {
                this.S = y5bVar.H1;
                y5bVar.H1 = 3;
            }
        }
        HashSet M0 = y5b.M0(arrayList6, hashMap3);
        int i3 = 0;
        while (true) {
            arrayList = this.M;
            if (i3 >= arrayList.size()) {
                break;
            }
            j5b j5bVar = (j5b) arrayList.get(i3);
            if (j5bVar != null) {
                byte b = j5bVar.i;
                if (b > 0) {
                    j5bVar.k = y5bVar.H1 == b;
                    j5bVar.l = false;
                } else {
                    TLRPC.User user = j5bVar.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        j5bVar.k = contains;
                        j5bVar.l = !contains && M0.contains(Long.valueOf(j5bVar.g.id));
                    } else {
                        TLRPC.Chat chat = j5bVar.h;
                        if (chat != null) {
                            j5bVar.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            j5bVar.l = false;
                        }
                    }
                }
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            o39 o39Var = this.f;
            if (i4 >= o39Var.getChildCount()) {
                i(z);
                return;
            }
            View childAt = o39Var.getChildAt(i4);
            if ((childAt instanceof x5b) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                j5b j5bVar2 = (j5b) arrayList.get(R);
                x5b x5bVar = (x5b) childAt;
                x5bVar.c(j5bVar2.k || j5bVar2.l, z);
                TLRPC.Chat chat2 = j5bVar2.h;
                if (chat2 != null) {
                    x5bVar.b(z, y5bVar.J0(chat2) > 200 ? 0.3f : 1.0f);
                } else {
                    if (j5bVar2.l && !j5bVar2.k) {
                        r8 = 0.5f;
                    }
                    x5bVar.b(z, r8);
                }
            }
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0ca6  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0cad  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x049c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(boolean z) {
        float L;
        float L2;
        p5b p5bVar;
        boolean z2;
        boolean z3;
        float f;
        ArrayList arrayList;
        TLRPC.User V1;
        TLRPC.Chat K0;
        int i;
        ArrayList arrayList2;
        int i2;
        TLRPC.Chat K02;
        boolean z4;
        boolean z5;
        String G;
        float f2;
        boolean z6;
        boolean z7;
        boolean z8;
        String G2;
        String G3;
        ArrayList arrayList3 = this.L;
        arrayList3.clear();
        ArrayList arrayList4 = this.M;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        int i3 = this.a;
        l35 l35Var = this.E;
        y5b y5bVar = this.a0;
        if (i3 != 0) {
            tv7 tv7Var = this.F;
            if (i3 == 1) {
                tv7Var.e(k96.M0(2131744333, null));
                tv7Var.d(true);
                ((ed0) tv7Var.e).c(false, 0.0f);
                arrayList4.add(j5b.d());
                arrayList4.add(j5b.c());
                arrayList4.size();
                arrayList4.add(j5b.e());
                arrayList4.add(j5b.f());
                L2 = gl.L(56.0f) + 0.0f + gl.L(150.0f) + gl.L(32.0f);
                l35Var.setText(k96.M0(2131744334, null));
                i(z);
                this.G = true;
            } else if (i3 == 2) {
                tv7Var.e(k96.M0(2131744328, null));
                tv7Var.d(true);
                ((ed0) tv7Var.e).c(false, 0.0f);
                arrayList4.add(j5b.d());
                arrayList4.add(j5b.c());
                arrayList4.size();
                arrayList4.add(j5b.e());
                arrayList4.add(j5b.f());
                L2 = gl.L(56.0f) + 0.0f + gl.L(150.0f) + gl.L(32.0f);
                l35Var.setText(k96.M0(2131744329, null));
                i(z);
                this.G = true;
            } else if (i3 == 3) {
                tv7Var.e(k96.M0(2131744326, null));
                tv7Var.d(true);
                ((ed0) tv7Var.e).c(false, 0.0f);
                arrayList4.add(j5b.d());
                arrayList4.add(j5b.c());
                arrayList4.size();
                arrayList4.add(j5b.e());
                arrayList4.add(j5b.f());
                L2 = gl.L(56.0f) + 0.0f + gl.L(150.0f) + gl.L(32.0f);
                l35Var.setText(k96.M0(2131744327, null));
                i(z);
                this.G = true;
            } else if (i3 == 5) {
                tv7Var.e(k96.M0(2131744337, null));
                tv7Var.d(y5bVar.I1);
                ((ed0) tv7Var.e).c(false, 0.0f);
                arrayList4.add(j5b.d());
                arrayList4.add(j5b.c());
                arrayList4.size();
                arrayList4.add(j5b.e());
                arrayList4.add(j5b.f());
                L2 = gl.L(56.0f) + 0.0f + gl.L(150.0f) + gl.L(32.0f);
                l35Var.setText(k96.M0(2131744338, null));
                i(z);
                this.G = true;
            } else if (i3 == 6) {
                tv7Var.e(k96.M0(2131744335, null));
                tv7Var.d(true);
                ((ed0) tv7Var.e).c(false, 0.0f);
                arrayList4.add(j5b.d());
                arrayList4.add(j5b.c());
                arrayList4.size();
                arrayList4.add(j5b.e());
                arrayList4.add(j5b.f());
                L2 = gl.L(56.0f) + 0.0f + gl.L(150.0f) + gl.L(32.0f);
                l35Var.setText(k96.M0(2131744336, null));
                i(z);
                this.G = true;
            } else if (i3 == 4) {
                tv7Var.e(k96.M0(2131744330, null));
                tv7Var.d(true);
                ((ed0) tv7Var.e).c(false, 0.0f);
                arrayList4.add(j5b.d());
                arrayList4.add(j5b.c());
                arrayList4.size();
                arrayList4.add(j5b.e());
                arrayList4.add(j5b.f());
                L = gl.L(56.0f) + 0.0f + gl.L(150.0f) + gl.L(32.0f);
                l35Var.setText(k96.M0(2131744331, null));
                i(z);
                this.G = true;
                boolean isEmpty = TextUtils.isEmpty(this.J);
                if (this.a != 0) {
                    String lowerCase = gl.J3(this.J).toLowerCase();
                    int i4 = this.a;
                    if (i4 == 5) {
                        int i5 = y5b.X1;
                        arrayList = new ArrayList();
                        na7 q1 = na7.q1(y5bVar.a);
                        ArrayList arrayList5 = q1.y;
                        for (int i6 = 0; i6 < arrayList5.size(); i6++) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList5.get(i6);
                            if (q1.v(dialog)) {
                                boolean D = cf3.D(dialog.id);
                                long j = dialog.id;
                                if (D) {
                                    TLRPC.User V12 = q1.V1(Long.valueOf(j));
                                    if (V12 != null && !V12.bot && V12.id != 777000 && !l7c.C(V12)) {
                                        arrayList.add(V12);
                                    }
                                } else if (cf3.y(j) && (K02 = q1.K0(Long.valueOf(-dialog.id))) != null && !hc2.c0(K02)) {
                                    arrayList.add(K02);
                                }
                            }
                        }
                        z2 = isEmpty;
                        f = L;
                    } else {
                        boolean z9 = i4 == 1 || i4 == 2;
                        boolean z10 = y5bVar.S1 && (i4 == 3 || i4 == 6);
                        na7 q12 = na7.q1(y5bVar.a);
                        HashMap hashMap = new HashMap();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = q12.y;
                        ConcurrentHashMap concurrentHashMap = qu2.r(y5bVar.a).g0;
                        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                            if (y5bVar.U1) {
                                z2 = isEmpty;
                                z3 = z10;
                                f = L;
                            } else {
                                z3 = z10;
                                f = L;
                                z2 = isEmpty;
                                qu2.r(y5bVar.a).A(0L, false);
                            }
                            y5bVar.U1 = true;
                        } else {
                            z2 = isEmpty;
                            z3 = z10;
                            f = L;
                        }
                        int i7 = 0;
                        while (i7 < arrayList7.size()) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList7.get(i7);
                            boolean z11 = z9;
                            if (cf3.D(dialog2.id)) {
                                TLRPC.User V13 = q12.V1(Long.valueOf(dialog2.id));
                                if (V13 != null && !V13.bot && V13.id != 777000 && !l7c.C(V13) && !V13.deleted && (!z11 || (concurrentHashMap != null && concurrentHashMap.get(Long.valueOf(V13.id)) != null))) {
                                    hashMap.put(Long.valueOf(V13.id), Boolean.TRUE);
                                    arrayList6.add(V13);
                                }
                            } else if (z3 && cf3.y(dialog2.id) && (K0 = q12.K0(Long.valueOf(-dialog2.id))) != null && !hc2.V(K0)) {
                                hashMap.put(Long.valueOf(-K0.id), Boolean.TRUE);
                                arrayList6.add(K0);
                            }
                            i7++;
                            z9 = z11;
                        }
                        if (concurrentHashMap != null) {
                            Iterator it = concurrentHashMap.entrySet().iterator();
                            while (it.hasNext()) {
                                Long l = (Long) ((Map.Entry) it.next()).getKey();
                                l.getClass();
                                if (!hashMap.containsKey(l) && (V1 = q12.V1(l)) != null && !V1.bot && V1.id != 777000 && !l7c.C(V1)) {
                                    arrayList6.add(V1);
                                    hashMap.put(Long.valueOf(V1.id), Boolean.TRUE);
                                }
                            }
                        }
                        arrayList = arrayList6;
                    }
                    ArrayList arrayList8 = this.c;
                    HashMap hashMap2 = this.d;
                    HashSet M0 = y5b.M0(arrayList8, hashMap2);
                    ArrayList arrayList9 = this.K;
                    if (z2) {
                        if (!z) {
                            arrayList9.clear();
                            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                TLObject tLObject = (TLObject) arrayList.get(i8);
                                if (tLObject instanceof TLRPC.User ? arrayList8.contains(Long.valueOf(((TLRPC.User) tLObject).id)) : tLObject instanceof TLRPC.Chat ? hashMap2.containsKey(Long.valueOf(((TLRPC.Chat) tLObject).id)) : false) {
                                    arrayList9.add(tLObject);
                                }
                            }
                        }
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < arrayList9.size()) {
                            TLObject tLObject2 = (TLObject) arrayList9.get(i9);
                            if (tLObject2 instanceof TLRPC.User) {
                                TLRPC.User user = (TLRPC.User) tLObject2;
                                boolean contains = arrayList8.contains(Long.valueOf(user.id));
                                int i11 = i9;
                                int i12 = i10;
                                j5b i13 = j5b.i(user, contains, !contains && M0.contains(Long.valueOf(user.id)));
                                int i14 = this.a;
                                i13.m = i14 == 2 || i14 == 4;
                                arrayList4.add(i13);
                                f += gl.L(56.0f);
                                i10 = i12 + 1;
                                i2 = i11;
                            } else {
                                int i15 = i9;
                                int i16 = i10;
                                if (tLObject2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                                    boolean containsKey = hashMap2.containsKey(Long.valueOf(chat.id));
                                    i2 = i15;
                                    j5b j5bVar = new j5b(3, true);
                                    j5bVar.h = chat;
                                    j5bVar.k = containsKey;
                                    int i17 = this.a;
                                    j5bVar.m = i17 == 2 || i17 == 4;
                                    arrayList4.add(j5bVar);
                                    f += gl.L(56.0f);
                                    i10 = i16 + 1;
                                } else {
                                    i2 = i15;
                                    i10 = i16;
                                }
                            }
                            i9 = i2 + 1;
                        }
                        i = i10;
                    } else {
                        i = 0;
                    }
                    int i18 = 0;
                    while (i18 < arrayList.size()) {
                        TLObject tLObject3 = (TLObject) arrayList.get(i18);
                        if ((!z2 || !arrayList9.contains(tLObject3)) && d(lowerCase, tLObject3)) {
                            if (tLObject3 instanceof TLRPC.User) {
                                TLRPC.User user2 = (TLRPC.User) tLObject3;
                                boolean contains2 = arrayList8.contains(Long.valueOf(user2.id));
                                j5b i19 = j5b.i(user2, contains2, !contains2 && M0.contains(Long.valueOf(user2.id)));
                                int i20 = this.a;
                                i19.m = i20 == 2 || i20 == 4;
                                arrayList4.add(i19);
                                f += gl.L(56.0f);
                                i++;
                            } else if (tLObject3 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject3;
                                boolean containsKey2 = hashMap2.containsKey(Long.valueOf(chat2.id));
                                arrayList2 = arrayList8;
                                j5b j5bVar2 = new j5b(3, true);
                                j5bVar2.h = chat2;
                                j5bVar2.k = containsKey2;
                                int i21 = this.a;
                                j5bVar2.m = i21 == 2 || i21 == 4;
                                arrayList4.add(j5bVar2);
                                f += gl.L(56.0f);
                                i++;
                                i18++;
                                arrayList8 = arrayList2;
                            }
                        }
                        arrayList2 = arrayList8;
                        i18++;
                        arrayList8 = arrayList2;
                    }
                    if (!z2) {
                        if (i == 0) {
                            arrayList4.add(new j5b(5, false));
                            f += gl.L(150.0f);
                        }
                        o39 o39Var = this.f;
                        float measuredHeight = (o39Var != null ? ((o39Var.getMeasuredHeight() - o39Var.getPaddingTop()) - o39Var.getPaddingBottom()) + (y5bVar.d ? this.U : 0) : ((gl.q.y - gl.L(56.0f)) - gl.n) - gl.L(42.0f)) - f;
                        if (measuredHeight > 0.0f) {
                            j5b j5bVar3 = new j5b(-1, false);
                            j5bVar3.p = (int) measuredHeight;
                            arrayList4.add(j5bVar3);
                        }
                    }
                }
                if (this.h.t) {
                    Collections.reverse(arrayList4);
                }
                p5bVar = this.n;
                if (p5bVar != null) {
                    if (!z || y5bVar.H1 == 0) {
                        p5bVar.f();
                    } else {
                        p5bVar.E(arrayList3, arrayList4);
                    }
                }
                this.e.invalidate();
            }
            L = L2;
            boolean isEmpty2 = TextUtils.isEmpty(this.J);
            if (this.a != 0) {
            }
            if (this.h.t) {
            }
            p5bVar = this.n;
            if (p5bVar != null) {
            }
            this.e.invalidate();
        }
        this.G = false;
        l35Var.setVisibility(8);
        int i22 = y5b.X1;
        int i23 = y5bVar.a;
        ArrayList arrayList10 = y5bVar.r1;
        ArrayList arrayList11 = y5bVar.n1;
        HashSet hashSet = y5bVar.u1;
        ArrayList arrayList12 = y5bVar.q1;
        ArrayList arrayList13 = na7.q1(i23).M1().T;
        j5b j5bVar4 = new j5b(-1, false);
        j5bVar4.o = 24;
        arrayList4.add(j5bVar4);
        if (y5bVar.F1) {
            String M02 = k96.M0(2131748597, null);
            j5b j5bVar5 = new j5b(11, false);
            j5bVar5.e = M02;
            arrayList4.add(j5bVar5);
            j5bVar4.o = gl.L(72.0f) + j5bVar4.o;
        } else if (y5bVar.z1 && (y5bVar.T1 || arrayList13 == null || arrayList13.size() <= 1)) {
            String M03 = y5bVar.T1 ? k96.M0(2131744332, null) : k96.M0(y5bVar.E1 ? 2131744380 : 2131744321, null);
            if (y5bVar.E1) {
                G = k96.M0(2131744381, null);
            } else {
                int i24 = y5bVar.K1;
                G = i24 != Integer.MAX_VALUE ? k96.G(i24 / 3600, "StoryPrivacyAlertSubtitle", new Object[0]) : k96.M0(2131744324, null);
            }
            j5b j5bVar6 = new j5b(4, false);
            j5bVar6.e = M03;
            j5bVar6.f = G;
            arrayList4.add(j5bVar6);
            j5bVar4.o = gl.L(72.0f) + j5bVar4.o;
        } else {
            String M04 = k96.M0(y5bVar.E1 ? 2131744378 : 2131744278, null);
            j5b j5bVar7 = new j5b(8, false);
            j5bVar7.e = M04;
            arrayList4.add(j5bVar7);
            j5bVar4.o = gl.L(50.0f) + j5bVar4.o;
            TLRPC.InputPeer inputPeer = y5bVar.m1;
            if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                j5b i25 = j5b.i(y6c.h(y5bVar.a).f(), false, false);
                i25.n = true;
                arrayList4.add(i25);
                j5bVar4.o = gl.L(62.0f) + j5bVar4.o;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                j5b i26 = j5b.i(na7.q1(y5bVar.a).V1(Long.valueOf(y5bVar.m1.user_id)), false, false);
                i26.n = true;
                arrayList4.add(i26);
                j5bVar4.o = gl.L(62.0f) + j5bVar4.o;
            } else {
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.Chat K03 = na7.q1(y5bVar.a).K0(Long.valueOf(y5bVar.m1.channel_id));
                    j5b j5bVar8 = new j5b(3, true);
                    j5bVar8.h = K03;
                    j5bVar8.k = false;
                    j5bVar8.n = true;
                    arrayList4.add(j5bVar8);
                    z5 = hc2.V(K03);
                    j5bVar4.o = gl.L(104.0f) + j5bVar4.o;
                    z4 = false;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.Chat K04 = na7.q1(y5bVar.a).K0(Long.valueOf(y5bVar.m1.chat_id));
                    j5b j5bVar9 = new j5b(3, true);
                    j5bVar9.h = K04;
                    j5bVar9.k = false;
                    j5bVar9.n = true;
                    arrayList4.add(j5bVar9);
                    j5bVar4.o = gl.L(104.0f) + j5bVar4.o;
                    z5 = false;
                    z4 = false;
                }
                j5b g = j5b.g(null);
                g.c = !z4 ? (byte) 1 : (byte) 2;
                arrayList4.add(g);
                j5bVar4.o = gl.L(12.0f) + j5bVar4.o;
                if (z4) {
                    String M05 = k96.M0(y5bVar.E1 ? 2131744377 : 2131744273, null);
                    j5b j5bVar10 = new j5b(8, false);
                    j5bVar10.e = M05;
                    arrayList4.add(j5bVar10);
                    j5bVar4.o = gl.L(40.0f) + j5bVar4.o;
                }
                if (z4 || y5bVar.F1) {
                    f2 = 80.0f;
                } else {
                    f2 = 80.0f;
                    j5b h = j5b.h(4, y5bVar.p1, y5bVar.H1 == 4);
                    arrayList4.add(h);
                    j5bVar4.o = gl.L(56.0f) + j5bVar4.o;
                    if (y5bVar.p1 == 1) {
                        if (arrayList11.size() != 1) {
                            Iterator it2 = y5bVar.o1.values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList14 = (ArrayList) it2.next();
                                if (arrayList14.size() >= 1) {
                                    h.g = na7.q1(y5bVar.a).V1((Long) arrayList14.get(0));
                                    break;
                                }
                            }
                        } else {
                            h.g = na7.q1(y5bVar.a).V1((Long) arrayList11.get(0));
                        }
                    }
                    j5b h2 = j5b.h(2, arrayList12.size(), y5bVar.H1 == 2);
                    arrayList4.add(h2);
                    j5bVar4.o = gl.L(56.0f) + j5bVar4.o;
                    if (arrayList12.size() == 1) {
                        h2.g = na7.q1(y5bVar.a).V1((Long) arrayList12.get(0));
                    }
                    ArrayList H0 = y5bVar.H0();
                    j5b h3 = j5b.h(1, H0.size(), y5bVar.H1 == 1);
                    arrayList4.add(h3);
                    j5bVar4.o = gl.L(56.0f) + j5bVar4.o;
                    if (H0.size() == 1 && (H0.get(0) instanceof TLRPC.User)) {
                        h3.g = (TLRPC.User) H0.get(0);
                    }
                    j5b h4 = j5b.h(3, y5bVar.t1, y5bVar.H1 == 3);
                    arrayList4.add(h4);
                    j5bVar4.o = gl.L(56.0f) + j5bVar4.o;
                    if (y5bVar.t1 == 1) {
                        if (arrayList10.size() != 1) {
                            Iterator it3 = y5bVar.s1.values().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList15 = (ArrayList) it3.next();
                                if (arrayList15.size() >= 1) {
                                    h4.g = na7.q1(y5bVar.a).V1((Long) arrayList15.get(0));
                                    break;
                                }
                            }
                        } else {
                            h4.g = na7.q1(y5bVar.a).V1((Long) arrayList10.get(0));
                        }
                    }
                    int i27 = na7.q1(y5bVar.a).M1().N;
                    boolean z12 = y5bVar.E1;
                    arrayList4.add(j5b.g(gl.O2(i27 <= 0 ? k96.M0(z12 ? 2131744388 : 2131744479, null) : k96.G(i27, z12 ? "StoryLiveBlockList" : "StoryBlockList", new Object[0]), bkb.Wc, 0, new l5b(this, (byte) 3), y5bVar.J0)));
                    j5bVar4.o = gl.L(80.0f) + j5bVar4.o;
                }
                if (!y5bVar.T1) {
                    if (y5bVar.E1 && !y5bVar.F1) {
                        if (y5bVar.A1) {
                            arrayList4.add(j5b.b(k96.M0(2131748605, null), "", 5));
                            j5bVar4.o = gl.L(50.0f) + j5bVar4.o;
                            arrayList4.add(j5b.b(k96.M0(2131748611, null), "", 6));
                            j5bVar4.o = gl.L(50.0f) + j5bVar4.o;
                            arrayList4.add(j5b.g(null));
                            j5bVar4.o = gl.L(12.0f) + j5bVar4.o;
                        } else {
                            arrayList4.add(j5b.b(k96.M0(2131748610, null), "", 5));
                            j5bVar4.o = gl.L(50.0f) + j5bVar4.o;
                            arrayList4.add(j5b.g(k96.M0(2131748609, null)));
                            j5bVar4.o = gl.L(30.0f) + j5bVar4.o;
                        }
                    }
                    if (y5bVar.E1) {
                        String M06 = k96.M0(2131744390, null);
                        boolean z13 = y5bVar.v1;
                        j5b j5bVar11 = new j5b(7, false);
                        j5bVar11.c = (byte) 2;
                        j5bVar11.e = M06;
                        j5bVar11.k = z13;
                        arrayList4.add(j5bVar11);
                        j5bVar4.o = gl.L(50.0f) + j5bVar4.o;
                    }
                    if (!y5bVar.F1) {
                        String M07 = k96.M0(2131744492, null);
                        boolean z14 = y5bVar.w1;
                        j5b j5bVar12 = new j5b(7, false);
                        j5bVar12.c = (byte) 0;
                        j5bVar12.e = M07;
                        j5bVar12.k = z14;
                        arrayList4.add(j5bVar12);
                        j5bVar4.o = gl.L(50.0f) + j5bVar4.o;
                    }
                    if (!y5bVar.E1 && !y5bVar.F1) {
                        String M08 = k96.M0(z4 ? 2131744418 : z5 ? 2131744417 : 2131744412, null);
                        boolean z15 = y5bVar.x1;
                        j5b j5bVar13 = new j5b(7, false);
                        j5bVar13.c = (byte) 1;
                        j5bVar13.e = M08;
                        j5bVar13.k = z15;
                        arrayList4.add(j5bVar13);
                        j5bVar4.o = gl.L(50.0f) + j5bVar4.o;
                    }
                }
                z6 = y5bVar.E1;
                String str = "StoryKeepGroupInfo";
                if (!z6 || y5bVar.F1) {
                    arrayList4.add(j5b.g(null));
                    j5bVar4.o = gl.L(12.0f) + j5bVar4.o;
                } else if (!y5bVar.T1 && y5bVar.y1 && y5bVar.W1 != null) {
                    if (z6) {
                        G3 = k96.M0(z4 ? 2131744383 : z5 ? 2131744385 : 2131744384, null);
                    } else {
                        String str2 = z4 ? "StoryKeepInfo" : z5 ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                        int i28 = y5bVar.K1;
                        if (i28 == Integer.MAX_VALUE) {
                            i28 = 86400;
                        }
                        G3 = k96.G(i28 / 3600, str2, new Object[0]);
                    }
                    arrayList4.add(j5b.g(G3));
                    j5bVar4.o = gl.L(f2) + j5bVar4.o;
                }
                if (y5bVar.x1 || y5bVar.E1 || y5bVar.F1) {
                    z7 = z5;
                } else {
                    TLRPC.InputPeer inputPeer2 = y5bVar.m1;
                    long m = inputPeer2 != null ? cf3.m(inputPeer2) : y6c.h(y5bVar.a).e();
                    na7.q1(y5bVar.a).M1().A(m, true);
                    StringBuilder sb = new StringBuilder();
                    if (hashSet.isEmpty()) {
                        sb.append(k96.M0(2131744549, null));
                        z7 = z5;
                    } else {
                        z7 = z5;
                        if (hashSet.size() < 3) {
                            Iterator it4 = hashSet.iterator();
                            while (it4.hasNext()) {
                                Iterator it5 = it4;
                                z1b b = na7.q1(y5bVar.a).M1().A(m, true).b(((Integer) it4.next()).intValue());
                                if (b != null) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(b.b);
                                }
                                it4 = it5;
                            }
                        } else {
                            sb.append(k96.G(hashSet.size(), "StoriesAlbumCount", new Object[0]));
                        }
                    }
                    arrayList4.add(j5b.b(k96.M0(2131744571, null), sb, 1));
                    j5bVar4.o = gl.L(50.0f) + j5bVar4.o;
                }
                if (!y5bVar.T1 && ((!y5bVar.y1 || y5bVar.W1 == null) && !(z8 = y5bVar.E1) && !y5bVar.F1)) {
                    if (z8) {
                        if (z4) {
                            str = "StoryKeepInfo";
                        } else if (z7) {
                            str = "StoryKeepChannelInfo";
                        }
                        int i29 = y5bVar.K1;
                        G2 = k96.G((i29 == Integer.MAX_VALUE ? 86400 : i29) / 3600, str, new Object[0]);
                    } else {
                        G2 = k96.M0(z4 ? 2131744383 : z7 ? 2131744385 : 2131744384, null);
                    }
                    arrayList4.add(j5b.g(G2));
                    j5bVar4.o = gl.L(f2) + j5bVar4.o;
                }
                if (y5bVar.x1 && y5bVar.y1 && y5bVar.W1 != null) {
                    String M09 = k96.M0(2131744436, null);
                    BitmapDrawable bitmapDrawable = y5bVar.V1;
                    j5b j5bVar14 = new j5b(9, false);
                    j5bVar14.e = M09;
                    j5bVar14.d = bitmapDrawable;
                    j5bVar14.q = (byte) 0;
                    arrayList4.add(j5bVar14);
                    j5bVar4.o = gl.L(50.0f) + j5bVar4.o;
                    arrayList4.add(j5b.g(k96.M0(2131744435, null)));
                    j5bVar4.o = gl.L(72.0f) + j5bVar4.o;
                }
                if (y5bVar.F1) {
                    arrayList4.add(j5b.b(k96.M0(2131748605, null), "", 5));
                    j5bVar4.o = gl.L(50.0f) + j5bVar4.o;
                    arrayList4.add(j5b.g(null));
                    j5bVar4.o = gl.L(52.0f) + j5bVar4.o;
                }
                if (y5bVar.E1 && y5bVar.v1) {
                    String M010 = k96.M0(2131748614, null);
                    j5b j5bVar15 = new j5b(8, false);
                    j5bVar15.e = M010;
                    arrayList4.add(j5bVar15);
                    j5bVar4.o = gl.L(40.0f) + j5bVar4.o;
                    j5b j5bVar16 = new j5b(10, false);
                    j5bVar16.q = (byte) 8;
                    arrayList4.add(j5bVar16);
                    j5bVar4.o = gl.L(75.0f) + j5bVar4.o;
                    arrayList4.add(j5b.g(k96.M0(2131748612, null)));
                    j5bVar4.o = gl.L(50.0f) + j5bVar4.o;
                }
            }
            z4 = true;
            z5 = false;
            j5b g2 = j5b.g(null);
            g2.c = !z4 ? (byte) 1 : (byte) 2;
            arrayList4.add(g2);
            j5bVar4.o = gl.L(12.0f) + j5bVar4.o;
            if (z4) {
            }
            if (z4) {
            }
            f2 = 80.0f;
            if (!y5bVar.T1) {
            }
            z6 = y5bVar.E1;
            String str3 = "StoryKeepGroupInfo";
            if (z6) {
            }
            arrayList4.add(j5b.g(null));
            j5bVar4.o = gl.L(12.0f) + j5bVar4.o;
            if (y5bVar.x1) {
            }
            z7 = z5;
            if (!y5bVar.T1) {
                if (z8) {
                }
                arrayList4.add(j5b.g(G2));
                j5bVar4.o = gl.L(f2) + j5bVar4.o;
            }
            if (y5bVar.x1) {
                String M092 = k96.M0(2131744436, null);
                BitmapDrawable bitmapDrawable2 = y5bVar.V1;
                j5b j5bVar142 = new j5b(9, false);
                j5bVar142.e = M092;
                j5bVar142.d = bitmapDrawable2;
                j5bVar142.q = (byte) 0;
                arrayList4.add(j5bVar142);
                j5bVar4.o = gl.L(50.0f) + j5bVar4.o;
                arrayList4.add(j5b.g(k96.M0(2131744435, null)));
                j5bVar4.o = gl.L(72.0f) + j5bVar4.o;
            }
            if (y5bVar.F1) {
            }
            if (y5bVar.E1) {
                String M0102 = k96.M0(2131748614, null);
                j5b j5bVar152 = new j5b(8, false);
                j5bVar152.e = M0102;
                arrayList4.add(j5bVar152);
                j5bVar4.o = gl.L(40.0f) + j5bVar4.o;
                j5b j5bVar162 = new j5b(10, false);
                j5bVar162.q = (byte) 8;
                arrayList4.add(j5bVar162);
                j5bVar4.o = gl.L(75.0f) + j5bVar4.o;
                arrayList4.add(j5b.g(k96.M0(2131748612, null)));
                j5bVar4.o = gl.L(50.0f) + j5bVar4.o;
            }
        }
        z4 = true;
        z5 = false;
        if (z4) {
        }
        f2 = 80.0f;
        if (!y5bVar.T1) {
        }
        z6 = y5bVar.E1;
        String str32 = "StoryKeepGroupInfo";
        if (z6) {
        }
        arrayList4.add(j5b.g(null));
        j5bVar4.o = gl.L(12.0f) + j5bVar4.o;
        if (y5bVar.x1) {
        }
        z7 = z5;
        if (!y5bVar.T1) {
        }
        if (y5bVar.x1) {
        }
        if (y5bVar.F1) {
        }
        if (y5bVar.E1) {
        }
        L = 0.0f;
        boolean isEmpty22 = TextUtils.isEmpty(this.J);
        if (this.a != 0) {
        }
        if (this.h.t) {
        }
        p5bVar = this.n;
        if (p5bVar != null) {
        }
        this.e.invalidate();
    }

    public final void i(boolean z) {
        l35 l35Var = this.E;
        if (l35Var == null) {
            return;
        }
        if (y5b.M0(this.c, this.d).size() > 0) {
            l35Var.a(k96.M0(2131743391, null), new k5b(this, (byte) 2));
            return;
        }
        if (z) {
            l35Var.setRightText(null);
            return;
        }
        ri riVar = l35Var.b;
        riVar.c(null, false, true);
        riVar.setOnClickListener(null);
        riVar.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(boolean z) {
        n5b n5bVar;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        HashSet M0 = y5b.M0(this.c, this.d);
        int i = this.a;
        y5b y5bVar = this.a0;
        if (i == 3) {
            y5bVar.t1 = M0.size();
        } else if (i == 4) {
            y5bVar.p1 = M0.size();
        }
        na7 q1 = na7.q1(y5bVar.a);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Object[] objArr = 0;
        int i2 = 0;
        while (true) {
            n5bVar = this.y;
            ArrayList arrayList4 = n5bVar.e;
            arrayList = n5bVar.e;
            if (i2 >= arrayList4.size()) {
                break;
            }
            ya5 ya5Var = (ya5) arrayList.get(i2);
            if (!M0.contains(Long.valueOf(ya5Var.getUid()))) {
                arrayList2.add(ya5Var);
            }
            i2++;
        }
        Iterator it = M0.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long longValue = l.longValue();
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    Object V1 = longValue >= 0 ? q1.V1(l) : q1.K0(l);
                    if (V1 != null) {
                        ya5 ya5Var2 = new ya5(getContext(), V1, null, true, y5bVar.J0);
                        ya5Var2.setOnClickListener(this);
                        arrayList3.add(ya5Var2);
                    }
                } else if (((ya5) arrayList.get(i3)).getUid() != longValue) {
                    i3++;
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        gz9 gz9Var = n5bVar.d;
        ArrayList arrayList5 = gz9Var.e;
        ArrayList arrayList6 = gz9Var.d;
        ArrayList arrayList7 = gz9Var.f;
        v5b v5bVar = (v5b) gz9Var.n;
        v5bVar.I = true;
        ArrayList arrayList8 = v5bVar.e;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = gz9Var.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            ((ya5) arrayList2.get(i4)).setOnClickListener(null);
        }
        gz9Var.c();
        if (z) {
            gz9Var.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            gz9Var.b = animatorSet;
            animatorSet.addListener(new u5b(gz9Var, arrayList2, objArr == true ? 1 : 0));
            arrayList7.clear();
            arrayList6.clear();
            arrayList5.clear();
            int i5 = 0;
            while (true) {
                int size = arrayList2.size();
                property = View.ALPHA;
                property2 = View.SCALE_Y;
                property3 = View.SCALE_X;
                if (i5 >= size) {
                    break;
                }
                ya5 ya5Var3 = (ya5) arrayList2.get(i5);
                arrayList5.add(ya5Var3);
                arrayList7.add(ObjectAnimator.ofFloat(ya5Var3, (Property<ya5, Float>) property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(ya5Var3, (Property<ya5, Float>) property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(ya5Var3, (Property<ya5, Float>) property, 1.0f, 0.0f));
                i5++;
            }
            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                ya5 ya5Var4 = (ya5) arrayList3.get(i6);
                arrayList6.add(ya5Var4);
                arrayList7.add(ObjectAnimator.ofFloat(ya5Var4, (Property<ya5, Float>) property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(ya5Var4, (Property<ya5, Float>) property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(ya5Var4, (Property<ya5, Float>) property, 0.0f, 1.0f));
            }
        } else {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                gz9Var.removeView((View) arrayList2.get(i7));
            }
            arrayList9.clear();
            gz9Var.b = null;
            gz9Var.c = false;
            v5bVar.b.setAllowDrawCursor(true);
        }
        for (int i8 = 0; i8 < arrayList3.size(); i8++) {
            gz9Var.addView((View) arrayList3.get(i8));
        }
        gz9Var.requestLayout();
    }

    public final void k() {
        float c = c();
        boolean z = this.N;
        boolean z2 = false;
        n5b n5bVar = this.y;
        if (z || this.V || getTranslationX() != 0.0f) {
            this.O = false;
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.Q = null;
            }
            n5bVar.setTranslationY(c);
        } else if (!this.O || Math.abs(this.P - c) > 1.0f) {
            this.O = true;
            ValueAnimator valueAnimator2 = this.Q;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.Q = null;
            }
            float translationY = n5bVar.getTranslationY();
            this.P = c;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c);
            this.Q = ofFloat;
            ofFloat.addUpdateListener(new gja(this, (byte) 17));
            this.Q.addListener(new ng9((Object) this, (byte) 28));
            this.Q.setInterpolator(new LinearInterpolator());
            this.Q.setDuration(180L);
            this.Q.start();
        }
        boolean z3 = this.G;
        tv7 tv7Var = this.F;
        if (!z3) {
            tv7Var.setVisibility(8);
            return;
        }
        tv7Var.setVisibility(0);
        float f = -tv7Var.getHeight();
        int i = 0;
        while (true) {
            o39 o39Var = this.f;
            if (i >= o39Var.getChildCount()) {
                z2 = true;
                break;
            }
            View childAt = o39Var.getChildAt(i);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                f = this.e.getPaddingTop() + childAt.getY();
                break;
            }
            i++;
        }
        if (this.R != z2) {
            this.R = z2;
            ((ed0) tv7Var.e).c(true, (z2 || this.a != 0) ? 0.0f : 1.0f);
        }
        tv7Var.setTranslationY(Math.max(gl.m, f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = y5b.X1;
        kk7.f(this.a0.a).b(this, kk7.S);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n5b n5bVar = this.y;
        if (!n5bVar.e.contains(view)) {
            return;
        }
        ya5 ya5Var = (ya5) view;
        if (!ya5Var.E) {
            ya5 ya5Var2 = n5bVar.f;
            if (ya5Var2 != null) {
                ya5Var2.a();
                n5bVar.f = null;
            }
            n5bVar.f = ya5Var;
            ya5Var.b();
            return;
        }
        n5bVar.f = null;
        gz9 gz9Var = n5bVar.d;
        v5b v5bVar = (v5b) gz9Var.n;
        v5bVar.I = true;
        v5bVar.e.remove(ya5Var);
        ya5Var.setOnClickListener(null);
        gz9Var.c();
        gz9Var.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        gz9Var.b = animatorSet;
        animatorSet.addListener(new eh8((Object) gz9Var, (Object) ya5Var, (byte) 17));
        ArrayList arrayList = gz9Var.h;
        arrayList.clear();
        arrayList.add(ya5Var);
        ArrayList arrayList2 = gz9Var.d;
        arrayList2.clear();
        gz9Var.e.clear();
        arrayList2.add(ya5Var);
        ArrayList arrayList3 = gz9Var.f;
        arrayList3.clear();
        arrayList3.add(ObjectAnimator.ofFloat(ya5Var, (Property<ya5, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(ya5Var, (Property<ya5, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(ya5Var, (Property<ya5, Float>) View.ALPHA, 1.0f, 0.0f));
        gz9Var.requestLayout();
        long uid = ya5Var.getUid();
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
        int i = y5b.X1;
        kk7.f(this.a0.a).n(this, kk7.S);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = y5b.X1;
        y5b y5bVar = this.a0;
        int i4 = y5bVar.f;
        if (i4 > 0) {
            this.U = i4;
        }
        super.onMeasure(i, i2);
        this.e.setPadding(0, gl.m + (this.a == 0 ? 0 : gl.L(56.0f)), 0, 0);
        boolean z = this.W;
        boolean z2 = y5bVar.d;
        r5b r5bVar = this.r;
        o39 o39Var = this.f;
        if (z != z2) {
            float c = c();
            byte b = 2;
            if (y5bVar.d && c + Math.min(gl.L(150.0f), this.y.L) > o39Var.getPaddingTop()) {
                v26 v26Var = new v26(getContext(), 2, 0.7f);
                v26Var.a = 1;
                v26Var.p = -gl.L(56.0f);
                this.h.v0(v26Var);
            }
            int i5 = this.a;
            boolean z3 = y5bVar.d;
            View view = this.s;
            if (i5 == 0) {
                r5bVar.setTranslationY(z3 ? this.U : 0.0f);
                view.setTranslationY(y5bVar.d ? this.U : 0.0f);
            } else {
                int i6 = this.U;
                if (!z3) {
                    i6 = -i6;
                }
                float f = i6;
                ValueAnimator valueAnimator = r5bVar.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    r5bVar.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                r5bVar.d = ofFloat;
                ofFloat.addUpdateListener(new q5b(r5bVar, (byte) 1));
                r5bVar.d.addListener(new ng9((Object) r5bVar, (byte) 29));
                r5bVar.d.setDuration(250L);
                ValueAnimator valueAnimator2 = r5bVar.d;
                s33 s33Var = gb.w;
                valueAnimator2.setInterpolator(s33Var);
                r5bVar.d.start();
                view.setTranslationY(y5bVar.d ? this.U : -r10);
                this.V = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(s33Var).withEndAction(new l5b(this, b)).start();
            }
            this.W = y5bVar.d;
        }
        o39Var.setPadding(0, 0, 0, r5bVar.getMeasuredHeight());
    }
}
