// default package

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class u1a extends lu9 {
    public il9 f;
    public final /* synthetic */ i2a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1a(i2a i2aVar, Context context, r63 r63Var) {
        super(context, 13.0f, r63Var);
        this.h = i2aVar;
    }

    @Override // lu9
    public final void a(String str) {
        il9 il9Var = this.f;
        if (il9Var != null) {
            gm.r(il9Var);
        }
        this.f = new il9(this, str, (byte) 24);
        boolean isEmpty = TextUtils.isEmpty(str);
        il9 il9Var2 = this.f;
        if (isEmpty) {
            il9Var2.run();
        } else {
            gm.d3(il9Var2, 300L);
        }
        if (this.f != null) {
            i2a i2aVar = this.h;
            if (i2aVar.R) {
                return;
            }
            i2aVar.R = true;
            i2aVar.x.E();
            i2aVar.y.g1(0, -i2aVar.r.getPaddingTop());
        }
    }
}
