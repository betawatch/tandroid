package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rb0 implements org.telegram.ui.ActionBar.p1, OnCompleteListener, org.telegram.ui.Components.gj0, ns, org.telegram.ui.Components.r4, org.telegram.messenger.e9, org.telegram.messenger.ii, org.telegram.ui.Components.hj0, er0, org.telegram.messenger.ir, xw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rb0(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        switch (this.a) {
            case 13:
                xq0 xq0Var = (xq0) this.b;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.c;
                fr0 fr0Var = xq0Var.a;
                fr0Var.f0.a(tL_messageMediaToDo);
                fr0Var.finishFragment();
                break;
            default:
                xq0 xq0Var2 = (xq0) this.b;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.c;
                fr0 fr0Var2 = xq0Var2.a;
                fr0Var2.f0.a(tL_messageMediaPoll);
                fr0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.er0
    public void a(TLRPC.MessageMedia messageMedia) {
        w71 w71Var = (w71) this.b;
        wm wmVar = (wm) this.c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = w71Var.H.k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        w71Var.H.k.media = messageMedia;
        wmVar.getSendMessagesHelper().t(w71Var.H, null, null, null, null, null, null, null, false, false, null);
    }

    @Override // org.telegram.ui.Components.gj0
    public void b(float f10, float f11, int i3, View view) {
        switch (this.a) {
            case 3:
                NotificationsCustomSettingsActivity.Z((NotificationsCustomSettingsActivity) this.b, (Context) this.c, view, i3, f10, f11);
                break;
            default:
                ThemeActivity.b0((ThemeActivity) this.b, (Context) this.c, view, i3, f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ns
    public void c(ks ksVar) {
        yj0 yj0Var = (yj0) this.b;
        int intValue = ((Integer) ((View) this.c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = yj0Var.Z[intValue];
        if (intValue == 5) {
            yj0Var.s = ksVar.d;
        } else {
            yj0Var.w = ksVar.d;
        }
        editTextBoldCursor.setText(ksVar.a);
    }

    public File d() {
        switch (this.a) {
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                TLObject tLObject = (TLObject) this.c;
                org.telegram.messenger.w7.G(photoViewer.U);
                return org.telegram.messenger.w7.K(tLObject, null, true, true);
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                org.telegram.messenger.w7.G(photoViewer2.U);
                return org.telegram.messenger.w7.N(message, false, true);
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        final v51 v51Var = (v51) this.b;
        final x51 x51Var = (x51) this.c;
        ThemeActivity themeActivity = v51Var.e;
        if (i3 >= 0 && i3 < x51Var.e.size()) {
            final org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) x51Var.e.get(i3);
            if (g6Var.a >= 100 && !g6Var.z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(2131747805, "OpenInEditor");
                String M02 = org.telegram.messenger.bd.M0(2131745436, "ShareTheme");
                TLRPC.TL_theme tL_theme = g6Var.r;
                CharSequence[] charSequenceArr = {M0, M02, (tL_theme == null || !tL_theme.creator) ? null : org.telegram.messenger.bd.M0(2131744155, "ThemeSetUrl"), org.telegram.messenger.bd.M0(2131751487, "DeleteTheme")};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.q51
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        v51 v51Var2 = v51.this;
                        ThemeActivity themeActivity2 = v51Var2.e;
                        if (themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                        if (i10 == 0) {
                            org.telegram.ui.Components.t4.V(themeActivity2, i10 != 1 ? 1 : 2, g6Var2.b, g6Var2);
                            return;
                        }
                        if (i10 == 1) {
                            if (g6Var2.r == null) {
                                themeActivity2.getMessagesController().y4(g6Var2.b, g6Var2);
                                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.s4, g6Var2.b, g6Var2);
                                return;
                            }
                            String str = "https://" + themeActivity2.getMessagesController().V2 + "/addtheme/" + g6Var2.r.slug;
                            themeActivity2.showDialog(new org.telegram.ui.Components.oo0(themeActivity2.getParentActivity(), null, str, false, str, false, null));
                            return;
                        }
                        if (i10 == 2) {
                            themeActivity2.presentFragment(new o71(g6Var2.b, g6Var2, false));
                            return;
                        }
                        if (i10 != 3 || themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                        String M03 = org.telegram.messenger.bd.M0(2131751485, "DeleteThemeTitle");
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder2.a;
                        s1Var.S = M03;
                        s1Var.U = org.telegram.messenger.bd.M0(2131751486, "DeleteThemeAlert");
                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131751599, "Delete"), new b7(v51Var2, x51Var, g6Var2, 22));
                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                        themeActivity2.showDialog(s1Var);
                        TextView textView = (TextView) s1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                        }
                    }
                };
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.Q = charSequenceArr;
                s1Var.R = iArr;
                s1Var.N = onClickListener;
                themeActivity.showDialog(s1Var);
                s1Var.m(s1Var.Q0.size() - 1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p7, false));
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i10;
        boolean z10;
        org.telegram.ui.ActionBar.q4 q4Var;
        int i11 = this.a;
        int i12 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                vb0 vb0Var = (vb0) obj2;
                vb0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", vb0Var.r);
                bundle.putString("requestPhone", vb0Var.s);
                bundle.putString("phoneHash", vb0Var.w);
                bundle.putString("phoneCode", vb0Var.x);
                vb0Var.E.D1(7, true, bundle, false);
                break;
            case 1:
            case 3:
            case 6:
            case 9:
            case 10:
            case 13:
            case 14:
            case 15:
            case 20:
            case 21:
            default:
                v51 v51Var = (v51) obj2;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) obj;
                v51Var.getClass();
                org.telegram.messenger.hp.s1(j6Var.F).x4(j6Var, null, j6Var == org.telegram.ui.ActionBar.k6.J, true);
                HashMap hashMap = org.telegram.ui.ActionBar.k6.H;
                if (j6Var.b == null) {
                    z10 = false;
                } else {
                    if (org.telegram.ui.ActionBar.k6.I == j6Var) {
                        org.telegram.ui.ActionBar.k6.u(org.telegram.ui.ActionBar.k6.L, true, false);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (j6Var == org.telegram.ui.ActionBar.k6.J) {
                        org.telegram.ui.ActionBar.k6.J = (org.telegram.ui.ActionBar.j6) hashMap.get("Dark Blue");
                    }
                    j6Var.t();
                    org.telegram.ui.ActionBar.k6.G.remove(j6Var);
                    hashMap.remove(j6Var.a);
                    org.telegram.ui.ActionBar.b6 b6Var = j6Var.j0;
                    if (b6Var != null) {
                        org.telegram.ui.ActionBar.b6.a(b6Var);
                    }
                    org.telegram.ui.ActionBar.k6.F.remove(j6Var);
                    new File(j6Var.b).delete();
                    org.telegram.ui.ActionBar.k6.y1(true, false);
                }
                if (z10) {
                    q4Var = ((org.telegram.ui.ActionBar.d2) v51Var.e).parentLayout;
                    ((ActionBarLayout) q4Var).X(true, true);
                }
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.o4, new Object[0]);
                break;
            case 2:
                dd0.n((dd0) obj2, (Context) obj);
                break;
            case 4:
                yj0 yj0Var = (yj0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!yj0Var.w0) {
                    yj0Var.t1.clear();
                }
                yj0Var.u1.clear();
                dj0 dj0Var = (dj0) yj0Var.C1;
                dj0Var.d.n1(yj0Var.F, yj0Var.G, yj0Var.H, zArr[0], null, null, dj0Var.b);
                yj0Var.finishFragment();
                break;
            case 5:
                int[] iArr = ((yj0) obj2).y;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(org.telegram.messenger.bd.M0(2131747502, null));
                break;
            case 7:
                yj0.Z((yj0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                break;
            case 8:
                dl0 dl0Var = (dl0) obj2;
                dl0Var.c0 = true;
                dl0Var.b0.email_unconfirmed_pattern = (String) obj;
                dl0Var.P0();
                break;
            case 11:
                PhotoViewer.C(((ho0) obj2).b, (ArrayList) obj);
                break;
            case 12:
                boolean[] zArr2 = (boolean[]) obj;
                PhotoViewer photoViewer = ((ho0) obj2).b;
                kq0 kq0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.b7;
                ArrayList arrayList3 = photoViewer.e7;
                ArrayList arrayList4 = photoViewer.Z6;
                ArrayList arrayList5 = photoViewer.f7;
                ArrayList arrayList6 = photoViewer.g7;
                if (!kq0Var.N()) {
                    photoViewer.H0(false, false);
                    break;
                } else if (!arrayList4.isEmpty()) {
                    int i13 = photoViewer.Q4;
                    if (i13 >= 0 && i13 < arrayList4.size()) {
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList4.get(photoViewer.Q4);
                        if (ziVar.r4()) {
                            photoViewer.H0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i14 = photoViewer.w;
                            if (i14 != 0) {
                                arrayList7.add(Integer.valueOf(i14));
                            } else {
                                arrayList7.add(Integer.valueOf(ziVar.f1()));
                            }
                            if (!org.telegram.messenger.m5.C(org.telegram.messenger.zi.B0(ziVar.k)) || ziVar.k.random_id == 0) {
                                arrayList = null;
                                encryptedChat = null;
                            } else {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(ziVar.k.random_id));
                                arrayList = arrayList8;
                                encryptedChat = org.telegram.messenger.hp.s1(photoViewer.U).a1(Integer.valueOf((int) (org.telegram.messenger.zi.B0(ziVar.k) & 4294967295L)));
                            }
                            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(photoViewer.U);
                            long B0 = org.telegram.messenger.zi.B0(ziVar.k);
                            int J1 = org.telegram.messenger.zi.J1(ziVar.k);
                            boolean z11 = zArr2[0];
                            if (!ziVar.p1) {
                                if (!org.telegram.messenger.zi.e5(ziVar.k)) {
                                    if (!org.telegram.messenger.zi.c4(ziVar.k)) {
                                        i10 = 0;
                                        s12.Z(arrayList7, arrayList, encryptedChat, B0, J1, z11, i10);
                                        break;
                                    } else {
                                        i12 = 5;
                                    }
                                } else {
                                    i12 = 9;
                                }
                            }
                            i10 = i12;
                            s12.Z(arrayList7, arrayList, encryptedChat, B0, J1, z11, i10);
                        }
                    }
                } else if (!arrayList6.isEmpty()) {
                    int i15 = photoViewer.Q4;
                    if (i15 >= 0 && i15 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.Q4);
                        if (message != null) {
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.add(Integer.valueOf(message.id));
                            org.telegram.messenger.hp.s1(photoViewer.U).Z(arrayList9, null, null, org.telegram.messenger.zi.B0(message), message.quick_reply_shortcut_id, true, 0);
                            org.telegram.messenger.hs.f(photoViewer.U).k(39, new Object[0]);
                        }
                        if (!photoViewer.L1()) {
                            TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.Q4);
                            if (photo != null) {
                                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                tL_inputPhoto.id = photo.id;
                                tL_inputPhoto.access_hash = photo.access_hash;
                                byte[] bArr = photo.file_reference;
                                tL_inputPhoto.file_reference = bArr;
                                if (bArr == null) {
                                    tL_inputPhoto.file_reference = new byte[0];
                                }
                                if (photoViewer.A5 > 0) {
                                    org.telegram.messenger.hp.s1(photoViewer.U).l0(tL_inputPhoto);
                                }
                                org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(photoViewer.U);
                                a02.a.c(new org.telegram.messenger.mp(4, photoViewer.A5, photo.id, a02));
                                arrayList2.remove(photoViewer.Q4);
                                photoViewer.d7.remove(photoViewer.Q4);
                                photoViewer.c7.remove(photoViewer.Q4);
                                arrayList3.remove(photoViewer.Q4);
                                arrayList6.remove(photoViewer.Q4);
                                if (arrayList2.isEmpty()) {
                                    photoViewer.H0(false, false);
                                } else {
                                    int i16 = photoViewer.Q4;
                                    if (i16 >= arrayList6.size()) {
                                        i16 = arrayList6.size() - 1;
                                    }
                                    photoViewer.Q4 = -1;
                                    photoViewer.E2(i16);
                                }
                                if (message == null) {
                                    org.telegram.messenger.hs.f(photoViewer.U).k(39, new Object[0]);
                                    break;
                                }
                            }
                        } else {
                            if (photoViewer.A5 > 0) {
                                org.telegram.messenger.hp.s1(photoViewer.U).l0(null);
                            } else {
                                org.telegram.messenger.hp.s1(photoViewer.U).B(-photoViewer.A5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.H0(false, false);
                            break;
                        }
                    }
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.Q4);
                    photoViewer.d.B(photoViewer.Q4);
                    if (!arrayList5.isEmpty()) {
                        int i17 = photoViewer.Q4;
                        if (i17 >= arrayList5.size()) {
                            i17 = arrayList5.size() - 1;
                        }
                        photoViewer.Q4 = -1;
                        photoViewer.E2(i17);
                        break;
                    } else {
                        photoViewer.H0(false, false);
                        break;
                    }
                }
                break;
            case 16:
                ((PrivacyControlActivity) obj2).E0();
                ((SharedPreferences) obj).edit().putBoolean("privacyAlertShowed", true).commit();
                break;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr3 = privacySettingsActivity.a0;
                tL_payments_clearSavedInfo.credentials = zArr3[1];
                tL_payments_clearSavedInfo.info = zArr3[0];
                privacySettingsActivity.getUserConfig().y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new xy(23, privacySettingsActivity, (org.telegram.ui.Cells.q8) obj));
                break;
            case 18:
                ProfileActivity.p0((ProfileActivity) obj2, (org.telegram.ui.Cells.c2[]) obj);
                break;
            case 19:
                iv0 iv0Var = (iv0) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                iv0Var.getClass();
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = iv0Var.b;
                RectF rectF = ProfileActivity.T6;
                profileActivity.getContactsController().i(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.D5(false, false);
                    break;
                }
                break;
            case 22:
                q11 q11Var = (q11) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    q11Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    b7 b7Var = new b7(q11Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.a0 = 0;
                    twoStepVerificationActivity.c0 = b7Var;
                    T.presentFragment(twoStepVerificationActivity);
                    break;
                }
                break;
            case 23:
                ThemeActivity.c0((ThemeActivity) obj2, (qv0) obj);
                break;
        }
    }

    @Override // org.telegram.messenger.ii
    public void h(String str, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        Runnable runnable = (Runnable) this.c;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            try {
                if (!((org.telegram.messenger.hi) arrayList.get(i3)).a.startsWith("animated_")) {
                    String c2 = org.telegram.messenger.i6.c(((org.telegram.messenger.hi) arrayList.get(i3)).a);
                    if (org.telegram.messenger.i6.g(c2) != null) {
                        linkedHashSet.add(c2);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override // org.telegram.messenger.e9
    public Object k(Object obj) {
        js0 js0Var = (js0) this.b;
        is0 is0Var = (is0) this.c;
        PremiumPreviewFragment premiumPreviewFragment = js0Var.d.n;
        premiumPreviewFragment.o0.d(0, 0.0f, 0, is0Var.getMeasuredWidth(), -is0Var.getTier().h, premiumPreviewFragment.P);
        return premiumPreviewFragment.o0.f;
    }

    @Override // org.telegram.ui.xw0
    public void l(lh0 lh0Var) {
        p91 p91Var = (p91) this.b;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.c;
        s91 s91Var = p91Var.a;
        s91Var.e.add(Integer.valueOf(tL_forumTopic.id));
        s91Var.a0();
    }

    @Override // org.telegram.messenger.ir
    public void o(boolean z10) {
        y81 y81Var = (y81) this.b;
        TLRPC.Chat chat = (TLRPC.Chat) this.c;
        m91 m91Var = y81Var.b;
        org.telegram.messenger.hs notificationCenter = m91Var.getNotificationCenter();
        int i3 = org.telegram.messenger.hs.t;
        notificationCenter.n(m91Var, i3);
        m91Var.getNotificationCenter().k(i3, new Object[0]);
        m91Var.finishFragment();
        m91Var.getNotificationCenter().k(org.telegram.messenger.hs.K2, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        qc0 qc0Var = (qc0) this.b;
        a9.j0 j0Var = (a9.j0) this.c;
        xd0 xd0Var = qc0Var.F;
        if (xd0Var.getParentActivity() == null || xd0Var.getParentActivity().isFinishing()) {
            return;
        }
        xd0Var.getParentActivity().startActivityForResult(j0Var.f(), org.telegram.messenger.hs.e3);
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
        int i3 = this.a;
    }

    public /* synthetic */ rb0(xq0 xq0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.a = 14;
        this.b = xq0Var;
        this.c = tL_messageMediaPoll;
    }

    @Override // org.telegram.ui.xw0
    public /* synthetic */ void a0() {
    }

    private final /* synthetic */ void e(View view, float f10, float f11) {
    }

    private final /* synthetic */ void i(View view, float f10, float f11) {
    }
}
