// default package

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ph1 extends FrameLayout implements snb {
    public final k38 a;
    public final oh1 b;
    public final ema c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f;
    public final /* synthetic */ wh1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph1(wh1 wh1Var, Activity activity) {
        super(activity);
        vnb vnbVar;
        int i;
        vnb vnbVar2;
        this.h = wh1Var;
        Context context = getContext();
        vnbVar = ((e) wh1Var).resourceProvider;
        k38 k38Var = new k38(context, vnbVar);
        this.a = k38Var;
        k38Var.setProgressToGradient(1.0f);
        k38Var.G = true;
        addView(k38Var, tre.e(-1, -1, jn7.D1));
        Context context2 = getContext();
        i = ((e) wh1Var).currentAccount;
        long j = wh1Var.a;
        vnbVar2 = ((e) wh1Var).resourceProvider;
        oh1 oh1Var = new oh1(this, context2, i, j, vnbVar2);
        this.b = oh1Var;
        boolean z = wh1Var.d;
        addView(oh1Var, tre.d(-1, z ? 230.0f : 190.0f, 80, 0.0f, 0.0f, 0.0f, z ? 24.0f : 0.0f));
        if (wh1Var instanceof dc5) {
            ema emaVar = new ema(getContext());
            this.c = emaVar;
            emaVar.setGravity(19);
            int i2 = aob.A8;
            emaVar.setTextColor(wh1Var.getThemedColor(i2));
            emaVar.setTypeface(hl.o());
            emaVar.l(ob6.M0(2131752532, null), false);
            emaVar.setAlpha(0.0f);
            a();
            addView(emaVar, tre.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(aob.g0(aob.p1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(oh1Var.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor((wh1Var.d && wh1Var.s == -1) ? wh1Var.getThemedColor(i2) : -1);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = wh1Var.c;
            textView.setText(hl.S2(ob6.G(tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, "BoostingGroupBoostCount", new Object[0])));
            textView2.setText(ob6.M0(2131753346, null));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, tre.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, tre.e(-1, -2, 80));
        }
    }

    public final void a() {
        float f;
        boolean z = getResources().getConfiguration().orientation == 2;
        int i = (hl.O1() || !z) ? 20 : 18;
        ema emaVar = this.c;
        emaVar.setTextSize(i);
        if (hl.O1()) {
            f = -2.0f;
        } else {
            f = z ? 4 : 0;
        }
        emaVar.setTranslationY(hl.L(f));
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.A8));
    }

    @Override // snb
    public final void updateColors() {
        ema emaVar = this.c;
        if (emaVar != null) {
            wh1 wh1Var = this.h;
            int i = -1;
            emaVar.setTextColor((!wh1Var.d || wh1Var.s == -1) ? wh1Var.getThemedColor(aob.A8) : -1);
            if (wh1Var.d && wh1Var.s == -1) {
                i = wh1Var.getThemedColor(aob.A8);
            }
            this.e.setTextColor(i);
        }
    }
}
