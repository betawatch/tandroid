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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb0 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.ActionBar.a2, IMapsProvider.OnCameraMoveStartedListener, hg.b, IMapsProvider.ITouchInterceptor {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;

    public /* synthetic */ vb0(pc0 pc0Var, int i10) {
        this.a = i10;
        this.b = pc0Var;
    }

    @Override // hg.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 5:
                pc0 pc0Var = this.b;
                ArrayList arrayList2 = pc0Var.k0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((oc0) arrayList2.get(i10)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(pc0Var.e0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            oc0 oc0Var = new oc0();
                            oc0Var.a = i11;
                            IMapsProvider.IMarker addMarker = pc0Var.I.addMarker(position);
                            oc0Var.b = addMarker;
                            oc0Var.c = tL_messageMediaVenue;
                            addMarker.setTag(oc0Var);
                            arrayList2.add(oc0Var);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    break;
                }
                break;
            default:
                pc0 pc0Var2 = this.b;
                pc0Var2.t0 = false;
                pc0Var2.A0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                pc0 pc0Var = this.b;
                if (pc0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        pc0Var.getParentActivity().startActivity(intent);
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
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

    @Override // org.telegram.ui.ActionBar.q0
    public void j(int i10) {
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

    @Override // org.telegram.messenger.IMapsProvider.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i10) {
        View childAt;
        pc0 pc0Var = this.b;
        int i11 = pc0Var.G0;
        if (i10 == 1) {
            pc0Var.x0(true);
            if (pc0Var.m0 != null) {
                pc0Var.X.setVisibility(0);
                mc0 mc0Var = pc0Var.x;
                IMapsProvider.IMarker iMarker = pc0Var.m0;
                HashMap hashMap = mc0Var.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    mc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                pc0Var.m0 = null;
                pc0Var.n0 = null;
                pc0Var.o0 = null;
            }
            pc0Var.i0 = -1L;
            if (pc0Var.j0) {
                pc0Var.j0 = false;
                pc0Var.B0();
            }
            if (pc0Var.Q) {
                return;
            }
            if ((i11 == 0 || i11 == 1) && pc0Var.U.getChildCount() > 0 && (childAt = pc0Var.U.getChildAt(0)) != null) {
                org.telegram.ui.Components.im0 im0Var = pc0Var.U;
                View F = im0Var.F(childAt);
                s4.b1 T = F == null ? null : im0Var.T(F);
                if (T == null || T.b() != 0) {
                    return;
                }
                int dp = i11 == 0 ? 0 : AndroidUtilities.dp(66.0f);
                int top = childAt.getTop();
                if (top < (-dp)) {
                    IMapsProvider.CameraPosition cameraPosition = pc0Var.I.getCameraPosition();
                    pc0Var.L = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                    pc0Var.U.v0(0, top + dp, null);
                }
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.a;
        pc0 pc0Var = this.b;
        switch (i10) {
            case 6:
                if (pc0Var.N != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-pc0Var.N) / 2.0f);
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
                if (pc0Var.B0 == null && pc0Var.z0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = pc0Var.l0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        pc0Var.l0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        pc0Var.l0.playTogether(ObjectAnimator.ofFloat(pc0Var.X, (Property<View, Float>) View.TRANSLATION_Y, pc0Var.y0 - AndroidUtilities.dp(10.0f)));
                        pc0Var.l0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = pc0Var.l0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        pc0Var.N = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        pc0Var.l0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        pc0Var.l0.playTogether(ObjectAnimator.ofFloat(pc0Var.X, (Property<View, Float>) View.TRANSLATION_Y, pc0Var.y0));
                        pc0Var.l0.start();
                        pc0Var.T.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!pc0Var.C0) {
                            ImageView imageView = pc0Var.a;
                            int i11 = org.telegram.ui.ActionBar.h6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(pc0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            pc0Var.a.setTag(Integer.valueOf(i11));
                            pc0Var.C0 = true;
                        }
                        IMapsProvider.IMap iMap = pc0Var.I;
                        if (iMap != null && (location = pc0Var.x0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            pc0Var.x0.setLongitude(pc0Var.I.getCameraPosition().target.longitude);
                        }
                        pc0Var.T.L(pc0Var.x0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
