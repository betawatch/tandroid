package qf;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import h7.z5;
import java.util.ArrayList;
import java.util.HashSet;
import lh.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.xm;
import org.telegram.ui.Components.yh;
import org.telegram.ui.Components.zi;
import org.telegram.ui.a60;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e0 extends yh implements NotificationCenter.NotificationCenterDelegate, ud.b {
    public final az A;
    public final ci B;
    public final ud.a n;
    public final FrameLayout r;
    public final a60 s;
    public final zi v;
    public final HashSet w;
    public final b0 x;
    public final c0 y;

    public e0(Context context, c6 c6Var, gi giVar) {
        super(context, c6Var, giVar);
        this.n = new ud.a(0, this, er.h, 380L, false);
        this.w = new HashSet();
        this.y = new c0(this, context);
        fi fiVar = new fi(context, g6.d6, c6Var);
        fiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        ci ciVar = new ci(context, c6Var, this.b);
        this.B = ciVar;
        ciVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        z zVar = new z(this);
        gg.g gVar = ciVar.r;
        gVar.addTextChangedListener(zVar);
        gVar.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(fiVar, z5.g());
        FrameLayout.LayoutParams d = z5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(ciVar, d);
        az azVar = new az(context, c6Var);
        this.A = azVar;
        azVar.c();
        addView(azVar, z5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        a60 a60Var = new a60(this, context, c6Var, 2);
        this.s = a60Var;
        a60Var.p1();
        this.c = a60Var;
        this.d = a60Var;
        this.h = true;
        this.f = true;
        NotificationCenter.getGlobalInstance().listen(a60Var, NotificationCenter.emojiLoaded, new n6(this, 13));
        a60Var.setClipToPadding(false);
        getContext();
        zi ziVar = new zi(this, AndroidUtilities.dp(9.0f), a60Var, 4);
        this.v = ziVar;
        a60Var.setLayoutManager(ziVar);
        ziVar.P = false;
        a60Var.setHorizontalScrollBarEnabled(false);
        a60Var.setVerticalScrollBarEnabled(false);
        a60Var.setClipToPadding(false);
        addView(a60Var, z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        b0 b0Var = new b0(this, context);
        this.x = b0Var;
        a60Var.setAdapter(b0Var);
        a60Var.setGlowColor(g6.v0(g6.A5, this.a));
        a60Var.setOnItemClickListener(new ag.p0(this, 19));
        a60Var.setOnScrollListener(new xm(this, 20));
        FrameLayout.LayoutParams e9 = z5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e9).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e9);
        L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        a60 a60Var = this.s;
        if (a60Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = a60Var.getChildAt(0);
        lk0 lk0Var = (lk0) a60Var.G(childAt);
        if (lk0Var == null) {
            return -1000;
        }
        int paddingTop = a60Var.getPaddingTop();
        if (lk0Var.b() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    @Override // org.telegram.ui.Components.yh
    public final void E(yh yhVar) {
        this.v.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.yh
    public final void G() {
        this.s.x0(0);
    }

    public final void L() {
        this.A.setVisibility(this.s.getAdapter().h() == 2 ? 0 : 8);
        M();
    }

    public final void M() {
        View childAt;
        az azVar = this.A;
        if (azVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            azVar.setTranslationY((childAt.getTop() + (azVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.Components.yh
    public int getCurrentItemTop() {
        a60 a60Var = this.s;
        if (a60Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = a60Var.getChildAt(0);
        lk0 lk0Var = (lk0) a60Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i10 = (top <= 0 || lk0Var == null || lk0Var.b() != 0) ? 0 : top;
        ud.a aVar = this.n;
        if (top < 0 || lk0Var == null || lk0Var.b() != 0) {
            aVar.a(true, true);
            top = i10;
        } else {
            aVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.yh
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.yh
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.yh
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override // org.telegram.ui.Components.yh
    public ArrayList<i6> getThemeDescriptions() {
        h6 h6Var = new h6() { // from class: qf.y
            @Override // org.telegram.ui.ActionBar.h6
            public final void b() {
                a60 a60Var = e0.this.s;
                if (a60Var != null) {
                    int childCount = a60Var.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        a60Var.getChildAt(i10);
                    }
                }
            }

            @Override // org.telegram.ui.ActionBar.h6
            public final /* synthetic */ void a(float f10) {
            }
        };
        ArrayList<i6> arrayList = new ArrayList<>();
        arrayList.add(new i6(this.A, 4, null, null, null, null, g6.c7));
        arrayList.add(new i6(this.A, 2048, null, null, null, null, g6.h6));
        int i10 = g6.A5;
        a60 a60Var = this.s;
        arrayList.add(new i6(a60Var, 32768, null, null, null, null, i10));
        arrayList.add(new i6(a60Var, 4096, null, null, null, null, g6.i6));
        arrayList.add(new i6(a60Var, 0, new Class[]{View.class}, g6.k0, null, null, g6.d7));
        int i11 = g6.q5;
        arrayList.add(new i6(a60Var, 0, new Class[]{d0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new i6(a60Var, 0, new Class[]{d0.class}, new String[]{"statusTextView"}, null, null, -1, h6Var, i11));
        arrayList.add(new i6(a60Var, 0, new Class[]{d0.class}, null, g6.r0, null, g6.J7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.O7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.P7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.Q7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.R7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.S7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.T7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.U7));
        return arrayList;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        M();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(jg.a aVar) {
        ci ciVar = this.B;
        if (ciVar != null) {
            ciVar.setupBlurredBackground(aVar.c(ciVar, ng.c.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.yh
    public final void z(int i10, int i11) {
        int i12;
        gi giVar = this.b;
        if (giVar.n1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            giVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    giVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            giVar.setAllowNestedScroll(true);
        }
        this.s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override // org.telegram.ui.Components.yh
    public final void m() {
    }

    @Override // ud.b
    public final /* synthetic */ void A(float f10, int i10) {
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override // ud.b
    public final void o(int i10, float f10, float f11, ud.c cVar) {
    }
}
