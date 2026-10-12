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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc0 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.ActionBar.z1, IMapsProvider.OnCameraMoveStartedListener, hg.b, IMapsProvider.ITouchInterceptor {
    public final /* synthetic */ int a;
    public final /* synthetic */ nd0 b;

    public /* synthetic */ uc0(nd0 nd0Var, int i10) {
        this.a = i10;
        this.b = nd0Var;
    }

    @Override // hg.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 5:
                nd0 nd0Var = this.b;
                ArrayList arrayList2 = nd0Var.k0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((md0) arrayList2.get(i10)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(nd0Var.e0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            md0 md0Var = new md0();
                            md0Var.a = i11;
                            IMapsProvider.IMarker addMarker = nd0Var.I.addMarker(position);
                            md0Var.b = addMarker;
                            md0Var.c = tL_messageMediaVenue;
                            addMarker.setTag(md0Var);
                            arrayList2.add(md0Var);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    break;
                }
                break;
            default:
                nd0 nd0Var2 = this.b;
                nd0Var2.t0 = false;
                nd0Var2.A0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 1:
                nd0 nd0Var = this.b;
                if (nd0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        nd0Var.getParentActivity().startActivity(intent);
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            default:
                nd0 nd0Var2 = this.b;
                if (nd0Var2.getParentActivity() != null) {
                    try {
                        nd0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void l(int i10) {
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
        nd0 nd0Var = this.b;
        int i11 = nd0Var.G0;
        if (i10 == 1) {
            nd0Var.x0(true);
            if (nd0Var.m0 != null) {
                nd0Var.X.setVisibility(0);
                kd0 kd0Var = nd0Var.x;
                IMapsProvider.IMarker iMarker = nd0Var.m0;
                HashMap hashMap = kd0Var.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    kd0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                nd0Var.m0 = null;
                nd0Var.n0 = null;
                nd0Var.o0 = null;
            }
            nd0Var.i0 = -1L;
            if (nd0Var.j0) {
                nd0Var.j0 = false;
                nd0Var.B0();
            }
            if (nd0Var.Q) {
                return;
            }
            if ((i11 == 0 || i11 == 1) && nd0Var.U.getChildCount() > 0 && (childAt = nd0Var.U.getChildAt(0)) != null) {
                org.telegram.ui.Components.mm0 mm0Var = nd0Var.U;
                View F = mm0Var.F(childAt);
                s4.b1 T = F == null ? null : mm0Var.T(F);
                if (T == null || T.b() != 0) {
                    return;
                }
                int dp = i11 == 0 ? 0 : AndroidUtilities.dp(66.0f);
                int top = childAt.getTop();
                if (top < (-dp)) {
                    IMapsProvider.CameraPosition cameraPosition = nd0Var.I.getCameraPosition();
                    nd0Var.L = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                    nd0Var.U.v0(0, top + dp, null);
                }
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.a;
        nd0 nd0Var = this.b;
        switch (i10) {
            case 6:
                if (nd0Var.N != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-nd0Var.N) / 2.0f);
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
                if (nd0Var.B0 == null && nd0Var.z0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = nd0Var.l0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        nd0Var.l0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        nd0Var.l0.playTogether(ObjectAnimator.ofFloat(nd0Var.X, (Property<View, Float>) View.TRANSLATION_Y, nd0Var.y0 - AndroidUtilities.dp(10.0f)));
                        nd0Var.l0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = nd0Var.l0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        nd0Var.N = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        nd0Var.l0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        nd0Var.l0.playTogether(ObjectAnimator.ofFloat(nd0Var.X, (Property<View, Float>) View.TRANSLATION_Y, nd0Var.y0));
                        nd0Var.l0.start();
                        nd0Var.T.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!nd0Var.C0) {
                            ImageView imageView = nd0Var.a;
                            int i11 = org.telegram.ui.ActionBar.g6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(nd0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            nd0Var.a.setTag(Integer.valueOf(i11));
                            nd0Var.C0 = true;
                        }
                        IMapsProvider.IMap iMap = nd0Var.I;
                        if (iMap != null && (location = nd0Var.x0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            nd0Var.x0.setLongitude(nd0Var.I.getCameraPosition().target.longitude);
                        }
                        nd0Var.T.L(nd0Var.x0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
