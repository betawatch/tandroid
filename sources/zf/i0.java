package zf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.x4;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.zz;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class i0 extends c {
    public final Context K;
    public final p6 L;
    public boolean M;

    public i0(Context context, p6 p6Var, boolean z10, boolean z11) {
        super(z10, z11);
        this.M = false;
        this.K = context;
        this.L = p6Var;
        new zz(context, null).setIsSingleCell(true);
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final TLRPC.TL_messageMediaVenue I(int i10) {
        ArrayList arrayList = this.r;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            return (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
        }
        if (this.J) {
            return null;
        }
        int size = i10 - arrayList.size();
        if (!arrayList.isEmpty()) {
            size--;
        }
        if (size < 0) {
            return null;
        }
        ArrayList arrayList2 = this.s;
        if (size < arrayList2.size()) {
            return (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
        }
        return null;
    }

    @Override // s4.g0
    public final int b() {
        ArrayList arrayList = this.r;
        int size = !arrayList.isEmpty() ? arrayList.size() + 1 : 0;
        if (this.M) {
            return size;
        }
        if (this.J) {
            return size + 3;
        }
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.s;
        if (!isEmpty && !arrayList2.isEmpty()) {
            size++;
        }
        return arrayList2.size() + size;
    }

    @Override // s4.g0
    public final int d(int i10) {
        ArrayList arrayList = this.r;
        return ((i10 == 0 || i10 == arrayList.size() + 1) && !arrayList.isEmpty()) ? 1 : 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12 = c1Var.f;
        View view = c1Var.a;
        boolean z10 = true;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = null;
        ArrayList arrayList = this.r;
        if (i12 != 0) {
            if (i12 == 1) {
                if (i10 != 0 || arrayList.isEmpty()) {
                    ((z3) view).setText(cd.L0(2131748314, null));
                    return;
                } else {
                    ((z3) view).setText(cd.L0(2131748762, null));
                    return;
                }
            }
            return;
        }
        int i13 = !arrayList.isEmpty() ? i10 - 1 : i10;
        if (i13 < 0 || i13 >= arrayList.size()) {
            if (!this.J) {
                i11 = i13 - arrayList.size();
                if (!this.n && !arrayList.isEmpty()) {
                    i11--;
                }
                if (i11 >= 0) {
                    ArrayList arrayList2 = this.s;
                    if (i11 < arrayList2.size()) {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(i11);
                    }
                }
            }
            i11 = i10;
        } else {
            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i13);
            i11 = 2;
        }
        x4 x4Var = (x4) view;
        if (i10 == b() - 1 || (!this.n && !arrayList.isEmpty() && i10 == arrayList.size())) {
            z10 = false;
        }
        x4Var.b(tL_messageMediaVenue, i11, z10, false);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        p6 p6Var = this.L;
        Context context = this.K;
        return new ck0(i10 == 0 ? new x4(context, p6Var) : new z3(context, p6Var));
    }
}
