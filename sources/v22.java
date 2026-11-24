// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class v22 extends n39 {
    public final /* synthetic */ byte c;
    public final Context d;
    public ArrayList e;
    public final ArrayList f;
    public Object h;
    public final /* synthetic */ Object n;

    public v22(qx2 qx2Var, Context context, HashMap hashMap) {
        this.c = (byte) 1;
        this.n = qx2Var;
        this.f = new ArrayList();
        this.d = context;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                this.f.add((mx2) it2.next());
            }
        }
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        switch (this.c) {
            case 0:
                if (s49Var.f != 1) {
                }
                break;
        }
        return true;
    }

    public final w22 E(int i) {
        int k;
        ArrayList arrayList = (ArrayList) this.h;
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        if (i < size) {
            return (w22) arrayList2.get(i);
        }
        if (!this.f.isEmpty() || arrayList.isEmpty() || i == size || i == size + 1 || (k = ir2.k(2, i, arrayList2)) >= arrayList.size()) {
            return null;
        }
        return (w22) arrayList.get(k);
    }

    @Override // w39
    public final int b() {
        switch (this.c) {
            case 0:
                ArrayList arrayList = (ArrayList) this.h;
                int size = this.e.size();
                if (this.f.isEmpty() && !arrayList.isEmpty()) {
                    size += arrayList.size() + 2;
                }
                return size + 1;
            default:
                ArrayList arrayList2 = this.e;
                if (arrayList2 == null) {
                    return 0;
                }
                return arrayList2.size();
        }
    }

    @Override // w39
    public final int d(int i) {
        switch (this.c) {
            case 0:
                if (i == b() - 1) {
                    return 3;
                }
                int size = this.e.size();
                if (i == size) {
                    return 2;
                }
                return i != size + 1 ? 1 : 0;
            default:
                return 0;
        }
    }

    @Override // w39
    public final void f() {
        switch (this.c) {
            case 0:
                super.f();
                ((d32) this.n).Y();
                break;
            default:
                super.f();
                break;
        }
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        byte b = this.c;
        Object obj = this.n;
        String str = null;
        switch (b) {
            case 0:
                d32 d32Var = (d32) obj;
                int i2 = s49Var.f;
                View view = s49Var.a;
                if (i2 == 0) {
                    ld5 ld5Var = (ld5) view;
                    if (!d32Var.d0) {
                        ld5Var.setText(k96.M0(2131746175, null));
                        break;
                    } else {
                        ld5Var.setText(k96.M0(2131746174, null));
                        break;
                    }
                } else if (i2 == 1) {
                    w22 E = E(i);
                    iba ibaVar = (iba) view;
                    int i3 = E.a;
                    if (i3 != 0) {
                        ibaVar.d(E.b, E.c, null, null, i3, i != this.e.size() - 1);
                    } else {
                        ibaVar.d(E.b, E.c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
                    }
                    File file = E.f;
                    if (file == null) {
                        ibaVar.b(false, !d32Var.V);
                        break;
                    } else {
                        ibaVar.b(d32Var.S.containsKey(file.toString()), !d32Var.V);
                        break;
                    }
                }
                break;
            default:
                mx2 mx2Var = (mx2) this.e.get(i);
                uib uibVar = (uib) s49Var.a;
                CharSequence m = vu3.m(qx2.Z(mx2Var), uibVar.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
                if (((qx2) obj).h) {
                    str = "+" + mx2Var.c;
                }
                uibVar.c(m, str, false, false);
                break;
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View ld5Var;
        byte b = this.c;
        Context context = this.d;
        switch (b) {
            case 0:
                wjb wjbVar = ((d32) this.n).a;
                if (i == 0) {
                    ld5Var = new ld5(context, wjbVar);
                } else if (i == 1) {
                    ld5Var = new iba(1, wjbVar, context);
                } else if (i != 2) {
                    ld5Var = new View(context);
                    ld5Var.setTag(-33024);
                } else {
                    ld5Var = new b9a(context, (de9) null);
                }
                return new y29(ld5Var);
            default:
                return new y29(qx2.Y(context));
        }
    }

    public v22(d32 d32Var, Context context) {
        this.c = (byte) 0;
        this.n = d32Var;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.d = context;
    }
}
