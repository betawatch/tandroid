// default package

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class s42 extends f12 implements snb, fn7 {
    public float A0;
    public final es1 B0;
    public int C0;
    public int D0;
    public x05 E;
    public int E0;
    public xj5 F;
    public int F0;
    public sj5 G;
    public float H;
    public boolean I;
    public final View J;
    public final zc K;
    public final vc6 L;
    public final gu M;
    public final d79 N;
    public final q42 O;
    public final ImageView P;
    public final q22 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final long W;
    public final Paint a0;
    public AnimatorSet b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public Location i0;
    public Location j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public final ImageView n;
    public boolean n0;
    public r42 o0;
    public final byte p0;
    public int q0;
    public final s7 r;
    public int r0;
    public final LinearLayout s;
    public int s0;
    public int t0;
    public float u0;
    public float v0;
    public final TextView w;
    public final int[] w0;
    public final s7 x;
    public int x0;
    public boolean y;
    public int y0;
    public int z0;

    public s42(n12 n12Var, Context context, final vnb vnbVar, boolean z) {
        super(n12Var, vnbVar, context);
        int i;
        this.S = true;
        final byte b = 0;
        this.T = false;
        this.U = false;
        this.V = true;
        this.a0 = new Paint();
        this.c0 = true;
        int currentActionBarHeight = (hl.q.x - a.getCurrentActionBarHeight()) - hl.L(66.0f);
        this.q0 = currentActionBarHeight;
        this.r0 = currentActionBarHeight;
        this.s0 = -1;
        this.t0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.u0 = Float.NaN;
        this.v0 = 1.0f;
        this.w0 = new int[2];
        this.y0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.A0 = -1.0f;
        this.B0 = new es1(this, (byte) 1);
        this.E0 = -1;
        this.F0 = -1;
        hl.a0();
        n12 n12Var2 = this.b;
        e eVar = n12Var2.Z1;
        final zu1 zu1Var = eVar instanceof zu1 ? (zu1) eVar : null;
        long W0 = n12Var2.W0();
        this.W = W0;
        if (this.b.I1) {
            this.p0 = (byte) 7;
            i = 7;
        } else if (!z || zu1Var == null || zu1Var.h != null || zu1Var.X7() || lbc.D(zu1Var.h())) {
            this.p0 = (byte) 0;
            i = 0;
        } else {
            this.p0 = (byte) 1;
            i = 1;
        }
        jn7.e().b(this, jn7.y4);
        jn7.e().b(this, jn7.z4);
        this.e0 = false;
        this.d0 = false;
        this.f0 = false;
        vc6 vc6Var = this.L;
        if (vc6Var != null) {
            vc6Var.F();
        }
        q42 q42Var = this.O;
        if (q42Var != null) {
            q42Var.F();
        }
        this.U = (getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        s7 a = this.b.U2.u().a(0, R.drawable.outline_header_search);
        a.N();
        a.I = new r10(this, (byte) 3);
        this.x = a;
        this.b.getClass();
        a.setVisibility(0);
        a.setSearchFieldHint(ob6.M0(2131745564, null));
        a.setContentDescription(ob6.M0(2131745564, null));
        EditTextBoldCursor searchField = a.getSearchField();
        int i2 = aob.j5;
        yob.X(searchField, i2, vnbVar);
        yob.v(searchField, i2, vnbVar);
        yob.D(searchField, aob.Me, vnbVar);
        new FrameLayout.LayoutParams(-1, hl.L(21.0f)).gravity = 83;
        zc zcVar = new zc((byte) 10, context, (Object) this);
        this.K = zcVar;
        zcVar.setWillNotDraw(false);
        View view = new View(context);
        this.J = view;
        view.setBackgroundDrawable(new ya1(aob.B0().o()));
        s7 s7Var = new s7(context, null, 0, aob.v0(aob.lj, this.a), false, vnbVar);
        this.r = s7Var;
        s7Var.setClickable(true);
        s7Var.setSubMenuOpenSide(2);
        s7Var.setAdditionalXOffset(hl.L(10.0f));
        s7Var.setAdditionalYOffset(-hl.L(10.0f));
        s7Var.d(2, R.drawable.msg_map, null, ob6.M0(2131748444, null), true, false, vnbVar);
        s7Var.d(3, R.drawable.msg_satellite, null, ob6.M0(2131745676, null), true, false, vnbVar);
        s7Var.d(4, R.drawable.msg_hybrid, null, ob6.M0(2131749029, null), true, false, vnbVar);
        s7Var.setContentDescription(ob6.M0(2131754834, null));
        int L = hl.L(40.0f);
        int i3 = aob.nj;
        int v0 = aob.v0(i3, this.a);
        int i4 = aob.oj;
        hf0 h0 = aob.h0(L, v0, aob.v0(i4, this.a));
        iye.a(s7Var);
        s7Var.setTranslationZ(hl.L(2.0f));
        yi yiVar = yhc.a;
        s7Var.setOutlineProvider(yiVar);
        uob M = yob.M(i3);
        uob M2 = yob.M(i4);
        s7Var.setBackground(h0);
        yob.j(s7Var, h0, M, M2, vnbVar);
        s7Var.setIcon(R.drawable.msg_map_type);
        zcVar.addView(s7Var, tre.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        byte b2 = 11;
        s7Var.setOnClickListener(new r81(this, b2));
        s7Var.setDelegate(new j42(this));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        hf0 h02 = aob.h0(hl.L(40.0f), aob.v0(i3, this.a), aob.v0(i4, this.a));
        iye.a(imageView);
        imageView.setTranslationZ(hl.L(2.0f));
        imageView.setOutlineProvider(yiVar);
        uob M3 = yob.M(i3);
        uob M4 = yob.M(i4);
        imageView.setBackground(h02);
        yob.j(imageView, h02, M3, M4, vnbVar);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i5 = aob.mj;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.s(imageView, i5, vnbVar, mode);
        imageView.setTag(Integer.valueOf(i5));
        imageView.setContentDescription(ob6.M0(2131754826, null));
        zcVar.addView(imageView, tre.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new sb1(this, vnbVar, b2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, hl.L(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, tre.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new b02((byte) 2));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.location_empty);
        yob.s(imageView2, aob.W5, vnbVar, mode);
        linearLayout.addView(imageView2, tre.o(-2, -2));
        TextView textView = new TextView(context);
        int i6 = aob.X5;
        yob.X(textView, i6, vnbVar);
        textView.setGravity(17);
        textView.setTypeface(hl.o());
        bs2.r(17.0f, 1, 2131747910, textView, null);
        TextView m = ik8.m(linearLayout, textView, tre.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.w = m;
        yob.X(m, i6, vnbVar);
        m.setGravity(17);
        m.setTextSize(1, 15.0f);
        m.setPadding(hl.L(40.0f), 0, hl.L(40.0f), 0);
        linearLayout.addView(m, tre.t(-2, -2, 17, 0, 6, 0, 0));
        gu guVar = new gu(this, context, vnbVar, (byte) 9);
        this.M = guVar;
        setBlur3Capture(guVar);
        this.d = guVar;
        this.f = true;
        guVar.setClipToPadding(false);
        vc6 vc6Var2 = new vc6(context, i, W0, true, vnbVar, this.b.I1, false, false);
        this.L = vc6Var2;
        guVar.setAdapter(vc6Var2);
        n12 n12Var3 = this.b;
        vc6Var2.X = n12Var3 != null && (n12Var3.B1 || n12Var3.J1);
        guVar.setItemAnimator(null);
        vc6Var2.O(this.U, this.T);
        guVar.setVerticalScrollBarEnabled(false);
        guVar.s1();
        q22 q22Var = new q22(this, guVar);
        this.Q = q22Var;
        guVar.setLayoutManager(q22Var);
        addView(guVar, tre.e(-1, -1, 51));
        guVar.setOnScrollListener(new p42(this, b));
        guVar.setOnItemClickListener(new r69(this) { // from class: k42
            public final /* synthetic */ s42 b;

            {
                this.b = this;
            }

            @Override // r69
            public final void e(int i7, View view2) {
                byte b3 = b;
                vnb vnbVar2 = vnbVar;
                zu1 zu1Var2 = zu1Var;
                s42 s42Var = this.b;
                switch (b3) {
                    case 0:
                        s42Var.Y(zu1Var2, vnbVar2, i7);
                        break;
                    default:
                        s42Var.U(zu1Var2, vnbVar2, i7);
                        break;
                }
            }
        });
        vc6Var2.P(this.q0);
        addView(zcVar, indexOfChild(guVar), tre.e(-1, -1, 51));
        xj5 onCreateMapView = ((z3f) org.telegram.messenger.a.j()).onCreateMapView(context);
        this.F = onCreateMapView;
        am2 am2Var = (am2) onCreateMapView;
        am2Var.c = new j42(this);
        am2Var.d = new h01((Object) this, (Object) vnbVar, (byte) 24);
        new Thread(new l42(this, onCreateMapView, b)).start();
        ImageView imageView3 = new ImageView(context);
        this.P = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        zcVar.addView(imageView3, tre.e(28, 48, 49));
        d79 d79Var = new d79(context, vnbVar);
        this.N = d79Var;
        d79Var.setSections(true);
        d79Var.setClipToPadding(false);
        d79Var.setVisibility(8);
        d79Var.setLayoutManager(new x46(1, false));
        q42 q42Var2 = new q42(this, context, vnbVar, this.b.I1);
        this.O = q42Var2;
        q42Var2.n = new j42(this);
        d79Var.setItemAnimator(null);
        addView(d79Var, tre.e(-1, -1, 51));
        final byte b3 = 1;
        d79Var.setOnScrollListener(new p42(this, b3));
        d79Var.setOnItemClickListener(new r69(this) { // from class: k42
            public final /* synthetic */ s42 b;

            {
                this.b = this;
            }

            @Override // r69
            public final void e(int i7, View view2) {
                byte b32 = b3;
                vnb vnbVar2 = vnbVar;
                zu1 zu1Var2 = zu1Var;
                s42 s42Var = this.b;
                switch (b32) {
                    case 0:
                        s42Var.Y(zu1Var2, vnbVar2, i7);
                        break;
                    default:
                        s42Var.U(zu1Var2, vnbVar2, i7);
                        break;
                }
            }
        });
        h0();
    }

    private int getBottomInset() {
        R();
        return hl.U1(0.0f, getDefaultBottomInset(), getMinBottomInset());
    }

    private int getDefaultBottomInset() {
        if (!R()) {
            return getMinBottomInset();
        }
        return hl.L(8.0f) + this.e;
    }

    private Location getLastLocation() {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.a.b.getSystemService("location");
        List<String> providers = locationManager.getProviders(true);
        Location location = null;
        for (int size = providers.size() - 1; size >= 0; size--) {
            location = locationManager.getLastKnownLocation(providers.get(size));
            if (location != null) {
                return location;
            }
        }
        return location;
    }

    private id6 getLocationController() {
        return this.b.Z1.getLocationController();
    }

    private int getMapContentHeight() {
        return hl.L(10.0f) + this.r0 + this.D0;
    }

    private int getMapExtraTop() {
        return hl.L(8.0f) + hl.m;
    }

    private ak5 getMapTarget() {
        Location location;
        if (this.m0 && (location = this.j0) != null) {
            return new ak5(location.getLatitude(), this.j0.getLongitude());
        }
        Location location2 = this.i0;
        if (location2 != null) {
            return new ak5(location2.getLatitude(), this.i0.getLongitude());
        }
        return null;
    }

    private uc7 getMessagesController() {
        return this.b.Z1.getMessagesController();
    }

    private int getMinBottomInset() {
        return R() ? getDefaultBottomInset() : Math.min(this.e, hl.n);
    }

    private Activity getParentActivity() {
        e eVar;
        n12 n12Var = this.b;
        if (n12Var == null || (eVar = n12Var.Z1) == null) {
            return null;
        }
        return eVar.getParentActivity();
    }

    private yac getUserConfig() {
        return this.b.Z1.getUserConfig();
    }

    @Override // f12
    public final void A(int i, boolean z) {
        if (z) {
            this.L.U = false;
        }
    }

    @Override // f12
    public final void B() {
        xj5 xj5Var = this.F;
        if (xj5Var != null && this.g0) {
            try {
                ((am2) xj5Var).H();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        this.h0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    @Override // f12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i, int i2) {
        int i3;
        int i4;
        n12 n12Var = this.b;
        if (n12Var.U2.o0 || n12Var.o3.Q() > hl.L(20.0f)) {
            n12Var.r0 = false;
            i3 = 0;
        } else {
            if (!hl.O1()) {
                Point point = hl.q;
                if (point.x > point.y) {
                    i4 = (int) (i2 / 3.5f);
                    i3 = i4 - hl.L(52.0f);
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    n12Var.r0 = true;
                }
            }
            i4 = (i2 / 5) << 1;
            i3 = i4 - hl.L(52.0f);
            if (i3 < 0) {
            }
            n12Var.r0 = true;
        }
        this.M.r1(0, i3, 0, getMinBottomInset());
        this.N.r1(0, 0, 0, this.e);
    }

    @Override // f12
    public final void D() {
        xj5 xj5Var = this.F;
        if (xj5Var != null && this.g0) {
            try {
                ((am2) xj5Var).I();
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        this.h0 = true;
    }

    @Override // f12
    public final void F(float f, float f2) {
        if (this.u0 == f && this.v0 == f2) {
            return;
        }
        this.u0 = f;
        this.v0 = f2;
        c0();
    }

    @Override // f12
    public final void H(f12 f12Var) {
        n12 n12Var = this.b;
        n12Var.U2.setTitle(ob6.M0(2131745184, null));
        byte b = 1;
        if (((tt) ((am2) this.F).b).getParent() == null) {
            tt ttVar = (tt) ((am2) this.F).b;
            FrameLayout.LayoutParams e = tre.e(-1, hl.L(10.0f) + this.q0, 51);
            zc zcVar = this.K;
            zcVar.addView(ttVar, 0, e);
            zcVar.addView(this.J, 1, tre.c(-1.0f, -1));
        }
        this.x.setVisibility(0);
        xj5 xj5Var = this.F;
        if (xj5Var != null && this.g0) {
            try {
                ((am2) xj5Var).I();
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        this.h0 = true;
        x05 x05Var = this.E;
        if (x05Var != null) {
            try {
                x05Var.k(true);
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
        Q();
        hl.d3(new i42(this, b), n12Var.W3.o() ? 200L : 0L);
        this.Q.g1(0, 0);
        g0();
    }

    @Override // f12
    public final void J() {
        this.M.A0(0);
    }

    public final void O() {
        zc zcVar;
        if (this.F == null || (zcVar = this.K) == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zcVar.getLayoutParams();
        if (layoutParams != null) {
            int i = layoutParams.height;
            int i2 = this.r0;
            if (i != i2) {
                layoutParams.height = i2;
                zcVar.setLayoutParams(layoutParams);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((tt) ((am2) this.F).b).getLayoutParams();
        if (layoutParams2 != null && layoutParams2.height != getMapContentHeight()) {
            layoutParams2.height = getMapContentHeight();
            ((tt) ((am2) this.F).b).setLayoutParams(layoutParams2);
        }
        this.L.P(this.q0);
        gu guVar = this.M;
        f89 L = guVar.L(0);
        if (L != null) {
            View view = L.a;
            if (view.getLayoutParams() != null && view.getLayoutParams().height != this.q0) {
                view.getLayoutParams().height = this.q0;
                view.requestLayout();
            }
        }
        q22 q22Var = this.Q;
        q22Var.M = 0;
        q22Var.o1();
        guVar.requestLayout();
        g0();
    }

    public final void P() {
        s7 s7Var = this.r;
        if (s7Var != null) {
            s7Var.setIconColor(aob.v0(aob.lj, this.a));
            this.r.I(aob.v0(aob.G8, this.a));
            this.r.O(aob.v0(aob.F8, this.a), true);
            this.r.O(aob.v0(aob.E8, this.a), false);
        }
        if (this.E != null) {
            boolean z = aob.I.o() || hl.B(aob.v0(aob.d6, this.a)) < 0.721f;
            boolean z2 = this.R;
            if (z) {
                if (z2) {
                    return;
                }
                this.R = true;
                this.E.i(((z3f) org.telegram.messenger.a.j()).loadRawResourceStyle(org.telegram.messenger.a.b, R.raw.mapstyle_night));
                return;
            }
            if (z2) {
                this.R = false;
                this.E.i(null);
            }
        }
    }

    public final void Q() {
        if (getMeasuredHeight() == 0 || this.F == null) {
            return;
        }
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        gu guVar = this.M;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) guVar.getLayoutParams();
        layoutParams.topMargin = currentActionBarHeight;
        guVar.setLayoutParams(layoutParams);
        zc zcVar = this.K;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) zcVar.getLayoutParams();
        layoutParams2.topMargin = 0;
        layoutParams2.height = this.r0;
        zcVar.setLayoutParams(layoutParams2);
        d79 d79Var = this.N;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) d79Var.getLayoutParams();
        layoutParams3.topMargin = currentActionBarHeight;
        d79Var.setLayoutParams(layoutParams3);
        int i = this.q0;
        vc6 vc6Var = this.L;
        vc6Var.P(i);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((tt) ((am2) this.F).b).getLayoutParams();
        if (layoutParams4 != null) {
            layoutParams4.height = hl.L(10.0f) + this.r0;
            ((tt) ((am2) this.F).b).setLayoutParams(layoutParams4);
        }
        vc6Var.f();
        g0();
    }

    public final boolean R() {
        m02 m02Var = this.b.u3;
        return (m02Var == null || m02Var.getVisibility() == 8) ? false : true;
    }

    public final void S(x05 x05Var) {
        PackageManager packageManager;
        this.E = x05Var;
        i42 i42Var = new i42(this, (byte) 4);
        um4 um4Var = x05Var.a;
        byte b = 5;
        e05 e05Var = new e05(i42Var, b);
        um4Var.getClass();
        try {
            qae qaeVar = (qae) um4Var.b;
            k9d k9dVar = new k9d(e05Var, (char) 0);
            Parcel R = qaeVar.R();
            jld.c(R, k9dVar);
            qaeVar.V(R, 42);
            byte b2 = 1;
            if (aob.I.o() || hl.B(aob.v0(aob.d6, this.a)) < 0.721f) {
                this.R = true;
                this.E.i(((z3f) org.telegram.messenger.a.j()).loadRawResourceStyle(org.telegram.messenger.a.b, R.raw.mapstyle_night));
            }
            if (this.E != null) {
                Location location = new Location("network");
                this.j0 = location;
                location.setLatitude(20.659322d);
                this.j0.setLongitude(-11.40625d);
                try {
                    this.E.k(true);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                this.E.g().g0();
                this.E.g().h0();
                this.E.g().f0();
                this.E.l(new j42(this));
                x05 x05Var2 = this.E;
                i42 i42Var2 = new i42(this, b);
                um4 um4Var2 = x05Var2.a;
                e05 e05Var2 = new e05((Object) i42Var2, (byte) 3);
                um4Var2.getClass();
                try {
                    qae qaeVar2 = (qae) um4Var2.b;
                    k9d k9dVar2 = new k9d(e05Var2, (byte) 0, false);
                    Parcel R2 = qaeVar2.R();
                    jld.c(R2, k9dVar2);
                    qaeVar2.V(R2, 99);
                    x05 x05Var3 = this.E;
                    n42 n42Var = new n42(this, (byte) 1);
                    um4 um4Var3 = x05Var3.a;
                    e05 e05Var3 = new e05(n42Var, b2);
                    um4Var3.getClass();
                    try {
                        qae qaeVar3 = (qae) um4Var3.b;
                        k9d k9dVar3 = new k9d(e05Var3, (byte) 0);
                        Parcel R3 = qaeVar3.R();
                        jld.c(R3, k9dVar3);
                        qaeVar3.V(R3, 36);
                        this.E.m(new c22((byte) 6));
                        d0();
                        hl.d3(new i42(this, (byte) 6), 200L);
                        if (this.S && getParentActivity() != null) {
                            this.S = false;
                            Activity parentActivity = getParentActivity();
                            if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                                return;
                            }
                            try {
                                if (!((LocationManager) org.telegram.messenger.a.b.getSystemService("location")).isProviderEnabled("gps")) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getParentActivity());
                                    int i = aob.L5;
                                    alertDialog$Builder.l(R.raw.permission_request_location, 72, aob.v0(i, this.a), null);
                                    alertDialog$Builder.m(i, this.a);
                                    alertDialog$Builder.a.U = ob6.M0(2131749301, null);
                                    alertDialog$Builder.j(ob6.M0(2131751771, null), new j42(this));
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                    alertDialog$Builder.o();
                                }
                            } catch (Exception e2) {
                                cc4.g(e2, true);
                            }
                        }
                        g0();
                    } catch (RemoteException e3) {
                        p3d.i(e3);
                    }
                } catch (RemoteException e4) {
                    p3d.i(e4);
                }
            }
        } catch (RemoteException e5) {
            p3d.i(e5);
        }
    }

    public final void T(xj5 xj5Var) {
        if (this.F == null || getParentActivity() == null) {
            return;
        }
        try {
            ((am2) xj5Var).F();
            ((z3f) org.telegram.messenger.a.j()).initializeMaps(org.telegram.messenger.a.b);
            ((am2) this.F).y(new n42(this, (byte) 0));
            this.g0 = true;
            if (this.h0) {
                ((am2) this.F).I();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void U(zu1 zu1Var, vnb vnbVar, int i) {
        TLRPC.TL_messageMediaVenue H = this.O.H(i);
        if (H != null) {
            byte b = this.p0;
            n12 n12Var = this.b;
            if (b != 7) {
                n12Var.U2.o(true);
                TLRPC.GeoPoint geoPoint = H.geo;
                f0(geoPoint.lat, geoPoint._long);
            } else if (this.o0 != null) {
                if (zu1Var != null && zu1Var.X7()) {
                    jj.J(getParentActivity(), zu1Var.a(), new m42(this, H, (byte) 0), vnbVar);
                } else {
                    this.o0.b(H, this.p0, true, 0, 0L);
                    n12Var.a(true);
                }
            }
        }
    }

    public final /* synthetic */ void V(vnb vnbVar) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            jj.A(getParentActivity()).show();
            return;
        }
        if (this.i0 == null || this.E == null) {
            return;
        }
        int i = aob.mj;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.n;
        yob.s(imageView, i, vnbVar, mode);
        imageView.setTag(Integer.valueOf(i));
        this.L.L(null);
        this.m0 = false;
        this.E.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(new ak5(this.i0.getLatitude(), this.i0.getLongitude())));
    }

    public final /* synthetic */ void W(zu1 zu1Var, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, vnb vnbVar, Long l) {
        if (zu1Var != null && zu1Var.X7()) {
            jj.J(getParentActivity(), zu1Var.a(), new ie((Object) this, (Object) tL_messageMediaGeo, (Object) l, (byte) 23), vnbVar);
            return;
        }
        this.o0.b(tL_messageMediaGeo, this.p0, true, 0, l.longValue());
        this.b.a(true);
    }

    public final /* synthetic */ void X(zu1 zu1Var, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, vnb vnbVar) {
        byte b = 1;
        if (zu1Var != null && zu1Var.X7()) {
            jj.J(getParentActivity(), zu1Var.a(), new m42(this, tL_messageMediaVenue, b), vnbVar);
        } else {
            this.o0.b(tL_messageMediaVenue, this.p0, true, 0, 0L);
            this.b.a(true);
        }
    }

    public final void Y(zu1 zu1Var, vnb vnbVar, int i) {
        s42 s42Var;
        zu1 zu1Var2;
        vnb vnbVar2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        vc6 vc6Var = this.L;
        n12 n12Var = this.b;
        byte b = 1;
        byte b2 = this.p0;
        if (b2 == 7) {
            if (i == 1 && (tL_messageMediaVenue2 = vc6Var.V) != null) {
                this.o0.b(tL_messageMediaVenue2, b2, true, 0, 0L);
                n12Var.a(true);
                return;
            } else if (i == 2 && (tL_messageMediaVenue = vc6Var.W) != null) {
                this.o0.b(tL_messageMediaVenue, b2, true, 0, 0L);
                n12Var.a(true);
                return;
            } else {
                s42Var = this;
                zu1Var2 = zu1Var;
                vnbVar2 = vnbVar;
            }
        } else {
            if (i == 1) {
                if (this.o0 == null || this.j0 == null) {
                    if (this.U) {
                        jj.A(getParentActivity()).show();
                        return;
                    }
                    return;
                } else {
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                    tL_messageMediaGeo.geo = tL_geoPoint;
                    tL_geoPoint.lat = hl.b0(this.j0.getLatitude());
                    tL_messageMediaGeo.geo._long = hl.b0(this.j0.getLongitude());
                    jj.X(n12Var.G3, n12Var.W0(), n12Var.S0() + 1, new ku0((Object) this, (Object) zu1Var, (Object) tL_messageMediaGeo, (Object) vnbVar, (byte) 4));
                    return;
                }
            }
            s42Var = this;
            zu1Var2 = zu1Var;
            vnbVar2 = vnbVar;
            if (i == 2 && b2 == 1) {
                id6 locationController = s42Var.getLocationController();
                long j = s42Var.W;
                if (locationController.i(j)) {
                    s42Var.getLocationController().k(j);
                    n12Var.a(true);
                    return;
                } else if (s42Var.i0 == null && s42Var.U) {
                    jj.A(s42Var.getParentActivity()).show();
                    return;
                } else {
                    if (s42Var.o0 == null || s42Var.getParentActivity() == null || s42Var.i0 == null) {
                        return;
                    }
                    jj.B(s42Var.getParentActivity(), false, wf3.D(j) ? n12Var.Z1.getMessagesController().X1(Long.valueOf(j)) : null, new ze1(s42Var, b), s42Var.a).show();
                    return;
                }
            }
        }
        Object I = vc6Var.I(i);
        if (I instanceof TLRPC.TL_messageMediaVenue) {
            jj.X(n12Var.G3, n12Var.W0(), n12Var.S0() + 1, new ku0((Object) s42Var, (Object) zu1Var2, I, (Object) vnbVar2, (byte) 5));
        }
    }

    public final /* synthetic */ void Z(Location location) {
        byte b;
        n12 n12Var = this.b;
        if (n12Var == null || n12Var.Z1 == null) {
            return;
        }
        e0(location);
        vc6 vc6Var = this.L;
        if (vc6Var != null && (((b = this.p0) == 7 || b == 8) && !this.m0)) {
            vc6Var.L(this.j0);
        }
        getLocationController().n(location, this.V);
        this.V = false;
    }

    public final /* synthetic */ void a0() {
        if (getParentActivity() != null) {
            try {
                getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            } catch (Exception unused) {
            }
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.n5));
        hashSet.add(Integer.valueOf(aob.a7));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.Fi));
        hashSet.add(Integer.valueOf(aob.Ji));
        hashSet.add(Integer.valueOf(aob.fj));
        hashSet.add(Integer.valueOf(aob.ij));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
    }

    public final /* synthetic */ void b0() {
        Activity parentActivity;
        if (!this.c0 || (parentActivity = getParentActivity()) == null) {
            return;
        }
        this.c0 = false;
        int checkSelfPermission = parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION");
        vc6 vc6Var = this.L;
        n12 n12Var = this.b;
        if (checkSelfPermission != 0) {
            String[] strArr = (!n12Var.I1 || n12Var.w4 == null || Build.VERSION.SDK_INT < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
            this.T = true;
            if (vc6Var != null) {
                vc6Var.O(this.U, true);
            }
            parentActivity.requestPermissions(strArr, 2);
            return;
        }
        if (Build.VERSION.SDK_INT < 29 || !n12Var.I1 || n12Var.w4 == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
            return;
        }
        this.T = true;
        if (vc6Var != null) {
            vc6Var.O(this.U, true);
        }
        parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
    }

    public final void c0() {
        zc zcVar;
        gu guVar;
        ak5 ak5Var;
        if (this.F == null || (zcVar = this.K) == null || (guVar = this.M) == null) {
            return;
        }
        byte b = 0;
        f89 L = guVar.L(0);
        int top = L != null ? L.a.getTop() + guVar.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (L == null || top >= getMeasuredHeight()) {
            if (((tt) ((am2) this.F).b).getVisibility() == 0) {
                ((tt) ((am2) this.F).b).setVisibility(4);
                zcVar.setVisibility(4);
                return;
            }
            return;
        }
        if (((tt) ((am2) this.F).b).getVisibility() == 4) {
            ((tt) ((am2) this.F).b).setVisibility(0);
            zcVar.setVisibility(0);
        }
        float f = top;
        if (this.v0 < 1.0f) {
            int[] iArr = this.w0;
            getLocationInWindow(iArr);
            f = Math.min(top, hl.U1(this.v0, -iArr[1], top));
        }
        int max = (int) Math.max(f, -getMapExtraTop());
        int max2 = (Math.max(0, L.a.getTop()) + guVar.getTop()) - max;
        int min = (Math.min(this.t0, guVar.getMeasuredHeight()) + guVar.getTop()) - max;
        this.x0 = hl.L(32.0f) + max2;
        this.y0 = min;
        this.z0 = Math.max(0, this.r0 - (getMeasuredHeight() - max));
        float f2 = max;
        zcVar.setTranslationY(f2);
        zcVar.invalidate();
        this.r.setTranslationY(max2);
        this.n.setTranslationY(-Math.max(0, this.r0 - min));
        int top2 = guVar.getTop();
        int i = min + max;
        float f3 = (top2 + i) / 2.0f;
        float max3 = Math.max(f3, ((guVar.getPaddingTop() + top2) + i) / 2.0f);
        int ceil = (int) Math.ceil(max3 - f3);
        if (ceil != this.D0) {
            this.D0 = ceil;
            hl.c3(new i42(this, b));
        }
        float w = qu6.w(max + max2 + i, 2.0f, max3, f3);
        int ceil2 = ((int) Math.ceil(max3)) + getMapExtraTop();
        float f4 = w - ceil2;
        ((tt) ((am2) this.F).b).setTranslationY(f4 - f2);
        int L2 = ((int) (w - f2)) - hl.L(48.0f);
        if (L2 != this.k0) {
            this.k0 = L2;
            this.P.setTranslationY(L2);
        }
        int measuredHeight = ((tt) ((am2) this.F).b).getMeasuredHeight() > 0 ? ((tt) ((am2) this.F).b).getMeasuredHeight() : getMapContentHeight();
        int max4 = Math.max(0, (int) (measuredHeight - (i - f4)));
        int i2 = ((ceil2 << 1) - measuredHeight) + max4;
        x05 x05Var = this.E;
        if (x05Var != null) {
            int i3 = this.E0;
            if (i2 == i3 && max4 == this.F0) {
                return;
            }
            if (i3 < 0) {
                ak5Var = getMapTarget();
            } else if (ceil2 != this.C0) {
                x05Var.d();
                ak5Var = (ak5) this.E.d().b;
            } else {
                ak5Var = null;
            }
            this.C0 = ceil2;
            this.E0 = i2;
            this.F0 = max4;
            this.E.n(0, hl.L(6.0f) + i2, 0, hl.L(6.0f) + max4);
            if (ak5Var != null) {
                this.E.h(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(ak5Var));
            }
        }
    }

    public final void d0() {
        s42 s42Var;
        n12 n12Var = this.b;
        if (!n12Var.I1) {
            Location lastLocation = getLastLocation();
            this.i0 = lastLocation;
            e0(lastLocation);
            return;
        }
        byte b = 2;
        if (n12Var.x4 != null) {
            hl.c3(new i42(this, b));
            return;
        }
        if (this.U) {
            hl.c3(new i42(this, (byte) 8));
            return;
        }
        File file = n12Var.w4;
        boolean z = n12Var.v4;
        if (file != null) {
            if (!z) {
                s42Var = this;
                float[] fArr = new float[2];
                if (new ExifInterface(file.getAbsolutePath()).getLatLong(fArr)) {
                    hl.c3(new dy1(s42Var, fArr, (byte) 18));
                    return;
                }
                Location lastLocation2 = s42Var.getLastLocation();
                s42Var.i0 = lastLocation2;
                s42Var.e0(lastLocation2);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                if (extractMetadata != null) {
                    Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                    if (matcher.find() && matcher.groupCount() == 2) {
                        hl.c3(new zja(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), (byte) 2));
                        return;
                    }
                }
            } catch (NumberFormatException | Exception unused) {
            }
        }
        s42Var = this;
        Location lastLocation22 = s42Var.getLastLocation();
        s42Var.i0 = lastLocation22;
        s42Var.e0(lastLocation22);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.y4;
        vc6 vc6Var = this.L;
        if (i == i3) {
            this.U = false;
            this.T = false;
            d0();
            if (vc6Var != null) {
                vc6Var.O(this.U, this.T);
            }
            x05 x05Var = this.E;
            if (x05Var != null) {
                try {
                    x05Var.k(true);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        } else if (i == jn7.z4) {
            this.U = true;
            this.T = false;
            if (vc6Var != null) {
                vc6Var.O(true, false);
            }
        }
        Q();
        this.b.getClass();
        this.x.setVisibility(0);
    }

    @Override // f12
    public final boolean e() {
        return !R();
    }

    public final void e0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.i0 = location2;
            x05 x05Var = this.E;
            vc6 vc6Var = this.L;
            if (x05Var == null) {
                vc6Var.M(location2);
                return;
            }
            ak5 ak5Var = new ak5(location.getLatitude(), location.getLongitude());
            if (vc6Var != null) {
                vc6Var.M(this.i0);
            }
            if (this.m0) {
                return;
            }
            this.j0 = new Location(location);
            if (this.n0) {
                this.E.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(ak5Var));
                return;
            }
            this.n0 = true;
            this.E.h(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(ak5Var, this.E.e() - 4.0f));
        }
    }

    @Override // f12
    public final boolean f() {
        return true;
    }

    public final void f0(double d, double d2) {
        sj5 newCameraUpdateLatLngZoom;
        if (this.E != null) {
            if (d == 0.0d || d2 == 0.0d) {
                Location location = new Location("");
                this.i0 = location;
                location.reset();
                this.i0.setLatitude(d);
                this.i0.setLongitude(d2);
            } else {
                Location location2 = new Location("");
                this.j0 = location2;
                location2.reset();
                this.j0.setLatitude(d);
                this.j0.setLongitude(d2);
            }
            ak5 ak5Var = new ak5(d, d2);
            if (d == 0.0d || d2 == 0.0d) {
                newCameraUpdateLatLngZoom = ((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(ak5Var, this.E.f());
            } else {
                newCameraUpdateLatLngZoom = ((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(ak5Var, this.E.e() - 4.0f);
            }
            this.G = newCameraUpdateLatLngZoom;
            this.E.h(newCameraUpdateLatLngZoom);
            vc6 vc6Var = this.L;
            if (d == 0.0d || d2 == 0.0d) {
                vc6Var.M(this.i0);
            } else {
                vc6Var.L(this.j0);
            }
            vc6Var.H();
            this.M.y0(0, 1, null);
            this.l0 = true;
            if (d == 0.0d || d2 == 0.0d) {
                return;
            }
            this.m0 = true;
        }
    }

    public final void g0() {
        zc zcVar;
        if (this.F == null || (zcVar = this.K) == null) {
            return;
        }
        gu guVar = this.M;
        f89 L = guVar.L(0);
        if (L != null) {
            L.a.getTop();
        } else {
            zcVar.getMeasuredHeight();
        }
        int i = this.s0;
        if (i < 0) {
            int L2 = hl.L(66.0f);
            byte b = this.p0;
            i = (b == 1 || b == 7 || b == 8) ? hl.L(66.0f) + L2 : L2;
        }
        int measuredHeight = (guVar.getMeasuredHeight() - getBottomInset()) - i;
        this.t0 = measuredHeight;
        if (L != null) {
            int bottom = measuredHeight - L.a.getBottom();
            int childCount = guVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = guVar.getChildAt(i2);
                if (RecyclerView.S(childAt) > 0) {
                    childAt.setTranslationY(bottom);
                }
            }
        }
        c0();
    }

    @Override // f12
    public int getButtonsHideOffset() {
        return hl.L(56.0f);
    }

    @Override // f12
    public int getCurrentItemTop() {
        gu guVar = this.M;
        if (guVar.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        n69 n69Var = (n69) guVar.L(0);
        return hl.L(56.0f) + (n69Var != null ? Math.max((int) n69Var.a.getY(), 0) : 0);
    }

    @Override // f12
    public int getFirstOffset() {
        return hl.L(56.0f) + getListTopPadding();
    }

    @Override // f12
    public int getListTopPadding() {
        return this.M.getPaddingTop();
    }

    @Override // f12
    public ArrayList<apb> getThemeDescriptions() {
        ArrayList<apb> arrayList = new ArrayList<>();
        u00 u00Var = new u00(this, (byte) 3);
        arrayList.add(new apb(this.K, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h5));
        int i = aob.A5;
        gu guVar = this.M;
        arrayList.add(new apb(guVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        s7 s7Var = this.x;
        arrayList.add(new apb(s7Var != null ? s7Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.j5));
        int i2 = aob.nj;
        ImageView imageView = this.n;
        arrayList.add(new apb(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        int i3 = aob.oj;
        arrayList.add(new apb(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i3));
        int i4 = aob.lj;
        s7 s7Var2 = this.r;
        arrayList.add(new apb(s7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, i4));
        arrayList.add(new apb(s7Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(s7Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.jj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.kj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.pj));
        arrayList.add(new apb(guVar, 393216, new Class[]{b5a.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.ej));
        arrayList.add(new apb(guVar, 393216, new Class[]{b5a.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.hj));
        arrayList.add(new apb(guVar, 393248, new Class[]{b5a.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.dj));
        arrayList.add(new apb(guVar, 393248, new Class[]{b5a.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.gj));
        arrayList.add(new apb(guVar, 196608, new Class[]{jd6.class}, new String[]{"frameLayout"}, (Drawable[]) null, (zob) null, aob.Hi));
        return arrayList;
    }

    public final void h0() {
        boolean z = this.d0;
        LinearLayout linearLayout = this.s;
        if (!z) {
            linearLayout.setVisibility(8);
            return;
        }
        boolean z2 = this.f0;
        d79 d79Var = this.N;
        if (!z2) {
            d79Var.setEmptyView(linearLayout);
        } else {
            d79Var.setEmptyView(null);
            linearLayout.setVisibility(8);
        }
    }

    public final void i0() {
        if (this.F == null || this.K == null || getMeasuredHeight() == 0) {
            return;
        }
        gu guVar = this.M;
        f89 L = guVar.L(0);
        if (L != null) {
            View view = L.a;
            int bottom = view.getBottom();
            vc6 vc6Var = this.L;
            int b = vc6Var.b();
            int i = 1;
            while (true) {
                if (i >= b) {
                    this.s0 = bottom - view.getBottom();
                    break;
                }
                if (vc6Var.d(i) != 11) {
                    f89 L2 = guVar.L(i);
                    if (L2 == null) {
                        break;
                    } else {
                        bottom = Math.max(bottom, L2.a.getBottom());
                    }
                }
                i++;
            }
        }
        int i2 = this.s0;
        if (i2 < 0) {
            int L3 = hl.L(66.0f);
            byte b2 = this.p0;
            i2 = (b2 == 1 || b2 == 7 || b2 == 8) ? hl.L(66.0f) + L3 : L3;
        }
        int measuredHeight = (guVar.getMeasuredHeight() - getDefaultBottomInset()) - i2;
        int measuredHeight2 = getMeasuredHeight() + getMapExtraTop();
        int max = Math.max(hl.L(120.0f), measuredHeight - guVar.getPaddingTop());
        if (measuredHeight2 == this.r0 && max == this.q0) {
            return;
        }
        this.r0 = measuredHeight2;
        this.q0 = max;
        hl.c3(new i42(this, (byte) 3));
    }

    @Override // f12
    public final int j() {
        return 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.B0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.B0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Q();
        }
    }

    @Override // f12
    public final void p() {
        jn7.e().n(this, jn7.y4);
        jn7.e().n(this, jn7.z4);
        this.y = true;
        zc zcVar = this.K;
        if (zcVar != null) {
            zcVar.invalidate();
        }
        try {
            x05 x05Var = this.E;
            if (x05Var != null) {
                x05Var.k(false);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        xj5 xj5Var = this.F;
        if (xj5Var != null) {
            ((tt) ((am2) xj5Var).b).setTranslationY((-hl.q.y) * 3);
        }
        try {
            xj5 xj5Var2 = this.F;
            if (xj5Var2 != null) {
                ((am2) xj5Var2).H();
            }
        } catch (Exception unused) {
        }
        try {
            xj5 xj5Var3 = this.F;
            if (xj5Var3 != null) {
                ((am2) xj5Var3).G();
                this.F = null;
            }
        } catch (Exception unused2) {
        }
        vc6 vc6Var = this.L;
        if (vc6Var != null) {
            vc6Var.F();
        }
        q42 q42Var = this.O;
        if (q42Var != null) {
            q42Var.F();
        }
        n12 n12Var = this.b;
        n12Var.U2.o(true);
        n12Var.U2.u().removeView(this.x);
    }

    @Override // f12
    public final boolean q() {
        p();
        return false;
    }

    public void setDelegate(r42 r42Var) {
        this.o0 = r42Var;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
        g0();
    }

    @Override // snb
    public final void updateColors() {
        try {
            P();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        s7 s7Var = this.x;
        if (s7Var != null) {
            try {
                if (s7Var.getSearchField() != null) {
                    s7Var.getSearchField().setCursorColor(aob.v0(aob.j5, this.a));
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
    }

    @Override // f12
    public final void v() {
        this.x.setVisibility(8);
    }

    @Override // f12
    public final void z() {
        n12 n12Var = this.b;
        this.L.U = (n12Var == null || n12Var.d) ? false : true;
    }
}
