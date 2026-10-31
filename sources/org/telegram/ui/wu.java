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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wu implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wu(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:358:0x0a41  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i10;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        long j10 = 0;
        char c10 = 16;
        int i11 = 20;
        ArrayList arrayList = null;
        int i12 = 2;
        int i13 = 0;
        int i14 = 1;
        switch (this.a) {
            case 0:
                zu zuVar = (zu) this.b;
                sh.b bVar = (sh.b) this.c;
                yu yuVar = zuVar.P1;
                org.telegram.ui.Components.ix0[] ix0VarArr = zuVar.T1;
                for (org.telegram.ui.Components.ix0 ix0Var : ix0VarArr) {
                    if (ix0Var != null) {
                        boolean z10 = ix0Var.c;
                    }
                }
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                int intValue = ((Integer) c2Var.getTag()).intValue();
                org.telegram.ui.Components.ix0 ix0Var2 = ix0VarArr[intValue];
                boolean z11 = ix0Var2.c;
                boolean z12 = !z11;
                if (z11 != z12) {
                    ix0Var2.c = z12;
                    ix0Var2.d = true;
                }
                c2Var.c(ix0Var2.c, true);
                boolean z13 = ix0VarArr[intValue].c;
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
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            if (((sh.a) arrayList.get(i15)).d == intValue) {
                                if (z13) {
                                    if (!hashSet.contains(arrayList.get(i15))) {
                                        hashSet.add((sh.a) arrayList.get(i15));
                                        bVar.g((sh.a) arrayList.get(i15), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i15))) {
                                    hashSet.remove(arrayList.get(i15));
                                    bVar.g((sh.a) arrayList.get(i15), false);
                                }
                            }
                        }
                    }
                    zuVar.W1.d();
                    zuVar.S1.a(yuVar.d(), true);
                    yuVar.c(true);
                    break;
                } else {
                    bVar.n = z13;
                }
                arrayList = arrayList2;
                if (arrayList != null) {
                }
                zuVar.W1.d();
                zuVar.S1.a(yuVar.d(), true);
                yuVar.c(true);
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
            case 2:
                ay ayVar = (ay) this.b;
                ayVar.C4((ArrayList) this.c, org.telegram.messenger.zs.n1, false, false, null);
                ayVar.finishPreviewFragment();
                break;
            case 3:
                yh.f0.e((org.telegram.ui.ActionBar.x1[]) this.c, r0, r0.currentAccount, ((ay) this.b).Z2);
                break;
            case 4:
                ay.H0((ay) this.b, (org.telegram.messenger.w1) this.c);
                break;
            case 5:
                ay ayVar2 = (ay) this.b;
                org.telegram.ui.Components.z60 z60Var = (org.telegram.ui.Components.z60) this.c;
                ayVar2.getClass();
                z60Var.u();
                ayVar2.presentFragment(new ProxyListActivity());
                break;
            case 6:
                f10 f10Var = (f10) this.b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((g10) this.c).getSuggestedFilter();
                org.telegram.messenger.ap apVar = new org.telegram.messenger.ap();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                apVar.b = tL_textWithEntities.text;
                apVar.c = tL_textWithEntities.entities;
                apVar.a = 2;
                while (f10Var.e.getMessagesController().S0.get(apVar.a) != null) {
                    apVar.a++;
                }
                apVar.f = f10Var.e.getMessagesController().S0().size();
                apVar.d = -1;
                apVar.e = -1;
                int i16 = 0;
                while (i16 < 2) {
                    TLRPC.DialogFilter dialogFilter = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList3 = i16 == 0 ? dialogFilter.include_peers : dialogFilter.exclude_peers;
                    ArrayList arrayList4 = i16 == 0 ? apVar.h : apVar.i;
                    long j11 = j10;
                    int size = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size) {
                        char c11 = c10;
                        TLRPC.InputPeer inputPeer = arrayList3.get(i17);
                        int i18 = r11;
                        int i19 = i16;
                        long j12 = inputPeer.user_id;
                        if (j12 == j11) {
                            long j13 = inputPeer.chat_id;
                            if (j13 == j11) {
                                j13 = inputPeer.channel_id;
                            }
                            j12 = -j13;
                        }
                        i17 = c3.i0.k(i17, 1, j12, arrayList4);
                        r11 = i18;
                        c10 = c11;
                        i16 = i19;
                    }
                    i16++;
                    j10 = j11;
                }
                TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                if (dialogFilter2.groups) {
                    int i20 = apVar.g;
                    int i21 = org.telegram.messenger.vp.D8;
                    apVar.g = i20 | 4;
                }
                if (dialogFilter2.bots) {
                    int i22 = apVar.g;
                    int i23 = org.telegram.messenger.vp.D8;
                    apVar.g = i22 | 16;
                }
                if (dialogFilter2.contacts) {
                    int i24 = apVar.g;
                    int i25 = org.telegram.messenger.vp.D8;
                    apVar.g = 1 | i24;
                }
                if (dialogFilter2.non_contacts) {
                    int i26 = apVar.g;
                    int i27 = org.telegram.messenger.vp.D8;
                    apVar.g = 2 | i26;
                }
                if (dialogFilter2.broadcasts) {
                    int i28 = apVar.g;
                    int i29 = org.telegram.messenger.vp.D8;
                    apVar.g = i28 | 8;
                }
                if (dialogFilter2.exclude_archived) {
                    int i30 = apVar.g;
                    int i31 = org.telegram.messenger.vp.D8;
                    apVar.g = i30 | 128;
                }
                if (dialogFilter2.exclude_read) {
                    int i32 = apVar.g;
                    int i33 = org.telegram.messenger.vp.D8;
                    apVar.g = i32 | 64;
                }
                if (dialogFilter2.exclude_muted) {
                    int i34 = apVar.g;
                    int i35 = org.telegram.messenger.vp.D8;
                    apVar.g = i34 | 32;
                }
                i00.y0(apVar, apVar.g, apVar.b, apVar.c, apVar.n, apVar.m, apVar.h, apVar.i, apVar.j, true, true, true, true, true, f10Var.e, new xs(i11, f10Var, suggestedFilter));
                break;
            case 7:
                gf.f.r((Context) this.b, ((TL_fragment.TL_collectibleInfo) this.c).url);
                break;
            case 8:
                org.telegram.ui.Components.c11 c11Var = (org.telegram.ui.Components.c11) this.b;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.c;
                c11Var.run();
                z2Var.dismiss();
                break;
            case 9:
                q20 q20Var = (q20) this.b;
                TextView textView = (TextView) this.c;
                b50 b50Var = q20Var.E;
                org.telegram.messenger.u3 u3Var = b50Var.R2;
                if (u3Var != null && u3Var.w) {
                    b50Var.J1(textView);
                    break;
                }
                break;
            case 10:
                new m40((Context) this.c, (bi.t0) this.b).show();
                break;
            case 11:
                s60 s60Var = (s60) this.b;
                org.telegram.ui.Components.ei0 ei0Var = (org.telegram.ui.Components.ei0) this.c;
                if (!ay.x4) {
                    ay.x4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.t6.I.q();
                    boolean z14 = !q6;
                    org.telegram.ui.ActionBar.s6 Q0 = !q6 ? org.telegram.ui.ActionBar.t6.Q0("Night") : org.telegram.ui.ActionBar.t6.Q0("Blue");
                    org.telegram.ui.ActionBar.t6.o = 0;
                    org.telegram.ui.ActionBar.t6.w1();
                    org.telegram.ui.ActionBar.t6.B();
                    org.telegram.ui.Components.bi0 bi0Var = s60Var.w;
                    bi0Var.P(!q6 ? bi0Var.e[0] - 1 : 0);
                    ei0Var.d();
                    int[] iArr = {(ei0Var.getMeasuredWidth() / 2) + r10, (ei0Var.getMeasuredHeight() / 2) + r10};
                    ei0Var.getLocationInWindow(iArr);
                    int i36 = iArr[0];
                    int i37 = iArr[1];
                    org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.t4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z14), ei0Var);
                    ei0Var.setContentDescription(org.telegram.messenger.cd.L0(!q6 ? 2131754751 : 2131754750, null));
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
                    int i38 = d70Var.c0;
                    if (i38 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i38 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    ay ayVar3 = new ay(bundle);
                    ayVar3.C2 = new rv(d70Var, ayVar3);
                    k2Var.presentFragment(ayVar3);
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, d70Var.c0);
                    x5 x5Var = new x5(bundle2);
                    x5Var.d = d70Var.f0;
                    x5Var.Y();
                    k2Var.presentFragment(x5Var);
                    break;
                }
            case 13:
                org.telegram.messenger.zc[] zcVarArr = (org.telegram.messenger.zc[]) this.b;
                org.telegram.ui.Cells.t4[] t4VarArr = (org.telegram.ui.Cells.t4[]) this.c;
                Pattern pattern = LaunchActivity.D1;
                Integer num = (Integer) view.getTag();
                zcVarArr[0] = ((org.telegram.ui.Cells.t4) view).getCurrentLocale();
                int i39 = 0;
                while (i39 < 2) {
                    t4VarArr[i39].a.a(i39 == num.intValue(), true);
                    i39++;
                }
                break;
            case 14:
                org.telegram.ui.Components.s4.x((Context) this.c, org.telegram.messenger.cd.L0(2131750878, null), org.telegram.messenger.cd.L0(2131745527, null), -1L, new ca0((ma0) this.b, i13));
                break;
            case 15:
                ma0 ma0Var = (ma0) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                if (ma0Var.e == null) {
                    ja0 ja0Var = ma0Var.f;
                    if (ja0Var.e.h) {
                        int i40 = -ma0Var.M;
                        ma0Var.M = i40;
                        org.telegram.messenger.i0.F3(i40, ja0Var, null);
                        break;
                    } else {
                        org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                        Switch r72 = t8Var.e;
                        t8Var.setChecked(!r72.h);
                        ma0Var.r.setVisibility(r72.h ? 0 : 8);
                        org.telegram.messenger.i0.r(runnableArr[0]);
                        if (r72.h) {
                            ma0Var.f.setChecked(false);
                            ma0Var.f.setCheckBoxIcon(R.drawable.permission_locked);
                            ma0Var.h.setText(org.telegram.messenger.cd.L0(2131754201, null));
                            fa0 fa0Var = new fa0(ma0Var, i14);
                            runnableArr[0] = fa0Var;
                            org.telegram.messenger.i0.h3(fa0Var, 60L);
                            break;
                        } else {
                            ma0Var.f.setCheckBoxIcon(0);
                            ma0Var.h.setText(org.telegram.messenger.cd.L0(2131754202, null));
                            fa0 fa0Var2 = new fa0(ma0Var, i12);
                            runnableArr[0] = fa0Var2;
                            org.telegram.messenger.i0.g3(fa0Var2);
                            break;
                        }
                    }
                }
                break;
            case 16:
                yb0 yb0Var = (yb0) this.b;
                yb0Var.C0((sb0) this.c);
                rb0 rb0Var = yb0Var.Q0;
                if (rb0Var != null) {
                    rb0Var.dismiss();
                    break;
                }
                break;
            case 17:
                ub0 ub0Var = (ub0) this.b;
                xb0 xb0Var = (xb0) this.c;
                yb0 yb0Var2 = ub0Var.b;
                yb0Var2.getClass();
                yb0Var2.N0.d(xb0Var.c, yb0Var2.O0, true, 0, 0L);
                yb0Var2.finishFragment();
                break;
            case 18:
                wc0 wc0Var = (wc0) this.b;
                Context context = (Context) this.c;
                String string = wc0Var.D.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    org.telegram.ui.Components.yz0 yz0Var = new org.telegram.ui.Components.yz0();
                    yz0Var.a |= 256;
                    yz0Var.b = indexOf;
                    int i41 = lastIndexOf + 1;
                    yz0Var.c = i41;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.zz0(yz0Var, 0), indexOf, i41, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(2131748739, null);
                SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131748743, null));
                int i42 = wc0Var.G;
                int i43 = i42 / 86400;
                int i44 = i42 % 86400;
                int i45 = i44 / 3600;
                int i46 = (i44 % 3600) / 60;
                if (i43 == 0 && i45 == 0) {
                    i46 = Math.max(1, i46);
                }
                alertDialog$Builder.a.T = org.telegram.messenger.i0.m0(W2, spannableStringBuilder, (i43 == 0 || i45 == 0) ? (i45 == 0 || i46 == 0) ? i43 != 0 ? org.telegram.messenger.cd.a0(null, null, 2131748745, org.telegram.messenger.cd.G(i43, "Days", new Object[0])) : i45 != 0 ? org.telegram.messenger.cd.a0(null, null, 2131748745, org.telegram.messenger.cd.G(i43, "Hours", new Object[0])) : org.telegram.messenger.cd.a0(null, null, 2131748745, org.telegram.messenger.cd.G(i46, "Minutes", new Object[0])) : org.telegram.messenger.cd.a0(null, null, 2131748746, org.telegram.messenger.cd.G(i45, "Hours", new Object[0]), org.telegram.messenger.cd.G(i46, "Minutes", new Object[0])) : org.telegram.messenger.cd.a0(null, null, 2131748746, org.telegram.messenger.cd.G(i43, "Days", new Object[0]), org.telegram.messenger.cd.G(i45, "Hours", new Object[0])));
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131748747, null), new tt(wc0Var, 18));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                alertDialog$Builder.p();
                break;
            case 19:
                ed0 ed0Var = (ed0) this.b;
                Context context2 = (Context) this.c;
                hf0 hf0Var = ed0Var.D;
                if (hf0Var.V.getTag() == null) {
                    if (ed0Var.n.has_recovery) {
                        hf0Var.v1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_requestPasswordRecovery, new cd0(ed0Var, i14), 10);
                        break;
                    } else {
                        org.telegram.messenger.i0.v1(ed0Var.a);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                        alertDialog$Builder2.a.R = org.telegram.messenger.cd.L0(2131746088, null);
                        alertDialog$Builder2.a.T = org.telegram.messenger.cd.L0(2131746090, null);
                        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131752041, null), null);
                        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131746134, null), new tt(ed0Var, 19));
                        alertDialog$Builder2.p();
                        break;
                    }
                }
                break;
            case 20:
                me0 me0Var = (me0) this.b;
                Context context3 = (Context) this.c;
                Bundle bundle3 = me0Var.q0;
                if (bundle3 != null && (tL_auth_sentCode = me0Var.r0) != null) {
                    me0Var.u0.o1(bundle3, tL_auth_sentCode, true);
                    break;
                } else if (!me0Var.f0) {
                    ke0 ke0Var = me0Var.w;
                    if ((ke0Var == null || ke0Var.getVisibility() == 8) && !me0Var.k0) {
                        if (me0Var.i0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = me0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = me0Var.c;
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
                            me0Var.u0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.a.R = org.telegram.messenger.cd.L0(2131746088, null);
                            alertDialog$Builder3.a.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131751446, me0Var.b));
                            alertDialog$Builder3.i(org.telegram.messenger.cd.L0(2131751447, null), new rv(23, me0Var, context3));
                            alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131752041, null), null);
                            alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131751449, null), new ce0(me0Var, i14));
                            alertDialog$Builder3.p();
                            break;
                        } else if (me0Var.u0.V.getTag() == null) {
                            me0Var.v();
                            break;
                        }
                    }
                }
                break;
            case 21:
                gf0 gf0Var = (gf0) this.b;
                Context context4 = (Context) this.c;
                Toast toast = gf0Var.Q;
                if (toast != null) {
                    toast.cancel();
                    gf0Var.Q = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (gf0Var.O > 0 && currentTimeMillis - gf0Var.P > 1500) {
                    gf0Var.O = 0;
                }
                int i47 = gf0Var.O + 1;
                gf0Var.O = i47;
                gf0Var.P = currentTimeMillis;
                if (i47 >= 5) {
                    gf0Var.O = 0;
                    gf0Var.P = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(gf0Var.getContext());
                    alertDialog$Builder4.a.R = org.telegram.messenger.cd.L0(2131745503, null);
                    alertDialog$Builder4.f(new String[]{org.telegram.messenger.cd.L0(org.telegram.messenger.v2.a ? 2131751640 : 2131751632, null), org.telegram.messenger.cd.L0(2131751614, null)}, new l4(gf0Var, i12));
                    alertDialog$Builder4.p();
                    break;
                } else if (i47 > 1) {
                    Toast makeText = Toast.makeText(context4, org.telegram.messenger.cd.G(5 - i47, "DebugMenuLoginToast", new Object[0]), 0);
                    gf0Var.Q = makeText;
                    makeText.show();
                    break;
                }
                break;
            case 22:
                qh0 qh0Var = (qh0) this.b;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.c;
                sh0 sh0Var = qh0Var.d;
                if (!sh0Var.f0(jjVar)) {
                    sh0Var.getOrCreateStoryViewer().U(sh0Var.getParentActivity(), jjVar.l, th.n5.a(sh0Var.f));
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
                passcodeActivity.h.setInputType((atomicBoolean.get() ? 144 : 128) | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                org.telegram.ui.ActionBar.a7.t(passcodeActivity.s, atomicBoolean.get() ? org.telegram.ui.ActionBar.t6.l6 : org.telegram.ui.ActionBar.t6.H6, null, PorterDuff.Mode.SRC_ATOP);
                break;
            case 24:
                sm0.l0((sm0) this.b, (String) this.c, view);
                break;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.ui.Components.z60 z60Var2 = (org.telegram.ui.Components.z60) this.c;
                if (photoViewer.T4 != null) {
                    z60Var2.u();
                    org.telegram.ui.ActionBar.k2 k2Var2 = photoViewer.m4;
                    if (k2Var2 instanceof un) {
                        ((un) k2Var2).Z9(photoViewer.T4, false, true);
                    }
                    gf.f.q(photoViewer.E, Uri.parse(photoViewer.T4.R0), true, false, false, null, null, false, org.telegram.messenger.vp.r1(photoViewer.T).e6, false);
                    break;
                }
                break;
            case 26:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                Activity activity = (Activity) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.K1() && !photoViewer2.r) {
                    int i48 = photoViewer2.P4;
                    if (i48 >= 0 && i48 < photoViewer2.g7.size()) {
                        Object obj = photoViewer2.g7.get(photoViewer2.P4);
                        if (obj instanceof org.telegram.messenger.ef) {
                            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                            if (!efVar.b || efVar.d()) {
                                efVar.z = Boolean.valueOf(!efVar.c());
                                photoViewer2.j1.setPhotoState(efVar.c());
                                boolean c12 = efVar.c();
                                vh.p2 p2Var = photoViewer2.k1;
                                if (p2Var != null) {
                                    p2Var.e(true);
                                    photoViewer2.k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.k1 = new vh.p2(photoViewer2.E, 3);
                                    SpannableStringBuilder append = new SpannableStringBuilder("x ").append((CharSequence) org.telegram.messenger.cd.L0(c12 ? 2131747277 : 2131747276, null));
                                    append.setSpan(new org.telegram.ui.Components.dq(c12 ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled, 0), 0, 1, 33);
                                    photoViewer2.k1.s(append);
                                    photoViewer2.e0.addView(photoViewer2.k1, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.k1.m(0.0f, (photoViewer2.j1.getWidth() / 2.0f) + photoViewer2.j1.getX() + photoViewer2.H0.getX());
                                    vh.p2 p2Var2 = photoViewer2.k1;
                                    p2Var2.l0 = new hh(i12, p2Var2);
                                    p2Var2.d = 3500L;
                                    p2Var2.u();
                                }
                                org.telegram.messenger.tz.h1 = efVar.c();
                                org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", org.telegram.messenger.tz.h1).apply();
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
                            as0 as0Var = photoViewer2.e0;
                            org.telegram.ui.Components.i11 i11Var = new org.telegram.ui.Components.i11(activity);
                            i11Var.d = new org.telegram.ui.Components.uo0(i11Var, i11);
                            i11Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(3.0f), -871296751));
                            i11Var.setTextColor(-1);
                            i11Var.setTextSize(1, 14.0f);
                            i11Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(7.0f));
                            i11Var.setGravity(16);
                            as0Var.addView(i11Var, w7.b6.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                            i11Var.setVisibility(8);
                            photoViewer2.m1 = i11Var;
                        }
                        photoViewer2.m1.setText(org.telegram.messenger.cd.L0(2131743612, "VideoQualityIsTooLow"));
                        org.telegram.ui.Components.i11 i11Var2 = photoViewer2.m1;
                        org.telegram.ui.Components.i61 i61Var = photoViewer2.j1;
                        org.telegram.ui.Components.uo0 uo0Var = i11Var2.d;
                        if (i61Var != null) {
                            i11Var2.a = i61Var;
                            i11Var2.a();
                            i11Var2.c = true;
                            org.telegram.messenger.i0.r(uo0Var);
                            org.telegram.messenger.i0.h3(uo0Var, 2000L);
                            ViewPropertyAnimator viewPropertyAnimator = i11Var2.b;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.setListener(null);
                                i11Var2.b.cancel();
                                i11Var2.b = null;
                            }
                            if (i11Var2.getVisibility() != 0) {
                                i11Var2.setAlpha(0.0f);
                                i11Var2.setVisibility(0);
                                ViewPropertyAnimator listener = i11Var2.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                i11Var2.b = listener;
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
                int i49 = num2.intValue() == 0 ? 30 : num2.intValue() == 1 ? 90 : num2.intValue() == 2 ? org.telegram.messenger.zs.M2 : num2.intValue() == 3 ? 365 : num2.intValue() == 4 ? 548 : num2.intValue() == 5 ? 730 : 0;
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, privacySettingsActivity.getParentActivity(), null);
                x1Var.i0 = false;
                x1Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i49;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new vp0(privacySettingsActivity, x1Var, setaccountttl, i12));
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                RectF rectF = ProfileActivity.R6;
                profileActivity.getClass();
                org.telegram.ui.Components.wb.e();
                gf.f.r(profileActivity.getParentActivity(), tL_collectibleInfo.url);
                break;
        }
    }
}
