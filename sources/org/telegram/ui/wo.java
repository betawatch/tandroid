package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wo extends org.telegram.ui.Cells.i9 {
    public ValueAnimator w;
    public int x;
    public final /* synthetic */ cp y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo(cp cpVar, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, 12, u6Var);
        this.y = cpVar;
        this.x = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.x != -1) {
            cp cpVar = this.y;
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
                float height = this.x - getHeight();
                ValueAnimator valueAnimator = this.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.w = ofFloat;
                ofFloat.addUpdateListener(new eg(arrayList, height, i14));
                this.w.setInterpolator(org.telegram.ui.Components.ds.h);
                this.w.setDuration(350L);
                this.w.start();
            }
        }
        this.x = getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, org.telegram.ui.Cells.i9, org.telegram.ui.wo] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Cells.i9
    public final void setText(CharSequence charSequence) {
        org.telegram.ui.ActionBar.u6 u6Var;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            cp cpVar = this.y;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                int i10 = org.telegram.ui.ActionBar.y6.p7;
                u6Var = ((org.telegram.ui.ActionBar.r2) cpVar).resourceProvider;
                charSequence.setSpan(new org.telegram.ui.Components.p10(i10, u6Var), 0, indexOf, 33);
            }
            org.telegram.ui.Components.r61[] r61VarArr = (org.telegram.ui.Components.r61[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.r61.class);
            fi.c2 c2Var = cpVar.b;
            String obj = (c2Var == null || c2Var.getText() == null) ? "" : cpVar.b.getText().toString();
            for (int i11 = 0; i11 < r61VarArr.length; i11++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, obj), charSequence.getSpanStart(r61VarArr[i11]), charSequence.getSpanEnd(r61VarArr[i11]), 33);
                charSequence.removeSpan(r61VarArr[i11]);
            }
        }
        super.setText(charSequence);
    }
}
