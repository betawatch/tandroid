package yh;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.kt;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.u51;
import org.telegram.ui.un;
import org.telegram.ui.y01;
import r0.h0;
import w7.b6;
import xh.n1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q extends k2 implements fe.e {
    public final fe.b a;
    public long b;
    public FrameLayout c;
    public u51 d;
    public bh.i e;
    public LinearLayout f;
    public vh.d h;
    public vh.d n;
    public dw0 r;
    public TLRPC.ChatFull s;
    public e0 w;
    public int x;

    public q(Bundle bundle) {
        super(bundle);
        this.a = new fe.b(0, this, gr.h, 320L, false);
    }

    public static void Y(q qVar, a51 a51Var) {
        Object obj = a51Var.G;
        if (obj instanceof zh.f) {
            zh.f fVar = (zh.f) obj;
            long j10 = fVar.a;
            TLRPC.Chat L0 = vp.r1(qVar.currentAccount).L0(Long.valueOf(-j10));
            TLRPC.User Z1 = vp.r1(qVar.currentAccount).Z1(Long.valueOf(j10));
            if (Z1 != null) {
                qVar.presentFragment(un.ha(Z1.id));
            } else if (w3.t0(L0) || w3.j0(L0)) {
                qVar.presentFragment(un.ha(-L0.id));
            } else {
                new ai.c(qVar.getParentActivity(), L0, new o(0, qVar, fVar)).show();
            }
        }
    }

    public final void Z(int i10) {
        this.d.setPadding(0, 0, 0, i0.L(60.0f) + i10);
        this.f.setPadding(i0.L(7.0f), 0, i0.L(7.0f), i0.L(12.0f) + i10);
        this.r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(i0.L(72.0f) + i10);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        boolean z10 = true;
        z10 = true;
        setHasOwnBackground(true);
        e0 e0Var = new e0(getParentActivity(), this.resourceProvider, cc.a0(this), this.currentAccount, this.b);
        this.w = e0Var;
        e0Var.h = new s9.g(this);
        e0Var.d();
        this.w.e();
        final int i10 = 0;
        this.actionBar.setBackButtonDrawable(new c2(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new y01(this, 22));
        this.actionBar.setTitle(cd.L0(2131751895, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i11 = t6.a7;
        a7.i(i11, frameLayout, null);
        u51 u51Var = new u51(this, new n1(this, 3), new m(this), new xg.a(25, this));
        this.d = u51Var;
        u51Var.setClipToPadding(false);
        u51 u51Var2 = this.d;
        u51Var2.f3.r = false;
        u51Var2.r1();
        this.d.j(new p(this, 0));
        this.actionBar.setAdaptiveBackground(this.d);
        this.c.addView(this.d, b6.c(-1.0f, -1));
        bh.i iVar = new bh.i(context);
        this.e = iVar;
        iVar.setupColorKey(i11);
        this.e.setFadeZoneBottom(i0.L(72.0f));
        this.e.setFadeHeightBottom(i0.L(24.0f));
        this.c.addView(this.e, b6.g());
        this.c.addView(this.actionBar, b6.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(0);
        this.f.setPadding(i0.L(7.0f), 0, i0.L(7.0f), i0.L(12.0f));
        vh.d dVar = new vh.d(context, this.resourceProvider, true);
        this.n = dVar;
        dVar.e();
        vh.d dVar2 = this.n;
        int f7 = i0.b.f(0.125f, getThemedColor(t6.d6), getThemedColor(t6.G6));
        this.x = f7;
        dVar2.setColor(f7);
        this.n.setText(cd.L0(2131751900, null));
        this.n.f();
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: yh.n
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.w.f(false, true);
                        break;
                    default:
                        this.b.w.f(true, true);
                        break;
                }
            }
        });
        this.f.addView(this.n, b6.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        vh.d dVar3 = new vh.d(context, this.resourceProvider, true);
        this.h = dVar3;
        dVar3.setText(cd.L0(2131751902, null));
        this.h.f();
        vh.d dVar4 = this.h;
        final int i12 = z10 ? 1 : 0;
        dVar4.setOnClickListener(new View.OnClickListener(this) { // from class: yh.n
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.w.f(false, true);
                        break;
                    default:
                        this.b.w.f(true, true);
                        break;
                }
            }
        });
        this.f.addView(this.h, b6.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(this.f, b6.e(-1, -2, 80));
        dw0 dw0Var = new dw0(getParentActivity(), null, 16, this.resourceProvider);
        this.r = dw0Var;
        dw0Var.d.setText(cd.L0(2131748242, null));
        this.r.e.setText(cd.L0(2131748241, null));
        this.r.setAnimateLayoutChange(true);
        this.r.setVisibility(8);
        this.c.addView(this.r, b6.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.a.a(z10, false);
        Z(0);
        FrameLayout frameLayout2 = this.c;
        m mVar = new m(this);
        WeakHashMap weakHashMap = h0.a;
        r0.z.i(frameLayout2, mVar);
        setBulletinDelegate(new mg.u(15));
        FrameLayout frameLayout3 = this.c;
        this.fragmentView = frameLayout3;
        return frameLayout3;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("community_id", 0L);
        getMessagesController().L0(Long.valueOf(this.b));
        this.s = getMessagesController().M0(this.b);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        e0 e0Var = this.w;
        kt ktVar = e0Var.i;
        if (ktVar != null) {
            ktVar.run();
        }
        e0Var.i = null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f7 = i0.b.f(0.125f, getThemedColor(t6.d6), getThemedColor(t6.G6));
            vh.d dVar = this.n;
            if (dVar == null || f7 == this.x) {
                return;
            }
            this.x = f7;
            dVar.setColor(f7);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        float f11 = 1.0f - f7;
        this.f.setAlpha(f11);
        this.f.setVisibility(f11 > 0.0f ? 0 : 8);
        this.r.setAlpha(f7);
        this.r.setVisibility(f7 > 0.0f ? 0 : 8);
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
