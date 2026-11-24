// default package

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uf1 extends d {
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public static final Paint K = new Paint(1);
    public of1 E;
    public qf1 F;
    public tf1 G;
    public sf1 H;
    public uja a;
    public r59 b;
    public nf1 c;
    public boolean d;
    public int e;
    public String f;
    public y31 h;
    public boolean n;
    public String r;
    public final ArrayList s;
    public final ArrayList w;
    public final ArrayList x;
    public final long y;

    public uf1(Bundle bundle) {
        super(bundle);
        this.r = "";
        this.s = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        if (bundle != null) {
            this.y = bundle.getLong("bot_id");
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    public final boolean c0(String str) {
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        sf1 sf1Var = this.H;
        if (sf1Var != null) {
            sf1Var.setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
            tf1 tf1Var = this.G;
            if (tf1Var != null) {
                int i = tf1.f;
                tf1Var.a();
            }
        }
        y31 y31Var = this.h;
        if (y31Var != null) {
            gm.r(y31Var);
            this.h = null;
            this.f = null;
            if (this.e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.e, true);
            }
        }
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                sf1 sf1Var2 = this.H;
                if (sf1Var2 != null) {
                    sf1Var2.setText(jb6.M0(2131743343, null));
                    sf1 sf1Var3 = this.H;
                    int i2 = cmb.o7;
                    sf1Var3.setTag(Integer.valueOf(i2));
                    anb.X(this.H, i2, null);
                    tf1 tf1Var2 = this.G;
                    if (tf1Var2 != null) {
                        int i3 = tf1.f;
                        tf1Var2.a();
                        return false;
                    }
                }
            } else {
                for (int i4 = 0; i4 < str.length(); i4++) {
                    char charAt = str.charAt(i4);
                    if (i4 == 0 && charAt >= '0' && charAt <= '9') {
                        sf1 sf1Var4 = this.H;
                        if (sf1Var4 != null) {
                            sf1Var4.setText(jb6.M0(2131743339, null));
                            sf1 sf1Var5 = this.H;
                            int i5 = cmb.o7;
                            sf1Var5.setTag(Integer.valueOf(i5));
                            anb.X(this.H, i5, null);
                            tf1 tf1Var3 = this.G;
                            if (tf1Var3 != null) {
                                int i6 = tf1.f;
                                tf1Var3.a();
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        sf1 sf1Var6 = this.H;
                        if (sf1Var6 != null) {
                            sf1Var6.setText(jb6.M0(2131743343, null));
                            sf1 sf1Var7 = this.H;
                            int i7 = cmb.o7;
                            sf1Var7.setTag(Integer.valueOf(i7));
                            anb.X(this.H, i7, null);
                            tf1 tf1Var4 = this.G;
                            if (tf1Var4 != null) {
                                int i8 = tf1.f;
                                tf1Var4.a();
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (str == null || str.length() < 4) {
            sf1 sf1Var8 = this.H;
            if (sf1Var8 != null) {
                sf1Var8.setText(jb6.M0(2131743341, null));
                sf1 sf1Var9 = this.H;
                int i9 = cmb.o7;
                sf1Var9.setTag(Integer.valueOf(i9));
                anb.X(this.H, i9, null);
                tf1 tf1Var5 = this.G;
                if (tf1Var5 != null) {
                    int i10 = tf1.f;
                    tf1Var5.a();
                }
            }
        } else {
            if (str.length() <= 32) {
                String str2 = e0().username;
                if (str2 == null) {
                    str2 = "";
                }
                boolean equals = str.equals(str2);
                sf1 sf1Var10 = this.H;
                if (equals) {
                    if (sf1Var10 != null) {
                        sf1Var10.setText(jb6.a0("UsernameAvailable", null, 2131743354, str));
                        sf1 sf1Var11 = this.H;
                        int i11 = cmb.v6;
                        sf1Var11.setTag(Integer.valueOf(i11));
                        anb.X(this.H, i11, null);
                        tf1 tf1Var6 = this.G;
                        if (tf1Var6 != null) {
                            int i12 = tf1.f;
                            tf1Var6.a();
                        }
                    }
                    return true;
                }
                if (sf1Var10 != null) {
                    sf1Var10.setText(jb6.M0(2131743353, null));
                    sf1 sf1Var12 = this.H;
                    int i13 = cmb.E6;
                    sf1Var12.setTag(Integer.valueOf(i13));
                    anb.X(this.H, i13, null);
                    tf1 tf1Var7 = this.G;
                    if (tf1Var7 != null) {
                        int i14 = tf1.f;
                        tf1Var7.a();
                    }
                }
                this.f = str;
                y31 y31Var2 = new y31(this, str, (byte) 18);
                this.h = y31Var2;
                gm.d3(y31Var2, 300L);
                return true;
            }
            sf1 sf1Var13 = this.H;
            if (sf1Var13 != null) {
                sf1Var13.setText(jb6.M0(2131743342, null));
                sf1 sf1Var14 = this.H;
                int i15 = cmb.o7;
                sf1Var14.setTag(Integer.valueOf(i15));
                anb.X(this.H, i15, null);
                tf1 tf1Var8 = this.G;
                if (tf1Var8 != null) {
                    int i16 = tf1.f;
                    tf1Var8.a();
                    return false;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        String str;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(jb6.M0(2131743361, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 19));
        this.a = this.simpleActionBar.s(jb6.M0(2131745680, null));
        TLRPC.User W1 = oc7.r1(this.currentAccount).W1(Long.valueOf(f0()));
        if (W1 == null) {
            W1 = e0();
        }
        if (W1 != null) {
            this.r = null;
            if (W1.usernames != null) {
                int i = 0;
                while (true) {
                    if (i >= W1.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = W1.usernames.get(i);
                    if (tL_username != null && tL_username.editable) {
                        this.r = tL_username.username;
                        break;
                    }
                    i++;
                }
            }
            String str2 = this.r;
            if (str2 == null && (str = W1.username) != null) {
                this.r = str;
                str2 = str;
            }
            if (str2 == null) {
                this.r = "";
            }
            this.s.clear();
            ArrayList arrayList = this.w;
            arrayList.clear();
            for (int i2 = 0; i2 < W1.usernames.size(); i2++) {
                if (W1.usernames.get(i2).active) {
                    arrayList.add(W1.usernames.get(i2));
                }
            }
            for (int i3 = 0; i3 < W1.usernames.size(); i3++) {
                if (!W1.usernames.get(i3).active) {
                    arrayList.add(W1.usernames.get(i3));
                }
            }
        }
        this.fragmentView = new FrameLayout(context);
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.r1();
        this.b.setLayoutManager(new u46());
        r59 r59Var2 = this.b;
        nf1 nf1Var = new nf1(this);
        this.c = nf1Var;
        r59Var2.setAdapter(nf1Var);
        anb.J(this.b, cmb.h6, getResourceProvider());
        this.b.setSectionsDrawBackground(true);
        new hu5(new r20(this, (byte) 2)).h(this.b);
        ((FrameLayout) this.fragmentView).addView(this.b, qoe.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new p8((byte) 23));
        this.b.setOnItemClickListener(new lf1(this));
        gm.d3(new yt0(this, (byte) 23), 40L);
        return this.fragmentView;
    }

    public final void d0(boolean z) {
        of1 of1Var = this.E;
        if (of1Var != null) {
            if (!of1Var.a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.E.a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.E.a.requestFocus();
            if (z) {
                gm.E3(this.E.a);
            }
        }
    }

    public final TLRPC.User e0() {
        long j = this.y;
        int i = this.currentAccount;
        return j != 0 ? oc7.r1(i).W1(Long.valueOf(j)) : z8c.h(i).f();
    }

    public final long f0() {
        long j = this.y;
        return j != 0 ? j : z8c.h(this.currentAccount).e();
    }

    public final /* synthetic */ void g0(String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        this.e = ConnectionsManager.getInstance(this.currentAccount).sendRequest(checkusername, new eo0((Object) this, (Object) str, (Object) checkusername, (byte) 11), 2);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final /* synthetic */ void h0(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public final void i0(he heVar, TLRPC.User user) {
        try {
            heVar.dismiss();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(user);
        oc7.r1(this.currentAccount).d4(arrayList, false);
        cf7.Y(this.currentAccount).j1(arrayList, null, false, true);
        z8c.h(this.currentAccount).u(true);
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(he heVar, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            heVar.dismiss();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        ik.c0(this.currentAccount, tL_error, this, updateusername, new Object[0]);
        m0();
    }

    public final void k0() {
        if (this.y != 0) {
            finishFragment();
            return;
        }
        byte b = 1;
        if (this.r.startsWith("@")) {
            this.r = this.r.substring(1);
        }
        if (!this.r.isEmpty() && !c0(this.r)) {
            m0();
            return;
        }
        TLRPC.User e0 = e0();
        if (getParentActivity() == null || e0 == null) {
            return;
        }
        String p = m9c.p(e0);
        if (p == null) {
            p = "";
        }
        if (p.equals(this.r)) {
            finishFragment();
            return;
        }
        he heVar = new he(3, null, getParentActivity());
        TL_account.updateUsername updateusername = new TL_account.updateUsername();
        updateusername.username = this.r;
        nm7 f = nm7.f(this.currentAccount);
        int i = oc7.s5;
        f.k(2, 1);
        int sendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateusername, new eo0((Object) this, (Object) heVar, (Object) updateusername, (byte) 10), 2);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(sendRequest, this.classGuid);
        heVar.setOnCancelListener(new fu0(this, sendRequest, b));
        heVar.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l0() {
        ArrayList arrayList;
        ArrayList arrayList2;
        TL_bots.reorderUsernames reorderusernames;
        if (this.d) {
            byte b = 0;
            this.d = false;
            ArrayList<String> arrayList3 = new ArrayList<>();
            int i = 0;
            while (true) {
                arrayList = this.s;
                if (i >= arrayList.size()) {
                    break;
                }
                if (((TLRPC.TL_username) arrayList.get(i)).active) {
                    arrayList3.add(((TLRPC.TL_username) arrayList.get(i)).username);
                }
                i++;
            }
            int i2 = 0;
            while (true) {
                arrayList2 = this.w;
                if (i2 >= arrayList2.size()) {
                    break;
                }
                if (((TLRPC.TL_username) arrayList2.get(i2)).active) {
                    arrayList3.add(((TLRPC.TL_username) arrayList2.get(i2)).username);
                }
                i2++;
            }
            long j = this.y;
            if (j == 0) {
                TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
                reorderusernames2.order = arrayList3;
                reorderusernames = reorderusernames2;
            } else {
                TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
                reorderusernames3.bot = oc7.r1(this.currentAccount).n1(j);
                reorderusernames3.order = arrayList3;
                reorderusernames = reorderusernames3;
            }
            getConnectionsManager().sendRequest(reorderusernames, new nf2(b));
            ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
            arrayList4.addAll(arrayList);
            arrayList4.addAll(arrayList2);
            TLRPC.User W1 = oc7.r1(this.currentAccount).W1(Long.valueOf(f0()));
            W1.usernames = arrayList4;
            oc7.r1(this.currentAccount).c4(W1, false, true);
        }
    }

    public final void m0() {
        if (this.b == null) {
            return;
        }
        for (int i = 0; i < this.b.getChildCount(); i++) {
            View childAt = this.b.getChildAt(i);
            if ((childAt instanceof jf5) && i == 0) {
                gm.B3(((jf5) childAt).getTextView());
            } else if (childAt instanceof tf1) {
                gm.B3(childAt);
            } else if (childAt instanceof of1) {
                of1 of1Var = (of1) childAt;
                gm.B3(of1Var.a);
                gm.B3(of1Var.b);
            }
        }
        xx0.E.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0(int i, boolean z, boolean z2) {
        TLRPC.TL_username tL_username;
        int min;
        int i2 = i - 4;
        if (i2 >= 0) {
            ArrayList arrayList = this.w;
            if (i2 >= arrayList.size() || (tL_username = (TLRPC.TL_username) arrayList.get(i2)) == null) {
                return;
            }
            tL_username.active = z;
            int i3 = -1;
            if (!z) {
                int i4 = -1;
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    if (((TLRPC.TL_username) arrayList.get(i5)).active) {
                        i4 = i5;
                    }
                }
                if (i4 >= 0) {
                    min = Math.min(arrayList.size() - 1, i4 + 1);
                    i3 = min + 4;
                }
                if (this.b != null) {
                }
                if (i3 >= 0) {
                    return;
                } else {
                    return;
                }
            }
            int i6 = 0;
            while (true) {
                if (i6 >= arrayList.size()) {
                    i6 = -1;
                    break;
                } else if (!((TLRPC.TL_username) arrayList.get(i6)).active) {
                    break;
                } else {
                    i6++;
                }
            }
            if (i6 >= 0) {
                min = Math.max(0, i6 - 1);
                i3 = min + 4;
            }
            if (this.b != null) {
                int i7 = 0;
                while (true) {
                    if (i7 >= this.b.getChildCount()) {
                        break;
                    }
                    View childAt = this.b.getChildAt(i7);
                    this.b.getClass();
                    if (RecyclerView.R(childAt) == i) {
                        if (z2) {
                            gm.z3(childAt);
                        }
                        if (childAt instanceof qf1) {
                            qf1 qf1Var = (qf1) childAt;
                            qf1Var.setLoading(this.x.contains(tL_username.username));
                            TLRPC.TL_username tL_username2 = qf1Var.w;
                            if (tL_username2 != null) {
                                qf1Var.a(tL_username2, qf1Var.x, true, qf1Var.y);
                            }
                        }
                    } else {
                        i7++;
                    }
                }
            }
            if (i3 >= 0 || i == i3) {
                return;
            }
            nf1 nf1Var = this.c;
            int i8 = i3 - 4;
            ArrayList arrayList2 = nf1Var.c.w;
            if (i2 >= arrayList2.size() || i8 >= arrayList2.size()) {
                return;
            }
            arrayList2.add(i8, (TLRPC.TL_username) arrayList2.remove(i2));
            nf1Var.j(i, i3);
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                nf1Var.g(i9 + 4);
            }
        }
    }

    public final void o0(TLRPC.TL_username tL_username, boolean z, boolean z2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.w;
            if (i >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i) == tL_username) {
                n0(i + 4, z, z2);
                return;
            }
            i++;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        if (oc7.d1().getBoolean("view_animations", true)) {
            return;
        }
        d0(false);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            d0(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
