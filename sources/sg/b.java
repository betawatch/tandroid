package sg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.voip.u2;
import pf.o1;
import td.c;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class b extends ViewGroup {
    public int a;
    public int b;
    public final LinkedHashMap c;

    public b(Context context) {
        super(context);
        this.c = new LinkedHashMap(16);
    }

    public final void a(u2 u2Var) {
        addView(u2Var);
        this.c.put(u2Var, new a(u2Var, new o1(this, 7)));
    }

    public final void b(boolean z10, boolean z11) {
        int min;
        int i9;
        c cVar;
        int measuredWidth;
        int i10;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        boolean z12 = measuredWidth2 <= measuredHeight;
        if (measuredWidth2 <= 0 || measuredHeight <= 0) {
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        Iterator it = linkedHashMap.values().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (((a) it.next()).h) {
                i11++;
            }
        }
        if (i11 == 0) {
            i11 = 1;
        }
        if (z12) {
            min = Math.min(AndroidUtilities.dp(50.0f) + Math.max((int) (ll.A(50.0f, i11, measuredHeight) / (i11 + 0.333f)), 0), measuredHeight / i11);
            i9 = (measuredHeight - (i11 * min)) / 2;
        } else {
            int min2 = Math.min(AndroidUtilities.dp(50.0f) + Math.max((int) (ll.A(50.0f, i11, measuredWidth2) / (i11 + 0.333f)), 0), measuredWidth2 / i11);
            min = AndroidUtilities.dp(76.0f);
            i9 = (measuredWidth2 - (i11 * min2)) / 2;
            measuredWidth2 = min2;
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            a aVar = (a) ((Map.Entry) it2.next()).getValue();
            boolean z13 = aVar.h;
            u2 u2Var = aVar.e;
            c cVar2 = aVar.b;
            td.a aVar2 = aVar.c;
            c cVar3 = aVar.a;
            if (z13) {
                if (z12) {
                    measuredWidth = ((measuredWidth2 - u2Var.getMeasuredWidth()) / 2) + (getMeasuredWidth() - measuredWidth2);
                    i10 = (min * i12) + i9;
                } else {
                    measuredWidth = ((measuredWidth2 - u2Var.getMeasuredWidth()) / 2) + (measuredWidth2 * i12) + i9;
                    i10 = getMeasuredHeight() - AndroidUtilities.dp(76.0f);
                }
                if (z11 || !((z10 || cVar3.g) && aVar2.f)) {
                    cVar3.c(measuredWidth);
                } else {
                    cVar3.a(measuredWidth);
                }
                if (z11 || !((z10 || cVar2.g) && aVar2.f)) {
                    cVar2.c(i10);
                } else {
                    cVar2.a(i10);
                }
                i12++;
            }
            aVar2.a(aVar.h, !z11 && (z10 || ((cVar = aVar2.h) != null && cVar.g)));
        }
        invalidate();
    }

    public final void c(u2 u2Var, boolean z10, boolean z11) {
        a aVar = (a) this.c.get(u2Var);
        if (aVar == null || aVar.h == z10) {
            return;
        }
        aVar.h = z10;
        b(z11, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), TLObject.FLAG_30);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).measure(makeMeasureSpec, makeMeasureSpec2);
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
