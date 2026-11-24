// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class z82 extends mhb {
    public final /* synthetic */ f92 E;
    public ValueAnimator x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z82(f92 f92Var, Context context, wjb wjbVar) {
        super(12, wjbVar, context);
        this.E = f92Var;
        this.y = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.y != -1) {
            f92 f92Var = this.E;
            if (f92Var.n != null) {
                ArrayList arrayList = new ArrayList();
                boolean z2 = false;
                for (int i5 = 0; i5 < f92Var.n.getChildCount(); i5++) {
                    View childAt = f92Var.n.getChildAt(i5);
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
                ofFloat.addUpdateListener(new rm1(arrayList, height, (byte) 4));
                this.x.setInterpolator(s33.h);
                this.x.setDuration(350L);
                this.x.start();
            }
        }
        this.y = getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, mhb, z82] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // mhb
    public final void setText(CharSequence charSequence) {
        wjb wjbVar;
        if (charSequence != 0) {
            charSequence = gl.T2(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            f92 f92Var = this.E;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                int i = bkb.o7;
                wjbVar = ((d) f92Var).resourceProvider;
                charSequence.setSpan(new cm4(i, wjbVar), 0, indexOf, 33);
            }
            z3c[] z3cVarArr = (z3c[]) charSequence.getSpans(0, charSequence.length(), z3c.class);
            l7 l7Var = f92Var.b;
            String obj = (l7Var == null || l7Var.getText() == null) ? "" : f92Var.b.getText().toString();
            for (int i2 = 0; i2 < z3cVarArr.length; i2++) {
                charSequence.setSpan(new q1((Object) this, (Object) obj, (byte) 4), charSequence.getSpanStart(z3cVarArr[i2]), charSequence.getSpanEnd(z3cVarArr[i2]), 33);
                charSequence.removeSpan(z3cVarArr[i2]);
            }
        }
        super.setText(charSequence);
    }
}
