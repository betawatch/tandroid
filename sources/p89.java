// default package

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class p89 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z99 b;

    public /* synthetic */ p89(z99 z99Var, byte b) {
        this.a = b;
        this.b = z99Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r12 != false) goto L22;
     */
    @Override // p8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        l5c l5cVar;
        byte b = this.a;
        z99 z99Var = this.b;
        switch (b) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                q99 q99Var = z99Var.d;
                int i = q99Var.e;
                HashSet hashSet = q99Var.l;
                ArrayList arrayList = q99Var.h;
                HashSet hashSet2 = q99Var.k;
                ArrayList arrayList2 = q99Var.g;
                HashSet hashSet3 = q99Var.j;
                ArrayList arrayList3 = q99Var.f;
                boolean z = false;
                if (i <= 12 && !q99Var.f()) {
                    boolean z2 = q99Var.r;
                    boolean z3 = q99Var.s;
                    boolean z4 = q99Var.t;
                    q99Var.j();
                    boolean z5 = (q99Var.g() && !q99Var.r) || (q99Var.h() && !q99Var.s);
                    q99Var.r = z2;
                    q99Var.s = z3;
                    q99Var.t = z4;
                    break;
                }
                z99Var.g0(true, true);
                i24 i24Var = z99Var.f;
                if (i24Var != null && (l5cVar = i24Var.g3) != null) {
                    l5cVar.O(true);
                    if (booleanValue) {
                        z99Var.f.w0(0);
                    }
                }
                z99Var.k0();
                i99 i99Var = z99Var.F;
                if (i99Var != null) {
                    i99Var.setSorting(q99Var.p);
                }
                if (z99Var.G != null) {
                    int size = arrayList3.size() - hashSet3.size();
                    z99Var.G.setValue((size <= 0 || size == arrayList3.size()) ? k96.M0(2131750007, null) : k96.H(',', "Gift2ResaleFilterModels", size));
                }
                if (z99Var.H != null) {
                    int size2 = arrayList2.size() - hashSet2.size();
                    z99Var.H.setValue((size2 <= 0 || size2 == arrayList2.size()) ? k96.M0(2131750011, null) : k96.H(',', "Gift2ResaleFilterBackdrops", size2));
                }
                if (z99Var.I != null) {
                    int size3 = arrayList.size() - hashSet.size();
                    z99Var.I.setValue((size3 <= 0 || size3 == arrayList.size()) ? k96.M0(2131750003, null) : k96.H(',', "Gift2ResaleFilterSymbols", size3));
                }
                if (z99Var.f != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < z99Var.f.getChildCount()) {
                            if (z99Var.f.getChildAt(i2) instanceof pi4) {
                                q99Var.l(false);
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                if ((q99Var.y || q99Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
                    z = true;
                }
                z99Var.a.a(z, true);
                break;
            default:
                z99Var.b0((Integer) obj);
                break;
        }
    }
}
