// default package

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class z37 extends v55 {
    public final /* synthetic */ byte S;
    public final /* synthetic */ KeyEvent.Callback T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z37(KeyEvent.Callback callback, byte b) {
        super(true);
        this.S = b;
        this.T = callback;
    }

    @Override // v55
    public final boolean A1(View view) {
        switch (this.S) {
            case 0:
                if (view instanceof wb2) {
                    break;
                }
                break;
            case 1:
                break;
            default:
                if (view instanceof wb2) {
                    break;
                }
                break;
        }
        return !((wb2) view).getMessageObject().O3();
    }

    @Override // u55, x46, q79
    public final void a0(oh2 oh2Var, c89 c89Var) {
        switch (this.S) {
            case 1:
                boolean z = f11.a;
                try {
                    super.a0(oh2Var, c89Var);
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    hl.c3(new z96(this, (byte) 25));
                    return;
                }
            default:
                super.a0(oh2Var, c89Var);
                break;
        }
    }

    @Override // x46, q79
    public final int j(c89 c89Var) {
        switch (this.S) {
            case 2:
                return A0(c89Var);
            default:
                return super.j(c89Var);
        }
    }

    @Override // u55, x46, q79
    public final int k(c89 c89Var) {
        switch (this.S) {
            case 2:
                return B0(c89Var);
            default:
                return super.k(c89Var);
        }
    }

    @Override // u55, x46, q79
    public final int l(c89 c89Var) {
        switch (this.S) {
            case 2:
                return C0(c89Var);
            default:
                return super.l(c89Var);
        }
    }

    @Override // u55, x46, q79
    public final boolean x0() {
        switch (this.S) {
            case 0:
                return false;
            case 1:
            default:
                return super.x0();
            case 2:
                return true;
        }
    }

    @Override // v55
    public final boolean z1(int i) {
        j47 d;
        byte b;
        byte b2;
        byte b3;
        byte b4 = this.S;
        KeyEvent.Callback callback = this.T;
        switch (b4) {
            case 0:
                vw7 vw7Var = (vw7) callback;
                ArrayList arrayList = vw7Var.u0;
                int size = (arrayList.size() - 1) - i;
                m47 m47Var = vw7Var.v0;
                if (m47Var != null && size >= 0 && size < arrayList.size() && (d = m47Var.d((r47) arrayList.get(size))) != null && d.a != d.b && (b = d.c) == d.d && b != 0) {
                    int size2 = m47Var.e.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        j47 j47Var = (j47) m47Var.e.get(i2);
                        if (j47Var != d) {
                            byte b5 = j47Var.c;
                            byte b6 = d.c;
                            if (b5 <= b6 && j47Var.d >= b6) {
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                m57 m57Var = (m57) callback;
                r47 r47Var = (r47) m57Var.r.f.get(i);
                m47 c = m57Var.c(r47Var);
                if (c != null) {
                    ArrayList arrayList2 = c.e;
                    j47 d2 = c.d(r47Var);
                    if (d2.a != d2.b && (b2 = d2.c) == d2.d && b2 != 0) {
                        int size3 = arrayList2.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            j47 j47Var2 = (j47) arrayList2.get(i3);
                            if (j47Var2 != d2) {
                                byte b7 = j47Var2.c;
                                byte b8 = d2.c;
                                if (b7 <= b8 && j47Var2.d >= b8) {
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                q67 q67Var = (q67) callback;
                r47 r47Var2 = (r47) q67Var.N.get((A() - 1) - i);
                m47 j = q67Var.j(r47Var2);
                if (j != null) {
                    ArrayList arrayList3 = j.e;
                    j47 d3 = j.d(r47Var2);
                    if (d3.a != d3.b && (b3 = d3.c) == d3.d && b3 != 0) {
                        int size4 = arrayList3.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            j47 j47Var3 = (j47) arrayList3.get(i4);
                            if (j47Var3 != d3) {
                                byte b9 = j47Var3.c;
                                byte b10 = d3.c;
                                if (b9 <= b10 && j47Var3.d >= b10) {
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
        return false;
    }
}
