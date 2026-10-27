package yh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import jg.n0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MemberRequestsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.k5;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.nm0;
import vi.k0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public abstract class k implements j5 {
    public final boolean a;
    public boolean b;
    public final r2 g;
    public final FrameLayout h;
    public final MemberRequestsController i;
    public final long j;
    public final int k;
    public final boolean l;
    public FrameLayout m;
    public fy0 n;
    public fy0 o;
    public nm0 p;
    public c10 q;
    public TLRPC.TL_chatInviteImporter r;
    public j s;
    public String t;
    public e u;
    public int v;
    public boolean w;
    public boolean y;
    public boolean z;
    public final ArrayList c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final f f = new f(this);
    public boolean x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final ml D = new ml(this, 27);

    public k(r2 r2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.g = r2Var;
        this.h = frameLayout;
        this.j = j10;
        int currentAccount = r2Var.getCurrentAccount();
        this.k = currentAccount;
        this.a = ChatObject.isChannelAndNotMegaGroup(j10, currentAccount);
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

    public final fy0 a() {
        if (this.n == null) {
            r2 r2Var = this.g;
            fy0 fy0Var = new fy0(r2Var.getParentActivity(), null, 16, r2Var.getResourceProvider());
            this.n = fy0Var;
            boolean z10 = this.a;
            fy0Var.d.setText(LocaleController.getString(z10 ? R.string.NoSubscribeRequests : R.string.NoMemberRequests));
            this.n.e.setText(LocaleController.getString(z10 ? R.string.NoSubscribeRequestsDescription : R.string.NoMemberRequestsDescription));
            this.n.setAnimateLayoutChange(true);
            this.n.setVisibility(8);
        }
        return this.n;
    }

    public final c10 b() {
        if (this.q == null) {
            r2 r2Var = this.g;
            c10 c10Var = new c10(r2Var.getParentActivity(), r2Var.getResourceProvider());
            this.q = c10Var;
            c10Var.setAlpha(0.0f);
            if (this.B) {
                f7.i(y6.d6, this.q, r2Var.getResourceProvider());
            }
            this.q.e(y6.d6, y6.a7, -1);
            this.q.setViewType(15);
            this.q.setMemberRequestButton(this.a);
        }
        return this.q;
    }

    public final fy0 c() {
        if (this.o == null) {
            r2 r2Var = this.g;
            fy0 fy0Var = new fy0(r2Var.getParentActivity(), null, 1, r2Var.getResourceProvider());
            this.o = fy0Var;
            if (this.B) {
                f7.i(y6.d6, fy0Var, r2Var.getResourceProvider());
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
        AndroidUtilities.runOnUIThread(new d60(21, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.e;
        if (isEmpty) {
            z12 = !arrayList.isEmpty() || z10;
            fy0 fy0Var = this.n;
            if (fy0Var != null) {
                fy0Var.setVisibility(z12 ? 4 : 0);
            }
            fy0 fy0Var2 = this.o;
            if (fy0Var2 != null) {
                fy0Var2.setVisibility(4);
            }
        } else {
            z12 = !this.c.isEmpty() || z10;
            fy0 fy0Var3 = this.n;
            if (fy0Var3 != null) {
                fy0Var3.setVisibility(4);
            }
            fy0 fy0Var4 = this.o;
            if (fy0Var4 != null) {
                fy0Var4.setVisibility(z12 ? 4 : 0);
            }
        }
        k(this.p, z12, true);
        if (arrayList.isEmpty()) {
            fy0 fy0Var5 = this.n;
            if (fy0Var5 != null) {
                fy0Var5.setVisibility(0);
            }
            fy0 fy0Var6 = this.o;
            if (fy0Var6 != null) {
                fy0Var6.setVisibility(4);
            }
            k(this.q, false, false);
            if (this.y && this.l) {
                this.g.getActionBar().l().i(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters, String str, boolean z10, boolean z11) {
        boolean z12;
        ArrayList<TLRPC.TL_chatInviteImporter> arrayList;
        int i10;
        boolean z13;
        boolean z14;
        boolean z15;
        ArrayList arrayList2 = this.c;
        boolean z16 = true;
        boolean z17 = !arrayList2.isEmpty() && this.x;
        for (int i11 = 0; i11 < tL_messages_chatInviteImporters.users.size(); i11++) {
            TLRPC.User user = tL_messages_chatInviteImporters.users.get(i11);
            this.d.put(user.id, user);
        }
        f fVar = this.f;
        if (z10) {
            fVar.E(tL_messages_chatInviteImporters.importers);
            z13 = true;
        } else {
            if (tL_messages_chatInviteImporters.importers.size() > 0) {
                if (tL_messages_chatInviteImporters.importers.size() + arrayList2.size() < tL_messages_chatInviteImporters.count) {
                    z12 = true;
                    if (z12) {
                        fVar.u(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                    arrayList = tL_messages_chatInviteImporters.importers;
                    k kVar = fVar.c;
                    ArrayList arrayList3 = kVar.c;
                    i10 = 0;
                    while (i10 < arrayList.size()) {
                        long j10 = arrayList.get(i10).user_id;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= arrayList3.size()) {
                                z14 = z16;
                                break;
                            }
                            z14 = z16;
                            if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i12)).user_id == j10) {
                                arrayList.remove(i10);
                                i10--;
                                break;
                            } else {
                                i12++;
                                z16 = z14;
                            }
                        }
                        i10++;
                        z16 = z14;
                    }
                    z13 = z16;
                    arrayList3.addAll(arrayList);
                    fVar.s((arrayList3.size() + (!kVar.B ? 1 : 0)) - arrayList.size(), arrayList.size());
                    if (z12) {
                        fVar.o(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                }
            }
            z12 = false;
            if (z12) {
            }
            arrayList = tL_messages_chatInviteImporters.importers;
            k kVar2 = fVar.c;
            ArrayList arrayList32 = kVar2.c;
            i10 = 0;
            while (i10 < arrayList.size()) {
            }
            z13 = z16;
            arrayList32.addAll(arrayList);
            fVar.s((arrayList32.size() + (!kVar2.B ? 1 : 0)) - arrayList.size(), arrayList.size());
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
                z15 = false;
                this.g.getActionBar().l().j(0).setVisibility(arrayList4.isEmpty() ? 8 : 0);
                f(str, z11, z15);
                this.x = arrayList2.size() >= tL_messages_chatInviteImporters.count ? z13 : z15;
                if (z17 == ((arrayList2.isEmpty() && this.x) ? z13 : z15)) {
                    if (this.x) {
                        fVar.o(fVar.h() - 1);
                        return;
                    } else {
                        fVar.u(fVar.h());
                        return;
                    }
                }
                return;
            }
        }
        z15 = false;
        f(str, z11, z15);
        this.x = arrayList2.size() >= tL_messages_chatInviteImporters.count ? z13 : z15;
        if (z17 == ((arrayList2.isEmpty() && this.x) ? z13 : z15)) {
        }
    }

    public final void h(View view) {
        if (view instanceof k5) {
            if (this.y) {
                AndroidUtilities.hideKeyboard(this.g.getParentActivity().getCurrentFocus());
            }
            AndroidUtilities.runOnUIThread(new k0(7, this, (k5) view), this.y ? 100L : 0L);
        }
    }

    public final void i(boolean z10) {
        int i10;
        nm0 nm0Var = this.p;
        if (nm0Var == null || (i10 = !this.f.c.B ? 1 : 0) < 0 || i10 >= nm0Var.getChildCount()) {
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
            fy0 fy0Var = this.o;
            if (fy0Var != null) {
                fy0Var.setVisibility(4);
            }
            if (str == null && this.l) {
                this.g.getActionBar().l().j(0).setVisibility(this.e.isEmpty() ? 8 : 0);
            }
        } else {
            this.f.E(Collections.EMPTY_LIST);
            k(this.p, false, false);
            k(this.q, true, true);
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.u = eVar;
            dispatchQueue2.postRunnable(eVar, 300L);
        }
        if (str != null) {
            fy0 fy0Var2 = this.n;
            if (fy0Var2 != null) {
                fy0Var2.setVisibility(4);
            }
            fy0 fy0Var3 = this.o;
            if (fy0Var3 != null) {
                fy0Var3.setVisibility(4);
            }
        }
    }
}
