package pf;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import g7.e6;
import java.util.ArrayList;
import java.util.HashSet;
import kh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.yy;
import org.telegram.ui.w50;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e0 extends ci implements NotificationCenter.NotificationCenterDelegate, td.b {
    public final yy A;
    public final gi B;
    public final td.a n;
    public final FrameLayout r;
    public final w50 s;
    public final dj v;
    public final HashSet w;
    public final b0 x;
    public final c0 y;

    public e0(Context context, b6 b6Var, ki kiVar) {
        super(context, b6Var, kiVar);
        this.n = new td.a(0, this, gr.h, 380L, false);
        this.w = new HashSet();
        this.y = new c0(this, context);
        ji jiVar = new ji(context, f6.d6, b6Var);
        jiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        gi giVar = new gi(context, b6Var, this.b);
        this.B = giVar;
        giVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        z zVar = new z(this);
        fg.g gVar = giVar.r;
        gVar.addTextChangedListener(zVar);
        gVar.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(jiVar, e6.g());
        FrameLayout.LayoutParams d = e6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(giVar, d);
        yy yyVar = new yy(context, b6Var);
        this.A = yyVar;
        yyVar.c();
        addView(yyVar, e6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        w50 w50Var = new w50(this, context, b6Var, 2);
        this.s = w50Var;
        w50Var.p1();
        this.c = w50Var;
        this.d = w50Var;
        this.h = true;
        this.f = true;
        NotificationCenter.getGlobalInstance().listen(w50Var, NotificationCenter.emojiLoaded, new i9(this, 11));
        w50Var.setClipToPadding(false);
        getContext();
        dj djVar = new dj(this, AndroidUtilities.dp(9.0f), w50Var, 4);
        this.v = djVar;
        w50Var.setLayoutManager(djVar);
        djVar.P = false;
        w50Var.setHorizontalScrollBarEnabled(false);
        w50Var.setVerticalScrollBarEnabled(false);
        w50Var.setClipToPadding(false);
        addView(w50Var, e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        b0 b0Var = new b0(this, context);
        this.x = b0Var;
        w50Var.setAdapter(b0Var);
        w50Var.setGlowColor(f6.v0(f6.A5, this.a));
        w50Var.setOnItemClickListener(new eh.j(this, 17));
        w50Var.setOnScrollListener(new kn(this, 19));
        FrameLayout.LayoutParams e10 = e6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e10);
        K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        w50 w50Var = this.s;
        if (w50Var.getChildCount() == 0) {
            return -1000;
        }
        int i9 = 0;
        View childAt = w50Var.getChildAt(0);
        ik0 ik0Var = (ik0) w50Var.G(childAt);
        if (ik0Var == null) {
            return -1000;
        }
        int paddingTop = w50Var.getPaddingTop();
        if (ik0Var.b() == 0 && childAt.getTop() >= 0) {
            i9 = childAt.getTop();
        }
        return paddingTop - i9;
    }

    @Override // org.telegram.ui.Components.ci
    public final void D(ci ciVar) {
        this.v.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ci
    public final void F() {
        this.s.x0(0);
    }

    public final void K() {
        this.A.setVisibility(this.s.getAdapter().h() == 2 ? 0 : 8);
        L();
    }

    public final void L() {
        View childAt;
        yy yyVar = this.A;
        if (yyVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            yyVar.setTranslationY((childAt.getTop() + (yyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        w50 w50Var = this.s;
        if (w50Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = w50Var.getChildAt(0);
        ik0 ik0Var = (ik0) w50Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i9 = (top <= 0 || ik0Var == null || ik0Var.b() != 0) ? 0 : top;
        td.a aVar = this.n;
        if (top < 0 || ik0Var == null || ik0Var.b() != 0) {
            aVar.a(true, true);
            top = i9;
        } else {
            aVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ci
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ci
    public ArrayList<h6> getThemeDescriptions() {
        g6 g6Var = new g6() { // from class: pf.y
            @Override // org.telegram.ui.ActionBar.g6
            public final void b() {
                w50 w50Var = e0.this.s;
                if (w50Var != null) {
                    int childCount = w50Var.getChildCount();
                    for (int i9 = 0; i9 < childCount; i9++) {
                        w50Var.getChildAt(i9);
                    }
                }
            }

            @Override // org.telegram.ui.ActionBar.g6
            public final /* synthetic */ void a(float f10) {
            }
        };
        ArrayList<h6> arrayList = new ArrayList<>();
        arrayList.add(new h6(this.A, 4, null, null, null, null, f6.c7));
        arrayList.add(new h6(this.A, 2048, null, null, null, null, f6.h6));
        int i9 = f6.A5;
        w50 w50Var = this.s;
        arrayList.add(new h6(w50Var, 32768, null, null, null, null, i9));
        arrayList.add(new h6(w50Var, 4096, null, null, null, null, f6.i6));
        arrayList.add(new h6(w50Var, 0, new Class[]{View.class}, f6.k0, null, null, f6.d7));
        int i10 = f6.q5;
        arrayList.add(new h6(w50Var, 0, new Class[]{d0.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new h6(w50Var, 0, new Class[]{d0.class}, new String[]{"statusTextView"}, null, null, -1, g6Var, i10));
        arrayList.add(new h6(w50Var, 0, new Class[]{d0.class}, null, f6.r0, null, f6.J7));
        arrayList.add(new h6(null, 0, null, null, null, g6Var, f6.O7));
        arrayList.add(new h6(null, 0, null, null, null, g6Var, f6.P7));
        arrayList.add(new h6(null, 0, null, null, null, g6Var, f6.Q7));
        arrayList.add(new h6(null, 0, null, null, null, g6Var, f6.R7));
        arrayList.add(new h6(null, 0, null, null, null, g6Var, f6.S7));
        arrayList.add(new h6(null, 0, null, null, null, g6Var, f6.T7));
        arrayList.add(new h6(null, 0, null, null, null, g6Var, f6.U7));
        return arrayList;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        L();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ig.a aVar) {
        gi giVar = this.B;
        if (giVar != null) {
            giVar.setupBlurredBackground(aVar.c(giVar, mg.c.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void y(int i9, int i10) {
        int i11;
        ki kiVar = this.b;
        if (kiVar.n1.R() > AndroidUtilities.dp(20.0f)) {
            i11 = AndroidUtilities.dp(8.0f);
            kiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    kiVar.setAllowNestedScroll(true);
                }
            }
            i11 = (i10 / 5) * 2;
            kiVar.setAllowNestedScroll(true);
        }
        this.s.o1(0, i11 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override // org.telegram.ui.Components.ci
    public final void m() {
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
    }
}
