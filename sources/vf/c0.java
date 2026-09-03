package vf;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.pr;
import org.telegram.ui.c81;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c0 extends ei implements NotificationCenter.NotificationCenterDelegate, xd.b {
    public final oz B;
    public final ii C;
    public final xd.a n;
    public final FrameLayout r;
    public final c81 s;
    public final gj v;
    public final HashSet w;
    public final z x;
    public final a0 y;

    public c0(Context context, g6 g6Var, mi miVar) {
        super(context, g6Var, miVar);
        this.n = new xd.a(0, this, pr.h, 380L, false);
        this.w = new HashSet();
        this.y = new a0(this, context);
        li liVar = new li(context, k6.d6, g6Var);
        liVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        ii iiVar = new ii(context, g6Var, this.b);
        this.C = iiVar;
        iiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        x xVar = new x(this);
        lg.f fVar = iiVar.r;
        fVar.addTextChangedListener(xVar);
        fVar.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(liVar, c6.g());
        FrameLayout.LayoutParams d = c6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(iiVar, d);
        oz ozVar = new oz(context, g6Var);
        this.B = ozVar;
        ozVar.c();
        addView(ozVar, c6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        c81 c81Var = new c81(this, context, g6Var);
        this.s = c81Var;
        c81Var.o1();
        this.c = c81Var;
        this.d = c81Var;
        this.h = true;
        this.f = true;
        NotificationCenter.getGlobalInstance().listen(c81Var, NotificationCenter.emojiLoaded, new org.telegram.ui.web.d1(this, 18));
        c81Var.setClipToPadding(false);
        getContext();
        gj gjVar = new gj(this, AndroidUtilities.dp(9.0f), c81Var, 4);
        this.v = gjVar;
        c81Var.setLayoutManager(gjVar);
        gjVar.P = false;
        c81Var.setHorizontalScrollBarEnabled(false);
        c81Var.setVerticalScrollBarEnabled(false);
        c81Var.setClipToPadding(false);
        addView(c81Var, c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        z zVar = new z(this, context);
        this.x = zVar;
        c81Var.setAdapter(zVar);
        c81Var.setGlowColor(k6.v0(k6.A5, this.a));
        c81Var.setOnItemClickListener(new ag.h(this, 22));
        c81Var.setOnScrollListener(new nb0(this, 20));
        FrameLayout.LayoutParams e6 = c6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e6).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e6);
        K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        c81 c81Var = this.s;
        if (c81Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = c81Var.getChildAt(0);
        el0 el0Var = (el0) c81Var.G(childAt);
        if (el0Var == null) {
            return -1000;
        }
        int paddingTop = c81Var.getPaddingTop();
        if (el0Var.b() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    @Override // org.telegram.ui.Components.ei
    public final void D(ei eiVar) {
        this.v.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ei
    public final void F() {
        this.s.x0(0);
    }

    public final void K() {
        this.B.setVisibility(this.s.getAdapter().h() == 2 ? 0 : 8);
        M();
    }

    public final void M() {
        View childAt;
        oz ozVar = this.B;
        if (ozVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            ozVar.setTranslationY((childAt.getTop() + (ozVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.Components.ei
    public int getCurrentItemTop() {
        c81 c81Var = this.s;
        if (c81Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = c81Var.getChildAt(0);
        el0 el0Var = (el0) c81Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i10 = (top <= 0 || el0Var == null || el0Var.b() != 0) ? 0 : top;
        xd.a aVar = this.n;
        if (top < 0 || el0Var == null || el0Var.b() != 0) {
            aVar.a(true, true);
            top = i10;
        } else {
            aVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.ei
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ei
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ei
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ei
    public ArrayList<m6> getThemeDescriptions() {
        l6 l6Var = new l6() { // from class: vf.w
            @Override // org.telegram.ui.ActionBar.l6
            public final void b() {
                c81 c81Var = c0.this.s;
                if (c81Var != null) {
                    int childCount = c81Var.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        c81Var.getChildAt(i10);
                    }
                }
            }

            @Override // org.telegram.ui.ActionBar.l6
            public final /* synthetic */ void a(float f10) {
            }
        };
        ArrayList<m6> arrayList = new ArrayList<>();
        arrayList.add(new m6(this.B, 4, null, null, null, null, k6.c7));
        arrayList.add(new m6(this.B, 2048, null, null, null, null, k6.h6));
        int i10 = k6.A5;
        c81 c81Var = this.s;
        arrayList.add(new m6(c81Var, 32768, null, null, null, null, i10));
        arrayList.add(new m6(c81Var, 4096, null, null, null, null, k6.i6));
        arrayList.add(new m6(c81Var, 0, new Class[]{View.class}, k6.k0, null, null, k6.d7));
        int i11 = k6.q5;
        arrayList.add(new m6(c81Var, 0, new Class[]{b0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new m6(c81Var, 0, new Class[]{b0.class}, new String[]{"statusTextView"}, null, null, -1, l6Var, i11));
        arrayList.add(new m6(c81Var, 0, new Class[]{b0.class}, null, k6.r0, null, k6.J7));
        arrayList.add(new m6(null, 0, null, null, null, l6Var, k6.O7));
        arrayList.add(new m6(null, 0, null, null, null, l6Var, k6.P7));
        arrayList.add(new m6(null, 0, null, null, null, l6Var, k6.Q7));
        arrayList.add(new m6(null, 0, null, null, null, l6Var, k6.R7));
        arrayList.add(new m6(null, 0, null, null, null, l6Var, k6.S7));
        arrayList.add(new m6(null, 0, null, null, null, l6Var, k6.T7));
        arrayList.add(new m6(null, 0, null, null, null, l6Var, k6.U7));
        return arrayList;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        M();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(og.a aVar) {
        ii iiVar = this.C;
        if (iiVar != null) {
            iiVar.setupBlurredBackground(aVar.c(iiVar, sg.b.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.ei
    public final void y(int i10, int i11) {
        int i12;
        mi miVar = this.b;
        if (miVar.o1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            miVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    miVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            miVar.setAllowNestedScroll(true);
        }
        this.s.n1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override // org.telegram.ui.Components.ei
    public final void m() {
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
    }
}
