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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x90 implements org.telegram.messenger.ua, org.telegram.ui.ActionBar.p1, org.telegram.messenger.wa, kg.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ la0 b;

    public /* synthetic */ x90(la0 la0Var, int i3) {
        this.a = i3;
        this.b = la0Var;
    }

    @Override // kg.b
    public void a() {
        la0 la0Var = this.b;
        la0Var.w0 = false;
        la0Var.L0();
    }

    @Override // org.telegram.messenger.ua
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ca caVar) {
        MotionEvent motionEvent2;
        Location location;
        int i3 = this.a;
        la0 la0Var = this.b;
        switch (i3) {
            case 0:
                la0Var.D0();
                if (la0Var.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-la0Var.K) / 2.0f);
                    motionEvent2 = motionEvent;
                } else {
                    motionEvent2 = null;
                }
                boolean booleanValue = caVar.a(motionEvent).booleanValue();
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                return booleanValue;
            default:
                if (la0Var.E0 == null && la0Var.C0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = la0Var.s0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        la0Var.s0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        la0Var.s0.playTogether(ObjectAnimator.ofFloat(la0Var.U, (Property<View, Float>) View.TRANSLATION_Y, la0Var.B0 - org.telegram.messenger.g0.L(10.0f)));
                        la0Var.s0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = la0Var.s0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        la0Var.K = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        la0Var.s0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        la0Var.s0.playTogether(ObjectAnimator.ofFloat(la0Var.U, (Property<View, Float>) View.TRANSLATION_Y, la0Var.B0));
                        la0Var.s0.start();
                        la0Var.Q.H();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!la0Var.F0) {
                            ImageView imageView = la0Var.a;
                            int i10 = org.telegram.ui.ActionBar.k6.ij;
                            org.telegram.ui.ActionBar.r6.t(imageView, i10, la0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            la0Var.a.setTag(Integer.valueOf(i10));
                            la0Var.F0 = true;
                        }
                        org.telegram.messenger.z9 z9Var = la0Var.F;
                        if (z9Var != null && (location = la0Var.A0) != null) {
                            location.setLatitude(((org.telegram.messenger.va) z9Var.d().b).a);
                            la0Var.A0.setLongitude(((org.telegram.messenger.va) la0Var.F.d().b).b);
                        }
                        la0Var.Q.L(la0Var.A0);
                    }
                }
                return caVar.a(motionEvent).booleanValue();
        }
    }

    @Override // org.telegram.messenger.wa
    public void c(int i3) {
        View childAt;
        la0 la0Var = this.b;
        int i10 = la0Var.I0;
        if (i3 == 1) {
            la0Var.q0 = -1L;
            if (la0Var.r0) {
                la0Var.r0 = false;
                la0Var.N0();
            }
            if (la0Var.N) {
                return;
            }
            if ((i10 == 0 || i10 == 1) && la0Var.R.getChildCount() > 0 && (childAt = la0Var.R.getChildAt(0)) != null) {
                xs xsVar = la0Var.R;
                View F = xsVar.F(childAt);
                u4.d1 T = F == null ? null : xsVar.T(F);
                if (T == null || T.b() != 0) {
                    return;
                }
                int L = i10 == 0 ? 0 : org.telegram.messenger.g0.L(66.0f);
                int top = childAt.getTop();
                if (top < (-L)) {
                    gi.w4 d = la0Var.F.d();
                    la0Var.I = ((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.va) d.b, d.c);
                    la0Var.R.w0(0, top + L, null);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 2:
                la0 la0Var = this.b;
                if (la0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                        la0Var.getParentActivity().startActivity(intent);
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            default:
                la0 la0Var2 = this.b;
                if (la0Var2.getParentActivity() != null) {
                    try {
                        la0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }
}
