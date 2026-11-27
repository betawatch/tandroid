// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
