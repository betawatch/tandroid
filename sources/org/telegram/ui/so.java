package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class so extends org.telegram.ui.Cells.y8 {
    public ValueAnimator v;
    public int w;
    public final /* synthetic */ yo x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so(yo yoVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 12, c6Var);
        this.x = yoVar;
        this.w = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.w != -1) {
            yo yoVar = this.x;
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
                float height = this.w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new ag(arrayList, height, i14));
                this.v.setInterpolator(org.telegram.ui.Components.jr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.w = getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, org.telegram.ui.Cells.y8, org.telegram.ui.so] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Cells.y8
    public final void setText(CharSequence charSequence) {
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            yo yoVar = this.x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(yoVar.getThemedColor(org.telegram.ui.ActionBar.g6.p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.t41[] t41VarArr = (org.telegram.ui.Components.t41[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.t41.class);
            ig.f fVar = yoVar.a;
            String obj = (fVar == null || fVar.getText() == null) ? "" : yoVar.a.getText().toString();
            for (int i10 = 0; i10 < t41VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, obj), charSequence.getSpanStart(t41VarArr[i10]), charSequence.getSpanEnd(t41VarArr[i10]), 33);
                charSequence.removeSpan(t41VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
