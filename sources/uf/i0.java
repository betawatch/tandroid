package uf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.u00;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class i0 extends c {
    public final Context H;
    public final g6 I;
    public boolean J;

    public i0(Context context, g6 g6Var, boolean z4, boolean z10) {
        super(z4, z10);
        this.J = false;
        this.H = context;
        this.I = g6Var;
        new u00(context, null).setIsSingleCell(true);
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
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
        if (this.G) {
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

    @Override // f2.p0
    public final int h() {
        ArrayList arrayList = this.r;
        int size = !arrayList.isEmpty() ? arrayList.size() + 1 : 0;
        if (this.J) {
            return size;
        }
        if (this.G) {
            return size + 3;
        }
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.s;
        if (!isEmpty && !arrayList2.isEmpty()) {
            size++;
        }
        return arrayList2.size() + size;
    }

    @Override // f2.p0
    public final int j(int i10) {
        ArrayList arrayList = this.r;
        return ((i10 == 0 || i10 == arrayList.size() + 1) && !arrayList.isEmpty()) ? 1 : 0;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i11;
        int i12 = m1Var.f;
        View view = m1Var.a;
        boolean z4 = true;
        ArrayList arrayList = this.r;
        if (i12 != 0) {
            if (i12 == 1) {
                if (i10 != 0 || arrayList.isEmpty()) {
                    ((u3) view).setText(LocaleController.getString(R.string.NearbyVenue));
                    return;
                } else {
                    ((u3) view).setText(LocaleController.getString(R.string.LocationOnMap));
                    return;
                }
            }
            return;
        }
        int i13 = !arrayList.isEmpty() ? i10 - 1 : i10;
        if (i13 < 0 || i13 >= arrayList.size()) {
            if (!this.G) {
                int size = i13 - arrayList.size();
                if (!this.n && !arrayList.isEmpty()) {
                    size--;
                }
                i11 = size;
                if (i11 >= 0) {
                    ArrayList arrayList2 = this.s;
                    if (i11 < arrayList2.size()) {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(i11);
                    }
                }
            }
            tL_messageMediaVenue = null;
            i11 = i10;
        } else {
            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i13);
            i11 = 2;
        }
        u4 u4Var = (u4) view;
        if (i10 == h() - 1 || (!this.n && !arrayList.isEmpty() && i10 == arrayList.size())) {
            z4 = false;
        }
        u4Var.b(tL_messageMediaVenue, i11, z4, false);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        g6 g6Var = this.I;
        Context context = this.H;
        return new el0(i10 == 0 ? new u4(context, g6Var) : new u3(context, g6Var));
    }
}
