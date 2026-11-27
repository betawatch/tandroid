// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
