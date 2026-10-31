package zf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f5;
import org.telegram.messenger.f8;
import org.telegram.messenger.i5;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.s4;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.hq;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u20;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class d extends ok0 {
    public ArrayList D;
    public final boolean E;
    public int F;
    public final boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public float M;
    public final Context s;
    public final int w;
    public final boolean x;
    public final a0.h y;
    public final int r = d20.s0;
    public float L = 1.0f;
    public final ArrayList N = new ArrayList();

    public d(Context context, int i10, boolean z10, a0.h hVar, int i11) {
        this.s = context;
        this.w = i10;
        this.x = z10;
        this.y = hVar;
        this.E = i11 != 0;
        this.G = i11 == 2;
    }

    @Override // org.telegram.ui.Components.ak0
    public final String F(int i10) {
        if (this.F == 2 || this.I) {
            return null;
        }
        int i11 = this.r;
        int i12 = this.w;
        i5 r10 = i5.r(i11);
        ArrayList arrayList = i12 == 2 ? r10.j0 : r10.h0;
        int S = S(i10);
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        if (i12 == 0 || this.E) {
            if (S <= 0 || S > arrayList.size()) {
                return null;
            }
            return (String) arrayList.get(S - 1);
        }
        if (S < 0 || S >= arrayList.size()) {
            return null;
        }
        return (String) arrayList.get(S);
    }

    @Override // org.telegram.ui.Components.ak0
    public final void G(tk0 tk0Var, float f7, int[] iArr) {
        iArr[0] = (int) (b() * f7);
        iArr[1] = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.ok0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M(int i10) {
        boolean z10 = this.K;
        int i11 = this.r;
        if (z10) {
            if (i10 == 0) {
                return 1;
            }
            if (i10 == 1) {
                return i5.r(i11).a0.size() + 2;
            }
            return 0;
        }
        int i12 = this.w;
        i5 r10 = i5.r(i11);
        HashMap hashMap = i12 == 2 ? r10.i0 : r10.g0;
        i5 r11 = i5.r(i11);
        ArrayList arrayList = i12 == 2 ? r11.j0 : r11.h0;
        boolean z11 = this.E;
        boolean z12 = this.x;
        if (i12 != 0 && !z11) {
            if (!this.I) {
                if (i10 < arrayList.size()) {
                    int size = ((ArrayList) hashMap.get(arrayList.get(i10))).size();
                    return (i10 != arrayList.size() - 1 || z12) ? size + 1 : size;
                }
                if (z12) {
                }
            }
            return 1;
        }
        if (i10 == 0) {
            if (this.I) {
                return 2;
            }
            return z11 ? 3 : 4;
        }
        if (!this.I) {
            if (this.F != 2) {
                int i13 = i10 - 1;
                if (i13 < arrayList.size()) {
                    int size2 = ((ArrayList) hashMap.get(arrayList.get(i13))).size();
                    arrayList.size();
                    return size2;
                }
            } else if (i10 == 1) {
                if (this.D.isEmpty()) {
                    return 0;
                }
                return this.D.size();
            }
            if (z12) {
                return 0;
            }
            return i5.r(i11).a0.size();
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.ok0
    public final int N(int i10, int i11) {
        return Objects.hash(Integer.valueOf(i10 * (-49612)), O(i10, i11));
    }

    @Override // org.telegram.ui.Components.ok0
    public final Object O(int i10, int i11) {
        int i12;
        boolean z10 = this.K;
        int i13 = this.r;
        if (z10 && i10 == 1 && i11 > 1 && i11 - 2 < i5.r(i13).a0.size()) {
            return i5.r(i13).a0.get(i12);
        }
        if (P(i10, i11) == 2) {
            return "Header";
        }
        int i14 = this.w;
        i5 r10 = i5.r(i13);
        HashMap hashMap = i14 == 2 ? r10.i0 : r10.g0;
        i5 r11 = i5.r(i13);
        ArrayList arrayList = i14 == 2 ? r11.j0 : r11.h0;
        if (i14 != 0 && !this.E) {
            if (i10 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i10));
                if (i11 < arrayList2.size()) {
                    return vp.r1(i13).Z1(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i11)).user_id));
                }
            }
            return null;
        }
        if (i10 == 0) {
            return null;
        }
        if (this.F != 2) {
            int i15 = i10 - 1;
            if (i15 < arrayList.size()) {
                ArrayList arrayList3 = (ArrayList) hashMap.get(arrayList.get(i15));
                if (i11 < arrayList3.size()) {
                    return vp.r1(i13).Z1(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i11)).user_id));
                }
                return null;
            }
        } else if (i10 == 1) {
            if (i11 < this.D.size()) {
                return vp.r1(i13).Z1(Long.valueOf(((TLRPC.TL_contact) this.D.get(i11)).user_id));
            }
            return null;
        }
        if (!this.x || i11 < 0 || i11 >= i5.r(i13).a0.size()) {
            return null;
        }
        return i5.r(i13).a0.get(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[RETURN] */
    @Override // org.telegram.ui.Components.ok0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int P(int i10, int i11) {
        if (this.K) {
            if (i10 == 0) {
                return 4;
            }
            if (i10 != 1) {
                return 8;
            }
            if (i11 == 0) {
                return 5;
            }
            return i11 == 1 ? 7 : 8;
        }
        int i12 = this.w;
        int i13 = this.r;
        i5 r10 = i5.r(i13);
        HashMap hashMap = i12 == 2 ? r10.i0 : r10.g0;
        i5 r11 = i5.r(i13);
        ArrayList arrayList = i12 == 2 ? r11.j0 : r11.h0;
        boolean z10 = this.E;
        if (i12 == 0 || z10) {
            if (i10 == 0) {
                if (z10) {
                    if (i11 == 1) {
                        return 5;
                    }
                    if (i11 == 2) {
                        int i14 = this.F;
                        return (i14 == 1 || i14 == 2) ? 7 : 2;
                    }
                } else if (this.x) {
                    if (i11 >= 2) {
                        if (i11 == 2) {
                            return 5;
                        }
                        if (i11 == 3) {
                            if (this.I) {
                                return 5;
                            }
                            int i15 = this.F;
                            if (i15 == 1 || i15 == 2) {
                                return 7;
                            }
                        }
                    }
                } else {
                    if (i11 == 2) {
                        return 5;
                    }
                    if (i11 == 3) {
                        if (this.I) {
                            return 5;
                        }
                        int i16 = this.F;
                        if (i16 == 1 || i16 == 2) {
                            return 7;
                        }
                    }
                }
            } else {
                if (this.I) {
                    return 4;
                }
                if (this.F != 2) {
                    int i17 = i10 - 1;
                    if (i17 < arrayList.size()) {
                        if (i11 < ((ArrayList) hashMap.get(arrayList.get(i17))).size()) {
                            return 0;
                        }
                    }
                } else if (i10 == 1) {
                    if (i11 < this.D.size()) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        if (this.I) {
            return 4;
        }
        if (i11 < ((ArrayList) hashMap.get(arrayList.get(i10))).size()) {
            return 0;
        }
        return 3;
    }

    @Override // org.telegram.ui.Components.ok0
    public final View T(int i10, View view) {
        int i11 = this.r;
        int i12 = this.w;
        i5.r(i11);
        i5 r10 = i5.r(i11);
        ArrayList arrayList = i12 == 2 ? r10.j0 : r10.h0;
        View view2 = view;
        if (view == null) {
            u4 u4Var = new u4(this.s);
            u4Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.i0.L(76.0f), org.telegram.messenger.i0.L(64.0f)));
            TextView textView = new TextView(u4Var.getContext());
            u4Var.a = textView;
            sc.e.t(textView, 1, 22.0f);
            a7.V(textView, t6.B6, null);
            textView.setGravity(17);
            u4Var.addView(textView, b6.d(-1, -1.0f, zs.E1, 12.0f, 0.0f, 0.0f, 0.0f));
            this.N.add(u4Var);
            view2 = u4Var;
        }
        u4 u4Var2 = (u4) view2;
        float f7 = this.M;
        if (f7 > 0.0f) {
            u4Var2.setLetterTextSize(f7);
        }
        u4Var2.setLetterProgress(this.L);
        if (this.F == 2 || this.H || this.I) {
            u4Var2.setLetter("");
            return view2;
        }
        if (i12 != 0 && !this.E) {
            if (i10 < arrayList.size()) {
                u4Var2.setLetter((String) arrayList.get(i10));
                return view2;
            }
            u4Var2.setLetter("");
            return view2;
        }
        if (i10 == 0) {
            u4Var2.setLetter("");
            return view2;
        }
        int i13 = i10 - 1;
        if (i13 < arrayList.size()) {
            u4Var2.setLetter((String) arrayList.get(i13));
            return view2;
        }
        u4Var2.setLetter("");
        return view2;
    }

    @Override // org.telegram.ui.Components.ok0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (!this.K) {
            int i12 = this.w;
            int i13 = this.r;
            i5 r10 = i5.r(i13);
            HashMap hashMap = i12 == 2 ? r10.i0 : r10.g0;
            i5 r11 = i5.r(i13);
            ArrayList arrayList = i12 == 2 ? r11.j0 : r11.h0;
            boolean z10 = this.E;
            if (i12 == 0 || z10) {
                if (i10 == 0) {
                    if (z10) {
                        if (i11 >= 1) {
                            return false;
                        }
                    } else if (this.x) {
                        if (i11 >= 2) {
                            return false;
                        }
                    } else if (i11 >= 3) {
                        return false;
                    }
                } else {
                    if (this.I) {
                        return false;
                    }
                    if (this.F != 2) {
                        int i14 = i10 - 1;
                        if (i14 < arrayList.size() && i11 >= ((ArrayList) hashMap.get(arrayList.get(i14))).size()) {
                            return false;
                        }
                    } else if (i10 == 1 && i11 >= this.D.size()) {
                        return false;
                    }
                }
            } else if (this.I || i11 >= ((ArrayList) hashMap.get(arrayList.get(i10))).size()) {
                return false;
            }
        } else if (i10 != 1 || i11 <= 1) {
            return false;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        ArrayList arrayList;
        int i12 = c1Var.f;
        View view = c1Var.a;
        int i13 = 7;
        boolean z10 = this.E;
        int i14 = this.r;
        if (i12 == 0) {
            pa paVar = (pa) view;
            paVar.T.a = false;
            if (this.F != 2 && !this.H) {
                i13 = 58;
            }
            paVar.b(i13, 1);
            if (this.F == 2) {
                arrayList = this.D;
            } else {
                int i15 = this.w;
                i5 r10 = i5.r(i14);
                arrayList = (ArrayList) (i15 == 2 ? r10.i0 : r10.g0).get((i15 == 2 ? i5.r(i14).j0 : i5.r(i14).h0).get(i10 - ((i15 == 0 || z10) ? 1 : 0)));
            }
            TLRPC.User Z1 = vp.r1(i14).Z1(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i11)).user_id));
            paVar.d(Z1, null, null, false);
            paVar.c(this.y.h(Z1.id) >= 0, false);
            return;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                z3 z3Var = (z3) view;
                int i16 = this.F;
                if (i16 == 0) {
                    z3Var.setText(cd.L0(2131751780, null));
                    return;
                } else if (i16 == 1) {
                    z3Var.setText(cd.L0(2131745302, null));
                    return;
                } else {
                    z3Var.setText(cd.L0(2131745303, null));
                    return;
                }
            }
            if (i12 == 4) {
                view.setPadding(0, org.telegram.messenger.i0.L(!this.J ? 96.0f : 25.0f), 0, org.telegram.messenger.i0.L(18.0f));
                return;
            }
            if (i12 != 7) {
                if (i12 != 8) {
                    return;
                }
                s4 s4Var = (s4) view;
                int i17 = i11 - 2;
                if (i17 < 0 || i17 >= i5.r(i14).a0.size()) {
                    return;
                }
                s4Var.a((f5) i5.r(i14).a0.get(i17), null);
                return;
            }
            p4 p4Var = (p4) view;
            if (this.K && i11 == 1 && i10 == 1) {
                p4Var.setText(cd.L0(2131749161, null));
                return;
            } else if (this.F == 1) {
                p4Var.setText(cd.L0(2131745302, null));
                return;
            } else {
                p4Var.setText(cd.L0(2131745303, null));
                return;
            }
        }
        p8 p8Var = (p8) view;
        boolean z11 = this.x;
        if (z11 || !z10) {
            int i18 = t6.G6;
            p8Var.g(i18, i18);
        } else {
            int i19 = t6.Wl;
            p8Var.g(i19, i19);
        }
        if (i10 != 0) {
            f5 f5Var = (f5) i5.r(i14).a0.get(i11);
            String str = f5Var.i;
            if (str == null || f5Var.j == null) {
                if (str == null || f5Var.j != null) {
                    p8Var.k(f5Var.j, false);
                    return;
                } else {
                    p8Var.k(str, false);
                    return;
                }
            }
            p8Var.k(f5Var.i + " " + f5Var.j, false);
            return;
        }
        if (z11) {
            if (i11 == 0) {
                p8Var.r(cd.L0(2131749161, null), "", false, R.drawable.settings_invite, -14899731, -15431455, false);
                return;
            } else {
                if (i11 == 1) {
                    p8Var.r(cd.L0(2131746384, null), "", false, R.drawable.settings_calls, -11154873, -14175180, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            if (this.G) {
                p8Var.o(R.drawable.msg_link2, cd.L0(2131752402, null), false);
                return;
            } else {
                p8Var.o(R.drawable.msg_link2, cd.L0(2131749120, null), false);
                return;
            }
        }
        if (i11 == 0) {
            p8Var.r(cd.L0(2131748290, null), "", false, R.drawable.settings_group, -14899731, -15431455, false);
        } else if (i11 == 1) {
            p8Var.r(cd.L0(2131748300, null), "", false, R.drawable.settings_channel, -11154873, -14175180, false);
        }
    }

    public final void Y(int i10, boolean z10) {
        this.F = i10;
        if (i10 != 2) {
            f();
            return;
        }
        if (this.D == null || z10) {
            int i11 = this.r;
            this.D = new ArrayList(i5.r(i11).e0);
            long j10 = d20.i(i11).n;
            int size = this.D.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    break;
                }
                if (((TLRPC.TL_contact) this.D.get(i12)).user_id == j10) {
                    this.D.remove(i12);
                    break;
                }
                i12++;
            }
        }
        Z();
    }

    public final void Z() {
        int i10 = this.r;
        if (this.D == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            Collections.sort(this.D, new u20(vp.r1(i10), currentTime, 1));
            f();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        Context context = this.s;
        if (i10 == 0) {
            pa paVar = new pa(context, 58, 1, false);
            paVar.setCallCellStyle(58);
            view = paVar;
        } else if (i10 == 1) {
            view = new p8(context);
        } else if (i10 == 2) {
            view = new z3(context, null);
        } else if (i10 != 3) {
            if (i10 == 4) {
                FrameLayout kVar = new ph.k(this, context, viewGroup);
                kVar.addView(new hq(context), b6.e(-1, -2, 17));
                kVar.setLayoutParams(new s4.o0(-1, -2));
                kVar.setTag(-33024);
                view2 = kVar;
            } else if (i10 == 7) {
                view = new p4(this.s, t6.L6, 21, 14, 5, false, false, null);
            } else if (i10 == 8) {
                view = new s4(context, false);
            } else if (i10 != 9) {
                view = new c7(context, (org.telegram.ui.Cells.f1) null);
            } else {
                View bnVar = new bn(context, 28);
                bnVar.setId(9);
                bnVar.setTag(-33024);
                view2 = bnVar;
            }
            view = view2;
        } else {
            View g3Var = new g3(context, null);
            g3Var.setPadding(org.telegram.messenger.i0.L(cd.X ? 28.0f : 72.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(cd.X ? 72.0f : 28.0f), org.telegram.messenger.i0.L(8.0f));
            view = g3Var;
        }
        return new ck0(view);
    }
}
