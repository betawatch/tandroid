// default package

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class xy6 implements ky6 {
    public final boolean a;
    public boolean b;
    public final d g;
    public final FrameLayout h;
    public final ny6 i;
    public final long j;
    public final int k;
    public final boolean l;
    public FrameLayout m;
    public zya n;
    public zya o;
    public o39 p;
    public pi4 q;
    public TLRPC.TL_chatInviteImporter r;
    public wy6 s;
    public String t;
    public oy6 u;
    public int v;
    public boolean w;
    public boolean y;
    public boolean z;
    public final ArrayList c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final qy6 f = new qy6(this);
    public boolean x = true;
    public boolean A = true;
    public boolean B = true;
    public final oy6 C = new oy6(this, (byte) 0);
    public final ao2 D = new ao2(this, 23);

    public xy6(d dVar, FrameLayout frameLayout, long j, boolean z) {
        this.g = dVar;
        this.h = frameLayout;
        this.j = j;
        int currentAccount = dVar.getCurrentAccount();
        this.k = currentAccount;
        this.a = hc2.U(currentAccount, j);
        this.l = z;
        this.i = ny6.a(currentAccount);
    }

    public static void k(View view, boolean z, boolean z2) {
        if (view != null) {
            boolean z3 = view.getVisibility() == 0;
            float f = z ? 1.0f : 0.0f;
            if (z == z3 && f == view.getAlpha()) {
                return;
            }
            if (!z2) {
                view.setVisibility(z ? 0 : 4);
                return;
            }
            if (z) {
                view.setAlpha(0.0f);
            }
            view.setVisibility(0);
            view.animate().alpha(f).setDuration(150L).start();
        }
    }

    public final zya a() {
        if (this.n == null) {
            d dVar = this.g;
            zya zyaVar = new zya(dVar.getParentActivity(), null, 16, dVar.getResourceProvider());
            this.n = zyaVar;
            boolean z = this.a;
            zyaVar.d.setText(k96.M0(z ? 2131747954 : 2131748003, null));
            this.n.e.setText(k96.M0(z ? 2131747953 : 2131748002, null));
            this.n.setAnimateLayoutChange(true);
            this.n.setVisibility(8);
        }
        return this.n;
    }

    public final pi4 b() {
        if (this.q == null) {
            d dVar = this.g;
            pi4 pi4Var = new pi4(dVar.getParentActivity(), dVar.getResourceProvider());
            this.q = pi4Var;
            pi4Var.setAlpha(0.0f);
            if (this.B) {
                zkb.h(bkb.c6, dVar.getResourceProvider(), this.q);
            }
            this.q.e(bkb.c6, bkb.Z6, -1);
            this.q.setViewType(15);
            this.q.setMemberRequestButton(this.a);
        }
        return this.q;
    }

    public final zya c() {
        if (this.o == null) {
            d dVar = this.g;
            zya zyaVar = new zya(dVar.getParentActivity(), null, 1, dVar.getResourceProvider());
            this.o = zyaVar;
            if (this.B) {
                zkb.h(bkb.c6, dVar.getResourceProvider(), zyaVar);
            }
            this.o.d.setText(k96.M0(2131747975, null));
            this.o.e.setText(k96.M0(2131745615, null));
            this.o.setAnimateLayoutChange(true);
            this.o.setVisibility(8);
        }
        return this.o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z;
        int i = this.k;
        tL_messages_hideChatJoinRequest.peer = na7.q1(i).h1(-this.j);
        tL_messages_hideChatJoinRequest.user_id = na7.q1(i).o1(user);
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_hideChatJoinRequest, new pf2(this, tL_chatInviteImporter, z, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.i.a.get(this.j);
            if (tL_messages_chatInviteImporters != null) {
                this.z = true;
                g(tL_messages_chatInviteImporters, null, true, true);
                z = false;
            }
        }
        gl.c3(new x6c((byte) 27, this, z));
    }

    public void f(String str, boolean z, boolean z2) {
        boolean z3;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.e;
        if (isEmpty) {
            z3 = !arrayList.isEmpty() || z;
            zya zyaVar = this.n;
            if (zyaVar != null) {
                zyaVar.setVisibility(z3 ? 4 : 0);
            }
            zya zyaVar2 = this.o;
            if (zyaVar2 != null) {
                zyaVar2.setVisibility(4);
            }
        } else {
            z3 = !this.c.isEmpty() || z;
            zya zyaVar3 = this.n;
            if (zyaVar3 != null) {
                zyaVar3.setVisibility(4);
            }
            zya zyaVar4 = this.o;
            if (zyaVar4 != null) {
                zyaVar4.setVisibility(z3 ? 4 : 0);
            }
        }
        k(this.p, z3, true);
        if (arrayList.isEmpty()) {
            zya zyaVar5 = this.n;
            if (zyaVar5 != null) {
                zyaVar5.setVisibility(0);
            }
            zya zyaVar6 = this.o;
            if (zyaVar6 != null) {
                zyaVar6.setVisibility(4);
            }
            k(this.q, false, false);
            if (this.y && this.l) {
                this.g.getActionBar().t().i(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters, String str, boolean z, boolean z2) {
        boolean z3;
        ArrayList<TLRPC.TL_chatInviteImporter> arrayList;
        int i;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        ArrayList arrayList2 = this.c;
        boolean z8 = false;
        boolean z9 = true;
        boolean z10 = !arrayList2.isEmpty() && this.x;
        for (int i2 = 0; i2 < tL_messages_chatInviteImporters.users.size(); i2++) {
            TLRPC.User user = tL_messages_chatInviteImporters.users.get(i2);
            this.d.put(user.id, user);
        }
        ArrayList<TLRPC.TL_chatInviteImporter> arrayList3 = tL_messages_chatInviteImporters.importers;
        qy6 qy6Var = this.f;
        if (z) {
            qy6Var.E(arrayList3);
            z4 = true;
        } else {
            if (arrayList3.size() > 0) {
                if (tL_messages_chatInviteImporters.importers.size() + arrayList2.size() < tL_messages_chatInviteImporters.count) {
                    z3 = true;
                    if (z3) {
                        qy6Var.r(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                    arrayList = tL_messages_chatInviteImporters.importers;
                    xy6 xy6Var = qy6Var.c;
                    ArrayList arrayList4 = xy6Var.c;
                    i = 0;
                    boolean z11 = z3;
                    while (i < arrayList.size()) {
                        long j = arrayList.get(i).user_id;
                        int i3 = 0;
                        boolean z12 = z11;
                        while (true) {
                            if (i3 >= arrayList4.size()) {
                                z6 = z9;
                                z7 = z12;
                                break;
                            }
                            z6 = z9;
                            z7 = z12;
                            if (((TLRPC.TL_chatInviteImporter) arrayList4.get(i3)).user_id == j) {
                                arrayList.remove(i);
                                i--;
                                break;
                            } else {
                                i3++;
                                z9 = z6;
                                z12 = z7;
                            }
                        }
                        i++;
                        z9 = z6;
                        z11 = z7;
                    }
                    z4 = z9;
                    z5 = z11;
                    arrayList4.addAll(arrayList);
                    qy6Var.p((arrayList4.size() + (!xy6Var.B ? 1 : 0)) - arrayList.size(), arrayList.size());
                    if (z5) {
                        qy6Var.i(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                }
            }
            z3 = false;
            if (z3) {
            }
            arrayList = tL_messages_chatInviteImporters.importers;
            xy6 xy6Var2 = qy6Var.c;
            ArrayList arrayList42 = xy6Var2.c;
            i = 0;
            boolean z112 = z3;
            while (i < arrayList.size()) {
            }
            z4 = z9;
            z5 = z112;
            arrayList42.addAll(arrayList);
            qy6Var.p((arrayList42.size() + (!xy6Var2.B ? 1 : 0)) - arrayList.size(), arrayList.size());
            if (z5) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList5 = this.e;
            if (z) {
                arrayList5.clear();
            }
            arrayList5.addAll(tL_messages_chatInviteImporters.importers);
            if (this.l) {
                this.g.getActionBar().t().j(0).setVisibility(arrayList5.isEmpty() ? 8 : 0);
            }
        }
        f(str, z2, false);
        this.x = arrayList2.size() < tL_messages_chatInviteImporters.count ? z4 : false;
        if (!arrayList2.isEmpty() && this.x) {
            z8 = z4;
        }
        if (z10 != z8) {
            if (this.x) {
                qy6Var.i(qy6Var.b() - 1);
            } else {
                qy6Var.r(qy6Var.b());
            }
        }
    }

    public final void h(View view) {
        if (view instanceof ly6) {
            if (this.y) {
                gl.t1(this.g.getParentActivity().getCurrentFocus());
            }
            gl.d3(new oh6((Object) this, view, (byte) 19), this.y ? 100L : 0L);
        }
    }

    public final void i(boolean z) {
        int i;
        o39 o39Var = this.p;
        if (o39Var == null || (i = !this.f.c.B ? 1 : 0) < 0 || i >= o39Var.getChildCount()) {
            return;
        }
        this.p.getChildAt(i).setEnabled(z);
    }

    public final void j(String str) {
        if (this.u != null) {
            Utilities.g.a(this.u);
            this.u = null;
        }
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.t = str;
        if (this.z && this.e.isEmpty()) {
            k(this.q, false, false);
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        qy6 qy6Var = this.f;
        if (isEmpty) {
            qy6Var.E(this.e);
            k(this.p, true, true);
            k(this.q, false, false);
            zya zyaVar = this.o;
            if (zyaVar != null) {
                zyaVar.setVisibility(4);
            }
            if (str == null && this.l) {
                this.g.getActionBar().t().j(0).setVisibility(this.e.isEmpty() ? 8 : 0);
            }
        } else {
            qy6Var.E(Collections.EMPTY_LIST);
            k(this.p, false, false);
            k(this.q, true, true);
            co3 co3Var = Utilities.g;
            oy6 oy6Var = new oy6(this, (byte) 2);
            this.u = oy6Var;
            co3Var.d(oy6Var, 300L);
        }
        if (str != null) {
            zya zyaVar2 = this.n;
            if (zyaVar2 != null) {
                zyaVar2.setVisibility(4);
            }
            zya zyaVar3 = this.o;
            if (zyaVar3 != null) {
                zyaVar3.setVisibility(4);
            }
        }
    }
}
