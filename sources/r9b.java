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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class r9b extends FrameLayout implements View.OnClickListener, fn7 {
    public final p55 E;
    public final az7 F;
    public boolean G;
    public id H;
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
    public final /* synthetic */ w9b a0;
    public final zh6 b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final d79 f;
    public final x46 h;
    public final n9b n;
    public final p9b r;
    public final View s;
    public final c51 w;
    public final c51 x;
    public final l9b y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9b(w9b w9bVar, Context context) {
        super(context);
        this.a0 = w9bVar;
        this.b = new zh6();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.S = -1;
        int i = w9b.X1;
        p55 p55Var = new p55(context, w9bVar.J0);
        this.E = p55Var;
        l9b l9bVar = new l9b(this, context, w9bVar.J0, new i9b(this, (byte) 4));
        this.y = l9bVar;
        int i2 = aob.h5;
        yob.h(i2, w9bVar.J0, l9bVar);
        l9bVar.setOnSearchTextChange(new j9b(this, (byte) 3));
        az7 az7Var = new az7(context, w9bVar.J0);
        this.F = az7Var;
        az7Var.h = new i9b(this, (byte) 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, hl.L(56.0f) + hl.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, tre.e(-1, -1, jn7.D1));
        d79 d79Var = new d79(context, w9bVar.J0);
        this.f = d79Var;
        d79Var.setClipToPadding(false);
        d79Var.setTranslateSelector(true);
        byte b = 2;
        n9b n9bVar = new n9b(this, context, w9bVar.J0, l9bVar, new c68(w9bVar, b));
        this.n = n9bVar;
        d79Var.setAdapter(n9bVar);
        n9bVar.h = d79Var;
        x46 x46Var = new x46();
        this.h = x46Var;
        d79Var.setLayoutManager(x46Var);
        d79Var.setOnScrollListener(new n52(this, b));
        d79Var.setOnItemClickListener(new yw9(this, context, (byte) 7));
        frameLayout.addView(d79Var, tre.c(-1.0f, -1));
        m9b m9bVar = new m9b(this);
        m9bVar.n(350L);
        m9bVar.o(k43.h);
        m9bVar.C = false;
        m9bVar.m = false;
        d79Var.setItemAnimator(m9bVar);
        frameLayout.addView(l9bVar, tre.e(-1, -2, 55));
        frameLayout.addView(p55Var, tre.e(-1, 32, 55));
        addView(az7Var, tre.e(-1, -2, 55));
        p9b p9bVar = new p9b(this, context);
        this.r = p9bVar;
        p9bVar.setClickable(true);
        p9bVar.setOrientation(1);
        p9bVar.setPadding(hl.L(10.0f) + w9bVar.u0, hl.L(10.0f), hl.L(10.0f) + w9bVar.u0, hl.L(10.0f));
        yob.h(i2, w9bVar.J0, p9bVar);
        c51 c51Var = new c51(w9bVar.J0, context, true);
        this.w = c51Var;
        c51Var.setOnClickListener(new k9b(this, (byte) 1));
        c51Var.f();
        p9bVar.addView(c51Var, tre.r(-1, 48, 87));
        c51 c51Var2 = new c51(w9bVar.J0, context, false);
        this.x = c51Var2;
        c51Var2.setOnClickListener(new k9b(this, b));
        c51Var2.f();
        p9bVar.addView(c51Var2, tre.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        yob.h(i2, w9bVar.J0, view);
        addView(view, tre.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(p9bVar, tre.e(-1, -2, 87));
    }

    public static boolean d(String str, TLObject tLObject) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            String lowerCase = hl.I3(lbc.r(user)).toLowerCase();
            if (lowerCase.startsWith(str) || uh9.t(" ", str, lowerCase)) {
                return true;
            }
            String lowerCase2 = hl.I3(lbc.p(user)).toLowerCase();
            if (lowerCase2.startsWith(str) || uh9.t(" ", str, lowerCase2)) {
                return true;
            }
            ArrayList<TLRPC.TL_username> arrayList = user.usernames;
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC.TL_username tL_username = arrayList.get(i);
                    if (tL_username.active && hl.I3(tL_username.username).toLowerCase().startsWith(str)) {
                        return true;
                    }
                }
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String lowerCase3 = hl.I3(chat.title).toLowerCase();
            if (lowerCase3.startsWith(str) || uh9.t(" ", str, lowerCase3)) {
                return true;
            }
            String lowerCase4 = hl.I3(xc2.K(chat, false)).toLowerCase();
            if (lowerCase4.startsWith(str) || uh9.t(" ", str, lowerCase4)) {
                return true;
            }
            ArrayList<TLRPC.TL_username> arrayList2 = chat.usernames;
            if (arrayList2 != null) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    TLRPC.TL_username tL_username2 = arrayList2.get(i2);
                    if (tL_username2.active && hl.I3(tL_username2.username).toLowerCase().startsWith(str)) {
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
            int i = w9b.X1;
            arrayList.addAll(uc7.s1(this.a0.a).O1().L);
            int i2 = 0;
            while (true) {
                zh6 zh6Var = this.b;
                if (i2 >= zh6Var.m()) {
                    break;
                }
                long j = zh6Var.j(i2);
                if (!((Boolean) zh6Var.n(i2)).booleanValue()) {
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
        w9b w9bVar = this.a0;
        if (i == 4) {
            arrayList.addAll(w9bVar.n1);
            hashMap.putAll(w9bVar.o1);
        } else if (i == 5) {
            arrayList.addAll(w9bVar.D1);
        } else if (i == 1) {
            int i2 = w9b.X1;
            ArrayList I0 = w9bVar.I0();
            for (int i3 = 0; i3 < I0.size(); i3 = dze.c(i3, 1, ((TLRPC.User) I0.get(i3)).id, arrayList)) {
            }
        } else if (i == 2) {
            arrayList.addAll(w9bVar.q1);
        } else if (i == 3) {
            arrayList.addAll(w9bVar.r1);
            hashMap.putAll(w9bVar.s1);
        } else if (i == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.j1(false);
        j(false);
        l9b l9bVar = this.y;
        l9bVar.setText("");
        l9bVar.setVisibility(i == 0 ? 8 : 0);
        l9bVar.M = true;
        this.J = null;
        h(false);
        f(false);
        g(false);
        int i4 = this.a;
        d79 d79Var = this.f;
        if (i4 != 0) {
            d79Var.x0(0);
        }
        d79Var.requestLayout();
        this.S = -1;
    }

    public final float c() {
        int i = 0;
        float f = -c00.d(150.0f, Math.min(hl.L(150.0f), this.y.L), 0);
        while (true) {
            d79 d79Var = this.f;
            if (i >= d79Var.getChildCount()) {
                return f;
            }
            View childAt = d79Var.getChildAt(i);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                return Math.max(f, childAt.getY());
            }
            i++;
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatFull chatFull;
        id idVar;
        if (i != jn7.T || (chatFull = (TLRPC.ChatFull) objArr[0]) == null || (idVar = this.H) == null || this.I != chatFull.id) {
            return;
        }
        idVar.b(350L);
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
        w9b w9bVar = this.a0;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i3 = 0; i3 < chatParticipants.participants.size(); i3++) {
                long j2 = chatParticipants.participants.get(i3).user_id;
                int i4 = w9b.X1;
                TLRPC.User X1 = uc7.s1(w9bVar.a).X1(Long.valueOf(j2));
                if (X1 != null && !lbc.D(X1) && !X1.bot && X1.id != 777000 && j2 != 0) {
                    if (!z || X1.contact) {
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
                this.b.k(((Long) obj).longValue(), Boolean.TRUE);
            }
            j(true);
            f(true);
            g(true);
            this.y.M = true;
            return;
        }
        if (arrayList.isEmpty()) {
            Context context = getContext();
            int i5 = w9b.X1;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, w9bVar.J0, context);
            alertDialog$Builder.a.U = ob6.M0(2131744192, null);
            ik8.y(null, 2131752570, alertDialog$Builder, null);
            return;
        }
        Context context2 = getContext();
        int i6 = w9b.X1;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, w9bVar.J0, context2);
        alertDialog$Builder2.a.U = ob6.G(arrayList2.size(), "StoryPrivacyGroupNonContacts", new Object[0]);
        alertDialog$Builder2.j(ob6.G(arrayList.size(), "StoryPrivacyGroupAddContacts", new Object[0]), new ps0((Object) this, j, (Object) arrayList, (byte) 10));
        ik8.y(null, 2131752570, alertDialog$Builder2, null);
    }

    public final void f(boolean z) {
        int i = this.a;
        w9b w9bVar = this.a0;
        c51 c51Var = this.x;
        int i2 = 0;
        c51 c51Var2 = this.w;
        if (i == 0) {
            c51Var2.setShowZero(false);
            c51Var2.setEnabled(true);
            c51Var2.c(0, z);
            if (w9bVar.F1) {
                c51Var2.i(ob6.M0(2131744208, null), z, true);
            } else if (w9bVar.T1) {
                c51Var2.i(ob6.M0(2131744208, null), z, true);
            } else {
                int i3 = w9bVar.C1;
                if (i3 == 1) {
                    c51Var2.i(ob6.M0(w9bVar.E1 ? 2131744273 : 2131744212, null), z, true);
                } else {
                    c51Var2.i(ob6.H(',', "StoryPrivacyButtonPostMultiple", i3), z, true);
                }
            }
            c51Var.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.c;
        if (i == 1) {
            c51Var2.setShowZero(false);
            c51Var2.setEnabled(true);
            c51Var2.i(ob6.M0(2131744207, null), z, true);
            c51Var2.c(arrayList.size(), z);
            c51Var.setVisibility(8);
            return;
        }
        p9b p9bVar = this.r;
        if (i == 3) {
            int size = w9b.N0(arrayList, this.d).size();
            w9bVar.t1 = size;
            c51Var2.i(ob6.M0(2131744208, null), z, true);
            c51Var2.setShowZero(false);
            p9bVar.a(size <= 0, z);
            c51Var2.c(size, z);
            c51Var2.setEnabled(size > 0);
            c51Var.setVisibility(8);
            return;
        }
        if (i == 2) {
            c51Var2.setShowZero(false);
            c51Var2.setEnabled(true);
            if (arrayList.isEmpty()) {
                c51Var2.i(ob6.M0(2131744208, null), z, true);
                c51Var2.c(0, z);
            } else {
                c51Var2.i(ob6.M0(2131744213, null), z, true);
                c51Var2.c(arrayList.size(), z);
            }
            c51Var.setVisibility(8);
            return;
        }
        if (i == 5) {
            c51Var2.setShowZero(true);
            c51Var2.setEnabled(!arrayList.isEmpty());
            c51Var2.c(arrayList.size(), z);
            c51Var.setVisibility(8);
            return;
        }
        if (i != 6) {
            if (i == 4) {
                int size2 = w9b.N0(w9bVar.n1, w9bVar.o1).size();
                w9bVar.p1 = size2;
                c51Var2.i(ob6.M0(2131744208, null), z, true);
                c51Var2.setShowZero(false);
                p9bVar.a(false, z);
                c51Var2.c(size2, z);
                c51Var2.setEnabled(true);
                c51Var.setVisibility(8);
                return;
            }
            return;
        }
        c51Var2.setShowZero(false);
        c51Var2.setEnabled(true);
        c51Var2.i(ob6.M0(2131744207, null), z, true);
        int i4 = w9b.X1;
        c6b O1 = uc7.s1(w9bVar.a).O1();
        if (!O1.O) {
            while (true) {
                zh6 zh6Var = this.b;
                if (i2 >= zh6Var.m()) {
                    break;
                }
                long j = zh6Var.j(i2);
                ((Boolean) zh6Var.n(i2)).getClass();
                O1.L.contains(Long.valueOf(j));
                i2++;
            }
        } else {
            c51Var2.c(arrayList.size(), z);
        }
        c51Var.setVisibility(8);
    }

    public final void g(boolean z) {
        ArrayList arrayList;
        int S;
        w9b w9bVar = this.a0;
        ArrayList arrayList2 = w9bVar.D1;
        HashMap hashMap = w9bVar.s1;
        ArrayList arrayList3 = w9bVar.r1;
        ArrayList arrayList4 = w9bVar.q1;
        HashMap hashMap2 = w9bVar.o1;
        ArrayList arrayList5 = w9bVar.n1;
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
        if (this.a == 3 && (w9bVar.H1 != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i2 = this.S;
                if (i2 != -1) {
                    w9bVar.H1 = i2;
                }
            } else {
                this.S = w9bVar.H1;
                w9bVar.H1 = 3;
            }
        }
        HashSet N0 = w9b.N0(arrayList6, hashMap3);
        int i3 = 0;
        while (true) {
            arrayList = this.M;
            if (i3 >= arrayList.size()) {
                break;
            }
            h9b h9bVar = (h9b) arrayList.get(i3);
            if (h9bVar != null) {
                byte b = h9bVar.i;
                if (b > 0) {
                    h9bVar.k = w9bVar.H1 == b;
                    h9bVar.l = false;
                } else {
                    TLRPC.User user = h9bVar.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        h9bVar.k = contains;
                        h9bVar.l = !contains && N0.contains(Long.valueOf(h9bVar.g.id));
                    } else {
                        TLRPC.Chat chat = h9bVar.h;
                        if (chat != null) {
                            h9bVar.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            h9bVar.l = false;
                        }
                    }
                }
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            d79 d79Var = this.f;
            if (i4 >= d79Var.getChildCount()) {
                i(z);
                return;
            }
            View childAt = d79Var.getChildAt(i4);
            if ((childAt instanceof v9b) && (S = RecyclerView.S(childAt)) >= 0 && S < arrayList.size()) {
                h9b h9bVar2 = (h9b) arrayList.get(S);
                v9b v9bVar = (v9b) childAt;
                v9bVar.c(h9bVar2.k || h9bVar2.l, z);
                TLRPC.Chat chat2 = h9bVar2.h;
                if (chat2 != null) {
                    v9bVar.b(z, w9bVar.K0(chat2) > 200 ? 0.3f : 1.0f);
                } else {
                    if (h9bVar2.l && !h9bVar2.k) {
                        r8 = 0.5f;
                    }
                    v9bVar.b(z, r8);
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
        n9b n9bVar;
        boolean z2;
        boolean z3;
        float f;
        ArrayList arrayList;
        TLRPC.User X1;
        TLRPC.Chat M0;
        int i;
        ArrayList arrayList2;
        int i2;
        TLRPC.Chat M02;
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
        p55 p55Var = this.E;
        w9b w9bVar = this.a0;
        if (i3 != 0) {
            az7 az7Var = this.F;
            if (i3 == 1) {
                az7Var.e(ob6.M0(2131744227, null));
                az7Var.d(true);
                ((gd0) az7Var.e).c(false, 0.0f);
                arrayList4.add(h9b.d());
                arrayList4.add(h9b.c());
                arrayList4.size();
                arrayList4.add(h9b.e());
                arrayList4.add(h9b.f());
                L2 = hl.L(56.0f) + 0.0f + hl.L(150.0f) + hl.L(32.0f);
                p55Var.setText(ob6.M0(2131744228, null));
                i(z);
                this.G = true;
            } else if (i3 == 2) {
                az7Var.e(ob6.M0(2131744222, null));
                az7Var.d(true);
                ((gd0) az7Var.e).c(false, 0.0f);
                arrayList4.add(h9b.d());
                arrayList4.add(h9b.c());
                arrayList4.size();
                arrayList4.add(h9b.e());
                arrayList4.add(h9b.f());
                L2 = hl.L(56.0f) + 0.0f + hl.L(150.0f) + hl.L(32.0f);
                p55Var.setText(ob6.M0(2131744223, null));
                i(z);
                this.G = true;
            } else if (i3 == 3) {
                az7Var.e(ob6.M0(2131744220, null));
                az7Var.d(true);
                ((gd0) az7Var.e).c(false, 0.0f);
                arrayList4.add(h9b.d());
                arrayList4.add(h9b.c());
                arrayList4.size();
                arrayList4.add(h9b.e());
                arrayList4.add(h9b.f());
                L2 = hl.L(56.0f) + 0.0f + hl.L(150.0f) + hl.L(32.0f);
                p55Var.setText(ob6.M0(2131744221, null));
                i(z);
                this.G = true;
            } else if (i3 == 5) {
                az7Var.e(ob6.M0(2131744231, null));
                az7Var.d(w9bVar.I1);
                ((gd0) az7Var.e).c(false, 0.0f);
                arrayList4.add(h9b.d());
                arrayList4.add(h9b.c());
                arrayList4.size();
                arrayList4.add(h9b.e());
                arrayList4.add(h9b.f());
                L2 = hl.L(56.0f) + 0.0f + hl.L(150.0f) + hl.L(32.0f);
                p55Var.setText(ob6.M0(2131744232, null));
                i(z);
                this.G = true;
            } else if (i3 == 6) {
                az7Var.e(ob6.M0(2131744229, null));
                az7Var.d(true);
                ((gd0) az7Var.e).c(false, 0.0f);
                arrayList4.add(h9b.d());
                arrayList4.add(h9b.c());
                arrayList4.size();
                arrayList4.add(h9b.e());
                arrayList4.add(h9b.f());
                L2 = hl.L(56.0f) + 0.0f + hl.L(150.0f) + hl.L(32.0f);
                p55Var.setText(ob6.M0(2131744230, null));
                i(z);
                this.G = true;
            } else if (i3 == 4) {
                az7Var.e(ob6.M0(2131744224, null));
                az7Var.d(true);
                ((gd0) az7Var.e).c(false, 0.0f);
                arrayList4.add(h9b.d());
                arrayList4.add(h9b.c());
                arrayList4.size();
                arrayList4.add(h9b.e());
                arrayList4.add(h9b.f());
                L = hl.L(56.0f) + 0.0f + hl.L(150.0f) + hl.L(32.0f);
                p55Var.setText(ob6.M0(2131744225, null));
                i(z);
                this.G = true;
                boolean isEmpty = TextUtils.isEmpty(this.J);
                if (this.a != 0) {
                    String lowerCase = hl.I3(this.J).toLowerCase();
                    int i4 = this.a;
                    if (i4 == 5) {
                        int i5 = w9b.X1;
                        arrayList = new ArrayList();
                        uc7 s1 = uc7.s1(w9bVar.a);
                        ArrayList arrayList5 = s1.y;
                        for (int i6 = 0; i6 < arrayList5.size(); i6++) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList5.get(i6);
                            if (s1.x(dialog)) {
                                boolean D = wf3.D(dialog.id);
                                long j = dialog.id;
                                if (D) {
                                    TLRPC.User X12 = s1.X1(Long.valueOf(j));
                                    if (X12 != null && !X12.bot && X12.id != 777000 && !lbc.D(X12)) {
                                        arrayList.add(X12);
                                    }
                                } else if (wf3.y(j) && (M02 = s1.M0(Long.valueOf(-dialog.id))) != null && !xc2.c0(M02)) {
                                    arrayList.add(M02);
                                }
                            }
                        }
                        z2 = isEmpty;
                        f = L;
                    } else {
                        boolean z9 = i4 == 1 || i4 == 2;
                        boolean z10 = w9bVar.S1 && (i4 == 3 || i4 == 6);
                        uc7 s12 = uc7.s1(w9bVar.a);
                        HashMap hashMap = new HashMap();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = s12.y;
                        ConcurrentHashMap concurrentHashMap = lv2.r(w9bVar.a).g0;
                        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                            if (w9bVar.U1) {
                                z2 = isEmpty;
                                z3 = z10;
                                f = L;
                            } else {
                                z3 = z10;
                                f = L;
                                z2 = isEmpty;
                                lv2.r(w9bVar.a).A(0L, false);
                            }
                            w9bVar.U1 = true;
                        } else {
                            z2 = isEmpty;
                            z3 = z10;
                            f = L;
                        }
                        int i7 = 0;
                        while (i7 < arrayList7.size()) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList7.get(i7);
                            boolean z11 = z9;
                            if (wf3.D(dialog2.id)) {
                                TLRPC.User X13 = s12.X1(Long.valueOf(dialog2.id));
                                if (X13 != null && !X13.bot && X13.id != 777000 && !lbc.D(X13) && !X13.deleted && (!z11 || (concurrentHashMap != null && concurrentHashMap.get(Long.valueOf(X13.id)) != null))) {
                                    hashMap.put(Long.valueOf(X13.id), Boolean.TRUE);
                                    arrayList6.add(X13);
                                }
                            } else if (z3 && wf3.y(dialog2.id) && (M0 = s12.M0(Long.valueOf(-dialog2.id))) != null && !xc2.V(M0)) {
                                hashMap.put(Long.valueOf(-M0.id), Boolean.TRUE);
                                arrayList6.add(M0);
                            }
                            i7++;
                            z9 = z11;
                        }
                        if (concurrentHashMap != null) {
                            Iterator it = concurrentHashMap.entrySet().iterator();
                            while (it.hasNext()) {
                                Long l = (Long) ((Map.Entry) it.next()).getKey();
                                l.getClass();
                                if (!hashMap.containsKey(l) && (X1 = s12.X1(l)) != null && !X1.bot && X1.id != 777000 && !lbc.D(X1)) {
                                    arrayList6.add(X1);
                                    hashMap.put(Long.valueOf(X1.id), Boolean.TRUE);
                                }
                            }
                        }
                        arrayList = arrayList6;
                    }
                    ArrayList arrayList8 = this.c;
                    HashMap hashMap2 = this.d;
                    HashSet N0 = w9b.N0(arrayList8, hashMap2);
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
                                h9b i13 = h9b.i(user, contains, !contains && N0.contains(Long.valueOf(user.id)));
                                int i14 = this.a;
                                i13.m = i14 == 2 || i14 == 4;
                                arrayList4.add(i13);
                                f += hl.L(56.0f);
                                i10 = i12 + 1;
                                i2 = i11;
                            } else {
                                int i15 = i9;
                                int i16 = i10;
                                if (tLObject2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                                    boolean containsKey = hashMap2.containsKey(Long.valueOf(chat.id));
                                    i2 = i15;
                                    h9b h9bVar = new h9b(3, true);
                                    h9bVar.h = chat;
                                    h9bVar.k = containsKey;
                                    int i17 = this.a;
                                    h9bVar.m = i17 == 2 || i17 == 4;
                                    arrayList4.add(h9bVar);
                                    f += hl.L(56.0f);
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
                                h9b i19 = h9b.i(user2, contains2, !contains2 && N0.contains(Long.valueOf(user2.id)));
                                int i20 = this.a;
                                i19.m = i20 == 2 || i20 == 4;
                                arrayList4.add(i19);
                                f += hl.L(56.0f);
                                i++;
                            } else if (tLObject3 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject3;
                                boolean containsKey2 = hashMap2.containsKey(Long.valueOf(chat2.id));
                                arrayList2 = arrayList8;
                                h9b h9bVar2 = new h9b(3, true);
                                h9bVar2.h = chat2;
                                h9bVar2.k = containsKey2;
                                int i21 = this.a;
                                h9bVar2.m = i21 == 2 || i21 == 4;
                                arrayList4.add(h9bVar2);
                                f += hl.L(56.0f);
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
                            arrayList4.add(new h9b(5, false));
                            f += hl.L(150.0f);
                        }
                        d79 d79Var = this.f;
                        float measuredHeight = (d79Var != null ? ((d79Var.getMeasuredHeight() - d79Var.getPaddingTop()) - d79Var.getPaddingBottom()) + (w9bVar.d ? this.U : 0) : ((hl.q.y - hl.L(56.0f)) - hl.n) - hl.L(42.0f)) - f;
                        if (measuredHeight > 0.0f) {
                            h9b h9bVar3 = new h9b(-1, false);
                            h9bVar3.p = (int) measuredHeight;
                            arrayList4.add(h9bVar3);
                        }
                    }
                }
                if (this.h.t) {
                    Collections.reverse(arrayList4);
                }
                n9bVar = this.n;
                if (n9bVar != null) {
                    if (!z || w9bVar.H1 == 0) {
                        n9bVar.f();
                    } else {
                        n9bVar.E(arrayList3, arrayList4);
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
            n9bVar = this.n;
            if (n9bVar != null) {
            }
            this.e.invalidate();
        }
        this.G = false;
        p55Var.setVisibility(8);
        int i22 = w9b.X1;
        int i23 = w9bVar.a;
        ArrayList arrayList10 = w9bVar.r1;
        ArrayList arrayList11 = w9bVar.n1;
        HashSet hashSet = w9bVar.u1;
        ArrayList arrayList12 = w9bVar.q1;
        ArrayList arrayList13 = uc7.s1(i23).O1().T;
        h9b h9bVar4 = new h9b(-1, false);
        h9bVar4.o = 24;
        arrayList4.add(h9bVar4);
        if (w9bVar.F1) {
            String M03 = ob6.M0(2131748543, null);
            h9b h9bVar5 = new h9b(11, false);
            h9bVar5.e = M03;
            arrayList4.add(h9bVar5);
            h9bVar4.o = hl.L(72.0f) + h9bVar4.o;
        } else if (w9bVar.z1 && (w9bVar.T1 || arrayList13 == null || arrayList13.size() <= 1)) {
            String M04 = w9bVar.T1 ? ob6.M0(2131744226, null) : ob6.M0(w9bVar.E1 ? 2131744274 : 2131744215, null);
            if (w9bVar.E1) {
                G = ob6.M0(2131744275, null);
            } else {
                int i24 = w9bVar.K1;
                G = i24 != Integer.MAX_VALUE ? ob6.G(i24 / 3600, "StoryPrivacyAlertSubtitle", new Object[0]) : ob6.M0(2131744218, null);
            }
            h9b h9bVar6 = new h9b(4, false);
            h9bVar6.e = M04;
            h9bVar6.f = G;
            arrayList4.add(h9bVar6);
            h9bVar4.o = hl.L(72.0f) + h9bVar4.o;
        } else {
            String M05 = ob6.M0(w9bVar.E1 ? 2131744272 : 2131744172, null);
            h9b h9bVar7 = new h9b(8, false);
            h9bVar7.e = M05;
            arrayList4.add(h9bVar7);
            h9bVar4.o = hl.L(50.0f) + h9bVar4.o;
            TLRPC.InputPeer inputPeer = w9bVar.m1;
            if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                h9b i25 = h9b.i(yac.h(w9bVar.a).f(), false, false);
                i25.n = true;
                arrayList4.add(i25);
                h9bVar4.o = hl.L(62.0f) + h9bVar4.o;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                h9b i26 = h9b.i(uc7.s1(w9bVar.a).X1(Long.valueOf(w9bVar.m1.user_id)), false, false);
                i26.n = true;
                arrayList4.add(i26);
                h9bVar4.o = hl.L(62.0f) + h9bVar4.o;
            } else {
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.Chat M06 = uc7.s1(w9bVar.a).M0(Long.valueOf(w9bVar.m1.channel_id));
                    h9b h9bVar8 = new h9b(3, true);
                    h9bVar8.h = M06;
                    h9bVar8.k = false;
                    h9bVar8.n = true;
                    arrayList4.add(h9bVar8);
                    z5 = xc2.V(M06);
                    h9bVar4.o = hl.L(104.0f) + h9bVar4.o;
                    z4 = false;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.Chat M07 = uc7.s1(w9bVar.a).M0(Long.valueOf(w9bVar.m1.chat_id));
                    h9b h9bVar9 = new h9b(3, true);
                    h9bVar9.h = M07;
                    h9bVar9.k = false;
                    h9bVar9.n = true;
                    arrayList4.add(h9bVar9);
                    h9bVar4.o = hl.L(104.0f) + h9bVar4.o;
                    z5 = false;
                    z4 = false;
                }
                h9b g = h9b.g(null);
                g.c = !z4 ? (byte) 1 : (byte) 2;
                arrayList4.add(g);
                h9bVar4.o = hl.L(12.0f) + h9bVar4.o;
                if (z4) {
                    String M08 = ob6.M0(w9bVar.E1 ? 2131744271 : 2131744167, null);
                    h9b h9bVar10 = new h9b(8, false);
                    h9bVar10.e = M08;
                    arrayList4.add(h9bVar10);
                    h9bVar4.o = hl.L(40.0f) + h9bVar4.o;
                }
                if (z4 || w9bVar.F1) {
                    f2 = 80.0f;
                } else {
                    f2 = 80.0f;
                    h9b h = h9b.h(4, w9bVar.p1, w9bVar.H1 == 4);
                    arrayList4.add(h);
                    h9bVar4.o = hl.L(56.0f) + h9bVar4.o;
                    if (w9bVar.p1 == 1) {
                        if (arrayList11.size() != 1) {
                            Iterator it2 = w9bVar.o1.values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList14 = (ArrayList) it2.next();
                                if (arrayList14.size() >= 1) {
                                    h.g = uc7.s1(w9bVar.a).X1((Long) arrayList14.get(0));
                                    break;
                                }
                            }
                        } else {
                            h.g = uc7.s1(w9bVar.a).X1((Long) arrayList11.get(0));
                        }
                    }
                    h9b h2 = h9b.h(2, arrayList12.size(), w9bVar.H1 == 2);
                    arrayList4.add(h2);
                    h9bVar4.o = hl.L(56.0f) + h9bVar4.o;
                    if (arrayList12.size() == 1) {
                        h2.g = uc7.s1(w9bVar.a).X1((Long) arrayList12.get(0));
                    }
                    ArrayList I0 = w9bVar.I0();
                    h9b h3 = h9b.h(1, I0.size(), w9bVar.H1 == 1);
                    arrayList4.add(h3);
                    h9bVar4.o = hl.L(56.0f) + h9bVar4.o;
                    if (I0.size() == 1 && (I0.get(0) instanceof TLRPC.User)) {
                        h3.g = (TLRPC.User) I0.get(0);
                    }
                    h9b h4 = h9b.h(3, w9bVar.t1, w9bVar.H1 == 3);
                    arrayList4.add(h4);
                    h9bVar4.o = hl.L(56.0f) + h9bVar4.o;
                    if (w9bVar.t1 == 1) {
                        if (arrayList10.size() != 1) {
                            Iterator it3 = w9bVar.s1.values().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList15 = (ArrayList) it3.next();
                                if (arrayList15.size() >= 1) {
                                    h4.g = uc7.s1(w9bVar.a).X1((Long) arrayList15.get(0));
                                    break;
                                }
                            }
                        } else {
                            h4.g = uc7.s1(w9bVar.a).X1((Long) arrayList10.get(0));
                        }
                    }
                    int i27 = uc7.s1(w9bVar.a).O1().N;
                    boolean z12 = w9bVar.E1;
                    arrayList4.add(h9b.g(hl.N2(i27 <= 0 ? ob6.M0(z12 ? 2131744282 : 2131744373, null) : ob6.G(i27, z12 ? "StoryLiveBlockList" : "StoryBlockList", new Object[0]), aob.Xc, 0, new i9b(this, (byte) 3), w9bVar.J0)));
                    h9bVar4.o = hl.L(80.0f) + h9bVar4.o;
                }
                if (!w9bVar.T1) {
                    if (w9bVar.E1 && !w9bVar.F1) {
                        if (w9bVar.A1) {
                            arrayList4.add(h9b.b(ob6.M0(2131748551, null), "", 5));
                            h9bVar4.o = hl.L(50.0f) + h9bVar4.o;
                            arrayList4.add(h9b.b(ob6.M0(2131748557, null), "", 6));
                            h9bVar4.o = hl.L(50.0f) + h9bVar4.o;
                            arrayList4.add(h9b.g(null));
                            h9bVar4.o = hl.L(12.0f) + h9bVar4.o;
                        } else {
                            arrayList4.add(h9b.b(ob6.M0(2131748556, null), "", 5));
                            h9bVar4.o = hl.L(50.0f) + h9bVar4.o;
                            arrayList4.add(h9b.g(ob6.M0(2131748555, null)));
                            h9bVar4.o = hl.L(30.0f) + h9bVar4.o;
                        }
                    }
                    if (w9bVar.E1) {
                        String M09 = ob6.M0(2131744284, null);
                        boolean z13 = w9bVar.v1;
                        h9b h9bVar11 = new h9b(7, false);
                        h9bVar11.c = (byte) 2;
                        h9bVar11.e = M09;
                        h9bVar11.k = z13;
                        arrayList4.add(h9bVar11);
                        h9bVar4.o = hl.L(50.0f) + h9bVar4.o;
                    }
                    if (!w9bVar.F1) {
                        String M010 = ob6.M0(2131744386, null);
                        boolean z14 = w9bVar.w1;
                        h9b h9bVar12 = new h9b(7, false);
                        h9bVar12.c = (byte) 0;
                        h9bVar12.e = M010;
                        h9bVar12.k = z14;
                        arrayList4.add(h9bVar12);
                        h9bVar4.o = hl.L(50.0f) + h9bVar4.o;
                    }
                    if (!w9bVar.E1 && !w9bVar.F1) {
                        String M011 = ob6.M0(z4 ? 2131744312 : z5 ? 2131744311 : 2131744306, null);
                        boolean z15 = w9bVar.x1;
                        h9b h9bVar13 = new h9b(7, false);
                        h9bVar13.c = (byte) 1;
                        h9bVar13.e = M011;
                        h9bVar13.k = z15;
                        arrayList4.add(h9bVar13);
                        h9bVar4.o = hl.L(50.0f) + h9bVar4.o;
                    }
                }
                z6 = w9bVar.E1;
                String str = "StoryKeepGroupInfo";
                if (!z6 || w9bVar.F1) {
                    arrayList4.add(h9b.g(null));
                    h9bVar4.o = hl.L(12.0f) + h9bVar4.o;
                } else if (!w9bVar.T1 && w9bVar.y1 && w9bVar.W1 != null) {
                    if (z6) {
                        G3 = ob6.M0(z4 ? 2131744277 : z5 ? 2131744279 : 2131744278, null);
                    } else {
                        String str2 = z4 ? "StoryKeepInfo" : z5 ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                        int i28 = w9bVar.K1;
                        if (i28 == Integer.MAX_VALUE) {
                            i28 = 86400;
                        }
                        G3 = ob6.G(i28 / 3600, str2, new Object[0]);
                    }
                    arrayList4.add(h9b.g(G3));
                    h9bVar4.o = hl.L(f2) + h9bVar4.o;
                }
                if (w9bVar.x1 || w9bVar.E1 || w9bVar.F1) {
                    z7 = z5;
                } else {
                    TLRPC.InputPeer inputPeer2 = w9bVar.m1;
                    long m = inputPeer2 != null ? wf3.m(inputPeer2) : yac.h(w9bVar.a).e();
                    uc7.s1(w9bVar.a).O1().A(m, true);
                    StringBuilder sb = new StringBuilder();
                    if (hashSet.isEmpty()) {
                        sb.append(ob6.M0(2131744443, null));
                        z7 = z5;
                    } else {
                        z7 = z5;
                        if (hashSet.size() < 3) {
                            Iterator it4 = hashSet.iterator();
                            while (it4.hasNext()) {
                                Iterator it5 = it4;
                                w5b b = uc7.s1(w9bVar.a).O1().A(m, true).b(((Integer) it4.next()).intValue());
                                if (b != null) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(b.b);
                                }
                                it4 = it5;
                            }
                        } else {
                            sb.append(ob6.G(hashSet.size(), "StoriesAlbumCount", new Object[0]));
                        }
                    }
                    arrayList4.add(h9b.b(ob6.M0(2131744465, null), sb, 1));
                    h9bVar4.o = hl.L(50.0f) + h9bVar4.o;
                }
                if (!w9bVar.T1 && ((!w9bVar.y1 || w9bVar.W1 == null) && !(z8 = w9bVar.E1) && !w9bVar.F1)) {
                    if (z8) {
                        if (z4) {
                            str = "StoryKeepInfo";
                        } else if (z7) {
                            str = "StoryKeepChannelInfo";
                        }
                        int i29 = w9bVar.K1;
                        G2 = ob6.G((i29 == Integer.MAX_VALUE ? 86400 : i29) / 3600, str, new Object[0]);
                    } else {
                        G2 = ob6.M0(z4 ? 2131744277 : z7 ? 2131744279 : 2131744278, null);
                    }
                    arrayList4.add(h9b.g(G2));
                    h9bVar4.o = hl.L(f2) + h9bVar4.o;
                }
                if (w9bVar.x1 && w9bVar.y1 && w9bVar.W1 != null) {
                    String M012 = ob6.M0(2131744330, null);
                    BitmapDrawable bitmapDrawable = w9bVar.V1;
                    h9b h9bVar14 = new h9b(9, false);
                    h9bVar14.e = M012;
                    h9bVar14.d = bitmapDrawable;
                    h9bVar14.q = (byte) 0;
                    arrayList4.add(h9bVar14);
                    h9bVar4.o = hl.L(50.0f) + h9bVar4.o;
                    arrayList4.add(h9b.g(ob6.M0(2131744329, null)));
                    h9bVar4.o = hl.L(72.0f) + h9bVar4.o;
                }
                if (w9bVar.F1) {
                    arrayList4.add(h9b.b(ob6.M0(2131748551, null), "", 5));
                    h9bVar4.o = hl.L(50.0f) + h9bVar4.o;
                    arrayList4.add(h9b.g(null));
                    h9bVar4.o = hl.L(52.0f) + h9bVar4.o;
                }
                if (w9bVar.E1 && w9bVar.v1) {
                    String M013 = ob6.M0(2131748560, null);
                    h9b h9bVar15 = new h9b(8, false);
                    h9bVar15.e = M013;
                    arrayList4.add(h9bVar15);
                    h9bVar4.o = hl.L(40.0f) + h9bVar4.o;
                    h9b h9bVar16 = new h9b(10, false);
                    h9bVar16.q = (byte) 8;
                    arrayList4.add(h9bVar16);
                    h9bVar4.o = hl.L(75.0f) + h9bVar4.o;
                    arrayList4.add(h9b.g(ob6.M0(2131748558, null)));
                    h9bVar4.o = hl.L(50.0f) + h9bVar4.o;
                }
            }
            z4 = true;
            z5 = false;
            h9b g2 = h9b.g(null);
            g2.c = !z4 ? (byte) 1 : (byte) 2;
            arrayList4.add(g2);
            h9bVar4.o = hl.L(12.0f) + h9bVar4.o;
            if (z4) {
            }
            if (z4) {
            }
            f2 = 80.0f;
            if (!w9bVar.T1) {
            }
            z6 = w9bVar.E1;
            String str3 = "StoryKeepGroupInfo";
            if (z6) {
            }
            arrayList4.add(h9b.g(null));
            h9bVar4.o = hl.L(12.0f) + h9bVar4.o;
            if (w9bVar.x1) {
            }
            z7 = z5;
            if (!w9bVar.T1) {
                if (z8) {
                }
                arrayList4.add(h9b.g(G2));
                h9bVar4.o = hl.L(f2) + h9bVar4.o;
            }
            if (w9bVar.x1) {
                String M0122 = ob6.M0(2131744330, null);
                BitmapDrawable bitmapDrawable2 = w9bVar.V1;
                h9b h9bVar142 = new h9b(9, false);
                h9bVar142.e = M0122;
                h9bVar142.d = bitmapDrawable2;
                h9bVar142.q = (byte) 0;
                arrayList4.add(h9bVar142);
                h9bVar4.o = hl.L(50.0f) + h9bVar4.o;
                arrayList4.add(h9b.g(ob6.M0(2131744329, null)));
                h9bVar4.o = hl.L(72.0f) + h9bVar4.o;
            }
            if (w9bVar.F1) {
            }
            if (w9bVar.E1) {
                String M0132 = ob6.M0(2131748560, null);
                h9b h9bVar152 = new h9b(8, false);
                h9bVar152.e = M0132;
                arrayList4.add(h9bVar152);
                h9bVar4.o = hl.L(40.0f) + h9bVar4.o;
                h9b h9bVar162 = new h9b(10, false);
                h9bVar162.q = (byte) 8;
                arrayList4.add(h9bVar162);
                h9bVar4.o = hl.L(75.0f) + h9bVar4.o;
                arrayList4.add(h9b.g(ob6.M0(2131748558, null)));
                h9bVar4.o = hl.L(50.0f) + h9bVar4.o;
            }
        }
        z4 = true;
        z5 = false;
        if (z4) {
        }
        f2 = 80.0f;
        if (!w9bVar.T1) {
        }
        z6 = w9bVar.E1;
        String str32 = "StoryKeepGroupInfo";
        if (z6) {
        }
        arrayList4.add(h9b.g(null));
        h9bVar4.o = hl.L(12.0f) + h9bVar4.o;
        if (w9bVar.x1) {
        }
        z7 = z5;
        if (!w9bVar.T1) {
        }
        if (w9bVar.x1) {
        }
        if (w9bVar.F1) {
        }
        if (w9bVar.E1) {
        }
        L = 0.0f;
        boolean isEmpty22 = TextUtils.isEmpty(this.J);
        if (this.a != 0) {
        }
        if (this.h.t) {
        }
        n9bVar = this.n;
        if (n9bVar != null) {
        }
        this.e.invalidate();
    }

    public final void i(boolean z) {
        p55 p55Var = this.E;
        if (p55Var == null) {
            return;
        }
        byte b = 0;
        if (w9b.N0(this.c, this.d).size() > 0) {
            p55Var.a(ob6.M0(2131743285, null), new k9b(this, b));
            return;
        }
        if (z) {
            p55Var.setRightText(null);
            return;
        }
        si siVar = p55Var.b;
        siVar.c(null, false, true);
        siVar.setOnClickListener(null);
        siVar.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(boolean z) {
        l9b l9bVar;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        HashSet N0 = w9b.N0(this.c, this.d);
        int i = this.a;
        w9b w9bVar = this.a0;
        if (i == 3) {
            w9bVar.t1 = N0.size();
        } else if (i == 4) {
            w9bVar.p1 = N0.size();
        }
        uc7 s1 = uc7.s1(w9bVar.a);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Object[] objArr = 0;
        int i2 = 0;
        while (true) {
            l9bVar = this.y;
            ArrayList arrayList4 = l9bVar.e;
            arrayList = l9bVar.e;
            if (i2 >= arrayList4.size()) {
                break;
            }
            zc5 zc5Var = (zc5) arrayList.get(i2);
            if (!N0.contains(Long.valueOf(zc5Var.getUid()))) {
                arrayList2.add(zc5Var);
            }
            i2++;
        }
        Iterator it = N0.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long longValue = l.longValue();
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    Object X1 = longValue >= 0 ? s1.X1(l) : s1.M0(l);
                    if (X1 != null) {
                        zc5 zc5Var2 = new zc5(getContext(), X1, null, true, w9bVar.J0);
                        zc5Var2.setOnClickListener(this);
                        arrayList3.add(zc5Var2);
                    }
                } else if (((zc5) arrayList.get(i3)).getUid() != longValue) {
                    i3++;
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        a3a a3aVar = l9bVar.d;
        ArrayList arrayList5 = a3aVar.e;
        ArrayList arrayList6 = a3aVar.d;
        ArrayList arrayList7 = a3aVar.f;
        t9b t9bVar = (t9b) a3aVar.n;
        t9bVar.I = true;
        ArrayList arrayList8 = t9bVar.e;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = a3aVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            ((zc5) arrayList2.get(i4)).setOnClickListener(null);
        }
        a3aVar.c();
        if (z) {
            a3aVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            a3aVar.b = animatorSet;
            animatorSet.addListener(new s9b(a3aVar, arrayList2, objArr == true ? 1 : 0));
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
                zc5 zc5Var3 = (zc5) arrayList2.get(i5);
                arrayList5.add(zc5Var3);
                arrayList7.add(ObjectAnimator.ofFloat(zc5Var3, (Property<zc5, Float>) property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(zc5Var3, (Property<zc5, Float>) property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(zc5Var3, (Property<zc5, Float>) property, 1.0f, 0.0f));
                i5++;
            }
            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                zc5 zc5Var4 = (zc5) arrayList3.get(i6);
                arrayList6.add(zc5Var4);
                arrayList7.add(ObjectAnimator.ofFloat(zc5Var4, (Property<zc5, Float>) property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(zc5Var4, (Property<zc5, Float>) property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(zc5Var4, (Property<zc5, Float>) property, 0.0f, 1.0f));
            }
        } else {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                a3aVar.removeView((View) arrayList2.get(i7));
            }
            arrayList9.clear();
            a3aVar.b = null;
            a3aVar.c = false;
            t9bVar.b.setAllowDrawCursor(true);
        }
        for (int i8 = 0; i8 < arrayList3.size(); i8++) {
            a3aVar.addView((View) arrayList3.get(i8));
        }
        a3aVar.requestLayout();
    }

    public final void k() {
        float c = c();
        boolean z = this.N;
        boolean z2 = false;
        l9b l9bVar = this.y;
        if (z || this.V || getTranslationX() != 0.0f) {
            this.O = false;
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.Q = null;
            }
            l9bVar.setTranslationY(c);
        } else if (!this.O || Math.abs(this.P - c) > 1.0f) {
            this.O = true;
            ValueAnimator valueAnimator2 = this.Q;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.Q = null;
            }
            float translationY = l9bVar.getTranslationY();
            this.P = c;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c);
            this.Q = ofFloat;
            ofFloat.addUpdateListener(new ija(this, (byte) 19));
            this.Q.addListener(new po9((Object) this, (byte) 27));
            this.Q.setInterpolator(new LinearInterpolator());
            this.Q.setDuration(180L);
            this.Q.start();
        }
        boolean z3 = this.G;
        az7 az7Var = this.F;
        if (!z3) {
            az7Var.setVisibility(8);
            return;
        }
        az7Var.setVisibility(0);
        float f = -az7Var.getHeight();
        int i = 0;
        while (true) {
            d79 d79Var = this.f;
            if (i >= d79Var.getChildCount()) {
                z2 = true;
                break;
            }
            View childAt = d79Var.getChildAt(i);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                f = this.e.getPaddingTop() + childAt.getY();
                break;
            }
            i++;
        }
        if (this.R != z2) {
            this.R = z2;
            ((gd0) az7Var.e).c(true, (z2 || this.a != 0) ? 0.0f : 1.0f);
        }
        az7Var.setTranslationY(Math.max(hl.m, f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = w9b.X1;
        jn7.f(this.a0.a).b(this, jn7.T);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l9b l9bVar = this.y;
        if (!l9bVar.e.contains(view)) {
            return;
        }
        zc5 zc5Var = (zc5) view;
        if (!zc5Var.E) {
            zc5 zc5Var2 = l9bVar.f;
            if (zc5Var2 != null) {
                zc5Var2.a();
                l9bVar.f = null;
            }
            l9bVar.f = zc5Var;
            zc5Var.b();
            return;
        }
        l9bVar.f = null;
        a3a a3aVar = l9bVar.d;
        t9b t9bVar = (t9b) a3aVar.n;
        t9bVar.I = true;
        t9bVar.e.remove(zc5Var);
        zc5Var.setOnClickListener(null);
        a3aVar.c();
        a3aVar.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        a3aVar.b = animatorSet;
        animatorSet.addListener(new wd8((Object) a3aVar, (Object) zc5Var, (byte) 18));
        ArrayList arrayList = a3aVar.h;
        arrayList.clear();
        arrayList.add(zc5Var);
        ArrayList arrayList2 = a3aVar.d;
        arrayList2.clear();
        a3aVar.e.clear();
        arrayList2.add(zc5Var);
        ArrayList arrayList3 = a3aVar.f;
        arrayList3.clear();
        arrayList3.add(ObjectAnimator.ofFloat(zc5Var, (Property<zc5, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(zc5Var, (Property<zc5, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(zc5Var, (Property<zc5, Float>) View.ALPHA, 1.0f, 0.0f));
        a3aVar.requestLayout();
        long uid = zc5Var.getUid();
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
        int i = w9b.X1;
        jn7.f(this.a0.a).n(this, jn7.T);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = w9b.X1;
        w9b w9bVar = this.a0;
        int i4 = w9bVar.f;
        if (i4 > 0) {
            this.U = i4;
        }
        super.onMeasure(i, i2);
        byte b = 0;
        this.e.setPadding(0, hl.m + (this.a == 0 ? 0 : hl.L(56.0f)), 0, 0);
        boolean z = this.W;
        boolean z2 = w9bVar.d;
        p9b p9bVar = this.r;
        d79 d79Var = this.f;
        if (z != z2) {
            float c = c();
            if (w9bVar.d && c + Math.min(hl.L(150.0f), this.y.L) > d79Var.getPaddingTop()) {
                z46 z46Var = new z46(getContext(), 2, 0.7f);
                z46Var.a = 1;
                z46Var.p = -hl.L(56.0f);
                this.h.v0(z46Var);
            }
            int i5 = this.a;
            boolean z3 = w9bVar.d;
            View view = this.s;
            if (i5 == 0) {
                p9bVar.setTranslationY(z3 ? this.U : 0.0f);
                view.setTranslationY(w9bVar.d ? this.U : 0.0f);
            } else {
                int i6 = this.U;
                if (!z3) {
                    i6 = -i6;
                }
                float f = i6;
                ValueAnimator valueAnimator = p9bVar.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    p9bVar.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                p9bVar.d = ofFloat;
                ofFloat.addUpdateListener(new o9b(p9bVar, (byte) 1));
                p9bVar.d.addListener(new po9((Object) p9bVar, (byte) 28));
                p9bVar.d.setDuration(250L);
                ValueAnimator valueAnimator2 = p9bVar.d;
                k43 k43Var = hb.w;
                valueAnimator2.setInterpolator(k43Var);
                p9bVar.d.start();
                view.setTranslationY(w9bVar.d ? this.U : -r5);
                this.V = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(k43Var).withEndAction(new i9b(this, b)).start();
            }
            this.W = w9bVar.d;
        }
        d79Var.setPadding(0, 0, 0, p9bVar.getMeasuredHeight());
    }
}
