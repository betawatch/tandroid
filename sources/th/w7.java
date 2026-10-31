package th;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w7 {
    public static final w7[] f = new w7[4];
    public final int a;
    public final LongSparseLongArray b = new LongSparseLongArray();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final v7 e;

    public w7(int i10) {
        new ArrayList();
        this.e = new v7(this);
        this.a = i10;
    }

    public final void a(tk0 tk0Var) {
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.c;
        arrayList.clear();
        for (int i10 = 0; i10 < tk0Var.getChildCount(); i10++) {
            View childAt = tk0Var.getChildAt(i10);
            long dialogId = childAt instanceof org.telegram.ui.Cells.v2 ? ((org.telegram.ui.Cells.v2) childAt).getDialogId() : childAt instanceof pa ? ((pa) childAt).getDialogId() : 0L;
            int i11 = this.a;
            LongSparseLongArray longSparseLongArray = this.b;
            if (dialogId > 0) {
                TLRPC.User Z1 = vp.r1(i11).Z1(Long.valueOf(dialogId));
                if (Z1 != null && !Z1.bot && !Z1.self && !Z1.contact && (userStatus = Z1.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, currentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            } else {
                TLRPC.Chat L0 = vp.r1(i11).L0(Long.valueOf(-dialogId));
                if (org.telegram.messenger.w3.T(L0) && !org.telegram.messenger.w3.p0(L0) && currentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, currentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.d.addAll(arrayList);
        v7 v7Var = this.e;
        org.telegram.messenger.i0.r(v7Var);
        org.telegram.messenger.i0.h3(v7Var, 300L);
    }
}
