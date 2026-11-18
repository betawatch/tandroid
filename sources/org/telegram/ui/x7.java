package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x7 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        org.telegram.ui.ActionBar.a5 a5Var;
        int i10;
        int i11;
        Runnable runnable;
        org.telegram.ui.ActionBar.a5 a5Var2;
        int i12 = this.a;
        final int i13 = 0;
        final int i14 = 1;
        Object obj = this.b;
        switch (i12) {
            case 0:
                i8 i8Var = (i8) obj;
                if (i7 == -1) {
                    if (i8Var.Q != 0 || i8Var.R != 0 || i8Var.H) {
                        i8Var.H = false;
                        i8Var.Q = 0;
                        i8Var.R = 0;
                        i8Var.B0();
                        i8Var.u0();
                        break;
                    } else {
                        i8Var.finishFragment();
                        break;
                    }
                }
                break;
            case 1:
                i9 i9Var = (i9) obj;
                if (i7 != -1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            i9.e0(i9Var, true);
                            break;
                        }
                    } else {
                        i9.e0(i9Var, false);
                        break;
                    }
                } else {
                    a5Var = ((org.telegram.ui.ActionBar.h2) i9Var).simpleActionBar;
                    if (!a5Var.x()) {
                        i9Var.finishFragment();
                        break;
                    } else {
                        i9Var.j0(true);
                        break;
                    }
                }
                break;
            case 2:
                if (i7 == -1) {
                    ((t9) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                y9 y9Var = (y9) obj;
                if (i7 != -1) {
                    if (i7 == 1 && y9Var.a.getText().length() != 0) {
                        y9.Z(y9Var);
                        y9Var.finishFragment();
                        break;
                    }
                } else {
                    y9Var.finishFragment();
                    break;
                }
                break;
            case 4:
                la laVar = (la) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        la.d0(laVar);
                        la.e0(laVar);
                        break;
                    }
                } else {
                    laVar.finishFragment();
                    break;
                }
                break;
            case 5:
                if (i7 == -1) {
                    ((lb) obj).finishFragment();
                    break;
                }
                break;
            case 6:
                qc qcVar = (qc) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        FrameLayout frameLayout = (FrameLayout) qcVar.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        qcVar.M.setAlpha(0.0f);
                        frameLayout.draw(canvas);
                        qcVar.M.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        qcVar.M.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        bc bcVar = new bc(qcVar, qcVar.getParentActivity(), canvas, (qcVar.M.getMeasuredWidth() / 2.0f) + f10, (qcVar.M.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 0);
                        qcVar.n0 = bcVar;
                        bcVar.setOnTouchListener(new gi.a(2));
                        qcVar.o0 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        qcVar.p0 = ofFloat;
                        ofFloat.addUpdateListener(new hi.ca(qcVar, 1));
                        qcVar.p0.addListener(new org.telegram.ui.Cells.y9(qcVar, 4));
                        qcVar.p0.setDuration(400L);
                        qcVar.p0.setInterpolator(org.telegram.ui.Components.xs.e);
                        qcVar.p0.start();
                        frameLayout.addView(qcVar.n0, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.g3(new wb(qcVar, 0));
                        break;
                    }
                } else if (qcVar.b >= qcVar.Z0() && qcVar.X0()) {
                    qcVar.c1();
                    break;
                } else {
                    qcVar.finishFragment();
                    break;
                }
                break;
            case 7:
                ad adVar = (ad) obj;
                long j3 = adVar.k0;
                rc rcVar = adVar.x0;
                if (i7 != -1) {
                    if (i7 == 1) {
                        int i15 = adVar.j0;
                        if (i15 != 0) {
                            if (i15 == 1) {
                                if (adVar.c0) {
                                    org.telegram.messenger.q10 q10Var = adVar.v0;
                                    if (q10Var != null) {
                                        q10Var.a(adVar, Long.valueOf(j3));
                                    }
                                } else if (adVar.y.length() == 0) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(adVar.getParentActivity());
                                    String M0 = org.telegram.messenger.gd.M0(2131752305, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                    u1Var.S = M0;
                                    u1Var.U = org.telegram.messenger.gd.M0(2131752306, null);
                                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752030, null), null);
                                    adVar.showDialog(u1Var);
                                    break;
                                } else if (!adVar.b0) {
                                    Vibrator vibrator = (Vibrator) adVar.getParentActivity().getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                    }
                                    org.telegram.messenger.g0.D3(adVar.W);
                                    break;
                                } else {
                                    org.telegram.messenger.g0.h3(rcVar, 200L);
                                    i10 = ((org.telegram.ui.ActionBar.h2) adVar).currentAccount;
                                    org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i10);
                                    long j10 = adVar.k0;
                                    String str = adVar.Z;
                                    Runnable runnable2 = new Runnable(this) { // from class: org.telegram.ui.vc
                                        public final /* synthetic */ x7 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    ad adVar2 = (ad) this.b.b;
                                                    adVar2.m0(false);
                                                    org.telegram.messenger.q10 q10Var2 = adVar2.v0;
                                                    if (q10Var2 != null) {
                                                        q10Var2.a(adVar2, Long.valueOf(adVar2.k0));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    ad adVar3 = (ad) this.b.b;
                                                    adVar3.m0(false);
                                                    org.telegram.messenger.q10 q10Var3 = adVar3.v0;
                                                    if (q10Var3 != null) {
                                                        q10Var3.a(adVar3, Long.valueOf(adVar3.k0));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    Runnable runnable3 = new Runnable(this) { // from class: org.telegram.ui.vc
                                        public final /* synthetic */ x7 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    ad adVar2 = (ad) this.b.b;
                                                    adVar2.m0(false);
                                                    org.telegram.messenger.q10 q10Var2 = adVar2.v0;
                                                    if (q10Var2 != null) {
                                                        q10Var2.a(adVar2, Long.valueOf(adVar2.k0));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    ad adVar3 = (ad) this.b.b;
                                                    adVar3.m0(false);
                                                    org.telegram.messenger.q10 q10Var3 = adVar3.v0;
                                                    if (q10Var3 != null) {
                                                        q10Var3.a(adVar3, Long.valueOf(adVar3.k0));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                                    tL_channels_updateUsername.channel = u12.j1(j10);
                                    tL_channels_updateUsername.username = str;
                                    u12.getConnectionsManager().sendRequest(tL_channels_updateUsername, new org.telegram.messenger.dm(u12, j10, str, runnable2, adVar, tL_channels_updateUsername, runnable3), 64);
                                }
                                if (adVar.v0 == null) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("step", 2);
                                    bundle.putLong("chatId", j3);
                                    bundle.putInt("chatType", 2);
                                    adVar.presentFragment(new z40(bundle), true);
                                    break;
                                }
                            }
                        } else if (adVar.getParentActivity() != null) {
                            if (!adVar.t0) {
                                if (adVar.d.a.length() != 0) {
                                    adVar.t0 = true;
                                    org.telegram.messenger.g0.h3(rcVar, 200L);
                                    if (!adVar.x.g()) {
                                        i11 = ((org.telegram.ui.ActionBar.h2) adVar).currentAccount;
                                        adVar.u0 = Integer.valueOf(org.telegram.messenger.mp.u1(i11).U(adVar.d.getText().toString(), new ArrayList(), adVar.y.getText().toString(), 2, false, null, null, -1, adVar));
                                        break;
                                    } else {
                                        adVar.s0 = true;
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) adVar.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    org.telegram.messenger.g0.D3(adVar.d);
                                    break;
                                }
                            } else {
                                ad.d0(adVar);
                                break;
                            }
                        }
                    }
                } else if (!adVar.t0) {
                    adVar.finishFragment();
                    break;
                } else {
                    ad.d0(adVar);
                    break;
                }
                break;
            case 8:
                rn rnVar = (rn) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        rnVar.o0();
                        break;
                    }
                } else if (rnVar.j0(true)) {
                    rnVar.finishFragment();
                    break;
                }
                break;
            case 9:
                if (i7 == -1) {
                    ((vo) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i7 == -1) {
                    ((cp) obj).finishFragment();
                    break;
                }
                break;
            case 11:
                np npVar = (np) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        npVar.w0(true);
                        break;
                    }
                } else if (npVar.r0(true)) {
                    npVar.finishFragment();
                    break;
                }
                break;
            case 12:
                rq rqVar = (rq) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        rqVar.z0();
                        break;
                    }
                } else if (rqVar.l0(true)) {
                    rqVar.finishFragment();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) obj;
                if (i7 != -1) {
                    g8Var.Q0(i7);
                    break;
                } else {
                    g8Var.dismiss();
                    break;
                }
            case 14:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.sa) obj).dismiss();
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.si siVar = (org.telegram.ui.Components.si) obj;
                if (i7 != -1) {
                    siVar.w2.w(i7);
                    break;
                } else if (!siVar.w2.k()) {
                    siVar.dismiss();
                    break;
                }
                break;
            case 16:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.c30) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Components.i90 i90Var = (org.telegram.ui.Components.i90) obj;
                if (i7 != -1) {
                    if (i7 == 10) {
                        org.telegram.ui.Components.h90 h90Var = i90Var.S;
                        h90Var.r1(h90Var.getClosestTab(), false);
                        break;
                    }
                } else if (!i90Var.S.V(true)) {
                    i90Var.finishFragment();
                    break;
                }
                break;
            case 18:
                if (i7 == -1 && (runnable = ((org.telegram.ui.Components.ee0) obj).r) != null) {
                    org.telegram.messenger.g0.g3(runnable);
                    break;
                }
                break;
            case 19:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.df0) obj).dismiss();
                    break;
                }
                break;
            case 20:
                ((org.telegram.ui.Components.yo0) obj).onBackPressed();
                break;
            case 21:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.b51) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.voip.w0) obj).b(false, false);
                    break;
                }
                break;
            case 23:
                if (i7 == -1) {
                    ((bc1) obj).a(false, false);
                    break;
                }
                break;
            case 24:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (i7 != -1) {
                    if (i7 != 100) {
                        if (i7 == 1) {
                            org.telegram.messenger.bz.L0 = !org.telegram.messenger.bz.L0;
                            SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                            edit.putBoolean("sortContactsByName", org.telegram.messenger.bz.L0);
                            edit.apply();
                            contactsActivity.r = org.telegram.messenger.bz.L0;
                            org.telegram.ui.ActionBar.h5 h5Var = contactsActivity.n;
                            if (h5Var != null) {
                                org.telegram.messenger.g0.P3(h5Var.getIconView(), contactsActivity.r ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
                            }
                            ViewPropertyAnimator viewPropertyAnimator = contactsActivity.f0;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                            }
                            contactsActivity.a.b();
                            ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(0.0f).setDuration(120L).setInterpolator(org.telegram.ui.Components.lr.g).withEndAction(new sr(contactsActivity, i13));
                            contactsActivity.f0 = withEndAction;
                            withEndAction.start();
                            break;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, contactsActivity.getParentActivity(), contactsActivity.getResourceProvider());
                        a0.h hVar = contactsActivity.a0;
                        int m10 = hVar.m();
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                        if (m10 == 1) {
                            u1Var2.S = org.telegram.messenger.gd.M0(2131751539, null);
                            u1Var2.U = org.telegram.messenger.gd.M0(2131751540, null);
                        } else {
                            u1Var2.S = org.telegram.messenger.gd.G(hVar.m(), "DeleteContactsTitle", new Object[0]);
                            u1Var2.U = org.telegram.messenger.gd.M0(2131751538, null);
                        }
                        alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131751587, null), new tr(contactsActivity));
                        alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), new org.telegram.ui.Components.wb0(22));
                        u1Var2.show();
                        u1Var2.i();
                        break;
                    }
                } else {
                    a5Var2 = ((org.telegram.ui.ActionBar.h2) contactsActivity).simpleActionBar;
                    if (!a5Var2.x()) {
                        contactsActivity.finishFragment();
                        break;
                    } else {
                        contactsActivity.m0();
                        break;
                    }
                }
                break;
            case 25:
                if (i7 == -1) {
                    ((ts) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                if (i7 == -1) {
                    ((DataAutoDownloadActivity) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                if (i7 == -1) {
                    ((DataSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i7 == -1) {
                    ((pt) obj).finishFragment();
                    break;
                }
                break;
            default:
                if (i7 == -1) {
                    ((eu) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
