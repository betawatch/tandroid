package th;

import android.text.TextUtils;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x3 {
    public int a;
    public final TL_stories.StoryItem b;
    public final long c;
    public final int d;
    public boolean e;
    public final boolean f;
    public final boolean j;
    public final boolean k;
    public boolean l;
    public String n;
    public final boolean q;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public boolean m = true;
    public int o = -1;
    public final HashSet p = new HashSet();
    public final ArrayList r = new ArrayList();
    public final l3 s = new l3();

    public x3(int i10, long j10, TL_stories.StoryItem storyItem) {
        TL_stories.StoryViews storyViews;
        this.d = i10;
        this.b = storyItem;
        this.f = j10 < 0;
        this.c = j10;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        int i11 = storyViews2 == null ? 0 : storyViews2.views_count;
        this.a = i11;
        if (i11 < 200) {
            this.q = true;
        }
        boolean z10 = w5.v(storyItem) && !d20.i(i10).q();
        this.j = z10;
        if (z10 && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.j = false;
            this.k = true;
        }
        if (this.j) {
            return;
        }
        this.l = true;
        if (storyItem.views != null) {
            for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                Long l4 = storyItem.views.recent_viewers.get(i12);
                long longValue = l4.longValue();
                if (vp.r1(i10).Z1(l4) != null) {
                    TL_stories.TL_storyView tL_storyView = new TL_stories.TL_storyView();
                    tL_storyView.user_id = longValue;
                    tL_storyView.date = 0;
                    this.g.add(tL_storyView);
                }
            }
        }
    }

    public final void a() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.f) {
            return;
        }
        ArrayList arrayList = this.g;
        arrayList.clear();
        l3 l3Var = this.s;
        boolean z10 = l3Var.b;
        ArrayList arrayList2 = this.h;
        if (z10 || !TextUtils.isEmpty(l3Var.c)) {
            if (TextUtils.isEmpty(l3Var.c)) {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            } else {
                str = l3Var.c.trim().toLowerCase();
                str2 = cd.D0().R0(str, true, false);
                str4 = sc.e.h(" ", str);
                str3 = sc.e.h(" ", str2);
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.User Z1 = vp.r1(this.d).Z1(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i10)).user_id));
                boolean z11 = !l3Var.b || (Z1 != null && Z1.contact);
                if (z11 && str != null) {
                    String lowerCase = org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name).toLowerCase();
                    String n10 = h20.n(Z1);
                    String N3 = org.telegram.messenger.i0.N3(lowerCase);
                    if ((lowerCase == null || (!lowerCase.startsWith(str) && !lowerCase.contains(str4))) && !N3.startsWith(str2) && !N3.contains(str3) && (n10 == null || (!n10.startsWith(str2) && !n10.contains(str3)))) {
                        z11 = false;
                    }
                }
                if (z11) {
                    arrayList.add((TL_stories.StoryView) arrayList2.get(i10));
                }
            }
        } else {
            arrayList.addAll(arrayList2);
        }
        if (l3Var.a) {
            return;
        }
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new bi.t6(20)));
    }

    public final int b() {
        return (this.f ? this.i : this.g).size();
    }

    public final void c() {
        if (this.e || !this.m || this.j) {
            return;
        }
        boolean z10 = this.f;
        long j10 = this.c;
        l3 l3Var = this.s;
        int i10 = this.d;
        TL_stories.StoryItem storyItem = this.b;
        if (z10) {
            TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
            tL_getStoryReactionsList.forwards_first = l3Var.a;
            tL_getStoryReactionsList.id = storyItem.id;
            tL_getStoryReactionsList.peer = vp.r1(i10).i1(j10);
            tL_getStoryReactionsList.limit = (this.l || this.i.size() < 20) ? 20 : 100;
            String str = this.n;
            tL_getStoryReactionsList.offset = str;
            if (str == null) {
                tL_getStoryReactionsList.offset = "";
            } else {
                tL_getStoryReactionsList.flags |= 2;
            }
            this.e = true;
            f8.b("SelfStoryViewsPage reactions load next " + storyItem.id + " " + this.l + " offset=" + tL_getStoryReactionsList.offset);
            final int i11 = 0;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) { // from class: th.v3
                public final /* synthetic */ x3 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            final int i12 = 1;
                            final x3 x3Var = this.b;
                            final int[] iArr = r2;
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: th.w3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z11;
                                    switch (i12) {
                                        case 0:
                                            x3 x3Var2 = x3Var;
                                            ArrayList arrayList = x3Var2.r;
                                            ArrayList arrayList2 = x3Var2.h;
                                            int i13 = x3Var2.d;
                                            ArrayList arrayList3 = x3Var2.g;
                                            TL_stories.StoryItem storyItem2 = x3Var2.b;
                                            if (iArr[0] != x3Var2.o) {
                                                f8.b("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                                break;
                                            } else {
                                                x3Var2.e = false;
                                                x3Var2.o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = vp.r1(i13).O1().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i14 = 0; i14 < storyViewsList.views.size(); i14++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i14);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    vp.r1(i13).V3(storyViewsList.users, false);
                                                    vp.r1(i13).P3(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    hs.a0(i13).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (x3Var2.l) {
                                                        x3Var2.l = false;
                                                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                                                            x3Var2.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i15)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (x3Var2.q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        x3Var2.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (storyViewsList.views.isEmpty()) {
                                                        x3Var2.m = false;
                                                    } else {
                                                        x3Var2.m = true;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    x3Var2.n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        x3Var2.m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i16 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i16 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i17 = 0; i17 < Math.min(3, storyViewsList.users.size()); i17 = c3.i0.k(i17, 1, storyViewsList.users.get(i17).id, storyItem2.views.recent_viewers)) {
                                                        }
                                                        storyItem2.views.views_count = storyViewsList.count;
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                    int i18 = storyViews2.reactions_count;
                                                    int i19 = storyViewsList.reactions_count;
                                                    if (i18 != i19) {
                                                        storyViews2.reactions_count = i19;
                                                    } else {
                                                        z12 = z11;
                                                    }
                                                    if (z12) {
                                                        zs.f(i13).k(zs.v5, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        x3Var2.a = 0;
                                                    }
                                                    x3Var2.m = false;
                                                }
                                                f8.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + x3Var2.m);
                                                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                                    ((y3) arrayList.get(i20)).e(x3Var2);
                                                }
                                                if (arrayList3.size() < 20 && x3Var2.m) {
                                                    x3Var2.c();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            x3 x3Var3 = x3Var;
                                            ArrayList arrayList4 = x3Var3.r;
                                            TL_stories.StoryItem storyItem3 = x3Var3.b;
                                            int i21 = x3Var3.d;
                                            ArrayList arrayList5 = x3Var3.i;
                                            if (iArr[0] != x3Var3.o) {
                                                f8.b("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                                break;
                                            } else {
                                                x3Var3.e = false;
                                                x3Var3.o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    vp.r1(i21).V3(tL_storyReactionsList.users, false);
                                                    vp.r1(i21).P3(tL_storyReactionsList.chats, false);
                                                    hs.a0(i21).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (x3Var3.l) {
                                                        x3Var3.l = false;
                                                        for (int i22 = 0; i22 < arrayList5.size(); i22++) {
                                                            x3Var3.p.add(Long.valueOf(org.telegram.messenger.o5.o(((TL_stories.StoryReaction) arrayList5.get(i22)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        x3Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (tL_storyReactionsList.reactions.isEmpty()) {
                                                        x3Var3.m = false;
                                                    } else {
                                                        x3Var3.m = true;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    x3Var3.n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        x3Var3.m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i23 = x3Var3.a;
                                                    int i24 = tL_storyReactionsList.count;
                                                    boolean z13 = i23 != i24;
                                                    x3Var3.a = i24;
                                                    if (z13) {
                                                        zs.f(i21).k(zs.v5, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        x3Var3.a = 0;
                                                    }
                                                    x3Var3.m = false;
                                                }
                                                f8.b("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList5.size() + " has next " + x3Var3.m);
                                                for (int i25 = 0; i25 < arrayList4.size(); i25++) {
                                                    ((y3) arrayList4.get(i25)).e(x3Var3);
                                                }
                                                if (arrayList5.size() < 20 && x3Var3.m) {
                                                    x3Var3.c();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i13 = 0;
                            final x3 x3Var2 = this.b;
                            final int[] iArr2 = r2;
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: th.w3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z11;
                                    switch (i13) {
                                        case 0:
                                            x3 x3Var22 = x3Var2;
                                            ArrayList arrayList = x3Var22.r;
                                            ArrayList arrayList2 = x3Var22.h;
                                            int i132 = x3Var22.d;
                                            ArrayList arrayList3 = x3Var22.g;
                                            TL_stories.StoryItem storyItem2 = x3Var22.b;
                                            if (iArr2[0] != x3Var22.o) {
                                                f8.b("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                                break;
                                            } else {
                                                x3Var22.e = false;
                                                x3Var22.o = -1;
                                                TLObject tLObject2 = tLObject;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    a0.h hVar = vp.r1(i132).O1().M;
                                                    if (storyViewsList.views != null) {
                                                        for (int i14 = 0; i14 < storyViewsList.views.size(); i14++) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i14);
                                                            if (hVar.d(storyView.user_id)) {
                                                                hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                            }
                                                        }
                                                    }
                                                    vp.r1(i132).V3(storyViewsList.users, false);
                                                    vp.r1(i132).P3(storyViewsList.chats, false);
                                                    boolean z12 = true;
                                                    hs.a0(i132).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (x3Var22.l) {
                                                        x3Var22.l = false;
                                                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                                                            x3Var22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i15)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    if (x3Var22.q) {
                                                        arrayList2.addAll(storyViewsList.views);
                                                        x3Var22.a();
                                                    } else {
                                                        arrayList3.addAll(storyViewsList.views);
                                                    }
                                                    if (storyViewsList.views.isEmpty()) {
                                                        x3Var22.m = false;
                                                    } else {
                                                        x3Var22.m = true;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    x3Var22.n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        x3Var22.m = false;
                                                    }
                                                    if (storyItem2.views == null) {
                                                        storyItem2.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i16 = storyViewsList.count;
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (i16 > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        for (int i17 = 0; i17 < Math.min(3, storyViewsList.users.size()); i17 = c3.i0.k(i17, 1, storyViewsList.users.get(i17).id, storyItem2.views.recent_viewers)) {
                                                        }
                                                        storyItem2.views.views_count = storyViewsList.count;
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                    int i18 = storyViews2.reactions_count;
                                                    int i19 = storyViewsList.reactions_count;
                                                    if (i18 != i19) {
                                                        storyViews2.reactions_count = i19;
                                                    } else {
                                                        z12 = z11;
                                                    }
                                                    if (z12) {
                                                        zs.f(i132).k(zs.v5, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        x3Var22.a = 0;
                                                    }
                                                    x3Var22.m = false;
                                                }
                                                f8.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + x3Var22.m);
                                                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                                    ((y3) arrayList.get(i20)).e(x3Var22);
                                                }
                                                if (arrayList3.size() < 20 && x3Var22.m) {
                                                    x3Var22.c();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            x3 x3Var3 = x3Var2;
                                            ArrayList arrayList4 = x3Var3.r;
                                            TL_stories.StoryItem storyItem3 = x3Var3.b;
                                            int i21 = x3Var3.d;
                                            ArrayList arrayList5 = x3Var3.i;
                                            if (iArr2[0] != x3Var3.o) {
                                                f8.b("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                                break;
                                            } else {
                                                x3Var3.e = false;
                                                x3Var3.o = -1;
                                                TLObject tLObject3 = tLObject;
                                                if (tLObject3 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                    vp.r1(i21).V3(tL_storyReactionsList.users, false);
                                                    vp.r1(i21).P3(tL_storyReactionsList.chats, false);
                                                    hs.a0(i21).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (x3Var3.l) {
                                                        x3Var3.l = false;
                                                        for (int i22 = 0; i22 < arrayList5.size(); i22++) {
                                                            x3Var3.p.add(Long.valueOf(org.telegram.messenger.o5.o(((TL_stories.StoryReaction) arrayList5.get(i22)).peer_id)));
                                                        }
                                                        arrayList5.clear();
                                                        x3Var3.h.clear();
                                                    }
                                                    arrayList5.addAll(tL_storyReactionsList.reactions);
                                                    if (tL_storyReactionsList.reactions.isEmpty()) {
                                                        x3Var3.m = false;
                                                    } else {
                                                        x3Var3.m = true;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    x3Var3.n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        x3Var3.m = false;
                                                    }
                                                    if (storyItem3.views == null) {
                                                        storyItem3.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i23 = x3Var3.a;
                                                    int i24 = tL_storyReactionsList.count;
                                                    boolean z13 = i23 != i24;
                                                    x3Var3.a = i24;
                                                    if (z13) {
                                                        zs.f(i21).k(zs.v5, new Object[0]);
                                                    }
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                        x3Var3.a = 0;
                                                    }
                                                    x3Var3.m = false;
                                                }
                                                f8.b("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList5.size() + " has next " + x3Var3.m);
                                                for (int i25 = 0; i25 < arrayList4.size(); i25++) {
                                                    ((y3) arrayList4.get(i25)).e(x3Var3);
                                                }
                                                if (arrayList5.size() < 20 && x3Var3.m) {
                                                    x3Var3.c();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            this.o = sendRequest;
            final int[] iArr = {sendRequest};
            return;
        }
        TL_stories.TL_stories_getStoryViewsList tL_stories_getStoryViewsList = new TL_stories.TL_stories_getStoryViewsList();
        tL_stories_getStoryViewsList.id = storyItem.id;
        tL_stories_getStoryViewsList.peer = vp.r1(i10).i1(j10);
        if (this.q) {
            tL_stories_getStoryViewsList.q = "";
            tL_stories_getStoryViewsList.just_contacts = false;
            tL_stories_getStoryViewsList.reactions_first = true;
        } else {
            String str2 = l3Var.c;
            tL_stories_getStoryViewsList.q = str2;
            if (!TextUtils.isEmpty(str2)) {
                tL_stories_getStoryViewsList.flags |= 2;
            }
            tL_stories_getStoryViewsList.just_contacts = l3Var.b;
            tL_stories_getStoryViewsList.reactions_first = l3Var.a;
        }
        tL_stories_getStoryViewsList.limit = (this.l || this.g.size() < 20) ? 20 : 100;
        String str3 = this.n;
        tL_stories_getStoryViewsList.offset = str3;
        if (str3 == null) {
            tL_stories_getStoryViewsList.offset = "";
        }
        this.e = true;
        f8.b("SelfStoryViewsPage load next " + storyItem.id + " " + this.l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
        final int i12 = 1;
        int sendRequest2 = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) { // from class: th.v3
            public final /* synthetic */ x3 b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (i12) {
                    case 0:
                        final int i122 = 1;
                        final x3 x3Var = this.b;
                        final int[] iArr2 = r2;
                        org.telegram.messenger.i0.g3(new Runnable() { // from class: th.w3
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z11;
                                switch (i122) {
                                    case 0:
                                        x3 x3Var22 = x3Var;
                                        ArrayList arrayList = x3Var22.r;
                                        ArrayList arrayList2 = x3Var22.h;
                                        int i132 = x3Var22.d;
                                        ArrayList arrayList3 = x3Var22.g;
                                        TL_stories.StoryItem storyItem2 = x3Var22.b;
                                        if (iArr2[0] != x3Var22.o) {
                                            f8.b("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                            break;
                                        } else {
                                            x3Var22.e = false;
                                            x3Var22.o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = vp.r1(i132).O1().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i14 = 0; i14 < storyViewsList.views.size(); i14++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i14);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                vp.r1(i132).V3(storyViewsList.users, false);
                                                vp.r1(i132).P3(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                hs.a0(i132).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (x3Var22.l) {
                                                    x3Var22.l = false;
                                                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                                                        x3Var22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i15)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (x3Var22.q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    x3Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (storyViewsList.views.isEmpty()) {
                                                    x3Var22.m = false;
                                                } else {
                                                    x3Var22.m = true;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                x3Var22.n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    x3Var22.m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i16 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i16 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i17 = 0; i17 < Math.min(3, storyViewsList.users.size()); i17 = c3.i0.k(i17, 1, storyViewsList.users.get(i17).id, storyItem2.views.recent_viewers)) {
                                                    }
                                                    storyItem2.views.views_count = storyViewsList.count;
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                int i18 = storyViews2.reactions_count;
                                                int i19 = storyViewsList.reactions_count;
                                                if (i18 != i19) {
                                                    storyViews2.reactions_count = i19;
                                                } else {
                                                    z12 = z11;
                                                }
                                                if (z12) {
                                                    zs.f(i132).k(zs.v5, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    x3Var22.a = 0;
                                                }
                                                x3Var22.m = false;
                                            }
                                            f8.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + x3Var22.m);
                                            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                                ((y3) arrayList.get(i20)).e(x3Var22);
                                            }
                                            if (arrayList3.size() < 20 && x3Var22.m) {
                                                x3Var22.c();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        x3 x3Var3 = x3Var;
                                        ArrayList arrayList4 = x3Var3.r;
                                        TL_stories.StoryItem storyItem3 = x3Var3.b;
                                        int i21 = x3Var3.d;
                                        ArrayList arrayList5 = x3Var3.i;
                                        if (iArr2[0] != x3Var3.o) {
                                            f8.b("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                            break;
                                        } else {
                                            x3Var3.e = false;
                                            x3Var3.o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                vp.r1(i21).V3(tL_storyReactionsList.users, false);
                                                vp.r1(i21).P3(tL_storyReactionsList.chats, false);
                                                hs.a0(i21).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (x3Var3.l) {
                                                    x3Var3.l = false;
                                                    for (int i22 = 0; i22 < arrayList5.size(); i22++) {
                                                        x3Var3.p.add(Long.valueOf(org.telegram.messenger.o5.o(((TL_stories.StoryReaction) arrayList5.get(i22)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    x3Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (tL_storyReactionsList.reactions.isEmpty()) {
                                                    x3Var3.m = false;
                                                } else {
                                                    x3Var3.m = true;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                x3Var3.n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    x3Var3.m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i23 = x3Var3.a;
                                                int i24 = tL_storyReactionsList.count;
                                                boolean z13 = i23 != i24;
                                                x3Var3.a = i24;
                                                if (z13) {
                                                    zs.f(i21).k(zs.v5, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    x3Var3.a = 0;
                                                }
                                                x3Var3.m = false;
                                            }
                                            f8.b("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList5.size() + " has next " + x3Var3.m);
                                            for (int i25 = 0; i25 < arrayList4.size(); i25++) {
                                                ((y3) arrayList4.get(i25)).e(x3Var3);
                                            }
                                            if (arrayList5.size() < 20 && x3Var3.m) {
                                                x3Var3.c();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i13 = 0;
                        final x3 x3Var2 = this.b;
                        final int[] iArr22 = r2;
                        org.telegram.messenger.i0.g3(new Runnable() { // from class: th.w3
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z11;
                                switch (i13) {
                                    case 0:
                                        x3 x3Var22 = x3Var2;
                                        ArrayList arrayList = x3Var22.r;
                                        ArrayList arrayList2 = x3Var22.h;
                                        int i132 = x3Var22.d;
                                        ArrayList arrayList3 = x3Var22.g;
                                        TL_stories.StoryItem storyItem2 = x3Var22.b;
                                        if (iArr22[0] != x3Var22.o) {
                                            f8.b("SelfStoryViewsPage " + storyItem2.id + " localId != reqId");
                                            break;
                                        } else {
                                            x3Var22.e = false;
                                            x3Var22.o = -1;
                                            TLObject tLObject2 = tLObject;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                a0.h hVar = vp.r1(i132).O1().M;
                                                if (storyViewsList.views != null) {
                                                    for (int i14 = 0; i14 < storyViewsList.views.size(); i14++) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i14);
                                                        if (hVar.d(storyView.user_id)) {
                                                            hVar.k(Boolean.valueOf(storyView.blocked_my_stories_from), storyView.user_id);
                                                        }
                                                    }
                                                }
                                                vp.r1(i132).V3(storyViewsList.users, false);
                                                vp.r1(i132).P3(storyViewsList.chats, false);
                                                boolean z12 = true;
                                                hs.a0(i132).m1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (x3Var22.l) {
                                                    x3Var22.l = false;
                                                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                                                        x3Var22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i15)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                if (x3Var22.q) {
                                                    arrayList2.addAll(storyViewsList.views);
                                                    x3Var22.a();
                                                } else {
                                                    arrayList3.addAll(storyViewsList.views);
                                                }
                                                if (storyViewsList.views.isEmpty()) {
                                                    x3Var22.m = false;
                                                } else {
                                                    x3Var22.m = true;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                x3Var22.n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    x3Var22.m = false;
                                                }
                                                if (storyItem2.views == null) {
                                                    storyItem2.views = new TL_stories.TL_storyViews();
                                                }
                                                int i16 = storyViewsList.count;
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (i16 > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    for (int i17 = 0; i17 < Math.min(3, storyViewsList.users.size()); i17 = c3.i0.k(i17, 1, storyViewsList.users.get(i17).id, storyItem2.views.recent_viewers)) {
                                                    }
                                                    storyItem2.views.views_count = storyViewsList.count;
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                int i18 = storyViews2.reactions_count;
                                                int i19 = storyViewsList.reactions_count;
                                                if (i18 != i19) {
                                                    storyViews2.reactions_count = i19;
                                                } else {
                                                    z12 = z11;
                                                }
                                                if (z12) {
                                                    zs.f(i132).k(zs.v5, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    x3Var22.a = 0;
                                                }
                                                x3Var22.m = false;
                                            }
                                            f8.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + x3Var22.m);
                                            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                                ((y3) arrayList.get(i20)).e(x3Var22);
                                            }
                                            if (arrayList3.size() < 20 && x3Var22.m) {
                                                x3Var22.c();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        x3 x3Var3 = x3Var2;
                                        ArrayList arrayList4 = x3Var3.r;
                                        TL_stories.StoryItem storyItem3 = x3Var3.b;
                                        int i21 = x3Var3.d;
                                        ArrayList arrayList5 = x3Var3.i;
                                        if (iArr22[0] != x3Var3.o) {
                                            f8.b("SelfStoryViewsPage reactions " + storyItem3.id + " localId != reqId");
                                            break;
                                        } else {
                                            x3Var3.e = false;
                                            x3Var3.o = -1;
                                            TLObject tLObject3 = tLObject;
                                            if (tLObject3 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject3;
                                                vp.r1(i21).V3(tL_storyReactionsList.users, false);
                                                vp.r1(i21).P3(tL_storyReactionsList.chats, false);
                                                hs.a0(i21).m1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (x3Var3.l) {
                                                    x3Var3.l = false;
                                                    for (int i22 = 0; i22 < arrayList5.size(); i22++) {
                                                        x3Var3.p.add(Long.valueOf(org.telegram.messenger.o5.o(((TL_stories.StoryReaction) arrayList5.get(i22)).peer_id)));
                                                    }
                                                    arrayList5.clear();
                                                    x3Var3.h.clear();
                                                }
                                                arrayList5.addAll(tL_storyReactionsList.reactions);
                                                if (tL_storyReactionsList.reactions.isEmpty()) {
                                                    x3Var3.m = false;
                                                } else {
                                                    x3Var3.m = true;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                x3Var3.n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    x3Var3.m = false;
                                                }
                                                if (storyItem3.views == null) {
                                                    storyItem3.views = new TL_stories.TL_storyViews();
                                                }
                                                int i23 = x3Var3.a;
                                                int i24 = tL_storyReactionsList.count;
                                                boolean z13 = i23 != i24;
                                                x3Var3.a = i24;
                                                if (z13) {
                                                    zs.f(i21).k(zs.v5, new Object[0]);
                                                }
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null && "MSG_ID_INVALID".equals(tL_error3.text)) {
                                                    x3Var3.a = 0;
                                                }
                                                x3Var3.m = false;
                                            }
                                            f8.b("SelfStoryViewsPage reactions " + storyItem3.id + " response  totalItems " + arrayList5.size() + " has next " + x3Var3.m);
                                            for (int i25 = 0; i25 < arrayList4.size(); i25++) {
                                                ((y3) arrayList4.get(i25)).e(x3Var3);
                                            }
                                            if (arrayList5.size() < 20 && x3Var3.m) {
                                                x3Var3.c();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        this.o = sendRequest2;
        final int[] iArr2 = {sendRequest2};
    }

    public final void d() {
        if (this.o >= 0) {
            ConnectionsManager.getInstance(this.d).cancelRequest(this.o, false);
        }
        this.o = -1;
    }

    public final void e(l3 l3Var, boolean z10, boolean z11) {
        l3 l3Var2 = new l3();
        l3Var2.a = l3Var.a;
        l3Var2.b = l3Var.b;
        l3Var2.c = l3Var.c;
        int i10 = 0;
        if (!z10) {
            l3Var2.b = false;
        }
        if (!z11) {
            l3Var2.a = true;
        }
        l3 l3Var3 = this.s;
        if (l3Var3.equals(l3Var2)) {
            return;
        }
        l3Var3.a = l3Var2.a;
        l3Var3.b = l3Var2.b;
        l3Var3.c = l3Var2.c;
        if (this.f || !this.q) {
            d();
            this.g.clear();
            this.i.clear();
            this.l = true;
            this.e = false;
            this.m = true;
            this.n = "";
            c();
            return;
        }
        a();
        while (true) {
            ArrayList arrayList = this.r;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((y3) arrayList.get(i10)).e(this);
            i10++;
        }
    }
}
