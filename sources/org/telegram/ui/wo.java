package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wo extends org.telegram.ui.Cells.b9 {
    public final /* synthetic */ cp D;
    public ValueAnimator x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo(cp cpVar, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(12, context, p6Var);
        this.D = cpVar;
        this.y = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.y != -1) {
            cp cpVar = this.D;
            if (cpVar.n != null) {
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                boolean z11 = false;
                while (true) {
                    i14 = 1;
                    if (i15 >= cpVar.n.getChildCount()) {
                        break;
                    }
                    View childAt = cpVar.n.getChildAt(i15);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                    i15++;
                }
                float height = this.y - getHeight();
                ValueAnimator valueAnimator = this.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(new eg(arrayList, height, i14));
                this.x.setInterpolator(org.telegram.ui.Components.gr.h);
                this.x.setDuration(350L);
                this.x.start();
            }
        }
        this.y = getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, org.telegram.ui.Cells.b9, org.telegram.ui.wo] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Cells.b9
    public final void setText(CharSequence charSequence) {
        org.telegram.ui.ActionBar.p6 p6Var;
        if (charSequence != 0) {
            charSequence = org.telegram.messenger.i0.W2(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            cp cpVar = this.D;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                int i10 = org.telegram.ui.ActionBar.t6.p7;
                p6Var = ((org.telegram.ui.ActionBar.k2) cpVar).resourceProvider;
                charSequence.setSpan(new org.telegram.ui.Components.l00(i10, p6Var), 0, indexOf, 33);
            }
            org.telegram.ui.Components.x41[] x41VarArr = (org.telegram.ui.Components.x41[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.x41.class);
            org.telegram.ui.ActionBar.n0 n0Var = cpVar.b;
            String obj = (n0Var == null || n0Var.getText() == null) ? "" : cpVar.b.getText().toString();
            for (int i11 = 0; i11 < x41VarArr.length; i11++) {
                charSequence.setSpan(new org.telegram.ui.Cells.h(5, (Object) this, obj), charSequence.getSpanStart(x41VarArr[i11]), charSequence.getSpanEnd(x41VarArr[i11]), 33);
                charSequence.removeSpan(x41VarArr[i11]);
            }
        }
        super.setText(charSequence);
    }
}
