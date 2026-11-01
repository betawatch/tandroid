package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vu implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vu(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:357:0x0a35  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i10;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        long j10 = 0;
        char c10 = 16;
        ArrayList arrayList = null;
        int i11 = 2;
        int i12 = 0;
        int i13 = 1;
        switch (this.a) {
            case 0:
                yu yuVar = (yu) this.b;
                sh.b bVar = (sh.b) this.c;
                xu xuVar = yuVar.P1;
                org.telegram.ui.Components.jx0[] jx0VarArr = yuVar.T1;
                for (org.telegram.ui.Components.jx0 jx0Var : jx0VarArr) {
                    if (jx0Var != null) {
                        boolean z10 = jx0Var.c;
                    }
                }
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                int intValue = ((Integer) c2Var.getTag()).intValue();
                org.telegram.ui.Components.jx0 jx0Var2 = jx0VarArr[intValue];
                boolean z11 = jx0Var2.c;
                boolean z12 = !z11;
                if (z11 != z12) {
                    jx0Var2.c = z12;
                    jx0Var2.d = true;
                }
                c2Var.c(jx0Var2.c, true);
                boolean z13 = jx0VarArr[intValue].c;
                ArrayList arrayList2 = bVar.d;
                HashSet hashSet = bVar.j;
                if (intValue == 0) {
                    bVar.m = z13;
                } else if (intValue != 1) {
                    if (intValue == 2) {
                        arrayList = bVar.e;
                        bVar.o = z13;
                    } else if (intValue == 3) {
                        arrayList = bVar.f;
                        bVar.p = z13;
                    } else if (intValue == 4) {
                        arrayList = bVar.g;
                        bVar.q = z13;
                    } else if (intValue == 7) {
                        arrayList = bVar.h;
                    }
                    if (arrayList != null) {
                        for (int i14 = 0; i14 < arrayList.size(); i14++) {
                            if (((sh.a) arrayList.get(i14)).d == intValue) {
                                if (z13) {
                                    if (!hashSet.contains(arrayList.get(i14))) {
                                        hashSet.add((sh.a) arrayList.get(i14));
                                        bVar.g((sh.a) arrayList.get(i14), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i14))) {
                                    hashSet.remove(arrayList.get(i14));
                                    bVar.g((sh.a) arrayList.get(i14), false);
                                }
                            }
                        }
                    }
                    yuVar.W1.d();
                    yuVar.S1.a(xuVar.d(), true);
                    xuVar.c(true);
                    break;
                } else {
                    bVar.n = z13;
                }
                arrayList = arrayList2;
                if (arrayList != null) {
                }
                yuVar.W1.d();
                yuVar.S1.a(xuVar.d(), true);
                xuVar.c(true);
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 2:
                zx zxVar = (zx) this.b;
                zxVar.D4((ArrayList) this.c, org.telegram.messenger.at.n1, false, false, null);
                zxVar.finishPreviewFragment();
                break;
            case 3:
                yh.e0.e((org.telegram.ui.ActionBar.x1[]) this.c, r0, r0.currentAccount, ((zx) this.b).Z2);
                break;
            case 4:
                zx.I0((zx) this.b, (org.telegram.messenger.w1) this.c);
                break;
            case 5:
                zx zxVar2 = (zx) this.b;
                org.telegram.ui.Components.z60 z60Var = (org.telegram.ui.Components.z60) this.c;
                zxVar2.getClass();
                z60Var.u();
                zxVar2.presentFragment(new ProxyListActivity());
                break;
            case 6:
                e10 e10Var = (e10) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((f10) this.c).getSuggestedFilter();
                org.telegram.messenger.bp bpVar = new org.telegram.messenger.bp();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                bpVar.b = tL_textWithEntities.text;
                bpVar.c = tL_textWithEntities.entities;
                bpVar.a = 2;
                while (e10Var.e.getMessagesController().S0.get(bpVar.a) != null) {
                    bpVar.a++;
                }
                bpVar.f = e10Var.e.getMessagesController().S0().size();
                bpVar.d = -1;
                bpVar.e = -1;
                int i15 = 0;
                while (i15 < 2) {
                    TLRPC.DialogFilter dialogFilter = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList3 = i15 == 0 ? dialogFilter.include_peers : dialogFilter.exclude_peers;
                    ArrayList arrayList4 = i15 == 0 ? bpVar.h : bpVar.i;
                    int size = arrayList3.size();
                    long j11 = j10;
                    int i16 = 0;
                    while (i16 < size) {
                        TLRPC.InputPeer inputPeer = arrayList3.get(i16);
                        char c11 = c10;
                        int i17 = r10;
                        long j12 = inputPeer.user_id;
                        if (j12 == j11) {
                            long j13 = inputPeer.chat_id;
                            if (j13 == j11) {
                                j13 = inputPeer.channel_id;
                            }
                            j12 = -j13;
                        }
                        i16 = c3.i0.k(i16, 1, j12, arrayList4);
                        c10 = c11;
                        r10 = i17;
                    }
                    i15++;
                    j10 = j11;
                }
                TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                if (dialogFilter2.groups) {
                    int i18 = bpVar.g;
                    int i19 = org.telegram.messenger.wp.D8;
                    bpVar.g = i18 | 4;
                }
                if (dialogFilter2.bots) {
                    int i20 = bpVar.g;
                    int i21 = org.telegram.messenger.wp.D8;
                    bpVar.g = i20 | 16;
                }
                if (dialogFilter2.contacts) {
                    int i22 = bpVar.g;
                    int i23 = org.telegram.messenger.wp.D8;
                    bpVar.g = 1 | i22;
                }
                if (dialogFilter2.non_contacts) {
                    int i24 = bpVar.g;
                    int i25 = org.telegram.messenger.wp.D8;
                    bpVar.g = i24 | 2;
                }
                if (dialogFilter2.broadcasts) {
                    int i26 = bpVar.g;
                    int i27 = org.telegram.messenger.wp.D8;
                    bpVar.g = i26 | 8;
                }
                if (dialogFilter2.exclude_archived) {
                    int i28 = bpVar.g;
                    int i29 = org.telegram.messenger.wp.D8;
                    bpVar.g = i28 | 128;
                }
                if (dialogFilter2.exclude_read) {
                    int i30 = bpVar.g;
                    int i31 = org.telegram.messenger.wp.D8;
                    bpVar.g = i30 | 64;
                }
                if (dialogFilter2.exclude_muted) {
                    int i32 = bpVar.g;
                    int i33 = org.telegram.messenger.wp.D8;
                    bpVar.g = i32 | 32;
                }
                h00.z0(bpVar, bpVar.g, bpVar.b, bpVar.c, bpVar.n, bpVar.m, bpVar.h, bpVar.i, bpVar.j, true, true, true, true, true, e10Var.e, new org.telegram.ui.Components.voip.u(21, e10Var, suggestedFilter));
                break;
            case 7:
                gf.f.r((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 8:
                org.telegram.ui.Components.d11 d11Var = (org.telegram.ui.Components.d11) this.b;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.c;
                d11Var.run();
                z2Var.dismiss();
                break;
            case 9:
                p20 p20Var = (p20) this.b;
                TextView textView = (TextView) this.c;
                a50 a50Var = p20Var.E;
                org.telegram.messenger.u3 u3Var = a50Var.R2;
                if (u3Var != null && u3Var.w) {
                    a50Var.J1(textView);
                    break;
                }
                break;
            case 10:
                new l40((Context) this.c, (bi.t0) this.b).show();
                break;
            case 11:
                r60 r60Var = (r60) this.b;
                org.telegram.ui.Components.fi0 fi0Var = (org.telegram.ui.Components.fi0) this.c;
                if (!zx.x4) {
                    zx.x4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.t6.I.q();
                    boolean z14 = !q6;
                    org.telegram.ui.ActionBar.s6 Q0 = !q6 ? org.telegram.ui.ActionBar.t6.Q0("Night") : org.telegram.ui.ActionBar.t6.Q0("Blue");
                    org.telegram.ui.ActionBar.t6.o = 0;
                    org.telegram.ui.ActionBar.t6.w1();
                    org.telegram.ui.ActionBar.t6.B();
                    org.telegram.ui.Components.ci0 ci0Var = r60Var.w;
                    ci0Var.P(!q6 ? ci0Var.e[0] - 1 : 0);
                    fi0Var.d();
                    int[] iArr = {(fi0Var.getMeasuredWidth() / 2) + r9, (fi0Var.getMeasuredHeight() / 2) + r9};
                    fi0Var.getLocationInWindow(iArr);
                    int i34 = iArr[0];
                    int i35 = iArr[1];
                    org.telegram.messenger.at.e().k(org.telegram.messenger.at.t4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z14), fi0Var);
                    fi0Var.setContentDescription(org.telegram.messenger.dd.L0(!q6 ? 2131754751 : 2131754750, null));
                    break;
                }
                break;
            case 12:
                d70 d70Var = (d70) this.b;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.c;
                d70Var.Q.dismiss();
                if (d70Var.f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i36 = d70Var.c0;
                    if (i36 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i36 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    zx zxVar3 = new zx(bundle);
                    zxVar3.C2 = new qv(d70Var, zxVar3);
                    k2Var.presentFragment(zxVar3);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, d70Var.c0);
                    x5 x5Var = new x5(bundle2);
                    x5Var.d = d70Var.f0;
                    x5Var.Z();
                    k2Var.presentFragment(x5Var);
                    break;
                }
            case 13:
                org.telegram.messenger.ad[] adVarArr = (org.telegram.messenger.ad[]) this.b;
                org.telegram.ui.Cells.t4[] t4VarArr = (org.telegram.ui.Cells.t4[]) this.c;
                Pattern pattern = LaunchActivity.D1;
                Integer num = (Integer) view.getTag();
                adVarArr[0] = ((org.telegram.ui.Cells.t4) view).getCurrentLocale();
                int i37 = 0;
                while (i37 < 2) {
                    t4VarArr[i37].a.a(i37 == num.intValue(), true);
                    i37++;
                }
                break;
            case 14:
                org.telegram.ui.Components.s4.x((Context) this.c, org.telegram.messenger.dd.L0(2131750878, null), org.telegram.messenger.dd.L0(2131745527, null), -1L, new ba0((la0) this.b, i12));
                break;
            case 15:
                la0 la0Var = (la0) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (la0Var.e == null) {
                    ia0 ia0Var = la0Var.f;
                    if (ia0Var.e.h) {
                        int i38 = -la0Var.M;
                        la0Var.M = i38;
                        org.telegram.messenger.i0.F3(i38, ia0Var, null);
                        break;
                    } else {
                        org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                        Switch r62 = t8Var.e;
                        t8Var.setChecked(!r62.h);
                        la0Var.r.setVisibility(r62.h ? 0 : 8);
                        org.telegram.messenger.i0.r(runnableArr[0]);
                        if (r62.h) {
                            la0Var.f.setChecked(false);
                            la0Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            la0Var.h.setText(org.telegram.messenger.dd.L0(2131754201, null));
                            ea0 ea0Var = new ea0(la0Var, i13);
                            runnableArr[0] = ea0Var;
                            org.telegram.messenger.i0.h3(ea0Var, 60L);
                            break;
                        } else {
                            la0Var.f.setCheckBoxIcon(0);
                            la0Var.h.setText(org.telegram.messenger.dd.L0(2131754202, null));
                            ea0 ea0Var2 = new ea0(la0Var, i11);
                            runnableArr[0] = ea0Var2;
                            org.telegram.messenger.i0.g3(ea0Var2);
                            break;
                        }
                    }
                }
                break;
            case 16:
                xb0 xb0Var = (xb0) this.b;
                xb0Var.D0((rb0) this.c);
                qb0 qb0Var = xb0Var.Q0;
                if (qb0Var != null) {
                    qb0Var.dismiss();
                    break;
                }
                break;
            case 17:
                tb0 tb0Var = (tb0) this.b;
                wb0 wb0Var = (wb0) this.c;
                xb0 xb0Var2 = tb0Var.b;
                xb0Var2.getClass();
                xb0Var2.N0.d(wb0Var.c, xb0Var2.O0, true, 0, 0L);
                xb0Var2.finishFragment();
                break;
            case 18:
                vc0 vc0Var = (vc0) this.b;
                Context context = (Context) this.c;
                String string = vc0Var.D.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.zz0 zz0Var = new org.telegram.ui.Components.zz0();
                    zz0Var.a |= 256;
                    zz0Var.b = indexOf;
                    int i39 = lastIndexOf + 1;
                    zz0Var.c = i39;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.a01(zz0Var, 0), indexOf, i39, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.R = org.telegram.messenger.dd.L0(2131748739, null);
                SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131748743, null));
                int i40 = vc0Var.G;
                int i41 = i40 / 86400;
                int i42 = i40 % 86400;
                int i43 = i42 / 3600;
                int i44 = (i42 % 3600) / 60;
                if (i41 == 0 && i43 == 0) {
                    i44 = Math.max(1, i44);
                }
                alertDialog$Builder.a.T = org.telegram.messenger.i0.m0(W2, spannableStringBuilder, (i41 == 0 || i43 == 0) ? (i43 == 0 || i44 == 0) ? i41 != 0 ? org.telegram.messenger.dd.a0(null, null, 2131748745, org.telegram.messenger.dd.G(i41, "Days", new Object[0])) : i43 != 0 ? org.telegram.messenger.dd.a0(null, null, 2131748745, org.telegram.messenger.dd.G(i41, "Hours", new Object[0])) : org.telegram.messenger.dd.a0(null, null, 2131748745, org.telegram.messenger.dd.G(i44, "Minutes", new Object[0])) : org.telegram.messenger.dd.a0(null, null, 2131748746, org.telegram.messenger.dd.G(i43, "Hours", new Object[0]), org.telegram.messenger.dd.G(i44, "Minutes", new Object[0])) : org.telegram.messenger.dd.a0(null, null, 2131748746, org.telegram.messenger.dd.G(i41, "Days", new Object[0]), org.telegram.messenger.dd.G(i43, "Hours", new Object[0])));
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131748747, null), new st(vc0Var, 18));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                alertDialog$Builder.p();
                break;
            case 19:
                dd0 dd0Var = (dd0) this.b;
                Context context2 = (Context) this.c;
                gf0 gf0Var = dd0Var.D;
                if (gf0Var.V.getTag() == null) {
                    if (dd0Var.n.has_recovery) {
                        gf0Var.w1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i10 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_requestPasswordRecovery, new bd0(dd0Var, i13), 10);
                        break;
                    } else {
                        org.telegram.messenger.i0.v1(dd0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                        alertDialog$Builder2.a.R = org.telegram.messenger.dd.L0(2131746088, null);
                        alertDialog$Builder2.a.T = org.telegram.messenger.dd.L0(2131746090, null);
                        alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131752041, null), null);
                        alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131746134, null), new st(dd0Var, 19));
                        alertDialog$Builder2.p();
                        break;
                    }
                }
                break;
            case 20:
                le0 le0Var = (le0) this.b;
                Context context3 = (Context) this.c;
                Bundle bundle3 = le0Var.q0;
                if (bundle3 != null && (tL_auth_sentCode = le0Var.r0) != null) {
                    le0Var.u0.p1(bundle3, tL_auth_sentCode, true);
                    break;
                } else if (!le0Var.f0) {
                    je0 je0Var = le0Var.w;
                    if ((je0Var == null || je0Var.getVisibility() == 8) && !le0Var.k0) {
                        if (le0Var.i0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = le0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = le0Var.c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) org.telegram.messenger.w0.b.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, true);
                            }
                            le0Var.u0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.a.R = org.telegram.messenger.dd.L0(2131746088, null);
                            alertDialog$Builder3.a.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131751446, le0Var.b));
                            alertDialog$Builder3.i(org.telegram.messenger.dd.L0(2131751447, null), new qv(23, le0Var, context3));
                            alertDialog$Builder3.k(org.telegram.messenger.dd.L0(2131752041, null), null);
                            alertDialog$Builder3.h(org.telegram.messenger.dd.L0(2131751449, null), new be0(le0Var, i13));
                            alertDialog$Builder3.p();
                            break;
                        } else if (le0Var.u0.V.getTag() == null) {
                            le0Var.v();
                            break;
                        }
                    }
                }
                break;
            case 21:
                ff0 ff0Var = (ff0) this.b;
                Context context4 = (Context) this.c;
                Toast toast = ff0Var.Q;
                if (toast != null) {
                    toast.cancel();
                    ff0Var.Q = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (ff0Var.O > 0 && currentTimeMillis - ff0Var.P > 1500) {
                    ff0Var.O = 0;
                }
                int i45 = ff0Var.O + 1;
                ff0Var.O = i45;
                ff0Var.P = currentTimeMillis;
                if (i45 >= 5) {
                    ff0Var.O = 0;
                    ff0Var.P = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ff0Var.getContext());
                    alertDialog$Builder4.a.R = org.telegram.messenger.dd.L0(2131745503, null);
                    alertDialog$Builder4.f(new String[]{org.telegram.messenger.dd.L0(org.telegram.messenger.v2.a ? 2131751640 : 2131751632, null), org.telegram.messenger.dd.L0(2131751614, null)}, new l4(ff0Var, i11));
                    alertDialog$Builder4.p();
                    break;
                } else if (i45 > 1) {
                    Toast makeText = Toast.makeText(context4, org.telegram.messenger.dd.G(5 - i45, "DebugMenuLoginToast", new Object[0]), 0);
                    ff0Var.Q = makeText;
                    makeText.show();
                    break;
                }
                break;
            case 22:
                oh0 oh0Var = (oh0) this.b;
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) this.c;
                qh0 qh0Var = oh0Var.d;
                if (!qh0Var.g0(kjVar)) {
                    qh0Var.getOrCreateStoryViewer().U(qh0Var.getParentActivity(), kjVar.l, th.n5.a(qh0Var.f));
                    break;
                }
                break;
            case 23:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                passcodeActivity.h.setInputType(1 | (atomicBoolean.get() ? org.telegram.messenger.at.a2 : 128));
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                org.telegram.ui.ActionBar.a7.t(passcodeActivity.s, atomicBoolean.get() ? org.telegram.ui.ActionBar.t6.l6 : org.telegram.ui.ActionBar.t6.H6, null, PorterDuff.Mode.SRC_ATOP);
                break;
            case 24:
                qm0.m0((qm0) this.b, (String) this.c, view);
                break;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.ui.Components.z60 z60Var2 = (org.telegram.ui.Components.z60) this.c;
                if (photoViewer.T4 != null) {
                    z60Var2.u();
                    org.telegram.ui.ActionBar.k2 k2Var2 = photoViewer.m4;
                    if (k2Var2 instanceof un) {
                        ((un) k2Var2).ea(photoViewer.T4, false, true);
                    }
                    gf.f.q(photoViewer.E, Uri.parse(photoViewer.T4.R0), true, false, false, null, null, false, org.telegram.messenger.wp.r1(photoViewer.T).e6, false);
                    break;
                }
                break;
            case 26:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Activity activity = (Activity) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.K1() && !photoViewer2.r) {
                    int i46 = photoViewer2.P4;
                    if (i46 >= 0 && i46 < photoViewer2.g7.size()) {
                        Object obj = photoViewer2.g7.get(photoViewer2.P4);
                        if (obj instanceof org.telegram.messenger.ff) {
                            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                            if (!ffVar.b || ffVar.d()) {
                                ffVar.z = Boolean.valueOf(!ffVar.c());
                                photoViewer2.j1.setPhotoState(ffVar.c());
                                boolean c12 = ffVar.c();
                                vh.p2 p2Var = photoViewer2.k1;
                                if (p2Var != null) {
                                    p2Var.e(true);
                                    photoViewer2.k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.k1 = new vh.p2(photoViewer2.E, 3);
                                    SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) org.telegram.messenger.dd.L0(c12 ? 2131747277 : 2131747276, null));
                                    append.setSpan(new org.telegram.ui.Components.dq(c12 ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                    photoViewer2.k1.s(append);
                                    photoViewer2.e0.addView(photoViewer2.k1, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.k1.m(0.0f, (photoViewer2.j1.getWidth() / 2.0f) + photoViewer2.j1.getX() + photoViewer2.H0.getX());
                                    vh.p2 p2Var2 = photoViewer2.k1;
                                    p2Var2.l0 = new eh(i11, p2Var2);
                                    p2Var2.d = 3500L;
                                    p2Var2.u();
                                }
                                org.telegram.messenger.uz.h1 = ffVar.c();
                                org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", org.telegram.messenger.uz.h1).apply();
                                break;
                            }
                        }
                    }
                    if (photoViewer2.j1.getTag() != null) {
                        photoViewer2.b3(true);
                        photoViewer2.s2(1);
                        break;
                    } else if (photoViewer2.k8) {
                        if (photoViewer2.m1 == null) {
                            zr0 zr0Var = photoViewer2.e0;
                            org.telegram.ui.Components.j11 j11Var = new org.telegram.ui.Components.j11(activity);
                            j11Var.d = new org.telegram.ui.Components.vo0(j11Var, 20);
                            j11Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(3.0f), -871296751));
                            j11Var.setTextColor(-1);
                            j11Var.setTextSize(1, 14.0f);
                            j11Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(7.0f));
                            j11Var.setGravity(16);
                            zr0Var.addView(j11Var, w7.b6.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                            j11Var.setVisibility(8);
                            photoViewer2.m1 = j11Var;
                        }
                        photoViewer2.m1.setText(org.telegram.messenger.dd.L0(2131743612, "VideoQualityIsTooLow"));
                        org.telegram.ui.Components.j11 j11Var2 = photoViewer2.m1;
                        org.telegram.ui.Components.j61 j61Var = photoViewer2.j1;
                        org.telegram.ui.Components.vo0 vo0Var = j11Var2.d;
                        if (j61Var != null) {
                            j11Var2.a = j61Var;
                            j11Var2.a();
                            j11Var2.c = true;
                            org.telegram.messenger.i0.r(vo0Var);
                            org.telegram.messenger.i0.h3(vo0Var, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = j11Var2.b;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                j11Var2.b.cancel();
                                j11Var2.b = null;
                            }
                            if (j11Var2.getVisibility() != 0) {
                                j11Var2.setAlpha(0.0f);
                                j11Var2.setVisibility(0);
                                ViewPropertyAnimator listener = j11Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                j11Var2.b = listener;
                                listener.start();
                                break;
                            }
                        }
                    }
                }
                break;
            case 27:
                ((org.telegram.ui.Components.z60) this.b).K((org.telegram.ui.Components.z60) this.c);
                break;
            case 28:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.N0.run();
                Integer num2 = (Integer) view.getTag();
                int i47 = num2.intValue() == 0 ? 30 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? org.telegram.messenger.at.M2 : num2.intValue() == 3 ? 365 : num2.intValue() == 4 ? 548 : num2.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, privacySettingsActivity.getParentActivity(), null);
                x1Var.i0 = false;
                x1Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i47;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new tp0(privacySettingsActivity, x1Var, setaccountttl, i11));
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                RectF rectF = ProfileActivity.S6;
                profileActivity.getClass();
                org.telegram.ui.Components.wb.e();
                gf.f.r(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
        }
    }
}
