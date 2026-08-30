package ph;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class o1 extends j1 {
    public final d1 b;
    public final n1 c;
    public final f2.w d;
    public final l1 e;
    public final s1 f;
    public int h;
    public float n;
    public boolean r;
    public final /* synthetic */ y1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(y1 y1Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.s = y1Var;
        this.h = 8;
        this.n = -1.0f;
        this.r = false;
        d1 d1Var = new d1(context);
        this.b = d1Var;
        n1 n1Var = new n1(this);
        this.c = n1Var;
        d1Var.setAdapter(n1Var);
        f2.w wVar = new f2.w(this.h);
        this.d = wVar;
        d1Var.setLayoutManager(wVar);
        d1Var.setClipToPadding(true);
        d1Var.setVerticalScrollBarEnabled(false);
        wVar.O = new kh.n5(this, 8);
        d1Var.setOnItemClickListener(new dg.n(this, 15));
        d1Var.setOnScrollListener(new lb0(this, 13));
        f2.l lVar = new f2.l();
        lVar.c = 220L;
        lVar.e = 220L;
        lVar.f = 160L;
        lVar.g = 160L;
        lVar.i = nr.g;
        d1Var.setItemAnimator(lVar);
        addView(d1Var, k7.b6.c(-1.0f, -1));
        f6Var = ((org.telegram.ui.ActionBar.g3) y1Var).resourcesProvider;
        s1 s1Var = new s1(context, f6Var);
        this.f = s1Var;
        s1Var.v = new dg.r1(this, 28);
        addView(s1Var, k7.b6.e(-1, -2, 48));
        f6Var2 = ((org.telegram.ui.ActionBar.g3) y1Var).resourcesProvider;
        l1 l1Var = new l1(this, context, f6Var2);
        this.e = l1Var;
        addView(l1Var, k7.b6.c(36.0f, -1));
    }

    @Override // ph.j1
    public final void a(int i10) {
        int i11;
        this.a = i10;
        this.b.V2 = i10 == 0;
        int i12 = i10 == 0 ? 8 : 5;
        this.h = i12;
        this.d.y1(i12);
        boolean z4 = this.r;
        n1 n1Var = this.c;
        if (!z4) {
            n1Var.D(null);
        }
        y1 y1Var = this.s;
        int i13 = y1Var.c;
        s1 s1Var = this.f;
        if (i13 >= 0) {
            s1Var.r = true;
            s1Var.d.setText("");
            s1Var.r = false;
            r1 r1Var = s1Var.f;
            if (r1Var != null) {
                r1Var.E1(y1Var.c);
                s1Var.f.C1();
                if (s1Var.f.getSelectedCategory() != null) {
                    n1Var.E = s1Var.f.getSelectedCategory().a;
                    org.telegram.ui.web.o0 o0Var = n1Var.J;
                    AndroidUtilities.cancelRunOnUIThread(o0Var);
                    AndroidUtilities.runOnUIThread(o0Var);
                }
            }
        } else if (TextUtils.isEmpty(y1Var.b)) {
            s1Var.b();
        } else {
            s1Var.d.setText(y1Var.b);
            r1 r1Var2 = s1Var.f;
            if (r1Var2 != null) {
                r1Var2.F1(null);
                s1Var.f.D1();
            }
            AndroidUtilities.cancelRunOnUIThread(n1Var.J);
            AndroidUtilities.runOnUIThread(n1Var.J);
        }
        s1Var.a(i10, y1Var.s);
        i11 = ((org.telegram.ui.ActionBar.g3) y1Var).currentAccount;
        MediaDataController.getInstance(i11).checkStickers(i10 == 0 ? 5 : 0);
    }

    @Override // ph.j1
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
                return kh.a2.c(102.0f, r3.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override // ph.j1
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
        y1 y1Var = this.s;
        i12 = ((org.telegram.ui.ActionBar.g3) y1Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.g3) y1Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f.setTranslationY(AndroidUtilities.dp(52.0f));
        this.b.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(102.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(y1Var.r ? 0.0f : 40.0f) + AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
