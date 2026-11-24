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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class ra6 extends ng0 {
    public int E;
    public i1a F;
    public Location G;
    public Location H;
    public String I;
    public String J;
    public Location K;
    public final byte L;
    public final long M;
    public int N;
    public k27 O;
    public TLRPC.TL_channelLocation P;
    public ArrayList Q;
    public boolean R;
    public final boolean S;
    public final wjb T;
    public boolean U;
    public TLRPC.TL_messageMediaVenue V;
    public TLRPC.TL_messageMediaVenue W;
    public boolean X;
    public final boolean Y;
    public ja6 Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public FrameLayout d0;
    public final int x;
    public final Context y;

    /* JADX WARN: Multi-variable type inference failed */
    public ra6(Context context, int i, long j, boolean z, wjb wjbVar, boolean z2, boolean z3, boolean z4) {
        super(z2, z4);
        this.x = y6c.t0;
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
        this.T = wjbVar;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i == 6) {
            if (eb6.f(this.x).h(this.M) == null && this.G == null) {
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
            eb6.d(location, this.e ? 1 : 0, this);
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
                eb6.d(location, this.d ? 2 : 0, this);
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
        eb6.d(location, 0, this);
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
        k27 k27Var = this.O;
        if (k27Var != null) {
            if (i == 1) {
                return k27Var;
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
        db6 h = eb6.f(this.x).h(this.M);
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
            r(2);
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
        long e = y6c.h(this.x).e();
        for (int i = 0; i < this.Q.size(); i++) {
            if (((la6) this.Q.get(i)).a == e || ((la6) this.Q.get(i)).b.out) {
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
            e49 e49Var = (e49) frameLayout.getLayoutParams();
            if (e49Var == null) {
                e49Var = new e49(-1, this.E);
            } else {
                ((ViewGroup.MarginLayoutParams) e49Var).height = this.E;
            }
            this.d0.setLayoutParams(e49Var);
            this.d0.forceLayout();
        }
    }

    public final void Q() {
        R(this.F);
    }

    public final void R(i1a i1aVar) {
        String str;
        if (i1aVar != null) {
            byte b = this.L;
            if (b == 8) {
                i1aVar.b(k96.M0(2131745319, null), !TextUtils.isEmpty(this.I) ? this.I : !TextUtils.isEmpty(this.J) ? this.J : this.R ? k96.M0(2131748587, null) : k96.M0(2131743638, null));
                i1aVar.setHasLocation(true);
                return;
            }
            str = "";
            if (b != 4 && this.H == null) {
                if (this.G != null) {
                    i1aVar.b(k96.M0(2131745419, null), k96.a0(null, null, 2131754692, k96.G((int) this.G.getAccuracy(), "Meters", new Object[0])));
                    i1aVar.setHasLocation(true);
                    return;
                } else {
                    i1aVar.b(k96.M0(2131745419, null), this.b0 ? "" : k96.M0(2131748587, null));
                    i1aVar.setHasLocation(!this.b0);
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.I)) {
                str = this.I;
            } else if (TextUtils.isEmpty(this.J)) {
                Location location = this.H;
                if ((location == null && this.G == null) || this.R) {
                    str = k96.M0(2131748587, null);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.H.getLongitude()));
                } else {
                    Location location2 = this.G;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.G.getLongitude()));
                    } else if (!this.b0) {
                        str = k96.M0(2131748587, null);
                    }
                }
            } else {
                str = this.J;
            }
            if (this.X) {
                i1aVar.b(k96.M0(2131753934, null), str);
            } else if (b == 4) {
                i1aVar.b(k96.M0(2131752199, null), str);
            } else {
                i1aVar.b(k96.M0(2131745398, null), str);
            }
            i1aVar.setHasLocation(true);
        }
    }

    @Override // w39
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
                db6 h = eb6.f(this.x).h(this.M);
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

    @Override // w39
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
            db6 h = (b == 2 || b == 1) ? eb6.f(this.x).h(this.M) : null;
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

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 0) {
            e49 e49Var = (e49) view.getLayoutParams();
            if (e49Var == null) {
                e49Var = new e49(-1, this.E);
            } else {
                ((ViewGroup.MarginLayoutParams) e49Var).height = this.E;
            }
            view.setLayoutParams(e49Var);
            return;
        }
        if (i2 == 1) {
            i1a i1aVar = (i1a) view;
            i1a i1aVar2 = this.F;
            if (i1aVar2 == null || !i1aVar2.isAttachedToWindow()) {
                this.F = i1aVar;
            }
            R(i1aVar);
            return;
        }
        int i3 = 2;
        if (i2 == 2) {
            ((ld5) view).setText(k96.M0(2131748645, null));
            return;
        }
        if (i2 == 6) {
            i1a i1aVar3 = (i1a) view;
            i1aVar3.setHasLocation(this.G != null);
            int i4 = i + 1;
            i1aVar3.y = i4 < b() && d(i4) == 7;
            i1aVar3.invalidate();
            return;
        }
        if (i2 == 7) {
            ((i1a) view).setHasLocation(this.G != null);
            return;
        }
        if (i2 != 8) {
            if (i2 == 12) {
                ua6 ua6Var = (ua6) view;
                if (this.c0) {
                    ua6Var.a(null, 2, i == 1 && this.W != null, false);
                    return;
                } else if (i == 1) {
                    ua6Var.a(this.V, 2, this.W != null, this.U);
                    return;
                } else {
                    ua6Var.a(this.W, 2, false, this.U);
                    return;
                }
            }
            return;
        }
        hga hgaVar = (hga) view;
        if (this.L == 6) {
            hgaVar.b(this.O, this.G, this.b0);
            return;
        }
        TLRPC.TL_channelLocation tL_channelLocation = this.P;
        long j = this.M;
        if (tL_channelLocation != null) {
            TextView textView = hgaVar.f;
            Location location = hgaVar.y;
            be0 be0Var = hgaVar.c;
            hgaVar.F = y6c.t0;
            String str = tL_channelLocation.address;
            hgaVar.n = null;
            boolean D = cf3.D(j);
            int i5 = hgaVar.F;
            String str2 = "";
            if (D) {
                TLRPC.User V1 = na7.q1(i5).V1(Long.valueOf(j));
                if (V1 != null) {
                    hgaVar.n = new pb0(0, V1);
                    str2 = l7c.q(V1);
                    be0Var.f(V1, hgaVar.n);
                }
            } else {
                TLRPC.Chat K0 = na7.q1(i5).K0(Long.valueOf(-j));
                if (K0 != null) {
                    pb0 pb0Var = new pb0(K0);
                    hgaVar.n = pb0Var;
                    str2 = K0.title;
                    be0Var.f(K0, pb0Var);
                }
            }
            hgaVar.d.l(str2, false);
            location.setLatitude(tL_channelLocation.geo_point.lat);
            location.setLongitude(tL_channelLocation.geo_point._long);
            hgaVar.h = true;
            textView.setSingleLine(true);
            textView.setText(str);
            return;
        }
        k27 k27Var = this.O;
        if (k27Var != null) {
            if (i == 1) {
                hgaVar.b(k27Var, this.G, this.b0);
                return;
            }
            i3 = 5;
        }
        int i6 = i - i3;
        db6 h = eb6.f(this.x).h(j);
        if (h != null && h.d != Integer.MAX_VALUE) {
            i6--;
        }
        if (i6 < 0 || i6 >= this.Q.size()) {
            return;
        }
        la6 la6Var = (la6) this.Q.get(i6);
        Location location2 = this.G;
        be0 be0Var2 = hgaVar.c;
        jia jiaVar = hgaVar.d;
        Location location3 = hgaVar.y;
        hgaVar.x = la6Var;
        boolean D2 = cf3.D(la6Var.a);
        int i7 = hgaVar.F;
        if (D2) {
            TLRPC.User V12 = na7.q1(i7).V1(Long.valueOf(la6Var.a));
            if (V12 != null) {
                hgaVar.n.q(V12);
                jiaVar.l(qu2.m(0, V12.first_name, V12.last_name), false);
                be0Var2.f(V12, hgaVar.n);
            }
        } else {
            TLRPC.Chat K02 = na7.q1(i7).K0(Long.valueOf(-la6Var.a));
            if (K02 != null) {
                hgaVar.n.p(K02);
                jiaVar.l(K02.title, false);
                be0Var2.f(K02, hgaVar.n);
            }
        }
        yh5 a = la6Var.e.a();
        location3.setLatitude(a.a);
        location3.setLongitude(a.b);
        int i8 = la6Var.b.edit_date;
        String D3 = k96.D(i8 != 0 ? i8 : r12.date);
        TextView textView2 = hgaVar.f;
        if (location2 == null) {
            textView2.setText(D3);
            return;
        }
        textView2.setText(D3 + " - " + k96.y(location3.distanceTo(location2), 0, null));
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        Context context = this.y;
        if (i != 0) {
            wjb wjbVar = this.T;
            if (i == 1) {
                view = new i1a(wjbVar, context, false, false);
            } else if (i != 2) {
                long j = this.M;
                switch (i) {
                    case 6:
                        i1a i1aVar = new i1a(wjbVar, context, true, false);
                        i1aVar.setDialogId(j);
                        view = i1aVar;
                        break;
                    case 7:
                        i1a i1aVar2 = new i1a(wjbVar, context, true, true);
                        i1aVar2.setDialogId(j);
                        view = i1aVar2;
                        break;
                    case 8:
                        byte b = this.L;
                        view2 = new hga((b == 4 || b == 5 || b == 3) ? 16 : 54, wjbVar, context, true);
                        view = view2;
                        break;
                    case 9:
                        fb6 fb6Var = new fb6(context, wjbVar);
                        fb6Var.setOnButtonClick(new b95(this, (byte) 19));
                        view2 = fb6Var;
                        view = view2;
                        break;
                    case 10:
                        View b9aVar = new b9a(context, (de9) null);
                        new fm2(new ColorDrawable(bkb.v0(bkb.Z6, wjbVar)), bkb.W0(context, R.drawable.greydivider_bottom, bkb.a7)).x = true;
                        view = b9aVar;
                        break;
                    case 11:
                        View view3 = new View(context);
                        view3.setTag(-33024);
                        view = view3;
                        break;
                    case 12:
                        ua6 ua6Var = new ua6(context, wjbVar);
                        ua6Var.setAllowTextAnimation(true);
                        view = ua6Var;
                        break;
                    case 13:
                        view = this.Z;
                        break;
                    default:
                        view = new View(context);
                        break;
                }
            } else {
                view = new ld5(context, wjbVar);
            }
        } else {
            FrameLayout frameLayout = new FrameLayout(context);
            this.d0 = frameLayout;
            frameLayout.setTag(-33024);
            this.d0.setLayoutParams(new e49(-1, this.E));
            view = frameLayout;
        }
        return new y29(view);
    }

    @Override // w39
    public final void y(s49 s49Var) {
        if (s49Var.f == 1) {
            this.F = (i1a) s49Var.a;
            Q();
        }
    }

    public void J() {
    }
}
