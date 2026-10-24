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
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class sc0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.TL_channelLocation A0;
    public MessageObject B0;
    public boolean C0;
    public boolean D0;
    public boolean E;
    public boolean E0;
    public final UndoView[] F;
    public nc0 F0;
    public boolean G;
    public final int G0;
    public boolean H;
    public int H0;
    public IMapsProvider.IMap I;
    public kc0 I0;
    public IMapsProvider.ICameraUpdate J;
    public bc0 J0;
    public IMapsProvider.IMapView K;
    public ic0 K0;
    public IMapsProvider.ICameraUpdate L;
    public org.telegram.ui.Cells.u3 L0;
    public boolean M;
    public TL_stories.MediaArea M0;
    public float N;
    public boolean N0;
    public IMapsProvider.ICircle O;
    public boolean O0;
    public double P;
    public Boolean P0;
    public boolean Q;
    public final Bitmap[] Q0;
    public org.telegram.ui.Components.ej0 R;
    public int R0;
    public l0 S;
    public gc0 T;
    public org.telegram.ui.Components.mm0 U;
    public org.telegram.ui.Components.mm0 V;
    public lc0 W;
    public View X;
    public s4.b0 Y;
    public org.telegram.ui.ActionBar.u0 Z;
    public ImageView a;
    public boolean a0;
    public TextView b;
    public boolean b0;
    public ImageView c;
    public boolean c0;
    public org.telegram.ui.ActionBar.u0 d;
    public boolean d0;
    public org.telegram.ui.Components.pl e;
    public long e0;
    public LinearLayout f;
    public boolean f0;
    public final ArrayList g0;
    public ImageView h;
    public final a0.h h0;
    public long i0;
    public boolean j0;
    public final ArrayList k0;
    public AnimatorSet l0;
    public IMapsProvider.IMarker m0;
    public TextView n;
    public rc0 n0;
    public FrameLayout o0;
    public boolean p0;
    public boolean q0;
    public TextView r;
    public boolean r0;
    public Drawable s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public ci.h3 v;
    public boolean v0;
    public org.telegram.ui.ActionBar.u0 w;
    public Location w0;
    public pc0 x;
    public Location x0;
    public ei.x3 y;
    public int y0;
    public TLRPC.TL_channelLocation z0;

    public sc0(int i10) {
        super(null);
        this.F = new UndoView[2];
        this.b0 = true;
        this.c0 = false;
        this.d0 = true;
        this.f0 = true;
        this.g0 = new ArrayList();
        this.h0 = new a0.h();
        this.i0 = -1L;
        this.k0 = new ArrayList();
        this.p0 = true;
        this.q0 = true;
        this.H0 = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.O0 = true;
        this.Q0 = new Bitmap[7];
        this.G0 = i10;
        AndroidUtilities.fixGoogleMapsBug();
    }

    public static /* synthetic */ void U(sc0 sc0Var, boolean z10, TLRPC.User user, int i10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (!z10) {
            sc0Var.w0(i10, user, 0);
            return;
        }
        LocationController.SharingLocationInfo sharingLocationInfo = sc0Var.getLocationController().getSharingLocationInfo(sc0Var.e0);
        if (sharingLocationInfo != null) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.peer = sc0Var.getMessagesController().getInputPeer(sharingLocationInfo.did);
            tL_messages_editMessage.id = sharingLocationInfo.mid;
            tL_messages_editMessage.flags |= 16384;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = false;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
            Location lastKnownLocation = LocationController.getInstance(sc0Var.currentAccount).getLastKnownLocation();
            tL_messages_editMessage.media.geo_point.lat = AndroidUtilities.fixLocationCoord(lastKnownLocation.getLatitude());
            tL_messages_editMessage.media.geo_point._long = AndroidUtilities.fixLocationCoord(lastKnownLocation.getLongitude());
            tL_messages_editMessage.media.geo_point.accuracy_radius = (int) lastKnownLocation.getAccuracy();
            TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
            TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
            if (inputGeoPoint.accuracy_radius != 0) {
                inputGeoPoint.flags |= 1;
            }
            int i11 = sharingLocationInfo.lastSentProximityMeters;
            int i12 = sharingLocationInfo.proximityMeters;
            if (i11 != i12) {
                inputMedia.proximity_notification_radius = i12;
                inputMedia.flags |= 8;
            }
            inputMedia.heading = LocationController.getHeading(lastKnownLocation);
            TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
            int i13 = inputMedia2.flags;
            inputMedia2.flags = i13 | 4;
            int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i15 = i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : sharingLocationInfo.period + i10;
            sharingLocationInfo.period = i15;
            inputMedia2.period = i15;
            if (i10 != Integer.MAX_VALUE) {
                i14 = sharingLocationInfo.stopTime + i10;
            }
            sharingLocationInfo.stopTime = i14;
            inputMedia2.flags = i13 | 6;
            MessageObject messageObject = sharingLocationInfo.messageObject;
            if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                messageMedia.period = i15;
                sc0Var.getMessagesStorage().replaceMessageIfExists(sharingLocationInfo.messageObject.messageOwner, null, null, true);
            }
            sc0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
        }
    }

    public static /* synthetic */ void V(sc0 sc0Var) {
        bc0 bc0Var;
        sc0Var.getLocationController().markLiveLoactionsAsRead(sc0Var.e0);
        if (sc0Var.isPaused || (bc0Var = sc0Var.J0) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(bc0Var, 5000L);
    }

    public static IMapsProvider.LatLng p0(IMapsProvider.LatLng latLng, double d, double d10) {
        double degrees = Math.toDegrees(d10 / (Math.cos(Math.toRadians(latLng.latitude)) * 6366198.0d));
        return new IMapsProvider.LatLng(latLng.latitude + Math.toDegrees(d / 6366198.0d), latLng.longitude + degrees);
    }

    public final void A0(boolean z10) {
        int i10;
        int i11;
        FrameLayout.LayoutParams layoutParams;
        s4.b1 K = this.U.K(0);
        if (K != null) {
            i10 = (int) K.a.getY();
            i11 = Math.min(i10, 0) + this.H0;
        } else {
            i10 = -this.S.getMeasuredHeight();
            i11 = 0;
        }
        if (((FrameLayout.LayoutParams) this.S.getLayoutParams()) != null) {
            if (i11 <= 0) {
                if (this.K.getView().getVisibility() == 0) {
                    this.K.getView().setVisibility(4);
                    this.S.setVisibility(4);
                    pc0 pc0Var = this.x;
                    if (pc0Var != null) {
                        pc0Var.setVisibility(4);
                    }
                }
            } else if (this.K.getView().getVisibility() == 4) {
                this.K.getView().setVisibility(0);
                this.S.setVisibility(0);
                pc0 pc0Var2 = this.x;
                if (pc0Var2 != null) {
                    pc0Var2.setVisibility(0);
                }
            }
            this.S.setTranslationY(Math.min(0, i10));
            int i12 = -i10;
            int i13 = i12 / 2;
            this.K.getView().setTranslationY(Math.max(0, i13));
            pc0 pc0Var3 = this.x;
            if (pc0Var3 != null) {
                pc0Var3.setTranslationY(Math.max(0, i13));
            }
            int measuredHeight = this.H0 - this.d.getMeasuredHeight();
            int i14 = this.G0;
            float min = Math.min(measuredHeight - AndroidUtilities.dp(64 + ((i14 == 0 || i14 == 1) ? 30 : 10)), i12);
            this.d.setTranslationY(min);
            this.c.setTranslationY(min);
            ei.x3 x3Var = this.y;
            if (x3Var != null) {
                x3Var.setTranslationY(min);
            }
            org.telegram.ui.Components.pl plVar = this.e;
            if (plVar != null) {
                plVar.c = min;
                plVar.setTranslationY(min + plVar.b);
            }
            View view = this.X;
            if (view != null) {
                int dp = (i11 / 2) + (i12 - AndroidUtilities.dp(view.getTag() == null ? 48.0f : 69.0f));
                this.y0 = dp;
                view.setTranslationY(dp);
            }
            if (z10) {
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.K.getView().getLayoutParams();
            if (layoutParams2 != null) {
                if (layoutParams2.height != AndroidUtilities.dp(10.0f) + this.H0) {
                    layoutParams2.height = AndroidUtilities.dp(10.0f) + this.H0;
                    IMapsProvider.IMap iMap = this.I;
                    if (iMap != null) {
                        iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                    }
                    this.K.getView().setLayoutParams(layoutParams2);
                }
            }
            pc0 pc0Var4 = this.x;
            if (pc0Var4 == null || (layoutParams = (FrameLayout.LayoutParams) pc0Var4.getLayoutParams()) == null) {
                return;
            }
            if (layoutParams.height != AndroidUtilities.dp(10.0f) + this.H0) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.H0;
                this.x.setLayoutParams(layoutParams);
            }
        }
    }

    public final void B0() {
        if (!this.r0) {
            this.f.setVisibility(8);
        } else {
            if (!this.t0) {
                this.V.setEmptyView(this.f);
                return;
            }
            this.V.setEmptyView(null);
            this.f.setVisibility(8);
            this.V.setVisibility(8);
        }
    }

    public final void C0() {
        TLRPC.MessageMedia messageMedia;
        int i10;
        if (this.b == null) {
            return;
        }
        if (this.j0) {
            z0(false, true);
            j0();
            return;
        }
        int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
        ArrayList arrayList = this.g0;
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.Message message = ((mc0) arrayList.get(i12)).b;
            if (message != null && (messageMedia = message.media) != null && ((i10 = messageMedia.period) == Integer.MAX_VALUE || message.date + i10 > currentTime)) {
                i11++;
            }
        }
        boolean z10 = this.h0.f(getUserConfig().getClientUserId()) != null;
        if (this.w0 != null && !z10) {
            i11++;
        }
        z0(i11 >= 2, true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
    }

    public final mc0 b0(TLRPC.Message message) {
        Location location;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
        long fromChatId = MessageObject.getFromChatId(message);
        a0.h hVar = this.h0;
        mc0 mc0Var = (mc0) hVar.f(fromChatId);
        if (mc0Var == null) {
            mc0Var = new mc0();
            mc0Var.b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                mc0Var.c = getMessagesController().getUser(Long.valueOf(mc0Var.b.from_id.user_id));
                mc0Var.a = mc0Var.b.from_id.user_id;
            } else {
                long dialogId = MessageObject.getDialogId(message);
                if (DialogObject.isUserDialog(dialogId)) {
                    mc0Var.c = getMessagesController().getUser(Long.valueOf(dialogId));
                } else {
                    mc0Var.d = getMessagesController().getChat(Long.valueOf(-dialogId));
                }
                mc0Var.a = dialogId;
            }
            v0(mc0Var);
            try {
                IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                Bitmap g02 = g0(mc0Var);
                if (g02 != null) {
                    position.icon(g02);
                    position.anchor(0.5f, 0.907f);
                    mc0Var.e = this.I.addMarker(position);
                    if (!UserObject.isUserSelf(mc0Var.c)) {
                        IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                        flat.anchor(0.5f, 0.5f);
                        IMapsProvider.IMarker addMarker = this.I.addMarker(flat);
                        mc0Var.f = addMarker;
                        int i10 = message.media.heading;
                        if (i10 != 0) {
                            addMarker.setRotation(i10);
                            mc0Var.f.setIcon(R.drawable.map_pin_cone2);
                            mc0Var.g = true;
                        } else {
                            addMarker.setRotation(0);
                            mc0Var.f.setIcon(R.drawable.map_pin_circle);
                            mc0Var.g = false;
                        }
                    }
                    this.g0.add(mc0Var);
                    hVar.k(mc0Var, mc0Var.a);
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.e0);
                    if (mc0Var.a == getUserConfig().getClientUserId() && sharingLocationInfo != null && mc0Var.b.id == sharingLocationInfo.mid && (location = this.w0) != null) {
                        mc0Var.e.setPosition(new IMapsProvider.LatLng(location.getLatitude(), this.w0.getLongitude()));
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            mc0Var.b = message;
            mc0Var.e.setPosition(latLng);
            if (this.i0 == mc0Var.a) {
                this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(mc0Var.e.getPosition()));
            }
        }
        org.telegram.ui.Components.ej0 ej0Var = this.R;
        if (ej0Var != null) {
            ej0Var.c(true);
        }
        C0();
        return mc0Var;
    }

    public final void c0() {
        int themedColor;
        org.telegram.ui.ActionBar.u0 u0Var = this.d;
        if (u0Var != null) {
            u0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.k6.ui));
            this.d.B(getThemedColor(org.telegram.ui.ActionBar.k6.G8));
            this.d.G(getThemedColor(org.telegram.ui.ActionBar.k6.F8), true);
            this.d.G(getThemedColor(org.telegram.ui.ActionBar.k6.E8), false);
        }
        if (this.s != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.h5)) != this.R0) {
            this.R0 = themedColor;
            this.s.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        ci.h3 h3Var = this.v;
        if (h3Var != null) {
            h3Var.invalidate();
        }
        if (this.I != null) {
            int i10 = AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.k6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
            if (i10 != 0) {
                if (this.a0) {
                    return;
                }
                this.a0 = true;
                this.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                IMapsProvider.ICircle iCircle = this.O;
                if (iCircle != null) {
                    iCircle.setStrokeColor(-1);
                    this.O.setFillColor(553648127);
                    return;
                }
                return;
            }
            if (this.a0) {
                this.a0 = false;
                this.I.setMapStyle(null);
                IMapsProvider.ICircle iCircle2 = this.O;
                if (iCircle2 != null) {
                    iCircle2.setStrokeColor(-16777216);
                    this.O.setFillColor(TLObject.FLAG_29);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.s0 = false;
        this.r0 = false;
        this.t0 = false;
        gc0 gc0Var = this.T;
        if (gc0Var != null) {
            gc0Var.F();
        }
        lc0 lc0Var = this.W;
        if (lc0Var != null) {
            lc0Var.F();
        }
        if (this.z0 != null) {
            Location location = new Location("network");
            this.x0 = location;
            location.setLatitude(this.z0.geo_point.lat);
            this.x0.setLongitude(this.z0.geo_point._long);
        } else if (this.B0 != null) {
            Location location2 = new Location("network");
            this.x0 = location2;
            location2.setLatitude(this.B0.messageOwner.media.geo.lat);
            this.x0.setLongitude(this.B0.messageOwner.media.geo._long);
        }
        this.c0 = (getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.k6.h5;
        org.telegram.ui.ActionBar.r6.i(i12, kVar, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.m(kVar2, 5, i13, getResourceProvider());
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i13, getResourceProvider());
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.I5, getResourceProvider());
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new fc0(this));
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
        TLRPC.TL_channelLocation tL_channelLocation = this.z0;
        int i14 = this.G0;
        if (tL_channelLocation != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
        } else {
            MessageObject messageObject = this.B0;
            if (messageObject == null) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ShareLocation));
                if (i14 != 4) {
                    this.x = new pc0(this, context);
                    org.telegram.ui.ActionBar.u0 c10 = m10.c(0, R.drawable.outline_header_search, getResourceProvider());
                    c10.F();
                    c10.H = new ig.b2(this, 12);
                    this.w = c10;
                    c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
                    this.w.setContentDescription(LocaleController.getString(R.string.Search));
                    EditTextBoldCursor searchField = this.w.getSearchField();
                    org.telegram.ui.ActionBar.r6.W(searchField, i13, getResourceProvider());
                    org.telegram.ui.ActionBar.r6.x(searchField, i13, getResourceProvider());
                    org.telegram.ui.ActionBar.r6.F(searchField, org.telegram.ui.ActionBar.k6.Vd, getResourceProvider());
                }
            } else if (messageObject.isLiveLocation()) {
                this.actionBar.setTitle(LocaleController.getString(R.string.AttachLiveLocation));
                org.telegram.ui.ActionBar.u0 c11 = m10.c(0, R.drawable.ic_ab_other, getResourceProvider());
                this.Z = c11;
                c11.e(6, R.drawable.filled_directions, LocaleController.getString(R.string.GetDirections));
            } else {
                String str = this.B0.messageOwner.media.title;
                if (str == null || str.length() <= 0) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.SharedPlace));
                }
                if (i14 != 3) {
                    org.telegram.ui.ActionBar.u0 c12 = m10.c(0, R.drawable.ic_ab_other, getResourceProvider());
                    this.Z = c12;
                    c12.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
                    if (!getLocationController().isSharingLocation(this.e0) && this.O0) {
                        this.Z.e(5, R.drawable.msg_location, LocaleController.getString(R.string.SendLiveLocationMenu));
                    }
                    this.Z.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                }
            }
        }
        qc0 qc0Var = new qc0(this, context);
        this.fragmentView = qc0Var;
        org.telegram.ui.ActionBar.r6.i(i12, qc0Var, getResourceProvider());
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s = mutate;
        int themedColor = getThemedColor(i12);
        this.R0 = themedColor;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        Rect rect = new Rect();
        this.s.getPadding(rect);
        FrameLayout.LayoutParams layoutParams = (i14 == 0 || i14 == 1) ? new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f) + rect.top) : new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(6.0f) + rect.top);
        layoutParams.gravity = 83;
        l0 l0Var = new l0(this, context, 11);
        this.S = l0Var;
        l0Var.setBackgroundDrawable(new org.telegram.ui.Components.ed(n0()));
        MessageObject messageObject2 = this.B0;
        if (!(messageObject2 == null && (i14 == 0 || i14 == 1)) && (messageObject2 == null || i14 != 3)) {
            z10 = false;
        } else {
            org.telegram.ui.Components.pl plVar = new org.telegram.ui.Components.pl(context, 1);
            this.e = plVar;
            plVar.setTranslationX(-AndroidUtilities.dp(80.0f));
            int dp = AndroidUtilities.dp(40.0f);
            int i15 = org.telegram.ui.ActionBar.k6.wi;
            int themedColor2 = getThemedColor(i15);
            int i16 = org.telegram.ui.ActionBar.k6.xi;
            int themedColor3 = getThemedColor(i16);
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3);
            w7.b6.a(this.e);
            this.e.setTranslationZ(AndroidUtilities.dp(2.0f));
            this.e.setOutlineProvider(zf.j0.b);
            org.telegram.ui.ActionBar.r6.S(this.e, j02, org.telegram.ui.ActionBar.r6.O(i15), org.telegram.ui.ActionBar.r6.O(i16), getResourceProvider());
            org.telegram.ui.ActionBar.r6.W(this.e, org.telegram.ui.ActionBar.k6.vi, getResourceProvider());
            this.e.setTextSize(1, 14.0f);
            this.e.setTypeface(AndroidUtilities.bold());
            this.e.setGravity(17);
            this.e.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.S.addView(this.e, w7.z5.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
            if (i14 == 3) {
                this.e.setText(LocaleController.getString(R.string.OpenInMaps));
                final int i17 = 5;
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yb0
                    public final /* synthetic */ sc0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        IMapsProvider.IMap iMap;
                        boolean z12;
                        int i18 = i17;
                        int i19 = 3;
                        sc0 sc0Var = this.b;
                        int i20 = 1;
                        switch (i18) {
                            case 0:
                                sc0Var.y0(false);
                                sc0Var.T.H(null, sc0Var.x0, true);
                                sc0Var.D0 = true;
                                sc0Var.x0();
                                break;
                            case 1:
                                sc0Var.d.M(null, null);
                                break;
                            case 2:
                                int i21 = sc0Var.G0;
                                Activity parentActivity = sc0Var.getParentActivity();
                                if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                                    if (sc0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sc0Var.getParentActivity());
                                        int i22 = R.raw.permission_request_location;
                                        int i23 = org.telegram.ui.ActionBar.k6.L5;
                                        alertDialog$Builder.m(i22, 72, sc0Var.getThemedColor(i23), null);
                                        alertDialog$Builder.n(i23, sc0Var.getResourceProvider());
                                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                        c2Var.T = replaceTags;
                                        alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new zb0(sc0Var, 1));
                                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                        sc0Var.showDialog(c2Var);
                                        break;
                                    }
                                } else if (sc0Var.d0() || i21 == 3) {
                                    if ((sc0Var.B0 == null || i21 == 3) && sc0Var.z0 == null) {
                                        if (sc0Var.w0 != null && sc0Var.I != null) {
                                            ImageView imageView = sc0Var.a;
                                            int i24 = org.telegram.ui.ActionBar.k6.vi;
                                            org.telegram.ui.ActionBar.r6.t(imageView, i24, sc0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                            sc0Var.a.setTag(Integer.valueOf(i24));
                                            sc0Var.T.L(null);
                                            sc0Var.C0 = false;
                                            sc0Var.y0(false);
                                            sc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(sc0Var.w0.getLatitude(), sc0Var.w0.getLongitude())));
                                            if (sc0Var.D0 && i21 != 8) {
                                                Location location3 = sc0Var.w0;
                                                if (location3 != null) {
                                                    sc0Var.T.H(null, location3, true);
                                                }
                                                sc0Var.D0 = false;
                                                sc0Var.x0();
                                            }
                                        }
                                    } else if (sc0Var.w0 != null && (iMap = sc0Var.I) != null) {
                                        iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(sc0Var.w0.getLatitude(), sc0Var.w0.getLongitude()), sc0Var.I.getMaxZoomLevel() - 4.0f));
                                    }
                                    if (sc0Var.m0 != null) {
                                        sc0Var.X.setVisibility(0);
                                        pc0 pc0Var = sc0Var.x;
                                        IMapsProvider.IMarker iMarker = sc0Var.m0;
                                        HashMap hashMap = pc0Var.a;
                                        View view2 = (View) hashMap.get(iMarker);
                                        if (view2 != null) {
                                            pc0Var.removeView(view2);
                                            hashMap.remove(iMarker);
                                        }
                                        sc0Var.m0 = null;
                                        sc0Var.n0 = null;
                                        sc0Var.o0 = null;
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                sc0Var.i0 = -1L;
                                sc0Var.C0 = true;
                                if (sc0Var.j0()) {
                                    sc0Var.j0 = true;
                                    sc0Var.z0(false, true);
                                    break;
                                }
                                break;
                            case 4:
                                if (sc0Var.getParentActivity() != null && sc0Var.w0 != null && sc0Var.d0() && sc0Var.I != null) {
                                    ei.x3 x3Var = sc0Var.y;
                                    if (x3Var != null) {
                                        x3Var.e(true);
                                    }
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = sc0Var.getLocationController().getSharingLocationInfo(sc0Var.e0);
                                    if (sc0Var.G) {
                                        sc0Var.F[0].d(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        sc0Var.c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = sc0Var.O;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            sc0Var.O = null;
                                        }
                                        sc0Var.G = true;
                                        sc0Var.m0().k(0L, 25, 0, null, new bc0(sc0Var, i20), new f80(14, sc0Var, sharingLocationInfo));
                                        break;
                                    } else {
                                        IMapsProvider.ICircle iCircle2 = sc0Var.O;
                                        if (iCircle2 == null) {
                                            sc0Var.e0(500);
                                        } else {
                                            sc0Var.P = iCircle2.getRadius();
                                        }
                                        TLRPC.User user = DialogObject.isUserDialog(sc0Var.e0) ? sc0Var.getMessagesController().getUser(Long.valueOf(sc0Var.e0)) : null;
                                        Activity parentActivity2 = sc0Var.getParentActivity();
                                        zb0 zb0Var = new zb0(sc0Var, i19);
                                        ks ksVar = new ks(21, sc0Var, user);
                                        bc0 bc0Var = new bc0(sc0Var, 2);
                                        org.telegram.ui.Components.ej0 ej0Var = new org.telegram.ui.Components.ej0(parentActivity2);
                                        ej0Var.a = null;
                                        ej0Var.d = -1;
                                        ej0Var.e = false;
                                        ej0Var.f = false;
                                        ej0Var.h = null;
                                        ej0Var.n = new Rect();
                                        new Paint();
                                        ej0Var.w = true;
                                        ej0Var.F = org.telegram.ui.Components.bs.h;
                                        ej0Var.setWillNotDraw(false);
                                        ej0Var.Q = bc0Var;
                                        ej0Var.y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                                        Rect rect2 = new Rect();
                                        Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                        org.telegram.ui.ActionBar.r6.z(ej0Var, mutate2, org.telegram.ui.ActionBar.k6.h5, null, PorterDuff.Mode.MULTIPLY);
                                        mutate2.getPadding(rect2);
                                        int i25 = rect2.left;
                                        ej0Var.x = i25;
                                        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(ej0Var.getContext());
                                        ej0Var.v = aj0Var;
                                        aj0Var.setBackgroundDrawable(mutate2);
                                        aj0Var.setPadding(i25, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i25, 0);
                                        aj0Var.setVisibility(4);
                                        ej0Var.addView(aj0Var, 0, w7.z5.e(-1, -2, 80));
                                        ej0Var.O = LocaleController.getUseImperialSystemType();
                                        ej0Var.M = user;
                                        ej0Var.I = zb0Var;
                                        org.telegram.ui.Components.qd0 qd0Var = new org.telegram.ui.Components.qd0(parentActivity2, null);
                                        ej0Var.G = qd0Var;
                                        qd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                        qd0Var.setItemCount(5);
                                        org.telegram.ui.Components.qd0 qd0Var2 = new org.telegram.ui.Components.qd0(parentActivity2, null);
                                        ej0Var.H = qd0Var2;
                                        qd0Var2.setItemCount(5);
                                        qd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                        org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(ej0Var, parentActivity2);
                                        ej0Var.P = bj0Var;
                                        bj0Var.setOrientation(1);
                                        FrameLayout frameLayout = new FrameLayout(parentActivity2);
                                        bj0Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                                        TextView textView = new TextView(parentActivity2);
                                        textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.j5, null, 1, 20.0f);
                                        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                        textView.setOnTouchListener(new di.d(20));
                                        LinearLayout linearLayout = new LinearLayout(parentActivity2);
                                        linearLayout.setOrientation(0);
                                        linearLayout.setWeightSum(1.0f);
                                        bj0Var.addView(linearLayout, w7.z5.n(-1, -2));
                                        System.currentTimeMillis();
                                        FrameLayout frameLayout2 = new FrameLayout(parentActivity2);
                                        TextView textView2 = new TextView(parentActivity2);
                                        ej0Var.K = textView2;
                                        org.telegram.ui.Components.cj0 cj0Var = new org.telegram.ui.Components.cj0(parentActivity2);
                                        ej0Var.J = cj0Var;
                                        linearLayout.addView(qd0Var, w7.z5.l(0.5f, 0, 270));
                                        qd0Var.setFormatter(new org.telegram.ui.Components.zi0(ej0Var, 0));
                                        qd0Var.setMinValue(0);
                                        qd0Var.setMaxValue(10);
                                        qd0Var.setWrapSelectorWheel(false);
                                        qd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                        org.telegram.ui.Components.zi0 zi0Var = new org.telegram.ui.Components.zi0(ej0Var, 1);
                                        qd0Var.setOnValueChangedListener(zi0Var);
                                        qd0Var2.setMinValue(0);
                                        qd0Var2.setMaxValue(10);
                                        qd0Var2.setWrapSelectorWheel(false);
                                        qd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                        linearLayout.addView(qd0Var2, w7.z5.l(0.5f, 0, 270));
                                        qd0Var2.setFormatter(new org.telegram.ui.Components.zi0(ej0Var, 2));
                                        qd0Var2.setOnValueChangedListener(zi0Var);
                                        qd0Var.setValue(0);
                                        qd0Var2.setValue(6);
                                        bj0Var.addView(frameLayout2, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                                        cj0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        cj0Var.setGravity(17);
                                        org.telegram.ui.ActionBar.r6.W(cj0Var, org.telegram.ui.ActionBar.k6.Sh, null);
                                        cj0Var.setTextSize(1, 14.0f);
                                        cj0Var.setMaxLines(2);
                                        cj0Var.setTypeface(AndroidUtilities.bold());
                                        cj0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                                        frameLayout2.addView(cj0Var, w7.z5.c(48.0f, -1));
                                        cj0Var.setOnClickListener(new org.telegram.ui.Components.ca(22, ej0Var, ksVar));
                                        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        textView2.setGravity(17);
                                        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.q5, null);
                                        textView2.setTextSize(1, 14.0f);
                                        textView2.setAlpha(0.0f);
                                        textView2.setScaleX(0.5f);
                                        textView2.setScaleY(0.5f);
                                        frameLayout2.addView(textView2, w7.z5.c(48.0f, -1));
                                        aj0Var.addView(bj0Var, w7.z5.e(-1, -2, 51));
                                        sc0Var.R = ej0Var;
                                        ((FrameLayout) sc0Var.fragmentView).addView(ej0Var, w7.z5.c(-1.0f, -1));
                                        org.telegram.ui.Components.ej0 ej0Var2 = sc0Var.R;
                                        ej0Var2.r = false;
                                        AnimatorSet animatorSet = ej0Var2.s;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                            ej0Var2.s = null;
                                        }
                                        org.telegram.ui.Components.aj0 aj0Var2 = ej0Var2.v;
                                        aj0Var2.measure(View.MeasureSpec.makeMeasureSpec((ej0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                        if (ej0Var2.r) {
                                            z12 = true;
                                        } else {
                                            aj0Var2.setVisibility(0);
                                            if (ej0Var2.w) {
                                                ej0Var2.setLayerType(2, null);
                                            }
                                            aj0Var2.setTranslationY(aj0Var2.getMeasuredHeight());
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            ej0Var2.s = animatorSet2;
                                            animatorSet2.playTogether(ObjectAnimator.ofFloat(aj0Var2, (Property<org.telegram.ui.Components.aj0, Float>) View.TRANSLATION_Y, 0.0f));
                                            ej0Var2.s.setDuration(400L);
                                            ej0Var2.s.setStartDelay(20L);
                                            ej0Var2.s.setInterpolator(ej0Var2.F);
                                            z12 = true;
                                            ej0Var2.s.addListener(new org.telegram.ui.Components.dj0(ej0Var2, 1 == true ? 1 : 0));
                                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                            ej0Var2.s.start();
                                        }
                                        ej0Var2.c(z12);
                                        break;
                                    }
                                }
                                break;
                            default:
                                sc0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = sc0Var.B0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    sc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    break;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                        }
                    }
                });
                z10 = false;
                this.e.setTranslationX(0.0f);
            } else {
                z10 = false;
                this.e.setText(LocaleController.getString(R.string.PlacesInThisArea));
                final int i18 = 0;
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yb0
                    public final /* synthetic */ sc0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        IMapsProvider.IMap iMap;
                        boolean z12;
                        int i182 = i18;
                        int i19 = 3;
                        sc0 sc0Var = this.b;
                        int i20 = 1;
                        switch (i182) {
                            case 0:
                                sc0Var.y0(false);
                                sc0Var.T.H(null, sc0Var.x0, true);
                                sc0Var.D0 = true;
                                sc0Var.x0();
                                break;
                            case 1:
                                sc0Var.d.M(null, null);
                                break;
                            case 2:
                                int i21 = sc0Var.G0;
                                Activity parentActivity = sc0Var.getParentActivity();
                                if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                                    if (sc0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sc0Var.getParentActivity());
                                        int i22 = R.raw.permission_request_location;
                                        int i23 = org.telegram.ui.ActionBar.k6.L5;
                                        alertDialog$Builder.m(i22, 72, sc0Var.getThemedColor(i23), null);
                                        alertDialog$Builder.n(i23, sc0Var.getResourceProvider());
                                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                        c2Var.T = replaceTags;
                                        alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new zb0(sc0Var, 1));
                                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                        sc0Var.showDialog(c2Var);
                                        break;
                                    }
                                } else if (sc0Var.d0() || i21 == 3) {
                                    if ((sc0Var.B0 == null || i21 == 3) && sc0Var.z0 == null) {
                                        if (sc0Var.w0 != null && sc0Var.I != null) {
                                            ImageView imageView = sc0Var.a;
                                            int i24 = org.telegram.ui.ActionBar.k6.vi;
                                            org.telegram.ui.ActionBar.r6.t(imageView, i24, sc0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                            sc0Var.a.setTag(Integer.valueOf(i24));
                                            sc0Var.T.L(null);
                                            sc0Var.C0 = false;
                                            sc0Var.y0(false);
                                            sc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(sc0Var.w0.getLatitude(), sc0Var.w0.getLongitude())));
                                            if (sc0Var.D0 && i21 != 8) {
                                                Location location3 = sc0Var.w0;
                                                if (location3 != null) {
                                                    sc0Var.T.H(null, location3, true);
                                                }
                                                sc0Var.D0 = false;
                                                sc0Var.x0();
                                            }
                                        }
                                    } else if (sc0Var.w0 != null && (iMap = sc0Var.I) != null) {
                                        iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(sc0Var.w0.getLatitude(), sc0Var.w0.getLongitude()), sc0Var.I.getMaxZoomLevel() - 4.0f));
                                    }
                                    if (sc0Var.m0 != null) {
                                        sc0Var.X.setVisibility(0);
                                        pc0 pc0Var = sc0Var.x;
                                        IMapsProvider.IMarker iMarker = sc0Var.m0;
                                        HashMap hashMap = pc0Var.a;
                                        View view2 = (View) hashMap.get(iMarker);
                                        if (view2 != null) {
                                            pc0Var.removeView(view2);
                                            hashMap.remove(iMarker);
                                        }
                                        sc0Var.m0 = null;
                                        sc0Var.n0 = null;
                                        sc0Var.o0 = null;
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                sc0Var.i0 = -1L;
                                sc0Var.C0 = true;
                                if (sc0Var.j0()) {
                                    sc0Var.j0 = true;
                                    sc0Var.z0(false, true);
                                    break;
                                }
                                break;
                            case 4:
                                if (sc0Var.getParentActivity() != null && sc0Var.w0 != null && sc0Var.d0() && sc0Var.I != null) {
                                    ei.x3 x3Var = sc0Var.y;
                                    if (x3Var != null) {
                                        x3Var.e(true);
                                    }
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = sc0Var.getLocationController().getSharingLocationInfo(sc0Var.e0);
                                    if (sc0Var.G) {
                                        sc0Var.F[0].d(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        sc0Var.c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = sc0Var.O;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            sc0Var.O = null;
                                        }
                                        sc0Var.G = true;
                                        sc0Var.m0().k(0L, 25, 0, null, new bc0(sc0Var, i20), new f80(14, sc0Var, sharingLocationInfo));
                                        break;
                                    } else {
                                        IMapsProvider.ICircle iCircle2 = sc0Var.O;
                                        if (iCircle2 == null) {
                                            sc0Var.e0(500);
                                        } else {
                                            sc0Var.P = iCircle2.getRadius();
                                        }
                                        TLRPC.User user = DialogObject.isUserDialog(sc0Var.e0) ? sc0Var.getMessagesController().getUser(Long.valueOf(sc0Var.e0)) : null;
                                        Activity parentActivity2 = sc0Var.getParentActivity();
                                        zb0 zb0Var = new zb0(sc0Var, i19);
                                        ks ksVar = new ks(21, sc0Var, user);
                                        bc0 bc0Var = new bc0(sc0Var, 2);
                                        org.telegram.ui.Components.ej0 ej0Var = new org.telegram.ui.Components.ej0(parentActivity2);
                                        ej0Var.a = null;
                                        ej0Var.d = -1;
                                        ej0Var.e = false;
                                        ej0Var.f = false;
                                        ej0Var.h = null;
                                        ej0Var.n = new Rect();
                                        new Paint();
                                        ej0Var.w = true;
                                        ej0Var.F = org.telegram.ui.Components.bs.h;
                                        ej0Var.setWillNotDraw(false);
                                        ej0Var.Q = bc0Var;
                                        ej0Var.y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                                        Rect rect2 = new Rect();
                                        Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                        org.telegram.ui.ActionBar.r6.z(ej0Var, mutate2, org.telegram.ui.ActionBar.k6.h5, null, PorterDuff.Mode.MULTIPLY);
                                        mutate2.getPadding(rect2);
                                        int i25 = rect2.left;
                                        ej0Var.x = i25;
                                        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(ej0Var.getContext());
                                        ej0Var.v = aj0Var;
                                        aj0Var.setBackgroundDrawable(mutate2);
                                        aj0Var.setPadding(i25, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i25, 0);
                                        aj0Var.setVisibility(4);
                                        ej0Var.addView(aj0Var, 0, w7.z5.e(-1, -2, 80));
                                        ej0Var.O = LocaleController.getUseImperialSystemType();
                                        ej0Var.M = user;
                                        ej0Var.I = zb0Var;
                                        org.telegram.ui.Components.qd0 qd0Var = new org.telegram.ui.Components.qd0(parentActivity2, null);
                                        ej0Var.G = qd0Var;
                                        qd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                        qd0Var.setItemCount(5);
                                        org.telegram.ui.Components.qd0 qd0Var2 = new org.telegram.ui.Components.qd0(parentActivity2, null);
                                        ej0Var.H = qd0Var2;
                                        qd0Var2.setItemCount(5);
                                        qd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                        org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(ej0Var, parentActivity2);
                                        ej0Var.P = bj0Var;
                                        bj0Var.setOrientation(1);
                                        FrameLayout frameLayout = new FrameLayout(parentActivity2);
                                        bj0Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                                        TextView textView = new TextView(parentActivity2);
                                        textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.j5, null, 1, 20.0f);
                                        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                        textView.setOnTouchListener(new di.d(20));
                                        LinearLayout linearLayout = new LinearLayout(parentActivity2);
                                        linearLayout.setOrientation(0);
                                        linearLayout.setWeightSum(1.0f);
                                        bj0Var.addView(linearLayout, w7.z5.n(-1, -2));
                                        System.currentTimeMillis();
                                        FrameLayout frameLayout2 = new FrameLayout(parentActivity2);
                                        TextView textView2 = new TextView(parentActivity2);
                                        ej0Var.K = textView2;
                                        org.telegram.ui.Components.cj0 cj0Var = new org.telegram.ui.Components.cj0(parentActivity2);
                                        ej0Var.J = cj0Var;
                                        linearLayout.addView(qd0Var, w7.z5.l(0.5f, 0, 270));
                                        qd0Var.setFormatter(new org.telegram.ui.Components.zi0(ej0Var, 0));
                                        qd0Var.setMinValue(0);
                                        qd0Var.setMaxValue(10);
                                        qd0Var.setWrapSelectorWheel(false);
                                        qd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                        org.telegram.ui.Components.zi0 zi0Var = new org.telegram.ui.Components.zi0(ej0Var, 1);
                                        qd0Var.setOnValueChangedListener(zi0Var);
                                        qd0Var2.setMinValue(0);
                                        qd0Var2.setMaxValue(10);
                                        qd0Var2.setWrapSelectorWheel(false);
                                        qd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                        linearLayout.addView(qd0Var2, w7.z5.l(0.5f, 0, 270));
                                        qd0Var2.setFormatter(new org.telegram.ui.Components.zi0(ej0Var, 2));
                                        qd0Var2.setOnValueChangedListener(zi0Var);
                                        qd0Var.setValue(0);
                                        qd0Var2.setValue(6);
                                        bj0Var.addView(frameLayout2, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                                        cj0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        cj0Var.setGravity(17);
                                        org.telegram.ui.ActionBar.r6.W(cj0Var, org.telegram.ui.ActionBar.k6.Sh, null);
                                        cj0Var.setTextSize(1, 14.0f);
                                        cj0Var.setMaxLines(2);
                                        cj0Var.setTypeface(AndroidUtilities.bold());
                                        cj0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                                        frameLayout2.addView(cj0Var, w7.z5.c(48.0f, -1));
                                        cj0Var.setOnClickListener(new org.telegram.ui.Components.ca(22, ej0Var, ksVar));
                                        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        textView2.setGravity(17);
                                        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.q5, null);
                                        textView2.setTextSize(1, 14.0f);
                                        textView2.setAlpha(0.0f);
                                        textView2.setScaleX(0.5f);
                                        textView2.setScaleY(0.5f);
                                        frameLayout2.addView(textView2, w7.z5.c(48.0f, -1));
                                        aj0Var.addView(bj0Var, w7.z5.e(-1, -2, 51));
                                        sc0Var.R = ej0Var;
                                        ((FrameLayout) sc0Var.fragmentView).addView(ej0Var, w7.z5.c(-1.0f, -1));
                                        org.telegram.ui.Components.ej0 ej0Var2 = sc0Var.R;
                                        ej0Var2.r = false;
                                        AnimatorSet animatorSet = ej0Var2.s;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                            ej0Var2.s = null;
                                        }
                                        org.telegram.ui.Components.aj0 aj0Var2 = ej0Var2.v;
                                        aj0Var2.measure(View.MeasureSpec.makeMeasureSpec((ej0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                        if (ej0Var2.r) {
                                            z12 = true;
                                        } else {
                                            aj0Var2.setVisibility(0);
                                            if (ej0Var2.w) {
                                                ej0Var2.setLayerType(2, null);
                                            }
                                            aj0Var2.setTranslationY(aj0Var2.getMeasuredHeight());
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            ej0Var2.s = animatorSet2;
                                            animatorSet2.playTogether(ObjectAnimator.ofFloat(aj0Var2, (Property<org.telegram.ui.Components.aj0, Float>) View.TRANSLATION_Y, 0.0f));
                                            ej0Var2.s.setDuration(400L);
                                            ej0Var2.s.setStartDelay(20L);
                                            ej0Var2.s.setInterpolator(ej0Var2.F);
                                            z12 = true;
                                            ej0Var2.s.addListener(new org.telegram.ui.Components.dj0(ej0Var2, 1 == true ? 1 : 0));
                                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                            ej0Var2.s.start();
                                        }
                                        ej0Var2.c(z12);
                                        break;
                                    }
                                }
                                break;
                            default:
                                sc0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = sc0Var.B0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    sc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    break;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                        }
                    }
                });
            }
        }
        int i19 = org.telegram.ui.ActionBar.k6.ui;
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(i19), false, getResourceProvider());
        this.d = u0Var;
        u0Var.setClickable(true);
        this.d.setSubMenuOpenSide(2);
        this.d.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        this.d.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        this.d.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), getResourceProvider());
        this.d.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), getResourceProvider());
        this.d.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), getResourceProvider());
        this.d.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int dp2 = AndroidUtilities.dp(40.0f);
        int i20 = org.telegram.ui.ActionBar.k6.wi;
        int themedColor4 = getThemedColor(i20);
        int i21 = org.telegram.ui.ActionBar.k6.xi;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.k6.i0(dp2, themedColor4, getThemedColor(i21));
        w7.b6.a(this.d);
        this.d.setTranslationZ(AndroidUtilities.dp(2.0f));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.d;
        ci.n1 n1Var = zf.j0.a;
        u0Var2.setOutlineProvider(n1Var);
        org.telegram.ui.ActionBar.r6.S(this.d, i02, org.telegram.ui.ActionBar.r6.O(i20), org.telegram.ui.ActionBar.r6.O(i21), getResourceProvider());
        this.d.setIcon(R.drawable.msg_map_type);
        this.S.addView(this.d, w7.z5.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        final int i22 = 1;
        this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yb0
            public final /* synthetic */ sc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                boolean z12;
                int i182 = i22;
                int i192 = 3;
                sc0 sc0Var = this.b;
                int i202 = 1;
                switch (i182) {
                    case 0:
                        sc0Var.y0(false);
                        sc0Var.T.H(null, sc0Var.x0, true);
                        sc0Var.D0 = true;
                        sc0Var.x0();
                        break;
                    case 1:
                        sc0Var.d.M(null, null);
                        break;
                    case 2:
                        int i212 = sc0Var.G0;
                        Activity parentActivity = sc0Var.getParentActivity();
                        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (sc0Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sc0Var.getParentActivity());
                                int i222 = R.raw.permission_request_location;
                                int i23 = org.telegram.ui.ActionBar.k6.L5;
                                alertDialog$Builder.m(i222, 72, sc0Var.getThemedColor(i23), null);
                                alertDialog$Builder.n(i23, sc0Var.getResourceProvider());
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                c2Var.T = replaceTags;
                                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new zb0(sc0Var, 1));
                                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                sc0Var.showDialog(c2Var);
                                break;
                            }
                        } else if (sc0Var.d0() || i212 == 3) {
                            if ((sc0Var.B0 == null || i212 == 3) && sc0Var.z0 == null) {
                                if (sc0Var.w0 != null && sc0Var.I != null) {
                                    ImageView imageView = sc0Var.a;
                                    int i24 = org.telegram.ui.ActionBar.k6.vi;
                                    org.telegram.ui.ActionBar.r6.t(imageView, i24, sc0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                    sc0Var.a.setTag(Integer.valueOf(i24));
                                    sc0Var.T.L(null);
                                    sc0Var.C0 = false;
                                    sc0Var.y0(false);
                                    sc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(sc0Var.w0.getLatitude(), sc0Var.w0.getLongitude())));
                                    if (sc0Var.D0 && i212 != 8) {
                                        Location location3 = sc0Var.w0;
                                        if (location3 != null) {
                                            sc0Var.T.H(null, location3, true);
                                        }
                                        sc0Var.D0 = false;
                                        sc0Var.x0();
                                    }
                                }
                            } else if (sc0Var.w0 != null && (iMap = sc0Var.I) != null) {
                                iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(sc0Var.w0.getLatitude(), sc0Var.w0.getLongitude()), sc0Var.I.getMaxZoomLevel() - 4.0f));
                            }
                            if (sc0Var.m0 != null) {
                                sc0Var.X.setVisibility(0);
                                pc0 pc0Var = sc0Var.x;
                                IMapsProvider.IMarker iMarker = sc0Var.m0;
                                HashMap hashMap = pc0Var.a;
                                View view2 = (View) hashMap.get(iMarker);
                                if (view2 != null) {
                                    pc0Var.removeView(view2);
                                    hashMap.remove(iMarker);
                                }
                                sc0Var.m0 = null;
                                sc0Var.n0 = null;
                                sc0Var.o0 = null;
                                break;
                            }
                        }
                        break;
                    case 3:
                        sc0Var.i0 = -1L;
                        sc0Var.C0 = true;
                        if (sc0Var.j0()) {
                            sc0Var.j0 = true;
                            sc0Var.z0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (sc0Var.getParentActivity() != null && sc0Var.w0 != null && sc0Var.d0() && sc0Var.I != null) {
                            ei.x3 x3Var = sc0Var.y;
                            if (x3Var != null) {
                                x3Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = sc0Var.getLocationController().getSharingLocationInfo(sc0Var.e0);
                            if (sc0Var.G) {
                                sc0Var.F[0].d(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                sc0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = sc0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    sc0Var.O = null;
                                }
                                sc0Var.G = true;
                                sc0Var.m0().k(0L, 25, 0, null, new bc0(sc0Var, i202), new f80(14, sc0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = sc0Var.O;
                                if (iCircle2 == null) {
                                    sc0Var.e0(500);
                                } else {
                                    sc0Var.P = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(sc0Var.e0) ? sc0Var.getMessagesController().getUser(Long.valueOf(sc0Var.e0)) : null;
                                Activity parentActivity2 = sc0Var.getParentActivity();
                                zb0 zb0Var = new zb0(sc0Var, i192);
                                ks ksVar = new ks(21, sc0Var, user);
                                bc0 bc0Var = new bc0(sc0Var, 2);
                                org.telegram.ui.Components.ej0 ej0Var = new org.telegram.ui.Components.ej0(parentActivity2);
                                ej0Var.a = null;
                                ej0Var.d = -1;
                                ej0Var.e = false;
                                ej0Var.f = false;
                                ej0Var.h = null;
                                ej0Var.n = new Rect();
                                new Paint();
                                ej0Var.w = true;
                                ej0Var.F = org.telegram.ui.Components.bs.h;
                                ej0Var.setWillNotDraw(false);
                                ej0Var.Q = bc0Var;
                                ej0Var.y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                org.telegram.ui.ActionBar.r6.z(ej0Var, mutate2, org.telegram.ui.ActionBar.k6.h5, null, PorterDuff.Mode.MULTIPLY);
                                mutate2.getPadding(rect2);
                                int i25 = rect2.left;
                                ej0Var.x = i25;
                                org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(ej0Var.getContext());
                                ej0Var.v = aj0Var;
                                aj0Var.setBackgroundDrawable(mutate2);
                                aj0Var.setPadding(i25, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i25, 0);
                                aj0Var.setVisibility(4);
                                ej0Var.addView(aj0Var, 0, w7.z5.e(-1, -2, 80));
                                ej0Var.O = LocaleController.getUseImperialSystemType();
                                ej0Var.M = user;
                                ej0Var.I = zb0Var;
                                org.telegram.ui.Components.qd0 qd0Var = new org.telegram.ui.Components.qd0(parentActivity2, null);
                                ej0Var.G = qd0Var;
                                qd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                qd0Var.setItemCount(5);
                                org.telegram.ui.Components.qd0 qd0Var2 = new org.telegram.ui.Components.qd0(parentActivity2, null);
                                ej0Var.H = qd0Var2;
                                qd0Var2.setItemCount(5);
                                qd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(ej0Var, parentActivity2);
                                ej0Var.P = bj0Var;
                                bj0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity2);
                                bj0Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(parentActivity2);
                                textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.j5, null, 1, 20.0f);
                                frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new di.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity2);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                bj0Var.addView(linearLayout, w7.z5.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity2);
                                TextView textView2 = new TextView(parentActivity2);
                                ej0Var.K = textView2;
                                org.telegram.ui.Components.cj0 cj0Var = new org.telegram.ui.Components.cj0(parentActivity2);
                                ej0Var.J = cj0Var;
                                linearLayout.addView(qd0Var, w7.z5.l(0.5f, 0, 270));
                                qd0Var.setFormatter(new org.telegram.ui.Components.zi0(ej0Var, 0));
                                qd0Var.setMinValue(0);
                                qd0Var.setMaxValue(10);
                                qd0Var.setWrapSelectorWheel(false);
                                qd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.zi0 zi0Var = new org.telegram.ui.Components.zi0(ej0Var, 1);
                                qd0Var.setOnValueChangedListener(zi0Var);
                                qd0Var2.setMinValue(0);
                                qd0Var2.setMaxValue(10);
                                qd0Var2.setWrapSelectorWheel(false);
                                qd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(qd0Var2, w7.z5.l(0.5f, 0, 270));
                                qd0Var2.setFormatter(new org.telegram.ui.Components.zi0(ej0Var, 2));
                                qd0Var2.setOnValueChangedListener(zi0Var);
                                qd0Var.setValue(0);
                                qd0Var2.setValue(6);
                                bj0Var.addView(frameLayout2, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                                cj0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                cj0Var.setGravity(17);
                                org.telegram.ui.ActionBar.r6.W(cj0Var, org.telegram.ui.ActionBar.k6.Sh, null);
                                cj0Var.setTextSize(1, 14.0f);
                                cj0Var.setMaxLines(2);
                                cj0Var.setTypeface(AndroidUtilities.bold());
                                cj0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                                frameLayout2.addView(cj0Var, w7.z5.c(48.0f, -1));
                                cj0Var.setOnClickListener(new org.telegram.ui.Components.ca(22, ej0Var, ksVar));
                                textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView2.setGravity(17);
                                org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.q5, null);
                                textView2.setTextSize(1, 14.0f);
                                textView2.setAlpha(0.0f);
                                textView2.setScaleX(0.5f);
                                textView2.setScaleY(0.5f);
                                frameLayout2.addView(textView2, w7.z5.c(48.0f, -1));
                                aj0Var.addView(bj0Var, w7.z5.e(-1, -2, 51));
                                sc0Var.R = ej0Var;
                                ((FrameLayout) sc0Var.fragmentView).addView(ej0Var, w7.z5.c(-1.0f, -1));
                                org.telegram.ui.Components.ej0 ej0Var2 = sc0Var.R;
                                ej0Var2.r = false;
                                AnimatorSet animatorSet = ej0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    ej0Var2.s = null;
                                }
                                org.telegram.ui.Components.aj0 aj0Var2 = ej0Var2.v;
                                aj0Var2.measure(View.MeasureSpec.makeMeasureSpec((ej0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (ej0Var2.r) {
                                    z12 = true;
                                } else {
                                    aj0Var2.setVisibility(0);
                                    if (ej0Var2.w) {
                                        ej0Var2.setLayerType(2, null);
                                    }
                                    aj0Var2.setTranslationY(aj0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    ej0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(aj0Var2, (Property<org.telegram.ui.Components.aj0, Float>) View.TRANSLATION_Y, 0.0f));
                                    ej0Var2.s.setDuration(400L);
                                    ej0Var2.s.setStartDelay(20L);
                                    ej0Var2.s.setInterpolator(ej0Var2.F);
                                    z12 = true;
                                    ej0Var2.s.addListener(new org.telegram.ui.Components.dj0(ej0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    ej0Var2.s.start();
                                }
                                ej0Var2.c(z12);
                                break;
                            }
                        }
                        break;
                    default:
                        sc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = sc0Var.B0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            sc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                }
            }
        });
        this.d.setDelegate(new zb0(this, 0));
        this.a = new ImageView(context);
        org.telegram.ui.Cells.y i03 = org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(40.0f), getThemedColor(i20), getThemedColor(i21));
        w7.b6.a(this.a);
        this.a.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.a.setOutlineProvider(n1Var);
        org.telegram.ui.ActionBar.r6.S(this.a, i03, org.telegram.ui.ActionBar.r6.O(i20), org.telegram.ui.ActionBar.r6.O(i21), getResourceProvider());
        this.a.setImageResource(R.drawable.msg_current_location);
        ImageView imageView = this.a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.a;
        int i23 = org.telegram.ui.ActionBar.k6.vi;
        org.telegram.ui.ActionBar.r6.t(imageView2, i23, getResourceProvider(), mode);
        this.a.setTag(Integer.valueOf(i23));
        this.a.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        FrameLayout.LayoutParams d = w7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f);
        d.bottomMargin = (layoutParams.height - rect.top) + d.bottomMargin;
        this.S.addView(this.a, d);
        final int i24 = 2;
        this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yb0
            public final /* synthetic */ sc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                boolean z12;
                int i182 = i24;
                int i192 = 3;
                sc0 sc0Var = this.b;
                int i202 = 1;
                switch (i182) {
                    case 0:
                        sc0Var.y0(false);
                        sc0Var.T.H(null, sc0Var.x0, true);
                        sc0Var.D0 = true;
                        sc0Var.x0();
                        break;
                    case 1:
                        sc0Var.d.M(null, null);
                        break;
                    case 2:
                        int i212 = sc0Var.G0;
                        Activity parentActivity = sc0Var.getParentActivity();
                        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (sc0Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sc0Var.getParentActivity());
                                int i222 = R.raw.permission_request_location;
                                int i232 = org.telegram.ui.ActionBar.k6.L5;
                                alertDialog$Builder.m(i222, 72, sc0Var.getThemedColor(i232), null);
                                alertDialog$Builder.n(i232, sc0Var.getResourceProvider());
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                c2Var.T = replaceTags;
                                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new zb0(sc0Var, 1));
                                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                sc0Var.showDialog(c2Var);
                                break;
                            }
                        } else if (sc0Var.d0() || i212 == 3) {
                            if ((sc0Var.B0 == null || i212 == 3) && sc0Var.z0 == null) {
                                if (sc0Var.w0 != null && sc0Var.I != null) {
                                    ImageView imageView3 = sc0Var.a;
                                    int i242 = org.telegram.ui.ActionBar.k6.vi;
                                    org.telegram.ui.ActionBar.r6.t(imageView3, i242, sc0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                    sc0Var.a.setTag(Integer.valueOf(i242));
                                    sc0Var.T.L(null);
                                    sc0Var.C0 = false;
                                    sc0Var.y0(false);
                                    sc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(sc0Var.w0.getLatitude(), sc0Var.w0.getLongitude())));
                                    if (sc0Var.D0 && i212 != 8) {
                                        Location location3 = sc0Var.w0;
                                        if (location3 != null) {
                                            sc0Var.T.H(null, location3, true);
                                        }
                                        sc0Var.D0 = false;
                                        sc0Var.x0();
                                    }
                                }
                            } else if (sc0Var.w0 != null && (iMap = sc0Var.I) != null) {
                                iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(sc0Var.w0.getLatitude(), sc0Var.w0.getLongitude()), sc0Var.I.getMaxZoomLevel() - 4.0f));
                            }
                            if (sc0Var.m0 != null) {
                                sc0Var.X.setVisibility(0);
                                pc0 pc0Var = sc0Var.x;
                                IMapsProvider.IMarker iMarker = sc0Var.m0;
                                HashMap hashMap = pc0Var.a;
                                View view2 = (View) hashMap.get(iMarker);
                                if (view2 != null) {
                                    pc0Var.removeView(view2);
                                    hashMap.remove(iMarker);
                                }
                                sc0Var.m0 = null;
                                sc0Var.n0 = null;
                                sc0Var.o0 = null;
                                break;
                            }
                        }
                        break;
                    case 3:
                        sc0Var.i0 = -1L;
                        sc0Var.C0 = true;
                        if (sc0Var.j0()) {
                            sc0Var.j0 = true;
                            sc0Var.z0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (sc0Var.getParentActivity() != null && sc0Var.w0 != null && sc0Var.d0() && sc0Var.I != null) {
                            ei.x3 x3Var = sc0Var.y;
                            if (x3Var != null) {
                                x3Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = sc0Var.getLocationController().getSharingLocationInfo(sc0Var.e0);
                            if (sc0Var.G) {
                                sc0Var.F[0].d(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                sc0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = sc0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    sc0Var.O = null;
                                }
                                sc0Var.G = true;
                                sc0Var.m0().k(0L, 25, 0, null, new bc0(sc0Var, i202), new f80(14, sc0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = sc0Var.O;
                                if (iCircle2 == null) {
                                    sc0Var.e0(500);
                                } else {
                                    sc0Var.P = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(sc0Var.e0) ? sc0Var.getMessagesController().getUser(Long.valueOf(sc0Var.e0)) : null;
                                Activity parentActivity2 = sc0Var.getParentActivity();
                                zb0 zb0Var = new zb0(sc0Var, i192);
                                ks ksVar = new ks(21, sc0Var, user);
                                bc0 bc0Var = new bc0(sc0Var, 2);
                                org.telegram.ui.Components.ej0 ej0Var = new org.telegram.ui.Components.ej0(parentActivity2);
                                ej0Var.a = null;
                                ej0Var.d = -1;
                                ej0Var.e = false;
                                ej0Var.f = false;
                                ej0Var.h = null;
                                ej0Var.n = new Rect();
                                new Paint();
                                ej0Var.w = true;
                                ej0Var.F = org.telegram.ui.Components.bs.h;
                                ej0Var.setWillNotDraw(false);
                                ej0Var.Q = bc0Var;
                                ej0Var.y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                org.telegram.ui.ActionBar.r6.z(ej0Var, mutate2, org.telegram.ui.ActionBar.k6.h5, null, PorterDuff.Mode.MULTIPLY);
                                mutate2.getPadding(rect2);
                                int i25 = rect2.left;
                                ej0Var.x = i25;
                                org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(ej0Var.getContext());
                                ej0Var.v = aj0Var;
                                aj0Var.setBackgroundDrawable(mutate2);
                                aj0Var.setPadding(i25, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i25, 0);
                                aj0Var.setVisibility(4);
                                ej0Var.addView(aj0Var, 0, w7.z5.e(-1, -2, 80));
                                ej0Var.O = LocaleController.getUseImperialSystemType();
                                ej0Var.M = user;
                                ej0Var.I = zb0Var;
                                org.telegram.ui.Components.qd0 qd0Var = new org.telegram.ui.Components.qd0(parentActivity2, null);
                                ej0Var.G = qd0Var;
                                qd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                qd0Var.setItemCount(5);
                                org.telegram.ui.Components.qd0 qd0Var2 = new org.telegram.ui.Components.qd0(parentActivity2, null);
                                ej0Var.H = qd0Var2;
                                qd0Var2.setItemCount(5);
                                qd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(ej0Var, parentActivity2);
                                ej0Var.P = bj0Var;
                                bj0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity2);
                                bj0Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(parentActivity2);
                                textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.j5, null, 1, 20.0f);
                                frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new di.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity2);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                bj0Var.addView(linearLayout, w7.z5.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity2);
                                TextView textView2 = new TextView(parentActivity2);
                                ej0Var.K = textView2;
                                org.telegram.ui.Components.cj0 cj0Var = new org.telegram.ui.Components.cj0(parentActivity2);
                                ej0Var.J = cj0Var;
                                linearLayout.addView(qd0Var, w7.z5.l(0.5f, 0, 270));
                                qd0Var.setFormatter(new org.telegram.ui.Components.zi0(ej0Var, 0));
                                qd0Var.setMinValue(0);
                                qd0Var.setMaxValue(10);
                                qd0Var.setWrapSelectorWheel(false);
                                qd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.zi0 zi0Var = new org.telegram.ui.Components.zi0(ej0Var, 1);
                                qd0Var.setOnValueChangedListener(zi0Var);
                                qd0Var2.setMinValue(0);
                                qd0Var2.setMaxValue(10);
                                qd0Var2.setWrapSelectorWheel(false);
                                qd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(qd0Var2, w7.z5.l(0.5f, 0, 270));
                                qd0Var2.setFormatter(new org.telegram.ui.Components.zi0(ej0Var, 2));
                                qd0Var2.setOnValueChangedListener(zi0Var);
                                qd0Var.setValue(0);
                                qd0Var2.setValue(6);
                                bj0Var.addView(frameLayout2, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                                cj0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                cj0Var.setGravity(17);
                                org.telegram.ui.ActionBar.r6.W(cj0Var, org.telegram.ui.ActionBar.k6.Sh, null);
                                cj0Var.setTextSize(1, 14.0f);
                                cj0Var.setMaxLines(2);
                                cj0Var.setTypeface(AndroidUtilities.bold());
                                cj0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                                frameLayout2.addView(cj0Var, w7.z5.c(48.0f, -1));
                                cj0Var.setOnClickListener(new org.telegram.ui.Components.ca(22, ej0Var, ksVar));
                                textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView2.setGravity(17);
                                org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.q5, null);
                                textView2.setTextSize(1, 14.0f);
                                textView2.setAlpha(0.0f);
                                textView2.setScaleX(0.5f);
                                textView2.setScaleY(0.5f);
                                frameLayout2.addView(textView2, w7.z5.c(48.0f, -1));
                                aj0Var.addView(bj0Var, w7.z5.e(-1, -2, 51));
                                sc0Var.R = ej0Var;
                                ((FrameLayout) sc0Var.fragmentView).addView(ej0Var, w7.z5.c(-1.0f, -1));
                                org.telegram.ui.Components.ej0 ej0Var2 = sc0Var.R;
                                ej0Var2.r = false;
                                AnimatorSet animatorSet = ej0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    ej0Var2.s = null;
                                }
                                org.telegram.ui.Components.aj0 aj0Var2 = ej0Var2.v;
                                aj0Var2.measure(View.MeasureSpec.makeMeasureSpec((ej0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (ej0Var2.r) {
                                    z12 = true;
                                } else {
                                    aj0Var2.setVisibility(0);
                                    if (ej0Var2.w) {
                                        ej0Var2.setLayerType(2, null);
                                    }
                                    aj0Var2.setTranslationY(aj0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    ej0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(aj0Var2, (Property<org.telegram.ui.Components.aj0, Float>) View.TRANSLATION_Y, 0.0f));
                                    ej0Var2.s.setDuration(400L);
                                    ej0Var2.s.setStartDelay(20L);
                                    ej0Var2.s.setInterpolator(ej0Var2.F);
                                    z12 = true;
                                    ej0Var2.s.addListener(new org.telegram.ui.Components.dj0(ej0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    ej0Var2.s.start();
                                }
                                ej0Var2.c(z12);
                                break;
                            }
                        }
                        break;
                    default:
                        sc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = sc0Var.B0.messageOwner.media.geo;
                            double d10 = geoPoint.lat;
                            double d102 = geoPoint._long;
                            sc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d10 + "," + d102 + "?q=" + d10 + "," + d102)));
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                }
            }
        });
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(17);
        this.b.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.b.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.r6.W(this.b, org.telegram.ui.ActionBar.k6.Oh, this.resourceProvider);
        this.b.setTypeface(AndroidUtilities.bold());
        this.b.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.b.setText(LocaleController.getString(R.string.LocationsShowAll));
        org.telegram.ui.ActionBar.r6.S(this.b, org.telegram.ui.ActionBar.k6.a0(getThemedColor(i20), getThemedColor(i21), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)), org.telegram.ui.ActionBar.r6.O(i20), org.telegram.ui.ActionBar.r6.O(i21), getResourceProvider());
        FrameLayout.LayoutParams d10 = w7.z5.d(-2, 38.0f, 81, 12.0f, 0.0f, 12.0f, 12.0f);
        d10.bottomMargin = (layoutParams.height - rect.top) + d10.bottomMargin;
        this.S.addView(this.b, d10);
        w7.b6.a(this.b);
        final int i25 = 3;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yb0
            public final /* synthetic */ sc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                boolean z12;
                int i182 = i25;
                int i192 = 3;
                sc0 sc0Var = this.b;
                int i202 = 1;
                switch (i182) {
                    case 0:
                        sc0Var.y0(false);
                        sc0Var.T.H(null, sc0Var.x0, true);
                        sc0Var.D0 = true;
                        sc0Var.x0();
                        break;
                    case 1:
                        sc0Var.d.M(null, null);
                        break;
                    case 2:
                        int i212 = sc0Var.G0;
                        Activity parentActivity = sc0Var.getParentActivity();
                        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (sc0Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sc0Var.getParentActivity());
                                int i222 = R.raw.permission_request_location;
                                int i232 = org.telegram.ui.ActionBar.k6.L5;
                                alertDialog$Builder.m(i222, 72, sc0Var.getThemedColor(i232), null);
                                alertDialog$Builder.n(i232, sc0Var.getResourceProvider());
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                c2Var.T = replaceTags;
                                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new zb0(sc0Var, 1));
                                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                sc0Var.showDialog(c2Var);
                                break;
                            }
                        } else if (sc0Var.d0() || i212 == 3) {
                            if ((sc0Var.B0 == null || i212 == 3) && sc0Var.z0 == null) {
                                if (sc0Var.w0 != null && sc0Var.I != null) {
                                    ImageView imageView3 = sc0Var.a;
                                    int i242 = org.telegram.ui.ActionBar.k6.vi;
                                    org.telegram.ui.ActionBar.r6.t(imageView3, i242, sc0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                    sc0Var.a.setTag(Integer.valueOf(i242));
                                    sc0Var.T.L(null);
                                    sc0Var.C0 = false;
                                    sc0Var.y0(false);
                                    sc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(sc0Var.w0.getLatitude(), sc0Var.w0.getLongitude())));
                                    if (sc0Var.D0 && i212 != 8) {
                                        Location location3 = sc0Var.w0;
                                        if (location3 != null) {
                                            sc0Var.T.H(null, location3, true);
                                        }
                                        sc0Var.D0 = false;
                                        sc0Var.x0();
                                    }
                                }
                            } else if (sc0Var.w0 != null && (iMap = sc0Var.I) != null) {
                                iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(sc0Var.w0.getLatitude(), sc0Var.w0.getLongitude()), sc0Var.I.getMaxZoomLevel() - 4.0f));
                            }
                            if (sc0Var.m0 != null) {
                                sc0Var.X.setVisibility(0);
                                pc0 pc0Var = sc0Var.x;
                                IMapsProvider.IMarker iMarker = sc0Var.m0;
                                HashMap hashMap = pc0Var.a;
                                View view2 = (View) hashMap.get(iMarker);
                                if (view2 != null) {
                                    pc0Var.removeView(view2);
                                    hashMap.remove(iMarker);
                                }
                                sc0Var.m0 = null;
                                sc0Var.n0 = null;
                                sc0Var.o0 = null;
                                break;
                            }
                        }
                        break;
                    case 3:
                        sc0Var.i0 = -1L;
                        sc0Var.C0 = true;
                        if (sc0Var.j0()) {
                            sc0Var.j0 = true;
                            sc0Var.z0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (sc0Var.getParentActivity() != null && sc0Var.w0 != null && sc0Var.d0() && sc0Var.I != null) {
                            ei.x3 x3Var = sc0Var.y;
                            if (x3Var != null) {
                                x3Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = sc0Var.getLocationController().getSharingLocationInfo(sc0Var.e0);
                            if (sc0Var.G) {
                                sc0Var.F[0].d(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                sc0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = sc0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    sc0Var.O = null;
                                }
                                sc0Var.G = true;
                                sc0Var.m0().k(0L, 25, 0, null, new bc0(sc0Var, i202), new f80(14, sc0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = sc0Var.O;
                                if (iCircle2 == null) {
                                    sc0Var.e0(500);
                                } else {
                                    sc0Var.P = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(sc0Var.e0) ? sc0Var.getMessagesController().getUser(Long.valueOf(sc0Var.e0)) : null;
                                Activity parentActivity2 = sc0Var.getParentActivity();
                                zb0 zb0Var = new zb0(sc0Var, i192);
                                ks ksVar = new ks(21, sc0Var, user);
                                bc0 bc0Var = new bc0(sc0Var, 2);
                                org.telegram.ui.Components.ej0 ej0Var = new org.telegram.ui.Components.ej0(parentActivity2);
                                ej0Var.a = null;
                                ej0Var.d = -1;
                                ej0Var.e = false;
                                ej0Var.f = false;
                                ej0Var.h = null;
                                ej0Var.n = new Rect();
                                new Paint();
                                ej0Var.w = true;
                                ej0Var.F = org.telegram.ui.Components.bs.h;
                                ej0Var.setWillNotDraw(false);
                                ej0Var.Q = bc0Var;
                                ej0Var.y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                org.telegram.ui.ActionBar.r6.z(ej0Var, mutate2, org.telegram.ui.ActionBar.k6.h5, null, PorterDuff.Mode.MULTIPLY);
                                mutate2.getPadding(rect2);
                                int i252 = rect2.left;
                                ej0Var.x = i252;
                                org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(ej0Var.getContext());
                                ej0Var.v = aj0Var;
                                aj0Var.setBackgroundDrawable(mutate2);
                                aj0Var.setPadding(i252, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i252, 0);
                                aj0Var.setVisibility(4);
                                ej0Var.addView(aj0Var, 0, w7.z5.e(-1, -2, 80));
                                ej0Var.O = LocaleController.getUseImperialSystemType();
                                ej0Var.M = user;
                                ej0Var.I = zb0Var;
                                org.telegram.ui.Components.qd0 qd0Var = new org.telegram.ui.Components.qd0(parentActivity2, null);
                                ej0Var.G = qd0Var;
                                qd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                qd0Var.setItemCount(5);
                                org.telegram.ui.Components.qd0 qd0Var2 = new org.telegram.ui.Components.qd0(parentActivity2, null);
                                ej0Var.H = qd0Var2;
                                qd0Var2.setItemCount(5);
                                qd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(ej0Var, parentActivity2);
                                ej0Var.P = bj0Var;
                                bj0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity2);
                                bj0Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView2 = new TextView(parentActivity2);
                                textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.v0.q(textView2, org.telegram.ui.ActionBar.k6.j5, null, 1, 20.0f);
                                frameLayout.addView(textView2, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView2.setOnTouchListener(new di.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity2);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                bj0Var.addView(linearLayout, w7.z5.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity2);
                                TextView textView22 = new TextView(parentActivity2);
                                ej0Var.K = textView22;
                                org.telegram.ui.Components.cj0 cj0Var = new org.telegram.ui.Components.cj0(parentActivity2);
                                ej0Var.J = cj0Var;
                                linearLayout.addView(qd0Var, w7.z5.l(0.5f, 0, 270));
                                qd0Var.setFormatter(new org.telegram.ui.Components.zi0(ej0Var, 0));
                                qd0Var.setMinValue(0);
                                qd0Var.setMaxValue(10);
                                qd0Var.setWrapSelectorWheel(false);
                                qd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.zi0 zi0Var = new org.telegram.ui.Components.zi0(ej0Var, 1);
                                qd0Var.setOnValueChangedListener(zi0Var);
                                qd0Var2.setMinValue(0);
                                qd0Var2.setMaxValue(10);
                                qd0Var2.setWrapSelectorWheel(false);
                                qd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(qd0Var2, w7.z5.l(0.5f, 0, 270));
                                qd0Var2.setFormatter(new org.telegram.ui.Components.zi0(ej0Var, 2));
                                qd0Var2.setOnValueChangedListener(zi0Var);
                                qd0Var.setValue(0);
                                qd0Var2.setValue(6);
                                bj0Var.addView(frameLayout2, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                                cj0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                cj0Var.setGravity(17);
                                org.telegram.ui.ActionBar.r6.W(cj0Var, org.telegram.ui.ActionBar.k6.Sh, null);
                                cj0Var.setTextSize(1, 14.0f);
                                cj0Var.setMaxLines(2);
                                cj0Var.setTypeface(AndroidUtilities.bold());
                                cj0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                                frameLayout2.addView(cj0Var, w7.z5.c(48.0f, -1));
                                cj0Var.setOnClickListener(new org.telegram.ui.Components.ca(22, ej0Var, ksVar));
                                textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView22.setGravity(17);
                                org.telegram.ui.ActionBar.r6.W(textView22, org.telegram.ui.ActionBar.k6.q5, null);
                                textView22.setTextSize(1, 14.0f);
                                textView22.setAlpha(0.0f);
                                textView22.setScaleX(0.5f);
                                textView22.setScaleY(0.5f);
                                frameLayout2.addView(textView22, w7.z5.c(48.0f, -1));
                                aj0Var.addView(bj0Var, w7.z5.e(-1, -2, 51));
                                sc0Var.R = ej0Var;
                                ((FrameLayout) sc0Var.fragmentView).addView(ej0Var, w7.z5.c(-1.0f, -1));
                                org.telegram.ui.Components.ej0 ej0Var2 = sc0Var.R;
                                ej0Var2.r = false;
                                AnimatorSet animatorSet = ej0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    ej0Var2.s = null;
                                }
                                org.telegram.ui.Components.aj0 aj0Var2 = ej0Var2.v;
                                aj0Var2.measure(View.MeasureSpec.makeMeasureSpec((ej0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (ej0Var2.r) {
                                    z12 = true;
                                } else {
                                    aj0Var2.setVisibility(0);
                                    if (ej0Var2.w) {
                                        ej0Var2.setLayerType(2, null);
                                    }
                                    aj0Var2.setTranslationY(aj0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    ej0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(aj0Var2, (Property<org.telegram.ui.Components.aj0, Float>) View.TRANSLATION_Y, 0.0f));
                                    ej0Var2.s.setDuration(400L);
                                    ej0Var2.s.setStartDelay(20L);
                                    ej0Var2.s.setInterpolator(ej0Var2.F);
                                    z12 = true;
                                    ej0Var2.s.addListener(new org.telegram.ui.Components.dj0(ej0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    ej0Var2.s.start();
                                }
                                ej0Var2.c(z12);
                                break;
                            }
                        }
                        break;
                    default:
                        sc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = sc0Var.B0.messageOwner.media.geo;
                            double d102 = geoPoint.lat;
                            double d1022 = geoPoint._long;
                            sc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d102 + "," + d1022 + "?q=" + d102 + "," + d1022)));
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                }
            }
        });
        z0(false, false);
        this.c = new ImageView(context);
        org.telegram.ui.Cells.y i04 = org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(40.0f), getThemedColor(i20), getThemedColor(i21));
        w7.b6.a(this.c);
        this.c.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.c.setOutlineProvider(n1Var);
        org.telegram.ui.ActionBar.r6.t(this.c, i19, getResourceProvider(), mode);
        org.telegram.ui.ActionBar.r6.S(this.c, i04, org.telegram.ui.ActionBar.r6.O(i20), org.telegram.ui.ActionBar.r6.O(i21), getResourceProvider());
        this.c.setScaleType(scaleType);
        this.c.setContentDescription(LocaleController.getString(R.string.AccDescrLocationNotify));
        this.S.addView(this.c, w7.z5.d(40, 40.0f, 53, 0.0f, 62.0f, 12.0f, 0.0f));
        final int i26 = 4;
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yb0
            public final /* synthetic */ sc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                boolean z12;
                int i182 = i26;
                int i192 = 3;
                sc0 sc0Var = this.b;
                int i202 = 1;
                switch (i182) {
                    case 0:
                        sc0Var.y0(false);
                        sc0Var.T.H(null, sc0Var.x0, true);
                        sc0Var.D0 = true;
                        sc0Var.x0();
                        break;
                    case 1:
                        sc0Var.d.M(null, null);
                        break;
                    case 2:
                        int i212 = sc0Var.G0;
                        Activity parentActivity = sc0Var.getParentActivity();
                        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                            if (sc0Var.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sc0Var.getParentActivity());
                                int i222 = R.raw.permission_request_location;
                                int i232 = org.telegram.ui.ActionBar.k6.L5;
                                alertDialog$Builder.m(i222, 72, sc0Var.getThemedColor(i232), null);
                                alertDialog$Builder.n(i232, sc0Var.getResourceProvider());
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                c2Var.T = replaceTags;
                                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new zb0(sc0Var, 1));
                                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                sc0Var.showDialog(c2Var);
                                break;
                            }
                        } else if (sc0Var.d0() || i212 == 3) {
                            if ((sc0Var.B0 == null || i212 == 3) && sc0Var.z0 == null) {
                                if (sc0Var.w0 != null && sc0Var.I != null) {
                                    ImageView imageView3 = sc0Var.a;
                                    int i242 = org.telegram.ui.ActionBar.k6.vi;
                                    org.telegram.ui.ActionBar.r6.t(imageView3, i242, sc0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                    sc0Var.a.setTag(Integer.valueOf(i242));
                                    sc0Var.T.L(null);
                                    sc0Var.C0 = false;
                                    sc0Var.y0(false);
                                    sc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(sc0Var.w0.getLatitude(), sc0Var.w0.getLongitude())));
                                    if (sc0Var.D0 && i212 != 8) {
                                        Location location3 = sc0Var.w0;
                                        if (location3 != null) {
                                            sc0Var.T.H(null, location3, true);
                                        }
                                        sc0Var.D0 = false;
                                        sc0Var.x0();
                                    }
                                }
                            } else if (sc0Var.w0 != null && (iMap = sc0Var.I) != null) {
                                iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(sc0Var.w0.getLatitude(), sc0Var.w0.getLongitude()), sc0Var.I.getMaxZoomLevel() - 4.0f));
                            }
                            if (sc0Var.m0 != null) {
                                sc0Var.X.setVisibility(0);
                                pc0 pc0Var = sc0Var.x;
                                IMapsProvider.IMarker iMarker = sc0Var.m0;
                                HashMap hashMap = pc0Var.a;
                                View view2 = (View) hashMap.get(iMarker);
                                if (view2 != null) {
                                    pc0Var.removeView(view2);
                                    hashMap.remove(iMarker);
                                }
                                sc0Var.m0 = null;
                                sc0Var.n0 = null;
                                sc0Var.o0 = null;
                                break;
                            }
                        }
                        break;
                    case 3:
                        sc0Var.i0 = -1L;
                        sc0Var.C0 = true;
                        if (sc0Var.j0()) {
                            sc0Var.j0 = true;
                            sc0Var.z0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (sc0Var.getParentActivity() != null && sc0Var.w0 != null && sc0Var.d0() && sc0Var.I != null) {
                            ei.x3 x3Var = sc0Var.y;
                            if (x3Var != null) {
                                x3Var.e(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = sc0Var.getLocationController().getSharingLocationInfo(sc0Var.e0);
                            if (sc0Var.G) {
                                sc0Var.F[0].d(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                sc0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = sc0Var.O;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    sc0Var.O = null;
                                }
                                sc0Var.G = true;
                                sc0Var.m0().k(0L, 25, 0, null, new bc0(sc0Var, i202), new f80(14, sc0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = sc0Var.O;
                                if (iCircle2 == null) {
                                    sc0Var.e0(500);
                                } else {
                                    sc0Var.P = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(sc0Var.e0) ? sc0Var.getMessagesController().getUser(Long.valueOf(sc0Var.e0)) : null;
                                Activity parentActivity2 = sc0Var.getParentActivity();
                                zb0 zb0Var = new zb0(sc0Var, i192);
                                ks ksVar = new ks(21, sc0Var, user);
                                bc0 bc0Var = new bc0(sc0Var, 2);
                                org.telegram.ui.Components.ej0 ej0Var = new org.telegram.ui.Components.ej0(parentActivity2);
                                ej0Var.a = null;
                                ej0Var.d = -1;
                                ej0Var.e = false;
                                ej0Var.f = false;
                                ej0Var.h = null;
                                ej0Var.n = new Rect();
                                new Paint();
                                ej0Var.w = true;
                                ej0Var.F = org.telegram.ui.Components.bs.h;
                                ej0Var.setWillNotDraw(false);
                                ej0Var.Q = bc0Var;
                                ej0Var.y = ViewConfiguration.get(parentActivity2).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity2.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                org.telegram.ui.ActionBar.r6.z(ej0Var, mutate2, org.telegram.ui.ActionBar.k6.h5, null, PorterDuff.Mode.MULTIPLY);
                                mutate2.getPadding(rect2);
                                int i252 = rect2.left;
                                ej0Var.x = i252;
                                org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(ej0Var.getContext());
                                ej0Var.v = aj0Var;
                                aj0Var.setBackgroundDrawable(mutate2);
                                aj0Var.setPadding(i252, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i252, 0);
                                aj0Var.setVisibility(4);
                                ej0Var.addView(aj0Var, 0, w7.z5.e(-1, -2, 80));
                                ej0Var.O = LocaleController.getUseImperialSystemType();
                                ej0Var.M = user;
                                ej0Var.I = zb0Var;
                                org.telegram.ui.Components.qd0 qd0Var = new org.telegram.ui.Components.qd0(parentActivity2, null);
                                ej0Var.G = qd0Var;
                                qd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                qd0Var.setItemCount(5);
                                org.telegram.ui.Components.qd0 qd0Var2 = new org.telegram.ui.Components.qd0(parentActivity2, null);
                                ej0Var.H = qd0Var2;
                                qd0Var2.setItemCount(5);
                                qd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(ej0Var, parentActivity2);
                                ej0Var.P = bj0Var;
                                bj0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity2);
                                bj0Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView2 = new TextView(parentActivity2);
                                textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.v0.q(textView2, org.telegram.ui.ActionBar.k6.j5, null, 1, 20.0f);
                                frameLayout.addView(textView2, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView2.setOnTouchListener(new di.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity2);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                bj0Var.addView(linearLayout, w7.z5.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity2);
                                TextView textView22 = new TextView(parentActivity2);
                                ej0Var.K = textView22;
                                org.telegram.ui.Components.cj0 cj0Var = new org.telegram.ui.Components.cj0(parentActivity2);
                                ej0Var.J = cj0Var;
                                linearLayout.addView(qd0Var, w7.z5.l(0.5f, 0, 270));
                                qd0Var.setFormatter(new org.telegram.ui.Components.zi0(ej0Var, 0));
                                qd0Var.setMinValue(0);
                                qd0Var.setMaxValue(10);
                                qd0Var.setWrapSelectorWheel(false);
                                qd0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.zi0 zi0Var = new org.telegram.ui.Components.zi0(ej0Var, 1);
                                qd0Var.setOnValueChangedListener(zi0Var);
                                qd0Var2.setMinValue(0);
                                qd0Var2.setMaxValue(10);
                                qd0Var2.setWrapSelectorWheel(false);
                                qd0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(qd0Var2, w7.z5.l(0.5f, 0, 270));
                                qd0Var2.setFormatter(new org.telegram.ui.Components.zi0(ej0Var, 2));
                                qd0Var2.setOnValueChangedListener(zi0Var);
                                qd0Var.setValue(0);
                                qd0Var2.setValue(6);
                                bj0Var.addView(frameLayout2, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                                cj0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                cj0Var.setGravity(17);
                                org.telegram.ui.ActionBar.r6.W(cj0Var, org.telegram.ui.ActionBar.k6.Sh, null);
                                cj0Var.setTextSize(1, 14.0f);
                                cj0Var.setMaxLines(2);
                                cj0Var.setTypeface(AndroidUtilities.bold());
                                cj0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                                frameLayout2.addView(cj0Var, w7.z5.c(48.0f, -1));
                                cj0Var.setOnClickListener(new org.telegram.ui.Components.ca(22, ej0Var, ksVar));
                                textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView22.setGravity(17);
                                org.telegram.ui.ActionBar.r6.W(textView22, org.telegram.ui.ActionBar.k6.q5, null);
                                textView22.setTextSize(1, 14.0f);
                                textView22.setAlpha(0.0f);
                                textView22.setScaleX(0.5f);
                                textView22.setScaleY(0.5f);
                                frameLayout2.addView(textView22, w7.z5.c(48.0f, -1));
                                aj0Var.addView(bj0Var, w7.z5.e(-1, -2, 51));
                                sc0Var.R = ej0Var;
                                ((FrameLayout) sc0Var.fragmentView).addView(ej0Var, w7.z5.c(-1.0f, -1));
                                org.telegram.ui.Components.ej0 ej0Var2 = sc0Var.R;
                                ej0Var2.r = false;
                                AnimatorSet animatorSet = ej0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    ej0Var2.s = null;
                                }
                                org.telegram.ui.Components.aj0 aj0Var2 = ej0Var2.v;
                                aj0Var2.measure(View.MeasureSpec.makeMeasureSpec((ej0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (ej0Var2.r) {
                                    z12 = true;
                                } else {
                                    aj0Var2.setVisibility(0);
                                    if (ej0Var2.w) {
                                        ej0Var2.setLayerType(2, null);
                                    }
                                    aj0Var2.setTranslationY(aj0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    ej0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(aj0Var2, (Property<org.telegram.ui.Components.aj0, Float>) View.TRANSLATION_Y, 0.0f));
                                    ej0Var2.s.setDuration(400L);
                                    ej0Var2.s.setStartDelay(20L);
                                    ej0Var2.s.setInterpolator(ej0Var2.F);
                                    z12 = true;
                                    ej0Var2.s.addListener(new org.telegram.ui.Components.dj0(ej0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    ej0Var2.s.start();
                                }
                                ej0Var2.c(z12);
                                break;
                            }
                        }
                        break;
                    default:
                        sc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = sc0Var.B0.messageOwner.media.geo;
                            double d102 = geoPoint.lat;
                            double d1022 = geoPoint._long;
                            sc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d102 + "," + d1022 + "?q=" + d102 + "," + d1022)));
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                }
            }
        });
        TLRPC.Chat chat = DialogObject.isChatDialog(this.e0) ? getMessagesController().getChat(Long.valueOf(-this.e0)) : null;
        MessageObject messageObject3 = this.B0;
        if (messageObject3 == null || !messageObject3.isLiveLocation() || this.B0.isExpiredLiveLocation(getConnectionsManager().getCurrentTime()) || (ChatObject.isChannel(chat) && !chat.megagroup)) {
            this.c.setVisibility(8);
            this.c.setImageResource(R.drawable.msg_location_alert);
        } else {
            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.e0);
            if (sharingLocationInfo == null || sharingLocationInfo.proximityMeters <= 0) {
                if (DialogObject.isUserDialog(this.e0) && this.B0.getFromChatId() == getUserConfig().getClientUserId()) {
                    this.c.setVisibility(4);
                    this.c.setAlpha(0.0f);
                    this.c.setScaleX(0.4f);
                    this.c.setScaleY(0.4f);
                }
                this.c.setImageResource(R.drawable.msg_location_alert);
            } else {
                this.c.setImageResource(R.drawable.msg_location_alert2);
            }
        }
        ei.x3 x3Var = new ei.x3(context, 1);
        this.y = x3Var;
        x3Var.setLayerType(2, null);
        ei.x3 x3Var2 = this.y;
        x3Var2.d = 4000L;
        x3Var2.l(1.0f, -25.0f);
        this.y.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.S.addView(this.y, w7.z5.d(-1, -2.0f, 51, 8.0f, 106.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.f.setGravity(1);
        this.f.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        this.f.setVisibility(8);
        qc0Var.addView(this.f, w7.z5.c(-1.0f, -1));
        this.f.setOnTouchListener(new di.d(2));
        ImageView imageView3 = new ImageView(context);
        this.h = imageView3;
        imageView3.setImageResource(R.drawable.location_empty);
        org.telegram.ui.ActionBar.r6.t(this.h, org.telegram.ui.ActionBar.k6.W5, getResourceProvider(), mode);
        this.f.addView(this.h, w7.z5.n(-2, -2));
        TextView textView2 = new TextView(context);
        this.n = textView2;
        int i27 = org.telegram.ui.ActionBar.k6.X5;
        org.telegram.ui.ActionBar.r6.W(textView2, i27, getResourceProvider());
        this.n.setGravity(17);
        this.n.setTypeface(AndroidUtilities.bold());
        this.n.setTextSize(1, 17.0f);
        this.n.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView f7 = org.telegram.messenger.sl.f(this.f, this.n, w7.z5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.r = f7;
        org.telegram.ui.ActionBar.r6.W(f7, i27, getResourceProvider());
        this.r.setGravity(17);
        this.r.setTextSize(1, 15.0f);
        this.r.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.f.addView(this.r, w7.z5.t(-2, -2, 17, 0, 6, 0, 0));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.U = mm0Var;
        gc0 gc0Var2 = new gc0(this, context, this.G0, this.e0, getResourceProvider(), this.E, i14 == 8);
        this.T = gc0Var2;
        mm0Var.setAdapter(gc0Var2);
        org.telegram.ui.Components.mm0 mm0Var2 = this.U;
        s4.b0 b0Var = new s4.b0(1, false);
        this.Y = b0Var;
        mm0Var2.setLayoutManager(b0Var);
        if (this.M0 != null) {
            this.L0 = new org.telegram.ui.Cells.u3(context, this.resourceProvider);
            ic0 ic0Var = new ic0(this, context, new org.telegram.ui.Components.pv0(this), this, new hc0(this), getResourceProvider());
            this.K0 = ic0Var;
            org.telegram.ui.ActionBar.r6.i(i12, ic0Var, getResourceProvider());
            this.K0.addView(this.L0, w7.z5.e(-1, 32, 55));
            this.T.h0 = this.K0;
            this.U.setOverScrollMode(2);
            s4.k kVar3 = new s4.k();
            z11 = false;
            kVar3.m = false;
            kVar3.C = false;
            kVar3.o(org.telegram.ui.Components.bs.h);
            kVar3.n(350L);
            this.U.setItemAnimator(kVar3);
        } else {
            z11 = false;
        }
        this.T.O(this.c0, z11);
        this.T.getClass();
        this.U.setVerticalScrollBarEnabled(z11);
        qc0Var.addView(this.U, w7.z5.e(-1, -1, 51));
        MessageObject messageObject4 = this.B0;
        if (messageObject4 != null && (message = messageObject4.messageOwner) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
            gc0 gc0Var3 = this.T;
            gc0Var3.Q = this.B0.messageOwner.media.address;
            gc0Var3.Q();
        }
        this.U.setOnScrollListener(new jc0(this));
        ((s4.k) this.U.getItemAnimator()).C = false;
        this.U.setOnItemLongClickListener(new ks(19, this, context));
        this.U.setOnItemClickListener(new h(this, 17));
        gc0 gc0Var4 = this.T;
        long j10 = this.e0;
        zb0 zb0Var = new zb0(this, 5);
        gc0Var4.H = j10;
        gc0Var4.y = zb0Var;
        gc0Var4.P(this.H0);
        qc0Var.addView(this.S, w7.z5.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.K = onCreateMapView;
        onCreateMapView.getView().setAlpha(0.0f);
        this.K.setOnDispatchTouchEventInterceptor(new zb0(this, 6));
        this.K.setOnInterceptTouchEventInterceptor(new zb0(this, 7));
        this.K.setOnLayoutListener(new bc0(this, 5));
        new Thread(new cc0(this, this.K, 1)).start();
        MessageObject messageObject5 = this.B0;
        if (messageObject5 == null && this.z0 == null) {
            i10 = i14;
            if (chat != null && i10 == 4 && this.e0 != 0) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackgroundResource(R.drawable.livepin);
                this.S.addView(frameLayout, w7.z5.e(62, 76, 49));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                w9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
                w9Var.e(chat, new org.telegram.ui.Components.h9(chat));
                frameLayout.addView(w9Var, w7.z5.d(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                this.X = frameLayout;
                frameLayout.setTag(1);
            }
            if (this.X == null) {
                ImageView imageView4 = new ImageView(context);
                imageView4.setImageResource(R.drawable.map_pin2);
                this.S.addView(imageView4, w7.z5.e(28, 48, 49));
                this.X = imageView4;
            }
            org.telegram.ui.Components.mm0 mm0Var3 = new org.telegram.ui.Components.mm0(context, null);
            this.V = mm0Var3;
            mm0Var3.setVisibility(8);
            i11 = 0;
            this.V.setLayoutManager(new s4.b0(1, false));
            lc0 lc0Var2 = new lc0(this, context, getResourceProvider(), i10 == 8);
            this.W = lc0Var2;
            zb0 zb0Var2 = new zb0(this, 8);
            lc0Var2.H = 0L;
            lc0Var2.y = zb0Var2;
            qc0Var.addView(this.V, w7.z5.e(-1, -1, 51));
            int i28 = 18;
            this.V.setOnScrollListener(new j3(this, i28));
            this.V.setOnItemClickListener(new ci.x4(i28, this, m10));
        } else {
            i10 = i14;
            i11 = 0;
            if ((messageObject5 != null && !messageObject5.isLiveLocation()) || this.z0 != null) {
                TLRPC.TL_channelLocation tL_channelLocation2 = this.z0;
                if (tL_channelLocation2 != null) {
                    this.T.X = tL_channelLocation2;
                } else {
                    MessageObject messageObject6 = this.B0;
                    if (messageObject6 != null) {
                        gc0 gc0Var5 = this.T;
                        gc0Var5.W = messageObject6;
                        gc0Var5.l();
                    }
                }
            }
        }
        MessageObject messageObject7 = this.B0;
        if (messageObject7 != null && i10 == 6) {
            gc0 gc0Var6 = this.T;
            gc0Var6.W = messageObject7;
            gc0Var6.l();
        }
        for (int i29 = i11; i29 < 2; i29++) {
            UndoView undoView = new UndoView(context);
            UndoView[] undoViewArr = this.F;
            undoViewArr[i29] = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            undoViewArr[i29].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.S.addView(undoViewArr[i29], w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        ci.h3 h3Var = new ci.h3(this, context, rect);
        this.v = h3Var;
        h3Var.setTranslationZ(AndroidUtilities.dp(6.0f));
        this.S.addView(this.v, layoutParams);
        if (this.B0 == null && this.z0 == null && this.A0 != null) {
            this.C0 = true;
            ImageView imageView5 = this.a;
            int i30 = org.telegram.ui.ActionBar.k6.ui;
            org.telegram.ui.ActionBar.r6.t(imageView5, i30, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.a.setTag(Integer.valueOf(i30));
        }
        qc0Var.addView(this.actionBar);
        B0();
        return this.fragmentView;
    }

    public final boolean d0() {
        if (h0()) {
            return false;
        }
        if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i10 = R.raw.permission_request_location;
                    int i11 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder.m(i10, 72, getThemedColor(i11), null);
                    alertDialog$Builder.n(i11, getResourceProvider());
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new zb0(this, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(alertDialog$Builder.a);
                    return false;
                }
            } catch (Exception e) {
                FileLog.e(e);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        gc0 gc0Var;
        gc0 gc0Var2;
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
            return;
        }
        if (i10 == NotificationCenter.locationPermissionGranted) {
            this.c0 = false;
            gc0 gc0Var3 = this.T;
            if (gc0Var3 != null) {
                gc0Var3.O(false, false);
            }
            IMapsProvider.IMap iMap = this.I;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.locationPermissionDenied) {
            this.c0 = true;
            gc0 gc0Var4 = this.T;
            if (gc0Var4 != null) {
                gc0Var4.O(true, false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.liveLocationsChanged) {
            gc0 gc0Var5 = this.T;
            if (gc0Var5 != null) {
                gc0Var5.l();
            }
            C0();
            return;
        }
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue() || ((Long) objArr[0]).longValue() != this.e0 || this.B0 == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[1];
            boolean z10 = false;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i12);
                if (messageObject.isLiveLocation()) {
                    b0(messageObject.messageOwner);
                    z10 = true;
                } else if ((messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGeoProximityReached) && DialogObject.isUserDialog(messageObject.getDialogId())) {
                    this.c.setImageResource(R.drawable.msg_location_alert);
                    IMapsProvider.ICircle iCircle = this.O;
                    if (iCircle != null) {
                        iCircle.remove();
                        this.O = null;
                    }
                }
            }
            if (!z10 || (gc0Var2 = this.T) == null) {
                return;
            }
            gc0Var2.N(this.g0);
            return;
        }
        if (i10 == NotificationCenter.replaceMessagesObjects) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue != this.e0 || this.B0 == null) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) objArr[1];
            boolean z11 = false;
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i13);
                if (messageObject2.isLiveLocation()) {
                    TLRPC.Message message = messageObject2.messageOwner;
                    mc0 mc0Var = (mc0) this.h0.f(message.from_id != null ? MessageObject.getFromChatId(message) : MessageObject.getDialogId(message));
                    if (mc0Var != null) {
                        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(longValue);
                        if (sharingLocationInfo == null || sharingLocationInfo.mid != messageObject2.getId()) {
                            TLRPC.Message message2 = messageObject2.messageOwner;
                            mc0Var.b = message2;
                            TLRPC.GeoPoint geoPoint = message2.media.geo;
                            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                            mc0Var.e.setPosition(latLng);
                            if (this.i0 == mc0Var.a) {
                                this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(mc0Var.e.getPosition()));
                            }
                            IMapsProvider.IMarker iMarker = mc0Var.f;
                            if (iMarker != null) {
                                iMarker.getPosition();
                                mc0Var.f.setPosition(latLng);
                                int i14 = messageObject2.messageOwner.media.heading;
                                if (i14 != 0) {
                                    mc0Var.f.setRotation(i14);
                                    if (!mc0Var.g) {
                                        mc0Var.f.setIcon(R.drawable.map_pin_cone2);
                                        mc0Var.g = true;
                                    }
                                } else if (mc0Var.g) {
                                    mc0Var.f.setRotation(0);
                                    mc0Var.f.setIcon(R.drawable.map_pin_circle);
                                    mc0Var.g = false;
                                }
                            }
                        }
                        z11 = true;
                    }
                }
            }
            if (z11 && (gc0Var = this.T) != null) {
                gc0Var.l();
                org.telegram.ui.Components.ej0 ej0Var = this.R;
                if (ej0Var != null) {
                    ej0Var.c(true);
                }
            }
            if (z11) {
                C0();
            }
        }
    }

    public final void e0(int i10) {
        if (this.I == null) {
            return;
        }
        List<IMapsProvider.PatternItem> asList = Arrays.asList(new IMapsProvider.PatternItem.Gap(20), new IMapsProvider.PatternItem.Dash(20));
        IMapsProvider.ICircleOptions onCreateCircleOptions = ApplicationLoader.getMapsProvider().onCreateCircleOptions();
        onCreateCircleOptions.center(new IMapsProvider.LatLng(this.w0.getLatitude(), this.w0.getLongitude()));
        onCreateCircleOptions.radius(i10);
        if (n0()) {
            onCreateCircleOptions.strokeColor(-1771658281);
            onCreateCircleOptions.fillColor(476488663);
        } else {
            onCreateCircleOptions.strokeColor(-1774024971);
            onCreateCircleOptions.fillColor(474121973);
        }
        onCreateCircleOptions.strokePattern(asList);
        onCreateCircleOptions.strokeWidth(2);
        this.O = this.I.addCircle(onCreateCircleOptions);
    }

    public final Bitmap f0(int i10) {
        Bitmap[] bitmapArr = this.Q0;
        Bitmap bitmap = bitmapArr[i10 % 7];
        if (bitmap != null) {
            return bitmap;
        }
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            paint.setColor(org.telegram.ui.Cells.t4.a(i10));
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), paint);
            canvas.setBitmap(null);
            bitmapArr[i10 % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return null;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean finishFragment(boolean z10) {
        if (q0()) {
            return false;
        }
        return super.finishFragment(z10);
    }

    public final Bitmap g0(mc0 mc0Var) {
        Bitmap bitmap = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(62.0f), AndroidUtilities.dp(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.map_pin_photo);
                drawable.setBounds(0, 0, AndroidUtilities.dp(62.0f), AndroidUtilities.dp(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
                TLRPC.User user = mc0Var.c;
                if (user != null) {
                    h9Var.m(this.currentAccount, user);
                } else {
                    TLRPC.Chat chat = mc0Var.d;
                    if (chat != null) {
                        h9Var.k(this.currentAccount, chat);
                    }
                }
                canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                h9Var.setBounds(0, 0, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
                h9Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = mc0Var.h;
                Bitmap bitmap2 = (imageReceiver == null || !imageReceiver.hasImageLoaded()) ? null : mc0Var.h.getBitmap();
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    float dp = AndroidUtilities.dp(50.0f) / bitmap2.getWidth();
                    matrix.postTranslate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                    matrix.postScale(dp, dp);
                    paint.setShader(bitmapShader);
                    bitmapShader.setLocalMatrix(matrix);
                    rectF.set(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f), paint);
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
                FileLog.e(th);
                return bitmap;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        i6 i6Var = new i6(11, this);
        int i10 = 0;
        while (true) {
            UndoView[] undoViewArr = this.F;
            if (i10 >= undoViewArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(undoViewArr[i10], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Fi));
            i10++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.U, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Vd));
        org.telegram.ui.ActionBar.u0 u0Var = this.w;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var != null ? u0Var.getSearchField() : null, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ii));
        ImageView imageView = this.a;
        int i11 = org.telegram.ui.ActionBar.k6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        ImageView imageView2 = this.a;
        int i12 = org.telegram.ui.ActionBar.k6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 0, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.ui));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.si));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.U, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.U, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.U, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.U, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.pi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.U, 196608, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.U, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.U, 8, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.W5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.U, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.X5));
        return arrayList;
    }

    public boolean h0() {
        return this instanceof an;
    }

    public final void i0(ArrayList arrayList) {
        IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = this.f0 ? ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder() : null;
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
            int i11 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i12 = messageMedia.period;
            if (i11 + i12 > currentTime || i12 == Integer.MAX_VALUE) {
                if (onCreateLatLngBoundsBuilder != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    onCreateLatLngBoundsBuilder.include(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                }
                b0(message);
                if (this.c.getVisibility() != 8 && MessageObject.getFromChatId(message) != getUserConfig().getClientUserId()) {
                    this.c.setVisibility(0);
                    this.H = true;
                    this.c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new v70(this, 1)).start();
                }
            }
        }
        if (onCreateLatLngBoundsBuilder != null) {
            if (this.f0) {
                this.U.v0(0, AndroidUtilities.dp(99.0f), null);
            }
            this.f0 = false;
            this.T.N(this.g0);
            if (this.B0.isLiveLocation()) {
                try {
                    IMapsProvider.LatLng center = onCreateLatLngBoundsBuilder.build().getCenter();
                    IMapsProvider.LatLng p02 = p0(center, 100.0d, 100.0d);
                    onCreateLatLngBoundsBuilder.include(p0(center, -100.0d, -100.0d));
                    onCreateLatLngBoundsBuilder.include(p02);
                    IMapsProvider.ILatLngBounds build = onCreateLatLngBoundsBuilder.build();
                    if (arrayList.size() > 1) {
                        try {
                            IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(build, AndroidUtilities.dp(113.0f));
                            this.J = newCameraUpdateLatLngBounds;
                            this.I.moveCamera(newCameraUpdateLatLngBounds);
                            this.J = null;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return i0.a.h(getThemedColor(org.telegram.ui.ActionBar.k6.d6)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final boolean j0() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i10;
        if (this.I != null) {
            ArrayList arrayList = new ArrayList();
            int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
            ArrayList arrayList2 = this.g0;
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                mc0 mc0Var = (mc0) arrayList2.get(i11);
                IMapsProvider.IMarker iMarker = mc0Var.e;
                if (iMarker != null && (message = mc0Var.b) != null && (messageMedia = message.media) != null && ((i10 = messageMedia.period) == Integer.MAX_VALUE || message.date + i10 > currentTime)) {
                    arrayList.add(iMarker.getPosition());
                }
            }
            boolean z10 = this.h0.f(getUserConfig().getClientUserId()) != null;
            Location location = this.w0;
            if (location != null && !z10) {
                arrayList.add(new IMapsProvider.LatLng(location.getLatitude(), this.w0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    int i12 = 0;
                    double d10 = Double.MAX_VALUE;
                    double d11 = Double.MAX_VALUE;
                    double d12 = -1.7976931348623157E308d;
                    while (i12 < size2) {
                        IMapsProvider.LatLng latLng = (IMapsProvider.LatLng) arrayList.get(i12);
                        onCreateLatLngBoundsBuilder.include(latLng);
                        int i13 = size2;
                        double d13 = latLng.latitude;
                        if (d13 < d10) {
                            d10 = d13;
                        }
                        if (d13 > d) {
                            d = d13;
                        }
                        double d14 = latLng.longitude;
                        if (d14 < d11) {
                            d11 = d14;
                        }
                        if (d14 > d12) {
                            d12 = d14;
                        }
                        i12++;
                        size2 = i13;
                    }
                    IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng((d10 + d) / 2.0d, (d11 + d12) / 2.0d);
                    double radians = Math.toRadians(d - d10) * 6366198.0d;
                    double radians2 = Math.toRadians(d12 - d11) * 6366198.0d * Math.cos(Math.toRadians(latLng2.latitude));
                    if (radians < 30.0d || radians2 < 30.0d) {
                        onCreateLatLngBoundsBuilder.include(p0(latLng2, 15.0d, 15.0d));
                        onCreateLatLngBoundsBuilder.include(p0(latLng2, -15.0d, -15.0d));
                    }
                    this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(onCreateLatLngBoundsBuilder.build(), AndroidUtilities.dp(60.0f)), 500, null);
                    return true;
                } catch (Exception e) {
                    FileLog.e(e);
                    return false;
                }
            }
        }
        return false;
    }

    public final void k0(boolean z10) {
        FrameLayout.LayoutParams layoutParams;
        if (this.U != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight == 0) {
                return;
            }
            int i10 = this.G0;
            if (i10 == 6) {
                this.H0 = org.telegram.messenger.v0.B(66.0f, measuredHeight, currentActionBarHeight);
            } else if (i10 == 2) {
                this.H0 = org.telegram.messenger.v0.B(73.0f, measuredHeight, currentActionBarHeight);
            } else {
                this.H0 = org.telegram.messenger.v0.B(66.0f, measuredHeight, currentActionBarHeight);
            }
            ic0 ic0Var = this.K0;
            if (ic0Var != null && ic0Var.d0(8) > 0) {
                this.H0 -= AndroidUtilities.dp(200.0f);
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.U.getLayoutParams();
            layoutParams2.topMargin = currentActionBarHeight;
            this.U.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.S.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            layoutParams3.height = this.H0;
            this.S.setLayoutParams(layoutParams3);
            org.telegram.ui.Components.mm0 mm0Var = this.V;
            if (mm0Var != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) mm0Var.getLayoutParams();
                layoutParams4.topMargin = currentActionBarHeight;
                this.V.setLayoutParams(layoutParams4);
            }
            this.T.P(this.H0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.K.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.H0;
                IMapsProvider.IMap iMap = this.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                this.K.getView().setLayoutParams(layoutParams5);
            }
            pc0 pc0Var = this.x;
            if (pc0Var != null && (layoutParams = (FrameLayout.LayoutParams) pc0Var.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.H0;
                this.x.setLayoutParams(layoutParams);
            }
            this.T.l();
            if (!z10) {
                A0(false);
                return;
            }
            int i11 = i10 == 3 ? 73 : (i10 == 1 || i10 == 2) ? 66 : 0;
            this.Y.h1(0, -AndroidUtilities.dp(i11));
            A0(false);
            this.U.post(new org.telegram.ui.Components.d2(this, i11, 20));
        }
    }

    public final boolean l0() {
        ArrayList arrayList = (ArrayList) getLocationController().locationsCache.f(this.B0.getDialogId());
        if (arrayList == null || !arrayList.isEmpty()) {
            arrayList = null;
        } else {
            i0(arrayList);
        }
        if (DialogObject.isChatDialog(this.e0)) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.e0));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long dialogId = this.B0.getDialogId();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(dialogId);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new ci.j6(this, dialogId, 6));
        return arrayList != null;
    }

    public final UndoView m0() {
        UndoView[] undoViewArr = this.F;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.S.removeView(undoViewArr[0]);
            this.S.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean n0() {
        return (getResourceProvider() == null && org.telegram.ui.ActionBar.k6.I.q()) || AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.k6.d6)) < 0.721f;
    }

    public final void o0() {
        SharedPreferences globalMainSettings;
        int i10;
        ImageView imageView = this.c;
        if (imageView == null || imageView.getVisibility() != 0 || this.H || (i10 = (globalMainSettings = MessagesController.getGlobalMainSettings()).getInt("proximityhint", 0)) >= 3) {
            return;
        }
        globalMainSettings.edit().putInt("proximityhint", i10 + 1).commit();
        if (DialogObject.isUserDialog(this.e0)) {
            this.y.s(LocaleController.formatString("ProximityTooltioUser", R.string.ProximityTooltioUser, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.e0)))));
        } else {
            this.y.s(LocaleController.getString(R.string.ProximityTooltioGroup));
        }
        this.y.u();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ej0 ej0Var = this.R;
        if (ej0Var == null) {
            IMapsProvider.IMapView iMapView = this.K;
            if (iMapView == null || iMapView.getGlSurfaceView() == null || this.M) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                q0();
            }
        } else if (z10) {
            ej0Var.a();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.F[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        MessageObject messageObject = this.B0;
        if (messageObject == null || !messageObject.isLiveLocation()) {
            return true;
        }
        getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(this, NotificationCenter.replaceMessagesObjects);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.replaceMessagesObjects);
        try {
            IMapsProvider.IMap iMap = this.I;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            IMapsProvider.IMapView iMapView = this.K;
            if (iMapView != null) {
                iMapView.onDestroy();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        UndoView undoView = this.F[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        gc0 gc0Var = this.T;
        if (gc0Var != null) {
            gc0Var.F();
        }
        lc0 lc0Var = this.W;
        if (lc0Var != null) {
            lc0Var.F();
        }
        bc0 bc0Var = this.J0;
        if (bc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(bc0Var);
            this.J0 = null;
        }
        ArrayList arrayList = this.g0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            mc0 mc0Var = (mc0) arrayList.get(i10);
            ImageReceiver imageReceiver = mc0Var.h;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                mc0Var.h = null;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onLowMemory() {
        super.onLowMemory();
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView == null || !this.u0) {
            return;
        }
        iMapView.onLowMemory();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && this.u0) {
            try {
                iMapView.onPause();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        UndoView undoView = this.F[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.v0 = false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 30) {
            s0(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        Activity parentActivity;
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView != null && this.u0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.v0 = true;
        IMapsProvider.IMap iMap = this.I;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        k0(true);
        if (h0()) {
            this.p0 = false;
        } else if (this.p0 && (parentActivity = getParentActivity()) != null) {
            this.p0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        bc0 bc0Var = this.J0;
        if (bc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(bc0Var);
            AndroidUtilities.runOnUIThread(this.J0, 5000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            c0();
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            org.telegram.ui.ActionBar.u0 u0Var = this.w;
            if (u0Var == null || u0Var.getSearchField() == null) {
                return;
            }
            this.w.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.j5));
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || z11) {
            return;
        }
        try {
            if (this.K.getView().getParent() instanceof ViewGroup) {
                ((ViewGroup) this.K.getView().getParent()).removeView(this.K.getView());
            }
        } catch (Exception unused) {
        }
        l0 l0Var = this.S;
        if (l0Var == null) {
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView(this.K.getView(), 0, w7.z5.e(-1, -1, 51));
                return;
            }
            return;
        }
        l0Var.addView(this.K.getView(), 0, w7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.H0, 51));
        pc0 pc0Var = this.x;
        if (pc0Var != null) {
            try {
                if (pc0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.x.getParent()).removeView(this.x);
                }
            } catch (Exception unused2) {
            }
            this.S.addView(this.x, 1, w7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.H0, 51));
        }
        A0(false);
        o0();
    }

    public final boolean q0() {
        IMapsProvider.IMapView iMapView = this.K;
        if (iMapView == null || iMapView.getGlSurfaceView() == null || this.M) {
            return false;
        }
        GLSurfaceView glSurfaceView = this.K.getGlSurfaceView();
        glSurfaceView.queueEvent(new f80(13, this, glSurfaceView));
        return true;
    }

    public final void r0(mc0 mc0Var) {
        double d;
        double d10;
        TLRPC.Message message;
        if (mc0Var == null || (message = mc0Var.b) == null) {
            MessageObject messageObject = this.B0;
            if (messageObject != null) {
                TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                d = geoPoint.lat;
                d10 = geoPoint._long;
            } else {
                TLRPC.GeoPoint geoPoint2 = this.z0.geo_point;
                d = geoPoint2.lat;
                d10 = geoPoint2._long;
            }
        } else {
            TLRPC.GeoPoint geoPoint3 = message.media.geo;
            d = geoPoint3.lat;
            d10 = geoPoint3._long;
        }
        String str = BuildVars.isHuaweiStoreApp() ? "mapapp://navigation" : "http://maps.google.com/maps";
        if (this.w0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.w0.getLatitude()), Double.valueOf(this.w0.getLongitude()), Double.valueOf(d), Double.valueOf(d10)))));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=&daddr=%f,%f"), Double.valueOf(d), Double.valueOf(d10)))));
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void s0(final boolean z10) {
        Activity parentActivity;
        if (this.F0 == null || h0() || getParentActivity() == null || this.w0 == null || !d0()) {
            return;
        }
        if (this.q0 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
            this.q0 = false;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                org.telegram.ui.Components.f5.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new xb0(this, z10, 1), null).p();
                return;
            }
        }
        final TLRPC.User user = DialogObject.isUserDialog(this.e0) ? getMessagesController().getUser(Long.valueOf(this.e0)) : null;
        showDialog(org.telegram.ui.Components.f5.E(getParentActivity(), z10, user, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.ac0
            @Override // org.telegram.messenger.MessagesStorage.IntCallback
            public final void run(int i10) {
                sc0.U(sc0.this, z10, user, i10);
            }
        }, null));
    }

    public final void t0(Location location) {
        int i10;
        if (location == null) {
            return;
        }
        this.w0 = new Location(location);
        mc0 mc0Var = (mc0) this.h0.f(getUserConfig().getClientUserId());
        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.e0);
        if (mc0Var != null && sharingLocationInfo != null && mc0Var.b.id == sharingLocationInfo.mid) {
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            mc0Var.e.setPosition(latLng);
            IMapsProvider.IMarker iMarker = mc0Var.f;
            if (iMarker != null) {
                iMarker.setPosition(latLng);
            }
            if (this.i0 == mc0Var.a) {
                this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(mc0Var.e.getPosition()));
            }
        }
        if (this.B0 == null && this.z0 == null && this.I != null) {
            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            gc0 gc0Var = this.T;
            if (gc0Var != null) {
                if (!this.D0 && (i10 = this.G0) != 4 && i10 != 8) {
                    gc0Var.H(null, this.w0, true);
                }
                this.T.M(this.w0);
            }
            if (!this.C0) {
                this.x0 = new Location(location);
                if (this.E0) {
                    this.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng2));
                } else {
                    this.E0 = true;
                    this.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, this.I.getMaxZoomLevel() - 4.0f));
                }
            }
        } else {
            this.T.M(this.w0);
        }
        org.telegram.ui.Components.ej0 ej0Var = this.R;
        if (ej0Var != null) {
            ej0Var.c(true);
        }
        IMapsProvider.ICircle iCircle = this.O;
        if (iCircle != null) {
            iCircle.setCenter(new IMapsProvider.LatLng(this.w0.getLatitude(), this.w0.getLongitude()));
        }
        C0();
    }

    public final void u0(MessageObject messageObject) {
        this.B0 = messageObject;
        this.e0 = messageObject.getDialogId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0(mc0 mc0Var) {
        if (mc0Var.h != null) {
            return;
        }
        TLRPC.User user = mc0Var.c;
        TLRPC.Chat chat = mc0Var.d;
        if (user == null && chat == 0) {
            return;
        }
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        if (user != null) {
            h9Var.m(this.currentAccount, user);
        } else {
            h9Var.k(this.currentAccount, chat);
        }
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setCurrentAccount(this.currentAccount);
        imageReceiver.setDelegate(new ks(20, this, mc0Var));
        imageReceiver.onAttachedToWindow();
        if (user == null) {
            user = chat;
        }
        imageReceiver.setForUserOrChat(user, h9Var);
        mc0Var.h = imageReceiver;
    }

    public final void w0(int i10, TLRPC.User user, int i11) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(this.w0.getLatitude());
        tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(this.w0.getLongitude());
        tL_messageMediaGeoLive.heading = LocationController.getHeading(this.w0);
        int i12 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i10;
        tL_messageMediaGeoLive.proximity_notification_radius = i11;
        tL_messageMediaGeoLive.flags = i12 | 9;
        this.F0.b(tL_messageMediaGeoLive, this.G0, true, 0, 0L);
        if (i11 <= 0) {
            finishFragment();
            return;
        }
        this.R.L = true;
        this.c.setImageResource(R.drawable.msg_location_alert2);
        org.telegram.ui.Components.ej0 ej0Var = this.R;
        if (ej0Var != null) {
            ej0Var.a();
        }
        m0().k(0L, 24, Integer.valueOf(i11), user, null, null);
    }

    public final void x0() {
        if (this.T.h() != 0 && this.Y.L0() == 0) {
            View childAt = this.U.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top < 0 || top > AndroidUtilities.dp(258.0f)) {
                return;
            }
            this.U.v0(0, top, null);
        }
    }

    public final void y0(boolean z10) {
        org.telegram.ui.Components.pl plVar;
        Location location;
        Location location2;
        if (this.G0 == 3) {
            z10 = true;
        }
        if (z10 && (plVar = this.e) != null && plVar.getTag() == null && ((location = this.w0) == null || (location2 = this.x0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        org.telegram.ui.Components.pl plVar2 = this.e;
        if (plVar2 != null) {
            if (!z10 || plVar2.getTag() == null) {
                if (z10 || this.e.getTag() != null) {
                    this.e.setTag(z10 ? 1 : null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.pl, Float>) View.TRANSLATION_X, z10 ? 0.0f : -AndroidUtilities.dp(80.0f)));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(org.telegram.ui.Components.bs.g);
                    animatorSet.start();
                }
            }
        }
    }

    public final void z0(boolean z10, boolean z11) {
        Boolean bool = this.P0;
        if (bool == null || bool.booleanValue() != z10) {
            this.P0 = Boolean.valueOf(z10);
            if (z11) {
                this.b.setVisibility(0);
                this.b.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f).setInterpolator(org.telegram.ui.Components.bs.h).setDuration(420L).withEndAction(new xb0(this, z10, 0)).start();
            } else {
                this.b.setVisibility(z10 ? 0 : 8);
                this.b.setAlpha(z10 ? 1.0f : 0.0f);
                this.b.setScaleX(z10 ? 1.0f : 0.7f);
                this.b.setScaleY(z10 ? 1.0f : 0.7f);
            }
        }
    }
}
