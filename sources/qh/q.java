package qh;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import i7.f6;
import java.util.WeakHashMap;
import jh.oa;
import nh.t4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.th;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class q extends o2 implements vd.b {
    public final vd.a a;
    public long b;
    public FrameLayout c;
    public u51 d;
    public ug.f e;
    public LinearLayout f;
    public nh.d h;
    public nh.d n;
    public qw0 r;
    public TLRPC.ChatFull s;
    public o0 v;

    public q(Bundle bundle) {
        super(bundle);
        this.a = new vd.a(0, this, jr.h, 320L, false);
    }

    public static void U(q qVar, w41 w41Var) {
        Object obj = w41Var.G;
        if (obj instanceof rh.e) {
            rh.e eVar = (rh.e) obj;
            long j10 = eVar.a;
            TLRPC.Chat chat = MessagesController.getInstance(qVar.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(qVar.currentAccount).getUser(Long.valueOf(j10));
            if (user != null) {
                qVar.presentFragment(tn.R9(user.id));
            } else if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
                qVar.presentFragment(tn.R9(-chat.id));
            } else {
                new sh.b(qVar.getParentActivity(), chat, new org.telegram.ui.web.y(16, qVar, eVar)).show();
            }
        }
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        float f11 = 1.0f - f9;
        this.f.setAlpha(f11);
        this.f.setVisibility(f11 > 0.0f ? 0 : 8);
        this.r.setAlpha(f9);
        this.r.setVisibility(f9 > 0.0f ? 0 : 8);
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        boolean z10 = true;
        z10 = true;
        setHasOwnBackground(true);
        o0 o0Var = new o0(getParentActivity(), this.resourceProvider, tc.a0(this), this.currentAccount, this.b);
        this.v = o0Var;
        o0Var.h = new o1.a(this, 17);
        o0Var.d();
        this.v.e();
        final int i10 = 0;
        th.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new e(this, 2));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i11 = g6.a7;
        frameLayout.setBackgroundColor(g6.w0(null, i11, false));
        u51 u51Var = new u51(this, new t4(this, 14), new o(this), new o(this));
        this.d = u51Var;
        u51Var.setClipToPadding(false);
        u51 u51Var2 = this.d;
        u51Var2.U2.r = false;
        u51Var2.p1();
        this.d.j(new h00(this, 16));
        this.actionBar.setAdaptiveBackground(this.d);
        this.c.addView(this.d, f6.c(-1.0f, -1));
        ug.f fVar = new ug.f(context);
        this.e = fVar;
        fVar.setupColorKey(i11);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.c.addView(this.e, f6.g());
        this.c.addView(this.actionBar, f6.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(0);
        this.f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        nh.d dVar = new nh.d(context, this.resourceProvider, true);
        this.n = dVar;
        dVar.d();
        this.n.setColor(i0.a.d(0.125f, getThemedColor(g6.d6), getThemedColor(g6.G6)));
        this.n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.n.e();
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: qh.p
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.v.f(false, true);
                        break;
                    default:
                        this.b.v.f(true, true);
                        break;
                }
            }
        });
        this.f.addView(this.n, f6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        nh.d dVar2 = new nh.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        nh.d dVar3 = this.h;
        final int i12 = z10 ? 1 : 0;
        dVar3.setOnClickListener(new View.OnClickListener(this) { // from class: qh.p
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.v.f(false, true);
                        break;
                    default:
                        this.b.v.f(true, true);
                        break;
                }
            }
        });
        this.f.addView(this.h, f6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(this.f, f6.e(-1, -2, 80));
        qw0 qw0Var = new qw0(getParentActivity(), null, 16, this.resourceProvider);
        this.r = qw0Var;
        qw0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.r.setAnimateLayoutChange(true);
        this.r.setVisibility(8);
        this.c.addView(this.r, f6.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.c;
        o oVar = new o(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(frameLayout2, oVar);
        setBulletinDelegate(new eg.x(16));
        FrameLayout frameLayout3 = this.c;
        this.fragmentView = frameLayout3;
        return frameLayout3;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.b));
        this.s = getMessagesController().getChatFull(this.b);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        o0 o0Var = this.v;
        oa oaVar = o0Var.i;
        if (oaVar != null) {
            oaVar.run();
        }
        o0Var.i = null;
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
