package org.telegram.ui;

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
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class sa0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public int A0;
    public TLRPC.TL_channelLocation B0;
    public TLRPC.TL_channelLocation C0;
    public boolean D;
    public org.telegram.messenger.ij D0;
    public org.telegram.messenger.fa E;
    public boolean E0;
    public org.telegram.messenger.ua F;
    public boolean F0;
    public org.telegram.messenger.za G;
    public pa0 G0;
    public org.telegram.messenger.ua H;
    public final int H0;
    public boolean I;
    public int I0;
    public float J;
    public na0 J0;
    public m4.d0 K;
    public aa0 K0;
    public double L;
    public ma0 L0;
    public boolean M;
    public org.telegram.ui.Cells.x3 M0;
    public org.telegram.ui.Components.hg0 N;
    public TL_stories.MediaArea N0;
    public di.b4 O;
    public boolean O0;
    public ka0 P;
    public boolean P0;
    public ct Q;
    public Boolean Q0;
    public org.telegram.ui.Components.pj0 R;
    public org.telegram.ui.Components.tk S;
    public View T;
    public v4.b0 U;
    public org.telegram.ui.ActionBar.g5 V;
    public FrameLayout W;
    public FrameLayout X;
    public fh.g Y;
    public final RectF Z;
    public ImageView a;
    public int a0;
    public TextView b;
    public int b0;
    public ImageView c;
    public TextureView c0;
    public org.telegram.ui.ActionBar.g5 d;
    public org.telegram.ui.Components.g80 d0;
    public LinearLayout e;
    public final RectF e0;
    public ImageView f;
    public final Paint f0;
    public int g0;
    public TextView h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public long l0;
    public boolean m0;
    public TextView n;
    public final ArrayList n0;
    public final a0.h o0;
    public long p0;
    public boolean q0;
    public org.telegram.ui.ActionBar.g5 r;
    public AnimatorSet r0;
    public fi.m3 s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w;
    public boolean w0;
    public final UndoView[] x;
    public boolean x0;
    public boolean y;
    public Location y0;
    public Location z0;

    public sa0(int i7) {
        super(null);
        this.x = new UndoView[2];
        this.Z = new RectF();
        this.e0 = new RectF();
        this.f0 = new Paint();
        this.i0 = true;
        this.j0 = false;
        this.k0 = true;
        this.m0 = true;
        this.n0 = new ArrayList();
        this.o0 = new a0.h();
        this.p0 = -1L;
        this.s0 = true;
        this.I0 = (org.telegram.messenger.g0.q.x - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(66.0f);
        this.P0 = true;
        this.H0 = i7;
        org.telegram.messenger.g0.a0();
    }

    public static void Z(sa0 sa0Var, Canvas canvas, RectF rectF) {
        Paint paint = sa0Var.f0;
        int i7 = org.telegram.ui.ActionBar.m6.h5;
        paint.setColor(sa0Var.getThemedColor(i7));
        canvas.drawRect(rectF, paint);
        ViewGroup viewGroup = (ViewGroup) sa0Var.fragmentView;
        org.telegram.ui.Components.pj0 pj0Var = sa0Var.R;
        if (pj0Var != null && pj0Var.getVisibility() == 0) {
            org.telegram.ui.Components.pj0 pj0Var2 = sa0Var.R;
            ih.d.a(pj0Var2, canvas, rectF, pj0Var2, viewGroup);
            return;
        }
        if (sa0Var.O.getVisibility() == 0) {
            RectF rectF2 = sa0Var.e0;
            canvas.save();
            canvas.translate(sa0Var.O.getX(), sa0Var.O.getY());
            canvas.clipRect(0.0f, 0.0f, sa0Var.O.getWidth(), viewGroup.getHeight() - sa0Var.O.getY());
            Drawable background = sa0Var.O.getBackground();
            if (background != null) {
                background.draw(canvas);
            }
            org.telegram.messenger.za zaVar = sa0Var.G;
            bi.x5 x5Var = zaVar != null ? (bi.x5) ((a8.r7) zaVar).b : null;
            if (x5Var != null && x5Var.getParent() == sa0Var.O && x5Var.getVisibility() == 0 && x5Var.getAlpha() > 0.0f) {
                TextureView textureView = sa0Var.c0;
                if (textureView != null && textureView.isAttachedToWindow() && jh.k.c(sa0Var.c0, sa0Var.O, rectF2)) {
                    if (x5Var.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (x5Var.getAlpha() * 255.0f));
                    } else {
                        canvas.save();
                    }
                    canvas.translate(rectF2.left, rectF2.top);
                    sa0Var.c0.draw(canvas);
                    canvas.restore();
                } else if (sa0Var.d0 != null) {
                    rectF2.set(x5Var.getX(), x5Var.getY(), x5Var.getX() + x5Var.getWidth(), x5Var.getY() + x5Var.getHeight());
                    org.telegram.ui.Components.g80 g80Var = sa0Var.d0;
                    float alpha = x5Var.getAlpha();
                    Paint paint2 = g80Var.c;
                    Bitmap bitmap = g80Var.e;
                    if (bitmap != null && !bitmap.isRecycled() && alpha > 0.0f) {
                        paint2.setAlpha((int) (Math.min(1.0f, alpha) * 255.0f));
                        canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint2);
                    }
                }
            }
            View view = sa0Var.T;
            if (view != null && view.getParent() != null && view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
                canvas.save();
                canvas.translate(view.getX(), view.getY());
                view.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        if (sa0Var.Q.getVisibility() != 0) {
            return;
        }
        int L = org.telegram.messenger.g0.L(22.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + sa0Var.mSystemInsets.b;
        float f10 = L;
        if (rectF.top >= f10) {
            return;
        }
        canvas.save();
        canvas.clipRect(0.0f, Math.min(rectF.top, f10), viewGroup.getWidth(), f10);
        if (sa0Var.a0 < L) {
            paint.setColor(sa0Var.getThemedColor(i7));
            paint.setAlpha(org.telegram.messenger.qs.j3);
            canvas.drawRect(0.0f, Math.max(sa0Var.a0, rectF.top), viewGroup.getWidth(), f10, paint);
        }
        ct ctVar = sa0Var.Q;
        ih.d.a(ctVar, canvas, rectF, ctVar, viewGroup);
        canvas.restore();
    }

    public static /* synthetic */ void a0(sa0 sa0Var) {
        sa0Var.glassEngine.g();
        View view = sa0Var.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void b0(sa0 sa0Var, boolean z9, TLRPC.User user, int i7) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (!z9) {
            sa0Var.I0(i7, 0, user);
            return;
        }
        org.telegram.messenger.rd h = sa0Var.getLocationController().h(sa0Var.l0);
        if (h != null) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.peer = sa0Var.getMessagesController().j1(h.a);
            tL_messages_editMessage.id = h.b;
            tL_messages_editMessage.flags |= TLObject.FLAG_14;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = false;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
            Location location = org.telegram.messenger.sd.f(sa0Var.currentAccount).s;
            tL_messages_editMessage.media.geo_point.lat = org.telegram.messenger.g0.b0(location.getLatitude());
            tL_messages_editMessage.media.geo_point._long = org.telegram.messenger.g0.b0(location.getLongitude());
            tL_messages_editMessage.media.geo_point.accuracy_radius = (int) location.getAccuracy();
            TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
            TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
            if (inputGeoPoint.accuracy_radius != 0) {
                inputGeoPoint.flags |= 1;
            }
            int i10 = h.g;
            int i11 = h.f;
            if (i10 != i11) {
                inputMedia.proximity_notification_radius = i11;
                inputMedia.flags |= 8;
            }
            inputMedia.heading = org.telegram.messenger.sd.e(location);
            TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
            int i12 = inputMedia2.flags;
            inputMedia2.flags = i12 | 4;
            int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i14 = i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : h.d + i7;
            h.d = i14;
            inputMedia2.period = i14;
            if (i7 != Integer.MAX_VALUE) {
                i13 = h.c + i7;
            }
            h.c = i13;
            inputMedia2.flags = i12 | 6;
            org.telegram.messenger.ij ijVar = h.h;
            if (ijVar != null && (message = ijVar.k) != null && (messageMedia = message.media) != null) {
                messageMedia.period = i14;
                sa0Var.getMessagesStorage().r1(h.h.k, null, null, true);
            }
            sa0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.D4, new Object[0]);
        }
    }

    public static /* synthetic */ void c0(sa0 sa0Var) {
        aa0 aa0Var;
        sa0Var.getLocationController().j(sa0Var.l0);
        if (sa0Var.isPaused || (aa0Var = sa0Var.K0) == null) {
            return;
        }
        org.telegram.messenger.g0.i3(aa0Var, 5000L);
    }

    public static /* synthetic */ void e0(sa0 sa0Var, int i7) {
        float e10;
        float f10;
        TLRPC.TL_messageMediaVenue H = sa0Var.S.H(i7);
        if (H == null || H.icon == null || sa0Var.E == null) {
            return;
        }
        sa0Var.E0 = true;
        sa0Var.simpleActionBar.l(true);
        if ("pin".equals(H.icon)) {
            e10 = sa0Var.E.e();
            f10 = 4.0f;
        } else {
            e10 = sa0Var.E.e();
            f10 = 9.0f;
        }
        float f11 = e10 - f10;
        org.telegram.messenger.fa faVar = sa0Var.E;
        IMapsProvider k10 = org.telegram.messenger.t0.k();
        TLRPC.GeoPoint geoPoint = H.geo;
        faVar.b(((nb.a) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint.lat, geoPoint._long), f11));
        Location location = sa0Var.z0;
        if (location != null) {
            location.setLatitude(H.geo.lat);
            sa0Var.z0.setLongitude(H.geo._long);
        }
        sa0Var.P.L(sa0Var.z0);
    }

    public static View q0(View view, Class cls) {
        if (cls.isInstance(view)) {
            return (View) cls.cast(view);
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            View q02 = q0(viewGroup.getChildAt(i7), cls);
            if (q02 != null) {
                return q02;
            }
        }
        return null;
    }

    public static org.telegram.messenger.cb z0(org.telegram.messenger.cb cbVar, double d, double d2) {
        double d10 = cbVar.a;
        return new org.telegram.messenger.cb(d10 + Math.toDegrees(d / 6366198.0d), cbVar.b + Math.toDegrees(d2 / (Math.cos(Math.toRadians(d10)) * 6366198.0d)));
    }

    public final boolean A0() {
        GLSurfaceView gLSurfaceView;
        org.telegram.messenger.za zaVar = this.G;
        if (zaVar == null || (gLSurfaceView = (GLSurfaceView) ((a8.r7) zaVar).f) == null || this.I) {
            return false;
        }
        gLSurfaceView.queueEvent(new f10(22, this, gLSurfaceView));
        return true;
    }

    public final void B0(oa0 oa0Var) {
        double d;
        double d2;
        TLRPC.Message message;
        if (oa0Var == null || (message = oa0Var.b) == null) {
            org.telegram.messenger.ij ijVar = this.D0;
            if (ijVar != null) {
                TLRPC.GeoPoint geoPoint = ijVar.k.media.geo;
                d = geoPoint.lat;
                d2 = geoPoint._long;
            } else {
                TLRPC.GeoPoint geoPoint2 = this.B0.geo_point;
                d = geoPoint2.lat;
                d2 = geoPoint2._long;
            }
        } else {
            TLRPC.GeoPoint geoPoint3 = message.media.geo;
            d = geoPoint3.lat;
            d2 = geoPoint3._long;
        }
        boolean z9 = org.telegram.messenger.r2.a;
        org.telegram.messenger.t0.r();
        if (this.y0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps".concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.y0.getLatitude()), Double.valueOf(this.y0.getLongitude()), Double.valueOf(d), Double.valueOf(d2)))));
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps".concat("?saddr=&daddr=%f,%f"), Double.valueOf(d), Double.valueOf(d2)))));
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public final void C0(final boolean z9) {
        if (this.G0 == null || o0() || getParentActivity() == null || this.y0 == null || !l0()) {
            return;
        }
        final TLRPC.User a22 = org.telegram.messenger.m5.E(this.l0) ? getMessagesController().a2(Long.valueOf(this.l0)) : null;
        showDialog(org.telegram.ui.Components.u4.B(getParentActivity(), z9, a22, new org.telegram.messenger.sr() { // from class: org.telegram.ui.fa0
            @Override // org.telegram.messenger.sr
            public final void a(int i7) {
                sa0.b0(sa0.this, z9, a22, i7);
            }
        }, null));
    }

    public final void D0() {
        SurfaceView surfaceView;
        if (this.d0 == null || this.G == null) {
            return;
        }
        TextureView textureView = this.c0;
        if ((textureView == null || !textureView.isAttachedToWindow()) && ((surfaceView = this.d0.d) == null || !surfaceView.isAttachedToWindow())) {
            bi.x5 x5Var = (bi.x5) ((a8.r7) this.G).b;
            TextureView textureView2 = (TextureView) q0(x5Var, TextureView.class);
            this.c0 = textureView2;
            org.telegram.ui.Components.g80 g80Var = this.d0;
            SurfaceView surfaceView2 = textureView2 == null ? (SurfaceView) q0(x5Var, SurfaceView.class) : null;
            if (g80Var.d != surfaceView2) {
                g80Var.d = surfaceView2;
                g80Var.a();
            }
            TextureView textureView3 = this.c0;
            if (textureView3 != null) {
                TextureView.SurfaceTextureListener surfaceTextureListener = textureView3.getSurfaceTextureListener();
                if (!(surfaceTextureListener instanceof qa0)) {
                    this.c0.setSurfaceTextureListener(new qa0(this, surfaceTextureListener));
                }
            }
            M0();
        }
        TextureView textureView4 = this.c0;
        if (textureView4 == null) {
            this.d0.a();
            return;
        }
        TextureView.SurfaceTextureListener surfaceTextureListener2 = textureView4.getSurfaceTextureListener();
        if (surfaceTextureListener2 instanceof qa0) {
            return;
        }
        this.c0.setSurfaceTextureListener(new qa0(this, surfaceTextureListener2));
    }

    public final void E0(Location location) {
        if (location == null) {
            return;
        }
        this.y0 = new Location(location);
        oa0 oa0Var = (oa0) this.o0.f(getUserConfig().e());
        org.telegram.messenger.rd h = getLocationController().h(this.l0);
        if (oa0Var != null && h != null && oa0Var.b.id == h.b) {
            org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(location.getLatitude(), location.getLongitude());
            oa0Var.e.b(cbVar);
            org.telegram.messenger.ea eaVar = oa0Var.f;
            if (eaVar != null) {
                eaVar.b(cbVar);
            }
            if (this.p0 == oa0Var.a) {
                this.E.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(oa0Var.e.a()));
            }
        }
        if (this.D0 == null && this.B0 == null && this.E != null) {
            org.telegram.messenger.cb cbVar2 = new org.telegram.messenger.cb(location.getLatitude(), location.getLongitude());
            ka0 ka0Var = this.P;
            if (ka0Var != null) {
                ka0Var.M(this.y0);
            }
            if (!this.E0) {
                this.z0 = new Location(location);
                if (this.F0) {
                    this.E.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(cbVar2));
                } else {
                    this.F0 = true;
                    this.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(cbVar2, this.E.e() - 4.0f));
                }
            }
        } else {
            this.P.M(this.y0);
        }
        org.telegram.ui.Components.hg0 hg0Var = this.N;
        if (hg0Var != null) {
            hg0Var.c(true);
        }
        m4.d0 d0Var = this.K;
        if (d0Var != null) {
            double latitude = this.y0.getLatitude();
            double longitude = this.y0.getLongitude();
            m8.a aVar = (m8.a) d0Var.a;
            LatLng latLng = new LatLng(latitude, longitude);
            try {
                v7.f fVar = (v7.f) aVar.a;
                Parcel p12 = fVar.p1();
                v7.b.b(p12, latLng);
                fVar.t1(p12, 3);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }
        N0();
    }

    public final void F0(View view) {
        fh.g c10 = getBaseSimpleGlass().c.c(view, null, false);
        c10.p(c8.g0.l(getResourceProvider()));
        c10.r(org.telegram.messenger.g0.L(23.0f));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        view.setBackground(c10);
        c8.ka.a(view);
    }

    public final void G0(org.telegram.messenger.ij ijVar) {
        this.D0 = ijVar;
        this.l0 = org.telegram.messenger.ij.B0(ijVar.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H0(oa0 oa0Var) {
        if (oa0Var.h != null) {
            return;
        }
        TLRPC.User user = oa0Var.c;
        TLRPC.Chat chat = oa0Var.d;
        if (user == null && chat == 0) {
            return;
        }
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        if (user != null) {
            v8Var.r(user);
        } else {
            v8Var.q(chat);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.d = this.currentAccount;
        imageReceiver.g1 = new su(16, this, oa0Var);
        imageReceiver.P();
        if (user == null) {
            user = chat;
        }
        imageReceiver.i0(user, v8Var, null);
        oa0Var.h = imageReceiver;
    }

    public final void I0(int i7, int i10, TLRPC.User user) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.g0.b0(this.y0.getLatitude());
        tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(this.y0.getLongitude());
        tL_messageMediaGeoLive.heading = org.telegram.messenger.sd.e(this.y0);
        int i11 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i7;
        tL_messageMediaGeoLive.proximity_notification_radius = i10;
        tL_messageMediaGeoLive.flags = i11 | 9;
        this.G0.d(tL_messageMediaGeoLive, this.H0, true, 0, 0L);
        if (i10 <= 0) {
            finishFragment();
            return;
        }
        this.N.L = true;
        this.c.setImageResource(R.drawable.msg_location_alert2);
        org.telegram.ui.Components.hg0 hg0Var = this.N;
        if (hg0Var != null) {
            hg0Var.a();
        }
        w0().k(0L, 24, Integer.valueOf(i10), user, null, null);
    }

    public final void J0(boolean z9, boolean z10) {
        Boolean bool = this.Q0;
        if (bool == null || bool.booleanValue() != z9) {
            this.Q0 = Boolean.valueOf(z9);
            if (z10) {
                this.b.setVisibility(0);
                this.b.animate().alpha(z9 ? 1.0f : 0.0f).scaleX(z9 ? 1.0f : 0.7f).scaleY(z9 ? 1.0f : 0.7f).setInterpolator(org.telegram.ui.Components.wq.h).setDuration(420L).withEndAction(new org.telegram.ui.Components.tp0(8, this, z9)).start();
            } else {
                this.b.setVisibility(z9 ? 0 : 8);
                this.b.setAlpha(z9 ? 1.0f : 0.0f);
                this.b.setScaleX(z9 ? 1.0f : 0.7f);
                this.b.setScaleY(z9 ? 1.0f : 0.7f);
            }
        }
    }

    public final void K0(boolean z9) {
        int i7;
        int i10;
        FrameLayout.LayoutParams layoutParams;
        v4.d1 K = this.Q.K(0);
        if (K != null) {
            i7 = (int) K.a.getY();
            i10 = Math.min(i7, 0) + this.I0;
            this.a0 = (this.I0 + i7) - this.g0;
        } else {
            i7 = -this.O.getMeasuredHeight();
            this.a0 = -org.telegram.messenger.g0.L(41.0f);
            i10 = 0;
        }
        this.Q.invalidate();
        if (((FrameLayout.LayoutParams) this.O.getLayoutParams()) != null) {
            if (i10 <= 0) {
                if (((bi.x5) ((a8.r7) this.G).b).getVisibility() == 0) {
                    ((bi.x5) ((a8.r7) this.G).b).setVisibility(4);
                    this.O.setVisibility(4);
                }
            } else if (((bi.x5) ((a8.r7) this.G).b).getVisibility() == 4) {
                ((bi.x5) ((a8.r7) this.G).b).setVisibility(0);
                this.O.setVisibility(0);
            }
            this.O.setTranslationY(Math.min(0, i7));
            int i11 = -i7;
            ((bi.x5) ((a8.r7) this.G).b).setTranslationY(Math.max(0, i11 / 2));
            FrameLayout frameLayout = this.W;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-Math.min(0, i7));
                float l10 = Utilities.l((org.telegram.messenger.k5.z(53.0f, i10 - this.g0, org.telegram.messenger.g0.L(46.0f) + oi.a.d(this.mSystemInsets.b)) - org.telegram.messenger.g0.L(7.0f)) / org.telegram.messenger.g0.L(48.0f));
                FrameLayout frameLayout2 = this.W;
                frameLayout2.setAlpha(l10);
                frameLayout2.setVisibility(l10 > 0.0f ? 0 : 4);
                FrameLayout frameLayout3 = this.X;
                frameLayout3.setAlpha(l10);
                frameLayout3.setVisibility(l10 > 0.0f ? 0 : 4);
                M0();
            }
            View view = this.T;
            if (view != null) {
                int L = ((i10 / 2) + (i11 - org.telegram.messenger.g0.L(view.getTag() != null ? 69.0f : 48.0f))) - (this.g0 / 2);
                this.A0 = L;
                view.setTranslationY(L);
            }
            if (z9 || (layoutParams = (FrameLayout.LayoutParams) ((bi.x5) ((a8.r7) this.G).b).getLayoutParams()) == null || layoutParams.height == u0()) {
                return;
            }
            layoutParams.height = u0();
            org.telegram.messenger.fa faVar = this.E;
            if (faVar != null) {
                faVar.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), t0());
            }
            ((bi.x5) ((a8.r7) this.G).b).setLayoutParams(layoutParams);
        }
    }

    public final void L0() {
        if (!this.t0) {
            this.e.setVisibility(8);
        } else {
            if (!this.v0) {
                this.R.setEmptyView(this.e);
                return;
            }
            this.R.setEmptyView(null);
            this.e.setVisibility(8);
            this.R.setVisibility(8);
        }
    }

    public final void M0() {
        org.telegram.messenger.za zaVar;
        di.b4 b4Var;
        org.telegram.ui.Components.g80 g80Var = this.d0;
        if (g80Var == null || (zaVar = this.G) == null) {
            return;
        }
        bi.x5 x5Var = (bi.x5) ((a8.r7) zaVar).b;
        boolean z9 = this.c0 == null && this.x0 && !isFinishing() && (b4Var = this.O) != null && b4Var.getVisibility() == 0 && x5Var.getParent() != null && x5Var.getVisibility() == 0;
        if (g80Var.g == z9) {
            return;
        }
        g80Var.g = z9;
        if (z9) {
            g80Var.a();
        } else {
            g80Var.d();
        }
    }

    public final void N0() {
        TLRPC.MessageMedia messageMedia;
        int i7;
        if (this.b == null) {
            return;
        }
        if (this.q0) {
            J0(false, true);
            r0();
            return;
        }
        int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
        ArrayList arrayList = this.n0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.Message message = ((oa0) arrayList.get(i11)).b;
            if (message != null && (messageMedia = message.media) != null && ((i7 = messageMedia.period) == Integer.MAX_VALUE || message.date + i7 > currentTime)) {
                i10++;
            }
        }
        boolean z9 = this.o0.f(getUserConfig().e()) != null;
        if (this.y0 != null && !z9) {
            i10++;
        }
        J0(i10 >= 2, true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.cj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.uj));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x085d A[LOOP:0: B:92:0x085a->B:94:0x085d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x08a8  */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i7;
        TLRPC.Chat chat;
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.ij ijVar2;
        TLRPC.TL_channelLocation tL_channelLocation;
        org.telegram.messenger.ij ijVar3;
        int i10;
        oi.a baseSimpleGlass;
        org.telegram.ui.Components.pj0 pj0Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        final int i11 = 0;
        this.u0 = false;
        this.t0 = false;
        this.v0 = false;
        ka0 ka0Var = this.P;
        if (ka0Var != null) {
            ka0Var.F();
        }
        org.telegram.ui.Components.tk tkVar = this.S;
        if (tkVar != null) {
            tkVar.F();
        }
        if (this.B0 != null) {
            Location location = new Location("network");
            this.z0 = location;
            location.setLatitude(this.B0.geo_point.lat);
            this.z0.setLongitude(this.B0.geo_point._long);
        } else if (this.D0 != null) {
            Location location2 = new Location("network");
            this.z0 = location2;
            location2.setLatitude(this.D0.k.media.geo.lat);
            this.z0.setLongitude(this.D0.k.media.geo._long);
        }
        final int i12 = 1;
        this.j0 = (getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ja0(this));
        org.telegram.ui.ActionBar.f5 q10 = this.simpleActionBar.q();
        org.telegram.ui.ActionBar.g5 b10 = q10.b(0, R.drawable.msg_map_type);
        this.d = b10;
        b10.e(2, R.drawable.msg_map, org.telegram.messenger.id.M0(2131748690, null));
        this.d.e(3, R.drawable.msg_satellite, org.telegram.messenger.id.M0(2131745948, null));
        this.d.e(4, R.drawable.msg_hybrid, org.telegram.messenger.id.M0(2131749275, null));
        this.d.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        TLRPC.TL_channelLocation tL_channelLocation2 = this.B0;
        int i13 = this.H0;
        if (tL_channelLocation2 != null) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752220, null));
            i7 = 2;
        } else {
            org.telegram.messenger.ij ijVar4 = this.D0;
            if (ijVar4 != null) {
                i7 = 2;
                if (ijVar4.C3()) {
                    this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131753966, null));
                    org.telegram.ui.ActionBar.g5 b11 = q10.b(0, R.drawable.ic_ab_other);
                    this.V = b11;
                    b11.e(6, R.drawable.filled_directions, org.telegram.messenger.id.M0(2131750473, null));
                } else {
                    if (i13 != 3) {
                        String str = this.D0.k.media.title;
                        if (str == null || str.length() <= 0) {
                            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752220, null));
                        } else {
                            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745404, null));
                        }
                    }
                    if (i13 != 3) {
                        org.telegram.ui.ActionBar.g5 b12 = q10.b(0, R.drawable.ic_ab_other);
                        this.V = b12;
                        b12.e(1, R.drawable.msg_openin, org.telegram.messenger.id.M0(2131747796, null));
                        if (!getLocationController().i(this.l0) && this.P0) {
                            this.V.e(5, R.drawable.msg_location, org.telegram.messenger.id.M0(2131745612, null));
                        }
                        this.V.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
                    }
                }
            } else {
                i7 = 2;
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745456, null));
                if (i13 != 4) {
                    org.telegram.ui.ActionBar.g5 b13 = q10.b(0, R.drawable.outline_header_search);
                    b13.N();
                    b13.B0 = new kg.v1(this, 15);
                    this.r = b13;
                    b13.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
                    this.r.setContentDescription(org.telegram.messenger.id.M0(2131745836, null));
                }
            }
        }
        FrameLayout ra0Var = new ra0(this, context);
        this.fragmentView = ra0Var;
        int i14 = org.telegram.ui.ActionBar.m6.h5;
        org.telegram.ui.ActionBar.t6.h(i14, ra0Var, getResourceProvider());
        this.g0 = org.telegram.messenger.g0.L((i13 == 0 || i13 == 1) ? 26.0f : 16.0f);
        di.b4 b4Var = new di.b4(context, 26);
        this.O = b4Var;
        b4Var.setBackgroundDrawable(new org.telegram.ui.Components.nc(x0()));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        this.O.addView(frameLayout, c8.ha.e(-1, -2, 51));
        this.X = new FrameLayout(context);
        FrameLayout.LayoutParams e10 = c8.ha.e(-1, -2, 83);
        e10.bottomMargin = org.telegram.messenger.g0.L(1.0f) + org.telegram.messenger.g0.L(29.0f) + this.g0;
        this.O.addView(this.X, e10);
        if (this.D0 != null && i13 == 3) {
            TextView textView = new TextView(context);
            F0(textView);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.jj, getResourceProvider());
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setGravity(17);
            textView.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
            this.simpleActionBar.addView(textView, c8.ha.e(-2, 58, 1));
            textView.setText(org.telegram.messenger.id.M0(2131747795, null));
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ba0
                public final /* synthetic */ sa0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean z9;
                    org.telegram.messenger.fa faVar;
                    int i15 = i12;
                    int i16 = 2;
                    sa0 sa0Var = this.b;
                    switch (i15) {
                        case 0:
                            if (sa0Var.getParentActivity() == null || sa0Var.y0 == null || !sa0Var.l0() || sa0Var.E == null) {
                                return;
                            }
                            fi.m3 m3Var = sa0Var.s;
                            if (m3Var != null) {
                                m3Var.f(true);
                            }
                            org.telegram.messenger.qp.e1().edit().putInt("proximityhint", 3).commit();
                            org.telegram.messenger.rd h = sa0Var.getLocationController().h(sa0Var.l0);
                            if (sa0Var.y) {
                                sa0Var.x[0].d(1, true);
                            }
                            if (h != null && h.f > 0) {
                                sa0Var.c.setImageResource(R.drawable.msg_location_alert);
                                m4.d0 d0Var = sa0Var.K;
                                if (d0Var != null) {
                                    d0Var.R0();
                                    sa0Var.K = null;
                                }
                                sa0Var.y = true;
                                sa0Var.w0().k(0L, 25, 0, null, new aa0(sa0Var, 3), new f10(23, sa0Var, h));
                                return;
                            }
                            m4.d0 d0Var2 = sa0Var.K;
                            if (d0Var2 == null) {
                                sa0Var.m0(500);
                            } else {
                                try {
                                    v7.f fVar = (v7.f) ((m8.a) d0Var2.a).a;
                                    Parcel o12 = fVar.o1(fVar.p1(), 6);
                                    double readDouble = o12.readDouble();
                                    o12.recycle();
                                    sa0Var.L = readDouble;
                                } catch (RemoteException e11) {
                                    throw new androidx.car.app.j(e11);
                                }
                            }
                            TLRPC.User a22 = org.telegram.messenger.m5.E(sa0Var.l0) ? sa0Var.getMessagesController().a2(Long.valueOf(sa0Var.l0)) : null;
                            Activity parentActivity = sa0Var.getParentActivity();
                            da0 da0Var = new da0(sa0Var, 4);
                            su suVar = new su(17, sa0Var, a22);
                            aa0 aa0Var = new aa0(sa0Var, 4);
                            org.telegram.ui.Components.hg0 hg0Var = new org.telegram.ui.Components.hg0(parentActivity);
                            hg0Var.a = null;
                            hg0Var.d = -1;
                            hg0Var.e = false;
                            hg0Var.f = false;
                            hg0Var.h = null;
                            hg0Var.n = new Rect();
                            new Paint();
                            hg0Var.x = true;
                            hg0Var.F = org.telegram.ui.Components.wq.h;
                            hg0Var.setWillNotDraw(false);
                            hg0Var.Q = aa0Var;
                            hg0Var.D = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                            Rect rect = new Rect();
                            Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            org.telegram.ui.ActionBar.t6.x(hg0Var, mutate, org.telegram.ui.ActionBar.m6.h5, null, PorterDuff.Mode.MULTIPLY);
                            mutate.getPadding(rect);
                            int i17 = rect.left;
                            hg0Var.y = i17;
                            org.telegram.ui.Components.dg0 dg0Var = new org.telegram.ui.Components.dg0(hg0Var.getContext());
                            hg0Var.w = dg0Var;
                            dg0Var.setBackgroundDrawable(mutate);
                            dg0Var.setPadding(i17, (org.telegram.messenger.g0.L(8.0f) + rect.top) - 1, i17, 0);
                            dg0Var.setVisibility(4);
                            hg0Var.addView(dg0Var, 0, c8.ha.e(-1, -2, 80));
                            org.telegram.messenger.id.l();
                            hg0Var.O = org.telegram.messenger.id.g0.booleanValue();
                            hg0Var.M = a22;
                            hg0Var.I = da0Var;
                            org.telegram.ui.Components.hb0 hb0Var = new org.telegram.ui.Components.hb0(parentActivity, null);
                            hg0Var.G = hb0Var;
                            hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                            hb0Var.setItemCount(5);
                            org.telegram.ui.Components.hb0 hb0Var2 = new org.telegram.ui.Components.hb0(parentActivity, null);
                            hg0Var.H = hb0Var2;
                            hb0Var2.setItemCount(5);
                            hb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                            org.telegram.ui.Components.eg0 eg0Var = new org.telegram.ui.Components.eg0(hg0Var, parentActivity);
                            hg0Var.P = eg0Var;
                            eg0Var.setOrientation(1);
                            FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                            eg0Var.addView(frameLayout2, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity);
                            textView2.setText(org.telegram.messenger.id.M0(2131748756, null));
                            org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.m6.j5, null, 1, 20.0f);
                            frameLayout2.addView(textView2, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new ei.b(20));
                            LinearLayout linearLayout = new LinearLayout(parentActivity);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            eg0Var.addView(linearLayout, c8.ha.o(-1, -2));
                            System.currentTimeMillis();
                            FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                            TextView textView3 = new TextView(parentActivity);
                            hg0Var.K = textView3;
                            org.telegram.ui.Components.fg0 fg0Var = new org.telegram.ui.Components.fg0(parentActivity);
                            hg0Var.J = fg0Var;
                            linearLayout.addView(hb0Var, c8.ha.l(0.5f, 0, org.telegram.messenger.qs.t4));
                            hb0Var.setFormatter(new org.telegram.ui.Components.cg0(hg0Var, 0));
                            hb0Var.setMinValue(0);
                            hb0Var.setMaxValue(10);
                            hb0Var.setWrapSelectorWheel(false);
                            hb0Var.setTextOffset(org.telegram.messenger.g0.L(20.0f));
                            org.telegram.ui.Components.cg0 cg0Var = new org.telegram.ui.Components.cg0(hg0Var, 1);
                            hb0Var.setOnValueChangedListener(cg0Var);
                            hb0Var2.setMinValue(0);
                            hb0Var2.setMaxValue(10);
                            hb0Var2.setWrapSelectorWheel(false);
                            hb0Var2.setTextOffset(-org.telegram.messenger.g0.L(20.0f));
                            linearLayout.addView(hb0Var2, c8.ha.l(0.5f, 0, org.telegram.messenger.qs.t4));
                            hb0Var2.setFormatter(new org.telegram.ui.Components.cg0(hg0Var, 2));
                            hb0Var2.setOnValueChangedListener(cg0Var);
                            hb0Var.setValue(0);
                            hb0Var2.setValue(6);
                            eg0Var.addView(frameLayout3, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
                            fg0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                            fg0Var.setGravity(17);
                            org.telegram.ui.ActionBar.t6.U(fg0Var, org.telegram.ui.ActionBar.m6.Gi, null);
                            fg0Var.setTextSize(1, 14.0f);
                            fg0Var.setMaxLines(2);
                            fg0Var.setTypeface(org.telegram.messenger.g0.o());
                            fg0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.m6.Ci, 4.0f));
                            frameLayout3.addView(fg0Var, c8.ha.c(48.0f, -1));
                            fg0Var.setOnClickListener(new org.telegram.ui.Components.kk(19, hg0Var, suVar));
                            textView3.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                            textView3.setGravity(17);
                            org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.q5, null);
                            textView3.setTextSize(1, 14.0f);
                            textView3.setAlpha(0.0f);
                            textView3.setScaleX(0.5f);
                            textView3.setScaleY(0.5f);
                            frameLayout3.addView(textView3, c8.ha.c(48.0f, -1));
                            dg0Var.addView(eg0Var, c8.ha.e(-1, -2, 51));
                            sa0Var.N = hg0Var;
                            ((FrameLayout) sa0Var.fragmentView).addView(hg0Var, c8.ha.c(-1.0f, -1));
                            org.telegram.ui.Components.hg0 hg0Var2 = sa0Var.N;
                            hg0Var2.r = false;
                            AnimatorSet animatorSet = hg0Var2.s;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                hg0Var2.s = null;
                            }
                            org.telegram.ui.Components.dg0 dg0Var2 = hg0Var2.w;
                            Point point = org.telegram.messenger.g0.q;
                            dg0Var2.measure(View.MeasureSpec.makeMeasureSpec((hg0Var2.y * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                            if (hg0Var2.r) {
                                z9 = true;
                            } else {
                                dg0Var2.setVisibility(0);
                                if (hg0Var2.x) {
                                    hg0Var2.setLayerType(2, null);
                                }
                                dg0Var2.setTranslationY(dg0Var2.getMeasuredHeight());
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                hg0Var2.s = animatorSet2;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(dg0Var2, (Property<org.telegram.ui.Components.dg0, Float>) View.TRANSLATION_Y, 0.0f));
                                hg0Var2.s.setDuration(400L);
                                hg0Var2.s.setStartDelay(20L);
                                hg0Var2.s.setInterpolator(hg0Var2.F);
                                z9 = true;
                                hg0Var2.s.addListener(new org.telegram.ui.Components.gg0(hg0Var2, 1 == true ? 1 : 0));
                                org.telegram.messenger.qs.e().k(98, 512);
                                hg0Var2.s.start();
                            }
                            hg0Var2.c(z9);
                            return;
                        case 1:
                            try {
                                TLRPC.GeoPoint geoPoint = sa0Var.D0.k.media.geo;
                                double d = geoPoint.lat;
                                double d2 = geoPoint._long;
                                sa0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                                return;
                            } catch (Exception e12) {
                                org.telegram.messenger.a8.g(e12, true);
                                return;
                            }
                        case 2:
                            int i18 = sa0Var.H0;
                            Activity parentActivity2 = sa0Var.getParentActivity();
                            if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                                if (sa0Var.getParentActivity() == null) {
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sa0Var.getParentActivity());
                                int i19 = org.telegram.ui.ActionBar.m6.L5;
                                alertDialog$Builder.m(R.raw.permission_request_location, 72, sa0Var.getThemedColor(i19), null);
                                alertDialog$Builder.n(i19, sa0Var.getResourceProvider());
                                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131747304, null));
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.T = X2;
                                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747300, null), new da0(sa0Var, i16));
                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                                sa0Var.showDialog(u1Var);
                                return;
                            }
                            if (sa0Var.l0() || i18 == 3) {
                                if ((sa0Var.D0 != null && i18 != 3) || sa0Var.B0 != null) {
                                    if (sa0Var.y0 == null || (faVar = sa0Var.E) == null) {
                                        return;
                                    }
                                    faVar.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(sa0Var.y0.getLatitude(), sa0Var.y0.getLongitude()), sa0Var.E.e() - 4.0f));
                                    return;
                                }
                                if (sa0Var.y0 == null || sa0Var.E == null) {
                                    return;
                                }
                                ImageView imageView = sa0Var.a;
                                int i20 = org.telegram.ui.ActionBar.m6.jj;
                                org.telegram.ui.ActionBar.t6.s(imageView, i20, sa0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                sa0Var.a.setTag(Integer.valueOf(i20));
                                sa0Var.P.L(null);
                                sa0Var.E0 = false;
                                sa0Var.E.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.cb(sa0Var.y0.getLatitude(), sa0Var.y0.getLongitude())));
                                return;
                            }
                            return;
                        default:
                            sa0Var.p0 = -1L;
                            sa0Var.E0 = true;
                            if (sa0Var.r0()) {
                                sa0Var.q0 = true;
                                sa0Var.J0(false, true);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        org.telegram.ui.ActionBar.m5 titleTextView = this.simpleActionBar.getTitleTextView();
        if (titleTextView != null) {
            fh.g c10 = getBaseSimpleGlass().c.c(titleTextView, null, false);
            c10.p(c8.g0.l(getResourceProvider()));
            c10.r(org.telegram.messenger.g0.L(23.0f));
            titleTextView.setBackground(c10);
            Paint.FontMetricsInt fontMetricsInt = titleTextView.getTextPaint().getFontMetricsInt();
            int max = Math.max(0, (org.telegram.messenger.g0.L(46.0f) - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
            titleTextView.setPadding(org.telegram.messenger.g0.L(18.0f), max, org.telegram.messenger.g0.L(18.0f), max);
        }
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        F0(imageView);
        this.a.setImageResource(R.drawable.msg_current_location);
        ImageView imageView2 = this.a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.a;
        int i15 = org.telegram.ui.ActionBar.m6.jj;
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView3, i15, resourceProvider, mode);
        this.a.setTag(Integer.valueOf(i15));
        this.a.setContentDescription(org.telegram.messenger.id.M0(2131754831, null));
        this.X.addView(this.a, c8.ha.e(58, 58, 85));
        final int i16 = i7;
        this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ba0
            public final /* synthetic */ sa0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z9;
                org.telegram.messenger.fa faVar;
                int i152 = i16;
                int i162 = 2;
                sa0 sa0Var = this.b;
                switch (i152) {
                    case 0:
                        if (sa0Var.getParentActivity() == null || sa0Var.y0 == null || !sa0Var.l0() || sa0Var.E == null) {
                            return;
                        }
                        fi.m3 m3Var = sa0Var.s;
                        if (m3Var != null) {
                            m3Var.f(true);
                        }
                        org.telegram.messenger.qp.e1().edit().putInt("proximityhint", 3).commit();
                        org.telegram.messenger.rd h = sa0Var.getLocationController().h(sa0Var.l0);
                        if (sa0Var.y) {
                            sa0Var.x[0].d(1, true);
                        }
                        if (h != null && h.f > 0) {
                            sa0Var.c.setImageResource(R.drawable.msg_location_alert);
                            m4.d0 d0Var = sa0Var.K;
                            if (d0Var != null) {
                                d0Var.R0();
                                sa0Var.K = null;
                            }
                            sa0Var.y = true;
                            sa0Var.w0().k(0L, 25, 0, null, new aa0(sa0Var, 3), new f10(23, sa0Var, h));
                            return;
                        }
                        m4.d0 d0Var2 = sa0Var.K;
                        if (d0Var2 == null) {
                            sa0Var.m0(500);
                        } else {
                            try {
                                v7.f fVar = (v7.f) ((m8.a) d0Var2.a).a;
                                Parcel o12 = fVar.o1(fVar.p1(), 6);
                                double readDouble = o12.readDouble();
                                o12.recycle();
                                sa0Var.L = readDouble;
                            } catch (RemoteException e11) {
                                throw new androidx.car.app.j(e11);
                            }
                        }
                        TLRPC.User a22 = org.telegram.messenger.m5.E(sa0Var.l0) ? sa0Var.getMessagesController().a2(Long.valueOf(sa0Var.l0)) : null;
                        Activity parentActivity = sa0Var.getParentActivity();
                        da0 da0Var = new da0(sa0Var, 4);
                        su suVar = new su(17, sa0Var, a22);
                        aa0 aa0Var = new aa0(sa0Var, 4);
                        org.telegram.ui.Components.hg0 hg0Var = new org.telegram.ui.Components.hg0(parentActivity);
                        hg0Var.a = null;
                        hg0Var.d = -1;
                        hg0Var.e = false;
                        hg0Var.f = false;
                        hg0Var.h = null;
                        hg0Var.n = new Rect();
                        new Paint();
                        hg0Var.x = true;
                        hg0Var.F = org.telegram.ui.Components.wq.h;
                        hg0Var.setWillNotDraw(false);
                        hg0Var.Q = aa0Var;
                        hg0Var.D = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                        Rect rect = new Rect();
                        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                        org.telegram.ui.ActionBar.t6.x(hg0Var, mutate, org.telegram.ui.ActionBar.m6.h5, null, PorterDuff.Mode.MULTIPLY);
                        mutate.getPadding(rect);
                        int i17 = rect.left;
                        hg0Var.y = i17;
                        org.telegram.ui.Components.dg0 dg0Var = new org.telegram.ui.Components.dg0(hg0Var.getContext());
                        hg0Var.w = dg0Var;
                        dg0Var.setBackgroundDrawable(mutate);
                        dg0Var.setPadding(i17, (org.telegram.messenger.g0.L(8.0f) + rect.top) - 1, i17, 0);
                        dg0Var.setVisibility(4);
                        hg0Var.addView(dg0Var, 0, c8.ha.e(-1, -2, 80));
                        org.telegram.messenger.id.l();
                        hg0Var.O = org.telegram.messenger.id.g0.booleanValue();
                        hg0Var.M = a22;
                        hg0Var.I = da0Var;
                        org.telegram.ui.Components.hb0 hb0Var = new org.telegram.ui.Components.hb0(parentActivity, null);
                        hg0Var.G = hb0Var;
                        hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                        hb0Var.setItemCount(5);
                        org.telegram.ui.Components.hb0 hb0Var2 = new org.telegram.ui.Components.hb0(parentActivity, null);
                        hg0Var.H = hb0Var2;
                        hb0Var2.setItemCount(5);
                        hb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Components.eg0 eg0Var = new org.telegram.ui.Components.eg0(hg0Var, parentActivity);
                        hg0Var.P = eg0Var;
                        eg0Var.setOrientation(1);
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                        eg0Var.addView(frameLayout2, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(parentActivity);
                        textView2.setText(org.telegram.messenger.id.M0(2131748756, null));
                        org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.m6.j5, null, 1, 20.0f);
                        frameLayout2.addView(textView2, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new ei.b(20));
                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        eg0Var.addView(linearLayout, c8.ha.o(-1, -2));
                        System.currentTimeMillis();
                        FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                        TextView textView3 = new TextView(parentActivity);
                        hg0Var.K = textView3;
                        org.telegram.ui.Components.fg0 fg0Var = new org.telegram.ui.Components.fg0(parentActivity);
                        hg0Var.J = fg0Var;
                        linearLayout.addView(hb0Var, c8.ha.l(0.5f, 0, org.telegram.messenger.qs.t4));
                        hb0Var.setFormatter(new org.telegram.ui.Components.cg0(hg0Var, 0));
                        hb0Var.setMinValue(0);
                        hb0Var.setMaxValue(10);
                        hb0Var.setWrapSelectorWheel(false);
                        hb0Var.setTextOffset(org.telegram.messenger.g0.L(20.0f));
                        org.telegram.ui.Components.cg0 cg0Var = new org.telegram.ui.Components.cg0(hg0Var, 1);
                        hb0Var.setOnValueChangedListener(cg0Var);
                        hb0Var2.setMinValue(0);
                        hb0Var2.setMaxValue(10);
                        hb0Var2.setWrapSelectorWheel(false);
                        hb0Var2.setTextOffset(-org.telegram.messenger.g0.L(20.0f));
                        linearLayout.addView(hb0Var2, c8.ha.l(0.5f, 0, org.telegram.messenger.qs.t4));
                        hb0Var2.setFormatter(new org.telegram.ui.Components.cg0(hg0Var, 2));
                        hb0Var2.setOnValueChangedListener(cg0Var);
                        hb0Var.setValue(0);
                        hb0Var2.setValue(6);
                        eg0Var.addView(frameLayout3, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
                        fg0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        fg0Var.setGravity(17);
                        org.telegram.ui.ActionBar.t6.U(fg0Var, org.telegram.ui.ActionBar.m6.Gi, null);
                        fg0Var.setTextSize(1, 14.0f);
                        fg0Var.setMaxLines(2);
                        fg0Var.setTypeface(org.telegram.messenger.g0.o());
                        fg0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.m6.Ci, 4.0f));
                        frameLayout3.addView(fg0Var, c8.ha.c(48.0f, -1));
                        fg0Var.setOnClickListener(new org.telegram.ui.Components.kk(19, hg0Var, suVar));
                        textView3.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        textView3.setGravity(17);
                        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.q5, null);
                        textView3.setTextSize(1, 14.0f);
                        textView3.setAlpha(0.0f);
                        textView3.setScaleX(0.5f);
                        textView3.setScaleY(0.5f);
                        frameLayout3.addView(textView3, c8.ha.c(48.0f, -1));
                        dg0Var.addView(eg0Var, c8.ha.e(-1, -2, 51));
                        sa0Var.N = hg0Var;
                        ((FrameLayout) sa0Var.fragmentView).addView(hg0Var, c8.ha.c(-1.0f, -1));
                        org.telegram.ui.Components.hg0 hg0Var2 = sa0Var.N;
                        hg0Var2.r = false;
                        AnimatorSet animatorSet = hg0Var2.s;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            hg0Var2.s = null;
                        }
                        org.telegram.ui.Components.dg0 dg0Var2 = hg0Var2.w;
                        Point point = org.telegram.messenger.g0.q;
                        dg0Var2.measure(View.MeasureSpec.makeMeasureSpec((hg0Var2.y * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        if (hg0Var2.r) {
                            z9 = true;
                        } else {
                            dg0Var2.setVisibility(0);
                            if (hg0Var2.x) {
                                hg0Var2.setLayerType(2, null);
                            }
                            dg0Var2.setTranslationY(dg0Var2.getMeasuredHeight());
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            hg0Var2.s = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(dg0Var2, (Property<org.telegram.ui.Components.dg0, Float>) View.TRANSLATION_Y, 0.0f));
                            hg0Var2.s.setDuration(400L);
                            hg0Var2.s.setStartDelay(20L);
                            hg0Var2.s.setInterpolator(hg0Var2.F);
                            z9 = true;
                            hg0Var2.s.addListener(new org.telegram.ui.Components.gg0(hg0Var2, 1 == true ? 1 : 0));
                            org.telegram.messenger.qs.e().k(98, 512);
                            hg0Var2.s.start();
                        }
                        hg0Var2.c(z9);
                        return;
                    case 1:
                        try {
                            TLRPC.GeoPoint geoPoint = sa0Var.D0.k.media.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            sa0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                            return;
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                            return;
                        }
                    case 2:
                        int i18 = sa0Var.H0;
                        Activity parentActivity2 = sa0Var.getParentActivity();
                        if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (sa0Var.getParentActivity() == null) {
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sa0Var.getParentActivity());
                            int i19 = org.telegram.ui.ActionBar.m6.L5;
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, sa0Var.getThemedColor(i19), null);
                            alertDialog$Builder.n(i19, sa0Var.getResourceProvider());
                            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131747304, null));
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.T = X2;
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747300, null), new da0(sa0Var, i162));
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                            sa0Var.showDialog(u1Var);
                            return;
                        }
                        if (sa0Var.l0() || i18 == 3) {
                            if ((sa0Var.D0 != null && i18 != 3) || sa0Var.B0 != null) {
                                if (sa0Var.y0 == null || (faVar = sa0Var.E) == null) {
                                    return;
                                }
                                faVar.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(sa0Var.y0.getLatitude(), sa0Var.y0.getLongitude()), sa0Var.E.e() - 4.0f));
                                return;
                            }
                            if (sa0Var.y0 == null || sa0Var.E == null) {
                                return;
                            }
                            ImageView imageView4 = sa0Var.a;
                            int i20 = org.telegram.ui.ActionBar.m6.jj;
                            org.telegram.ui.ActionBar.t6.s(imageView4, i20, sa0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            sa0Var.a.setTag(Integer.valueOf(i20));
                            sa0Var.P.L(null);
                            sa0Var.E0 = false;
                            sa0Var.E.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.cb(sa0Var.y0.getLatitude(), sa0Var.y0.getLongitude())));
                            return;
                        }
                        return;
                    default:
                        sa0Var.p0 = -1L;
                        sa0Var.E0 = true;
                        if (sa0Var.r0()) {
                            sa0Var.q0 = true;
                            sa0Var.J0(false, true);
                            return;
                        }
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        this.b = textView2;
        F0(textView2);
        this.b.setGravity(17);
        this.b.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.t6.U(this.b, org.telegram.ui.ActionBar.m6.Ci, this.resourceProvider);
        this.b.setTypeface(org.telegram.messenger.g0.o());
        this.b.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        this.b.setText(org.telegram.messenger.id.M0(2131748744, null));
        this.X.addView(this.b, c8.ha.e(-2, 58, 81));
        final int i17 = 3;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ba0
            public final /* synthetic */ sa0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z9;
                org.telegram.messenger.fa faVar;
                int i152 = i17;
                int i162 = 2;
                sa0 sa0Var = this.b;
                switch (i152) {
                    case 0:
                        if (sa0Var.getParentActivity() == null || sa0Var.y0 == null || !sa0Var.l0() || sa0Var.E == null) {
                            return;
                        }
                        fi.m3 m3Var = sa0Var.s;
                        if (m3Var != null) {
                            m3Var.f(true);
                        }
                        org.telegram.messenger.qp.e1().edit().putInt("proximityhint", 3).commit();
                        org.telegram.messenger.rd h = sa0Var.getLocationController().h(sa0Var.l0);
                        if (sa0Var.y) {
                            sa0Var.x[0].d(1, true);
                        }
                        if (h != null && h.f > 0) {
                            sa0Var.c.setImageResource(R.drawable.msg_location_alert);
                            m4.d0 d0Var = sa0Var.K;
                            if (d0Var != null) {
                                d0Var.R0();
                                sa0Var.K = null;
                            }
                            sa0Var.y = true;
                            sa0Var.w0().k(0L, 25, 0, null, new aa0(sa0Var, 3), new f10(23, sa0Var, h));
                            return;
                        }
                        m4.d0 d0Var2 = sa0Var.K;
                        if (d0Var2 == null) {
                            sa0Var.m0(500);
                        } else {
                            try {
                                v7.f fVar = (v7.f) ((m8.a) d0Var2.a).a;
                                Parcel o12 = fVar.o1(fVar.p1(), 6);
                                double readDouble = o12.readDouble();
                                o12.recycle();
                                sa0Var.L = readDouble;
                            } catch (RemoteException e11) {
                                throw new androidx.car.app.j(e11);
                            }
                        }
                        TLRPC.User a22 = org.telegram.messenger.m5.E(sa0Var.l0) ? sa0Var.getMessagesController().a2(Long.valueOf(sa0Var.l0)) : null;
                        Activity parentActivity = sa0Var.getParentActivity();
                        da0 da0Var = new da0(sa0Var, 4);
                        su suVar = new su(17, sa0Var, a22);
                        aa0 aa0Var = new aa0(sa0Var, 4);
                        org.telegram.ui.Components.hg0 hg0Var = new org.telegram.ui.Components.hg0(parentActivity);
                        hg0Var.a = null;
                        hg0Var.d = -1;
                        hg0Var.e = false;
                        hg0Var.f = false;
                        hg0Var.h = null;
                        hg0Var.n = new Rect();
                        new Paint();
                        hg0Var.x = true;
                        hg0Var.F = org.telegram.ui.Components.wq.h;
                        hg0Var.setWillNotDraw(false);
                        hg0Var.Q = aa0Var;
                        hg0Var.D = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                        Rect rect = new Rect();
                        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                        org.telegram.ui.ActionBar.t6.x(hg0Var, mutate, org.telegram.ui.ActionBar.m6.h5, null, PorterDuff.Mode.MULTIPLY);
                        mutate.getPadding(rect);
                        int i172 = rect.left;
                        hg0Var.y = i172;
                        org.telegram.ui.Components.dg0 dg0Var = new org.telegram.ui.Components.dg0(hg0Var.getContext());
                        hg0Var.w = dg0Var;
                        dg0Var.setBackgroundDrawable(mutate);
                        dg0Var.setPadding(i172, (org.telegram.messenger.g0.L(8.0f) + rect.top) - 1, i172, 0);
                        dg0Var.setVisibility(4);
                        hg0Var.addView(dg0Var, 0, c8.ha.e(-1, -2, 80));
                        org.telegram.messenger.id.l();
                        hg0Var.O = org.telegram.messenger.id.g0.booleanValue();
                        hg0Var.M = a22;
                        hg0Var.I = da0Var;
                        org.telegram.ui.Components.hb0 hb0Var = new org.telegram.ui.Components.hb0(parentActivity, null);
                        hg0Var.G = hb0Var;
                        hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                        hb0Var.setItemCount(5);
                        org.telegram.ui.Components.hb0 hb0Var2 = new org.telegram.ui.Components.hb0(parentActivity, null);
                        hg0Var.H = hb0Var2;
                        hb0Var2.setItemCount(5);
                        hb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Components.eg0 eg0Var = new org.telegram.ui.Components.eg0(hg0Var, parentActivity);
                        hg0Var.P = eg0Var;
                        eg0Var.setOrientation(1);
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                        eg0Var.addView(frameLayout2, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView22 = new TextView(parentActivity);
                        textView22.setText(org.telegram.messenger.id.M0(2131748756, null));
                        org.telegram.messenger.k5.n(textView22, org.telegram.ui.ActionBar.m6.j5, null, 1, 20.0f);
                        frameLayout2.addView(textView22, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView22.setOnTouchListener(new ei.b(20));
                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        eg0Var.addView(linearLayout, c8.ha.o(-1, -2));
                        System.currentTimeMillis();
                        FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                        TextView textView3 = new TextView(parentActivity);
                        hg0Var.K = textView3;
                        org.telegram.ui.Components.fg0 fg0Var = new org.telegram.ui.Components.fg0(parentActivity);
                        hg0Var.J = fg0Var;
                        linearLayout.addView(hb0Var, c8.ha.l(0.5f, 0, org.telegram.messenger.qs.t4));
                        hb0Var.setFormatter(new org.telegram.ui.Components.cg0(hg0Var, 0));
                        hb0Var.setMinValue(0);
                        hb0Var.setMaxValue(10);
                        hb0Var.setWrapSelectorWheel(false);
                        hb0Var.setTextOffset(org.telegram.messenger.g0.L(20.0f));
                        org.telegram.ui.Components.cg0 cg0Var = new org.telegram.ui.Components.cg0(hg0Var, 1);
                        hb0Var.setOnValueChangedListener(cg0Var);
                        hb0Var2.setMinValue(0);
                        hb0Var2.setMaxValue(10);
                        hb0Var2.setWrapSelectorWheel(false);
                        hb0Var2.setTextOffset(-org.telegram.messenger.g0.L(20.0f));
                        linearLayout.addView(hb0Var2, c8.ha.l(0.5f, 0, org.telegram.messenger.qs.t4));
                        hb0Var2.setFormatter(new org.telegram.ui.Components.cg0(hg0Var, 2));
                        hb0Var2.setOnValueChangedListener(cg0Var);
                        hb0Var.setValue(0);
                        hb0Var2.setValue(6);
                        eg0Var.addView(frameLayout3, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
                        fg0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        fg0Var.setGravity(17);
                        org.telegram.ui.ActionBar.t6.U(fg0Var, org.telegram.ui.ActionBar.m6.Gi, null);
                        fg0Var.setTextSize(1, 14.0f);
                        fg0Var.setMaxLines(2);
                        fg0Var.setTypeface(org.telegram.messenger.g0.o());
                        fg0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.m6.Ci, 4.0f));
                        frameLayout3.addView(fg0Var, c8.ha.c(48.0f, -1));
                        fg0Var.setOnClickListener(new org.telegram.ui.Components.kk(19, hg0Var, suVar));
                        textView3.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        textView3.setGravity(17);
                        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.q5, null);
                        textView3.setTextSize(1, 14.0f);
                        textView3.setAlpha(0.0f);
                        textView3.setScaleX(0.5f);
                        textView3.setScaleY(0.5f);
                        frameLayout3.addView(textView3, c8.ha.c(48.0f, -1));
                        dg0Var.addView(eg0Var, c8.ha.e(-1, -2, 51));
                        sa0Var.N = hg0Var;
                        ((FrameLayout) sa0Var.fragmentView).addView(hg0Var, c8.ha.c(-1.0f, -1));
                        org.telegram.ui.Components.hg0 hg0Var2 = sa0Var.N;
                        hg0Var2.r = false;
                        AnimatorSet animatorSet = hg0Var2.s;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            hg0Var2.s = null;
                        }
                        org.telegram.ui.Components.dg0 dg0Var2 = hg0Var2.w;
                        Point point = org.telegram.messenger.g0.q;
                        dg0Var2.measure(View.MeasureSpec.makeMeasureSpec((hg0Var2.y * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        if (hg0Var2.r) {
                            z9 = true;
                        } else {
                            dg0Var2.setVisibility(0);
                            if (hg0Var2.x) {
                                hg0Var2.setLayerType(2, null);
                            }
                            dg0Var2.setTranslationY(dg0Var2.getMeasuredHeight());
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            hg0Var2.s = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(dg0Var2, (Property<org.telegram.ui.Components.dg0, Float>) View.TRANSLATION_Y, 0.0f));
                            hg0Var2.s.setDuration(400L);
                            hg0Var2.s.setStartDelay(20L);
                            hg0Var2.s.setInterpolator(hg0Var2.F);
                            z9 = true;
                            hg0Var2.s.addListener(new org.telegram.ui.Components.gg0(hg0Var2, 1 == true ? 1 : 0));
                            org.telegram.messenger.qs.e().k(98, 512);
                            hg0Var2.s.start();
                        }
                        hg0Var2.c(z9);
                        return;
                    case 1:
                        try {
                            TLRPC.GeoPoint geoPoint = sa0Var.D0.k.media.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            sa0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                            return;
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                            return;
                        }
                    case 2:
                        int i18 = sa0Var.H0;
                        Activity parentActivity2 = sa0Var.getParentActivity();
                        if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (sa0Var.getParentActivity() == null) {
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sa0Var.getParentActivity());
                            int i19 = org.telegram.ui.ActionBar.m6.L5;
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, sa0Var.getThemedColor(i19), null);
                            alertDialog$Builder.n(i19, sa0Var.getResourceProvider());
                            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131747304, null));
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.T = X2;
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747300, null), new da0(sa0Var, i162));
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                            sa0Var.showDialog(u1Var);
                            return;
                        }
                        if (sa0Var.l0() || i18 == 3) {
                            if ((sa0Var.D0 != null && i18 != 3) || sa0Var.B0 != null) {
                                if (sa0Var.y0 == null || (faVar = sa0Var.E) == null) {
                                    return;
                                }
                                faVar.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(sa0Var.y0.getLatitude(), sa0Var.y0.getLongitude()), sa0Var.E.e() - 4.0f));
                                return;
                            }
                            if (sa0Var.y0 == null || sa0Var.E == null) {
                                return;
                            }
                            ImageView imageView4 = sa0Var.a;
                            int i20 = org.telegram.ui.ActionBar.m6.jj;
                            org.telegram.ui.ActionBar.t6.s(imageView4, i20, sa0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            sa0Var.a.setTag(Integer.valueOf(i20));
                            sa0Var.P.L(null);
                            sa0Var.E0 = false;
                            sa0Var.E.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.cb(sa0Var.y0.getLatitude(), sa0Var.y0.getLongitude())));
                            return;
                        }
                        return;
                    default:
                        sa0Var.p0 = -1L;
                        sa0Var.E0 = true;
                        if (sa0Var.r0()) {
                            sa0Var.q0 = true;
                            sa0Var.J0(false, true);
                            return;
                        }
                        return;
                }
            }
        });
        J0(false, false);
        ImageView imageView4 = new ImageView(context);
        this.c = imageView4;
        F0(imageView4);
        org.telegram.ui.ActionBar.t6.s(this.c, org.telegram.ui.ActionBar.m6.ij, getResourceProvider(), mode);
        this.c.setScaleType(scaleType);
        this.c.setContentDescription(org.telegram.messenger.id.M0(2131754847, null));
        this.W.addView(this.c, c8.ha.e(58, 58, 53));
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ba0
            public final /* synthetic */ sa0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z9;
                org.telegram.messenger.fa faVar;
                int i152 = i11;
                int i162 = 2;
                sa0 sa0Var = this.b;
                switch (i152) {
                    case 0:
                        if (sa0Var.getParentActivity() == null || sa0Var.y0 == null || !sa0Var.l0() || sa0Var.E == null) {
                            return;
                        }
                        fi.m3 m3Var = sa0Var.s;
                        if (m3Var != null) {
                            m3Var.f(true);
                        }
                        org.telegram.messenger.qp.e1().edit().putInt("proximityhint", 3).commit();
                        org.telegram.messenger.rd h = sa0Var.getLocationController().h(sa0Var.l0);
                        if (sa0Var.y) {
                            sa0Var.x[0].d(1, true);
                        }
                        if (h != null && h.f > 0) {
                            sa0Var.c.setImageResource(R.drawable.msg_location_alert);
                            m4.d0 d0Var = sa0Var.K;
                            if (d0Var != null) {
                                d0Var.R0();
                                sa0Var.K = null;
                            }
                            sa0Var.y = true;
                            sa0Var.w0().k(0L, 25, 0, null, new aa0(sa0Var, 3), new f10(23, sa0Var, h));
                            return;
                        }
                        m4.d0 d0Var2 = sa0Var.K;
                        if (d0Var2 == null) {
                            sa0Var.m0(500);
                        } else {
                            try {
                                v7.f fVar = (v7.f) ((m8.a) d0Var2.a).a;
                                Parcel o12 = fVar.o1(fVar.p1(), 6);
                                double readDouble = o12.readDouble();
                                o12.recycle();
                                sa0Var.L = readDouble;
                            } catch (RemoteException e11) {
                                throw new androidx.car.app.j(e11);
                            }
                        }
                        TLRPC.User a22 = org.telegram.messenger.m5.E(sa0Var.l0) ? sa0Var.getMessagesController().a2(Long.valueOf(sa0Var.l0)) : null;
                        Activity parentActivity = sa0Var.getParentActivity();
                        da0 da0Var = new da0(sa0Var, 4);
                        su suVar = new su(17, sa0Var, a22);
                        aa0 aa0Var = new aa0(sa0Var, 4);
                        org.telegram.ui.Components.hg0 hg0Var = new org.telegram.ui.Components.hg0(parentActivity);
                        hg0Var.a = null;
                        hg0Var.d = -1;
                        hg0Var.e = false;
                        hg0Var.f = false;
                        hg0Var.h = null;
                        hg0Var.n = new Rect();
                        new Paint();
                        hg0Var.x = true;
                        hg0Var.F = org.telegram.ui.Components.wq.h;
                        hg0Var.setWillNotDraw(false);
                        hg0Var.Q = aa0Var;
                        hg0Var.D = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                        Rect rect = new Rect();
                        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                        org.telegram.ui.ActionBar.t6.x(hg0Var, mutate, org.telegram.ui.ActionBar.m6.h5, null, PorterDuff.Mode.MULTIPLY);
                        mutate.getPadding(rect);
                        int i172 = rect.left;
                        hg0Var.y = i172;
                        org.telegram.ui.Components.dg0 dg0Var = new org.telegram.ui.Components.dg0(hg0Var.getContext());
                        hg0Var.w = dg0Var;
                        dg0Var.setBackgroundDrawable(mutate);
                        dg0Var.setPadding(i172, (org.telegram.messenger.g0.L(8.0f) + rect.top) - 1, i172, 0);
                        dg0Var.setVisibility(4);
                        hg0Var.addView(dg0Var, 0, c8.ha.e(-1, -2, 80));
                        org.telegram.messenger.id.l();
                        hg0Var.O = org.telegram.messenger.id.g0.booleanValue();
                        hg0Var.M = a22;
                        hg0Var.I = da0Var;
                        org.telegram.ui.Components.hb0 hb0Var = new org.telegram.ui.Components.hb0(parentActivity, null);
                        hg0Var.G = hb0Var;
                        hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                        hb0Var.setItemCount(5);
                        org.telegram.ui.Components.hb0 hb0Var2 = new org.telegram.ui.Components.hb0(parentActivity, null);
                        hg0Var.H = hb0Var2;
                        hb0Var2.setItemCount(5);
                        hb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                        org.telegram.ui.Components.eg0 eg0Var = new org.telegram.ui.Components.eg0(hg0Var, parentActivity);
                        hg0Var.P = eg0Var;
                        eg0Var.setOrientation(1);
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                        eg0Var.addView(frameLayout2, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView22 = new TextView(parentActivity);
                        textView22.setText(org.telegram.messenger.id.M0(2131748756, null));
                        org.telegram.messenger.k5.n(textView22, org.telegram.ui.ActionBar.m6.j5, null, 1, 20.0f);
                        frameLayout2.addView(textView22, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView22.setOnTouchListener(new ei.b(20));
                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        eg0Var.addView(linearLayout, c8.ha.o(-1, -2));
                        System.currentTimeMillis();
                        FrameLayout frameLayout3 = new FrameLayout(parentActivity);
                        TextView textView3 = new TextView(parentActivity);
                        hg0Var.K = textView3;
                        org.telegram.ui.Components.fg0 fg0Var = new org.telegram.ui.Components.fg0(parentActivity);
                        hg0Var.J = fg0Var;
                        linearLayout.addView(hb0Var, c8.ha.l(0.5f, 0, org.telegram.messenger.qs.t4));
                        hb0Var.setFormatter(new org.telegram.ui.Components.cg0(hg0Var, 0));
                        hb0Var.setMinValue(0);
                        hb0Var.setMaxValue(10);
                        hb0Var.setWrapSelectorWheel(false);
                        hb0Var.setTextOffset(org.telegram.messenger.g0.L(20.0f));
                        org.telegram.ui.Components.cg0 cg0Var = new org.telegram.ui.Components.cg0(hg0Var, 1);
                        hb0Var.setOnValueChangedListener(cg0Var);
                        hb0Var2.setMinValue(0);
                        hb0Var2.setMaxValue(10);
                        hb0Var2.setWrapSelectorWheel(false);
                        hb0Var2.setTextOffset(-org.telegram.messenger.g0.L(20.0f));
                        linearLayout.addView(hb0Var2, c8.ha.l(0.5f, 0, org.telegram.messenger.qs.t4));
                        hb0Var2.setFormatter(new org.telegram.ui.Components.cg0(hg0Var, 2));
                        hb0Var2.setOnValueChangedListener(cg0Var);
                        hb0Var.setValue(0);
                        hb0Var2.setValue(6);
                        eg0Var.addView(frameLayout3, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
                        fg0Var.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        fg0Var.setGravity(17);
                        org.telegram.ui.ActionBar.t6.U(fg0Var, org.telegram.ui.ActionBar.m6.Gi, null);
                        fg0Var.setTextSize(1, 14.0f);
                        fg0Var.setMaxLines(2);
                        fg0Var.setTypeface(org.telegram.messenger.g0.o());
                        fg0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.m6.Ci, 4.0f));
                        frameLayout3.addView(fg0Var, c8.ha.c(48.0f, -1));
                        fg0Var.setOnClickListener(new org.telegram.ui.Components.kk(19, hg0Var, suVar));
                        textView3.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        textView3.setGravity(17);
                        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.q5, null);
                        textView3.setTextSize(1, 14.0f);
                        textView3.setAlpha(0.0f);
                        textView3.setScaleX(0.5f);
                        textView3.setScaleY(0.5f);
                        frameLayout3.addView(textView3, c8.ha.c(48.0f, -1));
                        dg0Var.addView(eg0Var, c8.ha.e(-1, -2, 51));
                        sa0Var.N = hg0Var;
                        ((FrameLayout) sa0Var.fragmentView).addView(hg0Var, c8.ha.c(-1.0f, -1));
                        org.telegram.ui.Components.hg0 hg0Var2 = sa0Var.N;
                        hg0Var2.r = false;
                        AnimatorSet animatorSet = hg0Var2.s;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            hg0Var2.s = null;
                        }
                        org.telegram.ui.Components.dg0 dg0Var2 = hg0Var2.w;
                        Point point = org.telegram.messenger.g0.q;
                        dg0Var2.measure(View.MeasureSpec.makeMeasureSpec((hg0Var2.y * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        if (hg0Var2.r) {
                            z9 = true;
                        } else {
                            dg0Var2.setVisibility(0);
                            if (hg0Var2.x) {
                                hg0Var2.setLayerType(2, null);
                            }
                            dg0Var2.setTranslationY(dg0Var2.getMeasuredHeight());
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            hg0Var2.s = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(dg0Var2, (Property<org.telegram.ui.Components.dg0, Float>) View.TRANSLATION_Y, 0.0f));
                            hg0Var2.s.setDuration(400L);
                            hg0Var2.s.setStartDelay(20L);
                            hg0Var2.s.setInterpolator(hg0Var2.F);
                            z9 = true;
                            hg0Var2.s.addListener(new org.telegram.ui.Components.gg0(hg0Var2, 1 == true ? 1 : 0));
                            org.telegram.messenger.qs.e().k(98, 512);
                            hg0Var2.s.start();
                        }
                        hg0Var2.c(z9);
                        return;
                    case 1:
                        try {
                            TLRPC.GeoPoint geoPoint = sa0Var.D0.k.media.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            sa0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                            return;
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                            return;
                        }
                    case 2:
                        int i18 = sa0Var.H0;
                        Activity parentActivity2 = sa0Var.getParentActivity();
                        if (parentActivity2 != null && parentActivity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (sa0Var.getParentActivity() == null) {
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sa0Var.getParentActivity());
                            int i19 = org.telegram.ui.ActionBar.m6.L5;
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, sa0Var.getThemedColor(i19), null);
                            alertDialog$Builder.n(i19, sa0Var.getResourceProvider());
                            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131747304, null));
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.T = X2;
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747300, null), new da0(sa0Var, i162));
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                            sa0Var.showDialog(u1Var);
                            return;
                        }
                        if (sa0Var.l0() || i18 == 3) {
                            if ((sa0Var.D0 != null && i18 != 3) || sa0Var.B0 != null) {
                                if (sa0Var.y0 == null || (faVar = sa0Var.E) == null) {
                                    return;
                                }
                                faVar.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(sa0Var.y0.getLatitude(), sa0Var.y0.getLongitude()), sa0Var.E.e() - 4.0f));
                                return;
                            }
                            if (sa0Var.y0 == null || sa0Var.E == null) {
                                return;
                            }
                            ImageView imageView42 = sa0Var.a;
                            int i20 = org.telegram.ui.ActionBar.m6.jj;
                            org.telegram.ui.ActionBar.t6.s(imageView42, i20, sa0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            sa0Var.a.setTag(Integer.valueOf(i20));
                            sa0Var.P.L(null);
                            sa0Var.E0 = false;
                            sa0Var.E.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.cb(sa0Var.y0.getLatitude(), sa0Var.y0.getLongitude())));
                            return;
                        }
                        return;
                    default:
                        sa0Var.p0 = -1L;
                        sa0Var.E0 = true;
                        if (sa0Var.r0()) {
                            sa0Var.q0 = true;
                            sa0Var.J0(false, true);
                            return;
                        }
                        return;
                }
            }
        });
        TLRPC.Chat M0 = org.telegram.messenger.m5.z(this.l0) ? getMessagesController().M0(Long.valueOf(-this.l0)) : null;
        org.telegram.messenger.ij ijVar5 = this.D0;
        if (ijVar5 != null && ijVar5.C3()) {
            org.telegram.messenger.ij ijVar6 = this.D0;
            int currentTime = getConnectionsManager().getCurrentTime();
            TLRPC.Message message2 = ijVar6.k;
            if (message2.date + org.telegram.messenger.ij.n1(message2).period > currentTime && (!org.telegram.messenger.t3.T(M0) || M0.megagroup)) {
                chat = M0;
                org.telegram.messenger.rd h = getLocationController().h(this.l0);
                if (h == null || h.f <= 0) {
                    if (org.telegram.messenger.m5.E(this.l0) && this.D0.Z0() == getUserConfig().e()) {
                        this.c.setVisibility(4);
                        this.c.setAlpha(0.0f);
                        this.c.setScaleX(0.4f);
                        this.c.setScaleY(0.4f);
                    }
                    this.c.setImageResource(R.drawable.msg_location_alert);
                } else {
                    this.c.setImageResource(R.drawable.msg_location_alert2);
                }
                fi.m3 m3Var = new fi.m3(context, 1);
                this.s = m3Var;
                m3Var.setLayerType(2, null);
                fi.m3 m3Var2 = this.s;
                m3Var2.d = 4000L;
                m3Var2.o(1.0f, -21.0f);
                this.s.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                this.s.l(getBaseSimpleGlass().c);
                this.W.addView(this.s, c8.ha.d(-1, -2.0f, 51, 8.0f, 56.0f, 8.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.e = linearLayout;
                linearLayout.setOrientation(1);
                this.e.setGravity(1);
                this.e.setPadding(0, org.telegram.messenger.g0.L(160.0f), 0, 0);
                this.e.setVisibility(8);
                ra0Var.addView(this.e, c8.ha.c(-1.0f, -1));
                this.e.setOnTouchListener(new ei.b(2));
                ImageView imageView5 = new ImageView(context);
                this.f = imageView5;
                imageView5.setImageResource(R.drawable.location_empty);
                org.telegram.ui.ActionBar.t6.s(this.f, org.telegram.ui.ActionBar.m6.W5, getResourceProvider(), mode);
                this.e.addView(this.f, c8.ha.o(-2, -2));
                TextView textView3 = new TextView(context);
                this.h = textView3;
                int i18 = org.telegram.ui.ActionBar.m6.X5;
                org.telegram.ui.ActionBar.t6.U(textView3, i18, getResourceProvider());
                this.h.setGravity(17);
                this.h.setTypeface(org.telegram.messenger.g0.o());
                this.h.setTextSize(1, 17.0f);
                this.h.setText(org.telegram.messenger.id.M0(2131748179, null));
                TextView f10 = org.telegram.messenger.camera.q.f(this.e, this.h, c8.ha.t(-2, -2, 17, 0, 11, 0, 0), context);
                this.n = f10;
                org.telegram.ui.ActionBar.t6.U(f10, i18, getResourceProvider());
                this.n.setGravity(17);
                this.n.setTextSize(1, 15.0f);
                this.n.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
                this.e.addView(this.n, c8.ha.t(-2, -2, 17, 0, 6, 0, 0));
                this.Q = new ct(5, context, this);
                fh.g c11 = getBaseSimpleGlass().f.c(this.Q, null, false);
                gh.e eVar = new gh.e(getResourceProvider());
                eVar.e = new g2.c(14);
                eVar.f(-1, 553648127);
                eVar.e(0, 0);
                eVar.d(372454195, 0);
                float N = org.telegram.messenger.g0.N(8.0f);
                float f11 = -org.telegram.messenger.g0.N(0.6666667f);
                eVar.n = N;
                eVar.r = f11;
                eVar.f = org.telegram.messenger.g0.N(0.55f);
                eVar.h = 0.0f;
                c11.p(eVar);
                c11.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
                c11.q(org.telegram.messenger.g0.L(12.0f));
                this.Y = c11;
                ct ctVar = this.Q;
                ka0 ka0Var2 = new ka0(this, context, this.H0, this.l0, getResourceProvider(), this.w, i13 != 8);
                this.P = ka0Var2;
                ctVar.setAdapter(ka0Var2);
                ct ctVar2 = this.Q;
                v4.b0 b0Var = new v4.b0(1, false);
                this.U = b0Var;
                ctVar2.setLayoutManager(b0Var);
                if (this.N0 != null) {
                    this.M0 = new org.telegram.ui.Cells.x3(context, this.resourceProvider);
                    ma0 ma0Var = new ma0(this, context, new org.telegram.ui.Components.qs0(this), this, new la0(this), getResourceProvider());
                    this.L0 = ma0Var;
                    org.telegram.ui.ActionBar.t6.h(i14, ma0Var, getResourceProvider());
                    this.L0.addView(this.M0, c8.ha.e(-1, 32, 55));
                    this.P.Y = this.L0;
                    this.Q.setOverScrollMode(2);
                    v4.k kVar = new v4.k();
                    kVar.m = false;
                    kVar.C = false;
                    kVar.o(org.telegram.ui.Components.wq.h);
                    kVar.n(350L);
                    this.Q.setItemAnimator(kVar);
                }
                this.P.O(this.j0, false);
                this.P.getClass();
                this.Q.setVerticalScrollBarEnabled(false);
                ra0Var.addView(this.Q, c8.ha.e(-1, -1, 51));
                ijVar = this.D0;
                if (ijVar != null && (message = ijVar.k) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
                    ka0 ka0Var3 = this.P;
                    ka0Var3.H = this.D0.k.media.address;
                    ka0Var3.Q();
                }
                this.Q.setOnScrollListener(new ia0(this, i12));
                ((v4.k) this.Q.getItemAnimator()).C = false;
                this.Q.setOnItemLongClickListener(new su(15, this, context));
                this.Q.setOnItemClickListener(new org.telegram.ui.Components.bj0(this) { // from class: org.telegram.ui.ca0
                    public final /* synthetic */ sa0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.bj0
                    public final void c(int i19, View view) {
                        org.telegram.messenger.ij ijVar7;
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                        int i20 = i11;
                        sa0 sa0Var = this.b;
                        switch (i20) {
                            case 0:
                                sa0Var.p0 = -1L;
                                int i21 = sa0Var.H0;
                                int i22 = 7;
                                if (i21 != 4) {
                                    if (i21 != 5) {
                                        if (i19 == 1 && (ijVar7 = sa0Var.D0) != null && (!ijVar7.C3() || i21 == 6)) {
                                            org.telegram.messenger.fa faVar = sa0Var.E;
                                            if (faVar != null) {
                                                IMapsProvider k10 = org.telegram.messenger.t0.k();
                                                TLRPC.GeoPoint geoPoint = sa0Var.D0.k.media.geo;
                                                faVar.b(((nb.a) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint.lat, geoPoint._long), sa0Var.E.e() - 4.0f));
                                                break;
                                            }
                                        } else if (i19 == 1 && i21 != 2) {
                                            if (sa0Var.G0 != null && sa0Var.z0 != null) {
                                                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                                tL_messageMediaGeo.geo = tL_geoPoint;
                                                tL_geoPoint.lat = org.telegram.messenger.g0.b0(sa0Var.z0.getLatitude());
                                                tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(sa0Var.z0.getLongitude());
                                                sa0Var.G0.d(tL_messageMediaGeo, sa0Var.H0, true, 0, 0L);
                                                sa0Var.finishFragment();
                                                break;
                                            }
                                        } else if (i21 != 2 || !sa0Var.getLocationController().i(sa0Var.l0) || sa0Var.P.d(i19) != 7) {
                                            if (i21 != 2 || !sa0Var.getLocationController().i(sa0Var.l0) || sa0Var.P.d(i19) != 6) {
                                                if ((i19 != 2 || i21 != 1) && ((i19 != 1 || i21 != 2) && (i19 != 3 || i21 != 3))) {
                                                    Object I = sa0Var.P.I(i19);
                                                    if (!(I instanceof TLRPC.TL_messageMediaVenue)) {
                                                        if (I instanceof oa0) {
                                                            oa0 oa0Var = (oa0) I;
                                                            sa0Var.p0 = oa0Var.a;
                                                            if (sa0Var.q0) {
                                                                sa0Var.q0 = false;
                                                                sa0Var.N0();
                                                            }
                                                            sa0Var.E.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(oa0Var.e.a(), sa0Var.E.e() - 4.0f));
                                                            break;
                                                        }
                                                    } else {
                                                        sa0Var.G0.d((TLRPC.TL_messageMediaVenue) I, sa0Var.H0, true, 0, 0L);
                                                        sa0Var.finishFragment();
                                                        break;
                                                    }
                                                } else if (!sa0Var.getLocationController().i(sa0Var.l0)) {
                                                    sa0Var.C0(false);
                                                    break;
                                                } else {
                                                    sa0Var.getLocationController().k(sa0Var.l0);
                                                    sa0Var.P.f();
                                                    sa0Var.finishFragment();
                                                    break;
                                                }
                                            } else {
                                                sa0Var.C0(sa0Var.getLocationController().h(sa0Var.l0).d != Integer.MAX_VALUE);
                                                break;
                                            }
                                        } else {
                                            sa0Var.getLocationController().k(sa0Var.l0);
                                            sa0Var.P.f();
                                            sa0Var.finishFragment();
                                            break;
                                        }
                                    } else {
                                        org.telegram.messenger.fa faVar2 = sa0Var.E;
                                        if (faVar2 != null) {
                                            IMapsProvider k11 = org.telegram.messenger.t0.k();
                                            TLRPC.GeoPoint geoPoint2 = sa0Var.B0.geo_point;
                                            faVar2.b(((nb.a) k11).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint2.lat, geoPoint2._long), sa0Var.E.e() - 4.0f));
                                            break;
                                        }
                                    }
                                } else if (i19 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) sa0Var.P.I(i19)) != null) {
                                    if (sa0Var.l0 != 0) {
                                        org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, sa0Var.getParentActivity(), null)};
                                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                        tL_channels_editLocation.channel = sa0Var.getMessagesController().h1(-sa0Var.l0);
                                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                        TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                        tL_inputGeoPoint.lat = geoPoint3.lat;
                                        tL_inputGeoPoint._long = geoPoint3._long;
                                        u1VarArr[0].setOnCancelListener(new bi.g0(sa0Var, sa0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new z9(sa0Var, u1VarArr, tL_messageMediaVenue, 19)), i22));
                                        sa0Var.showDialog(u1VarArr[0]);
                                        break;
                                    } else {
                                        sa0Var.G0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                                        sa0Var.finishFragment();
                                        break;
                                    }
                                }
                                break;
                            default:
                                sa0.e0(sa0Var, i19);
                                break;
                        }
                    }
                });
                this.P.P(this.I0);
                ra0Var.addView(this.O, ra0Var.indexOfChild(this.Q), c8.ha.e(-1, -1, 51));
                org.telegram.messenger.za onCreateMapView = ((nb.a) org.telegram.messenger.t0.k()).onCreateMapView(context);
                this.G = onCreateMapView;
                ((bi.x5) ((a8.r7) onCreateMapView).b).setAlpha(0.0f);
                org.telegram.messenger.za zaVar = this.G;
                a8.r7 r7Var = (a8.r7) zaVar;
                r7Var.c = new da0(this, i11);
                r7Var.d = new da0(this, i12);
                r7Var.e = new aa0(this, 7);
                new Thread(new ea0(this, zaVar, i12)).start();
                ijVar2 = this.D0;
                if (ijVar2 != null && this.B0 == null) {
                    if (chat != null && i13 == 4 && this.l0 != 0) {
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        frameLayout2.setBackgroundResource(R.drawable.livepin);
                        this.O.addView(frameLayout2, c8.ha.e(62, 76, 49));
                        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
                        k9Var.setRoundRadius(org.telegram.messenger.g0.L(26.0f));
                        TLRPC.Chat chat2 = chat;
                        k9Var.e(chat2, new org.telegram.ui.Components.v8(chat2));
                        frameLayout2.addView(k9Var, c8.ha.d(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                        this.T = frameLayout2;
                        frameLayout2.setTag(1);
                    }
                    if (this.T == null) {
                        ImageView e11 = org.telegram.messenger.camera.q.e(context, R.drawable.map_pin2);
                        this.O.addView(e11, c8.ha.e(28, 48, 49));
                        this.T = e11;
                    }
                    org.telegram.ui.Components.pj0 pj0Var2 = new org.telegram.ui.Components.pj0(context, null);
                    this.R = pj0Var2;
                    pj0Var2.setVisibility(8);
                    this.R.setLayoutManager(new v4.b0(1, false));
                    org.telegram.ui.Components.tk tkVar2 = new org.telegram.ui.Components.tk(this, context, getResourceProvider(), i13 == 8);
                    this.S = tkVar2;
                    tkVar2.n = new da0(this, 6);
                    ra0Var.addView(this.R, c8.ha.e(-1, -1, 51));
                    this.R.setOnScrollListener(new ia0(this, i11));
                    this.R.setOnItemClickListener(new org.telegram.ui.Components.bj0(this) { // from class: org.telegram.ui.ca0
                        public final /* synthetic */ sa0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.Components.bj0
                        public final void c(int i19, View view) {
                            org.telegram.messenger.ij ijVar7;
                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                            int i20 = i12;
                            sa0 sa0Var = this.b;
                            switch (i20) {
                                case 0:
                                    sa0Var.p0 = -1L;
                                    int i21 = sa0Var.H0;
                                    int i22 = 7;
                                    if (i21 != 4) {
                                        if (i21 != 5) {
                                            if (i19 == 1 && (ijVar7 = sa0Var.D0) != null && (!ijVar7.C3() || i21 == 6)) {
                                                org.telegram.messenger.fa faVar = sa0Var.E;
                                                if (faVar != null) {
                                                    IMapsProvider k10 = org.telegram.messenger.t0.k();
                                                    TLRPC.GeoPoint geoPoint = sa0Var.D0.k.media.geo;
                                                    faVar.b(((nb.a) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint.lat, geoPoint._long), sa0Var.E.e() - 4.0f));
                                                    break;
                                                }
                                            } else if (i19 == 1 && i21 != 2) {
                                                if (sa0Var.G0 != null && sa0Var.z0 != null) {
                                                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                                    TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                                    tL_messageMediaGeo.geo = tL_geoPoint;
                                                    tL_geoPoint.lat = org.telegram.messenger.g0.b0(sa0Var.z0.getLatitude());
                                                    tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(sa0Var.z0.getLongitude());
                                                    sa0Var.G0.d(tL_messageMediaGeo, sa0Var.H0, true, 0, 0L);
                                                    sa0Var.finishFragment();
                                                    break;
                                                }
                                            } else if (i21 != 2 || !sa0Var.getLocationController().i(sa0Var.l0) || sa0Var.P.d(i19) != 7) {
                                                if (i21 != 2 || !sa0Var.getLocationController().i(sa0Var.l0) || sa0Var.P.d(i19) != 6) {
                                                    if ((i19 != 2 || i21 != 1) && ((i19 != 1 || i21 != 2) && (i19 != 3 || i21 != 3))) {
                                                        Object I = sa0Var.P.I(i19);
                                                        if (!(I instanceof TLRPC.TL_messageMediaVenue)) {
                                                            if (I instanceof oa0) {
                                                                oa0 oa0Var = (oa0) I;
                                                                sa0Var.p0 = oa0Var.a;
                                                                if (sa0Var.q0) {
                                                                    sa0Var.q0 = false;
                                                                    sa0Var.N0();
                                                                }
                                                                sa0Var.E.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(oa0Var.e.a(), sa0Var.E.e() - 4.0f));
                                                                break;
                                                            }
                                                        } else {
                                                            sa0Var.G0.d((TLRPC.TL_messageMediaVenue) I, sa0Var.H0, true, 0, 0L);
                                                            sa0Var.finishFragment();
                                                            break;
                                                        }
                                                    } else if (!sa0Var.getLocationController().i(sa0Var.l0)) {
                                                        sa0Var.C0(false);
                                                        break;
                                                    } else {
                                                        sa0Var.getLocationController().k(sa0Var.l0);
                                                        sa0Var.P.f();
                                                        sa0Var.finishFragment();
                                                        break;
                                                    }
                                                } else {
                                                    sa0Var.C0(sa0Var.getLocationController().h(sa0Var.l0).d != Integer.MAX_VALUE);
                                                    break;
                                                }
                                            } else {
                                                sa0Var.getLocationController().k(sa0Var.l0);
                                                sa0Var.P.f();
                                                sa0Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            org.telegram.messenger.fa faVar2 = sa0Var.E;
                                            if (faVar2 != null) {
                                                IMapsProvider k11 = org.telegram.messenger.t0.k();
                                                TLRPC.GeoPoint geoPoint2 = sa0Var.B0.geo_point;
                                                faVar2.b(((nb.a) k11).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint2.lat, geoPoint2._long), sa0Var.E.e() - 4.0f));
                                                break;
                                            }
                                        }
                                    } else if (i19 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) sa0Var.P.I(i19)) != null) {
                                        if (sa0Var.l0 != 0) {
                                            org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, sa0Var.getParentActivity(), null)};
                                            TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                            tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                            tL_channels_editLocation.channel = sa0Var.getMessagesController().h1(-sa0Var.l0);
                                            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                            tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                            TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                            tL_inputGeoPoint.lat = geoPoint3.lat;
                                            tL_inputGeoPoint._long = geoPoint3._long;
                                            u1VarArr[0].setOnCancelListener(new bi.g0(sa0Var, sa0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new z9(sa0Var, u1VarArr, tL_messageMediaVenue, 19)), i22));
                                            sa0Var.showDialog(u1VarArr[0]);
                                            break;
                                        } else {
                                            sa0Var.G0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                                            sa0Var.finishFragment();
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    sa0.e0(sa0Var, i19);
                                    break;
                            }
                        }
                    });
                } else if ((ijVar2 != null && !ijVar2.C3()) || this.B0 != null) {
                    tL_channelLocation = this.B0;
                    if (tL_channelLocation != null) {
                        this.P.O = tL_channelLocation;
                    } else {
                        org.telegram.messenger.ij ijVar7 = this.D0;
                        if (ijVar7 != null) {
                            ka0 ka0Var4 = this.P;
                            ka0Var4.N = ijVar7;
                            ka0Var4.f();
                        }
                    }
                }
                ijVar3 = this.D0;
                if (ijVar3 != null && i13 == 6) {
                    ka0 ka0Var5 = this.P;
                    ka0Var5.N = ijVar3;
                    ka0Var5.f();
                }
                for (i10 = 0; i10 < 2; i10++) {
                    UndoView undoView = new UndoView(context);
                    UndoView[] undoViewArr = this.x;
                    undoViewArr[i10] = undoView;
                    undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
                    undoViewArr[i10].setTranslationZ(org.telegram.messenger.g0.L(5.0f));
                    FrameLayout.LayoutParams d = c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                    d.bottomMargin = org.telegram.messenger.g0.L(29.0f) + this.g0 + d.bottomMargin;
                    this.O.addView(undoViewArr[i10], d);
                }
                if (this.D0 == null && this.B0 == null && this.C0 != null) {
                    this.E0 = true;
                    ImageView imageView6 = this.a;
                    int i19 = org.telegram.ui.ActionBar.m6.ij;
                    org.telegram.ui.ActionBar.t6.s(imageView6, i19, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                    this.a.setTag(Integer.valueOf(i19));
                }
                baseSimpleGlass = getBaseSimpleGlass();
                View view = new View(context);
                this.navigationBarFadeView = view;
                view.setBackground(baseSimpleGlass.b(view));
                ra0Var.addView(this.navigationBarFadeView, c8.ha.e(-1, 0, 80));
                View view2 = this.simpleActionBar;
                org.telegram.ui.ActionBar.h6 resourceProvider2 = getResourceProvider();
                baseSimpleGlass.m = ra0Var;
                baseSimpleGlass.n = null;
                baseSimpleGlass.g(ra0Var, view2, resourceProvider2);
                baseSimpleGlass.o = new oa(this, i12);
                this.simpleActionBar.setBackground(null);
                this.glassEngine.b(this.Q);
                pj0Var = this.R;
                if (pj0Var != null) {
                    this.glassEngine.b(pj0Var);
                }
                if (baseSimpleGlass.g != null && org.telegram.messenger.iz.f()) {
                    this.d0 = new org.telegram.ui.Components.g80(new aa0(this, 2));
                }
                j0();
                L0();
                return this.fragmentView;
            }
        }
        chat = M0;
        this.c.setVisibility(8);
        this.c.setImageResource(R.drawable.msg_location_alert);
        fi.m3 m3Var3 = new fi.m3(context, 1);
        this.s = m3Var3;
        m3Var3.setLayerType(2, null);
        fi.m3 m3Var22 = this.s;
        m3Var22.d = 4000L;
        m3Var22.o(1.0f, -21.0f);
        this.s.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        this.s.l(getBaseSimpleGlass().c);
        this.W.addView(this.s, c8.ha.d(-1, -2.0f, 51, 8.0f, 56.0f, 8.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.e.setGravity(1);
        this.e.setPadding(0, org.telegram.messenger.g0.L(160.0f), 0, 0);
        this.e.setVisibility(8);
        ra0Var.addView(this.e, c8.ha.c(-1.0f, -1));
        this.e.setOnTouchListener(new ei.b(2));
        ImageView imageView52 = new ImageView(context);
        this.f = imageView52;
        imageView52.setImageResource(R.drawable.location_empty);
        org.telegram.ui.ActionBar.t6.s(this.f, org.telegram.ui.ActionBar.m6.W5, getResourceProvider(), mode);
        this.e.addView(this.f, c8.ha.o(-2, -2));
        TextView textView32 = new TextView(context);
        this.h = textView32;
        int i182 = org.telegram.ui.ActionBar.m6.X5;
        org.telegram.ui.ActionBar.t6.U(textView32, i182, getResourceProvider());
        this.h.setGravity(17);
        this.h.setTypeface(org.telegram.messenger.g0.o());
        this.h.setTextSize(1, 17.0f);
        this.h.setText(org.telegram.messenger.id.M0(2131748179, null));
        TextView f102 = org.telegram.messenger.camera.q.f(this.e, this.h, c8.ha.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.n = f102;
        org.telegram.ui.ActionBar.t6.U(f102, i182, getResourceProvider());
        this.n.setGravity(17);
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        this.e.addView(this.n, c8.ha.t(-2, -2, 17, 0, 6, 0, 0));
        this.Q = new ct(5, context, this);
        fh.g c112 = getBaseSimpleGlass().f.c(this.Q, null, false);
        gh.e eVar2 = new gh.e(getResourceProvider());
        eVar2.e = new g2.c(14);
        eVar2.f(-1, 553648127);
        eVar2.e(0, 0);
        eVar2.d(372454195, 0);
        float N2 = org.telegram.messenger.g0.N(8.0f);
        float f112 = -org.telegram.messenger.g0.N(0.6666667f);
        eVar2.n = N2;
        eVar2.r = f112;
        eVar2.f = org.telegram.messenger.g0.N(0.55f);
        eVar2.h = 0.0f;
        c112.p(eVar2);
        c112.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        c112.q(org.telegram.messenger.g0.L(12.0f));
        this.Y = c112;
        ct ctVar3 = this.Q;
        ka0 ka0Var22 = new ka0(this, context, this.H0, this.l0, getResourceProvider(), this.w, i13 != 8);
        this.P = ka0Var22;
        ctVar3.setAdapter(ka0Var22);
        ct ctVar22 = this.Q;
        v4.b0 b0Var2 = new v4.b0(1, false);
        this.U = b0Var2;
        ctVar22.setLayoutManager(b0Var2);
        if (this.N0 != null) {
        }
        this.P.O(this.j0, false);
        this.P.getClass();
        this.Q.setVerticalScrollBarEnabled(false);
        ra0Var.addView(this.Q, c8.ha.e(-1, -1, 51));
        ijVar = this.D0;
        if (ijVar != null) {
            ka0 ka0Var32 = this.P;
            ka0Var32.H = this.D0.k.media.address;
            ka0Var32.Q();
        }
        this.Q.setOnScrollListener(new ia0(this, i12));
        ((v4.k) this.Q.getItemAnimator()).C = false;
        this.Q.setOnItemLongClickListener(new su(15, this, context));
        this.Q.setOnItemClickListener(new org.telegram.ui.Components.bj0(this) { // from class: org.telegram.ui.ca0
            public final /* synthetic */ sa0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.bj0
            public final void c(int i192, View view3) {
                org.telegram.messenger.ij ijVar72;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                int i20 = i11;
                sa0 sa0Var = this.b;
                switch (i20) {
                    case 0:
                        sa0Var.p0 = -1L;
                        int i21 = sa0Var.H0;
                        int i22 = 7;
                        if (i21 != 4) {
                            if (i21 != 5) {
                                if (i192 == 1 && (ijVar72 = sa0Var.D0) != null && (!ijVar72.C3() || i21 == 6)) {
                                    org.telegram.messenger.fa faVar = sa0Var.E;
                                    if (faVar != null) {
                                        IMapsProvider k10 = org.telegram.messenger.t0.k();
                                        TLRPC.GeoPoint geoPoint = sa0Var.D0.k.media.geo;
                                        faVar.b(((nb.a) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint.lat, geoPoint._long), sa0Var.E.e() - 4.0f));
                                        break;
                                    }
                                } else if (i192 == 1 && i21 != 2) {
                                    if (sa0Var.G0 != null && sa0Var.z0 != null) {
                                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                        tL_messageMediaGeo.geo = tL_geoPoint;
                                        tL_geoPoint.lat = org.telegram.messenger.g0.b0(sa0Var.z0.getLatitude());
                                        tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(sa0Var.z0.getLongitude());
                                        sa0Var.G0.d(tL_messageMediaGeo, sa0Var.H0, true, 0, 0L);
                                        sa0Var.finishFragment();
                                        break;
                                    }
                                } else if (i21 != 2 || !sa0Var.getLocationController().i(sa0Var.l0) || sa0Var.P.d(i192) != 7) {
                                    if (i21 != 2 || !sa0Var.getLocationController().i(sa0Var.l0) || sa0Var.P.d(i192) != 6) {
                                        if ((i192 != 2 || i21 != 1) && ((i192 != 1 || i21 != 2) && (i192 != 3 || i21 != 3))) {
                                            Object I = sa0Var.P.I(i192);
                                            if (!(I instanceof TLRPC.TL_messageMediaVenue)) {
                                                if (I instanceof oa0) {
                                                    oa0 oa0Var = (oa0) I;
                                                    sa0Var.p0 = oa0Var.a;
                                                    if (sa0Var.q0) {
                                                        sa0Var.q0 = false;
                                                        sa0Var.N0();
                                                    }
                                                    sa0Var.E.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(oa0Var.e.a(), sa0Var.E.e() - 4.0f));
                                                    break;
                                                }
                                            } else {
                                                sa0Var.G0.d((TLRPC.TL_messageMediaVenue) I, sa0Var.H0, true, 0, 0L);
                                                sa0Var.finishFragment();
                                                break;
                                            }
                                        } else if (!sa0Var.getLocationController().i(sa0Var.l0)) {
                                            sa0Var.C0(false);
                                            break;
                                        } else {
                                            sa0Var.getLocationController().k(sa0Var.l0);
                                            sa0Var.P.f();
                                            sa0Var.finishFragment();
                                            break;
                                        }
                                    } else {
                                        sa0Var.C0(sa0Var.getLocationController().h(sa0Var.l0).d != Integer.MAX_VALUE);
                                        break;
                                    }
                                } else {
                                    sa0Var.getLocationController().k(sa0Var.l0);
                                    sa0Var.P.f();
                                    sa0Var.finishFragment();
                                    break;
                                }
                            } else {
                                org.telegram.messenger.fa faVar2 = sa0Var.E;
                                if (faVar2 != null) {
                                    IMapsProvider k11 = org.telegram.messenger.t0.k();
                                    TLRPC.GeoPoint geoPoint2 = sa0Var.B0.geo_point;
                                    faVar2.b(((nb.a) k11).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint2.lat, geoPoint2._long), sa0Var.E.e() - 4.0f));
                                    break;
                                }
                            }
                        } else if (i192 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) sa0Var.P.I(i192)) != null) {
                            if (sa0Var.l0 != 0) {
                                org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, sa0Var.getParentActivity(), null)};
                                TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                tL_channels_editLocation.channel = sa0Var.getMessagesController().h1(-sa0Var.l0);
                                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                tL_inputGeoPoint.lat = geoPoint3.lat;
                                tL_inputGeoPoint._long = geoPoint3._long;
                                u1VarArr[0].setOnCancelListener(new bi.g0(sa0Var, sa0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new z9(sa0Var, u1VarArr, tL_messageMediaVenue, 19)), i22));
                                sa0Var.showDialog(u1VarArr[0]);
                                break;
                            } else {
                                sa0Var.G0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                                sa0Var.finishFragment();
                                break;
                            }
                        }
                        break;
                    default:
                        sa0.e0(sa0Var, i192);
                        break;
                }
            }
        });
        this.P.P(this.I0);
        ra0Var.addView(this.O, ra0Var.indexOfChild(this.Q), c8.ha.e(-1, -1, 51));
        org.telegram.messenger.za onCreateMapView2 = ((nb.a) org.telegram.messenger.t0.k()).onCreateMapView(context);
        this.G = onCreateMapView2;
        ((bi.x5) ((a8.r7) onCreateMapView2).b).setAlpha(0.0f);
        org.telegram.messenger.za zaVar2 = this.G;
        a8.r7 r7Var2 = (a8.r7) zaVar2;
        r7Var2.c = new da0(this, i11);
        r7Var2.d = new da0(this, i12);
        r7Var2.e = new aa0(this, 7);
        new Thread(new ea0(this, zaVar2, i12)).start();
        ijVar2 = this.D0;
        if (ijVar2 != null) {
        }
        if (ijVar2 != null) {
            tL_channelLocation = this.B0;
            if (tL_channelLocation != null) {
            }
            ijVar3 = this.D0;
            if (ijVar3 != null) {
                ka0 ka0Var52 = this.P;
                ka0Var52.N = ijVar3;
                ka0Var52.f();
            }
            while (i10 < 2) {
            }
            if (this.D0 == null) {
                this.E0 = true;
                ImageView imageView62 = this.a;
                int i192 = org.telegram.ui.ActionBar.m6.ij;
                org.telegram.ui.ActionBar.t6.s(imageView62, i192, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                this.a.setTag(Integer.valueOf(i192));
            }
            baseSimpleGlass = getBaseSimpleGlass();
            View view3 = new View(context);
            this.navigationBarFadeView = view3;
            view3.setBackground(baseSimpleGlass.b(view3));
            ra0Var.addView(this.navigationBarFadeView, c8.ha.e(-1, 0, 80));
            View view22 = this.simpleActionBar;
            org.telegram.ui.ActionBar.h6 resourceProvider22 = getResourceProvider();
            baseSimpleGlass.m = ra0Var;
            baseSimpleGlass.n = null;
            baseSimpleGlass.g(ra0Var, view22, resourceProvider22);
            baseSimpleGlass.o = new oa(this, i12);
            this.simpleActionBar.setBackground(null);
            this.glassEngine.b(this.Q);
            pj0Var = this.R;
            if (pj0Var != null) {
            }
            if (baseSimpleGlass.g != null) {
                this.d0 = new org.telegram.ui.Components.g80(new aa0(this, 2));
            }
            j0();
            L0();
            return this.fragmentView;
        }
        tL_channelLocation = this.B0;
        if (tL_channelLocation != null) {
        }
        ijVar3 = this.D0;
        if (ijVar3 != null) {
        }
        while (i10 < 2) {
        }
        if (this.D0 == null) {
        }
        baseSimpleGlass = getBaseSimpleGlass();
        View view32 = new View(context);
        this.navigationBarFadeView = view32;
        view32.setBackground(baseSimpleGlass.b(view32));
        ra0Var.addView(this.navigationBarFadeView, c8.ha.e(-1, 0, 80));
        View view222 = this.simpleActionBar;
        org.telegram.ui.ActionBar.h6 resourceProvider222 = getResourceProvider();
        baseSimpleGlass.m = ra0Var;
        baseSimpleGlass.n = null;
        baseSimpleGlass.g(ra0Var, view222, resourceProvider222);
        baseSimpleGlass.o = new oa(this, i12);
        this.simpleActionBar.setBackground(null);
        this.glassEngine.b(this.Q);
        pj0Var = this.R;
        if (pj0Var != null) {
        }
        if (baseSimpleGlass.g != null) {
        }
        j0();
        L0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ka0 ka0Var;
        ka0 ka0Var2;
        if (i7 == org.telegram.messenger.qs.t) {
            removeSelfFromStack(true);
            return;
        }
        if (i7 == org.telegram.messenger.qs.v4) {
            this.j0 = false;
            ka0 ka0Var3 = this.P;
            if (ka0Var3 != null) {
                ka0Var3.O(false, false);
            }
            org.telegram.messenger.fa faVar = this.E;
            if (faVar != null) {
                try {
                    faVar.k(true);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.w4) {
            this.j0 = true;
            ka0 ka0Var4 = this.P;
            if (ka0Var4 != null) {
                ka0Var4.O(true, false);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.D4) {
            ka0 ka0Var5 = this.P;
            if (ka0Var5 != null) {
                ka0Var5.f();
            }
            N0();
            return;
        }
        if (i7 == 1) {
            if (((Boolean) objArr[2]).booleanValue() || ((Long) objArr[0]).longValue() != this.l0 || this.D0 == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[1];
            boolean z9 = false;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i11);
                if (ijVar.C3()) {
                    i0(ijVar.k);
                    z9 = true;
                } else {
                    TLRPC.Message message = ijVar.k;
                    if ((message.action instanceof TLRPC.TL_messageActionGeoProximityReached) && org.telegram.messenger.m5.E(org.telegram.messenger.ij.B0(message))) {
                        this.c.setImageResource(R.drawable.msg_location_alert);
                        m4.d0 d0Var = this.K;
                        if (d0Var != null) {
                            d0Var.R0();
                            this.K = null;
                        }
                    }
                }
            }
            if (!z9 || (ka0Var2 = this.P) == null) {
                return;
            }
            ka0Var2.N(this.n0);
            return;
        }
        if (i7 == org.telegram.messenger.qs.m0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue != this.l0 || this.D0 == null) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) objArr[1];
            boolean z10 = false;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList2.get(i12);
                if (ijVar2.C3()) {
                    TLRPC.Message message2 = ijVar2.k;
                    TLRPC.Peer peer = message2.from_id;
                    oa0 oa0Var = (oa0) this.o0.f(peer != null ? org.telegram.messenger.ij.B1(peer) : org.telegram.messenger.ij.B0(message2));
                    if (oa0Var != null) {
                        org.telegram.messenger.rd h = getLocationController().h(longValue);
                        if (h == null || h.b != ijVar2.e1()) {
                            TLRPC.Message message3 = ijVar2.k;
                            oa0Var.b = message3;
                            TLRPC.GeoPoint geoPoint = message3.media.geo;
                            org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(geoPoint.lat, geoPoint._long);
                            oa0Var.e.b(cbVar);
                            if (this.p0 == oa0Var.a) {
                                this.E.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(oa0Var.e.a()));
                            }
                            org.telegram.messenger.ea eaVar = oa0Var.f;
                            if (eaVar != null) {
                                eaVar.a();
                                oa0Var.f.b(cbVar);
                                int i13 = ijVar2.k.media.heading;
                                if (i13 != 0) {
                                    oa0Var.f.c(i13);
                                    if (!oa0Var.g) {
                                        oa0Var.f.a.a(c8.q9.b(R.drawable.map_pin_cone2));
                                        oa0Var.g = true;
                                    }
                                } else if (oa0Var.g) {
                                    oa0Var.f.c(0);
                                    oa0Var.f.a.a(c8.q9.b(R.drawable.map_pin_circle));
                                    oa0Var.g = false;
                                }
                            }
                        }
                        z10 = true;
                    }
                }
            }
            if (z10 && (ka0Var = this.P) != null) {
                ka0Var.f();
                org.telegram.ui.Components.hg0 hg0Var = this.N;
                if (hg0Var != null) {
                    hg0Var.c(true);
                }
            }
            if (z10) {
                N0();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean finishFragment(boolean z9) {
        if (A0()) {
            return false;
        }
        return super.finishFragment(z9);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            UndoView[] undoViewArr = this.x;
            if (i7 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.v6(undoViewArr[i7], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.tj));
            i7++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Q, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.h5));
        org.telegram.ui.ActionBar.g5 g5Var = this.r;
        arrayList.add(new org.telegram.ui.ActionBar.v6(g5Var != null ? g5Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Q, 393216, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Q, 393216, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Q, 393248, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Q, 393248, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Q, 196608, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ei));
        return arrayList;
    }

    public final oa0 i0(TLRPC.Message message) {
        Location location;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        double d = geoPoint.lat;
        double d2 = geoPoint._long;
        long B1 = org.telegram.messenger.ij.B1(message.from_id);
        a0.h hVar = this.o0;
        oa0 oa0Var = (oa0) hVar.f(B1);
        if (oa0Var == null) {
            oa0Var = new oa0();
            oa0Var.b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                oa0Var.c = getMessagesController().a2(Long.valueOf(oa0Var.b.from_id.user_id));
                oa0Var.a = oa0Var.b.from_id.user_id;
            } else {
                long B0 = org.telegram.messenger.ij.B0(message);
                if (org.telegram.messenger.m5.E(B0)) {
                    oa0Var.c = getMessagesController().a2(Long.valueOf(B0));
                } else {
                    oa0Var.d = getMessagesController().M0(Long.valueOf(-B0));
                }
                oa0Var.a = B0;
            }
            H0(oa0Var);
            try {
                gf.g gVar = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                m8.g gVar2 = (m8.g) gVar.b;
                m8.g gVar3 = (m8.g) gVar.b;
                gVar2.a = new LatLng(d, d2);
                Bitmap n02 = n0(oa0Var);
                if (n02 != null) {
                    gVar3.d = c8.q9.a(n02);
                    gVar3.e = 0.5f;
                    gVar3.f = 0.907f;
                    oa0Var.e = this.E.a(gVar);
                    if (!org.telegram.messenger.t10.B(oa0Var.c)) {
                        gf.g gVar4 = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                        ((m8.g) gVar4.b).a = new LatLng(d, d2);
                        m8.g gVar5 = (m8.g) gVar4.b;
                        gVar5.r = true;
                        gVar5.e = 0.5f;
                        gVar5.f = 0.5f;
                        org.telegram.messenger.ea a10 = this.E.a(gVar4);
                        oa0Var.f = a10;
                        int i7 = message.media.heading;
                        if (i7 != 0) {
                            a10.c(i7);
                            oa0Var.f.a.a(c8.q9.b(R.drawable.map_pin_cone2));
                            oa0Var.g = true;
                        } else {
                            a10.c(0);
                            oa0Var.f.a.a(c8.q9.b(R.drawable.map_pin_circle));
                            oa0Var.g = false;
                        }
                    }
                    this.n0.add(oa0Var);
                    hVar.k(oa0Var, oa0Var.a);
                    org.telegram.messenger.rd h = getLocationController().h(this.l0);
                    if (oa0Var.a == getUserConfig().e() && h != null && oa0Var.b.id == h.b && (location = this.y0) != null) {
                        double latitude = location.getLatitude();
                        double longitude = this.y0.getLongitude();
                        m8.f fVar = oa0Var.e.a;
                        LatLng latLng = new LatLng(latitude, longitude);
                        fVar.getClass();
                        try {
                            v7.i iVar = (v7.i) fVar.a;
                            Parcel p12 = iVar.p1();
                            v7.b.b(p12, latLng);
                            iVar.t1(p12, 3);
                        } catch (RemoteException e10) {
                            throw new androidx.car.app.j(e10);
                        }
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        } else {
            oa0Var.b = message;
            m8.f fVar2 = oa0Var.e.a;
            LatLng latLng2 = new LatLng(d, d2);
            fVar2.getClass();
            try {
                v7.i iVar2 = (v7.i) fVar2.a;
                Parcel p13 = iVar2.p1();
                v7.b.b(p13, latLng2);
                iVar2.t1(p13, 3);
                if (this.p0 == oa0Var.a) {
                    this.E.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(oa0Var.e.a()));
                }
            } catch (RemoteException e12) {
                throw new androidx.car.app.j(e12);
            }
        }
        org.telegram.ui.Components.hg0 hg0Var = this.N;
        if (hg0Var != null) {
            hg0Var.c(true);
        }
        N0();
        return oa0Var;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return i0.a.h(getThemedColor(org.telegram.ui.ActionBar.m6.d6)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0() {
        if (this.fragmentView == null || this.Q == null) {
            return;
        }
        i0.b bVar = this.mSystemInsets;
        int i7 = bVar.b;
        int i10 = bVar.d;
        FrameLayout frameLayout = this.W;
        if (frameLayout != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            int d = oi.a.d(i7) - org.telegram.messenger.g0.L(6.0f);
            if (layoutParams.topMargin != d) {
                layoutParams.topMargin = d;
                this.W.requestLayout();
            }
        }
        this.Q.setClipToPadding(false);
        this.Q.setPadding(0, 0, 0, i10);
        org.telegram.ui.Components.pj0 pj0Var = this.R;
        if (pj0Var != null) {
            pj0Var.setClipToPadding(false);
            oi.a.e(this.R, i7, i10, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 0);
        }
        if (this.fragmentView.getMeasuredHeight() > 0) {
            s0(false);
        }
    }

    public final void k0() {
        fh.g gVar = this.Y;
        if (gVar != null) {
            gVar.updateColors();
        }
        ct ctVar = this.Q;
        if (ctVar != null) {
            ctVar.invalidate();
        }
        if (this.E != null) {
            int i7 = org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.m6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
            if (i7 != 0) {
                if (!this.h0) {
                    this.h0 = true;
                    this.E.i(((nb.a) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.b, i7));
                    m4.d0 d0Var = this.K;
                    if (d0Var != null) {
                        d0Var.X0(-1);
                        this.K.U0(553648127);
                    }
                }
            } else if (this.h0) {
                this.h0 = false;
                this.E.i(null);
                m4.d0 d0Var2 = this.K;
                if (d0Var2 != null) {
                    d0Var2.X0(-16777216);
                    this.K.U0(TLObject.FLAG_29);
                }
            }
            D0();
        }
    }

    public final boolean l0() {
        if (o0()) {
            return false;
        }
        if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            try {
                if (!((LocationManager) org.telegram.messenger.t0.b.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i7 = org.telegram.ui.ActionBar.m6.L5;
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, getThemedColor(i7), null);
                    alertDialog$Builder.n(i7, getResourceProvider());
                    alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131749530, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751806, null), new da0(this, 3));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    showDialog(alertDialog$Builder.a);
                    return false;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return true;
            }
        }
        return true;
    }

    public final void m0(int i7) {
        v7.h fVar;
        if (this.E == null) {
            return;
        }
        boolean z9 = false;
        List<org.telegram.messenger.hb> asList = Arrays.asList(new org.telegram.messenger.gb(), new org.telegram.messenger.fb());
        org.telegram.messenger.va onCreateCircleOptions = ((nb.a) org.telegram.messenger.t0.k()).onCreateCircleOptions();
        double latitude = this.y0.getLatitude();
        double longitude = this.y0.getLongitude();
        h9.f1 f1Var = (h9.f1) onCreateCircleOptions;
        m8.b bVar = (m8.b) f1Var.b;
        LatLng latLng = new LatLng(latitude, longitude);
        bVar.getClass();
        bVar.a = latLng;
        double d = i7;
        m8.b bVar2 = (m8.b) f1Var.b;
        bVar2.b = d;
        if (x0()) {
            bVar2.d = -1771658281;
            bVar2.e = 476488663;
        } else {
            bVar2.d = -1774024971;
            bVar2.e = 474121973;
        }
        ArrayList arrayList = new ArrayList();
        for (org.telegram.messenger.hb hbVar : asList) {
            if (hbVar instanceof org.telegram.messenger.gb) {
                arrayList.add(new m8.c(20, 1));
            } else if (hbVar instanceof org.telegram.messenger.fb) {
                arrayList.add(new m8.c(20, 0));
            }
        }
        bVar2.r = arrayList;
        bVar2.c = 2;
        org.telegram.messenger.fa faVar = this.E;
        wf.b bVar3 = faVar.a;
        bVar3.getClass();
        try {
            l8.e eVar = (l8.e) bVar3.b;
            Parcel p12 = eVar.p1();
            v7.b.b(p12, bVar2);
            Parcel o12 = eVar.o1(p12, 35);
            IBinder readStrongBinder = o12.readStrongBinder();
            int i10 = v7.g.b;
            if (readStrongBinder == null) {
                fVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                fVar = queryLocalInterface instanceof v7.h ? (v7.h) queryLocalInterface : new v7.f(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", 11);
            }
            o12.recycle();
            m8.a aVar = new m8.a(fVar);
            m4.d0 d0Var = new m4.d0(faVar, aVar, z9);
            faVar.c.put(aVar, d0Var);
            this.K = d0Var;
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final Bitmap n0(oa0 oa0Var) {
        Bitmap bitmap = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(62.0f), org.telegram.messenger.g0.L(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = org.telegram.messenger.t0.b.getResources().getDrawable(R.drawable.map_pin_photo);
                drawable.setBounds(0, 0, org.telegram.messenger.g0.L(62.0f), org.telegram.messenger.g0.L(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
                TLRPC.User user = oa0Var.c;
                if (user != null) {
                    v8Var.r(user);
                } else {
                    TLRPC.Chat chat = oa0Var.d;
                    if (chat != null) {
                        v8Var.q(chat);
                    }
                }
                canvas.translate(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                v8Var.setBounds(0, 0, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
                v8Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = oa0Var.h;
                Bitmap n10 = (imageReceiver == null || !imageReceiver.J()) ? null : oa0Var.h.n();
                if (n10 != null && !n10.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(n10, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    float L = org.telegram.messenger.g0.L(50.0f) / n10.getWidth();
                    matrix.postTranslate(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                    matrix.postScale(L, L);
                    paint.setShader(bitmapShader);
                    bitmapShader.setLocalMatrix(matrix);
                    rectF.set(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(25.0f), paint);
                }
                canvas.restore();
                try {
                    canvas.setBitmap(null);
                    return createBitmap;
                } catch (Exception unused) {
                    return createBitmap;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmap = createBitmap;
                org.telegram.messenger.a8.g(th, true);
                return bitmap;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean o0() {
        return this instanceof km;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.Components.hg0 hg0Var = this.N;
        if (hg0Var == null) {
            org.telegram.messenger.za zaVar = this.G;
            if (zaVar == null || ((GLSurfaceView) ((a8.r7) zaVar).f) == null || this.I) {
                return super.onBackPressed(z9);
            }
            if (z9) {
                A0();
            }
        } else if (z9) {
            hg0Var.a();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.qs.t);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.v4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.w4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.D4);
        org.telegram.messenger.ij ijVar = this.D0;
        if (ijVar != null && ijVar.C3()) {
            getNotificationCenter().c(this, 1);
            getNotificationCenter().c(this, org.telegram.messenger.qs.m0);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.g80 g80Var = this.d0;
        if (g80Var != null) {
            g80Var.i = true;
            g80Var.g = false;
            g80Var.d();
            g80Var.d = null;
            g80Var.e = null;
            g80Var.f = null;
        }
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.v4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.w4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.D4);
        getNotificationCenter().n(this, org.telegram.messenger.qs.t);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.qs.m0);
        try {
            org.telegram.messenger.fa faVar = this.E;
            if (faVar != null) {
                faVar.k(false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.messenger.za zaVar = this.G;
            if (zaVar != null) {
                ((a8.r7) zaVar).w();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        ka0 ka0Var = this.P;
        if (ka0Var != null) {
            ka0Var.F();
        }
        org.telegram.ui.Components.tk tkVar = this.S;
        if (tkVar != null) {
            tkVar.F();
        }
        aa0 aa0Var = this.K0;
        if (aa0Var != null) {
            org.telegram.messenger.g0.r(aa0Var);
            this.K0 = null;
        }
        ArrayList arrayList = this.n0;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            oa0 oa0Var = (oa0) arrayList.get(i7);
            ImageReceiver imageReceiver = oa0Var.h;
            if (imageReceiver != null) {
                imageReceiver.R();
                oa0Var.h = null;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        j0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onLowMemory() {
        h6.m mVar;
        super.onLowMemory();
        org.telegram.messenger.za zaVar = this.G;
        if (zaVar == null || !this.w0 || (mVar = (h6.m) ((m.q3) ((bi.x5) ((a8.r7) zaVar).b).b).b) == null) {
            return;
        }
        try {
            l8.f fVar = (l8.f) mVar.c;
            fVar.t1(fVar.p1(), 6);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.za zaVar = this.G;
        if (zaVar != null && this.w0) {
            try {
                ((a8.r7) zaVar).x();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        UndoView undoView = this.x[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.x0 = false;
        M0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        org.telegram.messenger.za zaVar = this.G;
        if (zaVar != null && this.w0) {
            try {
                ((a8.r7) zaVar).z();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.x0 = true;
        D0();
        org.telegram.messenger.fa faVar = this.E;
        if (faVar != null) {
            try {
                faVar.k(true);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        s0(true);
        if (o0()) {
            this.s0 = false;
        } else if (this.s0 && (parentActivity = getParentActivity()) != null) {
            this.s0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        aa0 aa0Var = this.K0;
        if (aa0Var != null) {
            org.telegram.messenger.g0.r(aa0Var);
            org.telegram.messenger.g0.i3(this.K0, 5000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            k0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.ui.ActionBar.g5 g5Var = this.r;
            if (g5Var == null || g5Var.getSearchField() == null) {
                return;
            }
            this.r.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.m6.j5));
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (!z9 || z10) {
            return;
        }
        try {
            if (((bi.x5) ((a8.r7) this.G).b).getParent() instanceof ViewGroup) {
                ((ViewGroup) ((bi.x5) ((a8.r7) this.G).b).getParent()).removeView((bi.x5) ((a8.r7) this.G).b);
            }
        } catch (Exception unused) {
        }
        di.b4 b4Var = this.O;
        if (b4Var != null) {
            b4Var.addView((bi.x5) ((a8.r7) this.G).b, 0, c8.ha.e(-1, u0(), 51));
            K0(false);
            y0();
            D0();
            return;
        }
        View view = this.fragmentView;
        if (view != null) {
            ((FrameLayout) view).addView((bi.x5) ((a8.r7) this.G).b, 0, c8.ha.e(-1, -1, 51));
        }
    }

    public final void p0(ArrayList arrayList) {
        org.telegram.messenger.xa onCreateLatLngBoundsBuilder = this.m0 ? ((nb.a) org.telegram.messenger.t0.k()).onCreateLatLngBoundsBuilder() : null;
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i7);
            int i10 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i11 = messageMedia.period;
            if (i10 + i11 > currentTime || i11 == Integer.MAX_VALUE) {
                if (onCreateLatLngBoundsBuilder != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    ((g6.d0) onCreateLatLngBoundsBuilder).X(new org.telegram.messenger.cb(geoPoint.lat, geoPoint._long));
                }
                i0(message);
                if (this.c.getVisibility() != 8 && org.telegram.messenger.ij.B1(message.from_id) != getUserConfig().e()) {
                    this.c.setVisibility(0);
                    this.D = true;
                    this.c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new g30(this, 3)).start();
                }
            }
        }
        if (onCreateLatLngBoundsBuilder != null) {
            if (this.m0) {
                this.Q.w0(0, org.telegram.messenger.g0.L(99.0f), null);
            }
            this.m0 = false;
            this.P.N(this.n0);
            if (this.D0.C3()) {
                try {
                    g6.d0 d0Var = (g6.d0) onCreateLatLngBoundsBuilder;
                    org.telegram.messenger.cb a10 = d0Var.R().a();
                    org.telegram.messenger.cb z02 = z0(a10, 100.0d, 100.0d);
                    d0Var.X(z0(a10, -100.0d, -100.0d));
                    d0Var.X(z02);
                    org.telegram.messenger.da R = d0Var.R();
                    if (arrayList.size() > 1) {
                        try {
                            org.telegram.messenger.ua newCameraUpdateLatLngBounds = ((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngBounds(R, org.telegram.messenger.g0.L(113.0f));
                            this.F = newCameraUpdateLatLngBounds;
                            this.E.h(newCameraUpdateLatLngBounds);
                            this.F = null;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final boolean r0() {
        boolean z9;
        boolean z10;
        int i7;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i10;
        boolean z11 = false;
        if (this.E != null) {
            ArrayList arrayList = new ArrayList();
            int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
            ArrayList arrayList2 = this.n0;
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                oa0 oa0Var = (oa0) arrayList2.get(i11);
                org.telegram.messenger.ea eaVar = oa0Var.e;
                if (eaVar != null && (message = oa0Var.b) != null && (messageMedia = message.media) != null && ((i10 = messageMedia.period) == Integer.MAX_VALUE || message.date + i10 > currentTime)) {
                    arrayList.add(eaVar.a());
                }
            }
            boolean z12 = this.o0.f(getUserConfig().e()) != null;
            Location location = this.y0;
            if (location != null && !z12) {
                arrayList.add(new org.telegram.messenger.cb(location.getLatitude(), this.y0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    org.telegram.messenger.xa onCreateLatLngBoundsBuilder = ((nb.a) org.telegram.messenger.t0.k()).onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    int i12 = 0;
                    double d2 = Double.MAX_VALUE;
                    double d10 = Double.MAX_VALUE;
                    double d11 = -1.7976931348623157E308d;
                    while (i12 < size2) {
                        org.telegram.messenger.cb cbVar = (org.telegram.messenger.cb) arrayList.get(i12);
                        z9 = z11;
                        try {
                            ((g6.d0) onCreateLatLngBoundsBuilder).X(cbVar);
                            i7 = size2;
                            z10 = true;
                        } catch (Exception e10) {
                            e = e10;
                            z10 = true;
                            org.telegram.messenger.a8.g(e, z10);
                            return z9;
                        }
                        try {
                            double d12 = cbVar.a;
                            if (d12 < d2) {
                                d2 = d12;
                            }
                            if (d12 > d) {
                                d = d12;
                            }
                            double d13 = cbVar.b;
                            if (d13 < d10) {
                                d10 = d13;
                            }
                            if (d13 > d11) {
                                d11 = d13;
                            }
                            i12++;
                            z11 = z9;
                            size2 = i7;
                        } catch (Exception e11) {
                            e = e11;
                            org.telegram.messenger.a8.g(e, z10);
                            return z9;
                        }
                    }
                    z9 = z11;
                    z10 = true;
                    double d14 = (d2 + d) / 2.0d;
                    double d15 = (d10 + d11) / 2.0d;
                    double radians = Math.toRadians(d - d2) * 6366198.0d;
                    double radians2 = Math.toRadians(d11 - d10) * 6366198.0d * Math.cos(Math.toRadians(d14));
                    if (radians < 30.0d || radians2 < 30.0d) {
                        g6.d0 d0Var = (g6.d0) onCreateLatLngBoundsBuilder;
                        d0Var.X(new org.telegram.messenger.cb(Math.toDegrees(2.356194387921959E-6d) + d14, d15 + Math.toDegrees(15.0d / (Math.cos(Math.toRadians(d14)) * 6366198.0d))));
                        d0Var.X(new org.telegram.messenger.cb(d14 + Math.toDegrees(-2.356194387921959E-6d), d15 + Math.toDegrees((-15.0d) / (Math.cos(Math.toRadians(d14)) * 6366198.0d))));
                    }
                    this.E.c(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngBounds(((g6.d0) onCreateLatLngBoundsBuilder).R(), org.telegram.messenger.g0.L(60.0f)));
                    return true;
                } catch (Exception e12) {
                    e = e12;
                    z9 = z11;
                }
            }
        }
        return false;
    }

    public final void s0(boolean z9) {
        if (this.Q != null) {
            int i7 = this.mSystemInsets.d;
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight == 0) {
                return;
            }
            int i10 = this.H0;
            if (i10 == 6) {
                this.I0 = org.telegram.messenger.k5.z(66.0f, measuredHeight, i7);
            } else if (i10 == 2) {
                this.I0 = org.telegram.messenger.k5.z(73.0f, measuredHeight, i7);
            } else {
                this.I0 = org.telegram.messenger.k5.z(66.0f, measuredHeight, i7);
            }
            ma0 ma0Var = this.L0;
            if (ma0Var != null && ma0Var.m0(8) > 0) {
                this.I0 -= org.telegram.messenger.g0.L(200.0f);
            }
            this.b0 = org.telegram.messenger.g0.L(100.0f) + (measuredHeight - this.I0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(29.0f) + this.I0;
            this.O.setLayoutParams(layoutParams);
            this.P.P(this.I0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((bi.x5) ((a8.r7) this.G).b).getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = u0();
                org.telegram.messenger.fa faVar = this.E;
                if (faVar != null) {
                    faVar.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), t0());
                }
                ((bi.x5) ((a8.r7) this.G).b).setLayoutParams(layoutParams2);
            }
            this.P.f();
            if (!z9) {
                K0(false);
                return;
            }
            int i11 = i10 == 3 ? 73 : (i10 == 1 || i10 == 2) ? 66 : 0;
            this.U.h1(0, -org.telegram.messenger.g0.L(i11));
            K0(false);
            this.Q.post(new org.telegram.ui.Components.q2(this, i11, 17));
        }
    }

    public final int t0() {
        return org.telegram.messenger.g0.L(10.0f) + this.g0 + this.b0;
    }

    public final int u0() {
        return org.telegram.messenger.g0.L(10.0f) + this.I0 + this.b0;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        ArrayList arrayList = (ArrayList) getLocationController().c.f(org.telegram.messenger.ij.B0(this.D0.k));
        if (arrayList == null || !arrayList.isEmpty()) {
            arrayList = null;
        } else {
            p0(arrayList);
        }
        if (org.telegram.messenger.m5.z(this.l0)) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.l0));
            if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long B0 = org.telegram.messenger.ij.B0(this.D0.k);
        tL_messages_getRecentLocations.peer = getMessagesController().j1(B0);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new di.c6(this, B0, 1));
        return arrayList != null;
    }

    public final UndoView w0() {
        UndoView[] undoViewArr = this.x;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.O.removeView(undoViewArr[0]);
            this.O.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean x0() {
        return (getResourceProvider() == null && org.telegram.ui.ActionBar.m6.I.q()) || org.telegram.messenger.g0.B(getThemedColor(org.telegram.ui.ActionBar.m6.d6)) < 0.721f;
    }

    public final void y0() {
        SharedPreferences e12;
        int i7;
        ImageView imageView = this.c;
        if (imageView == null || imageView.getVisibility() != 0 || this.D || (i7 = (e12 = org.telegram.messenger.qp.e1()).getInt("proximityhint", 0)) >= 3) {
            return;
        }
        e12.edit().putInt("proximityhint", i7 + 1).commit();
        if (org.telegram.messenger.m5.E(this.l0)) {
            this.s.u(org.telegram.messenger.id.a0("ProximityTooltioUser", null, 2131746612, org.telegram.messenger.t10.j(getMessagesController().a2(Long.valueOf(this.l0)), true)));
        } else {
            this.s.u(org.telegram.messenger.id.M0(2131746613, null));
        }
        this.s.w();
    }
}
