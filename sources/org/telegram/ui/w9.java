package org.telegram.ui;

import android.animation.ValueAnimator;
import android.appwidget.AppWidgetManager;
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
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w9 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w9(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i7) {
        long j3;
        int i10;
        int i11;
        Runnable runnable;
        org.telegram.ui.ActionBar.z4 z4Var;
        iw iwVar;
        org.telegram.messenger.vo voVar;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int i12;
        int i13 = this.a;
        final int i14 = 0;
        final int i15 = 1;
        Object obj = this.b;
        switch (i13) {
            case 0:
                y9 y9Var = (y9) obj;
                if (i7 == -1) {
                    y9Var.finishFragment();
                    break;
                } else if (i7 == 1 && y9Var.a.getText().length() != 0) {
                    y9.Z(y9Var);
                    y9Var.finishFragment();
                    break;
                }
                break;
            case 1:
                la laVar = (la) obj;
                if (i7 == -1) {
                    laVar.finishFragment();
                    break;
                } else if (i7 == 1) {
                    la.d0(laVar);
                    la.e0(laVar);
                    break;
                }
                break;
            case 2:
                if (i7 == -1) {
                    ((mb) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                rc rcVar = (rc) obj;
                if (i7 == -1) {
                    if (rcVar.b < rcVar.Z0() || !rcVar.X0()) {
                        rcVar.finishFragment();
                        break;
                    } else {
                        rcVar.c1();
                        break;
                    }
                } else if (i7 == 1) {
                    FrameLayout frameLayout = (FrameLayout) rcVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    rcVar.L.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    rcVar.L.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    rcVar.L.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float f11 = iArr[1];
                    float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.n;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    cc ccVar = new cc(rcVar, rcVar.getParentActivity(), canvas, (rcVar.L.getMeasuredWidth() / 2.0f) + f10, (rcVar.L.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 0);
                    rcVar.m0 = ccVar;
                    ccVar.setOnTouchListener(new ei.b(2));
                    rcVar.n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rcVar.o0 = ofFloat;
                    ofFloat.addUpdateListener(new fi.ea(rcVar, i15));
                    rcVar.o0.addListener(new va(rcVar, 3));
                    rcVar.o0.setDuration(400L);
                    rcVar.o0.setInterpolator(org.telegram.ui.Components.js.e);
                    rcVar.o0.start();
                    frameLayout.addView(rcVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    org.telegram.messenger.g0.h3(new xb(rcVar, 0));
                    break;
                }
                break;
            case 4:
                bd bdVar = (bd) obj;
                long j10 = bdVar.j0;
                sc scVar = bdVar.w0;
                if (i7 == -1) {
                    if (bdVar.s0) {
                        bd.d0(bdVar);
                        break;
                    } else {
                        bdVar.finishFragment();
                        break;
                    }
                } else if (i7 == 1) {
                    int i16 = bdVar.i0;
                    if (i16 != 0) {
                        if (i16 == 1) {
                            if (bdVar.b0) {
                                j3 = j10;
                                org.telegram.messenger.v10 v10Var = bdVar.u0;
                                if (v10Var != null) {
                                    v10Var.a(bdVar, Long.valueOf(j3));
                                }
                            } else if (bdVar.y.length() == 0) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bdVar.getParentActivity());
                                String M0 = org.telegram.messenger.id.M0(2131752316, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = M0;
                                u1Var.T = org.telegram.messenger.id.M0(2131752317, null);
                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752041, null), null);
                                bdVar.showDialog(u1Var);
                                break;
                            } else if (!bdVar.a0) {
                                Vibrator vibrator = (Vibrator) bdVar.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(bdVar.V);
                                break;
                            } else {
                                org.telegram.messenger.g0.i3(scVar, 200L);
                                i10 = ((org.telegram.ui.ActionBar.f2) bdVar).currentAccount;
                                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i10);
                                long j11 = bdVar.j0;
                                String str = bdVar.Y;
                                Runnable runnable2 = new Runnable(this) { // from class: org.telegram.ui.wc
                                    public final /* synthetic */ w9 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                bd bdVar2 = (bd) this.b.b;
                                                bdVar2.m0(false);
                                                org.telegram.messenger.v10 v10Var2 = bdVar2.u0;
                                                if (v10Var2 != null) {
                                                    v10Var2.a(bdVar2, Long.valueOf(bdVar2.j0));
                                                    break;
                                                }
                                                break;
                                            default:
                                                bd bdVar3 = (bd) this.b.b;
                                                bdVar3.m0(false);
                                                org.telegram.messenger.v10 v10Var3 = bdVar3.u0;
                                                if (v10Var3 != null) {
                                                    v10Var3.a(bdVar3, Long.valueOf(bdVar3.j0));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                Runnable runnable3 = new Runnable(this) { // from class: org.telegram.ui.wc
                                    public final /* synthetic */ w9 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                bd bdVar2 = (bd) this.b.b;
                                                bdVar2.m0(false);
                                                org.telegram.messenger.v10 v10Var2 = bdVar2.u0;
                                                if (v10Var2 != null) {
                                                    v10Var2.a(bdVar2, Long.valueOf(bdVar2.j0));
                                                    break;
                                                }
                                                break;
                                            default:
                                                bd bdVar3 = (bd) this.b.b;
                                                bdVar3.m0(false);
                                                org.telegram.messenger.v10 v10Var3 = bdVar3.u0;
                                                if (v10Var3 != null) {
                                                    v10Var3.a(bdVar3, Long.valueOf(bdVar3.j0));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                                tL_channels_updateUsername.channel = s12.h1(j11);
                                tL_channels_updateUsername.username = str;
                                j3 = j10;
                                s12.getConnectionsManager().sendRequest(tL_channels_updateUsername, new org.telegram.messenger.mm(s12, j11, str, runnable2, bdVar, tL_channels_updateUsername, runnable3), 64);
                            }
                            if (bdVar.u0 == null) {
                                Bundle bundle = new Bundle();
                                bundle.putInt("step", 2);
                                bundle.putLong("chatId", j3);
                                bundle.putInt("chatType", 2);
                                bdVar.presentFragment(new z40(bundle), true);
                                break;
                            }
                        }
                    } else if (bdVar.getParentActivity() != null) {
                        if (bdVar.s0) {
                            bd.d0(bdVar);
                            break;
                        } else if (bdVar.d.a.length() == 0) {
                            Vibrator vibrator2 = (Vibrator) bdVar.getParentActivity().getSystemService("vibrator");
                            if (vibrator2 != null) {
                                vibrator2.vibrate(200L);
                            }
                            org.telegram.messenger.g0.F3(bdVar.d);
                            break;
                        } else {
                            bdVar.s0 = true;
                            org.telegram.messenger.g0.i3(scVar, 200L);
                            if (bdVar.x.g()) {
                                bdVar.r0 = true;
                                break;
                            } else {
                                i11 = ((org.telegram.ui.ActionBar.f2) bdVar).currentAccount;
                                bdVar.t0 = Integer.valueOf(org.telegram.messenger.qp.s1(i11).U(bdVar.d.getText().toString(), new ArrayList(), bdVar.y.getText().toString(), 2, false, null, null, -1, bdVar));
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                rn rnVar = (rn) obj;
                if (i7 == -1) {
                    if (rnVar.j0(true)) {
                        rnVar.finishFragment();
                        break;
                    }
                } else if (i7 == 1) {
                    rnVar.o0();
                    break;
                }
                break;
            case 6:
                if (i7 == -1) {
                    ((uo) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i7 == -1) {
                    ((bp) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                mp mpVar = (mp) obj;
                if (i7 == -1) {
                    if (mpVar.r0(true)) {
                        mpVar.finishFragment();
                        break;
                    }
                } else if (i7 == 1) {
                    mpVar.w0(true);
                    break;
                }
                break;
            case 9:
                rq rqVar = (rq) obj;
                if (i7 == -1) {
                    if (rqVar.l0(true)) {
                        rqVar.finishFragment();
                        break;
                    }
                } else if (i7 == 1) {
                    rqVar.z0();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.a8 a8Var = (org.telegram.ui.Components.a8) obj;
                if (i7 == -1) {
                    a8Var.dismiss();
                    break;
                } else {
                    a8Var.P0(i7);
                    break;
                }
            case 11:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.ma) obj).dismiss();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.ci ciVar = (org.telegram.ui.Components.ci) obj;
                if (i7 != -1) {
                    ciVar.v2.w(i7);
                    break;
                } else if (!ciVar.v2.k()) {
                    ciVar.dismiss();
                    break;
                }
                break;
            case 13:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.r20) obj).finishFragment();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.v80 v80Var = (org.telegram.ui.Components.v80) obj;
                if (i7 != -1) {
                    if (i7 == 10) {
                        org.telegram.ui.Components.u80 u80Var = v80Var.R;
                        u80Var.r1(u80Var.getClosestTab(), false);
                        break;
                    }
                } else if (!v80Var.R.V(true)) {
                    v80Var.finishFragment();
                    break;
                }
                break;
            case 15:
                if (i7 == -1 && (runnable = ((org.telegram.ui.Components.ud0) obj).r) != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    break;
                }
                break;
            case 16:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.qe0) obj).dismiss();
                    break;
                }
                break;
            case 17:
                ((org.telegram.ui.Components.mo0) obj).onBackPressed();
                break;
            case 18:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.o41) obj).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.voip.t0) obj).b(false, false);
                    break;
                }
                break;
            case 20:
                if (i7 == -1) {
                    ((dc1) obj).a(false, false);
                    break;
                }
                break;
            case 21:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (i7 == -1) {
                    z4Var = ((org.telegram.ui.ActionBar.f2) contactsActivity).simpleActionBar;
                    if (z4Var.u()) {
                        contactsActivity.m0();
                        break;
                    } else {
                        contactsActivity.finishFragment();
                        break;
                    }
                } else if (i7 == 100) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, contactsActivity.getParentActivity(), contactsActivity.getResourceProvider());
                    a0.h hVar = contactsActivity.Z;
                    int m10 = hVar.m();
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                    if (m10 == 1) {
                        u1Var2.R = org.telegram.messenger.id.M0(2131751550, null);
                        u1Var2.T = org.telegram.messenger.id.M0(2131751551, null);
                    } else {
                        u1Var2.R = org.telegram.messenger.id.G(hVar.m(), "DeleteContactsTitle", new Object[0]);
                        u1Var2.T = org.telegram.messenger.id.M0(2131751549, null);
                    }
                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131751598, null), new tr(contactsActivity));
                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.ui.Components.il0(15));
                    u1Var2.show();
                    u1Var2.i();
                    break;
                } else if (i7 == 1) {
                    org.telegram.messenger.iz.L0 = !org.telegram.messenger.iz.L0;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    edit.putBoolean("sortContactsByName", org.telegram.messenger.iz.L0);
                    edit.apply();
                    contactsActivity.r = org.telegram.messenger.iz.L0;
                    org.telegram.ui.ActionBar.g5 g5Var = contactsActivity.n;
                    if (g5Var != null) {
                        org.telegram.messenger.g0.R3(g5Var.getIconView(), contactsActivity.r ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
                    }
                    ViewPropertyAnimator viewPropertyAnimator = contactsActivity.e0;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    contactsActivity.a.b();
                    ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(0.0f).setDuration(120L).setInterpolator(org.telegram.ui.Components.wq.g).withEndAction(new sr(contactsActivity, i14));
                    contactsActivity.e0 = withEndAction;
                    withEndAction.start();
                    break;
                }
                break;
            case 22:
                if (i7 == -1) {
                    ((ts) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i7 == -1) {
                    ((DataAutoDownloadActivity) obj).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i7 == -1) {
                    ((DataSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i7 == -1) {
                    ((nt) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                if (i7 == -1) {
                    ((du) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                zw zwVar = (zw) obj;
                ArrayList arrayList = zwVar.J2;
                if ((i7 == 201 || i7 == 200 || i7 == 202 || i7 == 203) && (iwVar = zwVar.C0) != null) {
                    HashMap hashMap = iwVar.B0;
                    zw zwVar2 = iwVar.L0;
                    if (i7 != 202) {
                        if (i7 != 203) {
                            if (i7 != 200) {
                                if (i7 == 201) {
                                    zw zwVar3 = new zw(org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true));
                                    zwVar3.D2 = new org.telegram.ui.Components.ax(iwVar, 18);
                                    zwVar2.presentFragment(zwVar3);
                                    break;
                                }
                            } else if (hashMap.size() == 1) {
                                iwVar.g((org.telegram.messenger.ij) hashMap.values().iterator().next());
                                break;
                            }
                        } else if (iwVar.O()) {
                            zwVar2.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) zwVar2, 2, true));
                            break;
                        }
                    } else if (zwVar2 != null && zwVar2.getParentActivity() != null) {
                        ArrayList arrayList2 = new ArrayList(hashMap.values());
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(zwVar2.getParentActivity());
                        String G = org.telegram.messenger.id.G(hashMap.size(), "RemoveDocumentsTitle", new Object[0]);
                        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
                        u1Var3.R = G;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(hashMap.size(), "RemoveDocumentsMessage", new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.id.M0(2131746319, null));
                        u1Var3.T = spannableStringBuilder;
                        alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.ui.Components.il0(i15));
                        alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131751598, null), new org.telegram.ui.Components.e2(16, iwVar, arrayList2));
                        TextView textView = (TextView) alertDialog$Builder3.p().d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                            break;
                        }
                    }
                } else if (i7 == -1) {
                    vv vvVar = zwVar.G3;
                    if (vvVar == null || !vvVar.c()) {
                        pw pwVar = zwVar.z0;
                        if (pwVar == null || !pwVar.n) {
                            lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                            if (lVar.x()) {
                                iw iwVar2 = zwVar.C0;
                                if (iwVar2 != null && iwVar2.getVisibility() == 0) {
                                    iw iwVar3 = zwVar.C0;
                                    if (iwVar3.A0) {
                                        iwVar3.R(false);
                                        break;
                                    }
                                }
                                zwVar.n4(true);
                                break;
                            } else if (zwVar.m2 || zwVar.X2 != 0 || zwVar.Z2 != 0) {
                                zwVar.finishFragment();
                                break;
                            }
                        } else {
                            pwVar.setIsEditing(false);
                            zwVar.U4(false);
                            break;
                        }
                    } else {
                        lVar2 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                        if (lVar2.x()) {
                            iw iwVar4 = zwVar.C0;
                            if (iwVar4 != null && iwVar4.getVisibility() == 0) {
                                iw iwVar5 = zwVar.C0;
                                if (iwVar5.A0) {
                                    iwVar5.R(false);
                                    break;
                                }
                            }
                            zwVar.n4(true);
                            break;
                        } else {
                            zwVar.G3.a();
                            iw iwVar6 = zwVar.C0;
                            if (iwVar6 != null) {
                                iwVar6.S();
                                break;
                            }
                        }
                    }
                } else if (i7 != 1) {
                    if (i7 == 3) {
                        zwVar.a5(true, true, true, false);
                        zwVar.Y.b(true);
                        break;
                    } else if (i7 == 11) {
                        zwVar.B4(zwVar.E1);
                        break;
                    } else if (i7 == 109) {
                        org.telegram.ui.Components.fz fzVar = new org.telegram.ui.Components.fz(zwVar, arrayList);
                        fzVar.t1 = new zr(this, 7);
                        zwVar.showDialog(fzVar);
                        break;
                    } else if (i7 == 110) {
                        org.telegram.messenger.vo voVar2 = (org.telegram.messenger.vo) zwVar.getMessagesController().T0().get(zwVar.e0[0].h);
                        ArrayList J0 = org.telegram.ui.Components.fz.J0(zwVar, voVar2, arrayList, false, false);
                        if (J0.size() + (voVar2 != null ? voVar2.i.size() : 0) > 100) {
                            zwVar.showDialog(org.telegram.ui.Components.u4.K(zwVar.getParentActivity(), org.telegram.messenger.id.M0(2131750810, null), org.telegram.messenger.id.M0(2131750811, null)).a);
                            break;
                        } else {
                            if (J0.isEmpty()) {
                                voVar = voVar2;
                            } else {
                                voVar2.i.addAll(J0);
                                for (int i17 = 0; i17 < J0.size(); i17++) {
                                    Long l10 = (Long) J0.get(i17);
                                    voVar2.h.remove(l10);
                                    voVar2.j.delete(l10.longValue());
                                }
                                if (voVar2.d()) {
                                    voVar2.i.clear();
                                }
                                voVar = voVar2;
                                jz.z0(voVar, voVar2.g, voVar2.b, voVar2.c, voVar2.n, voVar2.m, voVar2.h, voVar2.i, voVar2.j, false, false, true, false, false, zwVar, null);
                            }
                            long longValue = J0.size() == 1 ? ((Long) J0.get(0)).longValue() : 0L;
                            UndoView k42 = zwVar.k4();
                            if (k42 != null) {
                                k42.k(longValue, 21, Integer.valueOf(J0.size()), voVar, null, null);
                            }
                            zwVar.n4(false);
                            break;
                        }
                    } else if (i7 == 100 || i7 == 101 || i7 == 102 || i7 == 103 || i7 == 104 || i7 == 105 || i7 == 106 || i7 == 107 || i7 == 108) {
                        zwVar.D4(zwVar.J2, i7, true, false, null);
                        break;
                    }
                } else if (zwVar.getParentActivity() != null) {
                    org.telegram.messenger.iz.x = true;
                    org.telegram.messenger.iz.y();
                    int[] iArr2 = new int[2];
                    zwVar.f0.getLocationInWindow(iArr2);
                    ((LaunchActivity) zwVar.getParentActivity()).K0(false, true, (zwVar.f0.getMeasuredWidth() / 2) + iArr2[0], (zwVar.f0.getMeasuredHeight() / 2) + iArr2[1], new dh(this, 22));
                    zwVar.getNotificationsController().Y();
                    zwVar.K3();
                    break;
                }
                break;
            case 28:
                hx hxVar = (hx) obj;
                int i18 = hxVar.x;
                ArrayList arrayList3 = hxVar.e;
                int i19 = hxVar.y;
                if (i7 == -1) {
                    if (hxVar.D == null) {
                        hxVar.d0();
                        break;
                    } else {
                        hxVar.finishFragment();
                        break;
                    }
                } else if (i7 == 1 && hxVar.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                        arrayList4.add(org.telegram.messenger.xr.a(((Long) arrayList3.get(i20)).longValue(), 0L));
                    }
                    org.telegram.messenger.yr messagesStorage = hxVar.getMessagesStorage();
                    messagesStorage.a.c(new org.telegram.messenger.up(messagesStorage, i19, arrayList4, i15));
                    SharedPreferences.Editor edit2 = hxVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
                    i12 = ((org.telegram.ui.ActionBar.f2) hxVar).currentAccount;
                    edit2.putInt("account" + i19, i12);
                    edit2.putInt(TeXSymbolParser.TYPE_ATTR + i19, i18);
                    edit2.commit();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(hxVar.getParentActivity());
                    if (i18 == 0) {
                        ChatsWidgetProvider.a(hxVar.getParentActivity(), appWidgetManager, i19);
                    } else {
                        ContactsWidgetProvider.a(hxVar.getParentActivity(), appWidgetManager, i19);
                    }
                    dx dxVar = hxVar.D;
                    if (dxVar != null) {
                        dxVar.b();
                        break;
                    } else {
                        hxVar.d0();
                        break;
                    }
                }
                break;
            default:
                if (i7 == -1) {
                    ((qx) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
