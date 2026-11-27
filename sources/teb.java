// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class teb extends mf5 {
    public final in r;

    public teb(Context context, vnb vnbVar) {
        super(context, vnbVar);
        in inVar = new in(context, true, true, true);
        this.r = inVar;
        inVar.b(0.45f, 240L, k43.h);
        inVar.setGravity(ob6.a0 ? 3 : 5);
        inVar.setTextSize(hl.L(15.0f));
        inVar.setTypeface(hl.o());
        yob.U(inVar, aob.L6, vnbVar);
        addView(inVar, tre.d(-2, 24.0f, (ob6.a0 ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        yob.h(aob.h5, vnbVar, this);
    }
}
