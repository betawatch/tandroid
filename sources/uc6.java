// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class uc6 extends e implements fn7 {
    public Location A0;
    public int B0;
    public qp2 C0;
    public w05 D0;
    public boolean E;
    public boolean E0;
    public x05 F;
    public qj5 F0;
    public sj5 G;
    public cc6 G0;
    public xj5 H;
    public TLRPC.TL_channelLocation H0;
    public sj5 I;
    public TLRPC.TL_channelLocation I0;
    public boolean J;
    public r47 J0;
    public float K;
    public boolean K0;
    public ym4 L;
    public boolean L0;
    public double M;
    public qc6 M0;
    public boolean N;
    public final byte N0;
    public bx8 O;
    public int O0;
    public b6 P;
    public oc6 P0;
    public kc6 Q;
    public dc6 Q0;
    public gu R;
    public nc6 R0;
    public d79 S;
    public p55 S0;
    public q42 T;
    public TL_stories.MediaArea T0;
    public View U;
    public boolean U0;
    public x46 V;
    public boolean V0;
    public sla W;
    public Boolean W0;
    public FrameLayout X;
    public FrameLayout Y;
    public jl0 Z;
    public ImageView a;
    public final RectF a0;
    public TextView b;
    public int b0;
    public ImageView c;
    public int c0;
    public sla d;
    public TextureView d0;
    public LinearLayout e;
    public jk6 e0;
    public ImageView f;
    public final RectF f0;
    public final Paint g0;
    public TextView h;
    public int h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public long m0;
    public TextView n;
    public boolean n0;
    public final ArrayList o0;
    public final zh6 p0;
    public long q0;
    public sla r;
    public boolean r0;
    public kg5 s;
    public AnimatorSet s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w;
    public boolean w0;
    public final UndoView[] x;
    public boolean x0;
    public boolean y;
    public boolean y0;
    public Location z0;

    /* JADX WARN: Multi-variable type inference failed */
    public uc6(int i) {
        super(null);
        this.x = new UndoView[2];
        this.a0 = new RectF();
        this.f0 = new RectF();
        this.g0 = new Paint();
        this.j0 = true;
        this.k0 = false;
        this.l0 = true;
        this.n0 = true;
        this.o0 = new ArrayList();
        this.p0 = new zh6();
        this.q0 = -1L;
        this.t0 = true;
        this.O0 = (hl.q.x - a.getCurrentActionBarHeight()) - hl.L(66.0f);
        this.V0 = true;
        this.N0 = i;
        hl.a0();
    }

    public static View k0(View view, Class cls) {
        if (cls.isInstance(view)) {
            return (View) cls.cast(view);
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View k0 = k0(viewGroup.getChildAt(i), cls);
            if (k0 != null) {
                return k0;
            }
        }
        return null;
    }

    public static ak5 z0(ak5 ak5Var, double d, double d2) {
        double d3 = ak5Var.a;
        return new ak5(d3 + Math.toDegrees(d / 6366198.0d), ak5Var.b + Math.toDegrees(d2 / (Math.cos(Math.toRadians(d3)) * 6366198.0d)));
    }

    public final boolean A0() {
        GLSurfaceView gLSurfaceView;
        xj5 xj5Var = this.H;
        if (xj5Var == null || (gLSurfaceView = (GLSurfaceView) ((am2) xj5Var).f) == null || this.J) {
            return false;
        }
        gLSurfaceView.queueEvent(new z56(this, gLSurfaceView, (byte) 9));
        return true;
    }

    public final void B0(pc6 pc6Var) {
        double d;
        double d2;
        TLRPC.Message message;
        if (pc6Var == null || (message = pc6Var.b) == null) {
            r47 r47Var = this.J0;
            if (r47Var != null) {
                TLRPC.GeoPoint geoPoint = r47Var.k.media.geo;
                d = geoPoint.lat;
                d2 = geoPoint._long;
            } else {
                TLRPC.GeoPoint geoPoint2 = this.H0.geo_point;
                d = geoPoint2.lat;
                d2 = geoPoint2._long;
            }
        } else {
            TLRPC.GeoPoint geoPoint3 = message.media.geo;
            d = geoPoint3.lat;
            d2 = geoPoint3._long;
        }
        boolean z = f11.a;
        org.telegram.messenger.a.q();
        if (this.z0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?saddr=%f,%f&daddr=%f,%f", Double.valueOf(this.z0.getLatitude()), Double.valueOf(this.z0.getLongitude()), Double.valueOf(d), Double.valueOf(d2)))));
                return;
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?saddr=&daddr=%f,%f", Double.valueOf(d), Double.valueOf(d2)))));
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    public final void C0(final boolean z) {
        if (this.M0 == null || i0() || getParentActivity() == null || this.z0 == null || !f0()) {
            return;
        }
        final TLRPC.User X1 = wf3.D(this.m0) ? getMessagesController().X1(Long.valueOf(this.m0)) : null;
        showDialog(jj.B(getParentActivity(), z, X1, new ef7() { // from class: fc6
            @Override // ef7
            public final void a(int i) {
                boolean z2 = z;
                uc6.this.w0(i, X1, z2);
            }
        }, null));
    }

    public final void D0() {
        SurfaceView surfaceView;
        if (this.e0 == null || this.H == null) {
            return;
        }
        TextureView textureView = this.d0;
        if ((textureView == null || !textureView.isAttachedToWindow()) && ((surfaceView = this.e0.d) == null || !surfaceView.isAttachedToWindow())) {
            tt ttVar = (tt) ((am2) this.H).b;
            TextureView textureView2 = (TextureView) k0(ttVar, TextureView.class);
            this.d0 = textureView2;
            jk6 jk6Var = this.e0;
            SurfaceView surfaceView2 = textureView2 == null ? (SurfaceView) k0(ttVar, SurfaceView.class) : null;
            if (jk6Var.d != surfaceView2) {
                jk6Var.d = surfaceView2;
                jk6Var.a();
            }
            TextureView textureView3 = this.d0;
            if (textureView3 != null) {
                TextureView.SurfaceTextureListener surfaceTextureListener = textureView3.getSurfaceTextureListener();
                if (!(surfaceTextureListener instanceof rc6)) {
                    this.d0.setSurfaceTextureListener(new rc6(this, surfaceTextureListener));
                }
            }
            P0();
        }
        TextureView textureView4 = this.d0;
        if (textureView4 == null) {
            this.e0.a();
            return;
        }
        TextureView.SurfaceTextureListener surfaceTextureListener2 = textureView4.getSurfaceTextureListener();
        if (surfaceTextureListener2 instanceof rc6) {
            return;
        }
        this.d0.setSurfaceTextureListener(new rc6(this, surfaceTextureListener2));
    }

    public final void E0(Location location) {
        if (location == null) {
            return;
        }
        this.z0 = new Location(location);
        pc6 pc6Var = (pc6) this.p0.f(getUserConfig().e());
        hd6 h = getLocationController().h(this.m0);
        if (pc6Var != null && h != null && pc6Var.b.id == h.b) {
            ak5 ak5Var = new ak5(location.getLatitude(), location.getLongitude());
            pc6Var.e.b(ak5Var);
            w05 w05Var = pc6Var.f;
            if (w05Var != null) {
                w05Var.b(ak5Var);
            }
            if (this.q0 == pc6Var.a) {
                this.F.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(pc6Var.e.a()));
            }
        }
        if (this.J0 == null && this.H0 == null && this.F != null) {
            ak5 ak5Var2 = new ak5(location.getLatitude(), location.getLongitude());
            kc6 kc6Var = this.Q;
            if (kc6Var != null) {
                kc6Var.M(this.z0);
            }
            if (!this.K0) {
                this.A0 = new Location(location);
                if (this.L0) {
                    this.F.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(ak5Var2));
                } else {
                    this.L0 = true;
                    this.F.h(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(ak5Var2, this.F.e() - 4.0f));
                }
            }
        } else {
            this.Q.M(this.z0);
        }
        bx8 bx8Var = this.O;
        if (bx8Var != null) {
            bx8Var.c(true);
        }
        ym4 ym4Var = this.L;
        if (ym4Var != null) {
            double latitude = this.z0.getLatitude();
            double longitude = this.z0.getLongitude();
            xh2 xh2Var = (xh2) ym4Var.b;
            LatLng latLng = new LatLng(latitude, longitude);
            xh2Var.getClass();
            try {
                fre freVar = (fre) xh2Var.a;
                Parcel R = freVar.R();
                jld.b(R, latLng);
                freVar.V(R, 3);
            } catch (RemoteException e) {
                p3d.i(e);
                return;
            }
        }
        qp2 qp2Var = this.C0;
        if (qp2Var != null) {
            qp2Var.a(this.z0);
        }
        Q0(true);
        R0();
    }

    public final void F0(View view) {
        jl0 c = getBaseSimpleGlass().c.c(view, null, false);
        c.p(dtd.l(getResourceProvider()));
        c.r(hl.L(23.0f));
        c.q(hl.L(6.0f));
        view.setBackground(c);
        iye.a(view);
    }

    public final void G0(r47 r47Var) {
        this.J0 = r47Var;
        this.m0 = r47.B0(r47Var.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H0(pc6 pc6Var) {
        if (pc6Var.h == null) {
            TLRPC.User user = pc6Var.c;
            TLRPC.Chat chat = pc6Var.d;
            if (user == null && chat == 0) {
                return;
            }
            rb0 rb0Var = new rb0((vnb) null);
            if (user != null) {
                rb0Var.q(user);
            } else {
                rb0Var.p(chat);
            }
            ImageReceiver imageReceiver = new ImageReceiver(null);
            imageReceiver.d = this.currentAccount;
            imageReceiver.h1 = new u34(this, pc6Var, (byte) 19);
            imageReceiver.I();
            if (user == null) {
                user = chat;
            }
            imageReceiver.U(user, rb0Var, null);
            pc6Var.h = imageReceiver;
        }
    }

    public final void I0(int i, int i2, TLRPC.User user) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = hl.b0(this.z0.getLatitude());
        tL_messageMediaGeoLive.geo._long = hl.b0(this.z0.getLongitude());
        tL_messageMediaGeoLive.heading = id6.e(this.z0);
        int i3 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i;
        tL_messageMediaGeoLive.proximity_notification_radius = i2;
        tL_messageMediaGeoLive.flags = i3 | 9;
        this.M0.b(tL_messageMediaGeoLive, this.N0, true, 0, 0L);
        if (i2 <= 0) {
            finishFragment();
            return;
        }
        this.O.M = true;
        this.c.setImageResource(R.drawable.msg_location_alert2);
        bx8 bx8Var = this.O;
        if (bx8Var != null) {
            bx8Var.a();
        }
        q0().k(0L, 24, Integer.valueOf(i2), user, null, null);
    }

    public final void J0(boolean z, boolean z2) {
        Boolean bool = this.W0;
        if (bool == null || bool.booleanValue() != z) {
            this.W0 = Boolean.valueOf(z);
            TextView textView = this.b;
            if (z2) {
                textView.setVisibility(0);
                this.b.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.7f).scaleY(z ? 1.0f : 0.7f).setInterpolator(k43.h).setDuration(420L).withEndAction(new xac((byte) 24, this, z)).start();
            } else {
                textView.setVisibility(z ? 0 : 8);
                this.b.setAlpha(z ? 1.0f : 0.0f);
                this.b.setScaleX(z ? 1.0f : 0.7f);
                this.b.setScaleY(z ? 1.0f : 0.7f);
            }
        }
    }

    public final void K0() {
        if (this.F == null || !this.y0) {
            return;
        }
        qp2 qp2Var = this.C0;
        if (qp2Var == null) {
            try {
                SensorManager sensorManager = (SensorManager) org.telegram.messenger.a.b.getSystemService("sensor");
                if (sensorManager == null) {
                    return;
                }
                if (sensorManager.getDefaultSensor(11) == null) {
                    if (sensorManager.getDefaultSensor(2) == null) {
                        return;
                    }
                    if (sensorManager.getDefaultSensor(1) == null) {
                        return;
                    }
                }
                qp2Var = new qp2(new cc6(this, (byte) 3));
                this.C0 = qp2Var;
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        qp2Var.a(this.z0);
        qp2 qp2Var2 = this.C0;
        if (qp2Var2.f) {
            return;
        }
        try {
            if (qp2Var2.b == null) {
                SensorManager sensorManager2 = (SensorManager) org.telegram.messenger.a.b.getSystemService("sensor");
                qp2Var2.b = sensorManager2;
                if (sensorManager2 == null) {
                    return;
                }
                Sensor defaultSensor = sensorManager2.getDefaultSensor(11);
                qp2Var2.c = defaultSensor;
                if (defaultSensor == null) {
                    qp2Var2.d = qp2Var2.b.getDefaultSensor(1);
                    qp2Var2.e = qp2Var2.b.getDefaultSensor(2);
                }
            }
            Sensor sensor = qp2Var2.c;
            if (sensor != null) {
                qp2Var2.b.registerListener(qp2Var2, sensor, 1);
            } else {
                Sensor sensor2 = qp2Var2.d;
                if (sensor2 == null || qp2Var2.e == null) {
                    return;
                }
                qp2Var2.b.registerListener(qp2Var2, sensor2, 1);
                qp2Var2.b.registerListener(qp2Var2, qp2Var2.e, 1);
            }
            qp2Var2.f = true;
            qp2Var2.I = 0L;
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    public final void L0() {
        if (!this.y0 || this.k0) {
            return;
        }
        if (this.G0 == null) {
            qj5 onCreateLocationRequest = ((pm3) org.telegram.messenger.a.i()).onCreateLocationRequest();
            this.F0 = onCreateLocationRequest;
            ((t05) onCreateLocationRequest).c();
            ((t05) this.F0).b();
            ((t05) this.F0).a();
            this.G0 = new cc6(this, (byte) 2);
        }
        try {
            ((pm3) org.telegram.messenger.a.i()).requestLocationUpdates(this.F0, this.G0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void M0() {
        qp2 qp2Var = this.C0;
        if (qp2Var == null || !qp2Var.f) {
            return;
        }
        qp2Var.f = false;
        qp2Var.x = false;
        try {
            qp2Var.b.unregisterListener(qp2Var);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void N0(boolean z) {
        int i;
        int i2;
        FrameLayout.LayoutParams layoutParams;
        f89 L = this.R.L(0);
        if (L != null) {
            i = (int) L.a.getY();
            i2 = Math.min(i, 0) + this.O0;
            this.b0 = (this.O0 + i) - this.h0;
        } else {
            i = -this.P.getMeasuredHeight();
            this.b0 = -hl.L(41.0f);
            i2 = 0;
        }
        this.R.invalidate();
        if (((FrameLayout.LayoutParams) this.P.getLayoutParams()) != null) {
            xj5 xj5Var = this.H;
            if (i2 <= 0) {
                if (((tt) ((am2) xj5Var).b).getVisibility() == 0) {
                    ((tt) ((am2) this.H).b).setVisibility(4);
                    this.P.setVisibility(4);
                }
            } else if (((tt) ((am2) xj5Var).b).getVisibility() == 4) {
                ((tt) ((am2) this.H).b).setVisibility(0);
                this.P.setVisibility(0);
            }
            this.P.setTranslationY(Math.min(0, i));
            int i3 = -i;
            ((tt) ((am2) this.H).b).setTranslationY(Math.max(0, i3 / 2));
            FrameLayout frameLayout = this.X;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-Math.min(0, i));
                float l = Utilities.l((qu6.x(53.0f, i2 - this.h0, hl.L(46.0f) + eg0.f(this.mSystemInsets.b)) - hl.L(7.0f)) / hl.L(48.0f));
                FrameLayout frameLayout2 = this.X;
                frameLayout2.setAlpha(l);
                frameLayout2.setVisibility(l > 0.0f ? 0 : 4);
                FrameLayout frameLayout3 = this.Y;
                frameLayout3.setAlpha(l);
                frameLayout3.setVisibility(l > 0.0f ? 0 : 4);
                P0();
            }
            View view = this.U;
            if (view != null) {
                int L2 = ((i2 / 2) + (i3 - hl.L(view.getTag() != null ? 69.0f : 48.0f))) - (this.h0 / 2);
                this.B0 = L2;
                view.setTranslationY(L2);
            }
            if (z || (layoutParams = (FrameLayout.LayoutParams) ((tt) ((am2) this.H).b).getLayoutParams()) == null || layoutParams.height == o0()) {
                return;
            }
            layoutParams.height = o0();
            x05 x05Var = this.F;
            if (x05Var != null) {
                x05Var.n(hl.L(70.0f), 0, hl.L(70.0f), n0());
            }
            ((tt) ((am2) this.H).b).setLayoutParams(layoutParams);
        }
    }

    public final void O0() {
        if (!this.u0) {
            this.e.setVisibility(8);
            return;
        }
        boolean z = this.w0;
        d79 d79Var = this.S;
        if (!z) {
            d79Var.setEmptyView(this.e);
            return;
        }
        d79Var.setEmptyView(null);
        this.e.setVisibility(8);
        this.S.setVisibility(8);
    }

    public final void P0() {
        xj5 xj5Var;
        b6 b6Var;
        jk6 jk6Var = this.e0;
        if (jk6Var == null || (xj5Var = this.H) == null) {
            return;
        }
        tt ttVar = (tt) ((am2) xj5Var).b;
        boolean z = this.d0 == null && this.y0 && !isFinishing() && (b6Var = this.P) != null && b6Var.getVisibility() == 0 && ttVar.getParent() != null && ttVar.getVisibility() == 0;
        if (jk6Var.g != z) {
            jk6Var.g = z;
            if (z) {
                jk6Var.a();
            } else {
                jk6Var.d();
            }
        }
    }

    public final void Q0(boolean z) {
        Location location;
        if (this.F == null || (location = this.z0) == null) {
            return;
        }
        qp2 qp2Var = this.C0;
        boolean z2 = qp2Var != null && qp2Var.H;
        try {
            w05 w05Var = this.D0;
            int i = R.drawable.map_pin_circle;
            if (w05Var == null) {
                xh4 xh4Var = (xh4) ((z3f) org.telegram.messenger.a.j()).onCreateMarkerOptions();
                ((el6) xh4Var.b).a = new LatLng(this.z0.getLatitude(), this.z0.getLongitude());
                el6 el6Var = (el6) xh4Var.b;
                el6Var.r = true;
                el6Var.e = 0.5f;
                el6Var.f = 0.5f;
                el6Var.d = usd.b(z2 ? R.drawable.map_pin_cone2 : R.drawable.map_pin_circle);
                this.D0 = this.F.a(xh4Var);
                this.E0 = z2;
            } else if (z) {
                double latitude = location.getLatitude();
                double longitude = this.z0.getLongitude();
                dl6 dl6Var = w05Var.a;
                LatLng latLng = new LatLng(latitude, longitude);
                dl6Var.getClass();
                try {
                    hmf hmfVar = (hmf) dl6Var.a;
                    Parcel R = hmfVar.R();
                    jld.b(R, latLng);
                    hmfVar.V(R, 3);
                } catch (RemoteException e) {
                    throw new zp2(e);
                }
            }
            w05 w05Var2 = this.D0;
            if (w05Var2 != null) {
                if (z2 != this.E0) {
                    if (z2) {
                        i = R.drawable.map_pin_cone2;
                    }
                    w05Var2.a.a(usd.b(i));
                    this.E0 = z2;
                }
                this.D0.c(z2 ? this.C0.G : 0.0f);
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    public final void R0() {
        TLRPC.MessageMedia messageMedia;
        int i;
        if (this.b == null) {
            return;
        }
        if (this.r0) {
            J0(false, true);
            l0();
            return;
        }
        int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.Message message = ((pc6) arrayList.get(i3)).b;
            if (message != null && (messageMedia = message.media) != null && ((i = messageMedia.period) == Integer.MAX_VALUE || message.date + i > currentTime)) {
                i2++;
            }
        }
        boolean z = this.p0.f(getUserConfig().e()) != null;
        if (this.z0 != null && !z) {
            i2++;
        }
        J0(i2 >= 2, true);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.n5));
        hashSet.add(Integer.valueOf(aob.a7));
        hashSet.add(Integer.valueOf(aob.b7));
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
        hashSet.add(Integer.valueOf(aob.yj));
        hashSet.add(Integer.valueOf(aob.wj));
        hashSet.add(Integer.valueOf(aob.xj));
    }

    public final pc6 b0(TLRPC.Message message) {
        Location location;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        double d = geoPoint.lat;
        double d2 = geoPoint._long;
        long B1 = r47.B1(message.from_id);
        zh6 zh6Var = this.p0;
        pc6 pc6Var = (pc6) zh6Var.f(B1);
        if (pc6Var == null) {
            pc6Var = new pc6();
            pc6Var.b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                pc6Var.c = getMessagesController().X1(Long.valueOf(pc6Var.b.from_id.user_id));
                pc6Var.a = pc6Var.b.from_id.user_id;
            } else {
                long B0 = r47.B0(message);
                if (wf3.D(B0)) {
                    pc6Var.c = getMessagesController().X1(Long.valueOf(B0));
                } else {
                    pc6Var.d = getMessagesController().M0(Long.valueOf(-B0));
                }
                pc6Var.a = B0;
            }
            H0(pc6Var);
            try {
                xh4 xh4Var = (xh4) ((z3f) org.telegram.messenger.a.j()).onCreateMarkerOptions();
                el6 el6Var = (el6) xh4Var.b;
                el6 el6Var2 = (el6) xh4Var.b;
                el6Var.a = new LatLng(d, d2);
                Bitmap h0 = h0(pc6Var);
                if (h0 != null) {
                    el6Var2.d = usd.a(h0);
                    el6Var2.e = 0.5f;
                    el6Var2.f = 0.8010882f;
                    pc6Var.e = this.F.a(xh4Var);
                    if (!lbc.D(pc6Var.c)) {
                        xh4 xh4Var2 = (xh4) ((z3f) org.telegram.messenger.a.j()).onCreateMarkerOptions();
                        ((el6) xh4Var2.b).a = new LatLng(d, d2);
                        el6 el6Var3 = (el6) xh4Var2.b;
                        el6Var3.r = true;
                        el6Var3.e = 0.5f;
                        el6Var3.f = 0.5f;
                        w05 a = this.F.a(xh4Var2);
                        pc6Var.f = a;
                        int i = message.media.heading;
                        if (i != 0) {
                            a.c(i);
                            pc6Var.f.a.a(usd.b(R.drawable.map_pin_cone2));
                            pc6Var.g = true;
                        } else {
                            a.c(0.0f);
                            pc6Var.f.a.a(usd.b(R.drawable.map_pin_circle));
                            pc6Var.g = false;
                        }
                    }
                    this.o0.add(pc6Var);
                    zh6Var.k(pc6Var.a, pc6Var);
                    hd6 h = getLocationController().h(this.m0);
                    if (pc6Var.a == getUserConfig().e() && h != null && pc6Var.b.id == h.b && (location = this.z0) != null) {
                        double latitude = location.getLatitude();
                        double longitude = this.z0.getLongitude();
                        dl6 dl6Var = pc6Var.e.a;
                        LatLng latLng = new LatLng(latitude, longitude);
                        dl6Var.getClass();
                        try {
                            hmf hmfVar = (hmf) dl6Var.a;
                            Parcel R = hmfVar.R();
                            jld.b(R, latLng);
                            hmfVar.V(R, 3);
                        } catch (RemoteException e) {
                            throw new zp2(e);
                        }
                    }
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        } else {
            pc6Var.b = message;
            dl6 dl6Var2 = pc6Var.e.a;
            LatLng latLng2 = new LatLng(d, d2);
            dl6Var2.getClass();
            try {
                hmf hmfVar2 = (hmf) dl6Var2.a;
                Parcel R2 = hmfVar2.R();
                jld.b(R2, latLng2);
                hmfVar2.V(R2, 3);
                if (this.q0 == pc6Var.a) {
                    this.F.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(pc6Var.e.a()));
                }
            } catch (RemoteException e3) {
                p3d.i(e3);
                return null;
            }
        }
        bx8 bx8Var = this.O;
        if (bx8Var != null) {
            bx8Var.c(true);
        }
        R0();
        return pc6Var;
    }

    public final void c0() {
        if (this.fragmentView == null || this.R == null) {
            return;
        }
        mq5 mq5Var = this.mSystemInsets;
        int i = mq5Var.b;
        int i2 = mq5Var.d;
        FrameLayout frameLayout = this.X;
        if (frameLayout != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            int f = eg0.f(i) - hl.L(6.0f);
            if (layoutParams.topMargin != f) {
                layoutParams.topMargin = f;
                this.X.requestLayout();
            }
        }
        this.R.setClipToPadding(false);
        this.R.setPadding(0, 0, 0, i2);
        d79 d79Var = this.S;
        if (d79Var != null) {
            d79Var.setClipToPadding(false);
            eg0.g(this.S, i, i2, a.getCurrentActionBarHeight(), 0);
        }
        if (this.fragmentView.getMeasuredHeight() > 0) {
            m0(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0841, code lost:
    
        if (r33.H0 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0843, code lost:
    
        r0 = r33.H0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0845, code lost:
    
        if (r0 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0847, code lost:
    
        r33.Q.P = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x084c, code lost:
    
        r0 = r33.J0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x084e, code lost:
    
        if (r0 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0850, code lost:
    
        r4 = r33.Q;
        r4.O = r0;
        r4.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x083d, code lost:
    
        if (r0.C3() != false) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x076d  */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i;
        boolean z;
        boolean z2;
        r47 r47Var;
        r47 r47Var2;
        byte b;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        final byte b2 = 0;
        this.v0 = false;
        this.u0 = false;
        this.w0 = false;
        kc6 kc6Var = this.Q;
        if (kc6Var != null) {
            kc6Var.F();
        }
        q42 q42Var = this.T;
        if (q42Var != null) {
            q42Var.F();
        }
        if (this.H0 != null) {
            Location location = new Location("network");
            this.A0 = location;
            location.setLatitude(this.H0.geo_point.lat);
            this.A0.setLongitude(this.H0.geo_point._long);
        } else if (this.J0 != null) {
            Location location2 = new Location("network");
            this.A0 = location2;
            location2.setLatitude(this.J0.k.media.geo.lat);
            this.A0.setLongitude(this.J0.k.media.geo._long);
        }
        final byte b3 = 1;
        this.k0 = (getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ic6(this));
        rla v = this.simpleActionBar.v();
        sla a = v.a(0, R.drawable.msg_map_type);
        this.d = a;
        final byte b4 = 2;
        a.e(2, R.drawable.msg_map, ob6.M0(2131748444, null));
        this.d.e(3, R.drawable.msg_satellite, ob6.M0(2131745676, null));
        this.d.e(4, R.drawable.msg_hybrid, ob6.M0(2131749029, null));
        this.d.setContentDescription(ob6.M0(2131754834, null));
        TLRPC.TL_channelLocation tL_channelLocation = this.H0;
        byte b5 = this.N0;
        if (tL_channelLocation != null) {
            this.simpleActionBar.setTitle(ob6.M0(2131752185, null));
        } else {
            r47 r47Var3 = this.J0;
            if (r47Var3 == null) {
                this.simpleActionBar.setTitle(ob6.M0(2131745184, null));
                if (b5 != 4) {
                    sla a2 = v.a(0, R.drawable.outline_header_search);
                    a2.N();
                    a2.C0 = new r10(this, (byte) 15);
                    this.r = a2;
                    a2.setSearchFieldHint(ob6.M0(2131745564, null));
                    this.r.setContentDescription(ob6.M0(2131745564, null));
                }
            } else if (r47Var3.C3()) {
                this.simpleActionBar.setTitle(ob6.M0(2131753959, null));
                sla a3 = v.a(0, R.drawable.ic_ab_other);
                this.W = a3;
                a3.e(6, R.drawable.filled_directions, ob6.M0(2131750434, null));
            } else {
                if (b5 != 3) {
                    String str = this.J0.k.media.title;
                    if (str == null || str.length() <= 0) {
                        this.simpleActionBar.setTitle(ob6.M0(2131752185, null));
                    } else {
                        this.simpleActionBar.setTitle(ob6.M0(2131745132, null));
                    }
                }
                if (b5 != 3) {
                    sla a4 = v.a(0, R.drawable.ic_ab_other);
                    this.W = a4;
                    a4.e(1, R.drawable.msg_openin, ob6.M0(2131747523, null));
                    if (!getLocationController().i(this.m0) && this.V0) {
                        this.W.e(5, R.drawable.msg_location, ob6.M0(2131745340, null));
                    }
                    this.W.setContentDescription(ob6.M0(2131754834, null));
                }
            }
        }
        FrameLayout sc6Var = new sc6(this, context);
        this.fragmentView = sc6Var;
        int i2 = aob.h5;
        yob.h(i2, getResourceProvider(), sc6Var);
        this.h0 = hl.L((b5 == 0 || b5 == 1) ? 26.0f : 16.0f);
        b6 b6Var = new b6(context, (byte) 19);
        this.P = b6Var;
        b6Var.setBackgroundDrawable(new ya1(r0()));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        this.P.addView(frameLayout, tre.e(-1, -2, 51));
        this.Y = new FrameLayout(context);
        FrameLayout.LayoutParams e = tre.e(-1, -2, 83);
        e.bottomMargin = hl.L(1.0f) + hl.L(29.0f) + this.h0;
        this.P.addView(this.Y, e);
        if (this.J0 != null && b5 == 3) {
            TextView textView = new TextView(context);
            F0(textView);
            yob.X(textView, aob.mj, getResourceProvider());
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(hl.o());
            textView.setGravity(17);
            textView.setPadding(hl.L(24.0f), 0, hl.L(24.0f), 0);
            this.simpleActionBar.addView(textView, tre.e(-2, 58, 1));
            textView.setText(ob6.M0(2131747522, null));
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: yb6
                public final /* synthetic */ uc6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x05 x05Var;
                    byte b6 = b4;
                    byte b7 = 4;
                    uc6 uc6Var = this.b;
                    byte b8 = 1;
                    switch (b6) {
                        case 0:
                            uc6Var.q0 = -1L;
                            uc6Var.K0 = true;
                            if (uc6Var.l0()) {
                                uc6Var.r0 = true;
                                uc6Var.J0(false, true);
                                break;
                            }
                            break;
                        case 1:
                            if (uc6Var.getParentActivity() != null && uc6Var.z0 != null && uc6Var.f0() && uc6Var.F != null) {
                                kg5 kg5Var = uc6Var.s;
                                if (kg5Var != null) {
                                    kg5Var.f(true);
                                }
                                uc7.e1().edit().putInt("proximityhint", 3).commit();
                                hd6 h = uc6Var.getLocationController().h(uc6Var.m0);
                                if (uc6Var.y) {
                                    uc6Var.x[0].d(1, true);
                                }
                                byte b9 = 10;
                                if (h != null && h.f > 0) {
                                    uc6Var.c.setImageResource(R.drawable.msg_location_alert);
                                    ym4 ym4Var = uc6Var.L;
                                    if (ym4Var != null) {
                                        ym4Var.H0();
                                        uc6Var.L = null;
                                    }
                                    uc6Var.y = true;
                                    uc6Var.q0().k(0L, 25, 0, null, new dc6(uc6Var, (byte) 3), new z56(uc6Var, h, b9));
                                    break;
                                } else {
                                    ym4 ym4Var2 = uc6Var.L;
                                    byte b10 = 6;
                                    if (ym4Var2 == null) {
                                        uc6Var.g0(500);
                                    } else {
                                        xh2 xh2Var = (xh2) ym4Var2.b;
                                        xh2Var.getClass();
                                        try {
                                            fre freVar = (fre) xh2Var.a;
                                            Parcel Q = freVar.Q(freVar.R(), 6);
                                            double readDouble = Q.readDouble();
                                            Q.recycle();
                                            uc6Var.M = readDouble;
                                        } catch (RemoteException e2) {
                                            p3d.i(e2);
                                            return;
                                        }
                                    }
                                    TLRPC.User X1 = wf3.D(uc6Var.m0) ? uc6Var.getMessagesController().X1(Long.valueOf(uc6Var.m0)) : null;
                                    Activity parentActivity = uc6Var.getParentActivity();
                                    cc6 cc6Var = new cc6(uc6Var, b10);
                                    u34 u34Var = new u34(uc6Var, X1, (byte) 20);
                                    dc6 dc6Var = new dc6(uc6Var, (byte) 4);
                                    bx8 bx8Var = new bx8(parentActivity);
                                    bx8Var.a = null;
                                    bx8Var.d = -1;
                                    bx8Var.e = false;
                                    bx8Var.f = false;
                                    bx8Var.h = null;
                                    bx8Var.n = new Rect();
                                    bx8Var.x = true;
                                    bx8Var.G = k43.h;
                                    bx8Var.setWillNotDraw(false);
                                    bx8Var.R = dc6Var;
                                    bx8Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                    Rect rect = new Rect();
                                    Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                    yob.x(bx8Var, mutate, aob.h5, null, PorterDuff.Mode.MULTIPLY);
                                    mutate.getPadding(rect);
                                    int i3 = rect.left;
                                    bx8Var.y = i3;
                                    xw8 xw8Var = new xw8(bx8Var.getContext());
                                    bx8Var.w = xw8Var;
                                    xw8Var.setBackgroundDrawable(mutate);
                                    xw8Var.setPadding(i3, (hl.L(8.0f) + rect.top) - 1, i3, 0);
                                    xw8Var.setVisibility(4);
                                    bx8Var.addView(xw8Var, 0, tre.e(-1, -2, 80));
                                    ob6.l();
                                    bx8Var.P = ob6.g0.booleanValue();
                                    bx8Var.N = X1;
                                    bx8Var.J = cc6Var;
                                    hq7 hq7Var = new hq7(parentActivity, null);
                                    bx8Var.H = hq7Var;
                                    hq7Var.setTextOffset(hl.L(10.0f));
                                    hq7Var.setItemCount(5);
                                    hq7 hq7Var2 = new hq7(parentActivity, null);
                                    bx8Var.I = hq7Var2;
                                    hq7Var2.setItemCount(5);
                                    hq7Var2.setTextOffset(-hl.L(10.0f));
                                    yw8 yw8Var = new yw8(bx8Var, parentActivity);
                                    bx8Var.Q = yw8Var;
                                    yw8Var.setOrientation(1);
                                    FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                    yw8Var.addView(frameLayout2, tre.t(-1, -2, 51, 22, 0, 0, 4));
                                    TextView textView2 = new TextView(parentActivity);
                                    textView2.setText(ob6.M0(2131748510, null));
                                    qd4.w(textView2, aob.j5, null, 1, 20.0f);
                                    frameLayout2.addView(textView2, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                    textView2.setOnTouchListener(new b02((byte) 22));
                                    LinearLayout linearLayout = new LinearLayout(parentActivity);
                                    linearLayout.setOrientation(0);
                                    linearLayout.setWeightSum(1.0f);
                                    yw8Var.addView(linearLayout, tre.o(-1, -2));
                                    System.currentTimeMillis();
                                    FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                    TextView textView3 = new TextView(parentActivity);
                                    bx8Var.L = textView3;
                                    zw8 zw8Var = new zw8(parentActivity);
                                    bx8Var.K = zw8Var;
                                    linearLayout.addView(hq7Var, tre.l(0.5f, 0, jn7.s4));
                                    hq7Var.setFormatter(new ww8(bx8Var, (byte) 0));
                                    hq7Var.setMinValue(0);
                                    hq7Var.setMaxValue(10);
                                    hq7Var.setWrapSelectorWheel(false);
                                    hq7Var.setTextOffset(hl.L(20.0f));
                                    ww8 ww8Var = new ww8(bx8Var, (byte) 1);
                                    hq7Var.setOnValueChangedListener(ww8Var);
                                    hq7Var2.setMinValue(0);
                                    hq7Var2.setMaxValue(10);
                                    hq7Var2.setWrapSelectorWheel(false);
                                    hq7Var2.setTextOffset(-hl.L(20.0f));
                                    linearLayout.addView(hq7Var2, tre.l(0.5f, 0, jn7.s4));
                                    hq7Var2.setFormatter(new ww8(bx8Var, (byte) 2));
                                    hq7Var2.setOnValueChangedListener(ww8Var);
                                    hq7Var.setValue(0);
                                    hq7Var2.setValue(6);
                                    yw8Var.addView(frameLayout3, tre.t(-1, 48, 83, 16, 15, 16, 16));
                                    zw8Var.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                                    zw8Var.setGravity(17);
                                    yob.X(zw8Var, aob.Ji, null);
                                    zw8Var.setTextSize(1, 14.0f);
                                    zw8Var.setMaxLines(2);
                                    zw8Var.setTypeface(hl.o());
                                    zw8Var.setBackgroundDrawable(rnb.f(aob.Fi, 4.0f));
                                    frameLayout3.addView(zw8Var, tre.c(48.0f, -1));
                                    zw8Var.setOnClickListener(new uv5(bx8Var, u34Var, (byte) 28));
                                    textView3.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                                    textView3.setGravity(17);
                                    yob.X(textView3, aob.q5, null);
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setAlpha(0.0f);
                                    textView3.setScaleX(0.5f);
                                    textView3.setScaleY(0.5f);
                                    frameLayout3.addView(textView3, tre.c(48.0f, -1));
                                    xw8Var.addView(yw8Var, tre.e(-1, -2, 51));
                                    uc6Var.O = bx8Var;
                                    ((FrameLayout) uc6Var.fragmentView).addView(bx8Var, tre.c(-1.0f, -1));
                                    bx8 bx8Var2 = uc6Var.O;
                                    bx8Var2.r = false;
                                    AnimatorSet animatorSet = bx8Var2.s;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        bx8Var2.s = null;
                                    }
                                    xw8 xw8Var2 = bx8Var2.w;
                                    Point point = hl.q;
                                    xw8Var2.measure(View.MeasureSpec.makeMeasureSpec(point.x + (bx8Var2.y << 1), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                                    if (!bx8Var2.r) {
                                        xw8Var2.setVisibility(0);
                                        if (bx8Var2.x) {
                                            bx8Var2.setLayerType(2, null);
                                        }
                                        xw8Var2.setTranslationY(xw8Var2.getMeasuredHeight());
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        bx8Var2.s = animatorSet2;
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(xw8Var2, (Property<xw8, Float>) View.TRANSLATION_Y, 0.0f));
                                        bx8Var2.s.setDuration(400L);
                                        bx8Var2.s.setStartDelay(20L);
                                        bx8Var2.s.setInterpolator(bx8Var2.G);
                                        bx8Var2.s.addListener(new ax8(bx8Var2, b8));
                                        jn7.e().k(99, 512);
                                        bx8Var2.s.start();
                                    }
                                    bx8Var2.c(true);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            try {
                                TLRPC.GeoPoint geoPoint = uc6Var.J0.k.media.geo;
                                double d = geoPoint.lat;
                                double d2 = geoPoint._long;
                                uc6Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                                break;
                            } catch (Exception e3) {
                                cc4.g(e3, true);
                                return;
                            }
                        default:
                            byte b11 = uc6Var.N0;
                            Activity parentActivity2 = uc6Var.getParentActivity();
                            if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                                if (uc6Var.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uc6Var.getParentActivity());
                                    int i4 = aob.L5;
                                    alertDialog$Builder.l(R.raw.permission_request_location, 72, uc6Var.getThemedColor(i4), null);
                                    alertDialog$Builder.m(i4, uc6Var.getResourceProvider());
                                    SpannableStringBuilder S2 = hl.S2(ob6.M0(2131747031, null));
                                    id idVar = alertDialog$Builder.a;
                                    idVar.U = S2;
                                    alertDialog$Builder.g(ob6.M0(2131747027, null), new cc6(uc6Var, b7));
                                    alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                    uc6Var.showDialog(idVar);
                                    break;
                                }
                            } else if (uc6Var.f0() || b11 == 3) {
                                if ((uc6Var.J0 != null && b11 != 3) || uc6Var.H0 != null) {
                                    if (uc6Var.z0 != null && (x05Var = uc6Var.F) != null) {
                                        x05Var.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(new ak5(uc6Var.z0.getLatitude(), uc6Var.z0.getLongitude()), uc6Var.F.e() - 4.0f));
                                        break;
                                    }
                                } else if (uc6Var.z0 != null && uc6Var.F != null) {
                                    ImageView imageView = uc6Var.a;
                                    int i5 = aob.mj;
                                    yob.s(imageView, i5, uc6Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                    uc6Var.a.setTag(Integer.valueOf(i5));
                                    uc6Var.Q.L(null);
                                    uc6Var.K0 = false;
                                    uc6Var.F.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(new ak5(uc6Var.z0.getLatitude(), uc6Var.z0.getLongitude())));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        ema titleTextView = this.simpleActionBar.getTitleTextView();
        if (titleTextView != null) {
            jl0 c = getBaseSimpleGlass().c.c(titleTextView, null, false);
            c.p(dtd.l(getResourceProvider()));
            c.r(hl.L(23.0f));
            titleTextView.setBackground(c);
            Paint.FontMetricsInt fontMetricsInt = titleTextView.getTextPaint().getFontMetricsInt();
            i = 2;
            int max = Math.max(0, (hl.L(46.0f) - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
            titleTextView.setPadding(hl.L(18.0f), max, hl.L(18.0f), max);
        } else {
            i = 2;
        }
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        F0(imageView);
        this.a.setImageResource(R.drawable.msg_current_location);
        ImageView imageView2 = this.a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.a;
        int i3 = aob.mj;
        vnb resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.s(imageView3, i3, resourceProvider, mode);
        this.a.setTag(Integer.valueOf(i3));
        this.a.setContentDescription(ob6.M0(2131754826, null));
        this.Y.addView(this.a, tre.e(58, 58, 85));
        final byte b6 = 3;
        this.a.setOnClickListener(new View.OnClickListener(this) { // from class: yb6
            public final /* synthetic */ uc6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x05 x05Var;
                byte b62 = b6;
                byte b7 = 4;
                uc6 uc6Var = this.b;
                byte b8 = 1;
                switch (b62) {
                    case 0:
                        uc6Var.q0 = -1L;
                        uc6Var.K0 = true;
                        if (uc6Var.l0()) {
                            uc6Var.r0 = true;
                            uc6Var.J0(false, true);
                            break;
                        }
                        break;
                    case 1:
                        if (uc6Var.getParentActivity() != null && uc6Var.z0 != null && uc6Var.f0() && uc6Var.F != null) {
                            kg5 kg5Var = uc6Var.s;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            uc7.e1().edit().putInt("proximityhint", 3).commit();
                            hd6 h = uc6Var.getLocationController().h(uc6Var.m0);
                            if (uc6Var.y) {
                                uc6Var.x[0].d(1, true);
                            }
                            byte b9 = 10;
                            if (h != null && h.f > 0) {
                                uc6Var.c.setImageResource(R.drawable.msg_location_alert);
                                ym4 ym4Var = uc6Var.L;
                                if (ym4Var != null) {
                                    ym4Var.H0();
                                    uc6Var.L = null;
                                }
                                uc6Var.y = true;
                                uc6Var.q0().k(0L, 25, 0, null, new dc6(uc6Var, (byte) 3), new z56(uc6Var, h, b9));
                                break;
                            } else {
                                ym4 ym4Var2 = uc6Var.L;
                                byte b10 = 6;
                                if (ym4Var2 == null) {
                                    uc6Var.g0(500);
                                } else {
                                    xh2 xh2Var = (xh2) ym4Var2.b;
                                    xh2Var.getClass();
                                    try {
                                        fre freVar = (fre) xh2Var.a;
                                        Parcel Q = freVar.Q(freVar.R(), 6);
                                        double readDouble = Q.readDouble();
                                        Q.recycle();
                                        uc6Var.M = readDouble;
                                    } catch (RemoteException e2) {
                                        p3d.i(e2);
                                        return;
                                    }
                                }
                                TLRPC.User X1 = wf3.D(uc6Var.m0) ? uc6Var.getMessagesController().X1(Long.valueOf(uc6Var.m0)) : null;
                                Activity parentActivity = uc6Var.getParentActivity();
                                cc6 cc6Var = new cc6(uc6Var, b10);
                                u34 u34Var = new u34(uc6Var, X1, (byte) 20);
                                dc6 dc6Var = new dc6(uc6Var, (byte) 4);
                                bx8 bx8Var = new bx8(parentActivity);
                                bx8Var.a = null;
                                bx8Var.d = -1;
                                bx8Var.e = false;
                                bx8Var.f = false;
                                bx8Var.h = null;
                                bx8Var.n = new Rect();
                                bx8Var.x = true;
                                bx8Var.G = k43.h;
                                bx8Var.setWillNotDraw(false);
                                bx8Var.R = dc6Var;
                                bx8Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect = new Rect();
                                Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                yob.x(bx8Var, mutate, aob.h5, null, PorterDuff.Mode.MULTIPLY);
                                mutate.getPadding(rect);
                                int i32 = rect.left;
                                bx8Var.y = i32;
                                xw8 xw8Var = new xw8(bx8Var.getContext());
                                bx8Var.w = xw8Var;
                                xw8Var.setBackgroundDrawable(mutate);
                                xw8Var.setPadding(i32, (hl.L(8.0f) + rect.top) - 1, i32, 0);
                                xw8Var.setVisibility(4);
                                bx8Var.addView(xw8Var, 0, tre.e(-1, -2, 80));
                                ob6.l();
                                bx8Var.P = ob6.g0.booleanValue();
                                bx8Var.N = X1;
                                bx8Var.J = cc6Var;
                                hq7 hq7Var = new hq7(parentActivity, null);
                                bx8Var.H = hq7Var;
                                hq7Var.setTextOffset(hl.L(10.0f));
                                hq7Var.setItemCount(5);
                                hq7 hq7Var2 = new hq7(parentActivity, null);
                                bx8Var.I = hq7Var2;
                                hq7Var2.setItemCount(5);
                                hq7Var2.setTextOffset(-hl.L(10.0f));
                                yw8 yw8Var = new yw8(bx8Var, parentActivity);
                                bx8Var.Q = yw8Var;
                                yw8Var.setOrientation(1);
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                yw8Var.addView(frameLayout2, tre.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView2 = new TextView(parentActivity);
                                textView2.setText(ob6.M0(2131748510, null));
                                qd4.w(textView2, aob.j5, null, 1, 20.0f);
                                frameLayout2.addView(textView2, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView2.setOnTouchListener(new b02((byte) 22));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                yw8Var.addView(linearLayout, tre.o(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                TextView textView3 = new TextView(parentActivity);
                                bx8Var.L = textView3;
                                zw8 zw8Var = new zw8(parentActivity);
                                bx8Var.K = zw8Var;
                                linearLayout.addView(hq7Var, tre.l(0.5f, 0, jn7.s4));
                                hq7Var.setFormatter(new ww8(bx8Var, (byte) 0));
                                hq7Var.setMinValue(0);
                                hq7Var.setMaxValue(10);
                                hq7Var.setWrapSelectorWheel(false);
                                hq7Var.setTextOffset(hl.L(20.0f));
                                ww8 ww8Var = new ww8(bx8Var, (byte) 1);
                                hq7Var.setOnValueChangedListener(ww8Var);
                                hq7Var2.setMinValue(0);
                                hq7Var2.setMaxValue(10);
                                hq7Var2.setWrapSelectorWheel(false);
                                hq7Var2.setTextOffset(-hl.L(20.0f));
                                linearLayout.addView(hq7Var2, tre.l(0.5f, 0, jn7.s4));
                                hq7Var2.setFormatter(new ww8(bx8Var, (byte) 2));
                                hq7Var2.setOnValueChangedListener(ww8Var);
                                hq7Var.setValue(0);
                                hq7Var2.setValue(6);
                                yw8Var.addView(frameLayout3, tre.t(-1, 48, 83, 16, 15, 16, 16));
                                zw8Var.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                                zw8Var.setGravity(17);
                                yob.X(zw8Var, aob.Ji, null);
                                zw8Var.setTextSize(1, 14.0f);
                                zw8Var.setMaxLines(2);
                                zw8Var.setTypeface(hl.o());
                                zw8Var.setBackgroundDrawable(rnb.f(aob.Fi, 4.0f));
                                frameLayout3.addView(zw8Var, tre.c(48.0f, -1));
                                zw8Var.setOnClickListener(new uv5(bx8Var, u34Var, (byte) 28));
                                textView3.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                                textView3.setGravity(17);
                                yob.X(textView3, aob.q5, null);
                                textView3.setTextSize(1, 14.0f);
                                textView3.setAlpha(0.0f);
                                textView3.setScaleX(0.5f);
                                textView3.setScaleY(0.5f);
                                frameLayout3.addView(textView3, tre.c(48.0f, -1));
                                xw8Var.addView(yw8Var, tre.e(-1, -2, 51));
                                uc6Var.O = bx8Var;
                                ((FrameLayout) uc6Var.fragmentView).addView(bx8Var, tre.c(-1.0f, -1));
                                bx8 bx8Var2 = uc6Var.O;
                                bx8Var2.r = false;
                                AnimatorSet animatorSet = bx8Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    bx8Var2.s = null;
                                }
                                xw8 xw8Var2 = bx8Var2.w;
                                Point point = hl.q;
                                xw8Var2.measure(View.MeasureSpec.makeMeasureSpec(point.x + (bx8Var2.y << 1), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                                if (!bx8Var2.r) {
                                    xw8Var2.setVisibility(0);
                                    if (bx8Var2.x) {
                                        bx8Var2.setLayerType(2, null);
                                    }
                                    xw8Var2.setTranslationY(xw8Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    bx8Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(xw8Var2, (Property<xw8, Float>) View.TRANSLATION_Y, 0.0f));
                                    bx8Var2.s.setDuration(400L);
                                    bx8Var2.s.setStartDelay(20L);
                                    bx8Var2.s.setInterpolator(bx8Var2.G);
                                    bx8Var2.s.addListener(new ax8(bx8Var2, b8));
                                    jn7.e().k(99, 512);
                                    bx8Var2.s.start();
                                }
                                bx8Var2.c(true);
                                break;
                            }
                        }
                        break;
                    case 2:
                        try {
                            TLRPC.GeoPoint geoPoint = uc6Var.J0.k.media.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            uc6Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                            break;
                        } catch (Exception e3) {
                            cc4.g(e3, true);
                            return;
                        }
                    default:
                        byte b11 = uc6Var.N0;
                        Activity parentActivity2 = uc6Var.getParentActivity();
                        if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (uc6Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uc6Var.getParentActivity());
                                int i4 = aob.L5;
                                alertDialog$Builder.l(R.raw.permission_request_location, 72, uc6Var.getThemedColor(i4), null);
                                alertDialog$Builder.m(i4, uc6Var.getResourceProvider());
                                SpannableStringBuilder S2 = hl.S2(ob6.M0(2131747031, null));
                                id idVar = alertDialog$Builder.a;
                                idVar.U = S2;
                                alertDialog$Builder.g(ob6.M0(2131747027, null), new cc6(uc6Var, b7));
                                alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                uc6Var.showDialog(idVar);
                                break;
                            }
                        } else if (uc6Var.f0() || b11 == 3) {
                            if ((uc6Var.J0 != null && b11 != 3) || uc6Var.H0 != null) {
                                if (uc6Var.z0 != null && (x05Var = uc6Var.F) != null) {
                                    x05Var.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(new ak5(uc6Var.z0.getLatitude(), uc6Var.z0.getLongitude()), uc6Var.F.e() - 4.0f));
                                    break;
                                }
                            } else if (uc6Var.z0 != null && uc6Var.F != null) {
                                ImageView imageView4 = uc6Var.a;
                                int i5 = aob.mj;
                                yob.s(imageView4, i5, uc6Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                uc6Var.a.setTag(Integer.valueOf(i5));
                                uc6Var.Q.L(null);
                                uc6Var.K0 = false;
                                uc6Var.F.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(new ak5(uc6Var.z0.getLatitude(), uc6Var.z0.getLongitude())));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        this.b = textView2;
        F0(textView2);
        this.b.setGravity(17);
        this.b.setTextSize(1, 15.0f);
        yob.X(this.b, aob.Fi, this.resourceProvider);
        this.b.setTypeface(hl.o());
        this.b.setPadding(hl.L(22.0f), 0, hl.L(22.0f), 0);
        this.b.setText(ob6.M0(2131748498, null));
        this.Y.addView(this.b, tre.e(-2, 58, 81));
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: yb6
            public final /* synthetic */ uc6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x05 x05Var;
                byte b62 = b2;
                byte b7 = 4;
                uc6 uc6Var = this.b;
                byte b8 = 1;
                switch (b62) {
                    case 0:
                        uc6Var.q0 = -1L;
                        uc6Var.K0 = true;
                        if (uc6Var.l0()) {
                            uc6Var.r0 = true;
                            uc6Var.J0(false, true);
                            break;
                        }
                        break;
                    case 1:
                        if (uc6Var.getParentActivity() != null && uc6Var.z0 != null && uc6Var.f0() && uc6Var.F != null) {
                            kg5 kg5Var = uc6Var.s;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            uc7.e1().edit().putInt("proximityhint", 3).commit();
                            hd6 h = uc6Var.getLocationController().h(uc6Var.m0);
                            if (uc6Var.y) {
                                uc6Var.x[0].d(1, true);
                            }
                            byte b9 = 10;
                            if (h != null && h.f > 0) {
                                uc6Var.c.setImageResource(R.drawable.msg_location_alert);
                                ym4 ym4Var = uc6Var.L;
                                if (ym4Var != null) {
                                    ym4Var.H0();
                                    uc6Var.L = null;
                                }
                                uc6Var.y = true;
                                uc6Var.q0().k(0L, 25, 0, null, new dc6(uc6Var, (byte) 3), new z56(uc6Var, h, b9));
                                break;
                            } else {
                                ym4 ym4Var2 = uc6Var.L;
                                byte b10 = 6;
                                if (ym4Var2 == null) {
                                    uc6Var.g0(500);
                                } else {
                                    xh2 xh2Var = (xh2) ym4Var2.b;
                                    xh2Var.getClass();
                                    try {
                                        fre freVar = (fre) xh2Var.a;
                                        Parcel Q = freVar.Q(freVar.R(), 6);
                                        double readDouble = Q.readDouble();
                                        Q.recycle();
                                        uc6Var.M = readDouble;
                                    } catch (RemoteException e2) {
                                        p3d.i(e2);
                                        return;
                                    }
                                }
                                TLRPC.User X1 = wf3.D(uc6Var.m0) ? uc6Var.getMessagesController().X1(Long.valueOf(uc6Var.m0)) : null;
                                Activity parentActivity = uc6Var.getParentActivity();
                                cc6 cc6Var = new cc6(uc6Var, b10);
                                u34 u34Var = new u34(uc6Var, X1, (byte) 20);
                                dc6 dc6Var = new dc6(uc6Var, (byte) 4);
                                bx8 bx8Var = new bx8(parentActivity);
                                bx8Var.a = null;
                                bx8Var.d = -1;
                                bx8Var.e = false;
                                bx8Var.f = false;
                                bx8Var.h = null;
                                bx8Var.n = new Rect();
                                bx8Var.x = true;
                                bx8Var.G = k43.h;
                                bx8Var.setWillNotDraw(false);
                                bx8Var.R = dc6Var;
                                bx8Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect = new Rect();
                                Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                yob.x(bx8Var, mutate, aob.h5, null, PorterDuff.Mode.MULTIPLY);
                                mutate.getPadding(rect);
                                int i32 = rect.left;
                                bx8Var.y = i32;
                                xw8 xw8Var = new xw8(bx8Var.getContext());
                                bx8Var.w = xw8Var;
                                xw8Var.setBackgroundDrawable(mutate);
                                xw8Var.setPadding(i32, (hl.L(8.0f) + rect.top) - 1, i32, 0);
                                xw8Var.setVisibility(4);
                                bx8Var.addView(xw8Var, 0, tre.e(-1, -2, 80));
                                ob6.l();
                                bx8Var.P = ob6.g0.booleanValue();
                                bx8Var.N = X1;
                                bx8Var.J = cc6Var;
                                hq7 hq7Var = new hq7(parentActivity, null);
                                bx8Var.H = hq7Var;
                                hq7Var.setTextOffset(hl.L(10.0f));
                                hq7Var.setItemCount(5);
                                hq7 hq7Var2 = new hq7(parentActivity, null);
                                bx8Var.I = hq7Var2;
                                hq7Var2.setItemCount(5);
                                hq7Var2.setTextOffset(-hl.L(10.0f));
                                yw8 yw8Var = new yw8(bx8Var, parentActivity);
                                bx8Var.Q = yw8Var;
                                yw8Var.setOrientation(1);
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                yw8Var.addView(frameLayout2, tre.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView22 = new TextView(parentActivity);
                                textView22.setText(ob6.M0(2131748510, null));
                                qd4.w(textView22, aob.j5, null, 1, 20.0f);
                                frameLayout2.addView(textView22, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView22.setOnTouchListener(new b02((byte) 22));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                yw8Var.addView(linearLayout, tre.o(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                TextView textView3 = new TextView(parentActivity);
                                bx8Var.L = textView3;
                                zw8 zw8Var = new zw8(parentActivity);
                                bx8Var.K = zw8Var;
                                linearLayout.addView(hq7Var, tre.l(0.5f, 0, jn7.s4));
                                hq7Var.setFormatter(new ww8(bx8Var, (byte) 0));
                                hq7Var.setMinValue(0);
                                hq7Var.setMaxValue(10);
                                hq7Var.setWrapSelectorWheel(false);
                                hq7Var.setTextOffset(hl.L(20.0f));
                                ww8 ww8Var = new ww8(bx8Var, (byte) 1);
                                hq7Var.setOnValueChangedListener(ww8Var);
                                hq7Var2.setMinValue(0);
                                hq7Var2.setMaxValue(10);
                                hq7Var2.setWrapSelectorWheel(false);
                                hq7Var2.setTextOffset(-hl.L(20.0f));
                                linearLayout.addView(hq7Var2, tre.l(0.5f, 0, jn7.s4));
                                hq7Var2.setFormatter(new ww8(bx8Var, (byte) 2));
                                hq7Var2.setOnValueChangedListener(ww8Var);
                                hq7Var.setValue(0);
                                hq7Var2.setValue(6);
                                yw8Var.addView(frameLayout3, tre.t(-1, 48, 83, 16, 15, 16, 16));
                                zw8Var.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                                zw8Var.setGravity(17);
                                yob.X(zw8Var, aob.Ji, null);
                                zw8Var.setTextSize(1, 14.0f);
                                zw8Var.setMaxLines(2);
                                zw8Var.setTypeface(hl.o());
                                zw8Var.setBackgroundDrawable(rnb.f(aob.Fi, 4.0f));
                                frameLayout3.addView(zw8Var, tre.c(48.0f, -1));
                                zw8Var.setOnClickListener(new uv5(bx8Var, u34Var, (byte) 28));
                                textView3.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                                textView3.setGravity(17);
                                yob.X(textView3, aob.q5, null);
                                textView3.setTextSize(1, 14.0f);
                                textView3.setAlpha(0.0f);
                                textView3.setScaleX(0.5f);
                                textView3.setScaleY(0.5f);
                                frameLayout3.addView(textView3, tre.c(48.0f, -1));
                                xw8Var.addView(yw8Var, tre.e(-1, -2, 51));
                                uc6Var.O = bx8Var;
                                ((FrameLayout) uc6Var.fragmentView).addView(bx8Var, tre.c(-1.0f, -1));
                                bx8 bx8Var2 = uc6Var.O;
                                bx8Var2.r = false;
                                AnimatorSet animatorSet = bx8Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    bx8Var2.s = null;
                                }
                                xw8 xw8Var2 = bx8Var2.w;
                                Point point = hl.q;
                                xw8Var2.measure(View.MeasureSpec.makeMeasureSpec(point.x + (bx8Var2.y << 1), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                                if (!bx8Var2.r) {
                                    xw8Var2.setVisibility(0);
                                    if (bx8Var2.x) {
                                        bx8Var2.setLayerType(2, null);
                                    }
                                    xw8Var2.setTranslationY(xw8Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    bx8Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(xw8Var2, (Property<xw8, Float>) View.TRANSLATION_Y, 0.0f));
                                    bx8Var2.s.setDuration(400L);
                                    bx8Var2.s.setStartDelay(20L);
                                    bx8Var2.s.setInterpolator(bx8Var2.G);
                                    bx8Var2.s.addListener(new ax8(bx8Var2, b8));
                                    jn7.e().k(99, 512);
                                    bx8Var2.s.start();
                                }
                                bx8Var2.c(true);
                                break;
                            }
                        }
                        break;
                    case 2:
                        try {
                            TLRPC.GeoPoint geoPoint = uc6Var.J0.k.media.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            uc6Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                            break;
                        } catch (Exception e3) {
                            cc4.g(e3, true);
                            return;
                        }
                    default:
                        byte b11 = uc6Var.N0;
                        Activity parentActivity2 = uc6Var.getParentActivity();
                        if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (uc6Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uc6Var.getParentActivity());
                                int i4 = aob.L5;
                                alertDialog$Builder.l(R.raw.permission_request_location, 72, uc6Var.getThemedColor(i4), null);
                                alertDialog$Builder.m(i4, uc6Var.getResourceProvider());
                                SpannableStringBuilder S2 = hl.S2(ob6.M0(2131747031, null));
                                id idVar = alertDialog$Builder.a;
                                idVar.U = S2;
                                alertDialog$Builder.g(ob6.M0(2131747027, null), new cc6(uc6Var, b7));
                                alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                uc6Var.showDialog(idVar);
                                break;
                            }
                        } else if (uc6Var.f0() || b11 == 3) {
                            if ((uc6Var.J0 != null && b11 != 3) || uc6Var.H0 != null) {
                                if (uc6Var.z0 != null && (x05Var = uc6Var.F) != null) {
                                    x05Var.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(new ak5(uc6Var.z0.getLatitude(), uc6Var.z0.getLongitude()), uc6Var.F.e() - 4.0f));
                                    break;
                                }
                            } else if (uc6Var.z0 != null && uc6Var.F != null) {
                                ImageView imageView4 = uc6Var.a;
                                int i5 = aob.mj;
                                yob.s(imageView4, i5, uc6Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                uc6Var.a.setTag(Integer.valueOf(i5));
                                uc6Var.Q.L(null);
                                uc6Var.K0 = false;
                                uc6Var.F.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(new ak5(uc6Var.z0.getLatitude(), uc6Var.z0.getLongitude())));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        J0(false, false);
        ImageView imageView4 = new ImageView(context);
        this.c = imageView4;
        F0(imageView4);
        yob.s(this.c, aob.lj, getResourceProvider(), mode);
        this.c.setScaleType(scaleType);
        this.c.setContentDescription(ob6.M0(2131754842, null));
        this.X.addView(this.c, tre.e(58, 58, 53));
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: yb6
            public final /* synthetic */ uc6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x05 x05Var;
                byte b62 = b3;
                byte b7 = 4;
                uc6 uc6Var = this.b;
                byte b8 = 1;
                switch (b62) {
                    case 0:
                        uc6Var.q0 = -1L;
                        uc6Var.K0 = true;
                        if (uc6Var.l0()) {
                            uc6Var.r0 = true;
                            uc6Var.J0(false, true);
                            break;
                        }
                        break;
                    case 1:
                        if (uc6Var.getParentActivity() != null && uc6Var.z0 != null && uc6Var.f0() && uc6Var.F != null) {
                            kg5 kg5Var = uc6Var.s;
                            if (kg5Var != null) {
                                kg5Var.f(true);
                            }
                            uc7.e1().edit().putInt("proximityhint", 3).commit();
                            hd6 h = uc6Var.getLocationController().h(uc6Var.m0);
                            if (uc6Var.y) {
                                uc6Var.x[0].d(1, true);
                            }
                            byte b9 = 10;
                            if (h != null && h.f > 0) {
                                uc6Var.c.setImageResource(R.drawable.msg_location_alert);
                                ym4 ym4Var = uc6Var.L;
                                if (ym4Var != null) {
                                    ym4Var.H0();
                                    uc6Var.L = null;
                                }
                                uc6Var.y = true;
                                uc6Var.q0().k(0L, 25, 0, null, new dc6(uc6Var, (byte) 3), new z56(uc6Var, h, b9));
                                break;
                            } else {
                                ym4 ym4Var2 = uc6Var.L;
                                byte b10 = 6;
                                if (ym4Var2 == null) {
                                    uc6Var.g0(500);
                                } else {
                                    xh2 xh2Var = (xh2) ym4Var2.b;
                                    xh2Var.getClass();
                                    try {
                                        fre freVar = (fre) xh2Var.a;
                                        Parcel Q = freVar.Q(freVar.R(), 6);
                                        double readDouble = Q.readDouble();
                                        Q.recycle();
                                        uc6Var.M = readDouble;
                                    } catch (RemoteException e2) {
                                        p3d.i(e2);
                                        return;
                                    }
                                }
                                TLRPC.User X1 = wf3.D(uc6Var.m0) ? uc6Var.getMessagesController().X1(Long.valueOf(uc6Var.m0)) : null;
                                Activity parentActivity = uc6Var.getParentActivity();
                                cc6 cc6Var = new cc6(uc6Var, b10);
                                u34 u34Var = new u34(uc6Var, X1, (byte) 20);
                                dc6 dc6Var = new dc6(uc6Var, (byte) 4);
                                bx8 bx8Var = new bx8(parentActivity);
                                bx8Var.a = null;
                                bx8Var.d = -1;
                                bx8Var.e = false;
                                bx8Var.f = false;
                                bx8Var.h = null;
                                bx8Var.n = new Rect();
                                bx8Var.x = true;
                                bx8Var.G = k43.h;
                                bx8Var.setWillNotDraw(false);
                                bx8Var.R = dc6Var;
                                bx8Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect = new Rect();
                                Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                yob.x(bx8Var, mutate, aob.h5, null, PorterDuff.Mode.MULTIPLY);
                                mutate.getPadding(rect);
                                int i32 = rect.left;
                                bx8Var.y = i32;
                                xw8 xw8Var = new xw8(bx8Var.getContext());
                                bx8Var.w = xw8Var;
                                xw8Var.setBackgroundDrawable(mutate);
                                xw8Var.setPadding(i32, (hl.L(8.0f) + rect.top) - 1, i32, 0);
                                xw8Var.setVisibility(4);
                                bx8Var.addView(xw8Var, 0, tre.e(-1, -2, 80));
                                ob6.l();
                                bx8Var.P = ob6.g0.booleanValue();
                                bx8Var.N = X1;
                                bx8Var.J = cc6Var;
                                hq7 hq7Var = new hq7(parentActivity, null);
                                bx8Var.H = hq7Var;
                                hq7Var.setTextOffset(hl.L(10.0f));
                                hq7Var.setItemCount(5);
                                hq7 hq7Var2 = new hq7(parentActivity, null);
                                bx8Var.I = hq7Var2;
                                hq7Var2.setItemCount(5);
                                hq7Var2.setTextOffset(-hl.L(10.0f));
                                yw8 yw8Var = new yw8(bx8Var, parentActivity);
                                bx8Var.Q = yw8Var;
                                yw8Var.setOrientation(1);
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                yw8Var.addView(frameLayout2, tre.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView22 = new TextView(parentActivity);
                                textView22.setText(ob6.M0(2131748510, null));
                                qd4.w(textView22, aob.j5, null, 1, 20.0f);
                                frameLayout2.addView(textView22, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView22.setOnTouchListener(new b02((byte) 22));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                yw8Var.addView(linearLayout, tre.o(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                TextView textView3 = new TextView(parentActivity);
                                bx8Var.L = textView3;
                                zw8 zw8Var = new zw8(parentActivity);
                                bx8Var.K = zw8Var;
                                linearLayout.addView(hq7Var, tre.l(0.5f, 0, jn7.s4));
                                hq7Var.setFormatter(new ww8(bx8Var, (byte) 0));
                                hq7Var.setMinValue(0);
                                hq7Var.setMaxValue(10);
                                hq7Var.setWrapSelectorWheel(false);
                                hq7Var.setTextOffset(hl.L(20.0f));
                                ww8 ww8Var = new ww8(bx8Var, (byte) 1);
                                hq7Var.setOnValueChangedListener(ww8Var);
                                hq7Var2.setMinValue(0);
                                hq7Var2.setMaxValue(10);
                                hq7Var2.setWrapSelectorWheel(false);
                                hq7Var2.setTextOffset(-hl.L(20.0f));
                                linearLayout.addView(hq7Var2, tre.l(0.5f, 0, jn7.s4));
                                hq7Var2.setFormatter(new ww8(bx8Var, (byte) 2));
                                hq7Var2.setOnValueChangedListener(ww8Var);
                                hq7Var.setValue(0);
                                hq7Var2.setValue(6);
                                yw8Var.addView(frameLayout3, tre.t(-1, 48, 83, 16, 15, 16, 16));
                                zw8Var.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                                zw8Var.setGravity(17);
                                yob.X(zw8Var, aob.Ji, null);
                                zw8Var.setTextSize(1, 14.0f);
                                zw8Var.setMaxLines(2);
                                zw8Var.setTypeface(hl.o());
                                zw8Var.setBackgroundDrawable(rnb.f(aob.Fi, 4.0f));
                                frameLayout3.addView(zw8Var, tre.c(48.0f, -1));
                                zw8Var.setOnClickListener(new uv5(bx8Var, u34Var, (byte) 28));
                                textView3.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                                textView3.setGravity(17);
                                yob.X(textView3, aob.q5, null);
                                textView3.setTextSize(1, 14.0f);
                                textView3.setAlpha(0.0f);
                                textView3.setScaleX(0.5f);
                                textView3.setScaleY(0.5f);
                                frameLayout3.addView(textView3, tre.c(48.0f, -1));
                                xw8Var.addView(yw8Var, tre.e(-1, -2, 51));
                                uc6Var.O = bx8Var;
                                ((FrameLayout) uc6Var.fragmentView).addView(bx8Var, tre.c(-1.0f, -1));
                                bx8 bx8Var2 = uc6Var.O;
                                bx8Var2.r = false;
                                AnimatorSet animatorSet = bx8Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    bx8Var2.s = null;
                                }
                                xw8 xw8Var2 = bx8Var2.w;
                                Point point = hl.q;
                                xw8Var2.measure(View.MeasureSpec.makeMeasureSpec(point.x + (bx8Var2.y << 1), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                                if (!bx8Var2.r) {
                                    xw8Var2.setVisibility(0);
                                    if (bx8Var2.x) {
                                        bx8Var2.setLayerType(2, null);
                                    }
                                    xw8Var2.setTranslationY(xw8Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    bx8Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(xw8Var2, (Property<xw8, Float>) View.TRANSLATION_Y, 0.0f));
                                    bx8Var2.s.setDuration(400L);
                                    bx8Var2.s.setStartDelay(20L);
                                    bx8Var2.s.setInterpolator(bx8Var2.G);
                                    bx8Var2.s.addListener(new ax8(bx8Var2, b8));
                                    jn7.e().k(99, 512);
                                    bx8Var2.s.start();
                                }
                                bx8Var2.c(true);
                                break;
                            }
                        }
                        break;
                    case 2:
                        try {
                            TLRPC.GeoPoint geoPoint = uc6Var.J0.k.media.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            uc6Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                            break;
                        } catch (Exception e3) {
                            cc4.g(e3, true);
                            return;
                        }
                    default:
                        byte b11 = uc6Var.N0;
                        Activity parentActivity2 = uc6Var.getParentActivity();
                        if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (uc6Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uc6Var.getParentActivity());
                                int i4 = aob.L5;
                                alertDialog$Builder.l(R.raw.permission_request_location, 72, uc6Var.getThemedColor(i4), null);
                                alertDialog$Builder.m(i4, uc6Var.getResourceProvider());
                                SpannableStringBuilder S2 = hl.S2(ob6.M0(2131747031, null));
                                id idVar = alertDialog$Builder.a;
                                idVar.U = S2;
                                alertDialog$Builder.g(ob6.M0(2131747027, null), new cc6(uc6Var, b7));
                                alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                                uc6Var.showDialog(idVar);
                                break;
                            }
                        } else if (uc6Var.f0() || b11 == 3) {
                            if ((uc6Var.J0 != null && b11 != 3) || uc6Var.H0 != null) {
                                if (uc6Var.z0 != null && (x05Var = uc6Var.F) != null) {
                                    x05Var.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(new ak5(uc6Var.z0.getLatitude(), uc6Var.z0.getLongitude()), uc6Var.F.e() - 4.0f));
                                    break;
                                }
                            } else if (uc6Var.z0 != null && uc6Var.F != null) {
                                ImageView imageView42 = uc6Var.a;
                                int i5 = aob.mj;
                                yob.s(imageView42, i5, uc6Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                uc6Var.a.setTag(Integer.valueOf(i5));
                                uc6Var.Q.L(null);
                                uc6Var.K0 = false;
                                uc6Var.F.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(new ak5(uc6Var.z0.getLatitude(), uc6Var.z0.getLongitude())));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        TLRPC.Chat M0 = wf3.y(this.m0) ? getMessagesController().M0(Long.valueOf(-this.m0)) : null;
        r47 r47Var4 = this.J0;
        if (r47Var4 != null && r47Var4.C3()) {
            r47 r47Var5 = this.J0;
            int currentTime = getConnectionsManager().getCurrentTime();
            TLRPC.Message message2 = r47Var5.k;
            if (message2.date + r47.n1(message2).period > currentTime && (!xc2.T(M0) || M0.megagroup)) {
                hd6 h = getLocationController().h(this.m0);
                if (h == null || h.f <= 0) {
                    if (wf3.D(this.m0) && this.J0.Z0() == getUserConfig().e()) {
                        this.c.setVisibility(4);
                        this.c.setAlpha(0.0f);
                        this.c.setScaleX(0.4f);
                        this.c.setScaleY(0.4f);
                    }
                    this.c.setImageResource(R.drawable.msg_location_alert);
                } else {
                    this.c.setImageResource(R.drawable.msg_location_alert2);
                }
                kg5 kg5Var = new kg5(context, 1);
                this.s = kg5Var;
                kg5Var.setLayerType(i, null);
                kg5 kg5Var2 = this.s;
                kg5Var2.d = 4000L;
                kg5Var2.n(1.0f, -21.0f);
                this.s.setPadding(0, hl.L(4.0f), 0, 0);
                this.s.k(getBaseSimpleGlass().c);
                this.X.addView(this.s, tre.d(-1, -2.0f, 51, 8.0f, 56.0f, 8.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.e = linearLayout;
                linearLayout.setOrientation(1);
                this.e.setGravity(1);
                this.e.setPadding(0, hl.L(160.0f), 0, 0);
                this.e.setVisibility(8);
                sc6Var.addView(this.e, tre.c(-1.0f, -1));
                this.e.setOnTouchListener(new b02((byte) 13));
                ImageView imageView5 = new ImageView(context);
                this.f = imageView5;
                imageView5.setImageResource(R.drawable.location_empty);
                yob.s(this.f, aob.W5, getResourceProvider(), mode);
                this.e.addView(this.f, tre.o(-2, -2));
                TextView textView3 = new TextView(context);
                this.h = textView3;
                int i4 = aob.X5;
                yob.X(textView3, i4, getResourceProvider());
                this.h.setGravity(17);
                this.h.setTypeface(hl.o());
                this.h.setTextSize(1, 17.0f);
                this.h.setText(ob6.M0(2131747910, null));
                TextView m = ik8.m(this.e, this.h, tre.t(-2, -2, 17, 0, 11, 0, 0), context);
                this.n = m;
                yob.X(m, i4, getResourceProvider());
                this.n.setGravity(17);
                this.n.setTextSize(1, 15.0f);
                this.n.setPadding(hl.L(40.0f), 0, hl.L(40.0f), 0);
                this.e.addView(this.n, tre.t(-2, -2, 17, 0, 6, 0, 0));
                this.R = new gu((byte) 25, context, (Object) this);
                jl0 c2 = getBaseSimpleGlass().f.c(this.R, null, false);
                ol0 ol0Var = new ol0(getResourceProvider());
                ol0Var.e = new xz((byte) 21);
                ol0Var.f(-1, 553648127);
                ol0Var.e(0, 0);
                ol0Var.d(372454195, 0);
                float N = hl.N(8.0f);
                float f = -hl.N(0.6666667f);
                ol0Var.n = N;
                ol0Var.r = f;
                ol0Var.f = hl.N(0.55f);
                ol0Var.h = 0.0f;
                c2.p(ol0Var);
                c2.s(hl.L(29.0f), hl.L(29.0f), 0.0f, 0.0f);
                c2.q(hl.L(12.0f));
                this.Z = c2;
                gu guVar = this.R;
                long j = this.m0;
                vnb resourceProvider2 = getResourceProvider();
                boolean z3 = this.w;
                if (b5 != 8) {
                    z = z3;
                    z2 = true;
                } else {
                    z = z3;
                    z2 = false;
                }
                kc6 kc6Var2 = new kc6(this, context, this.N0, j, resourceProvider2, z, z2);
                this.Q = kc6Var2;
                guVar.setAdapter(kc6Var2);
                gu guVar2 = this.R;
                x46 x46Var = new x46(1, false);
                this.V = x46Var;
                guVar2.setLayoutManager(x46Var);
                if (this.T0 != null) {
                    this.S0 = new p55(context, this.resourceProvider);
                    nc6 nc6Var = new nc6(this, context, new wia(this), this, new mc6(this), getResourceProvider());
                    this.R0 = nc6Var;
                    yob.h(i2, getResourceProvider(), nc6Var);
                    this.R0.addView(this.S0, tre.e(-1, 32, 55));
                    this.Q.Z = this.R0;
                    this.R.setOverScrollMode(2);
                    zb3 zb3Var = new zb3();
                    zb3Var.m = false;
                    zb3Var.C = false;
                    zb3Var.o(k43.h);
                    zb3Var.n(350L);
                    this.R.setItemAnimator(zb3Var);
                }
                this.Q.O(this.k0, false);
                this.Q.getClass();
                this.R.setVerticalScrollBarEnabled(false);
                sc6Var.addView(this.R, tre.e(-1, -1, 51));
                r47Var = this.J0;
                if (r47Var != null && (message = r47Var.k) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
                    kc6 kc6Var3 = this.Q;
                    kc6Var3.I = this.J0.k.media.address;
                    kc6Var3.Q();
                }
                this.R.setOnScrollListener(new hc6(this, b3));
                ((zb3) this.R.getItemAnimator()).C = false;
                this.R.setOnItemLongClickListener(new u34(this, context, (byte) 18));
                this.R.setOnItemClickListener(new r69(this) { // from class: bc6
                    public final /* synthetic */ uc6 b;

                    {
                        this.b = this;
                    }

                    @Override // r69
                    public final void e(int i5, View view) {
                        r47 r47Var6;
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                        byte b7 = b2;
                        uc6 uc6Var = this.b;
                        switch (b7) {
                            case 0:
                                uc6Var.q0 = -1L;
                                byte b8 = uc6Var.N0;
                                byte b9 = 7;
                                byte b10 = 6;
                                if (b8 != 4) {
                                    if (b8 != 5) {
                                        if (i5 == 1 && (r47Var6 = uc6Var.J0) != null && (!r47Var6.C3() || b8 == 6)) {
                                            x05 x05Var = uc6Var.F;
                                            if (x05Var != null) {
                                                IMapsProvider j2 = org.telegram.messenger.a.j();
                                                TLRPC.GeoPoint geoPoint = uc6Var.J0.k.media.geo;
                                                x05Var.b(((z3f) j2).newCameraUpdateLatLngZoom(new ak5(geoPoint.lat, geoPoint._long), uc6Var.F.e() - 4.0f));
                                                break;
                                            }
                                        } else if (i5 == 1 && b8 != 2) {
                                            if (uc6Var.M0 != null && uc6Var.A0 != null) {
                                                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                                tL_messageMediaGeo.geo = tL_geoPoint;
                                                tL_geoPoint.lat = hl.b0(uc6Var.A0.getLatitude());
                                                tL_messageMediaGeo.geo._long = hl.b0(uc6Var.A0.getLongitude());
                                                uc6Var.M0.b(tL_messageMediaGeo, uc6Var.N0, true, 0, 0L);
                                                uc6Var.finishFragment();
                                                break;
                                            }
                                        } else if (b8 != 2 || !uc6Var.getLocationController().i(uc6Var.m0) || uc6Var.Q.d(i5) != 7) {
                                            if (b8 != 2 || !uc6Var.getLocationController().i(uc6Var.m0) || uc6Var.Q.d(i5) != 6) {
                                                if ((i5 != 2 || b8 != 1) && ((i5 != 1 || b8 != 2) && (i5 != 3 || b8 != 3))) {
                                                    Object I = uc6Var.Q.I(i5);
                                                    if (!(I instanceof TLRPC.TL_messageMediaVenue)) {
                                                        if (I instanceof pc6) {
                                                            pc6 pc6Var = (pc6) I;
                                                            uc6Var.q0 = pc6Var.a;
                                                            if (uc6Var.r0) {
                                                                uc6Var.r0 = false;
                                                                uc6Var.R0();
                                                            }
                                                            uc6Var.F.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(pc6Var.e.a(), uc6Var.F.e() - 4.0f));
                                                            break;
                                                        }
                                                    } else {
                                                        uc6Var.M0.b((TLRPC.TL_messageMediaVenue) I, uc6Var.N0, true, 0, 0L);
                                                        uc6Var.finishFragment();
                                                        break;
                                                    }
                                                } else if (!uc6Var.getLocationController().i(uc6Var.m0)) {
                                                    uc6Var.C0(false);
                                                    break;
                                                } else {
                                                    uc6Var.getLocationController().k(uc6Var.m0);
                                                    uc6Var.Q.f();
                                                    uc6Var.finishFragment();
                                                    break;
                                                }
                                            } else {
                                                uc6Var.C0(uc6Var.getLocationController().h(uc6Var.m0).d != Integer.MAX_VALUE);
                                                break;
                                            }
                                        } else {
                                            uc6Var.getLocationController().k(uc6Var.m0);
                                            uc6Var.Q.f();
                                            uc6Var.finishFragment();
                                            break;
                                        }
                                    } else {
                                        x05 x05Var2 = uc6Var.F;
                                        if (x05Var2 != null) {
                                            IMapsProvider j3 = org.telegram.messenger.a.j();
                                            TLRPC.GeoPoint geoPoint2 = uc6Var.H0.geo_point;
                                            x05Var2.b(((z3f) j3).newCameraUpdateLatLngZoom(new ak5(geoPoint2.lat, geoPoint2._long), uc6Var.F.e() - 4.0f));
                                            break;
                                        }
                                    }
                                } else if (i5 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) uc6Var.Q.I(i5)) != null) {
                                    if (uc6Var.m0 != 0) {
                                        id[] idVarArr = {new id(3, null, uc6Var.getParentActivity())};
                                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                        tL_channels_editLocation.channel = uc6Var.getMessagesController().h1(-uc6Var.m0);
                                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                        TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                        tL_inputGeoPoint.lat = geoPoint3.lat;
                                        tL_inputGeoPoint._long = geoPoint3._long;
                                        idVarArr[0].setOnCancelListener(new gt0(uc6Var, uc6Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new m65(uc6Var, idVarArr, tL_messageMediaVenue, b10)), b9));
                                        uc6Var.showDialog(idVarArr[0]);
                                        break;
                                    } else {
                                        uc6Var.M0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                                        uc6Var.finishFragment();
                                        break;
                                    }
                                }
                                break;
                            default:
                                uc6Var.s0(i5);
                                break;
                        }
                    }
                });
                this.Q.P(this.O0);
                sc6Var.addView(this.P, sc6Var.indexOfChild(this.R), tre.e(-1, -1, 51));
                xj5 onCreateMapView = ((z3f) org.telegram.messenger.a.j()).onCreateMapView(context);
                this.H = onCreateMapView;
                ((tt) ((am2) onCreateMapView).b).setAlpha(0.0f);
                xj5 xj5Var = this.H;
                am2 am2Var = (am2) xj5Var;
                am2Var.c = new cc6(this, b2);
                am2Var.d = new cc6(this, b3);
                am2Var.e = new dc6(this, (byte) 7);
                new Thread(new ec6(this, xj5Var, b3)).start();
                r47Var2 = this.J0;
                if (r47Var2 == null) {
                    b = b5;
                } else {
                    if (this.H0 == null) {
                        b = b5;
                        if (M0 != null && b == 4 && this.m0 != 0) {
                            FrameLayout frameLayout2 = new FrameLayout(context);
                            frameLayout2.setBackgroundResource(R.drawable.livepin);
                            this.P.addView(frameLayout2, tre.e(62, 76, 49));
                            de0 de0Var = new de0(context);
                            de0Var.setRoundRadius(hl.L(26.0f));
                            de0Var.f(M0, new rb0(M0));
                            frameLayout2.addView(de0Var, tre.d(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                            this.U = frameLayout2;
                            frameLayout2.setTag(1);
                        }
                        if (this.U == null) {
                            ImageView k = qd4.k(context, R.drawable.map_pin2);
                            this.P.addView(k, tre.e(28, 48, 49));
                            this.U = k;
                        }
                        d79 d79Var = new d79(context, null);
                        this.S = d79Var;
                        byte b7 = 8;
                        d79Var.setVisibility(8);
                        this.S.setLayoutManager(new x46(1, false));
                        q42 q42Var2 = new q42(this, context, getResourceProvider(), b == 8);
                        this.T = q42Var2;
                        q42Var2.n = new cc6(this, b7);
                        sc6Var.addView(this.S, tre.e(-1, -1, 51));
                        this.S.setOnScrollListener(new hc6(this, b2));
                        this.S.setOnItemClickListener(new r69(this) { // from class: bc6
                            public final /* synthetic */ uc6 b;

                            {
                                this.b = this;
                            }

                            @Override // r69
                            public final void e(int i5, View view) {
                                r47 r47Var6;
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                                byte b72 = b3;
                                uc6 uc6Var = this.b;
                                switch (b72) {
                                    case 0:
                                        uc6Var.q0 = -1L;
                                        byte b8 = uc6Var.N0;
                                        byte b9 = 7;
                                        byte b10 = 6;
                                        if (b8 != 4) {
                                            if (b8 != 5) {
                                                if (i5 == 1 && (r47Var6 = uc6Var.J0) != null && (!r47Var6.C3() || b8 == 6)) {
                                                    x05 x05Var = uc6Var.F;
                                                    if (x05Var != null) {
                                                        IMapsProvider j2 = org.telegram.messenger.a.j();
                                                        TLRPC.GeoPoint geoPoint = uc6Var.J0.k.media.geo;
                                                        x05Var.b(((z3f) j2).newCameraUpdateLatLngZoom(new ak5(geoPoint.lat, geoPoint._long), uc6Var.F.e() - 4.0f));
                                                        break;
                                                    }
                                                } else if (i5 == 1 && b8 != 2) {
                                                    if (uc6Var.M0 != null && uc6Var.A0 != null) {
                                                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                                        tL_messageMediaGeo.geo = tL_geoPoint;
                                                        tL_geoPoint.lat = hl.b0(uc6Var.A0.getLatitude());
                                                        tL_messageMediaGeo.geo._long = hl.b0(uc6Var.A0.getLongitude());
                                                        uc6Var.M0.b(tL_messageMediaGeo, uc6Var.N0, true, 0, 0L);
                                                        uc6Var.finishFragment();
                                                        break;
                                                    }
                                                } else if (b8 != 2 || !uc6Var.getLocationController().i(uc6Var.m0) || uc6Var.Q.d(i5) != 7) {
                                                    if (b8 != 2 || !uc6Var.getLocationController().i(uc6Var.m0) || uc6Var.Q.d(i5) != 6) {
                                                        if ((i5 != 2 || b8 != 1) && ((i5 != 1 || b8 != 2) && (i5 != 3 || b8 != 3))) {
                                                            Object I = uc6Var.Q.I(i5);
                                                            if (!(I instanceof TLRPC.TL_messageMediaVenue)) {
                                                                if (I instanceof pc6) {
                                                                    pc6 pc6Var = (pc6) I;
                                                                    uc6Var.q0 = pc6Var.a;
                                                                    if (uc6Var.r0) {
                                                                        uc6Var.r0 = false;
                                                                        uc6Var.R0();
                                                                    }
                                                                    uc6Var.F.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(pc6Var.e.a(), uc6Var.F.e() - 4.0f));
                                                                    break;
                                                                }
                                                            } else {
                                                                uc6Var.M0.b((TLRPC.TL_messageMediaVenue) I, uc6Var.N0, true, 0, 0L);
                                                                uc6Var.finishFragment();
                                                                break;
                                                            }
                                                        } else if (!uc6Var.getLocationController().i(uc6Var.m0)) {
                                                            uc6Var.C0(false);
                                                            break;
                                                        } else {
                                                            uc6Var.getLocationController().k(uc6Var.m0);
                                                            uc6Var.Q.f();
                                                            uc6Var.finishFragment();
                                                            break;
                                                        }
                                                    } else {
                                                        uc6Var.C0(uc6Var.getLocationController().h(uc6Var.m0).d != Integer.MAX_VALUE);
                                                        break;
                                                    }
                                                } else {
                                                    uc6Var.getLocationController().k(uc6Var.m0);
                                                    uc6Var.Q.f();
                                                    uc6Var.finishFragment();
                                                    break;
                                                }
                                            } else {
                                                x05 x05Var2 = uc6Var.F;
                                                if (x05Var2 != null) {
                                                    IMapsProvider j3 = org.telegram.messenger.a.j();
                                                    TLRPC.GeoPoint geoPoint2 = uc6Var.H0.geo_point;
                                                    x05Var2.b(((z3f) j3).newCameraUpdateLatLngZoom(new ak5(geoPoint2.lat, geoPoint2._long), uc6Var.F.e() - 4.0f));
                                                    break;
                                                }
                                            }
                                        } else if (i5 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) uc6Var.Q.I(i5)) != null) {
                                            if (uc6Var.m0 != 0) {
                                                id[] idVarArr = {new id(3, null, uc6Var.getParentActivity())};
                                                TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                                tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                                tL_channels_editLocation.channel = uc6Var.getMessagesController().h1(-uc6Var.m0);
                                                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                                tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                                TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                                tL_inputGeoPoint.lat = geoPoint3.lat;
                                                tL_inputGeoPoint._long = geoPoint3._long;
                                                idVarArr[0].setOnCancelListener(new gt0(uc6Var, uc6Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new m65(uc6Var, idVarArr, tL_messageMediaVenue, b10)), b9));
                                                uc6Var.showDialog(idVarArr[0]);
                                                break;
                                            } else {
                                                uc6Var.M0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                                                uc6Var.finishFragment();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        uc6Var.s0(i5);
                                        break;
                                }
                            }
                        });
                        r47 r47Var6 = this.J0;
                        if (r47Var6 != null && b == 6) {
                            kc6 kc6Var4 = this.Q;
                            kc6Var4.O = r47Var6;
                            kc6Var4.f();
                        }
                        for (int i5 = 0; i5 < 2; i5++) {
                            UndoView undoView = new UndoView(context);
                            UndoView[] undoViewArr = this.x;
                            undoViewArr[i5] = undoView;
                            undoView.setAdditionalTranslationY(hl.L(10.0f));
                            undoViewArr[i5].setTranslationZ(hl.L(5.0f));
                            FrameLayout.LayoutParams d = tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                            d.bottomMargin = hl.L(29.0f) + this.h0 + d.bottomMargin;
                            this.P.addView(undoViewArr[i5], d);
                        }
                        if (this.J0 == null && this.H0 == null && this.I0 != null) {
                            this.K0 = true;
                            ImageView imageView6 = this.a;
                            int i6 = aob.lj;
                            yob.s(imageView6, i6, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            this.a.setTag(Integer.valueOf(i6));
                        }
                        eg0 baseSimpleGlass = getBaseSimpleGlass();
                        View view = new View(context);
                        this.navigationBarFadeView = view;
                        view.setBackground(baseSimpleGlass.b(view));
                        sc6Var.addView(this.navigationBarFadeView, tre.e(-1, 0, 80));
                        baseSimpleGlass.i(sc6Var, this.simpleActionBar, getResourceProvider());
                        baseSimpleGlass.o = new mr0(this, (byte) 5);
                        this.simpleActionBar.setBackground(null);
                        this.glassEngine.b(this.R);
                        d79 d79Var2 = this.S;
                        if (d79Var2 != null) {
                            this.glassEngine.b(d79Var2);
                        }
                        if (baseSimpleGlass.g != null && xea.f()) {
                            this.e0 = new jk6(new dc6(this, (byte) 2));
                        }
                        c0();
                        O0();
                        return this.fragmentView;
                    }
                    b = b5;
                }
            }
        }
        this.c.setVisibility(8);
        this.c.setImageResource(R.drawable.msg_location_alert);
        kg5 kg5Var3 = new kg5(context, 1);
        this.s = kg5Var3;
        kg5Var3.setLayerType(i, null);
        kg5 kg5Var22 = this.s;
        kg5Var22.d = 4000L;
        kg5Var22.n(1.0f, -21.0f);
        this.s.setPadding(0, hl.L(4.0f), 0, 0);
        this.s.k(getBaseSimpleGlass().c);
        this.X.addView(this.s, tre.d(-1, -2.0f, 51, 8.0f, 56.0f, 8.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.e.setGravity(1);
        this.e.setPadding(0, hl.L(160.0f), 0, 0);
        this.e.setVisibility(8);
        sc6Var.addView(this.e, tre.c(-1.0f, -1));
        this.e.setOnTouchListener(new b02((byte) 13));
        ImageView imageView52 = new ImageView(context);
        this.f = imageView52;
        imageView52.setImageResource(R.drawable.location_empty);
        yob.s(this.f, aob.W5, getResourceProvider(), mode);
        this.e.addView(this.f, tre.o(-2, -2));
        TextView textView32 = new TextView(context);
        this.h = textView32;
        int i42 = aob.X5;
        yob.X(textView32, i42, getResourceProvider());
        this.h.setGravity(17);
        this.h.setTypeface(hl.o());
        this.h.setTextSize(1, 17.0f);
        this.h.setText(ob6.M0(2131747910, null));
        TextView m2 = ik8.m(this.e, this.h, tre.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.n = m2;
        yob.X(m2, i42, getResourceProvider());
        this.n.setGravity(17);
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(hl.L(40.0f), 0, hl.L(40.0f), 0);
        this.e.addView(this.n, tre.t(-2, -2, 17, 0, 6, 0, 0));
        this.R = new gu((byte) 25, context, (Object) this);
        jl0 c22 = getBaseSimpleGlass().f.c(this.R, null, false);
        ol0 ol0Var2 = new ol0(getResourceProvider());
        ol0Var2.e = new xz((byte) 21);
        ol0Var2.f(-1, 553648127);
        ol0Var2.e(0, 0);
        ol0Var2.d(372454195, 0);
        float N2 = hl.N(8.0f);
        float f2 = -hl.N(0.6666667f);
        ol0Var2.n = N2;
        ol0Var2.r = f2;
        ol0Var2.f = hl.N(0.55f);
        ol0Var2.h = 0.0f;
        c22.p(ol0Var2);
        c22.s(hl.L(29.0f), hl.L(29.0f), 0.0f, 0.0f);
        c22.q(hl.L(12.0f));
        this.Z = c22;
        gu guVar3 = this.R;
        long j2 = this.m0;
        vnb resourceProvider22 = getResourceProvider();
        boolean z32 = this.w;
        if (b5 != 8) {
        }
        kc6 kc6Var22 = new kc6(this, context, this.N0, j2, resourceProvider22, z, z2);
        this.Q = kc6Var22;
        guVar3.setAdapter(kc6Var22);
        gu guVar22 = this.R;
        x46 x46Var2 = new x46(1, false);
        this.V = x46Var2;
        guVar22.setLayoutManager(x46Var2);
        if (this.T0 != null) {
        }
        this.Q.O(this.k0, false);
        this.Q.getClass();
        this.R.setVerticalScrollBarEnabled(false);
        sc6Var.addView(this.R, tre.e(-1, -1, 51));
        r47Var = this.J0;
        if (r47Var != null) {
            kc6 kc6Var32 = this.Q;
            kc6Var32.I = this.J0.k.media.address;
            kc6Var32.Q();
        }
        this.R.setOnScrollListener(new hc6(this, b3));
        ((zb3) this.R.getItemAnimator()).C = false;
        this.R.setOnItemLongClickListener(new u34(this, context, (byte) 18));
        this.R.setOnItemClickListener(new r69(this) { // from class: bc6
            public final /* synthetic */ uc6 b;

            {
                this.b = this;
            }

            @Override // r69
            public final void e(int i52, View view2) {
                r47 r47Var62;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                byte b72 = b2;
                uc6 uc6Var = this.b;
                switch (b72) {
                    case 0:
                        uc6Var.q0 = -1L;
                        byte b8 = uc6Var.N0;
                        byte b9 = 7;
                        byte b10 = 6;
                        if (b8 != 4) {
                            if (b8 != 5) {
                                if (i52 == 1 && (r47Var62 = uc6Var.J0) != null && (!r47Var62.C3() || b8 == 6)) {
                                    x05 x05Var = uc6Var.F;
                                    if (x05Var != null) {
                                        IMapsProvider j22 = org.telegram.messenger.a.j();
                                        TLRPC.GeoPoint geoPoint = uc6Var.J0.k.media.geo;
                                        x05Var.b(((z3f) j22).newCameraUpdateLatLngZoom(new ak5(geoPoint.lat, geoPoint._long), uc6Var.F.e() - 4.0f));
                                        break;
                                    }
                                } else if (i52 == 1 && b8 != 2) {
                                    if (uc6Var.M0 != null && uc6Var.A0 != null) {
                                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                        tL_messageMediaGeo.geo = tL_geoPoint;
                                        tL_geoPoint.lat = hl.b0(uc6Var.A0.getLatitude());
                                        tL_messageMediaGeo.geo._long = hl.b0(uc6Var.A0.getLongitude());
                                        uc6Var.M0.b(tL_messageMediaGeo, uc6Var.N0, true, 0, 0L);
                                        uc6Var.finishFragment();
                                        break;
                                    }
                                } else if (b8 != 2 || !uc6Var.getLocationController().i(uc6Var.m0) || uc6Var.Q.d(i52) != 7) {
                                    if (b8 != 2 || !uc6Var.getLocationController().i(uc6Var.m0) || uc6Var.Q.d(i52) != 6) {
                                        if ((i52 != 2 || b8 != 1) && ((i52 != 1 || b8 != 2) && (i52 != 3 || b8 != 3))) {
                                            Object I = uc6Var.Q.I(i52);
                                            if (!(I instanceof TLRPC.TL_messageMediaVenue)) {
                                                if (I instanceof pc6) {
                                                    pc6 pc6Var = (pc6) I;
                                                    uc6Var.q0 = pc6Var.a;
                                                    if (uc6Var.r0) {
                                                        uc6Var.r0 = false;
                                                        uc6Var.R0();
                                                    }
                                                    uc6Var.F.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(pc6Var.e.a(), uc6Var.F.e() - 4.0f));
                                                    break;
                                                }
                                            } else {
                                                uc6Var.M0.b((TLRPC.TL_messageMediaVenue) I, uc6Var.N0, true, 0, 0L);
                                                uc6Var.finishFragment();
                                                break;
                                            }
                                        } else if (!uc6Var.getLocationController().i(uc6Var.m0)) {
                                            uc6Var.C0(false);
                                            break;
                                        } else {
                                            uc6Var.getLocationController().k(uc6Var.m0);
                                            uc6Var.Q.f();
                                            uc6Var.finishFragment();
                                            break;
                                        }
                                    } else {
                                        uc6Var.C0(uc6Var.getLocationController().h(uc6Var.m0).d != Integer.MAX_VALUE);
                                        break;
                                    }
                                } else {
                                    uc6Var.getLocationController().k(uc6Var.m0);
                                    uc6Var.Q.f();
                                    uc6Var.finishFragment();
                                    break;
                                }
                            } else {
                                x05 x05Var2 = uc6Var.F;
                                if (x05Var2 != null) {
                                    IMapsProvider j3 = org.telegram.messenger.a.j();
                                    TLRPC.GeoPoint geoPoint2 = uc6Var.H0.geo_point;
                                    x05Var2.b(((z3f) j3).newCameraUpdateLatLngZoom(new ak5(geoPoint2.lat, geoPoint2._long), uc6Var.F.e() - 4.0f));
                                    break;
                                }
                            }
                        } else if (i52 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) uc6Var.Q.I(i52)) != null) {
                            if (uc6Var.m0 != 0) {
                                id[] idVarArr = {new id(3, null, uc6Var.getParentActivity())};
                                TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                tL_channels_editLocation.channel = uc6Var.getMessagesController().h1(-uc6Var.m0);
                                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                tL_inputGeoPoint.lat = geoPoint3.lat;
                                tL_inputGeoPoint._long = geoPoint3._long;
                                idVarArr[0].setOnCancelListener(new gt0(uc6Var, uc6Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new m65(uc6Var, idVarArr, tL_messageMediaVenue, b10)), b9));
                                uc6Var.showDialog(idVarArr[0]);
                                break;
                            } else {
                                uc6Var.M0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                                uc6Var.finishFragment();
                                break;
                            }
                        }
                        break;
                    default:
                        uc6Var.s0(i52);
                        break;
                }
            }
        });
        this.Q.P(this.O0);
        sc6Var.addView(this.P, sc6Var.indexOfChild(this.R), tre.e(-1, -1, 51));
        xj5 onCreateMapView2 = ((z3f) org.telegram.messenger.a.j()).onCreateMapView(context);
        this.H = onCreateMapView2;
        ((tt) ((am2) onCreateMapView2).b).setAlpha(0.0f);
        xj5 xj5Var2 = this.H;
        am2 am2Var2 = (am2) xj5Var2;
        am2Var2.c = new cc6(this, b2);
        am2Var2.d = new cc6(this, b3);
        am2Var2.e = new dc6(this, (byte) 7);
        new Thread(new ec6(this, xj5Var2, b3)).start();
        r47Var2 = this.J0;
        if (r47Var2 == null) {
        }
    }

    public final void d0(Canvas canvas, RectF rectF) {
        int i = aob.h5;
        int themedColor = getThemedColor(i);
        Paint paint = this.g0;
        paint.setColor(themedColor);
        canvas.drawRect(rectF, paint);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        d79 d79Var = this.S;
        if (d79Var != null && d79Var.getVisibility() == 0) {
            d79 d79Var2 = this.S;
            uk0.a(d79Var2, canvas, rectF, d79Var2, viewGroup);
            return;
        }
        if (this.P.getVisibility() == 0) {
            canvas.save();
            canvas.translate(this.P.getX(), this.P.getY());
            canvas.clipRect(0.0f, 0.0f, this.P.getWidth(), viewGroup.getHeight() - this.P.getY());
            Drawable background = this.P.getBackground();
            if (background != null) {
                background.draw(canvas);
            }
            xj5 xj5Var = this.H;
            tt ttVar = xj5Var != null ? (tt) ((am2) xj5Var).b : null;
            if (ttVar != null && ttVar.getParent() == this.P && ttVar.getVisibility() == 0 && ttVar.getAlpha() > 0.0f) {
                TextureView textureView = this.d0;
                RectF rectF2 = this.f0;
                if (textureView != null && textureView.isAttachedToWindow() && yic.c(this.d0, this.P, rectF2)) {
                    if (ttVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (ttVar.getAlpha() * 255.0f));
                    } else {
                        canvas.save();
                    }
                    canvas.translate(rectF2.left, rectF2.top);
                    this.d0.draw(canvas);
                    canvas.restore();
                } else if (this.e0 != null) {
                    rectF2.set(ttVar.getX(), ttVar.getY(), ttVar.getX() + ttVar.getWidth(), ttVar.getY() + ttVar.getHeight());
                    jk6 jk6Var = this.e0;
                    float alpha = ttVar.getAlpha();
                    Paint paint2 = jk6Var.c;
                    Bitmap bitmap = jk6Var.e;
                    if (bitmap != null && !bitmap.isRecycled() && alpha > 0.0f) {
                        paint2.setAlpha((int) (Math.min(1.0f, alpha) * 255.0f));
                        canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint2);
                    }
                }
            }
            View view = this.U;
            if (view != null && view.getParent() != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
                canvas.save();
                canvas.translate(view.getX(), view.getY());
                view.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        if (this.R.getVisibility() == 0) {
            int L = hl.L(22.0f) + a.getCurrentActionBarHeight() + this.mSystemInsets.b;
            float f = L;
            if (rectF.top >= f) {
                return;
            }
            canvas.save();
            canvas.clipRect(0.0f, Math.min(rectF.top, f), viewGroup.getWidth(), f);
            if (this.b0 < L) {
                paint.setColor(getThemedColor(i));
                paint.setAlpha(jn7.i3);
                canvas.drawRect(0.0f, Math.max(this.b0, rectF.top), viewGroup.getWidth(), f, paint);
            }
            gu guVar = this.R;
            uk0.a(guVar, canvas, rectF, guVar, viewGroup);
            canvas.restore();
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        kc6 kc6Var;
        kc6 kc6Var2;
        if (i == jn7.s) {
            removeSelfFromStack(true);
            return;
        }
        if (i == jn7.y4) {
            this.k0 = false;
            kc6 kc6Var3 = this.Q;
            if (kc6Var3 != null) {
                kc6Var3.O(false, false);
            }
            L0();
            return;
        }
        if (i == jn7.z4) {
            this.k0 = true;
            kc6 kc6Var4 = this.Q;
            if (kc6Var4 != null) {
                kc6Var4.O(true, false);
                return;
            }
            return;
        }
        if (i == jn7.G4) {
            kc6 kc6Var5 = this.Q;
            if (kc6Var5 != null) {
                kc6Var5.f();
            }
            R0();
            return;
        }
        if (i == 1) {
            if (((Boolean) objArr[2]).booleanValue() || ((Long) objArr[0]).longValue() != this.m0 || this.J0 == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[1];
            boolean z = false;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                r47 r47Var = (r47) arrayList.get(i3);
                boolean C3 = r47Var.C3();
                TLRPC.Message message = r47Var.k;
                if (C3) {
                    b0(message);
                    z = true;
                } else if ((message.action instanceof TLRPC.TL_messageActionGeoProximityReached) && wf3.D(r47.B0(message))) {
                    this.c.setImageResource(R.drawable.msg_location_alert);
                    ym4 ym4Var = this.L;
                    if (ym4Var != null) {
                        ym4Var.H0();
                        this.L = null;
                    }
                }
            }
            if (!z || (kc6Var2 = this.Q) == null) {
                return;
            }
            kc6Var2.N(this.o0);
            return;
        }
        if (i == jn7.m0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue != this.m0 || this.J0 == null) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) objArr[1];
            boolean z2 = false;
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                r47 r47Var2 = (r47) arrayList2.get(i4);
                if (r47Var2.C3()) {
                    TLRPC.Message message2 = r47Var2.k;
                    TLRPC.Peer peer = message2.from_id;
                    pc6 pc6Var = (pc6) this.p0.f(peer != null ? r47.B1(peer) : r47.B0(message2));
                    if (pc6Var != null) {
                        hd6 h = getLocationController().h(longValue);
                        if (h == null || h.b != r47Var2.e1()) {
                            TLRPC.Message message3 = r47Var2.k;
                            pc6Var.b = message3;
                            TLRPC.GeoPoint geoPoint = message3.media.geo;
                            ak5 ak5Var = new ak5(geoPoint.lat, geoPoint._long);
                            pc6Var.e.b(ak5Var);
                            if (this.q0 == pc6Var.a) {
                                this.F.b(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(pc6Var.e.a()));
                            }
                            w05 w05Var = pc6Var.f;
                            if (w05Var != null) {
                                w05Var.a();
                                pc6Var.f.b(ak5Var);
                                int i5 = r47Var2.k.media.heading;
                                if (i5 != 0) {
                                    pc6Var.f.c(i5);
                                    if (!pc6Var.g) {
                                        pc6Var.f.a.a(usd.b(R.drawable.map_pin_cone2));
                                        pc6Var.g = true;
                                    }
                                } else if (pc6Var.g) {
                                    pc6Var.f.c(0.0f);
                                    pc6Var.f.a.a(usd.b(R.drawable.map_pin_circle));
                                    pc6Var.g = false;
                                }
                            }
                        }
                        z2 = true;
                    }
                }
            }
            if (z2 && (kc6Var = this.Q) != null) {
                kc6Var.f();
                bx8 bx8Var = this.O;
                if (bx8Var != null) {
                    bx8Var.c(true);
                }
            }
            if (z2) {
                R0();
            }
        }
    }

    public final void e0() {
        jl0 jl0Var = this.Z;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
        gu guVar = this.R;
        if (guVar != null) {
            guVar.invalidate();
        }
        if (this.F != null) {
            int i = hl.B(getThemedColor(aob.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
            boolean z = this.i0;
            if (i != 0) {
                if (!z) {
                    this.i0 = true;
                    this.F.i(((z3f) org.telegram.messenger.a.j()).loadRawResourceStyle(org.telegram.messenger.a.b, i));
                    ym4 ym4Var = this.L;
                    if (ym4Var != null) {
                        ym4Var.S0(-1);
                        this.L.L0(553648127);
                    }
                }
            } else if (z) {
                this.i0 = false;
                this.F.i(null);
                ym4 ym4Var2 = this.L;
                if (ym4Var2 != null) {
                    ym4Var2.S0(-16777216);
                    this.L.L0(TLObject.FLAG_29);
                }
            }
            D0();
        }
    }

    public final boolean f0() {
        if (i0()) {
            return false;
        }
        if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            try {
                if (!((LocationManager) org.telegram.messenger.a.b.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i = aob.L5;
                    alertDialog$Builder.l(R.raw.permission_request_location, 72, getThemedColor(i), null);
                    alertDialog$Builder.m(i, getResourceProvider());
                    alertDialog$Builder.a.U = ob6.M0(2131749301, null);
                    alertDialog$Builder.j(ob6.M0(2131751771, null), new cc6(this, (byte) 5));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    showDialog(alertDialog$Builder.a);
                    return false;
                }
            } catch (Exception e) {
                cc4.g(e, true);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean finishFragment(boolean z) {
        if (A0()) {
            return false;
        }
        return super.finishFragment(z);
    }

    public final void g0(int i) {
        z0f freVar;
        if (this.F == null) {
            return;
        }
        byte b = 2;
        boolean z = false;
        List<ek5> asList = Arrays.asList(new dk5(), new ck5());
        tj5 onCreateCircleOptions = ((z3f) org.telegram.messenger.a.j()).onCreateCircleOptions();
        double latitude = this.z0.getLatitude();
        double longitude = this.z0.getLongitude();
        zh2 zh2Var = (zh2) ((v34) onCreateCircleOptions).b;
        LatLng latLng = new LatLng(latitude, longitude);
        zh2Var.getClass();
        zh2Var.a = latLng;
        double d = i;
        zh2 zh2Var2 = (zh2) ((v34) onCreateCircleOptions).b;
        zh2Var2.b = d;
        if (r0()) {
            zh2Var2.d = -1771658281;
            zh2Var2.e = 476488663;
        } else {
            zh2Var2.d = -1774024971;
            zh2Var2.e = 474121973;
        }
        ArrayList arrayList = new ArrayList();
        for (ek5 ek5Var : asList) {
            if (ek5Var instanceof dk5) {
                arrayList.add(new y53(20.0f, (byte) 1));
            } else if (ek5Var instanceof ck5) {
                arrayList.add(new y53(20.0f, (byte) 0));
            }
        }
        zh2Var2.r = arrayList;
        zh2Var2.c = 2.0f;
        x05 x05Var = this.F;
        um4 um4Var = x05Var.a;
        um4Var.getClass();
        try {
            qae qaeVar = (qae) um4Var.b;
            Parcel R = qaeVar.R();
            jld.b(R, zh2Var2);
            Parcel Q = qaeVar.Q(R, 35);
            IBinder readStrongBinder = Q.readStrongBinder();
            int i2 = pwe.b;
            if (readStrongBinder == null) {
                freVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                freVar = queryLocalInterface instanceof z0f ? (z0f) queryLocalInterface : new fre(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", (byte) 6);
            }
            Q.recycle();
            xh2 xh2Var = new xh2(freVar);
            ym4 ym4Var = new ym4(x05Var, xh2Var, z, b);
            x05Var.c.put(xh2Var, ym4Var);
            this.L = ym4Var;
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            UndoView[] undoViewArr = this.x;
            if (i >= undoViewArr.length) {
                break;
            }
            arrayList.add(new apb(undoViewArr[i], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.wj));
            i++;
        }
        arrayList.add(new apb(this.R, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h5));
        sla slaVar = this.r;
        arrayList.add(new apb(slaVar != null ? slaVar.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.j5));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.jj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.kj));
        arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.pj));
        arrayList.add(new apb(this.R, 393216, new Class[]{b5a.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.ej));
        arrayList.add(new apb(this.R, 393216, new Class[]{b5a.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.hj));
        arrayList.add(new apb(this.R, 393248, new Class[]{b5a.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.dj));
        arrayList.add(new apb(this.R, 393248, new Class[]{b5a.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.gj));
        arrayList.add(new apb(this.R, 196608, new Class[]{jd6.class}, new String[]{"frameLayout"}, (Drawable[]) null, (zob) null, aob.Hi));
        return arrayList;
    }

    public final Bitmap h0(pc6 pc6Var) {
        Bitmap bitmap = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(hl.L(62.0f), hl.L(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = org.telegram.messenger.a.b.getResources().getDrawable(R.drawable.map_pin_photo);
                drawable.setBounds(0, 0, hl.L(62.0f), hl.L(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                rb0 rb0Var = new rb0((vnb) null);
                TLRPC.User user = pc6Var.c;
                if (user != null) {
                    rb0Var.q(user);
                } else {
                    TLRPC.Chat chat = pc6Var.d;
                    if (chat != null) {
                        rb0Var.p(chat);
                    }
                }
                canvas.translate(hl.L(6.0f), hl.L(6.0f));
                rb0Var.setBounds(0, 0, hl.L(50.0f), hl.L(50.0f));
                rb0Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = pc6Var.h;
                Bitmap n = (imageReceiver == null || !imageReceiver.C()) ? null : pc6Var.h.n();
                if (n != null && !n.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(n, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    float L = hl.L(50.0f) / n.getWidth();
                    matrix.postScale(L, L);
                    matrix.postTranslate(hl.L(6.0f), hl.L(6.0f));
                    paint.setShader(bitmapShader);
                    bitmapShader.setLocalMatrix(matrix);
                    rectF.set(hl.L(6.0f), hl.L(6.0f), hl.L(56.0f), hl.L(56.0f));
                    canvas.drawRoundRect(rectF, hl.L(25.0f), hl.L(25.0f), paint);
                }
                canvas.restore();
                try {
                    canvas.setBitmap(null);
                    return createBitmap;
                } catch (Exception unused) {
                    return createBitmap;
                }
            } catch (Throwable th) {
                th = th;
                bitmap = createBitmap;
                cc4.g(th, true);
                return bitmap;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean i0() {
        return this instanceof gu1;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        return vm2.h(getThemedColor(aob.d6)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0(ArrayList arrayList) {
        vj5 onCreateLatLngBoundsBuilder = this.n0 ? ((z3f) org.telegram.messenger.a.j()).onCreateLatLngBoundsBuilder() : null;
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
            int i2 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i3 = messageMedia.period;
            if (i2 + i3 > currentTime || i3 == Integer.MAX_VALUE) {
                if (onCreateLatLngBoundsBuilder != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    ((kj4) onCreateLatLngBoundsBuilder).T(new ak5(geoPoint.lat, geoPoint._long));
                }
                b0(message);
                if (this.c.getVisibility() != 8 && r47.B1(message.from_id) != getUserConfig().e()) {
                    this.c.setVisibility(0);
                    this.E = true;
                    this.c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new ad5(this, (byte) 12)).start();
                }
            }
        }
        if (onCreateLatLngBoundsBuilder != null) {
            if (this.n0) {
                this.R.y0(0, hl.L(99.0f), null);
            }
            this.n0 = false;
            this.Q.N(this.o0);
            if (this.J0.C3()) {
                try {
                    kj4 kj4Var = (kj4) onCreateLatLngBoundsBuilder;
                    ak5 a = kj4Var.d().a();
                    ak5 z0 = z0(a, 100.0d, 100.0d);
                    kj4Var.T(z0(a, -100.0d, -100.0d));
                    kj4Var.T(z0);
                    v05 d = kj4Var.d();
                    if (arrayList.size() > 1) {
                        try {
                            sj5 newCameraUpdateLatLngBounds = ((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLngBounds(d, hl.L(113.0f));
                            this.G = newCameraUpdateLatLngBounds;
                            this.F.h(newCameraUpdateLatLngBounds);
                            this.G = null;
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final boolean l0() {
        boolean z;
        boolean z2;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i;
        boolean z3 = false;
        if (this.F != null) {
            ArrayList arrayList = new ArrayList();
            int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
            ArrayList arrayList2 = this.o0;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                pc6 pc6Var = (pc6) arrayList2.get(i2);
                w05 w05Var = pc6Var.e;
                if (w05Var != null && (message = pc6Var.b) != null && (messageMedia = message.media) != null && ((i = messageMedia.period) == Integer.MAX_VALUE || message.date + i > currentTime)) {
                    arrayList.add(w05Var.a());
                }
            }
            boolean z4 = this.p0.f(getUserConfig().e()) != null;
            Location location = this.z0;
            if (location != null && !z4) {
                arrayList.add(new ak5(location.getLatitude(), this.z0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    vj5 onCreateLatLngBoundsBuilder = ((z3f) org.telegram.messenger.a.j()).onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    int i3 = 0;
                    double d2 = Double.MAX_VALUE;
                    double d3 = Double.MAX_VALUE;
                    double d4 = -1.7976931348623157E308d;
                    while (i3 < size2) {
                        ak5 ak5Var = (ak5) arrayList.get(i3);
                        z = z3;
                        try {
                            ((kj4) onCreateLatLngBoundsBuilder).T(ak5Var);
                            int i4 = size2;
                            z2 = true;
                            try {
                                double d5 = ak5Var.a;
                                if (d5 < d2) {
                                    d2 = d5;
                                }
                                if (d5 > d) {
                                    d = d5;
                                }
                                double d6 = ak5Var.b;
                                if (d6 < d3) {
                                    d3 = d6;
                                }
                                if (d6 > d4) {
                                    d4 = d6;
                                }
                                i3++;
                                z3 = z;
                                size2 = i4;
                            } catch (Exception e) {
                                e = e;
                                cc4.g(e, z2);
                                return z;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            z2 = true;
                            cc4.g(e, z2);
                            return z;
                        }
                    }
                    z = z3;
                    z2 = true;
                    double d7 = (d2 + d) / 2.0d;
                    double d8 = (d3 + d4) / 2.0d;
                    double radians = Math.toRadians(d - d2) * 6366198.0d;
                    double radians2 = Math.toRadians(d4 - d3) * 6366198.0d * Math.cos(Math.toRadians(d7));
                    if (radians < 30.0d || radians2 < 30.0d) {
                        kj4 kj4Var = (kj4) onCreateLatLngBoundsBuilder;
                        kj4Var.T(new ak5(1.3499999414033853E-4d + d7, d8 + Math.toDegrees(15.0d / (Math.cos(Math.toRadians(d7)) * 6366198.0d))));
                        kj4Var.T(new ak5(d7 - 1.3499999414033853E-4d, d8 + Math.toDegrees((-15.0d) / (Math.cos(Math.toRadians(d7)) * 6366198.0d))));
                    }
                    this.F.c(((z3f) org.telegram.messenger.a.j()).newCameraUpdateLatLngBounds(((kj4) onCreateLatLngBoundsBuilder).d(), hl.L(60.0f)));
                    return true;
                } catch (Exception e3) {
                    e = e3;
                    z = z3;
                }
            }
        }
        return false;
    }

    public final void m0(boolean z) {
        if (this.R != null) {
            int i = this.mSystemInsets.d;
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight != 0) {
                byte b = this.N0;
                if (b == 6) {
                    this.O0 = qu6.x(66.0f, measuredHeight, i);
                } else if (b == 2) {
                    this.O0 = qu6.x(73.0f, measuredHeight, i);
                } else {
                    this.O0 = qu6.x(66.0f, measuredHeight, i);
                }
                nc6 nc6Var = this.R0;
                if (nc6Var != null && nc6Var.W(8) > 0) {
                    this.O0 -= hl.L(200.0f);
                }
                this.c0 = hl.L(100.0f) + (measuredHeight - this.O0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
                layoutParams.height = hl.L(29.0f) + this.O0;
                this.P.setLayoutParams(layoutParams);
                this.Q.P(this.O0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((tt) ((am2) this.H).b).getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = o0();
                    x05 x05Var = this.F;
                    if (x05Var != null) {
                        x05Var.n(hl.L(70.0f), 0, hl.L(70.0f), n0());
                    }
                    ((tt) ((am2) this.H).b).setLayoutParams(layoutParams2);
                }
                this.Q.f();
                if (!z) {
                    N0(false);
                    return;
                }
                byte b2 = 3;
                int i2 = b == 3 ? 73 : (b == 1 || b == 2) ? 66 : 0;
                this.V.g1(0, -hl.L(i2));
                N0(false);
                this.R.post(new gw1(this, i2, b2));
            }
        }
    }

    public final int n0() {
        return hl.L(10.0f) + this.h0 + this.c0;
    }

    public final int o0() {
        return hl.L(10.0f) + this.O0 + this.c0;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        bx8 bx8Var = this.O;
        if (bx8Var == null) {
            xj5 xj5Var = this.H;
            if (xj5Var == null || ((GLSurfaceView) ((am2) xj5Var).f) == null || this.J) {
                return super.onBackPressed(z);
            }
            if (z) {
                A0();
            }
        } else if (z) {
            bx8Var.a();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().b(this, jn7.s);
        jn7.e().b(this, jn7.y4);
        jn7.e().b(this, jn7.z4);
        jn7.e().b(this, jn7.G4);
        r47 r47Var = this.J0;
        if (r47Var != null && r47Var.C3()) {
            getNotificationCenter().b(this, 1);
            getNotificationCenter().b(this, jn7.m0);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jk6 jk6Var = this.e0;
        if (jk6Var != null) {
            jk6Var.i = true;
            jk6Var.g = false;
            jk6Var.d();
            jk6Var.d = null;
            jk6Var.e = null;
            jk6Var.f = null;
        }
        jn7.e().n(this, jn7.y4);
        jn7.e().n(this, jn7.z4);
        jn7.e().n(this, jn7.G4);
        getNotificationCenter().n(this, jn7.s);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, jn7.m0);
        M0();
        if (this.G0 != null) {
            try {
                ((pm3) org.telegram.messenger.a.i()).removeLocationUpdates(this.G0);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        this.C0 = null;
        this.D0 = null;
        try {
            xj5 xj5Var = this.H;
            if (xj5Var != null) {
                ((am2) xj5Var).G();
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        kc6 kc6Var = this.Q;
        if (kc6Var != null) {
            kc6Var.F();
        }
        q42 q42Var = this.T;
        if (q42Var != null) {
            q42Var.F();
        }
        dc6 dc6Var = this.Q0;
        if (dc6Var != null) {
            hl.r(dc6Var);
            this.Q0 = null;
        }
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            pc6 pc6Var = (pc6) arrayList.get(i);
            ImageReceiver imageReceiver = pc6Var.h;
            if (imageReceiver != null) {
                imageReceiver.K();
                pc6Var.h = null;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onInsets(int i, int i2, int i3, int i4) {
        c0();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onLowMemory() {
        ko9 ko9Var;
        super.onLowMemory();
        xj5 xj5Var = this.H;
        if (xj5Var == null || !this.x0 || (ko9Var = (ko9) ((xq2) ((tt) ((am2) xj5Var).b).b).a) == null) {
            return;
        }
        try {
            b1f b1fVar = (b1f) ko9Var.c;
            b1fVar.V(b1fVar.R(), 6);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        xj5 xj5Var = this.H;
        if (xj5Var != null && this.x0) {
            try {
                ((am2) xj5Var).H();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.y0 = false;
        M0();
        if (this.G0 != null) {
            try {
                ((pm3) org.telegram.messenger.a.i()).removeLocationUpdates(this.G0);
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
        P0();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        hl.V2(getParentActivity(), this.classGuid);
        hl.y2(getParentActivity(), this.classGuid);
        xj5 xj5Var = this.H;
        if (xj5Var != null && this.x0) {
            try {
                ((am2) xj5Var).I();
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        this.y0 = true;
        K0();
        L0();
        D0();
        m0(true);
        if (i0()) {
            this.t0 = false;
        } else if (this.t0 && (parentActivity = getParentActivity()) != null) {
            this.t0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        dc6 dc6Var = this.Q0;
        if (dc6Var != null) {
            hl.r(dc6Var);
            hl.d3(this.Q0, 5000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            e0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            sla slaVar = this.r;
            if (slaVar == null || slaVar.getSearchField() == null) {
                return;
            }
            this.r.getSearchField().setCursorColor(getThemedColor(aob.j5));
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || z2) {
            return;
        }
        try {
            if (((tt) ((am2) this.H).b).getParent() instanceof ViewGroup) {
                ((ViewGroup) ((tt) ((am2) this.H).b).getParent()).removeView((tt) ((am2) this.H).b);
            }
        } catch (Exception unused) {
        }
        b6 b6Var = this.P;
        if (b6Var != null) {
            b6Var.addView((tt) ((am2) this.H).b, 0, tre.e(-1, o0(), 51));
            N0(false);
            y0();
            D0();
            return;
        }
        View view = this.fragmentView;
        if (view != null) {
            ((FrameLayout) view).addView((tt) ((am2) this.H).b, 0, tre.e(-1, -1, 51));
        }
    }

    public final boolean p0() {
        ArrayList arrayList = (ArrayList) getLocationController().c.f(r47.B0(this.J0.k));
        if (arrayList == null || !arrayList.isEmpty()) {
            arrayList = null;
        } else {
            j0(arrayList);
        }
        if (wf3.y(this.m0)) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.m0));
            if (xc2.T(M0) && !M0.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long B0 = r47.B0(this.J0.k);
        tL_messages_getRecentLocations.peer = getMessagesController().j1(B0);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new yu2(this, B0, (byte) 1));
        return arrayList != null;
    }

    public final UndoView q0() {
        UndoView[] undoViewArr = this.x;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.P.removeView(undoViewArr[0]);
            this.P.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean r0() {
        return (getResourceProvider() == null && aob.I.o()) || hl.B(getThemedColor(aob.d6)) < 0.721f;
    }

    public final /* synthetic */ void s0(int i) {
        float e;
        float f;
        TLRPC.TL_messageMediaVenue H = this.T.H(i);
        if (H == null || H.icon == null || this.F == null) {
            return;
        }
        this.K0 = true;
        this.simpleActionBar.o(true);
        boolean equals = "pin".equals(H.icon);
        x05 x05Var = this.F;
        if (equals) {
            e = x05Var.e();
            f = 4.0f;
        } else {
            e = x05Var.e();
            f = 9.0f;
        }
        float f2 = e - f;
        x05 x05Var2 = this.F;
        IMapsProvider j = org.telegram.messenger.a.j();
        TLRPC.GeoPoint geoPoint = H.geo;
        x05Var2.b(((z3f) j).newCameraUpdateLatLngZoom(new ak5(geoPoint.lat, geoPoint._long), f2));
        Location location = this.A0;
        if (location != null) {
            location.setLatitude(H.geo.lat);
            this.A0.setLongitude(H.geo._long);
        }
        this.Q.L(this.A0);
    }

    public final /* synthetic */ void t0() {
        dc6 dc6Var;
        getLocationController().j(this.m0);
        if (this.isPaused || (dc6Var = this.Q0) == null) {
            return;
        }
        hl.d3(dc6Var, 5000L);
    }

    public final /* synthetic */ void u0() {
        this.glassEngine.g();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0(int i, TLRPC.User user, boolean z) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (!z) {
            I0(i, 0, user);
            return;
        }
        hd6 h = getLocationController().h(this.m0);
        if (h != null) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.peer = getMessagesController().j1(h.a);
            tL_messages_editMessage.id = h.b;
            tL_messages_editMessage.flags |= TLObject.FLAG_14;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = false;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
            Location location = id6.f(this.currentAccount).s;
            tL_messages_editMessage.media.geo_point.lat = hl.b0(location.getLatitude());
            tL_messages_editMessage.media.geo_point._long = hl.b0(location.getLongitude());
            tL_messages_editMessage.media.geo_point.accuracy_radius = (int) location.getAccuracy();
            TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
            TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
            if (inputGeoPoint.accuracy_radius != 0) {
                inputGeoPoint.flags |= 1;
            }
            int i2 = h.g;
            int i3 = h.f;
            if (i2 != i3) {
                inputMedia.proximity_notification_radius = i3;
                inputMedia.flags |= 8;
            }
            inputMedia.heading = id6.e(location);
            TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
            int i4 = inputMedia2.flags;
            inputMedia2.flags = i4 | 4;
            int i5 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i6 = i == Integer.MAX_VALUE ? Integer.MAX_VALUE : h.d + i;
            h.d = i6;
            inputMedia2.period = i6;
            if (i != Integer.MAX_VALUE) {
                i5 = h.c + i;
            }
            h.c = i5;
            inputMedia2.flags = i4 | 6;
            r47 r47Var = h.h;
            if (r47Var != null && (message = r47Var.k) != null && (messageMedia = message.media) != null) {
                messageMedia.period = i6;
                getMessagesStorage().s1(h.h.k, null, null, true);
            }
            getConnectionsManager().sendRequest(tL_messages_editMessage, null);
            jn7.e().k(jn7.G4, new Object[0]);
        }
    }

    public final /* synthetic */ void x0() {
        this.glassEngine.g();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void y0() {
        SharedPreferences e1;
        int i;
        ImageView imageView = this.c;
        if (imageView == null || imageView.getVisibility() != 0 || this.E || (i = (e1 = uc7.e1()).getInt("proximityhint", 0)) >= 3) {
            return;
        }
        e1.edit().putInt("proximityhint", i + 1).commit();
        if (wf3.D(this.m0)) {
            this.s.t(ob6.a0("ProximityTooltioUser", null, 2131746339, lbc.k(getMessagesController().X1(Long.valueOf(this.m0)), true)));
        } else {
            this.s.t(ob6.M0(2131746340, null));
        }
        this.s.v();
    }
}
