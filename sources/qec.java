// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qec extends u26 {
    public final /* synthetic */ xe2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qec(xe2 xe2Var, Context context) {
        super(context);
        this.r = xe2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if ((gl.L(21.0f) + r6.getRight()) > ((vec) r5.r.J).getMeasuredWidth()) goto L12;
     */
    @Override // u26, o49
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, n49 n49Var) {
        int j = j(o(), view);
        if (j > 0 || (j == 0 && view.getLeft() - gl.L(21.0f) < 0)) {
            j += gl.L(60.0f);
        } else {
            if (j >= 0) {
                if (j == 0) {
                }
            }
            j -= gl.L(60.0f);
        }
        int k = k(p(), view);
        int max = Math.max(kk7.J2, m((int) Math.sqrt((k * k) + (j * j))));
        if (max > 0) {
            n49Var.b(-j, -k, max, this.j);
        }
    }
}
