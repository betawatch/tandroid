package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vn extends org.telegram.ui.Cells.y8 {
    public final /* synthetic */ bo E;
    public ValueAnimator x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn(bo boVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(12, context, e6Var);
        this.E = boVar;
        this.y = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.y != -1) {
            bo boVar = this.E;
            if (boVar.n != null) {
                ArrayList arrayList = new ArrayList();
                int i14 = 0;
                boolean z11 = false;
                while (true) {
                    i13 = 1;
                    if (i14 >= boVar.n.getChildCount()) {
                        break;
                    }
                    View childAt = boVar.n.getChildAt(i14);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                    i14++;
                }
                float height = this.y - getHeight();
                ValueAnimator valueAnimator = this.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(new of(arrayList, height, i13));
                this.x.setInterpolator(org.telegram.ui.Components.xq.h);
                this.x.setDuration(350L);
                this.x.start();
            }
        }
        this.y = getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, org.telegram.ui.Cells.y8, org.telegram.ui.vn] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Cells.y8
    public final void setText(CharSequence charSequence) {
        org.telegram.ui.ActionBar.e6 e6Var;
        if (charSequence != 0) {
            charSequence = org.telegram.messenger.g0.X2(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            bo boVar = this.E;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                int i3 = org.telegram.ui.ActionBar.k6.p7;
                e6Var = ((org.telegram.ui.ActionBar.d2) boVar).resourceProvider;
                charSequence.setSpan(new org.telegram.ui.Components.tz(i3, e6Var), 0, indexOf, 33);
            }
            org.telegram.ui.Components.o31[] o31VarArr = (org.telegram.ui.Components.o31[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.o31.class);
            bh.g gVar = boVar.b;
            String obj = (gVar == null || gVar.getText() == null) ? "" : boVar.b.getText().toString();
            for (int i10 = 0; i10 < o31VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.h(5, (Object) this, obj), charSequence.getSpanStart(o31VarArr[i10]), charSequence.getSpanEnd(o31VarArr[i10]), 33);
                charSequence.removeSpan(o31VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
