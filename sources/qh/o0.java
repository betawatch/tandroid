package qh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import jh.oa;
import nh.zb;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.y80;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class o0 implements rh.d {
    public final Context a;
    public final c6 b;
    public final tc c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f;
    public n0 h;
    public oa i;
    public String k;
    public int l;
    public boolean m;
    public boolean n;
    public long o;
    public int p;
    public c2 q;
    public int r;
    public final a0.h g = new a0.h();
    public ArrayList j = new ArrayList();

    public o0(Context context, c6 c6Var, tc tcVar, int i10, long j10) {
        this.a = context;
        this.b = c6Var;
        this.c = tcVar;
        this.d = i10;
        this.e = j10;
        this.f = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        this.o = MessagesController.getMainSettings(i10).getLong(a4.w.m(j10, "community_requests_last_view_time_"), 0L);
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

    public final void b(u51 u51Var) {
        if (this.m || this.n || u51Var.T2.N0() + 10 <= u51Var.U2.x.size()) {
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
                    boolean z10 = !communityPeerRequest.visible;
                    boolean z11 = i10 < size + (-1);
                    int i11 = rh.f.a;
                    w41 J = w41.J(rh.f.class);
                    J.G = new rh.e(peerDialogId, user, z10);
                    J.H = this;
                    J.j = !z11;
                    arrayList.add(J);
                }
                i10++;
            }
        }
        if (this.n) {
            return;
        }
        arrayList.add(w41.n(29));
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

    public final void f(boolean z10, boolean z11) {
        TextView textView;
        if (this.q == null && this.r == 0) {
            if (z11) {
                c2 P = c5.P(this.a, this.b, LocaleController.getString(z10 ? R.string.CommunityAddAllChatsTitle : R.string.CommunityDeclineAllTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralString(z10 ? "CommunityAddAllChatsMessage" : "CommunityDeclineAllMessage", this.l, new Object[0])), LocaleController.getString(z10 ? R.string.Add : R.string.Decline), new p90(16, this, z10));
                P.show();
                if (z10 || (textView = (TextView) P.d(-1)) == null) {
                    return;
                }
                textView.setTextColor(g6.w0(null, g6.q7, false));
                return;
            }
            oa oaVar = this.i;
            if (oaVar != null) {
                oaVar.run();
            }
            this.i = null;
            c2 c2Var = new c2(this.a, 3, this.b);
            this.q = c2Var;
            c2Var.setOnCancelListener(new zb(this, 3));
            this.q.q(500L);
            this.r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.e, !z10, new l0(this, 0));
        }
    }

    public final void g(long j10, boolean z10) {
        int i10;
        this.g.k(null, j10);
        this.l--;
        a();
        n0 n0Var = this.h;
        if (n0Var != null) {
            n0Var.k();
        }
        int i11 = z10 ? R.string.CommunityRequestApprovedToast : R.string.CommunityRequestDeclinedToast;
        int i12 = this.d;
        int i13 = 0;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, DialogObject.getShortName(i12, j10)));
        oa oaVar = this.i;
        if (oaVar != null) {
            oaVar.run();
        }
        this.i = new oa(this, j10, z10, 6);
        Context context = this.a;
        c6 c6Var = this.b;
        lc lcVar = new lc(context, c6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j10);
        h9 h9Var = lcVar.a;
        if (userOrChat != null) {
            h9Var.setCount(1);
            h9Var.b(0, userOrChat, UserConfig.selectedAccount);
            i10 = 1;
        } else {
            i10 = 0;
        }
        h9Var.setTranslationX(AndroidUtilities.dp(7.0f));
        h9Var.setScaleX(1.333f);
        h9Var.setScaleY(1.333f);
        h9Var.a(false);
        y80 y80Var = lcVar.b;
        y80Var.setSingleLine(false);
        y80Var.setMaxLines(2);
        y80Var.setTextSize(1, 14.0f);
        y80Var.setText(replaceTags);
        if (y80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) y80Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) y80Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            h9Var.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        kc kcVar = new kc(context, c6Var, true, true);
        kcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        kcVar.a = new m0(this, j10, i13);
        kcVar.b = this.i;
        lcVar.setButton(kcVar);
        this.c.b(lcVar, 5000).j();
    }
}
