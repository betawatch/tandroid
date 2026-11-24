// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Predicate$-CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class sd3 extends fy0 {
    public float A2;
    public int B2;
    public l5c S1;
    public final TLRPC.Chat T1;
    public final TLRPC.Chat U1;
    public final boolean V1;
    public final ArrayList W1;
    public final long X1;
    public final int Y1;
    public final int Z1;
    public final Runnable a2;
    public boolean b2;
    public final boolean c2;
    public final rd3 d2;
    public final rd3 e2;
    public final rd3 f2;
    public final rd3 g2;
    public final boolean[] h2;
    public final boolean[] i2;
    public final boolean j2;
    public boolean k2;
    public final long l2;
    public TL_communities.ParticipantJoinedChats m2;
    public int[] n2;
    public boolean o2;
    public boolean p2;
    public final TLRPC.TL_chatBannedRights q2;
    public final TLRPC.TL_chatBannedRights r2;
    public final ArrayList s2;
    public boolean t2;
    public final boolean u2;
    public final boolean v2;
    public boolean w2;
    public boolean x2;
    public boolean y2;
    public boolean z2;

    /* JADX WARN: Code restructure failed: missing block: B:167:0x02c3, code lost:
    
        if (r7.send_stickers == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02cb, code lost:
    
        if (r7.send_gifs == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02d3, code lost:
    
        if (r7.send_games == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02db, code lost:
    
        if (r7.send_inline == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02eb, code lost:
    
        if (r7.send_plain == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02f3, code lost:
    
        if (r7.send_polls == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02fb, code lost:
    
        if (r7.send_reactions == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0303, code lost:
    
        if (r7.change_info == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x030b, code lost:
    
        if (r7.invite_users == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0313, code lost:
    
        if (r7.pin_messages == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x031f, code lost:
    
        if (r19.V1 != false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0327, code lost:
    
        if (r7.send_photos == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x032f, code lost:
    
        if (r7.send_videos == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0337, code lost:
    
        if (r7.send_roundvideos == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x033f, code lost:
    
        if (r7.send_audios == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0347, code lost:
    
        if (r7.send_voices == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x034f, code lost:
    
        if (r7.send_docs == false) goto L234;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sd3(d dVar, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, TLRPC.ChannelParticipant[] channelParticipantArr, long j, int i, int i2, boolean z, Runnable runnable) {
        super(dVar.getContext(), dVar, false, true, 2, dVar.getResourceProvider());
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        this.b2 = false;
        this.o2 = false;
        this.p2 = false;
        byte b = 1;
        this.t2 = true;
        this.w2 = true;
        this.x2 = false;
        this.y2 = false;
        this.A2 = 10.0f;
        s0(bkb.v0(bkb.Z6, this.J0));
        this.x1 = true;
        K();
        this.I1 = true;
        this.v2 = z;
        o39 o39Var = this.n1;
        int i3 = this.u0;
        o39Var.setPadding(i3, this.A1, i3, gl.L(63.0f));
        this.n1.setClipToPadding(false);
        this.n1.setOnItemClickListener(new od3(this, (byte) 4));
        this.I1 = true;
        qd3 qd3Var = new qd3(this);
        qd3Var.m = false;
        qd3Var.C = false;
        qd3Var.o(s33.h);
        qd3Var.n(350L);
        this.n1.setItemAnimator(qd3Var);
        this.n1.r1();
        u41 u41Var = new u41(this.J0, getContext(), true);
        u41Var.f();
        u41Var.setText(k96.M0(2131751501, null));
        u41Var.setOnClickListener(new x91(this, (byte) 26));
        this.b.addView(u41Var, nme.f(48.0f, -1, 87, gl.L(10.0f) + this.u0, 0, gl.L(10.0f) + this.u0, gl.L(10.0f)));
        this.T1 = chat;
        this.V1 = hc2.c0(chat);
        this.W1 = arrayList;
        this.X1 = j;
        this.Y1 = i;
        this.Z1 = i2;
        this.a2 = runnable;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chat.default_banned_rights;
        this.q2 = tL_chatBannedRights3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
        this.r2 = tL_chatBannedRights4;
        if (tL_chatBannedRights3.view_messages) {
            tL_chatBannedRights4.view_messages = true;
        }
        if (tL_chatBannedRights3.send_messages) {
            tL_chatBannedRights4.send_messages = true;
        }
        if (tL_chatBannedRights3.send_media) {
            tL_chatBannedRights4.send_media = true;
        }
        if (tL_chatBannedRights3.send_stickers) {
            tL_chatBannedRights4.send_stickers = true;
        }
        if (tL_chatBannedRights3.send_gifs) {
            tL_chatBannedRights4.send_gifs = true;
        }
        if (tL_chatBannedRights3.send_games) {
            tL_chatBannedRights4.send_games = true;
        }
        if (tL_chatBannedRights3.send_inline) {
            tL_chatBannedRights4.send_inline = true;
        }
        if (tL_chatBannedRights3.embed_links) {
            tL_chatBannedRights4.embed_links = true;
        }
        if (tL_chatBannedRights3.send_polls) {
            tL_chatBannedRights4.send_polls = true;
        }
        if (tL_chatBannedRights3.invite_users) {
            tL_chatBannedRights4.invite_users = true;
        }
        if (tL_chatBannedRights3.change_info) {
            tL_chatBannedRights4.change_info = true;
        }
        if (tL_chatBannedRights3.pin_messages) {
            tL_chatBannedRights4.pin_messages = true;
        }
        if (tL_chatBannedRights3.manage_topics) {
            tL_chatBannedRights4.manage_topics = true;
        }
        if (tL_chatBannedRights3.send_photos) {
            tL_chatBannedRights4.send_photos = true;
        }
        if (tL_chatBannedRights3.send_videos) {
            tL_chatBannedRights4.send_videos = true;
        }
        if (tL_chatBannedRights3.send_audios) {
            tL_chatBannedRights4.send_audios = true;
        }
        if (tL_chatBannedRights3.send_docs) {
            tL_chatBannedRights4.send_docs = true;
        }
        if (tL_chatBannedRights3.send_voices) {
            tL_chatBannedRights4.send_voices = true;
        }
        if (tL_chatBannedRights3.send_roundvideos) {
            tL_chatBannedRights4.send_roundvideos = true;
        }
        if (tL_chatBannedRights3.send_plain) {
            tL_chatBannedRights4.send_plain = true;
        }
        if (tL_chatBannedRights3.send_reactions) {
            tL_chatBannedRights4.send_reactions = true;
        }
        na7.q1(this.a);
        this.d2 = new rd3(this, 0, arrayList2);
        this.e2 = new rd3(this, 1, arrayList2);
        this.f2 = new rd3(this, 3, arrayList2);
        boolean z2 = arrayList2.size() == 1;
        this.u2 = z2;
        this.c2 = hc2.p0(chat);
        if (chat.linked_community_id != 0) {
            this.U1 = na7.q1(this.a).K0(Long.valueOf(chat.linked_community_id));
        }
        byte b2 = 2;
        if (hc2.y(2, this.U1) && hc2.y(27, this.U1) && z2) {
            long d = cf3.d((TLObject) arrayList2.get(0));
            this.l2 = d;
            na7 q1 = na7.q1(this.a);
            long j2 = this.U1.id;
            md3 md3Var = new md3(this, b);
            TL_communities.TL_communities_getParticipantJoinedChats tL_communities_getParticipantJoinedChats = new TL_communities.TL_communities_getParticipantJoinedChats();
            tL_communities_getParticipantJoinedChats.community = q1.f1(j2);
            tL_communities_getParticipantJoinedChats.participant = q1.h1(d);
            q1.getConnectionsManager().sendRequestTyped(tL_communities_getParticipantJoinedChats, new hc((byte) 0), new w77(q1, md3Var, b2));
        }
        if (hc2.w(2, chat)) {
            this.h2 = new boolean[arrayList2.size()];
            int i4 = 0;
            while (i4 < arrayList2.size()) {
                TLRPC.ChannelParticipant channelParticipant = i4 < channelParticipantArr.length ? channelParticipantArr[i4] : null;
                if ((chat.creator || (!(channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !(channelParticipant instanceof TLRPC.TL_channelParticipantCreator))) && (!(channelParticipant instanceof TLRPC.TL_channelParticipantBanned) || (tL_chatBannedRights2 = channelParticipant.banned_rights) == null || !tL_chatBannedRights2.view_messages)) {
                    this.h2[i4] = true;
                }
                i4++;
            }
            this.i2 = new boolean[arrayList2.size()];
            TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.q2;
            if (!tL_chatBannedRights5.send_messages || !tL_chatBannedRights5.send_media || !tL_chatBannedRights5.send_stickers || !tL_chatBannedRights5.send_gifs || !tL_chatBannedRights5.send_games || !tL_chatBannedRights5.send_inline || !tL_chatBannedRights5.embed_links || !tL_chatBannedRights5.send_polls || !tL_chatBannedRights5.send_reactions || !tL_chatBannedRights5.change_info || !tL_chatBannedRights5.invite_users || !tL_chatBannedRights5.pin_messages || ((!tL_chatBannedRights5.manage_topics && this.V1) || !tL_chatBannedRights5.send_photos || !tL_chatBannedRights5.send_videos || !tL_chatBannedRights5.send_roundvideos || !tL_chatBannedRights5.send_audios || !tL_chatBannedRights5.send_voices || !tL_chatBannedRights5.send_docs || !tL_chatBannedRights5.send_plain)) {
                int i5 = 0;
                while (i5 < arrayList2.size()) {
                    TLRPC.ChannelParticipant channelParticipant2 = i5 < channelParticipantArr.length ? channelParticipantArr[i5] : null;
                    if (!(arrayList2.get(i5) instanceof TLRPC.Chat)) {
                        if ((channelParticipant2 instanceof TLRPC.TL_channelParticipantBanned) && (tL_chatBannedRights = channelParticipant2.banned_rights) != null) {
                            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.q2;
                            if (!tL_chatBannedRights.send_stickers) {
                            }
                            if (!tL_chatBannedRights.send_gifs) {
                            }
                            if (!tL_chatBannedRights.send_games) {
                            }
                            if (!tL_chatBannedRights.send_inline) {
                            }
                            if (!tL_chatBannedRights.embed_links) {
                                if (!tL_chatBannedRights.send_plain) {
                                    if (!tL_chatBannedRights6.embed_links) {
                                    }
                                }
                            }
                            if (!tL_chatBannedRights.send_polls) {
                            }
                            if (!tL_chatBannedRights.send_reactions) {
                            }
                            if (!tL_chatBannedRights.change_info) {
                            }
                            if (!tL_chatBannedRights.invite_users) {
                            }
                            if (!tL_chatBannedRights.pin_messages) {
                            }
                            if (!tL_chatBannedRights.manage_topics) {
                                if (!tL_chatBannedRights6.manage_topics) {
                                }
                            }
                            if (!tL_chatBannedRights.send_photos) {
                            }
                            if (!tL_chatBannedRights.send_videos) {
                            }
                            if (!tL_chatBannedRights.send_roundvideos) {
                            }
                            if (!tL_chatBannedRights.send_audios) {
                            }
                            if (!tL_chatBannedRights.send_voices) {
                            }
                            if (!tL_chatBannedRights.send_docs) {
                            }
                            if (!tL_chatBannedRights.send_plain) {
                                if (tL_chatBannedRights6.send_plain) {
                                }
                            }
                        }
                        if (this.h2[i5]) {
                            this.i2[i5] = true;
                            this.j2 = true;
                        }
                    }
                    i5++;
                }
            }
            this.s2 = (ArrayList) DesugarArrays.stream(channelParticipantArr).map(new xz((byte) 7)).collect(Collectors.toCollection(new lm1((byte) 0)));
            rd3 rd3Var = new rd3(this, 2, arrayList2);
            this.g2 = rd3Var;
            boolean[] zArr = this.h2;
            if (rd3Var.g != 0) {
                rd3Var.e = zArr;
                rd3Var.h();
                rd3Var.i();
            }
        } else {
            this.g2 = new rd3(this, 2, new ArrayList(0));
        }
        this.S1.O(false);
        this.o1.setTitle(J0());
    }

    @Override // fy0
    public final boolean E0(View view, float f, float f2) {
        return !(view instanceof rk2);
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, this.r1.getClassGuid(), true, new md3(this, (byte) 0), this.J0);
        this.S1 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override // fy0
    public final CharSequence J0() {
        boolean[] zArr;
        if (this.v2) {
            return this.x2 ? k96.M0(2131751511, null) : this.y2 ? k96.M0(2131751493, null) : k96.G(1, "DeleteReactionOptionsTitle", new Object[0]);
        }
        int[] iArr = new int[1];
        ArrayList arrayList = this.W1;
        iArr[0] = arrayList != null ? arrayList.size() : 0;
        int[] iArr2 = this.n2;
        if (iArr2 != null && this.p2) {
            if (!this.u2) {
                int i = 0;
                while (true) {
                    rd3 rd3Var = this.e2;
                    if (i >= rd3Var.g) {
                        break;
                    }
                    if (rd3Var.d[i] && ((zArr = rd3Var.e) == null || zArr[i])) {
                        iArr[0] = iArr[0] + this.n2[i];
                    }
                    i++;
                }
            } else if (this.x2) {
                for (int i2 : iArr2) {
                    iArr[0] = iArr[0] + i2;
                }
            }
        }
        return k96.G(iArr[0], "DeleteOptionsTitle", new Object[0]);
    }

    public final boolean Y0() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.q2;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public final void Z0(ArrayList arrayList, rd3 rd3Var) {
        boolean e = rd3Var.e();
        int i = rd3Var.g;
        byte b = rd3Var.a;
        if (e) {
            boolean d = rd3Var.d();
            String str = rd3Var.b;
            if (!d) {
                c4c z = c4c.z(b, str);
                z.L(rd3Var.i > 0);
                arrayList.add(z);
                return;
            }
            int i2 = rd3Var.i;
            if (i2 <= 0) {
                i2 = rd3Var.e != null ? rd3Var.h : i;
            }
            String valueOf = String.valueOf(i2);
            c4c c4cVar = new c4c(36);
            c4cVar.d = b;
            c4cVar.m = str;
            c4cVar.p = valueOf;
            c4cVar.L(rd3Var.i > 0);
            c4cVar.f = rd3Var.f;
            c4cVar.E = new kb1((Object) this, (Object) rd3Var, (byte) 27);
            arrayList.add(c4cVar);
            if (rd3Var.f) {
                return;
            }
            for (int i3 = 0; i3 < i; i3++) {
                boolean[] zArr = rd3Var.e;
                if (zArr == null || zArr[i3]) {
                    TLObject tLObject = (TLObject) rd3Var.c.get(i3);
                    c4c c4cVar2 = new c4c(37);
                    c4cVar2.d = (b << 24) | i3;
                    c4cVar2.H = tLObject;
                    c4cVar2.L(rd3Var.d[i3]);
                    c4cVar2.i = 1;
                    arrayList.add(c4cVar2);
                }
            }
        }
    }

    public final /* synthetic */ void a1(TLObject tLObject, TLRPC.InputPeer inputPeer, int i, int[] iArr) {
        byte b = 1;
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            this.n2[i] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.-EL.stream(this.W1).filter(new km1(inputPeer, b)).count());
        }
        int i2 = iArr[0] - 1;
        iArr[0] = i2;
        if (i2 == 0) {
            this.o2 = false;
            this.p2 = true;
            X0();
        }
    }

    @Override // fx0
    public final void b0() {
        Rect rect = gl.Q;
        o39 o39Var = this.n1;
        rect.set(0, 0, o39Var.getMeasuredWidth(), o39Var.getMeasuredHeight() - gl.L(34.0f));
        o39Var.setClipBounds(rect);
    }

    public final void b1() {
        if (this.p2) {
            X0();
            return;
        }
        if (this.o2) {
            return;
        }
        this.o2 = true;
        rd3 rd3Var = this.e2;
        int i = rd3Var.g;
        this.n2 = new int[i];
        int[] iArr = {i};
        for (int i2 = 0; i2 < rd3Var.g; i2++) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.peer = na7.j1(this.T1);
            tL_messages_search.q = "";
            TLRPC.InputPeer i1 = na7.i1((TLObject) rd3Var.c.get(i2));
            tL_messages_search.from_id = i1;
            tL_messages_search.flags |= 1;
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.limit = 1;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_search, new ae((Object) this, (Object) i1, i2, (Object) iArr, (byte) 3));
        }
    }

    public final void c1() {
        boolean z = this.b2;
        rd3 rd3Var = this.g2;
        if (z && rd3Var.e()) {
            this.z2 = rd3Var.i > 0;
        }
        if (this.b2 && rd3Var.e() && rd3Var.i == 0) {
            rd3Var.f();
        } else if (!this.b2 && rd3Var.e()) {
            if (this.z2 != (rd3Var.i > 0)) {
                rd3Var.f();
            }
        }
        if (this.b2 || !rd3Var.e()) {
            return;
        }
        this.z2 = rd3Var.i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d1(boolean z) {
        final byte b;
        rd3 rd3Var;
        final byte b2;
        boolean[] zArr;
        TL_communities.ParticipantJoinedChats participantJoinedChats;
        int i;
        boolean z2;
        String str;
        byte b3 = 6;
        long j = this.l2;
        boolean z3 = true;
        byte b4 = 0;
        if (z && this.k2 && (participantJoinedChats = this.m2) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            wjb wjbVar = this.J0;
            int i2 = this.a;
            ArrayList<Long> arrayList = this.m2.creator_chat_ids;
            od3 od3Var = new od3(this, b3);
            nd3 nd3Var = new nd3(this, b4);
            Pattern pattern = ij.a;
            LinearLayout j2 = de9.j(context, 1);
            hd[] hdVarArr = new hd[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
            String M0 = k96.M0(2131751943, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = gl.T2(k96.G(arrayList.size(), "CommunityBanWarningMessage", cf3.r(i2, j)));
            alertDialog$Builder.j(k96.M0(2131753726, null), new l0(nd3Var, (byte) 13));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            alertDialog$Builder.n(j2);
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Long l = arrayList.get(i3);
                i3++;
                Long l2 = l;
                hd hdVar2 = hdVar;
                long longValue = l2.longValue();
                TLRPC.Chat K0 = na7.q1(i2).K0(l2);
                TLRPC.ChatFull L0 = na7.q1(i2).L0(longValue);
                if (K0 == null) {
                    hdVar = hdVar2;
                } else {
                    eb0 eb0Var = new eb0(wjbVar, context, z3);
                    ((TextView) eb0Var.c).setText(cf3.l(K0));
                    TextView textView = (TextView) eb0Var.d;
                    if (L0 != null) {
                        i = size;
                        z2 = 0;
                        str = k96.G(L0.participants_count, "Members", new Object[0]);
                    } else {
                        i = size;
                        z2 = 0;
                        str = null;
                    }
                    textView.setText(str);
                    ((be0) eb0Var.b).f(K0, new pb0(K0));
                    eb0Var.setBackground(bkb.L0(z2));
                    eb0Var.setOnClickListener(new fg(hdVarArr, od3Var, longValue, (byte) 0));
                    j2.addView(eb0Var, nme.o(-1, -2));
                    hdVar = hdVar2;
                    b4 = z2;
                    z3 = true;
                    size = i;
                }
            }
            hd hdVar3 = hdVar;
            hdVarArr[b4] = hdVar3;
            hdVar3.show();
            TextView textView2 = (TextView) hdVar3.c(-1);
            if (textView2 != null) {
                zkb.X(textView2, bkb.p7, null);
                return;
            }
            return;
        }
        dismiss();
        Runnable runnable = this.a2;
        if (runnable != null) {
            runnable.run();
        }
        rd3 rd3Var2 = this.d2;
        int i4 = rd3Var2.i;
        String G = i4 > 0 ? k96.G(i4, "UsersReported", new Object[0]) : "";
        rd3 rd3Var3 = this.g2;
        if (rd3Var3.i > 0) {
            if (!TextUtils.isEmpty(G)) {
                G = G.concat("\n");
            }
            boolean z4 = this.b2;
            int i5 = rd3Var3.i;
            G = z4 ? G.concat(k96.G(i5, "UsersRestricted", new Object[0])) : G.concat(k96.G(i5, "UsersBanned", new Object[0]));
        }
        boolean z5 = this.v2;
        boolean z6 = z5 && !this.x2;
        int i6 = rd3Var3.i > 0 ? R.raw.ic_admin : R.raw.contact_check;
        boolean isEmpty = TextUtils.isEmpty(G);
        d dVar = this.r1;
        if (isEmpty) {
            ir2.v(null, z6 ? 2131746188 : 2131748268, u21.b0(dVar), i6, 36);
        } else {
            u21.b0(dVar).I(i6, k96.M0(z6 ? 2131746188 : 2131748268, null), G).j();
        }
        if (j == 0 || !this.k2) {
            b = 0;
        } else {
            na7 q1 = na7.q1(this.a);
            long j3 = this.U1.id;
            b = 0;
            np0 np0Var = new np0(b);
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.community = q1.f1(j3);
            tL_communities_toggleParticipantBanned.participant = q1.h1(j);
            tL_communities_toggleParticipantBanned.unban = false;
            q1.getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new hc((byte) 0), new jy(q1, j3, np0Var));
        }
        ArrayList arrayList2 = this.W1;
        ArrayList arrayList3 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: pd3
            public final /* synthetic */ sd3 b;

            {
                this.b = this;
            }

            public final /* synthetic */ Predicate and(Predicate predicate) {
                byte b5 = b;
                return Predicate$-CC.$default$and(this, predicate);
            }

            public final /* synthetic */ Predicate negate() {
                byte b5 = b;
                return Predicate$-CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                byte b5 = b;
                return Predicate$-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                byte b5 = b;
                sd3 sd3Var = this.b;
                k27 k27Var = (k27) obj;
                switch (b5) {
                    case 0:
                        long j4 = sd3Var.X1;
                        TLRPC.Peer peer = k27Var.k.peer_id;
                        if ((peer != null && peer.chat_id != (-j4)) || j4 == 0) {
                            break;
                        }
                        break;
                    case 1:
                        TLRPC.Peer peer2 = k27Var.k.peer_id;
                        if (peer2 != null) {
                            long j5 = peer2.chat_id;
                            long j6 = sd3Var.X1;
                            if (j5 == (-j6) && j6 != 0) {
                                break;
                            }
                        }
                        break;
                    default:
                        TLRPC.Peer peer3 = k27Var.k.peer_id;
                        if (peer3 != null && peer3.chat_id != (-sd3Var.X1)) {
                            break;
                        }
                        break;
                }
                return true;
            }
        }).map(new xz((byte) 6)).collect(Collectors.toCollection(new lm1(b)));
        final byte b5 = 1;
        ArrayList arrayList4 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: pd3
            public final /* synthetic */ sd3 b;

            {
                this.b = this;
            }

            public final /* synthetic */ Predicate and(Predicate predicate) {
                byte b52 = b5;
                return Predicate$-CC.$default$and(this, predicate);
            }

            public final /* synthetic */ Predicate negate() {
                byte b52 = b5;
                return Predicate$-CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                byte b52 = b5;
                return Predicate$-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                byte b52 = b5;
                sd3 sd3Var = this.b;
                k27 k27Var = (k27) obj;
                switch (b52) {
                    case 0:
                        long j4 = sd3Var.X1;
                        TLRPC.Peer peer = k27Var.k.peer_id;
                        if ((peer != null && peer.chat_id != (-j4)) || j4 == 0) {
                            break;
                        }
                        break;
                    case 1:
                        TLRPC.Peer peer2 = k27Var.k.peer_id;
                        if (peer2 != null) {
                            long j5 = peer2.chat_id;
                            long j6 = sd3Var.X1;
                            if (j5 == (-j6) && j6 != 0) {
                                break;
                            }
                        }
                        break;
                    default:
                        TLRPC.Peer peer3 = k27Var.k.peer_id;
                        if (peer3 != null && peer3.chat_id != (-sd3Var.X1)) {
                            break;
                        }
                        break;
                }
                return true;
            }
        }).map(new xz((byte) 6)).collect(Collectors.toCollection(new lm1((byte) 0)));
        TLRPC.Chat chat = this.T1;
        rd3 rd3Var4 = this.e2;
        if (z5) {
            if (!this.y2) {
                rd3Var4.b(new lt2(this, arrayList3, arrayList4, b3));
            }
            rd3Var = rd3Var4;
        } else {
            if (arrayList3.isEmpty()) {
                rd3Var = rd3Var4;
            } else {
                rd3Var = rd3Var4;
                na7.q1(this.a).V(arrayList3, null, null, -chat.id, this.Y1, false, this.Z1);
            }
            if (!arrayList4.isEmpty()) {
                na7.q1(this.a).V(arrayList4, null, null, this.X1, this.Y1, true, this.Z1);
            }
        }
        rd3Var3.c(new od3(this, (byte) 3));
        int i7 = 0;
        while (true) {
            b2 = 2;
            if (i7 >= rd3Var2.g) {
                break;
            }
            if (rd3Var2.d[i7] && ((zArr = rd3Var2.e) == null || zArr[i7])) {
                TLObject tLObject = (TLObject) rd3Var2.c.get(i7);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.-EL.stream(arrayList2).filter(new Predicate(this) { // from class: pd3
                    public final /* synthetic */ sd3 b;

                    {
                        this.b = this;
                    }

                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        byte b52 = b2;
                        return Predicate$-CC.$default$and(this, predicate);
                    }

                    public final /* synthetic */ Predicate negate() {
                        byte b52 = b2;
                        return Predicate$-CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        byte b52 = b2;
                        return Predicate$-CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        byte b52 = b2;
                        sd3 sd3Var = this.b;
                        k27 k27Var = (k27) obj;
                        switch (b52) {
                            case 0:
                                long j4 = sd3Var.X1;
                                TLRPC.Peer peer = k27Var.k.peer_id;
                                if ((peer != null && peer.chat_id != (-j4)) || j4 == 0) {
                                    break;
                                }
                                break;
                            case 1:
                                TLRPC.Peer peer2 = k27Var.k.peer_id;
                                if (peer2 != null) {
                                    long j5 = peer2.chat_id;
                                    long j6 = sd3Var.X1;
                                    if (j5 == (-j6) && j6 != 0) {
                                        break;
                                    }
                                }
                                break;
                            default:
                                TLRPC.Peer peer3 = k27Var.k.peer_id;
                                if (peer3 != null && peer3.chat_id != (-sd3Var.X1)) {
                                    break;
                                }
                                break;
                        }
                        return true;
                    }
                }).filter(new km1(tLObject, b2)).map(new xz((byte) 6)).collect(Collectors.toCollection(new lm1((byte) 0)));
                if (z5 && (tLObject instanceof TLRPC.User) && arrayList5.size() == 1) {
                    TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
                    tL_messages_reportReaction.peer = na7.j1(chat);
                    tL_messages_reportReaction.user_id = na7.q1(this.a).o1((TLRPC.User) tLObject);
                    tL_messages_reportReaction.id = arrayList5.get(0).intValue();
                    ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_reportReaction, null);
                } else {
                    TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
                    tL_channels_reportSpam.channel = na7.g1(chat);
                    if (tLObject instanceof TLRPC.User) {
                        tL_channels_reportSpam.participant = na7.l1((TLRPC.User) tLObject);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        tL_channels_reportSpam.participant = na7.j1((TLRPC.Chat) tLObject);
                    }
                    tL_channels_reportSpam.id = arrayList5;
                    ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_reportSpam, null);
                }
            }
            i7++;
        }
        if (this.u2) {
            rd3Var.b(new od3(this, (byte) 0));
        } else {
            rd3Var.c(new od3(this, (byte) 1));
            this.f2.c(new od3(this, b2));
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        SharedPreferences.Editor edit = na7.q1(this.a).X3.edit();
        edit.putBoolean("delete_report", this.d2.a());
        edit.putBoolean("delete_deleteAll", this.e2.a());
        edit.putBoolean("delete_ban", !this.b2 && this.g2.a());
        edit.apply();
        super.dismiss();
    }

    @Override // fx0
    public final void p0() {
        super.p0();
        int v0 = bkb.v0(bkb.Z6, this.J0);
        if (v0 != this.B2) {
            this.B2 = v0;
            s0(v0);
        }
    }

    @Override // fx0, android.app.Dialog
    public final void show() {
        super.show();
        m21.e();
    }
}
