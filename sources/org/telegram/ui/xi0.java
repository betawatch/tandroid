package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class xi0 implements org.telegram.ui.ActionBar.q1, ss, org.telegram.ui.Components.r4, org.telegram.messenger.j9, org.telegram.messenger.pi, org.telegram.ui.Components.hj0, org.telegram.ui.Components.ij0, mr0, org.telegram.messenger.nr, ex0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xi0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 9:
                fr0 fr0Var = (fr0) this.b;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.c;
                nr0 nr0Var = fr0Var.a;
                nr0Var.f0.a(tL_messageMediaToDo);
                nr0Var.finishFragment();
                break;
            default:
                fr0 fr0Var2 = (fr0) this.b;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.c;
                nr0 nr0Var2 = fr0Var2.a;
                nr0Var2.f0.a(tL_messageMediaPoll);
                nr0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.mr0
    public void a(TLRPC.MessageMedia messageMedia) {
        e81 e81Var = (e81) this.b;
        an anVar = (an) this.c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = e81Var.H.k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        e81Var.H.k.media = messageMedia;
        anVar.getSendMessagesHelper().t(e81Var.H, null, null, null, null, null, null, null, false, false, null);
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        final c61 c61Var = (c61) this.b;
        final e61 e61Var = (e61) this.c;
        ThemeActivity themeActivity = c61Var.e;
        if (i7 >= 0 && i7 < e61Var.e.size()) {
            final org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) e61Var.e.get(i7);
            if (g6Var.a >= 100 && !g6Var.z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131747797, "OpenInEditor");
                String M02 = org.telegram.messenger.hd.M0(2131745426, "ShareTheme");
                TLRPC.TL_theme tL_theme = g6Var.r;
                CharSequence[] charSequenceArr = {M0, M02, (tL_theme == null || !tL_theme.creator) ? null : org.telegram.messenger.hd.M0(2131744145, "ThemeSetUrl"), org.telegram.messenger.hd.M0(2131751486, "DeleteTheme")};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.x51
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        c61 c61Var2 = c61.this;
                        ThemeActivity themeActivity2 = c61Var2.e;
                        if (themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                        if (i10 == 0) {
                            org.telegram.ui.Components.t4.T(themeActivity2, i10 != 1 ? 1 : 2, g6Var2.b, g6Var2);
                            return;
                        }
                        if (i10 == 1) {
                            if (g6Var2.r == null) {
                                themeActivity2.getMessagesController().y4(g6Var2.b, g6Var2);
                                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.s4, g6Var2.b, g6Var2);
                                return;
                            }
                            String str = "https://" + themeActivity2.getMessagesController().V2 + "/addtheme/" + g6Var2.r.slug;
                            themeActivity2.showDialog(new org.telegram.ui.Components.po0(themeActivity2.getParentActivity(), null, str, false, str, false, null));
                            return;
                        }
                        if (i10 == 2) {
                            themeActivity2.presentFragment(new w71(g6Var2.b, g6Var2, false));
                            return;
                        }
                        if (i10 != 3 || themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                        String M03 = org.telegram.messenger.hd.M0(2131751484, "DeleteThemeTitle");
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.a;
                        t1Var.S = M03;
                        t1Var.U = org.telegram.messenger.hd.M0(2131751485, "DeleteThemeAlert");
                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131751598, "Delete"), new a7(c61Var2, e61Var, g6Var2, 22));
                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                        themeActivity2.showDialog(t1Var);
                        TextView textView = (TextView) t1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
                        }
                    }
                };
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.Q = charSequenceArr;
                t1Var.R = iArr;
                t1Var.N = onClickListener;
                themeActivity.showDialog(t1Var);
                t1Var.m(t1Var.O0.size() - 1, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.q7, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.p7, false));
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.pi
    public void c(String str, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        Runnable runnable = (Runnable) this.c;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (!((org.telegram.messenger.oi) arrayList.get(i7)).a.startsWith("animated_")) {
                    String c10 = org.telegram.messenger.j6.c(((org.telegram.messenger.oi) arrayList.get(i7)).a);
                    if (org.telegram.messenger.j6.g(c10) != null) {
                        linkedHashSet.add(c10);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ex0
    public void d(qh0 qh0Var) {
        x91 x91Var = (x91) this.b;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.c;
        aa1 aa1Var = x91Var.a;
        aa1Var.e.add(Integer.valueOf(tL_forumTopic.id));
        aa1Var.a0();
    }

    @Override // org.telegram.ui.ss
    public void e(ps psVar) {
        ek0 ek0Var = (ek0) this.b;
        int intValue = ((Integer) ((View) this.c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = ek0Var.Z[intValue];
        if (intValue == 5) {
            ek0Var.s = psVar.d;
        } else {
            ek0Var.w = psVar.d;
        }
        editTextBoldCursor.setText(psVar.a);
    }

    @Override // org.telegram.ui.Components.hj0
    public void f(float f10, float f11, int i7, View view) {
        ThemeActivity.b0((ThemeActivity) this.b, (Context) this.c, view, i7, f10);
    }

    public File g() {
        switch (this.a) {
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                TLObject tLObject = (TLObject) this.c;
                org.telegram.messenger.w7.G(photoViewer.U);
                return org.telegram.messenger.w7.J(tLObject, null, true, true);
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                org.telegram.messenger.w7.G(photoViewer2.U);
                return org.telegram.messenger.w7.M(message, false, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i10;
        boolean z10;
        org.telegram.ui.ActionBar.o4 o4Var;
        int i11 = this.a;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                ek0 ek0Var = (ek0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!ek0Var.w0) {
                    ek0Var.t1.clear();
                }
                ek0Var.u1.clear();
                jj0 jj0Var = (jj0) ek0Var.C1;
                jj0Var.d.n1(ek0Var.F, ek0Var.G, ek0Var.H, zArr[0], null, null, jj0Var.b);
                ek0Var.finishFragment();
                break;
            case 1:
                int[] iArr = ((ek0) obj2).y;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(org.telegram.messenger.hd.M0(2131747494, null));
                break;
            case 2:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 16:
            case 17:
            case 20:
            case 21:
            case 23:
            case 24:
            case 25:
            default:
                org.telegram.ui.Wallet.p8 p8Var = (org.telegram.ui.Wallet.p8) obj2;
                p8Var.getClass();
                t1Var.dismiss();
                org.telegram.ui.Wallet.f8 f8Var = new org.telegram.ui.Wallet.f8();
                f8Var.r = !((Boolean) obj).booleanValue();
                p8Var.presentFragment(f8Var);
                break;
            case 3:
                ek0.Z((ek0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                break;
            case 4:
                jl0 jl0Var = (jl0) obj2;
                jl0Var.c0 = true;
                jl0Var.b0.email_unconfirmed_pattern = (String) obj;
                jl0Var.P0();
                break;
            case 7:
                PhotoViewer.u(((oo0) obj2).b, (ArrayList) obj);
                break;
            case 8:
                boolean[] zArr2 = (boolean[]) obj;
                PhotoViewer photoViewer = ((oo0) obj2).b;
                sq0 sq0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.a7;
                ArrayList arrayList3 = photoViewer.d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!sq0Var.N()) {
                    photoViewer.z0(false, false);
                    break;
                } else if (!arrayList4.isEmpty()) {
                    int i13 = photoViewer.P4;
                    if (i13 >= 0 && i13 < arrayList4.size()) {
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList4.get(photoViewer.P4);
                        if (gjVar.q4()) {
                            photoViewer.z0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i14 = photoViewer.w;
                            if (i14 != 0) {
                                arrayList7.add(Integer.valueOf(i14));
                            } else {
                                arrayList7.add(Integer.valueOf(gjVar.e1()));
                            }
                            if (!org.telegram.messenger.m5.C(org.telegram.messenger.gj.B0(gjVar.k)) || gjVar.k.random_id == 0) {
                                arrayList = null;
                                encryptedChat = null;
                            } else {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(gjVar.k.random_id));
                                arrayList = arrayList8;
                                encryptedChat = org.telegram.messenger.np.s1(photoViewer.U).a1(Integer.valueOf((int) (org.telegram.messenger.gj.B0(gjVar.k) & 4294967295L)));
                            }
                            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(photoViewer.U);
                            long B0 = org.telegram.messenger.gj.B0(gjVar.k);
                            int I1 = org.telegram.messenger.gj.I1(gjVar.k);
                            boolean z11 = zArr2[0];
                            if (gjVar.r1) {
                                i10 = 1;
                            } else {
                                if (org.telegram.messenger.gj.d5(gjVar.k)) {
                                    i12 = 9;
                                } else if (org.telegram.messenger.gj.b4(gjVar.k)) {
                                    i12 = 5;
                                }
                                i10 = i12;
                            }
                            s12.Z(arrayList7, arrayList, encryptedChat, B0, I1, z11, i10);
                            break;
                        }
                    }
                } else if (!arrayList6.isEmpty()) {
                    int i15 = photoViewer.P4;
                    if (i15 >= 0 && i15 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.P4);
                        if (message != null) {
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.add(Integer.valueOf(message.id));
                            org.telegram.messenger.np.s1(photoViewer.U).Z(arrayList9, null, null, org.telegram.messenger.gj.B0(message), message.quick_reply_shortcut_id, true, 0);
                            org.telegram.messenger.ns.f(photoViewer.U).k(39, new Object[0]);
                        }
                        if (!photoViewer.G1()) {
                            TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                            if (photo != null) {
                                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                tL_inputPhoto.id = photo.id;
                                tL_inputPhoto.access_hash = photo.access_hash;
                                byte[] bArr = photo.file_reference;
                                tL_inputPhoto.file_reference = bArr;
                                if (bArr == null) {
                                    tL_inputPhoto.file_reference = new byte[0];
                                }
                                if (photoViewer.z5 > 0) {
                                    org.telegram.messenger.np.s1(photoViewer.U).l0(tL_inputPhoto);
                                }
                                org.telegram.messenger.vr a02 = org.telegram.messenger.vr.a0(photoViewer.U);
                                a02.a.c(new org.telegram.messenger.sp(4, photoViewer.z5, photo.id, a02));
                                arrayList2.remove(photoViewer.P4);
                                photoViewer.c7.remove(photoViewer.P4);
                                photoViewer.b7.remove(photoViewer.P4);
                                arrayList3.remove(photoViewer.P4);
                                arrayList6.remove(photoViewer.P4);
                                if (arrayList2.isEmpty()) {
                                    photoViewer.z0(false, false);
                                } else {
                                    int i16 = photoViewer.P4;
                                    if (i16 >= arrayList6.size()) {
                                        i16 = arrayList6.size() - 1;
                                    }
                                    photoViewer.P4 = -1;
                                    photoViewer.z2(i16);
                                }
                                if (message == null) {
                                    org.telegram.messenger.ns.f(photoViewer.U).k(39, new Object[0]);
                                    break;
                                }
                            }
                        } else {
                            if (photoViewer.z5 > 0) {
                                org.telegram.messenger.np.s1(photoViewer.U).l0(null);
                            } else {
                                org.telegram.messenger.np.s1(photoViewer.U).B(-photoViewer.z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.z0(false, false);
                            break;
                        }
                    }
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.P4);
                    photoViewer.d.B(photoViewer.P4);
                    if (!arrayList5.isEmpty()) {
                        int i17 = photoViewer.P4;
                        if (i17 >= arrayList5.size()) {
                            i17 = arrayList5.size() - 1;
                        }
                        photoViewer.P4 = -1;
                        photoViewer.z2(i17);
                        break;
                    } else {
                        photoViewer.z0(false, false);
                        break;
                    }
                }
                break;
            case 12:
                ((PrivacyControlActivity) obj2).E0();
                ((SharedPreferences) obj).edit().putBoolean("privacyAlertShowed", true).commit();
                break;
            case 13:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr3 = privacySettingsActivity.a0;
                tL_payments_clearSavedInfo.credentials = zArr3[1];
                tL_payments_clearSavedInfo.info = zArr3[0];
                privacySettingsActivity.getUserConfig().y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new b00(22, privacySettingsActivity, (org.telegram.ui.Cells.q8) obj));
                break;
            case 14:
                ProfileActivity.p0((ProfileActivity) obj2, (org.telegram.ui.Cells.c2[]) obj);
                break;
            case 15:
                pv0 pv0Var = (pv0) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                pv0Var.getClass();
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = pv0Var.b;
                RectF rectF = ProfileActivity.X6;
                profileActivity.getContactsController().i(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.G5(false, false);
                    break;
                }
                break;
            case 18:
                x11 x11Var = (x11) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    x11Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    a7 a7Var = new a7(x11Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.a0 = 0;
                    twoStepVerificationActivity.c0 = a7Var;
                    T.presentFragment(twoStepVerificationActivity);
                    break;
                }
                break;
            case 19:
                ThemeActivity.c0((ThemeActivity) obj2, (fy0) obj);
                break;
            case 22:
                c61 c61Var = (c61) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                c61Var.getClass();
                org.telegram.messenger.np.s1(i6Var.F).x4(i6Var, null, i6Var == org.telegram.ui.ActionBar.j6.J, true);
                HashMap hashMap = org.telegram.ui.ActionBar.j6.H;
                if (i6Var.b == null) {
                    z10 = false;
                } else {
                    if (org.telegram.ui.ActionBar.j6.I == i6Var) {
                        org.telegram.ui.ActionBar.j6.u(org.telegram.ui.ActionBar.j6.L, true, false);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i6Var == org.telegram.ui.ActionBar.j6.J) {
                        org.telegram.ui.ActionBar.j6.J = (org.telegram.ui.ActionBar.i6) hashMap.get("Dark Blue");
                    }
                    i6Var.t();
                    org.telegram.ui.ActionBar.j6.G.remove(i6Var);
                    hashMap.remove(i6Var.a);
                    org.telegram.ui.ActionBar.b6 b6Var = i6Var.j0;
                    if (b6Var != null) {
                        org.telegram.ui.ActionBar.b6.a(b6Var);
                    }
                    org.telegram.ui.ActionBar.j6.F.remove(i6Var);
                    new File(i6Var.b).delete();
                    org.telegram.ui.ActionBar.j6.y1(true, false);
                }
                if (z10) {
                    o4Var = ((org.telegram.ui.ActionBar.e2) c61Var.e).parentLayout;
                    ((ActionBarLayout) o4Var).X(true, true);
                }
                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.o4, new Object[0]);
                break;
            case 26:
                xa1.b0((xa1) obj2, (byte[]) obj);
                break;
            case 27:
                ec1 ec1Var = (ec1) obj2;
                ((boolean[]) obj)[0] = true;
                ec1Var.p0 = 17;
                Intent intent = new Intent(ec1Var.b, (Class<?>) VoIPService.class);
                intent.putExtra("user_id", ec1Var.d.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", ec1Var.a);
                try {
                    ec1Var.b.startService(intent);
                    break;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
        }
    }

    @Override // org.telegram.messenger.nr
    public void j(boolean z10) {
        f91 f91Var = (f91) this.b;
        TLRPC.Chat chat = (TLRPC.Chat) this.c;
        u91 u91Var = f91Var.b;
        org.telegram.messenger.ns notificationCenter = u91Var.getNotificationCenter();
        int i7 = org.telegram.messenger.ns.t;
        notificationCenter.n(u91Var, i7);
        u91Var.getNotificationCenter().k(i7, new Object[0]);
        u91Var.finishFragment();
        u91Var.getNotificationCenter().k(org.telegram.messenger.ns.K2, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.j9
    public Object o(Object obj) {
        qs0 qs0Var = (qs0) this.b;
        ps0 ps0Var = (ps0) this.c;
        PremiumPreviewFragment premiumPreviewFragment = qs0Var.d.n;
        premiumPreviewFragment.o0.d(0, 0.0f, 0, ps0Var.getMeasuredWidth(), -ps0Var.getTier().h, premiumPreviewFragment.P);
        return premiumPreviewFragment.o0.f;
    }

    public /* synthetic */ xi0(fr0 fr0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.a = 10;
        this.b = fr0Var;
        this.c = tL_messageMediaPoll;
    }

    @Override // org.telegram.ui.ex0
    public /* synthetic */ void b0() {
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
