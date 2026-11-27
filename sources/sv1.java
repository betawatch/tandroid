// default package

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sv1 implements Runnable {
    public final /* synthetic */ byte a = 0;
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

    public /* synthetic */ sv1(qy1 qy1Var, Object obj, no6 no6Var, boolean z, int i, int i2, boolean z2, Long l, String str, Object obj2) {
        this.r = qy1Var;
        this.b = obj;
        this.s = no6Var;
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
        r47 threadMessage;
        r47 threadMessage2;
        r47 threadMessage3;
        r47 threadMessage4;
        String str;
        byte b = this.a;
        Object obj = this.s;
        Object obj2 = this.r;
        switch (b) {
            case 0:
                n47 n47Var = (n47) this.w;
                int i = ChatActivityEnterView.X7;
                ((ChatActivityEnterView) obj2).b1((TLRPC.Document) obj, this.n, n47Var, this.c, this.d, this.e, this.b, this.h, this.f);
                break;
            default:
                no6 no6Var = (no6) obj;
                ChatActivityEnterView chatActivityEnterView = ((qy1) obj2).a;
                boolean z2 = chatActivityEnterView.o4;
                zu1 zu1Var = chatActivityEnterView.E3;
                boolean z3 = false;
                if (z2) {
                    if (chatActivityEnterView.G2 != 0) {
                        chatActivityEnterView.V0.z();
                    }
                    chatActivityEnterView.a2(false, true, false, true);
                }
                xy1 xy1Var = chatActivityEnterView.O3;
                TL_stories.StoryItem F0 = xy1Var != null ? xy1Var.F0() : null;
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
                    oec oecVar = no6Var != null ? no6Var.s : null;
                    if (oecVar != null && no6Var != null) {
                        oecVar.s = true;
                        boolean b2 = oecVar.b();
                        oecVar.s = false;
                        oecVar.t = true;
                        z3 = b2;
                    }
                    boolean z6 = this.f;
                    if (z3) {
                        ArrayList arrayList = new ArrayList();
                        q7a q7aVar = new q7a();
                        if (no6Var.b || (str = no6Var.h) == null) {
                            String str3 = no6Var.I;
                            if (str3 != null) {
                                q7aVar.c = str3;
                            }
                        } else {
                            q7aVar.c = str;
                            if (no6Var.c()) {
                                q7aVar.y = no6Var.clone();
                            }
                        }
                        q7aVar.e = no6Var.c;
                        q7aVar.f = no6Var.g;
                        q7aVar.g = no6Var.e;
                        q7aVar.p = no6Var.d();
                        q7aVar.o = no6Var.b;
                        q7aVar.q = no6Var.j();
                        q7aVar.z = no6Var.m;
                        q7aVar.A = no6Var.P;
                        CharSequence charSequence = no6Var.a;
                        q7aVar.d = charSequence != null ? charSequence.toString() : null;
                        q7aVar.i = no6Var.n;
                        q7aVar.j = no6Var.r;
                        q7aVar.h = no6Var.x;
                        q7aVar.k = no6Var.s;
                        q7aVar.r = no6Var.L;
                        q7aVar.t = r7a.h(no6Var.a);
                        q7aVar.u = no6Var.M;
                        q7aVar.w = no6Var.N;
                        q7aVar.x = no6Var.c();
                        arrayList.add(q7aVar);
                        no6Var.e();
                        k5 a = k5.a(chatActivityEnterView.R);
                        long j = chatActivityEnterView.F3;
                        r47 r47Var = chatActivityEnterView.I3;
                        threadMessage4 = chatActivityEnterView.getThreadMessage();
                        r7a.W(a, arrayList, j, r47Var, threadMessage4, null, chatActivityEnterView.K3, false, false, chatActivityEnterView.O2, null, z5, i4, i3, false, null, zu1Var != null ? zu1Var.X6() : null, chatActivityEnterView.o7, z6, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), null, false);
                        z = z5;
                        i4 = i4;
                    } else {
                        r7a B = r7a.B(chatActivityEnterView.R);
                        long j2 = chatActivityEnterView.F3;
                        CharSequence charSequence2 = no6Var != null ? no6Var.a : null;
                        TL_stories.StoryItem storyItem = F0;
                        r47 r47Var2 = chatActivityEnterView.I3;
                        threadMessage3 = chatActivityEnterView.getThreadMessage();
                        B.u0(document, str2, j2, charSequence2, oecVar, r47Var2, threadMessage3, storyItem, chatActivityEnterView.K3, null, z5, i4, i3, false, obj4, zu1Var != null ? zu1Var.X6() : null, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams(), z6);
                        z = z5;
                        i4 = i4;
                        ls6.d0(chatActivityEnterView.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
                        if (wf3.B(chatActivityEnterView.F3)) {
                            uc7.s1(chatActivityEnterView.S.a).E4(obj4, document);
                        }
                    }
                } else {
                    z = z5;
                    TL_stories.StoryItem storyItem2 = F0;
                    if (obj3 instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj3;
                        if (botInlineResult.document != null) {
                            ls6.d0(chatActivityEnterView.R).c(botInlineResult.document, (int) (System.currentTimeMillis() / 1000), false);
                            if (wf3.B(chatActivityEnterView.F3)) {
                                uc7.s1(chatActivityEnterView.S.a).E4(obj4, botInlineResult.document);
                            }
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", botInlineResult.id);
                        hashMap.put("query_id", String.valueOf(botInlineResult.query_id));
                        hashMap.put("force_gif", "1");
                        if (storyItem2 == null) {
                            zu1 zu1Var2 = chatActivityEnterView.E3;
                            k5 k5Var = chatActivityEnterView.S;
                            long j3 = chatActivityEnterView.F3;
                            r47 r47Var3 = chatActivityEnterView.I3;
                            threadMessage2 = chatActivityEnterView.getThreadMessage();
                            r7a.R(i4, j3, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), k5Var, chatActivityEnterView.K3, r47Var3, threadMessage2, zu1Var != null ? zu1Var.X6() : null, hashMap, botInlineResult, null, zu1Var2, z);
                            i4 = i4;
                            z = z;
                        } else {
                            r7a B2 = r7a.B(chatActivityEnterView.R);
                            TLRPC.Document document2 = botInlineResult.document;
                            long j4 = chatActivityEnterView.F3;
                            r47 r47Var4 = chatActivityEnterView.I3;
                            threadMessage = chatActivityEnterView.getThreadMessage();
                            B2.t0(document2, str2, j4, r47Var4, threadMessage, storyItem2, chatActivityEnterView.K3, null, z, i4, i3, false, obj4, zu1Var != null ? zu1Var.X6() : null, l.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                        }
                        if (chatActivityEnterView.G2 != 0) {
                            chatActivityEnterView.Z1(0, true);
                            chatActivityEnterView.V0.r(true);
                            chatActivityEnterView.V0.z();
                        }
                    }
                }
                xy1 xy1Var2 = chatActivityEnterView.O3;
                if (xy1Var2 != null) {
                    xy1Var2.x(null, z, i4, 0, 0L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ sv1(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, n47 n47Var, boolean z, int i, int i2, Object obj, Long l, boolean z2) {
        this.r = chatActivityEnterView;
        this.s = document;
        this.n = str;
        this.w = n47Var;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.b = obj;
        this.h = l;
        this.f = z2;
    }
}
