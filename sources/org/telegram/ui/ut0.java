package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ut0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.vp b;

    public /* synthetic */ ut0(org.telegram.messenger.vp vpVar, int i10) {
        this.a = i10;
        this.b = vpVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        eu0 eu0Var = (eu0) obj;
        eu0 eu0Var2 = (eu0) obj2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = this.b.O0;
                i10 = sparseIntArray.get(eu0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i11 = sparseIntArray.get(eu0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.b.N0;
                i10 = sparseIntArray2.get(eu0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i11 = sparseIntArray2.get(eu0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
        }
        return i10 - i11;
    }
}
