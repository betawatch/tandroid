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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class v7b extends FrameLayout implements View.OnClickListener, jm7 {
    public final l55 E;
    public final wx7 F;
    public boolean G;
    public he H;
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
    public final /* synthetic */ a8b a0;
    public final vh6 b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final r59 f;
    public final u46 h;
    public final r7b n;
    public final t7b r;
    public final View s;
    public final b61 w;
    public final b61 x;
    public final o7b y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7b(a8b a8bVar, Context context) {
        super(context);
        this.a0 = a8bVar;
        this.b = new vh6();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.S = -1;
        int i = a8b.X1;
        l55 l55Var = new l55(context, a8bVar.J0);
        this.E = l55Var;
        o7b o7bVar = new o7b(this, context, a8bVar.J0, new m7b(this, (byte) 4));
        this.y = o7bVar;
        int i2 = cmb.g5;
        anb.h(i2, a8bVar.J0, o7bVar);
        o7bVar.setOnSearchTextChange(new n7b(this, (byte) 3));
        wx7 wx7Var = new wx7(context, a8bVar.J0);
        this.F = wx7Var;
        wx7Var.h = new m7b(this, (byte) 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, gm.L(56.0f) + gm.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, qoe.e(-1, -1, nm7.D1));
        r59 r59Var = new r59(context, a8bVar.J0);
        this.f = r59Var;
        r59Var.setClipToPadding(false);
        r59Var.setTranslateSelector(true);
        byte b = 2;
        r7b r7bVar = new r7b(this, context, a8bVar.J0, o7bVar, new s48(a8bVar, b));
        this.n = r7bVar;
        r59Var.setAdapter(r7bVar);
        r7bVar.h = r59Var;
        u46 u46Var = new u46();
        this.h = u46Var;
        r59Var.setLayoutManager(u46Var);
        r59Var.setOnScrollListener(new i62(this, b));
        r59Var.setOnItemClickListener(new xr8(this, context, (byte) 22));
        frameLayout.addView(r59Var, qoe.c(-1.0f, -1));
        p7b p7bVar = new p7b(this);
        p7bVar.n(350L);
        p7bVar.o(d53.h);
        p7bVar.C = false;
        p7bVar.m = false;
        r59Var.setItemAnimator(p7bVar);
        frameLayout.addView(o7bVar, qoe.e(-1, -2, 55));
        frameLayout.addView(l55Var, qoe.e(-1, 32, 55));
        addView(wx7Var, qoe.e(-1, -2, 55));
        t7b t7bVar = new t7b(this, context);
        this.r = t7bVar;
        t7bVar.setClickable(true);
        t7bVar.setOrientation(1);
        t7bVar.setPadding(gm.L(10.0f) + a8bVar.u0, gm.L(10.0f), gm.L(10.0f) + a8bVar.u0, gm.L(10.0f));
        anb.h(i2, a8bVar.J0, t7bVar);
        b61 b61Var = new b61(a8bVar.J0, context, true);
        this.w = b61Var;
        b61Var.setOnClickListener(new l7b(this, (byte) 0));
        b61Var.f();
        t7bVar.addView(b61Var, qoe.r(-1, 48, 87));
        b61 b61Var2 = new b61(a8bVar.J0, context, false);
        this.x = b61Var2;
        b61Var2.setOnClickListener(new l7b(this, (byte) 1));
        b61Var2.f();
        t7bVar.addView(b61Var2, qoe.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        anb.h(i2, a8bVar.J0, view);
        addView(view, qoe.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(t7bVar, qoe.e(-1, -2, 87));
    }

    public static boolean d(String str, TLObject tLObject) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            String lowerCase = gm.I3(m9c.r(user)).toLowerCase();
            if (lowerCase.startsWith(str) || hg9.s(" ", str, lowerCase)) {
                return true;
            }
            String lowerCase2 = gm.I3(m9c.p(user)).toLowerCase();
            if (lowerCase2.startsWith(str) || hg9.s(" ", str, lowerCase2)) {
                return true;
            }
            ArrayList<TLRPC.TL_username> arrayList = user.usernames;
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC.TL_username tL_username = arrayList.get(i);
                    if (tL_username.active && gm.I3(tL_username.username).toLowerCase().startsWith(str)) {
                        return true;
                    }
                }
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String lowerCase3 = gm.I3(chat.title).toLowerCase();
            if (lowerCase3.startsWith(str) || hg9.s(" ", str, lowerCase3)) {
                return true;
            }
            String lowerCase4 = gm.I3(sd2.K(chat, false)).toLowerCase();
            if (lowerCase4.startsWith(str) || hg9.s(" ", str, lowerCase4)) {
                return true;
            }
            ArrayList<TLRPC.TL_username> arrayList2 = chat.usernames;
            if (arrayList2 != null) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    TLRPC.TL_username tL_username2 = arrayList2.get(i2);
                    if (tL_username2.active && gm.I3(tL_username2.username).toLowerCase().startsWith(str)) {
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
            int i = a8b.X1;
            arrayList.addAll(oc7.r1(this.a0.a).N1().L);
            int i2 = 0;
            while (true) {
                vh6 vh6Var = this.b;
                if (i2 >= vh6Var.m()) {
                    break;
                }
                long j = vh6Var.j(i2);
                if (!((Boolean) vh6Var.n(i2)).booleanValue()) {
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
        a8b a8bVar = this.a0;
        if (i == 4) {
            arrayList.addAll(a8bVar.n1);
            hashMap.putAll(a8bVar.o1);
        } else if (i == 5) {
            arrayList.addAll(a8bVar.D1);
        } else if (i == 1) {
            int i2 = a8b.X1;
            ArrayList H0 = a8bVar.H0();
            for (int i3 = 0; i3 < H0.size(); i3 = mle.c(i3, 1, ((TLRPC.User) H0.get(i3)).id, arrayList)) {
            }
        } else if (i == 2) {
            arrayList.addAll(a8bVar.q1);
        } else if (i == 3) {
            arrayList.addAll(a8bVar.r1);
            hashMap.putAll(a8bVar.s1);
        } else if (i == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.j1(false);
        j(false);
        o7b o7bVar = this.y;
        o7bVar.setText("");
        o7bVar.setVisibility(i == 0 ? 8 : 0);
        o7bVar.M = true;
        this.J = null;
        h(false);
        f(false);
        g(false);
        int i4 = this.a;
        r59 r59Var = this.f;
        if (i4 != 0) {
            r59Var.w0(0);
        }
        r59Var.requestLayout();
        this.S = -1;
    }

    public final float c() {
        int i = 0;
        float f = -b10.c(150.0f, Math.min(gm.L(150.0f), this.y.L), 0);
        while (true) {
            r59 r59Var = this.f;
            if (i >= r59Var.getChildCount()) {
                return f;
            }
            View childAt = r59Var.getChildAt(i);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                return Math.max(f, childAt.getY());
            }
            i++;
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatFull chatFull;
        he heVar;
        if (i != nm7.T || (chatFull = (TLRPC.ChatFull) objArr[0]) == null || (heVar = this.H) == null || this.I != chatFull.id) {
            return;
        }
        heVar.b(350L);
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
        a8b a8bVar = this.a0;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i3 = 0; i3 < chatParticipants.participants.size(); i3++) {
                long j2 = chatParticipants.participants.get(i3).user_id;
                int i4 = a8b.X1;
                TLRPC.User W1 = oc7.r1(a8bVar.a).W1(Long.valueOf(j2));
                if (W1 != null && !m9c.D(W1) && !W1.bot && W1.id != 777000 && j2 != 0) {
                    if (!z || W1.contact) {
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
            int i5 = a8b.X1;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, a8bVar.J0, context);
            alertDialog$Builder.a.U = jb6.M0(2131744224, null);
            wi8.y(null, 2131752542, alertDialog$Builder, null);
            return;
        }
        Context context2 = getContext();
        int i6 = a8b.X1;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, a8bVar.J0, context2);
        alertDialog$Builder2.a.U = jb6.G(arrayList2.size(), "StoryPrivacyGroupNonContacts", new Object[0]);
        alertDialog$Builder2.j(jb6.G(arrayList.size(), "StoryPrivacyGroupAddContacts", new Object[0]), new pt0((Object) this, j, (Object) arrayList, (byte) 9));
        wi8.y(null, 2131752542, alertDialog$Builder2, null);
    }

    public final void f(boolean z) {
        int i = this.a;
        a8b a8bVar = this.a0;
        b61 b61Var = this.x;
        int i2 = 0;
        b61 b61Var2 = this.w;
        if (i == 0) {
            b61Var2.setShowZero(false);
            b61Var2.setEnabled(true);
            b61Var2.c(0, z);
            if (a8bVar.F1) {
                b61Var2.i(jb6.M0(2131744240, null), z, true);
            } else if (a8bVar.T1) {
                b61Var2.i(jb6.M0(2131744240, null), z, true);
            } else {
                int i3 = a8bVar.C1;
                if (i3 == 1) {
                    b61Var2.i(jb6.M0(a8bVar.E1 ? 2131744305 : 2131744244, null), z, true);
                } else {
                    b61Var2.i(jb6.H(',', "StoryPrivacyButtonPostMultiple", i3), z, true);
                }
            }
            b61Var.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.c;
        if (i == 1) {
            b61Var2.setShowZero(false);
            b61Var2.setEnabled(true);
            b61Var2.i(jb6.M0(2131744239, null), z, true);
            b61Var2.c(arrayList.size(), z);
            b61Var.setVisibility(8);
            return;
        }
        t7b t7bVar = this.r;
        if (i == 3) {
            int size = a8b.M0(arrayList, this.d).size();
            a8bVar.t1 = size;
            b61Var2.i(jb6.M0(2131744240, null), z, true);
            b61Var2.setShowZero(false);
            t7bVar.a(size <= 0, z);
            b61Var2.c(size, z);
            b61Var2.setEnabled(size > 0);
            b61Var.setVisibility(8);
            return;
        }
        if (i == 2) {
            b61Var2.setShowZero(false);
            b61Var2.setEnabled(true);
            if (arrayList.isEmpty()) {
                b61Var2.i(jb6.M0(2131744240, null), z, true);
                b61Var2.c(0, z);
            } else {
                b61Var2.i(jb6.M0(2131744245, null), z, true);
                b61Var2.c(arrayList.size(), z);
            }
            b61Var.setVisibility(8);
            return;
        }
        if (i == 5) {
            b61Var2.setShowZero(true);
            b61Var2.setEnabled(!arrayList.isEmpty());
            b61Var2.c(arrayList.size(), z);
            b61Var.setVisibility(8);
            return;
        }
        if (i != 6) {
            if (i == 4) {
                int size2 = a8b.M0(a8bVar.n1, a8bVar.o1).size();
                a8bVar.p1 = size2;
                b61Var2.i(jb6.M0(2131744240, null), z, true);
                b61Var2.setShowZero(false);
                t7bVar.a(false, z);
                b61Var2.c(size2, z);
                b61Var2.setEnabled(true);
                b61Var.setVisibility(8);
                return;
            }
            return;
        }
        b61Var2.setShowZero(false);
        b61Var2.setEnabled(true);
        b61Var2.i(jb6.M0(2131744239, null), z, true);
        int i4 = a8b.X1;
        h4b N1 = oc7.r1(a8bVar.a).N1();
        if (!N1.O) {
            while (true) {
                vh6 vh6Var = this.b;
                if (i2 >= vh6Var.m()) {
                    break;
                }
                long j = vh6Var.j(i2);
                ((Boolean) vh6Var.n(i2)).getClass();
                N1.L.contains(Long.valueOf(j));
                i2++;
            }
        } else {
            b61Var2.c(arrayList.size(), z);
        }
        b61Var.setVisibility(8);
    }

    public final void g(boolean z) {
        ArrayList arrayList;
        int R;
        a8b a8bVar = this.a0;
        ArrayList arrayList2 = a8bVar.D1;
        HashMap hashMap = a8bVar.s1;
        ArrayList arrayList3 = a8bVar.r1;
        ArrayList arrayList4 = a8bVar.q1;
        HashMap hashMap2 = a8bVar.o1;
        ArrayList arrayList5 = a8bVar.n1;
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
        if (this.a == 3 && (a8bVar.H1 != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i2 = this.S;
                if (i2 != -1) {
                    a8bVar.H1 = i2;
                }
            } else {
                this.S = a8bVar.H1;
                a8bVar.H1 = 3;
            }
        }
        HashSet M0 = a8b.M0(arrayList6, hashMap3);
        int i3 = 0;
        while (true) {
            arrayList = this.M;
            if (i3 >= arrayList.size()) {
                break;
            }
            k7b k7bVar = (k7b) arrayList.get(i3);
            if (k7bVar != null) {
                byte b = k7bVar.i;
                if (b > 0) {
                    k7bVar.k = a8bVar.H1 == b;
                    k7bVar.l = false;
                } else {
                    TLRPC.User user = k7bVar.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        k7bVar.k = contains;
                        k7bVar.l = !contains && M0.contains(Long.valueOf(k7bVar.g.id));
                    } else {
                        TLRPC.Chat chat = k7bVar.h;
                        if (chat != null) {
                            k7bVar.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            k7bVar.l = false;
                        }
                    }
                }
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            r59 r59Var = this.f;
            if (i4 >= r59Var.getChildCount()) {
                i(z);
                return;
            }
            View childAt = r59Var.getChildAt(i4);
            if ((childAt instanceof z7b) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                k7b k7bVar2 = (k7b) arrayList.get(R);
                z7b z7bVar = (z7b) childAt;
                z7bVar.c(k7bVar2.k || k7bVar2.l, z);
                TLRPC.Chat chat2 = k7bVar2.h;
                if (chat2 != null) {
                    z7bVar.b(z, a8bVar.J0(chat2) > 200 ? 0.3f : 1.0f);
                } else {
                    if (k7bVar2.l && !k7bVar2.k) {
                        r8 = 0.5f;
                    }
                    z7bVar.b(z, r8);
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
        r7b r7bVar;
        boolean z2;
        boolean z3;
        float f;
        ArrayList arrayList;
        TLRPC.User W1;
        TLRPC.Chat L0;
        int i;
        ArrayList arrayList2;
        int i2;
        TLRPC.Chat L02;
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
        l55 l55Var = this.E;
        a8b a8bVar = this.a0;
        if (i3 != 0) {
            wx7 wx7Var = this.F;
            if (i3 == 1) {
                wx7Var.e(jb6.M0(2131744259, null));
                wx7Var.d(true);
                ((ee0) wx7Var.e).c(false, 0.0f);
                arrayList4.add(k7b.d());
                arrayList4.add(k7b.c());
                arrayList4.size();
                arrayList4.add(k7b.e());
                arrayList4.add(k7b.f());
                L2 = gm.L(56.0f) + 0.0f + gm.L(150.0f) + gm.L(32.0f);
                l55Var.setText(jb6.M0(2131744260, null));
                i(z);
                this.G = true;
            } else if (i3 == 2) {
                wx7Var.e(jb6.M0(2131744254, null));
                wx7Var.d(true);
                ((ee0) wx7Var.e).c(false, 0.0f);
                arrayList4.add(k7b.d());
                arrayList4.add(k7b.c());
                arrayList4.size();
                arrayList4.add(k7b.e());
                arrayList4.add(k7b.f());
                L2 = gm.L(56.0f) + 0.0f + gm.L(150.0f) + gm.L(32.0f);
                l55Var.setText(jb6.M0(2131744255, null));
                i(z);
                this.G = true;
            } else if (i3 == 3) {
                wx7Var.e(jb6.M0(2131744252, null));
                wx7Var.d(true);
                ((ee0) wx7Var.e).c(false, 0.0f);
                arrayList4.add(k7b.d());
                arrayList4.add(k7b.c());
                arrayList4.size();
                arrayList4.add(k7b.e());
                arrayList4.add(k7b.f());
                L2 = gm.L(56.0f) + 0.0f + gm.L(150.0f) + gm.L(32.0f);
                l55Var.setText(jb6.M0(2131744253, null));
                i(z);
                this.G = true;
            } else if (i3 == 5) {
                wx7Var.e(jb6.M0(2131744263, null));
                wx7Var.d(a8bVar.I1);
                ((ee0) wx7Var.e).c(false, 0.0f);
                arrayList4.add(k7b.d());
                arrayList4.add(k7b.c());
                arrayList4.size();
                arrayList4.add(k7b.e());
                arrayList4.add(k7b.f());
                L2 = gm.L(56.0f) + 0.0f + gm.L(150.0f) + gm.L(32.0f);
                l55Var.setText(jb6.M0(2131744264, null));
                i(z);
                this.G = true;
            } else if (i3 == 6) {
                wx7Var.e(jb6.M0(2131744261, null));
                wx7Var.d(true);
                ((ee0) wx7Var.e).c(false, 0.0f);
                arrayList4.add(k7b.d());
                arrayList4.add(k7b.c());
                arrayList4.size();
                arrayList4.add(k7b.e());
                arrayList4.add(k7b.f());
                L2 = gm.L(56.0f) + 0.0f + gm.L(150.0f) + gm.L(32.0f);
                l55Var.setText(jb6.M0(2131744262, null));
                i(z);
                this.G = true;
            } else if (i3 == 4) {
                wx7Var.e(jb6.M0(2131744256, null));
                wx7Var.d(true);
                ((ee0) wx7Var.e).c(false, 0.0f);
                arrayList4.add(k7b.d());
                arrayList4.add(k7b.c());
                arrayList4.size();
                arrayList4.add(k7b.e());
                arrayList4.add(k7b.f());
                L = gm.L(56.0f) + 0.0f + gm.L(150.0f) + gm.L(32.0f);
                l55Var.setText(jb6.M0(2131744257, null));
                i(z);
                this.G = true;
                boolean isEmpty = TextUtils.isEmpty(this.J);
                if (this.a != 0) {
                    String lowerCase = gm.I3(this.J).toLowerCase();
                    int i4 = this.a;
                    if (i4 == 5) {
                        int i5 = a8b.X1;
                        arrayList = new ArrayList();
                        oc7 r1 = oc7.r1(a8bVar.a);
                        ArrayList arrayList5 = r1.y;
                        for (int i6 = 0; i6 < arrayList5.size(); i6++) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList5.get(i6);
                            if (r1.v(dialog)) {
                                boolean D = pg3.D(dialog.id);
                                long j = dialog.id;
                                if (D) {
                                    TLRPC.User W12 = r1.W1(Long.valueOf(j));
                                    if (W12 != null && !W12.bot && W12.id != 777000 && !m9c.D(W12)) {
                                        arrayList.add(W12);
                                    }
                                } else if (pg3.y(j) && (L02 = r1.L0(Long.valueOf(-dialog.id))) != null && !sd2.c0(L02)) {
                                    arrayList.add(L02);
                                }
                            }
                        }
                        z2 = isEmpty;
                        f = L;
                    } else {
                        boolean z9 = i4 == 1 || i4 == 2;
                        boolean z10 = a8bVar.S1 && (i4 == 3 || i4 == 6);
                        oc7 r12 = oc7.r1(a8bVar.a);
                        HashMap hashMap = new HashMap();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = r12.y;
                        ConcurrentHashMap concurrentHashMap = bw2.r(a8bVar.a).g0;
                        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                            if (a8bVar.U1) {
                                z2 = isEmpty;
                                z3 = z10;
                                f = L;
                            } else {
                                z3 = z10;
                                f = L;
                                z2 = isEmpty;
                                bw2.r(a8bVar.a).A(0L, false);
                            }
                            a8bVar.U1 = true;
                        } else {
                            z2 = isEmpty;
                            z3 = z10;
                            f = L;
                        }
                        int i7 = 0;
                        while (i7 < arrayList7.size()) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList7.get(i7);
                            boolean z11 = z9;
                            if (pg3.D(dialog2.id)) {
                                TLRPC.User W13 = r12.W1(Long.valueOf(dialog2.id));
                                if (W13 != null && !W13.bot && W13.id != 777000 && !m9c.D(W13) && !W13.deleted && (!z11 || (concurrentHashMap != null && concurrentHashMap.get(Long.valueOf(W13.id)) != null))) {
                                    hashMap.put(Long.valueOf(W13.id), Boolean.TRUE);
                                    arrayList6.add(W13);
                                }
                            } else if (z3 && pg3.y(dialog2.id) && (L0 = r12.L0(Long.valueOf(-dialog2.id))) != null && !sd2.V(L0)) {
                                hashMap.put(Long.valueOf(-L0.id), Boolean.TRUE);
                                arrayList6.add(L0);
                            }
                            i7++;
                            z9 = z11;
                        }
                        if (concurrentHashMap != null) {
                            Iterator it = concurrentHashMap.entrySet().iterator();
                            while (it.hasNext()) {
                                Long l = (Long) ((Map.Entry) it.next()).getKey();
                                l.getClass();
                                if (!hashMap.containsKey(l) && (W1 = r12.W1(l)) != null && !W1.bot && W1.id != 777000 && !m9c.D(W1)) {
                                    arrayList6.add(W1);
                                    hashMap.put(Long.valueOf(W1.id), Boolean.TRUE);
                                }
                            }
                        }
                        arrayList = arrayList6;
                    }
                    ArrayList arrayList8 = this.c;
                    HashMap hashMap2 = this.d;
                    HashSet M0 = a8b.M0(arrayList8, hashMap2);
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
                                k7b i13 = k7b.i(user, contains, !contains && M0.contains(Long.valueOf(user.id)));
                                int i14 = this.a;
                                i13.m = i14 == 2 || i14 == 4;
                                arrayList4.add(i13);
                                f += gm.L(56.0f);
                                i10 = i12 + 1;
                                i2 = i11;
                            } else {
                                int i15 = i9;
                                int i16 = i10;
                                if (tLObject2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                                    boolean containsKey = hashMap2.containsKey(Long.valueOf(chat.id));
                                    i2 = i15;
                                    k7b k7bVar = new k7b(3, true);
                                    k7bVar.h = chat;
                                    k7bVar.k = containsKey;
                                    int i17 = this.a;
                                    k7bVar.m = i17 == 2 || i17 == 4;
                                    arrayList4.add(k7bVar);
                                    f += gm.L(56.0f);
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
                                k7b i19 = k7b.i(user2, contains2, !contains2 && M0.contains(Long.valueOf(user2.id)));
                                int i20 = this.a;
                                i19.m = i20 == 2 || i20 == 4;
                                arrayList4.add(i19);
                                f += gm.L(56.0f);
                                i++;
                            } else if (tLObject3 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject3;
                                boolean containsKey2 = hashMap2.containsKey(Long.valueOf(chat2.id));
                                arrayList2 = arrayList8;
                                k7b k7bVar2 = new k7b(3, true);
                                k7bVar2.h = chat2;
                                k7bVar2.k = containsKey2;
                                int i21 = this.a;
                                k7bVar2.m = i21 == 2 || i21 == 4;
                                arrayList4.add(k7bVar2);
                                f += gm.L(56.0f);
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
                            arrayList4.add(new k7b(5, false));
                            f += gm.L(150.0f);
                        }
                        r59 r59Var = this.f;
                        float measuredHeight = (r59Var != null ? ((r59Var.getMeasuredHeight() - r59Var.getPaddingTop()) - r59Var.getPaddingBottom()) + (a8bVar.d ? this.U : 0) : ((gm.q.y - gm.L(56.0f)) - gm.n) - gm.L(42.0f)) - f;
                        if (measuredHeight > 0.0f) {
                            k7b k7bVar3 = new k7b(-1, false);
                            k7bVar3.p = (int) measuredHeight;
                            arrayList4.add(k7bVar3);
                        }
                    }
                }
                if (this.h.t) {
                    Collections.reverse(arrayList4);
                }
                r7bVar = this.n;
                if (r7bVar != null) {
                    if (!z || a8bVar.H1 == 0) {
                        r7bVar.f();
                    } else {
                        r7bVar.E(arrayList3, arrayList4);
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
            r7bVar = this.n;
            if (r7bVar != null) {
            }
            this.e.invalidate();
        }
        this.G = false;
        l55Var.setVisibility(8);
        int i22 = a8b.X1;
        int i23 = a8bVar.a;
        ArrayList arrayList10 = a8bVar.r1;
        ArrayList arrayList11 = a8bVar.n1;
        HashSet hashSet = a8bVar.u1;
        ArrayList arrayList12 = a8bVar.q1;
        ArrayList arrayList13 = oc7.r1(i23).N1().T;
        k7b k7bVar4 = new k7b(-1, false);
        k7bVar4.o = 24;
        arrayList4.add(k7bVar4);
        if (a8bVar.F1) {
            String M02 = jb6.M0(2131748546, null);
            k7b k7bVar5 = new k7b(11, false);
            k7bVar5.e = M02;
            arrayList4.add(k7bVar5);
            k7bVar4.o = gm.L(72.0f) + k7bVar4.o;
        } else if (a8bVar.z1 && (a8bVar.T1 || arrayList13 == null || arrayList13.size() <= 1)) {
            String M03 = a8bVar.T1 ? jb6.M0(2131744258, null) : jb6.M0(a8bVar.E1 ? 2131744306 : 2131744247, null);
            if (a8bVar.E1) {
                G = jb6.M0(2131744307, null);
            } else {
                int i24 = a8bVar.K1;
                G = i24 != Integer.MAX_VALUE ? jb6.G(i24 / 3600, "StoryPrivacyAlertSubtitle", new Object[0]) : jb6.M0(2131744250, null);
            }
            k7b k7bVar6 = new k7b(4, false);
            k7bVar6.e = M03;
            k7bVar6.f = G;
            arrayList4.add(k7bVar6);
            k7bVar4.o = gm.L(72.0f) + k7bVar4.o;
        } else {
            String M04 = jb6.M0(a8bVar.E1 ? 2131744304 : 2131744204, null);
            k7b k7bVar7 = new k7b(8, false);
            k7bVar7.e = M04;
            arrayList4.add(k7bVar7);
            k7bVar4.o = gm.L(50.0f) + k7bVar4.o;
            TLRPC.InputPeer inputPeer = a8bVar.m1;
            if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                k7b i25 = k7b.i(z8c.h(a8bVar.a).f(), false, false);
                i25.n = true;
                arrayList4.add(i25);
                k7bVar4.o = gm.L(62.0f) + k7bVar4.o;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                k7b i26 = k7b.i(oc7.r1(a8bVar.a).W1(Long.valueOf(a8bVar.m1.user_id)), false, false);
                i26.n = true;
                arrayList4.add(i26);
                k7bVar4.o = gm.L(62.0f) + k7bVar4.o;
            } else {
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.Chat L03 = oc7.r1(a8bVar.a).L0(Long.valueOf(a8bVar.m1.channel_id));
                    k7b k7bVar8 = new k7b(3, true);
                    k7bVar8.h = L03;
                    k7bVar8.k = false;
                    k7bVar8.n = true;
                    arrayList4.add(k7bVar8);
                    z5 = sd2.V(L03);
                    k7bVar4.o = gm.L(104.0f) + k7bVar4.o;
                    z4 = false;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.Chat L04 = oc7.r1(a8bVar.a).L0(Long.valueOf(a8bVar.m1.chat_id));
                    k7b k7bVar9 = new k7b(3, true);
                    k7bVar9.h = L04;
                    k7bVar9.k = false;
                    k7bVar9.n = true;
                    arrayList4.add(k7bVar9);
                    k7bVar4.o = gm.L(104.0f) + k7bVar4.o;
                    z5 = false;
                    z4 = false;
                }
                k7b g = k7b.g(null);
                g.c = !z4 ? (byte) 1 : (byte) 2;
                arrayList4.add(g);
                k7bVar4.o = gm.L(12.0f) + k7bVar4.o;
                if (z4) {
                    String M05 = jb6.M0(a8bVar.E1 ? 2131744303 : 2131744199, null);
                    k7b k7bVar10 = new k7b(8, false);
                    k7bVar10.e = M05;
                    arrayList4.add(k7bVar10);
                    k7bVar4.o = gm.L(40.0f) + k7bVar4.o;
                }
                if (z4 || a8bVar.F1) {
                    f2 = 80.0f;
                } else {
                    f2 = 80.0f;
                    k7b h = k7b.h(4, a8bVar.p1, a8bVar.H1 == 4);
                    arrayList4.add(h);
                    k7bVar4.o = gm.L(56.0f) + k7bVar4.o;
                    if (a8bVar.p1 == 1) {
                        if (arrayList11.size() != 1) {
                            Iterator it2 = a8bVar.o1.values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList14 = (ArrayList) it2.next();
                                if (arrayList14.size() >= 1) {
                                    h.g = oc7.r1(a8bVar.a).W1((Long) arrayList14.get(0));
                                    break;
                                }
                            }
                        } else {
                            h.g = oc7.r1(a8bVar.a).W1((Long) arrayList11.get(0));
                        }
                    }
                    k7b h2 = k7b.h(2, arrayList12.size(), a8bVar.H1 == 2);
                    arrayList4.add(h2);
                    k7bVar4.o = gm.L(56.0f) + k7bVar4.o;
                    if (arrayList12.size() == 1) {
                        h2.g = oc7.r1(a8bVar.a).W1((Long) arrayList12.get(0));
                    }
                    ArrayList H0 = a8bVar.H0();
                    k7b h3 = k7b.h(1, H0.size(), a8bVar.H1 == 1);
                    arrayList4.add(h3);
                    k7bVar4.o = gm.L(56.0f) + k7bVar4.o;
                    if (H0.size() == 1 && (H0.get(0) instanceof TLRPC.User)) {
                        h3.g = (TLRPC.User) H0.get(0);
                    }
                    k7b h4 = k7b.h(3, a8bVar.t1, a8bVar.H1 == 3);
                    arrayList4.add(h4);
                    k7bVar4.o = gm.L(56.0f) + k7bVar4.o;
                    if (a8bVar.t1 == 1) {
                        if (arrayList10.size() != 1) {
                            Iterator it3 = a8bVar.s1.values().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList15 = (ArrayList) it3.next();
                                if (arrayList15.size() >= 1) {
                                    h4.g = oc7.r1(a8bVar.a).W1((Long) arrayList15.get(0));
                                    break;
                                }
                            }
                        } else {
                            h4.g = oc7.r1(a8bVar.a).W1((Long) arrayList10.get(0));
                        }
                    }
                    int i27 = oc7.r1(a8bVar.a).N1().N;
                    boolean z12 = a8bVar.E1;
                    arrayList4.add(k7b.g(gm.N2(i27 <= 0 ? jb6.M0(z12 ? 2131744314 : 2131744405, null) : jb6.G(i27, z12 ? "StoryLiveBlockList" : "StoryBlockList", new Object[0]), cmb.Wc, 0, new m7b(this, (byte) 3), a8bVar.J0)));
                    k7bVar4.o = gm.L(80.0f) + k7bVar4.o;
                }
                if (!a8bVar.T1) {
                    if (a8bVar.E1 && !a8bVar.F1) {
                        if (a8bVar.A1) {
                            arrayList4.add(k7b.b(jb6.M0(2131748554, null), "", 5));
                            k7bVar4.o = gm.L(50.0f) + k7bVar4.o;
                            arrayList4.add(k7b.b(jb6.M0(2131748560, null), "", 6));
                            k7bVar4.o = gm.L(50.0f) + k7bVar4.o;
                            arrayList4.add(k7b.g(null));
                            k7bVar4.o = gm.L(12.0f) + k7bVar4.o;
                        } else {
                            arrayList4.add(k7b.b(jb6.M0(2131748559, null), "", 5));
                            k7bVar4.o = gm.L(50.0f) + k7bVar4.o;
                            arrayList4.add(k7b.g(jb6.M0(2131748558, null)));
                            k7bVar4.o = gm.L(30.0f) + k7bVar4.o;
                        }
                    }
                    if (a8bVar.E1) {
                        String M06 = jb6.M0(2131744316, null);
                        boolean z13 = a8bVar.v1;
                        k7b k7bVar11 = new k7b(7, false);
                        k7bVar11.c = (byte) 2;
                        k7bVar11.e = M06;
                        k7bVar11.k = z13;
                        arrayList4.add(k7bVar11);
                        k7bVar4.o = gm.L(50.0f) + k7bVar4.o;
                    }
                    if (!a8bVar.F1) {
                        String M07 = jb6.M0(2131744418, null);
                        boolean z14 = a8bVar.w1;
                        k7b k7bVar12 = new k7b(7, false);
                        k7bVar12.c = (byte) 0;
                        k7bVar12.e = M07;
                        k7bVar12.k = z14;
                        arrayList4.add(k7bVar12);
                        k7bVar4.o = gm.L(50.0f) + k7bVar4.o;
                    }
                    if (!a8bVar.E1 && !a8bVar.F1) {
                        String M08 = jb6.M0(z4 ? 2131744344 : z5 ? 2131744343 : 2131744338, null);
                        boolean z15 = a8bVar.x1;
                        k7b k7bVar13 = new k7b(7, false);
                        k7bVar13.c = (byte) 1;
                        k7bVar13.e = M08;
                        k7bVar13.k = z15;
                        arrayList4.add(k7bVar13);
                        k7bVar4.o = gm.L(50.0f) + k7bVar4.o;
                    }
                }
                z6 = a8bVar.E1;
                String str = "StoryKeepGroupInfo";
                if (!z6 || a8bVar.F1) {
                    arrayList4.add(k7b.g(null));
                    k7bVar4.o = gm.L(12.0f) + k7bVar4.o;
                } else if (!a8bVar.T1 && a8bVar.y1 && a8bVar.W1 != null) {
                    if (z6) {
                        G3 = jb6.M0(z4 ? 2131744309 : z5 ? 2131744311 : 2131744310, null);
                    } else {
                        String str2 = z4 ? "StoryKeepInfo" : z5 ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                        int i28 = a8bVar.K1;
                        if (i28 == Integer.MAX_VALUE) {
                            i28 = 86400;
                        }
                        G3 = jb6.G(i28 / 3600, str2, new Object[0]);
                    }
                    arrayList4.add(k7b.g(G3));
                    k7bVar4.o = gm.L(f2) + k7bVar4.o;
                }
                if (a8bVar.x1 || a8bVar.E1 || a8bVar.F1) {
                    z7 = z5;
                } else {
                    TLRPC.InputPeer inputPeer2 = a8bVar.m1;
                    long m = inputPeer2 != null ? pg3.m(inputPeer2) : z8c.h(a8bVar.a).e();
                    oc7.r1(a8bVar.a).N1().A(m, true);
                    StringBuilder sb = new StringBuilder();
                    if (hashSet.isEmpty()) {
                        sb.append(jb6.M0(2131744475, null));
                        z7 = z5;
                    } else {
                        z7 = z5;
                        if (hashSet.size() < 3) {
                            Iterator it4 = hashSet.iterator();
                            while (it4.hasNext()) {
                                Iterator it5 = it4;
                                a4b b = oc7.r1(a8bVar.a).N1().A(m, true).b(((Integer) it4.next()).intValue());
                                if (b != null) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(b.b);
                                }
                                it4 = it5;
                            }
                        } else {
                            sb.append(jb6.G(hashSet.size(), "StoriesAlbumCount", new Object[0]));
                        }
                    }
                    arrayList4.add(k7b.b(jb6.M0(2131744497, null), sb, 1));
                    k7bVar4.o = gm.L(50.0f) + k7bVar4.o;
                }
                if (!a8bVar.T1 && ((!a8bVar.y1 || a8bVar.W1 == null) && !(z8 = a8bVar.E1) && !a8bVar.F1)) {
                    if (z8) {
                        if (z4) {
                            str = "StoryKeepInfo";
                        } else if (z7) {
                            str = "StoryKeepChannelInfo";
                        }
                        int i29 = a8bVar.K1;
                        G2 = jb6.G((i29 == Integer.MAX_VALUE ? 86400 : i29) / 3600, str, new Object[0]);
                    } else {
                        G2 = jb6.M0(z4 ? 2131744309 : z7 ? 2131744311 : 2131744310, null);
                    }
                    arrayList4.add(k7b.g(G2));
                    k7bVar4.o = gm.L(f2) + k7bVar4.o;
                }
                if (a8bVar.x1 && a8bVar.y1 && a8bVar.W1 != null) {
                    String M09 = jb6.M0(2131744362, null);
                    BitmapDrawable bitmapDrawable = a8bVar.V1;
                    k7b k7bVar14 = new k7b(9, false);
                    k7bVar14.e = M09;
                    k7bVar14.d = bitmapDrawable;
                    k7bVar14.q = (byte) 0;
                    arrayList4.add(k7bVar14);
                    k7bVar4.o = gm.L(50.0f) + k7bVar4.o;
                    arrayList4.add(k7b.g(jb6.M0(2131744361, null)));
                    k7bVar4.o = gm.L(72.0f) + k7bVar4.o;
                }
                if (a8bVar.F1) {
                    arrayList4.add(k7b.b(jb6.M0(2131748554, null), "", 5));
                    k7bVar4.o = gm.L(50.0f) + k7bVar4.o;
                    arrayList4.add(k7b.g(null));
                    k7bVar4.o = gm.L(52.0f) + k7bVar4.o;
                }
                if (a8bVar.E1 && a8bVar.v1) {
                    String M010 = jb6.M0(2131748563, null);
                    k7b k7bVar15 = new k7b(8, false);
                    k7bVar15.e = M010;
                    arrayList4.add(k7bVar15);
                    k7bVar4.o = gm.L(40.0f) + k7bVar4.o;
                    k7b k7bVar16 = new k7b(10, false);
                    k7bVar16.q = (byte) 8;
                    arrayList4.add(k7bVar16);
                    k7bVar4.o = gm.L(75.0f) + k7bVar4.o;
                    arrayList4.add(k7b.g(jb6.M0(2131748561, null)));
                    k7bVar4.o = gm.L(50.0f) + k7bVar4.o;
                }
            }
            z4 = true;
            z5 = false;
            k7b g2 = k7b.g(null);
            g2.c = !z4 ? (byte) 1 : (byte) 2;
            arrayList4.add(g2);
            k7bVar4.o = gm.L(12.0f) + k7bVar4.o;
            if (z4) {
            }
            if (z4) {
            }
            f2 = 80.0f;
            if (!a8bVar.T1) {
            }
            z6 = a8bVar.E1;
            String str3 = "StoryKeepGroupInfo";
            if (z6) {
            }
            arrayList4.add(k7b.g(null));
            k7bVar4.o = gm.L(12.0f) + k7bVar4.o;
            if (a8bVar.x1) {
            }
            z7 = z5;
            if (!a8bVar.T1) {
                if (z8) {
                }
                arrayList4.add(k7b.g(G2));
                k7bVar4.o = gm.L(f2) + k7bVar4.o;
            }
            if (a8bVar.x1) {
                String M092 = jb6.M0(2131744362, null);
                BitmapDrawable bitmapDrawable2 = a8bVar.V1;
                k7b k7bVar142 = new k7b(9, false);
                k7bVar142.e = M092;
                k7bVar142.d = bitmapDrawable2;
                k7bVar142.q = (byte) 0;
                arrayList4.add(k7bVar142);
                k7bVar4.o = gm.L(50.0f) + k7bVar4.o;
                arrayList4.add(k7b.g(jb6.M0(2131744361, null)));
                k7bVar4.o = gm.L(72.0f) + k7bVar4.o;
            }
            if (a8bVar.F1) {
            }
            if (a8bVar.E1) {
                String M0102 = jb6.M0(2131748563, null);
                k7b k7bVar152 = new k7b(8, false);
                k7bVar152.e = M0102;
                arrayList4.add(k7bVar152);
                k7bVar4.o = gm.L(40.0f) + k7bVar4.o;
                k7b k7bVar162 = new k7b(10, false);
                k7bVar162.q = (byte) 8;
                arrayList4.add(k7bVar162);
                k7bVar4.o = gm.L(75.0f) + k7bVar4.o;
                arrayList4.add(k7b.g(jb6.M0(2131748561, null)));
                k7bVar4.o = gm.L(50.0f) + k7bVar4.o;
            }
        }
        z4 = true;
        z5 = false;
        if (z4) {
        }
        f2 = 80.0f;
        if (!a8bVar.T1) {
        }
        z6 = a8bVar.E1;
        String str32 = "StoryKeepGroupInfo";
        if (z6) {
        }
        arrayList4.add(k7b.g(null));
        k7bVar4.o = gm.L(12.0f) + k7bVar4.o;
        if (a8bVar.x1) {
        }
        z7 = z5;
        if (!a8bVar.T1) {
        }
        if (a8bVar.x1) {
        }
        if (a8bVar.F1) {
        }
        if (a8bVar.E1) {
        }
        L = 0.0f;
        boolean isEmpty22 = TextUtils.isEmpty(this.J);
        if (this.a != 0) {
        }
        if (this.h.t) {
        }
        r7bVar = this.n;
        if (r7bVar != null) {
        }
        this.e.invalidate();
    }

    public final void i(boolean z) {
        l55 l55Var = this.E;
        if (l55Var == null) {
            return;
        }
        if (a8b.M0(this.c, this.d).size() > 0) {
            l55Var.a(jb6.M0(2131743317, null), new l7b(this, (byte) 2));
            return;
        }
        if (z) {
            l55Var.setRightText(null);
            return;
        }
        rj rjVar = l55Var.b;
        rjVar.c(null, false, true);
        rjVar.setOnClickListener(null);
        rjVar.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(boolean z) {
        o7b o7bVar;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        HashSet M0 = a8b.M0(this.c, this.d);
        int i = this.a;
        a8b a8bVar = this.a0;
        if (i == 3) {
            a8bVar.t1 = M0.size();
        } else if (i == 4) {
            a8bVar.p1 = M0.size();
        }
        oc7 r1 = oc7.r1(a8bVar.a);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Object[] objArr = 0;
        int i2 = 0;
        while (true) {
            o7bVar = this.y;
            ArrayList arrayList4 = o7bVar.e;
            arrayList = o7bVar.e;
            if (i2 >= arrayList4.size()) {
                break;
            }
            wc5 wc5Var = (wc5) arrayList.get(i2);
            if (!M0.contains(Long.valueOf(wc5Var.getUid()))) {
                arrayList2.add(wc5Var);
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
                    Object W1 = longValue >= 0 ? r1.W1(l) : r1.L0(l);
                    if (W1 != null) {
                        wc5 wc5Var2 = new wc5(getContext(), W1, null, true, a8bVar.J0);
                        wc5Var2.setOnClickListener(this);
                        arrayList3.add(wc5Var2);
                    }
                } else if (((wc5) arrayList.get(i3)).getUid() != longValue) {
                    i3++;
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        i1a i1aVar = o7bVar.d;
        ArrayList arrayList5 = i1aVar.e;
        ArrayList arrayList6 = i1aVar.d;
        ArrayList arrayList7 = i1aVar.f;
        x7b x7bVar = (x7b) i1aVar.n;
        x7bVar.I = true;
        ArrayList arrayList8 = x7bVar.e;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = i1aVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            ((wc5) arrayList2.get(i4)).setOnClickListener(null);
        }
        i1aVar.c();
        if (z) {
            i1aVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            i1aVar.b = animatorSet;
            animatorSet.addListener(new w7b(i1aVar, arrayList2, objArr == true ? 1 : 0));
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
                wc5 wc5Var3 = (wc5) arrayList2.get(i5);
                arrayList5.add(wc5Var3);
                arrayList7.add(ObjectAnimator.ofFloat(wc5Var3, (Property<wc5, Float>) property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(wc5Var3, (Property<wc5, Float>) property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(wc5Var3, (Property<wc5, Float>) property, 1.0f, 0.0f));
                i5++;
            }
            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                wc5 wc5Var4 = (wc5) arrayList3.get(i6);
                arrayList6.add(wc5Var4);
                arrayList7.add(ObjectAnimator.ofFloat(wc5Var4, (Property<wc5, Float>) property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(wc5Var4, (Property<wc5, Float>) property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(wc5Var4, (Property<wc5, Float>) property, 0.0f, 1.0f));
            }
        } else {
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                i1aVar.removeView((View) arrayList2.get(i7));
            }
            arrayList9.clear();
            i1aVar.b = null;
            i1aVar.c = false;
            x7bVar.b.setAllowDrawCursor(true);
        }
        for (int i8 = 0; i8 < arrayList3.size(); i8++) {
            i1aVar.addView((View) arrayList3.get(i8));
        }
        i1aVar.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        float c = c();
        boolean z = this.N;
        boolean z2 = false;
        Object[] objArr = 0;
        o7b o7bVar = this.y;
        if (z || this.V || getTranslationX() != 0.0f) {
            this.O = false;
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.Q = null;
            }
            o7bVar.setTranslationY(c);
        } else if (!this.O || Math.abs(this.P - c) > 1.0f) {
            this.O = true;
            ValueAnimator valueAnimator2 = this.Q;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.Q = null;
            }
            float translationY = o7bVar.getTranslationY();
            this.P = c;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c);
            this.Q = ofFloat;
            ofFloat.addUpdateListener(new rha(this, (byte) 19));
            this.Q.addListener(new q7b(this, objArr == true ? 1 : 0));
            this.Q.setInterpolator(new LinearInterpolator());
            this.Q.setDuration(180L);
            this.Q.start();
        }
        boolean z3 = this.G;
        wx7 wx7Var = this.F;
        if (!z3) {
            wx7Var.setVisibility(8);
            return;
        }
        wx7Var.setVisibility(0);
        float f = -wx7Var.getHeight();
        int i = 0;
        while (true) {
            r59 r59Var = this.f;
            if (i >= r59Var.getChildCount()) {
                z2 = true;
                break;
            }
            View childAt = r59Var.getChildAt(i);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                f = this.e.getPaddingTop() + childAt.getY();
                break;
            }
            i++;
        }
        if (this.R != z2) {
            this.R = z2;
            ((ee0) wx7Var.e).c(true, (z2 || this.a != 0) ? 0.0f : 1.0f);
        }
        wx7Var.setTranslationY(Math.max(gm.m, f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = a8b.X1;
        nm7.f(this.a0.a).b(this, nm7.T);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o7b o7bVar = this.y;
        if (!o7bVar.e.contains(view)) {
            return;
        }
        wc5 wc5Var = (wc5) view;
        if (!wc5Var.E) {
            wc5 wc5Var2 = o7bVar.f;
            if (wc5Var2 != null) {
                wc5Var2.a();
                o7bVar.f = null;
            }
            o7bVar.f = wc5Var;
            wc5Var.b();
            return;
        }
        o7bVar.f = null;
        i1a i1aVar = o7bVar.d;
        x7b x7bVar = (x7b) i1aVar.n;
        x7bVar.I = true;
        x7bVar.e.remove(wc5Var);
        wc5Var.setOnClickListener(null);
        i1aVar.c();
        i1aVar.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        i1aVar.b = animatorSet;
        animatorSet.addListener(new ic8((Object) i1aVar, (Object) wc5Var, (byte) 18));
        ArrayList arrayList = i1aVar.h;
        arrayList.clear();
        arrayList.add(wc5Var);
        ArrayList arrayList2 = i1aVar.d;
        arrayList2.clear();
        i1aVar.e.clear();
        arrayList2.add(wc5Var);
        ArrayList arrayList3 = i1aVar.f;
        arrayList3.clear();
        arrayList3.add(ObjectAnimator.ofFloat(wc5Var, (Property<wc5, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(wc5Var, (Property<wc5, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(wc5Var, (Property<wc5, Float>) View.ALPHA, 1.0f, 0.0f));
        i1aVar.requestLayout();
        long uid = wc5Var.getUid();
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
        int i = a8b.X1;
        nm7.f(this.a0.a).n(this, nm7.T);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = a8b.X1;
        a8b a8bVar = this.a0;
        int i4 = a8bVar.f;
        if (i4 > 0) {
            this.U = i4;
        }
        super.onMeasure(i, i2);
        this.e.setPadding(0, gm.m + (this.a == 0 ? 0 : gm.L(56.0f)), 0, 0);
        boolean z = this.W;
        boolean z2 = a8bVar.d;
        t7b t7bVar = this.r;
        r59 r59Var = this.f;
        if (z != z2) {
            float c = c();
            byte b = 2;
            byte b2 = 1;
            if (a8bVar.d && c + Math.min(gm.L(150.0f), this.y.L) > r59Var.getPaddingTop()) {
                w46 w46Var = new w46(getContext(), 2, 0.7f);
                w46Var.a = 1;
                w46Var.p = -gm.L(56.0f);
                this.h.v0(w46Var);
            }
            int i5 = this.a;
            boolean z3 = a8bVar.d;
            View view = this.s;
            if (i5 == 0) {
                t7bVar.setTranslationY(z3 ? this.U : 0.0f);
                view.setTranslationY(a8bVar.d ? this.U : 0.0f);
            } else {
                int i6 = this.U;
                if (!z3) {
                    i6 = -i6;
                }
                float f = i6;
                ValueAnimator valueAnimator = t7bVar.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    t7bVar.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                t7bVar.d = ofFloat;
                ofFloat.addUpdateListener(new s7b(t7bVar, (byte) 1));
                t7bVar.d.addListener(new q7b(t7bVar, b2));
                t7bVar.d.setDuration(250L);
                ValueAnimator valueAnimator2 = t7bVar.d;
                d53 d53Var = gb.w;
                valueAnimator2.setInterpolator(d53Var);
                t7bVar.d.start();
                view.setTranslationY(a8bVar.d ? this.U : -r10);
                this.V = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(d53Var).withEndAction(new m7b(this, b)).start();
            }
            this.W = a8bVar.d;
        }
        r59Var.setPadding(0, 0, 0, t7bVar.getMeasuredHeight());
    }
}
