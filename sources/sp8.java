// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sp8 extends c6 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ProfileActivity b;

    public sp8(ProfileActivity profileActivity, Context context) {
        this.b = profileActivity;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [ee, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // c6
    public final void b(int i) {
        long j;
        int i2;
        ?? r6;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        kfa kfaVar;
        ProfileActivity profileActivity = this.b;
        if (profileActivity.getParentActivity() != null) {
            if (i == -1) {
                wp8 wp8Var = profileActivity.O;
                if (wp8Var == null || (kfaVar = wp8Var.L0) == null || !kfaVar.o0) {
                    profileActivity.finishFragment();
                    return;
                } else {
                    profileActivity.I3();
                    return;
                }
            }
            if (i == 2) {
                profileActivity.T2(false);
                return;
            }
            final byte b = 1;
            if (i == 1) {
                TLRPC.User W1 = profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", W1.id);
                bundle.putBoolean("addContact", true);
                tu2 tu2Var = new tu2(bundle, profileActivity.A0);
                tu2Var.P = new wn8(profileActivity, W1);
                profileActivity.presentFragment(tu2Var);
                return;
            }
            if (i == 3) {
                Bundle j2 = td4.j(3, "onlySelect", "dialogsType", true);
                j2.putString("selectAlertString", jb6.M0(2131745364, null));
                j2.putString("selectAlertStringGroup", jb6.M0(2131745365, null));
                nk3 nk3Var = new nk3(j2);
                nk3Var.E2 = profileActivity;
                profileActivity.presentFragment(nk3Var);
                return;
            }
            if (i == 4) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", profileActivity.e1);
                profileActivity.presentFragment(new tu2(bundle2, profileActivity.A0));
                return;
            }
            if (i == 5) {
                TLRPC.User W12 = profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1));
                if (W12 == null || profileActivity.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                String M0 = jb6.M0(2131751489, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131754068, null);
                alertDialog$Builder.j(jb6.M0(2131751535, null), new cz6((Object) this, (Object) W12, (byte) 29));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                profileActivity.showDialog(heVar);
                TextView textView = (TextView) heVar.c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, profileActivity.A0);
                    return;
                }
                return;
            }
            if (i == 7) {
                profileActivity.N2(false);
                return;
            }
            if (i == 45) {
                profileActivity.N2(true);
                return;
            }
            final byte b2 = 0;
            if (i == 46) {
                if (!profileActivity.getUserConfig().p()) {
                    Activity parentActivity = profileActivity.getParentActivity();
                    i11 = ((d) profileActivity).currentAccount;
                    new kj8(profileActivity, parentActivity, i11, false, 41, false, null).show();
                    return;
                }
                ylb ylbVar = profileActivity.A0;
                pp8 pp8Var = new pp8(this, b2);
                Pattern pattern = ik.a;
                Context context = this.a;
                if (context != null) {
                    boolean[] zArr = new boolean[1];
                    my0 h = hg9.h(1, null, context, false);
                    zx0 zx0Var = h.y0;
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    linearLayout.setClipChildren(false);
                    linearLayout.setClipToPadding(false);
                    s09 s09Var = new s09(context);
                    linearLayout.addView(s09Var, qoe.t(nm7.u1, nm7.u1, 17, 0, 21, 0, 11));
                    s09Var.f(R.raw.raised_hand, nm7.u1, nm7.u1, null);
                    s09Var.setAutoRepeat(false);
                    s09Var.d();
                    TextView textView2 = new TextView(context);
                    textView2.setTypeface(gm.o());
                    textView2.setGravity(17);
                    textView2.setText(jb6.M0(2131751359, null));
                    textView2.setTextSize(1, 20.0f);
                    int i12 = cmb.F6;
                    anb.X(textView2, i12, ylbVar);
                    linearLayout.addView(textView2, qoe.t(-1, -2, 17, 20, 0, 20, 14));
                    lj8 lj8Var = new lj8(context, ylbVar);
                    lj8Var.a.l(jb6.M0(2131751358, null), false);
                    lj8Var.b.setText(jb6.M0(2131751355, null));
                    lj8Var.d.setVisibility(8);
                    ImageView imageView = lj8Var.c;
                    imageView.setImageResource(R.drawable.menu_photo_off_24);
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                    anb.s(imageView, i12, ylbVar, mode);
                    linearLayout.addView(lj8Var, qoe.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                    lj8 lj8Var2 = new lj8(context, ylbVar);
                    lj8Var2.a.l(jb6.M0(2131751357, null), false);
                    lj8Var2.b.setText(jb6.M0(2131751354, null));
                    lj8Var2.d.setVisibility(8);
                    ImageView imageView2 = lj8Var2.c;
                    imageView2.setImageResource(R.drawable.menu_share_off_24);
                    anb.s(imageView2, i12, ylbVar, mode);
                    linearLayout.addView(lj8Var2, qoe.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                    lj8 lj8Var3 = new lj8(context, ylbVar);
                    lj8Var3.a.l(jb6.M0(2131751356, null), false);
                    lj8Var3.b.setText(jb6.M0(2131751353, null));
                    lj8Var3.d.setVisibility(8);
                    ImageView imageView3 = lj8Var3.c;
                    imageView3.setImageResource(R.drawable.menu_download_off_24);
                    anb.s(imageView3, i12, ylbVar, mode);
                    linearLayout.addView(lj8Var3, qoe.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                    b61 b61Var = new b61(ylbVar, context, true);
                    b61Var.setOnClickListener(new t(zArr, zx0Var, (byte) 16));
                    b61Var.f();
                    b61Var.i(jb6.M0(2131751360, null), false, true);
                    linearLayout.addView(b61Var, qoe.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                    h.O = linearLayout;
                    h.show();
                    h.n(new pf2(zArr, pp8Var, (byte) 24));
                    return;
                }
                return;
            }
            if (i == 47) {
                profileActivity.getMessagesController().l5(profileActivity.e1, 0, false, new gp2(profileActivity, r9, b));
                return;
            }
            if (i == 23) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                String J0 = jb6.J0(1, "DeleteTopics");
                he heVar2 = alertDialog$Builder2.a;
                heVar2.S = J0;
                i10 = ((d) profileActivity).currentAccount;
                TLRPC.TL_forumTopic f = oc7.r1(i10).g4.f(profileActivity.f1, profileActivity.g1);
                heVar2.U = jb6.a0("DeleteSelectedTopic", null, 2131751435, f == null ? "topic" : f.title);
                alertDialog$Builder2.j(jb6.M0(2131751535, null), new ee(this) { // from class: qp8
                    public final /* synthetic */ sp8 b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Incorrect condition in loop: B:85:0x0276 */
                    @Override // ee
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void r(he heVar3, int i13) {
                        tk5 tk5Var;
                        tk5 tk5Var2;
                        tk5 tk5Var3;
                        tk5 tk5Var4;
                        int i14;
                        int i15;
                        boolean z;
                        xb7 xb7Var;
                        TLRPC.Photo photo;
                        byte b3 = b2;
                        sp8 sp8Var = this.b;
                        switch (b3) {
                            case 0:
                                ArrayList arrayList = new ArrayList();
                                ProfileActivity profileActivity2 = sp8Var.b;
                                arrayList.add(Integer.valueOf((int) profileActivity2.g1));
                                profileActivity2.getMessagesController().g4.d(arrayList, profileActivity2.f1);
                                profileActivity2.J1 = (byte) 0;
                                tk5Var = ((d) profileActivity2).parentLayout;
                                if (tk5Var != null) {
                                    tk5Var2 = ((d) profileActivity2).parentLayout;
                                    if (tk5Var2.getFragmentStack() != null) {
                                        for (int i16 = 0; i16 < tk5Var3.getFragmentStack().size(); i16++) {
                                            tk5Var4 = ((d) profileActivity2).parentLayout;
                                            d dVar = (d) tk5Var4.getFragmentStack().get(i16);
                                            if ((dVar instanceof yv1) && ((yv1) dVar).d() == profileActivity2.g1) {
                                                dVar.removeSelfFromStack();
                                            }
                                        }
                                    }
                                }
                                profileActivity2.finishFragment();
                                Activity parentActivity2 = profileActivity2.getParentActivity();
                                if (parentActivity2 != null) {
                                    new c41(n21.a(parentActivity2), profileActivity2.A0).Q(R.raw.ic_delete, 36, jb6.J0(1, "TopicsDeleted")).j();
                                }
                                heVar3.dismiss();
                                break;
                            case 1:
                                ProfileActivity profileActivity3 = sp8Var.b;
                                i14 = ((d) profileActivity3).currentAccount;
                                if (oc7.r1(i14).u2()) {
                                    i15 = ((d) profileActivity3).currentAccount;
                                    h5.b(i15);
                                    break;
                                } else {
                                    profileActivity3.j1 = true;
                                    profileActivity3.getSecretChatHelper().A(profileActivity3.getParentActivity(), profileActivity3.getMessagesController().W1(Long.valueOf(profileActivity3.e1)));
                                    break;
                                }
                            default:
                                ProfileActivity profileActivity4 = sp8Var.b;
                                int realPosition = profileActivity4.o0.getRealPosition();
                                TLRPC.Photo F = profileActivity4.o0.F(realPosition);
                                TLRPC.UserFull userFull = profileActivity4.w2;
                                if (profileActivity4.J2 == null || realPosition != 0) {
                                    if (profileActivity4.A5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                        userFull.fallback_photo = null;
                                        userFull.flags &= -4194305;
                                        profileActivity4.getMessagesStorage().g2(userFull, true);
                                        profileActivity4.h4(false);
                                    }
                                    if (profileActivity4.o0.getRealCount() == 1) {
                                        profileActivity4.w3(true);
                                    }
                                    if (F == null || profileActivity4.o0.getRealPosition() == 0) {
                                        TLRPC.Photo F2 = profileActivity4.o0.F(1);
                                        if (F2 != null) {
                                            profileActivity4.getUserConfig().f().photo = new TLRPC.TL_userProfilePhoto();
                                            TLRPC.PhotoSize w = bc4.w(F2.sizes, 90, false, null, false);
                                            TLRPC.PhotoSize w2 = bc4.w(F2.sizes, 1000, false, null, false);
                                            if (w != null && w2 != null) {
                                                profileActivity4.getUserConfig().f().photo.photo_small = w.location;
                                                profileActivity4.getUserConfig().f().photo.photo_big = w2.location;
                                            }
                                        } else {
                                            profileActivity4.getUserConfig().f().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                        }
                                        profileActivity4.getMessagesController().h0(null);
                                    } else {
                                        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                        tL_inputPhoto.id = F.id;
                                        tL_inputPhoto.access_hash = F.access_hash;
                                        byte[] bArr = F.file_reference;
                                        tL_inputPhoto.file_reference = bArr;
                                        if (bArr == null) {
                                            tL_inputPhoto.file_reference = new byte[0];
                                        }
                                        profileActivity4.getMessagesController().h0(tL_inputPhoto);
                                        cf7 messagesStorage = profileActivity4.getMessagesStorage();
                                        messagesStorage.a.c(new tc7(messagesStorage, profileActivity4.e1, F.id, (byte) 4));
                                    }
                                    zo8 zo8Var = profileActivity4.o0;
                                    ArrayList arrayList2 = zo8Var.Y0;
                                    ArrayList arrayList3 = zo8Var.W0;
                                    if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                        z = false;
                                    } else {
                                        TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                        if (photo2 == null || (xb7Var = zo8Var.T0) == null) {
                                            arrayList3.remove(realPosition);
                                            zo8Var.V0.remove(realPosition);
                                            zo8Var.U0.remove(realPosition);
                                            zo8Var.X0.remove(realPosition);
                                            arrayList2.remove(realPosition);
                                            zo8Var.Z0.remove(realPosition);
                                            zo8Var.a1.remove(realPosition);
                                            zo8Var.b1.remove(realPosition);
                                            zo8Var.e1.delete(realPosition);
                                            zo8Var.c1.remove(realPosition);
                                            if (realPosition == 0 && !arrayList2.isEmpty()) {
                                                zo8Var.Q0 = (gn5) arrayList2.get(0);
                                                zo8Var.R0 = null;
                                                zo8Var.S0 = null;
                                            }
                                            zo8Var.E0.g();
                                            z = arrayList3.isEmpty();
                                        } else {
                                            xb7Var.e(photo2.id);
                                            z = true;
                                        }
                                    }
                                    if (z || profileActivity4.o0.getRealCount() <= 0) {
                                        profileActivity4.o0.setVisibility(8);
                                        profileActivity4.f0.setForegroundAlpha(1.0f);
                                        profileActivity4.Y.setVisibility(0);
                                        profileActivity4.I0 = true;
                                        View m = profileActivity4.c.m(0);
                                        if (m != null) {
                                            profileActivity4.a.x0(0, m.getTop() - profileActivity4.e2(), d53.h);
                                            break;
                                        }
                                    }
                                } else {
                                    profileActivity4.r0.a();
                                    if (profileActivity4.u6 != 0) {
                                        profileActivity4.getConnectionsManager().cancelRequest(profileActivity4.u6, true);
                                    }
                                    profileActivity4.p2 = (gm.O1() || profileActivity4.o2 || !profileActivity4.f0.getImageReceiver().E() || gm.A1()) ? false : true;
                                    profileActivity4.J2 = null;
                                    profileActivity4.K2 = null;
                                    zo8 zo8Var2 = profileActivity4.o0;
                                    zo8Var2.I0 = true;
                                    zo8Var2.L0 = profileActivity4.L2;
                                    zo8Var2.r1 = null;
                                    zo8Var2.s1 = null;
                                    zo8Var2.setCreateThumbFromParent(false);
                                    profileActivity4.h4(true);
                                    profileActivity4.F3(false, true);
                                    nm7 notificationCenter = profileActivity4.getNotificationCenter();
                                    int i17 = oc7.s5;
                                    notificationCenter.k(2, Integer.valueOf(oc7.s5));
                                    profileActivity4.getNotificationCenter().k(47, new Object[0]);
                                    profileActivity4.getUserConfig().u(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                alertDialog$Builder2.g(jb6.M0(2131752542, null), new i98((byte) 5));
                heVar2.show();
                TextView textView3 = (TextView) heVar2.c(-1);
                if (textView3 != null) {
                    anb.X(textView3, cmb.p7, null);
                    return;
                }
                return;
            }
            if (i == 24) {
                da9.F0(profileActivity.a(), profileActivity);
                return;
            }
            if (i == 12) {
                if (profileActivity.q1) {
                    profileActivity.presentFragment(wvb.f0(profileActivity.f1, profileActivity.g1));
                    return;
                }
                Bundle bundle3 = new Bundle();
                long j3 = profileActivity.f1;
                if (j3 != 0) {
                    bundle3.putLong("chat_id", j3);
                } else if (profileActivity.s2) {
                    bundle3.putLong("user_id", profileActivity.e1);
                }
                ba2 ba2Var = new ba2(bundle3);
                TLRPC.ChatFull chatFull = profileActivity.v2;
                if (chatFull != null) {
                    ba2Var.q0(chatFull);
                } else {
                    ba2Var.r0(profileActivity.w2);
                }
                profileActivity.presentFragment(ba2Var);
                return;
            }
            if (i == 41) {
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            }
            if (i == 9) {
                TLRPC.User W13 = profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1));
                if (W13 != null) {
                    Bundle j4 = td4.j(2, "onlySelect", "dialogsType", true);
                    j4.putBoolean("resetDelegate", false);
                    j4.putBoolean("closeFragment", false);
                    nk3 nk3Var2 = new nk3(j4);
                    nk3Var2.E2 = new wu2((Object) this, (Object) W13, (Object) nk3Var2, (byte) 24);
                    profileActivity.presentFragment(nk3Var2);
                    return;
                }
                return;
            }
            if (i == 10) {
                profileActivity.Y2();
                return;
            }
            if (i == 14) {
                try {
                    if (profileActivity.E2 != null) {
                        j = pg3.E(r0.id);
                    } else {
                        j = profileActivity.e1;
                        if (j == 0) {
                            long j5 = profileActivity.f1;
                            if (j5 == 0) {
                                return;
                            } else {
                                j = -j5;
                            }
                        }
                    }
                    hs6 mediaDataController = profileActivity.getMediaDataController();
                    Pattern pattern2 = hs6.U1;
                    mediaDataController.z0(j, 0, null);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            }
            if (i != 15) {
                i2 = 16;
                if (i != 16) {
                    if (i == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", profileActivity.f1);
                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle4.putBoolean("open_search", true);
                        wg2 wg2Var = new wg2(bundle4);
                        wg2Var.B0(profileActivity.v2);
                        profileActivity.presentFragment(wg2Var);
                        return;
                    }
                    if (i == 18) {
                        profileActivity.b3();
                        return;
                    }
                    if (i == 19) {
                        profileActivity.presentFragment(xza.e0(profileActivity.getMessagesController().L0(Long.valueOf(profileActivity.f1)), false));
                        return;
                    }
                    if (i == 22) {
                        profileActivity.f3();
                        return;
                    }
                    if (i == 38) {
                        profileActivity.V2();
                        return;
                    }
                    if (i == 48) {
                        rrc rrcVar = new rrc(profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1)));
                        rrcVar.g0 = true;
                        profileActivity.presentFragment(rrcVar);
                        return;
                    }
                    if (i == 39) {
                        Bundle j6 = kt6.j(2, TeXSymbolParser.TYPE_ATTR);
                        j6.putLong("dialog_id", -profileActivity.f1);
                        cm6 cm6Var = new cm6(j6, null);
                        cm6Var.c = profileActivity.v2;
                        profileActivity.presentFragment(cm6Var);
                        return;
                    }
                    if (i == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                        String M02 = jb6.M0(2131754043, null);
                        he heVar3 = alertDialog$Builder3.a;
                        heVar3.S = M02;
                        heVar3.U = jb6.M0(2131754044, null);
                        alertDialog$Builder3.j(jb6.M0(2131744604, null), new ee(this) { // from class: qp8
                            public final /* synthetic */ sp8 b;

                            {
                                this.b = this;
                            }

                            /* JADX WARN: Incorrect condition in loop: B:85:0x0276 */
                            @Override // ee
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void r(he heVar32, int i13) {
                                tk5 tk5Var;
                                tk5 tk5Var2;
                                tk5 tk5Var3;
                                tk5 tk5Var4;
                                int i14;
                                int i15;
                                boolean z;
                                xb7 xb7Var;
                                TLRPC.Photo photo;
                                byte b3 = b;
                                sp8 sp8Var = this.b;
                                switch (b3) {
                                    case 0:
                                        ArrayList arrayList = new ArrayList();
                                        ProfileActivity profileActivity2 = sp8Var.b;
                                        arrayList.add(Integer.valueOf((int) profileActivity2.g1));
                                        profileActivity2.getMessagesController().g4.d(arrayList, profileActivity2.f1);
                                        profileActivity2.J1 = (byte) 0;
                                        tk5Var = ((d) profileActivity2).parentLayout;
                                        if (tk5Var != null) {
                                            tk5Var2 = ((d) profileActivity2).parentLayout;
                                            if (tk5Var2.getFragmentStack() != null) {
                                                for (int i16 = 0; i16 < tk5Var3.getFragmentStack().size(); i16++) {
                                                    tk5Var4 = ((d) profileActivity2).parentLayout;
                                                    d dVar = (d) tk5Var4.getFragmentStack().get(i16);
                                                    if ((dVar instanceof yv1) && ((yv1) dVar).d() == profileActivity2.g1) {
                                                        dVar.removeSelfFromStack();
                                                    }
                                                }
                                            }
                                        }
                                        profileActivity2.finishFragment();
                                        Activity parentActivity2 = profileActivity2.getParentActivity();
                                        if (parentActivity2 != null) {
                                            new c41(n21.a(parentActivity2), profileActivity2.A0).Q(R.raw.ic_delete, 36, jb6.J0(1, "TopicsDeleted")).j();
                                        }
                                        heVar32.dismiss();
                                        break;
                                    case 1:
                                        ProfileActivity profileActivity3 = sp8Var.b;
                                        i14 = ((d) profileActivity3).currentAccount;
                                        if (oc7.r1(i14).u2()) {
                                            i15 = ((d) profileActivity3).currentAccount;
                                            h5.b(i15);
                                            break;
                                        } else {
                                            profileActivity3.j1 = true;
                                            profileActivity3.getSecretChatHelper().A(profileActivity3.getParentActivity(), profileActivity3.getMessagesController().W1(Long.valueOf(profileActivity3.e1)));
                                            break;
                                        }
                                    default:
                                        ProfileActivity profileActivity4 = sp8Var.b;
                                        int realPosition = profileActivity4.o0.getRealPosition();
                                        TLRPC.Photo F = profileActivity4.o0.F(realPosition);
                                        TLRPC.UserFull userFull = profileActivity4.w2;
                                        if (profileActivity4.J2 == null || realPosition != 0) {
                                            if (profileActivity4.A5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                                userFull.fallback_photo = null;
                                                userFull.flags &= -4194305;
                                                profileActivity4.getMessagesStorage().g2(userFull, true);
                                                profileActivity4.h4(false);
                                            }
                                            if (profileActivity4.o0.getRealCount() == 1) {
                                                profileActivity4.w3(true);
                                            }
                                            if (F == null || profileActivity4.o0.getRealPosition() == 0) {
                                                TLRPC.Photo F2 = profileActivity4.o0.F(1);
                                                if (F2 != null) {
                                                    profileActivity4.getUserConfig().f().photo = new TLRPC.TL_userProfilePhoto();
                                                    TLRPC.PhotoSize w = bc4.w(F2.sizes, 90, false, null, false);
                                                    TLRPC.PhotoSize w2 = bc4.w(F2.sizes, 1000, false, null, false);
                                                    if (w != null && w2 != null) {
                                                        profileActivity4.getUserConfig().f().photo.photo_small = w.location;
                                                        profileActivity4.getUserConfig().f().photo.photo_big = w2.location;
                                                    }
                                                } else {
                                                    profileActivity4.getUserConfig().f().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                                }
                                                profileActivity4.getMessagesController().h0(null);
                                            } else {
                                                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                                tL_inputPhoto.id = F.id;
                                                tL_inputPhoto.access_hash = F.access_hash;
                                                byte[] bArr = F.file_reference;
                                                tL_inputPhoto.file_reference = bArr;
                                                if (bArr == null) {
                                                    tL_inputPhoto.file_reference = new byte[0];
                                                }
                                                profileActivity4.getMessagesController().h0(tL_inputPhoto);
                                                cf7 messagesStorage = profileActivity4.getMessagesStorage();
                                                messagesStorage.a.c(new tc7(messagesStorage, profileActivity4.e1, F.id, (byte) 4));
                                            }
                                            zo8 zo8Var = profileActivity4.o0;
                                            ArrayList arrayList2 = zo8Var.Y0;
                                            ArrayList arrayList3 = zo8Var.W0;
                                            if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                                z = false;
                                            } else {
                                                TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                                if (photo2 == null || (xb7Var = zo8Var.T0) == null) {
                                                    arrayList3.remove(realPosition);
                                                    zo8Var.V0.remove(realPosition);
                                                    zo8Var.U0.remove(realPosition);
                                                    zo8Var.X0.remove(realPosition);
                                                    arrayList2.remove(realPosition);
                                                    zo8Var.Z0.remove(realPosition);
                                                    zo8Var.a1.remove(realPosition);
                                                    zo8Var.b1.remove(realPosition);
                                                    zo8Var.e1.delete(realPosition);
                                                    zo8Var.c1.remove(realPosition);
                                                    if (realPosition == 0 && !arrayList2.isEmpty()) {
                                                        zo8Var.Q0 = (gn5) arrayList2.get(0);
                                                        zo8Var.R0 = null;
                                                        zo8Var.S0 = null;
                                                    }
                                                    zo8Var.E0.g();
                                                    z = arrayList3.isEmpty();
                                                } else {
                                                    xb7Var.e(photo2.id);
                                                    z = true;
                                                }
                                            }
                                            if (z || profileActivity4.o0.getRealCount() <= 0) {
                                                profileActivity4.o0.setVisibility(8);
                                                profileActivity4.f0.setForegroundAlpha(1.0f);
                                                profileActivity4.Y.setVisibility(0);
                                                profileActivity4.I0 = true;
                                                View m = profileActivity4.c.m(0);
                                                if (m != null) {
                                                    profileActivity4.a.x0(0, m.getTop() - profileActivity4.e2(), d53.h);
                                                    break;
                                                }
                                            }
                                        } else {
                                            profileActivity4.r0.a();
                                            if (profileActivity4.u6 != 0) {
                                                profileActivity4.getConnectionsManager().cancelRequest(profileActivity4.u6, true);
                                            }
                                            profileActivity4.p2 = (gm.O1() || profileActivity4.o2 || !profileActivity4.f0.getImageReceiver().E() || gm.A1()) ? false : true;
                                            profileActivity4.J2 = null;
                                            profileActivity4.K2 = null;
                                            zo8 zo8Var2 = profileActivity4.o0;
                                            zo8Var2.I0 = true;
                                            zo8Var2.L0 = profileActivity4.L2;
                                            zo8Var2.r1 = null;
                                            zo8Var2.s1 = null;
                                            zo8Var2.setCreateThumbFromParent(false);
                                            profileActivity4.h4(true);
                                            profileActivity4.F3(false, true);
                                            nm7 notificationCenter = profileActivity4.getNotificationCenter();
                                            int i17 = oc7.s5;
                                            notificationCenter.k(2, Integer.valueOf(oc7.s5));
                                            profileActivity4.getNotificationCenter().k(47, new Object[0]);
                                            profileActivity4.getUserConfig().u(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder3.g(jb6.M0(2131752542, null), null);
                        profileActivity.showDialog(heVar3);
                        return;
                    }
                    if (i == 44) {
                        i9 = ((d) profileActivity).currentAccount;
                        wu0.l(i9, profileActivity.e1);
                        return;
                    }
                    if (i == 21) {
                        if (profileActivity.getParentActivity() != null) {
                            if ((Build.VERSION.SDK_INT <= 28 || e21.b) && profileActivity.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                                profileActivity.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            zo8 zo8Var = profileActivity.o0;
                            gn5 D = zo8Var.D(zo8Var.getRealPosition());
                            if (D != null) {
                                boolean z = D.p == 2;
                                i8 = ((d) profileActivity).currentAccount;
                                bc4.G(i8);
                                File J = bc4.J(D.f, z ? "mp4" : null, true, true);
                                if (z && !J.exists()) {
                                    J = new File(bc4.z(0), bc4.r("mp4", D.f));
                                }
                                if (J.exists()) {
                                    MediaController.d0(J.toString(), profileActivity.getParentActivity(), 0, null, null, new ra((byte) 5, this, z));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i == 30) {
                        profileActivity.presentFragment(new UserInfoActivity());
                        return;
                    }
                    if (i == 40) {
                        d38 d38Var = new d38();
                        d38Var.I = profileActivity;
                        profileActivity.presentFragment(d38Var);
                        return;
                    }
                    if (i == 42) {
                        if (gm.g(profileActivity.getMessagesController().N2 + "/" + m9c.p(profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1))))) {
                            c41.b0(profileActivity).k(false).j();
                            return;
                        }
                        return;
                    }
                    if (i == 43) {
                        profileActivity.presentFragment(new uf1(null));
                        return;
                    }
                    if (i == 31) {
                        profileActivity.presentFragment(new ph6(null));
                        return;
                    }
                    if (i != 33) {
                        if (i == 34) {
                            i3 = ((d) profileActivity).currentAccount;
                            if (oc7.r1(i3).u2()) {
                                i6 = ((d) profileActivity).currentAccount;
                                h5.b(i6);
                                return;
                            }
                            int realPosition = profileActivity.o0.getRealPosition();
                            gn5 D2 = profileActivity.o0.D(realPosition);
                            if (D2 != null) {
                                i4 = ((d) profileActivity).currentAccount;
                                bc4.G(i4);
                                Drawable[] drawableArr = PhotoViewer.d9;
                                File J2 = bc4.J(D2.f, PhotoViewer.o0(D2), true, true);
                                r9 = D2.p == 2;
                                if (r9) {
                                    gn5 G = profileActivity.o0.G(realPosition);
                                    i5 = ((d) profileActivity).currentAccount;
                                    bc4.G(i5);
                                    str = bc4.J(G == null ? null : G.f, PhotoViewer.o0(G), true, true).getAbsolutePath();
                                } else {
                                    str = null;
                                }
                                profileActivity.r0.p(J2.getAbsolutePath(), str, r9);
                                return;
                            }
                            return;
                        }
                        if (i != 35) {
                            if (i == 36) {
                                profileActivity.a3();
                                return;
                            }
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                        zo8 zo8Var2 = profileActivity.o0;
                        gn5 D3 = zo8Var2.D(zo8Var2.getRealPosition());
                        if (D3 != null) {
                            byte b3 = D3.p;
                            he heVar4 = alertDialog$Builder4.a;
                            if (b3 == 2) {
                                r6 = 0;
                                heVar4.S = jb6.M0(2131754048, null);
                                heVar4.U = jb6.M0(2131754050, null);
                            } else {
                                r6 = 0;
                                heVar4.S = jb6.M0(2131754059, null);
                                heVar4.U = jb6.M0(2131754061, null);
                            }
                            final byte b4 = 2;
                            alertDialog$Builder4.j(jb6.M0(2131751535, r6), new ee(this) { // from class: qp8
                                public final /* synthetic */ sp8 b;

                                {
                                    this.b = this;
                                }

                                /* JADX WARN: Incorrect condition in loop: B:85:0x0276 */
                                @Override // ee
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void r(he heVar32, int i13) {
                                    tk5 tk5Var;
                                    tk5 tk5Var2;
                                    tk5 tk5Var3;
                                    tk5 tk5Var4;
                                    int i14;
                                    int i15;
                                    boolean z2;
                                    xb7 xb7Var;
                                    TLRPC.Photo photo;
                                    byte b32 = b4;
                                    sp8 sp8Var = this.b;
                                    switch (b32) {
                                        case 0:
                                            ArrayList arrayList = new ArrayList();
                                            ProfileActivity profileActivity2 = sp8Var.b;
                                            arrayList.add(Integer.valueOf((int) profileActivity2.g1));
                                            profileActivity2.getMessagesController().g4.d(arrayList, profileActivity2.f1);
                                            profileActivity2.J1 = (byte) 0;
                                            tk5Var = ((d) profileActivity2).parentLayout;
                                            if (tk5Var != null) {
                                                tk5Var2 = ((d) profileActivity2).parentLayout;
                                                if (tk5Var2.getFragmentStack() != null) {
                                                    for (int i16 = 0; i16 < tk5Var3.getFragmentStack().size(); i16++) {
                                                        tk5Var4 = ((d) profileActivity2).parentLayout;
                                                        d dVar = (d) tk5Var4.getFragmentStack().get(i16);
                                                        if ((dVar instanceof yv1) && ((yv1) dVar).d() == profileActivity2.g1) {
                                                            dVar.removeSelfFromStack();
                                                        }
                                                    }
                                                }
                                            }
                                            profileActivity2.finishFragment();
                                            Activity parentActivity2 = profileActivity2.getParentActivity();
                                            if (parentActivity2 != null) {
                                                new c41(n21.a(parentActivity2), profileActivity2.A0).Q(R.raw.ic_delete, 36, jb6.J0(1, "TopicsDeleted")).j();
                                            }
                                            heVar32.dismiss();
                                            break;
                                        case 1:
                                            ProfileActivity profileActivity3 = sp8Var.b;
                                            i14 = ((d) profileActivity3).currentAccount;
                                            if (oc7.r1(i14).u2()) {
                                                i15 = ((d) profileActivity3).currentAccount;
                                                h5.b(i15);
                                                break;
                                            } else {
                                                profileActivity3.j1 = true;
                                                profileActivity3.getSecretChatHelper().A(profileActivity3.getParentActivity(), profileActivity3.getMessagesController().W1(Long.valueOf(profileActivity3.e1)));
                                                break;
                                            }
                                        default:
                                            ProfileActivity profileActivity4 = sp8Var.b;
                                            int realPosition2 = profileActivity4.o0.getRealPosition();
                                            TLRPC.Photo F = profileActivity4.o0.F(realPosition2);
                                            TLRPC.UserFull userFull = profileActivity4.w2;
                                            if (profileActivity4.J2 == null || realPosition2 != 0) {
                                                if (profileActivity4.A5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                                    userFull.fallback_photo = null;
                                                    userFull.flags &= -4194305;
                                                    profileActivity4.getMessagesStorage().g2(userFull, true);
                                                    profileActivity4.h4(false);
                                                }
                                                if (profileActivity4.o0.getRealCount() == 1) {
                                                    profileActivity4.w3(true);
                                                }
                                                if (F == null || profileActivity4.o0.getRealPosition() == 0) {
                                                    TLRPC.Photo F2 = profileActivity4.o0.F(1);
                                                    if (F2 != null) {
                                                        profileActivity4.getUserConfig().f().photo = new TLRPC.TL_userProfilePhoto();
                                                        TLRPC.PhotoSize w = bc4.w(F2.sizes, 90, false, null, false);
                                                        TLRPC.PhotoSize w2 = bc4.w(F2.sizes, 1000, false, null, false);
                                                        if (w != null && w2 != null) {
                                                            profileActivity4.getUserConfig().f().photo.photo_small = w.location;
                                                            profileActivity4.getUserConfig().f().photo.photo_big = w2.location;
                                                        }
                                                    } else {
                                                        profileActivity4.getUserConfig().f().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                                    }
                                                    profileActivity4.getMessagesController().h0(null);
                                                } else {
                                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                                    tL_inputPhoto.id = F.id;
                                                    tL_inputPhoto.access_hash = F.access_hash;
                                                    byte[] bArr = F.file_reference;
                                                    tL_inputPhoto.file_reference = bArr;
                                                    if (bArr == null) {
                                                        tL_inputPhoto.file_reference = new byte[0];
                                                    }
                                                    profileActivity4.getMessagesController().h0(tL_inputPhoto);
                                                    cf7 messagesStorage = profileActivity4.getMessagesStorage();
                                                    messagesStorage.a.c(new tc7(messagesStorage, profileActivity4.e1, F.id, (byte) 4));
                                                }
                                                zo8 zo8Var3 = profileActivity4.o0;
                                                ArrayList arrayList2 = zo8Var3.Y0;
                                                ArrayList arrayList3 = zo8Var3.W0;
                                                if (realPosition2 < 0 || realPosition2 >= arrayList3.size()) {
                                                    z2 = false;
                                                } else {
                                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition2);
                                                    if (photo2 == null || (xb7Var = zo8Var3.T0) == null) {
                                                        arrayList3.remove(realPosition2);
                                                        zo8Var3.V0.remove(realPosition2);
                                                        zo8Var3.U0.remove(realPosition2);
                                                        zo8Var3.X0.remove(realPosition2);
                                                        arrayList2.remove(realPosition2);
                                                        zo8Var3.Z0.remove(realPosition2);
                                                        zo8Var3.a1.remove(realPosition2);
                                                        zo8Var3.b1.remove(realPosition2);
                                                        zo8Var3.e1.delete(realPosition2);
                                                        zo8Var3.c1.remove(realPosition2);
                                                        if (realPosition2 == 0 && !arrayList2.isEmpty()) {
                                                            zo8Var3.Q0 = (gn5) arrayList2.get(0);
                                                            zo8Var3.R0 = null;
                                                            zo8Var3.S0 = null;
                                                        }
                                                        zo8Var3.E0.g();
                                                        z2 = arrayList3.isEmpty();
                                                    } else {
                                                        xb7Var.e(photo2.id);
                                                        z2 = true;
                                                    }
                                                }
                                                if (z2 || profileActivity4.o0.getRealCount() <= 0) {
                                                    profileActivity4.o0.setVisibility(8);
                                                    profileActivity4.f0.setForegroundAlpha(1.0f);
                                                    profileActivity4.Y.setVisibility(0);
                                                    profileActivity4.I0 = true;
                                                    View m = profileActivity4.c.m(0);
                                                    if (m != null) {
                                                        profileActivity4.a.x0(0, m.getTop() - profileActivity4.e2(), d53.h);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                profileActivity4.r0.a();
                                                if (profileActivity4.u6 != 0) {
                                                    profileActivity4.getConnectionsManager().cancelRequest(profileActivity4.u6, true);
                                                }
                                                profileActivity4.p2 = (gm.O1() || profileActivity4.o2 || !profileActivity4.f0.getImageReceiver().E() || gm.A1()) ? false : true;
                                                profileActivity4.J2 = null;
                                                profileActivity4.K2 = null;
                                                zo8 zo8Var22 = profileActivity4.o0;
                                                zo8Var22.I0 = true;
                                                zo8Var22.L0 = profileActivity4.L2;
                                                zo8Var22.r1 = null;
                                                zo8Var22.s1 = null;
                                                zo8Var22.setCreateThumbFromParent(false);
                                                profileActivity4.h4(true);
                                                profileActivity4.F3(false, true);
                                                nm7 notificationCenter = profileActivity4.getNotificationCenter();
                                                int i17 = oc7.s5;
                                                notificationCenter.k(2, Integer.valueOf(oc7.s5));
                                                profileActivity4.getNotificationCenter().k(47, new Object[0]);
                                                profileActivity4.getUserConfig().u(true);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder4.g(jb6.M0(2131752542, r6), r6);
                            profileActivity.showDialog(heVar4);
                            TextView textView4 = (TextView) heVar4.c(-1);
                            if (textView4 != null) {
                                anb.X(textView4, cmb.p7, profileActivity.A0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    int realPosition2 = profileActivity.o0.getRealPosition();
                    TLRPC.Photo F = profileActivity.o0.F(realPosition2);
                    if (F != null) {
                        zo8 zo8Var3 = profileActivity.o0;
                        ArrayList arrayList = zo8Var3.c1;
                        ArrayList arrayList2 = zo8Var3.b1;
                        ArrayList arrayList3 = zo8Var3.a1;
                        ArrayList arrayList4 = zo8Var3.Z0;
                        ArrayList arrayList5 = zo8Var3.X0;
                        ArrayList arrayList6 = zo8Var3.V0;
                        ArrayList arrayList7 = zo8Var3.Y0;
                        ArrayList arrayList8 = zo8Var3.W0;
                        xb7 xb7Var = zo8Var3.T0;
                        if (xb7Var != null) {
                            xb7Var.c(realPosition2);
                        } else if (realPosition2 > 0 && realPosition2 < arrayList8.size()) {
                            zo8Var3.d1++;
                            TLRPC.Photo photo = (TLRPC.Photo) arrayList8.get(realPosition2);
                            arrayList8.remove(realPosition2);
                            arrayList8.add(0, photo);
                            String str2 = (String) arrayList6.get(realPosition2);
                            arrayList6.remove(realPosition2);
                            arrayList6.add(0, str2);
                            ArrayList arrayList9 = zo8Var3.U0;
                            arrayList9.add(0, (String) arrayList9.remove(realPosition2));
                            gn5 gn5Var = (gn5) arrayList5.get(realPosition2);
                            arrayList5.remove(realPosition2);
                            arrayList5.add(0, gn5Var);
                            gn5 gn5Var2 = (gn5) arrayList7.get(realPosition2);
                            arrayList7.remove(realPosition2);
                            arrayList7.add(0, gn5Var2);
                            gn5 gn5Var3 = (gn5) arrayList4.get(realPosition2);
                            arrayList4.remove(realPosition2);
                            arrayList4.add(0, gn5Var3);
                            jbc jbcVar = (jbc) arrayList3.get(realPosition2);
                            arrayList3.remove(realPosition2);
                            arrayList3.add(0, jbcVar);
                            Integer num = (Integer) arrayList2.get(realPosition2);
                            arrayList2.remove(realPosition2);
                            arrayList2.add(0, num);
                            Float f2 = (Float) arrayList.get(realPosition2);
                            arrayList.remove(realPosition2);
                            arrayList.add(0, f2);
                            zo8Var3.Q0 = (gn5) arrayList7.get(0);
                        }
                        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
                        tL_inputPhoto.id = F.id;
                        tL_inputPhoto.access_hash = F.access_hash;
                        tL_inputPhoto.file_reference = F.file_reference;
                        z8c userConfig = profileActivity.getUserConfig();
                        profileActivity.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new fm8((Object) this, (Object) userConfig, (Object) F, (byte) 4));
                        profileActivity.M.m(F.video_sizes.isEmpty() ? null : 1, 22, profileActivity.e1);
                        TLRPC.User W14 = profileActivity.getMessagesController().W1(Long.valueOf(userConfig.n));
                        TLRPC.PhotoSize w = bc4.w(F.sizes, 800, false, null, false);
                        if (W14 != null) {
                            TLRPC.PhotoSize w2 = bc4.w(F.sizes, 90, false, null, false);
                            TLRPC.UserProfilePhoto userProfilePhoto = W14.photo;
                            userProfilePhoto.photo_id = F.id;
                            userProfilePhoto.photo_small = w2.location;
                            userProfilePhoto.photo_big = w.location;
                            userConfig.v(W14);
                            userConfig.u(true);
                            i7 = ((d) profileActivity).currentAccount;
                            nm7.f(i7).k(nm7.j0, new Object[0]);
                            profileActivity.h4(true);
                        }
                        zo8 zo8Var4 = profileActivity.o0;
                        zo8Var4.E0.g();
                        zo8Var4.L();
                        return;
                    }
                    return;
                }
            } else {
                i2 = 16;
            }
            profileActivity.U2(i == i2);
        }
    }
}
