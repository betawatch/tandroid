package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qq extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public boolean d;
    public final /* synthetic */ rq e;

    public qq(rq rqVar, Context context) {
        this.e = rqVar;
        if (rqVar.y == 2) {
            C(true);
        }
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        TLRPC.Chat chat;
        int i10 = c1Var.f;
        rq rqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = rqVar.P;
        int i11 = rqVar.y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = rqVar.N;
        if (!rqVar.w.creator || ((i11 != 0 && (i11 != 2 || !rqVar.K)) || i10 != 4 || c1Var.b() != rqVar.e0)) {
            if (!rqVar.I) {
                return false;
            }
            if ((i11 == 0 || i11 == 2) && i10 == 4) {
                int b10 = c1Var.b();
                if (b10 == rqVar.W) {
                    if (!tL_chatAdminRights.add_admins && ((chat = rqVar.w) == null || !chat.creator)) {
                        return false;
                    }
                } else {
                    if (i11 == 2 && !rqVar.K) {
                        return false;
                    }
                    if (b10 == rqVar.X) {
                        if (!tL_chatAdminRights.change_info) {
                            return false;
                        }
                        if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !rqVar.E) {
                            return false;
                        }
                    } else {
                        if (b10 == rqVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        }
                        if (b10 == rqVar.Z) {
                            return tL_chatAdminRights.manage_direct_messages;
                        }
                        if (b10 == rqVar.a0) {
                            return tL_chatAdminRights.manage_welcome_messages;
                        }
                        if (b10 == rqVar.b0) {
                            return tL_chatAdminRights.edit_messages;
                        }
                        if (b10 == rqVar.c0) {
                            return tL_chatAdminRights.delete_messages;
                        }
                        if (b10 == rqVar.K0) {
                            return tL_chatAdminRights.manage_call;
                        }
                        if (b10 == rqVar.d0) {
                            return tL_chatAdminRights.add_admins;
                        }
                        if (b10 == rqVar.e0) {
                            return tL_chatAdminRights.anonymous;
                        }
                        if (b10 == rqVar.f0) {
                            return tL_chatAdminRights.ban_users;
                        }
                        if (b10 == rqVar.g0) {
                            return tL_chatAdminRights.invite_users;
                        }
                        if (b10 == rqVar.h0) {
                            if (!tL_chatAdminRights.pin_messages) {
                                return false;
                            }
                            if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                return false;
                            }
                        } else {
                            if (b10 == rqVar.i0) {
                                return tL_chatAdminRights.manage_ranks;
                            }
                            if (b10 == rqVar.m0) {
                                return tL_chatAdminRights.manage_topics;
                            }
                            if (b10 == rqVar.U0) {
                                return tL_chatAdminRights.post_stories;
                            }
                            if (b10 == rqVar.V0) {
                                return tL_chatAdminRights.edit_stories;
                            }
                            if (b10 == rqVar.W0) {
                                return tL_chatAdminRights.delete_stories;
                            }
                            if (b10 == rqVar.n0) {
                                return tL_chatAdminRights.manage_linked_peers;
                            }
                        }
                    }
                }
            }
            if (i10 == 3 || i10 == 1 || i10 == 5 || i10 == 8 || i10 == 11) {
                return false;
            }
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.V;
    }

    @Override // s4.h0
    public final long i(int i10) {
        rq rqVar = this.e;
        if (rqVar.y != 2) {
            return -1L;
        }
        if (i10 == rqVar.W) {
            return 1L;
        }
        if (i10 == rqVar.X) {
            return 2L;
        }
        if (i10 == rqVar.Y) {
            return 3L;
        }
        if (i10 == rqVar.b0) {
            return 4L;
        }
        if (i10 == rqVar.c0) {
            return 5L;
        }
        if (i10 == rqVar.d0) {
            return 6L;
        }
        if (i10 == rqVar.e0) {
            return 7L;
        }
        if (i10 == rqVar.f0) {
            return 8L;
        }
        if (i10 == rqVar.g0) {
            return 9L;
        }
        if (i10 == rqVar.h0) {
            return 10L;
        }
        if (i10 == rqVar.o0) {
            return 11L;
        }
        if (i10 == rqVar.p0) {
            return 12L;
        }
        if (i10 == rqVar.q0) {
            return 13L;
        }
        if (i10 == rqVar.r0) {
            return 14L;
        }
        if (i10 == rqVar.s0) {
            return 15L;
        }
        if (i10 == rqVar.t0) {
            return 16L;
        }
        if (i10 == rqVar.u0) {
            return 17L;
        }
        if (i10 == rqVar.v0) {
            return 18L;
        }
        if (i10 == rqVar.w0) {
            return 19L;
        }
        if (i10 == rqVar.y0) {
            return 20L;
        }
        if (i10 == rqVar.B0) {
            return 21L;
        }
        if (i10 == rqVar.H0) {
            return 22L;
        }
        if (i10 == rqVar.I0) {
            return 23L;
        }
        if (i10 == rqVar.J0) {
            return 24L;
        }
        if (i10 == rqVar.K0) {
            return 25L;
        }
        if (i10 == rqVar.L0) {
            return 26L;
        }
        if (i10 == rqVar.M0) {
            return 27L;
        }
        if (i10 == rqVar.x0) {
            return 28L;
        }
        if (i10 == rqVar.m0) {
            return 29L;
        }
        if (i10 == rqVar.C0) {
            return 30L;
        }
        if (i10 == rqVar.E0) {
            return 31L;
        }
        if (i10 == rqVar.D0) {
            return 32L;
        }
        if (i10 == rqVar.F0) {
            return 33L;
        }
        if (i10 == rqVar.G0) {
            return 34L;
        }
        if (i10 == rqVar.z0) {
            return 35L;
        }
        if (i10 == rqVar.N0) {
            return 36L;
        }
        if (i10 == rqVar.P0) {
            return 37L;
        }
        if (i10 == rqVar.Q0) {
            return 38L;
        }
        if (i10 == rqVar.R0) {
            return 39L;
        }
        if (i10 == rqVar.S0) {
            return 40L;
        }
        if (i10 == rqVar.U0) {
            return 41L;
        }
        if (i10 == rqVar.V0) {
            return 42L;
        }
        if (i10 == rqVar.W0) {
            return 43L;
        }
        if (i10 == rqVar.Z) {
            return 44L;
        }
        if (i10 == rqVar.i0) {
            return 45L;
        }
        if (i10 == rqVar.j0) {
            return 46L;
        }
        if (i10 == rqVar.k0) {
            return 47L;
        }
        if (i10 == rqVar.l0) {
            return 48L;
        }
        if (i10 == rqVar.n0) {
            return 49L;
        }
        return i10 == rqVar.a0 ? 50L : 0L;
    }

    @Override // s4.h0
    public final int j(int i10) {
        rq rqVar = this.e;
        if (i10 == rqVar.H0 || i10 == rqVar.J0 || i10 == rqVar.I0 || i10 == rqVar.B0 || i10 == rqVar.C0 || i10 == rqVar.E0 || i10 == rqVar.D0 || i10 == rqVar.G0 || i10 == rqVar.F0 || i10 == rqVar.j0 || i10 == rqVar.P0 || i10 == rqVar.Q0 || i10 == rqVar.R0 || i10 == rqVar.U0 || i10 == rqVar.V0 || i10 == rqVar.W0) {
            return 10;
        }
        if (i10 == rqVar.z0 || i10 == rqVar.N0 || i10 == rqVar.S0) {
            return 9;
        }
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1 || i10 == rqVar.o0 || i10 == rqVar.q0 || i10 == rqVar.L0 || i10 == rqVar.s0) {
            return 5;
        }
        if (i10 == 2 || i10 == rqVar.u0) {
            return 3;
        }
        if (i10 == rqVar.X || i10 == rqVar.Y || i10 == rqVar.Z || i10 == rqVar.b0 || i10 == rqVar.c0 || i10 == rqVar.d0 || i10 == rqVar.f0 || i10 == rqVar.g0 || i10 == rqVar.h0 || i10 == rqVar.i0 || i10 == rqVar.y0 || i10 == rqVar.e0 || i10 == rqVar.K0 || i10 == rqVar.W || i10 == rqVar.m0 || i10 == rqVar.k0 || i10 == rqVar.n0 || i10 == rqVar.a0) {
            return 4;
        }
        if (i10 == rqVar.r0 || i10 == rqVar.w0 || i10 == rqVar.l0) {
            return 1;
        }
        if (i10 == rqVar.M0) {
            return 6;
        }
        if (i10 == rqVar.v0) {
            return 11;
        }
        return i10 == rqVar.x0 ? 8 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:290:0x0a3d, code lost:
    
        if (r2.view_messages == false) goto L787;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x051f, code lost:
    
        if (r6.change_info == false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x0958, code lost:
    
        if (r6.pin_messages == false) goto L715;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x0a5c, code lost:
    
        if (r2.bot != false) goto L806;
     */
    /* JADX WARN: Removed duplicated region for block: B:350:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:740:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:823:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:826:0x0b4c  */
    /* JADX WARN: Type inference failed for: r4v125, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v153, types: [boolean, int] */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        TLRPC.User user;
        TLRPC.User user2;
        String string;
        int i12;
        TLRPC.User user3;
        String formatString;
        TLRPC.Chat chat;
        int i13;
        int i14;
        int i15;
        TLRPC.User user4;
        int i16;
        int i17;
        TLRPC.User user5;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3;
        int i18;
        boolean z11;
        int i19;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        int i20;
        int i21;
        TLRPC.TL_chatBannedRights tL_chatBannedRights4;
        boolean z12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights5;
        TLRPC.TL_chatBannedRights tL_chatBannedRights6;
        int i22;
        TLRPC.TL_chatBannedRights tL_chatBannedRights7;
        boolean z13;
        int i23;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3;
        TLRPC.TL_chatAdminRights tL_chatAdminRights4;
        int i24;
        int i25;
        TLRPC.TL_chatBannedRights tL_chatBannedRights8;
        boolean z14;
        TLRPC.TL_chatBannedRights tL_chatBannedRights9;
        TLRPC.TL_chatBannedRights tL_chatBannedRights10;
        int i26;
        int i27;
        int i28;
        boolean z15;
        TLRPC.TL_chatAdminRights tL_chatAdminRights5;
        TLRPC.TL_chatAdminRights tL_chatAdminRights6;
        TLRPC.TL_chatBannedRights tL_chatBannedRights11;
        boolean z16;
        TLRPC.TL_chatBannedRights tL_chatBannedRights12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights13;
        TLRPC.Chat chat2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights7;
        TLRPC.TL_chatAdminRights tL_chatAdminRights8;
        int i29;
        int i30;
        int i31;
        boolean z17;
        TLRPC.TL_chatAdminRights tL_chatAdminRights9;
        TLRPC.TL_chatAdminRights tL_chatAdminRights10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights14;
        boolean z18;
        TLRPC.TL_chatBannedRights tL_chatBannedRights15;
        TLRPC.TL_chatBannedRights tL_chatBannedRights16;
        boolean z19;
        TLRPC.TL_chatAdminRights tL_chatAdminRights11;
        boolean z20;
        int i32;
        TLRPC.TL_chatAdminRights tL_chatAdminRights12;
        TLRPC.TL_chatAdminRights tL_chatAdminRights13;
        boolean z21;
        int i33;
        TLRPC.TL_chatAdminRights tL_chatAdminRights14;
        TLRPC.TL_chatAdminRights tL_chatAdminRights15;
        boolean z22;
        int i34;
        TLRPC.TL_chatAdminRights tL_chatAdminRights16;
        TLRPC.TL_chatAdminRights tL_chatAdminRights17;
        boolean z23;
        int i35;
        TLRPC.User user6;
        TLRPC.User user7;
        boolean z24;
        int i36;
        TLRPC.TL_chatAdminRights tL_chatAdminRights18;
        TLRPC.TL_chatAdminRights tL_chatAdminRights19;
        boolean z25;
        int i37;
        TLRPC.TL_chatAdminRights tL_chatAdminRights20;
        TLRPC.TL_chatAdminRights tL_chatAdminRights21;
        boolean z26;
        TLRPC.TL_chatAdminRights tL_chatAdminRights22;
        int i38;
        TLRPC.TL_chatAdminRights tL_chatAdminRights23;
        boolean z27;
        TLRPC.TL_chatAdminRights tL_chatAdminRights24;
        boolean z28;
        int i39;
        TLRPC.TL_chatAdminRights tL_chatAdminRights25;
        TLRPC.TL_chatAdminRights tL_chatAdminRights26;
        boolean z29;
        int i40;
        TLRPC.TL_chatAdminRights tL_chatAdminRights27;
        TLRPC.TL_chatAdminRights tL_chatAdminRights28;
        TLRPC.User user8;
        boolean z30;
        TLRPC.TL_chatAdminRights tL_chatAdminRights29;
        int i41;
        TLRPC.TL_chatAdminRights tL_chatAdminRights30;
        boolean z31;
        TLRPC.TL_chatAdminRights tL_chatAdminRights31;
        boolean z32;
        int i42;
        TLRPC.TL_chatAdminRights tL_chatAdminRights32;
        TLRPC.TL_chatAdminRights tL_chatAdminRights33;
        int i43;
        TLRPC.TL_chatBannedRights tL_chatBannedRights17;
        boolean z33;
        TLRPC.TL_chatAdminRights tL_chatAdminRights34;
        boolean z34;
        TLRPC.TL_chatAdminRights tL_chatAdminRights35;
        int i44;
        TLRPC.TL_chatAdminRights tL_chatAdminRights36;
        boolean z35;
        TLRPC.TL_chatAdminRights tL_chatAdminRights37;
        int i45;
        int i46;
        TLRPC.TL_chatBannedRights tL_chatBannedRights18;
        boolean z36;
        TLRPC.TL_chatBannedRights tL_chatBannedRights19;
        TLRPC.TL_chatBannedRights tL_chatBannedRights20;
        TLRPC.TL_chatAdminRights tL_chatAdminRights38;
        int i47;
        TLRPC.TL_chatBannedRights tL_chatBannedRights21;
        TLRPC.TL_chatBannedRights tL_chatBannedRights22;
        rq rqVar = this.e;
        int i48 = rqVar.y;
        boolean z37 = rqVar.U;
        boolean z38 = rqVar.F;
        boolean z39 = rqVar.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights39 = rqVar.M;
        TLRPC.TL_chatBannedRights tL_chatBannedRights23 = rqVar.P;
        int i49 = c1Var.f;
        View view = c1Var.a;
        final int i50 = 2;
        switch (i49) {
            case 0:
                org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
                i11 = rqVar.y;
                String string2 = i11 == 2 ? LocaleController.getString(R.string.Bot) : null;
                user = rqVar.v;
                abVar.a(user, string2);
                break;
            case 1:
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                if (i10 == rqVar.l0) {
                    f9Var.setText(LocaleController.getString(R.string.EditAdminProcessJoinRequestsInfo));
                    break;
                } else if (i10 == rqVar.r0) {
                    f9Var.setText(LocaleController.getString(R.string.EditAdminCantEdit));
                    break;
                } else if (i10 == rqVar.w0) {
                    user2 = rqVar.v;
                    if (UserObject.isUserSelf(user2)) {
                        chat = rqVar.w;
                        if (chat.creator) {
                            string = LocaleController.getString(R.string.ChannelCreator);
                            i12 = rqVar.y;
                            if (i12 != 0) {
                                formatString = LocaleController.formatString(R.string.EditAdminRankInfo, string);
                            } else {
                                int i51 = R.string.EditMemberRankInfo;
                                user3 = rqVar.v;
                                formatString = LocaleController.formatString(i51, UserObject.getUserName(user3));
                            }
                            f9Var.setText(formatString);
                            break;
                        }
                    }
                    string = LocaleController.getString(R.string.ChannelAdmin);
                    i12 = rqVar.y;
                    if (i12 != 0) {
                    }
                    f9Var.setText(formatString);
                }
                break;
            case 2:
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                if (i10 != rqVar.p0) {
                    if (i10 == rqVar.t0) {
                        int i52 = org.telegram.ui.ActionBar.j6.G6;
                        gaVar.setTextColor(org.telegram.ui.ActionBar.j6.u0(i52));
                        gaVar.setTag(Integer.valueOf(i52));
                        if (!z39) {
                            gaVar.b(LocaleController.getString(R.string.EditAdminGroupTransfer), false);
                            break;
                        } else {
                            gaVar.b(LocaleController.getString(R.string.EditAdminChannelTransfer), false);
                            break;
                        }
                    }
                } else {
                    int i53 = org.telegram.ui.ActionBar.j6.p7;
                    gaVar.setTextColor(org.telegram.ui.ActionBar.j6.u0(i53));
                    gaVar.setTag(Integer.valueOf(i53));
                    i13 = rqVar.y;
                    if (i13 != 0) {
                        i14 = rqVar.y;
                        if (i14 == 1) {
                            gaVar.b(LocaleController.getString(R.string.UserRestrictionsBlock), false);
                            break;
                        }
                    } else {
                        gaVar.b(LocaleController.getString(R.string.EditAdminRemoveAdmin), false);
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 != 2) {
                    if (i10 == rqVar.u0) {
                        m4Var.setText(LocaleController.getString(R.string.EditAdminRank));
                        break;
                    }
                } else {
                    i15 = rqVar.y;
                    if (i15 != 2) {
                        user4 = rqVar.v;
                        if (user4 != null) {
                            user5 = rqVar.v;
                            break;
                        }
                        i16 = rqVar.y;
                        if (i16 != 0) {
                            i17 = rqVar.y;
                            if (i17 == 1) {
                                m4Var.setText(LocaleController.getString(R.string.UserRestrictionsCanDo));
                                break;
                            }
                        } else {
                            m4Var.setText(LocaleController.getString(R.string.EditAdminWhatCanDo));
                            break;
                        }
                    }
                    m4Var.setText(LocaleController.getString(R.string.BotRestrictionsCanDo));
                    break;
                }
                break;
            case 4:
            case 9:
                final int i54 = 0;
                boolean z40 = true;
                final org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                boolean z41 = i48 != 2 || rqVar.K;
                TLRPC.Chat chat3 = rqVar.w;
                boolean z42 = chat3 != null && chat3.creator;
                if (i10 == rqVar.z0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights24 = rqVar.P;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights25 = rqVar.O;
                    r11 = (tL_chatBannedRights25.send_photos || tL_chatBannedRights24.send_photos) ? 0 : 1;
                    if (!tL_chatBannedRights25.send_videos && !tL_chatBannedRights24.send_videos) {
                        r11++;
                    }
                    if (!tL_chatBannedRights25.send_stickers && !tL_chatBannedRights24.send_stickers) {
                        r11++;
                    }
                    if (!tL_chatBannedRights25.send_audios && !tL_chatBannedRights24.send_audios) {
                        r11++;
                    }
                    if (!tL_chatBannedRights25.send_docs && !tL_chatBannedRights24.send_docs) {
                        r11++;
                    }
                    if (!tL_chatBannedRights25.send_voices && !tL_chatBannedRights24.send_voices) {
                        r11++;
                    }
                    if (!tL_chatBannedRights25.send_roundvideos && !tL_chatBannedRights24.send_roundvideos) {
                        r11++;
                    }
                    if (!tL_chatBannedRights25.embed_links && !tL_chatBannedRights24.embed_links && !tL_chatBannedRights25.send_plain && !tL_chatBannedRights24.send_plain) {
                        r11++;
                    }
                    if (!tL_chatBannedRights25.send_polls && !tL_chatBannedRights24.send_polls) {
                        r11++;
                    }
                    if (!tL_chatBannedRights25.send_reactions && !tL_chatBannedRights24.send_reactions) {
                        r11++;
                    }
                    w8Var.d(LocaleController.getString(R.string.UserRestrictionsSendMedia), r11 > 0, true, true);
                    Locale locale = Locale.US;
                    w8Var.a(new Runnable(this) { // from class: org.telegram.ui.pq
                        public final /* synthetic */ qq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i54) {
                                case 0:
                                    rq rqVar2 = this.b.e;
                                    org.telegram.ui.Cells.w8 w8Var2 = w8Var;
                                    if (w8Var2.isEnabled()) {
                                        if (!rq.l0(rqVar2)) {
                                            boolean z43 = w8Var2.d.h;
                                            w8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = rqVar2.O;
                                            tL_chatBannedRights26.send_media = z43;
                                            tL_chatBannedRights26.send_photos = z43;
                                            tL_chatBannedRights26.send_videos = z43;
                                            tL_chatBannedRights26.send_stickers = z43;
                                            tL_chatBannedRights26.send_gifs = z43;
                                            tL_chatBannedRights26.send_games = z43;
                                            tL_chatBannedRights26.send_inline = z43;
                                            tL_chatBannedRights26.send_audios = z43;
                                            tL_chatBannedRights26.send_docs = z43;
                                            tL_chatBannedRights26.send_voices = z43;
                                            tL_chatBannedRights26.send_roundvideos = z43;
                                            tL_chatBannedRights26.embed_links = z43;
                                            tL_chatBannedRights26.send_polls = z43;
                                            tL_chatBannedRights26.send_reactions = z43;
                                            AndroidUtilities.updateVisibleRows(rqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rqVar2.getParentActivity());
                                            alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.w8 w8Var3 = w8Var;
                                    if (w8Var3.isEnabled()) {
                                        boolean z44 = w8Var3.d.h;
                                        w8Var3.setChecked(z44);
                                        rq rqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = rqVar3.M;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(rqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.w8 w8Var4 = w8Var;
                                    if (w8Var4.isEnabled()) {
                                        boolean z46 = w8Var4.d.h;
                                        w8Var4.setChecked(z46);
                                        rq rqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = rqVar4.M;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        AndroidUtilities.updateVisibleRows(rqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, a4.a.m(r11, "/10"), !rqVar.A0);
                    w8Var.setIcon(rq.l0(rqVar) ? R.drawable.permission_locked : 0);
                } else if (i10 == rqVar.N0) {
                    ?? r42 = tL_chatAdminRights39.post_messages;
                    int i55 = r42;
                    if (tL_chatAdminRights39.edit_messages) {
                        i55 = r42 + 1;
                    }
                    int i56 = i55;
                    if (tL_chatAdminRights39.delete_messages) {
                        i56 = i55 + 1;
                    }
                    w8Var.d(LocaleController.getString(R.string.ChannelManageMessages), i56 > 0, true, true);
                    Locale locale2 = Locale.US;
                    w8Var.a(new Runnable(this) { // from class: org.telegram.ui.pq
                        public final /* synthetic */ qq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    rq rqVar2 = this.b.e;
                                    org.telegram.ui.Cells.w8 w8Var2 = w8Var;
                                    if (w8Var2.isEnabled()) {
                                        if (!rq.l0(rqVar2)) {
                                            boolean z43 = w8Var2.d.h;
                                            w8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = rqVar2.O;
                                            tL_chatBannedRights26.send_media = z43;
                                            tL_chatBannedRights26.send_photos = z43;
                                            tL_chatBannedRights26.send_videos = z43;
                                            tL_chatBannedRights26.send_stickers = z43;
                                            tL_chatBannedRights26.send_gifs = z43;
                                            tL_chatBannedRights26.send_games = z43;
                                            tL_chatBannedRights26.send_inline = z43;
                                            tL_chatBannedRights26.send_audios = z43;
                                            tL_chatBannedRights26.send_docs = z43;
                                            tL_chatBannedRights26.send_voices = z43;
                                            tL_chatBannedRights26.send_roundvideos = z43;
                                            tL_chatBannedRights26.embed_links = z43;
                                            tL_chatBannedRights26.send_polls = z43;
                                            tL_chatBannedRights26.send_reactions = z43;
                                            AndroidUtilities.updateVisibleRows(rqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rqVar2.getParentActivity());
                                            alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.w8 w8Var3 = w8Var;
                                    if (w8Var3.isEnabled()) {
                                        boolean z44 = w8Var3.d.h;
                                        w8Var3.setChecked(z44);
                                        rq rqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights40 = rqVar3.M;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights40.post_messages = z45;
                                        tL_chatAdminRights40.edit_messages = z45;
                                        tL_chatAdminRights40.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(rqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.w8 w8Var4 = w8Var;
                                    if (w8Var4.isEnabled()) {
                                        boolean z46 = w8Var4.d.h;
                                        w8Var4.setChecked(z46);
                                        rq rqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = rqVar4.M;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        AndroidUtilities.updateVisibleRows(rqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, a4.a.m(i56, "/3"), !rqVar.O0);
                } else if (i10 == rqVar.S0) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights40 = rqVar.M;
                    ?? r52 = tL_chatAdminRights40.post_stories;
                    int i57 = r52;
                    if (tL_chatAdminRights40.edit_stories) {
                        i57 = r52 + 1;
                    }
                    int i58 = i57;
                    if (tL_chatAdminRights40.delete_stories) {
                        i58 = i57 + 1;
                    }
                    w8Var.d(LocaleController.getString(R.string.ChannelManageStories), i58 > 0, true, true);
                    Locale locale3 = Locale.US;
                    w8Var.a(new Runnable(this) { // from class: org.telegram.ui.pq
                        public final /* synthetic */ qq b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i50) {
                                case 0:
                                    rq rqVar2 = this.b.e;
                                    org.telegram.ui.Cells.w8 w8Var2 = w8Var;
                                    if (w8Var2.isEnabled()) {
                                        if (!rq.l0(rqVar2)) {
                                            boolean z43 = w8Var2.d.h;
                                            w8Var2.setChecked(!z43);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights26 = rqVar2.O;
                                            tL_chatBannedRights26.send_media = z43;
                                            tL_chatBannedRights26.send_photos = z43;
                                            tL_chatBannedRights26.send_videos = z43;
                                            tL_chatBannedRights26.send_stickers = z43;
                                            tL_chatBannedRights26.send_gifs = z43;
                                            tL_chatBannedRights26.send_games = z43;
                                            tL_chatBannedRights26.send_inline = z43;
                                            tL_chatBannedRights26.send_audios = z43;
                                            tL_chatBannedRights26.send_docs = z43;
                                            tL_chatBannedRights26.send_voices = z43;
                                            tL_chatBannedRights26.send_roundvideos = z43;
                                            tL_chatBannedRights26.embed_links = z43;
                                            tL_chatBannedRights26.send_polls = z43;
                                            tL_chatBannedRights26.send_reactions = z43;
                                            AndroidUtilities.updateVisibleRows(rqVar2.b);
                                            break;
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rqVar2.getParentActivity());
                                            alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.a.show();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.w8 w8Var3 = w8Var;
                                    if (w8Var3.isEnabled()) {
                                        boolean z44 = w8Var3.d.h;
                                        w8Var3.setChecked(z44);
                                        rq rqVar3 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights402 = rqVar3.M;
                                        boolean z45 = !z44;
                                        tL_chatAdminRights402.post_messages = z45;
                                        tL_chatAdminRights402.edit_messages = z45;
                                        tL_chatAdminRights402.delete_messages = z45;
                                        AndroidUtilities.updateVisibleRows(rqVar3.b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.w8 w8Var4 = w8Var;
                                    if (w8Var4.isEnabled()) {
                                        boolean z46 = w8Var4.d.h;
                                        w8Var4.setChecked(z46);
                                        rq rqVar4 = this.b.e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights41 = rqVar4.M;
                                        boolean z47 = !z46;
                                        tL_chatAdminRights41.post_stories = z47;
                                        tL_chatAdminRights41.edit_stories = z47;
                                        tL_chatAdminRights41.delete_stories = z47;
                                        AndroidUtilities.updateVisibleRows(rqVar4.b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, a4.a.m(i58, "/3"), !rqVar.T0);
                } else if (i10 == rqVar.W) {
                    w8Var.d(LocaleController.getString(R.string.ManageGroup), rqVar.K, true, false);
                    tL_chatAdminRights38 = rqVar.N;
                    w8Var.setIcon((tL_chatAdminRights38.add_admins || z42) ? 0 : R.drawable.permission_locked);
                } else if (i10 == rqVar.X) {
                    i43 = rqVar.y;
                    if (i43 != 0) {
                        i45 = rqVar.y;
                        if (i45 != 2) {
                            i46 = rqVar.y;
                            if (i46 == 1) {
                                String string3 = LocaleController.getString(z38 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo);
                                tL_chatBannedRights18 = rqVar.O;
                                if (!tL_chatBannedRights18.change_info) {
                                    tL_chatBannedRights20 = rqVar.P;
                                    if (!tL_chatBannedRights20.change_info) {
                                        z36 = true;
                                        w8Var.c(string3, z36, rqVar.m0 == -1);
                                        tL_chatBannedRights19 = rqVar.P;
                                        w8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z36 = false;
                                w8Var.c(string3, z36, rqVar.m0 == -1);
                                tL_chatBannedRights19 = rqVar.P;
                                w8Var.setIcon(!tL_chatBannedRights19.change_info ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    if (z38) {
                        String string4 = LocaleController.getString(R.string.CommunityAdminRightEditCommunityName);
                        if (z41) {
                            tL_chatAdminRights37 = rqVar.M;
                            if (tL_chatAdminRights37.change_info) {
                                z35 = true;
                                w8Var.c(string4, z35, true);
                            }
                        }
                        z35 = false;
                        w8Var.c(string4, z35, true);
                    } else if (z39) {
                        String string5 = LocaleController.getString(R.string.EditAdminChangeChannelInfo);
                        if (z41) {
                            tL_chatAdminRights35 = rqVar.M;
                            if (tL_chatAdminRights35.change_info) {
                                z34 = true;
                                w8Var.c(string5, z34, true);
                            }
                        }
                        z34 = false;
                        w8Var.c(string5, z34, true);
                    } else {
                        String string6 = LocaleController.getString(R.string.EditAdminChangeGroupInfo);
                        if (z41) {
                            tL_chatAdminRights34 = rqVar.M;
                            break;
                        }
                        tL_chatBannedRights17 = rqVar.P;
                        if (tL_chatBannedRights17.change_info) {
                            z33 = false;
                            w8Var.c(string6, z33, true);
                        }
                        z33 = true;
                        w8Var.c(string6, z33, true);
                    }
                    i44 = rqVar.y;
                    if (i44 == 2) {
                        tL_chatAdminRights36 = rqVar.N;
                        w8Var.setIcon((tL_chatAdminRights36.change_info || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == rqVar.Y) {
                    String string7 = LocaleController.getString(R.string.EditAdminPostMessages);
                    if (z41) {
                        tL_chatAdminRights33 = rqVar.M;
                        if (tL_chatAdminRights33.post_messages) {
                            z32 = true;
                            w8Var.c(string7, z32, true);
                            i42 = rqVar.y;
                            if (i42 == 2) {
                                tL_chatAdminRights32 = rqVar.N;
                                w8Var.setIcon((tL_chatAdminRights32.post_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z32 = false;
                    w8Var.c(string7, z32, true);
                    i42 = rqVar.y;
                    if (i42 == 2) {
                    }
                } else if (i10 == rqVar.a0) {
                    user8 = rqVar.v;
                    if (UserObject.isBot(user8)) {
                        String string8 = LocaleController.getString(z39 ? R.string.EditAdminBotChannelSendWelcomeMessages : R.string.EditAdminBotGroupSendWelcomeMessages);
                        if (z41) {
                            tL_chatAdminRights31 = rqVar.M;
                            if (tL_chatAdminRights31.manage_welcome_messages) {
                                z31 = true;
                                w8Var.c(string8, z31, true);
                            }
                        }
                        z31 = false;
                        w8Var.c(string8, z31, true);
                    } else {
                        String string9 = LocaleController.getString(R.string.EditAdminUserManageWelcomeMessages);
                        if (z41) {
                            tL_chatAdminRights29 = rqVar.M;
                            if (tL_chatAdminRights29.manage_welcome_messages) {
                                z30 = true;
                                w8Var.c(string9, z30, true);
                            }
                        }
                        z30 = false;
                        w8Var.c(string9, z30, true);
                    }
                    i41 = rqVar.y;
                    if (i41 == 2) {
                        tL_chatAdminRights30 = rqVar.N;
                        w8Var.setIcon((tL_chatAdminRights30.manage_welcome_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == rqVar.Z) {
                    String string10 = LocaleController.getString(R.string.EditAdminManageDirect);
                    if (z41) {
                        tL_chatAdminRights28 = rqVar.M;
                        if (tL_chatAdminRights28.manage_direct_messages) {
                            z29 = true;
                            w8Var.c(string10, z29, true);
                            i40 = rqVar.y;
                            if (i40 == 2) {
                                tL_chatAdminRights27 = rqVar.N;
                                w8Var.setIcon((tL_chatAdminRights27.manage_direct_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z29 = false;
                    w8Var.c(string10, z29, true);
                    i40 = rqVar.y;
                    if (i40 == 2) {
                    }
                } else if (i10 == rqVar.b0) {
                    String string11 = LocaleController.getString(R.string.EditAdminEditMessages);
                    if (z41) {
                        tL_chatAdminRights26 = rqVar.M;
                        if (tL_chatAdminRights26.edit_messages) {
                            z28 = true;
                            w8Var.c(string11, z28, true);
                            i39 = rqVar.y;
                            if (i39 == 2) {
                                tL_chatAdminRights25 = rqVar.N;
                                w8Var.setIcon((tL_chatAdminRights25.edit_messages || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z28 = false;
                    w8Var.c(string11, z28, true);
                    i39 = rqVar.y;
                    if (i39 == 2) {
                    }
                } else if (i10 == rqVar.c0) {
                    if (z39) {
                        String string12 = LocaleController.getString(R.string.EditAdminDeleteMessages);
                        if (z41) {
                            tL_chatAdminRights24 = rqVar.M;
                            if (tL_chatAdminRights24.delete_messages) {
                                z27 = true;
                                w8Var.c(string12, z27, true);
                            }
                        }
                        z27 = false;
                        w8Var.c(string12, z27, true);
                    } else {
                        String string13 = LocaleController.getString(R.string.EditAdminGroupDeleteMessages);
                        if (z41) {
                            tL_chatAdminRights22 = rqVar.M;
                            if (tL_chatAdminRights22.delete_messages) {
                                z26 = true;
                                w8Var.c(string13, z26, true);
                            }
                        }
                        z26 = false;
                        w8Var.c(string13, z26, true);
                    }
                    i38 = rqVar.y;
                    if (i38 == 2) {
                        tL_chatAdminRights23 = rqVar.N;
                        w8Var.setIcon((tL_chatAdminRights23.delete_messages || z42) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == rqVar.d0) {
                    String string14 = LocaleController.getString(R.string.EditAdminAddAdmins);
                    if (z41) {
                        tL_chatAdminRights21 = rqVar.M;
                        if (tL_chatAdminRights21.add_admins) {
                            z25 = true;
                            w8Var.c(string14, z25, (rqVar.f0 == -1 && z39) || rqVar.e0 != -1);
                            i37 = rqVar.y;
                            if (i37 == 2) {
                                tL_chatAdminRights20 = rqVar.N;
                                w8Var.setIcon((tL_chatAdminRights20.add_admins || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z25 = false;
                    w8Var.c(string14, z25, (rqVar.f0 == -1 && z39) || rqVar.e0 != -1);
                    i37 = rqVar.y;
                    if (i37 == 2) {
                    }
                } else if (i10 == rqVar.e0) {
                    String string15 = LocaleController.getString(R.string.EditAdminSendAnonymously);
                    if (z41) {
                        tL_chatAdminRights19 = rqVar.M;
                        if (tL_chatAdminRights19.anonymous) {
                            z24 = true;
                            w8Var.c(string15, z24, rqVar.m0 == -1 || z37);
                            i36 = rqVar.y;
                            if (i36 == 2) {
                                tL_chatAdminRights18 = rqVar.N;
                                w8Var.setIcon((tL_chatAdminRights18.anonymous || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z24 = false;
                    w8Var.c(string15, z24, rqVar.m0 == -1 || z37);
                    i36 = rqVar.y;
                    if (i36 == 2) {
                    }
                } else if (i10 == rqVar.k0) {
                    String string16 = LocaleController.getString(R.string.EditAdminProcessJoinRequests);
                    if (rqVar.x != null) {
                        user6 = rqVar.v;
                        if (user6 != null) {
                            long j3 = rqVar.r ? rqVar.n : rqVar.x.guard_bot_id;
                            user7 = rqVar.v;
                            if (j3 == user7.id) {
                                z23 = true;
                                w8Var.c(string16, z23, false);
                                i35 = rqVar.y;
                                if (i35 == 2) {
                                    w8Var.setIcon(0);
                                }
                            }
                        }
                    }
                    z23 = false;
                    w8Var.c(string16, z23, false);
                    i35 = rqVar.y;
                    if (i35 == 2) {
                    }
                } else if (i10 == rqVar.f0) {
                    String string17 = LocaleController.getString(z38 ? R.string.CommunityAdminRightBanMembers : R.string.EditAdminBanUsers);
                    if (z41) {
                        tL_chatAdminRights17 = rqVar.M;
                        if (tL_chatAdminRights17.ban_users) {
                            z22 = true;
                            w8Var.c(string17, z22, !z38);
                            i34 = rqVar.y;
                            if (i34 == 2) {
                                tL_chatAdminRights16 = rqVar.N;
                                w8Var.setIcon((tL_chatAdminRights16.ban_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z22 = false;
                    w8Var.c(string17, z22, !z38);
                    i34 = rqVar.y;
                    if (i34 == 2) {
                    }
                } else if (i10 == rqVar.n0) {
                    String string18 = LocaleController.getString(R.string.CommunityAdminRightEditGroupList);
                    if (z41) {
                        tL_chatAdminRights15 = rqVar.M;
                        if (tL_chatAdminRights15.manage_linked_peers) {
                            z21 = true;
                            w8Var.c(string18, z21, true);
                            i33 = rqVar.y;
                            if (i33 == 2) {
                                tL_chatAdminRights14 = rqVar.N;
                                w8Var.setIcon((tL_chatAdminRights14.manage_linked_peers || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z21 = false;
                    w8Var.c(string18, z21, true);
                    i33 = rqVar.y;
                    if (i33 == 2) {
                    }
                } else if (i10 == rqVar.K0) {
                    String string19 = LocaleController.getString(R.string.StartVoipChatPermission);
                    if (z41) {
                        tL_chatAdminRights13 = rqVar.M;
                        if (tL_chatAdminRights13.manage_call) {
                            z20 = true;
                            w8Var.c(string19, z20, true);
                            i32 = rqVar.y;
                            if (i32 == 2) {
                                tL_chatAdminRights12 = rqVar.N;
                                w8Var.setIcon((tL_chatAdminRights12.manage_call || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z20 = false;
                    w8Var.c(string19, z20, true);
                    i32 = rqVar.y;
                    if (i32 == 2) {
                    }
                } else if (i10 == rqVar.m0) {
                    i29 = rqVar.y;
                    if (i29 == 0) {
                        String string20 = LocaleController.getString(R.string.ManageTopicsPermission);
                        if (z41) {
                            tL_chatAdminRights11 = rqVar.M;
                            if (tL_chatAdminRights11.manage_topics) {
                                z19 = true;
                                w8Var.c(string20, z19, z37);
                            }
                        }
                        z19 = false;
                        w8Var.c(string20, z19, z37);
                    } else {
                        i30 = rqVar.y;
                        if (i30 == 1) {
                            String string21 = LocaleController.getString(R.string.CreateTopicsPermission);
                            tL_chatBannedRights14 = rqVar.O;
                            if (!tL_chatBannedRights14.manage_topics) {
                                tL_chatBannedRights16 = rqVar.P;
                                if (!tL_chatBannedRights16.manage_topics) {
                                    z18 = true;
                                    w8Var.c(string21, z18, z37);
                                    tL_chatBannedRights15 = rqVar.P;
                                    w8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                                }
                            }
                            z18 = false;
                            w8Var.c(string21, z18, z37);
                            tL_chatBannedRights15 = rqVar.P;
                            w8Var.setIcon(!tL_chatBannedRights15.manage_topics ? R.drawable.permission_locked : 0);
                        } else {
                            i31 = rqVar.y;
                            if (i31 == 2) {
                                String string22 = LocaleController.getString(R.string.ManageTopicsPermission);
                                if (z41) {
                                    tL_chatAdminRights10 = rqVar.M;
                                    if (tL_chatAdminRights10.manage_topics) {
                                        z17 = true;
                                        w8Var.c(string22, z17, z37);
                                        tL_chatAdminRights9 = rqVar.N;
                                        w8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z17 = false;
                                w8Var.c(string22, z17, z37);
                                tL_chatAdminRights9 = rqVar.N;
                                w8Var.setIcon((!tL_chatAdminRights9.manage_topics || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i10 == rqVar.g0) {
                    i26 = rqVar.y;
                    if (i26 == 0) {
                        chat2 = rqVar.w;
                        if (ChatObject.isActionBannedByDefault(chat2, 3)) {
                            String string23 = LocaleController.getString(R.string.EditAdminAddUsers);
                            tL_chatAdminRights8 = rqVar.M;
                            w8Var.c(string23, tL_chatAdminRights8.invite_users, true);
                        } else {
                            String string24 = LocaleController.getString(R.string.EditAdminAddUsersViaLink);
                            tL_chatAdminRights7 = rqVar.M;
                            w8Var.c(string24, tL_chatAdminRights7.invite_users, true);
                        }
                    } else {
                        i27 = rqVar.y;
                        if (i27 == 1) {
                            String string25 = LocaleController.getString(R.string.UserRestrictionsInviteUsers);
                            tL_chatBannedRights11 = rqVar.O;
                            if (!tL_chatBannedRights11.invite_users) {
                                tL_chatBannedRights13 = rqVar.P;
                                if (!tL_chatBannedRights13.invite_users) {
                                    z16 = true;
                                    w8Var.c(string25, z16, true);
                                    tL_chatBannedRights12 = rqVar.P;
                                    w8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                                }
                            }
                            z16 = false;
                            w8Var.c(string25, z16, true);
                            tL_chatBannedRights12 = rqVar.P;
                            w8Var.setIcon(!tL_chatBannedRights12.invite_users ? R.drawable.permission_locked : 0);
                        } else {
                            i28 = rqVar.y;
                            if (i28 == 2) {
                                String string26 = LocaleController.getString(R.string.EditAdminAddUsersViaLink);
                                if (z41) {
                                    tL_chatAdminRights6 = rqVar.M;
                                    if (tL_chatAdminRights6.invite_users) {
                                        z15 = true;
                                        w8Var.c(string26, z15, true);
                                        tL_chatAdminRights5 = rqVar.N;
                                        w8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                                    }
                                }
                                z15 = false;
                                w8Var.c(string26, z15, true);
                                tL_chatAdminRights5 = rqVar.N;
                                w8Var.setIcon((!tL_chatAdminRights5.invite_users || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                } else if (i10 == rqVar.h0) {
                    i22 = rqVar.y;
                    if (i22 != 0) {
                        i24 = rqVar.y;
                        if (i24 != 2) {
                            i25 = rqVar.y;
                            if (i25 == 1) {
                                String string27 = LocaleController.getString(R.string.UserRestrictionsPinMessages);
                                tL_chatBannedRights8 = rqVar.O;
                                if (!tL_chatBannedRights8.pin_messages) {
                                    tL_chatBannedRights10 = rqVar.P;
                                    if (!tL_chatBannedRights10.pin_messages) {
                                        z14 = true;
                                        w8Var.c(string27, z14, true);
                                        tL_chatBannedRights9 = rqVar.P;
                                        w8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z14 = false;
                                w8Var.c(string27, z14, true);
                                tL_chatBannedRights9 = rqVar.P;
                                w8Var.setIcon(!tL_chatBannedRights9.pin_messages ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String string28 = LocaleController.getString(R.string.EditAdminPinMessages);
                    if (z41) {
                        tL_chatAdminRights4 = rqVar.M;
                        break;
                    }
                    tL_chatBannedRights7 = rqVar.P;
                    if (tL_chatBannedRights7.pin_messages) {
                        z13 = false;
                        w8Var.c(string28, z13, true);
                        i23 = rqVar.y;
                        if (i23 == 2) {
                            tL_chatAdminRights3 = rqVar.N;
                            w8Var.setIcon((tL_chatAdminRights3.pin_messages || z42) ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z13 = true;
                    w8Var.c(string28, z13, true);
                    i23 = rqVar.y;
                    if (i23 == 2) {
                    }
                } else if (i10 == rqVar.i0) {
                    i18 = rqVar.y;
                    if (i18 != 0) {
                        i20 = rqVar.y;
                        if (i20 != 2) {
                            i21 = rqVar.y;
                            if (i21 == 1) {
                                String string29 = LocaleController.getString(R.string.UserRestrictionsEditTags);
                                tL_chatBannedRights4 = rqVar.O;
                                if (!tL_chatBannedRights4.edit_rank) {
                                    tL_chatBannedRights6 = rqVar.P;
                                    if (!tL_chatBannedRights6.edit_rank) {
                                        z12 = true;
                                        w8Var.c(string29, z12, true);
                                        tL_chatBannedRights5 = rqVar.P;
                                        w8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                                    }
                                }
                                z12 = false;
                                w8Var.c(string29, z12, true);
                                tL_chatBannedRights5 = rqVar.P;
                                w8Var.setIcon(!tL_chatBannedRights5.edit_rank ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    String string30 = LocaleController.getString(R.string.EditAdminEditTags);
                    if (z41) {
                        tL_chatAdminRights2 = rqVar.M;
                        if (tL_chatAdminRights2.manage_ranks) {
                            z11 = true;
                            w8Var.c(string30, z11, true);
                            i19 = rqVar.y;
                            if (i19 == 2) {
                                tL_chatAdminRights = rqVar.N;
                                w8Var.setIcon((tL_chatAdminRights.manage_ranks || z42) ? 0 : R.drawable.permission_locked);
                            }
                        }
                    }
                    z11 = false;
                    w8Var.c(string30, z11, true);
                    i19 = rqVar.y;
                    if (i19 == 2) {
                    }
                } else if (i10 == rqVar.y0) {
                    String string31 = LocaleController.getString(R.string.UserRestrictionsSend);
                    tL_chatBannedRights = rqVar.O;
                    if (!tL_chatBannedRights.send_plain) {
                        tL_chatBannedRights3 = rqVar.P;
                        if (!tL_chatBannedRights3.send_plain) {
                            z10 = true;
                            w8Var.c(string31, z10, true);
                            tL_chatBannedRights2 = rqVar.P;
                            w8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                        }
                    }
                    z10 = false;
                    w8Var.c(string31, z10, true);
                    tL_chatBannedRights2 = rqVar.P;
                    w8Var.setIcon(!tL_chatBannedRights2.send_plain ? R.drawable.permission_locked : 0);
                }
                i47 = rqVar.y;
                if (i47 != 2 && i10 == rqVar.y0) {
                    tL_chatBannedRights21 = rqVar.O;
                    if (!tL_chatBannedRights21.view_messages) {
                        tL_chatBannedRights22 = rqVar.P;
                        break;
                    }
                    z40 = false;
                    w8Var.setEnabled(z40);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) view;
                if (i48 != 2 || (i10 != rqVar.o0 && i10 != rqVar.w0)) {
                    c7Var.setAlpha(1.0f);
                    break;
                } else {
                    c7Var.setAlpha(rqVar.J);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                if (i10 == rqVar.M0) {
                    int i59 = rqVar.O.until_date;
                    d9Var.c(LocaleController.getString(R.string.UserRestrictionsDuration), (i59 == 0 || Math.abs(((long) i59) - (System.currentTimeMillis() / 1000)) > 315360000) ? LocaleController.getString(R.string.UserRestrictionsUntilForever) : LocaleController.formatDateForBan(rqVar.O.until_date), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
                String string32 = (UserObject.isUserSelf(rqVar.v) && rqVar.w.creator) ? LocaleController.getString(R.string.ChannelCreator) : LocaleController.getString(R.string.ChannelAdmin);
                this.d = true;
                e6Var.getTextView().setEnabled(rqVar.I || rqVar.w.creator);
                e6Var.getTextView().setSingleLine(true);
                e6Var.getTextView().setImeOptions(6);
                e6Var.n(rqVar.S, string32, false);
                this.d = false;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                boolean z43 = z1Var.getTag() != null && ((Integer) z1Var.getTag()).intValue() == i10;
                z1Var.setTag(Integer.valueOf(i10));
                if (i10 != rqVar.H0) {
                    if (i10 != rqVar.J0) {
                        if (i10 != rqVar.I0) {
                            if (i10 != rqVar.B0) {
                                if (i10 != rqVar.C0) {
                                    if (i10 != rqVar.j0) {
                                        if (i10 != rqVar.D0) {
                                            if (i10 != rqVar.E0) {
                                                if (i10 != rqVar.F0) {
                                                    if (i10 != rqVar.G0) {
                                                        if (i10 != rqVar.P0) {
                                                            if (i10 != rqVar.Q0) {
                                                                if (i10 != rqVar.R0) {
                                                                    if (i10 != rqVar.U0) {
                                                                        if (i10 != rqVar.V0) {
                                                                            if (i10 == rqVar.W0) {
                                                                                z1Var.e(LocaleController.getString(R.string.EditAdminDeleteStories), "", tL_chatAdminRights39.delete_stories, true, z43);
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            z1Var.e(LocaleController.getString(R.string.EditAdminEditStories), "", tL_chatAdminRights39.edit_stories, true, z43);
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        z1Var.e(LocaleController.getString(R.string.EditAdminPostStories), "", tL_chatAdminRights39.post_stories, true, z43);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    z1Var.e(LocaleController.getString(R.string.EditAdminDeleteMessages), "", tL_chatAdminRights39.delete_messages, true, z43);
                                                                    break;
                                                                }
                                                            } else {
                                                                z1Var.e(LocaleController.getString(R.string.EditAdminEditMessages), "", tL_chatAdminRights39.edit_messages, true, z43);
                                                                break;
                                                            }
                                                        } else {
                                                            z1Var.e(LocaleController.getString(R.string.EditAdminPostMessages), "", tL_chatAdminRights39.post_messages, true, z43);
                                                            break;
                                                        }
                                                    } else {
                                                        z1Var.e(LocaleController.getString(R.string.SendMediaPermissionRound), "", (rqVar.O.send_roundvideos || tL_chatBannedRights23.send_roundvideos) ? false : true, true, z43);
                                                        z1Var.setIcon(tL_chatBannedRights23.send_roundvideos ? R.drawable.permission_locked : 0);
                                                        break;
                                                    }
                                                } else {
                                                    z1Var.e(LocaleController.getString(R.string.SendMediaPermissionVoice), "", (rqVar.O.send_voices || tL_chatBannedRights23.send_voices) ? false : true, true, z43);
                                                    z1Var.setIcon(tL_chatBannedRights23.send_voices ? R.drawable.permission_locked : 0);
                                                    break;
                                                }
                                            } else {
                                                z1Var.e(LocaleController.getString(R.string.SendMediaPermissionFiles), "", (rqVar.O.send_docs || tL_chatBannedRights23.send_docs) ? false : true, true, z43);
                                                z1Var.setIcon(tL_chatBannedRights23.send_docs ? R.drawable.permission_locked : 0);
                                                break;
                                            }
                                        } else {
                                            z1Var.e(LocaleController.getString(R.string.SendMediaPermissionMusic), "", (rqVar.O.send_audios || tL_chatBannedRights23.send_audios) ? false : true, true, z43);
                                            z1Var.setIcon(tL_chatBannedRights23.send_audios ? R.drawable.permission_locked : 0);
                                            break;
                                        }
                                    } else {
                                        z1Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", (rqVar.O.send_reactions || tL_chatBannedRights23.send_reactions) ? false : true, true, false);
                                        z1Var.setIcon(tL_chatBannedRights23.send_reactions ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                } else {
                                    z1Var.e(LocaleController.getString(R.string.SendMediaPermissionVideos), "", (rqVar.O.send_videos || tL_chatBannedRights23.send_videos) ? false : true, true, z43);
                                    z1Var.setIcon(tL_chatBannedRights23.send_videos ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            } else {
                                z1Var.e(LocaleController.getString(R.string.SendMediaPermissionPhotos), "", (rqVar.O.send_photos || tL_chatBannedRights23.send_photos) ? false : true, true, z43);
                                z1Var.setIcon(tL_chatBannedRights23.send_photos ? R.drawable.permission_locked : 0);
                                break;
                            }
                        } else {
                            z1Var.e(LocaleController.getString(R.string.SendMediaPolls), "", (rqVar.O.send_polls || tL_chatBannedRights23.send_polls) ? false : true, true, z43);
                            z1Var.setIcon(tL_chatBannedRights23.send_polls ? R.drawable.permission_locked : 0);
                            break;
                        }
                    } else {
                        String string33 = LocaleController.getString(R.string.UserRestrictionsEmbedLinks);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights26 = rqVar.O;
                        z1Var.e(string33, "", (tL_chatBannedRights26.embed_links || tL_chatBannedRights23.embed_links || tL_chatBannedRights26.send_plain || tL_chatBannedRights23.send_plain) ? false : true, true, z43);
                        z1Var.setIcon(tL_chatBannedRights23.embed_links ? R.drawable.permission_locked : 0);
                        break;
                    }
                } else {
                    z1Var.e(LocaleController.getString(R.string.SendMediaPermissionStickersGifs), "", (rqVar.O.send_stickers || tL_chatBannedRights23.send_stickers) ? false : true, true, z43);
                    z1Var.setIcon(tL_chatBannedRights23.send_stickers ? R.drawable.permission_locked : 0);
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Components.n01) view).a(rqVar.v, rqVar.S, i48 == 0, false, new u3(this, 2));
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.c;
        rq rqVar = this.e;
        switch (i10) {
            case 0:
                View abVar = new org.telegram.ui.Cells.ab(context, null);
                abVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view2 = abVar;
                break;
            case 1:
                view2 = new org.telegram.ui.Cells.f9(context);
                break;
            case 2:
            default:
                View gaVar = new org.telegram.ui.Cells.ga(context);
                gaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view2 = gaVar;
                break;
            case 3:
                View m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 15, true, null);
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = m4Var;
                view2 = view;
                break;
            case 4:
            case 9:
                View w8Var = new org.telegram.ui.Cells.w8(context);
                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view2 = w8Var;
                break;
            case 5:
                view2 = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                break;
            case 6:
                View d9Var = new org.telegram.ui.Cells.d9(context, null, false);
                d9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view2 = d9Var;
                break;
            case 7:
                org.telegram.ui.Cells.e6 e6Var = new org.telegram.ui.Cells.e6(context, 0, null, null);
                e6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                e6Var.c(new m0(this, 4));
                view2 = e6Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                rqVar.d = frameLayout;
                int i12 = org.telegram.ui.ActionBar.j6.a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                rqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, false, false);
                rqVar.f = o6Var;
                o6Var.setTypeface(AndroidUtilities.bold());
                rqVar.f.setTextColor(-1);
                rqVar.f.setTextSize(AndroidUtilities.dp(14.0f));
                rqVar.f.setGravity(17);
                org.telegram.ui.Components.o6 o6Var2 = rqVar.f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.em.l(R.string.AddBotButton, " ", sb2);
                sb2.append(LocaleController.getString(rqVar.K ? R.string.AddBotButtonAsAdmin : R.string.AddBotButtonAsMember));
                o6Var2.setText(sb2.toString());
                rqVar.e.addView(rqVar.f, w7.a6.e(-2, -2, 17));
                rqVar.e.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                rqVar.e.setOnClickListener(new a(this, 15));
                rqVar.d.addView(rqVar.e, w7.a6.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                rqVar.d.setLayoutParams(new s4.p0(-1, -2));
                View view3 = new View(context);
                view3.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                rqVar.d.setClipChildren(false);
                rqVar.d.setClipToPadding(false);
                rqVar.d.addView(view3, w7.a6.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                view2 = rqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.c, rqVar.getResourceProvider(), false);
                z1Var.setPad(1);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.g7, org.telegram.ui.ActionBar.j6.k7);
                z1Var.setEnabled(true);
                z1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                view = z1Var;
                view2 = view;
                break;
            case 11:
                i11 = ((org.telegram.ui.ActionBar.p2) rqVar).currentAccount;
                long j3 = -rqVar.s;
                f6Var = ((org.telegram.ui.ActionBar.p2) rqVar).resourceProvider;
                view2 = new org.telegram.ui.Components.n01(i11, j3, this.c, f6Var);
                break;
        }
        return new org.telegram.ui.Components.fl0(view2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int b10 = c1Var.b();
        rq rqVar = this.e;
        if (b10 == rqVar.u0) {
            rq.f0(rqVar, c1Var.a);
        }
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        int b10 = c1Var.b();
        rq rqVar = this.e;
        if (b10 != rqVar.v0 || rqVar.getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(rqVar.getParentActivity().getCurrentFocus());
    }
}
