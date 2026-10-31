package zf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cb;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.i5;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.messenger.md;
import org.telegram.messenger.nd;
import org.telegram.messenger.o5;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Cells.a5;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.u6;
import org.telegram.ui.Cells.v7;
import org.telegram.ui.Cells.x4;
import org.telegram.ui.Cells.y4;
import org.telegram.ui.Cells.z4;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import org.telegram.ui.qb0;
import org.telegram.ui.sb0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class h0 extends c {
    public final int K;
    public final Context L;
    public int M;
    public u6 N;
    public Location O;
    public Location P;
    public String Q;
    public String R;
    public Location S;
    public final int T;
    public final long U;
    public int V;
    public jj W;
    public TLRPC.TL_channelLocation X;
    public ArrayList Y;
    public boolean Z;
    public final boolean a0;
    public final p6 b0;
    public boolean c0;
    public TLRPC.TL_messageMediaVenue d0;
    public TLRPC.TL_messageMediaVenue e0;
    public boolean f0;
    public final boolean g0;
    public qb0 h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public FrameLayout l0;

    public h0(Context context, int i10, long j10, boolean z10, p6 p6Var, boolean z11, boolean z12, boolean z13) {
        super(z11, z13);
        this.K = d20.s0;
        this.V = -1;
        this.Y = new ArrayList();
        this.c0 = true;
        this.j0 = false;
        this.k0 = false;
        this.g0 = z12;
        this.L = context;
        this.T = i10;
        this.U = j10;
        this.a0 = z10;
        this.b0 = p6Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 == 6) {
            if (nd.f(this.K).h(this.U) == null && this.O == null) {
                return false;
            }
        } else if (i10 != 1 && i10 != 3 && i10 != 8 && i10 != 12 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final void I() {
        int i10 = this.T;
        if (i10 == 8) {
            Location location = this.P;
            if (location == null && (location = this.O) == null) {
                return;
            }
            this.Z = true;
            R();
            nd.d(location, this.e ? 1 : 0, this);
            return;
        }
        if (i10 != 4) {
            Location location2 = this.P;
            if (location2 != null) {
                Location location3 = this.S;
                if (location3 == null || location3.distanceTo(location2) > 20.0f) {
                    this.R = null;
                }
                this.Z = true;
                R();
                nd.d(location2, this.d ? 2 : 0, this);
                return;
            }
            return;
        }
        Location location4 = this.P;
        if (location4 == null && (location4 = this.O) == null) {
            return;
        }
        Location location5 = this.S;
        if (location5 == null || location5.distanceTo(location4) > 100.0f) {
            this.R = null;
        }
        this.Z = true;
        R();
        nd.d(location4, 0, this);
    }

    public final Object J(int i10) {
        int i11 = this.T;
        if (i11 == 4) {
            if (this.R == null) {
                return null;
            }
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            tL_messageMediaVenue.address = this.R;
            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
            tL_messageMediaVenue.geo = tL_geoPoint;
            Location location = this.P;
            if (location != null) {
                tL_geoPoint.lat = location.getLatitude();
                tL_messageMediaVenue.geo._long = this.P.getLongitude();
                return tL_messageMediaVenue;
            }
            Location location2 = this.O;
            if (location2 != null) {
                tL_geoPoint.lat = location2.getLatitude();
                tL_messageMediaVenue.geo._long = this.O.getLongitude();
            }
            return tL_messageMediaVenue;
        }
        jj jjVar = this.W;
        ArrayList arrayList = this.s;
        if (jjVar == null) {
            int i12 = 2;
            if (i11 == 2) {
                md h = nd.f(this.K).h(this.U);
                if (h != null && h.d != Integer.MAX_VALUE) {
                    i12 = 3;
                }
                if (i10 >= i12) {
                    return this.Y.get(i10 - i12);
                }
                return null;
            }
            if (i11 == 1) {
                if (i10 > 4 && i10 < arrayList.size() + 5) {
                    return arrayList.get(i10 - 5);
                }
            } else if (i11 == 7) {
                int i13 = this.e0 == null ? 3 : 4;
                ArrayList arrayList2 = this.r;
                if (i10 > i13) {
                    int i14 = i13 + 1;
                    if (i10 < arrayList2.size() + i14) {
                        return arrayList2.get(i10 - i14);
                    }
                }
                int size = arrayList2.size() + i13;
                if (i10 > size) {
                    int i15 = size + 1;
                    if (i10 < arrayList.size() + i15) {
                        return arrayList.get(i10 - i15);
                    }
                }
            } else if (i10 > 3 && i10 < arrayList.size() + 4) {
                return arrayList.get(i10 - 4);
            }
        } else {
            if (i10 == 1) {
                return jjVar;
            }
            if (i10 > 4 && i10 < arrayList.size() + 4) {
                return this.Y.get(i10 - 5);
            }
        }
        return null;
    }

    public final void L(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        this.Z = false;
        this.S = location;
        int i10 = this.T;
        if (i10 == 8) {
            this.R = str2;
        } else {
            this.R = str;
        }
        if (i10 == 7 && this.k0) {
            this.d0 = null;
            this.e0 = null;
        }
        boolean z10 = this.e0 != null;
        if (i10 != 7) {
            R();
            return;
        }
        this.d0 = tL_messageMediaVenue;
        this.e0 = tL_messageMediaVenue2;
        if (z10 != (tL_messageMediaVenue2 == null)) {
            k(1, 2);
            return;
        }
        g(1);
        if (this.e0 == null) {
            s(2);
        } else {
            i(2);
        }
    }

    public final void M(Location location) {
        this.P = location;
        I();
        R();
    }

    public final void N(Location location) {
        int i10;
        boolean z10 = this.O == null;
        this.O = location;
        if (this.P == null) {
            I();
        }
        if (z10 && (i10 = this.V) > 0) {
            g(i10);
        }
        if (this.W != null) {
            h(1, new Object());
            if (this.Y.isEmpty()) {
                return;
            }
            n(2, this.Y.size(), new Object());
            return;
        }
        if (this.T != 2) {
            R();
        } else {
            if (this.Y.isEmpty()) {
                return;
            }
            n(2, this.Y.size(), new Object());
        }
    }

    public void O(ArrayList arrayList) {
        this.Y = new ArrayList(arrayList);
        long e = d20.i(this.K).e();
        for (int i10 = 0; i10 < this.Y.size(); i10++) {
            if (((sb0) this.Y.get(i10)).a == e || ((sb0) this.Y.get(i10)).b.out) {
                this.Y.remove(i10);
                break;
            }
        }
        f();
    }

    public final void P(boolean z10, boolean z11) {
        if (this.j0 == z10 && this.k0 == z11) {
            return;
        }
        this.j0 = z10;
        this.k0 = z11;
        if (z11) {
            this.d0 = null;
            this.e0 = null;
        }
        f();
    }

    public final void Q(int i10) {
        this.M = i10;
        FrameLayout frameLayout = this.l0;
        if (frameLayout != null) {
            s4.o0 o0Var = (s4.o0) frameLayout.getLayoutParams();
            if (o0Var == null) {
                o0Var = new s4.o0(-1, this.M);
            } else {
                ((ViewGroup.MarginLayoutParams) o0Var).height = this.M;
            }
            this.l0.setLayoutParams(o0Var);
            this.l0.forceLayout();
        }
    }

    public final void R() {
        String str;
        u6 u6Var = this.N;
        if (u6Var != null) {
            int i10 = this.T;
            if (i10 == 8) {
                this.N.b(cd.L0(2131745528, null), !TextUtils.isEmpty(this.Q) ? this.Q : !TextUtils.isEmpty(this.R) ? this.R : this.Z ? cd.L0(2131748789, null) : cd.L0(2131743902, null));
                this.N.setHasLocation(true);
                return;
            }
            str = "";
            if (i10 != 4 && this.P == null) {
                if (this.O != null) {
                    u6Var.b(cd.L0(2131745628, null), cd.a0(null, null, 2131754693, cd.G((int) this.O.getAccuracy(), "Meters", new Object[0])));
                    this.N.setHasLocation(true);
                    return;
                } else {
                    u6Var.b(cd.L0(2131745628, null), this.j0 ? "" : cd.L0(2131748789, null));
                    this.N.setHasLocation(!this.j0);
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.Q)) {
                str = this.Q;
            } else if (TextUtils.isEmpty(this.R)) {
                Location location = this.P;
                if ((location == null && this.O == null) || this.Z) {
                    str = cd.L0(2131748789, null);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.P.getLongitude()));
                } else {
                    Location location2 = this.O;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.O.getLongitude()));
                    } else if (!this.j0) {
                        str = cd.L0(2131748789, null);
                    }
                }
            } else {
                str = this.R;
            }
            if (this.f0) {
                this.N.b(cd.L0(2131753937, null), str);
            } else if (i10 == 4) {
                this.N.b(cd.L0(2131752211, null), str);
            } else {
                this.N.b(cd.L0(2131745607, null), str);
            }
            this.N.setHasLocation(true);
        }
    }

    @Override // s4.g0
    public final int b() {
        int i10 = this.T;
        if (i10 != 6 && i10 != 5 && i10 != 4 && !this.e) {
            int i11 = 0;
            if (this.W != null) {
                if (!this.Y.isEmpty()) {
                    i11 = this.Y.size() + 3;
                } else if (!this.g0) {
                    i11 = 1;
                }
                r1 = 2 + i11;
            } else if (i10 == 2) {
                md h = nd.f(this.K).h(this.U);
                int size = this.Y.size() + 2;
                if (h != null && h.d != Integer.MAX_VALUE) {
                    i11 = 1;
                }
                r1 = size + i11;
            } else {
                boolean z10 = this.h;
                boolean z11 = this.a0;
                if (!z10 && this.f) {
                    ArrayList arrayList = this.s;
                    if (!arrayList.isEmpty()) {
                        r1 = arrayList.size() + this.r.size() + (z11 ? 1 : 0) + (i10 != 1 ? 5 : 6);
                    }
                }
                if (i10 == 0) {
                    r3 = 5;
                } else if (i10 == 7) {
                    r3 = (this.e0 != null ? 1 : 0) + 5;
                }
                boolean z12 = this.j0;
                r1 = ((((z12 || (!this.h && this.f)) ? 0 : 2) + (z11 ? 1 : 0)) - (z12 ? 2 : 0)) + r3;
            }
        }
        return (this.h0 == null || !this.i0) ? r1 : r1 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e5  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i10) {
        int i11;
        if (i10 == b() - 1 && this.h0 != null && this.i0) {
            return 13;
        }
        if (i10 == 0) {
            return 0;
        }
        int i12 = this.T;
        if (i12 == 6) {
            return 8;
        }
        if (this.a0 && i10 == b() - 1) {
            return 11;
        }
        if (i12 == 5) {
            return 8;
        }
        if (i12 != 4) {
            md h = (i12 == 2 || i12 == 1) ? nd.f(this.K).h(this.U) : null;
            if (this.W != null) {
                if (this.Y.isEmpty()) {
                    return i10 == 2 ? 9 : 8;
                }
                if (i10 == 2) {
                    return 10;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        return 8;
                    }
                    this.V = i10;
                    return 6;
                }
            } else {
                if (i12 == 2) {
                    if (i10 != 2 || h == null || h.d == Integer.MAX_VALUE) {
                        if (i10 != 1) {
                            return 8;
                        }
                        if (h == null || h.d != Integer.MAX_VALUE) {
                            this.V = i10;
                            return 6;
                        }
                    }
                    return 7;
                }
                ArrayList arrayList = this.s;
                if (i12 != 1) {
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.r;
                    int size2 = arrayList2.size() + size;
                    if (i12 == 7) {
                        if (i10 == 1) {
                            return 12;
                        }
                        if (this.e0 != null) {
                            if (i10 == 2) {
                                return 12;
                            }
                            i10--;
                            i11 = 3;
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    return 10;
                                }
                                if (i10 != 3) {
                                    if (this.h || (arrayList.isEmpty() && arrayList2.isEmpty())) {
                                        if (i10 > 6 || ((!this.h && this.f) || this.j0)) {
                                        }
                                    } else if (i10 == size2 + i11) {
                                    }
                                    return 3;
                                }
                            }
                        }
                    }
                    i11 = 4;
                    if (i10 != 1) {
                    }
                } else if (i10 != 1) {
                    if (i10 == 2) {
                        if (h != null) {
                            this.V = -1;
                            return 7;
                        }
                        this.V = i10;
                        return 6;
                    }
                    if (i10 == 3) {
                        return 10;
                    }
                    if (i10 != 4) {
                        if (this.h || arrayList.isEmpty() || !this.f) {
                            if (i10 > 7 || ((!this.h && this.f) || this.j0)) {
                                return 4;
                            }
                        } else if (i10 == arrayList.size() + 5) {
                            return 5;
                        }
                        return 3;
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12 = c1Var.f;
        View view = c1Var.a;
        int i13 = this.T;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = null;
        switch (i12) {
            case 0:
                s4.o0 o0Var = (s4.o0) view.getLayoutParams();
                if (o0Var == null) {
                    o0Var = new s4.o0(-1, this.M);
                } else {
                    ((ViewGroup.MarginLayoutParams) o0Var).height = this.M;
                }
                view.setLayoutParams(o0Var);
                break;
            case 1:
                this.N = (u6) view;
                R();
                break;
            case 2:
                p4 p4Var = (p4) view;
                if (this.W == null) {
                    p4Var.setText(cd.L0(2131748314, null));
                    break;
                } else {
                    p4Var.setText(cd.L0(2131748847, null));
                    break;
                }
            case 3:
                x4 x4Var = (x4) view;
                if (i13 == 0) {
                    i11 = i10 - 4;
                } else {
                    if (i13 == 7 || i13 == 8) {
                        int i14 = i10 - 4;
                        if (this.e0 == null) {
                            i11 = i14;
                        }
                    }
                    i11 = i10 - 5;
                }
                if (this.f && (i13 != 7 || !this.h)) {
                    ArrayList arrayList = this.r;
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        x4Var.b(tL_messageMediaVenue, r3, true, false);
                        break;
                    } else {
                        int size = i11 - arrayList.size();
                        if (size >= 0) {
                            ArrayList arrayList2 = this.s;
                            if (size < arrayList2.size()) {
                                tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
                            }
                        }
                    }
                }
                r3 = i11;
                x4Var.b(tL_messageMediaVenue, r3, true, false);
                break;
            case 4:
                ((z4) view).setLoading(this.h);
                break;
            case 6:
                u6 u6Var = (u6) view;
                u6Var.setHasLocation(this.O != null);
                int i15 = i10 + 1;
                if (i15 < b() && d(i15) == 7) {
                    r5 = true;
                }
                u6Var.y = r5;
                u6Var.invalidate();
                break;
            case 7:
                ((u6) view).setHasLocation(this.O != null);
                break;
            case 8:
                v7 v7Var = (v7) view;
                if (i13 != 6) {
                    TLRPC.TL_channelLocation tL_channelLocation = this.X;
                    long j10 = this.U;
                    if (tL_channelLocation == null) {
                        jj jjVar = this.W;
                        if (jjVar != null && i10 == 1) {
                            v7Var.b(jjVar, this.O, this.j0);
                            break;
                        } else {
                            int i16 = i10 - (jjVar != null ? 5 : 2);
                            md h = nd.f(this.K).h(j10);
                            if (h != null && h.d != Integer.MAX_VALUE) {
                                i16--;
                            }
                            if (i16 >= 0 && i16 < this.Y.size()) {
                                sb0 sb0Var = (sb0) this.Y.get(i16);
                                Location location = this.O;
                                TextView textView = v7Var.f;
                                g9 g9Var = v7Var.c;
                                u5 u5Var = v7Var.d;
                                Location location2 = v7Var.y;
                                v7Var.x = sb0Var;
                                if (o5.E(sb0Var.a)) {
                                    TLRPC.User Z1 = vp.r1(v7Var.E).Z1(Long.valueOf(sb0Var.a));
                                    if (Z1 != null) {
                                        v7Var.n.r(Z1);
                                        u5Var.l(i5.m(0, Z1.first_name, Z1.last_name), false);
                                        g9Var.e(Z1, v7Var.n);
                                    }
                                } else {
                                    TLRPC.Chat L0 = vp.r1(v7Var.E).L0(Long.valueOf(-sb0Var.a));
                                    if (L0 != null) {
                                        v7Var.n.q(L0);
                                        u5Var.l(L0.title, false);
                                        g9Var.e(L0, v7Var.n);
                                    }
                                }
                                cb a2 = sb0Var.e.a();
                                location2.setLatitude(a2.a);
                                location2.setLongitude(a2.b);
                                int i17 = sb0Var.b.edit_date;
                                String D = cd.D(i17 != 0 ? i17 : r11.date);
                                if (location == null) {
                                    textView.setText(D);
                                    break;
                                } else {
                                    textView.setText(D + " - " + cd.y(location2.distanceTo(location), 0, null));
                                    break;
                                }
                            }
                        }
                    } else {
                        TextView textView2 = v7Var.f;
                        Location location3 = v7Var.y;
                        g9 g9Var2 = v7Var.c;
                        v7Var.E = d20.s0;
                        String str = tL_channelLocation.address;
                        v7Var.n = null;
                        String str2 = "";
                        if (o5.E(j10)) {
                            TLRPC.User Z12 = vp.r1(v7Var.E).Z1(Long.valueOf(j10));
                            if (Z12 != null) {
                                v7Var.n = new r8(0, Z12);
                                str2 = h20.p(Z12);
                                g9Var2.e(Z12, v7Var.n);
                            }
                        } else {
                            TLRPC.Chat L02 = vp.r1(v7Var.E).L0(Long.valueOf(-j10));
                            if (L02 != null) {
                                r8 r8Var = new r8(L02);
                                v7Var.n = r8Var;
                                str2 = L02.title;
                                g9Var2.e(L02, r8Var);
                            }
                        }
                        v7Var.d.l(str2, false);
                        location3.setLatitude(tL_channelLocation.geo_point.lat);
                        location3.setLongitude(tL_channelLocation.geo_point._long);
                        v7Var.h = true;
                        textView2.setSingleLine(true);
                        textView2.setText(str);
                        break;
                    }
                } else {
                    v7Var.b(this.W, this.O, this.j0);
                    break;
                }
                break;
            case 11:
                a7.i(this.j0 ? t6.i5 : t6.h5, view, this.b0);
                break;
            case 12:
                x4 x4Var2 = (x4) view;
                if (!this.k0) {
                    if (i10 != 1) {
                        x4Var2.b(this.e0, 2, false, this.c0);
                        break;
                    } else {
                        x4Var2.b(this.d0, 2, this.e0 != null, this.c0);
                        break;
                    }
                } else {
                    x4Var2.b(null, 2, i10 == 1 && this.e0 != null, false);
                    break;
                }
                break;
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        long j10 = this.U;
        p6 p6Var = this.b0;
        Context context = this.L;
        switch (i10) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(context);
                this.l0 = frameLayout;
                frameLayout.setTag(-33024);
                this.l0.setLayoutParams(new s4.o0(-1, this.M));
                view = frameLayout;
                break;
            case 1:
                view = new u6(context, p6Var, false, false);
                break;
            case 2:
                view = new p4(context, p6Var);
                break;
            case 3:
                view = new x4(context, p6Var);
                break;
            case 4:
                z4 z4Var = new z4(context);
                RadialProgressView radialProgressView = new RadialProgressView(context, p6Var);
                z4Var.a = radialProgressView;
                z4Var.addView(radialProgressView, b6.e(-2, -2, 17));
                ImageView imageView = new ImageView(context);
                z4Var.c = imageView;
                imageView.setImageResource(R.drawable.location_empty);
                a7.t(imageView, t6.W5, p6Var, PorterDuff.Mode.MULTIPLY);
                z4Var.addView(imageView, b6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 24.0f));
                TextView textView = new TextView(context);
                z4Var.b = textView;
                a7.V(textView, t6.X5, p6Var);
                textView.setGravity(17);
                textView.setTypeface(org.telegram.messenger.i0.o());
                sc.e.u(textView, 1, 17.0f, null, 2131748196);
                z4Var.addView(textView, b6.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
                view = z4Var;
                break;
            case 5:
                a5 a5Var = new a5(context, 0);
                LinearLayout linearLayout = new LinearLayout(context);
                a5Var.addView(linearLayout, b6.e(-2, -2, 17));
                TextView g10 = m5.g(context, 1, 16.0f);
                int i11 = t6.A6;
                a7.V(g10, i11, p6Var);
                g10.setText("Powered by");
                linearLayout.addView(g10, b6.o(-2, -2));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.foursquare);
                a7.t(imageView2, i11, p6Var, PorterDuff.Mode.MULTIPLY);
                imageView2.setPadding(0, org.telegram.messenger.i0.L(2.0f), 0, 0);
                linearLayout.addView(imageView2, b6.o(35, -2));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                a7.V(textView2, i11, p6Var);
                textView2.setText("Foursquare");
                linearLayout.addView(textView2, b6.o(-2, -2));
                view = a5Var;
                break;
            case 6:
                u6 u6Var = new u6(context, p6Var, true, false);
                u6Var.setDialogId(j10);
                view = u6Var;
                break;
            case 7:
                u6 u6Var2 = new u6(context, p6Var, true, true);
                u6Var2.setDialogId(j10);
                view = u6Var2;
                break;
            case 8:
                int i12 = this.T;
                view = new v7((i12 == 4 || i12 == 5 || i12 == 3) ? 16 : 54, context, p6Var, true);
                break;
            case 9:
                y4 y4Var = new y4(context, p6Var);
                y4Var.setOnButtonClick(new f(this, 2));
                view = y4Var;
                break;
            case 10:
                View c7Var = new c7(context, (org.telegram.ui.Cells.f1) null);
                new eq(new ColorDrawable(t6.w0(t6.a7, p6Var)), t6.Y0(context, R.drawable.greydivider_bottom, t6.b7)).x = true;
                view = c7Var;
                break;
            case 11:
            default:
                view = new View(context);
                break;
            case 12:
                x4 x4Var = new x4(context, p6Var);
                x4Var.setAllowTextAnimation(true);
                view = x4Var;
                break;
            case 13:
                view = this.h0;
                break;
        }
        return new ck0(view);
    }

    public void K() {
    }
}
