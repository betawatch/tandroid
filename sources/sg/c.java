package sg;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class c extends b {
    public d d;

    @Override // sg.b
    public final s4.h0 a() {
        d dVar = new d(UserConfig.selectedAccount, this.a);
        this.d = dVar;
        dVar.r = this;
        return dVar;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d dVar = this.d;
        Context context = getContext();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ArrayList arrayList = dVar.f;
        f fVar = new f(context, dVar.c);
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            fVar.a((e) arrayList.get(i13));
            fVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_31));
            ((e) arrayList.get(i13)).e = i12;
            i12 += fVar.getMeasuredHeight();
        }
        dVar.n = i12;
    }
}
