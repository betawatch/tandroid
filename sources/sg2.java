// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sg2 extends q59 {
    public final Context c;
    public final /* synthetic */ wg2 d;

    public sg2(wg2 wg2Var, Context context) {
        this.d = wg2Var;
        this.c = context;
    }

    @Override // y59
    public final void A(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof ij6) {
            ((ij6) view).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        if (r6 != r5.L0) goto L33;
     */
    @Override // q59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if (i != 16) {
            wg2 wg2Var = this.d;
            if (i == 7 || i == 14) {
                return sd2.w(2, wg2Var.n);
            }
            if (i == 0) {
                Object currentObject = ((ij6) u69Var.a).getCurrentObject();
                if (wg2Var.O != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b = u69Var.b();
                if (i != 0 && i != 2 && i != 6) {
                    if (i == 12) {
                        if (b == wg2Var.x0) {
                            return sd2.y(13, wg2Var.n);
                        }
                        if (b == wg2Var.J0) {
                            return sd2.y(2, wg2Var.n);
                        }
                    }
                    if (i != 13) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final TLObject E(int i) {
        wg2 wg2Var = this.d;
        int i2 = wg2Var.E0;
        if (i >= i2 && i < wg2Var.F0) {
            return (TLObject) wg2Var.F.get(i - i2);
        }
        int i3 = wg2Var.U0;
        if (i >= i3 && i < wg2Var.V0) {
            return (TLObject) wg2Var.H.get(i - i3);
        }
        int i4 = wg2Var.X0;
        if (i < i4 || i >= wg2Var.Y0) {
            return null;
        }
        return (TLObject) wg2Var.G.get(i - i4);
    }

    @Override // y59
    public final int b() {
        return this.d.d1;
    }

    @Override // y59
    public final int d(int i) {
        wg2 wg2Var = this.d;
        if (i == wg2Var.z0 || i == wg2Var.A0 || i == wg2Var.v0 || i == wg2Var.t0) {
            return 2;
        }
        if (i >= wg2Var.E0 && i < wg2Var.F0) {
            return 0;
        }
        if (i >= wg2Var.X0 && i < wg2Var.Y0) {
            return 0;
        }
        if (i >= wg2Var.U0 && i < wg2Var.V0) {
            return 0;
        }
        if (i == wg2Var.C0 || i == wg2Var.G0 || i == wg2Var.H0) {
            return 3;
        }
        if (i == wg2Var.D0 || i == wg2Var.S || i == wg2Var.N0 || i == wg2Var.s0 || i == wg2Var.p0) {
            return 5;
        }
        if (i == wg2Var.b1 || i == wg2Var.P0 || i == wg2Var.R0 || i == wg2Var.u0 || i == wg2Var.y0 || i == wg2Var.K0 || i == wg2Var.M0 || i == wg2Var.j1 || i == wg2Var.o0 || i == wg2Var.r0) {
            return 1;
        }
        if (i == wg2Var.c1) {
            return 4;
        }
        if (i == wg2Var.B0) {
            return 6;
        }
        if (i == wg2Var.g0 || i == wg2Var.h0 || i == wg2Var.m0 || i == wg2Var.i0 || i == wg2Var.j0 || i == wg2Var.T || i == wg2Var.e0 || i == wg2Var.f0 || i == wg2Var.l0 || i == wg2Var.Q0) {
            return 7;
        }
        if (i == wg2Var.Z0 || i == wg2Var.T0 || i == wg2Var.W0 || i == wg2Var.g1) {
            return 8;
        }
        if (i == wg2Var.O0) {
            return 9;
        }
        if (i == wg2Var.a1) {
            return 10;
        }
        if (i == wg2Var.f1) {
            return 11;
        }
        if (i == wg2Var.x0 || i == wg2Var.J0 || i == wg2Var.L0) {
            return 12;
        }
        if (wg2Var.q0(i)) {
            return 13;
        }
        if (i == wg2Var.U) {
            return 14;
        }
        if (i == wg2Var.S0) {
            return 15;
        }
        if (i == wg2Var.h1 || i == wg2Var.i1 || i == wg2Var.n0) {
            return 16;
        }
        return i == wg2Var.q0 ? 17 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:472:0x0866, code lost:
    
        if (r3.n.megagroup == false) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x087f, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x087d, code lost:
    
        if (r3.n.megagroup == false) goto L474;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0bd3  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x0bd5  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        int i2;
        Object[] objArr;
        long j;
        boolean z;
        long j2;
        int i3;
        boolean z2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z3;
        long j3;
        long j4;
        boolean z4;
        int i4;
        Object[] objArr2;
        TLObject L0;
        boolean z5;
        CharSequence charSequence;
        TLRPC.User W1;
        CharSequence M0;
        boolean z6;
        CharSequence charSequence2;
        CharSequence charSequence3;
        TLRPC.User W12;
        int i5;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        wg2 wg2Var = this.d;
        int i6 = u69Var.f;
        View view = u69Var.a;
        CharSequence charSequence4 = "";
        int i7 = R.drawable.permission_locked;
        r13 = true;
        r13 = true;
        boolean z7 = true;
        switch (i6) {
            case 0:
                ij6 ij6Var = (ij6) view;
                ij6Var.setTag(Integer.valueOf(i));
                TLObject E = E(i);
                if (i < wg2Var.E0 || i >= (i2 = wg2Var.F0)) {
                    if (i >= wg2Var.U0 && i < (i2 = wg2Var.V0)) {
                        if (sd2.T(wg2Var.n)) {
                            break;
                        }
                    } else {
                        i2 = wg2Var.Y0;
                    }
                    objArr = false;
                } else {
                    if (sd2.T(wg2Var.n)) {
                        break;
                    }
                    objArr = false;
                }
                if (E instanceof TLRPC.User) {
                    long j5 = ((TLRPC.User) E).id;
                    z = false;
                    z2 = false;
                    i3 = 0;
                    z3 = false;
                    j = 0;
                    j2 = 0;
                    tL_chatBannedRights = null;
                    j3 = j5;
                    j4 = 0;
                } else if (E instanceof TLRPC.ChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
                    long B1 = k47.B1(channelParticipant.peer);
                    j = 0;
                    long j6 = channelParticipant.kicked_by;
                    j4 = channelParticipant.promoted_by;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = channelParticipant.banned_rights;
                    int i8 = channelParticipant.date;
                    boolean z8 = channelParticipant instanceof TLRPC.TL_channelParticipantBanned;
                    boolean z9 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                    z = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                    tL_chatBannedRights = tL_chatBannedRights3;
                    z2 = z9;
                    j3 = B1;
                    j2 = j6;
                    i3 = i8;
                    z3 = z8;
                } else {
                    j = 0;
                    if (E instanceof TLRPC.ChatParticipant) {
                        TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) E;
                        long j7 = chatParticipant.user_id;
                        int i9 = chatParticipant.date;
                        boolean z10 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                        z = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                        j2 = 0;
                        i3 = i9;
                        z2 = z10;
                        tL_chatBannedRights = null;
                        z3 = false;
                        j3 = j7;
                        j4 = 0;
                    }
                }
                if (j3 > j) {
                    z4 = z;
                    L0 = wg2Var.getMessagesController().W1(Long.valueOf(j3));
                    i4 = i2;
                    objArr2 = objArr;
                } else {
                    z4 = z;
                    i4 = i2;
                    objArr2 = objArr;
                    L0 = wg2Var.getMessagesController().L0(Long.valueOf(-j3));
                }
                if (L0 != null) {
                    int i10 = wg2Var.O;
                    if (i10 != 3) {
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    ij6Var.c(L0, null, (!objArr2 == true || i3 == 0) ? null : jb6.B(i3), i != i4 + (-1));
                                    break;
                                }
                            } else {
                                if (!z2) {
                                    if (!z4 || (W1 = wg2Var.getMessagesController().W1(Long.valueOf(j4))) == null) {
                                        z5 = false;
                                        charSequence = null;
                                    } else if (W1.id == j3) {
                                        M0 = jb6.M0(2131752465, null);
                                    } else {
                                        z5 = false;
                                        charSequence = jb6.a0(null, null, 2131751245, m9c.r(W1));
                                    }
                                    ij6Var.c(L0, null, charSequence, i == i4 + (-1) ? true : z5);
                                    break;
                                } else {
                                    M0 = jb6.M0(2131752369, null);
                                }
                                charSequence = M0;
                                z5 = false;
                                ij6Var.c(L0, null, charSequence, i == i4 + (-1) ? true : z5);
                            }
                        } else {
                            if (!z3 || (W12 = wg2Var.getMessagesController().W1(Long.valueOf(j2))) == null) {
                                z6 = true;
                                charSequence2 = null;
                                charSequence3 = null;
                            } else {
                                z6 = true;
                                charSequence2 = null;
                                charSequence3 = jb6.a0(null, null, 2131743419, m9c.r(W12));
                            }
                            ij6Var.c(L0, charSequence2, charSequence3, i != i4 + (-1) ? z6 : false);
                            break;
                        }
                    } else {
                        if (tL_chatBannedRights != null) {
                            StringBuilder sb = new StringBuilder();
                            boolean z11 = tL_chatBannedRights.view_messages;
                            if (z11 && wg2Var.E.view_messages != z11) {
                                sb.append(jb6.M0(2131743392, "UserRestrictionsNoRead"));
                            }
                            if (tL_chatBannedRights.send_messages && wg2Var.E.send_plain != tL_chatBannedRights.send_plain) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(jb6.M0(2131743382, "UserRestrictionsNoSendText"));
                            }
                            boolean z12 = tL_chatBannedRights.send_media;
                            if (!z12 || wg2Var.E.send_media == z12) {
                                boolean z13 = tL_chatBannedRights.send_photos;
                                if (z13 && wg2Var.E.send_photos != z13) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(jb6.M0(2131743387, "UserRestrictionsNoSendPhotos"));
                                }
                                boolean z14 = tL_chatBannedRights.send_videos;
                                if (z14 && wg2Var.E.send_videos != z14) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(jb6.M0(2131743381, "UserRestrictionsNoSendVideos"));
                                }
                                boolean z15 = tL_chatBannedRights.send_audios;
                                if (z15 && wg2Var.E.send_audios != z15) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(jb6.M0(2131743388, "UserRestrictionsNoSendMusic"));
                                }
                                boolean z16 = tL_chatBannedRights.send_docs;
                                if (z16 && wg2Var.E.send_docs != z16) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(jb6.M0(2131743390, "UserRestrictionsNoSendDocs"));
                                }
                                boolean z17 = tL_chatBannedRights.send_voices;
                                if (z17 && wg2Var.E.send_voices != z17) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(jb6.M0(2131743380, "UserRestrictionsNoSendVoice"));
                                }
                                boolean z18 = tL_chatBannedRights.send_roundvideos;
                                if (z18 && wg2Var.E.send_roundvideos != z18) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(jb6.M0(2131743384, "UserRestrictionsNoSendRound"));
                                }
                            } else {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(jb6.M0(2131743389, "UserRestrictionsNoSendMedia"));
                            }
                            boolean z19 = tL_chatBannedRights.send_stickers;
                            if (z19 && wg2Var.E.send_stickers != z19) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(jb6.M0(2131743383, "UserRestrictionsNoSendStickers"));
                            }
                            boolean z20 = tL_chatBannedRights.send_polls;
                            if (z20 && wg2Var.E.send_polls != z20) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(jb6.M0(2131743386, "UserRestrictionsNoSendPolls"));
                            }
                            boolean z21 = tL_chatBannedRights.embed_links;
                            if (z21 && !tL_chatBannedRights.send_plain && wg2Var.E.embed_links != z21) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(jb6.M0(2131743395, "UserRestrictionsNoEmbedLinks"));
                            }
                            boolean z22 = tL_chatBannedRights.invite_users;
                            if (z22 && wg2Var.E.invite_users != z22) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(jb6.M0(2131743394, "UserRestrictionsNoInviteUsers"));
                            }
                            boolean z23 = tL_chatBannedRights.pin_messages;
                            if (z23 && wg2Var.E.pin_messages != z23) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(jb6.M0(2131743393, null));
                            }
                            boolean z24 = tL_chatBannedRights.edit_rank;
                            if (z24 && wg2Var.E.edit_rank != z24) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(jb6.M0(2131743396, null));
                            }
                            boolean z25 = tL_chatBannedRights.send_reactions;
                            if (z25 && wg2Var.E.send_reactions != z25) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(jb6.M0(2131743385, null));
                            }
                            boolean z26 = tL_chatBannedRights.change_info;
                            if (z26 && wg2Var.E.change_info != z26) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(jb6.M0(2131743397, null));
                            }
                            if (sb.length() != 0) {
                                sb.replace(0, 1, sb.substring(0, 1).toUpperCase());
                                sb.append('.');
                            }
                            charSequence4 = sb.toString();
                        }
                        ij6Var.c(L0, null, charSequence4, i != i4 + (-1));
                        break;
                    }
                }
                break;
            case 1:
                njb njbVar = (njb) view;
                if (i != wg2Var.y0) {
                    if (i != wg2Var.b1) {
                        if (i != wg2Var.P0) {
                            if (i != wg2Var.o0) {
                                if (i != wg2Var.r0) {
                                    if (i != wg2Var.K0) {
                                        if (i != wg2Var.M0) {
                                            if (i != wg2Var.u0) {
                                                if (i != wg2Var.R0) {
                                                    if (i == wg2Var.j1) {
                                                        njbVar.setText(jb6.M0(wg2Var.v1 ? 2131752230 : 2131752234, null));
                                                        break;
                                                    }
                                                } else if (!wg2Var.r1) {
                                                    njbVar.setText(jb6.M0(2131749165, null));
                                                    break;
                                                } else {
                                                    njbVar.setText(jb6.M0(2131749164, null));
                                                    break;
                                                }
                                            } else {
                                                njbVar.setText(jb6.M0(2131752835, null));
                                                break;
                                            }
                                        } else {
                                            njbVar.setText(jb6.M0(2131752322, null));
                                            break;
                                        }
                                    } else {
                                        njbVar.setText(jb6.M0(2131752348, null));
                                        break;
                                    }
                                } else {
                                    njbVar.setText(jb6.a0(null, null, 2131749180, bc.J0(wg2Var.getMessagesController().l4.I1.f()), String.valueOf(((int) (wg2Var.getMessagesController().l4.s3.i * ((wg2Var.A1 * (wg2Var.getMessagesController().l4.I1.f() / 1000.0f)) / 1000.0d))) / 100.0d)));
                                    break;
                                }
                            } else {
                                njbVar.setText(jb6.M0(2131749182, null));
                                break;
                            }
                        } else {
                            int n0 = wg2.n0(wg2Var.p1);
                            if (wg2Var.r != null && n0 != 0) {
                                njbVar.setText(jb6.a0(null, null, 2131745041, n0 < 60 ? jb6.G(n0, "Seconds", new Object[0]) : n0 < 3600 ? jb6.G(n0 / 60, "Minutes", new Object[0]) : jb6.G((n0 / 60) / 60, "Hours", new Object[0])));
                                break;
                            } else {
                                njbVar.setText(jb6.M0(2131745042, null));
                                break;
                            }
                        }
                    } else {
                        int i11 = wg2Var.O;
                        if (i11 != 0 && i11 != 3) {
                            if (i11 != 1) {
                                if (i11 == 2) {
                                    if (!wg2Var.s || wg2Var.e1 != 0) {
                                        njbVar.setText("");
                                        break;
                                    } else {
                                        njbVar.setText(jb6.M0(2131752320, "ChannelMembersInfo"));
                                        break;
                                    }
                                }
                            } else if (wg2Var.z0 == -1) {
                                njbVar.setText("");
                                break;
                            } else if (!wg2Var.s) {
                                njbVar.setText(jb6.M0(2131748402, "MegaAdminsInfo"));
                                break;
                            } else {
                                njbVar.setText(jb6.M0(2131752462, "ChannelAdminsInfo"));
                                break;
                            }
                        } else if (!wg2Var.s) {
                            if (!wg2Var.w) {
                                njbVar.setText(jb6.M0(2131747970, null));
                                break;
                            } else {
                                njbVar.setText(jb6.M0(2131747971, null));
                                break;
                            }
                        } else {
                            njbVar.setText(jb6.M0(2131747972, null));
                            break;
                        }
                    }
                } else {
                    njbVar.setText(jb6.M0(2131752409, "ChannelAntiSpamInfo"));
                    break;
                }
                break;
            case 2:
                fj6 fj6Var = (fj6) view;
                fj6Var.a(cmb.l6, cmb.F6);
                if (i != wg2Var.z0) {
                    if (i != wg2Var.v0) {
                        if (i != wg2Var.A0) {
                            if (i == wg2Var.t0) {
                                fj6Var.a(cmb.u6, cmb.t6);
                                fj6Var.b(R.drawable.msg_channel, 5, jb6.M0(2131752836, "BroadcastGroupConvert"), false);
                                break;
                            }
                        } else {
                            fj6Var.a(cmb.u6, cmb.t6);
                            if ((!wg2Var.Q || wg2Var.R) && wg2Var.Z0 == -1 && !wg2Var.F.isEmpty()) {
                                r12 = true;
                            }
                            fj6Var.b(R.drawable.msg_link2, 5, jb6.M0(2131752346, "ChannelInviteViaLink"), r12);
                            break;
                        }
                    } else {
                        fj6Var.b(R.drawable.msg_log, 5, jb6.M0(2131751016, null), wg2Var.x0 > wg2Var.v0);
                        break;
                    }
                } else {
                    int i12 = wg2Var.O;
                    if (i12 != 3) {
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 == 2) {
                                    fj6Var.a(cmb.u6, cmb.t6);
                                    if (wg2Var.A0 != -1 || ((!wg2Var.Q || wg2Var.R) && wg2Var.Z0 == -1 && !wg2Var.F.isEmpty())) {
                                        r12 = true;
                                    }
                                    if (!wg2Var.s) {
                                        fj6Var.b(R.drawable.msg_contact_add, 5, jb6.M0(2131754398, null), r12);
                                        break;
                                    } else {
                                        fj6Var.b(R.drawable.msg_contact_add, 5, jb6.M0(2131754380, null), r12);
                                        break;
                                    }
                                }
                            } else {
                                fj6Var.a(cmb.u6, cmb.t6);
                                fj6Var.b(R.drawable.msg_admin_add, 5, jb6.M0(2131752481, "ChannelAddAdmin"), !wg2Var.Q || wg2Var.R);
                                break;
                            }
                        } else {
                            fj6Var.b(R.drawable.msg_user_remove, 5, jb6.M0(2131752398, "ChannelBlockUser"), false);
                            break;
                        }
                    } else {
                        fj6Var.a(cmb.u6, cmb.t6);
                        fj6Var.b(R.drawable.msg_contact_add, 5, jb6.M0(2131752480, "ChannelAddException"), wg2Var.E0 != -1);
                        break;
                    }
                }
                break;
            case 5:
                jf5 jf5Var = (jf5) view;
                if (i != wg2Var.D0) {
                    if (i != wg2Var.S) {
                        if (i != wg2Var.N0) {
                            if (i != wg2Var.s0) {
                                if (i == wg2Var.p0) {
                                    jf5Var.setText(jb6.M0(2131749181, null));
                                    break;
                                }
                            } else {
                                jf5Var.setText(jb6.M0(2131752837, null));
                                break;
                            }
                        } else {
                            jf5Var.setText(jb6.M0(2131745044, null));
                            break;
                        }
                    } else {
                        jf5Var.setText(jb6.M0(wg2Var.w ? 2131751822 : 2131752274, null));
                        break;
                    }
                } else if (wg2Var.O != 0) {
                    jf5Var.setText(jb6.M0(2131752246, null));
                    break;
                } else {
                    TLRPC.ChatFull chatFull3 = wg2Var.r;
                    int size = chatFull3 != null ? chatFull3.kicked_count : wg2Var.F.size();
                    if (size == 0) {
                        jf5Var.setText(jb6.M0(2131752397, null));
                        break;
                    } else {
                        jf5Var.setText(jb6.G(size, "RemovedUser", new Object[0]));
                        break;
                    }
                }
                break;
            case 6:
                vkb vkbVar = (vkb) view;
                String M02 = jb6.M0(2131752399, "ChannelBlacklist");
                TLRPC.ChatFull chatFull4 = wg2Var.r;
                vkbVar.c(M02, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                ajb ajbVar = (ajb) view;
                ajbVar.getCheckBox().setDrawIconType(1);
                Switch checkBox = ajbVar.getCheckBox();
                int i13 = cmb.q7;
                int i14 = cmb.U6;
                int i15 = cmb.c6;
                checkBox.d(i13, i14, i15, i15);
                boolean z27 = ajbVar.getTag() != null && ((Integer) ajbVar.getTag()).intValue() == i;
                ajbVar.setTag(Integer.valueOf(i));
                if (i == wg2Var.g0) {
                    ajbVar.d(jb6.M0(wg2Var.w ? 2131751904 : 2131743403, null), (wg2Var.E.change_info || sd2.t0(wg2Var.n)) ? false : true, wg2Var.l0 != -1, z27);
                } else if (i == wg2Var.m0) {
                    ajbVar.d(jb6.M0(2131751903, null), !wg2Var.E.manage_linked_peers, false, z27);
                } else if (i == wg2Var.h0) {
                    ajbVar.d(jb6.M0(2131743398, "UserRestrictionsInviteUsers"), !wg2Var.E.invite_users, true, z27);
                } else if (i == wg2Var.i0) {
                    ajbVar.d(jb6.M0(2131743379, null), (wg2Var.E.pin_messages || sd2.t0(wg2Var.n)) ? false : true, true, z27);
                } else if (i == wg2Var.j0) {
                    ajbVar.d(jb6.M0(2131743400, null), !wg2Var.E.edit_rank, true, z27);
                } else if (i == wg2Var.T) {
                    ajbVar.d(jb6.M0(2131743372, "UserRestrictionsSendText"), !wg2Var.E.send_plain, true, z27);
                } else if (i == wg2Var.Q0) {
                    ajbVar.d(jb6.M0(2131749166, null), wg2Var.r1, false, z27);
                    ajbVar.getCheckBox().setDrawIconType(0);
                    ajbVar.getCheckBox().d(cmb.L6, cmb.M6, i15, i15);
                } else if (i == wg2Var.U) {
                    int o0 = wg2.o0(wg2Var.E);
                    ajbVar.d(jb6.M0(2131743377, "UserRestrictionsSendMedia"), o0 > 0, true, z27);
                    Locale locale = Locale.US;
                    ajbVar.a(new us4(this, ajbVar, false, (byte) 5), aq1.n(o0, "/10"), !wg2Var.l1);
                } else if (i == wg2Var.e0) {
                    ajbVar.d(jb6.M0(2131743373, "UserRestrictionsSendStickers"), !wg2Var.E.send_stickers, true, z27);
                } else if (i == wg2Var.f0) {
                    ajbVar.d(jb6.M0(2131743399, "UserRestrictionsEmbedLinks"), !wg2Var.E.embed_links, true, z27);
                } else if (i == wg2Var.d0) {
                    ajbVar.d(jb6.M0(2131743375, "UserRestrictionsSendPollsShort"), !wg2Var.E.send_polls, true, false);
                } else if (i == wg2Var.l0) {
                    ajbVar.d(jb6.M0(2131751637, "CreateTopicsPermission"), !wg2Var.E.manage_topics, false, z27);
                }
                if (i == wg2Var.i0 || i == wg2Var.g0) {
                    i5 = ((d) wg2Var).currentAccount;
                    if (sd2.Z(i5, wg2Var.N)) {
                        ajbVar.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!sd2.w(2, wg2Var.n)) {
                    ajbVar.setIcon(0);
                    break;
                } else if ((i == wg2Var.h0 && !sd2.y(3, wg2Var.n)) || ((i == wg2Var.i0 && !sd2.y(0, wg2Var.n)) || ((i == wg2Var.g0 && !sd2.y(1, wg2Var.n)) || ((i == wg2Var.l0 && !sd2.y(15, wg2Var.n)) || (sd2.t0(wg2Var.n) && (i == wg2Var.i0 || i == wg2Var.g0)))))) {
                    ajbVar.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    ajbVar.setIcon(0);
                    break;
                }
                break;
            case 8:
                l55 l55Var = (l55) view;
                if (i != wg2Var.Z0) {
                    if (i != wg2Var.W0) {
                        if (i != wg2Var.T0) {
                            if (i == wg2Var.g1) {
                                l55Var.setText("");
                                break;
                            }
                        } else if (sd2.T(wg2Var.n) && !wg2Var.n.megagroup) {
                            l55Var.setText(jb6.M0(2131752370, "ChannelContacts"));
                            break;
                        } else {
                            l55Var.setText(jb6.M0(2131749213, "GroupContacts"));
                            break;
                        }
                    } else {
                        l55Var.setText(jb6.M0(2131752394, "ChannelBots"));
                        break;
                    }
                } else if (sd2.T(wg2Var.n) && !wg2Var.n.megagroup) {
                    l55Var.setText(jb6.M0(2131752276, "ChannelOtherSubscribers"));
                    break;
                } else {
                    l55Var.setText(jb6.M0(2131752278, "ChannelOtherMembers"));
                    break;
                }
                break;
            case 11:
                tk4 tk4Var = (tk4) view;
                if (wg2Var.O != 0) {
                    tk4Var.setItemsCount(1);
                    break;
                } else {
                    TLRPC.ChatFull chatFull5 = wg2Var.r;
                    tk4Var.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    break;
                }
            case 12:
                xib xibVar = (xib) view;
                if (i != wg2Var.x0) {
                    if (i != wg2Var.J0) {
                        if (i == wg2Var.L0) {
                            xibVar.getCheckBox().setIcon(0);
                            String M03 = jb6.M0(2131752323, null);
                            TLRPC.Chat chat = wg2Var.n;
                            if (chat != null && (tL_chatBannedRights2 = chat.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z7 = false;
                            }
                            xibVar.l(M03, z7, false);
                            break;
                        }
                    } else {
                        Switch checkBox2 = xibVar.getCheckBox();
                        if (sd2.y(2, wg2Var.n) && ((chatFull = wg2Var.r) == null || chatFull.participants_hidden || wg2Var.m0() >= wg2Var.getMessagesController().l4.r1.f())) {
                            i7 = 0;
                        }
                        checkBox2.setIcon(i7);
                        String M04 = jb6.M0(2131752349, null);
                        TLRPC.ChatFull chatFull6 = wg2Var.r;
                        xibVar.l(M04, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    Switch checkBox3 = xibVar.getCheckBox();
                    if (sd2.y(13, wg2Var.n) && ((chatFull2 = wg2Var.r) == null || chatFull2.antispam || wg2Var.m0() >= wg2Var.getMessagesController().l4.q1.f())) {
                        i7 = 0;
                    }
                    checkBox3.setIcon(i7);
                    String M05 = jb6.M0(2131752414, "ChannelAntiSpam");
                    TLRPC.ChatFull chatFull7 = wg2Var.r;
                    if (chatFull7 != null && chatFull7.antispam) {
                        r12 = true;
                    }
                    xibVar.n(R.drawable.msg_policy, M05, r12);
                    break;
                }
                break;
            case 13:
                oh2 oh2Var = (oh2) view;
                boolean z28 = oh2Var.getTag() != null && ((Integer) oh2Var.getTag()).intValue() == i;
                oh2Var.setTag(Integer.valueOf(i));
                if (i != wg2Var.V) {
                    if (i != wg2Var.W) {
                        if (i != wg2Var.X) {
                            if (i != wg2Var.Y) {
                                if (i != wg2Var.Z) {
                                    if (i != wg2Var.a0) {
                                        if (i != wg2Var.b0) {
                                            if (i != wg2Var.c0) {
                                                if (i != wg2Var.k0) {
                                                    if (i != wg2Var.d0) {
                                                        oh2Var.setPad(1);
                                                        break;
                                                    } else {
                                                        oh2Var.e(jb6.M0(2131745336, "SendMediaPolls"), "", !wg2Var.E.send_polls, true, z28);
                                                        break;
                                                    }
                                                } else {
                                                    oh2Var.e(jb6.M0(2131743374, null), "", !wg2Var.E.send_reactions, false, z28);
                                                    break;
                                                }
                                            } else {
                                                String M06 = jb6.M0(2131745344, "SendMediaEmbededLinks");
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = wg2Var.E;
                                                oh2Var.e(M06, "", (tL_chatBannedRights4.embed_links || tL_chatBannedRights4.send_plain) ? false : true, true, z28);
                                                break;
                                            }
                                        } else {
                                            oh2Var.e(jb6.M0(2131745340, "SendMediaPermissionRound"), "", !wg2Var.E.send_roundvideos, true, z28);
                                            break;
                                        }
                                    } else {
                                        oh2Var.e(jb6.M0(2131745337, "SendMediaPermissionVoice"), "", !wg2Var.E.send_voices, true, z28);
                                        break;
                                    }
                                } else {
                                    oh2Var.e(jb6.M0(2131745343, "SendMediaPermissionFiles"), "", !wg2Var.E.send_docs, true, z28);
                                    break;
                                }
                            } else {
                                oh2Var.e(jb6.M0(2131745342, "SendMediaPermissionMusic"), "", !wg2Var.E.send_audios, true, z28);
                                break;
                            }
                        } else {
                            oh2Var.e(jb6.M0(2131745339, "SendMediaPermissionStickersGifs"), "", !wg2Var.E.send_stickers, true, z28);
                            break;
                        }
                    } else {
                        oh2Var.e(jb6.M0(2131745338, "SendMediaPermissionVideos"), "", !wg2Var.E.send_videos, true, z28);
                        break;
                    }
                } else {
                    oh2Var.e(jb6.M0(2131745341, "SendMediaPermissionPhotos"), "", !wg2Var.E.send_photos, true, z28);
                    break;
                }
                break;
            case 16:
                bjb bjbVar = (bjb) view;
                if (i != wg2Var.h1) {
                    if (i != wg2Var.i1) {
                        if (i == wg2Var.n0) {
                            bjbVar.f(jb6.M0(2131749183, null), wg2Var.y1, false);
                            break;
                        }
                    } else {
                        bjbVar.f(jb6.M0(2131752231, null), wg2Var.w1, false);
                        break;
                    }
                } else {
                    String M07 = jb6.M0(2131752233, null);
                    boolean z29 = wg2Var.v1;
                    bjbVar.f(M07, z29, z29);
                    break;
                }
                break;
            case 17:
                jla jlaVar = (jla) view;
                if (i == wg2Var.q0) {
                    int[] a = jla.a(new int[]{1, 10, 50, 100, nm7.d3, nm7.Y3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) wg2Var.getMessagesController().l4.H1.f());
                    int k = (int) Utilities.k(wg2Var.A1, wg2Var.getMessagesController().l4.H1.f(), 1L);
                    a32 a32Var = new a32((byte) 4);
                    ila ilaVar = new ila();
                    ilaVar.c = a;
                    ilaVar.d = (byte) 20;
                    ilaVar.e = a32Var;
                    jlaVar.d(k, ilaVar, new mf2(this, (byte) 23));
                    break;
                }
                break;
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        ylb ylbVar;
        View view;
        View view2;
        byte b = 1;
        Context context = this.c;
        wg2 wg2Var = this.d;
        switch (i) {
            case 0:
                int i2 = wg2Var.O;
                ij6 ij6Var = new ij6(this.c, (i2 == 0 || i2 == 3) ? 7 : 6, (i2 == 0 || i2 == 3) ? (byte) 6 : (byte) 2, wg2Var.e1 == 0, null);
                ij6Var.setDelegate(new rg2(this, false ? 1 : 0));
                view2 = ij6Var;
                view = view2;
                break;
            case 1:
                view = new njb(context);
                break;
            case 2:
                view = new fj6(context);
                break;
            case 3:
                view = new bba(context, (hg9) null);
                break;
            case 4:
                njb njbVar = new njb(context);
                if (!wg2Var.s) {
                    if (!wg2Var.w) {
                        njbVar.setText(jb6.M0(2131747970, null));
                        view = njbVar;
                        break;
                    } else {
                        njbVar.setText(jb6.M0(2131747971, null));
                        view = njbVar;
                        break;
                    }
                } else {
                    njbVar.setText(jb6.M0(2131747972, null));
                    view = njbVar;
                    break;
                }
            case 5:
                jf5 jf5Var = new jf5(this.c, cmb.K6, 21, 11, false, null);
                jf5Var.setHeight(43);
                view2 = jf5Var;
                view = view2;
                break;
            case 6:
                view = new vkb(context);
                break;
            case 7:
            case 14:
                view = new ajb(context);
                break;
            case 8:
                ylbVar = ((d) wg2Var).resourceProvider;
                View l55Var = new l55(26, ylbVar, context);
                l55Var.setBackground(null);
                view = l55Var;
                break;
            case 9:
            default:
                hla hlaVar = new hla(context, null);
                hlaVar.b(wg2Var.p1, null, jb6.M0(2131745039, "SlowmodeOff"), jb6.a0(null, null, 2131745038, 5), jb6.a0(null, null, 2131745038, 10), jb6.a0(null, null, 2131745038, 30), jb6.a0(null, null, 2131745040, 1), jb6.a0(null, null, 2131745040, 5), jb6.a0(null, null, 2131745040, 15), jb6.a0(null, null, 2131745043, 1));
                hlaVar.setCallback(new rg2(this, b));
                view = hlaVar;
                break;
            case 10:
                view = new pa6(context, gm.L(40.0f), gm.L(120.0f));
                break;
            case 11:
                tk4 tk4Var = new tk4(context, null);
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(6);
                tk4Var.x = false;
                tk4Var.setUseHeaderOffset(false);
                tk4Var.setPaddingLeft(gm.L(5.0f));
                g69 g69Var = new g69(-1, -1);
                int L = gm.L(12.0f);
                ((ViewGroup.MarginLayoutParams) g69Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) g69Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) g69Var).topMargin = gm.L(30.0f);
                tk4Var.setLayoutParams(g69Var);
                view = tk4Var;
                break;
            case 12:
                xib xibVar = new xib(23, wg2Var.getResourceProvider(), this.c, false, true);
                xibVar.w = (byte) 50;
                view = xibVar;
                break;
            case 13:
                oh2 oh2Var = new oh2(this.c, 4, 21, false, wg2Var.getResourceProvider());
                oh2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                oh2Var.getCheckBoxRound().b(cmb.U6, cmb.f7, cmb.j7);
                oh2Var.setEnabled(true);
                view = oh2Var;
                break;
            case 15:
                hla hlaVar2 = new hla(context, null);
                Drawable[] drawableArr = {wg2Var.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), wg2Var.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), wg2Var.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), wg2Var.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), wg2Var.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i3 = wg2Var.s1;
                hlaVar2.b(i3 > 0 ? i3 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                hlaVar2.setCallback(new rg2(this, r5));
                view2 = hlaVar2;
                view = view2;
                break;
            case 16:
                view = new bjb(context, wg2Var.getResourceProvider());
                break;
            case 17:
                view = new jla(context, wg2Var.getResourceProvider());
                break;
        }
        return new b59(view);
    }
}
