package ph;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.lb0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class i1 extends j1 implements NotificationCenter.NotificationCenterDelegate {
    public final e1 b;
    public final g1 c;
    public final s1 d;
    public final h1 e;
    public final f1 f;
    public final ArrayList h;
    public final ArrayList n;
    public final /* synthetic */ y1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(y1 y1Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.r = y1Var;
        this.f = new f1();
        this.h = new ArrayList();
        this.n = new ArrayList();
        e1 e1Var = new e1(this, context, 0);
        this.b = e1Var;
        g1 g1Var = new g1(this);
        this.c = g1Var;
        e1Var.setAdapter(g1Var);
        h1 h1Var = new h1(this);
        this.e = h1Var;
        e1Var.setLayoutManager(h1Var);
        e1Var.i(new gg.e2(this, 8));
        e1Var.setClipToPadding(true);
        e1Var.setVerticalScrollBarEnabled(false);
        dg.n nVar = new dg.n(this, 14);
        e1Var.setOnTouchListener(new org.telegram.ui.ActionBar.i1(7, this, nVar));
        e1Var.setOnItemClickListener(nVar);
        e1Var.setOnScrollListener(new lb0(this, 12));
        addView(e1Var, k7.b6.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        f6Var = ((org.telegram.ui.ActionBar.g3) y1Var).resourcesProvider;
        s1 s1Var = new s1(context, f6Var);
        this.d = s1Var;
        s1Var.v = new dg.r1(this, 27);
        s1Var.a(2, false);
        addView(s1Var, k7.b6.e(-1, -2, 48));
    }

    @Override // ph.j1
    public final void a(int i10) {
        g1 g1Var = this.c;
        g1.E(g1Var, false);
        if (this.n.isEmpty() && TextUtils.isEmpty(this.r.b)) {
            g1Var.G();
        }
        g1Var.H(null);
    }

    @Override // ph.j1
    public final float b() {
        int i10 = 0;
        while (true) {
            e1 e1Var = this.b;
            if (i10 >= e1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = e1Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return Math.max(0, r2.getBottom());
            }
            i10++;
        }
    }

    @Override // ph.j1
    public final void c() {
        this.d.setTranslationY(AndroidUtilities.dp(10.0f) + Math.max(0.0f, b()));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            g1.E(this.c, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.g3) this.r).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.g3) this.r).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        y1 y1Var = this.r;
        i12 = ((org.telegram.ui.ActionBar.g3) y1Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.g3) y1Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
