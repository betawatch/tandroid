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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xc0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ ld0 b;

    public /* synthetic */ xc0(ld0 ld0Var, int i10) {
        this.a = i10;
        this.b = ld0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i10;
        switch (this.a) {
            case 0:
                ld0 ld0Var = this.b;
                ld0Var.I = (IMapsProvider.IMap) obj;
                int i11 = AndroidUtilities.computePerceivedBrightness(ld0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i11 != 0) {
                    ld0Var.a0 = true;
                    ld0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i11));
                }
                ld0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (ld0Var.I != null) {
                    ld0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    float minZoomLevel = ld0Var.N0 ? ld0Var.I.getMinZoomLevel() + 4.0f : ld0Var.I.getMaxZoomLevel() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = ld0Var.z0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        fd0 fd0Var = new fd0();
                        if (DialogObject.isUserDialog(ld0Var.e0)) {
                            fd0Var.c = ld0Var.getMessagesController().getUser(Long.valueOf(ld0Var.e0));
                        } else {
                            fd0Var.d = ld0Var.getMessagesController().getChat(Long.valueOf(-ld0Var.e0));
                        }
                        fd0Var.a = ld0Var.e0;
                        ld0Var.u0(fd0Var);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap f02 = ld0Var.f0(fd0Var);
                            if (f02 != null) {
                                position.icon(f02);
                                position.anchor(0.5f, 0.907f);
                                fd0Var.e = ld0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(fd0Var.c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    fd0Var.f = ld0Var.I.addMarker(flat);
                                }
                                ld0Var.g0.add(fd0Var);
                                ld0Var.h0.k(fd0Var, fd0Var.a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        ld0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(fd0Var.e.getPosition(), minZoomLevel));
                    } else {
                        MessageObject messageObject = ld0Var.B0;
                        if (messageObject == null) {
                            Location location = new Location("network");
                            ld0Var.x0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = ld0Var.A0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                ld0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), minZoomLevel));
                                ld0Var.x0.setLatitude(ld0Var.A0.geo_point.lat);
                                ld0Var.x0.setLongitude(ld0Var.A0.geo_point._long);
                                ld0Var.x0.setAccuracy(ld0Var.A0.geo_point.accuracy_radius);
                                ld0Var.T.L(ld0Var.x0);
                            } else {
                                location.setLatitude(20.659322d);
                                ld0Var.x0.setLongitude(-11.40625d);
                            }
                        } else if (messageObject.isLiveLocation()) {
                            fd0 b02 = ld0Var.b0(ld0Var.B0.messageOwner);
                            if (!ld0Var.k0()) {
                                ld0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(b02.e.getPosition(), minZoomLevel));
                            }
                        } else {
                            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(ld0Var.x0.getLatitude(), ld0Var.x0.getLongitude());
                            try {
                                ld0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            ld0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, minZoomLevel));
                            ld0Var.f0 = false;
                            ld0Var.k0();
                        }
                    }
                    try {
                        ld0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    ld0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    ld0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    ld0Var.I.getUiSettings().setCompassEnabled(false);
                    ld0Var.I.setOnCameraMoveStartedListener(new tc0(ld0Var, 4));
                    ld0Var.I.setOnMyLocationChangeListener(new xc0(ld0Var, 1));
                    ld0Var.I.setOnMarkerClickListener(new m4.l0(ld0Var, minZoomLevel));
                    ld0Var.I.setOnCameraMoveListener(new vc0(ld0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            ld0Var.w0 = location2;
                            ld0Var.s0(location2);
                            if (ld0Var.b0 && ld0Var.getParentActivity() != null) {
                                ld0Var.b0 = false;
                                ld0Var.c0();
                            }
                            imageView = ld0Var.c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = ld0Var.getLocationController().getSharingLocationInfo(ld0Var.e0)) != null && (i10 = sharingLocationInfo.proximityMeters) > 0) {
                                ld0Var.d0(i10);
                                break;
                            }
                        }
                    }
                    ld0Var.w0 = location2;
                    ld0Var.s0(location2);
                    if (ld0Var.b0) {
                        ld0Var.b0 = false;
                        ld0Var.c0();
                    }
                    imageView = ld0Var.c;
                    if (imageView == null) {
                    }
                }
                break;
            default:
                ld0 ld0Var2 = this.b;
                Location location3 = (Location) obj;
                ld0Var2.s0(location3);
                ld0Var2.getLocationController().setMapLocation(location3, ld0Var2.d0);
                ld0Var2.d0 = false;
                break;
        }
    }
}
