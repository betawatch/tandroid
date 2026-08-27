package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ro extends org.telegram.ui.Cells.x8 {
    public ValueAnimator v;
    public int w;
    public final /* synthetic */ xo x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro(xo xoVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 12, c6Var);
        this.x = xoVar;
        this.w = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.w != -1) {
            xo xoVar = this.x;
            if (xoVar.h != null) {
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                boolean z11 = false;
                while (true) {
                    i14 = 1;
                    if (i15 >= xoVar.h.getChildCount()) {
                        break;
                    }
                    View childAt = xoVar.h.getChildAt(i15);
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
                ofFloat.addUpdateListener(new dg(arrayList, height, i14));
                this.v.setInterpolator(org.telegram.ui.Components.er.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.w = getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, org.telegram.ui.Cells.x8, org.telegram.ui.ro] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Cells.x8
    public final void setText(CharSequence charSequence) {
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            xo xoVar = this.x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(xoVar.getThemedColor(org.telegram.ui.ActionBar.g6.p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.k41[] k41VarArr = (org.telegram.ui.Components.k41[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.k41.class);
            gg.g gVar = xoVar.a;
            String obj = (gVar == null || gVar.getText() == null) ? "" : xoVar.a.getText().toString();
            for (int i10 = 0; i10 < k41VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, obj), charSequence.getSpanStart(k41VarArr[i10]), charSequence.getSpanEnd(k41VarArr[i10]), 33);
                charSequence.removeSpan(k41VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
