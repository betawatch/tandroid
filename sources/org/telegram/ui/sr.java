package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class sr extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public final /* synthetic */ wr d;

    public sr(wr wrVar, Context context) {
        this.d = wrVar;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r7 == r3.L0) goto L42;
     */
    @Override // org.telegram.ui.Components.ul0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 != 16) {
            wr wrVar = this.d;
            if (i10 == 7 || i10 == 14) {
                return ChatObject.canBlockUsers(wrVar.r);
            }
            if (i10 == 0) {
                Object currentObject = ((org.telegram.ui.Cells.b5) c1Var.a).getCurrentObject();
                if (wrVar.O != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b10 = c1Var.b();
                if (i10 != 0 && i10 != 2 && i10 != 6) {
                    if (i10 == 12) {
                        if (b10 == wrVar.x0) {
                            return ChatObject.canUserDoAdminAction(wrVar.r, 13);
                        }
                        if (b10 == wrVar.J0) {
                            return ChatObject.canUserDoAdminAction(wrVar.r, 2);
                        }
                    }
                    if (i10 != 13) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final TLObject E(int i10) {
        wr wrVar = this.d;
        int i11 = wrVar.E0;
        if (i10 >= i11 && i10 < wrVar.F0) {
            return (TLObject) wrVar.F.get(i10 - i11);
        }
        int i12 = wrVar.U0;
        if (i10 >= i12 && i10 < wrVar.V0) {
            return (TLObject) wrVar.H.get(i10 - i12);
        }
        int i13 = wrVar.X0;
        if (i10 < i13 || i10 >= wrVar.Y0) {
            return null;
        }
        return (TLObject) wrVar.G.get(i10 - i13);
    }

    @Override // s4.h0
    public final int h() {
        return this.d.d1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        wr wrVar = this.d;
        if (i10 == wrVar.z0 || i10 == wrVar.A0 || i10 == wrVar.v0 || i10 == wrVar.t0) {
            return 2;
        }
        if ((i10 >= wrVar.E0 && i10 < wrVar.F0) || ((i10 >= wrVar.X0 && i10 < wrVar.Y0) || (i10 >= wrVar.U0 && i10 < wrVar.V0))) {
            return 0;
        }
        if (i10 == wrVar.C0 || i10 == wrVar.G0 || i10 == wrVar.H0) {
            return 3;
        }
        if (i10 == wrVar.D0 || i10 == wrVar.S || i10 == wrVar.N0 || i10 == wrVar.s0 || i10 == wrVar.p0) {
            return 5;
        }
        if (i10 == wrVar.b1 || i10 == wrVar.P0 || i10 == wrVar.R0 || i10 == wrVar.u0 || i10 == wrVar.y0 || i10 == wrVar.K0 || i10 == wrVar.M0 || i10 == wrVar.j1 || i10 == wrVar.o0 || i10 == wrVar.r0) {
            return 1;
        }
        if (i10 == wrVar.c1) {
            return 4;
        }
        if (i10 == wrVar.B0) {
            return 6;
        }
        if (i10 == wrVar.g0 || i10 == wrVar.h0 || i10 == wrVar.m0 || i10 == wrVar.i0 || i10 == wrVar.j0 || i10 == wrVar.T || i10 == wrVar.e0 || i10 == wrVar.f0 || i10 == wrVar.l0 || i10 == wrVar.Q0) {
            return 7;
        }
        if (i10 == wrVar.Z0 || i10 == wrVar.T0 || i10 == wrVar.W0 || i10 == wrVar.g1) {
            return 8;
        }
        if (i10 == wrVar.O0) {
            return 9;
        }
        if (i10 == wrVar.a1) {
            return 10;
        }
        if (i10 == wrVar.f1) {
            return 11;
        }
        if (i10 == wrVar.x0 || i10 == wrVar.J0 || i10 == wrVar.L0) {
            return 12;
        }
        if (wrVar.p0(i10)) {
            return 13;
        }
        if (i10 == wrVar.U) {
            return 14;
        }
        if (i10 == wrVar.S0) {
            return 15;
        }
        if (i10 == wrVar.h1 || i10 == wrVar.i1 || i10 == wrVar.n0) {
            return 16;
        }
        return i10 == wrVar.q0 ? 17 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:464:0x07e7, code lost:
    
        if (r3.r.megagroup == false) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x07e9, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x07ff, code lost:
    
        if (r3.r.megagroup == false) goto L463;
     */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0b35  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x0873  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        CharSequence charSequence;
        long j3;
        long j10;
        boolean z11;
        boolean z12;
        long j11;
        long j12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z13;
        boolean z14;
        boolean z15;
        int i12;
        TLObject chat;
        CharSequence charSequence2;
        TLRPC.User user;
        TLRPC.User user2;
        CharSequence sb2;
        int i13;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        wr wrVar = this.d;
        ArrayList arrayList = wrVar.F;
        boolean z16 = wrVar.w;
        boolean z17 = wrVar.v;
        int i14 = wrVar.O;
        int i15 = c1Var.f;
        View view = c1Var.a;
        int i16 = 0;
        r13 = false;
        boolean z18 = false;
        r13 = false;
        r13 = false;
        boolean z19 = false;
        r13 = false;
        r13 = false;
        boolean z20 = false;
        r14 = true;
        r14 = true;
        boolean z21 = true;
        switch (i15) {
            case 0:
                org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                b5Var.setTag(Integer.valueOf(i10));
                TLObject E = E(i10);
                if (i10 < wrVar.E0 || i10 >= (i11 = wrVar.F0)) {
                    if (i10 >= wrVar.U0 && i10 < (i11 = wrVar.V0)) {
                        if (ChatObject.isChannel(wrVar.r)) {
                            break;
                        }
                    } else {
                        i11 = wrVar.Y0;
                    }
                    z10 = false;
                } else {
                    if (ChatObject.isChannel(wrVar.r)) {
                        break;
                    }
                    z10 = false;
                }
                if (E instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) E).id;
                    charSequence = "";
                    z12 = false;
                    z11 = false;
                    tL_chatBannedRights = null;
                    j11 = 0;
                    j12 = 0;
                    j3 = 0;
                } else if (E instanceof TLRPC.ChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
                    j10 = MessageObject.getPeerId(channelParticipant.peer);
                    charSequence = "";
                    long j13 = channelParticipant.kicked_by;
                    long j14 = channelParticipant.promoted_by;
                    j3 = 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = channelParticipant.banned_rights;
                    int i17 = channelParticipant.date;
                    z13 = channelParticipant instanceof TLRPC.TL_channelParticipantBanned;
                    z12 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                    z11 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                    i16 = i17;
                    j11 = j13;
                    tL_chatBannedRights = tL_chatBannedRights3;
                    j12 = j14;
                    if (j10 <= j3) {
                        z14 = z12;
                        z15 = z11;
                        chat = wrVar.getMessagesController().getUser(Long.valueOf(j10));
                        i12 = i11;
                    } else {
                        z14 = z12;
                        z15 = z11;
                        i12 = i11;
                        chat = wrVar.getMessagesController().getChat(Long.valueOf(-j10));
                    }
                    if (chat == null) {
                        if (i14 != 3) {
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    if (i14 == 2) {
                                        b5Var.b(chat, null, (!z10 || i16 == 0) ? null : LocaleController.formatJoined(i16), i10 != i12 + (-1));
                                        break;
                                    }
                                } else {
                                    if (!z14) {
                                        if (!z15 || (user = wrVar.getMessagesController().getUser(Long.valueOf(j12))) == null) {
                                            charSequence2 = null;
                                        } else if (user.id == j10) {
                                            charSequence2 = LocaleController.getString(R.string.ChannelAdministrator);
                                        } else {
                                            charSequence2 = LocaleController.formatString(R.string.EditAdminPromotedBy, UserObject.getUserName(user));
                                        }
                                        b5Var.b(chat, null, charSequence2, i10 == i12 + (-1));
                                        break;
                                    } else {
                                        charSequence2 = LocaleController.getString(R.string.ChannelCreator);
                                    }
                                    b5Var.b(chat, null, charSequence2, i10 == i12 + (-1));
                                }
                            } else {
                                b5Var.b(chat, null, (!z13 || (user2 = wrVar.getMessagesController().getUser(Long.valueOf(j11))) == null) ? null : LocaleController.formatString(R.string.UserRemovedBy, UserObject.getUserName(user2)), i10 != i12 + (-1));
                                break;
                            }
                        } else {
                            if (tL_chatBannedRights == null) {
                                sb2 = charSequence;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                boolean z22 = tL_chatBannedRights.view_messages;
                                if (z22 && wrVar.E.view_messages != z22) {
                                    sb3.append(LocaleController.getString("UserRestrictionsNoRead", R.string.UserRestrictionsNoRead));
                                }
                                if (tL_chatBannedRights.send_messages && wrVar.E.send_plain != tL_chatBannedRights.send_plain) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendText", R.string.UserRestrictionsNoSendText));
                                }
                                boolean z23 = tL_chatBannedRights.send_media;
                                if (!z23 || wrVar.E.send_media == z23) {
                                    boolean z24 = tL_chatBannedRights.send_photos;
                                    if (z24 && wrVar.E.send_photos != z24) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendPhotos", R.string.UserRestrictionsNoSendPhotos));
                                    }
                                    boolean z25 = tL_chatBannedRights.send_videos;
                                    if (z25 && wrVar.E.send_videos != z25) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendVideos", R.string.UserRestrictionsNoSendVideos));
                                    }
                                    boolean z26 = tL_chatBannedRights.send_audios;
                                    if (z26 && wrVar.E.send_audios != z26) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendMusic", R.string.UserRestrictionsNoSendMusic));
                                    }
                                    boolean z27 = tL_chatBannedRights.send_docs;
                                    if (z27 && wrVar.E.send_docs != z27) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendDocs", R.string.UserRestrictionsNoSendDocs));
                                    }
                                    boolean z28 = tL_chatBannedRights.send_voices;
                                    if (z28 && wrVar.E.send_voices != z28) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendVoice", R.string.UserRestrictionsNoSendVoice));
                                    }
                                    boolean z29 = tL_chatBannedRights.send_roundvideos;
                                    if (z29 && wrVar.E.send_roundvideos != z29) {
                                        if (sb3.length() != 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(LocaleController.getString("UserRestrictionsNoSendRound", R.string.UserRestrictionsNoSendRound));
                                    }
                                } else {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendMedia", R.string.UserRestrictionsNoSendMedia));
                                }
                                boolean z30 = tL_chatBannedRights.send_stickers;
                                if (z30 && wrVar.E.send_stickers != z30) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendStickers", R.string.UserRestrictionsNoSendStickers));
                                }
                                boolean z31 = tL_chatBannedRights.send_polls;
                                if (z31 && wrVar.E.send_polls != z31) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoSendPolls", R.string.UserRestrictionsNoSendPolls));
                                }
                                boolean z32 = tL_chatBannedRights.embed_links;
                                if (z32 && !tL_chatBannedRights.send_plain && wrVar.E.embed_links != z32) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoEmbedLinks", R.string.UserRestrictionsNoEmbedLinks));
                                }
                                boolean z33 = tL_chatBannedRights.invite_users;
                                if (z33 && wrVar.E.invite_users != z33) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString("UserRestrictionsNoInviteUsers", R.string.UserRestrictionsNoInviteUsers));
                                }
                                boolean z34 = tL_chatBannedRights.pin_messages;
                                if (z34 && wrVar.E.pin_messages != z34) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString(R.string.UserRestrictionsNoPinMessages));
                                }
                                boolean z35 = tL_chatBannedRights.edit_rank;
                                if (z35 && wrVar.E.edit_rank != z35) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString(R.string.UserRestrictionsNoEditTags));
                                }
                                boolean z36 = tL_chatBannedRights.send_reactions;
                                if (z36 && wrVar.E.send_reactions != z36) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString(R.string.UserRestrictionsNoSendReactions));
                                }
                                boolean z37 = tL_chatBannedRights.change_info;
                                if (z37 && wrVar.E.change_info != z37) {
                                    if (sb3.length() != 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(LocaleController.getString(R.string.UserRestrictionsNoChangeInfo));
                                }
                                if (sb3.length() != 0) {
                                    sb3.replace(0, 1, sb3.substring(0, 1).toUpperCase());
                                    sb3.append('.');
                                }
                                sb2 = sb3.toString();
                            }
                            b5Var.b(chat, null, sb2, i10 != i12 + (-1));
                            break;
                        }
                    }
                } else {
                    charSequence = "";
                    j3 = 0;
                    if (E instanceof TLRPC.ChatParticipant) {
                        TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) E;
                        j10 = chatParticipant.user_id;
                        int i18 = chatParticipant.date;
                        boolean z38 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                        z11 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                        i16 = i18;
                        z12 = z38;
                        j11 = 0;
                        j12 = 0;
                        tL_chatBannedRights = null;
                    }
                }
                z13 = false;
                if (j10 <= j3) {
                }
                if (chat == null) {
                }
                break;
            case 1:
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                if (i10 != wrVar.y0) {
                    if (i10 != wrVar.b1) {
                        if (i10 != wrVar.P0) {
                            if (i10 != wrVar.o0) {
                                if (i10 != wrVar.r0) {
                                    if (i10 != wrVar.K0) {
                                        if (i10 != wrVar.M0) {
                                            if (i10 != wrVar.u0) {
                                                if (i10 != wrVar.R0) {
                                                    if (i10 == wrVar.j1) {
                                                        f9Var.setText(LocaleController.getString(wrVar.v1 ? R.string.ChannelSignProfilesInfo : R.string.ChannelSignInfo));
                                                        break;
                                                    }
                                                } else if (!wrVar.r1) {
                                                    f9Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo));
                                                    break;
                                                } else {
                                                    f9Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo2));
                                                    break;
                                                }
                                            } else {
                                                f9Var.setText(LocaleController.getString(R.string.BroadcastGroupConvertInfo));
                                                break;
                                            }
                                        } else {
                                            f9Var.setText(LocaleController.getString(R.string.ChannelMemberTagsInfo));
                                            break;
                                        }
                                    } else {
                                        f9Var.setText(LocaleController.getString(R.string.ChannelHideMembersInfo));
                                        break;
                                    }
                                } else {
                                    f9Var.setText(LocaleController.formatString(R.string.GroupMessagesPriceInfo, di.m.G0(wrVar.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((wrVar.A1 * (wrVar.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f)) / 1000.0d) * wrVar.getMessagesController().starsUsdWithdrawRate1000)) / 100.0d)));
                                    break;
                                }
                            } else {
                                f9Var.setText(LocaleController.getString(R.string.GroupMessagesChargePriceInfo));
                                break;
                            }
                        } else {
                            int m0 = wr.m0(wrVar.p1);
                            if (wrVar.s != null && m0 != 0) {
                                f9Var.setText(LocaleController.formatString(R.string.SlowmodeInfoSelected, m0 < 60 ? LocaleController.formatPluralString("Seconds", m0, new Object[0]) : m0 < 3600 ? LocaleController.formatPluralString("Minutes", m0 / 60, new Object[0]) : LocaleController.formatPluralString("Hours", (m0 / 60) / 60, new Object[0])));
                                break;
                            } else {
                                f9Var.setText(LocaleController.getString(R.string.SlowmodeInfoOff));
                                break;
                            }
                        }
                    } else if (i14 != 0 && i14 != 3) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                if (!z17 || wrVar.e1 != 0) {
                                    f9Var.setText("");
                                    break;
                                } else {
                                    f9Var.setText(LocaleController.getString("ChannelMembersInfo", R.string.ChannelMembersInfo));
                                    break;
                                }
                            }
                        } else if (wrVar.z0 == -1) {
                            f9Var.setText("");
                            break;
                        } else if (!z17) {
                            f9Var.setText(LocaleController.getString("MegaAdminsInfo", R.string.MegaAdminsInfo));
                            break;
                        } else {
                            f9Var.setText(LocaleController.getString("ChannelAdminsInfo", R.string.ChannelAdminsInfo));
                            break;
                        }
                    } else if (!z17) {
                        if (!z16) {
                            f9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                            break;
                        } else {
                            f9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                            break;
                        }
                    } else {
                        f9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                        break;
                    }
                } else {
                    f9Var.setText(LocaleController.getString("ChannelAntiSpamInfo", R.string.ChannelAntiSpamInfo));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                y4Var.a(org.telegram.ui.ActionBar.j6.m6, org.telegram.ui.ActionBar.j6.G6);
                if (i10 != wrVar.z0) {
                    if (i10 != wrVar.v0) {
                        if (i10 != wrVar.A0) {
                            if (i10 == wrVar.t0) {
                                y4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                                y4Var.b(LocaleController.getString("BroadcastGroupConvert", R.string.BroadcastGroupConvert), R.drawable.msg_channel, 5, false);
                                break;
                            }
                        } else {
                            y4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                            if ((!wrVar.Q || wrVar.R) && wrVar.Z0 == -1 && !arrayList.isEmpty()) {
                                z20 = true;
                            }
                            y4Var.b(LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink), R.drawable.msg_link2, 5, z20);
                            break;
                        }
                    } else {
                        y4Var.b(LocaleController.getString(R.string.EventLog), R.drawable.msg_log, 5, wrVar.x0 > wrVar.v0);
                        break;
                    }
                } else if (i14 != 3) {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                y4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                                if (wrVar.A0 != -1 || ((!wrVar.Q || wrVar.R) && wrVar.Z0 == -1 && !arrayList.isEmpty())) {
                                    z19 = true;
                                }
                                if (!z17) {
                                    y4Var.b(LocaleController.getString(R.string.AddMember), R.drawable.msg_contact_add, 5, z19);
                                    break;
                                } else {
                                    y4Var.b(LocaleController.getString(R.string.AddSubscriber), R.drawable.msg_contact_add, 5, z19);
                                    break;
                                }
                            }
                        } else {
                            y4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                            y4Var.b(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin), R.drawable.msg_admin_add, 5, !wrVar.Q || wrVar.R);
                            break;
                        }
                    } else {
                        y4Var.b(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser), R.drawable.msg_user_remove, 5, false);
                        break;
                    }
                } else {
                    y4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                    y4Var.b(LocaleController.getString("ChannelAddException", R.string.ChannelAddException), R.drawable.msg_contact_add, 5, wrVar.E0 != -1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 != wrVar.D0) {
                    if (i10 != wrVar.S) {
                        if (i10 != wrVar.N0) {
                            if (i10 != wrVar.s0) {
                                if (i10 == wrVar.p0) {
                                    m4Var.setText(LocaleController.getString(R.string.GroupMessagesPriceHeader));
                                    break;
                                }
                            } else {
                                m4Var.setText(LocaleController.getString(R.string.BroadcastGroup));
                                break;
                            }
                        } else {
                            m4Var.setText(LocaleController.getString(R.string.Slowmode));
                            break;
                        }
                    } else {
                        m4Var.setText(LocaleController.getString(z16 ? R.string.CommunityPermissionsHeader : R.string.ChannelPermissionsHeader));
                        break;
                    }
                } else if (i14 != 0) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                    break;
                } else {
                    TLRPC.ChatFull chatFull3 = wrVar.s;
                    int size = chatFull3 != null ? chatFull3.kicked_count : arrayList.size();
                    if (size == 0) {
                        m4Var.setText(LocaleController.getString(R.string.ChannelBlockedUsers));
                        break;
                    } else {
                        m4Var.setText(LocaleController.formatPluralString("RemovedUser", size, new Object[0]));
                        break;
                    }
                }
                break;
            case 6:
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                String string = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                TLRPC.ChatFull chatFull4 = wrVar.s;
                gaVar.c(string, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                w8Var.getCheckBox().setDrawIconType(1);
                Switch checkBox = w8Var.getCheckBox();
                int i19 = org.telegram.ui.ActionBar.j6.r7;
                int i20 = org.telegram.ui.ActionBar.j6.V6;
                int i21 = org.telegram.ui.ActionBar.j6.d6;
                checkBox.d(i19, i20, i21, i21);
                boolean z39 = w8Var.getTag() != null && ((Integer) w8Var.getTag()).intValue() == i10;
                w8Var.setTag(Integer.valueOf(i10));
                if (i10 == wrVar.g0) {
                    w8Var.d(LocaleController.getString(z16 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo), (wrVar.E.change_info || ChatObject.isPublic(wrVar.r)) ? false : true, wrVar.l0 != -1, z39);
                } else if (i10 == wrVar.m0) {
                    w8Var.d(LocaleController.getString(R.string.CommunityAdminRightEditGroupList), !wrVar.E.manage_linked_peers, false, z39);
                } else if (i10 == wrVar.h0) {
                    w8Var.d(LocaleController.getString("UserRestrictionsInviteUsers", R.string.UserRestrictionsInviteUsers), !wrVar.E.invite_users, true, z39);
                } else if (i10 == wrVar.i0) {
                    w8Var.d(LocaleController.getString(R.string.UserRestrictionsPinMessages), (wrVar.E.pin_messages || ChatObject.isPublic(wrVar.r)) ? false : true, true, z39);
                } else if (i10 == wrVar.j0) {
                    w8Var.d(LocaleController.getString(R.string.UserRestrictionsEditTags), !wrVar.E.edit_rank, true, z39);
                } else if (i10 == wrVar.T) {
                    w8Var.d(LocaleController.getString("UserRestrictionsSendText", R.string.UserRestrictionsSendText), !wrVar.E.send_plain, true, z39);
                } else if (i10 == wrVar.Q0) {
                    w8Var.d(LocaleController.getString(R.string.GroupNotRestrictBoosters), wrVar.r1, false, z39);
                    w8Var.getCheckBox().setDrawIconType(0);
                    w8Var.getCheckBox().d(org.telegram.ui.ActionBar.j6.M6, org.telegram.ui.ActionBar.j6.N6, i21, i21);
                } else if (i10 == wrVar.U) {
                    int n02 = wr.n0(wrVar.E);
                    w8Var.d(LocaleController.getString("UserRestrictionsSendMedia", R.string.UserRestrictionsSendMedia), n02 > 0, true, z39);
                    Locale locale = Locale.US;
                    w8Var.a(new i9.s(this, w8Var, false, 22), a4.a.m(n02, "/10"), !wrVar.l1);
                } else if (i10 == wrVar.e0) {
                    w8Var.d(LocaleController.getString("UserRestrictionsSendStickers", R.string.UserRestrictionsSendStickers), !wrVar.E.send_stickers, true, z39);
                } else if (i10 == wrVar.f0) {
                    w8Var.d(LocaleController.getString("UserRestrictionsEmbedLinks", R.string.UserRestrictionsEmbedLinks), !wrVar.E.embed_links, true, z39);
                } else if (i10 == wrVar.d0) {
                    w8Var.d(LocaleController.getString("UserRestrictionsSendPollsShort", R.string.UserRestrictionsSendPollsShort), !wrVar.E.send_polls, true, false);
                } else if (i10 == wrVar.l0) {
                    w8Var.d(LocaleController.getString("CreateTopicsPermission", R.string.CreateTopicsPermission), !wrVar.E.manage_topics, false, z39);
                }
                if (i10 == wrVar.i0 || i10 == wrVar.g0) {
                    i13 = ((org.telegram.ui.ActionBar.p2) wrVar).currentAccount;
                    if (ChatObject.isDiscussionGroup(i13, wrVar.N)) {
                        w8Var.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!ChatObject.canBlockUsers(wrVar.r)) {
                    w8Var.setIcon(0);
                    break;
                } else if ((i10 == wrVar.h0 && !ChatObject.canUserDoAdminAction(wrVar.r, 3)) || ((i10 == wrVar.i0 && !ChatObject.canUserDoAdminAction(wrVar.r, 0)) || ((i10 == wrVar.g0 && !ChatObject.canUserDoAdminAction(wrVar.r, 1)) || ((i10 == wrVar.l0 && !ChatObject.canManageTopics(wrVar.r)) || (ChatObject.isPublic(wrVar.r) && (i10 == wrVar.i0 || i10 == wrVar.g0)))))) {
                    w8Var.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    w8Var.setIcon(0);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
                if (i10 != wrVar.Z0) {
                    if (i10 != wrVar.W0) {
                        if (i10 != wrVar.T0) {
                            if (i10 == wrVar.g1) {
                                u3Var.setText("");
                                break;
                            }
                        } else if (ChatObject.isChannel(wrVar.r) && !wrVar.r.megagroup) {
                            u3Var.setText(LocaleController.getString("ChannelContacts", R.string.ChannelContacts));
                            break;
                        } else {
                            u3Var.setText(LocaleController.getString("GroupContacts", R.string.GroupContacts));
                            break;
                        }
                    } else {
                        u3Var.setText(LocaleController.getString("ChannelBots", R.string.ChannelBots));
                        break;
                    }
                } else if (ChatObject.isChannel(wrVar.r) && !wrVar.r.megagroup) {
                    u3Var.setText(LocaleController.getString("ChannelOtherSubscribers", R.string.ChannelOtherSubscribers));
                    break;
                } else {
                    u3Var.setText(LocaleController.getString("ChannelOtherMembers", R.string.ChannelOtherMembers));
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.a10 a10Var = (org.telegram.ui.Components.a10) view;
                if (i14 != 0) {
                    a10Var.setItemsCount(1);
                    break;
                } else {
                    TLRPC.ChatFull chatFull5 = wrVar.s;
                    a10Var.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    break;
                }
            case 12:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                if (i10 != wrVar.x0) {
                    if (i10 != wrVar.J0) {
                        if (i10 == wrVar.L0) {
                            s8Var.getCheckBox().setIcon(0);
                            String string2 = LocaleController.getString(R.string.ChannelMemberTags);
                            TLRPC.Chat chat2 = wrVar.r;
                            if (chat2 != null && (tL_chatBannedRights2 = chat2.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z21 = false;
                            }
                            s8Var.j(string2, z21, false);
                            break;
                        }
                    } else {
                        s8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(wrVar.r, 2) && ((chatFull = wrVar.s) == null || chatFull.participants_hidden || wrVar.l0() >= wrVar.getMessagesController().hiddenMembersGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                        String string3 = LocaleController.getString(R.string.ChannelHideMembers);
                        TLRPC.ChatFull chatFull6 = wrVar.s;
                        s8Var.j(string3, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    s8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(wrVar.r, 13) && ((chatFull2 = wrVar.s) == null || chatFull2.antispam || wrVar.l0() >= wrVar.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                    String string4 = LocaleController.getString("ChannelAntiSpam", R.string.ChannelAntiSpam);
                    TLRPC.ChatFull chatFull7 = wrVar.s;
                    if (chatFull7 != null && chatFull7.antispam) {
                        z18 = true;
                    }
                    s8Var.l(R.drawable.msg_policy, string4, z18);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                boolean z40 = z1Var.getTag() != null && ((Integer) z1Var.getTag()).intValue() == i10;
                z1Var.setTag(Integer.valueOf(i10));
                if (i10 != wrVar.V) {
                    if (i10 != wrVar.W) {
                        if (i10 != wrVar.X) {
                            if (i10 != wrVar.Y) {
                                if (i10 != wrVar.Z) {
                                    if (i10 != wrVar.a0) {
                                        if (i10 != wrVar.b0) {
                                            if (i10 != wrVar.c0) {
                                                if (i10 != wrVar.k0) {
                                                    if (i10 != wrVar.d0) {
                                                        z1Var.setPad(1);
                                                        break;
                                                    } else {
                                                        z1Var.e(LocaleController.getString("SendMediaPolls", R.string.SendMediaPolls), "", !wrVar.E.send_polls, true, z40);
                                                        break;
                                                    }
                                                } else {
                                                    z1Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", !wrVar.E.send_reactions, false, z40);
                                                    break;
                                                }
                                            } else {
                                                String string5 = LocaleController.getString("SendMediaEmbededLinks", R.string.SendMediaEmbededLinks);
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = wrVar.E;
                                                z1Var.e(string5, "", (tL_chatBannedRights4.embed_links || tL_chatBannedRights4.send_plain) ? false : true, true, z40);
                                                break;
                                            }
                                        } else {
                                            z1Var.e(LocaleController.getString("SendMediaPermissionRound", R.string.SendMediaPermissionRound), "", !wrVar.E.send_roundvideos, true, z40);
                                            break;
                                        }
                                    } else {
                                        z1Var.e(LocaleController.getString("SendMediaPermissionVoice", R.string.SendMediaPermissionVoice), "", !wrVar.E.send_voices, true, z40);
                                        break;
                                    }
                                } else {
                                    z1Var.e(LocaleController.getString("SendMediaPermissionFiles", R.string.SendMediaPermissionFiles), "", !wrVar.E.send_docs, true, z40);
                                    break;
                                }
                            } else {
                                z1Var.e(LocaleController.getString("SendMediaPermissionMusic", R.string.SendMediaPermissionMusic), "", !wrVar.E.send_audios, true, z40);
                                break;
                            }
                        } else {
                            z1Var.e(LocaleController.getString("SendMediaPermissionStickersGifs", R.string.SendMediaPermissionStickersGifs), "", !wrVar.E.send_stickers, true, z40);
                            break;
                        }
                    } else {
                        z1Var.e(LocaleController.getString("SendMediaPermissionVideos", R.string.SendMediaPermissionVideos), "", !wrVar.E.send_videos, true, z40);
                        break;
                    }
                } else {
                    z1Var.e(LocaleController.getString("SendMediaPermissionPhotos", R.string.SendMediaPermissionPhotos), "", !wrVar.E.send_photos, true, z40);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                if (i10 != wrVar.h1) {
                    if (i10 != wrVar.i1) {
                        if (i10 == wrVar.n0) {
                            x8Var.f(LocaleController.getString(R.string.GroupMessagesChargePrice), wrVar.y1, false);
                            break;
                        }
                    } else {
                        x8Var.f(LocaleController.getString(R.string.ChannelSignMessagesWithProfile), wrVar.w1, false);
                        break;
                    }
                } else {
                    String string6 = LocaleController.getString(R.string.ChannelSignMessages);
                    boolean z41 = wrVar.v1;
                    x8Var.f(string6, z41, z41);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
                if (i10 == wrVar.q0) {
                    int[] a2 = org.telegram.ui.Cells.a8.a((int) wrVar.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    int clamp = (int) Utilities.clamp(wrVar.A1, wrVar.getMessagesController().starsPaidMessageAmountMax, 1L);
                    n2.l lVar = new n2.l(21);
                    org.telegram.ui.Cells.z7 z7Var = new org.telegram.ui.Cells.z7();
                    z7Var.c = a2;
                    z7Var.d = 20;
                    z7Var.e = lVar;
                    a8Var.d(clamp, z7Var, new u3(this, 3));
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        View view;
        View view2;
        Context context = this.c;
        wr wrVar = this.d;
        switch (i10) {
            case 0:
                int i11 = wrVar.O;
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5((i11 == 0 || i11 == 3) ? 7 : 6, (i11 == 0 || i11 == 3) ? 6 : 2, this.c, null, wrVar.e1 == 0);
                b5Var.setDelegate(new rr(this, 0));
                view2 = b5Var;
                view = view2;
                break;
            case 1:
                view = new org.telegram.ui.Cells.f9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                break;
            case 4:
                org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
                if (!wrVar.v) {
                    if (!wrVar.w) {
                        f9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                        view = f9Var;
                        break;
                    } else {
                        f9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                        view = f9Var;
                        break;
                    }
                } else {
                    f9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    view = f9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                view2 = m4Var;
                view = view2;
                break;
            case 6:
                view = new org.telegram.ui.Cells.ga(context);
                break;
            case 7:
            case 14:
                view = new org.telegram.ui.Cells.w8(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.p2) wrVar).resourceProvider;
                View u3Var = new org.telegram.ui.Cells.u3(context, 26, f6Var);
                u3Var.setBackground(null);
                view = u3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.ew0 ew0Var = new org.telegram.ui.Components.ew0(context, null);
                ew0Var.b(wrVar.p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                ew0Var.setCallback(new rr(this, 1));
                view = ew0Var;
                break;
            case 10:
                view = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, null);
                a10Var.setIsSingleCell(true);
                a10Var.setViewType(6);
                a10Var.w = false;
                a10Var.setUseHeaderOffset(false);
                a10Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.p0 p0Var = new s4.p0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = AndroidUtilities.dp(30.0f);
                a10Var.setLayoutParams(p0Var);
                view = a10Var;
                break;
            case 12:
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(23, this.c, wrVar.getResourceProvider(), false, true);
                s8Var.v = 50;
                view = s8Var;
                break;
            case 13:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.c, wrVar.getResourceProvider(), false);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.g7, org.telegram.ui.ActionBar.j6.k7);
                z1Var.setEnabled(true);
                view = z1Var;
                break;
            case 15:
                org.telegram.ui.Components.ew0 ew0Var2 = new org.telegram.ui.Components.ew0(context, null);
                Drawable[] drawableArr = {wrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), wrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), wrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), wrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), wrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i12 = wrVar.s1;
                ew0Var2.b(i12 > 0 ? i12 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                ew0Var2.setCallback(new rr(this, 2));
                view2 = ew0Var2;
                view = view2;
                break;
            case 16:
                view = new org.telegram.ui.Cells.x8(context, wrVar.getResourceProvider());
                break;
            case 17:
                view = new org.telegram.ui.Cells.a8(context, wrVar.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.fl0(view);
    }
}
