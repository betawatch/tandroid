package qh;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.c81;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class h1 extends i1 implements NotificationCenter.NotificationCenterDelegate {
    public final c81 b;
    public final f1 c;
    public final r1 d;
    public final g1 e;
    public final e1 f;
    public final ArrayList h;
    public final ArrayList n;
    public final /* synthetic */ x1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(x1 x1Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        this.r = x1Var;
        this.f = new e1();
        this.h = new ArrayList();
        this.n = new ArrayList();
        c81 c81Var = new c81(this, context, 1);
        this.b = c81Var;
        f1 f1Var = new f1(this);
        this.c = f1Var;
        c81Var.setAdapter(f1Var);
        g1 g1Var = new g1(this);
        this.e = g1Var;
        c81Var.setLayoutManager(g1Var);
        c81Var.i(new hg.e2(this, 8));
        c81Var.setClipToPadding(true);
        c81Var.setVerticalScrollBarEnabled(false);
        ag.h hVar = new ag.h(this, 15);
        c81Var.setOnTouchListener(new org.telegram.ui.ActionBar.i1(7, this, hVar));
        c81Var.setOnItemClickListener(hVar);
        c81Var.setOnScrollListener(new nb0(this, 12));
        addView(c81Var, k7.c6.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        g6Var = ((org.telegram.ui.ActionBar.h3) x1Var).resourcesProvider;
        r1 r1Var = new r1(context, g6Var);
        this.d = r1Var;
        r1Var.v = new eg.p1(this, 27);
        r1Var.a(2, false);
        addView(r1Var, k7.c6.e(-1, -2, 48));
    }

    @Override // qh.i1
    public final void a(int i10) {
        f1 f1Var = this.c;
        f1.E(f1Var, false);
        if (this.n.isEmpty() && TextUtils.isEmpty(this.r.b)) {
            f1Var.G();
        }
        f1Var.H(null);
    }

    @Override // qh.i1
    public final float b() {
        int i10 = 0;
        while (true) {
            c81 c81Var = this.b;
            if (i10 >= c81Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = c81Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return Math.max(0, r2.getBottom());
            }
            i10++;
        }
    }

    @Override // qh.i1
    public final void c() {
        this.d.setTranslationY(AndroidUtilities.dp(10.0f) + Math.max(0.0f, b()));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            f1.E(this.c, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.h3) this.r).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.h3) this.r).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        x1 x1Var = this.r;
        i12 = ((org.telegram.ui.ActionBar.h3) x1Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.h3) x1Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
