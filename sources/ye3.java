// default package

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ye3 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ef3 b;

    public /* synthetic */ ye3(ef3 ef3Var, byte b) {
        this.a = b;
        this.b = ef3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0410  */
    @Override // jac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        Object[] objArr;
        byte b = this.a;
        ef3 ef3Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l7c l7cVar = (l7c) obj2;
                df3 df3Var = ef3Var.e2;
                df3 df3Var2 = ef3Var.g2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = ef3Var.r2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = ef3Var.q2;
                if (ef3Var.W1 != null) {
                    arrayList.add(c6c.D(gm.L(12.0f)));
                    arrayList.add(c6c.u(jb6.M0(2131751530, null)));
                    ef3Var.Z0(arrayList, ef3Var.d2);
                    if (ef3Var.u2) {
                        df3Var.i();
                        int i = (ef3Var.x2 ? 1 : 0) + (ef3Var.y2 ? 1 : 0);
                        String str = df3Var.b;
                        Locale locale = Locale.US;
                        c6c A = c6c.A(i + "/2", str, 100);
                        A.L(i == 2);
                        A.f = ef3Var.w2;
                        A.E = new rc1((Object) ef3Var, (Object) l7cVar, (byte) 29);
                        arrayList.add(A);
                        if (!ef3Var.w2) {
                            c6c z = c6c.z(101, jb6.M0(2131745792, null));
                            z.L(ef3Var.x2);
                            z.i = 1;
                            arrayList.add(z);
                            c6c z2 = c6c.z(nm7.m1, jb6.M0(2131745791, null));
                            z2.L(ef3Var.y2);
                            z2.i = 1;
                            arrayList.add(z2);
                        }
                    } else {
                        ef3Var.Z0(arrayList, df3Var);
                        ef3Var.Z0(arrayList, ef3Var.f2);
                    }
                    ef3Var.Z0(arrayList, df3Var2);
                    if (!ef3Var.c2 && df3Var2.e()) {
                        if (ef3Var.b2) {
                            arrayList.add(c6c.C(null));
                            if (df3Var2.d()) {
                                String G = jb6.G(df3Var2.i, "UserRestrictionsCanDoUsers", new Object[0]);
                                c6c c6cVar = new c6c(42);
                                c6cVar.d = 0;
                                c6cVar.p = G;
                                arrayList.add(c6cVar);
                            } else {
                                String M0 = jb6.M0(2131743410, null);
                                c6c c6cVar2 = new c6c(42);
                                c6cVar2.d = 0;
                                c6cVar2.p = M0;
                                arrayList.add(c6cVar2);
                            }
                            c6c F = c6c.F(0, jb6.M0(2131743378, null));
                            F.L((tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                            F.u = tL_chatBannedRights2.send_plain;
                            arrayList.add(F);
                            int i2 = (tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? 0 : 1;
                            if (!tL_chatBannedRights.send_videos && !tL_chatBannedRights2.send_videos) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_stickers && !tL_chatBannedRights2.send_stickers) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_audios && !tL_chatBannedRights2.send_audios) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_docs && !tL_chatBannedRights2.send_docs) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_voices && !tL_chatBannedRights2.send_voices) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_roundvideos && !tL_chatBannedRights2.send_roundvideos) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights2.embed_links && !tL_chatBannedRights.send_plain && !tL_chatBannedRights2.send_plain) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_polls && !tL_chatBannedRights2.send_polls) {
                                i2++;
                            }
                            if (!tL_chatBannedRights.send_reactions && !tL_chatBannedRights2.send_reactions) {
                                i2++;
                            }
                            String M02 = jb6.M0(2131743377, null);
                            Locale locale2 = Locale.US;
                            c6c o = c6c.o(1, M02, i2 + "/10");
                            o.L(i2 > 0);
                            o.u = ef3Var.Y0();
                            o.f = ef3Var.t2;
                            o.E = new wh((Object) ef3Var, i2, (Object) l7cVar, (byte) 6);
                            arrayList.add(o);
                            if (!ef3Var.t2) {
                                c6c z3 = c6c.z(6, jb6.M0(2131745341, null));
                                z3.L((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                z3.u = tL_chatBannedRights2.send_photos;
                                z3.i = 1;
                                arrayList.add(z3);
                                c6c z4 = c6c.z(7, jb6.M0(2131745338, null));
                                z4.L((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                z4.u = tL_chatBannedRights2.send_videos;
                                z4.i = 1;
                                arrayList.add(z4);
                                c6c z5 = c6c.z(8, jb6.M0(2131745343, null));
                                z5.L((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                z5.u = tL_chatBannedRights2.send_docs;
                                z5.i = 1;
                                arrayList.add(z5);
                                c6c z6 = c6c.z(9, jb6.M0(2131745342, null));
                                z6.L((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                z6.u = tL_chatBannedRights2.send_audios;
                                z6.i = 1;
                                arrayList.add(z6);
                                c6c z7 = c6c.z(10, jb6.M0(2131745337, null));
                                z7.L((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                z7.u = tL_chatBannedRights2.send_voices;
                                z7.i = 1;
                                arrayList.add(z7);
                                c6c z8 = c6c.z(11, jb6.M0(2131745340, null));
                                z8.L((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                z8.u = tL_chatBannedRights2.send_roundvideos;
                                z8.i = 1;
                                arrayList.add(z8);
                                c6c z9 = c6c.z(12, jb6.M0(2131745339, null));
                                z9.L((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                z9.u = tL_chatBannedRights2.send_stickers;
                                z9.i = 1;
                                arrayList.add(z9);
                                c6c z10 = c6c.z(13, jb6.M0(2131745336, null));
                                z10.L((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                z10.u = tL_chatBannedRights2.send_polls;
                                z10.i = 1;
                                arrayList.add(z10);
                                c6c z11 = c6c.z(14, jb6.M0(2131743399, null));
                                z11.L((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                z11.u = tL_chatBannedRights2.embed_links;
                                z11.i = 1;
                                arrayList.add(z11);
                                c6c z12 = c6c.z(15, jb6.M0(2131743374, null));
                                z12.L((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                z12.u = tL_chatBannedRights2.send_reactions;
                                z12.i = 1;
                                arrayList.add(z12);
                            }
                            c6c F2 = c6c.F(2, jb6.M0(2131743398, null));
                            F2.L((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            F2.u = tL_chatBannedRights2.invite_users;
                            arrayList.add(F2);
                            c6c F3 = c6c.F(3, jb6.M0(2131743379, null));
                            F3.L((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            F3.u = tL_chatBannedRights2.pin_messages;
                            arrayList.add(F3);
                            c6c F4 = c6c.F(4, jb6.M0(2131743403, null));
                            F4.L((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            F4.u = tL_chatBannedRights2.change_info;
                            arrayList.add(F4);
                            if (ef3Var.V1) {
                                c6c F5 = c6c.F(5, jb6.M0(2131751637, null));
                                F5.L((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                F5.u = tL_chatBannedRights2.manage_topics;
                                arrayList.add(F5);
                            }
                        }
                        if (ef3Var.j2) {
                            boolean d = df3Var2.d();
                            boolean z13 = ef3Var.b2;
                            String M03 = jb6.M0(!d ? z13 ? 2131751416 : 2131751414 : z13 ? 2131751415 : 2131751413, null);
                            c6c c6cVar3 = new c6c(38);
                            c6cVar3.d = 1;
                            c6cVar3.p = M03;
                            c6cVar3.f = !ef3Var.b2;
                            c6cVar3.r = true;
                            arrayList.add(c6cVar3);
                            objArr = false;
                            if (ef3Var.l2 == 0) {
                                if (objArr != false) {
                                    arrayList.add(c6c.D(gm.L(12.0f)));
                                }
                                String M04 = jb6.M0(2131751900, null);
                                c6c c6cVar4 = new c6c(39);
                                c6cVar4.d = nm7.n1;
                                c6cVar4.m = M04;
                                c6cVar4.A = 0;
                                c6cVar4.L(ef3Var.k2);
                                arrayList.add(c6cVar4);
                                TL_communities.ParticipantJoinedChats participantJoinedChats = ef3Var.m2;
                                arrayList.add(c6c.B(nm7.o1, gm.D2(gm.N2(jb6.G(participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, "CommunityBanFromCommunityInfo", new Object[0]), -1, 0, new ze3(ef3Var, b2), null), true)));
                                break;
                            }
                        }
                    }
                    objArr = true;
                    if (ef3Var.l2 == 0) {
                    }
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                if (participantJoinedChats2 != null) {
                    ef3Var.m2 = participantJoinedChats2;
                    ef3Var.S1.O(true);
                    break;
                }
                break;
        }
    }
}
