package org.telegram.ui;

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
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class rv0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ProfileActivity b;

    public rv0(ProfileActivity profileActivity, Context context) {
        this.b = profileActivity;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        long j3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        TL_bots.BotInfo botInfo;
        int i17;
        int i18;
        org.telegram.ui.Components.dr0 dr0Var;
        if (this.b.getParentActivity() == null) {
            return;
        }
        if (i7 == -1) {
            ProfileActivity profileActivity = this.b;
            vv0 vv0Var = profileActivity.O;
            if (vv0Var == null || (dr0Var = vv0Var.L0) == null || !dr0Var.o0) {
                profileActivity.finishFragment();
                return;
            } else {
                profileActivity.o5();
                return;
            }
        }
        final int i19 = 2;
        int i20 = 0;
        if (i7 == 2) {
            this.b.E4(false);
            return;
        }
        if (i7 == 1) {
            TLRPC.User c22 = this.b.getMessagesController().c2(Long.valueOf(this.b.e1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", c22.id);
            bundle.putBoolean("addContact", true);
            ProfileActivity profileActivity2 = this.b;
            qr qrVar = new qr(bundle, profileActivity2.A0);
            qrVar.P = new yt0(profileActivity2, c22);
            profileActivity2.presentFragment(qrVar);
            return;
        }
        String str = null;
        if (i7 == 3) {
            Bundle l10 = org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true);
            l10.putString("selectAlertString", org.telegram.messenger.gd.M0(2131745435, null));
            l10.putString("selectAlertStringGroup", org.telegram.messenger.gd.M0(2131745436, null));
            cx cxVar = new cx(l10);
            ProfileActivity profileActivity3 = this.b;
            cxVar.E2 = profileActivity3;
            profileActivity3.presentFragment(cxVar);
            return;
        }
        if (i7 == 4) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", this.b.e1);
            ProfileActivity profileActivity4 = this.b;
            profileActivity4.presentFragment(new qr(bundle2, profileActivity4.A0));
            return;
        }
        int i21 = 14;
        if (i7 == 5) {
            TLRPC.User c23 = this.b.getMessagesController().c2(Long.valueOf(this.b.e1));
            if (c23 == null || this.b.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.b.getParentActivity(), this.b.A0);
            alertDialog$Builder.a.S = org.telegram.messenger.gd.M0(2131751541, null);
            alertDialog$Builder.a.U = org.telegram.messenger.gd.M0(2131754101, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new aj0(i21, this, c23));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            this.b.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, this.b.A0);
                return;
            }
            return;
        }
        if (i7 == 7) {
            this.b.z4(false);
            return;
        }
        if (i7 == 45) {
            this.b.z4(true);
            return;
        }
        if (i7 == 46) {
            if (!this.b.getUserConfig().q()) {
                ProfileActivity profileActivity5 = this.b;
                Activity parentActivity = profileActivity5.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.h2) this.b).currentAccount;
                new ug.z0(profileActivity5, parentActivity, i18, false, 41, false, null).show();
                return;
            }
            Context context = this.a;
            org.telegram.ui.ActionBar.i6 i6Var = this.b.A0;
            ru0 ru0Var = new ru0(this, i19);
            Pattern pattern = org.telegram.ui.Components.b5.a;
            if (context == null) {
                return;
            }
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.x2 j10 = org.telegram.messenger.f3.j(1, context, null, false);
            org.telegram.ui.ActionBar.i2 i2Var = j10.y0;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            org.telegram.ui.Components.ph0 ph0Var = new org.telegram.ui.Components.ph0(context);
            linearLayout.addView(ph0Var, c8.ma.t(org.telegram.messenger.ks.v1, org.telegram.messenger.ks.v1, 17, 0, 21, 0, 11));
            ph0Var.f(R.raw.raised_hand, org.telegram.messenger.ks.v1, org.telegram.messenger.ks.v1, null);
            ph0Var.setAutoRepeat(false);
            ph0Var.d();
            TextView textView2 = new TextView(context);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setGravity(17);
            textView2.setText(org.telegram.messenger.gd.M0(2131751411, null));
            textView2.setTextSize(1, 20.0f);
            int i22 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.u6.U(textView2, i22, i6Var);
            linearLayout.addView(textView2, c8.ma.t(-1, -2, 17, 20, 0, 20, 14));
            js0 js0Var = new js0(context, i6Var);
            js0Var.a.l(org.telegram.messenger.gd.M0(2131751410, null), false);
            js0Var.b.setText(org.telegram.messenger.gd.M0(2131751407, null));
            js0Var.d.setVisibility(8);
            js0Var.c.setImageResource(R.drawable.menu_photo_off_24);
            ImageView imageView = js0Var.c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.u6.s(imageView, i22, i6Var, mode);
            linearLayout.addView(js0Var, c8.ma.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            js0 js0Var2 = new js0(context, i6Var);
            js0Var2.a.l(org.telegram.messenger.gd.M0(2131751409, null), false);
            js0Var2.b.setText(org.telegram.messenger.gd.M0(2131751406, null));
            js0Var2.d.setVisibility(8);
            js0Var2.c.setImageResource(R.drawable.menu_share_off_24);
            org.telegram.ui.ActionBar.u6.s(js0Var2.c, i22, i6Var, mode);
            linearLayout.addView(js0Var2, c8.ma.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            js0 js0Var3 = new js0(context, i6Var);
            js0Var3.a.l(org.telegram.messenger.gd.M0(2131751408, null), false);
            js0Var3.b.setText(org.telegram.messenger.gd.M0(2131751405, null));
            js0Var3.d.setVisibility(8);
            js0Var3.c.setImageResource(R.drawable.menu_download_off_24);
            org.telegram.ui.ActionBar.u6.s(js0Var3.c, i22, i6Var, mode);
            linearLayout.addView(js0Var3, c8.ma.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            hi.d dVar = new hi.d(context, i6Var, true);
            dVar.setOnClickListener(new ni.b(27, zArr, i2Var));
            dVar.f();
            dVar.i(org.telegram.messenger.gd.M0(2131751412, null), false, true);
            linearLayout.addView(dVar, c8.ma.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            j10.O = linearLayout;
            j10.show();
            j10.n(new ci(17, zArr, ru0Var));
            return;
        }
        if (i7 == 47) {
            ProfileActivity profileActivity6 = this.b;
            profileActivity6.getMessagesController().p5(profileActivity6.e1, 0, false, new hi.k9(profileActivity6, r8, i19));
            return;
        }
        if (i7 == 23) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.b.getParentActivity());
            alertDialog$Builder2.a.S = org.telegram.messenger.gd.K0(1, "DeleteTopics");
            i17 = ((org.telegram.ui.ActionBar.h2) this.b).currentAccount;
            org.telegram.messenger.e00 e00Var = org.telegram.messenger.mp.u1(i17).t7;
            ProfileActivity profileActivity7 = this.b;
            TLRPC.TL_forumTopic f10 = e00Var.f(profileActivity7.f1, profileActivity7.g1);
            final int i23 = 0;
            alertDialog$Builder2.a.U = org.telegram.messenger.gd.a0("DeleteSelectedTopic", null, 2131751487, f10 == null ? "topic" : f10.title);
            alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131751587, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.pv0
                public final /* synthetic */ rv0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0275 */
                @Override // org.telegram.ui.ActionBar.r1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i24) {
                    org.telegram.ui.ActionBar.s4 s4Var;
                    org.telegram.ui.ActionBar.s4 s4Var2;
                    org.telegram.ui.ActionBar.s4 s4Var3;
                    org.telegram.ui.ActionBar.s4 s4Var4;
                    int i25;
                    int i26;
                    boolean z10;
                    org.telegram.messenger.uo uoVar;
                    TLRPC.Photo photo;
                    int i27 = i23;
                    rv0 rv0Var = this.b;
                    switch (i27) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ProfileActivity profileActivity8 = rv0Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity8.g1));
                            profileActivity8.getMessagesController().t7.d(arrayList, profileActivity8.f1);
                            profileActivity8.J1 = 0;
                            s4Var = ((org.telegram.ui.ActionBar.h2) profileActivity8).parentLayout;
                            if (s4Var != null) {
                                s4Var2 = ((org.telegram.ui.ActionBar.h2) profileActivity8).parentLayout;
                                if (s4Var2.getFragmentStack() != null) {
                                    for (int i28 = 0; i28 < s4Var3.getFragmentStack().size(); i28++) {
                                        s4Var4 = ((org.telegram.ui.ActionBar.h2) profileActivity8).parentLayout;
                                        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) s4Var4.getFragmentStack().get(i28);
                                        if ((h2Var instanceof bn) && ((bn) h2Var).d() == profileActivity8.g1) {
                                            h2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity8.finishFragment();
                            Activity parentActivity2 = profileActivity8.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(parentActivity2), profileActivity8.A0).Q(R.raw.ic_delete, 36, org.telegram.messenger.gd.K0(1, "TopicsDeleted")).j();
                            }
                            u1Var2.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity9 = rv0Var.b;
                            i25 = ((org.telegram.ui.ActionBar.h2) profileActivity9).currentAccount;
                            if (org.telegram.messenger.mp.u1(i25).A2()) {
                                i26 = ((org.telegram.ui.ActionBar.h2) profileActivity9).currentAccount;
                                b.b(i26);
                                break;
                            } else {
                                profileActivity9.j1 = true;
                                profileActivity9.getSecretChatHelper().A(profileActivity9.getParentActivity(), profileActivity9.getMessagesController().c2(Long.valueOf(profileActivity9.e1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity10 = rv0Var.b;
                            int realPosition = profileActivity10.o0.getRealPosition();
                            TLRPC.Photo F = profileActivity10.o0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity10.w2;
                            if (profileActivity10.J2 == null || realPosition != 0) {
                                if (profileActivity10.v5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity10.getMessagesStorage().j2(userFull, true);
                                    profileActivity10.M5(false);
                                }
                                if (profileActivity10.o0.getRealCount() == 1) {
                                    ProfileActivity.G3(profileActivity10, true);
                                }
                                if (F == null || profileActivity10.o0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity10.o0.F(1);
                                    if (F2 != null) {
                                        profileActivity10.getUserConfig().f().photo = new TLRPC.TL_userProfilePhoto();
                                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F2.sizes, 90, false, null, false);
                                        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F2.sizes, 1000, false, null, false);
                                        if (w10 != null && w11 != null) {
                                            profileActivity10.getUserConfig().f().photo.photo_small = w10.location;
                                            profileActivity10.getUserConfig().f().photo.photo_big = w11.location;
                                        }
                                    } else {
                                        profileActivity10.getUserConfig().f().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                    }
                                    profileActivity10.getMessagesController().l0(null);
                                } else {
                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                    tL_inputPhoto.id = F.id;
                                    tL_inputPhoto.access_hash = F.access_hash;
                                    byte[] bArr = F.file_reference;
                                    tL_inputPhoto.file_reference = bArr;
                                    if (bArr == null) {
                                        tL_inputPhoto.file_reference = new byte[0];
                                    }
                                    profileActivity10.getMessagesController().l0(tL_inputPhoto);
                                    org.telegram.messenger.tr messagesStorage = profileActivity10.getMessagesStorage();
                                    messagesStorage.a.c(new org.telegram.messenger.np(4, profileActivity10.e1, F.id, messagesStorage));
                                }
                                av0 av0Var = profileActivity10.o0;
                                ArrayList arrayList2 = av0Var.Y0;
                                ArrayList arrayList3 = av0Var.W0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z10 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (uoVar = av0Var.T0) == null) {
                                        arrayList3.remove(realPosition);
                                        av0Var.V0.remove(realPosition);
                                        av0Var.U0.remove(realPosition);
                                        av0Var.X0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        av0Var.Z0.remove(realPosition);
                                        av0Var.a1.remove(realPosition);
                                        av0Var.b1.remove(realPosition);
                                        av0Var.e1.delete(realPosition);
                                        av0Var.c1.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            av0Var.Q0 = (org.telegram.messenger.fc) arrayList2.get(0);
                                            av0Var.R0 = null;
                                            av0Var.S0 = null;
                                        }
                                        av0Var.E0.g();
                                        z10 = arrayList3.isEmpty();
                                    } else {
                                        uoVar.e(photo2.id);
                                        z10 = true;
                                    }
                                }
                                if (z10 || profileActivity10.o0.getRealCount() <= 0) {
                                    profileActivity10.o0.setVisibility(8);
                                    profileActivity10.f0.setForegroundAlpha(1.0f);
                                    profileActivity10.Y.setVisibility(0);
                                    profileActivity10.I0 = true;
                                    View m10 = profileActivity10.c.m(0);
                                    if (m10 != null) {
                                        profileActivity10.a.w0(0, m10.getTop() - profileActivity10.j4(), org.telegram.ui.Components.lr.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity10.r0.b();
                                if (profileActivity10.p6 != 0) {
                                    profileActivity10.getConnectionsManager().cancelRequest(profileActivity10.p6, true);
                                }
                                profileActivity10.p2 = (org.telegram.messenger.g0.Q1() || profileActivity10.o2 || !profileActivity10.f0.getImageReceiver().L() || org.telegram.messenger.g0.C1()) ? false : true;
                                profileActivity10.J2 = null;
                                profileActivity10.K2 = null;
                                av0 av0Var2 = profileActivity10.o0;
                                av0Var2.I0 = true;
                                av0Var2.L0 = profileActivity10.L2;
                                av0Var2.r1 = null;
                                av0Var2.s1 = null;
                                av0Var2.setCreateThumbFromParent(false);
                                profileActivity10.M5(true);
                                profileActivity10.m5(false, true);
                                profileActivity10.getNotificationCenter().k(2, Integer.valueOf(org.telegram.messenger.mp.I8));
                                profileActivity10.getNotificationCenter().k(46, new Object[0]);
                                profileActivity10.getUserConfig().v(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), new l60(11));
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
            u1Var2.show();
            TextView textView3 = (TextView) u1Var2.d(-1);
            if (textView3 != null) {
                org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.q7, null);
                return;
            }
            return;
        }
        if (i7 == 24) {
            ProfileActivity profileActivity8 = this.b;
            qy0.L0(profileActivity8.a(), profileActivity8);
            return;
        }
        if (i7 == 12) {
            ProfileActivity profileActivity9 = this.b;
            if (profileActivity9.q1) {
                profileActivity9.presentFragment(w81.f0(profileActivity9.f1, profileActivity9.g1));
                return;
            }
            Bundle bundle3 = new Bundle();
            ProfileActivity profileActivity10 = this.b;
            long j11 = profileActivity10.f1;
            if (j11 != 0) {
                bundle3.putLong("chat_id", j11);
            } else if (profileActivity10.s2) {
                bundle3.putLong("user_id", profileActivity10.e1);
            }
            rn rnVar = new rn(bundle3);
            ProfileActivity profileActivity11 = this.b;
            TLRPC.ChatFull chatFull = profileActivity11.v2;
            if (chatFull != null) {
                rnVar.q0(chatFull);
            } else {
                rnVar.r0(profileActivity11.w2);
            }
            this.b.presentFragment(rnVar);
            return;
        }
        if (i7 == 41) {
            this.b.presentFragment(new UserInfoActivity());
            return;
        }
        int i24 = 19;
        int i25 = 9;
        if (i7 == 9) {
            TLRPC.User c24 = this.b.getMessagesController().c2(Long.valueOf(this.b.e1));
            if (c24 == null) {
                return;
            }
            Bundle l11 = org.telegram.ui.Cells.c0.l(2, "onlySelect", "dialogsType", true);
            l11.putBoolean("resetDelegate", false);
            l11.putBoolean("closeFragment", false);
            cx cxVar2 = new cx(l11);
            cxVar2.E2 = new z6(this, c24, cxVar2, i24);
            this.b.presentFragment(cxVar2);
            return;
        }
        if (i7 == 10) {
            this.b.J4();
            return;
        }
        if (i7 == 14) {
            try {
                ProfileActivity profileActivity12 = this.b;
                if (profileActivity12.E2 != null) {
                    j3 = org.telegram.messenger.n5.F(r2.id);
                } else {
                    j3 = profileActivity12.e1;
                    if (j3 == 0) {
                        long j12 = profileActivity12.f1;
                        if (j12 == 0) {
                            return;
                        } else {
                            j3 = -j12;
                        }
                    }
                }
                org.telegram.messenger.ri mediaDataController = this.b.getMediaDataController();
                Pattern pattern2 = org.telegram.messenger.ri.U1;
                mediaDataController.A0(j3, 0, null);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (i7 == 15 || i7 == 16) {
            this.b.F4(i7 == 16);
            return;
        }
        if (i7 == 17) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", this.b.f1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle4.putBoolean("open_search", true);
            rq rqVar = new rq(bundle4);
            rqVar.C0(this.b.v2);
            this.b.presentFragment(rqVar);
            return;
        }
        if (i7 == 18) {
            this.b.M4();
            return;
        }
        if (i7 == 19) {
            this.b.presentFragment(c51.g0(this.b.getMessagesController().O0(Long.valueOf(this.b.f1)), false));
            return;
        }
        if (i7 == 22) {
            this.b.P4();
            return;
        }
        if (i7 == 38) {
            this.b.G4();
            return;
        }
        if (i7 == 48) {
            ProfileActivity profileActivity13 = this.b;
            org.telegram.ui.Wallet.da daVar = new org.telegram.ui.Wallet.da(profileActivity13.getMessagesController().c2(Long.valueOf(this.b.e1)));
            daVar.g0 = true;
            profileActivity13.presentFragment(daVar);
            return;
        }
        if (i7 == 39) {
            Bundle f11 = p5.c.f(2, TeXSymbolParser.TYPE_ATTR);
            f11.putLong("dialog_id", -this.b.f1);
            org.telegram.ui.Components.i90 i90Var = new org.telegram.ui.Components.i90(f11, null);
            ProfileActivity profileActivity14 = this.b;
            i90Var.c = profileActivity14.v2;
            profileActivity14.presentFragment(i90Var);
            return;
        }
        if (i7 == 20) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, this.b.getParentActivity(), this.b.A0);
            alertDialog$Builder3.a.S = org.telegram.messenger.gd.M0(2131754076, null);
            alertDialog$Builder3.a.U = org.telegram.messenger.gd.M0(2131754077, null);
            final int i26 = 1;
            alertDialog$Builder3.k(org.telegram.messenger.gd.M0(2131744680, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.pv0
                public final /* synthetic */ rv0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0275 */
                @Override // org.telegram.ui.ActionBar.r1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void h(org.telegram.ui.ActionBar.u1 u1Var22, int i242) {
                    org.telegram.ui.ActionBar.s4 s4Var;
                    org.telegram.ui.ActionBar.s4 s4Var2;
                    org.telegram.ui.ActionBar.s4 s4Var3;
                    org.telegram.ui.ActionBar.s4 s4Var4;
                    int i252;
                    int i262;
                    boolean z10;
                    org.telegram.messenger.uo uoVar;
                    TLRPC.Photo photo;
                    int i27 = i26;
                    rv0 rv0Var = this.b;
                    switch (i27) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ProfileActivity profileActivity82 = rv0Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity82.g1));
                            profileActivity82.getMessagesController().t7.d(arrayList, profileActivity82.f1);
                            profileActivity82.J1 = 0;
                            s4Var = ((org.telegram.ui.ActionBar.h2) profileActivity82).parentLayout;
                            if (s4Var != null) {
                                s4Var2 = ((org.telegram.ui.ActionBar.h2) profileActivity82).parentLayout;
                                if (s4Var2.getFragmentStack() != null) {
                                    for (int i28 = 0; i28 < s4Var3.getFragmentStack().size(); i28++) {
                                        s4Var4 = ((org.telegram.ui.ActionBar.h2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) s4Var4.getFragmentStack().get(i28);
                                        if ((h2Var instanceof bn) && ((bn) h2Var).d() == profileActivity82.g1) {
                                            h2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(parentActivity2), profileActivity82.A0).Q(R.raw.ic_delete, 36, org.telegram.messenger.gd.K0(1, "TopicsDeleted")).j();
                            }
                            u1Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = rv0Var.b;
                            i252 = ((org.telegram.ui.ActionBar.h2) profileActivity92).currentAccount;
                            if (org.telegram.messenger.mp.u1(i252).A2()) {
                                i262 = ((org.telegram.ui.ActionBar.h2) profileActivity92).currentAccount;
                                b.b(i262);
                                break;
                            } else {
                                profileActivity92.j1 = true;
                                profileActivity92.getSecretChatHelper().A(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().c2(Long.valueOf(profileActivity92.e1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = rv0Var.b;
                            int realPosition = profileActivity102.o0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.o0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity102.w2;
                            if (profileActivity102.J2 == null || realPosition != 0) {
                                if (profileActivity102.v5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().j2(userFull, true);
                                    profileActivity102.M5(false);
                                }
                                if (profileActivity102.o0.getRealCount() == 1) {
                                    ProfileActivity.G3(profileActivity102, true);
                                }
                                if (F == null || profileActivity102.o0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity102.o0.F(1);
                                    if (F2 != null) {
                                        profileActivity102.getUserConfig().f().photo = new TLRPC.TL_userProfilePhoto();
                                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F2.sizes, 90, false, null, false);
                                        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F2.sizes, 1000, false, null, false);
                                        if (w10 != null && w11 != null) {
                                            profileActivity102.getUserConfig().f().photo.photo_small = w10.location;
                                            profileActivity102.getUserConfig().f().photo.photo_big = w11.location;
                                        }
                                    } else {
                                        profileActivity102.getUserConfig().f().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                    }
                                    profileActivity102.getMessagesController().l0(null);
                                } else {
                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                    tL_inputPhoto.id = F.id;
                                    tL_inputPhoto.access_hash = F.access_hash;
                                    byte[] bArr = F.file_reference;
                                    tL_inputPhoto.file_reference = bArr;
                                    if (bArr == null) {
                                        tL_inputPhoto.file_reference = new byte[0];
                                    }
                                    profileActivity102.getMessagesController().l0(tL_inputPhoto);
                                    org.telegram.messenger.tr messagesStorage = profileActivity102.getMessagesStorage();
                                    messagesStorage.a.c(new org.telegram.messenger.np(4, profileActivity102.e1, F.id, messagesStorage));
                                }
                                av0 av0Var = profileActivity102.o0;
                                ArrayList arrayList2 = av0Var.Y0;
                                ArrayList arrayList3 = av0Var.W0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z10 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (uoVar = av0Var.T0) == null) {
                                        arrayList3.remove(realPosition);
                                        av0Var.V0.remove(realPosition);
                                        av0Var.U0.remove(realPosition);
                                        av0Var.X0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        av0Var.Z0.remove(realPosition);
                                        av0Var.a1.remove(realPosition);
                                        av0Var.b1.remove(realPosition);
                                        av0Var.e1.delete(realPosition);
                                        av0Var.c1.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            av0Var.Q0 = (org.telegram.messenger.fc) arrayList2.get(0);
                                            av0Var.R0 = null;
                                            av0Var.S0 = null;
                                        }
                                        av0Var.E0.g();
                                        z10 = arrayList3.isEmpty();
                                    } else {
                                        uoVar.e(photo2.id);
                                        z10 = true;
                                    }
                                }
                                if (z10 || profileActivity102.o0.getRealCount() <= 0) {
                                    profileActivity102.o0.setVisibility(8);
                                    profileActivity102.f0.setForegroundAlpha(1.0f);
                                    profileActivity102.Y.setVisibility(0);
                                    profileActivity102.I0 = true;
                                    View m10 = profileActivity102.c.m(0);
                                    if (m10 != null) {
                                        profileActivity102.a.w0(0, m10.getTop() - profileActivity102.j4(), org.telegram.ui.Components.lr.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity102.r0.b();
                                if (profileActivity102.p6 != 0) {
                                    profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.p6, true);
                                }
                                profileActivity102.p2 = (org.telegram.messenger.g0.Q1() || profileActivity102.o2 || !profileActivity102.f0.getImageReceiver().L() || org.telegram.messenger.g0.C1()) ? false : true;
                                profileActivity102.J2 = null;
                                profileActivity102.K2 = null;
                                av0 av0Var2 = profileActivity102.o0;
                                av0Var2.I0 = true;
                                av0Var2.L0 = profileActivity102.L2;
                                av0Var2.r1 = null;
                                av0Var2.s1 = null;
                                av0Var2.setCreateThumbFromParent(false);
                                profileActivity102.M5(true);
                                profileActivity102.m5(false, true);
                                profileActivity102.getNotificationCenter().k(2, Integer.valueOf(org.telegram.messenger.mp.I8));
                                profileActivity102.getNotificationCenter().k(46, new Object[0]);
                                profileActivity102.getUserConfig().v(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder3.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            this.b.showDialog(alertDialog$Builder3.a);
            return;
        }
        if (i7 == 44) {
            i16 = ((org.telegram.ui.ActionBar.h2) this.b).currentAccount;
            long j13 = this.b.e1;
            TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(i16).d2(j13);
            if (d2 == null || (botInfo = d2.bot_info) == null) {
                return;
            }
            String str2 = botInfo.privacy_policy_url;
            if (str2 == null && str2 == null) {
                ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
                int size = arrayList.size();
                while (true) {
                    if (i20 >= size) {
                        str2 = org.telegram.messenger.gd.M0(2131753096, null);
                        break;
                    }
                    TLRPC.BotCommand botCommand = arrayList.get(i20);
                    i20++;
                    if ("privacy".equals(botCommand.command)) {
                        break;
                    }
                }
            }
            if (str2 != null) {
                vf.c.t(org.telegram.messenger.t0.b, str2);
                return;
            }
            org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
            if (T == null) {
                return;
            }
            if (!(T instanceof bn) || ((bn) T).a() != j13) {
                T.presentFragment(bn.ua(j13));
            }
            org.telegram.messenger.g0.h3(new di.l9(i16, j13, i19), 150L);
            return;
        }
        if (i7 == 21) {
            if (this.b.getParentActivity() == null) {
                return;
            }
            if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.s2.b) && this.b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            av0 av0Var = this.b.o0;
            org.telegram.messenger.fc D = av0Var.D(av0Var.getRealPosition());
            if (D == null) {
                return;
            }
            boolean z10 = D.p == 2;
            i15 = ((org.telegram.ui.ActionBar.h2) this.b).currentAccount;
            org.telegram.messenger.w7.G(i15);
            File J = org.telegram.messenger.w7.J(D.f, z10 ? "mp4" : null, true, true);
            if (z10 && !J.exists()) {
                J = new File(org.telegram.messenger.w7.z(0), org.telegram.messenger.w7.r("mp4", D.f));
            }
            if (J.exists()) {
                MediaController.d0(J.toString(), this.b.getParentActivity(), 0, null, null, new ai.u2(i25, this, z10));
                return;
            }
            return;
        }
        if (i7 == 30) {
            this.b.presentFragment(new UserInfoActivity());
            return;
        }
        if (i7 == 40) {
            ProfileActivity profileActivity15 = this.b;
            lm0 lm0Var = new lm0();
            lm0Var.I = this.b;
            profileActivity15.presentFragment(lm0Var);
            return;
        }
        if (i7 == 42) {
            if (org.telegram.messenger.g0.g(this.b.getMessagesController().X2 + "/" + org.telegram.messenger.o10.o(this.b.getMessagesController().c2(Long.valueOf(this.b.e1))))) {
                org.telegram.ui.Components.lc.b0(this.b).k(false).j();
                return;
            }
            return;
        }
        if (i7 == 43) {
            this.b.presentFragment(new la(null));
            return;
        }
        if (i7 == 31) {
            this.b.presentFragment(new ge0(null));
            return;
        }
        if (i7 != 33) {
            if (i7 == 34) {
                i10 = ((org.telegram.ui.ActionBar.h2) this.b).currentAccount;
                if (org.telegram.messenger.mp.u1(i10).A2()) {
                    i13 = ((org.telegram.ui.ActionBar.h2) this.b).currentAccount;
                    b.b(i13);
                    return;
                }
                int realPosition = this.b.o0.getRealPosition();
                org.telegram.messenger.fc D2 = this.b.o0.D(realPosition);
                if (D2 == null) {
                    return;
                }
                i11 = ((org.telegram.ui.ActionBar.h2) this.b).currentAccount;
                org.telegram.messenger.w7.G(i11);
                Drawable[] drawableArr = PhotoViewer.Z8;
                File J2 = org.telegram.messenger.w7.J(D2.f, PhotoViewer.m1(D2), true, true);
                boolean z11 = D2.p == 2;
                if (z11) {
                    org.telegram.messenger.fc G = this.b.o0.G(realPosition);
                    i12 = ((org.telegram.ui.ActionBar.h2) this.b).currentAccount;
                    org.telegram.messenger.w7.G(i12);
                    str = org.telegram.messenger.w7.J(G != null ? G.f : null, PhotoViewer.m1(G), true, true).getAbsolutePath();
                }
                this.b.r0.p(J2.getAbsolutePath(), str, z11);
                return;
            }
            if (i7 != 35) {
                if (i7 == 36) {
                    this.b.L4();
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.b.getParentActivity(), this.b.A0);
            av0 av0Var2 = this.b.o0;
            org.telegram.messenger.fc D3 = av0Var2.D(av0Var2.getRealPosition());
            if (D3 == null) {
                return;
            }
            if (D3.p == 2) {
                alertDialog$Builder4.a.S = org.telegram.messenger.gd.M0(2131754081, null);
                alertDialog$Builder4.a.U = org.telegram.messenger.gd.M0(2131754083, null);
            } else {
                alertDialog$Builder4.a.S = org.telegram.messenger.gd.M0(2131754092, null);
                alertDialog$Builder4.a.U = org.telegram.messenger.gd.M0(2131754094, null);
            }
            alertDialog$Builder4.k(org.telegram.messenger.gd.M0(2131751587, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.pv0
                public final /* synthetic */ rv0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0275 */
                @Override // org.telegram.ui.ActionBar.r1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void h(org.telegram.ui.ActionBar.u1 u1Var22, int i242) {
                    org.telegram.ui.ActionBar.s4 s4Var;
                    org.telegram.ui.ActionBar.s4 s4Var2;
                    org.telegram.ui.ActionBar.s4 s4Var3;
                    org.telegram.ui.ActionBar.s4 s4Var4;
                    int i252;
                    int i262;
                    boolean z102;
                    org.telegram.messenger.uo uoVar;
                    TLRPC.Photo photo;
                    int i27 = i19;
                    rv0 rv0Var = this.b;
                    switch (i27) {
                        case 0:
                            ArrayList arrayList2 = new ArrayList();
                            ProfileActivity profileActivity82 = rv0Var.b;
                            arrayList2.add(Integer.valueOf((int) profileActivity82.g1));
                            profileActivity82.getMessagesController().t7.d(arrayList2, profileActivity82.f1);
                            profileActivity82.J1 = 0;
                            s4Var = ((org.telegram.ui.ActionBar.h2) profileActivity82).parentLayout;
                            if (s4Var != null) {
                                s4Var2 = ((org.telegram.ui.ActionBar.h2) profileActivity82).parentLayout;
                                if (s4Var2.getFragmentStack() != null) {
                                    for (int i28 = 0; i28 < s4Var3.getFragmentStack().size(); i28++) {
                                        s4Var4 = ((org.telegram.ui.ActionBar.h2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) s4Var4.getFragmentStack().get(i28);
                                        if ((h2Var instanceof bn) && ((bn) h2Var).d() == profileActivity82.g1) {
                                            h2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(parentActivity2), profileActivity82.A0).Q(R.raw.ic_delete, 36, org.telegram.messenger.gd.K0(1, "TopicsDeleted")).j();
                            }
                            u1Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = rv0Var.b;
                            i252 = ((org.telegram.ui.ActionBar.h2) profileActivity92).currentAccount;
                            if (org.telegram.messenger.mp.u1(i252).A2()) {
                                i262 = ((org.telegram.ui.ActionBar.h2) profileActivity92).currentAccount;
                                b.b(i262);
                                break;
                            } else {
                                profileActivity92.j1 = true;
                                profileActivity92.getSecretChatHelper().A(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().c2(Long.valueOf(profileActivity92.e1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = rv0Var.b;
                            int realPosition2 = profileActivity102.o0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.o0.F(realPosition2);
                            TLRPC.UserFull userFull = profileActivity102.w2;
                            if (profileActivity102.J2 == null || realPosition2 != 0) {
                                if (profileActivity102.v5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().j2(userFull, true);
                                    profileActivity102.M5(false);
                                }
                                if (profileActivity102.o0.getRealCount() == 1) {
                                    ProfileActivity.G3(profileActivity102, true);
                                }
                                if (F == null || profileActivity102.o0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity102.o0.F(1);
                                    if (F2 != null) {
                                        profileActivity102.getUserConfig().f().photo = new TLRPC.TL_userProfilePhoto();
                                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F2.sizes, 90, false, null, false);
                                        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F2.sizes, 1000, false, null, false);
                                        if (w10 != null && w11 != null) {
                                            profileActivity102.getUserConfig().f().photo.photo_small = w10.location;
                                            profileActivity102.getUserConfig().f().photo.photo_big = w11.location;
                                        }
                                    } else {
                                        profileActivity102.getUserConfig().f().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                    }
                                    profileActivity102.getMessagesController().l0(null);
                                } else {
                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                    tL_inputPhoto.id = F.id;
                                    tL_inputPhoto.access_hash = F.access_hash;
                                    byte[] bArr = F.file_reference;
                                    tL_inputPhoto.file_reference = bArr;
                                    if (bArr == null) {
                                        tL_inputPhoto.file_reference = new byte[0];
                                    }
                                    profileActivity102.getMessagesController().l0(tL_inputPhoto);
                                    org.telegram.messenger.tr messagesStorage = profileActivity102.getMessagesStorage();
                                    messagesStorage.a.c(new org.telegram.messenger.np(4, profileActivity102.e1, F.id, messagesStorage));
                                }
                                av0 av0Var3 = profileActivity102.o0;
                                ArrayList arrayList22 = av0Var3.Y0;
                                ArrayList arrayList3 = av0Var3.W0;
                                if (realPosition2 < 0 || realPosition2 >= arrayList3.size()) {
                                    z102 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition2);
                                    if (photo2 == null || (uoVar = av0Var3.T0) == null) {
                                        arrayList3.remove(realPosition2);
                                        av0Var3.V0.remove(realPosition2);
                                        av0Var3.U0.remove(realPosition2);
                                        av0Var3.X0.remove(realPosition2);
                                        arrayList22.remove(realPosition2);
                                        av0Var3.Z0.remove(realPosition2);
                                        av0Var3.a1.remove(realPosition2);
                                        av0Var3.b1.remove(realPosition2);
                                        av0Var3.e1.delete(realPosition2);
                                        av0Var3.c1.remove(realPosition2);
                                        if (realPosition2 == 0 && !arrayList22.isEmpty()) {
                                            av0Var3.Q0 = (org.telegram.messenger.fc) arrayList22.get(0);
                                            av0Var3.R0 = null;
                                            av0Var3.S0 = null;
                                        }
                                        av0Var3.E0.g();
                                        z102 = arrayList3.isEmpty();
                                    } else {
                                        uoVar.e(photo2.id);
                                        z102 = true;
                                    }
                                }
                                if (z102 || profileActivity102.o0.getRealCount() <= 0) {
                                    profileActivity102.o0.setVisibility(8);
                                    profileActivity102.f0.setForegroundAlpha(1.0f);
                                    profileActivity102.Y.setVisibility(0);
                                    profileActivity102.I0 = true;
                                    View m10 = profileActivity102.c.m(0);
                                    if (m10 != null) {
                                        profileActivity102.a.w0(0, m10.getTop() - profileActivity102.j4(), org.telegram.ui.Components.lr.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity102.r0.b();
                                if (profileActivity102.p6 != 0) {
                                    profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.p6, true);
                                }
                                profileActivity102.p2 = (org.telegram.messenger.g0.Q1() || profileActivity102.o2 || !profileActivity102.f0.getImageReceiver().L() || org.telegram.messenger.g0.C1()) ? false : true;
                                profileActivity102.J2 = null;
                                profileActivity102.K2 = null;
                                av0 av0Var22 = profileActivity102.o0;
                                av0Var22.I0 = true;
                                av0Var22.L0 = profileActivity102.L2;
                                av0Var22.r1 = null;
                                av0Var22.s1 = null;
                                av0Var22.setCreateThumbFromParent(false);
                                profileActivity102.M5(true);
                                profileActivity102.m5(false, true);
                                profileActivity102.getNotificationCenter().k(2, Integer.valueOf(org.telegram.messenger.mp.I8));
                                profileActivity102.getNotificationCenter().k(46, new Object[0]);
                                profileActivity102.getUserConfig().v(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder4.a;
            this.b.showDialog(u1Var3);
            TextView textView4 = (TextView) u1Var3.d(-1);
            if (textView4 != null) {
                org.telegram.ui.ActionBar.u6.U(textView4, org.telegram.ui.ActionBar.n6.q7, this.b.A0);
                return;
            }
            return;
        }
        int realPosition2 = this.b.o0.getRealPosition();
        TLRPC.Photo F = this.b.o0.F(realPosition2);
        if (F == null) {
            return;
        }
        av0 av0Var3 = this.b.o0;
        ArrayList arrayList2 = av0Var3.c1;
        ArrayList arrayList3 = av0Var3.b1;
        ArrayList arrayList4 = av0Var3.a1;
        ArrayList arrayList5 = av0Var3.Z0;
        ArrayList arrayList6 = av0Var3.X0;
        ArrayList arrayList7 = av0Var3.V0;
        ArrayList arrayList8 = av0Var3.Y0;
        ArrayList arrayList9 = av0Var3.W0;
        org.telegram.messenger.uo uoVar = av0Var3.T0;
        if (uoVar != null) {
            uoVar.c(realPosition2);
        } else if (realPosition2 > 0 && realPosition2 < arrayList9.size()) {
            av0Var3.d1++;
            TLRPC.Photo photo = (TLRPC.Photo) arrayList9.get(realPosition2);
            arrayList9.remove(realPosition2);
            arrayList9.add(0, photo);
            String str3 = (String) arrayList7.get(realPosition2);
            arrayList7.remove(realPosition2);
            arrayList7.add(0, str3);
            ArrayList arrayList10 = av0Var3.U0;
            arrayList10.add(0, (String) arrayList10.remove(realPosition2));
            org.telegram.messenger.fc fcVar = (org.telegram.messenger.fc) arrayList6.get(realPosition2);
            arrayList6.remove(realPosition2);
            arrayList6.add(0, fcVar);
            org.telegram.messenger.fc fcVar2 = (org.telegram.messenger.fc) arrayList8.get(realPosition2);
            arrayList8.remove(realPosition2);
            arrayList8.add(0, fcVar2);
            org.telegram.messenger.fc fcVar3 = (org.telegram.messenger.fc) arrayList5.get(realPosition2);
            arrayList5.remove(realPosition2);
            arrayList5.add(0, fcVar3);
            org.telegram.ui.Components.q51 q51Var = (org.telegram.ui.Components.q51) arrayList4.get(realPosition2);
            arrayList4.remove(realPosition2);
            arrayList4.add(0, q51Var);
            Integer num = (Integer) arrayList3.get(realPosition2);
            arrayList3.remove(realPosition2);
            arrayList3.add(0, num);
            Float f12 = (Float) arrayList2.get(realPosition2);
            arrayList2.remove(realPosition2);
            arrayList2.add(0, f12);
            av0Var3.Q0 = (org.telegram.messenger.fc) arrayList8.get(0);
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        tL_inputPhoto.id = F.id;
        tL_inputPhoto.access_hash = F.access_hash;
        tL_inputPhoto.file_reference = F.file_reference;
        org.telegram.messenger.j10 userConfig = this.b.getUserConfig();
        this.b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new mo0(this, userConfig, F, 6));
        ProfileActivity profileActivity16 = this.b;
        profileActivity16.M.m(profileActivity16.e1, F.video_sizes.isEmpty() ? null : 1, 22);
        TLRPC.User c25 = this.b.getMessagesController().c2(Long.valueOf(userConfig.n));
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F.sizes, 800, false, null, false);
        if (c25 != null) {
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F.sizes, 90, false, null, false);
            TLRPC.UserProfilePhoto userProfilePhoto = c25.photo;
            userProfilePhoto.photo_id = F.id;
            userProfilePhoto.photo_small = w11.location;
            userProfilePhoto.photo_big = w10.location;
            userConfig.w(c25);
            userConfig.v(true);
            i14 = ((org.telegram.ui.ActionBar.h2) this.b).currentAccount;
            org.telegram.messenger.ks.f(i14).k(org.telegram.messenger.ks.j0, new Object[0]);
            this.b.M5(true);
        }
        av0 av0Var4 = this.b.o0;
        av0Var4.E0.g();
        av0Var4.L();
    }
}
