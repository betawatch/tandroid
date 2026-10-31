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
import java.util.HashMap;
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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class yb0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public final UndoView[] D;
    public boolean D0;
    public boolean E;
    public Location E0;
    public boolean F;
    public Location F0;
    public org.telegram.messenger.ga G;
    public int G0;
    public org.telegram.messenger.ua H;
    public TLRPC.TL_channelLocation H0;
    public org.telegram.messenger.za I;
    public TLRPC.TL_channelLocation I0;
    public org.telegram.messenger.ua J;
    public org.telegram.messenger.jj J0;
    public boolean K;
    public boolean K0;
    public float L;
    public boolean L0;
    public m4.c M;
    public boolean M0;
    public double N;
    public tb0 N0;
    public boolean O;
    public final int O0;
    public org.telegram.ui.Components.jh0 P;
    public int P0;
    public l0 Q;
    public rb0 Q0;
    public ob0 R;
    public cb0 R0;
    public nb0 S;
    public qb0 S0;
    public org.telegram.ui.Components.tk0 T;
    public org.telegram.ui.Cells.z3 T0;
    public org.telegram.ui.Components.vk U;
    public TL_stories.MediaArea U0;
    public View V;
    public boolean V0;
    public s4.a0 W;
    public boolean W0;
    public org.telegram.ui.ActionBar.p5 X;
    public Boolean X0;
    public FrameLayout Y;
    public final Bitmap[] Y0;
    public FrameLayout Z;
    public ImageView a;
    public vg.f a0;
    public TextView b;
    public final RectF b0;
    public ImageView c;
    public int c0;
    public org.telegram.ui.ActionBar.p5 d;
    public int d0;
    public TextView e;
    public TextureView e0;
    public LinearLayout f;
    public org.telegram.ui.Components.z80 f0;
    public final RectF g0;
    public ImageView h;
    public final Paint h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public TextView n;
    public long n0;
    public boolean o0;
    public final ArrayList p0;
    public final a0.h q0;
    public TextView r;
    public long r0;
    public org.telegram.ui.ActionBar.p5 s;
    public boolean s0;
    public final ArrayList t0;
    public AnimatorSet u0;
    public org.telegram.messenger.fa v0;
    public ub0 w;
    public xb0 w0;
    public vh.p2 x;
    public FrameLayout x0;
    public boolean y;
    public boolean y0;
    public boolean z0;

    public yb0(int i10) {
        super(null);
        this.D = new UndoView[2];
        this.b0 = new RectF();
        this.g0 = new RectF();
        this.h0 = new Paint();
        this.k0 = true;
        this.l0 = false;
        this.m0 = true;
        this.o0 = true;
        this.p0 = new ArrayList();
        this.q0 = new a0.h();
        this.r0 = -1L;
        this.t0 = new ArrayList();
        this.y0 = true;
        this.P0 = (org.telegram.messenger.i0.q.x - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.L(66.0f);
        this.W0 = true;
        this.Y0 = new Bitmap[7];
        this.O0 = i10;
        org.telegram.messenger.i0.a0();
    }

    public static org.telegram.messenger.cb A0(org.telegram.messenger.cb cbVar, double d, double d10) {
        double d11 = cbVar.a;
        return new org.telegram.messenger.cb(d11 + Math.toDegrees(d / 6366198.0d), cbVar.b + Math.toDegrees(d10 / (Math.cos(Math.toRadians(d11)) * 6366198.0d)));
    }

    public static void Y(yb0 yb0Var, boolean z10, TLRPC.User user, int i10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (!z10) {
            yb0Var.K0(i10, 0, user);
            return;
        }
        org.telegram.messenger.md h = yb0Var.getLocationController().h(yb0Var.n0);
        if (h != null) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.peer = yb0Var.getMessagesController().i1(h.a);
            tL_messages_editMessage.id = h.b;
            tL_messages_editMessage.flags |= TLObject.FLAG_14;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = false;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
            Location location = org.telegram.messenger.nd.f(yb0Var.currentAccount).s;
            tL_messages_editMessage.media.geo_point.lat = org.telegram.messenger.i0.b0(location.getLatitude());
            tL_messages_editMessage.media.geo_point._long = org.telegram.messenger.i0.b0(location.getLongitude());
            tL_messages_editMessage.media.geo_point.accuracy_radius = (int) location.getAccuracy();
            TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
            TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
            if (inputGeoPoint.accuracy_radius != 0) {
                inputGeoPoint.flags |= 1;
            }
            int i11 = h.g;
            int i12 = h.f;
            if (i11 != i12) {
                inputMedia.proximity_notification_radius = i12;
                inputMedia.flags |= 8;
            }
            inputMedia.heading = org.telegram.messenger.nd.e(location);
            TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
            int i13 = inputMedia2.flags;
            inputMedia2.flags = i13 | 4;
            int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i15 = i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : h.d + i10;
            h.d = i15;
            inputMedia2.period = i15;
            if (i10 != Integer.MAX_VALUE) {
                i14 = h.c + i10;
            }
            h.c = i14;
            inputMedia2.flags = i13 | 6;
            org.telegram.messenger.jj jjVar = h.h;
            if (jjVar != null && (message = jjVar.k) != null && (messageMedia = message.media) != null) {
                messageMedia.period = i15;
                yb0Var.getMessagesStorage().r1(h.h.k, null, null, true);
            }
            yb0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.D4, new Object[0]);
        }
    }

    public static void Z(yb0 yb0Var, Canvas canvas, RectF rectF) {
        Paint paint = yb0Var.h0;
        int i10 = org.telegram.ui.ActionBar.t6.h5;
        paint.setColor(yb0Var.getThemedColor(i10));
        canvas.drawRect(rectF, paint);
        ViewGroup viewGroup = (ViewGroup) yb0Var.fragmentView;
        org.telegram.ui.Components.tk0 tk0Var = yb0Var.T;
        if (tk0Var != null && tk0Var.getVisibility() == 0) {
            org.telegram.ui.Components.tk0 tk0Var2 = yb0Var.T;
            yg.d.a(tk0Var2, canvas, rectF, tk0Var2, viewGroup);
            return;
        }
        if (yb0Var.Q.getVisibility() == 0) {
            RectF rectF2 = yb0Var.g0;
            canvas.save();
            canvas.translate(yb0Var.Q.getX(), yb0Var.Q.getY());
            canvas.clipRect(0.0f, 0.0f, yb0Var.Q.getWidth(), viewGroup.getHeight() - yb0Var.Q.getY());
            Drawable background = yb0Var.Q.getBackground();
            if (background != null) {
                background.draw(canvas);
            }
            org.telegram.messenger.za zaVar = yb0Var.I;
            fg.i iVar = zaVar != null ? (fg.i) ((bh.d) zaVar).a : null;
            if (iVar != null && iVar.getParent() == yb0Var.Q && iVar.getVisibility() == 0 && iVar.getAlpha() > 0.0f) {
                TextureView textureView = yb0Var.e0;
                if (textureView != null && textureView.isAttachedToWindow() && zg.h.c(yb0Var.e0, yb0Var.Q, rectF2)) {
                    if (iVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (iVar.getAlpha() * 255.0f));
                    } else {
                        canvas.save();
                    }
                    canvas.translate(rectF2.left, rectF2.top);
                    yb0Var.e0.draw(canvas);
                    canvas.restore();
                } else if (yb0Var.f0 != null) {
                    rectF2.set(iVar.getX(), iVar.getY(), iVar.getX() + iVar.getWidth(), iVar.getY() + iVar.getHeight());
                    org.telegram.ui.Components.z80 z80Var = yb0Var.f0;
                    float alpha = iVar.getAlpha();
                    Paint paint2 = z80Var.c;
                    Bitmap bitmap = z80Var.e;
                    if (bitmap != null && !bitmap.isRecycled() && alpha > 0.0f) {
                        paint2.setAlpha((int) (Math.min(1.0f, alpha) * 255.0f));
                        canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint2);
                    }
                }
            }
            p0(canvas, yb0Var.w);
            p0(canvas, yb0Var.V);
            canvas.restore();
        }
        if (yb0Var.S.getVisibility() != 0) {
            return;
        }
        int L = org.telegram.messenger.i0.L(22.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + yb0Var.mSystemInsets.b;
        float f7 = L;
        if (rectF.top >= f7) {
            return;
        }
        canvas.save();
        canvas.clipRect(0.0f, Math.min(rectF.top, f7), viewGroup.getWidth(), f7);
        if (yb0Var.c0 < L) {
            paint.setColor(yb0Var.getThemedColor(i10));
            paint.setAlpha(org.telegram.messenger.zs.j3);
            canvas.drawRect(0.0f, Math.max(yb0Var.c0, rectF.top), viewGroup.getWidth(), f7, paint);
        }
        nb0 nb0Var = yb0Var.S;
        yg.d.a(nb0Var, canvas, rectF, nb0Var, viewGroup);
        canvas.restore();
    }

    public static /* synthetic */ void a0(yb0 yb0Var, int i10) {
        tb0 tb0Var;
        float e;
        float f7;
        TLRPC.TL_messageMediaVenue I = yb0Var.U.I(i10);
        if (I == null || I.icon == null || yb0Var.O0 != 8 || yb0Var.G == null) {
            if (I == null || (tb0Var = yb0Var.N0) == null) {
                return;
            }
            tb0Var.d(I, yb0Var.O0, true, 0, 0L);
            yb0Var.finishFragment();
            return;
        }
        yb0Var.K0 = true;
        yb0Var.simpleActionBar.j(true);
        if ("pin".equals(I.icon)) {
            e = yb0Var.G.e();
            f7 = 4.0f;
        } else {
            e = yb0Var.G.e();
            f7 = 9.0f;
        }
        float f10 = e - f7;
        org.telegram.messenger.ga gaVar = yb0Var.G;
        IMapsProvider k10 = org.telegram.messenger.w0.k();
        TLRPC.GeoPoint geoPoint = I.geo;
        gaVar.b(((t7.u) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint.lat, geoPoint._long), f10));
        Location location = yb0Var.F0;
        if (location != null) {
            location.setLatitude(I.geo.lat);
            yb0Var.F0.setLongitude(I.geo._long);
        }
        yb0Var.R.M(yb0Var.F0);
    }

    public static /* synthetic */ void b0(yb0 yb0Var) {
        yb0Var.glassEngine.g();
        View view = yb0Var.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static /* synthetic */ void d0(yb0 yb0Var) {
        cb0 cb0Var;
        yb0Var.getLocationController().j(yb0Var.n0);
        if (yb0Var.isPaused || (cb0Var = yb0Var.R0) == null) {
            return;
        }
        org.telegram.messenger.i0.h3(cb0Var, 5000L);
    }

    public static void p0(Canvas canvas, View view) {
        if (view == null || view.getParent() == null || view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(view.getX(), view.getY());
        view.draw(canvas);
        canvas.restore();
    }

    public static View r0(View view, Class cls) {
        if (cls.isInstance(view)) {
            return (View) cls.cast(view);
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View r02 = r0(viewGroup.getChildAt(i10), cls);
            if (r02 != null) {
                return r02;
            }
        }
        return null;
    }

    public final boolean B0() {
        GLSurfaceView gLSurfaceView;
        org.telegram.messenger.za zaVar = this.I;
        if (zaVar == null || (gLSurfaceView = (GLSurfaceView) ((bh.d) zaVar).e) == null || this.K) {
            return false;
        }
        gLSurfaceView.queueEvent(new f70(14, this, gLSurfaceView));
        return true;
    }

    public final void C0(sb0 sb0Var) {
        double d;
        double d10;
        TLRPC.Message message;
        if (sb0Var == null || (message = sb0Var.b) == null) {
            org.telegram.messenger.jj jjVar = this.J0;
            if (jjVar != null) {
                TLRPC.GeoPoint geoPoint = jjVar.k.media.geo;
                d = geoPoint.lat;
                d10 = geoPoint._long;
            } else {
                TLRPC.GeoPoint geoPoint2 = this.H0.geo_point;
                d = geoPoint2.lat;
                d10 = geoPoint2._long;
            }
        } else {
            TLRPC.GeoPoint geoPoint3 = message.media.geo;
            d = geoPoint3.lat;
            d10 = geoPoint3._long;
        }
        boolean z10 = org.telegram.messenger.v2.a;
        org.telegram.messenger.w0.r();
        if (this.E0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps".concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.E0.getLatitude()), Double.valueOf(this.E0.getLongitude()), Double.valueOf(d), Double.valueOf(d10)))));
                return;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps".concat("?saddr=&daddr=%f,%f"), Double.valueOf(d), Double.valueOf(d10)))));
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    public final void D0(final boolean z10) {
        if (this.N0 == null || o0() || getParentActivity() == null || this.E0 == null || !k0()) {
            return;
        }
        final TLRPC.User Z1 = org.telegram.messenger.o5.E(this.n0) ? getMessagesController().Z1(Long.valueOf(this.n0)) : null;
        showDialog(org.telegram.ui.Components.s4.D(getParentActivity(), z10, Z1, new org.telegram.messenger.bs() { // from class: org.telegram.ui.ib0
            @Override // org.telegram.messenger.bs
            public final void a(int i10) {
                yb0.Y(yb0.this, z10, Z1, i10);
            }
        }, null));
    }

    public final void E0() {
        SurfaceView surfaceView;
        if (this.f0 == null || this.I == null) {
            return;
        }
        TextureView textureView = this.e0;
        if ((textureView == null || !textureView.isAttachedToWindow()) && ((surfaceView = this.f0.d) == null || !surfaceView.isAttachedToWindow())) {
            fg.i iVar = (fg.i) ((bh.d) this.I).a;
            TextureView textureView2 = (TextureView) r0(iVar, TextureView.class);
            this.e0 = textureView2;
            org.telegram.ui.Components.z80 z80Var = this.f0;
            SurfaceView surfaceView2 = textureView2 == null ? (SurfaceView) r0(iVar, SurfaceView.class) : null;
            if (z80Var.d != surfaceView2) {
                z80Var.d = surfaceView2;
                z80Var.a();
            }
            TextureView textureView3 = this.e0;
            if (textureView3 != null) {
                TextureView.SurfaceTextureListener surfaceTextureListener = textureView3.getSurfaceTextureListener();
                if (!(surfaceTextureListener instanceof vb0)) {
                    this.e0.setSurfaceTextureListener(new vb0(this, surfaceTextureListener));
                }
            }
            Q0();
        }
        TextureView textureView4 = this.e0;
        if (textureView4 == null) {
            this.f0.a();
            return;
        }
        TextureView.SurfaceTextureListener surfaceTextureListener2 = textureView4.getSurfaceTextureListener();
        if (surfaceTextureListener2 instanceof vb0) {
            return;
        }
        this.e0.setSurfaceTextureListener(new vb0(this, surfaceTextureListener2));
    }

    public final void F0(Location location) {
        int i10;
        if (location == null) {
            return;
        }
        this.E0 = new Location(location);
        sb0 sb0Var = (sb0) this.q0.f(getUserConfig().e());
        org.telegram.messenger.md h = getLocationController().h(this.n0);
        if (sb0Var != null && h != null && sb0Var.b.id == h.b) {
            org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(location.getLatitude(), location.getLongitude());
            sb0Var.e.d(cbVar);
            org.telegram.messenger.fa faVar = sb0Var.f;
            if (faVar != null) {
                faVar.d(cbVar);
            }
            if (this.r0 == sb0Var.a) {
                this.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(sb0Var.e.a()));
            }
        }
        if (this.J0 == null && this.H0 == null && this.G != null) {
            org.telegram.messenger.cb cbVar2 = new org.telegram.messenger.cb(location.getLatitude(), location.getLongitude());
            ob0 ob0Var = this.R;
            if (ob0Var != null) {
                if (!this.L0 && (i10 = this.O0) != 4 && i10 != 8) {
                    ob0Var.H(null, this.E0, true);
                }
                this.R.N(this.E0);
            }
            if (!this.K0) {
                this.F0 = new Location(location);
                if (this.M0) {
                    this.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(cbVar2));
                } else {
                    this.M0 = true;
                    this.G.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(cbVar2, this.G.e() - 4.0f));
                }
            }
        } else {
            this.R.N(this.E0);
        }
        org.telegram.ui.Components.jh0 jh0Var = this.P;
        if (jh0Var != null) {
            jh0Var.c(true);
        }
        m4.c cVar = this.M;
        if (cVar != null) {
            double latitude = this.E0.getLatitude();
            double longitude = this.E0.getLongitude();
            j8.a aVar = (j8.a) cVar.b;
            LatLng latLng = new LatLng(latitude, longitude);
            try {
                s7.f fVar = (s7.f) aVar.a;
                Parcel P0 = fVar.P0();
                s7.b.b(P0, latLng);
                fVar.T0(P0, 3);
            } catch (RemoteException e) {
                throw new ad.d(e);
            }
        }
        R0();
    }

    public final void G0(View view) {
        vg.f c10 = getBaseSimpleGlass().c.c(view, null, false);
        c10.o(w7.b9.m(getResourceProvider()));
        c10.q(org.telegram.messenger.i0.L(23.0f));
        c10.p(org.telegram.messenger.i0.L(6.0f));
        view.setBackground(c10);
        w7.e6.a(view);
    }

    public final void H0(org.telegram.messenger.jj jjVar) {
        this.J0 = jjVar;
        this.n0 = org.telegram.messenger.jj.B0(jjVar.k);
    }

    public final void I0(boolean z10, boolean z11) {
        this.e.animate().cancel();
        this.e.setEnabled(z10);
        if (z11) {
            this.e.setVisibility(0);
            this.e.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f).setInterpolator(org.telegram.ui.Components.gr.h).setDuration(320L).withEndAction(new gb0(this, z10, 1)).start();
        } else {
            this.e.setVisibility(z10 ? 0 : 4);
            this.e.setAlpha(z10 ? 1.0f : 0.0f);
            this.e.setScaleX(z10 ? 1.0f : 0.7f);
            this.e.setScaleY(z10 ? 1.0f : 0.7f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J0(sb0 sb0Var) {
        if (sb0Var.h != null) {
            return;
        }
        TLRPC.User user = sb0Var.c;
        TLRPC.Chat chat = sb0Var.d;
        if (user == null && chat == 0) {
            return;
        }
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        if (user != null) {
            r8Var.r(user);
        } else {
            r8Var.q(chat);
        }
        ImageReceiver imageReceiver = new ImageReceiver(null);
        imageReceiver.d = this.currentAccount;
        imageReceiver.g1 = new rv(17, this, sb0Var);
        imageReceiver.P();
        if (user == null) {
            user = chat;
        }
        imageReceiver.i0(user, r8Var, null);
        sb0Var.h = imageReceiver;
    }

    public final void K0(int i10, int i11, TLRPC.User user) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.i0.b0(this.E0.getLatitude());
        tL_messageMediaGeoLive.geo._long = org.telegram.messenger.i0.b0(this.E0.getLongitude());
        tL_messageMediaGeoLive.heading = org.telegram.messenger.nd.e(this.E0);
        int i12 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i10;
        tL_messageMediaGeoLive.proximity_notification_radius = i11;
        tL_messageMediaGeoLive.flags = i12 | 9;
        this.N0.d(tL_messageMediaGeoLive, this.O0, true, 0, 0L);
        if (i11 <= 0) {
            finishFragment();
            return;
        }
        this.P.L = true;
        this.c.setImageResource(R.drawable.msg_location_alert2);
        org.telegram.ui.Components.jh0 jh0Var = this.P;
        if (jh0Var != null) {
            jh0Var.a();
        }
        x0().k(0L, 24, Integer.valueOf(i11), user, null, null);
    }

    public final void L0() {
        if (this.R.b() != 0 && this.W.L0() == 0) {
            View childAt = this.S.getChildAt(0);
            int top = childAt.getTop() + org.telegram.messenger.i0.L(258.0f);
            if (top < 0 || top > org.telegram.messenger.i0.L(258.0f)) {
                return;
            }
            this.S.w0(0, top, null);
        }
    }

    public final void M0(boolean z10) {
        TextView textView;
        Location location;
        Location location2;
        if (this.O0 == 3) {
            z10 = true;
        }
        if (z10 && (textView = this.e) != null && textView.getTag() == null && ((location = this.E0) == null || (location2 = this.F0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        TextView textView2 = this.e;
        if (textView2 != null) {
            if (!z10 || textView2.getTag() == null) {
                if (z10 || this.e.getTag() != null) {
                    this.e.setTag(z10 ? 1 : null);
                    I0(z10, true);
                }
            }
        }
    }

    public final void N0(boolean z10, boolean z11) {
        Boolean bool = this.X0;
        if (bool == null || bool.booleanValue() != z10) {
            this.X0 = Boolean.valueOf(z10);
            if (z11) {
                this.b.setVisibility(0);
                this.b.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f).setInterpolator(org.telegram.ui.Components.gr.h).setDuration(420L).withEndAction(new gb0(this, z10, 0)).start();
            } else {
                this.b.setVisibility(z10 ? 0 : 8);
                this.b.setAlpha(z10 ? 1.0f : 0.0f);
                this.b.setScaleX(z10 ? 1.0f : 0.7f);
                this.b.setScaleY(z10 ? 1.0f : 0.7f);
            }
        }
    }

    public final void O0(boolean z10) {
        int i10;
        int i11;
        FrameLayout.LayoutParams layoutParams;
        s4.c1 K = this.S.K(0);
        if (K != null) {
            i10 = (int) K.a.getY();
            i11 = Math.min(i10, 0) + this.P0;
            this.c0 = (this.P0 + i10) - this.i0;
        } else {
            i10 = -this.Q.getMeasuredHeight();
            this.c0 = -org.telegram.messenger.i0.L(41.0f);
            i11 = 0;
        }
        this.S.invalidate();
        if (((FrameLayout.LayoutParams) this.Q.getLayoutParams()) != null) {
            if (i11 <= 0) {
                if (((fg.i) ((bh.d) this.I).a).getVisibility() == 0) {
                    ((fg.i) ((bh.d) this.I).a).setVisibility(4);
                    this.Q.setVisibility(4);
                    ub0 ub0Var = this.w;
                    if (ub0Var != null) {
                        ub0Var.setVisibility(4);
                    }
                }
            } else if (((fg.i) ((bh.d) this.I).a).getVisibility() == 4) {
                ((fg.i) ((bh.d) this.I).a).setVisibility(0);
                this.Q.setVisibility(0);
                ub0 ub0Var2 = this.w;
                if (ub0Var2 != null) {
                    ub0Var2.setVisibility(0);
                }
            }
            this.Q.setTranslationY(Math.min(0, i10));
            int i12 = -i10;
            int i13 = i12 / 2;
            ((fg.i) ((bh.d) this.I).a).setTranslationY(Math.max(0, i13));
            ub0 ub0Var3 = this.w;
            if (ub0Var3 != null) {
                ub0Var3.setTranslationY(Math.max(0, i13));
            }
            FrameLayout frameLayout = this.Y;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-Math.min(0, i10));
                float l4 = Utilities.l((org.telegram.messenger.m5.z(53.0f, i11 - this.i0, org.telegram.messenger.i0.L(46.0f) + ei.b.d(this.mSystemInsets.b)) - org.telegram.messenger.i0.L(7.0f)) / org.telegram.messenger.i0.L(48.0f));
                FrameLayout frameLayout2 = this.Y;
                frameLayout2.setAlpha(l4);
                frameLayout2.setVisibility(l4 > 0.0f ? 0 : 4);
                FrameLayout frameLayout3 = this.Z;
                frameLayout3.setAlpha(l4);
                frameLayout3.setVisibility(l4 > 0.0f ? 0 : 4);
                Q0();
            }
            View view = this.V;
            if (view != null) {
                int L = ((i11 / 2) + (i12 - org.telegram.messenger.i0.L(view.getTag() != null ? 69.0f : 48.0f))) - (this.i0 / 2);
                this.G0 = L;
                view.setTranslationY(L);
            }
            if (z10) {
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((fg.i) ((bh.d) this.I).a).getLayoutParams();
            if (layoutParams2 != null && layoutParams2.height != v0()) {
                layoutParams2.height = v0();
                org.telegram.messenger.ga gaVar = this.G;
                if (gaVar != null) {
                    gaVar.q(org.telegram.messenger.i0.L(70.0f), 0, org.telegram.messenger.i0.L(70.0f), u0());
                }
                ((fg.i) ((bh.d) this.I).a).setLayoutParams(layoutParams2);
            }
            ub0 ub0Var4 = this.w;
            if (ub0Var4 == null || (layoutParams = (FrameLayout.LayoutParams) ub0Var4.getLayoutParams()) == null || layoutParams.height == v0()) {
                return;
            }
            layoutParams.height = v0();
            this.w.setLayoutParams(layoutParams);
        }
    }

    public final void P0() {
        if (!this.z0) {
            this.f.setVisibility(8);
        } else {
            if (!this.B0) {
                this.T.setEmptyView(this.f);
                return;
            }
            this.T.setEmptyView(null);
            this.f.setVisibility(8);
            this.T.setVisibility(8);
        }
    }

    public final void Q0() {
        org.telegram.messenger.za zaVar;
        l0 l0Var;
        org.telegram.ui.Components.z80 z80Var = this.f0;
        if (z80Var == null || (zaVar = this.I) == null) {
            return;
        }
        fg.i iVar = (fg.i) ((bh.d) zaVar).a;
        boolean z10 = this.e0 == null && this.D0 && !isFinishing() && (l0Var = this.Q) != null && l0Var.getVisibility() == 0 && iVar.getParent() != null && iVar.getVisibility() == 0;
        if (z80Var.g == z10) {
            return;
        }
        z80Var.g = z10;
        if (z10) {
            z80Var.a();
        } else {
            z80Var.d();
        }
    }

    public final void R0() {
        TLRPC.MessageMedia messageMedia;
        int i10;
        if (this.b == null) {
            return;
        }
        if (this.s0) {
            N0(false, true);
            s0();
            return;
        }
        int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
        ArrayList arrayList = this.p0;
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.Message message = ((sb0) arrayList.get(i12)).b;
            if (message != null && (messageMedia = message.media) != null && ((i10 = messageMedia.period) == Integer.MAX_VALUE || message.date + i10 > currentTime)) {
                i11++;
            }
        }
        boolean z10 = this.q0.f(getUserConfig().e()) != null;
        if (this.E0 != null && !z10) {
            i11++;
        }
        N0(i11 >= 2, true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.cj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.uj));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0865 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0872 A[LOOP:0: B:94:0x0870->B:95:0x0872, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x08bd  */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z10;
        boolean z11;
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.jj jjVar2;
        int i10;
        TLRPC.TL_channelLocation tL_channelLocation;
        org.telegram.messenger.jj jjVar3;
        int i11;
        ei.b baseSimpleGlass;
        org.telegram.ui.Components.tk0 tk0Var;
        long j10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        final int i12 = 0;
        this.A0 = false;
        this.z0 = false;
        this.B0 = false;
        ob0 ob0Var = this.R;
        if (ob0Var != null) {
            ob0Var.F();
        }
        org.telegram.ui.Components.vk vkVar = this.U;
        if (vkVar != null) {
            vkVar.F();
        }
        if (this.H0 != null) {
            Location location = new Location("network");
            this.F0 = location;
            location.setLatitude(this.H0.geo_point.lat);
            this.F0.setLongitude(this.H0.geo_point._long);
        } else if (this.J0 != null) {
            Location location2 = new Location("network");
            this.F0 = location2;
            location2.setLatitude(this.J0.k.media.geo.lat);
            this.F0.setLongitude(this.J0.k.media.geo._long);
        }
        final int i13 = 1;
        this.l0 = (getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new mb0(this));
        org.telegram.ui.ActionBar.o5 o10 = this.simpleActionBar.o();
        org.telegram.ui.ActionBar.p5 b10 = o10.b(0, R.drawable.msg_map_type);
        this.d = b10;
        b10.e(2, R.drawable.msg_map, org.telegram.messenger.cd.L0(2131748705, null));
        this.d.e(3, R.drawable.msg_satellite, org.telegram.messenger.cd.L0(2131745965, null));
        final int i14 = 4;
        this.d.e(4, R.drawable.msg_hybrid, org.telegram.messenger.cd.L0(2131749284, null));
        this.d.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        TLRPC.TL_channelLocation tL_channelLocation2 = this.H0;
        int i15 = this.O0;
        if (tL_channelLocation2 != null) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752220, null));
        } else {
            org.telegram.messenger.jj jjVar4 = this.J0;
            if (jjVar4 == null) {
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131745474, null));
                if (i15 != 4) {
                    this.w = new ub0(this, context);
                    org.telegram.ui.ActionBar.p5 b11 = o10.b(0, R.drawable.outline_header_search);
                    b11.N();
                    b11.B0 = new ag.l3(this, 15);
                    this.s = b11;
                    b11.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
                    this.s.setContentDescription(org.telegram.messenger.cd.L0(2131745853, null));
                }
            } else if (jjVar4.C3()) {
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131753966, null));
                org.telegram.ui.ActionBar.p5 b12 = o10.b(0, R.drawable.ic_ab_other);
                this.X = b12;
                b12.e(6, R.drawable.filled_directions, org.telegram.messenger.cd.L0(2131750482, null));
            } else {
                if (i15 != 3) {
                    String str = this.J0.k.media.title;
                    if (str == null || str.length() <= 0) {
                        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752220, null));
                    } else {
                        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131745422, null));
                    }
                }
                if (i15 != 3) {
                    org.telegram.ui.ActionBar.p5 b13 = o10.b(0, R.drawable.ic_ab_other);
                    this.X = b13;
                    b13.e(1, R.drawable.msg_openin, org.telegram.messenger.cd.L0(2131747812, null));
                    if (!getLocationController().i(this.n0) && this.W0) {
                        this.X.e(5, R.drawable.msg_location, org.telegram.messenger.cd.L0(2131745629, null));
                    }
                    this.X.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
                }
            }
        }
        FrameLayout wb0Var = new wb0(this, context);
        this.fragmentView = wb0Var;
        int i16 = org.telegram.ui.ActionBar.t6.h5;
        org.telegram.ui.ActionBar.a7.i(i16, wb0Var, getResourceProvider());
        this.i0 = org.telegram.messenger.i0.L((i15 == 0 || i15 == 1) ? 26.0f : 16.0f);
        l0 l0Var = new l0(this, context, 13);
        this.Q = l0Var;
        l0Var.setBackgroundDrawable(new jh.g(y0()));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        this.Q.addView(frameLayout, w7.b6.e(-1, -2, 51));
        this.Z = new FrameLayout(context);
        FrameLayout.LayoutParams e = w7.b6.e(-1, -2, 83);
        e.bottomMargin = org.telegram.messenger.i0.L(1.0f) + org.telegram.messenger.i0.L(29.0f) + this.i0;
        this.Q.addView(this.Z, e);
        org.telegram.messenger.jj jjVar5 = this.J0;
        if ((jjVar5 == null && (i15 == 0 || i15 == 1)) || (jjVar5 != null && i15 == 3)) {
            TextView textView = new TextView(context);
            this.e = textView;
            G0(textView);
            org.telegram.ui.ActionBar.a7.V(this.e, org.telegram.ui.ActionBar.t6.jj, getResourceProvider());
            this.e.setTextSize(1, 14.0f);
            this.e.setTypeface(org.telegram.messenger.i0.o());
            this.e.setGravity(17);
            this.e.setPadding(org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(24.0f), 0);
            if (i15 == 3) {
                this.simpleActionBar.addView(this.e, w7.b6.e(-2, 58, 1));
            } else {
                this.Y.addView(this.e, w7.b6.d(-2, 58.0f, 49, 58.0f, 0.0f, 58.0f, 0.0f));
            }
            I0(false, false);
            if (i15 == 3) {
                this.e.setText(org.telegram.messenger.cd.L0(2131747811, null));
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.db0
                    public final /* synthetic */ yb0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        org.telegram.messenger.ga gaVar;
                        boolean z12;
                        int i17 = i14;
                        int i18 = 3;
                        yb0 yb0Var = this.b;
                        switch (i17) {
                            case 0:
                                yb0Var.M0(false);
                                yb0Var.R.H(null, yb0Var.F0, true);
                                yb0Var.L0 = true;
                                yb0Var.L0();
                                return;
                            case 1:
                                int i19 = yb0Var.O0;
                                Activity parentActivity = yb0Var.getParentActivity();
                                if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                                    if (yb0Var.getParentActivity() == null) {
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yb0Var.getParentActivity());
                                    int i20 = org.telegram.ui.ActionBar.t6.L5;
                                    alertDialog$Builder.m(R.raw.permission_request_location, 72, yb0Var.getThemedColor(i20), null);
                                    alertDialog$Builder.n(i20, yb0Var.getResourceProvider());
                                    SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131747320, null));
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                    x1Var.T = W2;
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747316, null), new fb0(yb0Var, 1));
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                                    yb0Var.showDialog(x1Var);
                                    return;
                                }
                                if (yb0Var.k0() || i19 == 3) {
                                    if ((yb0Var.J0 == null || i19 == 3) && yb0Var.H0 == null) {
                                        if (yb0Var.E0 != null && yb0Var.G != null) {
                                            ImageView imageView = yb0Var.a;
                                            int i21 = org.telegram.ui.ActionBar.t6.jj;
                                            org.telegram.ui.ActionBar.a7.t(imageView, i21, yb0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                            yb0Var.a.setTag(Integer.valueOf(i21));
                                            yb0Var.R.M(null);
                                            yb0Var.K0 = false;
                                            yb0Var.M0(false);
                                            yb0Var.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(new org.telegram.messenger.cb(yb0Var.E0.getLatitude(), yb0Var.E0.getLongitude())));
                                            if (yb0Var.L0 && i19 != 8) {
                                                Location location3 = yb0Var.E0;
                                                if (location3 != null) {
                                                    yb0Var.R.H(null, location3, true);
                                                }
                                                yb0Var.L0 = false;
                                                yb0Var.L0();
                                            }
                                        }
                                    } else if (yb0Var.E0 != null && (gaVar = yb0Var.G) != null) {
                                        gaVar.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(yb0Var.E0.getLatitude(), yb0Var.E0.getLongitude()), yb0Var.G.e() - 4.0f));
                                    }
                                    if (yb0Var.v0 != null) {
                                        yb0Var.V.setVisibility(0);
                                        ub0 ub0Var = yb0Var.w;
                                        org.telegram.messenger.fa faVar = yb0Var.v0;
                                        HashMap hashMap = ub0Var.a;
                                        View view2 = (View) hashMap.get(faVar);
                                        if (view2 != null) {
                                            ub0Var.removeView(view2);
                                            hashMap.remove(faVar);
                                        }
                                        yb0Var.v0 = null;
                                        yb0Var.w0 = null;
                                        yb0Var.x0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 2:
                                yb0Var.r0 = -1L;
                                yb0Var.K0 = true;
                                if (yb0Var.s0()) {
                                    yb0Var.s0 = true;
                                    yb0Var.N0(false, true);
                                    return;
                                }
                                return;
                            case 3:
                                if (yb0Var.getParentActivity() == null || yb0Var.E0 == null || !yb0Var.k0() || yb0Var.G == null) {
                                    return;
                                }
                                vh.p2 p2Var = yb0Var.x;
                                if (p2Var != null) {
                                    p2Var.e(true);
                                }
                                org.telegram.messenger.vp.d1().edit().putInt("proximityhint", 3).commit();
                                org.telegram.messenger.md h = yb0Var.getLocationController().h(yb0Var.n0);
                                if (yb0Var.E) {
                                    yb0Var.D[0].d(1, true);
                                }
                                if (h != null && h.f > 0) {
                                    yb0Var.c.setImageResource(R.drawable.msg_location_alert);
                                    m4.c cVar = yb0Var.M;
                                    if (cVar != null) {
                                        cVar.v0();
                                        yb0Var.M = null;
                                    }
                                    yb0Var.E = true;
                                    yb0Var.x0().k(0L, 25, 0, null, new cb0(yb0Var, 1), new f70(15, yb0Var, h));
                                    return;
                                }
                                m4.c cVar2 = yb0Var.M;
                                if (cVar2 == null) {
                                    yb0Var.l0(500);
                                } else {
                                    try {
                                        s7.f fVar = (s7.f) ((j8.a) cVar2.b).a;
                                        Parcel O0 = fVar.O0(fVar.P0(), 6);
                                        double readDouble = O0.readDouble();
                                        O0.recycle();
                                        yb0Var.N = readDouble;
                                    } catch (RemoteException e7) {
                                        throw new ad.d(e7);
                                    }
                                }
                                TLRPC.User Z1 = org.telegram.messenger.o5.E(yb0Var.n0) ? yb0Var.getMessagesController().Z1(Long.valueOf(yb0Var.n0)) : null;
                                Activity parentActivity2 = yb0Var.getParentActivity();
                                fb0 fb0Var = new fb0(yb0Var, i18);
                                rv rvVar = new rv(18, yb0Var, Z1);
                                cb0 cb0Var = new cb0(yb0Var, 4);
                                org.telegram.ui.Components.jh0 jh0Var = new org.telegram.ui.Components.jh0(parentActivity2);
                                jh0Var.a = null;
                                jh0Var.d = -1;
                                jh0Var.e = false;
                                jh0Var.f = false;
                                jh0Var.h = null;
                                jh0Var.n = new Rect();
                                new Paint();
                                jh0Var.x = true;
                                jh0Var.F = org.telegram.ui.Components.gr.h;
                                jh0Var.setWillNotDraw(false);
                                jh0Var.Q = cb0Var;
                                jh0Var.D = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                                Rect rect = new Rect();
                                Drawable mutate = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                org.telegram.ui.ActionBar.a7.y(jh0Var, mutate, org.telegram.ui.ActionBar.t6.h5, null, PorterDuff.Mode.MULTIPLY);
                                mutate.getPadding(rect);
                                int i22 = rect.left;
                                jh0Var.y = i22;
                                org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(jh0Var.getContext());
                                jh0Var.w = fh0Var;
                                fh0Var.setBackgroundDrawable(mutate);
                                fh0Var.setPadding(i22, (org.telegram.messenger.i0.L(8.0f) + rect.top) - 1, i22, 0);
                                fh0Var.setVisibility(4);
                                jh0Var.addView(fh0Var, 0, w7.b6.e(-1, -2, 80));
                                org.telegram.messenger.cd.l();
                                jh0Var.O = org.telegram.messenger.cd.d0.booleanValue();
                                jh0Var.M = Z1;
                                jh0Var.I = fb0Var;
                                org.telegram.ui.Components.ac0 ac0Var = new org.telegram.ui.Components.ac0(parentActivity2, null);
                                jh0Var.G = ac0Var;
                                ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
                                ac0Var.setItemCount(5);
                                org.telegram.ui.Components.ac0 ac0Var2 = new org.telegram.ui.Components.ac0(parentActivity2, null);
                                jh0Var.H = ac0Var2;
                                ac0Var2.setItemCount(5);
                                ac0Var2.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
                                org.telegram.ui.Components.gh0 gh0Var = new org.telegram.ui.Components.gh0(jh0Var, parentActivity2);
                                jh0Var.P = gh0Var;
                                gh0Var.setOrientation(1);
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity2);
                                gh0Var.addView(frameLayout2, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView2 = new TextView(parentActivity2);
                                textView2.setText(org.telegram.messenger.cd.L0(2131748766, null));
                                org.telegram.messenger.m5.m(textView2, org.telegram.ui.ActionBar.t6.j5, null, 1, 20.0f);
                                frameLayout2.addView(textView2, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView2.setOnTouchListener(new org.telegram.ui.ActionBar.n2(19));
                                LinearLayout linearLayout = new LinearLayout(parentActivity2);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                gh0Var.addView(linearLayout, w7.b6.o(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                                TextView textView3 = new TextView(parentActivity2);
                                jh0Var.K = textView3;
                                org.telegram.ui.Components.hh0 hh0Var = new org.telegram.ui.Components.hh0(parentActivity2);
                                jh0Var.J = hh0Var;
                                linearLayout.addView(ac0Var, w7.b6.l(0.5f, 0, org.telegram.messenger.zs.t4));
                                ac0Var.setFormatter(new org.telegram.ui.Components.eh0(jh0Var, 0));
                                ac0Var.setMinValue(0);
                                ac0Var.setMaxValue(10);
                                ac0Var.setWrapSelectorWheel(false);
                                ac0Var.setTextOffset(org.telegram.messenger.i0.L(20.0f));
                                org.telegram.ui.Components.eh0 eh0Var = new org.telegram.ui.Components.eh0(jh0Var, 1);
                                ac0Var.setOnValueChangedListener(eh0Var);
                                ac0Var2.setMinValue(0);
                                ac0Var2.setMaxValue(10);
                                ac0Var2.setWrapSelectorWheel(false);
                                ac0Var2.setTextOffset(-org.telegram.messenger.i0.L(20.0f));
                                linearLayout.addView(ac0Var2, w7.b6.l(0.5f, 0, org.telegram.messenger.zs.t4));
                                ac0Var2.setFormatter(new org.telegram.ui.Components.eh0(jh0Var, 2));
                                ac0Var2.setOnValueChangedListener(eh0Var);
                                ac0Var.setValue(0);
                                ac0Var2.setValue(6);
                                gh0Var.addView(frameLayout3, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                                hh0Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                                hh0Var.setGravity(17);
                                org.telegram.ui.ActionBar.a7.V(hh0Var, org.telegram.ui.ActionBar.t6.Gi, null);
                                hh0Var.setTextSize(1, 14.0f);
                                hh0Var.setMaxLines(2);
                                hh0Var.setTypeface(org.telegram.messenger.i0.o());
                                hh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 4.0f));
                                frameLayout3.addView(hh0Var, w7.b6.c(48.0f, -1));
                                hh0Var.setOnClickListener(new org.telegram.ui.Components.sr(12, jh0Var, rvVar));
                                textView3.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                                textView3.setGravity(17);
                                org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.q5, null);
                                textView3.setTextSize(1, 14.0f);
                                textView3.setAlpha(0.0f);
                                textView3.setScaleX(0.5f);
                                textView3.setScaleY(0.5f);
                                frameLayout3.addView(textView3, w7.b6.c(48.0f, -1));
                                fh0Var.addView(gh0Var, w7.b6.e(-1, -2, 51));
                                yb0Var.P = jh0Var;
                                ((FrameLayout) yb0Var.fragmentView).addView(jh0Var, w7.b6.c(-1.0f, -1));
                                org.telegram.ui.Components.jh0 jh0Var2 = yb0Var.P;
                                jh0Var2.r = false;
                                AnimatorSet animatorSet = jh0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    jh0Var2.s = null;
                                }
                                org.telegram.ui.Components.fh0 fh0Var2 = jh0Var2.w;
                                Point point = org.telegram.messenger.i0.q;
                                fh0Var2.measure(View.MeasureSpec.makeMeasureSpec((jh0Var2.y * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                                if (jh0Var2.r) {
                                    z12 = true;
                                } else {
                                    fh0Var2.setVisibility(0);
                                    if (jh0Var2.x) {
                                        jh0Var2.setLayerType(2, null);
                                    }
                                    fh0Var2.setTranslationY(fh0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    jh0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(fh0Var2, (Property<org.telegram.ui.Components.fh0, Float>) View.TRANSLATION_Y, 0.0f));
                                    jh0Var2.s.setDuration(400L);
                                    jh0Var2.s.setStartDelay(20L);
                                    jh0Var2.s.setInterpolator(jh0Var2.F);
                                    z12 = true;
                                    jh0Var2.s.addListener(new org.telegram.ui.Components.ih0(jh0Var2, 1 == true ? 1 : 0));
                                    org.telegram.messenger.zs.e().k(98, 512);
                                    jh0Var2.s.start();
                                }
                                jh0Var2.c(z12);
                                return;
                            default:
                                try {
                                    TLRPC.GeoPoint geoPoint = yb0Var.J0.k.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    yb0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.f8.g(e10, true);
                                    return;
                                }
                        }
                    }
                });
                I0(true, false);
            } else {
                this.e.setText(org.telegram.messenger.cd.L0(2131747237, null));
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.db0
                    public final /* synthetic */ yb0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        org.telegram.messenger.ga gaVar;
                        boolean z12;
                        int i17 = i12;
                        int i18 = 3;
                        yb0 yb0Var = this.b;
                        switch (i17) {
                            case 0:
                                yb0Var.M0(false);
                                yb0Var.R.H(null, yb0Var.F0, true);
                                yb0Var.L0 = true;
                                yb0Var.L0();
                                return;
                            case 1:
                                int i19 = yb0Var.O0;
                                Activity parentActivity = yb0Var.getParentActivity();
                                if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                                    if (yb0Var.getParentActivity() == null) {
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yb0Var.getParentActivity());
                                    int i20 = org.telegram.ui.ActionBar.t6.L5;
                                    alertDialog$Builder.m(R.raw.permission_request_location, 72, yb0Var.getThemedColor(i20), null);
                                    alertDialog$Builder.n(i20, yb0Var.getResourceProvider());
                                    SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131747320, null));
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                    x1Var.T = W2;
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747316, null), new fb0(yb0Var, 1));
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                                    yb0Var.showDialog(x1Var);
                                    return;
                                }
                                if (yb0Var.k0() || i19 == 3) {
                                    if ((yb0Var.J0 == null || i19 == 3) && yb0Var.H0 == null) {
                                        if (yb0Var.E0 != null && yb0Var.G != null) {
                                            ImageView imageView = yb0Var.a;
                                            int i21 = org.telegram.ui.ActionBar.t6.jj;
                                            org.telegram.ui.ActionBar.a7.t(imageView, i21, yb0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                            yb0Var.a.setTag(Integer.valueOf(i21));
                                            yb0Var.R.M(null);
                                            yb0Var.K0 = false;
                                            yb0Var.M0(false);
                                            yb0Var.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(new org.telegram.messenger.cb(yb0Var.E0.getLatitude(), yb0Var.E0.getLongitude())));
                                            if (yb0Var.L0 && i19 != 8) {
                                                Location location3 = yb0Var.E0;
                                                if (location3 != null) {
                                                    yb0Var.R.H(null, location3, true);
                                                }
                                                yb0Var.L0 = false;
                                                yb0Var.L0();
                                            }
                                        }
                                    } else if (yb0Var.E0 != null && (gaVar = yb0Var.G) != null) {
                                        gaVar.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(yb0Var.E0.getLatitude(), yb0Var.E0.getLongitude()), yb0Var.G.e() - 4.0f));
                                    }
                                    if (yb0Var.v0 != null) {
                                        yb0Var.V.setVisibility(0);
                                        ub0 ub0Var = yb0Var.w;
                                        org.telegram.messenger.fa faVar = yb0Var.v0;
                                        HashMap hashMap = ub0Var.a;
                                        View view2 = (View) hashMap.get(faVar);
                                        if (view2 != null) {
                                            ub0Var.removeView(view2);
                                            hashMap.remove(faVar);
                                        }
                                        yb0Var.v0 = null;
                                        yb0Var.w0 = null;
                                        yb0Var.x0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 2:
                                yb0Var.r0 = -1L;
                                yb0Var.K0 = true;
                                if (yb0Var.s0()) {
                                    yb0Var.s0 = true;
                                    yb0Var.N0(false, true);
                                    return;
                                }
                                return;
                            case 3:
                                if (yb0Var.getParentActivity() == null || yb0Var.E0 == null || !yb0Var.k0() || yb0Var.G == null) {
                                    return;
                                }
                                vh.p2 p2Var = yb0Var.x;
                                if (p2Var != null) {
                                    p2Var.e(true);
                                }
                                org.telegram.messenger.vp.d1().edit().putInt("proximityhint", 3).commit();
                                org.telegram.messenger.md h = yb0Var.getLocationController().h(yb0Var.n0);
                                if (yb0Var.E) {
                                    yb0Var.D[0].d(1, true);
                                }
                                if (h != null && h.f > 0) {
                                    yb0Var.c.setImageResource(R.drawable.msg_location_alert);
                                    m4.c cVar = yb0Var.M;
                                    if (cVar != null) {
                                        cVar.v0();
                                        yb0Var.M = null;
                                    }
                                    yb0Var.E = true;
                                    yb0Var.x0().k(0L, 25, 0, null, new cb0(yb0Var, 1), new f70(15, yb0Var, h));
                                    return;
                                }
                                m4.c cVar2 = yb0Var.M;
                                if (cVar2 == null) {
                                    yb0Var.l0(500);
                                } else {
                                    try {
                                        s7.f fVar = (s7.f) ((j8.a) cVar2.b).a;
                                        Parcel O0 = fVar.O0(fVar.P0(), 6);
                                        double readDouble = O0.readDouble();
                                        O0.recycle();
                                        yb0Var.N = readDouble;
                                    } catch (RemoteException e7) {
                                        throw new ad.d(e7);
                                    }
                                }
                                TLRPC.User Z1 = org.telegram.messenger.o5.E(yb0Var.n0) ? yb0Var.getMessagesController().Z1(Long.valueOf(yb0Var.n0)) : null;
                                Activity parentActivity2 = yb0Var.getParentActivity();
                                fb0 fb0Var = new fb0(yb0Var, i18);
                                rv rvVar = new rv(18, yb0Var, Z1);
                                cb0 cb0Var = new cb0(yb0Var, 4);
                                org.telegram.ui.Components.jh0 jh0Var = new org.telegram.ui.Components.jh0(parentActivity2);
                                jh0Var.a = null;
                                jh0Var.d = -1;
                                jh0Var.e = false;
                                jh0Var.f = false;
                                jh0Var.h = null;
                                jh0Var.n = new Rect();
                                new Paint();
                                jh0Var.x = true;
                                jh0Var.F = org.telegram.ui.Components.gr.h;
                                jh0Var.setWillNotDraw(false);
                                jh0Var.Q = cb0Var;
                                jh0Var.D = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                                Rect rect = new Rect();
                                Drawable mutate = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                org.telegram.ui.ActionBar.a7.y(jh0Var, mutate, org.telegram.ui.ActionBar.t6.h5, null, PorterDuff.Mode.MULTIPLY);
                                mutate.getPadding(rect);
                                int i22 = rect.left;
                                jh0Var.y = i22;
                                org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(jh0Var.getContext());
                                jh0Var.w = fh0Var;
                                fh0Var.setBackgroundDrawable(mutate);
                                fh0Var.setPadding(i22, (org.telegram.messenger.i0.L(8.0f) + rect.top) - 1, i22, 0);
                                fh0Var.setVisibility(4);
                                jh0Var.addView(fh0Var, 0, w7.b6.e(-1, -2, 80));
                                org.telegram.messenger.cd.l();
                                jh0Var.O = org.telegram.messenger.cd.d0.booleanValue();
                                jh0Var.M = Z1;
                                jh0Var.I = fb0Var;
                                org.telegram.ui.Components.ac0 ac0Var = new org.telegram.ui.Components.ac0(parentActivity2, null);
                                jh0Var.G = ac0Var;
                                ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
                                ac0Var.setItemCount(5);
                                org.telegram.ui.Components.ac0 ac0Var2 = new org.telegram.ui.Components.ac0(parentActivity2, null);
                                jh0Var.H = ac0Var2;
                                ac0Var2.setItemCount(5);
                                ac0Var2.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
                                org.telegram.ui.Components.gh0 gh0Var = new org.telegram.ui.Components.gh0(jh0Var, parentActivity2);
                                jh0Var.P = gh0Var;
                                gh0Var.setOrientation(1);
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity2);
                                gh0Var.addView(frameLayout2, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView2 = new TextView(parentActivity2);
                                textView2.setText(org.telegram.messenger.cd.L0(2131748766, null));
                                org.telegram.messenger.m5.m(textView2, org.telegram.ui.ActionBar.t6.j5, null, 1, 20.0f);
                                frameLayout2.addView(textView2, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView2.setOnTouchListener(new org.telegram.ui.ActionBar.n2(19));
                                LinearLayout linearLayout = new LinearLayout(parentActivity2);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                gh0Var.addView(linearLayout, w7.b6.o(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                                TextView textView3 = new TextView(parentActivity2);
                                jh0Var.K = textView3;
                                org.telegram.ui.Components.hh0 hh0Var = new org.telegram.ui.Components.hh0(parentActivity2);
                                jh0Var.J = hh0Var;
                                linearLayout.addView(ac0Var, w7.b6.l(0.5f, 0, org.telegram.messenger.zs.t4));
                                ac0Var.setFormatter(new org.telegram.ui.Components.eh0(jh0Var, 0));
                                ac0Var.setMinValue(0);
                                ac0Var.setMaxValue(10);
                                ac0Var.setWrapSelectorWheel(false);
                                ac0Var.setTextOffset(org.telegram.messenger.i0.L(20.0f));
                                org.telegram.ui.Components.eh0 eh0Var = new org.telegram.ui.Components.eh0(jh0Var, 1);
                                ac0Var.setOnValueChangedListener(eh0Var);
                                ac0Var2.setMinValue(0);
                                ac0Var2.setMaxValue(10);
                                ac0Var2.setWrapSelectorWheel(false);
                                ac0Var2.setTextOffset(-org.telegram.messenger.i0.L(20.0f));
                                linearLayout.addView(ac0Var2, w7.b6.l(0.5f, 0, org.telegram.messenger.zs.t4));
                                ac0Var2.setFormatter(new org.telegram.ui.Components.eh0(jh0Var, 2));
                                ac0Var2.setOnValueChangedListener(eh0Var);
                                ac0Var.setValue(0);
                                ac0Var2.setValue(6);
                                gh0Var.addView(frameLayout3, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                                hh0Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                                hh0Var.setGravity(17);
                                org.telegram.ui.ActionBar.a7.V(hh0Var, org.telegram.ui.ActionBar.t6.Gi, null);
                                hh0Var.setTextSize(1, 14.0f);
                                hh0Var.setMaxLines(2);
                                hh0Var.setTypeface(org.telegram.messenger.i0.o());
                                hh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 4.0f));
                                frameLayout3.addView(hh0Var, w7.b6.c(48.0f, -1));
                                hh0Var.setOnClickListener(new org.telegram.ui.Components.sr(12, jh0Var, rvVar));
                                textView3.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                                textView3.setGravity(17);
                                org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.q5, null);
                                textView3.setTextSize(1, 14.0f);
                                textView3.setAlpha(0.0f);
                                textView3.setScaleX(0.5f);
                                textView3.setScaleY(0.5f);
                                frameLayout3.addView(textView3, w7.b6.c(48.0f, -1));
                                fh0Var.addView(gh0Var, w7.b6.e(-1, -2, 51));
                                yb0Var.P = jh0Var;
                                ((FrameLayout) yb0Var.fragmentView).addView(jh0Var, w7.b6.c(-1.0f, -1));
                                org.telegram.ui.Components.jh0 jh0Var2 = yb0Var.P;
                                jh0Var2.r = false;
                                AnimatorSet animatorSet = jh0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    jh0Var2.s = null;
                                }
                                org.telegram.ui.Components.fh0 fh0Var2 = jh0Var2.w;
                                Point point = org.telegram.messenger.i0.q;
                                fh0Var2.measure(View.MeasureSpec.makeMeasureSpec((jh0Var2.y * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                                if (jh0Var2.r) {
                                    z12 = true;
                                } else {
                                    fh0Var2.setVisibility(0);
                                    if (jh0Var2.x) {
                                        jh0Var2.setLayerType(2, null);
                                    }
                                    fh0Var2.setTranslationY(fh0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    jh0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(fh0Var2, (Property<org.telegram.ui.Components.fh0, Float>) View.TRANSLATION_Y, 0.0f));
                                    jh0Var2.s.setDuration(400L);
                                    jh0Var2.s.setStartDelay(20L);
                                    jh0Var2.s.setInterpolator(jh0Var2.F);
                                    z12 = true;
                                    jh0Var2.s.addListener(new org.telegram.ui.Components.ih0(jh0Var2, 1 == true ? 1 : 0));
                                    org.telegram.messenger.zs.e().k(98, 512);
                                    jh0Var2.s.start();
                                }
                                jh0Var2.c(z12);
                                return;
                            default:
                                try {
                                    TLRPC.GeoPoint geoPoint = yb0Var.J0.k.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    yb0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.f8.g(e10, true);
                                    return;
                                }
                        }
                    }
                });
            }
        }
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        G0(imageView);
        this.a.setImageResource(R.drawable.msg_current_location);
        ImageView imageView2 = this.a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.a;
        int i17 = org.telegram.ui.ActionBar.t6.jj;
        org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView3, i17, resourceProvider, mode);
        this.a.setTag(Integer.valueOf(i17));
        this.a.setContentDescription(org.telegram.messenger.cd.L0(2131754831, null));
        this.Z.addView(this.a, w7.b6.e(58, 58, 85));
        this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.db0
            public final /* synthetic */ yb0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.messenger.ga gaVar;
                boolean z12;
                int i172 = i13;
                int i18 = 3;
                yb0 yb0Var = this.b;
                switch (i172) {
                    case 0:
                        yb0Var.M0(false);
                        yb0Var.R.H(null, yb0Var.F0, true);
                        yb0Var.L0 = true;
                        yb0Var.L0();
                        return;
                    case 1:
                        int i19 = yb0Var.O0;
                        Activity parentActivity = yb0Var.getParentActivity();
                        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (yb0Var.getParentActivity() == null) {
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yb0Var.getParentActivity());
                            int i20 = org.telegram.ui.ActionBar.t6.L5;
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, yb0Var.getThemedColor(i20), null);
                            alertDialog$Builder.n(i20, yb0Var.getResourceProvider());
                            SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131747320, null));
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.T = W2;
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747316, null), new fb0(yb0Var, 1));
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                            yb0Var.showDialog(x1Var);
                            return;
                        }
                        if (yb0Var.k0() || i19 == 3) {
                            if ((yb0Var.J0 == null || i19 == 3) && yb0Var.H0 == null) {
                                if (yb0Var.E0 != null && yb0Var.G != null) {
                                    ImageView imageView4 = yb0Var.a;
                                    int i21 = org.telegram.ui.ActionBar.t6.jj;
                                    org.telegram.ui.ActionBar.a7.t(imageView4, i21, yb0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                    yb0Var.a.setTag(Integer.valueOf(i21));
                                    yb0Var.R.M(null);
                                    yb0Var.K0 = false;
                                    yb0Var.M0(false);
                                    yb0Var.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(new org.telegram.messenger.cb(yb0Var.E0.getLatitude(), yb0Var.E0.getLongitude())));
                                    if (yb0Var.L0 && i19 != 8) {
                                        Location location3 = yb0Var.E0;
                                        if (location3 != null) {
                                            yb0Var.R.H(null, location3, true);
                                        }
                                        yb0Var.L0 = false;
                                        yb0Var.L0();
                                    }
                                }
                            } else if (yb0Var.E0 != null && (gaVar = yb0Var.G) != null) {
                                gaVar.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(yb0Var.E0.getLatitude(), yb0Var.E0.getLongitude()), yb0Var.G.e() - 4.0f));
                            }
                            if (yb0Var.v0 != null) {
                                yb0Var.V.setVisibility(0);
                                ub0 ub0Var = yb0Var.w;
                                org.telegram.messenger.fa faVar = yb0Var.v0;
                                HashMap hashMap = ub0Var.a;
                                View view2 = (View) hashMap.get(faVar);
                                if (view2 != null) {
                                    ub0Var.removeView(view2);
                                    hashMap.remove(faVar);
                                }
                                yb0Var.v0 = null;
                                yb0Var.w0 = null;
                                yb0Var.x0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        yb0Var.r0 = -1L;
                        yb0Var.K0 = true;
                        if (yb0Var.s0()) {
                            yb0Var.s0 = true;
                            yb0Var.N0(false, true);
                            return;
                        }
                        return;
                    case 3:
                        if (yb0Var.getParentActivity() == null || yb0Var.E0 == null || !yb0Var.k0() || yb0Var.G == null) {
                            return;
                        }
                        vh.p2 p2Var = yb0Var.x;
                        if (p2Var != null) {
                            p2Var.e(true);
                        }
                        org.telegram.messenger.vp.d1().edit().putInt("proximityhint", 3).commit();
                        org.telegram.messenger.md h = yb0Var.getLocationController().h(yb0Var.n0);
                        if (yb0Var.E) {
                            yb0Var.D[0].d(1, true);
                        }
                        if (h != null && h.f > 0) {
                            yb0Var.c.setImageResource(R.drawable.msg_location_alert);
                            m4.c cVar = yb0Var.M;
                            if (cVar != null) {
                                cVar.v0();
                                yb0Var.M = null;
                            }
                            yb0Var.E = true;
                            yb0Var.x0().k(0L, 25, 0, null, new cb0(yb0Var, 1), new f70(15, yb0Var, h));
                            return;
                        }
                        m4.c cVar2 = yb0Var.M;
                        if (cVar2 == null) {
                            yb0Var.l0(500);
                        } else {
                            try {
                                s7.f fVar = (s7.f) ((j8.a) cVar2.b).a;
                                Parcel O0 = fVar.O0(fVar.P0(), 6);
                                double readDouble = O0.readDouble();
                                O0.recycle();
                                yb0Var.N = readDouble;
                            } catch (RemoteException e7) {
                                throw new ad.d(e7);
                            }
                        }
                        TLRPC.User Z1 = org.telegram.messenger.o5.E(yb0Var.n0) ? yb0Var.getMessagesController().Z1(Long.valueOf(yb0Var.n0)) : null;
                        Activity parentActivity2 = yb0Var.getParentActivity();
                        fb0 fb0Var = new fb0(yb0Var, i18);
                        rv rvVar = new rv(18, yb0Var, Z1);
                        cb0 cb0Var = new cb0(yb0Var, 4);
                        org.telegram.ui.Components.jh0 jh0Var = new org.telegram.ui.Components.jh0(parentActivity2);
                        jh0Var.a = null;
                        jh0Var.d = -1;
                        jh0Var.e = false;
                        jh0Var.f = false;
                        jh0Var.h = null;
                        jh0Var.n = new Rect();
                        new Paint();
                        jh0Var.x = true;
                        jh0Var.F = org.telegram.ui.Components.gr.h;
                        jh0Var.setWillNotDraw(false);
                        jh0Var.Q = cb0Var;
                        jh0Var.D = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                        Rect rect = new Rect();
                        Drawable mutate = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                        org.telegram.ui.ActionBar.a7.y(jh0Var, mutate, org.telegram.ui.ActionBar.t6.h5, null, PorterDuff.Mode.MULTIPLY);
                        mutate.getPadding(rect);
                        int i22 = rect.left;
                        jh0Var.y = i22;
                        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(jh0Var.getContext());
                        jh0Var.w = fh0Var;
                        fh0Var.setBackgroundDrawable(mutate);
                        fh0Var.setPadding(i22, (org.telegram.messenger.i0.L(8.0f) + rect.top) - 1, i22, 0);
                        fh0Var.setVisibility(4);
                        jh0Var.addView(fh0Var, 0, w7.b6.e(-1, -2, 80));
                        org.telegram.messenger.cd.l();
                        jh0Var.O = org.telegram.messenger.cd.d0.booleanValue();
                        jh0Var.M = Z1;
                        jh0Var.I = fb0Var;
                        org.telegram.ui.Components.ac0 ac0Var = new org.telegram.ui.Components.ac0(parentActivity2, null);
                        jh0Var.G = ac0Var;
                        ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
                        ac0Var.setItemCount(5);
                        org.telegram.ui.Components.ac0 ac0Var2 = new org.telegram.ui.Components.ac0(parentActivity2, null);
                        jh0Var.H = ac0Var2;
                        ac0Var2.setItemCount(5);
                        ac0Var2.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
                        org.telegram.ui.Components.gh0 gh0Var = new org.telegram.ui.Components.gh0(jh0Var, parentActivity2);
                        jh0Var.P = gh0Var;
                        gh0Var.setOrientation(1);
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity2);
                        gh0Var.addView(frameLayout2, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(parentActivity2);
                        textView2.setText(org.telegram.messenger.cd.L0(2131748766, null));
                        org.telegram.messenger.m5.m(textView2, org.telegram.ui.ActionBar.t6.j5, null, 1, 20.0f);
                        frameLayout2.addView(textView2, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new org.telegram.ui.ActionBar.n2(19));
                        LinearLayout linearLayout = new LinearLayout(parentActivity2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        gh0Var.addView(linearLayout, w7.b6.o(-1, -2));
                        System.currentTimeMillis();
                        FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                        TextView textView3 = new TextView(parentActivity2);
                        jh0Var.K = textView3;
                        org.telegram.ui.Components.hh0 hh0Var = new org.telegram.ui.Components.hh0(parentActivity2);
                        jh0Var.J = hh0Var;
                        linearLayout.addView(ac0Var, w7.b6.l(0.5f, 0, org.telegram.messenger.zs.t4));
                        ac0Var.setFormatter(new org.telegram.ui.Components.eh0(jh0Var, 0));
                        ac0Var.setMinValue(0);
                        ac0Var.setMaxValue(10);
                        ac0Var.setWrapSelectorWheel(false);
                        ac0Var.setTextOffset(org.telegram.messenger.i0.L(20.0f));
                        org.telegram.ui.Components.eh0 eh0Var = new org.telegram.ui.Components.eh0(jh0Var, 1);
                        ac0Var.setOnValueChangedListener(eh0Var);
                        ac0Var2.setMinValue(0);
                        ac0Var2.setMaxValue(10);
                        ac0Var2.setWrapSelectorWheel(false);
                        ac0Var2.setTextOffset(-org.telegram.messenger.i0.L(20.0f));
                        linearLayout.addView(ac0Var2, w7.b6.l(0.5f, 0, org.telegram.messenger.zs.t4));
                        ac0Var2.setFormatter(new org.telegram.ui.Components.eh0(jh0Var, 2));
                        ac0Var2.setOnValueChangedListener(eh0Var);
                        ac0Var.setValue(0);
                        ac0Var2.setValue(6);
                        gh0Var.addView(frameLayout3, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                        hh0Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                        hh0Var.setGravity(17);
                        org.telegram.ui.ActionBar.a7.V(hh0Var, org.telegram.ui.ActionBar.t6.Gi, null);
                        hh0Var.setTextSize(1, 14.0f);
                        hh0Var.setMaxLines(2);
                        hh0Var.setTypeface(org.telegram.messenger.i0.o());
                        hh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 4.0f));
                        frameLayout3.addView(hh0Var, w7.b6.c(48.0f, -1));
                        hh0Var.setOnClickListener(new org.telegram.ui.Components.sr(12, jh0Var, rvVar));
                        textView3.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                        textView3.setGravity(17);
                        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.q5, null);
                        textView3.setTextSize(1, 14.0f);
                        textView3.setAlpha(0.0f);
                        textView3.setScaleX(0.5f);
                        textView3.setScaleY(0.5f);
                        frameLayout3.addView(textView3, w7.b6.c(48.0f, -1));
                        fh0Var.addView(gh0Var, w7.b6.e(-1, -2, 51));
                        yb0Var.P = jh0Var;
                        ((FrameLayout) yb0Var.fragmentView).addView(jh0Var, w7.b6.c(-1.0f, -1));
                        org.telegram.ui.Components.jh0 jh0Var2 = yb0Var.P;
                        jh0Var2.r = false;
                        AnimatorSet animatorSet = jh0Var2.s;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            jh0Var2.s = null;
                        }
                        org.telegram.ui.Components.fh0 fh0Var2 = jh0Var2.w;
                        Point point = org.telegram.messenger.i0.q;
                        fh0Var2.measure(View.MeasureSpec.makeMeasureSpec((jh0Var2.y * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        if (jh0Var2.r) {
                            z12 = true;
                        } else {
                            fh0Var2.setVisibility(0);
                            if (jh0Var2.x) {
                                jh0Var2.setLayerType(2, null);
                            }
                            fh0Var2.setTranslationY(fh0Var2.getMeasuredHeight());
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            jh0Var2.s = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(fh0Var2, (Property<org.telegram.ui.Components.fh0, Float>) View.TRANSLATION_Y, 0.0f));
                            jh0Var2.s.setDuration(400L);
                            jh0Var2.s.setStartDelay(20L);
                            jh0Var2.s.setInterpolator(jh0Var2.F);
                            z12 = true;
                            jh0Var2.s.addListener(new org.telegram.ui.Components.ih0(jh0Var2, 1 == true ? 1 : 0));
                            org.telegram.messenger.zs.e().k(98, 512);
                            jh0Var2.s.start();
                        }
                        jh0Var2.c(z12);
                        return;
                    default:
                        try {
                            TLRPC.GeoPoint geoPoint = yb0Var.J0.k.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            yb0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.f8.g(e10, true);
                            return;
                        }
                }
            }
        });
        TextView textView2 = new TextView(context);
        this.b = textView2;
        G0(textView2);
        this.b.setGravity(17);
        this.b.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.a7.V(this.b, org.telegram.ui.ActionBar.t6.Ci, this.resourceProvider);
        this.b.setTypeface(org.telegram.messenger.i0.o());
        this.b.setPadding(org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
        this.b.setText(org.telegram.messenger.cd.L0(2131748755, null));
        this.Z.addView(this.b, w7.b6.e(-2, 58, 81));
        final int i18 = 2;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.db0
            public final /* synthetic */ yb0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.messenger.ga gaVar;
                boolean z12;
                int i172 = i18;
                int i182 = 3;
                yb0 yb0Var = this.b;
                switch (i172) {
                    case 0:
                        yb0Var.M0(false);
                        yb0Var.R.H(null, yb0Var.F0, true);
                        yb0Var.L0 = true;
                        yb0Var.L0();
                        return;
                    case 1:
                        int i19 = yb0Var.O0;
                        Activity parentActivity = yb0Var.getParentActivity();
                        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (yb0Var.getParentActivity() == null) {
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yb0Var.getParentActivity());
                            int i20 = org.telegram.ui.ActionBar.t6.L5;
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, yb0Var.getThemedColor(i20), null);
                            alertDialog$Builder.n(i20, yb0Var.getResourceProvider());
                            SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131747320, null));
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.T = W2;
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747316, null), new fb0(yb0Var, 1));
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                            yb0Var.showDialog(x1Var);
                            return;
                        }
                        if (yb0Var.k0() || i19 == 3) {
                            if ((yb0Var.J0 == null || i19 == 3) && yb0Var.H0 == null) {
                                if (yb0Var.E0 != null && yb0Var.G != null) {
                                    ImageView imageView4 = yb0Var.a;
                                    int i21 = org.telegram.ui.ActionBar.t6.jj;
                                    org.telegram.ui.ActionBar.a7.t(imageView4, i21, yb0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                    yb0Var.a.setTag(Integer.valueOf(i21));
                                    yb0Var.R.M(null);
                                    yb0Var.K0 = false;
                                    yb0Var.M0(false);
                                    yb0Var.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(new org.telegram.messenger.cb(yb0Var.E0.getLatitude(), yb0Var.E0.getLongitude())));
                                    if (yb0Var.L0 && i19 != 8) {
                                        Location location3 = yb0Var.E0;
                                        if (location3 != null) {
                                            yb0Var.R.H(null, location3, true);
                                        }
                                        yb0Var.L0 = false;
                                        yb0Var.L0();
                                    }
                                }
                            } else if (yb0Var.E0 != null && (gaVar = yb0Var.G) != null) {
                                gaVar.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(yb0Var.E0.getLatitude(), yb0Var.E0.getLongitude()), yb0Var.G.e() - 4.0f));
                            }
                            if (yb0Var.v0 != null) {
                                yb0Var.V.setVisibility(0);
                                ub0 ub0Var = yb0Var.w;
                                org.telegram.messenger.fa faVar = yb0Var.v0;
                                HashMap hashMap = ub0Var.a;
                                View view2 = (View) hashMap.get(faVar);
                                if (view2 != null) {
                                    ub0Var.removeView(view2);
                                    hashMap.remove(faVar);
                                }
                                yb0Var.v0 = null;
                                yb0Var.w0 = null;
                                yb0Var.x0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        yb0Var.r0 = -1L;
                        yb0Var.K0 = true;
                        if (yb0Var.s0()) {
                            yb0Var.s0 = true;
                            yb0Var.N0(false, true);
                            return;
                        }
                        return;
                    case 3:
                        if (yb0Var.getParentActivity() == null || yb0Var.E0 == null || !yb0Var.k0() || yb0Var.G == null) {
                            return;
                        }
                        vh.p2 p2Var = yb0Var.x;
                        if (p2Var != null) {
                            p2Var.e(true);
                        }
                        org.telegram.messenger.vp.d1().edit().putInt("proximityhint", 3).commit();
                        org.telegram.messenger.md h = yb0Var.getLocationController().h(yb0Var.n0);
                        if (yb0Var.E) {
                            yb0Var.D[0].d(1, true);
                        }
                        if (h != null && h.f > 0) {
                            yb0Var.c.setImageResource(R.drawable.msg_location_alert);
                            m4.c cVar = yb0Var.M;
                            if (cVar != null) {
                                cVar.v0();
                                yb0Var.M = null;
                            }
                            yb0Var.E = true;
                            yb0Var.x0().k(0L, 25, 0, null, new cb0(yb0Var, 1), new f70(15, yb0Var, h));
                            return;
                        }
                        m4.c cVar2 = yb0Var.M;
                        if (cVar2 == null) {
                            yb0Var.l0(500);
                        } else {
                            try {
                                s7.f fVar = (s7.f) ((j8.a) cVar2.b).a;
                                Parcel O0 = fVar.O0(fVar.P0(), 6);
                                double readDouble = O0.readDouble();
                                O0.recycle();
                                yb0Var.N = readDouble;
                            } catch (RemoteException e7) {
                                throw new ad.d(e7);
                            }
                        }
                        TLRPC.User Z1 = org.telegram.messenger.o5.E(yb0Var.n0) ? yb0Var.getMessagesController().Z1(Long.valueOf(yb0Var.n0)) : null;
                        Activity parentActivity2 = yb0Var.getParentActivity();
                        fb0 fb0Var = new fb0(yb0Var, i182);
                        rv rvVar = new rv(18, yb0Var, Z1);
                        cb0 cb0Var = new cb0(yb0Var, 4);
                        org.telegram.ui.Components.jh0 jh0Var = new org.telegram.ui.Components.jh0(parentActivity2);
                        jh0Var.a = null;
                        jh0Var.d = -1;
                        jh0Var.e = false;
                        jh0Var.f = false;
                        jh0Var.h = null;
                        jh0Var.n = new Rect();
                        new Paint();
                        jh0Var.x = true;
                        jh0Var.F = org.telegram.ui.Components.gr.h;
                        jh0Var.setWillNotDraw(false);
                        jh0Var.Q = cb0Var;
                        jh0Var.D = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                        Rect rect = new Rect();
                        Drawable mutate = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                        org.telegram.ui.ActionBar.a7.y(jh0Var, mutate, org.telegram.ui.ActionBar.t6.h5, null, PorterDuff.Mode.MULTIPLY);
                        mutate.getPadding(rect);
                        int i22 = rect.left;
                        jh0Var.y = i22;
                        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(jh0Var.getContext());
                        jh0Var.w = fh0Var;
                        fh0Var.setBackgroundDrawable(mutate);
                        fh0Var.setPadding(i22, (org.telegram.messenger.i0.L(8.0f) + rect.top) - 1, i22, 0);
                        fh0Var.setVisibility(4);
                        jh0Var.addView(fh0Var, 0, w7.b6.e(-1, -2, 80));
                        org.telegram.messenger.cd.l();
                        jh0Var.O = org.telegram.messenger.cd.d0.booleanValue();
                        jh0Var.M = Z1;
                        jh0Var.I = fb0Var;
                        org.telegram.ui.Components.ac0 ac0Var = new org.telegram.ui.Components.ac0(parentActivity2, null);
                        jh0Var.G = ac0Var;
                        ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
                        ac0Var.setItemCount(5);
                        org.telegram.ui.Components.ac0 ac0Var2 = new org.telegram.ui.Components.ac0(parentActivity2, null);
                        jh0Var.H = ac0Var2;
                        ac0Var2.setItemCount(5);
                        ac0Var2.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
                        org.telegram.ui.Components.gh0 gh0Var = new org.telegram.ui.Components.gh0(jh0Var, parentActivity2);
                        jh0Var.P = gh0Var;
                        gh0Var.setOrientation(1);
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity2);
                        gh0Var.addView(frameLayout2, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView22 = new TextView(parentActivity2);
                        textView22.setText(org.telegram.messenger.cd.L0(2131748766, null));
                        org.telegram.messenger.m5.m(textView22, org.telegram.ui.ActionBar.t6.j5, null, 1, 20.0f);
                        frameLayout2.addView(textView22, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView22.setOnTouchListener(new org.telegram.ui.ActionBar.n2(19));
                        LinearLayout linearLayout = new LinearLayout(parentActivity2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        gh0Var.addView(linearLayout, w7.b6.o(-1, -2));
                        System.currentTimeMillis();
                        FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                        TextView textView3 = new TextView(parentActivity2);
                        jh0Var.K = textView3;
                        org.telegram.ui.Components.hh0 hh0Var = new org.telegram.ui.Components.hh0(parentActivity2);
                        jh0Var.J = hh0Var;
                        linearLayout.addView(ac0Var, w7.b6.l(0.5f, 0, org.telegram.messenger.zs.t4));
                        ac0Var.setFormatter(new org.telegram.ui.Components.eh0(jh0Var, 0));
                        ac0Var.setMinValue(0);
                        ac0Var.setMaxValue(10);
                        ac0Var.setWrapSelectorWheel(false);
                        ac0Var.setTextOffset(org.telegram.messenger.i0.L(20.0f));
                        org.telegram.ui.Components.eh0 eh0Var = new org.telegram.ui.Components.eh0(jh0Var, 1);
                        ac0Var.setOnValueChangedListener(eh0Var);
                        ac0Var2.setMinValue(0);
                        ac0Var2.setMaxValue(10);
                        ac0Var2.setWrapSelectorWheel(false);
                        ac0Var2.setTextOffset(-org.telegram.messenger.i0.L(20.0f));
                        linearLayout.addView(ac0Var2, w7.b6.l(0.5f, 0, org.telegram.messenger.zs.t4));
                        ac0Var2.setFormatter(new org.telegram.ui.Components.eh0(jh0Var, 2));
                        ac0Var2.setOnValueChangedListener(eh0Var);
                        ac0Var.setValue(0);
                        ac0Var2.setValue(6);
                        gh0Var.addView(frameLayout3, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                        hh0Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                        hh0Var.setGravity(17);
                        org.telegram.ui.ActionBar.a7.V(hh0Var, org.telegram.ui.ActionBar.t6.Gi, null);
                        hh0Var.setTextSize(1, 14.0f);
                        hh0Var.setMaxLines(2);
                        hh0Var.setTypeface(org.telegram.messenger.i0.o());
                        hh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 4.0f));
                        frameLayout3.addView(hh0Var, w7.b6.c(48.0f, -1));
                        hh0Var.setOnClickListener(new org.telegram.ui.Components.sr(12, jh0Var, rvVar));
                        textView3.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                        textView3.setGravity(17);
                        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.q5, null);
                        textView3.setTextSize(1, 14.0f);
                        textView3.setAlpha(0.0f);
                        textView3.setScaleX(0.5f);
                        textView3.setScaleY(0.5f);
                        frameLayout3.addView(textView3, w7.b6.c(48.0f, -1));
                        fh0Var.addView(gh0Var, w7.b6.e(-1, -2, 51));
                        yb0Var.P = jh0Var;
                        ((FrameLayout) yb0Var.fragmentView).addView(jh0Var, w7.b6.c(-1.0f, -1));
                        org.telegram.ui.Components.jh0 jh0Var2 = yb0Var.P;
                        jh0Var2.r = false;
                        AnimatorSet animatorSet = jh0Var2.s;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            jh0Var2.s = null;
                        }
                        org.telegram.ui.Components.fh0 fh0Var2 = jh0Var2.w;
                        Point point = org.telegram.messenger.i0.q;
                        fh0Var2.measure(View.MeasureSpec.makeMeasureSpec((jh0Var2.y * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        if (jh0Var2.r) {
                            z12 = true;
                        } else {
                            fh0Var2.setVisibility(0);
                            if (jh0Var2.x) {
                                jh0Var2.setLayerType(2, null);
                            }
                            fh0Var2.setTranslationY(fh0Var2.getMeasuredHeight());
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            jh0Var2.s = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(fh0Var2, (Property<org.telegram.ui.Components.fh0, Float>) View.TRANSLATION_Y, 0.0f));
                            jh0Var2.s.setDuration(400L);
                            jh0Var2.s.setStartDelay(20L);
                            jh0Var2.s.setInterpolator(jh0Var2.F);
                            z12 = true;
                            jh0Var2.s.addListener(new org.telegram.ui.Components.ih0(jh0Var2, 1 == true ? 1 : 0));
                            org.telegram.messenger.zs.e().k(98, 512);
                            jh0Var2.s.start();
                        }
                        jh0Var2.c(z12);
                        return;
                    default:
                        try {
                            TLRPC.GeoPoint geoPoint = yb0Var.J0.k.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            yb0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.f8.g(e10, true);
                            return;
                        }
                }
            }
        });
        N0(false, false);
        ImageView imageView4 = new ImageView(context);
        this.c = imageView4;
        G0(imageView4);
        org.telegram.ui.ActionBar.a7.t(this.c, org.telegram.ui.ActionBar.t6.ij, getResourceProvider(), mode);
        this.c.setScaleType(scaleType);
        this.c.setContentDescription(org.telegram.messenger.cd.L0(2131754847, null));
        this.Y.addView(this.c, w7.b6.e(58, 58, 53));
        final int i19 = 3;
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.db0
            public final /* synthetic */ yb0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.messenger.ga gaVar;
                boolean z12;
                int i172 = i19;
                int i182 = 3;
                yb0 yb0Var = this.b;
                switch (i172) {
                    case 0:
                        yb0Var.M0(false);
                        yb0Var.R.H(null, yb0Var.F0, true);
                        yb0Var.L0 = true;
                        yb0Var.L0();
                        return;
                    case 1:
                        int i192 = yb0Var.O0;
                        Activity parentActivity = yb0Var.getParentActivity();
                        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (yb0Var.getParentActivity() == null) {
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yb0Var.getParentActivity());
                            int i20 = org.telegram.ui.ActionBar.t6.L5;
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, yb0Var.getThemedColor(i20), null);
                            alertDialog$Builder.n(i20, yb0Var.getResourceProvider());
                            SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131747320, null));
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.T = W2;
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747316, null), new fb0(yb0Var, 1));
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                            yb0Var.showDialog(x1Var);
                            return;
                        }
                        if (yb0Var.k0() || i192 == 3) {
                            if ((yb0Var.J0 == null || i192 == 3) && yb0Var.H0 == null) {
                                if (yb0Var.E0 != null && yb0Var.G != null) {
                                    ImageView imageView42 = yb0Var.a;
                                    int i21 = org.telegram.ui.ActionBar.t6.jj;
                                    org.telegram.ui.ActionBar.a7.t(imageView42, i21, yb0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                    yb0Var.a.setTag(Integer.valueOf(i21));
                                    yb0Var.R.M(null);
                                    yb0Var.K0 = false;
                                    yb0Var.M0(false);
                                    yb0Var.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(new org.telegram.messenger.cb(yb0Var.E0.getLatitude(), yb0Var.E0.getLongitude())));
                                    if (yb0Var.L0 && i192 != 8) {
                                        Location location3 = yb0Var.E0;
                                        if (location3 != null) {
                                            yb0Var.R.H(null, location3, true);
                                        }
                                        yb0Var.L0 = false;
                                        yb0Var.L0();
                                    }
                                }
                            } else if (yb0Var.E0 != null && (gaVar = yb0Var.G) != null) {
                                gaVar.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(yb0Var.E0.getLatitude(), yb0Var.E0.getLongitude()), yb0Var.G.e() - 4.0f));
                            }
                            if (yb0Var.v0 != null) {
                                yb0Var.V.setVisibility(0);
                                ub0 ub0Var = yb0Var.w;
                                org.telegram.messenger.fa faVar = yb0Var.v0;
                                HashMap hashMap = ub0Var.a;
                                View view2 = (View) hashMap.get(faVar);
                                if (view2 != null) {
                                    ub0Var.removeView(view2);
                                    hashMap.remove(faVar);
                                }
                                yb0Var.v0 = null;
                                yb0Var.w0 = null;
                                yb0Var.x0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        yb0Var.r0 = -1L;
                        yb0Var.K0 = true;
                        if (yb0Var.s0()) {
                            yb0Var.s0 = true;
                            yb0Var.N0(false, true);
                            return;
                        }
                        return;
                    case 3:
                        if (yb0Var.getParentActivity() == null || yb0Var.E0 == null || !yb0Var.k0() || yb0Var.G == null) {
                            return;
                        }
                        vh.p2 p2Var = yb0Var.x;
                        if (p2Var != null) {
                            p2Var.e(true);
                        }
                        org.telegram.messenger.vp.d1().edit().putInt("proximityhint", 3).commit();
                        org.telegram.messenger.md h = yb0Var.getLocationController().h(yb0Var.n0);
                        if (yb0Var.E) {
                            yb0Var.D[0].d(1, true);
                        }
                        if (h != null && h.f > 0) {
                            yb0Var.c.setImageResource(R.drawable.msg_location_alert);
                            m4.c cVar = yb0Var.M;
                            if (cVar != null) {
                                cVar.v0();
                                yb0Var.M = null;
                            }
                            yb0Var.E = true;
                            yb0Var.x0().k(0L, 25, 0, null, new cb0(yb0Var, 1), new f70(15, yb0Var, h));
                            return;
                        }
                        m4.c cVar2 = yb0Var.M;
                        if (cVar2 == null) {
                            yb0Var.l0(500);
                        } else {
                            try {
                                s7.f fVar = (s7.f) ((j8.a) cVar2.b).a;
                                Parcel O0 = fVar.O0(fVar.P0(), 6);
                                double readDouble = O0.readDouble();
                                O0.recycle();
                                yb0Var.N = readDouble;
                            } catch (RemoteException e7) {
                                throw new ad.d(e7);
                            }
                        }
                        TLRPC.User Z1 = org.telegram.messenger.o5.E(yb0Var.n0) ? yb0Var.getMessagesController().Z1(Long.valueOf(yb0Var.n0)) : null;
                        Activity parentActivity2 = yb0Var.getParentActivity();
                        fb0 fb0Var = new fb0(yb0Var, i182);
                        rv rvVar = new rv(18, yb0Var, Z1);
                        cb0 cb0Var = new cb0(yb0Var, 4);
                        org.telegram.ui.Components.jh0 jh0Var = new org.telegram.ui.Components.jh0(parentActivity2);
                        jh0Var.a = null;
                        jh0Var.d = -1;
                        jh0Var.e = false;
                        jh0Var.f = false;
                        jh0Var.h = null;
                        jh0Var.n = new Rect();
                        new Paint();
                        jh0Var.x = true;
                        jh0Var.F = org.telegram.ui.Components.gr.h;
                        jh0Var.setWillNotDraw(false);
                        jh0Var.Q = cb0Var;
                        jh0Var.D = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                        Rect rect = new Rect();
                        Drawable mutate = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                        org.telegram.ui.ActionBar.a7.y(jh0Var, mutate, org.telegram.ui.ActionBar.t6.h5, null, PorterDuff.Mode.MULTIPLY);
                        mutate.getPadding(rect);
                        int i22 = rect.left;
                        jh0Var.y = i22;
                        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(jh0Var.getContext());
                        jh0Var.w = fh0Var;
                        fh0Var.setBackgroundDrawable(mutate);
                        fh0Var.setPadding(i22, (org.telegram.messenger.i0.L(8.0f) + rect.top) - 1, i22, 0);
                        fh0Var.setVisibility(4);
                        jh0Var.addView(fh0Var, 0, w7.b6.e(-1, -2, 80));
                        org.telegram.messenger.cd.l();
                        jh0Var.O = org.telegram.messenger.cd.d0.booleanValue();
                        jh0Var.M = Z1;
                        jh0Var.I = fb0Var;
                        org.telegram.ui.Components.ac0 ac0Var = new org.telegram.ui.Components.ac0(parentActivity2, null);
                        jh0Var.G = ac0Var;
                        ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
                        ac0Var.setItemCount(5);
                        org.telegram.ui.Components.ac0 ac0Var2 = new org.telegram.ui.Components.ac0(parentActivity2, null);
                        jh0Var.H = ac0Var2;
                        ac0Var2.setItemCount(5);
                        ac0Var2.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
                        org.telegram.ui.Components.gh0 gh0Var = new org.telegram.ui.Components.gh0(jh0Var, parentActivity2);
                        jh0Var.P = gh0Var;
                        gh0Var.setOrientation(1);
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity2);
                        gh0Var.addView(frameLayout2, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView22 = new TextView(parentActivity2);
                        textView22.setText(org.telegram.messenger.cd.L0(2131748766, null));
                        org.telegram.messenger.m5.m(textView22, org.telegram.ui.ActionBar.t6.j5, null, 1, 20.0f);
                        frameLayout2.addView(textView22, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView22.setOnTouchListener(new org.telegram.ui.ActionBar.n2(19));
                        LinearLayout linearLayout = new LinearLayout(parentActivity2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        gh0Var.addView(linearLayout, w7.b6.o(-1, -2));
                        System.currentTimeMillis();
                        FrameLayout frameLayout3 = new FrameLayout(parentActivity2);
                        TextView textView3 = new TextView(parentActivity2);
                        jh0Var.K = textView3;
                        org.telegram.ui.Components.hh0 hh0Var = new org.telegram.ui.Components.hh0(parentActivity2);
                        jh0Var.J = hh0Var;
                        linearLayout.addView(ac0Var, w7.b6.l(0.5f, 0, org.telegram.messenger.zs.t4));
                        ac0Var.setFormatter(new org.telegram.ui.Components.eh0(jh0Var, 0));
                        ac0Var.setMinValue(0);
                        ac0Var.setMaxValue(10);
                        ac0Var.setWrapSelectorWheel(false);
                        ac0Var.setTextOffset(org.telegram.messenger.i0.L(20.0f));
                        org.telegram.ui.Components.eh0 eh0Var = new org.telegram.ui.Components.eh0(jh0Var, 1);
                        ac0Var.setOnValueChangedListener(eh0Var);
                        ac0Var2.setMinValue(0);
                        ac0Var2.setMaxValue(10);
                        ac0Var2.setWrapSelectorWheel(false);
                        ac0Var2.setTextOffset(-org.telegram.messenger.i0.L(20.0f));
                        linearLayout.addView(ac0Var2, w7.b6.l(0.5f, 0, org.telegram.messenger.zs.t4));
                        ac0Var2.setFormatter(new org.telegram.ui.Components.eh0(jh0Var, 2));
                        ac0Var2.setOnValueChangedListener(eh0Var);
                        ac0Var.setValue(0);
                        ac0Var2.setValue(6);
                        gh0Var.addView(frameLayout3, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                        hh0Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                        hh0Var.setGravity(17);
                        org.telegram.ui.ActionBar.a7.V(hh0Var, org.telegram.ui.ActionBar.t6.Gi, null);
                        hh0Var.setTextSize(1, 14.0f);
                        hh0Var.setMaxLines(2);
                        hh0Var.setTypeface(org.telegram.messenger.i0.o());
                        hh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 4.0f));
                        frameLayout3.addView(hh0Var, w7.b6.c(48.0f, -1));
                        hh0Var.setOnClickListener(new org.telegram.ui.Components.sr(12, jh0Var, rvVar));
                        textView3.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                        textView3.setGravity(17);
                        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.q5, null);
                        textView3.setTextSize(1, 14.0f);
                        textView3.setAlpha(0.0f);
                        textView3.setScaleX(0.5f);
                        textView3.setScaleY(0.5f);
                        frameLayout3.addView(textView3, w7.b6.c(48.0f, -1));
                        fh0Var.addView(gh0Var, w7.b6.e(-1, -2, 51));
                        yb0Var.P = jh0Var;
                        ((FrameLayout) yb0Var.fragmentView).addView(jh0Var, w7.b6.c(-1.0f, -1));
                        org.telegram.ui.Components.jh0 jh0Var2 = yb0Var.P;
                        jh0Var2.r = false;
                        AnimatorSet animatorSet = jh0Var2.s;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            jh0Var2.s = null;
                        }
                        org.telegram.ui.Components.fh0 fh0Var2 = jh0Var2.w;
                        Point point = org.telegram.messenger.i0.q;
                        fh0Var2.measure(View.MeasureSpec.makeMeasureSpec((jh0Var2.y * 2) + point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        if (jh0Var2.r) {
                            z12 = true;
                        } else {
                            fh0Var2.setVisibility(0);
                            if (jh0Var2.x) {
                                jh0Var2.setLayerType(2, null);
                            }
                            fh0Var2.setTranslationY(fh0Var2.getMeasuredHeight());
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            jh0Var2.s = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(fh0Var2, (Property<org.telegram.ui.Components.fh0, Float>) View.TRANSLATION_Y, 0.0f));
                            jh0Var2.s.setDuration(400L);
                            jh0Var2.s.setStartDelay(20L);
                            jh0Var2.s.setInterpolator(jh0Var2.F);
                            z12 = true;
                            jh0Var2.s.addListener(new org.telegram.ui.Components.ih0(jh0Var2, 1 == true ? 1 : 0));
                            org.telegram.messenger.zs.e().k(98, 512);
                            jh0Var2.s.start();
                        }
                        jh0Var2.c(z12);
                        return;
                    default:
                        try {
                            TLRPC.GeoPoint geoPoint = yb0Var.J0.k.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            yb0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.f8.g(e10, true);
                            return;
                        }
                }
            }
        });
        TLRPC.Chat L0 = org.telegram.messenger.o5.z(this.n0) ? getMessagesController().L0(Long.valueOf(-this.n0)) : null;
        org.telegram.messenger.jj jjVar6 = this.J0;
        if (jjVar6 != null && jjVar6.C3()) {
            org.telegram.messenger.jj jjVar7 = this.J0;
            int currentTime = getConnectionsManager().getCurrentTime();
            TLRPC.Message message2 = jjVar7.k;
            if (message2.date + org.telegram.messenger.jj.o1(message2).period > currentTime && (!org.telegram.messenger.w3.T(L0) || L0.megagroup)) {
                org.telegram.messenger.md h = getLocationController().h(this.n0);
                if (h == null || h.f <= 0) {
                    if (org.telegram.messenger.o5.E(this.n0) && this.J0.Z0() == getUserConfig().e()) {
                        this.c.setVisibility(4);
                        this.c.setAlpha(0.0f);
                        this.c.setScaleX(0.4f);
                        this.c.setScaleY(0.4f);
                    }
                    this.c.setImageResource(R.drawable.msg_location_alert);
                } else {
                    this.c.setImageResource(R.drawable.msg_location_alert2);
                }
                vh.p2 p2Var = new vh.p2(context, 1);
                this.x = p2Var;
                p2Var.setLayerType(2, null);
                vh.p2 p2Var2 = this.x;
                p2Var2.d = 4000L;
                p2Var2.l(1.0f, -21.0f);
                this.x.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
                this.Y.addView(this.x, w7.b6.d(-1, -2.0f, 51, 8.0f, 56.0f, 8.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.f = linearLayout;
                linearLayout.setOrientation(1);
                this.f.setGravity(1);
                this.f.setPadding(0, org.telegram.messenger.i0.L(160.0f), 0, 0);
                this.f.setVisibility(8);
                wb0Var.addView(this.f, w7.b6.c(-1.0f, -1));
                this.f.setOnTouchListener(new org.telegram.ui.ActionBar.n2(i13));
                ImageView imageView5 = new ImageView(context);
                this.h = imageView5;
                imageView5.setImageResource(R.drawable.location_empty);
                org.telegram.ui.ActionBar.a7.t(this.h, org.telegram.ui.ActionBar.t6.W5, getResourceProvider(), mode);
                this.f.addView(this.h, w7.b6.o(-2, -2));
                TextView textView3 = new TextView(context);
                this.n = textView3;
                int i20 = org.telegram.ui.ActionBar.t6.X5;
                org.telegram.ui.ActionBar.a7.V(textView3, i20, getResourceProvider());
                this.n.setGravity(17);
                this.n.setTypeface(org.telegram.messenger.i0.o());
                this.n.setTextSize(1, 17.0f);
                this.n.setText(org.telegram.messenger.cd.L0(2131748196, null));
                TextView f7 = org.telegram.messenger.z20.f(this.f, this.n, w7.b6.t(-2, -2, 17, 0, 11, 0, 0), context);
                this.r = f7;
                org.telegram.ui.ActionBar.a7.V(f7, i20, getResourceProvider());
                this.r.setGravity(17);
                this.r.setTextSize(1, 15.0f);
                this.r.setPadding(org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.i0.L(40.0f), 0);
                this.f.addView(this.r, w7.b6.t(-2, -2, 17, 0, 6, 0, 0));
                this.S = new nb0(this, context, i12);
                vg.f c10 = getBaseSimpleGlass().f.c(this.S, null, false);
                wg.d dVar = new wg.d(getResourceProvider());
                dVar.e = new xg.a(5);
                dVar.f(-1, 553648127);
                dVar.e(0, 0);
                dVar.d(372454195, 0);
                float N = org.telegram.messenger.i0.N(8.0f);
                float f10 = -org.telegram.messenger.i0.N(0.6666667f);
                dVar.n = N;
                dVar.r = f10;
                dVar.f = org.telegram.messenger.i0.N(0.55f);
                dVar.h = 0.0f;
                c10.o(dVar);
                c10.r(org.telegram.messenger.i0.L(29.0f), org.telegram.messenger.i0.L(29.0f), 0.0f, 0.0f);
                c10.p(org.telegram.messenger.i0.L(12.0f));
                this.a0 = c10;
                nb0 nb0Var = this.S;
                long j11 = this.n0;
                org.telegram.ui.ActionBar.p6 resourceProvider2 = getResourceProvider();
                boolean z12 = this.y;
                if (i15 != 8) {
                    z10 = z12;
                    z11 = true;
                } else {
                    z10 = z12;
                    z11 = false;
                }
                ob0 ob0Var2 = new ob0(this, context, this.O0, j11, resourceProvider2, z10, z11);
                this.R = ob0Var2;
                nb0Var.setAdapter(ob0Var2);
                nb0 nb0Var2 = this.S;
                s4.a0 a0Var = new s4.a0(1, false);
                this.W = a0Var;
                nb0Var2.setLayoutManager(a0Var);
                if (this.U0 != null) {
                    this.T0 = new org.telegram.ui.Cells.z3(context, this.resourceProvider);
                    qb0 qb0Var = new qb0(this, context, new org.telegram.ui.Components.rt0(this), this, new pb0(this), getResourceProvider());
                    this.S0 = qb0Var;
                    org.telegram.ui.ActionBar.a7.i(i16, qb0Var, getResourceProvider());
                    this.S0.addView(this.T0, w7.b6.e(-1, 32, 55));
                    this.R.h0 = this.S0;
                    this.S.setOverScrollMode(2);
                    s4.j jVar = new s4.j();
                    jVar.m = false;
                    jVar.C = false;
                    jVar.o(org.telegram.ui.Components.gr.h);
                    jVar.n(350L);
                    this.S.setItemAnimator(jVar);
                }
                this.R.P(this.l0, false);
                this.R.getClass();
                this.S.setVerticalScrollBarEnabled(false);
                wb0Var.addView(this.S, w7.b6.e(-1, -1, 51));
                jjVar = this.J0;
                if (jjVar != null && (message = jjVar.k) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
                    ob0 ob0Var3 = this.R;
                    ob0Var3.Q = this.J0.k.media.address;
                    ob0Var3.R();
                }
                this.S.setOnScrollListener(new lb0(this, i13));
                ((s4.j) this.S.getItemAnimator()).C = false;
                this.S.setOnItemLongClickListener(new rv(16, this, context));
                this.S.setOnItemClickListener(new org.telegram.ui.Components.gk0(this) { // from class: org.telegram.ui.eb0
                    public final /* synthetic */ yb0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.Components.gk0
                    public final void f(int i21, View view) {
                        org.telegram.messenger.jj jjVar8;
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                        int i22 = i12;
                        yb0 yb0Var = this.b;
                        switch (i22) {
                            case 0:
                                yb0Var.r0 = -1L;
                                int i23 = yb0Var.O0;
                                int i24 = 7;
                                if (i23 != 4) {
                                    if (i23 != 5) {
                                        if (i21 == 1 && (jjVar8 = yb0Var.J0) != null && (!jjVar8.C3() || i23 == 6)) {
                                            org.telegram.messenger.ga gaVar = yb0Var.G;
                                            if (gaVar != null) {
                                                IMapsProvider k10 = org.telegram.messenger.w0.k();
                                                TLRPC.GeoPoint geoPoint = yb0Var.J0.k.media.geo;
                                                gaVar.b(((t7.u) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint.lat, geoPoint._long), yb0Var.G.e() - 4.0f));
                                                break;
                                            }
                                        } else if (i21 == 1 && i23 != 2) {
                                            if (yb0Var.N0 != null && yb0Var.F0 != null) {
                                                FrameLayout frameLayout2 = yb0Var.x0;
                                                if (frameLayout2 == null) {
                                                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                                    TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                                    tL_messageMediaGeo.geo = tL_geoPoint;
                                                    tL_geoPoint.lat = org.telegram.messenger.i0.b0(yb0Var.F0.getLatitude());
                                                    tL_messageMediaGeo.geo._long = org.telegram.messenger.i0.b0(yb0Var.F0.getLongitude());
                                                    yb0Var.N0.d(tL_messageMediaGeo, yb0Var.O0, true, 0, 0L);
                                                    yb0Var.finishFragment();
                                                    break;
                                                } else {
                                                    frameLayout2.callOnClick();
                                                    break;
                                                }
                                            }
                                        } else if (i23 != 2 || !yb0Var.getLocationController().i(yb0Var.n0) || yb0Var.R.d(i21) != 7) {
                                            if (i23 != 2 || !yb0Var.getLocationController().i(yb0Var.n0) || yb0Var.R.d(i21) != 6) {
                                                if ((i21 != 2 || i23 != 1) && ((i21 != 1 || i23 != 2) && (i21 != 3 || i23 != 3))) {
                                                    Object J = yb0Var.R.J(i21);
                                                    if (!(J instanceof TLRPC.TL_messageMediaVenue)) {
                                                        if (J instanceof sb0) {
                                                            sb0 sb0Var = (sb0) J;
                                                            yb0Var.r0 = sb0Var.a;
                                                            if (yb0Var.s0) {
                                                                yb0Var.s0 = false;
                                                                yb0Var.R0();
                                                            }
                                                            yb0Var.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(sb0Var.e.a(), yb0Var.G.e() - 4.0f));
                                                            break;
                                                        }
                                                    } else {
                                                        yb0Var.N0.d((TLRPC.TL_messageMediaVenue) J, yb0Var.O0, true, 0, 0L);
                                                        yb0Var.finishFragment();
                                                        break;
                                                    }
                                                } else if (!yb0Var.getLocationController().i(yb0Var.n0)) {
                                                    yb0Var.D0(false);
                                                    break;
                                                } else {
                                                    yb0Var.getLocationController().k(yb0Var.n0);
                                                    yb0Var.R.f();
                                                    yb0Var.finishFragment();
                                                    break;
                                                }
                                            } else {
                                                yb0Var.D0(yb0Var.getLocationController().h(yb0Var.n0).d != Integer.MAX_VALUE);
                                                break;
                                            }
                                        } else {
                                            yb0Var.getLocationController().k(yb0Var.n0);
                                            yb0Var.R.f();
                                            yb0Var.finishFragment();
                                            break;
                                        }
                                    } else {
                                        org.telegram.messenger.ga gaVar2 = yb0Var.G;
                                        if (gaVar2 != null) {
                                            IMapsProvider k11 = org.telegram.messenger.w0.k();
                                            TLRPC.GeoPoint geoPoint2 = yb0Var.H0.geo_point;
                                            gaVar2.b(((t7.u) k11).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint2.lat, geoPoint2._long), yb0Var.G.e() - 4.0f));
                                            break;
                                        }
                                    }
                                } else if (i21 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) yb0Var.R.J(i21)) != null) {
                                    if (yb0Var.n0 != 0) {
                                        org.telegram.ui.ActionBar.x1[] x1VarArr = {new org.telegram.ui.ActionBar.x1(3, yb0Var.getParentActivity(), null)};
                                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                        tL_channels_editLocation.channel = yb0Var.getMessagesController().g1(-yb0Var.n0);
                                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                        TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                        tL_inputGeoPoint.lat = geoPoint3.lat;
                                        tL_inputGeoPoint._long = geoPoint3._long;
                                        x1VarArr[0].setOnCancelListener(new ba(yb0Var, yb0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new aa(yb0Var, x1VarArr, tL_messageMediaVenue, 19)), i24));
                                        yb0Var.showDialog(x1VarArr[0]);
                                        break;
                                    } else {
                                        yb0Var.N0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                                        yb0Var.finishFragment();
                                        break;
                                    }
                                }
                                break;
                            default:
                                yb0.a0(yb0Var, i21);
                                break;
                        }
                    }
                });
                ob0 ob0Var4 = this.R;
                long j12 = this.n0;
                fb0 fb0Var = new fb0(this, i12);
                ob0Var4.H = j12;
                ob0Var4.D = fb0Var;
                ob0Var4.Q(this.P0);
                wb0Var.addView(this.Q, wb0Var.indexOfChild(this.S), w7.b6.e(-1, -1, 51));
                org.telegram.messenger.za onCreateMapView = ((t7.u) org.telegram.messenger.w0.k()).onCreateMapView(context);
                this.I = onCreateMapView;
                ((fg.i) ((bh.d) onCreateMapView).a).setAlpha(0.0f);
                org.telegram.messenger.za zaVar = this.I;
                bh.d dVar2 = (bh.d) zaVar;
                dVar2.b = new fb0(this, 5);
                dVar2.c = new fb0(this, 6);
                int i21 = 7;
                dVar2.d = new cb0(this, i21);
                new Thread(new hb0(this, zaVar, i13)).start();
                jjVar2 = this.J0;
                if (jjVar2 == null || this.H0 != null) {
                    i10 = i15;
                    if ((jjVar2 != null && !jjVar2.C3()) || this.H0 != null) {
                        tL_channelLocation = this.H0;
                        if (tL_channelLocation != null) {
                            this.R.X = tL_channelLocation;
                        } else {
                            org.telegram.messenger.jj jjVar8 = this.J0;
                            if (jjVar8 != null) {
                                ob0 ob0Var5 = this.R;
                                ob0Var5.W = jjVar8;
                                ob0Var5.f();
                            }
                        }
                    }
                } else {
                    i10 = i15;
                    if (L0 != null) {
                        j10 = 0;
                        if (i10 == 4 && this.n0 != 0) {
                            FrameLayout frameLayout2 = new FrameLayout(context);
                            frameLayout2.setBackgroundResource(R.drawable.livepin);
                            this.Q.addView(frameLayout2, w7.b6.e(62, 76, 49));
                            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
                            g9Var.setRoundRadius(org.telegram.messenger.i0.L(26.0f));
                            g9Var.e(L0, new org.telegram.ui.Components.r8(L0));
                            frameLayout2.addView(g9Var, w7.b6.d(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                            this.V = frameLayout2;
                            frameLayout2.setTag(1);
                        }
                    } else {
                        j10 = 0;
                    }
                    if (this.V == null) {
                        ImageView e7 = org.telegram.messenger.z20.e(context, R.drawable.map_pin2);
                        this.Q.addView(e7, w7.b6.e(28, 48, 49));
                        this.V = e7;
                    }
                    org.telegram.ui.Components.tk0 tk0Var2 = new org.telegram.ui.Components.tk0(context, null);
                    this.T = tk0Var2;
                    tk0Var2.setVisibility(8);
                    this.T.setLayoutManager(new s4.a0(1, false));
                    org.telegram.ui.Components.vk vkVar2 = new org.telegram.ui.Components.vk(this, context, getResourceProvider(), i10 == 8);
                    this.U = vkVar2;
                    fb0 fb0Var2 = new fb0(this, i21);
                    vkVar2.H = j10;
                    vkVar2.D = fb0Var2;
                    wb0Var.addView(this.T, w7.b6.e(-1, -1, 51));
                    this.T.setOnScrollListener(new lb0(this, i12));
                    this.T.setOnItemClickListener(new org.telegram.ui.Components.gk0(this) { // from class: org.telegram.ui.eb0
                        public final /* synthetic */ yb0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.Components.gk0
                        public final void f(int i212, View view) {
                            org.telegram.messenger.jj jjVar82;
                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                            int i22 = i13;
                            yb0 yb0Var = this.b;
                            switch (i22) {
                                case 0:
                                    yb0Var.r0 = -1L;
                                    int i23 = yb0Var.O0;
                                    int i24 = 7;
                                    if (i23 != 4) {
                                        if (i23 != 5) {
                                            if (i212 == 1 && (jjVar82 = yb0Var.J0) != null && (!jjVar82.C3() || i23 == 6)) {
                                                org.telegram.messenger.ga gaVar = yb0Var.G;
                                                if (gaVar != null) {
                                                    IMapsProvider k10 = org.telegram.messenger.w0.k();
                                                    TLRPC.GeoPoint geoPoint = yb0Var.J0.k.media.geo;
                                                    gaVar.b(((t7.u) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint.lat, geoPoint._long), yb0Var.G.e() - 4.0f));
                                                    break;
                                                }
                                            } else if (i212 == 1 && i23 != 2) {
                                                if (yb0Var.N0 != null && yb0Var.F0 != null) {
                                                    FrameLayout frameLayout22 = yb0Var.x0;
                                                    if (frameLayout22 == null) {
                                                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                                        tL_messageMediaGeo.geo = tL_geoPoint;
                                                        tL_geoPoint.lat = org.telegram.messenger.i0.b0(yb0Var.F0.getLatitude());
                                                        tL_messageMediaGeo.geo._long = org.telegram.messenger.i0.b0(yb0Var.F0.getLongitude());
                                                        yb0Var.N0.d(tL_messageMediaGeo, yb0Var.O0, true, 0, 0L);
                                                        yb0Var.finishFragment();
                                                        break;
                                                    } else {
                                                        frameLayout22.callOnClick();
                                                        break;
                                                    }
                                                }
                                            } else if (i23 != 2 || !yb0Var.getLocationController().i(yb0Var.n0) || yb0Var.R.d(i212) != 7) {
                                                if (i23 != 2 || !yb0Var.getLocationController().i(yb0Var.n0) || yb0Var.R.d(i212) != 6) {
                                                    if ((i212 != 2 || i23 != 1) && ((i212 != 1 || i23 != 2) && (i212 != 3 || i23 != 3))) {
                                                        Object J = yb0Var.R.J(i212);
                                                        if (!(J instanceof TLRPC.TL_messageMediaVenue)) {
                                                            if (J instanceof sb0) {
                                                                sb0 sb0Var = (sb0) J;
                                                                yb0Var.r0 = sb0Var.a;
                                                                if (yb0Var.s0) {
                                                                    yb0Var.s0 = false;
                                                                    yb0Var.R0();
                                                                }
                                                                yb0Var.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(sb0Var.e.a(), yb0Var.G.e() - 4.0f));
                                                                break;
                                                            }
                                                        } else {
                                                            yb0Var.N0.d((TLRPC.TL_messageMediaVenue) J, yb0Var.O0, true, 0, 0L);
                                                            yb0Var.finishFragment();
                                                            break;
                                                        }
                                                    } else if (!yb0Var.getLocationController().i(yb0Var.n0)) {
                                                        yb0Var.D0(false);
                                                        break;
                                                    } else {
                                                        yb0Var.getLocationController().k(yb0Var.n0);
                                                        yb0Var.R.f();
                                                        yb0Var.finishFragment();
                                                        break;
                                                    }
                                                } else {
                                                    yb0Var.D0(yb0Var.getLocationController().h(yb0Var.n0).d != Integer.MAX_VALUE);
                                                    break;
                                                }
                                            } else {
                                                yb0Var.getLocationController().k(yb0Var.n0);
                                                yb0Var.R.f();
                                                yb0Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            org.telegram.messenger.ga gaVar2 = yb0Var.G;
                                            if (gaVar2 != null) {
                                                IMapsProvider k11 = org.telegram.messenger.w0.k();
                                                TLRPC.GeoPoint geoPoint2 = yb0Var.H0.geo_point;
                                                gaVar2.b(((t7.u) k11).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint2.lat, geoPoint2._long), yb0Var.G.e() - 4.0f));
                                                break;
                                            }
                                        }
                                    } else if (i212 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) yb0Var.R.J(i212)) != null) {
                                        if (yb0Var.n0 != 0) {
                                            org.telegram.ui.ActionBar.x1[] x1VarArr = {new org.telegram.ui.ActionBar.x1(3, yb0Var.getParentActivity(), null)};
                                            TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                            tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                            tL_channels_editLocation.channel = yb0Var.getMessagesController().g1(-yb0Var.n0);
                                            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                            tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                            TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                            tL_inputGeoPoint.lat = geoPoint3.lat;
                                            tL_inputGeoPoint._long = geoPoint3._long;
                                            x1VarArr[0].setOnCancelListener(new ba(yb0Var, yb0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new aa(yb0Var, x1VarArr, tL_messageMediaVenue, 19)), i24));
                                            yb0Var.showDialog(x1VarArr[0]);
                                            break;
                                        } else {
                                            yb0Var.N0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                                            yb0Var.finishFragment();
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    yb0.a0(yb0Var, i212);
                                    break;
                            }
                        }
                    });
                }
                jjVar3 = this.J0;
                if (jjVar3 != null && i10 == 6) {
                    ob0 ob0Var6 = this.R;
                    ob0Var6.W = jjVar3;
                    ob0Var6.f();
                }
                for (i11 = 0; i11 < 2; i11++) {
                    UndoView undoView = new UndoView(context);
                    UndoView[] undoViewArr = this.D;
                    undoViewArr[i11] = undoView;
                    undoView.setAdditionalTranslationY(org.telegram.messenger.i0.L(10.0f));
                    undoViewArr[i11].setTranslationZ(org.telegram.messenger.i0.L(5.0f));
                    FrameLayout.LayoutParams d = w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                    d.bottomMargin = org.telegram.messenger.i0.L(29.0f) + this.i0 + d.bottomMargin;
                    this.Q.addView(undoViewArr[i11], d);
                }
                if (this.J0 == null && this.H0 == null && this.I0 != null) {
                    this.K0 = true;
                    ImageView imageView6 = this.a;
                    int i22 = org.telegram.ui.ActionBar.t6.ij;
                    org.telegram.ui.ActionBar.a7.t(imageView6, i22, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                    this.a.setTag(Integer.valueOf(i22));
                }
                baseSimpleGlass = getBaseSimpleGlass();
                View view = new View(context);
                this.navigationBarFadeView = view;
                view.setBackground(baseSimpleGlass.b(view));
                wb0Var.addView(this.navigationBarFadeView, w7.b6.e(-1, 0, 80));
                View view2 = this.simpleActionBar;
                org.telegram.ui.ActionBar.p6 resourceProvider3 = getResourceProvider();
                baseSimpleGlass.k = wb0Var;
                baseSimpleGlass.l = null;
                baseSimpleGlass.g(wb0Var, view2, resourceProvider3);
                baseSimpleGlass.m = new sa(this, i13);
                this.simpleActionBar.setBackground(null);
                this.glassEngine.b(this.S);
                tk0Var = this.T;
                if (tk0Var != null) {
                    this.glassEngine.b(tk0Var);
                }
                if (baseSimpleGlass.g != null) {
                    this.f0 = new org.telegram.ui.Components.z80(new cb0(this, 3));
                }
                i0();
                P0();
                return this.fragmentView;
            }
        }
        this.c.setVisibility(8);
        this.c.setImageResource(R.drawable.msg_location_alert);
        vh.p2 p2Var3 = new vh.p2(context, 1);
        this.x = p2Var3;
        p2Var3.setLayerType(2, null);
        vh.p2 p2Var22 = this.x;
        p2Var22.d = 4000L;
        p2Var22.l(1.0f, -21.0f);
        this.x.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
        this.Y.addView(this.x, w7.b6.d(-1, -2.0f, 51, 8.0f, 56.0f, 8.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f.setGravity(1);
        this.f.setPadding(0, org.telegram.messenger.i0.L(160.0f), 0, 0);
        this.f.setVisibility(8);
        wb0Var.addView(this.f, w7.b6.c(-1.0f, -1));
        this.f.setOnTouchListener(new org.telegram.ui.ActionBar.n2(i13));
        ImageView imageView52 = new ImageView(context);
        this.h = imageView52;
        imageView52.setImageResource(R.drawable.location_empty);
        org.telegram.ui.ActionBar.a7.t(this.h, org.telegram.ui.ActionBar.t6.W5, getResourceProvider(), mode);
        this.f.addView(this.h, w7.b6.o(-2, -2));
        TextView textView32 = new TextView(context);
        this.n = textView32;
        int i202 = org.telegram.ui.ActionBar.t6.X5;
        org.telegram.ui.ActionBar.a7.V(textView32, i202, getResourceProvider());
        this.n.setGravity(17);
        this.n.setTypeface(org.telegram.messenger.i0.o());
        this.n.setTextSize(1, 17.0f);
        this.n.setText(org.telegram.messenger.cd.L0(2131748196, null));
        TextView f72 = org.telegram.messenger.z20.f(this.f, this.n, w7.b6.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.r = f72;
        org.telegram.ui.ActionBar.a7.V(f72, i202, getResourceProvider());
        this.r.setGravity(17);
        this.r.setTextSize(1, 15.0f);
        this.r.setPadding(org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.i0.L(40.0f), 0);
        this.f.addView(this.r, w7.b6.t(-2, -2, 17, 0, 6, 0, 0));
        this.S = new nb0(this, context, i12);
        vg.f c102 = getBaseSimpleGlass().f.c(this.S, null, false);
        wg.d dVar3 = new wg.d(getResourceProvider());
        dVar3.e = new xg.a(5);
        dVar3.f(-1, 553648127);
        dVar3.e(0, 0);
        dVar3.d(372454195, 0);
        float N2 = org.telegram.messenger.i0.N(8.0f);
        float f102 = -org.telegram.messenger.i0.N(0.6666667f);
        dVar3.n = N2;
        dVar3.r = f102;
        dVar3.f = org.telegram.messenger.i0.N(0.55f);
        dVar3.h = 0.0f;
        c102.o(dVar3);
        c102.r(org.telegram.messenger.i0.L(29.0f), org.telegram.messenger.i0.L(29.0f), 0.0f, 0.0f);
        c102.p(org.telegram.messenger.i0.L(12.0f));
        this.a0 = c102;
        nb0 nb0Var3 = this.S;
        long j112 = this.n0;
        org.telegram.ui.ActionBar.p6 resourceProvider22 = getResourceProvider();
        boolean z122 = this.y;
        if (i15 != 8) {
        }
        ob0 ob0Var22 = new ob0(this, context, this.O0, j112, resourceProvider22, z10, z11);
        this.R = ob0Var22;
        nb0Var3.setAdapter(ob0Var22);
        nb0 nb0Var22 = this.S;
        s4.a0 a0Var2 = new s4.a0(1, false);
        this.W = a0Var2;
        nb0Var22.setLayoutManager(a0Var2);
        if (this.U0 != null) {
        }
        this.R.P(this.l0, false);
        this.R.getClass();
        this.S.setVerticalScrollBarEnabled(false);
        wb0Var.addView(this.S, w7.b6.e(-1, -1, 51));
        jjVar = this.J0;
        if (jjVar != null) {
            ob0 ob0Var32 = this.R;
            ob0Var32.Q = this.J0.k.media.address;
            ob0Var32.R();
        }
        this.S.setOnScrollListener(new lb0(this, i13));
        ((s4.j) this.S.getItemAnimator()).C = false;
        this.S.setOnItemLongClickListener(new rv(16, this, context));
        this.S.setOnItemClickListener(new org.telegram.ui.Components.gk0(this) { // from class: org.telegram.ui.eb0
            public final /* synthetic */ yb0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.gk0
            public final void f(int i212, View view3) {
                org.telegram.messenger.jj jjVar82;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
                int i222 = i12;
                yb0 yb0Var = this.b;
                switch (i222) {
                    case 0:
                        yb0Var.r0 = -1L;
                        int i23 = yb0Var.O0;
                        int i24 = 7;
                        if (i23 != 4) {
                            if (i23 != 5) {
                                if (i212 == 1 && (jjVar82 = yb0Var.J0) != null && (!jjVar82.C3() || i23 == 6)) {
                                    org.telegram.messenger.ga gaVar = yb0Var.G;
                                    if (gaVar != null) {
                                        IMapsProvider k10 = org.telegram.messenger.w0.k();
                                        TLRPC.GeoPoint geoPoint = yb0Var.J0.k.media.geo;
                                        gaVar.b(((t7.u) k10).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint.lat, geoPoint._long), yb0Var.G.e() - 4.0f));
                                        break;
                                    }
                                } else if (i212 == 1 && i23 != 2) {
                                    if (yb0Var.N0 != null && yb0Var.F0 != null) {
                                        FrameLayout frameLayout22 = yb0Var.x0;
                                        if (frameLayout22 == null) {
                                            TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                            tL_messageMediaGeo.geo = tL_geoPoint;
                                            tL_geoPoint.lat = org.telegram.messenger.i0.b0(yb0Var.F0.getLatitude());
                                            tL_messageMediaGeo.geo._long = org.telegram.messenger.i0.b0(yb0Var.F0.getLongitude());
                                            yb0Var.N0.d(tL_messageMediaGeo, yb0Var.O0, true, 0, 0L);
                                            yb0Var.finishFragment();
                                            break;
                                        } else {
                                            frameLayout22.callOnClick();
                                            break;
                                        }
                                    }
                                } else if (i23 != 2 || !yb0Var.getLocationController().i(yb0Var.n0) || yb0Var.R.d(i212) != 7) {
                                    if (i23 != 2 || !yb0Var.getLocationController().i(yb0Var.n0) || yb0Var.R.d(i212) != 6) {
                                        if ((i212 != 2 || i23 != 1) && ((i212 != 1 || i23 != 2) && (i212 != 3 || i23 != 3))) {
                                            Object J = yb0Var.R.J(i212);
                                            if (!(J instanceof TLRPC.TL_messageMediaVenue)) {
                                                if (J instanceof sb0) {
                                                    sb0 sb0Var = (sb0) J;
                                                    yb0Var.r0 = sb0Var.a;
                                                    if (yb0Var.s0) {
                                                        yb0Var.s0 = false;
                                                        yb0Var.R0();
                                                    }
                                                    yb0Var.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(sb0Var.e.a(), yb0Var.G.e() - 4.0f));
                                                    break;
                                                }
                                            } else {
                                                yb0Var.N0.d((TLRPC.TL_messageMediaVenue) J, yb0Var.O0, true, 0, 0L);
                                                yb0Var.finishFragment();
                                                break;
                                            }
                                        } else if (!yb0Var.getLocationController().i(yb0Var.n0)) {
                                            yb0Var.D0(false);
                                            break;
                                        } else {
                                            yb0Var.getLocationController().k(yb0Var.n0);
                                            yb0Var.R.f();
                                            yb0Var.finishFragment();
                                            break;
                                        }
                                    } else {
                                        yb0Var.D0(yb0Var.getLocationController().h(yb0Var.n0).d != Integer.MAX_VALUE);
                                        break;
                                    }
                                } else {
                                    yb0Var.getLocationController().k(yb0Var.n0);
                                    yb0Var.R.f();
                                    yb0Var.finishFragment();
                                    break;
                                }
                            } else {
                                org.telegram.messenger.ga gaVar2 = yb0Var.G;
                                if (gaVar2 != null) {
                                    IMapsProvider k11 = org.telegram.messenger.w0.k();
                                    TLRPC.GeoPoint geoPoint2 = yb0Var.H0.geo_point;
                                    gaVar2.b(((t7.u) k11).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint2.lat, geoPoint2._long), yb0Var.G.e() - 4.0f));
                                    break;
                                }
                            }
                        } else if (i212 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) yb0Var.R.J(i212)) != null) {
                            if (yb0Var.n0 != 0) {
                                org.telegram.ui.ActionBar.x1[] x1VarArr = {new org.telegram.ui.ActionBar.x1(3, yb0Var.getParentActivity(), null)};
                                TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                                tL_channels_editLocation.address = tL_messageMediaVenue.address;
                                tL_channels_editLocation.channel = yb0Var.getMessagesController().g1(-yb0Var.n0);
                                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                                tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                                TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                                tL_inputGeoPoint.lat = geoPoint3.lat;
                                tL_inputGeoPoint._long = geoPoint3._long;
                                x1VarArr[0].setOnCancelListener(new ba(yb0Var, yb0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new aa(yb0Var, x1VarArr, tL_messageMediaVenue, 19)), i24));
                                yb0Var.showDialog(x1VarArr[0]);
                                break;
                            } else {
                                yb0Var.N0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                                yb0Var.finishFragment();
                                break;
                            }
                        }
                        break;
                    default:
                        yb0.a0(yb0Var, i212);
                        break;
                }
            }
        });
        ob0 ob0Var42 = this.R;
        long j122 = this.n0;
        fb0 fb0Var3 = new fb0(this, i12);
        ob0Var42.H = j122;
        ob0Var42.D = fb0Var3;
        ob0Var42.Q(this.P0);
        wb0Var.addView(this.Q, wb0Var.indexOfChild(this.S), w7.b6.e(-1, -1, 51));
        org.telegram.messenger.za onCreateMapView2 = ((t7.u) org.telegram.messenger.w0.k()).onCreateMapView(context);
        this.I = onCreateMapView2;
        ((fg.i) ((bh.d) onCreateMapView2).a).setAlpha(0.0f);
        org.telegram.messenger.za zaVar2 = this.I;
        bh.d dVar22 = (bh.d) zaVar2;
        dVar22.b = new fb0(this, 5);
        dVar22.c = new fb0(this, 6);
        int i212 = 7;
        dVar22.d = new cb0(this, i212);
        new Thread(new hb0(this, zaVar2, i13)).start();
        jjVar2 = this.J0;
        if (jjVar2 == null) {
        }
        i10 = i15;
        if (jjVar2 != null) {
            tL_channelLocation = this.H0;
            if (tL_channelLocation != null) {
            }
            jjVar3 = this.J0;
            if (jjVar3 != null) {
                ob0 ob0Var62 = this.R;
                ob0Var62.W = jjVar3;
                ob0Var62.f();
            }
            while (i11 < 2) {
            }
            if (this.J0 == null) {
                this.K0 = true;
                ImageView imageView62 = this.a;
                int i222 = org.telegram.ui.ActionBar.t6.ij;
                org.telegram.ui.ActionBar.a7.t(imageView62, i222, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                this.a.setTag(Integer.valueOf(i222));
            }
            baseSimpleGlass = getBaseSimpleGlass();
            View view3 = new View(context);
            this.navigationBarFadeView = view3;
            view3.setBackground(baseSimpleGlass.b(view3));
            wb0Var.addView(this.navigationBarFadeView, w7.b6.e(-1, 0, 80));
            View view22 = this.simpleActionBar;
            org.telegram.ui.ActionBar.p6 resourceProvider32 = getResourceProvider();
            baseSimpleGlass.k = wb0Var;
            baseSimpleGlass.l = null;
            baseSimpleGlass.g(wb0Var, view22, resourceProvider32);
            baseSimpleGlass.m = new sa(this, i13);
            this.simpleActionBar.setBackground(null);
            this.glassEngine.b(this.S);
            tk0Var = this.T;
            if (tk0Var != null) {
            }
            if (baseSimpleGlass.g != null) {
            }
            i0();
            P0();
            return this.fragmentView;
        }
        tL_channelLocation = this.H0;
        if (tL_channelLocation != null) {
        }
        jjVar3 = this.J0;
        if (jjVar3 != null) {
        }
        while (i11 < 2) {
        }
        if (this.J0 == null) {
        }
        baseSimpleGlass = getBaseSimpleGlass();
        View view32 = new View(context);
        this.navigationBarFadeView = view32;
        view32.setBackground(baseSimpleGlass.b(view32));
        wb0Var.addView(this.navigationBarFadeView, w7.b6.e(-1, 0, 80));
        View view222 = this.simpleActionBar;
        org.telegram.ui.ActionBar.p6 resourceProvider322 = getResourceProvider();
        baseSimpleGlass.k = wb0Var;
        baseSimpleGlass.l = null;
        baseSimpleGlass.g(wb0Var, view222, resourceProvider322);
        baseSimpleGlass.m = new sa(this, i13);
        this.simpleActionBar.setBackground(null);
        this.glassEngine.b(this.S);
        tk0Var = this.T;
        if (tk0Var != null) {
        }
        if (baseSimpleGlass.g != null) {
        }
        i0();
        P0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ob0 ob0Var;
        ob0 ob0Var2;
        if (i10 == org.telegram.messenger.zs.t) {
            removeSelfFromStack(true);
            return;
        }
        if (i10 == org.telegram.messenger.zs.v4) {
            this.l0 = false;
            ob0 ob0Var3 = this.R;
            if (ob0Var3 != null) {
                ob0Var3.P(false, false);
            }
            org.telegram.messenger.ga gaVar = this.G;
            if (gaVar != null) {
                try {
                    gaVar.l(true);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.w4) {
            this.l0 = true;
            ob0 ob0Var4 = this.R;
            if (ob0Var4 != null) {
                ob0Var4.P(true, false);
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.D4) {
            ob0 ob0Var5 = this.R;
            if (ob0Var5 != null) {
                ob0Var5.f();
            }
            R0();
            return;
        }
        if (i10 == 1) {
            if (((Boolean) objArr[2]).booleanValue() || ((Long) objArr[0]).longValue() != this.n0 || this.J0 == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[1];
            boolean z10 = false;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i12);
                if (jjVar.C3()) {
                    h0(jjVar.k);
                    z10 = true;
                } else {
                    TLRPC.Message message = jjVar.k;
                    if ((message.action instanceof TLRPC.TL_messageActionGeoProximityReached) && org.telegram.messenger.o5.E(org.telegram.messenger.jj.B0(message))) {
                        this.c.setImageResource(R.drawable.msg_location_alert);
                        m4.c cVar = this.M;
                        if (cVar != null) {
                            cVar.v0();
                            this.M = null;
                        }
                    }
                }
            }
            if (!z10 || (ob0Var2 = this.R) == null) {
                return;
            }
            ob0Var2.O(this.p0);
            return;
        }
        if (i10 == org.telegram.messenger.zs.m0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue != this.n0 || this.J0 == null) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) objArr[1];
            boolean z11 = false;
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList2.get(i13);
                if (jjVar2.C3()) {
                    TLRPC.Message message2 = jjVar2.k;
                    TLRPC.Peer peer = message2.from_id;
                    sb0 sb0Var = (sb0) this.q0.f(peer != null ? org.telegram.messenger.jj.C1(peer) : org.telegram.messenger.jj.B0(message2));
                    if (sb0Var != null) {
                        org.telegram.messenger.md h = getLocationController().h(longValue);
                        if (h == null || h.b != jjVar2.f1()) {
                            TLRPC.Message message3 = jjVar2.k;
                            sb0Var.b = message3;
                            TLRPC.GeoPoint geoPoint = message3.media.geo;
                            org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(geoPoint.lat, geoPoint._long);
                            sb0Var.e.d(cbVar);
                            if (this.r0 == sb0Var.a) {
                                this.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(sb0Var.e.a()));
                            }
                            org.telegram.messenger.fa faVar = sb0Var.f;
                            if (faVar != null) {
                                faVar.a();
                                sb0Var.f.d(cbVar);
                                int i14 = jjVar2.k.media.heading;
                                if (i14 != 0) {
                                    sb0Var.f.e(i14);
                                    if (!sb0Var.g) {
                                        sb0Var.f.a.a(v7.n8.b(R.drawable.map_pin_cone2));
                                        sb0Var.g = true;
                                    }
                                } else if (sb0Var.g) {
                                    sb0Var.f.e(0);
                                    sb0Var.f.a.a(v7.n8.b(R.drawable.map_pin_circle));
                                    sb0Var.g = false;
                                }
                            }
                        }
                        z11 = true;
                    }
                }
            }
            if (z11 && (ob0Var = this.R) != null) {
                ob0Var.f();
                org.telegram.ui.Components.jh0 jh0Var = this.P;
                if (jh0Var != null) {
                    jh0Var.c(true);
                }
            }
            if (z11) {
                R0();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean finishFragment(boolean z10) {
        if (B0()) {
            return false;
        }
        return super.finishFragment(z10);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            UndoView[] undoViewArr = this.D;
            if (i10 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7(undoViewArr[i10], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.tj));
            i10++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h5));
        org.telegram.ui.ActionBar.p5 p5Var = this.s;
        arrayList.add(new org.telegram.ui.ActionBar.c7(p5Var != null ? p5Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 196608, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ei));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 8, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.W5));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.X5));
        return arrayList;
    }

    public final sb0 h0(TLRPC.Message message) {
        Location location;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        double d = geoPoint.lat;
        double d10 = geoPoint._long;
        long C1 = org.telegram.messenger.jj.C1(message.from_id);
        a0.h hVar = this.q0;
        sb0 sb0Var = (sb0) hVar.f(C1);
        if (sb0Var == null) {
            sb0Var = new sb0();
            sb0Var.b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                sb0Var.c = getMessagesController().Z1(Long.valueOf(sb0Var.b.from_id.user_id));
                sb0Var.a = sb0Var.b.from_id.user_id;
            } else {
                long B0 = org.telegram.messenger.jj.B0(message);
                if (org.telegram.messenger.o5.E(B0)) {
                    sb0Var.c = getMessagesController().Z1(Long.valueOf(B0));
                } else {
                    sb0Var.d = getMessagesController().L0(Long.valueOf(-B0));
                }
                sb0Var.a = B0;
            }
            J0(sb0Var);
            try {
                l2.f fVar = (l2.f) ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                ((j8.f) fVar.b).a = new LatLng(d, d10);
                Bitmap n02 = n0(sb0Var);
                if (n02 != null) {
                    ((j8.f) fVar.b).d = v7.n8.a(n02);
                    fVar.e(0.907f);
                    sb0Var.e = this.G.a(fVar);
                    if (!org.telegram.messenger.h20.B(sb0Var.c)) {
                        l2.f fVar2 = (l2.f) ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                        ((j8.f) fVar2.b).a = new LatLng(d, d10);
                        ((j8.f) fVar2.b).r = true;
                        fVar2.e(0.5f);
                        org.telegram.messenger.fa a2 = this.G.a(fVar2);
                        sb0Var.f = a2;
                        int i10 = message.media.heading;
                        if (i10 != 0) {
                            a2.e(i10);
                            sb0Var.f.a.a(v7.n8.b(R.drawable.map_pin_cone2));
                            sb0Var.g = true;
                        } else {
                            a2.e(0);
                            sb0Var.f.a.a(v7.n8.b(R.drawable.map_pin_circle));
                            sb0Var.g = false;
                        }
                    }
                    this.p0.add(sb0Var);
                    hVar.k(sb0Var, sb0Var.a);
                    org.telegram.messenger.md h = getLocationController().h(this.n0);
                    if (sb0Var.a == getUserConfig().e() && h != null && sb0Var.b.id == h.b && (location = this.E0) != null) {
                        double latitude = location.getLatitude();
                        double longitude = this.E0.getLongitude();
                        j8.e eVar = sb0Var.e.a;
                        LatLng latLng = new LatLng(latitude, longitude);
                        eVar.getClass();
                        try {
                            s7.i iVar = (s7.i) eVar.a;
                            Parcel P0 = iVar.P0();
                            s7.b.b(P0, latLng);
                            iVar.T0(P0, 3);
                        } catch (RemoteException e) {
                            throw new ad.d(e);
                        }
                    }
                }
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
        } else {
            sb0Var.b = message;
            j8.e eVar2 = sb0Var.e.a;
            LatLng latLng2 = new LatLng(d, d10);
            eVar2.getClass();
            try {
                s7.i iVar2 = (s7.i) eVar2.a;
                Parcel P02 = iVar2.P0();
                s7.b.b(P02, latLng2);
                iVar2.T0(P02, 3);
                if (this.r0 == sb0Var.a) {
                    this.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(sb0Var.e.a()));
                }
            } catch (RemoteException e10) {
                throw new ad.d(e10);
            }
        }
        org.telegram.ui.Components.jh0 jh0Var = this.P;
        if (jh0Var != null) {
            jh0Var.c(true);
        }
        R0();
        return sb0Var;
    }

    public final void i0() {
        if (this.fragmentView == null || this.S == null) {
            return;
        }
        i0.c cVar = this.mSystemInsets;
        int i10 = cVar.b;
        int i11 = cVar.d;
        FrameLayout frameLayout = this.Y;
        if (frameLayout != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            int d = ei.b.d(i10) - org.telegram.messenger.i0.L(6.0f);
            if (layoutParams.topMargin != d) {
                layoutParams.topMargin = d;
                this.Y.requestLayout();
            }
        }
        this.S.setClipToPadding(false);
        this.S.setPadding(0, 0, 0, i11);
        org.telegram.ui.Components.tk0 tk0Var = this.T;
        if (tk0Var != null) {
            tk0Var.setClipToPadding(false);
            ei.b.e(this.T, i10, i11, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 0);
        }
        if (this.fragmentView.getMeasuredHeight() > 0) {
            t0(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return i0.b.h(getThemedColor(org.telegram.ui.ActionBar.t6.d6)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0() {
        vg.f fVar = this.a0;
        if (fVar != null) {
            fVar.updateColors();
        }
        nb0 nb0Var = this.S;
        if (nb0Var != null) {
            nb0Var.invalidate();
        }
        if (this.G != null) {
            int i10 = org.telegram.messenger.i0.B(getThemedColor(org.telegram.ui.ActionBar.t6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
            if (i10 != 0) {
                if (!this.j0) {
                    this.j0 = true;
                    this.G.j(((t7.u) org.telegram.messenger.w0.k()).loadRawResourceStyle(org.telegram.messenger.w0.b, i10));
                    m4.c cVar = this.M;
                    if (cVar != null) {
                        cVar.P0(-1);
                        this.M.G0(553648127);
                    }
                }
            } else if (this.j0) {
                this.j0 = false;
                this.G.j(null);
                m4.c cVar2 = this.M;
                if (cVar2 != null) {
                    cVar2.P0(-16777216);
                    this.M.G0(TLObject.FLAG_29);
                }
            }
            E0();
        }
    }

    public final boolean k0() {
        if (o0()) {
            return false;
        }
        if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            try {
                if (!((LocationManager) org.telegram.messenger.w0.b.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i10 = org.telegram.ui.ActionBar.t6.L5;
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, getThemedColor(i10), null);
                    alertDialog$Builder.n(i10, getResourceProvider());
                    alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131749539, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751806, null), new fb0(this, 2));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    showDialog(alertDialog$Builder.a);
                    return false;
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return true;
            }
        }
        return true;
    }

    public final void l0(int i10) {
        s7.h fVar;
        if (this.G == null) {
            return;
        }
        List<org.telegram.messenger.hb> asList = Arrays.asList(new org.telegram.messenger.gb(), new org.telegram.messenger.fb());
        org.telegram.messenger.va onCreateCircleOptions = ((t7.u) org.telegram.messenger.w0.k()).onCreateCircleOptions();
        double latitude = this.E0.getLatitude();
        double longitude = this.E0.getLongitude();
        k2.m0 m0Var = (k2.m0) onCreateCircleOptions;
        j8.b bVar = (j8.b) m0Var.a;
        LatLng latLng = new LatLng(latitude, longitude);
        bVar.getClass();
        bVar.a = latLng;
        double d = i10;
        j8.b bVar2 = (j8.b) m0Var.a;
        bVar2.b = d;
        if (y0()) {
            bVar2.d = -1771658281;
            bVar2.e = 476488663;
        } else {
            bVar2.d = -1774024971;
            bVar2.e = 474121973;
        }
        ArrayList arrayList = new ArrayList();
        for (org.telegram.messenger.hb hbVar : asList) {
            if (hbVar instanceof org.telegram.messenger.gb) {
                arrayList.add(new j8.c(20, 1));
            } else if (hbVar instanceof org.telegram.messenger.fb) {
                arrayList.add(new j8.c(20, 0));
            }
        }
        bVar2.r = arrayList;
        bVar2.c = 2;
        org.telegram.messenger.ga gaVar = this.G;
        n4.q qVar = gaVar.a;
        qVar.getClass();
        try {
            i8.f fVar2 = (i8.f) qVar.a;
            Parcel P0 = fVar2.P0();
            s7.b.b(P0, bVar2);
            Parcel O0 = fVar2.O0(P0, 35);
            IBinder readStrongBinder = O0.readStrongBinder();
            int i11 = s7.g.b;
            if (readStrongBinder == null) {
                fVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                fVar = queryLocalInterface instanceof s7.h ? (s7.h) queryLocalInterface : new s7.f(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", 9);
            }
            O0.recycle();
            j8.a aVar = new j8.a(fVar);
            m4.c cVar = new m4.c(10, gaVar, aVar);
            gaVar.c.put(aVar, cVar);
            this.M = cVar;
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final Bitmap m0(int i10) {
        Bitmap[] bitmapArr = this.Y0;
        Bitmap bitmap = bitmapArr[i10 % 7];
        if (bitmap != null) {
            return bitmap;
        }
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawCircle(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint);
            paint.setColor(org.telegram.ui.Cells.x4.a(i10));
            canvas.drawCircle(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(5.0f), paint);
            canvas.setBitmap(null);
            bitmapArr[i10 % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
            return null;
        }
    }

    public final Bitmap n0(sb0 sb0Var) {
        Bitmap bitmap = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.i0.L(62.0f), org.telegram.messenger.i0.L(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = org.telegram.messenger.w0.b.getResources().getDrawable(R.drawable.map_pin_photo);
                drawable.setBounds(0, 0, org.telegram.messenger.i0.L(62.0f), org.telegram.messenger.i0.L(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                TLRPC.User user = sb0Var.c;
                if (user != null) {
                    r8Var.r(user);
                } else {
                    TLRPC.Chat chat = sb0Var.d;
                    if (chat != null) {
                        r8Var.q(chat);
                    }
                }
                canvas.translate(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
                r8Var.setBounds(0, 0, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f));
                r8Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = sb0Var.h;
                Bitmap n10 = (imageReceiver == null || !imageReceiver.J()) ? null : sb0Var.h.n();
                if (n10 != null && !n10.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(n10, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    float L = org.telegram.messenger.i0.L(50.0f) / n10.getWidth();
                    matrix.postTranslate(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
                    matrix.postScale(L, L);
                    paint.setShader(bitmapShader);
                    bitmapShader.setLocalMatrix(matrix);
                    rectF.set(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(56.0f));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(25.0f), org.telegram.messenger.i0.L(25.0f), paint);
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
                org.telegram.messenger.f8.g(th, true);
                return bitmap;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean o0() {
        return this instanceof cn;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.jh0 jh0Var = this.P;
        if (jh0Var == null) {
            org.telegram.messenger.za zaVar = this.I;
            if (zaVar == null || ((GLSurfaceView) ((bh.d) zaVar).e) == null || this.K) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                B0();
            }
        } else if (z10) {
            jh0Var.a();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.D[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.zs.t);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.v4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.w4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.D4);
        org.telegram.messenger.jj jjVar = this.J0;
        if (jjVar != null && jjVar.C3()) {
            getNotificationCenter().c(this, 1);
            getNotificationCenter().c(this, org.telegram.messenger.zs.m0);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.z80 z80Var = this.f0;
        if (z80Var != null) {
            z80Var.i = true;
            z80Var.g = false;
            z80Var.d();
            z80Var.d = null;
            z80Var.e = null;
            z80Var.f = null;
        }
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.v4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.w4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.D4);
        getNotificationCenter().n(this, org.telegram.messenger.zs.t);
        getNotificationCenter().n(this, 1);
        getNotificationCenter().n(this, org.telegram.messenger.zs.m0);
        try {
            org.telegram.messenger.ga gaVar = this.G;
            if (gaVar != null) {
                gaVar.l(false);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            org.telegram.messenger.za zaVar = this.I;
            if (zaVar != null) {
                ((bh.d) zaVar).B();
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        UndoView undoView = this.D[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        ob0 ob0Var = this.R;
        if (ob0Var != null) {
            ob0Var.F();
        }
        org.telegram.ui.Components.vk vkVar = this.U;
        if (vkVar != null) {
            vkVar.F();
        }
        cb0 cb0Var = this.R0;
        if (cb0Var != null) {
            org.telegram.messenger.i0.r(cb0Var);
            this.R0 = null;
        }
        ArrayList arrayList = this.p0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb0 sb0Var = (sb0) arrayList.get(i10);
            ImageReceiver imageReceiver = sb0Var.h;
            if (imageReceiver != null) {
                imageReceiver.R();
                sb0Var.h = null;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        i0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onLowMemory() {
        android.support.v4.media.session.a0 a0Var;
        super.onLowMemory();
        org.telegram.messenger.za zaVar = this.I;
        if (zaVar == null || !this.C0 || (a0Var = (android.support.v4.media.session.a0) ((m.p3) ((fg.i) ((bh.d) zaVar).a).b).b) == null) {
            return;
        }
        try {
            i8.g gVar = (i8.g) a0Var.c;
            gVar.T0(gVar.P0(), 6);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.za zaVar = this.I;
        if (zaVar != null && this.C0) {
            try {
                ((bh.d) zaVar).D();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        UndoView undoView = this.D[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.D0 = false;
        Q0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
        org.telegram.messenger.za zaVar = this.I;
        if (zaVar != null && this.C0) {
            try {
                ((bh.d) zaVar).F();
            } catch (Throwable th2) {
                org.telegram.messenger.f8.g(th2, true);
            }
        }
        this.D0 = true;
        E0();
        org.telegram.messenger.ga gaVar = this.G;
        if (gaVar != null) {
            try {
                gaVar.l(true);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        t0(true);
        if (o0()) {
            this.y0 = false;
        } else if (this.y0 && (parentActivity = getParentActivity()) != null) {
            this.y0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        cb0 cb0Var = this.R0;
        if (cb0Var != null) {
            org.telegram.messenger.i0.r(cb0Var);
            org.telegram.messenger.i0.h3(this.R0, 5000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            j0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            org.telegram.ui.ActionBar.p5 p5Var = this.s;
            if (p5Var == null || p5Var.getSearchField() == null) {
                return;
            }
            this.s.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.t6.j5));
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || z11) {
            return;
        }
        try {
            if (((fg.i) ((bh.d) this.I).a).getParent() instanceof ViewGroup) {
                ((ViewGroup) ((fg.i) ((bh.d) this.I).a).getParent()).removeView((fg.i) ((bh.d) this.I).a);
            }
        } catch (Exception unused) {
        }
        l0 l0Var = this.Q;
        if (l0Var == null) {
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView((fg.i) ((bh.d) this.I).a, 0, w7.b6.e(-1, -1, 51));
                return;
            }
            return;
        }
        l0Var.addView((fg.i) ((bh.d) this.I).a, 0, w7.b6.e(-1, v0(), 51));
        ub0 ub0Var = this.w;
        if (ub0Var != null) {
            try {
                if (ub0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.w.getParent()).removeView(this.w);
                }
            } catch (Exception unused2) {
            }
            this.Q.addView(this.w, 1, w7.b6.e(-1, v0(), 51));
        }
        O0(false);
        z0();
        E0();
    }

    public final void q0(ArrayList arrayList) {
        org.telegram.messenger.xa onCreateLatLngBoundsBuilder = this.o0 ? ((t7.u) org.telegram.messenger.w0.k()).onCreateLatLngBoundsBuilder() : null;
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
            int i11 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i12 = messageMedia.period;
            if (i11 + i12 > currentTime || i12 == Integer.MAX_VALUE) {
                if (onCreateLatLngBoundsBuilder != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    ((m2.t) onCreateLatLngBoundsBuilder).D(new org.telegram.messenger.cb(geoPoint.lat, geoPoint._long));
                }
                h0(message);
                if (this.c.getVisibility() != 8 && org.telegram.messenger.jj.C1(message.from_id) != getUserConfig().e()) {
                    this.c.setVisibility(0);
                    this.F = true;
                    this.c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new org.telegram.ui.Components.voip.h2(this, 14)).start();
                }
            }
        }
        if (onCreateLatLngBoundsBuilder != null) {
            if (this.o0) {
                this.S.w0(0, org.telegram.messenger.i0.L(99.0f), null);
            }
            this.o0 = false;
            this.R.O(this.p0);
            if (this.J0.C3()) {
                try {
                    m2.t tVar = (m2.t) onCreateLatLngBoundsBuilder;
                    org.telegram.messenger.cb a2 = tVar.l().a();
                    org.telegram.messenger.cb A0 = A0(a2, 100.0d, 100.0d);
                    tVar.D(A0(a2, -100.0d, -100.0d));
                    tVar.D(A0);
                    org.telegram.messenger.ea l4 = tVar.l();
                    if (arrayList.size() > 1) {
                        try {
                            org.telegram.messenger.ua newCameraUpdateLatLngBounds = ((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngBounds(l4, org.telegram.messenger.i0.L(113.0f));
                            this.H = newCameraUpdateLatLngBounds;
                            this.G.i(newCameraUpdateLatLngBounds);
                            this.H = null;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final boolean s0() {
        boolean z10;
        boolean z11;
        int i10;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i11;
        boolean z12 = false;
        if (this.G != null) {
            ArrayList arrayList = new ArrayList();
            int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
            ArrayList arrayList2 = this.p0;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                sb0 sb0Var = (sb0) arrayList2.get(i12);
                org.telegram.messenger.fa faVar = sb0Var.e;
                if (faVar != null && (message = sb0Var.b) != null && (messageMedia = message.media) != null && ((i11 = messageMedia.period) == Integer.MAX_VALUE || message.date + i11 > currentTime)) {
                    arrayList.add(faVar.a());
                }
            }
            boolean z13 = this.q0.f(getUserConfig().e()) != null;
            Location location = this.E0;
            if (location != null && !z13) {
                arrayList.add(new org.telegram.messenger.cb(location.getLatitude(), this.E0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    org.telegram.messenger.xa onCreateLatLngBoundsBuilder = ((t7.u) org.telegram.messenger.w0.k()).onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    int i13 = 0;
                    double d10 = Double.MAX_VALUE;
                    double d11 = Double.MAX_VALUE;
                    double d12 = -1.7976931348623157E308d;
                    while (i13 < size2) {
                        org.telegram.messenger.cb cbVar = (org.telegram.messenger.cb) arrayList.get(i13);
                        z10 = z12;
                        try {
                            ((m2.t) onCreateLatLngBoundsBuilder).D(cbVar);
                            i10 = size2;
                            z11 = true;
                        } catch (Exception e) {
                            e = e;
                            z11 = true;
                            org.telegram.messenger.f8.g(e, z11);
                            return z10;
                        }
                        try {
                            double d13 = cbVar.a;
                            if (d13 < d10) {
                                d10 = d13;
                            }
                            if (d13 > d) {
                                d = d13;
                            }
                            double d14 = cbVar.b;
                            if (d14 < d11) {
                                d11 = d14;
                            }
                            if (d14 > d12) {
                                d12 = d14;
                            }
                            i13++;
                            z12 = z10;
                            size2 = i10;
                        } catch (Exception e7) {
                            e = e7;
                            org.telegram.messenger.f8.g(e, z11);
                            return z10;
                        }
                    }
                    z10 = z12;
                    z11 = true;
                    double d15 = (d10 + d) / 2.0d;
                    double d16 = (d11 + d12) / 2.0d;
                    double radians = Math.toRadians(d - d10) * 6366198.0d;
                    double radians2 = Math.toRadians(d12 - d11) * 6366198.0d * Math.cos(Math.toRadians(d15));
                    if (radians < 30.0d || radians2 < 30.0d) {
                        m2.t tVar = (m2.t) onCreateLatLngBoundsBuilder;
                        tVar.D(new org.telegram.messenger.cb(Math.toDegrees(2.356194387921959E-6d) + d15, d16 + Math.toDegrees(15.0d / (Math.cos(Math.toRadians(d15)) * 6366198.0d))));
                        tVar.D(new org.telegram.messenger.cb(d15 + Math.toDegrees(-2.356194387921959E-6d), d16 + Math.toDegrees((-15.0d) / (Math.cos(Math.toRadians(d15)) * 6366198.0d))));
                    }
                    this.G.c(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngBounds(((m2.t) onCreateLatLngBoundsBuilder).l(), org.telegram.messenger.i0.L(60.0f)), 500);
                    return true;
                } catch (Exception e10) {
                    e = e10;
                    z10 = z12;
                }
            }
        }
        return false;
    }

    public final void t0(boolean z10) {
        FrameLayout.LayoutParams layoutParams;
        if (this.S != null) {
            int i10 = this.mSystemInsets.d;
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight == 0) {
                return;
            }
            int i11 = this.O0;
            if (i11 == 6) {
                this.P0 = org.telegram.messenger.m5.z(66.0f, measuredHeight, i10);
            } else if (i11 == 2) {
                this.P0 = org.telegram.messenger.m5.z(73.0f, measuredHeight, i10);
            } else {
                this.P0 = org.telegram.messenger.m5.z(66.0f, measuredHeight, i10);
            }
            qb0 qb0Var = this.S0;
            if (qb0Var != null && qb0Var.k0(8) > 0) {
                this.P0 -= org.telegram.messenger.i0.L(200.0f);
            }
            this.d0 = org.telegram.messenger.i0.L(100.0f) + (measuredHeight - this.P0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
            layoutParams2.height = org.telegram.messenger.i0.L(29.0f) + this.P0;
            this.Q.setLayoutParams(layoutParams2);
            this.R.Q(this.P0);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((fg.i) ((bh.d) this.I).a).getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.height = v0();
                org.telegram.messenger.ga gaVar = this.G;
                if (gaVar != null) {
                    gaVar.q(org.telegram.messenger.i0.L(70.0f), 0, org.telegram.messenger.i0.L(70.0f), u0());
                }
                ((fg.i) ((bh.d) this.I).a).setLayoutParams(layoutParams3);
            }
            ub0 ub0Var = this.w;
            if (ub0Var != null && (layoutParams = (FrameLayout.LayoutParams) ub0Var.getLayoutParams()) != null) {
                layoutParams.height = v0();
                this.w.setLayoutParams(layoutParams);
            }
            this.R.f();
            if (!z10) {
                O0(false);
                return;
            }
            int i12 = i11 == 3 ? 73 : (i11 == 1 || i11 == 2) ? 66 : 0;
            this.W.h1(0, -org.telegram.messenger.i0.L(i12));
            O0(false);
            this.S.post(new org.telegram.ui.Components.qq(this, i12, 12));
        }
    }

    public final int u0() {
        return org.telegram.messenger.i0.L(10.0f) + this.i0 + this.d0;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final int v0() {
        return org.telegram.messenger.i0.L(10.0f) + this.P0 + this.d0;
    }

    public final boolean w0() {
        ArrayList arrayList = (ArrayList) getLocationController().c.f(org.telegram.messenger.jj.B0(this.J0.k));
        if (arrayList == null || !arrayList.isEmpty()) {
            arrayList = null;
        } else {
            q0(arrayList);
        }
        if (org.telegram.messenger.o5.z(this.n0)) {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.n0));
            if (org.telegram.messenger.w3.T(L0) && !L0.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long B0 = org.telegram.messenger.jj.B0(this.J0.k);
        tL_messages_getRecentLocations.peer = getMessagesController().i1(B0);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new kb0(this, B0, 0));
        return arrayList != null;
    }

    public final UndoView x0() {
        UndoView[] undoViewArr = this.D;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.Q.removeView(undoViewArr[0]);
            this.Q.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean y0() {
        return (getResourceProvider() == null && org.telegram.ui.ActionBar.t6.I.q()) || org.telegram.messenger.i0.B(getThemedColor(org.telegram.ui.ActionBar.t6.d6)) < 0.721f;
    }

    public final void z0() {
        SharedPreferences d12;
        int i10;
        ImageView imageView = this.c;
        if (imageView == null || imageView.getVisibility() != 0 || this.F || (i10 = (d12 = org.telegram.messenger.vp.d1()).getInt("proximityhint", 0)) >= 3) {
            return;
        }
        d12.edit().putInt("proximityhint", i10 + 1).commit();
        if (org.telegram.messenger.o5.E(this.n0)) {
            this.x.s(org.telegram.messenger.cd.a0("ProximityTooltioUser", null, 2131746627, org.telegram.messenger.h20.j(getMessagesController().Z1(Long.valueOf(this.n0)), true)));
        } else {
            this.x.s(org.telegram.messenger.cd.L0(2131746628, null));
        }
        this.x.u();
    }
}
