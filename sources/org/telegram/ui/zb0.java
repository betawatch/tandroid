package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.location.Location;
import android.location.LocationManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zb0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;

    public /* synthetic */ zb0(pc0 pc0Var, int i9) {
        this.a = i9;
        this.b = pc0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i9;
        switch (this.a) {
            case 0:
                final pc0 pc0Var = this.b;
                pc0Var.E = (IMapsProvider.IMap) obj;
                int i10 = AndroidUtilities.computePerceivedBrightness(pc0Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i10 != 0) {
                    pc0Var.W = true;
                    pc0Var.E.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                pc0Var.E.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (pc0Var.E != null) {
                    pc0Var.G.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    final float minZoomLevel = pc0Var.J0 ? pc0Var.E.getMinZoomLevel() + 4.0f : pc0Var.E.getMaxZoomLevel() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = pc0Var.v0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        jc0 jc0Var = new jc0();
                        if (DialogObject.isUserDialog(pc0Var.a0)) {
                            jc0Var.c = pc0Var.getMessagesController().getUser(Long.valueOf(pc0Var.a0));
                        } else {
                            jc0Var.d = pc0Var.getMessagesController().getChat(Long.valueOf(-pc0Var.a0));
                        }
                        jc0Var.a = pc0Var.a0;
                        pc0Var.u0(jc0Var);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap f02 = pc0Var.f0(jc0Var);
                            if (f02 != null) {
                                position.icon(f02);
                                position.anchor(0.5f, 0.907f);
                                jc0Var.e = pc0Var.E.addMarker(position);
                                if (!UserObject.isUserSelf(jc0Var.c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    jc0Var.f = pc0Var.E.addMarker(flat);
                                }
                                pc0Var.c0.add(jc0Var);
                                pc0Var.d0.k(jc0Var, jc0Var.a);
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        pc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(jc0Var.e.getPosition(), minZoomLevel));
                    } else {
                        MessageObject messageObject = pc0Var.x0;
                        if (messageObject == null) {
                            Location location = new Location("network");
                            pc0Var.t0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = pc0Var.w0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                pc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), minZoomLevel));
                                pc0Var.t0.setLatitude(pc0Var.w0.geo_point.lat);
                                pc0Var.t0.setLongitude(pc0Var.w0.geo_point._long);
                                pc0Var.t0.setAccuracy(pc0Var.w0.geo_point.accuracy_radius);
                                pc0Var.P.L(pc0Var.t0);
                            } else {
                                location.setLatitude(20.659322d);
                                pc0Var.t0.setLongitude(-11.40625d);
                            }
                        } else if (messageObject.isLiveLocation()) {
                            jc0 b02 = pc0Var.b0(pc0Var.x0.messageOwner);
                            if (!pc0Var.k0()) {
                                pc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(b02.e.getPosition(), minZoomLevel));
                            }
                        } else {
                            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(pc0Var.t0.getLatitude(), pc0Var.t0.getLongitude());
                            try {
                                pc0Var.E.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            pc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, minZoomLevel));
                            pc0Var.b0 = false;
                            pc0Var.k0();
                        }
                    }
                    try {
                        pc0Var.E.setMyLocationEnabled(true);
                    } catch (Exception e12) {
                        FileLog.e((Throwable) e12, false);
                    }
                    pc0Var.E.getUiSettings().setMyLocationButtonEnabled(false);
                    pc0Var.E.getUiSettings().setZoomControlsEnabled(false);
                    pc0Var.E.getUiSettings().setCompassEnabled(false);
                    pc0Var.E.setOnCameraMoveStartedListener(new vb0(pc0Var, 4));
                    pc0Var.E.setOnMyLocationChangeListener(new zb0(pc0Var, 1));
                    pc0Var.E.setOnMarkerClickListener(new IMapsProvider.OnMarkerClickListener() { // from class: org.telegram.ui.ac0
                        @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
                        public final boolean onClick(IMapsProvider.IMarker iMarker) {
                            pc0 pc0Var2 = pc0.this;
                            ArrayList arrayList = pc0Var2.c0;
                            if (iMarker.getTag() instanceof oc0) {
                                int i11 = 4;
                                pc0Var2.T.setVisibility(4);
                                if (!pc0Var2.y0) {
                                    ImageView imageView2 = pc0Var2.a;
                                    int i12 = org.telegram.ui.ActionBar.f6.ui;
                                    imageView2.setColorFilter(new PorterDuffColorFilter(pc0Var2.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
                                    pc0Var2.a.setTag(Integer.valueOf(i12));
                                    pc0Var2.y0 = true;
                                }
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= arrayList.size()) {
                                        break;
                                    }
                                    jc0 jc0Var2 = (jc0) arrayList.get(i13);
                                    if (jc0Var2 == null || jc0Var2.e != iMarker) {
                                        i13++;
                                    } else {
                                        pc0Var2.e0 = jc0Var2.a;
                                        if (pc0Var2.f0) {
                                            pc0Var2.f0 = false;
                                            pc0Var2.B0();
                                        }
                                        pc0Var2.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(jc0Var2.e.getPosition(), minZoomLevel));
                                    }
                                }
                                mc0 mc0Var = pc0Var2.x;
                                pc0 pc0Var3 = mc0Var.b;
                                HashMap hashMap = mc0Var.a;
                                oc0 oc0Var = (oc0) iMarker.getTag();
                                if (oc0Var != null && pc0Var3.j0 != oc0Var) {
                                    pc0Var3.x0(false);
                                    IMapsProvider.IMarker iMarker2 = pc0Var3.i0;
                                    if (iMarker2 != null) {
                                        View view = (View) hashMap.get(iMarker2);
                                        if (view != null) {
                                            mc0Var.removeView(view);
                                            hashMap.remove(iMarker2);
                                        }
                                        pc0Var3.i0 = null;
                                    }
                                    pc0Var3.j0 = oc0Var;
                                    pc0Var3.i0 = iMarker;
                                    Context context = mc0Var.getContext();
                                    FrameLayout frameLayout = new FrameLayout(context);
                                    mc0Var.addView(frameLayout, g7.e6.c(114.0f, -2));
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    pc0Var3.k0 = frameLayout2;
                                    frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                                    pc0Var3.k0.getBackground().setColorFilter(new PorterDuffColorFilter(pc0Var3.getThemedColor(org.telegram.ui.ActionBar.f6.h5), PorterDuff.Mode.MULTIPLY));
                                    frameLayout.addView(pc0Var3.k0, g7.e6.c(71.0f, -2));
                                    pc0Var3.k0.setAlpha(0.0f);
                                    pc0Var3.k0.setOnClickListener(new v80(i11, mc0Var, oc0Var));
                                    TextView textView = new TextView(context);
                                    textView.setTextSize(1, 16.0f);
                                    textView.setMaxLines(1);
                                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                    textView.setEllipsize(truncateAt);
                                    textView.setSingleLine(true);
                                    textView.setTextColor(pc0Var3.getThemedColor(org.telegram.ui.ActionBar.f6.G6));
                                    textView.setTypeface(AndroidUtilities.bold());
                                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                                    TextView g10 = org.telegram.ui.Cells.j2.g(pc0Var3.k0, textView, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                                    g10.setTextSize(1, 14.0f);
                                    g10.setMaxLines(1);
                                    g10.setEllipsize(truncateAt);
                                    g10.setSingleLine(true);
                                    g10.setTextColor(pc0Var3.getThemedColor(org.telegram.ui.ActionBar.f6.A6));
                                    g10.setGravity(LocaleController.isRTL ? 5 : 3);
                                    pc0Var3.k0.addView(g10, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                                    textView.setText(oc0Var.c.title);
                                    g10.setText(LocaleController.getString(R.string.TapToSendLocation));
                                    FrameLayout frameLayout3 = new FrameLayout(context);
                                    frameLayout3.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(oc0Var.a)));
                                    frameLayout.addView(frameLayout3, g7.e6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                                    org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
                                    o9Var.f(aa.d.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), oc0Var.c.venue_type, "_64.png"), null, null);
                                    frameLayout3.addView(o9Var, g7.e6.e(30, 30, 17));
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new lc0(mc0Var, frameLayout3));
                                    ofFloat.setDuration(360L);
                                    ofFloat.start();
                                    hashMap.put(iMarker, frameLayout);
                                    pc0Var3.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                                }
                            }
                            return true;
                        }
                    });
                    pc0Var.E.setOnCameraMoveListener(new xb0(pc0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            pc0Var.s0 = location2;
                            pc0Var.s0(location2);
                            if (pc0Var.X && pc0Var.getParentActivity() != null) {
                                pc0Var.X = false;
                                pc0Var.c0();
                            }
                            imageView = pc0Var.c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = pc0Var.getLocationController().getSharingLocationInfo(pc0Var.a0)) != null && (i9 = sharingLocationInfo.proximityMeters) > 0) {
                                pc0Var.d0(i9);
                                break;
                            }
                        }
                    }
                    pc0Var.s0 = location2;
                    pc0Var.s0(location2);
                    if (pc0Var.X) {
                        pc0Var.X = false;
                        pc0Var.c0();
                    }
                    imageView = pc0Var.c;
                    if (imageView == null) {
                    }
                }
                break;
            default:
                pc0 pc0Var2 = this.b;
                Location location3 = (Location) obj;
                pc0Var2.s0(location3);
                pc0Var2.getLocationController().setMapLocation(location3, pc0Var2.Z);
                pc0Var2.Z = false;
                break;
        }
    }
}
