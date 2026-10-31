package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ud(int i10, Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        this.a = i10;
        this.c = k2Var;
        this.b = context;
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [org.telegram.ui.ActionBar.p6, org.telegram.ui.ActionBar.w6] */
    /* JADX WARN: Type inference failed for: r11v6 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int N;
        Activity parentActivity;
        int b10;
        View view2;
        int i10 = this.a;
        int i11 = 7;
        int i12 = 4;
        int i13 = -1;
        int i14 = 2;
        ?? r11 = 0;
        final int i15 = 0;
        final int i16 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                gf.f.r((Context) obj2, ((TL_stats.TL_broadcastRevenueTransactionWithdrawal) obj).transaction_url);
                break;
            case 1:
                un unVar = (un) obj2;
                if (unVar.getMediaDataController().V1(((org.telegram.messenger.jj) obj).F0())) {
                    unVar.Y7();
                    UndoView undoView = unVar.M3;
                    if (undoView != null) {
                        long j10 = unVar.j6;
                        int i17 = UndoView.i0;
                        undoView.j(83, j10, new j4(unVar, 1));
                    }
                }
                unVar.I7(true);
                break;
            case 2:
                un.l0((un) obj2, (String) obj);
                break;
            case 3:
                un.c0((un) obj2, (org.telegram.ui.Components.z60) obj);
                break;
            case 4:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) obj2;
                boolean z10 = !c2Var.b();
                c2Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                break;
            case 5:
                un.q1((un) obj, (Context) obj2);
                break;
            case 6:
                oo ooVar = (oo) obj;
                Context context = (Context) obj2;
                l2.f fVar = new l2.f(context, (org.telegram.ui.ActionBar.p6) null);
                ((org.telegram.ui.ActionBar.z2) fVar.b).u0 = false;
                LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
                org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context, org.telegram.ui.ActionBar.t6.n5, 23, 15, false, null);
                p4Var.setHeight(47);
                p4Var.setText(org.telegram.messenger.cd.L0(2131752233, "ChatHistory"));
                f7.addView(p4Var);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                f7.addView(linearLayout, w7.b6.o(-1, -2));
                org.telegram.ui.Cells.l6[] l6VarArr = new org.telegram.ui.Cells.l6[2];
                int i18 = 0;
                while (i18 < i14) {
                    org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(context, true);
                    l6VarArr[i18] = l6Var;
                    l6Var.setTag(Integer.valueOf(i18));
                    org.telegram.ui.ActionBar.a7.R(l6VarArr[i18], org.telegram.ui.ActionBar.t6.N0(false), r11, org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6), r11);
                    if (i18 == 0) {
                        l6VarArr[i18].b(org.telegram.messenger.cd.L0(2131752228, "ChatHistoryVisible"), org.telegram.messenger.cd.L0(2131752227, "ChatHistoryVisibleInfo"), true, !ooVar.J0);
                    } else if (org.telegram.messenger.w3.T(ooVar.w0)) {
                        l6VarArr[i18].b(org.telegram.messenger.cd.L0(2131752232, "ChatHistoryHidden"), org.telegram.messenger.cd.L0(2131752231, "ChatHistoryHiddenInfo"), false, ooVar.J0);
                    } else {
                        l6VarArr[i18].b(org.telegram.messenger.cd.L0(2131752232, "ChatHistoryHidden"), org.telegram.messenger.cd.L0(2131752230, "ChatHistoryHiddenInfo2"), false, ooVar.J0);
                    }
                    linearLayout.addView(l6VarArr[i18], w7.b6.o(-1, -2));
                    l6VarArr[i18].setOnClickListener(new x(ooVar, l6VarArr, fVar, 8));
                    i18++;
                    i14 = 2;
                    r11 = 0;
                }
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar.b;
                z2Var.N = f7;
                ooVar.showDialog(z2Var);
                break;
            case 7:
                oo.Y((oo) obj2, (FrameLayout) obj, view);
                break;
            case 8:
                iq.Z((iq) obj2, (l2.f) obj, view);
                break;
            case 9:
                new kg.i1(42, ((org.telegram.ui.Components.g0) obj2).getContext(), (org.telegram.ui.ActionBar.p6) obj).show();
                break;
            case 10:
                final org.telegram.ui.Components.z zVar = (org.telegram.ui.Components.z) obj2;
                final org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj;
                org.telegram.ui.Cells.m3 m3Var = zVar.T1;
                org.telegram.ui.Cells.m3 m3Var2 = zVar.S1;
                org.telegram.ui.Components.ep epVar = zVar.V1;
                vh.d dVar = zVar.Y1;
                if (!dVar.Q) {
                    if (dVar.c0) {
                        dVar.setLoading(true);
                        if (zVar.b2 != null) {
                            TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
                            updatetone.flags |= 1;
                            updatetone.display_author = epVar.a.q;
                            updatetone.tone = TL_aicompose.InputAiComposeTone.from(zVar.b2);
                            updatetone.flags |= 2;
                            updatetone.emoji_id = zVar.Z1.longValue();
                            updatetone.flags |= 4;
                            updatetone.title = m3Var2.getText().toString();
                            updatetone.flags |= 8;
                            updatetone.prompt = m3Var.getText().toString();
                            ConnectionsManager.getInstance(zVar.a).sendRequestTyped(updatetone, new a3.b(i16), new org.telegram.messenger.j20() { // from class: org.telegram.ui.Components.u
                                @Override // org.telegram.messenger.j20
                                public final void a(Object obj3, Object obj4) {
                                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj3;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                                    switch (i15) {
                                        case 0:
                                            z zVar2 = zVar;
                                            zVar2.Y1.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    org.telegram.ui.Cells.f1.s(zVar2.X1, p6Var, tL_error, false);
                                                    break;
                                                }
                                            } else {
                                                f fVar2 = zVar2.d2;
                                                if (fVar2 != null) {
                                                    fVar2.a(aiComposeTone);
                                                }
                                                zVar2.dismiss();
                                                break;
                                            }
                                            break;
                                        default:
                                            z zVar3 = zVar;
                                            FrameLayout frameLayout = zVar3.X1;
                                            zVar3.Y1.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                                    org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                                                    if (!equalsIgnoreCase) {
                                                        org.telegram.ui.Cells.f1.s(frameLayout, p6Var2, tL_error, false);
                                                        break;
                                                    } else {
                                                        g0.t1(new cc(frameLayout, p6Var2), zVar3.a);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                zVar3.dismiss();
                                                f fVar3 = zVar3.c2;
                                                if (fVar3 != null) {
                                                    fVar3.a(aiComposeTone);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
                            createtone.display_author = epVar.a.q;
                            createtone.emoji_id = zVar.Z1.longValue();
                            createtone.title = m3Var2.getText().toString();
                            createtone.prompt = m3Var.getText().toString();
                            ConnectionsManager.getInstance(zVar.a).sendRequestTyped(createtone, new a3.b(i16), new org.telegram.messenger.j20() { // from class: org.telegram.ui.Components.u
                                @Override // org.telegram.messenger.j20
                                public final void a(Object obj3, Object obj4) {
                                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj3;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                                    switch (i16) {
                                        case 0:
                                            z zVar2 = zVar;
                                            zVar2.Y1.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    org.telegram.ui.Cells.f1.s(zVar2.X1, p6Var, tL_error, false);
                                                    break;
                                                }
                                            } else {
                                                f fVar2 = zVar2.d2;
                                                if (fVar2 != null) {
                                                    fVar2.a(aiComposeTone);
                                                }
                                                zVar2.dismiss();
                                                break;
                                            }
                                            break;
                                        default:
                                            z zVar3 = zVar;
                                            FrameLayout frameLayout = zVar3.X1;
                                            zVar3.Y1.setLoading(false);
                                            if (aiComposeTone == null) {
                                                if (tL_error != null) {
                                                    boolean equalsIgnoreCase = "TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text);
                                                    org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                                                    if (!equalsIgnoreCase) {
                                                        org.telegram.ui.Cells.f1.s(frameLayout, p6Var2, tL_error, false);
                                                        break;
                                                    } else {
                                                        g0.t1(new cc(frameLayout, p6Var2), zVar3.a);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                zVar3.dismiss();
                                                f fVar3 = zVar3.c2;
                                                if (fVar3 != null) {
                                                    fVar3.a(aiComposeTone);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    } else if (zVar.Z1 == null) {
                        zVar.d1();
                        break;
                    }
                }
                break;
            case 11:
                ((org.telegram.messenger.q20) obj2).a((TL_aicompose.AiComposeTone) obj);
                break;
            case 12:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) obj2;
                org.telegram.ui.Components.p4 p4Var2 = (org.telegram.ui.Components.p4) obj;
                t0Var.U(null, null);
                t0Var.O(p4Var2.d, false);
                t0Var.setupPopupRadialSelectors(p4Var2.f);
                t0Var.H(p4Var2.e);
                break;
            case 13:
                boolean[] zArr = (boolean[]) obj2;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                ((org.telegram.ui.Cells.c2) view).c(z11, true);
                ((kp) obj).run();
                break;
            case 14:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).a.N0.run();
                ((cu) obj).onClick(null, intValue);
                break;
            case 15:
                ((org.telegram.ui.ActionBar.z2) ((l2.f) obj2).b).x0.run();
                ((org.telegram.messenger.q20) obj).a(null);
                break;
            case 16:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                break;
            case 17:
                org.telegram.ui.Components.w7 w7Var = (org.telegram.ui.Components.w7) obj2;
                float[] fArr = (float[]) obj;
                float f10 = MediaController.B().q0;
                boolean z12 = false;
                int i19 = 0;
                while (true) {
                    if (i19 < 3) {
                        if (f10 - 0.1f <= fArr[i19]) {
                            i13 = i19;
                        } else {
                            i19++;
                        }
                    }
                }
                int i20 = i13 + 1;
                if (i20 >= 3) {
                    i20 = 0;
                }
                MediaController.B().m0(true, fArr[i20]);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - w7Var.G2 > 300) {
                    int i21 = org.telegram.messenger.vp.e1().getInt("speedhint", 0) + 1;
                    if (i21 > 2) {
                        i21 = -10;
                    }
                    org.telegram.messenger.vp.e1().edit().putInt("speedhint", i21).apply();
                    if (i21 >= 0 && w7Var.b != null) {
                        ij ijVar = new ij(5, 1, w7Var.getContext(), null, z12);
                        w7Var.F2 = ijVar;
                        ijVar.setExtraTranslationY(org.telegram.messenger.i0.L(6.0f));
                        w7Var.F2.setText(org.telegram.messenger.cd.L0(2131745287, null));
                        w7Var.u1.addView(w7Var.F2, w7.b6.d(-2, -2.0f, 48, 0.0f, 0.0f, 6.0f, 0.0f));
                        w7Var.F2.f(w7Var.L1, true);
                    }
                }
                w7Var.G2 = currentTimeMillis;
                break;
            case 18:
                org.telegram.ui.Components.w7 w7Var2 = (org.telegram.ui.Components.w7) obj2;
                w7Var2.getClass();
                ((org.telegram.ui.Components.z60) obj).u();
                w7Var2.P0(6);
                break;
            case 19:
                org.telegram.ui.Components.h90 h90Var = (org.telegram.ui.Components.h90) obj;
                org.telegram.ui.Components.w7 w7Var3 = (org.telegram.ui.Components.w7) ((org.telegram.ui.Components.o7) obj2).F;
                int i22 = w7Var3.a;
                LaunchActivity launchActivity = w7Var3.w2;
                ArrayList arrayList = (ArrayList) org.telegram.messenger.vp.r1(i22).w.get(0);
                if ((arrayList != null ? arrayList.size() : 0) > 10 && !TextUtils.isEmpty(h90Var.getText().toString())) {
                    String charSequence = h90Var.getText().toString();
                    if (launchActivity.M().getLastFragment() instanceof ay) {
                        ay ayVar = (ay) launchActivity.M().getLastFragment();
                        ArrayList arrayList2 = (ArrayList) ayVar.getMessagesController().w.get(0);
                        int size = arrayList2 != null ? arrayList2.size() : 0;
                        if (!ayVar.l2 && (size > 10 || ayVar.K)) {
                            i16 = 0;
                        }
                        if (i16 == 0) {
                            if (ayVar.j2) {
                                ayVar.X.r.setText(charSequence);
                                ayVar.X.r.setSelection(charSequence.length());
                                kx kxVar = ayVar.C0;
                                if (kxVar != null && (N = kxVar.N(3)) >= 0 && ayVar.C0.getTabsView().getCurrentTabId() != N) {
                                    ayVar.C0.getTabsView().d(N, N);
                                }
                            } else {
                                ayVar.y = 3;
                                ayVar.X.r.setText(charSequence);
                                ayVar.X.r.setSelection(charSequence.length());
                            }
                            w7Var3.dismiss();
                            break;
                        }
                    }
                    ay ayVar2 = new ay(null);
                    ayVar2.n2 = charSequence;
                    ayVar2.y = 3;
                    launchActivity.u0(ayVar2, false, false);
                    w7Var3.dismiss();
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.o8 o8Var = (org.telegram.ui.Components.o8) obj2;
                ((boolean[]) obj)[0] = true;
                o8Var.J.z1(o8Var.Y);
                o8Var.S.dismiss();
                break;
            case 21:
                org.telegram.ui.Components.nc ncVar = (org.telegram.ui.Components.nc) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.z60 z60Var = ncVar.W0;
                if (z60Var == null || !z60Var.D()) {
                    ncVar.c1.e(true);
                    org.telegram.ui.Components.z60 F = org.telegram.ui.Components.z60.F(frameLayout, new th.b(), ncVar.U0);
                    ncVar.W0 = F;
                    F.s = 0;
                    F.p(13, org.telegram.messenger.i0.L(200.0f), org.telegram.messenger.cd.L0(2131744160, null));
                    ncVar.W0.k();
                    int[] iArr = ncVar.b1;
                    int length = iArr.length;
                    for (int i23 = 0; i23 < length; i23++) {
                        int i24 = iArr[i23];
                        ncVar.W0.c(0, i24 == 0 ? org.telegram.messenger.cd.L0(2131744161, null) : i24 == Integer.MAX_VALUE ? org.telegram.messenger.cd.L0(2131744159, null) : org.telegram.messenger.cd.G(i24, "Seconds", new Object[0]), new ag.d3(ncVar, i24, 27), false);
                        if (ncVar.a1 == i24) {
                            ncVar.W0.L();
                        }
                    }
                    ncVar.W0.Z();
                    break;
                } else {
                    ncVar.W0.u();
                    ncVar.W0 = null;
                    break;
                }
            case 22:
                org.telegram.ui.Components.bl.V((org.telegram.ui.Components.bl) obj2, (org.telegram.ui.ActionBar.p6) obj);
                break;
            case 23:
                org.telegram.ui.Components.yk ykVar = (org.telegram.ui.Components.yk) obj2;
                org.telegram.ui.Components.al alVar = (org.telegram.ui.Components.al) obj;
                org.telegram.ui.Components.bl blVar = ykVar.b;
                org.telegram.ui.Components.bi biVar = blVar.b;
                un unVar2 = (un) biVar.W1;
                if (unVar2.c()) {
                    parentActivity = blVar.getParentActivity();
                    org.telegram.ui.Components.s4.L(parentActivity, unVar2.a(), new org.telegram.ui.Components.f2(i11, ykVar, alVar), blVar.a);
                    break;
                } else {
                    org.telegram.ui.Components.s4.Z(biVar.D3, biVar.W0() + 1, biVar.a1(), new org.telegram.ui.Components.vg(i12, ykVar, alVar));
                    break;
                }
            case 24:
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) ((fg.j) obj2).e;
                w71 w71Var = jnVar.s;
                View F2 = w71Var.F((org.telegram.ui.Components.hn) obj);
                s4.c1 T = F2 != null ? w71Var.T(F2) : null;
                if (T != null && (b10 = T.b() - jnVar.t0) >= 0 && b10 < jnVar.K.length) {
                    org.telegram.ui.Components.jn.R(jnVar, b10);
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.sn snVar = (org.telegram.ui.Components.sn) obj2;
                org.telegram.ui.ActionBar.p6 p6Var2 = (org.telegram.ui.ActionBar.p6) obj;
                un unVar3 = snVar.G;
                if (snVar.T) {
                    unVar3.showDialog(org.telegram.ui.Components.s4.U(snVar.getContext(), unVar3.h, p6Var2).a);
                    break;
                } else {
                    org.telegram.ui.Components.on onVar = snVar.e;
                    if (unVar3.getParentActivity() != null) {
                        TLRPC.Chat chat = unVar3.e;
                        if (chat == null || org.telegram.messenger.w3.y(13, chat)) {
                            TLRPC.ChatFull chatFull = unVar3.p8;
                            TLRPC.UserFull userFull = unVar3.q8;
                            int i25 = userFull != null ? userFull.ttl_period : chatFull != null ? chatFull.ttl_period : 0;
                            m4.n0 n0Var = new m4.n0(snVar.getContext(), null, new org.telegram.ui.Components.pn(snVar, r4), true, 0, snVar.d0);
                            n0Var.t(i25);
                            org.telegram.ui.Components.qn qnVar = new org.telegram.ui.Components.qn(snVar, (ActionBarPopupWindow$ActionBarPopupWindowLayout) n0Var.a);
                            org.telegram.ui.ActionBar.k1[] k1VarArr = {qnVar};
                            qnVar.e = true;
                            qnVar.c = org.telegram.messenger.zs.x3;
                            qnVar.setOutsideTouchable(true);
                            k1VarArr[0].setClippingEnabled(true);
                            k1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                            k1VarArr[0].setFocusable(true);
                            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) n0Var.a).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
                            k1VarArr[0].setInputMethodMode(2);
                            k1VarArr[0].getContentView().setFocusableInTouchMode(true);
                            k1VarArr[0].showAtLocation(onVar, 0, (int) (snVar.getX() + onVar.getX()), (int) onVar.getY());
                            unVar3.o8(false, true, 0.2f);
                            break;
                        } else if (snVar.a.f && unVar3.getParentActivity() != null && unVar3.fragmentView != null && unVar3.p8 != null) {
                            if (unVar3.C2 == null) {
                                org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(7, unVar3.getParentActivity(), unVar3.xa, true);
                                unVar3.C2 = q30Var;
                                q30Var.setAlpha(0.0f);
                                unVar3.C2.setVisibility(4);
                                unVar3.C2.setShowingDuration(4000L);
                                unVar3.l1.addView(unVar3.C2, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i26 = unVar3.p8.ttl_period;
                            unVar3.C2.setText(org.telegram.messenger.cd.a0("AutoDeleteSetInfo", null, 2131753844, i26 > 86400 ? org.telegram.messenger.cd.G(i26 / 86400, "Days", new Object[0]) : i26 >= 3600 ? org.telegram.messenger.cd.G(i26 / 3600, "Hours", new Object[0]) : i26 >= 60 ? org.telegram.messenger.cd.G(i26 / 60, "Minutes", new Object[0]) : org.telegram.messenger.cd.G(i26, "Seconds", new Object[0])));
                            unVar3.C2.f(unVar3.o1.getTimeItem(), true);
                            break;
                        }
                    }
                }
                break;
            case 26:
                org.telegram.ui.Components.dp dpVar = (org.telegram.ui.Components.dp) obj2;
                un unVar4 = (un) obj;
                if (dpVar.m1 != null) {
                    dpVar.m1 = null;
                    dpVar.dismiss();
                    org.telegram.messenger.g4.f(dpVar.a).a(unVar4.a(), true, false);
                    break;
                } else {
                    dpVar.dismiss();
                    break;
                }
            case 27:
                org.telegram.ui.Components.cr crVar = (org.telegram.ui.Components.cr) obj2;
                crVar.R1 = org.telegram.messenger.vp.r1(crVar.a).i1(org.telegram.messenger.jj.C1((TLRPC.Peer) obj));
                crVar.dismiss();
                break;
            case 28:
                org.telegram.ui.Components.lr lrVar = (org.telegram.ui.Components.lr) obj2;
                String str = (String) obj;
                if (lrVar.b == null && (view2 = lrVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        lrVar.b = (EditText) findFocus;
                    }
                }
                if (lrVar.b != null) {
                    try {
                        lrVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = lrVar.b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).v(true, false);
                    }
                    Editable text = lrVar.b.getText();
                    int length2 = lrVar.b.getSelectionEnd() == lrVar.b.length() ? -1 : str.length() + lrVar.b.getSelectionStart();
                    if (lrVar.b.getSelectionStart() == -1 || lrVar.b.getSelectionEnd() == -1) {
                        lrVar.b.setText(str);
                        EditText editText2 = lrVar.b;
                        editText2.setSelection(editText2.length());
                    } else {
                        EditText editText3 = lrVar.b;
                        editText3.setText(text.replace(editText3.getSelectionStart(), lrVar.b.getSelectionEnd(), str));
                        EditText editText4 = lrVar.b;
                        if (length2 == -1) {
                            length2 = editText4.length();
                        }
                        editText4.setSelection(length2);
                    }
                    EditText editText5 = lrVar.b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).v(false, true);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Components.vr vrVar = (org.telegram.ui.Components.vr) obj2;
                org.telegram.ui.Components.ur urVar = (org.telegram.ui.Components.ur) obj;
                vrVar.X0();
                urVar.f = !urVar.f;
                urVar.j.P1.O(true);
                vrVar.I0();
                break;
        }
    }

    public /* synthetic */ ud(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
