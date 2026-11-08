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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
        org.telegram.ui.Components.tq0 tq0Var;
        if (this.b.getParentActivity() == null) {
            return;
        }
        if (i7 == -1) {
            ProfileActivity profileActivity = this.b;
            vv0 vv0Var = profileActivity.N;
            if (vv0Var == null || (tq0Var = vv0Var.K0) == null || !tq0Var.n0) {
                profileActivity.finishFragment();
                return;
            } else {
                profileActivity.l5();
                return;
            }
        }
        int i19 = 0;
        if (i7 == 2) {
            this.b.B4(false);
            return;
        }
        if (i7 == 1) {
            TLRPC.User a22 = this.b.getMessagesController().a2(Long.valueOf(this.b.d1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", a22.id);
            bundle.putBoolean("addContact", true);
            ProfileActivity profileActivity2 = this.b;
            nr nrVar = new nr(bundle, profileActivity2.z0);
            nrVar.O = new xt0(profileActivity2, a22);
            profileActivity2.presentFragment(nrVar);
            return;
        }
        String str = null;
        if (i7 == 3) {
            Bundle h = org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true);
            h.putString("selectAlertString", org.telegram.messenger.id.M0(2131745633, null));
            h.putString("selectAlertStringGroup", org.telegram.messenger.id.M0(2131745634, null));
            ww wwVar = new ww(h);
            ProfileActivity profileActivity3 = this.b;
            wwVar.C2 = profileActivity3;
            profileActivity3.presentFragment(wwVar);
            return;
        }
        if (i7 == 4) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", this.b.d1);
            ProfileActivity profileActivity4 = this.b;
            profileActivity4.presentFragment(new nr(bundle2, profileActivity4.z0));
            return;
        }
        if (i7 == 5) {
            TLRPC.User a23 = this.b.getMessagesController().a2(Long.valueOf(this.b.d1));
            if (a23 == null || this.b.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.b.getParentActivity(), this.b.z0);
            alertDialog$Builder.a.R = org.telegram.messenger.id.M0(2131751553, null);
            alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131754103, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751599, null), new lk0(11, this, a23));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            this.b.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, this.b.z0);
                return;
            }
            return;
        }
        if (i7 == 7) {
            this.b.w4(false);
            return;
        }
        if (i7 == 45) {
            this.b.w4(true);
            return;
        }
        int i20 = 8;
        if (i7 == 46) {
            if (!this.b.getUserConfig().q()) {
                ProfileActivity profileActivity5 = this.b;
                Activity parentActivity = profileActivity5.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.f2) this.b).currentAccount;
                new ug.w0(profileActivity5, parentActivity, i18, false, 41, false, null).show();
                return;
            }
            Context context = this.a;
            org.telegram.ui.ActionBar.f6 f6Var = this.b.z0;
            ru0 ru0Var = new ru0(this, 2);
            Pattern pattern = org.telegram.ui.Components.v4.a;
            if (context == null) {
                return;
            }
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, null, false);
            org.telegram.ui.ActionBar.g2 g2Var = l10.x0;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
            linearLayout.addView(ch0Var, c8.ha.t(org.telegram.messenger.qs.v1, org.telegram.messenger.qs.v1, 17, 0, 21, 0, 11));
            ch0Var.f(R.raw.raised_hand, org.telegram.messenger.qs.v1, org.telegram.messenger.qs.v1, null);
            ch0Var.setAutoRepeat(false);
            ch0Var.d();
            TextView textView2 = new TextView(context);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setGravity(17);
            textView2.setText(org.telegram.messenger.id.M0(2131751423, null));
            textView2.setTextSize(1, 20.0f);
            int i21 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(textView2, i21, f6Var);
            linearLayout.addView(textView2, c8.ha.t(-1, -2, 17, 20, 0, 20, 14));
            is0 is0Var = new is0(context, f6Var);
            is0Var.a.l(org.telegram.messenger.id.M0(2131751422, null), false);
            is0Var.b.setText(org.telegram.messenger.id.M0(2131751419, null));
            is0Var.d.setVisibility(8);
            is0Var.c.setImageResource(R.drawable.menu_photo_off_24);
            ImageView imageView = is0Var.c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.r6.t(imageView, i21, f6Var, mode);
            linearLayout.addView(is0Var, c8.ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            is0 is0Var2 = new is0(context, f6Var);
            is0Var2.a.l(org.telegram.messenger.id.M0(2131751421, null), false);
            is0Var2.b.setText(org.telegram.messenger.id.M0(2131751418, null));
            is0Var2.d.setVisibility(8);
            is0Var2.c.setImageResource(R.drawable.menu_share_off_24);
            org.telegram.ui.ActionBar.r6.t(is0Var2.c, i21, f6Var, mode);
            linearLayout.addView(is0Var2, c8.ha.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            is0 is0Var3 = new is0(context, f6Var);
            is0Var3.a.l(org.telegram.messenger.id.M0(2131751420, null), false);
            is0Var3.b.setText(org.telegram.messenger.id.M0(2131751417, null));
            is0Var3.d.setVisibility(8);
            is0Var3.c.setImageResource(R.drawable.menu_download_off_24);
            org.telegram.ui.ActionBar.r6.t(is0Var3.c, i21, f6Var, mode);
            linearLayout.addView(is0Var3, c8.ha.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            fi.d dVar = new fi.d(context, f6Var, true);
            dVar.setOnClickListener(new org.telegram.ui.ActionBar.l1(24, zArr, g2Var));
            dVar.f();
            dVar.i(org.telegram.messenger.id.M0(2131751424, null), false, true);
            linearLayout.addView(dVar, c8.ha.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            l10.N = linearLayout;
            l10.show();
            l10.n(new org.telegram.ui.Components.f(2, zArr, ru0Var));
            return;
        }
        if (i7 == 47) {
            ProfileActivity profileActivity6 = this.b;
            profileActivity6.getMessagesController().d5(profileActivity6.d1, 0, false, new fi.m9(2, profileActivity6, false));
            return;
        }
        if (i7 == 23) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.b.getParentActivity());
            alertDialog$Builder2.a.R = org.telegram.messenger.id.K0(1, "DeleteTopics");
            i17 = ((org.telegram.ui.ActionBar.f2) this.b).currentAccount;
            org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(i17).q7;
            ProfileActivity profileActivity7 = this.b;
            TLRPC.TL_forumTopic f10 = k00Var.f(profileActivity7.e1, profileActivity7.f1);
            final int i22 = 0;
            alertDialog$Builder2.a.T = org.telegram.messenger.id.a0("DeleteSelectedTopic", null, 2131751499, f10 == null ? "topic" : f10.title);
            alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131751599, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.pv0
                public final /* synthetic */ rv0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0275 */
                @Override // org.telegram.ui.ActionBar.r1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i23) {
                    org.telegram.ui.ActionBar.q4 q4Var;
                    org.telegram.ui.ActionBar.q4 q4Var2;
                    org.telegram.ui.ActionBar.q4 q4Var3;
                    org.telegram.ui.ActionBar.q4 q4Var4;
                    int i24;
                    int i25;
                    boolean z9;
                    org.telegram.messenger.yo yoVar;
                    TLRPC.Photo photo;
                    int i26 = i22;
                    rv0 rv0Var = this.b;
                    switch (i26) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ProfileActivity profileActivity8 = rv0Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity8.f1));
                            profileActivity8.getMessagesController().q7.d(arrayList, profileActivity8.e1);
                            profileActivity8.I1 = 0;
                            q4Var = ((org.telegram.ui.ActionBar.f2) profileActivity8).parentLayout;
                            if (q4Var != null) {
                                q4Var2 = ((org.telegram.ui.ActionBar.f2) profileActivity8).parentLayout;
                                if (q4Var2.getFragmentStack() != null) {
                                    for (int i27 = 0; i27 < q4Var3.getFragmentStack().size(); i27++) {
                                        q4Var4 = ((org.telegram.ui.ActionBar.f2) profileActivity8).parentLayout;
                                        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) q4Var4.getFragmentStack().get(i27);
                                        if ((f2Var instanceof an) && ((an) f2Var).b() == profileActivity8.f1) {
                                            f2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity8.finishFragment();
                            Activity parentActivity2 = profileActivity8.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(parentActivity2), profileActivity8.z0).Q(R.raw.ic_delete, 36, org.telegram.messenger.id.K0(1, "TopicsDeleted")).j();
                            }
                            u1Var2.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity9 = rv0Var.b;
                            i24 = ((org.telegram.ui.ActionBar.f2) profileActivity9).currentAccount;
                            if (org.telegram.messenger.qp.s1(i24).v2()) {
                                i25 = ((org.telegram.ui.ActionBar.f2) profileActivity9).currentAccount;
                                b.b(i25);
                                break;
                            } else {
                                profileActivity9.i1 = true;
                                profileActivity9.getSecretChatHelper().A(profileActivity9.getParentActivity(), profileActivity9.getMessagesController().a2(Long.valueOf(profileActivity9.d1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity10 = rv0Var.b;
                            int realPosition = profileActivity10.n0.getRealPosition();
                            TLRPC.Photo F = profileActivity10.n0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity10.u2;
                            if (profileActivity10.H2 == null || realPosition != 0) {
                                if (profileActivity10.p5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity10.getMessagesStorage().j2(userFull, true);
                                    profileActivity10.I5(false);
                                }
                                if (profileActivity10.n0.getRealCount() == 1) {
                                    ProfileActivity.G3(profileActivity10, true);
                                }
                                if (F == null || profileActivity10.n0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity10.n0.F(1);
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
                                    org.telegram.messenger.yr messagesStorage = profileActivity10.getMessagesStorage();
                                    messagesStorage.a.c(new org.telegram.messenger.vp(4, profileActivity10.d1, F.id, messagesStorage));
                                }
                                av0 av0Var = profileActivity10.n0;
                                ArrayList arrayList2 = av0Var.X0;
                                ArrayList arrayList3 = av0Var.V0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z9 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (yoVar = av0Var.S0) == null) {
                                        arrayList3.remove(realPosition);
                                        av0Var.U0.remove(realPosition);
                                        av0Var.T0.remove(realPosition);
                                        av0Var.W0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        av0Var.Y0.remove(realPosition);
                                        av0Var.Z0.remove(realPosition);
                                        av0Var.a1.remove(realPosition);
                                        av0Var.d1.delete(realPosition);
                                        av0Var.b1.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            av0Var.P0 = (org.telegram.messenger.hc) arrayList2.get(0);
                                            av0Var.Q0 = null;
                                            av0Var.R0 = null;
                                        }
                                        av0Var.D0.g();
                                        z9 = arrayList3.isEmpty();
                                    } else {
                                        yoVar.e(photo2.id);
                                        z9 = true;
                                    }
                                }
                                if (z9 || profileActivity10.n0.getRealCount() <= 0) {
                                    profileActivity10.n0.setVisibility(8);
                                    profileActivity10.e0.setForegroundAlpha(1.0f);
                                    profileActivity10.X.setVisibility(0);
                                    profileActivity10.H0 = true;
                                    View m10 = profileActivity10.c.m(0);
                                    if (m10 != null) {
                                        profileActivity10.a.w0(0, m10.getTop() - profileActivity10.j4(), org.telegram.ui.Components.xq.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity10.q0.b();
                                if (profileActivity10.i6 != 0) {
                                    profileActivity10.getConnectionsManager().cancelRequest(profileActivity10.i6, true);
                                }
                                profileActivity10.n2 = (org.telegram.messenger.g0.Q1() || profileActivity10.m2 || !profileActivity10.e0.getImageReceiver().L() || org.telegram.messenger.g0.C1()) ? false : true;
                                profileActivity10.H2 = null;
                                profileActivity10.I2 = null;
                                av0 av0Var2 = profileActivity10.n0;
                                av0Var2.H0 = true;
                                av0Var2.K0 = profileActivity10.J2;
                                av0Var2.q1 = null;
                                av0Var2.r1 = null;
                                av0Var2.setCreateThumbFromParent(false);
                                profileActivity10.I5(true);
                                profileActivity10.j5(false, true);
                                profileActivity10.getNotificationCenter().k(2, Integer.valueOf(org.telegram.messenger.qp.C8));
                                profileActivity10.getNotificationCenter().k(46, new Object[0]);
                                profileActivity10.getUserConfig().v(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), new go0(4));
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
            u1Var2.show();
            TextView textView3 = (TextView) u1Var2.d(-1);
            if (textView3 != null) {
                org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            return;
        }
        if (i7 == 24) {
            ProfileActivity profileActivity8 = this.b;
            oy0.K0(profileActivity8.a(), profileActivity8);
            return;
        }
        if (i7 == 12) {
            ProfileActivity profileActivity9 = this.b;
            if (profileActivity9.p1) {
                profileActivity9.presentFragment(v81.f0(profileActivity9.e1, profileActivity9.f1));
                return;
            }
            Bundle bundle3 = new Bundle();
            ProfileActivity profileActivity10 = this.b;
            long j10 = profileActivity10.e1;
            if (j10 != 0) {
                bundle3.putLong("chat_id", j10);
            } else if (profileActivity10.q2) {
                bundle3.putLong("user_id", profileActivity10.d1);
            }
            pn pnVar = new pn(bundle3);
            ProfileActivity profileActivity11 = this.b;
            TLRPC.ChatFull chatFull = profileActivity11.t2;
            if (chatFull != null) {
                pnVar.q0(chatFull);
            } else {
                pnVar.r0(profileActivity11.u2);
            }
            this.b.presentFragment(pnVar);
            return;
        }
        if (i7 == 41) {
            this.b.presentFragment(new UserInfoActivity());
            return;
        }
        int i23 = 19;
        if (i7 == 9) {
            TLRPC.User a24 = this.b.getMessagesController().a2(Long.valueOf(this.b.d1));
            if (a24 == null) {
                return;
            }
            Bundle h7 = org.telegram.ui.Cells.f1.h(2, "onlySelect", "dialogsType", true);
            h7.putBoolean("resetDelegate", false);
            h7.putBoolean("closeFragment", false);
            ww wwVar2 = new ww(h7);
            wwVar2.C2 = new a7(this, a24, wwVar2, i23);
            this.b.presentFragment(wwVar2);
            return;
        }
        if (i7 == 10) {
            this.b.G4();
            return;
        }
        if (i7 == 14) {
            try {
                ProfileActivity profileActivity12 = this.b;
                if (profileActivity12.C2 != null) {
                    j3 = org.telegram.messenger.m5.F(r2.id);
                } else {
                    j3 = profileActivity12.d1;
                    if (j3 == 0) {
                        long j11 = profileActivity12.e1;
                        if (j11 == 0) {
                            return;
                        } else {
                            j3 = -j11;
                        }
                    }
                }
                org.telegram.messenger.ui mediaDataController = this.b.getMediaDataController();
                Pattern pattern2 = org.telegram.messenger.ui.R1;
                mediaDataController.y0(j3, 0, null);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (i7 == 15 || i7 == 16) {
            this.b.C4(i7 == 16);
            return;
        }
        if (i7 == 17) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", this.b.e1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle4.putBoolean("open_search", true);
            oq oqVar = new oq(bundle4);
            oqVar.C0(this.b.t2);
            this.b.presentFragment(oqVar);
            return;
        }
        if (i7 == 18) {
            this.b.J4();
            return;
        }
        if (i7 == 19) {
            this.b.presentFragment(c51.g0(this.b.getMessagesController().M0(Long.valueOf(this.b.e1)), false));
            return;
        }
        if (i7 == 22) {
            this.b.M4();
            return;
        }
        if (i7 == 38) {
            this.b.D4();
            return;
        }
        if (i7 == 48) {
            ProfileActivity profileActivity13 = this.b;
            org.telegram.ui.Wallet.m9 m9Var = new org.telegram.ui.Wallet.m9(profileActivity13.getMessagesController().a2(Long.valueOf(this.b.d1)));
            m9Var.f0 = true;
            profileActivity13.presentFragment(m9Var);
            return;
        }
        if (i7 == 39) {
            Bundle f11 = rf.b.f(2, TeXSymbolParser.TYPE_ATTR);
            f11.putLong("dialog_id", -this.b.e1);
            org.telegram.ui.Components.u80 u80Var = new org.telegram.ui.Components.u80(f11, null);
            ProfileActivity profileActivity14 = this.b;
            u80Var.c = profileActivity14.t2;
            profileActivity14.presentFragment(u80Var);
            return;
        }
        if (i7 == 20) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, this.b.getParentActivity(), this.b.z0);
            alertDialog$Builder3.a.R = org.telegram.messenger.id.M0(2131754078, null);
            alertDialog$Builder3.a.T = org.telegram.messenger.id.M0(2131754079, null);
            final int i24 = 1;
            alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131744918, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.pv0
                public final /* synthetic */ rv0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0275 */
                @Override // org.telegram.ui.ActionBar.r1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i232) {
                    org.telegram.ui.ActionBar.q4 q4Var;
                    org.telegram.ui.ActionBar.q4 q4Var2;
                    org.telegram.ui.ActionBar.q4 q4Var3;
                    org.telegram.ui.ActionBar.q4 q4Var4;
                    int i242;
                    int i25;
                    boolean z9;
                    org.telegram.messenger.yo yoVar;
                    TLRPC.Photo photo;
                    int i26 = i24;
                    rv0 rv0Var = this.b;
                    switch (i26) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ProfileActivity profileActivity82 = rv0Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity82.f1));
                            profileActivity82.getMessagesController().q7.d(arrayList, profileActivity82.e1);
                            profileActivity82.I1 = 0;
                            q4Var = ((org.telegram.ui.ActionBar.f2) profileActivity82).parentLayout;
                            if (q4Var != null) {
                                q4Var2 = ((org.telegram.ui.ActionBar.f2) profileActivity82).parentLayout;
                                if (q4Var2.getFragmentStack() != null) {
                                    for (int i27 = 0; i27 < q4Var3.getFragmentStack().size(); i27++) {
                                        q4Var4 = ((org.telegram.ui.ActionBar.f2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) q4Var4.getFragmentStack().get(i27);
                                        if ((f2Var instanceof an) && ((an) f2Var).b() == profileActivity82.f1) {
                                            f2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(parentActivity2), profileActivity82.z0).Q(R.raw.ic_delete, 36, org.telegram.messenger.id.K0(1, "TopicsDeleted")).j();
                            }
                            u1Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = rv0Var.b;
                            i242 = ((org.telegram.ui.ActionBar.f2) profileActivity92).currentAccount;
                            if (org.telegram.messenger.qp.s1(i242).v2()) {
                                i25 = ((org.telegram.ui.ActionBar.f2) profileActivity92).currentAccount;
                                b.b(i25);
                                break;
                            } else {
                                profileActivity92.i1 = true;
                                profileActivity92.getSecretChatHelper().A(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().a2(Long.valueOf(profileActivity92.d1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = rv0Var.b;
                            int realPosition = profileActivity102.n0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.n0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity102.u2;
                            if (profileActivity102.H2 == null || realPosition != 0) {
                                if (profileActivity102.p5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().j2(userFull, true);
                                    profileActivity102.I5(false);
                                }
                                if (profileActivity102.n0.getRealCount() == 1) {
                                    ProfileActivity.G3(profileActivity102, true);
                                }
                                if (F == null || profileActivity102.n0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity102.n0.F(1);
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
                                    org.telegram.messenger.yr messagesStorage = profileActivity102.getMessagesStorage();
                                    messagesStorage.a.c(new org.telegram.messenger.vp(4, profileActivity102.d1, F.id, messagesStorage));
                                }
                                av0 av0Var = profileActivity102.n0;
                                ArrayList arrayList2 = av0Var.X0;
                                ArrayList arrayList3 = av0Var.V0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z9 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (yoVar = av0Var.S0) == null) {
                                        arrayList3.remove(realPosition);
                                        av0Var.U0.remove(realPosition);
                                        av0Var.T0.remove(realPosition);
                                        av0Var.W0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        av0Var.Y0.remove(realPosition);
                                        av0Var.Z0.remove(realPosition);
                                        av0Var.a1.remove(realPosition);
                                        av0Var.d1.delete(realPosition);
                                        av0Var.b1.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            av0Var.P0 = (org.telegram.messenger.hc) arrayList2.get(0);
                                            av0Var.Q0 = null;
                                            av0Var.R0 = null;
                                        }
                                        av0Var.D0.g();
                                        z9 = arrayList3.isEmpty();
                                    } else {
                                        yoVar.e(photo2.id);
                                        z9 = true;
                                    }
                                }
                                if (z9 || profileActivity102.n0.getRealCount() <= 0) {
                                    profileActivity102.n0.setVisibility(8);
                                    profileActivity102.e0.setForegroundAlpha(1.0f);
                                    profileActivity102.X.setVisibility(0);
                                    profileActivity102.H0 = true;
                                    View m10 = profileActivity102.c.m(0);
                                    if (m10 != null) {
                                        profileActivity102.a.w0(0, m10.getTop() - profileActivity102.j4(), org.telegram.ui.Components.xq.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity102.q0.b();
                                if (profileActivity102.i6 != 0) {
                                    profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.i6, true);
                                }
                                profileActivity102.n2 = (org.telegram.messenger.g0.Q1() || profileActivity102.m2 || !profileActivity102.e0.getImageReceiver().L() || org.telegram.messenger.g0.C1()) ? false : true;
                                profileActivity102.H2 = null;
                                profileActivity102.I2 = null;
                                av0 av0Var2 = profileActivity102.n0;
                                av0Var2.H0 = true;
                                av0Var2.K0 = profileActivity102.J2;
                                av0Var2.q1 = null;
                                av0Var2.r1 = null;
                                av0Var2.setCreateThumbFromParent(false);
                                profileActivity102.I5(true);
                                profileActivity102.j5(false, true);
                                profileActivity102.getNotificationCenter().k(2, Integer.valueOf(org.telegram.messenger.qp.C8));
                                profileActivity102.getNotificationCenter().k(46, new Object[0]);
                                profileActivity102.getUserConfig().v(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), null);
            this.b.showDialog(alertDialog$Builder3.a);
            return;
        }
        if (i7 == 44) {
            i16 = ((org.telegram.ui.ActionBar.f2) this.b).currentAccount;
            long j12 = this.b.d1;
            TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(i16).b2(j12);
            if (b22 == null || (botInfo = b22.bot_info) == null) {
                return;
            }
            String str2 = botInfo.privacy_policy_url;
            if (str2 == null && str2 == null) {
                ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
                int size = arrayList.size();
                while (true) {
                    if (i19 >= size) {
                        str2 = org.telegram.messenger.id.M0(2131753098, null);
                        break;
                    }
                    TLRPC.BotCommand botCommand = arrayList.get(i19);
                    i19++;
                    if ("privacy".equals(botCommand.command)) {
                        break;
                    }
                }
            }
            if (str2 != null) {
                vf.c.t(org.telegram.messenger.t0.b, str2);
                return;
            }
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            if (T == null) {
                return;
            }
            if (!(T instanceof an) || ((an) T).a() != j12) {
                T.presentFragment(an.ra(j12));
            }
            org.telegram.messenger.g0.i3(new bi.ua(i16, j12, 1), 150L);
            return;
        }
        if (i7 == 21) {
            if (this.b.getParentActivity() == null) {
                return;
            }
            if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.b) && this.b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            av0 av0Var = this.b.n0;
            org.telegram.messenger.hc D = av0Var.D(av0Var.getRealPosition());
            if (D == null) {
                return;
            }
            boolean z9 = D.p == 2;
            i15 = ((org.telegram.ui.ActionBar.f2) this.b).currentAccount;
            org.telegram.messenger.w7.G(i15);
            File J = org.telegram.messenger.w7.J(D.f, z9 ? "mp4" : null, true, true);
            if (z9 && !J.exists()) {
                J = new File(org.telegram.messenger.w7.z(0), org.telegram.messenger.w7.r("mp4", D.f));
            }
            if (J.exists()) {
                MediaController.d0(J.toString(), this.b.getParentActivity(), 0, null, null, new bi.b9(i20, this, z9));
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
            hm0 hm0Var = new hm0();
            hm0Var.H = this.b;
            profileActivity15.presentFragment(hm0Var);
            return;
        }
        if (i7 == 42) {
            if (org.telegram.messenger.g0.g(this.b.getMessagesController().U2 + "/" + org.telegram.messenger.t10.n(this.b.getMessagesController().a2(Long.valueOf(this.b.d1))))) {
                org.telegram.ui.Components.hc.a0(this.b).k(false).j();
                return;
            }
            return;
        }
        if (i7 == 43) {
            this.b.presentFragment(new la(null));
            return;
        }
        if (i7 == 31) {
            this.b.presentFragment(new ee0(null));
            return;
        }
        if (i7 != 33) {
            if (i7 == 34) {
                i10 = ((org.telegram.ui.ActionBar.f2) this.b).currentAccount;
                if (org.telegram.messenger.qp.s1(i10).v2()) {
                    i13 = ((org.telegram.ui.ActionBar.f2) this.b).currentAccount;
                    b.b(i13);
                    return;
                }
                int realPosition = this.b.n0.getRealPosition();
                org.telegram.messenger.hc D2 = this.b.n0.D(realPosition);
                if (D2 == null) {
                    return;
                }
                i11 = ((org.telegram.ui.ActionBar.f2) this.b).currentAccount;
                org.telegram.messenger.w7.G(i11);
                Drawable[] drawableArr = PhotoViewer.Y8;
                File J2 = org.telegram.messenger.w7.J(D2.f, PhotoViewer.m1(D2), true, true);
                boolean z10 = D2.p == 2;
                if (z10) {
                    org.telegram.messenger.hc G = this.b.n0.G(realPosition);
                    i12 = ((org.telegram.ui.ActionBar.f2) this.b).currentAccount;
                    org.telegram.messenger.w7.G(i12);
                    str = org.telegram.messenger.w7.J(G != null ? G.f : null, PhotoViewer.m1(G), true, true).getAbsolutePath();
                }
                this.b.q0.p(J2.getAbsolutePath(), str, z10);
                return;
            }
            if (i7 != 35) {
                if (i7 == 36) {
                    this.b.I4();
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.b.getParentActivity(), this.b.z0);
            av0 av0Var2 = this.b.n0;
            org.telegram.messenger.hc D3 = av0Var2.D(av0Var2.getRealPosition());
            if (D3 == null) {
                return;
            }
            if (D3.p == 2) {
                alertDialog$Builder4.a.R = org.telegram.messenger.id.M0(2131754083, null);
                alertDialog$Builder4.a.T = org.telegram.messenger.id.M0(2131754085, null);
            } else {
                alertDialog$Builder4.a.R = org.telegram.messenger.id.M0(2131754094, null);
                alertDialog$Builder4.a.T = org.telegram.messenger.id.M0(2131754096, null);
            }
            final int i25 = 2;
            alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131751599, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.pv0
                public final /* synthetic */ rv0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0275 */
                @Override // org.telegram.ui.ActionBar.r1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i232) {
                    org.telegram.ui.ActionBar.q4 q4Var;
                    org.telegram.ui.ActionBar.q4 q4Var2;
                    org.telegram.ui.ActionBar.q4 q4Var3;
                    org.telegram.ui.ActionBar.q4 q4Var4;
                    int i242;
                    int i252;
                    boolean z92;
                    org.telegram.messenger.yo yoVar;
                    TLRPC.Photo photo;
                    int i26 = i25;
                    rv0 rv0Var = this.b;
                    switch (i26) {
                        case 0:
                            ArrayList arrayList2 = new ArrayList();
                            ProfileActivity profileActivity82 = rv0Var.b;
                            arrayList2.add(Integer.valueOf((int) profileActivity82.f1));
                            profileActivity82.getMessagesController().q7.d(arrayList2, profileActivity82.e1);
                            profileActivity82.I1 = 0;
                            q4Var = ((org.telegram.ui.ActionBar.f2) profileActivity82).parentLayout;
                            if (q4Var != null) {
                                q4Var2 = ((org.telegram.ui.ActionBar.f2) profileActivity82).parentLayout;
                                if (q4Var2.getFragmentStack() != null) {
                                    for (int i27 = 0; i27 < q4Var3.getFragmentStack().size(); i27++) {
                                        q4Var4 = ((org.telegram.ui.ActionBar.f2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) q4Var4.getFragmentStack().get(i27);
                                        if ((f2Var instanceof an) && ((an) f2Var).b() == profileActivity82.f1) {
                                            f2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(parentActivity2), profileActivity82.z0).Q(R.raw.ic_delete, 36, org.telegram.messenger.id.K0(1, "TopicsDeleted")).j();
                            }
                            u1Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = rv0Var.b;
                            i242 = ((org.telegram.ui.ActionBar.f2) profileActivity92).currentAccount;
                            if (org.telegram.messenger.qp.s1(i242).v2()) {
                                i252 = ((org.telegram.ui.ActionBar.f2) profileActivity92).currentAccount;
                                b.b(i252);
                                break;
                            } else {
                                profileActivity92.i1 = true;
                                profileActivity92.getSecretChatHelper().A(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().a2(Long.valueOf(profileActivity92.d1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = rv0Var.b;
                            int realPosition2 = profileActivity102.n0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.n0.F(realPosition2);
                            TLRPC.UserFull userFull = profileActivity102.u2;
                            if (profileActivity102.H2 == null || realPosition2 != 0) {
                                if (profileActivity102.p5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().j2(userFull, true);
                                    profileActivity102.I5(false);
                                }
                                if (profileActivity102.n0.getRealCount() == 1) {
                                    ProfileActivity.G3(profileActivity102, true);
                                }
                                if (F == null || profileActivity102.n0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity102.n0.F(1);
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
                                    org.telegram.messenger.yr messagesStorage = profileActivity102.getMessagesStorage();
                                    messagesStorage.a.c(new org.telegram.messenger.vp(4, profileActivity102.d1, F.id, messagesStorage));
                                }
                                av0 av0Var3 = profileActivity102.n0;
                                ArrayList arrayList22 = av0Var3.X0;
                                ArrayList arrayList3 = av0Var3.V0;
                                if (realPosition2 < 0 || realPosition2 >= arrayList3.size()) {
                                    z92 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition2);
                                    if (photo2 == null || (yoVar = av0Var3.S0) == null) {
                                        arrayList3.remove(realPosition2);
                                        av0Var3.U0.remove(realPosition2);
                                        av0Var3.T0.remove(realPosition2);
                                        av0Var3.W0.remove(realPosition2);
                                        arrayList22.remove(realPosition2);
                                        av0Var3.Y0.remove(realPosition2);
                                        av0Var3.Z0.remove(realPosition2);
                                        av0Var3.a1.remove(realPosition2);
                                        av0Var3.d1.delete(realPosition2);
                                        av0Var3.b1.remove(realPosition2);
                                        if (realPosition2 == 0 && !arrayList22.isEmpty()) {
                                            av0Var3.P0 = (org.telegram.messenger.hc) arrayList22.get(0);
                                            av0Var3.Q0 = null;
                                            av0Var3.R0 = null;
                                        }
                                        av0Var3.D0.g();
                                        z92 = arrayList3.isEmpty();
                                    } else {
                                        yoVar.e(photo2.id);
                                        z92 = true;
                                    }
                                }
                                if (z92 || profileActivity102.n0.getRealCount() <= 0) {
                                    profileActivity102.n0.setVisibility(8);
                                    profileActivity102.e0.setForegroundAlpha(1.0f);
                                    profileActivity102.X.setVisibility(0);
                                    profileActivity102.H0 = true;
                                    View m10 = profileActivity102.c.m(0);
                                    if (m10 != null) {
                                        profileActivity102.a.w0(0, m10.getTop() - profileActivity102.j4(), org.telegram.ui.Components.xq.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity102.q0.b();
                                if (profileActivity102.i6 != 0) {
                                    profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.i6, true);
                                }
                                profileActivity102.n2 = (org.telegram.messenger.g0.Q1() || profileActivity102.m2 || !profileActivity102.e0.getImageReceiver().L() || org.telegram.messenger.g0.C1()) ? false : true;
                                profileActivity102.H2 = null;
                                profileActivity102.I2 = null;
                                av0 av0Var22 = profileActivity102.n0;
                                av0Var22.H0 = true;
                                av0Var22.K0 = profileActivity102.J2;
                                av0Var22.q1 = null;
                                av0Var22.r1 = null;
                                av0Var22.setCreateThumbFromParent(false);
                                profileActivity102.I5(true);
                                profileActivity102.j5(false, true);
                                profileActivity102.getNotificationCenter().k(2, Integer.valueOf(org.telegram.messenger.qp.C8));
                                profileActivity102.getNotificationCenter().k(46, new Object[0]);
                                profileActivity102.getUserConfig().v(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(org.telegram.messenger.id.M0(2131752589, null), null);
            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder4.a;
            this.b.showDialog(u1Var3);
            TextView textView4 = (TextView) u1Var3.d(-1);
            if (textView4 != null) {
                org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.q7, this.b.z0);
                return;
            }
            return;
        }
        int realPosition2 = this.b.n0.getRealPosition();
        TLRPC.Photo F = this.b.n0.F(realPosition2);
        if (F == null) {
            return;
        }
        av0 av0Var3 = this.b.n0;
        ArrayList arrayList2 = av0Var3.b1;
        ArrayList arrayList3 = av0Var3.a1;
        ArrayList arrayList4 = av0Var3.Z0;
        ArrayList arrayList5 = av0Var3.Y0;
        ArrayList arrayList6 = av0Var3.W0;
        ArrayList arrayList7 = av0Var3.U0;
        ArrayList arrayList8 = av0Var3.X0;
        ArrayList arrayList9 = av0Var3.V0;
        org.telegram.messenger.yo yoVar = av0Var3.S0;
        if (yoVar != null) {
            yoVar.c(realPosition2);
        } else if (realPosition2 > 0 && realPosition2 < arrayList9.size()) {
            av0Var3.c1++;
            TLRPC.Photo photo = (TLRPC.Photo) arrayList9.get(realPosition2);
            arrayList9.remove(realPosition2);
            arrayList9.add(0, photo);
            String str3 = (String) arrayList7.get(realPosition2);
            arrayList7.remove(realPosition2);
            arrayList7.add(0, str3);
            ArrayList arrayList10 = av0Var3.T0;
            arrayList10.add(0, (String) arrayList10.remove(realPosition2));
            org.telegram.messenger.hc hcVar = (org.telegram.messenger.hc) arrayList6.get(realPosition2);
            arrayList6.remove(realPosition2);
            arrayList6.add(0, hcVar);
            org.telegram.messenger.hc hcVar2 = (org.telegram.messenger.hc) arrayList8.get(realPosition2);
            arrayList8.remove(realPosition2);
            arrayList8.add(0, hcVar2);
            org.telegram.messenger.hc hcVar3 = (org.telegram.messenger.hc) arrayList5.get(realPosition2);
            arrayList5.remove(realPosition2);
            arrayList5.add(0, hcVar3);
            org.telegram.ui.Components.d51 d51Var = (org.telegram.ui.Components.d51) arrayList4.get(realPosition2);
            arrayList4.remove(realPosition2);
            arrayList4.add(0, d51Var);
            Integer num = (Integer) arrayList3.get(realPosition2);
            arrayList3.remove(realPosition2);
            arrayList3.add(0, num);
            Float f12 = (Float) arrayList2.get(realPosition2);
            arrayList2.remove(realPosition2);
            arrayList2.add(0, f12);
            av0Var3.P0 = (org.telegram.messenger.hc) arrayList8.get(0);
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        tL_inputPhoto.id = F.id;
        tL_inputPhoto.access_hash = F.access_hash;
        tL_inputPhoto.file_reference = F.file_reference;
        org.telegram.messenger.p10 userConfig = this.b.getUserConfig();
        this.b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new lo0(this, userConfig, F, 6));
        ProfileActivity profileActivity16 = this.b;
        profileActivity16.L.m(profileActivity16.d1, F.video_sizes.isEmpty() ? null : 1, 22);
        TLRPC.User a25 = this.b.getMessagesController().a2(Long.valueOf(userConfig.n));
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F.sizes, 800, false, null, false);
        if (a25 != null) {
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F.sizes, 90, false, null, false);
            TLRPC.UserProfilePhoto userProfilePhoto = a25.photo;
            userProfilePhoto.photo_id = F.id;
            userProfilePhoto.photo_small = w11.location;
            userProfilePhoto.photo_big = w10.location;
            userConfig.w(a25);
            userConfig.v(true);
            i14 = ((org.telegram.ui.ActionBar.f2) this.b).currentAccount;
            org.telegram.messenger.qs.f(i14).k(org.telegram.messenger.qs.j0, new Object[0]);
            this.b.I5(true);
        }
        av0 av0Var4 = this.b.n0;
        av0Var4.D0.g();
        av0Var4.L();
    }
}
