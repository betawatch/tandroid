package xg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.voip.v2;
import vh.z1;
import xd.c;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class b extends ViewGroup {
    public int a;
    public int b;
    public final LinkedHashMap c;

    public b(Context context) {
        super(context);
        this.c = new LinkedHashMap(16);
    }

    public final void a(v2 v2Var) {
        addView(v2Var);
        this.c.put(v2Var, new a(v2Var, new z1(this, 1)));
    }

    public final void b(boolean z4, boolean z10) {
        int min;
        int i10;
        c cVar;
        int measuredWidth;
        int i11;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        boolean z11 = measuredWidth2 <= measuredHeight;
        if (measuredWidth2 <= 0 || measuredHeight <= 0) {
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        Iterator it = linkedHashMap.values().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            if (((a) it.next()).h) {
                i12++;
            }
        }
        if (i12 == 0) {
            i12 = 1;
        }
        if (z11) {
            min = Math.min(AndroidUtilities.dp(50.0f) + Math.max((int) (org.telegram.ui.b.z(50.0f, i12, measuredHeight) / (i12 + 0.333f)), 0), measuredHeight / i12);
            i10 = (measuredHeight - (i12 * min)) / 2;
        } else {
            int min2 = Math.min(AndroidUtilities.dp(50.0f) + Math.max((int) (org.telegram.ui.b.z(50.0f, i12, measuredWidth2) / (i12 + 0.333f)), 0), measuredWidth2 / i12);
            min = AndroidUtilities.dp(76.0f);
            i10 = (measuredWidth2 - (i12 * min2)) / 2;
            measuredWidth2 = min2;
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        int i13 = 0;
        while (it2.hasNext()) {
            a aVar = (a) ((Map.Entry) it2.next()).getValue();
            boolean z12 = aVar.h;
            v2 v2Var = aVar.e;
            c cVar2 = aVar.b;
            xd.a aVar2 = aVar.c;
            c cVar3 = aVar.a;
            if (z12) {
                if (z11) {
                    measuredWidth = ((measuredWidth2 - v2Var.getMeasuredWidth()) / 2) + (getMeasuredWidth() - measuredWidth2);
                    i11 = (min * i13) + i10;
                } else {
                    measuredWidth = ((measuredWidth2 - v2Var.getMeasuredWidth()) / 2) + (measuredWidth2 * i13) + i10;
                    i11 = getMeasuredHeight() - AndroidUtilities.dp(76.0f);
                }
                if (z10 || !((z4 || cVar3.g) && aVar2.f)) {
                    cVar3.c(measuredWidth);
                } else {
                    cVar3.a(measuredWidth);
                }
                if (z10 || !((z4 || cVar2.g) && aVar2.f)) {
                    cVar2.c(i11);
                } else {
                    cVar2.a(i11);
                }
                i13++;
            }
            aVar2.a(aVar.h, !z10 && (z4 || ((cVar = aVar2.h) != null && cVar.g)));
        }
        invalidate();
    }

    public final void c(v2 v2Var, boolean z4, boolean z10) {
        a aVar = (a) this.c.get(v2Var);
        if (aVar == null || aVar.h == z4) {
            return;
        }
        aVar.h = z4;
        b(z10, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), TLObject.FLAG_30);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        if (this.a == size && this.b == size2) {
            b(true, false);
            return;
        }
        b(false, true);
        this.a = size;
        this.b = size2;
    }
}
