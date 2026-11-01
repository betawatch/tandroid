package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tt0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.wp b;

    public /* synthetic */ tt0(org.telegram.messenger.wp wpVar, int i10) {
        this.a = i10;
        this.b = wpVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        du0 du0Var = (du0) obj;
        du0 du0Var2 = (du0) obj2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = this.b.O0;
                i10 = sparseIntArray.get(du0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i11 = sparseIntArray.get(du0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.b.N0;
                i10 = sparseIntArray2.get(du0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i11 = sparseIntArray2.get(du0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
        }
        return i10 - i11;
    }
}
