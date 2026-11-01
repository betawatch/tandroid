package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.a4;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i0;
import org.telegram.messenger.lt;
import org.telegram.messenger.o5;
import org.telegram.messenger.s9;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vb;
import org.telegram.ui.xv0;
import vh.q8;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class d0 implements zh.e {
    public final Context a;
    public final p6 b;
    public final cc c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f;
    public c0 h;
    public lt i;
    public String k;
    public int l;
    public boolean m;
    public boolean n;
    public long o;
    public int p;
    public x1 q;
    public int r;
    public final a0.h g = new a0.h();
    public ArrayList j = new ArrayList();

    public d0(Context context, p6 p6Var, cc ccVar, int i10, long j10) {
        this.a = context;
        this.b = p6Var;
        this.c = ccVar;
        this.d = i10;
        this.e = j10;
        this.f = wp.r1(i10).L0(Long.valueOf(j10));
        this.o = wp.r1(i10).f7.getLong(a1.g.l(j10, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        this.p = 0;
        ArrayList arrayList = this.j;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.g.d(o5.o(((TL_communities.CommunityPeerRequest) this.j.get(i10)).peer))) {
                if (r2.date <= this.o) {
                    return;
                } else {
                    this.p++;
                }
            }
        }
    }

    public final void b(v51 v51Var) {
        if (this.m || this.n || v51Var.e3.N0() + 10 <= v51Var.f3.D.size()) {
            return;
        }
        d();
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = this.j;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = this.j;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size = arrayList3.size();
            int i10 = 0;
            while (i10 < size) {
                TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                long o10 = o5.o(communityPeerRequest.peer);
                a0.h hVar = this.g;
                if (hVar == null || !hVar.d(o10)) {
                    TLRPC.User Z1 = wp.r1(this.d).Z1(Long.valueOf(communityPeerRequest.requested_by));
                    boolean z10 = !communityPeerRequest.visible;
                    boolean z11 = i10 < size + (-1);
                    int i11 = zh.g.b;
                    b51 K = b51.K(zh.g.class);
                    K.G = new zh.f(o10, Z1, z10);
                    K.H = this;
                    K.j = !z11;
                    arrayList.add(K);
                }
                i10++;
            }
        }
        if (this.n) {
            return;
        }
        arrayList.add(b51.p(29));
    }

    public final void d() {
        if (this.m || this.n || !w3.y(27, this.f)) {
            return;
        }
        this.m = true;
        wp r12 = wp.r1(this.d);
        String str = this.k;
        b0 b0Var = new b0(this, 1);
        TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
        tL_communities_getPeerLinkRequests.community = r12.g1(this.e);
        tL_communities_getPeerLinkRequests.offset = str;
        tL_communities_getPeerLinkRequests.limit = 100;
        r12.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new a3.b(1), new a4(2, r12, b0Var));
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.o = currentTime;
        wp.r1(i10).f7.edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        TextView textView;
        if (this.q == null && this.r == 0) {
            int i10 = 0;
            if (z11) {
                x1 O = s4.O(this.a, this.b, dd.L0(z10 ? 2131751983 : 2131751935, null), i0.W2(dd.G(this.l, z10 ? "CommunityAddAllChatsMessage" : "CommunityDeclineAllMessage", new Object[0])), dd.L0(z10 ? 2131754486 : 2131751605, null), new xv0(16, this, z10));
                O.show();
                if (z10 || (textView = (TextView) O.d(-1)) == null) {
                    return;
                }
                a7.V(textView, t6.q7, null);
                return;
            }
            lt ltVar = this.i;
            if (ltVar != null) {
                ltVar.run();
            }
            this.i = null;
            x1 x1Var = new x1(3, this.a, this.b);
            this.q = x1Var;
            x1Var.setOnCancelListener(new eg.k(this, 4));
            this.q.r(500L);
            wp r12 = wp.r1(this.d);
            b0 b0Var = new b0(this, i10);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j10 = this.e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = r12.g1(j10);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z10;
            this.r = r12.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new a3.b(1), new s9(r12, j10, b0Var, 1));
        }
    }

    public final void g(long j10, boolean z10) {
        int i10;
        this.g.k(null, j10);
        this.l--;
        a();
        c0 c0Var = this.h;
        if (c0Var != null) {
            c0Var.b();
        }
        int i11 = z10 ? 2131751880 : 2131751879;
        int i12 = this.d;
        SpannableStringBuilder W2 = i0.W2(dd.a0(null, null, i11, o5.s(i12, j10)));
        lt ltVar = this.i;
        if (ltVar != null) {
            ltVar.run();
        }
        this.i = new lt(this, j10, z10, 4);
        Context context = this.a;
        p6 p6Var = this.b;
        vb vbVar = new vb(context, p6Var, false);
        TLObject d22 = wp.r1(i12).d2(j10);
        u8 u8Var = vbVar.a;
        if (d22 != null) {
            u8Var.setCount(1);
            u8Var.b(0, e20.s0, d22);
            i10 = 1;
        } else {
            i10 = 0;
        }
        u8Var.setTranslationX(i0.L(7.0f));
        u8Var.setScaleX(1.333f);
        u8Var.setScaleY(1.333f);
        u8Var.a(false);
        p80 p80Var = vbVar.b;
        p80Var.setSingleLine(false);
        int i13 = 2;
        p80Var.setMaxLines(2);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setText(W2);
        if (p80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = i0.L(74 - ((3 - i10) * 12));
            if (dd.X) {
                ((ViewGroup.MarginLayoutParams) p80Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) p80Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (dd.X) {
            u8Var.setTranslationX(i0.L(32 - ((i10 - 1) * 12)));
        }
        ub ubVar = new ub(context, p6Var, true, true);
        ubVar.e(dd.L0(2131743910, null));
        ubVar.b = new q8(this, j10, i13);
        ubVar.c = this.i;
        vbVar.setButton(ubVar);
        this.c.b(vbVar, 5000).j();
    }
}
