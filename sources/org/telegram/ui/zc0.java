package org.telegram.ui;

import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationManager;
import android.widget.ImageView;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class zc0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ nd0 b;

    public /* synthetic */ zc0(nd0 nd0Var, int i10) {
        this.a = i10;
        this.b = nd0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i10;
        switch (this.a) {
            case 0:
                nd0 nd0Var = this.b;
                nd0Var.I = (IMapsProvider.IMap) obj;
                int i11 = AndroidUtilities.computePerceivedBrightness(nd0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i11 != 0) {
                    nd0Var.a0 = true;
                    nd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i11));
                }
                nd0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (nd0Var.I != null) {
                    nd0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    float minZoomLevel = nd0Var.N0 ? nd0Var.I.getMinZoomLevel() + 4.0f : nd0Var.I.getMaxZoomLevel() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = nd0Var.z0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        hd0 hd0Var = new hd0();
                        if (DialogObject.isUserDialog(nd0Var.e0)) {
                            hd0Var.c = nd0Var.getMessagesController().getUser(Long.valueOf(nd0Var.e0));
                        } else {
                            hd0Var.d = nd0Var.getMessagesController().getChat(Long.valueOf(-nd0Var.e0));
                        }
                        hd0Var.a = nd0Var.e0;
                        nd0Var.u0(hd0Var);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap f02 = nd0Var.f0(hd0Var);
                            if (f02 != null) {
                                position.icon(f02);
                                position.anchor(0.5f, 0.907f);
                                hd0Var.e = nd0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(hd0Var.c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    hd0Var.f = nd0Var.I.addMarker(flat);
                                }
                                nd0Var.g0.add(hd0Var);
                                nd0Var.h0.k(hd0Var, hd0Var.a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        nd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(hd0Var.e.getPosition(), minZoomLevel));
                    } else {
                        MessageObject messageObject = nd0Var.B0;
                        if (messageObject == null) {
                            Location location = new Location("network");
                            nd0Var.x0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = nd0Var.A0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                nd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), minZoomLevel));
                                nd0Var.x0.setLatitude(nd0Var.A0.geo_point.lat);
                                nd0Var.x0.setLongitude(nd0Var.A0.geo_point._long);
                                nd0Var.x0.setAccuracy(nd0Var.A0.geo_point.accuracy_radius);
                                nd0Var.T.L(nd0Var.x0);
                            } else {
                                location.setLatitude(20.659322d);
                                nd0Var.x0.setLongitude(-11.40625d);
                            }
                        } else if (messageObject.isLiveLocation()) {
                            hd0 b02 = nd0Var.b0(nd0Var.B0.messageOwner);
                            if (!nd0Var.k0()) {
                                nd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(b02.e.getPosition(), minZoomLevel));
                            }
                        } else {
                            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(nd0Var.x0.getLatitude(), nd0Var.x0.getLongitude());
                            try {
                                nd0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            nd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, minZoomLevel));
                            nd0Var.f0 = false;
                            nd0Var.k0();
                        }
                    }
                    try {
                        nd0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    nd0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    nd0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    nd0Var.I.getUiSettings().setCompassEnabled(false);
                    nd0Var.I.setOnCameraMoveStartedListener(new uc0(nd0Var, 4));
                    nd0Var.I.setOnMyLocationChangeListener(new zc0(nd0Var, 1));
                    nd0Var.I.setOnMarkerClickListener(new m4.m0(nd0Var, minZoomLevel));
                    nd0Var.I.setOnCameraMoveListener(new xc0(nd0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            nd0Var.w0 = location2;
                            nd0Var.s0(location2);
                            if (nd0Var.b0 && nd0Var.getParentActivity() != null) {
                                nd0Var.b0 = false;
                                nd0Var.c0();
                            }
                            imageView = nd0Var.c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = nd0Var.getLocationController().getSharingLocationInfo(nd0Var.e0)) != null && (i10 = sharingLocationInfo.proximityMeters) > 0) {
                                nd0Var.d0(i10);
                                break;
                            }
                        }
                    }
                    nd0Var.w0 = location2;
                    nd0Var.s0(location2);
                    if (nd0Var.b0) {
                        nd0Var.b0 = false;
                        nd0Var.c0();
                    }
                    imageView = nd0Var.c;
                    if (imageView == null) {
                    }
                }
                break;
            default:
                nd0 nd0Var2 = this.b;
                Location location3 = (Location) obj;
                nd0Var2.s0(location3);
                nd0Var2.getLocationController().setMapLocation(location3, nd0Var2.d0);
                nd0Var2.d0 = false;
                break;
        }
    }
}
