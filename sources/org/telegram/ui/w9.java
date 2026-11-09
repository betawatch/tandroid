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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class w9 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w9(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        long j3;
        int i10;
        int i11;
        Runnable runnable;
        org.telegram.ui.ActionBar.y4 y4Var;
        hw hwVar;
        org.telegram.messenger.vo voVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
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
                    rcVar.o0.setInterpolator(org.telegram.ui.Components.ks.e);
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
                                bdVar.presentFragment(new y40(bundle), true);
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
                qq qqVar = (qq) obj;
                if (i7 == -1) {
                    if (qqVar.l0(true)) {
                        qqVar.finishFragment();
                        break;
                    }
                } else if (i7 == 1) {
                    qqVar.z0();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) obj;
                if (i7 == -1) {
                    b8Var.dismiss();
                    break;
                } else {
                    b8Var.P0(i7);
                    break;
                }
            case 11:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.na) obj).dismiss();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.di diVar = (org.telegram.ui.Components.di) obj;
                if (i7 != -1) {
                    diVar.s2.w(i7);
                    break;
                } else if (!diVar.s2.k()) {
                    diVar.dismiss();
                    break;
                }
                break;
            case 13:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.s20) obj).finishFragment();
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
                if (i7 == -1 && (runnable = ((org.telegram.ui.Components.vd0) obj).r) != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    break;
                }
                break;
            case 16:
                if (i7 == -1) {
                    ((org.telegram.ui.Components.re0) obj).dismiss();
                    break;
                }
                break;
            case 17:
                ((org.telegram.ui.Components.no0) obj).onBackPressed();
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
                    ((cc1) obj).a(false, false);
                    break;
                }
                break;
            case 21:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (i7 == -1) {
                    y4Var = ((org.telegram.ui.ActionBar.f2) contactsActivity).simpleActionBar;
                    if (y4Var.t()) {
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
                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131751598, null), new sr(contactsActivity));
                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.ui.Components.jl0(15));
                    u1Var2.show();
                    u1Var2.i();
                    break;
                } else if (i7 == 1) {
                    org.telegram.messenger.iz.L0 = !org.telegram.messenger.iz.L0;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    edit.putBoolean("sortContactsByName", org.telegram.messenger.iz.L0);
                    edit.apply();
                    contactsActivity.r = org.telegram.messenger.iz.L0;
                    org.telegram.ui.ActionBar.f5 f5Var = contactsActivity.n;
                    if (f5Var != null) {
                        org.telegram.messenger.g0.R3(f5Var.getIconView(), contactsActivity.r ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
                    }
                    ViewPropertyAnimator viewPropertyAnimator = contactsActivity.e0;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    contactsActivity.a.b();
                    ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(0.0f).setDuration(120L).setInterpolator(org.telegram.ui.Components.xq.g).withEndAction(new rr(contactsActivity, i14));
                    contactsActivity.e0 = withEndAction;
                    withEndAction.start();
                    break;
                }
                break;
            case 22:
                if (i7 == -1) {
                    ((ss) obj).finishFragment();
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
                    ((mt) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                if (i7 == -1) {
                    ((cu) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                yw ywVar = (yw) obj;
                ArrayList arrayList = ywVar.J2;
                if ((i7 == 201 || i7 == 200 || i7 == 202 || i7 == 203) && (hwVar = ywVar.C0) != null) {
                    HashMap hashMap = hwVar.B0;
                    yw ywVar2 = hwVar.L0;
                    if (i7 != 202) {
                        if (i7 != 203) {
                            if (i7 != 200) {
                                if (i7 == 201) {
                                    yw ywVar3 = new yw(org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true));
                                    ywVar3.D2 = new org.telegram.ui.Components.bx(hwVar, 18);
                                    ywVar2.presentFragment(ywVar3);
                                    break;
                                }
                            } else if (hashMap.size() == 1) {
                                hwVar.g((org.telegram.messenger.ij) hashMap.values().iterator().next());
                                break;
                            }
                        } else if (hwVar.O()) {
                            ywVar2.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) ywVar2, 2, true));
                            break;
                        }
                    } else if (ywVar2 != null && ywVar2.getParentActivity() != null) {
                        ArrayList arrayList2 = new ArrayList(hashMap.values());
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ywVar2.getParentActivity());
                        String G = org.telegram.messenger.id.G(hashMap.size(), "RemoveDocumentsTitle", new Object[0]);
                        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
                        u1Var3.R = G;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(hashMap.size(), "RemoveDocumentsMessage", new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.id.M0(2131746319, null));
                        u1Var3.T = spannableStringBuilder;
                        alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.ui.Components.jl0(i15));
                        alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131751598, null), new org.telegram.ui.Components.f2(16, hwVar, arrayList2));
                        TextView textView = (TextView) alertDialog$Builder3.p().d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, null);
                            break;
                        }
                    }
                } else if (i7 == -1) {
                    uv uvVar = ywVar.G3;
                    if (uvVar == null || !uvVar.c()) {
                        ow owVar = ywVar.z0;
                        if (owVar == null || !owVar.n) {
                            kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                            if (kVar.w()) {
                                hw hwVar2 = ywVar.C0;
                                if (hwVar2 != null && hwVar2.getVisibility() == 0) {
                                    hw hwVar3 = ywVar.C0;
                                    if (hwVar3.A0) {
                                        hwVar3.R(false);
                                        break;
                                    }
                                }
                                ywVar.n4(true);
                                break;
                            } else if (ywVar.m2 || ywVar.X2 != 0 || ywVar.Z2 != 0) {
                                ywVar.finishFragment();
                                break;
                            }
                        } else {
                            owVar.setIsEditing(false);
                            ywVar.U4(false);
                            break;
                        }
                    } else {
                        kVar2 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                        if (kVar2.w()) {
                            hw hwVar4 = ywVar.C0;
                            if (hwVar4 != null && hwVar4.getVisibility() == 0) {
                                hw hwVar5 = ywVar.C0;
                                if (hwVar5.A0) {
                                    hwVar5.R(false);
                                    break;
                                }
                            }
                            ywVar.n4(true);
                            break;
                        } else {
                            ywVar.G3.a();
                            hw hwVar6 = ywVar.C0;
                            if (hwVar6 != null) {
                                hwVar6.S();
                                break;
                            }
                        }
                    }
                } else if (i7 != 1) {
                    if (i7 == 3) {
                        ywVar.a5(true, true, true, false);
                        ywVar.Y.b(true);
                        break;
                    } else if (i7 == 11) {
                        ywVar.B4(ywVar.E1);
                        break;
                    } else if (i7 == 109) {
                        org.telegram.ui.Components.gz gzVar = new org.telegram.ui.Components.gz(ywVar, arrayList);
                        gzVar.q1 = new yr(this, 7);
                        ywVar.showDialog(gzVar);
                        break;
                    } else if (i7 == 110) {
                        org.telegram.messenger.vo voVar2 = (org.telegram.messenger.vo) ywVar.getMessagesController().T0().get(ywVar.e0[0].h);
                        ArrayList J0 = org.telegram.ui.Components.gz.J0(ywVar, voVar2, arrayList, false, false);
                        if (J0.size() + (voVar2 != null ? voVar2.i.size() : 0) > 100) {
                            ywVar.showDialog(org.telegram.ui.Components.v4.K(ywVar.getParentActivity(), org.telegram.messenger.id.M0(2131750810, null), org.telegram.messenger.id.M0(2131750811, null)).a);
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
                                iz.z0(voVar, voVar2.g, voVar2.b, voVar2.c, voVar2.n, voVar2.m, voVar2.h, voVar2.i, voVar2.j, false, false, true, false, false, ywVar, null);
                            }
                            long longValue = J0.size() == 1 ? ((Long) J0.get(0)).longValue() : 0L;
                            UndoView k42 = ywVar.k4();
                            if (k42 != null) {
                                k42.k(longValue, 21, Integer.valueOf(J0.size()), voVar, null, null);
                            }
                            ywVar.n4(false);
                            break;
                        }
                    } else if (i7 == 100 || i7 == 101 || i7 == 102 || i7 == 103 || i7 == 104 || i7 == 105 || i7 == 106 || i7 == 107 || i7 == 108) {
                        ywVar.D4(ywVar.J2, i7, true, false, null);
                        break;
                    }
                } else if (ywVar.getParentActivity() != null) {
                    org.telegram.messenger.iz.x = true;
                    org.telegram.messenger.iz.y();
                    int[] iArr2 = new int[2];
                    ywVar.f0.getLocationInWindow(iArr2);
                    ((LaunchActivity) ywVar.getParentActivity()).K0(false, true, (ywVar.f0.getMeasuredWidth() / 2) + iArr2[0], (ywVar.f0.getMeasuredHeight() / 2) + iArr2[1], new dh(this, 22));
                    ywVar.getNotificationsController().Y();
                    ywVar.K3();
                    break;
                }
                break;
            case 28:
                gx gxVar = (gx) obj;
                int i18 = gxVar.x;
                ArrayList arrayList3 = gxVar.e;
                int i19 = gxVar.y;
                if (i7 == -1) {
                    if (gxVar.D == null) {
                        gxVar.d0();
                        break;
                    } else {
                        gxVar.finishFragment();
                        break;
                    }
                } else if (i7 == 1 && gxVar.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                        arrayList4.add(org.telegram.messenger.xr.a(((Long) arrayList3.get(i20)).longValue(), 0L));
                    }
                    org.telegram.messenger.yr messagesStorage = gxVar.getMessagesStorage();
                    messagesStorage.a.c(new org.telegram.messenger.up(messagesStorage, i19, arrayList4, i15));
                    SharedPreferences.Editor edit2 = gxVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
                    i12 = ((org.telegram.ui.ActionBar.f2) gxVar).currentAccount;
                    edit2.putInt("account" + i19, i12);
                    edit2.putInt(TeXSymbolParser.TYPE_ATTR + i19, i18);
                    edit2.commit();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(gxVar.getParentActivity());
                    if (i18 == 0) {
                        ChatsWidgetProvider.a(gxVar.getParentActivity(), appWidgetManager, i19);
                    } else {
                        ContactsWidgetProvider.a(gxVar.getParentActivity(), appWidgetManager, i19);
                    }
                    cx cxVar = gxVar.D;
                    if (cxVar != null) {
                        cxVar.b();
                        break;
                    } else {
                        gxVar.d0();
                        break;
                    }
                }
                break;
            default:
                if (i7 == -1) {
                    ((px) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
