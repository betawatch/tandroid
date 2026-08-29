package sf;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import i7.f6;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.i71;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d0 extends fi implements NotificationCenter.NotificationCenterDelegate, vd.b {
    public final hz A;
    public final ji B;
    public final vd.a n;
    public final FrameLayout r;
    public final i71 s;
    public final gj v;
    public final HashSet w;
    public final a0 x;
    public final b0 y;

    public d0(Context context, c6 c6Var, ni niVar) {
        super(context, c6Var, niVar);
        this.n = new vd.a(0, this, jr.h, 380L, false);
        this.w = new HashSet();
        this.y = new b0(this, context);
        mi miVar = new mi(context, g6.d6, c6Var);
        miVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        ji jiVar = new ji(context, c6Var, this.b);
        this.B = jiVar;
        jiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        y yVar = new y(this);
        ig.f fVar = jiVar.r;
        fVar.addTextChangedListener(yVar);
        fVar.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(miVar, f6.g());
        FrameLayout.LayoutParams d = f6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(jiVar, d);
        hz hzVar = new hz(context, c6Var);
        this.A = hzVar;
        hzVar.c();
        addView(hzVar, f6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        i71 i71Var = new i71(this, context, c6Var);
        this.s = i71Var;
        i71Var.p1();
        this.c = i71Var;
        this.d = i71Var;
        this.h = true;
        this.f = true;
        NotificationCenter.getGlobalInstance().listen(i71Var, NotificationCenter.emojiLoaded, new nh.b0(this, 18));
        i71Var.setClipToPadding(false);
        getContext();
        gj gjVar = new gj(this, AndroidUtilities.dp(9.0f), i71Var, 4);
        this.v = gjVar;
        i71Var.setLayoutManager(gjVar);
        gjVar.P = false;
        i71Var.setHorizontalScrollBarEnabled(false);
        i71Var.setVerticalScrollBarEnabled(false);
        i71Var.setClipToPadding(false);
        addView(i71Var, f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        a0 a0Var = new a0(this, context);
        this.x = a0Var;
        i71Var.setAdapter(a0Var);
        i71Var.setGlowColor(g6.v0(g6.A5, this.a));
        i71Var.setOnItemClickListener(new bg.o(this, 21));
        i71Var.setOnScrollListener(new h00(this, 20));
        FrameLayout.LayoutParams e10 = f6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e10);
        K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        i71 i71Var = this.s;
        if (i71Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = i71Var.getChildAt(0);
        vk0 vk0Var = (vk0) i71Var.G(childAt);
        if (vk0Var == null) {
            return -1000;
        }
        int paddingTop = i71Var.getPaddingTop();
        if (vk0Var.b() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    @Override // org.telegram.ui.Components.fi
    public final void D(fi fiVar) {
        this.v.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.fi
    public final void F() {
        this.s.x0(0);
    }

    public final void K() {
        this.A.setVisibility(this.s.getAdapter().h() == 2 ? 0 : 8);
        L();
    }

    public final void L() {
        View childAt;
        hz hzVar = this.A;
        if (hzVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            hzVar.setTranslationY((childAt.getTop() + (hzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.Components.fi
    public int getCurrentItemTop() {
        i71 i71Var = this.s;
        if (i71Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = i71Var.getChildAt(0);
        vk0 vk0Var = (vk0) i71Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i10 = (top <= 0 || vk0Var == null || vk0Var.b() != 0) ? 0 : top;
        vd.a aVar = this.n;
        if (top < 0 || vk0Var == null || vk0Var.b() != 0) {
            aVar.a(true, true);
            top = i10;
        } else {
            aVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.fi
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.fi
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.fi
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override // org.telegram.ui.Components.fi
    public ArrayList<i6> getThemeDescriptions() {
        h6 h6Var = new h6() { // from class: sf.x
            @Override // org.telegram.ui.ActionBar.h6
            public final void b() {
                i71 i71Var = d0.this.s;
                if (i71Var != null) {
                    int childCount = i71Var.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        i71Var.getChildAt(i10);
                    }
                }
            }

            @Override // org.telegram.ui.ActionBar.h6
            public final /* synthetic */ void a(float f9) {
            }
        };
        ArrayList<i6> arrayList = new ArrayList<>();
        arrayList.add(new i6(this.A, 4, null, null, null, null, g6.c7));
        arrayList.add(new i6(this.A, 2048, null, null, null, null, g6.h6));
        int i10 = g6.A5;
        i71 i71Var = this.s;
        arrayList.add(new i6(i71Var, 32768, null, null, null, null, i10));
        arrayList.add(new i6(i71Var, 4096, null, null, null, null, g6.i6));
        arrayList.add(new i6(i71Var, 0, new Class[]{View.class}, g6.k0, null, null, g6.d7));
        int i11 = g6.q5;
        arrayList.add(new i6(i71Var, 0, new Class[]{c0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new i6(i71Var, 0, new Class[]{c0.class}, new String[]{"statusTextView"}, null, null, -1, h6Var, i11));
        arrayList.add(new i6(i71Var, 0, new Class[]{c0.class}, null, g6.r0, null, g6.J7));
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
        L();
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(lg.a aVar) {
        ji jiVar = this.B;
        if (jiVar != null) {
            jiVar.setupBlurredBackground(aVar.c(jiVar, pg.a.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.fi
    public final void y(int i10, int i11) {
        int i12;
        ni niVar = this.b;
        if (niVar.n1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            niVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    niVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            niVar.setAllowNestedScroll(true);
        }
        this.s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override // org.telegram.ui.Components.fi
    public final void m() {
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
    }
}
