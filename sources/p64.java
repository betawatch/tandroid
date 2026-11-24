// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class p64 extends b4c {
    static {
        b4c.h(new p64());
    }

    public static c4c i(String str, CharSequence charSequence, int i) {
        c4c K = c4c.K(p64.class);
        K.b = false;
        K.A = i;
        K.m = str;
        K.n = charSequence;
        return K;
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ((q64) view).a(c4cVar.A, c4cVar.m, c4cVar.n);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new q64(0, wjbVar, context);
    }
}
