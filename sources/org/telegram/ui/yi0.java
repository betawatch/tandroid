package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yi0 implements r9, org.telegram.ui.Components.zh {
    public final /* synthetic */ yj0 a;

    public /* synthetic */ yi0(yj0 yj0Var) {
        this.a = yj0Var;
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ boolean L1() {
        return false;
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ String M0() {
        return null;
    }

    @Override // org.telegram.ui.r9
    public void V0(org.telegram.messenger.rr rrVar) {
        boolean isEmpty = TextUtils.isEmpty(rrVar.b);
        yj0 yj0Var = this.a;
        if (!isEmpty) {
            yj0Var.Z[0].setText(rrVar.b);
        }
        if (!TextUtils.isEmpty(rrVar.d)) {
            yj0Var.Z[1].setText(rrVar.d);
        }
        if (!TextUtils.isEmpty(rrVar.c)) {
            yj0Var.Z[2].setText(rrVar.c);
        }
        int i3 = rrVar.n;
        if (i3 != 0) {
            if (i3 == 1) {
                yj0Var.x = "male";
                yj0Var.Z[4].setText(org.telegram.messenger.bd.M0(2131747516, null));
            } else if (i3 == 2) {
                yj0Var.x = "female";
                yj0Var.Z[4].setText(org.telegram.messenger.bd.M0(2131747577, null));
            }
        }
        if (!TextUtils.isEmpty(rrVar.m)) {
            String str = rrVar.m;
            yj0Var.s = str;
            String str2 = (String) yj0Var.Z0.get(str);
            if (str2 != null) {
                yj0Var.Z[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(rrVar.l)) {
            String str3 = rrVar.l;
            yj0Var.w = str3;
            String str4 = (String) yj0Var.Z0.get(str3);
            if (str4 != null) {
                yj0Var.Z[6].setText(str4);
            }
        }
        int i10 = rrVar.k;
        if (i10 <= 0 || rrVar.j <= 0 || rrVar.i <= 0) {
            return;
        }
        yj0Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(rrVar.j), Integer.valueOf(rrVar.i)));
    }

    @Override // org.telegram.ui.Components.zh
    public void Y(org.telegram.ui.Components.ng ngVar) {
        ngVar.run();
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ boolean e1(String str, i9 i9Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.zh
    public void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        org.telegram.ui.Components.bi biVar;
        yj0 yj0Var = this.a;
        if (yj0Var.getParentActivity() == null || (biVar = yj0Var.S0) == null) {
            return;
        }
        if (i3 != 8 && i3 != 7) {
            biVar.L(i3);
            yj0Var.J1(i3);
            return;
        }
        if (i3 != 8) {
            biVar.a(true);
        }
        HashMap<Object, Object> selectedPhotos = yj0Var.S0.b2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = yj0Var.S0.b2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
            org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) selectedPhotos.get(selectedPhotosOrder.get(i12));
            org.telegram.messenger.xy xyVar = new org.telegram.messenger.xy();
            String str = yeVar.h;
            if (str != null) {
                xyVar.c = str;
            } else {
                xyVar.c = yeVar.I;
            }
            arrayList.add(xyVar);
            yeVar.e();
        }
        yj0Var.K1(arrayList);
    }

    @Override // org.telegram.ui.Components.zh
    public void v0() {
        org.telegram.messenger.g0.v1(this.a.fragmentView.findFocus());
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void I0(Object obj) {
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void M(String str) {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void a1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void r0() {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }
}
