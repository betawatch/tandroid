// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class p92 extends ilb {
    public final /* synthetic */ v92 E;
    public ValueAnimator x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p92(v92 v92Var, Context context, vnb vnbVar) {
        super(12, vnbVar, context);
        this.E = v92Var;
        this.y = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.y != -1) {
            v92 v92Var = this.E;
            if (v92Var.n != null) {
                ArrayList arrayList = new ArrayList();
                boolean z2 = false;
                for (int i5 = 0; i5 < v92Var.n.getChildCount(); i5++) {
                    View childAt = v92Var.n.getChildAt(i5);
                    if (z2) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z2 = true;
                    }
                }
                float height = this.y - getHeight();
                ValueAnimator valueAnimator = this.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(new qm1(arrayList, height, (byte) 4));
                this.x.setInterpolator(k43.h);
                this.x.setDuration(350L);
                this.x.start();
            }
        }
        this.y = getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [ilb, java.lang.Object, p92] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // ilb
    public final void setText(CharSequence charSequence) {
        vnb vnbVar;
        if (charSequence != 0) {
            charSequence = hl.S2(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            v92 v92Var = this.E;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                int i = aob.p7;
                vnbVar = ((e) v92Var).resourceProvider;
                charSequence.setSpan(new ho4(i, vnbVar), 0, indexOf, 33);
            }
            y7c[] y7cVarArr = (y7c[]) charSequence.getSpans(0, charSequence.length(), y7c.class);
            m7 m7Var = v92Var.b;
            String obj = (m7Var == null || m7Var.getText() == null) ? "" : v92Var.b.getText().toString();
            for (int i2 = 0; i2 < y7cVarArr.length; i2++) {
                charSequence.setSpan(new r1((Object) this, (Object) obj, (byte) 4), charSequence.getSpanStart(y7cVarArr[i2]), charSequence.getSpanEnd(y7cVarArr[i2]), 33);
                charSequence.removeSpan(y7cVarArr[i2]);
            }
        }
        super.setText(charSequence);
    }
}
