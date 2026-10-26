package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class uo extends org.telegram.ui.Cells.i9 {
    public ValueAnimator w;
    public int x;
    public final /* synthetic */ ap y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo(ap apVar, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, 12, u6Var);
        this.y = apVar;
        this.x = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.x != -1) {
            ap apVar = this.y;
            if (apVar.n != null) {
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                boolean z11 = false;
                while (true) {
                    i14 = 1;
                    if (i15 >= apVar.n.getChildCount()) {
                        break;
                    }
                    View childAt = apVar.n.getChildAt(i15);
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
                ofFloat.addUpdateListener(new dg(arrayList, height, i14));
                this.w.setInterpolator(org.telegram.ui.Components.ds.h);
                this.w.setDuration(350L);
                this.w.start();
            }
        }
        this.x = getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, org.telegram.ui.Cells.i9, org.telegram.ui.uo] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Cells.i9
    public final void setText(CharSequence charSequence) {
        org.telegram.ui.ActionBar.u6 u6Var;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            ap apVar = this.y;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                int i10 = org.telegram.ui.ActionBar.y6.p7;
                u6Var = ((org.telegram.ui.ActionBar.r2) apVar).resourceProvider;
                charSequence.setSpan(new org.telegram.ui.Components.p10(i10, u6Var), 0, indexOf, 33);
            }
            org.telegram.ui.Components.q61[] q61VarArr = (org.telegram.ui.Components.q61[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.q61.class);
            fi.c2 c2Var = apVar.b;
            String obj = (c2Var == null || c2Var.getText() == null) ? "" : apVar.b.getText().toString();
            for (int i11 = 0; i11 < q61VarArr.length; i11++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, obj), charSequence.getSpanStart(q61VarArr[i11]), charSequence.getSpanEnd(q61VarArr[i11]), 33);
                charSequence.removeSpan(q61VarArr[i11]);
            }
        }
        super.setText(charSequence);
    }
}
