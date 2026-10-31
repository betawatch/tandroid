package sg;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final e a;
    public boolean b;
    public boolean c;
    public q20 d;

    public f(Activity activity, p6 p6Var) {
        super(activity);
        e eVar = new e(this, activity);
        this.a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(R.drawable.smiles_tab_clear);
        a7.t(eVar, t6.Gf, p6Var, PorterDuff.Mode.MULTIPLY);
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(cd.L0(2131754920, null));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new bh.c(24));
        addView(eVar, b6.e(36, 36, 17));
        int x02 = t6.x0(null, t6.i6, false);
        int L = org.telegram.messenger.i0.L(36.0f);
        int i10 = t6.d6;
        org.telegram.ui.Cells.y j02 = t6.j0(L, p6Var != null ? p6Var.h(i10) : t6.x0(null, i10, false), x02);
        w6 N = a7.N(i10);
        eVar.setBackground(j02);
        a7.k(eVar, j02, N, null, p6Var);
        eVar.setOutlineProvider(new rf.b0(18));
        eVar.setElevation(org.telegram.messenger.i0.L(1.0f));
        eVar.setClipToOutline(true);
        setClickable(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(42.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(42.0f), TLObject.FLAG_30));
    }

    public void setOnBackspace(q20 q20Var) {
        this.d = q20Var;
    }
}
