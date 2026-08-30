package sh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import lh.pa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.z4;
import ph.wa;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class o0 implements th.d {
    public final Context a;
    public final f6 b;
    public final qc c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f;
    public n0 h;
    public pa i;
    public String k;
    public int l;
    public boolean m;
    public boolean n;
    public long o;
    public int p;
    public d2 q;
    public int r;
    public final a0.h g = new a0.h();
    public ArrayList j = new ArrayList();

    public o0(Context context, f6 f6Var, qc qcVar, int i10, long j10) {
        this.a = context;
        this.b = f6Var;
        this.c = qcVar;
        this.d = i10;
        this.e = j10;
        this.f = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        this.o = MessagesController.getMainSettings(i10).getLong(android.support.v4.media.a.n(j10, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        this.p = 0;
        ArrayList arrayList = this.j;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.j.get(i10)).peer))) {
                if (r2.date <= this.o) {
                    return;
                } else {
                    this.p++;
                }
            }
        }
    }

    public final void b(g61 g61Var) {
        if (this.m || this.n || g61Var.U2.N0() + 10 <= g61Var.V2.x.size()) {
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
                long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                a0.h hVar = this.g;
                if (hVar == null || !hVar.d(peerDialogId)) {
                    TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                    boolean z4 = !communityPeerRequest.visible;
                    boolean z10 = i10 < size + (-1);
                    int i11 = th.f.a;
                    i51 J = i51.J(th.f.class);
                    J.G = new th.e(peerDialogId, user, z4);
                    J.H = this;
                    J.j = !z10;
                    arrayList.add(J);
                }
                i10++;
            }
        }
        if (this.n) {
            return;
        }
        arrayList.add(i51.n(29));
    }

    public final void d() {
        if (this.m || this.n || !ChatObject.canUserDoAdminAction(this.f, 27)) {
            return;
        }
        this.m = true;
        MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.e, this.k, new l0(this, 1));
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z4, boolean z10) {
        TextView textView;
        if (this.q == null && this.r == 0) {
            if (z10) {
                d2 P = z4.P(this.a, this.b, LocaleController.getString(z4 ? R.string.CommunityAddAllChatsTitle : R.string.CommunityDeclineAllTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralString(z4 ? "CommunityAddAllChatsMessage" : "CommunityDeclineAllMessage", this.l, new Object[0])), LocaleController.getString(z4 ? R.string.Add : R.string.Decline), new kv0(16, this, z4));
                P.show();
                if (z4 || (textView = (TextView) P.d(-1)) == null) {
                    return;
                }
                textView.setTextColor(j6.w0(null, j6.q7, false));
                return;
            }
            pa paVar = this.i;
            if (paVar != null) {
                paVar.run();
            }
            this.i = null;
            d2 d2Var = new d2(this.a, 3, this.b);
            this.q = d2Var;
            d2Var.setOnCancelListener(new wa(this, 3));
            this.q.q(500L);
            this.r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.e, !z4, new l0(this, 0));
        }
    }

    public final void g(long j10, boolean z4) {
        int i10;
        this.g.k(null, j10);
        this.l--;
        a();
        n0 n0Var = this.h;
        if (n0Var != null) {
            n0Var.d();
        }
        int i11 = z4 ? R.string.CommunityRequestApprovedToast : R.string.CommunityRequestDeclinedToast;
        int i12 = this.d;
        int i13 = 0;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, DialogObject.getShortName(i12, j10)));
        pa paVar = this.i;
        if (paVar != null) {
            paVar.run();
        }
        this.i = new pa(this, j10, z4, 6);
        Context context = this.a;
        f6 f6Var = this.b;
        hc hcVar = new hc(context, f6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j10);
        d9 d9Var = hcVar.a;
        if (userOrChat != null) {
            d9Var.setCount(1);
            d9Var.b(0, userOrChat, UserConfig.selectedAccount);
            i10 = 1;
        } else {
            i10 = 0;
        }
        d9Var.setTranslationX(AndroidUtilities.dp(7.0f));
        d9Var.setScaleX(1.333f);
        d9Var.setScaleY(1.333f);
        d9Var.a(false);
        e90 e90Var = hcVar.b;
        e90Var.setSingleLine(false);
        e90Var.setMaxLines(2);
        e90Var.setTextSize(1, 14.0f);
        e90Var.setText(replaceTags);
        if (e90Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) e90Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) e90Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            d9Var.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        gc gcVar = new gc(context, f6Var, true, true);
        gcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        gcVar.a = new m0(this, j10, i13);
        gcVar.b = this.i;
        hcVar.setButton(gcVar);
        this.c.b(hcVar, 5000).j();
    }
}
