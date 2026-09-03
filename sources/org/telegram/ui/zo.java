package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class zo extends org.telegram.ui.Cells.z8 {
    public ValueAnimator v;
    public int w;
    public final /* synthetic */ fp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo(fp fpVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 12, f6Var);
        this.x = fpVar;
        this.w = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.w != -1) {
            fp fpVar = this.x;
            if (fpVar.h != null) {
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                boolean z10 = false;
                while (true) {
                    i14 = 1;
                    if (i15 >= fpVar.h.getChildCount()) {
                        break;
                    }
                    View childAt = fpVar.h.getChildAt(i15);
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
                ofFloat.addUpdateListener(new ig(arrayList, height, i14));
                this.v.setInterpolator(org.telegram.ui.Components.mr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.w = getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, org.telegram.ui.Cells.z8, org.telegram.ui.zo] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Cells.z8
    public final void setText(CharSequence charSequence) {
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            fp fpVar = this.x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(fpVar.getThemedColor(org.telegram.ui.ActionBar.j6.p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.f51[] f51VarArr = (org.telegram.ui.Components.f51[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.f51.class);
            kg.f fVar = fpVar.a;
            String obj = (fVar == null || fVar.getText() == null) ? "" : fpVar.a.getText().toString();
            for (int i10 = 0; i10 < f51VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, obj), charSequence.getSpanStart(f51VarArr[i10]), charSequence.getSpanEnd(f51VarArr[i10]), 33);
                charSequence.removeSpan(f51VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
