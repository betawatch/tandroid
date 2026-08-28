package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.b2, IMapsProvider.OnCameraMoveStartedListener, of.b, IMapsProvider.ITouchInterceptor {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;

    public /* synthetic */ vb0(pc0 pc0Var, int i9) {
        this.a = i9;
        this.b = pc0Var;
    }

    @Override // of.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 5:
                pc0 pc0Var = this.b;
                ArrayList arrayList2 = pc0Var.g0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        ((oc0) arrayList2.get(i9)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(pc0Var.e0(i10));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            oc0 oc0Var = new oc0();
                            oc0Var.a = i10;
                            IMapsProvider.IMarker addMarker = pc0Var.E.addMarker(position);
                            oc0Var.b = addMarker;
                            oc0Var.c = tL_messageMediaVenue;
                            addMarker.setTag(oc0Var);
                            arrayList2.add(oc0Var);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    break;
                }
                break;
            default:
                pc0 pc0Var2 = this.b;
                pc0Var2.p0 = false;
                pc0Var2.A0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 1:
                pc0 pc0Var = this.b;
                if (pc0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        pc0Var.getParentActivity().startActivity(intent);
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                break;
            default:
                pc0 pc0Var2 = this.b;
                if (pc0Var2.getParentActivity() != null) {
                    try {
                        pc0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i(int i9) {
        IMapsProvider.IMap iMap = this.b.E;
        if (iMap == null) {
            return;
        }
        if (i9 == 2) {
            iMap.setMapType(0);
        } else if (i9 == 3) {
            iMap.setMapType(1);
        } else if (i9 == 4) {
            iMap.setMapType(2);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i9) {
        View childAt;
        pc0 pc0Var = this.b;
        int i10 = pc0Var.C0;
        if (i9 == 1) {
            pc0Var.x0(true);
            if (pc0Var.i0 != null) {
                pc0Var.T.setVisibility(0);
                mc0 mc0Var = pc0Var.x;
                IMapsProvider.IMarker iMarker = pc0Var.i0;
                HashMap hashMap = mc0Var.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    mc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                pc0Var.i0 = null;
                pc0Var.j0 = null;
                pc0Var.k0 = null;
            }
            pc0Var.e0 = -1L;
            if (pc0Var.f0) {
                pc0Var.f0 = false;
                pc0Var.B0();
            }
            if (pc0Var.M) {
                return;
            }
            if ((i10 == 0 || i10 == 1) && pc0Var.Q.getChildCount() > 0 && (childAt = pc0Var.Q.getChildAt(0)) != null) {
                org.telegram.ui.Components.wk0 wk0Var = pc0Var.Q;
                View F = wk0Var.F(childAt);
                f2.q1 T = F == null ? null : wk0Var.T(F);
                if (T == null || T.b() != 0) {
                    return;
                }
                int dp = i10 == 0 ? 0 : AndroidUtilities.dp(66.0f);
                int top = childAt.getTop();
                if (top < (-dp)) {
                    IMapsProvider.CameraPosition cameraPosition = pc0Var.E.getCameraPosition();
                    pc0Var.H = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                    pc0Var.Q.v0(0, top + dp, null);
                }
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i9 = this.a;
        pc0 pc0Var = this.b;
        switch (i9) {
            case 6:
                if (pc0Var.J != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-pc0Var.J) / 2.0f);
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
                if (pc0Var.x0 == null && pc0Var.v0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = pc0Var.h0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        pc0Var.h0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        pc0Var.h0.playTogether(ObjectAnimator.ofFloat(pc0Var.T, (Property<View, Float>) View.TRANSLATION_Y, pc0Var.u0 - AndroidUtilities.dp(10.0f)));
                        pc0Var.h0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = pc0Var.h0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        pc0Var.J = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        pc0Var.h0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        pc0Var.h0.playTogether(ObjectAnimator.ofFloat(pc0Var.T, (Property<View, Float>) View.TRANSLATION_Y, pc0Var.u0));
                        pc0Var.h0.start();
                        pc0Var.P.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!pc0Var.y0) {
                            ImageView imageView = pc0Var.a;
                            int i10 = org.telegram.ui.ActionBar.f6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(pc0Var.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
                            pc0Var.a.setTag(Integer.valueOf(i10));
                            pc0Var.y0 = true;
                        }
                        IMapsProvider.IMap iMap = pc0Var.E;
                        if (iMap != null && (location = pc0Var.t0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            pc0Var.t0.setLongitude(pc0Var.E.getCameraPosition().target.longitude);
                        }
                        pc0Var.P.L(pc0Var.t0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
