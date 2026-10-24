package sg;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class c extends b {
    public d d;

    @Override // sg.b
    public final s4.g0 a() {
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
