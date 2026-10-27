package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.location.Location;
import android.net.Uri;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yb0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.b2, IMapsProvider.OnCameraMoveStartedListener, ig.b, IMapsProvider.ITouchInterceptor {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc0 b;

    public /* synthetic */ yb0(rc0 rc0Var, int i10) {
        this.a = i10;
        this.b = rc0Var;
    }

    @Override // ig.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 5:
                rc0 rc0Var = this.b;
                ArrayList arrayList2 = rc0Var.k0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((qc0) arrayList2.get(i10)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(rc0Var.g0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            qc0 qc0Var = new qc0();
                            qc0Var.a = i11;
                            IMapsProvider.IMarker addMarker = rc0Var.I.addMarker(position);
                            qc0Var.b = addMarker;
                            qc0Var.c = tL_messageMediaVenue;
                            addMarker.setTag(qc0Var);
                            arrayList2.add(qc0Var);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    break;
                }
                break;
            default:
                rc0 rc0Var2 = this.b;
                rc0Var2.s0 = false;
                rc0Var2.C0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void g(int i10) {
        IMapsProvider.IMap iMap = this.b.I;
        if (iMap == null) {
            return;
        }
        if (i10 == 2) {
            iMap.setMapType(0);
        } else if (i10 == 3) {
            iMap.setMapType(1);
        } else if (i10 == 4) {
            iMap.setMapType(2);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 1:
                rc0 rc0Var = this.b;
                if (rc0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        rc0Var.getParentActivity().startActivity(intent);
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            default:
                rc0 rc0Var2 = this.b;
                if (rc0Var2.getParentActivity() != null) {
                    try {
                        rc0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i10) {
        View childAt;
        rc0 rc0Var = this.b;
        int i11 = rc0Var.F0;
        if (i10 == 1) {
            rc0Var.z0(true);
            if (rc0Var.m0 != null) {
                rc0Var.X.setVisibility(0);
                oc0 oc0Var = rc0Var.x;
                IMapsProvider.IMarker iMarker = rc0Var.m0;
                HashMap hashMap = oc0Var.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    oc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                rc0Var.m0 = null;
                rc0Var.n0 = null;
                rc0Var.o0 = null;
            }
            rc0Var.i0 = -1L;
            if (rc0Var.j0) {
                rc0Var.j0 = false;
                rc0Var.D0();
            }
            if (rc0Var.Q) {
                return;
            }
            if ((i11 == 0 || i11 == 1) && rc0Var.U.getChildCount() > 0 && (childAt = rc0Var.U.getChildAt(0)) != null) {
                org.telegram.ui.Components.nm0 nm0Var = rc0Var.U;
                View F = nm0Var.F(childAt);
                s4.e1 T = F == null ? null : nm0Var.T(F);
                if (T == null || T.b() != 0) {
                    return;
                }
                int dp = i11 == 0 ? 0 : AndroidUtilities.dp(66.0f);
                int top = childAt.getTop();
                if (top < (-dp)) {
                    IMapsProvider.CameraPosition cameraPosition = rc0Var.I.getCameraPosition();
                    rc0Var.L = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                    rc0Var.U.w0(0, top + dp, null);
                }
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.a;
        rc0 rc0Var = this.b;
        switch (i10) {
            case 6:
                if (rc0Var.N != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-rc0Var.N) / 2.0f);
                    motionEvent2 = motionEvent;
                } else {
                    motionEvent2 = null;
                }
                boolean booleanValue = ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                return booleanValue;
            default:
                if (rc0Var.A0 == null && rc0Var.y0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = rc0Var.l0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        rc0Var.l0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        rc0Var.l0.playTogether(ObjectAnimator.ofFloat(rc0Var.X, (Property<View, Float>) View.TRANSLATION_Y, rc0Var.x0 - AndroidUtilities.dp(10.0f)));
                        rc0Var.l0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = rc0Var.l0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        rc0Var.N = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        rc0Var.l0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        rc0Var.l0.playTogether(ObjectAnimator.ofFloat(rc0Var.X, (Property<View, Float>) View.TRANSLATION_Y, rc0Var.x0));
                        rc0Var.l0.start();
                        rc0Var.T.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!rc0Var.B0) {
                            ImageView imageView = rc0Var.a;
                            int i11 = org.telegram.ui.ActionBar.y6.ui;
                            org.telegram.ui.ActionBar.f7.t(imageView, i11, rc0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            rc0Var.a.setTag(Integer.valueOf(i11));
                            rc0Var.B0 = true;
                        }
                        IMapsProvider.IMap iMap = rc0Var.I;
                        if (iMap != null && (location = rc0Var.w0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            rc0Var.w0.setLongitude(rc0Var.I.getCameraPosition().target.longitude);
                        }
                        rc0Var.T.L(rc0Var.w0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
