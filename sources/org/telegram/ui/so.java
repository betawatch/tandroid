package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class so extends org.telegram.ui.Cells.e9 {
    public ValueAnimator w;
    public int x;
    public final /* synthetic */ yo y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so(yo yoVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 12, g6Var);
        this.y = yoVar;
        this.x = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.x != -1) {
            yo yoVar = this.y;
            if (yoVar.h != null) {
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                boolean z11 = false;
                while (true) {
                    i14 = 1;
                    if (i15 >= yoVar.h.getChildCount()) {
                        break;
                    }
                    View childAt = yoVar.h.getChildAt(i15);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                    i15++;
                }
                float height = this.x - getHeight();
                ValueAnimator valueAnimator = this.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.w = ofFloat;
                ofFloat.addUpdateListener(new fg(arrayList, height, i14));
                this.w.setInterpolator(org.telegram.ui.Components.bs.h);
                this.w.setDuration(350L);
                this.w.start();
            }
        }
        this.x = getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, org.telegram.ui.Cells.e9, org.telegram.ui.so] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Cells.e9
    public final void setText(CharSequence charSequence) {
        org.telegram.ui.ActionBar.g6 g6Var;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            yo yoVar = this.y;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                int i10 = org.telegram.ui.ActionBar.k6.p7;
                g6Var = ((org.telegram.ui.ActionBar.o2) yoVar).resourceProvider;
                charSequence.setSpan(new org.telegram.ui.Components.m10(i10, g6Var), 0, indexOf, 33);
            }
            org.telegram.ui.Components.j61[] j61VarArr = (org.telegram.ui.Components.j61[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.j61.class);
            ei.e2 e2Var = yoVar.a;
            String obj = (e2Var == null || e2Var.getText() == null) ? "" : yoVar.a.getText().toString();
            for (int i11 = 0; i11 < j61VarArr.length; i11++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, obj), charSequence.getSpanStart(j61VarArr[i11]), charSequence.getSpanEnd(j61VarArr[i11]), 33);
                charSequence.removeSpan(j61VarArr[i11]);
            }
        }
        super.setText(charSequence);
    }
}
