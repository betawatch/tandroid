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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class xf2 extends c79 {
    public final Context c;
    public final /* synthetic */ bg2 d;

    public xf2(bg2 bg2Var, Context context) {
        this.d = bg2Var;
        this.c = context;
    }

    @Override // j79
    public final void A(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof lj6) {
            ((lj6) view).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        if (r6 != r5.L0) goto L33;
     */
    @Override // c79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i != 16) {
            bg2 bg2Var = this.d;
            if (i == 7 || i == 14) {
                return xc2.w(2, bg2Var.n);
            }
            if (i == 0) {
                Object currentObject = ((lj6) f89Var.a).getCurrentObject();
                if (bg2Var.O != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int b = f89Var.b();
                if (i != 0 && i != 2 && i != 6) {
                    if (i == 12) {
                        if (b == bg2Var.x0) {
                            return xc2.y(13, bg2Var.n);
                        }
                        if (b == bg2Var.J0) {
                            return xc2.y(2, bg2Var.n);
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
        bg2 bg2Var = this.d;
        int i2 = bg2Var.E0;
        if (i >= i2 && i < bg2Var.F0) {
            return (TLObject) bg2Var.F.get(i - i2);
        }
        int i3 = bg2Var.U0;
        if (i >= i3 && i < bg2Var.V0) {
            return (TLObject) bg2Var.H.get(i - i3);
        }
        int i4 = bg2Var.X0;
        if (i < i4 || i >= bg2Var.Y0) {
            return null;
        }
        return (TLObject) bg2Var.G.get(i - i4);
    }

    @Override // j79
    public final int b() {
        return this.d.d1;
    }

    @Override // j79
    public final int d(int i) {
        bg2 bg2Var = this.d;
        if (i == bg2Var.z0 || i == bg2Var.A0 || i == bg2Var.v0 || i == bg2Var.t0) {
            return 2;
        }
        if (i >= bg2Var.E0 && i < bg2Var.F0) {
            return 0;
        }
        if (i >= bg2Var.X0 && i < bg2Var.Y0) {
            return 0;
        }
        if (i >= bg2Var.U0 && i < bg2Var.V0) {
            return 0;
        }
        if (i == bg2Var.C0 || i == bg2Var.G0 || i == bg2Var.H0) {
            return 3;
        }
        if (i == bg2Var.D0 || i == bg2Var.S || i == bg2Var.N0 || i == bg2Var.s0 || i == bg2Var.p0) {
            return 5;
        }
        if (i == bg2Var.b1 || i == bg2Var.P0 || i == bg2Var.R0 || i == bg2Var.u0 || i == bg2Var.y0 || i == bg2Var.K0 || i == bg2Var.M0 || i == bg2Var.j1 || i == bg2Var.o0 || i == bg2Var.r0) {
            return 1;
        }
        if (i == bg2Var.c1) {
            return 4;
        }
        if (i == bg2Var.B0) {
            return 6;
        }
        if (i == bg2Var.g0 || i == bg2Var.h0 || i == bg2Var.m0 || i == bg2Var.i0 || i == bg2Var.j0 || i == bg2Var.T || i == bg2Var.e0 || i == bg2Var.f0 || i == bg2Var.l0 || i == bg2Var.Q0) {
            return 7;
        }
        if (i == bg2Var.Z0 || i == bg2Var.T0 || i == bg2Var.W0 || i == bg2Var.g1) {
            return 8;
        }
        if (i == bg2Var.O0) {
            return 9;
        }
        if (i == bg2Var.a1) {
            return 10;
        }
        if (i == bg2Var.f1) {
            return 11;
        }
        if (i == bg2Var.x0 || i == bg2Var.J0 || i == bg2Var.L0) {
            return 12;
        }
        if (bg2Var.p0(i)) {
            return 13;
        }
        if (i == bg2Var.U) {
            return 14;
        }
        if (i == bg2Var.S0) {
            return 15;
        }
        if (i == bg2Var.h1 || i == bg2Var.i1 || i == bg2Var.n0) {
            return 16;
        }
        return i == bg2Var.q0 ? 17 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:472:0x0867, code lost:
    
        if (r3.n.megagroup == false) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0880, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x087e, code lost:
    
        if (r3.n.megagroup == false) goto L474;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0bd4  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x0bd6  */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
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
        TLObject M0;
        boolean z5;
        CharSequence charSequence;
        TLRPC.User X1;
        CharSequence M02;
        boolean z6;
        CharSequence charSequence2;
        CharSequence charSequence3;
        TLRPC.User X12;
        int i5;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        bg2 bg2Var = this.d;
        int i6 = f89Var.f;
        View view = f89Var.a;
        CharSequence charSequence4 = "";
        int i7 = R.drawable.permission_locked;
        r13 = true;
        r13 = true;
        boolean z7 = true;
        switch (i6) {
            case 0:
                lj6 lj6Var = (lj6) view;
                lj6Var.setTag(Integer.valueOf(i));
                TLObject E = E(i);
                if (i < bg2Var.E0 || i >= (i2 = bg2Var.F0)) {
                    if (i >= bg2Var.U0 && i < (i2 = bg2Var.V0)) {
                        if (xc2.T(bg2Var.n)) {
                            break;
                        }
                    } else {
                        i2 = bg2Var.Y0;
                    }
                    objArr = false;
                } else {
                    if (xc2.T(bg2Var.n)) {
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
                    long B1 = r47.B1(channelParticipant.peer);
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
                    M0 = bg2Var.getMessagesController().X1(Long.valueOf(j3));
                    i4 = i2;
                    objArr2 = objArr;
                } else {
                    z4 = z;
                    i4 = i2;
                    objArr2 = objArr;
                    M0 = bg2Var.getMessagesController().M0(Long.valueOf(-j3));
                }
                if (M0 != null) {
                    int i10 = bg2Var.O;
                    if (i10 != 3) {
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    lj6Var.c(M0, null, (!objArr2 == true || i3 == 0) ? null : ob6.B(i3), i != i4 + (-1));
                                    break;
                                }
                            } else {
                                if (!z2) {
                                    if (!z4 || (X1 = bg2Var.getMessagesController().X1(Long.valueOf(j4))) == null) {
                                        z5 = false;
                                        charSequence = null;
                                    } else if (X1.id == j3) {
                                        M02 = ob6.M0(2131752493, null);
                                    } else {
                                        z5 = false;
                                        charSequence = ob6.a0(null, null, 2131751273, lbc.r(X1));
                                    }
                                    lj6Var.c(M0, null, charSequence, i == i4 + (-1) ? true : z5);
                                    break;
                                } else {
                                    M02 = ob6.M0(2131752397, null);
                                }
                                charSequence = M02;
                                z5 = false;
                                lj6Var.c(M0, null, charSequence, i == i4 + (-1) ? true : z5);
                            }
                        } else {
                            if (!z3 || (X12 = bg2Var.getMessagesController().X1(Long.valueOf(j2))) == null) {
                                z6 = true;
                                charSequence2 = null;
                                charSequence3 = null;
                            } else {
                                z6 = true;
                                charSequence2 = null;
                                charSequence3 = ob6.a0(null, null, 2131743387, lbc.r(X12));
                            }
                            lj6Var.c(M0, charSequence2, charSequence3, i != i4 + (-1) ? z6 : false);
                            break;
                        }
                    } else {
                        if (tL_chatBannedRights != null) {
                            StringBuilder sb = new StringBuilder();
                            boolean z11 = tL_chatBannedRights.view_messages;
                            if (z11 && bg2Var.E.view_messages != z11) {
                                sb.append(ob6.M0(2131743360, "UserRestrictionsNoRead"));
                            }
                            if (tL_chatBannedRights.send_messages && bg2Var.E.send_plain != tL_chatBannedRights.send_plain) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(ob6.M0(2131743350, "UserRestrictionsNoSendText"));
                            }
                            boolean z12 = tL_chatBannedRights.send_media;
                            if (!z12 || bg2Var.E.send_media == z12) {
                                boolean z13 = tL_chatBannedRights.send_photos;
                                if (z13 && bg2Var.E.send_photos != z13) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(ob6.M0(2131743355, "UserRestrictionsNoSendPhotos"));
                                }
                                boolean z14 = tL_chatBannedRights.send_videos;
                                if (z14 && bg2Var.E.send_videos != z14) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(ob6.M0(2131743349, "UserRestrictionsNoSendVideos"));
                                }
                                boolean z15 = tL_chatBannedRights.send_audios;
                                if (z15 && bg2Var.E.send_audios != z15) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(ob6.M0(2131743356, "UserRestrictionsNoSendMusic"));
                                }
                                boolean z16 = tL_chatBannedRights.send_docs;
                                if (z16 && bg2Var.E.send_docs != z16) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(ob6.M0(2131743358, "UserRestrictionsNoSendDocs"));
                                }
                                boolean z17 = tL_chatBannedRights.send_voices;
                                if (z17 && bg2Var.E.send_voices != z17) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(ob6.M0(2131743348, "UserRestrictionsNoSendVoice"));
                                }
                                boolean z18 = tL_chatBannedRights.send_roundvideos;
                                if (z18 && bg2Var.E.send_roundvideos != z18) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(ob6.M0(2131743352, "UserRestrictionsNoSendRound"));
                                }
                            } else {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(ob6.M0(2131743357, "UserRestrictionsNoSendMedia"));
                            }
                            boolean z19 = tL_chatBannedRights.send_stickers;
                            if (z19 && bg2Var.E.send_stickers != z19) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(ob6.M0(2131743351, "UserRestrictionsNoSendStickers"));
                            }
                            boolean z20 = tL_chatBannedRights.send_polls;
                            if (z20 && bg2Var.E.send_polls != z20) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(ob6.M0(2131743354, "UserRestrictionsNoSendPolls"));
                            }
                            boolean z21 = tL_chatBannedRights.embed_links;
                            if (z21 && !tL_chatBannedRights.send_plain && bg2Var.E.embed_links != z21) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(ob6.M0(2131743363, "UserRestrictionsNoEmbedLinks"));
                            }
                            boolean z22 = tL_chatBannedRights.invite_users;
                            if (z22 && bg2Var.E.invite_users != z22) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(ob6.M0(2131743362, "UserRestrictionsNoInviteUsers"));
                            }
                            boolean z23 = tL_chatBannedRights.pin_messages;
                            if (z23 && bg2Var.E.pin_messages != z23) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(ob6.M0(2131743361, null));
                            }
                            boolean z24 = tL_chatBannedRights.edit_rank;
                            if (z24 && bg2Var.E.edit_rank != z24) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(ob6.M0(2131743364, null));
                            }
                            boolean z25 = tL_chatBannedRights.send_reactions;
                            if (z25 && bg2Var.E.send_reactions != z25) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(ob6.M0(2131743353, null));
                            }
                            boolean z26 = tL_chatBannedRights.change_info;
                            if (z26 && bg2Var.E.change_info != z26) {
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append(ob6.M0(2131743365, null));
                            }
                            if (sb.length() != 0) {
                                sb.replace(0, 1, sb.substring(0, 1).toUpperCase());
                                sb.append('.');
                            }
                            charSequence4 = sb.toString();
                        }
                        lj6Var.c(M0, null, charSequence4, i != i4 + (-1));
                        break;
                    }
                }
                break;
            case 1:
                ilb ilbVar = (ilb) view;
                if (i != bg2Var.y0) {
                    if (i != bg2Var.b1) {
                        if (i != bg2Var.P0) {
                            if (i != bg2Var.o0) {
                                if (i != bg2Var.r0) {
                                    if (i != bg2Var.K0) {
                                        if (i != bg2Var.M0) {
                                            if (i != bg2Var.u0) {
                                                if (i != bg2Var.R0) {
                                                    if (i == bg2Var.j1) {
                                                        ilbVar.setText(ob6.M0(bg2Var.v1 ? 2131752258 : 2131752262, null));
                                                        break;
                                                    }
                                                } else if (!bg2Var.r1) {
                                                    ilbVar.setText(ob6.M0(2131749162, null));
                                                    break;
                                                } else {
                                                    ilbVar.setText(ob6.M0(2131749161, null));
                                                    break;
                                                }
                                            } else {
                                                ilbVar.setText(ob6.M0(2131752863, null));
                                                break;
                                            }
                                        } else {
                                            ilbVar.setText(ob6.M0(2131752350, null));
                                            break;
                                        }
                                    } else {
                                        ilbVar.setText(ob6.M0(2131752376, null));
                                        break;
                                    }
                                } else {
                                    ilbVar.setText(ob6.a0(null, null, 2131749177, cc.J0(bg2Var.getMessagesController().k4.Q1.f()), String.valueOf(((int) (bg2Var.getMessagesController().k4.A3.i * ((bg2Var.A1 * (bg2Var.getMessagesController().k4.Q1.f() / 1000.0f)) / 1000.0d))) / 100.0d)));
                                    break;
                                }
                            } else {
                                ilbVar.setText(ob6.M0(2131749179, null));
                                break;
                            }
                        } else {
                            int m0 = bg2.m0(bg2Var.p1);
                            if (bg2Var.r != null && m0 != 0) {
                                ilbVar.setText(ob6.a0(null, null, 2131745035, m0 < 60 ? ob6.G(m0, "Seconds", new Object[0]) : m0 < 3600 ? ob6.G(m0 / 60, "Minutes", new Object[0]) : ob6.G((m0 / 60) / 60, "Hours", new Object[0])));
                                break;
                            } else {
                                ilbVar.setText(ob6.M0(2131745036, null));
                                break;
                            }
                        }
                    } else {
                        int i11 = bg2Var.O;
                        if (i11 != 0 && i11 != 3) {
                            if (i11 != 1) {
                                if (i11 == 2) {
                                    if (!bg2Var.s || bg2Var.e1 != 0) {
                                        ilbVar.setText("");
                                        break;
                                    } else {
                                        ilbVar.setText(ob6.M0(2131752348, "ChannelMembersInfo"));
                                        break;
                                    }
                                }
                            } else if (bg2Var.z0 == -1) {
                                ilbVar.setText("");
                                break;
                            } else if (!bg2Var.s) {
                                ilbVar.setText(ob6.M0(2131748399, "MegaAdminsInfo"));
                                break;
                            } else {
                                ilbVar.setText(ob6.M0(2131752490, "ChannelAdminsInfo"));
                                break;
                            }
                        } else if (!bg2Var.s) {
                            if (!bg2Var.w) {
                                ilbVar.setText(ob6.M0(2131747967, null));
                                break;
                            } else {
                                ilbVar.setText(ob6.M0(2131747968, null));
                                break;
                            }
                        } else {
                            ilbVar.setText(ob6.M0(2131747969, null));
                            break;
                        }
                    }
                } else {
                    ilbVar.setText(ob6.M0(2131752437, "ChannelAntiSpamInfo"));
                    break;
                }
                break;
            case 2:
                ij6 ij6Var = (ij6) view;
                ij6Var.a(aob.m6, aob.G6);
                if (i != bg2Var.z0) {
                    if (i != bg2Var.v0) {
                        if (i != bg2Var.A0) {
                            if (i == bg2Var.t0) {
                                ij6Var.a(aob.v6, aob.u6);
                                ij6Var.b(R.drawable.msg_channel, 5, ob6.M0(2131752864, "BroadcastGroupConvert"), false);
                                break;
                            }
                        } else {
                            ij6Var.a(aob.v6, aob.u6);
                            if ((!bg2Var.Q || bg2Var.R) && bg2Var.Z0 == -1 && !bg2Var.F.isEmpty()) {
                                r12 = true;
                            }
                            ij6Var.b(R.drawable.msg_link2, 5, ob6.M0(2131752374, "ChannelInviteViaLink"), r12);
                            break;
                        }
                    } else {
                        ij6Var.b(R.drawable.msg_log, 5, ob6.M0(2131751044, null), bg2Var.x0 > bg2Var.v0);
                        break;
                    }
                } else {
                    int i12 = bg2Var.O;
                    if (i12 != 3) {
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 == 2) {
                                    ij6Var.a(aob.v6, aob.u6);
                                    if (bg2Var.A0 != -1 || ((!bg2Var.Q || bg2Var.R) && bg2Var.Z0 == -1 && !bg2Var.F.isEmpty())) {
                                        r12 = true;
                                    }
                                    if (!bg2Var.s) {
                                        ij6Var.b(R.drawable.msg_contact_add, 5, ob6.M0(2131754394, null), r12);
                                        break;
                                    } else {
                                        ij6Var.b(R.drawable.msg_contact_add, 5, ob6.M0(2131754376, null), r12);
                                        break;
                                    }
                                }
                            } else {
                                ij6Var.a(aob.v6, aob.u6);
                                ij6Var.b(R.drawable.msg_admin_add, 5, ob6.M0(2131752509, "ChannelAddAdmin"), !bg2Var.Q || bg2Var.R);
                                break;
                            }
                        } else {
                            ij6Var.b(R.drawable.msg_user_remove, 5, ob6.M0(2131752426, "ChannelBlockUser"), false);
                            break;
                        }
                    } else {
                        ij6Var.a(aob.v6, aob.u6);
                        ij6Var.b(R.drawable.msg_contact_add, 5, ob6.M0(2131752508, "ChannelAddException"), bg2Var.E0 != -1);
                        break;
                    }
                }
                break;
            case 5:
                mf5 mf5Var = (mf5) view;
                if (i != bg2Var.D0) {
                    if (i != bg2Var.S) {
                        if (i != bg2Var.N0) {
                            if (i != bg2Var.s0) {
                                if (i == bg2Var.p0) {
                                    mf5Var.setText(ob6.M0(2131749178, null));
                                    break;
                                }
                            } else {
                                mf5Var.setText(ob6.M0(2131752865, null));
                                break;
                            }
                        } else {
                            mf5Var.setText(ob6.M0(2131745038, null));
                            break;
                        }
                    } else {
                        mf5Var.setText(ob6.M0(bg2Var.w ? 2131751850 : 2131752302, null));
                        break;
                    }
                } else if (bg2Var.O != 0) {
                    mf5Var.setText(ob6.M0(2131752274, null));
                    break;
                } else {
                    TLRPC.ChatFull chatFull3 = bg2Var.r;
                    int size = chatFull3 != null ? chatFull3.kicked_count : bg2Var.F.size();
                    if (size == 0) {
                        mf5Var.setText(ob6.M0(2131752425, null));
                        break;
                    } else {
                        mf5Var.setText(ob6.G(size, "RemovedUser", new Object[0]));
                        break;
                    }
                }
                break;
            case 6:
                qmb qmbVar = (qmb) view;
                String M03 = ob6.M0(2131752427, "ChannelBlacklist");
                TLRPC.ChatFull chatFull4 = bg2Var.r;
                qmbVar.c(M03, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                vkb vkbVar = (vkb) view;
                vkbVar.getCheckBox().setDrawIconType(1);
                Switch checkBox = vkbVar.getCheckBox();
                int i13 = aob.r7;
                int i14 = aob.V6;
                int i15 = aob.d6;
                checkBox.d(i13, i14, i15, i15);
                boolean z27 = vkbVar.getTag() != null && ((Integer) vkbVar.getTag()).intValue() == i;
                vkbVar.setTag(Integer.valueOf(i));
                if (i == bg2Var.g0) {
                    vkbVar.d(ob6.M0(bg2Var.w ? 2131751932 : 2131743371, null), (bg2Var.E.change_info || xc2.t0(bg2Var.n)) ? false : true, bg2Var.l0 != -1, z27);
                } else if (i == bg2Var.m0) {
                    vkbVar.d(ob6.M0(2131751931, null), !bg2Var.E.manage_linked_peers, false, z27);
                } else if (i == bg2Var.h0) {
                    vkbVar.d(ob6.M0(2131743366, "UserRestrictionsInviteUsers"), !bg2Var.E.invite_users, true, z27);
                } else if (i == bg2Var.i0) {
                    vkbVar.d(ob6.M0(2131743347, null), (bg2Var.E.pin_messages || xc2.t0(bg2Var.n)) ? false : true, true, z27);
                } else if (i == bg2Var.j0) {
                    vkbVar.d(ob6.M0(2131743368, null), !bg2Var.E.edit_rank, true, z27);
                } else if (i == bg2Var.T) {
                    vkbVar.d(ob6.M0(2131743340, "UserRestrictionsSendText"), !bg2Var.E.send_plain, true, z27);
                } else if (i == bg2Var.Q0) {
                    vkbVar.d(ob6.M0(2131749163, null), bg2Var.r1, false, z27);
                    vkbVar.getCheckBox().setDrawIconType(0);
                    vkbVar.getCheckBox().d(aob.M6, aob.N6, i15, i15);
                } else if (i == bg2Var.U) {
                    int n0 = bg2.n0(bg2Var.E);
                    vkbVar.d(ob6.M0(2131743345, "UserRestrictionsSendMedia"), n0 > 0, true, z27);
                    Locale locale = Locale.US;
                    vkbVar.a(new xs4(this, vkbVar, false, (byte) 5), bp1.n(n0, "/10"), !bg2Var.l1);
                } else if (i == bg2Var.e0) {
                    vkbVar.d(ob6.M0(2131743341, "UserRestrictionsSendStickers"), !bg2Var.E.send_stickers, true, z27);
                } else if (i == bg2Var.f0) {
                    vkbVar.d(ob6.M0(2131743367, "UserRestrictionsEmbedLinks"), !bg2Var.E.embed_links, true, z27);
                } else if (i == bg2Var.d0) {
                    vkbVar.d(ob6.M0(2131743343, "UserRestrictionsSendPollsShort"), !bg2Var.E.send_polls, true, false);
                } else if (i == bg2Var.l0) {
                    vkbVar.d(ob6.M0(2131751665, "CreateTopicsPermission"), !bg2Var.E.manage_topics, false, z27);
                }
                if (i == bg2Var.i0 || i == bg2Var.g0) {
                    i5 = ((e) bg2Var).currentAccount;
                    if (xc2.Z(i5, bg2Var.N)) {
                        vkbVar.setIcon(R.drawable.permission_locked);
                        break;
                    }
                }
                if (!xc2.w(2, bg2Var.n)) {
                    vkbVar.setIcon(0);
                    break;
                } else if ((i == bg2Var.h0 && !xc2.y(3, bg2Var.n)) || ((i == bg2Var.i0 && !xc2.y(0, bg2Var.n)) || ((i == bg2Var.g0 && !xc2.y(1, bg2Var.n)) || ((i == bg2Var.l0 && !xc2.y(15, bg2Var.n)) || (xc2.t0(bg2Var.n) && (i == bg2Var.i0 || i == bg2Var.g0)))))) {
                    vkbVar.setIcon(R.drawable.permission_locked);
                    break;
                } else {
                    vkbVar.setIcon(0);
                    break;
                }
                break;
            case 8:
                p55 p55Var = (p55) view;
                if (i != bg2Var.Z0) {
                    if (i != bg2Var.W0) {
                        if (i != bg2Var.T0) {
                            if (i == bg2Var.g1) {
                                p55Var.setText("");
                                break;
                            }
                        } else if (xc2.T(bg2Var.n) && !bg2Var.n.megagroup) {
                            p55Var.setText(ob6.M0(2131752398, "ChannelContacts"));
                            break;
                        } else {
                            p55Var.setText(ob6.M0(2131749210, "GroupContacts"));
                            break;
                        }
                    } else {
                        p55Var.setText(ob6.M0(2131752422, "ChannelBots"));
                        break;
                    }
                } else if (xc2.T(bg2Var.n) && !bg2Var.n.megagroup) {
                    p55Var.setText(ob6.M0(2131752304, "ChannelOtherSubscribers"));
                    break;
                } else {
                    p55Var.setText(ob6.M0(2131752306, "ChannelOtherMembers"));
                    break;
                }
                break;
            case 11:
                tk4 tk4Var = (tk4) view;
                if (bg2Var.O != 0) {
                    tk4Var.setItemsCount(1);
                    break;
                } else {
                    TLRPC.ChatFull chatFull5 = bg2Var.r;
                    tk4Var.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    break;
                }
            case 12:
                skb skbVar = (skb) view;
                if (i != bg2Var.x0) {
                    if (i != bg2Var.J0) {
                        if (i == bg2Var.L0) {
                            skbVar.getCheckBox().setIcon(0);
                            String M04 = ob6.M0(2131752351, null);
                            TLRPC.Chat chat = bg2Var.n;
                            if (chat != null && (tL_chatBannedRights2 = chat.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                                z7 = false;
                            }
                            skbVar.l(M04, z7, false);
                            break;
                        }
                    } else {
                        Switch checkBox2 = skbVar.getCheckBox();
                        if (xc2.y(2, bg2Var.n) && ((chatFull = bg2Var.r) == null || chatFull.participants_hidden || bg2Var.l0() >= bg2Var.getMessagesController().k4.z1.f())) {
                            i7 = 0;
                        }
                        checkBox2.setIcon(i7);
                        String M05 = ob6.M0(2131752377, null);
                        TLRPC.ChatFull chatFull6 = bg2Var.r;
                        skbVar.l(M05, chatFull6 != null && chatFull6.participants_hidden, false);
                        break;
                    }
                } else {
                    Switch checkBox3 = skbVar.getCheckBox();
                    if (xc2.y(13, bg2Var.n) && ((chatFull2 = bg2Var.r) == null || chatFull2.antispam || bg2Var.l0() >= bg2Var.getMessagesController().k4.y1.f())) {
                        i7 = 0;
                    }
                    checkBox3.setIcon(i7);
                    String M06 = ob6.M0(2131752442, "ChannelAntiSpam");
                    TLRPC.ChatFull chatFull7 = bg2Var.r;
                    if (chatFull7 != null && chatFull7.antispam) {
                        r12 = true;
                    }
                    skbVar.n(R.drawable.msg_policy, M06, r12);
                    break;
                }
                break;
            case 13:
                sg2 sg2Var = (sg2) view;
                boolean z28 = sg2Var.getTag() != null && ((Integer) sg2Var.getTag()).intValue() == i;
                sg2Var.setTag(Integer.valueOf(i));
                if (i != bg2Var.V) {
                    if (i != bg2Var.W) {
                        if (i != bg2Var.X) {
                            if (i != bg2Var.Y) {
                                if (i != bg2Var.Z) {
                                    if (i != bg2Var.a0) {
                                        if (i != bg2Var.b0) {
                                            if (i != bg2Var.c0) {
                                                if (i != bg2Var.k0) {
                                                    if (i != bg2Var.d0) {
                                                        sg2Var.setPad(1);
                                                        break;
                                                    } else {
                                                        sg2Var.e(ob6.M0(2131745330, "SendMediaPolls"), "", !bg2Var.E.send_polls, true, z28);
                                                        break;
                                                    }
                                                } else {
                                                    sg2Var.e(ob6.M0(2131743342, null), "", !bg2Var.E.send_reactions, false, z28);
                                                    break;
                                                }
                                            } else {
                                                String M07 = ob6.M0(2131745338, "SendMediaEmbededLinks");
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = bg2Var.E;
                                                sg2Var.e(M07, "", (tL_chatBannedRights4.embed_links || tL_chatBannedRights4.send_plain) ? false : true, true, z28);
                                                break;
                                            }
                                        } else {
                                            sg2Var.e(ob6.M0(2131745334, "SendMediaPermissionRound"), "", !bg2Var.E.send_roundvideos, true, z28);
                                            break;
                                        }
                                    } else {
                                        sg2Var.e(ob6.M0(2131745331, "SendMediaPermissionVoice"), "", !bg2Var.E.send_voices, true, z28);
                                        break;
                                    }
                                } else {
                                    sg2Var.e(ob6.M0(2131745337, "SendMediaPermissionFiles"), "", !bg2Var.E.send_docs, true, z28);
                                    break;
                                }
                            } else {
                                sg2Var.e(ob6.M0(2131745336, "SendMediaPermissionMusic"), "", !bg2Var.E.send_audios, true, z28);
                                break;
                            }
                        } else {
                            sg2Var.e(ob6.M0(2131745333, "SendMediaPermissionStickersGifs"), "", !bg2Var.E.send_stickers, true, z28);
                            break;
                        }
                    } else {
                        sg2Var.e(ob6.M0(2131745332, "SendMediaPermissionVideos"), "", !bg2Var.E.send_videos, true, z28);
                        break;
                    }
                } else {
                    sg2Var.e(ob6.M0(2131745335, "SendMediaPermissionPhotos"), "", !bg2Var.E.send_photos, true, z28);
                    break;
                }
                break;
            case 16:
                wkb wkbVar = (wkb) view;
                if (i != bg2Var.h1) {
                    if (i != bg2Var.i1) {
                        if (i == bg2Var.n0) {
                            wkbVar.f(ob6.M0(2131749180, null), bg2Var.y1, false);
                            break;
                        }
                    } else {
                        wkbVar.f(ob6.M0(2131752259, null), bg2Var.w1, false);
                        break;
                    }
                } else {
                    String M08 = ob6.M0(2131752261, null);
                    boolean z29 = bg2Var.v1;
                    wkbVar.f(M08, z29, z29);
                    break;
                }
                break;
            case 17:
                bna bnaVar = (bna) view;
                if (i == bg2Var.q0) {
                    int[] a = bna.a(new int[]{1, 10, 50, 100, jn7.d3, jn7.Y3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) bg2Var.getMessagesController().k4.P1.f());
                    int k = (int) Utilities.k(bg2Var.A1, bg2Var.getMessagesController().k4.P1.f(), 1L);
                    c22 c22Var = new c22((byte) 8);
                    ana anaVar = new ana();
                    anaVar.c = a;
                    anaVar.d = (byte) 20;
                    anaVar.e = c22Var;
                    bnaVar.d(k, anaVar, new te2(this, (byte) 23));
                    break;
                }
                break;
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        vnb vnbVar;
        View view;
        View view2;
        byte b = 1;
        Context context = this.c;
        bg2 bg2Var = this.d;
        switch (i) {
            case 0:
                int i2 = bg2Var.O;
                lj6 lj6Var = new lj6(this.c, (i2 == 0 || i2 == 3) ? 7 : 6, (i2 == 0 || i2 == 3) ? (byte) 6 : (byte) 2, bg2Var.e1 == 0, null);
                lj6Var.setDelegate(new wf2(this, false ? 1 : 0));
                view2 = lj6Var;
                view = view2;
                break;
            case 1:
                view = new ilb(context);
                break;
            case 2:
                view = new ij6(context);
                break;
            case 3:
                view = new rca(context, (uh9) null);
                break;
            case 4:
                ilb ilbVar = new ilb(context);
                if (!bg2Var.s) {
                    if (!bg2Var.w) {
                        ilbVar.setText(ob6.M0(2131747967, null));
                        view = ilbVar;
                        break;
                    } else {
                        ilbVar.setText(ob6.M0(2131747968, null));
                        view = ilbVar;
                        break;
                    }
                } else {
                    ilbVar.setText(ob6.M0(2131747969, null));
                    view = ilbVar;
                    break;
                }
            case 5:
                mf5 mf5Var = new mf5(this.c, aob.L6, 21, 11, false, null);
                mf5Var.setHeight(43);
                view2 = mf5Var;
                view = view2;
                break;
            case 6:
                view = new qmb(context);
                break;
            case 7:
            case 14:
                view = new vkb(context);
                break;
            case 8:
                vnbVar = ((e) bg2Var).resourceProvider;
                View p55Var = new p55(26, vnbVar, context);
                p55Var.setBackground(null);
                view = p55Var;
                break;
            case 9:
            default:
                zma zmaVar = new zma(context, null);
                zmaVar.b(bg2Var.p1, null, ob6.M0(2131745033, "SlowmodeOff"), ob6.a0(null, null, 2131745032, 5), ob6.a0(null, null, 2131745032, 10), ob6.a0(null, null, 2131745032, 30), ob6.a0(null, null, 2131745034, 1), ob6.a0(null, null, 2131745034, 5), ob6.a0(null, null, 2131745034, 15), ob6.a0(null, null, 2131745037, 1));
                zmaVar.setCallback(new wf2(this, b));
                view = zmaVar;
                break;
            case 10:
                view = new ua6(context, hl.L(40.0f), hl.L(120.0f));
                break;
            case 11:
                tk4 tk4Var = new tk4(context, null);
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(6);
                tk4Var.x = false;
                tk4Var.setUseHeaderOffset(false);
                tk4Var.setPaddingLeft(hl.L(5.0f));
                r79 r79Var = new r79(-1, -1);
                int L = hl.L(12.0f);
                ((ViewGroup.MarginLayoutParams) r79Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) r79Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) r79Var).topMargin = hl.L(30.0f);
                tk4Var.setLayoutParams(r79Var);
                view = tk4Var;
                break;
            case 12:
                skb skbVar = new skb(23, bg2Var.getResourceProvider(), this.c, false, true);
                skbVar.w = (byte) 50;
                view = skbVar;
                break;
            case 13:
                sg2 sg2Var = new sg2(this.c, 4, 21, false, bg2Var.getResourceProvider());
                sg2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                sg2Var.getCheckBoxRound().b(aob.V6, aob.g7, aob.k7);
                sg2Var.setEnabled(true);
                view = sg2Var;
                break;
            case 15:
                zma zmaVar2 = new zma(context, null);
                Drawable[] drawableArr = {bg2Var.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), bg2Var.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), bg2Var.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), bg2Var.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), bg2Var.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i3 = bg2Var.s1;
                zmaVar2.b(i3 > 0 ? i3 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                zmaVar2.setCallback(new wf2(this, r5));
                view2 = zmaVar2;
                view = view2;
                break;
            case 16:
                view = new wkb(context, bg2Var.getResourceProvider());
                break;
            case 17:
                view = new bna(context, bg2Var.getResourceProvider());
                break;
        }
        return new n69(view);
    }
}
