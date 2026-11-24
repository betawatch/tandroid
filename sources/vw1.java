// default package

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vw1 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Long h;
    public final /* synthetic */ String n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object w;

    public /* synthetic */ vw1(nz1 nz1Var, Object obj, jo6 jo6Var, boolean z, int i, int i2, boolean z2, Long l, String str, Object obj2) {
        this.r = nz1Var;
        this.b = obj;
        this.s = jo6Var;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = z2;
        this.h = l;
        this.n = str;
        this.w = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        k47 threadMessage;
        k47 threadMessage2;
        k47 threadMessage3;
        k47 threadMessage4;
        String str;
        byte b = this.a;
        Object obj = this.s;
        Object obj2 = this.r;
        switch (b) {
            case 0:
                g47 g47Var = (g47) this.w;
                int i = ChatActivityEnterView.z7;
                ((ChatActivityEnterView) obj2).Z0((TLRPC.Document) obj, this.n, g47Var, this.c, this.d, this.e, this.b, this.h, this.f);
                break;
            default:
                jo6 jo6Var = (jo6) obj;
                ChatActivityEnterView chatActivityEnterView = ((nz1) obj2).a;
                boolean z2 = chatActivityEnterView.p4;
                yv1 yv1Var = chatActivityEnterView.F3;
                boolean z3 = false;
                if (z2) {
                    if (chatActivityEnterView.H2 != 0) {
                        chatActivityEnterView.V0.y();
                    }
                    chatActivityEnterView.S1(false, true, false, true);
                }
                uz1 uz1Var = chatActivityEnterView.P3;
                TL_stories.StoryItem C0 = uz1Var != null ? uz1Var.C0() : null;
                Object obj3 = this.b;
                boolean z4 = obj3 instanceof TLRPC.Document;
                boolean z5 = this.c;
                int i2 = this.d;
                int i3 = this.e;
                Long l = this.h;
                int i4 = i2;
                String str2 = this.n;
                Object obj4 = this.w;
                if (z4) {
                    TLRPC.Document document = (TLRPC.Document) obj3;
                    rcc rccVar = jo6Var != null ? jo6Var.s : null;
                    if (rccVar != null && jo6Var != null) {
                        rccVar.s = true;
                        boolean b2 = rccVar.b();
                        rccVar.s = false;
                        rccVar.t = true;
                        z3 = b2;
                    }
                    boolean z6 = this.f;
                    if (z3) {
                        ArrayList arrayList = new ArrayList();
                        z5a z5aVar = new z5a();
                        if (jo6Var.b || (str = jo6Var.h) == null) {
                            String str3 = jo6Var.I;
                            if (str3 != null) {
                                z5aVar.c = str3;
                            }
                        } else {
                            z5aVar.c = str;
                            if (jo6Var.c()) {
                                z5aVar.y = jo6Var.clone();
                            }
                        }
                        z5aVar.e = jo6Var.c;
                        z5aVar.f = jo6Var.g;
                        z5aVar.g = jo6Var.e;
                        z5aVar.p = jo6Var.d();
                        z5aVar.o = jo6Var.b;
                        z5aVar.q = jo6Var.j();
                        z5aVar.z = jo6Var.m;
                        z5aVar.A = jo6Var.P;
                        CharSequence charSequence = jo6Var.a;
                        z5aVar.d = charSequence != null ? charSequence.toString() : null;
                        z5aVar.i = jo6Var.n;
                        z5aVar.j = jo6Var.r;
                        z5aVar.h = jo6Var.x;
                        z5aVar.k = jo6Var.s;
                        z5aVar.r = jo6Var.L;
                        z5aVar.t = a6a.h(jo6Var.a);
                        z5aVar.u = jo6Var.M;
                        z5aVar.w = jo6Var.N;
                        z5aVar.x = jo6Var.c();
                        arrayList.add(z5aVar);
                        jo6Var.e();
                        j5 a = j5.a(chatActivityEnterView.R);
                        long j = chatActivityEnterView.G3;
                        k47 k47Var = chatActivityEnterView.J3;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        a6a.W(a, arrayList, j, k47Var, threadMessage4, null, chatActivityEnterView.L3, false, false, chatActivityEnterView.P2, null, z5, i4, i3, false, null, yv1Var != null ? yv1Var.X6() : null, chatActivityEnterView.W6, z6, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z = z5;
                        i4 = i4;
                    } else {
                        a6a B = a6a.B(chatActivityEnterView.R);
                        long j2 = chatActivityEnterView.G3;
                        CharSequence charSequence2 = jo6Var != null ? jo6Var.a : null;
                        TL_stories.StoryItem storyItem = C0;
                        k47 k47Var2 = chatActivityEnterView.J3;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        B.u0(document, str2, j2, charSequence2, rccVar, k47Var2, threadMessage3, storyItem, chatActivityEnterView.L3, null, z5, i4, i3, false, obj4, yv1Var != null ? yv1Var.X6() : null, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z6);
                        z = z5;
                        i4 = i4;
                        hs6.d0(chatActivityEnterView.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (pg3.B(chatActivityEnterView.G3)) {
                            oc7.r1(chatActivityEnterView.S.a).y4(obj4, document);
                        }
                    }
                } else {
                    z = z5;
                    TL_stories.StoryItem storyItem2 = C0;
                    if (obj3 instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj3;
                        if (botInlineResult.document != null) {
                            hs6.d0(chatActivityEnterView.R).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (pg3.B(chatActivityEnterView.G3)) {
                                oc7.r1(chatActivityEnterView.S.a).y4(obj4, botInlineResult.document);
                            }
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.id);
                        hashMap.put("query_id", String.valueOf(botInlineResult.query_id));
                        hashMap.put("force_gif", "1");
                        if (storyItem2 == null) {
                            yv1 yv1Var2 = chatActivityEnterView.F3;
                            j5 j5Var = chatActivityEnterView.S;
                            long j3 = chatActivityEnterView.G3;
                            k47 k47Var3 = chatActivityEnterView.J3;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            a6a.R(i4, j3, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), j5Var, chatActivityEnterView.L3, k47Var3, threadMessage2, yv1Var != null ? yv1Var.X6() : null, hashMap, botInlineResult, null, yv1Var2, z);
                            i4 = i4;
                            z = z;
                        } else {
                            a6a B2 = a6a.B(chatActivityEnterView.R);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j4 = chatActivityEnterView.G3;
                            k47 k47Var4 = chatActivityEnterView.J3;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            B2.t0(document2, str2, j4, k47Var4, threadMessage, storyItem2, chatActivityEnterView.L3, null, z, i4, i3, false, obj4, yv1Var != null ? yv1Var.X6() : null, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.H2 != 0) {
                            chatActivityEnterView.R1(0, true);
                            chatActivityEnterView.V0.r(true);
                            chatActivityEnterView.V0.y();
                        }
                    }
                }
                uz1 uz1Var2 = chatActivityEnterView.P3;
                if (uz1Var2 != null) {
                    uz1Var2.w(null, z, i4, 0, 0L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ vw1(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, g47 g47Var, boolean z, int i, int i2, Object obj, Long l, boolean z2) {
        this.r = chatActivityEnterView;
        this.s = document;
        this.n = str;
        this.w = g47Var;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.b = obj;
        this.h = l;
        this.f = z2;
    }
}
