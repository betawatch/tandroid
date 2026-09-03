package qh;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class n1 extends i1 {
    public final d1 b;
    public final m1 c;
    public final f2.w d;
    public final k1 e;
    public final r1 f;
    public int h;
    public float n;
    public boolean r;
    public final /* synthetic */ x1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(x1 x1Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        this.s = x1Var;
        this.h = 8;
        this.n = -1.0f;
        this.r = false;
        d1 d1Var = new d1(context);
        this.b = d1Var;
        m1 m1Var = new m1(this);
        this.c = m1Var;
        d1Var.setAdapter(m1Var);
        f2.w wVar = new f2.w(this.h);
        this.d = wVar;
        d1Var.setLayoutManager(wVar);
        d1Var.setClipToPadding(true);
        d1Var.setVerticalScrollBarEnabled(false);
        wVar.O = new lh.n5(this, 8);
        d1Var.setOnItemClickListener(new ag.h(this, 16));
        d1Var.setOnScrollListener(new nb0(this, 13));
        f2.l lVar = new f2.l();
        lVar.c = 220L;
        lVar.e = 220L;
        lVar.f = 160L;
        lVar.g = 160L;
        lVar.i = pr.g;
        d1Var.setItemAnimator(lVar);
        addView(d1Var, k7.c6.c(-1.0f, -1));
        g6Var = ((org.telegram.ui.ActionBar.h3) x1Var).resourcesProvider;
        r1 r1Var = new r1(context, g6Var);
        this.f = r1Var;
        r1Var.v = new eg.p1(this, 28);
        addView(r1Var, k7.c6.e(-1, -2, 48));
        g6Var2 = ((org.telegram.ui.ActionBar.h3) x1Var).resourcesProvider;
        k1 k1Var = new k1(this, context, g6Var2);
        this.e = k1Var;
        addView(k1Var, k7.c6.c(36.0f, -1));
    }

    @Override // qh.i1
    public final void a(int i10) {
        int i11;
        this.a = i10;
        this.b.V2 = i10 == 0;
        int i12 = i10 == 0 ? 8 : 5;
        this.h = i12;
        this.d.y1(i12);
        boolean z4 = this.r;
        m1 m1Var = this.c;
        if (!z4) {
            m1Var.D(null);
        }
        x1 x1Var = this.s;
        int i13 = x1Var.c;
        r1 r1Var = this.f;
        if (i13 >= 0) {
            r1Var.r = true;
            r1Var.d.setText("");
            r1Var.r = false;
            q1 q1Var = r1Var.f;
            if (q1Var != null) {
                q1Var.D1(x1Var.c);
                r1Var.f.B1();
                if (r1Var.f.getSelectedCategory() != null) {
                    m1Var.E = r1Var.f.getSelectedCategory().a;
                    org.telegram.ui.web.s0 s0Var = m1Var.J;
                    AndroidUtilities.cancelRunOnUIThread(s0Var);
                    AndroidUtilities.runOnUIThread(s0Var);
                }
            }
        } else if (TextUtils.isEmpty(x1Var.b)) {
            r1Var.b();
        } else {
            r1Var.d.setText(x1Var.b);
            q1 q1Var2 = r1Var.f;
            if (q1Var2 != null) {
                q1Var2.E1(null);
                r1Var.f.C1();
            }
            AndroidUtilities.cancelRunOnUIThread(m1Var.J);
            AndroidUtilities.runOnUIThread(m1Var.J);
        }
        r1Var.a(i10, x1Var.s);
        i11 = ((org.telegram.ui.ActionBar.h3) x1Var).currentAccount;
        MediaDataController.getInstance(i11).checkStickers(i10 == 0 ? 5 : 0);
    }

    @Override // qh.i1
    public final float b() {
        float f10 = this.n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i10 = 0;
        while (true) {
            d1 d1Var = this.b;
            if (i10 >= d1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = d1Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return l.d.c(102.0f, r3.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override // qh.i1
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        d1 d1Var = this.b;
        float height = d1Var.getHeight() - d1Var.getPaddingBottom();
        d1Var.W2 = max + d1Var.getPaddingTop();
        d1Var.X2 = height;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        x1 x1Var = this.s;
        i12 = ((org.telegram.ui.ActionBar.h3) x1Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.h3) x1Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f.setTranslationY(AndroidUtilities.dp(52.0f));
        this.b.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(102.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(x1Var.r ? 0.0f : 40.0f) + AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
