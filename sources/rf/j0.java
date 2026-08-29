package rf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import f2.n1;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Cells.s4;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class j0 extends c {
    public final Context G;
    public final c6 H;
    public boolean I;

    public j0(Context context, c6 c6Var, boolean z10, boolean z11) {
        super(z10, z11);
        this.I = false;
        this.G = context;
        this.H = c6Var;
        new p00(context, null).setIsSingleCell(true);
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(n1 n1Var) {
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
        if (this.F) {
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
        if (this.I) {
            return size;
        }
        if (this.F) {
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
    public final void v(n1 n1Var, int i10) {
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i11;
        int i12 = n1Var.f;
        View view = n1Var.a;
        boolean z10 = true;
        ArrayList arrayList = this.r;
        if (i12 != 0) {
            if (i12 == 1) {
                if (i10 != 0 || arrayList.isEmpty()) {
                    ((s3) view).setText(LocaleController.getString(R.string.NearbyVenue));
                    return;
                } else {
                    ((s3) view).setText(LocaleController.getString(R.string.LocationOnMap));
                    return;
                }
            }
            return;
        }
        int i13 = !arrayList.isEmpty() ? i10 - 1 : i10;
        if (i13 < 0 || i13 >= arrayList.size()) {
            if (!this.F) {
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
        s4 s4Var = (s4) view;
        if (i10 == h() - 1 || (!this.n && !arrayList.isEmpty() && i10 == arrayList.size())) {
            z10 = false;
        }
        s4Var.b(tL_messageMediaVenue, i11, z10, false);
    }

    @Override // f2.p0
    public final n1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var = this.H;
        Context context = this.G;
        return new vk0(i10 == 0 ? new s4(context, c6Var) : new s3(context, c6Var));
    }
}
