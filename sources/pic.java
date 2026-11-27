// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class pic extends y46 {
    public final /* synthetic */ of2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pic(of2 of2Var, Context context) {
        super(context);
        this.r = of2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if ((hl.L(21.0f) + r6.getRight()) > ((uic) r5.r.J).getMeasuredWidth()) goto L12;
     */
    @Override // y46, b89
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, a89 a89Var) {
        int j = j(o(), view);
        if (j > 0 || (j == 0 && view.getLeft() - hl.L(21.0f) < 0)) {
            j += hl.L(60.0f);
        } else {
            if (j >= 0) {
                if (j == 0) {
                }
            }
            j -= hl.L(60.0f);
        }
        int k = k(p(), view);
        int max = Math.max(jn7.J2, m((int) Math.sqrt((k * k) + (j * j))));
        if (max > 0) {
            a89Var.b(-j, -k, max, this.j);
        }
    }
}
