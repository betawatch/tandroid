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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class vc6 extends og0 {
    public int E;
    public b5a F;
    public Location G;
    public Location H;
    public String I;
    public String J;
    public Location K;
    public final byte L;
    public final long M;
    public int N;
    public r47 O;
    public TLRPC.TL_channelLocation P;
    public ArrayList Q;
    public boolean R;
    public final boolean S;
    public final vnb T;
    public boolean U;
    public TLRPC.TL_messageMediaVenue V;
    public TLRPC.TL_messageMediaVenue W;
    public boolean X;
    public final boolean Y;
    public nc6 Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public FrameLayout d0;
    public final int x;
    public final Context y;

    /* JADX WARN: Multi-variable type inference failed */
    public vc6(Context context, int i, long j, boolean z, vnb vnbVar, boolean z2, boolean z3, boolean z4) {
        super(z2, z4);
        this.x = yac.t0;
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
        this.T = vnbVar;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i == 6) {
            if (id6.f(this.x).h(this.M) == null && this.G == null) {
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
            id6.d(location, this.e ? 1 : 0, this);
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
                id6.d(location, this.d ? 2 : 0, this);
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
        id6.d(location, 0, this);
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
        r47 r47Var = this.O;
        if (r47Var != null) {
            if (i == 1) {
                return r47Var;
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
        hd6 h = id6.f(this.x).h(this.M);
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
        long e = yac.h(this.x).e();
        for (int i = 0; i < this.Q.size(); i++) {
            if (((pc6) this.Q.get(i)).a == e || ((pc6) this.Q.get(i)).b.out) {
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
            r79 r79Var = (r79) frameLayout.getLayoutParams();
            if (r79Var == null) {
                r79Var = new r79(-1, this.E);
            } else {
                ((ViewGroup.MarginLayoutParams) r79Var).height = this.E;
            }
            this.d0.setLayoutParams(r79Var);
            this.d0.forceLayout();
        }
    }

    public final void Q() {
        R(this.F);
    }

    public final void R(b5a b5aVar) {
        String str;
        if (b5aVar != null) {
            byte b = this.L;
            if (b == 8) {
                b5aVar.b(ob6.M0(2131745239, null), !TextUtils.isEmpty(this.I) ? this.I : !TextUtils.isEmpty(this.J) ? this.J : this.R ? ob6.M0(2131748533, null) : ob6.M0(2131743532, null));
                b5aVar.setHasLocation(true);
                return;
            }
            str = "";
            if (b != 4 && this.H == null) {
                if (this.G != null) {
                    b5aVar.b(ob6.M0(2131745339, null), ob6.a0(null, null, 2131754688, ob6.G((int) this.G.getAccuracy(), "Meters", new Object[0])));
                    b5aVar.setHasLocation(true);
                    return;
                } else {
                    b5aVar.b(ob6.M0(2131745339, null), this.b0 ? "" : ob6.M0(2131748533, null));
                    b5aVar.setHasLocation(!this.b0);
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.I)) {
                str = this.I;
            } else if (TextUtils.isEmpty(this.J)) {
                Location location = this.H;
                if ((location == null && this.G == null) || this.R) {
                    str = ob6.M0(2131748533, null);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.H.getLongitude()));
                } else {
                    Location location2 = this.G;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.G.getLongitude()));
                    } else if (!this.b0) {
                        str = ob6.M0(2131748533, null);
                    }
                }
            } else {
                str = this.J;
            }
            if (this.X) {
                b5aVar.b(ob6.M0(2131753930, null), str);
            } else if (b == 4) {
                b5aVar.b(ob6.M0(2131752176, null), str);
            } else {
                b5aVar.b(ob6.M0(2131745318, null), str);
            }
            b5aVar.setHasLocation(true);
        }
    }

    @Override // j79
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
                hd6 h = id6.f(this.x).h(this.M);
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

    @Override // j79
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
            hd6 h = (b == 2 || b == 1) ? id6.f(this.x).h(this.M) : null;
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

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 == 0) {
            r79 r79Var = (r79) view.getLayoutParams();
            if (r79Var == null) {
                r79Var = new r79(-1, this.E);
            } else {
                ((ViewGroup.MarginLayoutParams) r79Var).height = this.E;
            }
            view.setLayoutParams(r79Var);
            return;
        }
        if (i2 == 1) {
            b5a b5aVar = (b5a) view;
            b5a b5aVar2 = this.F;
            if (b5aVar2 == null || !b5aVar2.isAttachedToWindow()) {
                this.F = b5aVar;
            }
            R(b5aVar);
            return;
        }
        int i3 = 2;
        if (i2 == 2) {
            ((mf5) view).setText(ob6.M0(2131748591, null));
            return;
        }
        if (i2 == 6) {
            b5a b5aVar3 = (b5a) view;
            b5aVar3.setHasLocation(this.G != null);
            int i4 = i + 1;
            b5aVar3.y = i4 < b() && d(i4) == 7;
            b5aVar3.invalidate();
            return;
        }
        if (i2 == 7) {
            ((b5a) view).setHasLocation(this.G != null);
            return;
        }
        if (i2 != 8) {
            if (i2 == 12) {
                yc6 yc6Var = (yc6) view;
                if (this.c0) {
                    yc6Var.a(null, 2, i == 1 && this.W != null, false);
                    return;
                } else if (i == 1) {
                    yc6Var.a(this.V, 2, this.W != null, this.U);
                    return;
                } else {
                    yc6Var.a(this.W, 2, false, this.U);
                    return;
                }
            }
            return;
        }
        aka akaVar = (aka) view;
        if (this.L == 6) {
            akaVar.b(this.O, this.G, this.b0);
            return;
        }
        TLRPC.TL_channelLocation tL_channelLocation = this.P;
        long j = this.M;
        if (tL_channelLocation != null) {
            TextView textView = akaVar.f;
            Location location = akaVar.y;
            de0 de0Var = akaVar.c;
            akaVar.F = yac.t0;
            String str = tL_channelLocation.address;
            akaVar.n = null;
            boolean D = wf3.D(j);
            int i5 = akaVar.F;
            String str2 = "";
            if (D) {
                TLRPC.User X1 = uc7.s1(i5).X1(Long.valueOf(j));
                if (X1 != null) {
                    akaVar.n = new rb0(0, X1);
                    str2 = lbc.r(X1);
                    de0Var.f(X1, akaVar.n);
                }
            } else {
                TLRPC.Chat M0 = uc7.s1(i5).M0(Long.valueOf(-j));
                if (M0 != null) {
                    rb0 rb0Var = new rb0(M0);
                    akaVar.n = rb0Var;
                    str2 = M0.title;
                    de0Var.f(M0, rb0Var);
                }
            }
            akaVar.d.l(str2, false);
            location.setLatitude(tL_channelLocation.geo_point.lat);
            location.setLongitude(tL_channelLocation.geo_point._long);
            akaVar.h = true;
            textView.setSingleLine(true);
            textView.setText(str);
            return;
        }
        r47 r47Var = this.O;
        if (r47Var != null) {
            if (i == 1) {
                akaVar.b(r47Var, this.G, this.b0);
                return;
            }
            i3 = 5;
        }
        int i6 = i - i3;
        hd6 h = id6.f(this.x).h(j);
        if (h != null && h.d != Integer.MAX_VALUE) {
            i6--;
        }
        if (i6 < 0 || i6 >= this.Q.size()) {
            return;
        }
        pc6 pc6Var = (pc6) this.Q.get(i6);
        Location location2 = this.G;
        de0 de0Var2 = akaVar.c;
        ema emaVar = akaVar.d;
        Location location3 = akaVar.y;
        akaVar.x = pc6Var;
        boolean D2 = wf3.D(pc6Var.a);
        int i7 = akaVar.F;
        if (D2) {
            TLRPC.User X12 = uc7.s1(i7).X1(Long.valueOf(pc6Var.a));
            if (X12 != null) {
                akaVar.n.q(X12);
                emaVar.l(lv2.m(0, X12.first_name, X12.last_name), false);
                de0Var2.f(X12, akaVar.n);
            }
        } else {
            TLRPC.Chat M02 = uc7.s1(i7).M0(Long.valueOf(-pc6Var.a));
            if (M02 != null) {
                akaVar.n.p(M02);
                emaVar.l(M02.title, false);
                de0Var2.f(M02, akaVar.n);
            }
        }
        ak5 a = pc6Var.e.a();
        location3.setLatitude(a.a);
        location3.setLongitude(a.b);
        int i8 = pc6Var.b.edit_date;
        String D3 = ob6.D(i8 != 0 ? i8 : r12.date);
        TextView textView2 = akaVar.f;
        if (location2 == null) {
            textView2.setText(D3);
            return;
        }
        textView2.setText(D3 + " - " + ob6.y(location3.distanceTo(location2), 0, null));
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        Context context = this.y;
        if (i != 0) {
            vnb vnbVar = this.T;
            if (i == 1) {
                view = new b5a(vnbVar, context, false, false);
            } else if (i != 2) {
                long j = this.M;
                switch (i) {
                    case 6:
                        b5a b5aVar = new b5a(vnbVar, context, true, false);
                        b5aVar.setDialogId(j);
                        view = b5aVar;
                        break;
                    case 7:
                        b5a b5aVar2 = new b5a(vnbVar, context, true, true);
                        b5aVar2.setDialogId(j);
                        view = b5aVar2;
                        break;
                    case 8:
                        byte b = this.L;
                        view2 = new aka((b == 4 || b == 5 || b == 3) ? 16 : 54, vnbVar, context, true);
                        view = view2;
                        break;
                    case 9:
                        jd6 jd6Var = new jd6(context, vnbVar);
                        jd6Var.setOnButtonClick(new sa5(this, (byte) 20));
                        view2 = jd6Var;
                        view = view2;
                        break;
                    case 10:
                        View scaVar = new sca(context, (uh9) null);
                        new zm2(new ColorDrawable(aob.v0(aob.a7, vnbVar)), aob.W0(context, R.drawable.greydivider_bottom, aob.b7)).x = true;
                        view = scaVar;
                        break;
                    case 11:
                        View view3 = new View(context);
                        view3.setTag(-33024);
                        view = view3;
                        break;
                    case 12:
                        yc6 yc6Var = new yc6(context, vnbVar);
                        yc6Var.setAllowTextAnimation(true);
                        view = yc6Var;
                        break;
                    case 13:
                        view = this.Z;
                        break;
                    default:
                        view = new View(context);
                        break;
                }
            } else {
                view = new mf5(context, vnbVar);
            }
        } else {
            FrameLayout frameLayout = new FrameLayout(context);
            this.d0 = frameLayout;
            frameLayout.setTag(-33024);
            this.d0.setLayoutParams(new r79(-1, this.E));
            view = frameLayout;
        }
        return new n69(view);
    }

    @Override // j79
    public final void y(f89 f89Var) {
        if (f89Var.f == 1) {
            this.F = (b5a) f89Var.a;
            Q();
        }
    }

    public void J() {
    }
}
