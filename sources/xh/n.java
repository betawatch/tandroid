package xh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import ig.n0;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MemberRequestsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.xw0;
import ug.r;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class n implements e5 {
    public final boolean a;
    public boolean b;
    public final n2 g;
    public final FrameLayout h;
    public final MemberRequestsController i;
    public final long j;
    public final int k;
    public final boolean l;
    public FrameLayout m;
    public xw0 n;
    public xw0 o;
    public ll0 p;
    public t00 q;
    public TLRPC.TL_chatInviteImporter r;
    public m s;
    public String t;
    public e u;
    public int v;
    public boolean w;
    public boolean y;
    public boolean z;
    public final ArrayList c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final g f = new g(this);
    public boolean x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final lb0 D = new lb0(this, 15);

    public n(n2 n2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.g = n2Var;
        this.h = frameLayout;
        this.j = j3;
        int currentAccount = n2Var.getCurrentAccount();
        this.k = currentAccount;
        this.a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.l = z10;
        this.i = MemberRequestsController.getInstance(currentAccount);
    }

    public static void k(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        boolean z12 = view.getVisibility() == 0;
        float f7 = z10 ? 1.0f : 0.0f;
        if (z10 == z12 && f7 == view.getAlpha()) {
            return;
        }
        if (!z11) {
            view.setVisibility(z10 ? 0 : 4);
            return;
        }
        if (z10) {
            view.setAlpha(0.0f);
        }
        view.setVisibility(0);
        view.animate().alpha(f7).setDuration(150L).start();
    }

    public final xw0 a() {
        if (this.n == null) {
            n2 n2Var = this.g;
            xw0 xw0Var = new xw0(n2Var.getParentActivity(), null, 16, n2Var.getResourceProvider());
            this.n = xw0Var;
            boolean z10 = this.a;
            xw0Var.d.setText(LocaleController.getString(z10 ? R.string.NoSubscribeRequests : R.string.NoMemberRequests));
            this.n.e.setText(LocaleController.getString(z10 ? R.string.NoSubscribeRequestsDescription : R.string.NoMemberRequestsDescription));
            this.n.setAnimateLayoutChange(true);
            this.n.setVisibility(8);
        }
        return this.n;
    }

    public final t00 b() {
        if (this.q == null) {
            n2 n2Var = this.g;
            t00 t00Var = new t00(n2Var.getParentActivity(), n2Var.getResourceProvider());
            this.q = t00Var;
            t00Var.setAlpha(0.0f);
            if (this.B) {
                this.q.setBackgroundColor(j6.v0(j6.d6, n2Var.getResourceProvider()));
            }
            this.q.f(j6.d6, j6.a7, -1);
            this.q.setViewType(15);
            this.q.setMemberRequestButton(this.a);
        }
        return this.q;
    }

    public final xw0 c() {
        if (this.o == null) {
            n2 n2Var = this.g;
            xw0 xw0Var = new xw0(n2Var.getParentActivity(), null, 1, n2Var.getResourceProvider());
            this.o = xw0Var;
            if (this.B) {
                xw0Var.setBackgroundColor(j6.v0(j6.d6, n2Var.getResourceProvider()));
            }
            this.o.d.setText(LocaleController.getString(R.string.NoResult));
            this.o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.o.setAnimateLayoutChange(true);
            this.o.setVisibility(8);
        }
        return this.o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new n0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.i.getCachedImporters(this.j)) != null) {
            this.z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new mr0(13, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.e;
        if (isEmpty) {
            z12 = !arrayList.isEmpty() || z10;
            xw0 xw0Var = this.n;
            if (xw0Var != null) {
                xw0Var.setVisibility(z12 ? 4 : 0);
            }
            xw0 xw0Var2 = this.o;
            if (xw0Var2 != null) {
                xw0Var2.setVisibility(4);
            }
        } else {
            z12 = !this.c.isEmpty() || z10;
            xw0 xw0Var3 = this.n;
            if (xw0Var3 != null) {
                xw0Var3.setVisibility(4);
            }
            xw0 xw0Var4 = this.o;
            if (xw0Var4 != null) {
                xw0Var4.setVisibility(z12 ? 4 : 0);
            }
        }
        k(this.p, z12, true);
        if (arrayList.isEmpty()) {
            xw0 xw0Var5 = this.n;
            if (xw0Var5 != null) {
                xw0Var5.setVisibility(0);
            }
            xw0 xw0Var6 = this.o;
            if (xw0Var6 != null) {
                xw0Var6.setVisibility(4);
            }
            k(this.q, false, false);
            if (this.y && this.l) {
                this.g.getActionBar().n().j(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters, String str, boolean z10, boolean z11) {
        boolean z12;
        ArrayList<TLRPC.TL_chatInviteImporter> arrayList;
        int i10;
        boolean z13;
        ArrayList arrayList2 = this.c;
        boolean z14 = !arrayList2.isEmpty() && this.x;
        for (int i11 = 0; i11 < tL_messages_chatInviteImporters.users.size(); i11++) {
            TLRPC.User user = tL_messages_chatInviteImporters.users.get(i11);
            this.d.put(user.id, user);
        }
        g gVar = this.f;
        if (z10) {
            gVar.E(tL_messages_chatInviteImporters.importers);
        } else {
            if (tL_messages_chatInviteImporters.importers.size() > 0) {
                if (tL_messages_chatInviteImporters.importers.size() + arrayList2.size() < tL_messages_chatInviteImporters.count) {
                    z12 = true;
                    if (z12) {
                        gVar.u(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                    arrayList = tL_messages_chatInviteImporters.importers;
                    n nVar = gVar.c;
                    ArrayList arrayList3 = nVar.c;
                    i10 = 0;
                    while (i10 < arrayList.size()) {
                        long j3 = arrayList.get(i10).user_id;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= arrayList3.size()) {
                                break;
                            }
                            if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i12)).user_id == j3) {
                                arrayList.remove(i10);
                                i10--;
                                break;
                            }
                            i12++;
                        }
                        i10++;
                    }
                    arrayList3.addAll(arrayList);
                    gVar.s((arrayList3.size() + (!nVar.B ? 1 : 0)) - arrayList.size(), arrayList.size());
                    if (z12) {
                        gVar.o(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                }
            }
            z12 = false;
            if (z12) {
            }
            arrayList = tL_messages_chatInviteImporters.importers;
            n nVar2 = gVar.c;
            ArrayList arrayList32 = nVar2.c;
            i10 = 0;
            while (i10 < arrayList.size()) {
            }
            arrayList32.addAll(arrayList);
            gVar.s((arrayList32.size() + (!nVar2.B ? 1 : 0)) - arrayList.size(), arrayList.size());
            if (z12) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList4 = this.e;
            if (z10) {
                arrayList4.clear();
            }
            arrayList4.addAll(tL_messages_chatInviteImporters.importers);
            if (this.l) {
                z13 = false;
                this.g.getActionBar().n().k(0).setVisibility(arrayList4.isEmpty() ? 8 : 0);
                f(str, z11, z13);
                this.x = arrayList2.size() >= tL_messages_chatInviteImporters.count;
                if (z14 == (arrayList2.isEmpty() && this.x)) {
                    if (this.x) {
                        gVar.o(gVar.h() - 1);
                        return;
                    } else {
                        gVar.u(gVar.h());
                        return;
                    }
                }
                return;
            }
        }
        z13 = false;
        f(str, z11, z13);
        this.x = arrayList2.size() >= tL_messages_chatInviteImporters.count;
        if (z14 == (arrayList2.isEmpty() && this.x)) {
        }
    }

    public final void h(View view) {
        if (view instanceof f5) {
            if (this.y) {
                AndroidUtilities.hideKeyboard(this.g.getParentActivity().getCurrentFocus());
            }
            AndroidUtilities.runOnUIThread(new r(8, this, (f5) view), this.y ? 100L : 0L);
        }
    }

    public final void i(boolean z10) {
        int i10;
        ll0 ll0Var = this.p;
        if (ll0Var == null || (i10 = !this.f.c.B ? 1 : 0) < 0 || i10 >= ll0Var.getChildCount()) {
            return;
        }
        this.p.getChildAt(i10).setEnabled(z10);
    }

    public final void j(String str) {
        if (this.u != null) {
            Utilities.searchQueue.cancelRunnable(this.u);
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
        if (TextUtils.isEmpty(str)) {
            this.f.E(this.e);
            k(this.p, true, true);
            k(this.q, false, false);
            xw0 xw0Var = this.o;
            if (xw0Var != null) {
                xw0Var.setVisibility(4);
            }
            if (str == null && this.l) {
                this.g.getActionBar().n().k(0).setVisibility(this.e.isEmpty() ? 8 : 0);
            }
        } else {
            this.f.E(Collections.EMPTY_LIST);
            k(this.p, false, false);
            k(this.q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            xw0 xw0Var2 = this.n;
            if (xw0Var2 != null) {
                xw0Var2.setVisibility(4);
            }
            xw0 xw0Var3 = this.o;
            if (xw0Var3 != null) {
                xw0Var3.setVisibility(4);
            }
        }
    }
}
