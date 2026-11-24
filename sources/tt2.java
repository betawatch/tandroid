// default package

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class tt2 extends j39 {
    public ArrayList E;
    public final boolean F;
    public byte G;
    public final boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public float N;
    public final Context s;
    public final int w;
    public final boolean x;
    public final vf6 y;
    public final int r = y6c.t0;
    public float M = 1.0f;
    public final ArrayList O = new ArrayList();

    public tt2(Context context, int i, boolean z, vf6 vf6Var, int i2) {
        this.s = context;
        this.w = i;
        this.x = z;
        this.y = vf6Var;
        this.F = i2 != 0;
        this.H = i2 == 2;
    }

    @Override // w29
    public final String F(int i) {
        if (this.G == 2 || this.J) {
            return null;
        }
        int i2 = this.w;
        int i3 = this.r;
        ArrayList arrayList = i2 == 2 ? qu2.r(i3).k0 : qu2.r(i3).i0;
        int S = S(i);
        if (S == -1) {
            S = arrayList.size() - 1;
        }
        if (i2 == 0 || this.F) {
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

    @Override // w29
    public final void G(o39 o39Var, float f, int[] iArr) {
        iArr[0] = (int) (b() * f);
        iArr[1] = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // j39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M(int i) {
        HashMap hashMap;
        ArrayList arrayList;
        boolean z = this.L;
        int i2 = this.r;
        if (z) {
            if (i == 0) {
                return 1;
            }
            if (i == 1) {
                return qu2.r(i2).b0.size() + 2;
            }
            return 0;
        }
        int i3 = this.w;
        qu2 r = qu2.r(i2);
        if (i3 == 2) {
            hashMap = r.j0;
            arrayList = qu2.r(i2).k0;
        } else {
            hashMap = r.h0;
            arrayList = qu2.r(i2).i0;
        }
        boolean z2 = this.F;
        boolean z3 = this.x;
        if (i3 != 0 && !z2) {
            if (!this.J) {
                if (i < arrayList.size()) {
                    int size = ((ArrayList) hashMap.get(arrayList.get(i))).size();
                    return (i != arrayList.size() - 1 || z3) ? size + 1 : size;
                }
                if (z3) {
                }
            }
            return 1;
        }
        boolean z4 = this.J;
        if (i == 0) {
            if (z4) {
                return 2;
            }
            return z2 ? 3 : 4;
        }
        if (!z4) {
            if (this.G != 2) {
                int i4 = i - 1;
                if (i4 < arrayList.size()) {
                    int size2 = ((ArrayList) hashMap.get(arrayList.get(i4))).size();
                    arrayList.size();
                    return size2;
                }
            } else if (i == 1) {
                if (this.E.isEmpty()) {
                    return 0;
                }
                return this.E.size();
            }
            if (z3) {
                return 0;
            }
            return qu2.r(i2).b0.size();
        }
        return 1;
    }

    @Override // j39
    public final int N(int i, int i2) {
        return Objects.hash(Integer.valueOf(i * (-49612)), O(i, i2));
    }

    @Override // j39
    public final Object O(int i, int i2) {
        HashMap hashMap;
        ArrayList arrayList;
        int i3;
        boolean z = this.L;
        int i4 = this.r;
        if (z && i == 1 && i2 > 1 && i2 - 2 < qu2.r(i4).b0.size()) {
            return qu2.r(i4).b0.get(i3);
        }
        if (P(i, i2) == 2) {
            return "Header";
        }
        int i5 = this.w;
        qu2 r = qu2.r(i4);
        if (i5 == 2) {
            hashMap = r.j0;
            arrayList = qu2.r(i4).k0;
        } else {
            hashMap = r.h0;
            arrayList = qu2.r(i4).i0;
        }
        if (i5 != 0 && !this.F) {
            if (i >= arrayList.size()) {
                return null;
            }
            ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i));
            if (i2 < arrayList2.size()) {
                return na7.q1(i4).V1(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i2)).user_id));
            }
            return null;
        }
        if (i == 0) {
            return null;
        }
        if (this.G != 2) {
            int i6 = i - 1;
            if (i6 < arrayList.size()) {
                ArrayList arrayList3 = (ArrayList) hashMap.get(arrayList.get(i6));
                if (i2 < arrayList3.size()) {
                    return na7.q1(i4).V1(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i2)).user_id));
                }
                return null;
            }
        } else if (i == 1) {
            if (i2 < this.E.size()) {
                return na7.q1(i4).V1(Long.valueOf(((TLRPC.TL_contact) this.E.get(i2)).user_id));
            }
            return null;
        }
        if (!this.x || i2 < 0 || i2 >= qu2.r(i4).b0.size()) {
            return null;
        }
        return qu2.r(i4).b0.get(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007d A[RETURN] */
    @Override // j39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int P(int i, int i2) {
        HashMap hashMap;
        ArrayList arrayList;
        if (this.L) {
            if (i == 0) {
                return 4;
            }
            if (i != 1) {
                return 8;
            }
            if (i2 != 0) {
                return i2 != 1 ? 8 : 7;
            }
            return 5;
        }
        int i3 = this.r;
        int i4 = this.w;
        qu2 r = qu2.r(i3);
        if (i4 == 2) {
            hashMap = r.j0;
            arrayList = qu2.r(i3).k0;
        } else {
            hashMap = r.h0;
            arrayList = qu2.r(i3).i0;
        }
        boolean z = this.F;
        if (i4 == 0 || z) {
            if (i == 0) {
                if (z) {
                    if (i2 == 1) {
                        return 5;
                    }
                    if (i2 == 2) {
                        byte b = this.G;
                        return (b == 1 || b == 2) ? 7 : 2;
                    }
                } else if (this.x) {
                    if (i2 >= 2) {
                        if (i2 == 2) {
                            return 5;
                        }
                        if (i2 == 3) {
                            if (this.J) {
                                return 5;
                            }
                            byte b2 = this.G;
                            if (b2 == 1 || b2 == 2) {
                                return 7;
                            }
                        }
                    }
                } else {
                    if (i2 == 2) {
                        return 5;
                    }
                    if (i2 == 3) {
                        if (this.J) {
                            return 5;
                        }
                        byte b3 = this.G;
                        if (b3 == 1 || b3 == 2) {
                            return 7;
                        }
                    }
                }
            } else {
                if (this.J) {
                    return 4;
                }
                if (this.G != 2) {
                    int i5 = i - 1;
                    if (i5 < arrayList.size()) {
                        if (i2 < ((ArrayList) hashMap.get(arrayList.get(i5))).size()) {
                            return 0;
                        }
                    }
                } else if (i == 1) {
                    if (i2 < this.E.size()) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        if (this.J) {
            return 4;
        }
        if (i2 < ((ArrayList) hashMap.get(arrayList.get(i))).size()) {
            return 0;
        }
        return 3;
    }

    @Override // j39
    public final View T(int i, View view) {
        int i2 = this.w;
        int i3 = this.r;
        qu2.r(i3);
        qu2 r = qu2.r(i3);
        ArrayList arrayList = i2 == 2 ? r.k0 : r.i0;
        View view2 = view;
        if (view == null) {
            p06 p06Var = new p06(this.s);
            p06Var.setLayoutParams(new ViewGroup.LayoutParams(gl.L(76.0f), gl.L(64.0f)));
            TextView textView = new TextView(p06Var.getContext());
            p06Var.a = textView;
            ir2.t(textView, 1, 22.0f);
            zkb.X(textView, bkb.A6, null);
            textView.setGravity(17);
            p06Var.addView(textView, nme.d(-1, -1.0f, kk7.D1, 12.0f, 0.0f, 0.0f, 0.0f));
            this.O.add(p06Var);
            view2 = p06Var;
        }
        p06 p06Var2 = (p06) view2;
        float f = this.N;
        if (f > 0.0f) {
            p06Var2.setLetterTextSize(f);
        }
        p06Var2.setLetterProgress(this.M);
        if (this.G == 2 || this.I || this.J) {
            p06Var2.setLetter("");
            return view2;
        }
        if (i2 != 0 && !this.F) {
            if (i < arrayList.size()) {
                p06Var2.setLetter((String) arrayList.get(i));
                return view2;
            }
            p06Var2.setLetter("");
            return view2;
        }
        if (i == 0) {
            p06Var2.setLetter("");
            return view2;
        }
        int i4 = i - 1;
        if (i4 < arrayList.size()) {
            p06Var2.setLetter((String) arrayList.get(i4));
            return view2;
        }
        p06Var2.setLetter("");
        return view2;
    }

    @Override // j39
    public final boolean V(int i, int i2, s49 s49Var) {
        HashMap hashMap;
        ArrayList arrayList;
        if (!this.L) {
            int i3 = this.r;
            int i4 = this.w;
            qu2 r = qu2.r(i3);
            if (i4 == 2) {
                hashMap = r.j0;
                arrayList = qu2.r(i3).k0;
            } else {
                hashMap = r.h0;
                arrayList = qu2.r(i3).i0;
            }
            boolean z = this.F;
            if (i4 == 0 || z) {
                if (i == 0) {
                    if (z) {
                        if (i2 >= 1) {
                            return false;
                        }
                    } else if (this.x) {
                        if (i2 >= 2) {
                            return false;
                        }
                    } else if (i2 >= 3) {
                        return false;
                    }
                } else {
                    if (this.J) {
                        return false;
                    }
                    if (this.G != 2) {
                        int i5 = i - 1;
                        if (i5 < arrayList.size() && i2 >= ((ArrayList) hashMap.get(arrayList.get(i5))).size()) {
                            return false;
                        }
                    } else if (i == 1 && i2 >= this.E.size()) {
                        return false;
                    }
                }
            } else if (this.J || i2 >= ((ArrayList) hashMap.get(arrayList.get(i))).size()) {
                return false;
            }
        } else if (i != 1 || i2 <= 1) {
            return false;
        }
        return true;
    }

    @Override // j39
    public final void W(int i, int i2, s49 s49Var) {
        HashMap hashMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i3 = s49Var.f;
        View view = s49Var.a;
        int i4 = 7;
        boolean z = this.F;
        int i5 = this.r;
        if (i3 == 0) {
            v6c v6cVar = (v6c) view;
            v6cVar.U.a = false;
            if (this.G != 2 && !this.I) {
                i4 = 58;
            }
            v6cVar.b(i4, 1);
            if (this.G == 2) {
                arrayList2 = this.E;
            } else {
                int i6 = this.w;
                qu2 r = qu2.r(i5);
                if (i6 == 2) {
                    hashMap = r.j0;
                    arrayList = qu2.r(i5).k0;
                } else {
                    hashMap = r.h0;
                    arrayList = qu2.r(i5).i0;
                }
                arrayList2 = (ArrayList) hashMap.get(arrayList.get(i - ((i6 == 0 || z) ? 1 : 0)));
            }
            TLRPC.User V1 = na7.q1(i5).V1(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i2)).user_id));
            v6cVar.d(V1, null, null, false);
            v6cVar.c(this.y.h(V1.id) >= 0, false);
            return;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                l35 l35Var = (l35) view;
                byte b = this.G;
                if (b == 0) {
                    l35Var.setText(k96.M0(2131751768, null));
                    return;
                } else if (b == 1) {
                    l35Var.setText(k96.M0(2131745092, null));
                    return;
                } else {
                    l35Var.setText(k96.M0(2131745093, null));
                    return;
                }
            }
            if (i3 == 4) {
                view.setPadding(0, gl.L(!this.K ? 96.0f : 25.0f), 0, gl.L(18.0f));
                return;
            }
            if (i3 != 7) {
                if (i3 == 8) {
                    kr5 kr5Var = (kr5) view;
                    int i7 = i2 - 2;
                    if (i7 < 0 || i7 >= qu2.r(i5).b0.size()) {
                        return;
                    }
                    kr5Var.a((nu2) qu2.r(i5).b0.get(i7), null);
                    return;
                }
                return;
            }
            ld5 ld5Var = (ld5) view;
            if (this.L && i2 == 1 && i == 1) {
                ld5Var.setText(k96.M0(2131748959, null));
                return;
            } else if (this.G == 1) {
                ld5Var.setText(k96.M0(2131745092, null));
                return;
            } else {
                ld5Var.setText(k96.M0(2131745093, null));
                return;
            }
        }
        wgb wgbVar = (wgb) view;
        boolean z2 = this.x;
        if (z2 || !z) {
            int i8 = bkb.F6;
            wgbVar.g(i8, i8);
        } else {
            int i9 = bkb.Yl;
            wgbVar.g(i9, i9);
        }
        if (i != 0) {
            nu2 nu2Var = (nu2) qu2.r(i5).b0.get(i2);
            String str = nu2Var.i;
            if (str != null) {
                String str2 = nu2Var.j;
                if (str2 != null) {
                    wgbVar.k(nu2Var.i + " " + nu2Var.j, false);
                    return;
                }
                if (str2 == null) {
                    wgbVar.k(str, false);
                    return;
                }
            }
            wgbVar.k(nu2Var.j, false);
            return;
        }
        if (z2) {
            if (i2 == 0) {
                wgbVar.r(k96.M0(2131748959, null), "", false, R.drawable.settings_invite, -14899731, -15431455, false);
                return;
            } else {
                if (i2 == 1) {
                    wgbVar.r(k96.M0(2131746176, null), "", false, R.drawable.settings_calls, -11154873, -14175180, false);
                    return;
                }
                return;
            }
        }
        if (z) {
            if (this.H) {
                wgbVar.o(R.drawable.msg_link2, k96.M0(2131752390, null), false);
                return;
            } else {
                wgbVar.o(R.drawable.msg_link2, k96.M0(2131748918, null), false);
                return;
            }
        }
        if (i2 == 0) {
            wgbVar.r(k96.M0(2131748081, null), "", false, R.drawable.settings_group, -14899731, -15431455, false);
        } else if (i2 == 1) {
            wgbVar.r(k96.M0(2131748094, null), "", false, R.drawable.settings_channel, -11154873, -14175180, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y(int i, boolean z) {
        this.G = i;
        if (i != 2) {
            f();
            return;
        }
        if (this.E == null || z) {
            int i2 = this.r;
            this.E = new ArrayList(qu2.r(i2).f0);
            long j = y6c.h(i2).n;
            int size = this.E.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                if (((TLRPC.TL_contact) this.E.get(i3)).user_id == j) {
                    this.E.remove(i3);
                    break;
                }
                i3++;
            }
        }
        Z();
    }

    public final void Z() {
        int i = this.r;
        if (this.E == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
            Collections.sort(this.E, new st2(na7.q1(i), currentTime, (byte) 0));
            f();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = this.s;
        if (i == 0) {
            v6c v6cVar = new v6c(context, 58, 1, false);
            v6cVar.setCallCellStyle(58);
            view = v6cVar;
        } else if (i == 1) {
            view = new wgb(context);
        } else if (i == 2) {
            view = new l35(context, null);
        } else if (i == 3) {
            View qo3Var = new qo3(context, null);
            qo3Var.setPadding(gl.L(k96.a0 ? 28.0f : 72.0f), gl.L(8.0f), gl.L(k96.a0 ? 72.0f : 28.0f), gl.L(8.0f));
            view = qo3Var;
        } else if (i == 4) {
            FrameLayout stVar = new st(this, context, viewGroup, (byte) 9);
            stVar.addView(new ru2(context), nme.e(-1, -2, 17));
            stVar.setLayoutParams(new e49(-1, -2));
            stVar.setTag(-33024);
            view = stVar;
        } else if (i == 7) {
            view = new ld5(this.s, bkb.K6, 21, 14, 5, false, false, null);
        } else if (i == 8) {
            view = new kr5(context, false);
        } else if (i != 9) {
            view = new b9a(context, (de9) null);
        } else {
            View d62Var = new d62(context, (byte) 5);
            d62Var.setId(9);
            d62Var.setTag(-33024);
            view = d62Var;
        }
        return new y29(view);
    }
}
