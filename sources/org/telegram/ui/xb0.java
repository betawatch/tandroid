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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc0 b;

    public /* synthetic */ xb0(nc0 nc0Var, int i10) {
        this.a = i10;
        this.b = nc0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i10;
        switch (this.a) {
            case 0:
                nc0 nc0Var = this.b;
                nc0Var.I = (IMapsProvider.IMap) obj;
                int i11 = AndroidUtilities.computePerceivedBrightness(nc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i11 != 0) {
                    nc0Var.a0 = true;
                    nc0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i11));
                }
                nc0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (nc0Var.I != null) {
                    nc0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    float minZoomLevel = nc0Var.N0 ? nc0Var.I.getMinZoomLevel() + 4.0f : nc0Var.I.getMaxZoomLevel() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = nc0Var.z0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        hc0 hc0Var = new hc0();
                        if (DialogObject.isUserDialog(nc0Var.e0)) {
                            hc0Var.c = nc0Var.getMessagesController().getUser(Long.valueOf(nc0Var.e0));
                        } else {
                            hc0Var.d = nc0Var.getMessagesController().getChat(Long.valueOf(-nc0Var.e0));
                        }
                        hc0Var.a = nc0Var.e0;
                        nc0Var.u0(hc0Var);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap f02 = nc0Var.f0(hc0Var);
                            if (f02 != null) {
                                position.icon(f02);
                                position.anchor(0.5f, 0.907f);
                                hc0Var.e = nc0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(hc0Var.c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    hc0Var.f = nc0Var.I.addMarker(flat);
                                }
                                nc0Var.g0.add(hc0Var);
                                nc0Var.h0.k(hc0Var, hc0Var.a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        nc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(hc0Var.e.getPosition(), minZoomLevel));
                    } else {
                        MessageObject messageObject = nc0Var.B0;
                        if (messageObject == null) {
                            Location location = new Location("network");
                            nc0Var.x0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = nc0Var.A0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                nc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), minZoomLevel));
                                nc0Var.x0.setLatitude(nc0Var.A0.geo_point.lat);
                                nc0Var.x0.setLongitude(nc0Var.A0.geo_point._long);
                                nc0Var.x0.setAccuracy(nc0Var.A0.geo_point.accuracy_radius);
                                nc0Var.T.L(nc0Var.x0);
                            } else {
                                location.setLatitude(20.659322d);
                                nc0Var.x0.setLongitude(-11.40625d);
                            }
                        } else if (messageObject.isLiveLocation()) {
                            hc0 b02 = nc0Var.b0(nc0Var.B0.messageOwner);
                            if (!nc0Var.k0()) {
                                nc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(b02.e.getPosition(), minZoomLevel));
                            }
                        } else {
                            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(nc0Var.x0.getLatitude(), nc0Var.x0.getLongitude());
                            try {
                                nc0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            nc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, minZoomLevel));
                            nc0Var.f0 = false;
                            nc0Var.k0();
                        }
                    }
                    try {
                        nc0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    nc0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    nc0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    nc0Var.I.getUiSettings().setCompassEnabled(false);
                    nc0Var.I.setOnCameraMoveStartedListener(new tb0(nc0Var, 4));
                    nc0Var.I.setOnMyLocationChangeListener(new xb0(nc0Var, 1));
                    nc0Var.I.setOnMarkerClickListener(new m4.l0(nc0Var, minZoomLevel));
                    nc0Var.I.setOnCameraMoveListener(new vb0(nc0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            nc0Var.w0 = location2;
                            nc0Var.s0(location2);
                            if (nc0Var.b0 && nc0Var.getParentActivity() != null) {
                                nc0Var.b0 = false;
                                nc0Var.c0();
                            }
                            imageView = nc0Var.c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = nc0Var.getLocationController().getSharingLocationInfo(nc0Var.e0)) != null && (i10 = sharingLocationInfo.proximityMeters) > 0) {
                                nc0Var.d0(i10);
                                break;
                            }
                        }
                    }
                    nc0Var.w0 = location2;
                    nc0Var.s0(location2);
                    if (nc0Var.b0) {
                        nc0Var.b0 = false;
                        nc0Var.c0();
                    }
                    imageView = nc0Var.c;
                    if (imageView == null) {
                    }
                }
                break;
            default:
                nc0 nc0Var2 = this.b;
                Location location3 = (Location) obj;
                nc0Var2.s0(location3);
                nc0Var2.getLocationController().setMapLocation(location3, nc0Var2.d0);
                nc0Var2.d0 = false;
                break;
        }
    }
}
