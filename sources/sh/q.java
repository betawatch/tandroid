package sh;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import k7.b6;
import lh.pa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.ai;
import org.telegram.ui.zn;
import ph.d4;
import ph.e6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class q extends p2 implements xd.b {
    public final xd.a a;
    public long b;
    public FrameLayout c;
    public g61 d;
    public wg.f e;
    public LinearLayout f;
    public ph.d h;
    public ph.d n;
    public zw0 r;
    public TLRPC.ChatFull s;
    public n0 v;

    public q(Bundle bundle) {
        super(bundle);
        this.a = new xd.a(0, this, mr.h, 320L, false);
    }

    public static void U(q qVar, i51 i51Var) {
        Object obj = i51Var.G;
        if (obj instanceof th.e) {
            th.e eVar = (th.e) obj;
            long j10 = eVar.a;
            TLRPC.Chat chat = MessagesController.getInstance(qVar.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(qVar.currentAccount).getUser(Long.valueOf(j10));
            if (user != null) {
                qVar.presentFragment(zn.R9(user.id));
            } else if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
                qVar.presentFragment(zn.R9(-chat.id));
            } else {
                new uh.b(qVar.getParentActivity(), chat, new e6(20, qVar, eVar)).show();
            }
        }
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        float f12 = 1.0f - f10;
        this.f.setAlpha(f12);
        this.f.setVisibility(f12 > 0.0f ? 0 : 8);
        this.r.setAlpha(f10);
        this.r.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        boolean z4 = true;
        z4 = true;
        setHasOwnBackground(true);
        n0 n0Var = new n0(getParentActivity(), this.resourceProvider, qc.a0(this), this.currentAccount, this.b);
        this.v = n0Var;
        n0Var.h = new tp0(this, 14);
        n0Var.d();
        this.v.e();
        final int i10 = 0;
        ai.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new e(this, 2));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i11 = j6.a7;
        frameLayout.setBackgroundColor(j6.w0(null, i11, false));
        g61 g61Var = new g61(this, new d4(this, 14), new o(this), new o(this));
        this.d = g61Var;
        g61Var.setClipToPadding(false);
        g61 g61Var2 = this.d;
        g61Var2.V2.r = false;
        g61Var2.o1();
        this.d.j(new mb0(this, 16));
        this.actionBar.setAdaptiveBackground(this.d);
        this.c.addView(this.d, b6.c(-1.0f, -1));
        wg.f fVar = new wg.f(context);
        this.e = fVar;
        fVar.setupColorKey(i11);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.c.addView(this.e, b6.g());
        this.c.addView(this.actionBar, b6.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(0);
        this.f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ph.d dVar = new ph.d(context, this.resourceProvider, true);
        this.n = dVar;
        dVar.d();
        this.n.setColor(i0.a.d(0.125f, getThemedColor(j6.d6), getThemedColor(j6.G6)));
        this.n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.n.e();
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: sh.p
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
        this.f.addView(this.n, b6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ph.d dVar2 = new ph.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        ph.d dVar3 = this.h;
        final int i12 = z4 ? 1 : 0;
        dVar3.setOnClickListener(new View.OnClickListener(this) { // from class: sh.p
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
        this.f.addView(this.h, b6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(this.f, b6.e(-1, -2, 80));
        zw0 zw0Var = new zw0(getParentActivity(), null, 16, this.resourceProvider);
        this.r = zw0Var;
        zw0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.r.setAnimateLayoutChange(true);
        this.r.setVisibility(8);
        this.c.addView(this.r, b6.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z4 = false;
        }
        this.a.a(z4, false);
        V(0);
        FrameLayout frameLayout2 = this.c;
        o oVar = new o(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(frameLayout2, oVar);
        setBulletinDelegate(new gg.w(16));
        FrameLayout frameLayout3 = this.c;
        this.fragmentView = frameLayout3;
        return frameLayout3;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.b));
        this.s = getMessagesController().getChatFull(this.b);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        n0 n0Var = this.v;
        pa paVar = n0Var.i;
        if (paVar != null) {
            paVar.run();
        }
        n0Var.i = null;
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
