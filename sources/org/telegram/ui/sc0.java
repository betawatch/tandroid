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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd0 b;

    public /* synthetic */ sc0(gd0 gd0Var, int i10) {
        this.a = i10;
        this.b = gd0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i10;
        switch (this.a) {
            case 0:
                gd0 gd0Var = this.b;
                gd0Var.I = (IMapsProvider.IMap) obj;
                int i11 = AndroidUtilities.computePerceivedBrightness(gd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i11 != 0) {
                    gd0Var.a0 = true;
                    gd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i11));
                }
                gd0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (gd0Var.I != null) {
                    gd0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    float minZoomLevel = gd0Var.N0 ? gd0Var.I.getMinZoomLevel() + 4.0f : gd0Var.I.getMaxZoomLevel() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = gd0Var.z0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ad0 ad0Var = new ad0();
                        if (DialogObject.isUserDialog(gd0Var.e0)) {
                            ad0Var.c = gd0Var.getMessagesController().getUser(Long.valueOf(gd0Var.e0));
                        } else {
                            ad0Var.d = gd0Var.getMessagesController().getChat(Long.valueOf(-gd0Var.e0));
                        }
                        ad0Var.a = gd0Var.e0;
                        gd0Var.v0(ad0Var);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap g02 = gd0Var.g0(ad0Var);
                            if (g02 != null) {
                                position.icon(g02);
                                position.anchor(0.5f, 0.907f);
                                ad0Var.e = gd0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(ad0Var.c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    ad0Var.f = gd0Var.I.addMarker(flat);
                                }
                                gd0Var.g0.add(ad0Var);
                                gd0Var.h0.k(ad0Var, ad0Var.a);
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        gd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(ad0Var.e.getPosition(), minZoomLevel));
                    } else {
                        MessageObject messageObject = gd0Var.B0;
                        if (messageObject == null) {
                            Location location = new Location("network");
                            gd0Var.x0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = gd0Var.A0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                gd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), minZoomLevel));
                                gd0Var.x0.setLatitude(gd0Var.A0.geo_point.lat);
                                gd0Var.x0.setLongitude(gd0Var.A0.geo_point._long);
                                gd0Var.x0.setAccuracy(gd0Var.A0.geo_point.accuracy_radius);
                                gd0Var.T.L(gd0Var.x0);
                            } else {
                                location.setLatitude(20.659322d);
                                gd0Var.x0.setLongitude(-11.40625d);
                            }
                        } else if (messageObject.isLiveLocation()) {
                            ad0 c02 = gd0Var.c0(gd0Var.B0.messageOwner);
                            if (!gd0Var.l0()) {
                                gd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.e.getPosition(), minZoomLevel));
                            }
                        } else {
                            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(gd0Var.x0.getLatitude(), gd0Var.x0.getLongitude());
                            try {
                                gd0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            gd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, minZoomLevel));
                            gd0Var.f0 = false;
                            gd0Var.l0();
                        }
                    }
                    try {
                        gd0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e11) {
                        FileLog.e((Throwable) e11, false);
                    }
                    gd0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    gd0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    gd0Var.I.getUiSettings().setCompassEnabled(false);
                    gd0Var.I.setOnCameraMoveStartedListener(new oc0(gd0Var, 4));
                    gd0Var.I.setOnMyLocationChangeListener(new sc0(gd0Var, 1));
                    gd0Var.I.setOnMarkerClickListener(new m4.g0(gd0Var, minZoomLevel));
                    gd0Var.I.setOnCameraMoveListener(new qc0(gd0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            gd0Var.w0 = location2;
                            gd0Var.t0(location2);
                            if (gd0Var.b0 && gd0Var.getParentActivity() != null) {
                                gd0Var.b0 = false;
                                gd0Var.d0();
                            }
                            imageView = gd0Var.c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = gd0Var.getLocationController().getSharingLocationInfo(gd0Var.e0)) != null && (i10 = sharingLocationInfo.proximityMeters) > 0) {
                                gd0Var.e0(i10);
                                break;
                            }
                        }
                    }
                    gd0Var.w0 = location2;
                    gd0Var.t0(location2);
                    if (gd0Var.b0) {
                        gd0Var.b0 = false;
                        gd0Var.d0();
                    }
                    imageView = gd0Var.c;
                    if (imageView == null) {
                    }
                }
                break;
            default:
                gd0 gd0Var2 = this.b;
                Location location3 = (Location) obj;
                gd0Var2.t0(location3);
                gd0Var2.getLocationController().setMapLocation(location3, gd0Var2.d0);
                gd0Var2.d0 = false;
                break;
        }
    }
}
