// default package

import android.text.TextUtils;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class y3a {
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
    public final n3a s = new n3a();

    public y3a(int i, long j, TL_stories.StoryItem storyItem) {
        TL_stories.StoryViews storyViews;
        this.d = i;
        this.b = storyItem;
        this.f = j < 0;
        this.c = j;
        TL_stories.StoryViews storyViews2 = storyItem.views;
        int i2 = storyViews2 == null ? 0 : storyViews2.views_count;
        this.a = i2;
        if (i2 < 200) {
            this.q = true;
        }
        boolean z = t6b.v(storyItem) && !yac.h(i).p();
        this.j = z;
        if (z && (storyViews = storyItem.views) != null && storyViews.reactions_count > 0) {
            this.j = false;
            this.k = true;
            z = false;
        }
        if (z) {
            return;
        }
        this.l = true;
        if (storyItem.views != null) {
            for (int i3 = 0; i3 < storyItem.views.recent_viewers.size(); i3++) {
                Long l = storyItem.views.recent_viewers.get(i3);
                long longValue = l.longValue();
                if (uc7.s1(i).X1(l) != null) {
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
        n3a n3aVar = this.s;
        boolean z = n3aVar.b;
        ArrayList arrayList2 = this.h;
        if (z || !TextUtils.isEmpty(n3aVar.c)) {
            if (TextUtils.isEmpty(n3aVar.c)) {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            } else {
                str = n3aVar.c.trim().toLowerCase();
                str2 = ob6.D0().S0(str, true, false);
                str4 = c00.i(" ", str);
                str3 = c00.i(" ", str2);
            }
            for (int i = 0; i < arrayList2.size(); i++) {
                TLRPC.User X1 = uc7.s1(this.d).X1(Long.valueOf(((TL_stories.StoryView) arrayList2.get(i)).user_id));
                boolean z2 = !n3aVar.b || (X1 != null && X1.contact);
                if (z2 && str != null) {
                    String lowerCase = lv2.m(0, X1.first_name, X1.last_name).toLowerCase();
                    String p = lbc.p(X1);
                    String I3 = hl.I3(lowerCase);
                    if ((lowerCase == null || (!lowerCase.startsWith(str) && !lowerCase.contains(str4))) && !I3.startsWith(str2) && !I3.contains(str3) && (p == null || (!p.startsWith(str2) && !p.contains(str3)))) {
                        z2 = false;
                    }
                }
                if (z2) {
                    arrayList.add((TL_stories.StoryView) arrayList2.get(i));
                }
            }
        } else {
            arrayList.addAll(arrayList2);
        }
        if (n3aVar.a) {
            return;
        }
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new nm((byte) 13)));
    }

    public final int b() {
        return (this.f ? this.i : this.g).size();
    }

    public final void c() {
        if (this.e || !this.m || this.j) {
            return;
        }
        boolean z = this.f;
        long j = this.c;
        final byte b = 0;
        n3a n3aVar = this.s;
        int i = this.d;
        TL_stories.StoryItem storyItem = this.b;
        final byte b2 = 1;
        if (z) {
            TL_stories.TL_getStoryReactionsList tL_getStoryReactionsList = new TL_stories.TL_getStoryReactionsList();
            tL_getStoryReactionsList.forwards_first = n3aVar.a;
            tL_getStoryReactionsList.id = storyItem.id;
            tL_getStoryReactionsList.peer = uc7.s1(i).j1(j);
            tL_getStoryReactionsList.limit = (this.l || this.i.size() < 20) ? 20 : 100;
            String str = this.n;
            tL_getStoryReactionsList.offset = str;
            if (str == null) {
                tL_getStoryReactionsList.offset = "";
            } else {
                tL_getStoryReactionsList.flags |= 2;
            }
            this.e = true;
            cc4.b("SelfStoryViewsPage reactions load next " + storyItem.id + " " + this.l + " offset=" + tL_getStoryReactionsList.offset);
            int sendRequest = ConnectionsManager.getInstance(i).sendRequest(tL_getStoryReactionsList, new RequestDelegate(this) { // from class: w3a
                public final /* synthetic */ y3a b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (b) {
                        case 0:
                            final byte b3 = 1;
                            final y3a y3aVar = this.b;
                            final int[] iArr = r2;
                            hl.c3(new Runnable() { // from class: x3a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2;
                                    TL_stories.StoryItem storyItem2;
                                    boolean z2;
                                    boolean z3;
                                    boolean z4;
                                    byte b4 = b3;
                                    TLRPC.TL_error tL_error2 = tL_error;
                                    TLObject tLObject2 = tLObject;
                                    int[] iArr2 = iArr;
                                    y3a y3aVar2 = y3aVar;
                                    switch (b4) {
                                        case 0:
                                            ArrayList arrayList = y3aVar2.r;
                                            ArrayList arrayList2 = y3aVar2.h;
                                            int i3 = y3aVar2.d;
                                            TL_stories.StoryItem storyItem3 = y3aVar2.b;
                                            ArrayList arrayList3 = y3aVar2.g;
                                            if (iArr2[0] != y3aVar2.o) {
                                                cc4.b("SelfStoryViewsPage " + storyItem3.id + " localId != reqId");
                                                break;
                                            } else {
                                                y3aVar2.e = false;
                                                y3aVar2.o = -1;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    zh6 zh6Var = uc7.s1(i3).O1().M;
                                                    if (storyViewsList.views != null) {
                                                        int i4 = 0;
                                                        while (i4 < storyViewsList.views.size()) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i4);
                                                            TL_stories.StoryItem storyItem4 = storyItem3;
                                                            if (zh6Var.d(storyView.user_id)) {
                                                                zh6Var.k(storyView.user_id, Boolean.valueOf(storyView.blocked_my_stories_from));
                                                            }
                                                            i4++;
                                                            storyItem3 = storyItem4;
                                                        }
                                                    }
                                                    storyItem2 = storyItem3;
                                                    uc7.s1(i3).j4(storyViewsList.users, false);
                                                    uc7.s1(i3).c4(storyViewsList.chats, false);
                                                    jf7.Y(i3).j1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (y3aVar2.l) {
                                                        y3aVar2.l = false;
                                                        for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                                                            y3aVar2.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i5)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    boolean z5 = y3aVar2.q;
                                                    ArrayList<TL_stories.StoryView> arrayList4 = storyViewsList.views;
                                                    if (z5) {
                                                        arrayList2.addAll(arrayList4);
                                                        y3aVar2.a();
                                                    } else {
                                                        arrayList3.addAll(arrayList4);
                                                    }
                                                    if (storyViewsList.views.isEmpty()) {
                                                        z2 = false;
                                                        y3aVar2.m = false;
                                                    } else {
                                                        y3aVar2.m = true;
                                                        z2 = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    y3aVar2.n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        y3aVar2.m = z2;
                                                    }
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (storyViews == null) {
                                                        storyViews = new TL_stories.TL_storyViews();
                                                        storyItem2.views = storyViews;
                                                    }
                                                    if (storyViewsList.count > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        int i6 = 0;
                                                        while (true) {
                                                            int min = Math.min(3, storyViewsList.users.size());
                                                            TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                            if (i6 < min) {
                                                                i6 = dze.c(i6, 1, storyViewsList.users.get(i6).id, storyViews2.recent_viewers);
                                                            } else {
                                                                z3 = true;
                                                                storyViews2.views_count = storyViewsList.count;
                                                                storyViews = storyViews2;
                                                                z4 = true;
                                                            }
                                                        }
                                                    } else {
                                                        z3 = true;
                                                        z4 = false;
                                                    }
                                                    int i7 = storyViews.reactions_count;
                                                    int i8 = storyViewsList.reactions_count;
                                                    if (i7 != i8) {
                                                        storyViews.reactions_count = i8;
                                                    } else {
                                                        z3 = z4;
                                                    }
                                                    if (z3) {
                                                        i2 = 0;
                                                        jn7.f(i3).k(jn7.y5, new Object[0]);
                                                    } else {
                                                        i2 = 0;
                                                    }
                                                } else {
                                                    i2 = 0;
                                                    storyItem2 = storyItem3;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        y3aVar2.a = 0;
                                                    }
                                                    y3aVar2.m = false;
                                                }
                                                cc4.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + y3aVar2.m);
                                                for (int i9 = i2; i9 < arrayList.size(); i9++) {
                                                    ((z3a) arrayList.get(i9)).c(y3aVar2);
                                                }
                                                if (arrayList3.size() < 20 && y3aVar2.m) {
                                                    y3aVar2.c();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = y3aVar2.r;
                                            TL_stories.StoryItem storyItem5 = y3aVar2.b;
                                            int i10 = y3aVar2.d;
                                            ArrayList arrayList6 = y3aVar2.i;
                                            if (iArr2[0] != y3aVar2.o) {
                                                cc4.b("SelfStoryViewsPage reactions " + storyItem5.id + " localId != reqId");
                                                break;
                                            } else {
                                                y3aVar2.e = false;
                                                y3aVar2.o = -1;
                                                if (tLObject2 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject2;
                                                    uc7.s1(i10).j4(tL_storyReactionsList.users, false);
                                                    uc7.s1(i10).c4(tL_storyReactionsList.chats, false);
                                                    jf7.Y(i10).j1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (y3aVar2.l) {
                                                        y3aVar2.l = false;
                                                        for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                                                            y3aVar2.p.add(Long.valueOf(wf3.n(((TL_stories.StoryReaction) arrayList6.get(i11)).peer_id)));
                                                        }
                                                        arrayList6.clear();
                                                        y3aVar2.h.clear();
                                                    }
                                                    arrayList6.addAll(tL_storyReactionsList.reactions);
                                                    if (tL_storyReactionsList.reactions.isEmpty()) {
                                                        y3aVar2.m = false;
                                                    } else {
                                                        y3aVar2.m = true;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    y3aVar2.n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        y3aVar2.m = false;
                                                    }
                                                    if (storyItem5.views == null) {
                                                        storyItem5.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i12 = y3aVar2.a;
                                                    int i13 = tL_storyReactionsList.count;
                                                    boolean z6 = i12 != i13;
                                                    y3aVar2.a = i13;
                                                    if (z6) {
                                                        jn7.f(i10).k(jn7.y5, new Object[0]);
                                                    }
                                                } else {
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        y3aVar2.a = 0;
                                                    }
                                                    y3aVar2.m = false;
                                                }
                                                cc4.b("SelfStoryViewsPage reactions " + storyItem5.id + " response  totalItems " + arrayList6.size() + " has next " + y3aVar2.m);
                                                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                                                    ((z3a) arrayList5.get(i14)).c(y3aVar2);
                                                }
                                                if (arrayList6.size() < 20 && y3aVar2.m) {
                                                    y3aVar2.c();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final byte b4 = 0;
                            final y3a y3aVar2 = this.b;
                            final int[] iArr2 = r2;
                            hl.c3(new Runnable() { // from class: x3a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2;
                                    TL_stories.StoryItem storyItem2;
                                    boolean z2;
                                    boolean z3;
                                    boolean z4;
                                    byte b42 = b4;
                                    TLRPC.TL_error tL_error2 = tL_error;
                                    TLObject tLObject2 = tLObject;
                                    int[] iArr22 = iArr2;
                                    y3a y3aVar22 = y3aVar2;
                                    switch (b42) {
                                        case 0:
                                            ArrayList arrayList = y3aVar22.r;
                                            ArrayList arrayList2 = y3aVar22.h;
                                            int i3 = y3aVar22.d;
                                            TL_stories.StoryItem storyItem3 = y3aVar22.b;
                                            ArrayList arrayList3 = y3aVar22.g;
                                            if (iArr22[0] != y3aVar22.o) {
                                                cc4.b("SelfStoryViewsPage " + storyItem3.id + " localId != reqId");
                                                break;
                                            } else {
                                                y3aVar22.e = false;
                                                y3aVar22.o = -1;
                                                if (tLObject2 != null) {
                                                    TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                    zh6 zh6Var = uc7.s1(i3).O1().M;
                                                    if (storyViewsList.views != null) {
                                                        int i4 = 0;
                                                        while (i4 < storyViewsList.views.size()) {
                                                            TL_stories.StoryView storyView = storyViewsList.views.get(i4);
                                                            TL_stories.StoryItem storyItem4 = storyItem3;
                                                            if (zh6Var.d(storyView.user_id)) {
                                                                zh6Var.k(storyView.user_id, Boolean.valueOf(storyView.blocked_my_stories_from));
                                                            }
                                                            i4++;
                                                            storyItem3 = storyItem4;
                                                        }
                                                    }
                                                    storyItem2 = storyItem3;
                                                    uc7.s1(i3).j4(storyViewsList.users, false);
                                                    uc7.s1(i3).c4(storyViewsList.chats, false);
                                                    jf7.Y(i3).j1(storyViewsList.users, storyViewsList.chats, true, false);
                                                    if (y3aVar22.l) {
                                                        y3aVar22.l = false;
                                                        for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                                                            y3aVar22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i5)).user_id));
                                                        }
                                                        arrayList3.clear();
                                                        arrayList2.clear();
                                                    }
                                                    boolean z5 = y3aVar22.q;
                                                    ArrayList<TL_stories.StoryView> arrayList4 = storyViewsList.views;
                                                    if (z5) {
                                                        arrayList2.addAll(arrayList4);
                                                        y3aVar22.a();
                                                    } else {
                                                        arrayList3.addAll(arrayList4);
                                                    }
                                                    if (storyViewsList.views.isEmpty()) {
                                                        z2 = false;
                                                        y3aVar22.m = false;
                                                    } else {
                                                        y3aVar22.m = true;
                                                        z2 = false;
                                                    }
                                                    String str2 = storyViewsList.next_offset;
                                                    y3aVar22.n = str2;
                                                    if (TextUtils.isEmpty(str2)) {
                                                        y3aVar22.m = z2;
                                                    }
                                                    TL_stories.StoryViews storyViews = storyItem2.views;
                                                    if (storyViews == null) {
                                                        storyViews = new TL_stories.TL_storyViews();
                                                        storyItem2.views = storyViews;
                                                    }
                                                    if (storyViewsList.count > storyViews.views_count) {
                                                        storyViews.recent_viewers.clear();
                                                        int i6 = 0;
                                                        while (true) {
                                                            int min = Math.min(3, storyViewsList.users.size());
                                                            TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                            if (i6 < min) {
                                                                i6 = dze.c(i6, 1, storyViewsList.users.get(i6).id, storyViews2.recent_viewers);
                                                            } else {
                                                                z3 = true;
                                                                storyViews2.views_count = storyViewsList.count;
                                                                storyViews = storyViews2;
                                                                z4 = true;
                                                            }
                                                        }
                                                    } else {
                                                        z3 = true;
                                                        z4 = false;
                                                    }
                                                    int i7 = storyViews.reactions_count;
                                                    int i8 = storyViewsList.reactions_count;
                                                    if (i7 != i8) {
                                                        storyViews.reactions_count = i8;
                                                    } else {
                                                        z3 = z4;
                                                    }
                                                    if (z3) {
                                                        i2 = 0;
                                                        jn7.f(i3).k(jn7.y5, new Object[0]);
                                                    } else {
                                                        i2 = 0;
                                                    }
                                                } else {
                                                    i2 = 0;
                                                    storyItem2 = storyItem3;
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        y3aVar22.a = 0;
                                                    }
                                                    y3aVar22.m = false;
                                                }
                                                cc4.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + y3aVar22.m);
                                                for (int i9 = i2; i9 < arrayList.size(); i9++) {
                                                    ((z3a) arrayList.get(i9)).c(y3aVar22);
                                                }
                                                if (arrayList3.size() < 20 && y3aVar22.m) {
                                                    y3aVar22.c();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            ArrayList arrayList5 = y3aVar22.r;
                                            TL_stories.StoryItem storyItem5 = y3aVar22.b;
                                            int i10 = y3aVar22.d;
                                            ArrayList arrayList6 = y3aVar22.i;
                                            if (iArr22[0] != y3aVar22.o) {
                                                cc4.b("SelfStoryViewsPage reactions " + storyItem5.id + " localId != reqId");
                                                break;
                                            } else {
                                                y3aVar22.e = false;
                                                y3aVar22.o = -1;
                                                if (tLObject2 != null) {
                                                    TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject2;
                                                    uc7.s1(i10).j4(tL_storyReactionsList.users, false);
                                                    uc7.s1(i10).c4(tL_storyReactionsList.chats, false);
                                                    jf7.Y(i10).j1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                    if (y3aVar22.l) {
                                                        y3aVar22.l = false;
                                                        for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                                                            y3aVar22.p.add(Long.valueOf(wf3.n(((TL_stories.StoryReaction) arrayList6.get(i11)).peer_id)));
                                                        }
                                                        arrayList6.clear();
                                                        y3aVar22.h.clear();
                                                    }
                                                    arrayList6.addAll(tL_storyReactionsList.reactions);
                                                    if (tL_storyReactionsList.reactions.isEmpty()) {
                                                        y3aVar22.m = false;
                                                    } else {
                                                        y3aVar22.m = true;
                                                    }
                                                    String str3 = tL_storyReactionsList.next_offset;
                                                    y3aVar22.n = str3;
                                                    if (TextUtils.isEmpty(str3)) {
                                                        y3aVar22.m = false;
                                                    }
                                                    if (storyItem5.views == null) {
                                                        storyItem5.views = new TL_stories.TL_storyViews();
                                                    }
                                                    int i12 = y3aVar22.a;
                                                    int i13 = tL_storyReactionsList.count;
                                                    boolean z6 = i12 != i13;
                                                    y3aVar22.a = i13;
                                                    if (z6) {
                                                        jn7.f(i10).k(jn7.y5, new Object[0]);
                                                    }
                                                } else {
                                                    if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                        y3aVar22.a = 0;
                                                    }
                                                    y3aVar22.m = false;
                                                }
                                                cc4.b("SelfStoryViewsPage reactions " + storyItem5.id + " response  totalItems " + arrayList6.size() + " has next " + y3aVar22.m);
                                                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                                                    ((z3a) arrayList5.get(i14)).c(y3aVar22);
                                                }
                                                if (arrayList6.size() < 20 && y3aVar22.m) {
                                                    y3aVar22.c();
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
        tL_stories_getStoryViewsList.peer = uc7.s1(i).j1(j);
        if (this.q) {
            tL_stories_getStoryViewsList.q = "";
            tL_stories_getStoryViewsList.just_contacts = false;
            tL_stories_getStoryViewsList.reactions_first = true;
        } else {
            String str2 = n3aVar.c;
            tL_stories_getStoryViewsList.q = str2;
            if (!TextUtils.isEmpty(str2)) {
                tL_stories_getStoryViewsList.flags |= 2;
            }
            tL_stories_getStoryViewsList.just_contacts = n3aVar.b;
            tL_stories_getStoryViewsList.reactions_first = n3aVar.a;
        }
        tL_stories_getStoryViewsList.limit = (this.l || this.g.size() < 20) ? 20 : 100;
        String str3 = this.n;
        tL_stories_getStoryViewsList.offset = str3;
        if (str3 == null) {
            tL_stories_getStoryViewsList.offset = "";
        }
        this.e = true;
        cc4.b("SelfStoryViewsPage load next " + storyItem.id + " " + this.l + " offset=" + tL_stories_getStoryViewsList.offset + " q" + tL_stories_getStoryViewsList.q + " " + tL_stories_getStoryViewsList.just_contacts + " " + tL_stories_getStoryViewsList.reactions_first);
        int sendRequest2 = ConnectionsManager.getInstance(i).sendRequest(tL_stories_getStoryViewsList, new RequestDelegate(this) { // from class: w3a
            public final /* synthetic */ y3a b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (b2) {
                    case 0:
                        final byte b3 = 1;
                        final y3a y3aVar = this.b;
                        final int[] iArr2 = r2;
                        hl.c3(new Runnable() { // from class: x3a
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2;
                                TL_stories.StoryItem storyItem2;
                                boolean z2;
                                boolean z3;
                                boolean z4;
                                byte b42 = b3;
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLObject tLObject2 = tLObject;
                                int[] iArr22 = iArr2;
                                y3a y3aVar22 = y3aVar;
                                switch (b42) {
                                    case 0:
                                        ArrayList arrayList = y3aVar22.r;
                                        ArrayList arrayList2 = y3aVar22.h;
                                        int i3 = y3aVar22.d;
                                        TL_stories.StoryItem storyItem3 = y3aVar22.b;
                                        ArrayList arrayList3 = y3aVar22.g;
                                        if (iArr22[0] != y3aVar22.o) {
                                            cc4.b("SelfStoryViewsPage " + storyItem3.id + " localId != reqId");
                                            break;
                                        } else {
                                            y3aVar22.e = false;
                                            y3aVar22.o = -1;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                zh6 zh6Var = uc7.s1(i3).O1().M;
                                                if (storyViewsList.views != null) {
                                                    int i4 = 0;
                                                    while (i4 < storyViewsList.views.size()) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i4);
                                                        TL_stories.StoryItem storyItem4 = storyItem3;
                                                        if (zh6Var.d(storyView.user_id)) {
                                                            zh6Var.k(storyView.user_id, Boolean.valueOf(storyView.blocked_my_stories_from));
                                                        }
                                                        i4++;
                                                        storyItem3 = storyItem4;
                                                    }
                                                }
                                                storyItem2 = storyItem3;
                                                uc7.s1(i3).j4(storyViewsList.users, false);
                                                uc7.s1(i3).c4(storyViewsList.chats, false);
                                                jf7.Y(i3).j1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (y3aVar22.l) {
                                                    y3aVar22.l = false;
                                                    for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                                                        y3aVar22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i5)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                boolean z5 = y3aVar22.q;
                                                ArrayList<TL_stories.StoryView> arrayList4 = storyViewsList.views;
                                                if (z5) {
                                                    arrayList2.addAll(arrayList4);
                                                    y3aVar22.a();
                                                } else {
                                                    arrayList3.addAll(arrayList4);
                                                }
                                                if (storyViewsList.views.isEmpty()) {
                                                    z2 = false;
                                                    y3aVar22.m = false;
                                                } else {
                                                    y3aVar22.m = true;
                                                    z2 = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                y3aVar22.n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    y3aVar22.m = z2;
                                                }
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (storyViews == null) {
                                                    storyViews = new TL_stories.TL_storyViews();
                                                    storyItem2.views = storyViews;
                                                }
                                                if (storyViewsList.count > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    int i6 = 0;
                                                    while (true) {
                                                        int min = Math.min(3, storyViewsList.users.size());
                                                        TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                        if (i6 < min) {
                                                            i6 = dze.c(i6, 1, storyViewsList.users.get(i6).id, storyViews2.recent_viewers);
                                                        } else {
                                                            z3 = true;
                                                            storyViews2.views_count = storyViewsList.count;
                                                            storyViews = storyViews2;
                                                            z4 = true;
                                                        }
                                                    }
                                                } else {
                                                    z3 = true;
                                                    z4 = false;
                                                }
                                                int i7 = storyViews.reactions_count;
                                                int i8 = storyViewsList.reactions_count;
                                                if (i7 != i8) {
                                                    storyViews.reactions_count = i8;
                                                } else {
                                                    z3 = z4;
                                                }
                                                if (z3) {
                                                    i2 = 0;
                                                    jn7.f(i3).k(jn7.y5, new Object[0]);
                                                } else {
                                                    i2 = 0;
                                                }
                                            } else {
                                                i2 = 0;
                                                storyItem2 = storyItem3;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    y3aVar22.a = 0;
                                                }
                                                y3aVar22.m = false;
                                            }
                                            cc4.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + y3aVar22.m);
                                            for (int i9 = i2; i9 < arrayList.size(); i9++) {
                                                ((z3a) arrayList.get(i9)).c(y3aVar22);
                                            }
                                            if (arrayList3.size() < 20 && y3aVar22.m) {
                                                y3aVar22.c();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        ArrayList arrayList5 = y3aVar22.r;
                                        TL_stories.StoryItem storyItem5 = y3aVar22.b;
                                        int i10 = y3aVar22.d;
                                        ArrayList arrayList6 = y3aVar22.i;
                                        if (iArr22[0] != y3aVar22.o) {
                                            cc4.b("SelfStoryViewsPage reactions " + storyItem5.id + " localId != reqId");
                                            break;
                                        } else {
                                            y3aVar22.e = false;
                                            y3aVar22.o = -1;
                                            if (tLObject2 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject2;
                                                uc7.s1(i10).j4(tL_storyReactionsList.users, false);
                                                uc7.s1(i10).c4(tL_storyReactionsList.chats, false);
                                                jf7.Y(i10).j1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (y3aVar22.l) {
                                                    y3aVar22.l = false;
                                                    for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                                                        y3aVar22.p.add(Long.valueOf(wf3.n(((TL_stories.StoryReaction) arrayList6.get(i11)).peer_id)));
                                                    }
                                                    arrayList6.clear();
                                                    y3aVar22.h.clear();
                                                }
                                                arrayList6.addAll(tL_storyReactionsList.reactions);
                                                if (tL_storyReactionsList.reactions.isEmpty()) {
                                                    y3aVar22.m = false;
                                                } else {
                                                    y3aVar22.m = true;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                y3aVar22.n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    y3aVar22.m = false;
                                                }
                                                if (storyItem5.views == null) {
                                                    storyItem5.views = new TL_stories.TL_storyViews();
                                                }
                                                int i12 = y3aVar22.a;
                                                int i13 = tL_storyReactionsList.count;
                                                boolean z6 = i12 != i13;
                                                y3aVar22.a = i13;
                                                if (z6) {
                                                    jn7.f(i10).k(jn7.y5, new Object[0]);
                                                }
                                            } else {
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    y3aVar22.a = 0;
                                                }
                                                y3aVar22.m = false;
                                            }
                                            cc4.b("SelfStoryViewsPage reactions " + storyItem5.id + " response  totalItems " + arrayList6.size() + " has next " + y3aVar22.m);
                                            for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                                                ((z3a) arrayList5.get(i14)).c(y3aVar22);
                                            }
                                            if (arrayList6.size() < 20 && y3aVar22.m) {
                                                y3aVar22.c();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final byte b4 = 0;
                        final y3a y3aVar2 = this.b;
                        final int[] iArr22 = r2;
                        hl.c3(new Runnable() { // from class: x3a
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2;
                                TL_stories.StoryItem storyItem2;
                                boolean z2;
                                boolean z3;
                                boolean z4;
                                byte b42 = b4;
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLObject tLObject2 = tLObject;
                                int[] iArr222 = iArr22;
                                y3a y3aVar22 = y3aVar2;
                                switch (b42) {
                                    case 0:
                                        ArrayList arrayList = y3aVar22.r;
                                        ArrayList arrayList2 = y3aVar22.h;
                                        int i3 = y3aVar22.d;
                                        TL_stories.StoryItem storyItem3 = y3aVar22.b;
                                        ArrayList arrayList3 = y3aVar22.g;
                                        if (iArr222[0] != y3aVar22.o) {
                                            cc4.b("SelfStoryViewsPage " + storyItem3.id + " localId != reqId");
                                            break;
                                        } else {
                                            y3aVar22.e = false;
                                            y3aVar22.o = -1;
                                            if (tLObject2 != null) {
                                                TL_stories.StoryViewsList storyViewsList = (TL_stories.StoryViewsList) tLObject2;
                                                zh6 zh6Var = uc7.s1(i3).O1().M;
                                                if (storyViewsList.views != null) {
                                                    int i4 = 0;
                                                    while (i4 < storyViewsList.views.size()) {
                                                        TL_stories.StoryView storyView = storyViewsList.views.get(i4);
                                                        TL_stories.StoryItem storyItem4 = storyItem3;
                                                        if (zh6Var.d(storyView.user_id)) {
                                                            zh6Var.k(storyView.user_id, Boolean.valueOf(storyView.blocked_my_stories_from));
                                                        }
                                                        i4++;
                                                        storyItem3 = storyItem4;
                                                    }
                                                }
                                                storyItem2 = storyItem3;
                                                uc7.s1(i3).j4(storyViewsList.users, false);
                                                uc7.s1(i3).c4(storyViewsList.chats, false);
                                                jf7.Y(i3).j1(storyViewsList.users, storyViewsList.chats, true, false);
                                                if (y3aVar22.l) {
                                                    y3aVar22.l = false;
                                                    for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                                                        y3aVar22.p.add(Long.valueOf(((TL_stories.StoryView) arrayList3.get(i5)).user_id));
                                                    }
                                                    arrayList3.clear();
                                                    arrayList2.clear();
                                                }
                                                boolean z5 = y3aVar22.q;
                                                ArrayList<TL_stories.StoryView> arrayList4 = storyViewsList.views;
                                                if (z5) {
                                                    arrayList2.addAll(arrayList4);
                                                    y3aVar22.a();
                                                } else {
                                                    arrayList3.addAll(arrayList4);
                                                }
                                                if (storyViewsList.views.isEmpty()) {
                                                    z2 = false;
                                                    y3aVar22.m = false;
                                                } else {
                                                    y3aVar22.m = true;
                                                    z2 = false;
                                                }
                                                String str22 = storyViewsList.next_offset;
                                                y3aVar22.n = str22;
                                                if (TextUtils.isEmpty(str22)) {
                                                    y3aVar22.m = z2;
                                                }
                                                TL_stories.StoryViews storyViews = storyItem2.views;
                                                if (storyViews == null) {
                                                    storyViews = new TL_stories.TL_storyViews();
                                                    storyItem2.views = storyViews;
                                                }
                                                if (storyViewsList.count > storyViews.views_count) {
                                                    storyViews.recent_viewers.clear();
                                                    int i6 = 0;
                                                    while (true) {
                                                        int min = Math.min(3, storyViewsList.users.size());
                                                        TL_stories.StoryViews storyViews2 = storyItem2.views;
                                                        if (i6 < min) {
                                                            i6 = dze.c(i6, 1, storyViewsList.users.get(i6).id, storyViews2.recent_viewers);
                                                        } else {
                                                            z3 = true;
                                                            storyViews2.views_count = storyViewsList.count;
                                                            storyViews = storyViews2;
                                                            z4 = true;
                                                        }
                                                    }
                                                } else {
                                                    z3 = true;
                                                    z4 = false;
                                                }
                                                int i7 = storyViews.reactions_count;
                                                int i8 = storyViewsList.reactions_count;
                                                if (i7 != i8) {
                                                    storyViews.reactions_count = i8;
                                                } else {
                                                    z3 = z4;
                                                }
                                                if (z3) {
                                                    i2 = 0;
                                                    jn7.f(i3).k(jn7.y5, new Object[0]);
                                                } else {
                                                    i2 = 0;
                                                }
                                            } else {
                                                i2 = 0;
                                                storyItem2 = storyItem3;
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    y3aVar22.a = 0;
                                                }
                                                y3aVar22.m = false;
                                            }
                                            cc4.b("SelfStoryViewsPage " + storyItem2.id + " response  totalItems " + arrayList3.size() + " has next " + y3aVar22.m);
                                            for (int i9 = i2; i9 < arrayList.size(); i9++) {
                                                ((z3a) arrayList.get(i9)).c(y3aVar22);
                                            }
                                            if (arrayList3.size() < 20 && y3aVar22.m) {
                                                y3aVar22.c();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        ArrayList arrayList5 = y3aVar22.r;
                                        TL_stories.StoryItem storyItem5 = y3aVar22.b;
                                        int i10 = y3aVar22.d;
                                        ArrayList arrayList6 = y3aVar22.i;
                                        if (iArr222[0] != y3aVar22.o) {
                                            cc4.b("SelfStoryViewsPage reactions " + storyItem5.id + " localId != reqId");
                                            break;
                                        } else {
                                            y3aVar22.e = false;
                                            y3aVar22.o = -1;
                                            if (tLObject2 != null) {
                                                TL_stories.TL_storyReactionsList tL_storyReactionsList = (TL_stories.TL_storyReactionsList) tLObject2;
                                                uc7.s1(i10).j4(tL_storyReactionsList.users, false);
                                                uc7.s1(i10).c4(tL_storyReactionsList.chats, false);
                                                jf7.Y(i10).j1(tL_storyReactionsList.users, tL_storyReactionsList.chats, true, false);
                                                if (y3aVar22.l) {
                                                    y3aVar22.l = false;
                                                    for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                                                        y3aVar22.p.add(Long.valueOf(wf3.n(((TL_stories.StoryReaction) arrayList6.get(i11)).peer_id)));
                                                    }
                                                    arrayList6.clear();
                                                    y3aVar22.h.clear();
                                                }
                                                arrayList6.addAll(tL_storyReactionsList.reactions);
                                                if (tL_storyReactionsList.reactions.isEmpty()) {
                                                    y3aVar22.m = false;
                                                } else {
                                                    y3aVar22.m = true;
                                                }
                                                String str32 = tL_storyReactionsList.next_offset;
                                                y3aVar22.n = str32;
                                                if (TextUtils.isEmpty(str32)) {
                                                    y3aVar22.m = false;
                                                }
                                                if (storyItem5.views == null) {
                                                    storyItem5.views = new TL_stories.TL_storyViews();
                                                }
                                                int i12 = y3aVar22.a;
                                                int i13 = tL_storyReactionsList.count;
                                                boolean z6 = i12 != i13;
                                                y3aVar22.a = i13;
                                                if (z6) {
                                                    jn7.f(i10).k(jn7.y5, new Object[0]);
                                                }
                                            } else {
                                                if (tL_error2 != null && "MSG_ID_INVALID".equals(tL_error2.text)) {
                                                    y3aVar22.a = 0;
                                                }
                                                y3aVar22.m = false;
                                            }
                                            cc4.b("SelfStoryViewsPage reactions " + storyItem5.id + " response  totalItems " + arrayList6.size() + " has next " + y3aVar22.m);
                                            for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                                                ((z3a) arrayList5.get(i14)).c(y3aVar22);
                                            }
                                            if (arrayList6.size() < 20 && y3aVar22.m) {
                                                y3aVar22.c();
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

    public final void e(n3a n3aVar, boolean z, boolean z2) {
        n3a n3aVar2 = new n3a();
        n3aVar2.a = n3aVar.a;
        n3aVar2.b = n3aVar.b;
        n3aVar2.c = n3aVar.c;
        int i = 0;
        if (!z) {
            n3aVar2.b = false;
        }
        if (!z2) {
            n3aVar2.a = true;
        }
        n3a n3aVar3 = this.s;
        if (n3aVar3.equals(n3aVar2)) {
            return;
        }
        n3aVar3.a = n3aVar2.a;
        n3aVar3.b = n3aVar2.b;
        n3aVar3.c = n3aVar2.c;
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
            if (i >= arrayList.size()) {
                return;
            }
            ((z3a) arrayList.get(i)).c(this);
            i++;
        }
    }
}
