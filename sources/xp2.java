// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xp2 implements uo2 {
    public final Context a;
    public final ylb b;
    public final c41 c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f;
    public wp2 h;
    public vp2 i;
    public String k;
    public int l;
    public boolean m;
    public boolean n;
    public long o;
    public int p;
    public he q;
    public int r;
    public final vh6 g = new vh6();
    public final ArrayList j = new ArrayList();

    public xp2(Context context, ylb ylbVar, c41 c41Var, int i, long j) {
        this.a = context;
        this.b = ylbVar;
        this.c = c41Var;
        this.d = i;
        this.e = j;
        this.f = oc7.r1(i).L0(Long.valueOf(j));
        this.o = oc7.r1(i).X3.getLong(kt6.n(j, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        this.p = 0;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!this.g.d(pg3.n(((TL_communities.CommunityPeerRequest) arrayList.get(i)).peer))) {
                if (r3.date <= this.o) {
                    return;
                } else {
                    this.p++;
                }
            }
        }
    }

    public final void b(q7c q7cVar) {
        if (this.m || this.n || q7cVar.f3.M0() + 10 <= q7cVar.g3.E.size()) {
            return;
        }
        d();
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = this.j;
        if (arrayList2.isEmpty()) {
            return;
        }
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList2.get(i);
                long n = pg3.n(communityPeerRequest.peer);
                if (!this.g.d(n)) {
                    TLRPC.User W1 = oc7.r1(this.d).W1(Long.valueOf(communityPeerRequest.requested_by));
                    boolean z = !communityPeerRequest.visible;
                    boolean z2 = i < size + (-1);
                    int i2 = wo2.b;
                    c6c K = c6c.K(wo2.class);
                    K.H = new vo2(n, W1, z);
                    K.I = this;
                    K.j = !z2;
                    arrayList.add(K);
                }
                i++;
            }
        }
        if (this.n) {
            return;
        }
        arrayList.add(c6c.p(29));
    }

    public final void d() {
        if (this.m || this.n || !sd2.y(27, this.f)) {
            return;
        }
        this.m = true;
        oc7 r1 = oc7.r1(this.d);
        String str = this.k;
        up2 up2Var = new up2(this, (byte) 1);
        TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
        tL_communities_getPeerLinkRequests.community = r1.g1(this.e);
        tL_communities_getPeerLinkRequests.offset = str;
        tL_communities_getPeerLinkRequests.limit = 100;
        r1.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new kc((byte) 0), new s87(r1, up2Var, (byte) 2));
    }

    public final void e() {
        int i = this.d;
        long currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        this.o = currentTime;
        oc7.r1(i).X3.edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z, boolean z2) {
        TextView textView;
        if (this.q == null && this.r == 0) {
            byte b = 0;
            if (z2) {
                he M = ik.M(this.a, this.b, jb6.M0(z ? 2131751920 : 2131751872, null), gm.S2(jb6.G(this.l, z ? "CommunityAddAllChatsMessage" : "CommunityDeclineAllMessage", new Object[0])), jb6.M0(z ? 2131754483 : 2131751541, null), new y8c((byte) 13, this, z));
                M.show();
                if (z || (textView = (TextView) M.c(-1)) == null) {
                    return;
                }
                anb.X(textView, cmb.p7, null);
                return;
            }
            vp2 vp2Var = this.i;
            if (vp2Var != null) {
                vp2Var.run();
            }
            this.i = null;
            he heVar = new he(3, this.b, this.a);
            this.q = heVar;
            heVar.setOnCancelListener(new ct0(this, (byte) 7));
            this.q.q(500L);
            oc7 r1 = oc7.r1(this.d);
            up2 up2Var = new up2(this, b);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j = this.e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = r1.g1(j);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z;
            this.r = r1.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new kc((byte) 0), new fv4((Object) r1, j, (Object) up2Var, (byte) 2));
        }
    }

    public final void g(long j, boolean z) {
        int i;
        this.g.k(null, j);
        this.l--;
        a();
        wp2 wp2Var = this.h;
        if (wp2Var != null) {
            wp2Var.U();
        }
        int i2 = z ? 2131751817 : 2131751816;
        int i3 = this.d;
        SpannableStringBuilder S2 = gm.S2(jb6.a0(null, null, i2, pg3.r(i3, j)));
        vp2 vp2Var = this.i;
        if (vp2Var != null) {
            vp2Var.run();
        }
        this.i = new vp2((Object) this, j, z, (byte) 0);
        ylb ylbVar = this.b;
        Context context = this.a;
        t31 t31Var = new t31(ylbVar, context, false);
        TLObject a2 = oc7.r1(i3).a2(j);
        hd0 hd0Var = t31Var.a;
        if (a2 != null) {
            hd0Var.setCount(1);
            hd0Var.b(0, z8c.t0, a2);
            i = 1;
        } else {
            i = 0;
        }
        hd0Var.setTranslationX(gm.L(7.0f));
        hd0Var.setScaleX(1.333f);
        hd0Var.setScaleY(1.333f);
        hd0Var.a(false);
        l66 l66Var = t31Var.b;
        l66Var.setSingleLine(false);
        l66Var.setMaxLines(2);
        l66Var.setTextSize(1, 14.0f);
        l66Var.setText(S2);
        if (l66Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = gm.L(74 - ((3 - i) * 12));
            if (jb6.a0) {
                ((ViewGroup.MarginLayoutParams) l66Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) l66Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (jb6.a0) {
            hd0Var.setTranslationX(gm.L(32 - ((i - 1) * 12)));
        }
        s31 s31Var = new s31(ylbVar, context, true, true);
        s31Var.e(jb6.M0(2131743572, null));
        s31Var.b = new fu((Object) this, j, (byte) 11);
        s31Var.c = this.i;
        t31Var.setButton(s31Var);
        this.c.b(t31Var, 5000).j();
    }
}
