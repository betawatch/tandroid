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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ kd0 b;

    public /* synthetic */ wc0(kd0 kd0Var, int i10) {
        this.a = i10;
        this.b = kd0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i10;
        switch (this.a) {
            case 0:
                kd0 kd0Var = this.b;
                kd0Var.I = (IMapsProvider.IMap) obj;
                int i11 = AndroidUtilities.computePerceivedBrightness(kd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i11 != 0) {
                    kd0Var.a0 = true;
                    kd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i11));
                }
                kd0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (kd0Var.I != null) {
                    kd0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    float minZoomLevel = kd0Var.N0 ? kd0Var.I.getMinZoomLevel() + 4.0f : kd0Var.I.getMaxZoomLevel() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = kd0Var.z0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ed0 ed0Var = new ed0();
                        if (DialogObject.isUserDialog(kd0Var.e0)) {
                            ed0Var.c = kd0Var.getMessagesController().getUser(Long.valueOf(kd0Var.e0));
                        } else {
                            ed0Var.d = kd0Var.getMessagesController().getChat(Long.valueOf(-kd0Var.e0));
                        }
                        ed0Var.a = kd0Var.e0;
                        kd0Var.v0(ed0Var);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap g02 = kd0Var.g0(ed0Var);
                            if (g02 != null) {
                                position.icon(g02);
                                position.anchor(0.5f, 0.907f);
                                ed0Var.e = kd0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(ed0Var.c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    ed0Var.f = kd0Var.I.addMarker(flat);
                                }
                                kd0Var.g0.add(ed0Var);
                                kd0Var.h0.k(ed0Var, ed0Var.a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        kd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(ed0Var.e.getPosition(), minZoomLevel));
                    } else {
                        MessageObject messageObject = kd0Var.B0;
                        if (messageObject == null) {
                            Location location = new Location("network");
                            kd0Var.x0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = kd0Var.A0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                kd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), minZoomLevel));
                                kd0Var.x0.setLatitude(kd0Var.A0.geo_point.lat);
                                kd0Var.x0.setLongitude(kd0Var.A0.geo_point._long);
                                kd0Var.x0.setAccuracy(kd0Var.A0.geo_point.accuracy_radius);
                                kd0Var.T.L(kd0Var.x0);
                            } else {
                                location.setLatitude(20.659322d);
                                kd0Var.x0.setLongitude(-11.40625d);
                            }
                        } else if (messageObject.isLiveLocation()) {
                            ed0 c02 = kd0Var.c0(kd0Var.B0.messageOwner);
                            if (!kd0Var.l0()) {
                                kd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.e.getPosition(), minZoomLevel));
                            }
                        } else {
                            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(kd0Var.x0.getLatitude(), kd0Var.x0.getLongitude());
                            try {
                                kd0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            kd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, minZoomLevel));
                            kd0Var.f0 = false;
                            kd0Var.l0();
                        }
                    }
                    try {
                        kd0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    kd0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    kd0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    kd0Var.I.getUiSettings().setCompassEnabled(false);
                    kd0Var.I.setOnCameraMoveStartedListener(new sc0(kd0Var, 4));
                    kd0Var.I.setOnMyLocationChangeListener(new wc0(kd0Var, 1));
                    kd0Var.I.setOnMarkerClickListener(new m4.g0(kd0Var, minZoomLevel));
                    kd0Var.I.setOnCameraMoveListener(new uc0(kd0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            kd0Var.w0 = location2;
                            kd0Var.t0(location2);
                            if (kd0Var.b0 && kd0Var.getParentActivity() != null) {
                                kd0Var.b0 = false;
                                kd0Var.d0();
                            }
                            imageView = kd0Var.c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = kd0Var.getLocationController().getSharingLocationInfo(kd0Var.e0)) != null && (i10 = sharingLocationInfo.proximityMeters) > 0) {
                                kd0Var.e0(i10);
                                break;
                            }
                        }
                    }
                    kd0Var.w0 = location2;
                    kd0Var.t0(location2);
                    if (kd0Var.b0) {
                        kd0Var.b0 = false;
                        kd0Var.d0();
                    }
                    imageView = kd0Var.c;
                    if (imageView == null) {
                    }
                }
                break;
            default:
                kd0 kd0Var2 = this.b;
                Location location3 = (Location) obj;
                kd0Var2.t0(location3);
                kd0Var2.getLocationController().setMapLocation(location3, kd0Var2.d0);
                kd0Var2.d0 = false;
                break;
        }
    }
}
