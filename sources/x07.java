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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class x07 implements k07 {
    public final boolean a;
    public boolean b;
    public final d g;
    public final FrameLayout h;
    public final n07 i;
    public final long j;
    public final int k;
    public final boolean l;
    public FrameLayout m;
    public a1b n;
    public a1b o;
    public r59 p;
    public tk4 q;
    public TLRPC.TL_chatInviteImporter r;
    public w07 s;
    public String t;
    public o07 u;
    public int v;
    public boolean w;
    public boolean y;
    public boolean z;
    public final ArrayList c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final q07 f = new q07(this);
    public boolean x = true;
    public boolean A = true;
    public boolean B = true;
    public final o07 C = new o07(this, (byte) 0);
    public final ip2 D = new ip2(this, 24);

    public x07(d dVar, FrameLayout frameLayout, long j, boolean z) {
        this.g = dVar;
        this.h = frameLayout;
        this.j = j;
        int currentAccount = dVar.getCurrentAccount();
        this.k = currentAccount;
        this.a = sd2.U(currentAccount, j);
        this.l = z;
        this.i = n07.a(currentAccount);
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

    public final a1b a() {
        if (this.n == null) {
            d dVar = this.g;
            a1b a1bVar = new a1b(dVar.getParentActivity(), null, 16, dVar.getResourceProvider());
            this.n = a1bVar;
            boolean z = this.a;
            a1bVar.d.setText(jb6.M0(z ? 2131747880 : 2131747929, null));
            this.n.e.setText(jb6.M0(z ? 2131747879 : 2131747928, null));
            this.n.setAnimateLayoutChange(true);
            this.n.setVisibility(8);
        }
        return this.n;
    }

    public final tk4 b() {
        if (this.q == null) {
            d dVar = this.g;
            tk4 tk4Var = new tk4(dVar.getParentActivity(), dVar.getResourceProvider());
            this.q = tk4Var;
            tk4Var.setAlpha(0.0f);
            if (this.B) {
                anb.h(cmb.c6, dVar.getResourceProvider(), this.q);
            }
            this.q.e(cmb.c6, cmb.Z6, -1);
            this.q.setViewType(15);
            this.q.setMemberRequestButton(this.a);
        }
        return this.q;
    }

    public final a1b c() {
        if (this.o == null) {
            d dVar = this.g;
            a1b a1bVar = new a1b(dVar.getParentActivity(), null, 1, dVar.getResourceProvider());
            this.o = a1bVar;
            if (this.B) {
                anb.h(cmb.c6, dVar.getResourceProvider(), a1bVar);
            }
            this.o.d.setText(jb6.M0(2131747901, null));
            this.o.e.setText(jb6.M0(2131745541, null));
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
        tL_messages_hideChatJoinRequest.peer = oc7.r1(i).i1(-this.j);
        tL_messages_hideChatJoinRequest.user_id = oc7.r1(i).p1(user);
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_hideChatJoinRequest, new bh2(this, tL_chatInviteImporter, z, user, tL_messages_hideChatJoinRequest));
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
        gm.c3(new y8c((byte) 27, this, z));
    }

    public void f(String str, boolean z, boolean z2) {
        boolean z3;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.e;
        if (isEmpty) {
            z3 = !arrayList.isEmpty() || z;
            a1b a1bVar = this.n;
            if (a1bVar != null) {
                a1bVar.setVisibility(z3 ? 4 : 0);
            }
            a1b a1bVar2 = this.o;
            if (a1bVar2 != null) {
                a1bVar2.setVisibility(4);
            }
        } else {
            z3 = !this.c.isEmpty() || z;
            a1b a1bVar3 = this.n;
            if (a1bVar3 != null) {
                a1bVar3.setVisibility(4);
            }
            a1b a1bVar4 = this.o;
            if (a1bVar4 != null) {
                a1bVar4.setVisibility(z3 ? 4 : 0);
            }
        }
        k(this.p, z3, true);
        if (arrayList.isEmpty()) {
            a1b a1bVar5 = this.n;
            if (a1bVar5 != null) {
                a1bVar5.setVisibility(0);
            }
            a1b a1bVar6 = this.o;
            if (a1bVar6 != null) {
                a1bVar6.setVisibility(4);
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
        q07 q07Var = this.f;
        if (z) {
            q07Var.E(arrayList3);
            z4 = true;
        } else {
            if (arrayList3.size() > 0) {
                if (tL_messages_chatInviteImporters.importers.size() + arrayList2.size() < tL_messages_chatInviteImporters.count) {
                    z3 = true;
                    if (z3) {
                        q07Var.s(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                    arrayList = tL_messages_chatInviteImporters.importers;
                    x07 x07Var = q07Var.c;
                    ArrayList arrayList4 = x07Var.c;
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
                    q07Var.p((arrayList4.size() + (!x07Var.B ? 1 : 0)) - arrayList.size(), arrayList.size());
                    if (z5) {
                        q07Var.i(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                }
            }
            z3 = false;
            if (z3) {
            }
            arrayList = tL_messages_chatInviteImporters.importers;
            x07 x07Var2 = q07Var.c;
            ArrayList arrayList42 = x07Var2.c;
            i = 0;
            boolean z112 = z3;
            while (i < arrayList.size()) {
            }
            z4 = z9;
            z5 = z112;
            arrayList42.addAll(arrayList);
            q07Var.p((arrayList42.size() + (!x07Var2.B ? 1 : 0)) - arrayList.size(), arrayList.size());
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
                q07Var.i(q07Var.b() - 1);
            } else {
                q07Var.s(q07Var.b());
            }
        }
    }

    public final void h(View view) {
        if (view instanceof l07) {
            if (this.y) {
                gm.t1(this.g.getParentActivity().getCurrentFocus());
            }
            gm.d3(new lj6((Object) this, view, (byte) 20), this.y ? 100L : 0L);
        }
    }

    public final void i(boolean z) {
        int i;
        r59 r59Var = this.p;
        if (r59Var == null || (i = !this.f.c.B ? 1 : 0) < 0 || i >= r59Var.getChildCount()) {
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
        q07 q07Var = this.f;
        if (isEmpty) {
            q07Var.E(this.e);
            k(this.p, true, true);
            k(this.q, false, false);
            a1b a1bVar = this.o;
            if (a1bVar != null) {
                a1bVar.setVisibility(4);
            }
            if (str == null && this.l) {
                this.g.getActionBar().t().j(0).setVisibility(this.e.isEmpty() ? 8 : 0);
            }
        } else {
            q07Var.E(Collections.EMPTY_LIST);
            k(this.p, false, false);
            k(this.q, true, true);
            mp3 mp3Var = Utilities.g;
            o07 o07Var = new o07(this, (byte) 2);
            this.u = o07Var;
            mp3Var.d(o07Var, 300L);
        }
        if (str != null) {
            a1b a1bVar2 = this.n;
            if (a1bVar2 != null) {
                a1bVar2.setVisibility(4);
            }
            a1b a1bVar3 = this.o;
            if (a1bVar3 != null) {
                a1bVar3.setVisibility(4);
            }
        }
    }
}
