// default package

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class vc2 {
    public static int R;
    public wc2 A;
    public boolean B;
    public k5 C;
    public boolean E;
    public int F;
    public long I;
    public TLRPC.Peer J;
    public Runnable M;
    public long N;
    public boolean O;
    public boolean a;
    public TLRPC.GroupCall b;
    public long c;
    public String s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public wc2 z;
    public zh6 d = new zh6();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final HashMap h = new HashMap();
    public final HashMap i = new HashMap();
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final HashSet n = new HashSet();
    public final ArrayList o = new ArrayList();
    public final SparseArray p = new SparseArray();
    public final SparseArray q = new SparseArray();
    public final SparseArray r = new SparseArray();
    public final pc2 D = new pc2(this, 1);
    public final HashSet G = new HashSet();
    public final ArrayList H = new ArrayList();
    public final HashSet K = new HashSet();
    public final HashSet L = new HashSet();
    public final zh6 P = new zh6();
    public final tc2 Q = new tc2(this);

    public static boolean E(TLRPC.GroupCallParticipant groupCallParticipant, boolean z, vc2 vc2Var) {
        VoIPService sharedInstance;
        wc2 wc2Var;
        if (groupCallParticipant == null || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return false;
        }
        if (groupCallParticipant.self) {
            return sharedInstance.getVideoState(z) == 2;
        }
        wc2 wc2Var2 = vc2Var.A;
        if ((wc2Var2 != null && wc2Var2.a == groupCallParticipant) || (((wc2Var = vc2Var.z) != null && wc2Var.a == groupCallParticipant) || vc2Var.d.f(r47.B1(groupCallParticipant.peer)) != null)) {
            if (z) {
                return groupCallParticipant.presentation != null;
            }
            if (groupCallParticipant.video != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo, TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2) {
        if (tL_groupCallParticipantVideo == null) {
            return tL_groupCallParticipantVideo2 == null;
        }
        if (tL_groupCallParticipantVideo2 != null && TextUtils.equals(tL_groupCallParticipantVideo.endpoint, tL_groupCallParticipantVideo2.endpoint) && tL_groupCallParticipantVideo.source_groups.size() == tL_groupCallParticipantVideo2.source_groups.size()) {
            int size = tL_groupCallParticipantVideo.source_groups.size();
            for (int i = 0; i < size; i++) {
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i);
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup2 = tL_groupCallParticipantVideo2.source_groups.get(i);
                if (TextUtils.equals(tL_groupCallParticipantVideoSourceGroup.semantics, tL_groupCallParticipantVideoSourceGroup2.semantics) && tL_groupCallParticipantVideoSourceGroup.sources.size() == tL_groupCallParticipantVideoSourceGroup2.sources.size()) {
                    int size2 = tL_groupCallParticipantVideoSourceGroup.sources.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (tL_groupCallParticipantVideoSourceGroup2.sources.contains(tL_groupCallParticipantVideoSourceGroup.sources.get(i2))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean A() {
        TLRPC.GroupCall groupCall = this.b;
        return groupCall.participants_count > 0 || groupCall.rtmp_stream || k();
    }

    public final void B() {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        ArrayList arrayList2;
        int i;
        int size;
        wc2 wc2Var;
        char c;
        boolean z;
        int i2;
        ArrayList arrayList3 = this.f;
        arrayList3.clear();
        ArrayList arrayList4 = this.g;
        arrayList4.clear();
        TLRPC.Chat M0 = uc7.s1(this.C.a).M0(Long.valueOf(this.c));
        final boolean w = xc2.w(14, M0);
        wc2 wc2Var2 = this.A;
        if (wc2Var2 != null) {
            arrayList3.add(wc2Var2);
        }
        final long i3 = i();
        VoIPService.getSharedInstance();
        this.x = true;
        int i4 = 0;
        this.y = 0;
        int i5 = 0;
        boolean z2 = false;
        while (true) {
            arrayList = this.e;
            int size2 = arrayList.size();
            arrayList2 = this.o;
            if (i5 >= size2) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = arrayList.get(i5);
            boolean E = E(groupCallParticipant, false, this);
            boolean E2 = E(groupCallParticipant, true, this);
            if (!groupCallParticipant.self && (E || E2)) {
                this.y++;
            }
            if (arrayList2.contains(Long.valueOf(wf3.n(groupCallParticipant.peer)))) {
                arrayList.remove(i5);
                i5--;
            }
            if (E || E2) {
                if (!this.x) {
                    groupCallParticipant.videoIndex = 0;
                } else if (groupCallParticipant.videoIndex == 0) {
                    if (groupCallParticipant.self) {
                        groupCallParticipant.videoIndex = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    } else {
                        int i6 = R + 1;
                        R = i6;
                        groupCallParticipant.videoIndex = i6;
                    }
                }
                z2 = true;
            } else if (groupCallParticipant.self || !this.x || (groupCallParticipant.video == null && groupCallParticipant.presentation == null)) {
                groupCallParticipant.videoIndex = 0;
            }
            i5++;
        }
        try {
            Collections.sort(arrayList, new Comparator() { // from class: sc2
                /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
                
                    if (r6 != 0) goto L36;
                 */
                @Override // java.util.Comparator
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int compare(Object obj, Object obj2) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) obj;
                    TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) obj2;
                    int i7 = groupCallParticipant2.videoIndex;
                    boolean z3 = i7 > 0;
                    int i8 = groupCallParticipant3.videoIndex;
                    boolean z4 = i8 > 0;
                    if (z3) {
                        if (z4) {
                            return i8 - i7;
                        }
                        return -1;
                    }
                    if (!z4) {
                        int i9 = groupCallParticipant2.active_date;
                        int i10 = groupCallParticipant3.active_date;
                        if (i9 != 0) {
                            if (i10 != 0) {
                                return Integer.compare(i10, i9);
                            }
                            return -1;
                        }
                        if (i10 == 0) {
                            long B1 = r47.B1(groupCallParticipant2.peer);
                            long j = i3;
                            if (B1 == j) {
                                return -1;
                            }
                            if (r47.B1(groupCallParticipant3.peer) != j) {
                                if (w) {
                                    long j2 = groupCallParticipant2.raise_hand_rating;
                                    long j3 = groupCallParticipant3.raise_hand_rating;
                                    if (j2 != 0) {
                                        if (j3 != 0) {
                                            return Long.compare(j3, j2);
                                        }
                                        return -1;
                                    }
                                }
                                return vc2.this.b.join_date_asc ? Integer.compare(groupCallParticipant2.date, groupCallParticipant3.date) : Integer.compare(groupCallParticipant3.date, groupCallParticipant2.date);
                            }
                        }
                    }
                    return 1;
                }
            });
        } catch (Exception unused) {
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = arrayList.isEmpty() ? null : (TLRPC.GroupCallParticipant) c00.g(1, arrayList);
        char c2 = 2;
        if ((E(groupCallParticipant2, false, this) || E(groupCallParticipant2, true, this)) && (i = this.b.unmuted_video_count) > this.y) {
            this.y = i;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null && sharedInstance.groupCall == this && (sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(true) == 2)) {
                this.y--;
            }
        }
        int i7 = 5000;
        if (arrayList.size() > 5000 && (!xc2.w(14, M0) || groupCallParticipant2.raise_hand_rating == 0)) {
            int size3 = arrayList.size();
            int i8 = 5000;
            while (i8 < size3) {
                TLRPC.GroupCallParticipant groupCallParticipant3 = arrayList.get(i7);
                char c3 = c2;
                if (groupCallParticipant3.raise_hand_rating != 0) {
                    c = c3;
                    z = z2;
                    i2 = 5000;
                } else {
                    o(groupCallParticipant3, false);
                    c = c3;
                    z = z2;
                    this.d.l(r47.B1(groupCallParticipant3.peer));
                    i2 = 5000;
                    arrayList.remove(5000);
                }
                i8++;
                z2 = z;
                i7 = i2;
                c2 = c;
            }
        }
        boolean z3 = z2;
        d();
        if (!this.x && z3 && (wc2Var = this.z) != null) {
            arrayList3.add(wc2Var);
        }
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant4 = arrayList.get(i10);
            if (!this.x || groupCallParticipant4.videoIndex == 0) {
                arrayList4.add(groupCallParticipant4);
            } else {
                boolean z4 = groupCallParticipant4.self;
                HashMap hashMap = this.i;
                if (!z4 && E(groupCallParticipant4, true, this) && E(groupCallParticipant4, false, this)) {
                    wc2 wc2Var3 = (wc2) hashMap.get(groupCallParticipant4.videoEndpoint);
                    if (wc2Var3 == null) {
                        wc2Var3 = new wc2(groupCallParticipant4, false);
                        hashMap.put(groupCallParticipant4.videoEndpoint, wc2Var3);
                    } else {
                        wc2Var3.a = groupCallParticipant4;
                        wc2Var3.b = false;
                    }
                    wc2 wc2Var4 = (wc2) hashMap.get(groupCallParticipant4.presentationEndpoint);
                    if (wc2Var4 == null) {
                        wc2Var4 = new wc2(groupCallParticipant4, true);
                    } else {
                        wc2Var4.a = groupCallParticipant4;
                        wc2Var4.b = true;
                    }
                    arrayList3.add(wc2Var3);
                    if (wc2Var3.c > 1.0f) {
                        i9 = arrayList3.size() - 1;
                    }
                    arrayList3.add(wc2Var4);
                    if (wc2Var4.c > 1.0f) {
                        size = arrayList3.size();
                        i9 = size - 1;
                    }
                } else if (groupCallParticipant4.self) {
                    if (E(groupCallParticipant4, true, this)) {
                        arrayList3.add(new wc2(groupCallParticipant4, true));
                    }
                    if (E(groupCallParticipant4, false, this)) {
                        arrayList3.add(new wc2(groupCallParticipant4, false));
                    }
                } else {
                    boolean E3 = E(groupCallParticipant4, true, this);
                    wc2 wc2Var5 = (wc2) hashMap.get(E3 ? groupCallParticipant4.presentationEndpoint : groupCallParticipant4.videoEndpoint);
                    if (wc2Var5 == null) {
                        wc2Var5 = new wc2(groupCallParticipant4, E3);
                        hashMap.put(E3 ? groupCallParticipant4.presentationEndpoint : groupCallParticipant4.videoEndpoint, wc2Var5);
                    } else {
                        wc2Var5.a = groupCallParticipant4;
                        wc2Var5.b = E3;
                    }
                    arrayList3.add(wc2Var5);
                    if (wc2Var5.c > 1.0f) {
                        size = arrayList3.size();
                        i9 = size - 1;
                    }
                }
            }
        }
        int size4 = arrayList.size();
        int i11 = 0;
        while (i11 < size4) {
            TLRPC.GroupCallParticipant groupCallParticipant5 = arrayList.get(i11);
            i11++;
            arrayList2.remove(Long.valueOf(wf3.n(groupCallParticipant5.peer)));
        }
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (this.b != null && sharedInstance2 != null && sharedInstance2.isConference() && sharedInstance2.groupCall == this) {
            int size5 = arrayList.size();
            int i12 = 0;
            while (i12 < size5) {
                TLRPC.GroupCallParticipant groupCallParticipant6 = arrayList.get(i12);
                i12++;
                sharedInstance2.conference.joiningBlockchainParticipants.remove(Long.valueOf(wf3.n(groupCallParticipant6.peer)));
            }
            ArrayList arrayList5 = this.l;
            arrayList5.clear();
            arrayList5.addAll(sharedInstance2.conference.getShadyLeftParticipants(arrayList));
            ArrayList arrayList6 = this.m;
            arrayList6.clear();
            arrayList6.addAll(sharedInstance2.conference.getShadyJoiningParticipants(arrayList));
            int size6 = arrayList.size();
            while (i4 < size6) {
                TLRPC.GroupCallParticipant groupCallParticipant7 = arrayList.get(i4);
                i4++;
                long n = wf3.n(groupCallParticipant7.peer);
                Long valueOf = Long.valueOf(n);
                HashSet hashSet = this.n;
                if (hashSet.contains(valueOf)) {
                    hashSet.remove(Long.valueOf(n));
                    this.j.remove(Long.valueOf(n));
                }
            }
        }
        if (j95.u5 || arrayList3.size() % 2 != 1) {
            return;
        }
        arrayList3.add((wc2) arrayList3.remove(i9));
    }

    public final void C(int i, String str) {
        this.w = !this.w;
        TL_phone.toggleGroupCallRecord togglegroupcallrecord = new TL_phone.toggleGroupCallRecord();
        togglegroupcallrecord.call = h(this.a);
        togglegroupcallrecord.start = this.w;
        byte b = 2;
        if (str != null) {
            togglegroupcallrecord.title = str;
            togglegroupcallrecord.flags |= 2;
        }
        if (i == 1 || i == 2) {
            togglegroupcallrecord.flags |= 4;
            togglegroupcallrecord.video = true;
            togglegroupcallrecord.video_portrait = i == 1;
        }
        ConnectionsManager.getInstance(this.C.a).sendRequest(togglegroupcallrecord, new qc2(this, b));
        jn7.f(this.C.a).k(jn7.w2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
    }

    public final void D() {
        B();
        jn7.f(this.C.a).k(jn7.w2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE, 0L);
    }

    public final void a(long j) {
        if (this.d.f(j) == null) {
            Long valueOf = Long.valueOf(j);
            HashSet hashSet = this.n;
            if (hashSet.contains(valueOf)) {
                return;
            }
            hashSet.add(Long.valueOf(j));
            this.j.add(Long.valueOf(j));
            this.o.remove(Long.valueOf(j));
            B();
            jn7.f(this.C.a).k(jn7.w2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
        }
    }

    public final void b(boolean z) {
        long i = i();
        if (this.d.h(i) < 0) {
            TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
            tL_groupCallParticipant.peer = this.J;
            tL_groupCallParticipant.muted = true;
            tL_groupCallParticipant.self = true;
            tL_groupCallParticipant.video_joined = this.b.can_start_video;
            TLRPC.Chat M0 = uc7.s1(this.C.a).M0(Long.valueOf(this.c));
            tL_groupCallParticipant.can_self_unmute = !this.b.join_muted || xc2.w(14, M0);
            tL_groupCallParticipant.date = ConnectionsManager.getInstance(this.C.a).getCurrentTime();
            if (xc2.w(14, M0) || !xc2.T(M0) || M0.megagroup || tL_groupCallParticipant.can_self_unmute) {
                tL_groupCallParticipant.active_date = ConnectionsManager.getInstance(this.C.a).getCurrentTime();
            }
            k5 k5Var = this.C;
            if (i > 0) {
                TLRPC.UserFull Y1 = uc7.s1(k5Var.a).Y1(i);
                if (Y1 != null) {
                    tL_groupCallParticipant.about = Y1.about;
                }
            } else {
                TLRPC.ChatFull N0 = uc7.s1(k5Var.a).N0(-i);
                if (N0 != null) {
                    tL_groupCallParticipant.about = N0.about;
                }
            }
            this.d.k(i, tL_groupCallParticipant);
            this.e.add(tL_groupCallParticipant);
            B();
            if (z) {
                jn7.f(this.C.a).k(jn7.w2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
            }
        }
    }

    public final boolean c() {
        VoIPService sharedInstance;
        return this.x && (((sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall == this && (sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(true) == 2)) || this.y < this.b.unmuted_video_limit);
    }

    public final void d() {
        boolean z = this.E;
        pc2 pc2Var = this.D;
        if (z) {
            hl.r(pc2Var);
            this.E = false;
        }
        int currentTime = ConnectionsManager.getInstance(this.C.a).getCurrentTime();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i2);
            int i3 = currentTime - groupCallParticipant.active_date;
            if (i3 < 5) {
                i = Math.min(i3, i);
            }
            if (Math.max(groupCallParticipant.date, groupCallParticipant.active_date) <= currentTime - 5) {
                break;
            }
        }
        if (i != Integer.MAX_VALUE) {
            hl.d3(pc2Var, i * 1000);
            this.E = true;
        }
    }

    public final void e() {
        this.M = null;
        if (this.I != 0 && System.currentTimeMillis() - this.I >= 1500) {
            if (f11.a) {
                cc4.b("QUEUE GROUP CALL UPDATES WAIT TIMEOUT - CHECK QUEUE");
            }
            s();
        }
        if (this.H.isEmpty()) {
            return;
        }
        pc2 pc2Var = new pc2(this, (byte) 3);
        this.M = pc2Var;
        hl.d3(pc2Var, 1000L);
    }

    public final void f() {
        if (this.z != null) {
            return;
        }
        TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
        tL_groupCallParticipant.peer = tL_peerChannel;
        tL_peerChannel.channel_id = this.c;
        tL_groupCallParticipant.muted = true;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = new TLRPC.TL_groupCallParticipantVideo();
        tL_groupCallParticipant.video = tL_groupCallParticipantVideo;
        tL_groupCallParticipantVideo.paused = true;
        tL_groupCallParticipantVideo.endpoint = "";
        this.z = new wc2(tL_groupCallParticipant, false);
    }

    public final void g(List list) {
        if (!this.B || this.A == null) {
            wc2 wc2Var = this.A;
            TLRPC.GroupCallParticipant tL_groupCallParticipant = wc2Var != null ? wc2Var.a : new TLRPC.TL_groupCallParticipant();
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            tL_groupCallParticipant.peer = tL_peerChat;
            tL_peerChat.channel_id = this.c;
            tL_groupCallParticipant.video = new TLRPC.TL_groupCallParticipantVideo();
            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
            tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(((TL_phone.TL_groupCallStreamChannel) it.next()).channel));
            }
            tL_groupCallParticipant.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
            tL_groupCallParticipant.video.endpoint = "unified";
            tL_groupCallParticipant.videoEndpoint = "unified";
            this.A = new wc2(tL_groupCallParticipant, false);
            B();
            hl.c3(new pc2(this, (byte) 0));
        }
    }

    public final TLRPC.InputGroupCall h(boolean z) {
        TLRPC.GroupCall groupCall = this.b;
        if (groupCall == null) {
            return null;
        }
        if (z) {
            if (groupCall.invite_link == null) {
                return null;
            }
            TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
            tL_inputGroupCallSlug.slug = (String) bp1.m(1, Uri.parse(this.b.invite_link).getPathSegments());
            return tL_inputGroupCallSlug;
        }
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        TLRPC.GroupCall groupCall2 = this.b;
        tL_inputGroupCall.id = groupCall2.id;
        tL_inputGroupCall.access_hash = groupCall2.access_hash;
        return tL_inputGroupCall;
    }

    public final long i() {
        TLRPC.Peer peer = this.J;
        return peer != null ? r47.B1(peer) : yac.h(this.C.a).e();
    }

    public final boolean k() {
        return (this.b.flags & 128) != 0;
    }

    public final void l(boolean z) {
        if (z) {
            if (this.v) {
                return;
            }
            this.t = false;
            this.s = null;
        }
        if (this.t || this.e.size() > 5000) {
            return;
        }
        byte b = 1;
        if (z) {
            this.v = true;
        }
        this.u = true;
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = h(this.a);
        String str = this.s;
        if (str == null) {
            str = "";
        }
        getgroupparticipants.offset = str;
        getgroupparticipants.limit = this.a ? uc7.s1(this.C.a).k4.E3.f() : 20;
        ConnectionsManager.getInstance(this.C.a).sendRequest(getgroupparticipants, new vi1(this, z, getgroupparticipants, b));
    }

    public final void m(ArrayList arrayList, boolean z, ps0 ps0Var) {
        HashSet hashSet = z ? this.K : this.L;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            if (hashSet.contains(arrayList.get(i))) {
                arrayList.remove(i);
                i--;
                size--;
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int i2 = this.F + 1;
        this.F = i2;
        this.G.add(Integer.valueOf(i2));
        hashSet.addAll(arrayList);
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = h(this.a);
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            long longValue = ((Long) arrayList.get(i3)).longValue();
            if (z) {
                getgroupparticipants.ids.add(uc7.s1(this.C.a).j1(longValue));
            } else {
                getgroupparticipants.sources.add(Integer.valueOf((int) longValue));
            }
        }
        getgroupparticipants.offset = "";
        getgroupparticipants.limit = 100;
        ConnectionsManager.getInstance(this.C.a).sendRequest(getgroupparticipants, new eu0((Object) this, i2, (Object) ps0Var, (Object) arrayList, (Object) hashSet, (byte) 2));
    }

    public final void n(ArrayList arrayList, boolean z, String str, String str2, int i, int i2) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        boolean z2;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        int max;
        int max2;
        System.currentTimeMillis();
        TLRPC.GroupCallParticipant groupCallParticipant3 = (TLRPC.GroupCallParticipant) this.d.f(i());
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList2 = this.e;
        zh6 zh6Var = null;
        if (isEmpty) {
            int m = this.d.m();
            zh6 zh6Var2 = this.d;
            if (m != 0) {
                this.d = new zh6();
                zh6Var = zh6Var2;
            } else {
                zh6Var2.b();
            }
            arrayList2.clear();
            this.p.clear();
            this.q.clear();
            this.r.clear();
            this.G.clear();
        }
        this.s = str2;
        if (arrayList.isEmpty() || TextUtils.isEmpty(this.s)) {
            this.t = true;
        }
        if (TextUtils.isEmpty(str)) {
            TLRPC.GroupCall groupCall = this.b;
            groupCall.version = i;
            groupCall.participants_count = i2;
            if (f11.a) {
                c00.q(this.b.participants_count, new StringBuilder("new participants count "));
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z3 = false;
        jn7.f(this.C.a).k(jn7.B2, Long.valueOf(elapsedRealtime));
        int size = arrayList.size();
        int i3 = 0;
        boolean z4 = false;
        while (i3 <= size) {
            if (i3 != size) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i3);
                z4 = z4;
                if (groupCallParticipant.self) {
                    z4 = true;
                }
            } else if (!z || groupCallParticipant3 == null || z4) {
                z2 = z3;
                i3++;
                z3 = z2;
                z4 = z4;
            } else {
                groupCallParticipant = groupCallParticipant3;
                z4 = z4;
            }
            TLRPC.GroupCallParticipant groupCallParticipant4 = (TLRPC.GroupCallParticipant) this.d.f(r47.B1(groupCallParticipant.peer));
            if (groupCallParticipant4 != null) {
                arrayList2.remove(groupCallParticipant4);
                o(groupCallParticipant4, z3);
                if (groupCallParticipant4.self) {
                    max2 = groupCallParticipant4.active_date;
                    groupCallParticipant.lastTypingDate = max2;
                } else {
                    max2 = Math.max(groupCallParticipant.active_date, groupCallParticipant4.active_date);
                    groupCallParticipant.lastTypingDate = max2;
                }
                if (elapsedRealtime != groupCallParticipant.lastVisibleDate) {
                    groupCallParticipant.active_date = max2;
                }
            } else if (zh6Var != null && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) zh6Var.f(r47.B1(groupCallParticipant.peer))) != null) {
                if (groupCallParticipant2.self) {
                    max = groupCallParticipant2.active_date;
                    groupCallParticipant.lastTypingDate = max;
                } else {
                    max = Math.max(groupCallParticipant.active_date, groupCallParticipant2.active_date);
                    groupCallParticipant.lastTypingDate = max;
                }
                z2 = z3;
                if (elapsedRealtime != groupCallParticipant.lastVisibleDate) {
                    groupCallParticipant.active_date = max;
                } else {
                    groupCallParticipant.active_date = groupCallParticipant2.active_date;
                }
                this.d.k(r47.B1(groupCallParticipant.peer), groupCallParticipant);
                arrayList2.add(groupCallParticipant);
                o(groupCallParticipant, true);
                i3++;
                z3 = z2;
                z4 = z4;
            }
            z2 = z3;
            this.d.k(r47.B1(groupCallParticipant.peer), groupCallParticipant);
            arrayList2.add(groupCallParticipant);
            o(groupCallParticipant, true);
            i3++;
            z3 = z2;
            z4 = z4;
        }
        boolean z5 = z3;
        if (this.b.participants_count < this.d.m()) {
            this.b.participants_count = this.d.m();
        }
        B();
        jn7 f = jn7.f(this.C.a);
        Long valueOf = Long.valueOf(this.c);
        Long valueOf2 = Long.valueOf(this.b.id);
        Object[] objArr = new Object[3];
        objArr[z5 ? 1 : 0] = valueOf;
        objArr[1] = valueOf2;
        objArr[2] = Boolean.FALSE;
        f.k(jn7.w2, objArr);
        x();
    }

    public final void o(TLRPC.GroupCallParticipant groupCallParticipant, boolean z) {
        int i;
        int i2 = groupCallParticipant.source;
        SparseArray sparseArray = this.p;
        if (i2 != 0) {
            if (z) {
                sparseArray.put(i2, groupCallParticipant);
            } else {
                sparseArray.remove(i2);
            }
        }
        int i3 = 0;
        while (i3 < 2) {
            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = i3 == 0 ? groupCallParticipant.video : groupCallParticipant.presentation;
            if (tL_groupCallParticipantVideo != null) {
                if ((tL_groupCallParticipantVideo.flags & 2) != 0 && (i = tL_groupCallParticipantVideo.audio_source) != 0) {
                    if (z) {
                        sparseArray.put(i, groupCallParticipant);
                    } else {
                        sparseArray.remove(i);
                    }
                }
                SparseArray sparseArray2 = i3 == 0 ? this.q : this.r;
                int size = tL_groupCallParticipantVideo.source_groups.size();
                for (int i4 = 0; i4 < size; i4++) {
                    TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i4);
                    int size2 = tL_groupCallParticipantVideoSourceGroup.sources.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        int intValue = tL_groupCallParticipantVideoSourceGroup.sources.get(i5).intValue();
                        if (z) {
                            sparseArray2.put(intValue, groupCallParticipant);
                        } else {
                            sparseArray2.remove(intValue);
                        }
                    }
                }
                if (z) {
                    String str = tL_groupCallParticipantVideo.endpoint;
                    if (i3 == 0) {
                        groupCallParticipant.videoEndpoint = str;
                    } else {
                        groupCallParticipant.presentationEndpoint = str;
                    }
                } else if (i3 == 0) {
                    groupCallParticipant.videoEndpoint = null;
                } else {
                    groupCallParticipant.presentationEndpoint = null;
                }
            }
            i3++;
        }
    }

    public final void p(TLRPC.GroupCall groupCall) {
        if (this.b.version < groupCall.version) {
            this.s = null;
            l(true);
        }
        atb.a(this.b, groupCall);
        this.b = groupCall;
        this.w = this.b.record_start_date != 0;
        jn7.f(this.C.a).k(jn7.w2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
    }

    public final void q(TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants, boolean z) {
        long j;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        byte b = 2;
        long j2 = 0;
        boolean z2 = true;
        if (!z) {
            int size = tL_updateGroupCallParticipants.participants.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (tL_updateGroupCallParticipants.participants.get(i).versioned) {
                    int i2 = this.b.version;
                    int i3 = i2 + 1;
                    int i4 = tL_updateGroupCallParticipants.version;
                    if (i3 < i4) {
                        if (!this.v && this.I != 0 && Math.abs(System.currentTimeMillis() - this.I) > 1500) {
                            this.s = null;
                            l(true);
                            return;
                        }
                        if (this.I == 0) {
                            this.I = System.currentTimeMillis();
                        }
                        if (f11.a) {
                            c00.q(tL_updateGroupCallParticipants.version, new StringBuilder("add TL_updateGroupCallParticipants to queue "));
                        }
                        this.H.add(tL_updateGroupCallParticipants);
                        if (this.M == null) {
                            pc2 pc2Var = new pc2(this, b);
                            this.M = pc2Var;
                            hl.d3(pc2Var, 1500L);
                            return;
                        }
                        return;
                    }
                    if (i4 < i2) {
                        if (f11.a) {
                            cc4.b("ignore processParticipantsUpdate because of version");
                            return;
                        }
                        return;
                    }
                } else {
                    i++;
                }
            }
        }
        long i5 = i();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = this.e;
        int i6 = !arrayList.isEmpty() ? ((TLRPC.GroupCallParticipant) c00.g(1, arrayList)).date : 0;
        jn7.f(this.C.a).k(jn7.B2, Long.valueOf(elapsedRealtime));
        int size2 = tL_updateGroupCallParticipants.participants.size();
        long j3 = 0;
        int i7 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (i7 < size2) {
            long j4 = j2;
            TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i7);
            boolean z8 = z2;
            long B1 = r47.B1(groupCallParticipant.peer);
            if (f11.a) {
                StringBuilder o = ik8.o(B1, "process participant ", " left = ");
                o.append(groupCallParticipant.left);
                o.append(" versioned ");
                o.append(groupCallParticipant.versioned);
                o.append(" flags = ");
                o.append(groupCallParticipant.flags);
                o.append(" self = ");
                o.append(i5);
                o.append(" volume = ");
                c00.q(groupCallParticipant.volume, o);
            }
            TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.d.f(B1);
            boolean z9 = groupCallParticipant.left;
            int i8 = size2;
            long j5 = i5;
            zh6 zh6Var = this.P;
            if (z9) {
                if (groupCallParticipant2 == null && tL_updateGroupCallParticipants.version == this.b.version) {
                    if (f11.a) {
                        cc4.b("unknowd participant left, reload call");
                    }
                    z3 = z8;
                }
                if (groupCallParticipant2 != null) {
                    this.d.l(B1);
                    o(groupCallParticipant2, false);
                    arrayList.remove(groupCallParticipant2);
                    this.g.remove(groupCallParticipant2);
                    if (zh6Var.g(B1, null) != null) {
                        k5 k5Var = this.C;
                        if (B1 > j4) {
                            j = elapsedRealtime;
                            TLRPC.User X1 = uc7.s1(k5Var.a).X1(Long.valueOf(B1));
                            bs2.x(ik8.o(B1, "left remove from speaking ", " "), X1 == null ? null : X1.first_name, "GroupCall");
                        } else {
                            j = elapsedRealtime;
                            TLRPC.Chat M0 = uc7.s1(k5Var.a).M0(Long.valueOf(-B1));
                            bs2.x(ik8.o(B1, "left remove from speaking ", " "), M0 == null ? null : M0.title, "GroupCall");
                        }
                        zh6Var.l(B1);
                        z6 = z8;
                    } else {
                        j = elapsedRealtime;
                    }
                    int i9 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f;
                        if (i9 >= arrayList2.size()) {
                            break;
                        }
                        if (r47.B1(((wc2) arrayList2.get(i9)).a.peer) == r47.B1(groupCallParticipant2.peer)) {
                            arrayList2.remove(i9);
                            i9--;
                        }
                        i9++;
                    }
                } else {
                    j = elapsedRealtime;
                }
                TLRPC.GroupCall groupCall = this.b;
                int i10 = groupCall.participants_count - 1;
                groupCall.participants_count = i10;
                if (i10 < 0) {
                    groupCall.participants_count = 0;
                }
            } else {
                j = elapsedRealtime;
                Long valueOf = Long.valueOf(B1);
                HashSet hashSet = this.n;
                if (hashSet.contains(valueOf)) {
                    Long valueOf2 = Long.valueOf(B1);
                    hashSet.remove(valueOf2);
                    this.j.remove(valueOf2);
                }
                if (groupCallParticipant2 != null) {
                    if (f11.a) {
                        cc4.b("new participant, update old");
                    }
                    groupCallParticipant2.muted = groupCallParticipant.muted;
                    if (groupCallParticipant.muted && zh6Var.g(B1, null) != null) {
                        zh6Var.l(B1);
                        k5 k5Var2 = this.C;
                        if (B1 > j4) {
                            TLRPC.User X12 = uc7.s1(k5Var2.a).X1(Long.valueOf(B1));
                            bs2.x(ik8.o(B1, "muted remove from speaking ", " "), X12 == null ? null : X12.first_name, "GroupCall");
                        } else {
                            TLRPC.Chat M02 = uc7.s1(k5Var2.a).M0(Long.valueOf(-B1));
                            bs2.x(ik8.o(B1, "muted remove from speaking ", " "), M02 == null ? null : M02.title, "GroupCall");
                        }
                        z6 = z8;
                    }
                    if (groupCallParticipant.min) {
                        int i11 = groupCallParticipant.flags;
                        if ((i11 & 128) != 0 && (groupCallParticipant2.flags & 128) == 0) {
                            groupCallParticipant.flags = i11 & (-129);
                        }
                        if (groupCallParticipant.volume_by_admin && groupCallParticipant2.volume_by_admin) {
                            groupCallParticipant2.volume = groupCallParticipant.volume;
                        }
                    } else {
                        groupCallParticipant2.volume = groupCallParticipant.volume;
                        groupCallParticipant2.muted_by_you = groupCallParticipant.muted_by_you;
                    }
                    groupCallParticipant2.flags = groupCallParticipant.flags;
                    groupCallParticipant2.can_self_unmute = groupCallParticipant.can_self_unmute;
                    groupCallParticipant2.video_joined = groupCallParticipant.video_joined;
                    if (groupCallParticipant2.raise_hand_rating == j4 && groupCallParticipant.raise_hand_rating != j4) {
                        groupCallParticipant2.lastRaiseHandDate = SystemClock.elapsedRealtime();
                    }
                    groupCallParticipant2.raise_hand_rating = groupCallParticipant.raise_hand_rating;
                    groupCallParticipant2.date = groupCallParticipant.date;
                    int max = Math.max(groupCallParticipant2.active_date, groupCallParticipant.active_date);
                    groupCallParticipant2.lastTypingDate = max;
                    if (j != groupCallParticipant2.lastVisibleDate) {
                        groupCallParticipant2.active_date = max;
                    }
                    if (groupCallParticipant2.source == groupCallParticipant.source && j(groupCallParticipant2.video, groupCallParticipant.video) && j(groupCallParticipant2.presentation, groupCallParticipant.presentation)) {
                        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2 = groupCallParticipant2.video;
                        if (tL_groupCallParticipantVideo2 != null && (tL_groupCallParticipantVideo = groupCallParticipant.video) != null) {
                            tL_groupCallParticipantVideo2.paused = tL_groupCallParticipantVideo.paused;
                        }
                    } else {
                        o(groupCallParticipant2, false);
                        groupCallParticipant2.video = groupCallParticipant.video;
                        groupCallParticipant2.presentation = groupCallParticipant.presentation;
                        groupCallParticipant2.source = groupCallParticipant.source;
                        o(groupCallParticipant2, z8);
                        groupCallParticipant.presentationEndpoint = groupCallParticipant2.presentationEndpoint;
                        groupCallParticipant.videoEndpoint = groupCallParticipant2.videoEndpoint;
                        groupCallParticipant.videoIndex = groupCallParticipant2.videoIndex;
                    }
                } else {
                    if (groupCallParticipant.just_joined) {
                        if (B1 != j5) {
                            j3 = B1;
                        }
                        TLRPC.GroupCall groupCall2 = this.b;
                        groupCall2.participants_count++;
                        if (tL_updateGroupCallParticipants.version == groupCall2.version) {
                            if (f11.a) {
                                cc4.b("new participant, just joined, reload call");
                            }
                            z3 = true;
                        } else if (f11.a) {
                            cc4.b("new participant, just joined");
                        }
                    }
                    if (groupCallParticipant.raise_hand_rating != j4) {
                        groupCallParticipant.lastRaiseHandDate = SystemClock.elapsedRealtime();
                    }
                    if (B1 == j5 || arrayList.size() < 20 || groupCallParticipant.date <= i6 || groupCallParticipant.active_date != 0 || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || !groupCallParticipant.min || this.t) {
                        arrayList.add(groupCallParticipant);
                    }
                    this.d.k(B1, groupCallParticipant);
                    o(groupCallParticipant, true);
                }
                if (B1 == j5 && groupCallParticipant.active_date == 0 && (groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
                    groupCallParticipant.active_date = ConnectionsManager.getInstance(this.C.a).getCurrentTime();
                }
                z5 = true;
            }
            if (B1 == j5) {
                z7 = true;
            }
            i7++;
            j2 = j4;
            size2 = i8;
            i5 = j5;
            elapsedRealtime = j;
            z2 = true;
            z4 = true;
        }
        int i12 = tL_updateGroupCallParticipants.version;
        TLRPC.GroupCall groupCall3 = this.b;
        if (i12 > groupCall3.version) {
            groupCall3.version = i12;
            if (!z) {
                s();
            }
        }
        if (this.b.participants_count < this.d.m()) {
            this.b.participants_count = this.d.m();
        }
        if (f11.a) {
            c00.q(this.b.participants_count, new StringBuilder("new participants count after update "));
        }
        if (z3 && !this.O && SystemClock.elapsedRealtime() - this.N >= 30000) {
            this.O = true;
            TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
            getgroupparticipants.call = h(this.a);
            getgroupparticipants.offset = "";
            getgroupparticipants.limit = 1;
            ConnectionsManager.getInstance(this.C.a).sendRequest(getgroupparticipants, new qc2(this, (byte) 0));
        }
        if (z4) {
            if (z5) {
                B();
            }
            jn7.f(this.C.a).k(jn7.w2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.valueOf(z7), Long.valueOf(j3));
        }
        if (z6) {
            jn7.f(this.C.a).k(jn7.y2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
        }
    }

    public final void r(int i, ArrayList arrayList) {
        jn7.f(this.C.a).k(jn7.B2, Long.valueOf(SystemClock.elapsedRealtime()));
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            Long l = (Long) arrayList.get(i2);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.d.f(l.longValue());
            if (groupCallParticipant == null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(l);
            } else if (i - groupCallParticipant.lastTypingDate > 10) {
                if (groupCallParticipant.lastVisibleDate != i) {
                    groupCallParticipant.active_date = i;
                }
                groupCallParticipant.lastTypingDate = i;
                z = true;
            }
        }
        if (arrayList2 != null) {
            m(arrayList2, true, null);
        }
        if (z) {
            B();
            jn7.f(this.C.a).k(jn7.w2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
        }
    }

    public final void s() {
        ta taVar = new ta((byte) 25);
        ArrayList arrayList = this.H;
        Collections.sort(arrayList, taVar);
        if (arrayList != null && !arrayList.isEmpty()) {
            boolean z = false;
            while (arrayList.size() > 0) {
                TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) arrayList.get(0);
                int i = this.b.version;
                int i2 = i + 1;
                int i3 = tL_updateGroupCallParticipants.version;
                char c = (i2 == i3 || i == i3) ? (char) 0 : i < i3 ? (char) 1 : (char) 2;
                if (c == 0) {
                    q(tL_updateGroupCallParticipants, true);
                    arrayList.remove(0);
                    z = true;
                } else {
                    if (c == 1) {
                        if (this.I != 0 && (z || Math.abs(System.currentTimeMillis() - this.I) <= 1500)) {
                            if (f11.a) {
                                cc4.b("HOLE IN GROUP CALL UPDATES QUEUE - will wait more time");
                            }
                            if (z) {
                                this.I = System.currentTimeMillis();
                                return;
                            }
                            return;
                        }
                        if (f11.a) {
                            cc4.b("HOLE IN GROUP CALL UPDATES QUEUE - reload participants");
                        }
                        this.I = 0L;
                        arrayList.clear();
                        this.s = null;
                        l(true);
                        return;
                    }
                    arrayList.remove(0);
                }
            }
            arrayList.clear();
            if (f11.a) {
                cc4.b("GROUP CALL UPDATES QUEUE PROCEED - OK");
            }
        }
        this.I = 0L;
    }

    public final void t() {
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = h(this.a);
        getgroupcall.limit = 100;
        ConnectionsManager.getInstance(this.C.a).sendRequest(getgroupcall, new qc2(this, (byte) 3));
    }

    public final void u(long j) {
        this.n.remove(Long.valueOf(j));
        this.j.remove(Long.valueOf(j));
        B();
        jn7.f(this.C.a).k(jn7.w2, Long.valueOf(this.c), Long.valueOf(this.b.id), Boolean.FALSE);
    }

    public final void v(k5 k5Var, long j, TL_phone.groupCall groupcall) {
        this.c = j;
        this.C = k5Var;
        TLRPC.GroupCall groupCall = this.b;
        TLRPC.GroupCall groupCall2 = groupcall.call;
        atb.a(groupCall, groupCall2);
        this.b = groupCall2;
        int i = groupCall2.record_start_date;
        this.w = i != 0;
        int size = groupcall.participants.size();
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.GroupCallParticipant groupCallParticipant = groupcall.participants.get(i2);
            this.d.k(r47.B1(groupCallParticipant.peer), groupCallParticipant);
            this.e.add(groupCallParticipant);
            o(groupCallParticipant, true);
        }
        B();
        this.s = groupcall.participants_next_offset;
        l(true);
        f();
        if (this.b.rtmp_stream) {
            g(Collections.EMPTY_LIST);
        }
    }

    public final void w(k5 k5Var, TLRPC.GroupCall groupCall) {
        this.c = 0L;
        this.C = k5Var;
        atb.a(this.b, groupCall);
        this.b = groupCall;
        this.w = groupCall.record_start_date != 0;
        B();
        l(true);
        f();
        if (groupCall.rtmp_stream) {
            g(Collections.EMPTY_LIST);
        }
    }

    public final void x() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getAccount() != this.C.a || sharedInstance.getChat() == null || sharedInstance.getChat().id != (-this.c)) {
            return;
        }
        sharedInstance.setParticipantsVolume();
    }

    public final void y(TLRPC.InputPeer inputPeer) {
        if (inputPeer == null) {
            this.J = null;
            return;
        }
        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.J = tL_peerUser;
            tL_peerUser.user_id = yac.h(this.C.a).e();
        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.J = tL_peerUser2;
            tL_peerUser2.user_id = inputPeer.user_id;
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            this.J = tL_peerChat;
            tL_peerChat.chat_id = inputPeer.chat_id;
        } else {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            this.J = tL_peerChannel;
            tL_peerChannel.channel_id = inputPeer.channel_id;
        }
    }

    public final void z(String str) {
        TL_phone.editGroupCallTitle editgroupcalltitle = new TL_phone.editGroupCallTitle();
        editgroupcalltitle.call = h(this.a);
        editgroupcalltitle.title = str;
        ConnectionsManager.getInstance(this.C.a).sendRequest(editgroupcalltitle, new qc2(this, (byte) 1));
    }
}
