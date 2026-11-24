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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class pc6 extends d implements jm7 {
    public Location A0;
    public int B0;
    public iq2 C0;
    public r05 D0;
    public boolean E;
    public boolean E0;
    public s05 F;
    public nj5 F0;
    public pj5 G;
    public yb6 G0;
    public uj5 H;
    public TLRPC.TL_channelLocation H0;
    public pj5 I;
    public TLRPC.TL_channelLocation I0;
    public boolean J;
    public k47 J0;
    public float K;
    public boolean K0;
    public mj4 L;
    public boolean L0;
    public double M;
    public lc6 M0;
    public boolean N;
    public final byte N0;
    public tv8 O;
    public int O0;
    public a6 P;
    public jc6 P0;
    public fc6 Q;
    public sb6 Q0;
    public fv R;
    public ic6 R0;
    public r59 S;
    public l55 S0;
    public l52 T;
    public TL_stories.MediaArea T0;
    public View U;
    public boolean U0;
    public u46 V;
    public boolean V0;
    public zja W;
    public Boolean W0;
    public FrameLayout X;
    public FrameLayout Y;
    public im0 Z;
    public ImageView a;
    public final RectF a0;
    public TextView b;
    public int b0;
    public ImageView c;
    public int c0;
    public zja d;
    public TextureView d0;
    public LinearLayout e;
    public hk6 e0;
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
    public final vh6 p0;
    public long q0;
    public zja r;
    public boolean r0;
    public hg5 s;
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
    public pc6(int i) {
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
        this.p0 = new vh6();
        this.q0 = -1L;
        this.t0 = true;
        this.O0 = (gm.q.x - a.getCurrentActionBarHeight()) - gm.L(66.0f);
        this.V0 = true;
        this.N0 = i;
        gm.a0();
    }

    public static View l0(View view, Class cls) {
        if (cls.isInstance(view)) {
            return (View) cls.cast(view);
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View l0 = l0(viewGroup.getChildAt(i), cls);
            if (l0 != null) {
                return l0;
            }
        }
        return null;
    }

    public static xj5 z0(xj5 xj5Var, double d, double d2) {
        double d3 = xj5Var.a;
        return new xj5(d3 + Math.toDegrees(d / 6366198.0d), xj5Var.b + Math.toDegrees(d2 / (Math.cos(Math.toRadians(d3)) * 6366198.0d)));
    }

    public final boolean A0() {
        GLSurfaceView gLSurfaceView;
        uj5 uj5Var = this.H;
        if (uj5Var == null || (gLSurfaceView = (GLSurfaceView) ((sm2) uj5Var).f) == null || this.J) {
            return false;
        }
        gLSurfaceView.queueEvent(new k16(this, gLSurfaceView, (byte) 13));
        return true;
    }

    public final void B0(kc6 kc6Var) {
        double d;
        double d2;
        TLRPC.Message message;
        if (kc6Var == null || (message = kc6Var.b) == null) {
            k47 k47Var = this.J0;
            if (k47Var != null) {
                TLRPC.GeoPoint geoPoint = k47Var.k.media.geo;
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
        boolean z = e21.a;
        org.telegram.messenger.a.q();
        if (this.z0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?saddr=%f,%f&daddr=%f,%f", Double.valueOf(this.z0.getLatitude()), Double.valueOf(this.z0.getLongitude()), Double.valueOf(d), Double.valueOf(d2)))));
                return;
            } catch (Exception e) {
                fc4.g(e, true);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?saddr=&daddr=%f,%f", Double.valueOf(d), Double.valueOf(d2)))));
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    public final void C0(final boolean z) {
        if (this.M0 == null || j0() || getParentActivity() == null || this.z0 == null || !g0()) {
            return;
        }
        final TLRPC.User W1 = pg3.D(this.m0) ? getMessagesController().W1(Long.valueOf(this.m0)) : null;
        showDialog(ik.B(getParentActivity(), z, W1, new we7() { // from class: ac6
            @Override // we7
            public final void a(int i) {
                boolean z2 = z;
                pc6.this.w0(i, W1, z2);
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
            su suVar = (su) ((sm2) this.H).b;
            TextureView textureView2 = (TextureView) l0(suVar, TextureView.class);
            this.d0 = textureView2;
            hk6 hk6Var = this.e0;
            SurfaceView surfaceView2 = textureView2 == null ? (SurfaceView) l0(suVar, SurfaceView.class) : null;
            if (hk6Var.d != surfaceView2) {
                hk6Var.d = surfaceView2;
                hk6Var.a();
            }
            TextureView textureView3 = this.d0;
            if (textureView3 != null) {
                TextureView.SurfaceTextureListener surfaceTextureListener = textureView3.getSurfaceTextureListener();
                if (!(surfaceTextureListener instanceof mc6)) {
                    this.d0.setSurfaceTextureListener(new mc6(this, surfaceTextureListener));
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
        if (surfaceTextureListener2 instanceof mc6) {
            return;
        }
        this.d0.setSurfaceTextureListener(new mc6(this, surfaceTextureListener2));
    }

    public final void E0(Location location) {
        if (location == null) {
            return;
        }
        this.z0 = new Location(location);
        kc6 kc6Var = (kc6) this.p0.f(getUserConfig().e());
        cd6 h = getLocationController().h(this.m0);
        if (kc6Var != null && h != null && kc6Var.b.id == h.b) {
            xj5 xj5Var = new xj5(location.getLatitude(), location.getLongitude());
            kc6Var.e.b(xj5Var);
            r05 r05Var = kc6Var.f;
            if (r05Var != null) {
                r05Var.b(xj5Var);
            }
            if (this.q0 == kc6Var.a) {
                this.F.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(kc6Var.e.a()));
            }
        }
        if (this.J0 == null && this.H0 == null && this.F != null) {
            xj5 xj5Var2 = new xj5(location.getLatitude(), location.getLongitude());
            fc6 fc6Var = this.Q;
            if (fc6Var != null) {
                fc6Var.M(this.z0);
            }
            if (!this.K0) {
                this.A0 = new Location(location);
                if (this.L0) {
                    this.F.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(xj5Var2));
                } else {
                    this.L0 = true;
                    this.F.h(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(xj5Var2, this.F.e() - 4.0f));
                }
            }
        } else {
            this.Q.M(this.z0);
        }
        tv8 tv8Var = this.O;
        if (tv8Var != null) {
            tv8Var.c(true);
        }
        mj4 mj4Var = this.L;
        if (mj4Var != null) {
            double latitude = this.z0.getLatitude();
            double longitude = this.z0.getLongitude();
            ti2 ti2Var = (ti2) mj4Var.b;
            LatLng latLng = new LatLng(latitude, longitude);
            ti2Var.getClass();
            try {
                roe roeVar = (roe) ti2Var.a;
                Parcel R = roeVar.R();
                tid.b(R, latLng);
                roeVar.V(R, 3);
            } catch (RemoteException e) {
                i2d.h(e);
                return;
            }
        }
        iq2 iq2Var = this.C0;
        if (iq2Var != null) {
            iq2Var.a(this.z0);
        }
        Q0(true);
        R0();
    }

    public final void F0(View view) {
        im0 c = getBaseSimpleGlass().c.c(view, null, false);
        c.p(qqd.l(getResourceProvider()));
        c.r(gm.L(23.0f));
        c.q(gm.L(6.0f));
        view.setBackground(c);
        rve.a(view);
    }

    public final void G0(k47 k47Var) {
        this.J0 = k47Var;
        this.m0 = k47.B0(k47Var.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H0(kc6 kc6Var) {
        if (kc6Var.h == null) {
            TLRPC.User user = kc6Var.c;
            TLRPC.Chat chat = kc6Var.d;
            if (user == null && chat == 0) {
                return;
            }
            pc0 pc0Var = new pc0((ylb) null);
            if (user != null) {
                pc0Var.q(user);
            } else {
                pc0Var.p(chat);
            }
            ImageReceiver imageReceiver = new ImageReceiver(null);
            imageReceiver.d = this.currentAccount;
            imageReceiver.h1 = new nv4(this, kc6Var, (byte) 15);
            imageReceiver.I();
            if (user == null) {
                user = chat;
            }
            imageReceiver.U(user, pc0Var, null);
            kc6Var.h = imageReceiver;
        }
    }

    public final void I0(int i, int i2, TLRPC.User user) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = gm.b0(this.z0.getLatitude());
        tL_messageMediaGeoLive.geo._long = gm.b0(this.z0.getLongitude());
        tL_messageMediaGeoLive.heading = dd6.e(this.z0);
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
        tv8 tv8Var = this.O;
        if (tv8Var != null) {
            tv8Var.a();
        }
        r0().k(0L, 24, Integer.valueOf(i2), user, null, null);
    }

    public final void J0(boolean z, boolean z2) {
        Boolean bool = this.W0;
        if (bool == null || bool.booleanValue() != z) {
            this.W0 = Boolean.valueOf(z);
            TextView textView = this.b;
            if (z2) {
                textView.setVisibility(0);
                this.b.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.7f).scaleY(z ? 1.0f : 0.7f).setInterpolator(d53.h).setDuration(420L).withEndAction(new y8c((byte) 24, this, z)).start();
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
        iq2 iq2Var = this.C0;
        if (iq2Var == null) {
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
                iq2Var = new iq2(new yb6(this, (byte) 3));
                this.C0 = iq2Var;
            } catch (Exception e) {
                fc4.g(e, true);
                return;
            }
        }
        iq2Var.a(this.z0);
        iq2 iq2Var2 = this.C0;
        if (iq2Var2.f) {
            return;
        }
        try {
            if (iq2Var2.b == null) {
                SensorManager sensorManager2 = (SensorManager) org.telegram.messenger.a.b.getSystemService("sensor");
                iq2Var2.b = sensorManager2;
                if (sensorManager2 == null) {
                    return;
                }
                Sensor defaultSensor = sensorManager2.getDefaultSensor(11);
                iq2Var2.c = defaultSensor;
                if (defaultSensor == null) {
                    iq2Var2.d = iq2Var2.b.getDefaultSensor(1);
                    iq2Var2.e = iq2Var2.b.getDefaultSensor(2);
                }
            }
            Sensor sensor = iq2Var2.c;
            if (sensor != null) {
                iq2Var2.b.registerListener(iq2Var2, sensor, 1);
            } else {
                Sensor sensor2 = iq2Var2.d;
                if (sensor2 == null || iq2Var2.e == null) {
                    return;
                }
                iq2Var2.b.registerListener(iq2Var2, sensor2, 1);
                iq2Var2.b.registerListener(iq2Var2, iq2Var2.e, 1);
            }
            iq2Var2.f = true;
            iq2Var2.I = 0L;
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    public final void L0() {
        if (!this.y0 || this.k0) {
            return;
        }
        if (this.G0 == null) {
            nj5 onCreateLocationRequest = ((in3) org.telegram.messenger.a.i()).onCreateLocationRequest();
            this.F0 = onCreateLocationRequest;
            ((o05) onCreateLocationRequest).c();
            ((o05) this.F0).b();
            ((o05) this.F0).a();
            this.G0 = new yb6(this, (byte) 2);
        }
        try {
            ((in3) org.telegram.messenger.a.i()).requestLocationUpdates(this.F0, this.G0);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void M0() {
        iq2 iq2Var = this.C0;
        if (iq2Var == null || !iq2Var.f) {
            return;
        }
        iq2Var.f = false;
        iq2Var.x = false;
        try {
            iq2Var.b.unregisterListener(iq2Var);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void N0(boolean z) {
        int i;
        int i2;
        FrameLayout.LayoutParams layoutParams;
        u69 K = this.R.K(0);
        if (K != null) {
            i = (int) K.a.getY();
            i2 = Math.min(i, 0) + this.O0;
            this.b0 = (this.O0 + i) - this.h0;
        } else {
            i = -this.P.getMeasuredHeight();
            this.b0 = -gm.L(41.0f);
            i2 = 0;
        }
        this.R.invalidate();
        if (((FrameLayout.LayoutParams) this.P.getLayoutParams()) != null) {
            uj5 uj5Var = this.H;
            if (i2 <= 0) {
                if (((su) ((sm2) uj5Var).b).getVisibility() == 0) {
                    ((su) ((sm2) this.H).b).setVisibility(4);
                    this.P.setVisibility(4);
                }
            } else if (((su) ((sm2) uj5Var).b).getVisibility() == 4) {
                ((su) ((sm2) this.H).b).setVisibility(0);
                this.P.setVisibility(0);
            }
            this.P.setTranslationY(Math.min(0, i));
            int i3 = -i;
            ((su) ((sm2) this.H).b).setTranslationY(Math.max(0, i3 / 2));
            FrameLayout frameLayout = this.X;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-Math.min(0, i));
                float l = Utilities.l((kt6.y(53.0f, i2 - this.h0, gm.L(46.0f) + eh0.d(this.mSystemInsets.b)) - gm.L(7.0f)) / gm.L(48.0f));
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
                int L = ((i2 / 2) + (i3 - gm.L(view.getTag() != null ? 69.0f : 48.0f))) - (this.h0 / 2);
                this.B0 = L;
                view.setTranslationY(L);
            }
            if (z || (layoutParams = (FrameLayout.LayoutParams) ((su) ((sm2) this.H).b).getLayoutParams()) == null || layoutParams.height == p0()) {
                return;
            }
            layoutParams.height = p0();
            s05 s05Var = this.F;
            if (s05Var != null) {
                s05Var.n(gm.L(70.0f), 0, gm.L(70.0f), o0());
            }
            ((su) ((sm2) this.H).b).setLayoutParams(layoutParams);
        }
    }

    public final void O0() {
        if (!this.u0) {
            this.e.setVisibility(8);
            return;
        }
        boolean z = this.w0;
        r59 r59Var = this.S;
        if (!z) {
            r59Var.setEmptyView(this.e);
            return;
        }
        r59Var.setEmptyView(null);
        this.e.setVisibility(8);
        this.S.setVisibility(8);
    }

    public final void P0() {
        uj5 uj5Var;
        a6 a6Var;
        hk6 hk6Var = this.e0;
        if (hk6Var == null || (uj5Var = this.H) == null) {
            return;
        }
        su suVar = (su) ((sm2) uj5Var).b;
        boolean z = this.d0 == null && this.y0 && !isFinishing() && (a6Var = this.P) != null && a6Var.getVisibility() == 0 && suVar.getParent() != null && suVar.getVisibility() == 0;
        if (hk6Var.g != z) {
            hk6Var.g = z;
            if (z) {
                hk6Var.a();
            } else {
                hk6Var.d();
            }
        }
    }

    public final void Q0(boolean z) {
        Location location;
        if (this.F == null || (location = this.z0) == null) {
            return;
        }
        iq2 iq2Var = this.C0;
        boolean z2 = iq2Var != null && iq2Var.H;
        try {
            r05 r05Var = this.D0;
            int i = R.drawable.map_pin_circle;
            if (r05Var == null) {
                ai4 ai4Var = (ai4) ((k1f) org.telegram.messenger.a.j()).onCreateMarkerOptions();
                ((cl6) ai4Var.b).a = new LatLng(this.z0.getLatitude(), this.z0.getLongitude());
                cl6 cl6Var = (cl6) ai4Var.b;
                cl6Var.r = true;
                cl6Var.e = 0.5f;
                cl6Var.f = 0.5f;
                cl6Var.d = hqd.b(z2 ? R.drawable.map_pin_cone2 : R.drawable.map_pin_circle);
                this.D0 = this.F.a(ai4Var);
                this.E0 = z2;
            } else if (z) {
                double latitude = location.getLatitude();
                double longitude = this.z0.getLongitude();
                bl6 bl6Var = r05Var.a;
                LatLng latLng = new LatLng(latitude, longitude);
                bl6Var.getClass();
                try {
                    sjf sjfVar = (sjf) bl6Var.a;
                    Parcel R = sjfVar.R();
                    tid.b(R, latLng);
                    sjfVar.V(R, 3);
                } catch (RemoteException e) {
                    throw new rq2(e);
                }
            }
            r05 r05Var2 = this.D0;
            if (r05Var2 != null) {
                if (z2 != this.E0) {
                    if (z2) {
                        i = R.drawable.map_pin_cone2;
                    }
                    r05Var2.a.a(hqd.b(i));
                    this.E0 = z2;
                }
                this.D0.c(z2 ? this.C0.G : 0.0f);
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
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
            m0();
            return;
        }
        int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.Message message = ((kc6) arrayList.get(i3)).b;
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

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.m5));
        hashSet.add(Integer.valueOf(cmb.Z6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.Ii));
        hashSet.add(Integer.valueOf(cmb.ej));
        hashSet.add(Integer.valueOf(cmb.hj));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.xj));
        hashSet.add(Integer.valueOf(cmb.vj));
        hashSet.add(Integer.valueOf(cmb.wj));
    }

    public final kc6 c0(TLRPC.Message message) {
        Location location;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        double d = geoPoint.lat;
        double d2 = geoPoint._long;
        long B1 = k47.B1(message.from_id);
        vh6 vh6Var = this.p0;
        kc6 kc6Var = (kc6) vh6Var.f(B1);
        if (kc6Var == null) {
            kc6Var = new kc6();
            kc6Var.b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                kc6Var.c = getMessagesController().W1(Long.valueOf(kc6Var.b.from_id.user_id));
                kc6Var.a = kc6Var.b.from_id.user_id;
            } else {
                long B0 = k47.B0(message);
                if (pg3.D(B0)) {
                    kc6Var.c = getMessagesController().W1(Long.valueOf(B0));
                } else {
                    kc6Var.d = getMessagesController().L0(Long.valueOf(-B0));
                }
                kc6Var.a = B0;
            }
            H0(kc6Var);
            try {
                ai4 ai4Var = (ai4) ((k1f) org.telegram.messenger.a.j()).onCreateMarkerOptions();
                cl6 cl6Var = (cl6) ai4Var.b;
                cl6 cl6Var2 = (cl6) ai4Var.b;
                cl6Var.a = new LatLng(d, d2);
                Bitmap i0 = i0(kc6Var);
                if (i0 != null) {
                    cl6Var2.d = hqd.a(i0);
                    cl6Var2.e = 0.5f;
                    cl6Var2.f = 0.8010882f;
                    kc6Var.e = this.F.a(ai4Var);
                    if (!m9c.D(kc6Var.c)) {
                        ai4 ai4Var2 = (ai4) ((k1f) org.telegram.messenger.a.j()).onCreateMarkerOptions();
                        ((cl6) ai4Var2.b).a = new LatLng(d, d2);
                        cl6 cl6Var3 = (cl6) ai4Var2.b;
                        cl6Var3.r = true;
                        cl6Var3.e = 0.5f;
                        cl6Var3.f = 0.5f;
                        r05 a = this.F.a(ai4Var2);
                        kc6Var.f = a;
                        int i = message.media.heading;
                        if (i != 0) {
                            a.c(i);
                            kc6Var.f.a.a(hqd.b(R.drawable.map_pin_cone2));
                            kc6Var.g = true;
                        } else {
                            a.c(0.0f);
                            kc6Var.f.a.a(hqd.b(R.drawable.map_pin_circle));
                            kc6Var.g = false;
                        }
                    }
                    this.o0.add(kc6Var);
                    vh6Var.k(kc6Var, kc6Var.a);
                    cd6 h = getLocationController().h(this.m0);
                    if (kc6Var.a == getUserConfig().e() && h != null && kc6Var.b.id == h.b && (location = this.z0) != null) {
                        double latitude = location.getLatitude();
                        double longitude = this.z0.getLongitude();
                        bl6 bl6Var = kc6Var.e.a;
                        LatLng latLng = new LatLng(latitude, longitude);
                        bl6Var.getClass();
                        try {
                            sjf sjfVar = (sjf) bl6Var.a;
                            Parcel R = sjfVar.R();
                            tid.b(R, latLng);
                            sjfVar.V(R, 3);
                        } catch (RemoteException e) {
                            throw new rq2(e);
                        }
                    }
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        } else {
            kc6Var.b = message;
            bl6 bl6Var2 = kc6Var.e.a;
            LatLng latLng2 = new LatLng(d, d2);
            bl6Var2.getClass();
            try {
                sjf sjfVar2 = (sjf) bl6Var2.a;
                Parcel R2 = sjfVar2.R();
                tid.b(R2, latLng2);
                sjfVar2.V(R2, 3);
                if (this.q0 == kc6Var.a) {
                    this.F.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(kc6Var.e.a()));
                }
            } catch (RemoteException e3) {
                i2d.h(e3);
                return null;
            }
        }
        tv8 tv8Var = this.O;
        if (tv8Var != null) {
            tv8Var.c(true);
        }
        R0();
        return kc6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0840, code lost:
    
        if (r33.H0 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0842, code lost:
    
        r0 = r33.H0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0844, code lost:
    
        if (r0 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0846, code lost:
    
        r33.Q.P = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x084b, code lost:
    
        r0 = r33.J0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x084d, code lost:
    
        if (r0 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x084f, code lost:
    
        r4 = r33.Q;
        r4.O = r0;
        r4.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x083c, code lost:
    
        if (r0.C3() != false) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x076a  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z;
        k47 k47Var;
        k47 k47Var2;
        byte b;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        final byte b2 = 0;
        this.v0 = false;
        this.u0 = false;
        this.w0 = false;
        fc6 fc6Var = this.Q;
        if (fc6Var != null) {
            fc6Var.F();
        }
        l52 l52Var = this.T;
        if (l52Var != null) {
            l52Var.F();
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
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new dc6(this));
        yja t = this.simpleActionBar.t();
        zja a = t.a(0, R.drawable.msg_map_type);
        this.d = a;
        final byte b4 = 2;
        a.e(2, R.drawable.msg_map, jb6.M0(2131748447, null));
        this.d.e(3, R.drawable.msg_satellite, jb6.M0(2131745682, null));
        this.d.e(4, R.drawable.msg_hybrid, jb6.M0(2131749032, null));
        this.d.setContentDescription(jb6.M0(2131754838, null));
        TLRPC.TL_channelLocation tL_channelLocation = this.H0;
        byte b5 = this.N0;
        if (tL_channelLocation != null) {
            this.simpleActionBar.setTitle(jb6.M0(2131752157, null));
        } else {
            k47 k47Var3 = this.J0;
            if (k47Var3 == null) {
                this.simpleActionBar.setTitle(jb6.M0(2131745190, null));
                if (b5 != 4) {
                    zja a2 = t.a(0, R.drawable.outline_header_search);
                    a2.N();
                    a2.C0 = new q20(this, (byte) 15);
                    this.r = a2;
                    a2.setSearchFieldHint(jb6.M0(2131745570, null));
                    this.r.setContentDescription(jb6.M0(2131745570, null));
                }
            } else if (k47Var3.C3()) {
                this.simpleActionBar.setTitle(jb6.M0(2131753931, null));
                zja a3 = t.a(0, R.drawable.ic_ab_other);
                this.W = a3;
                a3.e(6, R.drawable.filled_directions, jb6.M0(2131750406, null));
            } else {
                if (b5 != 3) {
                    String str = this.J0.k.media.title;
                    if (str == null || str.length() <= 0) {
                        this.simpleActionBar.setTitle(jb6.M0(2131752157, null));
                    } else {
                        this.simpleActionBar.setTitle(jb6.M0(2131745138, null));
                    }
                }
                if (b5 != 3) {
                    zja a4 = t.a(0, R.drawable.ic_ab_other);
                    this.W = a4;
                    a4.e(1, R.drawable.msg_openin, jb6.M0(2131747529, null));
                    if (!getLocationController().i(this.m0) && this.V0) {
                        this.W.e(5, R.drawable.msg_location, jb6.M0(2131745346, null));
                    }
                    this.W.setContentDescription(jb6.M0(2131754838, null));
                }
            }
        }
        FrameLayout nc6Var = new nc6(this, context);
        this.fragmentView = nc6Var;
        int i = cmb.g5;
        anb.h(i, getResourceProvider(), nc6Var);
        this.h0 = gm.L((b5 == 0 || b5 == 1) ? 26.0f : 16.0f);
        a6 a6Var = new a6(context, (byte) 18);
        this.P = a6Var;
        a6Var.setBackgroundDrawable(new yb1(s0()));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        this.P.addView(frameLayout, qoe.e(-1, -2, 51));
        this.Y = new FrameLayout(context);
        FrameLayout.LayoutParams e = qoe.e(-1, -2, 83);
        e.bottomMargin = gm.L(1.0f) + gm.L(29.0f) + this.h0;
        this.P.addView(this.Y, e);
        if (this.J0 != null && b5 == 3) {
            TextView textView = new TextView(context);
            F0(textView);
            anb.X(textView, cmb.lj, getResourceProvider());
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(gm.o());
            textView.setGravity(17);
            textView.setPadding(gm.L(24.0f), 0, gm.L(24.0f), 0);
            this.simpleActionBar.addView(textView, qoe.e(-2, 58, 1));
            textView.setText(jb6.M0(2131747528, null));
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: ub6
                public final /* synthetic */ pc6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s05 s05Var;
                    byte b6 = b3;
                    byte b7 = 4;
                    pc6 pc6Var = this.b;
                    byte b8 = 1;
                    switch (b6) {
                        case 0:
                            if (pc6Var.getParentActivity() != null && pc6Var.z0 != null && pc6Var.g0() && pc6Var.F != null) {
                                hg5 hg5Var = pc6Var.s;
                                if (hg5Var != null) {
                                    hg5Var.f(true);
                                }
                                oc7.d1().edit().putInt("proximityhint", 3).commit();
                                cd6 h = pc6Var.getLocationController().h(pc6Var.m0);
                                if (pc6Var.y) {
                                    pc6Var.x[0].d(1, true);
                                }
                                if (h != null && h.f > 0) {
                                    pc6Var.c.setImageResource(R.drawable.msg_location_alert);
                                    mj4 mj4Var = pc6Var.L;
                                    if (mj4Var != null) {
                                        mj4Var.y();
                                        pc6Var.L = null;
                                    }
                                    pc6Var.y = true;
                                    pc6Var.r0().k(0L, 25, 0, null, new sb6(pc6Var, (byte) 3), new k16(pc6Var, h, (byte) 14));
                                    break;
                                } else {
                                    mj4 mj4Var2 = pc6Var.L;
                                    byte b9 = 6;
                                    if (mj4Var2 == null) {
                                        pc6Var.h0(500);
                                    } else {
                                        ti2 ti2Var = (ti2) mj4Var2.b;
                                        ti2Var.getClass();
                                        try {
                                            roe roeVar = (roe) ti2Var.a;
                                            Parcel Q = roeVar.Q(roeVar.R(), 6);
                                            double readDouble = Q.readDouble();
                                            Q.recycle();
                                            pc6Var.M = readDouble;
                                        } catch (RemoteException e2) {
                                            i2d.h(e2);
                                            return;
                                        }
                                    }
                                    TLRPC.User W1 = pg3.D(pc6Var.m0) ? pc6Var.getMessagesController().W1(Long.valueOf(pc6Var.m0)) : null;
                                    Activity parentActivity = pc6Var.getParentActivity();
                                    yb6 yb6Var = new yb6(pc6Var, b9);
                                    nv4 nv4Var = new nv4(pc6Var, W1, (byte) 16);
                                    sb6 sb6Var = new sb6(pc6Var, (byte) 4);
                                    tv8 tv8Var = new tv8(parentActivity);
                                    tv8Var.a = null;
                                    tv8Var.d = -1;
                                    tv8Var.e = false;
                                    tv8Var.f = false;
                                    tv8Var.h = null;
                                    tv8Var.n = new Rect();
                                    tv8Var.x = true;
                                    tv8Var.G = d53.h;
                                    tv8Var.setWillNotDraw(false);
                                    tv8Var.R = sb6Var;
                                    tv8Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                    Rect rect = new Rect();
                                    Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                    anb.x(tv8Var, mutate, cmb.g5, null, PorterDuff.Mode.MULTIPLY);
                                    mutate.getPadding(rect);
                                    int i2 = rect.left;
                                    tv8Var.y = i2;
                                    pv8 pv8Var = new pv8(tv8Var.getContext());
                                    tv8Var.w = pv8Var;
                                    pv8Var.setBackgroundDrawable(mutate);
                                    pv8Var.setPadding(i2, (gm.L(8.0f) + rect.top) - 1, i2, 0);
                                    pv8Var.setVisibility(4);
                                    tv8Var.addView(pv8Var, 0, qoe.e(-1, -2, 80));
                                    jb6.l();
                                    tv8Var.P = jb6.g0.booleanValue();
                                    tv8Var.N = W1;
                                    tv8Var.J = yb6Var;
                                    lp7 lp7Var = new lp7(parentActivity, null);
                                    tv8Var.H = lp7Var;
                                    lp7Var.setTextOffset(gm.L(10.0f));
                                    lp7Var.setItemCount(5);
                                    lp7 lp7Var2 = new lp7(parentActivity, null);
                                    tv8Var.I = lp7Var2;
                                    lp7Var2.setItemCount(5);
                                    lp7Var2.setTextOffset(-gm.L(10.0f));
                                    qv8 qv8Var = new qv8(tv8Var, parentActivity);
                                    tv8Var.Q = qv8Var;
                                    qv8Var.setOrientation(1);
                                    FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                    qv8Var.addView(frameLayout2, qoe.t(-1, -2, 51, 22, 0, 0, 4));
                                    TextView textView2 = new TextView(parentActivity);
                                    textView2.setText(jb6.M0(2131748513, null));
                                    td4.x(textView2, cmb.i5, null, 1, 20.0f);
                                    frameLayout2.addView(textView2, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                    textView2.setOnTouchListener(new w02((byte) 22));
                                    LinearLayout linearLayout = new LinearLayout(parentActivity);
                                    linearLayout.setOrientation(0);
                                    linearLayout.setWeightSum(1.0f);
                                    qv8Var.addView(linearLayout, qoe.o(-1, -2));
                                    System.currentTimeMillis();
                                    FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                    TextView textView3 = new TextView(parentActivity);
                                    tv8Var.L = textView3;
                                    rv8 rv8Var = new rv8(parentActivity);
                                    tv8Var.K = rv8Var;
                                    linearLayout.addView(lp7Var, qoe.l(0.5f, 0, nm7.s4));
                                    lp7Var.setFormatter(new ov8(tv8Var, (byte) 0));
                                    lp7Var.setMinValue(0);
                                    lp7Var.setMaxValue(10);
                                    lp7Var.setWrapSelectorWheel(false);
                                    lp7Var.setTextOffset(gm.L(20.0f));
                                    ov8 ov8Var = new ov8(tv8Var, (byte) 1);
                                    lp7Var.setOnValueChangedListener(ov8Var);
                                    lp7Var2.setMinValue(0);
                                    lp7Var2.setMaxValue(10);
                                    lp7Var2.setWrapSelectorWheel(false);
                                    lp7Var2.setTextOffset(-gm.L(20.0f));
                                    linearLayout.addView(lp7Var2, qoe.l(0.5f, 0, nm7.s4));
                                    lp7Var2.setFormatter(new ov8(tv8Var, (byte) 2));
                                    lp7Var2.setOnValueChangedListener(ov8Var);
                                    lp7Var.setValue(0);
                                    lp7Var2.setValue(6);
                                    qv8Var.addView(frameLayout3, qoe.t(-1, 48, 83, 16, 15, 16, 16));
                                    rv8Var.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                                    rv8Var.setGravity(17);
                                    anb.X(rv8Var, cmb.Ii, null);
                                    rv8Var.setTextSize(1, 14.0f);
                                    rv8Var.setMaxLines(2);
                                    rv8Var.setTypeface(gm.o());
                                    rv8Var.setBackgroundDrawable(ulb.f(cmb.Ei, 4.0f));
                                    frameLayout3.addView(rv8Var, qoe.c(48.0f, -1));
                                    rv8Var.setOnClickListener(new n06(tv8Var, nv4Var, (byte) 26));
                                    textView3.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                                    textView3.setGravity(17);
                                    anb.X(textView3, cmb.p5, null);
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setAlpha(0.0f);
                                    textView3.setScaleX(0.5f);
                                    textView3.setScaleY(0.5f);
                                    frameLayout3.addView(textView3, qoe.c(48.0f, -1));
                                    pv8Var.addView(qv8Var, qoe.e(-1, -2, 51));
                                    pc6Var.O = tv8Var;
                                    ((FrameLayout) pc6Var.fragmentView).addView(tv8Var, qoe.c(-1.0f, -1));
                                    tv8 tv8Var2 = pc6Var.O;
                                    tv8Var2.r = false;
                                    AnimatorSet animatorSet = tv8Var2.s;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        tv8Var2.s = null;
                                    }
                                    pv8 pv8Var2 = tv8Var2.w;
                                    Point point = gm.q;
                                    pv8Var2.measure(View.MeasureSpec.makeMeasureSpec(point.x + (tv8Var2.y << 1), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                                    if (!tv8Var2.r) {
                                        pv8Var2.setVisibility(0);
                                        if (tv8Var2.x) {
                                            tv8Var2.setLayerType(2, null);
                                        }
                                        pv8Var2.setTranslationY(pv8Var2.getMeasuredHeight());
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        tv8Var2.s = animatorSet2;
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(pv8Var2, (Property<pv8, Float>) View.TRANSLATION_Y, 0.0f));
                                        tv8Var2.s.setDuration(400L);
                                        tv8Var2.s.setStartDelay(20L);
                                        tv8Var2.s.setInterpolator(tv8Var2.G);
                                        tv8Var2.s.addListener(new sv8(tv8Var2, b8));
                                        nm7.e().k(99, 512);
                                        tv8Var2.s.start();
                                    }
                                    tv8Var2.c(true);
                                    break;
                                }
                            }
                            break;
                        case 1:
                            try {
                                TLRPC.GeoPoint geoPoint = pc6Var.J0.k.media.geo;
                                double d = geoPoint.lat;
                                double d2 = geoPoint._long;
                                pc6Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                                break;
                            } catch (Exception e3) {
                                fc4.g(e3, true);
                                return;
                            }
                        case 2:
                            byte b10 = pc6Var.N0;
                            Activity parentActivity2 = pc6Var.getParentActivity();
                            if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                                if (pc6Var.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pc6Var.getParentActivity());
                                    int i3 = cmb.K5;
                                    alertDialog$Builder.l(R.raw.permission_request_location, 72, pc6Var.getThemedColor(i3), null);
                                    alertDialog$Builder.m(i3, pc6Var.getResourceProvider());
                                    SpannableStringBuilder S2 = gm.S2(jb6.M0(2131747037, null));
                                    he heVar = alertDialog$Builder.a;
                                    heVar.U = S2;
                                    alertDialog$Builder.g(jb6.M0(2131747033, null), new yb6(pc6Var, b7));
                                    alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                                    pc6Var.showDialog(heVar);
                                    break;
                                }
                            } else if (pc6Var.g0() || b10 == 3) {
                                if ((pc6Var.J0 != null && b10 != 3) || pc6Var.H0 != null) {
                                    if (pc6Var.z0 != null && (s05Var = pc6Var.F) != null) {
                                        s05Var.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(new xj5(pc6Var.z0.getLatitude(), pc6Var.z0.getLongitude()), pc6Var.F.e() - 4.0f));
                                        break;
                                    }
                                } else if (pc6Var.z0 != null && pc6Var.F != null) {
                                    ImageView imageView = pc6Var.a;
                                    int i4 = cmb.lj;
                                    anb.s(imageView, i4, pc6Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                    pc6Var.a.setTag(Integer.valueOf(i4));
                                    pc6Var.Q.L(null);
                                    pc6Var.K0 = false;
                                    pc6Var.F.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(new xj5(pc6Var.z0.getLatitude(), pc6Var.z0.getLongitude())));
                                    break;
                                }
                            }
                            break;
                        default:
                            pc6Var.q0 = -1L;
                            pc6Var.K0 = true;
                            if (pc6Var.m0()) {
                                pc6Var.r0 = true;
                                pc6Var.J0(false, true);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        lka titleTextView = this.simpleActionBar.getTitleTextView();
        if (titleTextView != null) {
            im0 c = getBaseSimpleGlass().c.c(titleTextView, null, false);
            c.p(qqd.l(getResourceProvider()));
            c.r(gm.L(23.0f));
            titleTextView.setBackground(c);
            Paint.FontMetricsInt fontMetricsInt = titleTextView.getTextPaint().getFontMetricsInt();
            int max = Math.max(0, (gm.L(46.0f) - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
            titleTextView.setPadding(gm.L(18.0f), max, gm.L(18.0f), max);
        }
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        F0(imageView);
        this.a.setImageResource(R.drawable.msg_current_location);
        ImageView imageView2 = this.a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.a;
        int i2 = cmb.lj;
        ylb resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView3, i2, resourceProvider, mode);
        this.a.setTag(Integer.valueOf(i2));
        this.a.setContentDescription(jb6.M0(2131754830, null));
        this.Y.addView(this.a, qoe.e(58, 58, 85));
        this.a.setOnClickListener(new View.OnClickListener(this) { // from class: ub6
            public final /* synthetic */ pc6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s05 s05Var;
                byte b6 = b4;
                byte b7 = 4;
                pc6 pc6Var = this.b;
                byte b8 = 1;
                switch (b6) {
                    case 0:
                        if (pc6Var.getParentActivity() != null && pc6Var.z0 != null && pc6Var.g0() && pc6Var.F != null) {
                            hg5 hg5Var = pc6Var.s;
                            if (hg5Var != null) {
                                hg5Var.f(true);
                            }
                            oc7.d1().edit().putInt("proximityhint", 3).commit();
                            cd6 h = pc6Var.getLocationController().h(pc6Var.m0);
                            if (pc6Var.y) {
                                pc6Var.x[0].d(1, true);
                            }
                            if (h != null && h.f > 0) {
                                pc6Var.c.setImageResource(R.drawable.msg_location_alert);
                                mj4 mj4Var = pc6Var.L;
                                if (mj4Var != null) {
                                    mj4Var.y();
                                    pc6Var.L = null;
                                }
                                pc6Var.y = true;
                                pc6Var.r0().k(0L, 25, 0, null, new sb6(pc6Var, (byte) 3), new k16(pc6Var, h, (byte) 14));
                                break;
                            } else {
                                mj4 mj4Var2 = pc6Var.L;
                                byte b9 = 6;
                                if (mj4Var2 == null) {
                                    pc6Var.h0(500);
                                } else {
                                    ti2 ti2Var = (ti2) mj4Var2.b;
                                    ti2Var.getClass();
                                    try {
                                        roe roeVar = (roe) ti2Var.a;
                                        Parcel Q = roeVar.Q(roeVar.R(), 6);
                                        double readDouble = Q.readDouble();
                                        Q.recycle();
                                        pc6Var.M = readDouble;
                                    } catch (RemoteException e2) {
                                        i2d.h(e2);
                                        return;
                                    }
                                }
                                TLRPC.User W1 = pg3.D(pc6Var.m0) ? pc6Var.getMessagesController().W1(Long.valueOf(pc6Var.m0)) : null;
                                Activity parentActivity = pc6Var.getParentActivity();
                                yb6 yb6Var = new yb6(pc6Var, b9);
                                nv4 nv4Var = new nv4(pc6Var, W1, (byte) 16);
                                sb6 sb6Var = new sb6(pc6Var, (byte) 4);
                                tv8 tv8Var = new tv8(parentActivity);
                                tv8Var.a = null;
                                tv8Var.d = -1;
                                tv8Var.e = false;
                                tv8Var.f = false;
                                tv8Var.h = null;
                                tv8Var.n = new Rect();
                                tv8Var.x = true;
                                tv8Var.G = d53.h;
                                tv8Var.setWillNotDraw(false);
                                tv8Var.R = sb6Var;
                                tv8Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect = new Rect();
                                Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                anb.x(tv8Var, mutate, cmb.g5, null, PorterDuff.Mode.MULTIPLY);
                                mutate.getPadding(rect);
                                int i22 = rect.left;
                                tv8Var.y = i22;
                                pv8 pv8Var = new pv8(tv8Var.getContext());
                                tv8Var.w = pv8Var;
                                pv8Var.setBackgroundDrawable(mutate);
                                pv8Var.setPadding(i22, (gm.L(8.0f) + rect.top) - 1, i22, 0);
                                pv8Var.setVisibility(4);
                                tv8Var.addView(pv8Var, 0, qoe.e(-1, -2, 80));
                                jb6.l();
                                tv8Var.P = jb6.g0.booleanValue();
                                tv8Var.N = W1;
                                tv8Var.J = yb6Var;
                                lp7 lp7Var = new lp7(parentActivity, null);
                                tv8Var.H = lp7Var;
                                lp7Var.setTextOffset(gm.L(10.0f));
                                lp7Var.setItemCount(5);
                                lp7 lp7Var2 = new lp7(parentActivity, null);
                                tv8Var.I = lp7Var2;
                                lp7Var2.setItemCount(5);
                                lp7Var2.setTextOffset(-gm.L(10.0f));
                                qv8 qv8Var = new qv8(tv8Var, parentActivity);
                                tv8Var.Q = qv8Var;
                                qv8Var.setOrientation(1);
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                qv8Var.addView(frameLayout2, qoe.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView2 = new TextView(parentActivity);
                                textView2.setText(jb6.M0(2131748513, null));
                                td4.x(textView2, cmb.i5, null, 1, 20.0f);
                                frameLayout2.addView(textView2, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView2.setOnTouchListener(new w02((byte) 22));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                qv8Var.addView(linearLayout, qoe.o(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                TextView textView3 = new TextView(parentActivity);
                                tv8Var.L = textView3;
                                rv8 rv8Var = new rv8(parentActivity);
                                tv8Var.K = rv8Var;
                                linearLayout.addView(lp7Var, qoe.l(0.5f, 0, nm7.s4));
                                lp7Var.setFormatter(new ov8(tv8Var, (byte) 0));
                                lp7Var.setMinValue(0);
                                lp7Var.setMaxValue(10);
                                lp7Var.setWrapSelectorWheel(false);
                                lp7Var.setTextOffset(gm.L(20.0f));
                                ov8 ov8Var = new ov8(tv8Var, (byte) 1);
                                lp7Var.setOnValueChangedListener(ov8Var);
                                lp7Var2.setMinValue(0);
                                lp7Var2.setMaxValue(10);
                                lp7Var2.setWrapSelectorWheel(false);
                                lp7Var2.setTextOffset(-gm.L(20.0f));
                                linearLayout.addView(lp7Var2, qoe.l(0.5f, 0, nm7.s4));
                                lp7Var2.setFormatter(new ov8(tv8Var, (byte) 2));
                                lp7Var2.setOnValueChangedListener(ov8Var);
                                lp7Var.setValue(0);
                                lp7Var2.setValue(6);
                                qv8Var.addView(frameLayout3, qoe.t(-1, 48, 83, 16, 15, 16, 16));
                                rv8Var.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                                rv8Var.setGravity(17);
                                anb.X(rv8Var, cmb.Ii, null);
                                rv8Var.setTextSize(1, 14.0f);
                                rv8Var.setMaxLines(2);
                                rv8Var.setTypeface(gm.o());
                                rv8Var.setBackgroundDrawable(ulb.f(cmb.Ei, 4.0f));
                                frameLayout3.addView(rv8Var, qoe.c(48.0f, -1));
                                rv8Var.setOnClickListener(new n06(tv8Var, nv4Var, (byte) 26));
                                textView3.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                                textView3.setGravity(17);
                                anb.X(textView3, cmb.p5, null);
                                textView3.setTextSize(1, 14.0f);
                                textView3.setAlpha(0.0f);
                                textView3.setScaleX(0.5f);
                                textView3.setScaleY(0.5f);
                                frameLayout3.addView(textView3, qoe.c(48.0f, -1));
                                pv8Var.addView(qv8Var, qoe.e(-1, -2, 51));
                                pc6Var.O = tv8Var;
                                ((FrameLayout) pc6Var.fragmentView).addView(tv8Var, qoe.c(-1.0f, -1));
                                tv8 tv8Var2 = pc6Var.O;
                                tv8Var2.r = false;
                                AnimatorSet animatorSet = tv8Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    tv8Var2.s = null;
                                }
                                pv8 pv8Var2 = tv8Var2.w;
                                Point point = gm.q;
                                pv8Var2.measure(View.MeasureSpec.makeMeasureSpec(point.x + (tv8Var2.y << 1), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                                if (!tv8Var2.r) {
                                    pv8Var2.setVisibility(0);
                                    if (tv8Var2.x) {
                                        tv8Var2.setLayerType(2, null);
                                    }
                                    pv8Var2.setTranslationY(pv8Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    tv8Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(pv8Var2, (Property<pv8, Float>) View.TRANSLATION_Y, 0.0f));
                                    tv8Var2.s.setDuration(400L);
                                    tv8Var2.s.setStartDelay(20L);
                                    tv8Var2.s.setInterpolator(tv8Var2.G);
                                    tv8Var2.s.addListener(new sv8(tv8Var2, b8));
                                    nm7.e().k(99, 512);
                                    tv8Var2.s.start();
                                }
                                tv8Var2.c(true);
                                break;
                            }
                        }
                        break;
                    case 1:
                        try {
                            TLRPC.GeoPoint geoPoint = pc6Var.J0.k.media.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            pc6Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                            break;
                        } catch (Exception e3) {
                            fc4.g(e3, true);
                            return;
                        }
                    case 2:
                        byte b10 = pc6Var.N0;
                        Activity parentActivity2 = pc6Var.getParentActivity();
                        if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (pc6Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pc6Var.getParentActivity());
                                int i3 = cmb.K5;
                                alertDialog$Builder.l(R.raw.permission_request_location, 72, pc6Var.getThemedColor(i3), null);
                                alertDialog$Builder.m(i3, pc6Var.getResourceProvider());
                                SpannableStringBuilder S2 = gm.S2(jb6.M0(2131747037, null));
                                he heVar = alertDialog$Builder.a;
                                heVar.U = S2;
                                alertDialog$Builder.g(jb6.M0(2131747033, null), new yb6(pc6Var, b7));
                                alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                                pc6Var.showDialog(heVar);
                                break;
                            }
                        } else if (pc6Var.g0() || b10 == 3) {
                            if ((pc6Var.J0 != null && b10 != 3) || pc6Var.H0 != null) {
                                if (pc6Var.z0 != null && (s05Var = pc6Var.F) != null) {
                                    s05Var.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(new xj5(pc6Var.z0.getLatitude(), pc6Var.z0.getLongitude()), pc6Var.F.e() - 4.0f));
                                    break;
                                }
                            } else if (pc6Var.z0 != null && pc6Var.F != null) {
                                ImageView imageView4 = pc6Var.a;
                                int i4 = cmb.lj;
                                anb.s(imageView4, i4, pc6Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                pc6Var.a.setTag(Integer.valueOf(i4));
                                pc6Var.Q.L(null);
                                pc6Var.K0 = false;
                                pc6Var.F.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(new xj5(pc6Var.z0.getLatitude(), pc6Var.z0.getLongitude())));
                                break;
                            }
                        }
                        break;
                    default:
                        pc6Var.q0 = -1L;
                        pc6Var.K0 = true;
                        if (pc6Var.m0()) {
                            pc6Var.r0 = true;
                            pc6Var.J0(false, true);
                            break;
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
        anb.X(this.b, cmb.Ei, this.resourceProvider);
        this.b.setTypeface(gm.o());
        this.b.setPadding(gm.L(22.0f), 0, gm.L(22.0f), 0);
        this.b.setText(jb6.M0(2131748501, null));
        this.Y.addView(this.b, qoe.e(-2, 58, 81));
        final byte b6 = 3;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: ub6
            public final /* synthetic */ pc6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s05 s05Var;
                byte b62 = b6;
                byte b7 = 4;
                pc6 pc6Var = this.b;
                byte b8 = 1;
                switch (b62) {
                    case 0:
                        if (pc6Var.getParentActivity() != null && pc6Var.z0 != null && pc6Var.g0() && pc6Var.F != null) {
                            hg5 hg5Var = pc6Var.s;
                            if (hg5Var != null) {
                                hg5Var.f(true);
                            }
                            oc7.d1().edit().putInt("proximityhint", 3).commit();
                            cd6 h = pc6Var.getLocationController().h(pc6Var.m0);
                            if (pc6Var.y) {
                                pc6Var.x[0].d(1, true);
                            }
                            if (h != null && h.f > 0) {
                                pc6Var.c.setImageResource(R.drawable.msg_location_alert);
                                mj4 mj4Var = pc6Var.L;
                                if (mj4Var != null) {
                                    mj4Var.y();
                                    pc6Var.L = null;
                                }
                                pc6Var.y = true;
                                pc6Var.r0().k(0L, 25, 0, null, new sb6(pc6Var, (byte) 3), new k16(pc6Var, h, (byte) 14));
                                break;
                            } else {
                                mj4 mj4Var2 = pc6Var.L;
                                byte b9 = 6;
                                if (mj4Var2 == null) {
                                    pc6Var.h0(500);
                                } else {
                                    ti2 ti2Var = (ti2) mj4Var2.b;
                                    ti2Var.getClass();
                                    try {
                                        roe roeVar = (roe) ti2Var.a;
                                        Parcel Q = roeVar.Q(roeVar.R(), 6);
                                        double readDouble = Q.readDouble();
                                        Q.recycle();
                                        pc6Var.M = readDouble;
                                    } catch (RemoteException e2) {
                                        i2d.h(e2);
                                        return;
                                    }
                                }
                                TLRPC.User W1 = pg3.D(pc6Var.m0) ? pc6Var.getMessagesController().W1(Long.valueOf(pc6Var.m0)) : null;
                                Activity parentActivity = pc6Var.getParentActivity();
                                yb6 yb6Var = new yb6(pc6Var, b9);
                                nv4 nv4Var = new nv4(pc6Var, W1, (byte) 16);
                                sb6 sb6Var = new sb6(pc6Var, (byte) 4);
                                tv8 tv8Var = new tv8(parentActivity);
                                tv8Var.a = null;
                                tv8Var.d = -1;
                                tv8Var.e = false;
                                tv8Var.f = false;
                                tv8Var.h = null;
                                tv8Var.n = new Rect();
                                tv8Var.x = true;
                                tv8Var.G = d53.h;
                                tv8Var.setWillNotDraw(false);
                                tv8Var.R = sb6Var;
                                tv8Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect = new Rect();
                                Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                anb.x(tv8Var, mutate, cmb.g5, null, PorterDuff.Mode.MULTIPLY);
                                mutate.getPadding(rect);
                                int i22 = rect.left;
                                tv8Var.y = i22;
                                pv8 pv8Var = new pv8(tv8Var.getContext());
                                tv8Var.w = pv8Var;
                                pv8Var.setBackgroundDrawable(mutate);
                                pv8Var.setPadding(i22, (gm.L(8.0f) + rect.top) - 1, i22, 0);
                                pv8Var.setVisibility(4);
                                tv8Var.addView(pv8Var, 0, qoe.e(-1, -2, 80));
                                jb6.l();
                                tv8Var.P = jb6.g0.booleanValue();
                                tv8Var.N = W1;
                                tv8Var.J = yb6Var;
                                lp7 lp7Var = new lp7(parentActivity, null);
                                tv8Var.H = lp7Var;
                                lp7Var.setTextOffset(gm.L(10.0f));
                                lp7Var.setItemCount(5);
                                lp7 lp7Var2 = new lp7(parentActivity, null);
                                tv8Var.I = lp7Var2;
                                lp7Var2.setItemCount(5);
                                lp7Var2.setTextOffset(-gm.L(10.0f));
                                qv8 qv8Var = new qv8(tv8Var, parentActivity);
                                tv8Var.Q = qv8Var;
                                qv8Var.setOrientation(1);
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                qv8Var.addView(frameLayout2, qoe.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView22 = new TextView(parentActivity);
                                textView22.setText(jb6.M0(2131748513, null));
                                td4.x(textView22, cmb.i5, null, 1, 20.0f);
                                frameLayout2.addView(textView22, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView22.setOnTouchListener(new w02((byte) 22));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                qv8Var.addView(linearLayout, qoe.o(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                TextView textView3 = new TextView(parentActivity);
                                tv8Var.L = textView3;
                                rv8 rv8Var = new rv8(parentActivity);
                                tv8Var.K = rv8Var;
                                linearLayout.addView(lp7Var, qoe.l(0.5f, 0, nm7.s4));
                                lp7Var.setFormatter(new ov8(tv8Var, (byte) 0));
                                lp7Var.setMinValue(0);
                                lp7Var.setMaxValue(10);
                                lp7Var.setWrapSelectorWheel(false);
                                lp7Var.setTextOffset(gm.L(20.0f));
                                ov8 ov8Var = new ov8(tv8Var, (byte) 1);
                                lp7Var.setOnValueChangedListener(ov8Var);
                                lp7Var2.setMinValue(0);
                                lp7Var2.setMaxValue(10);
                                lp7Var2.setWrapSelectorWheel(false);
                                lp7Var2.setTextOffset(-gm.L(20.0f));
                                linearLayout.addView(lp7Var2, qoe.l(0.5f, 0, nm7.s4));
                                lp7Var2.setFormatter(new ov8(tv8Var, (byte) 2));
                                lp7Var2.setOnValueChangedListener(ov8Var);
                                lp7Var.setValue(0);
                                lp7Var2.setValue(6);
                                qv8Var.addView(frameLayout3, qoe.t(-1, 48, 83, 16, 15, 16, 16));
                                rv8Var.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                                rv8Var.setGravity(17);
                                anb.X(rv8Var, cmb.Ii, null);
                                rv8Var.setTextSize(1, 14.0f);
                                rv8Var.setMaxLines(2);
                                rv8Var.setTypeface(gm.o());
                                rv8Var.setBackgroundDrawable(ulb.f(cmb.Ei, 4.0f));
                                frameLayout3.addView(rv8Var, qoe.c(48.0f, -1));
                                rv8Var.setOnClickListener(new n06(tv8Var, nv4Var, (byte) 26));
                                textView3.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                                textView3.setGravity(17);
                                anb.X(textView3, cmb.p5, null);
                                textView3.setTextSize(1, 14.0f);
                                textView3.setAlpha(0.0f);
                                textView3.setScaleX(0.5f);
                                textView3.setScaleY(0.5f);
                                frameLayout3.addView(textView3, qoe.c(48.0f, -1));
                                pv8Var.addView(qv8Var, qoe.e(-1, -2, 51));
                                pc6Var.O = tv8Var;
                                ((FrameLayout) pc6Var.fragmentView).addView(tv8Var, qoe.c(-1.0f, -1));
                                tv8 tv8Var2 = pc6Var.O;
                                tv8Var2.r = false;
                                AnimatorSet animatorSet = tv8Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    tv8Var2.s = null;
                                }
                                pv8 pv8Var2 = tv8Var2.w;
                                Point point = gm.q;
                                pv8Var2.measure(View.MeasureSpec.makeMeasureSpec(point.x + (tv8Var2.y << 1), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                                if (!tv8Var2.r) {
                                    pv8Var2.setVisibility(0);
                                    if (tv8Var2.x) {
                                        tv8Var2.setLayerType(2, null);
                                    }
                                    pv8Var2.setTranslationY(pv8Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    tv8Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(pv8Var2, (Property<pv8, Float>) View.TRANSLATION_Y, 0.0f));
                                    tv8Var2.s.setDuration(400L);
                                    tv8Var2.s.setStartDelay(20L);
                                    tv8Var2.s.setInterpolator(tv8Var2.G);
                                    tv8Var2.s.addListener(new sv8(tv8Var2, b8));
                                    nm7.e().k(99, 512);
                                    tv8Var2.s.start();
                                }
                                tv8Var2.c(true);
                                break;
                            }
                        }
                        break;
                    case 1:
                        try {
                            TLRPC.GeoPoint geoPoint = pc6Var.J0.k.media.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            pc6Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                            break;
                        } catch (Exception e3) {
                            fc4.g(e3, true);
                            return;
                        }
                    case 2:
                        byte b10 = pc6Var.N0;
                        Activity parentActivity2 = pc6Var.getParentActivity();
                        if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (pc6Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pc6Var.getParentActivity());
                                int i3 = cmb.K5;
                                alertDialog$Builder.l(R.raw.permission_request_location, 72, pc6Var.getThemedColor(i3), null);
                                alertDialog$Builder.m(i3, pc6Var.getResourceProvider());
                                SpannableStringBuilder S2 = gm.S2(jb6.M0(2131747037, null));
                                he heVar = alertDialog$Builder.a;
                                heVar.U = S2;
                                alertDialog$Builder.g(jb6.M0(2131747033, null), new yb6(pc6Var, b7));
                                alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                                pc6Var.showDialog(heVar);
                                break;
                            }
                        } else if (pc6Var.g0() || b10 == 3) {
                            if ((pc6Var.J0 != null && b10 != 3) || pc6Var.H0 != null) {
                                if (pc6Var.z0 != null && (s05Var = pc6Var.F) != null) {
                                    s05Var.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(new xj5(pc6Var.z0.getLatitude(), pc6Var.z0.getLongitude()), pc6Var.F.e() - 4.0f));
                                    break;
                                }
                            } else if (pc6Var.z0 != null && pc6Var.F != null) {
                                ImageView imageView4 = pc6Var.a;
                                int i4 = cmb.lj;
                                anb.s(imageView4, i4, pc6Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                pc6Var.a.setTag(Integer.valueOf(i4));
                                pc6Var.Q.L(null);
                                pc6Var.K0 = false;
                                pc6Var.F.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(new xj5(pc6Var.z0.getLatitude(), pc6Var.z0.getLongitude())));
                                break;
                            }
                        }
                        break;
                    default:
                        pc6Var.q0 = -1L;
                        pc6Var.K0 = true;
                        if (pc6Var.m0()) {
                            pc6Var.r0 = true;
                            pc6Var.J0(false, true);
                            break;
                        }
                        break;
                }
            }
        });
        J0(false, false);
        ImageView imageView4 = new ImageView(context);
        this.c = imageView4;
        F0(imageView4);
        anb.s(this.c, cmb.kj, getResourceProvider(), mode);
        this.c.setScaleType(scaleType);
        this.c.setContentDescription(jb6.M0(2131754846, null));
        this.X.addView(this.c, qoe.e(58, 58, 53));
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: ub6
            public final /* synthetic */ pc6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s05 s05Var;
                byte b62 = b2;
                byte b7 = 4;
                pc6 pc6Var = this.b;
                byte b8 = 1;
                switch (b62) {
                    case 0:
                        if (pc6Var.getParentActivity() != null && pc6Var.z0 != null && pc6Var.g0() && pc6Var.F != null) {
                            hg5 hg5Var = pc6Var.s;
                            if (hg5Var != null) {
                                hg5Var.f(true);
                            }
                            oc7.d1().edit().putInt("proximityhint", 3).commit();
                            cd6 h = pc6Var.getLocationController().h(pc6Var.m0);
                            if (pc6Var.y) {
                                pc6Var.x[0].d(1, true);
                            }
                            if (h != null && h.f > 0) {
                                pc6Var.c.setImageResource(R.drawable.msg_location_alert);
                                mj4 mj4Var = pc6Var.L;
                                if (mj4Var != null) {
                                    mj4Var.y();
                                    pc6Var.L = null;
                                }
                                pc6Var.y = true;
                                pc6Var.r0().k(0L, 25, 0, null, new sb6(pc6Var, (byte) 3), new k16(pc6Var, h, (byte) 14));
                                break;
                            } else {
                                mj4 mj4Var2 = pc6Var.L;
                                byte b9 = 6;
                                if (mj4Var2 == null) {
                                    pc6Var.h0(500);
                                } else {
                                    ti2 ti2Var = (ti2) mj4Var2.b;
                                    ti2Var.getClass();
                                    try {
                                        roe roeVar = (roe) ti2Var.a;
                                        Parcel Q = roeVar.Q(roeVar.R(), 6);
                                        double readDouble = Q.readDouble();
                                        Q.recycle();
                                        pc6Var.M = readDouble;
                                    } catch (RemoteException e2) {
                                        i2d.h(e2);
                                        return;
                                    }
                                }
                                TLRPC.User W1 = pg3.D(pc6Var.m0) ? pc6Var.getMessagesController().W1(Long.valueOf(pc6Var.m0)) : null;
                                Activity parentActivity = pc6Var.getParentActivity();
                                yb6 yb6Var = new yb6(pc6Var, b9);
                                nv4 nv4Var = new nv4(pc6Var, W1, (byte) 16);
                                sb6 sb6Var = new sb6(pc6Var, (byte) 4);
                                tv8 tv8Var = new tv8(parentActivity);
                                tv8Var.a = null;
                                tv8Var.d = -1;
                                tv8Var.e = false;
                                tv8Var.f = false;
                                tv8Var.h = null;
                                tv8Var.n = new Rect();
                                tv8Var.x = true;
                                tv8Var.G = d53.h;
                                tv8Var.setWillNotDraw(false);
                                tv8Var.R = sb6Var;
                                tv8Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect = new Rect();
                                Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                anb.x(tv8Var, mutate, cmb.g5, null, PorterDuff.Mode.MULTIPLY);
                                mutate.getPadding(rect);
                                int i22 = rect.left;
                                tv8Var.y = i22;
                                pv8 pv8Var = new pv8(tv8Var.getContext());
                                tv8Var.w = pv8Var;
                                pv8Var.setBackgroundDrawable(mutate);
                                pv8Var.setPadding(i22, (gm.L(8.0f) + rect.top) - 1, i22, 0);
                                pv8Var.setVisibility(4);
                                tv8Var.addView(pv8Var, 0, qoe.e(-1, -2, 80));
                                jb6.l();
                                tv8Var.P = jb6.g0.booleanValue();
                                tv8Var.N = W1;
                                tv8Var.J = yb6Var;
                                lp7 lp7Var = new lp7(parentActivity, null);
                                tv8Var.H = lp7Var;
                                lp7Var.setTextOffset(gm.L(10.0f));
                                lp7Var.setItemCount(5);
                                lp7 lp7Var2 = new lp7(parentActivity, null);
                                tv8Var.I = lp7Var2;
                                lp7Var2.setItemCount(5);
                                lp7Var2.setTextOffset(-gm.L(10.0f));
                                qv8 qv8Var = new qv8(tv8Var, parentActivity);
                                tv8Var.Q = qv8Var;
                                qv8Var.setOrientation(1);
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                qv8Var.addView(frameLayout2, qoe.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView22 = new TextView(parentActivity);
                                textView22.setText(jb6.M0(2131748513, null));
                                td4.x(textView22, cmb.i5, null, 1, 20.0f);
                                frameLayout2.addView(textView22, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView22.setOnTouchListener(new w02((byte) 22));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                qv8Var.addView(linearLayout, qoe.o(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                TextView textView3 = new TextView(parentActivity);
                                tv8Var.L = textView3;
                                rv8 rv8Var = new rv8(parentActivity);
                                tv8Var.K = rv8Var;
                                linearLayout.addView(lp7Var, qoe.l(0.5f, 0, nm7.s4));
                                lp7Var.setFormatter(new ov8(tv8Var, (byte) 0));
                                lp7Var.setMinValue(0);
                                lp7Var.setMaxValue(10);
                                lp7Var.setWrapSelectorWheel(false);
                                lp7Var.setTextOffset(gm.L(20.0f));
                                ov8 ov8Var = new ov8(tv8Var, (byte) 1);
                                lp7Var.setOnValueChangedListener(ov8Var);
                                lp7Var2.setMinValue(0);
                                lp7Var2.setMaxValue(10);
                                lp7Var2.setWrapSelectorWheel(false);
                                lp7Var2.setTextOffset(-gm.L(20.0f));
                                linearLayout.addView(lp7Var2, qoe.l(0.5f, 0, nm7.s4));
                                lp7Var2.setFormatter(new ov8(tv8Var, (byte) 2));
                                lp7Var2.setOnValueChangedListener(ov8Var);
                                lp7Var.setValue(0);
                                lp7Var2.setValue(6);
                                qv8Var.addView(frameLayout3, qoe.t(-1, 48, 83, 16, 15, 16, 16));
                                rv8Var.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                                rv8Var.setGravity(17);
                                anb.X(rv8Var, cmb.Ii, null);
                                rv8Var.setTextSize(1, 14.0f);
                                rv8Var.setMaxLines(2);
                                rv8Var.setTypeface(gm.o());
                                rv8Var.setBackgroundDrawable(ulb.f(cmb.Ei, 4.0f));
                                frameLayout3.addView(rv8Var, qoe.c(48.0f, -1));
                                rv8Var.setOnClickListener(new n06(tv8Var, nv4Var, (byte) 26));
                                textView3.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                                textView3.setGravity(17);
                                anb.X(textView3, cmb.p5, null);
                                textView3.setTextSize(1, 14.0f);
                                textView3.setAlpha(0.0f);
                                textView3.setScaleX(0.5f);
                                textView3.setScaleY(0.5f);
                                frameLayout3.addView(textView3, qoe.c(48.0f, -1));
                                pv8Var.addView(qv8Var, qoe.e(-1, -2, 51));
                                pc6Var.O = tv8Var;
                                ((FrameLayout) pc6Var.fragmentView).addView(tv8Var, qoe.c(-1.0f, -1));
                                tv8 tv8Var2 = pc6Var.O;
                                tv8Var2.r = false;
                                AnimatorSet animatorSet = tv8Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    tv8Var2.s = null;
                                }
                                pv8 pv8Var2 = tv8Var2.w;
                                Point point = gm.q;
                                pv8Var2.measure(View.MeasureSpec.makeMeasureSpec(point.x + (tv8Var2.y << 1), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                                if (!tv8Var2.r) {
                                    pv8Var2.setVisibility(0);
                                    if (tv8Var2.x) {
                                        tv8Var2.setLayerType(2, null);
                                    }
                                    pv8Var2.setTranslationY(pv8Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    tv8Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(pv8Var2, (Property<pv8, Float>) View.TRANSLATION_Y, 0.0f));
                                    tv8Var2.s.setDuration(400L);
                                    tv8Var2.s.setStartDelay(20L);
                                    tv8Var2.s.setInterpolator(tv8Var2.G);
                                    tv8Var2.s.addListener(new sv8(tv8Var2, b8));
                                    nm7.e().k(99, 512);
                                    tv8Var2.s.start();
                                }
                                tv8Var2.c(true);
                                break;
                            }
                        }
                        break;
                    case 1:
                        try {
                            TLRPC.GeoPoint geoPoint = pc6Var.J0.k.media.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            pc6Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                            break;
                        } catch (Exception e3) {
                            fc4.g(e3, true);
                            return;
                        }
                    case 2:
                        byte b10 = pc6Var.N0;
                        Activity parentActivity2 = pc6Var.getParentActivity();
                        if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (pc6Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pc6Var.getParentActivity());
                                int i3 = cmb.K5;
                                alertDialog$Builder.l(R.raw.permission_request_location, 72, pc6Var.getThemedColor(i3), null);
                                alertDialog$Builder.m(i3, pc6Var.getResourceProvider());
                                SpannableStringBuilder S2 = gm.S2(jb6.M0(2131747037, null));
                                he heVar = alertDialog$Builder.a;
                                heVar.U = S2;
                                alertDialog$Builder.g(jb6.M0(2131747033, null), new yb6(pc6Var, b7));
                                alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                                pc6Var.showDialog(heVar);
                                break;
                            }
                        } else if (pc6Var.g0() || b10 == 3) {
                            if ((pc6Var.J0 != null && b10 != 3) || pc6Var.H0 != null) {
                                if (pc6Var.z0 != null && (s05Var = pc6Var.F) != null) {
                                    s05Var.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(new xj5(pc6Var.z0.getLatitude(), pc6Var.z0.getLongitude()), pc6Var.F.e() - 4.0f));
                                    break;
                                }
                            } else if (pc6Var.z0 != null && pc6Var.F != null) {
                                ImageView imageView42 = pc6Var.a;
                                int i4 = cmb.lj;
                                anb.s(imageView42, i4, pc6Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                pc6Var.a.setTag(Integer.valueOf(i4));
                                pc6Var.Q.L(null);
                                pc6Var.K0 = false;
                                pc6Var.F.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(new xj5(pc6Var.z0.getLatitude(), pc6Var.z0.getLongitude())));
                                break;
                            }
                        }
                        break;
                    default:
                        pc6Var.q0 = -1L;
                        pc6Var.K0 = true;
                        if (pc6Var.m0()) {
                            pc6Var.r0 = true;
                            pc6Var.J0(false, true);
                            break;
                        }
                        break;
                }
            }
        });
        TLRPC.Chat L0 = pg3.y(this.m0) ? getMessagesController().L0(Long.valueOf(-this.m0)) : null;
        k47 k47Var4 = this.J0;
        if (k47Var4 != null && k47Var4.C3()) {
            k47 k47Var5 = this.J0;
            int currentTime = getConnectionsManager().getCurrentTime();
            TLRPC.Message message2 = k47Var5.k;
            if (message2.date + k47.n1(message2).period > currentTime && (!sd2.T(L0) || L0.megagroup)) {
                cd6 h = getLocationController().h(this.m0);
                if (h == null || h.f <= 0) {
                    if (pg3.D(this.m0) && this.J0.Z0() == getUserConfig().e()) {
                        this.c.setVisibility(4);
                        this.c.setAlpha(0.0f);
                        this.c.setScaleX(0.4f);
                        this.c.setScaleY(0.4f);
                    }
                    this.c.setImageResource(R.drawable.msg_location_alert);
                } else {
                    this.c.setImageResource(R.drawable.msg_location_alert2);
                }
                hg5 hg5Var = new hg5(context, 1);
                this.s = hg5Var;
                hg5Var.setLayerType(2, null);
                hg5 hg5Var2 = this.s;
                hg5Var2.d = 4000L;
                hg5Var2.n(1.0f, -21.0f);
                this.s.setPadding(0, gm.L(4.0f), 0, 0);
                this.s.k(getBaseSimpleGlass().c);
                this.X.addView(this.s, qoe.d(-1, -2.0f, 51, 8.0f, 56.0f, 8.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.e = linearLayout;
                linearLayout.setOrientation(1);
                this.e.setGravity(1);
                this.e.setPadding(0, gm.L(160.0f), 0, 0);
                this.e.setVisibility(8);
                nc6Var.addView(this.e, qoe.c(-1.0f, -1));
                this.e.setOnTouchListener(new w02((byte) 13));
                ImageView imageView5 = new ImageView(context);
                this.f = imageView5;
                imageView5.setImageResource(R.drawable.location_empty);
                anb.s(this.f, cmb.V5, getResourceProvider(), mode);
                this.e.addView(this.f, qoe.o(-2, -2));
                TextView textView3 = new TextView(context);
                this.h = textView3;
                int i3 = cmb.W5;
                anb.X(textView3, i3, getResourceProvider());
                this.h.setGravity(17);
                this.h.setTypeface(gm.o());
                this.h.setTextSize(1, 17.0f);
                this.h.setText(jb6.M0(2131747913, null));
                TextView m = wi8.m(this.e, this.h, qoe.t(-2, -2, 17, 0, 11, 0, 0), context);
                this.n = m;
                anb.X(m, i3, getResourceProvider());
                this.n.setGravity(17);
                this.n.setTextSize(1, 15.0f);
                this.n.setPadding(gm.L(40.0f), 0, gm.L(40.0f), 0);
                this.e.addView(this.n, qoe.t(-2, -2, 17, 0, 6, 0, 0));
                this.R = new fv((byte) 25, context, (Object) this);
                im0 c2 = getBaseSimpleGlass().f.c(this.R, null, false);
                nm0 nm0Var = new nm0(getResourceProvider());
                nm0Var.e = new w00((byte) 18);
                nm0Var.f(-1, 553648127);
                nm0Var.e(0, 0);
                nm0Var.d(372454195, 0);
                float N = gm.N(8.0f);
                float f = -gm.N(0.6666667f);
                nm0Var.n = N;
                nm0Var.r = f;
                nm0Var.f = gm.N(0.55f);
                nm0Var.h = 0.0f;
                c2.p(nm0Var);
                c2.s(gm.L(29.0f), gm.L(29.0f), 0.0f, 0.0f);
                c2.q(gm.L(12.0f));
                this.Z = c2;
                fv fvVar = this.R;
                fc6 fc6Var2 = new fc6(this, context, this.N0, this.m0, getResourceProvider(), this.w, b5 != 8);
                this.Q = fc6Var2;
                fvVar.setAdapter(fc6Var2);
                fv fvVar2 = this.R;
                u46 u46Var = new u46(1, false);
                this.V = u46Var;
                fvVar2.setLayoutManager(u46Var);
                if (this.T0 == null) {
                    this.S0 = new l55(context, this.resourceProvider);
                    ic6 ic6Var = new ic6(this, context, new fha(this), this, new hc6(this), getResourceProvider());
                    this.R0 = ic6Var;
                    anb.h(i, getResourceProvider(), ic6Var);
                    this.R0.addView(this.S0, qoe.e(-1, 32, 55));
                    this.Q.Z = this.R0;
                    this.R.setOverScrollMode(2);
                    sc3 sc3Var = new sc3();
                    z = false;
                    sc3Var.m = false;
                    sc3Var.C = false;
                    sc3Var.o(d53.h);
                    sc3Var.n(350L);
                    this.R.setItemAnimator(sc3Var);
                } else {
                    z = false;
                }
                this.Q.O(this.k0, z);
                this.Q.getClass();
                this.R.setVerticalScrollBarEnabled(z);
                nc6Var.addView(this.R, qoe.e(-1, -1, 51));
                k47Var = this.J0;
                if (k47Var != null && (message = k47Var.k) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
                    fc6 fc6Var3 = this.Q;
                    fc6Var3.I = this.J0.k.media.address;
                    fc6Var3.Q();
                }
                this.R.setOnScrollListener(new cc6(this, b3));
                final byte b7 = 0;
                ((sc3) this.R.getItemAnimator()).C = false;
                this.R.setOnItemLongClickListener(new nv4(this, context, (byte) 14));
                this.R.setOnItemClickListener(new f59(this) { // from class: xb6
                    public final /* synthetic */ pc6 b;

                    {
                        this.b = this;
                    }

                    @Override // f59
                    public final void g(int i4, View view) {
                        k47 k47Var6;
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                        byte b8 = b7;
                        pc6 pc6Var = this.b;
                        switch (b8) {
                            case 0:
                                pc6Var.q0 = -1L;
                                byte b9 = pc6Var.N0;
                                byte b10 = 7;
                                byte b11 = 6;
                                if (b9 != 4) {
                                    if (b9 != 5) {
                                        if (i4 == 1 && (k47Var6 = pc6Var.J0) != null && (!k47Var6.C3() || b9 == 6)) {
                                            s05 s05Var = pc6Var.F;
                                            if (s05Var != null) {
                                                IMapsProvider j = org.telegram.messenger.a.j();
                                                TLRPC.GeoPoint geoPoint = pc6Var.J0.k.media.geo;
                                                s05Var.b(((k1f) j).newCameraUpdateLatLngZoom(new xj5(geoPoint.lat, geoPoint._long), pc6Var.F.e() - 4.0f));
                                                break;
                                            }
                                        } else if (i4 == 1 && b9 != 2) {
                                            if (pc6Var.M0 != null && pc6Var.A0 != null) {
                                                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                                tL_messageMediaGeo.geo = tL_geoPoint;
                                                tL_geoPoint.lat = gm.b0(pc6Var.A0.getLatitude());
                                                tL_messageMediaGeo.geo._long = gm.b0(pc6Var.A0.getLongitude());
                                                pc6Var.M0.b(tL_messageMediaGeo, pc6Var.N0, true, 0, 0L);
                                                pc6Var.finishFragment();
                                                break;
                                            }
                                        } else if (b9 != 2 || !pc6Var.getLocationController().i(pc6Var.m0) || pc6Var.Q.d(i4) != 7) {
                                            if (b9 != 2 || !pc6Var.getLocationController().i(pc6Var.m0) || pc6Var.Q.d(i4) != 6) {
                                                if ((i4 != 2 || b9 != 1) && ((i4 != 1 || b9 != 2) && (i4 != 3 || b9 != 3))) {
                                                    Object I = pc6Var.Q.I(i4);
                                                    if (!(I instanceof TLRPC.TL_messageMediaVenue)) {
                                                        if (I instanceof kc6) {
                                                            kc6 kc6Var = (kc6) I;
                                                            pc6Var.q0 = kc6Var.a;
                                                            if (pc6Var.r0) {
                                                                pc6Var.r0 = false;
                                                                pc6Var.R0();
                                                            }
                                                            pc6Var.F.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(kc6Var.e.a(), pc6Var.F.e() - 4.0f));
                                                            break;
                                                        }
                                                    } else {
                                                        pc6Var.M0.b((TLRPC.TL_messageMediaVenue) I, pc6Var.N0, true, 0, 0L);
                                                        pc6Var.finishFragment();
                                                        break;
                                                    }
                                                } else if (!pc6Var.getLocationController().i(pc6Var.m0)) {
                                                    pc6Var.C0(false);
                                                    break;
                                                } else {
                                                    pc6Var.getLocationController().k(pc6Var.m0);
                                                    pc6Var.Q.f();
                                                    pc6Var.finishFragment();
                                                    break;
                                                }
                                            } else {
                                                pc6Var.C0(pc6Var.getLocationController().h(pc6Var.m0).d != Integer.MAX_VALUE);
                                                break;
                                            }
                                        } else {
                                            pc6Var.getLocationController().k(pc6Var.m0);
                                            pc6Var.Q.f();
                                            pc6Var.finishFragment();
                                            break;
                                        }
                                    } else {
                                        s05 s05Var2 = pc6Var.F;
                                        if (s05Var2 != null) {
                                            IMapsProvider j2 = org.telegram.messenger.a.j();
                                            TLRPC.GeoPoint geoPoint2 = pc6Var.H0.geo_point;
                                            s05Var2.b(((k1f) j2).newCameraUpdateLatLngZoom(new xj5(geoPoint2.lat, geoPoint2._long), pc6Var.F.e() - 4.0f));
                                            break;
                                        }
                                    }
                                } else if (i4 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) pc6Var.Q.I(i4)) != null) {
                                    if (pc6Var.m0 != 0) {
                                        he[] heVarArr = {new he(3, null, pc6Var.getParentActivity())};
                                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                        tL_channels_editLocation.channel = pc6Var.getMessagesController().g1(-pc6Var.m0);
                                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                        TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                        tL_inputGeoPoint.lat = geoPoint3.lat;
                                        tL_inputGeoPoint._long = geoPoint3._long;
                                        heVarArr[0].setOnCancelListener(new fu0(pc6Var, pc6Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new i65(pc6Var, heVarArr, tL_messageMediaVenue, b11)), b10));
                                        pc6Var.showDialog(heVarArr[0]);
                                        break;
                                    } else {
                                        pc6Var.M0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                                        pc6Var.finishFragment();
                                        break;
                                    }
                                }
                                break;
                            default:
                                pc6Var.t0(i4);
                                break;
                        }
                    }
                });
                this.Q.P(this.O0);
                nc6Var.addView(this.P, nc6Var.indexOfChild(this.R), qoe.e(-1, -1, 51));
                uj5 onCreateMapView = ((k1f) org.telegram.messenger.a.j()).onCreateMapView(context);
                this.H = onCreateMapView;
                ((su) ((sm2) onCreateMapView).b).setAlpha(0.0f);
                uj5 uj5Var = this.H;
                sm2 sm2Var = (sm2) uj5Var;
                sm2Var.c = new yb6(this, (byte) 0);
                sm2Var.d = new yb6(this, b3);
                sm2Var.e = new sb6(this, (byte) 7);
                new Thread(new zb6(this, uj5Var, b3)).start();
                k47Var2 = this.J0;
                if (k47Var2 == null) {
                    b = b5;
                } else {
                    if (this.H0 == null) {
                        b = b5;
                        if (L0 != null && b == 4 && this.m0 != 0) {
                            FrameLayout frameLayout2 = new FrameLayout(context);
                            frameLayout2.setBackgroundResource(R.drawable.livepin);
                            this.P.addView(frameLayout2, qoe.e(62, 76, 49));
                            bf0 bf0Var = new bf0(context);
                            bf0Var.setRoundRadius(gm.L(26.0f));
                            bf0Var.f(L0, new pc0(L0));
                            frameLayout2.addView(bf0Var, qoe.d(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                            this.U = frameLayout2;
                            frameLayout2.setTag(1);
                        }
                        if (this.U == null) {
                            ImageView k = td4.k(context, R.drawable.map_pin2);
                            this.P.addView(k, qoe.e(28, 48, 49));
                            this.U = k;
                        }
                        r59 r59Var = new r59(context, null);
                        this.S = r59Var;
                        byte b8 = 8;
                        r59Var.setVisibility(8);
                        this.S.setLayoutManager(new u46(1, false));
                        l52 l52Var2 = new l52(this, context, getResourceProvider(), b == 8);
                        this.T = l52Var2;
                        l52Var2.n = new yb6(this, b8);
                        nc6Var.addView(this.S, qoe.e(-1, -1, 51));
                        this.S.setOnScrollListener(new cc6(this, (byte) 0));
                        this.S.setOnItemClickListener(new f59(this) { // from class: xb6
                            public final /* synthetic */ pc6 b;

                            {
                                this.b = this;
                            }

                            @Override // f59
                            public final void g(int i4, View view) {
                                k47 k47Var6;
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                                byte b82 = b3;
                                pc6 pc6Var = this.b;
                                switch (b82) {
                                    case 0:
                                        pc6Var.q0 = -1L;
                                        byte b9 = pc6Var.N0;
                                        byte b10 = 7;
                                        byte b11 = 6;
                                        if (b9 != 4) {
                                            if (b9 != 5) {
                                                if (i4 == 1 && (k47Var6 = pc6Var.J0) != null && (!k47Var6.C3() || b9 == 6)) {
                                                    s05 s05Var = pc6Var.F;
                                                    if (s05Var != null) {
                                                        IMapsProvider j = org.telegram.messenger.a.j();
                                                        TLRPC.GeoPoint geoPoint = pc6Var.J0.k.media.geo;
                                                        s05Var.b(((k1f) j).newCameraUpdateLatLngZoom(new xj5(geoPoint.lat, geoPoint._long), pc6Var.F.e() - 4.0f));
                                                        break;
                                                    }
                                                } else if (i4 == 1 && b9 != 2) {
                                                    if (pc6Var.M0 != null && pc6Var.A0 != null) {
                                                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                                        tL_messageMediaGeo.geo = tL_geoPoint;
                                                        tL_geoPoint.lat = gm.b0(pc6Var.A0.getLatitude());
                                                        tL_messageMediaGeo.geo._long = gm.b0(pc6Var.A0.getLongitude());
                                                        pc6Var.M0.b(tL_messageMediaGeo, pc6Var.N0, true, 0, 0L);
                                                        pc6Var.finishFragment();
                                                        break;
                                                    }
                                                } else if (b9 != 2 || !pc6Var.getLocationController().i(pc6Var.m0) || pc6Var.Q.d(i4) != 7) {
                                                    if (b9 != 2 || !pc6Var.getLocationController().i(pc6Var.m0) || pc6Var.Q.d(i4) != 6) {
                                                        if ((i4 != 2 || b9 != 1) && ((i4 != 1 || b9 != 2) && (i4 != 3 || b9 != 3))) {
                                                            Object I = pc6Var.Q.I(i4);
                                                            if (!(I instanceof TLRPC.TL_messageMediaVenue)) {
                                                                if (I instanceof kc6) {
                                                                    kc6 kc6Var = (kc6) I;
                                                                    pc6Var.q0 = kc6Var.a;
                                                                    if (pc6Var.r0) {
                                                                        pc6Var.r0 = false;
                                                                        pc6Var.R0();
                                                                    }
                                                                    pc6Var.F.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(kc6Var.e.a(), pc6Var.F.e() - 4.0f));
                                                                    break;
                                                                }
                                                            } else {
                                                                pc6Var.M0.b((TLRPC.TL_messageMediaVenue) I, pc6Var.N0, true, 0, 0L);
                                                                pc6Var.finishFragment();
                                                                break;
                                                            }
                                                        } else if (!pc6Var.getLocationController().i(pc6Var.m0)) {
                                                            pc6Var.C0(false);
                                                            break;
                                                        } else {
                                                            pc6Var.getLocationController().k(pc6Var.m0);
                                                            pc6Var.Q.f();
                                                            pc6Var.finishFragment();
                                                            break;
                                                        }
                                                    } else {
                                                        pc6Var.C0(pc6Var.getLocationController().h(pc6Var.m0).d != Integer.MAX_VALUE);
                                                        break;
                                                    }
                                                } else {
                                                    pc6Var.getLocationController().k(pc6Var.m0);
                                                    pc6Var.Q.f();
                                                    pc6Var.finishFragment();
                                                    break;
                                                }
                                            } else {
                                                s05 s05Var2 = pc6Var.F;
                                                if (s05Var2 != null) {
                                                    IMapsProvider j2 = org.telegram.messenger.a.j();
                                                    TLRPC.GeoPoint geoPoint2 = pc6Var.H0.geo_point;
                                                    s05Var2.b(((k1f) j2).newCameraUpdateLatLngZoom(new xj5(geoPoint2.lat, geoPoint2._long), pc6Var.F.e() - 4.0f));
                                                    break;
                                                }
                                            }
                                        } else if (i4 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) pc6Var.Q.I(i4)) != null) {
                                            if (pc6Var.m0 != 0) {
                                                he[] heVarArr = {new he(3, null, pc6Var.getParentActivity())};
                                                TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                                tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                                tL_channels_editLocation.channel = pc6Var.getMessagesController().g1(-pc6Var.m0);
                                                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                                tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                                TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                                tL_inputGeoPoint.lat = geoPoint3.lat;
                                                tL_inputGeoPoint._long = geoPoint3._long;
                                                heVarArr[0].setOnCancelListener(new fu0(pc6Var, pc6Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new i65(pc6Var, heVarArr, tL_messageMediaVenue, b11)), b10));
                                                pc6Var.showDialog(heVarArr[0]);
                                                break;
                                            } else {
                                                pc6Var.M0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                                                pc6Var.finishFragment();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        pc6Var.t0(i4);
                                        break;
                                }
                            }
                        });
                        k47 k47Var6 = this.J0;
                        if (k47Var6 != null && b == 6) {
                            fc6 fc6Var4 = this.Q;
                            fc6Var4.O = k47Var6;
                            fc6Var4.f();
                        }
                        for (int i4 = 0; i4 < 2; i4++) {
                            UndoView undoView = new UndoView(context);
                            UndoView[] undoViewArr = this.x;
                            undoViewArr[i4] = undoView;
                            undoView.setAdditionalTranslationY(gm.L(10.0f));
                            undoViewArr[i4].setTranslationZ(gm.L(5.0f));
                            FrameLayout.LayoutParams d = qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                            d.bottomMargin = gm.L(29.0f) + this.h0 + d.bottomMargin;
                            this.P.addView(undoViewArr[i4], d);
                        }
                        if (this.J0 == null && this.H0 == null && this.I0 != null) {
                            this.K0 = true;
                            ImageView imageView6 = this.a;
                            int i5 = cmb.kj;
                            anb.s(imageView6, i5, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            this.a.setTag(Integer.valueOf(i5));
                        }
                        eh0 baseSimpleGlass = getBaseSimpleGlass();
                        View view = new View(context);
                        this.navigationBarFadeView = view;
                        view.setBackground(baseSimpleGlass.b(view));
                        nc6Var.addView(this.navigationBarFadeView, qoe.e(-1, 0, 80));
                        baseSimpleGlass.g(nc6Var, this.simpleActionBar, getResourceProvider());
                        baseSimpleGlass.o = new ms0(this, (byte) 5);
                        this.simpleActionBar.setBackground(null);
                        this.glassEngine.b(this.R);
                        r59 r59Var2 = this.S;
                        if (r59Var2 != null) {
                            this.glassEngine.b(r59Var2);
                        }
                        if (baseSimpleGlass.g != null && gda.f()) {
                            this.e0 = new hk6(new sb6(this, b4));
                        }
                        d0();
                        O0();
                        return this.fragmentView;
                    }
                    b = b5;
                }
            }
        }
        this.c.setVisibility(8);
        this.c.setImageResource(R.drawable.msg_location_alert);
        hg5 hg5Var3 = new hg5(context, 1);
        this.s = hg5Var3;
        hg5Var3.setLayerType(2, null);
        hg5 hg5Var22 = this.s;
        hg5Var22.d = 4000L;
        hg5Var22.n(1.0f, -21.0f);
        this.s.setPadding(0, gm.L(4.0f), 0, 0);
        this.s.k(getBaseSimpleGlass().c);
        this.X.addView(this.s, qoe.d(-1, -2.0f, 51, 8.0f, 56.0f, 8.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.e.setGravity(1);
        this.e.setPadding(0, gm.L(160.0f), 0, 0);
        this.e.setVisibility(8);
        nc6Var.addView(this.e, qoe.c(-1.0f, -1));
        this.e.setOnTouchListener(new w02((byte) 13));
        ImageView imageView52 = new ImageView(context);
        this.f = imageView52;
        imageView52.setImageResource(R.drawable.location_empty);
        anb.s(this.f, cmb.V5, getResourceProvider(), mode);
        this.e.addView(this.f, qoe.o(-2, -2));
        TextView textView32 = new TextView(context);
        this.h = textView32;
        int i32 = cmb.W5;
        anb.X(textView32, i32, getResourceProvider());
        this.h.setGravity(17);
        this.h.setTypeface(gm.o());
        this.h.setTextSize(1, 17.0f);
        this.h.setText(jb6.M0(2131747913, null));
        TextView m2 = wi8.m(this.e, this.h, qoe.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.n = m2;
        anb.X(m2, i32, getResourceProvider());
        this.n.setGravity(17);
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(gm.L(40.0f), 0, gm.L(40.0f), 0);
        this.e.addView(this.n, qoe.t(-2, -2, 17, 0, 6, 0, 0));
        this.R = new fv((byte) 25, context, (Object) this);
        im0 c22 = getBaseSimpleGlass().f.c(this.R, null, false);
        nm0 nm0Var2 = new nm0(getResourceProvider());
        nm0Var2.e = new w00((byte) 18);
        nm0Var2.f(-1, 553648127);
        nm0Var2.e(0, 0);
        nm0Var2.d(372454195, 0);
        float N2 = gm.N(8.0f);
        float f2 = -gm.N(0.6666667f);
        nm0Var2.n = N2;
        nm0Var2.r = f2;
        nm0Var2.f = gm.N(0.55f);
        nm0Var2.h = 0.0f;
        c22.p(nm0Var2);
        c22.s(gm.L(29.0f), gm.L(29.0f), 0.0f, 0.0f);
        c22.q(gm.L(12.0f));
        this.Z = c22;
        fv fvVar3 = this.R;
        fc6 fc6Var22 = new fc6(this, context, this.N0, this.m0, getResourceProvider(), this.w, b5 != 8);
        this.Q = fc6Var22;
        fvVar3.setAdapter(fc6Var22);
        fv fvVar22 = this.R;
        u46 u46Var2 = new u46(1, false);
        this.V = u46Var2;
        fvVar22.setLayoutManager(u46Var2);
        if (this.T0 == null) {
        }
        this.Q.O(this.k0, z);
        this.Q.getClass();
        this.R.setVerticalScrollBarEnabled(z);
        nc6Var.addView(this.R, qoe.e(-1, -1, 51));
        k47Var = this.J0;
        if (k47Var != null) {
            fc6 fc6Var32 = this.Q;
            fc6Var32.I = this.J0.k.media.address;
            fc6Var32.Q();
        }
        this.R.setOnScrollListener(new cc6(this, b3));
        final byte b72 = 0;
        ((sc3) this.R.getItemAnimator()).C = false;
        this.R.setOnItemLongClickListener(new nv4(this, context, (byte) 14));
        this.R.setOnItemClickListener(new f59(this) { // from class: xb6
            public final /* synthetic */ pc6 b;

            {
                this.b = this;
            }

            @Override // f59
            public final void g(int i42, View view2) {
                k47 k47Var62;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                byte b82 = b72;
                pc6 pc6Var = this.b;
                switch (b82) {
                    case 0:
                        pc6Var.q0 = -1L;
                        byte b9 = pc6Var.N0;
                        byte b10 = 7;
                        byte b11 = 6;
                        if (b9 != 4) {
                            if (b9 != 5) {
                                if (i42 == 1 && (k47Var62 = pc6Var.J0) != null && (!k47Var62.C3() || b9 == 6)) {
                                    s05 s05Var = pc6Var.F;
                                    if (s05Var != null) {
                                        IMapsProvider j = org.telegram.messenger.a.j();
                                        TLRPC.GeoPoint geoPoint = pc6Var.J0.k.media.geo;
                                        s05Var.b(((k1f) j).newCameraUpdateLatLngZoom(new xj5(geoPoint.lat, geoPoint._long), pc6Var.F.e() - 4.0f));
                                        break;
                                    }
                                } else if (i42 == 1 && b9 != 2) {
                                    if (pc6Var.M0 != null && pc6Var.A0 != null) {
                                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                        tL_messageMediaGeo.geo = tL_geoPoint;
                                        tL_geoPoint.lat = gm.b0(pc6Var.A0.getLatitude());
                                        tL_messageMediaGeo.geo._long = gm.b0(pc6Var.A0.getLongitude());
                                        pc6Var.M0.b(tL_messageMediaGeo, pc6Var.N0, true, 0, 0L);
                                        pc6Var.finishFragment();
                                        break;
                                    }
                                } else if (b9 != 2 || !pc6Var.getLocationController().i(pc6Var.m0) || pc6Var.Q.d(i42) != 7) {
                                    if (b9 != 2 || !pc6Var.getLocationController().i(pc6Var.m0) || pc6Var.Q.d(i42) != 6) {
                                        if ((i42 != 2 || b9 != 1) && ((i42 != 1 || b9 != 2) && (i42 != 3 || b9 != 3))) {
                                            Object I = pc6Var.Q.I(i42);
                                            if (!(I instanceof TLRPC.TL_messageMediaVenue)) {
                                                if (I instanceof kc6) {
                                                    kc6 kc6Var = (kc6) I;
                                                    pc6Var.q0 = kc6Var.a;
                                                    if (pc6Var.r0) {
                                                        pc6Var.r0 = false;
                                                        pc6Var.R0();
                                                    }
                                                    pc6Var.F.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(kc6Var.e.a(), pc6Var.F.e() - 4.0f));
                                                    break;
                                                }
                                            } else {
                                                pc6Var.M0.b((TLRPC.TL_messageMediaVenue) I, pc6Var.N0, true, 0, 0L);
                                                pc6Var.finishFragment();
                                                break;
                                            }
                                        } else if (!pc6Var.getLocationController().i(pc6Var.m0)) {
                                            pc6Var.C0(false);
                                            break;
                                        } else {
                                            pc6Var.getLocationController().k(pc6Var.m0);
                                            pc6Var.Q.f();
                                            pc6Var.finishFragment();
                                            break;
                                        }
                                    } else {
                                        pc6Var.C0(pc6Var.getLocationController().h(pc6Var.m0).d != Integer.MAX_VALUE);
                                        break;
                                    }
                                } else {
                                    pc6Var.getLocationController().k(pc6Var.m0);
                                    pc6Var.Q.f();
                                    pc6Var.finishFragment();
                                    break;
                                }
                            } else {
                                s05 s05Var2 = pc6Var.F;
                                if (s05Var2 != null) {
                                    IMapsProvider j2 = org.telegram.messenger.a.j();
                                    TLRPC.GeoPoint geoPoint2 = pc6Var.H0.geo_point;
                                    s05Var2.b(((k1f) j2).newCameraUpdateLatLngZoom(new xj5(geoPoint2.lat, geoPoint2._long), pc6Var.F.e() - 4.0f));
                                    break;
                                }
                            }
                        } else if (i42 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) pc6Var.Q.I(i42)) != null) {
                            if (pc6Var.m0 != 0) {
                                he[] heVarArr = {new he(3, null, pc6Var.getParentActivity())};
                                TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                tL_channels_editLocation.channel = pc6Var.getMessagesController().g1(-pc6Var.m0);
                                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                tL_inputGeoPoint.lat = geoPoint3.lat;
                                tL_inputGeoPoint._long = geoPoint3._long;
                                heVarArr[0].setOnCancelListener(new fu0(pc6Var, pc6Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new i65(pc6Var, heVarArr, tL_messageMediaVenue, b11)), b10));
                                pc6Var.showDialog(heVarArr[0]);
                                break;
                            } else {
                                pc6Var.M0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                                pc6Var.finishFragment();
                                break;
                            }
                        }
                        break;
                    default:
                        pc6Var.t0(i42);
                        break;
                }
            }
        });
        this.Q.P(this.O0);
        nc6Var.addView(this.P, nc6Var.indexOfChild(this.R), qoe.e(-1, -1, 51));
        uj5 onCreateMapView2 = ((k1f) org.telegram.messenger.a.j()).onCreateMapView(context);
        this.H = onCreateMapView2;
        ((su) ((sm2) onCreateMapView2).b).setAlpha(0.0f);
        uj5 uj5Var2 = this.H;
        sm2 sm2Var2 = (sm2) uj5Var2;
        sm2Var2.c = new yb6(this, (byte) 0);
        sm2Var2.d = new yb6(this, b3);
        sm2Var2.e = new sb6(this, (byte) 7);
        new Thread(new zb6(this, uj5Var2, b3)).start();
        k47Var2 = this.J0;
        if (k47Var2 == null) {
        }
    }

    public final void d0() {
        if (this.fragmentView == null || this.R == null) {
            return;
        }
        iq5 iq5Var = this.mSystemInsets;
        int i = iq5Var.b;
        int i2 = iq5Var.d;
        FrameLayout frameLayout = this.X;
        if (frameLayout != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            int d = eh0.d(i) - gm.L(6.0f);
            if (layoutParams.topMargin != d) {
                layoutParams.topMargin = d;
                this.X.requestLayout();
            }
        }
        this.R.setClipToPadding(false);
        this.R.setPadding(0, 0, 0, i2);
        r59 r59Var = this.S;
        if (r59Var != null) {
            r59Var.setClipToPadding(false);
            eh0.e(this.S, i, i2, a.getCurrentActionBarHeight(), 0);
        }
        if (this.fragmentView.getMeasuredHeight() > 0) {
            n0(false);
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        fc6 fc6Var;
        fc6 fc6Var2;
        if (i == nm7.s) {
            removeSelfFromStack(true);
            return;
        }
        if (i == nm7.z4) {
            this.k0 = false;
            fc6 fc6Var3 = this.Q;
            if (fc6Var3 != null) {
                fc6Var3.O(false, false);
            }
            L0();
            return;
        }
        if (i == nm7.A4) {
            this.k0 = true;
            fc6 fc6Var4 = this.Q;
            if (fc6Var4 != null) {
                fc6Var4.O(true, false);
                return;
            }
            return;
        }
        if (i == nm7.H4) {
            fc6 fc6Var5 = this.Q;
            if (fc6Var5 != null) {
                fc6Var5.f();
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
                k47 k47Var = (k47) arrayList.get(i3);
                boolean C3 = k47Var.C3();
                TLRPC.Message message = k47Var.k;
                if (C3) {
                    c0(message);
                    z = true;
                } else if ((message.action instanceof TLRPC.TL_messageActionGeoProximityReached) && pg3.D(k47.B0(message))) {
                    this.c.setImageResource(R.drawable.msg_location_alert);
                    mj4 mj4Var = this.L;
                    if (mj4Var != null) {
                        mj4Var.y();
                        this.L = null;
                    }
                }
            }
            if (!z || (fc6Var2 = this.Q) == null) {
                return;
            }
            fc6Var2.N(this.o0);
            return;
        }
        if (i == nm7.m0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue != this.m0 || this.J0 == null) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) objArr[1];
            boolean z2 = false;
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                k47 k47Var2 = (k47) arrayList2.get(i4);
                if (k47Var2.C3()) {
                    TLRPC.Message message2 = k47Var2.k;
                    TLRPC.Peer peer = message2.from_id;
                    kc6 kc6Var = (kc6) this.p0.f(peer != null ? k47.B1(peer) : k47.B0(message2));
                    if (kc6Var != null) {
                        cd6 h = getLocationController().h(longValue);
                        if (h == null || h.b != k47Var2.e1()) {
                            TLRPC.Message message3 = k47Var2.k;
                            kc6Var.b = message3;
                            TLRPC.GeoPoint geoPoint = message3.media.geo;
                            xj5 xj5Var = new xj5(geoPoint.lat, geoPoint._long);
                            kc6Var.e.b(xj5Var);
                            if (this.q0 == kc6Var.a) {
                                this.F.b(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLng(kc6Var.e.a()));
                            }
                            r05 r05Var = kc6Var.f;
                            if (r05Var != null) {
                                r05Var.a();
                                kc6Var.f.b(xj5Var);
                                int i5 = k47Var2.k.media.heading;
                                if (i5 != 0) {
                                    kc6Var.f.c(i5);
                                    if (!kc6Var.g) {
                                        kc6Var.f.a.a(hqd.b(R.drawable.map_pin_cone2));
                                        kc6Var.g = true;
                                    }
                                } else if (kc6Var.g) {
                                    kc6Var.f.c(0.0f);
                                    kc6Var.f.a.a(hqd.b(R.drawable.map_pin_circle));
                                    kc6Var.g = false;
                                }
                            }
                        }
                        z2 = true;
                    }
                }
            }
            if (z2 && (fc6Var = this.Q) != null) {
                fc6Var.f();
                tv8 tv8Var = this.O;
                if (tv8Var != null) {
                    tv8Var.c(true);
                }
            }
            if (z2) {
                R0();
            }
        }
    }

    public final void e0(Canvas canvas, RectF rectF) {
        int i = cmb.g5;
        int themedColor = getThemedColor(i);
        Paint paint = this.g0;
        paint.setColor(themedColor);
        canvas.drawRect(rectF, paint);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        r59 r59Var = this.S;
        if (r59Var != null && r59Var.getVisibility() == 0) {
            r59 r59Var2 = this.S;
            tl0.a(r59Var2, canvas, rectF, r59Var2, viewGroup);
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
            uj5 uj5Var = this.H;
            su suVar = uj5Var != null ? (su) ((sm2) uj5Var).b : null;
            if (suVar != null && suVar.getParent() == this.P && suVar.getVisibility() == 0 && suVar.getAlpha() > 0.0f) {
                TextureView textureView = this.d0;
                RectF rectF2 = this.f0;
                if (textureView != null && textureView.isAttachedToWindow() && zgc.c(this.d0, this.P, rectF2)) {
                    if (suVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (suVar.getAlpha() * 255.0f));
                    } else {
                        canvas.save();
                    }
                    canvas.translate(rectF2.left, rectF2.top);
                    this.d0.draw(canvas);
                    canvas.restore();
                } else if (this.e0 != null) {
                    rectF2.set(suVar.getX(), suVar.getY(), suVar.getX() + suVar.getWidth(), suVar.getY() + suVar.getHeight());
                    hk6 hk6Var = this.e0;
                    float alpha = suVar.getAlpha();
                    Paint paint2 = hk6Var.c;
                    Bitmap bitmap = hk6Var.e;
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
            int L = gm.L(22.0f) + a.getCurrentActionBarHeight() + this.mSystemInsets.b;
            float f = L;
            if (rectF.top >= f) {
                return;
            }
            canvas.save();
            canvas.clipRect(0.0f, Math.min(rectF.top, f), viewGroup.getWidth(), f);
            if (this.b0 < L) {
                paint.setColor(getThemedColor(i));
                paint.setAlpha(nm7.i3);
                canvas.drawRect(0.0f, Math.max(this.b0, rectF.top), viewGroup.getWidth(), f, paint);
            }
            fv fvVar = this.R;
            tl0.a(fvVar, canvas, rectF, fvVar, viewGroup);
            canvas.restore();
        }
    }

    public final void f0() {
        im0 im0Var = this.Z;
        if (im0Var != null) {
            im0Var.updateColors();
        }
        fv fvVar = this.R;
        if (fvVar != null) {
            fvVar.invalidate();
        }
        if (this.F != null) {
            int i = gm.B(getThemedColor(cmb.c6)) < 0.721f ? R.raw.mapstyle_night : 0;
            boolean z = this.i0;
            if (i != 0) {
                if (!z) {
                    this.i0 = true;
                    this.F.i(((k1f) org.telegram.messenger.a.j()).loadRawResourceStyle(org.telegram.messenger.a.b, i));
                    mj4 mj4Var = this.L;
                    if (mj4Var != null) {
                        mj4Var.C(-1);
                        this.L.z(553648127);
                    }
                }
            } else if (z) {
                this.i0 = false;
                this.F.i(null);
                mj4 mj4Var2 = this.L;
                if (mj4Var2 != null) {
                    mj4Var2.C(-16777216);
                    this.L.z(TLObject.FLAG_29);
                }
            }
            D0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean finishFragment(boolean z) {
        if (A0()) {
            return false;
        }
        return super.finishFragment(z);
    }

    public final boolean g0() {
        if (j0()) {
            return false;
        }
        if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            try {
                if (!((LocationManager) org.telegram.messenger.a.b.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i = cmb.K5;
                    alertDialog$Builder.l(R.raw.permission_request_location, 72, getThemedColor(i), null);
                    alertDialog$Builder.m(i, getResourceProvider());
                    alertDialog$Builder.a.U = jb6.M0(2131749304, null);
                    alertDialog$Builder.j(jb6.M0(2131751743, null), new yb6(this, (byte) 5));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    showDialog(alertDialog$Builder.a);
                    return false;
                }
            } catch (Exception e) {
                fc4.g(e, true);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            UndoView[] undoViewArr = this.x;
            if (i >= undoViewArr.length) {
                break;
            }
            arrayList.add(new cnb(undoViewArr[i], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.vj));
            i++;
        }
        arrayList.add(new cnb(this.R, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g5));
        zja zjaVar = this.r;
        arrayList.add(new cnb(zjaVar != null ? zjaVar.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.i5));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ij));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.jj));
        arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.oj));
        arrayList.add(new cnb(this.R, 393216, new Class[]{k3a.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.dj));
        arrayList.add(new cnb(this.R, 393216, new Class[]{k3a.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.gj));
        arrayList.add(new cnb(this.R, 393248, new Class[]{k3a.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.cj));
        arrayList.add(new cnb(this.R, 393248, new Class[]{k3a.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.fj));
        arrayList.add(new cnb(this.R, 196608, new Class[]{ed6.class}, new String[]{"frameLayout"}, (Drawable[]) null, (bnb) null, cmb.Gi));
        return arrayList;
    }

    public final void h0(int i) {
        kye roeVar;
        if (this.F == null) {
            return;
        }
        boolean z = false;
        List<bk5> asList = Arrays.asList(new ak5(), new zj5());
        qj5 onCreateCircleOptions = ((k1f) org.telegram.messenger.a.j()).onCreateCircleOptions();
        double latitude = this.z0.getLatitude();
        double longitude = this.z0.getLongitude();
        vi2 vi2Var = (vi2) ((k44) onCreateCircleOptions).b;
        LatLng latLng = new LatLng(latitude, longitude);
        vi2Var.getClass();
        vi2Var.a = latLng;
        double d = i;
        vi2 vi2Var2 = (vi2) ((k44) onCreateCircleOptions).b;
        vi2Var2.b = d;
        if (s0()) {
            vi2Var2.d = -1771658281;
            vi2Var2.e = 476488663;
        } else {
            vi2Var2.d = -1774024971;
            vi2Var2.e = 474121973;
        }
        ArrayList arrayList = new ArrayList();
        for (bk5 bk5Var : asList) {
            if (bk5Var instanceof ak5) {
                arrayList.add(new s63(20.0f, (byte) 1));
            } else if (bk5Var instanceof zj5) {
                arrayList.add(new s63(20.0f, (byte) 0));
            }
        }
        vi2Var2.r = arrayList;
        vi2Var2.c = 2.0f;
        s05 s05Var = this.F;
        wm4 wm4Var = s05Var.a;
        wm4Var.getClass();
        try {
            d8e d8eVar = (d8e) wm4Var.b;
            Parcel R = d8eVar.R();
            tid.b(R, vi2Var2);
            Parcel Q = d8eVar.Q(R, 35);
            IBinder readStrongBinder = Q.readStrongBinder();
            int i2 = bue.b;
            if (readStrongBinder == null) {
                roeVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                roeVar = queryLocalInterface instanceof kye ? (kye) queryLocalInterface : new roe(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", (byte) 6);
            }
            Q.recycle();
            ti2 ti2Var = new ti2(roeVar);
            mj4 mj4Var = new mj4(s05Var, ti2Var, z, (byte) 4);
            s05Var.c.put(ti2Var, mj4Var);
            this.L = mj4Var;
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final Bitmap i0(kc6 kc6Var) {
        Bitmap bitmap = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(gm.L(62.0f), gm.L(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = org.telegram.messenger.a.b.getResources().getDrawable(R.drawable.map_pin_photo);
                drawable.setBounds(0, 0, gm.L(62.0f), gm.L(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                pc0 pc0Var = new pc0((ylb) null);
                TLRPC.User user = kc6Var.c;
                if (user != null) {
                    pc0Var.q(user);
                } else {
                    TLRPC.Chat chat = kc6Var.d;
                    if (chat != null) {
                        pc0Var.p(chat);
                    }
                }
                canvas.translate(gm.L(6.0f), gm.L(6.0f));
                pc0Var.setBounds(0, 0, gm.L(50.0f), gm.L(50.0f));
                pc0Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = kc6Var.h;
                Bitmap n = (imageReceiver == null || !imageReceiver.C()) ? null : kc6Var.h.n();
                if (n != null && !n.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(n, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    float L = gm.L(50.0f) / n.getWidth();
                    matrix.postScale(L, L);
                    matrix.postTranslate(gm.L(6.0f), gm.L(6.0f));
                    paint.setShader(bitmapShader);
                    bitmapShader.setLocalMatrix(matrix);
                    rectF.set(gm.L(6.0f), gm.L(6.0f), gm.L(56.0f), gm.L(56.0f));
                    canvas.drawRoundRect(rectF, gm.L(25.0f), gm.L(25.0f), paint);
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
                fc4.g(th, true);
                return bitmap;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return on2.h(getThemedColor(cmb.c6)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public boolean j0() {
        return this instanceof fv1;
    }

    public final void k0(ArrayList arrayList) {
        sj5 onCreateLatLngBoundsBuilder = this.n0 ? ((k1f) org.telegram.messenger.a.j()).onCreateLatLngBoundsBuilder() : null;
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
            int i2 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i3 = messageMedia.period;
            if (i2 + i3 > currentTime || i3 == Integer.MAX_VALUE) {
                if (onCreateLatLngBoundsBuilder != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    ((lj4) onCreateLatLngBoundsBuilder).z(new xj5(geoPoint.lat, geoPoint._long));
                }
                c0(message);
                if (this.c.getVisibility() != 8 && k47.B1(message.from_id) != getUserConfig().e()) {
                    this.c.setVisibility(0);
                    this.E = true;
                    this.c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new v85(this, (byte) 15)).start();
                }
            }
        }
        if (onCreateLatLngBoundsBuilder != null) {
            if (this.n0) {
                this.R.x0(0, gm.L(99.0f), null);
            }
            this.n0 = false;
            this.Q.N(this.o0);
            if (this.J0.C3()) {
                try {
                    lj4 lj4Var = (lj4) onCreateLatLngBoundsBuilder;
                    xj5 a = lj4Var.c().a();
                    xj5 z0 = z0(a, 100.0d, 100.0d);
                    lj4Var.z(z0(a, -100.0d, -100.0d));
                    lj4Var.z(z0);
                    q05 c = lj4Var.c();
                    if (arrayList.size() > 1) {
                        try {
                            pj5 newCameraUpdateLatLngBounds = ((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLngBounds(c, gm.L(113.0f));
                            this.G = newCameraUpdateLatLngBounds;
                            this.F.h(newCameraUpdateLatLngBounds);
                            this.G = null;
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final boolean m0() {
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
                kc6 kc6Var = (kc6) arrayList2.get(i2);
                r05 r05Var = kc6Var.e;
                if (r05Var != null && (message = kc6Var.b) != null && (messageMedia = message.media) != null && ((i = messageMedia.period) == Integer.MAX_VALUE || message.date + i > currentTime)) {
                    arrayList.add(r05Var.a());
                }
            }
            boolean z4 = this.p0.f(getUserConfig().e()) != null;
            Location location = this.z0;
            if (location != null && !z4) {
                arrayList.add(new xj5(location.getLatitude(), this.z0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    sj5 onCreateLatLngBoundsBuilder = ((k1f) org.telegram.messenger.a.j()).onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    int i3 = 0;
                    double d2 = Double.MAX_VALUE;
                    double d3 = Double.MAX_VALUE;
                    double d4 = -1.7976931348623157E308d;
                    while (i3 < size2) {
                        xj5 xj5Var = (xj5) arrayList.get(i3);
                        z = z3;
                        try {
                            ((lj4) onCreateLatLngBoundsBuilder).z(xj5Var);
                            int i4 = size2;
                            z2 = true;
                            try {
                                double d5 = xj5Var.a;
                                if (d5 < d2) {
                                    d2 = d5;
                                }
                                if (d5 > d) {
                                    d = d5;
                                }
                                double d6 = xj5Var.b;
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
                                fc4.g(e, z2);
                                return z;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            z2 = true;
                            fc4.g(e, z2);
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
                        lj4 lj4Var = (lj4) onCreateLatLngBoundsBuilder;
                        lj4Var.z(new xj5(1.3499999414033853E-4d + d7, d8 + Math.toDegrees(15.0d / (Math.cos(Math.toRadians(d7)) * 6366198.0d))));
                        lj4Var.z(new xj5(d7 - 1.3499999414033853E-4d, d8 + Math.toDegrees((-15.0d) / (Math.cos(Math.toRadians(d7)) * 6366198.0d))));
                    }
                    this.F.c(((k1f) org.telegram.messenger.a.j()).newCameraUpdateLatLngBounds(((lj4) onCreateLatLngBoundsBuilder).c(), gm.L(60.0f)));
                    return true;
                } catch (Exception e3) {
                    e = e3;
                    z = z3;
                }
            }
        }
        return false;
    }

    public final void n0(boolean z) {
        if (this.R != null) {
            int i = this.mSystemInsets.d;
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight != 0) {
                byte b = this.N0;
                if (b == 6) {
                    this.O0 = kt6.y(66.0f, measuredHeight, i);
                } else if (b == 2) {
                    this.O0 = kt6.y(73.0f, measuredHeight, i);
                } else {
                    this.O0 = kt6.y(66.0f, measuredHeight, i);
                }
                ic6 ic6Var = this.R0;
                if (ic6Var != null && ic6Var.W(8) > 0) {
                    this.O0 -= gm.L(200.0f);
                }
                this.c0 = gm.L(100.0f) + (measuredHeight - this.O0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
                layoutParams.height = gm.L(29.0f) + this.O0;
                this.P.setLayoutParams(layoutParams);
                this.Q.P(this.O0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((su) ((sm2) this.H).b).getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = p0();
                    s05 s05Var = this.F;
                    if (s05Var != null) {
                        s05Var.n(gm.L(70.0f), 0, gm.L(70.0f), o0());
                    }
                    ((su) ((sm2) this.H).b).setLayoutParams(layoutParams2);
                }
                this.Q.f();
                if (!z) {
                    N0(false);
                    return;
                }
                byte b2 = 3;
                int i2 = b == 3 ? 73 : (b == 1 || b == 2) ? 66 : 0;
                this.V.g1(0, -gm.L(i2));
                N0(false);
                this.R.post(new ex1(this, i2, b2));
            }
        }
    }

    public final int o0() {
        return gm.L(10.0f) + this.h0 + this.c0;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        tv8 tv8Var = this.O;
        if (tv8Var == null) {
            uj5 uj5Var = this.H;
            if (uj5Var == null || ((GLSurfaceView) ((sm2) uj5Var).f) == null || this.J) {
                return super.onBackPressed(z);
            }
            if (z) {
                A0();
            }
        } else if (z) {
            tv8Var.a();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().b(this, nm7.s);
        nm7.e().b(this, nm7.z4);
        nm7.e().b(this, nm7.A4);
        nm7.e().b(this, nm7.H4);
        k47 k47Var = this.J0;
        if (k47Var != null && k47Var.C3()) {
            getNotificationCenter().b(this, 1);
            getNotificationCenter().b(this, nm7.m0);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        hk6 hk6Var = this.e0;
        if (hk6Var != null) {
            hk6Var.i = true;
            hk6Var.g = false;
            hk6Var.d();
            hk6Var.d = null;
            hk6Var.e = null;
            hk6Var.f = null;
        }
        nm7.e().n(this, nm7.z4);
        nm7.e().n(this, nm7.A4);
        nm7.e().n(this, nm7.H4);
        getNotificationCenter().n(this, nm7.s);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, nm7.m0);
        M0();
        if (this.G0 != null) {
            try {
                ((in3) org.telegram.messenger.a.i()).removeLocationUpdates(this.G0);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        this.C0 = null;
        this.D0 = null;
        try {
            uj5 uj5Var = this.H;
            if (uj5Var != null) {
                ((sm2) uj5Var).G();
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        fc6 fc6Var = this.Q;
        if (fc6Var != null) {
            fc6Var.F();
        }
        l52 l52Var = this.T;
        if (l52Var != null) {
            l52Var.F();
        }
        sb6 sb6Var = this.Q0;
        if (sb6Var != null) {
            gm.r(sb6Var);
            this.Q0 = null;
        }
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kc6 kc6Var = (kc6) arrayList.get(i);
            ImageReceiver imageReceiver = kc6Var.h;
            if (imageReceiver != null) {
                imageReceiver.K();
                kc6Var.h = null;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        d0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onLowMemory() {
        wm9 wm9Var;
        super.onLowMemory();
        uj5 uj5Var = this.H;
        if (uj5Var == null || !this.x0 || (wm9Var = (wm9) ((pr2) ((su) ((sm2) uj5Var).b).b).a) == null) {
            return;
        }
        try {
            mye myeVar = (mye) wm9Var.c;
            myeVar.V(myeVar.R(), 6);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        uj5 uj5Var = this.H;
        if (uj5Var != null && this.x0) {
            try {
                ((sm2) uj5Var).H();
            } catch (Exception e) {
                fc4.g(e, true);
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
                ((in3) org.telegram.messenger.a.i()).removeLocationUpdates(this.G0);
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        }
        P0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        gm.V2(getParentActivity(), this.classGuid);
        gm.y2(getParentActivity(), this.classGuid);
        uj5 uj5Var = this.H;
        if (uj5Var != null && this.x0) {
            try {
                ((sm2) uj5Var).I();
            } catch (Throwable th) {
                fc4.g(th, true);
            }
        }
        this.y0 = true;
        K0();
        L0();
        D0();
        n0(true);
        if (j0()) {
            this.t0 = false;
        } else if (this.t0 && (parentActivity = getParentActivity()) != null) {
            this.t0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        sb6 sb6Var = this.Q0;
        if (sb6Var != null) {
            gm.r(sb6Var);
            gm.d3(this.Q0, 5000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            f0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            zja zjaVar = this.r;
            if (zjaVar == null || zjaVar.getSearchField() == null) {
                return;
            }
            this.r.getSearchField().setCursorColor(getThemedColor(cmb.i5));
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || z2) {
            return;
        }
        try {
            if (((su) ((sm2) this.H).b).getParent() instanceof ViewGroup) {
                ((ViewGroup) ((su) ((sm2) this.H).b).getParent()).removeView((su) ((sm2) this.H).b);
            }
        } catch (Exception unused) {
        }
        a6 a6Var = this.P;
        if (a6Var != null) {
            a6Var.addView((su) ((sm2) this.H).b, 0, qoe.e(-1, p0(), 51));
            N0(false);
            y0();
            D0();
            return;
        }
        View view = this.fragmentView;
        if (view != null) {
            ((FrameLayout) view).addView((su) ((sm2) this.H).b, 0, qoe.e(-1, -1, 51));
        }
    }

    public final int p0() {
        return gm.L(10.0f) + this.O0 + this.c0;
    }

    public final boolean q0() {
        ArrayList arrayList = (ArrayList) getLocationController().c.f(k47.B0(this.J0.k));
        if (arrayList == null || !arrayList.isEmpty()) {
            arrayList = null;
        } else {
            k0(arrayList);
        }
        if (pg3.y(this.m0)) {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.m0));
            if (sd2.T(L0) && !L0.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long B0 = k47.B0(this.J0.k);
        tL_messages_getRecentLocations.peer = getMessagesController().i1(B0);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new qv2(this, B0, (byte) 1));
        return arrayList != null;
    }

    public final UndoView r0() {
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

    public final boolean s0() {
        return (getResourceProvider() == null && cmb.I.o()) || gm.B(getThemedColor(cmb.c6)) < 0.721f;
    }

    public final /* synthetic */ void t0(int i) {
        float e;
        float f;
        TLRPC.TL_messageMediaVenue H = this.T.H(i);
        if (H == null || H.icon == null || this.F == null) {
            return;
        }
        this.K0 = true;
        this.simpleActionBar.o(true);
        boolean equals = "pin".equals(H.icon);
        s05 s05Var = this.F;
        if (equals) {
            e = s05Var.e();
            f = 4.0f;
        } else {
            e = s05Var.e();
            f = 9.0f;
        }
        float f2 = e - f;
        s05 s05Var2 = this.F;
        IMapsProvider j = org.telegram.messenger.a.j();
        TLRPC.GeoPoint geoPoint = H.geo;
        s05Var2.b(((k1f) j).newCameraUpdateLatLngZoom(new xj5(geoPoint.lat, geoPoint._long), f2));
        Location location = this.A0;
        if (location != null) {
            location.setLatitude(H.geo.lat);
            this.A0.setLongitude(H.geo._long);
        }
        this.Q.L(this.A0);
    }

    public final /* synthetic */ void u0() {
        sb6 sb6Var;
        getLocationController().j(this.m0);
        if (this.isPaused || (sb6Var = this.Q0) == null) {
            return;
        }
        gm.d3(sb6Var, 5000L);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final /* synthetic */ void v0() {
        this.glassEngine.g();
    }

    public final void w0(int i, TLRPC.User user, boolean z) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (!z) {
            I0(i, 0, user);
            return;
        }
        cd6 h = getLocationController().h(this.m0);
        if (h != null) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.peer = getMessagesController().i1(h.a);
            tL_messages_editMessage.id = h.b;
            tL_messages_editMessage.flags |= TLObject.FLAG_14;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = false;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
            Location location = dd6.f(this.currentAccount).s;
            tL_messages_editMessage.media.geo_point.lat = gm.b0(location.getLatitude());
            tL_messages_editMessage.media.geo_point._long = gm.b0(location.getLongitude());
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
            inputMedia.heading = dd6.e(location);
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
            k47 k47Var = h.h;
            if (k47Var != null && (message = k47Var.k) != null && (messageMedia = message.media) != null) {
                messageMedia.period = i6;
                getMessagesStorage().o1(h.h.k, null, null, true);
            }
            getConnectionsManager().sendRequest(tL_messages_editMessage, null);
            nm7.e().k(nm7.H4, new Object[0]);
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
        SharedPreferences d1;
        int i;
        ImageView imageView = this.c;
        if (imageView == null || imageView.getVisibility() != 0 || this.E || (i = (d1 = oc7.d1()).getInt("proximityhint", 0)) >= 3) {
            return;
        }
        d1.edit().putInt("proximityhint", i + 1).commit();
        if (pg3.D(this.m0)) {
            this.s.t(jb6.a0("ProximityTooltioUser", null, 2131746345, m9c.k(getMessagesController().W1(Long.valueOf(this.m0)), true)));
        } else {
            this.s.t(jb6.M0(2131746346, null));
        }
        this.s.v();
    }
}
