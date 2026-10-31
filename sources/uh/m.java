package uh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import mg.s;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.v71;
import org.telegram.ui.xy0;
import qh.e0;
import rh.d0;
import sg.y;
import th.d5;
import th.e5;
import th.q4;
import vh.n5;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class m extends FrameLayout implements k6, us {
    public static LongSparseArray E;
    public static LongSparseArray F;
    public int D;
    public final k2 a;
    public final int b;
    public final p6 c;
    public final long d;
    public final q4 e;
    public final ArrayList f;
    public final ArrayList h;
    public final xy0 n;
    public final v71 r;
    public Boolean s;
    public int w;
    public float x;
    public ValueAnimator y;

    public m(Context context, k2 k2Var, long j10) {
        super(context);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.s = null;
        this.w = i0.q.y;
        this.D = Utilities.j(tz.u1, 6, 2);
        this.a = k2Var;
        int currentAccount = k2Var.getCurrentAccount();
        this.b = currentAccount;
        p6 resourceProvider = k2Var.getResourceProvider();
        this.c = resourceProvider;
        this.d = j10;
        setBackgroundColor(t6.w(t6.w0(t6.d6, resourceProvider), t6.r1(0.04f, t6.w0(t6.G6, resourceProvider))));
        if (F == null) {
            F = new LongSparseArray();
        }
        long j11 = currentAccount;
        LongSparseArray longSparseArray = (LongSparseArray) F.get(j11);
        if (longSparseArray == null) {
            LongSparseArray longSparseArray2 = F;
            LongSparseArray longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j11, longSparseArray3);
            longSparseArray = longSparseArray3;
        }
        q4 q4Var = (q4) longSparseArray.get(j10);
        if (q4Var == null) {
            q4 q4Var2 = new q4(currentAccount, j10, "", null);
            longSparseArray.put(j10, q4Var2);
            q4Var = q4Var2;
        }
        this.e = q4Var;
        uq0 uq0Var = (uq0) this;
        xy0 xy0Var = new xy0(uq0Var, context);
        this.n = xy0Var;
        xy0Var.setAllowDisallowInterceptTouch(true);
        xy0Var.setAdapter(new s(uq0Var, context, 10));
        addView(xy0Var, b6.e(-1, -1, zs.E1));
        v71 n10 = xy0Var.n(9, true);
        this.r = n10;
        n10.r = 12;
        n10.setPreTabClick(new d0(uq0Var, 21));
        addView(n10, b6.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        k2 k2Var = this.a;
        if (k2Var == null || k2Var.getParentActivity() == null) {
            return;
        }
        bi biVar = new bi(k2Var.getParentActivity(), this.a, false, false, false, this.c);
        biVar.x1(1, false);
        biVar.N2 = true;
        biVar.M2 = false;
        biVar.d3.setText(cd.L0(2131752121, null));
        biVar.a2.g0();
        biVar.T3 = new q5.d((FrameLayout) this, (Object) biVar, (Serializable) str, 8);
        biVar.d1();
        biVar.show();
    }

    public final void b(String str) {
        q4 q4Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e.G.remove(str);
        this.h.remove(str);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i10 >= arrayList.size()) {
                q4Var = null;
                break;
            }
            q4Var = (q4) arrayList.get(i10);
            if (q4Var != null && TextUtils.equals(q4Var.E, str)) {
                break;
            } else {
                i10++;
            }
        }
        if (q4Var != null) {
            ArrayList arrayList2 = q4Var.i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i11 = this.b;
            deletepreviewmedia.bot = vp.r1(i11).n1(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_stories.StoryItem storyItem = ((jj) arrayList2.get(i12)).l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(vp.W4(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i11).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.r.d(-1, 0);
    }

    public abstract boolean c(jj jjVar);

    public final boolean d() {
        q4 q4Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof i) || (q4Var = ((i) currentView).a) == null) {
            return true;
        }
        ArrayList arrayList = q4Var.i;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (!c((jj) arrayList.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = zs.x5;
        xy0 xy0Var = this.n;
        int i13 = 0;
        if (i10 != i12) {
            if (i10 == zs.v5) {
                i(true);
                View[] viewPages = xy0Var.getViewPages();
                int length = viewPages.length;
                while (i13 < length) {
                    View view = viewPages[i13];
                    if (view instanceof i) {
                        ((i) view).w.f();
                    }
                    i13++;
                }
                return;
            }
            return;
        }
        Object obj = objArr[0];
        q4 q4Var = this.e;
        if (obj == q4Var) {
            i(true);
            View[] viewPages2 = xy0Var.getViewPages();
            int length2 = viewPages2.length;
            while (i13 < length2) {
                View view2 = viewPages2[i13];
                if (view2 instanceof i) {
                    i iVar = (i) view2;
                    if (iVar.a == q4Var) {
                        iVar.w.f();
                    }
                }
                i13++;
            }
            return;
        }
        if (this.f.indexOf(obj) >= 0) {
            View[] viewPages3 = xy0Var.getViewPages();
            for (View view3 : viewPages3) {
                if (view3 instanceof i) {
                    i iVar2 = (i) view3;
                    if (iVar2.a == objArr[0]) {
                        iVar2.w.f();
                    }
                }
            }
        }
    }

    public abstract boolean e(jj jjVar);

    public final void f() {
        q4 q4Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof i) || (q4Var = ((i) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = q4Var.i;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (!c((jj) arrayList.get(i10))) {
                e((jj) arrayList.get(i10));
            }
        }
    }

    public abstract boolean g(jj jjVar);

    public String getBotPreviewsSubtitle() {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        StringBuilder sb2 = new StringBuilder();
        View currentView = this.n.getCurrentView();
        if (currentView instanceof i) {
            q4 q4Var = ((i) currentView).a;
            if (q4Var != null) {
                ArrayList arrayList = q4Var.i;
                i10 = 0;
                i11 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    jj jjVar = (jj) arrayList.get(i12);
                    TL_stories.StoryItem storyItem = jjVar.l;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (jj.K4(messageMedia.document)) {
                            i11++;
                        } else if (jjVar.l.media.photo != null) {
                            i10++;
                        }
                    }
                }
            } else {
                i10 = 0;
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return cd.L0(2131753014, null);
            }
            if (i10 > 0) {
                sb2.append(cd.G(i10, "Images", new Object[0]));
            }
            if (i11 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(cd.G(i11, "Videos", new Object[0]));
            }
        }
        return sb2.toString();
    }

    public String getCurrentLang() {
        View view;
        q4 q4Var;
        xy0 xy0Var = this.n;
        View[] viewPages = xy0Var.getViewPages();
        if (Math.abs(xy0Var.getCurrentPosition() - xy0Var.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if (!(view instanceof i) || (q4Var = ((i) view).a) == null) {
            return null;
        }
        return q4Var.E;
    }

    public q4 getCurrentList() {
        q4 q4Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof i) || (q4Var = ((i) currentView).a) == null) {
            return null;
        }
        return q4Var;
    }

    public tk0 getCurrentListView() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof i) {
            return ((i) currentView).f;
        }
        return null;
    }

    public int getItemsCount() {
        q4 q4Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof i) || (q4Var = ((i) currentView).a) == null) {
            return 0;
        }
        return q4Var.i.size();
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        q4 q4Var;
        View currentView = this.n.getCurrentView();
        if (!(currentView instanceof i) || (q4Var = ((i) currentView).a) == null) {
            return;
        }
        ArrayList arrayList = q4Var.i;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (c((jj) arrayList.get(i10))) {
                g((jj) arrayList.get(i10));
            }
        }
    }

    public final void i(boolean z10) {
        q4 q4Var;
        n5 n5Var;
        ArrayList arrayList = new ArrayList(this.e.G);
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            String str = (String) obj;
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        e5 O1 = vp.r1(this.b).O1();
        long j10 = this.d;
        ArrayList F2 = O1.F(j10);
        if (F2 != null) {
            int size2 = F2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = F2.get(i11);
                i11++;
                d5 d5Var = (d5) obj2;
                if (d5Var != null && (n5Var = d5Var.c) != null && n5Var.J0 == j10 && !TextUtils.isEmpty(n5Var.K0) && !arrayList.contains(n5Var.K0)) {
                    arrayList.add(n5Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            String str2 = (String) obj3;
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList4.size()) {
                    q4Var = null;
                    break;
                } else {
                    if (TextUtils.equals(((q4) arrayList4.get(i13)).E, str2)) {
                        q4Var = (q4) arrayList4.get(i13);
                        break;
                    }
                    i13++;
                }
            }
            if (q4Var == null) {
                q4 q4Var2 = new q4(this.b, this.d, str2, null);
                q4Var2.H(null);
                q4Var = q4Var2;
            }
            arrayList3.add(q4Var);
        }
        xy0 xy0Var = this.n;
        xy0Var.o(true);
        SpannableString spannableString = new SpannableString(a1.g.m(null, 2131746726, new StringBuilder("+ ")));
        dq dqVar = new dq(R.drawable.msg_filled_plus, 0);
        dqVar.H = 0.9f;
        dqVar.I = 0.9f;
        dqVar.G = 0.85f;
        spannableString.setSpan(dqVar, 0, 1, 33);
        v71 v71Var = this.r;
        v71Var.a(-1, spannableString);
        v71Var.y.f();
        boolean z11 = arrayList3.size() + 1 > 1;
        Boolean bool = this.s;
        if (bool == null || bool.booleanValue() != z11) {
            ValueAnimator valueAnimator = this.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.s = Boolean.valueOf(z11);
            if (!z10) {
                this.x = z11 ? 1.0f : 0.0f;
                v71Var.setTranslationY(i0.L(z11 ? 0.0f : -42.0f));
                xy0Var.setTranslationY(i0.L(z11 ? 42.0f : 0.0f));
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z11 ? 1.0f : 0.0f);
            this.y = ofFloat;
            ofFloat.addUpdateListener(new e0(this, 23));
            this.y.addListener(new y(5, this, z11));
            this.y.setDuration(320L);
            this.y.setInterpolator(gr.h);
            this.y.start();
        }
    }

    public final void j() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof i) {
            i iVar = (i) currentView;
            c cVar = iVar.f;
            for (int i10 = 0; i10 < cVar.getChildCount(); i10++) {
                View childAt = cVar.getChildAt(i10);
                if (childAt instanceof s7) {
                    s7 s7Var = (s7) childAt;
                    s7Var.i(iVar.W.c(s7Var.getMessageObject()), true);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (E == null) {
            E = new LongSparseArray();
        }
        LongSparseArray longSparseArray = E;
        int i10 = this.b;
        long j10 = i10;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j10);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = E;
            LongSparseArray longSparseArray4 = new LongSparseArray();
            longSparseArray3.put(j10, longSparseArray4);
            longSparseArray2 = longSparseArray4;
        }
        longSparseArray2.put(this.d, this);
        zs.f(i10).c(this, zs.x5);
        zs.f(i10).c(this, zs.v5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (E == null) {
            E = new LongSparseArray();
        }
        LongSparseArray longSparseArray = E;
        int i10 = this.b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i10);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        zs.f(i10).n(this, zs.x5);
        zs.f(i10).n(this, zs.v5);
    }

    public void setVisibleHeight(int i10) {
        this.w = i10;
        View[] viewPages = this.n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof i) {
                    ((i) view).setVisibleHeight(i10);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        p6 p6Var = this.c;
        try {
            setBackgroundColor(t6.w(t6.w0(t6.d6, p6Var), t6.r1(0.04f, t6.w0(t6.G6, p6Var))));
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
