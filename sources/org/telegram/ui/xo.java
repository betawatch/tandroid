package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xo extends org.telegram.ui.Cells.a9 {
    public ValueAnimator v;
    public int w;
    public final /* synthetic */ ep x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo(ep epVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 12, g6Var);
        this.x = epVar;
        this.w = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.w != -1) {
            ep epVar = this.x;
            if (epVar.h != null) {
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                boolean z10 = false;
                while (true) {
                    i14 = 1;
                    if (i15 >= epVar.h.getChildCount()) {
                        break;
                    }
                    View childAt = epVar.h.getChildAt(i15);
                    if (z10) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z10 = true;
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
                ofFloat.addUpdateListener(new gg(arrayList, height, i14));
                this.v.setInterpolator(org.telegram.ui.Components.pr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.w = getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, org.telegram.ui.Cells.a9, org.telegram.ui.xo] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Cells.a9
    public final void setText(CharSequence charSequence) {
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            ep epVar = this.x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(epVar.getThemedColor(org.telegram.ui.ActionBar.k6.p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.g51[] g51VarArr = (org.telegram.ui.Components.g51[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.g51.class);
            lg.f fVar = epVar.a;
            String obj = (fVar == null || fVar.getText() == null) ? "" : epVar.a.getText().toString();
            for (int i10 = 0; i10 < g51VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, obj), charSequence.getSpanStart(g51VarArr[i10]), charSequence.getSpanEnd(g51VarArr[i10]), 33);
                charSequence.removeSpan(g51VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
