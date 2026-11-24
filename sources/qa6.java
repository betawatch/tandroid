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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class qa6 extends d implements gk7 {
    public Location A0;
    public int B0;
    public xo2 C0;
    public sy4 D0;
    public boolean E;
    public boolean E0;
    public ty4 F;
    public oh5 F0;
    public qh5 G;
    public z96 G0;
    public vh5 H;
    public TLRPC.TL_channelLocation H0;
    public qh5 I;
    public TLRPC.TL_channelLocation I0;
    public boolean J;
    public k27 J0;
    public float K;
    public boolean K0;
    public sk4 L;
    public boolean L0;
    public double M;
    public ma6 M0;
    public boolean N;
    public final byte N0;
    public st8 O;
    public int O0;
    public a6 P;
    public ka6 P0;
    public ga6 Q;
    public t96 Q0;
    public fu R;
    public ja6 R0;
    public o39 S;
    public l35 S0;
    public a42 T;
    public TL_stories.MediaArea T0;
    public View U;
    public boolean U0;
    public t26 V;
    public boolean V0;
    public xha W;
    public Boolean W0;
    public FrameLayout X;
    public FrameLayout Y;
    public il0 Z;
    public ImageView a;
    public final RectF a0;
    public TextView b;
    public int b0;
    public ImageView c;
    public int c0;
    public xha d;
    public TextureView d0;
    public LinearLayout e;
    public fi6 e0;
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
    public final vf6 p0;
    public long q0;
    public xha r;
    public boolean r0;
    public je5 s;
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
    public qa6(int i) {
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
        this.p0 = new vf6();
        this.q0 = -1L;
        this.t0 = true;
        this.O0 = (gl.q.x - a.getCurrentActionBarHeight()) - gl.L(66.0f);
        this.V0 = true;
        this.N0 = i;
        gl.a0();
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

    public static yh5 y0(yh5 yh5Var, double d, double d2) {
        double d3 = yh5Var.a;
        return new yh5(d3 + Math.toDegrees(d / 6366198.0d), yh5Var.b + Math.toDegrees(d2 / (Math.cos(Math.toRadians(d3)) * 6366198.0d)));
    }

    public final void A0(la6 la6Var) {
        double d;
        double d2;
        TLRPC.Message message;
        if (la6Var == null || (message = la6Var.b) == null) {
            k27 k27Var = this.J0;
            if (k27Var != null) {
                TLRPC.GeoPoint geoPoint = k27Var.k.media.geo;
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
        boolean z = w01.a;
        org.telegram.messenger.a.q();
        if (this.z0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?saddr=%f,%f&daddr=%f,%f", Double.valueOf(this.z0.getLatitude()), Double.valueOf(this.z0.getLongitude()), Double.valueOf(d), Double.valueOf(d2)))));
                return;
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?saddr=&daddr=%f,%f", Double.valueOf(d), Double.valueOf(d2)))));
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    public final void B0(final boolean z) {
        if (this.M0 == null || i0() || getParentActivity() == null || this.z0 == null || !f0()) {
            return;
        }
        final TLRPC.User V1 = cf3.D(this.m0) ? getMessagesController().V1(Long.valueOf(this.m0)) : null;
        showDialog(ij.B(getParentActivity(), z, V1, new uc7() { // from class: ba6
            @Override // uc7
            public final void a(int i) {
                boolean z2 = z;
                qa6.this.v0(i, V1, z2);
            }
        }, null));
    }

    public final void C0() {
        SurfaceView surfaceView;
        if (this.e0 == null || this.H == null) {
            return;
        }
        TextureView textureView = this.d0;
        if ((textureView == null || !textureView.isAttachedToWindow()) && ((surfaceView = this.e0.d) == null || !surfaceView.isAttachedToWindow())) {
            st stVar = (st) ((gl2) this.H).b;
            TextureView textureView2 = (TextureView) k0(stVar, TextureView.class);
            this.d0 = textureView2;
            fi6 fi6Var = this.e0;
            SurfaceView surfaceView2 = textureView2 == null ? (SurfaceView) k0(stVar, SurfaceView.class) : null;
            if (fi6Var.d != surfaceView2) {
                fi6Var.d = surfaceView2;
                fi6Var.a();
            }
            TextureView textureView3 = this.d0;
            if (textureView3 != null) {
                TextureView.SurfaceTextureListener surfaceTextureListener = textureView3.getSurfaceTextureListener();
                if (!(surfaceTextureListener instanceof na6)) {
                    this.d0.setSurfaceTextureListener(new na6(this, surfaceTextureListener));
                }
            }
            O0();
        }
        TextureView textureView4 = this.d0;
        if (textureView4 == null) {
            this.e0.a();
            return;
        }
        TextureView.SurfaceTextureListener surfaceTextureListener2 = textureView4.getSurfaceTextureListener();
        if (surfaceTextureListener2 instanceof na6) {
            return;
        }
        this.d0.setSurfaceTextureListener(new na6(this, surfaceTextureListener2));
    }

    public final void D0(Location location) {
        if (location == null) {
            return;
        }
        this.z0 = new Location(location);
        la6 la6Var = (la6) this.p0.f(getUserConfig().e());
        db6 h = getLocationController().h(this.m0);
        if (la6Var != null && h != null && la6Var.b.id == h.b) {
            yh5 yh5Var = new yh5(location.getLatitude(), location.getLongitude());
            la6Var.e.b(yh5Var);
            sy4 sy4Var = la6Var.f;
            if (sy4Var != null) {
                sy4Var.b(yh5Var);
            }
            if (this.q0 == la6Var.a) {
                this.F.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLng(la6Var.e.a()));
            }
        }
        if (this.J0 == null && this.H0 == null && this.F != null) {
            yh5 yh5Var2 = new yh5(location.getLatitude(), location.getLongitude());
            ga6 ga6Var = this.Q;
            if (ga6Var != null) {
                ga6Var.M(this.z0);
            }
            if (!this.K0) {
                this.A0 = new Location(location);
                if (this.L0) {
                    this.F.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLng(yh5Var2));
                } else {
                    this.L0 = true;
                    this.F.h(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(yh5Var2, this.F.e() - 4.0f));
                }
            }
        } else {
            this.Q.M(this.z0);
        }
        st8 st8Var = this.O;
        if (st8Var != null) {
            st8Var.c(true);
        }
        sk4 sk4Var = this.L;
        if (sk4Var != null) {
            double latitude = this.z0.getLatitude();
            double longitude = this.z0.getLongitude();
            fh2 fh2Var = (fh2) sk4Var.b;
            LatLng latLng = new LatLng(latitude, longitude);
            fh2Var.getClass();
            try {
                ome omeVar = (ome) fh2Var.a;
                Parcel R = omeVar.R();
                sgd.b(R, latLng);
                omeVar.V(R, 3);
            } catch (RemoteException e) {
                fvc.g(e);
                return;
            }
        }
        xo2 xo2Var = this.C0;
        if (xo2Var != null) {
            xo2Var.a(this.z0);
        }
        P0(true);
        Q0();
    }

    public final void E0(View view) {
        il0 c = getBaseSimpleGlass().c.c(view, null, false);
        c.p(nod.l(getResourceProvider()));
        c.r(gl.L(23.0f));
        c.q(gl.L(6.0f));
        view.setBackground(c);
        ote.a(view);
    }

    public final void F0(k27 k27Var) {
        this.J0 = k27Var;
        this.m0 = k27.B0(k27Var.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G0(la6 la6Var) {
        if (la6Var.h == null) {
            TLRPC.User user = la6Var.c;
            TLRPC.Chat chat = la6Var.d;
            if (user == null && chat == 0) {
                return;
            }
            pb0 pb0Var = new pb0((wjb) null);
            if (user != null) {
                pb0Var.q(user);
            } else {
                pb0Var.p(chat);
            }
            ImageReceiver imageReceiver = new ImageReceiver(null);
            imageReceiver.d = this.currentAccount;
            imageReceiver.h1 = new h45(this, la6Var, (byte) 14);
            imageReceiver.I();
            if (user == null) {
                user = chat;
            }
            imageReceiver.U(user, pb0Var, null);
            la6Var.h = imageReceiver;
        }
    }

    public final void H0(int i, int i2, TLRPC.User user) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = gl.b0(this.z0.getLatitude());
        tL_messageMediaGeoLive.geo._long = gl.b0(this.z0.getLongitude());
        tL_messageMediaGeoLive.heading = eb6.e(this.z0);
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
        st8 st8Var = this.O;
        if (st8Var != null) {
            st8Var.a();
        }
        q0().k(0L, 24, Integer.valueOf(i2), user, null, null);
    }

    public final void I0(boolean z, boolean z2) {
        Boolean bool = this.W0;
        if (bool == null || bool.booleanValue() != z) {
            this.W0 = Boolean.valueOf(z);
            TextView textView = this.b;
            if (z2) {
                textView.setVisibility(0);
                this.b.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.7f).scaleY(z ? 1.0f : 0.7f).setInterpolator(s33.h).setDuration(420L).withEndAction(new x6c((byte) 24, this, z)).start();
            } else {
                textView.setVisibility(z ? 0 : 8);
                this.b.setAlpha(z ? 1.0f : 0.0f);
                this.b.setScaleX(z ? 1.0f : 0.7f);
                this.b.setScaleY(z ? 1.0f : 0.7f);
            }
        }
    }

    public final void J0() {
        if (this.F == null || !this.y0) {
            return;
        }
        xo2 xo2Var = this.C0;
        if (xo2Var == null) {
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
                xo2Var = new xo2(new z96(this, (byte) 3));
                this.C0 = xo2Var;
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        xo2Var.a(this.z0);
        xo2 xo2Var2 = this.C0;
        if (xo2Var2.f) {
            return;
        }
        try {
            if (xo2Var2.b == null) {
                SensorManager sensorManager2 = (SensorManager) org.telegram.messenger.a.b.getSystemService("sensor");
                xo2Var2.b = sensorManager2;
                if (sensorManager2 == null) {
                    return;
                }
                Sensor defaultSensor = sensorManager2.getDefaultSensor(11);
                xo2Var2.c = defaultSensor;
                if (defaultSensor == null) {
                    xo2Var2.d = xo2Var2.b.getDefaultSensor(1);
                    xo2Var2.e = xo2Var2.b.getDefaultSensor(2);
                }
            }
            Sensor sensor = xo2Var2.c;
            if (sensor != null) {
                xo2Var2.b.registerListener(xo2Var2, sensor, 1);
            } else {
                Sensor sensor2 = xo2Var2.d;
                if (sensor2 == null || xo2Var2.e == null) {
                    return;
                }
                xo2Var2.b.registerListener(xo2Var2, sensor2, 1);
                xo2Var2.b.registerListener(xo2Var2, xo2Var2.e, 1);
            }
            xo2Var2.f = true;
            xo2Var2.I = 0L;
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    public final void K0() {
        if (!this.y0 || this.k0) {
            return;
        }
        if (this.G0 == null) {
            oh5 onCreateLocationRequest = ((xl3) org.telegram.messenger.a.i()).onCreateLocationRequest();
            this.F0 = onCreateLocationRequest;
            ((oy4) onCreateLocationRequest).c();
            ((oy4) this.F0).b();
            ((oy4) this.F0).a();
            this.G0 = new z96(this, (byte) 2);
        }
        try {
            ((xl3) org.telegram.messenger.a.i()).requestLocationUpdates(this.F0, this.G0);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void L0() {
        xo2 xo2Var = this.C0;
        if (xo2Var == null || !xo2Var.f) {
            return;
        }
        xo2Var.f = false;
        xo2Var.x = false;
        try {
            xo2Var.b.unregisterListener(xo2Var);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void M0(boolean z) {
        int i;
        int i2;
        FrameLayout.LayoutParams layoutParams;
        s49 K = this.R.K(0);
        if (K != null) {
            i = (int) K.a.getY();
            i2 = Math.min(i, 0) + this.O0;
            this.b0 = (this.O0 + i) - this.h0;
        } else {
            i = -this.P.getMeasuredHeight();
            this.b0 = -gl.L(41.0f);
            i2 = 0;
        }
        this.R.invalidate();
        if (((FrameLayout.LayoutParams) this.P.getLayoutParams()) != null) {
            vh5 vh5Var = this.H;
            if (i2 <= 0) {
                if (((st) ((gl2) vh5Var).b).getVisibility() == 0) {
                    ((st) ((gl2) this.H).b).setVisibility(4);
                    this.P.setVisibility(4);
                }
            } else if (((st) ((gl2) vh5Var).b).getVisibility() == 4) {
                ((st) ((gl2) this.H).b).setVisibility(0);
                this.P.setVisibility(0);
            }
            this.P.setTranslationY(Math.min(0, i));
            int i3 = -i;
            ((st) ((gl2) this.H).b).setTranslationY(Math.max(0, i3 / 2));
            FrameLayout frameLayout = this.X;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-Math.min(0, i));
                float l = Utilities.l((ls6.x(53.0f, i2 - this.h0, gl.L(46.0f) + dg0.d(this.mSystemInsets.b)) - gl.L(7.0f)) / gl.L(48.0f));
                FrameLayout frameLayout2 = this.X;
                frameLayout2.setAlpha(l);
                frameLayout2.setVisibility(l > 0.0f ? 0 : 4);
                FrameLayout frameLayout3 = this.Y;
                frameLayout3.setAlpha(l);
                frameLayout3.setVisibility(l > 0.0f ? 0 : 4);
                O0();
            }
            View view = this.U;
            if (view != null) {
                int L = ((i2 / 2) + (i3 - gl.L(view.getTag() != null ? 69.0f : 48.0f))) - (this.h0 / 2);
                this.B0 = L;
                view.setTranslationY(L);
            }
            if (z || (layoutParams = (FrameLayout.LayoutParams) ((st) ((gl2) this.H).b).getLayoutParams()) == null || layoutParams.height == o0()) {
                return;
            }
            layoutParams.height = o0();
            ty4 ty4Var = this.F;
            if (ty4Var != null) {
                ty4Var.n(gl.L(70.0f), 0, gl.L(70.0f), n0());
            }
            ((st) ((gl2) this.H).b).setLayoutParams(layoutParams);
        }
    }

    public final void N0() {
        if (!this.u0) {
            this.e.setVisibility(8);
            return;
        }
        boolean z = this.w0;
        o39 o39Var = this.S;
        if (!z) {
            o39Var.setEmptyView(this.e);
            return;
        }
        o39Var.setEmptyView(null);
        this.e.setVisibility(8);
        this.S.setVisibility(8);
    }

    public final void O0() {
        vh5 vh5Var;
        a6 a6Var;
        fi6 fi6Var = this.e0;
        if (fi6Var == null || (vh5Var = this.H) == null) {
            return;
        }
        st stVar = (st) ((gl2) vh5Var).b;
        boolean z = this.d0 == null && this.y0 && !isFinishing() && (a6Var = this.P) != null && a6Var.getVisibility() == 0 && stVar.getParent() != null && stVar.getVisibility() == 0;
        if (fi6Var.g != z) {
            fi6Var.g = z;
            if (z) {
                fi6Var.a();
            } else {
                fi6Var.d();
            }
        }
    }

    public final void P0(boolean z) {
        Location location;
        if (this.F == null || (location = this.z0) == null) {
            return;
        }
        xo2 xo2Var = this.C0;
        boolean z2 = xo2Var != null && xo2Var.H;
        try {
            sy4 sy4Var = this.D0;
            int i = R.drawable.map_pin_circle;
            if (sy4Var == null) {
                z24 z24Var = (z24) ((ize) org.telegram.messenger.a.j()).onCreateMarkerOptions();
                ((zi6) z24Var.b).a = new LatLng(this.z0.getLatitude(), this.z0.getLongitude());
                zi6 zi6Var = (zi6) z24Var.b;
                zi6Var.r = true;
                zi6Var.e = 0.5f;
                zi6Var.f = 0.5f;
                zi6Var.d = eod.b(z2 ? R.drawable.map_pin_cone2 : R.drawable.map_pin_circle);
                this.D0 = this.F.a(z24Var);
                this.E0 = z2;
            } else if (z) {
                double latitude = location.getLatitude();
                double longitude = this.z0.getLongitude();
                yi6 yi6Var = sy4Var.a;
                LatLng latLng = new LatLng(latitude, longitude);
                yi6Var.getClass();
                try {
                    rhf rhfVar = (rhf) yi6Var.a;
                    Parcel R = rhfVar.R();
                    sgd.b(R, latLng);
                    rhfVar.V(R, 3);
                } catch (RemoteException e) {
                    throw new gp2(e);
                }
            }
            sy4 sy4Var2 = this.D0;
            if (sy4Var2 != null) {
                if (z2 != this.E0) {
                    if (z2) {
                        i = R.drawable.map_pin_cone2;
                    }
                    sy4Var2.a.a(eod.b(i));
                    this.E0 = z2;
                }
                this.D0.c(z2 ? this.C0.G : 0.0f);
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    public final void Q0() {
        TLRPC.MessageMedia messageMedia;
        int i;
        if (this.b == null) {
            return;
        }
        if (this.r0) {
            I0(false, true);
            l0();
            return;
        }
        int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.Message message = ((la6) arrayList.get(i3)).b;
            if (message != null && (messageMedia = message.media) != null && ((i = messageMedia.period) == Integer.MAX_VALUE || message.date + i > currentTime)) {
                i2++;
            }
        }
        boolean z = this.p0.f(getUserConfig().e()) != null;
        if (this.z0 != null && !z) {
            i2++;
        }
        I0(i2 >= 2, true);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.m5));
        hashSet.add(Integer.valueOf(bkb.Z6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.Ii));
        hashSet.add(Integer.valueOf(bkb.ej));
        hashSet.add(Integer.valueOf(bkb.hj));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.xj));
        hashSet.add(Integer.valueOf(bkb.vj));
        hashSet.add(Integer.valueOf(bkb.wj));
    }

    public final la6 b0(TLRPC.Message message) {
        Location location;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        double d = geoPoint.lat;
        double d2 = geoPoint._long;
        long B1 = k27.B1(message.from_id);
        vf6 vf6Var = this.p0;
        la6 la6Var = (la6) vf6Var.f(B1);
        if (la6Var == null) {
            la6Var = new la6();
            la6Var.b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                la6Var.c = getMessagesController().V1(Long.valueOf(la6Var.b.from_id.user_id));
                la6Var.a = la6Var.b.from_id.user_id;
            } else {
                long B0 = k27.B0(message);
                if (cf3.D(B0)) {
                    la6Var.c = getMessagesController().V1(Long.valueOf(B0));
                } else {
                    la6Var.d = getMessagesController().K0(Long.valueOf(-B0));
                }
                la6Var.a = B0;
            }
            G0(la6Var);
            try {
                z24 z24Var = (z24) ((ize) org.telegram.messenger.a.j()).onCreateMarkerOptions();
                zi6 zi6Var = (zi6) z24Var.b;
                zi6 zi6Var2 = (zi6) z24Var.b;
                zi6Var.a = new LatLng(d, d2);
                Bitmap h0 = h0(la6Var);
                if (h0 != null) {
                    zi6Var2.d = eod.a(h0);
                    zi6Var2.e = 0.5f;
                    zi6Var2.f = 0.8010882f;
                    la6Var.e = this.F.a(z24Var);
                    if (!l7c.C(la6Var.c)) {
                        z24 z24Var2 = (z24) ((ize) org.telegram.messenger.a.j()).onCreateMarkerOptions();
                        ((zi6) z24Var2.b).a = new LatLng(d, d2);
                        zi6 zi6Var3 = (zi6) z24Var2.b;
                        zi6Var3.r = true;
                        zi6Var3.e = 0.5f;
                        zi6Var3.f = 0.5f;
                        sy4 a = this.F.a(z24Var2);
                        la6Var.f = a;
                        int i = message.media.heading;
                        if (i != 0) {
                            a.c(i);
                            la6Var.f.a.a(eod.b(R.drawable.map_pin_cone2));
                            la6Var.g = true;
                        } else {
                            a.c(0.0f);
                            la6Var.f.a.a(eod.b(R.drawable.map_pin_circle));
                            la6Var.g = false;
                        }
                    }
                    this.o0.add(la6Var);
                    vf6Var.k(la6Var, la6Var.a);
                    db6 h = getLocationController().h(this.m0);
                    if (la6Var.a == getUserConfig().e() && h != null && la6Var.b.id == h.b && (location = this.z0) != null) {
                        double latitude = location.getLatitude();
                        double longitude = this.z0.getLongitude();
                        yi6 yi6Var = la6Var.e.a;
                        LatLng latLng = new LatLng(latitude, longitude);
                        yi6Var.getClass();
                        try {
                            rhf rhfVar = (rhf) yi6Var.a;
                            Parcel R = rhfVar.R();
                            sgd.b(R, latLng);
                            rhfVar.V(R, 3);
                        } catch (RemoteException e) {
                            throw new gp2(e);
                        }
                    }
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        } else {
            la6Var.b = message;
            yi6 yi6Var2 = la6Var.e.a;
            LatLng latLng2 = new LatLng(d, d2);
            yi6Var2.getClass();
            try {
                rhf rhfVar2 = (rhf) yi6Var2.a;
                Parcel R2 = rhfVar2.R();
                sgd.b(R2, latLng2);
                rhfVar2.V(R2, 3);
                if (this.q0 == la6Var.a) {
                    this.F.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLng(la6Var.e.a()));
                }
            } catch (RemoteException e3) {
                fvc.g(e3);
                return null;
            }
        }
        st8 st8Var = this.O;
        if (st8Var != null) {
            st8Var.c(true);
        }
        Q0();
        return la6Var;
    }

    public final void c0() {
        if (this.fragmentView == null || this.R == null) {
            return;
        }
        io5 io5Var = this.mSystemInsets;
        int i = io5Var.b;
        int i2 = io5Var.d;
        FrameLayout frameLayout = this.X;
        if (frameLayout != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            int d = dg0.d(i) - gl.L(6.0f);
            if (layoutParams.topMargin != d) {
                layoutParams.topMargin = d;
                this.X.requestLayout();
            }
        }
        this.R.setClipToPadding(false);
        this.R.setPadding(0, 0, 0, i2);
        o39 o39Var = this.S;
        if (o39Var != null) {
            o39Var.setClipToPadding(false);
            dg0.e(this.S, i, i2, a.getCurrentActionBarHeight(), 0);
        }
        if (this.fragmentView.getMeasuredHeight() > 0) {
            m0(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0836, code lost:
    
        if (r30.H0 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0838, code lost:
    
        r0 = r30.H0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x083a, code lost:
    
        if (r0 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x083c, code lost:
    
        r30.Q.P = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0841, code lost:
    
        r0 = r30.J0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0843, code lost:
    
        if (r0 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0845, code lost:
    
        r3 = r30.Q;
        r3.O = r0;
        r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0832, code lost:
    
        if (r0.C3() != false) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0769  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z;
        k27 k27Var;
        k27 k27Var2;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        final byte b = 0;
        this.v0 = false;
        this.u0 = false;
        this.w0 = false;
        ga6 ga6Var = this.Q;
        if (ga6Var != null) {
            ga6Var.F();
        }
        a42 a42Var = this.T;
        if (a42Var != null) {
            a42Var.F();
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
        final byte b2 = 1;
        this.k0 = (getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ea6(this));
        wha t = this.simpleActionBar.t();
        xha a = t.a(0, R.drawable.msg_map_type);
        this.d = a;
        final byte b3 = 2;
        a.e(2, R.drawable.msg_map, k96.M0(2131748498, null));
        this.d.e(3, R.drawable.msg_satellite, k96.M0(2131745756, null));
        this.d.e(4, R.drawable.msg_hybrid, k96.M0(2131749083, null));
        this.d.setContentDescription(k96.M0(2131754838, null));
        TLRPC.TL_channelLocation tL_channelLocation = this.H0;
        byte b4 = this.N0;
        if (tL_channelLocation != null) {
            this.simpleActionBar.setTitle(k96.M0(2131752208, null));
        } else {
            k27 k27Var3 = this.J0;
            if (k27Var3 == null) {
                this.simpleActionBar.setTitle(k96.M0(2131745264, null));
                if (b4 != 4) {
                    xha a2 = t.a(0, R.drawable.outline_header_search);
                    a2.N();
                    a2.C0 = new q10(this, (byte) 15);
                    this.r = a2;
                    a2.setSearchFieldHint(k96.M0(2131745644, null));
                    this.r.setContentDescription(k96.M0(2131745644, null));
                }
            } else if (k27Var3.C3()) {
                this.simpleActionBar.setTitle(k96.M0(2131753963, null));
                xha a3 = t.a(0, R.drawable.ic_ab_other);
                this.W = a3;
                a3.e(6, R.drawable.filled_directions, k96.M0(2131750457, null));
            } else {
                if (b4 != 3) {
                    String str = this.J0.k.media.title;
                    if (str == null || str.length() <= 0) {
                        this.simpleActionBar.setTitle(k96.M0(2131752208, null));
                    } else {
                        this.simpleActionBar.setTitle(k96.M0(2131745212, null));
                    }
                }
                if (b4 != 3) {
                    xha a4 = t.a(0, R.drawable.ic_ab_other);
                    this.W = a4;
                    a4.e(1, R.drawable.msg_openin, k96.M0(2131747603, null));
                    if (!getLocationController().i(this.m0) && this.V0) {
                        this.W.e(5, R.drawable.msg_location, k96.M0(2131745420, null));
                    }
                    this.W.setContentDescription(k96.M0(2131754838, null));
                }
            }
        }
        FrameLayout oa6Var = new oa6(this, context);
        this.fragmentView = oa6Var;
        int i = bkb.g5;
        zkb.h(i, getResourceProvider(), oa6Var);
        this.h0 = gl.L((b4 == 0 || b4 == 1) ? 26.0f : 16.0f);
        a6 a6Var = new a6(context, (byte) 18);
        this.P = a6Var;
        a6Var.setBackgroundDrawable(new qa1(r0()));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        this.P.addView(frameLayout, nme.e(-1, -2, 51));
        this.Y = new FrameLayout(context);
        FrameLayout.LayoutParams e = nme.e(-1, -2, 83);
        e.bottomMargin = gl.L(1.0f) + gl.L(29.0f) + this.h0;
        this.P.addView(this.Y, e);
        if (this.J0 != null && b4 == 3) {
            TextView textView = new TextView(context);
            E0(textView);
            zkb.X(textView, bkb.lj, getResourceProvider());
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(gl.o());
            textView.setGravity(17);
            textView.setPadding(gl.L(24.0f), 0, gl.L(24.0f), 0);
            this.simpleActionBar.addView(textView, nme.e(-2, 58, 1));
            textView.setText(k96.M0(2131747602, null));
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: v96
                public final /* synthetic */ qa6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ty4 ty4Var;
                    byte b5 = b2;
                    byte b6 = 4;
                    qa6 qa6Var = this.b;
                    byte b7 = 1;
                    switch (b5) {
                        case 0:
                            if (qa6Var.getParentActivity() != null && qa6Var.z0 != null && qa6Var.f0() && qa6Var.F != null) {
                                je5 je5Var = qa6Var.s;
                                if (je5Var != null) {
                                    je5Var.f(true);
                                }
                                na7.c1().edit().putInt("proximityhint", 3).commit();
                                db6 h = qa6Var.getLocationController().h(qa6Var.m0);
                                if (qa6Var.y) {
                                    qa6Var.x[0].d(1, true);
                                }
                                if (h != null && h.f > 0) {
                                    qa6Var.c.setImageResource(R.drawable.msg_location_alert);
                                    sk4 sk4Var = qa6Var.L;
                                    if (sk4Var != null) {
                                        sk4Var.j0();
                                        qa6Var.L = null;
                                    }
                                    qa6Var.y = true;
                                    qa6Var.q0().k(0L, 25, 0, null, new t96(qa6Var, (byte) 3), new kz5(qa6Var, h, (byte) 13));
                                    break;
                                } else {
                                    sk4 sk4Var2 = qa6Var.L;
                                    byte b8 = 6;
                                    if (sk4Var2 == null) {
                                        qa6Var.g0(500);
                                    } else {
                                        fh2 fh2Var = (fh2) sk4Var2.b;
                                        fh2Var.getClass();
                                        try {
                                            ome omeVar = (ome) fh2Var.a;
                                            Parcel Q = omeVar.Q(omeVar.R(), 6);
                                            double readDouble = Q.readDouble();
                                            Q.recycle();
                                            qa6Var.M = readDouble;
                                        } catch (RemoteException e2) {
                                            fvc.g(e2);
                                            return;
                                        }
                                    }
                                    TLRPC.User V1 = cf3.D(qa6Var.m0) ? qa6Var.getMessagesController().V1(Long.valueOf(qa6Var.m0)) : null;
                                    Activity parentActivity = qa6Var.getParentActivity();
                                    z96 z96Var = new z96(qa6Var, b8);
                                    h45 h45Var = new h45(qa6Var, V1, (byte) 15);
                                    t96 t96Var = new t96(qa6Var, (byte) 4);
                                    st8 st8Var = new st8(parentActivity);
                                    st8Var.a = null;
                                    st8Var.d = -1;
                                    st8Var.e = false;
                                    st8Var.f = false;
                                    st8Var.h = null;
                                    st8Var.n = new Rect();
                                    st8Var.x = true;
                                    st8Var.G = s33.h;
                                    st8Var.setWillNotDraw(false);
                                    st8Var.R = t96Var;
                                    st8Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                    Rect rect = new Rect();
                                    Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                    zkb.x(st8Var, mutate, bkb.g5, null, PorterDuff.Mode.MULTIPLY);
                                    mutate.getPadding(rect);
                                    int i2 = rect.left;
                                    st8Var.y = i2;
                                    ot8 ot8Var = new ot8(st8Var.getContext());
                                    st8Var.w = ot8Var;
                                    ot8Var.setBackgroundDrawable(mutate);
                                    ot8Var.setPadding(i2, (gl.L(8.0f) + rect.top) - 1, i2, 0);
                                    ot8Var.setVisibility(4);
                                    st8Var.addView(ot8Var, 0, nme.e(-1, -2, 80));
                                    k96.l();
                                    st8Var.P = k96.g0.booleanValue();
                                    st8Var.N = V1;
                                    st8Var.J = z96Var;
                                    hn7 hn7Var = new hn7(parentActivity, null);
                                    st8Var.H = hn7Var;
                                    hn7Var.setTextOffset(gl.L(10.0f));
                                    hn7Var.setItemCount(5);
                                    hn7 hn7Var2 = new hn7(parentActivity, null);
                                    st8Var.I = hn7Var2;
                                    hn7Var2.setItemCount(5);
                                    hn7Var2.setTextOffset(-gl.L(10.0f));
                                    pt8 pt8Var = new pt8(st8Var, parentActivity);
                                    st8Var.Q = pt8Var;
                                    pt8Var.setOrientation(1);
                                    FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                    pt8Var.addView(frameLayout2, nme.t(-1, -2, 51, 22, 0, 0, 4));
                                    TextView textView2 = new TextView(parentActivity);
                                    textView2.setText(k96.M0(2131748564, null));
                                    tb4.w(textView2, bkb.i5, null, 1, 20.0f);
                                    frameLayout2.addView(textView2, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                    textView2.setOnTouchListener(new jz1((byte) 22));
                                    LinearLayout linearLayout = new LinearLayout(parentActivity);
                                    linearLayout.setOrientation(0);
                                    linearLayout.setWeightSum(1.0f);
                                    pt8Var.addView(linearLayout, nme.o(-1, -2));
                                    System.currentTimeMillis();
                                    FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                    TextView textView3 = new TextView(parentActivity);
                                    st8Var.L = textView3;
                                    qt8 qt8Var = new qt8(parentActivity);
                                    st8Var.K = qt8Var;
                                    linearLayout.addView(hn7Var, nme.l(0.5f, 0, kk7.s4));
                                    hn7Var.setFormatter(new nt8(st8Var, (byte) 0));
                                    hn7Var.setMinValue(0);
                                    hn7Var.setMaxValue(10);
                                    hn7Var.setWrapSelectorWheel(false);
                                    hn7Var.setTextOffset(gl.L(20.0f));
                                    nt8 nt8Var = new nt8(st8Var, (byte) 1);
                                    hn7Var.setOnValueChangedListener(nt8Var);
                                    hn7Var2.setMinValue(0);
                                    hn7Var2.setMaxValue(10);
                                    hn7Var2.setWrapSelectorWheel(false);
                                    hn7Var2.setTextOffset(-gl.L(20.0f));
                                    linearLayout.addView(hn7Var2, nme.l(0.5f, 0, kk7.s4));
                                    hn7Var2.setFormatter(new nt8(st8Var, (byte) 2));
                                    hn7Var2.setOnValueChangedListener(nt8Var);
                                    hn7Var.setValue(0);
                                    hn7Var2.setValue(6);
                                    pt8Var.addView(frameLayout3, nme.t(-1, 48, 83, 16, 15, 16, 16));
                                    qt8Var.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                                    qt8Var.setGravity(17);
                                    zkb.X(qt8Var, bkb.Ii, null);
                                    qt8Var.setTextSize(1, 14.0f);
                                    qt8Var.setMaxLines(2);
                                    qt8Var.setTypeface(gl.o());
                                    qt8Var.setBackgroundDrawable(sjb.f(bkb.Ei, 4.0f));
                                    frameLayout3.addView(qt8Var, nme.c(48.0f, -1));
                                    qt8Var.setOnClickListener(new v16(st8Var, h45Var, (byte) 25));
                                    textView3.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                                    textView3.setGravity(17);
                                    zkb.X(textView3, bkb.p5, null);
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setAlpha(0.0f);
                                    textView3.setScaleX(0.5f);
                                    textView3.setScaleY(0.5f);
                                    frameLayout3.addView(textView3, nme.c(48.0f, -1));
                                    ot8Var.addView(pt8Var, nme.e(-1, -2, 51));
                                    qa6Var.O = st8Var;
                                    ((FrameLayout) qa6Var.fragmentView).addView(st8Var, nme.c(-1.0f, -1));
                                    st8 st8Var2 = qa6Var.O;
                                    st8Var2.r = false;
                                    AnimatorSet animatorSet = st8Var2.s;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        st8Var2.s = null;
                                    }
                                    ot8 ot8Var2 = st8Var2.w;
                                    Point point = gl.q;
                                    ot8Var2.measure(View.MeasureSpec.makeMeasureSpec(point.x + (st8Var2.y << 1), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                                    if (!st8Var2.r) {
                                        ot8Var2.setVisibility(0);
                                        if (st8Var2.x) {
                                            st8Var2.setLayerType(2, null);
                                        }
                                        ot8Var2.setTranslationY(ot8Var2.getMeasuredHeight());
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        st8Var2.s = animatorSet2;
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(ot8Var2, (Property<ot8, Float>) View.TRANSLATION_Y, 0.0f));
                                        st8Var2.s.setDuration(400L);
                                        st8Var2.s.setStartDelay(20L);
                                        st8Var2.s.setInterpolator(st8Var2.G);
                                        st8Var2.s.addListener(new rt8(st8Var2, b7));
                                        kk7.e().k(98, 512);
                                        st8Var2.s.start();
                                    }
                                    st8Var2.c(true);
                                    break;
                                }
                            }
                            break;
                        case 1:
                            try {
                                TLRPC.GeoPoint geoPoint = qa6Var.J0.k.media.geo;
                                double d = geoPoint.lat;
                                double d2 = geoPoint._long;
                                qa6Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                                break;
                            } catch (Exception e3) {
                                fa4.g(e3, true);
                                return;
                            }
                        case 2:
                            byte b9 = qa6Var.N0;
                            Activity parentActivity2 = qa6Var.getParentActivity();
                            if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                                if (qa6Var.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qa6Var.getParentActivity());
                                    int i3 = bkb.K5;
                                    alertDialog$Builder.l(R.raw.permission_request_location, 72, qa6Var.getThemedColor(i3), null);
                                    alertDialog$Builder.m(i3, qa6Var.getResourceProvider());
                                    SpannableStringBuilder T2 = gl.T2(k96.M0(2131747111, null));
                                    hd hdVar = alertDialog$Builder.a;
                                    hdVar.U = T2;
                                    alertDialog$Builder.g(k96.M0(2131747107, null), new z96(qa6Var, b6));
                                    alertDialog$Builder.j(k96.M0(2131747638, null), null);
                                    qa6Var.showDialog(hdVar);
                                    break;
                                }
                            } else if (qa6Var.f0() || b9 == 3) {
                                if ((qa6Var.J0 != null && b9 != 3) || qa6Var.H0 != null) {
                                    if (qa6Var.z0 != null && (ty4Var = qa6Var.F) != null) {
                                        ty4Var.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(new yh5(qa6Var.z0.getLatitude(), qa6Var.z0.getLongitude()), qa6Var.F.e() - 4.0f));
                                        break;
                                    }
                                } else if (qa6Var.z0 != null && qa6Var.F != null) {
                                    ImageView imageView = qa6Var.a;
                                    int i4 = bkb.lj;
                                    zkb.s(imageView, i4, qa6Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                    qa6Var.a.setTag(Integer.valueOf(i4));
                                    qa6Var.Q.L(null);
                                    qa6Var.K0 = false;
                                    qa6Var.F.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLng(new yh5(qa6Var.z0.getLatitude(), qa6Var.z0.getLongitude())));
                                    break;
                                }
                            }
                            break;
                        default:
                            qa6Var.q0 = -1L;
                            qa6Var.K0 = true;
                            if (qa6Var.l0()) {
                                qa6Var.r0 = true;
                                qa6Var.I0(false, true);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        jia titleTextView = this.simpleActionBar.getTitleTextView();
        if (titleTextView != null) {
            il0 c = getBaseSimpleGlass().c.c(titleTextView, null, false);
            c.p(nod.l(getResourceProvider()));
            c.r(gl.L(23.0f));
            titleTextView.setBackground(c);
            Paint.FontMetricsInt fontMetricsInt = titleTextView.getTextPaint().getFontMetricsInt();
            int max = Math.max(0, (gl.L(46.0f) - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
            titleTextView.setPadding(gl.L(18.0f), max, gl.L(18.0f), max);
        }
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        E0(imageView);
        this.a.setImageResource(R.drawable.msg_current_location);
        ImageView imageView2 = this.a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.a;
        int i2 = bkb.lj;
        wjb resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView3, i2, resourceProvider, mode);
        this.a.setTag(Integer.valueOf(i2));
        this.a.setContentDescription(k96.M0(2131754830, null));
        this.Y.addView(this.a, nme.e(58, 58, 85));
        this.a.setOnClickListener(new View.OnClickListener(this) { // from class: v96
            public final /* synthetic */ qa6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ty4 ty4Var;
                byte b5 = b3;
                byte b6 = 4;
                qa6 qa6Var = this.b;
                byte b7 = 1;
                switch (b5) {
                    case 0:
                        if (qa6Var.getParentActivity() != null && qa6Var.z0 != null && qa6Var.f0() && qa6Var.F != null) {
                            je5 je5Var = qa6Var.s;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            na7.c1().edit().putInt("proximityhint", 3).commit();
                            db6 h = qa6Var.getLocationController().h(qa6Var.m0);
                            if (qa6Var.y) {
                                qa6Var.x[0].d(1, true);
                            }
                            if (h != null && h.f > 0) {
                                qa6Var.c.setImageResource(R.drawable.msg_location_alert);
                                sk4 sk4Var = qa6Var.L;
                                if (sk4Var != null) {
                                    sk4Var.j0();
                                    qa6Var.L = null;
                                }
                                qa6Var.y = true;
                                qa6Var.q0().k(0L, 25, 0, null, new t96(qa6Var, (byte) 3), new kz5(qa6Var, h, (byte) 13));
                                break;
                            } else {
                                sk4 sk4Var2 = qa6Var.L;
                                byte b8 = 6;
                                if (sk4Var2 == null) {
                                    qa6Var.g0(500);
                                } else {
                                    fh2 fh2Var = (fh2) sk4Var2.b;
                                    fh2Var.getClass();
                                    try {
                                        ome omeVar = (ome) fh2Var.a;
                                        Parcel Q = omeVar.Q(omeVar.R(), 6);
                                        double readDouble = Q.readDouble();
                                        Q.recycle();
                                        qa6Var.M = readDouble;
                                    } catch (RemoteException e2) {
                                        fvc.g(e2);
                                        return;
                                    }
                                }
                                TLRPC.User V1 = cf3.D(qa6Var.m0) ? qa6Var.getMessagesController().V1(Long.valueOf(qa6Var.m0)) : null;
                                Activity parentActivity = qa6Var.getParentActivity();
                                z96 z96Var = new z96(qa6Var, b8);
                                h45 h45Var = new h45(qa6Var, V1, (byte) 15);
                                t96 t96Var = new t96(qa6Var, (byte) 4);
                                st8 st8Var = new st8(parentActivity);
                                st8Var.a = null;
                                st8Var.d = -1;
                                st8Var.e = false;
                                st8Var.f = false;
                                st8Var.h = null;
                                st8Var.n = new Rect();
                                st8Var.x = true;
                                st8Var.G = s33.h;
                                st8Var.setWillNotDraw(false);
                                st8Var.R = t96Var;
                                st8Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect = new Rect();
                                Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                zkb.x(st8Var, mutate, bkb.g5, null, PorterDuff.Mode.MULTIPLY);
                                mutate.getPadding(rect);
                                int i22 = rect.left;
                                st8Var.y = i22;
                                ot8 ot8Var = new ot8(st8Var.getContext());
                                st8Var.w = ot8Var;
                                ot8Var.setBackgroundDrawable(mutate);
                                ot8Var.setPadding(i22, (gl.L(8.0f) + rect.top) - 1, i22, 0);
                                ot8Var.setVisibility(4);
                                st8Var.addView(ot8Var, 0, nme.e(-1, -2, 80));
                                k96.l();
                                st8Var.P = k96.g0.booleanValue();
                                st8Var.N = V1;
                                st8Var.J = z96Var;
                                hn7 hn7Var = new hn7(parentActivity, null);
                                st8Var.H = hn7Var;
                                hn7Var.setTextOffset(gl.L(10.0f));
                                hn7Var.setItemCount(5);
                                hn7 hn7Var2 = new hn7(parentActivity, null);
                                st8Var.I = hn7Var2;
                                hn7Var2.setItemCount(5);
                                hn7Var2.setTextOffset(-gl.L(10.0f));
                                pt8 pt8Var = new pt8(st8Var, parentActivity);
                                st8Var.Q = pt8Var;
                                pt8Var.setOrientation(1);
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                pt8Var.addView(frameLayout2, nme.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView2 = new TextView(parentActivity);
                                textView2.setText(k96.M0(2131748564, null));
                                tb4.w(textView2, bkb.i5, null, 1, 20.0f);
                                frameLayout2.addView(textView2, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView2.setOnTouchListener(new jz1((byte) 22));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                pt8Var.addView(linearLayout, nme.o(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                TextView textView3 = new TextView(parentActivity);
                                st8Var.L = textView3;
                                qt8 qt8Var = new qt8(parentActivity);
                                st8Var.K = qt8Var;
                                linearLayout.addView(hn7Var, nme.l(0.5f, 0, kk7.s4));
                                hn7Var.setFormatter(new nt8(st8Var, (byte) 0));
                                hn7Var.setMinValue(0);
                                hn7Var.setMaxValue(10);
                                hn7Var.setWrapSelectorWheel(false);
                                hn7Var.setTextOffset(gl.L(20.0f));
                                nt8 nt8Var = new nt8(st8Var, (byte) 1);
                                hn7Var.setOnValueChangedListener(nt8Var);
                                hn7Var2.setMinValue(0);
                                hn7Var2.setMaxValue(10);
                                hn7Var2.setWrapSelectorWheel(false);
                                hn7Var2.setTextOffset(-gl.L(20.0f));
                                linearLayout.addView(hn7Var2, nme.l(0.5f, 0, kk7.s4));
                                hn7Var2.setFormatter(new nt8(st8Var, (byte) 2));
                                hn7Var2.setOnValueChangedListener(nt8Var);
                                hn7Var.setValue(0);
                                hn7Var2.setValue(6);
                                pt8Var.addView(frameLayout3, nme.t(-1, 48, 83, 16, 15, 16, 16));
                                qt8Var.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                                qt8Var.setGravity(17);
                                zkb.X(qt8Var, bkb.Ii, null);
                                qt8Var.setTextSize(1, 14.0f);
                                qt8Var.setMaxLines(2);
                                qt8Var.setTypeface(gl.o());
                                qt8Var.setBackgroundDrawable(sjb.f(bkb.Ei, 4.0f));
                                frameLayout3.addView(qt8Var, nme.c(48.0f, -1));
                                qt8Var.setOnClickListener(new v16(st8Var, h45Var, (byte) 25));
                                textView3.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                                textView3.setGravity(17);
                                zkb.X(textView3, bkb.p5, null);
                                textView3.setTextSize(1, 14.0f);
                                textView3.setAlpha(0.0f);
                                textView3.setScaleX(0.5f);
                                textView3.setScaleY(0.5f);
                                frameLayout3.addView(textView3, nme.c(48.0f, -1));
                                ot8Var.addView(pt8Var, nme.e(-1, -2, 51));
                                qa6Var.O = st8Var;
                                ((FrameLayout) qa6Var.fragmentView).addView(st8Var, nme.c(-1.0f, -1));
                                st8 st8Var2 = qa6Var.O;
                                st8Var2.r = false;
                                AnimatorSet animatorSet = st8Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    st8Var2.s = null;
                                }
                                ot8 ot8Var2 = st8Var2.w;
                                Point point = gl.q;
                                ot8Var2.measure(View.MeasureSpec.makeMeasureSpec(point.x + (st8Var2.y << 1), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                                if (!st8Var2.r) {
                                    ot8Var2.setVisibility(0);
                                    if (st8Var2.x) {
                                        st8Var2.setLayerType(2, null);
                                    }
                                    ot8Var2.setTranslationY(ot8Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    st8Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(ot8Var2, (Property<ot8, Float>) View.TRANSLATION_Y, 0.0f));
                                    st8Var2.s.setDuration(400L);
                                    st8Var2.s.setStartDelay(20L);
                                    st8Var2.s.setInterpolator(st8Var2.G);
                                    st8Var2.s.addListener(new rt8(st8Var2, b7));
                                    kk7.e().k(98, 512);
                                    st8Var2.s.start();
                                }
                                st8Var2.c(true);
                                break;
                            }
                        }
                        break;
                    case 1:
                        try {
                            TLRPC.GeoPoint geoPoint = qa6Var.J0.k.media.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            qa6Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                            break;
                        } catch (Exception e3) {
                            fa4.g(e3, true);
                            return;
                        }
                    case 2:
                        byte b9 = qa6Var.N0;
                        Activity parentActivity2 = qa6Var.getParentActivity();
                        if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (qa6Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qa6Var.getParentActivity());
                                int i3 = bkb.K5;
                                alertDialog$Builder.l(R.raw.permission_request_location, 72, qa6Var.getThemedColor(i3), null);
                                alertDialog$Builder.m(i3, qa6Var.getResourceProvider());
                                SpannableStringBuilder T2 = gl.T2(k96.M0(2131747111, null));
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.U = T2;
                                alertDialog$Builder.g(k96.M0(2131747107, null), new z96(qa6Var, b6));
                                alertDialog$Builder.j(k96.M0(2131747638, null), null);
                                qa6Var.showDialog(hdVar);
                                break;
                            }
                        } else if (qa6Var.f0() || b9 == 3) {
                            if ((qa6Var.J0 != null && b9 != 3) || qa6Var.H0 != null) {
                                if (qa6Var.z0 != null && (ty4Var = qa6Var.F) != null) {
                                    ty4Var.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(new yh5(qa6Var.z0.getLatitude(), qa6Var.z0.getLongitude()), qa6Var.F.e() - 4.0f));
                                    break;
                                }
                            } else if (qa6Var.z0 != null && qa6Var.F != null) {
                                ImageView imageView4 = qa6Var.a;
                                int i4 = bkb.lj;
                                zkb.s(imageView4, i4, qa6Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                qa6Var.a.setTag(Integer.valueOf(i4));
                                qa6Var.Q.L(null);
                                qa6Var.K0 = false;
                                qa6Var.F.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLng(new yh5(qa6Var.z0.getLatitude(), qa6Var.z0.getLongitude())));
                                break;
                            }
                        }
                        break;
                    default:
                        qa6Var.q0 = -1L;
                        qa6Var.K0 = true;
                        if (qa6Var.l0()) {
                            qa6Var.r0 = true;
                            qa6Var.I0(false, true);
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        this.b = textView2;
        E0(textView2);
        this.b.setGravity(17);
        this.b.setTextSize(1, 15.0f);
        zkb.X(this.b, bkb.Ei, this.resourceProvider);
        this.b.setTypeface(gl.o());
        this.b.setPadding(gl.L(22.0f), 0, gl.L(22.0f), 0);
        this.b.setText(k96.M0(2131748552, null));
        this.Y.addView(this.b, nme.e(-2, 58, 81));
        final byte b5 = 3;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: v96
            public final /* synthetic */ qa6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ty4 ty4Var;
                byte b52 = b5;
                byte b6 = 4;
                qa6 qa6Var = this.b;
                byte b7 = 1;
                switch (b52) {
                    case 0:
                        if (qa6Var.getParentActivity() != null && qa6Var.z0 != null && qa6Var.f0() && qa6Var.F != null) {
                            je5 je5Var = qa6Var.s;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            na7.c1().edit().putInt("proximityhint", 3).commit();
                            db6 h = qa6Var.getLocationController().h(qa6Var.m0);
                            if (qa6Var.y) {
                                qa6Var.x[0].d(1, true);
                            }
                            if (h != null && h.f > 0) {
                                qa6Var.c.setImageResource(R.drawable.msg_location_alert);
                                sk4 sk4Var = qa6Var.L;
                                if (sk4Var != null) {
                                    sk4Var.j0();
                                    qa6Var.L = null;
                                }
                                qa6Var.y = true;
                                qa6Var.q0().k(0L, 25, 0, null, new t96(qa6Var, (byte) 3), new kz5(qa6Var, h, (byte) 13));
                                break;
                            } else {
                                sk4 sk4Var2 = qa6Var.L;
                                byte b8 = 6;
                                if (sk4Var2 == null) {
                                    qa6Var.g0(500);
                                } else {
                                    fh2 fh2Var = (fh2) sk4Var2.b;
                                    fh2Var.getClass();
                                    try {
                                        ome omeVar = (ome) fh2Var.a;
                                        Parcel Q = omeVar.Q(omeVar.R(), 6);
                                        double readDouble = Q.readDouble();
                                        Q.recycle();
                                        qa6Var.M = readDouble;
                                    } catch (RemoteException e2) {
                                        fvc.g(e2);
                                        return;
                                    }
                                }
                                TLRPC.User V1 = cf3.D(qa6Var.m0) ? qa6Var.getMessagesController().V1(Long.valueOf(qa6Var.m0)) : null;
                                Activity parentActivity = qa6Var.getParentActivity();
                                z96 z96Var = new z96(qa6Var, b8);
                                h45 h45Var = new h45(qa6Var, V1, (byte) 15);
                                t96 t96Var = new t96(qa6Var, (byte) 4);
                                st8 st8Var = new st8(parentActivity);
                                st8Var.a = null;
                                st8Var.d = -1;
                                st8Var.e = false;
                                st8Var.f = false;
                                st8Var.h = null;
                                st8Var.n = new Rect();
                                st8Var.x = true;
                                st8Var.G = s33.h;
                                st8Var.setWillNotDraw(false);
                                st8Var.R = t96Var;
                                st8Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect = new Rect();
                                Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                zkb.x(st8Var, mutate, bkb.g5, null, PorterDuff.Mode.MULTIPLY);
                                mutate.getPadding(rect);
                                int i22 = rect.left;
                                st8Var.y = i22;
                                ot8 ot8Var = new ot8(st8Var.getContext());
                                st8Var.w = ot8Var;
                                ot8Var.setBackgroundDrawable(mutate);
                                ot8Var.setPadding(i22, (gl.L(8.0f) + rect.top) - 1, i22, 0);
                                ot8Var.setVisibility(4);
                                st8Var.addView(ot8Var, 0, nme.e(-1, -2, 80));
                                k96.l();
                                st8Var.P = k96.g0.booleanValue();
                                st8Var.N = V1;
                                st8Var.J = z96Var;
                                hn7 hn7Var = new hn7(parentActivity, null);
                                st8Var.H = hn7Var;
                                hn7Var.setTextOffset(gl.L(10.0f));
                                hn7Var.setItemCount(5);
                                hn7 hn7Var2 = new hn7(parentActivity, null);
                                st8Var.I = hn7Var2;
                                hn7Var2.setItemCount(5);
                                hn7Var2.setTextOffset(-gl.L(10.0f));
                                pt8 pt8Var = new pt8(st8Var, parentActivity);
                                st8Var.Q = pt8Var;
                                pt8Var.setOrientation(1);
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                pt8Var.addView(frameLayout2, nme.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView22 = new TextView(parentActivity);
                                textView22.setText(k96.M0(2131748564, null));
                                tb4.w(textView22, bkb.i5, null, 1, 20.0f);
                                frameLayout2.addView(textView22, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView22.setOnTouchListener(new jz1((byte) 22));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                pt8Var.addView(linearLayout, nme.o(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                TextView textView3 = new TextView(parentActivity);
                                st8Var.L = textView3;
                                qt8 qt8Var = new qt8(parentActivity);
                                st8Var.K = qt8Var;
                                linearLayout.addView(hn7Var, nme.l(0.5f, 0, kk7.s4));
                                hn7Var.setFormatter(new nt8(st8Var, (byte) 0));
                                hn7Var.setMinValue(0);
                                hn7Var.setMaxValue(10);
                                hn7Var.setWrapSelectorWheel(false);
                                hn7Var.setTextOffset(gl.L(20.0f));
                                nt8 nt8Var = new nt8(st8Var, (byte) 1);
                                hn7Var.setOnValueChangedListener(nt8Var);
                                hn7Var2.setMinValue(0);
                                hn7Var2.setMaxValue(10);
                                hn7Var2.setWrapSelectorWheel(false);
                                hn7Var2.setTextOffset(-gl.L(20.0f));
                                linearLayout.addView(hn7Var2, nme.l(0.5f, 0, kk7.s4));
                                hn7Var2.setFormatter(new nt8(st8Var, (byte) 2));
                                hn7Var2.setOnValueChangedListener(nt8Var);
                                hn7Var.setValue(0);
                                hn7Var2.setValue(6);
                                pt8Var.addView(frameLayout3, nme.t(-1, 48, 83, 16, 15, 16, 16));
                                qt8Var.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                                qt8Var.setGravity(17);
                                zkb.X(qt8Var, bkb.Ii, null);
                                qt8Var.setTextSize(1, 14.0f);
                                qt8Var.setMaxLines(2);
                                qt8Var.setTypeface(gl.o());
                                qt8Var.setBackgroundDrawable(sjb.f(bkb.Ei, 4.0f));
                                frameLayout3.addView(qt8Var, nme.c(48.0f, -1));
                                qt8Var.setOnClickListener(new v16(st8Var, h45Var, (byte) 25));
                                textView3.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                                textView3.setGravity(17);
                                zkb.X(textView3, bkb.p5, null);
                                textView3.setTextSize(1, 14.0f);
                                textView3.setAlpha(0.0f);
                                textView3.setScaleX(0.5f);
                                textView3.setScaleY(0.5f);
                                frameLayout3.addView(textView3, nme.c(48.0f, -1));
                                ot8Var.addView(pt8Var, nme.e(-1, -2, 51));
                                qa6Var.O = st8Var;
                                ((FrameLayout) qa6Var.fragmentView).addView(st8Var, nme.c(-1.0f, -1));
                                st8 st8Var2 = qa6Var.O;
                                st8Var2.r = false;
                                AnimatorSet animatorSet = st8Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    st8Var2.s = null;
                                }
                                ot8 ot8Var2 = st8Var2.w;
                                Point point = gl.q;
                                ot8Var2.measure(View.MeasureSpec.makeMeasureSpec(point.x + (st8Var2.y << 1), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                                if (!st8Var2.r) {
                                    ot8Var2.setVisibility(0);
                                    if (st8Var2.x) {
                                        st8Var2.setLayerType(2, null);
                                    }
                                    ot8Var2.setTranslationY(ot8Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    st8Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(ot8Var2, (Property<ot8, Float>) View.TRANSLATION_Y, 0.0f));
                                    st8Var2.s.setDuration(400L);
                                    st8Var2.s.setStartDelay(20L);
                                    st8Var2.s.setInterpolator(st8Var2.G);
                                    st8Var2.s.addListener(new rt8(st8Var2, b7));
                                    kk7.e().k(98, 512);
                                    st8Var2.s.start();
                                }
                                st8Var2.c(true);
                                break;
                            }
                        }
                        break;
                    case 1:
                        try {
                            TLRPC.GeoPoint geoPoint = qa6Var.J0.k.media.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            qa6Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                            break;
                        } catch (Exception e3) {
                            fa4.g(e3, true);
                            return;
                        }
                    case 2:
                        byte b9 = qa6Var.N0;
                        Activity parentActivity2 = qa6Var.getParentActivity();
                        if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (qa6Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qa6Var.getParentActivity());
                                int i3 = bkb.K5;
                                alertDialog$Builder.l(R.raw.permission_request_location, 72, qa6Var.getThemedColor(i3), null);
                                alertDialog$Builder.m(i3, qa6Var.getResourceProvider());
                                SpannableStringBuilder T2 = gl.T2(k96.M0(2131747111, null));
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.U = T2;
                                alertDialog$Builder.g(k96.M0(2131747107, null), new z96(qa6Var, b6));
                                alertDialog$Builder.j(k96.M0(2131747638, null), null);
                                qa6Var.showDialog(hdVar);
                                break;
                            }
                        } else if (qa6Var.f0() || b9 == 3) {
                            if ((qa6Var.J0 != null && b9 != 3) || qa6Var.H0 != null) {
                                if (qa6Var.z0 != null && (ty4Var = qa6Var.F) != null) {
                                    ty4Var.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(new yh5(qa6Var.z0.getLatitude(), qa6Var.z0.getLongitude()), qa6Var.F.e() - 4.0f));
                                    break;
                                }
                            } else if (qa6Var.z0 != null && qa6Var.F != null) {
                                ImageView imageView4 = qa6Var.a;
                                int i4 = bkb.lj;
                                zkb.s(imageView4, i4, qa6Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                qa6Var.a.setTag(Integer.valueOf(i4));
                                qa6Var.Q.L(null);
                                qa6Var.K0 = false;
                                qa6Var.F.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLng(new yh5(qa6Var.z0.getLatitude(), qa6Var.z0.getLongitude())));
                                break;
                            }
                        }
                        break;
                    default:
                        qa6Var.q0 = -1L;
                        qa6Var.K0 = true;
                        if (qa6Var.l0()) {
                            qa6Var.r0 = true;
                            qa6Var.I0(false, true);
                            break;
                        }
                        break;
                }
            }
        });
        I0(false, false);
        ImageView imageView4 = new ImageView(context);
        this.c = imageView4;
        E0(imageView4);
        zkb.s(this.c, bkb.kj, getResourceProvider(), mode);
        this.c.setScaleType(scaleType);
        this.c.setContentDescription(k96.M0(2131754846, null));
        this.X.addView(this.c, nme.e(58, 58, 53));
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: v96
            public final /* synthetic */ qa6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ty4 ty4Var;
                byte b52 = b;
                byte b6 = 4;
                qa6 qa6Var = this.b;
                byte b7 = 1;
                switch (b52) {
                    case 0:
                        if (qa6Var.getParentActivity() != null && qa6Var.z0 != null && qa6Var.f0() && qa6Var.F != null) {
                            je5 je5Var = qa6Var.s;
                            if (je5Var != null) {
                                je5Var.f(true);
                            }
                            na7.c1().edit().putInt("proximityhint", 3).commit();
                            db6 h = qa6Var.getLocationController().h(qa6Var.m0);
                            if (qa6Var.y) {
                                qa6Var.x[0].d(1, true);
                            }
                            if (h != null && h.f > 0) {
                                qa6Var.c.setImageResource(R.drawable.msg_location_alert);
                                sk4 sk4Var = qa6Var.L;
                                if (sk4Var != null) {
                                    sk4Var.j0();
                                    qa6Var.L = null;
                                }
                                qa6Var.y = true;
                                qa6Var.q0().k(0L, 25, 0, null, new t96(qa6Var, (byte) 3), new kz5(qa6Var, h, (byte) 13));
                                break;
                            } else {
                                sk4 sk4Var2 = qa6Var.L;
                                byte b8 = 6;
                                if (sk4Var2 == null) {
                                    qa6Var.g0(500);
                                } else {
                                    fh2 fh2Var = (fh2) sk4Var2.b;
                                    fh2Var.getClass();
                                    try {
                                        ome omeVar = (ome) fh2Var.a;
                                        Parcel Q = omeVar.Q(omeVar.R(), 6);
                                        double readDouble = Q.readDouble();
                                        Q.recycle();
                                        qa6Var.M = readDouble;
                                    } catch (RemoteException e2) {
                                        fvc.g(e2);
                                        return;
                                    }
                                }
                                TLRPC.User V1 = cf3.D(qa6Var.m0) ? qa6Var.getMessagesController().V1(Long.valueOf(qa6Var.m0)) : null;
                                Activity parentActivity = qa6Var.getParentActivity();
                                z96 z96Var = new z96(qa6Var, b8);
                                h45 h45Var = new h45(qa6Var, V1, (byte) 15);
                                t96 t96Var = new t96(qa6Var, (byte) 4);
                                st8 st8Var = new st8(parentActivity);
                                st8Var.a = null;
                                st8Var.d = -1;
                                st8Var.e = false;
                                st8Var.f = false;
                                st8Var.h = null;
                                st8Var.n = new Rect();
                                st8Var.x = true;
                                st8Var.G = s33.h;
                                st8Var.setWillNotDraw(false);
                                st8Var.R = t96Var;
                                st8Var.E = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect = new Rect();
                                Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                zkb.x(st8Var, mutate, bkb.g5, null, PorterDuff.Mode.MULTIPLY);
                                mutate.getPadding(rect);
                                int i22 = rect.left;
                                st8Var.y = i22;
                                ot8 ot8Var = new ot8(st8Var.getContext());
                                st8Var.w = ot8Var;
                                ot8Var.setBackgroundDrawable(mutate);
                                ot8Var.setPadding(i22, (gl.L(8.0f) + rect.top) - 1, i22, 0);
                                ot8Var.setVisibility(4);
                                st8Var.addView(ot8Var, 0, nme.e(-1, -2, 80));
                                k96.l();
                                st8Var.P = k96.g0.booleanValue();
                                st8Var.N = V1;
                                st8Var.J = z96Var;
                                hn7 hn7Var = new hn7(parentActivity, null);
                                st8Var.H = hn7Var;
                                hn7Var.setTextOffset(gl.L(10.0f));
                                hn7Var.setItemCount(5);
                                hn7 hn7Var2 = new hn7(parentActivity, null);
                                st8Var.I = hn7Var2;
                                hn7Var2.setItemCount(5);
                                hn7Var2.setTextOffset(-gl.L(10.0f));
                                pt8 pt8Var = new pt8(st8Var, parentActivity);
                                st8Var.Q = pt8Var;
                                pt8Var.setOrientation(1);
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                pt8Var.addView(frameLayout2, nme.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView22 = new TextView(parentActivity);
                                textView22.setText(k96.M0(2131748564, null));
                                tb4.w(textView22, bkb.i5, null, 1, 20.0f);
                                frameLayout2.addView(textView22, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView22.setOnTouchListener(new jz1((byte) 22));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                pt8Var.addView(linearLayout, nme.o(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                                TextView textView3 = new TextView(parentActivity);
                                st8Var.L = textView3;
                                qt8 qt8Var = new qt8(parentActivity);
                                st8Var.K = qt8Var;
                                linearLayout.addView(hn7Var, nme.l(0.5f, 0, kk7.s4));
                                hn7Var.setFormatter(new nt8(st8Var, (byte) 0));
                                hn7Var.setMinValue(0);
                                hn7Var.setMaxValue(10);
                                hn7Var.setWrapSelectorWheel(false);
                                hn7Var.setTextOffset(gl.L(20.0f));
                                nt8 nt8Var = new nt8(st8Var, (byte) 1);
                                hn7Var.setOnValueChangedListener(nt8Var);
                                hn7Var2.setMinValue(0);
                                hn7Var2.setMaxValue(10);
                                hn7Var2.setWrapSelectorWheel(false);
                                hn7Var2.setTextOffset(-gl.L(20.0f));
                                linearLayout.addView(hn7Var2, nme.l(0.5f, 0, kk7.s4));
                                hn7Var2.setFormatter(new nt8(st8Var, (byte) 2));
                                hn7Var2.setOnValueChangedListener(nt8Var);
                                hn7Var.setValue(0);
                                hn7Var2.setValue(6);
                                pt8Var.addView(frameLayout3, nme.t(-1, 48, 83, 16, 15, 16, 16));
                                qt8Var.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                                qt8Var.setGravity(17);
                                zkb.X(qt8Var, bkb.Ii, null);
                                qt8Var.setTextSize(1, 14.0f);
                                qt8Var.setMaxLines(2);
                                qt8Var.setTypeface(gl.o());
                                qt8Var.setBackgroundDrawable(sjb.f(bkb.Ei, 4.0f));
                                frameLayout3.addView(qt8Var, nme.c(48.0f, -1));
                                qt8Var.setOnClickListener(new v16(st8Var, h45Var, (byte) 25));
                                textView3.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                                textView3.setGravity(17);
                                zkb.X(textView3, bkb.p5, null);
                                textView3.setTextSize(1, 14.0f);
                                textView3.setAlpha(0.0f);
                                textView3.setScaleX(0.5f);
                                textView3.setScaleY(0.5f);
                                frameLayout3.addView(textView3, nme.c(48.0f, -1));
                                ot8Var.addView(pt8Var, nme.e(-1, -2, 51));
                                qa6Var.O = st8Var;
                                ((FrameLayout) qa6Var.fragmentView).addView(st8Var, nme.c(-1.0f, -1));
                                st8 st8Var2 = qa6Var.O;
                                st8Var2.r = false;
                                AnimatorSet animatorSet = st8Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    st8Var2.s = null;
                                }
                                ot8 ot8Var2 = st8Var2.w;
                                Point point = gl.q;
                                ot8Var2.measure(View.MeasureSpec.makeMeasureSpec(point.x + (st8Var2.y << 1), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                                if (!st8Var2.r) {
                                    ot8Var2.setVisibility(0);
                                    if (st8Var2.x) {
                                        st8Var2.setLayerType(2, null);
                                    }
                                    ot8Var2.setTranslationY(ot8Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    st8Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(ot8Var2, (Property<ot8, Float>) View.TRANSLATION_Y, 0.0f));
                                    st8Var2.s.setDuration(400L);
                                    st8Var2.s.setStartDelay(20L);
                                    st8Var2.s.setInterpolator(st8Var2.G);
                                    st8Var2.s.addListener(new rt8(st8Var2, b7));
                                    kk7.e().k(98, 512);
                                    st8Var2.s.start();
                                }
                                st8Var2.c(true);
                                break;
                            }
                        }
                        break;
                    case 1:
                        try {
                            TLRPC.GeoPoint geoPoint = qa6Var.J0.k.media.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            qa6Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                            break;
                        } catch (Exception e3) {
                            fa4.g(e3, true);
                            return;
                        }
                    case 2:
                        byte b9 = qa6Var.N0;
                        Activity parentActivity2 = qa6Var.getParentActivity();
                        if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (qa6Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qa6Var.getParentActivity());
                                int i3 = bkb.K5;
                                alertDialog$Builder.l(R.raw.permission_request_location, 72, qa6Var.getThemedColor(i3), null);
                                alertDialog$Builder.m(i3, qa6Var.getResourceProvider());
                                SpannableStringBuilder T2 = gl.T2(k96.M0(2131747111, null));
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.U = T2;
                                alertDialog$Builder.g(k96.M0(2131747107, null), new z96(qa6Var, b6));
                                alertDialog$Builder.j(k96.M0(2131747638, null), null);
                                qa6Var.showDialog(hdVar);
                                break;
                            }
                        } else if (qa6Var.f0() || b9 == 3) {
                            if ((qa6Var.J0 != null && b9 != 3) || qa6Var.H0 != null) {
                                if (qa6Var.z0 != null && (ty4Var = qa6Var.F) != null) {
                                    ty4Var.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(new yh5(qa6Var.z0.getLatitude(), qa6Var.z0.getLongitude()), qa6Var.F.e() - 4.0f));
                                    break;
                                }
                            } else if (qa6Var.z0 != null && qa6Var.F != null) {
                                ImageView imageView42 = qa6Var.a;
                                int i4 = bkb.lj;
                                zkb.s(imageView42, i4, qa6Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                qa6Var.a.setTag(Integer.valueOf(i4));
                                qa6Var.Q.L(null);
                                qa6Var.K0 = false;
                                qa6Var.F.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLng(new yh5(qa6Var.z0.getLatitude(), qa6Var.z0.getLongitude())));
                                break;
                            }
                        }
                        break;
                    default:
                        qa6Var.q0 = -1L;
                        qa6Var.K0 = true;
                        if (qa6Var.l0()) {
                            qa6Var.r0 = true;
                            qa6Var.I0(false, true);
                            break;
                        }
                        break;
                }
            }
        });
        TLRPC.Chat K0 = cf3.y(this.m0) ? getMessagesController().K0(Long.valueOf(-this.m0)) : null;
        k27 k27Var4 = this.J0;
        if (k27Var4 != null && k27Var4.C3()) {
            k27 k27Var5 = this.J0;
            int currentTime = getConnectionsManager().getCurrentTime();
            TLRPC.Message message2 = k27Var5.k;
            if (message2.date + k27.n1(message2).period > currentTime && (!hc2.T(K0) || K0.megagroup)) {
                db6 h = getLocationController().h(this.m0);
                if (h == null || h.f <= 0) {
                    if (cf3.D(this.m0) && this.J0.Z0() == getUserConfig().e()) {
                        this.c.setVisibility(4);
                        this.c.setAlpha(0.0f);
                        this.c.setScaleX(0.4f);
                        this.c.setScaleY(0.4f);
                    }
                    this.c.setImageResource(R.drawable.msg_location_alert);
                } else {
                    this.c.setImageResource(R.drawable.msg_location_alert2);
                }
                je5 je5Var = new je5(context, 1);
                this.s = je5Var;
                je5Var.setLayerType(2, null);
                je5 je5Var2 = this.s;
                je5Var2.d = 4000L;
                je5Var2.n(1.0f, -21.0f);
                this.s.setPadding(0, gl.L(4.0f), 0, 0);
                this.s.k(getBaseSimpleGlass().c);
                this.X.addView(this.s, nme.d(-1, -2.0f, 51, 8.0f, 56.0f, 8.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.e = linearLayout;
                linearLayout.setOrientation(1);
                this.e.setGravity(1);
                this.e.setPadding(0, gl.L(160.0f), 0, 0);
                this.e.setVisibility(8);
                oa6Var.addView(this.e, nme.c(-1.0f, -1));
                this.e.setOnTouchListener(new jz1((byte) 13));
                ImageView imageView5 = new ImageView(context);
                this.f = imageView5;
                imageView5.setImageResource(R.drawable.location_empty);
                zkb.s(this.f, bkb.V5, getResourceProvider(), mode);
                this.e.addView(this.f, nme.o(-2, -2));
                TextView textView3 = new TextView(context);
                this.h = textView3;
                int i3 = bkb.W5;
                zkb.X(textView3, i3, getResourceProvider());
                this.h.setGravity(17);
                this.h.setTypeface(gl.o());
                this.h.setTextSize(1, 17.0f);
                this.h.setText(k96.M0(2131747987, null));
                TextView m = ug8.m(this.e, this.h, nme.t(-2, -2, 17, 0, 11, 0, 0), context);
                this.n = m;
                zkb.X(m, i3, getResourceProvider());
                this.n.setGravity(17);
                this.n.setTextSize(1, 15.0f);
                this.n.setPadding(gl.L(40.0f), 0, gl.L(40.0f), 0);
                this.e.addView(this.n, nme.t(-2, -2, 17, 0, 6, 0, 0));
                this.R = new fu((byte) 25, context, (Object) this);
                il0 c2 = getBaseSimpleGlass().f.c(this.R, null, false);
                nl0 nl0Var = new nl0(getResourceProvider());
                nl0Var.e = new wz((byte) 18);
                nl0Var.f(-1, 553648127);
                nl0Var.e(0, 0);
                nl0Var.d(372454195, 0);
                float N = gl.N(8.0f);
                float f = -gl.N(0.6666667f);
                nl0Var.n = N;
                nl0Var.r = f;
                nl0Var.f = gl.N(0.55f);
                nl0Var.h = 0.0f;
                c2.p(nl0Var);
                c2.s(gl.L(29.0f), gl.L(29.0f), 0.0f, 0.0f);
                c2.q(gl.L(12.0f));
                this.Z = c2;
                fu fuVar = this.R;
                ga6 ga6Var2 = new ga6(this, context, this.N0, this.m0, getResourceProvider(), this.w, b4 != 8);
                this.Q = ga6Var2;
                fuVar.setAdapter(ga6Var2);
                fu fuVar2 = this.R;
                t26 t26Var = new t26(1, false);
                this.V = t26Var;
                fuVar2.setLayoutManager(t26Var);
                if (this.T0 == null) {
                    this.S0 = new l35(context, this.resourceProvider);
                    ja6 ja6Var = new ja6(this, context, new ffa(this), this, new ia6(this), getResourceProvider());
                    this.R0 = ja6Var;
                    zkb.h(i, getResourceProvider(), ja6Var);
                    this.R0.addView(this.S0, nme.e(-1, 32, 55));
                    this.Q.Z = this.R0;
                    this.R.setOverScrollMode(2);
                    gb3 gb3Var = new gb3();
                    z = false;
                    gb3Var.m = false;
                    gb3Var.C = false;
                    gb3Var.o(s33.h);
                    gb3Var.n(350L);
                    this.R.setItemAnimator(gb3Var);
                } else {
                    z = false;
                }
                this.Q.O(this.k0, z);
                this.Q.getClass();
                this.R.setVerticalScrollBarEnabled(z);
                oa6Var.addView(this.R, nme.e(-1, -1, 51));
                k27Var = this.J0;
                if (k27Var != null && (message = k27Var.k) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
                    ga6 ga6Var3 = this.Q;
                    ga6Var3.I = this.J0.k.media.address;
                    ga6Var3.Q();
                }
                this.R.setOnScrollListener(new da6(this, b2));
                final byte b6 = 0;
                ((gb3) this.R.getItemAnimator()).C = false;
                this.R.setOnItemLongClickListener(new h45(this, context, (byte) 13));
                this.R.setOnItemClickListener(new c39(this) { // from class: y96
                    public final /* synthetic */ qa6 b;

                    {
                        this.b = this;
                    }

                    @Override // c39
                    public final void d(int i4, View view) {
                        k27 k27Var6;
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                        byte b7 = b6;
                        qa6 qa6Var = this.b;
                        switch (b7) {
                            case 0:
                                qa6Var.q0 = -1L;
                                byte b8 = qa6Var.N0;
                                byte b9 = 7;
                                byte b10 = 6;
                                if (b8 != 4) {
                                    if (b8 != 5) {
                                        if (i4 == 1 && (k27Var6 = qa6Var.J0) != null && (!k27Var6.C3() || b8 == 6)) {
                                            ty4 ty4Var = qa6Var.F;
                                            if (ty4Var != null) {
                                                IMapsProvider j = org.telegram.messenger.a.j();
                                                TLRPC.GeoPoint geoPoint = qa6Var.J0.k.media.geo;
                                                ty4Var.b(((ize) j).newCameraUpdateLatLngZoom(new yh5(geoPoint.lat, geoPoint._long), qa6Var.F.e() - 4.0f));
                                                break;
                                            }
                                        } else if (i4 == 1 && b8 != 2) {
                                            if (qa6Var.M0 != null && qa6Var.A0 != null) {
                                                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                                tL_messageMediaGeo.geo = tL_geoPoint;
                                                tL_geoPoint.lat = gl.b0(qa6Var.A0.getLatitude());
                                                tL_messageMediaGeo.geo._long = gl.b0(qa6Var.A0.getLongitude());
                                                qa6Var.M0.b(tL_messageMediaGeo, qa6Var.N0, true, 0, 0L);
                                                qa6Var.finishFragment();
                                                break;
                                            }
                                        } else if (b8 != 2 || !qa6Var.getLocationController().i(qa6Var.m0) || qa6Var.Q.d(i4) != 7) {
                                            if (b8 != 2 || !qa6Var.getLocationController().i(qa6Var.m0) || qa6Var.Q.d(i4) != 6) {
                                                if ((i4 != 2 || b8 != 1) && ((i4 != 1 || b8 != 2) && (i4 != 3 || b8 != 3))) {
                                                    Object I = qa6Var.Q.I(i4);
                                                    if (!(I instanceof TLRPC.TL_messageMediaVenue)) {
                                                        if (I instanceof la6) {
                                                            la6 la6Var = (la6) I;
                                                            qa6Var.q0 = la6Var.a;
                                                            if (qa6Var.r0) {
                                                                qa6Var.r0 = false;
                                                                qa6Var.Q0();
                                                            }
                                                            qa6Var.F.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(la6Var.e.a(), qa6Var.F.e() - 4.0f));
                                                            break;
                                                        }
                                                    } else {
                                                        qa6Var.M0.b((TLRPC.TL_messageMediaVenue) I, qa6Var.N0, true, 0, 0L);
                                                        qa6Var.finishFragment();
                                                        break;
                                                    }
                                                } else if (!qa6Var.getLocationController().i(qa6Var.m0)) {
                                                    qa6Var.B0(false);
                                                    break;
                                                } else {
                                                    qa6Var.getLocationController().k(qa6Var.m0);
                                                    qa6Var.Q.f();
                                                    qa6Var.finishFragment();
                                                    break;
                                                }
                                            } else {
                                                qa6Var.B0(qa6Var.getLocationController().h(qa6Var.m0).d != Integer.MAX_VALUE);
                                                break;
                                            }
                                        } else {
                                            qa6Var.getLocationController().k(qa6Var.m0);
                                            qa6Var.Q.f();
                                            qa6Var.finishFragment();
                                            break;
                                        }
                                    } else {
                                        ty4 ty4Var2 = qa6Var.F;
                                        if (ty4Var2 != null) {
                                            IMapsProvider j2 = org.telegram.messenger.a.j();
                                            TLRPC.GeoPoint geoPoint2 = qa6Var.H0.geo_point;
                                            ty4Var2.b(((ize) j2).newCameraUpdateLatLngZoom(new yh5(geoPoint2.lat, geoPoint2._long), qa6Var.F.e() - 4.0f));
                                            break;
                                        }
                                    }
                                } else if (i4 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) qa6Var.Q.I(i4)) != null) {
                                    if (qa6Var.m0 != 0) {
                                        hd[] hdVarArr = {new hd(3, null, qa6Var.getParentActivity())};
                                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                        tL_channels_editLocation.channel = qa6Var.getMessagesController().f1(-qa6Var.m0);
                                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                        TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                        tL_inputGeoPoint.lat = geoPoint3.lat;
                                        tL_inputGeoPoint._long = geoPoint3._long;
                                        hdVarArr[0].setOnCancelListener(new xs0(qa6Var, qa6Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new k45(qa6Var, hdVarArr, tL_messageMediaVenue, b10)), b9));
                                        qa6Var.showDialog(hdVarArr[0]);
                                        break;
                                    } else {
                                        qa6Var.M0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                                        qa6Var.finishFragment();
                                        break;
                                    }
                                }
                                break;
                            default:
                                qa6Var.s0(i4);
                                break;
                        }
                    }
                });
                this.Q.P(this.O0);
                oa6Var.addView(this.P, oa6Var.indexOfChild(this.R), nme.e(-1, -1, 51));
                vh5 onCreateMapView = ((ize) org.telegram.messenger.a.j()).onCreateMapView(context);
                this.H = onCreateMapView;
                ((st) ((gl2) onCreateMapView).b).setAlpha(0.0f);
                vh5 vh5Var = this.H;
                gl2 gl2Var = (gl2) vh5Var;
                gl2Var.c = new z96(this, (byte) 0);
                gl2Var.d = new z96(this, b2);
                gl2Var.e = new t96(this, (byte) 7);
                new Thread(new aa6(this, vh5Var, b2)).start();
                k27Var2 = this.J0;
                if (k27Var2 != null) {
                    if (this.H0 == null) {
                        if (K0 != null && b4 == 4 && this.m0 != 0) {
                            FrameLayout frameLayout2 = new FrameLayout(context);
                            frameLayout2.setBackgroundResource(R.drawable.livepin);
                            this.P.addView(frameLayout2, nme.e(62, 76, 49));
                            be0 be0Var = new be0(context);
                            be0Var.setRoundRadius(gl.L(26.0f));
                            be0Var.f(K0, new pb0(K0));
                            frameLayout2.addView(be0Var, nme.d(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                            this.U = frameLayout2;
                            frameLayout2.setTag(1);
                        }
                        if (this.U == null) {
                            ImageView k = tb4.k(context, R.drawable.map_pin2);
                            this.P.addView(k, nme.e(28, 48, 49));
                            this.U = k;
                        }
                        o39 o39Var = new o39(context, null);
                        this.S = o39Var;
                        byte b7 = 8;
                        o39Var.setVisibility(8);
                        this.S.setLayoutManager(new t26(1, false));
                        a42 a42Var2 = new a42(this, context, getResourceProvider(), b4 == 8);
                        this.T = a42Var2;
                        a42Var2.n = new z96(this, b7);
                        oa6Var.addView(this.S, nme.e(-1, -1, 51));
                        this.S.setOnScrollListener(new da6(this, (byte) 0));
                        this.S.setOnItemClickListener(new c39(this) { // from class: y96
                            public final /* synthetic */ qa6 b;

                            {
                                this.b = this;
                            }

                            @Override // c39
                            public final void d(int i4, View view) {
                                k27 k27Var6;
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                                byte b72 = b2;
                                qa6 qa6Var = this.b;
                                switch (b72) {
                                    case 0:
                                        qa6Var.q0 = -1L;
                                        byte b8 = qa6Var.N0;
                                        byte b9 = 7;
                                        byte b10 = 6;
                                        if (b8 != 4) {
                                            if (b8 != 5) {
                                                if (i4 == 1 && (k27Var6 = qa6Var.J0) != null && (!k27Var6.C3() || b8 == 6)) {
                                                    ty4 ty4Var = qa6Var.F;
                                                    if (ty4Var != null) {
                                                        IMapsProvider j = org.telegram.messenger.a.j();
                                                        TLRPC.GeoPoint geoPoint = qa6Var.J0.k.media.geo;
                                                        ty4Var.b(((ize) j).newCameraUpdateLatLngZoom(new yh5(geoPoint.lat, geoPoint._long), qa6Var.F.e() - 4.0f));
                                                        break;
                                                    }
                                                } else if (i4 == 1 && b8 != 2) {
                                                    if (qa6Var.M0 != null && qa6Var.A0 != null) {
                                                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                                        tL_messageMediaGeo.geo = tL_geoPoint;
                                                        tL_geoPoint.lat = gl.b0(qa6Var.A0.getLatitude());
                                                        tL_messageMediaGeo.geo._long = gl.b0(qa6Var.A0.getLongitude());
                                                        qa6Var.M0.b(tL_messageMediaGeo, qa6Var.N0, true, 0, 0L);
                                                        qa6Var.finishFragment();
                                                        break;
                                                    }
                                                } else if (b8 != 2 || !qa6Var.getLocationController().i(qa6Var.m0) || qa6Var.Q.d(i4) != 7) {
                                                    if (b8 != 2 || !qa6Var.getLocationController().i(qa6Var.m0) || qa6Var.Q.d(i4) != 6) {
                                                        if ((i4 != 2 || b8 != 1) && ((i4 != 1 || b8 != 2) && (i4 != 3 || b8 != 3))) {
                                                            Object I = qa6Var.Q.I(i4);
                                                            if (!(I instanceof TLRPC.TL_messageMediaVenue)) {
                                                                if (I instanceof la6) {
                                                                    la6 la6Var = (la6) I;
                                                                    qa6Var.q0 = la6Var.a;
                                                                    if (qa6Var.r0) {
                                                                        qa6Var.r0 = false;
                                                                        qa6Var.Q0();
                                                                    }
                                                                    qa6Var.F.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(la6Var.e.a(), qa6Var.F.e() - 4.0f));
                                                                    break;
                                                                }
                                                            } else {
                                                                qa6Var.M0.b((TLRPC.TL_messageMediaVenue) I, qa6Var.N0, true, 0, 0L);
                                                                qa6Var.finishFragment();
                                                                break;
                                                            }
                                                        } else if (!qa6Var.getLocationController().i(qa6Var.m0)) {
                                                            qa6Var.B0(false);
                                                            break;
                                                        } else {
                                                            qa6Var.getLocationController().k(qa6Var.m0);
                                                            qa6Var.Q.f();
                                                            qa6Var.finishFragment();
                                                            break;
                                                        }
                                                    } else {
                                                        qa6Var.B0(qa6Var.getLocationController().h(qa6Var.m0).d != Integer.MAX_VALUE);
                                                        break;
                                                    }
                                                } else {
                                                    qa6Var.getLocationController().k(qa6Var.m0);
                                                    qa6Var.Q.f();
                                                    qa6Var.finishFragment();
                                                    break;
                                                }
                                            } else {
                                                ty4 ty4Var2 = qa6Var.F;
                                                if (ty4Var2 != null) {
                                                    IMapsProvider j2 = org.telegram.messenger.a.j();
                                                    TLRPC.GeoPoint geoPoint2 = qa6Var.H0.geo_point;
                                                    ty4Var2.b(((ize) j2).newCameraUpdateLatLngZoom(new yh5(geoPoint2.lat, geoPoint2._long), qa6Var.F.e() - 4.0f));
                                                    break;
                                                }
                                            }
                                        } else if (i4 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) qa6Var.Q.I(i4)) != null) {
                                            if (qa6Var.m0 != 0) {
                                                hd[] hdVarArr = {new hd(3, null, qa6Var.getParentActivity())};
                                                TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                                tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                                tL_channels_editLocation.channel = qa6Var.getMessagesController().f1(-qa6Var.m0);
                                                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                                tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                                TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                                tL_inputGeoPoint.lat = geoPoint3.lat;
                                                tL_inputGeoPoint._long = geoPoint3._long;
                                                hdVarArr[0].setOnCancelListener(new xs0(qa6Var, qa6Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new k45(qa6Var, hdVarArr, tL_messageMediaVenue, b10)), b9));
                                                qa6Var.showDialog(hdVarArr[0]);
                                                break;
                                            } else {
                                                qa6Var.M0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                                                qa6Var.finishFragment();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        qa6Var.s0(i4);
                                        break;
                                }
                            }
                        });
                        k27 k27Var6 = this.J0;
                        if (k27Var6 != null && b4 == 6) {
                            ga6 ga6Var4 = this.Q;
                            ga6Var4.O = k27Var6;
                            ga6Var4.f();
                        }
                        for (int i4 = 0; i4 < 2; i4++) {
                            UndoView undoView = new UndoView(context);
                            UndoView[] undoViewArr = this.x;
                            undoViewArr[i4] = undoView;
                            undoView.setAdditionalTranslationY(gl.L(10.0f));
                            undoViewArr[i4].setTranslationZ(gl.L(5.0f));
                            FrameLayout.LayoutParams d = nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                            d.bottomMargin = gl.L(29.0f) + this.h0 + d.bottomMargin;
                            this.P.addView(undoViewArr[i4], d);
                        }
                        if (this.J0 == null && this.H0 == null && this.I0 != null) {
                            this.K0 = true;
                            ImageView imageView6 = this.a;
                            int i5 = bkb.kj;
                            zkb.s(imageView6, i5, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            this.a.setTag(Integer.valueOf(i5));
                        }
                        dg0 baseSimpleGlass = getBaseSimpleGlass();
                        View view = new View(context);
                        this.navigationBarFadeView = view;
                        view.setBackground(baseSimpleGlass.b(view));
                        oa6Var.addView(this.navigationBarFadeView, nme.e(-1, 0, 80));
                        View view2 = this.simpleActionBar;
                        wjb resourceProvider2 = getResourceProvider();
                        baseSimpleGlass.m = oa6Var;
                        baseSimpleGlass.n = null;
                        baseSimpleGlass.g(oa6Var, view2, resourceProvider2);
                        baseSimpleGlass.o = new vw0(this, (byte) 4);
                        this.simpleActionBar.setBackground(null);
                        this.glassEngine.b(this.R);
                        o39 o39Var2 = this.S;
                        if (o39Var2 != null) {
                            this.glassEngine.b(o39Var2);
                        }
                        if (baseSimpleGlass.g != null && gba.f()) {
                            this.e0 = new fi6(new t96(this, (byte) 2));
                        }
                        c0();
                        N0();
                        return this.fragmentView;
                    }
                }
            }
        }
        this.c.setVisibility(8);
        this.c.setImageResource(R.drawable.msg_location_alert);
        je5 je5Var3 = new je5(context, 1);
        this.s = je5Var3;
        je5Var3.setLayerType(2, null);
        je5 je5Var22 = this.s;
        je5Var22.d = 4000L;
        je5Var22.n(1.0f, -21.0f);
        this.s.setPadding(0, gl.L(4.0f), 0, 0);
        this.s.k(getBaseSimpleGlass().c);
        this.X.addView(this.s, nme.d(-1, -2.0f, 51, 8.0f, 56.0f, 8.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.e.setGravity(1);
        this.e.setPadding(0, gl.L(160.0f), 0, 0);
        this.e.setVisibility(8);
        oa6Var.addView(this.e, nme.c(-1.0f, -1));
        this.e.setOnTouchListener(new jz1((byte) 13));
        ImageView imageView52 = new ImageView(context);
        this.f = imageView52;
        imageView52.setImageResource(R.drawable.location_empty);
        zkb.s(this.f, bkb.V5, getResourceProvider(), mode);
        this.e.addView(this.f, nme.o(-2, -2));
        TextView textView32 = new TextView(context);
        this.h = textView32;
        int i32 = bkb.W5;
        zkb.X(textView32, i32, getResourceProvider());
        this.h.setGravity(17);
        this.h.setTypeface(gl.o());
        this.h.setTextSize(1, 17.0f);
        this.h.setText(k96.M0(2131747987, null));
        TextView m2 = ug8.m(this.e, this.h, nme.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.n = m2;
        zkb.X(m2, i32, getResourceProvider());
        this.n.setGravity(17);
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(gl.L(40.0f), 0, gl.L(40.0f), 0);
        this.e.addView(this.n, nme.t(-2, -2, 17, 0, 6, 0, 0));
        this.R = new fu((byte) 25, context, (Object) this);
        il0 c22 = getBaseSimpleGlass().f.c(this.R, null, false);
        nl0 nl0Var2 = new nl0(getResourceProvider());
        nl0Var2.e = new wz((byte) 18);
        nl0Var2.f(-1, 553648127);
        nl0Var2.e(0, 0);
        nl0Var2.d(372454195, 0);
        float N2 = gl.N(8.0f);
        float f2 = -gl.N(0.6666667f);
        nl0Var2.n = N2;
        nl0Var2.r = f2;
        nl0Var2.f = gl.N(0.55f);
        nl0Var2.h = 0.0f;
        c22.p(nl0Var2);
        c22.s(gl.L(29.0f), gl.L(29.0f), 0.0f, 0.0f);
        c22.q(gl.L(12.0f));
        this.Z = c22;
        fu fuVar3 = this.R;
        ga6 ga6Var22 = new ga6(this, context, this.N0, this.m0, getResourceProvider(), this.w, b4 != 8);
        this.Q = ga6Var22;
        fuVar3.setAdapter(ga6Var22);
        fu fuVar22 = this.R;
        t26 t26Var2 = new t26(1, false);
        this.V = t26Var2;
        fuVar22.setLayoutManager(t26Var2);
        if (this.T0 == null) {
        }
        this.Q.O(this.k0, z);
        this.Q.getClass();
        this.R.setVerticalScrollBarEnabled(z);
        oa6Var.addView(this.R, nme.e(-1, -1, 51));
        k27Var = this.J0;
        if (k27Var != null) {
            ga6 ga6Var32 = this.Q;
            ga6Var32.I = this.J0.k.media.address;
            ga6Var32.Q();
        }
        this.R.setOnScrollListener(new da6(this, b2));
        final byte b62 = 0;
        ((gb3) this.R.getItemAnimator()).C = false;
        this.R.setOnItemLongClickListener(new h45(this, context, (byte) 13));
        this.R.setOnItemClickListener(new c39(this) { // from class: y96
            public final /* synthetic */ qa6 b;

            {
                this.b = this;
            }

            @Override // c39
            public final void d(int i42, View view3) {
                k27 k27Var62;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                byte b72 = b62;
                qa6 qa6Var = this.b;
                switch (b72) {
                    case 0:
                        qa6Var.q0 = -1L;
                        byte b8 = qa6Var.N0;
                        byte b9 = 7;
                        byte b10 = 6;
                        if (b8 != 4) {
                            if (b8 != 5) {
                                if (i42 == 1 && (k27Var62 = qa6Var.J0) != null && (!k27Var62.C3() || b8 == 6)) {
                                    ty4 ty4Var = qa6Var.F;
                                    if (ty4Var != null) {
                                        IMapsProvider j = org.telegram.messenger.a.j();
                                        TLRPC.GeoPoint geoPoint = qa6Var.J0.k.media.geo;
                                        ty4Var.b(((ize) j).newCameraUpdateLatLngZoom(new yh5(geoPoint.lat, geoPoint._long), qa6Var.F.e() - 4.0f));
                                        break;
                                    }
                                } else if (i42 == 1 && b8 != 2) {
                                    if (qa6Var.M0 != null && qa6Var.A0 != null) {
                                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                        tL_messageMediaGeo.geo = tL_geoPoint;
                                        tL_geoPoint.lat = gl.b0(qa6Var.A0.getLatitude());
                                        tL_messageMediaGeo.geo._long = gl.b0(qa6Var.A0.getLongitude());
                                        qa6Var.M0.b(tL_messageMediaGeo, qa6Var.N0, true, 0, 0L);
                                        qa6Var.finishFragment();
                                        break;
                                    }
                                } else if (b8 != 2 || !qa6Var.getLocationController().i(qa6Var.m0) || qa6Var.Q.d(i42) != 7) {
                                    if (b8 != 2 || !qa6Var.getLocationController().i(qa6Var.m0) || qa6Var.Q.d(i42) != 6) {
                                        if ((i42 != 2 || b8 != 1) && ((i42 != 1 || b8 != 2) && (i42 != 3 || b8 != 3))) {
                                            Object I = qa6Var.Q.I(i42);
                                            if (!(I instanceof TLRPC.TL_messageMediaVenue)) {
                                                if (I instanceof la6) {
                                                    la6 la6Var = (la6) I;
                                                    qa6Var.q0 = la6Var.a;
                                                    if (qa6Var.r0) {
                                                        qa6Var.r0 = false;
                                                        qa6Var.Q0();
                                                    }
                                                    qa6Var.F.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLngZoom(la6Var.e.a(), qa6Var.F.e() - 4.0f));
                                                    break;
                                                }
                                            } else {
                                                qa6Var.M0.b((TLRPC.TL_messageMediaVenue) I, qa6Var.N0, true, 0, 0L);
                                                qa6Var.finishFragment();
                                                break;
                                            }
                                        } else if (!qa6Var.getLocationController().i(qa6Var.m0)) {
                                            qa6Var.B0(false);
                                            break;
                                        } else {
                                            qa6Var.getLocationController().k(qa6Var.m0);
                                            qa6Var.Q.f();
                                            qa6Var.finishFragment();
                                            break;
                                        }
                                    } else {
                                        qa6Var.B0(qa6Var.getLocationController().h(qa6Var.m0).d != Integer.MAX_VALUE);
                                        break;
                                    }
                                } else {
                                    qa6Var.getLocationController().k(qa6Var.m0);
                                    qa6Var.Q.f();
                                    qa6Var.finishFragment();
                                    break;
                                }
                            } else {
                                ty4 ty4Var2 = qa6Var.F;
                                if (ty4Var2 != null) {
                                    IMapsProvider j2 = org.telegram.messenger.a.j();
                                    TLRPC.GeoPoint geoPoint2 = qa6Var.H0.geo_point;
                                    ty4Var2.b(((ize) j2).newCameraUpdateLatLngZoom(new yh5(geoPoint2.lat, geoPoint2._long), qa6Var.F.e() - 4.0f));
                                    break;
                                }
                            }
                        } else if (i42 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) qa6Var.Q.I(i42)) != null) {
                            if (qa6Var.m0 != 0) {
                                hd[] hdVarArr = {new hd(3, null, qa6Var.getParentActivity())};
                                TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                tL_channels_editLocation.channel = qa6Var.getMessagesController().f1(-qa6Var.m0);
                                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                tL_inputGeoPoint.lat = geoPoint3.lat;
                                tL_inputGeoPoint._long = geoPoint3._long;
                                hdVarArr[0].setOnCancelListener(new xs0(qa6Var, qa6Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new k45(qa6Var, hdVarArr, tL_messageMediaVenue, b10)), b9));
                                qa6Var.showDialog(hdVarArr[0]);
                                break;
                            } else {
                                qa6Var.M0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                                qa6Var.finishFragment();
                                break;
                            }
                        }
                        break;
                    default:
                        qa6Var.s0(i42);
                        break;
                }
            }
        });
        this.Q.P(this.O0);
        oa6Var.addView(this.P, oa6Var.indexOfChild(this.R), nme.e(-1, -1, 51));
        vh5 onCreateMapView2 = ((ize) org.telegram.messenger.a.j()).onCreateMapView(context);
        this.H = onCreateMapView2;
        ((st) ((gl2) onCreateMapView2).b).setAlpha(0.0f);
        vh5 vh5Var2 = this.H;
        gl2 gl2Var2 = (gl2) vh5Var2;
        gl2Var2.c = new z96(this, (byte) 0);
        gl2Var2.d = new z96(this, b2);
        gl2Var2.e = new t96(this, (byte) 7);
        new Thread(new aa6(this, vh5Var2, b2)).start();
        k27Var2 = this.J0;
        if (k27Var2 != null) {
        }
    }

    public final void d0(Canvas canvas, RectF rectF) {
        int i = bkb.g5;
        int themedColor = getThemedColor(i);
        Paint paint = this.g0;
        paint.setColor(themedColor);
        canvas.drawRect(rectF, paint);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        o39 o39Var = this.S;
        if (o39Var != null && o39Var.getVisibility() == 0) {
            o39 o39Var2 = this.S;
            tk0.a(o39Var2, canvas, rectF, o39Var2, viewGroup);
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
            vh5 vh5Var = this.H;
            st stVar = vh5Var != null ? (st) ((gl2) vh5Var).b : null;
            if (stVar != null && stVar.getParent() == this.P && stVar.getVisibility() == 0 && stVar.getAlpha() > 0.0f) {
                TextureView textureView = this.d0;
                RectF rectF2 = this.f0;
                if (textureView != null && textureView.isAttachedToWindow() && zec.c(this.d0, this.P, rectF2)) {
                    if (stVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (stVar.getAlpha() * 255.0f));
                    } else {
                        canvas.save();
                    }
                    canvas.translate(rectF2.left, rectF2.top);
                    this.d0.draw(canvas);
                    canvas.restore();
                } else if (this.e0 != null) {
                    rectF2.set(stVar.getX(), stVar.getY(), stVar.getX() + stVar.getWidth(), stVar.getY() + stVar.getHeight());
                    fi6 fi6Var = this.e0;
                    float alpha = stVar.getAlpha();
                    Paint paint2 = fi6Var.c;
                    Bitmap bitmap = fi6Var.e;
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
            int L = gl.L(22.0f) + a.getCurrentActionBarHeight() + this.mSystemInsets.b;
            float f = L;
            if (rectF.top >= f) {
                return;
            }
            canvas.save();
            canvas.clipRect(0.0f, Math.min(rectF.top, f), viewGroup.getWidth(), f);
            if (this.b0 < L) {
                paint.setColor(getThemedColor(i));
                paint.setAlpha(kk7.i3);
                canvas.drawRect(0.0f, Math.max(this.b0, rectF.top), viewGroup.getWidth(), f, paint);
            }
            fu fuVar = this.R;
            tk0.a(fuVar, canvas, rectF, fuVar, viewGroup);
            canvas.restore();
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ga6 ga6Var;
        ga6 ga6Var2;
        if (i == kk7.s) {
            removeSelfFromStack(true);
            return;
        }
        if (i == kk7.x4) {
            this.k0 = false;
            ga6 ga6Var3 = this.Q;
            if (ga6Var3 != null) {
                ga6Var3.O(false, false);
            }
            K0();
            return;
        }
        if (i == kk7.y4) {
            this.k0 = true;
            ga6 ga6Var4 = this.Q;
            if (ga6Var4 != null) {
                ga6Var4.O(true, false);
                return;
            }
            return;
        }
        if (i == kk7.F4) {
            ga6 ga6Var5 = this.Q;
            if (ga6Var5 != null) {
                ga6Var5.f();
            }
            Q0();
            return;
        }
        if (i == 1) {
            if (((Boolean) objArr[2]).booleanValue() || ((Long) objArr[0]).longValue() != this.m0 || this.J0 == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[1];
            boolean z = false;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                k27 k27Var = (k27) arrayList.get(i3);
                boolean C3 = k27Var.C3();
                TLRPC.Message message = k27Var.k;
                if (C3) {
                    b0(message);
                    z = true;
                } else if ((message.action instanceof TLRPC.TL_messageActionGeoProximityReached) && cf3.D(k27.B0(message))) {
                    this.c.setImageResource(R.drawable.msg_location_alert);
                    sk4 sk4Var = this.L;
                    if (sk4Var != null) {
                        sk4Var.j0();
                        this.L = null;
                    }
                }
            }
            if (!z || (ga6Var2 = this.Q) == null) {
                return;
            }
            ga6Var2.N(this.o0);
            return;
        }
        if (i == kk7.l0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue != this.m0 || this.J0 == null) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) objArr[1];
            boolean z2 = false;
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                k27 k27Var2 = (k27) arrayList2.get(i4);
                if (k27Var2.C3()) {
                    TLRPC.Message message2 = k27Var2.k;
                    TLRPC.Peer peer = message2.from_id;
                    la6 la6Var = (la6) this.p0.f(peer != null ? k27.B1(peer) : k27.B0(message2));
                    if (la6Var != null) {
                        db6 h = getLocationController().h(longValue);
                        if (h == null || h.b != k27Var2.e1()) {
                            TLRPC.Message message3 = k27Var2.k;
                            la6Var.b = message3;
                            TLRPC.GeoPoint geoPoint = message3.media.geo;
                            yh5 yh5Var = new yh5(geoPoint.lat, geoPoint._long);
                            la6Var.e.b(yh5Var);
                            if (this.q0 == la6Var.a) {
                                this.F.b(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLng(la6Var.e.a()));
                            }
                            sy4 sy4Var = la6Var.f;
                            if (sy4Var != null) {
                                sy4Var.a();
                                la6Var.f.b(yh5Var);
                                int i5 = k27Var2.k.media.heading;
                                if (i5 != 0) {
                                    la6Var.f.c(i5);
                                    if (!la6Var.g) {
                                        la6Var.f.a.a(eod.b(R.drawable.map_pin_cone2));
                                        la6Var.g = true;
                                    }
                                } else if (la6Var.g) {
                                    la6Var.f.c(0.0f);
                                    la6Var.f.a.a(eod.b(R.drawable.map_pin_circle));
                                    la6Var.g = false;
                                }
                            }
                        }
                        z2 = true;
                    }
                }
            }
            if (z2 && (ga6Var = this.Q) != null) {
                ga6Var.f();
                st8 st8Var = this.O;
                if (st8Var != null) {
                    st8Var.c(true);
                }
            }
            if (z2) {
                Q0();
            }
        }
    }

    public final void e0() {
        il0 il0Var = this.Z;
        if (il0Var != null) {
            il0Var.updateColors();
        }
        fu fuVar = this.R;
        if (fuVar != null) {
            fuVar.invalidate();
        }
        if (this.F != null) {
            int i = gl.B(getThemedColor(bkb.c6)) < 0.721f ? R.raw.mapstyle_night : 0;
            boolean z = this.i0;
            if (i != 0) {
                if (!z) {
                    this.i0 = true;
                    this.F.i(((ize) org.telegram.messenger.a.j()).loadRawResourceStyle(org.telegram.messenger.a.b, i));
                    sk4 sk4Var = this.L;
                    if (sk4Var != null) {
                        sk4Var.o0(-1);
                        this.L.m0(553648127);
                    }
                }
            } else if (z) {
                this.i0 = false;
                this.F.i(null);
                sk4 sk4Var2 = this.L;
                if (sk4Var2 != null) {
                    sk4Var2.o0(-16777216);
                    this.L.m0(TLObject.FLAG_29);
                }
            }
            C0();
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
                    int i = bkb.K5;
                    alertDialog$Builder.l(R.raw.permission_request_location, 72, getThemedColor(i), null);
                    alertDialog$Builder.m(i, getResourceProvider());
                    alertDialog$Builder.a.U = k96.M0(2131749355, null);
                    alertDialog$Builder.j(k96.M0(2131751794, null), new z96(this, (byte) 5));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    showDialog(alertDialog$Builder.a);
                    return false;
                }
            } catch (Exception e) {
                fa4.g(e, true);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean finishFragment(boolean z) {
        if (z0()) {
            return false;
        }
        return super.finishFragment(z);
    }

    public final void g0(int i) {
        iwe omeVar;
        if (this.F == null) {
            return;
        }
        byte b = 2;
        boolean z = false;
        List<ci5> asList = Arrays.asList(new bi5(), new ai5());
        rh5 onCreateCircleOptions = ((ize) org.telegram.messenger.a.j()).onCreateCircleOptions();
        double latitude = this.z0.getLatitude();
        double longitude = this.z0.getLongitude();
        hh2 hh2Var = (hh2) ((pj4) onCreateCircleOptions).b;
        LatLng latLng = new LatLng(latitude, longitude);
        hh2Var.getClass();
        hh2Var.a = latLng;
        double d = i;
        hh2 hh2Var2 = (hh2) ((pj4) onCreateCircleOptions).b;
        hh2Var2.b = d;
        if (r0()) {
            hh2Var2.d = -1771658281;
            hh2Var2.e = 476488663;
        } else {
            hh2Var2.d = -1774024971;
            hh2Var2.e = 474121973;
        }
        ArrayList arrayList = new ArrayList();
        for (ci5 ci5Var : asList) {
            if (ci5Var instanceof bi5) {
                arrayList.add(new g53(20.0f, (byte) 1));
            } else if (ci5Var instanceof ai5) {
                arrayList.add(new g53(20.0f, (byte) 0));
            }
        }
        hh2Var2.r = arrayList;
        hh2Var2.c = 2.0f;
        ty4 ty4Var = this.F;
        wk4 wk4Var = ty4Var.a;
        wk4Var.getClass();
        try {
            a6e a6eVar = (a6e) wk4Var.b;
            Parcel R = a6eVar.R();
            sgd.b(R, hh2Var2);
            Parcel Q = a6eVar.Q(R, 35);
            IBinder readStrongBinder = Q.readStrongBinder();
            int i2 = yre.b;
            if (readStrongBinder == null) {
                omeVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                omeVar = queryLocalInterface instanceof iwe ? (iwe) queryLocalInterface : new ome(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", (byte) 6);
            }
            Q.recycle();
            fh2 fh2Var = new fh2(omeVar);
            sk4 sk4Var = new sk4(ty4Var, fh2Var, z, b);
            ty4Var.c.put(fh2Var, sk4Var);
            this.L = sk4Var;
        } catch (RemoteException e) {
            fvc.g(e);
        }
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
            arrayList.add(new blb(undoViewArr[i], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.vj));
            i++;
        }
        arrayList.add(new blb(this.R, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g5));
        xha xhaVar = this.r;
        arrayList.add(new blb(xhaVar != null ? xhaVar.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.i5));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.ij));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.jj));
        arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.oj));
        arrayList.add(new blb(this.R, 393216, new Class[]{i1a.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, bkb.dj));
        arrayList.add(new blb(this.R, 393216, new Class[]{i1a.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, bkb.gj));
        arrayList.add(new blb(this.R, 393248, new Class[]{i1a.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, bkb.cj));
        arrayList.add(new blb(this.R, 393248, new Class[]{i1a.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, bkb.fj));
        arrayList.add(new blb(this.R, 196608, new Class[]{fb6.class}, new String[]{"frameLayout"}, (Drawable[]) null, (alb) null, bkb.Gi));
        return arrayList;
    }

    public final Bitmap h0(la6 la6Var) {
        Bitmap bitmap = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(gl.L(62.0f), gl.L(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = org.telegram.messenger.a.b.getResources().getDrawable(R.drawable.map_pin_photo);
                drawable.setBounds(0, 0, gl.L(62.0f), gl.L(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                pb0 pb0Var = new pb0((wjb) null);
                TLRPC.User user = la6Var.c;
                if (user != null) {
                    pb0Var.q(user);
                } else {
                    TLRPC.Chat chat = la6Var.d;
                    if (chat != null) {
                        pb0Var.p(chat);
                    }
                }
                canvas.translate(gl.L(6.0f), gl.L(6.0f));
                pb0Var.setBounds(0, 0, gl.L(50.0f), gl.L(50.0f));
                pb0Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = la6Var.h;
                Bitmap n = (imageReceiver == null || !imageReceiver.C()) ? null : la6Var.h.n();
                if (n != null && !n.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(n, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    float L = gl.L(50.0f) / n.getWidth();
                    matrix.postScale(L, L);
                    matrix.postTranslate(gl.L(6.0f), gl.L(6.0f));
                    paint.setShader(bitmapShader);
                    bitmapShader.setLocalMatrix(matrix);
                    rectF.set(gl.L(6.0f), gl.L(6.0f), gl.L(56.0f), gl.L(56.0f));
                    canvas.drawRoundRect(rectF, gl.L(25.0f), gl.L(25.0f), paint);
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
                fa4.g(th, true);
                return bitmap;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean i0() {
        return this instanceof tt1;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return bm2.h(getThemedColor(bkb.c6)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0(ArrayList arrayList) {
        th5 onCreateLatLngBoundsBuilder = this.n0 ? ((ize) org.telegram.messenger.a.j()).onCreateLatLngBoundsBuilder() : null;
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
            int i2 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i3 = messageMedia.period;
            if (i2 + i3 > currentTime || i3 == Integer.MAX_VALUE) {
                if (onCreateLatLngBoundsBuilder != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    ((gi3) onCreateLatLngBoundsBuilder).t(new yh5(geoPoint.lat, geoPoint._long));
                }
                b0(message);
                if (this.c.getVisibility() != 8 && k27.B1(message.from_id) != getUserConfig().e()) {
                    this.c.setVisibility(0);
                    this.E = true;
                    this.c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new v85(this, (byte) 13)).start();
                }
            }
        }
        if (onCreateLatLngBoundsBuilder != null) {
            if (this.n0) {
                this.R.x0(0, gl.L(99.0f), null);
            }
            this.n0 = false;
            this.Q.N(this.o0);
            if (this.J0.C3()) {
                try {
                    gi3 gi3Var = (gi3) onCreateLatLngBoundsBuilder;
                    yh5 a = gi3Var.c().a();
                    yh5 y0 = y0(a, 100.0d, 100.0d);
                    gi3Var.t(y0(a, -100.0d, -100.0d));
                    gi3Var.t(y0);
                    qy4 c = gi3Var.c();
                    if (arrayList.size() > 1) {
                        try {
                            qh5 newCameraUpdateLatLngBounds = ((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLngBounds(c, gl.L(113.0f));
                            this.G = newCameraUpdateLatLngBounds;
                            this.F.h(newCameraUpdateLatLngBounds);
                            this.G = null;
                        } catch (Exception e) {
                            fa4.g(e, true);
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
                la6 la6Var = (la6) arrayList2.get(i2);
                sy4 sy4Var = la6Var.e;
                if (sy4Var != null && (message = la6Var.b) != null && (messageMedia = message.media) != null && ((i = messageMedia.period) == Integer.MAX_VALUE || message.date + i > currentTime)) {
                    arrayList.add(sy4Var.a());
                }
            }
            boolean z4 = this.p0.f(getUserConfig().e()) != null;
            Location location = this.z0;
            if (location != null && !z4) {
                arrayList.add(new yh5(location.getLatitude(), this.z0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    th5 onCreateLatLngBoundsBuilder = ((ize) org.telegram.messenger.a.j()).onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    int i3 = 0;
                    double d2 = Double.MAX_VALUE;
                    double d3 = Double.MAX_VALUE;
                    double d4 = -1.7976931348623157E308d;
                    while (i3 < size2) {
                        yh5 yh5Var = (yh5) arrayList.get(i3);
                        z = z3;
                        try {
                            ((gi3) onCreateLatLngBoundsBuilder).t(yh5Var);
                            int i4 = size2;
                            z2 = true;
                            try {
                                double d5 = yh5Var.a;
                                if (d5 < d2) {
                                    d2 = d5;
                                }
                                if (d5 > d) {
                                    d = d5;
                                }
                                double d6 = yh5Var.b;
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
                                fa4.g(e, z2);
                                return z;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            z2 = true;
                            fa4.g(e, z2);
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
                        gi3 gi3Var = (gi3) onCreateLatLngBoundsBuilder;
                        gi3Var.t(new yh5(1.3499999414033853E-4d + d7, d8 + Math.toDegrees(15.0d / (Math.cos(Math.toRadians(d7)) * 6366198.0d))));
                        gi3Var.t(new yh5(d7 - 1.3499999414033853E-4d, d8 + Math.toDegrees((-15.0d) / (Math.cos(Math.toRadians(d7)) * 6366198.0d))));
                    }
                    this.F.c(((ize) org.telegram.messenger.a.j()).newCameraUpdateLatLngBounds(((gi3) onCreateLatLngBoundsBuilder).c(), gl.L(60.0f)));
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
                    this.O0 = ls6.x(66.0f, measuredHeight, i);
                } else if (b == 2) {
                    this.O0 = ls6.x(73.0f, measuredHeight, i);
                } else {
                    this.O0 = ls6.x(66.0f, measuredHeight, i);
                }
                ja6 ja6Var = this.R0;
                if (ja6Var != null && ja6Var.W(8) > 0) {
                    this.O0 -= gl.L(200.0f);
                }
                this.c0 = gl.L(100.0f) + (measuredHeight - this.O0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.P.getLayoutParams();
                layoutParams.height = gl.L(29.0f) + this.O0;
                this.P.setLayoutParams(layoutParams);
                this.Q.P(this.O0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((st) ((gl2) this.H).b).getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = o0();
                    ty4 ty4Var = this.F;
                    if (ty4Var != null) {
                        ty4Var.n(gl.L(70.0f), 0, gl.L(70.0f), n0());
                    }
                    ((st) ((gl2) this.H).b).setLayoutParams(layoutParams2);
                }
                this.Q.f();
                if (!z) {
                    M0(false);
                    return;
                }
                byte b2 = 3;
                int i2 = b == 3 ? 73 : (b == 1 || b == 2) ? 66 : 0;
                this.V.g1(0, -gl.L(i2));
                M0(false);
                this.R.post(new sv1(this, i2, b2));
            }
        }
    }

    public final int n0() {
        return gl.L(10.0f) + this.h0 + this.c0;
    }

    public final int o0() {
        return gl.L(10.0f) + this.O0 + this.c0;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        st8 st8Var = this.O;
        if (st8Var == null) {
            vh5 vh5Var = this.H;
            if (vh5Var == null || ((GLSurfaceView) ((gl2) vh5Var).f) == null || this.J) {
                return super.onBackPressed(z);
            }
            if (z) {
                z0();
            }
        } else if (z) {
            st8Var.a();
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
        getNotificationCenter().b(this, kk7.s);
        kk7.e().b(this, kk7.x4);
        kk7.e().b(this, kk7.y4);
        kk7.e().b(this, kk7.F4);
        k27 k27Var = this.J0;
        if (k27Var != null && k27Var.C3()) {
            getNotificationCenter().b(this, 1);
            getNotificationCenter().b(this, kk7.l0);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        fi6 fi6Var = this.e0;
        if (fi6Var != null) {
            fi6Var.i = true;
            fi6Var.g = false;
            fi6Var.d();
            fi6Var.d = null;
            fi6Var.e = null;
            fi6Var.f = null;
        }
        kk7.e().n(this, kk7.x4);
        kk7.e().n(this, kk7.y4);
        kk7.e().n(this, kk7.F4);
        getNotificationCenter().n(this, kk7.s);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, kk7.l0);
        L0();
        if (this.G0 != null) {
            try {
                ((xl3) org.telegram.messenger.a.i()).removeLocationUpdates(this.G0);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        this.C0 = null;
        this.D0 = null;
        try {
            vh5 vh5Var = this.H;
            if (vh5Var != null) {
                ((gl2) vh5Var).H();
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        ga6 ga6Var = this.Q;
        if (ga6Var != null) {
            ga6Var.F();
        }
        a42 a42Var = this.T;
        if (a42Var != null) {
            a42Var.F();
        }
        t96 t96Var = this.Q0;
        if (t96Var != null) {
            gl.r(t96Var);
            this.Q0 = null;
        }
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            la6 la6Var = (la6) arrayList.get(i);
            ImageReceiver imageReceiver = la6Var.h;
            if (imageReceiver != null) {
                imageReceiver.K();
                la6Var.h = null;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        c0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onLowMemory() {
        vk9 vk9Var;
        super.onLowMemory();
        vh5 vh5Var = this.H;
        if (vh5Var == null || !this.x0 || (vk9Var = (vk9) ((eq2) ((st) ((gl2) vh5Var).b).b).a) == null) {
            return;
        }
        try {
            kwe kweVar = (kwe) vk9Var.c;
            kweVar.V(kweVar.R(), 6);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        vh5 vh5Var = this.H;
        if (vh5Var != null && this.x0) {
            try {
                ((gl2) vh5Var).I();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.y0 = false;
        L0();
        if (this.G0 != null) {
            try {
                ((xl3) org.telegram.messenger.a.i()).removeLocationUpdates(this.G0);
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
        O0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        gl.W2(getParentActivity(), this.classGuid);
        gl.y2(getParentActivity(), this.classGuid);
        vh5 vh5Var = this.H;
        if (vh5Var != null && this.x0) {
            try {
                ((gl2) vh5Var).J();
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }
        this.y0 = true;
        J0();
        K0();
        C0();
        m0(true);
        if (i0()) {
            this.t0 = false;
        } else if (this.t0 && (parentActivity = getParentActivity()) != null) {
            this.t0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        t96 t96Var = this.Q0;
        if (t96Var != null) {
            gl.r(t96Var);
            gl.e3(this.Q0, 5000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            e0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            xha xhaVar = this.r;
            if (xhaVar == null || xhaVar.getSearchField() == null) {
                return;
            }
            this.r.getSearchField().setCursorColor(getThemedColor(bkb.i5));
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || z2) {
            return;
        }
        try {
            if (((st) ((gl2) this.H).b).getParent() instanceof ViewGroup) {
                ((ViewGroup) ((st) ((gl2) this.H).b).getParent()).removeView((st) ((gl2) this.H).b);
            }
        } catch (Exception unused) {
        }
        a6 a6Var = this.P;
        if (a6Var != null) {
            a6Var.addView((st) ((gl2) this.H).b, 0, nme.e(-1, o0(), 51));
            M0(false);
            x0();
            C0();
            return;
        }
        View view = this.fragmentView;
        if (view != null) {
            ((FrameLayout) view).addView((st) ((gl2) this.H).b, 0, nme.e(-1, -1, 51));
        }
    }

    public final boolean p0() {
        ArrayList arrayList = (ArrayList) getLocationController().c.f(k27.B0(this.J0.k));
        if (arrayList == null || !arrayList.isEmpty()) {
            arrayList = null;
        } else {
            j0(arrayList);
        }
        if (cf3.y(this.m0)) {
            TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-this.m0));
            if (hc2.T(K0) && !K0.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long B0 = k27.B0(this.J0.k);
        tL_messages_getRecentLocations.peer = getMessagesController().h1(B0);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new eu2(this, B0, (byte) 1));
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
        return (getResourceProvider() == null && bkb.I.o()) || gl.B(getThemedColor(bkb.c6)) < 0.721f;
    }

    public final /* synthetic */ void s0(int i) {
        float e;
        float f;
        TLRPC.TL_messageMediaVenue H = this.T.H(i);
        if (H == null || H.icon == null || this.F == null) {
            return;
        }
        this.K0 = true;
        this.simpleActionBar.n(true);
        boolean equals = "pin".equals(H.icon);
        ty4 ty4Var = this.F;
        if (equals) {
            e = ty4Var.e();
            f = 4.0f;
        } else {
            e = ty4Var.e();
            f = 9.0f;
        }
        float f2 = e - f;
        ty4 ty4Var2 = this.F;
        IMapsProvider j = org.telegram.messenger.a.j();
        TLRPC.GeoPoint geoPoint = H.geo;
        ty4Var2.b(((ize) j).newCameraUpdateLatLngZoom(new yh5(geoPoint.lat, geoPoint._long), f2));
        Location location = this.A0;
        if (location != null) {
            location.setLatitude(H.geo.lat);
            this.A0.setLongitude(H.geo._long);
        }
        this.Q.L(this.A0);
    }

    public final /* synthetic */ void t0() {
        t96 t96Var;
        getLocationController().j(this.m0);
        if (this.isPaused || (t96Var = this.Q0) == null) {
            return;
        }
        gl.e3(t96Var, 5000L);
    }

    public final /* synthetic */ void u0() {
        this.glassEngine.g();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(int i, TLRPC.User user, boolean z) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (!z) {
            H0(i, 0, user);
            return;
        }
        db6 h = getLocationController().h(this.m0);
        if (h != null) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.peer = getMessagesController().h1(h.a);
            tL_messages_editMessage.id = h.b;
            tL_messages_editMessage.flags |= TLObject.FLAG_14;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = false;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
            Location location = eb6.f(this.currentAccount).s;
            tL_messages_editMessage.media.geo_point.lat = gl.b0(location.getLatitude());
            tL_messages_editMessage.media.geo_point._long = gl.b0(location.getLongitude());
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
            inputMedia.heading = eb6.e(location);
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
            k27 k27Var = h.h;
            if (k27Var != null && (message = k27Var.k) != null && (messageMedia = message.media) != null) {
                messageMedia.period = i6;
                getMessagesStorage().o1(h.h.k, null, null, true);
            }
            getConnectionsManager().sendRequest(tL_messages_editMessage, null);
            kk7.e().k(kk7.F4, new Object[0]);
        }
    }

    public final /* synthetic */ void w0() {
        this.glassEngine.g();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void x0() {
        SharedPreferences c1;
        int i;
        ImageView imageView = this.c;
        if (imageView == null || imageView.getVisibility() != 0 || this.E || (i = (c1 = na7.c1()).getInt("proximityhint", 0)) >= 3) {
            return;
        }
        c1.edit().putInt("proximityhint", i + 1).commit();
        if (cf3.D(this.m0)) {
            this.s.t(k96.a0("ProximityTooltioUser", null, 2131746419, l7c.k(getMessagesController().V1(Long.valueOf(this.m0)), true)));
        } else {
            this.s.t(k96.M0(2131746420, null));
        }
        this.s.v();
    }

    public final boolean z0() {
        GLSurfaceView gLSurfaceView;
        vh5 vh5Var = this.H;
        if (vh5Var == null || (gLSurfaceView = (GLSurfaceView) ((gl2) vh5Var).f) == null || this.J) {
            return false;
        }
        gLSurfaceView.queueEvent(new kz5(this, gLSurfaceView, (byte) 12));
        return true;
    }
}
