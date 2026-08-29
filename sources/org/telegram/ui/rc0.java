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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class rc0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public boolean A0;
    public final UndoView[] B;
    public mc0 B0;
    public boolean C;
    public final int C0;
    public boolean D;
    public int D0;
    public IMapsProvider.IMap E;
    public jc0 E0;
    public IMapsProvider.ICameraUpdate F;
    public zb0 F0;
    public IMapsProvider.IMapView G;
    public hc0 G0;
    public IMapsProvider.ICameraUpdate H;
    public org.telegram.ui.Cells.s3 H0;
    public boolean I;
    public TL_stories.MediaArea I0;
    public float J;
    public boolean J0;
    public IMapsProvider.ICircle K;
    public boolean K0;
    public double L;
    public Boolean L0;
    public boolean M;
    public final Bitmap[] M0;
    public org.telegram.ui.Components.ai0 N;
    public n0 O;
    public fc0 P;
    public org.telegram.ui.Components.jl0 Q;
    public org.telegram.ui.Components.jl0 R;
    public kc0 S;
    public View T;
    public f2.j0 U;
    public org.telegram.ui.ActionBar.w0 V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public ImageView a;
    public long a0;
    public TextView b;
    public boolean b0;
    public ImageView c;
    public final ArrayList c0;
    public org.telegram.ui.ActionBar.w0 d;
    public final a0.h d0;
    public org.telegram.ui.Components.zk e;
    public long e0;
    public LinearLayout f;
    public boolean f0;
    public final ArrayList g0;
    public ImageView h;
    public AnimatorSet h0;
    public IMapsProvider.IMarker i0;
    public qc0 j0;
    public FrameLayout k0;
    public boolean l0;
    public boolean m0;
    public TextView n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public TextView r;
    public boolean r0;
    public Drawable s;
    public Location s0;
    public Location t0;
    public int u0;
    public lh.z2 v;
    public TLRPC.TL_channelLocation v0;
    public org.telegram.ui.ActionBar.w0 w;
    public TLRPC.TL_channelLocation w0;
    public oc0 x;
    public MessageObject x0;
    public nh.t3 y;
    public boolean y0;
    public boolean z0;

    public rc0(int i10) {
        super(null);
        this.B = new UndoView[2];
        this.X = true;
        this.Y = false;
        this.Z = true;
        this.b0 = true;
        this.c0 = new ArrayList();
        this.d0 = new a0.h();
        this.e0 = -1L;
        this.g0 = new ArrayList();
        this.l0 = true;
        this.m0 = true;
        this.D0 = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.K0 = true;
        this.M0 = new Bitmap[7];
        this.C0 = i10;
        AndroidUtilities.fixGoogleMapsBug();
    }

    public static void U(rc0 rc0Var) {
        IMapsProvider.IMap iMap;
        Activity parentActivity;
        int i10 = rc0Var.C0;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = rc0Var.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            if (rc0Var.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rc0Var.getParentActivity());
            alertDialog$Builder.m(R.raw.permission_request_location, 72, rc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
            alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new xb0(rc0Var, 1));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            rc0Var.showDialog(alertDialog$Builder.a);
            return;
        }
        if (rc0Var.d0() || i10 == 3) {
            if ((rc0Var.x0 == null || i10 == 3) && rc0Var.v0 == null) {
                if (rc0Var.s0 != null && rc0Var.E != null) {
                    ImageView imageView = rc0Var.a;
                    int i11 = org.telegram.ui.ActionBar.g6.vi;
                    imageView.setColorFilter(new PorterDuffColorFilter(rc0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                    rc0Var.a.setTag(Integer.valueOf(i11));
                    rc0Var.P.L(null);
                    rc0Var.y0 = false;
                    rc0Var.y0(false);
                    rc0Var.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(rc0Var.s0.getLatitude(), rc0Var.s0.getLongitude())));
                    if (rc0Var.z0 && i10 != 8) {
                        Location location = rc0Var.s0;
                        if (location != null) {
                            rc0Var.P.H(null, location, true);
                        }
                        rc0Var.z0 = false;
                        rc0Var.x0();
                    }
                }
            } else if (rc0Var.s0 != null && (iMap = rc0Var.E) != null) {
                iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(rc0Var.s0.getLatitude(), rc0Var.s0.getLongitude()), rc0Var.E.getMaxZoomLevel() - 4.0f));
            }
            if (rc0Var.i0 != null) {
                rc0Var.T.setVisibility(0);
                oc0 oc0Var = rc0Var.x;
                IMapsProvider.IMarker iMarker = rc0Var.i0;
                HashMap hashMap = oc0Var.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    oc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                rc0Var.i0 = null;
                rc0Var.j0 = null;
                rc0Var.k0 = null;
            }
        }
    }

    public static /* synthetic */ void V(rc0 rc0Var, boolean z10, TLRPC.User user, int i10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (!z10) {
            rc0Var.w0(i10, user, 0);
            return;
        }
        LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.a0);
        if (sharingLocationInfo != null) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.peer = rc0Var.getMessagesController().getInputPeer(sharingLocationInfo.did);
            tL_messages_editMessage.id = sharingLocationInfo.mid;
            tL_messages_editMessage.flags |= 16384;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = false;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
            Location lastKnownLocation = LocationController.getInstance(rc0Var.currentAccount).getLastKnownLocation();
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
            int i15 = i10 == Integer.MAX_VALUE ? ConnectionsManager.DEFAULT_DATACENTER_ID : sharingLocationInfo.period + i10;
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
                rc0Var.getMessagesStorage().replaceMessageIfExists(sharingLocationInfo.messageObject.messageOwner, null, null, true);
            }
            rc0Var.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
        }
    }

    public static /* synthetic */ void W(rc0 rc0Var) {
        zb0 zb0Var;
        rc0Var.getLocationController().markLiveLoactionsAsRead(rc0Var.a0);
        if (rc0Var.isPaused || (zb0Var = rc0Var.F0) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(zb0Var, 5000L);
    }

    public static IMapsProvider.LatLng p0(IMapsProvider.LatLng latLng, double d, double d10) {
        double degrees = Math.toDegrees(d10 / (Math.cos(Math.toRadians(latLng.latitude)) * 6366198.0d));
        return new IMapsProvider.LatLng(latLng.latitude + Math.toDegrees(d / 6366198.0d), latLng.longitude + degrees);
    }

    public final void A0(boolean z10) {
        int i10;
        int i11;
        FrameLayout.LayoutParams layoutParams;
        f2.n1 K = this.Q.K(0);
        if (K != null) {
            i10 = (int) K.a.getY();
            i11 = Math.min(i10, 0) + this.D0;
        } else {
            i10 = -this.O.getMeasuredHeight();
            i11 = 0;
        }
        if (((FrameLayout.LayoutParams) this.O.getLayoutParams()) != null) {
            if (i11 <= 0) {
                if (this.G.getView().getVisibility() == 0) {
                    this.G.getView().setVisibility(4);
                    this.O.setVisibility(4);
                    oc0 oc0Var = this.x;
                    if (oc0Var != null) {
                        oc0Var.setVisibility(4);
                    }
                }
            } else if (this.G.getView().getVisibility() == 4) {
                this.G.getView().setVisibility(0);
                this.O.setVisibility(0);
                oc0 oc0Var2 = this.x;
                if (oc0Var2 != null) {
                    oc0Var2.setVisibility(0);
                }
            }
            this.O.setTranslationY(Math.min(0, i10));
            int i12 = -i10;
            int i13 = i12 / 2;
            this.G.getView().setTranslationY(Math.max(0, i13));
            oc0 oc0Var3 = this.x;
            if (oc0Var3 != null) {
                oc0Var3.setTranslationY(Math.max(0, i13));
            }
            int measuredHeight = this.D0 - this.d.getMeasuredHeight();
            int i14 = this.C0;
            float min = Math.min(measuredHeight - AndroidUtilities.dp(64 + ((i14 == 0 || i14 == 1) ? 30 : 10)), i12);
            this.d.setTranslationY(min);
            this.c.setTranslationY(min);
            nh.t3 t3Var = this.y;
            if (t3Var != null) {
                t3Var.setTranslationY(min);
            }
            org.telegram.ui.Components.zk zkVar = this.e;
            if (zkVar != null) {
                zkVar.c = min;
                zkVar.setTranslationY(min + zkVar.b);
            }
            View view = this.T;
            if (view != null) {
                int dp = (i11 / 2) + (i12 - AndroidUtilities.dp(view.getTag() == null ? 48.0f : 69.0f));
                this.u0 = dp;
                view.setTranslationY(dp);
            }
            if (z10) {
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.G.getView().getLayoutParams();
            if (layoutParams2 != null) {
                if (layoutParams2.height != AndroidUtilities.dp(10.0f) + this.D0) {
                    layoutParams2.height = AndroidUtilities.dp(10.0f) + this.D0;
                    IMapsProvider.IMap iMap = this.E;
                    if (iMap != null) {
                        iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                    }
                    this.G.getView().setLayoutParams(layoutParams2);
                }
            }
            oc0 oc0Var4 = this.x;
            if (oc0Var4 == null || (layoutParams = (FrameLayout.LayoutParams) oc0Var4.getLayoutParams()) == null) {
                return;
            }
            if (layoutParams.height != AndroidUtilities.dp(10.0f) + this.D0) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.D0;
                this.x.setLayoutParams(layoutParams);
            }
        }
    }

    public final void B0() {
        if (!this.n0) {
            this.f.setVisibility(8);
        } else {
            if (!this.p0) {
                this.R.setEmptyView(this.f);
                return;
            }
            this.R.setEmptyView(null);
            this.f.setVisibility(8);
            this.R.setVisibility(8);
        }
    }

    public final void C0() {
        TLRPC.MessageMedia messageMedia;
        int i10;
        if (this.b == null) {
            return;
        }
        if (this.f0) {
            z0(false, true);
            j0();
            return;
        }
        int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
        ArrayList arrayList = this.c0;
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.Message message = ((lc0) arrayList.get(i12)).b;
            if (message != null && (messageMedia = message.media) != null && ((i10 = messageMedia.period) == Integer.MAX_VALUE || message.date + i10 > currentTime)) {
                i11++;
            }
        }
        boolean z10 = this.d0.f(getUserConfig().getClientUserId()) != null;
        if (this.s0 != null && !z10) {
            i11++;
        }
        z0(i11 >= 2, true);
    }

    public final lc0 c0(TLRPC.Message message) {
        Location location;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
        long fromChatId = MessageObject.getFromChatId(message);
        a0.h hVar = this.d0;
        lc0 lc0Var = (lc0) hVar.f(fromChatId);
        if (lc0Var == null) {
            lc0Var = new lc0();
            lc0Var.b = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                lc0Var.c = getMessagesController().getUser(Long.valueOf(lc0Var.b.from_id.user_id));
                lc0Var.a = lc0Var.b.from_id.user_id;
            } else {
                long dialogId = MessageObject.getDialogId(message);
                if (DialogObject.isUserDialog(dialogId)) {
                    lc0Var.c = getMessagesController().getUser(Long.valueOf(dialogId));
                } else {
                    lc0Var.d = getMessagesController().getChat(Long.valueOf(-dialogId));
                }
                lc0Var.a = dialogId;
            }
            v0(lc0Var);
            try {
                IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                Bitmap g02 = g0(lc0Var);
                if (g02 != null) {
                    position.icon(g02);
                    position.anchor(0.5f, 0.907f);
                    lc0Var.e = this.E.addMarker(position);
                    if (!UserObject.isUserSelf(lc0Var.c)) {
                        IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                        flat.anchor(0.5f, 0.5f);
                        IMapsProvider.IMarker addMarker = this.E.addMarker(flat);
                        lc0Var.f = addMarker;
                        int i10 = message.media.heading;
                        if (i10 != 0) {
                            addMarker.setRotation(i10);
                            lc0Var.f.setIcon(R.drawable.map_pin_cone2);
                            lc0Var.g = true;
                        } else {
                            addMarker.setRotation(0);
                            lc0Var.f.setIcon(R.drawable.map_pin_circle);
                            lc0Var.g = false;
                        }
                    }
                    this.c0.add(lc0Var);
                    hVar.k(lc0Var, lc0Var.a);
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.a0);
                    if (lc0Var.a == getUserConfig().getClientUserId() && sharingLocationInfo != null && lc0Var.b.id == sharingLocationInfo.mid && (location = this.s0) != null) {
                        lc0Var.e.setPosition(new IMapsProvider.LatLng(location.getLatitude(), this.s0.getLongitude()));
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        } else {
            lc0Var.b = message;
            lc0Var.e.setPosition(latLng);
            if (this.e0 == lc0Var.a) {
                this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(lc0Var.e.getPosition()));
            }
        }
        org.telegram.ui.Components.ai0 ai0Var = this.N;
        if (ai0Var != null) {
            ai0Var.c(true);
        }
        C0();
        return lc0Var;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        boolean z10;
        int i10;
        int i11;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.o0 = false;
        this.n0 = false;
        this.p0 = false;
        fc0 fc0Var = this.P;
        if (fc0Var != null) {
            fc0Var.F();
        }
        kc0 kc0Var = this.S;
        if (kc0Var != null) {
            kc0Var.F();
        }
        if (this.v0 != null) {
            Location location = new Location("network");
            this.t0 = location;
            location.setLatitude(this.v0.geo_point.lat);
            this.t0.setLongitude(this.v0.geo_point._long);
        } else if (this.x0 != null) {
            Location location2 = new Location("network");
            this.t0 = location2;
            location2.setLatitude(this.x0.messageOwner.media.geo.lat);
            this.t0.setLongitude(this.x0.messageOwner.media.geo._long);
        }
        this.Y = (Build.VERSION.SDK_INT < 23 || getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.h5;
        lVar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.g6.j5;
        lVar2.setTitleColor(getThemedColor(i13));
        this.actionBar.C(getThemedColor(i13), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.g6.I5), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ec0(this));
        org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
        TLRPC.TL_channelLocation tL_channelLocation = this.v0;
        int i14 = this.C0;
        if (tL_channelLocation != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
        } else {
            MessageObject messageObject = this.x0;
            if (messageObject == null) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ShareLocation));
                if (i14 != 4) {
                    this.x = new oc0(this, context);
                    org.telegram.ui.ActionBar.w0 c3 = n10.c(0, R.drawable.outline_header_search, getResourceProvider());
                    c3.F();
                    c3.D = new bb(this, 11);
                    this.w = c3;
                    c3.setSearchFieldHint(LocaleController.getString(R.string.Search));
                    this.w.setContentDescription(LocaleController.getString(R.string.Search));
                    EditTextBoldCursor searchField = this.w.getSearchField();
                    searchField.setTextColor(getThemedColor(i13));
                    searchField.setCursorColor(getThemedColor(i13));
                    searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Vd));
                }
            } else if (messageObject.isLiveLocation()) {
                this.actionBar.setTitle(LocaleController.getString(R.string.AttachLiveLocation));
                org.telegram.ui.ActionBar.w0 c6 = n10.c(0, R.drawable.ic_ab_other, getResourceProvider());
                this.V = c6;
                c6.e(6, R.drawable.filled_directions, LocaleController.getString(R.string.GetDirections));
            } else {
                String str = this.x0.messageOwner.media.title;
                if (str == null || str.length() <= 0) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.SharedPlace));
                }
                if (i14 != 3) {
                    org.telegram.ui.ActionBar.w0 c10 = n10.c(0, R.drawable.ic_ab_other, getResourceProvider());
                    this.V = c10;
                    c10.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
                    if (!getLocationController().isSharingLocation(this.a0) && this.K0) {
                        this.V.e(5, R.drawable.msg_location, LocaleController.getString(R.string.SendLiveLocationMenu));
                    }
                    this.V.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                }
            }
        }
        pc0 pc0Var = new pc0(this, context);
        this.fragmentView = pc0Var;
        pc0Var.setBackgroundColor(getThemedColor(i12));
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s = mutate;
        int themedColor = getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        Rect rect = new Rect();
        this.s.getPadding(rect);
        FrameLayout.LayoutParams layoutParams = (i14 == 0 || i14 == 1) ? new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f) + rect.top) : new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(6.0f) + rect.top);
        layoutParams.gravity = 83;
        n0 n0Var = new n0(this, context, 11);
        this.O = n0Var;
        n0Var.setBackgroundDrawable(new cf.f(n0()));
        MessageObject messageObject2 = this.x0;
        if ((messageObject2 == null && (i14 == 0 || i14 == 1)) || (messageObject2 != null && i14 == 3)) {
            org.telegram.ui.Components.zk zkVar = new org.telegram.ui.Components.zk(context, 1);
            this.e = zkVar;
            zkVar.setTranslationX(-AndroidUtilities.dp(80.0f));
            int dp = AndroidUtilities.dp(40.0f);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.wi);
            int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.g6.xi);
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, themedColor2, themedColor3, themedColor3);
            i7.h6.a(this.e);
            this.e.setTranslationZ(AndroidUtilities.dp(2.0f));
            this.e.setOutlineProvider(jf.q0.b);
            this.e.setBackgroundDrawable(i02);
            this.e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.vi));
            this.e.setTextSize(1, 14.0f);
            this.e.setTypeface(AndroidUtilities.bold());
            this.e.setGravity(17);
            this.e.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.O.addView(this.e, i7.f6.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
            if (i14 == 3) {
                this.e.setText(LocaleController.getString(R.string.OpenInMaps));
                final int i15 = 5;
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wb0
                    public final /* synthetic */ rc0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        boolean z11;
                        int i16 = i15;
                        rc0 rc0Var = this.b;
                        int i17 = 1;
                        switch (i16) {
                            case 0:
                                rc0Var.y0(false);
                                rc0Var.P.H(null, rc0Var.t0, true);
                                rc0Var.z0 = true;
                                rc0Var.x0();
                                break;
                            case 1:
                                rc0Var.d.M(null, null);
                                break;
                            case 2:
                                rc0.U(rc0Var);
                                break;
                            case 3:
                                rc0Var.e0 = -1L;
                                rc0Var.y0 = true;
                                if (rc0Var.j0()) {
                                    rc0Var.f0 = true;
                                    rc0Var.z0(false, true);
                                    break;
                                }
                                break;
                            case 4:
                                if (rc0Var.getParentActivity() != null && rc0Var.s0 != null && rc0Var.d0() && rc0Var.E != null) {
                                    nh.t3 t3Var = rc0Var.y;
                                    if (t3Var != null) {
                                        t3Var.e(true);
                                    }
                                    int i18 = 3;
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.a0);
                                    if (rc0Var.C) {
                                        rc0Var.B[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        rc0Var.c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = rc0Var.K;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            rc0Var.K = null;
                                        }
                                        rc0Var.C = true;
                                        rc0Var.m0().k(0L, 25, 0, null, new zb0(rc0Var, i17), new x60(18, rc0Var, sharingLocationInfo));
                                        break;
                                    } else {
                                        IMapsProvider.ICircle iCircle2 = rc0Var.K;
                                        if (iCircle2 == null) {
                                            rc0Var.e0(500);
                                        } else {
                                            rc0Var.L = iCircle2.getRadius();
                                        }
                                        TLRPC.User user = DialogObject.isUserDialog(rc0Var.a0) ? rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.a0)) : null;
                                        Activity parentActivity = rc0Var.getParentActivity();
                                        xb0 xb0Var = new xb0(rc0Var, i18);
                                        xr xrVar = new xr(23, rc0Var, user);
                                        zb0 zb0Var = new zb0(rc0Var, 2);
                                        org.telegram.ui.Components.ai0 ai0Var = new org.telegram.ui.Components.ai0(parentActivity);
                                        ai0Var.a = null;
                                        ai0Var.d = -1;
                                        ai0Var.e = false;
                                        ai0Var.f = false;
                                        ai0Var.h = null;
                                        ai0Var.n = new Rect();
                                        new Paint();
                                        ai0Var.w = true;
                                        ai0Var.B = org.telegram.ui.Components.jr.h;
                                        ai0Var.setWillNotDraw(false);
                                        ai0Var.M = zb0Var;
                                        ai0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                        Rect rect2 = new Rect();
                                        Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false), PorterDuff.Mode.MULTIPLY));
                                        mutate2.getPadding(rect2);
                                        int i19 = rect2.left;
                                        ai0Var.x = i19;
                                        org.telegram.ui.Components.wh0 wh0Var = new org.telegram.ui.Components.wh0(ai0Var.getContext());
                                        ai0Var.v = wh0Var;
                                        wh0Var.setBackgroundDrawable(mutate2);
                                        wh0Var.setPadding(i19, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i19, 0);
                                        wh0Var.setVisibility(4);
                                        ai0Var.addView(wh0Var, 0, i7.f6.e(-1, -2, 80));
                                        ai0Var.K = LocaleController.getUseImperialSystemType();
                                        ai0Var.I = user;
                                        ai0Var.E = xb0Var;
                                        org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(parentActivity, null);
                                        ai0Var.C = qc0Var;
                                        qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                        qc0Var.setItemCount(5);
                                        org.telegram.ui.Components.qc0 qc0Var2 = new org.telegram.ui.Components.qc0(parentActivity, null);
                                        ai0Var.D = qc0Var2;
                                        qc0Var2.setItemCount(5);
                                        qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                        org.telegram.ui.Components.xh0 xh0Var = new org.telegram.ui.Components.xh0(ai0Var, parentActivity);
                                        ai0Var.L = xh0Var;
                                        xh0Var.setOrientation(1);
                                        FrameLayout frameLayout = new FrameLayout(parentActivity);
                                        xh0Var.addView(frameLayout, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
                                        TextView textView = new TextView(parentActivity);
                                        textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                        org.telegram.messenger.x3.t(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false), 1, 20.0f);
                                        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                        textView.setOnTouchListener(new mh.d(20));
                                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                                        linearLayout.setOrientation(0);
                                        linearLayout.setWeightSum(1.0f);
                                        xh0Var.addView(linearLayout, i7.f6.n(-1, -2));
                                        System.currentTimeMillis();
                                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                        TextView textView2 = new TextView(parentActivity);
                                        ai0Var.G = textView2;
                                        org.telegram.ui.Components.yh0 yh0Var = new org.telegram.ui.Components.yh0(parentActivity);
                                        ai0Var.F = yh0Var;
                                        linearLayout.addView(qc0Var, i7.f6.l(0.5f, 0, 270));
                                        qc0Var.setFormatter(new org.telegram.ui.Components.vh0(ai0Var, 0));
                                        qc0Var.setMinValue(0);
                                        qc0Var.setMaxValue(10);
                                        qc0Var.setWrapSelectorWheel(false);
                                        qc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                        org.telegram.ui.Components.vh0 vh0Var = new org.telegram.ui.Components.vh0(ai0Var, 1);
                                        qc0Var.setOnValueChangedListener(vh0Var);
                                        qc0Var2.setMinValue(0);
                                        qc0Var2.setMaxValue(10);
                                        qc0Var2.setWrapSelectorWheel(false);
                                        qc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                        linearLayout.addView(qc0Var2, i7.f6.l(0.5f, 0, 270));
                                        qc0Var2.setFormatter(new org.telegram.ui.Components.vh0(ai0Var, 2));
                                        qc0Var2.setOnValueChangedListener(vh0Var);
                                        qc0Var.setValue(0);
                                        qc0Var2.setValue(6);
                                        xh0Var.addView(frameLayout2, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
                                        yh0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        yh0Var.setGravity(17);
                                        yh0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                                        yh0Var.setTextSize(1, 14.0f);
                                        yh0Var.setMaxLines(2);
                                        yh0Var.setTypeface(AndroidUtilities.bold());
                                        yh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                                        frameLayout2.addView(yh0Var, i7.f6.c(48.0f, -1));
                                        yh0Var.setOnClickListener(new org.telegram.ui.Components.t2(29, ai0Var, xrVar));
                                        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        textView2.setGravity(17);
                                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q5, false));
                                        textView2.setTextSize(1, 14.0f);
                                        textView2.setAlpha(0.0f);
                                        textView2.setScaleX(0.5f);
                                        textView2.setScaleY(0.5f);
                                        frameLayout2.addView(textView2, i7.f6.c(48.0f, -1));
                                        wh0Var.addView(xh0Var, i7.f6.e(-1, -2, 51));
                                        rc0Var.N = ai0Var;
                                        ((FrameLayout) rc0Var.fragmentView).addView(ai0Var, i7.f6.c(-1.0f, -1));
                                        org.telegram.ui.Components.ai0 ai0Var2 = rc0Var.N;
                                        ai0Var2.r = false;
                                        AnimatorSet animatorSet = ai0Var2.s;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                            ai0Var2.s = null;
                                        }
                                        org.telegram.ui.Components.wh0 wh0Var2 = ai0Var2.v;
                                        wh0Var2.measure(View.MeasureSpec.makeMeasureSpec((ai0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                        if (ai0Var2.r) {
                                            z11 = true;
                                        } else {
                                            wh0Var2.setVisibility(0);
                                            if (ai0Var2.w) {
                                                ai0Var2.setLayerType(2, null);
                                            }
                                            wh0Var2.setTranslationY(wh0Var2.getMeasuredHeight());
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            ai0Var2.s = animatorSet2;
                                            animatorSet2.playTogether(ObjectAnimator.ofFloat(wh0Var2, (Property<org.telegram.ui.Components.wh0, Float>) View.TRANSLATION_Y, 0.0f));
                                            ai0Var2.s.setDuration(400L);
                                            ai0Var2.s.setStartDelay(20L);
                                            ai0Var2.s.setInterpolator(ai0Var2.B);
                                            z11 = true;
                                            ai0Var2.s.addListener(new org.telegram.ui.Components.zh0(ai0Var2, 1 == true ? 1 : 0));
                                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                            ai0Var2.s.start();
                                        }
                                        ai0Var2.c(z11);
                                        break;
                                    }
                                }
                                break;
                            default:
                                rc0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = rc0Var.x0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    break;
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                        }
                    }
                });
                this.e.setTranslationX(0.0f);
            } else {
                this.e.setText(LocaleController.getString(R.string.PlacesInThisArea));
                final int i16 = 0;
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wb0
                    public final /* synthetic */ rc0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        boolean z11;
                        int i162 = i16;
                        rc0 rc0Var = this.b;
                        int i17 = 1;
                        switch (i162) {
                            case 0:
                                rc0Var.y0(false);
                                rc0Var.P.H(null, rc0Var.t0, true);
                                rc0Var.z0 = true;
                                rc0Var.x0();
                                break;
                            case 1:
                                rc0Var.d.M(null, null);
                                break;
                            case 2:
                                rc0.U(rc0Var);
                                break;
                            case 3:
                                rc0Var.e0 = -1L;
                                rc0Var.y0 = true;
                                if (rc0Var.j0()) {
                                    rc0Var.f0 = true;
                                    rc0Var.z0(false, true);
                                    break;
                                }
                                break;
                            case 4:
                                if (rc0Var.getParentActivity() != null && rc0Var.s0 != null && rc0Var.d0() && rc0Var.E != null) {
                                    nh.t3 t3Var = rc0Var.y;
                                    if (t3Var != null) {
                                        t3Var.e(true);
                                    }
                                    int i18 = 3;
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.a0);
                                    if (rc0Var.C) {
                                        rc0Var.B[0].e(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        rc0Var.c.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = rc0Var.K;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            rc0Var.K = null;
                                        }
                                        rc0Var.C = true;
                                        rc0Var.m0().k(0L, 25, 0, null, new zb0(rc0Var, i17), new x60(18, rc0Var, sharingLocationInfo));
                                        break;
                                    } else {
                                        IMapsProvider.ICircle iCircle2 = rc0Var.K;
                                        if (iCircle2 == null) {
                                            rc0Var.e0(500);
                                        } else {
                                            rc0Var.L = iCircle2.getRadius();
                                        }
                                        TLRPC.User user = DialogObject.isUserDialog(rc0Var.a0) ? rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.a0)) : null;
                                        Activity parentActivity = rc0Var.getParentActivity();
                                        xb0 xb0Var = new xb0(rc0Var, i18);
                                        xr xrVar = new xr(23, rc0Var, user);
                                        zb0 zb0Var = new zb0(rc0Var, 2);
                                        org.telegram.ui.Components.ai0 ai0Var = new org.telegram.ui.Components.ai0(parentActivity);
                                        ai0Var.a = null;
                                        ai0Var.d = -1;
                                        ai0Var.e = false;
                                        ai0Var.f = false;
                                        ai0Var.h = null;
                                        ai0Var.n = new Rect();
                                        new Paint();
                                        ai0Var.w = true;
                                        ai0Var.B = org.telegram.ui.Components.jr.h;
                                        ai0Var.setWillNotDraw(false);
                                        ai0Var.M = zb0Var;
                                        ai0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                        Rect rect2 = new Rect();
                                        Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false), PorterDuff.Mode.MULTIPLY));
                                        mutate2.getPadding(rect2);
                                        int i19 = rect2.left;
                                        ai0Var.x = i19;
                                        org.telegram.ui.Components.wh0 wh0Var = new org.telegram.ui.Components.wh0(ai0Var.getContext());
                                        ai0Var.v = wh0Var;
                                        wh0Var.setBackgroundDrawable(mutate2);
                                        wh0Var.setPadding(i19, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i19, 0);
                                        wh0Var.setVisibility(4);
                                        ai0Var.addView(wh0Var, 0, i7.f6.e(-1, -2, 80));
                                        ai0Var.K = LocaleController.getUseImperialSystemType();
                                        ai0Var.I = user;
                                        ai0Var.E = xb0Var;
                                        org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(parentActivity, null);
                                        ai0Var.C = qc0Var;
                                        qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                        qc0Var.setItemCount(5);
                                        org.telegram.ui.Components.qc0 qc0Var2 = new org.telegram.ui.Components.qc0(parentActivity, null);
                                        ai0Var.D = qc0Var2;
                                        qc0Var2.setItemCount(5);
                                        qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                        org.telegram.ui.Components.xh0 xh0Var = new org.telegram.ui.Components.xh0(ai0Var, parentActivity);
                                        ai0Var.L = xh0Var;
                                        xh0Var.setOrientation(1);
                                        FrameLayout frameLayout = new FrameLayout(parentActivity);
                                        xh0Var.addView(frameLayout, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
                                        TextView textView = new TextView(parentActivity);
                                        textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                        org.telegram.messenger.x3.t(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false), 1, 20.0f);
                                        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                        textView.setOnTouchListener(new mh.d(20));
                                        LinearLayout linearLayout = new LinearLayout(parentActivity);
                                        linearLayout.setOrientation(0);
                                        linearLayout.setWeightSum(1.0f);
                                        xh0Var.addView(linearLayout, i7.f6.n(-1, -2));
                                        System.currentTimeMillis();
                                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                        TextView textView2 = new TextView(parentActivity);
                                        ai0Var.G = textView2;
                                        org.telegram.ui.Components.yh0 yh0Var = new org.telegram.ui.Components.yh0(parentActivity);
                                        ai0Var.F = yh0Var;
                                        linearLayout.addView(qc0Var, i7.f6.l(0.5f, 0, 270));
                                        qc0Var.setFormatter(new org.telegram.ui.Components.vh0(ai0Var, 0));
                                        qc0Var.setMinValue(0);
                                        qc0Var.setMaxValue(10);
                                        qc0Var.setWrapSelectorWheel(false);
                                        qc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                        org.telegram.ui.Components.vh0 vh0Var = new org.telegram.ui.Components.vh0(ai0Var, 1);
                                        qc0Var.setOnValueChangedListener(vh0Var);
                                        qc0Var2.setMinValue(0);
                                        qc0Var2.setMaxValue(10);
                                        qc0Var2.setWrapSelectorWheel(false);
                                        qc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                        linearLayout.addView(qc0Var2, i7.f6.l(0.5f, 0, 270));
                                        qc0Var2.setFormatter(new org.telegram.ui.Components.vh0(ai0Var, 2));
                                        qc0Var2.setOnValueChangedListener(vh0Var);
                                        qc0Var.setValue(0);
                                        qc0Var2.setValue(6);
                                        xh0Var.addView(frameLayout2, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
                                        yh0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        yh0Var.setGravity(17);
                                        yh0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                                        yh0Var.setTextSize(1, 14.0f);
                                        yh0Var.setMaxLines(2);
                                        yh0Var.setTypeface(AndroidUtilities.bold());
                                        yh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                                        frameLayout2.addView(yh0Var, i7.f6.c(48.0f, -1));
                                        yh0Var.setOnClickListener(new org.telegram.ui.Components.t2(29, ai0Var, xrVar));
                                        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                        textView2.setGravity(17);
                                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q5, false));
                                        textView2.setTextSize(1, 14.0f);
                                        textView2.setAlpha(0.0f);
                                        textView2.setScaleX(0.5f);
                                        textView2.setScaleY(0.5f);
                                        frameLayout2.addView(textView2, i7.f6.c(48.0f, -1));
                                        wh0Var.addView(xh0Var, i7.f6.e(-1, -2, 51));
                                        rc0Var.N = ai0Var;
                                        ((FrameLayout) rc0Var.fragmentView).addView(ai0Var, i7.f6.c(-1.0f, -1));
                                        org.telegram.ui.Components.ai0 ai0Var2 = rc0Var.N;
                                        ai0Var2.r = false;
                                        AnimatorSet animatorSet = ai0Var2.s;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                            ai0Var2.s = null;
                                        }
                                        org.telegram.ui.Components.wh0 wh0Var2 = ai0Var2.v;
                                        wh0Var2.measure(View.MeasureSpec.makeMeasureSpec((ai0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                        if (ai0Var2.r) {
                                            z11 = true;
                                        } else {
                                            wh0Var2.setVisibility(0);
                                            if (ai0Var2.w) {
                                                ai0Var2.setLayerType(2, null);
                                            }
                                            wh0Var2.setTranslationY(wh0Var2.getMeasuredHeight());
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            ai0Var2.s = animatorSet2;
                                            animatorSet2.playTogether(ObjectAnimator.ofFloat(wh0Var2, (Property<org.telegram.ui.Components.wh0, Float>) View.TRANSLATION_Y, 0.0f));
                                            ai0Var2.s.setDuration(400L);
                                            ai0Var2.s.setStartDelay(20L);
                                            ai0Var2.s.setInterpolator(ai0Var2.B);
                                            z11 = true;
                                            ai0Var2.s.addListener(new org.telegram.ui.Components.zh0(ai0Var2, 1 == true ? 1 : 0));
                                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                            ai0Var2.s.start();
                                        }
                                        ai0Var2.c(z11);
                                        break;
                                    }
                                }
                                break;
                            default:
                                rc0Var.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = rc0Var.x0.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d10 = geoPoint._long;
                                    rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                                    break;
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                        }
                    }
                });
            }
        }
        int i17 = org.telegram.ui.ActionBar.g6.ui;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(i17), false, getResourceProvider());
        this.d = w0Var;
        w0Var.setClickable(true);
        this.d.setSubMenuOpenSide(2);
        this.d.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        this.d.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        this.d.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), getResourceProvider());
        this.d.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), getResourceProvider());
        this.d.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), getResourceProvider());
        this.d.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int dp2 = AndroidUtilities.dp(40.0f);
        int i18 = org.telegram.ui.ActionBar.g6.wi;
        int themedColor4 = getThemedColor(i18);
        int i19 = org.telegram.ui.ActionBar.g6.xi;
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.g6.h0(dp2, themedColor4, getThemedColor(i19));
        i7.h6.a(this.d);
        this.d.setTranslationZ(AndroidUtilities.dp(2.0f));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.d;
        eg.k1 k1Var = jf.q0.a;
        w0Var2.setOutlineProvider(k1Var);
        this.d.setBackgroundDrawable(h02);
        this.d.setIcon(R.drawable.msg_map_type);
        this.O.addView(this.d, i7.f6.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        final int i20 = 1;
        this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wb0
            public final /* synthetic */ rc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11;
                int i162 = i20;
                rc0 rc0Var = this.b;
                int i172 = 1;
                switch (i162) {
                    case 0:
                        rc0Var.y0(false);
                        rc0Var.P.H(null, rc0Var.t0, true);
                        rc0Var.z0 = true;
                        rc0Var.x0();
                        break;
                    case 1:
                        rc0Var.d.M(null, null);
                        break;
                    case 2:
                        rc0.U(rc0Var);
                        break;
                    case 3:
                        rc0Var.e0 = -1L;
                        rc0Var.y0 = true;
                        if (rc0Var.j0()) {
                            rc0Var.f0 = true;
                            rc0Var.z0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (rc0Var.getParentActivity() != null && rc0Var.s0 != null && rc0Var.d0() && rc0Var.E != null) {
                            nh.t3 t3Var = rc0Var.y;
                            if (t3Var != null) {
                                t3Var.e(true);
                            }
                            int i182 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.a0);
                            if (rc0Var.C) {
                                rc0Var.B[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                rc0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = rc0Var.K;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    rc0Var.K = null;
                                }
                                rc0Var.C = true;
                                rc0Var.m0().k(0L, 25, 0, null, new zb0(rc0Var, i172), new x60(18, rc0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = rc0Var.K;
                                if (iCircle2 == null) {
                                    rc0Var.e0(500);
                                } else {
                                    rc0Var.L = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(rc0Var.a0) ? rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.a0)) : null;
                                Activity parentActivity = rc0Var.getParentActivity();
                                xb0 xb0Var = new xb0(rc0Var, i182);
                                xr xrVar = new xr(23, rc0Var, user);
                                zb0 zb0Var = new zb0(rc0Var, 2);
                                org.telegram.ui.Components.ai0 ai0Var = new org.telegram.ui.Components.ai0(parentActivity);
                                ai0Var.a = null;
                                ai0Var.d = -1;
                                ai0Var.e = false;
                                ai0Var.f = false;
                                ai0Var.h = null;
                                ai0Var.n = new Rect();
                                new Paint();
                                ai0Var.w = true;
                                ai0Var.B = org.telegram.ui.Components.jr.h;
                                ai0Var.setWillNotDraw(false);
                                ai0Var.M = zb0Var;
                                ai0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false), PorterDuff.Mode.MULTIPLY));
                                mutate2.getPadding(rect2);
                                int i192 = rect2.left;
                                ai0Var.x = i192;
                                org.telegram.ui.Components.wh0 wh0Var = new org.telegram.ui.Components.wh0(ai0Var.getContext());
                                ai0Var.v = wh0Var;
                                wh0Var.setBackgroundDrawable(mutate2);
                                wh0Var.setPadding(i192, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i192, 0);
                                wh0Var.setVisibility(4);
                                ai0Var.addView(wh0Var, 0, i7.f6.e(-1, -2, 80));
                                ai0Var.K = LocaleController.getUseImperialSystemType();
                                ai0Var.I = user;
                                ai0Var.E = xb0Var;
                                org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(parentActivity, null);
                                ai0Var.C = qc0Var;
                                qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                qc0Var.setItemCount(5);
                                org.telegram.ui.Components.qc0 qc0Var2 = new org.telegram.ui.Components.qc0(parentActivity, null);
                                ai0Var.D = qc0Var2;
                                qc0Var2.setItemCount(5);
                                qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.xh0 xh0Var = new org.telegram.ui.Components.xh0(ai0Var, parentActivity);
                                ai0Var.L = xh0Var;
                                xh0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                xh0Var.addView(frameLayout, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(parentActivity);
                                textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.x3.t(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false), 1, 20.0f);
                                frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new mh.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                xh0Var.addView(linearLayout, i7.f6.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView2 = new TextView(parentActivity);
                                ai0Var.G = textView2;
                                org.telegram.ui.Components.yh0 yh0Var = new org.telegram.ui.Components.yh0(parentActivity);
                                ai0Var.F = yh0Var;
                                linearLayout.addView(qc0Var, i7.f6.l(0.5f, 0, 270));
                                qc0Var.setFormatter(new org.telegram.ui.Components.vh0(ai0Var, 0));
                                qc0Var.setMinValue(0);
                                qc0Var.setMaxValue(10);
                                qc0Var.setWrapSelectorWheel(false);
                                qc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.vh0 vh0Var = new org.telegram.ui.Components.vh0(ai0Var, 1);
                                qc0Var.setOnValueChangedListener(vh0Var);
                                qc0Var2.setMinValue(0);
                                qc0Var2.setMaxValue(10);
                                qc0Var2.setWrapSelectorWheel(false);
                                qc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(qc0Var2, i7.f6.l(0.5f, 0, 270));
                                qc0Var2.setFormatter(new org.telegram.ui.Components.vh0(ai0Var, 2));
                                qc0Var2.setOnValueChangedListener(vh0Var);
                                qc0Var.setValue(0);
                                qc0Var2.setValue(6);
                                xh0Var.addView(frameLayout2, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
                                yh0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                yh0Var.setGravity(17);
                                yh0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                                yh0Var.setTextSize(1, 14.0f);
                                yh0Var.setMaxLines(2);
                                yh0Var.setTypeface(AndroidUtilities.bold());
                                yh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                                frameLayout2.addView(yh0Var, i7.f6.c(48.0f, -1));
                                yh0Var.setOnClickListener(new org.telegram.ui.Components.t2(29, ai0Var, xrVar));
                                textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView2.setGravity(17);
                                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q5, false));
                                textView2.setTextSize(1, 14.0f);
                                textView2.setAlpha(0.0f);
                                textView2.setScaleX(0.5f);
                                textView2.setScaleY(0.5f);
                                frameLayout2.addView(textView2, i7.f6.c(48.0f, -1));
                                wh0Var.addView(xh0Var, i7.f6.e(-1, -2, 51));
                                rc0Var.N = ai0Var;
                                ((FrameLayout) rc0Var.fragmentView).addView(ai0Var, i7.f6.c(-1.0f, -1));
                                org.telegram.ui.Components.ai0 ai0Var2 = rc0Var.N;
                                ai0Var2.r = false;
                                AnimatorSet animatorSet = ai0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    ai0Var2.s = null;
                                }
                                org.telegram.ui.Components.wh0 wh0Var2 = ai0Var2.v;
                                wh0Var2.measure(View.MeasureSpec.makeMeasureSpec((ai0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (ai0Var2.r) {
                                    z11 = true;
                                } else {
                                    wh0Var2.setVisibility(0);
                                    if (ai0Var2.w) {
                                        ai0Var2.setLayerType(2, null);
                                    }
                                    wh0Var2.setTranslationY(wh0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    ai0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(wh0Var2, (Property<org.telegram.ui.Components.wh0, Float>) View.TRANSLATION_Y, 0.0f));
                                    ai0Var2.s.setDuration(400L);
                                    ai0Var2.s.setStartDelay(20L);
                                    ai0Var2.s.setInterpolator(ai0Var2.B);
                                    z11 = true;
                                    ai0Var2.s.addListener(new org.telegram.ui.Components.zh0(ai0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    ai0Var2.s.start();
                                }
                                ai0Var2.c(z11);
                                break;
                            }
                        }
                        break;
                    default:
                        rc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = rc0Var.x0.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                }
            }
        });
        this.d.setDelegate(new xb0(this, 0));
        this.a = new ImageView(context);
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(40.0f), getThemedColor(i18), getThemedColor(i19));
        i7.h6.a(this.a);
        this.a.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.a.setOutlineProvider(k1Var);
        this.a.setBackground(h03);
        this.a.setImageResource(R.drawable.msg_current_location);
        ImageView imageView = this.a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.a;
        int i21 = org.telegram.ui.ActionBar.g6.vi;
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i21), mode));
        this.a.setTag(Integer.valueOf(i21));
        this.a.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        FrameLayout.LayoutParams d = i7.f6.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f);
        d.bottomMargin = (layoutParams.height - rect.top) + d.bottomMargin;
        this.O.addView(this.a, d);
        final int i22 = 2;
        this.a.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wb0
            public final /* synthetic */ rc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11;
                int i162 = i22;
                rc0 rc0Var = this.b;
                int i172 = 1;
                switch (i162) {
                    case 0:
                        rc0Var.y0(false);
                        rc0Var.P.H(null, rc0Var.t0, true);
                        rc0Var.z0 = true;
                        rc0Var.x0();
                        break;
                    case 1:
                        rc0Var.d.M(null, null);
                        break;
                    case 2:
                        rc0.U(rc0Var);
                        break;
                    case 3:
                        rc0Var.e0 = -1L;
                        rc0Var.y0 = true;
                        if (rc0Var.j0()) {
                            rc0Var.f0 = true;
                            rc0Var.z0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (rc0Var.getParentActivity() != null && rc0Var.s0 != null && rc0Var.d0() && rc0Var.E != null) {
                            nh.t3 t3Var = rc0Var.y;
                            if (t3Var != null) {
                                t3Var.e(true);
                            }
                            int i182 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.a0);
                            if (rc0Var.C) {
                                rc0Var.B[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                rc0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = rc0Var.K;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    rc0Var.K = null;
                                }
                                rc0Var.C = true;
                                rc0Var.m0().k(0L, 25, 0, null, new zb0(rc0Var, i172), new x60(18, rc0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = rc0Var.K;
                                if (iCircle2 == null) {
                                    rc0Var.e0(500);
                                } else {
                                    rc0Var.L = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(rc0Var.a0) ? rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.a0)) : null;
                                Activity parentActivity = rc0Var.getParentActivity();
                                xb0 xb0Var = new xb0(rc0Var, i182);
                                xr xrVar = new xr(23, rc0Var, user);
                                zb0 zb0Var = new zb0(rc0Var, 2);
                                org.telegram.ui.Components.ai0 ai0Var = new org.telegram.ui.Components.ai0(parentActivity);
                                ai0Var.a = null;
                                ai0Var.d = -1;
                                ai0Var.e = false;
                                ai0Var.f = false;
                                ai0Var.h = null;
                                ai0Var.n = new Rect();
                                new Paint();
                                ai0Var.w = true;
                                ai0Var.B = org.telegram.ui.Components.jr.h;
                                ai0Var.setWillNotDraw(false);
                                ai0Var.M = zb0Var;
                                ai0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false), PorterDuff.Mode.MULTIPLY));
                                mutate2.getPadding(rect2);
                                int i192 = rect2.left;
                                ai0Var.x = i192;
                                org.telegram.ui.Components.wh0 wh0Var = new org.telegram.ui.Components.wh0(ai0Var.getContext());
                                ai0Var.v = wh0Var;
                                wh0Var.setBackgroundDrawable(mutate2);
                                wh0Var.setPadding(i192, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i192, 0);
                                wh0Var.setVisibility(4);
                                ai0Var.addView(wh0Var, 0, i7.f6.e(-1, -2, 80));
                                ai0Var.K = LocaleController.getUseImperialSystemType();
                                ai0Var.I = user;
                                ai0Var.E = xb0Var;
                                org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(parentActivity, null);
                                ai0Var.C = qc0Var;
                                qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                qc0Var.setItemCount(5);
                                org.telegram.ui.Components.qc0 qc0Var2 = new org.telegram.ui.Components.qc0(parentActivity, null);
                                ai0Var.D = qc0Var2;
                                qc0Var2.setItemCount(5);
                                qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.xh0 xh0Var = new org.telegram.ui.Components.xh0(ai0Var, parentActivity);
                                ai0Var.L = xh0Var;
                                xh0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                xh0Var.addView(frameLayout, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView = new TextView(parentActivity);
                                textView.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.x3.t(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false), 1, 20.0f);
                                frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView.setOnTouchListener(new mh.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                xh0Var.addView(linearLayout, i7.f6.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView2 = new TextView(parentActivity);
                                ai0Var.G = textView2;
                                org.telegram.ui.Components.yh0 yh0Var = new org.telegram.ui.Components.yh0(parentActivity);
                                ai0Var.F = yh0Var;
                                linearLayout.addView(qc0Var, i7.f6.l(0.5f, 0, 270));
                                qc0Var.setFormatter(new org.telegram.ui.Components.vh0(ai0Var, 0));
                                qc0Var.setMinValue(0);
                                qc0Var.setMaxValue(10);
                                qc0Var.setWrapSelectorWheel(false);
                                qc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.vh0 vh0Var = new org.telegram.ui.Components.vh0(ai0Var, 1);
                                qc0Var.setOnValueChangedListener(vh0Var);
                                qc0Var2.setMinValue(0);
                                qc0Var2.setMaxValue(10);
                                qc0Var2.setWrapSelectorWheel(false);
                                qc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(qc0Var2, i7.f6.l(0.5f, 0, 270));
                                qc0Var2.setFormatter(new org.telegram.ui.Components.vh0(ai0Var, 2));
                                qc0Var2.setOnValueChangedListener(vh0Var);
                                qc0Var.setValue(0);
                                qc0Var2.setValue(6);
                                xh0Var.addView(frameLayout2, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
                                yh0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                yh0Var.setGravity(17);
                                yh0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                                yh0Var.setTextSize(1, 14.0f);
                                yh0Var.setMaxLines(2);
                                yh0Var.setTypeface(AndroidUtilities.bold());
                                yh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                                frameLayout2.addView(yh0Var, i7.f6.c(48.0f, -1));
                                yh0Var.setOnClickListener(new org.telegram.ui.Components.t2(29, ai0Var, xrVar));
                                textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView2.setGravity(17);
                                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q5, false));
                                textView2.setTextSize(1, 14.0f);
                                textView2.setAlpha(0.0f);
                                textView2.setScaleX(0.5f);
                                textView2.setScaleY(0.5f);
                                frameLayout2.addView(textView2, i7.f6.c(48.0f, -1));
                                wh0Var.addView(xh0Var, i7.f6.e(-1, -2, 51));
                                rc0Var.N = ai0Var;
                                ((FrameLayout) rc0Var.fragmentView).addView(ai0Var, i7.f6.c(-1.0f, -1));
                                org.telegram.ui.Components.ai0 ai0Var2 = rc0Var.N;
                                ai0Var2.r = false;
                                AnimatorSet animatorSet = ai0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    ai0Var2.s = null;
                                }
                                org.telegram.ui.Components.wh0 wh0Var2 = ai0Var2.v;
                                wh0Var2.measure(View.MeasureSpec.makeMeasureSpec((ai0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (ai0Var2.r) {
                                    z11 = true;
                                } else {
                                    wh0Var2.setVisibility(0);
                                    if (ai0Var2.w) {
                                        ai0Var2.setLayerType(2, null);
                                    }
                                    wh0Var2.setTranslationY(wh0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    ai0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(wh0Var2, (Property<org.telegram.ui.Components.wh0, Float>) View.TRANSLATION_Y, 0.0f));
                                    ai0Var2.s.setDuration(400L);
                                    ai0Var2.s.setStartDelay(20L);
                                    ai0Var2.s.setInterpolator(ai0Var2.B);
                                    z11 = true;
                                    ai0Var2.s.addListener(new org.telegram.ui.Components.zh0(ai0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    ai0Var2.s.start();
                                }
                                ai0Var2.c(z11);
                                break;
                            }
                        }
                        break;
                    default:
                        rc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = rc0Var.x0.messageOwner.media.geo;
                            double d10 = geoPoint.lat;
                            double d102 = geoPoint._long;
                            rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d10 + "," + d102 + "?q=" + d10 + "," + d102)));
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                }
            }
        });
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(17);
        this.b.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.b.setTextSize(1, 15.0f);
        this.b.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourceProvider));
        this.b.setTypeface(AndroidUtilities.bold());
        this.b.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.b.setText(LocaleController.getString(R.string.LocationsShowAll));
        this.b.setBackground(org.telegram.ui.ActionBar.g6.Z(getThemedColor(i18), getThemedColor(i19), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        FrameLayout.LayoutParams d10 = i7.f6.d(-2, 38.0f, 81, 12.0f, 0.0f, 12.0f, 12.0f);
        d10.bottomMargin = (layoutParams.height - rect.top) + d10.bottomMargin;
        this.O.addView(this.b, d10);
        i7.h6.a(this.b);
        final int i23 = 3;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wb0
            public final /* synthetic */ rc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11;
                int i162 = i23;
                rc0 rc0Var = this.b;
                int i172 = 1;
                switch (i162) {
                    case 0:
                        rc0Var.y0(false);
                        rc0Var.P.H(null, rc0Var.t0, true);
                        rc0Var.z0 = true;
                        rc0Var.x0();
                        break;
                    case 1:
                        rc0Var.d.M(null, null);
                        break;
                    case 2:
                        rc0.U(rc0Var);
                        break;
                    case 3:
                        rc0Var.e0 = -1L;
                        rc0Var.y0 = true;
                        if (rc0Var.j0()) {
                            rc0Var.f0 = true;
                            rc0Var.z0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (rc0Var.getParentActivity() != null && rc0Var.s0 != null && rc0Var.d0() && rc0Var.E != null) {
                            nh.t3 t3Var = rc0Var.y;
                            if (t3Var != null) {
                                t3Var.e(true);
                            }
                            int i182 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.a0);
                            if (rc0Var.C) {
                                rc0Var.B[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                rc0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = rc0Var.K;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    rc0Var.K = null;
                                }
                                rc0Var.C = true;
                                rc0Var.m0().k(0L, 25, 0, null, new zb0(rc0Var, i172), new x60(18, rc0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = rc0Var.K;
                                if (iCircle2 == null) {
                                    rc0Var.e0(500);
                                } else {
                                    rc0Var.L = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(rc0Var.a0) ? rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.a0)) : null;
                                Activity parentActivity = rc0Var.getParentActivity();
                                xb0 xb0Var = new xb0(rc0Var, i182);
                                xr xrVar = new xr(23, rc0Var, user);
                                zb0 zb0Var = new zb0(rc0Var, 2);
                                org.telegram.ui.Components.ai0 ai0Var = new org.telegram.ui.Components.ai0(parentActivity);
                                ai0Var.a = null;
                                ai0Var.d = -1;
                                ai0Var.e = false;
                                ai0Var.f = false;
                                ai0Var.h = null;
                                ai0Var.n = new Rect();
                                new Paint();
                                ai0Var.w = true;
                                ai0Var.B = org.telegram.ui.Components.jr.h;
                                ai0Var.setWillNotDraw(false);
                                ai0Var.M = zb0Var;
                                ai0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false), PorterDuff.Mode.MULTIPLY));
                                mutate2.getPadding(rect2);
                                int i192 = rect2.left;
                                ai0Var.x = i192;
                                org.telegram.ui.Components.wh0 wh0Var = new org.telegram.ui.Components.wh0(ai0Var.getContext());
                                ai0Var.v = wh0Var;
                                wh0Var.setBackgroundDrawable(mutate2);
                                wh0Var.setPadding(i192, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i192, 0);
                                wh0Var.setVisibility(4);
                                ai0Var.addView(wh0Var, 0, i7.f6.e(-1, -2, 80));
                                ai0Var.K = LocaleController.getUseImperialSystemType();
                                ai0Var.I = user;
                                ai0Var.E = xb0Var;
                                org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(parentActivity, null);
                                ai0Var.C = qc0Var;
                                qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                qc0Var.setItemCount(5);
                                org.telegram.ui.Components.qc0 qc0Var2 = new org.telegram.ui.Components.qc0(parentActivity, null);
                                ai0Var.D = qc0Var2;
                                qc0Var2.setItemCount(5);
                                qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.xh0 xh0Var = new org.telegram.ui.Components.xh0(ai0Var, parentActivity);
                                ai0Var.L = xh0Var;
                                xh0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                xh0Var.addView(frameLayout, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView2 = new TextView(parentActivity);
                                textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.x3.t(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false), 1, 20.0f);
                                frameLayout.addView(textView2, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView2.setOnTouchListener(new mh.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                xh0Var.addView(linearLayout, i7.f6.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView22 = new TextView(parentActivity);
                                ai0Var.G = textView22;
                                org.telegram.ui.Components.yh0 yh0Var = new org.telegram.ui.Components.yh0(parentActivity);
                                ai0Var.F = yh0Var;
                                linearLayout.addView(qc0Var, i7.f6.l(0.5f, 0, 270));
                                qc0Var.setFormatter(new org.telegram.ui.Components.vh0(ai0Var, 0));
                                qc0Var.setMinValue(0);
                                qc0Var.setMaxValue(10);
                                qc0Var.setWrapSelectorWheel(false);
                                qc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.vh0 vh0Var = new org.telegram.ui.Components.vh0(ai0Var, 1);
                                qc0Var.setOnValueChangedListener(vh0Var);
                                qc0Var2.setMinValue(0);
                                qc0Var2.setMaxValue(10);
                                qc0Var2.setWrapSelectorWheel(false);
                                qc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(qc0Var2, i7.f6.l(0.5f, 0, 270));
                                qc0Var2.setFormatter(new org.telegram.ui.Components.vh0(ai0Var, 2));
                                qc0Var2.setOnValueChangedListener(vh0Var);
                                qc0Var.setValue(0);
                                qc0Var2.setValue(6);
                                xh0Var.addView(frameLayout2, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
                                yh0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                yh0Var.setGravity(17);
                                yh0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                                yh0Var.setTextSize(1, 14.0f);
                                yh0Var.setMaxLines(2);
                                yh0Var.setTypeface(AndroidUtilities.bold());
                                yh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                                frameLayout2.addView(yh0Var, i7.f6.c(48.0f, -1));
                                yh0Var.setOnClickListener(new org.telegram.ui.Components.t2(29, ai0Var, xrVar));
                                textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView22.setGravity(17);
                                textView22.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q5, false));
                                textView22.setTextSize(1, 14.0f);
                                textView22.setAlpha(0.0f);
                                textView22.setScaleX(0.5f);
                                textView22.setScaleY(0.5f);
                                frameLayout2.addView(textView22, i7.f6.c(48.0f, -1));
                                wh0Var.addView(xh0Var, i7.f6.e(-1, -2, 51));
                                rc0Var.N = ai0Var;
                                ((FrameLayout) rc0Var.fragmentView).addView(ai0Var, i7.f6.c(-1.0f, -1));
                                org.telegram.ui.Components.ai0 ai0Var2 = rc0Var.N;
                                ai0Var2.r = false;
                                AnimatorSet animatorSet = ai0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    ai0Var2.s = null;
                                }
                                org.telegram.ui.Components.wh0 wh0Var2 = ai0Var2.v;
                                wh0Var2.measure(View.MeasureSpec.makeMeasureSpec((ai0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (ai0Var2.r) {
                                    z11 = true;
                                } else {
                                    wh0Var2.setVisibility(0);
                                    if (ai0Var2.w) {
                                        ai0Var2.setLayerType(2, null);
                                    }
                                    wh0Var2.setTranslationY(wh0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    ai0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(wh0Var2, (Property<org.telegram.ui.Components.wh0, Float>) View.TRANSLATION_Y, 0.0f));
                                    ai0Var2.s.setDuration(400L);
                                    ai0Var2.s.setStartDelay(20L);
                                    ai0Var2.s.setInterpolator(ai0Var2.B);
                                    z11 = true;
                                    ai0Var2.s.addListener(new org.telegram.ui.Components.zh0(ai0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    ai0Var2.s.start();
                                }
                                ai0Var2.c(z11);
                                break;
                            }
                        }
                        break;
                    default:
                        rc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = rc0Var.x0.messageOwner.media.geo;
                            double d102 = geoPoint.lat;
                            double d1022 = geoPoint._long;
                            rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d102 + "," + d1022 + "?q=" + d102 + "," + d1022)));
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                }
            }
        });
        z0(false, false);
        this.c = new ImageView(context);
        org.telegram.ui.Cells.z h04 = org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(40.0f), getThemedColor(i18), getThemedColor(i19));
        i7.h6.a(this.c);
        this.c.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.c.setOutlineProvider(k1Var);
        this.c.setColorFilter(new PorterDuffColorFilter(getThemedColor(i17), mode));
        this.c.setBackgroundDrawable(h04);
        this.c.setScaleType(scaleType);
        this.c.setContentDescription(LocaleController.getString(R.string.AccDescrLocationNotify));
        this.O.addView(this.c, i7.f6.d(40, 40.0f, 53, 0.0f, 62.0f, 12.0f, 0.0f));
        final int i24 = 4;
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wb0
            public final /* synthetic */ rc0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z11;
                int i162 = i24;
                rc0 rc0Var = this.b;
                int i172 = 1;
                switch (i162) {
                    case 0:
                        rc0Var.y0(false);
                        rc0Var.P.H(null, rc0Var.t0, true);
                        rc0Var.z0 = true;
                        rc0Var.x0();
                        break;
                    case 1:
                        rc0Var.d.M(null, null);
                        break;
                    case 2:
                        rc0.U(rc0Var);
                        break;
                    case 3:
                        rc0Var.e0 = -1L;
                        rc0Var.y0 = true;
                        if (rc0Var.j0()) {
                            rc0Var.f0 = true;
                            rc0Var.z0(false, true);
                            break;
                        }
                        break;
                    case 4:
                        if (rc0Var.getParentActivity() != null && rc0Var.s0 != null && rc0Var.d0() && rc0Var.E != null) {
                            nh.t3 t3Var = rc0Var.y;
                            if (t3Var != null) {
                                t3Var.e(true);
                            }
                            int i182 = 3;
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.a0);
                            if (rc0Var.C) {
                                rc0Var.B[0].e(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                rc0Var.c.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = rc0Var.K;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    rc0Var.K = null;
                                }
                                rc0Var.C = true;
                                rc0Var.m0().k(0L, 25, 0, null, new zb0(rc0Var, i172), new x60(18, rc0Var, sharingLocationInfo));
                                break;
                            } else {
                                IMapsProvider.ICircle iCircle2 = rc0Var.K;
                                if (iCircle2 == null) {
                                    rc0Var.e0(500);
                                } else {
                                    rc0Var.L = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(rc0Var.a0) ? rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.a0)) : null;
                                Activity parentActivity = rc0Var.getParentActivity();
                                xb0 xb0Var = new xb0(rc0Var, i182);
                                xr xrVar = new xr(23, rc0Var, user);
                                zb0 zb0Var = new zb0(rc0Var, 2);
                                org.telegram.ui.Components.ai0 ai0Var = new org.telegram.ui.Components.ai0(parentActivity);
                                ai0Var.a = null;
                                ai0Var.d = -1;
                                ai0Var.e = false;
                                ai0Var.f = false;
                                ai0Var.h = null;
                                ai0Var.n = new Rect();
                                new Paint();
                                ai0Var.w = true;
                                ai0Var.B = org.telegram.ui.Components.jr.h;
                                ai0Var.setWillNotDraw(false);
                                ai0Var.M = zb0Var;
                                ai0Var.y = ViewConfiguration.get(parentActivity).getScaledTouchSlop();
                                Rect rect2 = new Rect();
                                Drawable mutate2 = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false), PorterDuff.Mode.MULTIPLY));
                                mutate2.getPadding(rect2);
                                int i192 = rect2.left;
                                ai0Var.x = i192;
                                org.telegram.ui.Components.wh0 wh0Var = new org.telegram.ui.Components.wh0(ai0Var.getContext());
                                ai0Var.v = wh0Var;
                                wh0Var.setBackgroundDrawable(mutate2);
                                wh0Var.setPadding(i192, (AndroidUtilities.dp(8.0f) + rect2.top) - 1, i192, 0);
                                wh0Var.setVisibility(4);
                                ai0Var.addView(wh0Var, 0, i7.f6.e(-1, -2, 80));
                                ai0Var.K = LocaleController.getUseImperialSystemType();
                                ai0Var.I = user;
                                ai0Var.E = xb0Var;
                                org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(parentActivity, null);
                                ai0Var.C = qc0Var;
                                qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                                qc0Var.setItemCount(5);
                                org.telegram.ui.Components.qc0 qc0Var2 = new org.telegram.ui.Components.qc0(parentActivity, null);
                                ai0Var.D = qc0Var2;
                                qc0Var2.setItemCount(5);
                                qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                                org.telegram.ui.Components.xh0 xh0Var = new org.telegram.ui.Components.xh0(ai0Var, parentActivity);
                                ai0Var.L = xh0Var;
                                xh0Var.setOrientation(1);
                                FrameLayout frameLayout = new FrameLayout(parentActivity);
                                xh0Var.addView(frameLayout, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
                                TextView textView2 = new TextView(parentActivity);
                                textView2.setText(LocaleController.getString(R.string.LocationNotifiation));
                                org.telegram.messenger.x3.t(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false), 1, 20.0f);
                                frameLayout.addView(textView2, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                                textView2.setOnTouchListener(new mh.d(20));
                                LinearLayout linearLayout = new LinearLayout(parentActivity);
                                linearLayout.setOrientation(0);
                                linearLayout.setWeightSum(1.0f);
                                xh0Var.addView(linearLayout, i7.f6.n(-1, -2));
                                System.currentTimeMillis();
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                TextView textView22 = new TextView(parentActivity);
                                ai0Var.G = textView22;
                                org.telegram.ui.Components.yh0 yh0Var = new org.telegram.ui.Components.yh0(parentActivity);
                                ai0Var.F = yh0Var;
                                linearLayout.addView(qc0Var, i7.f6.l(0.5f, 0, 270));
                                qc0Var.setFormatter(new org.telegram.ui.Components.vh0(ai0Var, 0));
                                qc0Var.setMinValue(0);
                                qc0Var.setMaxValue(10);
                                qc0Var.setWrapSelectorWheel(false);
                                qc0Var.setTextOffset(AndroidUtilities.dp(20.0f));
                                org.telegram.ui.Components.vh0 vh0Var = new org.telegram.ui.Components.vh0(ai0Var, 1);
                                qc0Var.setOnValueChangedListener(vh0Var);
                                qc0Var2.setMinValue(0);
                                qc0Var2.setMaxValue(10);
                                qc0Var2.setWrapSelectorWheel(false);
                                qc0Var2.setTextOffset(-AndroidUtilities.dp(20.0f));
                                linearLayout.addView(qc0Var2, i7.f6.l(0.5f, 0, 270));
                                qc0Var2.setFormatter(new org.telegram.ui.Components.vh0(ai0Var, 2));
                                qc0Var2.setOnValueChangedListener(vh0Var);
                                qc0Var.setValue(0);
                                qc0Var2.setValue(6);
                                xh0Var.addView(frameLayout2, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
                                yh0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                yh0Var.setGravity(17);
                                yh0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                                yh0Var.setTextSize(1, 14.0f);
                                yh0Var.setMaxLines(2);
                                yh0Var.setTypeface(AndroidUtilities.bold());
                                yh0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                                frameLayout2.addView(yh0Var, i7.f6.c(48.0f, -1));
                                yh0Var.setOnClickListener(new org.telegram.ui.Components.t2(29, ai0Var, xrVar));
                                textView22.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                                textView22.setGravity(17);
                                textView22.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q5, false));
                                textView22.setTextSize(1, 14.0f);
                                textView22.setAlpha(0.0f);
                                textView22.setScaleX(0.5f);
                                textView22.setScaleY(0.5f);
                                frameLayout2.addView(textView22, i7.f6.c(48.0f, -1));
                                wh0Var.addView(xh0Var, i7.f6.e(-1, -2, 51));
                                rc0Var.N = ai0Var;
                                ((FrameLayout) rc0Var.fragmentView).addView(ai0Var, i7.f6.c(-1.0f, -1));
                                org.telegram.ui.Components.ai0 ai0Var2 = rc0Var.N;
                                ai0Var2.r = false;
                                AnimatorSet animatorSet = ai0Var2.s;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    ai0Var2.s = null;
                                }
                                org.telegram.ui.Components.wh0 wh0Var2 = ai0Var2.v;
                                wh0Var2.measure(View.MeasureSpec.makeMeasureSpec((ai0Var2.x * 2) + AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
                                if (ai0Var2.r) {
                                    z11 = true;
                                } else {
                                    wh0Var2.setVisibility(0);
                                    if (ai0Var2.w) {
                                        ai0Var2.setLayerType(2, null);
                                    }
                                    wh0Var2.setTranslationY(wh0Var2.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    ai0Var2.s = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(wh0Var2, (Property<org.telegram.ui.Components.wh0, Float>) View.TRANSLATION_Y, 0.0f));
                                    ai0Var2.s.setDuration(400L);
                                    ai0Var2.s.setStartDelay(20L);
                                    ai0Var2.s.setInterpolator(ai0Var2.B);
                                    z11 = true;
                                    ai0Var2.s.addListener(new org.telegram.ui.Components.zh0(ai0Var2, 1 == true ? 1 : 0));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    ai0Var2.s.start();
                                }
                                ai0Var2.c(z11);
                                break;
                            }
                        }
                        break;
                    default:
                        rc0Var.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = rc0Var.x0.messageOwner.media.geo;
                            double d102 = geoPoint.lat;
                            double d1022 = geoPoint._long;
                            rc0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d102 + "," + d1022 + "?q=" + d102 + "," + d1022)));
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                }
            }
        });
        TLRPC.Chat chat = DialogObject.isChatDialog(this.a0) ? getMessagesController().getChat(Long.valueOf(-this.a0)) : null;
        MessageObject messageObject3 = this.x0;
        if (messageObject3 == null || !messageObject3.isLiveLocation() || this.x0.isExpiredLiveLocation(getConnectionsManager().getCurrentTime()) || (ChatObject.isChannel(chat) && !chat.megagroup)) {
            this.c.setVisibility(8);
            this.c.setImageResource(R.drawable.msg_location_alert);
        } else {
            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.a0);
            if (sharingLocationInfo == null || sharingLocationInfo.proximityMeters <= 0) {
                if (DialogObject.isUserDialog(this.a0) && this.x0.getFromChatId() == getUserConfig().getClientUserId()) {
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
        nh.t3 t3Var = new nh.t3(context, 1);
        this.y = t3Var;
        t3Var.setLayerType(2, null);
        nh.t3 t3Var2 = this.y;
        t3Var2.d = 4000L;
        t3Var2.m(1.0f, -25.0f);
        this.y.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.O.addView(this.y, i7.f6.d(-1, -2.0f, 51, 8.0f, 106.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.f.setGravity(1);
        this.f.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        this.f.setVisibility(8);
        pc0Var.addView(this.f, i7.f6.c(-1.0f, -1));
        this.f.setOnTouchListener(new mh.d(2));
        ImageView imageView3 = new ImageView(context);
        this.h = imageView3;
        imageView3.setImageResource(R.drawable.location_empty);
        this.h.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.W5), mode));
        this.f.addView(this.h, i7.f6.n(-2, -2));
        TextView textView2 = new TextView(context);
        this.n = textView2;
        int i25 = org.telegram.ui.ActionBar.g6.X5;
        textView2.setTextColor(getThemedColor(i25));
        this.n.setGravity(17);
        this.n.setTypeface(AndroidUtilities.bold());
        this.n.setTextSize(1, 17.0f);
        this.n.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView i26 = th.i(this.f, this.n, i7.f6.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.r = i26;
        i26.setTextColor(getThemedColor(i25));
        this.r.setGravity(17);
        this.r.setTextSize(1, 15.0f);
        this.r.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.f.addView(this.r, i7.f6.t(-2, -2, 17, 0, 6, 0, 0));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.Q = jl0Var;
        fc0 fc0Var2 = new fc0(this, context, this.C0, this.a0, getResourceProvider(), this.A, i14 == 8);
        this.P = fc0Var2;
        jl0Var.setAdapter(fc0Var2);
        org.telegram.ui.Components.jl0 jl0Var2 = this.Q;
        f2.j0 j0Var = new f2.j0(1, false);
        this.U = j0Var;
        jl0Var2.setLayoutManager(j0Var);
        if (this.I0 != null) {
            this.H0 = new org.telegram.ui.Cells.s3(context, this.resourceProvider);
            hc0 hc0Var = new hc0(this, context, new org.telegram.ui.Components.iu0(this), this, new gc0(this), getResourceProvider());
            this.G0 = hc0Var;
            hc0Var.setBackgroundColor(getThemedColor(i12));
            this.G0.addView(this.H0, i7.f6.e(-1, 32, 55));
            this.P.d0 = this.G0;
            this.Q.setOverScrollMode(2);
            f2.l lVar3 = new f2.l();
            z10 = false;
            lVar3.m = false;
            lVar3.C = false;
            lVar3.o(org.telegram.ui.Components.jr.h);
            lVar3.n(350L);
            this.Q.setItemAnimator(lVar3);
        } else {
            z10 = false;
        }
        this.P.O(this.Y, z10);
        this.P.getClass();
        this.Q.setVerticalScrollBarEnabled(z10);
        pc0Var.addView(this.Q, i7.f6.e(-1, -1, 51));
        MessageObject messageObject4 = this.x0;
        if (messageObject4 != null && (message = messageObject4.messageOwner) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
            fc0 fc0Var3 = this.P;
            fc0Var3.M = this.x0.messageOwner.media.address;
            fc0Var3.Q();
        }
        this.Q.setOnScrollListener(new ic0(this));
        ((f2.l) this.Q.getItemAnimator()).C = false;
        this.Q.setOnItemLongClickListener(new xr(21, this, context));
        this.Q.setOnItemClickListener(new j(this, 16));
        fc0 fc0Var4 = this.P;
        long j10 = this.a0;
        xb0 xb0Var = new xb0(this, 5);
        fc0Var4.D = j10;
        fc0Var4.y = xb0Var;
        fc0Var4.P(this.D0);
        pc0Var.addView(this.O, i7.f6.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.G = onCreateMapView;
        onCreateMapView.getView().setAlpha(0.0f);
        this.G.setOnDispatchTouchEventInterceptor(new xb0(this, 6));
        this.G.setOnInterceptTouchEventInterceptor(new xb0(this, 7));
        this.G.setOnLayoutListener(new zb0(this, 5));
        new Thread(new ac0(this, this.G, 1)).start();
        MessageObject messageObject5 = this.x0;
        if (messageObject5 == null && this.v0 == null) {
            i10 = i14;
            if (chat != null && i10 == 4 && this.a0 != 0) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackgroundResource(R.drawable.livepin);
                this.O.addView(frameLayout, i7.f6.e(62, 76, 49));
                org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
                t9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
                t9Var.e(chat, new org.telegram.ui.Components.e9(chat));
                frameLayout.addView(t9Var, i7.f6.d(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                this.T = frameLayout;
                frameLayout.setTag(1);
            }
            if (this.T == null) {
                ImageView imageView4 = new ImageView(context);
                imageView4.setImageResource(R.drawable.map_pin2);
                this.O.addView(imageView4, i7.f6.e(28, 48, 49));
                this.T = imageView4;
            }
            org.telegram.ui.Components.jl0 jl0Var3 = new org.telegram.ui.Components.jl0(context, null);
            this.R = jl0Var3;
            jl0Var3.setVisibility(8);
            i11 = 0;
            this.R.setLayoutManager(new f2.j0(1, false));
            kc0 kc0Var2 = new kc0(this, context, getResourceProvider(), i10 == 8);
            this.S = kc0Var2;
            xb0 xb0Var2 = new xb0(this, 8);
            kc0Var2.D = 0L;
            kc0Var2.y = xb0Var2;
            pc0Var.addView(this.R, i7.f6.e(-1, -1, 51));
            this.R.setOnScrollListener(new m3(this, 18));
            this.R.setOnItemClickListener(new eg.w0(19, this, n10));
        } else {
            i10 = i14;
            i11 = 0;
            if ((messageObject5 != null && !messageObject5.isLiveLocation()) || this.v0 != null) {
                TLRPC.TL_channelLocation tL_channelLocation2 = this.v0;
                if (tL_channelLocation2 != null) {
                    this.P.T = tL_channelLocation2;
                } else {
                    MessageObject messageObject6 = this.x0;
                    if (messageObject6 != null) {
                        fc0 fc0Var5 = this.P;
                        fc0Var5.S = messageObject6;
                        fc0Var5.l();
                    }
                }
            }
        }
        MessageObject messageObject7 = this.x0;
        if (messageObject7 != null && i10 == 6) {
            fc0 fc0Var6 = this.P;
            fc0Var6.S = messageObject7;
            fc0Var6.l();
        }
        while (i11 < 2) {
            UndoView undoView = new UndoView(context);
            UndoView[] undoViewArr = this.B;
            undoViewArr[i11] = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            undoViewArr[i11].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.O.addView(undoViewArr[i11], i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            i11++;
        }
        lh.z2 z2Var = new lh.z2(this, context, rect);
        this.v = z2Var;
        z2Var.setTranslationZ(AndroidUtilities.dp(6.0f));
        this.O.addView(this.v, layoutParams);
        if (this.x0 == null && this.v0 == null && this.w0 != null) {
            this.y0 = true;
            ImageView imageView5 = this.a;
            int i27 = org.telegram.ui.ActionBar.g6.ui;
            imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(i27), PorterDuff.Mode.MULTIPLY));
            this.a.setTag(Integer.valueOf(i27));
        }
        pc0Var.addView(this.actionBar);
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
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new xb0(this, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    showDialog(alertDialog$Builder.a);
                    return false;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        fc0 fc0Var;
        fc0 fc0Var2;
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
            return;
        }
        if (i10 == NotificationCenter.locationPermissionGranted) {
            this.Y = false;
            fc0 fc0Var3 = this.P;
            if (fc0Var3 != null) {
                fc0Var3.O(false, false);
            }
            IMapsProvider.IMap iMap = this.E;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.locationPermissionDenied) {
            this.Y = true;
            fc0 fc0Var4 = this.P;
            if (fc0Var4 != null) {
                fc0Var4.O(true, false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.liveLocationsChanged) {
            fc0 fc0Var5 = this.P;
            if (fc0Var5 != null) {
                fc0Var5.l();
            }
            C0();
            return;
        }
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue() || ((Long) objArr[0]).longValue() != this.a0 || this.x0 == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[1];
            boolean z10 = false;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i12);
                if (messageObject.isLiveLocation()) {
                    c0(messageObject.messageOwner);
                    z10 = true;
                } else if ((messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGeoProximityReached) && DialogObject.isUserDialog(messageObject.getDialogId())) {
                    this.c.setImageResource(R.drawable.msg_location_alert);
                    IMapsProvider.ICircle iCircle = this.K;
                    if (iCircle != null) {
                        iCircle.remove();
                        this.K = null;
                    }
                }
            }
            if (!z10 || (fc0Var2 = this.P) == null) {
                return;
            }
            fc0Var2.N(this.c0);
            return;
        }
        if (i10 == NotificationCenter.replaceMessagesObjects) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue != this.a0 || this.x0 == null) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) objArr[1];
            boolean z11 = false;
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i13);
                if (messageObject2.isLiveLocation()) {
                    TLRPC.Message message = messageObject2.messageOwner;
                    lc0 lc0Var = (lc0) this.d0.f(message.from_id != null ? MessageObject.getFromChatId(message) : MessageObject.getDialogId(message));
                    if (lc0Var != null) {
                        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(longValue);
                        if (sharingLocationInfo == null || sharingLocationInfo.mid != messageObject2.getId()) {
                            TLRPC.Message message2 = messageObject2.messageOwner;
                            lc0Var.b = message2;
                            TLRPC.GeoPoint geoPoint = message2.media.geo;
                            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                            lc0Var.e.setPosition(latLng);
                            if (this.e0 == lc0Var.a) {
                                this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(lc0Var.e.getPosition()));
                            }
                            IMapsProvider.IMarker iMarker = lc0Var.f;
                            if (iMarker != null) {
                                iMarker.getPosition();
                                lc0Var.f.setPosition(latLng);
                                int i14 = messageObject2.messageOwner.media.heading;
                                if (i14 != 0) {
                                    lc0Var.f.setRotation(i14);
                                    if (!lc0Var.g) {
                                        lc0Var.f.setIcon(R.drawable.map_pin_cone2);
                                        lc0Var.g = true;
                                    }
                                } else if (lc0Var.g) {
                                    lc0Var.f.setRotation(0);
                                    lc0Var.f.setIcon(R.drawable.map_pin_circle);
                                    lc0Var.g = false;
                                }
                            }
                        }
                        z11 = true;
                    }
                }
            }
            if (z11 && (fc0Var = this.P) != null) {
                fc0Var.l();
                org.telegram.ui.Components.ai0 ai0Var = this.N;
                if (ai0Var != null) {
                    ai0Var.c(true);
                }
            }
            if (z11) {
                C0();
            }
        }
    }

    public final void e0(int i10) {
        if (this.E == null) {
            return;
        }
        List<IMapsProvider.PatternItem> asList = Arrays.asList(new IMapsProvider.PatternItem.Gap(20), new IMapsProvider.PatternItem.Dash(20));
        IMapsProvider.ICircleOptions onCreateCircleOptions = ApplicationLoader.getMapsProvider().onCreateCircleOptions();
        onCreateCircleOptions.center(new IMapsProvider.LatLng(this.s0.getLatitude(), this.s0.getLongitude()));
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
        this.K = this.E.addCircle(onCreateCircleOptions);
    }

    public final Bitmap f0(int i10) {
        Bitmap[] bitmapArr = this.M0;
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
            paint.setColor(org.telegram.ui.Cells.s4.a(i10));
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

    public final Bitmap g0(lc0 lc0Var) {
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
                org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
                TLRPC.User user = lc0Var.c;
                if (user != null) {
                    e9Var.m(this.currentAccount, user);
                } else {
                    TLRPC.Chat chat = lc0Var.d;
                    if (chat != null) {
                        e9Var.k(this.currentAccount, chat);
                    }
                }
                canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                e9Var.setBounds(0, 0, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
                e9Var.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = lc0Var.h;
                Bitmap bitmap2 = (imageReceiver == null || !imageReceiver.hasImageLoaded()) ? null : lc0Var.h.getBitmap();
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
        f fVar = new f(this, 21);
        int i10 = 0;
        while (true) {
            UndoView[] undoViewArr = this.B;
            if (i10 >= undoViewArr.length) {
                break;
            }
            UndoView undoView = undoViewArr[i10];
            int i11 = org.telegram.ui.ActionBar.g6.Fi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView, 32, null, null, null, null, i11));
            int i12 = org.telegram.ui.ActionBar.g6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i12));
            int i13 = org.telegram.ui.ActionBar.g6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "BODY", i11));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big", i11));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big 3", i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Small", i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Main", i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Top", i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Line", i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Big", i13));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i10], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Small", i13));
            i10++;
        }
        View view = this.fragmentView;
        int i14 = org.telegram.ui.ActionBar.g6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, fVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 32768, null, null, null, null, i14));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.g6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 64, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_27, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.Vd));
        org.telegram.ui.ActionBar.w0 w0Var = this.w;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var != null ? w0Var.getSearchField() : null, 16777216, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_31, null, null, null, fVar, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_30, null, null, null, fVar, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, fVar, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        ImageView imageView = this.h;
        int i16 = org.telegram.ui.ActionBar.g6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 8, null, null, null, null, i16));
        TextView textView = this.n;
        int i17 = org.telegram.ui.ActionBar.g6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.r, 4, null, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
        ImageView imageView2 = this.a;
        int i18 = org.telegram.ui.ActionBar.g6.ui;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView2, 262152, null, null, null, null, i18));
        ImageView imageView3 = this.a;
        int i19 = org.telegram.ui.ActionBar.g6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView3, 262152, null, null, null, null, i19));
        ImageView imageView4 = this.a;
        int i20 = org.telegram.ui.ActionBar.g6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView4, 32, null, null, null, null, i20));
        ImageView imageView5 = this.a;
        int i21 = org.telegram.ui.ActionBar.g6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView5, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, fVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, null, null, null, fVar, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 4, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 32, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 65568, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.r0, fVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.si));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 393216, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 393216, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 393248, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 393248, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.pi));
        int i22 = org.telegram.ui.ActionBar.g6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 131072, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 196608, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, org.telegram.ui.ActionBar.g6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 48, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.n5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 32, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        int i23 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 32, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"addressTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.s7.class}, new String[]{"nameTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.s7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 8, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView2"}, null, null, -1, null, i17));
        return arrayList;
    }

    public boolean h0() {
        return this instanceof cn;
    }

    public final void i0(ArrayList arrayList) {
        IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = this.b0 ? ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder() : null;
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
                c0(message);
                if (this.c.getVisibility() != 8 && MessageObject.getFromChatId(message) != getUserConfig().getClientUserId()) {
                    this.c.setVisibility(0);
                    this.D = true;
                    this.c.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new e50(this, 2)).start();
                }
            }
        }
        if (onCreateLatLngBoundsBuilder != null) {
            if (this.b0) {
                this.Q.v0(0, AndroidUtilities.dp(99.0f), null);
            }
            this.b0 = false;
            this.P.N(this.c0);
            if (this.x0.isLiveLocation()) {
                try {
                    IMapsProvider.LatLng center = onCreateLatLngBoundsBuilder.build().getCenter();
                    IMapsProvider.LatLng p02 = p0(center, 100.0d, 100.0d);
                    onCreateLatLngBoundsBuilder.include(p0(center, -100.0d, -100.0d));
                    onCreateLatLngBoundsBuilder.include(p02);
                    IMapsProvider.ILatLngBounds build = onCreateLatLngBoundsBuilder.build();
                    if (arrayList.size() > 1) {
                        try {
                            IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(build, AndroidUtilities.dp(113.0f));
                            this.F = newCameraUpdateLatLngBounds;
                            this.E.moveCamera(newCameraUpdateLatLngBounds);
                            this.F = null;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return i0.a.f(getThemedColor(org.telegram.ui.ActionBar.g6.d6)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final boolean j0() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i10;
        if (this.E != null) {
            ArrayList arrayList = new ArrayList();
            int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
            ArrayList arrayList2 = this.c0;
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                lc0 lc0Var = (lc0) arrayList2.get(i11);
                IMapsProvider.IMarker iMarker = lc0Var.e;
                if (iMarker != null && (message = lc0Var.b) != null && (messageMedia = message.media) != null && ((i10 = messageMedia.period) == Integer.MAX_VALUE || message.date + i10 > currentTime)) {
                    arrayList.add(iMarker.getPosition());
                }
            }
            boolean z10 = this.d0.f(getUserConfig().getClientUserId()) != null;
            Location location = this.s0;
            if (location != null && !z10) {
                arrayList.add(new IMapsProvider.LatLng(location.getLatitude(), this.s0.getLongitude()));
            }
            if (arrayList.size() >= 2) {
                try {
                    IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
                    int size2 = arrayList.size();
                    double d = -1.7976931348623157E308d;
                    double d10 = Double.MAX_VALUE;
                    double d11 = Double.MAX_VALUE;
                    int i12 = 0;
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
                    this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(onCreateLatLngBoundsBuilder.build(), AndroidUtilities.dp(60.0f)), 500, null);
                    return true;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return false;
                }
            }
        }
        return false;
    }

    public final void k0(boolean z10) {
        FrameLayout.LayoutParams layoutParams;
        if (this.Q != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight == 0) {
                return;
            }
            int i10 = this.C0;
            if (i10 == 6) {
                this.D0 = org.telegram.messenger.x3.B(66.0f, measuredHeight, currentActionBarHeight);
            } else if (i10 == 2) {
                this.D0 = org.telegram.messenger.x3.B(73.0f, measuredHeight, currentActionBarHeight);
            } else {
                this.D0 = org.telegram.messenger.x3.B(66.0f, measuredHeight, currentActionBarHeight);
            }
            hc0 hc0Var = this.G0;
            if (hc0Var != null && hc0Var.c0(8) > 0) {
                this.D0 -= AndroidUtilities.dp(200.0f);
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
            layoutParams2.topMargin = currentActionBarHeight;
            this.Q.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.O.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            layoutParams3.height = this.D0;
            this.O.setLayoutParams(layoutParams3);
            org.telegram.ui.Components.jl0 jl0Var = this.R;
            if (jl0Var != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) jl0Var.getLayoutParams();
                layoutParams4.topMargin = currentActionBarHeight;
                this.R.setLayoutParams(layoutParams4);
            }
            this.P.P(this.D0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.G.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.D0;
                IMapsProvider.IMap iMap = this.E;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                this.G.getView().setLayoutParams(layoutParams5);
            }
            oc0 oc0Var = this.x;
            if (oc0Var != null && (layoutParams = (FrameLayout.LayoutParams) oc0Var.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.D0;
                this.x.setLayoutParams(layoutParams);
            }
            this.P.l();
            if (!z10) {
                A0(false);
                return;
            }
            int i11 = i10 == 3 ? 73 : (i10 == 1 || i10 == 2) ? 66 : 0;
            this.U.h1(0, -AndroidUtilities.dp(i11));
            A0(false);
            this.Q.post(new org.telegram.ui.Components.i8(this, i11, 18));
        }
    }

    public final boolean l0() {
        ArrayList arrayList = (ArrayList) getLocationController().locationsCache.f(this.x0.getDialogId());
        if (arrayList == null || !arrayList.isEmpty()) {
            arrayList = null;
        } else {
            i0(arrayList);
        }
        if (DialogObject.isChatDialog(this.a0)) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.a0));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        long dialogId = this.x0.getDialogId();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(dialogId);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new lh.s5(this, dialogId, 6));
        return arrayList != null;
    }

    public final UndoView m0() {
        UndoView[] undoViewArr = this.B;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.e(2, true);
            this.O.removeView(undoViewArr[0]);
            this.O.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean n0() {
        return (getResourceProvider() == null && org.telegram.ui.ActionBar.g6.I.q()) || AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.g6.d6)) < 0.721f;
    }

    public final void o0() {
        SharedPreferences globalMainSettings;
        int i10;
        ImageView imageView = this.c;
        if (imageView == null || imageView.getVisibility() != 0 || this.D || (i10 = (globalMainSettings = MessagesController.getGlobalMainSettings()).getInt("proximityhint", 0)) >= 3) {
            return;
        }
        globalMainSettings.edit().putInt("proximityhint", i10 + 1).commit();
        if (DialogObject.isUserDialog(this.a0)) {
            this.y.t(LocaleController.formatString("ProximityTooltioUser", R.string.ProximityTooltioUser, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.a0)))));
        } else {
            this.y.t(LocaleController.getString(R.string.ProximityTooltioGroup));
        }
        this.y.v();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ai0 ai0Var = this.N;
        if (ai0Var == null) {
            IMapsProvider.IMapView iMapView = this.G;
            if (iMapView == null || iMapView.getGlSurfaceView() == null || this.I) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                q0();
            }
        } else if (z10) {
            ai0Var.a();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.B[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        MessageObject messageObject = this.x0;
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
            IMapsProvider.IMap iMap = this.E;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            IMapsProvider.IMapView iMapView = this.G;
            if (iMapView != null) {
                iMapView.onDestroy();
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        UndoView undoView = this.B[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        fc0 fc0Var = this.P;
        if (fc0Var != null) {
            fc0Var.F();
        }
        kc0 kc0Var = this.S;
        if (kc0Var != null) {
            kc0Var.F();
        }
        zb0 zb0Var = this.F0;
        if (zb0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zb0Var);
            this.F0 = null;
        }
        ArrayList arrayList = this.c0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            lc0 lc0Var = (lc0) arrayList.get(i10);
            ImageReceiver imageReceiver = lc0Var.h;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                lc0Var.h = null;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onLowMemory() {
        super.onLowMemory();
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView == null || !this.q0) {
            return;
        }
        iMapView.onLowMemory();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.q0) {
            try {
                iMapView.onPause();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        UndoView undoView = this.B[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.r0 = false;
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
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.q0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.r0 = true;
        IMapsProvider.IMap iMap = this.E;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        k0(true);
        if (h0()) {
            this.l0 = false;
        } else if (this.l0 && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
            this.l0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        zb0 zb0Var = this.F0;
        if (zb0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zb0Var);
            AndroidUtilities.runOnUIThread(this.F0, 5000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || z11) {
            return;
        }
        try {
            if (this.G.getView().getParent() instanceof ViewGroup) {
                ((ViewGroup) this.G.getView().getParent()).removeView(this.G.getView());
            }
        } catch (Exception unused) {
        }
        n0 n0Var = this.O;
        if (n0Var == null) {
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView(this.G.getView(), 0, i7.f6.e(-1, -1, 51));
                return;
            }
            return;
        }
        n0Var.addView(this.G.getView(), 0, i7.f6.e(-1, AndroidUtilities.dp(10.0f) + this.D0, 51));
        oc0 oc0Var = this.x;
        if (oc0Var != null) {
            try {
                if (oc0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.x.getParent()).removeView(this.x);
                }
            } catch (Exception unused2) {
            }
            this.O.addView(this.x, 1, i7.f6.e(-1, AndroidUtilities.dp(10.0f) + this.D0, 51));
        }
        A0(false);
        o0();
    }

    public final boolean q0() {
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView == null || iMapView.getGlSurfaceView() == null || this.I) {
            return false;
        }
        GLSurfaceView glSurfaceView = this.G.getGlSurfaceView();
        glSurfaceView.queueEvent(new x60(17, this, glSurfaceView));
        return true;
    }

    public final void r0(lc0 lc0Var) {
        double d;
        double d10;
        TLRPC.Message message;
        if (lc0Var == null || (message = lc0Var.b) == null) {
            MessageObject messageObject = this.x0;
            if (messageObject != null) {
                TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                d = geoPoint.lat;
                d10 = geoPoint._long;
            } else {
                TLRPC.GeoPoint geoPoint2 = this.v0.geo_point;
                d = geoPoint2.lat;
                d10 = geoPoint2._long;
            }
        } else {
            TLRPC.GeoPoint geoPoint3 = message.media.geo;
            d = geoPoint3.lat;
            d10 = geoPoint3._long;
        }
        String str = BuildVars.isHuaweiStoreApp() ? "mapapp://navigation" : "http://maps.google.com/maps";
        if (this.s0 != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.s0.getLatitude()), Double.valueOf(this.s0.getLongitude()), Double.valueOf(d), Double.valueOf(d10)))));
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=&daddr=%f,%f"), Double.valueOf(d), Double.valueOf(d10)))));
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    public final void s0(final boolean z10) {
        Activity parentActivity;
        if (this.B0 == null || h0() || getParentActivity() == null || this.s0 == null || !d0()) {
            return;
        }
        if (this.m0 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
            this.m0 = false;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                org.telegram.ui.Components.c5.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new vb0(this, z10, 1), null).o();
                return;
            }
        }
        final TLRPC.User user = DialogObject.isUserDialog(this.a0) ? getMessagesController().getUser(Long.valueOf(this.a0)) : null;
        showDialog(org.telegram.ui.Components.c5.E(getParentActivity(), z10, user, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.yb0
            @Override // org.telegram.messenger.MessagesStorage.IntCallback
            public final void run(int i10) {
                rc0.V(rc0.this, z10, user, i10);
            }
        }, null));
    }

    public final void t0(Location location) {
        int i10;
        if (location == null) {
            return;
        }
        this.s0 = new Location(location);
        lc0 lc0Var = (lc0) this.d0.f(getUserConfig().getClientUserId());
        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.a0);
        if (lc0Var != null && sharingLocationInfo != null && lc0Var.b.id == sharingLocationInfo.mid) {
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            lc0Var.e.setPosition(latLng);
            IMapsProvider.IMarker iMarker = lc0Var.f;
            if (iMarker != null) {
                iMarker.setPosition(latLng);
            }
            if (this.e0 == lc0Var.a) {
                this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(lc0Var.e.getPosition()));
            }
        }
        if (this.x0 == null && this.v0 == null && this.E != null) {
            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            fc0 fc0Var = this.P;
            if (fc0Var != null) {
                if (!this.z0 && (i10 = this.C0) != 4 && i10 != 8) {
                    fc0Var.H(null, this.s0, true);
                }
                this.P.M(this.s0);
            }
            if (!this.y0) {
                this.t0 = new Location(location);
                if (this.A0) {
                    this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng2));
                } else {
                    this.A0 = true;
                    this.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, this.E.getMaxZoomLevel() - 4.0f));
                }
            }
        } else {
            this.P.M(this.s0);
        }
        org.telegram.ui.Components.ai0 ai0Var = this.N;
        if (ai0Var != null) {
            ai0Var.c(true);
        }
        IMapsProvider.ICircle iCircle = this.K;
        if (iCircle != null) {
            iCircle.setCenter(new IMapsProvider.LatLng(this.s0.getLatitude(), this.s0.getLongitude()));
        }
        C0();
    }

    public final void u0(MessageObject messageObject) {
        this.x0 = messageObject;
        this.a0 = messageObject.getDialogId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0(lc0 lc0Var) {
        if (lc0Var.h != null) {
            return;
        }
        TLRPC.User user = lc0Var.c;
        TLRPC.Chat chat = lc0Var.d;
        if (user == null && chat == 0) {
            return;
        }
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        if (user != null) {
            e9Var.m(this.currentAccount, user);
        } else {
            e9Var.k(this.currentAccount, chat);
        }
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setCurrentAccount(this.currentAccount);
        imageReceiver.setDelegate(new xr(22, this, lc0Var));
        imageReceiver.onAttachedToWindow();
        if (user == null) {
            user = chat;
        }
        imageReceiver.setForUserOrChat(user, e9Var);
        lc0Var.h = imageReceiver;
    }

    public final void w0(int i10, TLRPC.User user, int i11) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(this.s0.getLatitude());
        tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(this.s0.getLongitude());
        tL_messageMediaGeoLive.heading = LocationController.getHeading(this.s0);
        int i12 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i10;
        tL_messageMediaGeoLive.proximity_notification_radius = i11;
        tL_messageMediaGeoLive.flags = i12 | 9;
        this.B0.d(tL_messageMediaGeoLive, this.C0, true, 0, 0L);
        if (i11 <= 0) {
            finishFragment();
            return;
        }
        this.N.H = true;
        this.c.setImageResource(R.drawable.msg_location_alert2);
        org.telegram.ui.Components.ai0 ai0Var = this.N;
        if (ai0Var != null) {
            ai0Var.a();
        }
        m0().k(0L, 24, Integer.valueOf(i11), user, null, null);
    }

    public final void x0() {
        if (this.P.h() != 0 && this.U.L0() == 0) {
            View childAt = this.Q.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top < 0 || top > AndroidUtilities.dp(258.0f)) {
                return;
            }
            this.Q.v0(0, top, null);
        }
    }

    public final void y0(boolean z10) {
        org.telegram.ui.Components.zk zkVar;
        Location location;
        Location location2;
        if (this.C0 == 3) {
            z10 = true;
        }
        if (z10 && (zkVar = this.e) != null && zkVar.getTag() == null && ((location = this.s0) == null || (location2 = this.t0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        org.telegram.ui.Components.zk zkVar2 = this.e;
        if (zkVar2 != null) {
            if (!z10 || zkVar2.getTag() == null) {
                if (z10 || this.e.getTag() != null) {
                    this.e.setTag(z10 ? 1 : null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.zk, Float>) View.TRANSLATION_X, z10 ? 0.0f : -AndroidUtilities.dp(80.0f)));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(org.telegram.ui.Components.jr.g);
                    animatorSet.start();
                }
            }
        }
    }

    public final void z0(boolean z10, boolean z11) {
        Boolean bool = this.L0;
        if (bool == null || bool.booleanValue() != z10) {
            this.L0 = Boolean.valueOf(z10);
            if (z11) {
                this.b.setVisibility(0);
                this.b.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f).setInterpolator(org.telegram.ui.Components.jr.h).setDuration(420L).withEndAction(new vb0(this, z10, 0)).start();
            } else {
                this.b.setVisibility(z10 ? 0 : 8);
                this.b.setAlpha(z10 ? 1.0f : 0.0f);
                this.b.setScaleX(z10 ? 1.0f : 0.7f);
                this.b.setScaleY(z10 ? 1.0f : 0.7f);
            }
        }
    }
}
