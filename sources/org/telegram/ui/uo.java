package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uo extends org.telegram.ui.Components.wk0 {
    public static final /* synthetic */ int X2 = 0;
    public final to T2;
    public boolean U2;
    public final Paint V2;
    public final /* synthetic */ vo W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo(vo voVar, Context context) {
        super(context, null);
        this.W2 = voVar;
        this.U2 = false;
        this.V2 = new Paint(1);
        to toVar = new to(this);
        this.T2 = toVar;
        setAdapter(toVar);
        setLayoutManager(new f2.m0());
        setOnItemClickListener(new so(this));
        new f2.h0(new jh.f(this, 1)).d(this);
    }

    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int R;
        int size = this.W2.J.size();
        int i9 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i10 = TLObject.FLAG_31;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && (R = RecyclerView.R(childAt)) >= 1 && R <= size) {
                i9 = Math.min(childAt.getTop(), i9);
                i10 = Math.max(childAt.getBottom(), i10);
            }
        }
        if (i9 < i10) {
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, this.l2);
            Paint paint = this.V2;
            paint.setColor(v02);
            canvas2 = canvas;
            canvas2.drawRect(0.0f, i9, getWidth(), i10, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(9999999, TLObject.FLAG_31));
    }

    public final void w1(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        TLRPC.TL_username tL_username2;
        int min;
        vo voVar = this.W2;
        ArrayList arrayList = voVar.J;
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) == tL_username) {
                int i11 = i10 + 1;
                if (i10 < 0 || i10 >= arrayList.size() || (tL_username2 = (TLRPC.TL_username) arrayList.get(i10)) == null) {
                    return;
                }
                int i12 = -1;
                if (tL_username2.active != z10) {
                    tL_username2.active = z10;
                    if (z10) {
                        int i13 = 0;
                        while (true) {
                            if (i13 >= arrayList.size()) {
                                i13 = -1;
                                break;
                            } else if (!((TLRPC.TL_username) arrayList.get(i13)).active) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (i13 >= 0) {
                            min = Math.max(0, i13 - 1);
                            i12 = min + 1;
                        }
                    } else {
                        int i14 = -1;
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            if (((TLRPC.TL_username) arrayList.get(i15)).active) {
                                i14 = i15;
                            }
                        }
                        if (i14 >= 0) {
                            min = Math.min(arrayList.size() - 1, i14 + 1);
                            i12 = min + 1;
                        }
                    }
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= getChildCount()) {
                        break;
                    }
                    View childAt = getChildAt(i16);
                    if (RecyclerView.R(childAt) == i11) {
                        if (z11) {
                            AndroidUtilities.shakeView(childAt);
                        }
                        if (childAt instanceof ja) {
                            ja jaVar = (ja) childAt;
                            jaVar.setLoading(voVar.L.contains(tL_username2.username));
                            TLRPC.TL_username tL_username3 = jaVar.v;
                            if (tL_username3 != null) {
                                jaVar.a(tL_username3, jaVar.w, true, jaVar.x);
                            }
                        }
                    } else {
                        i16++;
                    }
                }
                if (i12 < 0 || i11 == i12) {
                    return;
                }
                int i17 = i12 - 1;
                to toVar = this.T2;
                ArrayList arrayList2 = toVar.c.W2.J;
                if (i10 >= arrayList2.size() || i17 >= arrayList2.size()) {
                    return;
                }
                arrayList2.add(i17, (TLRPC.TL_username) arrayList2.remove(i10));
                toVar.p(i11, i12);
                while (i9 < arrayList2.size()) {
                    i9++;
                    toVar.m(i9);
                }
                return;
            }
        }
    }
}
