package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z6 implements org.telegram.ui.Components.rj0, org.telegram.ui.Components.ci0, org.telegram.ui.Components.z4, org.telegram.messenger.nc, u4, org.telegram.ui.ActionBar.r1, org.telegram.messenger.or, org.telegram.ui.Components.pj0, ww, oa1, org.telegram.ui.Components.voip.c3, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z6(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean G() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.z4
    public void O(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 2:
                bn bnVar = (bn) this.b;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.c;
                Long l10 = (Long) this.d;
                bnVar.getClass();
                bnVar.Hb(botInlineResult, z10, i7, l10.longValue());
                break;
            case 3:
            default:
                bn bnVar2 = (bn) this.b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.c;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.d;
                bnVar2.getClass();
                if (z10) {
                    cg.a m10 = cg.a.m(suggestedPost != null ? suggestedPost.price : null);
                    long j3 = i7;
                    TLRPC.SuggestedPost suggestedPost2 = new TLRPC.SuggestedPost();
                    if (m10 != null && !m10.l()) {
                        suggestedPost2.price = m10.q();
                    }
                    if (j3 > 0) {
                        suggestedPost2.schedule_date = (int) j3;
                        suggestedPost2.flags |= 1;
                    }
                    if (fjVar != null && fjVar.k != null) {
                        bnVar2.getMessagesController().h(fjVar, suggestedPost2);
                        break;
                    }
                }
                break;
            case 4:
                bn.C0((bn) this.b, (org.telegram.messenger.aj) this.c, (org.telegram.messenger.fj) this.d, i7, i10);
                break;
        }
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean P(cx cxVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.messenger.nc
    public void a(String str) {
        bn bnVar = (bn) this.b;
        org.telegram.ui.Cells.g0 g0Var = (org.telegram.ui.Cells.g0) this.c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = org.telegram.messenger.gd.E0().y.getLanguage();
        if (str == null || ((str.equals(language) && !str.equals("und")) || sy0.d0().contains(str))) {
            g0Var.setClickable(false);
        } else {
            g0Var.setOnClickListener(new fi.d0(bnVar, str, language, charSequence, g0Var, 7));
        }
    }

    @Override // org.telegram.ui.Components.ci0
    public void b(org.telegram.ui.Components.ei0 ei0Var, int i7) {
        int i10;
        View view = (View) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(ei0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
            i10 = view.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        } else {
            i10 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.f3.C(52.0f, i10, i7), true);
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.u4
    public void c(c5 c5Var) {
        switch (this.a) {
            case 6:
                mm mmVar = (mm) this.b;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = c5Var.ordinal();
                if (ordinal == 0) {
                    mmVar.o(user, false);
                    break;
                } else if (ordinal == 3) {
                    mmVar.k(q1Var, user);
                    break;
                } else if (ordinal == 4) {
                    mmVar.d(user);
                    break;
                } else if (ordinal == 5) {
                    mmVar.a.Pa(user);
                    break;
                }
                break;
            default:
                mm mmVar2 = (mm) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.d;
                int ordinal2 = c5Var.ordinal();
                if (ordinal2 == 0) {
                    mmVar2.n(chat);
                    break;
                } else if (ordinal2 != 1 && ordinal2 != 2) {
                    if (ordinal2 == 4) {
                        mmVar2.a(chat);
                        break;
                    } else if (ordinal2 == 5) {
                        mmVar2.a.Na(chat);
                        break;
                    }
                } else {
                    mmVar2.j(q1Var2, chat, 0, false);
                    break;
                }
                break;
        }
    }

    public boolean d(TLRPC.Message message) {
        ml0 ml0Var = (ml0) this.b;
        org.telegram.ui.ActionBar.s4 s4Var = (org.telegram.ui.ActionBar.s4) this.c;
        Activity activity = (Activity) this.d;
        if (org.telegram.messenger.fj.B1(message.peer_id) != ml0Var.m0.id || !(message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            return false;
        }
        org.telegram.messenger.g0.g3(new jg0(ml0Var, s4Var, activity, message, 2));
        return true;
    }

    @Override // org.telegram.ui.Components.pj0
    public void f(float f10, float f11, int i7, View view) {
        f40.J0((f40) this.b, (Activity) this.c, (org.telegram.messenger.t3) this.d, view, i7);
    }

    @Override // org.telegram.ui.Components.voip.c3
    public void g(org.telegram.ui.Components.voip.d3 d3Var) {
        hc1 hc1Var = (hc1) this.b;
        VoIPService voIPService = (VoIPService) this.c;
        org.telegram.ui.Components.voip.e3 e3Var = (org.telegram.ui.Components.voip.e3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            org.telegram.messenger.g0.r(hc1Var.S0);
            hc1Var.R0 = false;
            if (hc1Var.w0.isTouchExplorationEnabled()) {
                d3Var.announceForAccessibility(voIPService.isFrontFaceCamera() ? org.telegram.messenger.gd.M0(2131754731, null) : org.telegram.messenger.gd.M0(2131754730, null));
            }
            e3Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        String str;
        int i10;
        switch (this.a) {
            case 8:
                go goVar = (go) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                View view = (View) this.d;
                jo joVar = goVar.a.i3;
                if (tL_username.editable) {
                    if (joVar.s0 == null) {
                        joVar.s0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = joVar.Y;
                    tL_inputChannel.channel_id = chat.id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z10 = tL_username.active;
                    tL_channels_toggleUsername.active = !z10;
                    joVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new di.j3(goVar, tL_channels_toggleUsername, tL_username, z10, 5));
                    joVar.Q.add(tL_username.username);
                    ((ia) view).setLoading(true);
                }
                joVar.b0();
                break;
            case 9:
                vo voVar = (vo) this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                voVar.getClass();
                if (chatFull.hidden_prehistory) {
                    voVar.getMessagesController().n5(chat2.id, false);
                }
                voVar.d0(chat2, null);
                break;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                g61 g61Var = (g61) this.b;
                if (org.telegram.ui.ActionBar.n6.l0(((i61) this.c).d, (org.telegram.ui.ActionBar.k6) this.d, true)) {
                    org.telegram.ui.ActionBar.n6.t1(false, false);
                    org.telegram.ui.ActionBar.n6.K1(org.telegram.ui.ActionBar.n6.I, g61Var.e.f == 1, -1, null);
                    break;
                }
                break;
            case 11:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                EditText editText = (EditText) this.d;
                if (editText != null) {
                    contactsActivity.getClass();
                    str = editText.getText().toString();
                } else {
                    str = "0";
                }
                contactsActivity.l0(user, false, str);
                break;
            case 12:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.b;
                String str2 = (String) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                org.telegram.messenger.bz.h0 = str2;
                org.telegram.messenger.bz.y();
                org.telegram.messenger.bz.b = false;
                dataSettingsActivity.s0(dataSettingsActivity.n);
                org.telegram.messenger.ec.D().i(new bt(dataSettingsActivity, 2));
                alertDialog$Builder.a.M0.run();
                break;
            case 13:
                iy iyVar = (iy) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                alertDialog$Builder2.a.M0.run();
                ky kyVar = iyVar.F.c;
                kyVar.d.title = editTextBoldCursor.getText().toString();
                kyVar.i0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = kyVar.d;
                if (kyVar.F != 0) {
                    kyVar.getConnectionsManager().cancelRequest(kyVar.F, true);
                    kyVar.F = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = kyVar.c.a;
                tL_chatlists_editExportedInvite.slug = kyVar.g0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags |= 2;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                kyVar.F = kyVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new xx(kyVar, 1));
                org.telegram.messenger.x10 x10Var = kyVar.y;
                if (x10Var != null) {
                    x10Var.a(tL_exportedChatlistInvite);
                    break;
                }
                break;
            case 15:
                k30 k30Var = (k30) this.b;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                AlertDialog$Builder alertDialog$Builder3 = (AlertDialog$Builder) this.d;
                org.telegram.messenger.g0.v1(editTextBoldCursor2);
                org.telegram.messenger.t3 t3Var = k30Var.b.V2;
                String obj = editTextBoldCursor2.getText().toString();
                t3Var.getClass();
                TL_phone.editGroupCallTitle editgroupcalltitle = new TL_phone.editGroupCallTitle();
                editgroupcalltitle.call = t3Var.g(t3Var.a);
                editgroupcalltitle.title = obj;
                ConnectionsManager.getInstance(t3Var.C.a).sendRequest(editgroupcalltitle, new org.telegram.messenger.m3(t3Var, 1));
                alertDialog$Builder3.a.M0.run();
                break;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, arrayList, arrayList2, false));
                break;
            case 21:
                l21 l21Var = (l21) this.b;
                w21 w21Var = (w21) this.c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i10 = ((org.telegram.ui.ActionBar.h2) w21Var.a).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(resetauthorization, new e00(28, w21Var, tL_authorization));
                l21Var.d.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.oa1
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((b21) this.b).f1((TLRPC.User) this.c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        a8.r7 r7Var = (a8.r7) this.b;
        hi.d dVar = (hi.d) this.c;
        int[] iArr = (int[]) this.d;
        org.telegram.messenger.a8.b("wear-auth: /answer delivered to " + ((String) r7Var.d));
        int i7 = 0;
        dVar.setLoading(false);
        int i10 = iArr[0];
        ArrayList arrayList = (ArrayList) r7Var.f;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
        org.telegram.ui.ActionBar.i6 resourceProvider = T != null ? T.getResourceProvider() : null;
        org.telegram.ui.ActionBar.x2 x2Var = yc1.c;
        if (x2Var != null) {
            x2Var.dismiss();
            yc1.c = null;
        }
        org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.f3.j(1, context, resourceProvider, false);
        xc1 xc1Var = new xc1(context);
        j3.O = xc1Var;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        xc1Var.addView(g10, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
        TextView b10 = c8.va.b(context, 20.0f, org.telegram.ui.ActionBar.n6.j5, true, resourceProvider);
        org.telegram.messenger.f3.k(b10, 17, null, 2131742689);
        g10.addView(b10, c8.ma.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        while (i7 < arrayList.size()) {
            org.telegram.messenger.f6 f10 = org.telegram.messenger.j6.f((String) arrayList.get(i7));
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(f10);
            org.telegram.messenger.ks.i(imageView);
            int L = org.telegram.messenger.g0.L(80.0f);
            int i11 = org.telegram.ui.ActionBar.n6.Fi;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.r1(0.15f, org.telegram.ui.ActionBar.n6.w0(i11, resourceProvider)));
            org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.15f, i11);
            imageView.setBackground(L2);
            org.telegram.ui.ActionBar.u6.j(imageView, L2, K, null, resourceProvider);
            linearLayout.addView(imageView, c8.ma.k(i7 == 0 ? 0.0f : 5.0f, 0.0f, 0.0f, 0.0f, 80, 80));
            i7++;
        }
        g10.addView(linearLayout, c8.ma.t(-2, -2, 49, 32, 12, 32, 12));
        hi.d g11 = org.telegram.messenger.n10.g(24, context, resourceProvider, true);
        g11.setText(org.telegram.messenger.gd.M0(2131742688, null));
        g10.addView(g11, c8.ma.t(-1, 48, 7, 12, 12, 12, 8));
        int i12 = org.telegram.ui.ActionBar.n6.a7;
        j3.w0(i12);
        j3.Q(i12);
        yc1.c = j3;
        j3.show();
        g11.setOnClickListener(new bi.f5(g11, i10, j3, 23));
    }

    @Override // org.telegram.messenger.or
    public void run(long j3) {
        np.f0((np) this.b, (TLRPC.InputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j3);
    }

    @Override // org.telegram.ui.ww
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        long j3;
        int i11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i12 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i12) {
            case 18:
                ArrayList arrayList2 = (ArrayList) obj2;
                bn bnVar = (bn) obj;
                PhotoViewer photoViewer = ((ro0) obj3).b;
                if (arrayList.size() > 1 || ((org.telegram.messenger.sr) arrayList.get(0)).a == org.telegram.messenger.j10.i(photoViewer.U).e() || charSequence != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        long j10 = ((org.telegram.messenger.sr) arrayList.get(i13)).a;
                        if (charSequence != null) {
                            j3 = j10;
                            org.telegram.messenger.zy.C(photoViewer.U).r0(org.telegram.messenger.xy.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j3 = j10;
                        }
                        org.telegram.messenger.zy.C(photoViewer.U).q0(arrayList2, j3, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                    }
                    cxVar.finishFragment();
                    if (bnVar != null) {
                        bnVar.h8();
                        UndoView undoView = bnVar.N3;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.m(((org.telegram.messenger.sr) arrayList.get(0)).a, Integer.valueOf(arrayList2.size()), 53);
                                break;
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
                                break;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.sr srVar = (org.telegram.messenger.sr) arrayList.get(0);
                    long j11 = srVar.a;
                    Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                    if (org.telegram.messenger.n5.C(j11)) {
                        k10.putInt("enc_id", (int) (j11 & 4294967295L));
                    } else if (org.telegram.messenger.n5.E(j11)) {
                        k10.putLong("user_id", j11);
                    } else {
                        k10.putLong("chat_id", -j11);
                    }
                    bn bnVar2 = new bn(k10);
                    if (srVar.b != 0) {
                        qg.c.a(bnVar2, srVar);
                    }
                    if (((LaunchActivity) photoViewer.E).u0(bnVar2, true, false)) {
                        bnVar2.hc(arrayList2);
                        break;
                    } else {
                        cxVar.finishFragment();
                        break;
                    }
                }
                break;
            default:
                rv0 rv0Var = (rv0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                cx cxVar2 = (cx) obj;
                long j12 = ((org.telegram.messenger.sr) arrayList.get(0)).a;
                ProfileActivity profileActivity = rv0Var.b;
                i11 = ((org.telegram.ui.ActionBar.h2) profileActivity).currentAccount;
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(-j12));
                if (O0 == null || (!O0.creator && ((tL_chatAdminRights = O0.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                    String M0 = org.telegram.messenger.gd.M0(2131754461, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.S = M0;
                    u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("AddMembersAlertNamesText", null, 2131754397, org.telegram.messenger.o10.q(user), O0 == null ? "" : O0.title));
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131754461, null), new bg.f0(rv0Var, j12, cxVar, user, 6));
                    profileActivity.showDialog(u1Var);
                    break;
                } else {
                    profileActivity.getMessagesController().K(O0, user, new di.h(rv0Var, j12, cxVar2, 9));
                    break;
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.rj0
    public boolean f(float f10, float f11, int i7, final View view) {
        String str;
        final c7 c7Var = (c7) this.b;
        org.telegram.ui.Components.ck0 ck0Var = (org.telegram.ui.Components.ck0) this.c;
        x6 x6Var = (x6) this.d;
        s7 s7Var = c7Var.f;
        e7 e7Var = (e7) ck0Var.getAdapter();
        final l7 l7Var = (l7) e7Var.e.get(i7);
        final int i10 = 1;
        if (!(view instanceof j7) && !(view instanceof org.telegram.ui.Cells.o7)) {
            h7 h7Var = s7Var.G;
            if (h7Var != null) {
                h7Var.m(l7Var.c, l7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(s7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.o7) {
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, org.telegram.messenger.gd.M0(2131752637, null), false, null).setOnClickListener(new fi.d0(c7Var, l7Var, e7Var, ck0Var, view, 5));
            str = null;
        } else {
            final int i11 = 0;
            if (((j7) view).b.getChildAt(0) instanceof org.telegram.ui.Cells.g7) {
                str = null;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, org.telegram.messenger.gd.M0(2131747027, null), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.a7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                c7 c7Var2 = c7Var;
                                s7.b(c7Var2.f, l7Var.d, (j7) view);
                                org.telegram.ui.ActionBar.h1 h1Var = c7Var2.a;
                                if (h1Var != null) {
                                    h1Var.d(true);
                                    break;
                                }
                                break;
                            default:
                                c7 c7Var3 = c7Var;
                                s7.b(c7Var3.f, l7Var.d, (j7) view);
                                org.telegram.ui.ActionBar.h1 h1Var2 = c7Var3.a;
                                if (h1Var2 != null) {
                                    h1Var2.d(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
            } else {
                str = null;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, org.telegram.messenger.gd.M0(2131752637, null), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.a7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i10) {
                            case 0:
                                c7 c7Var2 = c7Var;
                                s7.b(c7Var2.f, l7Var.d, (j7) view);
                                org.telegram.ui.ActionBar.h1 h1Var = c7Var2.a;
                                if (h1Var != null) {
                                    h1Var.d(true);
                                    break;
                                }
                                break;
                            default:
                                c7 c7Var3 = c7Var;
                                s7.b(c7Var3.f, l7Var.d, (j7) view);
                                org.telegram.ui.ActionBar.h1 h1Var2 = c7Var3.a;
                                if (h1Var2 != null) {
                                    h1Var2.d(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
        ei.b bVar = l7Var.d;
        if (bVar.b != 0 && bVar.g != 0) {
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, org.telegram.messenger.gd.M0(2131743315, str), false, null).setOnClickListener(new y(c7Var, l7Var, x6Var, i10));
        }
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, org.telegram.messenger.gd.M0(!s7Var.h.j.contains(l7Var.d) ? 2131745477 : 2131751447, str), false, null).setOnClickListener(new ni.b(8, c7Var, l7Var));
        c7Var.a = org.telegram.ui.Components.b5.N(x6Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f10, (int) f11);
        s7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void r(float f10) {
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
