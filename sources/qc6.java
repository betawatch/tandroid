// default package

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class qc6 extends oh0 {
    public int E;
    public k3a F;
    public Location G;
    public Location H;
    public String I;
    public String J;
    public Location K;
    public final byte L;
    public final long M;
    public int N;
    public k47 O;
    public TLRPC.TL_channelLocation P;
    public ArrayList Q;
    public boolean R;
    public final boolean S;
    public final ylb T;
    public boolean U;
    public TLRPC.TL_messageMediaVenue V;
    public TLRPC.TL_messageMediaVenue W;
    public boolean X;
    public final boolean Y;
    public ic6 Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public FrameLayout d0;
    public final int x;
    public final Context y;

    /* JADX WARN: Multi-variable type inference failed */
    public qc6(Context context, int i, long j, boolean z, ylb ylbVar, boolean z2, boolean z3, boolean z4) {
        super(z2, z4);
        this.x = z8c.t0;
        this.N = -1;
        this.Q = new ArrayList();
        this.U = true;
        this.b0 = false;
        this.c0 = false;
        this.Y = z3;
        this.y = context;
        this.L = i;
        this.M = j;
        this.S = z;
        this.T = ylbVar;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if (i == 6) {
            if (dd6.f(this.x).h(this.M) == null && this.G == null) {
                return false;
            }
        } else if (i != 1 && i != 8 && i != 12 && i != 7) {
            return false;
        }
        return true;
    }

    public final void H() {
        Location location = this.H;
        byte b = this.L;
        if (b == 8) {
            if (location == null && (location = this.G) == null) {
                return;
            }
            this.R = true;
            Q();
            dd6.d(location, this.e ? 1 : 0, this);
            return;
        }
        if (b != 4) {
            if (location != null) {
                Location location2 = this.K;
                if (location2 == null || location2.distanceTo(location) > 20.0f) {
                    this.J = null;
                }
                this.R = true;
                Q();
                dd6.d(location, this.d ? 2 : 0, this);
                return;
            }
            return;
        }
        if (location == null && (location = this.G) == null) {
            return;
        }
        Location location3 = this.K;
        if (location3 == null || location3.distanceTo(location) > 100.0f) {
            this.J = null;
        }
        this.R = true;
        Q();
        dd6.d(location, 0, this);
    }

    public final Object I(int i) {
        byte b = this.L;
        if (b == 4) {
            if (this.J == null) {
                return null;
            }
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            tL_messageMediaVenue.address = this.J;
            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
            tL_messageMediaVenue.geo = tL_geoPoint;
            Location location = this.H;
            if (location != null) {
                tL_geoPoint.lat = location.getLatitude();
                tL_messageMediaVenue.geo._long = this.H.getLongitude();
                return tL_messageMediaVenue;
            }
            Location location2 = this.G;
            if (location2 != null) {
                tL_geoPoint.lat = location2.getLatitude();
                tL_messageMediaVenue.geo._long = this.G.getLongitude();
            }
            return tL_messageMediaVenue;
        }
        k47 k47Var = this.O;
        if (k47Var != null) {
            if (i == 1) {
                return k47Var;
            }
            if (i <= 4 || i >= this.Q.size() + 5) {
                return null;
            }
            return this.Q.get(i - 5);
        }
        int i2 = 2;
        if (b != 2) {
            return null;
        }
        cd6 h = dd6.f(this.x).h(this.M);
        if (h != null && h.d != Integer.MAX_VALUE) {
            i2 = 3;
        }
        if (i >= i2) {
            return this.Q.get(i - i2);
        }
        return null;
    }

    public final void K(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        this.R = false;
        this.K = location;
        byte b = this.L;
        if (b == 8) {
            this.J = str2;
        } else {
            this.J = str;
        }
        if (b == 7 && this.c0) {
            this.V = null;
            this.W = null;
        }
        boolean z = this.W != null;
        if (b != 7) {
            Q();
            return;
        }
        this.V = tL_messageMediaVenue;
        this.W = tL_messageMediaVenue2;
        if (z != (tL_messageMediaVenue2 == null)) {
            l(1, 2);
            return;
        }
        g(1);
        if (this.W == null) {
            s(2);
        } else {
            i(2);
        }
    }

    public final void L(Location location) {
        this.H = location;
        H();
        Q();
    }

    public final void M(Location location) {
        int i;
        boolean z = this.G == null;
        this.G = location;
        if (this.H == null) {
            H();
        }
        if (z && (i = this.N) > 0) {
            g(i);
        }
        if (this.O != null) {
            h(1, new Object());
            if (this.Q.isEmpty()) {
                return;
            }
            n(2, this.Q.size(), new Object());
            return;
        }
        if (this.L != 2) {
            Q();
        } else {
            if (this.Q.isEmpty()) {
                return;
            }
            n(2, this.Q.size(), new Object());
        }
    }

    public void N(ArrayList arrayList) {
        this.Q = new ArrayList(arrayList);
        long e = z8c.h(this.x).e();
        for (int i = 0; i < this.Q.size(); i++) {
            if (((kc6) this.Q.get(i)).a == e || ((kc6) this.Q.get(i)).b.out) {
                this.Q.remove(i);
                break;
            }
        }
        f();
    }

    public final void O(boolean z, boolean z2) {
        if (this.b0 == z && this.c0 == z2) {
            return;
        }
        this.b0 = z;
        this.c0 = z2;
        if (z2) {
            this.V = null;
            this.W = null;
        }
        f();
    }

    public final void P(int i) {
        this.E = i;
        FrameLayout frameLayout = this.d0;
        if (frameLayout != null) {
            g69 g69Var = (g69) frameLayout.getLayoutParams();
            if (g69Var == null) {
                g69Var = new g69(-1, this.E);
            } else {
                ((ViewGroup.MarginLayoutParams) g69Var).height = this.E;
            }
            this.d0.setLayoutParams(g69Var);
            this.d0.forceLayout();
        }
    }

    public final void Q() {
        R(this.F);
    }

    public final void R(k3a k3aVar) {
        String str;
        if (k3aVar != null) {
            byte b = this.L;
            if (b == 8) {
                k3aVar.b(jb6.M0(2131745245, null), !TextUtils.isEmpty(this.I) ? this.I : !TextUtils.isEmpty(this.J) ? this.J : this.R ? jb6.M0(2131748536, null) : jb6.M0(2131743564, null));
                k3aVar.setHasLocation(true);
                return;
            }
            str = "";
            if (b != 4 && this.H == null) {
                if (this.G != null) {
                    k3aVar.b(jb6.M0(2131745345, null), jb6.a0(null, null, 2131754692, jb6.G((int) this.G.getAccuracy(), "Meters", new Object[0])));
                    k3aVar.setHasLocation(true);
                    return;
                } else {
                    k3aVar.b(jb6.M0(2131745345, null), this.b0 ? "" : jb6.M0(2131748536, null));
                    k3aVar.setHasLocation(!this.b0);
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.I)) {
                str = this.I;
            } else if (TextUtils.isEmpty(this.J)) {
                Location location = this.H;
                if ((location == null && this.G == null) || this.R) {
                    str = jb6.M0(2131748536, null);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.H.getLongitude()));
                } else {
                    Location location2 = this.G;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.G.getLongitude()));
                    } else if (!this.b0) {
                        str = jb6.M0(2131748536, null);
                    }
                }
            } else {
                str = this.J;
            }
            if (this.X) {
                k3aVar.b(jb6.M0(2131753902, null), str);
            } else if (b == 4) {
                k3aVar.b(jb6.M0(2131752148, null), str);
            } else {
                k3aVar.b(jb6.M0(2131745324, null), str);
            }
            k3aVar.setHasLocation(true);
        }
    }

    @Override // y59
    public final int b() {
        byte b = this.L;
        if (b != 6 && b != 5 && b != 4 && !this.e) {
            boolean z = this.S;
            if (b == 7) {
                r2 = (this.W != null ? 1 : 0) + 2 + (z ? 1 : 0);
            } else if (this.O != null) {
                if (!this.Q.isEmpty()) {
                    r5 = this.Q.size() + 3;
                } else if (!this.Y) {
                    r5 = 1;
                }
                r2 = 2 + r5;
            } else if (b == 2) {
                cd6 h = dd6.f(this.x).h(this.M);
                int size = this.Q.size() + 2;
                if (h != null && h.d != Integer.MAX_VALUE) {
                    r5 = 1;
                }
                r2 = size + r5;
            } else {
                r2 = (b == 1 ? 3 : 2) + (z ? 1 : 0);
            }
        }
        return (this.Z == null || !this.a0) ? r2 : r2 + 1;
    }

    @Override // y59
    public final int d(int i) {
        if (i == b() - 1 && this.Z != null && this.a0) {
            return 13;
        }
        if (i == 0) {
            return 0;
        }
        byte b = this.L;
        if (b == 6) {
            return 8;
        }
        if (this.S && i == b() - 1) {
            return 11;
        }
        if (b == 5) {
            return 8;
        }
        if (b != 4) {
            cd6 h = (b == 2 || b == 1) ? dd6.f(this.x).h(this.M) : null;
            if (this.O != null) {
                if (this.Q.isEmpty()) {
                    return i == 2 ? 9 : 8;
                }
                if (i == 2) {
                    return 10;
                }
                if (i == 3) {
                    return 2;
                }
                if (i != 4) {
                    return 8;
                }
                this.N = i;
                return 6;
            }
            if (b == 2) {
                if (i != 2 || h == null || h.d == Integer.MAX_VALUE) {
                    if (i != 1) {
                        return 8;
                    }
                    if (h == null || h.d != Integer.MAX_VALUE) {
                        this.N = i;
                        return 6;
                    }
                }
                return 7;
            }
            if (b == 1 && i == 2) {
                if (h != null) {
                    this.N = -1;
                    return 7;
                }
                this.N = i;
                return 6;
            }
            if (b == 7) {
                return 12;
            }
        }
        return 1;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 == 0) {
            g69 g69Var = (g69) view.getLayoutParams();
            if (g69Var == null) {
                g69Var = new g69(-1, this.E);
            } else {
                ((ViewGroup.MarginLayoutParams) g69Var).height = this.E;
            }
            view.setLayoutParams(g69Var);
            return;
        }
        if (i2 == 1) {
            k3a k3aVar = (k3a) view;
            k3a k3aVar2 = this.F;
            if (k3aVar2 == null || !k3aVar2.isAttachedToWindow()) {
                this.F = k3aVar;
            }
            R(k3aVar);
            return;
        }
        int i3 = 2;
        if (i2 == 2) {
            ((jf5) view).setText(jb6.M0(2131748594, null));
            return;
        }
        if (i2 == 6) {
            k3a k3aVar3 = (k3a) view;
            k3aVar3.setHasLocation(this.G != null);
            int i4 = i + 1;
            k3aVar3.y = i4 < b() && d(i4) == 7;
            k3aVar3.invalidate();
            return;
        }
        if (i2 == 7) {
            ((k3a) view).setHasLocation(this.G != null);
            return;
        }
        if (i2 != 8) {
            if (i2 == 12) {
                tc6 tc6Var = (tc6) view;
                if (this.c0) {
                    tc6Var.a(null, 2, i == 1 && this.W != null, false);
                    return;
                } else if (i == 1) {
                    tc6Var.a(this.V, 2, this.W != null, this.U);
                    return;
                } else {
                    tc6Var.a(this.W, 2, false, this.U);
                    return;
                }
            }
            return;
        }
        jia jiaVar = (jia) view;
        if (this.L == 6) {
            jiaVar.b(this.O, this.G, this.b0);
            return;
        }
        TLRPC.TL_channelLocation tL_channelLocation = this.P;
        long j = this.M;
        if (tL_channelLocation != null) {
            TextView textView = jiaVar.f;
            Location location = jiaVar.y;
            bf0 bf0Var = jiaVar.c;
            jiaVar.F = z8c.t0;
            String str = tL_channelLocation.address;
            jiaVar.n = null;
            boolean D = pg3.D(j);
            int i5 = jiaVar.F;
            String str2 = "";
            if (D) {
                TLRPC.User W1 = oc7.r1(i5).W1(Long.valueOf(j));
                if (W1 != null) {
                    jiaVar.n = new pc0(0, W1);
                    str2 = m9c.r(W1);
                    bf0Var.f(W1, jiaVar.n);
                }
            } else {
                TLRPC.Chat L0 = oc7.r1(i5).L0(Long.valueOf(-j));
                if (L0 != null) {
                    pc0 pc0Var = new pc0(L0);
                    jiaVar.n = pc0Var;
                    str2 = L0.title;
                    bf0Var.f(L0, pc0Var);
                }
            }
            jiaVar.d.l(str2, false);
            location.setLatitude(tL_channelLocation.geo_point.lat);
            location.setLongitude(tL_channelLocation.geo_point._long);
            jiaVar.h = true;
            textView.setSingleLine(true);
            textView.setText(str);
            return;
        }
        k47 k47Var = this.O;
        if (k47Var != null) {
            if (i == 1) {
                jiaVar.b(k47Var, this.G, this.b0);
                return;
            }
            i3 = 5;
        }
        int i6 = i - i3;
        cd6 h = dd6.f(this.x).h(j);
        if (h != null && h.d != Integer.MAX_VALUE) {
            i6--;
        }
        if (i6 < 0 || i6 >= this.Q.size()) {
            return;
        }
        kc6 kc6Var = (kc6) this.Q.get(i6);
        Location location2 = this.G;
        bf0 bf0Var2 = jiaVar.c;
        lka lkaVar = jiaVar.d;
        Location location3 = jiaVar.y;
        jiaVar.x = kc6Var;
        boolean D2 = pg3.D(kc6Var.a);
        int i7 = jiaVar.F;
        if (D2) {
            TLRPC.User W12 = oc7.r1(i7).W1(Long.valueOf(kc6Var.a));
            if (W12 != null) {
                jiaVar.n.q(W12);
                lkaVar.l(bw2.m(0, W12.first_name, W12.last_name), false);
                bf0Var2.f(W12, jiaVar.n);
            }
        } else {
            TLRPC.Chat L02 = oc7.r1(i7).L0(Long.valueOf(-kc6Var.a));
            if (L02 != null) {
                jiaVar.n.p(L02);
                lkaVar.l(L02.title, false);
                bf0Var2.f(L02, jiaVar.n);
            }
        }
        xj5 a = kc6Var.e.a();
        location3.setLatitude(a.a);
        location3.setLongitude(a.b);
        int i8 = kc6Var.b.edit_date;
        String D3 = jb6.D(i8 != 0 ? i8 : r12.date);
        TextView textView2 = jiaVar.f;
        if (location2 == null) {
            textView2.setText(D3);
            return;
        }
        textView2.setText(D3 + " - " + jb6.y(location3.distanceTo(location2), 0, null));
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        Context context = this.y;
        if (i != 0) {
            ylb ylbVar = this.T;
            if (i == 1) {
                view = new k3a(ylbVar, context, false, false);
            } else if (i != 2) {
                long j = this.M;
                switch (i) {
                    case 6:
                        k3a k3aVar = new k3a(ylbVar, context, true, false);
                        k3aVar.setDialogId(j);
                        view = k3aVar;
                        break;
                    case 7:
                        k3a k3aVar2 = new k3a(ylbVar, context, true, true);
                        k3aVar2.setDialogId(j);
                        view = k3aVar2;
                        break;
                    case 8:
                        byte b = this.L;
                        view2 = new jia((b == 4 || b == 5 || b == 3) ? 16 : 54, ylbVar, context, true);
                        view = view2;
                        break;
                    case 9:
                        ed6 ed6Var = new ed6(context, ylbVar);
                        ed6Var.setOnButtonClick(new ca5(this, (byte) 22));
                        view2 = ed6Var;
                        view = view2;
                        break;
                    case 10:
                        View bbaVar = new bba(context, (hg9) null);
                        new sn2(new ColorDrawable(cmb.v0(cmb.Z6, ylbVar)), cmb.W0(context, R.drawable.greydivider_bottom, cmb.a7)).x = true;
                        view = bbaVar;
                        break;
                    case 11:
                        View view3 = new View(context);
                        view3.setTag(-33024);
                        view = view3;
                        break;
                    case 12:
                        tc6 tc6Var = new tc6(context, ylbVar);
                        tc6Var.setAllowTextAnimation(true);
                        view = tc6Var;
                        break;
                    case 13:
                        view = this.Z;
                        break;
                    default:
                        view = new View(context);
                        break;
                }
            } else {
                view = new jf5(context, ylbVar);
            }
        } else {
            FrameLayout frameLayout = new FrameLayout(context);
            this.d0 = frameLayout;
            frameLayout.setTag(-33024);
            this.d0.setLayoutParams(new g69(-1, this.E));
            view = frameLayout;
        }
        return new b59(view);
    }

    @Override // y59
    public final void y(u69 u69Var) {
        if (u69Var.f == 1) {
            this.F = (k3a) u69Var.a;
            Q();
        }
    }

    public void J() {
    }
}
