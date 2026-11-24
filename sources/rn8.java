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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rn8 extends c6 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ProfileActivity b;

    public rn8(ProfileActivity profileActivity, Context context) {
        this.b = profileActivity;
        this.a = context;
    }

    @Override // c6
    public final void b(int i) {
        long j;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        TL_bots.BotInfo botInfo;
        int i9;
        int i10;
        kda kdaVar;
        if (this.b.getParentActivity() != null) {
            if (i == -1) {
                ProfileActivity profileActivity = this.b;
                vn8 vn8Var = profileActivity.O;
                if (vn8Var == null || (kdaVar = vn8Var.L0) == null || !kdaVar.o0) {
                    profileActivity.finishFragment();
                    return;
                } else {
                    profileActivity.E3();
                    return;
                }
            }
            int i11 = 0;
            if (i == 2) {
                this.b.Q2(false);
                return;
            }
            final byte b = 1;
            if (i == 1) {
                TLRPC.User V1 = this.b.getMessagesController().V1(Long.valueOf(this.b.e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", V1.id);
                bundle.putBoolean("addContact", true);
                ProfileActivity profileActivity2 = this.b;
                it2 it2Var = new it2(bundle, profileActivity2.A0);
                it2Var.P = new ul8(profileActivity2, V1);
                profileActivity2.presentFragment(it2Var);
                return;
            }
            String str = null;
            if (i == 3) {
                Bundle j2 = tb4.j(3, "onlySelect", "dialogsType", true);
                j2.putString("selectAlertString", k96.M0(2131745438, null));
                j2.putString("selectAlertStringGroup", k96.M0(2131745439, null));
                cj3 cj3Var = new cj3(j2);
                ProfileActivity profileActivity3 = this.b;
                cj3Var.E2 = profileActivity3;
                profileActivity3.presentFragment(cj3Var);
                return;
            }
            if (i == 4) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.b.e1);
                ProfileActivity profileActivity4 = this.b;
                profileActivity4.presentFragment(new it2(bundle2, profileActivity4.A0));
                return;
            }
            byte b2 = 28;
            if (i == 5) {
                TLRPC.User V12 = this.b.getMessagesController().V1(Long.valueOf(this.b.e1));
                if (V12 == null || this.b.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.b.A0, this.b.getParentActivity());
                alertDialog$Builder.a.S = k96.M0(2131751540, null);
                alertDialog$Builder.a.U = k96.M0(2131754100, null);
                alertDialog$Builder.j(k96.M0(2131751586, null), new dx6(this, V12, b2));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                hd hdVar = alertDialog$Builder.a;
                this.b.showDialog(hdVar);
                TextView textView = (TextView) hdVar.c(-1);
                if (textView != null) {
                    zkb.X(textView, bkb.p7, this.b.A0);
                    return;
                }
                return;
            }
            if (i == 7) {
                this.b.K2(false);
                return;
            }
            if (i == 45) {
                this.b.K2(true);
                return;
            }
            byte b3 = 22;
            if (i == 46) {
                if (!this.b.getUserConfig().p()) {
                    ProfileActivity profileActivity5 = this.b;
                    Activity parentActivity = profileActivity5.getParentActivity();
                    i10 = ((d) this.b).currentAccount;
                    new jh8(profileActivity5, parentActivity, i10, false, 41, false, null).show();
                    return;
                }
                Context context = this.a;
                wjb wjbVar = this.b.A0;
                w88 w88Var = new w88(this, b3);
                Pattern pattern = ij.a;
                if (context != null) {
                    boolean[] zArr = new boolean[1];
                    fx0 h = de9.h(1, null, context, false);
                    rw0 rw0Var = h.y0;
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    linearLayout.setClipChildren(false);
                    linearLayout.setClipToPadding(false);
                    ry8 ry8Var = new ry8(context);
                    linearLayout.addView(ry8Var, nme.t(kk7.u1, kk7.u1, 17, 0, 21, 0, 11));
                    ry8Var.f(R.raw.raised_hand, kk7.u1, kk7.u1, null);
                    ry8Var.setAutoRepeat(false);
                    ry8Var.d();
                    TextView textView2 = new TextView(context);
                    textView2.setTypeface(gl.o());
                    textView2.setGravity(17);
                    textView2.setText(k96.M0(2131751410, null));
                    textView2.setTextSize(1, 20.0f);
                    int i12 = bkb.F6;
                    zkb.X(textView2, i12, wjbVar);
                    linearLayout.addView(textView2, nme.t(-1, -2, 17, 20, 0, 20, 14));
                    kh8 kh8Var = new kh8(context, wjbVar);
                    kh8Var.a.l(k96.M0(2131751409, null), false);
                    kh8Var.b.setText(k96.M0(2131751406, null));
                    kh8Var.d.setVisibility(8);
                    kh8Var.c.setImageResource(R.drawable.menu_photo_off_24);
                    ImageView imageView = kh8Var.c;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                    zkb.s(imageView, i12, wjbVar, mode);
                    linearLayout.addView(kh8Var, nme.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                    kh8 kh8Var2 = new kh8(context, wjbVar);
                    kh8Var2.a.l(k96.M0(2131751408, null), false);
                    kh8Var2.b.setText(k96.M0(2131751405, null));
                    kh8Var2.d.setVisibility(8);
                    kh8Var2.c.setImageResource(R.drawable.menu_share_off_24);
                    zkb.s(kh8Var2.c, i12, wjbVar, mode);
                    linearLayout.addView(kh8Var2, nme.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                    kh8 kh8Var3 = new kh8(context, wjbVar);
                    kh8Var3.a.l(k96.M0(2131751407, null), false);
                    kh8Var3.b.setText(k96.M0(2131751404, null));
                    kh8Var3.d.setVisibility(8);
                    kh8Var3.c.setImageResource(R.drawable.menu_download_off_24);
                    zkb.s(kh8Var3.c, i12, wjbVar, mode);
                    linearLayout.addView(kh8Var3, nme.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                    u41 u41Var = new u41(wjbVar, context, true);
                    u41Var.setOnClickListener(new t(zArr, rw0Var, (byte) 16));
                    u41Var.f();
                    u41Var.i(k96.M0(2131751411, null), false, true);
                    linearLayout.addView(u41Var, nme.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                    h.O = linearLayout;
                    h.show();
                    h.n(new ee2(zArr, w88Var, (byte) 23));
                    return;
                }
                return;
            }
            if (i == 47) {
                ProfileActivity profileActivity6 = this.b;
                profileActivity6.getMessagesController().j5(profileActivity6.e1, 0, false, new vn2(profileActivity6, r8, b));
                return;
            }
            if (i == 23) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.b.getParentActivity());
                alertDialog$Builder2.a.S = k96.J0(1, "DeleteTopics");
                i9 = ((d) this.b).currentAccount;
                pub pubVar = na7.q1(i9).g4;
                ProfileActivity profileActivity7 = this.b;
                TLRPC.TL_forumTopic f = pubVar.f(profileActivity7.f1, profileActivity7.g1);
                final byte b4 = 0;
                alertDialog$Builder2.a.U = k96.a0("DeleteSelectedTopic", null, 2131751486, f == null ? "topic" : f.title);
                alertDialog$Builder2.j(k96.M0(2131751586, null), new ed(this) { // from class: pn8
                    public final /* synthetic */ rn8 b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Incorrect condition in loop: B:85:0x0276 */
                    @Override // ed
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void u(hd hdVar2, int i13) {
                        ui5 ui5Var;
                        ui5 ui5Var2;
                        ui5 ui5Var3;
                        ui5 ui5Var4;
                        int i14;
                        int i15;
                        boolean z;
                        w97 w97Var;
                        TLRPC.Photo photo;
                        byte b5 = b4;
                        rn8 rn8Var = this.b;
                        switch (b5) {
                            case 0:
                                ArrayList arrayList = new ArrayList();
                                ProfileActivity profileActivity8 = rn8Var.b;
                                arrayList.add(Integer.valueOf((int) profileActivity8.g1));
                                profileActivity8.getMessagesController().g4.d(arrayList, profileActivity8.f1);
                                profileActivity8.J1 = (byte) 0;
                                ui5Var = ((d) profileActivity8).parentLayout;
                                if (ui5Var != null) {
                                    ui5Var2 = ((d) profileActivity8).parentLayout;
                                    if (ui5Var2.getFragmentStack() != null) {
                                        for (int i16 = 0; i16 < ui5Var3.getFragmentStack().size(); i16++) {
                                            ui5Var4 = ((d) profileActivity8).parentLayout;
                                            d dVar = (d) ui5Var4.getFragmentStack().get(i16);
                                            if ((dVar instanceof mu1) && ((mu1) dVar).d() == profileActivity8.g1) {
                                                dVar.removeSelfFromStack();
                                            }
                                        }
                                    }
                                }
                                profileActivity8.finishFragment();
                                Activity parentActivity2 = profileActivity8.getParentActivity();
                                if (parentActivity2 != null) {
                                    new u21(f11.a(parentActivity2), profileActivity8.A0).Q(R.raw.ic_delete, 36, k96.J0(1, "TopicsDeleted")).j();
                                }
                                hdVar2.dismiss();
                                break;
                            case 1:
                                ProfileActivity profileActivity9 = rn8Var.b;
                                i14 = ((d) profileActivity9).currentAccount;
                                if (na7.q1(i14).t2()) {
                                    i15 = ((d) profileActivity9).currentAccount;
                                    h5.b(i15);
                                    break;
                                } else {
                                    profileActivity9.j1 = true;
                                    profileActivity9.getSecretChatHelper().A(profileActivity9.getParentActivity(), profileActivity9.getMessagesController().V1(Long.valueOf(profileActivity9.e1)));
                                    break;
                                }
                            default:
                                ProfileActivity profileActivity10 = rn8Var.b;
                                int realPosition = profileActivity10.o0.getRealPosition();
                                TLRPC.Photo F = profileActivity10.o0.F(realPosition);
                                TLRPC.UserFull userFull = profileActivity10.w2;
                                if (profileActivity10.J2 == null || realPosition != 0) {
                                    if (profileActivity10.v5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                        userFull.fallback_photo = null;
                                        userFull.flags &= -4194305;
                                        profileActivity10.getMessagesStorage().g2(userFull, true);
                                        profileActivity10.d4(false);
                                    }
                                    if (profileActivity10.o0.getRealCount() == 1) {
                                        profileActivity10.s3(true);
                                    }
                                    if (F == null || profileActivity10.o0.getRealPosition() == 0) {
                                        TLRPC.Photo F2 = profileActivity10.o0.F(1);
                                        if (F2 != null) {
                                            profileActivity10.getUserConfig().f().photo = new TLRPC.TL_userProfilePhoto();
                                            TLRPC.PhotoSize w = ba4.w(F2.sizes, 90, false, null, false);
                                            TLRPC.PhotoSize w2 = ba4.w(F2.sizes, 1000, false, null, false);
                                            if (w != null && w2 != null) {
                                                profileActivity10.getUserConfig().f().photo.photo_small = w.location;
                                                profileActivity10.getUserConfig().f().photo.photo_big = w2.location;
                                            }
                                        } else {
                                            profileActivity10.getUserConfig().f().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                        }
                                        profileActivity10.getMessagesController().h0(null);
                                    } else {
                                        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                        tL_inputPhoto.id = F.id;
                                        tL_inputPhoto.access_hash = F.access_hash;
                                        byte[] bArr = F.file_reference;
                                        tL_inputPhoto.file_reference = bArr;
                                        if (bArr == null) {
                                            tL_inputPhoto.file_reference = new byte[0];
                                        }
                                        profileActivity10.getMessagesController().h0(tL_inputPhoto);
                                        ad7 messagesStorage = profileActivity10.getMessagesStorage();
                                        messagesStorage.a.c(new sa7(messagesStorage, profileActivity10.e1, F.id, (byte) 4));
                                    }
                                    ym8 ym8Var = profileActivity10.o0;
                                    ArrayList arrayList2 = ym8Var.Y0;
                                    ArrayList arrayList3 = ym8Var.W0;
                                    if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                        z = false;
                                    } else {
                                        TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                        if (photo2 == null || (w97Var = ym8Var.T0) == null) {
                                            arrayList3.remove(realPosition);
                                            ym8Var.V0.remove(realPosition);
                                            ym8Var.U0.remove(realPosition);
                                            ym8Var.X0.remove(realPosition);
                                            arrayList2.remove(realPosition);
                                            ym8Var.Z0.remove(realPosition);
                                            ym8Var.a1.remove(realPosition);
                                            ym8Var.b1.remove(realPosition);
                                            ym8Var.e1.delete(realPosition);
                                            ym8Var.c1.remove(realPosition);
                                            if (realPosition == 0 && !arrayList2.isEmpty()) {
                                                ym8Var.Q0 = (gl5) arrayList2.get(0);
                                                ym8Var.R0 = null;
                                                ym8Var.S0 = null;
                                            }
                                            ym8Var.E0.g();
                                            z = arrayList3.isEmpty();
                                        } else {
                                            w97Var.e(photo2.id);
                                            z = true;
                                        }
                                    }
                                    if (z || profileActivity10.o0.getRealCount() <= 0) {
                                        profileActivity10.o0.setVisibility(8);
                                        profileActivity10.f0.setForegroundAlpha(1.0f);
                                        profileActivity10.Y.setVisibility(0);
                                        profileActivity10.I0 = true;
                                        View m = profileActivity10.c.m(0);
                                        if (m != null) {
                                            profileActivity10.a.x0(0, m.getTop() - profileActivity10.c2(), s33.h);
                                            break;
                                        }
                                    }
                                } else {
                                    profileActivity10.r0.a();
                                    if (profileActivity10.p6 != 0) {
                                        profileActivity10.getConnectionsManager().cancelRequest(profileActivity10.p6, true);
                                    }
                                    profileActivity10.p2 = (gl.O1() || profileActivity10.o2 || !profileActivity10.f0.getImageReceiver().E() || gl.A1()) ? false : true;
                                    profileActivity10.J2 = null;
                                    profileActivity10.K2 = null;
                                    ym8 ym8Var2 = profileActivity10.o0;
                                    ym8Var2.I0 = true;
                                    ym8Var2.L0 = profileActivity10.L2;
                                    ym8Var2.r1 = null;
                                    ym8Var2.s1 = null;
                                    ym8Var2.setCreateThumbFromParent(false);
                                    profileActivity10.d4(true);
                                    profileActivity10.B3(false, true);
                                    kk7 notificationCenter = profileActivity10.getNotificationCenter();
                                    int i17 = na7.q5;
                                    notificationCenter.k(2, Integer.valueOf(na7.q5));
                                    profileActivity10.getNotificationCenter().k(46, new Object[0]);
                                    profileActivity10.getUserConfig().u(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                alertDialog$Builder2.g(k96.M0(2131752577, null), new sc8((byte) 3));
                hd hdVar2 = alertDialog$Builder2.a;
                hdVar2.show();
                TextView textView3 = (TextView) hdVar2.c(-1);
                if (textView3 != null) {
                    zkb.X(textView3, bkb.p7, null);
                    return;
                }
                return;
            }
            byte b5 = 24;
            if (i == 24) {
                ProfileActivity profileActivity8 = this.b;
                b89.E0(profileActivity8.a(), profileActivity8);
                return;
            }
            if (i == 12) {
                ProfileActivity profileActivity9 = this.b;
                if (profileActivity9.q1) {
                    profileActivity9.presentFragment(vtb.e0(profileActivity9.f1, profileActivity9.g1));
                    return;
                }
                Bundle bundle3 = new Bundle();
                ProfileActivity profileActivity10 = this.b;
                long j3 = profileActivity10.f1;
                if (j3 != 0) {
                    bundle3.putLong("chat_id", j3);
                } else if (profileActivity10.s2) {
                    bundle3.putLong("user_id", profileActivity10.e1);
                }
                p82 p82Var = new p82(bundle3);
                ProfileActivity profileActivity11 = this.b;
                TLRPC.ChatFull chatFull = profileActivity11.v2;
                if (chatFull != null) {
                    p82Var.p0(chatFull);
                } else {
                    p82Var.q0(profileActivity11.w2);
                }
                this.b.presentFragment(p82Var);
                return;
            }
            if (i == 41) {
                this.b.presentFragment(new UserInfoActivity());
                return;
            }
            if (i == 9) {
                TLRPC.User V13 = this.b.getMessagesController().V1(Long.valueOf(this.b.e1));
                if (V13 != null) {
                    Bundle j4 = tb4.j(2, "onlySelect", "dialogsType", true);
                    j4.putBoolean("resetDelegate", false);
                    j4.putBoolean("closeFragment", false);
                    cj3 cj3Var2 = new cj3(j4);
                    cj3Var2.E2 = new lt2(this, V13, cj3Var2, b5);
                    this.b.presentFragment(cj3Var2);
                    return;
                }
                return;
            }
            if (i == 10) {
                this.b.V2();
                return;
            }
            if (i == 14) {
                try {
                    ProfileActivity profileActivity12 = this.b;
                    if (profileActivity12.E2 != null) {
                        j = cf3.E(r2.id);
                    } else {
                        long j5 = profileActivity12.e1;
                        if (j5 != 0) {
                            j = j5;
                        } else {
                            long j6 = profileActivity12.f1;
                            if (j6 == 0) {
                                return;
                            } else {
                                j = -j6;
                            }
                        }
                    }
                    hq6 mediaDataController = this.b.getMediaDataController();
                    Pattern pattern2 = hq6.U1;
                    mediaDataController.z0(j, 0, null);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            }
            if (i == 15 || i == 16) {
                this.b.R2(i == 16);
                return;
            }
            if (i == 17) {
                Bundle bundle4 = new Bundle();
                bundle4.putLong("chat_id", this.b.f1);
                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                bundle4.putBoolean("open_search", true);
                kf2 kf2Var = new kf2(bundle4);
                kf2Var.A0(this.b.v2);
                this.b.presentFragment(kf2Var);
                return;
            }
            if (i == 18) {
                this.b.Y2();
                return;
            }
            if (i == 19) {
                this.b.presentFragment(uxa.d0(this.b.getMessagesController().K0(Long.valueOf(this.b.f1)), false));
                return;
            }
            if (i == 22) {
                this.b.b3();
                return;
            }
            if (i == 38) {
                this.b.S2();
                return;
            }
            if (i == 48) {
                ProfileActivity profileActivity13 = this.b;
                qpc qpcVar = new qpc(profileActivity13.getMessagesController().V1(Long.valueOf(this.b.e1)));
                qpcVar.g0 = true;
                profileActivity13.presentFragment(qpcVar);
                return;
            }
            if (i == 39) {
                Bundle j7 = ls6.j(2, TeXSymbolParser.TYPE_ATTR);
                j7.putLong("dialog_id", -this.b.f1);
                zj6 zj6Var = new zj6(j7, null);
                ProfileActivity profileActivity14 = this.b;
                zj6Var.c = profileActivity14.v2;
                profileActivity14.presentFragment(zj6Var);
                return;
            }
            if (i == 20) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, this.b.A0, this.b.getParentActivity());
                alertDialog$Builder3.a.S = k96.M0(2131754075, null);
                alertDialog$Builder3.a.U = k96.M0(2131754076, null);
                alertDialog$Builder3.j(k96.M0(2131744678, null), new ed(this) { // from class: pn8
                    public final /* synthetic */ rn8 b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Incorrect condition in loop: B:85:0x0276 */
                    @Override // ed
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void u(hd hdVar22, int i13) {
                        ui5 ui5Var;
                        ui5 ui5Var2;
                        ui5 ui5Var3;
                        ui5 ui5Var4;
                        int i14;
                        int i15;
                        boolean z;
                        w97 w97Var;
                        TLRPC.Photo photo;
                        byte b52 = b;
                        rn8 rn8Var = this.b;
                        switch (b52) {
                            case 0:
                                ArrayList arrayList = new ArrayList();
                                ProfileActivity profileActivity82 = rn8Var.b;
                                arrayList.add(Integer.valueOf((int) profileActivity82.g1));
                                profileActivity82.getMessagesController().g4.d(arrayList, profileActivity82.f1);
                                profileActivity82.J1 = (byte) 0;
                                ui5Var = ((d) profileActivity82).parentLayout;
                                if (ui5Var != null) {
                                    ui5Var2 = ((d) profileActivity82).parentLayout;
                                    if (ui5Var2.getFragmentStack() != null) {
                                        for (int i16 = 0; i16 < ui5Var3.getFragmentStack().size(); i16++) {
                                            ui5Var4 = ((d) profileActivity82).parentLayout;
                                            d dVar = (d) ui5Var4.getFragmentStack().get(i16);
                                            if ((dVar instanceof mu1) && ((mu1) dVar).d() == profileActivity82.g1) {
                                                dVar.removeSelfFromStack();
                                            }
                                        }
                                    }
                                }
                                profileActivity82.finishFragment();
                                Activity parentActivity2 = profileActivity82.getParentActivity();
                                if (parentActivity2 != null) {
                                    new u21(f11.a(parentActivity2), profileActivity82.A0).Q(R.raw.ic_delete, 36, k96.J0(1, "TopicsDeleted")).j();
                                }
                                hdVar22.dismiss();
                                break;
                            case 1:
                                ProfileActivity profileActivity92 = rn8Var.b;
                                i14 = ((d) profileActivity92).currentAccount;
                                if (na7.q1(i14).t2()) {
                                    i15 = ((d) profileActivity92).currentAccount;
                                    h5.b(i15);
                                    break;
                                } else {
                                    profileActivity92.j1 = true;
                                    profileActivity92.getSecretChatHelper().A(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().V1(Long.valueOf(profileActivity92.e1)));
                                    break;
                                }
                            default:
                                ProfileActivity profileActivity102 = rn8Var.b;
                                int realPosition = profileActivity102.o0.getRealPosition();
                                TLRPC.Photo F = profileActivity102.o0.F(realPosition);
                                TLRPC.UserFull userFull = profileActivity102.w2;
                                if (profileActivity102.J2 == null || realPosition != 0) {
                                    if (profileActivity102.v5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                        userFull.fallback_photo = null;
                                        userFull.flags &= -4194305;
                                        profileActivity102.getMessagesStorage().g2(userFull, true);
                                        profileActivity102.d4(false);
                                    }
                                    if (profileActivity102.o0.getRealCount() == 1) {
                                        profileActivity102.s3(true);
                                    }
                                    if (F == null || profileActivity102.o0.getRealPosition() == 0) {
                                        TLRPC.Photo F2 = profileActivity102.o0.F(1);
                                        if (F2 != null) {
                                            profileActivity102.getUserConfig().f().photo = new TLRPC.TL_userProfilePhoto();
                                            TLRPC.PhotoSize w = ba4.w(F2.sizes, 90, false, null, false);
                                            TLRPC.PhotoSize w2 = ba4.w(F2.sizes, 1000, false, null, false);
                                            if (w != null && w2 != null) {
                                                profileActivity102.getUserConfig().f().photo.photo_small = w.location;
                                                profileActivity102.getUserConfig().f().photo.photo_big = w2.location;
                                            }
                                        } else {
                                            profileActivity102.getUserConfig().f().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                        }
                                        profileActivity102.getMessagesController().h0(null);
                                    } else {
                                        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                        tL_inputPhoto.id = F.id;
                                        tL_inputPhoto.access_hash = F.access_hash;
                                        byte[] bArr = F.file_reference;
                                        tL_inputPhoto.file_reference = bArr;
                                        if (bArr == null) {
                                            tL_inputPhoto.file_reference = new byte[0];
                                        }
                                        profileActivity102.getMessagesController().h0(tL_inputPhoto);
                                        ad7 messagesStorage = profileActivity102.getMessagesStorage();
                                        messagesStorage.a.c(new sa7(messagesStorage, profileActivity102.e1, F.id, (byte) 4));
                                    }
                                    ym8 ym8Var = profileActivity102.o0;
                                    ArrayList arrayList2 = ym8Var.Y0;
                                    ArrayList arrayList3 = ym8Var.W0;
                                    if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                        z = false;
                                    } else {
                                        TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                        if (photo2 == null || (w97Var = ym8Var.T0) == null) {
                                            arrayList3.remove(realPosition);
                                            ym8Var.V0.remove(realPosition);
                                            ym8Var.U0.remove(realPosition);
                                            ym8Var.X0.remove(realPosition);
                                            arrayList2.remove(realPosition);
                                            ym8Var.Z0.remove(realPosition);
                                            ym8Var.a1.remove(realPosition);
                                            ym8Var.b1.remove(realPosition);
                                            ym8Var.e1.delete(realPosition);
                                            ym8Var.c1.remove(realPosition);
                                            if (realPosition == 0 && !arrayList2.isEmpty()) {
                                                ym8Var.Q0 = (gl5) arrayList2.get(0);
                                                ym8Var.R0 = null;
                                                ym8Var.S0 = null;
                                            }
                                            ym8Var.E0.g();
                                            z = arrayList3.isEmpty();
                                        } else {
                                            w97Var.e(photo2.id);
                                            z = true;
                                        }
                                    }
                                    if (z || profileActivity102.o0.getRealCount() <= 0) {
                                        profileActivity102.o0.setVisibility(8);
                                        profileActivity102.f0.setForegroundAlpha(1.0f);
                                        profileActivity102.Y.setVisibility(0);
                                        profileActivity102.I0 = true;
                                        View m = profileActivity102.c.m(0);
                                        if (m != null) {
                                            profileActivity102.a.x0(0, m.getTop() - profileActivity102.c2(), s33.h);
                                            break;
                                        }
                                    }
                                } else {
                                    profileActivity102.r0.a();
                                    if (profileActivity102.p6 != 0) {
                                        profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.p6, true);
                                    }
                                    profileActivity102.p2 = (gl.O1() || profileActivity102.o2 || !profileActivity102.f0.getImageReceiver().E() || gl.A1()) ? false : true;
                                    profileActivity102.J2 = null;
                                    profileActivity102.K2 = null;
                                    ym8 ym8Var2 = profileActivity102.o0;
                                    ym8Var2.I0 = true;
                                    ym8Var2.L0 = profileActivity102.L2;
                                    ym8Var2.r1 = null;
                                    ym8Var2.s1 = null;
                                    ym8Var2.setCreateThumbFromParent(false);
                                    profileActivity102.d4(true);
                                    profileActivity102.B3(false, true);
                                    kk7 notificationCenter = profileActivity102.getNotificationCenter();
                                    int i17 = na7.q5;
                                    notificationCenter.k(2, Integer.valueOf(na7.q5));
                                    profileActivity102.getNotificationCenter().k(46, new Object[0]);
                                    profileActivity102.getUserConfig().u(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                alertDialog$Builder3.g(k96.M0(2131752577, null), null);
                this.b.showDialog(alertDialog$Builder3.a);
                return;
            }
            if (i == 44) {
                i8 = ((d) this.b).currentAccount;
                long j8 = this.b.e1;
                TLRPC.UserFull W1 = na7.q1(i8).W1(j8);
                if (W1 == null || (botInfo = W1.bot_info) == null) {
                    return;
                }
                String str2 = botInfo.privacy_policy_url;
                if (str2 == null && str2 == null) {
                    ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
                    int size = arrayList.size();
                    while (true) {
                        if (i11 >= size) {
                            str2 = k96.M0(2131753095, null);
                            break;
                        }
                        TLRPC.BotCommand botCommand = arrayList.get(i11);
                        i11++;
                        if ("privacy".equals(botCommand.command)) {
                            break;
                        }
                    }
                }
                if (str2 != null) {
                    d01.t(a.b, str2);
                    return;
                }
                d S = LaunchActivity.S();
                if (S != null) {
                    if (!(S instanceof mu1) || ((mu1) S).a() != j8) {
                        S.presentFragment(mu1.W9(j8));
                    }
                    gl.d3(new am0(i8, j8, b), 150L);
                    return;
                }
                return;
            }
            if (i == 21) {
                if (this.b.getParentActivity() != null) {
                    if ((Build.VERSION.SDK_INT <= 28 || w01.b) && this.b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        this.b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                    ym8 ym8Var = this.b.o0;
                    gl5 D = ym8Var.D(ym8Var.getRealPosition());
                    if (D != null) {
                        boolean z = D.p == 2;
                        i7 = ((d) this.b).currentAccount;
                        ba4.G(i7);
                        File J = ba4.J(D.f, z ? "mp4" : null, true, true);
                        if (z && !J.exists()) {
                            J = new File(ba4.z(0), ba4.r("mp4", D.f));
                        }
                        if (J.exists()) {
                            MediaController.d0(J.toString(), this.b.getParentActivity(), 0, null, null, new ra((byte) 5, this, z));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 30) {
                this.b.presentFragment(new UserInfoActivity());
                return;
            }
            if (i == 40) {
                ProfileActivity profileActivity15 = this.b;
                a18 a18Var = new a18();
                a18Var.I = this.b;
                profileActivity15.presentFragment(a18Var);
                return;
            }
            if (i == 42) {
                if (gl.g(this.b.getMessagesController().N2 + "/" + l7c.p(this.b.getMessagesController().V1(Long.valueOf(this.b.e1))))) {
                    u21.b0(this.b).k(false).j();
                    return;
                }
                return;
            }
            if (i == 43) {
                this.b.presentFragment(new me1(null));
                return;
            }
            if (i == 31) {
                this.b.presentFragment(new pf6(null));
                return;
            }
            if (i != 33) {
                if (i == 34) {
                    i2 = ((d) this.b).currentAccount;
                    boolean t2 = na7.q1(i2).t2();
                    ProfileActivity profileActivity16 = this.b;
                    if (t2) {
                        i5 = ((d) profileActivity16).currentAccount;
                        h5.b(i5);
                        return;
                    }
                    int realPosition = profileActivity16.o0.getRealPosition();
                    gl5 D2 = this.b.o0.D(realPosition);
                    if (D2 != null) {
                        i3 = ((d) this.b).currentAccount;
                        ba4.G(i3);
                        Drawable[] drawableArr = PhotoViewer.d9;
                        File J2 = ba4.J(D2.f, PhotoViewer.o0(D2), true, true);
                        boolean z2 = D2.p == 2;
                        if (z2) {
                            gl5 G = this.b.o0.G(realPosition);
                            i4 = ((d) this.b).currentAccount;
                            ba4.G(i4);
                            str = ba4.J(G != null ? G.f : null, PhotoViewer.o0(G), true, true).getAbsolutePath();
                        }
                        this.b.r0.p(J2.getAbsolutePath(), str, z2);
                        return;
                    }
                    return;
                }
                if (i != 35) {
                    if (i == 36) {
                        this.b.X2();
                        return;
                    }
                    return;
                }
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.b.A0, this.b.getParentActivity());
                ym8 ym8Var2 = this.b.o0;
                gl5 D3 = ym8Var2.D(ym8Var2.getRealPosition());
                if (D3 != null) {
                    if (D3.p == 2) {
                        alertDialog$Builder4.a.S = k96.M0(2131754080, null);
                        alertDialog$Builder4.a.U = k96.M0(2131754082, null);
                    } else {
                        alertDialog$Builder4.a.S = k96.M0(2131754091, null);
                        alertDialog$Builder4.a.U = k96.M0(2131754093, null);
                    }
                    final byte b6 = 2;
                    alertDialog$Builder4.j(k96.M0(2131751586, null), new ed(this) { // from class: pn8
                        public final /* synthetic */ rn8 b;

                        {
                            this.b = this;
                        }

                        /* JADX WARN: Incorrect condition in loop: B:85:0x0276 */
                        @Override // ed
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void u(hd hdVar22, int i13) {
                            ui5 ui5Var;
                            ui5 ui5Var2;
                            ui5 ui5Var3;
                            ui5 ui5Var4;
                            int i14;
                            int i15;
                            boolean z3;
                            w97 w97Var;
                            TLRPC.Photo photo;
                            byte b52 = b6;
                            rn8 rn8Var = this.b;
                            switch (b52) {
                                case 0:
                                    ArrayList arrayList2 = new ArrayList();
                                    ProfileActivity profileActivity82 = rn8Var.b;
                                    arrayList2.add(Integer.valueOf((int) profileActivity82.g1));
                                    profileActivity82.getMessagesController().g4.d(arrayList2, profileActivity82.f1);
                                    profileActivity82.J1 = (byte) 0;
                                    ui5Var = ((d) profileActivity82).parentLayout;
                                    if (ui5Var != null) {
                                        ui5Var2 = ((d) profileActivity82).parentLayout;
                                        if (ui5Var2.getFragmentStack() != null) {
                                            for (int i16 = 0; i16 < ui5Var3.getFragmentStack().size(); i16++) {
                                                ui5Var4 = ((d) profileActivity82).parentLayout;
                                                d dVar = (d) ui5Var4.getFragmentStack().get(i16);
                                                if ((dVar instanceof mu1) && ((mu1) dVar).d() == profileActivity82.g1) {
                                                    dVar.removeSelfFromStack();
                                                }
                                            }
                                        }
                                    }
                                    profileActivity82.finishFragment();
                                    Activity parentActivity2 = profileActivity82.getParentActivity();
                                    if (parentActivity2 != null) {
                                        new u21(f11.a(parentActivity2), profileActivity82.A0).Q(R.raw.ic_delete, 36, k96.J0(1, "TopicsDeleted")).j();
                                    }
                                    hdVar22.dismiss();
                                    break;
                                case 1:
                                    ProfileActivity profileActivity92 = rn8Var.b;
                                    i14 = ((d) profileActivity92).currentAccount;
                                    if (na7.q1(i14).t2()) {
                                        i15 = ((d) profileActivity92).currentAccount;
                                        h5.b(i15);
                                        break;
                                    } else {
                                        profileActivity92.j1 = true;
                                        profileActivity92.getSecretChatHelper().A(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().V1(Long.valueOf(profileActivity92.e1)));
                                        break;
                                    }
                                default:
                                    ProfileActivity profileActivity102 = rn8Var.b;
                                    int realPosition2 = profileActivity102.o0.getRealPosition();
                                    TLRPC.Photo F = profileActivity102.o0.F(realPosition2);
                                    TLRPC.UserFull userFull = profileActivity102.w2;
                                    if (profileActivity102.J2 == null || realPosition2 != 0) {
                                        if (profileActivity102.v5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                            userFull.fallback_photo = null;
                                            userFull.flags &= -4194305;
                                            profileActivity102.getMessagesStorage().g2(userFull, true);
                                            profileActivity102.d4(false);
                                        }
                                        if (profileActivity102.o0.getRealCount() == 1) {
                                            profileActivity102.s3(true);
                                        }
                                        if (F == null || profileActivity102.o0.getRealPosition() == 0) {
                                            TLRPC.Photo F2 = profileActivity102.o0.F(1);
                                            if (F2 != null) {
                                                profileActivity102.getUserConfig().f().photo = new TLRPC.TL_userProfilePhoto();
                                                TLRPC.PhotoSize w = ba4.w(F2.sizes, 90, false, null, false);
                                                TLRPC.PhotoSize w2 = ba4.w(F2.sizes, 1000, false, null, false);
                                                if (w != null && w2 != null) {
                                                    profileActivity102.getUserConfig().f().photo.photo_small = w.location;
                                                    profileActivity102.getUserConfig().f().photo.photo_big = w2.location;
                                                }
                                            } else {
                                                profileActivity102.getUserConfig().f().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                            }
                                            profileActivity102.getMessagesController().h0(null);
                                        } else {
                                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                            tL_inputPhoto.id = F.id;
                                            tL_inputPhoto.access_hash = F.access_hash;
                                            byte[] bArr = F.file_reference;
                                            tL_inputPhoto.file_reference = bArr;
                                            if (bArr == null) {
                                                tL_inputPhoto.file_reference = new byte[0];
                                            }
                                            profileActivity102.getMessagesController().h0(tL_inputPhoto);
                                            ad7 messagesStorage = profileActivity102.getMessagesStorage();
                                            messagesStorage.a.c(new sa7(messagesStorage, profileActivity102.e1, F.id, (byte) 4));
                                        }
                                        ym8 ym8Var3 = profileActivity102.o0;
                                        ArrayList arrayList22 = ym8Var3.Y0;
                                        ArrayList arrayList3 = ym8Var3.W0;
                                        if (realPosition2 < 0 || realPosition2 >= arrayList3.size()) {
                                            z3 = false;
                                        } else {
                                            TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition2);
                                            if (photo2 == null || (w97Var = ym8Var3.T0) == null) {
                                                arrayList3.remove(realPosition2);
                                                ym8Var3.V0.remove(realPosition2);
                                                ym8Var3.U0.remove(realPosition2);
                                                ym8Var3.X0.remove(realPosition2);
                                                arrayList22.remove(realPosition2);
                                                ym8Var3.Z0.remove(realPosition2);
                                                ym8Var3.a1.remove(realPosition2);
                                                ym8Var3.b1.remove(realPosition2);
                                                ym8Var3.e1.delete(realPosition2);
                                                ym8Var3.c1.remove(realPosition2);
                                                if (realPosition2 == 0 && !arrayList22.isEmpty()) {
                                                    ym8Var3.Q0 = (gl5) arrayList22.get(0);
                                                    ym8Var3.R0 = null;
                                                    ym8Var3.S0 = null;
                                                }
                                                ym8Var3.E0.g();
                                                z3 = arrayList3.isEmpty();
                                            } else {
                                                w97Var.e(photo2.id);
                                                z3 = true;
                                            }
                                        }
                                        if (z3 || profileActivity102.o0.getRealCount() <= 0) {
                                            profileActivity102.o0.setVisibility(8);
                                            profileActivity102.f0.setForegroundAlpha(1.0f);
                                            profileActivity102.Y.setVisibility(0);
                                            profileActivity102.I0 = true;
                                            View m = profileActivity102.c.m(0);
                                            if (m != null) {
                                                profileActivity102.a.x0(0, m.getTop() - profileActivity102.c2(), s33.h);
                                                break;
                                            }
                                        }
                                    } else {
                                        profileActivity102.r0.a();
                                        if (profileActivity102.p6 != 0) {
                                            profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.p6, true);
                                        }
                                        profileActivity102.p2 = (gl.O1() || profileActivity102.o2 || !profileActivity102.f0.getImageReceiver().E() || gl.A1()) ? false : true;
                                        profileActivity102.J2 = null;
                                        profileActivity102.K2 = null;
                                        ym8 ym8Var22 = profileActivity102.o0;
                                        ym8Var22.I0 = true;
                                        ym8Var22.L0 = profileActivity102.L2;
                                        ym8Var22.r1 = null;
                                        ym8Var22.s1 = null;
                                        ym8Var22.setCreateThumbFromParent(false);
                                        profileActivity102.d4(true);
                                        profileActivity102.B3(false, true);
                                        kk7 notificationCenter = profileActivity102.getNotificationCenter();
                                        int i17 = na7.q5;
                                        notificationCenter.k(2, Integer.valueOf(na7.q5));
                                        profileActivity102.getNotificationCenter().k(46, new Object[0]);
                                        profileActivity102.getUserConfig().u(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder4.g(k96.M0(2131752577, null), null);
                    hd hdVar3 = alertDialog$Builder4.a;
                    this.b.showDialog(hdVar3);
                    TextView textView4 = (TextView) hdVar3.c(-1);
                    if (textView4 != null) {
                        zkb.X(textView4, bkb.p7, this.b.A0);
                        return;
                    }
                    return;
                }
                return;
            }
            int realPosition2 = this.b.o0.getRealPosition();
            TLRPC.Photo F = this.b.o0.F(realPosition2);
            if (F != null) {
                ym8 ym8Var3 = this.b.o0;
                ArrayList arrayList2 = ym8Var3.c1;
                ArrayList arrayList3 = ym8Var3.b1;
                ArrayList arrayList4 = ym8Var3.a1;
                ArrayList arrayList5 = ym8Var3.Z0;
                ArrayList arrayList6 = ym8Var3.X0;
                ArrayList arrayList7 = ym8Var3.V0;
                ArrayList arrayList8 = ym8Var3.Y0;
                ArrayList arrayList9 = ym8Var3.W0;
                w97 w97Var = ym8Var3.T0;
                if (w97Var != null) {
                    w97Var.c(realPosition2);
                } else if (realPosition2 > 0 && realPosition2 < arrayList9.size()) {
                    ym8Var3.d1++;
                    TLRPC.Photo photo = (TLRPC.Photo) arrayList9.get(realPosition2);
                    arrayList9.remove(realPosition2);
                    arrayList9.add(0, photo);
                    String str3 = (String) arrayList7.get(realPosition2);
                    arrayList7.remove(realPosition2);
                    arrayList7.add(0, str3);
                    ArrayList arrayList10 = ym8Var3.U0;
                    arrayList10.add(0, (String) arrayList10.remove(realPosition2));
                    gl5 gl5Var = (gl5) arrayList6.get(realPosition2);
                    arrayList6.remove(realPosition2);
                    arrayList6.add(0, gl5Var);
                    gl5 gl5Var2 = (gl5) arrayList8.get(realPosition2);
                    arrayList8.remove(realPosition2);
                    arrayList8.add(0, gl5Var2);
                    gl5 gl5Var3 = (gl5) arrayList5.get(realPosition2);
                    arrayList5.remove(realPosition2);
                    arrayList5.add(0, gl5Var3);
                    i9c i9cVar = (i9c) arrayList4.get(realPosition2);
                    arrayList4.remove(realPosition2);
                    arrayList4.add(0, i9cVar);
                    Integer num = (Integer) arrayList3.get(realPosition2);
                    arrayList3.remove(realPosition2);
                    arrayList3.add(0, num);
                    Float f2 = (Float) arrayList2.get(realPosition2);
                    arrayList2.remove(realPosition2);
                    arrayList2.add(0, f2);
                    ym8Var3.Q0 = (gl5) arrayList8.get(0);
                }
                TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_photos_updateProfilePhoto.id = tL_inputPhoto;
                tL_inputPhoto.id = F.id;
                tL_inputPhoto.access_hash = F.access_hash;
                tL_inputPhoto.file_reference = F.file_reference;
                y6c userConfig = this.b.getUserConfig();
                this.b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ck8((Object) this, (Object) userConfig, (Object) F, (byte) 4));
                ProfileActivity profileActivity17 = this.b;
                profileActivity17.M.m(F.video_sizes.isEmpty() ? null : 1, 22, profileActivity17.e1);
                TLRPC.User V14 = this.b.getMessagesController().V1(Long.valueOf(userConfig.n));
                TLRPC.PhotoSize w = ba4.w(F.sizes, 800, false, null, false);
                if (V14 != null) {
                    TLRPC.PhotoSize w2 = ba4.w(F.sizes, 90, false, null, false);
                    TLRPC.UserProfilePhoto userProfilePhoto = V14.photo;
                    userProfilePhoto.photo_id = F.id;
                    userProfilePhoto.photo_small = w2.location;
                    userProfilePhoto.photo_big = w.location;
                    userConfig.v(V14);
                    userConfig.u(true);
                    i6 = ((d) this.b).currentAccount;
                    kk7.f(i6).k(kk7.i0, new Object[0]);
                    this.b.d4(true);
                }
                ym8 ym8Var4 = this.b.o0;
                ym8Var4.E0.g();
                ym8Var4.L();
            }
        }
    }
}
