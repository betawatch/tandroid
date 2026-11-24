// default package

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class sz9 extends js9 {
    public tj9 f;
    public final /* synthetic */ g0a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz9(g0a g0aVar, Context context, f53 f53Var) {
        super(context, 13.0f, f53Var);
        this.h = g0aVar;
    }

    @Override // js9
    public final void a(String str) {
        tj9 tj9Var = this.f;
        if (tj9Var != null) {
            gl.r(tj9Var);
        }
        this.f = new tj9(this, str, (byte) 22);
        boolean isEmpty = TextUtils.isEmpty(str);
        tj9 tj9Var2 = this.f;
        if (isEmpty) {
            tj9Var2.run();
        } else {
            gl.e3(tj9Var2, 300L);
        }
        if (this.f != null) {
            g0a g0aVar = this.h;
            if (g0aVar.R) {
                return;
            }
            g0aVar.R = true;
            g0aVar.x.E();
            g0aVar.y.g1(0, -g0aVar.r.getPaddingTop());
        }
    }
}
